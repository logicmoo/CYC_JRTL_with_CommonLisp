;;; jvm.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
;;; $Id: jvm.lisp,v 1.430 2005-04-20 14:45:13 piso Exp $
;;;
;;; This program is free software; you can redistribute it and/or
;;; modify it under the terms of the GNU General Public License
;;; as published by the Free Software Foundation; either version 2
;;; of the License, or (at your option) any later version.
;;;
;;; This program is distributed in the hope that it will be useful,
;;; but WITHOUT ANY WARRANTY; without even the implied warranty of
;;; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;;; GNU General Public License for more details.
;;;
;;; You should have received a copy of the GNU General Public License
;;; along with this program; if not, write to the Free Software
;;; Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

(in-package "EXT")

(export 'defsubst)

(in-package "JVM")

(export '(compile-defun *catch-errors* jvm-compile jvm-compile-package))

(eval-when (:compile-toplevel :load-toplevel :execute)
  (require '#:format)
  (require '#:clos)
  (require '#:print-object)
  (require '#:source-transform)
  (require '#:opcodes))

(shadow '(method variable))

(defparameter *trust-user-type-declarations* t)

(defconstant +arg-count-max+ 6)

(defvar *closure-variables* nil)

(defvar *enable-dformat* nil)

#+nil
(defun dformat (destination control-string &rest args)
  (when *enable-dformat*
    (apply #'sys::%format destination control-string args)))

(defmacro dformat (&rest ignored)
  )

(defun inline-expansion (name)
  (sys:get-function-info-value name :inline-expansion))

(defun (setf inline-expansion) (expansion name)
  (sys:set-function-info-value name :inline-expansion expansion))

;; Just an experiment...
(defmacro defsubst (name lambda-list &rest body)
  (let ((block-name (sys:block-name name)))
    `(progn
       (sys::%defun ',name ',lambda-list '(BLOCK ,block-name ,@body))
       (precompile ',name)
       (eval-when (:compile-toplevel :load-toplevel :execute)
         (setf (inline-expansion ',name)
               (precompile-form (list* 'LAMBDA ',lambda-list ',body) t)))
       ',name)))

#+nil
(defmacro defsubst (&rest args)
  `(defun ,@args))

(defvar *compiler-debug* nil)

(defvar *pool* nil)
(defvar *pool-count* 1)
(defvar *pool-entries* nil)
(defvar *fields* ())
(defvar *static-code* ())

(defvar *declared-symbols* nil)
(defvar *declared-functions* nil)
(defvar *declared-strings* nil)
(defvar *declared-fixnums* nil)

(defstruct (class-file (:constructor %make-class-file))
  pathname ; pathname of output file
  lambda-name
  class
  superclass
  lambda-list ; as advertised
  pool
  (pool-count 1)
  (pool-entries (make-hash-table :test #'equal))
  fields
  methods
  static-code
  (symbols (make-hash-table :test 'eq))
  (functions (make-hash-table :test 'equal))
  (strings (make-hash-table :test 'eq))
  (fixnums (make-hash-table :test 'eql))
  )

(defun class-name-from-filespec (filespec)
  (let* ((name (pathname-name filespec)))
    (dotimes (i (length name))
      (when (eql (char name i) #\-)
        (setf (char name i) #\_)))
    (concatenate 'string "org/armedbear/lisp/" name)))

(defun make-class-file (&key pathname lambda-name lambda-list)
  (aver (not (null pathname)))
  (let ((class-file (%make-class-file :pathname pathname
                                      :lambda-name lambda-name
                                      :lambda-list lambda-list)))
    (setf (class-file-class class-file) (class-name-from-filespec pathname))
    class-file))

(defmacro with-class-file (class-file &body body)
  (let ((var (gensym)))
    `(let* ((,var ,class-file)
            (*pool*               (class-file-pool ,var))
            (*pool-count*         (class-file-pool-count ,var))
            (*pool-entries*       (class-file-pool-entries ,var))
            (*fields*             (class-file-fields ,var))
            (*static-code*        (class-file-static-code ,var))
            (*declared-symbols*   (class-file-symbols ,var))
            (*declared-functions* (class-file-functions ,var))
            (*declared-strings*   (class-file-strings ,var))
            (*declared-fixnums*   (class-file-fixnums ,var)))
       (progn ,@body)
       (setf (class-file-pool ,var)         *pool*
             (class-file-pool-count ,var)   *pool-count*
             (class-file-pool-entries ,var) *pool-entries*
             (class-file-fields ,var)       *fields*
             (class-file-static-code ,var)  *static-code*
             (class-file-symbols ,var)      *declared-symbols*
             (class-file-functions ,var)    *declared-functions*
             (class-file-strings ,var)      *declared-strings*
             (class-file-fixnums ,var)      *declared-fixnums*
             ))))

(defstruct compiland
  name
  (kind :external) ; :INTERNAL or :EXTERNAL
  lambda-expression
  arg-vars
  arity ; NIL if the number of args can vary.
  p1-result
  parent
  (children 0) ; Number of local functions defined with FLET or LABELS.
  argument-register
  closure-register
  class-file ; class-file object
  (single-valued-p t))

(defmethod print-object ((compiland compiland) stream)
  (sys::%format stream "#<~S ~S>" 'compiland (compiland-name compiland)))

(defvar *current-compiland* nil)

(defvar *this-class* nil)

(defvar *code* ())

;; All tags visible at the current point of compilation, some of which may not
;; be in the current compiland.
(defvar *visible-tags* ())

;; Next available register.
(defvar *register* 0)

;; Total number of registers allocated.
(defvar *registers-allocated* 0)

(defvar *handlers* ())

(defstruct handler
  from
  to
  code
  catch-type)

;; Variables visible at the current point of compilation.
(defvar *visible-variables* ())

;; All variables seen so far.
(defvar *all-variables* ())

;; Undefined variables that we've already warned about.
(defvar *undefined-variables* ())

(defvar *dump-variables* nil)

(defun dump-1-variable (variable)
  (sys::%format t "  ~S special-p = ~S register = ~S index = ~S declared-type = ~S~%"
           (variable-name variable)
           (variable-special-p variable)
           (variable-register variable)
           (variable-index variable)
           (variable-declared-type variable)))

(defun dump-variables (list caption &optional (force nil))
  (when (or force *dump-variables*)
    (write-string caption)
    (if list
        (dolist (variable list)
          (dump-1-variable variable))
        (sys::%format t "  None.~%"))))

(defstruct variable
  name
  initform
  temp-register
  special-p
  (declared-type t)
  representation ; NIL (i.e. a LispObject reference) or :UNBOXED-FIXNUM
  register ; register number or NIL
  index
  closure-index
  (reads 0)
  (writes 0)
  used-non-locally-p
  (compiland *current-compiland*))

;; obj can be a symbol or variable
;; returns variable or nil
(defun unboxed-fixnum-variable (obj)
  (cond ((symbolp obj)
         (let ((variable (find-visible-variable obj)))
           (if (and variable
                    (eq (variable-representation variable) :unboxed-fixnum))
               variable
               nil)))
        ((variable-p obj)
         (if (eq (variable-representation obj) :unboxed-fixnum)
             obj
             nil))
        (t
         nil)))

(defun arg-is-fixnum-p (arg)
  (or (fixnump arg)
      (unboxed-fixnum-variable arg)
;;       (and (consp arg)
;;            (eq (car arg) 'THE)
;;            (subtypep (cadr arg) 'FIXNUM))
      ))

;; True for local functions defined with FLET or LABELS.
(defvar *child-p* nil)

(defvar *child-count* 0)

(defun find-visible-variable (name)
  (dolist (variable *visible-variables*)
    (when (eq name (variable-name variable))
      (return variable))))

(defun unboxed-fixnum-variable-p (obj)
;;   (let ((variable (and (symbolp obj)
;;                        (find-visible-variable obj))))
;;     (and variable
;;          (eq (variable-representation variable) :unboxed-fixnum))))
  (unboxed-fixnum-variable obj))

(defun allocate-register ()
  (let* ((register *register*)
         (next-register (1+ register)))
    (declare (type fixnum register next-register))
    (setf *register* next-register)
    (when (< *registers-allocated* next-register)
      (setf *registers-allocated* next-register))
    register))

(defstruct local-function
  name
  compiland
  function
  class-file
  variable)

(defvar *local-functions* ())

(defun find-local-function (name)
  (find name *local-functions* :key #'local-function-name))

(defvar *using-arg-array* nil)
(defvar *hairy-arglist-p* nil)

(defstruct node
  ;; Block name or (TAGBODY) or (LET) or (MULTIPLE-VALUE-BIND).
  name
  form
  (compiland *current-compiland*))

;; Used to wrap TAGBODYs, UNWIND-PROTECTs and LET/LET*/M-V-B forms as well as
;; BLOCKs per se.
(defstruct (block-node (:conc-name block-) (:include node))
  (exit (gensym))
  target
  catch-tag
  ;; True if there is any RETURN from this block.
  return-p
  ;; True if there is a non-local RETURN from this block.
  non-local-return-p
  ;; True if a tag in this tagbody is the target of a non-local GO.
  non-local-go-p
  ;; If non-nil, register containing saved dynamic environment for this block.
  environment-register
  ;; Only used in LET/LET*/M-V-B nodes.
  vars
  free-specials
  )

(defun node-constant-p (object)
  (cond ((block-node-p object)
         nil)
        ((constantp object)
         t)
        (t
         nil)))

(defvar *blocks* ())

(defun find-block (name)
  (dolist (block *blocks*)
    (when (eq name (block-name block))
      (return block))))

(defstruct tag
  name
  label
  block
  (compiland *current-compiland*))

;;; Pass 1.

;; Returns a list of declared free specials, if any are found.
(defun process-declarations-for-vars (body vars)
  (let ((free-specials '()))
    (dolist (subform body)
      (unless (and (consp subform) (eq (car subform) 'DECLARE))
        (return))
      (let ((decls (cdr subform)))
        (dolist (decl decls)
          (case (car decl)
            ((DYNAMIC-EXTENT FTYPE IGNORE IGNORABLE INLINE NOTINLINE OPTIMIZE)
             ;; Nothing to do here.
             )
            (SPECIAL
             (dolist (sym (cdr decl))
               (let ((variable (find sym vars :key #'variable-name)))
                 (cond (variable
                        (setf (variable-special-p variable) t))
                       (t
                        (dformat t "adding free special ~S~%" sym)
                        (push (make-variable :name sym :special-p t) free-specials))))))
            (TYPE
             (dolist (sym (cddr decl))
               (dolist (variable vars)
                 (when (eq sym (variable-name variable))
                   (setf (variable-declared-type variable) (cadr decl))))))
            (t
             (dolist (sym (cdr decl))
               (dolist (variable vars)
                 (when (eq sym (variable-name variable))
                   (setf (variable-declared-type variable) (car decl))))))))))
    free-specials))

(defun p1-let-vars (varlist)
  (let ((vars ()))
    (dolist (varspec varlist)
      (cond ((consp varspec)
             (let ((name (car varspec))
                   (initform (p1 (cadr varspec))))
               (push (make-variable :name name :initform initform) vars)))
            (t
             (push (make-variable :name varspec) vars))))
    (setf vars (nreverse vars))
    (dolist (variable vars)
      (push variable *visible-variables*)
      (push variable *all-variables*))
    vars))

(defun p1-let*-vars (varlist)
  (let ((vars ()))
    (dolist (varspec varlist)
      (cond ((consp varspec)
             (let* ((name (car varspec))
                    (initform (p1 (cadr varspec)))
                    (var (make-variable :name name :initform initform)))
               (push var vars)
               (push var *visible-variables*)
               (push var *all-variables*)))
            (t
             (let ((var (make-variable :name varspec)))
               (push var vars)
               (push var *visible-variables*)
               (push var *all-variables*)))))
    (nreverse vars)))

(defun p1-let/let* (form)
  (let* ((*visible-variables* *visible-variables*)
         (block (make-block-node :name '(LET)))
         (*blocks* (cons block *blocks*))
         (op (car form))
         (varlist (cadr form))
         (body (cddr form)))
    (aver (or (eq op 'LET) (eq op 'LET*)))
    (when (eq op 'LET)
      ;; Convert to LET* if possible.
      (dolist (varspec varlist (setf op 'LET*))
        (or (atom varspec)
            (constantp (cadr varspec))
            (eq (car varspec) (cadr varspec))
            (return nil))))
    (let ((vars (if (eq op 'LET) (p1-let-vars varlist) (p1-let*-vars varlist))))
      (dformat t "p1-let/let* vars = ~S~%" (mapcar #'variable-name vars))
      ;; Check for globally declared specials.
      (dolist (variable vars)
        (when (special-variable-p (variable-name variable))
          (setf (variable-special-p variable) t)))
      (setf (block-free-specials block) (process-declarations-for-vars body vars))
      (setf (block-vars block) vars))
    (setf body (p1-body body))
    (setf (block-form block) (list* op varlist body))
    block))

(defun p1-m-v-b (form)
;;   (dformat t "p1-multiple-value-bind~%")
  (when (= (length (cadr form)) 1)
    (let ((new-form `(let ((,(caadr form) ,(caddr form))) ,@(cdddr form))))
      (dformat t "old form = ~S~%" form)
      (dformat t "new-form = ~S~%" new-form)
      (return-from p1-m-v-b (p1-let/let* new-form))))
  (let* ((*visible-variables* *visible-variables*)
         (block (make-block-node :name '(MULTIPLE-VALUE-BIND)))
         (*blocks* (cons block *blocks*))
         (varlist (cadr form))
         (values-form (caddr form))
         (body (cdddr form)))
    ;; Process the values-form first. ("The scopes of the name binding and
    ;; declarations do not include the values-form.")
    (setf values-form (p1 values-form))
    (let ((vars ()))
      (dolist (symbol varlist)
        (let ((var (make-variable :name symbol)))
          (push var vars)
          (push var *visible-variables*)
          (push var *all-variables*)))
      ;; Check for globally declared specials.
      (dolist (variable vars)
        (when (special-variable-p (variable-name variable))
          (setf (variable-special-p variable) t)))
      (setf (block-free-specials block) (process-declarations-for-vars body vars))
      (setf (block-vars block) (nreverse vars)))
    (setf body (p1-body body))
    (setf (block-form block) (list* 'MULTIPLE-VALUE-BIND varlist values-form body))
    block))

(defun p1-block (form)
  (let* ((block (make-block-node :name (cadr form)))
         (*blocks* (cons block *blocks*)))
    (setf (cddr form) (p1-body (cddr form)))
    (setf (block-form block) form)
    block))

(defun p1-unwind-protect (form)
  (let* ((block (make-block-node :name '(UNWIND-PROTECT)))
         (*blocks* (cons block *blocks*)))
    (setf (block-form block) (p1-default form))
    block))

(defun p1-return-from (form)
  (let* ((name (second form))
         (block (find-block name)))
    (when (null block)
      (compiler-error "RETURN-FROM ~S: no block named ~S is currently visible."
                      name name))
    (dformat t "p1-return-from block = ~S~%" (block-name block))
    (setf (block-return-p block) t)
    (cond ((eq (block-compiland block) *current-compiland*)
           ;; Local case. If the RETURN is nested inside an UNWIND-PROTECT
           ;; which is inside the block we're returning from, we'll do a non-
           ;; local return anyway so that UNWIND-PROTECT can catch it and run
           ;; its cleanup forms.
           (dformat t "*blocks* = ~S~%" (mapcar #'block-name *blocks*))
           (let ((protected
                  (dolist (enclosing-block *blocks*)
                    (when (eq enclosing-block block)
                      (return nil))
                    (when (equal (block-name enclosing-block) '(UNWIND-PROTECT))
                      (return t)))))
             (dformat t "p1-return-from protected = ~S~%" protected)
             (when protected
               (setf (block-non-local-return-p block) t))))
          (t
           (setf (block-non-local-return-p block) t)))
    (when (block-non-local-return-p block)
      (dformat t "non-local return from block ~S~%" (block-name block))))
  (list* 'RETURN-FROM (cadr form) (mapcar #'p1 (cddr form))))

(defun p1-tagbody (form)
  (let* ((block (make-block-node :name '(TAGBODY)))
         (*blocks* (cons block *blocks*))
         (*visible-tags* *visible-tags*)
         (body (cdr form)))
    ;; Make all the tags visible before processing the body forms.
    (dolist (subform body)
      (when (or (symbolp subform) (integerp subform))
        (let* ((tag (make-tag :name subform :label (gensym) :block block)))
          (push tag *visible-tags*))))
    (let ((new-body '()))
      (dolist (subform body)
        (push (if (or (symbolp subform) (integerp subform))
                  subform
                  (p1 subform))
              new-body))
      (setf (block-form block) (list* 'TAGBODY (nreverse new-body))))
    block))

(defun p1-go (form)
  (let* ((name (cadr form))
         (tag (find-tag name)))
    (unless tag
      (error "p1-go: tag not found: ~S" name))
    (let ((tag-block (tag-block tag)))
      (cond ((eq (tag-compiland tag) *current-compiland*)
             ;; Does the GO leave an enclosing UNWIND-PROTECT?
             (let ((protected
                    (dolist (enclosing-block *blocks*)
                      (when (eq enclosing-block tag-block)
                        (return nil))
                      (when (equal (block-name enclosing-block) '(UNWIND-PROTECT))
                        (return t)))))
               (when protected
                 (setf (block-non-local-go-p tag-block) t))))
            (t
             (setf (block-non-local-go-p tag-block) t)))))
  form)

(defun p1-flet (form)
  (incf (compiland-children *current-compiland*) (length (cadr form)))
  (let ((*current-compiland* *current-compiland*)
        (compilands '()))
    (dolist (definition (cadr form))
      (let ((name (car definition)))
        ;; FIXME
        (when (and (consp name) (eq (car name) 'SETF))
          (compiler-unsupported "P1-FLET: can't handle ~S." name))
        (let* ((lambda-list (cadr definition))
               (body (cddr definition))
               (compiland (make-compiland :name name
                                          :parent *current-compiland*)))
          (multiple-value-bind (body decls)
            (sys::parse-body body)
            (setf (compiland-lambda-expression compiland)
                  `(lambda ,lambda-list ,@decls (block ,name ,@body)))
            (let ((*visible-variables* *visible-variables*)
                  (*current-compiland* compiland))
              (p1-compiland compiland)))
          (push compiland compilands))))
  (list* (car form) (nreverse compilands) (mapcar #'p1 (cddr form)))))

(defun p1-labels (form)
  (incf (compiland-children *current-compiland*) (length (cadr form)))
  (let ((*visible-variables* *visible-variables*)
        (*local-functions* *local-functions*)
        (*current-compiland* *current-compiland*)
        (local-functions ()))
    (dolist (definition (cadr form))
      (let ((name (car definition)))
        ;; FIXME
        (when (and (consp name) (eq (car name) 'SETF))
          (compiler-unsupported "P1-LABELS: can't handle ~S." name))
        (let* ((lambda-list (cadr definition))
               (body (cddr definition))
               (compiland (make-compiland :name name
                                          :parent *current-compiland*))
               (variable (make-variable :name (copy-symbol name)))
               (local-function (make-local-function :name name
                                                    :compiland compiland
                                                    :variable variable)))
          (multiple-value-bind (body decls)
            (sys::parse-body body)
            (setf (compiland-lambda-expression compiland)
                  `(lambda ,lambda-list ,@decls (block ,name ,@body))))
          (push variable *all-variables*)
          (push local-function local-functions))))
    (setf local-functions (nreverse local-functions))
    ;; Make the local functions visible.
    (dolist (local-function local-functions)
      (push local-function *local-functions*)
      (push (local-function-variable local-function) *visible-variables*))
    (dolist (local-function local-functions)
      (let ((*visible-variables* *visible-variables*)
            (*current-compiland* (local-function-compiland local-function)))
        (p1-compiland (local-function-compiland local-function))))
    (list* (car form) local-functions (mapcar #'p1 (cddr form)))))

(defun p1-function (form)
  (let (local-function)
    (cond ((and (consp (cadr form)) (eq (caadr form) 'LAMBDA))
           (when *current-compiland*
             (incf (compiland-children *current-compiland*)))
           (let* ((*current-compiland* *current-compiland*)
                  (lambda-form (cadr form))
                  (lambda-list (cadr lambda-form))
                  (body (cddr lambda-form))
                  (compiland (make-compiland :name (gensym "ANONYMOUS-LAMBDA-")
                                             :lambda-expression lambda-form
                                             :parent *current-compiland*)))
             (multiple-value-bind (body decls)
               (sys::parse-body body)
               (setf (compiland-lambda-expression compiland)
                     `(lambda ,lambda-list ,@decls (block nil ,@body)))
               (let ((*visible-variables* *visible-variables*)
                     (*current-compiland* compiland))
                 (p1-compiland compiland)))
             (list 'FUNCTION compiland)))
          ((setf local-function (find-local-function (cadr form)))
           (dformat t "p1-function local function ~S~%" (cadr form))
           (let ((variable (local-function-variable local-function)))
             (when variable
               (unless (or (eq (variable-compiland variable) *current-compiland*)
                           (eq (local-function-compiland local-function) *current-compiland*))
                 (dformat t "p1-function ~S used non-locally~%" (variable-name variable))
                 (setf (variable-used-non-locally-p variable) t))))
           form)
          (t
           form))))

(defun p1-lambda (form)
  (let* ((lambda-list (cadr form))
         (body (cddr form))
         (auxvars (memq '&AUX lambda-list)))
    (when auxvars
      (setf lambda-list (subseq lambda-list 0 (position '&AUX lambda-list)))
      (setf body (list (append (list 'LET* (cdr auxvars)) body))))
    (p1-function (list 'FUNCTION (list* 'LAMBDA lambda-list body)))))

(defun p1-eval-when (form)
  (list* (car form) (cadr form) (mapcar #'p1 (cddr form))))

(defun p1-quote (form)
  (if (numberp (second form))
      (second form)
      form))

(defun p1-setq (form)
  (unless (= (length form) 3)
    (error "Too many arguments for SETQ."))
  (let ((arg1 (second form))
        (arg2 (third form)))
    (let ((variable (find-visible-variable arg1)))
      (if variable
          (progn
            (incf (variable-writes variable))
            (cond ((eq (variable-compiland variable) *current-compiland*)
                   (dformat t "p1-setq: write ~S~%" arg1))
                  (t
                   (dformat t "p1-setq: non-local write ~S~%" arg1)
                   (setf (variable-used-non-locally-p variable) t))))
          (dformat t "p1-setq: unknown variable ~S~%" arg1)))
    (list 'SETQ arg1 (p1 arg2))))

(defun p1-the (form)
  (dformat t "p1-the form = ~S~%" form)
  (let ((type (second form))
        (expr (third form)))
    (cond ((and (listp type) (eq (car type) 'VALUES))
           ;; FIXME
           (p1 expr))
          ((= *safety* 3)
           (dformat t "p1-the expr = ~S~%" expr)
           (let* ((sym (gensym))
                  (new-expr
                   `(let ((,sym ,expr))
                      (sys::require-type ,sym ',type)
                      ,sym)))
             (dformat t "p1-the new-expr = ~S~%" new-expr)
             (p1 new-expr)))
          (t
           (dformat t "p1-the t case expr = ~S~%" expr)
           (if (subtypep type 'FIXNUM)
               (list 'THE type (p1 expr))
               (p1 expr))))))

(defun p1-body (body)
  (declare (optimize speed))
  (let ((tail body))
    (loop
      (when (null tail)
        (return))
      (setf (car tail) (p1 (car tail)))
      (setf tail (cdr tail))))
  body)

(defun p1-default (form)
  (setf (cdr form) (p1-body (cdr form)))
  form)

(defun p1-throw (form)
  (let ((new-form (rewrite-throw form)))
    (when (neq new-form form)
      (return-from p1-throw (p1 new-form))))
  (list* 'THROW (mapcar #'p1 (cdr form))))

(defun expand-inline (form expansion)
  (let ((args (cdr form))
        (vars (cadr expansion))
        (varlist ())
        new-form)
    (do ((vars vars (cdr vars))
         (args args (cdr args)))
        ((null vars))
      (push (list (car vars) (car args)) varlist))
    (setf varlist (nreverse varlist))
    (setf new-form (list* 'LET varlist (cddr expansion)))
    new-form))

(defun p1-function-call (form)
  (let ((op (car form)))
    (let ((new-form (rewrite-function-call form)))
      (when (neq new-form form)
        (dformat t "old form = ~S~%" form)
        (dformat t "new form = ~S~%" new-form)
        (return-from p1-function-call (p1 new-form))))
    (let ((source-transform (sys::source-transform op)))
      (when source-transform
        (let ((new-form (sys::expand-source-transform form)))
          (when (neq new-form form)
            (return-from p1-function-call (p1 new-form))))))
    (let ((expansion (inline-expansion op)))
      (when expansion
        (return-from p1-function-call (p1 (expand-inline form expansion)))))
    (let ((local-function (find-local-function op)))
      (cond (local-function
             (dformat t "p1 local function ~S~%" op)

             ;; FIXME
             (dformat t "local function assumed not single-valued~%")
             (setf (compiland-single-valued-p *current-compiland*) nil)

             (unless (eq (local-function-compiland local-function)
                         *current-compiland*)
               (let ((variable (local-function-variable local-function)))
                 (when variable
                   (unless (eq (variable-compiland variable) *current-compiland*)
                     (dformat t "p1 ~S used non-locally~%" (variable-name variable))
                     (setf (variable-used-non-locally-p variable) t))))))
            (t
             ;; Not a local function call.
             (unless (single-valued-p op)
               (sys::%format t "not single-valued op = ~S~%" op)
               (setf (compiland-single-valued-p *current-compiland*) nil)))))
    (p1-default form)))

(defun p1 (form)
  (cond ((symbolp form)
         (cond ((constantp form) ; a DEFCONSTANT
                (let ((value (symbol-value form)))
                  (if (numberp value)
                      value
                      form)))
               ((keywordp form)
                form)
               (t
                (let ((variable (find-visible-variable form)))
                  (if variable
                      (progn
                        (incf (variable-reads variable))
                        (cond
                         ((eq (variable-compiland variable) *current-compiland*)
                          (dformat t "p1: read ~S~%" form))
                         (t
                          (dformat t "p1: non-local read ~S variable-compiland = ~S current compiland = ~S~%"
                                   form
                                   (compiland-name (variable-compiland variable))
                                   (compiland-name *current-compiland*))
                          (setf (variable-used-non-locally-p variable) t))))
                      (dformat t "p1: unknown variable ~S~%" form)))
                form)))
        ((atom form)
         form)
        (t
         (let ((op (car form))
               handler)
           (cond ((symbolp op)
                  (cond ((setf handler (get op 'p1-handler))
                         (funcall handler form))
                        ((macro-function op sys:*compile-file-environment*)
                         (p1 (macroexpand form sys:*compile-file-environment*)))
                        ((special-operator-p op)
                         (compiler-unsupported "P1: unsupported special operator ~S" op))
                        (t
                         (p1-function-call form))))
                 ((and (consp op) (eq (car op) 'LAMBDA))
                  (p1 (list* 'FUNCALL form)))
                 (t
                  form))))))

(defun install-p1-handler (symbol handler)
  (setf (get symbol 'p1-handler) handler))

(defun initilize-p1-handlers ()
  (dolist (pair '((BLOCK                p1-block)
                  (CATCH                p1-default)
                  (DECLARE              identity)
                  (EVAL-WHEN            p1-eval-when)
                  (FLET                 p1-flet)
                  (FUNCTION             p1-function)
                  (GO                   p1-go)
                  (IF                   p1-default)
                  (LABELS               p1-labels)
                  (LAMBDA               p1-lambda)
                  (LET                  p1-let/let*)
                  (LET*                 p1-let/let*)
                  (LOAD-TIME-VALUE      identity)
                  (LOCALLY              p1-default)
                  (MULTIPLE-VALUE-BIND  p1-m-v-b)
                  (MULTIPLE-VALUE-CALL  p1-default)
                  (MULTIPLE-VALUE-LIST  p1-default)
                  (MULTIPLE-VALUE-PROG1 p1-default)
                  (PROGN                p1-default)
                  (PROGV                identity)
                  (QUOTE                p1-quote)
                  (RETURN-FROM          p1-return-from)
                  (SETQ                 p1-setq)
                  (SYMBOL-MACROLET      identity)
                  (TAGBODY              p1-tagbody)
                  (THE                  p1-the)
                  (THROW                p1-throw)
                  (UNWIND-PROTECT       p1-unwind-protect)))
    (install-p1-handler (car pair) (cadr pair))))

(initilize-p1-handlers)

(defun dump-pool ()
  (let ((pool (reverse *pool*))
        entry type)
    (dotimes (index (1- *pool-count*))
      (setq entry (car pool))
      (setq type (case (car entry)
                   (7 'class)
                   (9 'field)
                   (10 'method)
                   (11 'interface)
                   (8 'string)
                   (3 'integer)
                   (4 'float)
                   (5 'long)
                   (6 'double)
                   (12 'name-and-type)
                   (1 'utf8)))
      (sys::%format t "~D: ~A ~S~%" (1+ index) type entry)
      (setq pool (cdr pool))))
  t)

(defun pool-get (entry)
  (declare (optimize speed))
  (let ((index (gethash entry *pool-entries*)))
    (unless index
      (setf index *pool-count*)
      (push entry *pool*)
      (setf (gethash entry *pool-entries*) index)
      (setf *pool-count* (1+ index)))
    index))

(defun pool-name (name)
  (declare (optimize speed))
  (pool-get (list 1 (length name) name)))

(defun pool-name-and-type (name type)
  (declare (optimize speed))
  (pool-get (list 12
                  (pool-name name)
                  (pool-name type))))

;; Assumes CLASS-NAME is already in the correct form ("org/armedbear/lisp/Lisp"
;; as opposed to "org.armedbear.lisp.Lisp").
(defun pool-class (class-name)
  (declare (optimize speed))
  (pool-get (list 7 (pool-name class-name))))

;; (tag class-index name-and-type-index)
(defun pool-field (class-name field-name type-name)
  (declare (optimize speed))
  (pool-get (list 9
                  (pool-class class-name)
                  (pool-name-and-type field-name type-name))))

;; (tag class-index name-and-type-index)
(defun pool-method (class-name method-name type-name)
  (declare (optimize speed))
  (pool-get (list 10
                  (pool-class class-name)
                  (pool-name-and-type method-name type-name))))

(defun pool-string (string)
  (declare (optimize speed))
  (pool-get (list 8 (pool-name string))))

(defun pool-int (n)
  (declare (optimize speed))
  (pool-get (list 3 n)))

(defun u2 (n)
  (declare (optimize speed))
  (declare (type fixnum n))
  (list (logand (ash n -8) #xff)
        (logand n #xff)))

(locally (declare (optimize speed))
  (defstruct (instruction
              (:constructor make-instruction (opcode args)))
    opcode
    args
    stack
    depth))

(defun print-instruction (instruction)
  (sys::%format nil "~A ~A stack = ~S depth = ~S"
          (opcode-name (instruction-opcode instruction))
          (instruction-args instruction)
          (instruction-stack instruction)
          (instruction-depth instruction)))

(defun inst (instr &optional args)
  (declare (optimize speed))
  (let ((opcode (if (numberp instr)
                    instr
                    (opcode-number instr))))
    (unless (listp args)
      (setf args (list args)))
    (make-instruction opcode args)))

(defun emit (instr &rest args)
  (declare (optimize speed))
  (let ((instruction (inst instr args)))
    (push instruction *code*)
    instruction))

(defun label (symbol)
  (declare (optimize speed))
  (emit 'label symbol)
  (setf (symbol-value symbol) nil))

(defconstant +java-string+ "Ljava/lang/String;")
(defconstant +lisp-class+ "org/armedbear/lisp/Lisp")
(defconstant +lisp-object-class+ "org/armedbear/lisp/LispObject")
(defconstant +lisp-object+ "Lorg/armedbear/lisp/LispObject;")
(defconstant +lisp-object-array+ "[Lorg/armedbear/lisp/LispObject;")
(defconstant +lisp-string+ "Lorg/armedbear/lisp/SimpleString;")
(defconstant +lisp-symbol-class+ "org/armedbear/lisp/Symbol")
(defconstant +lisp-symbol+ "Lorg/armedbear/lisp/Symbol;")
(defconstant +lisp-thread-class+ "org/armedbear/lisp/LispThread")
(defconstant +lisp-thread+ "Lorg/armedbear/lisp/LispThread;")
(defconstant +lisp-cons-class+ "org/armedbear/lisp/Cons")
(defconstant +lisp-cons+ "Lorg/armedbear/lisp/Cons;")
(defconstant +lisp-fixnum-class+ "org/armedbear/lisp/Fixnum")
(defconstant +lisp-fixnum+ "Lorg/armedbear/lisp/Fixnum;")
(defconstant +lisp-simple-string-class+ "org/armedbear/lisp/SimpleString")
(defconstant +lisp-simple-string+ "Lorg/armedbear/lisp/SimpleString;")
(defconstant +lisp-environment+ "Lorg/armedbear/lisp/Environment;")
(defconstant +lisp-special-binding+ "Lorg/armedbear/lisp/SpecialBinding;")
(defconstant +lisp-throw-class+ "org/armedbear/lisp/Throw")
(defconstant +lisp-return-class+ "org/armedbear/lisp/Return")
(defconstant +lisp-go-class+ "org/armedbear/lisp/Go")
(defconstant +lisp-ctf-class+ "org/armedbear/lisp/ClosureTemplateFunction")
(defconstant +lisp-compiled-closure-class+ "org/armedbear/lisp/CompiledClosure")
(defconstant +lisp-compiled-function-class+ "org/armedbear/lisp/CompiledFunction")
(defconstant +lisp-primitive-class+ "org/armedbear/lisp/Primitive")

(defsubst emit-push-nil ()
  (emit 'getstatic +lisp-class+ "NIL" +lisp-object+))

(defsubst emit-push-t ()
  (emit 'getstatic +lisp-class+ "T" +lisp-symbol+))

(defun emit-push-constant-int (n)
  (if (<= -32768 n 32767)
      (emit 'sipush n)
      (emit 'ldc (pool-int n))))

(defun make-descriptor-info (arg-types return-type)
  (let ((descriptor (with-output-to-string (s)
                      (princ #\( s)
                      (dolist (type arg-types)
                        (princ type s))
                      (princ #\) s)
                      (princ (or return-type "V") s)))
        (stack-effect (let ((result (cond ((null return-type) 0)
                                          ((equal return-type "J") 2)
                                          (t 1))))
                        (dolist (type arg-types result)
                          (decf result (if (equal type "J") 2 1))))))
    (cons descriptor stack-effect)))

(defparameter *descriptors* (make-hash-table :test #'equal))

(defun get-descriptor-info (arg-types return-type)
  (let* ((key (list arg-types return-type))
         (descriptor-info (gethash key *descriptors*)))
    (or descriptor-info
        (setf (gethash key *descriptors*)
              (make-descriptor-info arg-types return-type)))))

(defsubst get-descriptor (arg-types return-type)
  (car (get-descriptor-info arg-types return-type)))

(defun emit-invokestatic (class-name method-name arg-types return-type)
  (let* ((info (get-descriptor-info arg-types return-type))
         (descriptor (car info))
         (stack-effect (cdr info))
         (instruction (emit 'invokestatic class-name method-name descriptor)))
    (setf (instruction-stack instruction) stack-effect)))

(defun emit-invokevirtual (class-name method-name arg-types return-type)
  (let* ((info (get-descriptor-info arg-types return-type))
         (descriptor (car info))
         (stack-effect (cdr info))
         (instruction (emit 'invokevirtual class-name method-name descriptor)))
    (setf (instruction-stack instruction) (1- stack-effect))))

(defun emit-invokespecial-init (class-name arg-types)
  (let* ((info (get-descriptor-info arg-types nil))
         (descriptor (car info))
         (stack-effect (cdr info))
         (instruction (emit 'invokespecial class-name "<init>" descriptor)))
    (setf (instruction-stack instruction) (1- stack-effect))))

;; Index of local variable used to hold the current thread.
(defvar *thread* nil)

(defvar *initialize-thread-var* nil)

(defun maybe-initialize-thread-var ()
  (when *initialize-thread-var*
    (emit-invokestatic +lisp-thread-class+ "currentThread" nil +lisp-thread+)
    (emit 'astore *thread*)))

(defsubst ensure-thread-var-initialized ()
  (setf *initialize-thread-var* t))

(defun emit-push-current-thread ()
  (declare (optimize speed))
  (ensure-thread-var-initialized)
  (emit 'aload *thread*))

(defun generate-arg-count-check (arity)
  (aver (fixnump arity))
  (aver (not (minusp arity)))
  (aver (not (null (compiland-argument-register *current-compiland*))))
  (let ((label1 (gensym)))
    (emit 'aload (compiland-argument-register *current-compiland*))
    (emit 'arraylength)
    (emit 'bipush arity)
    (emit 'if_icmpeq `,label1)
    (emit 'aload 0) ; this
    (emit-invokevirtual *this-class* "argCountError" nil nil)
    (emit 'label `,label1)))

(defun maybe-generate-interrupt-check ()
  (unless (> *speed* *safety*)
    (let ((label1 (gensym)))
      (emit 'getstatic +lisp-class+ "interrupted" "Z")
      (emit 'ifeq `,label1)
      (emit-invokestatic +lisp-class+ "handleInterrupt" nil nil)
      (emit 'label `,label1))))

(defun single-valued-p-init ()
  (dolist (op '(+ - * /
                1+ 1- < > <= >= = /=
                car cdr caar cadr cdar cddr cadar caddr cdddr cddddr
                first second third
                eq eql equal equalp
                length
                constantp symbolp
                list list*
                macro-function
                compiler-macro-function
                sys::%defun
                get
                atom
                compiled-function-p
                fdefinition
                special-operator-p keywordp functionp fboundp zerop consp listp
                numberp integerp floatp
                plusp minusp
                complexp arrayp readtablep packagep
                array-dimensions array-rank array-total-size
                array-element-type upgraded-array-element-type
                simple-vector-p simple-string-p bit-vector-p simple-bit-vector-p
                stringp
                row-major-aref
                quote function
                mapcar
                find position
                append nconc subseq adjoin
                revappend nreconc
                copy-seq
                assoc assoc-if assoc-if-not acons assq assql
                char-code code-char char-int digit-char-p
                member ext:memq
                remove remove-if remove-if-not delete delete-if delete-if-not
                special-variable-p
                gensym
                symbol-name symbol-function
                coerce
                reverse nreverse
                last
                cons rplaca rplacd
                sys::set-car sys::set-cdr
                copy-list copy-tree
                make-sequence make-list make-array make-package make-hash-table
                make-string
                find-package
                pathname make-pathname pathname-name directory
                package-used-by-list package-shadowing-symbols
                nthcdr
                aref elt
                not null endp
                concatenate
                format sys::%format
                prin1 princ print write
                compute-restarts find-restart restart-name
                string
                string=
                setq
                multiple-value-list push pop
                type-of class-of
                typep sys::%typep
                abs
                ash
                float-radix
                logand logandc1 logandc2 logeqv logior lognand
                lognot logorc1 logorc2 logxor
                logbitp
                slot-boundp slot-value slot-exists-p
                allocate-instance
                find-class
                class-name
                constantly
                exp expt log
                min max
                realpart imagpart
                integer-length
                sqrt isqrt gcd lcm signum
                char schar
                open
                svref
                fill-pointer
                symbol-value symbol-package package-name
                fourth
                vector-push vector-push-extend
                union nunion
                remove-duplicates delete-duplicates
                read-byte
                fresh-line terpri
                lambda
                ext:classp
                ext:fixnump
                ext:memql
                sys::generic-function-name
                sys::puthash
                precompiler::precompile1
                declare
                go
                sys::%structure-ref
                inst
                emit
                label
                maybe-emit-clear-values
                single-valued-p
                sys:single-valued-p
                sys:read-8-bits
                sys:write-8-bits
                sys::require-type
                ))
    (setf (sys:single-valued-p op) t)))

(eval-when (:load-toplevel :execute)
  (single-valued-p-init))

(defun single-valued-p (form)
  (cond ((block-node-p form)
         (if (equal (block-name form) '(TAGBODY))
             t
             (single-valued-p (node-form form))))
        ((atom form)
         t)
        ((eq (first form) 'IF)
         (and ;;(single-valued-p (second form))
              (single-valued-p (third form))
              (single-valued-p (fourth form))))
        ((eq (first form) 'PROGN)
         (single-valued-p (car (last form))))
        ((memq (first form) '(LET LET*))
         (single-valued-p (car (last (cddr form)))))
        ((memq (car form) '(AND OR))
         (every #'single-valued-p (cdr form)))
        ((eq (first form) 'RETURN-FROM)
         (single-valued-p (third form)))
        ((eq (first form) 'THE)
         (dformat t "single-valued-p THE ~S~%" form)
         (single-valued-p (third form)))
        ((eq (first form) (compiland-name *current-compiland*))
         (dformat t "single-valued-p recursive call ~S~%" (first form))
         (compiland-single-valued-p *current-compiland*))
        (t
         (sys:single-valued-p (car form)))))

(defun emit-clear-values ()
;;   (break "EMIT-CLEAR-VALUES called~%")
  (ensure-thread-var-initialized)
  (emit 'clear-values))

(defun maybe-emit-clear-values (form)
  (declare (optimize speed))
  (unless (single-valued-p form)
;;     (format t "Not single-valued: ~S~%" form)
    (ensure-thread-var-initialized)
    (emit 'clear-values)))

(defun emit-unbox-fixnum ()
  (declare (optimize speed))
  (cond ((= *safety* 3)
         (emit-invokestatic +lisp-fixnum-class+ "getValue"
                            (list +lisp-object+) "I"))
        (t
         (emit 'checkcast +lisp-fixnum-class+)
         (emit 'getfield +lisp-fixnum-class+ "value" "I"))))

(defun emit-box-long ()
  (declare (optimize speed))
  (emit-invokestatic +lisp-class+ "number" (list "J") +lisp-object+))

;; Expects value on stack.
(defun emit-invoke-method (method-name target representation)
  (emit-invokevirtual +lisp-object-class+ method-name nil +lisp-object+)
  (when (eq representation :unboxed-fixnum)
    (emit-unbox-fixnum))
  (emit-move-from-stack target representation))

(defvar *style-warnings* nil)
(defvar *warnings* nil)
(defvar *errors* nil)

(defun compiler-style-warn (format-control &rest format-arguments)
  (incf *style-warnings*)
  (warn 'style-warning
        :format-control format-control
        :format-arguments format-arguments))

(defun compiler-warn (format-control &rest format-arguments)
  (incf *warnings*)
  (warn 'warning
        :format-control format-control
        :format-arguments format-arguments))

(defun compiler-error (format-control &rest format-arguments)
  (incf *errors*)
  (error 'compiler-error
         :format-control format-control
         :format-arguments format-arguments))

(defun compiler-unsupported (format-control &rest format-arguments)
  (error 'compiler-unsupported-feature-error
         :format-control format-control
         :format-arguments format-arguments))

;; "In addition to situations for which the standard specifies
;; that conditions of type WARNING must or might be signaled, warnings might be
;; signaled in situations where the compiler can determine that the
;; consequences are undefined or that a run-time error will be signaled.
;; Examples of this situation are as follows: violating type declarations,
;; altering or assigning the value of a constant defined with DEFCONSTANT,
;; calling built-in Lisp functions with a wrong number of arguments or
;; malformed keyword argument lists, and using unrecognized declaration
;; specifiers." (3.2.5)
(defun check-arg-count (form n)
  (declare (type fixnum n))
  (let* ((op (car form))
         (args (cdr form))
         (ok (= (length args) n)))
    (unless ok
      (funcall (if (eq (symbol-package op) sys:+cl-package+)
                   #'compiler-warn ; See above!
                   #'compiler-style-warn)
               "Wrong number of arguments for ~A (expected ~D, but received ~D)."
               op n (length args)))
    ok))

(defparameter *resolvers* (make-hash-table :test #'eql))

(defun unsupported-opcode (instruction)
  (error "Unsupported opcode ~D." (instruction-opcode instruction)))

(defun initialize-resolvers ()
  (dotimes (n (1+ *last-opcode*))
    (setf (gethash n *resolvers*) #'unsupported-opcode))
  ;; The following opcodes resolve to themselves.
  (dolist (n '(0 ; NOP
               1 ; ACONST_NULL
               2 ; ICONST_M1
               3 ; ICONST_0
               4 ; ICONST_1
               5 ; ICONST_2
               6 ; ICONST_3
               7 ; ICONST_4
               8 ; ICONST_5
               9 ; LCONST_0
               10 ; LCONST_1
               42 ; ALOAD_0
               43 ; ALOAD_1
               44 ; ALOAD_2
               45 ; ALOAD_3
               50 ; AALOAD
               75 ; ASTORE_0
               76 ; ASTORE_1
               77 ; ASTORE_2
               78 ; ASTORE_3
               83 ; AASTORE
               87 ; POP
               89 ; DUP
               90 ; DUP_X1
               91 ; DUP_X2
               95 ; SWAP
               96 ; IADD
               97 ; LADD
               100 ; ISUB
               101 ; LSUB
               116 ; INEG
               120 ; ISHL
               121 ; LSHL
               122 ; ISHR
               123 ; LSHR
               126 ; IAND
               128 ; IOR
               130 ; IXOR
               132 ; IINC
               133 ; I2L
               136 ; L2I
               153 ; IFEQ
               154 ; IFNE
               155 ; IFGE
               156 ; IFGT
               157 ; IFGT
               158 ; IFLE
               159 ; IF_ICMPEQ
               160 ; IF_ICMPNE
               161 ; IF_ICMPLT
               162 ; IF_ICMPGE
               163 ; IF_ICMPGT
               164 ; IF_ICMPLE
               165 ; IF_ACMPEQ
               166 ; IF_ACMPNE
               167 ; GOTO
               168 ; JSR
               169 ; RET
               176 ; ARETURN
               177 ; RETURN
               190 ; ARRAYLENGTH
               191 ; ATHROW
               198 ; IFNULL
               202 ; LABEL
               ))
    (setf (gethash n *resolvers*) nil)))

(initialize-resolvers)

(defmacro define-resolver (opcodes args &body body)
  (let ((name (gensym)))
    (if (listp opcodes)
        `(progn
           (defun ,name ,args ,@body)
           (eval-when (:load-toplevel :execute)
             (dolist (op ',opcodes)
               (setf (gethash op *resolvers*) (symbol-function ',name)))))
        `(progn
           (defun ,name ,args ,@body)
           (eval-when (:load-toplevel :execute)
             (setf (gethash ,opcodes *resolvers*) (symbol-function ',name)))))))

;; ALOAD
(define-resolver 25 (instruction)
 (let* ((args (instruction-args instruction))
        (index (car args)))
   (cond ((<= 0 index 3)
          (inst (+ index 42)))
         ((<= 0 index 255)
          (inst 25 index))
         (t
          (error "ALOAD unsupported case")))))

;; ILOAD
(define-resolver 21 (instruction)
  (let* ((args (instruction-args instruction))
         (index (car args)))
    (cond ((<= 0 index 3)
           (inst (+ index 26)))
          ((<= 0 index 255)
           (inst 21 index))
          (t
           (error "ILOAD unsupported case")))))

;; ASTORE
(define-resolver 58 (instruction)
  (let* ((args (instruction-args instruction))
         (index (car args)))
    (cond ((<= 0 index 3)
           (inst (+ index 75)))
          ((<= 0 index 255)
           (inst 58 index))
          (t
           (error "ASTORE unsupported case")))))

;; ISTORE
(define-resolver 54 (instruction)
  (let* ((args (instruction-args instruction))
         (index (car args)))
    (cond ((<= 0 index 3)
           (inst (+ index 59)))
          ((<= 0 index 255)
           (inst 54 index))
          (t
           (error "ASTORE unsupported case")))))

;; GETSTATIC, PUTSTATIC
(define-resolver (178 179) (instruction)
  (let* ((args (instruction-args instruction))
         (index (pool-field (first args) (second args) (third args))))
    (inst (instruction-opcode instruction) (u2 index))))

;; BIPUSH, SIPUSH
(define-resolver (16 17) (instruction)
  (let* ((args (instruction-args instruction))
         (n (first args)))
    (cond ((<= 0 n 5)
           (inst (+ n 3)))
          ((<= -128 n 127)
           (inst 16 (logand n #xff))) ; BIPUSH
          (t ; SIPUSH
           (inst 17 (u2 n))))))

;; INVOKEVIRTUAL, INVOKESPECIAL, INVOKESTATIC class-name method-name descriptor
(define-resolver (182 183 184) (instruction)
  (let* ((args (instruction-args instruction))
         (index (pool-method (first args) (second args) (third args))))
    (setf (instruction-args instruction) (u2 index))
    instruction))

;; LDC
(define-resolver 18 (instruction)
  (let* ((args (instruction-args instruction)))
    (unless (= (length args) 1)
      (error "Wrong number of args for LDC."))
    (if (> (car args) 255)
        (inst 19 (u2 (car args))) ; LDC_W
        (inst 18 args))))

;; GETFIELD, PUTFIELD class-name field-name type-name
(define-resolver (180 181) (instruction)
  (let* ((args (instruction-args instruction))
         (index (pool-field (first args) (second args) (third args))))
    (inst (instruction-opcode instruction) (u2 index))))

;; NEW, ANEWARRAY, CHECKCAST, INSTANCEOF class-name
(define-resolver (187 189 192 193) (instruction)
  (let* ((args (instruction-args instruction))
         (index (pool-class (first args))))
    (inst (instruction-opcode instruction) (u2 index))))

(defun resolve-instruction (instruction)
  (declare (optimize speed))
  (let ((resolver (gethash (instruction-opcode instruction) *resolvers*)))
    (if resolver
        (funcall resolver instruction)
        instruction)))

(defun resolve-instructions (code)
  (let ((vector (make-array 512 :fill-pointer 0 :adjustable t)))
    (dotimes (index (the fixnum (length code)) vector)
      (declare (type fixnum index))
      (let ((instruction (svref code index)))
        (case (instruction-opcode instruction)
          (205 ; CLEAR-VALUES
           (let ((instructions
                  (list
                   (inst 'aload *thread*)
                   (inst 'aconst_null)
                   (inst 'putfield (list +lisp-thread-class+ "_values"
                                         "[Lorg/armedbear/lisp/LispObject;")))))
             (dolist (instruction instructions)
               (vector-push-extend (resolve-instruction instruction) vector))))
          (t
           (vector-push-extend (resolve-instruction instruction) vector)))))))

;; (defconstant +branch-opcodes+
;;   '(153 ; IFEQ
;;     154 ; IFNE
;;     155 ; IFLT
;;     156 ; IFGE
;;     157 ; IFGT
;;     158 ; IFLE
;;     159 ; IF_ICMPEQ
;;     160 ; IF_ICMPNE
;;     161 ; IF_ICMPLT
;;     162 ; IF_ICMPGE
;;     163 ; IF_ICMPGT
;;     164 ; IF_ICMPLE
;;     165 ; IF_ACMPEQ
;;     166 ; IF_ACMPNE
;;     167 ; GOTO
;;     168 ; JSR
;;     198 ; IFNULL
;;     ))

(defun branch-opcode-p (opcode)
  (declare (optimize speed))
;;   (member opcode +branch-opcodes+)
  (or (<= 153 opcode 168)
      (= opcode 198)))

(defun walk-code (code start-index depth)
  (declare (optimize speed))
  (do* ((i start-index (1+ i))
        (limit (length code)))
       ((>= i limit))
    (declare (type fixnum i limit))
    (let ((instruction (aref code i)))
      (when (instruction-depth instruction)
        (unless (eql (instruction-depth instruction) (+ depth (instruction-stack instruction)))
          (fresh-line)
          (sys::%format t "Stack inconsistency at index ~D: found ~S, expected ~S.~%"
                   i
                   (instruction-depth instruction)
                   (+ depth (instruction-stack instruction))))
        (return-from walk-code))
      (let ((opcode (instruction-opcode instruction)))
        (unless (eql opcode 168) ; JSR
          (setf depth (+ depth (instruction-stack instruction))))
        (setf (instruction-depth instruction) depth)
        (if (eql opcode 168) ; JSR
            (let ((label (car (instruction-args instruction))))
              (walk-code code (symbol-value label) (1+ depth)))
            (when (branch-opcode-p opcode)
              (let ((label (car (instruction-args instruction))))
                (walk-code code (symbol-value label) depth))))
        (when (member opcode '(167 169 176 191)) ; GOTO RET ATHROW
          ;; Current path ends.
          (return-from walk-code))))))

(defun analyze-stack ()
  (let* ((code *code*)
         (code-length (length code)))
    (declare (type fixnum code-length))
    (aver (vectorp code))
    (dotimes (i code-length)
      (declare (type fixnum i))
      (let* ((instruction (aref code i))
             (opcode (instruction-opcode instruction)))
        (when (eql opcode 202) ; LABEL
          (let ((label (car (instruction-args instruction))))
            (set label i)))
        (if (instruction-stack instruction)
            (when (opcode-stack-effect opcode)
              (unless (eql (instruction-stack instruction) (opcode-stack-effect opcode))
                (sys::%format t "instruction-stack = ~S opcode-stack-effect = ~S~%"
                         (instruction-stack instruction)
                         (opcode-stack-effect opcode))
                (sys::%format t "index = ~D instruction = ~A~%" i (print-instruction instruction))))
            (setf (instruction-stack instruction) (opcode-stack-effect opcode)))
;;         (aver (not (null (instruction-stack instruction))))
        (unless (instruction-stack instruction)
          (sys::%format t "no stack information for instruction ~D~%" (instruction-opcode instruction))
          (aver nil))))
    (walk-code code 0 0)
    (dolist (handler *handlers*)
      ;; Stack depth is always 1 when handler is called.
      (walk-code code (symbol-value (handler-code handler)) 1))
    (let ((max-stack 0))
      (dotimes (i code-length)
        (declare (type fixnum i))
        (let* ((instruction (aref code i))
               (depth (instruction-depth instruction)))
          (when depth
            (setf max-stack (max max-stack depth)))))
      (when *compiler-debug*
        (sys::%format t "compiland name = ~S~%" (compiland-name *current-compiland*))
        (sys::%format t "max-stack = ~D~%" max-stack)
        (sys::%format t "----- after stack analysis -----~%")
        (print-code))
      max-stack)))

(defun emit-move-from-stack (target &optional representation)
  (declare (optimize speed))
  (cond ((null target)
         (emit 'pop))
        ((eq target :stack))
        ((fixnump target)
         (emit (if (eq representation :unboxed-fixnum) 'istore 'astore) target))
        (t
         (aver nil))))

(defun resolve-variables ()
  (let ((code (nreverse *code*)))
    (setf *code* nil)
    (dolist (instruction code)
      (case (instruction-opcode instruction)
        (206 ; VAR-REF
         (let* ((instruction-args (instruction-args instruction))
                (variable (first instruction-args))
                (target (second instruction-args))
                (representation (third instruction-args)))
           (aver (variable-p variable))
           (dformat t "var-ref variable = ~S " (variable-name variable))
           (cond ((variable-register variable)
                  (dformat t "register = ~S~%" (variable-register variable))
                  (emit 'aload (variable-register variable))
                  (emit-move-from-stack target))
                 ((variable-special-p variable)
                  (dformat t "special~%")
                  (compile-special-reference (variable-name variable) target nil))
                 ((variable-closure-index variable)
                  (dformat t "closure-index = ~S~%" (variable-closure-index variable))
                  (aver (not (null (compiland-closure-register *current-compiland*))))
                  (emit 'aload (compiland-closure-register *current-compiland*))
                  (emit-push-constant-int (variable-closure-index variable))
                  (emit 'aaload)
                  (emit-move-from-stack target))
                 ((variable-index variable)
                  (dformat t "index = ~S~%" (variable-index variable))
                  (aver (not (null (compiland-argument-register *current-compiland*))))
                  (emit 'aload (compiland-argument-register *current-compiland*))
                  (emit-push-constant-int (variable-index variable))
                  (emit 'aaload)
                  (emit-move-from-stack target))
                 (t
                  (dformat t "VAR-REF unhandled case variable = ~S~%" (variable-name variable))
                  (aver (progn 'unhandled-case nil))))
           (when (eq representation :unboxed-fixnum)
             (dformat t "resolve-variables calling emit-unbox-fixnum~%")
             (emit-unbox-fixnum))))
        (207 ; VAR-SET
         (let ((variable (car (instruction-args instruction))))
           (dformat t "var-set variable = ~S " (variable-name variable))
           (aver (variable-p variable))
           (aver (not (variable-special-p variable)))
           (cond ((variable-register variable)
                  (dformat t "register = ~S~%" (variable-register variable))
                  (emit 'astore (variable-register variable)))
                 ((variable-closure-index variable)
                  (dformat t "closure-index = ~S~%" (variable-closure-index variable))
                  (aver (not (null (compiland-closure-register *current-compiland*))))
                  (emit 'aload (compiland-closure-register *current-compiland*))
                  (emit 'swap) ; array value
                  (emit 'bipush (variable-closure-index variable))
                  (emit 'swap) ; array index value
                  (emit 'aastore))
                 (t
                  (dformat t "var-set fall-through case~%")
                  (aver (not (null (compiland-argument-register *current-compiland*))))
                  (emit 'aload (compiland-argument-register *current-compiland*)) ; Stack: value array
                  (emit 'swap) ; array value
                  (emit 'bipush (variable-index variable)) ; array value index
                  (emit 'swap) ; array index value
                  (emit 'aastore)))))
        (t
         (push instruction *code*))))))

(defun finalize-code ()
  (setf *code* (nreverse (coerce *code* 'vector))))

(defun print-code ()
  (dotimes (i (length *code*))
    (let ((instruction (elt *code* i)))
      (sys::%format t "~D ~A ~S ~S ~S~%"
               i
               (opcode-name (instruction-opcode instruction))
               (instruction-args instruction)
               (instruction-stack instruction)
               (instruction-depth instruction)))))

(defun print-code2 (code)
  (dotimes (i (length code))
    (let ((instruction (elt code i)))
      (case (instruction-opcode instruction)
        (202 ; LABEL
         (format t "~A:~%" (car (instruction-args instruction))))
        (t
         (format t "~8D:   ~A ~S~%"
                 i
                 (opcode-name (instruction-opcode instruction))
                 (instruction-args instruction)))))))

(defun label-p (instruction)
;;   (declare (optimize safety))
;;   (declare (type instruction instruction))
  (and instruction
       (= (the fixnum (instruction-opcode (the instruction instruction))) 202)))

(defun instruction-label (instruction)
  (declare (optimize safety))
;;   (declare (type instruction instruction))
  (and instruction
       (= (instruction-opcode (the instruction instruction)) 202)
       (car (instruction-args instruction))))

;; Remove unused labels.
(defun optimize-1 ()
  (let ((code (coerce *code* 'list))
        (changed nil)
        (marker (gensym)))
    ;; Mark the labels that are actually branched to.
    (dolist (instruction code)
      (when (branch-opcode-p (instruction-opcode instruction))
        (let ((label (car (instruction-args instruction))))
          (set label marker))))
    ;; Add labels used for exception handlers.
    (dolist (handler *handlers*)
      (set (handler-from handler) marker)
      (set (handler-to handler) marker)
      (set (handler-code handler) marker))
    ;; Remove labels that are not used as branch targets.
    (let ((tail code))
      (loop
        (when (null tail)
          (return))
        (let ((instruction (car tail)))
          (when (= (instruction-opcode instruction) 202) ; LABEL
            (let ((label (car (instruction-args instruction))))
              (unless (eq (symbol-value label) marker)
                (setf (car tail) nil)
                (setf changed t)))))
        (setf tail (cdr tail))))
    (when changed
      (setf *code* (delete nil code))
      t)))

(defun optimize-2 ()
  (let* ((code (coerce *code* 'list))
         (tail code)
         (changed nil))
    (loop
      (when (null (cdr tail))
        (return))
      (let ((instruction (car tail))
            next-instruction)
        (when (and instruction
                   (= (instruction-opcode instruction) 167) ; GOTO
                   (setf next-instruction (cadr tail)))
          (cond ((and (= (instruction-opcode next-instruction) 202) ; LABEL
                      (eq (car (instruction-args instruction))
                          (car (instruction-args next-instruction))))
                 ;; GOTO next instruction: we don't need this one.
                 (setf (car tail) nil)
                 (setf changed t))
                ((= (instruction-opcode next-instruction) 167) ; GOTO
                 ;; Two GOTOs in a row: the next instruction is unreachable.
                 (setf (cadr tail) nil)
                 (setf changed t)))))
      (setf tail (cdr tail)))
    (when changed
      (setf *code* (delete nil code))
      t)))

(defun hash-labels (code)
  (let ((ht (make-hash-table :test 'eq))
        (code (coerce code 'list))
        (pending-label nil))
    (dolist (instruction code)
      (when pending-label
        (setf (gethash pending-label ht) instruction)
        (setf pending-label nil))
      (when (label-p instruction)
        (setf pending-label (instruction-label instruction))))
    ht))

(defun optimize-2b ()
  (let* ((code (coerce *code* 'list))
         (ht (hash-labels code))
         (changed nil))
    (dolist (instruction code)
      (when (and instruction (= (instruction-opcode instruction) 167)) ; GOTO
        (let* ((target-label (car (instruction-args instruction)))
               (next-instruction (gethash target-label ht)))
          (when next-instruction
            (case (instruction-opcode next-instruction)
              (167 ; GOTO
               (setf (instruction-args instruction)
                     (instruction-args next-instruction)
                     changed t))
              (176 ; ARETURN
               (setf (instruction-opcode instruction) 176
                     (instruction-args instruction) nil
                     changed t))
              )))))
    (when changed
      (setf *code* (delete nil code))
      t)))

;; CLEAR-VALUES CLEAR-VALUES => CLEAR-VALUES
;; GETSTATIC POP => nothing
(defun optimize-3 ()
  (let* ((code (coerce *code* 'list))
         (tail code)
         (changed nil))
    (loop
      (when (null (cdr tail))
        (return))
      (let ((this-opcode (instruction-opcode (car tail)))
            (next-opcode (instruction-opcode (cadr tail))))
        (case this-opcode
          (205 ; CLEAR-VALUES
           (when (eql next-opcode 205) ; CLEAR-VALUES
             (setf (car tail) (cadr tail)
                   (cdr tail) (cddr tail)
                   changed t)))
          (178 ; GETSTATIC
           (when (eql next-opcode 87) ; POP
             (setf (car tail) (caddr tail)
                   (cdr tail) (cdddr tail)
                   changed t)))))
      (setf tail (cdr tail)))
    (when changed
      (setf *code* code)
      t)))

(defvar *delete-unreachable-code-flag* t)

(defun delete-unreachable-code ()
  (when *delete-unreachable-code-flag*
      ;; Look for unreachable code after GOTO.
      (unless (listp *code*)
        (setf *code* (coerce *code* 'list)))
      (let* ((code *code*)
             (tail code)
             (locally-changed-p nil)
             (after-goto nil))
        (loop
          (when (null tail)
            (return))
          (let ((instruction (car tail)))
            (cond (after-goto
                   (if (= (instruction-opcode instruction) 202) ; LABEL
                       (setf after-goto nil)
                       ;; Unreachable.
                       (progn
                         (setf (car tail) nil)
                         (setf locally-changed-p t))))
                  ((= (instruction-opcode instruction) 167) ; GOTO
                   (setf after-goto t))))
          (setf tail (cdr tail)))
        (when locally-changed-p
          (setf *code* (delete nil code))
          t))))

(defvar *enable-optimization* t)

(defun optimize-code ()
  (unless *enable-optimization*
    (sys::%format t "optimizations are disabled~%"))
  (when *enable-optimization*
    (when *compiler-debug*
      (sys::%format t "----- before optimization -----~%")
      (print-code))
    (loop
      (let ((changed-p nil))
        (setf changed-p (or (optimize-1) changed-p))
        (setf changed-p (or (optimize-2) changed-p))
        (setf changed-p (or (optimize-2b) changed-p))
        (setf changed-p (or (optimize-3) changed-p))
        (setf changed-p (or (delete-unreachable-code) changed-p))
        (unless changed-p
          (return))))
    (unless (typep *code* 'vector)
      (setf *code* (coerce *code* 'vector)))
    (when *compiler-debug*
      (sys::%format t "----- after optimization -----~%")
      (print-code))))

(defun code-bytes (code)
  (let ((length 0))
    (declare (type fixnum length))
    ;; Pass 1: calculate label offsets and overall length.
    (dotimes (i (the fixnum (length code)))
      (declare (type fixnum i))
      (let* ((instruction (aref code i))
             (opcode (instruction-opcode instruction)))
        (if (= opcode 202) ; LABEL
            (let ((label (car (instruction-args instruction))))
              (set label length))
            (incf length (opcode-size opcode)))))
    ;; Pass 2: replace labels with calculated offsets.
    (let ((index 0))
;;       (declare (type fixnum index))
      (dotimes (i (length code))
        (declare (type fixnum i))
        (let ((instruction (aref code i)))
          (when (branch-opcode-p (instruction-opcode instruction))
            (let* ((label (car (instruction-args instruction)))
                   (offset (- (symbol-value `,label) index)))
              (setf (instruction-args instruction) (u2 offset))))
          (unless (= (instruction-opcode instruction) 202) ; LABEL
            (incf index (opcode-size (instruction-opcode instruction)))))))
    ;; Expand instructions into bytes, skipping LABEL pseudo-instructions.
    (let ((bytes (make-array length))
          (index 0))
;;       (declare (type fixnum index))
      (dotimes (i (length code))
        (declare (type fixnum i))
        (let ((instruction (aref code i)))
          (unless (= (instruction-opcode instruction) 202) ; LABEL
            (setf (svref bytes index) (instruction-opcode instruction))
            (incf index)
            (dolist (byte (instruction-args instruction))
              (setf (svref bytes index) byte)
              (incf index)))))
      bytes)))

(defsubst write-u1 (n stream)
  (declare (optimize speed))
  (sys::write-8-bits n stream))

(defun write-u2 (n stream)
  (declare (optimize speed))
  (sys::write-8-bits (ash n -8) stream)
  (sys::write-8-bits (logand n #xFF) stream))

(defun write-u4 (n stream)
  (declare (optimize speed))
  (write-u2 (ash n -16) stream)
  (write-u2 (logand n #xFFFF) stream))

(defun write-s4 (n stream)
  (declare (optimize speed))
  (cond ((minusp n)
         (write-u4 (1+ (logxor (- n) #xFFFFFFFF)) stream))
        (t
         (write-u4 n stream))))

(defun write-ascii (string length stream)
  (write-u2 length stream)
  (dotimes (i length)
    (sys:write-8-bits (char-code (schar string i)) stream)))

(defun write-utf8 (string stream)
  (declare (optimize speed))
  (let ((length (length string))
        (must-convert nil))
    (declare (type fixnum length))
    (dotimes (i length)
      (declare (type fixnum i))
      (unless (< 0 (char-code (schar string i)) #x80)
        (setf must-convert t)
        (return)))
    (if must-convert
        (let ((octets (make-array (* length 2)
                                  :element-type '(unsigned-byte 8)
                                  :adjustable t
                                  :fill-pointer 0)))
          (dotimes (i length)
            (declare (type fixnum i))
            (let* ((c (schar string i))
                   (n (char-code c)))
              (cond ((zerop n)
                     (vector-push-extend #xC0 octets)
                     (vector-push-extend #x80 octets))
                    ((< 0 n #x80)
                     (vector-push-extend n octets))
                    (t
                     (let ((char-octets (char-to-utf8 c)))
                       (dotimes (j (length char-octets))
                         (vector-push-extend (svref char-octets j) octets)))))))
          (write-u2 (length octets) stream)
          (dotimes (i (length octets))
            (sys:write-8-bits (aref octets i) stream)))
        (write-ascii string length stream))))

(defun write-constant-pool-entry (entry stream)
  (declare (optimize speed))
  (let ((tag (first entry)))
    (write-u1 tag stream)
    (case tag
      (1 ; UTF8
       (write-utf8 (third entry) stream))
      (3 ; int
       (write-s4 (second entry) stream))
      ((5 6)
       (write-u4 (second entry) stream)
       (write-u4 (third entry)) stream)
      ((9 10 11 12)
       (write-u2 (second entry) stream)
       (write-u2 (third entry) stream))
      ((7 8)
       (write-u2 (second entry) stream))
      (t
       (error "write-constant-pool-entry unhandled tag ~D~%" tag)))))

(defun write-constant-pool (stream)
  (declare (optimize speed))
  (write-u2 *pool-count* stream)
  (dolist (entry (reverse *pool*))
    (write-constant-pool-entry entry stream)))

(defstruct field
  access-flags
  name
  descriptor
  name-index
  descriptor-index)

(defstruct (java-method (:conc-name method-) (:constructor make-method))
  access-flags
  name
  descriptor
  name-index
  descriptor-index
  max-stack
  max-locals
  code
  handlers)

(defun make-constructor (super lambda-name args)
;;   (sys::%format t "make-constructor (length *static-code*) = ~S~%" (length *static-code*))
  (let* ((*compiler-debug* nil) ; We don't normally need to see debugging output for constructors.
         (constructor (make-method :name "<init>"
                                   :descriptor "()V"))
         (*code* ())
         (*handlers* nil))
    (dformat t "make-constructor super = ~S~%" super)
    (setf (method-name-index constructor) (pool-name (method-name constructor)))
    (setf (method-descriptor-index constructor) (pool-name (method-descriptor constructor)))
    (setf (method-max-locals constructor) 1)
    (cond ((equal super +lisp-compiled-function-class+)
           (emit 'aload_0) ;; this
;;            (emit 'aconst_null) ;; name

           (cond ((and lambda-name (symbolp lambda-name) (symbol-package lambda-name))
                  (emit 'ldc (pool-string (symbol-name lambda-name)))
                  (emit 'ldc (pool-string (package-name (symbol-package lambda-name))))
                  (emit-invokestatic +lisp-class+ "internInPackage"
                                     (list +java-string+ +java-string+) +lisp-symbol+))
                 (t
                  (emit 'aconst_null)))

           (let* ((*print-level* nil)
                  (*print-length* nil)
                  (s (sys::%format nil "~S" args)))
             (emit 'ldc (pool-string s))
             (emit-invokestatic +lisp-class+ "readObjectFromString"
                                (list +java-string+) +lisp-object+))
           (emit-push-nil) ;; body
           (emit 'aconst_null) ;; environment
           (emit-invokespecial-init super
                                    (list +lisp-object+ +lisp-object+
                                          +lisp-object+ +lisp-environment+)))
          ((equal super +lisp-primitive-class+)
           (emit 'aload_0) ; this
           (cond ((and lambda-name (symbolp lambda-name) (symbol-package lambda-name))
                  (emit 'ldc (pool-string (symbol-name lambda-name)))
                  (emit 'ldc (pool-string (package-name (symbol-package lambda-name))))
                  (emit-invokestatic +lisp-class+ "internInPackage"
                                     (list +java-string+ +java-string+) +lisp-symbol+))
                 (t
                  (emit-push-nil))) ; no name
           (let* ((*print-level* nil)
                  (*print-length* nil)
                  (s (sys::%format nil "~S" args)))
             (emit 'ldc (pool-string s))
             (emit-invokestatic +lisp-class+ "readObjectFromString"
                                (list +java-string+) +lisp-object+))
           (emit-invokespecial-init super (list +lisp-object+ +lisp-object+)))
          ((equal super +lisp-ctf-class+)
           (emit 'aload_0) ;; this
           (let* ((*print-level* nil)
                  (*print-length* nil)
                  (s (sys::%format nil "~S" args)))
             (emit 'ldc (pool-string s))
             (emit-invokestatic +lisp-class+ "readObjectFromString"
                                (list +java-string+) +lisp-object+))
           (emit-invokespecial-init super (list +lisp-object+)))
          (t
           (aver nil)))
    (setf *code* (append *static-code* *code*))
    (emit 'return)
    (finalize-code)
    ;;(optimize-code)
    (setf *code* (resolve-instructions *code*))
    (setf (method-max-stack constructor) (analyze-stack))
    (setf (method-code constructor) (code-bytes *code*))
    (setf (method-handlers constructor) (nreverse *handlers*))
    constructor))

(defun write-exception-table (method stream)
  (let ((handlers (method-handlers method)))
    (write-u2 (length handlers) stream) ; number of entries
    (dolist (handler handlers)
      (write-u2 (symbol-value (handler-from handler)) stream)
      (write-u2 (symbol-value (handler-to handler)) stream)
      (write-u2 (symbol-value (handler-code handler)) stream)
      (write-u2 (handler-catch-type handler) stream))))

(defun write-source-file-attr (source-file stream)
  (let* ((name-index (pool-name "SourceFile"))
         (source-file-index (pool-name source-file)))
    (write-u2 name-index stream)
    ;; "The value of the attribute_length item of a SourceFile_attribute
    ;; structure must be 2."
    (write-u4 2 stream)
    (write-u2 source-file-index stream)))

(defvar *source-line-number* nil)

(defun write-line-number-table (stream)
  (let* ((name-index (pool-name "LineNumberTable")))
    (write-u2 name-index stream)
    (write-u4 6 stream) ; "the length of the attribute, excluding the initial six bytes"
    (write-u2 1 stream) ; number of entries
    (write-u2 0 stream) ; start_pc
    (write-u2 *source-line-number* stream)))

(defun write-code-attr (method stream)
  (declare (optimize speed))
  (let* ((name-index (pool-name "Code"))
         (code (method-code method))
         (code-length (length code))
         (line-number-available-p (and (fixnump *source-line-number*)
                                       (plusp *source-line-number*)))
         (length (+ code-length 12
                    (* (length (method-handlers method)) 8)
                    (if line-number-available-p 12 0)))
         (max-stack (or (method-max-stack method) 20))
         (max-locals (or (method-max-locals method) 1)))
    (write-u2 name-index stream)
    (write-u4 length stream)
    (write-u2 max-stack stream)
    (write-u2 max-locals stream)
    (write-u4 code-length stream)
    (dotimes (i code-length)
      (declare (type fixnum i))
      (write-u1 (svref code i) stream))
    (write-exception-table method stream)
    (cond (line-number-available-p
           ; attributes count
           (write-u2 1 stream)
           (write-line-number-table stream))
          (t
           ; attributes count
           (write-u2 0 stream)))))

(defun write-method (method stream)
  (declare (optimize speed))
  (write-u2 (or (method-access-flags method) #x1) stream) ; access flags
  (write-u2 (method-name-index method) stream)
  (write-u2 (method-descriptor-index method) stream)
  (write-u2 1 stream) ; attributes count
  (write-code-attr method stream))

(defun write-field (field stream)
  (declare (optimize speed))
  (write-u2 (or (field-access-flags field) #x1) stream) ; access flags
  (write-u2 (field-name-index field) stream)
  (write-u2 (field-descriptor-index field) stream)
  (write-u2 0 stream)) ; attributes count

(defun declare-field (name descriptor)
  (let ((field (make-field :name name :descriptor descriptor)))
    (setf (field-access-flags field) (logior #x8 #x2)) ; private static
    (setf (field-name-index field) (pool-name (field-name field)))
    (setf (field-descriptor-index field) (pool-name (field-descriptor field)))
    (push field *fields*)))

(defun sanitize (symbol)
  (declare (optimize speed))
  (let* ((input (symbol-name symbol))
         (output (make-array (length input) :fill-pointer 0 :element-type 'character)))
    (dotimes (i (length input))
      (declare (type fixnum i))
      (let ((c (char-upcase (char input i))))
        (cond ((<= #.(char-code #\A) (char-code c) #.(char-code #\Z))
               (vector-push c output))
              ((eql c #\-)
               (vector-push #\_ output)))))
    (when (plusp (length output))
      output)))

(defun declare-symbol (symbol)
  (let ((g (gethash symbol *declared-symbols*)))
    (unless g
      (let ((*code* *static-code*)
            (s (sanitize symbol)))
        (setf g (symbol-name (gensym)))
        (when s
          (setf g (concatenate 'string g "_" s)))
        (declare-field g +lisp-symbol+)
        (emit 'ldc (pool-string (symbol-name symbol)))
        (emit 'ldc (pool-string (package-name (symbol-package symbol))))
        (emit-invokestatic +lisp-class+ "internInPackage"
                           (list +java-string+ +java-string+) +lisp-symbol+)
        (emit 'putstatic *this-class* g +lisp-symbol+)
        (setf *static-code* *code*)
;;         (sys::%format t "declare-symbol (length *static-code* = ~S~%" (length *static-code*))
        (setf (gethash symbol *declared-symbols*) g)))
    g))

(defun declare-keyword (symbol)
  (let ((g (gethash symbol *declared-symbols*)))
    (unless g
      (let ((*code* *static-code*))
        (setf g (symbol-name (gensym)))
        (declare-field g +lisp-symbol+)
        (emit 'ldc (pool-string (symbol-name symbol)))
        (emit-invokestatic "org/armedbear/lisp/Keyword" "internKeyword"
                           (list +java-string+) +lisp-symbol+)
        (emit 'putstatic *this-class* g +lisp-symbol+)
        (setf *static-code* *code*)
        (setf (gethash symbol *declared-symbols*) g)))
    g))

(defun declare-function (symbol)
  (let ((f (gethash symbol *declared-functions*)))
    (unless f
      (setf f (symbol-name (gensym)))
      (let ((s (sanitize symbol)))
        (when s
          (setf f (concatenate 'string f "_" s))))
      (let ((*code* *static-code*)
            (g (gethash symbol *declared-symbols*)))
        (cond (g
               (emit 'getstatic *this-class* g +lisp-symbol+))
              (t
               (emit 'ldc (pool-string (symbol-name symbol)))
               (emit 'ldc (pool-string (package-name (symbol-package symbol))))
               (emit-invokestatic +lisp-class+ "internInPackage"
                                  (list +java-string+ +java-string+)
                                  +lisp-symbol+)))
        (declare-field f +lisp-object+)
        (emit-invokevirtual +lisp-symbol-class+ "getSymbolFunctionOrDie"
                            nil +lisp-object+)
        (emit 'putstatic *this-class* f +lisp-object+)
        (setq *static-code* *code*)
        (setf (gethash symbol *declared-functions*) f)))
    f))

(defun declare-setf-function (name)
  (let ((f (gethash name *declared-functions*)))
    (unless f
      (let ((symbol (cadr name)))
        (setf f (symbol-name (gensym)))
        (let ((s (sanitize symbol)))
          (when s
            (setf f (concatenate 'string f "_SETF_" s))))
        (let ((*code* *static-code*)
              (g (gethash symbol *declared-symbols*)))
          (cond (g
                 (emit 'getstatic *this-class* g +lisp-symbol+))
                (t
                 (emit 'ldc (pool-string (symbol-name symbol)))
                 (emit 'ldc (pool-string (package-name (symbol-package symbol))))
                 (emit-invokestatic +lisp-class+ "internInPackage"
                                    (list +java-string+ +java-string+)
                                    +lisp-symbol+)))
          (declare-field f +lisp-object+)
          (emit-invokevirtual +lisp-symbol-class+ "getSymbolSetfFunctionOrDie"
                              nil +lisp-object+)
          (emit 'putstatic *this-class* f +lisp-object+)
          (setq *static-code* *code*)
          (setf (gethash name *declared-functions*) f))))
    f))

(defun declare-fixnum (n)
  (declare (type fixnum n))
  (let ((g (gethash n *declared-fixnums*)))
    (unless g
      (let ((*code* *static-code*))
        (setf g (sys::%format nil "FIXNUM_~A~D"
                         (if (minusp n) "MINUS_" "")
                         (abs n)))
        (declare-field g +lisp-fixnum+)
        (emit 'new +lisp-fixnum-class+)
        (emit 'dup)
        (case n
          (-1
           (emit 'iconst_m1))
          (0
           (emit 'iconst_0))
          (1
           (emit 'iconst_1))
          (2
           (emit 'iconst_2))
          (3
           (emit 'iconst_3))
          (4
           (emit 'iconst_4))
          (5
           (emit 'iconst_5))
          (t
           (emit 'ldc (pool-int n))))
        (emit-invokespecial-init +lisp-fixnum-class+ '("I"))
        (emit 'putstatic *this-class* g +lisp-fixnum+)
        (setf *static-code* *code*)
        (setf (gethash n *declared-fixnums*) g)))
    g))

(defun declare-object-as-string (obj)
  (let* ((g (symbol-name (gensym)))
         (*print-level* nil)
         (*print-length* nil)
         (s (sys::%format nil "~S" obj))
         (*code* *static-code*))
    (declare-field g +lisp-object+)
    (emit 'ldc (pool-string s))
    (emit-invokestatic +lisp-class+ "readObjectFromString"
                       (list +java-string+) +lisp-object+)
    (emit 'putstatic *this-class* g +lisp-object+)
    (setf *static-code* *code*)
    g))

(defun declare-load-time-value (obj)
  (let* ((g (symbol-name (gensym)))
         (*print-level* nil)
         (*print-length* nil)
         (s (sys::%format nil "~S" obj))
         (*code* *static-code*))
    (declare-field g +lisp-object+)
    (emit 'ldc (pool-string s))
    (emit-invokestatic +lisp-class+ "readObjectFromString"
                       (list +java-string+) +lisp-object+)
    (emit-invokestatic +lisp-class+ "loadTimeValue"
                       (list +lisp-object+) +lisp-object+)
    (emit 'putstatic *this-class* g +lisp-object+)
    (setf *static-code* *code*)
    g))

(defun declare-structure (obj)
  (aver (not (null *compile-file-truename*)))
  (aver (sys::structure-object-p obj))
  (multiple-value-bind (creation-form initialization-form)
      (make-load-form obj)
    (let* ((g (symbol-name (gensym)))
           (*print-level* nil)
           (*print-length* nil)
           (s (sys::%format nil "~S" creation-form))
           (*code* *static-code*))
      (declare-field g +lisp-object+)
      (emit 'ldc (pool-string s))
      (emit-invokestatic +lisp-class+ "readObjectFromString"
                         (list +java-string+) +lisp-object+)
      (emit-invokestatic +lisp-class+ "loadTimeValue"
                         (list +lisp-object+) +lisp-object+)
      (emit 'putstatic *this-class* g +lisp-object+)
      (setf *static-code* *code*)
      g)))

(defun declare-package (obj)
  (let* ((g (symbol-name (gensym)))
         (*print-level* nil)
         (*print-length* nil)
         (s (sys::%format nil "#.(FIND-PACKAGE ~S)" (package-name obj)))
         (*code* *static-code*))
    (declare-field g +lisp-object+)
    (emit 'ldc (pool-string s))
    (emit-invokestatic +lisp-class+ "readObjectFromString"
                       (list +java-string+) +lisp-object+)
    (emit 'putstatic *this-class* g +lisp-object+)
    (setf *static-code* *code*)
    g))

(defun declare-object (obj)
  (let ((key (symbol-name (gensym))))
    (sys::remember key obj)
    (let* ((g1 (declare-string key))
           (g2 (symbol-name (gensym)))
           (*code* *static-code*))
      (declare-field g2 +lisp-object+)
      (emit 'getstatic *this-class* g1 +lisp-string+)
      (emit-invokestatic +lisp-class+ "recall"
                         (list +lisp-simple-string+) +lisp-object+)
      (emit 'putstatic *this-class* g2 +lisp-object+)
      (setf *static-code* *code*)
      g2)))

(defun declare-lambda (obj)
  (let* ((g (symbol-name (gensym)))
         (*print-level* nil)
         (*print-length* nil)
         (s (sys::%format nil "~S" obj))
         (*code* *static-code*))
    (declare-field g +lisp-object+)
    (emit 'ldc
          (pool-string s))
    (emit-invokestatic +lisp-class+ "readObjectFromString"
                       (list +java-string+) +lisp-object+)
    (emit-invokestatic +lisp-class+ "coerceToFunction"
                       (list +lisp-object+) +lisp-object+)
    (emit 'putstatic *this-class* g +lisp-object+)
    (setf *static-code* *code*)
    g))

(defun declare-local-function (local-function)
  (let* ((g (symbol-name (gensym)))
         (pathname (class-file-pathname (local-function-class-file local-function)))
         (*code* *static-code*))
    (declare-field g +lisp-object+)
    (emit 'ldc (pool-string (file-namestring pathname)))
    (emit-invokestatic +lisp-class+ "loadCompiledFunction"
                       (list +java-string+) +lisp-object+)
    (emit 'putstatic *this-class* g +lisp-object+)
    (setf *static-code* *code*)
    g))

(defun declare-string (string)
  (let ((g (gethash string *declared-strings*)))
    (unless g
      (let ((*code* *static-code*))
        (setf g (symbol-name (gensym)))
        (declare-field g +lisp-simple-string+)
        (emit 'new +lisp-simple-string-class+)
        (emit 'dup)
        (emit 'ldc (pool-string string))
        (emit-invokespecial-init +lisp-simple-string-class+ (list +java-string+))
        (emit 'putstatic *this-class* g +lisp-simple-string+)
        (setf *static-code* *code*)
        (setf (gethash string *declared-strings*) g)))
    g))

(defun compile-constant (form &key (target :stack) representation)
  (unless target
    (return-from compile-constant))
  (when (eq representation :unboxed-fixnum)
    (cond ((fixnump form)
           (emit-push-constant-int form)
           (emit-move-from-stack target)
           (return-from compile-constant))
          (t
           (assert nil))))
  (cond ((numberp form)
         (if (fixnump form)
             (let* ((n form)
                    (translations '(( 0 . "ZERO")
                                    ( 1 . "ONE")
                                    ( 2 . "TWO")
                                    ( 3 . "THREE")
                                    (-1 . "MINUS_ONE")))
                    (translation (cdr (assoc n translations))))
               (if translation
                   (emit 'getstatic +lisp-fixnum-class+ translation +lisp-fixnum+)
                   (emit 'getstatic *this-class* (declare-fixnum n) +lisp-fixnum+)))
             (emit 'getstatic *this-class*
                   (declare-object-as-string form) +lisp-object+)))
        ((stringp form)
         (if *compile-file-truename*
             (emit 'getstatic *this-class*
                   (declare-string form) +lisp-simple-string+)
             (emit 'getstatic *this-class*
                   (declare-object form) +lisp-object+)))
        ((vectorp form)
         (if *compile-file-truename*
             (emit 'getstatic *this-class*
                   (declare-object-as-string form) +lisp-object+)
             (emit 'getstatic *this-class*
                   (declare-object form) +lisp-object+)))
        ((characterp form)
         (emit 'getstatic *this-class*
               (declare-object-as-string form) +lisp-object+))
        ((or (classp form) (hash-table-p form) (typep form 'generic-function))
         (emit 'getstatic *this-class*
               (declare-object form) +lisp-object+))
        ((pathnamep form)
         (let ((g (if *compile-file-truename*
                      (declare-object-as-string form)
                      (declare-object form))))
           (emit 'getstatic *this-class* g +lisp-object+)))
        ((packagep form)
         (let ((g (if *compile-file-truename*
                      (declare-package form)
                      (declare-object form))))
           (emit 'getstatic *this-class* g +lisp-object+)))
        ((sys::structure-object-p form)
         (let ((g (if *compile-file-truename*
                      (declare-structure form)
                      (declare-object form))))
           (emit 'getstatic *this-class* g +lisp-object+)))
        (t
         (if *compile-file-truename*
             (error "COMPILE-CONSTANT unhandled case ~S" form)
             (emit 'getstatic *this-class*
                   (declare-object form) +lisp-object+))))
  (emit-move-from-stack target))

(defparameter unary-operators (make-hash-table :test 'eq))

(defun define-unary-operator (operator translation)
  (setf (gethash operator unary-operators) translation))

(defun initialize-unary-operators ()
  (dolist (pair '((ABS             "ABS")
                  (ATOM            "ATOM")
                  (BIT-VECTOR-P    "BIT_VECTOR_P")
                  (CADR            "cadr")
                  (CAR             "car")
                  (CDDR            "cddr")
                  (CDR             "cdr")
                  (CHARACTERP      "CHARACTERP")
                  (CLASS-OF        "classOf")
                  (COMPLEXP        "COMPLEXP")
                  (CONSTANTP       "CONSTANTP")
                  (DENOMINATOR     "DENOMINATOR")
                  (ENDP            "ENDP")
                  (EVENP           "EVENP")
                  (FIRST           "car")
                  (FLOATP          "FLOATP")
                  (INTEGERP        "INTEGERP")
                  (LENGTH          "LENGTH")
                  (LISTP           "LISTP")
                  (MINUSP          "MINUSP")
                  (NREVERSE        "nreverse")
                  (NUMBERP         "NUMBERP")
                  (NUMERATOR       "NUMERATOR")
                  (ODDP            "ODDP")
                  (PLUSP           "PLUSP")
                  (RATIONALP       "RATIONALP")
                  (REALP           "REALP")
                  (REST            "cdr")
                  (SECOND          "cadr")
                  (SIMPLE-STRING-P "SIMPLE_STRING_P")
                  (STRING          "STRING")
                  (STRINGP         "STRINGP")
                  (SYMBOLP         "SYMBOLP")
                  (VECTORP         "VECTORP")))
    (define-unary-operator (first pair) (second pair))))

(initialize-unary-operators)

(defun compile-function-call-1 (op args target representation)
  (let ((arg (first args)))
    (when (eq op '1+)
      (return-from compile-function-call-1 (p2-plus (list '+ arg 1)
                                                    :target target
                                                    :representation representation)))
    (when (eq op '1-)
      (return-from compile-function-call-1 (p2-minus (list '- arg 1)
                                                     :target target
                                                     :representation representation)))
    (let ((s (gethash op unary-operators)))
      (cond (s
             (compile-form arg :target :stack)
             (maybe-emit-clear-values arg)
             (emit-invoke-method s target representation)
             t)
            ((eq op 'LIST)
             (emit 'new +lisp-cons-class+)
             (emit 'dup)
             (compile-form arg :target :stack)
             (maybe-emit-clear-values arg)
             (emit-invokespecial-init +lisp-cons-class+ (list +lisp-object+))
             (emit-move-from-stack target)
             t)
            (t
             nil)))))

(defparameter binary-operators (make-hash-table :test 'eq))

(defun define-binary-operator (operator translation)
  (setf (gethash operator binary-operators) translation))

(defun initialize-binary-operators ()
  (dolist (pair '((EQL                 "EQL")
                  (EQUAL               "EQUAL")
                  (+                   "add")
                  (-                   "subtract")
                  (/                   "divideBy")
                  (*                   "multiplyBy")
                  (<                   "IS_LT")
                  (<=                  "IS_LE")
                  (>                   "IS_GT")
                  (>=                  "IS_GE")
                  ( =                  "IS_E")
                  (/=                  "IS_NE")
                  (ASH                 "ash")
                  (LOGAND              "logand")
                  (AREF                "AREF")
                  (SYS::SIMPLE-TYPEP   "typep")
                  (RPLACA              "RPLACA")
                  (RPLACD              "RPLACD")))
    (define-binary-operator (first pair) (second pair))))

(initialize-binary-operators)

(defun compile-binary-operation (op args target representation)
  (compile-form (first args) :target :stack)
  (compile-form (second args) :target :stack)
  (unless (and (single-valued-p (first args))
               (single-valued-p (second args)))
    (emit-clear-values))
  (emit-invokevirtual +lisp-object-class+ op (list +lisp-object+) +lisp-object+)
  (when (eq representation :unboxed-fixnum)
    (emit-unbox-fixnum))
  (emit-move-from-stack target))

(defun compile-function-call-2 (op args target representation)
  (let ((translation (gethash op binary-operators))
        (first (first args))
        (second (second args)))
    (if translation
        (compile-binary-operation translation args target representation)
        (case op
          (EQ
           (compile-form first :target :stack)
           (compile-form second :target :stack)
           (unless (and (single-valued-p first)
                        (single-valued-p second))
             (emit-clear-values))
           (let ((label1 (gensym))
                 (label2 (gensym)))
             (emit 'if_acmpeq `,label1)
             (emit-push-nil)
             (emit 'goto `,label2)
             (emit 'label `,label1)
             (emit-push-t)
             (emit 'label `,label2))
           (emit-move-from-stack target)
           t)
          (LIST
           (compile-form first :target :stack)
           (compile-form second :target :stack)
           (unless (and (single-valued-p first)
                        (single-valued-p second))
             (emit-clear-values))
           (emit-invokestatic +lisp-class+ "list2"
                              (list +lisp-object+ +lisp-object+) +lisp-cons+)
           (emit-move-from-stack target)
           t)
          (SYS::%STRUCTURE-REF
           (when (fixnump second)
             (compile-form first :target :stack)
             (maybe-emit-clear-values first)
             (emit 'sipush second)
             (emit-invokevirtual +lisp-object-class+ "getSlotValue"
                                 '("I") +lisp-object+)
             (when (eq representation :unboxed-fixnum)
               (emit-unbox-fixnum))
             (emit-move-from-stack target representation)
             t))
          (t
           nil)))))

(defun fixnum-or-unboxed-variable-p (arg)
  (or (fixnump arg)
      (unboxed-fixnum-variable arg)))

(defun emit-push-int (arg)
  (if (fixnump arg)
      (emit-push-constant-int arg)
      (let ((variable (unboxed-fixnum-variable arg)))
        (if variable
            (emit 'iload (variable-register variable))
            (aver nil)))))

(defun emit-push-long (arg)
  (cond ((eql arg 0)
         (emit 'lconst_0))
        ((eql arg 1)
         (emit 'lconst_1))
        ((fixnump arg)
         (emit-push-constant-int arg)
         (emit 'i2l))
        (t
         (let ((variable (unboxed-fixnum-variable arg)))
           (aver (not (null variable)))
           (aver (not (null (variable-register variable))))
           (emit 'iload (variable-register variable))
           (emit 'i2l)))))

(defun p2-eql (form &key (target :stack) representation)
  (unless (check-arg-count form 2)
    (compile-function-call form target representation)
    (return-from p2-eql))
  (let ((arg1 (second form))
        (arg2 (third form)))
    (cond ((and (fixnum-or-unboxed-variable-p arg1)
                (fixnum-or-unboxed-variable-p arg2))
           (emit-push-int arg1)
           (emit-push-int arg2)
           (let ((label1 (gensym))
                 (label2 (gensym)))
             (emit 'if_icmpeq `,label1)
             (emit-push-nil)
             (emit 'goto `,label2)
             (emit 'label `,label1)
             (emit-push-t)
             (emit 'label `,label2))
           (emit-move-from-stack target))
          ((fixnum-or-unboxed-variable-p arg1)
           (emit-push-int arg1)
           (compile-form arg2 :target :stack)
           (maybe-emit-clear-values arg2)
           (emit 'swap)
           (emit-invokevirtual +lisp-object-class+ "eql" '("I") "Z")
           (let ((label1 (gensym))
                 (label2 (gensym)))
             (emit 'ifne `,label1)
             (emit-push-nil)
             (emit 'goto `,label2)
             (emit 'label `,label1)
             (emit-push-t)
             (emit 'label `,label2))
           (emit-move-from-stack target))
          ((fixnum-or-unboxed-variable-p arg2)
           (compile-form arg1 :target :stack)
           (maybe-emit-clear-values arg1)
           (emit-push-int arg2)
           (emit-invokevirtual +lisp-object-class+ "eql" '("I") "Z")
           (let ((label1 (gensym))
                 (label2 (gensym)))
             (emit 'ifne `,label1)
             (emit-push-nil)
             (emit 'goto `,label2)
             (emit 'label `,label1)
             (emit-push-t)
             (emit 'label `,label2))
           (emit-move-from-stack target))
          (t
           (compile-form arg1 :target :stack)
           (compile-form arg2 :target :stack)
           (unless (and (single-valued-p arg1)
                        (single-valued-p arg2))
             (emit-clear-values))
           (emit-invokevirtual +lisp-object-class+ "EQL"
                               (list +lisp-object+) +lisp-object+)
           (emit-move-from-stack target)))))

(defun compile-function-call-3 (op args target)
  (case op
    (LIST
     (compile-form (first args) :target :stack)
     (compile-form (second args) :target :stack)
     (compile-form (third args) :target :stack)
     (unless (every 'single-valued-p args)
       (emit-clear-values))
     (emit-invokestatic +lisp-class+ "list3"
                        (list +lisp-object+ +lisp-object+ +lisp-object+)
                        +lisp-cons+)
     (emit-move-from-stack target)
     t)
    (SYS::%STRUCTURE-SET
     (when (fixnump (second args))
       (compile-form (first args) :target :stack)
       (maybe-emit-clear-values (first args))
       (emit 'sipush (second args))
       (compile-form (third args) :target :stack)
       (maybe-emit-clear-values (third args))
       (emit-invokevirtual +lisp-object-class+ "setSlotValue"
                           (list "I" +lisp-object+) +lisp-object+)
       (emit-move-from-stack target)
       t))
    (t
     nil)))

(defvar *defined-functions*)

(defvar *undefined-functions*)

(defun note-name-defined (name)
  (when (boundp '*defined-functions*)
    (push name *defined-functions*))
  (when (boundp '*undefined-functions*)
    (setf *undefined-functions* (remove name *undefined-functions*))))

(defvar *functions-defined-in-current-file* nil)

(defsubst notinline-p (name)
  (declare (optimize speed))
  (eq (get name '%inline) 'NOTINLINE))

(defun inline-ok (name)
  (declare (optimize speed))
  (cond ((notinline-p name)
         nil)
        ((sys:built-in-function-p name)
         t)
        ((memq name *functions-defined-in-current-file*)
         t)
        (t
         nil)))

(defun unsafe-p (args)
  (cond ((node-p args)
         (unsafe-p (node-form args)))
        ((atom args)
         nil)
        (t
         (case (car args)
           (QUOTE
            nil)
           (LAMBDA
            nil)
           ((RETURN-FROM GO CATCH THROW UNWIND-PROTECT BLOCK)
            t)
           (t
            (dolist (arg args)
              (when (unsafe-p arg)
                (return t))))))))

(defun rewrite-function-call (form)
  (let ((args (cdr form)))
    (if (unsafe-p args)
        (let ((syms ())
              (lets ()))
          ;; Preserve the order of evaluation of the arguments!
          (dolist (arg args)
            (if (constantp arg)
                (push arg syms)
                (let ((sym (gensym)))
                  (push sym syms)
                  (push (list sym arg) lets))))
          (list 'LET* (nreverse lets) (list* (car form) (nreverse syms))))
        form)))

(defun process-args (args)
  (let ((numargs (length args)))
    (when (plusp numargs)
      (let ((must-clear-values nil))
        (cond ((<= numargs +arg-count-max+)
               (dolist (arg args)
                 (compile-form arg :target :stack)
                 (unless must-clear-values
                   (unless (single-valued-p arg)
                     (setf must-clear-values t)))))
              (t
               (emit 'sipush numargs)
               (emit 'anewarray +lisp-object-class+)
               (let ((i 0))
                 (dolist (arg args)
                   (emit 'dup)
                   (emit 'sipush i)
                   (compile-form arg :target :stack)
                   (emit 'aastore) ; store value in array
                   (unless must-clear-values
                     (unless (single-valued-p arg)
                       (setf must-clear-values t)))
                   (incf i)))))
        (when must-clear-values
          (emit-clear-values))))))

(defun emit-call-execute (numargs)
  (let ((arg-types (if (<= numargs +arg-count-max+)
                       (make-list numargs :initial-element +lisp-object+)
                       (list +lisp-object-array+)))
        (return-type +lisp-object+))
    (emit-invokevirtual +lisp-object-class+ "execute" arg-types return-type)))

(defun emit-call-thread-execute (numargs)
  (let ((arg-types (if (<= numargs +arg-count-max+)
                       (make-list (1+ numargs) :initial-element +lisp-object+)
                       (list +lisp-object+ +lisp-object-array+)))
        (return-type +lisp-object+))
    (emit-invokevirtual +lisp-thread-class+ "execute" arg-types return-type)))

(defun compile-function-call (form target representation)
  (dformat t "compile-function-call ~S representation = ~S~%" (car form) representation)
  (let ((op (car form))
        (args (cdr form)))
    (unless (symbolp op)
      (error "COMPILE-FUNCTION-CALL ~S is not a symbol" op))
    (when (find-local-function op)
      (return-from compile-function-call
                   (compile-local-function-call form target representation)))
    (when (and (boundp '*defined-functions*) (boundp '*undefined-functions*))
      (unless (or (fboundp op)
                  (eq op (compiland-name *current-compiland*))
                  (memq op *defined-functions*))
        (pushnew op *undefined-functions*)))
    (let ((numargs (length args)))
      (case (length args)
        (1
         (when (compile-function-call-1 op args target representation)
           (return-from compile-function-call)))
        (2
         (when (compile-function-call-2 op args target representation)
           (return-from compile-function-call)))
        (3
         (when (compile-function-call-3 op args target)
           (return-from compile-function-call))))
      (unless (> *speed* *debug*)
        (emit-push-current-thread))
      (cond ((eq op (compiland-name *current-compiland*)) ; recursive call
             (if (notinline-p op)
                 (emit 'getstatic *this-class* (declare-symbol op) +lisp-symbol+)
                 (emit 'aload 0)))
            ((inline-ok op)
             (emit 'getstatic *this-class* (declare-function op) +lisp-object+))
            ((null (symbol-package op))
             (let ((g (if *compile-file-truename*
                          (declare-object-as-string op)
                          (declare-object op))))
               (emit 'getstatic *this-class* g +lisp-object+)))
            (t
             (emit 'getstatic *this-class* (declare-symbol op) +lisp-symbol+)))
      (process-args args)
      (if (> *speed* *debug*)
          (emit-call-execute numargs)
          (emit-call-thread-execute numargs))
      (when (eq representation :unboxed-fixnum)
        (emit-unbox-fixnum))
      (emit-move-from-stack target))))

(defun compile-call (args)
  (let ((numargs (length args)))
    (cond ((> *speed* *debug*)
           (process-args args)
           (emit-call-execute numargs))
          (t
           (emit-push-current-thread)
           (emit 'swap) ; Stack: thread function
           (process-args args)
           (emit-call-thread-execute numargs)))))

(sys::define-source-transform funcall (&whole form fun &rest args)
  (cond ((> *debug* *speed*)
         form)
        ((and (consp fun)
              (eq (car fun) 'FUNCTION)
              (symbolp (cadr fun)))
         `(,(cadr fun) ,@args))
        ((and (consp fun)
              (eq (car fun) 'QUOTE))
         (let ((sym (cadr fun)))
           (if (and (symbolp sym)
                    (eq (symbol-package sym) (find-package "CL"))
                    (not (special-operator-p sym))
                    (not (macro-function sym)))
               `(,(cadr fun) ,@args)
               form)))
        (t
         form)))

(defun compile-funcall (form &key (target :stack) representation)
  (unless (> (length form) 1)
    (compiler-style-warn "Wrong number of arguments for ~A." (car form))
    (compile-function-call form target representation))
  (when (> *debug* *speed*)
    (return-from compile-funcall (compile-function-call form target representation)))
  (compile-form (cadr form) :target :stack)
  (maybe-emit-clear-values (cadr form))
  (compile-call (cddr form))
  (emit-move-from-stack target))

(defun save-variables (variables)
  (let ((saved-vars '()))
    (dolist (variable variables)
      (when (variable-closure-index variable)
        (let ((register (allocate-register)))
          (emit 'aload (compiland-closure-register *current-compiland*))
          (emit-push-constant-int (variable-closure-index variable))
          (emit 'aaload)
          (emit 'astore register)
          (push (cons variable register) saved-vars))))
    saved-vars))

(defun restore-variables (saved-vars)
  (dolist (saved-var saved-vars)
    (let ((variable (car saved-var))
          (register (cdr saved-var)))
      (emit 'aload (compiland-closure-register *current-compiland*))
      (emit-push-constant-int (variable-closure-index variable))
      (emit 'aload register)
      (emit 'aastore))))

(defun compile-local-function-call (form target representation)
  (let* ((compiland *current-compiland*)
         (op (car form))
         (args (cdr form))
         (local-function (find-local-function op))
         (*register* *register*)
         (saved-vars '()))
    (cond ((eq (local-function-compiland local-function) compiland)
           ;; Recursive call.
           (dformat t "compile-local-function-call recursive case~%")
           (setf saved-vars
                 (save-variables (compiland-arg-vars (local-function-compiland local-function))))
           (emit 'aload_0))
          ((local-function-variable local-function)
           ;; LABELS
           (dformat t "compile-local-function-call LABELS case~%")
           (dformat t "save args here: ~S~%"
                    (mapcar #'variable-name
                            (compiland-arg-vars (local-function-compiland local-function))))
           (unless (null (compiland-parent compiland))
             (setf saved-vars
                   (save-variables (compiland-arg-vars (local-function-compiland local-function)))))
           (emit 'var-ref (local-function-variable local-function) :stack))
          (t
           (dformat t "compile-local-function-call default case~%")
           (let* ((g (if *compile-file-truename*
                         (declare-local-function local-function)
                         (declare-object (local-function-function local-function)))))
             (emit 'getstatic *this-class* g +lisp-object+)))) ; Stack: template-function

    (when *closure-variables*
      (emit 'checkcast +lisp-ctf-class+))

    (when *closure-variables*
      ;; First arg is closure variable array.
      (aver (not (null (compiland-closure-register compiland))))
      (emit 'aload (compiland-closure-register compiland)))
    (let ((must-clear-values nil))
      (cond ((> (length args) +arg-count-max+)
             (emit-push-constant-int (length args))
             (emit 'anewarray "org/armedbear/lisp/LispObject")
             (let ((i 0))
               (dolist (arg args)
                 (emit 'dup)
                 (emit-push-constant-int i)
                 (compile-form arg :target :stack)
                 (emit 'aastore) ; store value in array
                 (unless must-clear-values
                   (unless (single-valued-p arg)
                     (setf must-clear-values t)))
                 (incf i)))) ; array left on stack here
            (t
             (dolist (arg args)
               (compile-form arg :target :stack)
               (unless must-clear-values
                 (unless (single-valued-p arg)
                   (setf must-clear-values t)))))) ; args left on stack here
      (when must-clear-values
        (emit-clear-values)))

    (if *closure-variables*
        (let* ((arg-count (length args))
               (arg-types (if (<= arg-count +arg-count-max+)
                              (list* +lisp-object-array+
                                     (make-list arg-count :initial-element +lisp-object+))
                              (list +lisp-object-array+ +lisp-object-array+)))
               (result-type +lisp-object+))
          (emit-invokevirtual +lisp-ctf-class+ "execute" arg-types result-type))
        ;; No closure variables.
        (let* ((arg-count (length args))
               (arg-types (if (<= arg-count +arg-count-max+)
                              (make-list arg-count :initial-element +lisp-object+)
                              (list +lisp-object-array+)))
               (result-type +lisp-object+))
          (emit-invokevirtual +lisp-object-class+ "execute" arg-types result-type)))

    (when (eq representation :unboxed-fixnum)
      (emit-unbox-fixnum))
    (emit-move-from-stack target representation)
    (when saved-vars
      (restore-variables saved-vars))))

(defparameter java-predicates (make-hash-table :test 'eq))

(defun define-java-predicate (predicate translation)
  (setf (gethash predicate java-predicates) translation))

(defun initialize-java-predicates ()
  (dolist (pair '((CHARACTERP         "characterp")
                  (CONSTANTP          "constantp")
                  (ENDP               "endp")
                  (EVENP              "evenp")
                  (FLOATP             "floatp")
                  (INTEGERP           "integerp")
                  (LISTP              "listp")
                  (MINUSP             "minusp")
                  (NUMBERP            "numberp")
                  (ODDP               "oddp")
                  (PLUSP              "plusp")
                  (RATIONALP          "rationalp")
                  (REALP              "realp")
                  (STRINGP            "stringp")
                  (SPECIAL-VARIABLE-P "isSpecialVariable")
                  (VECTORP            "vectorp")
                  (ZEROP              "zerop")))
    (define-java-predicate (car pair) (cadr pair))))

(initialize-java-predicates)

(defun compile-test-2 (form negatep)
  (let* ((op (car form))
         (args (cdr form))
         (arg (car args))
         variable)
    (when (memq op '(NOT NULL))
      (return-from compile-test-2 (compile-test arg (not negatep))))
;;     (when (setf variable (unboxed-fixnum-variable arg))
;;       (case op
;;         (MINUSP
;;          (dformat t "compile-test-2 minusp case~%")
;;          (aver (variable-register variable))
;;          (emit 'iload (variable-register variable))
;;          (return-from compile-test-2 (if negatep 'iflt 'ifge)))))
    (when (subtypep (derive-type arg) 'FIXNUM)
      (case op
        (MINUSP
         (dformat t "compile-test-2 minusp case~%")
         (compile-form arg :target :stack :representation :unboxed-fixnum)
         (return-from compile-test-2 (if negatep 'iflt 'ifge)))
        (ZEROP
         (dformat t "compile-test-2 zerop case~%")
         (compile-form arg :target :stack :representation :unboxed-fixnum)
         (return-from compile-test-2 (if negatep 'ifeq 'ifne)))))
    (when (eq op 'SYMBOLP)
      (process-args args)
      (emit 'instanceof +lisp-symbol-class+)
      (return-from compile-test-2 (if negatep 'ifne 'ifeq)))
    (when (eq op 'FIXNUMP)
      (process-args args)
      (emit 'instanceof +lisp-fixnum-class+)
      (return-from compile-test-2 (if negatep 'ifne 'ifeq)))
    (when (eq op 'CONSP)
      (process-args args)
      (emit 'instanceof +lisp-cons-class+)
      (return-from compile-test-2 (if negatep 'ifne 'ifeq)))
    (when (eq op 'ATOM)
      (process-args args)
      (emit 'instanceof +lisp-cons-class+)
      (return-from compile-test-2 (if negatep 'ifeq 'ifne)))
    (let ((s (gethash op java-predicates)))
      (when s
        (process-args args)
        (emit-invokevirtual +lisp-object-class+ s nil "Z")
        (return-from compile-test-2 (if negatep 'ifne 'ifeq)))))
  ;; Otherwise...
  (compile-form form :target :stack)
  (maybe-emit-clear-values form)
  (emit-push-nil)
  (if negatep 'if_acmpne 'if_acmpeq))

(defun p2-numeric-comparison (form &key (target :stack) representation)
  (let ((op (car form))
        (args (cdr form)))
    (case (length args)
      (2
       (dformat t "p2-numeric-comparison form = ~S~%" form)
       (let ((first (first args))
             (second (second args))
             var1 var2)
         (cond ((and (fixnump first) (fixnump second))
                (if (funcall op first second)
                    (emit-push-t)
                    (emit-push-nil))
                (emit-move-from-stack target)
                (return-from p2-numeric-comparison))
               ((and (setf var1 (unboxed-fixnum-variable first))
                     (setf var2 (unboxed-fixnum-variable second)))
                (dformat t "p2-numeric-comparison both unboxed var case form = ~S~%" form)
                (let ((LABEL1 (gensym))
                      (LABEL2 (gensym)))
                  (emit 'iload (variable-register var1))
                  (emit 'iload (variable-register var2))
                  (emit (case op
                          (<  'if_icmpge)
                          (<= 'if_icmpgt)
                          (>  'if_icmple)
                          (>= 'if_icmplt)
                          (=  'if_icmpne)
                          (/= 'if_icmpeq))
                        LABEL1)
                  (emit-push-t)
                  (emit 'goto LABEL2)
                  (label LABEL1)
                  (emit-push-nil)
                  (label LABEL2)
                  (emit-move-from-stack target)
                  (return-from p2-numeric-comparison)))
               ((and (subtypep (derive-type first) 'FIXNUM)
                     (subtypep (derive-type second) 'FIXNUM))
                (let ((LABEL1 (gensym))
                      (LABEL2 (gensym)))
                  (compile-form first :target :stack :representation :unboxed-fixnum)
                  (compile-form second :target :stack :representation :unboxed-fixnum)
                  (unless (and (single-valued-p first) (single-valued-p second))
                    (emit-clear-values))
                  (emit (case op
                          (<  'if_icmpge)
                          (<= 'if_icmpgt)
                          (>  'if_icmple)
                          (>= 'if_icmplt)
                          (=  'if_icmpne)
                          (/= 'if_icmpeq))
                        LABEL1)
                  (emit-push-t)
                  (emit 'goto LABEL2)
                  (label LABEL1)
                  (emit-push-nil)
                  (label LABEL2)
                  (emit-move-from-stack target)
                  (return-from p2-numeric-comparison)))
               ((fixnump second)
                (compile-form first :target :stack)
                (maybe-emit-clear-values first)
                (emit-push-constant-int second)
                (emit-invokevirtual +lisp-object-class+
                                    (case op
                                      (<  "isLessThan")
                                      (<= "isLessThanOrEqualTo")
                                      (>  "isGreaterThan")
                                      (>= "isGreaterThanOrEqualTo")
                                      (=  "isEqualTo")
                                      (/= "isNotEqualTo"))
                                    '("I")
                                    "Z")
                ;; Java boolean on stack here
                (let ((LABEL1 (gensym))
                      (LABEL2 (gensym)))
                  (emit 'ifeq LABEL1)
                  (emit-push-t)
                  (emit 'goto LABEL2)
                  (label LABEL1)
                  (emit-push-nil)
                  (label LABEL2)
                  (emit-move-from-stack target))
                (return-from p2-numeric-comparison))
               )))))
  ;; Still here?
  (compile-function-call form target representation))

(defun compile-test-3 (form negatep)
  (let ((op (car form))
        (args (cdr form)))
    (when (eq op 'EQ)
      (process-args args)
      (return-from compile-test-3 (if negatep 'if_acmpeq 'if_acmpne)))
    (let* ((arg1 (first args))
           (arg2 (second args))
           (var1 (unboxed-fixnum-variable arg1))
           (var2 (unboxed-fixnum-variable arg2)))
      (when (memq op '(< <= > >= = /=))
        (when (and (arg-is-fixnum-p arg1)
                   (arg-is-fixnum-p arg2))
          (emit-push-int arg1)
          (emit-push-int arg2)
          (case op
            (<
             (return-from compile-test-3 (if negatep 'if_icmplt 'if_icmpge)))
            (<=
             (return-from compile-test-3 (if negatep 'if_icmple 'if_icmpgt)))
            (>
             (return-from compile-test-3 (if negatep 'if_icmpgt 'if_icmple)))
            (>=
             (return-from compile-test-3 (if negatep 'if_icmpge 'if_icmplt)))
            (=
             (return-from compile-test-3 (if negatep 'if_icmpeq 'if_icmpne)))
            (/=
             (return-from compile-test-3 (if negatep 'if_icmpne 'if_icmpeq)))
            ))

        ;; Otherwise...
        (when (arg-is-fixnum-p arg2)
          (compile-form arg1 :target :stack)
          (maybe-emit-clear-values arg1)
          (emit-push-int arg2)
          (emit-invokevirtual +lisp-object-class+
                              (case op
                                (<  "isLessThan")
                                (<= "isLessThanOrEqualTo")
                                (>  "isGreaterThan")
                                (>= "isGreaterThanOrEqualTo")
                                (=  "isEqualTo")
                                (/= "isNotEqualTo"))
                              '("I")
                              "Z")
          (return-from compile-test-3 (if negatep 'ifne 'ifeq))))

      (when (eq op '<)
          (when var1
            (dformat t "compile-test-3 unboxed fixnum var1 comparison case~%")
            (aver (variable-register var1))
            (emit 'iload (variable-register var1))
            (compile-form arg2 :target :stack)
            (emit 'swap)
            (emit-invokevirtual +lisp-object-class+
                                "isGreaterThan"
                                '("I")
                                "Z")
            (return-from compile-test-3 (if negatep 'ifne 'ifeq)))))

    (let ((s (cdr (assq op
                        '((=      . "isEqualTo")
                          (/=     . "isNotEqualTo")
                          (<      . "isLessThan")
                          (<=     . "isLessThanOrEqualTo")
                          (>      . "isGreaterThan")
                          (>=     . "isGreaterThanOrEqualTo")
                          (EQL    . "eql")
                          (EQUAL  . "equal")
                          (EQUALP . "equalp"))))))
      (when s
        (let ((first (first args))
              (second (second args))
              variable)
          (cond ((fixnump second)
                 (compile-form first :target :stack)
                 (maybe-emit-clear-values first)
                 (emit-push-constant-int second)
                 (emit-invokevirtual +lisp-object-class+ s '("I") "Z"))
                ((setf variable (unboxed-fixnum-variable second))
                 (compile-form first :target :stack)
                 (maybe-emit-clear-values first)
                 (aver (variable-register variable))
                 (emit 'iload (variable-register variable))
                 (emit-invokevirtual +lisp-object-class+ s '("I") "Z"))
                (t
                 (process-args args)
                 (emit-invokevirtual +lisp-object-class+ s (list +lisp-object+) "Z")))
          (return-from compile-test-3 (if negatep 'ifne 'ifeq))))))

  ;; Otherwise...
  (compile-form form :target :stack)
  (maybe-emit-clear-values form)
  (emit-push-nil)
  (if negatep 'if_acmpne 'if_acmpeq))

(defun compile-test (form negatep)
  ;; Use a Java boolean if possible.
  (when (and (consp form)
             (not (special-operator-p (car form))))
    (case (length form)
      (2
       (return-from compile-test (compile-test-2 form negatep)))
      (3
       (return-from compile-test (compile-test-3 form negatep)))))
  ;; Otherwise...
  (compile-form form :target :stack)
  (maybe-emit-clear-values form)
  (emit-push-nil)
  (if negatep 'if_acmpne 'if_acmpeq))

(defun compile-if (form &key (target :stack) representation)
  (let* ((test (second form))
         (consequent (third form))
         (alternate (fourth form))
         (LABEL1 (gensym))
         (LABEL2 (gensym)))
    (cond ((eq test t)
           (compile-form consequent :target target :representation representation))
          ((null test)
           (compile-form alternate :target target :representation representation))
          ((numberp test)
           (compile-form consequent :target target :representation representation))
          (t
           (emit (compile-test test nil) LABEL1)
           (compile-form consequent :target target :representation representation)
           (emit 'goto LABEL2)
           (label LABEL1)
           (compile-form alternate :target target :representation representation)
           (label LABEL2)))))

(defun compile-multiple-value-list (form &key (target :stack) representation)
  (emit-clear-values)
  (compile-form (second form) :target :stack)
  (emit-invokestatic +lisp-class+ "multipleValueList"
                     (list +lisp-object+) +lisp-object+)
  (emit-move-from-stack target))

(defun compile-multiple-value-prog1 (form &key (target :stack) representation)
  (let ((first-subform (cadr form))
        (subforms (cddr form))
        (result-register (allocate-register))
        (values-register (allocate-register)))
    ;; Make sure there are no leftover values from previous calls.
    (emit-clear-values)
    (compile-form first-subform :target result-register)
    ;; Save multiple values returned by first subform.
    (emit-push-current-thread)
    (emit 'getfield +lisp-thread-class+ "_values" "[Lorg/armedbear/lisp/LispObject;")
    (emit 'astore values-register)
    (dolist (subform subforms)
      (compile-form subform :target nil))
    ;; Restore multiple values returned by first subform.
    (emit-push-current-thread)
    (emit 'aload values-register)
    (emit 'putfield +lisp-thread-class+ "_values" "[Lorg/armedbear/lisp/LispObject;")
    ;; Result.
    (emit 'aload result-register)
    (emit-move-from-stack target)))

(defun compile-multiple-value-call (form &key (target :stack) representation)
  (case (length form)
    (1
     (error "Wrong number of arguments for MULTIPLE-VALUE-CALL."))
    (2
     (compile-form (second form) :target :stack)
     (emit-invokestatic +lisp-class+ "coerceToFunction"
                        (list +lisp-object+) +lisp-object+)
     (emit-invokevirtual +lisp-object-class+ "execute" nil +lisp-object+)
     (emit-move-from-stack target))
    (3
     (let* ((*register* *register*)
            (function-register (allocate-register)))
       (compile-form (second form) :target function-register)
       (compile-form (third form) :target :stack)
       (emit 'aload function-register)
       (emit-push-current-thread)
       (emit-invokestatic +lisp-class+ "multipleValueCall1"
                          (list +lisp-object+ +lisp-object+ +lisp-thread+)
                          +lisp-object+)
       (emit-move-from-stack target)))
    (t
     ;; The general case.
     (let* ((*register* *register*)
            (function-register (allocate-register))
            (values-register (allocate-register)))
       (compile-form (second form) :target :stack)
       (emit-invokestatic +lisp-class+ "coerceToFunction"
                          (list +lisp-object+) +lisp-object+)
       (emit-move-from-stack function-register)
       (emit 'aconst_null)
       (emit 'astore values-register)
       (dolist (values-form (cddr form))
         (compile-form values-form :target :stack)
         (emit-push-current-thread)
         (emit 'swap)
         (emit 'aload values-register)
         (emit-invokevirtual +lisp-thread-class+ "accumulateValues"
                             (list +lisp-object+ +lisp-object-array+)
                             +lisp-object-array+)
         (emit 'astore values-register)
         (maybe-emit-clear-values values-form))
       (emit 'aload function-register)
       (emit 'aload values-register)
       (emit-invokevirtual +lisp-object-class+ "dispatch"
                           (list +lisp-object-array+) +lisp-object+)
       (emit-move-from-stack target)))))

;; Generates code to bind variable to value at top of runtime stack.
(defun compile-binding (variable)
  (cond ((variable-register variable)
         (emit 'astore (variable-register variable)))
        ((variable-special-p variable)
         (emit-push-current-thread)
         (emit 'swap)
         (emit 'getstatic *this-class*
               (declare-symbol (variable-name variable)) +lisp-symbol+)
         (emit 'swap)
         (emit-invokevirtual +lisp-thread-class+ "bindSpecial"
                             (list +lisp-symbol+ +lisp-object+) nil))
        ((variable-closure-index variable)
         (emit 'aload (compiland-closure-register *current-compiland*))
         (emit 'swap) ; array value
         (emit-push-constant-int (variable-closure-index variable))
         (emit 'swap) ; array index value
         (emit 'aastore))
        (t
         (aver nil))))

(defun p2-m-v-b-node (block target)
  (let* ((*blocks* (cons block *blocks*))
         (*register* *register*)
         (form (block-form block))
         (*visible-variables* *visible-variables*)
         (specials ())
         (vars (second form))
         (bind-special-p nil)
         (variables (block-vars block)))
    (dolist (variable variables)
      (let ((special-p (variable-special-p variable)))
        (cond (special-p
               (setf bind-special-p t))
              (t
               (unless (variable-closure-index variable)
                 (setf (variable-register variable) (allocate-register)))))))
    ;; If we're going to bind any special variables...
    (when bind-special-p
      (dformat t "p2-m-v-b-node lastSpecialBinding~%")
      ;; Save current dynamic environment.
      (setf (block-environment-register block) (allocate-register))
      (emit-push-current-thread)
      (emit 'getfield +lisp-thread-class+ "lastSpecialBinding" +lisp-special-binding+)
      (emit 'astore (block-environment-register block)))
    ;; Make sure there are no leftover values from previous calls.
    (emit-clear-values)
    ;; Bind the variables.
    (aver (= (length vars) (length variables)))
    (cond ((= (length vars) 1)
           (compile-form (third form) :target :stack)
           (maybe-emit-clear-values (third form))
           (compile-binding (car variables)))
          (t
           (let* ((*register* *register*)
                  (result-register (allocate-register))
                  (values-register (allocate-register))
                  (LABEL1 (gensym))
                  (LABEL2 (gensym)))
             ;; Store primary value from values form in result register.
             (compile-form (third form) :target result-register)
             ;; Store values from values form in values register.
             (emit-push-current-thread)
             (emit 'getfield +lisp-thread-class+ "_values" "[Lorg/armedbear/lisp/LispObject;")
             (emit-move-from-stack values-register)
             ;; Did we get just one value?
             (emit 'aload values-register)
             (emit 'ifnull LABEL1)
             ;; Reaching here, we have multiple values (or no values at all). We need
             ;; the slow path if we have more variables than values.
             (emit 'aload values-register)
             (emit 'arraylength)
             (emit 'bipush (length vars))
             (emit 'if_icmplt LABEL1)
             ;; Reaching here, we have enough values for all the variables. We can use
             ;; the values we have. This is the fast path.
             (emit 'aload values-register)
             (emit 'goto LABEL2)
             (label LABEL1)
             (emit-push-current-thread)
             (emit 'aload result-register)
             (emit 'bipush (length vars))
             (emit-invokevirtual +lisp-thread-class+ "getValues"
                                 (list +lisp-object+ "I") +lisp-object-array+)
             ;; Values array is now on the stack at runtime.
             (label LABEL2)
             (let ((index 0))
               (dolist (variable variables)
                 (when (< index (1- (length vars)))
                   (emit 'dup))
                 (emit 'bipush index)
                 (incf index)
                 (emit 'aaload)
                 ;; Value is on the runtime stack at this point.
                 (compile-binding variable)))
             (maybe-emit-clear-values (third form)))))
    ;; Make the variables visible for the body forms.
    (dolist (variable variables)
      (push variable *visible-variables*))
    ;; Body.
    (compile-progn-body (cdddr form) target)
    (when bind-special-p
      ;; Restore dynamic environment.
      (emit 'aload *thread*)
      (emit 'aload (block-environment-register block))
      (emit 'putfield +lisp-thread-class+ "lastSpecialBinding" +lisp-special-binding+))))

(defun p2-let/let*-node (block target)
  (let* ((*blocks* (cons block *blocks*))
         (*register* *register*)
         (form (block-form block))
         (*visible-variables* *visible-variables*)
         (specialp nil))
    ;; Are we going to bind any special variables?
    (dolist (variable (block-vars block))
      (when (variable-special-p variable)
        (setf specialp t)
        (return)))
    ;; If so...
    (when specialp
      (dformat t "p2-let/let*-node lastSpecialBinding~%")
      ;; Save current dynamic environment.
      (setf (block-environment-register block) (allocate-register))
      (emit-push-current-thread)
      (emit 'getfield +lisp-thread-class+ "lastSpecialBinding" +lisp-special-binding+)
      (emit 'astore (block-environment-register block)))
    (ecase (car form)
      (LET
       (p2-let-bindings block))
      (LET*
       (p2-let*-bindings block)))
    ;; Make declarations of free specials visible.
    (dolist (variable (block-free-specials block))
      (push variable *visible-variables*))
    ;; Body of LET/LET*.
    (compile-progn-body (cddr form) target)
    (when specialp
      ;; Restore dynamic environment.
      (emit 'aload *thread*)
      (emit 'aload (block-environment-register block))
      (emit 'putfield +lisp-thread-class+ "lastSpecialBinding" +lisp-special-binding+))))

(defun p2-let-bindings (block)
  (dolist (variable (block-vars block))
    (unless (variable-special-p variable)
      (unless (variable-closure-index variable)
        (setf (variable-register variable) (allocate-register)))))
  (let ((*register* *register*)
        (must-clear-values nil))
    ;; Evaluate each initform. If the variable being bound is special, allocate
    ;; a temporary register for the result; LET bindings must be done in
    ;; parallel, so we can't modify any specials until all the initforms have
    ;; been evaluated. Note that we can't just push the values on the stack
    ;; because we'll lose JVM stack consistency if there is a non-local
    ;; transfer of control from one of the initforms.
    (dolist (variable (block-vars block))
      (dformat t "variable = ~S writes = ~S~%" (variable-name variable) (variable-writes variable))
      (let ((initform (variable-initform variable)))
        (cond (initform
               (cond ((and *trust-user-type-declarations*
                           (variable-register variable)
                           (variable-declared-type variable)
                           (subtypep (variable-declared-type variable) 'FIXNUM))
                      (dformat t "p2-let-bindings declared fixnum case: ~S~%"
                               (variable-name variable))
                      (setf (variable-representation variable) :unboxed-fixnum)
                      (compile-form initform :target :stack :representation :unboxed-fixnum))
                     ((and (variable-register variable)
                           (eql (variable-writes variable) 0)
                           (subtypep (derive-type initform) 'FIXNUM))
                      (dformat t "p2-let-bindings read-only fixnum case: ~S~%"
                               (variable-name variable))
                      (setf (variable-representation variable) :unboxed-fixnum)
                      (compile-form initform :target :stack :representation :unboxed-fixnum))
                     (t
                      (compile-form initform :target :stack)))
               (unless must-clear-values
                 (unless (single-valued-p initform)
                   (setf must-clear-values t))))
              (t
               (emit-push-nil)))
        (cond ((variable-special-p variable)
               (emit-move-from-stack (setf (variable-temp-register variable) (allocate-register))))
              ((eq (variable-representation variable) :unboxed-fixnum)
               (emit 'istore (variable-register variable)))
              (t
               (compile-binding variable)))))
    (when must-clear-values
      (emit-clear-values))
    ;; Now that all the initforms have been evaluated, move the results from
    ;; the temporary registers (if any) to their proper destinations.
    (dolist (variable (block-vars block))
      (when (variable-temp-register variable)
        (aver (variable-special-p variable))
        (emit 'aload (variable-temp-register variable))
        (compile-binding variable))))
  ;; Now make the variables visible.
  (dolist (variable (block-vars block))
    (push variable *visible-variables*)))

(defun p2-let*-bindings (block)
  (let ((must-clear-values nil))
    ;; Generate code to evaluate initforms and bind variables.
    (dolist (variable (block-vars block))
      (let* ((initform (variable-initform variable))
             (boundp nil))
        (cond ((and (variable-special-p variable)
                    (eq initform (variable-name variable)))
               (emit-push-current-thread)
               (emit 'getstatic *this-class*
                     (declare-symbol (variable-name variable)) +lisp-symbol+)
               (emit-invokevirtual +lisp-thread-class+
                                   "bindSpecialToCurrentValue"
                                   (list +lisp-symbol+)
                                   nil)
               (setf boundp t))
              (initform
               (cond ((and *trust-user-type-declarations*
                           (null (variable-closure-index variable))
                           (not (variable-special-p variable))
                           (variable-declared-type variable)
                           (subtypep (variable-declared-type variable) 'FIXNUM))
                      (dformat t "p2-let*-bindings declared fixnum case~%")
                      (setf (variable-representation variable) :unboxed-fixnum)
                      (compile-form initform :target :stack :representation :unboxed-fixnum)
                      (setf (variable-register variable) (allocate-register))
                      (emit 'istore (variable-register variable))
                      (setf boundp t))
                     ((and (null (variable-closure-index variable))
                           (not (variable-special-p variable))
                           (eql (variable-writes variable) 0)
                           (subtypep (derive-type initform) 'FIXNUM))
                      (dformat t "p2-let*-bindings read-only fixnum case: ~S~%"
                               (variable-name variable))
                      (setf (variable-representation variable) :unboxed-fixnum)
                      (compile-form initform :target :stack :representation :unboxed-fixnum)
                      (setf (variable-register variable) (allocate-register))
                      (emit 'istore (variable-register variable))
                      (setf boundp t))
                     (t
                      (compile-form initform :target :stack)))
               (unless must-clear-values
                 (unless (single-valued-p initform)
                   (setf must-clear-values t))))
              (t
               (emit-push-nil)))
        (unless (variable-special-p variable)
          (unless (or (variable-closure-index variable) (variable-register variable))
            (setf (variable-register variable) (allocate-register))))
        (push variable *visible-variables*)
        (unless boundp
          (compile-binding variable))))
    (when must-clear-values
      (emit-clear-values))))

(defun compile-locally (form &key (target :stack) representation)
  (let ((*visible-variables* *visible-variables*)
        (specials (precompiler::process-special-declarations (cdr form))))
    (dolist (var specials)
      (push (make-variable :name var :special-p t) *visible-variables*))
    (cond ((null (cdr form))
           (when target
             (emit-push-nil)
             (emit-move-from-stack target)))
          (t
           (do ((forms (cdr form) (cdr forms)))
               ((null forms))
             (compile-form (car forms) :target (if (cdr forms) nil target)))))))

(defun find-tag (name)
  (dolist (tag *visible-tags*)
    (when (eql name (tag-name tag))
      (return tag))))

(defun p2-tagbody-node (block target)
  (let* ((*blocks* (cons block *blocks*))
         (*visible-tags* *visible-tags*)
         (*register* *register*)
         (form (block-form block))
         (body (cdr form))
         (local-tags ())
         (BEGIN-BLOCK (gensym))
         (END-BLOCK (gensym))
         (EXIT (gensym))
         environment-register
         (must-clear-values nil))
    ;; Scan for tags.
    (dolist (subform body)
      (when (or (symbolp subform) (integerp subform))
        (let* ((tag (make-tag :name subform :label (gensym) :block block)))
          (push tag local-tags)
          (push tag *visible-tags*))))
    (when (block-non-local-go-p block)
      (dformat t "p2-tagbody-node lastSpecialBinding~%")
      (setf environment-register (allocate-register))
      (emit-push-current-thread)
      (emit 'getfield +lisp-thread-class+ "lastSpecialBinding" +lisp-special-binding+)
      (emit 'astore environment-register))
    (label BEGIN-BLOCK)
    (do* ((rest body (cdr rest))
          (subform (car rest) (car rest)))
         ((null rest))
      (cond ((or (symbolp subform) (integerp subform))
             (let ((tag (find-tag subform)))
               (unless tag
                 (error "COMPILE-TAGBODY: tag not found: ~S~%" subform))
               (label (tag-label tag))))
            (t
             (when (and (null (cdr rest)) ;; Last subform.
                        (consp subform)
                        (eq (car subform) 'GO))
               (maybe-generate-interrupt-check))
             (compile-form subform :target nil)
             (unless must-clear-values
               (unless (single-valued-p subform)
                 (setf must-clear-values t))))))
    (label END-BLOCK)
    (emit 'goto EXIT)
    (when (block-non-local-go-p block)
      ; We need a handler to catch non-local GOs.
      (let* ((HANDLER (gensym))
             (*register* *register*)
             (go-register (allocate-register))
             (tag-register (allocate-register)))
        (label HANDLER)
        ;; The Go object is on the runtime stack. Stack depth is 1.
        (emit 'dup)
        (emit 'astore go-register)
        ;; Get the tag.
        (emit 'checkcast +lisp-go-class+)
        (emit 'getfield +lisp-go-class+ "tag" +lisp-object+) ; Stack depth is still 1.
        (emit 'astore tag-register)
        (dolist (tag local-tags)
          (let ((NEXT (gensym)))
            (emit 'aload tag-register)
            (emit 'getstatic *this-class*
                  (if *compile-file-truename*
                      (declare-object-as-string (tag-label tag))
                      (declare-object (tag-label tag)))
                  +lisp-object+)
            (emit 'if_acmpne NEXT) ;; Jump if not EQ.
            ;; Restore dynamic environment.
            (emit-push-current-thread)
            (aver (fixnump environment-register))
            (emit 'aload environment-register)
            (emit 'putfield +lisp-thread-class+ "lastSpecialBinding" +lisp-special-binding+)
            (emit 'goto (tag-label tag))
            (label NEXT)))
        ;; Not found. Re-throw Go.
        (emit 'aload go-register)
        (emit 'athrow)
        ;; Finally...
        (push (make-handler :from BEGIN-BLOCK
                            :to END-BLOCK
                            :code HANDLER
                            :catch-type (pool-class +lisp-go-class+))
              *handlers*)))
    (label EXIT)
    (when must-clear-values
      (emit-clear-values))
    ;; TAGBODY returns NIL.
    (when target
      (emit-push-nil)
      (emit-move-from-stack target))))

(defun p2-go (form &key target representation)
  (let* ((name (cadr form))
         (tag (find-tag name)))
    (unless tag
      (error "p2-go: tag not found: ~S" name))
    (when (eq (tag-compiland tag) *current-compiland*)
      ;; Local case.
      (let* ((tag-block (tag-block tag))
             (register nil)
             (protected
              ;; Does the GO leave an enclosing UNWIND-PROTECT?
              (dolist (enclosing-block *blocks*)
                (when (eq enclosing-block tag-block)
                  (return nil))
                (when (equal (block-name enclosing-block) '(UNWIND-PROTECT))
                  (return t)))))
        (unless protected
          (dolist (block *blocks*)
            (if (eq block tag-block)
                (return)
                (setf register (or (block-environment-register block) register))))
          (when register
            ;; Restore dynamic environment.
            (emit 'aload *thread*)
            (emit 'aload register)
            (emit 'putfield +lisp-thread-class+ "lastSpecialBinding" +lisp-special-binding+))

          ;; FIXME Not exactly the right place for this, but better than nothing.
;;           (maybe-generate-interrupt-check)

          (emit 'goto (tag-label tag))
          (return-from p2-go))))

    ;; Non-local GO.
    (emit 'new +lisp-go-class+)
    (emit 'dup)
    (compile-form `',(tag-label tag) :target :stack) ; Tag.
    (emit-invokespecial-init +lisp-go-class+ (list +lisp-object+))
    (emit 'athrow)
    ;; Following code will not be reached, but is needed for JVM stack
    ;; consistency.
    (when target
      (emit-push-nil)
      (emit-move-from-stack target))))

(defun p2-atom (form &key (target :stack) representation)
  (unless (check-arg-count form 1)
    (compile-function-call form target representation)
    (return-from p2-atom))
  (compile-form (cadr form) :target :stack)
  (maybe-emit-clear-values (cadr form))
  (emit 'instanceof +lisp-cons-class+)
  (let ((LABEL1 (gensym))
        (LABEL2 (gensym)))
    (emit 'ifeq LABEL1)
    (emit-push-nil)
    (emit 'goto LABEL2)
    (label LABEL1)
    (emit-push-t)
    (label LABEL2)
    (emit-move-from-stack target)))

(defun p2-block-node (block target)
  (unless (block-node-p block)
    (sys::%format t "type-of block = ~S~%" (type-of block))
    (aver (block-node-p block)))
  (let* ((*blocks* (cons block *blocks*))
         (*register* *register*))
    (setf (block-target block) target)
    (when (block-return-p block)
      (dformat t "p2-block-node lastSpecialBinding~%")
      (dformat t "*all-variables* = ~S~%" (mapcar #'variable-name *all-variables*))
      (cond ((some #'variable-special-p *all-variables*)
;;              Save current dynamic environment.
             (setf (block-environment-register block) (allocate-register))
             (emit-push-current-thread)
             (emit 'getfield +lisp-thread-class+ "lastSpecialBinding" +lisp-special-binding+)
             (emit 'astore (block-environment-register block)))
            (t
             (dformat t "no specials~%"))))
    (setf (block-catch-tag block) (gensym))
    (let* ((*register* *register*)
           (BEGIN-BLOCK (gensym))
           (END-BLOCK (gensym))
           (BLOCK-EXIT (block-exit block)))
      (label BEGIN-BLOCK) ; Start of protected range.
      ;; Implicit PROGN.
      (compile-progn-body (cddr (block-form block)) target)
      (label END-BLOCK) ; End of protected range.
      (emit 'goto BLOCK-EXIT) ; Jump over handler (if any).
      (when (block-non-local-return-p block)
        ; We need a handler to catch non-local RETURNs.
        (let ((HANDLER (gensym))
              (RETHROW (gensym)))
          (label HANDLER)
          ;; The Return object is on the runtime stack. Stack depth is 1.
          (emit 'dup) ; Stack depth is 2.
          (emit 'getfield +lisp-return-class+ "tag" +lisp-object+) ; Still 2.
          (compile-form `',(block-catch-tag block) :target :stack) ; Tag. Stack depth is 3.
          ;; If it's not the tag we're looking for...
          (emit 'if_acmpne RETHROW) ; Stack depth is 1.
          (emit 'getfield +lisp-return-class+ "result" +lisp-object+)
          (emit-move-from-stack target) ; Stack depth is 0.
          (emit 'goto BLOCK-EXIT)
          (label RETHROW)
          ;; Not the tag we're looking for.
          (emit 'athrow)
          ;; Finally...
          (push (make-handler :from BEGIN-BLOCK
                              :to END-BLOCK
                              :code HANDLER
                              :catch-type (pool-class +lisp-return-class+))
                *handlers*)))
      (label BLOCK-EXIT))
    (when (block-environment-register block)
      ;; We saved the dynamic environment above. Restore it now.
      (emit 'aload *thread*)
      (emit 'aload (block-environment-register block))
      (emit 'putfield +lisp-thread-class+ "lastSpecialBinding" +lisp-special-binding+))))

(defun p2-return-from (form &key (target :stack) representation)
  (let* ((name (second form))
         (result-form (third form))
         (block (find-block name)))
    (when (null block)
      (error "No block named ~S is currently visible." name))

    (dformat t "p2-return-from block = ~S~%" (block-name block))

    (when (eq (block-compiland block) *current-compiland*)
      (dformat t "p2-return-from *blocks* = ~S~%" (mapcar #'block-name *blocks*))
      ;; Local case. Is the RETURN nested inside an UNWIND-PROTECT which
      ;; is inside the block we're returning from?
      (let ((protected
             (dolist (enclosing-block *blocks*)
               (when (eq enclosing-block block)
                 (return nil))
               (when (equal (block-name enclosing-block) '(UNWIND-PROTECT))
                 (return t)))))
        (dformat t "p2-return-from protected = ~S~%" protected)
        (unless protected
          (emit-clear-values)
          (compile-form result-form :target (block-target block))
          (emit 'goto (block-exit block))
          (return-from p2-return-from))))

    ;; Non-local RETURN.
    (aver (block-non-local-return-p block))
    (cond ((node-constant-p result-form)
           (emit 'new +lisp-return-class+)
           (emit 'dup)
           (compile-form `',(block-catch-tag block) :target :stack) ; Tag.
           (emit-clear-values)
           (compile-form result-form :target :stack)) ; Result.
          (t
           (let* ((*register* *register*)
                  (temp-register (allocate-register)))
             (emit-clear-values)
             (compile-form result-form :target temp-register) ; Result.
             (emit 'new +lisp-return-class+)
             (emit 'dup)
             (compile-form `',(block-catch-tag block) :target :stack) ; Tag.
             (emit 'aload temp-register))))
    (emit-invokespecial-init +lisp-return-class+ (list +lisp-object+ +lisp-object+))
    (emit 'athrow)
    ;; Following code will not be reached, but is needed for JVM stack
    ;; consistency.
    (when target
      (emit-push-nil)
      (emit-move-from-stack target))))

(defun p2-cons (form &key (target :stack) representation)
  (unless (check-arg-count form 2)
    (compile-function-call form target representation)
    (return-from p2-cons))
  (emit 'new +lisp-cons-class+)
  (emit 'dup)
  (process-args (cdr form))
  (emit-invokespecial-init +lisp-cons-class+ (list +lisp-object+ +lisp-object+))
  (emit-move-from-stack target))

(defun compile-progn-body (body target)
  (cond ((null body)
         (when target
           (emit-push-nil)
           (emit-move-from-stack target)))
        (t
         (let ((must-clear-values nil))
           (do* ((forms body (cdr forms))
                 (form (car forms) (car forms)))
                ((null forms))
             (when (null (cdr forms))
               ;; Last form.
               (when must-clear-values
                 (emit-clear-values)))
             (compile-form form :target (if (cdr forms) nil target))
             (unless (null (cdr forms))
               (unless must-clear-values
                 (unless (single-valued-p form)
                   (setf must-clear-values t)))))))))

(defun compile-progn (form &key (target :stack) representation)
  (compile-progn-body (cdr form) target)
  (when (eq representation :unboxed-fixnum)
    (emit-unbox-fixnum)))

(defun p2-eval-when (form &key (target :stack) representation)
  (cond ((or (memq :execute (cadr form))
             (memq 'eval (cadr form)))
         (compile-progn-body (cddr form) target)
         (when (eq representation :unboxed-fixnum)
           (emit-unbox-fixnum)))
        (t
         (emit-push-nil)
         (emit-move-from-stack target))))

(defun p2-load-time-value (form &key (target :stack) representation)
  (cond (*compile-file-truename*
         (emit 'getstatic *this-class*
               (declare-load-time-value (second form)) +lisp-object+))
        (t
         (compile-constant (eval (second form))
                           :target target
                           :representation representation))))

(defun compile-quote (form &key (target :stack) representation)
   (let ((obj (second form)))
     (cond ((null obj)
            (when target
              (emit-push-nil)
              (emit-move-from-stack target)))
           ((symbolp obj)
            (if (symbol-package obj)
                (let ((g (declare-symbol obj)))
                  (emit 'getstatic *this-class* g +lisp-symbol+))
                ;; An uninterned symbol.
                (let ((g (if *compile-file-truename*
                             (declare-object-as-string obj)
                             (declare-object obj))))
                  (emit 'getstatic *this-class* g +lisp-object+)))
            (emit-move-from-stack target))
           ((listp obj)
            (let ((g (if *compile-file-truename*
                         (declare-object-as-string obj)
                         (declare-object obj))))
              (emit 'getstatic *this-class* g +lisp-object+)
              (emit-move-from-stack target)))
           ((constantp obj)
            (compile-constant obj :target target))
           (t
            (compiler-unsupported "COMPILE-QUOTE: unsupported case: ~S" form)))))

(defun p2-rplacd (form &key (target :stack) representation)
  (unless (check-arg-count form 2)
    (compile-function-call form target representation)
    (return-from p2-rplacd))
  (let ((args (cdr form)))
    (compile-form (first args) :target :stack)
    (when target
      (emit 'dup))
    (compile-form (second args) :target :stack)
    (emit-invokevirtual +lisp-object-class+
                        "setCdr"
                        (list +lisp-object+)
                        nil)
    (when target
      (emit-move-from-stack target))))

(defun p2-set-car/cdr (form &key (target :stack) representation)
  (unless (check-arg-count form 2)
    (compile-function-call form target representation)
    (return-from p2-set-car/cdr))
  (let ((op (car form))
        (args (cdr form)))
    (compile-form (first args) :target :stack)
    (compile-form (second args) :target :stack)
    (when target
      (emit 'dup_x1))
    (emit-invokevirtual +lisp-object-class+
                        (if (eq op 'sys:set-car) "setCar" "setCdr")
                        (list +lisp-object+)
                        nil)
    (when target
      (emit-move-from-stack target))))

(defun compile-declare (form &key target representation)
  (when target
    (emit-push-nil)
    (emit-move-from-stack target)))

(defun p2-local-function (compiland local-function)
  (let ((lambda-list (cadr (compiland-lambda-expression compiland))))
    (when (or (memq '&optional lambda-list)
              (memq '&key lambda-list))
      (let ((state nil))
        (dolist (arg lambda-list)
          (cond ((memq arg lambda-list-keywords)
                 (setf state arg))
                ((memq state '(&optional &key))
                 (when (and (consp arg)
                            (not (constantp (second arg))))
                   (compiler-unsupported "P2-LOCAL-FUNCTION: can't handle optional argument with non-constant initform.")))))))
    (let* ((name (compiland-name compiland))
           form
           function
           pathname
           class-file)
      (setf form (compiland-lambda-expression compiland))
      (setf pathname (if *compile-file-truename*
                         (sys::next-classfile-name)
                         (prog1
                           (sys::%format nil "local-~D.class" *child-count*)
                           (incf *child-count*))))

      (setf class-file (make-class-file :pathname pathname
                                        :lambda-list lambda-list))

      (setf (compiland-class-file compiland) class-file)

      (with-class-file class-file
        (let ((*current-compiland* compiland)
              (*speed* *speed*)
              (*safety* *safety*)
              (*debug* *debug*))
          (p2-compiland compiland)
          (write-class-file (compiland-class-file compiland))
          ))
      (cond (*compile-file-truename*
             ;; Verify that the class file is loadable.
             (let ((*default-pathname-defaults* pathname))
               (unless (ignore-errors (sys:load-compiled-function pathname))
                 (error "P2-LOCAL-FUNCTION: unable to load ~S." pathname))))
            (t (setf function (sys:load-compiled-function pathname))))
      (cond (local-function
             (setf (local-function-class-file local-function) class-file)
             (let ((g (if *compile-file-truename*
                          (declare-local-function local-function)
                          (declare-object function))))
               (emit 'getstatic *this-class* g +lisp-object+)
               (emit 'var-set (local-function-variable local-function))))
            (t
             (push (make-local-function :name name
                                        :function function
                                        :class-file class-file)
                   *local-functions*))))))

(defun p2-flet (form &key (target :stack) representation)
  (let ((*local-functions* *local-functions*)
        (compilands (cadr form))
        (body (cddr form)))
    (dolist (compiland compilands)
      (p2-local-function compiland nil))
    (do ((forms body (cdr forms)))
        ((null forms))
      (compile-form (car forms) :target (if (cdr forms) nil target)))))

(defun p2-labels (form &key target representation)
  (let ((*local-functions* *local-functions*)
        (local-functions (cadr form))
        (body (cddr form)))
    (dolist (local-function local-functions)
      (push local-function *local-functions*)
      (push (local-function-variable local-function) *visible-variables*))
    (dolist (local-function local-functions)
      (let ((variable (local-function-variable local-function)))
        (aver (null (variable-register variable)))
        (unless (variable-closure-index variable)
          (setf (variable-register variable) (allocate-register)))))
    (dolist (local-function local-functions)
      (p2-local-function (local-function-compiland local-function) local-function))
    (do ((forms body (cdr forms)))
        ((null forms))
      (compile-form (car forms) :target (if (cdr forms) nil target)))))

(defun p2-lambda (compiland target)
  (let* ((lambda-list (cadr (compiland-lambda-expression compiland))))
    (when (or (memq '&optional lambda-list)
              (memq '&key lambda-list))
      (let ((state nil))
        (dolist (arg lambda-list)
          (cond ((memq arg lambda-list-keywords)
                 (setf state arg))
                ((memq state '(&optional &key))
                 (when (and (consp arg)
                            (not (constantp (second arg))))
                   (compiler-unsupported
                    "P2-LAMBDA: can't handle optional argument with non-constant initform.")))))))
    (aver (null (compiland-class-file compiland)))
    (setf (compiland-class-file compiland)
          (make-class-file :pathname (if *compile-file-truename*
                                         (sys::next-classfile-name)
                                         (prog1
                                           (sys::%format nil "local-~D.class" *child-count*)
                                           (incf *child-count*)))
                           :lambda-list lambda-list)))
  (with-class-file (compiland-class-file compiland)
    (let ((*current-compiland* compiland)
          (*speed* *speed*)
          (*safety* *safety*)
          (*debug* *debug*))
      (p2-compiland compiland)
      (write-class-file (compiland-class-file compiland))
      ))
  (let ((class-file (compiland-class-file compiland)))
    (emit 'getstatic *this-class*
          (if *compile-file-truename*
              (declare-local-function (make-local-function :class-file class-file))
              (declare-object (sys:load-compiled-function (class-file-pathname class-file))))
          +lisp-object+))
  (cond ((null *closure-variables*)) ; Nothing to do.
        ((compiland-closure-register *current-compiland*)
         (emit 'aload (compiland-closure-register *current-compiland*))
         (emit-invokestatic +lisp-class+ "makeCompiledClosure"
                            (list +lisp-object+ +lisp-object-array+)
                            +lisp-object+)
         (emit 'checkcast +lisp-compiled-closure-class+)) ; Stack: compiled-closure
        (t
         (aver nil))) ;; Shouldn't happen.
  (emit-move-from-stack target))

(defun p2-function (form &key (target :stack) representation)
  (let ((name (second form))
        (local-function))
    (cond ((symbolp name)
           (cond ((setf local-function (find-local-function name))
                  (dformat t "p2-function 1~%")
                  (when (eq (local-function-compiland local-function) *current-compiland*)
                    (emit 'aload 0) ; this
                    (emit-move-from-stack target)
                    (return-from p2-function))
                  (cond ((local-function-variable local-function)
                         (dformat t "p2-function 2~%")
                         (emit 'var-ref (local-function-variable local-function) :stack))
                        (t
                         (let ((g (if *compile-file-truename*
                                      (declare-local-function local-function)
                                      (declare-object (local-function-function local-function)))))
                           (emit 'getstatic *this-class*
                                 g +lisp-object+)))) ; Stack: template-function
                  (cond ((null *closure-variables*)) ; Nothing to do.
                        ((compiland-closure-register *current-compiland*)
                         (dformat t "p2-function 3~%")
                         (emit 'aload (compiland-closure-register *current-compiland*))
                         (emit-invokestatic +lisp-class+ "makeCompiledClosure"
                                            (list +lisp-object+ +lisp-object-array+)
                                            +lisp-object+)) ; Stack: compiled-closure
                        (t
                         (aver (progn 'unexpected nil))))
                  (emit-move-from-stack target))
                 ((inline-ok name)
                  (emit 'getstatic *this-class*
                        (declare-function name) +lisp-object+)
                  (emit-move-from-stack target))
                 (t
                  (emit 'getstatic *this-class*
                        (declare-symbol name) +lisp-symbol+)
                  (emit-invokevirtual +lisp-object-class+ "getSymbolFunctionOrDie"
                                      nil +lisp-object+)
                  (emit-move-from-stack target))))
          ((and (consp name) (eq (car name) 'SETF))
           ; FIXME Need to check for NOTINLINE declaration!
           (cond ((member name *functions-defined-in-current-file* :test #'equal)
                  (emit 'getstatic *this-class*
                        (declare-setf-function name) +lisp-object+)
                  (emit-move-from-stack target))
                 ((and (null *compile-file-truename*)
                       (fdefinition name))
                  (emit 'getstatic *this-class*
                        (declare-object (fdefinition name)) +lisp-object+)
                  (emit-move-from-stack target))
                 (t
                  (emit 'getstatic *this-class*
                        (declare-symbol (cadr name)) +lisp-symbol+)
                  (emit-invokevirtual +lisp-symbol-class+
                                      "getSymbolSetfFunctionOrDie"
                                      nil +lisp-object+)
                  (emit-move-from-stack target))))
          ((compiland-p name)
           (p2-lambda name target))
          (t
           (compiler-unsupported "p2-function: unsupported case: ~S" form)))))

(defun p2-ash (form &key (target :stack) representation)
  (dformat t "p2-ash form = ~S representation = ~S~%" form representation)
  (unless (check-arg-count form 2)
    (compile-function-call form target representation)
    (return-from p2-ash))
  (let* ((args (cdr form))
         (len (length args))
         (arg1 (first args))
         (arg2 (second args))
         (var1 (unboxed-fixnum-variable arg1))
         (var2 (unboxed-fixnum-variable arg2))
         (type1 t))
    (setf type1 (derive-type arg1))
    (dformat t "type1 = ~S~%" type1)
    (cond ((and (numberp arg1) (numberp arg2))
           (dformat t "p2-ash case 1~%")
           (compile-constant (ash arg1 arg2)
                             :target target
                             :representation representation))
          ((and var1 (fixnump arg2) (< 0 arg2 32))
           (dformat t "p2-ash case 2~%")
           (case representation
             (:unboxed-fixnum
              (emit-push-int var1)
              (emit-push-constant-int arg2)
              (emit 'ishl))
             (t
              (emit-push-int var1)
              (emit 'i2l)
              (emit-push-constant-int arg2)
              (emit 'lshl)
              (emit-box-long)))
           (emit-move-from-stack target representation))
          ((and (subtypep type1 'FIXNUM) (fixnump arg2) (< 0 arg2 32))
           (dformat t "p2-ash case 2a~%")
           (compile-form arg1 :target :stack :representation :unboxed-fixnum)
           (case representation
             (:unboxed-fixnum
              (emit-push-constant-int arg2)
              (emit 'ishl))
             (t
              (emit 'i2l)
              (emit-push-constant-int arg2)
              (emit 'lshl)
              (emit-box-long)))
           (emit-move-from-stack target representation))
          ((and var1 (fixnump arg2) (< -32 arg2 0))
           (dformat t "p2-ash case 3~%")
           (unless (eq representation :unboxed-fixnum)
             (emit 'new +lisp-fixnum-class+)
             (emit 'dup))
           (emit-push-int var1)
           (emit-push-constant-int (- arg2))
           (emit 'ishr)
           (unless (eq representation :unboxed-fixnum)
             (emit-invokespecial-init +lisp-fixnum-class+ '("I")))
           (emit-move-from-stack target representation))
          (var2
           (dformat t "p2-ash case 4~%")
           (compile-form arg1 :target :stack)
           (maybe-emit-clear-values arg1)
           (emit 'iload (variable-register var2))
           (emit-invokevirtual +lisp-object-class+ "ash" '("I") +lisp-object+)
           (when (eq representation :unboxed-fixnum)
             (emit-unbox-fixnum))
           (emit-move-from-stack target representation))
          ((fixnump arg2)
           (dformat t "p2-ash case 5~%")
           (compile-form arg1 :target :stack)
           (maybe-emit-clear-values arg1)
           (emit-push-constant-int arg2)
           (emit-invokevirtual +lisp-object-class+ "ash" '("I") +lisp-object+)
           (when (eq representation :unboxed-fixnum)
             (emit-unbox-fixnum))
           (emit-move-from-stack target representation))
          ((eq (derive-type arg2) 'FIXNUM)
           (compile-form arg1 :target :stack)
           (compile-form arg2 :target :stack :representation :unboxed-fixnum)
           (unless (and (single-valued-p arg1)
                        (single-valued-p arg2))
             (emit-clear-values))
           (emit-invokevirtual +lisp-object-class+ "ash" '("I") +lisp-object+)
           (when (eq representation :unboxed-fixnum)
             (emit-unbox-fixnum))
           (emit-move-from-stack target representation))
          (t (dformat t "p2-ash case 6~%")
             (compile-function-call form target representation)))))

(defun p2-logand (form &key (target :stack) representation)
  (let* ((args (cdr form))
         (len (length args)))
    (when (= len 2)
      (let* ((arg1 (first args))
             (arg2 (second args))
             (var1 (unboxed-fixnum-variable arg1)))
        (when (and (fixnump arg1) (not (fixnump arg2)))
          (setf arg1 (second args)
                arg2 (first args)
                var1 (unboxed-fixnum-variable arg1)))
        (dformat t "p2-logand var1 = ~S~%" var1)
        (dformat t "p2-logand type-of arg2 is ~S~%" (type-of arg2))
        (cond ((and (integerp arg1) (integerp arg2))
               (dformat t "p2-logand case 1~%")
               (compile-constant (logand arg1 arg2) :target target :representation representation)
               (return-from p2-logand t))
              ((and var1 (fixnump arg2) (zerop arg2))
               (dformat t "p2-logand case 2~%")
               (compile-constant 0 :target target :representation representation)
               (return-from p2-logand t))
              ((and var1 (fixnump arg2))
               (dformat t "p2-logand case 3~%")
               (unless (eq representation :unboxed-fixnum)
                 (emit 'new +lisp-fixnum-class+)
                 (emit 'dup))
               (emit 'iload (variable-register var1))
               (emit-push-constant-int arg2)
               (emit 'iand)
               (unless (eq representation :unboxed-fixnum)
                 (emit-invokespecial-init +lisp-fixnum-class+ '("I")))
               (emit-move-from-stack target representation)
               (return-from p2-logand t))
              ((fixnump arg2)
               (dformat t "p2-logand case 4~%")
               (let ((type (derive-type arg1)))
                 (dformat t "p2-logand arg1 derived type = ~S~%" type)
                 (cond ((subtypep type 'fixnum)
                        (dformat t "p2-logand case 4a~%")
                        (unless (eq representation :unboxed-fixnum)
                          (emit 'new +lisp-fixnum-class+)
                          (emit 'dup))
                        (compile-form arg1 :target :stack :representation :unboxed-fixnum)
                        (maybe-emit-clear-values arg1)
                        (emit-push-constant-int arg2)
                        (emit 'iand)
                        (unless (eq representation :unboxed-fixnum)
                          (emit-invokespecial-init +lisp-fixnum-class+ '("I")))
                        (emit-move-from-stack target representation))
                       (t (dformat t "p2-logand case 4b~%")
                          (compile-form arg1 :target :stack)
                          (maybe-emit-clear-values arg1)
                          (emit-push-constant-int arg2)
                          (emit-invokevirtual +lisp-object-class+ "logand" '("I") +lisp-object+)
                          (when (eq representation :unboxed-fixnum)
                            (emit-unbox-fixnum))
                          (emit-move-from-stack target representation))))
               (return-from p2-logand t))))))
  (dformat t "p2-logand default case~%")
  (compile-function-call form target representation))

(defun p2-logior (form &key (target :stack) representation)
  (dformat t "p2-logior form = ~S rep = ~S~%" form representation) (finish-output)
  (let* ((args (cdr form))
         (len (length args)))
    (cond ((= len 2)
           (let* ((arg1 (first args))
                  (arg2 (second args))
                  (type1 (derive-type arg1))
                  (type2 (derive-type arg2)))
             (dformat t "type1 = ~S type2 = ~S~%" type1 type2)
             (cond ((and (integerp arg1) (integerp arg2))
                    (compile-constant (logior arg1 arg2) :target target :representation representation)
                    (return-from p2-logior t))
                   ((and (subtypep type1 'fixnum) (subtypep type2 'fixnum))
                    (dformat t "p2-logior case 4~%")
                    (unless (eq representation :unboxed-fixnum)
                      (emit 'new +lisp-fixnum-class+)
                      (emit 'dup))
                    (compile-form arg1 :target :stack :representation :unboxed-fixnum)
                    (compile-form arg2 :target :stack :representation :unboxed-fixnum)
                    (unless (and (single-valued-p arg1)
                                 (single-valued-p arg2))
                      (emit-clear-values))
                    (emit 'ior)
                    (unless (eq representation :unboxed-fixnum)
                      (emit-invokespecial-init +lisp-fixnum-class+ '("I")))
                    (emit-move-from-stack target representation)
                    (return-from p2-logior t)))))
          ((= len 3)
           (dformat t "p2-logior case 5~%")
           ;; (logior a b c) => (logior (logior a b) c)
           (let ((new-form `(LOGIOR (LOGIOR ,(second form) ,(third form)) ,(fourth form))))
             (dformat t "form = ~S~%" form)
             (dformat t "new-form = ~S~%" new-form)
             (p2-logior new-form :target target :representation representation))
           (return-from p2-logior t))))
  (dformat t "p2-logior default case~%")
  (compile-function-call form target representation))

(defun p2-logxor (form &key (target :stack) representation)
  (dformat t "p2-logxor form = ~S rep = ~S~%" form representation) (finish-output)
  (let* ((args (cdr form))
         (len (length args)))
    (cond ((= len 2)
           (let* ((arg1 (first args))
                  (arg2 (second args))
                  (type1 (derive-type arg1))
                  (type2 (derive-type arg2)))
             (dformat t "type1 = ~S type2 = ~S~%" type1 type2)
             (cond ((and (integerp arg1) (integerp arg2))
                    (compile-constant (logxor arg1 arg2) :target target :representation representation)
                    (return-from p2-logxor t))
                   ((and (subtypep type1 'fixnum) (subtypep type2 'fixnum))
                    (dformat t "p2-logxor case 4~%")
                    (unless (eq representation :unboxed-fixnum)
                      (emit 'new +lisp-fixnum-class+)
                      (emit 'dup))
                    (compile-form arg1 :target :stack :representation :unboxed-fixnum)
                    (compile-form arg2 :target :stack :representation :unboxed-fixnum)
                    (unless (and (single-valued-p arg1)
                                 (single-valued-p arg2))
                      (emit-clear-values))
                    (emit 'ixor)
                    (unless (eq representation :unboxed-fixnum)
                      (emit-invokespecial-init +lisp-fixnum-class+ '("I")))
                    (emit-move-from-stack target representation)
                    (return-from p2-logxor t)))))
          ((= len 3)
           (dformat t "p2-logxor case 5~%")
           ;; (logxor a b c) => (logxor (logxor a b) c)
           (let ((new-form `(LOGXOR (LOGXOR ,(second form) ,(third form)) ,(fourth form))))
             (dformat t "form = ~S~%" form)
             (dformat t "new-form = ~S~%" new-form)
             (p2-logxor new-form :target target :representation representation))
           (return-from p2-logxor t))))
  (dformat t "p2-logxor default case~%")
  (compile-function-call form target representation))

(defun p2-mod (form &key (target :stack) representation)
  (unless (check-arg-count form 2)
    (compile-function-call form target representation)
    (return-from p2-mod))
  (let* ((args (cdr form))
         (arg1 (car args))
         (arg2 (cadr args)))
    (cond ((fixnump arg2)
           (compile-form arg1 :target :stack)
           (maybe-emit-clear-values arg1)
           (emit-push-constant-int arg2)
           (emit-invokevirtual +lisp-object-class+ "MOD" '("I") +lisp-object+))
          (t
           (compile-form arg1 :target :stack)
           (compile-form arg2 :target :stack)
           (unless (and (single-valued-p arg1)
                        (single-valued-p arg2))
             (emit-clear-values))
           (emit-invokevirtual +lisp-object-class+ "MOD" (list +lisp-object+) +lisp-object+)))
    (when (eq representation :unboxed-fixnum)
      (emit-unbox-fixnum))
    (emit-move-from-stack target representation)))

(defun p2-zerop (form &key (target :stack) representation)
  (unless (check-arg-count form 1)
    (compile-function-call form target representation)
    (return-from p2-zerop))
  (let* ((arg (cadr form))
         (var (unboxed-fixnum-variable arg)))
    (cond ((subtypep (derive-type arg) 'FIXNUM)
           (compile-form arg :target :stack :representation :unboxed-fixnum)
           (let ((LABEL1 (gensym))
                 (LABEL2 (gensym)))
             (emit 'ifne LABEL1)
             (emit-push-t)
             (emit 'goto LABEL2)
             (label LABEL1)
             (emit-push-nil)
             (label LABEL2)
             (emit-move-from-stack target)))
          (t
           (compile-form arg :target :stack)
           (maybe-emit-clear-values arg)
           (emit-invoke-method "ZEROP" target representation)))))

(defun derive-type (form)
  (cond ((fixnump form)
         (list 'INTEGER form form))
        ((symbolp form)
         (let ((variable (find-visible-variable form)))
           (if variable
               (variable-declared-type variable)
               t)))
        ((consp form)
         (let ((op (first form)))
           (case op
             (ASH
              (ash-derive-type (second form) (third form)))
             (AREF
              (aref-derive-type (cdr form)))
             (-
              (if (and (= (length form) 2)
                       (or (fixnump (cadr form))
                           (unboxed-fixnum-variable (cadr form))))
                  'FIXNUM
                  t))
             (LOGAND
              (logand-derive-type (cdr form)))
             (LOGXOR
              (logxor-derive-type (cdr form)))
             (THE
              (second form))
             (t
              t))))
        (t
         t)))

(defun aref-derive-type (args)
  (let* ((array-arg (car args))
         (array-type (derive-type array-arg))
         (result-type t))
    (dformat t "aref-derive-type array type = ~S~%" array-type)
    (when (and (consp array-type)
               (memq (first array-type) '(ARRAY SIMPLE-ARRAY VECTOR)))
      (let ((element-type (second array-type)))
        (dformat t "element-type = ~S~%" element-type)
        (unless (eq element-type '*)
          (setf result-type element-type))))
    result-type))

(defun logxor-derive-type (args)
  (let ((result-type nil))
    (dolist (arg args)
      (let ((type (derive-type arg)))
        (dformat t "logxor-derive-type arg = ~S type = ~S~%" arg type)
        (unless (subtypep type result-type)
          (setf result-type type))))
    (dformat t "logxor-derive-type returning ~S~%" result-type)
    result-type))

(defun logand-derive-type (args)
  (let ((result-type 'INTEGER))
    (dolist (arg args)
      (let ((type (derive-type arg)))
        (dformat t "logand-derive-type arg = ~S type = ~S~%" arg type)
        (cond ((subtypep type '(UNSIGNED-BYTE 8))
               (unless (subtypep result-type '(UNSIGNED-BYTE 8))
                 (setf result-type '(UNSIGNED-BYTE 8))))
              ((subtypep type '(UNSIGNED-BYTE 16))
               (unless (subtypep result-type '(UNSIGNED-BYTE 16))
                 (setf result-type '(UNSIGNED-BYTE 16))))
              ((subtypep type '(UNSIGNED-BYTE 24))
               (unless (subtypep result-type '(UNSIGNED-BYTE 24))
                 (setf result-type '(UNSIGNED-BYTE 24))))
              ((eq type 'T))
              (t
               (dformat t "logand-derive-type unsupported type ~S~%" type)))))
    (dformat t "logand-derive-type returning ~S~%" result-type)
    result-type))

(defun ash-derive-type (arg1 arg2)
  (dformat t "ash-derive-type ~S ~S~%" arg1 arg2)
  (let* ((type1 (sys::normalize-type (derive-type arg1)))
         (result-type 'INTEGER))
    (dformat t "ash-derive-type type1 = ~S~%" type1)
    (when (subtypep type1 'fixnum)
      (let ((low most-negative-fixnum)
            (high most-positive-fixnum))
        (when (and (consp type1) (eq (car type1) 'INTEGER))
          (let ((second (second type1))
                (third (third type1)))
            (when second
              (setf low (if (atom second) second (1+ (car second)))))
            (when third
              (setf high (if (atom third) third (1- (car third)))))))
        (dformat t "low = ~S high = ~S~%" low high)
        (when (fixnump arg2)
          (cond ((= arg2 0)
                 (setf result-type type1))
                ((<= 1 arg2 32)
                 (setf result-type (list 'INTEGER (ash low 1) (ash high 1))))
                ((minusp arg2)
                 ;; Shift right.
                 (setf result-type 'FIXNUM))))))
    (dformat t "ash-derive-type returning ~S~%" result-type)
    result-type))

(defun p2-length (form &key (target :stack) representation)
  (unless (check-arg-count form 1)
    (compile-function-call form target representation)
    (return-from p2-length))
  (let ((arg (cadr form)))
    (compile-form arg :target :stack)
    (maybe-emit-clear-values arg)
    (cond ((eq representation :unboxed-fixnum)
           (emit-invokevirtual +lisp-object-class+ "length" nil "I"))
          (t
           (emit-invokevirtual +lisp-object-class+ "LENGTH" nil +lisp-object+)))
    (emit-move-from-stack target representation)))

(defun compile-nth (form &key (target :stack) representation)
  (unless (check-arg-count form 2)
    (compile-function-call form target representation)
    (return-from compile-nth))
  (let ((index-form (second form))
        (list-form (third form)))
    (compile-form index-form :target :stack :representation :unboxed-fixnum)
    (compile-form list-form :target :stack)
    (unless (and (single-valued-p index-form)
                 (single-valued-p list-form))
      (emit-clear-values))
    (emit 'swap)
    (emit-invokevirtual +lisp-object-class+ "NTH" '("I") +lisp-object+)
    (when (eq representation :unboxed-fixnum)
      (emit-unbox-fixnum))
    (emit-move-from-stack target representation)))

(defun p2-times (form &key (target :stack) representation)
  (case (length form)
    (3
     (let* ((args (cdr form))
            (arg1 (first args))
            (arg2 (second args)))
       (dformat t "p2-times form = ~S~%" form)
       (when (fixnump arg1)
         (dformat t "p2-times arg1 is a fixnum, swapping...~%")
         (rotatef arg1 arg2)
         (dformat t "arg1 => ~S~%" arg1)
         (dformat t "arg2 => ~S~%" arg2))
       (cond ((fixnump arg2)
              (dformat t "p2-times case 1~%")
              (compile-form arg1 :target :stack)
              (maybe-emit-clear-values arg1)
              (emit-push-int arg2)
              (emit-invokevirtual +lisp-object-class+ "multiplyBy" '("I") +lisp-object+)
              (when (eq representation :unboxed-fixnum)
                (emit-unbox-fixnum))
              (emit-move-from-stack target representation))
             (t
              (dformat t "p2-times default case~%")
              (compile-binary-operation "multiplyBy" args target representation)))))
    (t
     (compile-function-call form target representation))))

(defun p2-plus (form &key (target :stack) representation)
  (case (length form)
    (3
     (let* ((args (cdr form))
            (arg1 (first args))
            (arg2 (second args))
            (var1 (unboxed-fixnum-variable arg1))
            (var2 (unboxed-fixnum-variable arg2))
            (type1 t))
       (dformat t "p2-plus form = ~S~%" form)
       (when (fixnump arg1)
         (dformat t "p2-plus arg1 is a fixnum, swapping...~%")
         (rotatef arg1 arg2)
         (rotatef var1 var2)
         (dformat t "arg1 => ~S~%" arg1)
         (dformat t "arg2 => ~S~%" arg2))
       (cond ((symbolp arg1)
              (let ((variable (find-visible-variable arg1)))
                (when variable
                  (dformat t "found variable for ~S~%" arg1)
                  (setf type1 (variable-declared-type variable)))))
             (t
              (setf type1 (derive-type arg1))))
       (dformat t "p2-plus type1 = ~S~%" type1)
       (cond ((and (numberp arg1) (numberp arg2))
              (compile-constant (+ arg1 arg2)
                                :target target
                                :representation representation))
             ((and var1 var2)
              (dformat t "p2-plus case 1~%")
              (dformat t "target = ~S representation = ~S~%" target representation)
              (aver (variable-register var1))
              (aver (variable-register var2))
              (when target
                (cond ((eq representation :unboxed-fixnum)
                       (emit-push-int var1)
                       (emit-push-int arg2)
                       (emit 'iadd))
                      (t
                       (emit-push-long var1)
                       (emit-push-long var2)
                       (emit 'ladd)
                       (emit-box-long)))
                (emit-move-from-stack target representation)))
             ((and var1 (fixnump arg2))
              (dformat t "p2-plus case 2~%")
              (aver (variable-register var1))
              (cond ((eq representation :unboxed-fixnum)
                     (emit-push-int var1)
                     (emit-push-int arg2)
                     (emit 'iadd))
                    (t
                     (emit-push-long var1)
                     (emit-push-long arg2)
                     (emit 'ladd)
                     (emit-box-long)))
              (emit-move-from-stack target representation))
             ((and (fixnump arg1) var2)
              (dformat t "p2-plus case 3~%")
              (aver (variable-register var2))
              (cond ((eq representation :unboxed-fixnum)
                     (emit-push-int arg1)
                     (emit-push-int var2)
                     (emit 'iadd))
                    (t
                     (emit-push-long arg1)
                     (emit-push-long var2)
                     (emit 'ladd)
                     (emit-box-long)))
              (emit-move-from-stack target representation))
             ((eql arg1 1)
              (dformat t "p2-plus case 4~%")
              (compile-form arg2 :target :stack)
              (maybe-emit-clear-values arg2)
              (emit-invoke-method "incr" target representation))
             ((eql arg2 1)
              (dformat t "p2-plus case 5~%")
              (cond ((and (eq representation :unboxed-fixnum)
                          (subtypep type1 'FIXNUM))
                     (compile-form arg1 :target :stack :representation :unboxed-fixnum)
                     (maybe-emit-clear-values arg1)
                     (emit-push-int 1)
                     (emit 'iadd)
                     (emit-move-from-stack target representation))
                    ((subtypep type1 '(INTEGER #.most-negative-fixnum #.(1- most-positive-fixnum)))
                     (dformat t "p2-plus case 5a~%")
                     (unless (eq representation :unboxed-fixnum)
                       (emit 'new +lisp-fixnum-class+)
                       (emit 'dup))
                     (compile-form arg1 :target :stack :representation :unboxed-fixnum)
                     (maybe-emit-clear-values arg1)
                     (emit-push-int 1)
                     (emit 'iadd)
                     (unless (eq representation :unboxed-fixnum)
                       (emit-invokespecial-init +lisp-fixnum-class+ '("I")))
                     (emit-move-from-stack target representation))
                    (t
                     (compile-form arg1 :target :stack)
                     (maybe-emit-clear-values arg1)
                     (emit-invoke-method "incr" target representation))))
             ((arg-is-fixnum-p arg1)
              (dformat t "p2-plus case 6~%")
              (emit-push-int arg1)
              (compile-form arg2 :target :stack)
              (maybe-emit-clear-values arg2)
              (emit 'swap)
              (emit-invokevirtual +lisp-object-class+ "add" '("I") +lisp-object+)
              (when (eq representation :unboxed-fixnum)
                (emit-unbox-fixnum))
              (emit-move-from-stack target representation))
             ((arg-is-fixnum-p arg2)
              (dformat t "p2-plus case 7~%")
              (compile-form arg1 :target :stack)
              (maybe-emit-clear-values arg1)
              (emit-push-int arg2)
              (emit-invokevirtual +lisp-object-class+ "add" '("I") +lisp-object+)
              (when (eq representation :unboxed-fixnum)
                (emit-unbox-fixnum))
              (emit-move-from-stack target representation))
             ((and (consp arg1)
                   (eq (car arg1) 'THE)
                   (subtypep (cadr arg1) 'FIXNUM)
                   (consp arg2)
                   (eq (car arg2) 'THE)
                   (subtypep (cadr arg2) 'FIXNUM))
              (dformat t "p2-plus case 7b representation = ~S~%" representation)
              (let ((must-clear-values nil))
                (compile-form arg1 :target :stack :representation :unboxed-fixnum)
                (unless (single-valued-p arg1)
                  (dformat t "not single-valued: ~S~%" arg1)
                  (setf must-clear-values t))
                (unless (eq representation :unboxed-fixnum)
                  (emit 'i2l))
                (compile-form arg2 :target :stack :representation :unboxed-fixnum)
                (setf must-clear-values (or must-clear-values
                                            (not (single-valued-p arg2))))
                (cond ((eq representation :unboxed-fixnum)
                       (emit 'iadd))
                      (t
                       (emit 'i2l)
                       (emit 'ladd)
                       (emit-box-long)))
                (when must-clear-values
                  (dformat t "p2-plus case 7b calling emit-clear-values~%")
                  (emit-clear-values))
                (emit-move-from-stack target representation)))
             (t
              (dformat t "p2-plus case 8 ~S~%" form)
              (compile-binary-operation "add" args target representation)))))
    (4
     (dformat t "p2-plus case 9~%")
     ;; (+ a b c) => (+ (+ a b) c)
     (let ((new-form `(+ (+ ,(second form) ,(third form)) ,(fourth form))))
       (dformat t "form = ~S~%" form)
       (dformat t "new-form = ~S~%" new-form)
       (p2-plus new-form :target target :representation representation)))
    (t
     (dformat t "p2-plus case 10~%")
     (compile-function-call form target representation))))

(defun p2-minus (form &key (target :stack) representation)
  (case (length form)
    (2
     (let* ((arg (cadr form))
            (var (unboxed-fixnum-variable arg)))
       (cond (var
              (unless (eq representation :unboxed-fixnum)
                (emit 'new +lisp-fixnum-class+)
                (emit 'dup))
              (emit 'iload (variable-register var))
              (emit 'ineg)
              (unless (eq representation :unboxed-fixnum)
                (emit-invokespecial-init +lisp-fixnum-class+ '("I")))
              (emit-move-from-stack target representation))
             (t
              (compile-function-call form target representation)))))
    (3
     (let* ((args (cdr form))
            (arg1 (first args))
            (arg2 (second args))
            (var1 (unboxed-fixnum-variable arg1))
            (var2 (unboxed-fixnum-variable arg2)))
       (cond ((and (numberp arg1) (numberp arg2))
              (compile-constant (- arg1 arg2)
                                :target target
                                :representation representation))
             ((and var1 var2)
              (dformat t "p2-minus case 1~%")
              (aver (variable-register var1))
              (aver (variable-register var2))
              (when target
                (cond
                 ((eq representation :unboxed-fixnum)
                  (emit 'iload (variable-register var1))
                  (emit 'iload (variable-register var2))
                  (emit 'isub))
                 (t
                  (emit-push-long var1)
                  (emit-push-long var2)
                  (emit 'lsub)
                  (emit-box-long)))
                (emit-move-from-stack target representation)))
             ((and var1 (fixnump arg2))
              (dformat t "p2-minus case 2 ~S ~S~%" form representation)
              (aver (variable-register var1))
              (cond ((eq representation :unboxed-fixnum)
                     (dformat t "p2-minus case 2 ISUB~%")
                     (emit-push-int var1)
                     (emit-push-int arg2)
                     (emit 'isub))
                    (t
                     (dformat t "p2-minus case 2 LSUB~%")
                     (emit-push-long var1)
                     (emit-push-long arg2)
                     (emit 'lsub)
                     (emit-box-long)))
              (emit-move-from-stack target representation))
             ((and (fixnump arg1) var2)
              (dformat t "p2-minus case 3~%")
              (aver (variable-register var2))
              (cond ((eq representation :unboxed-fixnum)
                     (emit-push-int arg1)
                     (emit-push-int var2)
                     (emit 'isub))
                    (t
                     (emit-push-long arg1)
                     (emit-push-long var2)
                     (emit 'lsub)
                     (emit-box-long)))
              (emit-move-from-stack target representation))
             ((eql arg2 1)
              (dformat t "p2-minus case 5 ~S~%" form)
              (cond ((and (eq representation :unboxed-fixnum)
                          (subtypep (derive-type arg1) 'FIXNUM))
                     (compile-form arg1 :target :stack :representation :unboxed-fixnum)
                     (maybe-emit-clear-values arg1)
                     (emit-push-int 1)
                     (emit 'isub)
                     (emit-move-from-stack target representation))
                    (t
                     (compile-form arg1 :target :stack)
                     (maybe-emit-clear-values arg1)
                     (emit-invoke-method "decr" target representation))))
             ((arg-is-fixnum-p arg2)
              (dformat t "p2-minus case 7~%")
              (compile-form arg1 :target :stack)
              (maybe-emit-clear-values arg1)
              (emit-push-int arg2)
              (emit-invokevirtual +lisp-object-class+ "subtract" '("I") +lisp-object+)
              (when (eq representation :unboxed-fixnum)
                (emit-unbox-fixnum))
              (emit-move-from-stack target representation))
             (t
              (dformat t "p2-minus case 8~%")
              (compile-binary-operation "subtract" args target representation)))))
    (4
     (dformat t "p2-minus case 9~%")
     ;; (- a b c) => (- (- a b) c)
     (let ((new-form `(- (- ,(second form) ,(third form)) ,(fourth form))))
       (dformat t "form = ~S~%" form)
       (dformat t "new-form = ~S~%" new-form)
       (p2-minus new-form :target target :representation representation)))
    (t
     (dformat t "p2-minus case 10~%")
     (compile-function-call form target representation))))

(defun p2-schar (form &key (target :stack) representation)
  (unless (check-arg-count form 2)
    (compile-function-call form target representation)
    (return-from p2-schar))
  (compile-form (second form) :target :stack)
  (compile-form (third form) :target :stack :representation :unboxed-fixnum)
  (unless (and (single-valued-p (second form))
               (single-valued-p (third form)))
    (emit-clear-values))
  (emit-invokevirtual +lisp-object-class+ "SCHAR" '("I") +lisp-object+)
  (emit-move-from-stack target))

(defun p2-svref (form &key (target :stack) representation)
  (unless (check-arg-count form 2)
    (compile-function-call form target representation)
    (return-from p2-svref))
  (let ((vector-declared-type t))
    (when (symbolp (second form))
      (let ((variable (find-visible-variable (second form))))
        (when variable
          (setf vector-declared-type (variable-declared-type variable)))))
    (unless (subtypep vector-declared-type 'simple-vector)
      (compile-function-call form target representation)
      (return-from p2-svref))
    (compile-form (second form) :target :stack)
    (compile-form (third form) :target :stack :representation :unboxed-fixnum)
    (unless (and (single-valued-p (second form))
                 (single-valued-p (third form)))
      (emit-clear-values))
    (emit-invokevirtual +lisp-object-class+ "AREF" '("I") +lisp-object+)
    (when (eq representation :unboxed-fixnum)
      (emit-unbox-fixnum))
    (emit-move-from-stack target representation)))

(defun p2-aref (form &key (target :stack) representation)
  ;; We only optimize the 2-arg case.
  (cond ((= (length form) 3)
         (let ((array-declared-type t))
           (when (symbolp (second form))
             (let ((variable (find-visible-variable (second form))))
               (when variable
                 (setf array-declared-type (variable-declared-type variable)))))
           (compile-form (second form) :target :stack)
           (compile-form (third form) :target :stack :representation :unboxed-fixnum)
           (unless (and (single-valued-p (second form))
                        (single-valued-p (third form)))
             (emit-clear-values))
           (cond ((subtypep array-declared-type '(array (unsigned-byte 8)))
                  (emit-invokevirtual +lisp-object-class+ "aref" '("I") "I")
                  (unless (eq representation :unboxed-fixnum)
                    (emit 'i2l)
                    (emit-box-long)))
                 (t
                  (emit-invokevirtual +lisp-object-class+ "AREF" '("I") +lisp-object+)
                  (when (eq representation :unboxed-fixnum)
                    (emit-unbox-fixnum))))
           (emit-move-from-stack target representation)))
        (t
         (compile-function-call form target representation))))

(defun p2-aset (form &key (target :stack) representation)
  ;; We only optimize the 3-arg case.
  (cond ((= (length form) 4)
         (let* ((*register* *register*)
                (value-register (unless (null target) (allocate-register)))
                (array-declared-type t))
           (when (symbolp (second form))
             (let ((variable (find-visible-variable (second form))))
               (when variable
                 (setf array-declared-type (variable-declared-type variable)))))
           ;; array
           (compile-form (second form) :target :stack)
           ;; index
           (compile-form (third form) :target :stack :representation :unboxed-fixnum)
           ;; value
           (cond ((subtypep array-declared-type '(array (unsigned-byte 8)))
                  (compile-form (fourth form) :target :stack
                                :representation :unboxed-fixnum)
                  (when value-register
                    (emit 'dup)
                    (emit-move-from-stack value-register :unboxed-fixnum)))
                 (t
                  (compile-form (fourth form) :target :stack
                                :representation nil)
                  (when value-register
                    (emit 'dup)
                    (emit-move-from-stack value-register nil))))
           (unless (and (single-valued-p (second form))
                        (single-valued-p (third form))
                        (single-valued-p (fourth form)))
             (emit-clear-values))
           (cond ((subtypep array-declared-type '(array (unsigned-byte 8)))
                  (emit-invokevirtual +lisp-object-class+ "aset" '("I" "I") nil))
                 (t
                  (emit-invokevirtual +lisp-object-class+ "aset" (list "I" +lisp-object+) nil)))
           (when value-register
             (cond ((subtypep array-declared-type '(array (unsigned-byte 8)))
                    (emit 'iload value-register)
                    (emit-move-from-stack target :unboxed-fixnum))
                   (t
                    (emit 'aload value-register)
                    (emit-move-from-stack target nil))))))
        (t
         (compile-function-call form target representation))))

(defun p2-not/null (form &key (target :stack) representation)
  (unless (check-arg-count form 1)
    (compile-function-call form target representation)
    (return-from p2-not/null))
  (let ((arg (second form)))
    (cond ((null arg)
           (emit-push-t))
          ((and (constantp arg) (not (block-node-p arg)))
           (emit-push-nil))
          ((and (consp arg)
                (memq (car arg) '(NOT NULL)))
           (compile-form (second arg) :target :stack)
           (maybe-emit-clear-values (second arg))
           (emit-push-nil)
           (let ((label1 (gensym))
                 (label2 (gensym)))
             (emit 'if_acmpeq `,label1)
             (emit-push-t)
             (emit 'goto `,label2)
             (emit 'label `,label1)
             (emit-push-nil)
             (emit 'label `,label2)))
          (t
           (compile-form arg :target :stack)
           (maybe-emit-clear-values arg)
           (emit-push-nil)
           (let ((label1 (gensym))
                 (label2 (gensym)))
             (emit 'if_acmpeq `,label1)
             (emit-push-nil)
             (emit 'goto `,label2)
             (emit 'label `,label1)
             (emit-push-t)
             (emit 'label `,label2)))))
  (emit-move-from-stack target))

(defun compile-values (form &key (target :stack) representation)
  (let ((args (cdr form)))
    (case (length args)
      (1
       (let ((arg (first args)))
         (compile-form arg :target target :representation representation)
         (unless (single-valued-p arg)
           (emit-clear-values))))
      (2
       (emit-push-current-thread)
       (let ((arg1 (first args))
             (arg2 (second args)))
         (cond ((and (eq arg1 t)
                     (eq arg2 t))
                (emit-push-t)
                (emit 'dup))
               ((and (eq arg1 nil)
                     (eq arg2 nil))
                (emit-push-nil)
                (emit 'dup))
               (t
                (compile-form arg1 :target :stack)
                (compile-form arg2 :target :stack))))
       (emit-invokevirtual +lisp-thread-class+
                           "setValues"
                           (list +lisp-object+ +lisp-object+)
                           +lisp-object+)
       (emit-move-from-stack target))
      (3
       (emit-push-current-thread)
       (dolist (arg args)
         (compile-form arg :target :stack))
       (emit-invokevirtual +lisp-thread-class+
                           "setValues"
                           (list +lisp-object+ +lisp-object+ +lisp-object+)
                           +lisp-object+)
       (emit-move-from-stack target))
      (t
       (compile-function-call form target representation)))))

(defun compile-special-reference (name target representation)
  (emit 'getstatic *this-class* (declare-symbol name) +lisp-symbol+)
  (cond ((constantp name)
         ;; "... a reference to a symbol declared with DEFCONSTANT always
         ;; refers to its global value."
         (emit-invokevirtual +lisp-symbol-class+ "getSymbolValue"
                             nil +lisp-object+))
        (t
         (emit-push-current-thread)
         (emit-invokevirtual +lisp-symbol-class+ "symbolValue"
                             (list +lisp-thread+) +lisp-object+)))
  (when (eq representation :unboxed-fixnum)
    (emit-unbox-fixnum))
  (emit-move-from-stack target representation))

(defun compile-variable-reference (name target representation)
  (dformat t "compile-variable-reference ~S~%" name)
  (let ((variable (find-visible-variable name)))
    (cond ((null variable)
           (when (and (special-variable-p name)
                      (constantp name))
             (let ((value (symbol-value name)))
               (when (or (null *compile-file-truename*)
                         ;; FIXME File compilation doesn't support all constant
                         ;; types yet.
                         (stringp value)
                         (numberp value)
                         (packagep value))
                 (compile-constant value :target target :representation representation)
                 (return-from compile-variable-reference))))
           (unless (special-variable-p name)
             (unless (memq name *undefined-variables*)
               (compiler-warn "Undefined variable ~S" name)
               (push name *undefined-variables*)))
           (compile-special-reference name target representation))
          ((eq (variable-representation variable) :unboxed-fixnum)
           (dformat t "compile-variable-reference unboxed-fixnum case~%")
           (cond ((eq representation :unboxed-fixnum)
                  (aver (variable-register variable))
                  (emit 'iload (variable-register variable)))
                 (t (dformat t "compile-variable-reference constructing boxed fixnum for ~S~%"
                             name)
                    (emit 'new +lisp-fixnum-class+)
                    (emit 'dup)
                    (aver (variable-register variable))
                    (emit 'iload (variable-register variable))
                    (emit-invokespecial-init +lisp-fixnum-class+ '("I"))))
           (emit-move-from-stack target representation))
          (t
           (dformat t "compile-variable-reference ~S closure index = ~S~%"
                    name (variable-closure-index variable))
           (emit 'var-ref variable target representation)))))

(defun rewrite-setq (form)
  (let ((expr (third form)))
    (if (unsafe-p expr)
        (let ((sym (gensym)))
          (list 'LET (list (list sym expr)) (list 'SETQ (second form) sym)))
        form)))

(defun p2-setq (form &key (target :stack) representation)
;;   (dformat t "p2-setq form = ~S target = ~S representation = ~S~%"
;;            form target representation)
  (unless (= (length form) 3)
    (return-from p2-setq (compile-form (precompiler::precompile-setq form)
                                       :target target)))
  (let ((expansion (macroexpand (second form) sys:*compile-file-environment*)))
    (unless (eq expansion (second form))
      (compile-form (list 'SETF expansion (third form)))
      (return-from p2-setq)))
  (let* ((name (second form))
         (value-form (third form))
         (variable (find-visible-variable name)))
    (cond ((or (null variable)
               (variable-special-p variable))
           (let ((new-form (rewrite-setq form)))
             (when (neq new-form form)
               (return-from p2-setq
                            (compile-form (p1 new-form) :target target))))
           (emit-push-current-thread)
           (emit 'getstatic *this-class* (declare-symbol name) +lisp-symbol+)
           (compile-form value-form :target :stack)
           (maybe-emit-clear-values value-form)
           (emit-invokevirtual +lisp-thread-class+ "setSpecialVariable"
                               (list +lisp-symbol+ +lisp-object+) +lisp-object+)
           (emit-move-from-stack target))
          ((and (eq (variable-representation variable) :unboxed-fixnum)
                (or (equal value-form (list '1+ (variable-name variable)))
                    (equal value-form (list '+ (variable-name variable) 1))
                    (equal value-form (list '+ 1 (variable-name variable)))))
           (dformat t "p2-setq incf unboxed-fixnum case~%")
           (emit 'iinc (variable-register variable) 1)
           (when target
             (dformat t "p2-setq constructing boxed fixnum for ~S~%"
                      (variable-name variable))
             (emit 'new +lisp-fixnum-class+)
             (emit 'dup)
             (aver (variable-register variable))
             (emit 'iload (variable-register variable))
             (emit-invokespecial-init +lisp-fixnum-class+ '("I"))
             (emit-move-from-stack target)))
          ((eq (variable-representation variable) :unboxed-fixnum)
           (dformat t "p2-setq unboxed-fixnum case value-form = ~S~%"
                    value-form)
           (compile-form value-form :target :stack :representation :unboxed-fixnum)
           (maybe-emit-clear-values value-form)
           (when target
             (emit 'dup))
           (emit 'istore (variable-register variable))
           (when target
             ;; int on stack here
             (unless (eq representation :unboxed-fixnum)
               ;; need to box int
               (emit 'new +lisp-fixnum-class+) ; stack: int new-fixnum
               (emit 'dup_x1)                  ; stack: new-fixnum int new-fixnum
               (emit 'swap)                    ; stack: new-fixnum new-fixnum int
               (emit-invokespecial-init +lisp-fixnum-class+ '("I")) ; stack: fixnum
             (emit-move-from-stack target representation))))
          (t
           (compile-form value-form :target :stack)
           (maybe-emit-clear-values value-form)
           (when target
             (emit 'dup))
           (emit 'var-set variable)
           (when target
             (when (eq representation :unboxed-fixnum)
               (emit-unbox-fixnum))
             (emit-move-from-stack target representation))))))

(defun p2-the (form &key (target :stack) representation)
;;   (compile-form (third form) :target target :representation representation)
  (dformat t "p2-the ~S ~S ~S~%" form target representation)
  (cond ((and (eq representation :unboxed-fixnum) (subtypep (second form) 'FIXNUM))
         (compile-form (third form) :target :stack :representation :unboxed-fixnum)
         (emit-move-from-stack target representation))
;;         ((subtypep (second form) 'FIXNUM)
;;          (dformat t "p2-the fixnum case~%")
;;          (unless (eq representation :unboxed-fixnum)
;;            (emit 'new +lisp-fixnum-class+)
;;            (emit 'dup))
;;          (compile-form (third form) :target :stack :representation :unboxed-fixnum)
;;          (unless (eq representation :unboxed-fixnum)
;;            (emit-invokespecial-init +lisp-fixnum-class+ '("I")))
;;          (emit-move-from-stack target representation))
        (t
         (compile-form (third form) :target target :representation representation))))

(defun compile-catch (form &key (target :stack) representation)
  (when (= (length form) 2) ; (catch 'foo)
    (when target
      (emit-push-nil)
      (emit-move-from-stack target))
    (return-from compile-catch))
  (let* ((*register* *register*)
         (tag-register (allocate-register))
         (label1 (gensym))
         (label2 (gensym))
         (label3 (gensym))
         (label4 (gensym))
         (label5 (gensym)))
    (compile-form (second form) :target tag-register) ; Tag.
    (emit-push-current-thread)
    (emit 'aload tag-register)
    (emit-invokevirtual +lisp-thread-class+
                        "pushCatchTag"
                        (list +lisp-object+)
                        nil)
    ; Stack depth is 0.
    (emit 'label label1) ; Start of protected range.
    ;; Implicit PROGN.
    (compile-progn-body (cddr form) target)
    (emit 'label label2) ; End of protected range.
    (emit 'goto label5) ; Jump over handlers.
    (emit 'label label3) ; Start of handler for THROW.
    ;; The Throw object is on the runtime stack. Stack depth is 1.
    (emit 'dup) ; Stack depth is 2.
    (emit 'getfield +lisp-throw-class+ "tag" +lisp-object+) ; Still 2.
    (emit 'aload tag-register) ; Stack depth is 3.
    ;; If it's not the tag we're looking for, we branch to the start of the
    ;; catch-all handler, which will do a re-throw.
    (emit 'if_acmpne label4) ; Stack depth is 1.
    (emit 'aload *thread*)
    (emit-invokevirtual +lisp-throw-class+ "getResult"
                        (list +lisp-thread+) +lisp-object+)
    (emit-move-from-stack target) ; Stack depth is 0.
    (emit 'goto label5)
    (emit 'label label4) ; Start of handler for all other Throwables.
    ;; A Throwable object is on the runtime stack here. Stack depth is 1.
    (emit 'aload *thread*)
    (emit-invokevirtual +lisp-thread-class+ "popCatchTag" nil nil)
    (emit 'athrow) ; And we're gone.
    (emit 'label label5)
    ;; Finally...
    (emit 'aload *thread*)
    (emit-invokevirtual +lisp-thread-class+ "popCatchTag" nil nil)
    (let ((handler1 (make-handler :from label1
                                  :to label2
                                  :code label3
                                  :catch-type (pool-class +lisp-throw-class+)))
          (handler2 (make-handler :from label1
                                  :to label2
                                  :code label4
                                  :catch-type 0)))
      (push handler1 *handlers*)
      (push handler2 *handlers*))))

(defun rewrite-throw (form)
  (let ((args (cdr form)))
    (if (unsafe-p args)
        (let ((syms ())
              (lets ())
              (wrap-result-form nil))
          ;; Tag.
          (let ((arg (first args)))
            (if (constantp arg)
                (push arg syms)
                (let ((sym (gensym)))
                  (push sym syms)
                  (push (list sym arg) lets))))
          ;; Result. "If the result-form produces multiple values, then all the
          ;; values are saved."
          (let ((arg (second args)))
            (if (constantp arg)
                (push arg syms)
                (let ((sym (gensym)))
                  (cond ((single-valued-p arg)
                         (push sym syms)
                         (push (list sym arg) lets))
                        (t
                         (push (list 'VALUES-LIST sym) syms)
                         (push (list sym (list 'MULTIPLE-VALUE-LIST arg)) lets))))))
          (list 'LET* (nreverse lets) (list* 'THROW (nreverse syms))))
        form)))

(defun compile-throw (form &key (target :stack) representation)
  (emit-push-current-thread)
  (compile-form (second form) :target :stack) ; Tag.
  (emit-clear-values) ; Do this unconditionally! (MISC.503)
  (compile-form (third form) :target :stack) ; Result.
  (emit-invokevirtual +lisp-thread-class+ "throwToTag"
                      (list +lisp-object+ +lisp-object+) nil)
  ;; Following code will not be reached.
  (when target
    (emit-push-nil)
    (emit-move-from-stack target)))

(defun p2-unwind-protect-node (block target)
  (let ((form (block-form block)))
    (when (= (length form) 2) ; No cleanup form.
      (compile-form (second form) :target target)
      (return-from p2-unwind-protect-node))
    (let* ((protected-form (cadr form))
           (cleanup-forms (cddr form))
           (*register* *register*)
           (exception-register (allocate-register))
           (result-register (allocate-register))
           (values-register (allocate-register))
           (return-address-register (allocate-register))
           (BEGIN-PROTECTED-RANGE (gensym))
           (END-PROTECTED-RANGE (gensym))
           (HANDLER (gensym))
           (EXIT (gensym))
           (CLEANUP (gensym)))
      ;; Make sure there are no leftover multiple return values from previous calls.
      (emit-clear-values)

      (let* ((*blocks* (cons block *blocks*)))
        (label BEGIN-PROTECTED-RANGE)
        (compile-form protected-form :target result-register)
        (emit-push-current-thread)
        (emit 'getfield +lisp-thread-class+ "_values" "[Lorg/armedbear/lisp/LispObject;")
        (emit 'astore values-register)
        (label END-PROTECTED-RANGE))
      (emit 'jsr CLEANUP)
      (emit 'goto EXIT) ; Jump over handler.
      (label HANDLER) ; Start of exception handler.
      ;; The Throwable object is on the runtime stack. Stack depth is 1.
      (emit 'astore exception-register)
      (emit 'jsr CLEANUP) ; Call cleanup forms.
      (emit-clear-values)
      (emit 'aload exception-register)
      (emit 'athrow) ; Re-throw exception.
      (label CLEANUP) ; Cleanup forms.
      ;; Return address is on stack here.
      (emit 'astore return-address-register)
      (dolist (subform cleanup-forms)
        (compile-form subform :target nil))
      (emit 'ret return-address-register)
      (label EXIT)
      ;; Restore multiple values returned by protected form.
      (emit-push-current-thread)
      (emit 'aload values-register)
      (emit 'putfield +lisp-thread-class+ "_values" "[Lorg/armedbear/lisp/LispObject;")
      ;; Result.
      (emit 'aload result-register)
      (emit-move-from-stack target)
      (let ((handler (make-handler :from BEGIN-PROTECTED-RANGE
                                   :to END-PROTECTED-RANGE
                                   :code HANDLER
                                   :catch-type 0)))
        (push handler *handlers*)))))

(defun compile-form (form &key (target :stack) representation)
  (cond ((consp form)
         (let ((op (car form))
               handler)
           (cond ((symbolp op)
                  (cond ((setf handler (get op 'p2-handler))
                         (funcall handler form
                                  :target target
                                  :representation representation))
                        ((macro-function op sys:*compile-file-environment*)
                         (compile-form (macroexpand form sys:*compile-file-environment*)
                                       :target target
                                       :representation representation))
                        ((special-operator-p op)
                         (dformat t "form = ~S~%" form)
                         (compiler-unsupported
                          "COMPILE-FORM: unsupported special operator ~S" op))
                        (t
                         (compile-function-call form target representation))))
                 ((and (consp op) (eq (car op) 'LAMBDA))
                  (aver (progn 'unexpected-lambda nil))
                  (let ((new-form (list* 'FUNCALL form)))
                    (compile-form new-form
                                  :target target
                                  :representation representation)))
                 (t
                  (compiler-unsupported "COMPILE-FORM unhandled case ~S" form)))))
        ((symbolp form)
         (cond ((null form)
                (emit-push-nil)
                (emit-move-from-stack target))
               ((eq form t)
                (emit-push-t)
                (emit-move-from-stack target))
               ((keywordp form)
                (emit 'getstatic *this-class* (declare-keyword form) +lisp-symbol+)
                (emit-move-from-stack target))
               (t
                ;; Maybe it's a symbol macro...
                (let ((expansion (macroexpand form sys:*compile-file-environment*)))
                  (if (eq expansion form)
                      (compile-variable-reference form target representation)
                      (compile-form expansion
                                    :target target
                                    :representation representation))))))
        ((block-node-p form)
         (cond ((equal (block-name form) '(TAGBODY))
                (p2-tagbody-node form target))
               ((equal (block-name form) '(LET))
                (p2-let/let*-node form target))
               ((equal (block-name form) '(MULTIPLE-VALUE-BIND))
                (p2-m-v-b-node form target))
               ((equal (block-name form) '(UNWIND-PROTECT))
                (p2-unwind-protect-node form target))
               (t
                (p2-block-node form target)))
         (when (eq representation :unboxed-fixnum)
           (emit-unbox-fixnum)))
        ((constantp form)
         (compile-constant form :target target :representation representation))
        (t
         (compiler-unsupported "COMPILE-FORM unhandled case ~S" form))))

;; Returns descriptor.
(defun analyze-args (compiland)
  (let* ((args (cadr (compiland-p1-result compiland)))
         (arg-count (length args)))
    (dformat t "analyze-args args = ~S~%" args)
    (aver (not (memq '&AUX args)))

    (when *child-p*
      (when (or (memq '&KEY args)
                (memq '&OPTIONAL args)
                (memq '&REST args))
        (setf *using-arg-array* t)
        (setf *hairy-arglist-p* t)
        (return-from analyze-args
                     (if *closure-variables*
                         (get-descriptor (list +lisp-object-array+ +lisp-object-array+)
                                          +lisp-object+)
                         (get-descriptor (list +lisp-object-array+)
                                          +lisp-object+))))
      (cond (*closure-variables*
             (return-from analyze-args
                          (cond ((<= arg-count +arg-count-max+)
                                 (get-descriptor (list* +lisp-object-array+
                                                        (make-list arg-count :initial-element +lisp-object+))
                                                 +lisp-object+))
                                (t (setf *using-arg-array* t)
                                   (setf (compiland-arity compiland) arg-count)
                                   (get-descriptor (list +lisp-object-array+ +lisp-object-array+)
                                                   +lisp-object+)))))
            (t
             (return-from analyze-args
                          (cond ((<= arg-count +arg-count-max+)
                                 (get-descriptor (make-list arg-count :initial-element +lisp-object+)
                                                 +lisp-object+))
                                (t (setf *using-arg-array* t)
                                   (setf (compiland-arity compiland) arg-count)
                                   (get-descriptor (list +lisp-object-array+)
                                                   +lisp-object+)))))))
    (when (or (memq '&KEY args)
              (memq '&OPTIONAL args)
              (memq '&REST args))
      (setf *using-arg-array* t)
      (setf *hairy-arglist-p* t)
      (return-from analyze-args
                   (get-descriptor (list +lisp-object-array+) +lisp-object+)))
    (cond ((<= arg-count +arg-count-max+)
           (get-descriptor (make-list (length args) :initial-element +lisp-object+)
                            +lisp-object+))
          (t
           (setf *using-arg-array* t)
           (setf (compiland-arity compiland) arg-count)
           (get-descriptor (list +lisp-object-array+) +lisp-object+)))))

(defun write-class-file (class-file)
  (let* ((super (class-file-superclass class-file))
         (this-index (pool-class (class-file-class class-file)))
         (super-index (pool-class super))
         (constructor (make-constructor super
                                        (class-file-lambda-name class-file)
                                        (class-file-lambda-list class-file))))
    (pool-name "Code") ; Must be in pool!

    (when *compile-file-truename*
      (pool-name "SourceFile") ; Must be in pool!
      (pool-name (file-namestring *compile-file-truename*)))
    (when (and (boundp '*source-line-number*)
               (fixnump *source-line-number*))
      (pool-name "LineNumberTable")) ; Must be in pool!

    ;; Write out the class file.
    (with-open-file (stream (class-file-pathname class-file)
                            :direction :output
                            :element-type '(unsigned-byte 8)
                            :if-exists :supersede)
      (write-u4 #xCAFEBABE stream)
      (write-u2 3 stream)
      (write-u2 45 stream)
      (write-constant-pool stream)
      ;; access flags
      (write-u2 #x21 stream)
      (write-u2 this-index stream)
      (write-u2 super-index stream)
      ;; interfaces count
      (write-u2 0 stream)
      ;; fields count
      (write-u2 (length *fields*) stream)
      ;; fields
      (dolist (field *fields*)
        (write-field field stream))
      ;; methods count
      (write-u2 (1+ (length (class-file-methods class-file))) stream)
      ;; methods
;;       (aver (= (length (class-file-methods class-file)) 1))
;;       (let ((execute-method (car (class-file-methods class-file))))
;;         (write-method execute-method stream))
      (dolist (method (class-file-methods class-file))
        (write-method method stream))
      (write-method constructor stream)
      ;; attributes count
      (cond (*compile-file-truename*
             ;; attributes count
             (write-u2 1 stream)
             ;; attributes table
             (write-source-file-attr (file-namestring *compile-file-truename*)
                                     stream))
            (t
             ;; attributes count
             (write-u2 0 stream))))))

(defvar *magic* t)

(defun compile-xep (xep)
  (declare (type compiland xep))
  (let ((*all-variables* ())
        (*closure-variables* ())
        (*current-compiland* xep)
        (*child-count* 0)
        (*speed* 3)
        (*safety* 0)
        (*debug* 0))

    (aver (not (null (compiland-class-file xep))))

    ;; Pass 1.
    (p1-compiland xep)
;;     (dformat t "*all-variables* = ~S~%" (mapcar #'variable-name *all-variables*))
    (setf *closure-variables*
          (remove-if-not #'variable-used-non-locally-p *all-variables*))
    (setf *closure-variables*
          (remove-if #'variable-special-p *closure-variables*))
;;     (dformat t "*closure-variables* = ~S~%" (mapcar #'variable-name *closure-variables*))

    (when *closure-variables*
      (let ((i 0))
        (dolist (var (reverse *closure-variables*))
          (setf (variable-closure-index var) i)
          (dformat t "var = ~S closure index = ~S~%" (variable-name var)
                   (variable-closure-index var))
          (incf i))))

    ;; Pass 2.
    (with-class-file (compiland-class-file xep)
      (p2-compiland xep))))

(defun p1-compiland (compiland)
  (let ((form (compiland-lambda-expression compiland)))
    (aver (eq (car form) 'LAMBDA))
    (process-optimization-declarations (cddr form))

    (let* ((lambda-list (cadr form))
           (body (cddr form))
           (auxvars (memq '&AUX lambda-list)))
      (when auxvars
        (setf lambda-list (subseq lambda-list 0 (position '&AUX lambda-list)))
        (setf body (list (append (list 'LET* (cdr auxvars)) body))))


      (when (and *magic*
                 (null (compiland-parent compiland))
                 ;; FIXME support SETF functions!
                 (symbolp (compiland-name compiland)))
        (when (memq '&OPTIONAL lambda-list)
          (unless (or (memq '&KEY lambda-list) (memq '&REST lambda-list))
            (let ((required-args (subseq lambda-list 0 (position '&OPTIONAL lambda-list)))
                  (optional-args (cdr (memq '&OPTIONAL lambda-list)))
;;                   (*enable-dformat* t)
                )
            (dformat t "optional-args = ~S~%" optional-args)
            (when (= (length optional-args) 1)
;;               (sys::%format t "~%magic case~%")
              (let* ((optional-arg (car optional-args))
                     (name (if (consp optional-arg) (car optional-arg) optional-arg))
                     (initform (if (consp optional-arg) (cadr optional-arg) nil))
                     (supplied-p-var (and (consp optional-arg)
                                          (= (length optional-arg) 3)
                                          (third optional-arg)))
                     (all-args
                      (append required-args (list name)
                              (when supplied-p-var (list supplied-p-var)))))
                (when (<= (length all-args) +arg-count-max+)
                  (dformat t "optional-arg = ~S~%" optional-arg)
                  (dformat t "supplied-p-var = ~S~%" supplied-p-var)
                  (dformat t "required-args = ~S~%" required-args)
                  (dformat t "all-args = ~S~%" all-args)
                  (cond (supplied-p-var
                         (let ((xep-lambda-expression
                                `(lambda ,required-args
                                   (let* ((,name ,initform)
                                          (,supplied-p-var nil))
                                     (%call-internal ,@all-args)))))
                           (dformat t "xep-lambda-expression = ~S~%" xep-lambda-expression)
                           (let ((xep-compiland
                                  (make-compiland :lambda-expression (precompile-form xep-lambda-expression t)
                                                  :class-file (compiland-class-file compiland))))
                             (compile-xep xep-compiland))
                           )
                         (let ((xep-lambda-expression
                                `(lambda ,(append required-args (list name))
                                   (let* ((,supplied-p-var t))
                                     (%call-internal ,@all-args)))))
                           (dformat t "xep-lambda-expression = ~S~%" xep-lambda-expression)
                           (let ((xep-compiland
                                  (make-compiland :lambda-expression (precompile-form xep-lambda-expression t)
                                                  :class-file (compiland-class-file compiland))))
                             (compile-xep xep-compiland))
                           )
                         (setf lambda-list all-args)
                         (setf (compiland-kind compiland) :internal)
                         )
                        (t
                         (let ((xep-lambda-expression
                                `(lambda ,required-args
                                   (let* ((,name ,initform))
                                     (,(compiland-name compiland) ,@all-args)))))
                           (dformat t "xep-lambda-expression = ~S~%" xep-lambda-expression)
                           (let ((xep-compiland
                                  (make-compiland :lambda-expression (precompile-form xep-lambda-expression t)
                                                  :class-file (compiland-class-file compiland))))
                             (compile-xep xep-compiland)))
                         (setf lambda-list all-args))))))))))

      (let* ((closure (sys::make-closure `(lambda ,lambda-list nil) nil))
             (syms (sys::varlist closure))
             vars)
        (dolist (sym syms)
          (let ((var (make-variable :name sym)))
            (push var vars)
            (push var *all-variables*)))
        (setf (compiland-arg-vars compiland) (nreverse vars))
        (let ((*visible-variables* *visible-variables*))
          (dformat t "p1-compiland *visible-variables* = ~S~%"
                   (mapcar #'variable-name *visible-variables*))
          (dolist (var (compiland-arg-vars compiland))
            (push var *visible-variables*))

          (dformat t "p1-compiland *visible-variables* ==> ~S~%"
                   (mapcar #'variable-name *visible-variables*))
          (setf (compiland-p1-result compiland)
                (list* 'LAMBDA lambda-list (p1-body body))))))))

(defun p2-%call-internal (form &key (target :stack) representation)
  (dformat t "p2-%call-internal~%")
  (emit 'aload_0) ; this
  (let ((args (cdr form))
        (must-clear-values nil))
    (dformat t "args = ~S~%" args)
    (dolist (arg args)
      (compile-form arg :target :stack :representation nil)
      (unless must-clear-values
        (unless (single-valued-p arg)
          (setf must-clear-values t))))
    (let ((arg-types (make-list (length args) :initial-element +lisp-object+))
          (return-type +lisp-object+))
      (emit-invokevirtual *this-class* "_execute" arg-types return-type))
    (emit-move-from-stack target representation)))

(defun p2-compiland (compiland)
  (dformat t "p2-compiland ~S~%" (compiland-name compiland))
  (let* ((p1-result (compiland-p1-result compiland))
;;          (*declared-symbols* (make-hash-table :test 'eq))
;;          (*declared-functions* (make-hash-table :test 'equal))
;;          (*declared-strings* (make-hash-table :test 'eq))
;;          (*declared-fixnums* (make-hash-table :test 'eql))
         (class-file (compiland-class-file compiland))
         (*this-class* (class-file-class class-file))
         (args (cadr p1-result))
         (body (cddr p1-result))
         (*using-arg-array* nil)
         (*hairy-arglist-p* nil)

         (*child-p* (not (null (compiland-parent compiland))))

         (descriptor (analyze-args compiland))
         (execute-method-name (if (eq (compiland-kind compiland) :external)
                                  "execute" "_execute"))
         (execute-method (make-method :name execute-method-name
                                      :descriptor descriptor))
         (*code* ())
         (*register* 0)
         (*registers-allocated* 0)
         (*handlers* ())
         (*visible-variables* *visible-variables*)
         (*undefined-variables* *undefined-variables*)

         (parameters ())

         (*thread* nil)
         (*initialize-thread-var* nil))

;;     (dformat t "pass2 *visible-variables* = ~S~%"
;;              (mapcar #'variable-name *visible-variables*))

    (dolist (var (compiland-arg-vars compiland))
      (push var *visible-variables*))

;;     (dformat t "pass2 *visible-variables* ==> ~S~%"
;;              (mapcar #'variable-name *visible-variables*))

    (dformat t "pass2 *using-arg-array* = ~S~%" *using-arg-array*)
    (dformat t "pass2 *child-p* = ~S~%" *child-p*)
    (dformat t "pass2 *closure-variables* = ~S~%"
             (mapcar #'variable-name *closure-variables*))
    (setf (method-name-index execute-method)
          (pool-name (method-name execute-method)))
    (setf (method-descriptor-index execute-method)
          (pool-name (method-descriptor execute-method)))
    (cond (*hairy-arglist-p*
           (let* ((closure (sys::make-closure p1-result nil))
                  (vars (sys::varlist closure))
                  (index 0))
             (dolist (var vars)
               (let ((variable (find-visible-variable var)))
                 (when (null variable)
                   (dformat t "unable to find variable ~S~%" var)
                   (aver nil))
                 (aver (null (variable-register variable)))
                 (aver (null (variable-index variable)))
                 (setf (variable-index variable) index)
                 (push variable parameters)
                 (incf index)))))
          (t
           (let ((register (if (and *closure-variables* *child-p*)
                               2 ; Reg 1 is reserved for closure variables array.
                               1))
                 (index 0))
             (dolist (arg args)
               (let ((variable (find-visible-variable arg)))
                 (when (null variable)
                   (dformat t "unable to find variable ~S~%" arg)
                   (aver nil))
                 (aver (null (variable-register variable)))
                 (setf (variable-register variable) (if *using-arg-array* nil register))
                 (aver (null (variable-index variable)))
                 (if *using-arg-array*
                     (setf (variable-index variable) index))
                 (push variable parameters)
                 (incf register)
                 (incf index))))))

    (let ((specials (precompiler::process-special-declarations body)))
      (dolist (name specials)
        (dformat t "recognizing ~S as special~%" name)
        (let ((variable (find-visible-variable name)))
          (cond ((null variable)
                 (setf variable (make-variable :name name
                                               :special-p t))
                 (push variable *visible-variables*))
                (t
                 (setf (variable-special-p variable) t))))))

    ;; Process type declarations.
    (when *trust-user-type-declarations*
      (dolist (subform body)
        (unless (and (consp subform) (eq (car subform) 'DECLARE))
          (return))
        (let ((decls (cdr subform)))
          (dolist (decl decls)
            (case (car decl)
              (TYPE
               (dolist (name (cddr decl))
                 (let ((variable (find-visible-variable name)))
                   (when variable
                     (setf (variable-declared-type variable) (cadr decl))
                     (unless (or ;;*child-p*
                                 (plusp (compiland-children *current-compiland*)))
                       (when (and (variable-register variable)
                                  (not (variable-special-p variable))
                                  (not (variable-used-non-locally-p variable))
                                  (subtypep (variable-declared-type variable) 'FIXNUM))
                         (setf (variable-representation variable) :unboxed-fixnum)))))))
              ((DYNAMIC-EXTENT FTYPE IGNORE IGNORABLE INLINE NOTINLINE OPTIMIZE SPECIAL)
               ;; Nothing to do here.
               )
              (t
               (dolist (name (cdr decl))
                 (let ((variable (find-visible-variable name)))
                   (when variable
                     (setf (variable-declared-type variable) (car decl))
                     (unless (or ;;*child-p*
                                 (plusp (compiland-children *current-compiland*)))
                       (when (and (variable-register variable)
                                  (not (variable-special-p variable))
                                  (not (variable-used-non-locally-p variable))
                                  (subtypep (variable-declared-type variable) 'FIXNUM))
                         (setf (variable-representation variable) :unboxed-fixnum)))))))))))
      )

    (dump-variables (reverse parameters)
                    (sys::%format nil "Arguments to ~A:~%" (compiland-name *current-compiland*))
                    )

    (allocate-register) ;; register 0: "this" pointer
    (when (and *closure-variables* *child-p*)
      (setf (compiland-closure-register compiland) (allocate-register)) ;; register 1
      (dformat t "closure register = ~S~%" (compiland-closure-register compiland)))
    (if *using-arg-array*
        ;; One slot for arg array.
        (setf (compiland-argument-register compiland) (allocate-register))
        ;; Otherwise, one register for each argument.
        (dolist (arg args)
          (allocate-register)))
    (when (and *closure-variables* (not *child-p*))
       (setf (compiland-closure-register compiland) (allocate-register))
       (dformat t "closure register = ~S~%" (compiland-closure-register compiland)))
    ;; Reserve the next available slot for the thread register.
    (setf *thread* (allocate-register))

    ;; Move args from their original registers to the closure variables array,
    ;; if applicable.
    (when (and *closure-variables*
               #+nil (some #'variable-closure-index parameters)
               )
      (dformat t "~S moving arguments to closure array (if applicable)~%"
               (compiland-name compiland))
      (cond (*child-p*
             (aver (eql (compiland-closure-register compiland) 1))
             (when (some #'variable-closure-index parameters)
               (emit 'aload (compiland-closure-register compiland))))
            (t
             (emit-push-constant-int (length *closure-variables*))
             (dformat t "p2-compiland ~S anewarray 1~%" (compiland-name compiland))
             (emit 'anewarray "org/armedbear/lisp/LispObject")))
      (dolist (variable parameters)
        (dformat t "considering ~S ...~%" (variable-name variable))
        (when (variable-closure-index variable)
          (dformat t "moving variable ~S~%" (variable-name variable))
          (cond ((variable-register variable)
                 (when (eql (variable-register variable)
                            (compiland-closure-register compiland))
                   (error "ERROR! compiland closure register = ~S var ~S register = ~S~%"
                          (compiland-closure-register compiland)
                          (variable-name variable)
                          (variable-register variable)))
                 (emit 'dup) ; array
                 (emit-push-constant-int (variable-closure-index variable))
                 (emit 'aload (variable-register variable))
                 (emit 'aastore)
                 (setf (variable-register variable) nil)) ; The variable has moved.
                ((variable-index variable)
                 (emit 'dup) ; array
                 (emit-push-constant-int (variable-closure-index variable))
                 (emit 'aload (compiland-argument-register compiland))
                 (emit-push-constant-int (variable-index variable))
                 (emit 'aaload)
                 (emit 'aastore)
                 (setf (variable-index variable) nil))))) ; The variable has moved.
      (aver (not (null (compiland-closure-register compiland))))
      (cond (*child-p*
             (when (some #'variable-closure-index parameters)
               (emit 'pop)))
            (t
             (emit 'astore (compiland-closure-register compiland))))
      (dformat t "~S done moving arguments to closure array~%"
               (compiland-name compiland)))

    ;; Establish dynamic bindings for any variables declared special.
    (dolist (variable parameters)
      (when (variable-special-p variable)
        (cond ((variable-register variable)
               (emit-push-current-thread)
               (emit 'getstatic *this-class*
                     (declare-symbol (variable-name variable))
                     +lisp-symbol+)
               (emit 'aload (variable-register variable))
               (emit-invokevirtual +lisp-thread-class+ "bindSpecial"
                                   (list +lisp-symbol+ +lisp-object+) nil)
               (setf (variable-register variable) nil))
              ((variable-index variable)
               (emit-push-current-thread)
               (emit 'getstatic *this-class*
                     (declare-symbol (variable-name variable)) +lisp-symbol+)
               (emit 'aload 1)
               (emit 'bipush (variable-index variable))
               (emit 'aaload)
               (emit-invokevirtual +lisp-thread-class+ "bindSpecial"
                                   (list +lisp-symbol+ +lisp-object+) nil)
               (setf (variable-index variable) nil)))))

    (compile-progn-body body :stack)

    (unless *code*
      (emit-push-nil))

    (emit 'areturn)

    (resolve-variables)

    ;; Go back and fill in prologue.
    (let ((code *code*))
      (setf *code* ())
      (let ((arity (compiland-arity compiland)))
        (when arity
          (generate-arg-count-check arity)))
      (maybe-generate-interrupt-check)

      (when *hairy-arglist-p*
        (emit 'aload_0) ; this
        (aver (not (null (compiland-argument-register compiland))))
        (emit 'aload (compiland-argument-register compiland)) ; arg vector
        (cond ((or (memq '&OPTIONAL args) (memq '&KEY args))
               (emit 'iconst_0)
               (emit-invokevirtual *this-class* "processArgs"
                                   (list +lisp-object-array+ "I")
                                   +lisp-object-array+))
              (t
               (emit-invokevirtual *this-class* "fastProcessArgs"
                                   (list +lisp-object-array+)
                                   +lisp-object-array+)))
        (emit 'astore (compiland-argument-register compiland)))

      (unless (or ;;*child-p*
                  *using-arg-array*)
;;         (dolist (variable (reverse *visible-variables*))
        (dolist (variable (compiland-arg-vars compiland))
          (when (eq (variable-representation variable) :unboxed-fixnum)
            (emit 'aload (variable-register variable))
            (emit-unbox-fixnum)
            (emit 'istore (variable-register variable)))))

      (maybe-initialize-thread-var)
      (setf *code* (append code *code*)))

;;     (let ((prologue *code*))
;;       (setf *code* ())
;;       (compile-progn-body body :stack)
;;       (unless *code*
;;         (emit-push-nil))
;;       (emit 'areturn)
;;       (let ((body-code *code*))
;;         (setf *code* prologue)
;;         (maybe-initialize-thread-var)
;;         (setf prologue *code*)
;;         (setf *code* (append body-code prologue))))

;;     (resolve-variables)

    (finalize-code)
    (optimize-code)

    (setf *code* (resolve-instructions *code*))
    (setf (method-max-stack execute-method) (analyze-stack))
    (setf (method-code execute-method) (code-bytes *code*))

    ;; Remove handler if its protected range is empty.
    (setf *handlers*
          (delete-if (lambda (handler) (eql (symbol-value (handler-from handler))
                                            (symbol-value (handler-to handler))))
                     *handlers*))

    (setf (method-max-locals execute-method) *registers-allocated*)
    (setf (method-handlers execute-method) (nreverse *handlers*))

    (setf (class-file-superclass class-file)
          (cond (*child-p*
                 (if *closure-variables*
                     +lisp-ctf-class+
                     (if *hairy-arglist-p*
                         +lisp-compiled-function-class+
                         +lisp-primitive-class+)))
                (*hairy-arglist-p*
                 +lisp-compiled-function-class+)
                (t
                 +lisp-primitive-class+)))

    (setf (class-file-lambda-list class-file) args)

    (push execute-method (class-file-methods class-file))

;;     (write-class-file (compiland-class-file compiland))
    (dformat t "leaving p2-compiland ~S~%" (compiland-name compiland))
    (values)))

(defun compile-1 (compiland)
  (dformat t "compile-1 ~S~%" (compiland-name compiland))
  (let ((*all-variables* ())
        (*closure-variables* ())
        (*current-compiland* compiland)
        (*child-count* 0)
        (*speed* *speed*)
        (*safety* *safety*)
        (*debug* *debug*))
    ;; Pass 1.
    (p1-compiland compiland)
    (dformat t "*all-variables* = ~S~%" (mapcar #'variable-name *all-variables*))
    (setf *closure-variables*
          (remove-if-not #'variable-used-non-locally-p *all-variables*))
    (setf *closure-variables*
          (remove-if #'variable-special-p *closure-variables*))
    (dformat t "*closure-variables* = ~S~%" (mapcar #'variable-name *closure-variables*))

    (when *closure-variables*
      (let ((i 0))
        (dolist (var (reverse *closure-variables*))
          (setf (variable-closure-index var) i)
          (dformat t "var = ~S closure index = ~S~%" (variable-name var)
                   (variable-closure-index var))
          (incf i))))

    ;; Pass 2.
    (with-class-file (compiland-class-file compiland)
      (p2-compiland compiland)
      (write-class-file (compiland-class-file compiland)))

    (dformat t "*all-variables* = ~S~%" (mapcar #'variable-name *all-variables*))
    (class-file-pathname (compiland-class-file compiland))))

(defvar *compiler-error-bailout*)

(defun make-compiler-error-form (form)
  `(lambda ,(cadr form)
     (error 'program-error :format-control "Execution of a form compiled with errors.")))

(defun compile-defun (name form environment &optional (filespec "out.class"))
  (aver (eq (car form) 'LAMBDA))
  (unless (or (null environment) (sys::empty-environment-p environment))
    (compiler-unsupported "COMPILE-DEFUN: unable to compile LAMBDA form defined in non-null lexical environment."))
  (catch 'compile-defun-abort
    (let* ((class-file (make-class-file :pathname filespec
                                        :lambda-name name
                                        :lambda-list (cadr form)))
           (*compiler-error-bailout*
            (lambda ()
              (compile-1 (make-compiland :name name
                                         :lambda-expression (make-compiler-error-form form)
                                         :class-file class-file)))))
      (handler-bind ((warning #'handle-warning)
                     (compiler-error #'handle-compiler-error))
        (compile-1 (make-compiland :name name
                                   :lambda-expression (precompile-form form t)
                                   :class-file class-file))))))

(defun handle-warning (condition)
  (fresh-line)
  (format t "~%; Caught ~A:~%;   ~A~2%" (type-of condition) condition)
  (muffle-warning))

(defun handle-compiler-error (condition)
  (fresh-line)
  (format t "~%; Caught ERROR:~%;   ~A~2%" condition)
  (throw 'compile-defun-abort (funcall *compiler-error-bailout*)))

(defun get-lambda-to-compile (definition-designator)
  (if (and (consp definition-designator)
           (eq (car definition-designator) 'LAMBDA))
      definition-designator
      (multiple-value-bind (lambda-expression environment)
        (function-lambda-expression definition-designator)
	(unless lambda-expression
          (error "Can't find a definition for ~S." definition-designator))
        (values lambda-expression environment))))

(defun load-verbose-prefix ()
  (let ((s (make-array (max sys::*load-depth* 1)
                       :element-type 'character
                       :initial-element #\space)))
    (setf (char s 0) #\;)
    s))

(defvar *catch-errors* t)

(defvar *in-compilation-unit* nil)

(defmacro with-compilation-unit (options &body body)
  `(%with-compilation-unit (lambda () ,@body) ,@options))

(defun %with-compilation-unit (fn &key override)
  (if (and *in-compilation-unit* (not override))
      (funcall fn)
      (let ((*style-warnings* 0)
            (*warnings* 0)
            (*errors* 0)
            (*defined-functions* '())
            (*undefined-functions* '())
            (*in-compilation-unit* t))
        (unwind-protect
            (funcall fn)
          (unless (and (zerop (+ *errors* *warnings* *style-warnings*))
                       (null *undefined-functions*))
            (format t "~%; Compilation unit finished~%")
            (unless (zerop *errors*)
              (format t ";   Caught ~D ERROR condition~P~%"
                      *errors* *errors*))
            (unless (zerop *warnings*)
              (format t ";   Caught ~D WARNING condition~P~%"
                      *warnings* *warnings*))
            (unless (zerop *style-warnings*)
              (format t ";   Caught ~D STYLE-WARNING condition~P~%"
                      *style-warnings* *style-warnings*))
            (when *undefined-functions*
              (format t ";   The following functions were used but not defined:~%")
              (dolist (name *undefined-functions*)
                (format t ";     ~S~%" name)))
            (terpri))))))

(defun %jvm-compile (name definition)
  (let ((prefix (load-verbose-prefix)))
    (when *compile-print*
      (fresh-line)
      (if name
          (progn
            (sys::%format t "~A Compiling ~S ...~%" prefix name)
            (when (and (fboundp name)
                       (sys::%typep (fdefinition name) 'generic-function))
              (sys::%format t "~A Unable to compile generic function ~S~%" prefix name)
              (return-from %jvm-compile (values name nil t)))
            (unless (symbolp name)
              (sys::%format t "~A Unable to compile ~S~%" prefix name)
              (return-from %jvm-compile (values name nil t))))
          (let ((*print-length* 2)
                (*print-level* 2))
            (format t "; Compiling ~S~%" definition))))
    (unless definition
      (resolve name)
      (setf definition (fdefinition name)))
    (when (compiled-function-p definition)
      (when (and *compile-print* name)
        (sys::%format t "~A Already compiled ~S~%" prefix name))
      (return-from %jvm-compile (values name nil nil)))
    (multiple-value-bind (expr env) (get-lambda-to-compile definition)
      (let* ((*package* (if (and name (symbol-package name))
                            (symbol-package name)
                            *package*))
             compiled-definition
             (warnings-p t)
             (failure-p t))
        (with-compilation-unit ()
          (let ((filespec (compile-defun name expr env)))
            (setf compiled-definition (sys:load-compiled-function filespec))
            (when (and name (functionp compiled-definition))
              (sys::%set-lambda-name compiled-definition name)
              (sys:set-call-count compiled-definition (sys:call-count definition))
              (sys::%set-arglist compiled-definition (sys::arglist definition))
              (let ((*warn-on-redefinition* nil))
                (setf (fdefinition name)
                      (if (macro-function name)
                          (sys::make-macro name compiled-definition)
                          compiled-definition))))
            (cond ((zerop (+ jvm::*errors* jvm::*warnings* jvm::*style-warnings*))
                   (setf warnings-p nil failure-p nil))
                  ((zerop (+ jvm::*errors* jvm::*warnings*))
                   (setf failure-p nil)))
            (when *compile-print*
              (if name
                  (sys::%format t "~A Compiled ~S~%" prefix name)
                  (sys::%format t "~A Compiled top-level form~%" prefix)))))
        (values (or name compiled-definition) warnings-p failure-p)))))

(defun jvm-compile (name &optional definition)
  (if *catch-errors*
      (let ((prefix (load-verbose-prefix)))
        (handler-case
            (%jvm-compile name definition)
          (compiler-unsupported-feature-error
           (c)
           (fresh-line)
           (sys::%format t "; UNSUPPORTED FEATURE: ~A~%" c)
           (if name
               (sys::%format t "~A Unable to compile ~S.~%" prefix name)
               (sys::%format t "~A Unable to compile top-level form.~%" prefix))
           (precompiler::precompile name definition))
          #+nil
          (error (c)
                 (fresh-line)
                 (sys::%format t "~A Note: ~A~%" prefix c)
                 (if name
                     (sys::%format t "~A Unable to compile ~S.~%" prefix name)
                     (sys::%format t "~A Unable to compile top-level form.~%" prefix))
                 (precompiler::precompile name definition))
          ))
      (%jvm-compile name definition)))

(defun jvm-compile-package (package-designator)
  (let ((pkg (if (packagep package-designator)
                 package-designator
                 (find-package package-designator))))
      (dolist (sym (sys::package-symbols pkg))
        (when (fboundp sym)
          (unless (or (special-operator-p sym) (macro-function sym))
            ;; Force autoload to be resolved.
            (resolve sym)
            (let ((f (fdefinition sym)))
              (unless (compiled-function-p f)
                (jvm-compile sym)))))))
  t)

(defun install-p2-handler (symbol &optional handler)
  (let ((handler (or handler
                     (find-symbol (concatenate 'string "COMPILE-" (symbol-name symbol)) 'jvm))))
    (unless (and handler (fboundp handler))
      (error "Handler not found: ~S" handler))
    (setf (get symbol 'p2-handler) handler)))

(defun initialize-p2-handlers ()
  (mapc #'install-p2-handler '(catch
                               declare
                               funcall
                               if
                               locally
                               multiple-value-call
                               multiple-value-list
                               multiple-value-prog1
                               nth
                               progn
                               quote
                               throw
                               values))

  (install-p2-handler '*               'p2-times)
  (install-p2-handler '+               'p2-plus)
  (install-p2-handler '-               'p2-minus)
  (install-p2-handler '/=              'p2-numeric-comparison)
  (install-p2-handler '<               'p2-numeric-comparison)
  (install-p2-handler '<=              'p2-numeric-comparison)
  (install-p2-handler '=               'p2-numeric-comparison)
  (install-p2-handler '>               'p2-numeric-comparison)
  (install-p2-handler '>=              'p2-numeric-comparison)
  (install-p2-handler 'aref            'p2-aref)
  (install-p2-handler 'sys::aset       'p2-aset)
  (install-p2-handler 'ash             'p2-ash)
  (install-p2-handler 'atom            'p2-atom)
  (install-p2-handler 'cons            'p2-cons)
  (install-p2-handler 'eql             'p2-eql)
  (install-p2-handler 'eval-when       'p2-eval-when)
  (install-p2-handler 'flet            'p2-flet)
  (install-p2-handler 'go              'p2-go)
  (install-p2-handler 'function        'p2-function)
  (install-p2-handler 'labels          'p2-labels)
  (install-p2-handler 'length          'p2-length)
  (install-p2-handler 'logand          'p2-logand)
  (install-p2-handler 'logior          'p2-logior)
  (install-p2-handler 'logxor          'p2-logxor)
  (install-p2-handler 'load-time-value 'p2-load-time-value)
  (install-p2-handler 'mod             'p2-mod)
  (install-p2-handler 'not             'p2-not/null)
  (install-p2-handler 'null            'p2-not/null)
  (install-p2-handler 'return-from     'p2-return-from)
  (install-p2-handler 'rplacd          'p2-rplacd)
  (install-p2-handler 'schar           'p2-schar)
  (install-p2-handler 'sys:set-car     'p2-set-car/cdr)
  (install-p2-handler 'sys:set-cdr     'p2-set-car/cdr)
  (install-p2-handler 'svref           'p2-svref)
  (install-p2-handler 'setq            'p2-setq)
  (install-p2-handler 'the             'p2-the)
  (install-p2-handler 'zerop           'p2-zerop)

  (install-p2-handler '%call-internal  'p2-%call-internal))

(initialize-p2-handlers)

(defun process-optimization-declarations (forms)
  (let (alist ())
    (dolist (form forms)
      (unless (and (consp form) (eq (car form) 'declare))
        (return))
      (dolist (decl (cdr form))
        (when (eq (car decl) 'OPTIMIZE)
          (dolist (spec (cdr decl))
            (let ((val 3)
                  (quantity spec))
              (when (consp spec)
                (setf quantity (car spec) val (cadr spec)))
              (when (and (fixnump val)
                         (<= 0 val 3)
                         (memq quantity '(debug speed space safety compilation-speed)))
                (push (cons quantity val) alist)))))))
    (when alist
      (dolist (cons alist)
        (let ((symbol (car cons))
              (value (cdr cons)))
          (case symbol
            (SPEED
             (setf *speed* value))
            (SAFETY
             (setf *safety* value))
            (DEBUG
             (setf *debug* value))))))
    alist))

(defun compile (name &optional definition)
  (jvm-compile name definition))

(provide 'jvm)

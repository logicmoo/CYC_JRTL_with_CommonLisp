;;; jvm.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: jvm.lisp,v 1.331 2004-12-31 02:22:31 piso Exp $
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

(import '(sys::%format
          sys::source-transform
          sys::define-source-transform
          sys::expand-source-transform))

(require :source-transform)

(require '#:opcodes)

(shadow '(method variable))

(defparameter *trust-user-type-declarations* t)

(defvar *enable-dformat* nil)

(defun dformat (destination control-string &rest args)
  (when *enable-dformat*
    (apply #'sys::%format destination control-string args)))

(defun inline-expansion (name)
  (let ((info (sys::function-info name)))
    (and info (getf info :inline-expansion))))

(defun (setf inline-expansion) (expansion name)
  (let ((info (sys::function-info name)))
    (setf info (sys::%putf info :inline-expansion expansion))
    (setf (sys::function-info name) info))
  expansion)

;; Just an experiment...
(defmacro defsubst (name lambda-list &rest body)
  `(progn
     (sys::%defun ',name ',lambda-list ',body)
     (precompile ',name)
     (setf (inline-expansion ',name)
           (precompile-form (list* 'LAMBDA ',lambda-list ',body) t))
     ',name))
#+nil
(defmacro defsubst (&rest args)
  `(defun ,@args))

(defvar *use-locals-vector* nil)

(defvar *compiler-debug* nil)

(defstruct compiland
  name
  lambda-expression
  classfile
  parent
  (children 0) ; Number of local functions defined with FLET or LABELS.
  contains-lambda
  )

(defvar *current-compiland* nil)

(defvar *pool* nil)
(defvar *pool-count* 1)
(defvar *pool-entries* nil)

;; (defvar *stream* nil)
(defvar *this-class* nil)

(defvar *code* ())
(defvar *static-code* ())
(defvar *fields* ())

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
  (%format t "  ~S special-p = ~S register = ~S level = ~S index = ~S declared-type = ~S~%"
           (variable-name variable)
;;            (variable-kind variable)
           (variable-special-p variable)
           (variable-register variable)
           (variable-level variable)
           (variable-index variable)
           (variable-declared-type variable)))

(defun dump-variables (list caption &optional (force nil))
  (when (or force *dump-variables*)
    (write-string caption)
    (if list
        (dolist (variable list)
          (dump-1-variable variable))
        (%format t "  None.~%"))))

(defvar *nesting-level* 0)

(defstruct variable
  name
  initform
  temp-register
  special-p
  (declared-type t)
  representation ; NIL (i.e. a LispObject reference) or :UNBOXED-FIXNUM
  register ; register number or NIL
  (level *nesting-level*)
  index
  (reads 0)
  (writes 0))

;; obj can be a symbol or variable
;; returns variable or nil
(defun unboxed-fixnum-variable (obj)
  (cond
   ((symbolp obj)
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
      (unboxed-fixnum-variable arg)))

;; True for local functions defined with FLET or LABELS.
(defvar *child-p* nil)

(defvar *child-count* 0)

(defvar *context* nil)

(defvar *context-register* nil)

(defstruct context vars)

(defun add-variable-to-context (variable)
  (aver (variable-p variable))
  (push variable (context-vars *context*)))

(defun push-variable (name special-p)
  (let* ((index (if special-p nil (length (context-vars *context*))))
         (variable (make-variable :name name :special-p special-p :index index)))
    (push variable *visible-variables*)
    (push variable *all-variables*)
    (unless special-p
      (add-variable-to-context variable))
    variable))

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
;;   (prog1
;;    *register*
;;    (incf *register*)
;;    (when (< *registers-allocated* *register*)
;;      (setf *registers-allocated* *register*))))
  (let* ((register *register*)
         (next-register (1+ register)))
    (declare (type fixnum register next-register))
    (setf *register* next-register)
    (when (< *registers-allocated* next-register)
      (setf *registers-allocated* next-register))
    register))

(defstruct local-function
  name
  function
  classfile
  variable
  (nesting-level (1+ *nesting-level*)))

(defvar *local-functions* ())

(defsubst find-local-function (name)
  (find name *local-functions* :key #'local-function-name))

(defvar *using-arg-array* nil)
(defvar *hairy-arglist-p* nil)
(defvar *arity* nil)

(defvar *val* nil) ; index of value register

(defstruct node
  name
  form
  (compiland *current-compiland*))

;; Used to wrap TAGBODYs, UNWIND-PROTECTs and LET/LET*/M-V-B forms as well as
;; BLOCKs per se.
(defstruct (block-node (:conc-name block-) (:include node))
  ;; Block name, or (TAGBODY), or (LET).
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
  ;; Only used in LET/LET* nodes.
  vars
  )

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

(defun p1-let-vars (varlist)
  (let ((vars ()))
    (dolist (varspec varlist)
      (cond ((consp varspec)
             (let ((name (car varspec))
                   (initform (p1 (cadr varspec))))
               (push (make-variable :name name :initform initform) vars)))
            (t
             (push (make-variable :name varspec) vars))))
    (setf var (nreverse vars))
    (dolist (variable vars)
      (push variable *visible-variables*))
    vars))

(defun p1-let*-vars (varlist)
  (let ((vars ()))
    (dolist (varspec varlist)
      (cond ((consp varspec)
             (let* ((name (car varspec))
                    (initform (p1 (cadr varspec)))
                    (var (make-variable :name name :initform initform)))
               (push var vars)
               (push var *visible-variables*)))
            (t
             (let ((var (make-variable :name varspec)))
               (push var vars)
               (push var *visible-variables*)))))
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
      ;; Check for globally declared specials.
      (dolist (variable vars)
        (when (special-variable-p (variable-name variable))
          (setf (variable-special-p variable) t)))
      (setf (block-vars block) vars))
    (setf body (mapcar #'p1 body))
    (setf (block-form block) (list* op varlist body))
    ;; Process declarations.
    (dolist (subform body)
      (unless (and (consp subform) (eq (car subform) 'DECLARE))
        (return))
      (let ((decls (cdr subform)))
        (dolist (decl decls)
          (case (car decl)
            (SPECIAL
             (dolist (sym (cdr decl))
               (dolist (variable (block-vars block))
                 (when (eq sym (variable-name variable))
                   (setf (variable-special-p variable) t)))))
            (TYPE
             (dolist (sym (cddr decl))
               (dolist (variable (block-vars block))
                 (when (eq sym (variable-name variable))
                   (setf (variable-declared-type variable) (cadr decl))))))))))
    block))

(defun p1-block (form)
  (let* ((block (make-block-node :name (cadr form)))
         (*blocks* (cons block *blocks*)))
    (setf (block-form block) (list* 'BLOCK (cadr form) (mapcar #'p1 (cddr form))))
    block))

(defun p1-return-from (form)
  (let* ((name (second form))
         (result-form (third form))
         (block (find-block name)))
    (cond ((null block)
           (error "P1-RETURN-FROM: no block named ~S is currently visible." name))
          ((eq (block-compiland block) *current-compiland*)
           (setf (block-return-p block) t))
          (t
           (setf (block-return-p block) t)
           (setf (block-non-local-return-p block) t))))
  (list* 'RETURN-FROM (cadr form) (mapcar #'p1 (cddr form))))

(defun p1-tagbody (form)
  (let* ((block (make-block-node :name '(TAGBODY)))
         (*blocks* (cons block *blocks*))
         (*visible-tags* *visible-tags*)
         (body (cdr form)))
    (dolist (subform body)
      (when (or (symbolp subform) (integerp subform))
        (let* ((tag (make-tag :name subform :label (gensym) :block block)))
          (push tag *visible-tags*))))
    (setf (block-form block) (list* 'TAGBODY (mapcar #'p1 (cdr form))))
    block))

(defun p1-go (form)
  (let* ((name (cadr form))
         (tag (find-tag name)))
    (unless tag
      (error "COMPILE-GO: tag not found: ~S" name))
    (unless (eq (tag-compiland tag) *current-compiland*)
      (setf (block-non-local-go-p (tag-block tag)) t)))
  form)

(defun p1-flet/labels (form)
  (when *current-compiland*
    (incf (compiland-children *current-compiland*) (length (cadr form))))
  ;; Do pass 1 on the local definitions, discarding the result (we're just
  ;; checking for non-local RETURNs and GOs.)
  (let ((*current-compiland* nil))
    (dolist (definition (cadr form))
      (setf definition (list* 'BLOCK (car definition) (cadr definition) (cddr definition)))
      (p1 definition)))
  (list* (car form) (cadr form) (mapcar #'p1 (cddr form))))

(defun p1-function (form)
  (if (and (consp (cadr form)) (eq (caadr form) 'LAMBDA))
      (list 'FUNCTION (p1 (cadr form)))
      form))

(defun p1-lambda (form)
  (when (eq (car form) 'LAMBDA)
    (when *current-compiland*
      (unless (or (compiland-contains-lambda *current-compiland*)
                  (eq form (compiland-lambda-expression *current-compiland*)))
        (do ((compiland *current-compiland* (compiland-parent compiland)))
            ((null compiland))
          (setf (compiland-contains-lambda compiland) t)))))
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
            (dformat t "p1-setq: write to ~S~%" arg1)
            (incf (variable-writes variable)))
          (dformat t "p1-setq: unknown variable ~S~%" arg1)))
    (list 'SETQ arg1 (p1 arg2))))

(defun p1-the (form)
  (dformat t "p1-the form = ~S~%" form)
  (let ((type (second form))
        (expr (third form)))
    (cond
     ((and (listp type) (eq (car type) 'VALUES))
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

(defun p1-default (form)
  (list* (car form) (mapcar #'p1 (cdr form))))

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

(defun p1 (form)
  (cond
   ((symbolp form)
    (cond
     ((constantp form) ; a DEFCONSTANT
      (let ((value (symbol-value form)))
        (if (numberp value)
            value
            form)))
     (t
      form)))
   ((atom form)
    form)
   (t
    (let ((op (car form))
          handler)
      (cond ((symbolp op)
             (cond ((setf handler (get op 'p1-handler))
                    (funcall handler form))
                   ((macro-function op)
                    (p1 (macroexpand form)))
                   ((special-operator-p op)
                    (error "P1: unsupported special operator ~S" op))
                   (t
                    ;; Function call.
                    (let ((new-form (rewrite-function-call form)))
                      (when (neq new-form form)
                        (return-from p1 (p1 new-form))))
                    (let ((source-transform (source-transform op)))
                      (when source-transform
                        (let ((new-form (expand-source-transform form)))
                          (when (neq new-form form)
                            (return-from p1 (p1 new-form))))))
                    (let ((expansion (inline-expansion op)))
                      (when expansion
                        (return-from p1 (p1 (expand-inline form expansion)))))
                    (p1-default form))))
            ((and (consp op) (eq (car op) 'LAMBDA))
             (unless (and *current-compiland*
                          (compiland-contains-lambda *current-compiland*))
               (do ((compiland *current-compiland* (compiland-parent compiland)))
                   ((null compiland))
                 (setf (compiland-contains-lambda compiland) t)))
             form)
            (t
             form))))))

(defun install-p1-handler (symbol handler)
  (setf (get symbol 'p1-handler) handler))

(install-p1-handler 'block                'p1-block)
(install-p1-handler 'catch                'p1-default)
(install-p1-handler 'declare              'identity)
(install-p1-handler 'eval-when            'p1-lambda)
(install-p1-handler 'flet                 'p1-flet/labels)
(install-p1-handler 'function             'p1-function)
(install-p1-handler 'go                   'p1-go)
(install-p1-handler 'if                   'p1-default)
(install-p1-handler 'labels               'p1-flet/labels)
(install-p1-handler 'lambda               'p1-lambda)
(install-p1-handler 'let                  'p1-let/let*)
(install-p1-handler 'let*                 'p1-let/let*)
(install-p1-handler 'load-time-value      'identity)
(install-p1-handler 'locally              'p1-default)
(install-p1-handler 'multiple-value-bind  'p1-lambda)
(install-p1-handler 'multiple-value-call  'p1-default)
(install-p1-handler 'multiple-value-list  'p1-default)
(install-p1-handler 'multiple-value-prog1 'p1-default)
(install-p1-handler 'progn                'p1-default)
(install-p1-handler 'progv                'identity)
(install-p1-handler 'quote                'p1-quote)
(install-p1-handler 'return-from          'p1-return-from)
(install-p1-handler 'setq                 'p1-setq)
(install-p1-handler 'symbol-macrolet      'identity)
(install-p1-handler 'tagbody              'p1-tagbody)
(install-p1-handler 'the                  'p1-the)
(install-p1-handler 'throw                'p1-throw)
(install-p1-handler 'unwind-protect       'p1-default)

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
      (%format t "~D: ~A ~S~%" (1+ index) type entry)
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
  (%format nil "~A ~A stack = ~S depth = ~S"
          (opcode-name (instruction-opcode instruction))
          (instruction-args instruction)
          (instruction-stack instruction)
          (instruction-depth instruction)))

(defun inst (instr &optional args)
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
(defconstant +lisp-string+ "Lorg/armedbear/lisp/SimpleString;")
(defconstant +lisp-symbol-class+ "org/armedbear/lisp/Symbol")
(defconstant +lisp-symbol+ "Lorg/armedbear/lisp/Symbol;")
(defconstant +lisp-thread-class+ "org/armedbear/lisp/LispThread")
(defconstant +lisp-thread+ "Lorg/armedbear/lisp/LispThread;")
(defconstant +lisp-cons-class+ "org/armedbear/lisp/Cons")
(defconstant +lisp-fixnum-class+ "org/armedbear/lisp/Fixnum")
(defconstant +lisp-fixnum+ "Lorg/armedbear/lisp/Fixnum;")
(defconstant +lisp-simple-string-class+ "org/armedbear/lisp/SimpleString")
(defconstant +lisp-simple-string+ "Lorg/armedbear/lisp/SimpleString;")
(defconstant +lisp-environment+ "Lorg/armedbear/lisp/Environment;")
(defconstant +lisp-binding+ "Lorg/armedbear/lisp/Binding;")
(defconstant +lisp-throw-class+ "org/armedbear/lisp/Throw")
(defconstant +lisp-return-class+ "org/armedbear/lisp/Return")
(defconstant +lisp-go-class+ "org/armedbear/lisp/Go")

(defsubst emit-push-nil ()
  (emit 'getstatic +lisp-class+ "NIL" +lisp-object+))

(defsubst emit-push-t ()
  (emit 'getstatic +lisp-class+ "T" +lisp-symbol+))

(defun emit-push-constant-int (n)
  (if (<= -32768 n 32767)
      (emit 'sipush n)
      (emit 'ldc (pool-int n))))

(defun make-descriptor (arg-types return-type)
  (with-output-to-string (s)
    (princ #\( s)
    (dolist (type arg-types)
      (princ type s))
    (princ #\) s)
    (princ (if return-type return-type "V") s)))

(defun descriptor (designator)
  (cond ((stringp designator)
         designator)
        ((listp designator)
         (unless (= (length designator) 2)
           (error "Bad method type descriptor ~S." designator))
         (make-descriptor (car designator) (cadr designator)))
        (t
         (error "Bad method type descriptor ~S." designator))))

(defun emit-invokestatic (class-name method-name descriptor stack)
  (aver stack)
  (let ((instruction (emit 'invokestatic
                           class-name method-name (descriptor descriptor))))
    (setf (instruction-stack instruction) stack)
    (aver (eql (instruction-stack instruction) stack))))

(defun emit-invokespecial (class-name method-name descriptor stack)
  (let ((instruction (emit 'invokespecial
                           class-name method-name (descriptor descriptor))))
    (setf (instruction-stack instruction) stack)))

(defun emit-invokevirtual (class-name method-name descriptor stack)
  (let ((instruction (emit 'invokevirtual
                           class-name method-name (descriptor descriptor))))
    (setf (instruction-stack instruction) stack)))

;; Index of local variable used to hold the current thread.
(defvar *thread* nil)

(defvar *initialize-thread-var* nil)

(defun maybe-initialize-thread-var ()
  (when *initialize-thread-var*
    (emit-invokestatic +lisp-thread-class+
                       "currentThread"
                       (make-descriptor () +lisp-thread+)
                       1)
    (emit 'astore *thread*)))

(defsubst ensure-thread-var-initialized ()
  (setf *initialize-thread-var* t))

(defun emit-push-current-thread ()
  (declare (optimize speed))
  (ensure-thread-var-initialized)
  (emit 'aload *thread*))

(defun maybe-generate-arg-count-check ()
  (when *arity*
    (let ((label1 (gensym)))
      (aver (fixnump *arity*))
      (aver (not (minusp *arity*)))
      (emit 'aload 1)
      (emit 'arraylength)
      (emit 'bipush *arity*)
      (emit 'if_icmpeq `,label1)
      (emit 'aload 0) ; this
      (emit-invokevirtual *this-class*
                          "argCountError"
                          "()V"
                          -1)
      (emit 'label `,label1))))

(defun maybe-generate-interrupt-check ()
  (unless (> *speed* *safety*)
    (let ((label1 (gensym)))
      (emit 'getstatic +lisp-class+ "interrupted" "Z")
      (emit 'ifeq `,label1)
      (emit-invokestatic +lisp-class+
                         "handleInterrupt"
                         "()V"
                         0)
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
                sys::%rplaca sys::%rplacd
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
                sys:write-8-bits
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
         (emit-invokestatic +lisp-fixnum-class+
                            "getValue"
                            "(Lorg/armedbear/lisp/LispObject;)I"
                            0))
        (t
         (emit 'checkcast +lisp-fixnum-class+)
         (emit 'getfield +lisp-fixnum-class+ "value" "I"))))

(defun emit-box-long ()
  (declare (optimize speed))
  (emit-invokestatic +lisp-class+
                     "number"
                     "(J)Lorg/armedbear/lisp/LispObject;"
                     -1))

;; Expects value on stack.
(defun emit-invoke-method (method-name target representation)
  (emit-invokevirtual +lisp-object-class+
                      method-name
                      "()Lorg/armedbear/lisp/LispObject;"
                      0)
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

(defun check-args (form n)
  (declare (type fixnum n))
  (cond ((= (length form) (1+ n))
         t)
        (t
         (compiler-style-warn "Wrong number of arguments for ~A." (car form))
         nil)))

(defparameter *resolvers* (make-hash-table :test #'eql))

(defun unsupported-opcode (instruction)
  (error "Unsupported opcode ~D."
         (instruction-opcode instruction)))

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
             101 ; LSUB
             116 ; INEG
             120 ; ISHL
             121 ; LSHL
             122 ; ISHR
             123 ; LSHR
             126 ; IAND
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
  (setf (gethash n *resolvers*) nil))

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

(defconstant +branch-opcodes+
  '(153 ; IFEQ
    154 ; IFNE
    155 ; IFLT
    156 ; IFGE
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
    198 ; IFNULL
    ))

(defsubst branch-opcode-p (opcode)
  (declare (optimize speed))
  (member opcode +branch-opcodes+))

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
          (%format t "Stack inconsistency at index ~D: found ~S, expected ~S.~%"
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
        (when (member opcode '(167 169 191)) ; GOTO RET ATHROW
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
                (%format t "instruction-stack = ~S opcode-stack-effect = ~S~%"
                         (instruction-stack instruction)
                         (opcode-stack-effect opcode))
                (%format t "index = ~D instruction = ~A~%" i (print-instruction instruction))))
            (setf (instruction-stack instruction) (opcode-stack-effect opcode)))
;;         (aver (not (null (instruction-stack instruction))))
        (unless (instruction-stack instruction)
          (%format t "no stack information for instruction ~D~%" (instruction-opcode instruction))
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
        (%format t "compiland name = ~S~%" (compiland-name *current-compiland*))
        (%format t "max-stack = ~D~%" max-stack)
        (%format t "----- after stack analysis -----~%")
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
  (dump-variables (reverse *all-variables*)
                  (%format nil "Variables in ~A:~%" (compiland-name *current-compiland*)))
  (let ((code (nreverse *code*)))
    (setf *code* nil)
    (dolist (instruction code)
      (case (instruction-opcode instruction)
        (206 ; VAR-REF
         (let* ((instruction-args (instruction-args instruction))
                (variable (first instruction-args))
                (target (second instruction-args))
                (representation (third instruction-args)))
;;            (%format t "resolve-variables name = ~S representation = ~S~%"
;;                     (variable-name variable) representation)
;;            (%format t "variable-representation = ~S~%"
;;                     (variable-representation variable))
           (aver (variable-p variable))
           (cond
;;             ((eq (variable-representation variable) :unboxed-fixnum)
;;              (%format t "resolve-variables constructing boxed fixnum for ~S~%"
;;                       (variable-name variable))
;;              (emit 'new +lisp-fixnum-class+)
;;              (emit 'dup)
;;              (emit 'iload (variable-register variable))
;;              (emit-invokespecial +lisp-fixnum-class+ "<init>" "(I)V" -2)
;;              (emit-move-from-stack target))
            ((variable-register variable)
             (emit 'aload (variable-register variable))
             (emit-move-from-stack target))
            ((variable-special-p variable)
             (compile-special-reference (variable-name variable) target nil))
            ((= (variable-level variable) *nesting-level* 0)
             (emit 'aload 1)
             (emit 'bipush (variable-index variable))
             (emit 'aaload)
             (emit-move-from-stack target))
            ((and (variable-index variable) ; A local at the current nesting level.
                  (= (variable-level variable) *nesting-level*))
             (emit 'aload 1)
             (emit 'bipush (variable-index variable))
             (emit 'aaload)
             (emit-move-from-stack target))
            (*child-p*
             ;; The general case.
             (emit 'aload *context-register*) ; Array of arrays.
             (aver (fixnump (variable-level variable)))
             (emit 'bipush (variable-level variable))
             (emit 'aaload) ; Locals array for level in question.
             (emit 'bipush (variable-index variable))
             (emit 'aaload)
             (emit-move-from-stack target))
            (t
             (emit 'aload 1)
             (emit 'bipush (variable-index variable))
             (emit 'aaload)
             (emit-move-from-stack target)))
           (when (eq representation :unboxed-fixnum)
             (dformat t "resolve-variables calling emit-unbox-fixnum~%")
             (emit-unbox-fixnum))))
        (207 ; VAR-SET
         (let ((variable (car (instruction-args instruction))))
           (aver (variable-p variable))
           (aver (not (variable-special-p variable)))
           (cond ((variable-register variable)
                  (emit 'astore (variable-register variable)))
                 ((= (variable-level variable) *nesting-level* 0)
                  (emit 'aload 1) ; Stack: value array
                  (emit 'swap) ; array value
                  (emit 'bipush (variable-index variable)) ; array value index
                  (emit 'swap) ; array index value
                  (emit 'aastore))
                 ((and (variable-index variable) ; A local at the current nesting level.
                       (= (variable-level variable) *nesting-level*))
                  (emit 'aload 1) ; Stack: value array
                  (emit 'swap) ; array value
                  (emit 'bipush (variable-index variable)) ; array value index
                  (emit 'swap) ; array index value
                  (emit 'aastore)
                  )
                 (*child-p*
                  ;; The general case.
                  (emit 'aload *context-register*) ; Array of arrays.
                  (emit 'bipush (variable-level variable))
                  (emit 'aaload) ; Locals array for level in question.
                  (emit 'swap) ; array value
                  (emit 'bipush (variable-index variable)) ; array value index
                  (emit 'swap) ; array index value
                  (emit 'aastore))
                 (t
                  (emit 'aload 1) ; Stack: value array
                  (emit 'swap) ; array value
                  (emit 'bipush (variable-index variable)) ; array value index
                  (emit 'swap) ; array index value
                  (emit 'aastore)))))
        (t
         (push instruction *code*))))))

(defun finalize-code ()
  (setf *code* (nreverse (coerce *code* 'vector))))

(defun print-code()
  (dotimes (i (length *code*))
    (let ((instruction (aref *code* i)))
      (%format t "~D ~A ~S ~S ~S~%"
               i
               (opcode-name (instruction-opcode instruction))
               (instruction-args instruction)
               (instruction-stack instruction)
               (instruction-depth instruction)))))

(defun validate-labels (code)
  (let ((code (coerce code 'list))
        (i 0))
    (dolist (instruction code)
      (when (eql (instruction-opcode instruction) 202) ; LABEL
        (let ((label (car (instruction-args instruction))))
          (set label i)))
      (incf i))))

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
    (validate-labels *code*)
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
    (%format t "optimizations are disabled~%"))
  (when *enable-optimization*
    (when *compiler-debug*
      (%format t "----- before optimization -----~%")
      (print-code))
    (loop
      (let ((changed-p nil))
        (setf changed-p (or (optimize-1) changed-p))
        (setf changed-p (or (optimize-2) changed-p))
        (setf changed-p (or (optimize-3) changed-p))
        (setf changed-p (or (delete-unreachable-code) changed-p))
        (unless changed-p
          (return))))
    (unless (typep *code* 'vector)
      (setf *code* (coerce *code* 'vector)))
    (when *compiler-debug*
      (%format t "----- after optimization -----~%")
      (print-code))))

(defun code-bytes (code)
  (let ((length 0))
;;     (declare (type fixnum length))
    ;; Pass 1: calculate label offsets and overall length.
    (dotimes (i (length code))
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

(defun write-utf8 (string stream)
  (declare (optimize speed))
  (dotimes (i (length string))
    (declare (type fixnum i))
    (let ((c (schar string i)))
      (if (eql c #\null)
          (progn
            (sys::write-8-bits #xC0 stream)
            (sys::write-8-bits #x80 stream))
          (sys::write-8-bits (char-int c) stream)))))

(defun utf8-length (string)
  (declare (optimize speed))
  (let ((length (length string)))
    (declare (type fixnum length))
    (dotimes (i length)
      (declare (type fixnum i))
      (when (eql (schar string i) #\null)
        (incf length)))
    length))

(defun write-constant-pool-entry (entry stream)
  (declare (optimize speed))
  (let ((tag (first entry)))
    (write-u1 tag stream)
    (case tag
      (1 ; UTF8
       (write-u2 (utf8-length (third entry)) stream)
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
       (error "WRITE-CP-ENTRY unhandled tag ~D~%" tag)))))

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

(defstruct method
  access-flags
  name
  descriptor
  name-index
  descriptor-index
  max-stack
  max-locals
  code
  handlers)

(defun make-constructor (super name args body)
  (let* ((*compiler-debug* nil) ; We don't normally need to see debugging output for constructors.
         (constructor (make-method :name "<init>"
                                   :descriptor "()V"))
         (*code* ())
         (*handlers* nil))
    (setf (method-name-index constructor) (pool-name (method-name constructor)))
    (setf (method-descriptor-index constructor) (pool-name (method-descriptor constructor)))
    (setf (method-max-locals constructor) 1)
    (cond (*child-p*
           (emit 'aload_0) ;; this
           (let* ((*print-level* nil)
                  (*print-length* nil)
                  (s (%format nil "~S" args)))
             (emit 'ldc
                   (pool-string s))
             (emit-invokestatic +lisp-class+
                                "readObjectFromString"
                                "(Ljava/lang/String;)Lorg/armedbear/lisp/LispObject;"
                                0))
           (emit-invokespecial super
                               "<init>"
                               "(Lorg/armedbear/lisp/LispObject;)V"
                               -2))
          (*hairy-arglist-p*
           (emit 'aload_0) ;; this
           (emit 'aconst_null) ;; name
           (let* ((*print-level* nil)
                  (*print-length* nil)
                  (s (%format nil "~S" args)))
             (emit 'ldc
                   (pool-string s))
             (emit-invokestatic +lisp-class+
                                "readObjectFromString"
                                "(Ljava/lang/String;)Lorg/armedbear/lisp/LispObject;"
                                0))
           (emit-push-nil) ;; body
           (emit 'aconst_null) ;; environment
           (emit-invokespecial super
                               "<init>"
;;                                "(Lorg/armedbear/lisp/Symbol;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/Environment;)V"
                               `((,+lisp-symbol+ ,+lisp-object+ ,+lisp-object+ ,+lisp-environment+) nil)
                               -5))
          (t
           (emit 'aload_0)
           (emit-invokespecial super
                               "<init>"
                               "()V"
                               -1)))
    (setf *code* (append *static-code* *code*))
    (emit 'return)
    (finalize-code)
;;     (optimize-code)
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

(defun write-code-attr (method stream)
  (declare (optimize speed))
  (let* ((name-index (pool-name "Code"))
         (code (method-code method))
         (code-length (length code))
         (length (+ code-length 12
                    (* (length (method-handlers method)) 8)))
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
    (write-u2 0 stream) ; attributes count
    ))

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
    (setq *fields* (cons field *fields*))))

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

(defvar *declared-symbols* nil)
(defvar *declared-functions* nil)
(defvar *declared-strings* nil)
(defvar *declared-fixnums* nil)

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
        (emit-invokestatic +lisp-class+
                           "internInPackage"
                           "(Ljava/lang/String;Ljava/lang/String;)Lorg/armedbear/lisp/Symbol;"
                           -1)
        (emit 'putstatic
              *this-class*
              g
              +lisp-symbol+)
        (setf *static-code* *code*)
        (setf (gethash symbol *declared-symbols*) g)))
    g))

(defun declare-keyword (symbol)
  (let ((g (gethash symbol *declared-symbols*)))
    (unless g
      (let ((*code* *static-code*))
        (setf g (symbol-name (gensym)))
        (declare-field g +lisp-symbol+)
        (emit 'ldc (pool-string (symbol-name symbol)))
        (emit-invokestatic "org/armedbear/lisp/Keyword"
                           "internKeyword"
                           "(Ljava/lang/String;)Lorg/armedbear/lisp/Symbol;"
                           0)
        (emit 'putstatic
              *this-class*
              g
              +lisp-symbol+)
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
               (emit 'getstatic
                     *this-class*
                     g
                     +lisp-symbol+))
              (t
               (emit 'ldc (pool-string (symbol-name symbol)))
               (emit 'ldc (pool-string (package-name (symbol-package symbol))))
               (emit-invokestatic +lisp-class+
                                  "internInPackage"
                                  "(Ljava/lang/String;Ljava/lang/String;)Lorg/armedbear/lisp/Symbol;"
                                  -1)))
        (declare-field f +lisp-object+)
        (emit-invokevirtual +lisp-symbol-class+
                            "getSymbolFunctionOrDie"
                            "()Lorg/armedbear/lisp/LispObject;"
                            0)
        (emit 'putstatic
              *this-class*
              f
              +lisp-object+)
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
                 (emit 'getstatic
                       *this-class*
                       g
                       +lisp-symbol+))
                (t
                 (emit 'ldc (pool-string (symbol-name symbol)))
                 (emit 'ldc (pool-string (package-name (symbol-package symbol))))
                 (emit-invokestatic +lisp-class+
                                    "internInPackage"
                                    "(Ljava/lang/String;Ljava/lang/String;)Lorg/armedbear/lisp/Symbol;"
                                    -1)))
          (declare-field f +lisp-object+)
          (emit-invokevirtual +lisp-symbol-class+
                              "getSymbolSetfFunctionOrDie"
                              "()Lorg/armedbear/lisp/LispObject;"
                              0)
          (emit 'putstatic
                *this-class*
                f
                +lisp-object+)
          (setq *static-code* *code*)
          (setf (gethash name *declared-functions*) f))))
    f))

(defun declare-fixnum (n)
  (declare (type fixnum n))
  (let ((g (gethash n *declared-fixnums*)))
    (unless g
      (let ((*code* *static-code*))
        (setf g (%format nil "FIXNUM_~A~D"
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
        (emit-invokespecial +lisp-fixnum-class+ "<init>" "(I)V" -2)
        (emit 'putstatic *this-class* g +lisp-fixnum+)
        (setf *static-code* *code*)
        (setf (gethash n *declared-fixnums*) g)))
    g))

(defun declare-object-as-string (obj)
  (let* ((g (symbol-name (gensym)))
         (*print-level* nil)
         (*print-length* nil)
         (s (%format nil "~S" obj))
         (*code* *static-code*))
    (declare-field g +lisp-object+)
    (emit 'ldc
          (pool-string s))
    (emit-invokestatic +lisp-class+
                       "readObjectFromString"
                       "(Ljava/lang/String;)Lorg/armedbear/lisp/LispObject;"
                       0)
    (emit 'putstatic
          *this-class*
          g
          +lisp-object+)
    (setf *static-code* *code*)
    g))

(defun declare-package (obj)
  (let* ((g (symbol-name (gensym)))
         (*print-level* nil)
         (*print-length* nil)
         (s (%format nil "#.(FIND-PACKAGE ~S)" (package-name obj)))
         (*code* *static-code*))
    (declare-field g +lisp-object+)
    (emit 'ldc
          (pool-string s))
    (emit-invokestatic +lisp-class+
                       "readObjectFromString"
                       "(Ljava/lang/String;)Lorg/armedbear/lisp/LispObject;"
                       0)
    (emit 'putstatic
          *this-class*
          g
          +lisp-object+)
    (setf *static-code* *code*)
    g))

(defun declare-object (obj)
  (let ((key (symbol-name (gensym))))
    (sys::remember key obj)
    (let* ((g1 (declare-string key))
           (g2 (symbol-name (gensym)))
           (*code* *static-code*))
      (declare-field g2 +lisp-object+)
      (emit 'getstatic
            *this-class*
            g1
            +lisp-string+)
      (emit 'dup)
      (emit-invokestatic +lisp-class+
                         "recall"
                         "(Lorg/armedbear/lisp/SimpleString;)Lorg/armedbear/lisp/LispObject;"
                         0)
      (emit 'putstatic
            *this-class*
            g2
            +lisp-object+)
      (emit-invokestatic +lisp-class+
                         "forget"
                         "(Lorg/armedbear/lisp/SimpleString;)V"
                         -1)
      (setf *static-code* *code*)
      g2)))

(defun declare-lambda (obj)
  (let* ((g (symbol-name (gensym)))
         (*print-level* nil)
         (*print-length* nil)
         (s (%format nil "~S" obj))
         (*code* *static-code*))
    (declare-field g +lisp-object+)
    (emit 'ldc
          (pool-string s))
    (emit-invokestatic +lisp-class+
                       "readObjectFromString"
                       "(Ljava/lang/String;)Lorg/armedbear/lisp/LispObject;"
                       0)
    (emit-invokestatic +lisp-class+
                       "coerceToFunction"
                       "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                       0)
    (emit 'putstatic
          *this-class*
          g
          +lisp-object+)
    (setf *static-code* *code*)
    g))

(defun declare-local-function (local-function)
  (let* ((g (symbol-name (gensym)))
         (classfile (local-function-classfile local-function))
         (*code* *static-code*))
    (declare-field g +lisp-object+)
    (emit 'ldc
          (pool-string (file-namestring classfile)))
    (emit-invokestatic +lisp-class+
                       "loadCompiledFunction"
                       "(Ljava/lang/String;)Lorg/armedbear/lisp/LispObject;"
                       0)
    (emit 'putstatic
          *this-class*
          g
          +lisp-object+)
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
        (emit-invokespecial +lisp-simple-string-class+
                            "<init>"
                            "(Ljava/lang/String;)V"
                            -2)
        (emit 'putstatic
              *this-class*
              g
              +lisp-simple-string+)
        (setf *static-code* *code*)
        (setf (gethash string *declared-strings*) g)))
    g))

(defun compile-constant (form &key (target *val*) representation)
  (unless target
    (return-from compile-constant))
  (when (eq representation :unboxed-fixnum)
    (cond
     ((fixnump form)
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
                   (emit 'getstatic
                         +lisp-fixnum-class+
                         translation
                         +lisp-fixnum+)
                   (emit 'getstatic
                         *this-class*
                         (declare-fixnum n)
                         +lisp-fixnum+)))
             (emit 'getstatic
                   *this-class*
                   (declare-object-as-string form)
                   +lisp-object+)))
        ((stringp form)
         (if *compile-file-truename*
             (emit 'getstatic
                   *this-class*
                   (declare-string form)
                   +lisp-simple-string+)
             (emit 'getstatic
                   *this-class*
                   (declare-object form)
                   +lisp-object+)))
        ((vectorp form)
         (if *compile-file-truename*
             (emit 'getstatic
                   *this-class*
                   (declare-object-as-string form)
                   +lisp-object+)
             (emit 'getstatic
                   *this-class*
                   (declare-object form)
                   +lisp-object+)))
        ((characterp form)
         (emit 'getstatic
               *this-class*
               (declare-object-as-string form)
               +lisp-object+))
        ((or (classp form) (hash-table-p form) (typep form 'generic-function))
         (emit 'getstatic
               *this-class*
               (declare-object form)
               +lisp-object+))
        ((pathnamep form)
         (let ((g (if *compile-file-truename*
                      (declare-object-as-string form)
                      (declare-object form))))
           (emit 'getstatic
                 *this-class*
                 g
                 +lisp-object+)))
        ((packagep form)
         (let ((g (if *compile-file-truename*
                      (declare-package form)
                      (declare-object form))))
           (emit 'getstatic
                 *this-class*
                 g
                 +lisp-object+)))
        (t
         (if *compile-file-truename*
             (error "COMPILE-CONSTANT unhandled case ~S" form)
             (emit 'getstatic
                   *this-class*
                   (declare-object form)
                   +lisp-object+))))
  (emit-move-from-stack target))

(defparameter unary-operators (make-hash-table :test 'eq))

(defun define-unary-operator (operator translation)
  (setf (gethash operator unary-operators) translation))

(define-unary-operator '1+              "incr")
(define-unary-operator '1-              "decr")
(define-unary-operator 'ABS             "ABS")
(define-unary-operator 'ATOM            "ATOM")
(define-unary-operator 'BIT-VECTOR-P    "BIT_VECTOR_P")
(define-unary-operator 'CADR            "cadr")
(define-unary-operator 'CAR             "car")
(define-unary-operator 'CDDR            "cddr")
(define-unary-operator 'CDR             "cdr")
(define-unary-operator 'CHARACTERP      "CHARACTERP")
(define-unary-operator 'CLASS-OF        "classOf")
(define-unary-operator 'COMPLEXP        "COMPLEXP")
(define-unary-operator 'CONSTANTP       "CONSTANTP")
(define-unary-operator 'DENOMINATOR     "DENOMINATOR")
(define-unary-operator 'ENDP            "ENDP")
(define-unary-operator 'EVENP           "EVENP")
(define-unary-operator 'FIRST           "car")
(define-unary-operator 'FLOATP          "FLOATP")
(define-unary-operator 'INTEGERP        "INTEGERP")
(define-unary-operator 'LENGTH          "LENGTH")
(define-unary-operator 'LISTP           "LISTP")
(define-unary-operator 'MINUSP          "MINUSP")
(define-unary-operator 'NREVERSE        "nreverse")
(define-unary-operator 'NUMBERP         "NUMBERP")
(define-unary-operator 'NUMERATOR       "NUMERATOR")
(define-unary-operator 'ODDP            "ODDP")
(define-unary-operator 'PLUSP           "PLUSP")
(define-unary-operator 'RATIONALP       "RATIONALP")
(define-unary-operator 'REALP           "REALP")
(define-unary-operator 'REST            "cdr")
(define-unary-operator 'SECOND          "cadr")
(define-unary-operator 'SIMPLE-STRING-P "SIMPLE_STRING_P")
(define-unary-operator 'STRING          "STRING")
(define-unary-operator 'STRINGP         "STRINGP")
(define-unary-operator 'SYMBOLP         "SYMBOLP")
(define-unary-operator 'VECTORP         "VECTORP")
(define-unary-operator 'ZEROP           "ZEROP")

(defun compile-function-call-1 (fun args target representation)
  (let ((arg (first args)))
    (when (eq fun '1+)
      (return-from compile-function-call-1 (compile-plus (list '+ 1 arg)
                                                         :target target
                                                         :representation representation)))
    (let ((s (gethash fun unary-operators)))
      (cond (s
             (compile-form arg :target :stack)
             (maybe-emit-clear-values arg)
             (emit-invoke-method s target representation)
             t)
            ((eq fun 'LIST)
             (emit 'new +lisp-cons-class+)
             (emit 'dup)
             (compile-form arg :target :stack)
             (maybe-emit-clear-values arg)
             (emit-invokespecial +lisp-cons-class+
                                 "<init>"
                                 "(Lorg/armedbear/lisp/LispObject;)V"
                                 -2)
             t)
            (t
             nil)))))

(defparameter binary-operators (make-hash-table :test 'eq))

(defun define-binary-operator (operator translation)
  (setf (gethash operator binary-operators) translation))

(define-binary-operator 'eql                 "EQL")
(define-binary-operator 'equal               "EQUAL")
(define-binary-operator '+                   "add")
(define-binary-operator '-                   "subtract")
(define-binary-operator '/                   "divideBy")
(define-binary-operator '*                   "multiplyBy")
(define-binary-operator '<                   "IS_LT")
(define-binary-operator '<=                  "IS_LE")
(define-binary-operator '>                   "IS_GT")
(define-binary-operator '>=                  "IS_GE")
(define-binary-operator ' =                  "IS_E")
(define-binary-operator '/=                  "IS_NE")
(define-binary-operator 'mod                 "MOD")
(define-binary-operator 'ash                 "ash")
(define-binary-operator 'logand              "logand")
(define-binary-operator 'aref                "AREF")
(define-binary-operator 'sys::simple-typep   "typep")
(define-binary-operator 'rplaca              "RPLACA")
(define-binary-operator 'rplacd              "RPLACD")
(define-binary-operator 'sys::%rplaca        "_RPLACA")
(define-binary-operator 'sys::%rplacd        "_RPLACD")

(defun compile-binary-operation (op args target representation)
;;   (dformat t "compile-binary-operation op = ~S representation = ~S~%"
;;            op representation)
  (compile-form (first args) :target :stack)
  (compile-form (second args) :target :stack)
  (unless (and (single-valued-p (first args))
               (single-valued-p (second args)))
    (emit-clear-values))
  (emit-invokevirtual +lisp-object-class+
                      op
                      "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                      -1)
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
           (emit-invokestatic +lisp-class+
                              "list2"
                              "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/Cons;"
                              -1)
           (emit-move-from-stack target)
           t)
          (SYS::%STRUCTURE-REF
           (when (fixnump second)
             (compile-form first :target :stack)
             (maybe-emit-clear-values first)
             (emit 'sipush second)
             (emit-invokevirtual +lisp-object-class+
                                 "getSlotValue"
                                 "(I)Lorg/armedbear/lisp/LispObject;"
                                 -1)
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

(defun p2-eql (form &key (target *val*) representation)
;;   (dformat t "p2-eql form = ~S~%" form)
  (unless (= (length form) 3)
    (error "Wrong number of arguments for EQL."))
  (let ((arg1 (second form))
        (arg2 (third form)))
;;     (dformat t "arg1 = ~S~%" arg1)
;;     (dformat t "arg2 = ~S~%" arg2)
    (cond
     ((and (fixnum-or-unboxed-variable-p arg1)
           (fixnum-or-unboxed-variable-p arg2))
;;       (dformat t "p2-eql case 1~%")
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
      (emit-invokevirtual +lisp-object-class+
                          "eql"
                          "(I)Z"
                          -1)
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
      (emit-invokevirtual +lisp-object-class+
                          "eql"
                          "(I)Z"
                          -1)
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
;;       (dformat t "p2-eql case 3~%")
      (compile-form arg1 :target :stack)
      (compile-form arg2 :target :stack)
      (unless (and (single-valued-p arg1)
                   (single-valued-p arg2))
        (emit-clear-values))
      (emit-invokevirtual +lisp-object-class+
                          "EQL"
                          "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                          -1)
      (emit-move-from-stack target))))
  )

(defun compile-function-call-3 (op args target)
  (case op
    (LIST
     (compile-form (first args) :target :stack)
     (compile-form (second args) :target :stack)
     (compile-form (third args) :target :stack)
     (unless (every 'single-valued-p args)
       (emit-clear-values))
     (emit-invokestatic +lisp-class+
                        "list3"
                        "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/Cons;"
                        -2)
     (emit-move-from-stack target)
     t)
    (SYS::%STRUCTURE-SET
     (when (fixnump (second args))
       (compile-form (first args) :target :stack)
       (maybe-emit-clear-values (first args))
       (emit 'sipush (second args))
       (compile-form (third args) :target :stack)
       (maybe-emit-clear-values (third args))
       (emit-invokevirtual +lisp-object-class+
                           "setSlotValue"
                           "(ILorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                           -2)
       (emit-move-from-stack target)
       t))
    (t
     nil)))

(defvar *toplevel-defuns* nil)

(defsubst notinline-p (name)
  (declare (optimize speed))
  (eq (get name '%inline) 'NOTINLINE))

(defun inline-ok (name)
  (declare (optimize speed))
  (cond ((notinline-p name)
         nil)
        ((sys:built-in-function-p name)
         t)
        ((memq name *toplevel-defuns*)
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
        (cond ((<= numargs 4)
               (dolist (arg args)
                 (compile-form arg :target :stack)
                 (unless must-clear-values
                   (unless (single-valued-p arg)
                     (setf must-clear-values t)))))
              (t
               (emit 'sipush numargs)
               (emit 'anewarray "org/armedbear/lisp/LispObject")
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
  (let ((descriptor
         (case numargs
           (0 "()Lorg/armedbear/lisp/LispObject;")
           (1 "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
           (2 "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
           (3 "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
           (4 "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
           (t "([Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")))
        (stack-effect (if (< numargs 5)
                          (- numargs)
                          -1)))
    (emit-invokevirtual +lisp-object-class+ "execute" descriptor stack-effect)))

(defun emit-call-thread-execute (numargs)
  (let ((descriptor
         (case numargs
           (0 "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
           (1 "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
           (2 "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
           (3 "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
           (4 "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
           (t "(Lorg/armedbear/lisp/LispObject;[Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")))
        (stack-effect (if (< numargs 5)
                          (- (1+ numargs))
                          -2)))
    (emit-invokevirtual +lisp-thread-class+ "execute" descriptor stack-effect)))

(defun compile-function-call (form target representation)
  (let ((op (car form))
        (args (cdr form)))
    (unless (symbolp op)
      (error "COMPILE-FUNCTION-CALL ~S is not a symbol" op))
    (when (find-local-function op)
      (return-from compile-function-call (compile-local-function-call form target)))
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
      (cond
       ((eq op (compiland-name *current-compiland*)) ; recursive call
        (emit 'aload 0)) ; this
       ((inline-ok op)
        (emit 'getstatic
              *this-class*
              (declare-function op)
              +lisp-object+))
       ((null (symbol-package op))
        (let ((g (if *compile-file-truename*
                     (declare-object-as-string op)
                     (declare-object op))))
          (emit 'getstatic
                *this-class*
                g
                +lisp-object+)))
       (t
        (emit 'getstatic
              *this-class*
              (declare-symbol op)
              +lisp-symbol+)))
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

(define-source-transform funcall (&whole form fun &rest args)
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

(defun compile-funcall (form &key (target *val*) representation)
  (unless (> (length form) 1)
    (compiler-style-warn "Wrong number of arguments for ~A." (car form))
    (compile-function-call form target representation))
  (when (> *debug* *speed*)
    (return-from compile-funcall (compile-function-call form target representation)))
  (compile-form (cadr form) :target :stack)
  (maybe-emit-clear-values (cadr form))
  (compile-call (cddr form))
  (emit-move-from-stack target))

(defun compile-local-function-call (form target)
  (let* ((fun (car form))
         (args (cdr form))
         (local-function (find-local-function fun)))
    (aver (not (null local-function)))
    (cond ((local-function-variable local-function)
           ;; LABELS
           (emit 'var-ref (local-function-variable local-function) :stack))
          (t
           (let* ((g (if *compile-file-truename*
                         (declare-local-function local-function)
                         (declare-object (local-function-function local-function)))))
             (emit 'getstatic
                   *this-class*
                   g
                   +lisp-object+)))) ; Stack: template-function
    (emit 'sipush (length args))
    (emit 'anewarray "org/armedbear/lisp/LispObject")
    (let ((i 0)
          (must-clear-values nil))
      (dolist (arg args)
        (emit 'dup)
        (emit 'sipush i)
        (compile-form arg :target :stack)
        (emit 'aastore) ; store value in array
        (unless must-clear-values
          (unless (single-valued-p arg)
            (setf must-clear-values t)))
        (incf i))
      (when must-clear-values
        (emit-clear-values))) ; array left on stack here
    ;; Stack: template-function args
    (cond ((zerop *nesting-level*)
           ;; Make a vector of size 1.
           (emit 'sipush 1)
           (emit 'anewarray "[Lorg/armedbear/lisp/LispObject;")
           ;; Store args/locals register in slot 0.
           (emit 'dup)
           (emit 'sipush 0)
           (emit 'aload 1) ;; Args/locals register.
           (emit 'aastore))
          ((= *nesting-level* (local-function-nesting-level local-function))
           (emit 'aload 2))
          (t
           ;; This is the general case.
           (emit 'sipush (local-function-nesting-level local-function))
           (emit 'anewarray "[Lorg/armedbear/lisp/LispObject;")
           (dotimes (i (1- (local-function-nesting-level local-function)))
             (emit 'dup)
             (emit 'sipush i)
             (emit 'aload 2)
             (emit 'sipush i)
             (emit 'aaload)
             (emit 'aastore))
           (emit 'dup)
           (emit 'sipush (1- (local-function-nesting-level local-function)))
           (emit 'aload 1) ; Args/locals.
           (emit 'aastore)))
    ;; Stack: template-function args context
    (emit-invokevirtual +lisp-object-class+
                        "execute"
                        "([Lorg/armedbear/lisp/LispObject;[[Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                        -2)
    (cond ((null target)
           (emit 'pop)
           (maybe-emit-clear-values form))
          ((eq target :stack))
          ((fixnump target)
           (emit 'astore target))
          (t
           (%format t "line 1876~%")
           (aver nil)))))

(defparameter java-predicates (make-hash-table :test 'eq))

(defun define-java-predicate (predicate translation)
  (setf (gethash predicate java-predicates) translation))

(define-java-predicate 'CHARACTERP         "characterp")
(define-java-predicate 'CONSTANTP          "constantp")
(define-java-predicate 'ENDP               "endp")
(define-java-predicate 'EVENP              "evenp")
(define-java-predicate 'FLOATP             "floatp")
(define-java-predicate 'INTEGERP           "integerp")
(define-java-predicate 'LISTP              "listp")
(define-java-predicate 'MINUSP             "minusp")
(define-java-predicate 'NUMBERP            "numberp")
(define-java-predicate 'ODDP               "oddp")
(define-java-predicate 'PLUSP              "plusp")
(define-java-predicate 'RATIONALP          "rationalp")
(define-java-predicate 'REALP              "realp")
(define-java-predicate 'STRINGP            "stringp")
(define-java-predicate 'SPECIAL-VARIABLE-P "isSpecialVariable")
(define-java-predicate 'VECTORP            "vectorp")
(define-java-predicate 'ZEROP              "zerop")

(defun compile-test-2 (form negatep)
;;   (dformat t "compile-test-2 ~S~%" form)
  (let* ((op (car form))
         (args (cdr form))
         (arg (car args))
         variable)
    (when (memq op '(NOT NULL))
      (return-from compile-test-2 (compile-test arg (not negatep))))
    (when (setf variable (unboxed-fixnum-variable arg))
      (case op
        (MINUSP
         (dformat t "compile-test-2 minusp case~%")
         (aver (variable-register variable))
         (emit 'iload (variable-register variable))
         (return-from compile-test-2 (if negatep 'iflt 'ifge))
         )
        ))
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
        (emit-invokevirtual +lisp-object-class+
                            s
                            "()Z"
                            0)
        (return-from compile-test-2 (if negatep 'ifne 'ifeq)))))
  ;; Otherwise...
  (compile-form form :target :stack)
  (maybe-emit-clear-values form)
  (emit-push-nil)
  (if negatep 'if_acmpne 'if_acmpeq))

(defun p2-numeric-comparison (form &key (target *val*) representation)
  (let ((op (car form))
        (args (cdr form)))
    (case (length args)
      (2
       (let ((first (first args))
             (second (second args))
             var1 var2)
         (cond
          ((and (fixnump first) (fixnump second))
           (dformat t "p2-numeric-comparison form = ~S~%" form)
           (if (funcall op first second)
               (emit-push-t)
               (emit-push-nil))
           (return-from p2-numeric-comparison))
          ((fixnump second)
           (dformat t "p2-numeric-comparison form = ~S~%" form)
           (compile-form (car args) :target :stack)
           (unless (single-valued-p first)
             (emit-clear-values))
           (emit-push-constant-int second)
           (emit-invokevirtual +lisp-object-class+
                               (case op
                                 (<  "isLessThan")
                                 (<= "isLessThanOrEqualTo")
                                 (>  "isGreaterThan")
                                 (>= "isGreaterThanOrEqualTo")
                                 (=  "isEqualTo")
                                 (/= "isNotEqualTo"))
                               "(I)Z"
                               -1)
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
             (return-from p2-numeric-comparison))
           )
          ) ; cond
       ))))
  ;; Still here?
  (compile-function-call form target representation)
  )

(defun compile-test-3 (form negatep)
;;   (dformat t "compile-test-3 form = ~S~%" form)
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
                              "(I)Z"
                              -1)
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
                                "(I)Z"
                                -1)
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
          (cond
           ((fixnump second)
            (compile-form first :target :stack)
            (maybe-emit-clear-values first)
            (emit-push-constant-int second)
            (emit-invokevirtual +lisp-object-class+ s "(I)Z" -1))
           ((setf variable (unboxed-fixnum-variable second))
            (compile-form first :target :stack)
            (maybe-emit-clear-values first)
            (aver (variable-register variable))
            (emit 'iload (variable-register variable))
            (emit-invokevirtual +lisp-object-class+ s "(I)Z" -1))
           (t
            (process-args args)
            (emit-invokevirtual +lisp-object-class+
                                s
                                "(Lorg/armedbear/lisp/LispObject;)Z"
                                -1)))
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

(defun compile-if (form &key (target *val*) representation)
;;   (dformat t "compile-if form = ~S~%" form)
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
           (compile-form consequent :target target)
           (emit 'goto LABEL2)
           (label LABEL1)
           (compile-form alternate :target target)
           (label LABEL2)))))

(defun compile-multiple-value-list (form &key (target *val*) representation)
  ;; Added Dec 9 2004 7:52 PM
  (emit-clear-values)

  (compile-form (second form) :target :stack)
  (emit-invokestatic +lisp-class+
                     "multipleValueList"
                     "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                     0)
  (emit-move-from-stack target))

(defun compile-multiple-value-prog1 (form &key (target *val*) representation)
  (let ((first-subform (cadr form))
        (subforms (cddr form))
        (result-register (allocate-register))
        (values-register (allocate-register)))

    ;; Added Dec 9 2004 3:46 AM
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

(defun compile-multiple-value-call (form &key (target *val*) representation)
  (case (length form)
    (1
     (error "Wrong number of arguments for MULTIPLE-VALUE-CALL."))
    (2
     (compile-form (second form) :target :stack)
     (emit-invokestatic +lisp-class+
                        "coerceToFunction"
                        "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                        0)
     (emit-invokevirtual +lisp-object-class+
                         "execute"
                         "()Lorg/armedbear/lisp/LispObject;"
                         0)
     (emit-move-from-stack target))
    (3
     (let* ((*register* *register*)
            (function-register (allocate-register)))
       (compile-form (second form) :target function-register)
       (compile-form (third form) :target :stack)
       (emit 'aload function-register)
       (emit-push-current-thread)
       (emit-invokestatic +lisp-class+
                          "multipleValueCall1"
                          "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispThread;)Lorg/armedbear/lisp/LispObject;"
                          -2)
       (emit-move-from-stack target)))
    (t
     ;; The general case.
     (let* ((*register* *register*)
            (function-register (allocate-register))
            (values-register (allocate-register)))
       (compile-form (second form) :target :stack)
       (emit-invokestatic +lisp-class+
                          "coerceToFunction"
                          "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                          0)
       (emit-move-from-stack function-register)
       (emit 'aconst_null)
       (emit 'astore values-register)
       (dolist (values-form (cddr form))
         (compile-form values-form :target :stack)
         (emit-push-current-thread)
         (emit 'swap)
         (emit 'aload values-register)
         (emit-invokevirtual +lisp-thread-class+
                             "accumulateValues"
                             "(Lorg/armedbear/lisp/LispObject;[Lorg/armedbear/lisp/LispObject;)[Lorg/armedbear/lisp/LispObject;"
                             -2)
         (emit 'astore values-register)
         (maybe-emit-clear-values values-form))
       (emit 'aload function-register)
       (emit 'aload values-register)
       (emit-invokevirtual +lisp-object-class+
                           "execute"
                           "([Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                           -1)
       (emit-move-from-stack target)))))

;; Generates code to bind variable to value at top of runtime stack.
(defun compile-binding (variable)
  (cond ((variable-register variable)
         (emit 'astore (variable-register variable)))
        ((variable-special-p variable)
         (emit-push-current-thread)
         (emit 'swap)
         (emit 'getstatic
               *this-class*
               (declare-symbol (variable-name variable))
               +lisp-symbol+)
         (emit 'swap)
         (emit-invokevirtual +lisp-thread-class+
                             "bindSpecial"
                             "(Lorg/armedbear/lisp/Symbol;Lorg/armedbear/lisp/LispObject;)V"
                             -3))
        (*use-locals-vector*
         (emit 'aload 1) ; Stack: value array
         (emit 'swap) ; array value
         (emit 'bipush (variable-index variable)) ; array value index
         (emit 'swap) ; array index value
         (emit 'aastore))
        (t
         (aver nil))))

(defun compile-multiple-value-bind (form &key (target *val*) representation)
  (let* ((block (make-block-node :name '(MULTIPLE-VALUE-BIND)))
         (*blocks* (cons block *blocks*))
         (*register* *register*)
         (*visible-variables* *visible-variables*)
         (specials ())
         (vars (second form))
         (bind-special-p nil)
         (variables ()))
    ;; Process declarations.
    (dolist (f (cdddr form))
      (unless (and (consp f) (eq (car f) 'declare))
        (return))
      (let ((decls (cdr f)))
        (dolist (decl decls)
          (when (eq (car decl) 'special)
            (setf specials (append (cdr decl) specials))))))
    ;; Process variables and allocate registers for them.
    (dolist (var vars)
      (let* ((special-p (if (or (memq var specials) (special-variable-p var)) t nil))
             (variable
              (make-variable :name var
                             :special-p special-p
                             :index (if special-p nil (length (context-vars *context*)))
                             :register (if (or special-p *use-locals-vector*) nil (allocate-register)))))
        (if special-p
            (setf bind-special-p t)
            (add-variable-to-context variable))
        (push variable variables)))
    (setf variables (nreverse variables))
    ;; If we're going to bind any special variables...
    (when bind-special-p
      ;; Save current dynamic environment.
      (setf (block-environment-register block) (allocate-register))
      (emit-push-current-thread)
      (emit 'getfield +lisp-thread-class+ "lastSpecialBinding" +lisp-binding+)
      (emit 'astore (block-environment-register block)))

    ;; Added Dec 9 2004 3:46 AM
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
             (emit-invokevirtual +lisp-thread-class+
                                 "getValues"
                                 "(Lorg/armedbear/lisp/LispObject;I)[Lorg/armedbear/lisp/LispObject;"
                                 -2)
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
      (push variable *visible-variables*)
      (push variable *all-variables*))
    ;; Body.
    (compile-progn-body (cdddr form) target)
    (when bind-special-p
      ;; Restore dynamic environment.
      (emit 'aload *thread*)
      (emit 'aload (block-environment-register block))
      (emit 'putfield +lisp-thread-class+ "lastSpecialBinding" +lisp-binding+))))

(defun compile-let/let*-node (block target)
  (let* ((*blocks* (cons block *blocks*))
         (*register* *register*)
         (form (block-form block))
         (*visible-variables* *visible-variables*)
         (varlist (cadr form))
         (specialp nil))
    ;; Are we going to bind any special variables?
    (dolist (variable (block-vars block))
      (when (variable-special-p variable)
        (setf specialp t)
        (return)))
    ;; If so...
    (when specialp
      ;; Save current dynamic environment.
      (setf (block-environment-register block) (allocate-register))
      (emit-push-current-thread)
      (emit 'getfield +lisp-thread-class+ "lastSpecialBinding" +lisp-binding+)
      (emit 'astore (block-environment-register block)))
    (ecase (car form)
      (LET
       (compile-let-bindings block))
      (LET*
       (compile-let*-bindings block)))
    ;; Body of LET/LET*.
    (compile-progn-body (cddr form) target)
    (when specialp
      ;; Restore dynamic environment.
      (emit 'aload *thread*)
      (emit 'aload (block-environment-register block))
      (emit 'putfield +lisp-thread-class+ "lastSpecialBinding" +lisp-binding+))))

(defun compile-let-bindings (block)
  (dolist (variable (block-vars block))
    (unless (variable-special-p variable)
      (setf (variable-index variable) (length (context-vars *context*)))
      (unless *use-locals-vector*
        (setf (variable-register variable) (allocate-register)))
      (add-variable-to-context variable)))
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
               (cond
                ((and *trust-user-type-declarations*
                      (variable-register variable)
                      (variable-declared-type variable)
                      (subtypep (variable-declared-type variable) 'FIXNUM))
                 (dformat t "compile-let-bindings declared fixnum case: ~S~%"
                          (variable-name variable))
                 (setf (variable-representation variable) :unboxed-fixnum)
                 (compile-form initform :target :stack :representation :unboxed-fixnum))
                ((and (variable-register variable)
                      (eql (variable-writes variable) 0)
                      (subtypep (derive-type initform) 'FIXNUM))
                 (dformat t "compile-let-bindings read-only fixnum case: ~S~%"
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
        (cond
         ((variable-special-p variable)
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
    (push variable *visible-variables*)
    (push variable *all-variables*)))

(defun compile-let*-bindings (block)
  (let ((must-clear-values nil))
    ;; Generate code to evaluate initforms and bind variables.
    (dolist (variable (block-vars block))
      (let* ((initform (variable-initform variable))
             (boundp nil))
        (cond ((and (variable-special-p variable)
                    (eq initform (variable-name variable)))
               (emit-push-current-thread)
               (emit 'getstatic
                     *this-class*
                     (declare-symbol (variable-name variable))
                     +lisp-symbol+)
               (emit-invokevirtual +lisp-thread-class+
                                   "bindSpecialToCurrentValue"
                                   "(Lorg/armedbear/lisp/Symbol;)V"
                                   -2)
               (setf boundp t))
              (initform
               (cond
                ((and *trust-user-type-declarations*
                      (not *use-locals-vector*)
                      (not (variable-special-p variable))
                      (variable-declared-type variable)
                      (subtypep (variable-declared-type variable) 'FIXNUM))
                 (dformat t "compile-let*-bindings declared fixnum case~%")
                 (setf (variable-representation variable) :unboxed-fixnum)
                 (compile-form initform :target :stack :representation :unboxed-fixnum)
                 (setf (variable-register variable) (allocate-register))
                 (emit 'istore (variable-register variable))
                 (setf boundp t))
                ((and (not *use-locals-vector*)
                      (not (variable-special-p variable))
                      (eql (variable-writes variable) 0)
                      (subtypep (derive-type initform) 'FIXNUM))
                 (dformat t "compile-let*-bindings read-only fixnum case: ~S~%"
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
          (setf (variable-index variable) (length (context-vars *context*)))
          (unless (or *use-locals-vector* (variable-register variable))
            (setf (variable-register variable) (allocate-register)))
          (add-variable-to-context variable))
        (push variable *visible-variables*)
        (push variable *all-variables*)
        (unless boundp
          (compile-binding variable))))
    (when must-clear-values
      (emit-clear-values))))

;; Returns list of declared specials.
(defun process-special-declarations (forms)
  (let ((specials ()))
    (dolist (form forms)
      (unless (and (consp form) (eq (car form) 'declare))
        (return))
      (let ((decls (cdr form)))
        (dolist (decl decls)
          (when (eq (car decl) 'special)
            (setf specials (append (cdr decl) specials))))))
    specials))

(defun compile-locally (form &key (target *val*) representation)
  (let ((*visible-variables* *visible-variables*)
        (specials (process-special-declarations (cdr form))))
    (dolist (var specials)
      (push-variable var t))
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

(defun compile-tagbody-node (block target)
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

    ;; FIXME Pass 1 doesn't detect all non-local GOs! (HANDLER-CASE.17)
    ;; So we do this unconditionally for now...
    (when (or t (block-non-local-go-p block))
      (setf environment-register (allocate-register))
      (emit-push-current-thread)
      (emit 'getfield +lisp-thread-class+ "lastSpecialBinding" +lisp-binding+)
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
            (emit 'getstatic
                  *this-class*
                  (if *compile-file-truename*
                      (declare-object-as-string (tag-label tag))
                      (declare-object (tag-label tag)))
                  +lisp-object+)

            (emit 'if_acmpne NEXT) ;; Jump if not EQ.
            ;; Restore dynamic environment.
            (emit-push-current-thread)
            (aver (fixnump environment-register))
            (emit 'aload environment-register)
            (emit 'putfield +lisp-thread-class+ "lastSpecialBinding" +lisp-binding+)
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
;;       (dformat t "compile-tagbody-node calling emit-clear-values~%")
      (emit-clear-values))
    ;; TAGBODY returns NIL.
    (when target
      (emit-push-nil)
      (emit-move-from-stack target))))

(defun compile-go (form &key target representation)
  (let* ((name (cadr form))
         (tag (find-tag name)))
    (unless tag
      (error "COMPILE-GO: tag not found: ~S" name))
    (cond ((eq (tag-compiland tag) *current-compiland*)
           ;; Local case.
           (let ((tag-block (tag-block tag))
                 (register nil))
             ;; Does the GO leave an enclosing UNWIND-PROTECT?
             (let ((protected
                    (dolist (enclosing-block *blocks*)
                      (when (eq enclosing-block tag-block)
                        (return nil))
                      (when (equal (block-name enclosing-block) '(UNWIND-PROTECT))
                        (return t)))))
               (when protected
                 (error "COMPILE-GO: enclosing UNWIND-PROTECT")))
             (dolist (block *blocks*)
               (if (eq block tag-block)
                   (return)
                   (setf register (or (block-environment-register block) register))))
             (when register
               ;; Restore dynamic environment.
               (emit 'aload *thread*)
               (emit 'aload register)
               (emit 'putfield +lisp-thread-class+ "lastSpecialBinding" +lisp-binding+)))
           (emit 'goto (tag-label tag)))
          (t
           ;; Non-local GO.
           (emit 'new +lisp-go-class+)
           (emit 'dup)
           (compile-form `',(tag-label tag) :target :stack) ; Tag.
           (emit-invokespecial +lisp-go-class+
                               "<init>"
                               "(Lorg/armedbear/lisp/LispObject;)V"
                               -2)
           (emit 'athrow)
           ;; Following code will not be reached, but is needed for JVM stack
           ;; consistency.
           (when target
             (emit-push-nil)
             (emit-move-from-stack target))))))

(defun compile-atom (form &key (target *val*) representation)
  (unless (= (length form) 2)
    (error "Wrong number of arguments for ATOM."))
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

(defun contains-return (form)
  (if (atom form)
      (if (node-p form)
          (contains-return (node-form form))
          nil)
      (case (car form)
        (QUOTE
         nil)
        (RETURN-FROM
         t)
        (t
         (dolist (subform form)
           (when (contains-return subform)
             (return t)))))))

(defun compile-block (form &key (target *val*) representation)
;;   (format t "compile-block ~S~%" (cadr form))
  ;; This shouldn't be called, now that we have pass 1.
;;   (assert nil)
  (let ((block (make-block-node :form form
                                :name (cadr form)
                                :target target)))
    (compile-block-node block target)
  ))

(defun compile-block-node (block target)
;;   (dformat t "COMPILE-BLOCK-NODE ~S block-return-p = ~S~%"
;;            (block-name block) (block-return-p block))
  (unless (block-node-p block)
    (%format t "type-of block = ~S~%" (type-of block))
    (aver (block-node-p block)))
  (let* ((*blocks* (cons block *blocks*))
         (*register* *register*))
    (setf (block-target block) target)
    (when (block-return-p block)
      ;; Save current dynamic environment.
      (setf (block-environment-register block) (allocate-register))
      (emit-push-current-thread)
      (emit 'getfield +lisp-thread-class+ "lastSpecialBinding" +lisp-binding+)
      (emit 'astore (block-environment-register block)))
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
      (emit 'putfield +lisp-thread-class+ "lastSpecialBinding" +lisp-binding+))))

(defun compile-return-from (form &key (target *val*) representation)
  (let* ((name (second form))
         (result-form (third form))
         (block (find-block name)))
    (cond
     ((null block)
      (error "No block named ~S is currently visible." name))
     ((eq (block-compiland block) *current-compiland*)
      ;; Local case. Is the RETURN nested inside an UNWIND-PROTECT which
      ;; is inside the block we're returning from?
      (let ((protected
             (dolist (enclosing-block *blocks*)
               (when (eq enclosing-block block)
                 (return nil))
               (when (equal (block-name enclosing-block) '(UNWIND-PROTECT))
                 (return t)))))
        (when protected
          (error "COMPILE-RETURN-FROM: enclosing UNWIND-PROTECT")))

      ;; Added Dec 9 2004 7:28 AM
;;       (dformat t "compile-return-from calling emit-clear-values~%")
      (emit-clear-values)

      (compile-form result-form :target (block-target block))
      (emit 'goto (block-exit block)))
     (t
      ;; Non-local RETURN.
      (setf (block-non-local-return-p block) t)
      (emit 'new +lisp-return-class+)
      (emit 'dup)
      (compile-form `',(block-catch-tag block) :target :stack) ; Tag.

      ;; Added Dec 9 2004 7:28 AM
      (emit-clear-values)

      (compile-form (third form) :target :stack) ; Result.
      (emit-invokespecial +lisp-return-class+
                          "<init>"
                          "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)V"
                          -3)
      (emit 'athrow)
      ;; Following code will not be reached, but is needed for JVM stack
      ;; consistency.
      (when target
        (emit-push-nil)
        (emit-move-from-stack target))))))

(defun compile-cons (form &key (target *val*) representation)
  (unless (check-args form 2)
    (compile-function-call form target representation)
    (return-from compile-cons))
  (emit 'new +lisp-cons-class+)
  (emit 'dup)
  (process-args (cdr form))
  (emit-invokespecial "org/armedbear/lisp/Cons"
                      "<init>"
                      "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)V"
                      -3)
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
;;                    (dformat t "compile-progn-body not single-valued: ~S~%" form)
                   (setf must-clear-values t)))))))))

(defun compile-progn (form &key (target *val*) representation)
  (compile-progn-body (cdr form) target)
  (when (eq representation :unboxed-fixnum)
    (emit-unbox-fixnum)))

(defun compile-quote (form &key (target *val*) representation)
   (let ((obj (second form)))
     (cond ((null obj)
            (when target
              (emit-push-nil)
              (emit-move-from-stack target)))
           ((symbolp obj)
            (if (symbol-package obj)
                (let ((g (declare-symbol obj)))
                  (emit 'getstatic
                        *this-class*
                        g
                        +lisp-symbol+))
                ;; An uninterned symbol.
                (let ((g (if *compile-file-truename*
                             (declare-object-as-string obj)
                             (declare-object obj))))
                  (emit 'getstatic
                        *this-class*
                        g
                        +lisp-object+)))
            (emit-move-from-stack target))
           ((listp obj)
            (let ((g (if *compile-file-truename*
                         (declare-object-as-string obj)
                         (declare-object obj))))
              (emit 'getstatic
                    *this-class*
                    g
                    +lisp-object+)
              (emit-move-from-stack target)))
           ((constantp obj)
            (compile-constant obj :target target))
           (t
            (error "COMPILE-QUOTE: unsupported case: ~S" form)))))

(defun compile-rplacd (form &key (target *val*) representation)
  (let ((args (cdr form)))
    (unless (= (length args) 2)
      (error "wrong number of arguments for RPLACD"))
    (compile-form (first args) :target :stack)
    (when target
      (emit 'dup))
    (compile-form (second args) :target :stack)
    (emit-invokevirtual +lisp-object-class+
                        "setCdr"
                        "(Lorg/armedbear/lisp/LispObject;)V"
                        -2)
    (when target
      (emit-move-from-stack target))))

(defun compile-declare (form &key target representation)
  (when target
    (emit-push-nil)
    (emit-move-from-stack target)))

(defun compile-local-function (definition local-function)
  (let* ((name (car definition))
         (arglist (cadr definition))
         form
         function
         classfile)
    (when (or (memq '&optional arglist)
              (memq '&key arglist))
      (let ((state nil))
        (dolist (arg arglist)
          (cond ((memq arg lambda-list-keywords)
                 (setf state arg))
                ((memq state '(&optional &key))
                 (when (and (consp arg)
                            (not (constantp (second arg))))
                   (error "COMPILE-LOCAL-FUNCTION: can't handle optional argument with non-constant initform.")))))))
    (multiple-value-bind (body decls) (sys::parse-body (cddr definition))
      (setf body (list (list* 'BLOCK name body)))
      (dolist (decl decls)
        (push decl body))
      (setf form (list* 'LAMBDA arglist body)))
    (let ((*nesting-level* (1+ *nesting-level*)))
      (cond (*compile-file-truename*
             (setf classfile (sys::next-classfile-name))
             (compile-defun name form nil classfile))
            (t
             (setf classfile (prog1
                              (%format nil "local-~D.class" *child-count*)
                              (incf *child-count*)))
             (compile-defun name form nil classfile)
             (setf function (sys:load-compiled-function classfile)))))
    (cond (local-function
           (setf (local-function-classfile local-function) classfile)
           (let ((g (if *compile-file-truename*
                        (declare-local-function local-function)
                        (declare-object function))))
             (emit 'getstatic
                   *this-class*
                   g
                   +lisp-object+)
             (emit 'var-set (local-function-variable local-function))))
          (t
           (push (make-local-function :name name
                                      :function function
                                      :classfile classfile)
                 *local-functions*)))))

(defun compile-flet (form &key (target *val*) representation)
  (if *use-locals-vector*
      (let ((*local-functions* *local-functions*)
            (definitions (cadr form))
            (body (cddr form)))
        (dolist (definition definitions)
          (compile-local-function definition nil))
        (do ((forms body (cdr forms)))
            ((null forms))
          (compile-form (car forms) :target (if (cdr forms) nil target))))
      (error "COMPILE-FLET: unsupported case.")))

(defun compile-labels (form &key target representation)
  (if *use-locals-vector*
      (let ((*local-functions* *local-functions*)
            (definitions (cadr form))
            (body (cddr form)))
        (dolist (definition definitions)
          (let* ((name (car definition))
                 (variable (push-variable (copy-symbol name) nil)))
            (push (make-local-function :name name :variable variable)
                  *local-functions*)))
        (dolist (definition definitions)
          (let* ((name (car definition))
                 (local-function (find-local-function name)))
            (compile-local-function definition local-function)))
        (do ((forms body (cdr forms)))
            ((null forms))
          (compile-form (car forms) :target (if (cdr forms) nil target))))
      (error "COMPILE-LABELS: unsupported case.")))

(defun contains-symbol (symbol form)
  (cond ((node-p form)
         (contains-symbol symbol (node-form form)))
        ((atom form)
         (eq form symbol))
        (t
         (or (contains-symbol symbol (car form))
             (contains-symbol symbol (cdr form))))))

(defun contains-go (form)
  (cond ((node-p form)
         (contains-go (node-form form)))
        ((atom form)
         nil)
        (t
         (case (car form)
           (QUOTE
            nil)
           (GO
            t)
           (t
            (dolist (subform form)
              (when (contains-go subform)
                (return t))))))))

(defun compile-lambda (form target)
  (let* ((closure-vars *visible-variables*)
         (lambda-list (cadr form))
         (lambda-body (cddr form)))
    (unless *use-locals-vector*
      (error "*USE-LOCALS-VECTOR* is NIL, can't compile lambda form~S"))
    (when (or (memq '&optional lambda-list)
              (memq '&key lambda-list))
      (let ((state nil))
        (dolist (arg lambda-list)
          (cond ((memq arg lambda-list-keywords)
                 (setf state arg))
                ((memq state '(&optional &key))
                 (when (and (consp arg)
                            (not (constantp (second arg))))
                   (error "COMPILE-LAMBDA: can't handle optional argument with non-constant initform.")))))))
    (cond (*compile-file-truename*
           (let ((classfile
                  (let ((*nesting-level* (1+ *nesting-level*)))
                    (compile-defun nil form nil (sys::next-classfile-name)))))
             (let* ((local-function (make-local-function :classfile classfile))
                    (g (declare-local-function local-function)))
               (emit 'getstatic
                     *this-class*
                     g
                     +lisp-object+))))
          (t
           (let* ((classfile
                   (prog1
                    (%format nil "local-~D.class" *child-count*)
                    (incf *child-count*)))
                  (compiled-function (sys:load-compiled-function
                                      (let ((*nesting-level* (1+ *nesting-level*)))
                                        (compile-defun nil form nil classfile)))))
             (emit 'getstatic
                   *this-class*
                   (declare-object compiled-function)
                   +lisp-object+))))
    ;; Stack: template-function
    (cond ((zerop *nesting-level*)
           ;; Make a vector of size 1.
           (emit 'sipush 1)
           (emit 'anewarray "[Lorg/armedbear/lisp/LispObject;")
           ;; Store args/locals register in slot 0.
           (emit 'dup)
           (emit 'sipush 0)
           (emit 'aload 1) ;; Args/locals register.
           (emit 'aastore))
          (t
;;            (emit 'aload 2)
           (error "nesting level > 0, not supported")
           ))
    (emit-invokestatic +lisp-class+
                       "makeCompiledClosure"
                       "(Lorg/armedbear/lisp/LispObject;[[Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                       -1) ; Stack: compiled-closure
    (emit-move-from-stack target)))

(defun compile-function (form &key (target *val*) representation)
  (let ((name (second form))
        (local-function))
    (cond ((symbolp name)
           (cond ((setf local-function (find-local-function name))
                  (if (local-function-variable local-function)
                      (emit 'var-ref (local-function-variable local-function) :stack)
                      (let ((g (if *compile-file-truename*
                                   (declare-local-function local-function)
                                   (declare-object (local-function-function local-function)))))
                        (emit 'getstatic
                              *this-class*
                              g
                              +lisp-object+))) ; Stack: template-function
;;                   (emit 'aload *context-register*) ; Stack: template-function context
                  (cond ((zerop *nesting-level*)
                         ;; Make a vector of size 1.
                         (emit 'sipush 1)
                         (emit 'anewarray "[Lorg/armedbear/lisp/LispObject;")
                         ;; Store args/locals register in slot 0.
                         (emit 'dup)
                         (emit 'sipush 0)
                         (emit 'aload 1) ;; Args/locals register.
                         (emit 'aastore))
                        ((= *nesting-level* (local-function-nesting-level local-function))
                         (emit 'aload 2))
                        (t
                         ;; This is the general case.
                         (emit 'sipush (local-function-nesting-level local-function))
                         (emit 'anewarray "[Lorg/armedbear/lisp/LispObject;")
                         (dotimes (i (1- (local-function-nesting-level local-function)))
                           (emit 'dup)
                           (emit 'sipush i)
                           (emit 'aload 2)
                           (emit 'sipush i)
                           (emit 'aaload)
                           (emit 'aastore))
                         (emit 'dup)
                         (emit 'sipush (1- (local-function-nesting-level local-function)))
                         (emit 'aload 1) ; Args/locals.
                         (emit 'aastore)))


                  (emit-invokestatic +lisp-class+
                                     "makeCompiledClosure"
                                     "(Lorg/armedbear/lisp/LispObject;[[Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                                     -1) ; Stack: compiled-closure
                  (emit-move-from-stack target))
                 ((inline-ok name)
                  (emit 'getstatic
                        *this-class*
                        (declare-function name)
                        +lisp-object+)
                  (emit-move-from-stack target))
                 (t
                  (emit 'getstatic
                        *this-class*
                        (declare-symbol name)
                        +lisp-symbol+)
                  (emit-invokevirtual +lisp-object-class+
                                      "getSymbolFunctionOrDie"
                                      "()Lorg/armedbear/lisp/LispObject;"
                                      0)
                  (emit-move-from-stack target))))
          ((and (consp name) (eq (car name) 'SETF))
           ; FIXME Need to check for NOTINLINE declaration!
           (cond ((member name *toplevel-defuns* :test #'equal)
                  (emit 'getstatic
                        *this-class*
                        (declare-setf-function name)
                        +lisp-object+)
                  (emit-move-from-stack target))
                 ((and (null *compile-file-truename*)
                       (fdefinition name))
                  (emit 'getstatic
                        *this-class*
                        (declare-object (fdefinition name))
                        +lisp-object+)
                  (emit-move-from-stack target))
                 (t
                  (emit 'getstatic
                        *this-class*
                        (declare-symbol (cadr name))
                        +lisp-symbol+)
                  (emit-invokevirtual +lisp-symbol-class+
                                      "getSymbolSetfFunctionOrDie"
                                      "()Lorg/armedbear/lisp/LispObject;"
                                      0)
                  (emit-move-from-stack target))))
          ((and (consp name) (eq (car name) 'LAMBDA))
           (compile-lambda name target))
          (t
           (error "COMPILE-FUNCTION: unsupported case: ~S" form)))))

(defun p2-ash (form &key (target *val*) representation)
  (dformat t "p2-ash form = ~S representation = ~S~%" form representation)
  (unless (check-args form 2)
    (compile-function-call form target representation)
    (return-from p2-ash))
  (let* ((args (cdr form))
         (len (length args))
         (arg1 (first args))
         (arg2 (second args))
         (var1 (unboxed-fixnum-variable arg1))
         (var2 (unboxed-fixnum-variable arg2)))
    (cond
     ((and (numberp arg1) (numberp arg2))
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
     ((and var1 (fixnump arg2) (< -32 arg2 0))
      (dformat t "p2-ash case 3~%")
      (unless (eq representation :unboxed-fixnum)
        (emit 'new +lisp-fixnum-class+)
        (emit 'dup))
      (emit-push-int var1)
      (emit-push-constant-int (- arg2))
      (emit 'ishr)
      (unless (eq representation :unboxed-fixnum)
        (emit-invokespecial +lisp-fixnum-class+ "<init>" "(I)V" -2))
      (emit-move-from-stack target representation))
     (var2
      (dformat t "p2-ash case 4~%")
      (compile-form arg1 :target :stack)
      (maybe-emit-clear-values arg1)
      (emit 'iload (variable-register var2))
      (emit-invokevirtual +lisp-object-class+
                          "ash"
                          "(I)Lorg/armedbear/lisp/LispObject;"
                          -1)
      (when (eq representation :unboxed-fixnum)
        (emit-unbox-fixnum))
      (emit-move-from-stack target representation))
     ((fixnump arg2)
      (dformat t "p2-ash case 5~%")
      (compile-form arg1 :target :stack)
      (maybe-emit-clear-values arg1)
      (emit-push-constant-int arg2)
      (emit-invokevirtual +lisp-object-class+
                          "ash"
                          "(I)Lorg/armedbear/lisp/LispObject;"
                          -1)
      (when (eq representation :unboxed-fixnum)
        (emit-unbox-fixnum))
      (emit-move-from-stack target representation))
     (t
      (dformat t "p2-ash case 6~%")
      (compile-function-call form target representation)))))

(defun p2-logand (form &key (target *val*) representation)
  (let* ((args (cdr form))
         (len (length args)))
    (when (= len 2)
      (let* ((arg1 (first args))
             (arg2 (second args))
             (var1 (unboxed-fixnum-variable arg1)))
        (dformat t "p2-logand var1 = ~S~%" var1)
        (dformat t "p2-logand type-of arg2 is ~S~%" (type-of arg2))
        (cond
         ((and (integerp arg1) (integerp arg2))
          (dformat t "p2-logand case 1~%")
          (compile-constant (logand arg1 arg2) :target target :representation representation)
          (return-from p2-logand t))
         ((and (fixnump arg2) (zerop arg2))
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
            (emit-invokespecial +lisp-fixnum-class+ "<init>" "(I)V" -2))
          (emit-move-from-stack target representation)
          (return-from p2-logand t))
         ((fixnump arg2)
          (dformat t "p2-logand case 4~%")
          (let ((type (derive-type arg1)))
            (dformat t "p2-logand arg1 derived type = ~S~%" type)
            (cond
             ((subtypep type 'fixnum)
              (dformat t "p2-logand case 4a~%")
              (unless (eq representation :unboxed-fixnum)
                (emit 'new +lisp-fixnum-class+)
                (emit 'dup))
              (compile-form arg1 :target :stack :representation :unboxed-fixnum)
              (maybe-emit-clear-values arg1)
              (emit-push-constant-int arg2)
              (emit 'iand)
              (unless (eq representation :unboxed-fixnum)
                (emit-invokespecial +lisp-fixnum-class+ "<init>" "(I)V" -2))
              (emit-move-from-stack target representation))
             (t
              (dformat t "p2-logand case 4b~%")
              (compile-form arg1 :target :stack)
              (maybe-emit-clear-values arg1)
              (emit-push-constant-int arg2)
              (emit-invokevirtual +lisp-object-class+
                                  "logand"
                                  "(I)Lorg/armedbear/lisp/LispObject;"
                                  -1)
              (when (eq representation :unboxed-fixnum)
                (emit-unbox-fixnum))
              (emit-move-from-stack target representation))))
          (return-from p2-logand t))))))
  (dformat t "p2-logand default case~%")
  (compile-function-call form target representation))

(defun derive-type (form)
  (cond
   ((fixnump form)
    (return-from derive-type 'fixnum))
   ((unboxed-fixnum-variable form)
    (return-from derive-type 'fixnum))
   ((consp form)
    (let ((op (first form)))
      (case op
        (ASH
         (dformat t "derive-type ASH case form = ~S~%" form)
         (let* ((arg1 (second form))
                (var1 (unboxed-fixnum-variable arg1))
                (arg2 (third form)))
           (dformat t "derive-type ASH case var1 = ~S~%" var1)
           (when (and var1 (fixnump arg2) (minusp arg2))
             (return-from derive-type 'FIXNUM))))
        (THE
         (dformat t "derive-type THE case form = ~S~%" form)
         (when (subtypep (second form) 'FIXNUM)
           (dformat t "derive-type THE case form = ~S returning FIXNUM~%" form)
           (return-from derive-type 'FIXNUM))
         )))))
  t)

(defun compile-length (form &key (target *val*) representation)
  (check-args form 1)
  (let ((arg (cadr form)))
    (compile-form arg :target :stack)
    (maybe-emit-clear-values arg)
    (cond
     ((eq representation :unboxed-fixnum)
      (emit-invokevirtual +lisp-object-class+
                          "length"
                          "()I"
                          0))
     (t
      (emit-invokevirtual +lisp-object-class+
                          "LENGTH"
                          "()Lorg/armedbear/lisp/LispObject;"
                          0)))
    (emit-move-from-stack target representation)))

(defun compile-nth (form &key (target *val*) representation)
  (unless (check-args form 2)
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
    (emit-invokevirtual +lisp-object-class+
                        "NTH"
                        "(I)Lorg/armedbear/lisp/LispObject;"
                        -1)
    (when (eq representation :unboxed-fixnum)
      (emit-unbox-fixnum))
    (emit-move-from-stack target representation)))

(defun compile-plus (form &key (target *val*) representation)
  (case (length form)
    (3
     (let* ((args (cdr form))
            (arg1 (first args))
            (arg2 (second args))
            (var1 (unboxed-fixnum-variable arg1))
            (var2 (unboxed-fixnum-variable arg2)))
       (cond
        ((and (numberp arg1) (numberp arg2))
         (compile-constant (+ arg1 arg2)
                           :target target
                           :representation representation))
        ((and var1 var2)
         (dformat t "compile-plus case 1~%")
         (dformat t "target = ~S representation = ~S~%" target representation)
         (aver (variable-register var1))
         (aver (variable-register var2))
         (when target
           (cond
            ((eq representation :unboxed-fixnum)
             (emit-push-int var1)
             (emit-push-int arg2)
             (emit 'iadd))
            (t
             (emit 'iload (variable-register var1))
             (emit 'i2l)
             (emit 'iload (variable-register var2))
             (emit 'i2l)
             (emit 'ladd)
             (emit-box-long)))
           (emit-move-from-stack target representation)))
        ((and var1 (fixnump arg2))
         (dformat t "compile-plus case 2~%")
         (aver (variable-register var1))
         (cond
          ((eq representation :unboxed-fixnum)
           (emit-push-int var1)
           (emit-push-int arg2)
           (emit 'iadd))
          (t
           (emit-push-int var1)
           (emit 'i2l)
           (emit-push-int arg2)
           (emit 'i2l)
           (emit 'ladd)
           (emit-box-long)))
         (emit-move-from-stack target representation))
        ((and (fixnump arg1) var2)
         (dformat t "compile-plus case 3~%")
         (aver (variable-register var2))
         (cond
          ((eq representation :unboxed-fixnum)
           (emit-push-int arg1)
           (emit-push-int var2)
           (emit 'iadd))
          (t
           (emit-push-int arg1)
           (emit 'i2l)
           (emit-push-int var2)
           (emit 'i2l)
           (emit 'ladd)
           (emit-box-long)))
         (emit-move-from-stack target representation))
        ((eql arg1 1)
         (dformat t "compile-plus case 4~%")
         (compile-form arg2 :target :stack)
         (maybe-emit-clear-values arg2)
         (emit-invoke-method "incr" target representation))
        ((eql arg2 1)
         (dformat t "compile-plus case 5~%")
         (compile-form arg1 :target :stack)
         (maybe-emit-clear-values arg1)
         (emit-invoke-method "incr" target representation))
        ((arg-is-fixnum-p arg1)
         (dformat t "compile-plus case 6~%")
         (emit-push-int arg1)
         (compile-form arg2 :target :stack)
         (maybe-emit-clear-values arg2)
         (emit 'swap)
         (emit-invokevirtual +lisp-object-class+
                             "add"
                             "(I)Lorg/armedbear/lisp/LispObject;"
                             -1)
         (when (eq representation :unboxed-fixnum)
           (emit-unbox-fixnum))
         (emit-move-from-stack target representation))
        ((arg-is-fixnum-p arg2)
         (dformat t "compile-plus case 7~%")
         (compile-form arg1 :target :stack)
         (maybe-emit-clear-values arg1)
         (emit-push-int arg2)
         (emit-invokevirtual +lisp-object-class+
                             "add"
                             "(I)Lorg/armedbear/lisp/LispObject;"
                             -1)
         (when (eq representation :unboxed-fixnum)
           (emit-unbox-fixnum))
         (emit-move-from-stack target representation))
        (t
         (dformat t "compile-plus case 8~%")
         (compile-binary-operation "add" args target representation)))))
    (4
     (dformat t "compile-plus case 9~%")
     ;; (+ a b c) => (+ (+ a b) c)
     (let ((new-form `(+ (+ ,(second form) ,(third form)) ,(fourth form))))
       (dformat t "form = ~S~%" form)
       (dformat t "new-form = ~S~%" new-form)
       (compile-plus new-form :target target :representation representation)))
    (t
     (dformat t "compile-plus case 10~%")
     (compile-function-call form target representation))))

(defun compile-minus (form &key (target *val*) representation)
  (case (length form)
    (3
     (let* ((args (cdr form))
            (arg1 (first args))
            (arg2 (second args))
            (var1 (unboxed-fixnum-variable arg1))
            (var2 (unboxed-fixnum-variable arg2)))
       (cond
        ((and (numberp arg1) (numberp arg2))
         (compile-constant (- arg1 arg2)
                           :target target
                           :representation representation))
        ((and var1 var2)
         (dformat t "compile-minus case 1~%")
         (aver (variable-register var1))
         (aver (variable-register var2))
         (when target
           (cond
            ((eq representation :unboxed-fixnum)
             (emit 'iload (variable-register var1))
             (emit 'iload (variable-register var2))
             (emit 'isub))
            (t
             (emit 'iload (variable-register var1))
             (emit 'i2l)
             (emit 'iload (variable-register var2))
             (emit 'i2l)
             (emit 'lsub)
             (emit-box-long)))
           (emit-move-from-stack target representation)))
        ((and var1 (fixnump arg2))
         (dformat t "compile-minus case 2~%")
         (aver (variable-register var1))
         (cond
          ((eq representation :unboxed-fixnum)
           (emit-push-int var1)
           (emit-push-int arg2)
           (emit 'isub))
          (t
           (emit-push-int var1)
           (emit 'i2l)
           (emit-push-int arg2)
           (emit 'i2l)
           (emit 'lsub)
           (emit-box-long)))
         (emit-move-from-stack target representation))
        ((and (fixnump arg1) var2)
         (dformat t "compile-minus case 3~%")
         (aver (variable-register var2))
         (cond
          ((eq representation :unboxed-fixnum)
           (emit-push-int arg1)
           (emit-push-int var2)
           (emit 'isub))
          (t
           (emit-push-int arg1)
           (emit 'i2l)
           (emit-push-int var2)
           (emit 'i2l)
           (emit 'lsub)
           (emit-box-long)))
         (emit-move-from-stack target representation))
        ((eql arg2 1)
         (dformat t "compile-minus case 5~%")
         (compile-form arg1 :target :stack)
         (maybe-emit-clear-values arg2)
         (emit-invoke-method "decr" target representation))
        ((arg-is-fixnum-p arg2)
         (dformat t "compile-minus case 7~%")
         (compile-form arg1 :target :stack)
         (maybe-emit-clear-values arg1)
         (emit-push-int arg2)
         (emit-invokevirtual +lisp-object-class+
                             "subtract"
                             "(I)Lorg/armedbear/lisp/LispObject;"
                             -1)
         (when (eq representation :unboxed-fixnum)
           (emit-unbox-fixnum))
         (emit-move-from-stack target representation))
        (t
         (dformat t "compile-minus case 8~%")
         (compile-binary-operation "subtract" args target representation)))))
    (4
     (dformat t "compile-minus case 9~%")
     ;; (- a b c) => (- (- a b) c)
     (let ((new-form `(- (- ,(second form) ,(third form)) ,(fourth form))))
       (dformat t "form = ~S~%" form)
       (dformat t "new-form = ~S~%" new-form)
       (compile-minus new-form :target target :representation representation)))
    (t
     (dformat t "compile-minus case 10~%")
     (compile-function-call form target representation))))

(defun compile-schar (form &key (target *val*) representation)
  (unless (= (length form) 3)
    (error 'program-error
           :format-control "Wrong number of arguments for ~S."
           :format-arguments (list (car form))))
  (compile-form (second form) :target :stack)
  (compile-form (third form) :target :stack :representation :unboxed-fixnum)
  (unless (and (single-valued-p (second form))
               (single-valued-p (third form)))
    (emit-clear-values))
  (emit-invokevirtual +lisp-object-class+
                      "SCHAR"
                      "(I)Lorg/armedbear/lisp/LispObject;"
                      -1)
  (emit-move-from-stack target))

(defun compile-aref (form &key (target *val*) representation)
;;   (dformat t "compile-aref form = ~S~%" form)
  (unless (= (length form) 3)
    (return-from compile-aref (compile-function-call form target representation)))
  (compile-form (second form) :target :stack)
  (compile-form (third form) :target :stack :representation :unboxed-fixnum)
  (unless (and (single-valued-p (second form))
               (single-valued-p (third form)))
    (emit-clear-values))
  (emit-invokevirtual +lisp-object-class+
                      "AREF"
                      "(I)Lorg/armedbear/lisp/LispObject;"
                      -1)
  (emit-move-from-stack target))

(defun compile-not/null (form &key (target *val*) representation)
  (unless (= (length form) 2)
    (error 'program-error
           :format-control "Wrong number of arguments for ~S."
           :format-arguments (list (car form))))
  (let ((arg (second form)))
;;     (dformat t "arg = ~S~%" arg)
    (cond ((null arg)
           (emit-push-t))
          ((and (constantp arg) (not (block-node-p arg)))
;;            (dformat t "compile-not/null constantp case~%")
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

(defun compile-values (form &key (target *val*) representation)
  (let ((args (cdr form)))
    (case (length args)
      (1
       (let ((arg (first args)))
         (compile-form arg :target target)
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
                           "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                           -2)
       (emit-move-from-stack target))
      (3
       (emit-push-current-thread)
       (dolist (arg args)
         (compile-form arg :target :stack))
       (emit-invokevirtual +lisp-thread-class+
                           "setValues"
                           "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                           -3)
       (emit-move-from-stack target))
      (t
       (compile-function-call form target representation)))))

(defun compile-special-reference (name target representation)
  (emit 'getstatic
        *this-class*
        (declare-symbol name)
        +lisp-symbol+)
  (emit-push-current-thread)
  (emit-invokevirtual +lisp-symbol-class+
                      "symbolValue"
                      "(Lorg/armedbear/lisp/LispThread;)Lorg/armedbear/lisp/LispObject;"
                      -1)
  (when (eq representation :unboxed-fixnum)
    (emit-unbox-fixnum))
  (emit-move-from-stack target representation))

(defun compile-variable-reference (name target representation)
  (let ((variable (find-visible-variable name)))
    (cond
     ((null variable)
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
      (cond
       ((eq representation :unboxed-fixnum)
        (aver (variable-register variable))
        (emit 'iload (variable-register variable)))
       (t
        (dformat t "compile-variable-reference constructing boxed fixnum for ~S~%"
                 name)
        (emit 'new +lisp-fixnum-class+)
        (emit 'dup)
        (aver (variable-register variable))
        (emit 'iload (variable-register variable))
        (emit-invokespecial +lisp-fixnum-class+ "<init>" "(I)V" -2)))
      (emit-move-from-stack target representation))
     (t
;;       (dformat t "compile-variable-reference name = ~S representation = ~S~%"
;;                name representation)
      (emit 'var-ref variable target representation)))))

(defun rewrite-setq (form)
  (let ((expr (third form)))
    (if (unsafe-p expr)
        (let ((sym (gensym)))
          (list 'LET (list (list sym expr)) (list 'SETQ (second form) sym)))
        form)))

(defun compile-setq (form &key (target *val*) representation)
;;   (dformat t "compile-setq form = ~S target = ~S representation = ~S~%"
;;            form target representation)
  (unless (= (length form) 3)
    (return-from compile-setq (compile-form (precompiler::precompile-setq form)
                                            :target target)))
  (let ((expansion (macroexpand (second form))))
    (unless (eq expansion (second form))
      (compile-form (list 'SETF expansion (third form)))
      (return-from compile-setq)))
  (let* ((name (second form))
         (value-form (third form))
         (variable (find-visible-variable name)))
    (cond ((or (null variable)
               (variable-special-p variable))
           (let ((new-form (rewrite-setq form)))
             (when (neq new-form form)
               (return-from compile-setq (compile-form (p1 new-form) :target target))))
           (emit-push-current-thread)
           (emit 'getstatic
                 *this-class*
                 (declare-symbol name)
                 +lisp-symbol+)
           (compile-form value-form :target :stack)
           (maybe-emit-clear-values value-form)
           (emit-invokevirtual +lisp-thread-class+
                              "setSpecialVariable"
                              "(Lorg/armedbear/lisp/Symbol;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"
                              -2)
           (emit-move-from-stack target))
          ((and (eq (variable-representation variable) :unboxed-fixnum)
                (or (equal value-form (list '1+ (variable-name variable)))
                    (equal value-form (list '+ (variable-name variable) 1))
                    (equal value-form (list '+ 1 (variable-name variable)))))
           (dformat t "compile-setq incf unboxed-fixnum case~%")
           (emit 'iinc (variable-register variable) 1)
           (when target
             (dformat t "compile-setq constructing boxed fixnum for ~S~%"
                      (variable-name variable))
             (emit 'new +lisp-fixnum-class+)
             (emit 'dup)
             (aver (variable-register variable))
             (emit 'iload (variable-register variable))
             (emit-invokespecial +lisp-fixnum-class+ "<init>" "(I)V" -2)
             (emit-move-from-stack target)))
          ((eq (variable-representation variable) :unboxed-fixnum)
           (dformat t "compile-setq unboxed-fixnum case value-form = ~S~%" value-form)
           (compile-form value-form :target :stack)
           (maybe-emit-clear-values value-form)
           (when target
             (emit 'dup))
           (emit-unbox-fixnum)
           (emit 'istore (variable-register variable))
           (when target
             (emit-move-from-stack target))
           )
          (t
           (compile-form value-form :target :stack)
           (maybe-emit-clear-values value-form)
           (when target
             (emit 'dup))
           (emit 'var-set variable)
           (when target
             (when (eq representation :unboxed-fixnum)
               (emit-unbox-fixnum))
             (emit-move-from-stack target))))))

(defun p2-the (form &key (target *val*) representation)
  (dformat t "p2-the form = ~S~%" form)
;;   (let ((type (second form))
;;         (expr (third form)))
;;   (cond
;;    ((and (listp type) (eq (car type) 'VALUES))
;;     ;; FIXME
;;     (compile-form expr :target target :representation representation))
;;    ((= *safety* 3)
;;     (let* ((sym (gensym))
;;            (new-expr
;;             `(let ((,sym ,expr))
;;                (sys::require-type ,sym ',type)
;;                ,sym)))
;; ;;       (dformat t "new-expr = ~S~%" new-expr)
;;       (compile-form (p1 new-expr) :target target :representation representation)))
;;    (t
;;     (compile-form expr :target target :representation representation)))))
  (compile-form (third form) :target target :representation representation))

(defun compile-catch (form &key (target *val*) representation)
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
                        "(Lorg/armedbear/lisp/LispObject;)V"
                        -2) ; Stack depth is 0.
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
    (emit-invokevirtual +lisp-throw-class+
                        "getResult"
                        "(Lorg/armedbear/lisp/LispThread;)Lorg/armedbear/lisp/LispObject;"
                        -1)
    (emit-move-from-stack target) ; Stack depth is 0.
    (emit 'goto label5)
    (emit 'label label4) ; Start of handler for all other Throwables.
    ;; A Throwable object is on the runtime stack here. Stack depth is 1.
    (emit 'aload *thread*)
    (emit-invokevirtual +lisp-thread-class+
                        "popCatchTag"
                        "()V"
                        -1)
    (emit 'athrow) ; And we're gone.
    (emit 'label label5)
    ;; Finally...
    (emit 'aload *thread*)
    (emit-invokevirtual +lisp-thread-class+
                        "popCatchTag"
                        "()V"
                        -1)
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

(defun compile-throw (form &key (target *val*) representation)
;;   (let ((new-form (rewrite-throw form)))
;;     (when (neq new-form form)
;;       (return-from compile-throw (compile-form new-form :target target))))
  (emit-push-current-thread)
  (compile-form (second form) :target :stack) ; Tag.
  (emit-clear-values) ; Do this unconditionally! (MISC.503)
  (compile-form (third form) :target :stack) ; Result.
  (emit-invokevirtual +lisp-thread-class+
                      "throwToTag"
                      "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)V"
                      -3)
  ;; Following code will not be reached.
  (when target
    (emit-push-nil)
    (emit-move-from-stack target)))

(defun compile-unwind-protect (form &key (target *val*) representation)
  (when (= (length form) 2) ; (unwind-protect 42)
    (compile-form (second form) :target target)
    (return-from compile-unwind-protect))
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
;;     (when (contains-return protected-form)
;;       (error "COMPILE-UNWIND-PROTECT: unhandled case (RETURN)"))
;;     (when (contains-go protected-form)
;;       (error "COMPILE-UNWIND-PROTECT: unhandled case (GO)"))

    ;; Added Dec 9 2004 3:46 AM
    ;; Make sure there are no leftover values from previous calls.
    (emit-clear-values)

    (let* ((block (make-block-node :name '(UNWIND-PROTECT)))
           (*blocks* (cons block *blocks*)))
      (label BEGIN-PROTECTED-RANGE)
      (compile-form protected-form :target result-register)
      (emit-push-current-thread)
      (emit 'getfield +lisp-thread-class+ "_values" "[Lorg/armedbear/lisp/LispObject;")
      (emit 'astore values-register)
      (label END-PROTECTED-RANGE))
    (emit 'jsr CLEANUP)
    (emit 'goto EXIT) ; Jump over handler.
    (label HANDLER) ; Start of exception handler.
    ;; The Throw object is on the runtime stack. Stack depth is 1.
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
      (push handler *handlers*))))

(defun compile-form (form &key (target *val*) representation)
  (cond ((consp form)
         (let ((op (car form))
               handler)
           (cond ((symbolp op)
                  (cond ((setf handler (get op 'p2-handler))
                         (funcall handler form
                                  :target target
                                  :representation representation))
                        ((macro-function op)
                         (compile-form (macroexpand form)
                                       :target target
                                       :representation representation))
                        ((special-operator-p op)
                         (dformat t "form = ~S~%" form)
                         (error "COMPILE-FORM: unsupported special operator ~S" op))
                        (t
                         (compile-function-call form target representation))))
                 ((and (consp op) (eq (car op) 'LAMBDA))
                  (let ((new-form (list* 'FUNCALL form)))
                    (compile-form new-form
                                  :target target
                                  :representation representation)))
                 (t
                  (error "COMPILE-FORM unhandled case ~S" form)))))
        ((symbolp form)
;;          (dformat t "compile-form symbolp case form = ~S~%" form)
         (cond
          ((null form)
           (emit-push-nil)
           (emit-move-from-stack target))
          ((eq form t)
           (emit-push-t)
           (emit-move-from-stack target))
          ((keywordp form)
           (emit 'getstatic
                 *this-class*
                 (declare-keyword form)
                 +lisp-symbol+)
           (emit-move-from-stack target))
          (t
           ;; Maybe it's a symbol macro...
           (let ((expansion (macroexpand form)))
             (if (eq expansion form)
                 (compile-variable-reference form target representation)
                 (compile-form expansion :target target :representation representation))))))
        ((block-node-p form)
         (cond ((equal (block-name form) '(TAGBODY))
                (compile-tagbody-node form target))
               ((equal (block-name form) '(LET))
                (compile-let/let*-node form target))
               (t
                (compile-block-node form target))))
        ((constantp form)
;;          (dformat t "compile-form constantp case~%")
         (compile-constant form :target target :representation representation))
        (t
         (error "COMPILE-FORM unhandled case ~S" form))))

;; Returns descriptor.
(defun analyze-args (args)
  (aver (not (memq '&AUX args)))
  (when (or *use-locals-vector*
            *child-p*
            (memq '&KEY args)
            (memq '&OPTIONAL args)
            (memq '&REST args))
    (setf *using-arg-array* t)
    (setf *hairy-arglist-p* t)
    (return-from analyze-args
                 (if *child-p*
                     #.(%format nil "([~A[[~A)~A" +lisp-object+ +lisp-object+ +lisp-object+)
                     #.(%format nil "([~A)~A" +lisp-object+ +lisp-object+))))
  (case (length args)
    (0 #.(%format nil "()~A" +lisp-object+))
    (1 #.(%format nil "(~A)~A" +lisp-object+ +lisp-object+))
    (2 #.(%format nil "(~A~A)~A" +lisp-object+ +lisp-object+ +lisp-object+))
    (3 #.(%format nil "(~A~A~A)~A" +lisp-object+ +lisp-object+ +lisp-object+ +lisp-object+))
    (4 #.(%format nil "(~A~A~A~A)~A" +lisp-object+ +lisp-object+ +lisp-object+ +lisp-object+ +lisp-object+))
    (t (setf *using-arg-array* t)
       (setf *arity* (length args))
       #.(%format nil "([~A)~A" +lisp-object+ +lisp-object+))))

(defun write-class-file (args body execute-method classfile)
  (let* ((super
          (cond (*child-p*
                 "org/armedbear/lisp/ClosureTemplateFunction")
                (*hairy-arglist-p*
                 "org/armedbear/lisp/CompiledFunction")
                (t
                 "org/armedbear/lisp/Primitive")))
         (this-index (pool-class *this-class*))
         (super-index (pool-class super))
         (constructor (make-constructor super
                                        (compiland-name *current-compiland*)
                                        args
                                        body)))
    (pool-name "Code") ; Must be in pool!

    ;; Write out the class file.
    (with-open-file (stream classfile
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
      (write-u2 2 stream)
      ;; methods
      (write-method execute-method stream)
      (write-method constructor stream)
      ;; attributes count
      (write-u2 0 stream))))

(defun compile-1 (compiland)
  (let ((*current-compiland* compiland)
        (precompiled-form (compiland-lambda-expression compiland))
        (classfile (compiland-classfile compiland))
        (*speed* *speed*)
        (*safety* *safety*)
        (*debug* *debug*)
        )
    (process-optimization-declarations (cddr precompiled-form))
    ;; Pass 1.
    (let ((*visible-variables* ()))
      (setf precompiled-form (p1 precompiled-form)))
    ;; Pass 2.
    (let* ((*declared-symbols* (make-hash-table :test 'eq))
           (*declared-functions* (make-hash-table :test 'equal))
           (*declared-strings* (make-hash-table :test 'eq))
           (*declared-fixnums* (make-hash-table :test 'eql))
           (class-name
            (let* ((pathname (pathname classfile))
                   (name (pathname-name classfile)))
              (dotimes (i (length name))
                (when (eql (char name i) #\-)
                  (setf (char name i) #\_)))
              name))
           (*this-class*
            (concatenate 'string "org/armedbear/lisp/" class-name))
           (args (cadr precompiled-form))
           (body (cddr precompiled-form))
           (*using-arg-array* nil)
           (*hairy-arglist-p* nil)
           (*arity* nil)

           (*child-p* (if *context* t nil))

           (*use-locals-vector* (or (> (compiland-children *current-compiland*) 0)
                                    (compiland-contains-lambda *current-compiland*)))

           (descriptor (analyze-args args))
           (execute-method (make-method :name "execute"
                                        :descriptor descriptor))
           (*code* ())
           (*static-code* ())
           (*fields* ())
           (*register* 0)
           (*registers-allocated* 0)
           (*handlers* ())

           (*context* *context*)

           (*context-register* *context-register*)

           (*visible-variables* *visible-variables*)
           (*all-variables* *all-variables*)
           (*undefined-variables* *undefined-variables*)

           (parameters ())

           (*pool* ())
           (*pool-count* 1)
           (*pool-entries* (make-hash-table :test #'equal))
           (*val* nil)
           (*thread* nil)
           (*initialize-thread-var* nil))

      (when (zerop *nesting-level*)
        (setf *child-count* 0))
      (setf *context* (make-context))
      (setf (method-name-index execute-method)
            (pool-name (method-name execute-method)))
      (setf (method-descriptor-index execute-method)
            (pool-name (method-descriptor execute-method)))
      (cond (*hairy-arglist-p*
             (let* ((closure (sys::make-closure precompiled-form nil))
                    (vars (sys::varlist closure))
                    (index 0))
               (dolist (var vars)
                 (let ((variable (make-variable :name var
;;                                                 :kind 'ARG
                                                :special-p nil ;; FIXME
                                                :register nil
                                                :index index)))
                   (push variable *all-variables*)
                   (push variable *visible-variables*)
                   (push variable parameters)
                   (add-variable-to-context variable)
                   (incf index)))))
            (t
             (let ((register 1)
                   (index 0))
               (dolist (arg args)
                 (aver (= index (length (context-vars *context*))))
                 (let ((variable (make-variable :name arg
                                                :special-p nil ;; FIXME
                                                :register (if *using-arg-array* nil register)
                                                :index index)))
                   (push variable *all-variables*)
                   (push variable *visible-variables*)
                   (push variable parameters)
                   (add-variable-to-context variable)
                   (incf register)
                   (incf index))))))

      (let ((specials (process-special-declarations body)))
        (dolist (name specials)
          (let ((variable (find-visible-variable name)))
            (cond ((null variable)
                   (setf variable (make-variable :name name
                                                 :special-p t))
                   (push variable *all-variables*)
                   (push variable *visible-variables*))
                  (t
                   (setf (variable-special-p variable) t))))))

      ;; Process type declarations.
      (when *trust-user-type-declarations*
        (unless (or *child-p*
                    (plusp (compiland-children *current-compiland*)))
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
                         (when (and (variable-register variable)
                                    (not (variable-special-p variable))
                                    (subtypep (variable-declared-type variable) 'FIXNUM))
                           (setf (variable-representation variable) :unboxed-fixnum))))))))))))

      (dump-variables (reverse parameters)
                      (%format nil "Arguments to ~A:~%" (compiland-name *current-compiland*))
                      )

      (allocate-register) ;; "this" pointer
      (if *using-arg-array*
          ;; One slot for arg array.
          (allocate-register)
          ;; Otherwise, one register for each argument.
          (dolist (arg args)
            (allocate-register)))
      (cond (*child-p*
             (setf *context-register* (allocate-register))
             (aver (eql *context-register* 2)))
            (*use-locals-vector*
             (aver *using-arg-array*)
             (setf *context-register* 1)))
      ;; Reserve the next available slot for the value register.
      (setf *val* (allocate-register))
      ;; Reserve the next available slot for the thread register.
      (setf *thread* (allocate-register))

      ;; Establish dynamic bindings for any variables declared special.
      (dolist (variable parameters)
        (when (variable-special-p variable)
          (cond ((variable-register variable)
                 (emit-push-current-thread)
                 (emit 'getstatic
                       *this-class*
                       (declare-symbol (variable-name variable))
                       +lisp-symbol+)
                 (emit 'aload (variable-register variable))
                 (emit-invokevirtual +lisp-thread-class+
                                     "bindSpecial"
                                     "(Lorg/armedbear/lisp/Symbol;Lorg/armedbear/lisp/LispObject;)V"
                                     -3)
                 (setf (variable-register variable) nil))
                ((variable-index variable)
                 (emit-push-current-thread)
                 (emit 'getstatic
                       *this-class*
                       (declare-symbol (variable-name variable))
                       +lisp-symbol+)
                 (emit 'aload 1)
                 (emit 'bipush (variable-index variable))
                 (emit 'aaload)
                 (emit-invokevirtual +lisp-thread-class+
                                     "bindSpecial"
                                     "(Lorg/armedbear/lisp/Symbol;Lorg/armedbear/lisp/LispObject;)V"
                                     -3)
                 (setf (variable-index variable) nil)))))

;;       (process-optimization-declarations body)

      (compile-progn-body body :stack)

      (unless *code*
        (emit-push-nil))

      (emit 'areturn)

      (resolve-variables)

      ;; Go back and fill in prologue.
      (let ((code *code*))
        (setf *code* ())
        (maybe-generate-arg-count-check)
        (maybe-generate-interrupt-check)
        (cond
         ((or *hairy-arglist-p* *use-locals-vector*)
          (emit 'aload_0) ; this
          (emit 'aload_1) ; arg vector
          ; Reserve extra slots for locals if applicable.
          (let ((extra (if *use-locals-vector*
                           (length (context-vars *context*))
                           0)))
            (emit 'sipush extra))
          (emit-invokevirtual *this-class*
                              (if (or (memq '&optional args) (memq '&key args))
                                  "processArgs"
                                  "fastProcessArgs")
                              "([Lorg/armedbear/lisp/LispObject;I)[Lorg/armedbear/lisp/LispObject;"
                              -2)
          (emit 'astore_1))
         ((not *using-arg-array*)
          (dolist (variable (reverse *visible-variables*))
            (when (eq (variable-representation variable) :unboxed-fixnum)
              (emit 'aload (variable-register variable))
              (emit-unbox-fixnum)
              (emit 'istore (variable-register variable))))))

        (maybe-initialize-thread-var)
        (setf *code* (append code *code*)))

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
      (write-class-file args body execute-method classfile)
      classfile)))

(defun compile-defun (name form environment &optional (classfile "out.class"))
  ;;   (dformat t "COMPILE-DEFUN ~S ~S~%" name classfile)
  ;;   (dformat t "compile-defun form = ~S~%" form)
  (unless (eq (car form) 'LAMBDA)
    (return-from compile-defun nil))
  (unless (or (null environment) (sys::empty-environment-p environment))
    (error "COMPILE-DEFUN: unable to compile LAMBDA form defined in non-null lexical environment."))
  (handler-bind ((warning #'handle-warning))
    (let ((precompiled-form (precompile-form form t)))
      (compile-1 (make-compiland :name name
                                 :lambda-expression precompiled-form
                                 :classfile classfile
                                 :parent *current-compiland*)))))

(defun handle-warning (condition)
  (fresh-line)
  (format t "; Caught ~A:~%;   ~A~%" (type-of condition) condition)
  (muffle-warning))

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

(defmacro with-compilation-unit (&body body)
  `(let ((*style-warnings* 0)
         (*warnings* 0)
         (*errors* 0))
     (unwind-protect
      (progn ,@body)
      (unless (and (zerop *warnings*) (zerop *style-warnings*))
        (format t "~%; Compilation unit finished~%")
        (unless (zerop *warnings*)
          (format t ";   Caught ~D WARNING condition~P~%"
                  *warnings* *warnings*))
        (unless (zerop *style-warnings*)
          (format t ";   Caught ~D STYLE-WARNING condition~P~%"
                  *style-warnings* *style-warnings*))
        (terpri)))))

(defun %jvm-compile (name definition)
  (let ((prefix (load-verbose-prefix)))
    (when *compile-print*
      (fresh-line)
      (if name
          (progn
            (%format t "~A Compiling ~S ...~%" prefix name)
            (when (and (fboundp name)
                       (sys::%typep (fdefinition name) 'generic-function))
              (%format t "~A Unable to compile generic function ~S~%" prefix name)
              (return-from %jvm-compile (values name nil t)))
            (unless (symbolp name)
              (%format t "~A Unable to compile ~S~%" prefix name)
              (return-from %jvm-compile (values name nil t))))
          (%format t "~A Compiling top-level form ...~%" prefix)))
    (unless definition
      (resolve name)
      (setf definition (fdefinition name)))
    (when (compiled-function-p definition)
      (when (and *compile-print* name)
        (%format t "~A Already compiled ~S~%" prefix name))
      (return-from %jvm-compile (values name nil nil)))
    (multiple-value-bind (expr env) (get-lambda-to-compile definition)
      (let* ((*package* (if (and name (symbol-package name))
                            (symbol-package name)
                            *package*))
             classfile
             compiled-definition
             (warnings-p t)
             (failure-p t))
;;              (classfile (compile-defun name expr env))
;;              (compiled-definition (sys:load-compiled-function classfile)))
        (with-compilation-unit
          (setf classfile (compile-defun name expr env))
          (setf compiled-definition (sys:load-compiled-function classfile))
          (when (and name (functionp compiled-definition))
            (sys::%set-lambda-name compiled-definition name)
            (sys:set-call-count compiled-definition (sys:call-count definition))
            (sys::%set-arglist compiled-definition (sys::arglist definition))
            (if (macro-function name)
                (setf (fdefinition name) (sys::make-macro name compiled-definition))
                (setf (fdefinition name) compiled-definition)))
          (cond
           ((zerop (+ jvm::*errors* jvm::*warnings* jvm::*style-warnings*))
            (setf warnings-p nil failure-p nil))
           ((zerop (+ jvm::*errors* jvm::*warnings*))
            (setf failure-p nil)))
          (when *compile-print*
            (if name
                (%format t "~A Compiled ~S~%" prefix name)
                (%format t "~A Compiled top-level form~%" prefix))))
        (values (or name compiled-definition) warnings-p failure-p)))))

(defun jvm-compile (name &optional definition)
  (if *catch-errors*
      (let ((prefix (load-verbose-prefix)))
        (handler-case
            (%jvm-compile name definition)
          (error (c)
                 (fresh-line)
                 (%format t "~A Note: ~A~%" prefix c)
                 (if name
                     (%format t "~A Unable to compile ~S.~%" prefix name)
                     (%format t "~A Unable to compile top-level form.~%" prefix))
                 (precompiler::precompile name definition))))
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

(mapc #'install-p2-handler '(aref
                             atom
                             block
                             catch
                             cons
                             declare
                             flet
                             funcall
                             function
                             go
                             if
                             labels
                             length
                             locally
                             multiple-value-bind
                             multiple-value-call
                             multiple-value-list
                             multiple-value-prog1
                             nth
                             progn
                             quote
                             return-from
                             rplacd
                             schar
                             setq
                             throw
                             unwind-protect
                             values))

(install-p2-handler '<      'p2-numeric-comparison)
(install-p2-handler '<=     'p2-numeric-comparison)
(install-p2-handler '>      'p2-numeric-comparison)
(install-p2-handler '>=     'p2-numeric-comparison)
(install-p2-handler '=      'p2-numeric-comparison)
(install-p2-handler '/=     'p2-numeric-comparison)
(install-p2-handler '+      'compile-plus)
(install-p2-handler '-      'compile-minus)
(install-p2-handler 'ash    'p2-ash)
(install-p2-handler 'eql    'p2-eql)
(install-p2-handler 'logand 'p2-logand)
(install-p2-handler 'not    'compile-not/null)
(install-p2-handler 'null   'compile-not/null)
(install-p2-handler 'the    'p2-the)

(defun process-optimization-declarations (forms)
  (let (alist ())
    (dolist (form forms)
      (unless (and (consp form) (eq (car form) 'declare))
        (return))
      (let ((decl (cadr form)))
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

;;; loop.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: loop.lisp,v 1.2 2003-07-06 16:29:10 piso Exp $
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

;;; Based on code from PAIP.

(in-package "COMMON-LISP")

(export '(loop loop-finish))

(unless (find-package "LOOP")
  (make-package "LOOP" :use '("COMMON-LISP")))

(in-package "LOOP")

;; Does item occur anywhere in tree?
(defun find-anywhere (item tree)
  (if (atom tree)
      (if (eql item tree) tree)
      (or (find-anywhere item (first tree))
          (find-anywhere item (rest tree)))))

;;;; Queues:

;; A queue is a (last . contents) pair.
(defun queue-contents (q)
  (cdr q))

;; Make a new queue with no elements.
(defun make-queue ()
  (let ((q (cons nil nil)))
    (setf (car q) q)))

;; Insert item at end of queue.
(defun enqueue (item q)
  (setf (car q)
        (setf (cdr (car q))
              (cons item nil)))
  q)

;; Add elements of list to end of queue.
(defun queue-nconc (q list)
  (when list
    (setf (car q)
          (last (setf (cdr (car q)) list)))))

(defstruct loop
  vars prologue body steps epilogue result name)

(defun add-body (l exp) (push exp (loop-body l)))

;; Put in a test for loop termination.
(defun add-test (l test)
  (push `(if ,test (go end)) (loop-body l)))

;; Add a variable, maybe including an update step.
(defun add-var (l var init &optional (update nil update-p))
  (unless (assoc var (loop-vars l))
    (push (list var init) (loop-vars l)))
  (when update-p
    (push `(setq ,var ,update) (loop-steps l))))

;; Add a variable, NOT including an update step.
(defun add-var-only (l var init)
  (unless (assoc var (loop-vars l))
    (push (list var init) (loop-vars l))))

(defun add-update (l var update)
  (push `(setq ,var ,update) (loop-steps l)))

(defvar loop-function-alist ())

(defun loop-function (key)
  (cdr (assoc (symbol-name key) loop-function-alist :test #'equal)))

(defun set-loop-function (key fun)
  (setq loop-function-alist (acons (symbol-name key) fun loop-function-alist)))

;; Return the loop parsing function for key.
(defun call-loop-fn (l key exps)
  (if (and (symbolp key) (loop-function key))
      (funcall (loop-function key) l (first exps) (rest exps))
      (error "unknown loop key: ~a" key)))

;; Define a new LOOP keyword.
;; If the args do not have a third arg, one is supplied.
;; We can define an alias with (defloop key other-key).
(defmacro defloop (key args &rest body)
  `(set-loop-function
    ',key
    ,(cond ((and (symbolp args) (null body))
            `#'(lambda (l x y)
                (call-loop-fn l ',args (cons x y))))
           ((and (listp args) (= (length args) 2))
            `#'(lambda (,@args -exps-) ,@body -exps-))
           (t `#'(lambda ,args ,@body)))))

(defloop repeat (l times)
  (let ((i (gensym "REPEAT")))
    (add-var l i times `(- ,i 1))
    (add-test l `(<= ,i 0))))

;; AS is the same as FOR
(defloop as for)

(defvar *for-arithmetic-keywords*
  '(:from :downfrom :upfrom :to :downto :upto :above :below :by))

(defloop for (l var exps)
  (when (assoc var (loop-vars l))
    (error 'program-error "duplicate loop variable ~S" var))
  (let ((key (first exps))
        (source (second exps))
        (rest (cddr exps)))
    (when (string= key :of-type) ; Ignored.
      (setq key (first rest)
            source (second rest)
            rest (cddr rest)))
    (cond ((member key *for-arithmetic-keywords* :test #'string=)
           (loop-for-arithmetic l var exps))
          ((string= key :in)
           (let ((v (gensym)))
            (add-var l v source `(cdr ,v))
            (add-var l var `(car ,v) `(car ,v))
            (add-test l `(null ,v))
            rest))
          ((string= key :across)
           (let ((index (gensym "INDEX-"))
                 (len (gensym "LENGTH-")))
             (push `(setq ,len (length ,source)) (loop-prologue l))
             (add-var l var nil)
             (add-var l len 0)
             (add-var l index 0)
             (add-test l `(>= ,index ,len))
             (add-body l `(setq ,var (aref ,source ,index)))
             (add-body l `(setq ,index (1+ ,index)))
             rest))
          ((string= key :on)
           (add-var l var source `(cdr ,var))
           (add-test l `(null ,var))
           rest)
          ((string= key "=")
           (if (string= (first rest) :then)
               (progn
                 (pop rest)
                 (add-var l var source (pop rest)))
               (progn
                 (add-var l var nil)
                 (add-body l `(setq ,var ,source))))
           rest)
          (t
           (error 'program-error)))))

(defun loop-for-arithmetic (l var exps)
  (let ((exp1 0)
        (exp2 nil)
        (step nil)
        (down? nil))
    ;; Parse the keywords.
    (do ((key (first exps) (first exps))
         (val (second exps) (second exps)))
      ((not (member key *for-arithmetic-keywords* :test #'string=)))

      (cond ((string= key :from)
             (setf exp1 val)
             (add-var-only l var exp1))
            ((string= key :downfrom)
             (setf exp1 val
                   down? t)
             (add-var-only l var exp1))
            ((string= key :upfrom)
             (setf exp1 val
                   down? nil)
             (add-var-only l var exp1))
            ((member key '(:to :downto :upto) :test #'string=)
             (setf exp2 val
                   down? (or down? (string= key :downto)))
             (when exp2
               (add-test l `(,(if down? '< '>) ,var ,(maybe-temp l exp2)))))
            ((string= key :above)
             (setf exp2 `(1+ ,val)
                   down? t)
             (when exp2
               (add-test l `(,(if down? '< '>) ,var ,(maybe-temp l exp2)))))
            ((string= key :below)
             (setf exp2 `(1- ,val)
                   down? nil)
             (when exp2
               (add-test l `(,(if down? '< '>) ,var ,(maybe-temp l exp2)))))
            ((string= key :by)
             (setf step val)
             (add-update l var `(,(if down? '- '+) ,var ,(maybe-temp l step))))
            (t
             (error "loop-for-arithmetic shouldn't happen~%")))
      (setf exps (cddr exps)))
    ;; Done parsing. Add variables and tests.
    ;; FIXME Variables should be added in order of appearance!
    (add-var-only l var exp1)
    ;; Add update form if not already added.
    (unless step
      (add-update l var `(,(if down? '- '+) ,var 1)))
    ;; Return the remaining expressions.
    exps))

;; Generate a temporary variable if necessary
(defun maybe-temp (l exp)
  (if (constantp exp)
      exp
      (let ((temp (gensym "TEMP")))
        (add-var l temp exp)
        temp)))

(defloop until (l test) (add-test l test))

(defloop while (l test) (add-test l `(not ,test)))

(defloop always (l test)
  (setf (loop-result l) t)
  (add-body l `(if (not ,test) (return nil))))

(defloop never (l test)
  (setf (loop-result l) t)
  (add-body l `(if ,test (return nil))))

(defloop thereis (l test) (add-body l `(return-if ,test)))

;; Return TEST if it is non-NIL.
(defmacro return-if (test)
  (let ((var (gensym)))
    `(let ((,var ,test))
      (if ,var (return ,var)))))

(defmacro loop-finish ()
  `(go end))

(defconstant *acc* (gensym "ACC"))

;;; INTO preposition is omitted

(defloop collect (l exp)
  (add-var l *acc* '(make-queue))
  (add-body l `(enqueue ,exp ,*acc*))
  (setf (loop-result l) `(queue-contents ,*acc*)))

(defloop nconc (l exp)
  (add-var l *acc* '(make-queue))
  (add-body l `(queue-nconc ,*acc* ,exp))
  (setf (loop-result l) `(queue-contents ,*acc*)))

(defloop append (l exp exps)
;;   (call-loop-fn l 'nconc `((copy-list ,exp) .,exps)))
  (call-loop-fn l 'nconc `((copy-list ,exp) ,@exps)))

(defloop count (l exp)
  (add-var l *acc* 0)
  (add-body l `(when ,exp (incf ,*acc*)))
  (setf (loop-result l) *acc*))

(defloop sum (l exp)
  (add-var l *acc* 0)
  (add-body l `(incf ,*acc* ,exp))
  (setf (loop-result l) *acc*))

(defloop maximize (l exp)
  (add-var l *acc* nil)
  (add-body l `(setf ,*acc*
                     (if ,*acc*
                         (max ,*acc* ,exp)
                         ,exp)))
  (setf (loop-result l) *acc*))

(defloop minimize (l exp)
  (add-var l *acc* nil)
  (add-body l `(setf ,*acc*
                     (if ,*acc*
                         (min ,*acc* ,exp)
                         ,exp)))
  (setf (loop-result l) *acc*))

(defloop collecting
  collect)

(defloop nconcing
  nconc)

(defloop appending
  append)

(defloop counting
  count)

(defloop summing
  sum)

(defloop maximizing
  maximize)

(defloop minimizing
  minimize)

(defloop with (l var exps)
  (let ((init nil))
    (when (eq (first exps) '=)
      (setf init (second exps)
            exps (cddr exps)))
    (add-var l var init)
    exps))

(defloop when (l test exps)
  (loop-unless l `(not ,(maybe-set-it test exps)) exps))

(defloop unless (l test exps)
  (loop-unless l (maybe-set-it test exps) exps))

;; Return value, but if the variable IT appears in exps,
;; then return code that sets IT to value.
(defun maybe-set-it (test exps)
  (if (find-anywhere 'it exps)
      `(setq it ,test)
      test))

(defloop if
  when)

(defun loop-unless (l test exps)
  (let ((label (gensym "L")))
    (add-var l 'it nil)
    ;; Emit code for the test and the THEN part.
    (add-body l `(if ,test (go ,label)))
    (setf exps (call-loop-fn l (first exps) (rest exps)))
    ;; Optionally emit code for the ELSE part.
    (if (eq (first exps) 'else)
        (progn
          (let ((label2 (gensym "L")))
            (add-body l `(go ,label2))
            (add-body l label)
            (setf exps (call-loop-fn l (second exps) (cddr exps)))
            (add-body l label2)))
        (add-body l label)))
  exps)

(defloop do (l exp exps)
  (add-body l exp)
  (loop
    (if (symbolp (first exps)) (RETURN exps))
    (add-body l (pop exps))))

(defloop return (l exp)
  (add-body l `(return ,exp)))

(defloop initially (l exp exps)
  (push exp (loop-prologue l))
  (loop
    (if (symbolp (first exps)) (RETURN exps))
    (push (pop exps) (loop-prologue l))))

(defloop finally (l exp exps)
  (push exp (loop-epilogue l))
  (loop
    (if (symbolp (first exps)) (RETURN exps))
    (push (pop exps) (loop-epilogue l))))

(defloop named (l exp)
  (setf (loop-name l) exp))

(defun parse-loop-body (l exps)
  (unless (null exps)
    (parse-loop-body l (call-loop-fn l (first exps) (rest exps)))))

(defun fill-loop-template (l)
  (let ((tag 'next))
    `(let* ,(nreverse (loop-vars l))
       (block ,(loop-name l)
              ,@(nreverse (loop-prologue l))
              (tagbody
               ,tag
               ,@(nreverse (loop-body l))
               ,@(nreverse (loop-steps l))
               (go ,tag)
               end
               ,@(nreverse (loop-epilogue l))
               (return ,(loop-result l)))))))

(defmacro loop (&rest exps)
  (if (and exps (symbolp (car exps)))
      (let ((l (make-loop)))
        (parse-loop-body l exps)
        (fill-loop-template l))
      (let ((tag (gensym)))
	`(block nil (tagbody ,tag ,@exps (go ,tag))))))

(unless (member :loop *features*)
  (push :loop *features*))

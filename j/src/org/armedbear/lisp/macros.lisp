;;; macros.lisp

(in-package "COMMON-LISP")

(export '(prog1 prog2 push pop psetq loop
          the declare declaim locally eval-when
          time with-open-file))

(defmacro prog1 (first-form &rest forms)
  (let ((result (gensym)))
    `(let ((,result ,first-form))
       ,@forms
       ,result)))

(defmacro prog2 (first-form second-form &rest forms)
  `(prog1 (progn ,first-form ,second-form) ,@forms))

(defmacro push (item place)
  `(setf ,place (cons ,item ,place)))

(defmacro pop (place)
  `(prog1 (car ,place) (setf ,place (cdr ,place))))

(defmacro psetq (&rest args)
  (do ((l args (cddr l))
       (forms nil)
       (bindings nil))
    ((endp l) (list* 'let* (reverse bindings) (reverse (cons nil forms))))
    (let ((sym (gensym)))
      (push (list sym (cadr l)) bindings)
      (push (list 'setq (car l) sym) forms))))

(defmacro loop (&rest exps)
  (if (and exps (symbolp (car exps)))
      (error "loop keywords are not supported"))
  (let ((tag (gensym)))
    `(block nil (tagbody ,tag ,@exps (go ,tag)))))

(defmacro the (type form) form)

;; FIXME
(defmacro declare (&rest ignored)
  nil)

;; FIXME
(defmacro declaim (&rest ignored)
  nil)

;; FIXME Should be a special operator.
(defmacro locally (&rest forms)
  `(progn ,@forms))

;; FIXME
(defmacro eval-when (situation &rest forms)
  `(progn ,@forms))

(defmacro time (form)
  `(%time #'(lambda () ,form)))

(defmacro with-open-file (&rest args)
  (let ((var (caar args))
        (open-args (cdar args))
        (forms (cdr args))
        (abortp (gensym)))
    `(let ((,var (open ,@open-args))
	   (,abortp t))
       (unwind-protect
        (multiple-value-prog1
          (progn ,@forms)
          (setq ,abortp nil))
        (when ,var
          (close ,var :abort ,abortp))))))

;;; macros.lisp

(in-package "COMMON-LISP")

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

(defmacro pushnew (item place &rest keys)
  `(setf ,place (adjoin ,item ,place ,@keys)))

(defmacro psetq (&rest args)
  (do ((l args (cddr l))
       (forms nil)
       (bindings nil))
    ((endp l) (list* 'let* (reverse bindings) (reverse (cons nil forms))))
    (let ((sym (gensym)))
      (push (list sym (cadr l)) bindings)
      (push (list 'setq (car l) sym) forms))))

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
  `(sys:%time #'(lambda () ,form)))

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

(defmacro with-open-stream (&rest args)
  (let ((var (caar args))
        (stream (cadar args))
        (forms (cdr args))
        (abortp (gensym)))
    `(let ((,var ,stream)
	   (,abortp t))
       (unwind-protect
        (multiple-value-prog1
         (progn ,@forms)
         (setq ,abortp nil))
        (when ,var
          (close ,var :abort ,abortp))))))


;;; From CMUCL.

(defun do-do-body (varlist endlist code bind step name block)
  (let* ((inits ())
	 (steps ())
	 (l1 (gensym))
	 (l2 (gensym)))
    ;; Check for illegal old-style do.
    (when (or (not (listp varlist)) (atom endlist))
      (error "Ill-formed ~S -- possibly illegal old style DO?" name))
    ;; Parse the varlist to get inits and steps.
    (dolist (v varlist)
      (cond ((symbolp v) (push v inits))
	    ((listp v)
	     (unless (symbolp (first v))
	       (error "~S step variable is not a symbol: ~S" name (first v)))
	     (case (length v)
	       (1 (push (first v) inits))
	       (2 (push v inits))
	       (3 (push (list (first v) (second v)) inits)
		  (setq steps (list* (third v) (first v) steps)))
	       (t (error "~S is an illegal form for a ~S varlist." v name))))
	    (t (error "~S is an illegal form for a ~S varlist." v name))))
    ;; And finally construct the new form.
    `(block ,BLOCK
            (,bind ,(nreverse inits)
                   (tagbody
                    (go ,L2)
                    ,L1
                    ,@code
                    (,step ,@(nreverse steps))
                    ,L2
                    (unless ,(car endlist) (go ,L1))
                    (return-from ,BLOCK (progn ,@(cdr endlist))))))))


(defmacro do (varlist endlist &rest body)
  (do-do-body varlist endlist body 'let 'psetq 'do nil))


(defmacro do* (varlist endlist &rest body)
  (do-do-body varlist endlist body 'let* 'setq 'do* nil))

(defmacro loop (&rest exps)
  (if (and exps (symbolp (car exps)))
      (error "LOOP keywords are not supported")
      (let ((tag (gensym)))
	`(block nil (tagbody ,tag ,@exps (go ,tag))))))

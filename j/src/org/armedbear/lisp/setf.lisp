;;; setf.lisp

(in-package "COMMON-LISP")

(export '(setf incf decf defsetf))

(defun %rplaca (x val) (rplaca x val) val)

(defun %rplacd (x val) (rplacd x val) val)

(defun %setnth (n list newval)
  (do ((count n (1- count))
       (list list (cdr list)))
    ((endp list)
     (error "~A is too large an index for SETF of NTH" n))
    (when (<= count 0)
      (rplaca list newval)
      (return newval))))

(defmacro setf (&rest args)
  (let ((nargs (length args)))
    (cond
     ((= nargs 2)
      (let ((place (first args))
            (value (second args)))
        (cond
         ((symbolp place)
          `(setq ,place ,value))
         ((consp place)
          (let ((expander (get (car place) *setf-expander*)))
            (cond ((null expander)
                   (error "no SETF expansion for ~A" place))
                  ((symbolp expander)
                   `(,expander ,@(cdr place) ,value))
                  ((functionp expander)
                   `(funcall ,expander ,@(cdr place) value))
                  (t
                   (error "SETF: unhandled case")))))
         (t nil))))
     ((oddp nargs)
      (error "odd number of args to SETF"))
     (t
      (do ((a args (cddr a)) (l nil))
        ((null a) `(progn ,@(nreverse l)))
	(setq l (cons (list 'setf (car a) (cadr a)) l)))))))

(defmacro incf (place &optional (delta 1))
  `(setf ,place (+ ,place ,delta)))

(defmacro decf (place &optional (delta 1))
  `(setf ,place (- ,place ,delta)))

(defconstant *setf-expander* (make-symbol "SETF-EXPANDER"))

(%put 'car *setf-expander* '%rplaca)
(%put 'cdr *setf-expander* '%rplacd)
(%put 'rest *setf-expander* '%rplacd)
(%put 'nth *setf-expander* '%setnth)
(%put 'aref *setf-expander* '%aset)
(%put 'svref *setf-expander* '%svset)
(%put 'fill-pointer *setf-expander* '%set-fill-pointer)
(%put 'symbol-function *setf-expander* 'fset)
(%put 'symbol-plist *setf-expander* '%set-symbol-plist)
(%put 'get *setf-expander* '%put)
(%put 'gethash *setf-expander* 'puthash)
(%put 'documentation *setf-expander* '%set-documentation)

(defmacro defsetf (access-function update-function)
  `(%put ',access-function *setf-expander* ',update-function))

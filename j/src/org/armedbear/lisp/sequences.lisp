;;; sequences.lisp

(in-package "COMMON-LISP")

(export '(some every notany notevery copy-seq reverse nreverse
          position position-if position-if-not
          find find-if find-if-not))

(defun signal-index-too-large-error (sequence index)
  (error 'type-error))

(defun %setelt (sequence index newval)
  (cond ((listp sequence)
         (do ((count index (1- count))
              (seq sequence))
           ((= count 0) (rplaca seq newval) newval)
           (if (atom (cdr seq))
               (signal-index-too-large-error sequence index)
               (setq seq (cdr seq)))))
        ((vectorp sequence)
         (when (>= index (length sequence))
           (signal-index-too-large-error sequence index))
         (setf (aref sequence index) newval))))

(defsetf elt %setelt)

(defun some (predicate sequence &rest more-sequences)
  (setq more-sequences (cons sequence more-sequences))
  (do ((i 0 (1+ i))
       (l (apply #'min (mapcar #'length more-sequences))))
    ((>= i l) nil)
    (declare (fixnum i l))
    (let ((that-value
           (apply predicate
                  (mapcar #'(lambda (z) (elt z i)) more-sequences))))
      (when that-value (return that-value)))))

(defun every (predicate sequence &rest more-sequences)
  (setq more-sequences (cons sequence more-sequences))
  (do ((i 0 (1+ i))
       (l (apply #'min (mapcar #'length more-sequences))))
    ((>= i l) t)
    (declare (fixnum i l))
    (unless (apply predicate (mapcar #'(lambda (z) (elt z i)) more-sequences))
      (return nil))))

(defun notany (predicate sequence &rest more-sequences)
  (not (apply #'some predicate sequence more-sequences)))

(defun notevery (predicate sequence &rest more-sequences)
  (not (apply #'every predicate sequence more-sequences)))

(defmacro seq-dispatch (sequence list-form array-form)
  `(if (listp ,sequence)
       ,list-form
       ,array-form))

(defmacro type-specifier-atom (type)
  `(if (atom ,type) ,type (car ,type)))

(defun make-sequence-of-type (type length)
  (case (type-specifier-atom type)
    (list (make-list length))
    ((bit-vector simple-bit-vector) (make-array length :element-type 'bit))
    (string (make-string length))
    (vector (make-array length))
    (t
     (error 'type-error))))

(defmacro vector-copy-seq (sequence type)
  `(let ((length (length (the vector ,sequence))))
     (do ((index 0 (1+ index))
	  (copy (make-sequence-of-type ,type length)))
       ((= index length) copy)
       (setf (aref copy index) (aref ,sequence index)))))

(defmacro list-copy-seq (list)
  `(if (atom ,list) '()
       (let ((result (cons (car ,list) '()) ))
	 (do ((x (cdr ,list) (cdr x))
	      (splice result
		      (cdr (rplacd splice (cons (car x) '() ))) ))
           ((atom x) (unless (null x)
                       (rplacd splice x))
            result)))))

(defun copy-seq (sequence)
  (seq-dispatch sequence
		(list-copy-seq* sequence)
		(vector-copy-seq* sequence)))

(defun list-copy-seq* (sequence)
  (list-copy-seq sequence))

(defun vector-copy-seq* (sequence)
  (vector-copy-seq sequence (type-of sequence)))

(defmacro vector-reverse (sequence type)
  `(let ((length (length ,sequence)))
     (do ((forward-index 0 (1+ forward-index))
	  (backward-index (1- length) (1- backward-index))
	  (new-sequence (make-sequence-of-type ,type length)))
       ((= forward-index length) new-sequence)
       (setf (aref new-sequence forward-index)
	     (aref ,sequence backward-index)))))

(defmacro list-reverse-macro (sequence)
  `(do ((new-list ()))
     ((atom ,sequence) new-list)
     (push (pop ,sequence) new-list)))

(defun reverse (sequence)
  (seq-dispatch sequence
		(list-reverse* sequence)
		(vector-reverse* sequence)))

(defun list-reverse* (sequence)
  (list-reverse-macro sequence))

(defun vector-reverse* (sequence)
  (vector-reverse sequence (type-of sequence)))

;; FIXME
(defun nreverse (sequence)
  (reverse sequence))

(defmacro vector-locater-macro (sequence body-form return-type)
  `(let ((incrementer (if from-end -1 1))
	 (start (if from-end (1- (the fixnum end)) start))
	 (end (if from-end (1- (the fixnum start)) end)))
     (declare (fixnum start end incrementer))
     (do ((index start (+ index incrementer))
	  ,@(case return-type (:position nil) (:element '(current))))
       ((= index end) ())
       (declare (fixnum index))
       ,@(case return-type
	   (:position nil)
	   (:element `((setf current (aref ,sequence index)))))
       ,body-form)))

(defmacro locater-test-not (item sequence seq-type return-type)
  (let ((seq-ref (case return-type
		   (:position
		    (case seq-type
		      (:vector `(aref ,sequence index))
		      (:list `(pop ,sequence))))
		   (:element 'current)))
	(return (case return-type
		  (:position 'index)
		  (:element 'current))))
    `(if test-not
	 (if (not (funcall test-not ,item (apply-key key ,seq-ref)))
	     (return ,return))
	 (if (funcall test ,item (apply-key key ,seq-ref))
	     (return ,return)))))

(defmacro vector-locater (item sequence return-type)
  `(vector-locater-macro ,sequence
			 (locater-test-not ,item ,sequence :vector ,return-type)
			 ,return-type))

(defmacro locater-if-test (test sequence seq-type return-type sense)
  (let ((seq-ref (case return-type
		   (:position
		    (case seq-type
		      (:vector `(aref ,sequence index))
		      (:list `(pop ,sequence))))
		   (:element 'current)))
	(return (case return-type
		  (:position 'index)
		  (:element 'current))))
    (if sense
	`(if (funcall ,test (apply-key key ,seq-ref))
	     (return ,return))
	`(if (not (funcall ,test (apply-key key ,seq-ref)))
	     (return ,return)))))

(defmacro vector-locater-if-macro (test sequence return-type sense)
  `(vector-locater-macro ,sequence
			 (locater-if-test ,test ,sequence :vector ,return-type ,sense)
			 ,return-type))

(defmacro vector-locater-if (test sequence return-type)
  `(vector-locater-if-macro ,test ,sequence ,return-type t))

(defmacro vector-locater-if-not (test sequence return-type)
  `(vector-locater-if-macro ,test ,sequence ,return-type nil))

(defmacro list-locater-macro (sequence body-form return-type)
  `(if from-end
       (do ((sequence (nthcdr (- (length sequence) end)
			      (reverse ,sequence)))
	    (index (1- end) (1- index))
	    (terminus (1- start))
	    ,@(case return-type (:position nil) (:element '(current))))
         ((or (= index terminus) (null sequence)) ())
	 ,@(case return-type
	     (:position nil)
	     (:element `((setf current (pop ,sequence)))))
	 ,body-form)
       (do ((sequence (nthcdr start ,sequence))
	    (index start (1+ index))
	    ,@(case return-type (:position nil) (:element '(current))))
         ((or (= index (the fixnum end)) (null sequence)) ())
	 ,@(case return-type
	     (:position nil)
	     (:element `((setf current (pop ,sequence)))))
	 ,body-form)))

(defmacro list-locater (item sequence return-type)
  `(list-locater-macro ,sequence
		       (locater-test-not ,item ,sequence :list ,return-type)
		       ,return-type))

(defmacro list-locater-if-macro (test sequence return-type sense)
  `(list-locater-macro ,sequence
		       (locater-if-test ,test ,sequence :list ,return-type ,sense)
		       ,return-type))

(defmacro list-locater-if (test sequence return-type)
  `(list-locater-if-macro ,test ,sequence ,return-type t))

(defmacro list-locater-if-not (test sequence return-type)
  `(list-locater-if-macro ,test ,sequence ,return-type nil))

(defmacro vector-position (item sequence)
  `(vector-locater ,item ,sequence :position))

(defmacro list-position (item sequence)
  `(list-locater ,item ,sequence :position))


(defun position (item sequence &key from-end (test #'eql) test-not (start 0)
                      end key)
  (seq-dispatch sequence
                (list-position* item sequence from-end test test-not start end key)
                (vector-position* item sequence from-end test test-not start end key)))


(defun list-position* (item sequence from-end test test-not start end key)
  (declare (fixnum start))
  (when (null end) (setf end (length sequence)))
  (list-position item sequence))

(defun vector-position* (item sequence from-end test test-not start end key)
  (declare (fixnum start))
  (when (null end) (setf end (length sequence)))
  (vector-position item sequence))

(defmacro vector-position-if (test sequence)
  `(vector-locater-if ,test ,sequence :position))

(defmacro list-position-if (test sequence)
  `(list-locater-if ,test ,sequence :position))

(defun position-if (test sequence &key from-end (start 0) key end)
  (declare (fixnum start))
  (let ((end (or end (length sequence))))
    (declare (type index end))
    (seq-dispatch sequence
		  (list-position-if test sequence)
		  (vector-position-if test sequence))))

(defmacro vector-position-if-not (test sequence)
  `(vector-locater-if-not ,test ,sequence :position))

(defmacro list-position-if-not (test sequence)
  `(list-locater-if-not ,test ,sequence :position))

(defun position-if-not (test sequence &key from-end (start 0) key end)
  (let ((end (or end (length sequence))))
    (seq-dispatch sequence
		  (list-position-if-not test sequence)
		  (vector-position-if-not test sequence))))

(defmacro vector-find (item sequence)
  `(vector-locater ,item ,sequence :element))

(defmacro list-find (item sequence)
  `(list-locater ,item ,sequence :element))

(defun find (item sequence &key from-end (test #'eql) test-not (start 0)
                  end key)
  (seq-dispatch sequence
                (list-find* item sequence from-end test test-not start end key)
                (vector-find* item sequence from-end test test-not start end key)))

(defun list-find* (item sequence from-end test test-not start end key)
  (when (null end) (setf end (length sequence)))
  (list-find item sequence))

(defun vector-find* (item sequence from-end test test-not start end key)
  (when (null end) (setf end (length sequence)))
  (vector-find item sequence))

(defmacro vector-find-if (test sequence)
  `(vector-locater-if ,test ,sequence :element))

(defmacro list-find-if (test sequence)
  `(list-locater-if ,test ,sequence :element))

(defun find-if (test sequence &key from-end (start 0) end key)
  (let ((end (or end (length sequence))))
    (seq-dispatch sequence
		  (list-find-if test sequence)
		  (vector-find-if test sequence))))

(defmacro vector-find-if-not (test sequence)
  `(vector-locater-if-not ,test ,sequence :element))

(defmacro list-find-if-not (test sequence)
  `(list-locater-if-not ,test ,sequence :element))

(defun find-if-not (test sequence &key from-end (start 0) end key)
  (let ((end (or end (length sequence))))
    (seq-dispatch sequence
		  (list-find-if-not test sequence)
		  (vector-find-if-not test sequence))))

;;; sequences.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: sequences.lisp,v 1.44 2003-06-10 16:07:19 piso Exp $
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

(in-package "COMMON-LISP")

(export '(subseq
          replace
          concatenate
          map map-into
          position position-if position-if-not
          find find-if find-if-not
          count count-if count-if-not
          mismatch))

(autoload 'make-sequence "make-sequence.lisp")

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

(defmacro make-sequence-like (sequence length)
  `(make-sequence-of-type (type-of ,sequence) ,length))


;;; SUBSEQ (from CMUCL)

(defun list-subseq (sequence start &optional end)
  (if (and end (>= start end))
      ()
      (let* ((groveled (nthcdr start sequence))
	     (result (list (car groveled))))
	(if groveled
	    (do ((list (cdr groveled) (cdr list))
		 (splice result (cdr (rplacd splice (list (car list)))))
		 (index (1+ start) (1+ index)))
              ((or (atom list) (and end (= index end)))
               result))
	    ()))))

(defun subseq (sequence start &optional end)
  (seq-dispatch sequence
		(list-subseq sequence start end)
		(vector-subseq sequence start end)))


(autoload 'copy-seq "copy-seq.lisp")
(autoload 'fill "fill.lisp")


;;; REPLACE (from ECL)

(defun replace (sequence1 sequence2
                          &key start1  end1
                          start2 end2 )
  (with-start-end start1 end1 sequence1
    (with-start-end start2 end2 sequence2
      (if (and (eq sequence1 sequence2)
               (> start1 start2))
          (do* ((i 0 (1+ i))
                (l (if (< (- end1 start1)
                          (- end2 start2))
                       (- end1 start1)
                       (- end2 start2)))
                (s1 (+ start1 (1- l)) (1- s1))
                (s2 (+ start2 (1- l)) (1- s2)))
               ((>= i l) sequence1)
            (setf (elt sequence1 s1) (elt sequence2 s2)))
          (do ((i 0 (1+ i))
               (l (if (< (- end1 start1)
                         (- end2 start2))
                      (- end1 start1)
                      (- end2 start2)))
               (s1 start1 (1+ s1))
               (s2 start2 (1+ s2)))
              ((>= i l) sequence1)
            (setf (elt sequence1 s1) (elt sequence2 s2)))))))


;;; CONCATENATE (from GCL)

(defun concatenate (result-type &rest sequences)
  (do ((x (make-sequence result-type
			 (apply #'+ (mapcar #'length sequences))))
       (s sequences (cdr s))
       (i 0))
    ((null s) x)
    (do ((j 0 (1+ j))
         (n (length (car s))))
      ((>= j n))
      (setf (elt x i) (elt (car s) j))
      (incf i))))


;;; MAP (from ECL)

(defun map (result-type function sequence &rest more-sequences)
  (setq more-sequences (cons sequence more-sequences))
  (let ((l (apply #'min (mapcar #'length more-sequences))))
    (if (null result-type)
        (do ((i 0 (1+ i))
             (l l))
          ((>= i l) nil)
          (apply function (mapcar #'(lambda (z) (elt z i))
                                  more-sequences)))
        (let ((x (make-sequence result-type l)))
          (do ((i 0 (1+ i))
               (l l))
            ((>= i l) x)
            (setf (elt x i)
                  (apply function (mapcar #'(lambda (z) (elt z i))
                                          more-sequences))))))))


;;; MAP-INTO (from CMUCL)

(defun map-into (result-sequence function &rest sequences)
  (let* ((fp-result
	  (and (arrayp result-sequence)
	       (array-has-fill-pointer-p result-sequence)))
	 (len (apply #'min
		     (if fp-result
			 (array-dimension result-sequence 0)
			 (length result-sequence))
		     (mapcar #'length sequences))))

    (when fp-result
      (setf (fill-pointer result-sequence) len))

    (dotimes (index len)
      (setf (elt result-sequence index)
	    (apply function
		   (mapcar #'(lambda (seq) (elt seq index))
			   sequences)))))
  result-sequence)

(autoload 'reduce "reduce.lisp")
(autoload 'delete "delete.lisp")
(autoload 'delete-if "delete.lisp")
(autoload 'delete-if-not "delete.lisp")
(autoload 'remove "remove.lisp")
(autoload 'remove-if "remove.lisp")
(autoload 'remove-if-not "remove.lisp")

(autoload 'remove-duplicates "remove-duplicates.lisp")
(autoload 'delete-duplicates "delete-duplicates.lisp")

(autoload 'substitute "substitute.lisp")
(autoload 'substitute-if "substitute.lisp")
(autoload 'substitute-if-not "substitute.lisp")

(autoload 'nsubstitute "nsubstitute.lisp")
(autoload 'nsubstitute-if "nsubstitute.lisp")
(autoload 'nsubstitute-if-not "nsubstitute.lisp")

(defmacro vector-locater-macro (sequence body-form return-type)
  `(let ((incrementer (if from-end -1 1))
	 (start (if from-end (1- end) start))
	 (end (if from-end (1- start) end)))
     (do ((index start (+ index incrementer))
	  ,@(case return-type (:position nil) (:element '(current))))
       ((= index end) ())
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
         ((or (= index end) (null sequence)) ())
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
  (when (null end) (setf end (length sequence)))
  (list-position item sequence))

(defun vector-position* (item sequence from-end test test-not start end key)
  (when (null end) (setf end (length sequence)))
  (vector-position item sequence))

(defmacro vector-position-if (test sequence)
  `(vector-locater-if ,test ,sequence :position))

(defmacro list-position-if (test sequence)
  `(list-locater-if ,test ,sequence :position))

(defun position-if (test sequence &key from-end (start 0) key end)
  (let ((end (or end (length sequence))))
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

(defmacro vector-count-if (not-p from-end-p predicate sequence)
  (let ((next-index (if from-end-p '(1- index) '(1+ index)))
        (pred `(funcall ,predicate (apply-key key (aref ,sequence index)))))
    `(let ((%start ,(if from-end-p '(1- end) 'start))
           (%end ,(if from-end-p '(1- start) 'end)))
       (do ((index %start ,next-index)
            (count 0))
         ((= index %end) count)
         (,(if not-p 'unless 'when) ,pred
           (setq count (1+ count)))))))

(defmacro list-count-if (not-p from-end-p predicate sequence)
  (let ((pred `(funcall ,predicate (apply-key key (pop sequence)))))
    `(let ((%start ,(if from-end-p '(- length end) 'start))
           (%end ,(if from-end-p '(- length start) 'end))
           (sequence ,(if from-end-p '(reverse sequence) 'sequence)))
       (do ((sequence (nthcdr %start ,sequence))
            (index %start (1+ index))
            (count 0))
         ((or (= index %end) (null sequence)) count)
         (,(if not-p 'unless 'when) ,pred
           (setq count (1+ count)))))))

(defun count (item sequence &key from-end (test #'eql test-p) (test-not nil test-not-p)
		   (start 0) end key)
  (when (and test-p test-not-p)
    (error "test and test-not both supplied"))
  (let* ((length (length sequence))
	 (end (or end length)))
    (let ((%test (if test-not-p
		     (lambda (x)
		       (not (funcall test-not item x)))
		     (lambda (x)
		       (funcall test item x)))))
      (if (listp sequence)
          (if from-end
              (list-count-if nil t %test sequence)
              (list-count-if nil nil %test sequence))
          (if from-end
              (vector-count-if nil t %test sequence)
              (vector-count-if nil nil %test sequence))))))

(defun count-if (test sequence &key from-end (start 0) end key)
  (let* ((length (length sequence))
	 (end (or end length)))
    (seq-dispatch sequence
		  (if from-end
		      (list-count-if nil t test sequence)
		      (list-count-if nil nil test sequence))
		  (if from-end
		      (vector-count-if nil t test sequence)
		      (vector-count-if nil nil test sequence)))))

(defun count-if-not (test sequence &key from-end (start 0) end key)
  (let* ((length (length sequence))
	 (end (or end length)))
    (seq-dispatch sequence
		  (if from-end
		      (list-count-if t t test sequence)
		      (list-count-if t nil test sequence))
		  (if from-end
		      (vector-count-if t t test sequence)
		      (vector-count-if t nil test sequence)))))


;;; MISMATCH (from ECL)

(defun call-test (test test-not item keyx)
  (cond (test (funcall test item keyx))
        (test-not (not (funcall test-not item keyx)))
        (t (eql item keyx))))

(defun test-error()
  (error "both test and test are supplied"))

(defun bad-seq-limit (x &optional y)
  (error "bad sequence limit ~a" (if y (list x y) x)))

(defmacro with-start-end (start end seq &body body)
  `(let* ((,start (if ,start (the-start ,start) 0))
          (,end (the-end ,end ,seq)))
     (unless (<= ,start ,end) (bad-seq-limit ,start ,end))
     ,@ body))

(defun the-end (x y)
  (cond ((fixnump x)
	 (unless (<= x (length y))
	   (bad-seq-limit x))
	 x)
	((null x)
	 (length y))
	(t (bad-seq-limit x))))

(defun the-start (x)
  (cond ((fixnump x)
	 (unless (>= x 0)
           (bad-seq-limit x))
	 x)
	((null x) 0)
	(t (bad-seq-limit x))))

(defun mismatch (sequence1 sequence2 &key from-end test test-not
                           (key #'identity) start1 start2 end1 end2)
  (and test test-not (test-error))
  (with-start-end
   start1 end1 sequence1
   (with-start-end
    start2 end2 sequence2
    (if (not from-end)
        (do ((i1 start1 (1+ i1))
             (i2 start2 (1+ i2)))
          ((or (>= i1 end1) (>= i2 end2))
           (if (and (>= i1 end1) (>= i2 end2)) nil i1))
          (unless (call-test test test-not
                             (funcall key (elt sequence1 i1))
                             (funcall key (elt sequence2 i2)))
            (return i1)))
        (do ((i1 (1- end1) (1- i1))
             (i2 (1- end2)  (1- i2)))
          ((or (< i1 start1) (< i2 start2))
           (if (and (< i1 start1) (< i2 start2)) nil (1+ i1)))
          (unless (call-test test test-not
                             (funcall key (elt sequence1 i1))
                             (funcall key (elt sequence2 i2)))
            (return (1+ i1))))))))

(autoload 'search "search.lisp")

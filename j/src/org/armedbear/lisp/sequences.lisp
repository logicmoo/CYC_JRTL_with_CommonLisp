;;; sequences.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: sequences.lisp,v 1.47 2003-06-10 18:40:12 piso Exp $
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
          find find-if find-if-not))

(autoload 'make-sequence)

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
  (if (listp sequence)
      (list-subseq sequence start end)
      (vector-subseq sequence start end)))


(autoload '(copy-seq fill))


(defun bad-seq-limit (x &optional y)
  (error "bad sequence limit ~a" (if y (list x y) x)))

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

(defmacro with-start-end (start end seq &body body)
  `(let* ((,start (if ,start (the-start ,start) 0))
          (,end (the-end ,end ,seq)))
     (unless (<= ,start ,end) (bad-seq-limit ,start ,end))
     ,@ body))


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

(autoload 'reduce)
(autoload '(delete delete-if delete-if-not) "delete.lisp")
(autoload '(remove remove-if remove-if-not) "remove.lisp")
(autoload '(remove-duplicates delete-duplicates))
(autoload '(substitute substitute-if substitute-if-not) "substitute.lisp")
(autoload '(nsubstitute nsubstitute-if nsubstitute-if-not) "nsubstitute.lisp")
(autoload '(position position-if position-if-not find find-if find-if-not)
          "find.lisp")
(autoload '(count count-if count-if-not) "count.lisp")
(autoload '(mismatch search))

;;; sort.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
;;; $Id: sort.lisp,v 1.7 2005-12-29 15:13:30 piso Exp $
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

(in-package #:system)

(defun sort (sequence predicate &key key)
  (if (listp sequence)
      (sort-list sequence predicate key)
      (quick-sort sequence 0 (length sequence) predicate key)))

(defun stable-sort (sequence predicate &key key)
  (if (listp sequence)
      (sort-list sequence predicate key)
      (quick-sort sequence 0 (length sequence) predicate key)))

;;; From CMUCL.

;;; Stable Sorting Lists

;;; APPLY-PRED saves us a function call sometimes.
(defmacro apply-pred (one two pred key)
  `(if ,key
       (funcall ,pred (funcall ,key ,one)
                (funcall ,key  ,two))
       (funcall ,pred ,one ,two)))

;;; MERGE-LISTS*   originally written by Jim Large.
;;; 		   modified to return a pointer to the end of the result
;;; 		      and to not cons header each time its called.
;;; It destructively merges list-1 with list-2.  In the resulting
;;; list, elements of list-2 are guaranteed to come after equal elements
;;; of list-1.
(defun merge-lists* (list-1 list-2 pred key
;; 			    &optional (merge-lists-header (list :header)))
                            merge-lists-header)
  (do* ((result merge-lists-header)
	(p result))                         ; P points to last cell of result
    ((or (null list-1) (null list-2))       ; done when either list used up
     (if (null list-1)                      ; in which case, append the
         (rplacd p list-2)                  ;   other list
         (rplacd p list-1))
     (do ((drag p lead)
          (lead (cdr p) (cdr lead)))
       ((null lead)
        (values (prog1 (cdr result)         ; return the result sans header
                       (rplacd result nil)) ; (free memory, be careful)
                drag))))		    ; and return pointer to last element
    (cond ((apply-pred (car list-2) (car list-1) pred key)
	   (rplacd p list-2)           ; append the lesser list to last cell of
	   (setq p (cdr p))            ;   result.  Note: test must bo done for
	   (pop list-2))               ;   list-2 < list-1 so merge will be
	  (t (rplacd p list-1)         ;   stable for list-1
	     (setq p (cdr p))
	     (pop list-1)))))

;;; SORT-LIST uses a bottom up merge sort.  First a pass is made over
;;; the list grabbing one element at a time and merging it with the next one
;;; form pairs of sorted elements.  Then n is doubled, and elements are taken
;;; in runs of two, merging one run with the next to form quadruples of sorted
;;; elements.  This continues until n is large enough that the inner loop only
;;; runs for one iteration; that is, there are only two runs that can be merged,
;;; the first run starting at the beginning of the list, and the second being
;;; the remaining elements.

(defun sort-list (list pred key)
  (let ((head (cons :header list))  ; head holds on to everything
	(n 1)                       ; bottom-up size of lists to be merged
	unsorted		    ; unsorted is the remaining list to be
                                    ;   broken into n size lists and merged
	list-1			    ; list-1 is one length n list to be merged
	last			    ; last points to the last visited cell
	(merge-lists-header (list :header)))
    (declare (fixnum n))
    (loop
      ;; start collecting runs of n at the first element
      (setf unsorted (cdr head))
      ;; tack on the first merge of two n-runs to the head holder
      (setf last head)
      (let ((n-1 (1- n)))
        (declare (fixnum n-1))
        (loop
          (setf list-1 unsorted)
          (let ((temp (nthcdr n-1 list-1))
                list-2)
            (cond (temp
                   ;; there are enough elements for a second run
                   (setf list-2 (cdr temp))
                   (setf (cdr temp) nil)
                   (setf temp (nthcdr n-1 list-2))
                   (cond (temp
                          (setf unsorted (cdr temp))
                          (setf (cdr temp) nil))
                         ;; the second run goes off the end of the list
                         (t (setf unsorted nil)))
                   (multiple-value-bind (merged-head merged-last)
                       (merge-lists* list-1 list-2 pred key
                                     merge-lists-header)
                     (setf (cdr last) merged-head)
                     (setf last merged-last))
                   (if (null unsorted) (return)))
                  ;; if there is only one run, then tack it on to the end
                  (t (setf (cdr last) list-1)
                     (return)))))
        (setf n (+ n n))
        ;; If the inner loop only executed once, then there were only enough
        ;; elements for two runs given n, so all the elements have been merged
        ;; into one list.  This may waste one outer iteration to realize.
        (if (eq list-1 (cdr head))
            (return list-1))))))

;;; From ECL.
(defun quick-sort (seq start end pred key)
  (unless key (setq key #'identity))
  (if (<= end (1+ start))
      seq
      (let* ((j start) (k end) (d (elt seq start)) (kd (funcall key d)))
        (block outer-loop
          (loop (loop (decf k)
                  (unless (< j k) (return-from outer-loop))
                  (when (funcall pred (funcall key (elt seq k)) kd)
                    (return)))
            (loop (incf j)
              (unless (< j k) (return-from outer-loop))
              (unless (funcall pred (funcall key (elt seq j)) kd)
                (return)))
            (let ((temp (elt seq j)))
              (setf (elt seq j) (elt seq k)
                    (elt seq k) temp))))
        (setf (elt seq start) (elt seq j)
              (elt seq j) d)
        (quick-sort seq start j pred key)
        (quick-sort seq (1+ j) end pred key))))

;;; From ECL.
(defun merge (result-type sequence1 sequence2 predicate
                          &key key
                          &aux (l1 (length sequence1)) (l2 (length sequence2)))
  (unless key (setq key #'identity))
  (do ((newseq (make-sequence result-type (+ l1 l2)))
       (j 0 (1+ j))
       (i1 0)
       (i2 0))
    ((and (= i1 l1) (= i2 l2)) newseq)
    (cond ((and (< i1 l1) (< i2 l2))
	   (cond ((funcall predicate
			   (funcall key (elt sequence1 i1))
			   (funcall key (elt sequence2 i2)))
		  (setf (elt newseq j) (elt sequence1 i1))
		  (incf i1))
		 ((funcall predicate
			   (funcall key (elt sequence2 i2))
			   (funcall key (elt sequence1 i1)))
		  (setf (elt newseq j) (elt sequence2 i2))
		  (incf i2))
		 (t
		  (setf (elt newseq j) (elt sequence1 i1))
		  (incf i1))))
          ((< i1 l1)
	   (setf (elt newseq j) (elt sequence1 i1))
	   (incf i1))
	  (t
	   (setf (elt newseq j) (elt sequence2 i2))
	   (incf i2)))))

;;; find.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: find.lisp,v 1.5 2004-01-09 18:21:49 piso Exp $
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

(in-package "SYSTEM")

;;; From CMUCL.

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
	 (if (not (funcall test-not ,item (sys::apply-key key ,seq-ref)))
	     (return ,return))
	 (if (funcall test ,item (sys::apply-key key ,seq-ref))
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
	`(if (funcall ,test (sys::apply-key key ,seq-ref))
	     (return ,return))
	`(if (not (funcall ,test (sys::apply-key key ,seq-ref)))
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
  (if (listp sequence)
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
    (if (listp sequence)
        (list-position-if test sequence)
        (vector-position-if test sequence))))

(defmacro vector-position-if-not (test sequence)
  `(vector-locater-if-not ,test ,sequence :position))

(defmacro list-position-if-not (test sequence)
  `(list-locater-if-not ,test ,sequence :position))

(defun position-if-not (test sequence &key from-end (start 0) key end)
  (let ((end (or end (length sequence))))
    (if (listp sequence)
        (list-position-if-not test sequence)
        (vector-position-if-not test sequence))))

(defmacro vector-find (item sequence)
  `(vector-locater ,item ,sequence :element))

(defmacro list-find (item sequence)
  `(list-locater ,item ,sequence :element))

(defun find (item sequence &key from-end (test #'eql) test-not (start 0)
                  end key)
  (if (listp sequence)
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
    (if (listp sequence)
        (list-find-if test sequence)
        (vector-find-if test sequence))))

(defmacro vector-find-if-not (test sequence)
  `(vector-locater-if-not ,test ,sequence :element))

(defmacro list-find-if-not (test sequence)
  `(list-locater-if-not ,test ,sequence :element))

(defun find-if-not (test sequence &key from-end (start 0) end key)
  (let ((end (or end (length sequence))))
    (if (listp sequence)
        (list-find-if-not test sequence)
        (vector-find-if-not test sequence))))

(when (and (fboundp 'jvm::jvmcompile) (not (autoloadp 'jvm::jvm-compile)))
  (mapcar #'jvm::jvm-compile '(position
                               list-position*
                               vector-position*
                               position-if
                               position-if-not
                               find
                               list-find*
                               vector-find*
                               find-if
                               find-if-not)))

;;; print.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: print.lisp,v 1.7 2004-06-20 16:35:14 piso Exp $
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

;;; Adapted from SBCL.

(in-package "SYSTEM")

;;; Can this object contain other objects?
(defun compound-object-p (x)
  (or (consp x)
      (typep x 'structure-object)
      (typep x 'standard-object)
      (typep x '(array t *))))

;;; Punt if INDEX is equal or larger then *PRINT-LENGTH* (and
;;; *PRINT-READABLY* is NIL) by outputting \"...\" and returning from
;;; the block named NIL.
(defmacro punt-print-if-too-long (index stream)
  `(when (and (not *print-readably*)
	      *print-length*
	      (>= ,index *print-length*))
     (write-string "..." ,stream)
     (return)))

(defun output-integer (integer stream)
  (%output-object integer stream))

(defvar *current-level-in-print* 0)

(defun output-list (list stream)
  (cond ((and (null *print-readably*)
              *print-level*
              (>= *current-level-in-print* *print-level*))
         (write-char #\# stream))
        (t
         (let ((*current-level-in-print* (1+ *current-level-in-print*)))
                (write-char #\( stream)
                (let ((length 0)
                      (list list))
                  (loop
                    (punt-print-if-too-long length stream)
                    (output-object (pop list) stream)
                    (unless list
                      (return))
                    (when (or (atom list)
                              (check-for-circularity list))
                      (write-string " . " stream)
                      (output-object list stream)
                      (return))
                    (write-char #\space stream)
                    (incf length)))
                (write-char #\) stream))))
  list)

;;; Output the abbreviated #< form of an array.
(defun output-terse-array (array stream)
  (let ((*print-level* nil)
	(*print-length* nil))
    (print-unreadable-object (array stream :type t :identity t))))

(defun array-readably-printable-p (array)
  (and (eq (array-element-type array) t)
       (let ((zero (position 0 (array-dimensions array)))
	     (number (position 0 (array-dimensions array)
			       :test (complement #'eql)
			       :from-end t)))
	 (or (null zero) (null number) (> zero number)))))

(defun output-vector (vector stream)
  (declare (vector vector))
  (cond ((stringp vector)
         (sys::%output-object vector stream))
	((not (or *print-array* *print-readably*))
	 (output-terse-array vector stream))
	((bit-vector-p vector)
         (sys::%output-object vector stream))
	(t
	 (when (and *print-readably*
		    (not (array-readably-printable-p vector)))
	   (error 'print-not-readable :object vector))
         (cond ((and (null *print-readably*)
                     *print-level*
                     (>= *current-level-in-print* *print-level*))
                (write-char #\# stream))
               (t
                (let ((*current-level-in-print* (1+ *current-level-in-print*)))
                  (write-string "#(" stream)
                  (dotimes (i (length vector))
                    (unless (zerop i)
                      (write-char #\space stream))
                    (punt-print-if-too-long i stream)
                    (output-object (aref vector i) stream))
                  (write-string ")" stream))))))
  vector)

(defun output-ugly-object (object stream)
  (cond ((consp object)
         (output-list object stream))
        ((vectorp object)
         (output-vector object stream))
        (t
         (%output-object object stream))))

;; FIXME
(defun output-pretty-object (object stream)
  (require 'pprint)
  (let ((pkg (find-package "XP")))
    (when pkg
      (funcall (symbol-function (intern "BASIC-WRITE" pkg)) object stream))))

;;;; circularity detection stuff

;;; When *PRINT-CIRCLE* is T, this gets bound to a hash table that
;;; (eventually) ends up with entries for every object printed. When
;;; we are initially looking for circularities, we enter a T when we
;;; find an object for the first time, and a 0 when we encounter an
;;; object a second time around. When we are actually printing, the 0
;;; entries get changed to the actual marker value when they are first
;;; printed.
(defvar *circularity-hash-table* nil)

;;; When NIL, we are just looking for circularities. After we have
;;; found them all, this gets bound to 0. Then whenever we need a new
;;; marker, it is incremented.
(defvar *circularity-counter* nil)

;;; Check to see whether OBJECT is a circular reference, and return
;;; something non-NIL if it is. If ASSIGN is T, then the number to use
;;; in the #n= and #n# noise is assigned at this time.
;;; If ASSIGN is true, reference bookkeeping will only be done for
;;; existing entries, no new references will be recorded!
;;;
;;; Note: CHECK-FOR-CIRCULARITY must be called *exactly* once with
;;; ASSIGN true, or the circularity detection noise will get confused
;;; about when to use #n= and when to use #n#. If this returns non-NIL
;;; when ASSIGN is true, then you must call HANDLE-CIRCULARITY on it.
;;; If CHECK-FOR-CIRCULARITY returns :INITIATE as the second value,
;;; you need to initiate the circularity detection noise, e.g. bind
;;; *CIRCULARITY-HASH-TABLE* and *CIRCULARITY-COUNTER* to suitable values
;;; (see #'OUTPUT-OBJECT for an example).
(defun check-for-circularity (object &optional assign)
  (cond ((null *print-circle*)
	 ;; Don't bother, nobody cares.
	 nil)
	((null *circularity-hash-table*)
         (values nil :initiate))
	((null *circularity-counter*)
	 (ecase (gethash object *circularity-hash-table*)
	   ((nil)
	    ;; first encounter
	    (setf (gethash object *circularity-hash-table*) t)
	    ;; We need to keep looking.
	    nil)
	   ((t)
	    ;; second encounter
	    (setf (gethash object *circularity-hash-table*) 0)
	    ;; It's a circular reference.
	    t)
	   (0
	    ;; It's a circular reference.
	    t)))
	(t
	 (let ((value (gethash object *circularity-hash-table*)))
	   (case value
	     ((nil t)
	      ;; If NIL, we found an object that wasn't there the
	      ;; first time around. If T, this object appears exactly
	      ;; once. Either way, just print the thing without any
	      ;; special processing. Note: you might argue that
	      ;; finding a new object means that something is broken,
	      ;; but this can happen. If someone uses the ~@<...~:>
	      ;; format directive, it conses a new list each time
	      ;; though format (i.e. the &REST list), so we will have
	      ;; different cdrs.
	      nil)
	     (0
	      (if assign
		  (let ((value (incf *circularity-counter*)))
		    ;; first occurrence of this object: Set the counter.
		    (setf (gethash object *circularity-hash-table*) value)
		    value)
		  t))
	     (t
	      ;; second or later occurrence
	      (- value)))))))

;;; Handle the results of CHECK-FOR-CIRCULARITY. If this returns T then
;;; you should go ahead and print the object. If it returns NIL, then
;;; you should blow it off.
(defun handle-circularity (marker stream)
  (case marker
    (:initiate
     ;; Someone forgot to initiate circularity detection.
     (let ((*print-circle* nil))
       (error "trying to use CHECK-FOR-CIRCULARITY when ~
       circularity checking isn't initiated")))
    ((t)
     ;; It's a second (or later) reference to the object while we are
     ;; just looking. So don't bother groveling it again.
     nil)
    (t
     (write-char #\# stream)
     (let ((*print-base* 10) (*print-radix* nil))
       (cond ((minusp marker)
	      (output-integer (- marker) stream)
	      (write-char #\# stream)
	      nil)
	     (t
	      (output-integer marker stream)
	      (write-char #\= stream)
	      t))))))

;;;; OUTPUT-OBJECT -- the main entry point

;; Objects whose print representation identifies them EQLly don't need to be
;; checked for circularity.
(defun uniquely-identified-by-print-p (x)
  (or (numberp x)
      (characterp x)
      (and (symbolp x)
	   (symbol-package x))))

(defun %print-object (object stream)
  (if *print-pretty*
      (output-pretty-object object stream)
      (output-ugly-object object stream)))

(defun %check-object (object stream)
  (multiple-value-bind (marker initiate) (check-for-circularity object t)
    (if (eq initiate :initiate)
        ;; Initialize circularity detection.
        (let ((*circularity-hash-table* (make-hash-table :test 'eq)))
          (%check-object object (make-broadcast-stream))
          (let ((*circularity-counter* 0))
            (%check-object object stream)))
        ;; Otherwise...
        (if marker
            (progn
              (when (handle-circularity marker stream)
                (%print-object object stream)))
            (%print-object object stream)))))

;;; Output OBJECT to STREAM observing all printer control variables.
(defun output-object (object stream)
  (cond ((or (not *print-circle*)
             (uniquely-identified-by-print-p object))
         (%print-object object stream))
        ;; If we have already started circularity detection, this object might
        ;; be a shared reference. If we have not, then if it is a compound
        ;; object, it might contain a circular reference to itself or multiple
        ;; shared references.
        ((or *circularity-hash-table*
             (compound-object-p object))
         (%check-object object stream))
        (t
         (%print-object object stream)))
  object)

;;; sequences.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: sequences.lisp,v 1.26 2003-03-14 20:05:32 piso Exp $
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

(export '(make-sequence
          some every notany notevery subseq copy-seq fill reverse nreverse
          concatenate
          map
          reduce
          delete delete-if delete-if-not
          remove remove-if remove-if-not
          remove-duplicates delete-duplicates
          substitute substitute-if substitute-if-not
          nsubstitute nsubstitute-if nsubstitute-if-not
          position position-if position-if-not
          find find-if find-if-not
          count count-if count-if-not
          search))

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


;;; MAKE-SEQUENCE (from ECL)

;;; Returns two values:
;;;  VALUE-1 = normalized type name or object
;;;  VALUE-2 = normalized type arguments or nil
(defun normalize-type (type)
  (let (tp i fd)
    (cond ((symbolp type)
           (values type nil))
          ((consp type)
           (setq tp (car type) i (cdr type))
           (if (and (eq tp 'INTEGER) (consp (cadr i)))
               (values tp (list (car i) (1- (caadr i))))
               (values tp i)))
          (t
           (error "normalize-type: bogus type specifier ~A" type)))))


(defun make-sequence (type size	&key (initial-element nil iesp))
  (let (element-type sequence)
    (if (atom type)
        (cond ((memq type '(LIST CONS))
               (when (zerop size)
                 (if (eq type 'CONS)
                     (error 'type-error
                            "the requested length (0) does not match the specified type CONS")
                     (return-from make-sequence nil)))
               (return-from make-sequence
                            (if iesp
                                (make-list size :initial-element initial-element)
                                (make-list size))))
              ((memq type '(STRING SIMPLE-STRING))
               (return-from make-sequence
                            (if iesp
                                (make-string size :initial-element initial-element)
                                (make-string size))))
              (t
               (setq element-type
                     (cond ((memq type '(BIT-VECTOR SIMPLE-BIT-VECTOR)) 'BIT)
                           ((memq type '(VECTOR SIMPLE-VECTOR)) t)
                           (t
                            (error 'type-error "~S is not a sequence type" type))))))
        (multiple-value-bind (name args) (normalize-type type)
          (when (memq name '(LIST CONS))
            (return-from make-sequence
                         (if iesp
                             (make-list size :initial-element initial-element)
                             (make-list size))))
          (unless (memq name '(ARRAY VECTOR SIMPLE-VECTOR BIT-VECTOR
                               SIMPLE-BIT-VECTOR STRING SIMPLE-STRING))
            (error 'type-error "~S is not a sequence type" type))
          (let ((len nil))
            (cond ((memq name '(STRING SIMPLE-STRING))
                   (setq element-type 'character
                         len (car args)))
                  (t
                   (setq element-type (or (car args) t)
                         len (cadr args))))
            (unless (or (null len) (eq len '*))
              (when (/= size len)
                (error 'type-error
                       "the requested length (~A) does not match the specified type ~A"
                       size type))))))
    (setq sequence (make-array size :element-type element-type))
    (when iesp
      (dotimes (i size)
        (setf (elt sequence i) initial-element)))
    sequence))


;;; SOME, EVERY, NOTANY, NOTEVERY (from ECL)

(defun some (predicate sequence &rest more-sequences)
  (setq more-sequences (cons sequence more-sequences))
  (do ((i 0 (1+ i))
       (l (apply #'min (mapcar #'length more-sequences))))
    ((>= i l) nil)
    (let ((that-value
           (apply predicate
                  (mapcar #'(lambda (z) (elt z i)) more-sequences))))
      (when that-value (return that-value)))))

(defun every (predicate sequence &rest more-sequences)
  (setq more-sequences (cons sequence more-sequences))
  (do ((i 0 (1+ i))
       (l (apply #'min (mapcar #'length more-sequences))))
    ((>= i l) t)
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

(defmacro make-sequence-like (sequence length)
  `(make-sequence-of-type (type-of ,sequence) ,length))


;;; SUBSEQ (from CMUCL)

(defun vector-subseq* (sequence start &optional end)
  (when (null end) (setf end (length sequence)))
  (do ((old-index start (1+ old-index))
       (new-index 0 (1+ new-index))
       (copy (make-sequence-like sequence (- end start))))
    ((= old-index end) copy)
    (setf (aref copy new-index) (aref sequence old-index))))

(defun list-subseq* (sequence start &optional end)
  (if (and end (>= start (the fixnum end)))
      ()
      (let* ((groveled (nthcdr start sequence))
	     (result (list (car groveled))))
	(if groveled
	    (do ((list (cdr groveled) (cdr list))
		 (splice result (cdr (rplacd splice (list (car list)))))
		 (index (1+ start) (1+ index)))
              ((or (atom list) (and end (= index (the fixnum end))))
               result))
	    ()))))

(defun subseq (sequence start &optional end)
  (seq-dispatch sequence
		(list-subseq* sequence start end)
		(vector-subseq* sequence start end)))


;; COPY-SEQ (from CMUCL)

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


;;; FILL (from CMUCL)

(defmacro vector-fill (sequence item start end)
  `(do ((index ,start (1+ index)))
     ((= index (the fixnum ,end)) ,sequence)
     (setf (aref ,sequence index) ,item)))

(defmacro list-fill (sequence item start end)
  `(do ((current (nthcdr ,start ,sequence) (cdr current))
        (index ,start (1+ index)))
     ((or (atom current) (and end (= index (the fixnum ,end))))
      sequence)
     (rplaca current ,item)))

(defun list-fill* (sequence item start end)
  (list-fill sequence item start end))

(defun vector-fill* (sequence item start end)
  (when (null end) (setq end (length sequence)))
  (vector-fill sequence item start end))

(defun fill (sequence item &key (start 0) end)
  (seq-dispatch sequence
		(list-fill* sequence item start end)
		(vector-fill* sequence item start end)))


;;; REVERSE (from CMUCL)

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


;;; NREVERSE (from CMUCL)

(defmacro list-nreverse-macro (list)
  `(do ((1st (cdr ,list) (if (atom 1st) 1st (cdr 1st)))
        (2nd ,list 1st)
        (3rd '() 2nd))
     ((atom 2nd) 3rd)
     (rplacd 2nd 3rd)))

(defun list-nreverse* (sequence)
  (list-nreverse-macro sequence))

(defun nreverse (sequence)
  (seq-dispatch sequence
		(list-nreverse* sequence)
		(vector-nreverse* sequence)))


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

;;; REDUCE (from OpenMCL)

(defmacro list-reduce (function sequence start end initial-value ivp key)
  (let ((what `(if ,key (funcall ,key (car sequence)) (car sequence))))
    `(let ((sequence (nthcdr ,start ,sequence)))
       (do ((count (if ,ivp ,start (1+ ,start)) (1+ count))
            (sequence (if ,ivp sequence (cdr sequence))
                      (cdr sequence))
            (value (if ,ivp ,initial-value ,what)
                   (funcall ,function value ,what)))
         ((= count ,end) value)))))


(defmacro list-reduce-from-end (function sequence start end
                                         initial-value ivp key)
  (let ((what `(if ,key (funcall ,key (car sequence)) (car sequence))))
    `(let ((sequence (nthcdr (- (length ,sequence) ,end) (reverse ,sequence))))
       (do ((count (if ,ivp ,start (1+ ,start)) (1+ count))
            (sequence (if ,ivp sequence (cdr sequence))
                      (cdr sequence))
            (value (if ,ivp ,initial-value ,what)
                   (funcall ,function ,what value)))
         ((= count ,end) value)))))


(defun reduce (function sequence &key from-end (start 0)
                        end (initial-value nil ivp) key)
  (unless end (setq end (length sequence)))
  (if (= end start)
      (if ivp initial-value (funcall function))
      (seq-dispatch
       sequence
       (if from-end
           (list-reduce-from-end  function sequence start end initial-value ivp key)
           (list-reduce function sequence start end initial-value ivp key))
       (let* ((disp (if from-end -1 1))
              (index (if from-end (1- end) start))
              (terminus (if from-end (1- start) end))
              (value (if ivp initial-value
                         (let ((elt (aref sequence index)))
                           (setq index (+ index disp))
                           (if key (funcall key elt) elt))))
              (element nil))
         (do* ()
           ((= index terminus) value)
           (setq element (aref sequence index)
                 index (+ index disp)
                 element (if key (funcall key element) element)
                 value (funcall function (if from-end element value) (if from-end value element))))))))


;;; DELETE (from CMUCL)

(defmacro mumble-delete (pred)
  `(do ((index start (1+ index))
        (jndex start)
        (number-zapped 0))
     ((or (= index (the fixnum end)) (= number-zapped (the fixnum count)))
      (do ((index index (1+ index))		; copy the rest of the vector
           (jndex jndex (1+ jndex)))
        ((= index (the fixnum length))
         (shrink-vector sequence jndex))
        (setf (aref sequence jndex) (aref sequence index))))
     (setf (aref sequence jndex) (aref sequence index))
     (if ,pred
         (setq number-zapped (1+ number-zapped))
         (setq jndex (1+ jndex)))))

(defmacro mumble-delete-from-end (pred)
  `(do ((index (1- (the fixnum end)) (1- index)) ; find the losers
        (number-zapped 0)
        (losers ())
        this-element
        (terminus (1- start)))
     ((or (= index terminus) (= number-zapped (the fixnum count)))
      (do ((losers losers)			 ; delete the losers
           (index start (1+ index))
           (jndex start))
        ((or (null losers) (= index (the fixnum end)))
         (do ((index index (1+ index))	 ; copy the rest of the vector
              (jndex jndex (1+ jndex)))
           ((= index (the fixnum length))
            (shrink-vector sequence jndex))
           (setf (aref sequence jndex) (aref sequence index))))
        (setf (aref sequence jndex) (aref sequence index))
        (if (= index (the fixnum (car losers)))
            (pop losers)
            (setq jndex (1+ jndex)))))
     (setq this-element (aref sequence index))
     (when ,pred
       (setq number-zapped (1+ number-zapped))
       (push index losers))))

(defmacro normal-mumble-delete ()
  `(mumble-delete
    (if test-not
        (not (funcall test-not item (apply-key key (aref sequence index))))
        (funcall test item (apply-key key (aref sequence index))))))

(defmacro normal-mumble-delete-from-end ()
  `(mumble-delete-from-end
    (if test-not
        (not (funcall test-not item (apply-key key this-element)))
        (funcall test item (apply-key key this-element)))))

(defmacro list-delete (pred)
  `(let ((handle (cons nil sequence)))
     (do ((current (nthcdr start sequence) (cdr current))
          (previous (nthcdr start handle))
          (index start (1+ index))
          (number-zapped 0))
       ((or (= index (the fixnum end)) (= number-zapped (the fixnum count)))
        (cdr handle))
       (cond (,pred
              (rplacd previous (cdr current))
              (setq number-zapped (1+ number-zapped)))
             (t
              (setq previous (cdr previous)))))))

(defmacro list-delete-from-end (pred)
  `(let* ((reverse (nreverse (the list sequence)))
          (handle (cons nil reverse)))
     (do ((current (nthcdr (- (the fixnum length) (the fixnum end)) reverse)
                   (cdr current))
          (previous (nthcdr (- (the fixnum length) (the fixnum end)) handle))
          (index start (1+ index))
          (number-zapped 0))
       ((or (= index (the fixnum end)) (= number-zapped (the fixnum count)))
        (nreverse (cdr handle)))
       (cond (,pred
              (rplacd previous (cdr current))
              (setq number-zapped (1+ number-zapped)))
             (t
              (setq previous (cdr previous)))))))

(defmacro normal-list-delete ()
  '(list-delete
    (if test-not
        (not (funcall test-not item (apply-key key (car current))))
        (funcall test item (apply-key key (car current))))))

(defmacro normal-list-delete-from-end ()
  '(list-delete-from-end
    (if test-not
        (not (funcall test-not item (apply-key key (car current))))
        (funcall test item (apply-key key (car current))))))

(defmacro real-count (count)
  `(cond ((null ,count) most-positive-fixnum)
         ((fixnump ,count) (if (minusp ,count) 0 ,count))
         ((integerp ,count) (if (minusp ,count) 0 most-positive-fixnum))
         (t ,count)))

(defun delete (item sequence &key from-end (test #'eql) test-not (start 0)
                    end count key)
  (let* ((length (length sequence))
	 (end (or end length))
	 (count (real-count count)))
    (seq-dispatch sequence
		  (if from-end
		      (normal-list-delete-from-end)
		      (normal-list-delete))
		  (if from-end
		      (normal-mumble-delete-from-end)
		      (normal-mumble-delete)))))

(defmacro if-mumble-delete ()
  `(mumble-delete
    (funcall predicate (apply-key key (aref sequence index)))))

(defmacro if-mumble-delete-from-end ()
  `(mumble-delete-from-end
    (funcall predicate (apply-key key this-element))))

(defmacro if-list-delete ()
  '(list-delete
    (funcall predicate (apply-key key (car current)))))

(defmacro if-list-delete-from-end ()
  '(list-delete-from-end
    (funcall predicate (apply-key key (car current)))))

(defun delete-if (predicate sequence &key from-end (start 0) key end count)
  (let* ((length (length sequence))
	 (end (or end length))
	 (count (real-count count)))
    (seq-dispatch sequence
		  (if from-end
		      (if-list-delete-from-end)
		      (if-list-delete))
		  (if from-end
		      (if-mumble-delete-from-end)
		      (if-mumble-delete)))))

(defmacro if-not-mumble-delete ()
  `(mumble-delete
    (not (funcall predicate (apply-key key (aref sequence index))))))

(defmacro if-not-mumble-delete-from-end ()
  `(mumble-delete-from-end
    (not (funcall predicate (apply-key key this-element)))))

(defmacro if-not-list-delete ()
  '(list-delete
    (not (funcall predicate (apply-key key (car current))))))

(defmacro if-not-list-delete-from-end ()
  '(list-delete-from-end
    (not (funcall predicate (apply-key key (car current))))))

(defun delete-if-not (predicate sequence &key from-end (start 0) end key count)
  (let* ((length (length sequence))
	 (end (or end length))
	 (count (real-count count)))
    (seq-dispatch sequence
		  (if from-end
		      (if-not-list-delete-from-end)
		      (if-not-list-delete))
		  (if from-end
		      (if-not-mumble-delete-from-end)
		      (if-not-mumble-delete)))))


;;; REMOVE (from CMUCL)

;;; MUMBLE-REMOVE-MACRO does not include (removes) each element that
;;; satisfies the predicate.
(defmacro mumble-remove-macro (bump left begin finish right pred)
  `(do ((index ,begin (,bump index))
        (result
         (do ((index ,left (,bump index))
              (result (make-sequence-like sequence length)))
           ((= index (the fixnum ,begin)) result)
           (setf (aref result index) (aref sequence index))))
        (new-index ,begin)
        (number-zapped 0)
        (this-element))
     ((or (= index (the fixnum ,finish)) (= number-zapped (the fixnum count)))
      (do ((index index (,bump index))
           (new-index new-index (,bump new-index)))
        ((= index (the fixnum ,right)) (shrink-vector result new-index))
        (setf (aref result new-index) (aref sequence index))))
     (setq this-element (aref sequence index))
     (cond (,pred (setq number-zapped (1+ number-zapped)))
           (t (setf (aref result new-index) this-element)
              (setq new-index (,bump new-index))))))

(defmacro mumble-remove (pred)
  `(mumble-remove-macro 1+ 0 start end length ,pred))

(defmacro mumble-remove-from-end (pred)
  `(let ((sequence (copy-seq sequence)))
     (mumble-delete-from-end ,pred)))

(defmacro normal-mumble-remove ()
  `(mumble-remove
    (if test-not
        (not (funcall test-not item (apply-key key this-element)))
        (funcall test item (apply-key key this-element)))))

(defmacro normal-mumble-remove-from-end ()
  `(mumble-remove-from-end
    (if test-not
        (not (funcall test-not item (apply-key key this-element)))
        (funcall test item (apply-key key this-element)))))

(defmacro if-mumble-remove ()
  `(mumble-remove (funcall predicate (apply-key key this-element))))

(defmacro if-mumble-remove-from-end ()
  `(mumble-remove-from-end (funcall predicate (apply-key key this-element))))

(defmacro if-not-mumble-remove ()
  `(mumble-remove (not (funcall predicate (apply-key key this-element)))))

(defmacro if-not-mumble-remove-from-end ()
  `(mumble-remove-from-end
    (not (funcall predicate (apply-key key this-element)))))

;;; LIST-REMOVE-MACRO does not include (removes) each element that satisfies
;;; the predicate.
(defmacro list-remove-macro (pred reverse-p)
  `(let* ((sequence ,(if reverse-p
                         '(reverse (the list sequence))
                         'sequence))
          (%start ,(if reverse-p '(- length end) 'start))
          (%end ,(if reverse-p '(- length start) 'end))
          (splice (list nil))
          (results (do ((index 0 (1+ index))
                        (before-start splice))
                     ((= index (the fixnum %start)) before-start)
                     (setq splice
                           (cdr (rplacd splice (list (pop sequence))))))))
     (do ((index %start (1+ index))
          (this-element)
          (number-zapped 0))
       ((or (= index (the fixnum %end)) (= number-zapped (the fixnum count)))
        (do ((index index (1+ index)))
          ((null sequence)
           ,(if reverse-p
                '(nreverse (the list (cdr results)))
                '(cdr results)))
          (setq splice (cdr (rplacd splice (list (pop sequence)))))))
       (setq this-element (pop sequence))
       (if ,pred
           (setq number-zapped (1+ number-zapped))
           (setq splice (cdr (rplacd splice (list this-element))))))))


(defmacro list-remove (pred)
  `(list-remove-macro ,pred nil))

(defmacro list-remove-from-end (pred)
  `(list-remove-macro ,pred t))

(defmacro normal-list-remove ()
  `(list-remove
    (if test-not
        (not (funcall test-not item (apply-key key this-element)))
        (funcall test item (apply-key key this-element)))))

(defmacro normal-list-remove-from-end ()
  `(list-remove-from-end
    (if test-not
        (not (funcall test-not item (apply-key key this-element)))
        (funcall test item (apply-key key this-element)))))

(defmacro if-list-remove ()
  `(list-remove
    (funcall predicate (apply-key key this-element))))

(defmacro if-list-remove-from-end ()
  `(list-remove-from-end
    (funcall predicate (apply-key key this-element))))

(defmacro if-not-list-remove ()
  `(list-remove
    (not (funcall predicate (apply-key key this-element)))))

(defmacro if-not-list-remove-from-end ()
  `(list-remove-from-end
    (not (funcall predicate (apply-key key this-element)))))

(defun remove (item sequence &key from-end (test #'eql) test-not (start 0)
                    end count key)
  (let* ((length (length sequence))
	 (end (or end length))
	 (count (real-count count)))
    (seq-dispatch sequence
		  (if from-end
		      (normal-list-remove-from-end)
		      (normal-list-remove))
		  (if from-end
		      (normal-mumble-remove-from-end)
		      (normal-mumble-remove)))))

(defun remove-if (predicate sequence &key from-end (start 0) end count key)
  (let* ((length (length sequence))
	 (end (or end length))
	 (count (real-count count)))
    (seq-dispatch sequence
		  (if from-end
		      (if-list-remove-from-end)
		      (if-list-remove))
		  (if from-end
		      (if-mumble-remove-from-end)
		      (if-mumble-remove)))))

(defun remove-if-not (predicate sequence &key from-end (start 0) end count key)
  (let* ((length (length sequence))
	 (end (or end length))
	 (count (real-count count)))
    (seq-dispatch sequence
		  (if from-end
		      (if-not-list-remove-from-end)
		      (if-not-list-remove))
		  (if from-end
		      (if-not-mumble-remove-from-end)
		      (if-not-mumble-remove)))))


;;; REMOVE-DUPLICATES (from CMUCL)

(defun list-remove-duplicates* (list test test-not start end key from-end)
  (let* ((result (list ())) ; Put a marker on the beginning to splice with.
	 (splice result)
	 (current list))
    (do ((index 0 (1+ index)))
      ((= index start))
      (setq splice (cdr (rplacd splice (list (car current)))))
      (setq current (cdr current)))
    (do ((index 0 (1+ index)))
      ((or (and end (= index (the fixnum end)))
           (atom current)))
      (if (or (and from-end
		   (not (member (apply-key key (car current))
				(nthcdr (1+ start) result)
				:test test
				:test-not test-not
				:key key)))
	      (and (not from-end)
		   (not (do ((it (apply-key key (car current)))
			     (l (cdr current) (cdr l))
			     (i (1+ index) (1+ i)))
                          ((or (atom l) (and end (= i (the fixnum end))))
                           ())
			  (if (if test-not
				  (not (funcall test-not it (apply-key key (car l))))
				  (funcall test it (apply-key key (car l))))
			      (return t))))))
	  (setq splice (cdr (rplacd splice (list (car current))))))
      (setq current (cdr current)))
    (do ()
      ((atom current))
      (setq splice (cdr (rplacd splice (list (car current)))))
      (setq current (cdr current)))
    (cdr result)))


(defun vector-remove-duplicates* (vector test test-not start end key from-end
					 &optional (length (length vector)))
  (when (null end) (setf end (length vector)))
  (let ((result (make-sequence-like vector length))
	(index 0)
	(jndex start))
    (do ()
      ((= index start))
      (setf (aref result index) (aref vector index))
      (setq index (1+ index)))
    (do ((elt))
      ((= index end))
      (setq elt (aref vector index))
      (unless (or (and from-end
                       (position (apply-key key elt) result :start start
                                 :end jndex :test test :test-not test-not :key key))
		  (and (not from-end)
                       (position (apply-key key elt) vector :start (1+ index)
                                 :end end :test test :test-not test-not :key key)))
	(setf (aref result jndex) elt)
	(setq jndex (1+ jndex)))
      (setq index (1+ index)))
    (do ()
      ((= index length))
      (setf (aref result jndex) (aref vector index))
      (setq index (1+ index))
      (setq jndex (1+ jndex)))
    (shrink-vector result jndex)))


(defun remove-duplicates (sequence &key (test #'eql) test-not (start 0) from-end
				   end key)
  (seq-dispatch sequence
		(if sequence
		    (list-remove-duplicates* sequence test test-not
                                             start end key from-end))
		(vector-remove-duplicates* sequence test test-not
                                           start end key from-end)))


(defun list-delete-duplicates* (list test test-not key from-end start end)
  (let ((handle (cons nil list)))
    (do ((current (nthcdr start list) (cdr current))
	 (previous (nthcdr start handle))
	 (index start (1+ index)))
      ((or (and end (= index (the fixnum end))) (null current))
       (cdr handle))
      (if (do ((x (if from-end
		      (nthcdr (1+ start) handle)
		      (cdr current))
		  (cdr x))
	       (i (1+ index) (1+ i)))
            ((or (null x)
                 (and (not from-end) end (= i (the fixnum end)))
                 (eq x current))
             nil)
	    (if (if test-not
		    (not (funcall test-not
				  (apply-key key (car current))
				  (apply-key key (car x))))
		    (funcall test
			     (apply-key key (car current))
			     (apply-key key (car x))))
		(return t)))
	  (rplacd previous (cdr current))
	  (setq previous (cdr previous))))))


(defun vector-delete-duplicates* (vector test test-not key from-end start end
					 &optional (length (length vector)))
  (when (null end) (setf end (length vector)))
  (do ((index start (1+ index))
       (jndex start))
    ((= index end)
     (do ((index index (1+ index))		; copy the rest of the vector
          (jndex jndex (1+ jndex)))
       ((= index length)
        (shrink-vector vector jndex)
        vector)
       (setf (aref vector jndex) (aref vector index))))
    (setf (aref vector jndex) (aref vector index))
    (unless (position (apply-key key (aref vector index)) vector :key key
		      :start (if from-end start (1+ index)) :test test
		      :end (if from-end jndex end) :test-not test-not)
      (setq jndex (1+ jndex)))))


(defun delete-duplicates (sequence &key (test #'eql) test-not (start 0) from-end
                                   end key)
  (seq-dispatch sequence
                (if sequence
                    (list-delete-duplicates* sequence test test-not key from-end start end))
                (vector-delete-duplicates* sequence test test-not key from-end start end)))


(defun list-substitute* (pred new list start end count key test test-not old)
  (let* ((result (list nil))
	 elt
	 (splice result)
	 (list list))           ; Get a local list for a stepper.
    (do ((index 0 (1+ index)))
      ((= index start))
      (setq splice (cdr (rplacd splice (list (car list)))))
      (setq list (cdr list)))
    (do ((index start (1+ index)))
      ((or (= index end) (null list) (= count 0)))
      (setq elt (car list))
      (setq splice
	    (cdr (rplacd splice
			 (list
			  (cond
			   ((case pred
                              (normal
                               (if test-not
                                   (not
                                    (funcall test-not old (apply-key key elt)))
                                   (funcall test old (apply-key key elt))))
                              (if (funcall test (apply-key key elt)))
                              (if-not (not (funcall test (apply-key key elt)))))
			    (setq count (1- count))
			    new)
                           (t elt))))))
      (setq list (cdr list)))
    (do ()
      ((null list))
      (setq splice (cdr (rplacd splice (list (car list)))))
      (setq list (cdr list)))
    (cdr result)))


;;; Replace old with new in sequence moving from left to right by incrementer
;;; on each pass through the loop. Called by all three substitute functions.
(defun vector-substitute* (pred new sequence incrementer left right length
                                start end count key test test-not old)
  (let ((result (make-sequence-like sequence length))
	(index left))
    (do ()
      ((= index start))
      (setf (aref result index) (aref sequence index))
      (setq index (+ index incrementer)))
    (do ((elt))
      ((or (= index end) (= count 0)))
      (setq elt (aref sequence index))
      (setf (aref result index)
	    (cond ((case pred
                     (normal
                      (if test-not
                          (not (funcall test-not old (apply-key key elt)))
                          (funcall test old (apply-key key elt))))
                     (if (funcall test (apply-key key elt)))
                     (if-not (not (funcall test (apply-key key elt)))))
		   (setq count (1- count))
		   new)
		  (t elt)))
      (setq index (+ index incrementer)))
    (do ()
      ((= index right))
      (setf (aref result index) (aref sequence index))
      (setq index (+ index incrementer)))
    result))

(defmacro subst-dispatch (pred)
  `(if (listp sequence)
       (if from-end
           (nreverse (list-substitute* ,pred new (reverse sequence)
                                       (- (the fixnum length) (the fixnum end))
                                       (- (the fixnum length) (the fixnum start))
                                       count key test test-not old))
           (list-substitute* ,pred new sequence start end count key test test-not
                             old))
       (if from-end
           (vector-substitute* ,pred new sequence -1 (1- (the fixnum length))
                               -1 length (1- (the fixnum end))
                               (1- (the fixnum start)) count key test test-not old)
           (vector-substitute* ,pred new sequence 1 0 length length
                               start end count key test test-not old))))


;;; SUBSTITUTE (from CMUCL)

(defun substitute (new old sequence &key from-end (test #'eql) test-not
                       (start 0) count end key)
  (let* ((length (length sequence))
	 (end (or end length))
	 (count (real-count count)))
    (subst-dispatch 'normal)))


;;; SUBSTITUTE-IF (from CMUCL)

(defun substitute-if (new test sequence &key from-end (start 0) end count key)
  (let* ((length (length sequence))
	 (end (or end length))
	 (count (real-count count))
	 test-not
	 old)
    (subst-dispatch 'if)))


;;; SUBSTITUTE-IF-NOT (from CMUCL)

(defun substitute-if-not (new test sequence &key from-end (start 0)
                              end count key)
  (let* ((length (length sequence))
	 (end (or end length))
	 (count (real-count count))
	 test-not
	 old)
    (subst-dispatch 'if-not)))


;;; NSUBSTITUTE (from CMUCL)

(defun nsubstitute (new old sequence &key from-end (test #'eql) test-not
                        end count key (start 0))
  (let ((end (or end (length sequence)))
	(count (real-count count)))
    (if (listp sequence)
	(if from-end
	    (let ((length (length sequence)))
	      (nreverse (nlist-substitute*
			 new old (nreverse (the list sequence))
			 test test-not (- length end) (- length start) count key)))
	    (nlist-substitute* new old sequence
			       test test-not start end count key))
	(if from-end
	    (nvector-substitute* new old sequence -1
				 test test-not (1- end) (1- start) count key)
	    (nvector-substitute* new old sequence 1
				 test test-not start end count key)))))

(defun nlist-substitute* (new old sequence test test-not start end count key)
  (do ((list (nthcdr start sequence) (cdr list))
       (index start (1+ index)))
    ((or (= index end) (null list) (= count 0)) sequence)
    (when (if test-not
	      (not (funcall test-not old (apply-key key (car list))))
	      (funcall test old (apply-key key (car list))))
      (rplaca list new)
      (setq count (1- count)))))

(defun nvector-substitute* (new old sequence incrementer
                                test test-not start end count key)
  (do ((index start (+ index incrementer)))
    ((or (= index end) (= count 0)) sequence)
    (when (if test-not
	      (not (funcall test-not old (apply-key key (aref sequence index))))
	      (funcall test old (apply-key key (aref sequence index))))
      (setf (aref sequence index) new)
      (setq count (1- count)))))


;;; NSUBSTITUTE-IF (from CMUCL)

(defun nsubstitute-if (new test sequence &key from-end (start 0) end count key)
  (let ((end (or end (length sequence)))
	(count (real-count count)))
    (if (listp sequence)
	(if from-end
	    (let ((length (length sequence)))
	      (nreverse (nlist-substitute-if*
			 new test (nreverse (the list sequence))
			 (- length end) (- length start) count key)))
	    (nlist-substitute-if* new test sequence
				  start end count key))
	(if from-end
	    (nvector-substitute-if* new test sequence -1
				    (1- end) (1- start) count key)
	    (nvector-substitute-if* new test sequence 1
				    start end count key)))))

(defun nlist-substitute-if* (new test sequence start end count key)
  (do ((list (nthcdr start sequence) (cdr list))
       (index start (1+ index)))
    ((or (= index end) (null list) (= count 0)) sequence)
    (when (funcall test (apply-key key (car list)))
      (rplaca list new)
      (setq count (1- count)))))

(defun nvector-substitute-if* (new test sequence incrementer
                                   start end count key)
  (do ((index start (+ index incrementer)))
    ((or (= index end) (= count 0)) sequence)
    (when (funcall test (apply-key key (aref sequence index)))
      (setf (aref sequence index) new)
      (setq count (1- count)))))


;;; NSUBSTITUTE-IF-NOT (from CMUCL)

(defun nsubstitute-if-not (new test sequence &key from-end (start 0)
			       end count key)
  (let ((end (or end (length sequence)))
	(count (real-count count)))
    (if (listp sequence)
	(if from-end
	    (let ((length (length sequence)))
	      (nreverse (nlist-substitute-if-not*
			 new test (nreverse (the list sequence))
			 (- length end) (- length start) count key)))
	    (nlist-substitute-if-not* new test sequence
				      start end count key))
	(if from-end
	    (nvector-substitute-if-not* new test sequence -1
					(1- end) (1- start) count key)
	    (nvector-substitute-if-not* new test sequence 1
					start end count key)))))

(defun nlist-substitute-if-not* (new test sequence start end count key)
  (do ((list (nthcdr start sequence) (cdr list))
       (index start (1+ index)))
    ((or (= index end) (null list) (= count 0)) sequence)
    (when (not (funcall test (apply-key key (car list))))
      (rplaca list new)
      (setq count (1- count)))))

(defun nvector-substitute-if-not* (new test sequence incrementer
                                       start end count key)
  (do ((index start (+ index incrementer)))
    ((or (= index end) (= count 0)) sequence)
    (when (not (funcall test (apply-key key (aref sequence index))))
      (setf (aref sequence index) new)
      (setq count (1- count)))))


(defmacro vector-locater-macro (sequence body-form return-type)
  `(let ((incrementer (if from-end -1 1))
	 (start (if from-end (1- (the fixnum end)) start))
	 (end (if from-end (1- (the fixnum start)) end)))
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
         ((= index (the fixnum %end)) count)
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
         ((or (= index (the fixnum %end)) (null sequence)) count)
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
      (seq-dispatch sequence
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


;; SEARCH (from CMUCL)

(defmacro compare-elements (elt1 elt2)
  `(if test-not
       (if (funcall test-not (apply-key key ,elt1) (apply-key key ,elt2))
           (return nil)
           t)
       (if (not (funcall test (apply-key key ,elt1) (apply-key key ,elt2)))
           (return nil)
           t)))


(defmacro search-compare-list-list (main sub)
  `(do ((main ,main (cdr main))
        (jndex start1 (1+ jndex))
        (sub (nthcdr start1 ,sub) (cdr sub)))
     ((or (null main) (null sub) (= (the fixnum end1) jndex))
      t)
     (compare-elements (car main) (car sub))))


(defmacro search-compare-list-vector (main sub)
  `(do ((main ,main (cdr main))
        (index start1 (1+ index)))
     ((or (null main) (= index (the fixnum end1))) t)
     (compare-elements (car main) (aref ,sub index))))


(defmacro search-compare-vector-list (main sub index)
  `(do ((sub (nthcdr start1 ,sub) (cdr sub))
        (jndex start1 (1+ jndex))
        (index ,index (1+ index)))
     ((or (= (the fixnum end1) jndex) (null sub)) t)
     (compare-elements (aref ,main index) (car sub))))


(defmacro search-compare-vector-vector (main sub index)
  `(do ((index ,index (1+ index))
        (sub-index start1 (1+ sub-index)))
     ((= sub-index (the fixnum end1)) t)
     (compare-elements (aref ,main index) (aref ,sub sub-index))))


(defmacro search-compare (main-type main sub index)
  (if (eq main-type 'list)
      `(seq-dispatch ,sub
                     (search-compare-list-list ,main ,sub)
                     (search-compare-list-vector ,main ,sub))
      `(seq-dispatch ,sub
                     (search-compare-vector-list ,main ,sub ,index)
                     (search-compare-vector-vector ,main ,sub ,index))))


(defmacro list-search (main sub)
  `(do ((main (nthcdr start2 ,main) (cdr main))
        (index2 start2 (1+ index2))
        (terminus (- (the fixnum end2)
                     (the fixnum (- (the fixnum end1)
                                    (the fixnum start1)))))
        (last-match ()))
     ((> index2 terminus) last-match)
     (if (search-compare list main ,sub index2)
         (if from-end
             (setq last-match index2)
             (return index2)))))


(defmacro vector-search (main sub)
  `(do ((index2 start2 (1+ index2))
        (terminus (- (the fixnum end2)
                     (the fixnum (- (the fixnum end1)
                                    (the fixnum start1)))))
        (last-match ()))
     ((> index2 terminus) last-match)
     (if (search-compare vector ,main ,sub index2)
         (if from-end
             (setq last-match index2)
             (return index2)))))


(defun search (sequence1 sequence2 &key from-end (test #'eql) test-not
                         (start1 0) end1 (start2 0) end2 key)
  (let ((end1 (or end1 (length sequence1)))
	(end2 (or end2 (length sequence2))))
    (seq-dispatch sequence2
		  (list-search sequence2 sequence1)
		  (vector-search sequence2 sequence1))))

;;; pprint.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: pprint.lisp,v 1.41 2004-10-05 13:20:12 piso Exp $
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

;;; Adapted from the November, 26 1991 version of Richard C. Waters' XP pretty
;;; printer.

;------------------------------------------------------------------------

;Copyright Massachusetts Institute of Technology, Cambridge, Massachusetts.

;Permission to use, copy, modify, and distribute this software and its
;documentation for any purpose and without fee is hereby granted,
;provided that this copyright and permission notice appear in all
;copies and supporting documentation, and that the name of M.I.T. not
;be used in advertising or publicity pertaining to distribution of the
;software without specific, written prior permission. M.I.T. makes no
;representations about the suitability of this software for any
;purpose.  It is provided "as is" without express or implied warranty.

;    M.I.T. DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE, INCLUDING
;    ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS, IN NO EVENT SHALL
;    M.I.T. BE LIABLE FOR ANY SPECIAL, INDIRECT OR CONSEQUENTIAL DAMAGES OR
;    ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
;    WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION,
;    ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS
;    SOFTWARE.

;------------------------------------------------------------------------

#+armedbear
(in-package "XP")

;must do the following in common lisps not supporting *print-shared*

(defvar *print-shared* nil)
(export '(*print-shared*))

(defvar *default-right-margin* 70.
  "controls default line length; must be a non-negative integer")
(defvar *last-abbreviated-printing*
	#'(lambda (&optional stream) (declare (ignore stream)) nil)
  "funcalling this redoes the last xp printing that was abbreviated.")

(defvar *current-level* 0
  "current depth in logical blocks.")
(defvar *current-length* 0
  "current position in logical block.")
(defvar *abbreviation-happened* nil
  "t if current thing being printed has been abbreviated.")
(defvar *result* nil "used to pass back a value")

;default (bad) definitions for the non-portable functions

#-(or :symbolics :lucid :franz-inc :cmu)(eval-when (eval load compile)
(defun structure-type-p (x) (and (symbolp x) (get x 'structure-printer)))
(defun output-width     (&optional (s *standard-output*)) (declare (ignore s)) nil)
(defun output-position  (&optional (s *standard-output*)) (declare (ignore s)) nil) )

(defvar *locating-circularities* nil
  "Integer if making a first pass over things to identify circularities.
   Integer used as counter for #n= syntax.")
(defvar *parents* nil "used when *print-shared* is nil")

(defvar *circularity-hash-table* nil
  "Contains hash table used for locating circularities, or a stack.")
;When an entry is first made it is zero.
;If a duplicate is found, a positive integer tag is assigned.
;After the first time the object is printed out, the tag is negated.

;               ---- XP STRUCTURES, AND THE INTERNAL ALGORITHM ----

(eval-when (eval load compile) ;not used at run time.
  (defvar block-stack-entry-size 1)
  (defvar prefix-stack-entry-size 5)
  (defvar queue-entry-size 7)
  (defvar buffer-entry-size 1)
  (defvar prefix-entry-size 1)
  (defvar suffix-entry-size 1))

(eval-when (eval load compile) ;used at run time
  (defvar block-stack-min-size #.(* 35. block-stack-entry-size))
  (defvar prefix-stack-min-size #.(* 30. prefix-stack-entry-size))
  (defvar queue-min-size #.(* 75. queue-entry-size))
  (defvar buffer-min-size 256.)
  (defvar prefix-min-size 256.)
  (defvar suffix-min-size 256.)
  )

(defstruct (xp-structure (:conc-name nil) #+nil (:print-function describe-xp))
  (base-stream nil) ;;The stream io eventually goes to.
  line-length ;;The line length to use for formatting.
  line-limit ;;If non-NIL the max number of lines to print.
  line-no ;;number of next line to be printed.
  depth-in-blocks
  ;;Number of logical blocks at QRIGHT that are started but not ended.
  (block-stack (make-array #.block-stack-min-size)) block-stack-ptr
  ;;This stack is pushed and popped in accordance with the way blocks are
  ;;nested at the moment they are entered into the queue.  It contains the
  ;;following block specific value.
  ;;SECTION-START total position where the section (see AIM-1102)
  ;;that is rightmost in the queue started.
  (buffer (make-array #.buffer-min-size :element-type 'character))
  charpos buffer-ptr buffer-offset
  ;;This is a vector of characters (eg a string) that builds up the
  ;;line images that will be printed out.  BUFFER-PTR is the
  ;;buffer position where the next character should be inserted in
  ;;the string.  CHARPOS is the output character position of the
  ;;first character in the buffer (non-zero only if a partial line
  ;;has been output).  BUFFER-OFFSET is used in computing total lengths.
  ;;It is changed to reflect all shifting and insertion of prefixes so that
  ;;total length computes things as they would be if they were
  ;;all on one line.  Positions are kept three different ways
  ;; Buffer position (eg BUFFER-PTR)
  ;; Line position (eg (+ BUFFER-PTR CHARPOS)).  Indentations are stored in this form.
  ;; Total position if all on one line (eg (+ BUFFER-PTR BUFFER-OFFSET))
  ;;  Positions are stored in this form.
  (queue (make-array #.queue-min-size))
  qleft
  qright
  ;;This holds a queue of action descriptors.  QLEFT and QRIGHT
  ;;point to the next entry to dequeue and the last entry enqueued
  ;;respectively.  The queue is empty when
  ;;(> QLEFT QRIGHT).  The queue entries have several parts:
  ;;QTYPE one of :NEWLINE/:IND/:START-BLOCK/:END-BLOCK
  ;;QKIND :LINEAR/:MISER/:FILL/:MANDATORY or :UNCONDITIONAL/:FRESH
  ;; or :BLOCK/:CURRENT
  ;;QPOS total position corresponding to this entry
  ;;QDEPTH depth in blocks of this entry.
  ;;QEND offset to entry marking end of section this entry starts. (NIL until known.)
  ;; Only :start-block and non-literal :newline entries can start sections.
  ;;QOFFSET offset to :END-BLOCK for :START-BLOCK (NIL until known).
  ;;QARG for :IND indentation delta
  ;;     for :START-BLOCK suffix in the block if any.
  ;;                      or if per-line-prefix then cons of suffix and
  ;;                      per-line-prefix.
  ;;     for :END-BLOCK suffix for the block if any.
  (prefix (make-array #.buffer-min-size :element-type 'character))
  ;;this stores the prefix that should be used at the start of the line
  (prefix-stack (make-array #.prefix-stack-min-size))
  prefix-stack-ptr
  ;;This stack is pushed and popped in accordance with the way blocks
  ;;are nested at the moment things are taken off the queue and printed.
  ;;It contains the following block specific values.
  ;;PREFIX-PTR current length of PREFIX.
  ;;SUFFIX-PTR current length of pending suffix
  ;;NON-BLANK-PREFIX-PTR current length of non-blank prefix.
  ;;INITIAL-PREFIX-PTR prefix-ptr at the start of this block.
  ;;SECTION-START-LINE line-no value at last non-literal break at this level.
  (suffix (make-array #.buffer-min-size :element-type 'character))
  ;;this stores the suffixes that have to be printed to close of the current
  ;;open blocks.  For convenient in popping, the whole suffix
  ;;is stored in reverse order.
)

(defmacro LP<-BP (xp &optional (ptr nil))
  (if (null ptr) (setq ptr `(buffer-ptr ,xp)))
  `(+ ,ptr (charpos ,xp)))
(defmacro TP<-BP (xp)
  `(+ (buffer-ptr ,xp) (buffer-offset ,xp)))
(defmacro BP<-LP (xp ptr)
  `(- ,ptr (charpos ,xp)))
(defmacro BP<-TP (xp ptr)
  `(- ,ptr (buffer-offset ,xp)))
;This does not tell you the line position you were at when the TP
;was set, unless there have been no newlines or indentation output
;between ptr and the current output point.
(defmacro LP<-TP (xp ptr)
  `(LP<-BP ,xp (BP<-TP ,xp ,ptr)))

;We don't use adjustable vectors or any of that, because we seldom have
;to actually extend and non-adjustable vectors are a lot faster in
;many Common Lisps.

(defmacro check-size (xp vect ptr)
  (let* ((min-size
	   (symbol-value
	     (intern (concatenate 'string (string vect) "-MIN-SIZE")
		     (find-package "XP"))))
	 (entry-size
	   (symbol-value
	     (intern (concatenate 'string (string vect) "-ENTRY-SIZE")
		     (find-package "XP")))))
    `(when (and (> ,ptr ,(- min-size entry-size)) ;seldom happens
		(> ,ptr (- (length (,vect ,xp)) ,entry-size)))
       (let* ((old (,vect ,xp))
	      (new (make-array (+ ,ptr ,(if (= entry-size 1) 50
					    (* 10 entry-size)))
			       :element-type (array-element-type old))))
	 (replace new old)
	 (setf (,vect ,xp) new)))))

(defmacro section-start (xp) `(aref (block-stack ,xp) (block-stack-ptr ,xp)))

(defun push-block-stack (xp)
  (incf (block-stack-ptr xp) #.block-stack-entry-size)
  (check-size xp block-stack (block-stack-ptr xp)))

(defun pop-block-stack (xp)
  (decf (block-stack-ptr xp) #.block-stack-entry-size))

(defmacro prefix-ptr (xp)
  `(aref (prefix-stack ,xp) (prefix-stack-ptr ,xp)))
(defmacro suffix-ptr (xp)
  `(aref (prefix-stack ,xp) (+ (prefix-stack-ptr ,xp) 1)))
(defmacro non-blank-prefix-ptr (xp)
  `(aref (prefix-stack ,xp) (+ (prefix-stack-ptr ,xp) 2)))
(defmacro initial-prefix-ptr (xp)
  `(aref (prefix-stack ,xp) (+ (prefix-stack-ptr ,xp) 3)))
(defmacro section-start-line (xp)
  `(aref (prefix-stack ,xp) (+ (prefix-stack-ptr ,xp) 4)))

(defun push-prefix-stack (xp)
  (let ((old-prefix 0)
        (old-suffix 0)
        (old-non-blank 0))
    (when (not (minusp (prefix-stack-ptr xp)))
      (setq old-prefix (prefix-ptr xp)
	    old-suffix (suffix-ptr xp)
	    old-non-blank (non-blank-prefix-ptr xp)))
    (incf (prefix-stack-ptr xp) #.prefix-stack-entry-size)
    (check-size xp prefix-stack (prefix-stack-ptr xp))
    (setf (prefix-ptr xp) old-prefix)
    (setf (suffix-ptr xp) old-suffix)
    (setf (non-blank-prefix-ptr xp) old-non-blank)))

(defun pop-prefix-stack (xp)
  (decf (prefix-stack-ptr xp) #.prefix-stack-entry-size))

(defmacro Qtype   (xp index) `(aref (queue ,xp) ,index))
(defmacro Qkind   (xp index) `(aref (queue ,xp) (1+ ,index)))
(defmacro Qpos    (xp index) `(aref (queue ,xp) (+ ,index 2)))
(defmacro Qdepth  (xp index) `(aref (queue ,xp) (+ ,index 3)))
(defmacro Qend    (xp index) `(aref (queue ,xp) (+ ,index 4)))
(defmacro Qoffset (xp index) `(aref (queue ,xp) (+ ,index 5)))
(defmacro Qarg    (xp index) `(aref (queue ,xp) (+ ,index 6)))

;we shift the queue over rather than using a circular queue because
;that works out to be a lot faster in practice.  Note, short printout
;does not ever cause a shift, and even in long printout, the queue is
;shifted left for free every time it happens to empty out.

(defun enqueue (xp type kind &optional arg)
  (incf (Qright xp) #.queue-entry-size)
  (when (> (Qright xp) #.(- queue-min-size queue-entry-size))
    (replace (queue xp) (queue xp) :start2 (Qleft xp) :end2 (Qright xp))
    (setf (Qright xp) (- (Qright xp) (Qleft xp)))
    (setf (Qleft xp) 0))
  (check-size xp queue (Qright xp))
  (setf (Qtype xp (Qright xp)) type)
  (setf (Qkind xp (Qright xp)) kind)
  (setf (Qpos xp (Qright xp)) (TP<-BP xp))
  (setf (Qdepth xp (Qright xp)) (depth-in-blocks xp))
  (setf (Qend xp (Qright xp)) nil)
  (setf (Qoffset xp (Qright xp)) nil)
  (setf (Qarg xp (Qright xp)) arg))

(defmacro Qnext (index) `(+ ,index #.queue-entry-size))

;This is called to initialize things when you start pretty printing.

(defun initialize-xp (xp stream)
  (setf (base-stream xp) stream)
  (setf (line-length xp) (max 0 (cond (*print-right-margin*)
                                      ((output-width stream))
                                      (t *default-right-margin*))))
  (setf (line-limit xp) *print-lines*)
  (setf (line-no xp) 1)
  (setf (depth-in-blocks xp) 0)
  (setf (block-stack-ptr xp) 0)
  (setf (charpos xp) (cond ((output-position stream)) (T 0)))
  (setf (section-start xp) 0)
  (setf (buffer-ptr xp) 0)
  (setf (buffer-offset xp) (charpos xp))
  (setf (Qleft xp) 0)
  (setf (Qright xp) #.(- queue-entry-size))
  (setf (prefix-stack-ptr xp) #.(- prefix-stack-entry-size))
  xp)

;This handles the basic outputting of characters.  note + suffix means that
;the stream is known to be an XP stream, all inputs are mandatory, and no
;error checking has to be done.  Suffix ++ additionally means that the
;output is guaranteed not to contain a newline char.

(defun write-char+ (char xp)
  (if (eql char #\newline) (pprint-newline+ :unconditional xp)
      (write-char++ char xp)))

(defun write-string+ (string xp start end)
  (let ((sub-end nil) next-newline)
    (loop (setq next-newline
		(position #\newline string :test #'char= :start start :end end))
	  (setq sub-end (if next-newline next-newline end))
	  (write-string++ string xp start sub-end)
	  (when (null next-newline) (return nil))
	  (pprint-newline+ :unconditional xp)
	  (setq start (1+ sub-end)))))

;note this checks (> BUFFER-PTR LINE-LENGTH) instead of (> (LP<-BP) LINE-LENGTH)
;this is important so that when things are longer than a line they
;end up getting printed in chunks of size LINE-LENGTH.

(defun write-char++ (char xp)
  (when (> (buffer-ptr xp) (line-length xp))
    (force-some-output xp))
  (let ((new-buffer-end (1+ (buffer-ptr xp))))
    (check-size xp buffer new-buffer-end)
    (setf (char (buffer xp) (buffer-ptr xp)) char)
    (setf (buffer-ptr xp) new-buffer-end)))

(defun force-some-output (xp)
  (attempt-to-output xp nil nil)
  (when (> (buffer-ptr xp) (line-length xp)) ;only if printing off end of line
    (attempt-to-output xp T T)))

(defun write-string++ (string xp start end)
  (when (> (buffer-ptr xp) (line-length xp))
    (force-some-output xp))
  (write-string+++ string xp start end))

;never forces output; therefore safe to call from within output-line.

(defun write-string+++ (string xp start end)
  (let ((new-buffer-end (+ (buffer-ptr xp) (- end start))))
    (check-size xp buffer new-buffer-end)
    (do ((buffer (buffer xp))
	 (i (buffer-ptr xp) (1+ i))
	 (j start (1+ j)))
	((= j end))
      (let ((char (char string j)))
	(setf (char buffer i) char)))
    (setf (buffer-ptr xp) new-buffer-end)))

(defun pprint-tab+ (kind colnum colinc xp)
  (let ((indented? nil) (relative? nil))
    (case kind
      (:section (setq indented? T))
      (:line-relative (setq relative? T))
      (:section-relative (setq indented? T relative? T)))
    (let* ((current
	     (if (not indented?) (LP<-BP xp)
		 (- (TP<-BP xp) (section-start xp))))
	   (new
	     (if (zerop colinc)
		 (if relative? (+ current colnum) (max colnum current))
		 (cond (relative?
			(* colinc (floor (+ current colnum colinc -1) colinc)))
		       ((> colnum current) colnum)
		       (T (+ colnum
			     (* colinc
				(floor (+ current (- colnum) colinc) colinc)))))))
	   (length (- new current)))
      (when (plusp length)
	(let ((end (+ (buffer-ptr xp) length)))
	  (check-size xp buffer end)
	  (fill (buffer xp) #\space :start (buffer-ptr xp) :end end)
	  (setf (buffer-ptr xp) end))))))

;note following is smallest number >= x that is a multiple of colinc
;  (* colinc (floor (+ x (1- colinc)) colinc))

(defun pprint-newline+ (kind xp)
  (enqueue xp :newline kind)
  (do ((ptr (Qleft xp) (Qnext ptr)))    ;find sections we are ending
      ((not (< ptr (Qright xp))))	;all but last
    (when (and (null (Qend xp ptr))
	       (not (> (depth-in-blocks xp) (Qdepth xp ptr)))
	       (member (Qtype xp ptr) '(:newline :start-block)))
      (setf (Qend xp ptr) (- (Qright xp) ptr))))
  (setf (section-start xp) (TP<-BP xp))
  (when (member kind '(:fresh :unconditional :mandatory))
    (attempt-to-output xp T nil)))

(defun start-block (xp prefix-string on-each-line? suffix-string)
  (when prefix-string (write-string++ prefix-string xp 0 (length prefix-string)))
  (push-block-stack xp)
  (enqueue xp :start-block nil
	   (if on-each-line? (cons suffix-string prefix-string) suffix-string))
  (incf (depth-in-blocks xp))	      ;must be after enqueue
  (setf (section-start xp) (TP<-BP xp)))

(defun end-block (xp suffix)
  (unless (eq *abbreviation-happened* '*print-lines*)
    (when suffix (write-string+ suffix xp 0 (length suffix)))
    (decf (depth-in-blocks xp))
    (enqueue xp :end-block nil suffix)
    (do ((ptr (Qleft xp) (Qnext ptr))) ;looking for start of block we are ending
	((not (< ptr (Qright xp))))    ;all but last
      (when (and (= (depth-in-blocks xp) (Qdepth xp ptr))
		 (eq (Qtype xp ptr) :start-block)
		 (null (Qoffset xp ptr)))
	(setf (Qoffset xp ptr) (- (Qright xp) ptr))
	(return nil)))	;can only be 1
    (pop-block-stack xp)))

(defun pprint-indent+ (kind n xp)
  (enqueue xp :ind kind n))

; The next function scans the queue looking for things it can do.
;it keeps outputting things until the queue is empty, or it finds
;a place where it cannot make a decision yet.

(defmacro maybe-too-large (xp Qentry)
  `(let ((limit (line-length ,xp)))
     (when (eql (line-limit ,xp) (line-no ,xp)) ;prevents suffix overflow
       (decf limit 2) ;3 for " .." minus 1 for space (heuristic)
       (when (not (minusp (prefix-stack-ptr ,xp)))
	 (decf limit (suffix-ptr ,xp))))
     (cond ((Qend ,xp ,Qentry)
	    (> (LP<-TP ,xp (Qpos ,xp (+ ,Qentry (Qend ,xp ,Qentry)))) limit))
	   ((or force-newlines? (> (LP<-BP ,xp) limit)) T)
	   (T (return nil)))))	;wait until later to decide.

(defmacro misering? (xp)
  `(and *print-miser-width*
	(<= (- (line-length ,xp) (initial-prefix-ptr ,xp)) *print-miser-width*)))

;If flush-out? is T and force-newlines? is NIL then the buffer,
;prefix-stack, and queue will be in an inconsistent state after the call.
;You better not call it this way except as the last act of outputting.

(defun attempt-to-output (xp force-newlines? flush-out?)
  (do () ((> (Qleft xp) (Qright xp))
	  (setf (Qleft xp) 0)
	  (setf (Qright xp) #.(- queue-entry-size))) ;saves shifting
    (case (Qtype xp (Qleft xp))
      (:ind
       (unless (misering? xp)
	 (set-indentation-prefix xp
	   (case (Qkind xp (Qleft xp))
	     (:block (+ (initial-prefix-ptr xp) (Qarg xp (Qleft xp))))
	     (T ; :current
	       (+ (LP<-TP xp (Qpos xp (Qleft xp)))
		  (Qarg xp (Qleft xp)))))))
       (setf (Qleft xp) (Qnext (Qleft xp))))
      (:start-block
       (cond ((maybe-too-large xp (Qleft xp))
	      (push-prefix-stack xp)
	      (setf (initial-prefix-ptr xp) (prefix-ptr xp))
	      (set-indentation-prefix xp (LP<-TP xp (Qpos xp (Qleft xp))))
	      (let ((arg (Qarg xp (Qleft xp))))
		(when (consp arg) (set-prefix xp (cdr arg)))
		(setf (initial-prefix-ptr xp) (prefix-ptr xp))
		(cond ((not (listp arg)) (set-suffix xp arg))
		      ((car arg) (set-suffix xp (car arg)))))
	      (setf (section-start-line xp) (line-no xp)))
	     (T (incf (Qleft xp) (Qoffset xp (Qleft xp)))))
       (setf (Qleft xp) (Qnext (Qleft xp))))
      (:end-block (pop-prefix-stack xp) (setf (Qleft xp) (Qnext (Qleft xp))))
      (T ; :newline
       (when (case (Qkind xp (Qleft xp))
	       (:fresh (not (zerop (LP<-BP xp))))
	       (:miser (misering? xp))
	       (:fill (or (misering? xp)
			  (> (line-no xp) (section-start-line xp))
			  (maybe-too-large xp (Qleft xp))))
	       (T T)) ;(:linear :unconditional :mandatory)
	 (output-line xp (Qleft xp))
	 (setup-for-next-line xp (Qleft xp)))
       (setf (Qleft xp) (Qnext (Qleft xp))))))
  (when flush-out? (flush xp)))

;this can only be called last!

(defun flush (xp)
  (unless *locating-circularities*
    (cl:write-string
       (buffer xp) (base-stream xp) :end (buffer-ptr xp)))
  (incf (buffer-offset xp) (buffer-ptr xp))
  (incf (charpos xp) (buffer-ptr xp))
  (setf (buffer-ptr xp) 0))

;This prints out a line of stuff.

(defun output-line (xp Qentry)
  (let* ((out-point (BP<-TP xp (Qpos xp Qentry)))
	 (last-non-blank (position #\space (buffer xp) :test-not #'char=
				   :from-end T :end out-point))
	 (end (cond ((member (Qkind xp Qentry) '(:fresh :unconditional)) out-point)
		    (last-non-blank (1+ last-non-blank))
		    (T 0)))
	 (line-limit-exit (and (line-limit xp)
                               (not *print-readably*)
                               (not (> (line-limit xp) (line-no xp))))))
    (when line-limit-exit
      (setf (buffer-ptr xp) end)          ;truncate pending output.
      (write-string+++ " .." xp 0 3)
      (reverse-string-in-place (suffix xp) 0 (suffix-ptr xp))
      (write-string+++ (suffix xp) xp 0 (suffix-ptr xp))
      (setf (Qleft xp) (Qnext (Qright xp)))
      (setq *abbreviation-happened* '*print-lines*)
      (throw 'line-limit-abbreviation-exit T))
    (incf (line-no xp))
    (unless *locating-circularities*
      (let ((stream (base-stream xp)))
	(sys::%write-string (buffer xp) stream 0 end)
	(sys::%terpri stream)))))

(defun setup-for-next-line (xp Qentry)
  (let* ((out-point (BP<-TP xp (Qpos xp Qentry)))
	 (prefix-end
	   (cond ((member (Qkind xp Qentry) '(:unconditional :fresh))
		  (non-blank-prefix-ptr xp))
		 (T (prefix-ptr xp))))
	 (change (- prefix-end out-point)))
    (setf (charpos xp) 0)
    (when (plusp change)                  ;almost never happens
      (check-size xp buffer (+ (buffer-ptr xp) change)))
    (replace (buffer xp) (buffer xp) :start1 prefix-end
	     :start2 out-point :end2 (buffer-ptr xp))
    (replace (buffer xp) (prefix xp) :end2 prefix-end)
    (incf (buffer-ptr xp) change)
    (decf (buffer-offset xp) change)
    (when (not (member (Qkind xp Qentry) '(:unconditional :fresh)))
      (setf (section-start-line xp) (line-no xp)))))

(defun set-indentation-prefix (xp new-position)
  (let ((new-ind (max (non-blank-prefix-ptr xp) new-position)))
    (setf (prefix-ptr xp) (initial-prefix-ptr xp))
    (check-size xp prefix new-ind)
    (when (> new-ind (prefix-ptr xp))
      (fill (prefix xp) #\space :start (prefix-ptr xp) :end new-ind))
    (setf (prefix-ptr xp) new-ind)))

(defun set-prefix (xp prefix-string)
  (replace (prefix xp) prefix-string
	   :start1 (- (prefix-ptr xp) (length prefix-string)))
  (setf (non-blank-prefix-ptr xp) (prefix-ptr xp)))

(defun set-suffix (xp suffix-string)
  (let* ((end (length suffix-string))
	 (new-end (+ (suffix-ptr xp) end)))
    (check-size xp suffix new-end)
    (do ((i (1- new-end) (1- i)) (j 0 (1+ j))) ((= j end))
      (setf (char (suffix xp) i) (char suffix-string j)))
    (setf (suffix-ptr xp) new-end)))

(defun reverse-string-in-place (string start end)
  (do ((i start (1+ i)) (j (1- end) (1- j))) ((not (< i j)) string)
    (let ((c (char string i)))
      (setf (char string i) (char string j))
      (setf (char string j) c))))

;		   ---- BASIC INTERFACE FUNCTIONS ----

;The internal functions in this file, and the (formatter "...") expansions
;use the '+' forms of these functions directly (which is faster) because,
;they do not need error checking of fancy stream coercion.  The '++' forms
;additionally assume the thing being output does not contain a newline.

(defun basic-write (object stream)
  (cond ((xp-structure-p stream)
         (write+ object stream))
	(*print-pretty*
         (maybe-initiate-xp-printing #'(lambda (s o) (write+ o s))
                                     stream object))
	(t
         (sys:output-object object stream))))

(defun write (object &key
		     ((:stream stream) *standard-output*)
		     ((:escape *print-escape*) *print-escape*)
		     ((:radix *print-radix*) *print-radix*)
		     ((:base *print-base*) *print-base*)
		     ((:circle *print-circle*) *print-circle*)
		     ((:pretty *print-pretty*) *print-pretty*)
		     ((:level *print-level*) *print-level*)
		     ((:length *print-length*) *print-length*)
		     ((:case *print-case*) *print-case*)
		     ((:array *print-array*) *print-array*)
		     ((:gensym *print-gensym*) *print-gensym*)
		     ((:readably *print-readably*) *print-readably*)
		     ((:right-margin *print-right-margin*)
		      *print-right-margin*)
		     ((:miser-width *print-miser-width*)
		      *print-miser-width*)
		     ((:lines *print-lines*) *print-lines*)
		     ((:pprint-dispatch *print-pprint-dispatch*)
		      *print-pprint-dispatch*))
  (basic-write object stream)
  object)

(defun maybe-initiate-xp-printing (fn stream &rest args)
  (if (xp-structure-p stream) (apply fn stream args)
      (let ((*abbreviation-happened* nil)
	    (*locating-circularities* (if *print-circle* 0 nil))
	    (*circularity-hash-table*
	      (if *print-circle* (make-hash-table :test 'eq) nil))
	    (*parents* (when (not *print-shared*) (list nil)))
	    (*result* nil))
	(xp-print fn (sys:decode-stream-arg stream) args)
	(when *abbreviation-happened*
	  (setq *last-abbreviated-printing*
		(eval
		  `(function
		     (lambda (&optional (stream ',stream))
		       (let ((*package* ',*package*))
			 (apply #'maybe-initiate-xp-printing
				',fn stream
				',(copy-list args))))))))
	*result*)))

(defun xp-print (fn stream args)
  (setq *result* (do-xp-printing fn stream args))
  (when *locating-circularities*
    (setq *locating-circularities* nil)
    (setq *abbreviation-happened* nil)
    (setq *parents* nil)
    (setq *result* (do-xp-printing fn stream args))))

(defun do-xp-printing (fn stream args)
  (let ((xp (initialize-xp (make-xp-structure) stream))
	(*current-level* 0)
	(result nil))
    (catch 'line-limit-abbreviation-exit
      (start-block xp nil nil nil)
      (setq result (apply fn xp args))
      (end-block xp nil))
    (when (and *locating-circularities*
	       (zerop *locating-circularities*)	;No circularities.
	       (= (line-no xp) 1)	     	;Didn't suppress line.
	       (zerop (buffer-offset xp)))	;Didn't suppress partial line.
      (setq *locating-circularities* nil))	;print what you have got.
    (when (catch 'line-limit-abbreviation-exit
	    (attempt-to-output xp nil T) nil)
      (attempt-to-output xp T T))
    result))

(defun write+ (object xp)
  (let ((*parents* *parents*))
    (unless (and *circularity-hash-table*
                 (eq (circularity-process xp object nil) :subsequent))
      (when (and *circularity-hash-table* (consp object))
	;;avoid possible double check in handle-logical-block.
	(setq object (cons (car object) (cdr object))))
      (let ((printer (if *print-pretty* (get-printer object *print-pprint-dispatch*) nil))
	    type)
	(cond (printer (funcall printer xp object))
	      ((maybe-print-fast xp object))
	      ((and *print-pretty*
		    (symbolp (setq type (type-of object)))
		    (setq printer (get type 'structure-printer))
		    (not (eq printer :none)))
	       (funcall printer xp object))
	      ((and *print-pretty* *print-array* (arrayp object)
		    (not (stringp object)) (not (bit-vector-p object))
		    (not (structure-type-p (type-of object))))
	       (pretty-array xp object))
	      (t
               (let ((stuff (with-output-to-string (s) (non-pretty-print object s))))
                 (write-string+ stuff xp 0 (length stuff)))))))))

(defun non-pretty-print (object s)
  (write object
         :level (if *print-level*
                    (- *print-level* *current-level*))
         :pretty nil
         :stream s))

;It is vital that this function be called EXACTLY once for each occurrence of
;  each thing in something being printed.
;Returns nil if printing should just continue on.
;  Either it is not a duplicate, or we are in the first pass and do not know.
;returns :FIRST if object is first occurrence of a DUPLICATE.
;  (This can only be returned on a second pass.)
;  After an initial code (printed by this routine on the second pass)
;  printing should continue on for the object.
;returns :SUBSEQUENT if second or later occurrence.
;  Printing is all taken care of by this routine.

;Note many (maybe most) lisp implementations have characters and small numbers
;represented in a single word so that the are always eq when they are equal and the
;reader takes care of properly sharing them (just as it does with symbols).
;Therefore, we do not want circularity processing applied to them.  However,
;some kinds of numbers (e.g., bignums) undoubtedly are complex structures that
;the reader does not share.  However, they cannot have circular pointers in them
;and it is therefore probably a waste to do circularity checking on them.  In
;any case, it is not clear that it easy to tell exactly what kinds of numbers a
;given implementation of CL is going to have the reader automatically share.

(defun circularity-process (xp object interior-cdr?)
  (unless (or (numberp object)
	      (characterp object)
	      (and (symbolp object)	;Reader takes care of sharing.
		   (or (null *print-gensym*) (symbol-package object))))
    (let ((id (gethash object *circularity-hash-table*)))
      (if *locating-circularities*
	  (cond ((null id)	;never seen before
		 (when *parents* (push object *parents*))
		 (setf (gethash object *circularity-hash-table*) 0)
		 nil)
		((zerop id) ;possible second occurrence
		 (cond ((or (null *parents*) (member object *parents*))
			(setf (gethash object *circularity-hash-table*)
			      (incf *locating-circularities*))
			:subsequent)
		       (t
                        nil)))
		(t
                 :subsequent));third or later occurrence
	  (cond ((or (null id)	;never seen before (note ~@* etc. conses)
		     (zerop id));no duplicates
		 nil)
		((plusp id)
		 (cond (interior-cdr?
			(decf *current-level*)
			(write-string++ ". #" xp 0 3))
		       (t
                        (write-char++ #\# xp)))
		 (print-fixnum xp id)
		 (write-char++ #\= xp)
		 (setf (gethash object *circularity-hash-table*) (- id))
		 :first)
		(t
                 (if interior-cdr? (write-string++ ". #" xp 0 3)
                     (write-char++ #\# xp))
                 (print-fixnum xp (- id))
                 (write-char++ #\# xp)
                 :subsequent))))))

;This prints a few very common, simple atoms very fast.
;Pragmatically, this turns out to be an enormous savings over going to the
;standard printer all the time.  There would be diminishing returns from making
;this work with more things, but might be worth it.

(defun maybe-print-fast (xp object)
  (cond ((stringp object)
         (let ((s (sys::%write-to-string object)))
           (write-string++ s xp 0 (length s))
           t))
	((ext:fixnump object)
         (print-fixnum xp object)
         t)
	((symbolp object)
         (let ((s (sys::%write-to-string object)))
           (write-string++ s xp 0 (length s))
           t)
         )))

(defun print-fixnum (xp fixnum)
  (let ((s (sys::%write-to-string fixnum)))
    (write-string++ s xp 0 (length s))))

(defun print (object &optional (stream *standard-output*))
  (setf stream (sys:decode-stream-arg stream))
  (terpri stream)
  (let ((*print-escape* t))
    (basic-write object stream))
  (write-char #\space stream)
  object)

(defun prin1 (object &optional (stream *standard-output*))
  (setf stream (sys:decode-stream-arg stream))
  (let ((*print-escape* t))
    (basic-write object stream))
  object)

(defun princ (object &optional (stream *standard-output*))
  (setf stream (sys:decode-stream-arg stream))
  (let ((*print-escape* nil)
        (*print-readably* nil))
    (basic-write object stream))
  object)

(defun pprint (object &optional (stream *standard-output*))
  (setq stream (sys:decode-stream-arg stream))
  (terpri stream)
  (let ((*print-escape* T) (*print-pretty* T))
    (basic-write object stream))
  (values))

(defun write-to-string (object &key
                               ((:escape *print-escape*) *print-escape*)
                               ((:radix *print-radix*) *print-radix*)
                               ((:base *print-base*) *print-base*)
                               ((:circle *print-circle*) *print-circle*)
                               ((:pretty *print-pretty*) *print-pretty*)
                               ((:level *print-level*) *print-level*)
                               ((:length *print-length*) *print-length*)
                               ((:case *print-case*) *print-case*)
                               ((:array *print-array*) *print-array*)
                               ((:gensym *print-gensym*) *print-gensym*)
                               ((:readably *print-readably*) *print-readably*)
                               ((:right-margin *print-right-margin*) *print-right-margin*)
                               ((:miser-width *print-miser-width*) *print-miser-width*)
                               ((:lines *print-lines*) *print-lines*)
                               ((:pprint-dispatch *print-pprint-dispatch*) *print-pprint-dispatch*))
  (let ((stream (make-string-output-stream)))
    (sys:output-object object stream)
    (get-output-stream-string stream)))

(defun prin1-to-string (object)
  (with-output-to-string (stream)
    (let ((*print-escape* T))
      (basic-write object stream))))

(defun princ-to-string (object)
  (with-output-to-string (stream)
    (let ((*print-escape* nil)
          (*print-readably* nil))
      (basic-write object stream))))

(defun write-char (char &optional (stream *standard-output*))
  (setf stream (sys:decode-stream-arg stream))
  (if (xp-structure-p stream)
      (write-char+ char stream)
      (sys::%write-char char stream))
  char)

(defun write-string (string &optional (stream *standard-output*)
                            &key (start 0) (end (length string)))
  (setf stream (sys:decode-stream-arg stream))
  (if (xp-structure-p stream)
      (write-string+ string stream start end)
      (progn
        (unless start
          (setf start 0))
        (if end
            (setf end (min end (length string)))
            (setf end (length string)))
        (sys::%write-string string stream start end)))
  string)

(defun write-line (string &optional (stream *standard-output*)
		   &key (start 0) (end (length string)))
  (setf stream (sys:decode-stream-arg stream))
  (cond ((xp-structure-p stream)
         (write-string+ string stream start end)
         (pprint-newline+ :unconditional stream))
        (t (sys::%write-string string stream start end)
           (sys::%terpri stream)))
  string)

(defun terpri (&optional (stream *standard-output*))
  (setf stream (sys:decode-stream-arg stream))
  (if (xp-structure-p stream)
      (pprint-newline+ :unconditional stream)
      (sys::%terpri stream))
  nil)

;This has to violate the XP data abstraction and fool with internal
;stuff, in order to find out the right info to return as the result.

(defun fresh-line (&optional (stream *standard-output*))
  (setf stream (sys:decode-stream-arg stream))
  (cond ((xp-structure-p stream)
	 (attempt-to-output stream t t) ;ok because we want newline
	 (when (not (zerop (LP<-BP stream)))
	   (pprint-newline+ :fresh stream)
	   t))
	(t
         (sys::%fresh-line stream))))

;Each of these causes the stream to be pessimistic and insert
;newlines wherever it might have to, when forcing the partial output
;out.  This is so that things will be in a consistent state if
;output continues to the stream later.

(defun finish-output (&optional (stream *standard-output*))
  (setf stream (sys:decode-stream-arg stream))
  (when (xp-structure-p stream)
    (attempt-to-output stream T T)
    (setf stream (base-stream stream)))
  (sys::%finish-output stream)
  nil)

(defun force-output (&optional (stream *standard-output*))
  (setf stream (sys:decode-stream-arg stream))
  (when (xp-structure-p stream)
    (attempt-to-output stream T T)
    (setf stream (base-stream stream)))
  (sys::%force-output stream)
  nil)

(defun clear-output (&optional (stream *standard-output*))
  (setf stream (sys:decode-stream-arg stream))
  (when (xp-structure-p stream)
    (let ((*locating-circularities* 0)) ;hack to prevent visible output
      (attempt-to-output stream T T)
      (setf stream (base-stream stream))))
  (sys::%clear-output stream)
  nil)

;The internal functions in this file, and the (formatter "...") expansions
;use the '+' forms of these functions directly (which is faster) because,
;they do not need error checking or fancy stream coercion.  The '++' forms
;additionally assume the thing being output does not contain a newline.

(defmacro pprint-logical-block ((stream-symbol list
                                               &key
                                               (prefix nil prefix-p)
                                               (per-line-prefix nil per-line-prefix-p)
                                               (suffix ""))
				&body body)
  (cond ((eq stream-symbol nil)
         (setf stream-symbol '*standard-output*))
	((eq stream-symbol t)
         (setf stream-symbol '*terminal-io*)))
  (when (not (symbolp stream-symbol))
    (warn "STREAM-SYMBOL arg ~S to PPRINT-LOGICAL-BLOCK is not a bindable symbol."
	  stream-symbol)
    (setf stream-symbol '*standard-output*))
  (when (and prefix-p per-line-prefix-p)
    (error "Cannot specify values for both PREFIX and PER-LINE-PREFIX."))
  `(maybe-initiate-xp-printing
     #'(lambda (,stream-symbol)
	 (let ((+l ,list)
	       (+p ,(or prefix per-line-prefix ""))
	       (+s ,suffix))
	   (pprint-logical-block+
	     (,stream-symbol +l +p +s ,(not (null per-line-prefix)) t nil)
	     ,@ body nil)))
     (sys:decode-stream-arg ,stream-symbol)))

;Assumes var and args must be variables.  Other arguments must be literals or variables.

(defmacro pprint-logical-block+ ((var args prefix suffix per-line? circle-check? atsign?)
				 &body body)
   (when (and circle-check? atsign?)
     (setf circle-check? 'not-first-p))
  `(let ((*current-level* (1+ *current-level*))
	 (*current-length* -1)
	 (*parents* *parents*)
	 ,@(if (and circle-check? atsign?) `((not-first-p (plusp *current-length*)))))
     (unless (check-block-abbreviation ,var ,args ,circle-check?)
       (block logical-block
	 (start-block ,var ,prefix ,per-line? ,suffix)
	 (unwind-protect
	   (macrolet ((pprint-pop () `(pprint-pop+ ,',args ,',var))
		      (pprint-exit-if-list-exhausted ()
			`(if (null ,',args) (return-from logical-block nil))))
	     ,@ body)
	   (end-block ,var ,suffix))))))

;; "If stream is a pretty printing stream and the value of *PRINT-PRETTY* is
;; true, a line break is inserted in the output when the appropriate condition
;; below is satisfied; otherwise, PPRINT-NEWLINE has no effect."
(defun pprint-newline (kind &optional (stream *standard-output*))
  (setq stream (sys:decode-stream-arg stream))
  (when (not (member kind '(:linear :miser :fill :mandatory)))
    (error "Invalid KIND argument ~A to PPRINT-NEWLINE." kind))
  (when (and (xp-structure-p stream) *print-pretty*)
    (pprint-newline+ kind stream))
  nil)

(defun pprint-indent (relative-to n &optional (stream *standard-output*))
  (setq stream (sys:decode-stream-arg stream))
  (when (not (member relative-to '(:block :current)))
    (error "Invalid KIND argument ~A to PPRINT-INDENT" relative-to))
  (when (xp-structure-p stream)
    (pprint-indent+ relative-to n stream))
  nil)

(defun pprint-tab (kind colnum colinc &optional (stream *standard-output*))
  (setq stream (sys:decode-stream-arg stream))
  (when (not (member kind '(:line :section :line-relative :section-relative)))
    (error "Invalid KIND argument ~A to PPRINT-TAB" kind))
  (when (and (xp-structure-p stream) *print-pretty*)
    (pprint-tab+ kind colnum colinc stream))
  nil)

(eval-when (:compile-toplevel :load-toplevel :execute)
  (defmacro pprint-pop+ (args xp)
    `(if (pprint-pop-check+ ,args ,xp)
         (return-from logical-block nil)
         (pop ,args)))

  (defun pprint-pop-check+ (args xp)
    (incf *current-length*)
    (cond ((not (listp args))  ;must be first so supersedes length abbrev
           (write-string++ ". " xp 0 2)
           (write+ args xp)
           T)
          ((and *print-length* ;must supersede circle check
                (not *print-readably*)
                (not (< *current-length* *print-length*)))
           (write-string++ "..." xp 0 3)
           (setq *abbreviation-happened* T)
           T)
          ((and *circularity-hash-table* (not (zerop *current-length*)))
           (case (circularity-process xp args T)
             (:first ;; note must inhibit rechecking of circularity for args.
              (write+ (cons (car args) (cdr args)) xp) T)
             (:subsequent t)
             (t nil)))))

  (defun check-block-abbreviation (xp args circle-check?)
    (cond ((not (listp args))
           (write+ args xp) T)
          ((and *print-level*
                (not *print-readably*)
                (> *current-level* *print-level*))
           (write-char++ #\# XP) (setq *abbreviation-happened* T) T)
          ((and *circularity-hash-table*
                circle-check?
                (eq (circularity-process xp args nil) :subsequent)) T)
          (t
           nil)))
) ;; EVAL-WHEN

;                ---- PRETTY PRINTING FORMATS ----

(defun pretty-array (xp array)
  (cond ((vectorp array)
         (pretty-vector xp array))
	((zerop (array-rank array))
	 (write-string++ "#0A" xp 0 3)
	 (write+ (aref array) xp))
	(t
         (pretty-non-vector xp array))))

(defun pretty-vector (xp v)
  (pprint-logical-block (xp nil :prefix "#(" :suffix ")")
    (let ((end (length v)) (i 0))
      (when (plusp end)
	(loop (pprint-pop)
	      (write+ (aref v i) xp)
	      (if (= (incf i) end) (return nil))
	      (write-char++ #\space xp)
	      (pprint-newline+ :fill xp))))))

(declaim (special *prefix*))

(defun pretty-non-vector (xp array)
  (when (and *print-readably*
	     (not (array-readably-printable-p array)))
    (error 'print-not-readable :object array))
  (let* ((bottom (1- (array-rank array)))
	 (indices (make-list (1+ bottom) :initial-element 0))
	 (dims (array-dimensions array))
	 (*prefix* (cl:format nil "#~DA(" (1+ bottom))))
    (labels ((pretty-slice (slice)
	       (pprint-logical-block (xp nil :prefix *prefix* :suffix ")")
		 (let ((end (nth slice dims))
		       (spot (nthcdr slice indices))
		       (i 0)
		       (*prefix* "("))
		   (when (plusp end)
		     (loop (pprint-pop)
			   (setf (car spot) i)
			   (if (= slice bottom)
			       (write+ (apply #'aref array indices) xp)
			       (pretty-slice (1+ slice)))
			   (if (= (incf i) end) (return nil))
			   (write-char++ #\space xp)
			   (pprint-newline+ (if (= slice bottom) :fill :linear) xp)))))))
      (pretty-slice 0))))

(defun array-readably-printable-p (array)
  (and (eq (array-element-type array) t)
       (let ((zero (position 0 (array-dimensions array)))
	     (number (position 0 (array-dimensions array)
			       :test (complement #'eql)
			       :from-end t)))
	 (or (null zero) (null number) (> zero number)))))

;Must use pprint-logical-block (no +) in the following three, because they are
;exported functions.

(defun pprint-linear (s list &optional (colon? T) atsign?)
  (declare (ignore atsign?))
  (pprint-logical-block (s list :prefix (if colon? "(" "")
			        :suffix (if colon? ")" ""))
    (pprint-exit-if-list-exhausted)
    (loop (write+ (pprint-pop) s)
	  (pprint-exit-if-list-exhausted)
	  (write-char++ #\space s)
	  (pprint-newline+ :linear s))))

(defun pprint-fill (s list &optional (colon? T) atsign?)
  (declare (ignore atsign?))
  (pprint-logical-block (s list :prefix (if colon? "(" "")
			        :suffix (if colon? ")" ""))
    (pprint-exit-if-list-exhausted)
    (loop (write+ (pprint-pop) s)
	  (pprint-exit-if-list-exhausted)
	  (write-char++ #\space s)
	  (pprint-newline+ :fill s))))

(defun pprint-tabular (s list &optional (colon? T) atsign? (tabsize nil))
  (declare (ignore atsign?))
  (when (null tabsize) (setq tabsize 16))
  (pprint-logical-block (s list :prefix (if colon? "(" "")
			        :suffix (if colon? ")" ""))
    (pprint-exit-if-list-exhausted)
    (loop (write+ (pprint-pop) s)
	  (pprint-exit-if-list-exhausted)
	  (write-char++ #\space s)
	  (pprint-tab+ :section-relative 0 tabsize s)
	  (pprint-newline+ :fill s))))

(defun fn-call (xp list)
  (funcall (formatter "~:<~W~^ ~:I~@_~@{~W~^ ~_~}~:>") xp list))

;Although idiosyncratic, I have found this very useful to avoid large
;indentations when printing out code.

(defun alternative-fn-call (xp list)
  (if (> (length (symbol-name (car list))) 12)
      (funcall (formatter "~:<~1I~@{~W~^ ~_~}~:>") xp list)
      (funcall (formatter "~:<~W~^ ~:I~@_~@{~W~^ ~_~}~:>") xp list)))

(defun bind-list (xp list &rest args)
    (declare (ignore args))
  (if (do ((i 50 (1- i))
	   (ls list (cdr ls))) ((null ls) t)
	(when (or (not (consp ls)) (not (symbolp (car ls))) (minusp i))
	  (return nil)))
      (pprint-fill xp list)
      (funcall (formatter "~:<~@{~:/xp:pprint-fill/~^ ~_~}~:>") xp list)))

(defun block-like (xp list &rest args)
  (declare (ignore args))
  (funcall (formatter "~:<~1I~^~W~^ ~@_~W~^~@{ ~_~W~^~}~:>") xp list))

(defun defun-like (xp list &rest args)
  (declare (ignore args))
  (funcall (formatter "~:<~1I~W~^ ~@_~W~^ ~@_~:/xp:pprint-fill/~^~@{ ~_~W~^~}~:>")
	   xp list))

(defun print-fancy-fn-call (xp list template)
  (let ((i 0) (in-first-section T))
    (pprint-logical-block+ (xp list "(" ")" nil T nil)
      (write+ (pprint-pop) xp)
      (pprint-indent+ :current 1 xp)
      (loop
	(pprint-exit-if-list-exhausted)
	(write-char++ #\space xp)
	(when (eq i (car template))
	  (pprint-indent+ :block (cadr template) xp)
	  (setq template (cddr template))
	  (setq in-first-section nil))
	(pprint-newline (cond ((and (zerop i) in-first-section) :miser)
			      (in-first-section :fill)
			      (T :linear))
			xp)
	(write+ (pprint-pop) xp)
	(incf i)))))

(defun maybelab (xp item &rest args)
    (declare (ignore args) (special need-newline indentation))
  (when need-newline (pprint-newline+ :mandatory xp))
  (cond ((and item (symbolp item))
	 (write+ item xp)
	 (setq need-newline nil))
	(T (pprint-tab+ :section indentation 0 xp)
	   (write+ item xp)
	   (setq need-newline T))))

;This is an attempt to specify a correct format for every form in the CL book
;that does not just get printed out like an ordinary function call
;(i.e., most special forms and many macros).  This of course does not
;cover anything new you define.

(defun let-print (xp obj)
  (funcall (formatter "~:<~1I~W~^ ~@_~/xp:bind-list/~^~@{ ~_~W~^~}~:>") xp obj))

(defun cond-print (xp obj)
  (funcall (formatter "~:<~W~^ ~:I~@_~@{~:/xp:pprint-linear/~^ ~_~}~:>") xp obj))

(defun dmm-print (xp list)
  (print-fancy-fn-call xp list '(3 1)))

(defun defsetf-print (xp list)
  (print-fancy-fn-call xp list '(3 1)))

(defun do-print (xp obj)
  (funcall
   (formatter "~:<~W~^ ~:I~@_~/xp:bind-list/~^ ~_~:/xp:pprint-linear/ ~1I~^~@{ ~_~W~^~}~:>")
   xp obj))

(defun flet-print (xp obj)
  (funcall (formatter "~:<~1I~W~^ ~@_~:<~@{~/xp:block-like/~^ ~_~}~:>~^~@{ ~_~W~^~}~:>")
	   xp obj))

(defun function-print (xp list)
  (if (and (consp (cdr list)) (null (cddr list)))
      (funcall (formatter "#'~W") xp (cadr list))
      (fn-call xp list)))

(defun mvb-print (xp list)
  (print-fancy-fn-call xp list '(1 3 2 1)))

(defun prog-print (xp list)
  (let ((need-newline T) (indentation (1+ (length (symbol-name (car list))))))
    (declare (special need-newline indentation))
    (funcall (formatter "~:<~W~^ ~:/xp:pprint-fill/~^ ~@{~/xp:maybelab/~^ ~}~:>")
	     xp list)))

(defun setq-print (xp obj)
  (funcall (formatter "~:<~W~^ ~:I~@_~@{~W~^ ~:_~W~^ ~_~}~:>") xp obj))

(defun quote-print (xp list)
  (if (and (consp (cdr list)) (null (cddr list)))
      (funcall (formatter "'~W") xp (cadr list))
      (pprint-fill xp list)))

(defun tagbody-print (xp list)
  (let ((need-newline (and (consp (cdr list))
			   (symbolp (cadr list)) (cadr list)))
	(indentation (1+ (length (symbol-name (car list))))))
    (declare (special need-newline indentation))
    (funcall (formatter "~:<~W~^ ~@{~/xp:maybelab/~^ ~}~:>") xp list)))

(defun up-print (xp list)
  (print-fancy-fn-call xp list '(0 3 1 1)))

;here is some simple stuff for printing LOOP

;The challange here is that we have to effectively parse the clauses of the
;loop in order to know how to print things.  Also you want to do this in a
;purely incremental way so that all of the abbreviation things work, and
;you wont blow up on circular lists or the like.  (More aesthic output could
;be produced by really parsing the clauses into nested lists before printing them.)

;The following program assumes the following simplified grammar of the loop
;clauses that explains how to print them.  Note that it does not bare much
;resemblence to the right parsing grammar, however, it produces half decent
;output.  The way to make the output better is to make the grammar more
;detailed.
;
;loop == (LOOP {clause}*)      ;one clause on each line.
;clause == block | linear | cond | finally
;block == block-head {expr}*   ;as many exprs as possible on each line.
;linear == linear-head {expr}* ;one expr on each line.
;finally == FINALLY [DO | DOING | RETURN] {expr}* ;one expr on each line.
;cond == cond-head [expr]
;          clause
;	   {AND clause}*       ;one AND on each line.
;        [ELSE
;          clause
;	   {AND clause}*]      ;one AND on each line.
;        [END]
;block-head == FOR | AS | WITH | AND
;              | REPEAT | NAMED | WHILE | UNTIL | ALWAYS | NEVER | THEREIS | RETURN
;              | COLLECT | COLLECTING | APPEND | APPENDING | NCONC | NCONCING | COUNT
;              | COUNTING | SUM | SUMMING | MAXIMIZE | MAXIMIZING | MINIMIZE | MINIMIZING
;linear-head == DO | DOING | INITIALLY
;var-head == FOR | AS | WITH
;cond-head == IF | WHEN | UNLESS
;expr == <anything that is not a head symbol>

;Note all the string comparisons below are required to support some
;existing implementations of LOOP.

(defun token-type (token &aux string)
  (cond ((not (symbolp token)) :expr)
	((string= (setq string (string token)) "FINALLY") :finally)
	((member string '("IF" "WHEN" "UNLESS") :test #'string=) :cond-head)
	((member string '("DO" "DOING" "INITIALLY") :test #'string=) :linear-head)
	((member string '("FOR" "AS" "WITH" "AND" "END" "ELSE"
			  "REPEAT" "NAMED" "WHILE" "UNTIL" "ALWAYS" "NEVER"
			  "THEREIS" "RETURN" "COLLECT" "COLLECTING" "APPEND"
			  "APPENDING" "NCONC" "NCONCING" "COUNT" "COUNTING"
			  "SUM" "SUMMING" "MAXIMIZE" "MAXIMIZING"
			  "MINIMIZE" "MINIMIZING")
		 :test #'string=)
	 :block-head)
	(T :expr)))

(defun pretty-loop (xp loop)
  (if (not (and (consp (cdr loop)) (symbolp (cadr loop)))) ; old-style loop
      (fn-call xp loop)
      (pprint-logical-block (xp loop :prefix "(" :suffix ")")
	(let (token type)
	  (labels ((next-token ()
		     (pprint-exit-if-list-exhausted)
		     (setq token (pprint-pop))
		     (setq type (token-type token)))
		   (print-clause (xp)
		     (case type
		       (:linear-head (print-exprs xp nil :mandatory))
		       (:cond-head (print-cond xp))
		       (:finally (print-exprs xp T :mandatory))
		       (otherwise (print-exprs xp nil :fill))))
		   (print-exprs (xp skip-first-non-expr newline-type)
		     (let ((first token))
		       (next-token)	;so always happens no matter what
		       (pprint-logical-block (xp nil)
			 (write first :stream xp)
			 (when (and skip-first-non-expr (not (eq type :expr)))
			   (write-char #\space xp)
			   (write token :stream xp)
			   (next-token))
			 (when (eq type :expr)
			   (write-char #\space xp)
			   (pprint-indent :current 0 xp)
			   (loop (write token :stream xp)
				 (next-token)
				 (when (not (eq type :expr)) (return nil))
				 (write-char #\space xp)
				 (pprint-newline newline-type xp))))))
		   (print-cond (xp)
		     (let ((first token))
		       (next-token)	;so always happens no matter what
		       (pprint-logical-block (xp nil)
			 (write first :stream xp)
			 (when (eq type :expr)
			   (write-char #\space xp)
			   (write token :stream xp)
			   (next-token))
			 (write-char #\space xp)
			 (pprint-indent :block 2 xp)
			 (pprint-newline :linear xp)
			 (print-clause xp)
			 (print-and-list xp)
			 (when (and (symbolp token)
				    (string= (string token) "ELSE"))
			   (print-else-or-end xp)
			   (write-char #\space xp)
			   (pprint-newline :linear xp)
			   (print-clause xp)
			   (print-and-list xp))
			 (when (and (symbolp token)
				    (string= (string token) "END"))
			   (print-else-or-end xp)))))
		   (print-and-list (xp)
		     (loop (when (not (and (symbolp token)
					   (string= (string token) "AND")))
				 (return nil))
			   (write-char #\space xp)
			   (pprint-newline :mandatory xp)
			   (write token :stream xp)
			   (next-token)
			   (write-char #\space xp)
			   (print-clause xp)))
		   (print-else-or-end (xp)
		     (write-char #\space xp)
		     (pprint-indent :block 0 xp)
		     (pprint-newline :linear xp)
		     (write token :stream xp)
		     (next-token)
		     (pprint-indent :block 2 xp)))
	    (pprint-exit-if-list-exhausted)
	    (write (pprint-pop) :stream xp)
	    (next-token)
	    (write-char #\space xp)
	    (pprint-indent :current 0 xp)
	    (loop (print-clause xp)
		  (write-char #\space xp)
		  (pprint-newline :linear xp)))))))

(defun output-pretty-object (object stream)
  (basic-write object stream))

(provide 'pprint)

;------------------------------------------------------------------------

;Copyright Massachusetts Institute of Technology, Cambridge, Massachusetts.

;Permission to use, copy, modify, and distribute this software and its
;documentation for any purpose and without fee is hereby granted,
;provided that this copyright and permission notice appear in all
;copies and supporting documentation, and that the name of M.I.T. not
;be used in advertising or publicity pertaining to distribution of the
;software without specific, written prior permission. M.I.T. makes no
;representations about the suitability of this software for any
;purpose.  It is provided "as is" without express or implied warranty.

;    M.I.T. DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE, INCLUDING
;    ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS, IN NO EVENT SHALL
;    M.I.T. BE LIABLE FOR ANY SPECIAL, INDIRECT OR CONSEQUENTIAL DAMAGES OR
;    ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
;    WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION,
;    ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS
;    SOFTWARE.

;------------------------------------------------------------------------

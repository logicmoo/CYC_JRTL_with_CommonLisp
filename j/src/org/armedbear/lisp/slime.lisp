;;; slime.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: slime.lisp,v 1.7 2004-09-05 20:05:51 piso Exp $
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

;;; Adapted from SLIME.

(in-package #:system)

(eval-when (:compile-toplevel :load-toplevel :execute)
  (require '#:swank-protocol)
  (sys:load-system-file "swank-package"))

(defpackage #:j
  (:use #:cl #:ext #:java))

(defpackage #:slime
  (:use #:cl #:ext #:j)
  (:export #:complete-symbol
           #:slime-space
           #:edit-definition))

(in-package #:slime)

(defvar *stream* nil)

(defun slime-connected-p ()
  (not (null *stream*)))

(defun connect (host port)
  (when *stream*
    (disconnect))
  (ignore-errors
   (let* ((socket (sys::make-socket host port))
          (stream (and socket (get-socket-stream socket))))
     (when stream
       (setf *stream* stream)
       (return-from connect t)))))

(defun disconnect ()
  (when *stream*
    (ignore-errors
     (close *stream*))
    (setf *stream* nil)))

(defun slime-eval (form)
  (handler-case
      (progn
        (swank-protocol:encode-message form *stream*)
        (swank-protocol:decode-message *stream*))
    (stream-error () (disconnect))))

(defun slime-read-port-and-connect (retries)
  (status "Slime polling for connection...")
  (dotimes (i retries)
    (when (probe-file (swank-protocol:port-file))
      (with-open-file (s (swank-protocol:port-file)
                         :direction :input)
        (let ((port (read s)))
          (when (connect "localhost" port)
            (return)))))
    (sleep 1)))

(defun slime ()
  (when *stream*
    (disconnect))
  (make-thread #'(lambda ()
                  (progn
                    (slime-read-port-and-connect 20)
                    (status "Slime connected!")))))

(defvar *prefix* nil)
(defvar *completions* ())
(defvar *completion-index* 0)

(defun completions (prefix)
  (slime-eval `(swank::completion-set ,prefix ,(package-name *package*))))

(defun delimiter-p (c)
  (member c '(#\space #\( #\) #\')))

(defun completion-prefix ()
  (let* ((string (line-chars (current-line)))
         (end (mark-charpos (current-point))))
    (do ((start (1- end) (1- start)))
        ((< start 0) (subseq string 0 end))
      (let ((c (schar string start)))
        (when (delimiter-p c)
          (incf start)
          (return-from completion-prefix (subseq string start end)))))))

(defun complete-symbol ()
  (unless (slime-connected-p)
    (status "Slime not connected")
    (return-from complete-symbol))
  (cond ((eq *last-command* 'complete)
         (unless (> (length *completions*) 1)
           (return-from complete-symbol))
         (undo)
         (incf *completion-index*)
         (when (> *completion-index* (1- (length *completions*)))
           (setf *completion-index* 0)))
        (t
         (setf *prefix* (completion-prefix)
               *completions* nil
               *completion-index* 0)
         (when *prefix*
           (setf *completions* (completions *prefix*)))))
  (when *completions*
    (let* ((completion (string-downcase (nth *completion-index* *completions*)))
           (point (current-point))
           (flags (line-flags (mark-line point))))
      (with-single-undo
        (goto-char (make-mark (mark-line point)
                              (- (mark-charpos point) (length *prefix*))))
        (set-mark point)
        (delete-region)
        (insert completion)
        (setf (line-flags (mark-line point)) flags)))
    (setf *current-command* 'complete))
  (values))

(defun symbol-name-at-point ()
  (let ((string (line-chars (current-line)))
        (point-charpos (mark-charpos (current-point)))
        (begin 0)
        end)
    (when (= point-charpos (length string))
      (decf point-charpos))
    (loop
      (aver (< point-charpos (length string)))
      (cond ((not (delimiter-p (schar string point-charpos)))
             (return))
            ((zerop point-charpos)
             (return-from symbol-name-at-point nil))
            (t
             (decf point-charpos))))
    (dotimes (i point-charpos)
      (let ((c (schar string i)))
        (when (delimiter-p c)
          (setf begin (1+ i)))))
    (do ((i point-charpos (1+ i)))
        ((= i (length string)) (setf end i))
      (when (delimiter-p (schar string i))
        (setf end i)
        (return)))
    (subseq string begin end)))

(defun enclosing-operator-names ()
  "Return the list of operator names of the forms containing point."
  (let ((result ()))
     (save-excursion
      (loop
        (let ((point1 (current-point))
              (point2 (progn (backward-up-list) (current-point))))
          (when (and (equal (mark-line point1) (mark-line point2))
                     (eql (mark-charpos point1) (mark-charpos point2)))
            (return)))
        (unless (looking-at "(")
          (return))
        (when (looking-at "(")
          (forward-char)
          (let ((name (symbol-name-at-point)))
            (cond ((string-equal name "defun")
                   (return))
                  ((null name)
                   (return))
                  (t
                   (push name result))))
          (backward-up-list))))
    (nreverse result)))

(defun slime-space ()
  (unwind-protect
   (when (slime-connected-p)
     (let ((names (enclosing-operator-names)))
       (when names
         (let ((message (slime-eval `(swank:arglist-for-echo-area (quote ,names)))))
           (when message
             (status message))))))
   (insert #\space)))

(defun find-buffer-package ()
;;   (save-excursion
;;    (when (let ((case-fold-search t)
;;                (regexp "^(\\(cl:\\|common-lisp:\\)?in-package\\>"))
;;            (or (re-search-backward regexp nil t)
;;                (re-search-forward regexp nil t)))
;;      (goto-char (match-end 0))
;;      (skip-chars-forward " \n\t\f\r#")
;;      (let ((pkg (ignore-errors (read (current-buffer)))))
;;        (if pkg (format "%s" pkg))))))
  (let (mark (current-point))
     (loop
        (setf mark (search-backward "(in-package"
                                      :start mark
                                      :ignore-case t
                                      :whole-words-only t))
        (cond ((null mark)
               (return))
              ((eql (mark-charpos mark) 0)
               (return))
              (t
               (move-to-position mark (1- (mark-charpos mark))))))
    (when mark
      (let* ((line-chars (line-chars (mark-line mark)))
             (package-name
              (ignore-errors
               (read-from-string (subseq line-chars
                                         (+ (mark-charpos mark)
                                            (length "(in-package")))))))
        (when package-name
          (string package-name))))))

(defstruct (slime-definition (:type list))
  spec location)

(defun goto-source-location (name location)
  (when (eq (car location) :location)
    (let (file position function-name)
      (dolist (item (cdr location))
        (case (car item)
          (:file
           (setf file (cadr item)))
          (:position
           (setf position (cadr item)))
          (:function-name
           (setf function-name (cadr item)))))
      (when file
        (let ((buffer (find-file-buffer file)))
          (when buffer
            (switch-to-buffer buffer)
            (with-single-undo
              (when position
                (goto-char position))
              (let* ((pattern (format nil "^\\s*\\(def\\S*\\s+~A"
                                      (or function-name (string name))))
                     (pos (re-search-forward pattern
                                             :ignore-case t
                                             :whole-words-only t)))
                (when pos
                  (goto-char pos))
                (setf pos (search-forward (string name) :ignore-case t))
                (when pos
                  (goto-char pos))))
            (update-display)))))))

;; FIXME
(defun find-tag-at-point ()
  (j::%execute-command "findTagAtDot"))

(defun edit-definition (&optional function-name package-name)
  (let ((pathname (buffer-pathname (current-buffer))))
    (when (and pathname
               (string-equal (pathname-type pathname) "el"))
      (find-tag-at-point)
      (return-from edit-definition)))
  (unless function-name
    (setf function-name (string-upcase (symbol-name-at-point))))
  (when function-name
    (setf function-name (string function-name))
    (let ((definitions
            (slime-eval `(swank:find-definitions-for-function-name ,function-name
                                                                   ,package-name))))
      (if definitions
          (goto-source-location function-name
                                (slime-definition-location (car definitions)))
          (find-tag-at-point)))))

(map-key-for-mode "Tab" "(slime:complete-symbol)" "Lisp Shell")
(map-key-for-mode "Ctrl Alt I" "(slime:complete-symbol)" "Lisp")
(map-key-for-mode "Space" "(slime:slime-space)" "Lisp")
(map-key-for-mode "Space" "(slime:slime-space)" "Lisp Shell")
(map-key-for-mode "Alt ." "(slime:edit-definition)" "Lisp")
(map-key-for-mode "Alt ." "(slime:edit-definition)" "Lisp Shell")

;;; slime.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: slime.lisp,v 1.2 2004-09-02 00:47:46 piso Exp $
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
  (:export #:complete-symbol))

(in-package "SLIME")

(defvar *stream* nil)

(defun remote-eval (form)
  (swank-protocol:encode-message form *stream*)
  (swank-protocol:decode-message *stream*))

(defun connect (host port)
  (sys::%format t "slime-connect~%")
  (when *stream*
    (disconnect))
  (ignore-errors
   (let* ((socket (sys::make-socket host port))
          (stream (and socket (get-socket-stream socket))))
     (when stream
       (sys::%format t "connected!~%")
       (setf *stream* stream)
       (return-from connect t)))))

(defun disconnect ()
  (when *stream*
    (close *stream*)
    (setf *stream* nil)))

(defun slime-read-port-and-connect (retries)
  (dotimes (i retries)
    (when (probe-file (swank-protocol:port-file))
      (with-open-file (s (swank-protocol:port-file)
                         :direction :input)
        (let ((port (read s)))
          (sys::%format t "port = ~S~%" port)
          (when (connect "localhost" port)
            (return)))))
    (sleep 1)))

(defun slime ()
  (when *stream*
    (disconnect))
  (make-thread #'(lambda ()
                  (progn
                    (slime-read-port-and-connect 20)
                    (sys::%format t "connect thread exiting~%")))))

(defvar *prefix* nil)
(defvar *completions* ())
(defvar *completion-index* 0)

(defun completions (prefix)
  (remote-eval `(swank::completion-set ,prefix ,(package-name *package*))))

(defun completion-prefix ()
  (let* ((string (line-chars (current-line)))
         (end (marker-charpos (point))))
    (do ((start (1- end) (1- start)))
        ((< start 0) (subseq string 0 end))
      (let ((c (schar string start)))
        (when (or (eql c #\space) (eql c #\())
          (incf start)
          (return-from completion-prefix (subseq string start end)))))))

(defun complete-symbol ()
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
           (point (point))
           (flags (line-flags (marker-line point))))
      (with-single-undo
        (goto-char (make-marker (marker-line point)
                                (- (marker-charpos point) (length *prefix*))))
        (set-mark point)
        (delete-region)
        (insert completion)
        (setf (line-flags (marker-line point)) flags)))
    (setf *current-command* 'complete))
  (values))

(defun delimiter-p (c)
  (member c '(#\space #\( #\))))

(defun symbol-name-at-point ()
  (let ((string (line-chars (current-line)))
        (point-charpos (marker-charpos (point)))
        (delimiters '(#\space #\( #\)))
        begin
        end)
    (when (delimiter-p (schar string point-charpos))
      (return-from symbol-name-at-point nil))
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
  (let ((result '()))
     (save-excursion
      (loop
        (backward-up-list)
        (when (looking-at "(")
          (forward-char)
          (let ((name (symbol-name-at-point)))
            (cond ((string-equal name "defun")
                   (return))
                  ((null name)
                   (return))
                  (t
                   (push name result))))
          (backward-up-list))
        ))
    (nreverse result)))

#+nil
(defun slime-space (n)
  "Insert a space and print some relevant information (function arglist).
   Designed to be bound to the SPC key.  Prefix argument can be used to insert
   more than one space."
  (interactive "p")
  (unwind-protect
   (when (and slime-space-information-p
              (slime-connected-p)
              (or (not (slime-busy-p))
                  ;; XXX should we enable this?
                  ;; (not slime-use-sigint-for-interrupt))
                  ))
     (let ((names (enclosing-operator-names)))
       (when names
         (remote-eval `(swank:arglist-for-echo-area (quote ,names)))
          (lambda (message)
            (if message
                (slime-message "%s" message)))))))
   (self-insert-command n))

(j::map-key-for-mode "Tab" "(slime:complete-symbol)" "Lisp Shell")

;;; init.lisp
;;; $Id: init.lisp,v 1.14 2003-10-07 14:30:16 piso Exp $

;;; ~/.j/init.lisp (if it exists) is loaded automatically when j starts up.

(defun load-theme (name)
  (let ((filename (concatenate 'string "/home/peter/depot/j/themes/" name ".lisp")))
    (unless (probe-file filename)
      (error "file not found: ~A" filename))
    (kill-theme)
    (load filename)
    (reset-display)
    t))

(defun hostname ()
  (when (probe-file "/etc/hostname")
    (with-open-file (f "/etc/hostname")
      (read-line f))))

;; Use Kodiak on prufrock, AnokhaClassic on the laptops.
(let ((hostname (hostname)))
  (if (and hostname (search "prufrock" hostname))
      (load-theme "Kodiak")
      (load-theme "AnokhaClassic")))

(defun java-version ()
  (jstatic "getProperty" "java.lang.System" "java.version"))

(defun adjust-appearance ()
  (when (member (subseq (java-version) 0 5) '("1.4.0" "1.4.1" "1.4.2") :test #'string=)
    (set-global-property "adjustAscent" -2)
    (set-global-property "adjustLeading" -2)
    (reset-display)))

;; Do it now!
(adjust-appearance)

;; Turn off the remove-trailing-whitespace preference for files in the
;; directory ~/gcl/ansi-tests.
(defun my-open-file-hook (buf)
  (let ((filename (buffer-pathname buf)))
    (when (and filename
               (string= (directory-namestring filename)
                        "/home/peter/gcl/ansi-tests/"))
      (setf (variable-value 'remove-trailing-whitespace :buffer) nil))))

(add-hook 'open-file-hook 'my-open-file-hook)

;; Call ADJUST-APPEARANCE after saving ~/.j/prefs.
(defun my-after-save-hook (buf)
  (let ((filename (buffer-pathname buf)))
    (when (string= filename "/home/peter/.j/prefs")
      (adjust-appearance))))

(add-hook 'after-save-hook 'my-after-save-hook)

(defun reset-incoming-filters ()
  (jstatic "resetIncomingFilters" "org.armedbear.j.mail.IncomingFilter"))

(defun add-incoming-filter (mailbox pattern action parameter)
  (jstatic "addIncomingFilter" "org.armedbear.j.mail.IncomingFilter"
           mailbox pattern action parameter))

(add-hook 'mailbox-mode-hook
          (lambda ()
            (reset-incoming-filters)
            (add-incoming-filter "inbox"
                                 "~C linux-kernel"
                                 "move"
                                 "{annie}mail/linux-kernel")))

(when (probe-file "/home/peter/.j/key-pressed.lisp")
  (load "/home/peter/.j/key-pressed.lisp"))

(when (probe-file "/home/peter/.j/update-check-enabled.lisp")
  (load "/home/peter/.j/update-check-enabled.lisp"))

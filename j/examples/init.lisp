;;; init.lisp
;;; $Id: init.lisp,v 1.13 2003-10-07 02:08:35 piso Exp $

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

;; In minutes.
(defparameter check-enabled-timeout 5)

;; Don't resolve autoloads in the background thread!
(sys::resolve 'get-internal-real-time)

(defun update-check-enabled ()
  (loop
    (sleep 60) ; 1 minute
    (let* ((last-event-time (get-last-event-internal-time))
           (current-time (get-internal-real-time))
           (timeout (* check-enabled-timeout 60 internal-time-units-per-second))
           (enable (if (> current-time (+ last-event-time timeout)) nil t)))
      (unless (eql (variable-value 'check-enabled :global) enable)
        (setf (variable-value 'check-enabled :global) enable)
        (log-debug "check-enabled => ~A"
                   (variable-value 'check-enabled :global))))))

(defun start-update-check-enabled-thread ()
  (make-thread #'update-check-enabled))

(when (probe-file "/home/peter/.j/key-pressed.lisp")
  (load "/home/peter/.j/key-pressed.lisp"))

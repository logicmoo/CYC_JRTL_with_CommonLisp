;;; init.lisp
;;; $Id: init.lisp,v 1.6 2003-06-13 17:27:49 piso Exp $

;;; ~/.j/init.lisp (if it exists) is loaded automatically when j starts up.

(defun load-theme (name)
  (let ((filename (concatenate 'string "/home/peter/depot/j/themes/" name ".lisp")))
    (unless (probe-file filename)
      (error "file not found: ~A" filename))
    (load filename)
    ;; In my world, antialiasing looks good with Kodiak but not with other
    ;; themes, and italics don't look good without antialiasing...
    (if (string= name "Kodiak")
        (set-global-property "antialias" "true"
                             "enableItalics" "true")
        (set-global-property "antialias" "false"
                             "enableItalics" "false"))
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

(defun java-version ()
  (jstatic "getProperty" "java.lang.System" "java.version"))

(when (member (subseq (java-version) 0 5) '("1.4.1" "1.4.2") :test #'string=)
  (set-global-property "adjustAscent" "-1")
  (set-global-property "adjustLeading" "-2")
  (reset-display))

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

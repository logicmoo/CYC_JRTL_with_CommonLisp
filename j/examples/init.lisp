;;; init.lisp
;;; $Id: init.lisp,v 1.2 2003-03-29 20:04:12 piso Exp $

;;; ~/.j/init.lisp (if it exists) is loaded automatically when j starts up.

(defun load-theme (name)
  (let ((filename (concatenate 'string "/home/peter/depot/j/themes/" name ".lisp")))
    (unless (probe-file filename)
      (error "file not found: ~A" filename))
    (load filename)
    ;; In my world, antialiasing looks good with Kodiak but not with other
    ;; themes.
    (set-global-property 'antialias
                         (if (string= name "Kodiak") "true" "false"))
    (reset-display)
    t))

;; (load-theme "AnokhaClassic")
(load-theme "Kodiak")

(defun java-version ()
  (jstatic "getProperty" "java.lang.System" "java.version"))

(defun java-version ()
  (jstatic "getProperty" "java.lang.System" "java.version"))

(when (string= (subseq (java-version) 0 5) "1.4.1")
  (set-global-property "enableItalics" "true")
  (set-global-property "adjustAscent" "-1")
  (set-global-property "adjustLeading" "-2")
  (reset-display))

(defun reset-incoming-filters ()
  (jstatic "resetIncomingFilters" "org.armedbear.j.mail.IncomingFilter"))

(defun add-incoming-filter (mailbox pattern action parameter)
  (jstatic "addIncomingFilter" "org.armedbear.j.mail.IncomingFilter"
           mailbox pattern action parameter))

(reset-incoming-filters)

(add-incoming-filter "inbox"
                     "~C linux-kernel"
                     "move"
                     "{annie}mail/linux-kernel")

(when (probe-file "/home/peter/.j/key-pressed.lisp")
  (load "/home/peter/.j/key-pressed.lisp"))

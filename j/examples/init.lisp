;;; init.lisp
;;; $Id: init.lisp,v 1.19 2004-04-13 15:57:34 piso Exp $

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
  (when (member (subseq (java-version) 0 5)
                '("1.4.0" "1.4.1" "1.4.2" "1.5.0")
                :test #'string=)
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

;; Helper function for MY-BUFFER-ACTIVATED-HOOK.
(defun sub-p (pathname dirname)
  "Returns T if PATHNAME is in DIRNAME or one of its subdirectories"
  (let ((dirname-length (length dirname)))
    (and (> (length pathname) dirname-length)
         (string= (subseq pathname 0 dirname-length) dirname))))

(defun my-buffer-activated-hook (buf)
  (let ((pathname (buffer-pathname buf)))
    ;; PATHNAME might be NIL (not all buffers have associated files).
    (when pathname
      (let ((type (pathname-type pathname)))
        ;; We only care about Lisp and Java buffers.
        (when (member type '("lisp" "lsp" "cl" "java") :test 'string=)
          (let ((tagpath
                 (cond ((sub-p pathname "/home/peter/cmucl/src/")
                        "/home/peter/cmucl/src/code:/home/peter/cmucl/src/compiler:/home/peter/cmucl/src/pcl")
                       ((sub-p pathname "/home/peter/cl-bench/")
                        "/home/peter/cl-bench:/home/peter/cl-bench/files:/home/peter/depot/j/src/org/armedbear/lisp")
                       ((sub-p pathname "/home/peter/gcl/ansi-tests/")
                        "/home/peter/gcl/ansi-tests:/home/peter/depot/j/src/org/armedbear/lisp")
                       (t ; default case: no change
                        nil))))
            ;; If we end up here with a non-NIL TAGPATH, use it to set the
            ;; buffer-specific value of the TAG-PATH preference for the current
            ;; buffer.
            (when tagpath
              (setf (variable-value 'tag-path :buffer) tagpath))))))))

;; Install our hook function.
(add-hook 'buffer-activated-hook 'my-buffer-activated-hook)

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
                                 "{annie}mail/linux-kernel")
            (add-incoming-filter "inbox"
                                 "~C ix.netcom.com"
                                 "move"
                                 "{annie}mail/netcom")))

(defun maybe-load (pathname)
  (when (probe-file pathname)
    (load pathname)))

(maybe-load "/home/peter/.j/key-pressed.lisp")
(maybe-load "/home/peter/.j/update-check-enabled.lisp")
(maybe-load "/home/peter/.j/complete.lisp")

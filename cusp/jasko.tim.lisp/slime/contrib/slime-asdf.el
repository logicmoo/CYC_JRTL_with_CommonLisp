;;; slime-asdf.el -- ASDF support
;;
;; Authors: Daniel Barlow  <dan@telent.net>
;;          Marco Baringer <mb@bese.it>
;;          Edi Weitz <edi@agharta.de>
;;          and others 
;; License: GNU GPL (same license as Emacs)
;;
;;; Installation:
;;
;; Add something like this to your .emacs: 
;;
;;   (add-to-list 'load-path "<directory-of-this-file>")
;;   (slime-setup '(slime-asdf ... possibly other packages ...))
;;

;; NOTE: `system-name' is a predefined variable in Emacs.  Try to
;; avoid it as local variable name.

(require 'slime-repl)
(slime-require :cusp-asdf)

(defun slime-load-system (&optional system)
  "Compile and load an ASDF system.  

Default system name is taken from first file matching *.asd in current
buffer's working directory"
  (interactive (list (slime-read-system-name)))
  (slime-oos system "LOAD-OP"))

(defvar slime-system-history nil
  "History list for ASDF system names.")

(defun slime-read-system-name (&optional prompt default-value)
  "Read a system name from the minibuffer, prompting with PROMPT."
  (let* ((completion-ignore-case nil)
         (prompt (or prompt "System"))
         (system-names (slime-eval `(cusp:list-asdf-systems)))
         (default-value (or default-value (slime-find-asd system-names)))
         (prompt (concat prompt (if default-value
                                    (format " (default `%s'): " default-value)
                                    ": "))))
    (completing-read prompt (slime-bogus-completion-alist system-names)
                     nil nil nil
                     'slime-system-history default-value)))

(defun slime-find-asd (system-names)
  "Tries to find an ASDF system definition in the default
directory or in the directory belonging to the current buffer and
returns it if it's in `system-names'."
  (let ((asdf-systems-in-directory
         (directory-files
          (file-name-directory (or default-directory
                                   (buffer-file-name)))
          nil "\.asd$")))
    (loop for system in asdf-systems-in-directory
          for candidate = (file-name-sans-extension system)
          when (find candidate system-names :test #'string-equal)
            do (return candidate))))

(defun slime-oos (system operation &rest keyword-args)
  (slime-save-some-lisp-buffers)
  (slime-display-output-buffer)
  (message "Performing ASDF %S%s on system %S"
           operation (if keyword-args (format " %S" keyword-args) "")
           system)
  (slime-repl-shortcut-eval-async
   `(cusp:operate-on-system-for-emacs ,system ,operation ,@keyword-args)
   #'slime-compilation-finished))

(defslime-repl-shortcut slime-repl-load/force-system ("force-load-system")
  (:handler (lambda ()
              (interactive)
              (slime-oos (slime-read-system-name) "LOAD-OP" :force t)))
  (:one-liner "Recompile and load an ASDF system."))

(defslime-repl-shortcut slime-repl-load-system ("load-system")
  (:handler (lambda ()
              (interactive)
              (slime-oos (slime-read-system-name) "LOAD-OP")))
  (:one-liner "Compile (as needed) and load an ASDF system."))

(defslime-repl-shortcut slime-repl-test/force-system ("force-test-system")
  (:handler (lambda ()
              (interactive)
              (slime-oos (slime-read-system-name) "TEST-OP" :force t)))
  (:one-liner "Compile (as needed) and force test an ASDF system."))

(defslime-repl-shortcut slime-repl-test-system ("test-system")
  (:handler (lambda ()
              (interactive)
              (slime-oos (slime-read-system-name) "TEST-OP")))
  (:one-liner "Compile (as needed) and test an ASDF system."))

(defslime-repl-shortcut slime-repl-compile-system ("compile-system")
  (:handler (lambda ()
              (interactive)
              (slime-oos (slime-read-system-name) "COMPILE-OP")))
  (:one-liner "Compile (but not load) an ASDF system."))

(defslime-repl-shortcut slime-repl-compile/force-system 
  ("force-compile-system")  
  (:handler (lambda ()
              (interactive)
              (slime-oos (slime-read-system-name) "COMPILE-OP" :force t)))
  (:one-liner "Recompile (but not load) an ASDF system."))

(defun slime-asdf-on-connect ()
  (slime-eval-async '(cusp:cusp-require :cusp-asdf)))

(defun slime-asdf-init ()
  (add-hook 'slime-connected-hook 'slime-asdf-on-connect))

(defun slime-asdf-unload ()
  (remove-hook 'slime-connected-hook 'slime-asdf-on-connect))

(provide 'slime-asdf)

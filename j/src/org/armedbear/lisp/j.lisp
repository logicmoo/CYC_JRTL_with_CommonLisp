;;; j.lisp

(unless (find-package "J")
  (make-package "J"))

(in-package "J")
(use-package "JAVA")

(export '(global-map-key global-unmap-key map-key-for-mode unmap-key-for-mode
          set-global-property
          run-hooks
          defcommand
          save-all
          key-pressed-hook))

(defun global-map-key (key command)
  (jstatic "globalMapKey" "org.armedbear.j.API" key command))

(defun global-unmap-key (key)
  (jstatic "globalUnmapKey" "org.armedbear.j.API" key))

(defun map-key-for-mode (key command mode)
  (jstatic "mapKeyForMode" "org.armedbear.j.API" key command mode))

(defun unmap-key-for-mode (key mode)
  (jstatic "mapKeyForMode" "org.armedbear.j.API" key mode))

(defun %set-global-property (key value)
  (jstatic "setGlobalProperty" "org.armedbear.j.Editor" key value))

(defun set-global-property (&rest args)
  (let ((nargs (length args)) key value)
    (when (oddp nargs)
      (error "odd number of arguments to SET-GLOBAL-PROPERTY"))
    (loop
      (when (null args) (return (values)))
      (%set-global-property (first args) (second args))
      (setf args (cddr args)))))

(defun run-hooks (hook &rest args)
  (when (symbolp hook)
    (setf hook (symbol-value hook))
  (cond ((consp hook)
         (dolist (fun hook)
           (when (functionp fun)
             (apply fun args))))
        ((functionp hook)
         (apply hook args)))))

(defconstant current-editor-method
  (jmethod "org.armedbear.j.Editor" "currentEditor"))

(defun current-editor ()
  (jstatic current-editor-method nil))

(defconstant update-display-method
  (jmethod "org.armedbear.j.Editor" "updateDisplay"))

(defun update-display (&optional ed)
  (let ((ed (or ed (current-editor))))
    (jcall update-display-method ed)))

(defun status (string &optional ed)
  (let ((ed (or ed (current-editor)))
        (method (jmethod "org.armedbear.j.Editor" "status"
                         "java.lang.String")))
    (jcall method ed string)))

(defconstant execute-command-method
  (jmethod "org.armedbear.j.Editor" "executeCommand"
           "java.lang.String"))

(defun execute-command (command &optional ed)
  (let ((ed (or ed (current-editor))))
    (jcall execute-command-method ed command)
    (update-display ed)))

(defmacro defcommand (name command)
  `(setf (symbol-function ',name)
         (lambda () (execute-command ,command))))

(defcommand save-all "saveAll")

(defvar key-pressed-hook nil)

(in-package "COMMON-LISP-USER")
(use-package "J")

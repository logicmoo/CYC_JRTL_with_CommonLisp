;;; j.lisp

(in-package "J")

(export '(set-global-property
          reset-display
          log-debug
          add-hook
          invoke-hook
          update-display
          update-location-bar
          location-bar-cancel-input
          status
          defcommand
          execute-command
          open-file-hook
          buffer-activated-hook
          after-save-hook
          key-pressed-hook
          variable-value
          with-editor
          with-other-editor
          with-single-undo))

(defun set-global-property (&rest args)
  (let ((count (length args)) key value)
    (cond ((oddp count)
           (error "odd number of arguments to SET-GLOBAL-PROPERTY"))
          ((= count 2)
           (%set-global-property (string (first args)) (second args)))
          (t
           (do ((args args (cddr args)))
               ((null args) (values))
             (%set-global-property (string (first args)) (second args)))))))

(defun reset-display ()
  (jstatic "resetDisplay" "org.armedbear.j.Editor"))

(defun log-debug (control-string &rest args)
  (%log-debug (apply 'format nil control-string args)))

(defun update-display (&optional ed)
  (let ((method (jmethod "org.armedbear.j.Editor" "updateDisplay"))
        (ed (or ed (current-editor))))
    (jcall method ed)))

(defun update-location-bar (&optional ed)
  (let ((method (jmethod "org.armedbear.j.Editor" "updateLocation"))
        (ed (or ed (current-editor))))
    (jcall method ed)))

(defun location-bar-cancel-input ()
  (jstatic "cancelInput" "org.armedbear.j.LocationBar"))

(defun status (string &optional ed)
  (let ((method (jmethod "org.armedbear.j.Editor" "status" "java.lang.String"))
        (ed (or ed (current-editor))))
    (jcall method ed string)))

;; Internal.
(defun %execute-command (command &optional ed)
  (let ((method (jmethod "org.armedbear.j.Editor"
                         "executeCommand" "java.lang.String"))
        (ed (or ed (current-editor))))
    (jcall method ed command)
    (update-display ed)))

(defmacro defcommand (name &optional (command nil))
  (unless command
    (setf command (remove #\- (string `,name))))
  `(setf (symbol-function ',name)
         (lambda (&optional arg)
           (%execute-command (if arg
                                 (concatenate 'string ,command " " arg)
                                 ,command)))))

(defcommand execute-command)

;;; HOOKS
(defun add-hook (hook function)
  (when (symbolp hook)
    (unless (boundp hook) (set hook nil))
    (let ((hook-functions (symbol-value hook)))
      (unless (memq function hook-functions)
        (setq hook-functions (cons function hook-functions))
        (set hook hook-functions)))))

(defun invoke-hook (hook &rest args)
  (when (symbolp hook)
    (unless (boundp hook) (set hook nil))
    (let ((hooks (symbol-value hook)))
      (dolist (function hooks)
        (apply function args)))))

(defvar open-file-hook nil)

(defvar buffer-activated-hook nil)

(defvar after-save-hook nil)

(defvar key-pressed-hook nil)

(defun variable-value (name &optional (kind :current) where)
  (%variable-value name kind where))

(defun set-variable-value (name kind &rest rest)
  (let (where new-value)
    (case (length rest)
      (1
       (setq where nil
             new-value (car rest)))
      (2
       (setq where (car rest)
             new-value (cadr rest)))
      (t
       (error 'program-error "SET-VARIABLE-VALUE: wrong number of arguments")))
    (%set-variable-value name kind where new-value)))

(defsetf variable-value set-variable-value)

(defsetf current-editor %set-current-editor)

(defmacro with-editor (editor &rest forms)
  (let ((old-editor (gensym)))
  `(let ((,old-editor (current-editor)))
     (unwind-protect
      (progn
        (setf (current-editor) ,editor)
        ,@forms)
      (update-display ,editor)
      (setf (current-editor) ,old-editor)))))

(defmacro with-other-editor (&rest forms)
  (let ((old-editor (gensym))
        (other-editor (gensym)))
    `(let ((,old-editor (current-editor))
           (,other-editor (other-editor)))
       (unless ,other-editor
         (error "there is no other editor"))
       (unwind-protect
        (progn
          (setf (current-editor) ,other-editor)
          ,@forms)
        (update-display ,other-editor)
        (setf (current-editor) ,old-editor)))))

(defmacro with-single-undo (&rest forms)
  (let ((info (gensym)))
    `(let ((,info (begin-compound-edit)))
       (unwind-protect
        (progn ,@forms)
        (end-compound-edit ,info)))))

(in-package "COMMON-LISP-USER")
(use-package "J")

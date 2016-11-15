(in-package :extensions)

(defvar *gui-backend* :swing)

(defun init-gui ()
  "Dummy function used to autoload this file"
  t)

(defun make-dialog-prompt-stream ()
  (%make-dialog-prompt-stream *gui-backend*))

(defgeneric %make-dialog-prompt-stream (gui-backend))

(defmethod %make-dialog-prompt-stream ((gui-backend (eql :swing)))
  (java:jnew (java:jconstructor
	      "com.cyc.tool.subl.jrtl.nativeCode.commonLisp.java.swing.SwingDialogPromptStream")))

(defmethod %make-dialog-prompt-stream ((gui-backend (eql :awt)))
  (java:jnew (java:jconstructor
	      "com.cyc.tool.subl.jrtl.nativeCode.commonLisp.java.awt.AwtDialogPromptStream")))
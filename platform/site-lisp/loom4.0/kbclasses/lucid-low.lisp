;;; -*- Mode: LISP; Syntax: Common-lisp; Package: USER; Base: 10. -*-

;;; LUCID-LOW.LISP (KBCLASSES)


(in-package 'KBCLASSES)

(import '( 
	  CLOS::call-next-method CLOS::operate-on-system CLOS::find-class
	  CLOS::change-class
	  CLOS::print-object CLOS::class-name 
	  CLOS::class-instance-slots CLOS::slotd-name CLOS::class-prototype
	  CLOS::slot-value CLOS::defmethod-setf 
	  CLOS::class-direct-methods CLOS::find-object CLOS::class-slots
	  ) 
	'KBCLASSES)

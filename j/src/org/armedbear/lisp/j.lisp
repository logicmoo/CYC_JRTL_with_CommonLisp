;;; j.lisp

(unless (find-package "J")
  (make-package "J"))

(in-package "J")
(use-package "JAVA")

(export '(global-map-key global-unmap-key map-key-for-mode unmap-key-for-mode
          set-global-property))

(defun global-map-key (key command)
  (jstatic "globalMapKey" "org.armedbear.j.API" key command))

(defun global-unmap-key (key)
  (jstatic "globalUnmapKey" "org.armedbear.j.API" key))

(defun map-key-for-mode (key command mode)
  (jstatic "mapKeyForMode" "org.armedbear.j.API" key command mode))

(defun unmap-key-for-mode (key mode)
  (jstatic "mapKeyForMode" "org.armedbear.j.API" key mode))

(defun set-global-property (key value)
  (jstatic "setGlobalProperty" "org.armedbear.j.API" key value))

(in-package "COMMON-LISP-USER")
(use-package "J")

(in-package :CL-USER)
;; :cd g:/opt/CYC_JRTL_with_CommonLisp/platform/site-lisp/
;;  (load "G:/opt/CYC_JRTL_with_CommonLisp/platform/site-lisp/larkc-home.lisp")
;; (load "/opt/CYC_JRTL_with_CommonLisp/platform/site-lisp/larkc-home.lisp")

#-clisp 
#-prolog-lisp-Ignored
(defmethod print-object ((obj class) stream)
  (prin1 "#." stream)
  (write `(find-class ',(class-name obj)) :stream stream :readably t))
;; (let ((*print-readably* t)) (prin1-to-string (find-class 'symbol)))

(defvar *site-lisp* (merge-pathnames "" (directory-namestring *load-truename*)))
(setq *default-pathname-defaults* *site-lisp*)

;; Dmiles added #'jvm:set-system-property 6/6/2019
#+abcl (jvm:set-system-property "user.home" (namestring *site-lisp*))
#+abcl (sys::setenv "HOME" (namestring *site-lisp*))
#+abcl (setq  *site-lisp* (user-homedir-pathname))

(print `((user-homedir-pathname) => ,(user-homedir-pathname)))
(print `(*site-lisp* => ,*site-lisp*))
(force-output)

#+abcl (require :abcl-contrib)
; #+abcl (require :jss)
(require :asdf)
#+:ALLEGRO (require :jlinker)
#+:ALLEGRO (pushnew :acl *features*)
(force-output)

;;; The following lines added by ql:add-to-init-file:
#-quicklisp
(let ((quicklisp-init (merge-pathnames "quicklisp/setup.lisp" *site-lisp* )))
  (when (probe-file quicklisp-init)
    (load quicklisp-init)))

#+quicklisp
(pushnew *site-lisp* ql:*local-project-directories*)


#+asdf
(asdf:initialize-source-registry
     `(:source-registry
        (:tree ,(merge-pathnames "fiveam-asdf/" *site-lisp*))
        (:tree ,(merge-pathnames "fiveam/" *site-lisp*))

        (:tree ,(merge-pathnames "cusp/" *site-lisp*))
        (:tree ,(merge-pathnames "slime/" *site-lisp*))
        
        (:tree ,(merge-pathnames "pddl-tools/" *site-lisp*))
        (:tree ,(merge-pathnames "shop3/shop3/" *site-lisp*))
        
        (:tree ,(merge-pathnames "shop3/shop3/examples/openstacks-adl/" *site-lisp*))
        (:tree ,(merge-pathnames "shop3/shop3/examples/rovers/strips/" *site-lisp*))
        (:tree ,(merge-pathnames "shop3/shop3/examples/satellite/strips/" *site-lisp*))
        (:tree ,(merge-pathnames "shop3/shop3/shop3-theorem-prover.api/" *site-lisp*))
        (:tree ,(merge-pathnames "jnil/" *site-lisp*))
        (:tree ,(merge-pathnames "linj/" *site-lisp*))        
        (:tree ,(merge-pathnames "./" *site-lisp*))       
        
      :inherit-configuration))



#+quicklisp
(progn 
  ;;(ql:quickload "shop3")
  (ql:quickload "fiveam")  
  (ql:quickload "pddl-utils")
  (ql:quickload "openstacks-problem-translator")
  (ql:quickload "shop3-thmpr-api")  
  ;; (ql:quickload "jnil")
 )

(asdf:operate 'asdf:load-op :prove)
(require 'jna)
(require 'jfli)
(require 'cffi)

#+Ignore (load "ytools/ytload/ytload")
#+Ignore (setq ytools::config-directory* "ytconfig/abcl/")
#+Ignore (setq ytools::ytload-directory* "ytools/ytload/")
#+Ignore (defun cl-user::mexpand-all (form &optional env) (values (ext::macroexpand-all form env) t t))
(princ "

(trace shop:find-plans)

(time (fiveam:run-all-tests))

")
#|


(require 'asdf)

:cd g:/opt/CYC_JRTL_with_CommonLisp/platform/site-lisp/
(load "larkc-home")

:cd jnil
(asdf:operate 'asdf:load-op :jnil) 
(time (jnil:translate-java-project "platform" "out2/" :common-lisp :overwrite-existing-p t))
(time (jnil:translate-java-project "exportL" "out1/" :common-lisp :overwrite-existing-p t))

(trace shop:find-plans)
(ql:quickload "shop3/test")

(time (fiveam:run-all-tests))


|#

;; (ql:quickload "swank")
;; (ql:quickload "swank.live")



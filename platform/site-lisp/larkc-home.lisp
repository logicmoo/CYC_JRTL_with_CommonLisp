(in-package :CL-USER)

;;  (load "/opt/CYC_JRTL_with_CommonLisp/platform/site-lisp/larkc-home.lisp")

#-prolog-lisp-Ignored
(defmethod print-object ((obj class) stream)
  (prin1 "#." stream)
  (write `(find-class ',(class-name obj)) :stream stream :readably t))
;; (let ((*print-readably* t)) (prin1-to-string (find-class 'symbol)))


;; Dmiles added #'jvm:set-system-property 6/6/2019
(defvar *site-lisp* (directory-namestring *load-truename*))
(jvm:set-system-property "user.home" (namestring *site-lisp*))
(sys::setenv "HOME" (namestring *site-lisp*))
(print `((user-homedir-pathname) => ,(user-homedir-pathname)))
(setq  *site-lisp* (user-homedir-pathname))
(force-output)

#+abcl (require :abcl-contrib)
; #+abcl (require :jss)
(require :asdf)
(force-output)

;;; The following lines added by ql:add-to-init-file:
#-quicklisp
(let ((quicklisp-init (merge-pathnames "quicklisp/setup.lisp" (user-homedir-pathname))))
  (when (probe-file quicklisp-init)
    (load quicklisp-init)))

#+quicklisp
(pushnew *site-lisp* ql:*local-project-directories*)


#+asdf
(asdf:initialize-source-registry
     `(:source-registry
        (:tree ,(merge-pathnames "fiveam-asdf/" *site-lisp*))
        (:tree  "~/fiveam/")
        
        (:tree ,(merge-pathnames "cusp/" *site-lisp*))
        (:tree ,(merge-pathnames "slime/" *site-lisp*))
        
        (:tree ,(merge-pathnames "pddl-tools/" *site-lisp*))
        (:tree ,(merge-pathnames "shop3/shop3/" *site-lisp*))
        (:tree ,(merge-pathnames "shop3/shop3/examples/openstacks-adl/" *site-lisp*))
        (:tree ,(merge-pathnames "shop3/shop3/examples/rovers/strips/" *site-lisp*))
        (:tree ,(merge-pathnames "shop3/shop3/examples/satellite/strips/" *site-lisp*))
        (:tree ,(merge-pathnames "shop3/shop3/shop3-theorem-prover.api/" *site-lisp*))        
        
      :inherit-configuration))



#+quicklisp
(progn 
  (ql:quickload "shop3")
  (ql:quickload "fiveam")
  (ql:quickload "pddl-utils")
  (ql:quickload "openstacks-problem-translator")
  (ql:quickload "shop3-thmpr-api")
  (ql:quickload "shop3/test"))
  
#+Ignore (load "ytools/ytload/ytload")
#+Ignore (setq ytools::config-directory* "ytconfig/abcl/")
#+Ignore (setq ytools::ytload-directory* "ytools/ytload/")
#+Ignore (defun cl-user::mexpand-all (form &optional env) (values (ext::macroexpand-all form env) t t))



;; (ql:quickload "swank")
;; (ql:quickload "swank.live")




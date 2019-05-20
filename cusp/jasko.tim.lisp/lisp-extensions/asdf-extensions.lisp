(defpackage :com.gigamonkeys.asdf-extensions 
  (:use :cl)
  (:export :register-source-directory :register-source-directories :get-installed-packages))

(in-package :com.gigamonkeys.asdf-extensions)

;;; Methods that need to be in the namespace before they are used:


(defun directory-pathname-p (p)
  "Is the given pathname the name of a directory? This function can
usefully be used to test whether a name returned by LIST-DIRECTORIES
or passed to the function in WALK-DIRECTORY is the name of a directory
in the file system since they always return names in `directory normal
form'."
  (flet ((component-present-p (value)
                              (and value (not (eql value :unspecific)))))
    (and 
     (not (component-present-p (pathname-name p)))
     (not (component-present-p (pathname-type p)))
     p)))


(defun pathname-as-directory (name)
  "Return a pathname reperesenting the given pathname in
`directory normal form', i.e. with all the name elements in the
directory component and NIL in the name and type components. Can
not be used on wild pathnames because there's not portable way to
convert wildcards in the name and type into a single directory
component. Returns its argument if name and type are both nil or
:unspecific."
  (let ((pathname (pathname name)))
    (when (wild-pathname-p pathname)
      (error "Can't reliably convert wild pathnames."))
    (if (not (directory-pathname-p name))
        (make-pathname 
         :directory (append (or (pathname-directory pathname) (list :relative))
                            (list (file-namestring pathname)))
         :name      nil
         :type      nil
         :defaults pathname)
        pathname)))


(defun directory-wildcard (dirname)
  (make-pathname 
   :name :wild
   :type #-clisp :wild #+clisp nil
   :defaults (pathname-as-directory dirname)))

;;; Method for finding ASD files that doesn't depend on symlinks.

(defvar *top-level-directories* ())

#|(defun sysdef-crawl-directories (system)
(let ((name (asdf::coerce-name system)))
(block found
(flet ((found-p (file)
(when (and
(equal (pathname-name file) name)
(equal (pathname-type file) "asd"))
(return-from found file))))
(dolist (dir *top-level-directories*)
(walk-directory dir #'found-p))))))|#

(defun register-source-directory (dir)
  (push (pathname-as-directory dir) asdf:*central-registry*)
  (push (pathname-as-directory dir) *top-level-directories*)
  (format nil "~a" dir) )

(defun register-source-directories (dirs)
  (mapcar #'com.gigamonkeys.asdf-extensions:register-source-directory dirs)
  *top-level-directories*)

;(push 'sysdef-crawl-directories *system-definition-search-functions* )

;;; Build FASLs into a implementation specific directory.

(defun make-relative (pathname)
  (make-pathname
   :directory (cons :relative (rest (pathname-directory pathname)))
   :defaults pathname))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Portable pathnames lib. Unfortunately we can't use ASDF to load it
;;; so we have to inline it here.

(defun list-directory (dirname)
  "Return a list of the contents of the directory named by dirname.
Names of subdirectories will be returned in `directory normal
form'. Unlike CL:DIRECTORY, LIST-DIRECTORY does not accept
wildcard pathnames; `dirname' should simply be a pathname that
names a directory. It can be in either file or directory form."
  (when (wild-pathname-p dirname)
    (error "Can only list concrete directory names."))
  
  (let ((wildcard (directory-wildcard dirname)))
    
    #+(or sbcl cmu lispworks)
    ;; SBCL, CMUCL, and Lispworks return subdirectories in directory
    ;; form just the way we want.
    (directory wildcard)
    
    #+openmcl
    ;; OpenMCl by default doesn't return subdirectories at all. But
    ;; when prodded to do so with the special argument :directories,
    ;; it returns them in directory form.
    (directory wildcard :directories t)
    
    #+allegro
    ;; Allegro normally return directories in file form but we can
    ;; change that with the :directories-are-files argument.
    (directory wildcard :directories-are-files nil)
    
    #+clisp
    ;; CLISP has a particularly idiosyncratic view of things. But we
    ;; can bludgeon even it into doing what we want.
    (nconc 
     ;; CLISP won't list files without an extension when :type is
     ;; wild so we make a special wildcard for it.
     (directory wildcard)
     ;; And CLISP doesn't consider subdirectories to match unless
     ;; there is a :wild in the directory component.
     (directory (clisp-subdirectories-wildcard wildcard)))
    
    #-(or sbcl cmu lispworks openmcl allegro clisp)
    (error "list-directory not implemented")))




(defun file-exists-p (pathname)
  "Similar to CL:PROBE-FILE except it always returns directory names
in `directory normal form'. Returns truename which will be in
`directory form' if file named is, in fact, a directory."
  
  #+(or sbcl lispworks openmcl)
  ;; These implementations do "The Right Thing" as far as we are
  ;; concerned. They return a truename of the file or directory if it
  ;; exists and the truename of a directory is in directory normal
  ;; form.
  (probe-file pathname)
  
  #+(or allegro cmu)
  ;; These implementations accept the name of a directory in either
  ;; form and return the name in the form given. However the name of a
  ;; file must be given in file form. So we try first with a directory
  ;; name which will return NIL if either the file doesn't exist at
  ;; all or exists and is not a directory. Then we try with a file
  ;; form name.
  (or (probe-file (pathname-as-directory pathname))
      (probe-file pathname))
  
  #+clisp
  ;; Once again CLISP takes a particularly unforgiving approach,
  ;; signalling ERRORs at the slightest provocation.
  
  ;; pathname in file form and actually a file      -- (probe-file file)      ==> truename
  ;; pathname in file form and doesn't exist        -- (probe-file file)      ==> NIL
  ;; pathname in dir form and actually a directory  -- (probe-directory file) ==> truename
  ;; pathname in dir form and doesn't exist         -- (probe-directory file) ==> NIL
  
  ;; pathname in file form and actually a directory -- (probe-file file)      ==> ERROR
  ;; pathname in dir form and actually a file       -- (probe-directory file) ==> ERROR
  (or (ignore-errors
       ;; PROBE-FILE will return the truename if file exists and is a
       ;; file or NIL if it doesn't exist at all. If it exists but is
       ;; a directory PROBE-FILE will signal an error which we
       ;; ignore.
       (probe-file (pathname-as-file pathname)))
      (ignore-errors
       ;; PROBE-DIRECTORY returns T if the file exists and is a
       ;; directory or NIL if it doesn't exist at all. If it exists
       ;; but is a file, PROBE-DIRECTORY will signal an error.
       (let ((directory-form (pathname-as-directory pathname)))
         (when (ext:probe-directory directory-form)
           directory-form))))
  
  
  #-(or sbcl cmu lispworks openmcl allegro clisp)
  (error "list-directory not implemented"))

#+clisp
(defun clisp-subdirectories-wildcard (wildcard)
  (make-pathname
   :directory (append (pathname-directory wildcard) (list :wild))
   :name nil
   :type nil
   :defaults wildcard))


(defun file-pathname-p (p)
  (unless (directory-pathname-p p) p))

(defun pathname-as-file (name)
  "Return a pathname representing the given pathname in `file form',
i.e. with the name elements in the name and type component. Can't
convert wild pathnames because of problems mapping wild directory
component into name and type components. Returns its argument if
it is already in file form."
  (let ((pathname (pathname name)))
    (when (wild-pathname-p pathname)
      (error "Can't reliably convert wild pathnames."))
    (if (directory-pathname-p name)
        (let* ((directory (pathname-directory pathname))
               (name-and-type (pathname (first (last directory)))))
          (make-pathname 
           :directory (butlast directory)
           :name (pathname-name name-and-type)
           :type (pathname-type name-and-type)
           :defaults pathname))
        pathname)))

(defun walk-directory (dirname fn &key directories (test (constantly t)))
  "Walk a directory invoking `fn' on each pathname found. If `test' is
supplied fn is invoked only on pathnames for which `test' returns
true. If `directories' is t invokes `test' and `fn' on directory
pathnames as well."
  (labels
    ((walk (name)
           (cond
             ((directory-pathname-p name)
              (when (and directories (funcall test name))
                (funcall fn name))
              (dolist (x (list-directory name)) (walk x)))
             ((funcall test name) (funcall fn name)))))
    (walk (pathname-as-directory dirname))))

(defun directory-p (name)
  "Is `name' the name of an existing directory."
  (let ((truename (file-exists-p name)))
    (and truename (directory-pathname-p name))))

(defun file-p (name)
  "Is `name' the name of an existing file, i.e. not a directory."
  (let ((truename (file-exists-p name)))
    (and truename (file-pathname-p name))))


(pushnew :com.gigamonkeys.asdf-extensions *features*)

;;;; added by SK
(defun get-asd-descriptions (xx)
  "With xx = (system-name, path-to-asd-file),
returns (:description :long-description) from defsystem"
  (handler-case
   (with-open-file (stream (second xx))
     (let ((docs 
            (ignore-errors (loop for x = (read stream) then (read stream)
                                 when (and (>= (length x) 2) 
                                           (equal (first x) 'defsystem)
                                           (equalp (string (second x)) (first xx))) 
                                 return (list (getf x :description)
                                              (getf x :long-description))))))
       (if docs 
           docs 
           '(nil nil))))
   ;; catch file-error conditions
   (file-error () '(nil nil))
   ;; catch any condition
   (condition () '(nil nil))
   ;; default/base condition type
   (t () '(nil nil))))

(defun get-doc-links (xx)
  "With xx = (system-name, path-to-asd-file),
finds links to possible documentation files"
  (list (list "readme" 
              (file-exists-p (make-pathname :name "readme" :type nil 
                                            :defaults xx)))
        (list "readme.html"
              (file-exists-p (make-pathname :name "readme" :type "html"
                                            :defaults xx)))
        (list "doc.html"
              (file-exists-p (make-pathname :name (pathname-name xx) 
                                            :type "html"
                                            :defaults xx)))
        (list "index.html"
              (file-exists-p (merge-pathnames #p"doc/index.html" xx)))))

(defun get-asd-docs (xx h)
  "With xx = (system-name path-to-asd-file),
and h - hash table of description obtained from specials file (see function
get-specials-hash), 
returns a list (system-name, list-of-doc-strings, list-of-doc-links)"
  (list (first xx)
        (append (list (gethash (first xx) h))
                (get-asd-descriptions xx))
        (get-doc-links (second xx))))

(defun get-specials-hash ()
  "Reads library descriptions from specials.lisp file.
Returns hash table: system-name -> description-string"
  (let ((h (make-hash-table :test 'equalp)))
    (mapcar #'(lambda (xx) (setf (gethash (string (first xx)) h) (second xx))) 
            (eval (let ((specials-file (some #'(lambda (path) 
                                                 (let ((x (merge-pathnames path "cusp-specials.lisp"))) 
                                                   (if (file-exists-p x) x nil))) 
                                             *top-level-directories*)))
                    (when specials-file
                      (with-open-file (stream specials-file)
                        (ignore-errors (loop for x = (read stream) then (read stream)
                                             when (and (>= (length x) 3)
                                                       (equal (first x) 'defvar)
                                                       (equal (second x) '*lib-designators*))
                                             return (third x)))))))) h))

(defun *get-installed-packages ()
  "Gets all installed systems and their infos"
  (mapcar #'(lambda (x) (get-asd-docs x (get-specials-hash)))
          (sort (mapcan #'(lambda (dir) 
                            (mapcan #'(lambda (x)
                                        (when (equalp (pathname-type x) "asd")
                                          (list (list (pathname-name x) x)))) 
                                    (list-directory dir)))
                        *top-level-directories*)
                #'string-lessp :key #'first)))

;;from On Lisp
(defun memoize (fn)
  (let ((cache (make-hash-table :test #'equal)))
    #'(lambda (&rest args)
        (multiple-value-bind (val win) (gethash args cache)
          (if win
              val
              (setf (gethash args cache)
                    (apply fn args)))))))

(let ((memoize-fn (memoize #'*get-installed-packages)))
  (defun get-installed-packages ()
    (funcall memoize-fn))) 
 


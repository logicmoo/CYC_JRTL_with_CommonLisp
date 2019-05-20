(in-package :mysql)

#+lispworks
(progn
  (setq c (fli:allocate-foreign-object :type 'mysql-mysql))
  (format t "~&Size MYSQL structure: ~d" (fli:pointer-element-size c)))
#+allegro
(progn
  (setq c (ff:allocate-fobject 'mysql-mysql :foreign))
  (format t "~&Size MYSQL structure: ~A" c))


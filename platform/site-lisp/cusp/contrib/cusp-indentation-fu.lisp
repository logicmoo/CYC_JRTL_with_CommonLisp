
(in-package :cusp)

(defslimefun arglist-indentation (arglist)
  (with-buffer-syntax ()
    (macro-indentation (from-string arglist))))

(provide :cusp-indentation-fu)

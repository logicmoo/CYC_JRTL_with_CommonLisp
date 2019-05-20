#|
exec sbcl --noinform --load $0 --end-toplevel-options "$@"
|#
(handler-case
	(progn
		(require '#:asdf)	
		(pushnew :hunchentoot-no-ssl *features*)	
		(dolist (dir
		    (directory
		        (merge-pathnames "site/*/"
		            (sb-ext:posix-getenv "SBCL_HOME"))))
    				(pushnew dir asdf:*central-registry*))
		(require :hunchentoot)
		(asdf:operate 'asdf:compile-op 'ghost-trinity)
		(require :ghost-trinity)
		(hunchentoot:start-server :port 9980)
		(quit))
	(error (e)
		(progn 
			(format t "~%Exiting [~a]~%" e)
			(quit))))

						

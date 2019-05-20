;;;; Copyright (c) 2004-2006 David Lichteblau <david@lichteblau.com>
;;;; Lizenz: (L)LGPL
;;;;
;;;; Urspruenglicher Autor: David Lichteblau.
;;;; Aenderungen durch knowledgeTools GmbH.

;;;; http://www.pkware.com/business_and_developers/developer/popups/appnote.txt
;;;; (http://www.pkware.com/company/standards/appnote/)

(in-package :zip)

(defun make-byte-array (n)
  (make-array n :element-type '(unsigned-byte 8)))

(defun get-short (array offset)
  (logior (elt array offset)
	  (ash (elt array (1+ offset)) 8)))

(defun (setf get-short) (newval array offset)
  (setf (elt array (+ offset 0)) (logand newval #xff))
  (setf newval (ash newval -8))
  (setf (elt array (+ offset 1)) (logand newval #xff))
  newval)

(defun get-int (array offset)
  (logior (elt array offset)
	  (ash (elt array (+ offset 1)) 8)
	  (ash (elt array (+ offset 2)) 16)
	  (ash (elt array (+ offset 3)) 24)))

(defun (setf get-int) (newval array offset)
  (setf (elt array (+ offset 0)) (logand newval #xff))
  (setf newval (ash newval -8))
  (setf (elt array (+ offset 1)) (logand newval #xff))
  (setf newval (ash newval -8))
  (setf (elt array (+ offset 2)) (logand newval #xff))
  (setf newval (ash newval -8))
  (setf (elt array (+ offset 3)) (logand newval #xff))
  newval)

(defmacro define-record (constructor
			 (&key (length #-clisp (gensym) #+clisp (gentemp)))
			 &rest fields)
  `(progn
     (defconstant ,length
	 ,(loop
	      for (nil type) in fields
	      sum (ecase type (:int 4) (:short 2))))
     (defun ,constructor (&optional s)
       (let ((bytes (make-byte-array ,length)))
	 (when s
           (read-sequence bytes s))
	 bytes))
     ,@(loop
	   for (name type) in fields
	   for offset = 0 then (+ offset length)
	   for length = (ecase type (:int 4) (:short 2))
	   for reader = (ecase type (:int 'get-int) (:short 'get-short))
	   unless (eq name :dummy)
	   append `((defun ,name (r)
                      (,reader r ,offset))
                    (defun (setf ,name) (newval r)
                      (setf (,reader r ,offset) newval))))))

(define-record make-end-header (:length +end-header-length+)
  (end/signature :int)
  (end/this-disc :short)
  (end/central-directory-disc :short)
  (end/disc-files :short)
  (end/total-files :short)
  (end/central-directory-size :int)
  (end/central-directory-offset :int)
  (end/comment-length :short))

(define-record make-directory-entry ()
  (cd/signature :int)
  (cd/version-made-by :short)
  (cd/version-needed-to-extract :short)
  (cd/flags :short)
  (cd/method :short)
  (cd/time :short)
  (cd/date :short)
  (cd/crc :int)
  (cd/compressed-size :int)
  (cd/size :int)
  (cd/name-length :short)
  (cd/extra-length :short)
  (cd/comment-length :short)
  (cd/disc-number :short)
  (cd/internal-attributes :short)
  (cd/external-attributes :int)
  (cd/offset :int))

(define-record make-local-header ()
  (file/signature :int)
  (file/version-needed-to-extract :short)
  (file/flags :short)
  (file/method :short)
  (file/time :short)
  (file/date :short)
  (file/crc :int)
  (file/compressed-size :int)
  (file/size :int)
  (file/name-length :short)
  (file/extra-length :short))

(define-record make-data-descriptor ()
  (data/crc :int)
  (data/compressed-size :int)
  (data/size :int))

(defun update-crc (crc buf &optional (end (length buf)))
  (multiple-value-bind (high low)
      (salza-deflate:crc32 (logxor (ldb (byte 16 16) crc) #xffff)
			   (logxor (ldb (byte 16 00) crc) #xffff)
			   buf
			   end)
    (logior (ash (logxor high #xffff) 16) (logxor low #xffff))))

(defun compress (input output)
  (let ((nin 0)
	(nout 0)
	(crc 0))
    (flet ((flush-stream (zlib-stream)
	     (let ((start (if (zerop nout) 2 0))
		   (end (salza:zlib-stream-position zlib-stream)))
	       (write-sequence (salza::zlib-stream-buffer zlib-stream)
			       output
			       :start start
			       :end end)
	       (incf nout (- end start))
	       (setf (salza:zlib-stream-position zlib-stream) 0))))
      (let* ((input-buffer (make-array 8192 :element-type '(unsigned-byte 8)))
	     (output-buffer (make-array 8192 :element-type '(unsigned-byte 8)))
	     (zlib-stream (salza:make-zlib-stream output-buffer
						  :callback #'flush-stream)))
	(loop
	  (let ((end (read-sequence input-buffer input)))
            (cond
              ((plusp end)
                (salza:zlib-write-sequence input-buffer zlib-stream :end end)
                (incf nin end)
                (setf crc (update-crc crc input-buffer end)))
              (t
                (salza:finish-zlib-stream zlib-stream)
                (return (values nin nout crc))))))))))

(defun store (in out)
  "Copy uncompressed bytes from IN to OUT and return values like COMPRESS."
  (let ((buf (make-array 8192
                         :initial-element 0
                         :element-type '(unsigned-byte 8)))
        (ntotal 0)
        (crc 0))
    (loop
        for n = (read-sequence buf in :end (length buf))
        until (zerop n)
        do
          (write-sequence buf out :end n)
          (incf ntotal n)
          (setf crc (update-crc crc buf n)))
    (values ntotal ntotal crc)))

(defun seek-to-end-header (s)
  (let* ((len (+ 65536 +end-header-length+))
	 (guess (max 0 (- (file-length s) len))))
    (file-position s guess)
    (let ((v (make-byte-array (min (file-length s) len))))
      (read-sequence v s)
      (let ((n (search #(80 75 5 6) v :from-end t)))
	(unless n
	  (error "end of central directory header not found"))
	(file-position s (+ guess n))))))

(defstruct zipfile
  stream
  entries
  external-format)

(defstruct zipfile-entry
  name
  stream
  offset
  size
  compressed-size
  comment)

(defstruct zipwriter
  stream
  head
  tail
  external-format)

(defstruct zipwriter-entry
  name
  position
  header)

(defun read-entry-object (s external-format)
  (let* ((header (make-directory-entry s))
	 (name (make-array (cd/name-length header)
                           :element-type '(unsigned-byte 8)))
	 (comment
	  (when (plusp (cd/comment-length header))
	    (make-array (cd/comment-length header)
			:element-type '(unsigned-byte 8)))))
    (assert (= (cd/signature header) #x02014b50))
    (read-sequence name s)
    (setf name (octets-to-string name external-format))
    (file-position s (+ (file-position s) (cd/extra-length header)))
    (when comment
      (read-sequence comment s)
      (setf comment (octets-to-string comment external-format)))
    (make-zipfile-entry :name name
			:stream s
			:offset (cd/offset header)
			:size (cd/size header)
			:compressed-size (cd/compressed-size header)
			:comment comment)))

(defun open-zipfile
    (pathname &key (external-format (default-external-format)))
  (let* ((s (open pathname
                  #-allegro :element-type
                  #-allegro '(unsigned-byte 8))))
    (unwind-protect
	(progn
	  (seek-to-end-header s)
	  (let* ((end (make-end-header s))
		 (n (end/total-files end))
		 (entries (make-hash-table :test #'equal))
		 (zipfile (make-zipfile :stream s
                                        :entries entries
                                        :external-format external-format)))
	    (file-position s (end/central-directory-offset end))
	    (dotimes (x n)
	      (let ((entry (read-entry-object s external-format)))
		(setf (gethash (zipfile-entry-name entry) entries) entry)))
	    #+sbcl (let ((s s)) (sb-ext:finalize zipfile (lambda ()(close s))))
	    (setf s nil)
	    zipfile))
      (when s
	(close s)))))

(defgeneric close-zipfile (zipfile))
(defgeneric get-zipfile-entry (name zipfile))
(defgeneric zipfile-entry-contents (entry &optional stream))

(defmethod close-zipfile ((zipfile zipfile))
  (close (zipfile-stream zipfile)))

(defmethod get-zipfile-entry (name (zipfile zipfile))
  (gethash name (zipfile-entries zipfile)))

(defun write-zipentry
    (z name data &key (file-write-date (file-write-date data)))
  (setf name (substitute #\/ #\\ name))
  (let* ((s (zipwriter-stream z))
         (header (make-local-header))
         (utf8-name (string-to-octets name (zipwriter-external-format z)))
         (entry (make-zipwriter-entry
                 :name name
                 :position (file-position s)
                 :header header)))
    (setf (file/signature header) #x04034b50)
    (setf (file/version-needed-to-extract header) 2) ;XXX ist das 2.0?
    (setf (file/flags header) 8)        ;bit 3: descriptor folgt nach daten
    (setf (file/method header) 8)
    (multiple-value-bind (s min h d m y)
        (decode-universal-time
         (or file-write-date (encode-universal-time 0 0 0 1 1 1980 0)))
      (setf (file/time header)
            (logior (ash h 11) (ash min 5) (ash s -1)))
      (setf (file/date header)
            (logior (ash (- y 1980) 9) (ash m 5) d)))
    (setf (file/compressed-size header) 0)
    (setf (file/size header) 0)
    (setf (file/name-length header) (length utf8-name))
    (setf (file/extra-length header) 0)
    (setf (zipwriter-tail z)
          (setf (cdr (zipwriter-tail z)) (cons entry nil)))
    (write-sequence header s)
    (write-sequence utf8-name s)
    (let ((descriptor (make-data-descriptor)))
      (multiple-value-bind (nin nout crc)
          (compress data s)
        (setf (data/crc descriptor) crc)
        (setf (data/compressed-size descriptor) nout)
        (setf (data/size descriptor) nin)
        ;; record same values for central directory
        (setf (file/crc header) crc)
        (setf (file/compressed-size header) nout)
        (setf (file/size header) nin)) 
      (write-sequence descriptor s))
    name))

(defun write-central-directory (z)
  (let* ((s (zipwriter-stream z))
         (pos (file-position s))
         (n 0))
    (dolist (e (cdr (zipwriter-head z)))
      (incf n)
      (let ((header (zipwriter-entry-header e))
            (entry (make-directory-entry)))
        (setf (cd/signature entry) #x02014b50)
        (setf (cd/version-made-by entry) 20) ;version 2.0, fat
        (setf (cd/version-needed-to-extract entry)
              (file/version-needed-to-extract header))
        (setf (cd/flags entry) (file/flags header))
        (setf (cd/method entry) (file/method header))
        (setf (cd/time entry) (file/time header))
        (setf (cd/date entry) (file/date header))
        (setf (cd/crc entry) (file/crc header))
        (setf (cd/compressed-size entry) (file/compressed-size header))
        (setf (cd/size entry) (file/size header))
        (setf (cd/name-length entry) (file/name-length header))
        (setf (cd/extra-length entry) (file/extra-length header))
        (setf (cd/comment-length entry) 0)
        (setf (cd/disc-number entry) 0) ;XXX ?
        (setf (cd/internal-attributes entry) 0)
        (setf (cd/external-attributes entry) 0) ;XXX directories 
        (setf (cd/offset entry) (zipwriter-entry-position e))
        (write-sequence entry s)
        (write-sequence
         (string-to-octets (zipwriter-entry-name e)
			   (zipwriter-external-format z))
         s)))
    (let ((end (make-end-header)))
      (setf (end/signature end) #x06054b50)
      (setf (end/this-disc end) 0)      ;?
      (setf (end/central-directory-disc end) 0) ;?
      (setf (end/disc-files end) n)
      (setf (end/total-files end) n)
      (setf (end/central-directory-size end) (- (file-position s) pos))
      (setf (end/central-directory-offset end) pos)
      (setf (end/comment-length end) 0)
      (write-sequence end s))))

(defmethod zipfile-entry-contents ((entry zipfile-entry) &optional stream)
  (let ((s (zipfile-entry-stream entry))
	header)
    (file-position s (zipfile-entry-offset entry))
    (setf header (make-local-header s))
    (assert (= (file/signature header) #x04034b50))
    (file-position s (+ (file-position s)
			(file/name-length header)
			(file/extra-length header)))
    (let ((in (make-instance 'truncating-stream
                :input-handle s
                :size (zipfile-entry-compressed-size entry)))
          (outbuf nil)
          out)
      (if stream
          (setf out stream)
          (setf outbuf (make-byte-array (zipfile-entry-size entry))
                out (make-buffer-output-stream outbuf)))
      (ecase (file/method header)
        (0 (store in out))
        (8 (inflate in out)))
      outbuf)))

(defmacro with-zipfile ((file pathname &key external-format) &body body)
  `(let ((,file (open-zipfile ,pathname
                              ,@(when external-format
                                  `(:external-format ,external-format)))))
     (unwind-protect
	 (progn ,@body)
       (close-zipfile ,file))))

(defun make-zipfile-writer
    (pathname &key (if-exists :error)
                   (external-format (default-external-format)))
  (let ((c (cons nil nil)))
    (make-zipwriter
     :stream (open pathname
		   :direction :output
		   :if-exists if-exists
		   :element-type '(unsigned-byte 8))
     :external-format external-format
     :head c
     :tail c)))

(defun close-zipfile-writer (z)
  (write-central-directory z)
  (close (zipwriter-stream z)))

(defmacro with-output-to-zipfile
    ((var pathname &key (if-exists :error)) &body body)
  `(let ((,var (make-zipfile-writer ,pathname :if-exists ,if-exists)))
     (unwind-protect
	 (progn ,@body)
       (close-zipfile-writer ,var))))

(defmacro do-zipfile-entries ((name entry zipfile) &body body)
  (setf name (or name (gensym)))
  (setf entry (or entry (gensym)))
  `(block nil
     (maphash (lambda (,name ,entry)
		(declare (ignorable ,name ,entry))
		,@body)
	      (zipfile-entries ,zipfile))))

(defun unzip (pathname target-directory &key (if-exists :error) verbose)
  ;; <Xof> "When reading[1] the value of any pathname component, conforming
  ;;       programs should be prepared for the value to be :unspecific."
  (when (set-difference (list (pathname-name target-directory)
                              (pathname-type target-directory))
                        '(nil :unspecific))
    (error "pathname not a directory, lacks trailing slash?"))
  (with-zipfile (zip pathname)
    (do-zipfile-entries (name entry zip)
      (let ((filename (merge-pathnames name target-directory)))
        (ensure-directories-exist filename)
        (unless (char= (elt name (1- (length name))) #\/)
          (ecase verbose
            ((nil))
            ((t) (write-string name) (terpri))
            (:dots (write-char #\.)))
          (force-output)
          (with-open-file
              (s filename :direction :output :if-exists if-exists
               :element-type '(unsigned-byte 8))
            (zipfile-entry-contents entry s)))))))

(defun %directoryp (pathname)
  #+allegro (excl:file-directory-p pathname)
  #+lispworks (lispworks:file-directory-p pathname)
  #+clisp (ignore-errors
	   (ext:probe-directory
	    (concatenate 'string (princ-to-string pathname) "/")))
  #-(or lispworks allegro clisp)
  (and (null (pathname-name pathname))
       (null (pathname-type pathname))))

(defun %directory (d)
  #+allegro (directory d :directories-are-files nil)
  #+clisp (append (directory (concatenate 'string (princ-to-string d) "/*/"))
		  (directory (concatenate 'string (princ-to-string d) "/*")))
  #-(or allegro clisp) (directory d))

(defun %file-write-date (f)
  #+clisp (posix:file-stat-mtime (posix:file-stat f))
  #-clisp (file-write-date f))

(defun %pathname-for-directory (f)
  #+(or allegro clisp) f
  #-(or allegro clisp) (make-pathname :name :wild :type :wild :defaults f))

(defun %directory-namestring (d)
  #+clisp (directory-namestring
	   (truename (concatenate 'string (princ-to-string d) "/")))
  #-clisp (directory-namestring d))

(defun zip (pathname source-directory &key (if-exists :error))
  (let ((base (%directory-namestring (merge-pathnames source-directory))))
    (with-output-to-zipfile (zip pathname :if-exists if-exists)
      (labels ((recurse (d)
                 (dolist (f (%directory d))
                   (cond
                     ((%directoryp f)
                       (write-zipentry
                        zip
                        (enough-namestring (namestring f) base)
                        (make-concatenated-stream)
                        :file-write-date (%file-write-date f))
                       (recurse (%pathname-for-directory f)))
                     ((or (pathname-name f) (pathname-type f))
                       (with-open-file (s f :element-type '(unsigned-byte 8))
                         (write-zipentry
                          zip
                          (enough-namestring (namestring f) base)
                          s)))))))
        (recurse source-directory)))))

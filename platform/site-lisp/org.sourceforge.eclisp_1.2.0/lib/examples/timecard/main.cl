

(in-package :user)

;;;JNI - marker for changes for JNI interface

(eval-when (compile load eval) 
  (require :jlinker)
  (use-package :net.jlinker)
  #+mswindows (require :res)
  )

;; To run:
;;
;; :cl main
;; (main)
;;
;; To run as a self-starting application:
;;
;; acl -L ljrun.cl -- -tcroot <time-data-directory>
;;
;; Required files (in <time-data-directory>):
;;
;;   timecode.cl    -- copy from this directory
;;   timenick.cl    -- copy (and modify as desired)
;;   timestmp.init  -- user configuration (modify after first run)
;;   timestmp.ini   -- sample configuration (copied to timestmp.init)
;;
;; Working files:
;;   timestmp.new     timestmp.old    -- timecode log
;;   timecard.txt   -- formatted timecard output

;;; TO DO List:

;;; ??? edit menu: fill to now
;;; ??? send summary to clipboard
;;; ??? remember size of small window

(defvar *jtc-version* (list 4 1 2))

(defvar *time-root* "./") ;;   set from command line -- -tcroot
(defvar *time-nicknames* nil)  ;; from file timenick.cl
(defvar *time-code-list* nil)  ;; from file timecode.cl

(defvar *default-config* 
  ;; only properties listed here are retained
  `( :small-x      800
     :small-y        0
     :small-width  180
     :small-height  60
     :long-time     30
     :short-time     5
     :default-code  nil
     :cur-codes     ("misc-tech" "acl-product-support"  "acl-development" 
		     NIL 
		     "sa" "pto" "jury-duty" "holiday" "None")
     :codes       "timecode.cl"
     :nicks       "timenick.cl"
     :stamps      "timestmp.new"
     :backup      "timestmp.old"
     :card        "timecard.txt"
     :state       nil
     :line-1      nil
     ))

;; COLORS: Main window
;;   Color.lightGray border labels & buttons
;;   Color.green     selected minute  
;;   Color.white     Day title, now        
;;   Color.red       
;;   Color.yellow    modified code                 

;; COLORS: Summary window
;;   Color.lightGray border labels
;;   Color.green     background border
;;   Color.white     row & col values, grand total
;;   Color.red                       
;;   Color.yellow    row & col totals

;; COLORS: Small window
;;   Color.lightGray 
;;   Color.green     expired time
;;   Color.white     normal time
;;   Color.red       expiring time
;;   Color.yellow    


(defvar *main* nil)
(defvar *main-table* nil)

;;; 09-Sep-99  mm: strange awt bug? first call to Show seems to get lost
(defvar *first-time* t)
(defun query-awt (&optional restart &aux v)
  (if* (jlinker-query)
       then t
       elseif (null restart)
       then (return-from query-awt nil)
       elseif (consp (setf v (jlinker-init nil :classpath nil :verbose t)))
       then (return-from query-awt (values nil v)))
  (if* (eq *first-time* (jlinker-slot :notifier))
       then t
       else
       (setf *first-time* (jlinker-slot :notifier))
       (let (fr)
	 (or (jlookup :query-lookup) (jlookup :new))
	 (setf fr (jnew 
		   (jconstructor "java.awt.Frame" "java.lang.String") 
		   "FirstFrame"))
	 (jcall (jmethod "java.awt.Window" "show") fr)
	 (jcall (jmethod "java.awt.Frame" "dispose") fr))
       t))


(defun time-all ()
  (time (query-awt :restart))
  (time (main))
  )

(defun main-top () 
  (dribble "startup.log")
  (jlinker-end) (sleep 5)
  (format t "~&~%;;main-top: Start server.  ~%")
  (time (jlinker-init nil :classpath nil :preload nil))
  (jlookup :new)
  (format t "~&~%;;main-top: Fetch preload file.  ~%")
  (time (jlookup :preload t))
  (jlookup :query t)
  (query-awt :restart)
  (format t "~&~%;;main-top: Start application.  ~%")
  (time (main :new t :main #'(lambda () (jlinker-end) (exit 0))))
  (jlookup :query t)
  (dribble)
  )

(defun main-gen (&optional (dest "deliver/"))
  ;; This function creates a stand-alone timedemo application in the 
  ;;  dest directory.  This directory could be moved or copied to 
  ;; deliver the application to other sites.

  (excl:generate-application
 
   "timedemo"
   dest
   '(
     :seq2
     :list2
     :acldns
     :sock
     :jlinker
     "main.fasl"
     )
 
   :allow-existing-directory t
   :application-files
   '(
     "timecode.cl"
     "timenick.cl"
     "timestmp.ini"
     "timestmp.init"
     "jl-config.cl"
     "jlinker.jar"
     )
 
   :autoload-warning t
   :case-mode :case-sensitive-lower
   :include-clim nil
   :include-common-graphics nil
   :include-compiler nil
   :include-composer nil
   :include-debugger nil
   :include-devel-env nil
   :include-ide nil
   :include-tpl nil
   :include-xcw nil
   :init-file-names nil
   :load-local-names-info nil
   :load-source-file-info nil
   :load-xref-info nil
   :pll-file nil
   :read-init-files nil
 
   :restart-app-function 'gen-main
   :restart-init-function nil
 
   :show-window :minimized
 
   ;; :splash-from-file
 
 
   )

  #+mswindows
  (let ()
    (setf *default-pathname-defaults* (pathname (chdir dest)))
    (win::set-cmd-line "timedemo.exe" "temp.exe" "+cx")
    (delete-file "timedemo.exe")
    (rename-file-raw "temp.exe" "timedemo.exe")
    )
  
  )

(defun gen-main ()
  ;; This is the top-level function called in the stand-alone application.
  (load "jl-config.cl")
  (main :new t :main #'(lambda () (jlinker-end) (exit 0))
	))

(defun make-preload ()
  (format t "~&~%;;make-preload: Start server.  ~%")
  (time (jlinker-init nil :classpath nil :preload nil))

  (format t "~&~%;;make-preload: Re-compile source.  ~%")
  (jlookup :compile-time-lookup)
  (jlookup :new)
  (time (load (compile-file "main.cl")))

  (format t "~&~%;;make-preload: Gen preload file.  ~%")
  (time (jlookup :gen-preload t))
  (jlookup :query t)
  (jlookup :new)

  (format t "~&~%;;make-preload: Fetch preload file into blank table.  ~%")
  (time (jlookup :preload t))

  (format t "~&~%;;make-preload: Open application.  ~%")
  (time (main))
  (jlookup :query t)
  (gc) (gc) (gc)
  (discard-in-java :flush)
  (format t "~&~%;;make-preload: After gc and flush.   ~%")
  (jlookup :query t)

  (y-or-n-p 
   "~&~%;;make-preload: Open summary, then close all windows... ~%;; then say y:")

  (jlookup :query t)

  (format t "~&~%;;make-preload: Gen preload file again.  ~%")
  (time (jlookup :gen-preload t))
  (jlookup :query t)
  (jlookup :new)

  (format t "~&~%;;make-preload: Fetch preload file into blank table.  ~%")
  (time (jlookup :preload t))
  (jlookup :query t)

  (format t "~&~%;;make-preload: Re-open application.  ~%")
  (time (main))
  (jlookup :query t)
  )

(defun main (&optional (fl :new) (loop t) (state :main) cleanup
		       &aux ljq res ts)
  (when (and *main* (main-frame *main*) (query-awt))
    (warn "TimeCard may be running already.")
    (return-from main))
  (get-time-root)
  (multiple-value-setq (ljq res) (query-awt :restart))
  (when (null ljq) (return-from main res))
  (setf ts (get-universal-time))
  (setf *main-table* fl)
  (setf *main* (make-instance 'main-panel 
			      :timetable *main-table* :state state))
  (when loop
    (kill-process "TCLoop")
    (mp:process-run-function 
     "TCLoop"
     'main-process-body
     cleanup ts))
  *main*)

(defun main-process-body (cleanup ts &aux main (i 5) (all (list 0 0)) td)
  (with-java-environment   ;;;JNI
   (unwind-protect
       (loop
	(sleep 1)
	(setf main *main*)
	(when main 
	  (if (main-frame main)
	      (let (dlg dir file)
		(when (eq *main-table* :dlg)
		  (setf *main-table* :new)
		  (setf dlg (jnew (jconstructor "java.awt.FileDialog" 
						"java.awt.Frame" ;;;JNI (Not)
						"java.lang.String"
						"int")
				  (main-frame main) "Open TimeStamp File"
				  (jfield "java.awt.FileDialog" "LOAD")))
		  (jcall (jmethod "java.awt.Dialog" "show") dlg)
		  (setf dir (jcall "getDirectory" dlg))
		  (setf file (jcall "getFile" dlg))
		  (when (and dir file)
		    (main-exit main)
		    (setf *main* nil main nil)
		    (setf *main-table* 
			  (pathname (concatenate 'string dir file))))))
	    (return)))
	(when (null main)
	  (jlinker-end) 
	  (setf i 1))
	(decf i)
	(when (zerop i) (setf i 5))

	(when (eql i 5)
	  (unless (query-awt)
	    (when ts 
	      (setf td (- (get-universal-time) ts))
	      (setf td (round td 60))
	      (setf (getf all td) 
		    (+ 1 (or (getf all td) 0))))
		  
	    (kill-process "TimeCardWait")
	    (sleep 2)
	    (setf main nil *main* nil)

	    (when (null (query-awt :restart))
	      (return))
		  
	    (format t "~&;;; ~S~%" all)
	    (setf ts (get-universal-time))
	    ))
	(unless main
	  (format t "~&;;; Restarting main panel.~%")
	  (setf main 
		(ignore-errors 
		  "Ignore"
		  (make-instance 'main-panel :timetable *main-table*)))
	  (format t "~&;;; ~S~%" main)
	  (setf *main* main)
	  ))
     (format t "~&;;; Leaving TCLoop~%")
     (when cleanup (funcall cleanup))
     )))


;;; ----------------- main-panel

(defclass main-panel ()
  ((frame     :accessor main-frame)
   (menu-bar  :accessor main-menu-bar)
   (menus      :accessor main-menus :initform nil)
   (tool-bar  :accessor main-tool-bar)
   (tools     :accessor main-tools)
   (panel     :accessor main-panel)
   (playout   :accessor main-playout)
   (days      :accessor main-days)
   (ccodes    :accessor main-ccodes)      ;; current codes
   (ccode     :accessor main-ccode :initform nil)       ;; default code
   (cpopup    :accessor main-cpopup)
   (acodes    :accessor main-acodes)      ;; alpha list of all
   (ncodes    :accessor main-ncodes)      ;; numeric list of all
   (title     :accessor main-title)
   (timetable :accessor main-table :initarg :timetable)
   (today     :accessor main-today :initform nil) ;; index of today in timetable
   (current   :accessor main-current ;; index of currently showing day panel
	      :initform 0) 
   (summary     :accessor main-summary :initform nil)
   (sum-frame   :accessor main-sum-frame :initform nil)
   (sum-labels  :accessor main-sum-labels :initform nil)
   (sum-state   :accessor main-sum-state  :initform nil)

   (small       :accessor main-small)
   (small-label :accessor main-small-label :initform nil)
   (small-timer :accessor main-small-timer)
   (small-start :accessor main-small-start :initform nil)
   (small-state :accessor main-small-state :initform nil)
   
   (config      :initform nil) 
   (file-arg   :accessor main-file :initform nil)
   (hold       :accessor main-hold :initform nil) 
   (hold-label :accessor main-hold-label :initform nil) 
   (connection :initform nil :accessor main-connection)

   (color-light-grey :accessor color-light-grey)
   (color-green      :accessor color-green)
   (color-white      :accessor color-white)
   (color-red        :accessor color-red)
   (color-yellow     :accessor color-yellow)
   ))

(defmethod main-day-count ((main main-panel))
  (length (main-days main)))

(defmethod main-day-index ((main main-panel) index)
  (adjust-index index (main-current main) (main-day-count main)))

(defmethod main-day-button ((main main-panel) index)
  (first (aref (main-days main) (main-day-index main index))))

(defmethod main-day-panel ((main main-panel) index)
  (second (aref (main-days main) (main-day-index main index))))

(defmethod main-day-date ((main main-panel) index)
  (first (aref (main-table main) (main-day-index main index))))

(defmethod main-day-sheet ((main main-panel) index)
  (second (aref (main-table main) (main-day-index main index))))

(defmethod main-hour-count ((main main-panel) index)
  (length (main-day-sheet main index)))

(defmethod main-hour-index ((main main-panel) dx hour)
  (dotimes (i (main-hour-count main dx) nil)
    (when (eql hour (main-day-hour main dx i))
      (return i))))

(defmethod main-min-count ((main main-panel) index) 
  (declare (ignore index))
  10)

(defmethod main-day-hour ((main main-panel) day-index hour-index)
  (first (aref (main-day-sheet main day-index) 
	       (or hour-index 
		   (day-sel-hour (main-day-panel main day-index))))))

(defmethod main-day-col ((main main-panel) day-index hour-index)
  (second (aref (main-day-sheet main day-index) 
		(or hour-index 
		    (day-sel-hour (main-day-panel main day-index))))))

(defmethod main-day-code ((main main-panel) day-index hour-index min-index 
			  &optional new)
  (if new
      (setf (aref (main-day-col main day-index hour-index) 
		  (or min-index (day-sel-min (main-day-panel main day-index))))
	    new)
    (aref (main-day-col main day-index hour-index) 
	  (or min-index (day-sel-min (main-day-panel main day-index))))))


(defmethod initialize-instance :after ((self main-panel) &key 
				       timetable state
				       &allow-other-keys)
  (init-main self :timetable timetable :state state))

(defmethod init-main ((self main-panel) &key 
		      timetable state
		      &allow-other-keys)
  (setf (main-connection self) *jlinker-connection*)
  (let* (frame fr-layout menu-bar tool-panel date-bar tool-bar 
	       main-layout fr-main
	       (today   (nreverse (multiple-value-list (next-day 0))))
	       days ccodes 
	       #+ignore ncodes 
	       acodes tbmonth pbar fn)

    (read-time-config self)
    ;; *time-nicknames*  (admin-name nick ...)
    (load (merge-pathnames (main-config self :nicks) *time-root*))
    ;; *time-code-list*  randomly ordered list of administrative time codes
    (load (merge-pathnames (main-config self :codes) *time-root*))
    (case state 
      ((:small :summary) (main-config self :state state))
      (:main (main-config self :state nil)))
    (setf state (main-config self :state))
    
    (setf (main-hold self)
	  (case timetable
	    ;; autosave if default timetable
	    (:new nil)
	    ;; otherwise manual save
	    (otherwise 0)))
    (setf (main-file self) timetable)
    (multiple-value-setq (timetable fn)
      (parse-time-stamps self timetable))
    (setf  (main-table self) timetable
	   (main-days self) (setf days (make-array (length timetable)))
	   )

    (setf (color-light-grey self) (jfield "java.awt.Color" "lightGray"))
    (setf (color-green self)      (jfield "java.awt.Color" "green"))
    (setf (color-white self)      (jfield "java.awt.Color" "white"))
    (setf (color-red self)        (jfield "java.awt.Color" "red"))
    (setf (color-yellow self)     (jfield "java.awt.Color" "yellow"))

    (setf frame       (jnew (jconstructor "java.awt.Frame" "java.lang.String") 
		       (format nil "Time Card File ~A" fn)))
    (setf fr-layout   (jnew "java.awt.BorderLayout"))
    
    (setf menu-bar    (jnew "java.awt.MenuBar"))
    (setq tool-panel  (jnew "java.awt.Panel" (jnew "java.awt.GridLayout" 2 1)))
    (setf tool-bar    (jnew "java.awt.Panel"))
    (setf date-bar    (jnew "java.awt.Panel"))
    (setf main-layout (jnew "java.awt.CardLayout"))
    (setf fr-main     (jnew "java.awt.Panel"))
    (setf  (main-frame self) frame
	   (main-menu-bar self) menu-bar
	   (main-panel self) fr-main
	   (main-playout self) main-layout)
    
    (jstatic "addTo" 
	     "com.franz.jlinker.JLWindowAdapter" 
	     frame)
    (jregister-handler frame :windowClosing 
		      'main-window-closing
		      :data self)
    ;; Cannot use :windowIconified to go to Small window because
    ;;  when small is closed, main stays iconified
    ;; There seesm to be no DeIconify method in java.awt!  ???
    
    (jcall (jmethod "java.awt.Container" "setLayout" "java.awt.LayoutManager") 
	   frame fr-layout)

    (push (make-instance 'awt-menu
			 :label "File"
			 :items
			 `(("Open..."            main-menu-open      ,self)
			   ("ReloadDefaultFile"  main-menu-reload    ,self)
			   :separator 
			   ("DoNotAutoSave"      main-menu-no-auto   ,self)
			   ("SaveTimestamps"     main-menu-save      ,self)
			   ("ResumeAutoSave"     main-menu-do-auto   ,self)
			   :separator
			   ("ShowSummary"        main-menu-summ      ,self)
			   ("PrintTimeCard"      main-menu-print     ,self)

			   ;;;"??? send summary to clipboard"

			   :separator 
			   ("Print&Exit"         main-menu-prexit    ,self)
			   ("Exit"               main-menu-exit      ,self)
			   ))
	  (main-menus self))
    (jcall (jmethod "java.awt.MenuBar" "add" "java.awt.Menu") 
	   menu-bar (widget (car (main-menus self))) :ignore)
    (push (make-instance 'awt-menu
			 :label "Edit"
			 :items
			 `(("ReplaceTimeCode"    main-menu-rep       ,self)
			   ("Replace&Step"       main-menu-rstep      ,self)
			   ("Set to None"        main-menu-none      ,self)
			   ("None&Step"          main-menu-nstep     ,self)
			   :separator
			   ("Drop Code"          main-menu-drop      ,self)
			   ))
	  (main-menus self))
    (jcall (jmethod "java.awt.MenuBar" "add" "java.awt.Menu")
	   menu-bar (widget (car (main-menus self))) :ignore)

    (push (make-instance 'awt-menu
			 :label "Select"
			 :items
			 `(("Today"         main-menu-today    ,self)
			   ("Now"           main-menu-now      ,self)
			   :separator
			   ("Next Day"      main-menu-nextd    ,self)
			   ("Previous Day"  main-menu-prevd    ,self)
			   :separator
			   ("Next Hour"     main-menu-nexth    ,self)
			   ("Next Min"      main-menu-nextm    ,self)
			   ("Previous Min"  main-menu-prevm    ,self)
			   ("Previous Hour" main-menu-prevh    ,self)
			   :separator
			   ("Full Hour"     main-menu-full     ,self)
			   :separator
			   ("Deselect"      main-menu-desel    ,self)
			   ))
	  (main-menus self))
    (jcall (jmethod "java.awt.MenuBar" "add" "java.awt.Menu")
	   menu-bar (widget (car (main-menus self))) :ignore)

    (push (make-instance 'awt-menu
			 :label "LongTimer"
			 :items
			 `(("15 minutes"  main-menu-long ,(list self 15))
			   ("30 minutes"  main-menu-long ,(list self 30))
			   ("45 minutes"  main-menu-long ,(list self 45))
			   ("60 minutes"  main-menu-long ,(list self 60))
			   #+debug-only
			   ("2 minutes"   main-menu-long ,(list self 2))
			   ))
	  (main-menus self))
    (jcall (jmethod "java.awt.MenuBar" "add" "java.awt.Menu")
	   menu-bar (widget (car (main-menus self))) :ignore)

    (push (make-instance 'awt-menu
			 :label "ShortTimer"
			 :items
			 `(("5 minutes"  main-menu-short ,(list self 5))
			   ("4 minutes"  main-menu-short ,(list self 4))
			   ("3 minutes"  main-menu-short ,(list self 3))
			   ("10 minutes" main-menu-short ,(list self 10))
			   #+debug-only
			   ("1 minutes"  main-menu-short ,(list self 1))
			   ))
	  (main-menus self))
    (jcall (jmethod "java.awt.MenuBar" "add" "java.awt.Menu")
	   menu-bar (widget (car (main-menus self))) :ignore)

    (jcall (jmethod "java.awt.Frame" "setMenuBar" "java.awt.MenuBar")
	   frame menu-bar)

    (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
	   tool-panel tool-bar :ignore)
    (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
	   tool-panel date-bar :ignore)
    (jcall (jmethod "java.awt.Container" 
		  "add" "java.awt.Component" "java.lang.Object")
	   frame tool-panel "North")

    (jcall (jmethod "java.awt.Component" "setSize" "int" "int") frame  750 320)
    (jcall (jmethod "java.awt.Frame" "validate") frame)
    (jcall (jmethod "java.awt.Component" "setLocation" "int" "int") 
	   frame 100 100)
    (unless (eq state :small) (jcall (jmethod "java.awt.Window" "show") frame))
    
    (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
     tool-bar 
     (setf (main-hold-label self)
	   (make-label 
	    (case (main-hold self)
	      ((nil) "AutoSaveMode")
	      (0 "ManualSaveMode")
	      (otherwise "*Modified*"))))
     :ignore)
    (dotimes (i (main-day-count self))
      (let* ((tm (main-day-date self i)) b)
	(when (or (eql i 0)
		  (not (eql (second tm) tbmonth)))
	  (setf tbmonth (second tm))
	  (jcall (jmethod "java.awt.Container" "add" "java.awt.Component") 
	   date-bar 
	   (make-label
	    (second (multiple-value-list (apply #'pretty-date tm)))
	    3.0)
	   :ignore))
	(setf b (jnew (jconstructor "java.awt.Button" "java.lang.String") 
		 (if (equal tm today)
		     (make-label (list ">" (third tm) "<")
				 :text-only :concat)
		   (make-label (third tm) :text-only))))
	(jcall (jmethod 
		"com.franz.jlinker.JLActionListener" 
		"addTo" 
		"java.awt.Button") 
	       nil b)
	(jcall (jmethod "java.awt.Button" "setActionCommand" "java.lang.String")
	       b (format nil "~A" i))
	(jregister-handler b :actionPerformed 'day-button-action-performed :data self)
	(jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
	       date-bar b :ignore)
	(setf (aref days i) 
	      (list b (make-instance 'day-panel
				     :main self
				     :index i
				     :title (string-date tm))))
	(when (equal tm today)
	  (main-select-now self)
	  (setf (main-today self) i)
	  (setf (main-current self) i))))
    (unless (main-current self) 
      (setf (main-current self) (1- (main-day-count self))))
    (jcall (jmethod "java.awt.Container" "add" "java.awt.Component") 
     date-bar 
     (jnew (jconstructor "java.awt.Label" "java.lang.String") 
      (fourth 
       (multiple-value-list 
	(apply #'pretty-date (main-day-date self -1)))))
     :ignore)

    (jcall (jmethod "java.awt.Container" "setLayout" "java.awt.LayoutManager")
	   fr-main main-layout)
    
    ;; *time-code-list*  randomly ordered list of administrative time codes
    ;; *time-nicknames*  (admin-name nick ...)

    (setf (main-ccodes self) 
	  (setf ccodes (make-instance 'pull-down
				      :raw-data 
				      (let ((i -1))
					(mapcar #'(lambda (x)
						    (incf i)
						    (unless x
						      (setf pbar i))
						    x)
						(main-config self :cur-codes)))
				      :marked-row pbar
				      :key-fn #'(lambda (x) 
						  (or x "=========="))
				      :convert-fn #'time-nick
				      :select-fn 'main-pull1-select
				      :popup     'main-pull1-popup
				      :select-data self)))
    (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
	   tool-bar (widget ccodes) :ignore)
    (setf (main-cpopup self) (popup ccodes))
    (default-timecode self (or (main-config self :default-code) 'none))

    (setf (main-acodes self) 
	  (setf acodes (make-instance 'pull-down
				      :raw-data 
				      (sort (append *time-code-list* nil)
					    #'string-lessp :key #'car)
				      :key-fn #'first
				      :convert-fn #'time-nick
				      :select-fn 'main-pull2-select
				      :select-data self)))
    (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
	   tool-bar (widget acodes) :ignore)
    (jcall (jmethod "java.awt.Container" "add" "java.awt.Component") 
     tool-bar 
     (make-label (format nil "JTC:~{~A.~A.~A~}" *jtc-version*))
     :ignore)

    (let* ((gl (jnew "java.awt.GridLayout" 12 1))
	   (min-bar (jnew "java.awt.Panel" gl))
	   (lg  (color-light-grey self))
	   mn lb)
      (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
	     min-bar 
	     (setf lb (jnew (jconstructor "java.awt.Button" "java.lang.String") "ToSmall")) 
	     :ignore)
      (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color")
	     lb lg)
      (jcall (jmethod 
	      "com.franz.jlinker.JLActionListener" 
	      "addTo" 
	      "java.awt.Button") 
	     nil lb)
      (jregister-handler lb :actionPerformed 'small-button-action-performed
			 :data self)
      (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
	     min-bar 
	     (setf lb (jnew (jconstructor "java.awt.Button" "java.lang.String")
			    "NOW")) 
	     :ignore)
      (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") 
	     lb lg)
      (jcall (jmethod 
	      "com.franz.jlinker.JLActionListener" 
	      "addTo"
	      "java.awt.Button") 
	     nil lb)
      (jregister-handler lb :actionPerformed 'now-button-action-performed
			:data self)
      (dotimes (mr 10)
	(setf mn (* 6 mr))
	(jcall (jmethod "java.awt.Container" "add" "java.awt.Component") 
	 min-bar 
	 (setf lb (make-label
		   (format nil ":~2,'0D-~2,'0D" mn (+ mn 5))
		   :right))
	 :ignore)
	(jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color")
	       lb lg)
	)
      (jcall (jmethod "java.awt.Container" 
		    "add" "java.awt.Component" "java.lang.Object") 
	     frame min-bar "West"))
		      
    		    
    (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
	   frame fr-main :ignore)
    (jcall (jmethod "java.awt.Frame" "validate") frame)
    (unless (eq state :small) (jcall (jmethod "java.awt.Window" "show") frame))
    (fill-day self nil)

    (let* ((small               
	    ;;(jnew "java.awt.Window" frame)
	    (jnew (jconstructor "java.awt.Dialog" "java.awt.Frame"
			 "java.lang.String" "boolean")
		  frame "TimeCard" 
		  (make-immediate-object nil :boolean))
	    ;;(jnew (jconstructor "java.awt.Frame" "java.lang.String") "TimeCard")
	    )
	   (p (jnew "java.awt.Panel" (jnew "java.awt.GridLayout" 1 2)))
	   (label (make-label (time-nick (main-ccode self))))
	   (timer (make-label "..."))
	   #+ignore
	   (button (jnew (jconstructor "java.awt.Button" "java.lang.String") "Big"))
	   )
      (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") 
	     label (color-light-grey self))
      (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
	     p label :ignore)
      (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
	     p timer :ignore)

      (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
	     small p :ignore)
      (jcall (jmethod "java.awt.Component" "setLocation" "int" "int")
	     small (main-config self :small-x) (main-config self :small-y))
      (jcall (jmethod "java.awt.Component" "setSize" "int" "int") 
	     small (main-config self :small-width) 
	     (main-config self :small-height))
      (jcall (jmethod "java.awt.Dialog" "validate") small)
      (setf (main-small self) small)
      (setf (main-small-label self) label)
      (setf (main-small-timer self) timer)
      (jcall (jmethod "java.awt.Component" "add" "java.awt.PopupMenu")
	     small (main-cpopup self))

      (jstatic "addTo"  "com.franz.jlinker.JLMouseAdapter"    label)
      (jregister-handler label :mousePressed 'small-mouse-pressed    :data self)

      (jstatic "addTo"  "com.franz.jlinker.JLWindowAdapter"    small)
      (jregister-handler small :windowClosing 'small-window-closing  :data self)
      )

    (case state
      (:summary (time-summary-frame self nil nil))
      (:small   (fill-timecode self :begin))
      )

    self))

(defun main-window-closing (&rest x &aux (main (first x))) (main-exit main))

(defun main-menu-open (&rest x) (new-time-file (first x)))

(defun main-menu-reload (&rest x) (new-time-file (first x) :new))

(defun main-menu-no-auto (&rest x)
  (unless (main-hold (first x))
    (jcall (jmethod "java.awt.Label" "setText" "java.lang.String")
	   (main-hold-label (first x)) "ManSave")
    (setf (main-hold (first x)) 0)))

(defun main-menu-save (&rest x) (write-timestamps (first x)))

(defun main-menu-do-auto (&rest x)
  (when (eq :new (main-file (first x)))
    (setf (main-hold (first x)) nil)
    (jcall (jmethod "java.awt.Label" "setText" "java.lang.String")
	   (main-hold-label (first x)) "AutoSave")
    (write-timestamps (first x))))

(defun main-menu-summ (&rest x) (time-summary-frame (first x) nil nil))

(defun main-menu-print (&rest x) (time-summary-print (first x)))

(defun main-menu-prexit (&rest x)
  (time-summary-print (first x))
  (main-exit (first x)))

(defun main-menu-exit (&rest x) (main-exit (first x)))

(defun main-menu-rep (&rest x &aux (main (first x))) (set-cur-timecode main nil))

(defun main-menu-rstep (&rest x &aux (main (first x)))
  (set-cur-timecode main nil)
  (main-select-min main nil nil :next))

(defun main-menu-none (&rest x &aux (main (first x)))
				 (set-cur-timecode main 'none))

(defun main-menu-nstep (&rest x &aux (main (first x)))
  (set-cur-timecode main 'none)
  (main-select-min main nil nil :next))

(defun main-menu-drop (&rest x &aux (main (first x)))
  (delete-item (main-ccodes main) 0)
  (update-timelast main)
  (default-timecode main 0))

(defun main-menu-today (&rest x &aux (main (first x)))
  (fill-day main (main-today main)))

(defun main-menu-now (&rest x &aux (main (first x)))
  (main-select-now main)
  (fill-day main (main-today main)))

(defun main-menu-nextd (&rest x &aux (main (first x)))
  (fill-day main (main-day-index main :next)))

(defun main-menu-prevd (&rest x &aux (main (first x)))
  (fill-day main (main-day-index main :prev)))

(defun main-menu-nexth (&rest x &aux (main (first x)))
  (main-select-min main nil :next nil))

(defun main-menu-nextm (&rest x &aux (main (first x)))
  (main-select-min main nil nil :next))

(defun main-menu-prevm (&rest x &aux (main (first x)))
  (main-select-min main nil nil :prev))

(defun main-menu-prevh (&rest x &aux (main (first x)))
  (main-select-min main nil :prev nil))

(defun main-menu-full (&rest x &aux (main (first x)))
  (main-select-min main nil :full nil))

(defun main-menu-desel (&rest x &aux (main (first x)))
  (main-deselect main nil))

(defun main-menu-long (&rest x &aux (main (first (first x))))
  (main-config main :long-time (second (first x))))

(defun main-menu-short (&rest x &aux (main (first (first x))))
  (main-config main :short-time (second (first x))))

(defun day-button-action-performed (&rest x &aux (main (first x)) (strs (fourth x)))
  (fill-day main (parse-integer (elt strs 1))))

(defun main-pull1-select (i item raw main)
  (unless (equal item "==========") (default-timecode main (or i raw))))

(defun main-pull1-popup (i item raw main)
  (declare (ignore i))
  (unless (equal item "==========")
    (set-cur-timecode  main (default-timecode main raw))
    (main-config main :new-time nil)
    (setf (main-small-state main) 
	  (if (string-equal raw :none)
	      :to-none
	    :new))
    ))

(defun main-pull2-select (i item raw main)
  (declare (ignore i item))
  (default-timecode main raw))

(defun small-button-action-performed (&rest x &aux (main (first x)))
  (fill-timecode main :begin))

(defun now-button-action-performed (&rest x &aux (main (first x)))
  (main-select-now main)
  (fill-day main (main-today main)))

(defun small-mouse-pressed (&rest x &aux 
				  (main (first x))
				  (lb (second x))
				  (l (third x)))
  (cond
   ((and (not 
	  (zerop 
	   (logand 
	    (elt l 0)
	    (jfield "java.awt.event.InputEvent" "BUTTON1_MASK"))))
	 (eql 2 (elt l 2)))
    ;; left-click double-click confirms current job code
    (fill-timecode main :fill)
    (main-config main :new-time nil)
    (setf (main-small-state main) :new))
   ((and (main-cpopup main)
	 (not 
	  (zerop 
	   (logand 
	    (elt l 0)
	    (jfield "java.awt.event.InputEvent" "BUTTON3_MASK")))))
    ;; right-click pops up code menu
    (fill-timecode main :fill)
    (jcall (jmethod "java.awt.PopupMenu" "show" "java.awt.Component" "int" "int")
	   (main-cpopup main) lb 50 20)))
  )

(defun small-window-closing (&rest x) (fill-timecode (first x) :end))

(defun small-timer-handler (&rest x 
				  &aux 
				  (main (first x))
				  (w (third x)) 
				  (d (fourth x)))
  (case w
    (:text (jcall (jmethod "java.awt.Label" "setText" 
			   "java.lang.String") 
		  (main-small-timer main) d))	       
    (:end-long
     (jcall (jmethod "java.awt.Component" "setBackground" 
		     "java.awt.Color") 
	    (main-small-timer main)
	    (color-red main))
     (dotimes (i 3)
       (jcall "beep" 
	      (jcall "getToolkit" (main-small main)))
       (sleep 0.2))
     (jcall (jmethod "java.awt.Component" "setVisible"
		     "boolean")
	    (main-small main) 
	    (make-immediate-object t :boolean))
     (fill-timecode main :fill))
    (:end-short
     (jcall (jmethod "java.awt.Component" "setBackground" 
		     "java.awt.Color") 
	    (main-small-timer main)
	    (color-green main))
     (jcall (jmethod "java.awt.Label" "setText" "java.lang.String") 
	    (main-small-timer main) "---")
     (jcall "beep" 
	    (jcall "getToolkit" (main-small main)))
     (fill-timecode main :fill)
     (default-timecode main 'none)
     (set-cur-timecode main nil))
    (:to-white
     (jcall (jmethod "java.awt.Component" "setBackground" 
		     "java.awt.Color")
	    (main-small-timer main)
	    (color-white main)))))


(defun summ-window-closing (&rest x &aux (frame (second x)))
  (main-config (first x) :state nil)
  (jcall (jmethod "java.awt.Component" "setVisible" "boolean")
	 frame 
	 (make-immediate-object  nil :boolean)))

(defun main-mouse-pressed (main p l &rest x)
  (declare (ignore x))
  (let* ((x (elt l 3)) (y (elt l 4))
	 (d (jcall "getSize" p :copy))
	 (h (jfield "height" d))
	 (w (jfield "width" d))
	 (hx (truncate 
	      x (truncate
		 w (main-hour-count main nil))))
	 (mx (- (truncate y (truncate h 12)) 2)))
    (when (< -1 mx)
      (main-select-min main nil hx mx))))

(defun other-mouse-pressed (&rest x &aux 
				  (d (first x)) 
				  (main (first d))
				  (l (third x)))
  (apply #'main-select-min d)
  (cond
   ((and (not 
	  (zerop 
	   (logand 
	    (elt l 0)
	    (jfield "java.awt.event.InputEvent" 
		    "BUTTON1_MASK"))))
	 (eql 2 (elt l 2)))
    (set-cur-timecode main nil))
   )
  )

(defun item-state-changed (self c l s &rest x)
  (declare (ignore c l x))
  (with-slots
   (show-data select-fn raw-data select-data) self
   (let* ((item (elt s 1))
	  (index (position 
		  item show-data :test #'equal)))
     (funcall select-fn index item
	      (elt raw-data index) select-data))))

(defun pull-action-performed (&rest x)
  (apply (first (first x)) (cdr (first x))))

(defun main-timer-body (main &aux 
			     i sleep
			     (notifier (jlinker-slot :notifier)))
  (ignore-errors 
    "Ignore"
    (loop
     (when sleep 
       (sleep 1)
       (decf sleep)
       (when (<= sleep 0) (setf sleep nil)))
     (let ((state (main-small-state main)))
       (unless (and (main-small-start main) 
		    (main-alive-p main)
		    (eq notifier (jlinker-slot :notifier))
		    (not (eq state :end)))
	 (return))
       (setf
	(main-small-state main)
	(case state
	  (:new 
	   (setf i (main-config main :long-time))
	   (let ((old (main-config main :new-time))
		 delta)
	     (when old
	       (setf delta (- (get-universal-time) old))
	       (setf delta (- i (truncate delta 60)))
	       (cond
		((< (main-config main :short-time) delta i) 
		 (setf i delta))
		(t (setf old nil))))
	     (main-config main :new-time
			  (or old (get-universal-time)))
	     (jnotify-lisp notifier 0 "smallTimer" :to-white nil)
	     :wait1))
	  (:wait1
	   ;; send all gui work to jnotify-lisp to
	   ;;  properly serialize access to Java vm
	   (jnotify-lisp notifier 0 "smallTimer" 
			 :text (make-label i :text-only :minute))
	   (setf sleep 58)
	   :wait1a)
	  (:wait2 
	   (jnotify-lisp notifier 0 "smallTimer" 
			 :text (make-label (* 15 i) :text-only :second))
	   (setf sleep 14)
	   :wait2a)
	  (:to-none
	   (jnotify-lisp notifier 0 "smallTimer" :text "---")
	   (jnotify-lisp notifier 0 "smallTimer" :to-white nil)
	   :idle)
	  (:error (warn "Error state in TimeCardWait") (return))
	  (otherwise
	   (if sleep
	       state
	     (case state
	       (:idle 
		(setf sleep 10)
		(if (query-awt) :idle :end))
	       (:wait1a
		(decf i)
		(when (eql 0 (mod i 5))
		  ;; keep timestamp file up to date
		  (fill-timecode main :fill))
		(cond
		 ((<= i (main-config main :short-time))
		  (jnotify-lisp notifier 0 "smallTimer" :end-long nil)
		  (setf i (* 4 (main-config main :short-time)))
		  :wait2)
		 (t :wait1)))
	       (:wait2a
		(decf i)
		(when (eql 0 (mod i 5)) (fill-timecode main :fill))
		(cond
		 ((<= i 0)
		  (jnotify-lisp notifier 0 "smallTimer" :end-short nil)
		  :idle)
		 (t :wait2)))
	       (otherwise :error)
	       )))))))))





(defmethod main-alive-p ((main main-panel))
  (with-slots 
   (connection) main 
   (and connection (eq connection *jlinker-connection*))))

(defun main-dispose (x)
  (when (and x (jcall (jmethod "java.awt.Component" "isDisplayable") x))
    (jcall "dispose" x)))

(defmethod main-exit ((main main-panel))
  ;;(main-dispose (main-sum-frame main))
  ;;(main-dispose (main-small main))
  (when (main-sum-frame main)
    (jcall (jmethod "java.awt.Component" "setVisible" "boolean")
	   (main-sum-frame main) nil))
  (main-dispose (main-frame main))
  (setf (main-frame main) nil (main-sum-frame main) nil (main-small main) nil))

(defmethod new-time-file ((main main-panel) &optional fl)
  (if fl
      (progn (main-exit main)
	     (setf *main* nil)
	     (setf *main-table* :new))
    (setf *main-table* :dlg)))



(defmethod main-select-min ((main main-panel) dx hx mx)
  (let* ((dp (main-day-panel main dx))
	 sh sm carry full (kx 0))
    (case hx 
      (:full (setf full t hx nil))
      (:prev (setf kx 0))
      (:next (setf kx -1)))
    (case mx
      (:prev (setf kx 0))
      (:next (setf kx -1)))
    (setf sh (day-sel-hour dp kx))
    (setf sm (day-sel-min dp kx))
    (setf hx (adjust-index hx sh (main-hour-count main dx)))
    (multiple-value-setq (mx carry) (adjust-index mx sm 10))
    (when carry 
      (setf hx (adjust-index (list carry) hx (main-hour-count main dx))))
    (main-doselect main dx nil)
    (day-sel-hour dp :one hx)
    (if full
	(day-sel-min dp :all (list (list 0 1 2 3 4 5 6 7 8 9)))
      (day-sel-min dp :one mx))
    (main-doselect main dx t)
    (values hx mx)))



(defmethod main-doselect ((main main-panel) dx onoff)
  (let* ((dp (main-day-panel main dx))
	 sh sm)
    (and (day-filled dp) 
	 (setf sh (day-sel-hour dp :all))
	 (setf sm (day-sel-min dp :all))
	 (let ((a (day-labels dp)))
	   (mapc #'(lambda (shx sml)
		     (dolist (smx sml)
		       (jcall (jmethod "java.awt.Component" "setBackground" 
				     "java.awt.Color") 
			(aref a smx shx) 
			(if onoff
			    (color-green main)
			  (day-background dp)))))
		 sh sm)))
    nil))


(defmethod main-deselect ((main main-panel) dx)
  (let* ((dp (main-day-panel main dx)))
    (main-doselect main dx nil)
    (day-sel-hour dp :none)
    (day-sel-min dp :none)
    nil))

(defun kill-process (name)
  (let ((p (ignore-errors (mp:process-name-to-process name))))
    (when p (mp:process-kill p))))

(defun main-timer-process (main)
  (kill-process "TimeCardWait")
  (mp:process-run-function
   "TimeCardWait" 
   'main-timer-body
   main))


(defmethod main-compute-now ((main main-panel) &optional dx)
  (let* ((i (main-today main))
	 (j (main-day-index main dx))
	 (dc (multiple-value-list (get-decoded-time)))
	 (hr (when i (main-hour-index main i (third dc))))
	 (mn (allocate-minute (second dc) (first dc)))
	 dp th tm)
    (when (and i (eql i j) hr) 
      (setf dp (main-day-panel main j))
      (when (day-filled dp)
	(setf th (day-this-hour dp))
	(setf tm (day-this-min dp))
	(unless (or (null th) (and (eql th hr) (eql tm mn)))
	  (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color")
		 (aref (day-labels dp) tm th)
		 (day-background dp)))
	(unless (and (eql th hr) (eql tm mn))
	  (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color")
		 (aref (day-labels dp) mn hr)
		 (color-white main))))
      (setf (day-this-min dp) mn (day-this-hour dp) hr))
    (values hr mn j)))

(defmethod main-select-now ((main main-panel))
  (let* ((i (main-today main))
	 (dc (multiple-value-list (get-decoded-time)))
	 (hr (main-hour-index main i (third dc)))
	 (mn (allocate-minute (second dc) (first dc))))
    (if hr
	(main-select-min main i hr mn)
      (main-deselect main i))))

(defmethod fill-timecode ((main main-panel) key)
  (let* ((tx (main-today main))
	 (dc (multiple-value-list (get-decoded-time)))
	 (nowh (main-hour-index main tx (third dc)))
	 nowm nowc hx mx)
    (multiple-value-setq (nowm nowc) (allocate-minute (second dc) (first dc)))
    (case key
      (:begin
       (unless (eq :new (main-file main)) (return-from fill-timecode nil))
       ;; choose today's panel, remember time, 
       ;; open small window, close main window (and summary)
       (fill-day main tx)
       (when (main-hold main)
	 (setf (main-hold main) nil)
	 (jcall (jmethod "java.awt.Label" "setText" "java.lang.String") 
		(main-hold-label main) "AutoSave")
	 (write-timestamps main))

       (let ((old (main-config main :new-time)) long)
	 ;; check for a recovery from a vm crash within a
	 ;; reasonable time period
	 (when old
	   (setf long (* 3 (main-config main :long-time)))
	   (when (< (main-config main :short-time) 
		    (- long
		       (truncate (- (get-universal-time) old) 60))
		    long) 
	     (setf dc (multiple-value-list (decode-universal-time old)))
	     (setf nowh (main-hour-index main tx (third dc)))
	     (multiple-value-setq (nowm nowc) 
	       (allocate-minute (second dc) (first dc)))
	     )))

       (if nowh
	   (main-select-min main tx nowh nowm)
	 (main-deselect main tx))
       (setf (main-small-start main) (and nowh (list nowh nowm)))
       (cond ((string-equal (default-timecode main nil) 'none)
	      (setf (main-small-state main) :idle)
	      (jcall (jmethod "java.awt.Label" "setText" "java.lang.String")
	       (main-small-timer main) "---"))
	     (t (setf (main-small-state main) :new)))
       (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") 
	(main-small-timer main)
	(color-white main))
       (jregister-handler nil :smallTimer 'small-timer-handler :data main)
       (main-timer-process main)
       (jcall (jmethod "java.awt.Component" "setVisible" "boolean") 
	      (main-frame main) 
	      (make-immediate-object nil :boolean))
       (when (main-sum-frame main)
	 (jcall (jmethod "java.awt.Component" "setVisible" "boolean")
		(main-sum-frame main) 
		(make-immediate-object nil :boolean)))
       (jcall (jmethod "java.awt.Component" "setVisible" "boolean")
	      (main-small main)
	      (make-immediate-object t :boolean))
       (main-config main :state :small)
       )
      (:fill
       ;; fill in current timecode from last noted time to now
       (when (setf mx (main-small-start main))
	 (setf hx (first mx))
	 (setf mx (second mx))
	 (setf (main-small-start main) 
	       (loop (set-cur-timecode main nil)
		     (cond ((< hx nowh));; keep stepping
			   ((> hx nowh) (return (list hx mx)))
			   ;; hx = nowh
			   ((and (= mx nowm) nowc)) ;; one more step
			   ((>= mx nowm) (return (list hx mx))))
		     (multiple-value-setq (hx mx)
		       (main-select-min main tx nil :next)
		       )))))
      (:end
       (setf (main-small-start main) nil)
       (setf (main-small-state main) :end)
       (jregister-handler nil :smallTimer nil)
	 
       ;; close small window, return to full window 
	 
       ;; ??? remember size of small window
       (let ((p (jcall (jmethod "java.awt.Dialog" "getLocationOnScreen")
		       (main-small main) :copy)))
	 (main-config main 
		      :new-time  nil
		      :small-x (jfield "x" p)
		      :small-y (jfield "y" p)))
	 
       (jcall (jmethod "java.awt.Component" "setVisible" "boolean")
	      (main-small main) 
	      (make-immediate-object nil :boolean))
       (jcall (jmethod "java.awt.Window" "show") (main-frame main))
       (main-config main :state nil)
       )
      )))


(defmethod default-timecode ((main main-panel) index)
  ;; separate methods to update pulldown and popup
  ;;         and timestamp area
  (let* ((ccode (main-ccode main))
	 ccodes raw)
    (cond ((null index) ccode)
	  (t (setf ccodes (main-ccodes main))
	     (cond ((consp index)
		    ;; this is a selection from full list,  
		    ;;  add to front of short list
		    (setf raw (car index))
		    (setf index 0)
		    (insert-item ccodes raw 0)
		    (update-timelast main))
		   (t (if (numberp index)
			  (setf raw (elt (slot-value ccodes 'raw-data) index))
			(setf index
			      (or
			       (position (setf raw index)
					 (slot-value ccodes 'raw-data)
					 :test #'string-equal)
			       (progn (setf ccode "")
				      0))))
		      (setf raw (elt (slot-value ccodes 'raw-data) index))
		      (cond ((eql index 0))
			    ((and (marked-row ccodes) 
				  (< (marked-row ccodes) index)))
			    (t 
			     #+mswindows
			     (progn
			       ;; It looks pretty to re-order the pull-down
			       ;; list, but this seems to cause problems
			       ;; on several Unix boxes.
			       (delete-item ccodes index)
			       (insert-item ccodes raw 0)
			       (setf index 0))
			     
			     (update-timelast main)
			     ))))
	     (unless (string-equal raw ccode)
	       (main-config main :default-code raw)
	       (jcall (jmethod "java.awt.Choice" "select" "int")
		      (widget ccodes) index)
	       (setf (main-ccode main) raw)
	       (when (main-small-label main)
		 (jcall (jmethod "java.awt.Label" "setText" "java.lang.String")
			(main-small-label main) 
			(time-nick raw))))
	     raw))))

(defmethod set-cur-timecode ((main main-panel) raw)
  (set-cur-timecode (main-day-panel main nil) 
		    (or raw (main-ccode main))))

(defmethod fill-day ((self main-panel) &optional index)
  (fill-day (main-day-panel self index)))

(defmethod time-summary ((main main-panel) dx code inc)
  (or (numberp inc) (setf inc 1))
  (if dx
      (progn
	(time-summary main nil code inc)
	(time-summary (main-day-panel main dx) dx code inc))
    (let ((sum (main-summary main)) new item)
      (cond (code
	     (or sum (setf sum (time-summary main nil nil nil)))
	     (unless (setf item (assoc code (cdr sum) :test #'string-equal))
	       (setf item (list code 0))
	       (do ((tl (cdr sum) (cdr tl)))
		   ((atom tl) (nconc sum (list item)))
		 (when (string-lessp code (first (car tl)))
		   (setf (cdr tl) (cons (car tl) (cdr tl)))
		   (setf (car tl) item)
		   (return))))
	     (incf (second item) inc)
	     (incf (first sum) inc))
	    (sum)
	    (t
	     ;; first gather all codes used
	     (setf sum (list 0))
	     (dotimes (dx (main-day-count main))
	       (let ((dsum (time-summary 
			    (main-day-panel main dx)  dx nil nil)))
		 (incf (first sum) (first dsum))
		 (dolist (di (cdr dsum))
		   (let ((item (assoc (first di) (cdr sum) 
				      :test #'string-equal)))
		     (or item
			 (push (setf item (list (first di) 0)) (cdr sum)))
		     (incf (second item) (second di))))
		 ))
	     (setf (cdr sum)
		   (sort (append (cdr sum) nil) #'string-lessp
			 :key #'first))
	     (setf (main-summary main) sum)
	     ))

      ;; then make sure they all appear in each daily summary
    
      (dotimes (dx (main-day-count main))
	(let ((dsum (time-summary (main-day-panel main dx) dx nil nil)))
	  (unless (and (eql (length sum) (length dsum))
		       (block scan
			 (mapc #'(lambda (x y)
				   (or (string-equal (car x) (car y))
				       (return-from scan nil)))
			       (cdr sum) (cdr dsum))
			 t))
	    (setf new (mapcar #'(lambda (x) (list (car x) 0)) (cdr sum)))
	    (dolist (di (cdr dsum))
	      (let ((ni (assoc (car di) new :test #'string-equal)))
		(setf (second ni) (second di))))
	    (setf (cdr dsum) new))))
      sum)))

(defmethod time-summary-frame ((main main-panel) dx rx)
  (let* ((tsum (time-summary main nil nil nil))
	 (days (main-day-count main))
	 (cols (+ 2 days))
	 (rows (+ 2 (length tsum)))
	 (frame (main-sum-frame main))
	 (state (main-sum-state main))
	 )

    (when (and frame state 
	       (or (not (eql rows (first state)))
		   (not (eql cols (second state)))))
      (jcall (jmethod "java.awt.Frame" "dispose") frame)
      (setf (main-sum-frame main) nil
	    frame nil))

    (cond ((and dx frame)
	   ;; update one row/col intersection (4 places)
	   (let* ((labels (main-sum-labels main)))
	     (jcall (jmethod "java.awt.Label" "setText" "java.lang.String")
	      (aref labels rx dx)
	      (make-label 
	       (second (elt (cdr (time-summary main dx nil nil)) rx))
	       :text-only :scale+sp))
	     (jcall (jmethod "java.awt.Label" "setText" "java.lang.String") 
	      (aref labels rx days)
	      (make-label (second (elt (cdr tsum) rx)) :text-only :scale+sp))
	     (jcall (jmethod "java.awt.Label" "setText" "java.lang.String") 
	      (aref labels (1- rows) dx)
	      (make-label 
	       (first (time-summary main dx nil nil)) :text-only :scale+sp))
	     (jcall (jmethod "java.awt.Label" "setText" "java.lang.String") 
	      (aref labels (1- rows) days)
	      (make-label (first tsum) :text-only :scale+sp))
	     ))
	  ;; not on screen, nothing to update
	  (dx)
	  (frame 
	   ;; show already made frame
	   (jcall (jmethod "java.awt.Window" "show") frame))
	  (t 
	   (let* ((frame (jnew (jconstructor "java.awt.Frame" "java.lang.String")
				"Time Card Summary"))	     
		  (panel (jnew "java.awt.Panel" 
			  (jnew "java.awt.GridLayout" rows cols 2 2)))
		  (labels (make-array (list rows cols)))
		  (lg (color-light-grey main))
		  (yl (color-yellow main))
		  (wh (color-white main))
		  (loc (jcall (jmethod "java.awt.Frame" "getLocationOnScreen") 
			      (main-frame main) :copy))
		  lb)
	     (jcall (jmethod "java.awt.Component" "setSize" "int" "int")
		    frame (min 1000 (* 70 cols)) (* 25 rows))
	     (jcall (jmethod "java.awt.Frame" "validate") frame)
	     (jcall (jmethod "java.awt.Component" "setLocation" "int" "int")
		    frame (+ 100 (jfield "x" loc))
		    (+ 300 (jfield "y" loc)))
	     (jcall (jmethod "java.awt.Window" "show") frame)
	     (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color")
		    panel (color-green main))


	     ;; first row  --  day labels
	     (dotimes (dx days)
	       (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
		panel 
		(setf lb (make-label 
			  (string-date (main-day-date main dx) :w3)))
		:ignore)
	       (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") lb lg))
	     (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
		    panel (setf lb (make-label " ")) :ignore)
	     (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
		    panel (setf lb (make-label " ")) :ignore)

	     ;; Second row  --  date labels
	     (dotimes (dx days)
	       (jcall (jmethod "java.awt.Container" "add" "java.awt.Component") 
		panel 
		(setf lb (make-label (string-date (main-day-date main dx) 
						  :mody)))
		:ignore)
	       (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") lb lg))
	     (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
		    panel (setf lb (make-label "Total")) :ignore)
	     (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") lb lg)
	     (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
		    panel (setf lb (make-label "Account" :left)) :ignore)
	     (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") lb lg)
      
	     ;; middle rows  --  data
	     (dotimes (rx (length (cdr tsum)))
	       (dotimes (dx days)
		 (jcall (jmethod "java.awt.Container" 
			       "add" "java.awt.Component") 
		  panel 
		  (setf lb (make-label 
			    (second 
			     (elt (cdr (time-summary main dx nil nil)) rx))
			    :right :scale+sp))
		  :ignore)
		 (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") lb wh)
		 (setf (aref labels rx dx) lb)
		 )
	       (jcall (jmethod "java.awt.Container" "add" "java.awt.Component") 
		panel 
		(setf lb 
		      (make-label (second (elt (cdr tsum) rx)) 
				  :right :scale+sp))
		:ignore)
	       (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") lb yl)
	       (setf (aref labels rx days) lb)
	       (jcall (jmethod "java.awt.Container" "add" "java.awt.Component") 
		panel 
		(setf lb (make-label (time-nick (first (elt (cdr tsum) rx)))
				     :left 10))
		:ignore)
	       (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") lb lg))

	     ;; last row  --  totals
	     (dotimes (dx days)
	       (jcall (jmethod "java.awt.Container" "add" "java.awt.Component") 
		panel 
		(setf lb (make-label 
			  (first (time-summary main dx nil nil)) 
			  :right :scale+sp))
		:ignore)
	       (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") lb yl)
	       (setf (aref labels (1- rows) dx) lb)
	       )
	     (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
		    panel 
		    (setf lb (make-label (first tsum) :right :scale+sp))
		    :ignore)
	     (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") lb wh)
	     (setf (aref labels (1- rows) days) lb)
	     (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
		    panel (setf lb (make-label "Totals" :left)) :ignore)
	     (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") lb lg)

	     (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
		    frame panel :ignore)
	     (jstatic "addTo" 
		      "com.franz.jlinker.JLWindowAdapter" 
		      frame)
	     (jregister-handler frame :windowClosing 'summ-window-closing :data main)

	     (setf (main-sum-labels main) labels)
	     (setf (main-sum-frame main) frame)
	     (jcall (jmethod "java.awt.Frame" "validate") frame)
	     (setf (main-sum-state main) (list rows cols))
	     (jcall (jmethod "java.awt.Window" "show") frame)
	     (main-config main :state :summary)
	     )))))

(defmethod time-summary-print ((main main-panel))
  (let* ((tsum (time-summary main nil nil nil))
	 (days (main-day-count main))
	 (rows (length (cdr tsum)))
	 )
    (macrolet ((do-days (&rest body)
			`(dotimes (dx days)
			   (when (not (zerop 
				       (first 
					(time-summary main dx nil nil))))
			     ,@body))))
      (with-open-file 
       (stream (merge-pathnames (main-config main :card) *time-root*)
	       :direction :output :if-exists :supersede)
       (format stream "~&")
       (format stream "Timecard for period ~A through ~A, ~A.~%"
	       (string-date (main-day-date main 0) :mody)
	       (string-date (main-day-date main (1- days)) :mody)
	       (first (main-day-date main (1- days))))
       (when (main-config main :line-1)
	 (format stream "~A~%" (main-config main :line-1)))
       (when (main-config main :line-2)
	 (format stream "~A~%" (main-config main :line-2)))
       (format stream "~%")
       (format stream "~%")
    
       ;; first row  --  dates
       (do-days
	 (format stream " ~A " 
		 (string-date (main-day-date main dx) :mo3)))
       (format stream "~%")
       (do-days
	 (format stream " ~3@A " (third (main-day-date main dx))))
       (format stream "~%")
       (do-days
	 (format stream "-----"))
       (format stream "~%")

       ;; middle rows  --  data
       (dotimes (rx rows)
	 (do-days
	   (let ((s (elt (cdr (time-summary main dx nil nil)) rx)))
	     (format stream "~A "
		     (if (zerop (second s))
			 "    "
		       (format nil "~4,1F" (/ (second s) 10.0))))))
	 (format stream "~(~A~)~%" (first (elt (cdr tsum) rx))))
       (do-days
	 (format stream "-----"))
       (format stream "~%")

       ;; last row  --  totals
       (do-days
	 (format stream "~4A "
		 (format 
		  nil "~4,1F" (/ (first (time-summary main dx nil nil)) 10.0))))
       (format stream "~%")
       (format stream "~%")

       (dolist (a (cdr tsum))
	 (format stream "    ~4A  ~A  ~(~A~)~%"
		 (format nil "~4,1F" (/ (second a) 10.0))
		 (cdr (assoc (first a) *time-code-list*
			     :test #'string-equal))
		 (first a)))
       (format stream "   -----~%")
       (format stream "    ~4A  Grand Total~%"
	       (format nil "~4,1F" (/ (first tsum) 10.0)))
       (format stream "~8%_______________________________")
       (format stream "Employee Signature~%")
       (format stream "~8%_______________________________")
       (format stream "Manager Signature~%~%")


       (format stream "~2%------------------------------------")
       (format 
	stream 
	"~%Allegro/Java TimeCard Version ~{~A.~A.~A.~}~%" *jtc-version*)
       ))))


;;; ---------- day-panel


(defclass day-panel ()
  ((panel  :initarg :panel  :initform nil :accessor day-panel)
   (data   :initarg :data   :initform nil :accessor day-data)
   (main   :initarg :main   :initform nil :accessor day-main)
   (labels :initform nil :accessor day-labels)
   (filled :initform nil :accessor day-filled)
   (index :accessor day-index)
   (title :accessor day-title)
   (selected-hour :initform nil)
   (selected-min  :initform nil)
   (this-hour :accessor day-this-hour :initform nil)
   (this-min :accessor day-this-min :initform nil)
   (background :accessor day-background :initform nil)
   (total-label      :accessor day-total-label)
   (summary :accessor day-summary :initform nil)
   ))


(defmethod initialize-instance :after ((self day-panel) &key main index title
				     &allow-other-keys)
  (let* ((fr-main (main-panel main))
	 (layout (main-playout main))
	 (p (jnew "java.awt.Panel"))
	 )
    (setf (day-main self) main
	  (day-panel self) p
	  (day-index self) index
	  (day-title self) title
	  )
    (jcall (jmethod "java.awt.Container" "add" "java.awt.Component")
	   fr-main p :ignore)
    (jcall (jmethod "java.awt.CardLayout" "addLayoutComponent" 
		  "java.awt.Component" "java.lang.Object")
	   layout p (format nil "~A" index))

    #+ignore
    (progn ;; does not work because labels get the mouse events?
    (jstatic "addTo" 
	     "com.franz.jlinker.JLMouseAdapter" 
	     p)
    (jregister-handler fr-main :mousePressed  'main-mouse-pressed :data main))
    ))

(defmethod day-sel-hour ((self day-panel) &optional (index 0) new) 
  (with-slots 
   (selected-hour) self
   ;; hour slot -> NIL
   ;;           -> (hour-index-0 ...)
   (case index
     (0 (typecase selected-hour
	  (null    (if new (setf selected-hour (list new)) nil))
	  (cons    (if new 
		       (setf (car selected-hour) new) 
		     (car selected-hour)))))
     (-1 (typecase selected-hour
	   (null    (if new (setf selected-hour (list new)) nil))
	   (cons    (if new 
			(setf (car (last selected-hour)) new)
		      (car (last selected-hour))))))
     (:all (if new (setf selected-hour new) selected-hour))
     (:none (setf selected-hour nil))
     (:count (length selected-hour))
     (:one (typecase selected-hour
	     (null    (if new (setf selected-hour (list new)) nil))
	     (cons    (if new 
			  (setf selected-hour (list new)) 
			(car selected-hour)))))
     (otherwise
      ;; assumed to be index
      (typecase selected-hour
	(null    (if new (setf selected-hour (list new)) nil))
	(cons    (if new 
		     (setf (elt selected-hour index) new) 
		   (elt selected-hour index))))))))

(defmethod day-sel-min ((self day-panel) &optional (index 0) new) 
  (with-slots 
   (selected-min) self
   ;; selected-min -> NIL
   ;;              -> ((min-index00 ... ) ... ) ; same length as selected-hour
   (case index
     (0 (typecase selected-min
	  (null    (if new (setf selected-min (list (list new))) nil))
	  (cons    (if new 
		       (setf (car (car selected-min)) new) 
		     (car (car selected-min))))))
     (-1 (typecase selected-min
	   (null    (if new (setf selected-min (list (list new))) nil))
	   (cons    (if new 
			(setf (car (last (car (last selected-min)))) new)
		      (car (last (car (last selected-min))))))))
     (:all (if new (setf selected-min new) selected-min))
     (:none (setf selected-min nil))
     (:count (length selected-min))
     (:one (typecase selected-min
	     (null    (if new (setf selected-min (list (list new))) nil))
	     (cons    (if new 
			  (setf selected-min (list (list new))) 
			(car (car selected-min))))))
     (otherwise
      ;; assumed to be index
      (typecase selected-min
	(null    (if new (setf selected-min (list (list new))) nil))
	(cons    (if new 
		     (setf (car (elt selected-min index)) new) 
		   (car (elt selected-min index)))))))))


(defmethod fill-day ((self day-panel) &optional index)
  (declare (ignore index))
  (let* ((p (day-panel self))
	 (index (day-index self))
	 (main (day-main self))
	 (date (main-day-date main index))
	 (pdate (multiple-value-list (apply #'pretty-date date)))
	 (ncols (main-hour-count main index))
	 (width (max ncols 6))
	 (total (first (time-summary main index nil nil))) 
	 (state (main-config main :state))
	 mr lb
	 labels
	 lg wh gr
	 )

    (setf (main-current main) index)
    (unless (day-filled self)
      (setf lg (color-light-grey main))
      (setf wh (color-white main))
      (setf gr (color-green main))
      (setf (day-background self) (jcall "getBackground" p))
      (jcall (jmethod "java.awt.CardLayout" "show" "java.awt.Container" "java.lang.String")
	     (main-playout main) (main-panel main) 
	     (format nil "~A" index))

      (setf (day-labels self) (setf labels (make-array (list 10 ncols))))
      (jcall (jmethod "java.awt.Container" "setLayout" "java.awt.LayoutManager")
	     p (jnew "java.awt.GridLayout" 12 width))
      (dotimes (r 12)
	
	(case r
	  (0 (dotimes (i width)
	       (jcall (jmethod "java.awt.Container" "add" "java.awt.Component") 
		p 
		(setf lb (make-label
			  (case i
			    ((0 1 2 3) (elt pdate i))
			    (4 "Total =")
			    (5 (/ total 10.0))
			    (otherwise "   "))
			  :right))
		:ignore)
	       (when (eql i 5) (setf (day-total-label self) lb))
	       (when (< i 6) 
		 (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") lb wh))
	       (when (eql i 3)
		 (jcall (jmethod "java.awt.Frame" "validate") (main-frame main))
		 (unless (eq state :small)
		   (jcall (jmethod "java.awt.Window" "show") (main-frame main))))))
	  (1 (dotimes (c width)
	       (setf lb nil)
	       (jcall (jmethod "java.awt.Container" "add" "java.awt.Component") 
		p 
		(if (< c ncols) 
		    (setf lb (make-label 
			      (main-day-hour main index c) nil :hour))
		  (make-label " "))
		:ignore)
	       (when lb 
		 (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color") lb lg))
	       ))
	  (otherwise
	   (setf mr (- r 2))
	   
	   (dotimes (c width)
	     (jcall (jmethod "java.awt.Container" "add" "java.awt.Component") 
	      p 	     
	      (setf lb 
		    (make-label 
		     (if (< c ncols)
			 (time-nick 
			  (main-day-code main index c (- r 2)))
		       " ")
		     8.0))
	      :ignore)
	     (and (eql (day-sel-hour self) c) (eql (day-sel-min self) mr)
		  (jcall (jmethod "java.awt.Component" "setBackground" 
				"java.awt.Color") 
			 lb gr))
	     

	     (jstatic "addTo" 
		      "com.franz.jlinker.JLMouseAdapter" 
		      lb)
	     (jregister-handler 
	      lb 
	      :mousePressed 'other-mouse-pressed
	      :data (list main index c mr))


	     (when (< c ncols)
	       (setf (aref labels mr c) lb))
	     ))))


      (setf (day-filled self) t))

    (jcall (jmethod "java.awt.CardLayout" "show" "java.awt.Container" "java.lang.String")
	   (main-playout main) (main-panel main) 
	   (format nil "~A" index))
    (jcall (jmethod "java.awt.Frame" "validate") (main-frame main))
    (unless (eq state :small) 
      (jcall (jmethod "java.awt.Window" "show") (main-frame main)))
    ))


(defmethod set-cur-timecode ((dp day-panel) raw)
  (let* ((hl  (day-sel-hour dp :all))
	 (mll (day-sel-min dp :all))
	 (dx (day-index dp))
	 (main (day-main dp)) 
	 old)
    (mapc #'(lambda (hx ml)
	      (dolist (mx ml)
		(when
		    (not 
		     (string-equal 
		      raw 
		      (setf old (main-day-code main dx hx mx))))
		  (or (string-equal old 'none)
		      (time-summary main dx old -1))
		  (or (string-equal raw 'none)
		      (time-summary main dx raw 1))
		  (main-day-code main dx hx mx raw)
		  (if (main-hold main)
		      (incf (main-hold main))
		    (write-timestamps main))
		  (jcall (jmethod "java.awt.Label" "setText" "java.lang.String")
			 (main-hold-label main)
			 (case (main-hold main)
			   ((nil) "AutoSave")
			   (0 "ManSave")
			   (otherwise "Unsaved")))
		  (main-compute-now main dx)
		  (when (day-filled dp)
		    (jcall (jmethod "java.awt.Label" "setText" "java.lang.String") 
		     (day-total-label dp)
		     (make-label 
		      (first (time-summary dp dx nil nil))
		      :text-only :scale+sp))
		    (let ((a (day-labels dp)))
		      (jcall (jmethod "java.awt.Label" "setText" "java.lang.String")
			     (aref a mx hx)
			     (make-label 
			      (time-nick raw) :text-only))
		      (jcall (jmethod "java.awt.Component" "setBackground" "java.awt.Color")
			     (aref a mx hx)
			     (color-yellow main))))
		  )))
	  hl mll)))
	       
(defmethod time-summary ((day day-panel) index code inc)
  (declare (ignore index))
  (let* ((main (day-main day))
	 (dx (day-index day))
	 (sum (day-summary day))
	 item)
    (cond (code
	   ;; called only when panel summary is there for sure
	   ;; and so is the item place
	   (setf item (assoc code (cdr sum) :test #'string-equal))
	   (incf (first sum) (or inc 1))
	   (incf (second item) (or inc 1))
	   (time-summary-frame main dx (position item (cdr sum)))
	   )
	  (sum)
	  (t (setf sum (list 0))  
	     (dotimes (hx (main-hour-count main dx))
	       (dotimes (mx 10)
		 (let* ((code (main-day-code main dx hx mx))
			item)
		   (unless (string-equal code 'none) 
		     (unless (setf item 
				   (assoc code (cdr sum) :test #'string-equal))
		       (push (setf item (list code 0)) (cdr sum)))
		     (incf (first sum))
		     (incf (second item))))))
	     (setf (day-summary day) sum)))
    sum))




		   

;;; ----------------------Widgets

(defclass awt-widget ()
  ((widget :accessor widget :initform nil)     ;; widget proxy
   ))
  
	  
;;; ----------------------- Menu   awt:Menu   MenuItem

(defclass awt-menu (awt-widget)
  ((items)
   (label)
   (popup)
   ))
     
(defclass awt-menu-item (awt-widget)
  ((label :accessor menu-text)
   (handler :accessor menu-handler)
   (menu)))

(defmethod initialize-instance :after ((self awt-menu) &key items label popup
				       &allow-other-keys)
  (setf (widget self) 
	(if popup 
	    (jnew (jconstructor "java.awt.PopupMenu" "java.lang.String") label)
	  (jnew (jconstructor "java.awt.Menu" "java.lang.String") label))
	(slot-value self 'popup) popup
	(slot-value self 'label) label)
  (dolist (i items)
    (etypecase i
      ((or cons string)
       (make-instance 'awt-menu-item :menu self 
		      :label (etypecase i
			       (string i)
			       (symbol (string i))
			       (cons (string (first i))))
		      :handler (when (consp i) (second i))
		      :data    (when (consp i) (third i))
		      ))
      ((member :separator) (jcall "addSeparator" (widget self)))
      )))

(defmethod initialize-instance :after ((self awt-menu-item) &key 
				       menu label handler data
				       &allow-other-keys)
  (setf (widget self) (jnew (jconstructor "java.awt.MenuItem" "java.lang.String") label)
	(slot-value self 'label) label
	(slot-value self 'menu)  menu
	(slot-value self 'handler) handler)
  (jcall (jmethod "java.awt.Menu" "add" "java.awt.MenuItem")
	 (widget menu) (widget self) :ignore)
  (when handler
    (jcall (jmethod 
	    "com.franz.jlinker.JLActionListener" 
	    "addTo" 
	    "java.awt.MenuItem") 
	   nil (widget self))
    (jregister-handler (widget self) :actionPerformed handler :data data)))




;;; ----------------------- Pull-down   awt:Choice

(defclass pull-down (awt-widget)
   ((raw-data)   ;; raw data
    (show-data)  ;; converted data 
    (key-fn)     ;; accessor for raw data
    (convert-fn) ;; conversion function
    (select-fn)  ;; function called on select, 
                 ;;          args: index show-item raw-item data
    (select-data);; data passed to select-fn
    (marked-row :initform nil :accessor marked-row)
    (popup :initform nil :accessor popup)
    (popup-fn)
    (popup-items :initform nil)
    ))

(defmethod initialize-instance :after 
  ((self pull-down) &key raw-data key-fn convert-fn
   select-fn select-data marked-row popup
   &allow-other-keys
   &aux show-data widget)

  (setf (slot-value self 'raw-data) raw-data
	(slot-value self 'key-fn) key-fn
	(slot-value self 'convert-fn) convert-fn
	(slot-value self 'select-fn) select-fn
	(slot-value self 'select-data) select-data
	(slot-value self 'marked-row)  marked-row
	(slot-value self 'popup-fn) popup
	)
  (setf (slot-value self 'show-data) 
	(setf show-data (mapcar #'(lambda (d) (convert-item self d))
				raw-data)))
  (setf (slot-value self 'widget) (setf widget (jnew "java.awt.Choice")))
  (dolist (l show-data) 
    (jcall (jmethod "java.awt.Choice" "add" "java.lang.String") widget l))
  (when select-fn
    (jcall (jmethod 
	    "com.franz.jlinker.JLItemListener" 
	    "addTo" 
	    "java.awt.Choice") 
	   nil widget)
    (jregister-handler widget :itemStateChanged 'item-state-changed
		      :data self))

  (when popup
    (setf select-fn popup)
    (setf (popup self) (setf popup (jnew "java.awt.PopupMenu")))
    (dotimes (i (length show-data))
      (if (eql i marked-row)
	  (jcall "addSeparator" popup)
	(jcall (jmethod "java.awt.Menu" "add" "java.awt.MenuItem")
	       popup (new-popup-item self i) :ignore))))
  )

(defmethod new-popup-item ((self pull-down) i)
  (with-slots
   (popup show-data raw-data popup-items popup-fn select-data) self
   (let ((item (jnew "java.awt.MenuItem" (elt show-data i))))
     (push (cons (elt raw-data i) item) popup-items)
     (jcall (jmethod 
	     "com.franz.jlinker.JLActionListener" 
	     "addTo" 
	     "java.awt.MenuItem") 
	    nil item)
     (jregister-handler
      item :actionPerformed 'pull-action-performed
      :data (list popup-fn nil nil (elt raw-data i) select-data))
     item)))


(defmethod convert-item ((self pull-down) d)
  (with-slots
   (key-fn convert-fn) self
   (when key-fn (setf d (funcall key-fn d)))
   (when convert-fn (setf d (funcall convert-fn d)))
   (unless (stringp d) (setf d (format nil "~A" d)))
   d))

(defmethod insert-item ((self pull-down) d index &aux show)
  ;; insert after index
  (with-slots (raw-data show-data widget marked-row popup 
			select-fn select-data popup-fn popup-items
			) self
	      (unless (member d raw-data :test #'string-equal)
		(let ((rtl (nthcdr index raw-data))
		      (stl (nthcdr index show-data)))
		  (cond ((consp rtl)
			 (setf (cdr rtl) (cons (car rtl) (cdr rtl))
			       (car rtl) d)
			 (setf (cdr stl) (cons (car stl) (cdr stl))
			       (car stl) (setf show (convert-item self d))))
			(t (setf raw-data (list d))
			   (setf show-data 
				 (list (setf show (convert-item self d))))))
		  (and marked-row (< index marked-row) (incf marked-row))
		  (jcall "insert" widget show index))
		(when popup
		  (let ((item (cdr (assoc d popup-items :test #'string-equal))))
		    (or item (setf item (new-popup-item self index)))
		    (jcall (jmethod "java.awt.Menu" "insert" 
				  "java.awt.MenuItem" "int") 
			   popup item index)))
		)))

(defmethod delete-item ((self pull-down) index)
  (with-slots (raw-data show-data widget marked-row popup) self
	      (case index
		(0 (pop raw-data)
		   (pop show-data))
		(otherwise (decf index)
			   (let ((rtl (nthcdr index raw-data))
				 (stl (nthcdr index show-data)))
			     (setf (cdr rtl) (cddr rtl))
			     (setf (cdr stl) (cddr stl)))
			   (incf index)))
	      (and marked-row (< index marked-row) (decf marked-row))
	      (jcall (jmethod "java.awt.Choice" "remove" "int") widget index)
	      (when popup (jcall (jmethod "java.awt.Menu" "remove" "int")
				 popup index))
	      ))





;;; ---------- Utilities



(defun adjust-index (new old max &aux carry)
  (cond ((numberp new))
	(t (or (numberp old) (setf old 0))
	   (if (and (consp new) (numberp (car new)))
	       (setf new (+ old (car new)))
	     (case new
	       (:prev (setf new (1- old)))
	       (:next (setf new (1+ old)))
	       (otherwise (setf new old))))))
  (if (eql max 0)
      old
    (loop 
     (cond ((< new 0) (or carry (setf carry 0)) (decf carry) (incf new max))
	   ((< new max) (return (values new carry)))
	   (t (or carry (setf carry 0)) (incf carry) (decf new max))))))


(defun time-nick (name &optional width)
  (let ((nick (first (cdr (assoc name *time-nicknames*
				 :test #'string-equal
				 )))))
    (labels ((hc 
	      (nick start &aux s) 
	      (if (setf s (position #\- nick :start start))
		  (format nil "~:(~A~)~A"
			  (abbr nick start s)
			  (hc nick (1+ s)))
		(format nil "~:(~A~)" (abbr nick start))))

	     (abbr (nick start &optional (end (length nick)))
		   (let ((s (subseq nick start end)))
		     (cond 
		      ((string-equal s "performance") "perf")
		      ((string-equal s "development") "dev")
		      (t s)))))
      (cond ((stringp nick))
	    (t (or nick (setq nick name))
	       (setq nick (hc (string nick) 0))))
      (and width (< width (length nick))
	   (setf nick (subseq nick 0 width)))
      nick)))


(defun make-label (text &optional width format)
  (let* ((text-only nil)
	 (lay (typecase width 
		((member :left)       
		 (setf width nil) 
		 (jfield "java.awt.Label" "LEFT"))
		((member :right)      
		 (setf width nil) 
		 (jfield "java.awt.Label" "RIGHT"))
		((member nil :center) 
		 (setf width nil) 
		 (jfield "java.awt.Label" "CENTER"))
		((integer * -1)       (setf width (- width)) 
		                      (jfield "java.awt.Label" "LEFT"))
		((integer 1 *)        (jfield "java.awt.Label" "RIGHT"))
		(float                (setf width (round width)) 
				      (jfield "java.awt.Label" "CENTER"))
		((member :text-only)  (setf width nil) (setf text-only t))
		(cons                 (setf text-only t)
				      (setf width (abs (car width))))
		(otherwise            
		 (setf width nil) 
		 (jfield "java.awt.Label" "LEFT"))))
	 (s (typecase text 
	     (string text)
	     (symbol (string text))
	     (integer (case format
			(:hour (format nil "~2,'0D:00" text))
			(:minute (format nil "0:~2,'0D" text))
			(:second (format nil "~{0:~2,'0D:~2,'0D~}" 
					 (multiple-value-list
						  (truncate text 60))))
			(:scale+sp (format nil "~S   " (/ text 10.0)))
			))
	     (cons   (case format
		       (:concat 
			(format nil "~{~A~}"
				(mapcar #'(lambda (x) 
					    (make-label x :text-only :concat))
					text))))))))
    (or s (setf s (format nil "~A" text)))
    (when (and width (< width (length s)))
      (setf s (subseq s 0 width)))
    (if text-only
	s
      (jnew "java.awt.Label" s lay))))


(defun next-day (&optional (inc 0) day month year)
  (let* ((now (multiple-value-list (get-decoded-time)))
	 (then (encode-universal-time 0 0 12 
				      (or day (elt now 3))
				      (or month (elt now 4))
				      (or year (elt now 5))))
	 (new (multiple-value-list 
		(decode-universal-time (+ then (* inc 24 3600)))))
	 )
    (values (elt new 3) (elt new 4) (elt new 5))))

(defun string-date (date &optional how)
  (let ((year (first date))
	(month (second date))
	(day (third date)))
    (case how
      ((1 :mo :mo3)   ;; Month only
       (multiple-value-bind (wk mo)
	   (pretty-date year month day)
	 (declare (ignore wk))
	 (case how (:mo3 (setf mo (subseq mo 0 3))))
	 mo))
      ((:w :w3)   ;; Weekday only
       (multiple-value-bind (wk)
	   (pretty-date year month day)
	 (case how (:w3 (setf wk (subseq wk 0 3))))
	 wk))
      ((2 :mody)     ;; Month day
       (multiple-value-bind (wk mo dy)
	   (pretty-date year month day)
	 (declare (ignore wk))
	 (format nil "~A ~A" mo dy)))
      (otherwise
       (multiple-value-bind (wk mo dy yr)
	   (pretty-date year month day)
	 (format nil "~A, ~A ~A ~A" wk mo dy yr))))))

(defun pretty-date (year month day &optional (hour 12) (m 0) (s 0))
  (multiple-value-bind (sec min hr dy mn yr wkday)
    (decode-universal-time
     (encode-universal-time s m hour day month year))
    (values (elt '("Monday" "Tuesday" "Wednesday" "Thursday"
		   "Friday" "Saturday" "Sunday")
		 wkday)
	    (elt '("January" "February" "March" "April" "May" "June"
		   "July" "August" "September" "October" "November"
		   "December")
		 (1- mn))
	    (format nil "~A" dy) (format nil "~A" yr)
	    (format nil "~2,'0D:~2,'0D:~2,'0D" hr min sec))))


(defun allocate-minute (min sec &optional (interval 360))
  (let* ((seconds (+ sec (* 60 min)))
	 n s)
    (multiple-value-setq (n s) (truncate seconds interval))
    (values n (> s (truncate interval 2)))))


(defun get-time-root ()
  (let ((n (sys:command-line-argument-count :application t))
	p)
    (dotimes (i n)
      (when (string-equal (sys:command-line-argument i :application t)
			  "-tcroot")
	(return
	 (and (< i (1- n))
	      (stringp (setf p (sys:command-line-argument (1+ i) :application t)))
	      (probe-file p)   ;;; See bug23624.
	      (file-directory-p p)
	      (setf *time-root* p)))))))



;;; ---------- Utilities specific to time card handling

(defun update-timelast (main)
  (main-config main :cur-codes 
	       (slot-value (main-ccodes main) 'raw-data)))

(defun write-time-config (main)
  (with-open-file 
   (s (merge-pathnames "timestmp.init" *time-root*)
      :direction :output
      :if-exists :supersede)
   (format s ";;; WARNING:  GENERATED FILE - changes to this file will~%")
   (format s ";;; be LOST if made while TimeCard program is running.~%~%")
   (format s "( ~{~15S ~S~%  ~}~%  )~%~%"
	   (main-config main))))

(defun read-time-config (main)
  (let* ((in (merge-pathnames "timestmp.init" *time-root*))
	 (in2 (merge-pathnames "timestmp.ini" *time-root*))
	 (c (when (or (probe-file in) (when (probe-file in2) (setf in in2)))
	      (with-open-file 
	       (s in
		  :direction :input)
	       (read s nil nil))))
	 (d (append *default-config* nil)))
    (do ((tl c (cddr tl)))
	((atom tl))
      (setf (getf d (first tl)) (second tl)))
    (setf (slot-value main 'config) d)))
     
(defmethod main-config ((main main-panel) &rest key-value)
  (with-slots
   (config)
   main
   (cond ((null key-value) config)
	 ((null (cdr key-value)) (getf config (car key-value)))
	 (t (do (lv done (kt key-value (cddr kt)))
		((atom kt) 
		 (when done (write-time-config main))
		 lv)
	      (unless (equal (getf config (first kt))
			     (setf lv (second kt)))
		(setf done t)
		(setf (getf config (first kt)) 
		      (second kt))
		))))))

(defun write-timestamps (main)
  (let ((out (merge-pathnames (main-config main :stamps) *time-root*)))
    (when (probe-file out)
      (rename-file-raw out (main-config main :backup)))
    (with-open-file 
     (s out :direction :output :if-exists :supersede)
     (format s ";;; WARNING:  GENERATED FILE - changes to this file will~%")
     (format s ";;; be LOST if made while TimeCard program is running.~%~%")
     (format s "~%")
     (dotimes (dx (main-day-count main))
       (let ((code 'none) next hour)
	 (dotimes (hx (main-hour-count main dx)
		      (or (string-equal code 'none)
			  (format s "(~(~30A~) ~2@S ~2@S ~2@S 59  0)~%"
				  'none
				  (second (main-day-date main dx))
				  (third  (main-day-date main dx))
				  hour)))
	   (setf hour (main-day-hour main dx hx))
	   (dotimes (mx 10)
	     (setf next (main-day-code main dx hx mx))
	     (cond ((string-equal code next))
		   (t (setf code next)
		      (format s "(~(~30A~) ~2@S ~2@S ~2@S ~2@S  0)~%"
			      code 
			      (second (main-day-date main dx))
			      (third  (main-day-date main dx))
			      hour (* 6 mx)))))))
       (format s "~%")))
    (when (main-hold main) 
      (setf (main-hold main) 0)
      (jcall (jmethod "java.awt.Label" "setText" "java.lang.String")
	     (main-hold-label main) "ManSave"))
    ))





;;; ---------- Parse timestamp file

(defun parse-time-stamps (main &optional filename)
  (let ((out (if main
		 (merge-pathnames (main-config main :stamps) *time-root*)
	       filename)))
    (typecase filename
      ((member :new) (if (probe-file out)
			 (setf filename out)
		       (setf filename nil)))
      (pathname nil)
      (otherwise (setf filename nil)))

    ;; result is vector of timesheets
    ;; timesheet -> ( date-triple vector-of-hours )
    ;; hour      -> ( hour-int vector-of-10-codes )
  
    (let (stamps thisyear year days table
		 thismonth thisday thisut utday)
      (multiple-value-setq (thisday thismonth thisyear) (next-day))
      (setf utday (* 24 60 60))
      (setf thisut 
	    (encode-universal-time 0 0 12 thisday thismonth thisyear))
      (setf year thisyear)
      (when filename
	(with-open-file (p filename :direction :input)
			(do ((job (read p nil :eof) (read p nil :eof)) 
			     month newmonth newyear)
			    ((eq job :eof))
			  (push (list
				 :name    (nth 0 job)
				 :month   (setf newmonth (nth 1 job))
				 :day     (nth 2 job)
				 :hour    (nth 3 job)
				 :minute  (nth 4 job)
				 :second  (nth 5 job))
				stamps)
			  (cond (newyear)
				((null month) (setf month newmonth))
				((eql month newmonth))
				((< month newmonth))
				(t (decf year) (setf newyear t)))
			  )))

      ;; gather into day groups and make sure each is terminated
      (do ((ss (nreverse stamps) (cdr ss))
	   s day month newday newmonth dl)
	  ((null ss) 
	   (cond
	    (dl
	     (push (nreverse dl) days) 
	     (setf s (encode-universal-time 0 0 12 newday newmonth year))
	     (when (and (< s thisut)
			(< (+ (length days) (truncate (- thisut s) utday)) 15))
	       ;; fill in gaps up to today if today is within 14-day
	       ;; time period
	       (loop (multiple-value-setq (day month year)
		       (next-day 1 day month year))
		     (push (list (list :name 'none :month month 
				       :day day :year year
				       :hour (if (eql day thisday) 8 12)
				       :minute 0 :second 0))
			   days)
		     (when (eql day thisday) (return)))))
	    ;; if file is empty, just create a dummy entry for today
	    (t (push (list (list :name 'none :month thismonth 
				 :day thisday :year year
				 :hour (min 8
					    (third (multiple-value-list
						    (get-decoded-time))))
				 :minute 0 :second 0))
		     days)))
	   (setf days (nreverse days)))
	(setf s (car ss)
	      newday (getf s :day)
	      newmonth (getf s :month))
	(cond ((null day) (setf day newday month newmonth))
	      ((eql day newday))
	      (t (let* ((lt (car dl)) 
			(lh (getf lt :hour)) 
			(lm (getf lt :minute))
			(ls (getf lt :second)))
		   (unless (eq 'none (getf lt :name))
		     (cond ((< lh 23) (incf lh))
			   ((< lm 59) (setf lm 59))
			   (t (setf ls 59)))
		     (push (list :name 'none :month (getf lt :month)
				 :day (getf lt :day)
				 :year (getf lt :year)
				 :hour lh :minute lm :second ls)
			   dl)))
		 (push (nreverse dl) days)
		 (setf dl nil)
		 (loop (multiple-value-setq (day month year)
			 (next-day 1 day month year))
		       (when (eql day newday) (return))
		       (push (list (list :name 'none :month month 
					 :day day :year year
					 :hour 12 :minute 0 :second 0))
			     days))))
	(push (list* :year year s) dl))
    

      (dolist (d days)
	(let* ((beg (first d))
	       (hour (getf beg :hour))
	       (min  (getf beg :minute))
	       (sec  (getf beg :second))
	       (year (getf beg :year))
	       (month (getf beg :month))
	       (day   (getf beg :day))
	       (ut (encode-universal-time 0 0 12 day month year))
	       nh nm nmc col name cols
	       )
	  (setf min (allocate-minute min sec))
	  (or (eql hour 0)
	      (< 5 min)
	      ;; ensure at least 1/2 hour of unallocated time at start
	      (setf cols 
		    (list (list (1- hour) 
				(make-array 10 :initial-element 'none)))))
	  (setf col (make-array 10 :initial-element 'none))
	  (setf (elt col min) (setf name (getf beg :name)))
	  (dolist (s (cdr d) (push (list hour col) cols))
	    (setf nh (getf s :hour))
	    (multiple-value-setq (nm nmc)
	      (allocate-minute (getf s :minute) (getf s :second)))
	    (when nmc (incf nm))
	    (when (< 9 nm) (setf nm 0) (incf nh))
	    (when (< hour nh)
	      (dotimes (i 10)
		(when (< min i) (setf (elt col i) name)))
	      (loop (push (list hour col) cols)
		    (setf col (make-array 10 :initial-element 'none))
		    (incf hour)
		    (when (eql hour nh)     (return))
		    (dotimes (i 10) (setf (elt col i) name)))
	      (setf min -1))
	    (dotimes (i nm)
	      (when (< min i) (setf (elt col i) name)))
	    (setf name (getf s :name))
	    (setf min nm hour nh)
	    (setf (elt col min) name))
	  (unless (eql hour 23)
	    (incf hour)
	    ;; add an extra empty hour if there is room in theday
	    (push (list hour (make-array 10 :initial-element 'none))
		  cols))
	  (when (eql ut thisut)
	    ;; fill today to 1800
	    (loop (when (< 18 hour) (return))
		  (incf hour)
		  (push (list hour (make-array 10 :initial-element 'none))
			cols)))
	  (setf cols (concatenate 'vector (nreverse cols)))
	  (push (list (list year month day) cols) table)
	  ))
      (setf table (concatenate 'vector (nreverse table)))
      (values table filename)
      )))





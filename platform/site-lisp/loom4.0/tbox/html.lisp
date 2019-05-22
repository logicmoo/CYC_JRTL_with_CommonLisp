;;;-*- Mode: Lisp; Package: LOOM -*-

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                             ;
;  Copyright (c) 1988, 1995, 1999, 2003 University of Southern California     ;
;  All rights reserved.                                                       ;
;                                                                             ;
;                               LICENSE                                       ;
;                                                                             ;
;  1) The "SOFTWARE", below, refers to the LOOM software (in either           ;
;     source-code, or binary form) and a "work based on the SOFTWARE"         ;
;     means a work based on either the SOFTWARE, on part of the SOFTWARE,     ;
;     or on any derivative work of the SOFTWARE under copyright law:          ;
;     that is, a work containing all or a portion of the SOFTWARE             ;
;     either verbatim or with modifications.  Each licensee is                ;
;     addressed as "you" or "LICENSEE".                                       ;
;                                                                             ;
;  2) The University of Southern California on behalf of its Information      ;
;     Sciences Institute having an address of 4676 Admiralty Way, Suite       ;
;     1001, Marina del Rey, CA 90292 is the copyright holder in the           ;
;     SOFTWARE.  The copyright holder reserve all rights except those         ;
;     expressly granted to the LICENSEE herein and U.S. Government            ;
;     license rights.                                                         ;
;                                                                             ;
;  3) A copy or copies of the SOFTWARE may be given to others, if you         ;
;     meet the following conditions:                                          ;
;                                                                             ;
;     a) Copies in source code must include the copyright notice and this     ;
;        license.                                                             ;
;                                                                             ;
;     b) Copies in binary form must include the copyright notice and          ;
;        this license in the documentation and/or other materials             ;
;        provided with the copy.                                              ;
;                                                                             ;
;  4) All advertising materials, journal articles and documentation           ;
;     mentioning features derived from or use of the SOFTWARE must            ;
;     display the following acknowledgement:                                  ;
;                                                                             ;
;     "This product includes software developed by and/or derived from        ;
;     the LOOM project (http://www.isi.edu/isd/LOOM/LOOM-HOME.html)."         ;
;                                                                             ;
;     In the event that the product being advertised includes an intact       ;
;     distribution (with copyright and license included) then this            ;
;     clause is waived.                                                       ;
;                                                                             ;
;  5) You are encouraged to package modifications to the SOFTWARE             ;
;     separately, as patches to the SOFTWARE.                                 ;
;                                                                             ;
;  6) If you modify a copy or copies of the SOFTWARE or any portion of        ;
;     it, thus forming a work based on the SOFTWARE, and give a copy or       ;
;     copies of such work to others, either in source code or binary          ;
;     form, you must meet the following conditions:                           ;
;                                                                             ;
;     a) The SOFTWARE must carry prominent notices stating that you           ;
;        changed specified portions of the SOFTWARE.                          ;
;                                                                             ;
;     b) The SOFTWARE must display the following acknowledgement:             ;
;                                                                             ;
;        "This product includes software developed by and/or derived from     ;
;        the LOOM Project (http://www.isi.edu/isd/LOOM/LOOM-HOME.html) to     ;
;        which the U.S. Government retains certain rights."                   ;
;                                                                             ;
;  7) LICENSEE AGREES THAT THE EXPORT OF GOODS AND/OR TECHNICAL DATA FROM     ;
;     THE UNITED STATES MAY REQUIRE SOME FORM OF EXPORT CONTROL LICENSE       ;
;     FROM THE U.S. GOVERNMENT AND THAT FAILURE TO OBTAIN SUCH EXPORT         ;
;     CONTROL LICENSE MAY RESULT IN CRIMINAL LIABILITY UNDER U.S. LAW.        ;
;                                                                             ;
;  8) Portions of the SOFTWARE resulted from work developed under a           ;
;     U.S. Government contract and are subject to the following license:      ;
;     the Government is granted for itself and others acting on its           ;
;     behalf a paid-up, nonexclusive, irrevocable worldwide license in        ;
;     this SOFTWARE to reproduce, prepare derivative works, and perform       ;
;     publicly and display publicly.                                          ;
;                                                                             ;
;  9) The SOFTWARE was prepared, in part, as an account of work sponsored     ;
;     by an agency of the United States Government.  Neither the United       ;
;     States, nor the University of Southern California, nor any of their     ;
;     employees, makes any warranty express or implied, or assumes any        ;
;     legal liability or responsibility for the accuracy, completeness,       ;
;     or usefulness of any information, apparatus, product, or process        ;
;     disclosed, or represents that its use would not infringe privately      ;
;     owned rights.                                                           ;
;                                                                             ;
;  10) IN NO EVENT WILL THE UNITED STATES OR THE UNIVERSITY OF SOUTHERN       ;
;      CALIFORNIA BE LIABLE FOR ANY DAMAGES, INCLUDING DIRECT, INCIDENTAL,    ;
;      SPECIAL, OR CONSEQUENTIAL DAMAGES RESULTING FROM EXERCISE OF THIS      ;
;      LICENSE AGREEMENT OR THE USE OF THE SOFTWARE.                          ;
;                                                                             ;
;  11) THIS SOFTWARE IS PROVIDED BY THE UNIVERSITY OF SOUTHERN CALIFORNIA     ;
;      "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT      ;
;      LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY, AND FITNESS     ;
;      FOR A PARTICULAR PURPOSE OR USE ARE DISCLAIMED.  THE UNIVERSITY OF     ;
;      SOUTHERN CALIFORNIA MAKES NO REPRESENTATION THAT THE SOFTWARE,         ;
;      MODIFICATIONS, ENHANCEMENTS OR DERIVATIVE WORKS THEREOF, WILL NOT      ;
;      INFRINGE ANY PATENT, COPYRIGHT, TRADE SECRET OR OTHER PROPRIETARY      ;
;      RIGHT.                                                                 ;
;                                                                             ;
;                                END OF LICENSE                               ;
;                                                                             ;
;                                                                             ;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; HTML.LISP (TBOX)

(in-package "LOOM")

(export '(html-print-context))

;;  UNARY-CONCEPT  C_
;;  UNARY-RELATION P_
;;  TBOX-RELATION  R_
;;  BASIC-INSTANCE I_
;;  CLOS-INSTANCE  I_

#-:lucid
(defun htmlify-string (string)
  ;; Do appropriate substitution of escape characters for HTML!
  (if (or (position #\< string)
          (position #\> string)
          (position #\& string)
          (position #\" string))
    (coerce (loop for char across string
                  when (eql char #\<)
                  append '(#\& #\L #\T #\;)
                  else when (eql char #\>)
                  append '(#\& #\G #\T #\;)
                  else when (eql char #\&)
                  append '(#\& #\A #\M #\P #\;)
                  else when (eql char #\")
                  append '(#\& #\Q #\T #\;)
                  else collect char)
            'string)
    string))

;; Lucid's loop doesn't support "across"
#+:lucid
(defun htmlify-string (string)
  ;; Do appropriate substitution of escape characters for HTML!
  (if (or (position #\< string)
          (position #\> string)
          (position #\& string)
          (position #\" string))
    (coerce (loop for char in (coerce string 'list)
                  when (eql char #\<)
                  append '(#\& #\L #\T #\;)
                  else when (eql char #\>)
                  append '(#\& #\G #\T #\;)
                  else when (eql char #\&)
                  append '(#\& #\A #\M #\P #\;)
                  else when (eql char #\")
                  append '(#\& #\Q #\T #\;)
                  else collect char)
            'string)
    string))

(defun html-marker (object)
  (typecase object
    (UNARY-CONCEPT  "C_")
    (UNARY-RELATION "P_")
    (TBOX-RELATION  "R_")
    (BASIC-INSTANCE "I_")
    (CLOS-INSTANCE  "I_")
    (t "")))

(defmethod html-reference ((self T))
  ;; Default is just the printed representation
  (htmlify-string (format nil "~S" self)) )

(defmethod html-label ((self T))
  ;; Default is just the printed representation
  (htmlify-string (format nil "~S" self)) )

(defmethod html-label-a ((self T))
  ;; Default is just the printed representation
  (htmlify-string (format nil "~A" self)) )

  ;; CL-HTTP SUPPORT
(defun form-url-base (name context)
  (let ((packageName (cond (name (package-name (symbol-package name)))
			   ((get-value context 'background-package-name))
			   ((member *package* *html-dont-use-these-packages*)
			    "COMMON-LISP-USER")
			   (t (package-name *package*)))))
    (format nil "~A-~A?~A~@[::~A~]+~A~@[+~A~]"
	    *html-url-function* *html-url-type*
	    (htmlify-string packageName)
	    (and name (htmlify-string (symbol-name name)))
	    (htmlify-string (string (name context)))
	    *html-url-parameters*) ))


(defun form-url-reference (name context text)
  (format nil "<A ~@[TARGET=~S~] HREF=~A~A~@[#~A~]>~A</A>"
	  *html-url-target* *html-url-path*
	  (form-url-base name context)
	  *html-url-tag* text) )

(defmethod html-reference ((self TBOX-CONCEPT))
  (if (or (and (system-defined-concept-p self)
	       (or (member :referenced-by-role (system-attributes self))
		   (not (undefined-p self))))
          (and (eq (name (context self)) 'built-in-theory)
               (not *html-link-to-built-in-p*)))
    (html-reference (name self))
    (if (eq *html-print-p* :single-page)
	(let* ((name (name self))
	       (htmlName (html-label-a name))
	       (*html-url-type* (if (typep self 'TBOX-RELATION)
				    "relation"
				    "concept")))
	  (if (or (undefined-p self) (incoherent-p self))	; TAR 10/3/97
	      (format nil "~:[?~;#~]&nbsp;~A"
		      (incoherent-p self)  ; Can't be both incoherent AND undefined!
		      (form-url-reference name (context self) htmlName))
	      (form-url-reference name (context self) htmlName)))
        (let ((name (html-label (name self)))
	      (contextForm (unless (eq (context self) *context*)
			     (name (context self)))))
	  (format nil "<A HREF=~@[\"~(~A~).html\"~]#~A~A>~A</A>" 
		  contextForm (html-marker self) name name)))) )

(defmethod html-label ((self TBOX-CONCEPT))
  (if (eq *html-print-p* :single-page)
      (format nil "<STRONG>~A</STRONG>" (html-label-a (name self)))
      (let ((name (html-label (name self))))
	(format nil "<A NAME=~A~A><STRONG>~A</STRONG></A>" (html-marker self) name name) )) )

(defmethod html-reference ((self INSTANCE-IN-CONTEXT))
  (if (eq *html-print-p* :single-page)
      (let ((*html-url-type* "instance"))
	(form-url-reference (identifier self) (context self)
			    (html-label-a (identifier self))) )
      ;; TO DO:  MAKE SINGLE-FILE REFERENCES CONTEXT SENSITIVE
      (let ((name (html-label (identifier self)))
	    (contextForm nil))
	(format nil "<A HREF=~@[\"~(~A~).html\"~]#~A~A>~A</A>" 
		contextForm (html-marker self) name name))))

(defmethod html-label ((self INSTANCE-IN-CONTEXT))
  (if (eq *html-print-p* :single-page)
      (format nil "<STRONG>~A</STRONG>" (html-label-a (identifier self)))      
      (let ((name (html-label (identifier self))))
	(format nil "<A NAME=~A~A><STRONG>~A</STRONG></A>" (html-marker self) name name) )))

(defmethod html-reference ((self DB-INSTANCE))
  (if (eq *html-print-p* :single-page)
      (let ((*html-url-type* "instance"))
	(form-url-reference (identifier self) (context self)
			    (html-label-a (identifier self))) )
      ;; TO DO:  MAKE REFERENCES CONTEXT SENSITIVE
      (let ((name (html-label (identifier self)))
	    (contextForm nil))
	(format nil "<A HREF=~@[\"~(~A~).html\"~]#~A~A>~A</A>" 
		contextForm (html-marker self) name name))))

(defmethod html-label ((self DB-INSTANCE))
  (if (eq *html-print-p* :single-page)
      (format nil "<STRONG>~A</STRONG>" (html-label-a (identifier self)))
      (let ((name (html-label (identifier self))))
	(format nil "<A NAME=~A~A><STRONG>~A</STRONG></A>"
		(html-marker self) name name) )))

(defmethod html-reference ((self CONTEXT))
  (if (eq *html-print-p* :single-page)
      (let ((*html-url-type* "context"))
	(format nil "<A ~@[TARGET=~S~] HREF=~A~A-~A?~A~@[+~A~]~@[#~A~]>~A</A>"
	    *html-url-target* *html-url-path* *html-url-function* *html-url-type*
	    (htmlify-string (symbol-name (name self))) *html-url-parameters*
	    *html-url-tag*
	    (name self)) )
      (let ((name (html-label (identifier self))))
	(format nil "<A HREF=\"~(~A~).html\"#~A>~A</A>" name name name))))

(defmethod html-label ((self CONTEXT))
  (if (eq *html-print-p* :single-page)
      (format nil "<STRONG>~A</STRONG>" (html-label-a (name self)))
      (let ((name (html-label (name self))))
	(format nil "<A NAME=~A><STRONG>~A</STRONG></A>" name name) )))

(defmethod html-reference ((self PROPOSITION))
  (format nil "~A" self))

(defmethod html-label ((self PROPOSITION))
  (format nil "~A" self))

(defmethod html-print-object ((self T) stream)
  (format stream "~S<P>" self))


(defmethod html-print-object ((self TBOX-CONCEPT) stream)
  (labels ((format-list? (list stream &key breakP (indent 10))
             (if (consp list)
		 (cond ((eq (first list) 'quote)
			(format stream "~:[~*~;~%~vT~]'"  breakP indent)
			(format-list? (second list) stream :indent (+ indent 1)))
		       ((member (first list)
			    '(:satisfies :exists :for-all :for-some :collect :set-of))
			(format stream "~:[~*~;~%~vT~](~S ~S" 
				breakP indent (first list) (second list))
			(format-list? (if (eq (first list) :satisfies)  ; :collect, etc. as well?
					  (normalize-query (third list))
					(third list))
				      stream :breakp t :indent (+ indent 2))
			(format stream ")"))
		       ((member (first list) '(:at-least :at-most :exactly))
			(format stream "~:[~*~;~%~vT~](~9S ~D " 
				breakP indent (first list) (second list))
			(format-list? (third list) stream :indent (+ indent 12))
			(format stream ")"))
		       ((and (eq (first list) :relates)
			     (member (name (second list)) '(< > <> /= >= <= =)))
			(format stream "~:[~*~;~%~vT~](~{~2S ~S ~S~})" 
				breakP indent (rest list)))
		       ((member (first list)
				'(:through :through++ :through+- :through-+ :through--
				  :interval++ :interval+- :interval-+ :interval--))
			(format stream "~:[~*~;~%~vT~](~{~S ~A ~A~})" 
				breakP indent list))
		       (t (let* ((firstItem (first list))
				 (firstAtomP (atom firstItem))
				 (subIndent 
				  (if firstAtomP
				      (+ indent 
					 (min (+ 2 (length (format nil "~S"
							      (or (name firstItem) 
								  firstItem))))
					      12))
				    (+ indent 1))))
			    (loop for item in (if firstAtomP (rest list) list)
				 as break? = nil then t
				 initially (format stream "~:[~*~;~%~vT~](~:[~*~;~S ~]"
						   breakP indent firstAtomP firstItem)
				 do (format-list? item stream :breakp break?
						  :indent subIndent)
				 finally (format stream ")")))))
	       ;; CHANGE THIS: ??  USE BREAKP TO DETERMINE LINE BREAKS?
               ;(format stream "~<~%~20T~:;~S ~>" list)
	       (format stream "~:[~*~;~%~vT~]~S" breakP indent list) ))
           (format-roles-clause (rolesClause stream)
             (format-list? 
              (loop for item in rolesClause
                    when (atom item)
                    collect (let ((role (get-relation item)))
                              (if (system-defined-concept-p role) item role))
                    else 
                    collect (cons (let ((role (get-relation (first item))))
                                    (if (system-defined-concept-p role) (first item) role))
				  ;; DO WE NEED TO WORRY ABOUT INSTANCES IN :value?
                                  (loop for (key value) on (rest item) by #'cddr
                                        collect key
                                        collect (if (eq key :type)
                                                  (get-concept value)
                                                  value))))
              stream))
           (dwim-filled-by-instances (definition)
             (cond ((atom definition)
                    definition)
                   ((not (search-tree-list-p '(:filled-by :one-of) definition))
                    definition)
                   ((eql (first definition) :filled-by)
                    `(:filled-by ,(second definition)
                         ,@(loop for i in (cddr definition)
                                 when (symbolp i)
                                 collect (or (get-instance i :error-p nil) i)
                                 else collect (dwim-filled-by-instances i))))
                   ((eql (first definition) :one-of)
                    `(:one-of
                      ,@(loop for i in (cdr definition)
                              when (symbolp i)
                              collect (or (get-instance i :error-p nil) i)
                              else collect (dwim-filled-by-instances i))))
                   (t (loop for form in definition
                            collect (dwim-filled-by-instances form))))) )
    (let (print-value)
      (loop for (defName . clauses) in (source-definitions self)
            do (format stream "(~A ~A" 
                       (typecase self 
                         (UNARY-CONCEPT "defconcept")
                         (TBOX-RELATION "defrelation")
                         (UNARY-RELATION "defproperty")
                         (t "defSOMETHING**"))
                       (if (eq defName (name self))       ;  TAR 3/8/96
                         (html-label self)
                         (html-label defName)))
	       (loop for (keywd value) on clauses by #'cddr
		 do (case keywd
		      ((:is :is-primitive) ;  TAR 3/11/96
		       (cond ((and (symbolp value)
				   (eql self
					(setq print-value
					  (typecase self
					    (UNARY-CONCEPT
					     (find-concept value
							   :no-warning-p t))
					    (TBOX-RELATION
					     (find-relation value
							    :no-warning-p t))
					    (UNARY-RELATION
					     (find-concept value
							   :no-warning-p t))))))
			      (format stream " ~S ~S" keywd
				      (or print-value value)))
			     ((and (consp value)
				   (member (first value) '(and :and or :or))
				   (symbolp (second value))
				   (null (cddr value))
				   (eql self
					(setq print-value
					  (typecase self
					    (UNARY-CONCEPT
					     (find-concept (second value)
							   :no-warning-p t))
					    (TBOX-RELATION
					     (find-relation (second value)
							    :no-warning-p t))
					    (UNARY-RELATION
					     (find-concept (second value)
							   :no-warning-p t))))))
			      (format stream " ~S (~S ~S)"
				      keywd (first value)
				      (or print-value (second value))))
			     (t (format stream "~%   ~:[:IS~;:IS-PRIMITIVE~] "
					(primitive-p self))
				(format-list?
				 (dwim-filled-by-instances
				  (getf (parsed-expressions self)
					:definition))
				 stream
				 :indent (if (primitive-p self) 17 7)))))
		      ((:antecedents :constraints :implies :defaults)
		       (format stream "~%   ~S " keywd)
		       (format-list? (dwim-filled-by-instances
				      (getf (parsed-expressions self)
					    (if (eql keywd :constraints)
						:implies
					      keywd)))
				     stream :indent (+ (length (symbol-name keywd)) 5)))
		      (:roles
		       (format stream "~%   ~S " keywd)
		       (format-roles-clause value stream))
		      ((:domain :range)
		       (format stream "~%   ~S " keywd)
		       (cond ((setq print-value (find-concept value :no-warning-p t))
			      (format stream "~A" print-value))
			     ((consp value)
			      (format-list? (mapcar #'(lambda (x) (or (find-concept x :no-warning-p t) x))
						    value)
					    stream 
					    :breakP nil
					    :indent (if (eq keywd :domain) 11 10)))
			     (t (format stream "~A" value))))
		      ((:domains)
		       (format stream "~%   ~S " keywd)
		       (format-list?
			(mapcar #'(lambda (x) (or (find-concept x :no-warning-p t) x))
				value)
			stream))
		      ((:function :predicate)
		       (format stream "~%   ~S " keywd)
		       (format stream "~A"
			       (with-output-to-string (s)
				 (format-list? value s
					       :indent (if (eq keywd :function) 13 14)))))
		      (:annotations
		       (format stream "~%   ~S " keywd)
		       (format-list? 
			(loop for v in value
			    when (atom v)
			    collect (or (find-concept v :no-warning-p t) v)
			    else collect (cons (or (find-relation
						    (first v) :no-warning-p t) 
						   (first v))
					       (mapcar #'(lambda (x) 
							   (or (find-instance 
								x :no-warning-p t)
							       x))
						       (rest v))))
			stream))
		      (t (format stream "~%   ~S " keywd)
			 (format-list? value stream))))
	     (format stream ")<P>~2%")) )))

(defun html-print-instance (self stream)
  (let ((attributes 
         (generate-instance-attributes-helper self (identifier self) t)))
    (when attributes
      (format stream "~%(tell ")
      (loop for entry in attributes
            when (member (car entry) '(:about :create))
              do (format stream "~%(~A ~A ~{~S~^~%~7T~})"
                         (car entry)
                         (html-label self)
                         (cddr entry))
            else do (pprint entry stream))
      (format stream ")<P>")) ))

(defmethod html-print-object ((self CLOS-INSTANCE) stream)
   (html-print-instance self stream))
      

(defmethod html-print-object ((self BASIC-INSTANCE) stream)
   (html-print-instance self stream))


(defun html-print-context-helper (context stream)
  (within-context context
    (let ((*html-print-p* t)
          (*print-readably* nil)
          (*dontSubstituteNamesP* t))
      (declare (special *dontSubstituteNamesP*))
      (format stream "<TITLE>Context ~A</TITLE>~%<H1>Context ~:*~A</H1>~%<PRE>~%"
              (name context))
      (loop for item in (list-context context :sort-p :sort-each-partition)
            unless (and (typep item 'TBOX-RELATION)
                        (or (system-defined-concept-p item) 
                            (member :reified (attributes item))))
            do (html-print-object item stream)
               (format stream "~2%"))
      (format stream "</PRE>~%"
              (name context)) )))

(defun html-print-context (context &optional filename &key (link-to-built-in-p nil))
  (let ((theContext (get-context context)))
    (if (null theContext)
      (warn "Context ~S could not be found!" context)
      (let ((*html-link-to-built-in-p*
             (or link-to-built-in-p  (eq (name theContext) 'built-in-theory))))
        (unless filename
          (setq filename (format nil "~(~A~).html" (name context))))
        (with-open-file (f filename :direction :output :if-exists :supersede)
          (html-print-context-helper (get-context context) f))
        filename )) ))


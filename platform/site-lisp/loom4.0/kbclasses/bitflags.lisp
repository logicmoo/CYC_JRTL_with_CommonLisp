;;; -*- Mode: LISP; Syntax: Common-lisp; Package: KBCLASSES; Base: 10. -*-

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                             ;
;  Copyright (c) 1999, 2003 University of Southern California                 ;
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

(eval-when (compile eval load) 
  (defparameter *bit-marker-alist* nil)

  (defun calculate-bit-position (metatype marker)
    (let ((pos (position marker (cdr (assoc metatype *bit-marker-alist*)))))
      (if pos
        pos
        (error "~S is not a valid flag for ~S" marker metatype))))

  (defun calculate-bit-values (metatype markers)
    (let ((result 0))
      (declare (fixnum result))
      (loop for marker in markers
            do (setf result 
                     (the fixnum 
                       (logior 
                        result
                        (the fixnum 
                          (ash 1 (calculate-bit-position metatype marker)))))))
      result) )
  )                                     ; END EVAL-WHEN

(defmacro def-bit-flags (metatype &rest markers)
  (if (> (length markers)
         (integer-length most-positive-fixnum))
    (error "Can't fit ~D ~S markers into a fixnum" (length markers) metatype)
    `(eval-when (compile eval load) 
       (push (cons ,metatype ',(copy-list markers)) *bit-marker-alist*))) )

(defmacro set-bit-flags (location metatype &rest flags)
  `(setf ,location (the fixnum (logior (the fixnum ,location)
                                       (the fixnum ,(calculate-bit-values
                                                     metatype flags))))) )

(defmacro clear-bit-flags (location metatype &rest flags)
  `(setf ,location (the fixnum (logandc2 (the fixnum ,location)
                                         (the fixnum ,(calculate-bit-values
                                                       metatype flags))))) )
(defmacro test-bit-flags (location metatype &rest flags)
  ;; If the first of flags is :or, then do an or test, otherwise do an
  ;;    and test;
  (when (eql (first flags) :and) (pop flags))
  (cond ((eql (first flags) :or)  ;; Faster than logtest:
         `(not (= 0 (the fixnum (logand (the fixnum ,(calculate-bit-values metatype (cdr flags)))
                                        (the fixnum ,location))))))
        ((cdr flags)
         (let ((flagValue (calculate-bit-values metatype flags)))
           `(= (the fixnum (logand (the fixnum ,flagValue) (the fixnum ,location)))
               (the fixnum ,flagValue)) ))
        (t `(logbitp (the fixnum ,(calculate-bit-position metatype (car flags)))
                     (the fixnum ,location)))) )

(defun expand-bit-flags (encodedFlags metatype)
  (loop for symbol in (cdr (assoc metatype *bit-marker-alist*))
        for position upfrom 0
        when (logbitp (the fixnum position) (the fixnum encodedFlags))
        collect symbol))

#|
(def-bit-flags :instance
  :skolem :user-defined-name :incoherent :discarded :abandoned-by-merge)


;; Macroexpand to test these:
(test-bit-flags (flags instance) :instance :or :skolem :discarded)
(test-bit-flags (flags instance) :instance :skolem :discarded)

(expand-bit-flags  9 :instance)  ; => '(:skolem :discarded)
(expand-bit-flags 16 :instance)  ; => '(:abandoned-by-merge)
(expand-bit-flags 31 :instance)  
    ; => '(skolem :user-defined-name :incoherent :discarded :abandoned-by-merge)
(expand-bit-flags 32 :instance)  ; => NIL

(defvar *test* 0)

(set-bit-flags *test* :instance :incoherent :user-defined-name) ; => 6
(test-bit-flags *test* :instance :incoherent)          ; => T
(test-bit-flags *test* :instance :incoherent :skolem)  ; => NIL
(test-bit-flags *test* :instance :and :incoherent :skolem)  ; => NIL
(test-bit-flags *test* :instance :or :incoherent :skolem)   ; => T
(test-bit-flags *test* :instance :incoherent :user-defined-name) ; => T
(test-bit-flags *test* :instance :and :incoherent :user-defined-name) ; => T
(test-bit-flags *test* :instance :incoherent :user-defined-name :discarded)
               ; => NIL


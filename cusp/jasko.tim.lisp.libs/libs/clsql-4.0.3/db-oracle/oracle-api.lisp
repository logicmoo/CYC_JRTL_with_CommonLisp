;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          oracle.lisp
;;;; Purpose:       Package definition for CLSQL Oracle interface
;;;;
;;;; $Id$
;;;;
;;;; This file is part of CLSQL.
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; *************************************************************************

(in-package #:clsql-oracle)

;;
;; OCI integer types
;;

(uffi:def-foreign-type ub2 :unsigned-short)
(uffi:def-foreign-type sb2 :short)
(uffi:def-foreign-type ub4 :unsigned-int)
(uffi:def-foreign-type sb4 :int)
(uffi:def-foreign-type size_t :unsigned-long)

;;
;; Opaque pointer types
;;

(uffi:def-foreign-type void-pointer :pointer-void)
(uffi:def-foreign-type oci-env :pointer-void)
(uffi:def-foreign-type oci-server :pointer-void)
(uffi:def-foreign-type oci-error :pointer-void)
(uffi:def-foreign-type oci-svc-ctx :pointer-void)
(uffi:def-foreign-type oci-stmt :pointer-void)

(uffi:def-pointer-var +null-void-pointer+
  (uffi:make-null-pointer :void))
(uffi:def-pointer-var +null-void-pointer-pointer+
  (uffi:make-null-pointer :pointer-void))

;;; Check an OCI return code for erroricity and signal a reasonably
;;; informative condition if so.
;;;
;;; ERRHP provides an error handle which can be used to find
;;; subconditions; if it's not provided, subcodes won't be checked.
;;;
;;; NULLS-OK says that a NULL-VALUE-RETURNED subcondition condition is
;;; normal and needn't cause any signal. An error handle is required
;;; to detect this subcondition, so it doesn't make sense to set ERRHP
;;; unless NULLS-OK is set.

(defmacro def-oci-routine ((c-oci-symbol lisp-oci-fn) c-return &rest c-parms)
  (let ((ll (mapcar (lambda (x) (declare (ignore x)) (gensym)) c-parms))
        (c-oci-fn (intern (concatenate 'string "%" (symbol-name lisp-oci-fn)))))
    `(progn
      (declaim (inline ,c-oci-fn ,lisp-oci-fn))
      (uffi:def-function (,c-oci-symbol ,c-oci-fn)
          ,c-parms
        :returning ,c-return)
      (defun ,lisp-oci-fn (,@ll &key database nulls-ok)
        (let ((result (,c-oci-fn ,@ll)))
          (if (= result #.+oci-success+)
              +oci-success+
              (handle-oci-result result database nulls-ok)))))))


(defmacro def-raw-oci-routine
  ((c-oci-symbol lisp-oci-fn) c-return &rest c-parms)
  (let ((ll (mapcar (lambda (x) (declare (ignore x)) (gensym)) c-parms)))
    `(let ((%lisp-oci-fn (uffi:def-function (,c-oci-symbol ,(intern (concatenate 'string "%" (symbol-name lisp-oci-fn))))
                             ,c-parms
                           :returning ,c-return)))
       (defun ,lisp-oci-fn (,@ll &key database nulls-ok)
         (declare (ignore database nulls-ok))
         (funcall %lisp-oci-fn ,@ll)))))


(def-oci-routine ("OCIInitialize" oci-initialize)
    :int
  (mode ub4)                                    ; ub4
  (ctxp :pointer-void)                  ; dvoid *
  (malocfp :pointer-void)                       ; dvoid *(*)
  (ralocfp :pointer-void)                       ; dvoid *(*)
  (mfreefp (* :pointer-void)))          ; void *(*)


(def-oci-routine ("OCIEnvInit" oci-env-init)
    :int
  (envpp :pointer-void)                         ; OCIEnv **
  (mode ub4)                                    ; ub4
  (xtramem-sz size_t)            ; size_t
  (usermempp (* :pointer-void)))                    ; dvoid **

#-oci7
(def-oci-routine ("OCIEnvCreate" oci-env-create)
    :int
  (envhpp (* :pointer-void))
  (mode ub4)
  (ctxp :pointer-void)
  (malocfp :pointer-void)
  (ralocfp :pointer-void)
  (mfreefp :pointer-void)
  (xtramemsz size_t)
  (usrmempp (* :pointer-void)))

(def-oci-routine ("OCIHandleAlloc" oci-handle-alloc)
    :int
  (parenth      :pointer-void)                  ; const dvoid *
  (hndlpp       (* :pointer-void))              ; dvoid **
  (type         ub4)                            ; ub4
  (xtramem_sz   size_t)                         ; size_t
  (usrmempp     (* :pointer-void)))             ; dvoid **

(def-oci-routine ("OCIServerAttach" oci-server-attach)
    :int
  (srvhp        :pointer-void)                  ; oci-server
  (errhp        :pointer-void)                  ; oci-error
  (dblink       :cstring)                       ; :in
  (dblink-len   sb4)                            ; sb4
  (mode         ub4))                           ; ub4


(def-oci-routine ("OCIHandleFree" oci-handle-free)
    :int
  (p0 :pointer-void) ;; handle
  (p1 ub4)) ;;type

(def-oci-routine ("OCILogon" oci-logon)
    :int
  (envhp        :pointer-void)          ; env
  (errhp        :pointer-void)          ; err
  (svchpp       (* :pointer-void))      ; svc
  (username     (* :unsigned-char))     ; username
  (uname-len    ub4)                    ;
  (passwd       (* :unsigned-char))     ; passwd
  (password-len ub4)                    ;
  (dsn          (* :unsigned-char))     ; datasource
  (dsn-len      ub4))                   ;

(def-oci-routine ("OCILogoff" oci-logoff)
    :int
  (p0   :pointer-void)        ; svc
  (p1   :pointer-void))       ; err

(declaim (inline oci-error-get))
(uffi:def-function ("OCIErrorGet" oci-error-get)
    ((handlp    :pointer-void)
     (recordno  ub4)
     (sqlstate  :cstring)
     (errcodep  (* sb4))
     (bufp      (* :unsigned-char))
     (bufsize   ub4)
     (type      ub4))
  :returning :void)

(def-oci-routine ("OCIStmtPrepare" oci-stmt-prepare)
    :int
  (stmtp      :pointer-void)
  (errhp      :pointer-void)
  (stmt       (* :unsigned-char))
  (stmt_len   ub4)
  (language   ub4)
  (mode       ub4))

(def-oci-routine ("OCIStmtExecute" oci-stmt-execute)
    :int
  (svchp      :pointer-void)
  (stmtp1     :pointer-void)
  (errhp      :pointer-void)
  (iters      ub4)
  (rowoff     ub4)
  (snap_in    :pointer-void)
  (snap_out   :pointer-void)
  (mode       ub4))

(def-raw-oci-routine ("OCIParamGet" oci-param-get)
    :int
  (hndlp      :pointer-void)
  (htype      ub4)
  (errhp      :pointer-void)
  (parmdpp    (* :pointer-void))
  (pos        ub4))

(def-oci-routine ("OCIAttrGet" oci-attr-get)
    :int
  (trgthndlp  :pointer-void)
  (trghndltyp ub4)
  (attributep :pointer-void)
  (sizep      (* ub4))
  (attrtype   ub4)
  (errhp      :pointer-void))

(def-oci-routine ("OCIAttrSet" oci-attr-set)
    :int
  (trgthndlp   :pointer-void)
  (trgthndltyp ub4 :in)
  (attributep  :pointer-void)
  (size        ub4)
  (attrtype    ub4)
  (errhp       oci-error))

(def-oci-routine ("OCIDefineByPos" oci-define-by-pos)
    :int
  (stmtp      :pointer-void)
  (defnpp     (* :pointer-void))
  (errhp      :pointer-void)
  (position   ub4)
  (valuep     :pointer-void)
  (value_sz   sb4)
  (dty        ub2)
  (indp       (* sb2))
  (rlenp      (* ub2))
  (rcodep     (* ub2))
  (mode       ub4))

(def-oci-routine ("OCIStmtFetch" oci-stmt-fetch)
    :int
  (stmthp       :pointer-void)
  (errhp        :pointer-void)
  (p2           ub4)
  (p3           ub2)
  (p4           ub4))


(def-oci-routine ("OCITransStart" oci-trans-start)
  :int
  (svchp        :pointer-void)
  (errhp        :pointer-void)
  (p2           :unsigned-short)
  (p3           :unsigned-short))

(def-oci-routine ("OCITransCommit" oci-trans-commit)
  :int
  (svchp        :pointer-void)
  (errhp        :pointer-void)
  (p2           :unsigned-short))

(def-oci-routine ("OCITransRollback" oci-trans-rollback)
    :int
  (svchp       :pointer-void)
  (errhp        :pointer-void)
  (p2           :unsigned-short))


(def-oci-routine ("OCIServerVersion" oci-server-version)
    :int
    (handlp    :pointer-void)
    (errhp     :pointer-void)
    (bufp      (* :unsigned-char))
    (bufsz     :int)
    (hndltype  :short))



;;; Low-level routines that don't do error checking. They are used
;;; for setting up global environment.

(uffi:def-function "OCIInitialize"
    ((mode ub4)                                 ; ub4
     (ctxp :pointer-void)                       ; dvoid *
     (malocfp :pointer-void)                    ; dvoid *(*)
     (ralocfp :pointer-void)                    ; dvoid *(*)
     (mfreefp (* :pointer-void)))
  :returning :int)

(uffi:def-function "OCIEnvInit"
    ((envpp :pointer-void)                      ; OCIEnv **
     (mode ub4)                                 ; ub4
     (xtramem-sz size_t)                        ; size_t
     (usermempp (* :pointer-void)))
  :returning :int)


(uffi:def-function "OCIHandleAlloc"
    ((parenth      :pointer-void)               ; const dvoid *
     (hndlpp       (* :pointer-void))           ; dvoid **
     (type         ub4)                         ; ub4
     (xtramem_sz   size_t)                      ; size_t
     (usrmempp     (* :pointer-void)))
  :returning :int)

(defstruct oci-handle
  (type :unknown)
  (pointer (uffi:allocate-foreign-object :pointer-void)))

(defvar *oci-initialized* nil)
(defvar *oci-env* nil)

(defvar *oci-handle-types*
  '(:error                              ; error report handle (OCIError)
    :service-context                    ; service context handle (OCISvcCtx)
    :statement                          ; statement (application request) handle (OCIStmt)
    :describe                           ; select list description handle (OCIDescribe)
    :server                             ; server context handle (OCIServer)
    :session                            ; user session handle (OCISession)
    :transaction                        ; transaction context handle (OCITrans)
    :complex-object                     ; complex object retrieval handle (OCIComplexObject)
    :security))                         ; security handle (OCISecurity)



(defun oci-init (&key (mode +oci-default+))
  (let ((x (OCIInitialize mode +null-void-pointer+ +null-void-pointer+
                          +null-void-pointer+ +null-void-pointer-pointer+)))
    (if (= x 0)
        (let ((env (uffi:allocate-foreign-object :pointer-void)))
          (setq *oci-initialized* mode)
          (let ((x (OCIEnvInit env +oci-default+ 0 +null-void-pointer+)))
            (format t ";; OEI: returned ~d~%" x)
            (setq *oci-env* env))))))

(defun oci-check-return (value)
  (when (= value +oci-invalid-handle+)
    (error 'sql-database-error :message "Invalid Handle")))

(defun oci-get-handle (&key type)
  (if (null *oci-initialized*)
      (oci-init))
  (case type
    (:error
     (let ((ptr (uffi:allocate-foreign-object :pointer-void)))
       (let ((x (OCIHandleAlloc
                 (uffi:deref-pointer *oci-env* void-pointer)
                 ptr
                 +oci-default+
                 0
                 +null-void-pointer-pointer+)))
         (oci-check-return x)
         ptr)))
    (:service-context
     "OCISvcCtx")
    (:statement
     "OCIStmt")
    (:describe
     "OCIDescribe")
    (:server
     "OCIServer")
    (:session
     "OCISession")
    (:transaction
     "OCITrans")
    (:complex-object
     "OCIComplexObject")
    (:security
     "OCISecurity")
    (t
     (error 'sql-database-error
            :message
            (format nil "'~s' is not a valid OCI handle type" type)))))

(defun oci-environment ()
  (let ((envhp (oci-get-handle :type :env)))
    (oci-env-init envhp 0 0 +null-void-pointer+)
    envhp))

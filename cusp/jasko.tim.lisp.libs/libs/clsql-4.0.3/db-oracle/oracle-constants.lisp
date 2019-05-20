;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          oracle-constants.lisp
;;;; Purpose:       Constants for CLSQL Oracle interface
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

(defconstant +oci-default+      #x00)   ; default value for parameters and attributes
(defconstant +oci-threaded+     #x01)   ; application is in threaded environment
(defconstant +oci-object+       #x02)   ; the application is in object environment
(defconstant +oci-non-blocking+ #x04)   ; non blocking mode of operation
(defconstant +oci-env-no-mutex+ #x08)   ; the environment handle will not be protected by a mutex internally

;; Handle types

(defconstant +oci-htype-env+    1)      ; environment handle
(defconstant +oci-htype-error+  2)      ; error handle
(defconstant +oci-htype-svcctx+ 3)      ; service handle
(defconstant +oci-htype-stmt+   4)      ; statement handle
(defconstant +oci-htype-bind+   5)      ; bind handle
(defconstant +oci-htype-define+ 6)      ; define handle
(defconstant +oci-htype-describe+ 7)    ; describe handle
(defconstant +oci-htype-server+ 8)      ; server handle
(defconstant +oci-htype-session+ 9)     ; authentication handle
(defconstant +oci-htype-trans+  10)     ; transaction handle
(defconstant +oci-htype-complexobject+ 11) ; complex object retrieval handle
(defconstant +oci-htype-security+ 12)   ; security handle

;; Descriptor types

(defconstant +oci-dtype-lob+               50) ; lob locator
(defconstant +oci-dtype-snap+              51) ; snapshot
(defconstant +oci-dtype-rset+              52) ; result set
(defconstant +oci-dtype-param+             53) ; parameter descriptor obtained from ocigparm
(defconstant +oci-dtype-rowid+             54) ; rowid
(defconstant +oci-dtype-complexobjectcomp+ 55) ; complex object retrieval descriptor
(defconstant +oci-dtype-file+              56) ; File Lob locator
(defconstant +oci-dtype-aqenq-options+     57) ; enqueue options
(defconstant +oci-dtype-aqdeq-options+     58) ; dequeue options
(defconstant +oci-dtype-aqmsg-properties+  59) ; message properties
(defconstant +oci-dtype-aqagent+           60) ; aq agent

;; Objectr pointer types

(defconstant +oci-otype-name+   1)      ; object name
(defconstant +oci-otype-ref+    2)      ; REF to TDO
(defconstant +oci-otype-ptr+    3)      ; PTR to TDO

;; Attribute types

(defconstant +oci-attr-fncode+                  1) ; the OCI function code
(defconstant +oci-attr-object+                  2) ; is the environment initialized in object mode
(defconstant +oci-attr-nonblocking-mode+        3) ; non blocking mode
(defconstant +oci-attr-sqlcode+                 4) ; the SQL verb
(defconstant +oci-attr-env+                     5) ; the environment handle
(defconstant +oci-attr-server+                  6) ; the server handle
(defconstant +oci-attr-session+                 7) ; the user session handle
(defconstant +oci-attr-trans+                   8) ; the transaction handle
(defconstant +oci-attr-row-count+               9) ; the rows processed so far
(defconstant +oci-attr-sqlfncode+              10) ; the SQL verb of the statement
(defconstant +oci-attr-prefetch-rows+          11) ; sets the number of rows to prefetch
(defconstant +oci-attr-nested-prefetch-rows+   12) ; the prefetch rows of nested table
(defconstant +oci-attr-prefetch-memory+        13) ; memory limit for rows fetched
(defconstant +oci-attr-nested-prefetch-memory+ 14) ; memory limit for nested rows
(defconstant +oci-attr-char-count+             15) ; this specifies the bind and define size in characters
(defconstant +oci-attr-pdscl+                  16) ; packed decimal scale
(defconstant +oci-attr-pdfmt+                  17) ; packed decimal format
(defconstant +oci-attr-param-count+            18) ; number of column in the select list
(defconstant +oci-attr-rowid+                  19) ; the rowid
(defconstant +oci-attr-charset+                20) ; the character set value
(defconstant +oci-attr-nchar+                  21) ; NCHAR type
(defconstant +oci-attr-username+               22) ; username attribute
(defconstant +oci-attr-password+               23) ; password attribute
(defconstant +oci-attr-stmt-type+              24) ; statement type
(defconstant +oci-attr-internal-name+          25) ; user friendly global name
(defconstant +oci-attr-external-name+          26) ; the internal name for global txn
(defconstant +oci-attr-xid+                    27) ; XOPEN defined global transaction id
(defconstant +oci-attr-trans-lock+             28) ;
(defconstant +oci-attr-trans-name+             29) ; string to identify a global transaction
(defconstant +oci-attr-heapalloc+              30) ; memory allocated on the heap
(defconstant +oci-attr-charset-id+             31) ; Character Set ID
(defconstant +oci-attr-charset-form+           32) ; Character Set Form
(defconstant +oci-attr-maxdata-size+           33) ; Maximumsize of data on the server
(defconstant +oci-attr-cache-opt-size+         34) ; object cache optimal size
(defconstant +oci-attr-cache-max-size+         35) ; object cache maximum size percentage
(defconstant +oci-attr-pinoption+              36) ; object cache default pin option
(defconstant +oci-attr-alloc-duration+         37) ; object cache default allocation duration
(defconstant +oci-attr-pin-duration+           38) ; object cache default pin duration
(defconstant +oci-attr-fdo+                    39) ; Format Descriptor object attribute
(defconstant +oci-attr-postprocessing-callback+ 40) ; Callback to process outbind data
(defconstant +oci-attr-postprocessing-context+ 41) ; Callback context to process outbind data
(defconstant +oci-attr-rows-returned+          42) ; Number of rows returned in current iter - for Bind handles
(defconstant +oci-attr-focbk+                  43) ; Failover Callback attribute
(defconstant +oci-attr-in-v8-mode+             44) ; is the server/service context in V8 mode
(defconstant +oci-attr-lobempty+               45) ; empty lob ?
(defconstant +oci-attr-sesslang+               46) ; session language handle

;; AQ Attribute Types
;; Enqueue Options

(defconstant +oci-attr-visibility+ 47)  ; visibility
(defconstant +oci-attr-relative-msgid+ 48) ; relative message id
(defconstant +oci-attr-sequence-deviation+ 49) ; sequence deviation

; - Dequeue Options -
    ; consumer name
;#define OCI-ATTR-DEQ-MODE 50
;(defconstant +OCI-ATTR-CONSUMER-NAME           50              + 51)                ; dequeue mode
;#define OCI-ATTR-NAVIGATION            52                     ; navigation
;#define OCI-ATTR-WAIT                  53                           ; wait
;#define OCI-ATTR-DEQ-MSGID             54             ; dequeue message id

; - Message Properties -
(defconstant +OCI-ATTR-PRIORITY+ 55)    ; priority
(defconstant +OCI-ATTR-DELAY+ 56)       ; delay
(defconstant +OCI-ATTR-EXPIRATION+ 57)  ; expiration
(defconstant +OCI-ATTR-CORRELATION+ 58) ; correlation id
(defconstant +OCI-ATTR-ATTEMPTS+ 59)    ; # of attempts
(defconstant +OCI-ATTR-RECIPIENT-LIST+ 60) ; recipient list
(defconstant +OCI-ATTR-EXCEPTION-QUEUE+ 61) ; exception queue name
(defconstant +OCI-ATTR-ENQ-TIME+ 62)    ; enqueue time (only OCIAttrGet)
(defconstant +OCI-ATTR-MSG-STATE+ 63)   ; message state (only OCIAttrGet)

;; AQ Agent
(defconstant +OCI-ATTR-AGENT-NAME+ 64)  ; agent name
(defconstant +OCI-ATTR-AGENT-ADDRESS+ 65) ; agent address
(defconstant +OCI-ATTR-AGENT-PROTOCOL+ 66) ; agent protocol

;- Server handle -
(defconstant +OCI-ATTR-NATIVE-FDES+ 67) ; native cncxn file desc

;-Parameter Attribute Types-

(defconstant +OCI-ATTR-UNK+ 101)        ; unknown attribute
(defconstant +OCI-ATTR-NUM-COLS+ 102)   ; number of columns
(defconstant +OCI-ATTR-LIST-COLUMNS+ 103) ; parameter of the column list
(defconstant +OCI-ATTR-RDBA+ 104)       ; DBA of the segment header
(defconstant +OCI-ATTR-CLUSTERED+ 105)  ; whether the table is clustered
(defconstant +OCI-ATTR-PARTITIONED+ 106) ; whether the table is partitioned
(defconstant +OCI-ATTR-INDEX-ONLY+ 107) ; whether the table is index only
(defconstant +OCI-ATTR-LIST-ARGUMENTS+ 108) ; parameter of the argument list
(defconstant +OCI-ATTR-LIST-SUBPROGRAMS+ 109) ; parameter of the subprogram list
(defconstant +OCI-ATTR-REF-TDO+ 110)    ; REF to the type descriptor
(defconstant +OCI-ATTR-LINK+ 111)       ; the database link name
(defconstant +OCI-ATTR-MIN+ 112)        ; minimum value
(defconstant +OCI-ATTR-MAX+ 113)        ; maximum value
(defconstant +OCI-ATTR-INCR+ 114)       ; increment value
(defconstant +OCI-ATTR-CACHE+ 115)      ; number of sequence numbers cached
(defconstant +OCI-ATTR-ORDER+ 116)      ; whether the sequence is ordered
(defconstant +OCI-ATTR-HW-MARK+ 117)    ; high-water mark
(defconstant +OCI-ATTR-TYPE-SCHEMA+ 118) ; type's schema name
(defconstant +OCI-ATTR-TIMESTAMP+ 119)  ; timestamp of the object
(defconstant +OCI-ATTR-NUM-ATTRS+ 120)  ; number of sttributes
(defconstant +OCI-ATTR-NUM-PARAMS+ 121) ; number of parameters
(defconstant +OCI-ATTR-OBJID+ 122)      ; object id for a table or view
(defconstant +OCI-ATTR-PTYPE+ 123)      ; type of info described by
(defconstant +OCI-ATTR-PARAM+ 124)      ; parameter descriptor
(defconstant +OCI-ATTR-OVERLOAD-ID+ 125) ; overload ID for funcs and procs
(defconstant +OCI-ATTR-TABLESPACE+ 126) ; table name space
(defconstant +OCI-ATTR-TDO+ 127)        ; TDO of a type
(defconstant +OCI-ATTR-PARSE-ERROR-OFFSET+ 128) ; Parse Error offset
;-Credential Types-
(defconstant +OCI-CRED-RDBMS+ 1)        ; database username/password
(defconstant +OCI-CRED-EXT+ 2)          ; externally provided credentials

;; Error Return Values-

(defconstant +oci-continue+             -24200) ; Continue with the body of the OCI function
(defconstant +oci-still-executing+       -3123) ; OCI would block error
(defconstant +oci-invalid-handle+           -2) ; maps to SQL-INVALID-HANDLE
(defconstant +oci-error+                    -1) ; maps to SQL-ERROR
(defconstant +oci-success+                   0) ; maps to SQL-SUCCESS of SAG CLI
(defconstant +oci-success-with-info+         1) ; maps to SQL-SUCCESS-WITH-INFO
(defconstant +oci-need-data+                99) ; maps to SQL-NEED-DATA
(defconstant +oci-no-data+                 100) ; maps to SQL-NO-DATA

;; Parsing Syntax Types-

(defconstant +oci-ntv-syntax+ 1)        ; Use what so ever is the native lang of server
(defconstant +oci-v7-syntax+ 2)         ; V7 language
(defconstant +oci-v8-syntax+ 3)         ; V8 language

;-Scrollable Cursor Options-

(defconstant +oci-fetch-next+           #x02) ; next row
(defconstant +oci-fetch-first+          #x04) ; first row of the result set
(defconstant +oci-fetch-last+           #x08) ; the last row of the result set
(defconstant +oci-fetch-prior+          #x10) ; the previous row relative to current
(defconstant +oci-fetch-absolute+       #x20) ; absolute offset from first
(defconstant +oci-fetch-relative+       #x40) ; offset relative to current

;-Bind and Define Options-

(defconstant +OCI-SB2-IND-PTR+ #x01)    ; unused
(defconstant +OCI-DATA-AT-EXEC+ #x02)   ; data at execute time
(defconstant +OCI-DYNAMIC-FETCH+ #x02)  ; fetch dynamically
(defconstant +OCI-PIECEWISE+ #x04)      ; piecewise DMLs or fetch
;-

;-Execution Modes-
(defconstant +OCI-BATCH-MODE+ #x01)     ; batch the oci statement for execution
(defconstant +OCI-EXACT-FETCH+ #x02)    ; fetch the exact rows specified
(defconstant +OCI-KEEP-FETCH-STATE+ #x04) ; unused
(defconstant +OCI-SCROLLABLE-CURSOR+ #x08) ; cursor scrollable
(defconstant +OCI-DESCRIBE-ONLY+ #x10)  ; only describe the statement
(defconstant +OCI-COMMIT-ON-SUCCESS+ #x20) ; commit, if successful execution
;-

;-Authentication Modes-
(defconstant +OCI-MIGRATE+ #x0001)      ; migratable auth context
(defconstant +OCI-SYSDBA+ #x0002)       ; for SYSDBA authorization
(defconstant +OCI-SYSOPER+ #x0004)      ; for SYSOPER authorization
(defconstant +OCI-PRELIM-AUTH+ #x0008)  ; for preliminary authorization
;-

;-Piece Information-
(defconstant +OCI-PARAM-IN+ #x01)       ; in parameter
(defconstant +OCI-PARAM-OUT+ #x02)      ; out parameter
;-

;- Transaction Start Flags -
; NOTE: OCI-TRANS-JOIN and OCI-TRANS-NOMIGRATE not supported in 8.0.X
(defconstant +OCI-TRANS-NEW+ #x00000001) ; starts a new transaction branch
(defconstant +OCI-TRANS-JOIN+ #x00000002) ; join an existing transaction
(defconstant +OCI-TRANS-RESUME+ #x00000004) ; resume this transaction
(defconstant +OCI-TRANS-STARTMASK+ #x000000ff)


(defconstant +OCI-TRANS-READONLY+ #x00000100) ; starts a readonly transaction
(defconstant +OCI-TRANS-READWRITE+ #x00000200) ; starts a read-write transaction
(defconstant +OCI-TRANS-SERIALIZABLE+ #x00000400)
                                        ; starts a serializable transaction
(defconstant +OCI-TRANS-ISOLMASK+ #x0000ff00)

(defconstant +OCI-TRANS-LOOSE+ #x00010000) ; a loosely coupled branch
(defconstant +OCI-TRANS-TIGHT+ #x00020000) ; a tightly coupled branch
(defconstant +OCI-TRANS-TYPEMASK+ #x000f0000) ;

(defconstant +OCI-TRANS-NOMIGRATE+ #x00100000) ; non migratable transaction

;-

;- Transaction End Flags -
(defconstant +OCI-TRANS-TWOPHASE+ #x01000000) ; use two phase commit
;-

;; AQ Constants
;; NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE
;; The following constants must match the PL/SQL dbms-aq constants
;; NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE NOTE

; - Visibility flags -
(defconstant +OCI-ENQ-IMMEDIATE+ 1)     ; enqueue is an independent transaction
(defconstant +OCI-ENQ-ON-COMMIT+ 2)     ; enqueue is part of current transaction

; - Dequeue mode flags -
(defconstant +OCI-DEQ-BROWSE+ 1)        ; read message without acquiring a lock
(defconstant +OCI-DEQ-LOCKED+ 2)        ; read and obtain write lock on message
(defconstant +OCI-DEQ-REMOVE+ 3)        ; read the message and delete it

; - Dequeue navigation flags -
(defconstant +OCI-DEQ-FIRST-MSG+ 1)     ; get first message at head of queue
(defconstant +OCI-DEQ-NEXT-MSG+ 3)      ; next message that is available
(defconstant +OCI-DEQ-NEXT-TRANSACTION+ 2) ; get first message of next txn group

; - Message states -
(defconstant +OCI-MSG-WAITING+ 1)       ; the message delay has not yet completed
(defconstant +OCI-MSG-READY+ 0)         ; the message is ready to be processed
(defconstant +OCI-MSG-PROCESSED+ 2)     ; the message has been processed
(defconstant +OCI-MSG-EXPIRED+ 3)       ; message has moved to exception queue

; - Sequence deviation -
(defconstant +OCI-ENQ-BEFORE+ 2)        ; enqueue message before another message
(defconstant +OCI-ENQ-TOP+ 3)           ; enqueue message before all messages

; - Visibility flags -
(defconstant +OCI-DEQ-IMMEDIATE+ 1)     ; dequeue is an independent transaction
(defconstant +OCI-DEQ-ON-COMMIT+ 2)     ; dequeue is part of current transaction

; - Wait -
(defconstant +OCI-DEQ-WAIT-FOREVER+ -1) ; wait forever if no message available
(defconstant +OCI-DEQ-NO-WAIT+ 0)       ; do not wait if no message is available

; - Delay -
(defconstant +OCI-MSG-NO-DELAY+ 0)      ; message is available immediately

;; Expiration
(defconstant +OCI-MSG-NO-EXPIRATION+ -1) ; message will never expire

;; Describe Handle Parameter Attributes
;; Attributes common to Columns and Stored Procs

(defconstant +oci-attr-data-size+ 1)    ; maximum size of the data
(defconstant +oci-attr-data-type+ 2)    ; the sql type of the column/argument
(defconstant +oci-attr-disp-size+ 3)    ; the display size
(defconstant +oci-attr-name+      4)    ; the name of the column/argument
(defconstant +oci-attr-precision+ 5)    ; precision if number type
(defconstant +oci-attr-scale+     6)    ; scale if number type
(defconstant +oci-attr-is-null+   7)    ; is it null ?
(defconstant +oci-attr-type-name+ 8)

;; name of the named data type or a package name for package private types

(defconstant +OCI-ATTR-SCHEMA-NAME+ 9)  ; the schema name
(defconstant +OCI-ATTR-SUB-NAME+ 10)    ; type name if package private type
(defconstant +OCI-ATTR-POSITION+ 11)    ; relative position of col/arg in the list of cols/args

; complex object retrieval parameter attributes
(defconstant +OCI-ATTR-COMPLEXOBJECTCOMP-TYPE+ 50) ;
(defconstant +OCI-ATTR-COMPLEXOBJECTCOMP-TYPE-LEVEL+ 51) ;
(defconstant +OCI-ATTR-COMPLEXOBJECT-LEVEL+ 52) ;
(defconstant +OCI-ATTR-COMPLEXOBJECT-COLL-OUTOFLINE+ 53) ;

; Only Columns
(defconstant +OCI-ATTR-DISP-NAME+ 100)  ; the display name

;; stored procs

(defconstant +OCI-ATTR-OVERLOAD+ 210)   ; is this position overloaded
(defconstant +OCI-ATTR-LEVEL+ 211)      ; level for structured types
(defconstant +OCI-ATTR-HAS-DEFAULT+ 212) ; has a default value
(defconstant +OCI-ATTR-IOMODE+ 213)     ; in, out inout
(defconstant +OCI-ATTR-RADIX+ 214)      ; returns a radix
(defconstant +OCI-ATTR-NUM-ARGS+ 215)   ; total number of arguments

;; named type attributes

(defconstant +oci-attr-typecode+                216) ; lobject or collection
(defconstant +oci-attr-collection-typecode+     217) ; varray or nested table
(defconstant +oci-attr-version+                 218) ; user assigned version
(defconstant +oci-attr-is-incomplete-type+      219) ; is this an incomplete type
(defconstant +oci-attr-is-system-type+          220) ; a system type
(defconstant +oci-attr-is-predefined-type+      221) ; a predefined type
(defconstant +oci-attr-is-transient-type+       222) ; a transient type
(defconstant +oci-attr-is-system-generated-type+ 223) ; system generated type
(defconstant +oci-attr-has-nested-table+        224) ; contains nested table attr
(defconstant +oci-attr-has-lob+                 225) ; has a lob attribute
(defconstant +oci-attr-has-file+                226) ; has a file attribute
(defconstant +oci-attr-collection-element+      227) ; has a collection attribute
(defconstant +oci-attr-num-type-attrs+          228) ; number of attribute types
(defconstant +oci-attr-list-type-attrs+         229) ; list of type attributes
(defconstant +oci-attr-num-type-methods+        230) ; number of type methods
(defconstant +oci-attr-list-type-methods+       231) ; list of type methods
(defconstant +oci-attr-map-method+              232) ; map method of type
(defconstant +oci-attr-order-method+            233) ; order method of type

; only collection element
(defconstant +OCI-ATTR-NUM-ELEMS+ 234)  ; number of elements

; only type methods
(defconstant +OCI-ATTR-ENCAPSULATION+ 235) ; encapsulation level
(defconstant +OCI-ATTR-IS-SELFISH+ 236) ; method selfish
(defconstant +OCI-ATTR-IS-VIRTUAL+ 237) ; virtual
(defconstant +OCI-ATTR-IS-INLINE+ 238)  ; inline
(defconstant +OCI-ATTR-IS-CONSTANT+ 239) ; constant
(defconstant +OCI-ATTR-HAS-RESULT+ 240) ; has result
(defconstant +OCI-ATTR-IS-CONSTRUCTOR+ 241) ; constructor
(defconstant +OCI-ATTR-IS-DESTRUCTOR+ 242) ; destructor
(defconstant +OCI-ATTR-IS-OPERATOR+ 243) ; operator
(defconstant +OCI-ATTR-IS-MAP+ 244)     ; a map method
(defconstant +OCI-ATTR-IS-ORDER+ 245)   ; order method
(defconstant +OCI-ATTR-IS-RNDS+ 246)    ; read no data state method
(defconstant +OCI-ATTR-IS-RNPS+ 247)    ; read no process state
(defconstant +OCI-ATTR-IS-WNDS+ 248)    ; write no data state method
(defconstant +OCI-ATTR-IS-WNPS+ 249)    ; write no process state

; describing public objects
(defconstant +OCI-ATTR-DESC-PUBLIC+ 250) ; public object
;-

;-OCIPasswordChange-
(defconstant +OCI-AUTH+ #x08)           ; Change the password but do not login


;-Other Constants-
(defconstant +OCI-MAX-FNS+ 100)         ; max number of OCI Functions
(defconstant +OCI-SQLSTATE-SIZE+ 5)     ;
(defconstant +OCI-ERROR-MAXMSG-SIZE+ 1024) ; max size of an error message
;; (defconstant +OCI-LOBMAXSIZE+ 4MAXVAL)       ; maximum lob data size
(defconstant +OCI-ROWID-LEN+ 23)        ;
;-

;- Fail Over Events -
(defconstant +OCI-FO-END+ #x00000001)   ;
(defconstant +OCI-FO-ABORT+ #x00000002) ;
(defconstant +OCI-FO-REAUTH+ #x00000004) ;
(defconstant +OCI-FO-BEGIN+ #x00000008) ;
(defconstant +OCI-FO-ERROR+ #x00000010) ;
;-

;- Fail Over Types -
(defconstant +OCI-FO-NONE+ #x00000001)  ;
(defconstant +OCI-FO-SESSION+ #x00000002) ;
(defconstant +OCI-FO-SELECT+ #x00000004) ;
(defconstant +OCI-FO-TXNAL+ #x00000008) ;
;-

;-Function Codes-
(defconstant +OCI-FNCODE-INITIALIZE+ 1) ; OCIInitialize
(defconstant +OCI-FNCODE-HANDLEALLOC+ 2) ; OCIHandleAlloc
(defconstant +OCI-FNCODE-HANDLEFREE+ 3) ; OCIHandleFree
(defconstant +OCI-FNCODE-DESCRIPTORALLOC+ 4) ; OCIDescriptorAlloc
(defconstant +OCI-FNCODE-DESCRIPTORFREE+ 5) ; OCIDescriptorFree
(defconstant +OCI-FNCODE-ENVINIT+ 6)    ; OCIEnvInit
(defconstant +OCI-FNCODE-SERVERATTACH+ 7) ; OCIServerAttach
(defconstant +OCI-FNCODE-SERVERDETACH+ 8) ; OCIServerDetach
; unused         9
(defconstant +OCI-FNCODE-SESSIONBEGIN+ 10) ; OCISessionBegin
(defconstant +OCI-FNCODE-SESSIONEND+ 11) ; OCISessionEnd
(defconstant +OCI-FNCODE-PASSWORDCHANGE+ 12) ; OCIPasswordChange
(defconstant +OCI-FNCODE-STMTPREPARE+ 13) ; OCIStmtPrepare
                                                      ; unused       14- 16
(defconstant +OCI-FNCODE-BINDDYNAMIC+ 17) ; OCIBindDynamic
(defconstant +OCI-FNCODE-BINDOBJECT+ 18) ; OCIBindObject
                                                                ; 19 unused
(defconstant +OCI-FNCODE-BINDARRAYOFSTRUCT+ 20) ; OCIBindArrayOfStruct
(defconstant +OCI-FNCODE-STMTEXECUTE+ 21) ; OCIStmtExecute
                                                             ; unused 22-24
(defconstant +OCI-FNCODE-DEFINEOBJECT+ 25) ; OCIDefineObject
(defconstant +OCI-FNCODE-DEFINEDYNAMIC+ 26) ; OCIDefineDynamic
(defconstant +OCI-FNCODE-DEFINEARRAYOFSTRUCT+ 27) ; OCIDefineArrayOfStruct
(defconstant +OCI-FNCODE-STMTFETCH+ 28) ; OCIStmtFetch
(defconstant +OCI-FNCODE-STMTGETBIND+ 29) ; OCIStmtGetBindInfo
                                                            ; 30, 31 unused
(defconstant +OCI-FNCODE-DESCRIBEANY+ 32) ; OCIDescribeAny
(defconstant +OCI-FNCODE-TRANSSTART+ 33) ; OCITransStart
(defconstant +OCI-FNCODE-TRANSDETACH+ 34) ; OCITransDetach
(defconstant +OCI-FNCODE-TRANSCOMMIT+ 35) ; OCITransCommit
                                                                ; 36 unused
(defconstant +OCI-FNCODE-ERRORGET+ 37)  ; OCIErrorGet
(defconstant +OCI-FNCODE-LOBOPENFILE+ 38) ; OCILobFileOpen
(defconstant +OCI-FNCODE-LOBCLOSEFILE+ 39) ; OCILobFileClose
                                             ; 40 was LOBCREATEFILE, unused
                                         ; 41 was OCILobFileDelete, unused
(defconstant +OCI-FNCODE-LOBCOPY+ 42)   ; OCILobCopy
(defconstant +OCI-FNCODE-LOBAPPEND+ 43) ; OCILobAppend
(defconstant +OCI-FNCODE-LOBERASE+ 44)  ; OCILobErase
(defconstant +OCI-FNCODE-LOBLENGTH+ 45) ; OCILobGetLength
(defconstant +OCI-FNCODE-LOBTRIM+ 46)   ; OCILobTrim
(defconstant +OCI-FNCODE-LOBREAD+ 47)   ; OCILobRead
(defconstant +OCI-FNCODE-LOBWRITE+ 48)  ; OCILobWrite
                                                                ; 49 unused
(defconstant +OCI-FNCODE-SVCCTXBREAK+ 50) ; OCIBreak
(defconstant +OCI-FNCODE-SERVERVERSION+ 51) ; OCIServerVersion
; unused 52, 53
(defconstant +OCI-FNCODE-ATTRGET+ 54)   ; OCIAttrGet
(defconstant +OCI-FNCODE-ATTRSET+ 55)   ; OCIAttrSet
(defconstant +OCI-FNCODE-PARAMSET+ 56)  ; OCIParamSet
(defconstant +OCI-FNCODE-PARAMGET+ 57)  ; OCIParamGet
(defconstant +OCI-FNCODE-STMTGETPIECEINFO+ 58) ; OCIStmtGetPieceInfo
(defconstant +OCI-FNCODE-LDATOSVCCTX+ 59) ; OCILdaToSvcCtx
                                                                ; 60 unused
(defconstant +OCI-FNCODE-STMTSETPIECEINFO+ 61) ; OCIStmtSetPieceInfo
(defconstant +OCI-FNCODE-TRANSFORGET+ 62) ; OCITransForget
(defconstant +OCI-FNCODE-TRANSPREPARE+ 63) ; OCITransPrepare
(defconstant +OCI-FNCODE-TRANSROLLBACK+ 64) ; OCITransRollback
(defconstant +OCI-FNCODE-DEFINEBYPOS+ 65) ; OCIDefineByPos
(defconstant +OCI-FNCODE-BINDBYPOS+ 66) ; OCIBindByPos
(defconstant +OCI-FNCODE-BINDBYNAME+ 67) ; OCIBindByName
(defconstant +OCI-FNCODE-LOBASSIGN+ 68) ; OCILobAssign
(defconstant +OCI-FNCODE-LOBISEQUAL+ 69) ; OCILobIsEqual
(defconstant +OCI-FNCODE-LOBISINIT+ 70) ; OCILobLocatorIsInit
; 71 was lob locator size in beta2
(defconstant +OCI-FNCODE-LOBENABLEBUFFERING+ 71) ; OCILobEnableBuffering
(defconstant +OCI-FNCODE-LOBCHARSETID+ 72) ; OCILobCharSetID
(defconstant +OCI-FNCODE-LOBCHARSETFORM+ 73) ; OCILobCharSetForm
(defconstant +OCI-FNCODE-LOBFILESETNAME+ 74) ; OCILobFileSetName
(defconstant +OCI-FNCODE-LOBFILEGETNAME+ 75) ; OCILobFileGetName
(defconstant +OCI-FNCODE-LOGON+ 76)     ; OCILogon
(defconstant +OCI-FNCODE-LOGOFF+ 77)    ; OCILogoff
(defconstant +OCI-FNCODE-LOBDISABLEBUFFERING+ 78) ; OCILobDisableBuffering
(defconstant +OCI-FNCODE-LOBFLUSHBUFFER+ 79) ; OCILobFlushBuffer
(defconstant +OCI-FNCODE-LOBLOADFROMFILE+ 80) ; OCILobLoadFromFile


;-

;- FILE open modes -
(defconstant +OCI-FILE-READONLY+ 1)     ; readonly mode open for FILE types
;-

;- LOB Buffering Flush Flags -
(defconstant +OCI-LOB-BUFFER-FREE+ 1)   ;
(defconstant +OCI-LOB-BUFFER-NOFREE+ 2) ;
;-

;- OCI Statement Types -

(defconstant +oci-stmt-select+ 1)       ; select statement
(defconstant +oci-stmt-update+ 2)       ; update statement
(defconstant +oci-stmt-delete+ 3)       ; delete statement
(defconstant +oci-stmt-insert+ 4)       ; insert statement
(defconstant +oci-stmt-create+ 5)       ; create statement
(defconstant +oci-stmt-drop+ 6)         ; drop statement
(defconstant +oci-stmt-alter+ 7)        ; alter statement
(defconstant +oci-stmt-begin+ 8)        ; begin ... (pl/sql statement)
(defconstant +oci-stmt-declare+ 9)      ; declare .. (pl/sql statement )
;-

;- OCI Parameter Types -
(defconstant +OCI-PTYPE-UNK+ 0)         ; unknown
(defconstant +OCI-PTYPE-TABLE+ 1)       ; table
(defconstant +OCI-PTYPE-VIEW+ 2)        ; view
(defconstant +OCI-PTYPE-PROC+ 3)        ; procedure
(defconstant +OCI-PTYPE-FUNC+ 4)        ; function
(defconstant +OCI-PTYPE-PKG+ 5)         ; package
(defconstant +OCI-PTYPE-TYPE+ 6)        ; user-defined type
(defconstant +OCI-PTYPE-SYN+ 7)         ; synonym
(defconstant +OCI-PTYPE-SEQ+ 8)         ; sequence
(defconstant +OCI-PTYPE-COL+ 9)         ; column
(defconstant +OCI-PTYPE-ARG+ 10)        ; argument
(defconstant +OCI-PTYPE-LIST+ 11)       ; list
(defconstant +OCI-PTYPE-TYPE-ATTR+ 12)  ; user-defined type's attribute
(defconstant +OCI-PTYPE-TYPE-COLL+ 13)  ; collection type's element
(defconstant +OCI-PTYPE-TYPE-METHOD+ 14) ; user-defined type's method
(defconstant +OCI-PTYPE-TYPE-ARG+ 15)   ; user-defined type method's argument
(defconstant +OCI-PTYPE-TYPE-RESULT+ 16) ; user-defined type method's result
;-

;- OCI List Types -
(defconstant +OCI-LTYPE-UNK+ 0)         ; unknown
(defconstant +OCI-LTYPE-COLUMN+ 1)      ; column list
(defconstant +OCI-LTYPE-ARG-PROC+ 2)    ; procedure argument list
(defconstant +OCI-LTYPE-ARG-FUNC+ 3)    ; function argument list
(defconstant +OCI-LTYPE-SUBPRG+ 4)      ; subprogram list
(defconstant +OCI-LTYPE-TYPE-ATTR+ 5)   ; type attribute
(defconstant +OCI-LTYPE-TYPE-METHOD+ 6) ; type method
(defconstant +OCI-LTYPE-TYPE-ARG-PROC+ 7) ; type method w/o result argument list
(defconstant +OCI-LTYPE-TYPE-ARG-FUNC+ 8) ; type method w/result argument list

;; typecodes


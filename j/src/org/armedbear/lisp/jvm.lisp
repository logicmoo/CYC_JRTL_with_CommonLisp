;;; jvm.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: jvm.lisp,v 1.3 2003-10-25 16:36:48 piso Exp $
;;;
;;; This program is free software; you can redistribute it and/or
;;; modify it under the terms of the GNU General Public License
;;; as published by the Free Software Foundation; either version 2
;;; of the License, or (at your option) any later version.
;;;
;;; This program is distributed in the hope that it will be useful,
;;; but WITHOUT ANY WARRANTY; without even the implied warranty of
;;; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;;; GNU General Public License for more details.
;;;
;;; You should have received a copy of the GNU General Public License
;;; along with this program; if not, write to the Free Software
;;; Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

(require 'transform)

(in-package "JVM")

(export '(jvm-compile jvm-compile-package))

(defvar *instructions*
  '(nop             aconst_null  iconst_m1       iconst_0      iconst_1     ;   0
    iconst_2        iconst_3     iconst_4        iconst_5      lconst_0     ;   5
    lconst_1        fconst_0     fconst_1        fconst_2      dconst_0     ;  10
    dconst_1        bipush       sipush          ldc           ldc_w        ;  15
    ldc2_w          iload        lload           fload         dload        ;  20
    aload           iload_0      iload_1         iload_2       iload_3      ;  25
    lload_0         lload_1      lload_2         lload_3       fload_0      ;  30
    fload_1         fload_2      fload_3         dload_0       dload_1      ;  35
    dload_2         dload_3      aload_0         aload_1       aload_2      ;  40
    aload_3         iaload       laload          faload        daload       ;  45
    aaload          baload       caload          saload        istore       ;  50
    lstore          fstore       dstore          astore        istore_0     ;  55
    istore_1        istore_2     istore_3        lstore_0      lstore_1     ;  60
    lstore_2        lstore_3     fstore_0        fstore_1      fstore_2     ;  65
    fstore_3        dstore_0     dstore_1        dstore_2      dstore_3     ;  70
    astore_0        astore_1     astore_2        astore_3      iastore      ;  75
    lastore         fastore      dastore         aastore       bastore      ;  80
    castore         sastore      pop             pop2          dup          ;  85
    dup_x1          dup_x2       dup2            dup2_x1       dup2_x2      ;  90
    swap            iadd         ladd            fadd          dadd         ;  95
    isub            lsub         fsub            dsub          imul         ; 100
    lmul            fmul         dmul            idiv          ldiv         ; 105
    fdiv            ddiv         irem            lrem          frem         ; 110
    drem            ineg         lneg            fneg          dneg         ; 115
    ishl            lshl         ishr            lshr          iushr        ; 120
    lushr           iand         land            ior           lor          ; 125
    ixor            lxor         iinc            i2l           i2f          ; 130
    i2d             l2i          l2f             l2d           f2i          ; 135
    f2l             f2d          d2i             d2l           d2f          ; 140
    i2b             i2c          i2s             lcmp          fcmpl        ; 145
    fcmpg           dcmpl        dcmpg           ifeq          ifne         ; 150
    iflt            ifge         ifgt            ifle          if_icmpeq    ; 155
    if_icmpne       if_icmplt    if_icmpge       if_icmpgt     if_icmple    ; 160
    if_acmpeq       if_acmpne    goto            jsr           ret          ; 165
    tableswitch     lookupswitch ireturn         lreturn       freturn      ; 170
    dreturn         areturn      return          getstatic     putstatic    ; 175
    getfield        putfield     invokevirtual   invokespecial invokestatic ; 180
    invokeinterface unused       new             newarray      anewarray    ; 185
    arraylength     athrow       checkcast       instanceof    monitorenter ; 190
    monitorexit     wide         multianewarray  ifnull        ifnonnull    ; 195
    goto_w          jsr_w        label                                      ; 200
    ))

(unless (vectorp *instructions*)
  (let* ((list *instructions*)
         (vector (make-array (length *instructions*)))
         (index 0))
    (dolist (instr list)
      (setf (get instr 'opcode) index)
      (setf (svref vector index) instr)
      (incf index))
    (setq *instructions* vector)))

(defun instr (opcode)
  (svref *instructions* opcode))

(defparameter *opcode-size*
  ;; 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9
  '#(1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 2 3 2 3  ;; 000-019
     3 2 2 2 2 2 1 1 1 1 1 1 1 1 1 1 1 1 1 1  ;; 020-039
     1 1 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 1  ;; 040-059
     1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1  ;; 060-079
     1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1  ;; 080-099
     1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1  ;; 100-119
     1 1 1 1 1 1 1 1 1 1 1 1 3 1 1 1 1 1 1 1  ;; 120-139
     1 1 1 1 1 1 1 1 1 1 1 1 1 3 3 3 3 3 3 3  ;; 140-159
     3 3 3 3 3 3 3 3 3 2 0 0 1 1 1 1 1 1 3 3  ;; 160-179
     3 3 3 3 3 5 0 3 2 3 1 1 3 3 1 1 0 4 3 3  ;; 180-199
     5 5 0                                    ;; 200-202
     ))

(defun opcode-size (opcode)
  (svref *opcode-size* opcode))

(defvar *pool* nil)

(defun read-u1 (stream)
  (read-byte stream))

(defun read-u2 (stream)
  (+ (ash (read-byte stream) 8) (read-byte stream)))

(defun read-u4 (stream)
  (+ (ash (read-u2 stream) 16) (read-u2 stream)))

(defun lookup-utf8 (index)
  (let ((entry (svref *pool* index)))
    (when (eql (car entry) 1)
      (caddr entry))))

(defun read-constant-pool-entry (stream)
  (let ((tag (read-u1 stream))
        info)
    (case tag
      ((7 8)
       (list tag (read-u2 stream)))
      (1
       (let* ((len (read-u2 stream))
              (s (make-string len)))
         (dotimes (i len)
;;            (setf (char s i) (coerce (read-u1 stream) 'character)))
           (setf (char s i) (code-char (read-u1 stream))))
         (list tag len s)))
      ((3 4)
       (list tag (read-u4 stream)))
      ((5 6)
       (list tag (read-u4 stream) (read-u4 stream)))
      ((12 9 10 11)
       (list tag (read-u2 stream) (read-u2 stream)))
      (t
       (error "READ-CONSTANT-POOL-ENTRY unhandled tag ~D" tag)))))

(defvar *indent* 0)

(defparameter *spaces* (make-string 256 :initial-element #\space))

(defmacro out (&rest args)
  `(progn (format t (subseq *spaces* 0 *indent*)) (format t ,@args)))

(defun dump-code (code)
  (let ((code-length (length code)))
    (do ((i 0))
        ((>= i code-length))
      (let* ((opcode (svref code i))
             (size (opcode-size opcode)))
        (out "~D (#x~X) ~A~%" opcode opcode (instr opcode))
        (incf i)
        (dotimes (j (1- size))
          (let ((byte (svref code i)))
            (out "~D (#x~X)~%" byte byte))
          (incf i))))))

(defun dump-code-attribute (stream)
  (let ((*indent* (+ *indent* 2)))
    (out "Stack: ~D~%" (read-u2 stream))
    (out "Locals: ~D~%" (read-u2 stream))
    (let* ((code-length (read-u4 stream))
           (code (make-array code-length)))
      (out "Code length: ~D~%" code-length)
      (out "Code:~%")
      (dotimes (i code-length)
        (setf (svref code i) (read-u1 stream)))
      (let ((*indent* (+ *indent* 2)))
        (dump-code code)))
    (let ((exception-table-length (read-u2 stream)))
      (out "Exception table length: ~D~%" exception-table-length)
      (let ((*indent* (+ *indent* 2)))
        (dotimes (i exception-table-length)
          (out "Start PC: ~D~%" (read-u2 stream))
          (out "End PC: ~D~%" (read-u2 stream))
          (out "Handler PC: ~D~%" (read-u2 stream))
          (out "Catch type: ~D~%" (read-u2 stream)))))
    (let ((attributes-count (read-u2 stream)))
      (out "Number of attributes: ~D~%" attributes-count)
      (let ((*indent* (+ *indent* 2)))
        (dotimes (i attributes-count)
          (read-attribute i stream))))))

(defun dump-exceptions (stream)
  )

(defun read-attribute (index stream)
  (let* ((name-index (read-u2 stream))
         (length (read-u4 stream))
         (*indent (+ *indent* 2)))
    (setq name (lookup-utf8 name-index))
    (out "Attribute ~D: Name index: ~D (~S)~%" index name-index name)
    (out "Attribute ~D: Length: ~D~%" index length)
    (cond ((string= name "Code")
           (dump-code-attribute stream))
          ((string= name "Exceptions")
           (let ((count (read-u2 stream)))
             (out "Attribute ~D: Number of exceptions: ~D~%" index count)
             (let ((*indent* (+ *indent* 2)))
               (dotimes (i count)
                 (out "Exception ~D: ~D~%" i (read-u2 stream))))))
          (t
           (dotimes (i length)
             (read-u1 stream))))))

(defun read-info (index stream type)
  (let* ((access-flags (read-u2 stream))
         (name-index (read-u2 stream))
         (descriptor-index (read-u2 stream))
         (attributes-count (read-u2 stream))
         (*indent* (+ *indent* 2))
         (type (case type
                 ('field "Field")
                 ('method "Method")))
         name)
    (out "~A ~D: Access flags: #x~X~%" type index access-flags)
    (out "~A ~D: Name index: ~D (~S)~%" type index name-index (lookup-utf8 name-index))
    (out "~A ~D: Descriptor index: ~D~%" type index descriptor-index)
    (out "~A ~D: Number of attributes: ~D~%" type index attributes-count)
    (let ((*indent* (+ *indent* 2)))
      (dotimes (i attributes-count)
        (read-attribute i stream)))))

(defun dump-class (filename)
  (let ((*indent* 0)
        (*pool* nil))
    (with-open-file (stream filename :direction :input :element-type 'unsigned-byte)
      (handler-bind ((end-of-file
                      #'(lambda (c) (return-from dump-class c))))
        (out "Magic number: #x~X~%" (read-u4 stream))
        (let ((minor (read-u2 stream))
              (major (read-u2 stream)))
          (out "Version: ~D.~D~%" major minor))
        ;; Constant pool.
        (let ((count (read-u2 stream))
              entry type)
          (out "Constant pool (~D entries):~%" count)
          (setq *pool* (make-array count))
          (let ((*indent* (+ *indent* 2)))
            (dotimes (index (1- count))
              (setq entry (read-constant-pool-entry stream))
              (setf (svref *pool* (1+ index)) entry)
              (setq type (case (car entry)
                           (7 'class)
                           (9 'field)
                           (10 'method)
                           (11 'interface)
                           (8 'string)
                           (3 'integer)
                           (4 'float)
                           (5 'long)
                           (6 'double)
                           (12 'name-and-type)
                           (1 'utf8)))
              (out "~D: ~A ~S~%" (1+ index) type entry))))
        (out "Access flags: #x~X~%" (read-u2 stream))
        (out "This class: ~D~%" (read-u2 stream))
        (out "Superclass: ~D~%" (read-u2 stream))
        ;; Interfaces.
        (let ((count (read-u2 stream)))
          (cond ((zerop count)
                 (out "No interfaces~%"))
                (t
                 (out "Interfaces (~D):~%" count)
                 (dotimes (i count)
                   (out "  ~D: ~D~%" i (read-u2 stream))))))
        ;; Fields.
        (let ((count (read-u2 stream)))
          (cond ((zerop count)
                 (out "No fields~%"))
                (t
                 (out "Fields (~D):~%" count)))
          (dotimes (index count)
            (read-info index stream 'field)))
        ;; Methods.
        (let ((count (read-u2 stream)))
          (cond ((zerop count)
                 (out "No methods~%"))
                (t
                 (out "Methods (~D):~%" count)))
          (dotimes (index count)
            (read-info index stream 'method)))
        (let ((count (read-u2 stream)))
          (cond ((zerop count)
                 (out "No attributes~%"))
                (t
                 (out "Attributes (~D):~%" count)))))))
  t)

(defvar *stream* nil)
(defvar *defun-name* nil)
(defvar *this-class* nil)
(defvar *pool-count* 1)

(defvar *code* ())
(defvar *static-code* ())
(defvar *fields* ())

(defvar *blocks* ())
(defvar *locals* ())
(defvar *max-locals* 0)

(defvar *args* nil)
(defvar *using-arg-array* nil)
(defvar *hairy-arglist-p* nil)

(defvar *val* ()) ; index of value register

(defun clear ()
  (setq *pool* nil
        *pool-count* 1
        *code* nil)
  t)

(defun dump-pool ()
  (let ((pool (reverse *pool*))
        entry)
    (dotimes (index (1- *pool-count*))
      (setq entry (car pool))
      (setq type (case (car entry)
                   (7 'class)
                   (9 'field)
                   (10 'method)
                   (11 'interface)
                   (8 'string)
                   (3 'integer)
                   (4 'float)
                   (5 'long)
                   (6 'double)
                   (12 'name-and-type)
                   (1 'utf8)))
      (format t "~D: ~A ~S~%" (1+ index) type entry)
      (setq pool (cdr pool))))
  t)

;; Returns index of entry (1-based).
(defun pool-add (entry)
  (setq *pool* (cons entry *pool*))
  (prog1
    *pool-count*
    (incf *pool-count*)))

;; Returns index of entry (1-based).
(defun pool-find-entry (entry)
  (do* ((remaining *pool* (cdr remaining))
        (i 0 (1+ i))
        (current (car remaining) (car remaining)))
       ((null remaining) nil)
    (when (equal current entry)
      (return-from pool-find-entry (- *pool-count* 1 i)))))

;; Adds entry if not already in pool. Returns index of entry (1-based).
(defun pool-get (entry)
  (or (pool-find-entry entry) (pool-add entry)))

(defun pool-name (name)
  (pool-get (list 1 (length name) name)))

;; "org.armedbear.lisp.LispObject" => "Lorg/armedbear/lisp/LispObject;"
;; (defun type-descriptor (type)
;;   (unless (find #\. type)
;;     (setq type (concatenate 'string "org.armedbear.lisp." type)))
;;   (let ((res (concatenate 'string "L" type ";")))
;;     (dotimes (i (length res))
;;       (when (eql (char res i) #\.)
;;         (setf (char res i) #\/)))
;;     res))

(defun pool-name-and-type (name type)
  (let* ((name-index (pool-name name))
         (type-index (pool-name type)))
    (pool-get (list 12 name-index type-index))))

(defun pool-class (class-name)
  (let ((class-name class-name))
    (dotimes (i (length class-name))
      (when (eql (char class-name i) #\.)
        (setf (char class-name i) #\/)))
    (pool-get (list 7 (pool-name class-name)))))

;; (tag class-index name-and-type-index)
(defun pool-field (class-name field-name type-name)
  (let* ((class-index (pool-class class-name))
         (name-and-type-index (pool-name-and-type field-name type-name)))
    (pool-get (list 9 class-index name-and-type-index))))

;; (tag class-index name-and-type-index)
(defun pool-method (class-name method-name type-name)
  (let* ((class-index (pool-class class-name))
         (name-and-type-index (pool-name-and-type method-name type-name)))
    (pool-get (list 10 class-index name-and-type-index))))

(defun pool-string (string)
  (pool-get (list 8 (pool-name string))))

(defun u2 (n)
  (list (ash n -8) (logand n #xff)))

(defstruct instruction opcode args stack)

(defun inst (opcode &optional args)
  (unless (listp args)
    (setq args (list args)))
  (make-instruction :opcode opcode :args args :stack 0))

(defun emit (instr &rest args)
  (unless (numberp instr)
    (setq instr (get instr 'opcode)))
  (setq *code* (cons (inst instr args) *code*)))

(defmacro emit-store-value ()
  `(case *val*
     (0
      (emit 'astore_0))
     (1
      (emit 'astore_1))
     (2
      (emit 'astore_2))
     (3
      (emit 'astore_3))
     (t
      (emit 'astore *val*))))

(defmacro emit-push-value ()
  `(case *val*
     (0
      (emit 'aload_0))
     (1
      (emit 'aload_1))
     (2
      (emit 'aload_2))
     (3
      (emit 'aload_3))
     (t
      (emit 'aload *val*))))

(defun remove-store-value ()
  (let* ((instruction (car *code*))
         (opcode (instruction-opcode instruction))
         slot)
    (case opcode
      (75
       (setf slot 0))
      (76
       (setf slot 1))
      (77
       (setf slot 2))
      (78
       (setf slot 3))
      (58
       (setf slot (car (instruction-args instruction)))))
    (when (and slot (= slot *val*))
      (setf *code* (cdr *code*))
      t)))

(defconstant +lisp-class+ "org/armedbear/lisp/Lisp")

(defconstant +lisp-object-class+ "org/armedbear/lisp/LispObject")
(defconstant +lisp-object+ "Lorg/armedbear/lisp/LispObject;")

(defconstant +lisp-string+ "Lorg/armedbear/lisp/LispString;")

(defconstant +lisp-thread-class+ "org/armedbear/lisp/LispThread")

(defun emit-push-nil ()
  (emit 'getstatic
        +lisp-class+
        "NIL"
        +lisp-object+))

(defun emit-push-t ()
  (emit 'getstatic
        +lisp-class+
        "T"
        "Lorg/armedbear/lisp/Symbol;"))

(defun emit-clear-values ()
  (emit 'invokestatic
        +lisp-thread-class+
        "currentThread"
        "()Lorg/armedbear/lisp/LispThread;")
  (emit 'invokevirtual
        +lisp-thread-class+
        "clearValues"
        "()V"))

(defun emit-invoke-method (method-name)
  (unless (remove-store-value)
    (emit-push-value))
  (emit 'invokevirtual
        +lisp-object-class+
        method-name
        "()Lorg/armedbear/lisp/LispObject;")
  (emit-store-value))

;; CODE is a list.
(defun resolve-args (instruction)
  (let ((opcode (instruction-opcode instruction))
        (args (instruction-args instruction)))
    (case opcode
      ((1 ; ACONST_NULL
        42 ; ALOAD_0
        43 ; ALOAD_1
        44 ; ALOAD_2
        45 ; ALOAD_3
        50 ; AALOAD
        75 ; ASTORE_0
        76 ; ASTORE_1
        77 ; ASTORE_2
        78 ; ASTORE_3
        83 ; AASTORE
        87 ; POP
        89 ; DUP
        95 ; SWAP
        153 ; IFEQ
        154 ; IFNE
        166 ; IF_ACMPNE
        165 ; IF_ACMPEQ
        167 ; GOTO
        176 ; ARETURN
        177 ; RETURN
        202 ; LABEL
        )
       instruction)
      (25 ; ALOAD
       (let ((index (car args)))
         (cond ((= index 0)
                (inst 42)) ; ALOAD_O
               ((= index 1)
                (inst 43)) ; ALOAD_1
               ((= index 2)
                (inst 44)) ; ALOAD_2
               ((= index 3)
                (inst 45)) ; ALOAD_3
               ((<= 0 index 255)
                (inst 25 index))
               (t
                (error "ALOAD unsupported case")))))
      (58 ; ASTORE
       (let ((index (car args)))
         (cond ((= index 0)
                (inst 75)) ; ASTORE_O
               ((= index 1)
                (inst 76)) ; ASTORE_1
               ((= index 2)
                (inst 77)) ; ASTORE_2
               ((= index 3)
                (inst 78)) ; ASTORE_3
               ((<= 0 index 255)
                (inst 58 index))
               (t
                (error "ASTORE unsupported case")))))
      ((178 ; GETSTATIC class-name field-name type-name
        179 ; PUTSTATIC class-name field-name type-name
        )
       (let ((index (pool-field (first args) (second args) (third args))))
         (inst opcode (u2 index))))
      ((182 ; INVOKEVIRTUAL class-name method-name descriptor
        183 ; INVOKESPECIAL class-name method-name descriptor
        184 ; INVOKESTATIC class-name method-name descriptor
        )
       (let ((index (pool-method (first args) (second args) (third args))))
         (inst opcode (u2 index))))
      ((189 ; ANEWARRAY class-name
        )
       (let ((index (pool-class (first args))))
         (inst opcode (u2 index))))
      ((16 ; BIPUSH
        17 ; SIPUSH
        )
       (let ((n (first args)))
         (cond ((= n 0)
                (inst 3)) ; ICONST_0
               ((= n 1)
                (inst 4)) ; ICONST_1
               ((= n 2)
                (inst 5)) ; ICONST_2
               ((= n 3)
                (inst 6)) ; ICONST_3
               ((= n 4)
                (inst 7)) ; ICONST_4
               ((= n 5)
                (inst 8)) ; ICONST_5
               ((<= -128 n 127)
                (inst 16 (logand n #xff))) ; BIPUSH
               (t ; SIPUSH
                (inst 17 (u2 n))))))
      (18 ; LDC
       (unless (= (length args) 1)
         (error "wrong number of args for LDC"))
       (inst opcode args))
      (t
       (error "RESOLVE-ARGS unsupported opcode ~D" opcode)))))

;; CODE is a list of INSTRUCTIONs.
(defun resolve-opcodes (code)
  (map 'vector #'resolve-args code))

;; CODE is a list of INSTRUCTIONs.
(defun code-bytes (code)
  (setf code (coerce code 'vector))
  (setf code (nreverse code))

  (dotimes (i (length code))
    (let ((instruction (svref code i)))
      (when (and (< i (1- (length code)))
                 (= (instruction-opcode instruction) 167) ; GOTO
        (let ((next-instruction (svref code (1+ i))))
          (when (and (= (instruction-opcode next-instruction) 202) ; LABEL
                     (eq (car (instruction-args instruction))
                         (car (instruction-args next-instruction))))
            (setf (instruction-opcode instruction) 'nop)))))))

  (setf code (delete 'nop code :key #'instruction-opcode))
;;   (setf code (coerce code 'list))

  (let ((code (resolve-opcodes code))
        (length 0))
    ;; Pass 1: calculate label offsets and overall length.
    (dotimes (i (length code))
      (let* ((instruction (aref code i))
             (opcode (instruction-opcode instruction)))
        (if (= opcode 202) ; LABEL
            (let ((label (car (instruction-args instruction))))
              (set label length))
            (incf length (opcode-size opcode)))))
    ;; Pass 2: replace labels with calculated offsets.
    (let ((index 0))
      (dotimes (i (length code))
        (let ((instruction (aref code i)))
          (case (instruction-opcode instruction)
            ((153 ; IFEQ
              154 ; IFNE
              166 ; IF_ACMPNE
              165 ; IF_ACMPEQ
              167 ; GOTO
              )
             (let* ((label (car (instruction-args instruction)))
                    (offset (- (symbol-value `,label) index)))
               (setf (instruction-args instruction) (u2 offset)))))
          (unless (= (instruction-opcode instruction) 202) ; LABEL
            (incf index (opcode-size (instruction-opcode instruction)))))))
    ;; FIXME Do stack analysis here!
    ;; Convert list to vector.
    (let ((vector (make-array length))
          (index 0))
      (dotimes (i (length code))
        (let ((instruction (aref code i)))
          (unless (= (instruction-opcode instruction) 202) ; LABEL
            (setf (svref vector index) (instruction-opcode instruction))
            (incf index)
            (dolist (byte (instruction-args instruction))
              (setf (svref vector index) byte)
              (incf index)))))
      vector)))

(defun write-u1 (n)
  (write-byte (logand n #xFF) *stream*))

(defun write-u2 (n)
  (write-byte (ash n -8) *stream*)
  (write-byte (logand n #xFF) *stream*))

(defun write-u4 (n)
  (write-u2 (ash n -16))
  (write-u2 (logand n #xFFFF)))

(defun write-utf8 (string)
  (dotimes (i (length string))
    (write-u1 (char-int (char string i)))))

(defun write-cp-entry (entry)
  (write-u1 (first entry))
  (case (first entry)
    (1
     (write-u2 (second entry))
     (write-utf8 (third entry)))
    ((5 6)
     (write-u4 (second entry))
     (write-u4 (third entry)))
    ((9 10 11 12)
     (write-u2 (second entry))
     (write-u2 (third entry)))
    ((7 8)
     (write-u2 (second entry)))
    (t
     (error "WRITE-CP-ENTRY unhandled tag ~D~%" (car entry)))
  ))

(defun write-pool ()
  (write-u2 *pool-count*)
  (dolist (entry (reverse *pool*))
    (write-cp-entry entry)))

(defstruct field
  access-flags
  name
  descriptor
  name-index
  descriptor-index)

(defstruct method
  access-flags
  name
  descriptor
  name-index
  descriptor-index
  max-stack
  max-locals
  code)

(defun make-constructor (super name args body)
  (let* ((constructor (make-method :name "<init>"
                                   :descriptor "()V"))
         (*code* ()))
    (setf (method-name-index constructor) (pool-name (method-name constructor)))
    (setf (method-descriptor-index constructor) (pool-name (method-descriptor constructor)))
    (setf (method-max-locals constructor) 1)
    (cond (*hairy-arglist-p*
           (emit 'aload_0) ;; this
           (emit 'aconst_null) ;; name
           (let ((s (format nil "~S" args)))
             (emit 'ldc
                   (pool-string s))
             (emit 'invokestatic
                   "org/armedbear/lisp/Lisp"
                   "readObjectFromString"
                   "(Ljava/lang/String;)Lorg/armedbear/lisp/LispObject;"))
           (emit-push-nil) ;; body
           (emit 'aconst_null) ;; environment
           (emit 'invokespecial
                 super
                 "<init>"
                 "(Ljava/lang/String;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/Environment;)V"))
          (t
           (emit 'aload_0)
           (emit 'invokespecial
                 super
                 "<init>"
                 "()V")))
    (setq *code* (append *static-code* *code*))
    (emit 'return)
    (setf (method-code constructor) (code-bytes *code*))
    constructor))

(defun write-code-attr (method)
  (let* ((name-index (pool-name "Code"))
         (code (method-code method))
         (code-length (length code))
         (length (+ code-length 12))
         (max-stack (or (method-max-stack method) 20))
         (max-locals (or (method-max-locals method) 1)))
    (write-u2 name-index)
    (write-u4 length)
    (write-u2 max-stack)
    (write-u2 max-locals)
    (write-u4 code-length)
    (dotimes (i code-length)
      (write-u1 (svref code i)))
    (write-u2 0) ; exception table length
    (write-u2 0) ; attributes count
    ))

(defun write-method (method)
  (write-u2 (or (method-access-flags method) #x1)) ; access flags
  (write-u2 (method-name-index method))
  (write-u2 (method-descriptor-index method))
  (write-u2 1) ; attributes count
  (write-code-attr method))

(defun write-field (field)
  (write-u2 (or (field-access-flags field) #x1)) ; access flags
  (write-u2 (field-name-index field))
  (write-u2 (field-descriptor-index field))
  (write-u2 0)) ; attributes count

(defun declare-field (name descriptor)
  (let ((field (make-field :name name :descriptor descriptor)))
    (setf (field-access-flags field) (logior #x8 #x2)) ; private static
    (setf (field-name-index field) (pool-name (field-name field)))
    (setf (field-descriptor-index field) (pool-name (field-descriptor field)))
    (setq *fields* (cons field *fields*))))

(defun sanitize (symbol)
  (let* ((input (symbol-name symbol))
         (output (make-array (length input) :fill-pointer 0 :element-type 'character)))
    (dotimes (i (length input))
      (let ((c (char-upcase (char input i))))
        (cond ((<= #.(char-code #\A) (char-code c) #.(char-code #\Z))
               (vector-push c output))
              ((eql c #\-)
               (vector-push #\_ output)))))
    (when (plusp (length output))
      output)))

(defvar *declared-symbols* ())
(defvar *declared-functions* ())

(defun declare-symbol (symbol)
  (let ((g (gethash symbol *declared-symbols*)))
    (unless g
      (let ((*code* *static-code*)
            (s (sanitize symbol)))
        (setq g (symbol-name (gensym)))
        (when s
          (setq g (concatenate 'string g "_" s)))
        (declare-field g "Lorg/armedbear/lisp/Symbol;")
        (emit 'ldc
              (pool-string (symbol-name symbol)))
        (emit 'ldc
              (pool-string (package-name (symbol-package symbol))))
        (emit 'invokestatic
              +lisp-class+
              "internInPackage"
              "(Ljava/lang/String;Ljava/lang/String;)Lorg/armedbear/lisp/Symbol;")
        (emit 'putstatic
              *this-class*
              g
              "Lorg/armedbear/lisp/Symbol;")
        (setq *static-code* *code*)
        (setf (gethash symbol *declared-symbols*) g)))
    g))

(defun declare-function (symbol)
  (let ((f (gethash symbol *declared-functions*)))
    (unless f
      (setf f (symbol-name (gensym)))
      (let ((s (sanitize symbol)))
        (when s
          (setf f (concatenate 'string f "_" s))))
      (let ((*code* *static-code*)
            (g (gethash symbol *declared-symbols*)))
        (cond (g
               (emit 'getstatic
                     *this-class*
                     g
                     "Lorg/armedbear/lisp/Symbol;"))
              (t
               (emit 'ldc
                     (pool-string (symbol-name symbol)))
               (emit 'ldc
                     (pool-string (package-name (symbol-package symbol))))
               (emit 'invokestatic
                     +lisp-class+
                     "internInPackage"
                     "(Ljava/lang/String;Ljava/lang/String;)Lorg/armedbear/lisp/Symbol;")))
        (declare-field f "Lorg/armedbear/lisp/LispObject;")
        (emit 'invokevirtual
              "org/armedbear/lisp/Symbol"
              "getSymbolFunctionOrDie"
              "()Lorg/armedbear/lisp/LispObject;")
        (emit 'putstatic
              *this-class*
              f
              "Lorg/armedbear/lisp/LispObject;")
        (setq *static-code* *code*)
        (setf (gethash symbol *declared-functions*) f)))
    f))

(defun declare-keyword (symbol)
  (let ((g (symbol-name (gensym)))
        (*code* *static-code*))
    (declare-field g "Lorg/armedbear/lisp/Symbol;")
    (emit 'ldc
          (pool-string (symbol-name symbol)))
    (emit 'invokestatic
          "org/armedbear/lisp/Keyword"
          "internKeyword"
          "(Ljava/lang/String;)Lorg/armedbear/lisp/Symbol;")
    (emit 'putstatic
          *this-class*
          g
          "Lorg/armedbear/lisp/Symbol;")
    (setq *static-code* *code*)
    g))

(defun declare-object-as-string (obj)
  (let ((g (symbol-name (gensym)))
        (s (format nil "~S" obj))
        (*code* *static-code*))
    (declare-field g +lisp-object+)
    (emit 'ldc
          (pool-string s))
    (emit 'invokestatic
          "org/armedbear/lisp/Lisp"
          "readObjectFromString"
          "(Ljava/lang/String;)Lorg/armedbear/lisp/LispObject;")
    (emit 'putstatic
          *this-class*
          g
          +lisp-object+)
    (setq *static-code* *code*)
    g))

(defun declare-object (obj)
  (let ((key (symbol-name (gensym))))
    (sys::remember key obj)
    (let* ((g1 (declare-string key))
           (g2 (symbol-name (gensym)))
           (*code* *static-code*))
      (declare-field g2 +lisp-object+)
      (emit 'getstatic
            *this-class*
            g1
            +lisp-string+)
      (emit 'dup)
      (emit 'invokestatic
            +lisp-class+
            "recall"
            "(Lorg/armedbear/lisp/LispString;)Lorg/armedbear/lisp/LispObject;")
      (emit 'putstatic
            *this-class*
            g2
            +lisp-object+)
      (emit 'invokestatic
            +lisp-class+
            "forget"
            "(Lorg/armedbear/lisp/LispString;)V")
      (setq *static-code* *code*)
      g2)))

(defun declare-string (string)
  (let ((g (symbol-name (gensym)))
        (*code* *static-code*))
    (declare-field g "Lorg/armedbear/lisp/LispString;")
    (emit 'ldc
          (pool-string string))
    (emit 'invokestatic
          "org/armedbear/lisp/LispString"
          "getInstance"
          "(Ljava/lang/String;)Lorg/armedbear/lisp/LispString;")
    (emit 'putstatic
          *this-class*
          g
          +lisp-string+)
    (setq *static-code* *code*)
    g))

(defun compile-constant (form)
  (cond
   ((sys::fixnump form)
    (let ((n form))
      (cond ((zerop n)
             (emit 'getstatic
                   "org/armedbear/lisp/Fixnum"
                   "ZERO"
                   "Lorg/armedbear/lisp/Fixnum;")
             (emit-store-value))
            ((= n 1)
             (emit 'getstatic
                   "org/armedbear/lisp/Fixnum"
                   "ONE"
                   "Lorg/armedbear/lisp/Fixnum;")
             (emit-store-value))
            ((= n 2)
             (emit 'getstatic
                   "org/armedbear/lisp/Fixnum"
                   "TWO"
                   "Lorg/armedbear/lisp/Fixnum;")
             (emit-store-value))
            (t
             (let ((g (declare-object-as-string n)))
               (emit 'getstatic
                     *this-class*
                     g
                     "Lorg/armedbear/lisp/LispObject;")
               (emit-store-value))))))
   ((numberp form)
    (let ((g (declare-object-as-string form)))
      (emit 'getstatic
            *this-class*
            g
            "Lorg/armedbear/lisp/LispObject;")
      (emit-store-value)))
   ((vectorp form)
    (let ((g (declare-object-as-string form)))
      (emit 'getstatic
            *this-class*
            g
            "Lorg/armedbear/lisp/LispObject;")
      (emit-store-value)))
   ((stringp form)
    (let ((g (declare-string form)))
      (emit 'getstatic
            *this-class*
            g
            "Lorg/armedbear/lisp/LispString;")
      (emit-store-value)))
   ((characterp form)
    (let ((g (declare-object-as-string form)))
      (emit 'getstatic
            *this-class*
            g
            "Lorg/armedbear/lisp/LispObject;")
      (emit-store-value)))
   ((symbolp form)
    (when (null (symbol-package form))
      ;; An uninterned symbol.
      (let ((g (declare-object form)))
        (emit 'getstatic
              *this-class*
              g
              "Lorg/armedbear/lisp/LispObject;")
        (emit-store-value))))
   (t
    (error "COMPILE-CONSTANT unhandled case ~S" form))))

(defun compile-binary-operation (op args)
  (compile-form (first args))
  (unless (remove-store-value)
    (emit-push-value))
  (compile-form (second args))
  (unless (remove-store-value)
    (emit-push-value))
  (emit 'invokevirtual
        "org/armedbear/lisp/LispObject"
        op
        "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
  (emit-store-value))

(defparameter unary-operators (make-hash-table))

(setf (gethash '1+              unary-operators) "incr")
(setf (gethash '1-              unary-operators) "decr")
(setf (gethash 'ATOM            unary-operators) "ATOM")
(setf (gethash 'BIT-VECTOR-P    unary-operators) "BIT_VECTOR_P")
(setf (gethash 'CADR            unary-operators) "cadr")
(setf (gethash 'CAR             unary-operators) "car")
(setf (gethash 'CDDR            unary-operators) "cddr")
(setf (gethash 'CDR             unary-operators) "cdr")
(setf (gethash 'COMPLEXP        unary-operators) "COMPLEXP")
(setf (gethash 'CONSTANTP       unary-operators) "CONSTANTP")
(setf (gethash 'DENOMINATOR     unary-operators) "DENOMINATOR")
(setf (gethash 'ENDP            unary-operators) "ENDP")
(setf (gethash 'EVENP           unary-operators) "EVENP")
(setf (gethash 'FIRST           unary-operators) "car")
(setf (gethash 'FLOATP          unary-operators) "FLOATP")
(setf (gethash 'INTEGERP        unary-operators) "INTEGERP")
(setf (gethash 'LENGTH          unary-operators) "LENGTH")
(setf (gethash 'LISTP           unary-operators) "LISTP")
(setf (gethash 'MINUSP          unary-operators) "MINUSP")
(setf (gethash 'NOT             unary-operators) "NOT")
(setf (gethash 'NULL            unary-operators) "NOT")
(setf (gethash 'NUMBERP         unary-operators) "NUMBERP")
(setf (gethash 'NUMERATOR       unary-operators) "NUMERATOR")
(setf (gethash 'ODDP            unary-operators) "ODDP")
(setf (gethash 'PLUSP           unary-operators) "PLUSP")
(setf (gethash 'RATIONALP       unary-operators) "RATIONALP")
(setf (gethash 'REALP           unary-operators) "REALP")
(setf (gethash 'REST            unary-operators) "cdr")
(setf (gethash 'SECOND          unary-operators) "cadr")
(setf (gethash 'SIMPLE-STRING-P unary-operators) "SIMPLE_STRING_P")
(setf (gethash 'STRINGP         unary-operators) "STRINGP")
(setf (gethash 'SYMBOLP         unary-operators) "SYMBOLP")
(setf (gethash 'VECTORP         unary-operators) "VECTORP")
(setf (gethash 'ZEROP           unary-operators) "ZEROP")


(defun compile-function-call-1 (fun args)
  (let ((s (gethash fun unary-operators)))
    (when s
      (compile-form (first args))
      (emit-invoke-method s)
      (return-from compile-function-call-1 t)))
    nil)

(defun compile-function-call-2 (fun args)
  (case fun
    (EQ
     (compile-form (first args))
     (unless (remove-store-value)
       (emit-push-value))
     (compile-form (second args))
     (unless (remove-store-value)
       (emit-push-value))
     (let ((label1 (gensym))
           (label2 (gensym)))
       (emit 'if_acmpeq `,label1)
       (emit-push-nil)
       (emit 'goto `,label2)
       (emit 'label `,label1)
       (emit-push-t)
       (emit 'label `,label2))
     (emit-store-value)
     t)
    (EQL
     (compile-binary-operation "EQL" args)
     t)
    (+
     (compile-binary-operation "add" args)
     t)
    (-
     (compile-binary-operation "subtract" args)
     t)
    (/
     (compile-binary-operation "divideBy" args)
     t)
    (*
     (compile-binary-operation "multiplyBy" args)
     t)
    (<
     (compile-binary-operation "IS_LT" args)
     t)
    (<=
     (compile-binary-operation "IS_LE" args)
     t)
    (>
     (compile-binary-operation "IS_GT" args)
     t)
    (>=
     (compile-binary-operation "IS_GE" args)
     t)
    (=
     (compile-binary-operation "IS_E" args)
     t)
    (/=
     (compile-binary-operation "IS_NE" args)
     t)
    (AREF
     (compile-binary-operation "AREF" args)
     t)
    (LIST
     (compile-form (first args))
     (unless (remove-store-value)
       (emit-push-value))
     (compile-form (second args))
     (unless (remove-store-value)
       (emit-push-value))
     (emit 'invokestatic
           +lisp-class+
           "list2"
           "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/Cons;")
     (emit-store-value)
     t)
    (SYS::SIMPLE-TYPEP
     (compile-binary-operation "typep" args))
    (t
     nil)))

(defun compile-function-call-3 (fun args)
  (case fun
    (LIST
     (compile-form (first args))
     (unless (remove-store-value)
       (emit-push-value))
     (compile-form (second args))
     (unless (remove-store-value)
       (emit-push-value))
     (compile-form (third args))
     (unless (remove-store-value)
       (emit-push-value))
     (emit 'invokestatic
           +lisp-class+
           "list3"
           "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/Cons;")
     (emit-store-value)
     t)
    (t
     nil)))

(defun compile-function-call (fun args &optional for-effect)
;;   (format t "compile-function-call fun = ~S args = ~S~%" fun args)
  (unless (symbolp fun)
    (error "COMPILE-FUNCTION-CALL ~S is not a symbol" fun))
  (let ((numargs (length args)))
    (cond ((= numargs 1)
           (when (compile-function-call-1 fun args)
             (return-from compile-function-call)))
          ((= numargs 2)
           (when (compile-function-call-2 fun args)
             (return-from compile-function-call)))
          ((= numargs 3)
           (when (compile-function-call-3 fun args)
             (return-from compile-function-call))))

    ;; FIXME This shouldn't go here! Do this in the constructor of the
    ;; compiled function!
    (sys::resolve fun)

    (cond
     ((eq fun *defun-name*)
      (emit 'aload 0) ; this
      )
     ((eq (symbol-package fun) (find-package 'cl))
      (let ((f (declare-function fun)))
        (emit 'getstatic
              *this-class*
              f
              "Lorg/armedbear/lisp/LispObject;")))
     ((eq (symbol-package fun) (find-package 'sys))
      (let ((f (declare-function fun)))
        (emit 'getstatic
              *this-class*
              f
              "Lorg/armedbear/lisp/LispObject;")))
     (t
      (let ((g (declare-symbol fun)))
        (emit 'getstatic
              *this-class*
              g
              "Lorg/armedbear/lisp/Symbol;"))
      (emit 'invokevirtual
            "org/armedbear/lisp/Symbol"
            "getSymbolFunctionOrDie"
            "()Lorg/armedbear/lisp/LispObject;")))
    (case numargs
      (0
       (emit 'invokevirtual
             "org/armedbear/lisp/LispObject"
             "execute"
             "()Lorg/armedbear/lisp/LispObject;"))
      (1
       (compile-form (first args))
       (unless (remove-store-value)
         (emit-push-value))
       (emit 'invokevirtual
             "org/armedbear/lisp/LispObject"
             "execute"
             "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"))
      (2
       (compile-form (first args))
       (unless (remove-store-value)
         (emit-push-value))
       (compile-form (second args))
       (unless (remove-store-value)
         (emit-push-value))
       (emit 'invokevirtual
             "org/armedbear/lisp/LispObject"
             "execute"
             "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"))
      (3
       (compile-form (first args))
       (unless (remove-store-value)
         (emit-push-value))
       (compile-form (second args))
       (unless (remove-store-value)
         (emit-push-value))
       (compile-form (third args))
       (unless (remove-store-value)
         (emit-push-value))
       (emit 'invokevirtual
             "org/armedbear/lisp/LispObject"
             "execute"
             "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;"))
      (t
       (emit 'sipush (length args))
       (emit 'anewarray "org/armedbear/lisp/LispObject")
       (let ((i 0))
         (dolist (form args)
           (emit 'dup)
           (emit 'sipush i)
           (compile-form form)
           (unless (remove-store-value)
             (emit-push-value)) ; leaves value on stack
           (emit 'aastore) ; store value in array
           (incf i)
           ) ; array left on stack here
         )
       ;; Stack: function array-ref
       (emit 'invokevirtual
             "org/armedbear/lisp/LispObject"
             "execute"
             "([Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")))
    (if for-effect
        (emit 'pop)
        (emit-store-value))))

(defun compile-test (form)
  ;; Use a Java boolean if possible.
  (when (consp form)
    (case (length form)
      (2 (when (memq (car form) '(NOT NULL))
           (compile-form (second form))
           (unless (remove-store-value)
             (emit-push-value))
           (emit-push-nil)
           (return-from compile-test 'if_acmpne))
         (let ((s (cdr (assoc (car form)
                              '((ATOM      . "atom")
                                (EVENP     . "evenp")
                                (FLOATP    . "floatp")
                                (INTEGERP  . "integerp")
                                (MINUSP    . "minusp")
                                (LISTP     . "listp")
                                (NUMBERP   . "numberp")
                                (ODDP      . "oddp")
                                (PLUSP     . "plusp")
                                (RATIONALP . "rationalp")
                                (REALP     . "realp")
                                (VECTORP   . "vectorp")
                                (ZEROP     . "zerop")
                                )))))
           (when s
             (compile-form (second form))
             (unless (remove-store-value)
               (emit-push-value))
             (emit 'invokevirtual
                   +lisp-object-class+
                   s
                   "()Z")
             (return-from compile-test 'ifeq))))
      (3 (when (eq (car form) 'EQ)
           (compile-form (second form))
           (unless (remove-store-value)
             (emit-push-value))
           (compile-form (third form))
           (unless (remove-store-value)
             (emit-push-value))
           (return-from compile-test 'if_acmpne))
         (let ((s (cdr (assoc (car form)
                              '((=      . "isEqualTo")
                                (/=     . "isNotEqualTo")
                                (<      . "isLessThan")
                                (<=     . "isLessThanOrEqualTo")
                                (>      . "isGreaterThan")
                                (>=     . "isGreaterThanOrEqualTo")
                                (EQL    . "eql")
                                (EQUAL  . "equal")
                                (EQUALP . "equalp")
                                )))))
           (when s
             (compile-form (second form))
             (unless (remove-store-value)
               (emit-push-value))
             (compile-form (third form))
             (unless (remove-store-value)
               (emit-push-value))
             (emit 'invokevirtual
                   +lisp-object-class+
                   s
                   "(Lorg/armedbear/lisp/LispObject;)Z")
             (return-from compile-test 'ifeq))))))
  ;; Otherwise...
  (compile-form form)
  (unless (remove-store-value)
    (emit-push-value))
  (emit-push-nil)
  'if_acmpeq)

(defun compile-if (form)
  (let* ((test (second form))
         (consequent (third form))
         (alternate (fourth form))
         (label1 (gensym))
         (label2 (gensym))
         (instr (compile-test test)))
    (emit-clear-values)
    (emit instr `,label1)
    (compile-form consequent)
    (emit 'goto `,label2)
    (emit 'label `,label1)
    (compile-form alternate)
    (emit 'label `,label2)))

(defun compile-multiple-value-list (form)
  (compile-form (second form))
  (unless (remove-store-value)
    (emit-push-value))
  (emit 'invokestatic
        "org/armedbear/lisp/Lisp"
        "multipleValueList"
        "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
  (emit-store-value))

(defun compile-let/let* (form)
  (let* ((saved-fp (fill-pointer *locals*))
         (varlist (second form))
         (specialp nil)
         thread-var env-var)
    ;; Are we going to bind any special variables?
    (dolist (varspec varlist)
      (let ((var (if (consp varspec) (car varspec) varspec)))
        (when (special-variable-p var)
          (setq specialp t)
          (return))))
    ;; If so...
    (when specialp
      ;; Save current thread in a local variable.
      (setq thread-var (vector-push nil *locals*))
      (setq *max-locals* (max *max-locals* (fill-pointer *locals*)))
      (emit 'invokestatic
            +lisp-thread-class+
            "currentThread"
            "()Lorg/armedbear/lisp/LispThread;")
      (emit 'astore thread-var)
      ;; Save current dynamic environment.
      (setq env-var (vector-push nil *locals*))
      (setq *max-locals* (max *max-locals* (fill-pointer *locals*)))
      (emit 'aload thread-var)
      (emit 'invokevirtual
            +lisp-thread-class+
            "getDynamicEnvironment"
            "()Lorg/armedbear/lisp/Environment;")
      (emit 'astore env-var))
    (ecase (car form)
      (LET
       (compile-let-vars varlist))
      (LET*
       (compile-let*-vars varlist)))
    ;; Body of LET.
    (do ((body (cddr form) (cdr body)))
        ((null (cdr body))
         (compile-form (car body) nil))
      (compile-form (car body) t))
    (when specialp
      ;; Restore dynamic environment.
      (emit 'aload thread-var)
      (emit 'aload env-var)
      (emit 'invokevirtual
            +lisp-thread-class+
            "setDynamicEnvironment"
            "(Lorg/armedbear/lisp/Environment;)V"))
    ;; Restore fill pointer to its saved value so the slots used by these
    ;; bindings will again be available.
    (setf (fill-pointer *locals*) saved-fp)))

(defun compile-let-vars (varlist)
  ;; Generate code to evaluate the initforms and leave the resulting values
  ;; on the stack.
  (dolist (varspec varlist)
    (let (var initform)
      (cond ((consp varspec)
             (setq var (car varspec)
                   initform (cadr varspec)))
            (t
             (setq var varspec
                   initform nil)))
      (cond (initform
             (compile-form initform)
             (emit-push-value))
            (t
             (emit-push-nil)))))
  ;; Add local variables to local variables vector.
  (dolist (varspec varlist)
    (let ((var (if (consp varspec) (car varspec) varspec)))
      (unless (special-variable-p var)
        (vector-push var *locals*))))
  (setq *max-locals* (max *max-locals* (fill-pointer *locals*)))
  ;; At this point the initial values are on the stack. Now generate code to
  ;; pop them off one by one and store each one in the corresponding local or
  ;; special variable. In order to do this, we must process the variable list
  ;; in reverse order.
  (do* ((varlist (reverse varlist) (cdr varlist))
        (varspec (car varlist) (car varlist))
        (var (if (consp varspec) (car varspec) varspec))
        (i (1- (fill-pointer *locals*)) (1- i)))
       ((null varlist))
    (cond ((special-variable-p var)
           (let ((g (declare-symbol var)))
             (emit 'getstatic
                   *this-class*
                   g
                   "Lorg/armedbear/lisp/Symbol;")
             (emit 'swap)
             (emit 'invokestatic
                   "org/armedbear/lisp/Lisp"
                   "bindSpecialVariable"
                   "(Lorg/armedbear/lisp/Symbol;Lorg/armedbear/lisp/LispObject;)V")))
          (t
           (emit 'astore i)))))

(defun compile-let*-vars (varlist)
  ;; Generate code to evaluate initforms and bind variables.
  (let ((i (fill-pointer *locals*)))
    (dolist (varspec varlist)
      (let (var initform)
        (cond ((consp varspec)
               (setq var (car varspec)
                     initform (cadr varspec)))
              (t
               (setq var varspec
                     initform nil)))
        (cond (initform
               (compile-form initform)
               (emit-push-value))
              (t
               (emit-push-nil)))
        (cond ((special-variable-p var)
               (let ((g (declare-symbol var)))
                 (emit 'getstatic
                       *this-class*
                       g
                       "Lorg/armedbear/lisp/Symbol;")
                 (emit 'swap)
                 (emit 'invokestatic
                       "org/armedbear/lisp/Lisp"
                       "bindSpecialVariable"
                       "(Lorg/armedbear/lisp/Symbol;Lorg/armedbear/lisp/LispObject;)V")))
              (t
               (emit 'astore i)
               (vector-push var *locals*)
               (incf i))))))
  (setq *max-locals* (max *max-locals* (fill-pointer *locals*))))

(defvar *tags* ())

(defstruct tag name label)

(defun label-for-tag (name)
  (let ((index (position name *tags* :from-end t :key #'tag-name)))
;;     (format t "find-tag index = ~S~%" index)
    (when index
      (tag-label (aref *tags* index)))))

(defun compile-tagbody (form)
  (let ((saved-fp (fill-pointer *tags*))
        (body (cdr form)))
    ;; Scan for tags.
    (dolist (f body)
      (when (atom f)
        (let ((name f)
              (label (gensym)))
          (vector-push (make-tag :name name :label label) *tags*))))
    (dolist (f body)
      (cond ((atom f)
             (let ((label (label-for-tag f)))
               (unless label
                 (error "COMPILE-TAGBODY: tag not found: ~S" f))
               (emit 'label label)))
            (t
             (compile-form f t))))
    (setf (fill-pointer *tags*) saved-fp))
  ;; TAGBODY returns NIL.
  (emit-push-nil)
  (emit-store-value))

(defun compile-go (form)
  (let* ((name (cadr form))
         (label (label-for-tag name)))
    (unless label
      (error "COMPILE-GO: tag not found: ~S" name))
  (emit 'goto label)))

(defun compile-block (form)
   (let* ((rest (cdr form))
          (block-label (car rest))
          (block-exit (gensym))
          (*blocks* (acons block-label block-exit *blocks*))
          (forms (cdr rest)))
     (dolist (form forms)
       (compile-form form))
     (emit 'label `,block-exit)))

(defun compile-progn (form)
  (dolist (form (cdr form))
    (compile-form form)))

(defun compile-setq (form)
  (let* ((rest (cdr form))
         (len (length rest))
         (sym (car rest))
         (index (position sym *locals* :from-end t)))
    (unless (= len 2)
      (error "COMPILE-SETQ too many args for SETQ"))
    (when index
      (compile-form (cadr rest))
      (emit-push-value)
      (emit 'astore index)
      (return-from compile-setq))
    ;; index is NIL, look in *args* ...
    (setq index (position sym *args*))
    (when index
      (cond (*using-arg-array*
             (emit 'aload 1)
             (emit 'bipush index)
             (compile-form (cadr rest))
             (emit-push-value)
             (emit 'aastore))
            (t
             (compile-form (cadr rest))
             (emit-push-value)
             (emit 'astore (1+ index))))
      (return-from compile-setq))
    ;; still not found
    ;; must be a global variable
    (let ((g (declare-symbol sym)))
      (emit 'getstatic
            *this-class*
            g
            "Lorg/armedbear/lisp/Symbol;")
      (compile-form (cadr rest))
      (unless (remove-store-value)
        (emit-push-value))
      (emit 'invokestatic
            +lisp-class+
            "setSpecialVariable"
            "(Lorg/armedbear/lisp/Symbol;Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
      (emit-store-value))))

(defun compile-quote (form)
   (let ((obj (second form)))
     (cond ((null obj)
            (emit-push-nil)
            (emit-store-value))
           ((symbolp obj)
            (if (symbol-package obj)
                (let ((g (declare-symbol obj)))
                  (emit 'getstatic
                        *this-class*
                        g
                        "Lorg/armedbear/lisp/Symbol;")
                  (emit-store-value))
                (compile-constant obj)))
           ((listp obj)
            (let ((g (declare-object-as-string obj)))
              (emit 'getstatic
                    *this-class*
                    g
                    +lisp-object+)
              (emit-store-value)))
           ((constantp obj)
            (compile-constant obj))
           (t
            (error "COMPILE-QUOTE: unsupported case: ~S" form)))))

(defun compile-function (form)
   (let ((obj (second form)))
     (cond ((symbolp obj)
            (let ((g (declare-symbol obj)))
              (emit 'getstatic
                    *this-class*
                    g
                    "Lorg/armedbear/lisp/Symbol;")
              (emit 'invokevirtual
                    +lisp-object-class+
                    "getSymbolFunctionOrDie"
                    "()Lorg/armedbear/lisp/LispObject;")
              (emit-store-value)))
           #+nil
           ((and (consp obj) (eq (car obj) 'LAMBDA))
            ;; FIXME We need to construct a proper lexical environment here
            ;; and pass it to coerceToFunction().
            (let ((g (declare-object-as-string obj)))
              (emit 'getstatic
                    *this-class*
                    g
                    +lisp-object+)
              (emit 'invokestatic
                    +lisp-class+
                    "coerceToFunction"
                    "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/Function;")
              (emit-store-value)))
           (t
            (error "COMPILE-FUNCTION: unsupported case: ~S" form)))))

(defun compile-return (form)
   (let* ((rest (cdr form))
          (block-label nil)
          (block-exit (cdr (assoc block-label *blocks*)))
          (result-form (car rest)))
     (unless block-exit
       (error "no block named ~S is currently visible" block-label))
     (compile-form result-form)
     (emit 'goto `,block-exit)))

(defun compile-return-from (form)
   (let* ((rest (cdr form))
          (block-label (car rest))
          (block-exit (cdr (assoc block-label *blocks*)))
          (result-form (cadr rest)))
     (unless block-exit
       (error "no block named ~S is currently visible" block-label))
     (compile-form result-form)
     (emit 'goto `,block-exit)))

(defun compile-plus (form)
  (let* ((args (cdr form))
         (len (length args)))
    (case len
      (2
       (let ((first (first args))
             (second (second args)))
         (cond
          ((eql first 1)
           (compile-form second)
           (emit-invoke-method "incr"))
          ((eql second 1)
           (compile-form first)
           (emit-invoke-method "incr"))
          (t
           (compile-binary-operation "add" args)))))
      (t
       (compile-function-call '+ args)))))

(defun compile-minus (form)
  (let* ((args (cdr form))
         (len (length args)))
    (case len
      (2
       (let ((first (first args))
             (second (second args)))
         (cond
          ((eql second 1)
           (compile-form first)
           (emit-invoke-method "decr"))
          (t
           (compile-binary-operation "subtract" args)))))
      (t
       (compile-function-call '- args)))))

(defun compile-variable-ref (form)
  (let ((index (position form *locals* :from-end t)))
    (when index
      (emit 'aload index)
      (emit-store-value)
      (return-from compile-variable-ref)))
  ;; Not found in locals; look in args.
  (let ((index (position form *args*)))
    (when index
      (cond (*using-arg-array*
             (emit 'aload 1)
             (emit 'bipush index)
             (emit 'aaload)
             (emit-store-value)
             (return-from compile-variable-ref))
            (t
             (emit 'aload (1+ index))
             (emit-store-value)
             (return-from compile-variable-ref)))))

  ;; Otherwise it must be a global variable.
  (let ((g (declare-symbol form)))
    (emit 'getstatic
          *this-class*
          g
          "Lorg/armedbear/lisp/Symbol;")
    (emit 'invokevirtual
          "org/armedbear/lisp/Symbol"
          "symbolValue"
          "()Lorg/armedbear/lisp/LispObject;")
    (emit-store-value)
    (return-from compile-variable-ref)))


;; If for-effect is true, no value needs to be left on the stack.
(defun compile-form (form &optional for-effect)
  (cond
   ((consp form)
    (let ((first (first form))
          (rest (rest form)))
      (when (macro-function first)
        (compile-form (macroexpand form))
        (return-from compile-form))
      (when (symbolp first)
        (let ((handler (get first 'jvm-compile)))
          (when handler
            (funcall handler form)
            (return-from compile-form))))
      (cond
       ((special-operator-p first)
        (error "COMPILE-FORM unhandled special operator ~S" first))
       (t ; Function call.
        (compile-function-call first rest for-effect)))))
   ((eq form '())
    (unless for-effect
      (emit-push-nil)
      (emit-store-value)))
   ((eq form t)
    (unless for-effect
      (emit-push-t)
      (emit-store-value)))
   ((symbolp form)
    (when (keywordp form)
      (let ((g (declare-keyword form)))
        (emit 'getstatic
              *this-class*
              g
              "Lorg/armedbear/lisp/Symbol;"))
      (emit-store-value)
      (return-from compile-form))

    (compile-variable-ref form))
   ((constantp form)
    (unless for-effect
      (compile-constant form)))
   (t
    (error "COMPILE-FORM unhandled case ~S" form))))

;; Returns descriptor.
(defun analyze-args (args)
  (assert (not (memq '&AUX args)))
  (when (or (memq '&KEY args)
            (memq '&OPTIONAL args)
            (memq '&REST args))
    (setq *using-arg-array* t)
    (setq *hairy-arglist-p* t)
    (return-from analyze-args #.(format nil "([~A)~A" +lisp-object+ +lisp-object+)))
  (case (length args)
    (0 #.(format nil "()~A" +lisp-object+))
    (1 #.(format nil "(~A)~A" +lisp-object+ +lisp-object+))
    (2 #.(format nil "(~A~A)~A" +lisp-object+ +lisp-object+ +lisp-object+))
    (3 #.(format nil "(~A~A~A)~A" +lisp-object+ +lisp-object+ +lisp-object+ +lisp-object+))
    (t (setq *using-arg-array* t)
       #.(format nil "([~A)~A" +lisp-object+ +lisp-object+))))

(defun compile-defun (name form)
  (unless (eq (car form) 'LAMBDA)
    (return-from compile-defun nil))
  (setq form (transform form))
  (let* ((*defun-name* name)
         (*declared-symbols* (make-hash-table))
         (*declared-functions* (make-hash-table))
         (*this-class* "org/armedbear/lisp/out")
         (args (cadr form))
         (body (cddr form))
         (*using-arg-array* nil)
         (*hairy-arglist-p* nil)
         (descriptor (analyze-args args))
         (execute-method (make-method :name "execute"
                                      :descriptor descriptor))
         (*code* ())
         (*static-code* ())
         (*fields* ())
         (*blocks* ())
         (*tags* (make-array 256 :fill-pointer 0)) ; FIXME Remove hard limit!
         (*args* (make-array 256 :fill-pointer 0)) ; FIXME Remove hard limit!
         (*locals* (make-array 256 :fill-pointer 0)) ; FIXME Remove hard limit!
         (*max-locals* 0)
         (*pool* ())
         (*pool-count* 1)
         (*val* 0))
    (setf (method-name-index execute-method)
          (pool-name (method-name execute-method)))
    (setf (method-descriptor-index execute-method)
          (pool-name (method-descriptor execute-method)))
    (if *hairy-arglist-p*
        (let* ((fun (sys::make-compiled-function nil args body))
               (vars (sys::varlist fun)))
          (dolist (var vars)
            (vector-push var *args*)))
        (dolist (arg args)
          (vector-push arg *args*)))
    (if *using-arg-array*
        ;; Using arg array: slot 0 is "this" pointer, slot 1 is arg array,
        ;; first available slot is 2.
        (setf (fill-pointer *locals*) 2)
        ;; Not using arg array: slot 0 is "this" pointer, next N slots are used
        ;; for args.
        (setf (fill-pointer *locals*) (1+ (length args))))
    ;; Reserve the next available slot for the value register.
    (setq *val* (fill-pointer *locals*))
    (incf (fill-pointer *locals*))
    (setf *max-locals* (fill-pointer *locals*))
    (when *hairy-arglist-p*
      (emit 'aload_0)
      (emit 'aload_1)
      (emit 'invokevirtual
            *this-class*
            "processArgs"
            "([Lorg/armedbear/lisp/LispObject;)[Lorg/armedbear/lisp/LispObject;")
      (emit 'astore_1))
    (dolist (f body)
      (compile-form f))
    (unless (remove-store-value)
      (emit-push-value)) ; leave result on stack
    (emit 'areturn)
    (setf (method-code execute-method) (code-bytes *code*))
    (setf (method-max-locals execute-method) *max-locals*)

    (let* ((super
            (if *hairy-arglist-p*
                "org.armedbear.lisp.CompiledFunction"
                (case (length args)
                  (0 "org.armedbear.lisp.Primitive0")
                  (1 "org.armedbear.lisp.Primitive1")
                  (2 "org.armedbear.lisp.Primitive2")
                  (3 "org.armedbear.lisp.Primitive3")
                  (t "org.armedbear.lisp.Primitive"))))
           (this-index (pool-class *this-class*))
           (super-index (pool-class super))
           (constructor (make-constructor super *defun-name* args body)))
      (pool-name "Code") ; Must be in pool!

      ;; Write class file (out.class in current directory).
      (with-open-file (*stream* "out.class"
                                :direction :output
                                :element-type 'unsigned-byte
                                :if-exists :supersede)
        (write-u4 #xCAFEBABE)
        (write-u2 3)
        (write-u2 45)
        (write-pool)
        ;; access flags
        (write-u2 #x21)
        (write-u2 this-index)
        (write-u2 super-index)
        ;; interfaces count
        (write-u2 0)
        ;; fields count
        (write-u2 (length *fields*))
        ;; fields
        (dolist (field *fields*)
          (write-field field))
        ;; methods count
        (write-u2 2)
        ;; methods
        (write-method execute-method)
        (write-method constructor)
        ;; attributes count
        (write-u2 0))))
  (sys::load-compiled-function "out.class"))

(defun get-lambda-to-compile (definition-designator)
  (if (and (consp definition-designator)
           (eq (car definition-designator) 'LAMBDA))
      definition-designator
      (multiple-value-bind (lambda-expression closure-p)
        (function-lambda-expression definition-designator)
        (when closure-p
          (error "unable to compile function defined in non-null lexical environment"))
	(unless lambda-expression
	  (error "can't find a definition"))
        lambda-expression)))

(defun load-verbose-prefix ()
  (with-output-to-string (s)
    (princ #\; s)
    (dotimes (i (1- sys::*load-depth*))
      (princ #\space s))))

(defun jvm-compile (name &optional definition)
  (let ((prefix (load-verbose-prefix)))
    (when name
      (format t "~A Compiling ~S ...~%" prefix name)
      (when (and (fboundp name) (typep (fdefinition name) 'generic-function))
        (format t "~A Unable to compile generic function ~S~%" prefix name)
        (return-from jvm-compile (values name nil t)))
      (unless (symbolp name)
        (format t "~A Unable to compile ~S~%" prefix name)
        (return-from jvm-compile (values name nil t))))
    (unless definition
      (sys::resolve name)
      (setf definition (fdefinition name))
      (when (compiled-function-p definition)
        (when name
          (format t "~A Already compiled ~S~%" prefix name))
        (return-from jvm-compile (values name nil nil))))
    (handler-case
        (let* ((*package* (if (and name (symbol-package name))
                              (symbol-package name)
                              *package*))
               (expr (get-lambda-to-compile definition))
               (compiled-definition (compile-defun name expr)))
          (when (and name (functionp compiled-definition))
            (sys::%set-lambda-name compiled-definition name)
            (sys::%set-call-count compiled-definition (sys::%call-count definition))
            (sys::%set-arglist compiled-definition (sys::arglist definition))
            (if (macro-function name)
                (setf (fdefinition name) (sys::make-macro compiled-definition))
                (setf (fdefinition name) compiled-definition)))
          (when name
            (format t "~A Compiled ~S~%" prefix name))
          (values (or name compiled-definition) nil nil))
      (error (c)
             (format t "Error: ~S~%" c)
             (when name (format t "~A Unable to compile ~S~%" prefix name))
             (values (or name (sys::coerce-to-function definition)) nil t)))))

(defun jvm-compile-package (package-designator)
  (let ((pkg (if (packagep package-designator)
                 package-designator
                 (find-package package-designator))))
      (dolist (sym (sys::package-symbols pkg))
        (when (fboundp sym)
          (unless (or (special-operator-p sym) (macro-function sym))
            ;; Force autoload to be resolved.
            (sys::resolve sym)
            (let ((f (fdefinition sym)))
              (unless (compiled-function-p f)
                (jvm-compile sym)))))))
  t)

(defun install-handler (fun &optional handler)
  (let ((handler (or handler
                     (find-symbol (concatenate 'string "COMPILE-" (symbol-name fun)) 'jvm))))
    (unless (and handler (fboundp handler))
      (error "no handler for ~S" fun))
    (setf (get fun 'jvm-compile) handler)))

(mapc #'install-handler '(block
                          function
                          go
                          if
                          multiple-value-list
                          progn
                          quote
                          return
                          return-from
                          setq
                          tagbody))

(install-handler 'let  'compile-let/let*)
(install-handler 'let* 'compile-let/let*)
(install-handler '+    'compile-plus)
(install-handler '-    'compile-minus)

#+nil
(defun compile (name &optional definition)
  (jvm:jvm-compile name definition))

(defmacro defun (name lambda-list &rest body)
  `(progn
     (sys::%defun ',name ',lambda-list ',body)
     (compiler::%compile ',name)
     (when *auto-compile*
       (jvm-compile ',name))
     ',name))

(mapc #'jvm-compile '(pool-add
                      pool-find-entry
                      pool-name
                      pool-get
                      compile-form))

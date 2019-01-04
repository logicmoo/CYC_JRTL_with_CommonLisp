;;; asm-runtime-class.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: runtime-class.lisp 11391 2008-11-15 22:38:34Z vvoutilainen $
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
;;;
;;; As a special exception, the copyright holders of this library give you
;;; permission to link this library with independent modules to produce an
;;; executable, regardless of the license terms of these independent
;;; modules, and to copy and distribute the resulting executable under
;;; terms of your choice, provided that you also meet, for each linked
;;; independent module, the terms and conditions of the license of that
;;; module.  An independent module is a module which is not derived from
;;; or based on this library.  If you modify this library, you may extend
;;; this exception to your version of the library, but you are not
;;; obligated to do so.  If you do not wish to do so, delete this
;;; exception statement from your version.

(in-package :asm-java)

(require :format)

;; jparse generated definitions, somewhat simplified

;; WAS (defconstant +asm-consts+ "org.objectweb.asm.Constants")
(defconstant +asm-consts+ "org.objectweb.asm.Opcodes")
(defclass java-class nil ((java-instance :initarg :java-instance :reader java-instance)))
(defclass jboolean (java-class) nil)
(defmethod initialize-instance :after ((b jboolean) &key &allow-other-keys)
  (setf (slot-value b 'java-instance) (make-immediate-object (java-instance b) :boolean)))
(defclass jarray (java-class) nil)
(defclass |java.lang.Object| (java-class) nil)
(defclass output-stream (java-class) nil)
(defclass file-output-stream (output-stream java-class) nil)
(defclass class-visitor (java-class) nil)
(defclass class-writer (class-visitor java-class) nil)
(defclass code-visitor (java-class) nil)
(defclass code-writer (code-visitor java-class) nil)
(defclass attribute (java-class) nil)
(defclass constants (java-class) nil)
(defclass label (java-class) nil)
(defmethod make-file-output-stream-1 ((v1 string))
  (make-instance 'file-output-stream :java-instance
                 (jnew (jconstructor "java.io.FileOutputStream" "java.lang.String") v1)))
(defmethod write-1 ((instance file-output-stream) (v1 jarray))
  (jcall (jmethod "java.io.FileOutputStream" "write" "[B") (java-instance instance) (java-instance v1)))
(defmethod close-0 ((instance file-output-stream))
  (jcall (jmethod "java.io.FileOutputStream" "close") (java-instance instance)))
(defmethod make-class-writer-1 ((v1 jboolean))
  (make-instance 'class-writer :java-instance
                 (jnew (jconstructor "org.objectweb.asm.ClassWriter" "boolean") (java-instance v1))))
(defmethod visit-end-0 ((instance class-writer))
  (jcall (jmethod "org.objectweb.asm.ClassWriter" "visitEnd") (java-instance instance)))
(defmethod to-byte-array-0 ((instance class-writer))
  (make-instance 'jarray :java-instance
                 (jcall (jmethod "org.objectweb.asm.ClassWriter" "toByteArray") (java-instance instance))))
(defmethod visit-insn-1 ((instance code-visitor) (v1 fixnum))
  (jcall (jmethod "org.objectweb.asm.CodeVisitor" "visitInsn" "int") (java-instance instance) v1))
(defmethod visit-int-insn-2 ((instance code-visitor) (v1 fixnum) (v2 fixnum))
  (jcall (jmethod "org.objectweb.asm.CodeVisitor" "visitIntInsn" "int" "int") (java-instance instance) v1
         v2))
(defmethod visit-var-insn-2 ((instance code-visitor) (v1 fixnum) (v2 fixnum))
  (jcall (jmethod "org.objectweb.asm.CodeVisitor" "visitVarInsn" "int" "int") (java-instance instance) v1
         v2))
(defmethod visit-type-insn-2 ((instance code-visitor) (v1 fixnum) (v2 string))
  (jcall (jmethod "org.objectweb.asm.CodeVisitor" "visitTypeInsn" "int" "java.lang.String")
         (java-instance instance) v1 v2))
(defmethod visit-field-insn-4 ((instance code-visitor) (v1 fixnum) (v2 string) (v3 string) (v4 string))
  (jcall (jmethod "org.objectweb.asm.CodeVisitor" "visitFieldInsn" "int" "java.lang.String"
                  "java.lang.String" "java.lang.String")
         (java-instance instance) v1 v2 v3 v4))
(defmethod visit-method-insn-4 ((instance code-visitor) (v1 fixnum) (v2 string) (v3 string) (v4 string))
  (jcall (jmethod "org.objectweb.asm.CodeVisitor" "visitMethodInsn" "int" "java.lang.String"
                  "java.lang.String" "java.lang.String")
         (java-instance instance) v1 v2 v3 v4))
(defmethod visit-jump-insn-2 ((instance code-visitor) (v1 fixnum) (v2 label))
  (jcall (jmethod "org.objectweb.asm.CodeVisitor" "visitJumpInsn" "int" "org.objectweb.asm.Label")
         (java-instance instance) v1 (java-instance v2)))
(defmethod visit-label-1 ((instance code-visitor) (v1 label))
  (jcall (jmethod "org.objectweb.asm.CodeVisitor" "visitLabel" "org.objectweb.asm.Label")
         (java-instance instance) (java-instance v1)))
(defmethod visit-ldc-insn-1 ((instance code-visitor) (v1 |java.lang.Object|))
  (jcall (jmethod "org.objectweb.asm.CodeVisitor" "visitLdcInsn" "java.lang.Object")
         (java-instance instance) (java-instance v1)))
(defmethod visit-try-catch-block-4 ((instance code-visitor) (v1 label) (v2 label) (v3 label) (v4 string))
  (jcall (jmethod "org.objectweb.asm.CodeVisitor" "visitTryCatchBlock" "org.objectweb.asm.Label"
                  "org.objectweb.asm.Label" "org.objectweb.asm.Label" "java.lang.String")
         (java-instance instance) (java-instance v1) (java-instance v2) (java-instance v3) v4))
(defmethod visit-maxs-2 ((instance code-visitor) (v1 fixnum) (v2 fixnum))
  (jcall (jmethod "org.objectweb.asm.CodeVisitor" "visitMaxs" "int" "int") (java-instance instance) v1 v2))
(defconstant constants.ifnonnull (jfield +asm-consts+ "IFNONNULL"))
(defconstant constants.ifnull (jfield +asm-consts+ "IFNULL"))
(defconstant constants.multianewarray (jfield +asm-consts+ "MULTIANEWARRAY"))
(defconstant constants.monitorexit (jfield +asm-consts+ "MONITOREXIT"))
(defconstant constants.monitorenter (jfield +asm-consts+ "MONITORENTER"))
(defconstant constants.instanceof (jfield +asm-consts+ "INSTANCEOF"))
(defconstant constants.checkcast (jfield +asm-consts+ "CHECKCAST"))
(defconstant constants.athrow (jfield +asm-consts+ "ATHROW"))
(defconstant constants.arraylength (jfield +asm-consts+ "ARRAYLENGTH"))
(defconstant constants.anewarray (jfield +asm-consts+ "ANEWARRAY"))
(defconstant constants.newarray (jfield +asm-consts+ "NEWARRAY"))
(defconstant constants.new (jfield +asm-consts+ "NEW"))
(defconstant constants.invokeinterface (jfield +asm-consts+ "INVOKEINTERFACE"))
(defconstant constants.invokestatic (jfield +asm-consts+ "INVOKESTATIC"))
(defconstant constants.invokespecial (jfield +asm-consts+ "INVOKESPECIAL"))
(defconstant constants.invokevirtual (jfield +asm-consts+ "INVOKEVIRTUAL"))
(defconstant constants.putfield (jfield +asm-consts+ "PUTFIELD"))
(defconstant constants.getfield (jfield +asm-consts+ "GETFIELD"))
(defconstant constants.putstatic (jfield +asm-consts+ "PUTSTATIC"))
(defconstant constants.getstatic (jfield +asm-consts+ "GETSTATIC"))
(defconstant constants.return (jfield +asm-consts+ "RETURN"))
(defconstant constants.areturn (jfield +asm-consts+ "ARETURN"))
(defconstant constants.dreturn (jfield +asm-consts+ "DRETURN"))
(defconstant constants.freturn (jfield +asm-consts+ "FRETURN"))
(defconstant constants.lreturn (jfield +asm-consts+ "LRETURN"))
(defconstant constants.ireturn (jfield +asm-consts+ "IRETURN"))
(defconstant constants.lookupswitch (jfield +asm-consts+ "LOOKUPSWITCH"))
(defconstant constants.tableswitch (jfield +asm-consts+ "TABLESWITCH"))
(defconstant constants.ret (jfield +asm-consts+ "RET"))
(defconstant constants.jsr (jfield +asm-consts+ "JSR"))
(defconstant constants.goto (jfield +asm-consts+ "GOTO"))
(defconstant constants.if-acmpne (jfield +asm-consts+ "IF_ACMPNE"))
(defconstant constants.if-acmpeq (jfield +asm-consts+ "IF_ACMPEQ"))
(defconstant constants.if-icmple (jfield +asm-consts+ "IF_ICMPLE"))
(defconstant constants.if-icmpgt (jfield +asm-consts+ "IF_ICMPGT"))
(defconstant constants.if-icmpge (jfield +asm-consts+ "IF_ICMPGE"))
(defconstant constants.if-icmplt (jfield +asm-consts+ "IF_ICMPLT"))
(defconstant constants.if-icmpne (jfield +asm-consts+ "IF_ICMPNE"))
(defconstant constants.if-icmpeq (jfield +asm-consts+ "IF_ICMPEQ"))
(defconstant constants.ifle (jfield +asm-consts+ "IFLE"))
(defconstant constants.ifgt (jfield +asm-consts+ "IFGT"))
(defconstant constants.ifge (jfield +asm-consts+ "IFGE"))
(defconstant constants.iflt (jfield +asm-consts+ "IFLT"))
(defconstant constants.ifne (jfield +asm-consts+ "IFNE"))
(defconstant constants.ifeq (jfield +asm-consts+ "IFEQ"))
(defconstant constants.dcmpg (jfield +asm-consts+ "DCMPG"))
(defconstant constants.dcmpl (jfield +asm-consts+ "DCMPL"))
(defconstant constants.fcmpg (jfield +asm-consts+ "FCMPG"))
(defconstant constants.fcmpl (jfield +asm-consts+ "FCMPL"))
(defconstant constants.lcmp (jfield +asm-consts+ "LCMP"))
(defconstant constants.i2s (jfield +asm-consts+ "I2S"))
(defconstant constants.i2c (jfield +asm-consts+ "I2C"))
(defconstant constants.i2b (jfield +asm-consts+ "I2B"))
(defconstant constants.d2f (jfield +asm-consts+ "D2F"))
(defconstant constants.d2l (jfield +asm-consts+ "D2L"))
(defconstant constants.d2i (jfield +asm-consts+ "D2I"))
(defconstant constants.f2d (jfield +asm-consts+ "F2D"))
(defconstant constants.f2l (jfield +asm-consts+ "F2L"))
(defconstant constants.f2i (jfield +asm-consts+ "F2I"))
(defconstant constants.l2d (jfield +asm-consts+ "L2D"))
(defconstant constants.l2f (jfield +asm-consts+ "L2F"))
(defconstant constants.l2i (jfield +asm-consts+ "L2I"))
(defconstant constants.i2d (jfield +asm-consts+ "I2D"))
(defconstant constants.i2f (jfield +asm-consts+ "I2F"))
(defconstant constants.i2l (jfield +asm-consts+ "I2L"))
(defconstant constants.iinc (jfield +asm-consts+ "IINC"))
(defconstant constants.lxor (jfield +asm-consts+ "LXOR"))
(defconstant constants.ixor (jfield +asm-consts+ "IXOR"))
(defconstant constants.lor (jfield +asm-consts+ "LOR"))
(defconstant constants.ior (jfield +asm-consts+ "IOR"))
(defconstant constants.land (jfield +asm-consts+ "LAND"))
(defconstant constants.iand (jfield +asm-consts+ "IAND"))
(defconstant constants.lushr (jfield +asm-consts+ "LUSHR"))
(defconstant constants.iushr (jfield +asm-consts+ "IUSHR"))
(defconstant constants.lshr (jfield +asm-consts+ "LSHR"))
(defconstant constants.ishr (jfield +asm-consts+ "ISHR"))
(defconstant constants.lshl (jfield +asm-consts+ "LSHL"))
(defconstant constants.ishl (jfield +asm-consts+ "ISHL"))
(defconstant constants.dneg (jfield +asm-consts+ "DNEG"))
(defconstant constants.fneg (jfield +asm-consts+ "FNEG"))
(defconstant constants.lneg (jfield +asm-consts+ "LNEG"))
(defconstant constants.ineg (jfield +asm-consts+ "INEG"))
(defconstant constants.drem (jfield +asm-consts+ "DREM"))
(defconstant constants.frem (jfield +asm-consts+ "FREM"))
(defconstant constants.lrem (jfield +asm-consts+ "LREM"))
(defconstant constants.irem (jfield +asm-consts+ "IREM"))
(defconstant constants.ddiv (jfield +asm-consts+ "DDIV"))
(defconstant constants.fdiv (jfield +asm-consts+ "FDIV"))
(defconstant constants.ldiv (jfield +asm-consts+ "LDIV"))
(defconstant constants.idiv (jfield +asm-consts+ "IDIV"))
(defconstant constants.dmul (jfield +asm-consts+ "DMUL"))
(defconstant constants.fmul (jfield +asm-consts+ "FMUL"))
(defconstant constants.lmul (jfield +asm-consts+ "LMUL"))
(defconstant constants.imul (jfield +asm-consts+ "IMUL"))
(defconstant constants.dsub (jfield +asm-consts+ "DSUB"))
(defconstant constants.fsub (jfield +asm-consts+ "FSUB"))
(defconstant constants.lsub (jfield +asm-consts+ "LSUB"))
(defconstant constants.isub (jfield +asm-consts+ "ISUB"))
(defconstant constants.dadd (jfield +asm-consts+ "DADD"))
(defconstant constants.fadd (jfield +asm-consts+ "FADD"))
(defconstant constants.ladd (jfield +asm-consts+ "LADD"))
(defconstant constants.iadd (jfield +asm-consts+ "IADD"))
(defconstant constants.swap (jfield +asm-consts+ "SWAP"))
(defconstant constants.dup2_x2 (jfield +asm-consts+ "DUP2_X2"))
(defconstant constants.dup2_x1 (jfield +asm-consts+ "DUP2_X1"))
(defconstant constants.dup2 (jfield +asm-consts+ "DUP2"))
(defconstant constants.dup_x2 (jfield +asm-consts+ "DUP_X2"))
(defconstant constants.dup_x1 (jfield +asm-consts+ "DUP_X1"))
(defconstant constants.dup (jfield +asm-consts+ "DUP"))
(defconstant constants.pop2 (jfield +asm-consts+ "POP2"))
(defconstant constants.pop (jfield +asm-consts+ "POP"))
(defconstant constants.sastore (jfield +asm-consts+ "SASTORE"))
(defconstant constants.castore (jfield +asm-consts+ "CASTORE"))
(defconstant constants.bastore (jfield +asm-consts+ "BASTORE"))
(defconstant constants.aastore (jfield +asm-consts+ "AASTORE"))
(defconstant constants.dastore (jfield +asm-consts+ "DASTORE"))
(defconstant constants.fastore (jfield +asm-consts+ "FASTORE"))
(defconstant constants.lastore (jfield +asm-consts+ "LASTORE"))
(defconstant constants.iastore (jfield +asm-consts+ "IASTORE"))
(defconstant constants.astore (jfield +asm-consts+ "ASTORE"))
(defconstant constants.dstore (jfield +asm-consts+ "DSTORE"))
(defconstant constants.fstore (jfield +asm-consts+ "FSTORE"))
(defconstant constants.lstore (jfield +asm-consts+ "LSTORE"))
(defconstant constants.istore (jfield +asm-consts+ "ISTORE"))
(defconstant constants.saload (jfield +asm-consts+ "SALOAD"))
(defconstant constants.caload (jfield +asm-consts+ "CALOAD"))
(defconstant constants.baload (jfield +asm-consts+ "BALOAD"))
(defconstant constants.aaload (jfield +asm-consts+ "AALOAD"))
(defconstant constants.daload (jfield +asm-consts+ "DALOAD"))
(defconstant constants.faload (jfield +asm-consts+ "FALOAD"))
(defconstant constants.laload (jfield +asm-consts+ "LALOAD"))
(defconstant constants.iaload (jfield +asm-consts+ "IALOAD"))
(defconstant constants.aload (jfield +asm-consts+ "ALOAD"))
(defconstant constants.dload (jfield +asm-consts+ "DLOAD"))
(defconstant constants.fload (jfield +asm-consts+ "FLOAD"))
(defconstant constants.lload (jfield +asm-consts+ "LLOAD"))
(defconstant constants.iload (jfield +asm-consts+ "ILOAD"))
(defconstant constants.ldc (jfield +asm-consts+ "LDC"))
(defconstant constants.sipush (jfield +asm-consts+ "SIPUSH"))
(defconstant constants.bipush (jfield +asm-consts+ "BIPUSH"))
(defconstant constants.dconst_1 (jfield +asm-consts+ "DCONST_1"))
(defconstant constants.dconst_0 (jfield +asm-consts+ "DCONST_0"))
(defconstant constants.fconst_2 (jfield +asm-consts+ "FCONST_2"))
(defconstant constants.fconst_1 (jfield +asm-consts+ "FCONST_1"))
(defconstant constants.fconst_0 (jfield +asm-consts+ "FCONST_0"))
(defconstant constants.lconst_1 (jfield +asm-consts+ "LCONST_1"))
(defconstant constants.lconst_0 (jfield +asm-consts+ "LCONST_0"))
(defconstant constants.iconst_5 (jfield +asm-consts+ "ICONST_5"))
(defconstant constants.iconst_4 (jfield +asm-consts+ "ICONST_4"))
(defconstant constants.iconst_3 (jfield +asm-consts+ "ICONST_3"))
(defconstant constants.iconst_2 (jfield +asm-consts+ "ICONST_2"))
(defconstant constants.iconst_1 (jfield +asm-consts+ "ICONST_1"))
(defconstant constants.iconst_0 (jfield +asm-consts+ "ICONST_0"))
(defconstant constants.iconst_m1 (jfield +asm-consts+ "ICONST_M1"))
(defconstant constants.aconst-null (jfield +asm-consts+ "ACONST_NULL"))
(defconstant constants.nop (jfield +asm-consts+ "NOP"))
(defconstant constants.t-long (jfield +asm-consts+ "T_LONG"))
(defconstant constants.t-int (jfield +asm-consts+ "T_INT"))
(defconstant constants.t-short (jfield +asm-consts+ "T_SHORT"))
(defconstant constants.t-byte (jfield +asm-consts+ "T_BYTE"))
(defconstant constants.t-double (jfield +asm-consts+ "T_DOUBLE"))
(defconstant constants.t-float (jfield +asm-consts+ "T_FLOAT"))
(defconstant constants.t-char (jfield +asm-consts+ "T_CHAR"))
(defconstant constants.t-boolean (jfield +asm-consts+ "T_BOOLEAN"))
(defconstant constants.acc-deprecated (jfield +asm-consts+ "ACC_DEPRECATED"))
(defconstant constants.acc-synthetic (jfield +asm-consts+ "ACC_SYNTHETIC"))
(defconstant constants.acc-super (jfield +asm-consts+ "ACC_SUPER"))
(defconstant constants.acc-strict (jfield +asm-consts+ "ACC_STRICT"))
(defconstant constants.acc-abstract (jfield +asm-consts+ "ACC_ABSTRACT"))
(defconstant constants.acc-interface (jfield +asm-consts+ "ACC_INTERFACE"))
(defconstant constants.acc-enum (jfield +asm-consts+ "ACC_ENUM"))
(defconstant constants.acc-native (jfield +asm-consts+ "ACC_NATIVE"))
(defconstant constants.acc-transient (jfield +asm-consts+ "ACC_TRANSIENT"))
(defconstant constants.acc-varargs (jfield +asm-consts+ "ACC_VARARGS"))
(defconstant constants.acc-bridge (jfield +asm-consts+ "ACC_BRIDGE"))
(defconstant constants.acc-volatile (jfield +asm-consts+ "ACC_VOLATILE"))
(defconstant constants.acc-synchronized (jfield +asm-consts+ "ACC_SYNCHRONIZED"))
(defconstant constants.acc-final (jfield +asm-consts+ "ACC_FINAL"))
(defconstant constants.acc-static (jfield +asm-consts+ "ACC_STATIC"))
(defconstant constants.acc-protected (jfield +asm-consts+ "ACC_PROTECTED"))
(defconstant constants.acc-private (jfield +asm-consts+ "ACC_PRIVATE"))
(defconstant constants.acc-public (jfield +asm-consts+ "ACC_PUBLIC"))
(defconstant constants.v1-1 (jfield +asm-consts+ "V1_1"))
(defmethod make-label-0 nil
  (make-instance 'label :java-instance (jnew (jconstructor "org.objectweb.asm.Label"))))

;;end of jparse generated definitions


(defmethod visit-4 ((instance class-writer) (v1 fixnum) (v2 string) (v3 string) v4)
  (jcall
   (jmethod "org.objectweb.asm.ClassWriter" "visit" "int" "int" "java.lang.String" "java.lang.String" "[Ljava.lang.String;" "java.lang.String")
   (java-instance instance) constants.v1-1 v1 v2 v3 v4 nil))

(defmethod visit-field-3 ((instance class-writer) (v1 fixnum) (v2 string) (v3 string))
  (jcall
   (jmethod "org.objectweb.asm.ClassWriter" "visitField" "int" "java.lang.String" "java.lang.String" "java.lang.Object" "org.objectweb.asm.Attribute")
   (java-instance instance) v1 v2 v3 nil nil))

(defmethod visit-method-3 ((instance class-writer) (v1 fixnum) (v2 string) (v3 string))
  (make-instance 'code-visitor :java-instance
                 (jcall
                  (jmethod "org.objectweb.asm.ClassWriter" "visitMethod" "int" "java.lang.String" "java.lang.String" "[Ljava.lang.String;" "org.objectweb.asm.Attribute")
                  (java-instance instance) v1 v2 v3 nil nil)))

(defun make-java-string (string)
  (make-instance '|java.lang.Object|
                 :java-instance (jnew (jconstructor "java.lang.String" "[C") (jnew-array-from-array "char" string))))

(defparameter *primitive-types*
  (acons
   "void" (list "V" (list "" "" "") -1 constants.return -1)
   (acons
    "byte"
    (list "B" (list "org/armedbear/lisp/Fixnum" "java/lang/Byte" "byteValue")
          constants.iload constants.ireturn constants.iconst_0)
    (acons
     "short"
     (list "S" (list "org/armedbear/lisp/Fixnum" "java/lang/Short" "shortValue")
           constants.iload constants.ireturn constants.iconst_0)
     (acons
      "int"
      (list "I" (list "org/armedbear/lisp/Fixnum" "java/lang/Integer" "intValue")
            constants.iload constants.ireturn constants.iconst_0)
      (acons
       "long"
       (list "J" (list "org/armedbear/lisp/Fixnum" "java/lang/Long" "longValue")
             constants.lload constants.lreturn constants.lconst_0)
       (acons
        "float"
        (list "F" (list "org/armedbear/lisp/SingleFloat" "java/lang/Float" "floatValue")
              constants.fload constants.freturn constants.fconst_0)
        (acons
         "double"
         (list "D" (list "org/armedbear/lisp/DoubleFloat" "java/lang/Double" "doubleValue")
               constants.dload constants.dreturn constants.dconst_0)
         (acons
          "char"
          (list "C" (list "org/armedbear/lisp/LispCharacter" "java/lang/Character" "charValue")
                constants.iload constants.ireturn constants.iconst_0)
          (acons
           "boolean"
           (list "Z" (list "org/armedbear/lisp/LispObject" "" "")
                 constants.iload constants.ireturn constants.iconst_0)
           nil))))))))))

(defun primitive-type-p (type)
  (assoc type *primitive-types* :test #'string=))

(defun type-name (type)
  (let* ((dim (count #\[ type :test #'char=))
         (prefix (make-string dim :initial-element #\[))
         (base-type (string-right-trim "[ ]" type))
         (base-name (assoc base-type *primitive-types* :test #'string=)))
    (concatenate 'string prefix
                 (if base-name (cadr base-name)
                     (substitute #\/ #\.
                                 (if (zerop dim) base-type (decorate-type-name base-type)))))))


(defun decorate-type-name (type)
  (if (char= (char type 0) #\[) type
      (format nil "L~a;" type)))

(defun decorated-type-name (type)
  (let ((name (type-name type)))
    (if (primitive-type-p type) name (decorate-type-name name))))

(defun arg-type-for-make-lisp-object (type)
  (if (primitive-type-p type)
      (decorated-type-name type)
      "Ljava/lang/Object;"))

(defun return-type-for-make-lisp-object (type)
  (let ((name (assoc type *primitive-types* :test #'string=)))
    (if name (caaddr name) "org/armedbear/lisp/LispObject")))

(defun cast-type (type)
  (let ((name (assoc type *primitive-types* :test #'string=)))
    (if name (cadr (caddr name)) (type-name type))))

(defun converter-for-primitive-return-type (type)
  (assert (and (primitive-type-p type)
               (not (or (string= type "void")(string= type "boolean")))))
  (caddr (caddr (assoc type *primitive-types* :test #'string=))))

(defun load-instruction (type)
  (let ((name (assoc type *primitive-types* :test #'string=)))
    (if name (cadddr name) constants.aload)))

(defun return-instruction (type)
  (let ((name (assoc type *primitive-types* :test #'string=)))
    (if name (car (cddddr name)) constants.areturn)))

(defun error-constant (type)
  (let ((name (assoc type *primitive-types* :test #'string=)))
    (if name (cadr (cddddr name)) constants.aconst-null)))


(defun size (type)
  (if (or (string= type "long") (string= type "double")) 2 1))

(defun modifier (m)
  (cond ((string= "public" m) constants.acc-public)
        ((string= "protected" m) constants.acc-protected)
        ((string= "private" m) constants.acc-private)
        ((string= "static" m) constants.acc-static)
        ((string= "abstract" m) constants.acc-abstract)
        ((string= "final" m) constants.acc-final)
        ((string= "transient" m) constants.acc-transient)
        ((string= "volatile" m) constants.acc-volatile)
        ((string= "synchronized" m) constants.acc-synchronized)
        (t (error "Invalid modifier ~s." m))))


(defun write-method
  (class-writer class-name class-type-name method-name unique-method-name modifiers result-type arg-types &optional super-invocation)

  (let* ((args-size (reduce #'+ arg-types :key #'size))
         (index (+ 2 args-size))
         (cv (visit-method-3
              class-writer
              (reduce #'+ modifiers :key #'modifier)
              method-name
              (format nil "(~{~a~})~a"
                      (mapcar #'decorated-type-name arg-types) (decorated-type-name result-type)))))

    (when super-invocation
      (visit-var-insn-2 cv constants.aload 0)
      (loop for arg-number in (cdr super-invocation)
        with super-arg-types = (make-string-output-stream)
        do
        (visit-var-insn-2 cv
                          (load-instruction (nth (1- arg-number) arg-types))
                          (reduce #'+ arg-types :end (1- arg-number) :key #'size :initial-value 1))
        (write-string (decorated-type-name (nth (1- arg-number) arg-types)) super-arg-types)
        finally
        (visit-method-insn-4 cv constants.invokespecial
                             (type-name (car super-invocation)) "<init>"
                             (format nil "(~a)~a"
                                     (get-output-stream-string super-arg-types) "V"))))
    (visit-ldc-insn-1 cv (make-java-string class-name))
    (visit-method-insn-4 cv constants.invokestatic
                         "org/armedbear/lisp/RuntimeClass"
                         "getRuntimeClass"
                         "(Ljava/lang/String;)Lorg/armedbear/lisp/RuntimeClass;")
    (visit-field-insn-4 cv constants.putstatic
                        class-type-name "rc" "Lorg/armedbear/lisp/RuntimeClass;")
    (visit-field-insn-4 cv constants.getstatic
                        class-type-name "rc" "Lorg/armedbear/lisp/RuntimeClass;")
    (visit-ldc-insn-1 cv (make-java-string unique-method-name))
    (visit-method-insn-4 cv constants.invokevirtual
                         "org/armedbear/lisp/RuntimeClass"
                         "getLispMethod"
                         "(Ljava/lang/String;)Lorg/armedbear/lisp/Function;")
    (visit-var-insn-2 cv constants.astore (1+ args-size))
    (visit-field-insn-4 cv constants.getstatic
                        "org/armedbear/lisp/Lisp" "NIL" "Lorg/armedbear/lisp/LispObject;")
    (visit-var-insn-2 cv constants.astore (+ 2 args-size))


    (let ((l0 (make-label-0))(l1 (make-label-0))(l2 (make-label-0))(l3 (make-label-0)))
      (visit-label-1 cv l0)

      (visit-var-insn-2 cv constants.aload index)
      (visit-var-insn-2 cv constants.aload 0) ; (visit-var-insn-2 cv constants.aload 0)
      (visit-method-insn-4 cv constants.invokestatic
                           "org/armedbear/lisp/RuntimeClass" "makeLispObject"
                           (format nil "(~a)~a"
                                   (arg-type-for-make-lisp-object "java.lang.Object")
                                   (decorate-type-name (return-type-for-make-lisp-object "java.lang.Object"))))
      (visit-method-insn-4 cv constants.invokevirtual
                           "org/armedbear/lisp/LispObject"
                           "push"
                           "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
      (visit-var-insn-2 cv constants.astore (+ 2 args-size))

      (loop for arg-type in (reverse arg-types) and j = args-size then (- j (size arg-type))
        do
        (visit-var-insn-2 cv constants.aload index)

        (visit-var-insn-2 cv (load-instruction arg-type) j)
        (visit-method-insn-4 cv constants.invokestatic
                             "org/armedbear/lisp/RuntimeClass" "makeLispObject"
                             (format nil "(~a)~a"
                                     (arg-type-for-make-lisp-object arg-type)
                                     (decorate-type-name (return-type-for-make-lisp-object arg-type))))
        (visit-method-insn-4 cv constants.invokevirtual
                           "org/armedbear/lisp/LispObject"
                           "push"
                           "(Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;") ;uj
        (visit-var-insn-2 cv constants.astore (+ 2 args-size)))


      (visit-var-insn-2 cv constants.aload (1- index))
      (visit-var-insn-2 cv constants.aload index)

      (visit-type-insn-2 cv constants.new "org/armedbear/lisp/Environment")
      (visit-insn-1 cv constants.dup)
      (visit-method-insn-4 cv constants.invokespecial "org/armedbear/lisp/Environment" "<init>" "()V")
      (visit-method-insn-4 cv constants.invokestatic
                           "org/armedbear/lisp/LispThread"
                           "currentThread"
                           "()Lorg/armedbear/lisp/LispThread;")
      (visit-method-insn-4 cv constants.invokestatic
                           "org/armedbear/lisp/RuntimeClass"
                           "evalC"
                           "(Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/LispObject;Lorg/armedbear/lisp/Environment;Lorg/armedbear/lisp/LispThread;)Lorg/armedbear/lisp/LispObject;")
      (cond
       ((string= "void" result-type)
        (visit-insn-1 cv constants.pop))
       ((string= "boolean" result-type)
        (visit-method-insn-4 cv constants.invokevirtual
                             (return-type-for-make-lisp-object result-type)
                             "getBooleanValue"
                             (concatenate 'string "()" (type-name result-type))))
       ((primitive-type-p result-type)
        (visit-method-insn-4 cv constants.invokevirtual
                             "org/armedbear/lisp/LispObject"
                             "javaInstance"
                             "()Ljava/lang/Object;")
        (visit-type-insn-2 cv constants.checkcast (cast-type result-type))
        (visit-method-insn-4 cv constants.invokevirtual
                             (cast-type result-type)
                             (converter-for-primitive-return-type result-type)
                             (concatenate 'string "()" (type-name result-type))
                             ))
       (t
        (visit-method-insn-4 cv constants.invokevirtual
                             "org/armedbear/lisp/LispObject" "javaInstance" "()Ljava/lang/Object;")
        (visit-type-insn-2 cv constants.checkcast (cast-type result-type))))


      (visit-label-1 cv l1)
      (if (string= "void" result-type)
          (visit-jump-insn-2 cv constants.goto l3)
          (visit-insn-1 cv (return-instruction result-type)))
      (visit-label-1 cv l2)
      (visit-var-insn-2 cv constants.astore (1+ index))
      (visit-var-insn-2 cv constants.aload (1+ index))
      (visit-method-insn-4 cv constants.invokevirtual
                           "org/armedbear/lisp/ConditionThrowable" "printStackTrace" "()V")

      (if (string= "void" result-type)
          (progn (visit-insn-1 cv (return-instruction result-type))(visit-label-1 cv l3) )
          (visit-insn-1 cv (error-constant result-type)))

      (visit-insn-1 cv (return-instruction result-type))
      (visit-try-catch-block-4 cv l0 l1 l2 "org/armedbear/lisp/ConditionThrowable")

      (visit-maxs-2 cv 0 0))))



(defun asm-jnew-runtime-class (class-name super-name interfaces constructors methods fields &optional filename)
  "Creates and loads a Java class with methods calling Lisp closures
   as given in METHODS.  CLASS-NAME and SUPER-NAME are strings,
   INTERFACES is a list of strings, CONSTRUCTORS, METHODS and FIELDS are
   lists of constructor, method and field definitions.

   Constructor definitions are lists of the form
   (argument-types function &optional super-invocation-arguments)
   where argument-types is a list of strings and function is a lisp function of
   (1+ (length argument-types)) arguments; the instance (`this') is passed in as
   the last argument. The optional super-invocation-arguments is a list of numbers
   between 1 and (length argument-types), where the number k stands for the kth argument
   to the just defined constructor. If present, the constructor of the superclass
   will be called with the appropriate arguments. E.g., if the constructor definition is
   ((\"java.lang.String\" \"int\") #'(lambda (string i this) ...) (2 1))
   then the constructor of the superclass with argument types (int, java.lang.String) will
   be called with the second and first arguments.

   Method definitions are lists of the form
   (method-name return-type argument-types function modifier*)
   where method-name and return-type are strings, argument-types is a list of strings and function
   is a lisp function of (1+ (length argument-types)) arguments; the instance (`this') is
   passed in as the last argument.

   Field definitions are lists of the form
   (field-name type modifier*)

   If FILE-NAME is given, a .class file will be written; this is useful for debugging only."

  (let ((cw (make-class-writer-1 (make-instance 'jboolean :java-instance t)))
        (class-type-name (type-name class-name))
        (super-type-name (type-name super-name))
        (interface-type-names
         (when interfaces
           (let* ((no-of-interfaces (length interfaces))
                  (ifarray (jnew-array "java.lang.String" no-of-interfaces)))
             (dotimes (i no-of-interfaces ifarray)
               (setf (jarray-ref ifarray i) (type-name (nth i interfaces)))))))
        (args-for-%jnew))
    (visit-4 cw (+ constants.acc-public constants.acc-super)
             class-type-name super-type-name interface-type-names)
    (visit-field-3 cw (+ constants.acc-private constants.acc-static)
                   "rc" "Lorg/armedbear/lisp/RuntimeClass;")

    (dolist (field-def fields)
      (visit-field-3 cw
                     (reduce #'+ (cddr field-def) :key #'modifier)
                     (car field-def)
                     (decorated-type-name (cadr field-def))))


    (if constructors
        (loop for (arg-types constr-def super-invocation-args) in constructors
          for unique-method-name = (apply #'concatenate 'string "<init>|" arg-types)
          then (apply #'concatenate 'string "<init>|" arg-types)
          collect unique-method-name into args
          collect (coerce constr-def 'function) into args
          do
          (write-method
           cw class-name class-type-name "<init>" unique-method-name '("public") "void" arg-types
           (cons super-type-name super-invocation-args))
          finally
          (setf args-for-%jnew (append args-for-%jnew args)))
        (let ((cv (visit-method-3 cw constants.acc-public "<init>" "()V")))
          (visit-var-insn-2 cv constants.aload 0)
          (visit-method-insn-4 cv constants.invokespecial super-type-name "<init>" "()V")
          (visit-insn-1 cv constants.return)
          (visit-maxs-2 cv 1 1)))

    (loop for (method-name ret-type arg-types method-def . modifiers) in methods
      for unique-method-name = (apply #'concatenate 'string method-name "|" arg-types)
      then (apply #'concatenate 'string method-name "|" arg-types)
      collect unique-method-name into args
      collect (coerce method-def 'function) into args
      do
      (write-method
       cw class-name class-type-name method-name unique-method-name modifiers ret-type arg-types)
      finally
      (apply #'java::%jnew-runtime-class class-name (append args-for-%jnew args)))

    (visit-end-0 cw)

    (when filename
      (let ((os (make-file-output-stream-1 filename)))
        (write-1 os (to-byte-array-0 cw))
        (close-0 os)))

    (java::%load-java-class-from-byte-array class-name (java-instance (to-byte-array-0 cw)))))



(defun asm-jredefine-method (class-name method-name arg-types method-def)
  "Replace the definition of the method named METHDO-NAME (or
   constructor, if METHD-NAME is nil) of argument types ARG-TYPES of the
   class named CLASS-NAME defined with JNEW-RUNTIME-CLASS with
   METHOD-DEF. See the documentation of JNEW-RUNTIME-CLASS."
  (assert (asm-jruntime-class-exists-p class-name) (class-name)
          "Can't redefine methods of undefined runtime class ~a" class-name)
  (let ((unique-method-name
         (apply #'concatenate 'string (if method-name method-name "<init>") "|" arg-types)))
    (java::%jredefine-method class-name unique-method-name  (compile nil method-def))))

(defun asm-jruntime-class-exists-p (class-name)
  "Returns true if a class named CLASS-NAME has been created and loaded by JNEW-RUNTIME-CLASS.
   Needed because Java classes cannot be reloaded."
  (when
    (jstatic (jmethod "org.armedbear.lisp.RuntimeClass" "getRuntimeClass" "java.lang.String")
             "org.armedbear.lisp.RuntimeClass"
             class-name)
    t))

(export 'ASM-JNEW-RUNTIME-CLASS)
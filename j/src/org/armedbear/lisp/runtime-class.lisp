;;; runtime-class.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;;
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

(in-package :java)

(require :format)

;; jparse generated definitions, somewhat simplified

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
(define-symbol-macro constants.ifnonnull (jfield "org.objectweb.asm.Constants" "IFNONNULL"))
(define-symbol-macro constants.ifnull (jfield "org.objectweb.asm.Constants" "IFNULL"))
(define-symbol-macro constants.multianewarray (jfield "org.objectweb.asm.Constants" "MULTIANEWARRAY"))
(define-symbol-macro constants.monitorexit (jfield "org.objectweb.asm.Constants" "MONITOREXIT"))
(define-symbol-macro constants.monitorenter (jfield "org.objectweb.asm.Constants" "MONITORENTER"))
(define-symbol-macro constants.instanceof (jfield "org.objectweb.asm.Constants" "INSTANCEOF"))
(define-symbol-macro constants.checkcast (jfield "org.objectweb.asm.Constants" "CHECKCAST"))
(define-symbol-macro constants.athrow (jfield "org.objectweb.asm.Constants" "ATHROW"))
(define-symbol-macro constants.arraylength (jfield "org.objectweb.asm.Constants" "ARRAYLENGTH"))
(define-symbol-macro constants.anewarray (jfield "org.objectweb.asm.Constants" "ANEWARRAY"))
(define-symbol-macro constants.newarray (jfield "org.objectweb.asm.Constants" "NEWARRAY"))
(define-symbol-macro constants.new (jfield "org.objectweb.asm.Constants" "NEW"))
(define-symbol-macro constants.invokeinterface (jfield "org.objectweb.asm.Constants" "INVOKEINTERFACE"))
(define-symbol-macro constants.invokestatic (jfield "org.objectweb.asm.Constants" "INVOKESTATIC"))
(define-symbol-macro constants.invokespecial (jfield "org.objectweb.asm.Constants" "INVOKESPECIAL"))
(define-symbol-macro constants.invokevirtual (jfield "org.objectweb.asm.Constants" "INVOKEVIRTUAL"))
(define-symbol-macro constants.putfield (jfield "org.objectweb.asm.Constants" "PUTFIELD"))
(define-symbol-macro constants.getfield (jfield "org.objectweb.asm.Constants" "GETFIELD"))
(define-symbol-macro constants.putstatic (jfield "org.objectweb.asm.Constants" "PUTSTATIC"))
(define-symbol-macro constants.getstatic (jfield "org.objectweb.asm.Constants" "GETSTATIC"))
(define-symbol-macro constants.return (jfield "org.objectweb.asm.Constants" "RETURN"))
(define-symbol-macro constants.areturn (jfield "org.objectweb.asm.Constants" "ARETURN"))
(define-symbol-macro constants.dreturn (jfield "org.objectweb.asm.Constants" "DRETURN"))
(define-symbol-macro constants.freturn (jfield "org.objectweb.asm.Constants" "FRETURN"))
(define-symbol-macro constants.lreturn (jfield "org.objectweb.asm.Constants" "LRETURN"))
(define-symbol-macro constants.ireturn (jfield "org.objectweb.asm.Constants" "IRETURN"))
(define-symbol-macro constants.lookupswitch (jfield "org.objectweb.asm.Constants" "LOOKUPSWITCH"))
(define-symbol-macro constants.tableswitch (jfield "org.objectweb.asm.Constants" "TABLESWITCH"))
(define-symbol-macro constants.ret (jfield "org.objectweb.asm.Constants" "RET"))
(define-symbol-macro constants.jsr (jfield "org.objectweb.asm.Constants" "JSR"))
(define-symbol-macro constants.goto (jfield "org.objectweb.asm.Constants" "GOTO"))
(define-symbol-macro constants.if-acmpne (jfield "org.objectweb.asm.Constants" "IF_ACMPNE"))
(define-symbol-macro constants.if-acmpeq (jfield "org.objectweb.asm.Constants" "IF_ACMPEQ"))
(define-symbol-macro constants.if-icmple (jfield "org.objectweb.asm.Constants" "IF_ICMPLE"))
(define-symbol-macro constants.if-icmpgt (jfield "org.objectweb.asm.Constants" "IF_ICMPGT"))
(define-symbol-macro constants.if-icmpge (jfield "org.objectweb.asm.Constants" "IF_ICMPGE"))
(define-symbol-macro constants.if-icmplt (jfield "org.objectweb.asm.Constants" "IF_ICMPLT"))
(define-symbol-macro constants.if-icmpne (jfield "org.objectweb.asm.Constants" "IF_ICMPNE"))
(define-symbol-macro constants.if-icmpeq (jfield "org.objectweb.asm.Constants" "IF_ICMPEQ"))
(define-symbol-macro constants.ifle (jfield "org.objectweb.asm.Constants" "IFLE"))
(define-symbol-macro constants.ifgt (jfield "org.objectweb.asm.Constants" "IFGT"))
(define-symbol-macro constants.ifge (jfield "org.objectweb.asm.Constants" "IFGE"))
(define-symbol-macro constants.iflt (jfield "org.objectweb.asm.Constants" "IFLT"))
(define-symbol-macro constants.ifne (jfield "org.objectweb.asm.Constants" "IFNE"))
(define-symbol-macro constants.ifeq (jfield "org.objectweb.asm.Constants" "IFEQ"))
(define-symbol-macro constants.dcmpg (jfield "org.objectweb.asm.Constants" "DCMPG"))
(define-symbol-macro constants.dcmpl (jfield "org.objectweb.asm.Constants" "DCMPL"))
(define-symbol-macro constants.fcmpg (jfield "org.objectweb.asm.Constants" "FCMPG"))
(define-symbol-macro constants.fcmpl (jfield "org.objectweb.asm.Constants" "FCMPL"))
(define-symbol-macro constants.lcmp (jfield "org.objectweb.asm.Constants" "LCMP"))
(define-symbol-macro constants.i2s (jfield "org.objectweb.asm.Constants" "I2S"))
(define-symbol-macro constants.i2c (jfield "org.objectweb.asm.Constants" "I2C"))
(define-symbol-macro constants.i2b (jfield "org.objectweb.asm.Constants" "I2B"))
(define-symbol-macro constants.d2f (jfield "org.objectweb.asm.Constants" "D2F"))
(define-symbol-macro constants.d2l (jfield "org.objectweb.asm.Constants" "D2L"))
(define-symbol-macro constants.d2i (jfield "org.objectweb.asm.Constants" "D2I"))
(define-symbol-macro constants.f2d (jfield "org.objectweb.asm.Constants" "F2D"))
(define-symbol-macro constants.f2l (jfield "org.objectweb.asm.Constants" "F2L"))
(define-symbol-macro constants.f2i (jfield "org.objectweb.asm.Constants" "F2I"))
(define-symbol-macro constants.l2d (jfield "org.objectweb.asm.Constants" "L2D"))
(define-symbol-macro constants.l2f (jfield "org.objectweb.asm.Constants" "L2F"))
(define-symbol-macro constants.l2i (jfield "org.objectweb.asm.Constants" "L2I"))
(define-symbol-macro constants.i2d (jfield "org.objectweb.asm.Constants" "I2D"))
(define-symbol-macro constants.i2f (jfield "org.objectweb.asm.Constants" "I2F"))
(define-symbol-macro constants.i2l (jfield "org.objectweb.asm.Constants" "I2L"))
(define-symbol-macro constants.iinc (jfield "org.objectweb.asm.Constants" "IINC"))
(define-symbol-macro constants.lxor (jfield "org.objectweb.asm.Constants" "LXOR"))
(define-symbol-macro constants.ixor (jfield "org.objectweb.asm.Constants" "IXOR"))
(define-symbol-macro constants.lor (jfield "org.objectweb.asm.Constants" "LOR"))
(define-symbol-macro constants.ior (jfield "org.objectweb.asm.Constants" "IOR"))
(define-symbol-macro constants.land (jfield "org.objectweb.asm.Constants" "LAND"))
(define-symbol-macro constants.iand (jfield "org.objectweb.asm.Constants" "IAND"))
(define-symbol-macro constants.lushr (jfield "org.objectweb.asm.Constants" "LUSHR"))
(define-symbol-macro constants.iushr (jfield "org.objectweb.asm.Constants" "IUSHR"))
(define-symbol-macro constants.lshr (jfield "org.objectweb.asm.Constants" "LSHR"))
(define-symbol-macro constants.ishr (jfield "org.objectweb.asm.Constants" "ISHR"))
(define-symbol-macro constants.lshl (jfield "org.objectweb.asm.Constants" "LSHL"))
(define-symbol-macro constants.ishl (jfield "org.objectweb.asm.Constants" "ISHL"))
(define-symbol-macro constants.dneg (jfield "org.objectweb.asm.Constants" "DNEG"))
(define-symbol-macro constants.fneg (jfield "org.objectweb.asm.Constants" "FNEG"))
(define-symbol-macro constants.lneg (jfield "org.objectweb.asm.Constants" "LNEG"))
(define-symbol-macro constants.ineg (jfield "org.objectweb.asm.Constants" "INEG"))
(define-symbol-macro constants.drem (jfield "org.objectweb.asm.Constants" "DREM"))
(define-symbol-macro constants.frem (jfield "org.objectweb.asm.Constants" "FREM"))
(define-symbol-macro constants.lrem (jfield "org.objectweb.asm.Constants" "LREM"))
(define-symbol-macro constants.irem (jfield "org.objectweb.asm.Constants" "IREM"))
(define-symbol-macro constants.ddiv (jfield "org.objectweb.asm.Constants" "DDIV"))
(define-symbol-macro constants.fdiv (jfield "org.objectweb.asm.Constants" "FDIV"))
(define-symbol-macro constants.ldiv (jfield "org.objectweb.asm.Constants" "LDIV"))
(define-symbol-macro constants.idiv (jfield "org.objectweb.asm.Constants" "IDIV"))
(define-symbol-macro constants.dmul (jfield "org.objectweb.asm.Constants" "DMUL"))
(define-symbol-macro constants.fmul (jfield "org.objectweb.asm.Constants" "FMUL"))
(define-symbol-macro constants.lmul (jfield "org.objectweb.asm.Constants" "LMUL"))
(define-symbol-macro constants.imul (jfield "org.objectweb.asm.Constants" "IMUL"))
(define-symbol-macro constants.dsub (jfield "org.objectweb.asm.Constants" "DSUB"))
(define-symbol-macro constants.fsub (jfield "org.objectweb.asm.Constants" "FSUB"))
(define-symbol-macro constants.lsub (jfield "org.objectweb.asm.Constants" "LSUB"))
(define-symbol-macro constants.isub (jfield "org.objectweb.asm.Constants" "ISUB"))
(define-symbol-macro constants.dadd (jfield "org.objectweb.asm.Constants" "DADD"))
(define-symbol-macro constants.fadd (jfield "org.objectweb.asm.Constants" "FADD"))
(define-symbol-macro constants.ladd (jfield "org.objectweb.asm.Constants" "LADD"))
(define-symbol-macro constants.iadd (jfield "org.objectweb.asm.Constants" "IADD"))
(define-symbol-macro constants.swap (jfield "org.objectweb.asm.Constants" "SWAP"))
(define-symbol-macro constants.dup2_x2 (jfield "org.objectweb.asm.Constants" "DUP2_X2"))
(define-symbol-macro constants.dup2_x1 (jfield "org.objectweb.asm.Constants" "DUP2_X1"))
(define-symbol-macro constants.dup2 (jfield "org.objectweb.asm.Constants" "DUP2"))
(define-symbol-macro constants.dup_x2 (jfield "org.objectweb.asm.Constants" "DUP_X2"))
(define-symbol-macro constants.dup_x1 (jfield "org.objectweb.asm.Constants" "DUP_X1"))
(define-symbol-macro constants.dup (jfield "org.objectweb.asm.Constants" "DUP"))
(define-symbol-macro constants.pop2 (jfield "org.objectweb.asm.Constants" "POP2"))
(define-symbol-macro constants.pop (jfield "org.objectweb.asm.Constants" "POP"))
(define-symbol-macro constants.sastore (jfield "org.objectweb.asm.Constants" "SASTORE"))
(define-symbol-macro constants.castore (jfield "org.objectweb.asm.Constants" "CASTORE"))
(define-symbol-macro constants.bastore (jfield "org.objectweb.asm.Constants" "BASTORE"))
(define-symbol-macro constants.aastore (jfield "org.objectweb.asm.Constants" "AASTORE"))
(define-symbol-macro constants.dastore (jfield "org.objectweb.asm.Constants" "DASTORE"))
(define-symbol-macro constants.fastore (jfield "org.objectweb.asm.Constants" "FASTORE"))
(define-symbol-macro constants.lastore (jfield "org.objectweb.asm.Constants" "LASTORE"))
(define-symbol-macro constants.iastore (jfield "org.objectweb.asm.Constants" "IASTORE"))
(define-symbol-macro constants.astore (jfield "org.objectweb.asm.Constants" "ASTORE"))
(define-symbol-macro constants.dstore (jfield "org.objectweb.asm.Constants" "DSTORE"))
(define-symbol-macro constants.fstore (jfield "org.objectweb.asm.Constants" "FSTORE"))
(define-symbol-macro constants.lstore (jfield "org.objectweb.asm.Constants" "LSTORE"))
(define-symbol-macro constants.istore (jfield "org.objectweb.asm.Constants" "ISTORE"))
(define-symbol-macro constants.saload (jfield "org.objectweb.asm.Constants" "SALOAD"))
(define-symbol-macro constants.caload (jfield "org.objectweb.asm.Constants" "CALOAD"))
(define-symbol-macro constants.baload (jfield "org.objectweb.asm.Constants" "BALOAD"))
(define-symbol-macro constants.aaload (jfield "org.objectweb.asm.Constants" "AALOAD"))
(define-symbol-macro constants.daload (jfield "org.objectweb.asm.Constants" "DALOAD"))
(define-symbol-macro constants.faload (jfield "org.objectweb.asm.Constants" "FALOAD"))
(define-symbol-macro constants.laload (jfield "org.objectweb.asm.Constants" "LALOAD"))
(define-symbol-macro constants.iaload (jfield "org.objectweb.asm.Constants" "IALOAD"))
(define-symbol-macro constants.aload (jfield "org.objectweb.asm.Constants" "ALOAD"))
(define-symbol-macro constants.dload (jfield "org.objectweb.asm.Constants" "DLOAD"))
(define-symbol-macro constants.fload (jfield "org.objectweb.asm.Constants" "FLOAD"))
(define-symbol-macro constants.lload (jfield "org.objectweb.asm.Constants" "LLOAD"))
(define-symbol-macro constants.iload (jfield "org.objectweb.asm.Constants" "ILOAD"))
(define-symbol-macro constants.ldc (jfield "org.objectweb.asm.Constants" "LDC"))
(define-symbol-macro constants.sipush (jfield "org.objectweb.asm.Constants" "SIPUSH"))
(define-symbol-macro constants.bipush (jfield "org.objectweb.asm.Constants" "BIPUSH"))
(define-symbol-macro constants.dconst_1 (jfield "org.objectweb.asm.Constants" "DCONST_1"))
(define-symbol-macro constants.dconst_0 (jfield "org.objectweb.asm.Constants" "DCONST_0"))
(define-symbol-macro constants.fconst_2 (jfield "org.objectweb.asm.Constants" "FCONST_2"))
(define-symbol-macro constants.fconst_1 (jfield "org.objectweb.asm.Constants" "FCONST_1"))
(define-symbol-macro constants.fconst_0 (jfield "org.objectweb.asm.Constants" "FCONST_0"))
(define-symbol-macro constants.lconst_1 (jfield "org.objectweb.asm.Constants" "LCONST_1"))
(define-symbol-macro constants.lconst_0 (jfield "org.objectweb.asm.Constants" "LCONST_0"))
(define-symbol-macro constants.iconst_5 (jfield "org.objectweb.asm.Constants" "ICONST_5"))
(define-symbol-macro constants.iconst_4 (jfield "org.objectweb.asm.Constants" "ICONST_4"))
(define-symbol-macro constants.iconst_3 (jfield "org.objectweb.asm.Constants" "ICONST_3"))
(define-symbol-macro constants.iconst_2 (jfield "org.objectweb.asm.Constants" "ICONST_2"))
(define-symbol-macro constants.iconst_1 (jfield "org.objectweb.asm.Constants" "ICONST_1"))
(define-symbol-macro constants.iconst_0 (jfield "org.objectweb.asm.Constants" "ICONST_0"))
(define-symbol-macro constants.iconst_m1 (jfield "org.objectweb.asm.Constants" "ICONST_M1"))
(define-symbol-macro constants.aconst-null (jfield "org.objectweb.asm.Constants" "ACONST_NULL"))
(define-symbol-macro constants.nop (jfield "org.objectweb.asm.Constants" "NOP"))
(define-symbol-macro constants.t-long (jfield "org.objectweb.asm.Constants" "T_LONG"))
(define-symbol-macro constants.t-int (jfield "org.objectweb.asm.Constants" "T_INT"))
(define-symbol-macro constants.t-short (jfield "org.objectweb.asm.Constants" "T_SHORT"))
(define-symbol-macro constants.t-byte (jfield "org.objectweb.asm.Constants" "T_BYTE"))
(define-symbol-macro constants.t-double (jfield "org.objectweb.asm.Constants" "T_DOUBLE"))
(define-symbol-macro constants.t-float (jfield "org.objectweb.asm.Constants" "T_FLOAT"))
(define-symbol-macro constants.t-char (jfield "org.objectweb.asm.Constants" "T_CHAR"))
(define-symbol-macro constants.t-boolean (jfield "org.objectweb.asm.Constants" "T_BOOLEAN"))
(define-symbol-macro constants.acc-deprecated (jfield "org.objectweb.asm.Constants" "ACC_DEPRECATED"))
(define-symbol-macro constants.acc-synthetic (jfield "org.objectweb.asm.Constants" "ACC_SYNTHETIC"))
(define-symbol-macro constants.acc-super (jfield "org.objectweb.asm.Constants" "ACC_SUPER"))
(define-symbol-macro constants.acc-strict (jfield "org.objectweb.asm.Constants" "ACC_STRICT"))
(define-symbol-macro constants.acc-abstract (jfield "org.objectweb.asm.Constants" "ACC_ABSTRACT"))
(define-symbol-macro constants.acc-interface (jfield "org.objectweb.asm.Constants" "ACC_INTERFACE"))
(define-symbol-macro constants.acc-enum (jfield "org.objectweb.asm.Constants" "ACC_ENUM"))
(define-symbol-macro constants.acc-native (jfield "org.objectweb.asm.Constants" "ACC_NATIVE"))
(define-symbol-macro constants.acc-transient (jfield "org.objectweb.asm.Constants" "ACC_TRANSIENT"))
(define-symbol-macro constants.acc-varargs (jfield "org.objectweb.asm.Constants" "ACC_VARARGS"))
(define-symbol-macro constants.acc-bridge (jfield "org.objectweb.asm.Constants" "ACC_BRIDGE"))
(define-symbol-macro constants.acc-volatile (jfield "org.objectweb.asm.Constants" "ACC_VOLATILE"))
(define-symbol-macro constants.acc-synchronized (jfield "org.objectweb.asm.Constants" "ACC_SYNCHRONIZED"))
(define-symbol-macro constants.acc-final (jfield "org.objectweb.asm.Constants" "ACC_FINAL"))
(define-symbol-macro constants.acc-static (jfield "org.objectweb.asm.Constants" "ACC_STATIC"))
(define-symbol-macro constants.acc-protected (jfield "org.objectweb.asm.Constants" "ACC_PROTECTED"))
(define-symbol-macro constants.acc-private (jfield "org.objectweb.asm.Constants" "ACC_PRIVATE"))
(define-symbol-macro constants.acc-public (jfield "org.objectweb.asm.Constants" "ACC_PUBLIC"))
(defmethod make-label-0 nil
  (make-instance 'label :java-instance (jnew (jconstructor "org.objectweb.asm.Label"))))

;;end of jparse generated definitions


(defmethod visit-3 ((instance class-writer) (v1 fixnum) (v2 string) (v3 string))
  (jcall
   (jmethod "org.objectweb.asm.ClassWriter" "visit" "int" "java.lang.String" "java.lang.String" "[Ljava.lang.String;" "java.lang.String")
   (java-instance instance) v1 v2 v3 nil nil))

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
  (acons "void" (list "V" "" -1 constants.return -1)
         (acons "byte"
                (list "B" "org/armedbear/lisp/Fixnum"
                      constants.iload constants.ireturn constants.iconst_0)
                (acons "short"
                       (list "S" "org/armedbear/lisp/Fixnum"
                             constants.iload constants.ireturn constants.iconst_0)
                       (acons "int"
                              (list "I" "org/armedbear/lisp/Fixnum"
                                    constants.iload constants.ireturn constants.iconst_0)
                              (acons "long"
                                     (list "J" "org/armedbear/lisp/Bignum"
                                           constants.lload constants.lreturn constants.lconst_0) 
                                     (acons "float"
                                            (list "F" "org/armedbear/lisp/LispFloat"
                                                  constants.fload constants.freturn constants.fconst_0)
                                            (acons "double"
                                                   (list "D" "org/armedbear/lisp/LispFloat"
                                                         constants.dload constants.dreturn constants.dconst_0)
                                                   (acons "char"
                                                          (list "C" "org/armedbear/lisp/LispCharacter"
                                                                constants.iload constants.ireturn constants.iconst_0)
                                                          (acons "boolean"
                                                                 (list "Z" "org/armedbear/lisp/LispObject"
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
    (if name (caddr name) "org/armedbear/lisp/LispObject")))

(defun cast-type (type)
  (let ((name (assoc type *primitive-types* :test #'string=)))
    (if name (caddr name) (type-name type))))


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

(defun field-modifier (m)
  (cond ((string= "public" m) constants.acc-public)
        ((string= "protected" m) constants.acc-protected)
        ((string= "private" m) constants.acc-private)
        ((string= "static" m) constants.acc-static)
        ((string= "final" m) constants.acc-final)
        ((string= "transient" m) constants.acc-transient)
        ((string= "volatile" m) constants.acc-volatile)
        (t (error "Invalid field modifier ~s." m))))


(defun write-method
  (class-writer class-name method-name unique-method-name result-type arg-types &optional super-invocation)

  (let* ((arg-count (length arg-types))
         (args-size (reduce #'+ arg-types :key #'size))
         (index (+ 2 args-size))
         (cv (visit-method-3
	      class-writer
	      constants.acc-public
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
	(write-string (arg-type-for-make-lisp-object (nth (1- arg-number) arg-types)) super-arg-types)
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
                        class-name "rc" "Lorg/armedbear/lisp/RuntimeClass;")
    (visit-field-insn-4 cv constants.getstatic
                        class-name "rc" "Lorg/armedbear/lisp/RuntimeClass;")
    (visit-ldc-insn-1 cv (make-java-string unique-method-name))
    (visit-method-insn-4 cv constants.invokevirtual 
                         "org/armedbear/lisp/RuntimeClass"
                         "getLispMethod"
                         "(Ljava/lang/String;)Lorg/armedbear/lisp/Function;")
    (visit-var-insn-2 cv constants.astore (1+ args-size))
    (visit-int-insn-2 cv constants.bipush (1+ arg-count))
    (visit-type-insn-2 cv constants.anewarray "org/armedbear/lisp/LispObject")
    (visit-var-insn-2 cv constants.astore (+ 2 args-size))


    (let ((l0 (make-label-0))(l1 (make-label-0))(l2 (make-label-0))(l3 (make-label-0)))
      (visit-label-1 cv l0)

      (loop for arg-type in arg-types and i from 0 and j = 1 then (+ j (size arg-type))
	do
	(visit-var-insn-2 cv constants.aload index)
	(visit-int-insn-2 cv constants.bipush i)
	(visit-var-insn-2 cv (load-instruction arg-type) j)
	(visit-method-insn-4 cv constants.invokestatic
                             "org/armedbear/lisp/RuntimeClass" "makeLispObject"
                             (format nil "(~a)~a"
                                     (arg-type-for-make-lisp-object arg-type)
                                     (decorate-type-name (return-type-for-make-lisp-object arg-type))))
	(visit-insn-1 cv constants.aastore))

      (visit-var-insn-2 cv constants.aload index)
      (visit-int-insn-2 cv constants.bipush arg-count)
      (visit-var-insn-2 cv constants.aload 0)
      (visit-method-insn-4 cv constants.invokestatic
                           "org/armedbear/lisp/RuntimeClass" "makeLispObject"
                           (format nil "(~a)~a"
                                   (arg-type-for-make-lisp-object "java.lang.Object")
                                   (decorate-type-name (return-type-for-make-lisp-object "java.lang.Object"))))
      (visit-insn-1 cv constants.aastore)

      (visit-var-insn-2 cv constants.aload (1- index))
      (visit-var-insn-2 cv constants.aload index)
      (visit-method-insn-4 cv constants.invokevirtual
                           "org/armedbear/lisp/Function"
                           "execute"
                           "([Lorg/armedbear/lisp/LispObject;)Lorg/armedbear/lisp/LispObject;")
      (cond
       ((string= "void" result-type)
        (visit-insn-1 cv constants.pop))
       ((string= "boolean" result-type)
        (visit-method-insn-4 cv constants.invokevirtual
                             (return-type-for-make-lisp-object result-type)
                             "getBooleanValue"
                             (concatenate 'string "()" (type-name result-type))))
       ((primitive-type-p result-type)
        (visit-type-insn-2 cv constants.checkcast (cast-type result-type))
        (visit-method-insn-4 cv constants.invokevirtual
                             (return-type-for-make-lisp-object result-type)
                             "getValue"
                             (concatenate 'string "()" (type-name result-type))))
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
          (visit-label-1 cv l3)
          (visit-insn-1 cv (error-constant result-type)))
      
      (visit-insn-1 cv (return-instruction result-type))
      (visit-try-catch-block-4 cv l0 l1 l2 "org/armedbear/lisp/ConditionThrowable")

      (visit-maxs-2 cv 0 0))))
  


(defun jnew-runtime-class (class-name super-name constructors methods fields &optional filename)
  "Creates and loads a Java class with methods calling Lisp closures as given in METHODS.
   CLASS-NAME and SUPER-NAME are strings, CONSTRUCTORS,  METHODS and FIELDS are lists of
   constructor, method and field definitions. 

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
   (method-name return-type argument-types function)
   where method-name and return-type are strings, argument-types is a list of strings and function
   is a lisp function of (1+ (length argument-types)) arguments; the instance (`this') is
   passed in as the last argument.

   Field definitions are lists of the form
   (field-name type modifier*)
   
   If FILE-NAME is given, a .class file will be written; this is useful for debugging only."

  (let ((cw (make-class-writer-1 (make-instance 'jboolean :java-instance t)))
        (class-type-name (type-name class-name))
        (super-type-name (type-name super-name))
	(args-for-%jnew))
    (visit-3 cw (+ constants.acc-public constants.acc-super)
             class-type-name super-type-name)
    (visit-field-3 cw (+ constants.acc-private constants.acc-static)
                   "rc" "Lorg/armedbear/lisp/RuntimeClass;")

    (dolist (field-def fields)
      (visit-field-3 cw
                     (reduce #'+ (cddr field-def) :key #'field-modifier)
                     (car field-def)
                     (decorated-type-name (cadr field-def))))
	  
	
    (if constructors
        (loop for (arg-types constr-def super-invocation-args) in constructors
          for unique-method-name = (apply #'concatenate 'string "<init>|" arg-types)
          then (apply #'concatenate 'string "<init>|" arg-types)
          collect unique-method-name into args
          collect constr-def into args
          do
          (write-method cw class-type-name "<init>" unique-method-name "void" arg-types
                        (cons super-type-name super-invocation-args))
          finally
          (setf args-for-%jnew (append args-for-%jnew args)))
        (let ((cv (visit-method-3 cw constants.acc-public "<init>" "()V")))
          (visit-var-insn-2 cv constants.aload 0)
          (visit-method-insn-4 cv constants.invokespecial super-type-name "<init>" "()V")
          (visit-insn-1 cv constants.return)
          (visit-maxs-2 cv 1 1)))

    (loop for (method-name ret-type arg-types method-def) in methods
      for unique-method-name = (apply #'concatenate 'string method-name "|" arg-types)
      then (apply #'concatenate 'string method-name "|" arg-types)
      collect unique-method-name into args
      collect method-def into args
      do
      (write-method cw class-type-name method-name unique-method-name ret-type arg-types)
      finally
      (apply #'java::%jnew-runtime-class class-name (append args-for-%jnew args)))
  
    (visit-end-0 cw)

    (when filename
      (let ((os (make-file-output-stream-1 filename)))
	(write-1 os (to-byte-array-0 cw))
	(close-0 os)))

    (java::%load-java-class-from-byte-array class-name (java-instance (to-byte-array-0 cw)))))

(defun jredefine-method (class-name method-name arg-types method-def)
  "Replace the definition of the method named METHDO-NAME of argument types ARG-TYPES of the
   class named CLASS-NAME defined with JNEW-RUNTIME-CLASS with METHOD-DEF. See the documentation of
   JNEW-RUNTIME-CLASS."
  (assert (jruntime-class-exists-p class-name) (class-name)
          "Can't redefine methods of undefined runtime class ~a" class-name)
  (let ((unique-method-name (apply #'concatenate 'string method-name "|" arg-types)))
    (java::%jredefine-method class-name unique-method-name method-def)))

(defun jruntime-class-exists-p (class-name)
  "Returns true if a class named CLASS-NAME has been created and loaded by JNEW-RUNTIME-CLASS.
   Needed because Java classes cannot be reloaded."
  (when 
    (jstatic (jmethod "org.armedbear.lisp.RuntimeClass" "getRuntimeClass" "java.lang.String")
             "org.armedbear.lisp.RuntimeClass"
             class-name)
    t))
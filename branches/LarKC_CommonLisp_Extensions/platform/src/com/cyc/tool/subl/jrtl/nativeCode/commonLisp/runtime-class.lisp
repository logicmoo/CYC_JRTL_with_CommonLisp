;;; runtime-class.lisp
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
;; (compile-system)
;; (load "../logicmoo-invoke-interface/src/com/cyc/tool/subl/jrtl/nativeCode/commonLisp/runtime-class.lisp")
(in-package :java)

(require :format)

;; jparse generated definitions, somewhat simplified

(defconstant +asm-constants+ "org.objectweb.asm.Opcodes")
;;(defconstant +asm-constants+ "org.objectweb.asm.Constants")

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
(defconstant constants.ifnonnull (jfield +asm-constants+ "IFNONNULL"))
(defconstant constants.ifnull (jfield +asm-constants+ "IFNULL"))
(defconstant constants.multianewarray (jfield +asm-constants+ "MULTIANEWARRAY"))
(defconstant constants.monitorexit (jfield +asm-constants+ "MONITOREXIT"))
(defconstant constants.monitorenter (jfield +asm-constants+ "MONITORENTER"))
(defconstant constants.instanceof (jfield +asm-constants+ "INSTANCEOF"))
(defconstant constants.checkcast (jfield +asm-constants+ "CHECKCAST"))
(defconstant constants.athrow (jfield +asm-constants+ "ATHROW"))
(defconstant constants.arraylength (jfield +asm-constants+ "ARRAYLENGTH"))
(defconstant constants.anewarray (jfield +asm-constants+ "ANEWARRAY"))
(defconstant constants.newarray (jfield +asm-constants+ "NEWARRAY"))
(defconstant constants.new (jfield +asm-constants+ "NEW"))
(defconstant constants.invokeinterface (jfield +asm-constants+ "INVOKEINTERFACE"))
(defconstant constants.invokestatic (jfield +asm-constants+ "INVOKESTATIC"))
(defconstant constants.invokespecial (jfield +asm-constants+ "INVOKESPECIAL"))
(defconstant constants.invokevirtual (jfield +asm-constants+ "INVOKEVIRTUAL"))
(defconstant constants.putfield (jfield +asm-constants+ "PUTFIELD"))
(defconstant constants.getfield (jfield +asm-constants+ "GETFIELD"))
(defconstant constants.putstatic (jfield +asm-constants+ "PUTSTATIC"))
(defconstant constants.getstatic (jfield +asm-constants+ "GETSTATIC"))
(defconstant constants.return (jfield +asm-constants+ "RETURN"))
(defconstant constants.areturn (jfield +asm-constants+ "ARETURN"))
(defconstant constants.dreturn (jfield +asm-constants+ "DRETURN"))
(defconstant constants.freturn (jfield +asm-constants+ "FRETURN"))
(defconstant constants.lreturn (jfield +asm-constants+ "LRETURN"))
(defconstant constants.ireturn (jfield +asm-constants+ "IRETURN"))
(defconstant constants.lookupswitch (jfield +asm-constants+ "LOOKUPSWITCH"))
(defconstant constants.tableswitch (jfield +asm-constants+ "TABLESWITCH"))
(defconstant constants.ret (jfield +asm-constants+ "RET"))
(defconstant constants.jsr (jfield +asm-constants+ "JSR"))
(defconstant constants.goto (jfield +asm-constants+ "GOTO"))
(defconstant constants.if-acmpne (jfield +asm-constants+ "IF_ACMPNE"))
(defconstant constants.if-acmpeq (jfield +asm-constants+ "IF_ACMPEQ"))
(defconstant constants.if-icmple (jfield +asm-constants+ "IF_ICMPLE"))
(defconstant constants.if-icmpgt (jfield +asm-constants+ "IF_ICMPGT"))
(defconstant constants.if-icmpge (jfield +asm-constants+ "IF_ICMPGE"))
(defconstant constants.if-icmplt (jfield +asm-constants+ "IF_ICMPLT"))
(defconstant constants.if-icmpne (jfield +asm-constants+ "IF_ICMPNE"))
(defconstant constants.if-icmpeq (jfield +asm-constants+ "IF_ICMPEQ"))
(defconstant constants.ifle (jfield +asm-constants+ "IFLE"))
(defconstant constants.ifgt (jfield +asm-constants+ "IFGT"))
(defconstant constants.ifge (jfield +asm-constants+ "IFGE"))
(defconstant constants.iflt (jfield +asm-constants+ "IFLT"))
(defconstant constants.ifne (jfield +asm-constants+ "IFNE"))
(defconstant constants.ifeq (jfield +asm-constants+ "IFEQ"))
(defconstant constants.dcmpg (jfield +asm-constants+ "DCMPG"))
(defconstant constants.dcmpl (jfield +asm-constants+ "DCMPL"))
(defconstant constants.fcmpg (jfield +asm-constants+ "FCMPG"))
(defconstant constants.fcmpl (jfield +asm-constants+ "FCMPL"))
(defconstant constants.lcmp (jfield +asm-constants+ "LCMP"))
(defconstant constants.i2s (jfield +asm-constants+ "I2S"))
(defconstant constants.i2c (jfield +asm-constants+ "I2C"))
(defconstant constants.i2b (jfield +asm-constants+ "I2B"))
(defconstant constants.d2f (jfield +asm-constants+ "D2F"))
(defconstant constants.d2l (jfield +asm-constants+ "D2L"))
(defconstant constants.d2i (jfield +asm-constants+ "D2I"))
(defconstant constants.f2d (jfield +asm-constants+ "F2D"))
(defconstant constants.f2l (jfield +asm-constants+ "F2L"))
(defconstant constants.f2i (jfield +asm-constants+ "F2I"))
(defconstant constants.l2d (jfield +asm-constants+ "L2D"))
(defconstant constants.l2f (jfield +asm-constants+ "L2F"))
(defconstant constants.l2i (jfield +asm-constants+ "L2I"))
(defconstant constants.i2d (jfield +asm-constants+ "I2D"))
(defconstant constants.i2f (jfield +asm-constants+ "I2F"))
(defconstant constants.i2l (jfield +asm-constants+ "I2L"))
(defconstant constants.iinc (jfield +asm-constants+ "IINC"))
(defconstant constants.lxor (jfield +asm-constants+ "LXOR"))
(defconstant constants.ixor (jfield +asm-constants+ "IXOR"))
(defconstant constants.lor (jfield +asm-constants+ "LOR"))
(defconstant constants.ior (jfield +asm-constants+ "IOR"))
(defconstant constants.land (jfield +asm-constants+ "LAND"))
(defconstant constants.iand (jfield +asm-constants+ "IAND"))
(defconstant constants.lushr (jfield +asm-constants+ "LUSHR"))
(defconstant constants.iushr (jfield +asm-constants+ "IUSHR"))
(defconstant constants.lshr (jfield +asm-constants+ "LSHR"))
(defconstant constants.ishr (jfield +asm-constants+ "ISHR"))
(defconstant constants.lshl (jfield +asm-constants+ "LSHL"))
(defconstant constants.ishl (jfield +asm-constants+ "ISHL"))
(defconstant constants.dneg (jfield +asm-constants+ "DNEG"))
(defconstant constants.fneg (jfield +asm-constants+ "FNEG"))
(defconstant constants.lneg (jfield +asm-constants+ "LNEG"))
(defconstant constants.ineg (jfield +asm-constants+ "INEG"))
(defconstant constants.drem (jfield +asm-constants+ "DREM"))
(defconstant constants.frem (jfield +asm-constants+ "FREM"))
(defconstant constants.lrem (jfield +asm-constants+ "LREM"))
(defconstant constants.irem (jfield +asm-constants+ "IREM"))
(defconstant constants.ddiv (jfield +asm-constants+ "DDIV"))
(defconstant constants.fdiv (jfield +asm-constants+ "FDIV"))
(defconstant constants.ldiv (jfield +asm-constants+ "LDIV"))
(defconstant constants.idiv (jfield +asm-constants+ "IDIV"))
(defconstant constants.dmul (jfield +asm-constants+ "DMUL"))
(defconstant constants.fmul (jfield +asm-constants+ "FMUL"))
(defconstant constants.lmul (jfield +asm-constants+ "LMUL"))
(defconstant constants.imul (jfield +asm-constants+ "IMUL"))
(defconstant constants.dsub (jfield +asm-constants+ "DSUB"))
(defconstant constants.fsub (jfield +asm-constants+ "FSUB"))
(defconstant constants.lsub (jfield +asm-constants+ "LSUB"))
(defconstant constants.isub (jfield +asm-constants+ "ISUB"))
(defconstant constants.dadd (jfield +asm-constants+ "DADD"))
(defconstant constants.fadd (jfield +asm-constants+ "FADD"))
(defconstant constants.ladd (jfield +asm-constants+ "LADD"))
(defconstant constants.iadd (jfield +asm-constants+ "IADD"))
(defconstant constants.swap (jfield +asm-constants+ "SWAP"))
(defconstant constants.dup2_x2 (jfield +asm-constants+ "DUP2_X2"))
(defconstant constants.dup2_x1 (jfield +asm-constants+ "DUP2_X1"))
(defconstant constants.dup2 (jfield +asm-constants+ "DUP2"))
(defconstant constants.dup_x2 (jfield +asm-constants+ "DUP_X2"))
(defconstant constants.dup_x1 (jfield +asm-constants+ "DUP_X1"))
(defconstant constants.dup (jfield +asm-constants+ "DUP"))
(defconstant constants.pop2 (jfield +asm-constants+ "POP2"))
(defconstant constants.pop (jfield +asm-constants+ "POP"))
(defconstant constants.sastore (jfield +asm-constants+ "SASTORE"))
(defconstant constants.castore (jfield +asm-constants+ "CASTORE"))
(defconstant constants.bastore (jfield +asm-constants+ "BASTORE"))
(defconstant constants.aastore (jfield +asm-constants+ "AASTORE"))
(defconstant constants.dastore (jfield +asm-constants+ "DASTORE"))
(defconstant constants.fastore (jfield +asm-constants+ "FASTORE"))
(defconstant constants.lastore (jfield +asm-constants+ "LASTORE"))
(defconstant constants.iastore (jfield +asm-constants+ "IASTORE"))
(defconstant constants.astore (jfield +asm-constants+ "ASTORE"))
(defconstant constants.dstore (jfield +asm-constants+ "DSTORE"))
(defconstant constants.fstore (jfield +asm-constants+ "FSTORE"))
(defconstant constants.lstore (jfield +asm-constants+ "LSTORE"))
(defconstant constants.istore (jfield +asm-constants+ "ISTORE"))
(defconstant constants.saload (jfield +asm-constants+ "SALOAD"))
(defconstant constants.caload (jfield +asm-constants+ "CALOAD"))
(defconstant constants.baload (jfield +asm-constants+ "BALOAD"))
(defconstant constants.aaload (jfield +asm-constants+ "AALOAD"))
(defconstant constants.daload (jfield +asm-constants+ "DALOAD"))
(defconstant constants.faload (jfield +asm-constants+ "FALOAD"))
(defconstant constants.laload (jfield +asm-constants+ "LALOAD"))
(defconstant constants.iaload (jfield +asm-constants+ "IALOAD"))
(defconstant constants.aload (jfield +asm-constants+ "ALOAD"))
(defconstant constants.dload (jfield +asm-constants+ "DLOAD"))
(defconstant constants.fload (jfield +asm-constants+ "FLOAD"))
(defconstant constants.lload (jfield +asm-constants+ "LLOAD"))
(defconstant constants.iload (jfield +asm-constants+ "ILOAD"))
(defconstant constants.ldc (jfield +asm-constants+ "LDC"))
(defconstant constants.sipush (jfield +asm-constants+ "SIPUSH"))
(defconstant constants.bipush (jfield +asm-constants+ "BIPUSH"))
(defconstant constants.dconst_1 (jfield +asm-constants+ "DCONST_1"))
(defconstant constants.dconst_0 (jfield +asm-constants+ "DCONST_0"))
(defconstant constants.fconst_2 (jfield +asm-constants+ "FCONST_2"))
(defconstant constants.fconst_1 (jfield +asm-constants+ "FCONST_1"))
(defconstant constants.fconst_0 (jfield +asm-constants+ "FCONST_0"))
(defconstant constants.lconst_1 (jfield +asm-constants+ "LCONST_1"))
(defconstant constants.lconst_0 (jfield +asm-constants+ "LCONST_0"))
(defconstant constants.iconst_5 (jfield +asm-constants+ "ICONST_5"))
(defconstant constants.iconst_4 (jfield +asm-constants+ "ICONST_4"))
(defconstant constants.iconst_3 (jfield +asm-constants+ "ICONST_3"))
(defconstant constants.iconst_2 (jfield +asm-constants+ "ICONST_2"))
(defconstant constants.iconst_1 (jfield +asm-constants+ "ICONST_1"))
(defconstant constants.iconst_0 (jfield +asm-constants+ "ICONST_0"))
(defconstant constants.iconst_m1 (jfield +asm-constants+ "ICONST_M1"))
(defconstant constants.aconst-null (jfield +asm-constants+ "ACONST_NULL"))
(defconstant constants.nop (jfield +asm-constants+ "NOP"))
(defconstant constants.t-long (jfield +asm-constants+ "T_LONG"))
(defconstant constants.t-int (jfield +asm-constants+ "T_INT"))
(defconstant constants.t-short (jfield +asm-constants+ "T_SHORT"))
(defconstant constants.t-byte (jfield +asm-constants+ "T_BYTE"))
(defconstant constants.t-double (jfield +asm-constants+ "T_DOUBLE"))
(defconstant constants.t-float (jfield +asm-constants+ "T_FLOAT"))
(defconstant constants.t-char (jfield +asm-constants+ "T_CHAR"))
(defconstant constants.t-boolean (jfield +asm-constants+ "T_BOOLEAN"))
(defconstant constants.acc-deprecated (jfield +asm-constants+ "ACC_DEPRECATED"))
(defconstant constants.acc-synthetic (jfield +asm-constants+ "ACC_SYNTHETIC"))
(defconstant constants.acc-super (jfield +asm-constants+ "ACC_SUPER"))
(defconstant constants.acc-strict (jfield +asm-constants+ "ACC_STRICT"))
(defconstant constants.acc-abstract (jfield +asm-constants+ "ACC_ABSTRACT"))
(defconstant constants.acc-interface (jfield +asm-constants+ "ACC_INTERFACE"))
(defconstant constants.acc-enum (jfield +asm-constants+ "ACC_ENUM"))
(defconstant constants.acc-native (jfield +asm-constants+ "ACC_NATIVE"))
(defconstant constants.acc-transient (jfield +asm-constants+ "ACC_TRANSIENT"))
(defconstant constants.acc-varargs (jfield +asm-constants+ "ACC_VARARGS"))
(defconstant constants.acc-bridge (jfield +asm-constants+ "ACC_BRIDGE"))
(defconstant constants.acc-volatile (jfield +asm-constants+ "ACC_VOLATILE"))
(defconstant constants.acc-synchronized (jfield +asm-constants+ "ACC_SYNCHRONIZED"))
(defconstant constants.acc-final (jfield +asm-constants+ "ACC_FINAL"))
(defconstant constants.acc-static (jfield +asm-constants+ "ACC_STATIC"))
(defconstant constants.acc-protected (jfield +asm-constants+ "ACC_PROTECTED"))
(defconstant constants.acc-private (jfield +asm-constants+ "ACC_PRIVATE"))
(defconstant constants.acc-public (jfield +asm-constants+ "ACC_PUBLIC"))
(defconstant constants.v1-1 (jfield +asm-constants+ "V1_1"))
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
    (list "B" (list "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/Fixnum" "java/lang/Byte" "byteValue")
          constants.iload constants.ireturn constants.iconst_0)
    (acons 
     "short"
     (list "S" (list "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/Fixnum" "java/lang/Short" "shortValue")
           constants.iload constants.ireturn constants.iconst_0)
     (acons 
      "int"
      (list "I" (list "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/Fixnum" "java/lang/Integer" "intValue")
            constants.iload constants.ireturn constants.iconst_0)
      (acons 
       "long"
       (list "J" (list "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/Fixnum" "java/lang/Long" "longValue")
             constants.lload constants.lreturn constants.lconst_0)
       (acons 
        "float"
        (list "F" (list "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/SingleFloat" "java/lang/Float" "floatValue")
              constants.fload constants.freturn constants.fconst_0)
        (acons 
         "double"
         (list "D" (list "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/DoubleFloat" "java/lang/Double" "doubleValue")
               constants.dload constants.dreturn constants.dconst_0)
         (acons 
          "char"
          (list "C" (list "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispCharacter" "java/lang/Character" "charValue")
                constants.iload constants.ireturn constants.iconst_0)
          (acons 
           "boolean"
           (list "Z" (list "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject" "" "")
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
    (if name (caaddr name) "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject")))

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
                         "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/RuntimeClass"
                         "getRuntimeClass"
                         "(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/RuntimeClass;")
    (visit-field-insn-4 cv constants.putstatic
                        class-type-name "rc" "Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/RuntimeClass;")
    (visit-field-insn-4 cv constants.getstatic
                        class-type-name "rc" "Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/RuntimeClass;")
    (visit-ldc-insn-1 cv (make-java-string unique-method-name))
    (visit-method-insn-4 cv constants.invokevirtual
                         "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/RuntimeClass"
                         "getLispMethod"
                         "(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/Function;")
    (visit-var-insn-2 cv constants.astore (1+ args-size))
    (visit-field-insn-4 cv constants.getstatic
                        "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/Lisp" "NIL" "Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject;")
    (visit-var-insn-2 cv constants.astore (+ 2 args-size))


    (let ((l0 (make-label-0))(l1 (make-label-0))(l2 (make-label-0))(l3 (make-label-0)))
      (visit-label-1 cv l0)

      (visit-var-insn-2 cv constants.aload index)
      (visit-var-insn-2 cv constants.aload 0) ; (visit-var-insn-2 cv constants.aload 0)
      (visit-method-insn-4 cv constants.invokestatic
                           "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/RuntimeClass" "makeLispObject"
                           (format nil "(~a)~a"
                                   (arg-type-for-make-lisp-object "java.lang.Object")
                                   (decorate-type-name (return-type-for-make-lisp-object "java.lang.Object"))))
      (visit-method-insn-4 cv constants.invokevirtual
                           "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject"
                           "push"
                           "(Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject;")
      (visit-var-insn-2 cv constants.astore (+ 2 args-size))

      (loop for arg-type in (reverse arg-types) and j = args-size then (- j (size arg-type))
        do
        (visit-var-insn-2 cv constants.aload index)

        (visit-var-insn-2 cv (load-instruction arg-type) j)
        (visit-method-insn-4 cv constants.invokestatic
                             "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/RuntimeClass" "makeLispObject"
                             (format nil "(~a)~a"
                                     (arg-type-for-make-lisp-object arg-type)
                                     (decorate-type-name (return-type-for-make-lisp-object arg-type))))
        (visit-method-insn-4 cv constants.invokevirtual
                           "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject"
                           "push"
                           "(Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject;") ;uj
        (visit-var-insn-2 cv constants.astore (+ 2 args-size)))
      
      
      (visit-var-insn-2 cv constants.aload (1- index))
      (visit-var-insn-2 cv constants.aload index)

      (visit-type-insn-2 cv constants.new "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/Environment")
      (visit-insn-1 cv constants.dup)
      (visit-method-insn-4 cv constants.invokespecial "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/Environment" "<init>" "()V")
      (visit-method-insn-4 cv constants.invokestatic 
                           "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispThread"
                           "currentThread"
                           "()Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispThread;")
      (visit-method-insn-4 cv constants.invokestatic 
                           "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/RuntimeClass"
                           "evalC"
                           "(Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject;Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject;Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/Environment;Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject;")
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
                             "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject"
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
                             "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/LispObject" "javaInstance" "()Ljava/lang/Object;")
        (visit-type-insn-2 cv constants.checkcast (cast-type result-type))))


      (visit-label-1 cv l1)
      (if (string= "void" result-type)
          (visit-jump-insn-2 cv constants.goto l3)
          (visit-insn-1 cv (return-instruction result-type)))
      (visit-label-1 cv l2)
      (visit-var-insn-2 cv constants.astore (1+ index))
      (visit-var-insn-2 cv constants.aload (1+ index))
      (visit-method-insn-4 cv constants.invokevirtual
                           "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/ConditionThrowable" "printStackTrace" "()V")

      (if (string= "void" result-type)
          (progn (visit-insn-1 cv (return-instruction result-type))(visit-label-1 cv l3) )
          (visit-insn-1 cv (error-constant result-type)))

      (visit-insn-1 cv (return-instruction result-type))
      (visit-try-catch-block-4 cv l0 l1 l2 "com/cyc/tool/subl/jrtl/nativeCode/commonLisp/ConditionThrowable")

      (visit-maxs-2 cv 0 0))))



(defun jnew-runtime-class (class-name super-name interfaces constructors methods fields &optional filename)
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
                   "rc" "Lcom/cyc/tool/subl/jrtl/nativeCode/commonLisp/RuntimeClass;")

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

(defun jredefine-method (class-name method-name arg-types method-def)
  "Replace the definition of the method named METHDO-NAME (or
   constructor, if METHD-NAME is nil) of argument types ARG-TYPES of the
   class named CLASS-NAME defined with JNEW-RUNTIME-CLASS with
   METHOD-DEF. See the documentation of JNEW-RUNTIME-CLASS."
  (assert (jruntime-class-exists-p class-name) (class-name)
          "Can't redefine methods of undefined runtime class ~a" class-name)
  (let ((unique-method-name 
         (apply #'concatenate 'string (if method-name method-name "<init>") "|" arg-types)))
    (java::%jredefine-method class-name unique-method-name  (compile nil method-def))))

(defun jruntime-class-exists-p (class-name)
  "Returns true if a class named CLASS-NAME has been created and loaded by JNEW-RUNTIME-CLASS.
   Needed because Java classes cannot be reloaded."
  (when
    (jstatic (jmethod "com.cyc.tool.subl.jrtl.nativeCode.commonLisp.RuntimeClass" "getRuntimeClass" "java.lang.String")
             "com.cyc.tool.subl.jrtl.nativeCode.commonLisp.RuntimeClass"
             class-name)
    t))

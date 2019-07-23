/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.lang.reflect.InvocationTargetException;

import org.armedbear.lisp.JavaObject;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

abstract public class SubLAlienObject extends FromSubLisp implements SubLObject {

	//public final Object obj;
    //protected final Class<?> intendedClass;

    /**
     * Constructs a Java Object with the given intended class, used to access
     * the object reflectively. If the class represents a primitive type,
     * the corresponding wrapper type is used instead.
     * @throws ClassCastException if the object is not an instance of the
     *                            intended class.
     */
//    public SubLAlienObject(Object objIn, Class<?> intendedClassIn) {
//        if(objIn != null && intendedClassIn == null) {
//            intendedClassIn = objIn.getClass();
//        }
//        if(intendedClassIn != null) {
//            intendedClassIn = Java.maybeBoxClass(intendedClassIn);
//            if(!intendedClassIn.isInstance(objIn)) {
//                if (intendedClassIn.equals(java.lang.Byte.class)
//                    && objIn instanceof java.lang.Number) {
//                    // Maps any number to two's complement 8bit byte representation
//                    // ??? Is this a reasonable thing?
//                	
//                    this.obj = ((java.lang.Number)objIn).byteValue();
//                    this.intendedClass = intendedClassIn;
//                    return;
//                }
//                throw new ClassCastException(objIn + " can not be cast to " + intendedClassIn);
//            }
//        }
//        this.obj = objIn;
//        this.intendedClass = intendedClassIn;
//    }
//
//	public SubLAlienObject(Object a) {
//		this.obj = a;
//        this.intendedClass =
//            obj != null ? Java.maybeBoxClass(obj.getClass()) : null;
//	}

	public String toString() {
		final Object alien = getAlien(); 
		if (alien instanceof CharSequence)
			return alien.toString();
		return super.printObject();		
	}
	@Override
	public String printObjectImpl() {
		final Object alien = getAlien(); 
		if (alien != null)
			return alien.toString();
		return super.printObject();
	}

	@Override
	public boolean equalp(SubLObject obj) {
		final Object alien = getAlien(); 
		return alien.equals(obj);
	}

	@Override
	public boolean lispEquals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
		SubLAlienObject typedobj = (SubLAlienObject) obj;
		final Object alien = getAlien(); 
		return typedobj.getAlien().equals(alien);
	}

	public Object getAlien() {
		return javaInstance();
	}
	
	@Override 
	abstract public Object javaInstance();
	
	@Override
	public SubLObject makeCopy() {
		try {
			final Object alien = getAlien(); 
			if (alien instanceof Cloneable)
			{
				final Class<? extends Object> alienClass = alien.getClass();
				final Object cloned = alienClass.getMethod("clone").invoke(alien);
				return JavaObject.createJavaObject(cloned);
			}
		} catch (NoSuchMethodException e) {
		} catch (IllegalAccessException e2) {
		} catch (InvocationTargetException ex) {
		}
		Errors.unimplementedMethod("SubLAlienObject Cloned Bad)");
		return null;
	}

	@Override
	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("SubLAlienObject.makeDeepCopy()");
		return null;
	}

	
	@Override
	public boolean isAlien() {
		return true;
	}

	public static String ALIENOBJECT_TYPE_NAME;
	static {
		SubLAlienObject.ALIENOBJECT_TYPE_NAME = "ALIENOBJECT";
	}

	@Override
	public boolean canFastHash() {
		return false;
	}

	@Override
	public Object clone() {
		return makeCopy();
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_alien$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTEEN_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return superHash();
		return 0;
	}

	@Override
	public boolean isAtom() {
		return false;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return false;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return false;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return false;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}


	@Override
	public String toTypeName() {
		return SubLAlienObject.ALIENOBJECT_TYPE_NAME;
	}
}

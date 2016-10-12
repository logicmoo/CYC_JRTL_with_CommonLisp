//
//
//

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.lang.reflect.InvocationTargetException;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLAlienObject extends AbstractSubLObject implements SubLObject, CommonSymbols {
	public static String ALIENOBJECT_TYPE_NAME;
	static {
		SubLAlienObject.ALIENOBJECT_TYPE_NAME = "ALIENOBJECT";
	}

	private Object alien;

	public SubLAlienObject(Object alien) {
		this.alien = alien;
	}

	public boolean canFastHash() {
		return false;
	}

	public Object clone() {
		return this.makeCopy();
	}

	public boolean equalp(SubLObject obj) {
		return this.alien.equals(obj);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
		SubLAlienObject typedobj = (SubLAlienObject) obj;
		return typedobj.getAlien().equals(this.alien);
	}

	public Object getAlien() {
		return this.alien;
	}

	public SubLSymbol getType() {
		return Types.$dtp_alien$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTEEN_INTEGER;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return this.superHash();
		return 0;
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isAtom() {
		return false;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public SubLObject makeCopy() {
		try {
			if (this.alien instanceof Cloneable)
				return new SubLAlienObject(
						this.alien.getClass().getMethod("clone", new Class[0]).invoke(this.alien, new Object[0]));
		} catch (NoSuchMethodException e) {
		} catch (IllegalAccessException e2) {
		} catch (InvocationTargetException ex) {
		}
		return null;
	}

	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("SubLAlienObject.makeDeepCopy()");
		return null;
	}

	public String toString() {
		if (this.alien != null)
			return this.alien.toString();
		return null;
	}

	public String toTypeName() {
		return SubLAlienObject.ALIENOBJECT_TYPE_NAME;
	}

	public String writeToString() {
		// TODO Auto-generated method stub
		return null;
	}
}

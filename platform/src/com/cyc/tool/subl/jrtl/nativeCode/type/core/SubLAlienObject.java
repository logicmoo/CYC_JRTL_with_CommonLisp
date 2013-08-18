// 
// 
// 

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import java.lang.reflect.InvocationTargetException;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;

public final class SubLAlienObject extends AbstractSubLObject implements SubLObject, CommonSymbols
{
    public static String ALIENOBJECT_TYPE_NAME;
    private Object alien;
    
    public SubLAlienObject(final Object alien) {
        this.alien = alien;
    }
    
    public Object getAlien() {
        return this.alien;
    }
    
    @Override
    public String toString() {
        if (this.alien != null) {
            return this.alien.toString();
        }
        return null;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final SubLAlienObject typedobj = (SubLAlienObject)obj;
        return typedobj.getAlien().equals(this.alien);
    }
    
    @Override
    public boolean equalp(final SubLObject obj) {
        return this.alien.equals(obj);
    }
    
    @Override
    public int hashCode(final int currentDepth) {
        if (currentDepth < 8) {
            return this.superHash();
        }
        return 0;
    }
    
    @Override
    public String toTypeName() {
        return SubLAlienObject.ALIENOBJECT_TYPE_NAME;
    }
    
    @Override
    public final Object clone() {
        return this.makeCopy();
    }
    
    @Override
    public final SubLObject makeCopy() {
        try {
            if (this.alien instanceof Cloneable) {
                return new SubLAlienObject(this.alien.getClass().getMethod("clone", (Class<?>[])new Class[0]).invoke(this.alien, new Object[0]));
            }
        }
        catch (NoSuchMethodException e) {}
        catch (IllegalAccessException e2) {}
        catch (InvocationTargetException ex) {}
        return null;
    }
    
    @Override
    public final SubLObject makeDeepCopy() {
        Errors.unimplementedMethod("SubLAlienObject.makeDeepCopy()");
        return null;
    }
    
    @Override
    public final boolean canFastHash() {
        return false;
    }
    
    @Override
    public final SubLSymbol getType() {
        return Types.$dtp_alien$;
    }
    
    @Override
    public final SubLFixnum getTypeCode() {
        return CommonSymbols.THIRTEEN_INTEGER;
    }
    
    @Override
    public final boolean isNil() {
        return false;
    }
    
    @Override
    public final boolean isBoolean() {
        return false;
    }
    
    @Override
    public final boolean isSymbol() {
        return false;
    }
    
    @Override
    public final boolean isKeyword() {
        return false;
    }
    
    @Override
    public final boolean isAtom() {
        return false;
    }
    
    @Override
    public final boolean isCons() {
        return false;
    }
    
    @Override
    public final boolean isList() {
        return false;
    }
    
    @Override
    public final boolean isSequence() {
        return false;
    }
    
    @Override
    public final boolean isNumber() {
        return false;
    }
    
    @Override
    public final boolean isFixnum() {
        return false;
    }
    
    @Override
    public final boolean isBignum() {
        return false;
    }
    
    @Override
    public final boolean isIntBignum() {
        return false;
    }
    
    @Override
    public final boolean isLongBignum() {
        return false;
    }
    
    @Override
    public final boolean isBigIntegerBignum() {
        return false;
    }
    
    @Override
    public final boolean isInteger() {
        return false;
    }
    
    @Override
    public final boolean isDouble() {
        return false;
    }
    
    @Override
    public final boolean isChar() {
        return false;
    }
    
    @Override
    public final boolean isString() {
        return false;
    }
    
    @Override
    public final boolean isVector() {
        return false;
    }
    
    @Override
    public final boolean isFunction() {
        return false;
    }
    
    @Override
    public final boolean isFunctionSpec() {
        return false;
    }
    
    @Override
    public final boolean isMacroOperator() {
        return false;
    }
    
    @Override
    public final boolean isHashtable() {
        return false;
    }
    
    @Override
    public final boolean isProcess() {
        return false;
    }
    
    @Override
    public final boolean isLock() {
        return false;
    }
    
    @Override
    public final boolean isReadWriteLock() {
        return false;
    }
    
    @Override
    public final boolean isStructure() {
        return false;
    }
    
    @Override
    public final boolean isStream() {
        return false;
    }
    
    @Override
    public final boolean isPackage() {
        return false;
    }
    
    @Override
    public final boolean isPackageIterator() {
        return false;
    }
    
    @Override
    public final boolean isError() {
        return false;
    }
    
    @Override
    public final boolean isGuid() {
        return false;
    }
    
    @Override
    public final boolean isSemaphore() {
        return false;
    }
    
    @Override
    public final boolean isEnvironment() {
        return false;
    }
    
    @Override
    public final boolean isHashtableIterator() {
        return false;
    }
    
    @Override
    public final boolean isRegexPattern() {
        return false;
    }
    
    @Override
    public final boolean isKeyhash() {
        return false;
    }
    
    @Override
    public final boolean isKeyhashIterator() {
        return false;
    }
    
    @Override
    public final boolean isAlien() {
        return false;
    }
    
    static {
        SubLAlienObject.ALIENOBJECT_TYPE_NAME = "ALIENOBJECT";
    }

	@Override
	public String writeToString() {
		// TODO Auto-generated method stub
		return null;
	}
}

/*
 * LispObject.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: LispObject.java,v 1.88 2004-05-23 15:22:42 piso Exp $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.armedbear.lisp;

public class LispObject extends Lisp
{
    public int getFunctionalType()
    {
        return 0;
    }

    public LispObject typeOf()
    {
        return T;
    }

    public LispClass classOf()
    {
        return BuiltInClass.CLASS_T;
    }

    public LispObject getDescription() throws ConditionThrowable
    {
        StringBuffer sb = new StringBuffer("An object of type ");
        sb.append(typeOf().writeToString());
        return new SimpleString(sb);
    }

    public LispObject getParts() throws ConditionThrowable
    {
        return NIL;
    }

    public boolean getBooleanValue()
    {
        return true;
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == T)
            return T;
        if (typeSpecifier == BuiltInClass.CLASS_T)
            return T;
        if (typeSpecifier == Symbol.ATOM)
            return T;
        return NIL;
    }

    public boolean constantp()
    {
        return true;
    }

    public LispObject CONSTANTP()
    {
        return constantp() ? T : NIL;
    }

    public LispObject ATOM()
    {
        return T;
    }

    public boolean atom()
    {
        return true;
    }

    public String getName()
    {
        return null;
    }

    public Object javaInstance() throws ConditionThrowable
    {
        return signal(new TypeError(this, "primitive type"));
    }

    public Object javaInstance(Class c) throws ConditionThrowable
    {
        return signal(new TypeError(this, "primitive type"));
    }

    public LispObject car() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.LIST));
    }

    public void setCar(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.CONS));
    }

    public LispObject cdr() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.LIST));
    }

    public void setCdr(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.CONS));
    }

    public LispObject cadr() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.LIST));
    }

    public LispObject cddr() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.LIST));
    }

    public LispObject push(LispObject obj) throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.LIST));
    }

    public LispObject EQ(LispObject obj)
    {
        return this == obj ? T : NIL;
    }

    public boolean eql(LispObject obj)
    {
        return this == obj;
    }

    public LispObject EQL(LispObject obj)
    {
        return eql(obj) ? T : NIL;
    }

    public boolean equal(LispObject obj) throws ConditionThrowable
    {
        return this == obj;
    }

    public boolean equalp(LispObject obj) throws ConditionThrowable
    {
        return this == obj;
    }

    public LispObject ABS() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.NUMBER));
    }

    public LispObject NUMERATOR() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.RATIONAL));
    }

    public LispObject DENOMINATOR() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.RATIONAL));
    }

    public LispObject EVENP() throws ConditionThrowable
    {
        return evenp() ? T : NIL;
    }

    public boolean evenp() throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.INTEGER));
        // Not reached.
        return false;
    }

    public LispObject ODDP() throws ConditionThrowable
    {
        return oddp() ? T : NIL;
    }

    public boolean oddp() throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.INTEGER));
        // Not reached.
        return false;
    }

    public LispObject PLUSP() throws ConditionThrowable
    {
        return plusp() ? T : NIL;
    }

    public boolean plusp() throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.REAL));
        // Not reached.
        return false;
    }

    public LispObject MINUSP() throws ConditionThrowable
    {
        return minusp() ? T : NIL;
    }

    public boolean minusp() throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.REAL));
        // Not reached.
        return false;
    }

    public LispObject NUMBERP()
    {
        return NIL;
    }

    public boolean numberp()
    {
        return false;
    }

    public LispObject ZEROP() throws ConditionThrowable
    {
        return zerop() ? T : NIL;
    }

    public boolean zerop() throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.NUMBER));
        // Not reached.
        return false;
    }

    public LispObject BIT_VECTOR_P()
    {
        return NIL;
    }

    public LispObject COMPLEXP()
    {
        return NIL;
    }

    public LispObject FLOATP()
    {
        return NIL;
    }

    public boolean floatp()
    {
        return false;
    }

    public LispObject INTEGERP()
    {
        return integerp() ? T : NIL;
    }

    public boolean integerp()
    {
        return false;
    }

    public LispObject RATIONALP()
    {
        return rationalp() ? T : NIL;
    }

    public boolean rationalp()
    {
        return false;
    }

    public LispObject REALP()
    {
        return realp() ? T : NIL;
    }

    public boolean realp()
    {
        return false;
    }

    public LispObject STRINGP()
    {
        return NIL;
    }

    public boolean stringp()
    {
        return false;
    }

    public LispObject SIMPLE_STRING_P()
    {
        return NIL;
    }

    public LispObject VECTORP()
    {
        return NIL;
    }

    public boolean vectorp()
    {
        return false;
    }

    public LispObject CHARACTERP()
    {
        return NIL;
    }

    public boolean characterp()
    {
        return false;
    }

    public int length() throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.SEQUENCE));
        // Not reached.
        return 0;
    }

    public final LispObject LENGTH() throws ConditionThrowable
    {
        return new Fixnum(length());
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.SEQUENCE));
    }

    public LispObject nreverse() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.SEQUENCE));
    }

    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.ARRAY));
    }

    public LispObject[] copyToArray() throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.LIST));
        // Not reached.
        return null;
    }

    public LispObject SYMBOLP()
    {
        return NIL;
    }

    public boolean listp()
    {
        return false;
    }

    public LispObject LISTP()
    {
        return NIL;
    }

    public boolean endp() throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.LIST));
        // Not reached.
        return false;
    }

    public LispObject ENDP() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.LIST));
    }

    public LispObject NOT()
    {
        return NIL;
    }

    public boolean isSpecialVariable()
    {
        return false;
    }

    public LispObject getSymbolValue() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.SYMBOL));
    }

    public LispObject getSymbolFunction() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.SYMBOL));
    }

    public LispObject getSymbolFunctionOrDie() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.SYMBOL));
    }

    public String writeToString() throws ConditionThrowable
    {
        return toString();
    }

    public String unreadableString(String s)
    {
        StringBuffer sb = new StringBuffer("#<");
        sb.append(s);
        sb.append(" @ #x");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(">");
        return sb.toString();
    }

    // Special operator
    public LispObject execute(LispObject args, Environment env)
        throws ConditionThrowable
    {
        return signal(new LispError());
    }

    // Primitive
    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.FUNCTION));
    }

    // Primitive0
    public LispObject execute() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.FUNCTION));
    }

    // Primitive1
    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.FUNCTION));
    }

    // Primitive2
    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.FUNCTION));
    }

    // Primitive3
    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.FUNCTION));
    }

    // Primitive4
    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth)
        throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.FUNCTION));
    }

    public LispObject incr() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.NUMBER));
    }

    public LispObject decr() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.NUMBER));
    }

    public LispObject add(LispObject obj) throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.NUMBER));
    }

    public LispObject subtract(LispObject obj) throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.NUMBER));
    }

    public LispObject multiplyBy(LispObject obj) throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.NUMBER));
    }

    public LispObject divideBy(LispObject obj) throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.NUMBER));
    }

    public boolean isEqualTo(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.NUMBER));
        // Not reached.
        return false;
    }

    public LispObject IS_E(LispObject obj) throws ConditionThrowable
    {
        return isEqualTo(obj) ? T : NIL;
    }

    public boolean isNotEqualTo(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.NUMBER));
        // Not reached.
        return false;
    }

    public LispObject IS_NE(LispObject obj) throws ConditionThrowable
    {
        return isNotEqualTo(obj) ? T : NIL;
    }

    public boolean isLessThan(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.NUMBER));
        // Not reached.
        return false;
    }

    public LispObject IS_LT(LispObject obj) throws ConditionThrowable
    {
        return isLessThan(obj) ? T : NIL;
    }

    public boolean isGreaterThan(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.NUMBER));
        // Not reached.
        return false;
    }

    public LispObject IS_GT(LispObject obj) throws ConditionThrowable
    {
        return isGreaterThan(obj) ? T : NIL;
    }

    public boolean isLessThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.NUMBER));
        // Not reached.
        return false;
    }

    public LispObject IS_LE(LispObject obj) throws ConditionThrowable
    {
        return isLessThanOrEqualTo(obj) ? T : NIL;
    }

    public boolean isGreaterThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.NUMBER));
        // Not reached.
        return false;
    }

    public LispObject IS_GE(LispObject obj) throws ConditionThrowable
    {
        return isGreaterThanOrEqualTo(obj) ? T : NIL;
    }

    public LispObject truncate(LispObject obj) throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.REAL));
    }

    public LispObject MOD(LispObject divisor) throws ConditionThrowable
    {
        truncate(divisor);
        final LispThread thread = LispThread.currentThread();
        LispObject remainder = thread._values[1];
        thread.clearValues();
        if (!remainder.zerop()) {
            if (divisor.minusp()) {
                if (plusp())
                    return remainder.add(divisor);
            } else {
                if (minusp())
                    return remainder.add(divisor);
            }
        }
        return remainder;
    }

    public LispObject ash(LispObject obj) throws ConditionThrowable
    {
        return signal(new TypeError(obj, Symbol.INTEGER));
    }

    public Fixnum sxhash() throws ConditionThrowable
    {
        return new Fixnum(hashCode() & 0x7ffffff);
    }

    public char[] chars() throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.STRING));
        // Not reached.
        return null;
    }

    public String getStringValue() throws ConditionThrowable
    {
        signal(new TypeError(this, Symbol.STRING));
        // Not reached.
        return null;
    }

    // Profiling.
    public int getCallCount()
    {
        return 0;
    }

    public void setCallCount(int n)
    {
    }

    public void incrementCallCount()
    {
    }
}

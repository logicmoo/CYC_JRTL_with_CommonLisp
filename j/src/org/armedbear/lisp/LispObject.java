/*
 * LispObject.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: LispObject.java,v 1.66 2003-12-12 19:41:06 piso Exp $
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

    public LispObject CONSTANTP()
    {
        return T;
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

    public LispObject car() throws ConditionThrowable
    {
        return signal(new TypeError(this, "list"));
    }

    public void setCar(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, "cons"));
    }

    public LispObject cdr() throws ConditionThrowable
    {
        return signal(new TypeError(this, "list"));
    }

    public void setCdr(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, "cons"));
    }

    public LispObject cadr() throws ConditionThrowable
    {
        return signal(new TypeError(this, "list"));
    }

    public LispObject cddr() throws ConditionThrowable
    {
        return signal(new TypeError(this, "list"));
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
        return signal(new TypeError(this, "number"));
    }

    public LispObject NUMERATOR() throws ConditionThrowable
    {
        return signal(new TypeError(this, "rational number"));
    }

    public LispObject DENOMINATOR() throws ConditionThrowable
    {
        return signal(new TypeError(this, "rational number"));
    }

    public LispObject EVENP() throws ConditionThrowable
    {
        return evenp() ? T : NIL;
    }

    public boolean evenp() throws ConditionThrowable
    {
        signal(new TypeError(this, "integer"));
        // Not reached.
        return false;
    }

    public LispObject ODDP() throws ConditionThrowable
    {
        return oddp() ? T : NIL;
    }

    public boolean oddp() throws ConditionThrowable
    {
        signal(new TypeError(this, "integer"));
        // Not reached.
        return false;
    }

    public LispObject PLUSP() throws ConditionThrowable
    {
        return plusp() ? T : NIL;
    }

    public boolean plusp() throws ConditionThrowable
    {
        signal(new TypeError(this, "real number"));
        // Not reached.
        return false;
    }

    public LispObject MINUSP() throws ConditionThrowable
    {
        return minusp() ? T : NIL;
    }

    public boolean minusp() throws ConditionThrowable
    {
        signal(new TypeError(this, "real number"));
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
        signal(new TypeError(this, "number"));
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

    public LispObject SIMPLE_STRING_P()
    {
        return NIL;
    }

    public LispObject VECTORP()
    {
        return vectorp() ? T : NIL;
    }

    public boolean vectorp()
    {
        return false;
    }

    public int length() throws ConditionThrowable
    {
        signal(new TypeError(this, "sequence"));
        // Not reached.
        return 0;
    }

    public final LispObject LENGTH() throws ConditionThrowable
    {
        return new Fixnum(length());
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        return signal(new TypeError(this, "sequence"));
    }

    public LispObject nreverse() throws ConditionThrowable
    {
        return signal(new TypeError(this, "sequence"));
    }

    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        return signal(new TypeError(this, "array"));
    }

    public LispObject[] copyToArray() throws ConditionThrowable
    {
        signal(new TypeError(this, "list"));
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

    public LispObject ENDP() throws ConditionThrowable
    {
        return signal(new TypeError(this, "list"));
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
        return signal(new TypeError(this, "symbol"));
    }

    public LispObject getSymbolFunction() throws ConditionThrowable
    {
        return signal(new TypeError(this, "symbol"));
    }

    public LispObject getSymbolFunctionOrDie() throws ConditionThrowable
    {
        return signal(new TypeError(this, "symbol"));
    }

    public String toString()
    {
        return super.toString();
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
        return signal(new LispError());
    }

    // Primitive0
    public LispObject execute() throws ConditionThrowable
    {
        return signal(new LispError());
    }

    // Primitive1
    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        return signal(new LispError());
    }

    // Primitive2
    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        return signal(new LispError());
    }

    // Primitive3
    public LispObject execute(LispObject first, LispObject second,
        LispObject third) throws ConditionThrowable
    {
        return signal(new LispError());
    }

    public LispObject incr() throws ConditionThrowable
    {
        return signal(new TypeError(this, "number"));
    }

    public LispObject decr() throws ConditionThrowable
    {
        return signal(new TypeError(this, "number"));
    }

    public LispObject add(LispObject obj) throws ConditionThrowable
    {
        return signal(new TypeError(this, "number"));
    }

    public LispObject subtract(LispObject obj) throws ConditionThrowable
    {
        return signal(new TypeError(this, "number"));
    }

    public LispObject multiplyBy(LispObject obj) throws ConditionThrowable
    {
        return signal(new TypeError(this, "number"));
    }

    public LispObject divideBy(LispObject obj) throws ConditionThrowable
    {
        return signal(new TypeError(this, "number"));
    }

    public boolean isEqualTo(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, "number"));
        // Not reached.
        return false;
    }

    public LispObject IS_E(LispObject obj) throws ConditionThrowable
    {
        return isEqualTo(obj) ? T : NIL;
    }

    public boolean isNotEqualTo(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, "number"));
        // Not reached.
        return false;
    }

    public LispObject IS_NE(LispObject obj) throws ConditionThrowable
    {
        return isNotEqualTo(obj) ? T : NIL;
    }

    public boolean isLessThan(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, "number"));
        // Not reached.
        return false;
    }

    public LispObject IS_LT(LispObject obj) throws ConditionThrowable
    {
        return isLessThan(obj) ? T : NIL;
    }

    public boolean isGreaterThan(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, "number"));
        // Not reached.
        return false;
    }

    public LispObject IS_GT(LispObject obj) throws ConditionThrowable
    {
        return isGreaterThan(obj) ? T : NIL;
    }

    public boolean isLessThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, "number"));
        // Not reached.
        return false;
    }

    public LispObject IS_LE(LispObject obj) throws ConditionThrowable
    {
        return isLessThanOrEqualTo(obj) ? T : NIL;
    }

    public boolean isGreaterThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(this, "number"));
        // Not reached.
        return false;
    }

    public LispObject IS_GE(LispObject obj) throws ConditionThrowable
    {
        return isGreaterThanOrEqualTo(obj) ? T : NIL;
    }

    public LispObject truncate(LispObject obj) throws ConditionThrowable
    {
        return signal(new TypeError(this, "real number"));
    }

    public Fixnum sxhash()
    {
        return new Fixnum(hashCode() & 0x7ffffff);
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

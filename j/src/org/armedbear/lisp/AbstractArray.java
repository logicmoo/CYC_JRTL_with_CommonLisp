/*
 * AbstractArray.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: AbstractArray.java,v 1.36 2005-02-28 02:50:02 piso Exp $
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

public abstract class AbstractArray extends LispObject
{
    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.ARRAY)
            return T;
        if (type == BuiltInClass.ARRAY)
            return T;
        return super.typep(type);
    }

    public boolean equalp(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof AbstractArray) {
            AbstractArray a = (AbstractArray) obj;
            if (getRank() != a.getRank())
                return false;
            for (int i = getRank(); i-- > 0;) {
                if (getDimension(i) != a.getDimension(i))
                    return false;
            }
            for (int i = getTotalSize(); i--> 0;) {
                if (!getRowMajor(i).equalp(a.getRowMajor(i)))
                    return false;
            }
            return true;
        }
        return false;
    }

    public boolean isDisplaced()
    {
        return false;
    }

    public LispObject arrayDisplacement() throws ConditionThrowable
    {
        return LispThread.currentThread().setValues(NIL, Fixnum.ZERO);
    }

    public boolean hasFillPointer()
    {
        return false;
    }

    public int getFillPointer() throws ConditionThrowable
    {
        noFillPointer();
        return -1; // Not reached.
    }


    public final LispObject noFillPointer() throws ConditionThrowable
    {
        return signal(new TypeError("Array does not have a fill pointer."));
    }

    public boolean isAdjustable()
    {
        return true;
    }

    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        StringBuffer sb = new StringBuffer("AREF: ");
        sb.append("wrong number of subscripts (1) for array of rank ");
        sb.append(getRank());
        sb.append(".");
        return signal(new ProgramError(sb.toString()));
    }

    public abstract int getRank();

    public abstract LispObject getDimensions();

    public abstract int getDimension(int n) throws ConditionThrowable;

    public abstract LispObject getElementType();

    public abstract int getTotalSize();

    public abstract LispObject getRowMajor(int index) throws ConditionThrowable;

    public abstract void setRowMajor(int index, LispObject newValue) throws ConditionThrowable;

    // FIXME Detect overflow!
    protected static final int computeTotalSize(int[] dimensions)
    {
        int size = 1;
        for (int i = dimensions.length; i-- > 0;)
            size *= dimensions[i];
        return size;
    }

    public int getRowMajorIndex(LispObject[] subscripts)
        throws ConditionThrowable
    {
        int[] subs = new int[subscripts.length];
        for (int i = 0; i < subscripts.length; i++) {
            LispObject subscript = subscripts[i];
            if (subscript instanceof Fixnum)
                subs[i] = ((Fixnum)subscript).value;
            else
                signal(new TypeError(subscript, Symbol.FIXNUM));
        }
        return getRowMajorIndex(subs);
    }

    public int getRowMajorIndex(int[] subscripts) throws ConditionThrowable
    {
        final int rank = getRank();
        if (rank != subscripts.length) {
            StringBuffer sb = new StringBuffer("Wrong number of subscripts (");
            sb.append(subscripts.length);
            sb.append(") for array of rank ");
            sb.append(rank);
            sb.append('.');
            signal(new ProgramError(sb.toString()));
        }
        int sum = 0;
        int size = 1;
        for (int i = rank; i-- > 0;) {
            int dim = getDimension(i);
            int lastSize = size;
            size *= dim;
            int n = subscripts[i];
            if (n < 0 || n >= getDimension(i)) {
                StringBuffer sb = new StringBuffer("Invalid index ");
                sb.append(n);
                sb.append(" for array ");
                sb.append(this);
                sb.append('.');
                signal(new ProgramError(sb.toString()));
            }
            sum += n * lastSize;
        }
        return sum;
    }

    public LispObject get(int[] subscripts) throws ConditionThrowable
    {
        return getRowMajor(getRowMajorIndex(subscripts));
    }

    public void set(int[] subscripts, LispObject newValue)
        throws ConditionThrowable
    {
        setRowMajor(getRowMajorIndex(subscripts), newValue);
    }

    public abstract void fill(LispObject obj) throws ConditionThrowable;

    public String writeToString(int[] dimv) throws ConditionThrowable
    {
        StringBuffer sb = new StringBuffer();
        LispThread thread = LispThread.currentThread();
        LispObject printReadably = _PRINT_READABLY_.symbolValue(thread);
        if (printReadably != NIL || _PRINT_ARRAY_.symbolValue(thread) != NIL) {
            int maxLevel = Integer.MAX_VALUE;
            if (printReadably != NIL) {
                for (int i = 0; i < dimv.length - 1; i++) {
                    if (dimv[i] == 0) {
                        for (int j = i + 1; j < dimv.length; j++) {
                            if (dimv[j] != 0) {
                                signal(new PrintNotReadable(list2(Keyword.OBJECT,
                                                                  this)));
                                return null; // Not reached.
                            }
                        }
                    }
                }
            } else {
                LispObject printLevel = _PRINT_LEVEL_.symbolValue(thread);
                if (printLevel instanceof Fixnum)
                    maxLevel = ((Fixnum)printLevel).value;
            }
            LispObject currentPrintLevel =
                _CURRENT_PRINT_LEVEL_.symbolValue(thread);
            int currentLevel = Fixnum.getValue(currentPrintLevel);
            if (currentLevel >= maxLevel)
                return "#";
            sb.append('#');
            sb.append(dimv.length);
            sb.append('A');
            appendContents(dimv, 0, sb, thread);
            return sb.toString();
        }
        sb.append('(');
        if (this instanceof SimpleArray)
            sb.append("SIMPLE-");
        sb.append("ARRAY T (");
        for (int i = 0; i < dimv.length; i++) {
            sb.append(dimv[i]);
            if (i < dimv.length - 1)
                sb.append(' ');
        }
        sb.append("))");
        return unreadableString(sb.toString());
    }

    // Helper for writeToString().
    private void appendContents(int[] dimensions, int index, StringBuffer sb,
                                LispThread thread)
        throws ConditionThrowable
    {
        if (dimensions.length == 0) {
            if (_PRINT_CIRCLE_.symbolValue(thread) != NIL) {
                StringOutputStream stream = new StringOutputStream();
                thread.execute(Symbol.OUTPUT_OBJECT.getSymbolFunction(),
                               getRowMajor(index), stream);
                sb.append(stream.getString().getStringValue());
            } else
                sb.append(getRowMajor(index).writeToString());
        } else {
            final LispObject printReadably =
                _PRINT_READABLY_.symbolValue(thread);
            int maxLength = Integer.MAX_VALUE;
            int maxLevel = Integer.MAX_VALUE;
            if (printReadably == NIL) {
                final LispObject printLength =
                    _PRINT_LENGTH_.symbolValue(thread);
                if (printLength instanceof Fixnum)
                    maxLength = ((Fixnum)printLength).value;
                final LispObject printLevel =
                    _PRINT_LEVEL_.symbolValue(thread);
                if (printLevel instanceof Fixnum)
                    maxLevel = ((Fixnum)printLevel).value;
            }
            LispObject currentPrintLevel =
                _CURRENT_PRINT_LEVEL_.symbolValue(thread);
            int currentLevel = Fixnum.getValue(currentPrintLevel);
            if (currentLevel < maxLevel) {
                SpecialBinding lastSpecialBinding = thread.lastSpecialBinding;
                thread.bindSpecial(_CURRENT_PRINT_LEVEL_, currentPrintLevel.incr());
                try {
                    sb.append('(');
                    int[] dims = new int[dimensions.length - 1];
                    for (int i = 1; i < dimensions.length; i++)
                        dims[i-1] = dimensions[i];
                    int count = 1;
                    for (int i = 0; i < dims.length; i++)
                        count *= dims[i];
                    final int length = dimensions[0];
                    final int limit = Math.min(length, maxLength);
                    for (int i = 0; i < limit; i++) {
                        appendContents(dims, index, sb, thread);
                        if (i < limit - 1 || limit < length)
                            sb.append(' ');
                        index += count;
                    }
                    if (limit < length)
                        sb.append("...");
                    sb.append(')');
                }
                finally {
                    thread.lastSpecialBinding = lastSpecialBinding;
                }
            } else
                sb.append('#');
        }
    }
}

/*
 * BuiltInClass.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: BuiltInClass.java,v 1.5 2003-09-21 15:05:51 piso Exp $
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

public class BuiltInClass extends LispClass
{
    private BuiltInClass(Symbol symbol)
    {
        super(symbol);
    }

    public LispObject typeOf()
    {
        return Symbol.BUILT_IN_CLASS;
    }

    public LispClass classOf()
    {
        return BuiltInClass.BUILT_IN_CLASS;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.BUILT_IN_CLASS)
            return T;
        if (type == BuiltInClass.BUILT_IN_CLASS)
            return T;
        return super.typep(type);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<BUILT-IN-CLASS ");
        sb.append(symbol.getName());
        sb.append('>');
        return sb.toString();
    }

    private static BuiltInClass addClass(Symbol symbol)
    {
        BuiltInClass c = new BuiltInClass(symbol);
        addClass(symbol, c);
        return c;
    }

    public static final BuiltInClass CLASS_T            = addClass(T);

    public static final BuiltInClass ARITHMETIC_ERROR   = addClass(Symbol.ARITHMETIC_ERROR);
    public static final BuiltInClass ARRAY              = addClass(Symbol.ARRAY);
    public static final BuiltInClass BIGNUM             = addClass(Symbol.BIGNUM);
    public static final BuiltInClass BIT_VECTOR         = addClass(Symbol.BIT_VECTOR);
    public static final BuiltInClass BUILT_IN_CLASS     = addClass(Symbol.BUILT_IN_CLASS);
    public static final BuiltInClass CELL_ERROR         = addClass(Symbol.CELL_ERROR);
    public static final BuiltInClass CHARACTER          = addClass(Symbol.CHARACTER);
    public static final BuiltInClass CLASS              = addClass(Symbol.CLASS);
    public static final BuiltInClass COMPLEX            = addClass(Symbol.COMPLEX);
    public static final BuiltInClass CONDITION          = addClass(Symbol.CONDITION);
    public static final BuiltInClass CONS               = addClass(Symbol.CONS);
    public static final BuiltInClass CONTROL_ERROR      = addClass(Symbol.CONTROL_ERROR);
    public static final BuiltInClass ERROR              = addClass(Symbol.ERROR);
    public static final BuiltInClass FIXNUM             = addClass(Symbol.FIXNUM);
    public static final BuiltInClass FLOAT              = addClass(Symbol.FLOAT);
    public static final BuiltInClass FUNCTION           = addClass(Symbol.FUNCTION);
    public static final BuiltInClass HASH_TABLE         = addClass(Symbol.HASH_TABLE);
    public static final BuiltInClass INTEGER            = addClass(Symbol.INTEGER);
    public static final BuiltInClass LIST               = addClass(Symbol.LIST);
    public static final BuiltInClass NULL               = addClass(Symbol.NULL);
    public static final BuiltInClass NUMBER             = addClass(Symbol.NUMBER);
    public static final BuiltInClass PACKAGE            = addClass(Symbol.PACKAGE);
    public static final BuiltInClass PACKAGE_ERROR      = addClass(Symbol.PACKAGE_ERROR);
    public static final BuiltInClass PARSE_ERROR        = addClass(Symbol.PARSE_ERROR);
    public static final BuiltInClass PATHNAME           = addClass(Symbol.PATHNAME);
    public static final BuiltInClass PROGRAM_ERROR      = addClass(Symbol.PROGRAM_ERROR);
    public static final BuiltInClass RANDOM_STATE       = addClass(Symbol.RANDOM_STATE);
    public static final BuiltInClass RATIO              = addClass(Symbol.RATIO);
    public static final BuiltInClass RATIONAL           = addClass(Symbol.RATIONAL);
    public static final BuiltInClass REAL               = addClass(Symbol.REAL);
    public static final BuiltInClass SEQUENCE           = addClass(Symbol.SEQUENCE);
    public static final BuiltInClass SERIOUS_CONDITION  = addClass(Symbol.SERIOUS_CONDITION);
    public static final BuiltInClass SIMPLE_CONDITION   = addClass(Symbol.SIMPLE_CONDITION);
    public static final BuiltInClass SIMPLE_ERROR       = addClass(Symbol.SIMPLE_ERROR);
    public static final BuiltInClass STANDARD_CLASS     = addClass(Symbol.STANDARD_CLASS);
    public static final BuiltInClass STANDARD_OBJECT    = addClass(Symbol.STANDARD_OBJECT);
    public static final BuiltInClass STREAM             = addClass(Symbol.STREAM);
    public static final BuiltInClass STREAM_ERROR       = addClass(Symbol.STREAM_ERROR);
    public static final BuiltInClass STRING             = addClass(Symbol.STRING);
    public static final BuiltInClass STRING_STREAM      = addClass(Symbol.STRING_STREAM);
    public static final BuiltInClass STRUCTURE_CLASS    = addClass(Symbol.STRUCTURE_CLASS);
    public static final BuiltInClass STRUCTURE_OBJECT   = addClass(Symbol.STRUCTURE_OBJECT);
    public static final BuiltInClass SYMBOL             = addClass(Symbol.SYMBOL);
    public static final BuiltInClass TWO_WAY_STREAM     = addClass(Symbol.TWO_WAY_STREAM);
    public static final BuiltInClass TYPE_ERROR         = addClass(Symbol.TYPE_ERROR);
    public static final BuiltInClass UNBOUND_SLOT       = addClass(Symbol.UNBOUND_SLOT);
    public static final BuiltInClass UNBOUND_VARIABLE   = addClass(Symbol.UNBOUND_VARIABLE);
    public static final BuiltInClass UNDEFINED_FUNCTION = addClass(Symbol.UNDEFINED_FUNCTION);
    public static final BuiltInClass VECTOR             = addClass(Symbol.VECTOR);

    static {
        ARITHMETIC_ERROR.setDirectSuperclass(ERROR);
        ARRAY.setDirectSuperclass(CLASS_T);
        BIGNUM.setDirectSuperclass(INTEGER);
        BIT_VECTOR.setDirectSuperclass(VECTOR);
        BUILT_IN_CLASS.setDirectSuperclass(CLASS);
        CELL_ERROR.setDirectSuperclass(ERROR);
        CHARACTER.setDirectSuperclass(CLASS_T);
        CLASS.setDirectSuperclass(CLASS_T);
        COMPLEX.setDirectSuperclass(NUMBER);
        CONDITION.setDirectSuperclass(STANDARD_OBJECT);
        CONS.setDirectSuperclass(LIST);
        CONTROL_ERROR.setDirectSuperclass(ERROR);
        ERROR.setDirectSuperclass(SERIOUS_CONDITION);
        FIXNUM.setDirectSuperclass(INTEGER);
        FLOAT.setDirectSuperclass(REAL);
        FUNCTION.setDirectSuperclass(CLASS_T);
        HASH_TABLE.setDirectSuperclass(CLASS_T);
        INTEGER.setDirectSuperclass(RATIONAL);
        LIST.setDirectSuperclass(SEQUENCE);
        NULL.setDirectSuperclass(LIST);
        NUMBER.setDirectSuperclass(CLASS_T);
        PACKAGE.setDirectSuperclass(CLASS_T);
        PACKAGE_ERROR.setDirectSuperclass(ERROR);
        PARSE_ERROR.setDirectSuperclass(ERROR);
        PATHNAME.setDirectSuperclass(CLASS_T);
        PROGRAM_ERROR.setDirectSuperclass(ERROR);
        RANDOM_STATE.setDirectSuperclass(CLASS_T);
        RATIO.setDirectSuperclass(RATIONAL);
        RATIONAL.setDirectSuperclass(REAL);
        REAL.setDirectSuperclass(NUMBER);
        SEQUENCE.setDirectSuperclass(CLASS_T);
        SERIOUS_CONDITION.setDirectSuperclass(CONDITION);
        SIMPLE_CONDITION.setDirectSuperclass(CONDITION);
        SIMPLE_ERROR.setDirectSuperclass(ERROR);
        STANDARD_CLASS.setDirectSuperclass(CLASS);
        STANDARD_OBJECT.setDirectSuperclass(CLASS_T);
        STREAM.setDirectSuperclass(CLASS_T);
        STREAM_ERROR.setDirectSuperclass(ERROR);
        STRING.setDirectSuperclass(VECTOR);
        STRING_STREAM.setDirectSuperclass(STREAM);
        STRUCTURE_CLASS.setDirectSuperclass(CLASS);
        STRUCTURE_OBJECT.setDirectSuperclass(CLASS_T);
        SYMBOL.setDirectSuperclass(CLASS_T);
        TWO_WAY_STREAM.setDirectSuperclass(STREAM);
        TYPE_ERROR.setDirectSuperclass(ERROR);
        UNBOUND_SLOT.setDirectSuperclass(CELL_ERROR);
        UNBOUND_VARIABLE.setDirectSuperclass(CELL_ERROR);
        UNDEFINED_FUNCTION.setDirectSuperclass(CELL_ERROR);
        VECTOR.setDirectSuperclasses(list2(ARRAY, SEQUENCE));
    }
}

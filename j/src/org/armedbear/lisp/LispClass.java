/*
 * LispClass.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: LispClass.java,v 1.64 2005-11-07 21:46:56 piso Exp $
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

public abstract class LispClass extends StandardObject
{
    private static final EqHashTable map = new EqHashTable(256, NIL, NIL);

    public static void addClass(Symbol symbol, LispClass c)
    {
        synchronized (map) {
            map.put(symbol, c);
        }
    }

    public static LispClass findClass(Symbol symbol)
    {
        synchronized (map) {
            return (LispClass) map.get(symbol);
        }
    }

    public static void removeClass(Symbol symbol)
    {
        synchronized (map) {
            map.remove(symbol);
        }
    }

    protected Symbol symbol;
    private LispObject propertyList;
    private Layout classLayout;
    private LispObject directSuperclasses = NIL;
    private LispObject directSubclasses = NIL;
    public LispObject classPrecedenceList = NIL; // FIXME! Should be private!
    public LispObject directMethods = NIL; // FIXME! Should be private!
    public LispObject documentation = NIL; // FIXME! Should be private!
    private boolean finalized;

    protected LispClass()
    {
    }

    protected LispClass(Symbol symbol)
    {
        this.symbol = symbol;
        this.directSuperclasses = NIL;
    }

    protected LispClass(Symbol symbol, LispObject directSuperclasses)
    {
        this.symbol = symbol;
        this.directSuperclasses = directSuperclasses;
    }

    public LispObject getParts() throws ConditionThrowable
    {
        LispObject result = NIL;
        result = result.push(new Cons("NAME", symbol != null ? symbol : NIL));
        result = result.push(new Cons("LAYOUT", classLayout != null ? classLayout : NIL));
        result = result.push(new Cons("DIRECT-SUPERCLASSES", directSuperclasses));
        result = result.push(new Cons("DIRECT-SUBCLASSES", directSubclasses));
        result = result.push(new Cons("CLASS-PRECEDENCE-LIST", classPrecedenceList));
        result = result.push(new Cons("DIRECT-METHODS", directMethods));
        result = result.push(new Cons("DOCUMENTATION", documentation));
        return result.nreverse();
    }

    public final Symbol getSymbol()
    {
        return symbol;
    }

    public final LispObject getPropertyList()
    {
        if (propertyList == null)
            propertyList = NIL;
        return propertyList;
    }

    public final void setPropertyList(LispObject obj)
    {
        if (obj == null)
            throw new NullPointerException();
        propertyList = obj;
    }

    public final Layout getClassLayout()
    {
        return classLayout;
    }

    public final void setClassLayout(Layout layout)
    {
        classLayout = layout;
    }

    public final int getLayoutLength()
    {
        if (layout == null)
            return 0;
        return layout.getLength();
    }

    public LispObject getSlots()
    {
        return NIL;
    }

    public final LispObject getDirectSuperclasses()
    {
        return directSuperclasses;
    }

    public final void setDirectSuperclasses(LispObject directSuperclasses)
    {
        this.directSuperclasses = directSuperclasses;
    }

    public final boolean isFinalized()
    {
        return finalized;
    }

    public final void setFinalized(boolean b)
    {
        finalized = b;
    }

    // When there's only one direct superclass...
    public final void setDirectSuperclass(LispObject superclass)
    {
        directSuperclasses = new Cons(superclass);
    }

    public final LispObject getDirectSubclasses()
    {
        return directSubclasses;
    }

    public final void setDirectSubclasses(LispObject directSubclasses)
    {
        this.directSubclasses = directSubclasses;
    }

    public final LispObject getCPL()
    {
        return classPrecedenceList;
    }

    public final void setCPL(LispObject obj1)
    {
        if (obj1 instanceof Cons)
            classPrecedenceList = obj1;
        else {
            Debug.assertTrue(obj1 == this);
            classPrecedenceList = new Cons(obj1);
        }
    }

    public final void setCPL(LispObject obj1, LispObject obj2)
    {
        Debug.assertTrue(obj1 == this);
        classPrecedenceList = list2(obj1, obj2);
    }

    public final void setCPL(LispObject obj1, LispObject obj2, LispObject obj3)
    {
        Debug.assertTrue(obj1 == this);
        classPrecedenceList = list3(obj1, obj2, obj3);
    }

    public final void setCPL(LispObject obj1, LispObject obj2, LispObject obj3,
                             LispObject obj4)
    {
        Debug.assertTrue(obj1 == this);
        classPrecedenceList = list4(obj1, obj2, obj3, obj4);
    }

    public final void setCPL(LispObject obj1, LispObject obj2, LispObject obj3,
                             LispObject obj4, LispObject obj5)
    {
        Debug.assertTrue(obj1 == this);
        classPrecedenceList = list5(obj1, obj2, obj3, obj4, obj5);
    }

    public final void setCPL(LispObject obj1, LispObject obj2, LispObject obj3,
                             LispObject obj4, LispObject obj5, LispObject obj6)
    {
        Debug.assertTrue(obj1 == this);
        classPrecedenceList = list6(obj1, obj2, obj3, obj4, obj5, obj6);
    }

    public final void setCPL(LispObject obj1, LispObject obj2, LispObject obj3,
                             LispObject obj4, LispObject obj5, LispObject obj6,
                             LispObject obj7)
    {
        Debug.assertTrue(obj1 == this);
        classPrecedenceList = list7(obj1, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public final void setCPL(LispObject obj1, LispObject obj2, LispObject obj3,
                             LispObject obj4, LispObject obj5, LispObject obj6,
                             LispObject obj7, LispObject obj8)
    {
        Debug.assertTrue(obj1 == this);
        classPrecedenceList =
            list8(obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public final void setCPL(LispObject obj1, LispObject obj2, LispObject obj3,
                             LispObject obj4, LispObject obj5, LispObject obj6,
                             LispObject obj7, LispObject obj8, LispObject obj9)
    {
        Debug.assertTrue(obj1 == this);
        classPrecedenceList =
            list9(obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public String getName()
    {
        return symbol.getName();
    }

    public LispObject typeOf()
    {
        return Symbol.CLASS;
    }

    public LispObject classOf()
    {
        return StandardClass.CLASS;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.CLASS)
            return T;
        if (type == StandardClass.CLASS)
            return T;
        return super.typep(type);
    }

    // ### subclassp
    private static final Primitive SUBCLASSP =
        new Primitive("subclassp", PACKAGE_SYS, true, "class")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            final LispClass c;
            try {
                c = (LispClass) first;
            }
            catch (ClassCastException e) {
                return signalTypeError(first, Symbol.CLASS);
            }
            LispObject cpl = c.getCPL();
            while (cpl != NIL) {
                if (cpl.car() == second)
                    return T;
                cpl = cpl.cdr();
            }
            return NIL;
        }
    };
}

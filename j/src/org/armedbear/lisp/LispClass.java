/*
 * LispClass.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: LispClass.java,v 1.46 2004-05-23 15:20:31 piso Exp $
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

import java.util.HashMap;

public class LispClass extends StandardObject
{
    private static final HashMap map = new HashMap();

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

    protected Symbol symbol;
    private Layout layout;
    private LispObject directSuperclasses = NIL;
    private LispObject directSubclasses = NIL;
    private LispObject classPrecedenceList = NIL;
    private LispObject directMethods = NIL;
    private LispObject documentation = NIL;

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
        result = result.push(new Cons("NAME", symbol));
        result = result.push(new Cons("LAYOUT", layout));
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

    public final Layout getLayout()
    {
        return layout;
    }

    public final void setLayout(Layout layout)
    {
        this.layout = layout;
    }

    public LispObject getEffectiveSlots()
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

    public String getName()
    {
        return symbol.getName();
    }

    public LispObject typeOf()
    {
        return Symbol.CLASS;
    }

    public LispClass classOf()
    {
        return BuiltInClass.CLASS;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.CLASS)
            return T;
        if (type == BuiltInClass.CLASS)
            return T;
        return super.typep(type);
    }

    // ### find-class
    // find-class symbol &optional errorp environment => class
    private static final Primitive FIND_CLASS =
        new Primitive("find-class", "symbol &optional errorp environment")
    {
        public LispObject execute(LispObject symbol) throws ConditionThrowable
        {
            LispObject c = findClass(checkSymbol(symbol));
            if (c == null) {
                StringBuffer sb = new StringBuffer("There is no class named ");
                sb.append(symbol.writeToString());
                sb.append('.');
                return signal(new LispError(sb.toString()));
            }
            return c;
        }
        public LispObject execute(LispObject symbol, LispObject errorp)
            throws ConditionThrowable
        {
            LispObject c = findClass(checkSymbol(symbol));
            if (c == null) {
                if (errorp != NIL) {
                    StringBuffer sb = new StringBuffer("There is no class named ");
                    sb.append(symbol.writeToString());
                    sb.append('.');
                    return signal(new LispError(sb.toString()));
                }
                return NIL;
            }
            return c;
        }
        public LispObject execute(LispObject symbol, LispObject errorp,
                                  LispObject environment)
            throws ConditionThrowable
        {
            // FIXME Ignore environment.
            return execute(symbol, errorp);
        }
    };

    // ### %set-find-class
    private static final Primitive2 _SET_FIND_CLASS =
        new Primitive2("%set-find-class", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Symbol symbol = checkSymbol(first);
            if (second instanceof LispClass) {
                addClass(symbol, (LispClass) second);
                return second;
            }
            if (second == NIL) {
                map.remove(symbol);
                return second;
            }
            return signal(new TypeError(second, "class"));
        }
    };

    // ### %class-name
    private static final Primitive1 _CLASS_NAME =
        new Primitive1("%class-name", PACKAGE_SYS, false, "class")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((LispClass)arg).symbol;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, "class"));
            }
        }
    };

    // ### %set-class-name
    private static final Primitive2 _SET_CLASS_NAME =
        new Primitive2("%set-class-name", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((LispClass)first).symbol = checkSymbol(second);
                return second;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(first, "class"));
            }
        }
    };

    // ### class-layout
    private static final Primitive1 CLASS_LAYOUT =
        new Primitive1("class-layout", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                Layout layout = ((LispClass)arg).getLayout();
                return layout != null ? layout : NIL;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, "class"));
            }
        }
    };

    // ### %set-class-layout
    private static final Primitive2 _SET_CLASS_LAYOUT =
        new Primitive2("%set-class-layout", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                ((LispClass)first).setLayout((Layout)second);
                return second;
            }
            catch (ClassCastException e) {
                if (!(first instanceof LispClass))
                    return signal(new TypeError(first, "class"));
                if (!(second instanceof Layout))
                    return signal(new TypeError(second, "layout"));
                // Not reached.
                return NIL;
            }
        }
    };

    // ### class-direct-superclasses
    private static final Primitive1 CLASS_DIRECT_SUPERCLASSES =
        new Primitive1("class-direct-superclasses", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispClass)
                return ((LispClass)arg).getDirectSuperclasses();
            return signal(new TypeError(arg, "class"));
        }
    };

    // ### %set-class-direct-superclasses
    private static final Primitive2 _SET_CLASS_DIRECT_SUPERCLASSES =
        new Primitive2("%set-class-direct-superclasses", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof LispClass) {
                ((LispClass)first).setDirectSuperclasses(second);
                return second;
            }
            return signal(new TypeError(first, "class"));
        }
    };

    // ### class-direct-subclasses
    private static final Primitive1 CLASS_DIRECT_SUBCLASSES =
        new Primitive1("class-direct-subclasses", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispClass)
                return ((LispClass)arg).getDirectSubclasses();
            return signal(new TypeError(arg, "class"));
        }
    };

    // ### %set-class-direct-subclasses
    private static final Primitive2 _SET_CLASS_DIRECT_SUBCLASSES =
        new Primitive2("%set-class-direct-subclasses", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof LispClass) {
                ((LispClass)first).setDirectSubclasses(second);
                return second;
            }
            return signal(new TypeError(first, "class"));
        }
    };

    // ### class-precedence-list
    private static final Primitive1 CLASS_PRECEDENCE_LIST =
        new Primitive1("class-precedence-list", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispClass)
                return ((LispClass)arg).getCPL();
            return signal(new TypeError(arg, "class"));
        }
    };

    // ### %set-class-precedence-list
    private static final Primitive1 _SET_CLASS_PRECEDENCE_LIST =
        new Primitive1("%set-class-precedence-list", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof LispClass) {
                ((LispClass)first).classPrecedenceList = second;
                return second;
            }
            return signal(new TypeError(first, "class"));
        }
    };

    // ### class-direct-methods
    private static final Primitive1 CLASS_DIRECT_METHODS =
        new Primitive1("class-direct-methods", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof LispClass)
                return ((LispClass)arg).directMethods;
            return signal(new TypeError(arg, "class"));
        }
    };

    // ### %set-class-direct-methods
    private static final Primitive2 _SET_CLASS_DIRECT_METHODS =
        new Primitive2("%set-class-direct-methods", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof LispClass) {
                ((LispClass)first).directMethods = second;
                return second;
            }
            return signal(new TypeError(first, "class"));
        }
    };

    // ### class-documentation
    private static final Primitive1 CLASS_DOCUMENTATION =
        new Primitive1("class-documentation", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg)
            throws ConditionThrowable
        {
            if (arg instanceof LispClass)
                return ((LispClass)arg).documentation;
            return signal(new TypeError(arg, "class"));
        }
    };

    // ### %set-class-documentation
    private static final Primitive2 _SET_CLASS_DOCUMENTATION =
        new Primitive2("%set-class-documentation", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first instanceof LispClass) {
                ((LispClass)first).documentation = second;
                return second;
            }
            return signal(new TypeError(first, "class"));
        }
    };

    // ### classp
    private static final Primitive1 CLASSP =
        new Primitive1("classp", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg)
        {
            return arg instanceof LispClass ? T : NIL;
        }
    };
}

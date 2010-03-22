/*
 * SlotClass.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: SlotClass.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SlotClass extends LispClass
{
    private SubLObject directSlotDefinitions = NIL;
    private SubLObject slotDefinitions = NIL;
    private SubLObject directDefaultInitargs = NIL;
    private SubLObject defaultInitargs = NIL;

    public SlotClass(Layout layout)
    {
      super(layout);
    }

    public SlotClass(SubLSymbol symbol, SubLObject directSuperclasses)


    {
        this(null, symbol, directSuperclasses);
    }

    public SlotClass(Layout layout,
                     SubLSymbol symbol, SubLObject directSuperclasses)
    {
        super(layout, symbol, directSuperclasses);
    }

    @Override
    public SubLObject getParts()
    {
        SubLObject result = super.getParts().nreverse();
        result = result.push(makeCons("DIRECT-SLOTS",
                                      getDirectSlotDefinitions()));
        result = result.push(makeCons("SLOTS", getSlotDefinitions()));
        result = result.push(makeCons("DIRECT-DEFAULT-INITARGS",
                                      getDirectDefaultInitargs()));
        result = result.push(makeCons("DEFAULT-INITARGS",
                                      getDefaultInitargs()));
        return result.nreverse();
    }

    @Override
    public SubLObject typep(SubLObject type)
    {
        return super.typep(type);
    }

    public SubLObject getDirectSlotDefinitions()
    {
        return directSlotDefinitions;
    }

    public void setDirectSlotDefinitions(SubLObject directSlotDefinitions)
    {
        this.directSlotDefinitions = directSlotDefinitions;
    }

    public SubLObject getSlotDefinitions()
    {
        return slotDefinitions;
    }

    public void setSlotDefinitions(SubLObject slotDefinitions)
    {
        this.slotDefinitions = slotDefinitions;
    }

    public SubLObject getDirectDefaultInitargs()
    {
        return directDefaultInitargs;
    }

    public void setDirectDefaultInitargs(SubLObject directDefaultInitargs)
    {
        this.directDefaultInitargs = directDefaultInitargs;
    }

    public SubLObject getDefaultInitargs()
    {
        return defaultInitargs;
    }

    public void setDefaultInitargs(SubLObject defaultInitargs)
    {
        this.defaultInitargs = defaultInitargs;
    }

    SubLObject computeDefaultInitargs()
    {
        SubLObject result = NIL;
        SubLObject cpl = getCPL();
        while (cpl != NIL) {
            LispClass c = (LispClass) cpl.first();
            if (c instanceof StandardClass) {
                SubLObject obj = ((StandardClass)c).getDirectDefaultInitargs();
                if (obj != NIL)
                    result = LispSymbols.APPEND.execute(result, obj);
            }
            cpl = cpl.rest();
        }
        return result;
    }

    public void finalizeClass()
    {
        if (isFinalized())
            return;

        SubLObject defs = getSlotDefinitions();
        Debug.assertTrue(defs == NIL);
        SubLObject cpl = getCPL();
        Debug.assertTrue(cpl != null);
        Debug.assertTrue(cpl.isList());
        cpl = cpl.reverse();
        while (cpl != NIL) {
            SubLObject car = cpl.first();
            if (car instanceof StandardClass) {
                StandardClass cls = (StandardClass) car;
                SubLObject directDefs = cls.getDirectSlotDefinitions();
                Debug.assertTrue(directDefs != null);
                Debug.assertTrue(directDefs.isList());
                while (directDefs != NIL) {
                    defs = defs.push(directDefs.first());
                    directDefs = directDefs.rest();
                }
            }
            cpl = cpl.rest();
        }
        setSlotDefinitions(defs.nreverse());
        SubLObject[] instanceSlotNames = new SubLObject[defs.cl_length()];
        int i = 0;
        SubLObject tail = getSlotDefinitions();
        while (tail != NIL) {
            SlotDefinitionObject slotDefinition = (SlotDefinitionObject) tail.first();
            slotDefinition.setLocation(i);
            instanceSlotNames[i++] = slotDefinition.getSlotDefName();
            tail = tail.rest();
        }
        setClassLayout(new Layout(this, instanceSlotNames, NIL));
        setDefaultInitargs(computeDefaultInitargs());
        setFinalized(true);
    }

    // ### class-direct-slots
    private static final Primitive CLASS_DIRECT_SLOTS =
        new JavaPrimitive("class-direct-slots", PACKAGE_SYS, true)
    {
        @Override
        public SubLObject execute(SubLObject arg)

        {
            if (arg instanceof SlotClass)
                return ((SlotClass)arg).getDirectSlotDefinitions();
            if (arg instanceof BuiltInClass)
                return NIL;
            return type_error(arg, LispSymbols.STANDARD_CLASS);
        }
    };

    // ### %set-class-direct-slots
    private static final Primitive _SET_CLASS_DIRECT_SLOTS =
        new JavaPrimitive("%set-class-direct-slots", PACKAGE_SYS, true)
    {
        @Override
        public SubLObject execute(SubLObject first, SubLObject second)

        {
                if (first instanceof SlotClass) {
                  ((SlotClass)first).setDirectSlotDefinitions(second);
                return second;
            }
                else {
                return type_error(first, LispSymbols.STANDARD_CLASS);
            }
        }
    };

    // ### %class-slots
    private static final Primitive _CLASS_SLOTS =
        new JavaPrimitive(LispSymbols._CLASS_SLOTS, "class")
    {
        @Override
        public SubLObject execute(SubLObject arg)

        {
            if (arg instanceof SlotClass)
                return ((SlotClass)arg).getSlotDefinitions();
            if (arg instanceof BuiltInClass)
                return NIL;
            return type_error(arg, LispSymbols.STANDARD_CLASS);
        }
    };

    // ### set-class-slots
    private static final Primitive SET_CLASS_SLOTS =
        new JavaPrimitive(LispSymbols.SET_CLASS_SLOTS, "class slot-definitions")
    {
        @Override
        public SubLObject execute(SubLObject first, SubLObject second)

        {
            if (first instanceof SlotClass) {
              ((SlotClass)first).setSlotDefinitions(second);
              return second;
            }
            else {
              return type_error(first, LispSymbols.STANDARD_CLASS);
            }
        }
    };

    // ### class-direct-default-initargs
    private static final Primitive CLASS_DIRECT_DEFAULT_INITARGS =
        new JavaPrimitive("class-direct-default-initargs", PACKAGE_SYS, true)
    {
        @Override
        public SubLObject execute(SubLObject arg)

        {
            if (arg instanceof SlotClass)
                return ((SlotClass)arg).getDirectDefaultInitargs();
            if (arg instanceof BuiltInClass)
                return NIL;
            return type_error(arg, LispSymbols.STANDARD_CLASS);
        }
    };

    // ### %set-class-direct-default-initargs
    private static final Primitive _SET_CLASS_DIRECT_DEFAULT_INITARGS =
        new JavaPrimitive("%set-class-direct-default-initargs", PACKAGE_SYS, true)
    {
        @Override
        public SubLObject execute(SubLObject first, SubLObject second)

        {
            if (first instanceof SlotClass) {
              ((SlotClass)first).setDirectDefaultInitargs(second);
              return second;
            }
            return type_error(first, LispSymbols.STANDARD_CLASS);
        }
    };

    // ### class-default-initargs
    private static final Primitive CLASS_DEFAULT_INITARGS =
        new JavaPrimitive("class-default-initargs", PACKAGE_SYS, true)
    {
        @Override
        public SubLObject execute(SubLObject arg)

        {
            if (arg instanceof SlotClass)
                return ((SlotClass)arg).getDefaultInitargs();
            if (arg instanceof BuiltInClass)
                return NIL;
            return type_error(arg, LispSymbols.STANDARD_CLASS);
        }
    };

    // ### %set-class-default-initargs
    private static final Primitive _SET_CLASS_DEFAULT_INITARGS =
        new JavaPrimitive("%set-class-default-initargs", PACKAGE_SYS, true)
    {
        @Override
        public SubLObject execute(SubLObject first, SubLObject second)

        {
            if (first instanceof SlotClass) {
                ((SlotClass)first).setDefaultInitargs(second);
                return second;
            }
            return type_error(first, LispSymbols.STANDARD_CLASS);
        }
    };

    // ### compute-class-default-initargs
    private static final Primitive COMPUTE_CLASS_DEFAULT_INITARGS =
        new JavaPrimitive("compute-class-default-initargs", PACKAGE_SYS, true)
    {
        @Override
        public SubLObject execute(SubLObject arg)

        {
            final SlotClass c;
            if (arg instanceof SlotClass) {
                c = (SlotClass) arg;
            }
            else {
                return type_error(arg, LispSymbols.STANDARD_CLASS);
            }
            return c.computeDefaultInitargs();
        }
    };
}

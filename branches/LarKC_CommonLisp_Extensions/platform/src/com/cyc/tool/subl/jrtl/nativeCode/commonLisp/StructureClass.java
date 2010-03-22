/*
 * StructureClass.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: StructureClass.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

public class StructureClass extends SlotClass
{
    StructureClass(SubLSymbol symbol)
    {
        super(symbol, makeCons(BuiltInClass.STRUCTURE_OBJECT));
    }

    public StructureClass(SubLSymbol symbol, SubLObject directSuperclasses)
    {
        super(symbol, directSuperclasses);
    }

    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.STRUCTURE_CLASS;
    }

    @Override
    public SubLObject classOf()
    {
        return StandardClass.STRUCTURE_CLASS;
    }

    @Override
    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.STRUCTURE_CLASS)
            return T;
        if (type == StandardClass.STRUCTURE_CLASS)
            return T;
        return super.typep(type);
    }

    @Override
    public SubLObject getDescription()
    {
        return makeString(writeToString());
    }

    @Override
    public String writeToString()
    {
        StringBuffer sb = new StringBuffer("#<STRUCTURE-CLASS ");
        sb.append(getLispClassName().writeToString());
        sb.append('>');
        return sb.toString();
    }

    // ### make-structure-class name direct-slots slots include => class
    private static final Primitive MAKE_STRUCTURE_CLASS =
        new JavaPrimitive("make-structure-class", PACKAGE_SYS, false)
    {
        @Override
        public SubLObject execute(SubLObject first, SubLObject second,
                                  SubLObject third, SubLObject fourth)

        {
            SubLSymbol symbol = checkSymbol(first);
            LispClass existingClass = LispClass.findClass(symbol);

            if (existingClass instanceof StructureClass)
                // DEFSTRUCT-REDEFINITION write-up
                // states the effects from re-definition are undefined
                // we punt: our compiler bootstrapping depends on
                // the class not being redefined (remaining in the
                // same location in the class hierarchy)
                return existingClass;



            SubLObject directSlots = checkList(second);
            SubLObject slots = checkList(third);
            SubLSymbol include = checkSymbol(fourth);

            StructureClass c = new StructureClass(symbol);
            if (include != NIL) {
                LispClass includedClass = LispClass.findClass(include);
                if (includedClass == null)
                    return error(new SimpleError("Class " + include +
                                                  " is undefined."));
                c.setCPL(makeCons(c, includedClass.getCPL()));
            } else
                c.setCPL(c, BuiltInClass.STRUCTURE_OBJECT, BuiltInClass.CLASS_T);
            c.setDirectSlotDefinitions(directSlots);
            c.setSlotDefinitions(slots);
            addClass(symbol, c);
            return c;
        }
    };
}

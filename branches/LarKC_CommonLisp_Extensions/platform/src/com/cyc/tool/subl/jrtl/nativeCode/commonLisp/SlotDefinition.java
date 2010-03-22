/*
 * SlotDefinitionObject.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: SlotDefinition.java 12521 2010-03-10 22:09:13Z ehuelsmann $
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

public final class SlotDefinition
{
   
  public static SlotDefinitionObject checkSlotDefinition(SubLObject obj) {
          if (obj instanceof SlotDefinitionObject) return (SlotDefinitionObject)obj;
      return (SlotDefinitionObject)type_error(obj, LispSymbols.SLOT_DEFINITION);     
  }


  // ### make-slot-definition
  private static final Primitive MAKE_SLOT_DEFINITION =
    new JavaPrimitive("make-slot-definition", PACKAGE_SYS, true, "")
    {
      @Override
      public SubLObject execute()
      {
        return new SlotDefinitionObject();
      }
    };

  // ### %slot-definition-name
  private static final Primitive _SLOT_DEFINITION_NAME =
    new JavaPrimitive(LispSymbols._SLOT_DEFINITION_NAME, "slot-definition")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return checkSlotDefinition(arg).slots[SlotDefinitionClass.SLOT_INDEX_NAME];
      }
    };

  // ### set-slot-definition-name
  private static final Primitive SET_SLOT_DEFINITION_NAME =
    new JavaPrimitive("set-slot-definition-name", PACKAGE_SYS, true,
                  "slot-definition name")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          checkSlotDefinition(first).slots[SlotDefinitionClass.SLOT_INDEX_NAME] = second;
          return second;
      }
    };

  // ### %slot-definition-initfunction
  private static final Primitive _SLOT_DEFINITION_INITFUNCTION =
    new JavaPrimitive(LispSymbols._SLOT_DEFINITION_INITFUNCTION, "slot-definition")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return checkSlotDefinition(arg).slots[SlotDefinitionClass.SLOT_INDEX_INITFUNCTION];
      }
    };

  // ### set-slot-definition-initfunction
  private static final Primitive SET_SLOT_DEFINITION_INITFUNCTION =
    new JavaPrimitive("set-slot-definition-initfunction", PACKAGE_SYS, true,
                  "slot-definition initfunction")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          checkSlotDefinition(first).slots[SlotDefinitionClass.SLOT_INDEX_INITFUNCTION] = second;
          return second;
      }
    };

  // ### %slot-definition-initform
  private static final Primitive _SLOT_DEFINITION_INITFORM =
    new JavaPrimitive("%slot-definition-initform", PACKAGE_SYS, true,
                  "slot-definition")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return checkSlotDefinition(arg).slots[SlotDefinitionClass.SLOT_INDEX_INITFORM];
      }
    };

  // ### set-slot-definition-initform
  private static final Primitive SET_SLOT_DEFINITION_INITFORM =
    new JavaPrimitive("set-slot-definition-initform", PACKAGE_SYS, true,
                  "slot-definition initform")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          checkSlotDefinition(first).slots[SlotDefinitionClass.SLOT_INDEX_INITFORM] = second;
          return second;
      }
    };

  // ### %slot-definition-initargs
  private static final Primitive _SLOT_DEFINITION_INITARGS =
    new JavaPrimitive(LispSymbols._SLOT_DEFINITION_INITARGS, "slot-definition")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return checkSlotDefinition(arg).slots[SlotDefinitionClass.SLOT_INDEX_INITARGS];
      }
    };

  // ### set-slot-definition-initargs
  private static final Primitive SET_SLOT_DEFINITION_INITARGS =
    new JavaPrimitive("set-slot-definition-initargs", PACKAGE_SYS, true,
                  "slot-definition initargs")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          checkSlotDefinition(first).slots[SlotDefinitionClass.SLOT_INDEX_INITARGS] = second;
          return second;
      }
    };

  // ### %slot-definition-readers
  private static final Primitive _SLOT_DEFINITION_READERS =
    new JavaPrimitive("%slot-definition-readers", PACKAGE_SYS, true,
                  "slot-definition")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return checkSlotDefinition(arg).slots[SlotDefinitionClass.SLOT_INDEX_READERS];
      }
    };

  // ### set-slot-definition-readers
  private static final Primitive SET_SLOT_DEFINITION_READERS =
    new JavaPrimitive("set-slot-definition-readers", PACKAGE_SYS, true,
                  "slot-definition readers")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          checkSlotDefinition(first).slots[SlotDefinitionClass.SLOT_INDEX_READERS] = second;
          return second;
      }
    };

  // ### %slot-definition-writers
  private static final Primitive _SLOT_DEFINITION_WRITERS =
    new JavaPrimitive("%slot-definition-writers", PACKAGE_SYS, true,
                  "slot-definition")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return checkSlotDefinition(arg).slots[SlotDefinitionClass.SLOT_INDEX_WRITERS];
      }
    };

  // ### set-slot-definition-writers
  private static final Primitive SET_SLOT_DEFINITION_WRITERS =
    new JavaPrimitive("set-slot-definition-writers", PACKAGE_SYS, true,
                  "slot-definition writers")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          checkSlotDefinition(first).slots[SlotDefinitionClass.SLOT_INDEX_WRITERS] = second;
          return second;
      }
    };

  // ### %slot-definition-allocation
  private static final Primitive _SLOT_DEFINITION_ALLOCATION =
    new JavaPrimitive("%slot-definition-allocation", PACKAGE_SYS, true,
                  "slot-definition")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return checkSlotDefinition(arg).slots[SlotDefinitionClass.SLOT_INDEX_ALLOCATION];
      }
    };

  // ### set-slot-definition-allocation
  private static final Primitive SET_SLOT_DEFINITION_ALLOCATION =
    new JavaPrimitive("set-slot-definition-allocation", PACKAGE_SYS, true,
                  "slot-definition allocation")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          checkSlotDefinition(first).slots[SlotDefinitionClass.SLOT_INDEX_ALLOCATION] = second;
          return second;
      }
    };

  // ### %slot-definition-allocation-class
  private static final Primitive _SLOT_DEFINITION_ALLOCATION_CLASS =
    new JavaPrimitive("%slot-definition-allocation-class", PACKAGE_SYS, true,
                  "slot-definition")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return checkSlotDefinition(arg).slots[SlotDefinitionClass.SLOT_INDEX_ALLOCATION_CLASS];
      }
    };

  // ### set-slot-definition-allocation-class
  private static final Primitive SET_SLOT_DEFINITION_ALLOCATION_CLASS =
    new JavaPrimitive("set-slot-definition-allocation-class", PACKAGE_SYS, true,
                  "slot-definition allocation-class")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          checkSlotDefinition(first).slots[SlotDefinitionClass.SLOT_INDEX_ALLOCATION_CLASS] = second;
          return second;
      }
    };

  // ### %slot-definition-location
  private static final Primitive _SLOT_DEFINITION_LOCATION =
    new JavaPrimitive("%slot-definition-location", PACKAGE_SYS, true, "slot-definition")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return checkSlotDefinition(arg).slots[SlotDefinitionClass.SLOT_INDEX_LOCATION];
      }
    };

  // ### set-slot-definition-location
  private static final Primitive SET_SLOT_DEFINITION_LOCATION =
    new JavaPrimitive("set-slot-definition-location", PACKAGE_SYS, true, "slot-definition location")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          checkSlotDefinition(first).slots[SlotDefinitionClass.SLOT_INDEX_LOCATION] = second;
          return second;
      }
    };
}

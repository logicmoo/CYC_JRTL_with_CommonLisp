/*
 * Layout.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: Layout.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

public class Layout extends AbstractLispObject
{
  private final LispClass lispClass;
  public final EqHashTable slotTable;

  final SubLObject[] slotNames;
  final SubLObject sharedSlots;

  private boolean invalid;

  public Layout(LispClass lispClass, SubLObject instanceSlots, SubLObject sharedSlots)
  {
    this.lispClass = lispClass;
    Debug.assertTrue(instanceSlots.isList());
    int length = instanceSlots.cl_length();
    slotNames = makeLispObjectArray(length);
    int i = 0;

    while (instanceSlots != NIL)
      {
        slotNames[i++] = instanceSlots.first();
        instanceSlots = instanceSlots.rest();
      }

    Debug.assertTrue(i == length);
    this.sharedSlots = sharedSlots;
    slotTable = initializeSlotTable(slotNames);
  }

  public Layout(LispClass lispClass, SubLObject[] instanceSlotNames,
                SubLObject sharedSlots)
  {
    this.lispClass = lispClass;
    this.slotNames = instanceSlotNames;
    this.sharedSlots = sharedSlots;
    slotTable = initializeSlotTable(slotNames);
  }

  // Copy constructor.
  Layout(Layout oldLayout)
  {
    lispClass = oldLayout.getLispClass();
    slotNames = oldLayout.slotNames;
    sharedSlots = oldLayout.sharedSlots;
    slotTable = initializeSlotTable(slotNames);
  }

  private EqHashTable initializeSlotTable(SubLObject[] slotNames)
  {
    EqHashTable ht = new EqHashTable(slotNames.length, NIL, NIL);
    for (int i = slotNames.length; i-- > 0;)
      ht.putVoid(slotNames[i], LispObjectFactory.makeInteger(i));
    return ht;
  }

  @Override
  public SubLObject getParts()
  {
    SubLObject result = NIL;
    result = result.push(makeCons("class", getLispClass()));
    for (int i = 0; i < slotNames.length; i++)
      {
        result = result.push(makeCons("slot " + i, slotNames[i]));
      }
    result = result.push(makeCons("shared slots", sharedSlots));
    return result.nreverse();
  }

  public LispClass getLispClass()
  {
    return lispClass;
  }

  public boolean isInvalid()
  {
    return invalid;
  }

  public void invalidate()
  {
    invalid = true;
  }

  public SubLObject[] getSlotNames()
  {
    return slotNames;
  }

  public int getLength()
  {
    return slotNames.length;
  }

  public SubLObject getSharedSlots()
  {
    return sharedSlots;
  }

  @Override
  public String writeToString()
  {
    return unreadableString(LispSymbols.LAYOUT);
  }

  // Generates a list of slot definitions for the slot names in this layout.
  protected SubLObject generateSlotDefinitions()
  {
    SubLObject list = NIL;
    for (int i = slotNames.length; i-- > 0;)
      list = list.push(new SlotDefinitionObject(slotNames[i], NIL));

    return list;
  }

  // ### make-layout
  private static final Primitive MAKE_LAYOUT =
    new JavaPrimitive("make-layout", PACKAGE_SYS, true,
                  "class instance-slots class-slots")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third)

      {
          return new Layout(checkClass(first), checkList(second),
                              checkList(third));
      }

    };

  // ### layout-class
  private static final Primitive LAYOUT_CLASS =
    new JavaPrimitive("layout-class", PACKAGE_SYS, true, "layout")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return checkLayout(arg).getLispClass();
      }
    };

  // ### layout-length
  private static final Primitive LAYOUT_LENGTH =
    new JavaPrimitive("layout-length", PACKAGE_SYS, true, "layout")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return LispObjectFactory.makeInteger(checkLayout(arg).slotNames.length);
      }
    };

  public int getSlotIndex(SubLObject slotName)
  {
    SubLObject index = slotTable.getHT(slotName);
    if (index != null)
      return ((Fixnum)index).value;
    return -1;
  }

  public SubLObject getSharedSlotLocation(SubLObject slotName)

  {
    SubLObject rest = sharedSlots;
    while (rest != NIL)
      {
        SubLObject location = rest.first();
        if (location.first() == slotName)
          return location;
        rest = rest.rest();
      }
    return null;
  }

  // ### layout-slot-index layout slot-name => index
  private static final Primitive LAYOUT_SLOT_INDEX =
    new JavaPrimitive("layout-slot-index", PACKAGE_SYS, true)
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          final SubLObject slotNames[] = checkLayout(first).slotNames;
          for (int i = slotNames.length; i-- > 0;)
            {
              if (slotNames[i] == second)
                return LispObjectFactory.makeInteger(i);
            }
          return NIL;
      }
    };

  // ### layout-slot-location layout slot-name => location
  private static final Primitive LAYOUT_SLOT_LOCATION =
    new JavaPrimitive("layout-slot-location", PACKAGE_SYS, true, "layout slot-name")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
                final Layout layOutFirst = checkLayout(first);
            final SubLObject slotNames[] = layOutFirst.slotNames;
            final int limit = slotNames.length;
            for (int i = 0; i < limit; i++)
              {
                if (slotNames[i] == second)
                  return LispObjectFactory.makeInteger(i);
              }
            // Reaching here, it's not an instance slot.
            SubLObject rest = layOutFirst.sharedSlots;
            while (rest != NIL)
              {
                SubLObject location = rest.first();
                if (location.first() == second)
                  return location;
                rest = rest.rest();
              }
            return NIL;
          }      
    };

  // ### %make-instances-obsolete class => class
  private static final Primitive _MAKE_INSTANCES_OBSOLETE =
    new JavaPrimitive("%make-instances-obsolete", PACKAGE_SYS, true, "class")
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
        final LispClass lispClass = checkClass(arg);
        Layout oldLayout = lispClass.getClassLayout();
        if (oldLayout==null) {
        	oldLayout = null;
        	System.err.println("CANT %make-instances-obsolete " + lispClass);
        	return arg;
        }
        Layout newLayout = new Layout(oldLayout);
        lispClass.setClassLayout(newLayout);
        oldLayout.invalidate();
        return arg;
      }
    };
}

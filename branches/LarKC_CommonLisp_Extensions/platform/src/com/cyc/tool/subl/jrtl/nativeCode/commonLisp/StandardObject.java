/*
 * StandardObject.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: StandardObject.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

public class StandardObject extends AbstractLispObject
{
  protected Layout layout;
  protected SubLObject[] slots;

  protected StandardObject()
  {
    layout = new Layout(StandardClass.STANDARD_OBJECT, NIL, NIL);
  }


  protected StandardObject(Layout layout, int length)
  {
    this.layout = layout;
    slots = makeLispObjectArray(length);
    for (int i = slots.length; i-- > 0;)
      slots[i] = UNBOUND_VALUE;
  }


  protected StandardObject(LispClass cls, int length)
  {
    layout = cls == null ? null : cls.getClassLayout();
    slots = makeLispObjectArray(length);
    for (int i = slots.length; i-- > 0;)
      slots[i] = UNBOUND_VALUE;
  }

  protected StandardObject(LispClass cls)
  {
    layout = cls == null ? null : cls.getClassLayout();
    slots = new SubLObject[layout == null ? 0 : layout.getLength()];
    for (int i = slots.length; i-- > 0;)
      slots[i] = UNBOUND_VALUE;
  }

  @Override
  public SubLObject getParts()
  {
    SubLObject parts = NIL;
    if (layout != null)
      {
        if (layout.isInvalid())
          {
            // Update instance.
            layout = updateLayout();
          }
      }
    parts = parts.push(makeCons("LAYOUT", layout));
    if (layout != null)
      {
        SubLObject[] slotNames = layout.getSlotNames();
        if (slotNames != null)
          {
            for (int i = 0; i < slotNames.length; i++)
              {
                parts = parts.push(makeCons(slotNames[i], slots[i]));
              }
          }
      }
    return parts.nreverse();
  }

  public final LispClass getLispClass()
  {
    return layout.getLispClass();
  }

  @Override
  public SubLObject typeOf()
  {
    // "For objects of metaclass STRUCTURE-CLASS or STANDARD-CLASS, and for
    // conditions, TYPE-OF returns the proper name of the class returned by
    // CLASS-OF if it has a proper name, and otherwise returns the class
    // itself."
    final LispClass c1 = layout.getLispClass();
    // The proper name of a class is "a symbol that names the class whose
    // name is that symbol".
    final SubLObject name = c1.getLispClassName();
    if (name != NIL && name != UNBOUND_VALUE)
      {
        // TYPE-OF.9
        final SubLObject c2 = LispClass.findClass(checkSymbol(name));
        if (c2 == c1)
          return name;
      }
    return c1;
  }

  @Override
  public SubLObject classOf()
  {
    return layout.getLispClass();
  }

  @Override
  public SubLObject typep(SubLObject type)
  {
    if (type == LispSymbols.STANDARD_OBJECT)
      return T;
    if (type == StandardClass.STANDARD_OBJECT)
      return T;
    LispClass cls = layout != null ? layout.getLispClass() : null;
    if (cls != null)
      {
        if (type == cls)
          return T;
        if (type == cls.getLispClassName())
          return T;
        SubLObject cpl = cls.getCPL();
        while (cpl != NIL)
          {
            if (type == cpl.first())
              return T;
            if (type == ((LispClass)cpl.first()).getLispClassName())
              return T;
            cpl = cpl.rest();
          }
      }
    return super.typep(type);
  }

  @Override
  public String writeToString()
  {
    final LispThread thread = LispThread.currentThread();
    int maxLevel = Integer.MAX_VALUE;
    SubLObject printLevel = LispSymbols.PRINT_LEVEL.symbolValue(thread);
    if (printLevel instanceof Fixnum)
      maxLevel = ((Fixnum)printLevel).value;
    SubLObject currentPrintLevel =
      _CURRENT_PRINT_LEVEL_.symbolValue(thread);
    int currentLevel = currentPrintLevel.intValue();
    if (currentLevel >= maxLevel)
      return "#";
    if (typep(LispSymbols.CONDITION) != NIL)
      {
        StringOutputStream stream = new StringOutputStream();
        LispSymbols.PRINT_OBJECT.execute(this, stream);
        return stream.getOutputString().getString();
      }
    return unreadableString(typeOf().writeToString());
  }

  Layout updateLayout()
  {
    Debug.assertTrue(layout.isInvalid());
    Layout oldLayout = layout;
    LispClass cls = oldLayout.getLispClass();
    Layout newLayout = cls.getClassLayout();
    Debug.assertTrue(!newLayout.isInvalid());
    StandardObject newInstance = new StandardObject(cls);
    Debug.assertTrue(newInstance.layout == newLayout);
    SubLObject added = NIL;
    SubLObject discarded = NIL;
    SubLObject plist = NIL;
    // Old local slots.
    SubLObject[] oldSlotNames = oldLayout.getSlotNames();
    for (int i = 0; i < oldSlotNames.length; i++)
      {
        SubLObject slotName = oldSlotNames[i];
        int j = newLayout.getSlotIndex(slotName);
        if (j >= 0)
          newInstance.slots[j] = slots[i];
        else
          {
            discarded = discarded.push(slotName);
            if (slots[i] != UNBOUND_VALUE)
              {
                plist = plist.push(slotName);
                plist = plist.push(slots[i]);
              }
          }
      }
    // Old shared slots.
    SubLObject rest = oldLayout.getSharedSlots(); // A list.
    if (rest != null)
      {
        while (rest != NIL)
          {
            SubLObject location = rest.first();
            SubLObject slotName = location.first();
            int i = newLayout.getSlotIndex(slotName);
            if (i >= 0)
              newInstance.slots[i] = location.rest();
            rest = rest.rest();
          }
      }
    // Go through all the new local slots to compute the added slots.
    SubLObject[] newSlotNames = newLayout.getSlotNames();
    for (int i = 0; i < newSlotNames.length; i++)
      {
        SubLObject slotName = newSlotNames[i];
        int j = oldLayout.getSlotIndex(slotName);
        if (j >= 0)
          continue;
        SubLObject location = oldLayout.getSharedSlotLocation(slotName);
        if (location != null)
          continue;
        // Not found.
        added = added.push(slotName);
      }
    // Swap slots.
    SubLObject[] tempSlots = slots;
    slots = newInstance.slots;
    newInstance.slots = tempSlots;
    // Swap layouts.
    Layout tempLayout = layout;
    layout = newInstance.layout;
    newInstance.layout = tempLayout;
    Debug.assertTrue(!layout.isInvalid());
    // Call UPDATE-INSTANCE-FOR-REDEFINED-CLASS.
    LispSymbols.UPDATE_INSTANCE_FOR_REDEFINED_CLASS.execute(this, added,
                                                       discarded, plist);
    return newLayout;
  }

  // Only handles instance slots (not shared slots).
  public SubLObject getInstanceSlotValue(SubLObject slotName)

  {
    Debug.assertTrue(layout != null);
    if (layout.isInvalid())
      {
        // Update instance.
        layout = updateLayout();
      }
    Debug.assertTrue(layout != null);
    int index = layout.getSlotIndex(slotName);
    //### FIXME: should call SLOT-MISSING (clhs)
    if (index < 0)
      return error(new LispError("Missing slot " + slotName.writeToString()));
    return slots[index];
  }

  // Only handles instance slots (not shared slots).
  public void setInstanceSlotValue(SubLObject slotName, SubLObject newValue)

  {
    Debug.assertTrue(layout != null);
    if (layout.isInvalid())
      {
        // Update instance.
        layout = updateLayout();
      }
    Debug.assertTrue(layout != null);
    int index = layout.getSlotIndex(slotName);
    //### FIXME: should call SLOT-MISSING (clhs)
    if (index < 0)
      error(new LispError("Missing slot " + slotName.writeToString()));
    slots[index] = newValue;
  }

        final public static StandardObject checkStandardObject(SubLObject first)
        {
                if (first instanceof StandardObject)
                        return (StandardObject) first;
                return (StandardObject) type_error(first, LispSymbols.STANDARD_OBJECT);
        }
        
  // ### swap-slots instance-1 instance-2 => nil
  private static final Primitive SWAP_SLOTS =
    new JavaPrimitive("swap-slots", PACKAGE_SYS, true, "instance-1 instance-2")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
        final StandardObject obj1 = checkStandardObject(first);
        final StandardObject obj2 = checkStandardObject(second);
        SubLObject[] temp = obj1.slots;
        obj1.slots = obj2.slots;
        obj2.slots = temp;
        return NIL;
      }
    };

  // ### std-instance-layout
  private static final Primitive STD_INSTANCE_LAYOUT =
    new JavaPrimitive("std-instance-layout", PACKAGE_SYS, true)
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
        final StandardObject instance = checkStandardObject(arg);
        Layout layout = instance.layout;
        if (layout.isInvalid())
          {
            // Update instance.
            layout = instance.updateLayout();
          }
        return layout;
      }
    };

  // ### %set-std-instance-layout
  private static final Primitive _SET_STD_INSTANCE_LAYOUT =
    new JavaPrimitive("%set-std-instance-layout", PACKAGE_SYS, true)
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
          checkStandardObject(first).layout = checkLayout(second);          
          return second;
      }
    };

  // ### std-instance-class
  private static final Primitive STD_INSTANCE_CLASS =
    new JavaPrimitive("std-instance-class", PACKAGE_SYS, true)
    {
      @Override
      public SubLObject execute(SubLObject arg)
      {
          return checkStandardObject(arg).layout.getLispClass();
      }
    };

  // ### standard-instance-access instance location => value
  private static final Primitive STANDARD_INSTANCE_ACCESS =
    new JavaPrimitive("standard-instance-access", PACKAGE_SYS, true,
                  "instance location")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
        final StandardObject instance = checkStandardObject(first);
        final int index;
        if (second instanceof Fixnum)
          {
            index = ((Fixnum)second).value;
          }
        else
          {
            return type_error(second,
                                   list(LispSymbols.INTEGER, Fixnum.ZERO,
                                         LispObjectFactory.makeInteger(instance.slots.length)));
          }
        SubLObject value;
        try
          {
            value = instance.slots[index];
          }
        catch (ArrayIndexOutOfBoundsException e)
          {
            return type_error(second,
                                   list(LispSymbols.INTEGER, Fixnum.ZERO,
                                         LispObjectFactory.makeInteger(instance.slots.length)));
          }
        if (value == UNBOUND_VALUE)
          {
            SubLObject slotName = instance.layout.getSlotNames()[index];
            value = LispSymbols.SLOT_UNBOUND.execute(instance.getLispClass(),
                                                instance, slotName);
            LispThread.currentThread()._values = null;
          }
        return value;
      }
    };

  // ### %set-standard-instance-access instance location new-value => new-value
  private static final Primitive _SET_STANDARD_INSTANCE_ACCESS =
    new JavaPrimitive("%set-standard-instance-access", PACKAGE_SYS, true)
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third)

      {
          checkStandardObject(first).slots[second.intValue()] = third; // FIXME
          return third;
      }
    };

  // ### std-slot-boundp
  private static final Primitive STD_SLOT_BOUNDP =
    new JavaPrimitive(LispSymbols.STD_SLOT_BOUNDP, "instance slot-name")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
        final StandardObject instance = checkStandardObject(first);
        Layout layout = instance.layout;
        if (layout.isInvalid())
          {
            // Update instance.
            layout = instance.updateLayout();
          }
        final SubLObject index = layout.slotTable.getHT(second);
        if (index != null)
          {
            // Found instance slot.
            return instance.slots[((Fixnum)index).value] != UNBOUND_VALUE ? T : NIL;
          }
        // Check for shared slot.
        final SubLObject location = layout.getSharedSlotLocation(second);
        if (location != null)
          return location.rest() != UNBOUND_VALUE ? T : NIL;
        // Not found.
        final LispThread thread = LispThread.currentThread();
        SubLObject value =
          thread.execute(LispSymbols.SLOT_MISSING, instance.getLispClass(),
                         instance, second, LispSymbols.SLOT_BOUNDP);
        // "If SLOT-MISSING is invoked and returns a value, a boolean
        // equivalent to its primary value is returned by SLOT-BOUNDP."
        thread._values = null;
        return value != NIL ? T : NIL;
      }
    };

  @Override
  public SubLObject SLOT_VALUE(SubLObject slotName)
  {
    if (layout.isInvalid())
      {
        // Update instance.
        layout = updateLayout();
      }
    SubLObject value;
    final SubLObject index = layout.slotTable.getHT(slotName);
    if (index != null)
      {
        // Found instance slot.
        value = slots[((Fixnum)index).value];
      }
    else
      {
        // Check for shared slot.
        SubLObject location = layout.getSharedSlotLocation(slotName);
        if (location == null)
          return LispSymbols.SLOT_MISSING.execute(getLispClass(), this, slotName,
                                             LispSymbols.SLOT_VALUE);
        value = location.rest();
      }
    if (value == UNBOUND_VALUE)
      {
        value = LispSymbols.SLOT_UNBOUND.execute(getLispClass(), this, slotName);
        LispThread.currentThread()._values = null;
      }
    return value;
  }

  // ### std-slot-value
  private static final Primitive STD_SLOT_VALUE =
    new JavaPrimitive(LispSymbols.STD_SLOT_VALUE, "instance slot-name")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second)

      {
        return first.SLOT_VALUE(second);
      }
    };

  @Override
  public void setSlotValue(SubLObject slotName, SubLObject newValue)

  {
    if (layout.isInvalid())
      {
        // Update instance.
        layout = updateLayout();
      }
    final SubLObject index = layout.slotTable.getHT(slotName);
    if (index != null)
      {
        // Found instance slot.
        slots[((Fixnum)index).value] = newValue;
        return;
      }
    // Check for shared slot.
    SubLObject location = layout.getSharedSlotLocation(slotName);
    if (location != null)
      {
        location.setCdr(newValue);
        return;
      }
    SubLObject[] args = makeLispObjectArray(5);
    args[0] = getLispClass();
    args[1] = this;
    args[2] = slotName;
    args[3] = LispSymbols.SETF;
    args[4] = newValue;
    LispSymbols.SLOT_MISSING.execute(args);
  }

  // ### set-std-slot-value
  private static final Primitive SET_STD_SLOT_VALUE =
    new JavaPrimitive(LispSymbols.SET_STD_SLOT_VALUE, "instance slot-name new-value")
    {
      @Override
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third)

      {
        first.setSlotValue(second, third);
        return third;
      }
    };
}

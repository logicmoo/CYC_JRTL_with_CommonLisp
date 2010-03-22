/*
 * SlotDefinition.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: SlotDefinition.java 12431 2010-02-08 08:05:15Z mevenson $
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

public final class SlotDefinitionObject extends StandardObject
{
  public SlotDefinitionObject()
  {
    super(StandardClass.SLOT_DEFINITION,
          StandardClass.SLOT_DEFINITION.getClassLayout().getLength());
    slots[SlotDefinitionClass.SLOT_INDEX_LOCATION] = NIL;
  }

  public SlotDefinitionObject(SubLObject name, SubLObject readers)
  {
    this();
    Debug.assertTrue(name instanceof SubLSymbol);
    slots[SlotDefinitionClass.SLOT_INDEX_NAME] = name;
    slots[SlotDefinitionClass.SLOT_INDEX_INITFUNCTION] = NIL;
    slots[SlotDefinitionClass.SLOT_INDEX_INITARGS] =
      makeCons(PACKAGE_KEYWORD.intern(((SubLSymbol)name).getJavaSymbolName()));
    slots[SlotDefinitionClass.SLOT_INDEX_READERS] = readers;
    slots[SlotDefinitionClass.SLOT_INDEX_ALLOCATION] = Keyword.INSTANCE;
  }

  public SlotDefinitionObject(SubLObject name, SubLObject readers,
                        SubLObject initForm)
  {
    this();
    Debug.assertTrue(name instanceof SubLSymbol);
    slots[SlotDefinitionClass.SLOT_INDEX_NAME] = name;
    slots[SlotDefinitionClass.SLOT_INDEX_INITFUNCTION] = NIL;
    slots[SlotDefinitionClass.SLOT_INDEX_INITFORM] = initForm;
    slots[SlotDefinitionClass.SLOT_INDEX_INITARGS] =
      makeCons(PACKAGE_KEYWORD.intern(((SubLSymbol)name).getJavaSymbolName()));
    slots[SlotDefinitionClass.SLOT_INDEX_READERS] = readers;
    slots[SlotDefinitionClass.SLOT_INDEX_ALLOCATION] = Keyword.INSTANCE;
  }
  
   public final SubLObject getSlotDefName()
  {
    return slots[SlotDefinitionClass.SLOT_INDEX_NAME];
  }

  public final void setLocation(int i)
  {
    slots[SlotDefinitionClass.SLOT_INDEX_LOCATION] = LispObjectFactory.makeInteger(i);
  }

  @Override
  public String writeToString()
  {
    StringBuilder sb =
      new StringBuilder(LispSymbols.SLOT_DEFINITION.writeToString());
    SubLObject name = slots[SlotDefinitionClass.SLOT_INDEX_NAME];
    if (name != null && name != NIL)
      {
        sb.append(' ');
        sb.append(name.writeToString());
      }
    return unreadableString(sb.toString());
  }
}

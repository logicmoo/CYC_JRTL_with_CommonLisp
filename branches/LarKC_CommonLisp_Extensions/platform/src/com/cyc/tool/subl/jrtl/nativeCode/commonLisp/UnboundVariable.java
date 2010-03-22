/*
 * UnboundVariable.java
 *
 * Copyright (C) 2002-2006 Peter Graves
 * $Id: UnboundVariable.java 12298 2009-12-18 21:50:54Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public final class UnboundVariable extends CellError
{
  // obj is either the unbound variable itself or an initArgs list.
  public UnboundVariable(SubLObject obj)
  {
    super(StandardClass.UNBOUND_VARIABLE);
    if (obj instanceof SubLCons)
      initialize(obj);
    else
      setCellName(obj);
  }

  @Override
  public String getMessage()
  {
    LispThread thread = LispThread.currentThread();
    final SpecialBindingsMark mark = thread.markSpecialBindings();
    thread.bindSpecial(LispSymbols.PRINT_ESCAPE, T);
    StringBuffer sb = new StringBuffer("The variable ");
    try {
        sb.append(getCellName().writeToString());
    }
    finally {
        thread.resetSpecialBindings(mark);
    }
    sb.append(" is unbound.");
    return sb.toString();
  }

  @Override
  public SubLObject typeOf()
  {
    return LispSymbols.UNBOUND_VARIABLE;
  }

  @Override
  public SubLObject classOf()
  {
    return StandardClass.UNBOUND_VARIABLE;
  }

  @Override
  public SubLObject typep(SubLObject type)
  {
    if (type == LispSymbols.UNBOUND_VARIABLE)
      return T;
    if (type == StandardClass.UNBOUND_VARIABLE)
      return T;
    return super.typep(type);
  }
}

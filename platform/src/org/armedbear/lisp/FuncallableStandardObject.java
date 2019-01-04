/*
 * FuncallableStandardObject.java
 *
 * Copyright (C) 2003-2006 Peter Graves, 2012 Rudolf Schlatte
 * $Id$
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


// TODO: swap-slots is currently handled by StandardObject, so doesn't
// exchange the functions.
package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.*;

public class FuncallableStandardObject extends StandardObject
{
  LispObject function;

  // KLUDGE: this is only needed for generic functions, but doesn't hurt
  // to have it here.
  EMFCache cache = new EMFCache();

  protected FuncallableStandardObject()
  {
    super();
  }


  protected FuncallableStandardObject(Layout layout)
  {
    this(layout, layout.getLength());
  }

  protected FuncallableStandardObject(Layout layout, int length)
  {
    super(layout, length);
  }


  protected FuncallableStandardObject(LispClass cls, int length)
  {
    super(cls, length);
  }

  protected FuncallableStandardObject(LispClass cls)
  {
    super(cls);
  }

  public LispObject typep(LispObject type)
  {
    if (type == Symbol.COMPILED_FUNCTION)
      {
    	boolean wasTypeP = false;
        if (function != null)
        	wasTypeP = function.typep(type)!=NIL;
        else
          return NIL;
    	boolean wasGeneric =  typep(Symbol.STANDARD_GENERIC_FUNCTION) != NIL;
    	if ( wasGeneric) {
			return NIL;
    	}
    	return wasTypeP?T:NIL;
      }
    if (type == Symbol.FUNCALLABLE_STANDARD_OBJECT)
      return T;
    if (type == StandardClass.FUNCALLABLE_STANDARD_OBJECT)
      return T;
    return super.typep(type);
  }

  public LispObject execute()
  {
    return function.execute();
  }

  public LispObject execute(LispObject arg)
  {
    return function.execute(arg);
  }

  public LispObject execute(LispObject first, LispObject second)

  {
    return function.execute(first, second);
  }

  public LispObject execute(LispObject first, LispObject second,
                            LispObject third)

  {
    return function.execute(first, second, third);
  }

  public LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth)

  {
    return function.execute(first, second, third, fourth);
  }

  public LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth,
                            LispObject fifth)

  {
    return function.execute(first, second, third, fourth,
                            fifth);
  }

  public LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth,
                            LispObject fifth, LispObject sixth)

  {
    return function.execute(first, second, third, fourth,
                            fifth, sixth);
  }

  public LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth,
                            LispObject fifth, LispObject sixth,
                            LispObject seventh)

  {
    return function.execute(first, second, third, fourth,
                            fifth, sixth, seventh);
  }

  public LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth,
                            LispObject fifth, LispObject sixth,
                            LispObject seventh, LispObject eighth)

  {
    return function.execute(first, second, third, fourth,
                            fifth, sixth, seventh, eighth);
  }

  public LispObject execute(LispObject[] args)
  {
    return function.execute(args);
  }

  private static final Primitive _ALLOCATE_FUNCALLABLE_INSTANCE
    = new pf__allocate_funcallable_instance();
  @DocString(name="%allocate-funcallable-instance",
             args="class",
             returns="instance")
  private static final class pf__allocate_funcallable_instance extends Primitive
  {
    pf__allocate_funcallable_instance()
    {
      super("%allocate-funcallable-instance", PACKAGE_SYS, true, "class");
    }
    public LispObject execute(LispObject arg)
    {
      if (arg.typep(StandardClass.FUNCALLABLE_STANDARD_CLASS) != NIL) {
        LispObject l = Symbol.CLASS_LAYOUT.execute(arg);
        if (! (l instanceof Layout)) {
          return program_error("Invalid standard class layout for: "
                               + arg.princToString() + ".");
        }
        return new FuncallableStandardObject((Layout)l);
      }
      return type_error(arg, Symbol.FUNCALLABLE_STANDARD_CLASS);
    }
  };

  // AMOP p. 230
  private static final Primitive SET_FUNCALLABLE_INSTANCE_FUNCTION
    = new pf_set_funcallable_instance_function();
  @DocString(name="set-funcallable-instance-function",
             args="funcallable-instance function",
             returns="unspecified")
  private static final class pf_set_funcallable_instance_function extends Primitive
  {
    pf_set_funcallable_instance_function()
    {
      super("set-funcallable-instance-function", PACKAGE_MOP, true,
            "funcallable-instance function");
    }
    public LispObject execute(LispObject first, LispObject second)
    {
      checkFuncallableStandardObject(first).function = second;
      return second;
    }
  };

  private static final Primitive FUNCALLABLE_INSTANCE_FUNCTION
    = new pf_funcallable_instance_function();
  @DocString(name="funcallable-instance-function",
             args="funcallable-instance",
             returns="function")
  private static final class pf_funcallable_instance_function extends Primitive
  {
    pf_funcallable_instance_function()
    {
      super("funcallable-instance-function", PACKAGE_MOP, false,
            "funcallable-instance");
    }
    public LispObject execute(LispObject arg)
    {
      return checkFuncallableStandardObject(arg).function;
    }
  };


  // Profiling.
  private int callCount;
  private int hotCount;

  public final int getCallCount()
  {
    return callCount;
  }

  public void setCallCount(int n)
  {
    callCount = n;
  }

  public final void incrementCallCount()
  {
    ++callCount;
  }

  public final int getHotCount()
  {
    return hotCount;
  }

  public void setHotCount(int n)
  {
    hotCount = n;
  }

  public final void incrementHotCount()
  {
    ++hotCount;
  }

  public static final FuncallableStandardObject checkFuncallableStandardObject(LispObject obj)
  {
    if (obj instanceof FuncallableStandardObject)
      return (FuncallableStandardObject) obj;
    return (FuncallableStandardObject) // Not reached.
      type_error(obj, Symbol.FUNCALLABLE_STANDARD_OBJECT);
  }

}

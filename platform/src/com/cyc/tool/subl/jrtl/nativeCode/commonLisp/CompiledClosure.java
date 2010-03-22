/*
 * CompiledClosure.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: CompiledClosure.java 12398 2010-01-24 21:59:56Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class CompiledClosure extends Closure
        implements Cloneable
{

  public ClosureBinding[] ctx;

  public CompiledClosure(Parameter[] required,
                         Parameter[] optional,
                         Parameter[] keyword,
                         SubLSymbol keys, SubLSymbol rest, SubLSymbol moreKeys)
  {
      super(required, optional, keyword, keys, rest, moreKeys);
  }


  public CompiledClosure(SubLObject lambdaList)
  {
    super(list(LispSymbols.LAMBDA, lambdaList), null);
  }

  final public CompiledClosure setContext(ClosureBinding[] context)
  {
    ctx = context;
    return this;
  }

  final public CompiledClosure dup()
  {
      CompiledClosure result = null;
      try {
	  result = (CompiledClosure)super.clone();
      } catch (Error e) {
      	throw e;
      } catch (RuntimeException e) {
      	throw e;
      } catch (Exception e) {
      	if (e instanceof CloneNotSupportedException) {      		
      	} else {
      		e.printStackTrace();
      	}
      }
      return result;
  }

  @Override
  public SubLObject typep(SubLObject typeSpecifier)
  {
    if (typeSpecifier == LispSymbols.COMPILED_FUNCTION)
      return T;
    return super.typep(typeSpecifier);
  }

  private final SubLObject notImplemented()
  {
    return error(new WrongNumberOfArgumentsException(this));
  }


  // Zero args.
  public SubLObject execute()
  {
    SubLObject[] args = makeLispObjectArray(0);
    return execute(args);
  }

  // One arg.
  public SubLObject execute( SubLObject first)

  {
    SubLObject[] args = makeLispObjectArray(1);
    args[0] = first;
    return execute(args);
  }

  // Two args.
  public SubLObject execute( SubLObject first,
                            SubLObject second)

  {
    SubLObject[] args = makeLispObjectArray(2);
    args[0] = first;
    args[1] = second;
    return execute(args);
  }

  // Three args.
  public SubLObject execute( SubLObject first,
                            SubLObject second, SubLObject third)

  {
    SubLObject[] args = makeLispObjectArray(3);
    args[0] = first;
    args[1] = second;
    args[2] = third;
    return execute(args);
  }

  // Four args.
  public SubLObject execute( SubLObject first,
                            SubLObject second, SubLObject third,
                            SubLObject fourth)

  {
    SubLObject[] args = makeLispObjectArray(4);
    args[0] = first;
    args[1] = second;
    args[2] = third;
    args[3] = fourth;
    return execute(args);
  }

  // Five args.
  public SubLObject execute( SubLObject first,
                            SubLObject second, SubLObject third,
                            SubLObject fourth, SubLObject fifth)

  {
    SubLObject[] args = makeLispObjectArray(5);
    args[0] = first;
    args[1] = second;
    args[2] = third;
    args[3] = fourth;
    args[4] = fifth;
    return execute(args);
  }

  // Six args.
  public SubLObject execute( SubLObject first,
                            SubLObject second, SubLObject third,
                            SubLObject fourth, SubLObject fifth,
                            SubLObject sixth)

  {
    SubLObject[] args = makeLispObjectArray(6);
    args[0] = first;
    args[1] = second;
    args[2] = third;
    args[3] = fourth;
    args[4] = fifth;
    args[5] = sixth;
    return execute(args);
  }

  // Seven args.
  public SubLObject execute( SubLObject first,
                            SubLObject second, SubLObject third,
                            SubLObject fourth, SubLObject fifth,
                            SubLObject sixth, SubLObject seventh)

  {
    SubLObject[] args = makeLispObjectArray(7);
    args[0] = first;
    args[1] = second;
    args[2] = third;
    args[3] = fourth;
    args[4] = fifth;
    args[5] = sixth;
    args[6] = seventh;
    return execute(args);
  }

  // Eight args.
  public SubLObject execute( SubLObject first,
                            SubLObject second, SubLObject third,
                            SubLObject fourth, SubLObject fifth,
                            SubLObject sixth, SubLObject seventh,
                            SubLObject eighth)

  {
    SubLObject[] args = makeLispObjectArray(8);
    args[0] = first;
    args[1] = second;
    args[2] = third;
    args[3] = fourth;
    args[4] = fifth;
    args[5] = sixth;
    args[6] = seventh;
    args[7] = eighth;
    return execute(args);
  }

  // Arg array.
  public SubLObject execute(SubLObject[] args)

  {
    return notImplemented();
  }

  // ### load-compiled-function
  private static final Primitive LOAD_COMPILED_FUNCTION =
      new JavaPrimitive("load-compiled-function", PACKAGE_SYS, true, "source")
  {
    @Override
    public SubLObject execute(SubLObject arg)
    {
      String namestring = null;
      if (arg instanceof Pathname)
        namestring = ((Pathname)arg).getNamestring();
      else if (arg instanceof SubLString)
        namestring = arg.getString();
      if (namestring != null) {
          //    Debug.trace("autoloading preloaded ... " + namestring);
        return AutoloadedFunctionProxy.loadPreloadedFunction(namestring);
      }
      if(arg instanceof JavaObject) {
	  try {
	      return loadClassBytes((byte[]) arg.javaInstance(byte[].class));
	  } catch(Throwable t) {
	      Debug.trace(t);
	      return error(new LispError("Unable to load " + arg.writeToString()));
	  }
      }
      return error(new LispError("Unable to load " + arg.writeToString()));
    }
  };

  // ### varlist
  private static final Primitive VARLIST =
      new JavaPrimitive("varlist", PACKAGE_SYS, false)
  {
    @Override
    public SubLObject execute(SubLObject arg)
    {
      if (arg instanceof Closure)
        return ((Closure)arg).getVariableList();
      return type_error(arg, LispSymbols.COMPILED_FUNCTION);
    }
  };
}

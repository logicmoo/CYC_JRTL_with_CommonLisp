/*
 * StandardGenericFunction.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: StandardGenericFunction.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import java.util.HashMap;


import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.StandardGenericFunctionTrampolines.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public final class StandardGenericFunction extends StandardObject
{
  SubLObject function;

  int numberOfRequiredArgs;

  HashMap<CacheEntry,SubLObject> cache;
  HashMap<SubLObject,SubLObject> slotCache;

  public StandardGenericFunction()
  {
    super(StandardClass.STANDARD_GENERIC_FUNCTION,
          StandardClass.STANDARD_GENERIC_FUNCTION.getClassLayout().getLength());
  }

  public StandardGenericFunction(String name, SubLPackage pkg, boolean exported,
                                 Function function, SubLObject lambdaList,
                                 SubLObject specializers)
  {
    this();
    SubLSymbol symbol;
    if (exported)
      symbol = pkg.internAndExport(name.toUpperCase());
    else
      symbol = pkg.intern(name.toUpperCase());
    symbol.setSymbolFunction(this);
    this.function = function;
    slots[StandardGenericFunctionClass.SLOT_INDEX_NAME] = symbol;
    slots[StandardGenericFunctionClass.SLOT_INDEX_LAMBDA_LIST] =
      lambdaList;
    slots[StandardGenericFunctionClass.SLOT_INDEX_REQUIRED_ARGS] =
      lambdaList;
    numberOfRequiredArgs = lambdaList.cl_length();
    slots[StandardGenericFunctionClass.SLOT_INDEX_INITIAL_METHODS] =
      NIL;
    StandardMethod method =
      new StandardMethod(this, function, lambdaList, specializers);
    slots[StandardGenericFunctionClass.SLOT_INDEX_METHODS] =
      list(method);
    slots[StandardGenericFunctionClass.SLOT_INDEX_METHOD_CLASS] =
      StandardClass.STANDARD_METHOD;
    slots[StandardGenericFunctionClass.SLOT_INDEX_METHOD_COMBINATION] =
      LispSymbols.STANDARD;
    slots[StandardGenericFunctionClass.SLOT_INDEX_ARGUMENT_PRECEDENCE_ORDER] =
      NIL;
    slots[StandardGenericFunctionClass.SLOT_INDEX_CLASSES_TO_EMF_TABLE] =
      NIL;
    slots[StandardGenericFunctionClass.SLOT_INDEX_DOCUMENTATION] = NIL;
  }

  void finalizeInternal()
  {
    cache = null;
  }

  @Override
  public SubLObject typep(SubLObject type)
  {
    if (type == LispSymbols.COMPILED_FUNCTION)
      {
        if (function != null)
          return function.typep(type);
        else
          return NIL;
      }
    if (type == LispSymbols.STANDARD_GENERIC_FUNCTION)
      return T;
    if (type == StandardClass.STANDARD_GENERIC_FUNCTION)
      return T;
    return super.typep(type);
  }

  public SubLObject getGenericFunctionName()
  {
    return slots[StandardGenericFunctionClass.SLOT_INDEX_NAME];
  }

  public void setGenericFunctionName(SubLObject name)
  {
    slots[StandardGenericFunctionClass.SLOT_INDEX_NAME] = name;
  }

  @Override
  public SubLObject execute()
  {
    return function.execute();
  }

  @Override
  public SubLObject execute(SubLObject arg)
  {
    return function.execute(arg);
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second)

  {
    return function.execute(first, second);
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third)

  {
    return function.execute(first, second, third);
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth)

  {
    return function.execute(first, second, third, fourth);
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth)

  {
    return function.execute(first, second, third, fourth,
                            fifth);
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth)

  {
    return function.execute(first, second, third, fourth,
                            fifth, sixth);
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth,
                            SubLObject seventh)

  {
    return function.execute(first, second, third, fourth,
                            fifth, sixth, seventh);
  }

  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth,
                            SubLObject seventh, SubLObject eighth)

  {
    return function.execute(first, second, third, fourth,
                            fifth, sixth, seventh, eighth);
  }

  @Override
  public SubLObject execute(SubLObject[] args)
  {
    return function.execute(args);
  }

  @Override
  public String writeToString()
  {
    SubLObject name = getGenericFunctionName();
    if (name != null)
      {
        StringBuilder sb = new StringBuilder();
        sb.append(getLispClass().getLispClassName().writeToString());
        sb.append(' ');
        sb.append(name.writeToString());
        return unreadableString(sb.toString());
      }
    return super.writeToString();
  }

  // Profiling.
  private int[] callCount = new int[12];
  private int hotCount;

  @Override
  public final SubLObject getCallCount()
  {
    return Profiler.makeCallCounts(callCount);
  }

  @Override
  public void setCallCount(int n)
  {
    callCount[0] = n;
  }

  @Override
  public final void incrementCallCount(int arity)
  {
		if (arity>10) arity = -1;
    ++callCount[arity+1];
  }

    @Override
    public final int getHotCount()
    {
        return hotCount;
    }

    @Override
    public void setHotCount(int n)
    {
        hotCount = n;
    }

    @Override
    public final void incrementHotCount()
    {
        ++hotCount;
    }
    
    EqlSpecialization eqlSpecializations[] = new EqlSpecialization[0];

    /**
     * Returns an object representing generic function 
     * argument <tt>arg</tt> in a <tt>CacheEntry</tt>
     *
     * <p>In the simplest case, when this generic function
     * does not have EQL specialized methos, and therefore
     * only argument types are relevant for choosing
     * applicable methods, the value returned is the 
     * class of <tt>arg</tt>
     *
     * <p>If the function has EQL specialized methods: 
     *   - if <tt>arg</tt> is EQL to some of the EQL-specializers,
     *     a special object representing equality to that specializer
     *     is returned.
     *   - otherwise class of the <tt>arg</tt> is returned.
     *
     * <p>Note that we do not consider argument position, when
     * calculating arg specialization. In rare cases (when
     * one argument is eql-specialized to a symbol specifying
     * class of another argument) this may result in redundant cache
     * entries caching the same method. But the method cached is anyway
     * correct for the arguments (because in case of cache miss, correct method
     * is calculated by other code, which does not rely on getArgSpecialization;
     * and because EQL is true only for objects of the same type, which guaranties
     * that if a type-specialized methods was chached by eql-specialization,
     * all the cache hits into this records will be from args of the conforming 
     * type).
     *
     * <p>Consider:
     * <pre><tt>
     * (defgeneric f (a b))
     *
     * (defmethod f (a (b (eql 'symbol)))
     *   "T (EQL 'SYMBOL)")
     *
     * (defmethod f ((a symbol) (b (eql 'symbol)))
     *   "SYMBOL (EQL 'SYMBOL)")
     *
     * (f 12 'symbol)
     * => "T (EQL 'SYMBOL)"
     *
     * (f 'twelve 'symbol)
     * => "SYMBOL (EQL 'SYMBOL)"
     *
     * (f 'symbol 'symbol)
     * => "SYMBOL (EQL 'SYMBOL)"
     *
     * </tt></pre>
     *
     * After the two above calls <tt>cache</tt> will contain tree keys:
     * <pre>
     * { class FIXNUM, EqlSpecialization('SYMBOL) }
     * { class SYMBOL, EqlSpecialization('SYMBOL) }
     * { EqlSpecialization('SYMBOL), EqlSpecialization('SYMBOL) }.
     * </pre>
     */     
    SubLObject getArgSpecialization(SubLObject arg)
    {
      for (EqlSpecialization eqlSpecialization : eqlSpecializations)
        {
          if (eqlSpecialization.eqlTo.eql(arg))
            return eqlSpecialization;
        }
      return arg.classOf();
    }

 }

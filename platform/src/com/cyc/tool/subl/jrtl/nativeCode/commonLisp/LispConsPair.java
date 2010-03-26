/*
 * Cons.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: Cons.java 12516 2010-03-03 21:05:41Z astalla $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class LispConsPair extends AbstractSubLList implements SubLCons
{
	@Override
	public int consLength() {
		// TODO Auto-generated method stub
		return cl_length();
	}
	
	@Override
	public boolean isArrayBased() {
		return false;
	}
	
  protected SubLObject car;
  protected SubLObject cdr;

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#setCdr(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  public void setCdr(SubLObject cdr) {
		this.cdr = cdr;
	}

	/* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#rest()
	 */
	public SubLObject rest() {
		return cdr;
	}

	public LispConsPair(SubLObject car, SubLObject cdr)
  {
    this.setCar(car);
    this.setCdr(cdr);
    ++count;
  }

  public LispConsPair(SubLObject car)
  {
    this.setCar(car);
    this.setCdr(NIL);
    ++count;
  }

  public LispConsPair(String name, SubLObject value)
  {
    this.setCar(makeString(name));
    this.setCdr(value != null ? value : NULL_VALUE);
    ++count;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#typeOf()
	 */
  @Override
  public SubLObject typeOf()
  {
    return LispSymbols.CONS;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#classOf()
	 */
  @Override
  public SubLObject classOf()
  {
    return BuiltInClass.CONS;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#typep(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public SubLObject typep(SubLObject typeSpecifier)
  {
    if (typeSpecifier instanceof SubLSymbol)
      {
        if (typeSpecifier == LispSymbols.LIST)
          return T;
        if (typeSpecifier == LispSymbols.CONS)
          return T;
        if (typeSpecifier == LispSymbols.SEQUENCE)
          return T;
        if (typeSpecifier == T)
          return T;
      }
    else if (typeSpecifier instanceof LispClass)
      {
        if (typeSpecifier == BuiltInClass.LIST)
          return T;
        if (typeSpecifier == BuiltInClass.CONS)
          return T;
        if (typeSpecifier == BuiltInClass.SEQUENCE)
          return T;
        if (typeSpecifier == BuiltInClass.CLASS_T)
          return T;
      }
    return NIL;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#constantp()
	 */
  @Override
  public final boolean constantp()
  {
    if (first() == LispSymbols.QUOTE)
      {
        if (rest() instanceof SubLCons)
          if (((SubLCons)rest()).rest() == NIL)
            return true;
      }
    return false;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#isAtom()
	 */
  @Override
  public boolean isAtom()
  {
    return false;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#setFirst(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public SubLCons setFirst(SubLObject obj)
  {
    setCar(obj);
    return this;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#setRest(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public SubLCons setRest(SubLObject obj)
  {
    setCdr(obj);
    return this;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#cadr()
	 */
  @Override
  public final SubLObject second()
  {
    return rest().first();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#cddr()
	 */
  @Override
  public SubLObject cddr()
  {
    return rest().rest();
  }

  @Override
  public boolean isCons() {
  	return true;
  }
  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#caddr()
	 */
  @Override
  public final SubLObject third()
  {
    return rest().second();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#nthCdr(int)
	 */
  @Override
  public SubLObject nthCdr(int n)
  {
    if (n < 0)
      return type_error(LispObjectFactory.makeInteger(n),
                             list(LispSymbols.INTEGER, Fixnum.ZERO));
    SubLObject result = this;
    for (int i = n; i-- > 0;)
      {
        result = result.rest();
        if (result == NIL)
          break;
      }
    return result;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#sxhash()
	 */
  @Override
  public final int sxhash()
  {
    return computeHash(this, 4);
  }

  private static final int computeHash(SubLObject obj, int depth)
  {
    if (obj instanceof SubLCons)
      {
        if (depth > 0)
          {
            int n1 = computeHash(((SubLCons)obj).first(), depth - 1);
            int n2 = computeHash(((SubLCons)obj).rest(), depth - 1);
            return n1 ^ n2;
          }
        else
          {
            // This number comes from SBCL, but since we're not really
            // using SBCL's SXHASH algorithm, it's probably not optimal.
            // But who knows?
            return 261835505;
          }
      }
    else
      return obj.sxhash();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#psxhash()
	 */
  @Override
  public final int psxhash()
  {
    return computeEqualpHash(this, 4);
  }

  private static final int computeEqualpHash(SubLObject obj, int depth)
  {
    if (obj instanceof SubLCons)
      {
        if (depth > 0)
          {
            int n1 = computeEqualpHash(((SubLCons)obj).first(), depth - 1);
            int n2 = computeEqualpHash(((SubLCons)obj).rest(), depth - 1);
            return n1 ^ n2;
          }
        else
          return 261835505; // See above.
      }
    else
      return obj.psxhash();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#equal(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public boolean equal(SubLObject obj)
  {
    if (this == obj)
      return true;
    if (obj.isArrayBased()) { return super.equal(obj); }
    if (obj instanceof SubLCons)
      {
        if (first().equal(((SubLCons)obj).first()) && rest().equal(((SubLCons)obj).rest()))
          return true;
      }
    return false;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#equalp(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public boolean equalp(SubLObject obj)
  {
    if (this == obj)
      return true;
    if (obj.isArrayBased()) { return super.equalp(obj); }
    if (obj instanceof SubLCons)
      {
        if (first().equalp(((SubLCons)obj).first()) && rest().equalp(((SubLCons)obj).rest()))
          return true;
      }
    return false;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#length()
	 */
  @Override
  public final int cl_length()
  {
    int length = 1;
    SubLObject obj = rest();
        while (obj != NIL)
          {
            ++length;
            if (obj instanceof SubLCons) {
                obj = ((SubLCons)obj).rest();
            } else  type_error(obj, LispSymbols.LIST);
          }      
    return length;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#NTH(int)
	 */
  @Override
  public SubLObject NTH(int index)
  {
    if (index < 0)
      type_error(LispObjectFactory.makeInteger(index), LispSymbols.UNSIGNED_BYTE);
    int i = 0;
    SubLObject obj = this;
    while (true)
      {
        if (i == index)
          return obj.first();
        obj = obj.rest();
        if (obj == NIL)
          return NIL;
        ++i;
      }
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#NTH(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public SubLObject NTH(SubLObject arg)
  {
    int index;
    if (arg instanceof Fixnum)
      {
        index = ((Fixnum)arg).value;
      }
    else
        {
        if (arg instanceof Bignum)
          {
            // FIXME (when machines have enough memory for it to matter)
            if (arg.isNegative())
              return type_error(arg, LispSymbols.UNSIGNED_BYTE);
            return NIL;
          }
        return type_error(arg, LispSymbols.UNSIGNED_BYTE);
      }
    if (index < 0)
      type_error(arg, LispSymbols.UNSIGNED_BYTE);
    int i = 0;
    SubLObject obj = this;
    while (true)
      {
        if (i == index)
          return obj.first();
        obj = obj.rest();
        if (obj == NIL)
          return NIL;
        ++i;
      }
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#elt(int)
	 */
  @Override
  public SubLObject elt(int index)
  {
    if (index < 0)
      type_error(LispObjectFactory.makeInteger(index), LispSymbols.UNSIGNED_BYTE);
    int i = 0;
    SubLCons cons = this;
    while (true)
      {
        if (i == index)
          return cons.first();
        SubLObject conscdr = cons.rest();
        if (conscdr instanceof SubLCons)
          {
            cons = (SubLCons) conscdr;
          }
        else
          {
            if (conscdr == NIL)
              {
                // Index too large.
                type_error(LispObjectFactory.makeInteger(index),
                                list(LispSymbols.INTEGER, Fixnum.ZERO,
                                      LispObjectFactory.makeInteger(cl_length() - 1)));
              }
            else
              {
                // Dotted list.
                type_error(conscdr, LispSymbols.LIST);
              }
            // Not reached.
            return NIL;
          }
        ++i;
      }
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#reverse()
	 */
  @Override
  public SubLObject reverse()
  {
    SubLCons cons = this;
    SubLObject result = makeCons(cons.first());
    while (cons.rest() instanceof SubLCons)
      {
        cons = (SubLCons) cons.rest();
        result = makeCons(cons.first(), result);
      }
    if (cons.rest() != NIL)
      return type_error(cons.rest(), LispSymbols.LIST);
    return result;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#nreverse()
	 */
  @Override
  public final SubLObject nreverse()
  {
    if (rest() instanceof SubLCons)
      {
        SubLCons cons = (SubLCons) rest();
        if (cons.rest() instanceof SubLCons)
          {
            SubLCons cons1 = cons;
            SubLObject list = NIL;
            do
              {
                SubLCons temp = (SubLCons) cons.rest();
                cons.setCdr(list);
                list = cons;
                cons = temp;
              }
            while (cons.rest() instanceof SubLCons);
            if (cons.rest() != NIL)
              return type_error(cons.rest(), LispSymbols.LIST);
            setCdr(list);
            cons1.setCdr(cons);
          }
        else if (cons.rest() != NIL)
          return type_error(cons.rest(), LispSymbols.LIST);
        SubLObject temp = first();
        setCar(cons.first());
        cons.setCar(temp);
      }
    else if (rest() != NIL)
      return type_error(rest(), LispSymbols.LIST);
    return this;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#isList()
	 */
  @Override
  public boolean isList()
  {
    return true;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#endp()
	 */
  @Override
  public final boolean endp()
  {
    return false;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#copyToArray()
	 */
  @Override
  public final SubLObject[] copyToArray()
  {
    final int length = cl_length();
    SubLObject[] array = makeLispObjectArray(length);
    SubLObject rest = this;
    for (int i = 0; i < length; i++)
      {
        array[i] = rest.first();
        rest = rest.rest();
      }
    return array;
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute()
	 */
  @Override
  public SubLObject execute()
  {
    if (first() == LispSymbols.LAMBDA)
      {
        Closure closure = new Closure(this, new Environment());
        return closure.execute();
      }
    return signalExecutionError();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public SubLObject execute(SubLObject arg)
  {
    if (first() == LispSymbols.LAMBDA)
      {
        Closure closure = new Closure(this, new Environment());
        return closure.execute(arg);
      }
    return signalExecutionError();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public SubLObject execute(SubLObject first, SubLObject second)

  {
    if (first() == LispSymbols.LAMBDA)
      {
        Closure closure = new Closure(this, new Environment());
        return closure.execute(first, second);
      }
    return signalExecutionError();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third)

  {
    if (first() == LispSymbols.LAMBDA)
      {
        Closure closure = new Closure(this, new Environment());
        return closure.execute(first, second, third);
      }
    return signalExecutionError();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth)

  {
    if (first() == LispSymbols.LAMBDA)
      {
        Closure closure = new Closure(this, new Environment());
        return closure.execute(first, second, third, fourth);
      }
    return signalExecutionError();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth)

  {
    if (first() == LispSymbols.LAMBDA)
      {
        Closure closure = new Closure(this, new Environment());
        return closure.execute(first, second, third, fourth, fifth);
      }
    return signalExecutionError();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth)

  {
    if (first() == LispSymbols.LAMBDA)
      {
        Closure closure = new Closure(this, new Environment());
        return closure.execute(first, second, third, fourth, fifth, sixth);
      }
    return signalExecutionError();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth,
                            SubLObject seventh)

  {
    if (first() == LispSymbols.LAMBDA)
      {
        Closure closure = new Closure(this, new Environment());
        return closure.execute(first, second, third, fourth, fifth, sixth,
                               seventh);
      }
    return signalExecutionError();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject, com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
  @Override
  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth,
                            SubLObject seventh, SubLObject eighth)

  {
    if (first() == LispSymbols.LAMBDA)
      {
        Closure closure = new Closure(this, new Environment());
        return closure.execute(first, second, third, fourth, fifth, sixth,
                               seventh, eighth);
      }
    return signalExecutionError();
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#execute(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject[])
	 */
  @Override
  public SubLObject execute(SubLObject[] args)
  {
    if (first() == LispSymbols.LAMBDA)
      {
        Closure closure = new Closure(this, new Environment());
        return closure.execute(args);
      }
    return signalExecutionError();
  }

  private final SubLObject signalExecutionError()
  {
    return type_error(this, list(LispSymbols.OR, LispSymbols.FUNCTION,
                                       LispSymbols.SYMBOL));
  }
  
  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#toString()
	 */
  @Override
  public String toString() {
  	try {
  	return writeToString();
  	} catch (Throwable e) {
    	return super.toString();
		}
  }

  /* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#writeToString()
	 */
  @Override
  public String writeToString()
  {
    final LispThread thread = LispThread.currentThread();
    final SubLObject printLength = LispSymbols.PRINT_LENGTH.symbolValue(thread);
    final int maxLength;
    if (printLength instanceof Fixnum)
      maxLength = ((Fixnum)printLength).value;
    else
      maxLength = Integer.MAX_VALUE;
    final SubLObject printLevel = LispSymbols.PRINT_LEVEL.symbolValue(thread);
    final int maxLevel;
    if (printLevel instanceof Fixnum)
      maxLevel = ((Fixnum)printLevel).value;
    else
      maxLevel = Integer.MAX_VALUE;
    StringBuilder sb = new StringBuilder();
    if (first() == LispSymbols.QUOTE)
      {
        if (rest() instanceof SubLCons)
          {
            // Not a dotted list.
            if (rest().rest() == NIL)
              {
                sb.append('\'');
                sb.append(rest().first().writeToString());
                return sb.toString();
              }
          }
      }
    if (first() == LispSymbols.FUNCTION)
      {
        if (rest() instanceof SubLCons)
          {
            // Not a dotted list.
            if (rest().rest() == NIL)
              {
                sb.append("#'");
                sb.append(rest().first().writeToString());
                return sb.toString();
              }
          }
      }
    SubLObject currentPrintLevel =
      _CURRENT_PRINT_LEVEL_.symbolValue(thread);
    int currentLevel = currentPrintLevel.intValue();
    if (currentLevel < maxLevel)
      {
        final SpecialBindingsMark mark = thread.markSpecialBindings();
        thread.bindSpecial(_CURRENT_PRINT_LEVEL_, currentPrintLevel.inc());
        try
          {
            int count = 0;
            boolean truncated = false;
            sb.append('(');
            if (count < maxLength)
              {
                SubLObject p = this;
                sb.append(p.first().writeToString());
                ++count;
                while ((p = p.rest()) instanceof SubLCons)
                  {
                    sb.append(' ');
                    if (count < maxLength)
                      {
                        sb.append(p.first().writeToString());
                        ++count;
                      }
                    else
                      {
                        truncated = true;
                        break;
                      }
                  }
                if (!truncated && p != NIL)
                  {
                    sb.append(" . ");
                    sb.append(p.writeToString());
                  }
              }
            else
              truncated = true;
            if (truncated)
              sb.append("...");
            sb.append(')');
          }
        finally
          {
            thread.resetSpecialBindings(mark);
          }
      }
    else
      sb.append('#');
    return sb.toString();
  }

  // Statistics for TIME.
  private static long count;

  /*package*/ static long getCount()
  {
    return count;
  }

  /*package*/ static void setCount(long n)
  {
    count = n;
  }

	/* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#setCar(com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObject)
	 */
	public void setCar(SubLObject car) {
		this.car = car;
	}

	/* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SubLCons#first()
	 */
	public SubLObject first() {
		return car;
	}
}

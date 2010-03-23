/*
 * LispObject.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: LispObject.java 12541 2010-03-15 10:57:44Z mevenson $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

import java.math.BigInteger;
import java.util.List;
import java.util.WeakHashMap;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractLispObject extends SubLInchworm implements SubLObject
{
	
	@Override
	public String toString() {
		return super.toString();
	}

	//SubLObject
	public BigInteger bigIntegerValue() {
		return type_error(this,LispSymbols.BIGNUM).bigIntegerValue();
	}
	
	public int hashCode() {
		return hashCodeLisp();
	}
	
	public int hashCodeLisp() {
		return superHash();
	}

  public int superHash() {
		return super.hashCode();
	}

	//	final static  public Object getValue() throws Throwable {
//		Thread.dumpStack();
//		return null;
//}
//	 final public Object getValue(LispObject a) throws Throwable {
//		Thread.dumpStack();
//		return null;
//}
	public SubLObject car() {
		return first();
	}
	public SubLObject cdr() {
		return rest();
	}
	
	public boolean isKeyword() {
		return false;
	}
	public boolean isSymbol() {
		return false;
	}
	
  public AbstractLispObject() {
  }

  /** Function to allow objects to return the value
   * "they stand for". Used by AutoloadedFunctionProxy to return
   * the function it is proxying.
   */
  public SubLObject resolve()
  {
    return this;
  }

  public SubLObject typeOf()
  {
    return T;
  }

  public SubLObject classOf()
  {
    return BuiltInClass.CLASS_T;
  }

  public SubLObject getDescription()
  {
    StringBuilder sb = new StringBuilder("An object of type ");
    sb.append(typeOf().writeToString());
    sb.append(" at #x");
    sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
    return makeString(sb);
  }

  /** 
   *  Implementing the getParts() protocol will allow INSPECT to
   *  return information about the substructure of a descendent of
   *  LispObject.
   *  
   *  The protocol is to return a List of Cons pairs, where the car of
   *  each pair contains a decriptive string, and the cdr returns a
   *  subobject for inspection.
   */
  public SubLObject getParts()
  {
    return NIL;
  }

  public boolean getBooleanValue()
  {
    return true;
  }

  public SubLObject typep(SubLObject typeSpecifier)
  {
    if (typeSpecifier == T)
      return T;
    if (typeSpecifier == BuiltInClass.CLASS_T)
      return T;
    if (typeSpecifier == LispSymbols.ATOM)
      return T;
    return NIL;
  }

  public boolean constantp()
  {
    return true;
  }

  public final SubLObject CONSTANTP()
  {
    return constantp() ? T : NIL;
  }

  public final SubLObject ATOM()
  {
    return isAtom() ? T : NIL;
  }

  public boolean isAtom()
  {
    return true;
  }

  public Object javaInstance()
  {
        return this;
  }

  public <T> Object javaInstance(Class<T> c)
  {
      if (c.isAssignableFrom(getClass()))
	  return this;
      return error(new LispError("The value " + writeToString() +
				 " is not of class " + c.getName()));
  }

  /** This method returns 'this' by default, but allows
   * objects to return different values to increase Java
   * interoperability
   * 
   * @return An object to be used with synchronized, wait, notify, etc
   */
  public Object lockableInstance()
  {
      return this;
  }


  public SubLObject first()
  {
//  	if (this instanceof Nil) {
//      return NIL;
//    }
    return toList().first();
  }

  public void setCar(SubLObject obj)
  {
      if (this instanceof SubLCons) {
          ((SubLCons)this).setFirst(obj);
          return;
      }
    type_error(this, LispSymbols.CONS);
  }

  public SubLCons setFirst(SubLObject obj)
  {
    return type_error(this, LispSymbols.CONS).setFirst(obj);
  }

  public SubLObject rest()
  {
//  	if (this instanceof Nil) {
//      return this;
//    }
    return toList().rest();
  }

  public void setCdr(SubLObject obj)
  {
    type_error(this, LispSymbols.CONS).setCdr(obj);
  }

  public SubLCons setRest(SubLObject obj)
  {
    return type_error(this, LispSymbols.CONS).setRest(obj);
  }

  public SubLObject second()
  {
    return toList().get(1);
  }

  public SubLObject cddr()
  {
    return toList().cddr();
  }

  public SubLObject third()
  {
    return toList().get(2);
  }

  public SubLObject nthCdr(int n)
  {
    if (n < 0)
      n = type_error(LispObjectFactory.makeInteger(n),
                             list(LispSymbols.INTEGER, Fixnum.ZERO)).intValue();
    return toList().nthCdr(n);
  }

  public SubLCons push(SubLObject obj)
  {
    if (this instanceof SubLCons) {
      return makeCons(obj, this);
    } else if (this instanceof Nil) {
      return makeCons(obj);
    }
    return toList().push(obj);
  }

  final public SubLObject EQ(SubLObject obj)
  {
    return this == obj ? T : NIL;
  }

  public boolean eql(char c)
  {
    return false;
  }

  public boolean eql(int n)
  {
    return false;
  }

  public boolean eql(SubLObject obj)
  {
    return this == obj;
  }

  public final SubLObject EQL(SubLObject obj)
  {
    return eql(obj) ? T : NIL;
  }

  public final SubLObject EQUAL(SubLObject obj)
  {
    return equal(obj) ? T : NIL;
  }

  public final SubLObject EQUALP(SubLObject obj)
  {
    return equalp(obj) ? T : NIL;
  }

  public boolean equal(int n)
  {
    return false;
  }

  public boolean equal(SubLObject obj)
  {
    return this == obj;
  }

  public boolean equalp(int n)
  {
    return false;
  }

  public boolean equalp(SubLObject obj)
  {
    return this == obj;
  }

  public SubLObject ABS()
  {
    return toNumber().ABS();
  }

  public SubLObject NUMERATOR()
  {
    return type_error(this, LispSymbols.RATIONAL).NUMERATOR();
  }

  public SubLObject DENOMINATOR()
  {
    return type_error(this, LispSymbols.RATIONAL).DENOMINATOR();
  }

  public final SubLObject EVENP()
  {
    return isEven() ? T : NIL;
  }

  public boolean isEven()
  {
    return checkInteger(this).isEven();
  }

  public final SubLObject ODDP()
  {
    return isOdd() ? T : NIL;
  }

  public boolean isOdd()
  {
    return checkInteger(this).isOdd();
  }

  public final SubLObject PLUSP()
  {
    return isPositive() ? T : NIL;
  }

  public boolean isPositive()
  {
    type_error(this, LispSymbols.REAL);
    // Not reached.
    return false;
  }

  public final SubLObject MINUSP()
  {
    return isNegative() ? T : NIL;
  }

  public boolean isNegative()
  {
    type_error(this, LispSymbols.REAL);
    // Not reached.
    return false;
  }

  public final SubLObject NUMBERP()
  {
    return isNumber() ? T : NIL;
  }

  public boolean isNumber()
  {
    return false;
  }

  public final SubLObject ZEROP()
  {
    return isZero() ? T : NIL;
  }

  public boolean isZero()
  {
    return toNumber().isZero();
  }

  public SubLObject COMPLEXP()
  {
    return NIL;
  }

  public final SubLObject FLOATP()
  {
    return isDouble() ? T : NIL;
  }

  public boolean isDouble()
  {
    return false;
  }

  public final SubLObject INTEGERP()
  {
    return isInteger() ? T : NIL;
  }

  public boolean isInteger()
  {
    return false;
  }

  public final SubLObject RATIONALP()
  {
    return rationalp() ? T : NIL;
  }

  public boolean rationalp()
  {
    return false;
  }

  public final SubLObject REALP()
  {
    return realp() ? T : NIL;
  }

  public boolean realp()
  {
    return false;
  }

  public final SubLObject STRINGP()
  {
    return isString() ? T : NIL;
  }

  public boolean isString()
  {
    return false;
  }

  public SubLObject SIMPLE_STRING_P()
  {
    return NIL;
  }

  public final SubLObject VECTORP()
  {
    return isVector() ? T : NIL;
  }

  public boolean isVector()
  {
    return false;
  }

  public final SubLObject CHARACTERP()
  {
    return isCharacter() ? T : NIL;
  }

  public char charValue() {
  	type_error(this, LispSymbols.CHARACTER);
		return 0;
	}
  
  public boolean isCharacter()
  {
    return false;
  }
  
  @Override
  public SubLObject get(int index) {
  	// TODO Auto-generated method stub
  	return elt(index);
  }

  public int cl_length()
  {
  	if (this instanceof SubLSequence) return size();
    return toSeq().cl_length();
  }

	public final SubLObject LENGTH()
  {
    return LispObjectFactory.makeInteger(cl_length());
  }

  public SubLObject CHAR(int index)
  {
    return type_error(this, LispSymbols.STRING);
  }

  public SubLObject SCHAR(int index)
  {
    return type_error(this, LispSymbols.SIMPLE_STRING);
  }

  public SubLObject NTH(int index)
  {
    return toList().NTH(index);
  }

  public SubLObject NTH(SubLObject arg)
  {
    return toList().NTH(arg);
  }

  public SubLObject elt(int index)
  {
    return toSeq().elt(index);
  }

  public SubLObject reverse()
  {
    return toSeq().reverse();
  }

  public SubLObject nreverse()
  {
    return toSeq().nreverse();
  }

  public SubLSequence toSeq() {
		return (LispSequence) type_error(this, LispSymbols.SEQUENCE).toSeq();
	}
  
  public long aref_long(int index)
  {
    return AREF(index).longValue();
  }

  public int aref(int index)
  {
    return AREF(index).intValue();
  }

  public SubLObject AREF(int index)
  {
    return type_error(this, LispSymbols.ARRAY).AREF(index);
  }

  public SubLObject AREF(SubLObject index)
  {
      return AREF(index.intValue());
  }

  public void aset(int index, int n)

  {    
          aset(index, LispObjectFactory.makeInteger(n));
  }

  public void aset(int index, SubLObject newValue)

  {
    type_error(this, LispSymbols.ARRAY).aset(index, newValue);
  }

  public void aset(SubLObject index, SubLObject newValue)

  {
      aset(index.intValue(), newValue);
  }

  public SubLObject SVREF(int index)
  {
    return type_error(this, LispSymbols.SIMPLE_VECTOR).SVREF(index);
  }

  public void svset(int index, SubLObject newValue)
  {
    type_error(this, LispSymbols.SIMPLE_VECTOR).svset(index, newValue);
  }

  public void vectorPushExtend(SubLObject element)

  {
    noFillPointer().vectorPushExtend(element);
  }

  public SubLObject VECTOR_PUSH_EXTEND(SubLObject element)

  {
    return noFillPointer().VECTOR_PUSH_EXTEND(element);
  }

  public SubLObject VECTOR_PUSH_EXTEND(SubLObject element, SubLObject extension)

  {
    return noFillPointer().VECTOR_PUSH_EXTEND(element,extension);
  }

  public final SubLObject noFillPointer()
  {
    return type_error(this, list(LispSymbols.AND, LispSymbols.VECTOR,
                                       list(LispSymbols.SATISFIES,
                                             LispSymbols.ARRAY_HAS_FILL_POINTER_P))).noFillPointer();
  }

  public SubLObject[] copyToArray()
  {
    return toList().copyToArray();
  }

  public SubLObject SYMBOLP()
  {
    return NIL;
  }

  public boolean isList()
  {
    return false;
  }

  public final SubLObject LISTP()
  {
    return isList() ? T : NIL;
  }

  public boolean endp()
  {
    return toList().endp();
  }

	public final SubLObject ENDP()
  {
    return endp() ? T : NIL;
  }

  public SubLObject NOT()
  {
    return NIL;
  }

  public boolean isSpecialOperator()
  {
    return toSymbol().isSpecialOperator();
  }

  public boolean isSpecialVariable()
  {
    return false;
  }

  public SubLObject getDocumentation(SubLObject docType)

  {
    SubLObject alist;
    synchronized (documentationHashTable) {
      alist = documentationHashTable.get(this);
    }
    if (alist != null)
      {
        SubLObject entry = assq(docType, alist);
        if (entry instanceof SubLCons)
          return ((SubLCons)entry).rest();
      }
    return NIL;
  }

  public void setDocumentation(SubLObject docType, SubLObject documentation)

  {
    synchronized (documentationHashTable) {
      SubLObject alist = documentationHashTable.get(this);
      if (alist == null)
        alist = NIL;
      SubLObject entry = assq(docType, alist);
      if (entry instanceof SubLCons)
        {
          ((SubLCons)entry).setCdr(documentation);
        }
      else
        {
          alist = alist.push(makeCons(docType, documentation));
          documentationHashTable.put(this, alist);
        }
    }
  }

  public SubLObject getPropertyList()
  {
  //	Thread.dumpStack();
  	//Debug.trace("getPropertyList " + writeToString());
    return null;
  }

  public void setPropertyList(SubLObject obj)
  {
  }

  public SubLObject getSymbolValue()
  {
    return toSymbol().getSymbolValue();
  }

  public SubLObject getSymbolFunction()
  {
    return toSymbol().getSymbolFunction();
  }

  public SubLObject getSymbolFunctionOrDie()
  {
    return toSymbol().getSymbolFunctionOrDie();
  }

	public abstract String writeToString();

  public String unreadableString(String s) {
     return unreadableString(s, true);
  }
  public String unreadableString(SubLSymbol sym) {
     return unreadableString(sym, true);
  }

  public String unreadableString(String s, boolean identity)
  {
    StringBuilder sb = new StringBuilder("#<");
    sb.append(s);
    if (identity) {
      sb.append(" {");
      sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
      sb.append("}");
    }
    sb.append(">");
    return sb.toString();
  }

  public String unreadableString(SubLSymbol symbol, boolean identity) 

  {
    return unreadableString(symbol.writeToString(), identity);
  }

  // Special operator
  public SubLObject execute(SubLObject args, Environment env)

  {
    return error(new LispError("not an Operator " + writeToString()));
  }

  
  
  public SubLObject execute()
  {
    return toSubLFunction().execute();
  }

  public SubLObject toSubLFunction() {
		return type_error(this, LispSymbols.FUNCTION).toSubLFunction();
	}

	public SubLObject execute(SubLObject arg)
  {
    return toSubLFunction().execute(arg);
  }

  public SubLObject execute(SubLObject first, SubLObject second)

  {
    return toSubLFunction().execute(first, second);
  }

  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third)

  {
    return toSubLFunction().execute(first, second, third);
  }

  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth)

  {
    return toSubLFunction().execute(first, second, third, fourth);
  }

  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth)

  {
    return toSubLFunction().execute(first, second, third, fourth,
        fifth);
  }

  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth)

  {
    return toSubLFunction().execute(first, second, third, fourth,
        fifth, sixth);
  }

  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth,
                            SubLObject seventh)

  {
    return toSubLFunction().execute(first, second, third, fourth,
        fifth, sixth, seventh);
  }

  public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth,
                            SubLObject seventh, SubLObject eighth)

  {
    return toSubLFunction().execute(first, second, third, fourth,
        fifth, sixth, seventh, eighth);
  }

  public SubLObject execute(SubLObject[] args)
  {
    return toSubLFunction().execute(args);
  }

  // Used by COMPILE-MULTIPLE-VALUE-CALL.
  public SubLObject dispatch(SubLObject[] args)
  {
    switch (args.length)
      {
      case 0:
        return execute();
      case 1:
        return execute(args[0]);
      case 2:
        return execute(args[0], args[1]);
      case 3:
        return execute(args[0], args[1], args[2]);
      case 4:
        return execute(args[0], args[1], args[2], args[3]);
      case 5:
        return execute(args[0], args[1], args[2], args[3], args[4]);
      case 6:
        return execute(args[0], args[1], args[2], args[3], args[4],
                       args[5]);
      case 7:
        return execute(args[0], args[1], args[2], args[3], args[4],
                       args[5], args[6]);
      case 8:
        return execute(args[0], args[1], args[2], args[3], args[4],
                       args[5], args[6], args[7]);
      default:
        return execute(args);
      }
  }

  public int intValue()
  {
    return checkInteger(this).intValue();
  }

  public long longValue()
  {
    return checkInteger(this).longValue();
  }

  public float floatValue()
  {
    return type_error(this, LispSymbols.SINGLE_FLOAT).floatValue();
  }

  public double doubleValue()
  {
    return type_error(this, LispSymbols.DOUBLE_FLOAT).doubleValue();
  }

  public SubLObject inc()
  {
    return toNumber().inc();
  }

  public SubLObject dec()
  {
    return toNumber().dec();
  }

  public SubLObject negate()
  {
    return Fixnum.ZERO.sub(this);
  }

  public SubLObject add(int n)
  {
    return add(LispObjectFactory.makeInteger(n));
  }

  public SubLObject add(SubLObject obj)
  {
    return toNumber().add(obj);
  }

  public SubLObject subtract(int n)
  {
    return sub(LispObjectFactory.makeInteger(n));
  }

  public SubLObject sub(SubLObject obj)
  {
    return toNumber().sub(obj);
  }

  public SubLObject multiplyBy(int n)
  {
    return mult(LispObjectFactory.makeInteger(n));
  }

  public SubLObject mult(SubLObject obj)
  {
    return toNumber().mult(obj);
  }

  public SubLObject divideBy(SubLObject obj)
  {
    return toNumber().divideBy(obj);
  }

  public boolean isEqualTo(int n)
  {
    return numE(LispObjectFactory.makeInteger(n));
  }

  public boolean numE(SubLObject obj)
  {
    return toNumber().numE(obj);
  }

  public final SubLObject IS_E(SubLObject obj)
  {
    return numE(obj) ? T : NIL;
  }

  public boolean isNotEqualTo(int n)
  {
    return isNotEqualTo(LispObjectFactory.makeInteger(n));
  }

  public boolean isNotEqualTo(SubLObject obj)
  {
    return toNumber().isNotEqualTo(obj);
  }

  public SubLNumber toNumber() {
		 return (SubLNumber)(Object)type_error(this, LispSymbols.NUMBER);		
	}

	public final SubLObject IS_NE(SubLObject obj)
  {
    return isNotEqualTo(obj) ? T : NIL;
  }

  public boolean isLessThan(int n)
  {
    return numL(LispObjectFactory.makeInteger(n));
  }

  public boolean numL(SubLObject obj)
  {
    type_error(this, LispSymbols.REAL);
    // Not reached.
    return false;
  }

  public final SubLObject IS_LT(SubLObject obj)
  {
    return numL(obj) ? T : NIL;
  }

  public boolean isGreaterThan(int n)
  {
    return numG(LispObjectFactory.makeInteger(n));
  }

  public boolean numG(SubLObject obj)
  {
    type_error(this, LispSymbols.REAL);
    // Not reached.
    return false;
  }

  public final SubLObject IS_GT(SubLObject obj)
  {
    return numG(obj) ? T : NIL;
  }

  public boolean isLessThanOrEqualTo(int n)
  {
    return numLE(LispObjectFactory.makeInteger(n));
  }

  public boolean numLE(SubLObject obj)
  {
    type_error(this, LispSymbols.REAL);
    // Not reached.
    return false;
  }

  public final SubLObject IS_LE(SubLObject obj)
  {
    return numLE(obj) ? T : NIL;
  }

  public boolean isGreaterThanOrEqualTo(int n)
  {
    return numGE(LispObjectFactory.makeInteger(n));
  }

  public boolean numGE(SubLObject obj)
  {
    type_error(this, LispSymbols.REAL);
    // Not reached.
    return false;
  }

  public final SubLObject IS_GE(SubLObject obj)
  {
    return numGE(obj) ? T : NIL;
  }

  public SubLObject truncate(SubLObject obj)
  {
    return type_error(this, LispSymbols.REAL);
  }

  public SubLObject MOD(SubLObject divisor)
  {
    truncate(divisor);
    final LispThread thread = LispThread.currentThread();
    SubLObject remainder = thread._values[1];
    thread.clearValues();
    if (!remainder.isZero())
      {
        if (divisor.isNegative())
          {
            if (isPositive())
              return remainder.add(divisor);
          }
        else
          {
            if (isNegative())
              return remainder.add(divisor);
          }
      }
    return remainder;
  }

  public SubLObject MOD(int divisor)
  {
    return MOD(LispObjectFactory.makeInteger(divisor));
  }

  public SubLObject ash(int shift)
  {
    return ash(LispObjectFactory.makeInteger(shift));
  }

  public SubLObject ash(SubLObject obj)
  {
    return checkInteger(this).ash(obj);
  }

  public SubLObject LOGNOT()
  {
    return checkInteger(this).LOGNOT();
  }

  public SubLObject LOGAND(int n)
  {
    return LOGAND(LispObjectFactory.makeInteger(n));
  }

  public SubLObject LOGAND(SubLObject obj)
  {
    return checkInteger(this).LOGAND(obj);
  }

  public SubLObject LOGIOR(int n)
  {
    return LOGIOR(LispObjectFactory.makeInteger(n));
  }

  public SubLObject LOGIOR(SubLObject obj)
  {
    return Lisp.checkInteger(this);
  }

  public SubLObject LOGXOR(int n)
  {
    return LOGXOR(LispObjectFactory.makeInteger(n));
  }

  public SubLObject LOGXOR(SubLObject obj)
  {
    return checkInteger(this).LOGXOR(obj);
  }

  public SubLObject LDB(int size, int position)
  {
    return checkInteger(this).LDB(size, position);
  }

  public int sxhash()
  {
    return hashCodeLisp() & 0x7fffffff;
  }

  // For EQUALP hash tables.
  public int psxhash()
  {
    return sxhash();
  }

  public int psxhash(int depth)
  {
    return psxhash();
  }

  public SubLObject STRING()
  {
    return error(new TypeError(writeToString() + " cannot be coerced to a string."));
  }

  public char[] chars()
  {
    return checkString(this).chars();
  }

  public char[] getStringChars()
  {
    return checkString(this).getStringChars();
  }

  /** Returns a string representing the value
   * of a 'string designator', if the instance is one.
   *
   * Throws an error if the instance isn't a string designator.
   */
  public String getString()
  {
    return checkString(this).getString();
  }

  public SubLObject getSlotValue_0()
  {
    return getSlotValue(0);
  }

  public SubLObject getSlotValue_1()
  {
    return getSlotValue(1);
  }

  public SubLObject getSlotValue_2()
  {
    return getSlotValue(2);
  }

  public SubLObject getSlotValue_3()
  {
    return getSlotValue(3);
  }

  public SubLObject getSlotValue(int index)
  {
    return type_error(this, LispSymbols.STRUCTURE_OBJECT);
  }

  public int getFixnumSlotValue(int index)
  {
    return getSlotValue(index).intValue();
  }

  public boolean getSlotValueAsBoolean(int index)
  {
    return getSlotValue(index).getBooleanValue();
  }

  public void setSlotValue_0(SubLObject value)

  {
    setSlotValue(0, value);
  }

  public void setSlotValue_1(SubLObject value)

  {
    setSlotValue(1, value);
  }

  public void setSlotValue_2(SubLObject value)

  {
    setSlotValue(2, value);
  }

  public void setSlotValue_3(SubLObject value)

  {
    setSlotValue(3, value);
  }

  public void setSlotValue(int index, SubLObject value)

  {
    type_error(this, LispSymbols.STRUCTURE_OBJECT);
  }

  public SubLObject SLOT_VALUE(SubLObject slotName)
  {
    return type_error(this, LispSymbols.STANDARD_OBJECT);
  }

  public void setSlotValue(SubLObject slotName, SubLObject newValue)

  {
    type_error(this, LispSymbols.STANDARD_OBJECT);
  }
  
  public SubLSymbol toSymbol() {
  	if (this instanceof SubLSymbol) return (SubLSymbol)this;  
		return type_error(this, LispSymbols.SYMBOL).toSymbol();
	}

  public SubLList toList() {
  	if (this instanceof SubLList) return (SubLList)this;  
		return type_error(this, LispSymbols.LIST).toList();
	}


  // Profiling.
  public SubLObject getCallCount()
  {
    return NIL;
  }

  public void setCallCount(int n)
  {
  }

  public void incrementCallCount(int n)
  {
  }

  public int getHotCount()
  {
      return 0;
  }

  public void setHotCount(int n)
  {
  }

  public void incrementHotCount()
  {
  }

	public SubLProcess toProcess() {
		// TODO Auto-generated method stub
		return null;
	}
	public int hashCode(int currentDepth) {
		return psxhash(currentDepth);
	}
	
	@Override
	public SubLCharacter toChar() {
		if (this instanceof SubLCharacter) return (SubLCharacter)this;
		return type_error(this, LispSymbols.CHAR).toChar();
	}
}


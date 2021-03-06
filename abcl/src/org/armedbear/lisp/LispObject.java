/*
 * LispObject.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: LispObject.java 15027 2017-06-01 06:45:36Z mevenson $
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

package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.*;

import java.io.IOException;
import java.util.WeakHashMap;


abstract public class LispObject
  implements ILispObject 
{

	static Object TO_STRING_OBJ;

	@Override
	public String toString() {
		Debug.dumpSt("toString()");
		if (ansi)
			return toStringSimple();
		assertCallerNotUs(0);
		// if (ansi) return super.toString();

		final Object waz = TO_STRING_OBJ;
		if (waz == this) {
			return super.toString();
		} else if (waz == null) {
			TO_STRING_OBJ = this;
		}
		try {
			return printObject();
		} catch (Throwable t) {
			return toStringSimple();
		} finally {
			TO_STRING_OBJ = waz;
		}
	}

	public String toStringSimple() {
		if (ansi)
			return super.toString();
		LispObject parts = getParts();
		if (parts != null && parts != NIL) {
			return parts.princToString();
		}
		return super.toString();
	}

	/**
	 * 
	 */
	public String writeToString() {
		assertCallerNotUs(0);
		return printObject();
	}

	@Override
	final public boolean equals(Object obj) {
		if (obj instanceof Symbol) {
			return ((Symbol) obj).symbolSame(this);
		}
		if (obj instanceof LispObject) {
			return equals((LispObject) obj);
		}
		if (assertCallerNotUs(0)) {
			if (obj instanceof LispObject) {
				type_error(new JavaObject(obj), Symbol.T);
			}
		}
		return super.equals(obj);
	}

	public boolean isNil() {
		return false;
	}

	final public boolean equals(LispObject obj) {
		if (assertCallerNotUs(0)) {				
			type_error(obj, Symbol.SYMBOL);
		}
		assert super.equals(obj) == (this == obj);
		return super.equals(obj);
	}

	/**
	 * 
	 */
	static protected final boolean assertCallerNotUs(int ofset) {
		if (!checkCallers)
			return false;
		final Exception exception = new Exception("assertCallerNotUs");
		final StackTraceElement[] stackTrace = exception.getStackTrace();
		if (stackTrace != null) {
			final int st_length = stackTrace.length;
			if (st_length > 3) {
				int check_ele = 2 + ofset;
				StackTraceElement t = stackTrace[check_ele];
				if(t==null) return false;
				String methodName = t.getMethodName();
				if (methodName == null)
					return false;
				if (methodName.equals("equals")) {
					check_ele++;
					t = stackTrace[check_ele];
					if(t==null) return false;
					methodName = t.getMethodName();
				}
				String className = t.getClassName();

				final boolean startsWith = className.startsWith("org.armedbear.lisp");
				if (startsWith) {
					System.err.println(className + " " + methodName);
					exception.printStackTrace();
					return true;
				}
				// Debug.assertTrue(!startsWith);
			}
		}
		return false;
	}

	// Because super.hashCode() might miss the Object.this.hashCode
	final public int ref_hashCode() {
		return System.identityHashCode(this);
	}

	abstract public int eq_hashCode();

	@Override
	final public int hashCode() {
		assertCallerNotUs(0);
		return eq_hashCode();
	}
	
  /** Function to allow objects to return the value
   * "they stand for". Used by AutoloadedFunctionProxy to return
   * the function it is proxying.
   */
  @Override
public LispObject resolve()
  {
    return this;
  }

  @Override
public LispObject typeOf()
  {
    return T;
  }

  static public LispObject getInstance(boolean b) {
      return b ? T : NIL;
  }

  @Override
public LispObject classOf()
  {
    return BuiltInClass.CLASS_T;
  }

  @Override
public LispObject getDescription()
  {
    StringBuilder sb = new StringBuilder("An object of type ");
    sb.append(typeOf().princToString());
    sb.append(" at #x");
    sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
    return new SimpleString(sb);
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
  @Override
public LispObject getParts()
  {
    return NIL;
  }

  @Override
public boolean getBooleanValue()
  {
    return true;
  }

  @Override
public LispObject typep(LispObject typeSpecifier)
  {
    if (typeSpecifier == T)
      return T;
    if (typeSpecifier == BuiltInClass.CLASS_T)
      return T;
    if (typeSpecifier == Symbol.ATOM)
      return T;
    return NIL;
  }

  @Override
public boolean constantp()
  {
    return true;
  }

  @Override
public final LispObject CONSTANTP()
  {
    return constantp() ? T : NIL;
  }

  @Override
public final LispObject ATOM()
  {
    return atom() ? T : NIL;
  }

  @Override
public boolean atom()
  {
    return true;
  }

  @Override
public Object javaInstance()
  {
        return this;
  }

  @Override
public Object javaInstance(Class<?> c)
  {
    if (c.isAssignableFrom(getClass())) {
      return this;
    }

    if (c == Boolean.class || c == boolean.class)
      return Boolean.TRUE;

    return error(new LispError("The value " + princToString() +
				 " is not of class " + c.getName()));
  }

  /** This method returns 'this' by default, but allows
   * objects to return different values to increase Java
   * interoperability
   * 
   * @return An object to be used with synchronized, wait, notify, etc
   */
  @Override
public Object lockableInstance()
  {
      return this;
  }


  @Override
public final LispObject car()
  {
    if (this instanceof Cons) {
      return ((Cons)this).car;
    } else if (this instanceof Nil) {
      return NIL;
    }
    return type_error(this, Symbol.LIST);
  }

  @Override
public final void setCar(LispObject obj)
  {
      if (this instanceof Cons) {
          ((Cons)this).car = obj;
          return;
      }
    type_error(this, Symbol.CONS);
  }

  @Override
public LispObject RPLACA(LispObject obj)
  {
    return type_error(this, Symbol.CONS);
  }

  @Override
public final LispObject cdr()
  {
    if (this instanceof Cons) {
      return ((Cons)this).cdr;
    } else if (this instanceof Nil) {
      return NIL;
    }
    return type_error(this, Symbol.LIST);
  }

  @Override
public final void setCdr(LispObject obj)
  {
      if (this instanceof Cons) {
          ((Cons)this).cdr = obj;
          return;
      }

    type_error(this, Symbol.CONS);
  }

  @Override
public LispObject RPLACD(LispObject obj)
  {
    return type_error(this, Symbol.CONS);
  }

  @Override
public final LispObject cadr()
  {
    LispObject tail = cdr();
    if (!(tail instanceof Nil)) {
        return tail.car();
    } else 
        return NIL;
  }

  @Override
public final LispObject cddr()
  {
    LispObject tail = cdr();
    if (!(tail instanceof Nil)) {
        return tail.cdr();
    } else 
        return NIL;
  }

  @Override
public final LispObject caddr()
  {
    LispObject tail = cddr();
    if (!(tail instanceof Nil)) {
        return tail.car();
    } else 
        return NIL;
  }

  @Override
public final LispObject nthcdr(int n)
  {
    if (n < 0)
      return type_error(Fixnum.getInstance(n),
                             list(Symbol.INTEGER, Fixnum.ZERO));
    if (this instanceof Cons) {
      LispObject result = this;
      for (int i = n; i-- > 0;) {
          result = result.cdr();
          if (result == NIL)
              break;
      }
      return result;
    } else if (this instanceof Nil) {
      return NIL;
    }
    return type_error(this, Symbol.LIST);
  }

  @Override
public final LispObject push(LispObject obj)
  {
    if (this instanceof Cons) {
      return new Cons(obj, this);
    } else if (this instanceof Nil) {
      return new Cons(obj);
    }
    return type_error(this, Symbol.LIST);
  }

  @Override
final public LispObject EQ(LispObject obj)
  {
    return this == obj ? T : NIL;
  }

  @Override
public boolean eql(char c)
  {
    return false;
  }

  @Override
public boolean eql(int n)
  {
    return false;
  }

  @Override
public boolean eql(LispObject obj)
  {
    return this == obj;
  }

  @Override
public final LispObject EQL(LispObject obj)
  {
    return eql(obj) ? T : NIL;
  }

  @Override
public final LispObject EQUAL(LispObject obj)
  {
    return equal(obj) ? T : NIL;
  }

  @Override
public boolean equal(int n)
  {
    return false;
  }

  @Override
public boolean equal(LispObject obj)
  {
    return this == obj;
  }

  @Override
public boolean equalp(int n)
  {
    return false;
  }

  @Override
public boolean equalp(LispObject obj)
  {
    return this == obj;
  }

  @Override
public LispObject ABS()
  {
    return type_error(this, Symbol.NUMBER);
  }

  @Override
public LispObject NUMERATOR()
  {
    return type_error(this, Symbol.RATIONAL);
  }

  @Override
public LispObject DENOMINATOR()
  {
    return type_error(this, Symbol.RATIONAL);
  }

  @Override
public final LispObject EVENP()
  {
    return evenp() ? T : NIL;
  }

  @Override
public boolean evenp()
  {
    return Lisp.checkInteger( this ).evenp();
  }

  @Override
public final LispObject ODDP()
  {
    return oddp() ? T : NIL;
  }

  @Override
public boolean oddp()
  {
    return Lisp.checkInteger( this ).oddp();
  }

  @Override
public final LispObject PLUSP()
  {
    return plusp() ? T : NIL;
  }

  @Override
public boolean plusp()
  {
    type_error(this, Symbol.REAL);
    // Not reached.
    return false;
  }

  @Override
public final LispObject MINUSP()
  {
    return minusp() ? T : NIL;
  }

  @Override
public boolean minusp()
  {
    type_error(this, Symbol.REAL);
    // Not reached.
    return false;
  }

  @Override
public final LispObject NUMBERP()
  {
    return numberp() ? T : NIL;
  }

  @Override
public boolean numberp()
  {
    return false;
  }

  @Override
public final LispObject ZEROP()
  {
    return zerop() ? T : NIL;
  }

  @Override
public boolean zerop()
  {
    type_error(this, Symbol.NUMBER);
    // Not reached.
    return false;
  }

  @Override
public LispObject COMPLEXP()
  {
    return NIL;
  }

  @Override
public final LispObject FLOATP()
  {
    return floatp() ? T : NIL;
  }

  @Override
public boolean floatp()
  {
    return false;
  }

  @Override
public final LispObject INTEGERP()
  {
    return integerp() ? T : NIL;
  }

  @Override
public boolean integerp()
  {
    return false;
  }

  @Override
public final LispObject RATIONALP()
  {
    return rationalp() ? T : NIL;
  }

  @Override
public boolean rationalp()
  {
    return false;
  }

  @Override
public final LispObject REALP()
  {
    return realp() ? T : NIL;
  }

  @Override
public boolean realp()
  {
    return false;
  }

  @Override
public final LispObject STRINGP()
  {
    return stringp() ? T : NIL;
  }

  @Override
public boolean stringp()
  {
    return false;
  }

  @Override
public LispObject SIMPLE_STRING_P()
  {
    return NIL;
  }

  @Override
public final LispObject VECTORP()
  {
    return vectorp() ? T : NIL;
  }

  @Override
public boolean vectorp()
  {
    return false;
  }

  @Override
public final LispObject CHARACTERP()
  {
    return characterp() ? T : NIL;
  }

  @Override
public boolean characterp()
  {
    return false;
  }
  
	@Override
	public int cl_length() {
		type_error(this, Symbol.SEQUENCE);
		// Not reached.
		return 0;
	}

  @Override
public final LispObject LENGTH()
  {
    return Fixnum.getInstance(cl_length());
  }

  @Override
public LispObject CHAR(int index)
  {
    return type_error(this, Symbol.STRING);
  }

  @Override
public LispObject SCHAR(int index)
  {
    return type_error(this, Symbol.SIMPLE_STRING);
  }

  @Override
public LispObject NTH(int index)
  {
    return type_error(this, Symbol.LIST);
  }

  @Override
public final LispObject NTH(LispObject arg)
  {
    return NTH(Fixnum.getValue(arg));
  }

  @Override
public LispObject elt(int index)
  {
    return type_error(this, Symbol.SEQUENCE);
  }

  @Override
public LispObject reverse()
  {
    return type_error(this, Symbol.SEQUENCE);
  }

  @Override
public LispObject nreverse()
  {
    return type_error(this, Symbol.SEQUENCE);
  }

  @Override
public long aref_long(int index)
  {
    return AREF(index).longValue();
  }

  @Override
public int aref(int index)
  {
    return AREF(index).intValue();
  }

  @Override
public LispObject AREF(int index)
  {
    return type_error(this, Symbol.ARRAY);
  }

  @Override
public final LispObject AREF(LispObject index)
  {
      return AREF(Fixnum.getValue(index));
  }

  @Override
public void aset(int index, int n)

  {    
          aset(index, Fixnum.getInstance(n));
  }

  @Override
public void aset(int index, LispObject newValue)

  {
    type_error(this, Symbol.ARRAY);
  }

  @Override
public final void aset(LispObject index, LispObject newValue)

  {
      aset(Fixnum.getValue(index), newValue);
  }

  @Override
public LispObject SVREF(int index)
  {
    return type_error(this, Symbol.SIMPLE_VECTOR);
  }

  @Override
public void svset(int index, LispObject newValue)
  {
    type_error(this, Symbol.SIMPLE_VECTOR);
  }

  @Override
public void vectorPushExtend(LispObject element)

  {
    noFillPointer();
  }

  @Override
public LispObject VECTOR_PUSH_EXTEND(LispObject element)

  {
    return noFillPointer();
  }

  @Override
public LispObject VECTOR_PUSH_EXTEND(LispObject element, LispObject extension)

  {
    return noFillPointer();
  }

  @Override
public final LispObject noFillPointer()
  {
    return type_error(this, list(Symbol.AND, Symbol.VECTOR,
                                       list(Symbol.SATISFIES,
                                             Symbol.ARRAY_HAS_FILL_POINTER_P)));
  }

  @Override
public LispObject[] copyToArray()
  {
    type_error(this, Symbol.LIST);
    // Not reached.
    return null;
  }

  @Override
public final LispObject SYMBOLP()
  {
    return (this instanceof Symbol) ? T : NIL;
  }

  @Override
public final boolean listp()
  {
    return (this instanceof Cons) || (this instanceof Nil);
  }

  @Override
public final LispObject LISTP()
  {
    return listp() ? T : NIL;
  }


  @Override
public final boolean endp()
  {
    if (this instanceof Cons)
        return false;
    else if (this instanceof Nil)
        return true;
    type_error(this, Symbol.LIST);
    // Not reached.
    return false;
  }

  @Override
public final LispObject ENDP()
  {
    return endp() ? T : NIL;
  }

  @Override
public LispObject NOT()
  {
    return NIL;
  }

  @Override
public boolean isSpecialOperator()
  {
    type_error(this, Symbol.SYMBOL);
    // Not reached.
    return false;
  }

  @Override
public boolean isSpecialVariable()
  {
    return false;
  }

  private static final WeakHashMap<LispObject, LispObject>
      documentationHashTable = new WeakHashMap<LispObject, LispObject>();

  @Override
public LispObject getDocumentation(LispObject docType)

  {
    LispObject alist;
    synchronized (documentationHashTable) {
      alist = documentationHashTable.get(this);
    }
    if (alist != null)
      {
        LispObject entry = assq(docType, alist);
        if (entry instanceof Cons)
          return ((Cons)entry).cdr;
      }
    if(docType == Symbol.FUNCTION && this instanceof Symbol) {
        LispObject fn = ((Symbol)this).getSymbolFunction();
        if(fn instanceof Function) {
            DocString ds = fn.getClass().getAnnotation(DocString.class);
            if(ds != null) {
                String arglist = ds.args();
                String docstring = ds.doc();
                if(arglist.length() != 0)
                    ((Function)fn).setLambdaList(new SimpleString(arglist));
                if(docstring.length() != 0) {
                    SimpleString doc = new SimpleString(docstring);
                    ((Symbol)this).setDocumentation(Symbol.FUNCTION, doc);
                    return doc;
                } else if (fn.typep(Symbol.STANDARD_GENERIC_FUNCTION) != NIL) {
                    return Symbol.SLOT_VALUE.execute(fn, Symbol._DOCUMENTATION);
                }
            }
        }
    }
    return NIL;
  }

  @Override
public void setDocumentation(LispObject docType, LispObject documentation)

  {
    synchronized (documentationHashTable) {
      LispObject alist = documentationHashTable.get(this);
      if (alist == null)
        alist = NIL;
      LispObject entry = assq(docType, alist);
      if (entry instanceof Cons)
        {
          ((Cons)entry).cdr = documentation;
        }
      else
        {
          alist = alist.push(new Cons(docType, documentation));
          documentationHashTable.put(this, alist);
        }
    }
  }

  @Override
public LispObject getPropertyList()
  {
    if (ansi) type_error( this, Symbol.SYMBOL );
    return null;
  }

  @Override
public void setPropertyList(LispObject obj)
  {
    if (ansi) type_error( this, Symbol.SYMBOL );
  }

  @Override
public LispObject getSymbolValue()
  {
    return type_error(this, Symbol.SYMBOL);
  }

  @Override
public LispObject getSymbolFunction()
  {
    return type_error(this, Symbol.SYMBOL);
  }

  @Override
public LispObject getSymbolFunctionOrDie()
  {
    return type_error(this, Symbol.SYMBOL);
  }

  @Override
public LispObject getSymbolSetfFunction()
  {
    return type_error(this, Symbol.SYMBOL);
  }

  @Override
public LispObject getSymbolSetfFunctionOrDie()
  {
    return type_error(this, Symbol.SYMBOL);
  }

  /** PRINC-TO-STRING function to be used with Java objects
   * 
   * @return A string in human-readable format, as per PRINC definition
   */
  @Override
public String princToString()
  {
      LispThread thread = LispThread.currentThread();
      SpecialBindingsMark mark = thread.markSpecialBindings();
      try {
          thread.bindSpecial(Symbol.PRINT_READABLY, NIL);
          thread.bindSpecial(Symbol.PRINT_ESCAPE, NIL);
          return printObject();
      }
      finally {
          thread.resetSpecialBindings(mark);
      }
  }

  @Override
public String printObject()
  {
      return unreadableString(toStringSimple(), false);
  }

  /** Calls unreadableString(String s, boolean identity) with a default
   * identity value of 'true'.
   * 
   * This function is a helper for printObject()
   * 
   * @param s String representation of this object.
   * @return String enclosed in the non-readable #< ... > markers
   */
  @Override
public final String unreadableString(String s) {
     return unreadableString(s, true);
  }

  /** Creates a non-readably (as per CLHS terminology) representation
   * of the 'this' object, using string 's'.
   * 
   * If the current value of the variable *PRINT-READABLY* is T, a
   * Lisp error is thrown and no value is returned.
   * 
   * This function is a helper for printObject()
   * 
   * @param s
   * @param identity when 'true', includes Java's identityHash for the object
   *            in the output.
   * @return a non reabable string (i.e. one enclosed in the #< > markers)
   */
  @Override
public final String unreadableString(String s, boolean identity)
  {
    if (Symbol.PRINT_READABLY.symbolValue() != NIL) {
        error(new PrintNotReadable(list(Keyword.OBJECT, this)));
        return null; // not reached
    }
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

  // Special operator
  @Override
public LispObject execute(LispObject args, Environment env)

  {
    return error(new LispError());
  }

  @Override
public LispObject execute()
  {
    return type_error(this, Symbol.FUNCTION);
  }

  @Override
public LispObject execute(LispObject arg)
  {
    return type_error(this, Symbol.FUNCTION);
  }

  @Override
public LispObject execute(LispObject first, LispObject second)

  {
    return type_error(this, Symbol.FUNCTION);
  }

  @Override
public LispObject execute(LispObject first, LispObject second,
                            LispObject third)

  {
    return type_error(this, Symbol.FUNCTION);
  }

  @Override
public LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth)

  {
    return type_error(this, Symbol.FUNCTION);
  }

  @Override
public LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth,
                            LispObject fifth)

  {
    return type_error(this, Symbol.FUNCTION);
  }

  @Override
public LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth,
                            LispObject fifth, LispObject sixth)

  {
    return type_error(this, Symbol.FUNCTION);
  }

  @Override
public LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth,
                            LispObject fifth, LispObject sixth,
                            LispObject seventh)

  {
    return type_error(this, Symbol.FUNCTION);
  }

  @Override
public LispObject execute(LispObject first, LispObject second,
                            LispObject third, LispObject fourth,
                            LispObject fifth, LispObject sixth,
                            LispObject seventh, LispObject eighth)

  {
    return type_error(this, Symbol.FUNCTION);
  }

  @Override
public LispObject execute(LispObject[] args)
  {
    return type_error(this, Symbol.FUNCTION);
  }

  // Used by COMPILE-MULTIPLE-VALUE-CALL.
  @Override
public LispObject dispatch(LispObject[] args)
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

  @Override
public int intValue()
  {
    type_error(this, Symbol.INTEGER);
    // Not reached.
    return 0;
  }

  @Override
public long longValue()
  {
    type_error(this, Symbol.INTEGER);
    // Not reached.
    return 0;
  }

  @Override
public float floatValue()
  {
    type_error(this, Symbol.SINGLE_FLOAT);
    // Not reached
    return 0;
  }

  @Override
public double doubleValue()
  {
    type_error(this, Symbol.DOUBLE_FLOAT);
    // Not reached
    return 0;
  }

  @Override
public LispObject incr()
  {
    return type_error(this, Symbol.NUMBER);
  }

  @Override
public LispObject decr()
  {
    return type_error(this, Symbol.NUMBER);
  }

  @Override
public LispObject negate()
  {
    return Fixnum.ZERO.subtract(this);
  }

  @Override
public LispObject add(int n)
  {
    return add(Fixnum.getInstance(n));
  }

  @Override
public LispObject add(LispObject obj)
  {
    return type_error(this, Symbol.NUMBER);
  }

  @Override
public LispObject subtract(int n)
  {
    return subtract(Fixnum.getInstance(n));
  }

  @Override
public LispObject subtract(LispObject obj)
  {
    return type_error(this, Symbol.NUMBER);
  }

  @Override
public LispObject multiplyBy(int n)
  {
    return multiplyBy(Fixnum.getInstance(n));
  }

  @Override
public LispObject multiplyBy(LispObject obj)
  {
    return type_error(this, Symbol.NUMBER);
  }

  @Override
public LispObject divideBy(LispObject obj)
  {
    return type_error(this, Symbol.NUMBER);
  }

  @Override
public boolean isEqualTo(int n)
  {
    return isEqualTo(Fixnum.getInstance(n));
  }

  @Override
public boolean isEqualTo(LispObject obj)
  {
    type_error(this, Symbol.NUMBER);
    // Not reached.
    return false;
  }

  @Override
public final LispObject IS_E(LispObject obj)
  {
    return isEqualTo(obj) ? T : NIL;
  }

  @Override
public boolean isNotEqualTo(int n)
  {
    return isNotEqualTo(Fixnum.getInstance(n));
  }

  @Override
public boolean isNotEqualTo(LispObject obj)
  {
    type_error(this, Symbol.NUMBER);
    // Not reached.
    return false;
  }

  @Override
public final LispObject IS_NE(LispObject obj)
  {
    return isNotEqualTo(obj) ? T : NIL;
  }

  @Override
public boolean isLessThan(int n)
  {
    return isLessThan(Fixnum.getInstance(n));
  }

  @Override
public boolean isLessThan(LispObject obj)
  {
    type_error(this, Symbol.REAL);
    // Not reached.
    return false;
  }

  @Override
public final LispObject IS_LT(LispObject obj)
  {
    return isLessThan(obj) ? T : NIL;
  }

  @Override
public boolean isGreaterThan(int n)
  {
    return isGreaterThan(Fixnum.getInstance(n));
  }

  @Override
public boolean isGreaterThan(LispObject obj)
  {
    type_error(this, Symbol.REAL);
    // Not reached.
    return false;
  }

  @Override
public final LispObject IS_GT(LispObject obj)
  {
    return isGreaterThan(obj) ? T : NIL;
  }

  @Override
public boolean isLessThanOrEqualTo(int n)
  {
    return isLessThanOrEqualTo(Fixnum.getInstance(n));
  }

  @Override
public boolean isLessThanOrEqualTo(LispObject obj)
  {
    type_error(this, Symbol.REAL);
    // Not reached.
    return false;
  }

  @Override
public final LispObject IS_LE(LispObject obj)
  {
    return isLessThanOrEqualTo(obj) ? T : NIL;
  }

  @Override
public boolean isGreaterThanOrEqualTo(int n)
  {
    return isGreaterThanOrEqualTo(Fixnum.getInstance(n));
  }

  @Override
public boolean isGreaterThanOrEqualTo(LispObject obj)
  {
    type_error(this, Symbol.REAL);
    // Not reached.
    return false;
  }

  @Override
public final LispObject IS_GE(LispObject obj)
  {
    return isGreaterThanOrEqualTo(obj) ? T : NIL;
  }

  @Override
public LispObject truncate(LispObject obj)
  {
    return type_error(this, Symbol.REAL);
  }

  @Override
public LispObject MOD(LispObject divisor)
  {
    truncate(divisor);
    final LispThread thread = LispThread.currentThread();
    LispObject remainder = thread._values[1];
    thread.clearValues();
    if (!remainder.zerop())
      {
        if (divisor.minusp())
          {
            if (plusp())
              return remainder.add(divisor);
          }
        else
          {
            if (minusp())
              return remainder.add(divisor);
          }
      }
    return remainder;
  }

  @Override
public LispObject MOD(int divisor)
  {
    return MOD(Fixnum.getInstance(divisor));
  }

  @Override
public LispObject ash(int shift)
  {
    return ash(Fixnum.getInstance(shift));
  }

  @Override
public LispObject ash(LispObject obj)
  {
    return type_error(this, Symbol.INTEGER);
  }

  @Override
public LispObject LOGNOT()
  {
    return type_error(this, Symbol.INTEGER);
  }

  @Override
public LispObject LOGAND(int n)
  {
    return LOGAND(Fixnum.getInstance(n));
  }

  @Override
public LispObject LOGAND(LispObject obj)
  {
    return type_error(this, Symbol.INTEGER);
  }

  @Override
public LispObject LOGIOR(int n)
  {
    return LOGIOR(Fixnum.getInstance(n));
  }

  @Override
public LispObject LOGIOR(LispObject obj)
  {
    return type_error(this, Symbol.INTEGER);
  }

  @Override
public LispObject LOGXOR(int n)
  {
    return LOGXOR(Fixnum.getInstance(n));
  }

  @Override
public LispObject LOGXOR(LispObject obj)
  {
    return type_error(this, Symbol.INTEGER);
  }

  @Override
public LispObject LDB(int size, int position)
  {
    return type_error(this, Symbol.INTEGER);
  }

  @Override
  public int sxhash()
  {
    return eq_hashCode() & 0x7fffffff;
  }

  // For EQUALP hash tables.
  @Override
public int psxhash()
  {
    return sxhash();
  }

  @Override
public int psxhash(int depth)
  {
    return psxhash();
  }

  @Override
public LispObject STRING()
  {
    return error(new TypeError(princToString() + " cannot be coerced to a string."));
  }

  @Override
public char[] chars()
  {
    type_error(this, Symbol.STRING);
    // Not reached.
    return null;
  }

  @Override
public char[] getStringChars()
  {
    type_error(this, Symbol.STRING);
    // Not reached.
    return null;
  }

  /** Returns a string representing the value
   * of a 'string designator', if the instance is one.
   *
   * Throws an error if the instance isn't a string designator.
   */
  @Override
public String getStringValue()
  {
    type_error(this, Symbol.STRING);
    // Not reached.
    return null;
  }

  @Override
public LispObject getSlotValue_0()
  {
    return type_error(this, Symbol.STRUCTURE_OBJECT);
  }

  @Override
public LispObject getSlotValue_1()
  {
    return type_error(this, Symbol.STRUCTURE_OBJECT);
  }

  @Override
public LispObject getSlotValue_2()
  {
    return type_error(this, Symbol.STRUCTURE_OBJECT);
  }

  @Override
public LispObject getSlotValue_3()
  {
    return type_error(this, Symbol.STRUCTURE_OBJECT);
  }

  @Override
public LispObject getSlotValue(int index)
  {
    return type_error(this, Symbol.STRUCTURE_OBJECT);
  }

  @Override
public int getFixnumSlotValue(int index)
  {
    type_error(this, Symbol.STRUCTURE_OBJECT);
    // Not reached.
    return 0;
  }

  @Override
public boolean getSlotValueAsBoolean(int index)
  {
    type_error(this, Symbol.STRUCTURE_OBJECT);
    // Not reached.
    return false;
  }

  @Override
public void setSlotValue_0(LispObject value)

  {
    type_error(this, Symbol.STRUCTURE_OBJECT);
  }

  @Override
public void setSlotValue_1(LispObject value)

  {
    type_error(this, Symbol.STRUCTURE_OBJECT);
  }

  @Override
public void setSlotValue_2(LispObject value)

  {
    type_error(this, Symbol.STRUCTURE_OBJECT);
  }

  @Override
public void setSlotValue_3(LispObject value)

  {
    type_error(this, Symbol.STRUCTURE_OBJECT);
  }

  @Override
public void setSlotValue(int index, LispObject value)

  {
    type_error(this, Symbol.STRUCTURE_OBJECT);
  }

  @Override
public LispObject SLOT_VALUE(LispObject slotName)
  {
    return type_error(this, Symbol.STANDARD_OBJECT);
  }

  @Override
public void setSlotValue(LispObject slotName, LispObject newValue)

  {
    type_error(this, Symbol.STANDARD_OBJECT);
  }

  // Profiling.
  @Override
public int getCallCount()
  {
    return 0;
  }

  @Override
public void setCallCount(int n)
  {
  }

  @Override
public void incrementCallCount()
  {
  }

  @Override
public int getHotCount()
  {
      return 0;
  }

  @Override
public void setHotCount(int n)
  {
  }

  @Override
public void incrementHotCount()
  {
  }

}

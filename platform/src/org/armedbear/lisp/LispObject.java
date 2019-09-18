/*
 * LispObject.java
 *
 * Copyright (C) 2002-2007 Peter Graves
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

import java.io.IOException;

import org.logicmoo.system.Startup;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

abstract public class LispObject extends AbstractSubLObject {

	final Object $_DEBUG$INFO_$ = new Object() {
		@Override
		public String toString() {
			final Object wasO = Lisp.printingObject;
			Lisp.printingObject = this;
			try {
				return debugInfo();
			} finally {
				Lisp.printingObject = wasO;
			}
		}
	};

	/**
	 * TODO Describe the purpose of this method.
	 * @param includeValue
	 * @return
	 */
	public String toDebugString(boolean includeValue) {
		return debugInfo();
	}

	public String debugInfo() {

		LispObject parts = getParts();
		if (parts == NIL || parts == null) {
			parts = LispObject.this;
		}
		final Symbol pprint = Symbol.PPRINT;

		if (pprint == null || isTooSoon() || pprint.getSymbolFunction() == null) {
			return parts.printObject();
		}
		try {
			final StringOutputStream souts = new StringOutputStream();
			pprint.execute(parts, souts);
			souts.flush();
			final String stringValue = souts.getBufferString().getStringValue();
			return stringValue;
		} catch (Throwable e) {
			return parts.printObject();
		}

	}

	//    public static Package getCurrentPackage() {
	//    	return Lisp.getCurrentPackage();
	//    }

	@Override
	public SubLObject first() {
		return car();
	}

	@Override
	public SubLObject rest() {
		return cdr();
	}

	@Override
	public LispObject toLispObject() {
		return this;
	}

	@Override
	public Object clone() {
		Object result = null;
		try {
			result = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return this;
		}
		return result;
	}

	final public int cl_length() {
		return length();
	}

	// public static final LispObject eval(final LispObject obj,
	// final Environment env,
	// final LispThread thread){
	// return Lisp.eval(obj, env, thread);
	//
	// }
	// public static final LispObject get(final LispObject obj,
	// final LispObject env,
	// final LispObject thread){
	// return Lisp.get(obj, env, thread);
	//
	// }
	/**
	 * Function to allow objects to return the value "they stand for". Used by
	 * AutoloadedFunctionProxy to return the function it is proxying.
	 */
	public LispObject resolve() {
		return this;
	}

	public LispObject typeOf() {
		return T;
	}

	static public LispObject getInstance(boolean b) {
		return b ? T : NIL;
	}

	public LispObject classOf() {
		return BuiltInClass.CLASS_T;
	}

	public LispObject getDescription() {
		StringBuilder sb = new StringBuilder("An object of type ");
		sb.append(typeOf().princToString());
		sb.append(" at #x");
		sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
		return new SimpleString(sb);
	}

	/**
	 * Implementing the getParts() protocol will allow INSPECT to return information
	 * about the substructure of a descendent of LispObject.
	 *
	 * The protocol is to return a List of Cons pairs, where the car of each pair
	 * contains a decriptive string, and the cdr returns a subobject for inspection.
	 */
	public LispObject getParts() {
		return NIL;
	}

	public boolean getBooleanValue() {
		return true;
	}

	public LispObject typep(LispObject typeSpecifier) {
		if (typeSpecifier == T)
			return T;
		if (typeSpecifier == BuiltInClass.CLASS_T)
			return T;
		if (typeSpecifier == Symbol.ATOM)
			return atom() ? T : NIL;
		if (typeSpecifier == Symbol.NUMBER || typeSpecifier == BuiltInClass.NUMBER)
			return numberp() ? T : NIL;
		if (classOf() == typeSpecifier)
			return T;
		if (typeOf() == typeSpecifier)
			return T;
		return NIL;
	}

	public boolean constantp() {
		return true;
	}

	public final LispObject CONSTANTP() {
		return constantp() ? T : NIL;
	}

	public final LispObject ATOM() {
		return atom() ? T : NIL;
	}

	public boolean atom() {
		return true;
	}

	@Override
	public Object javaInstance() {
		return this;
	}

	public Object javaInstanceImpl(Class<?> c) {
		return javaInstance();
	}

	public Object javaInstance(Class<?> cIn) {
		return javaInstance(cIn, false);
	}

	public Object javaInstance(Class<?> cIn, boolean noError) {
		if (cIn == null || cIn == Object.class)
			return javaInstance();
		final Class<? extends LispObject> thisClass = getClass();
		if (cIn.isAssignableFrom(thisClass)) {
			return this;
		}
		Class c = Java.maybeBoxClass(cIn);
		Object offer2 = javaInstance();
		if (c.isInstance(offer2)) {
			return offer2;
		}
		Object offer = javaInstanceImpl(c);
		if (offer != offer2) {
			if (c.isInstance(offer)) {
				return offer;
			}
		}
		String cn = c.getName();
		if (cn.equals("java.lang.Boolean")) {
			return !isNil();
		}
		if (noError)
			return null;
		return error(new LispError("The value " + princToString() + " is not of class " + cn));
	}

	/**
	 * This method returns 'this' by default, but allows objects to return different
	 * values to increase Java interoperability
	 *
	 * @return An object to be used with synchronized, wait, notify, etc
	 */
	public Object lockableInstance() {
		return this;
	}

	public LispObject car() {
		if (this instanceof Cons) {
			return ((Cons) this).car;
		} else if (this instanceof Nil) {
			return NIL;
		}
		return (LispObject) super.first();
	}

	public final void setCar(LispObject obj) {
		if (this instanceof Cons) {
			((Cons) this).car = obj;
			return;
		}
		type_error(this, Symbol.CONS);
	}

	public LispObject RPLACA(LispObject obj) {
		setCar(obj);
		return this;
	}

	public LispObject cdr() {
		if (this instanceof Cons) {
			return ((Cons) this).cdr;
		} else if (this instanceof Nil) {
			return NIL;
		}
		return (LispObject) super.rest();
	}

	public void setCdr(LispObject obj) {
		if (this instanceof Cons) {
			((Cons) this).cdr = obj;
			return;
		}
		type_error(this, Symbol.CONS);
	}

	public LispObject RPLACD(LispObject obj) {
		setCdr(obj);
		return this;
	}

	public LispObject cadr() {
		LispObject tail = cdr();
		if (!(tail instanceof Nil)) {
			return tail.car();
		} else
			return NIL;
	}

	public LispObject cddr() {
		LispObject tail = cdr();
		if (!(tail instanceof Nil)) {
			return tail.cdr();
		} else
			return NIL;
	}

	public LispObject caddr() {
		LispObject tail = cddr();
		if (!(tail instanceof Nil)) {
			return tail.car();
		} else
			return NIL;
	}

	public final LispObject nthcdr(int n) {
		if (n < 0)
			return type_error(Fixnum.getInstance(n), list(Symbol.INTEGER, Fixnum.ZERO));
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

	public final LispObject push(LispObject obj) {
		if (this instanceof Cons) {
			return new Cons(obj, this);
		} else if (this instanceof Nil) {
			return new Cons(obj);
		}
		return type_error(this, Symbol.LIST);
	}

	final public LispObject EQ(LispObject obj) {
		return this == obj ? T : NIL;
	}

	public boolean eql(char c) {
		return false;
	}

	public boolean eql(int n) {
		return false;
	}

	public boolean eql(LispObject obj) {
		return super.eql(obj);
	}

	public final LispObject EQL(LispObject obj) {
		return eql(obj) ? T : NIL;
	}

	public final LispObject EQUAL(LispObject obj) {
		return equal(obj) ? T : NIL;
	}

	public boolean equal(int n) {
		return false;
	}

	public boolean equal(LispObject obj) {
		return super.equal(obj);
		// return this == obj;
	}

	public boolean equalp(int n) {
		return isInteger() && longValue() == n;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject#equalp(com.cyc
	 * .tool.subl.jrtl.nativeCode.type.core.SubLObject)
	 */
	@Override
	public boolean equalp(SubLObject obj) {
		return equalp((LispObject) obj);
	}

	public boolean equalsObject(LispObject obj) {
		return obj == this;
	}

	public boolean theSameSymbol(LispObject obj) {
		return obj == this;
	}

	//
	@Override
	public boolean lispEquals(Object obj) {
		return equal((LispObject) obj);
	}

	@Override
	public boolean equals(Symbol obj) {
		if (obj.getClass() == getClass()) {
			return equal(obj);
		}
		if (obj == T)
			return this == T;
		if (false)
			Debug.bug();
		return obj == this;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == T)
			return this == T;
		if (obj.getClass() == getClass()) {
			return equal((LispObject) obj);
		}
		if (false)
			Debug.bug();
		return obj == this;
	}

	//
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject#equalp(com.cyc
	 * .tool.subl.jrtl.nativeCode.type.core.SubLObject)
	 */
	@Override
	public boolean equal(SubLObject obj) {
		return equal((LispObject) obj);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject#equalp(com.cyc
	 * .tool.subl.jrtl.nativeCode.type.core.SubLObject)
	 */
	@Override
	public boolean eql(SubLObject obj) {
		return eql((LispObject) obj);
	}

	public boolean equalp(LispObject obj) {
		return super.equalp(obj);
	}

	public LispObject ABS() {
		return type_error(this, Symbol.NUMBER);
	}

	public LispObject NUMERATOR() {
		return type_error(this, Symbol.RATIONAL);
	}

	public LispObject DENOMINATOR() {
		return type_error(this, Symbol.RATIONAL);
	}

	public final LispObject EVENP() {
		return evenp() ? T : NIL;
	}

	public boolean evenp() {
		return Lisp.checkInteger(this).evenp();
	}

	public final LispObject ODDP() {
		return oddp() ? T : NIL;
	}

	public boolean oddp() {
		return Lisp.checkInteger(this).oddp();
	}

	public final LispObject PLUSP() {
		return plusp() ? T : NIL;
	}

	public boolean plusp() {
		type_error(this, Symbol.REAL);
		// Not reached.
		return false;
	}

	public final LispObject MINUSP() {
		return minusp() ? T : NIL;
	}

	public boolean minusp() {
		type_error(this, Symbol.REAL);
		// Not reached.
		return false;
	}

	public final LispObject NUMBERP() {
		return numberp() ? T : NIL;
	}

	public boolean numberp() {
		return false;
	}

	public final LispObject ZEROP() {
		return zerop() ? T : NIL;
	}

	public boolean zerop() {
		type_error(this, Symbol.NUMBER);
		// Not reached.
		return false;
	}

	public LispObject COMPLEXP() {
		return NIL;
	}

	public final LispObject FLOATP() {
		return floatp() ? T : NIL;
	}

	public boolean floatp() {
		return false;
	}

	public final LispObject INTEGERP() {
		return integerp() ? T : NIL;
	}

	public boolean integerp() {
		return false;
	}

	public final LispObject RATIONALP() {
		return rationalp() ? T : NIL;
	}

	public boolean rationalp() {
		return false;
	}

	public final LispObject REALP() {
		return realp() ? T : NIL;
	}

	public boolean realp() {
		return false;
	}

	public final LispObject STRINGP() {
		return stringp() ? T : NIL;
	}

	public boolean stringp() {
		return false;
	}

	public LispObject SIMPLE_STRING_P() {
		return NIL;
	}

	public final LispObject VECTORP() {
		return vectorp() ? T : NIL;
	}

	public boolean vectorp() {
		return false;
	}

	public final LispObject CHARACTERP() {
		return characterp() ? T : NIL;
	}

	public boolean characterp() {
		return false;
	}

	public int length() {
		if (SubLMain.BOOTY_HACKZ) {
			LispObject thiz = this;
			if (thiz instanceof Symbol) {
				Symbol sym = (Symbol) thiz;
				LispObject v = sym.symbolValueNoThrow();
				if (v != null) {
					return v.length();
				}
			}
		}
		return type_error(this, Symbol.SEQUENCE).length();
	}

	public final LispObject LENGTH() {
		return Fixnum.getInstance(length());
	}

	public LispObject CHAR(int index) {
		return type_error(this, Symbol.STRING).CHAR(index);
	}

	public LispObject SCHAR(int index) {
		return type_error(this, Symbol.SIMPLE_STRING).SCHAR(index);
	}

	public LispObject NTH(int index) {
		return type_error(this, Symbol.LIST).NTH(index);
	}

	public final LispObject NTH(LispObject arg) {
		return NTH(Fixnum.getValue(arg));
	}

	public LispObject elt(int index) {
		return type_error(this, Symbol.SEQUENCE).elt(index);
	}

	public LispObject reverse() {
		return type_error(this, Symbol.SEQUENCE).reverse();
	}

	public LispObject nreverse() {
		return type_error(this, Symbol.SEQUENCE);
	}

	public long aref_long(int index) {
		return AREF(index).longValue();
	}

	public int aref(int index) {
		return AREF(index).intValue();
	}

	public LispObject AREF(int index) {
		return type_error(this, Symbol.ARRAY);
	}

	public final LispObject AREF(LispObject index) {
		return AREF(Fixnum.getValue(index));
	}

	public void aset(int index, int n) {
		aset(index, Fixnum.getInstance(n));
	}

	public void aset(int index, LispObject newValue) {
		type_error(this, Symbol.ARRAY);
	}

	public final void aset(LispObject index, LispObject newValue) {
		aset(Fixnum.getValue(index), newValue);
	}

	public LispObject SVREF(int index) {
		return type_error(this, Symbol.SIMPLE_VECTOR);
	}

	public void svset(int index, LispObject newValue) {
		type_error(this, Symbol.SIMPLE_VECTOR);
	}

	public void vectorPushExtend(LispObject element) {
		noFillPointer();
	}

	public LispObject VECTOR_PUSH_EXTEND(LispObject element) {
		return noFillPointer();
	}

	public LispObject VECTOR_PUSH_EXTEND(LispObject element, LispObject extension) {
		return noFillPointer();
	}

	public final LispObject noFillPointer() {
		return type_error(this, list(Symbol.AND, Symbol.VECTOR, list(Symbol.SATISFIES, Symbol.ARRAY_HAS_FILL_POINTER_P)));
	}

	public LispObject[] copyToArray() {
		type_error(this, Symbol.LIST);
		// Not reached.
		return null;
	}

	public final LispObject SYMBOLP() {
		return (this instanceof Symbol) ? T : NIL;
	}

	public final boolean listp() {
		return (this instanceof Cons) || (this instanceof Nil);
	}

	public final LispObject LISTP() {
		return listp() ? T : NIL;
	}

	public final boolean endp() {
		if (this instanceof Cons)
			return false;
		else if (this instanceof Nil)
			return true;
		type_error(this, Symbol.LIST);
		// Not reached.
		return false;
	}

	public final LispObject ENDP() {
		return endp() ? T : NIL;
	}

	public LispObject NOT() {
		return NIL;
	}

	public boolean isSpecialOperator() {
		type_error(this, Symbol.SYMBOL);
		// Not reached.
		return false;
	}

	public boolean isSpecialVariable() {
		return false;
	}

	public LispObject getDocumentation(LispObject docType) {
		LispObject alist;
		synchronized (Lisp.documentationHashTable) {
			alist = Lisp.documentationHashTable.get(this);
		}
		if (alist != null) {
			LispObject entry = assq(docType, alist);
			if (entry instanceof Cons)
				return ((Cons) entry).cdr;
		}
		if (docType == Symbol.FUNCTION && this instanceof Symbol) {
			LispObject fn = ((Symbol) this).getSymbolFunction();
			if (fn instanceof Function) {
				DocString ds = fn.getClass().getAnnotation(DocString.class);
				if (ds != null) {
					String arglist = ds.args();
					String docstring = ds.doc();
					if (arglist.length() != 0)
						((Function) fn).setLambdaList(new SimpleString(arglist));
					if (docstring.length() != 0) {
						AbstractString doc = new SimpleString(docstring);
						((Symbol) this).setDocumentation(Symbol.FUNCTION, doc);
						return doc;
					} else if (fn.typep(Symbol.STANDARD_GENERIC_FUNCTION) != NIL) {
						return Symbol.SLOT_VALUE.execute(fn, Symbol._DOCUMENTATION);
					}
				}
			}
		}
		return NIL;
	}

	public void setDocumentation(LispObject docType, LispObject documentation) {
		synchronized (Lisp.documentationHashTable) {
			LispObject alist = Lisp.documentationHashTable.get(this);
			if (alist == null)
				alist = NIL;
			LispObject entry = assq(docType, alist);
			if (entry instanceof Cons) {
				((Cons) entry).cdr = documentation;
			} else {
				alist = alist.push(new Cons(docType, documentation));
				Lisp.documentationHashTable.put(this, alist);
			}
		}
	}

	public LispObject getPropertyList() {
		type_error(this, Symbol.SYMBOL);
		return null;
	}

	public void setPropertyList(LispObject obj) {
		type_error(this, Symbol.SYMBOL);
	}

	public LispObject getSymbolValue() {
		return type_error(this, Symbol.SYMBOL);
	}

	public LispObject getSymbolFunction() {
		return type_error(this, Symbol.SYMBOL);
	}

	public LispObject getSymbolFunctionOrDie() {
		return type_error(this, Symbol.SYMBOL);
	}

	public LispObject getSymbolSetfFunction() {
		return type_error(this, Symbol.SYMBOL);
	}

	public LispObject getSymbolSetfFunctionOrDie() {
		return type_error(this, Symbol.SYMBOL);
	}

	/**
	 * PRINC-TO-STRING function to be used with Java objects
	 *
	 * @return A string in human-readable format, as per PRINC definition
	 */
	@Override
	public String princToString() {
		LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		try {
			thread.bindSpecial(Symbol.PRINT_READABLY, NIL);
			thread.bindSpecial(Symbol.PRINT_ESCAPE, NIL);
			return printObject();
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	protected final static ThreadLocal<IdentitySetWithIndex> printingObjectR = new ThreadLocal<IdentitySetWithIndex>() {
		@Override
		protected IdentitySetWithIndex initialValue() {
			return new IdentitySetWithIndex();
		};
	};

	@Override
	final public String printObject() {
		String s = printObjectChecked();
		if (!blazing && (s.equals("#") || s.startsWith("#<"))) {
			checkUnreadableOk();
		}
		return s;
	}

	private String printObjectChecked() {
		if (insideToString == 0)
			return printObjectImpl();

		final LispThread thread = LispThread.currentThread();
		final boolean printCircle = (Symbol.PRINT_CIRCLE.symbolValue(thread) != NIL);
		if (printCircle)
			return printObjectImpl();

		final SpecialBindingsMark mark = thread.markSpecialBindings();
		final ThreadLocal<IdentitySetWithIndex> printingobjectr2 = printingObjectR;
		if (printingobjectr2 == null) {
			return "#=( " + easyToString() + ")=#";
		}
		IdentitySetWithIndex set = printingobjectr2.get();
		int index = set.indexOf(this, false);
		if (index >= 0) {
			return "#=( " + index + " #|" + easyToString() + "|#)=#";
		}
		try {
			// Symbol.PRINT_CIRCLE.setSymbolValue(T);
			set.add(this);
			return printObjectImpl();
		} catch (Throwable e) {
			e.printStackTrace();
			return "#=(" + index + "#|" + easyToString() + "|#)=#";
		} finally {
			set.remove(this);
			thread.resetSpecialBindings(mark);
		}
	}

	public String printObjectImpl() // throws IOException
	{
		return printUglyObjectImpl();
	}

	public String printUglyObjectImpl() // throws IOException
	{
		//		try {
		SubLSymbol sym = getType();
		return unreadableString(sym.getName(), true);
		//		} catch (Throwable t) {
		//			t.printStackTrace();
		//			return unreadableString(easyToString(), true);
		//		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return valueOfString(this, true, insideToString + 1, this);
	}

	public LispObject getCopyForm() {
		return this;
	}

	public String printReadableObject(boolean quoted) {
		/*
		 * if *print-readably* is true, printing proceeds as if *print-escape*,
		 * *print-array*, and *print-gensym* were also true, and as if *print-length*,
		 * *print-level*, and *print-lines* were false.
		 */
		LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		try {
			thread.bindSpecial(Symbol.PRINT_READABLY, T);
			thread.bindSpecial(Symbol.PRINT_ESCAPE, T);
			thread.bindSpecial(Symbol.PRINT_ARRAY, T);
			if (insideToString == 0) {
				thread.bindSpecial(Symbol._PACKAGE_, Lisp._KEYWORD_PACKAGE_);
				thread.bindSpecial(Symbol.PRINT_LENGTH, NIL);
			}
			thread.bindSpecial(Symbol.PRINT_LEVEL, NIL);
			thread.bindSpecial(Symbol.PRINT_LINES, NIL);
			LispObject cf = getCopyForm();
			if (cf == null) {
				cf = this;
			}
			String s = cf.printObject();
			if (quoted) {
				return "'" + s;
			} else {
				return s;
			}
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	// (defmethod print-object ((obj built-in-class) stream) (FORMAT stream "#.~a"
	// `(find-class ',(class-name obj)) stream))
	// (defmethod print-object ((obj built-in-class) stream) (FORMAT stream "#.")
	// (write `(find-class ',(class-name obj)) :stream stream :readably t)))
	//
	// (let ((*print-readably* t)) (prin1-to-string (find-class 'symbol)))
	protected String easyToString() {
		int hc = 0;
		// if (hc==0) this.hashCode();
		if (hc == 0)
			hc = System.identityHashCode(this);
		final String dotName = getDotName(this.getClass());
		String s = dotName + "@" + Integer.toHexString(hc);
		return s;
	}

	// void chars() throws Throwable{} // uncomment to find accidental calls

	/**
	 * Creates a readably (as per CLHS terminology) representation of the 'this'
	 * object,
	 *
	 * If the current value of the variable *PRINT-READABLY* is T
	 *
	 * This function is a helper for printObject()
	 *
	 * @param func
	 * @param identity when 'true', includes Java's identityHash for the object in
	 *                 the output.
	 * @return a reabable string (i.e. one enclosed in the #.(..) markers)
	 */
	public final String readableString(LispObject func, LispObject... identity) {
		StringBuilder sb = new StringBuilder("#");
		final boolean asUnreadable = !Interpreter.isInitialized();
		if (asUnreadable) {
			sb.append("<");
			func = this.typeOf();
			sb.append(func.princToString());
			checkUnreadableOk();
		} else {
			sb.append(".(");
			sb.append(func.printReadableObject(false));
		}
		for (int i = 0; i < identity.length; i++) {
			sb.append(" ");
			sb.append(identity[i].printReadableObject(true));
			if (asUnreadable) {
				sb.append(">");
				return sb.toString();
			}
		}
		sb.append(")");
		return sb.toString();
	}

	public String unreadableString(Symbol typename) {
		return unreadableString(typename.printObject(), true);
	}

	protected void extraInfo(StringBuilder sb) {
		// sb.append(objectFieldsString(this));
	}

	/**
	 * Calls unreadableString(String s, boolean identity) with a default identity
	 * value of 'true'.
	 *
	 * This function is a helper for printObject()
	 *
	 * @param s String representation of this object.
	 * @return String enclosed in the non-readable #< ... > markers
	 * @throws IOException
	 */
	public final String unreadableString(String s) {
		return unreadableString(s, true);
	}

	/**
	 * Creates a non-readably (as per CLHS terminology) representation of the 'this'
	 * object, using string 's'.
	 *
	 * If the current value of the variable *PRINT-READABLY* is T, a Lisp error is
	 * thrown and no value is returned.
	 *
	 * This function is a helper for printObject()
	 *
	 * @param s
	 * @param identity when 'true', includes Java's identityHash for the object in
	 *                 the output.
	 * @return a non reabable string (i.e. one enclosed in the #< > markers)
	 */
	public final String unreadableString(String s, boolean identity) {
		checkUnreadableOk();
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

	/**
	 * TODO Describe the purpose of this method.
	 */
	protected void checkUnreadableOk() {
		if (isPrintReadable(null)) {
			raiseUnreadable(this);
			// return null; // not reached
		}
	}

	// Special operator
	public LispObject execute(LispObject args, Environment env) {
		return error(new LispError("not Special operator"));
	}

	public LispObject execute() {
		return arrayify();
	}

	public LispObject execute(LispObject zero) {
		return arrayify(zero);
	}

	public LispObject execute(LispObject zero, LispObject arg) {
		return arrayify(zero, arg);
	}

	public LispObject execute(LispObject zero, LispObject first, LispObject second) {
		return arrayify(zero, first, second);
	}

	public LispObject execute(LispObject zero, LispObject first, LispObject second, LispObject third) {
		return arrayify(zero, first, second, third);
	}

	public LispObject execute(LispObject zero, LispObject first, LispObject second, LispObject third, LispObject fourth) {
		return arrayify(zero, first, second, third, fourth);
	}

	public LispObject execute(LispObject zero, LispObject first, LispObject second, LispObject third, LispObject fourth, LispObject fifth) {
		return arrayify(zero, first, second, third, fourth, fifth);
	}

	public LispObject execute(LispObject zero, LispObject first, LispObject second, LispObject third, LispObject fourth, LispObject fifth, LispObject sixth) {
		return arrayify(zero, first, second, third, fourth, fifth, sixth);
	}

	public LispObject execute(LispObject zero, LispObject first, LispObject second, LispObject third, LispObject fourth, LispObject fifth, LispObject sixth, LispObject seventh) {
		return arrayify(zero, first, second, third, fourth, fifth, sixth, seventh);
	}

	public LispObject execute(LispObject zero, LispObject first, LispObject second, LispObject third, LispObject fourth, LispObject fifth, LispObject sixth, LispObject seventh, LispObject eighth) {
		return arrayify(zero, first, second, third, fourth, fifth, sixth, seventh, eighth);
	}

	public LispObject arrayify(LispObject... args) {
		return execute(args);
	}

	public LispObject execute(LispObject[] args) {
		if (Lisp.loopCheck != this) {
			Lisp.loopCheck = this;
			if (args.length < 10)
				return dispatch(args);
		}
		return type_error(this, Symbol.FUNCTION);
	}

	// Used by COMPILE-MULTIPLE-VALUE-CALL.
	public LispObject dispatch(LispObject[] args) {
		switch (args.length) {
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
			return execute(args[0], args[1], args[2], args[3], args[4], args[5]);
		case 7:
			return execute(args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
		case 8:
			return execute(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
		default:
			return execute(args);
		}
	}

	@Override
	public int intValue() {
		type_error(this, Symbol.INTEGER);
		// Not reached.
		return 0;
	}

	@Override
	public long longValue() {
		type_error(this, Symbol.INTEGER);
		// Not reached.
		return 0;
	}

	public float floatValue() {
		type_error(this, Symbol.SINGLE_FLOAT);
		// Not reached
		return 0;
	}

	@Override
	public double doubleValue() {
		type_error(this, Symbol.DOUBLE_FLOAT);
		// Not reached
		return 0;
	}

	public LispObject incr() {
		return type_error(this, Symbol.NUMBER);
	}

	public LispObject decr() {
		return type_error(this, Symbol.NUMBER);
	}

	public LispObject negate() {
		return Fixnum.ZERO.subtract(this);
	}

	public LispObject add(int n) {
		return add(Fixnum.getInstance(n));
	}

	public LispObject add(LispObject obj) {
		return type_error(this, Symbol.NUMBER);
	}

	public LispObject subtract(int n) {
		return subtract(Fixnum.getInstance(n));
	}

	public LispObject subtract(LispObject obj) {
		return type_error(this, Symbol.NUMBER);
	}

	public LispObject multiplyBy(int n) {
		return multiplyBy(Fixnum.getInstance(n));
	}

	public LispObject multiplyBy(LispObject obj) {
		return type_error(this, Symbol.NUMBER);
	}

	public LispObject divideBy(LispObject obj) {
		return type_error(this, Symbol.NUMBER);
	}

	public boolean isEqualTo(int n) {
		return isEqualTo(Fixnum.getInstance(n));
	}

	public boolean isEqualTo(LispObject obj) {
		type_error(this, Symbol.NUMBER);
		// Not reached.
		return false;
	}

	public final LispObject IS_E(LispObject obj) {
		return isEqualTo(obj) ? T : NIL;
	}

	public boolean isNotEqualTo(int n) {
		return isNotEqualTo(Fixnum.getInstance(n));
	}

	public boolean isNotEqualTo(LispObject obj) {
		type_error(this, Symbol.NUMBER);
		// Not reached.
		return false;
	}

	public final LispObject IS_NE(LispObject obj) {
		return isNotEqualTo(obj) ? T : NIL;
	}

	public boolean isLessThan(int n) {
		return isLessThan(Fixnum.getInstance(n));
	}

	public boolean isLessThan(LispObject obj) {
		type_error(this, Symbol.REAL);
		// Not reached.
		return false;
	}

	public final LispObject IS_LT(LispObject obj) {
		return isLessThan(obj) ? T : NIL;
	}

	public boolean isGreaterThan(int n) {
		return isGreaterThan(Fixnum.getInstance(n));
	}

	public boolean isGreaterThan(LispObject obj) {
		type_error(this, Symbol.REAL);
		// Not reached.
		return false;
	}

	public final LispObject IS_GT(LispObject obj) {
		return isGreaterThan(obj) ? T : NIL;
	}

	public boolean isLessThanOrEqualTo(int n) {
		return isLessThanOrEqualTo(Fixnum.getInstance(n));
	}

	public boolean isLessThanOrEqualTo(LispObject obj) {
		type_error(this, Symbol.REAL);
		// Not reached.
		return false;
	}

	public final LispObject IS_LE(LispObject obj) {
		return isLessThanOrEqualTo(obj) ? T : NIL;
	}

	public boolean isGreaterThanOrEqualTo(int n) {
		return isGreaterThanOrEqualTo(Fixnum.getInstance(n));
	}

	public boolean isGreaterThanOrEqualTo(LispObject obj) {
		type_error(this, Symbol.REAL);
		// Not reached.
		return false;
	}

	public final LispObject IS_GE(LispObject obj) {
		return isGreaterThanOrEqualTo(obj) ? T : NIL;
	}

	public LispObject truncate(LispObject obj) {
		return type_error(this, Symbol.REAL);
	}

	public LispObject MOD(LispObject divisor) {
		truncate(divisor);
		final LispThread thread = LispThread.currentThread();
		LispObject remainder = thread._values[1];
		thread.clearValues();
		if (!remainder.zerop()) {
			if (divisor.minusp()) {
				if (plusp())
					return remainder.add(divisor);
			} else {
				if (minusp())
					return remainder.add(divisor);
			}
		}
		return remainder;
	}

	public LispObject MOD(int divisor) {
		return MOD(Fixnum.getInstance(divisor));
	}

	public LispObject ash(int shift) {
		return ash(Fixnum.getInstance(shift));
	}

	public LispObject ash(LispObject obj) {
		return type_error(this, Symbol.INTEGER);
	}

	public LispObject LOGNOT() {
		return type_error(this, Symbol.INTEGER);
	}

	public LispObject LOGAND(int n) {
		return LOGAND(Fixnum.getInstance(n));
	}

	public LispObject LOGAND(LispObject obj) {
		return type_error(this, Symbol.INTEGER);
	}

	public LispObject LOGIOR(int n) {
		return LOGIOR(Fixnum.getInstance(n));
	}

	public LispObject LOGIOR(LispObject obj) {
		return type_error(this, Symbol.INTEGER);
	}

	public LispObject LOGXOR(int n) {
		return LOGXOR(Fixnum.getInstance(n));
	}

	public LispObject LOGXOR(LispObject obj) {
		return type_error(this, Symbol.INTEGER);
	}

	public LispObject LDB(int size, int position) {
		return type_error(this, Symbol.INTEGER);
	}

	public int sxhash() {
		return superHash() & 0x7fffffff;
	}

	// For EQUALP hash tables.
	public int psxhash() {
		return sxhash();
	}

	public int psxhash(int depth) {
		return psxhash();
	}

	public LispObject STRING() {
		return error(new TypeError(printObject() + " cannot be coerced to a string."));
	}

	public char[] charsOld() {
		type_error(this, Symbol.STRING);
		// Not reached.
		return null;
	}

	public char[] getStringChars() {
		type_error(this, Symbol.STRING);
		// Not reached.
		return null;
	}

	/**
	 * Returns a string representing the value of a 'string designator', if the
	 * instance is one.
	 *
	 * Throws an error if the instance isn't a string designator.
	 */
	@Override
	public String getStringValue() {
		if (SubLMain.BOOTY_HACKZ) {
			return toString();
		}

		type_error(this, Symbol.STRING);
		// Not reached.
		return null;
	}

	public LispObject getSlotValue_0() {
		return getSlotValue(0);
	}

	public LispObject getSlotValue_1() {
		return getSlotValue(1);
	}

	public LispObject getSlotValue_2() {
		return getSlotValue(2);
	}

	public LispObject getSlotValue_3() {
		return getSlotValue(3);
	}

	public int getFixnumSlotValue(int index) {
		return Fixnum.getValue(getSlotValue(index));
	}

	public boolean getSlotValueAsBoolean(int index) {
		return getSlotValue(index) != NIL ? true : false;
	}

	public void setSlotValue_0(LispObject value) {
		setSlotValue(0, value);
	}

	public void setSlotValue_1(LispObject value) {
		setSlotValue(1, value);
	}

	public void setSlotValue_2(LispObject value) {
		setSlotValue(2, value);
	}

	public void setSlotValue_3(LispObject value) {
		setSlotValue(3, value);
	}

	public LispObject getSlotValue(int index) {
		return type_error(this, Symbol.STRUCTURE_OBJECT);
	}

	public void setSlotValue(int index, LispObject value) {
		type_error(this, Symbol.STRUCTURE_OBJECT);
	}

	public LispObject SLOT_VALUE(LispObject slotName) {
		return type_error(this, Symbol.STANDARD_OBJECT);
	}

	public void setSlotValue(LispObject slotName, LispObject newValue) {
		type_error(this, Symbol.STANDARD_OBJECT);
	}

	// Profiling.
	public int getCallCount() {
		return 0;
	}

	public void setCallCount(int n) {
	}

	public void incrementCallCount() {
	}

	public int getHotCount() {
		return 0;
	}

	public void setHotCount(int n) {
	}

	public void incrementHotCount() {
	}

	@Override
	public boolean canFastHash() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.canFastHash");
		return false;
	}

	@Override
	public int hashCode(int p0) {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.hashCode");
		return superHash();
	}

	@Override
	public boolean isAlien() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isAlien");
		return false;
	}

	@Override
	public boolean isAtom() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isAtom");
		return false;
	}

	@Override
	public boolean isBigIntegerBignum() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isBigIntegerBignum");
		return false;
	}

	@Override
	public boolean isBignum() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isBignum");
		return false;
	}

	@Override
	public boolean isBoolean() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isBoolean");
		return false;
	}

	@Override
	public boolean isChar() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isChar");
		return false;
	}

	@Override
	public boolean isCons() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isCons");
		return false;
	}

	@Override
	public boolean isDouble() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isDouble");
		return false;
	}

	@Override
	public boolean isEnvironment() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isEnvironment");
		return false;
	}

	@Override
	public boolean isError() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isError");
		return false;
	}

	@Override
	public boolean isFixnum() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isFixnum");
		return false;
	}

	@Override
	public boolean isFunction() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isFunction");
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isFunctionSpec");
		return false;
	}

	@Override
	public boolean isGuid() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isGuid");
		return false;
	}

	@Override
	public boolean isHashtable() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isHashtable");
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isHashtableIterator");
		return false;
	}

	@Override
	public boolean isIntBignum() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isIntBignum");
		return false;
	}

	@Override
	public boolean isInteger() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isInteger");
		return false;
	}

	@Override
	public boolean isKeyhash() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isKeyhash");
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isKeyhashIterator");
		return false;
	}

	@Override
	public boolean isKeyword() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isKeyword");
		return false;
	}

	@Override
	public boolean isList() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isList");
		return false;
	}

	@Override
	public boolean isLock() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isLock");
		return false;
	}

	@Override
	public boolean isLongBignum() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isLongBignum");
		return false;
	}

	@Override
	public boolean isMacroOperator() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isMacroOperator");
		return false;
	}

	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isNil");
		return false;
	}

	@Override
	public boolean isNumber() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isNumber");
		return false;
	}

	@Override
	public boolean isPackage() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isPackage");
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isPackageIterator");
		return false;
	}

	@Override
	public boolean isProcess() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isProcess");
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isReadWriteLock");
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		// TODO Auto-generated method stub
		// if(true) Errors.unimplementedMethod("Auto-generated method stub:
		// SubLObject.isRegexPattern");
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return false;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}
}

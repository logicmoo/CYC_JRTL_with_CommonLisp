/*
 * Function.java
 *
 * Copyright (C) 2002-2005 Peter Graves
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

package org.armedbear.lisp;
import static org.armedbear.lisp.Lisp.*;


import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuataryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuintaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.TernaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.AbstractSubLFunction;
//import com.cyc.tool.subl.jrtl.nativeCode.type.operator.AbstractSubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLSpecialOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class Function extends Operator  implements SubLFunction
{
	@Override
	public boolean isSpecial() {
		return false;
	}

	@Override
	public LispObject arrayify(LispObject... args) {
		return error(new WrongNumberOfArgumentsException(this, args.length));
	}

	@Override
	public SubLSpecialOperator toSpecialOperator() {
		//if(this instanceof SubLSpecialOperator) return (SubLSpecialOperator) this;
		org.armedbear.lisp.Lisp.lisp_type_error(this,"SPECIAL-OPERATOR");
		return null;
	}

	@Override
	public SubLSymbol getFunctionSymbol() {
		return (SubLSymbol) getLambdaName();
	}

	@Override
	public SubLFunction getFunc() {
		return this;
	}

    private LispObject propertyList = NIL;
    private int callCount;
    private int hotCount;
    /**
     * The value of *load-truename* which was current when this function
     * was loaded, used for fetching the class bytes in case of disassembly.
     */
    private final LispObject loadedFrom;

    protected Function() {
    	super(null);
	LispObject loadTruename = Symbol.LOAD_TRUENAME.symbolValueNoThrow();
	loadedFrom = loadTruename != null ? loadTruename : NIL;
    }

    public Function(String name)
    {
        this(name, (String)null);
    }

    public Function(String name, String arglist)
    {
	this();
        if(arglist != null)
            setLambdaList(new SimpleString(arglist));
        if (name != null) {
            Symbol symbol = Symbol.addCLFunction(name.toUpperCase(), this);
            if (cold)
                symbol.setBuiltInFunction(true);
            setLambdaName(symbol);
        }
    }

    public Function(Symbol symbol)
    {
	this(symbol, null, null);
    }

    public Function(Symbol symbol, String arglist)
    {
	this(symbol, arglist, null);
    }

    public Function(Symbol symbol, String arglist, String docstring)
    {
	this();
        symbol.setSymbolFunction(this);
        if (cold)
            symbol.setBuiltInFunction(true);
        setLambdaName(symbol);
        if(arglist != null)
            setLambdaList(new SimpleString(arglist));
        if (docstring != null)
            symbol.setDocumentation(Symbol.FUNCTION,
                                    new SimpleString(docstring));
    }

    public Function(String name, Package pkg)
    {
        this(name, pkg, false);
    }

    public Function(String name, Package pkg, boolean exported)
    {
        this(name, pkg, exported, null, null);
    }

    public Function(String name, Package pkg, boolean exported,
                    String arglist)
    {
        this(name, pkg, exported, arglist, null);
    }

    public Function(String name, Package pkg, boolean exported,
                    String arglist, String docstring)
    {
	this();
        if (arglist instanceof String)
            setLambdaList(new SimpleString(arglist));
        if (name != null) {
            Symbol symbol;
            if (exported)
                symbol = pkg.internAndExport(name.toUpperCase());
            else
                symbol = pkg.intern(name.toUpperCase());
            symbol.setSymbolFunction(this);
            if (cold)
                symbol.setBuiltInFunction(true);
            setLambdaName(symbol);
            if (docstring != null)
                symbol.setDocumentation(Symbol.FUNCTION,
                                        new SimpleString(docstring));
        }
    }

    public Function(LispObject name)
    {
	this();
        setLambdaName(name);
    }
    public Function(SubLSymbol name)
    {
	this();
        setLambdaName((LispObject) name);
    }

    public Function(LispObject name, LispObject lambdaList)
    {
	this();
        setLambdaName(name);
        setLambdaList(lambdaList);
    }

    public Function(SubLSymbol functionSymbol, int requiredArgCount, int optionalArgCount, boolean allowsRest) {
    	this(functionSymbol);
		this.requiredArgCount = requiredArgCount;
		this.optionalArgCount = optionalArgCount;
		this.allowsRest = allowsRest;
	}



	@Override
    public LispObject typeOf()
    {
        return Symbol.FUNCTION;
    }

    @Override
    public LispObject classOf()
    {
        return BuiltInClass.FUNCTION;
    }

    @Override
    public LispObject typep(LispObject typeSpecifier)
    {
		if (typeSpecifier == Symbol.FUNCTION)
			return T;
        if (typeSpecifier == BuiltInClass.FUNCTION)
            return T;
        return super.typep(typeSpecifier);
    }

    @Override
    public final LispObject getPropertyList()
    {
        if (propertyList == null)
            propertyList = NIL;
        return propertyList;
    }

    @Override
    public final void setPropertyList(LispObject obj)
    {
        if (obj == null)
            throw new NullPointerException();
        propertyList = obj;
    }

    public final void setClassBytes(byte[] bytes)
    {
        propertyList = putf(propertyList, Symbol.CLASS_BYTES,
                            new JavaObject(bytes));
    }

    public final LispObject getClassBytes() {
	LispObject o = getf(propertyList, Symbol.CLASS_BYTES, NIL);
	if(o != NIL) {
	    return o;
	} else {
	    ClassLoader c = getClass().getClassLoader();
	    if(c instanceof FaslClassLoader) {
		final LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		try {
		    thread.bindSpecial(Symbol.LOAD_TRUENAME, loadedFrom);
		    return new JavaObject(((FaslClassLoader) c).getFunctionClassBytes(this));
		} catch(Throwable t) {
		    //This is because unfortunately getFunctionClassBytes uses
		    //Debug.assertTrue(false) to signal errors
		    if(t instanceof ControlTransfer) {
			throw (ControlTransfer) t;
		    } else {
			return NIL;
		    }
		} finally {
		    thread.resetSpecialBindings(mark);
		}
	    } else {
		return NIL;
	    }
	}
    }

    public static final Primitive FUNCTION_CLASS_BYTES = new pf_function_class_bytes();
    public static final class pf_function_class_bytes extends Primitive {
	public pf_function_class_bytes() {
	    super("function-class-bytes", PACKAGE_SYS, false, "function");
        }
        @Override
        public LispObject execute(LispObject arg) {
            if (arg instanceof Function) {
                return ((Function) arg).getClassBytes();
	    }
            return type_error(arg, Symbol.FUNCTION);
        }
    }


	@Override
	public SubLObject apply(SubLCons p0, SubLEnvironment p1) {
		final BinaryFunction binaryFunction = getBinaryFunction();
		if (binaryFunction != null) { return binaryFunction.processItem(p0, p1); }
		return execute((LispObject) p0, (Environment) p1);
		//Errors.unimplementedMethod("Auto-generated method stub:  SubLFunction.apply");
		//return null;
	}



	  @Override
	public LispObject funcallCL(LispObject... args)
	  {
		  return this.execute((LispObject[])args);
	  }



	  // Special operator
	  @Override
	public LispObject execute(LispObject form, Environment env)
	  {
			if(isSubLispFunction()) {
			    SubLObject toEval = super.apply((SubLCons) form, env);
			    return (LispObject) toEval;//(LispObject) toEval.eval(env);
			}
			return Lisp.eval((Cons)form,(Environment)env);
	  }


	@Override
	public boolean isFunction() {
		return true;
	}

	@Override
	public SubLObject evalViaApply(SubLCons form, SubLEnvironment env)  {
		final boolean subLispFunction = isSubLispFunction();
		if(subLispFunction) {
			return super.evalViaApply(form, env);
		}
		return Lisp.eval((Cons)form,(Environment)env);
	}


	@Override
	public SubLObject apply(Object[] p0) {
		LispObject[] args = (LispObject[]) p0[1];

		LispThread thread = LispThread.currentThread();

		thread._values = null;
		//  (in-package :cl)(in-package :cyc)
		// 26-07-2009: For some reason we cannot "just" call the array version;
		// it causes an error (Wrong number of arguments for LOOP-FOR-IN)
		// which is probably a sign of an issue in our design?
		switch (args.length) {
		case 0:
			return thread.execute(this);
		case 1:
			return thread.execute(this, args[0]);
		case 2:
			return thread.execute(this, args[0], args[1]);
		case 3:
			return thread.execute(this, args[0], args[1], args[2]);
		case 4:
			return thread.execute(this, args[0], args[1], args[2], args[3]);
		case 5:
			return thread.execute(this, args[0], args[1], args[2], args[3], args[4]);
		case 6:
			return thread.execute(this, args[0], args[1], args[2], args[3], args[4], args[5]);
		case 7:
			return thread.execute(this, args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
		case 8:
			return thread.execute(this, args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
		default:
			return thread.execute(this, args);
		}
	}

	@Override
	public boolean isInterpreted() {
		return true;
	}
//	@Override
//	public int hashCode(int p0) {
//		return superHash();
//	}
	@Override
	public boolean isAlien() {
		// TODO Auto-generated method stub
		//if(true) Errors.unimplementedMethod("Auto-generated method stub:  SubLObject.isAlien");
		return false;
	}
	@Override
	public boolean isAtom() {
		// TODO Auto-generated method stub
		//if(true) Errors.unimplementedMethod("Auto-generated method stub:  SubLObject.isAtom");
		return true;
	}


	@Override
    public LispObject execute(LispObject[] args)
    {
		//if(args.length<10) return dispatch(args);
    	return error(new WrongNumberOfArgumentsException(this, args.length));
	}


    // Used by the JVM compiler.
    public final void argCountError()
    {
        error(new WrongNumberOfArgumentsException(this));
    }

    // Profiling.
    @Override
    public final int getCallCount()
    {
        return callCount;
    }

    @Override
    public void setCallCount(int n)
    {
        callCount = n;
    }

    @Override
    public final void incrementCallCount()
    {
        ++callCount;
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


}

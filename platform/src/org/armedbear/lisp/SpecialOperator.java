/*
 * SpecialOperator.java
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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLCompiledFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLSpecialOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

abstract public class SpecialOperator extends SubLSpecialOperator
{

	@Override
	public boolean isInterpreted() {
		return false;
	}

	@Override
	public boolean isSpecial() {
		return true;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}


	@Override
	public SubLObject evalViaApply(SubLCons form, SubLEnvironment env) {
		return apply(form, env);
	}


	@Override
	public SubLObject apply(SubLCons arg1, SubLEnvironment env) {
		BinaryFunction binFunc = getBinaryFunction();
		if (binFunc != null)
			return binFunc.processItem(arg1, env);
		return funcallCL((LispObject)arg1,env);
	}

	@Override
	public LispObject funcallCL(LispObject... args) {
		return (LispObject) getEvaluationFunction().funcall(args);
	}

	@Override
	public SubLSymbol getFunctionSymbol() {
		return super.getLambdaName().toSymbol();
	}

	@Override
	public SubLObject apply(Object[] p0) {
		LispObject[] args = (LispObject[]) p0[1];

		LispThread thread = LispThread.currentThread();
		LispObject ef = (LispObject) getEvaluationFunction();
		thread._values = null;
		//  (in-package :cl)(in-package :cyc)
		// 26-07-2009: For some reason we cannot "just" call the array version;
		// it causes an error (Wrong number of arguments for LOOP-FOR-IN)
		// which is probably a sign of an issue in our design?
		switch (args.length) {
		case 0:
			return thread.execute(ef);
		case 1:
			return thread.execute(ef, args[0]);
		case 2:
			return thread.execute(ef, args[0], args[1]);
		case 3:
			return thread.execute(ef, args[0], args[1], args[2]);
		case 4:
			return thread.execute(ef, args[0], args[1], args[2], args[3]);
		case 5:
			return thread.execute(ef, args[0], args[1], args[2], args[3], args[4]);
		case 6:
			return thread.execute(ef, args[0], args[1], args[2], args[3], args[4], args[5]);
		case 7:
			return thread.execute(ef, args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
		case 8:
			return thread.execute(ef, args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
		default:
			return thread.execute(ef, args);
		}
	}


	@Override
	public SubLFunction getEvaluationFunction() {
		return (SubLFunction) this;
	}

	// Special operator
    @Override
	abstract public LispObject execute(LispObject args, Environment env);
//    return error(new LispError("Special operator"));

	@Override
    public LispObject arrayify(LispObject... args)
    {
          if(true)return error(new UndefinedFunction(getLambdaName()));
     	 Cons cons = list(this,args);
     	 return execute(cons, Environment.currentLispEnvironment());
    }

    @Override
	public LispObject execute(LispObject[] args)
    {
  	  if(Lisp.loopCheck != this)
  	  {
  		Lisp.loopCheck = this;
  		if (args.length < 10)
  			return dispatch(args);
  	  }
      if(true)return error(new UndefinedFunction(getLambdaName()));
 	 Cons cons = list(this,args);
 	 return execute(cons, null);
	}

    public int callCount;
    public int hotCount;

    public SpecialOperator(Symbol symbol)
    {
    	super(symbol);
    	if(symbol!=null){symbol.setSymbolFunction(this);
        setLambdaName(symbol);}
    }

    public SpecialOperator(Symbol symbol, String arglist)
    {
    	super(symbol);
        setLambdaList(new SimpleString(arglist));
    }

    public SpecialOperator(String name, Package pkg, boolean exported,
                           String arglist)
    {
    	super(null);
        Symbol symbol;
        if (exported)
           symbol = pkg.internAndExport(name.toUpperCase());
        else
           symbol = pkg.intern(name.toUpperCase());
        symbol.setSymbolFunction(this);
        setLambdaName(symbol);
        setLambdaList(new SimpleString(arglist));
    }



//      @Override
//    public String printObjectImpl()
//    {
//		StringBuilder sb = new StringBuilder("SPECIAL-OPERATOR ");
//		if (lambdaName != null) {
//			sb.append(lambdaName.princToString());
//		} else {
//			sb.append("<null>");
//		}
//        return unreadableString(sb.toString(), false);
//      }

    // Profiling.
    @Override
    public final int getCallCount()
    {
        return callCount;
    }

    @Override
    public final void setCallCount(int n)
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
    public final void setHotCount(int n)
    {
        callCount = n;
    }

    @Override
    public final void incrementHotCount()
    {
        ++hotCount;
    }

	@Override
	public boolean isSpecialRestOnly() {
		return true;
	}

}

/*
 * Function.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: Function.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class Function extends Operator
{
    private SubLObject propertyList = NIL;
    private int hotCount;

    protected Function() {}

    public Function(String name)
    {
        if (name != null) {
            SubLSymbol symbol = LispSymbolImpl.addFunction(name.toUpperCase(), this);
            if (cold)
                symbol.setBuiltInFunction(true);
            setLambdaName(symbol);
        }
    }

    public Function(SubLSymbol symbol, String arglist)
    {
        symbol.setSymbolFunction(this);
        if (cold)
            symbol.setBuiltInFunction(true);
        setLambdaName(symbol);
        setLambdaList(makeString(arglist));
    }

    public Function(SubLSymbol symbol, String arglist, String docstring)
    {
        symbol.setSymbolFunction(this);
        if (cold)
            symbol.setBuiltInFunction(true);
        setLambdaName(symbol);
        setLambdaList(makeString(arglist));
        if (docstring != null) {
            symbol.setDocumentation(LispSymbols.FUNCTION,
                                    makeString(docstring));
        }
    }

    public Function(String name, String arglist)
    {
        this(name);
        setLambdaList(makeString(arglist));
    }

    public Function(String name, SubLPackage pkg)
    {
        this(name, pkg, false);
    }

    public Function(String name, SubLPackage pkg, boolean exported)
    {
        this(name, pkg, exported, null, null);
    }

    public Function(String name, SubLPackage pkg, boolean exported,
                    String arglist)
    {
        this(name, pkg, exported, arglist, null);
    }

    public Function(String name, SubLPackage pkg, boolean exported,
                    String arglist, String docstring)
    {
        if (arglist instanceof String)
            setLambdaList(makeString(arglist));
        if (name != null) {
            SubLSymbol symbol;
            if (exported)
                symbol = pkg.internAndExport(name.toUpperCase());
            else
                symbol = pkg.intern(name.toUpperCase());
            symbol.setSymbolFunction(this);
            if (cold)
                symbol.setBuiltInFunction(true);
            setLambdaName(symbol);
            if (docstring != null)
                symbol.setDocumentation(LispSymbols.FUNCTION,
                                        makeString(docstring));
        }
    }

    public Function(SubLObject name)
    {
        setLambdaName(name);
    }

    public Function(SubLObject name, SubLObject lambdaList)
    {
        setLambdaName(name);
        setLambdaList(lambdaList);
    }

    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.FUNCTION;
    }

    @Override
    public SubLObject classOf()
    {
        return BuiltInClass.FUNCTION;
    }

    @Override
    public SubLObject typep(SubLObject typeSpecifier)
    {
        if (typeSpecifier == LispSymbols.FUNCTION)
            return T;
        if (typeSpecifier == LispSymbols.COMPILED_FUNCTION)
            return T;
        if (typeSpecifier == BuiltInClass.FUNCTION)
            return T;
        return super.typep(typeSpecifier);
    }

    @Override
    public final SubLObject getPropertyList()
    {
        if (propertyList == null)
            propertyList = NIL;
        return propertyList;
    }

    @Override
    public final void setPropertyList(SubLObject obj)
    {
        if (obj == null)
            throw new NullPointerException();
        propertyList = obj;
    }

    public final void setClassBytes(byte[] bytes)
    {
        propertyList = Lisp.putf(propertyList, LispSymbols.CLASS_BYTES,
                            new ABCLJavaObject(bytes)
        										//	T
        										);
    }

    @Override
    public SubLObject execute()
    {
        return error(new WrongNumberOfArgumentsException(this));
    }

    @Override
    public SubLObject execute(SubLObject arg)
    {
        return error(new WrongNumberOfArgumentsException(this));
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second)

    {
        return error(new WrongNumberOfArgumentsException(this));
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third)

    {
        return error(new WrongNumberOfArgumentsException(this));
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth)

    {
        return error(new WrongNumberOfArgumentsException(this));
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth,
                              SubLObject fifth)

    {
        return error(new WrongNumberOfArgumentsException(this));
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth,
                              SubLObject fifth, SubLObject sixth)

    {
        return error(new WrongNumberOfArgumentsException(this));
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth,
                              SubLObject fifth, SubLObject sixth,
                              SubLObject seventh)

    {
        return error(new WrongNumberOfArgumentsException(this));
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth,
                              SubLObject fifth, SubLObject sixth,
                              SubLObject seventh, SubLObject eighth)

    {
        return error(new WrongNumberOfArgumentsException(this));
    }

    @Override
    public SubLObject execute(SubLObject[] args)
    {
        return error(new WrongNumberOfArgumentsException(this));
    }

    @Override
    public String writeToString()
    {
        SubLObject name = getLambdaName();
        final String typeOfName = " " + javaTypeOf();
        if (name != null && name != NIL) {
            StringBuffer sb = new StringBuffer("#<FUNCTION ");
            sb.append(name.writeToString());
            sb.append(" {");
            sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
            sb.append(typeOfName);
            sb.append("}>");
            return sb.toString();
        }
        // No name.
        SubLObject lambdaList = getLambdaList();
        if (lambdaList != null) {
            StringBuffer sb = new StringBuffer("#<FUNCTION ");
            sb.append("(LAMBDA ");
            if (lambdaList == NIL) {
                sb.append("()");
            } else {
                final LispThread thread = LispThread.currentThread();
                final SpecialBindingsMark mark = thread.markSpecialBindings();
                thread.bindSpecial(LispSymbols.PRINT_LENGTH, Fixnum.THREE);
                try {
                    sb.append(lambdaList.writeToString());
                }
                finally {
                    thread.resetSpecialBindings(mark);
                }
            }
            sb.append(")");
            sb.append(" {");
            sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());            
            sb.append(typeOfName);
            sb.append("}>");
            return sb.toString();
        }
        return unreadableString("FUNCTION"+typeOfName);
    }

    private String javaTypeOf() {
    	Class c =  getClass();
    	String s = c.getSimpleName();
    	if (s == null || s.length()==0)  {
    		s = c.getName();
    		int li = s.lastIndexOf('.');
    		if (li>2) {
    			s = s.substring(li+1);
    		}
    	}
    	return s +" as "+ c.getSuperclass().getSimpleName();
		}

		// Used by the JVM compiler.
    public final void argCountError()
    {
        error(new WrongNumberOfArgumentsException(this));
    }

    // Profiling.
    public final int[] callCount = new int[12];

  	@Override
    public SubLObject getCallCount()
    {
  	  return Profiler.makeCallCounts(callCount);
    }
    
    @Override
    public void setCallCount(int n)
    {
        callCount[0] = n;
    }


  	@Override
  	public void incrementCallCount(int arity) {
  		if (arity>10) arity = -1;
  		callCount[arity+1]++;
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

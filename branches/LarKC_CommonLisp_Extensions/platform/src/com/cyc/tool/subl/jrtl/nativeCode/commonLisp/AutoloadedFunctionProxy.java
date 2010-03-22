/*
 * AutoloadedFunctionProxy.java
 *
 * Copyright (C) 2009 Erik Huelsmann
 * $Id: AutoloadedFunctionProxy.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import java.util.Hashtable;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class AutoloadedFunctionProxy extends Function {

    public enum FunctionType
    {
        NORMAL, SETF, MACRO
    };

    /** List of symbols that need to be saved upon instantiation of a
     * proxy and restored while loading the actual function.
     */
    final static SubLSymbol[] symsToSave =
        new SubLSymbol[]
        {
            AUTOLOADING_CACHE, // allow loading local preloaded functions
            Load._FASL_ANONYMOUS_PACKAGE_, // package for uninterned symbols
            LispSymbols._PACKAGE_,              // current package
            LispSymbols.LOAD_TRUENAME           // LOAD-TIME-VALUE depends on this
        };

    final private SubLSymbol symbol;
    final private String name;
    final private SubLObject cache;
    final private SubLObject[] savedSyms;
    final private FunctionType fType;
    Function fun = null;

    public AutoloadedFunctionProxy(SubLSymbol symbol, SubLObject name,
                                   SubLObject cache,
                                   SubLObject[] savedSyms,
                                   FunctionType ft) {
        super();
        this.symbol = symbol;
        this.name = name.getString();
        this.cache = cache;
        this.savedSyms = savedSyms;
        Debug.assertTrue(! (cache instanceof Nil));
        this.fType = ft;
    }

    /** Resolve this instance by returning the function we're proxy for */
    @Override
    public SubLObject resolve() {
        return load();
    }

    public SubLObject getCallCount() {
    	if (fun!=null) return fun.getCallCount();
    	return super.getCallCount();
    }

  	@Override
  	public void incrementCallCount(int arity) {
  		if (arity>10) arity = -1;
  		callCount[arity+1]++;
  		if (fun!=null) fun.incrementCallCount(arity);
  		else super.incrementCallCount(arity);
  	}
  	
    final private synchronized Function load() {
        if (fun != null)
            return fun;

        
        LispThread thread = LispThread.currentThread();
        SpecialBindingsMark mark = thread.markSpecialBindings();

        for (int i = 0; i < symsToSave.length; i++)
            thread.bindSpecial(symsToSave[i], savedSyms[i]);

        // set a specific reader environment, because we may be triggered in
        // any undefined dynamic environment; we want something predictable
        thread.bindSpecial(LispSymbols.READ_SUPPRESS, NIL);
        thread.bindSpecial(LispSymbols.READ_EVAL, T);
        thread.bindSpecial(LispSymbols.READ_BASE, LispObjectFactory.makeInteger(10));
        // don't need to bind *READ-DEFAULT-FLOAT-FORMAT*,
        // because DUMP-FORM sets it to NIL, forcing exponent markers everywhere

        try {
        if (Site.useForNameLoader) {
        	SubLObject o = Lisp.loadCompiledFunction(name);
        	if (o instanceof Function) {
        		fun = (Function)o;
          if (symbol != null)
            installFunction(fType, symbol, fun);          
          return fun;
        	}
        }
        byte[] classbytes =
            (byte[])((Hashtable)cache.javaInstance()).get(name);
            fun = loadClassBytes(classbytes);
        }
        catch (Throwable t) {
            Debug.trace(t);
        } // ### fixme
        finally {
            thread.resetSpecialBindings(mark);
        }

        if (symbol != null)
            installFunction(fType, symbol, fun);

        return fun;
    }

    final static private void installFunction(FunctionType fType,
                                              SubLSymbol sym, Function fun) {

        if (fType == FunctionType.SETF)
        	Lisp.put(sym, LispSymbols.SETF_FUNCTION, fun);
        else if (fType == FunctionType.MACRO) {
            if (sym.getSymbolFunction() instanceof SpecialOperator)
            	Lisp.put(sym, LispSymbols.MACROEXPAND_MACRO,
                    new MacroObject(sym, fun));
            else
                sym.setSymbolFunction(new MacroObject(sym, fun));
        } else
            sym.setSymbolFunction(fun);
    }

    @Override
    public SubLObject execute()
    {
        return load().execute();
    }

    @Override
    public SubLObject execute(SubLObject arg)
    {
        return load().execute(arg);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second)

    {
        return load().execute(first, second);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third)

    {
        return load().execute(first, second, third);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth)

    {
        return load().execute(first, second, third, fourth);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth,
                              SubLObject fifth)

    {
        return load().execute(first, second, third, fourth, fifth);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth,
                              SubLObject fifth, SubLObject sixth)

    {
        return load().execute(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth,
                              SubLObject fifth, SubLObject sixth,
                              SubLObject seventh)

    {
        return load().execute(first, second, third, fourth, fifth, sixth,
                              seventh);
    }

    @Override
    public SubLObject execute(SubLObject first, SubLObject second,
                              SubLObject third, SubLObject fourth,
                              SubLObject fifth, SubLObject sixth,
                              SubLObject seventh, SubLObject eighth)

    {
        return load().execute(first, second, third, fourth, fifth, sixth,
                              seventh, eighth);
    }

    @Override
    public SubLObject execute(SubLObject[] args)
    {
        return load().execute(args);
    }
    
    @Override
    public String writeToString() {
    	return resolve().writeToString();
    }

    @Override
    public SubLObject typeOf() {
    	return resolve().typeOf();
    }
    
    @Override
    public SubLObject typep(SubLObject typeSpecifier) {
    	return super.typep(typeSpecifier) == T?T:resolve().typep(typeSpecifier);
    }

    @Override
    public SubLObject classOf() {
    	return resolve().classOf();
    }
    
    @Override
    public boolean equalp(SubLObject obj) {
      return super.equalp(obj) || resolve().equalp(obj);
    }
    @Override
    public boolean equal(SubLObject obj) {
      return super.equal(obj) || resolve().equal(obj);
    }
    
    @SuppressWarnings("unchecked")
    final public static SubLObject loadPreloadedFunction(String name) {

      LispThread thread = LispThread.currentThread();
      SubLObject value = AUTOLOADING_CACHE.symbolValue(thread);

      if (value instanceof Nil) {
          byte[] bytes = readFunctionBytes(new Pathname(name));
          return (bytes == null) ? null : loadClassBytes(bytes);
      }

      Hashtable cache = (Hashtable)value.javaInstance();
      byte[] bytes = (byte[])cache.get(name);
      if (bytes == null)
          return error(new LispError("Function '" + name + "' not preloaded" +
                                     " while preloading requested."));
      try {
        return loadClassBytes(bytes);
      }
      catch (VerifyError e)
      {
        return error(new LispError("Class verification failed: " +
                                   e.getMessage()));
      }
      catch (Throwable t)
      {
        Debug.trace(t);
      }
      return error(new FileError("Can't read file off stream."));
    }


		final static SubLObject makePreloadingContext() {
        return new ABCLJavaObject(new Hashtable());
    }

    // ### proxy-preloaded-function symbol name => function
    final private static Primitive PROXY_PRELOADED_FUNCTION = new proxy_preloaded_function();
    final private static class proxy_preloaded_function extends JavaPrimitive {
        proxy_preloaded_function() {
            super("proxy-preloaded-function", PACKAGE_SYS, false,
                  "symbol name");
        }
        @Override
        final public SubLObject execute(SubLObject symbol, SubLObject name) {
            LispThread thread = LispThread.currentThread();
            SubLSymbol sym;
            Function fun;
            FunctionType fType = FunctionType.NORMAL;

            if (symbol instanceof SubLSymbol)
                sym = (SubLSymbol)symbol;
            else if (isValidSetfFunctionName(symbol)) {
                sym = (SubLSymbol)symbol.second();
                fType = FunctionType.SETF;
            } else if (isValidMacroFunctionName(symbol)) {
                sym = (SubLSymbol)symbol.second();
                fType = FunctionType.MACRO;
            } else {
                checkSymbol(symbol); // generate an error
                return null; // not reached
            }

            SubLObject cache = AUTOLOADING_CACHE.symbolValue(thread);
            if (cache instanceof Nil)
                // during EVAL-WHEN :compile-toplevel, this function will
                // be called without a caching environment; we'll need to
                // forward to the compiled function loader
                return loadCompiledFunction(name.getString());
            else {
                SubLObject[] cachedSyms = new SubLObject[symsToSave.length];
                for (int i = 0; i < symsToSave.length; i++)
                    cachedSyms[i] = symsToSave[i].symbolValue(thread);

                fun = new AutoloadedFunctionProxy(sym, name, cache,
                                                  cachedSyms, fType);
                fun.setClassBytes((byte[])((Hashtable)cache.javaInstance())
                                  .get(name.getString()));
            }
            return fun;
        }
    }

    //  ### function-preload name => success
    final private static Primitive FUNCTION_PRELOAD = new function_preload();
    private static class function_preload extends JavaPrimitive {
        function_preload() {
            super("function-preload", PACKAGE_SYS, false, "name");
        }
        @SuppressWarnings("unchecked")
        @Override
        final public SubLObject execute(SubLObject name) {
        	if (Site.useForNameLoader) return T;
            String namestring = name.getString();
            LispThread thread = LispThread.currentThread();
            Hashtable cache
                = (Hashtable)AUTOLOADING_CACHE.symbolValue(thread).javaInstance();

            Pathname pathname = new Pathname(namestring);
            byte[] bytes = readFunctionBytes(pathname);
            cache.put(namestring, bytes);
            
            return T;
        }
    }
}

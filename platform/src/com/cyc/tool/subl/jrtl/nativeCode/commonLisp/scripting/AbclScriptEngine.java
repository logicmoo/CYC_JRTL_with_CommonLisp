/*
 * AbclScriptEngine.java
 *
 * Copyright (C) 2008 Alessio Stalla
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
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp.scripting;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.math.BigInteger;
import java.util.Map;
import java.util.Properties;

import javax.script.*;


import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.scripting.util.ReaderInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.scripting.util.WriterOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;


public class AbclScriptEngine extends AbstractScriptEngine implements Invocable, Compilable {

    private Interpreter interpreter;
    /**
     * The function used to evaluate a string of code.
     */
    private Function evalScript;
    /**
     * The function used to evaluate a Lisp function.
     */
    private Function evalFunction;
    /**
     * The function used to compile Lisp code.
     */
    private Function compileScript;
    /**
     * The function used to evaluate a compiled script.
     */
    Function evalCompiledScript;

    protected AbclScriptEngine() {
	interpreter = Interpreter.getInstance();
	if(interpreter == null) {
	    interpreter = Interpreter.createInstance();
	}
	loadFromClasspath("/com/cyc/tool/subl/jrtl/nativeCode/commonLisp/scripting/lisp/packages.lisp");
	loadFromClasspath("/com/cyc/tool/subl/jrtl/nativeCode/commonLisp/scripting/lisp/abcl-script.lisp");
	loadFromClasspath("/com/cyc/tool/subl/jrtl/nativeCode/commonLisp/scripting/lisp/config.lisp");
	if(getClass().getResource("/abcl-script-config.lisp") != null) {
	    System.out.println("ABCL: loading configuration from " + getClass().getResource("/abcl-script-config.lisp"));
	    loadFromClasspath("/abcl-script-config.lisp");
	}
	((Function) interpreter.eval("#'abcl-script:configure-abcl")).execute(RuntimeClass.makeLispObject(this));
	System.out.println("ABCL: configured");
	evalScript = (Function) this.findSymbol("EVAL-SCRIPT", "ABCL-SCRIPT").getSymbolFunction();
	compileScript = (Function) this.findSymbol("COMPILE-SCRIPT", "ABCL-SCRIPT").getSymbolFunction();
	evalCompiledScript = (Function) this.findSymbol("EVAL-COMPILED-SCRIPT", "ABCL-SCRIPT").getSymbolFunction();
	evalFunction = (Function) this.findSymbol("EVAL-FUNCTION", "ABCL-SCRIPT").getSymbolFunction();
    }
    
    public Interpreter getInterpreter() {
	return interpreter;
    }

    public void setStandardInput(InputStream stream, LispThread thread) {
	thread.setSpecialVariable(LispSymbols.STANDARD_INPUT, makeStream(LispSymbols.SYSTEM_STREAM, stream,	LispSymbols.CHARACTER, true));
    }
    
    public void setStandardInput(InputStream stream) {
	setStandardInput(stream, LispThread.currentThread());
    }
    
    public void setInterpreter(Interpreter interpreter) {
	this.interpreter = interpreter;
    }

    public static String escape(String s) {
	StringBuffer b = new StringBuffer();
	int len = s.length();
	char c;
	for (int i = 0; i < len; ++i) {
	    c = s.charAt(i);
	    if (c == '\\' || c == '"') {
		b.append('\\');
	    }
	    b.append(c);
	}
	return b.toString();
    }

	public SubLObject loadFromClasspath(String classpathResource) {
		InputStream istream = getClass().getResourceAsStream(classpathResource);
		LispStream stream = makeStream(LispSymbols.SYSTEM_STREAM, istream, LispSymbols.CHARACTER);
		return load(stream);
	}

	public SubLObject load(LispStream stream) {
		SubLSymbol keyword_verbose = Lisp.internKeyword("VERBOSE");
		SubLSymbol keyword_print = Lisp.internKeyword("PRINT");
		/*
		 * load (filespec &key (verbose *load-verbose*) (print *load-print*)
		 * (if-does-not-exist t) (external-format :default)
		 */
		return LispSymbols.LOAD.getSymbolFunction().execute(
				new SubLObject[] { stream, keyword_verbose, Lisp.NIL,
						keyword_print, Lisp.T, Keyword.IF_DOES_NOT_EXIST,
						Lisp.T, Keyword.EXTERNAL_FORMAT, Keyword.DEFAULT });
	}

	public SubLObject load(String filespec) {
		return load(filespec, true);
	}

	public SubLObject load(String filespec, boolean compileIfNecessary) {
		if (isCompiled(filespec) || !compileIfNecessary) {
			return interpreter.eval("(load \"" + escape(filespec) + "\")");
		} else {
			return compileAndLoad(filespec);
		}
	}

	public static boolean isCompiled(String filespec) {
		if (filespec.endsWith(".abcl")) {
			return true;
		}
		File source;
		File compiled;
		if (filespec.endsWith(".lisp")) {
			source = new File(filespec);
			compiled = new File(filespec.substring(0, filespec.length() - 5)
					+ ".abcl");
		} else {
			source = new File(filespec + ".lisp");
			compiled = new File(filespec + ".abcl");
		}
		if (!source.exists()) {
			throw new IllegalArgumentException("The source file " + filespec + " cannot be found");
		}
		return compiled.exists()
				&& compiled.lastModified() >= source.lastModified();
	}

	public SubLObject compileFile(String filespec) {
		return interpreter.eval("(compile-file \"" + escape(filespec) + "\")");
	}

	public SubLObject compileAndLoad(String filespec) {
		return interpreter.eval("(load (compile-file \"" + escape(filespec)	+ "\"))");
	}

	public static boolean functionp(SubLObject obj) {
		return obj instanceof Function;
	}

	public JavaObject jsetq(String symbol, Object value) {
		SubLSymbol s = findSymbol(symbol);
		JavaObject jo;
		if (value instanceof JavaObject) {
			jo = (JavaObject) value;
		} else {
			jo = new ABCLJavaObject(value);
		}
		s.setSymbolValue((SubLObject)jo);
		return jo;
	}

	public SubLSymbol findSymbol(String name, String pkg) {
		SubLCons values = (SubLCons) (interpreter.eval("(cl:multiple-value-list (find-symbol (symbol-name '#:"
											   + escape(name) + ")" + (pkg == null ? "" : " :" + escape(pkg))
											   + "))"));
		if(values.second() == Lisp.NIL) {
			return null;
		} else {
			return (SubLSymbol) values.first();
		}
	}

	public SubLSymbol findSymbol(String name) {
		//Known bug: doesn't handle escaped ':' e.g. |a:b|
		int i = name.indexOf(':');
		if(i < 0) { 
			return findSymbol(name, null);
		} else {
		    if((i < name.length() - 1) && (name.charAt(i + 1) == ':')) {
			return findSymbol(name.substring(i + 2), name.substring(0, i));
		    } else {
			return findSymbol(name.substring(i + 1), name.substring(0, i));
		    }
		}
	}
	
	public Function findFunction(String name) {
		return (Function) interpreter.eval("#'" + name);
	}

	public Bindings createBindings() {
		return new SimpleBindings();
	}

    private static SubLObject makeBindings(Bindings bindings) {
		if (bindings == null || bindings.size() == 0) {
			return Lisp.NIL;
		}
		SubLObject[] argList = new SubLObject[bindings.size()];
		int i = 0;
		for (Map.Entry<String, Object> entry : bindings.entrySet()) {
			argList[i++] = LispSymbols.CONS.execute(makeString(entry.getKey()),
					ABCLJavaObject.makeJavaObject(entry.getValue(), true));
		}
		return LispSymbols.LIST.getSymbolFunction().execute(argList);
	}

    Object eval(Function evaluator, SubLObject code, ScriptContext ctx) throws ScriptException {
	ReaderInputStream in = null;
	WriterOutputStream out = null;
	SubLObject retVal = null;
	try {
	    in = new ReaderInputStream(ctx.getReader());
	    out = new WriterOutputStream(ctx.getWriter());
	    LispStream outStream = makeStream(LispSymbols.SYSTEM_STREAM, out, LispSymbols.CHARACTER);
	    LispStream inStream  = makeStream(LispSymbols.SYSTEM_STREAM, in,  LispSymbols.CHARACTER);
	    retVal = evaluator.execute(makeBindings(ctx.getBindings(ScriptContext.GLOBAL_SCOPE)),
				       makeBindings(ctx.getBindings(ScriptContext.ENGINE_SCOPE)),
				       inStream, outStream,
				       code, new ABCLJavaObject(ctx));
	    return retVal.javaInstance();
	} catch (IOException e) {
	    throw new ScriptException(e);
	}
    }
	

	public Object eval(String code, ScriptContext ctx) throws ScriptException {
		return eval(evalScript, makeString(code), ctx);
	}

	private static String toString(Reader reader) throws IOException {
		StringWriter w = new StringWriter();
		int i;
		i = reader.read();
		while (i != -1) {
			w.write(i);
			i = reader.read();
		}
		return w.toString();
	}
	
	public Object eval(Reader code, ScriptContext ctx) throws ScriptException {
		try {
			return eval(toString(code), ctx);
		} catch (IOException e) {
			return new ScriptException(e);
		}
	}

	public ScriptEngineFactory getFactory() {
		return new AbclScriptEngineFactory();
	}
	
	public <T> T getInterface(Class<T> clasz) {
		try {
			return getInterface(eval("(cl:find-package '#:ABCL-SCRIPT-USER)"), clasz);
		} catch (ScriptException e) {
			throw new Error(e);
		}
	}

	@SuppressWarnings("unchecked")
	public <T> T getInterface(Object thiz, Class<T> clasz) {
	    SubLSymbol s = findSymbol("jmake-proxy", "JAVA");
	    JavaObject iface = new ABCLJavaObject(clasz);
	    return (T) ((JavaObject) s.execute((SubLObject)iface, (SubLObject) thiz)).javaInstance();
	}
	
    public Object invokeFunction(String name, Object... args) throws ScriptException, NoSuchMethodException {
	SubLSymbol s;
	if(name.indexOf(':') >= 0) {
	    s = findSymbol(name);
	} else {
	    s = findSymbol(name, "ABCL-SCRIPT-USER");
	}
	if(s != null) {
	    SubLObject f = s.getSymbolFunction();
	    if(f != null && f instanceof Function) {
		SubLObject functionAndArgs = Lisp.NIL.push(f);
		for(int i = 0; i < args.length; ++i) {
		    functionAndArgs = functionAndArgs.push(ABCLJavaObject.makeJavaObject(args[i], true));
		}
		functionAndArgs = functionAndArgs.reverse();
		return eval(evalFunction, functionAndArgs, getContext());
	    } else {
		throw new NoSuchMethodException(name);
	    }
	} else {
	    throw new NoSuchMethodException(name);
	}
    }

    public Object invokeMethod(Object thiz, String name, Object... args) throws ScriptException, NoSuchMethodException {
	throw new UnsupportedOperationException("Common Lisp does not have methods in the Java sense. Use invokeFunction instead.");
    }

    public class AbclCompiledScript extends CompiledScript {

	private SubLObject function;
	
	public AbclCompiledScript(SubLObject function) {
	    this.function = function;
	}
	
	@Override
	public Object eval(ScriptContext context) throws ScriptException {
	    return AbclScriptEngine.this.eval(evalCompiledScript, function, context);
	}
	
	@Override
	public ScriptEngine getEngine() {
	    return AbclScriptEngine.this;
	}
	
    }

	
	public CompiledScript compile(String script) throws ScriptException {
		try {
		    Function f = (Function) compileScript.execute(makeString(script));
		    return new AbclCompiledScript(f);
		} catch(ClassCastException e) {
			throw new ScriptException(e);
		}
	}

	public CompiledScript compile(Reader script) throws ScriptException {
		try {
			return compile(toString(script));
		} catch (IOException e) {
			throw new ScriptException(e);
		}
	}

}

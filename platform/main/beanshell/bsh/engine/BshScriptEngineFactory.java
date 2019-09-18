package bsh.engine;

import java.util.Arrays;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;

import bsh.Interpreter;
import bsh.StringUtil;

//  Adopted from http://ikayzo.org/svn/beanshell/BeanShell/engine/src/bsh/engine/BshScriptEngineFactory.java
public class BshScriptEngineFactory implements ScriptEngineFactory {
	// Begin impl ScriptEnginInfo

	final List<String> extensions = Arrays.asList("bsh");

	final List<String> mimeTypes = Arrays.asList("application/x-beanshell", "application/x-bsh");

	final List<String> names = Arrays.asList("beanshell", "bsh");

	@Override
	public String getEngineName() {
		return "BeanShell Engine";
	}

	@Override
	public String getEngineVersion() {
		return Interpreter.VERSION;
	}

	@Override
	public List<String> getExtensions() {
		return extensions;
	}

	@Override
	public List<String> getMimeTypes() {
		return mimeTypes;
	}

	@Override
	public List<String> getNames() {
		return names;
	}

	@Override
	public String getLanguageName() {
		return "BeanShell";
	}

	@Override
	public String getLanguageVersion() {
		return Interpreter.VERSION;
	}

	@Override
	public Object getParameter(String param) {
		if (param.equals(ScriptEngine.ENGINE)) {
			return getEngineName();
		}
		if (param.equals(ScriptEngine.ENGINE_VERSION)) {
			return getEngineVersion();
		}
		if (param.equals(ScriptEngine.NAME)) {
			return getEngineName();
		}
		if (param.equals(ScriptEngine.LANGUAGE)) {
			return getLanguageName();
		}
		if (param.equals(ScriptEngine.LANGUAGE_VERSION)) {
			return getLanguageVersion();
		}
		if (param.equals("THREADING")) {
			return "MULTITHREADED";
		}

		return null;
	}

	@Override
	public String getMethodCallSyntax(String objectName, String methodName, String... args) {
		StringBuffer sb = new StringBuffer();
		if (objectName != null)
			sb.append(objectName).append('.');
		sb.append(StringUtil.methodString(methodName, args)).append(";");
		return sb.toString();
	}

	@Override
	public String getOutputStatement(String message) {
		return "print(\"" + message + "\");";
	}

	@Override
	public String getProgram(String... statements) {
		StringBuffer sb = new StringBuffer();
		for (final String statement : statements) {
			sb.append(statement);
			if (!statement.endsWith(";")) {
				sb.append(";");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	// End impl ScriptEngineInfo

	// Begin impl ScriptEngineFactory

	@Override
	public ScriptEngine getScriptEngine() {
		return new BshScriptEngine();
	}

	// End impl ScriptEngineFactory
}

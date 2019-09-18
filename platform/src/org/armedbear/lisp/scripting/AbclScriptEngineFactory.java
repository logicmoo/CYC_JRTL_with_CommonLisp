/*
 * AbclScriptEngineFactory.java
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

package org.armedbear.lisp.scripting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;

import org.armedbear.lisp.Version;

public class AbclScriptEngineFactory implements ScriptEngineFactory {

	// Begin impl ScriptEnginInfo

	/**
	 *
	 */
	private static final String ANSI_X3_226_1994 = "ANSI X3.226:1994";

	final List<String> mimeTypes = Collections.unmodifiableList(Arrays.asList("application/x-lisp", "application/x-abcl"));

	final List<String> names = Collections.unmodifiableList(Arrays.asList("ABCL", "cl", "Lisp", "Common Lisp", "lsp"));

	final List<String> extensions = Collections.unmodifiableList(Arrays.asList("cl", "lisp", "lsp"));

	// End impl ScriptEngineFactory
    private static AbclScriptEngine THE_ONLY_ONE_ENGINE = null;

	@Override
    public String getEngineName() {
	return "ABCL Script";
    }

	@Override
    public String getEngineVersion() {
		return Version.getVersion();
    }

	@Override
    public List<String> getExtensions() {
		return extensions;
    }

	@Override
    public String getLanguageName() {
	return "ANSI Common Lisp";
    }

	@Override
    public String getLanguageVersion() {
		return ANSI_X3_226_1994;
    }

    public static String escape(String raw) {
	StringBuilder sb = new StringBuilder();
	int len = raw.length();
	char c;
	for(int i = 0; i < len; ++i) {
	    c = raw.charAt(i);
	    if(c != '"') {
		sb.append(c);
	    } else {
		sb.append("\\\"");
	    }
	}
	return sb.toString();
    }

	@Override
	public String getMethodCallSyntax(String obj, String method, String... args) {
	StringBuilder sb = new StringBuilder();
	sb.append("(jcall \"");
	sb.append(method);
	sb.append("\" ");
	sb.append(obj);
	for(String arg : args) {
	    sb.append(" ");
	    sb.append(arg);
	}
	sb.append(")");
	return sb.toString();
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
    public String getOutputStatement(String str) {
		return "(cl:print \"" + escape(str) + "\")";
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
	public String getProgram(String... statements) {
	StringBuilder sb = new StringBuilder();
	sb.append("(cl:progn");
	for(String stmt : statements) {
	    sb.append("\n\t");
	    sb.append(stmt);
	}
	sb.append(")");
	return sb.toString();
    }

	@Override
    public synchronized ScriptEngine getScriptEngine() {
        if (THE_ONLY_ONE_ENGINE == null) {
            THE_ONLY_ONE_ENGINE = new AbclScriptEngine();
        }
	return THE_ONLY_ONE_ENGINE;
    }

}

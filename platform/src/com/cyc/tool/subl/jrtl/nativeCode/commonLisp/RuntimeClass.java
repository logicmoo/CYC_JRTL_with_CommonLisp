/*
 * RuntimeClass.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: RuntimeClass.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import java.util.HashMap;
//import org.objectweb.asm.Opcodes;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class RuntimeClass {
	static Map<String, RuntimeClass> classes = new HashMap<String, RuntimeClass>();

	// ### %jnew-runtime-class
	// %jnew-runtime-class class-name &rest method-names-and-defs
	private static Primitive _JNEW_RUNTIME_CLASS = new JavaPrimitive("%jnew-runtime-class", Lisp.PACKAGE_JAVA, false,
			"class-name &rest method-names-and-defs") {

		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length < 3 || length % 2 != 1)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			RuntimeClass rc = new RuntimeClass();
			String className = args[0].getString();
			for (int i = 1; i < length; i = i + 2) {
				String methodName = args[i].getString();
				rc.addLispMethod(methodName, (Function) args[i + 1]);
			}
			RuntimeClass.classes.put(className, rc);
			return Lisp.T;
		}
	};

	// ### jredefine-method
	// %jredefine-method class-name method-name method-def
	private static Primitive _JREDEFINE_METHOD = new JavaPrimitive("%jredefine-method", Lisp.PACKAGE_JAVA, false,
			"class-name method-name method-def") {

		public SubLObject execute(SubLObject className, SubLObject methodName, SubLObject methodDef)

		{

			String cn = className.getString();
			String mn = methodName.getString();
			Function def = (Function) methodDef;
			RuntimeClass rc = null;
			if (RuntimeClass.classes.containsKey(cn)) {
				rc = RuntimeClass.classes.get(cn);
				rc.addLispMethod(mn, def);
				return Lisp.T;
			} else {
				Lisp.error(new LispError("undefined Java class: " + cn));
				return Lisp.NIL;
			}
		}
	};

	// ### %load-java-class-from-byte-array
	private static Primitive _LOAD_JAVA_CLASS_FROM_BYTE_ARRAY = new JavaPrimitive("%load-java-class-from-byte-array",
			Lisp.PACKAGE_JAVA, false, "classname bytearray") {

		public SubLObject execute(SubLObject className, SubLObject classBytes)

		{
			String cn = className.getString();
			String pn = cn.substring(0, cn.lastIndexOf('.'));
			byte[] cb = (byte[]) classBytes.javaInstance();
			try {
				JavaClassLoader loader = JavaClassLoader.getPersistentInstance(pn);
				Class c = loader.loadClassFromByteArray(cn, cb);
				if (c != null)
					return Lisp.T;
			} catch (VerifyError e) {
				return Lisp.error(new LispError("class verification failed: " + e.getMessage()));
			} catch (LinkageError e) {
				return Lisp.error(new LispError("class could not be linked: " + e.getMessage()));
			}
			return Lisp.error(new LispError("unable to load ".concat(cn)));
		}
	};

	public static SubLObject evalC(SubLObject function, SubLObject args, Environment env, LispThread thread)

	{
		return Lisp.evalCall(function, args, env, thread);
	}

	public static RuntimeClass getRuntimeClass(String className) {
		return RuntimeClass.classes.get(className);
	}

	public static SubLObject makeLispObject(boolean i) {
		return i ? Lisp.T : Lisp.NIL;
	}

	public static Fixnum makeLispObject(byte i) {
		return LispObjectFactory.makeInteger(i);
	}

	public static LispCharacter makeLispObject(char i) {
		return LispCharacter.makeChar(i);
	}

	public static DoubleFloat makeLispObject(double i) {
		return LispObjectFactory.makeDouble(i);
	}

	public static SingleFloat makeLispObject(float i) {
		return LispObjectFactory.makeSingle(i);
	}

	public static Fixnum makeLispObject(int i) {
		return LispObjectFactory.makeInteger(i);
	}

	public static LispInteger makeLispObject(long i) {
		return LispObjectFactory.makeBignum(i);
	}

	public static SubLObject makeLispObject(Object obj) {
		return new ABCLJavaObject(obj);
	}

	public static Fixnum makeLispObject(short i) {
		return LispObjectFactory.makeInteger(i);
	}

	private Map<String, Function> methods = new HashMap<String, Function>();

	void addLispMethod(String methodName, Function def) {
		this.methods.put(methodName, def);
	}

	public Function getLispMethod(String methodName) {
		return this.methods.get(methodName);
	}
}

/*
 * JProxy.java
 *
 * Copyright (C) 2002-2005 Peter Graves, Andras Simon
 * $Id: JProxy.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class JProxy {
	private static class Entry {
		Class iface;
		Map lispDefinedMethods;

		public Entry(Class iface, Map lispDefinedMethods) {
			this.iface = iface;
			this.lispDefinedMethods = lispDefinedMethods;
		}

		public Function getLispMethod(String methodName) {
			if (this.lispDefinedMethods.containsKey(methodName))
				return (Function) this.lispDefinedMethods.get(methodName);
			return null;
		}
	}

	private static class LispHandler implements InvocationHandler {
		Map table1;

		LispHandler(Map table) {
			this.table1 = table;
		}

		public Object invoke(Object proxy, Method method, Object[] args) {
			String methodName = method.getName();

			if (methodName.equals("hashCode"))
				return new Integer(System.identityHashCode(proxy));
			if (methodName.equals("equals"))
				return proxy == args[0] ? Boolean.TRUE : Boolean.FALSE;
			if (methodName.equals("toString"))
				return proxy.getClass().getName() + '@' + Integer.toHexString(proxy.hashCode());

			if (this.table1.containsKey(proxy)) {
				Entry entry = (Entry) this.table1.get(proxy);
				Function f = entry.getLispMethod(methodName);
				if (f != null) {
					SubLObject lispArgs = Lisp.NIL;
					if (args != null)
						for (int i = args.length - 1; 0 <= i; i--)
							lispArgs = lispArgs.push(new ABCLJavaObject(args[i]));
					SubLObject result = Lisp.evalCall(f, lispArgs, new Environment(), LispThread.currentThread());
					return method.getReturnType() == void.class ? null : result.javaInstance();
				}
			}
			return null;
		}
	}

	public static class LispInvocationHandler implements InvocationHandler {

		private static Method hashCodeMethod;
		private static Method equalsMethod;
		private static Method toStringMethod;
		static {
			try {
				LispInvocationHandler.hashCodeMethod = Object.class.getMethod("hashCode", new Class[] {});
				LispInvocationHandler.equalsMethod = Object.class.getMethod("equals", new Class[] { Object.class });
				LispInvocationHandler.toStringMethod = Object.class.getMethod("toString", new Class[] {});
			} catch (Exception e) {
				throw new Error("Something got horribly wrong - can't get a method from Object.class", e);
			}
		}

		private Function function;

		public LispInvocationHandler(Function function) {
			this.function = function;
		}

		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			if (LispInvocationHandler.hashCodeMethod.equals(method))
				return System.identityHashCode(proxy);
			if (LispInvocationHandler.equalsMethod.equals(method))
				return proxy == args[0];
			if (LispInvocationHandler.toStringMethod.equals(method))
				return proxy.getClass().getName() + '@' + Integer.toHexString(proxy.hashCode());

			if (args == null)
				args = new Object[0];
			SubLObject lispArgs = Lisp.NIL;
			synchronized (JProxy.proxyMap) {
				lispArgs = lispArgs.push(JProxy.toLispObject(JProxy.proxyMap.get(proxy)));
			}
			lispArgs = lispArgs.push(LispObjectFactory.makeString(method.getName()));
			for (int i = 0; i < args.length; i++)
				lispArgs = lispArgs.push(JProxy.toLispObject(args[i]));
			Object retVal = LispThread.currentThread().execute(LispSymbols.APPLY, this.function, lispArgs.reverse())
					.javaInstance();
			// (function.execute(lispArgs)).javaInstance();
			/*
			 * DOES NOT WORK due to autoboxing! if(retVal != null &&
			 * !method.getReturnType().isAssignableFrom(retVal.getClass())) {
			 * return error(new TypeError(new JavaObject(retVal), new
			 * JavaObject(method.getReturnType()))); }
			 */
			return retVal;
		}
	}

	static Map<Object, Entry> table = new WeakHashMap<Object, Entry>();

	// NEW IMPLEMENTATION by Alessio Stalla

	// ### %jnew-proxy interface &rest method-names-and-defs
	private static Primitive _JNEW_PROXY = new JavaPrimitive("%jnew-proxy", Lisp.PACKAGE_JAVA, false,
			"interface &rest method-names-and-defs") {

		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length < 3 || length % 2 != 1)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			Map<String, Function> lispDefinedMethods = new HashMap<String, Function>();
			for (int i = 1; i < length; i += 2)
				lispDefinedMethods.put(args[i].getString(), (Function) args[i + 1]);
			Class iface = (Class) args[0].javaInstance();
			Object proxy = Proxy.newProxyInstance(iface.getClassLoader(), new Class[] { iface },
					new LispHandler(JProxy.table));
			JProxy.table.put(proxy, new Entry(iface, lispDefinedMethods));
			return new ABCLJavaObject(proxy);
		}
	};

	/**
	 * A weak map associating each proxy instance with a "Lisp-this" object.
	 */
	static Map<Object, SubLObject> proxyMap = new WeakHashMap<Object, SubLObject>();

	private static Primitive _JMAKE_INVOCATION_HANDLER = new JavaPrimitive("%jmake-invocation-handler",
			Lisp.PACKAGE_JAVA, false, "function") {

		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length != 1)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			if (!(args[0] instanceof Function))
				return Lisp.error(new TypeError(args[0], LispSymbols.FUNCTION));
			return new ABCLJavaObject(new LispInvocationHandler((Function) args[0]));
		}
	};

	private static Primitive _JMAKE_PROXY = new JavaPrimitive("%jmake-proxy", Lisp.PACKAGE_JAVA, false,
			"interface invocation-handler") {

		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length != 3)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			if (!(args[0] instanceof JavaObject) || !(((JavaObject) args[0]).javaInstance() instanceof Class))
				return Lisp.error(new TypeError(args[0], LispObjectFactory.makeString(Class.class.getName())));
			if (!(args[1] instanceof JavaObject)
					|| !(((JavaObject) args[1]).javaInstance() instanceof InvocationHandler))
				return Lisp
						.error(new TypeError(args[1], LispObjectFactory.makeString(InvocationHandler.class.getName())));
			Class<?> iface = (Class<?>) ((JavaObject) args[0]).javaInstance();
			InvocationHandler invocationHandler = (InvocationHandler) ((JavaObject) args[1]).javaInstance();
			Object proxy = Proxy.newProxyInstance(iface.getClassLoader(), new Class[] { iface }, invocationHandler);
			synchronized (JProxy.proxyMap) {
				JProxy.proxyMap.put(proxy, args[2]);
			}
			return new ABCLJavaObject(proxy);
		}
	};

	static SubLObject toLispObject(Object obj) {
		return obj instanceof SubLObject ? (SubLObject) obj : new ABCLJavaObject(obj);
	}

}

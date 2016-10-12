/*
 * Java.java
 *
 * Copyright (C) 2002-2006 Peter Graves, Andras Simon
 * $Id: Java.java 12561 2010-03-18 11:59:59Z mevenson $
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

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class JavaFunctions {
	private static class pf__jget_property_value extends JavaPrimitive {
		pf__jget_property_value() {
			super("%jget-property-value", Lisp.PACKAGE_JAVA, true, "java-object property-name");
		}

		public SubLObject execute(SubLObject javaObject, SubLObject propertyName) {
			try {
				Object obj = javaObject.javaInstance();
				PropertyDescriptor pd = JavaFunctions.getPropertyDescriptor(obj, propertyName);
				Object value = pd.getReadMethod().invoke(obj);
				if (value instanceof SubLObject)
					return (SubLObject) value;
				else if (value != null)
					return ABCLJavaObject.makeJavaObject(value, true);
				else
					return Lisp.NIL;
			} catch (Exception e) {
				return Lisp.error(new JavaException(e));
			}
		}
	}

	private static class pf__jset_property_value extends JavaPrimitive {
		pf__jset_property_value() {
			super("%jset-property-value", Lisp.PACKAGE_JAVA, true, "java-object property-name value");
		}

		public SubLObject execute(SubLObject javaObject, SubLObject propertyName, SubLObject value) {
			Object obj = null;
			try {
				obj = javaObject.javaInstance();
				PropertyDescriptor pd = JavaFunctions.getPropertyDescriptor(obj, propertyName);
				Object jValue;
				// TODO maybe we should do this in javaInstance(Class)
				if (value instanceof JavaObject)
					jValue = value.javaInstance();
				else if (Boolean.TYPE.equals(pd.getPropertyType()) || Boolean.class.equals(pd.getPropertyType()))
					jValue = value != Lisp.NIL;
				else
					jValue = value != Lisp.NIL ? value.javaInstance() : null;
				pd.getWriteMethod().invoke(obj, jValue);
				return value;
			} catch (Exception e) {
				return Lisp.error(new JavaException(e));
			}
		}
	}

	private static class pf_jarray_ref extends JavaPrimitive {
		pf_jarray_ref() {
			super("jarray-ref", Lisp.PACKAGE_JAVA, true, "java-array &rest indices");
		}

		public SubLObject execute(SubLObject[] args) {
			return JavaFunctions.jarray_ref(this, args, true);
		}
	}

	private static class pf_jarray_ref_raw extends JavaPrimitive {
		pf_jarray_ref_raw() {
			super("jarray-ref-raw", Lisp.PACKAGE_JAVA, true, "java-array &rest indices");
		}

		public SubLObject execute(SubLObject[] args) {
			return JavaFunctions.jarray_ref(this, args, false);
		}
	}

	private static class pf_jarray_set extends JavaPrimitive {
		pf_jarray_set() {
			super("jarray-set", Lisp.PACKAGE_JAVA, true, "java-array new-value &rest indices");
		}

		public SubLObject execute(SubLObject[] args) {
			if (args.length < 3)
				Lisp.error(new WrongNumberOfArgumentsException(this));
			try {
				Object a = args[0].javaInstance();
				SubLObject v = args[1];
				for (int i = 2; i < args.length - 1; i++)
					a = Array.get(a, ((Integer) args[i].javaInstance()).intValue());
				Array.set(a, ((Integer) args[args.length - 1].javaInstance()).intValue(), v.javaInstance());
				return v;
			} catch (Throwable t) { // no code -> no ControlTransfer
				SubLSymbol condition = JavaFunctions.getCondition(t.getClass());
				if (condition == null)
					Lisp.error(new JavaException(t));
				else
					LispSymbols.SIGNAL.execute(condition, Keyword.CAUSE, ABCLJavaObject.makeJavaObject(t),
							Keyword.FORMAT_CONTROL, LispObjectFactory.makeString(JavaFunctions.getMessage(t)));
			}
			// Not reached.
			return Lisp.NIL;
		}
	};

	private static class pf_java_object_p extends JavaPrimitive {
		pf_java_object_p() {
			super("java-object-p", Lisp.PACKAGE_JAVA, true, "object");
		}

		public SubLObject execute(SubLObject arg) {
			return arg instanceof JavaObject ? Lisp.T : Lisp.NIL;
		}
	}

	private static class pf_jcall extends JavaPrimitive {
		pf_jcall() {
			super(LispSymbols.JCALL, "method-ref instance &rest args");
		}

		public SubLObject execute(SubLObject[] args) {
			return JavaFunctions.jcall(this, args, true);
		}
	};

	private static class pf_jcall_raw extends JavaPrimitive {
		pf_jcall_raw() {
			super(LispSymbols.JCALL_RAW, "method-ref instance &rest args");
		}

		public SubLObject execute(SubLObject[] args) {
			return JavaFunctions.jcall(this, args, false);
		}
	}

	private static class pf_jclass extends JavaPrimitive {
		pf_jclass() {
			super(LispSymbols.JCLASS, "name-or-class-ref",
					"Returns a reference to the Java class designated by NAME-OR-CLASS-REF.");
		}

		public SubLObject execute(SubLObject arg) {
			return ABCLJavaObject.makeJavaObject(JavaFunctions.javaClass(arg));
		}
	}

	private static class pf_jcoerce extends JavaPrimitive {
		pf_jcoerce() {
			super("jcoerce", Lisp.PACKAGE_JAVA, true, "java-object intended-class");
		}

		public SubLObject execute(SubLObject javaObject, SubLObject intendedClass) {
			Object o = javaObject.javaInstance();
			Class<?> c = JavaFunctions.javaClass(intendedClass);
			try {
				return ABCLJavaObject.makeJavaObject(o, c);
			} catch (ClassCastException e) {
				return Lisp.error(new TypeError(javaObject, LispObjectFactory.makeString(c.getName())));
			}
		}
	};

	// ### jfield - retrieve or modify a field in a Java class or instance.
	//
	// Supported argument patterns:
	//
	// Case 1: class-ref field-name:
	// to retrieve the value of a static field.
	//
	// Case 2: class-ref field-name instance-ref:
	// to retrieve the value of a class field of the instance.
	//
	// Case 3: class-ref field-name primitive-value:
	// to store primitive-value in a static field.
	//
	// Case 4: class-ref field-name instance-ref value:
	// to store value in a class field of the instance.
	//
	// Case 5: class-ref field-name nil value:
	// to store value in a static field (when value may be
	// confused with an instance-ref).
	//
	// Case 6: field-name instance:
	// to retrieve the value of a field of the instance. The
	// class is derived from the instance.
	//
	// Case 7: field-name instance value:
	// to store value in a field of the instance. The class is
	// derived from the instance.
	//

	private static class pf_jconstructor extends JavaPrimitive {
		pf_jconstructor() {
			super("jconstructor", Lisp.PACKAGE_JAVA, true, "class-ref &rest parameter-class-refs");
		}

		public SubLObject execute(SubLObject[] args) {
			if (args.length < 1)
				Lisp.error(new WrongNumberOfArgumentsException(this));
			try {
				Class<?> c = JavaFunctions.javaClass(args[0]);
				int argCount = 0;
				if (args.length == 2 && args[1] instanceof Fixnum)
					argCount = args[1].intValue();
				else {
					Class<?>[] parameterTypes = new Class[args.length - 1];
					for (int i = 1; i < args.length; i++)
						parameterTypes[i - 1] = JavaFunctions.javaClass(args[i]);
					return ABCLJavaObject.makeJavaObject(c.getConstructor(parameterTypes));
				}
				// Parameter types not explicitly specified.
				Constructor[] constructors = c.getConstructors();
				for (int i = 0; i < constructors.length; i++) {
					Constructor constructor = constructors[i];
					if (constructor.getParameterTypes().length == argCount)
						return ABCLJavaObject.makeJavaObject(constructor);
				}
				throw new NoSuchMethodException();
			} catch (NoSuchMethodException e) {
				Lisp.error(new LispError("no such constructor"));
			} catch (ControlTransfer e) {
				throw e;
			} catch (Throwable t) { // ControlTransfer addressed above
				Lisp.error(new LispError(JavaFunctions.getMessage(t)));
			}
			// Not reached.
			return Lisp.NIL;
		}
	}

	private static class pf_jfield extends JavaPrimitive {
		pf_jfield() {
			super("jfield", Lisp.PACKAGE_JAVA, true, "class-ref-or-field field-or-instance &optional instance value");
		}

		public SubLObject execute(SubLObject[] args) {
			return JavaFunctions.jfield(this, args, true);
		}
	}

	private static class pf_jfield_raw extends JavaPrimitive {
		pf_jfield_raw() {
			super("jfield-raw", Lisp.PACKAGE_JAVA, true,
					"class-ref-or-field field-or-instance &optional instance value");
		}

		public SubLObject execute(SubLObject[] args) {
			return JavaFunctions.jfield(this, args, false);
		}
	};

	private static class pf_jmethod extends JavaPrimitive {
		pf_jmethod() {
			super("jmethod", Lisp.PACKAGE_JAVA, true, "class-ref name &rest parameter-class-refs");
		}

		public SubLObject execute(SubLObject[] args) {
			if (args.length < 2)
				Lisp.error(new WrongNumberOfArgumentsException(this));
			Class<?> c = JavaFunctions.javaClass(args[0]);
			String methodName = args[1].getString();
			try {
				int argCount = 0;
				if (args.length == 3 && args[2] instanceof Fixnum)
					argCount = ((Fixnum) args[2]).value;
				else {
					Class<?>[] parameterTypes = new Class[args.length - 2];
					for (int i = 2; i < args.length; i++)
						parameterTypes[i - 2] = JavaFunctions.javaClass(args[i]);
					return ABCLJavaObject.makeJavaObject(c.getMethod(methodName, parameterTypes));
				}
				// Parameter types were not explicitly specified.
				Method[] methods = c.getMethods();
				for (int i = 0; i < methods.length; i++) {
					Method method = methods[i];
					if (method.getName().equals(methodName) && method.getParameterTypes().length == argCount)
						return ABCLJavaObject.makeJavaObject(method);
				}
				throw new NoSuchMethodException();
			} catch (NoSuchMethodException e) {
				StringBuilder sb = new StringBuilder("No such method: ");
				sb.append(c.getName());
				sb.append('.');
				sb.append(methodName);
				sb.append('(');
				for (int i = 2; i < args.length; i++) {
					sb.append(args[i].writeToString());
					if (i < args.length - 1)
						sb.append(',');
				}
				sb.append(')');
				Lisp.error(new LispError(sb.toString()));
			} catch (ControlTransfer e) {
				throw e;
			} catch (Throwable t) { // ControlTransfer addressed above
				Lisp.error(new LispError(JavaFunctions.getMessage(t)));
			}
			// Not reached.
			return Lisp.NIL;
		}
	}

	private static class pf_jnew extends JavaPrimitive {
		pf_jnew() {
			super("jnew", Lisp.PACKAGE_JAVA, true, "constructor &rest args");
		}

		public SubLObject execute(SubLObject[] args) {
			if (args.length < 1)
				Lisp.error(new WrongNumberOfArgumentsException(this));
			SubLObject classRef = args[0];
			try {
				Constructor constructor;
				if (classRef instanceof SubLString)
					constructor = JavaFunctions.findConstructor(JavaFunctions.javaClass(classRef), args);
				else
					constructor = (Constructor) ABCLJavaObject.getObject(classRef);
				Class[] argTypes = constructor.getParameterTypes();
				Object[] initargs = new Object[args.length - 1];
				for (int i = 1; i < args.length; i++) {
					SubLObject arg = args[i];
					if (arg == Lisp.NIL)
						initargs[i - 1] = null;
					else
						initargs[i - 1] = arg.javaInstance(argTypes[i - 1]);
				}
				return ABCLJavaObject.makeJavaObject(constructor.newInstance(initargs));
			} catch (ControlTransfer c) {
				throw c;
			} catch (Throwable t) { // ControlTransfer handled above
				if (t instanceof InvocationTargetException)
					t = t.getCause();
				SubLSymbol condition = JavaFunctions.getCondition(t.getClass());
				if (condition == null)
					Lisp.error(new JavaException(t));
				else
					LispSymbols.SIGNAL.execute(condition, Keyword.CAUSE, ABCLJavaObject.makeJavaObject(t),
							Keyword.FORMAT_CONTROL, LispObjectFactory.makeString(JavaFunctions.getMessage(t)));
			}
			// Not reached.
			return Lisp.NIL;
		}
	};

	private static class pf_jnew_array extends JavaPrimitive {
		pf_jnew_array() {
			super("jnew-array", Lisp.PACKAGE_JAVA, true, "element-type &rest dimensions");
		}

		public SubLObject execute(SubLObject[] args) {
			if (args.length < 2)
				Lisp.error(new WrongNumberOfArgumentsException(this));
			try {
				Class c = JavaFunctions.javaClass(args[0]);
				int[] dimensions = new int[args.length - 1];
				for (int i = 1; i < args.length; i++)
					dimensions[i - 1] = ((Integer) args[i].javaInstance()).intValue();
				return ABCLJavaObject.makeJavaObject(Array.newInstance(c, dimensions));
			} catch (Throwable t) { // no code -> no ControlTransfer
				Lisp.error(new JavaException(t));
			}
			// Not reached.
			return Lisp.NIL;
		}
	}

	private static class pf_jobject_lisp_value extends JavaPrimitive {
		pf_jobject_lisp_value() {
			super("jobject-lisp-value", Lisp.PACKAGE_JAVA, true, "java-object");
		}

		public SubLObject execute(SubLObject arg) {
			return ABCLJavaObject.makeJavaObject(arg.javaInstance(), true);
		}
	};

	private static class pf_jrun_exception_protection extends JavaPrimitive {
		pf_jrun_exception_protection() {
			super("jrun-exception-protected", Lisp.PACKAGE_JAVA, true, "closure");
		}

		public SubLObject execute(SubLObject closure) {
			Function fun = Lisp.checkFunction(closure);

			try {
				return LispThread.currentThread().execute(closure);
			} catch (OutOfMemoryError oom) {
				oom.printStackTrace();
				return Lisp.error(new StorageCondition("Out of memory."));
			} catch (StackOverflowError oos) {
				oos.printStackTrace();
				return Lisp.error(new StorageCondition("Stack overflow."));
			}
		}
	}

	private static class pf_jstatic extends JavaPrimitive {
		pf_jstatic() {
			super("jstatic", Lisp.PACKAGE_JAVA, true, "method class &rest args");
		}

		public SubLObject execute(SubLObject[] args) {
			return JavaFunctions.jstatic(this, args, true);
		}
	};

	private static class pf_jstatic_raw extends JavaPrimitive {
		pf_jstatic_raw() {
			super("jstatic-raw", Lisp.PACKAGE_JAVA, true, "method class &rest args");
		}

		public SubLObject execute(SubLObject[] args) {
			return JavaFunctions.jstatic(this, args, false);
		}
	}

	private static class pf_make_immediate_object extends JavaPrimitive {
		pf_make_immediate_object() {
			super("make-immediate-object", Lisp.PACKAGE_JAVA, true, "object &optional type");
		}

		public SubLObject execute(SubLObject[] args) {
			if (args.length < 1)
				Lisp.error(new WrongNumberOfArgumentsException(this));
			SubLObject object = args[0];
			if (args.length > 1) {
				SubLObject type = args[1];
				if (type == Keyword.BOOLEAN)
					if (object == Lisp.NIL)
						return ABCLJavaObject.makeJavaObject(Boolean.FALSE);
					else
						return ABCLJavaObject.makeJavaObject(Boolean.TRUE);
				if (type == Keyword.REF)
					if (object == Lisp.NIL)
						return ABCLJavaObject.makeJavaObject(null);
					else
						Lisp.error(new LispError("MAKE-IMMEDIATE-OBJECT: not implemented"));
			}
			return ABCLJavaObject.makeJavaObject(object.javaInstance());
		}
	}

	private static class pf_register_java_exception extends JavaPrimitive {
		pf_register_java_exception() {
			super("register-java-exception", Lisp.PACKAGE_JAVA, true, "exception-name condition-symbol");
		}

		public SubLObject execute(SubLObject className, SubLObject symbol)

		{
			// FIXME Verify that CONDITION-SYMBOL is a symbol that names a
			// condition.
			// FIXME Signal a continuable error if the exception is already
			// registered.
			if (symbol instanceof SubLSymbol
					&& JavaFunctions.isJavaException(LispClass.findClass((SubLSymbol) symbol))) {
				JavaFunctions.registeredExceptions.put(JavaFunctions.classForName(className.getString()),
						(SubLSymbol) symbol);
				return Lisp.T;
			}
			return Lisp.NIL;
		}
	};

	private static class pf_unregister_java_exception extends JavaPrimitive {
		pf_unregister_java_exception() {
			super("unregister-java-exception", Lisp.PACKAGE_JAVA, true, "exception-name");
		}

		public SubLObject execute(SubLObject className)

		{
			// FIXME Verify that EXCEPTION-NAME designates a subclass of
			// Throwable.
			return JavaFunctions.registeredExceptions.remove(JavaFunctions.classForName(className.getString())) == null
					? Lisp.NIL : Lisp.T;
		}
	}

	static Map<Class, SubLSymbol> registeredExceptions = new HashMap<Class, SubLSymbol>();;

	private static LispClass java_exception = LispClass.findClass(LispSymbols.JAVA_EXCEPTION);

	// ### register-java-exception exception-name condition-symbol => T
	private static Primitive REGISTER_JAVA_EXCEPTION = new pf_register_java_exception();;

	// ### unregister-java-exception exception-name => T or NIL
	private static Primitive UNREGISTER_JAVA_EXCEPTION = new pf_unregister_java_exception();

	// ### jclass name-or-class-ref => class-ref
	private static Primitive JCLASS = new pf_jclass();;

	// ### jfield class-ref-or-field field-or-instance &optional instance value
	private static Primitive JFIELD = new pf_jfield();

	// ### jfield-raw - retrieve or modify a field in a Java class or instance.
	private static Primitive JFIELD_RAW = new pf_jfield_raw();

	// ### jconstructor class-ref &rest parameter-class-refs
	private static Primitive JCONSTRUCTOR = new pf_jconstructor();;

	// ### jmethod class-ref name &rest parameter-class-refs
	private static Primitive JMETHOD = new pf_jmethod();

	// ### jstatic method class &rest args
	private static Primitive JSTATIC = new pf_jstatic();;

	// ### jstatic-raw method class &rest args
	private static Primitive JSTATIC_RAW = new pf_jstatic_raw();

	// ### jnew constructor &rest args
	private static Primitive JNEW = new pf_jnew();;

	// ### jnew-array element-type &rest dimensions
	private static Primitive JNEW_ARRAY = new pf_jnew_array();

	// ### jarray-ref java-array &rest indices
	private static Primitive JARRAY_REF = new pf_jarray_ref();;

	// ### jarray-ref-raw java-array &rest indices
	private static Primitive JARRAY_REF_RAW = new pf_jarray_ref_raw();

	// ### jarray-set java-array new-value &rest indices
	private static Primitive JARRAY_SET = new pf_jarray_set();;

	// ### jcall method instance &rest args
	/**
	 * Calls makeLispObject() to convert the result to an appropriate Lisp type.
	 */
	private static Primitive JCALL = new pf_jcall();

	// ### jcall-raw method instance &rest args
	/**
	 * Does no type conversion. The result of the call is simply wrapped in a
	 * JavaObject.
	 */
	private static Primitive JCALL_RAW = new pf_jcall_raw();

	// ### make-immediate-object object &optional type
	private static Primitive MAKE_IMMEDIATE_OBJECT = new pf_make_immediate_object();

	// ### java-object-p
	private static Primitive JAVA_OBJECT_P = new pf_java_object_p();

	// ### jobject-lisp-value java-object
	private static Primitive JOBJECT_LISP_VALUE = new pf_jobject_lisp_value();

	// ### jcoerce java-object intended-class
	private static Primitive JCOERCE = new pf_jcoerce();

	// ### %jget-property-value java-object property-name
	private static Primitive JGET_PROPERTY_VALUE = new pf__jget_property_value();

	// ### %jset-property-value java-object property-name value
	private static Primitive JSET_PROPERTY_VALUE = new pf__jset_property_value();

	// ### jrun-exception-protected closure
	private static Primitive JRUN_EXCEPTION_PROTECTED = new pf_jrun_exception_protection();

	static Class classForName(String className) {
		try {
			return Class.forName(className);
		} catch (ClassNotFoundException e) {
			try {
				return Class.forName(className, true, JavaClassLoader.getPersistentInstance());
			} catch (ClassNotFoundException ex) {
				Lisp.error(new LispError("Class not found: " + className));
				// Not reached.
				return null;
			}
		}
	}

	static Constructor findConstructor(Class<?> c, SubLObject[] args) throws NoSuchMethodException {
		int argCount = args.length - 1;
		Object[] javaArgs = JavaFunctions.translateMethodArguments(args, 1);
		Constructor[] ctors = c.getConstructors();
		Constructor result = null;
		for (int i = ctors.length; i-- > 0;) {
			Constructor ctor = ctors[i];
			if (ctor.getParameterTypes().length != argCount)
				continue;
			Class<?>[] methodTypes = ctor.getParameterTypes();
			if (!JavaFunctions.isApplicableMethod(methodTypes, javaArgs))
				continue;
			if (result == null || JavaFunctions.isMoreSpecialized(methodTypes, result.getParameterTypes()))
				result = ctor;
		}
		if (result == null) {
			StringBuilder sb = new StringBuilder(c.getSimpleName());
			sb.append('(');
			boolean first = true;
			for (Object o : javaArgs) {
				if (first)
					first = false;
				else
					sb.append(", ");
				if (o != null)
					sb.append(o.getClass().getName());
				else
					sb.append("<null>");
			}
			sb.append(')');
			throw new NoSuchMethodException(sb.toString());
		}
		return result;
	}

	private static Method findMethod(Class<?> c, String methodName, Object[] javaArgs) {
		Method[] methods = c.getMethods();
		return JavaFunctions.findMethod(methods, methodName, javaArgs);
	}

	private static Method findMethod(Class<?> c, String methodName, SubLObject[] args) {
		Object[] javaArgs = JavaFunctions.translateMethodArguments(args, 2);
		return JavaFunctions.findMethod(c, methodName, javaArgs);
	}

	private static Method findMethod(Method[] methods, String methodName, Object[] javaArgs) {
		int argCount = javaArgs.length;
		Method result = null;
		for (int i = methods.length; i-- > 0;) {
			Method method = methods[i];
			if (!method.getName().equals(methodName))
				continue;
			if (method.getParameterTypes().length != argCount)
				continue;
			Class<?>[] methodTypes = method.getParameterTypes();
			if (!JavaFunctions.isApplicableMethod(methodTypes, javaArgs))
				continue;
			if (result == null || JavaFunctions.isMoreSpecialized(methodTypes, result.getParameterTypes()))
				result = method;
		}
		return result;
	};

	private static Method findMethod(Method[] methods, String methodName, SubLObject[] args) {
		Object[] javaArgs = JavaFunctions.translateMethodArguments(args, 2);
		return JavaFunctions.findMethod(methods, methodName, javaArgs);
	}

	private static Class<?> getBoxedClass(Class<?> clazz) {
		if (clazz.equals(int.class))
			return Integer.class;
		else if (clazz.equals(boolean.class))
			return Boolean.class;
		else if (clazz.equals(byte.class))
			return Byte.class;
		else if (clazz.equals(char.class))
			return Character.class;
		else if (clazz.equals(long.class))
			return Long.class;
		else if (clazz.equals(float.class))
			return Float.class;
		else if (clazz.equals(double.class))
			return Double.class;
		else if (clazz.equals(short.class))
			return Short.class;
		else
			return Void.class;
	};

	static SubLSymbol getCondition(Class cl) {
		Class o = JavaFunctions.classForName("java.lang.Object");
		for (Class c = cl; c != o; c = c.getSuperclass()) {
			Object object = JavaFunctions.registeredExceptions.get(c);
			if (object != null && JavaFunctions.isJavaException(LispClass.findClass((SubLSymbol) object)))
				return (SubLSymbol) object;
		}
		return null;
	}

	static String getMessage(Throwable t) {
		String message = t.getMessage();
		if (message == null || message.length() == 0)
			message = t.getClass().getName();
		return message;
	};

	static PropertyDescriptor getPropertyDescriptor(Object obj, SubLObject propertyName) throws IntrospectionException {
		String prop = ((SubLString) propertyName).getString();
		BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
		for (PropertyDescriptor pd : beanInfo.getPropertyDescriptors())
			if (pd.getName().equals(prop))
				return pd;
		Lisp.error(new LispError("Property " + prop + " not found in " + obj));

		return null; // not reached
	}

	private static boolean isApplicableMethod(Class<?>[] methodTypes, Object[] args) {
		for (int i = 0; i < methodTypes.length; ++i) {
			Class<?> methodType = methodTypes[i];
			Object arg = args[i];
			if (methodType.isPrimitive()) {
				Class<?> x = JavaFunctions.getBoxedClass(methodType);
				if (!x.isInstance(arg))
					return false;
			} else if (arg != null && !methodType.isInstance(arg))
				return false;
		}
		return true;
	};

	static boolean isJavaException(LispClass lc) {
		return lc.subclassp(JavaFunctions.java_exception);
	}

	private static boolean isMoreSpecialized(Class<?>[] xtypes, Class<?>[] ytypes) {
		for (int i = 0; i < xtypes.length; ++i) {
			Class<?> xtype = xtypes[i];
			if (xtype.isPrimitive())
				xtype = JavaFunctions.getBoxedClass(xtype);
			Class<?> ytype = ytypes[i];
			if (ytype.isPrimitive())
				ytype = JavaFunctions.getBoxedClass(ytype);
			if (xtype.equals(ytype))
				continue;
			if (ytype.isAssignableFrom(xtype))
				return true;
		}
		return false;
	};

	static SubLObject jarray_ref(Primitive fun, SubLObject[] args, boolean translate)

	{
		if (args.length < 2)
			Lisp.error(new WrongNumberOfArgumentsException(fun));
		try {
			Object a = args[0].javaInstance();
			for (int i = 1; i < args.length - 1; i++)
				a = Array.get(a, ((Integer) args[i].javaInstance()).intValue());
			return ABCLJavaObject.makeJavaObject(
					Array.get(a, ((Integer) args[args.length - 1].javaInstance()).intValue()), translate);
		} catch (Throwable t) { // no code -> no ControlTransfer
			SubLSymbol condition = JavaFunctions.getCondition(t.getClass());
			if (condition == null)
				Lisp.error(new JavaException(t));
			else
				LispSymbols.SIGNAL.execute(condition, Keyword.CAUSE, ABCLJavaObject.makeJavaObject(t),
						Keyword.FORMAT_CONTROL, LispObjectFactory.makeString(JavaFunctions.getMessage(t)));
		}
		// Not reached.
		return Lisp.NIL;
	}

	// Supports Java primitive types too.
	static Class javaClass(SubLObject obj) {
		if (obj instanceof SubLString || obj instanceof SubLSymbol) {
			String s = Lisp.javaString(obj);
			if (s.equals("boolean"))
				return Boolean.TYPE;
			if (s.equals("byte"))
				return Byte.TYPE;
			if (s.equals("char"))
				return Character.TYPE;
			if (s.equals("short"))
				return Short.TYPE;
			if (s.equals("int"))
				return Integer.TYPE;
			if (s.equals("long"))
				return Long.TYPE;
			if (s.equals("float"))
				return Float.TYPE;
			if (s.equals("double"))
				return Double.TYPE;
			// Not a primitive Java type.
			Class c = JavaFunctions.classForName(s);
			if (c == null)
				Lisp.error(new LispError(s + " does not designate a Java class."));

			return c;
		}
		// It's not a string, so it must be a ABCLJavaObject.
		JavaObject javaObject;
		if (obj instanceof JavaObject)
			javaObject = (JavaObject) obj;
		else {
			Lisp.type_error(obj, Lisp.list(LispSymbols.OR, LispSymbols.STRING, LispSymbols.JAVA_OBJECT));
			// Not reached.
			return null;
		}
		Object javaObjectgetObject = javaObject.getObject();
		if (javaObjectgetObject instanceof Class)
			return (Class) javaObjectgetObject;
		Lisp.error(new LispError(obj.writeToString() + " does not designate a Java class."));
		return null;
	};

	static SubLObject jcall(Primitive fun, SubLObject[] args, boolean translate)

	{
		if (args.length < 2)
			Lisp.error(new WrongNumberOfArgumentsException(fun));
		try {
			SubLObject methodArg = args[0];
			SubLObject instanceArg = args[1];
			Object instance;
			Class<?> intendedClass = null;
			if (instanceArg instanceof SubLString)
				instance = instanceArg.getString();
			else if (instanceArg instanceof JavaObject) {
				JavaObject jobj = (JavaObject) instanceArg;
				instance = jobj.getObject();
				intendedClass = jobj.getIntendedClass();
			} else
				instance = instanceArg.javaInstance();
			if (instance == null)
				throw new NullPointerException(); // Handled below
			Method method;
			Object[] methodArgs;
			if (methodArg instanceof SubLString) {
				methodArgs = JavaFunctions.translateMethodArguments(args, 2);
				String methodName = methodArg.getString();
				if (intendedClass == null)
					intendedClass = instance.getClass();
				method = JavaFunctions.findMethod(intendedClass, methodName, methodArgs);
				Class actualClass = null;
				if (method == null) {
					actualClass = instance.getClass();
					if (intendedClass != actualClass && Modifier.isPublic(actualClass.getModifiers()))
						method = JavaFunctions.findMethod(actualClass, methodName, methodArgs);
				}
				if (method == null) {
					String classes = intendedClass.getName();
					if (actualClass != null && actualClass != intendedClass)
						classes += " or " + actualClass.getName();
					throw new NoSuchMethodException(
							"No applicable method named " + methodName + " found in " + classes);
				}

			} else
				method = (Method) ABCLJavaObject.getObject(methodArg);
			Class<?>[] argTypes = method.getParameterTypes();
			if (argTypes.length != args.length - 2)
				return Lisp.error(new WrongNumberOfArgumentsException("Wrong number of arguments for " + method
						+ ": expected " + argTypes.length + ", got " + (args.length - 2)));
			methodArgs = new Object[argTypes.length];
			for (int i = 2; i < args.length; i++) {
				SubLObject arg = args[i];
				if (arg == Lisp.NIL)
					methodArgs[i - 2] = null;
				else
					methodArgs[i - 2] = arg.javaInstance(argTypes[i - 2]);
			}
			return ABCLJavaObject.makeJavaObject(method.invoke(instance, methodArgs), translate,
					method.getReturnType());
		} catch (ControlTransfer t) {
			throw t;
		} catch (Throwable t) { // ControlTransfer handled above
			if (t instanceof InvocationTargetException)
				t = t.getCause();
			SubLSymbol condition = JavaFunctions.getCondition(t.getClass());
			if (condition == null)
				Lisp.error(new JavaException(t));
			else
				LispSymbols.SIGNAL.execute(condition, Keyword.CAUSE, ABCLJavaObject.makeJavaObject(t),
						Keyword.FORMAT_CONTROL, LispObjectFactory.makeString(JavaFunctions.getMessage(t)));
		}
		// Not reached.
		return null;
	}

	static SubLObject jfield(Primitive fun, SubLObject[] args, boolean translate)

	{
		if (args.length < 2 || args.length > 4)
			Lisp.error(new WrongNumberOfArgumentsException(fun));
		String fieldName = null;
		Class c;
		Field f;
		Class fieldType;
		Object instance = null;
		try {
			if (args[1] instanceof SubLString) {
				// Cases 1-5.
				fieldName = args[1].getString();
				c = JavaFunctions.javaClass(args[0]);
			} else {
				// Cases 6 and 7.
				fieldName = args[0].getString();
				instance = ABCLJavaObject.getObject(args[1]);
				c = instance.getClass();
			}
			f = c.getField(fieldName);
			fieldType = f.getType();
			switch (args.length) {
			case 2:
				// Cases 1 and 6.
				break;
			case 3:
				// Cases 2,3, and 7.
				if (instance == null) {
					// Cases 2 and 3.
					if (args[2] instanceof JavaObject) {
						// Case 2.
						instance = ABCLJavaObject.getObject(args[2]);
						break;
					} else {
						// Case 3.
						f.set(null, args[2].javaInstance(fieldType));
						return args[2];
					}
				} else {
					// Case 7.
					f.set(instance, args[2].javaInstance(fieldType));
					return args[2];
				}
			case 4:
				// Cases 4 and 5.
				if (args[2] != Lisp.NIL)
					// Case 4.
					instance = ABCLJavaObject.getObject(args[2]);
				f.set(instance, args[3].javaInstance(fieldType));
				return args[3];
			}
			return ABCLJavaObject.makeJavaObject(f.get(instance), translate, f.getType());
		} catch (NoSuchFieldException e) {
			Lisp.error(new LispError("no such field"));
		} catch (SecurityException e) {
			Lisp.error(new LispError("inaccessible field"));
		} catch (IllegalAccessException e) {
			Lisp.error(new LispError("illegal access"));
		} catch (IllegalArgumentException e) {
			Lisp.error(new LispError("illegal argument"));
		} catch (Throwable t) { // no code -> no ControlTransfer
			Lisp.error(new LispError(JavaFunctions.getMessage(t)));
		}
		// Not reached.
		return Lisp.NIL;
	};

	static SubLObject jstatic(Primitive fun, SubLObject[] args, boolean translate)

	{
		if (args.length < 2)
			Lisp.error(new WrongNumberOfArgumentsException(fun));
		try {
			Method m = null;
			SubLObject methodRef = args[0];
			if (methodRef instanceof JavaObject) {
				Object obj = ((JavaObject) methodRef).getObject();
				if (obj instanceof Method)
					m = (Method) obj;
			} else if (methodRef instanceof SubLString) {
				Class c = JavaFunctions.javaClass(args[1]);
				if (c != null) {
					String methodName = methodRef.getString();
					Method[] methods = c.getMethods();
					List<Method> staticMethods = new ArrayList<Method>();
					int argCount = args.length - 2;
					for (Method m1 : methods)
						if (Modifier.isStatic(m1.getModifiers()))
							staticMethods.add(m1);
					if (staticMethods.size() > 0)
						m = JavaFunctions.findMethod(staticMethods.toArray(new Method[staticMethods.size()]),
								methodName, args);
					if (m == null)
						Lisp.error(new LispError("no such method"));
				}
			} else
				Lisp.error(new TypeError("wrong type: " + methodRef));
			Object[] methodArgs = new Object[args.length - 2];
			Class[] argTypes = m.getParameterTypes();
			for (int i = 2; i < args.length; i++) {
				SubLObject arg = args[i];
				if (arg == Lisp.NIL)
					methodArgs[i - 2] = null;
				else
					methodArgs[i - 2] = arg.javaInstance(argTypes[i - 2]);
			}
			Object result = m.invoke(null, methodArgs);
			return ABCLJavaObject.makeJavaObject(result, translate, m.getReturnType());
		} catch (ControlTransfer c) {
			throw c;
		} catch (Throwable t) { // ControlTransfer handled above
			if (t instanceof InvocationTargetException)
				t = t.getCause();
			SubLSymbol condition = JavaFunctions.getCondition(t.getClass());
			if (condition == null)
				Lisp.error(new JavaException(t));
			else
				LispSymbols.SIGNAL.execute(condition, Keyword.CAUSE, ABCLJavaObject.makeJavaObject(t),
						Keyword.FORMAT_CONTROL, LispObjectFactory.makeString(JavaFunctions.getMessage(t)));
		}
		// Not reached.
		return Lisp.NIL;
	}

	public static Class<?> maybeBoxClass(Class<?> clazz) {
		if (clazz.isPrimitive())
			return JavaFunctions.getBoxedClass(clazz);
		else
			return clazz;
	}

	private static Object[] translateMethodArguments(SubLObject[] args) {
		return JavaFunctions.translateMethodArguments(args, 0);
	}

	private static Object[] translateMethodArguments(SubLObject[] args, int offs) {
		int argCount = args.length - offs;
		Object[] javaArgs = new Object[argCount];
		for (int i = 0; i < argCount; ++i) {
			Object x = args[i + offs];
			if (x == Lisp.NIL)
				javaArgs[i] = null;
			else
				javaArgs[i] = ((SubLObject) x).javaInstance();
		}
		return javaArgs;
	}
}

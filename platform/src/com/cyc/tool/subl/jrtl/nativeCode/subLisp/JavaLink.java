//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.armedbear.lisp.JavaObject;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLAlienObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.AbstractSubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.AbstractSubLIntegerBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLBigDecimal;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLBigIntBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLLongBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class JavaLink extends SubLTrampolineFile {
	private static SubLObject box(Object object) {
		SubLObject result;
		try {
			if (object == null)
				result = SubLNil.NIL;
			else if (object instanceof SubLObject)
				result = (SubLObject) object;
			else if (object.getClass().equals(classForName("Z")) || object instanceof Boolean)
				result = SubLObjectFactory.makeBoolean((boolean) (Boolean) object);
			else if (object.getClass().equals(classForName("C")) || object instanceof Character)
				result = SubLObjectFactory.makeChar(object.toString());
			else if (object.getClass().equals(classForName("D")) || object instanceof Double)
				result = SubLObjectFactory.makeDouble(object.toString());
			else if (object.getClass().equals(classForName("I")) || object instanceof Integer)
				result = SubLObjectFactory.makeInteger(object.toString());
			else
				result = JavaObject.getInstance(object, true);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e.getCause() != null ? e.getCause() : e);
		}
		if (JavaLink.DEBUG)
			System.out.println("JavaLink.box((" + object.getClass() + ")" + object + ") --> " + "(" + result.getClass()
					+ ")" + result);
		return result;
	}

	private static Class classForName(Object rawClassName) throws ClassNotFoundException {
		if (rawClassName instanceof Class)
			return (Class) rawClassName;
		String className;
		if (rawClassName instanceof SubLObject)
			className = subLObjectToString(rawClassName);
		else
			className = rawClassName.toString();
		if ("boolean".equals(className))
			return Boolean.TYPE;
		if ("Z".equals(className))
			return Boolean.TYPE;
		if ("byte".equals(className))
			return Byte.TYPE;
		if ("B".equals(className))
			return Byte.TYPE;
		if ("char".equals(className))
			return Character.TYPE;
		if ("C".equals(className))
			return Character.TYPE;
		if ("double".equals(className))
			return Double.TYPE;
		if ("D".equals(className))
			return Double.TYPE;
		if ("float".equals(className))
			return Float.TYPE;
		if ("F".equals(className))
			return Float.TYPE;
		if ("int".equals(className))
			return Integer.TYPE;
		if ("I".equals(className))
			return Integer.TYPE;
		if ("long".equals(className))
			return Long.TYPE;
		if ("J".equals(className))
			return Long.TYPE;
		if ("short".equals(className))
			return Short.TYPE;
		if ("S".equals(className))
			return Short.TYPE;
		if ("void".equals(className))
			return Void.TYPE;
		if (JavaLink.DEBUG)
			System.out.println("classForName(" + rawClassName + ") --> " + Class.forName(className));
		return Class.forName(className);
	}

	private static Object coerceToClass(Class classClass, Object coercible) {
		if (JavaLink.DEBUG)
			System.out.println("Coercing (" + coercible.getClass() + ") " + coercible + " into class " + classClass);
		try {
			if (classClass.isAssignableFrom(coercible.getClass()))
				return coercible;
			if (coercible instanceof SubLObject && classClass.equals(classForName("Z")))
				return !((SubLObject) coercible).isNil();
			if (coercible instanceof SubLSymbol)
				return subLObjectToString(coercible);
			if (coercible instanceof SubLObject && classClass.equals(classForName("C")))
				return ((SubLObject) coercible).charValue();
			if (coercible instanceof SubLObject && classClass.equals(classForName("D")))
				return ((SubLObject) coercible).doubleValue();
			if (coercible instanceof SubLObject && classClass.equals(classForName("I")))
				return ((SubLObject) coercible).intValue();
			if (coercible instanceof SubLObject && classClass.equals(classForName("J")))
				return ((SubLObject) coercible).longValue();
			if (classClass.getName().startsWith("[")) {
				if (coercible instanceof SubLList)
					return coerceToClass(classClass, ((SubLList) coercible).toSubLObjectArray());
				if (coercible instanceof SubLVector)
					return coerceToClass(classClass,
							((SubLVector) coercible).toArray(new Array[((SubLVector) coercible).size()]));
				if (coercible.getClass().isArray()) {
					int arrayLength = Array.getLength(coercible);
					Class elemClass = classForName(classClass.getName().substring(1));
					Object result = Array.newInstance(elemClass, arrayLength);
					for (int i = 0; i < arrayLength; ++i) {
						Object coercibleElem = Array.get(coercible, i);
						if (coercibleElem instanceof SubLObject && elemClass.equals(classForName("Z")))
							Array.setBoolean(result, i, !((SubLObject) coercibleElem).isNil());
						else if (coercibleElem instanceof SubLObject && elemClass.equals(classForName("C")))
							Array.setChar(result, i, ((SubLObject) coercibleElem).charValue());
						else if (coercibleElem instanceof SubLObject && elemClass.equals(classForName("D")))
							Array.setDouble(result, i, ((SubLObject) coercibleElem).doubleValue());
						else if (coercibleElem instanceof SubLObject && elemClass.equals(classForName("I")))
							Array.setInt(result, i, ((SubLObject) coercibleElem).intValue());
						else if (coercibleElem instanceof SubLObject && elemClass.equals(classForName("J")))
							Array.setLong(result, i, ((SubLObject) coercibleElem).longValue());
						else {
							Object coercedElem = coerceToClass(elemClass, coercibleElem);
							if (elemClass.isAssignableFrom(coercedElem.getClass()))
								Array.set(result, i, coercedElem);
							else if (JavaLink.DEBUG)
								System.out.println("coerceToClass can't coerce  (" + coercibleElem.getClass() + ")"
										+ coercibleElem + " to " + elemClass);
						}
					}
					return result;
				}
			}
			throw new RuntimeException("JavaLink.coerceToClass doen't know how to coerce (" + coercible.getClass()
					+ ") " + coercible + " to " + classClass);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e.getCause() != null ? e.getCause() : e);
		}
	}

	private static Class getJavaClass(Object subLObject) {
		Class result;
		if (subLObject instanceof SubLT)
			result = Boolean.TYPE;
		else if (subLObject instanceof SubLNil)
			result = ArrayList.class;
		else if (subLObject instanceof SubLSymbol)
			result = String.class;
		else if (subLObject instanceof SubLString)
			result = String.class;
		else if (subLObject instanceof SubLCharacter)
			result = Character.TYPE;
		else if (subLObject instanceof AbstractSubLFloat)
			result = Double.TYPE;
		else if (subLObject instanceof AbstractSubLIntegerBignum)
			result = Integer.TYPE;
		else if (subLObject instanceof SubLLongBignum)
			result = Long.TYPE;
		else if (subLObject instanceof SubLBigIntBignum)
			result = BigInteger.class;
		else if (subLObject instanceof SubLBigDecimal)
			result = BigDecimal.class;
		else if (subLObject instanceof SubLVector)
			result = ArrayList.class;
		else if (subLObject instanceof AbstractSubLList)
			result = ArrayList.class;
		else {
			if (!(subLObject instanceof SubLHashtable))
				throw new RuntimeException("Unable to find equivalent Java class for [" + subLObject.getClass() + "]");
			result = Map.class;
		}
		return result;
	}

	private static Object getJavaObject(Class targetClass, Object subLObject) {
		Object result;
		if (subLObject instanceof SubLT && targetClass.isAssignableFrom(Boolean.TYPE))
			result = ((SubLT) subLObject).toBoolean();
		else if (subLObject instanceof SubLNil && canAssign(List.class, targetClass))
			result = new ArrayList();
		else if (subLObject instanceof SubLNil && canAssign(Boolean.TYPE, targetClass))
			result = ((SubLNil) subLObject).toBoolean();
		else if (subLObject instanceof SubLSymbol && canAssign(String.class, targetClass))
			result = subLObjectToString(subLObject);
		else if (subLObject instanceof SubLString && canAssign(String.class, targetClass))
			result = ((SubLString) subLObject).getStringValue();
		else if (subLObject instanceof SubLCharacter && canAssign(Character.TYPE, targetClass))
			result = ((SubLCharacter) subLObject).charValue();
		else if (subLObject instanceof AbstractSubLFloat && canAssign(Double.TYPE, targetClass))
			result = ((AbstractSubLFloat) subLObject).doubleValue();
		else if (subLObject instanceof AbstractSubLIntegerBignum && canAssign(Integer.TYPE, targetClass))
			result = ((AbstractSubLIntegerBignum) subLObject).intValue();
		else if (subLObject instanceof SubLLongBignum && canAssign(Long.TYPE, targetClass))
			result = ((SubLLongBignum) subLObject).longValue();
		else if (subLObject instanceof SubLBigIntBignum && canAssign(BigInteger.class, targetClass))
			result = ((SubLBigIntBignum) subLObject).bigIntegerValue();
		else if (subLObject instanceof SubLVector && canAssign(List.class, targetClass)) {
			Object[] tmp = ((SubLVector) subLObject).toArray();
			ArrayList<Object> arr = new ArrayList<Object>(tmp.length);
			for (Object obj : tmp)
				arr.add(getJavaObject(targetClass, obj));
			result = arr;
		} else if (subLObject instanceof AbstractSubLList && canAssign(List.class, targetClass)) {
			Object[] tmp = ((AbstractSubLList) subLObject).toArray();
			ArrayList<Object> arr = new ArrayList<Object>(tmp.length);
			for (Object obj : tmp)
				arr.add(getJavaObject(targetClass, obj));
			result = arr;
		} else {
			if (!(subLObject instanceof SubLHashtable) || !canAssign(Map.class, targetClass))
				throw new RuntimeException(
						"Unable to convert an instance of [" + subLObject.getClass() + "] to Java object");
			HashMap<Object, Object> m = new HashMap<Object, Object>();
			Iterator it = ((SubLHashtable) subLObject).getEntrySetIterator();
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				Object key = getJavaObject(targetClass, pair.getKey());
				Object val = getJavaObject(targetClass, pair.getValue());
				m.put(key, val);
			}
			result = m;
		}
		if (JavaLink.DEBUG)
			System.out.println(result);
		return result;
	}

	private static Object getJavaObject(Object subLObject) {
		Object result;
		if (subLObject instanceof SubLT)
			result = ((SubLT) subLObject).toBoolean();
		else if (subLObject instanceof SubLNil)
			result = new ArrayList();
		else if (subLObject instanceof SubLSymbol)
			result = subLObjectToString(subLObject);
		else if (subLObject instanceof SubLString)
			result = ((SubLString) subLObject).getStringValue();
		else if (subLObject instanceof SubLCharacter)
			result = ((SubLCharacter) subLObject).charValue();
		else if (subLObject instanceof AbstractSubLFloat)
			result = ((AbstractSubLFloat) subLObject).doubleValue();
		else if (subLObject instanceof AbstractSubLIntegerBignum)
			result = ((AbstractSubLIntegerBignum) subLObject).intValue();
		else if (subLObject instanceof SubLLongBignum)
			result = ((SubLLongBignum) subLObject).longValue();
		else if (subLObject instanceof SubLBigIntBignum)
			result = ((SubLBigIntBignum) subLObject).bigIntegerValue();
		else if (subLObject instanceof SubLVector) {
			Object[] tmp = ((SubLVector) subLObject).toArray();
			ArrayList<Object> arr = new ArrayList<Object>(tmp.length);
			for (Object obj : tmp)
				arr.add(getJavaObject(obj));
			result = arr;
		} else if (subLObject instanceof AbstractSubLList) {
			Object[] tmp = ((AbstractSubLList) subLObject).toArray();
			ArrayList<Object> arr = new ArrayList<Object>(tmp.length);
			for (Object obj : tmp)
				arr.add(getJavaObject(obj));
			result = arr;
		} else {
			if (!(subLObject instanceof SubLHashtable))
				throw new RuntimeException(
						"Unable to convert an instance of [" + subLObject.getClass() + "] to Java object");
			HashMap<Object, Object> m = new HashMap<Object, Object>();
			Iterator it = ((SubLHashtable) subLObject).getEntrySetIterator();
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				Object key = getJavaObject(pair.getKey());
				Object val = getJavaObject(pair.getValue());
				m.put(key, val);
			}
			result = m;
		}
		if (JavaLink.DEBUG)
			System.out.println(result);
		return result;
	}

	private static Object possiblyUnbox(Object object) {
		Object result;
		if (object instanceof SubLAlienObject)
			result = ((SubLAlienObject) object).getAlien();
		else
			if (object instanceof JavaObject)
				result = ((JavaObject) object).javaInstance();
			else			
			result = object;
		if (JavaLink.DEBUG)
			System.out.println("JavaLink.possiblyUnbox((" + object.getClass() + ")" + object + ") --> " + "("
					+ result.getClass() + ")" + result);
		return result;
	}

	private static String subLObjectToString(Object object) {
		if (object instanceof String)
			return (String) object;
		if (object instanceof SubLString)
			return ((SubLString) object).getStringValue();
		return object.toString();
	}

	private static Object unbox(SubLObject subLObject) {
		Object result;
		if (subLObject instanceof SubLAlienObject)
			result = ((SubLAlienObject) subLObject).getAlien();
		else
			result = subLObject;
		if (JavaLink.DEBUG)
			System.out.println("JavaLink.unbox((" + subLObject.getClass() + ")" + subLObject + ") --> " + "("
					+ result.getClass() + ")" + result);
		return result;
	}

	public static SubLObject _call(Object methodObject, Object instanceObject, Object... argObjects) {
		if (JavaLink.DEBUG)
			System.out.println("JavaLink._call(" + methodObject + ", " + instanceObject + ", " + argObjects);
		methodObject = possiblyUnbox(methodObject);
		instanceObject = possiblyUnbox(instanceObject);
		for (int i = 0; i < argObjects.length; ++i)
			argObjects[i] = possiblyUnbox(argObjects[i]);
		try {
			if (methodObject instanceof Method) {
				Method method = (Method) methodObject;
				Object[] args = null;
				if (argObjects != null) {
					int argsCount = Array.getLength(argObjects);
					args = new Object[argsCount];
					for (int j = 0; j < argsCount; ++j)
						args[j] = getJavaObject(method.getParameterTypes()[j], argObjects[j]);
				}
				return box(method.invoke(instanceObject, args));
			}
			throw new RuntimeException("Arguments that are instanceof Method are currently supported (called with "
					+ methodObject + ".)" + " For now, use java-method to find the method first");
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e.getCause() != null ? e.getCause() : e);
		} catch (IllegalArgumentException e2) {
			throw new RuntimeException(e2.getCause() != null ? e2.getCause() : e2);
		} catch (InvocationTargetException e3) {
			throw new RuntimeException(e3.getCause() != null ? e3.getCause() : e3);
		}
	}

	public static SubLObject _constructor(Object classNameOrReference, Object... parameters) {
		if (JavaLink.DEBUG)
			System.out.println("JavaLink._constructor(" + classNameOrReference + ", " + ", " + parameters);
		classNameOrReference = possiblyUnbox(classNameOrReference);
		for (int i = 0; i < parameters.length; ++i)
			parameters[i] = possiblyUnbox(parameters[i]);
		try {
			Class classClass = classForName(classNameOrReference);
			Class[] argClasses = null;
			if (parameters.length > 0) {
				argClasses = new Class[parameters.length];
				for (int j = 0; j < parameters.length; ++j)
					argClasses[j] = classForName(parameters[j]);
			}
			return box(classClass.getConstructor(argClasses));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e.getCause() != null ? e.getCause() : e);
		} catch (NoSuchMethodException e2) {
			throw new RuntimeException(e2.getCause() != null ? e2.getCause() : e2);
		}
	}

	public static SubLObject _method(Object classNameOrReference, Object methodName, Object... parameterTypes) {
		if (JavaLink.DEBUG)
			System.out.println(
					"JavaLink._method(" + classNameOrReference + ", " + methodName + ", " + parameterTypes.toString());
		classNameOrReference = possiblyUnbox(classNameOrReference);
		methodName = possiblyUnbox(methodName);
		for (int i = 0; i < parameterTypes.length; ++i)
			parameterTypes[i] = possiblyUnbox(parameterTypes[i]);
		try {
			Class classClass = classForName(classNameOrReference);
			String methodString = subLObjectToString(methodName);
			Class[] argClasses = null;
			if (parameterTypes != null) {
				argClasses = new Class[parameterTypes.length];
				for (int j = 0; j < parameterTypes.length; ++j)
					argClasses[j] = classForName(parameterTypes[j]);
			}
			if (methodString.isEmpty() || methodName instanceof SubLObject && ((SubLObject) methodName).isNil())
				return box(classClass.getDeclaredConstructor(argClasses));
			return box(classClass.getDeclaredMethod(methodString, argClasses));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e.getCause() != null ? e.getCause() : e);
		} catch (NoSuchMethodException e2) {
			throw new RuntimeException(e2.getCause() != null ? e2.getCause() : e2);
		}
	}

	public static SubLObject _new(Object classNameOrConstructor, Object... parameters) {
		if (JavaLink.DEBUG)
			System.out.println("JavaLink._new(" + classNameOrConstructor + ", " + parameters + ")");
		classNameOrConstructor = possiblyUnbox(classNameOrConstructor);
		for (int i = 0; i < parameters.length; ++i)
			parameters[i] = possiblyUnbox(parameters[i]);
		try {
			if (classNameOrConstructor instanceof Constructor) {
				Class[] paramTypes = ((Constructor) classNameOrConstructor).getParameterTypes();
				for (int j = 0; j < parameters.length; ++j)
					parameters[j] = getJavaObject(paramTypes[j], parameters[j]);
				return box(((Constructor) classNameOrConstructor).newInstance(parameters));
			}
			Class resultClass = classForName(classNameOrConstructor);
			if (parameters.length > 0) {
				Class[] argClasses = new Class[parameters.length];
				Object[] argsConverted = new Object[parameters.length];
				for (int k = 0; k < parameters.length; ++k) {
					if (JavaLink.DEBUG)
						System.out.println(
								"arg " + k + " = [" + parameters[k] + "], is of type " + parameters[k].getClass());
					argClasses[k] = getJavaClass(parameters[k]);
					argsConverted[k] = getJavaObject(parameters[k]);
				}
				return box(resultClass.getConstructor(argClasses).newInstance(argsConverted));
			}
			return box(resultClass.newInstance());
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e.getCause() != null ? e.getCause() : e);
		} catch (InstantiationException e2) {
			throw new RuntimeException(e2.getCause() != null ? e2.getCause() : e2);
		} catch (IllegalAccessException e3) {
			throw new RuntimeException(e3.getCause() != null ? e3.getCause() : e3);
		} catch (InvocationTargetException e4) {
			throw new RuntimeException(e4.getCause() != null ? e4.getCause() : e4);
		} catch (NoSuchMethodException e5) {
			throw new RuntimeException(e5.getCause() != null ? e5.getCause() : e5);
		}
	}

	public static SubLObject _static(Object methodObject, Object classObject, Object... argObjects) {
		if (JavaLink.DEBUG)
			System.out.println("JavaLink._static(" + methodObject + ", " + classObject + ", " + argObjects);
		methodObject = possiblyUnbox(methodObject);
		classObject = possiblyUnbox(classObject);
		for (int i = 0; i < argObjects.length; ++i)
			argObjects[i] = possiblyUnbox(argObjects[i]);
		try {
			Method method;
			if (methodObject instanceof Method)
				method = (Method) methodObject;
			else if (argObjects.length > 0) {
				Class[] argClasses = new Class[argObjects.length];
				for (int j = 0; j < argObjects.length; ++j) {
					if (JavaLink.DEBUG)
						System.out.println(
								"arg " + j + " = [" + argObjects[j] + "], is of type " + argObjects[j].getClass());
					argClasses[j] = getJavaClass(argObjects[j]);
				}
				method = (Method) unbox(_method(classObject, methodObject, (Object[]) argClasses));
			} else
				method = (Method) unbox(_method(classObject, methodObject, new Object[0]));
			Object[] args = null;
			if (argObjects != null) {
				int argsCount = Array.getLength(argObjects);
				args = new Object[argsCount];
				for (int k = 0; k < argsCount; ++k)
					args[k] = getJavaObject(method.getParameterTypes()[k], argObjects[k]);
			}
			final Object result = method.invoke((Object) null, args);
			return box(result);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e.getCause() != null ? e.getCause() : e);
		} catch (IllegalArgumentException e2) {
			throw new RuntimeException(e2.getCause() != null ? e2.getCause() : e2);
		} catch (InvocationTargetException e3) {
			throw new RuntimeException(e3.getCause() != null ? e3.getCause() : e3);
		}
	}

	public static boolean canAssign(Class cls, Class toClass) {
		if (cls.equals(toClass))
			return true;
		if (!cls.isPrimitive())
			return toClass.isAssignableFrom(cls);
		if (!toClass.isPrimitive())
			return false;
		if (Integer.TYPE.equals(cls))
			return Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass);
		if (Long.TYPE.equals(cls))
			return Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass);
		if (Boolean.TYPE.equals(cls))
			return false;
		if (Double.TYPE.equals(cls))
			return false;
		if (Float.TYPE.equals(cls))
			return Double.TYPE.equals(toClass);
		if (Character.TYPE.equals(cls))
			return Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass)
					|| Double.TYPE.equals(toClass);
		if (Short.TYPE.equals(cls))
			return Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass)
					|| Double.TYPE.equals(toClass);
		return Byte.TYPE.equals(cls) && (Short.TYPE.equals(toClass) || Integer.TYPE.equals(toClass)
				|| Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass));
	}

	public static SubLObject coerceToSubLObject(Object object) {
		return box(object);
	}

	public static SubLObject java_call(SubLObject methodObject, SubLObject instanceObject, SubLObject... args) {
		if (args.length > 0) {
			Object[] unboxed = new Object[args.length];
			for (int i = 0; i < args.length; ++i)
				unboxed[i] = unbox(args[i]);
			return _call(unbox(methodObject), unbox(instanceObject), unboxed);
		}
		return _call(unbox(methodObject), unbox(instanceObject), new Object[0]);
	}

	public static SubLObject java_class(SubLObject className) {
		try {
			return box(classForName(unbox(className)));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e.getCause() != null ? e.getCause() : e);
		}
	}

	public static SubLObject java_constructor(SubLObject classNameOrReference, SubLObject... parameters) {
		if (parameters.length > 0) {
			Object[] unboxed = new Object[parameters.length];
			for (int i = 0; i < parameters.length; ++i)
				unboxed[i] = unbox(parameters[i]);
			return _constructor(unbox(classNameOrReference), unboxed);
		}
		return _constructor(unbox(classNameOrReference), new Object[0]);
	}

	public static SubLObject java_method(SubLObject className, SubLObject methodName, SubLObject... argClassNames) {
		if (argClassNames.length > 0) {
			Object[] unboxed = new Object[argClassNames.length];
			for (int i = 0; i < argClassNames.length; ++i)
				unboxed[i] = unbox(argClassNames[i]);
			return _method(unbox(className), unbox(methodName), unboxed);
		}
		return _method(unbox(className), unbox(methodName), new Object[0]);
	}

	public static SubLObject java_new(SubLObject classNameOrConstructor, SubLObject... parameters) {
		if (parameters.length > 0) {
			Object[] unboxed = new Object[parameters.length];
			for (int i = 0; i < parameters.length; ++i)
				unboxed[i] = unbox(parameters[i]);
			return _new(unbox(classNameOrConstructor), unboxed);
		}
		return _new(unbox(classNameOrConstructor), new Object[0]);
	}

	public static SubLObject java_object_p(SubLObject object) {
		return box(object instanceof SubLAlienObject);
	}

	public static SubLObject java_static(SubLObject methodObject, SubLObject classObject, SubLObject... args) {
		if (args.length > 0) {
			Object[] unboxed = new Object[args.length];
			for (int i = 0; i < args.length; ++i)
				unboxed[i] = unbox(args[i]);
			return _static(unbox(methodObject), unbox(classObject), unboxed);
		}
		return _static(unbox(methodObject), unbox(classObject), new Object[0]);
	}

	static Boolean DEBUG;
	public static SubLFile me;
	static {
		JavaLink.DEBUG = false;
		me = new JavaLink();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(JavaLink.me, "java_call", "JAVA-CALL", 2, 0, true);
		SubLFiles.declareFunction(JavaLink.me, "java_class", "JAVA-CLASS", 1, 0, false);
		SubLFiles.declareFunction(JavaLink.me, "java_constructor", "JAVA-CONSTRUCTOR", 1, 0, true);
		SubLFiles.declareFunction(JavaLink.me, "java_method", "JAVA-METHOD", 2, 0, true);
		SubLFiles.declareFunction(JavaLink.me, "java_new", "JAVA-NEW", 1, 0, true);
		SubLFiles.declareFunction(JavaLink.me, "java_object_p", "JAVA-OBJECT-P", 1, 0, false);
		SubLFiles.declareFunction(JavaLink.me, "java_static", "JAVA-STATIC", 2, 0, true);
	}

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}
}

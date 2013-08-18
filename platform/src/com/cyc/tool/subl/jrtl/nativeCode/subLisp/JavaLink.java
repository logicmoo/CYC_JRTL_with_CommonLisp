// 
// 
// 

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import java.math.BigInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLBigIntBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLLongBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.AbstractSubLIntegerBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.AbstractSubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLAlienObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public final class JavaLink extends SubLTrampolineFile
{
    static Boolean DEBUG;
    public static final SubLFile me;
    
    public static SubLObject coerceToSubLObject(final Object object) {
        return box(object);
    }
    
    public static final SubLObject java_class(final SubLObject className) {
        try {
            return box(classForName(unbox(className)));
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException((e.getCause() != null) ? e.getCause() : e);
        }
    }
    
    public static final SubLObject java_constructor(final SubLObject classNameOrReference, final SubLObject... parameters) {
        if (parameters.length > 0) {
            final Object[] unboxed = new Object[parameters.length];
            for (int i = 0; i < parameters.length; ++i) {
                unboxed[i] = unbox(parameters[i]);
            }
            return _constructor(unbox(classNameOrReference), unboxed);
        }
        return _constructor(unbox(classNameOrReference), new Object[0]);
    }
    
    public static final SubLObject java_new(final SubLObject classNameOrConstructor, final SubLObject... parameters) {
        if (parameters.length > 0) {
            final Object[] unboxed = new Object[parameters.length];
            for (int i = 0; i < parameters.length; ++i) {
                unboxed[i] = unbox(parameters[i]);
            }
            return _new(unbox(classNameOrConstructor), unboxed);
        }
        return _new(unbox(classNameOrConstructor), new Object[0]);
    }
    
    public static final SubLObject java_method(final SubLObject className, final SubLObject methodName, final SubLObject... argClassNames) {
        if (argClassNames.length > 0) {
            final Object[] unboxed = new Object[argClassNames.length];
            for (int i = 0; i < argClassNames.length; ++i) {
                unboxed[i] = unbox(argClassNames[i]);
            }
            return _method(unbox(className), unbox(methodName), unboxed);
        }
        return _method(unbox(className), unbox(methodName), new Object[0]);
    }
    
    public static final SubLObject java_static(final SubLObject methodObject, final SubLObject classObject, final SubLObject... args) {
        if (args.length > 0) {
            final Object[] unboxed = new Object[args.length];
            for (int i = 0; i < args.length; ++i) {
                unboxed[i] = unbox(args[i]);
            }
            return _static(unbox(methodObject), unbox(classObject), unboxed);
        }
        return _static(unbox(methodObject), unbox(classObject), new Object[0]);
    }
    
    public static final SubLObject java_call(final SubLObject methodObject, final SubLObject instanceObject, final SubLObject... args) {
        if (args.length > 0) {
            final Object[] unboxed = new Object[args.length];
            for (int i = 0; i < args.length; ++i) {
                unboxed[i] = unbox(args[i]);
            }
            return _call(unbox(methodObject), unbox(instanceObject), unboxed);
        }
        return _call(unbox(methodObject), unbox(instanceObject), new Object[0]);
    }
    
    public static final SubLObject java_object_p(final SubLObject object) {
        return box(object instanceof SubLAlienObject);
    }
    
    public static final SubLObject _constructor(Object classNameOrReference, final Object... parameters) {
        if ((boolean)JavaLink.DEBUG) {
            System.out.println("JavaLink._constructor(" + classNameOrReference + ", " + ", " + parameters);
        }
        classNameOrReference = possiblyUnbox(classNameOrReference);
        for (int i = 0; i < parameters.length; ++i) {
            parameters[i] = possiblyUnbox(parameters[i]);
        }
        try {
            final Class classClass = classForName(classNameOrReference);
            Class[] argClasses = null;
            if (parameters.length > 0) {
                argClasses = new Class[parameters.length];
                for (int j = 0; j < parameters.length; ++j) {
                    argClasses[j] = classForName(parameters[j]);
                }
            }
            return box(classClass.getConstructor((Class[])argClasses));
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException((e.getCause() != null) ? e.getCause() : e);
        }
        catch (NoSuchMethodException e2) {
            throw new RuntimeException((e2.getCause() != null) ? e2.getCause() : e2);
        }
    }
    
    public static final SubLObject _new(Object classNameOrConstructor, final Object... parameters) {
        if ((boolean)JavaLink.DEBUG) {
            System.out.println("JavaLink._new(" + classNameOrConstructor + ", " + parameters + ")");
        }
        classNameOrConstructor = possiblyUnbox(classNameOrConstructor);
        for (int i = 0; i < parameters.length; ++i) {
            parameters[i] = possiblyUnbox(parameters[i]);
        }
        try {
            if (classNameOrConstructor instanceof Constructor) {
                final Class[] paramTypes = ((Constructor)classNameOrConstructor).getParameterTypes();
                for (int j = 0; j < parameters.length; ++j) {
                    parameters[j] = getJavaObject(paramTypes[j], parameters[j]);
                }
                return box(((Constructor)classNameOrConstructor).newInstance(parameters));
            }
            final Class resultClass = classForName(classNameOrConstructor);
            if (parameters.length > 0) {
                final Class[] argClasses = new Class[parameters.length];
                final Object[] argsConverted = new Object[parameters.length];
                for (int k = 0; k < parameters.length; ++k) {
                    if ((boolean)JavaLink.DEBUG) {
                        System.out.println("arg " + k + " = [" + parameters[k] + "], is of type " + parameters[k].getClass());
                    }
                    argClasses[k] = getJavaClass(parameters[k]);
                    argsConverted[k] = getJavaObject(parameters[k]);
                }
                return box(resultClass.getConstructor((Class<?>[])argClasses).newInstance(argsConverted));
            }
            return box(resultClass.newInstance());
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException((e.getCause() != null) ? e.getCause() : e);
        }
        catch (InstantiationException e2) {
            throw new RuntimeException((e2.getCause() != null) ? e2.getCause() : e2);
        }
        catch (IllegalAccessException e3) {
            throw new RuntimeException((e3.getCause() != null) ? e3.getCause() : e3);
        }
        catch (InvocationTargetException e4) {
            throw new RuntimeException((e4.getCause() != null) ? e4.getCause() : e4);
        }
        catch (NoSuchMethodException e5) {
            throw new RuntimeException((e5.getCause() != null) ? e5.getCause() : e5);
        }
    }
    
    public static final SubLObject _method(Object classNameOrReference, Object methodName, final Object... parameterTypes) {
        if ((boolean)JavaLink.DEBUG) {
            System.out.println("JavaLink._method(" + classNameOrReference + ", " + methodName + ", " + parameterTypes.toString());
        }
        classNameOrReference = possiblyUnbox(classNameOrReference);
        methodName = possiblyUnbox(methodName);
        for (int i = 0; i < parameterTypes.length; ++i) {
            parameterTypes[i] = possiblyUnbox(parameterTypes[i]);
        }
        try {
            final Class classClass = classForName(classNameOrReference);
            final String methodString = subLObjectToString(methodName);
            Class[] argClasses = null;
            if (parameterTypes != null) {
                argClasses = new Class[parameterTypes.length];
                for (int j = 0; j < parameterTypes.length; ++j) {
                    argClasses[j] = classForName(parameterTypes[j]);
                }
            }
            if (methodString.isEmpty() || (methodName instanceof SubLObject && ((SubLObject)methodName).isNil())) {
                return box(classClass.getDeclaredConstructor((Class[])argClasses));
            }
            return box(classClass.getDeclaredMethod(methodString, (Class[])argClasses));
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException((e.getCause() != null) ? e.getCause() : e);
        }
        catch (NoSuchMethodException e2) {
            throw new RuntimeException((e2.getCause() != null) ? e2.getCause() : e2);
        }
    }
    
    public static final SubLObject _static(Object methodObject, Object classObject, final Object... argObjects) {
        if ((boolean)JavaLink.DEBUG) {
            System.out.println("JavaLink._static(" + methodObject + ", " + classObject + ", " + argObjects);
        }
        methodObject = possiblyUnbox(methodObject);
        classObject = possiblyUnbox(classObject);
        for (int i = 0; i < argObjects.length; ++i) {
            argObjects[i] = possiblyUnbox(argObjects[i]);
        }
        try {
            Method method;
            if (methodObject instanceof Method) {
                method = (Method)methodObject;
            }
            else if (argObjects.length > 0) {
                final Class[] argClasses = new Class[argObjects.length];
                for (int j = 0; j < argObjects.length; ++j) {
                    if ((boolean)JavaLink.DEBUG) {
                        System.out.println("arg " + j + " = [" + argObjects[j] + "], is of type " + argObjects[j].getClass());
                    }
                    argClasses[j] = getJavaClass(argObjects[j]);
                }
                method = (Method)unbox(_method(classObject, methodObject, (Object[])(Class[])argClasses));
            }
            else {
                method = (Method)unbox(_method(classObject, methodObject, new Object[0]));
            }
            Object[] args = null;
            if (argObjects != null) {
                final int argsCount = Array.getLength(argObjects);
                args = new Object[argsCount];
                for (int k = 0; k < argsCount; ++k) {
                    args[k] = getJavaObject(method.getParameterTypes()[k], argObjects[k]);
                }
            }
            return box(method.invoke((Object)null, args));
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException((e.getCause() != null) ? e.getCause() : e);
        }
        catch (IllegalArgumentException e2) {
            throw new RuntimeException((e2.getCause() != null) ? e2.getCause() : e2);
        }
        catch (InvocationTargetException e3) {
            throw new RuntimeException((e3.getCause() != null) ? e3.getCause() : e3);
        }
    }
    
    public static final SubLObject _call(Object methodObject, Object instanceObject, final Object... argObjects) {
        if ((boolean)JavaLink.DEBUG) {
            System.out.println("JavaLink._call(" + methodObject + ", " + instanceObject + ", " + argObjects);
        }
        methodObject = possiblyUnbox(methodObject);
        instanceObject = possiblyUnbox(instanceObject);
        for (int i = 0; i < argObjects.length; ++i) {
            argObjects[i] = possiblyUnbox(argObjects[i]);
        }
        try {
            if (methodObject instanceof Method) {
                final Method method = (Method)methodObject;
                Object[] args = null;
                if (argObjects != null) {
                    final int argsCount = Array.getLength(argObjects);
                    args = new Object[argsCount];
                    for (int j = 0; j < argsCount; ++j) {
                        args[j] = getJavaObject(method.getParameterTypes()[j], argObjects[j]);
                    }
                }
                return box(method.invoke(instanceObject, args));
            }
            throw new RuntimeException("Arguments that are instanceof Method are currently supported (called with " + methodObject + ".)" + " For now, use java-method to find the method first");
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException((e.getCause() != null) ? e.getCause() : e);
        }
        catch (IllegalArgumentException e2) {
            throw new RuntimeException((e2.getCause() != null) ? e2.getCause() : e2);
        }
        catch (InvocationTargetException e3) {
            throw new RuntimeException((e3.getCause() != null) ? e3.getCause() : e3);
        }
    }
    
    private static Class getJavaClass(final Object subLObject) {
        Class result;
        if (subLObject instanceof SubLT) {
            result = Boolean.TYPE;
        }
        else if (subLObject instanceof SubLNil) {
            result = ArrayList.class;
        }
        else if (subLObject instanceof SubLSymbol) {
            result = String.class;
        }
        else if (subLObject instanceof SubLString) {
            result = String.class;
        }
        else if (subLObject instanceof SubLCharacter) {
            result = Character.TYPE;
        }
        else if (subLObject instanceof AbstractSubLFloat) {
            result = Double.TYPE;
        }
        else if (subLObject instanceof AbstractSubLIntegerBignum) {
            result = Integer.TYPE;
        }
        else if (subLObject instanceof SubLLongBignum) {
            result = Long.TYPE;
        }
        else if (subLObject instanceof SubLBigIntBignum) {
            result = BigInteger.class;
        }
        else if (subLObject instanceof SubLVector) {
            result = ArrayList.class;
        }
        else if (subLObject instanceof AbstractSubLList) {
            result = ArrayList.class;
        }
        else {
            if (!(subLObject instanceof SubLHashtable)) {
                throw new RuntimeException("Unable to find equivalent Java class for [" + subLObject.getClass() + "]");
            }
            result = Map.class;
        }
        return result;
    }
    
    private static Object getJavaObject(final Object subLObject) {
        Object result;
        if (subLObject instanceof SubLT) {
            result = ((SubLT)subLObject).toBoolean();
        }
        else if (subLObject instanceof SubLNil) {
            result = new ArrayList();
        }
        else if (subLObject instanceof SubLSymbol) {
            result = subLObjectToString(subLObject);
        }
        else if (subLObject instanceof SubLString) {
            result = ((SubLString)subLObject).getString();
        }
        else if (subLObject instanceof SubLCharacter) {
            result = ((SubLCharacter)subLObject).charValue();
        }
        else if (subLObject instanceof AbstractSubLFloat) {
            result = ((AbstractSubLFloat)subLObject).doubleValue();
        }
        else if (subLObject instanceof AbstractSubLIntegerBignum) {
            result = ((AbstractSubLIntegerBignum)subLObject).intValue();
        }
        else if (subLObject instanceof SubLLongBignum) {
            result = ((SubLLongBignum)subLObject).longValue();
        }
        else if (subLObject instanceof SubLBigIntBignum) {
            result = ((SubLBigIntBignum)subLObject).bigIntegerValue();
        }
        else if (subLObject instanceof SubLVector) {
            final Object[] tmp = ((SubLVector)subLObject).toArray();
            final ArrayList<Object> arr = new ArrayList<Object>(tmp.length);
            for (final Object obj : tmp) {
                arr.add(getJavaObject(obj));
            }
            result = arr;
        }
        else if (subLObject instanceof AbstractSubLList) {
            final Object[] tmp = ((AbstractSubLList)subLObject).toArray();
            final ArrayList<Object> arr = new ArrayList<Object>(tmp.length);
            for (final Object obj : tmp) {
                arr.add(getJavaObject(obj));
            }
            result = arr;
        }
        else {
            if (!(subLObject instanceof SubLHashtable)) {
                throw new RuntimeException("Unable to convert an instance of [" + subLObject.getClass() + "] to Java object");
            }
            final HashMap<Object, Object> m = new HashMap<Object, Object>();
            final Iterator it = ((SubLHashtable)subLObject).getEntrySetIterator();
            while (it.hasNext()) {
                final Map.Entry pair = (Map.Entry)it.next();
                final Object key = getJavaObject(pair.getKey());
                final Object val = getJavaObject(pair.getValue());
                m.put(key, val);
            }
            result = m;
        }
        if ((boolean)JavaLink.DEBUG) {
            System.out.println(result);
        }
        return result;
    }
    
    private static Object getJavaObject(final Class targetClass, final Object subLObject) {
        Object result;
        if (subLObject instanceof SubLT && targetClass.isAssignableFrom(Boolean.TYPE)) {
            result = ((SubLT)subLObject).toBoolean();
        }
        else if (subLObject instanceof SubLNil && canAssign(List.class, targetClass)) {
            result = new ArrayList();
        }
        else if (subLObject instanceof SubLNil && canAssign(Boolean.TYPE, targetClass)) {
            result = ((SubLNil)subLObject).toBoolean();
        }
        else if (subLObject instanceof SubLSymbol && canAssign(String.class, targetClass)) {
            result = subLObjectToString(subLObject);
        }
        else if (subLObject instanceof SubLString && canAssign(String.class, targetClass)) {
            result = ((SubLString)subLObject).getString();
        }
        else if (subLObject instanceof SubLCharacter && canAssign(Character.TYPE, targetClass)) {
            result = ((SubLCharacter)subLObject).charValue();
        }
        else if (subLObject instanceof AbstractSubLFloat && canAssign(Double.TYPE, targetClass)) {
            result = ((AbstractSubLFloat)subLObject).doubleValue();
        }
        else if (subLObject instanceof AbstractSubLIntegerBignum && canAssign(Integer.TYPE, targetClass)) {
            result = ((AbstractSubLIntegerBignum)subLObject).intValue();
        }
        else if (subLObject instanceof SubLLongBignum && canAssign(Long.TYPE, targetClass)) {
            result = ((SubLLongBignum)subLObject).longValue();
        }
        else if (subLObject instanceof SubLBigIntBignum && canAssign(BigInteger.class, targetClass)) {
            result = ((SubLBigIntBignum)subLObject).bigIntegerValue();
        }
        else if (subLObject instanceof SubLVector && canAssign(List.class, targetClass)) {
            final Object[] tmp = ((SubLVector)subLObject).toArray();
            final ArrayList<Object> arr = new ArrayList<Object>(tmp.length);
            for (final Object obj : tmp) {
                arr.add(getJavaObject(targetClass, obj));
            }
            result = arr;
        }
        else if (subLObject instanceof AbstractSubLList && canAssign(List.class, targetClass)) {
            final Object[] tmp = ((AbstractSubLList)subLObject).toArray();
            final ArrayList<Object> arr = new ArrayList<Object>(tmp.length);
            for (final Object obj : tmp) {
                arr.add(getJavaObject(targetClass, obj));
            }
            result = arr;
        }
        else {
            if (!(subLObject instanceof SubLHashtable) || !canAssign(Map.class, targetClass)) {
                throw new RuntimeException("Unable to convert an instance of [" + subLObject.getClass() + "] to Java object");
            }
            final HashMap<Object, Object> m = new HashMap<Object, Object>();
            final Iterator it = ((SubLHashtable)subLObject).getEntrySetIterator();
            while (it.hasNext()) {
                final Map.Entry pair = (Map.Entry)it.next();
                final Object key = getJavaObject(targetClass, pair.getKey());
                final Object val = getJavaObject(targetClass, pair.getValue());
                m.put(key, val);
            }
            result = m;
        }
        if ((boolean)JavaLink.DEBUG) {
            System.out.println(result);
        }
        return result;
    }
    
    private static Object coerceToClass(final Class classClass, final Object coercible) {
        if ((boolean)JavaLink.DEBUG) {
            System.out.println("Coercing (" + coercible.getClass() + ") " + coercible + " into class " + classClass);
        }
        try {
            if (classClass.isAssignableFrom(coercible.getClass())) {
                return coercible;
            }
            if (coercible instanceof SubLObject && classClass.equals(classForName("Z"))) {
                return !((SubLObject)coercible).isNil();
            }
            if (coercible instanceof SubLSymbol) {
                return subLObjectToString(coercible);
            }
            if (coercible instanceof SubLObject && classClass.equals(classForName("C"))) {
                return ((SubLObject)coercible).charValue();
            }
            if (coercible instanceof SubLObject && classClass.equals(classForName("D"))) {
                return ((SubLObject)coercible).doubleValue();
            }
            if (coercible instanceof SubLObject && classClass.equals(classForName("I"))) {
                return ((SubLObject)coercible).intValue();
            }
            if (coercible instanceof SubLObject && classClass.equals(classForName("J"))) {
                return ((SubLObject)coercible).longValue();
            }
            if (classClass.getName().startsWith("[")) {
                if (coercible instanceof SubLList) {
                    return coerceToClass(classClass, ((SubLList)coercible).toSubLObjectArray());
                }
                if (coercible instanceof SubLVector) {
                    return coerceToClass(classClass, ((SubLVector)coercible).toArray(new Array[((SubLVector)coercible).size()]));
                }
                if (coercible.getClass().isArray()) {
                    final int arrayLength = Array.getLength(coercible);
                    final Class elemClass = classForName(classClass.getName().substring(1));
                    final Object result = Array.newInstance(elemClass, arrayLength);
                    for (int i = 0; i < arrayLength; ++i) {
                        final Object coercibleElem = Array.get(coercible, i);
                        if (coercibleElem instanceof SubLObject && elemClass.equals(classForName("Z"))) {
                            Array.setBoolean(result, i, !((SubLObject)coercibleElem).isNil());
                        }
                        else if (coercibleElem instanceof SubLObject && elemClass.equals(classForName("C"))) {
                            Array.setChar(result, i, ((SubLObject)coercibleElem).charValue());
                        }
                        else if (coercibleElem instanceof SubLObject && elemClass.equals(classForName("D"))) {
                            Array.setDouble(result, i, ((SubLObject)coercibleElem).doubleValue());
                        }
                        else if (coercibleElem instanceof SubLObject && elemClass.equals(classForName("I"))) {
                            Array.setInt(result, i, ((SubLObject)coercibleElem).intValue());
                        }
                        else if (coercibleElem instanceof SubLObject && elemClass.equals(classForName("J"))) {
                            Array.setLong(result, i, ((SubLObject)coercibleElem).longValue());
                        }
                        else {
                            final Object coercedElem = coerceToClass(elemClass, coercibleElem);
                            if (elemClass.isAssignableFrom(coercedElem.getClass())) {
                                Array.set(result, i, coercedElem);
                            }
                            else if ((boolean)JavaLink.DEBUG) {
                                System.out.println("coerceToClass can't coerce  (" + coercibleElem.getClass() + ")" + coercibleElem + " to " + elemClass);
                            }
                        }
                    }
                    return result;
                }
            }
            throw new RuntimeException("JavaLink.coerceToClass doen't know how to coerce (" + coercible.getClass() + ") " + coercible + " to " + classClass);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException((e.getCause() != null) ? e.getCause() : e);
        }
    }
    
    private static Class classForName(final Object rawClassName) throws ClassNotFoundException {
        if (rawClassName instanceof Class) {
            return (Class)rawClassName;
        }
        String className;
        if (rawClassName instanceof SubLObject) {
            className = subLObjectToString(rawClassName);
        }
        else {
            className = rawClassName.toString();
        }
        if ("boolean".equals(className)) {
            return Boolean.TYPE;
        }
        if ("Z".equals(className)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(className)) {
            return Byte.TYPE;
        }
        if ("B".equals(className)) {
            return Byte.TYPE;
        }
        if ("char".equals(className)) {
            return Character.TYPE;
        }
        if ("C".equals(className)) {
            return Character.TYPE;
        }
        if ("double".equals(className)) {
            return Double.TYPE;
        }
        if ("D".equals(className)) {
            return Double.TYPE;
        }
        if ("float".equals(className)) {
            return Float.TYPE;
        }
        if ("F".equals(className)) {
            return Float.TYPE;
        }
        if ("int".equals(className)) {
            return Integer.TYPE;
        }
        if ("I".equals(className)) {
            return Integer.TYPE;
        }
        if ("long".equals(className)) {
            return Long.TYPE;
        }
        if ("J".equals(className)) {
            return Long.TYPE;
        }
        if ("short".equals(className)) {
            return Short.TYPE;
        }
        if ("S".equals(className)) {
            return Short.TYPE;
        }
        if ("void".equals(className)) {
            return Void.TYPE;
        }
        if ((boolean)JavaLink.DEBUG) {
            System.out.println("classForName(" + rawClassName + ") --> " + Class.forName(className));
        }
        return Class.forName(className);
    }
    
    private static String subLObjectToString(final Object object) {
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof SubLString) {
            return ((SubLString)object).getString();
        }
        return object.toString();
    }
    
    private static SubLObject box(final Object object) {
        SubLObject result;
        try {
            if (object == null) {
                result = SubLNil.NIL;
            }
            else if (object instanceof SubLObject) {
                result = (SubLObject)object;
            }
            else if (object.getClass().equals(classForName("Z")) || object instanceof Boolean) {
                result = SubLObjectFactory.makeBoolean((boolean)(Boolean)object);
            }
            else if (object.getClass().equals(classForName("C")) || object instanceof Character) {
                result = SubLObjectFactory.makeChar(object.toString());
            }
            else if (object.getClass().equals(classForName("D")) || object instanceof Double) {
                result = SubLObjectFactory.makeDouble(object.toString());
            }
            else if (object.getClass().equals(classForName("I")) || object instanceof Integer) {
                result = SubLObjectFactory.makeInteger(object.toString());
            }
            else {
                result = new SubLAlienObject(object);
            }
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException((e.getCause() != null) ? e.getCause() : e);
        }
        if ((boolean)JavaLink.DEBUG) {
            System.out.println("JavaLink.box((" + object.getClass() + ")" + object + ") --> " + "(" + result.getClass() + ")" + result);
        }
        return result;
    }
    
    private static Object unbox(final SubLObject subLObject) {
        Object result;
        if (subLObject instanceof SubLAlienObject) {
            result = ((SubLAlienObject)subLObject).getAlien();
        }
        else {
            result = subLObject;
        }
        if ((boolean)JavaLink.DEBUG) {
            System.out.println("JavaLink.unbox((" + subLObject.getClass() + ")" + subLObject + ") --> " + "(" + result.getClass() + ")" + result);
        }
        return result;
    }
    
    private static Object possiblyUnbox(final Object object) {
        Object result;
        if (object instanceof SubLAlienObject) {
            result = ((SubLAlienObject)object).getAlien();
        }
        else {
            result = object;
        }
        if ((boolean)JavaLink.DEBUG) {
            System.out.println("JavaLink.possiblyUnbox((" + object.getClass() + ")" + object + ") --> " + "(" + result.getClass() + ")" + result);
        }
        return result;
    }
    
    public static boolean canAssign(final Class cls, final Class toClass) {
        if (cls.equals(toClass)) {
            return true;
        }
        if (!cls.isPrimitive()) {
            return toClass.isAssignableFrom(cls);
        }
        if (!toClass.isPrimitive()) {
            return false;
        }
        if (Integer.TYPE.equals(cls)) {
            return Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass);
        }
        if (Long.TYPE.equals(cls)) {
            return Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass);
        }
        if (Boolean.TYPE.equals(cls)) {
            return false;
        }
        if (Double.TYPE.equals(cls)) {
            return false;
        }
        if (Float.TYPE.equals(cls)) {
            return Double.TYPE.equals(toClass);
        }
        if (Character.TYPE.equals(cls)) {
            return Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass);
        }
        if (Short.TYPE.equals(cls)) {
            return Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass);
        }
        return Byte.TYPE.equals(cls) && (Short.TYPE.equals(toClass) || Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass));
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
    
    static {
        JavaLink.DEBUG = false;
        me = new JavaLink();
    }
}

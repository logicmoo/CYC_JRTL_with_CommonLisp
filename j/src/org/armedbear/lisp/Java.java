/*
 * Java.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: Java.java,v 1.40 2004-02-23 14:24:46 piso Exp $
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

package org.armedbear.lisp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

public final class Java extends Lisp
{
    // ### jclass
    private static final Primitive1 JCLASS = new Primitive1("jclass", PACKAGE_JAVA, true, "name")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            String className = arg.getStringValue();
            try {
                return new JavaObject(classForName(className));
            }
            catch (ClassNotFoundException e) {
                signal(new LispError("class not found: " + className));
            }
            catch (Throwable t) {
                signal(new LispError(getMessage(t)));
            }
            // Not reached.
            return NIL;
        }
    };

    // ### jfield - retrieve or modify a field in a Java class or instance.
    /*
     * Supported argument patterns:
     *
     *   Case 1: class-ref  field-name:
     *               to retrieve the value of a static field.
     *
     *   Case 2: class-ref  field-name  instance-ref:
     *               to retrieve the value of a class field of the instance.
     *
     *   Case 3: class-ref  field-name  primitive-value:
     *               to store primitive-value in a static field.
     *
     *   Case 4: class-ref  field-name  instance-ref  value:
     *               to store value in a class field of the instance.
     *
     *   Case 5: class-ref  field-name  nil  value:
     *               to store value in a static field (when value may be
     *               confused with an instance-ref).
     *
     *   Case 6: field-name  instance:
     *               to retrieve the value of a field of the instance. The
     *               class is derived from the instance.
     *
     *   Case 7: field-name  instance  value:
     *               to store value in a field of the instance. The class is
     *               derived from the instance.
     */
    private static final Primitive JFIELD =
        new Primitive("jfield", PACKAGE_JAVA, true,
                      "class-ref-or-field field-or-instance &optional instance value")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            return makeLispObject((JFIELD_RAW.execute(args)).javaInstance());
        }
    };

    // ### jfield-raw - retrieve or modify a field in a Java class or instance.
    private static final Primitive JFIELD_RAW =
        new Primitive("jfield-raw", PACKAGE_JAVA, true,
                      "class-ref-or-field field-or-instance &optional instance value")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2 || args.length > 4)
                signal(new WrongNumberOfArgumentsException(this));
            String fieldName = null;
            Class c;
            Field f;
            Class fieldType;
            Object instance = null;
            try {
                if (args[1] instanceof AbstractString) {
                    // Cases 1-5.
                    fieldName = args[1].getStringValue();
                    c = forClassRef(args[0]);
                } else {
                    // Cases 6 and 7.
                    fieldName = args[0].getStringValue();
                    instance = JavaObject.getObject(args[1]);
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
                                instance = JavaObject.getObject(args[2]);
                                break;
                            } else {
                                // Case 3.
                                f.set(null,args[2].javaInstance(fieldType));
                                return args[2];
                            }
                        } else {
                            // Case 7.
                            f.set(instance,args[2].javaInstance(fieldType));
                            return args[2];
                        }
                    case 4:
                        // Cases 4 and 5.
                        if (args[2] != NIL) {
                            // Case 4.
                            instance = JavaObject.getObject(args[2]);
                        }
                        f.set(instance,args[3].javaInstance(fieldType));
                        return args[3];
                }
                return new JavaObject(f.get(instance));
            }
            catch (ClassNotFoundException e) {
                signal(new LispError("class not found: " + e.getMessage()));
            }
            catch (NoSuchFieldException e) {
                signal(new LispError("no such field"));
            }
            catch (SecurityException e) {
                signal(new LispError("inaccessible field"));
            }
            catch (IllegalAccessException e) {
                signal(new LispError("illegal access"));
            }
            catch (IllegalArgumentException e) {
                signal(new LispError("illegal argument"));
            }
            catch (Throwable t) {
                signal(new LispError(getMessage(t)));
            }
            // Not reached.
            return NIL;
        }
    };

    // ### jconstructor
    // jconstructor class-ref &rest parameter-class-refs
    private static final Primitive JCONSTRUCTOR =
        new Primitive("jconstructor", PACKAGE_JAVA, true, "class-ref &rest parameter-class-refs")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 1)
                signal(new WrongNumberOfArgumentsException(this));
            try {
                final Class c = forClassRef(args[0]);
                int argCount = 0;
                if (args.length == 2 && args[1] instanceof Fixnum) {
                    argCount = Fixnum.getValue(args[1]);
                } else {
                    Class[] parameterTypes = new Class[args.length-1];
                    for (int i = 1; i < args.length; i++) {
                        parameterTypes[i-1] = forClassRef(args[i]);
                    }
                    return new JavaObject(c.getConstructor(parameterTypes));
                }
                // Parameter types not explicitly specified.
                Constructor[] constructors = c.getConstructors();
                for (int i = 0; i < constructors.length; i++) {
                    Constructor constructor = constructors[i];
                    if (constructor.getParameterTypes().length == argCount)
                        return new JavaObject(constructor);
                }
                throw new NoSuchMethodException();
            }
            catch (ClassNotFoundException e) {
                signal(new LispError("class not found: " + e.getMessage()));
            }
            catch (NoSuchMethodException e) {
                signal(new LispError("no such constructor"));
            }
            catch (ConditionThrowable e) {
                throw e;
            }
            catch (Throwable t) {
                signal(new LispError(getMessage(t)));
            }
            // Not reached.
            return NIL;
        }
    };

    // ### jmethod
    // jmethod class-ref name &rest parameter-class-refs
    private static final Primitive JMETHOD =
        new Primitive("jmethod", PACKAGE_JAVA, true,
                      "class-ref name &rest parameter-class-refs")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2)
                signal(new WrongNumberOfArgumentsException(this));
            String methodName = args[1].getStringValue();
            try {
                final Class c = forClassRef(args[0]);
                int argCount = 0;
                if (args.length == 3 && args[2] instanceof Fixnum) {
                    argCount = Fixnum.getValue(args[2]);
                } else {
                    Class[] parameterTypes = new Class[args.length-2];
                    for (int i = 2; i < args.length; i++) {
                        parameterTypes[i-2] = forClassRef(args[i]);
                    }
                    return new JavaObject(c.getMethod(methodName,
                                                      parameterTypes));
                }
                // Parameter types not explicitly specified.
                Method[] methods = c.getMethods();
                for (int i = 0; i < methods.length; i++) {
                    Method method = methods[i];
                    if (method.getName().equals(methodName)
                        && method.getParameterTypes().length == argCount)
                        return new JavaObject(method);
                }
                throw new NoSuchMethodException();
            }
            catch (ClassNotFoundException e) {
                signal(new LispError("class not found: " + e.getMessage()));
            }
            catch (NoSuchMethodException e) {
                signal(new LispError("no such method: " + methodName));
            }
            catch (ConditionThrowable e) {
                throw e;
            }
            catch (Throwable t) {
                signal(new LispError(getMessage(t)));
            }
            // Not reached.
            return NIL;
        }
    };

    // ### jstatic
    // jstatic method class &rest args
    private static final Primitive JSTATIC = new Primitive("jstatic", PACKAGE_JAVA, true,
                                                           "method class &rest args")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            return makeLispObject((JSTATIC_RAW.execute(args)).javaInstance());
        }
    };


    // ### jstatic-raw
    // jstatic-raw method class &rest args
    private static final Primitive JSTATIC_RAW = new Primitive("jstatic-raw", PACKAGE_JAVA, true,
                                                               "method class &rest args")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2)
                signal(new WrongNumberOfArgumentsException(this));
            try {
                Method m = null;
                LispObject methodRef = args[0];
                if (methodRef instanceof JavaObject) {
                    Object obj = ((JavaObject)methodRef).getObject();
                    if (obj instanceof Method)
                        m = (Method) obj;
                } else if (methodRef instanceof AbstractString) {
                    Class c = forClassRef(args[1]);
                    if (c != null) {
                        String methodName = methodRef.getStringValue();
                        Method[] methods = c.getMethods();
                        for (int i = 0; i < methods.length; i++) {
                            Method method = methods[i];
                            if (!Modifier.isStatic(method.getModifiers()))
                                continue;
                            if (method.getName().equals(methodName)) {
                                m = method;
                                break;
                            }
                        }
                        if (m == null)
                            signal(new LispError("no such method"));
                    }
                } else
                    signal(new TypeError("wrong type: " + methodRef));
                Object[] methodArgs = new Object[args.length-2];
                Class[] argTypes = m.getParameterTypes();
                for (int i = 2; i < args.length; i++) {
                    LispObject arg = args[i];
                    if (arg == NIL)
                        methodArgs[i-2] = null;
                    else
                        methodArgs[i-2] = arg.javaInstance(argTypes[i-2]);
                }
                Object result = m.invoke(null, methodArgs);
                return new JavaObject(result);
            }
            catch (Throwable t) {
                signal(new LispError(getMessage(t)));
            }
            // Not reached.
            return NIL;
        }
    };

    // ### jnew
    // jnew constructor &rest args
    private static final Primitive JNEW = new Primitive("jnew", PACKAGE_JAVA, true,
                                                        "constructor &rest args")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 1)
                signal(new WrongNumberOfArgumentsException(this));
            LispObject classRef = args[0];
            try {
                Constructor constructor = (Constructor) JavaObject.getObject(classRef);
                Class[] argTypes = constructor.getParameterTypes();
                Object[] initargs = new Object[args.length-1];
                for (int i = 1; i < args.length; i++) {
                    LispObject arg = args[i];
                    if (arg == NIL)
                        initargs[i-1] = null;
                    else {
                        initargs[i-1] = arg.javaInstance(argTypes[i-1]);
                    }
                }
                return new JavaObject(constructor.newInstance(initargs));
            }
            catch (Throwable t) {
                signal(new LispError(getMessage(t)));
            }
            // Not reached.
            return NIL;
        }
    };

    // ### jnew-array
    // jnew-array element-type &rest dimensions
    private static final Primitive JNEW_ARRAY = new Primitive("jnew-array", PACKAGE_JAVA, true,
                                                              "element-type &rest dimensions")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2)
                signal(new WrongNumberOfArgumentsException(this));
            try {
                Class c = forClassRef(args[0]);
                int[] dimensions = new int[args.length - 1];
                for (int i = 1; i < args.length; i++)
                    dimensions[i-1] = ((Integer)args[i].javaInstance()).intValue();
                return new JavaObject(Array.newInstance(c, dimensions));
            }
            catch (ClassNotFoundException e) {
                signal(new LispError("class not found: " + e.getMessage()));
            }
            catch (Throwable t) {
                signal(new LispError(getMessage(t)));
            }
            // Not reached.
            return NIL;
        }
    };

    // ### jarray-ref
    // jarray-ref java-array &rest indices
    private static final Primitive JARRAY_REF = new Primitive("jarray-ref", PACKAGE_JAVA, true,
                                                              "java-array &rest indices")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            return makeLispObject((JARRAY_REF_RAW.execute(args)).javaInstance());
        }
    };

    // ### jarray-ref-raw
    // jarray-ref-raw java-array &rest indices
    private static final Primitive JARRAY_REF_RAW = new Primitive("jarray-ref-raw", PACKAGE_JAVA, true,
                                                                  "java-array &rest indices")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2)
                signal(new WrongNumberOfArgumentsException(this));
            try {
                Object a = args[0].javaInstance();
                for (int i = 1; i<args.length - 1; i++)
                    a = Array.get(a, ((Integer)args[i].javaInstance()).intValue());
                return new JavaObject(Array.get(a, ((Integer)args[args.length - 1].javaInstance()).intValue()));
            }
            catch (Throwable t) {
                signal(new LispError(getMessage(t)));
            }
            // Not reached.
            return NIL;
        }
    };

    // ### jarray-set
    // jarray-set java-array new-value &rest indices
    private static final Primitive JARRAY_SET = new Primitive("jarray-set", PACKAGE_JAVA, true,
                                                              "java-array new-value &rest indices")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 3)
                signal(new WrongNumberOfArgumentsException(this));
            try {
                Object a = args[0].javaInstance();
                LispObject v = args[1];
                for (int i = 2; i<args.length - 1; i++)
                    a = Array.get(a, ((Integer)args[i].javaInstance()).intValue());
                Array.set(a, ((Integer)args[args.length - 1].javaInstance()).intValue(), v.javaInstance());
                return v;
            }
            catch (Throwable t) {
                signal(new LispError(getMessage(t)));
            }
            // Not reached.
            return NIL;
        }
    };

    // ### jcall
    // jcall method instance &rest args
    private static final Primitive JCALL = new Primitive("jcall", PACKAGE_JAVA, true,
                                                         "method instance &rest args")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            return makeLispObject((JCALL_RAW.execute(args)).javaInstance());
        }
    };

    // ### jcall-raw
    // jcall-raw method instance &rest args
    private static final Primitive JCALL_RAW = new Primitive("jcall-raw", PACKAGE_JAVA, true,
                                                             "method instance &rest args")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2)
                signal(new WrongNumberOfArgumentsException(this));
            try {
                Method method = (Method) JavaObject.getObject(args[0]);
                Class[] argTypes = method.getParameterTypes();
                Object instance;
                if (args[1] instanceof AbstractString)
                    instance = args[1].getStringValue();
                else
                    instance = JavaObject.getObject(args[1]);
                Object[] methodArgs = new Object[args.length-2];
                for (int i = 2; i < args.length; i++) {
                    LispObject arg = args[i];
                    if (arg == NIL)
                        methodArgs[i-2] = null;
                    else
                        methodArgs[i-2] = arg.javaInstance(argTypes[i-2]);
                }
                Object result = method.invoke(instance, methodArgs);
                return new JavaObject(result);
            }
            catch (Throwable t) {
                signal(new LispError(getMessage(t)));
            }
            // Not reached.
            return NIL;
        }
    };

    // ### make-immediate-object
    // make-immediate-object object &optional type
    private static final Primitive MAKE_IMMEDIATE_OBJECT =
        new Primitive("make-immediate-object", PACKAGE_JAVA, true, "object &optional type")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 1)
                signal(new WrongNumberOfArgumentsException(this));
            LispObject object = args[0];
            try {
                if (args.length > 1) {
                    LispObject type = args[1];
                    if (type == Keyword.BOOLEAN) {
                        if (object == NIL)
                            return new JavaObject(Boolean.FALSE);
                        else
                            return new JavaObject(Boolean.TRUE);
                    }
                    if (type == Keyword.REF) {
                        if (object == NIL)
                            return new JavaObject(null);
                        else
                            throw new Error();
                    }
                    // other special cases come here
                }
                return new JavaObject(object.javaInstance());
            }
            catch (Throwable t) {
                signal(new LispError("MAKE-IMMEDIATE-OBJECT: not implemented"));
            }
            // Not reached.
            return NIL;
        }
    };

    private static final Primitive1 JAVA_OBJECT_P = new Primitive1("java-object-p", PACKAGE_JAVA, true,
                                                                   "object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return (arg instanceof JavaObject) ? T : NIL;
        }
    };

    // ### jobject-lisp-value
    // jobject-lisp-value java-object
    private static final Primitive1 JOBJECT_LISP_VALUE =
        new Primitive1("jobject-lisp-value", PACKAGE_JAVA, true, "java-object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return makeLispObject(arg.javaInstance());
        }
    };

    private static Class classForName(String className) throws ClassNotFoundException
    {
        try {
            return Class.forName(className);
        }
        catch (ClassNotFoundException e) {
            return Class.forName(className, true, JavaClassLoader.getPersistentInstance());
        }
    }

    // Supports Java primitive types too.
    private static Class forClassRef(LispObject classRef) throws ClassNotFoundException, ConditionThrowable
    {
        if (classRef instanceof AbstractString) {
            String className = classRef.getStringValue();
            if (className.equals("boolean"))
                return Boolean.TYPE;
            if (className.equals("byte"))
                return Byte.TYPE;
            if (className.equals("char"))
                return Character.TYPE;
            if (className.equals("short"))
                return Short.TYPE;
            if (className.equals("int"))
                return Integer.TYPE;
            if (className.equals("long"))
                return Long.TYPE;
            if (className.equals("float"))
                return Float.TYPE;
            if (className.equals("double"))
                return Double.TYPE;
            // Not a primitive Java type.
            return classForName(className);
        } else
            try {
                return (Class)JavaObject.getObject(classRef);
            }
        catch (ClassCastException e) {
            signal(new TypeError(classRef, "Java class"));
        }
        catch (ConditionThrowable e) {
            throw new ClassNotFoundException(e.getMessage());
        }
        // Not reached.
        return null;
    }

    private static final LispObject makeLispObject(Object obj) throws ConditionThrowable
    {
        if (obj == null)
            return NIL;
        if (obj instanceof Boolean)
            return ((Boolean)obj).booleanValue() ? T : NIL;
        if (obj instanceof Integer)
            return new Fixnum(((Integer)obj).intValue());
        if (obj instanceof Long)
            return new Bignum(((Long)obj).longValue());
        if (obj instanceof Double || obj instanceof Float)
            return new LispFloat(((Number)obj).doubleValue());
        if (obj instanceof String)
            return new SimpleString((String)obj);
        if (obj instanceof Character)
            return LispCharacter.getInstance(((Character)obj).charValue());
        if (obj instanceof Object[]) {
            Object[] array = (Object[]) obj;
            Vector v = new Vector(array.length);
            for (int i = array.length; i-- > 0;)
                v.set(i, new JavaObject(array[i]));
            return v;
        }
        return new JavaObject(obj);
    }

    private static final String getMessage(Throwable t)
    {
        if (t instanceof InvocationTargetException) {
            try {
                Method method =
                    Throwable.class.getMethod("getCause", new Class[0]);
                if (method != null) {
                    Throwable cause = (Throwable) method.invoke(t,
                                                                new Object[0]);
                    if (cause != null)
                        t = cause;
                }
            }
            catch (NoSuchMethodException e) {
                Debug.trace(e);
            }
            catch (Exception e) {
                Debug.trace(e);
            }
        }
        String message = t.getMessage();
        if (message == null || message.length() == 0)
            message = t.getClass().getName();
        return message;
    }
}

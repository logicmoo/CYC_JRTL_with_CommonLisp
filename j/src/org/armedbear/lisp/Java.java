/*
 * Java.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Java.java,v 1.8 2003-09-19 01:46:40 piso Exp $
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
import java.lang.reflect.Modifier;

public final class Java extends Module
{
    // ### jclass
    private static final Primitive1 JCLASS =
        new Primitive1("jclass", PACKAGE_JAVA) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return new JavaObject(Class.forName(LispString.getValue(arg)));
            }
            catch (ClassNotFoundException e) {
                throw new LispError("class not found: " + arg);
            }
            catch (Throwable t) {
                throw new LispError(getMessage(t));
            }
        }
    };

    // ### jconstructor
    // jconstructor class-name &rest parameter-class-names
    private static final Primitive JCONSTRUCTOR =
        new Primitive("jconstructor", PACKAGE_JAVA) {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 1)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            String className = LispString.getValue(args[0]);
            try {
                final Class c = Class.forName(className);
                Class[] parameterTypes = new Class[args.length-1];
                for (int i = 1; i < args.length; i++) {
                    className = LispString.getValue(args[i]);
                    parameterTypes[i-1] = forName(className);
                }
                return new JavaObject(c.getConstructor(parameterTypes));
            }
            catch (ClassNotFoundException e) {
                throw new LispError("class not found: " + className);
            }
            catch (NoSuchMethodException e) {
                throw new LispError("no such constructor");
            }
            catch (Throwable t) {
                throw new LispError(getMessage(t));
            }
        }
    };

    // ### jmethod
    // jmethod class-ref name &rest parameter-class-names
    private static final Primitive JMETHOD =
        new Primitive("jmethod", PACKAGE_JAVA) {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            String className = LispString.getValue(args[0]);
            String methodName = LispString.getValue(args[1]);
            try {
                final Class c = Class.forName(className);
                int argCount = -1;
                if (args.length == 3 && args[2] instanceof Fixnum) {
                    argCount = Fixnum.getValue(args[2]);
                } else if (args.length > 2) {
                    Class[] parameterTypes = new Class[args.length-2];
                    for (int i = 2; i < args.length; i++) {
                        className = LispString.getValue(args[i]);
                        parameterTypes[i-2] = forName(className);
                    }
                    return new JavaObject(c.getMethod(methodName,
                        parameterTypes));
                }
                // Parameter types not explicitly specified.
                Method[] methods = c.getMethods();
                for (int i = 0; i < methods.length; i++) {
                    Method method = methods[i];
                    if (method.getName().equals(methodName)) {
                        if (argCount >= 0) {
                            Class[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes.length == argCount)
                                return new JavaObject(method);
                        } else
                            return new JavaObject(method);
                    }
                }
                throw new LispError("no such method");
            }
            catch (ClassNotFoundException e) {
                throw new LispError("class not found: " + className);
            }
            catch (NoSuchMethodException e) {
                throw new LispError("no such method");
            }
            catch (Throwable t) {
                throw new LispError(getMessage(t));
            }
        }
    };

    // ### jstatic
    // jstatic method class &rest args
    private static final Primitive JSTATIC =
        new Primitive("jstatic", PACKAGE_JAVA) {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            try {
                Method m = null;
                LispObject methodRef = args[0];
                if (methodRef instanceof JavaObject) {
                    Object obj = ((JavaObject)methodRef).getObject();
                    if (obj instanceof Method)
                        m = (Method) obj;
                } else if (methodRef instanceof LispString) {
                    Class c = null;
                    LispObject classRef = args[1];
                    if (classRef instanceof JavaObject) {
                        Object obj = ((JavaObject)classRef).getObject();
                        if (obj instanceof Class)
                            c = (Class) obj;
                    } else if (classRef instanceof LispString) {
                        c = Class.forName(LispString.getValue(classRef));
                    }
                    if (c != null) {
                        String methodName = LispString.getValue(methodRef);
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
                            throw new LispError("no such method");
                    }
                } else
                    throw new TypeError(methodRef);
                Object[] methodArgs = new Object[args.length-2];
                for (int i = 2; i < args.length; i++) {
                    LispObject arg = args[i];
                    if (arg instanceof LispString)
                        methodArgs[i-2] = ((LispString)arg).getValue();
                    else if (arg instanceof LispCharacter)
                        methodArgs[i-2] = new Character(((LispCharacter)arg).getValue());
                    else if (arg instanceof JavaObject)
                        methodArgs[i-2] = ((JavaObject)arg).getObject();
                }
                Object result = m.invoke(null, methodArgs);
                return makeLispObject(result);
            }
            catch (Throwable t) {
                throw new LispError(getMessage(t));
            }
        }
    };

    // ### jnew
    // jnew constructor &rest args
    private static final Primitive JNEW = new Primitive("jnew", PACKAGE_JAVA) {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 1)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            LispObject classRef = args[0];
            try {
                Constructor constructor = (Constructor) JavaObject.getObject(classRef);
                Object[] initargs = new Object[args.length-1];
                for (int i = 1; i < args.length; i++) {
                    LispObject arg = args[i];
                    if (arg instanceof LispString)
                        initargs[i-1] = ((LispString)arg).getValue();
                    else if (arg instanceof Fixnum)
                        initargs[i-1] = new Integer(((Fixnum)arg).getValue());
                }
                return new JavaObject(constructor.newInstance(initargs));
            }
            catch (Throwable t) {
                throw new LispError(getMessage(t));
            }
        }
    };

    // ### jcall
    // jcall method instance &rest args
    private static final Primitive JCALL = new Primitive("jcall", PACKAGE_JAVA) {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            try {
                Method method = (Method) JavaObject.getObject(args[0]);
                Object instance;
                if (args[1] instanceof LispString)
                    instance = LispString.getValue(args[1]);
                else
                    instance = JavaObject.getObject(args[1]);
                Object[] methodArgs = new Object[args.length-2];
                for (int i = 2; i < args.length; i++) {
                    LispObject arg = args[i];
                    if (arg instanceof LispString)
                        methodArgs[i-2] = ((LispString)arg).getValue();
                    else if (arg instanceof JavaObject)
                        methodArgs[i-2] = ((JavaObject)arg).getObject();
                    else if (arg instanceof LispCharacter)
                        methodArgs[i-2] = new Character(((LispCharacter)arg).getValue());
                }
                Object result = method.invoke(instance, methodArgs);
                return makeLispObject(result);
            }
            catch (Throwable t) {
                throw new LispError(getMessage(t));
            }
        }
    };

    // Supports Java primitive types too.
    private static Class forName(String className) throws ClassNotFoundException
    {
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
        return Class.forName(className);
    }

    private static final LispObject makeLispObject(Object obj) throws ConditionThrowable
    {
        if (obj == null)
            return NIL;
        if (obj instanceof Boolean)
            return ((Boolean)obj).booleanValue() ? T : NIL;
        if (obj instanceof Long)
            return new Bignum(((Long)obj).longValue());
        if (obj instanceof Integer)
            return new Fixnum(((Integer)obj).intValue());
        if (obj instanceof String)
            return new LispString((String)obj);
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

    static {
        export("JCLASS", PACKAGE_JAVA);
        export("JCONSTRUCTOR", PACKAGE_JAVA);
        export("JMETHOD", PACKAGE_JAVA);
        export("JSTATIC", PACKAGE_JAVA);
        export("JNEW", PACKAGE_JAVA);
        export("JCALL", PACKAGE_JAVA);
    }
}

/*
 * Java.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Java.java,v 1.27 2003-12-08 04:50:30 piso Exp $
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

public final class Java extends Lisp
{
    // ### jclass
    private static final Primitive1 JCLASS = new Primitive1("jclass", PACKAGE_JAVA)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return new JavaObject(Class.forName(LispString.getValue(arg)));
            }
            catch (ClassNotFoundException e) {
                throw new ConditionThrowable(new LispError("class not found: " + arg));
            }
            catch (Throwable t) {
                throw new ConditionThrowable(new LispError(getMessage(t)));
            }
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
    private static final Primitive JFIELD = new Primitive("jfield", PACKAGE_JAVA)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2 || args.length > 4)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            String fieldName = null;
            Class c;
            Field f;
            Object instance = null;
            try {
                if (args[1] instanceof LispString) {
                    // Cases 1-5.
                    fieldName = LispString.getValue(args[1]);
		    c = forClassRef(args[0]);
                } else {
                    // Cases 6 and 7.
                    fieldName = LispString.getValue(args[0]);
                    instance = JavaObject.getObject(args[1]);
                    c = instance.getClass();
                }
                f = c.getField(fieldName);

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
                                f.set(null,args[2].javaInstance());
                                return args[2];
                            }
                        } else {
                            // Case 7.
                            f.set(instance,args[2].javaInstance());
                            return args[2];
                        }
                    case 4:
                        // Cases 4 and 5.
                        if (args[2] != NIL) {
                            // Case 4.
                            instance = JavaObject.getObject(args[2]);
                        }
                        f.set(instance,args[3].javaInstance());
                        return args[3];
                }
                return makeLispObject(f.get(instance));
            }
            catch (ClassNotFoundException e) {
                throw new ConditionThrowable(new LispError("class not found: " +
                                                           e.getMessage()));
            }
            catch (NoSuchFieldException e) {
                throw new ConditionThrowable(new LispError("no such field"));
            }
            catch (SecurityException e) {
                throw new ConditionThrowable(new LispError("inaccessible field"));
            }
            catch (IllegalAccessException e) {
                throw new ConditionThrowable(new LispError("illegal access"));
            }
            catch (IllegalArgumentException e) {
                throw new ConditionThrowable(new LispError("illegal argument"));
            }
            catch (Throwable t) {
                throw new ConditionThrowable(new LispError(getMessage(t)));
            }
        }
    };

    // ### jconstructor
    // jconstructor class-ref &rest parameter-class-refs
    private static final Primitive JCONSTRUCTOR =
        new Primitive("jconstructor", PACKAGE_JAVA)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 1)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
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
                throw new ConditionThrowable(new LispError("class not found: " + e.getMessage()));
            }
            catch (NoSuchMethodException e) {
                throw new ConditionThrowable(new LispError("no such constructor"));
            }
            catch (ConditionThrowable e) {
                throw e;
            }
            catch (Throwable t) {
                throw new ConditionThrowable(new LispError(getMessage(t)));
            }
        }
    };

    // ### jmethod
    // jmethod class-ref name &rest parameter-class-refs
    private static final Primitive JMETHOD = new Primitive("jmethod", PACKAGE_JAVA)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            String methodName = LispString.getValue(args[1]);
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
                throw new ConditionThrowable(new LispError("class not found: " + e.getMessage()));
            }
            catch (NoSuchMethodException e) {
                throw new ConditionThrowable(new LispError("no such method: " + methodName));
            }
            catch (ConditionThrowable e) {
                throw e;
            }
            catch (Throwable t) {
                throw new ConditionThrowable(new LispError(getMessage(t)));
            }
        }
    };

    // ### jstatic
    // jstatic method class &rest args
    private static final Primitive JSTATIC = new Primitive("jstatic", PACKAGE_JAVA)
    {
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
                    Class c = forClassRef(args[1]);
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
                            throw new ConditionThrowable(new LispError("no such method"));
                    }
                } else
                    throw new ConditionThrowable(new TypeError("wrong type: " + methodRef));
                Object[] methodArgs = new Object[args.length-2];
                for (int i = 2; i < args.length; i++) {
                    methodArgs[i-2] = args[i].javaInstance();
                }
                Object result = m.invoke(null, methodArgs);
                return makeLispObject(result);
            }
            catch (Throwable t) {
                throw new ConditionThrowable(new LispError(getMessage(t)));
            }
        }
    };

    // ### jnew
    // jnew constructor &rest args
    private static final Primitive JNEW = new Primitive("jnew", PACKAGE_JAVA)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 1)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            LispObject classRef = args[0];
            try {
                Constructor constructor = (Constructor) JavaObject.getObject(classRef);
                Object[] initargs = new Object[args.length-1];
                for (int i = 1; i < args.length; i++) {
                    initargs[i-1] = args[i].javaInstance();
                }
                return new JavaObject(constructor.newInstance(initargs));
            }
            catch (Throwable t) {
                throw new ConditionThrowable(new LispError(getMessage(t)));
            }
        }
    };

    // ### jcall
    // jcall method instance &rest args
    private static final Primitive JCALL = new Primitive("jcall", PACKAGE_JAVA)
    {
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
                    methodArgs[i-2] = args[i].javaInstance();
                }
                Object result = method.invoke(instance, methodArgs);
                return makeLispObject(result);
            }
            catch (Throwable t) {
                throw new ConditionThrowable(new LispError(getMessage(t)));
            }
        }
    };

    // ### make-immediate-object
    // make-immediate-object object &optional type
    private static final Primitive MAKE_IMMEDIATE_OBJECT = new Primitive("make-immediate-object", PACKAGE_JAVA, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 1)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
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
                    // other special cases come here
                }
                return new JavaObject(object.javaInstance());
            }
            catch (Throwable t) {
                throw new ConditionThrowable(new LispError("MAKE-IMMEDIATE-OBJECT: not implemented"));
            }
        }
    };

    private static final Primitive1 JAVA_OBJECT_P = new Primitive1("java-object-p", PACKAGE_JAVA)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof JavaObject)
                return T;
            else
                return NIL;
        }
    };

    // Supports Java primitive types too.
    private static Class forClassRef(LispObject classRef) throws ClassNotFoundException, ConditionThrowable
    {
        if (classRef instanceof LispString) {
            String className = LispString.getValue(classRef);
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
        } else
            try {
                return (Class)JavaObject.getObject(classRef);
            }
        catch (ClassCastException e) {
            throw new ConditionThrowable(new TypeError(classRef, "Java class"));
        }
        catch (ConditionThrowable e) {
            throw new ClassNotFoundException(e.getMessage());
        }
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
            return new LispString((String)obj);
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

    static {
        export("JCLASS", PACKAGE_JAVA);
        export("JFIELD", PACKAGE_JAVA);
        export("JCONSTRUCTOR", PACKAGE_JAVA);
        export("JMETHOD", PACKAGE_JAVA);
        export("JSTATIC", PACKAGE_JAVA);
        export("JNEW", PACKAGE_JAVA);
        export("JCALL", PACKAGE_JAVA);
        export("JAVA-OBJECT-P", PACKAGE_JAVA);
    }
}

/*
 * JavaObject.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: JavaObject.java 12570 2010-03-23 12:59:08Z mevenson $
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

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class ABCLJavaObject extends AbstractLispObject implements JavaObject {
	// ### describe-java-object
	private static Primitive DESCRIBE_JAVA_OBJECT = new JavaPrimitive("describe-java-object", Lisp.PACKAGE_JAVA, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (!(first instanceof JavaObject))
				return Lisp.type_error(first, LispSymbols.JAVA_OBJECT);
			LispStream stream = Lisp.checkStream(second);
			JavaObject javaObject = (JavaObject) first;
			stream._writeString(ABCLJavaObject.describeJavaObject(javaObject));
			return LispThread.currentThread().nothing();
		}
	};

	public static String describeJavaObject(JavaObject javaObject) {
		final Object obj = javaObject.getObject();
		final StringBuilder sb = new StringBuilder(javaObject.writeToString());
		sb.append(" is an object of type ");
		sb.append(LispSymbols.JAVA_OBJECT.writeToString());
		sb.append(".");
		sb.append(System.getProperty("line.separator"));
		sb.append("The wrapped Java object is ");
		if (obj == null)
			sb.append("null.");
		else {
			sb.append("an ");
			Class c = obj.getClass();
			String className = c.getName();
			if (c.isArray()) {
				sb.append("array of ");
				if (className.startsWith("[L") && className.endsWith(";")) {
					className = className.substring(1, className.length() - 1);
					sb.append(className);
					sb.append(" objects");
				} else if (className.startsWith("[") && className.length() > 1) {
					char descriptor = className.charAt(1);
					String type;
					switch (descriptor) {
					case 'B':
						type = "bytes";
						break;
					case 'C':
						type = "chars";
						break;
					case 'D':
						type = "doubles";
						break;
					case 'F':
						type = "floats";
						break;
					case 'I':
						type = "ints";
						break;
					case 'J':
						type = "longs";
						break;
					case 'S':
						type = "shorts";
						break;
					case 'Z':
						type = "booleans";
						break;
					default:
						type = "unknown type";
					}
					sb.append(type);
				}
				sb.append(" with ");
				final int length = java.lang.reflect.Array.getLength(obj);
				sb.append(length);
				sb.append(" element");
				if (length != 1)
					sb.append('s');
				sb.append('.');
			} else {
				sb.append("instance of ");
				sb.append(className);
				sb.append(':');
				sb.append(System.getProperty("line.separator"));
				sb.append("  \"");
				sb.append(obj.toString());
				sb.append('"');
			}
		}
		return sb.toString();
	}

	/**
	 * Executes a function recursively over <clss> and its superclasses and
	 * interfaces.
	 */
	public static void doClassHierarchy(Class<?> clss, SubLObject callback) {
		if (clss != null) {
			Set<Class<?>> visited = new HashSet<Class<?>>();
			Collection<Class<?>> classes = new ArrayList<Class<?>>(1);
			classes.add(clss);
			ABCLJavaObject.doClassHierarchy(classes, callback, visited);
		}
	}

	/**
	 * Executes a function repeatedly over the minimal subtree of the Java class
	 * hierarchy which contains every class in <classes>.
	 */
	private static void doClassHierarchy(Collection<Class<?>> classes, SubLObject callback, Set<Class<?>> visited) {
		Collection<Class<?>> newClasses = new LinkedList<Class<?>>();
		for (Class<?> clss : classes) {
			if (clss == null)
				continue;
			if (!visited.contains(clss)) {
				callback.execute(ABCLJavaObject.makeJavaObject(clss, true));
				visited.add(clss);
			}
			if (!visited.contains(clss.getSuperclass()))
				newClasses.add(clss.getSuperclass());
			for (Class<?> iface : clss.getInterfaces())
				if (!visited.contains(iface))
					newClasses.add(iface);
		}
		if (!newClasses.isEmpty())
			ABCLJavaObject.doClassHierarchy(newClasses, callback, visited);
	}

	public static Object getObject(SubLObject o)

	{
		if (o instanceof JavaObject)
			return ((JavaObject) o).getObject();
		return // Not reached.
		Lisp.type_error(o, LispSymbols.JAVA_OBJECT).javaInstance();
	}

	/**
	 * Encapsulates obj, if required. If obj is a {@link SubLObject}, it's
	 * returned as-is.
	 *
	 * @param obj
	 *            Any java object
	 * @return obj or a new JavaObject encapsulating obj
	 */
	public static SubLObject makeJavaObject(Object obj) {
		if (obj == null)
			return new ABCLJavaObject(null);

		if (obj instanceof SubLObject)
			return (SubLObject) obj;

		return new ABCLJavaObject(obj);
	}

	/**
	 * Encapsulates obj, if required. If obj is a {@link SubLObject}, it's
	 * returned as-is. If obj is of a type which can be mapped to a lisp type,
	 * an object of the mapped type is returned, if translated is true.
	 *
	 * @param obj
	 * @param translated
	 * @return a LispObject representing or encapsulating obj
	 */
	public static SubLObject makeJavaObject(Object obj, boolean translated) {
		return ABCLJavaObject.makeJavaObject(obj, translated, obj != null ? obj.getClass() : null);
	}

	/**
	 * Encapsulates obj, if required. If obj is a {@link SubLObject}, it's
	 * returned as-is. If obj is of a type which can be mapped to a lisp type,
	 * an object of the mapped type is returned, if translated is true.
	 *
	 * @param obj
	 * @param translated
	 * @param intendedClass
	 *            the class that shall be used to reflectively access obj; it is
	 *            an error for obj not to be an instance of this class. This
	 *            parameter is ignored if translated == true and the object can
	 *            be converted to a Lisp object.
	 * @return a LispObject representing or encapsulating obj
	 */
	public static SubLObject makeJavaObject(Object obj, boolean translated, Class<?> intendedClass) {
		if (!translated)
			return ABCLJavaObject.makeJavaObject(obj, intendedClass);

		if (obj == null)
			return Lisp.NIL;

		if (obj instanceof SubLObject)
			return (SubLObject) obj;

		if (obj instanceof String)
			return LispObjectFactory.makeString((String) obj);

		if (obj instanceof Number) {
			// Number types ordered according to decreasing
			// estimated chances of occurrance

			if (obj instanceof Integer)
				return LispObjectFactory.makeInteger(((Integer) obj).intValue());

			if (obj instanceof Float)
				return LispObjectFactory.makeSingle((Float) obj);

			if (obj instanceof Double)
				return LispObjectFactory.makeDouble((Double) obj);

			if (obj instanceof Long)
				return LispObjectFactory.makeInteger(((Long) obj).longValue());

			if (obj instanceof BigInteger)
				return LispObjectFactory.makeInteger((BigInteger) obj);

			if (obj instanceof Short)
				return LispObjectFactory.makeInteger(((Short) obj).shortValue());

			if (obj instanceof Byte)
				return LispObjectFactory.makeInteger(((Byte) obj).byteValue());
			// We don't handle BigDecimal: it doesn't map to a Lisp type
		}

		if (obj instanceof Boolean)
			return ((Boolean) obj).booleanValue() ? Lisp.T : Lisp.NIL;

		if (obj instanceof Character)
			return new LispCharacter((Character) obj);

		if (obj instanceof Object[]) {
			Object[] array = (Object[]) obj;
			SimpleVector v = LispObjectFactory.makeSimpleVector(array.length);
			for (int i = array.length; i-- > 0;)
				v.aset(i, ABCLJavaObject.makeJavaObject(array[i], translated));
			return v;
		}
		// TODO
		// We might want to handle:
		// - streams
		// - others?
		return new ABCLJavaObject(obj, intendedClass);
	}

	/**
	 * Encapsulates obj, if required. If obj is a {@link SubLObject}, it's
	 * returned as-is. If not, a java object with the specified intended class
	 * is returned.
	 *
	 * @param obj
	 *            Any java object
	 * @param intendedClass
	 *            the class that shall be used to access obj
	 * @return obj or a new JavaObject encapsulating obj
	 */
	public static SubLObject makeJavaObject(Object obj, Class<?> intendedClass) {
		if (obj == null)
			return new ABCLJavaObject(null);

		if (obj instanceof SubLObject)
			return (SubLObject) obj;

		return new ABCLJavaObject(obj, intendedClass);
	}

	public static SubLObject mapcarClassHierarchy(Class<?> clss, final SubLObject fn) {
		final SubLObject[] acc = new SubLObject[] { Lisp.NIL };
		ABCLJavaObject.doClassHierarchy(clss, new Function() {

			public SubLObject execute(SubLObject arg) {
				acc[0] = acc[0].push(fn.execute(arg));
				return acc[0];
			}
		});
		return acc[0].nreverse();
	}

	Object obj;

	private Class<?> intendedClass;

	public ABCLJavaObject(Object obj) {
		this.obj = obj;
		this.intendedClass = obj != null ? JavaFunctions.maybeBoxClass(obj.getClass()) : null;
	}

	/**
	 * Constructs a Java Object with the given intended class, used to access
	 * the object reflectively. If the class represents a primitive type, the
	 * corresponding wrapper type is used instead.
	 *
	 * @throws ClassCastException
	 *             if the object is not an instance of the intended class.
	 */
	public ABCLJavaObject(Object obj, Class<?> intendedClass) {
		if (obj != null && intendedClass == null)
			intendedClass = obj.getClass();
		if (intendedClass != null) {
			intendedClass = JavaFunctions.maybeBoxClass(intendedClass);
			if (!intendedClass.isInstance(obj))
				throw new ClassCastException(obj + " can not be cast to " + intendedClass);
		}
		this.obj = obj;
		this.intendedClass = intendedClass;
	}

	public SubLObject classOf() {
		if (this.obj == null)
			return BuiltInClass.JAVA_OBJECT;
		else
			return JavaClass.findJavaClass(this.obj.getClass());
	}

	public boolean equal(SubLObject other) {
		if (this == other)
			return true;
		if (other instanceof JavaObject)
			return this.obj == ((JavaObject) other).getObject();
		return false;
	}

	public boolean equalp(SubLObject other) {
		return this.equal(other);
	}

	public SubLObject getDescription() {
		return LispObjectFactory.makeString(ABCLJavaObject.describeJavaObject(this));
	}

	private SubLObject getInspectedFields() {
		final SubLObject[] acc = new SubLObject[] { Lisp.NIL };
		ABCLJavaObject.doClassHierarchy(this.obj.getClass(), new Function() {

			public SubLObject execute(SubLObject arg) {
				// No possibility of type error - we're mapping this function
				// over a list of classes
				Class<?> c = (Class) arg.javaInstance();
				for (Field f : c.getDeclaredFields()) {
					SubLObject value = Lisp.NIL;
					try {
						if (!f.isAccessible())
							f.setAccessible(true);
						value = ABCLJavaObject.makeJavaObject(f.get(ABCLJavaObject.this.obj));
					} catch (Exception e) {
					}
					acc[0] = acc[0].push(LispObjectFactory.makeCons(f.getName(), value));
				}
				return acc[0];
			}
		});
		return acc[0].nreverse();
	}

	public Class<?> getIntendedClass() {
		return this.intendedClass;
	}

	public Object getObject() {
		return this.obj;
	}

	public SubLObject getParts() {
		if (this.obj != null) {
			SubLObject parts = Lisp.NIL;
			parts = parts
					.push(LispObjectFactory.makeCons("Java class", ABCLJavaObject.makeJavaObject(this.obj.getClass())));
			if (this.intendedClass != null)
				parts = parts.push(LispObjectFactory.makeCons("intendedClass",
						new SimpleString(this.intendedClass.getCanonicalName())));
			if (this.obj.getClass().isArray()) {
				int length = Array.getLength(this.obj);
				for (int i = 0; i < length; i++)
					parts = parts.push(LispObjectFactory.makeCons(new SimpleString(i),
							ABCLJavaObject.makeJavaObject(Array.get(this.obj, i))));
			} else
				parts = LispSymbols.NCONC.execute(parts, this.getInspectedFields());
			return parts.nreverse();
		} else
			return Lisp.NIL;
	}

	public Object javaInstance() {
		return this.obj;
	}

	public <T> Object javaInstance(Class<T> c) {
		final Class cc;
		if (this.obj == null) {
			if (c.isPrimitive())
				throw new NullPointerException("Cannot assign null to " + c);
			return this.obj;
		} else {
			cc = JavaFunctions.maybeBoxClass(c);
			if (cc.isInstance(this.obj))
				return this.obj;
			if (cc.isAssignableFrom(this.intendedClass))
				// ME 20100323: I decided not to because a) we don't
				// know the "proper" class to narrow to (i.e. maybe
				// there's something "narrower" and b) I'm not sure how
				// primitive types relate to their boxed
				// representations.
				return this.obj;
			else
				return Lisp.error(new TypeError(this.intendedClass.getName() + " is not assignable to " + c.getName()));
		}
	}

	/**
	 * Returns the encapsulated Java object for interoperability with wait,
	 * notify, synchronized, etc.
	 *
	 * @return The encapsulated object
	 */

	public Object lockableInstance() {
		return this.obj;
	}

	public int sxhash() {
		return this.obj == null ? 0 : this.obj.hashCode() & 0x7ffffff;
	}

	public SubLObject typeOf() {
		return LispSymbols.JAVA_OBJECT;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.JAVA_OBJECT)
			return Lisp.T;
		if (type == BuiltInClass.JAVA_OBJECT)
			return Lisp.T;
		if (type instanceof JavaClass && this.obj != null)
			return ((JavaClass) type).getJavaClass().isAssignableFrom(this.obj.getClass()) ? Lisp.T : Lisp.NIL;
		return super.typep(type);
	}

	public String writeToString() {
		if (this.obj instanceof ControlTransfer)
			return this.obj.toString();
		final String s;
		if (this.obj != null) {
			Class<?> c = this.obj.getClass();
			StringBuilder sb = new StringBuilder(c.isArray() ? "jarray" : c.getName());
			sb.append(' ');
			String ts = this.obj.toString();
			if (ts.length() > 32)
				sb.append(ts.substring(0, 32) + "...");
			else
				sb.append(ts);
			s = sb.toString();
		} else
			s = "null";
		return this.unreadableString(s);
	}
}

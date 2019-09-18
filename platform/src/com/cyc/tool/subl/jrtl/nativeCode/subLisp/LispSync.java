
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import static org.armedbear.lisp.Lisp.PACKAGE_CYC;
import static org.armedbear.lisp.Lisp.UNBOUND_VALUE;
import static org.armedbear.lisp.Lisp.addFeature;
import static org.armedbear.lisp.Lisp.checkSymbol;
import static org.armedbear.lisp.Lisp.cold;
import static org.armedbear.lisp.Lisp.getDotName;
import static org.armedbear.lisp.Lisp.internKeyword;
//import static org.armedbear.lisp.Lisp.isInitialized;
import static org.armedbear.lisp.Lisp.isTooSoon;
import static org.armedbear.lisp.Lisp.list;
import static org.armedbear.lisp.Lisp.quote;
import static org.armedbear.lisp.Lisp.readObjectFromString;
import static org.armedbear.lisp.Lisp.valueOfString;
import static org.logicmoo.system.Startup.addObject;
import static org.logicmoo.system.Startup.create_constant;
import static org.logicmoo.system.Startup.find_constant_by_name;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.armedbear.j.Debug;
import org.armedbear.lisp.Cons;
import org.armedbear.lisp.Go;
import org.armedbear.lisp.JavaObject;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispClass;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.SimpleString;
import org.armedbear.lisp.Symbol;
import org.jpl7.Atom;
import org.jpl7.Term;
import org.jpl7.fli.term_t;
import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.Startup;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
public class LispSync extends SubLSystemTrampolineFile {

	static {
		// temporary workarround apps not initialziing cyc like Junit
		Startup.needRunningSystem(LispSync.class);

	}
	static AbstractSubLStruct lastStruct;

	static private LinkedList laterList = new LinkedList();

	private static final Map<Object, LinkedList<WeakItem>> mapClass2Refs = new HashMap<Object, LinkedList<WeakItem>>();

	private static volatile Set<String> syncedTypes = new HashSet<String>();
	private static volatile Set<String> skippedTypes = new HashSet<String>();

	static {
		if (!Main.noLispSync)
			synchronized (syncedTypes) {
				if (true) {
					skippedTypes.add("CONSTANT.*");
					skippedTypes.add("NART.*");
					skippedTypes.add("ASSERTION.*");
					skippedTypes.add("DEDUCTION.*");
					skippedTypes.add("READ.*E.*");
					skippedTypes.add("PPRINT.*");
					skippedTypes.add("JVM.*");

				}
				addSyncedType("CX");
				addSyncedType("SHOP-BASIC-PROBLEM");
				addSyncedType("SHOP-BASIC-DOMAIN");
				addSyncedType("SHOP-BASIC-PLAN-STATE");
				addSyncedType("SHOP-.*");
				addSyncedType("EPISODE");
				addSyncedType("EPISODIC-RULE");
				addSyncedType("OB");
				addSyncedType("OBR");
				addSyncedType("TCP-SERVER");
				addSyncedType("SUBLFILE");
				syncedTypes.add(".*-.*");
				syncedTypes.add(".*");

			}
	}

	private static boolean isTracked(String class1) {
		synchronized (syncedTypes) {
			final String litterally = litterally(class1);
			if (syncedTypes.contains(litterally))
				return true;
			if (matches(skippedTypes, class1))
				return false;
			if (matches(syncedTypes, class1))
				return true;
			skippedTypes.add(litterally);
		}

		return false;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param class1
	 */
	private static boolean matches(Collection<String> items, String class1) {
		if (items.contains(litterally(class1)))
			return true;
		for (String object : items) {
			if (class1.matches(object)) {
				items.add(class1);
				return true;
			}
		}
		return false;
	}

	private static boolean lispReady = true;

	public static void addLater(final AbstractSubLStruct struct) {
		if (Main.noLispSync)
			return;

		if (struct.getTermRef() == null) {
			struct.setTermRef(UNKNOWN);
		}

		final SyncSoon syncSoon = new SyncSoon(struct);

		synchronized (laterList) {
			final int size = laterList.size();
			if ((size % 1000) == 0) {
				// println("laterlis=" + size + 1);
				// cleanRefs();
			}
			laterList.add(syncSoon);
		}
	}

	public static void addSingleton(SubLFile file) {
		if (Main.noLispSync)
			return;
		addAnyTypeThing("SUBLFILE", file);
		// TODO SLOW
		BeanShellCntrl.addSingleton(file);
	}

	private static void addStaticFields(String prefix, Class class1) {
		if (Main.noLispSync)
			return;
		if (prefix == null) {
			prefix = getDotName(class1) + ".";
		}
		for (final Field f : class1.getDeclaredFields()) {
			final int mod = f.getModifiers();
			if (Modifier.isStatic(mod) || true) {
				final boolean wasAccessible = f.isAccessible();
				try {
					if (!wasAccessible) {
						f.setAccessible(true);
					}
					// Modifier.isStatic(mod) ? null : file;
					Object value = f.get(null);
					if (value == null) {
						continue;
					}
					final Class c = f.getType();
					if (c.isPrimitive() || (c == String.class)) {
						if (true) {
							continue;
						}
						value = new bsh.LHS(value, f.getName());
					}

					BeanShellCntrl.addObject(prefix + f.getName(), value);
				} catch (final Exception e) {
					e.printStackTrace();
				} finally {
					if (!wasAccessible) {
						f.setAccessible(false);
					}
				}
			}
		}

	}

	synchronized public static void addClass(SubLObject class_structure) {
		final SubLStruct struct = class_structure.toStruct();
		addThis((AbstractSubLStruct) struct);
	}

	synchronized public static void addThis(AbstractSubLStruct struct) {

		if (Main.noLispSync)
			return;

		if (struct instanceof SubLStream) {
			return;
		}

		// if(!lispReady)return;
		if (!Main.trackStructs) {
			return;
		}
		if (cold || !Lisp.isLispInitialized())
			return;

		if (lastStruct == struct)
			return;

		lastStruct = struct;

		// if (lastStruct == null)
		// {
		// lastStruct = struct;
		// return;
		// }

		try {
			addThis0(struct);
		} finally {
			lastStruct = struct;
		}
	}

	private static void addThis(SubLSymbol structName, SubLObject id, SubLObject kb_object_content) {
		sync_println("ADD-", structName, " id =", id, ": ", kb_object_content);
	}

	private static void addThis0(AbstractSubLStruct struct) {

		if (struct.getTermRef() != null)
			return;

		if (struct.getTermRef() == IGNORED)
			return;

		if (struct.isDontTrack())
			return;

		if (isTooSoon()) {
			struct.setTermRef(UNKNOWN);
			addLater(struct);
			return;
		}
		if (!struct.isInitialized()) {
			struct.setTermRef(UNKNOWN);
			addLater(struct);
			return;
		}

		final String typeOf = getClassName(struct);
		if (typeOf == null) {
			struct.setTermRef(UNKNOWN);
			addLater(struct);
			return;
		}
		if (!isTracked(typeOf)) {
			struct.setTermRef(IGNORED);
			return;
		}
		if (!lispReady) {
			struct.setTermRef(UNSYNCED);
			addLater(struct);
			return;
		}
		struct.setTermRef(UNSYNCED);
		doSyncStruct(struct);
	}

	/**
	 * @param typeOf
	 * @param struct
	 */
	private static int addTypeThing(String typeOf, AbstractSubLObject struct) {
		return addAnyTypeThing(typeOf, struct);
	}

	private static int addAnyTypeThing(String typeOf, Object struct) {
		LinkedList<WeakItem> objStack;
		synchronized (mapClass2Refs) {
			objStack = mapClass2Refs.get(typeOf);
			if (objStack == null) {
				objStack = new LinkedList<WeakItem>();
				println("DEBUG: First " + typeOf);
				mapClass2Refs.put(typeOf, objStack);
			}
		}
		synchronized (objStack) {
			objStack.add(new WeakItem(struct, null));
			final int size = objStack.size();
			if ((size % 1000) == 2) {
				// cleanRefs();
			}
			return size;
		}
	}

	public static void bp() {
		BeanShellCntrl.bp();
	}

	private static Atom checkReady(AbstractSubLStruct struct) {

		if (Main.noLispSync)
			return IGNORED;

		// if (Main.noBSH) return;
		if (!lispReady)
			return UNREADY;

		final String className = getClassName(struct);

		if (className == null) {
			return UNREADY;
		}

		final boolean tracked = isTracked(className);
		if (!tracked) { //
			return IGNORED;
		}

		if (!struct.isInitialized()) {
			return UNREADY;
		}

		if (struct.isDontTrack()) {
			return IGNORED;
		}

		final int fc = struct.getFieldCount();
		int numNils = 0;
		for (int i = fc - 1; i >= 0; i--) {
			final SubLObject fv = struct.getSlotArrayElement(i);
			if (fv == null) {
				return UNREADY;
			}
			if (fv == SubLNil.NIL) {
				numNils++;
			}
		}
		if (numNils != 0) {
			if (fc == numNils) {
				return UNREADY;
			}
			if (numNils > 1) {
				return UNREADY;
			}
		}

		long serial = addTypeThing(className, struct);
		if (serial == 1) {
			println("\n\n=====================================================================");
			SubLStructDecl newLayout = struct.getStructDecl();
			LispClass lc = (LispClass) newLayout.getLispClass();
			LispObject typeOf = classFn((Symbol) newLayout.getStructName());
			final LispObject typeOf2 = (typeOf);
			lispAssert(list(c("isa"), typeOf2, c("Collection")));
			assertLisp("genls", typeOf2, lc.getDirectSuperclasses());
			assertLisp("genls", lc.getDirectSubclasses(), typeOf2);

			LispObject[] slotNames = newLayout.getSlotNames();
			for (int i = 0; i < slotNames.length; i++) {
				LispObject slotName = slotNames[i];
				int j = newLayout.getSlotIndex(slotName);
				final LispObject pred = pred(typeOf2, newLayout.getStructName(), className, slotName);
				assertLisp("hasSlot", typeOf2, pred, i);
				LispObject sv = struct.getSlotValue(j);
				if (sv != null && sv != NIL) {
					if (sv.isCons()) {
						sv = sv.car();
					}
					LispObject someType = sv.typeOf();
					if (someType != NIL && someType != T) {
						while (someType.isCons()) {
							someType = someType.car();
						}
						if (someType == Symbol.BIT)
							someType = Symbol.INTEGER;
						assertLisp("arg2Isa", pred, classFn(someType));
					}
				}

			}
			LispObject rest = newLayout.getSharedSlots(); // A list.
			if (rest != null) {
				while (rest != NIL) {
					LispObject location = rest.car();
					LispObject slotName = location.car();
					int i = newLayout.getSlotIndex(slotName);
					final Object pred = pred(typeOf2, newLayout.getStructName(), className, slotName);
					assertLisp("hasSlotShared", typeOf2, pred, location, i);
					rest = rest.cdr();
				}
			}
		}
		/*
		 * 
		 * long serial = -1L; SubLObject fvs = NIL; if (fc > 0) { fvs =
		 * struct.getSlotArrayElement(0); if (fvs == null) { return UNREADY; } }
		 * 
		 * if (fvs.isInteger()) { serial = fvs.longValue(); }
		 * 
		 * if (serial < 0) { serial = System.identityHashCode(struct); // final BeanBowl
		 * guibowl = BeanShellCntrl.bowl; // serial =
		 * guibowl.generateUniqueName(className, struct); // // if (!Main.noBSHGUI) { //
		 * final String nthInstance = nthInstance(className, serial); //
		 * BeanShellCntrl.addObject(nthInstance, struct); } addTypeThing(className,
		 * struct);
		 */
		return extractedLisp(struct, className, serial);

	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	private static String toProperCase(Object nameO) {
		String name;
		if (nameO instanceof com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString) {
			name = ((com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString) nameO).getStringValue();
		} else if (nameO instanceof SubLSymbol) {
			name = ((SubLSymbol) nameO).getStringValue();
		} else {
			name = valueOfString(nameO);
		}

		name = name.replace("-", "+");
		name = name.replace("*", "-X-");
		name = name.replace("$", "-S-");
		name = name.replace("?", "-Q-");
		name = name.replace("!", "-I-");
		name = name.replace("%", "-Z-");
		name = name.replace("#", "-H-");
		name = name.replace("@", "-O-");
		name = name.replace("^", "-A-");
		name = name.replace("&", "-G-");
		name = name.replace(" ", "-");
		name = name.replace("_", "-");
		name = name.replace("--", "-");
		name = name.replace("+-", "-");
		name = name.replace("-+", "-");
		name = name.replace("--", "-");
		name = name.replace("--", "-");
		if (name.startsWith("-"))
			name = name.substring(1);
		int length = name.length();
		if (name.endsWith("-")) {
			name = name.substring(0, length - 1);
			length = name.length();
		}
		if (name.toUpperCase().equals(name) || name.toLowerCase().equals(name)) {
			name = name.toLowerCase();
			boolean capNext = true;
			StringBuilder sb = new StringBuilder(length);
			for (int n = 0; n < length; n++) {
				char c = name.charAt(n);
				if (Character.isLetter(c)) {
					if (capNext) {
						sb.append(Character.toUpperCase(c));
						capNext = false;
						continue;
					}
				} else if (c == '+') {
					capNext = !capNext;
					continue;
				}
				sb.append(c);
			}
			name = sb.toString();
		}
		return cleanup(name);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param className
	 * 
	 * @param slotName
	 * @return
	 */
	private static LispObject pred(SubLObject clazzConstant, SubLSymbol lispClassName, String className, LispObject slotName) {
		if (slotName.isSymbol()) {

			final Symbol checkSymbol = checkSymbol(slotName);
			String name = checkSymbol.getName();
			String oname = name;
			int length = name.length();

			if (name.endsWith("?")) {
				name = "IS-" + name.substring(0, length - 1);
			}
			boolean joinToClassname = false;
			ArrayList cparts = new ArrayList(Arrays.asList(className.split("-")));
			ArrayList mparts = new ArrayList(Arrays.asList(name.split("-")));
			if (mparts.size() > 1 && cparts.size() > 1) {
				joinToClassname = mparts.removeIf(cparts::contains);
				if (mparts.size() == 0) {
					mparts = new ArrayList(Arrays.asList(name.split("-")));
				}
			}
			if (name.matches(".*[^A-z].*") && !name.contains(className) && !className.contains(name)) {
				joinToClassname = true;
			} else if (length < 6) {
				joinToClassname = true;
			}

			joinToClassname = true;

			cparts.replaceAll((o) -> toProperCase(o));
			mparts.replaceAll((o) -> toProperCase(o));

			int size = cparts.size() + mparts.size();
			StringBuilder sb = new StringBuilder(length);
			mparts.forEach((o) -> sb.append(o));

			if (joinToClassname) {
				sb.append("-Of-");
				cparts.forEach((o) -> sb.append(o));
			}

			name = sb.toString();
			name = name.substring(0, 1).toLowerCase() + name.substring(1); // name = "lisp" + sb.toString();
			final LispObject pred = c(name);
			println("  ");
			assertLisp("isa", pred, c("Predicate"));
			assertLisp("comment", pred, str("LispSync from class " + toQualifiedName(lispClassName) + " with slot " + toQualifiedName(slotName)));
			assertLisp("arg1Isa", pred, clazzConstant);

			return pred;
		}
		return slotName;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param type
	 * @return
	 */
	private static String toQualifiedName(Object type) {
		return Lisp.checkSymbol((LispObject) type).getQualifiedName();
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param string
	 * @return
	 */
	private static SimpleString str(String txt) {
		return new SimpleString(txt);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param pred
	 * @param typeOf
	 * @param lispClassName
	 */
	private static void assertLisp(String pred, LispObject arg1, Object arg2, Object... remaining) {
		if (arg2 == NIL || arg1 == NIL)
			return;
		if (arg1 instanceof SubLObject) {
			if (((SubLObject) arg1).isCons()) {
				SubLObject c = ((SubLObject) arg1).toCons();
				for (LispObject o : consIter(c)) {
					assertLisp(pred, o, arg2, remaining);
				}
				return;
			}
		}
		if (arg2 instanceof SubLObject) {
			if (((SubLObject) arg2).isCons()) {
				SubLObject c = ((SubLObject) arg2).toCons();
				for (SubLObject o : consIter(c)) {
					assertLisp(pred, arg1, o, remaining);
				}
				return;
			}
		}

		LispObject theList = NIL;
		java.util.List l = new java.util.ArrayList();
		if (remaining.length > 0) {
			final LispObject object = cycL(remaining[remaining.length - 1], l);
			theList = new Cons(object);
			for (int i = remaining.length - 2; i >= 0; i--)
				theList = new Cons(cycL(remaining[i], l), theList);
		}
		lispAssert(new Cons(c(pred), new Cons(cycL(arg1), new Cons(cycL(arg2), theList))));
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param c
	 * @return
	 */
	private static LispObject[] consIter(SubLObject c) {
		return (LispObject[]) ((Cons) c).toArray(new LispObject[c.size()]);
	}

	private static Atom extractedLisp(AbstractSubLStruct struct, final String className, long serial)

	{
		Object was = struct.getTermRef();
		if (!Main.noLispSync) {
			try {
				final String constname = nthInstance(className, serial);
				final Atom shouldBe = new Atom(constname);// .SynctoLisp(constname, struct, new LinkedList());
				// String s = shouldBe.toString();
				if (was != shouldBe) {
					struct.setTermRef(shouldBe);
					// return NEEDSYNCED;
					try {
						// lispAssert(list(c("isa"), c(constname), c(instanceFn("Class", className))));

					} catch (Throwable e) {
						e.printStackTrace();
						println("LispAssertError: " + struct.getParts());
						return UNSYNCED;
					}
				}
			} catch (Throwable e) {
				e.printStackTrace();
				println("Lisp_Major_AssertError: " + struct.getParts());
				return IGNORED;
			}

		}
		return SYNCED;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param className
	 * @param serial
	 * @return
	 */
	public static String nthInstance(final String className, long serial) {
		final String constname = className + "-" + String.format("%04x", serial).toUpperCase();
		return constname;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param list
	 */
	private static void lispAssert(Cons list) {
		evalLS(list(r("CYC:CYC-ASSERT"), quote(list), c("BaseKB")));

	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param list
	 * @return
	 */
	private static LispObject evalLS(Cons list) {
		println(list.toString());
		if (true)
			return Lisp.NIL;
		return Lisp.eval(list);

	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param string
	 * @return
	 */
	private static LispObject r(String string) {
		if (true)
			return str(string);
		return readObjectFromString(string);
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param typeOf
	 * @param named
	 * @return
	 */
	private static LispObject classFn(SubLObject sym) {
		if (sym instanceof Symbol) {
			String constname = sym.toSymbol().getName();
			SubLPackage pack = sym.toSymbol().getPackage();
			if (pack != null) {
				constname = cleanup(pack.getName()) + "-" //
						+ toProperCase(constname);
			}
			LispObject inst = c(constname);

			// lispAssert(list(c("isa"), inst, c(typeOf)));
			return inst;
		}
		return (LispObject) sym;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param string
	 * @return
	 */
	private static String cleanup(String string) {
		return string.replaceAll("[^A-z0-9-]+", "-").replaceAll("-+", "-").replaceAll("-$", "").replaceAll("^-", "");
	}

	private static LispObject c(String constname) {
		if (constname.startsWith("#$"))
			constname = constname.substring(2);
		if ("COMMON-LISP-Keyword".equals(constname)) {
			constname = "SubLKeyword";
		} else if ("COMMON-LISP-Symbol".equals(constname)) {
			constname = "SubLSymbol";
		} else if ("COMMON-LISP-Fixnum".equals(constname)) {
			constname = "Integer";
		} else if ("COMMON-LISP-Integer".equals(constname)) {
			constname = "Integer";
		} else if ("COMMON-LISP-SimpleBaseString".equals(constname)) {
			constname = "SubLString";
		}
		constname = cleanup(constname);
		SimpleString cs = str(constname);
		if (true)
			return cs;
		SubLObject lo = find_constant_by_name(cs);
		if (lo == null || lo == NIL) {
			lo = create_constant(cs, (SubLBoolean) NIL);
		}
		return (LispObject) lo;
	}

	private static String getClassName(AbstractSubLStruct struct) {

		if (isTooSoon())
			return null;

		if (!lispReady)
			return null;

		if (Main.noLispSync) {
			return null;
		}

		try {
			SubLObject classOf;

			classOf = struct.getName();
			if (classOf != null) {
				return classOf.toSymbol().getName();
			}

			classOf = struct.typeOf();
			if (classOf != null) {
				return classOf.toSymbol().getName();
			}

			classOf = struct.classOf();
			if (classOf instanceof LispClass) {
				final LispClass lispClass = (LispClass) classOf;
				classOf = lispClass.getLispClassName();
				if (classOf != null) {
					return classOf.toSymbol().getName();
				}
			}
			if ((Object) struct instanceof LispClass) {
				classOf = struct.getType();
				if (classOf != null) {
					return classOf.toSymbol().getName();
				}
			}
			classOf = struct.getLispClass();
			if (classOf instanceof LispClass) {
				final LispClass lispClass = (LispClass) classOf;
				classOf = lispClass.getLispClassName();
				if (classOf != null) {
					return classOf.toSymbol().getName();
				}
			}
			classOf = struct.typeOf();
			if (classOf != null) {
				return classOf.toSymbol().getName();
			}
		} catch (Go e) {
			return null;
			// throw e;
		} catch (Throwable e) {

			// TODO: handle exception
			// e.printStackTrace();
			// System.exit(3);
			return null;
		}
		return null;

	}

	static int indexOfById(List<?> list, Object searchedObject) {
		int i = 0;
		for (Object o : list) {
			if (o == searchedObject)
				return i;
			i++;
		}
		return -1;
	}

	//// Initializers

	public static void initializeTypes() {
		addStaticFields(null, LispSync.class);
		// assert BeanShellCntrl.gui!=null;
		addStaticFields(null, BeanShellCntrl.class);
	}

	private static void lispCall(String assertRetract, String className, long serial, Term shouldBe) {
		sync_println(Arrays.toString(new Object[] { assertRetract, className, serial, shouldBe }));
	}

	private static Term lispAssert(String className, long serial, Term shouldBe) {
		// if (true)
		{
			lispCall("cyc-assert", className, serial, shouldBe);
			return shouldBe;
		}

	}

	private static void lispRetract(String className, long serial, Term shouldBe) {
		lispCall("cyc-retract", className, serial, shouldBe);
	}

	public static void remThis(SubLSymbol structName, SubLObject id) {
		sync_println("REM-", structName, " id =", id);

	}

	public static void structsToLisp() throws IllegalArgumentException, IllegalAccessException {
		Object[] keys = null;

		synchronized (mapClass2Refs) {
			keys = mapClass2Refs.keySet().toArray();
			for (final Object k : keys) {
				final LinkedList<WeakItem> objStack = mapClass2Refs.get((Object) k);
				final LinkedList bowl = new LinkedList();
				final ListIterator<WeakItem> iter = objStack.listIterator();
				while (iter.hasNext()) {
					final Object object = iter.next().get();
					if (object == null) {
						iter.remove();

					} else {
						bowl.add(object);
					}
				}
			}
		}

	}

	private static void sync_println(Object... string) {
		println(Arrays.toString(string));
	}

	private static void println(String string) {
		System.err.println((string));
	}

	public static void updThis(SubLSymbol structName, SubLObject id, SubLObject content) {
		sync_println("UPDATE-", structName, " id =", id, ": ", content);

	}

	public LispSync() {
		if (!Main.noBSH) {
			addSingleton(this);
		}
		addObject("mapClass2Refs", mapClass2Refs);
		addStaticFields(null, LispSync.class);
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(me, "oops_info", "OOPS-INFO", 0, 0, true);
		SubLFiles.declareFunction(me, "oops_add_inst", "OOPS-ADD-INST", 0, 0, true);
		SubLFiles.declareFunction(me, "oops_add_class", "OOPS-ADD-CLASS", 0, 1, false);

	}

	private static SubLObject ADD_KB_OOP = null;

	public static SubLObject oops_add_class(SubLObject className) {
		return oops_add_class(className, false);
	}

	public static SubLObject oops_add_class(SubLObject className, boolean remove) {
		if (className == UNPROVIDED || className == internKeyword(":INSPECT")) {
			oops_info();
			return T;
		}
		if (className == NIL)
			return T;

		if (className.isCons()) {
			final SubLObject car = className.first();
			if (car == internKeyword(":EXCLUDE")) {
				return oops_add_class(className.rest(), true);
			}
			if (car == internKeyword(":INCLUDE")) {
				return oops_add_class(className.rest(), false);
			}
			if (ADD_KB_OOP == null) {
				ADD_KB_OOP = PACKAGE_CYC.findAccessibleSymbol("OOPS-ADD-CLASS").toSymbol();
			}
			Mapping.mapcar(ADD_KB_OOP, className);
			return T;
		}
		synchronized (syncedTypes) {
			if (className == internKeyword(":RESET")) {
				syncedTypes.clear();
				skippedTypes.clear();
				return T;
			}
			Collection addRemove = remove ? skippedTypes : syncedTypes;

			if (className == internKeyword(":CLEAR")) {
				addRemove.clear();
				return T;
			}
			addRemove.add(className.getStringValue());
			return T;
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	public static SubLObject oops_info(SubLObject... className) {
		try {
			synchronized (syncedTypes) {
				for (Iterator iterator = syncedTypes.iterator(); iterator.hasNext();) {
					Object object = (Object) iterator.next();
					println("syncedTypes.add(\"" + object + "\");");
				}
				for (Iterator iterator = skippedTypes.iterator(); iterator.hasNext();) {
					Object object = (Object) iterator.next();
					println("skippedTypes.add(\"" + object + "\");");
				}
			}
			return T;
		} catch (Exception e) {
			e.printStackTrace();
			return NIL;
		}
	}

	public static SubLObject oops_add_inst(SubLObject... className) {
		ObjectOutputStream oos = null;
		try {
			//			copyRefsToBowls();
			//			FileOutputStream fout = new FileOutputStream(filename.toStr().getString());
			//			oos = new ObjectOutputStream(fout);
			//			oos.writeObject(bowls);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return NIL;
	}

	@Override
	public void initializeVariables() {
		initializeTypes();
	}

	@Override
	public void runTopLevelForms() {
		addFeature("CYC-OOPS");
	}

	public static boolean isLispReady() {
		return lispReady;
	}

	public static void setLispReady(boolean b) {
		if (!b) {
			lispReady = b;
			return;
		}
		lispReady = b;

		doReadyList();

	}

	public static void doReadyList() {
		needsDone++;
	}

	private static int needsDone = 0;

	private static void doReadyListNow() {
		needsDone = 0;
		List doNow;
		int start;
		synchronized (laterList) {
			start = laterList.size();
			if (start == 0)
				return;
			doNow = new LinkedList();
			doNow.addAll(laterList);
			laterList.clear();
			// lastSize = 0;
		}
		boolean readdDoAll = true;
		try {
			addEach(start, doNow);
			readdDoAll = false;
		} finally {
			if (readdDoAll) {
				synchronized (laterList) {
					laterList.addAll(doNow);
				}
			}
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param addLater
	 * @param iterator
	 * @return
	 */
	private static int addEach(int start, Object object) {
		if (object instanceof SyncSoon) {
			object = ((SyncSoon) object).getValue();
		}
		if (object instanceof AbstractSubLStruct) {
			AbstractSubLStruct new_name = (AbstractSubLStruct) object;
			if (!doSyncStruct(new_name))
				return 1;
			return 0;
		}
		int addLater = 0;
		if (object instanceof Iterable) {
			Iterable new_name = (Iterable) object;
			for (Iterator iterator2 = new_name.iterator(); iterator2.hasNext();) {
				Object new_name2 = iterator2.next();
				addLater += addEach(start, new_name2);
			}
		} else {
			println("Unknown Object " + object);
		}
		int did = start - addLater;
		if (addLater <= start) {
			// println("LispSync = " + did + "/" + start);
		}
		return addLater;
	}

	private static boolean doSyncStruct(AbstractSubLStruct struct) {
		if (!Main.trackStructs || Main.noLispSync)
			return false;
		if (cold || !Lisp.isLispInitialized() || !lispReady) {
			addLater(struct);
			return false;
		}
		Term was = (Term) struct.getTermRef();
		Atom checkReady = checkReady(struct);
		if (checkReady == IGNORED) {
			return true;
		}
		if (checkReady == UNKNOWN) {
			return true;
		}
		if (checkReady == UNREADY) {
			if (was != null && !(was instanceof SyncState)) {
				struct.setTermRef(NEEDSDELETE);
				long serial = -1L;
				final SubLObject fvs = struct.getSlotArrayElement(0);
				if (fvs != null) {
					if (fvs.isInteger()) {
						final String className = getClassName(struct);
						lispRetract(className, serial, was);
						struct.setTermRef(null);
						return true;
					}
				}
			}
			addLater(struct);
			return false;
		}
		return true;
	}

	protected static final class SyncSoon implements Map.Entry {
		private final AbstractSubLStruct struct;

		protected SyncSoon(AbstractSubLStruct struct) {
			this.struct = struct;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof SyncSoon) {
				return ((SyncSoon) obj).struct == struct;
			}
			return obj == struct;
		}

		@Override
		public Object getKey() {
			return struct;
		}

		@Override
		public Object getValue() {
			return struct;
		}

		@Override
		public int hashCode() {
			return System.identityHashCode(struct);
		}

		@Override
		public Object setValue(Object value) {
			// TODO Auto-generated method stub
			if (true) {
				Errors.unimplementedMethod("Auto-generated method stub:  $local$.setValue");
			}
			return null;
		}
	}

	public interface ILispifiable {
		Atom cycL(java.util.List circle);
	}

	public static final class SyncState extends Atom {

		public SyncState(String twoStr) {
			super(twoStr, "sync");
		}
		//
		// @Override
		// public String toString() {
		// return toStr;
		// }

		// @Override
		public int lispType() {
			return type();
		}

		// // @Override
		// public int type() {
		// return ATOM;
		// }

		// @Override
		public String lispTypeName() {
			return typeName();
		}

		// @Override
		@Override
		public void put(Map<String, term_t> varnames_to_vars, term_t term) {
			// TODO Auto-generated method stub
			if (true) {
				Errors.unimplementedMethod("Auto-generated method stub:  Atom.put");
			}

		}

		// @Override
		public Object toJavaObject() {
			Errors.unimplementedMethod("Auto-generated method stub:  Atom.toJavaObject");
			return this;
		}

		// @Override
		@Override
		public String typeName() {
			return "SyncState";
		}
	}

	public static final SyncState UNREADY = new SyncState("UNREADY");

	public static final SyncState IGNORED = new SyncState("IGNORED");

	// private final String toStr;

	public static final SyncState UNSYNCED = new SyncState("UNSYNCED");

	public static final SyncState SYNCED = new SyncState("SYNCED");

	public static final SyncState NEEDSYNCED = new SyncState("NEEDSYNCED");

	public static final SyncState UNKNOWN = new SyncState("UNKNOWN");

	public static final SyncState NEEDSDELETE = new SyncState("NEEDSDELETE");

	public static final SyncState UNBOUND = new SyncState("UNBOUND");

	private static final LispObject JNULL = null;

	public static final class WeakItem extends WeakReference<Object> {
		private Atom term;

		public WeakItem(Object arg0, Atom term) {
			super(arg0);
			this.term = term;
		}

		@Override
		public String toString() {
			final Object o = get();
			if (o == null) {
				return "<NULL>";
			}
			if (true) {
				return o.getClass() + "@" + System.identityHashCode(o) + " " + term;
			}
			return valueOfString(o);
		}
	}

	static int lastSize = 0;

	private static Thread neddsDoneThread = new Thread() {
		{
			setName("LispSync.doReadyList");
			setDaemon(false);
		}

		@Override
		public void run() {
			// SystemCurrent.attachConsole();
			while (true) {
				if (needsDone == 0 || !lispReady) {
					try {
						if (Startup.shutdownhook != null) {
							return;
						}
						Thread.sleep((long) 250);
						if (Main.noLispSync)
							continue;
						final int size;
						synchronized (laterList) {
							size = laterList.size();

						}
						if (size > 0) {
							needsDone = size;
						}
						if (size < 1000) {
							if (size <= lastSize + 100) {
								continue;
							}
						} else if (size < 10000) {
							if (size <= lastSize + 1000) {
								continue;
							}
						} else {
							if (size <= lastSize + 10000) {
								continue;
							}
						}
						lastSize = size;
						// println("laterlist = " + size);
					} catch (Throwable e) {
						return;
					}
					continue;
				}
				try {
					doReadyListNow();
				} catch (Throwable t) {
					t.printStackTrace();
					continue;
				}
			}
		};
	};
	static {
		Debug.assertTrue("METHOD-COMBINATION".matches(".*-.*"));
		neddsDoneThread.start();
	}

	public static void wasSetField(AbstractSubLStruct structureObject, int slotNum, int pingAt, Object was, Object value) {

		//		if (!structureObject.isTracked())
		//			return;

		if (was == null) {
			if (UNBOUND_VALUE == value || was == value || value == SubLNil.NIL)
				return;
		}
		if (was == UNBOUND_VALUE) {

			if (was == value || value == SubLNil.NIL)
				return;
		}
		if (was == value && was == SubLNil.NIL)
			return;

		if (slotNum != pingAt && slotNum == 0) {
			if (was == value)
				return;
		}
		doSyncStruct(structureObject);

	}

	private static void addSyncedType(String string) {
		synchronized (syncedTypes) {
			syncedTypes.add(litterally(string));
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param string
	 * @return
	 */
	private static String litterally(String string) {
		return string;
	}

	static {
		addStaticFields(null, LispSync.class);
		addObject("mapClass2Refs", mapClass2Refs);
	}

	public static LispObject cycL(String name, AbstractSubLStruct s, java.util.List l) {

		// if (s.termRef != null && !(s.termRef instanceof SyncState)) { return
		// s.termRef; }

		if (name == null) {
			name = s.getType().getName();
		}
		final int arity = s.getFieldCount();
		if (arity == 0) {
			String str = s.printReadableObject(false);
			return new SimpleString(str);
		}
		final LispObject[] args = new LispObject[arity];
		int argN = 0;
		for (int i = 0; i < arity; i++) {
			final SubLObject o = s.getField(i + 2);
			LispObject t = cycL(o, l);
			if (t == null) {
				bp();
			}
			args[argN] = t;
			argN++;
		}
		return list(c(name), args);
	}

	public static LispObject cycL(Object o) {
		if (o instanceof LispClass) {
			return classFn(((LispClass) o).getLispClassName());
		}
		if (o instanceof LispObject) {
			return (LispObject) o;
		}
		return immediateTerm(o);
	}

	public static LispObject cycL(Object o, java.util.List l) {
		if (o instanceof LispClass) {
			return classFn(((LispClass) o).getLispClassName());
		}
		if (o instanceof LispObject) {
			return (LispObject) o;
		}
		return immediateTerm(o);
	}

	public static LispObject immediateTerm(Object o) {
		if (o instanceof AbstractSubLObject) {
			Term termRef = (Term) ((AbstractSubLObject) o).getTermRef();
			if (termRef != null)
				return c(termRef.toString());
		}
		if (o == null)
			return c("JNull");
		if (o instanceof Void)
			return c("JVOID");
		if (o instanceof Boolean)
			return ((Boolean) o).booleanValue() ? c("True") : c("False");
		if (o instanceof String) {
			return readObjectFromString(o.toString());
		}
		if (o instanceof SubLObject) {
			Object oo = ((SubLObject) o).javaInstance();
			if (oo != o && oo != null) {
				return immediateTerm(oo);
			}
		}
		if (o instanceof LispObject) {
			return (LispObject) o;
		}
		return JavaObject.getInstance(o, true);
	}

	private static String escapedString(String o, String quote) {
		String value = o.replace("\\", "\\\\") //
				.replace("\n", "\\n") //
				.replace("\r", "\\r") //
				.replace("\t", "\\t");

		return value.replace(quote, "\\" + quote);

	}

	public static void removeThis(AbstractSubLStruct assertion) {
		// TODO Auto-generated method stub

	}

	public static SubLFile me = new LispSync();

}

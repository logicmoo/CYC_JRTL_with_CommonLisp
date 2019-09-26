
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.armedbear.lisp.Go;
import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispClass;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.Symbol;
import org.jpl7.Atom;
import org.jpl7.Compound;
import org.jpl7.JPL;
import org.jpl7.JRef;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;
import org.jpl7.fli.term_t;
import org.logicmoo.bb.BeanBowl;
import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;

public class PrologSync extends SubLSystemTrampolineFile {

	static AbstractSubLStruct lastStruct;

	static private LinkedList laterList = new LinkedList();

	private static final Map<Object, LinkedList<WeakItem>> mapClass2Refs = new HashMap<Object, LinkedList<WeakItem>>();

	static volatile Set<String> syncedTypes = new HashSet<String>();

	private static boolean prologReady = false;

	final private static boolean disableTotally = true;

	public static void addLater(final AbstractSubLStruct struct) {
		if (disableTotally)
			return;
		if (struct.getTermRef() == null) {
			struct.setTermRef(UNSYNCED);
		}
		synchronized (laterList) {

			laterList.add(new SyncSoon(struct));
		}
	}

	public static void addSubLFile(SubLFile file) {
		if (disableTotally)
			return;
		addTypeThing("SUBLFILE", file);
	}

	private static void addStaticFields(String prefix, Class class1) {
		if (disableTotally)
			return;
		if (prefix == null) {
			prefix = Lisp.getDotName(class1) + ".";
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

	synchronized public static void addThis(AbstractSubLStruct struct) {
		if (disableTotally)
			return;
		if (struct instanceof SubLStream) {
			return;
		}

		if (!Main.trackStructs) {
			return;
		}
		if (Lisp.cold || !Interpreter.isInitialized())
			return;
		if (lastStruct == struct)
			return;

		//		if (lastStruct == null)
		//		{
		//			lastStruct = struct;
		//			return;
		//		}

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

		if (Lisp.cold || !Interpreter.isInitialized()) {
			struct.setTermRef(UNKNOWN);
			addLater(struct);
			return;
		}
		if (struct.getTermRef() == IGNORED)
			return;
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
		if (!prologReady) {
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
	private static void addTypeThing(String typeOf, Object struct) {
		LinkedList<WeakItem> objStack;
		synchronized (mapClass2Refs) {
			objStack = mapClass2Refs.get(typeOf);
			if (objStack == null) {
				objStack = new LinkedList<WeakItem>();
				System.err.println("DEBUG: First " + typeOf);
				mapClass2Refs.put(typeOf, objStack);
			}
		}
		synchronized (objStack) {
			objStack.add(new WeakItem(struct, null));
			if ((objStack.size() % 1000) == 2) {
				// cleanRefs();
			}
		}
	}

	private static Term checkReady(AbstractSubLStruct struct) {
		// if (Main.noBSH) return;
		final String className = getClassName(struct);
		if (!isTracked(className)) { //
			return IGNORED;
		}
		if (className == null) {
			return UNREADY;
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

		long serial = -1L;
		final SubLObject fvs = struct.getSlotArrayElement(0);
		if (fvs == null) {
			return UNREADY;
		}
		if (fvs.isInteger()) {
			serial = fvs.longValue();
		}
		if (serial < 0) {
			final BeanBowl guibowl = BeanShellCntrl.bowl;
			serial = guibowl.generateUniqueName(className, struct);
			if (Main.trackStructs) {
				BeanShellCntrl.addObject(className + serial, struct);
			}
		}
		addTypeThing(className, struct);
		return extractedProlog(struct, className, serial);

	}

	private static Term extractedProlog(AbstractSubLStruct struct, final String className, long serial)

	{
		if (!Main.noPrologSync) {
			try {
				Term was = (Term) struct.getTermRef();
				final Term shouldBe = toProlog(null, struct, new LinkedList());
				//String s = shouldBe.toString();
				if (was != shouldBe) {
					struct.setTermRef(shouldBe);
				}
				//return NEEDSYNCED;
				try {
					prologAssert(className, serial, shouldBe);

				} catch (Throwable e) {
					e.printStackTrace();
					System.err.println("PrologAssertError: " + struct.getParts());
					return UNSYNCED;
				}
			} catch (Throwable e) {
				e.printStackTrace();
				System.err.println("Prolog_Major_AssertError: " + struct.getParts());
				return IGNORED;
			}

		}
		return SYNCED;
	}

	private static String getClassName(AbstractSubLStruct struct) {

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
			throw e;
		} catch (Throwable e) {

			// TODO: handle exception
			//e.printStackTrace();
			//System.exit(3);
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
		if (disableTotally)
			return;

		addStaticFields(null, PrologSync.class);
		// assert BeanShellCntrl.gui!=null;
		addStaticFields(null, BeanShellCntrl.class);
	}

	private static boolean isTracked(String class1) {
		if (!syncedTypes.contains(class1))
			return false;
		return true;
	}

	private static void prologCall(String assertRetract, String className, long serial, Term shouldBe) {
		Query query = new org.jpl7.Query(assertRetract, new Compound("sync", new Term[] { new org.jpl7.Atom(className), new org.jpl7.Integer(serial), shouldBe }));
		Map<String, Term> map = query.oneSolution();
		return;
	}

	private static Term prologAssert(String className, long serial, Term shouldBe) {
		//if (true)
		{
			prologCall("assert", className, serial, shouldBe);
			return shouldBe;
		}
		//		org.jpl7.Variable VAR = new Variable("AH");
		//		Query query = new org.jpl7.Query("assert", new Compound("sync", new Term[] { new org.jpl7.Atom(className), new org.jpl7.Integer(serial), shouldBe }), VAR);
		//
		//		Map<String, Term> map = query.oneSolution();
		//		if (map == null)
		//		{
		//			return shouldBe;
		//		}
		//		else
		//		{
		//			Term ret = (Term) map.values().toArray()[0];
		//			return ret;
		//		}

	}

	private static void prologRetract(String className, long serial, Term shouldBe) {
		prologCall("retract", className, serial, shouldBe);
	}

	public static void remThis(SubLSymbol structName, SubLObject id) {
		sync_println("REM-", structName, " id =", id);

	}

	public static void structsToProlog() throws IllegalArgumentException, IllegalAccessException {
		if (disableTotally)
			return;

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
		System.out.println(Arrays.toString(string));
	}

	public static void updThis(SubLSymbol structName, SubLObject id, SubLObject content) {
		sync_println("UPDATE-", structName, " id =", id, ": ", content);

	}

	public PrologSync() {
		if (disableTotally)
			return;

		if (!Main.noBSH) {
			BeanShellCntrl.addSubLFile(this);
		}
		// CycEval.class.getName();
		BeanShellCntrl.addObject("mapClass2Refs", mapClass2Refs);
		addStaticFields(null, PrologSync.class);
	}

	@Override
	public void declareFunctions() {

	}

	@Override
	public void initializeVariables() {
		initializeTypes();
	}

	@Override
	public void runTopLevelForms() {
	}

	public static boolean isPrologReady() {
		return prologReady;
	}

	public static void setPrologReady(boolean b) {
		if (!b) {
			prologReady = b;
			return;
		}
		prologReady = b;

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
			laterList.addAll(doNow);
			laterList.clear();
		}

		int addLater = 0;
		for (Iterator iterator = doNow.iterator(); iterator.hasNext();) {
			AbstractSubLStruct object = (AbstractSubLStruct) iterator.next();
			if (!doSyncStruct(object))
				addLater++;
		}
		int did = start - addLater;
		if (addLater < start) {
			System.err.println("DID=" + did);
		}
	}

	private static boolean doSyncStruct(AbstractSubLStruct struct) {
		if (Lisp.cold || !Interpreter.isInitialized() || !prologReady || !Main.trackStructs || Main.noPrologSync) {
			addLater(struct);
			return false;
		}
		Term was = (Term) struct.getTermRef();
		Term checkReady = checkReady(struct);
		if (checkReady == UNREADY) {
			if (was != null && !(was instanceof SyncState)) {
				struct.setTermRef(NEEDSDELETE);
				long serial = -1L;
				final SubLObject fvs = struct.getSlotArrayElement(0);
				if (fvs != null) {
					if (fvs.isInteger()) {
						final String className = getClassName(struct);
						prologRetract(className, serial, was);
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

	static {
		if (!disableTotally)

			synchronized (syncedTypes) {
				if (false) {
					addSyncedType("CONSTANT");
					// addSyncedType("ASSERTION-HANDLES");
					addSyncedType("NART");
					addSyncedType("DEDUCTION");
					//addSyncedType("ASSERTION-CONTENT");
				}
				addSyncedType("ASSERTION");
				addSyncedType("CX");
				addSyncedType("SHOP-BASIC-PROBLEM");
				addSyncedType("SHOP-BASIC-DOMAIN");
				addSyncedType("SHOP-BASIC-PLAN-STATE");
				addSyncedType("EPISODE");
				addSyncedType("EPISODIC-RULE");
				addSyncedType("OB");
				addSyncedType("OBR");

				addSyncedType("SUBLFILE");
			}

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

	public interface IPrologifiable {
		Term toProlog(java.util.List circle);
	}

	public static final class SyncState extends Atom {

		public SyncState(String twoStr) {
			super(twoStr, "sync");
		}
		//
		//		@Override
		//		public String toString() {
		//			return toStr;
		//		}

		//@Override
		public int prologType() {
			return type();
		}

		//		// @Override
		//		public int type() {
		//			return Prolog.ATOM;
		//		}

		//@Override
		public String prologTypeName() {
			return typeName();
		}

		// @Override
		@Override
		public void put(Map<String, term_t> varnames_to_vars, term_t term) {
			// TODO Auto-generated method stub
			if (true) {
				Errors.unimplementedMethod("Auto-generated method stub:  Term.put");
			}

		}

		// @Override
		public Object toJavaObject() {
			Errors.unimplementedMethod("Auto-generated method stub:  Term.toJavaObject");
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

	//private final String toStr;

	public static final SyncState UNSYNCED = new SyncState("UNSYNCED");

	public static final SyncState SYNCED = new SyncState("SYNCED");

	public static final SyncState NEEDSYNCED = new SyncState("NEEDSYNCED");

	public static final SyncState UNKNOWN = new SyncState("UNKNOWN");

	public static final SyncState NEEDSDELETE = new SyncState("NEEDSDELETE");

	public static final SyncState UNBOUND = new SyncState("UNBOUND");

	public static final class WeakItem extends WeakReference<Object> {
		private Term term;

		public WeakItem(Object arg0, Term term) {
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
				return o.getClass() + "@" + System.identityHashCode(o);
			}
			return Lisp.valueOfString(o);
		}
	}

	private static Thread neddsDoneThread = new Thread() {

		{
			setName("PrologSync.doReadyList");
		}

		@Override
		public void run() {
			//SystemCurrent.attachConsole(false);
			while (true) {
				if (needsDone == 0 || !prologReady) {
					try {
						Thread.sleep((long) 250);
						// SystemCurrent.setupIO();
					} catch (Throwable e) {
						return;
					}
					continue;
				}
				doReadyListNow();
			}
		};
	};
	static {
		if (!disableTotally)
			neddsDoneThread.start();
	}
	public static SubLFile me = new PrologSync();

	public static void wasSetField(AbstractSubLStruct structureObject, int slotNum, int pingAt, Object was, Object value) {
		if (disableTotally)
			return;
		if (!structureObject.isTracked())
			return;

		if (was == null) {
			if (Lisp.UNBOUND_VALUE == value || was == value || value == SubLNil.NIL)
				return;
		}
		if (was == Lisp.UNBOUND_VALUE) {

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
		syncedTypes.add(string);
	}

	static {
		addStaticFields(null, PrologSync.class);
		if (!disableTotally)
			BeanShellCntrl.addObject("mapClass2Refs", PrologSync.mapClass2Refs);
	}

	public static Term toProlog(String name, AbstractSubLStruct s, java.util.List l) {
		//if (s.termRef != null && !(s.termRef instanceof SyncState)) { return s.termRef; }

		if (name == null) {
			name = toProlog(s.getType(), l).name();
		}
		final int arity = s.getFieldCount();
		if (arity == 0) {
			String str = s.printReadableObject(false);
			return new Atom(str);
		}
		final Term[] args = new Term[arity];
		int argN = 0;
		for (int i = 0; i < arity; i++) {
			final SubLObject o = s.getField(i + 2);
			Term t = toProlog(o, l);
			if (t == null) {
				BeanShellCntrl.bug();
			}
			args[argN] = t;
			argN++;
		}
		return new Compound(name, args);
	}

	public static Term toProlog(SubLObject o, java.util.List skipped) {

		if (o == null)
			return JPL.JNULL;
		if (o == SubLNil.NIL)
			return JPL.LIST_NIL;
		AbstractSubLObject ass = null;
		if (o instanceof AbstractSubLObject) {
			ass = (AbstractSubLObject) o;
			final Object termRef = ass.getTermRef();
			if (termRef != null && !(termRef instanceof SyncState) //
					&& !(termRef instanceof JRef)//
					&& !(termRef instanceof Compound)//
					&& !(termRef instanceof Atom)//
					&& !(termRef instanceof Variable)
			//
			) {
				return (Term) termRef;
			}
			do {
				//				if (ass.termRef == null)
				//				{
				//					//ass.termRef = NEEDSYNCED;
				//					Term symcme = toProlog(o, skipped);
				//					assert (ass.termRef != NEEDSYNCED);
				//					if (ass.termRef == NEEDSYNCED) //
				//					{ //
				//						break;
				//						new JPLException("LOOPED ASS! " + ass).printStackTrace();
				//						symcme = null;
				//					}
				//					ass.termRef = symcme;
				//					return symcme;
				//				}
				break;
			} while (true);
		}

		Term term = null;
		try {
			term_t tt;
			if (o.isString()) { //
				return term = immediateTerm(o.getStringValue());
			}
			if (o.isSymbol()) {
				Symbol s = o.toSymbol().toLispObject();
				SubLPackage pack = s.getPackage();
				String prefix;
				if (pack == null) {
					prefix = "#";
				} else if (pack == Lisp.PACKAGE_KEYWORD) {
					prefix = "";
				} else {
					prefix = pack.showShortName();
				}
				return term = new Atom(prefix + ":" + s.getName(), "text");

			}
			if (BeanShellCntrl.installed_constant_p(o) != SubLNil.NIL) {
				String s = BeanShellCntrl.constant_name(o).getStringValue();
				return term = new Atom(s, "text");
			}
			if (o instanceof IPrologifiable) {
				return term = ((IPrologifiable) o).toProlog(skipped);
			}
			if (o.isDouble()) {
				return term = new org.jpl7.Float(o.doubleValue());
			}
			if (o.isInteger()) {
				if (o.isBigIntegerBignum()) {
					final BigInteger bigIntegerValue = o.bigIntegerValue();
					return term = new org.jpl7.Integer(bigIntegerValue);
				}
				return term = new org.jpl7.Integer(o.longValue());
			}
			if (o instanceof LispObject) {
				final String printReadableObject = ((LispObject) o).printReadableObject(false);
				return term = new org.jpl7.Atom(printReadableObject);
			}
			int idx = indexOfById(skipped, o);
			if (idx >= 0) {
				return term = immediateTerm(o);
			}
			skipped.add(o);
			if (o instanceof AbstractSubLStruct) {
				{
					return term = toProlog(null, (AbstractSubLStruct) o, skipped);
				}
			}
			return term = immediateTerm(o);
		} finally

		{
			if (ass != null && term != null) {
				ass.setTermRef(term);

			}
			// skipped.remove(o);
		}
	}

	public static Term toProlog(Object o) {
		if (o == null)
			return JPL.JNULL;
		if (o instanceof Term) {
			return (Term) o;
		}
		if (o instanceof IPrologifiable) {
			return ((IPrologifiable) o).toProlog(new LinkedList());
		}
		if (o instanceof SubLObject) {
			return toProlog((SubLObject) o, new LinkedList());
		}
		return immediateTerm(o);
	}

	public static Term immediateTerm(Object o) {
		if (o == null)
			return JPL.JNULL;
		if (o instanceof Void)
			return JPL.JVOID;
		if (o instanceof Boolean)
			return ((Boolean) o).booleanValue() ? JPL.JTRUE : JPL.JFALSE;
		if (o instanceof Term) {
			return (Term) o;
		}
		if (o instanceof String) {
			if (true) {
				final String quote = "\"";
				final String escapedString = escapedString((String) o, quote);
				final String name = quote + escapedString + quote;
				return new Atom(name, "text");
			}
			if (true) {
				return new Compound("s", new Atom((String) o, "text"));
			}
			return new Atom((String) o, "string");
		}

		if (o instanceof Float) {
			return new org.jpl7.Float((Float) o);
		}
		if (o instanceof Double) {
			return new org.jpl7.Float((Double) o);
		}
		if (o instanceof BigDecimal) {
			return new org.jpl7.Float(((BigDecimal) o));
		}

		if (o instanceof BigInteger) {
			return new org.jpl7.Integer((BigInteger) o);
		}
		if (o instanceof Number) {
			return new org.jpl7.Integer(((Number) o).longValue());
		}

		if (o instanceof SubLObject) {
			Object oo = ((SubLObject) o).javaInstance();
			if (oo != o && oo != null) {
				return immediateTerm(oo);
			}
			//return Atom.objectToJRef(o);
		}
		return Atom.objectToJRef(o);
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

}

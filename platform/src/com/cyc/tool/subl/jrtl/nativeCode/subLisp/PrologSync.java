package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.armedbear.lisp.Go;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispClass;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.StructureObject;
import org.armedbear.lisp.Symbol;
import org.jpl7.Atom;
import org.jpl7.Compound;
import org.jpl7.JPL;
import org.jpl7.JPLException;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;
import org.jpl7.fli.Prolog;
import org.jpl7.fli.term_t;
import org.logicmoo.bb.BeanBowl;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.constants_interface;
import com.cyc.cycjava.cycl.constants_low;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class PrologSync extends SubLTrampolineFile
{

	static AbstractSubLStruct lastStruct;

	static private LinkedList laterList = new LinkedList();

	private static final Map<Object, LinkedList<WeakItem>> mapClass2Refs = new HashMap<Object, LinkedList<WeakItem>>();

	static volatile Set<String> syncedTypes = new HashSet<String>();

	private static boolean prologReady = false;

	public static void addLater(final AbstractSubLStruct struct)
	{
		if (struct.termRef == null)
		{
			struct.termRef = UNSYNCED;
		}
		synchronized (PrologSync.laterList)
		{

			PrologSync.laterList.add(new Map.Entry()
			{
				@Override
				public boolean equals(Object obj)
				{
					return obj == struct;
				}

				@Override
				public Object getKey()
				{
					// TODO Auto-generated method stub
					if (true)
					{
						Errors.unimplementedMethod("Auto-generated method stub:  PrologSync.$local$.getKey");
					}
					return null;
				}

				@Override
				public Object getValue()
				{
					return struct;
				}

				@Override
				public int hashCode()
				{
					return System.identityHashCode(struct);
				}

				@Override
				public Object setValue(Object value)
				{
					// TODO Auto-generated method stub
					if (true)
					{
						Errors.unimplementedMethod("Auto-generated method stub:  PrologSync.$local$.setValue");
					}
					return null;
				}
			});
		}
	}

	public static void addSingleton(SubLFile file)
	{
		addTypeThing("SUBLFILE", file);
		// TODO SLOW BeanShellCntrl.addSingleton(file);
	}

	private static void addStaticFields(String prefix, Class class1)
	{
		if (prefix == null)
		{
			prefix = Lisp.getDotName(class1) + ".";
		}
		for (final Field f : class1.getDeclaredFields())
		{
			final int mod = f.getModifiers();
			if (Modifier.isStatic(mod) || true)
			{
				final boolean wasAccessible = f.isAccessible();
				try
				{
					if (!wasAccessible)
					{
						f.setAccessible(true);
					}
					// Modifier.isStatic(mod) ? null : file;
					Object value = f.get(null);
					if (value == null)
					{
						continue;
					}
					final Class c = f.getType();
					if (c.isPrimitive() || (c == String.class))
					{
						if (true)
						{
							continue;
						}
						value = new bsh.LHS(f);
					}

					BeanShellCntrl.addObject(prefix + f.getName(), value);
				} catch (final Exception e)
				{
					e.printStackTrace();
				} finally
				{
					if (!wasAccessible)
					{
						f.setAccessible(false);
					}
				}
			}
		}

	}

	synchronized public static void addThis(AbstractSubLStruct struct)
	{
		if (struct instanceof SubLStream) { return; }

		if (!Main.trackStructs) { return; }
		if (Lisp.cold || !Lisp.initialized) return;
		if (PrologSync.lastStruct == struct) return;

		//		if (PrologSync.lastStruct == null)
		//		{
		//			PrologSync.lastStruct = struct;
		//			return;
		//		}

		try
		{
			addThis0(struct);
		} finally
		{
			PrologSync.lastStruct = struct;
		}
	}

	public static void addThis(SubLSymbol structName, SubLObject id, SubLObject kb_object_content)
	{
		sync_println("ADD-", structName, " id =", id, ": ", kb_object_content);
	}

	public static void addThis0(AbstractSubLStruct struct)
	{

		if (Lisp.cold || !Lisp.initialized)
		{
			struct.termRef = UNKNOWN;
			addLater(struct);
			return;
		}
		if (struct.termRef == IGNORED) return;
		final String typeOf = getClassName(struct);
		if (typeOf == null)
		{
			struct.termRef = UNKNOWN;
			addLater(struct);
			return;
		}
		if (!isTracked(typeOf))
		{
			struct.termRef = IGNORED;
			return;
		}
		if (!prologReady)
		{
			struct.termRef = UNSYNCED;
			addLater(struct);
			return;
		}
		struct.termRef = UNSYNCED;
		doSyncStruct(struct);
	}

	/**
	 * @param typeOf
	 * @param struct
	 */
	public static void addTypeThing(String typeOf, Object struct)
	{
		LinkedList<WeakItem> objStack;
		synchronized (PrologSync.mapClass2Refs)
		{
			objStack = PrologSync.mapClass2Refs.get(typeOf);
			if (objStack == null)
			{
				objStack = new LinkedList<WeakItem>();
				System.err.println("DEBUG: First " + typeOf);
				PrologSync.mapClass2Refs.put(typeOf, objStack);
			}
		}
		synchronized (objStack)
		{
			objStack.add(new WeakItem(struct, null));
			if ((objStack.size() % 1000) == 2)
			{
				// cleanRefs();
			}
		}
	}

	public static void bp()
	{
		BeanShellCntrl.bp();
	}

	public static Term checkReady(AbstractSubLStruct struct)
	{
		// if (Main.noBSH) return;
		final String className = getClassName(struct);
		if (!isTracked(className)) { return IGNORED; }
		if (className == null) { return UNREADY; }

		final int fc = struct.getFieldCount();
		int numNils = 0;
		for (int i = fc - 1; i >= 0; i--)
		{
			final SubLObject fv = struct.getSlotArrayElement(i);
			if (fv == null) { return UNREADY; }
			if (fv == NIL)
			{
				numNils++;
			}
		}
		if (numNils != 0)
		{
			if (fc == numNils) { return UNREADY; }
			if (numNils > 1) { return UNREADY; }
		}

		long serial = -1L;
		final SubLObject fvs = struct.getSlotArrayElement(0);
		if (fvs == null) { return UNREADY; }
		if (fvs.isInteger())
		{
			serial = fvs.longValue();
		}
		if (serial < 0)
		{
			final BeanBowl guibowl = BeanShellCntrl.bowl;
			serial = guibowl.generateUniqueName(className, struct);
			if (!Main.noBSHGUI) BeanShellCntrl.addObject(className + serial, struct);
		}
		if (!Main.disablePrologSync)
		{
			try
			{
				final Term shouldBe = toProlog(className, struct, new LinkedList());
				struct.termRef = shouldBe;
				//return NEEDSYNCED;
				try
				{
					prologAssert(className, serial, shouldBe);
					//String s = shouldBe.toString();
				} catch (Throwable e)
				{
					//e.printStackTrace();
					System.err.println("PrologAssertError: " + struct.getParts());
					return UNSYNCED;
				}
			} catch (Throwable e)
			{
				e.printStackTrace();
				System.err.println("Prolog_Major_AssertError: " + struct.getParts());
				return IGNORED;
			}

		}
		addTypeThing(className, struct);
		return SYNCED;

	}

	private static String getClassName(AbstractSubLStruct struct)
	{

		try
		{
			SubLObject classOf;

			classOf = struct.getName();
			if (classOf != null) { return classOf.toSymbol().getName(); }

			classOf = struct.typeOf();
			if (classOf != null) { return classOf.toSymbol().getName(); }

			classOf = struct.classOf();
			if (classOf instanceof LispClass)
			{
				final LispClass lispClass = (LispClass) classOf;
				classOf = lispClass.getLispClassName();
				if (classOf != null) { return classOf.toSymbol().getName(); }
			}
			if ((Object) struct instanceof LispClass)
			{
				classOf = struct.getType();
				if (classOf != null) { return classOf.toSymbol().getName(); }
			}
			classOf = struct.getLispClass();
			if (classOf instanceof LispClass)
			{
				final LispClass lispClass = (LispClass) classOf;
				classOf = lispClass.getLispClassName();
				if (classOf != null) { return classOf.toSymbol().getName(); }
			}
			classOf = struct.typeOf();
			if (classOf != null) { return classOf.toSymbol().getName(); }
		} catch (Go e)
		{
			throw e;
		} catch (Throwable e)
		{

			// TODO: handle exception
			//e.printStackTrace();
			//System.exit(3);
			return null;
		}
		return null;

	}

	static int indexOfById(List<?> list, Object searchedObject)
	{
		int i = 0;
		for (Object o : list)
		{
			if (o == searchedObject) return i;
			i++;
		}
		return -1;
	}

	//// Initializers

	public static void initializeTypes()
	{
		addStaticFields(null, PrologSync.class);
		// assert BeanShellCntrl.gui!=null;
		addStaticFields(null, BeanShellCntrl.class);
	}

	private static boolean isTracked(String class1)
	{
		if (!PrologSync.syncedTypes.contains(class1)) return false;
		return true;
	}

	private static void prologCall(String assertRetract, String className, long serial, Term shouldBe)
	{
		Query query = new org.jpl7.Query(assertRetract, new Compound("sync", new Term[] { new org.jpl7.Atom(className), new org.jpl7.Integer(serial), shouldBe }));
		Map<String, Term> map = query.oneSolution();
		return;
	}

	private static Term prologAssert(String className, long serial, Term shouldBe)
	{
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

	private static void prologRetract(String className, long serial, Term shouldBe)
	{
		prologCall("retract", className, serial, shouldBe);
	}

	public static void remThis(SubLSymbol structName, SubLObject id)
	{
		sync_println("REM-", structName, " id =", id);

	}

	public static void structsToProlog() throws IllegalArgumentException, IllegalAccessException
	{
		Object[] keys = null;

		synchronized (PrologSync.mapClass2Refs)
		{
			keys = PrologSync.mapClass2Refs.keySet().toArray();
			for (final Object k : keys)
			{
				final LinkedList<WeakItem> objStack = PrologSync.mapClass2Refs.get((Object) k);
				final LinkedList bowl = new LinkedList();
				final ListIterator<WeakItem> iter = objStack.listIterator();
				while (iter.hasNext())
				{
					final Object object = iter.next().get();
					if (object == null)
					{
						iter.remove();

					}
					else
					{
						bowl.add(object);
					}
				}
			}
		}

	}

	private static void sync_println(Object... string)
	{
		// System.out.println(Arrays.toString(string));
	}

	public static Term toProlog(String name, SubLStruct s, java.util.List l)
	{
		if (s instanceof AbstractSubLStruct)
		{
			AbstractSubLStruct ass = (AbstractSubLStruct) s;
			if (ass.termRef != null && !(ass.termRef instanceof SyncState)) { return ass.termRef; }
		}

		if (name == null)
		{
			name = getClassName((AbstractSubLStruct) s);
		}
		final int arity = s.toStruct().getFieldCount();
		final Term[] args = new Term[arity];
		int argN = 0;
		for (int i = 0; i < arity; i++)
		{
			final SubLObject o = s.getField(i + 2);
			Term t = toProlog(o, l);
			if (t == null)
			{
				bp();
			}
			args[argN] = t;
			argN++;
		}
		return new Compound(name, args);
	}

	public static Term toProlog(SubLObject o, java.util.List skipped)
	{

		if (o == null) return JPL.JNULL;
		if (o == Lisp.NIL) return JPL.LIST_NIL;
		AbstractSubLObject ass = null;
		if (o instanceof AbstractSubLObject)
		{
			ass = (AbstractSubLObject) o;
			if (ass.termRef != null && !(ass.termRef instanceof SyncState)) { return ass.termRef; }
			do
			{
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
		try
		{
			term_t tt;
			if (o.isString())
			{ //
				return term = new Atom(o.getStringValue(), "string");
			}
			if (o.isSymbol())
			{
				String s = ((Symbol) o.toSymbol()).getQualifiedName();
				return term = new Atom(s, "text");

			}
			if (constants_high.installed_constant_p(o) != SubLNil.NIL)
			{
				String s = constants_high.constant_name(o).getStringValue();
				return term = new Atom(s, "text");
			}
			if (o.isDouble()) { return term = new org.jpl7.Float(o.doubleValue()); }
			if (o.isInteger())
			{
				if (o.isBigIntegerBignum())
				{
					final BigInteger bigIntegerValue = o.bigIntegerValue();
					return term = new org.jpl7.Integer(bigIntegerValue);
				}
				return term = new org.jpl7.Integer(o.longValue());
			}
			int idx = indexOfById(skipped, o);
			if (idx >= 0) { return term = toPrologFromJava(o); }
			skipped.add(o);
			if (o instanceof IPrologifiable) { return term = ((IPrologifiable) o).toProlog(skipped); }
			if (o instanceof SubLStruct)
			{
				{
					return term = toProlog(null, (SubLStruct) o, skipped);
				}
			}
			Object oo = o.javaInstance();

			if (oo != null) { return term = toPrologFromJava(oo); }

			//return Atom.objectToJRef(o);
			return term = toPrologFromJava(o);
		} finally

		{
			if (ass != null && term != null)
			{
				ass.termRef = term;

			}
			// skipped.remove(o);
		}
	}

	public static Term toPrologFromJava(Object o)
	{
		if (o == null) return JPL.JNULL;
		if (o instanceof Term) { return (Term) o; }
		if (o instanceof AbstractSubLObject)
		{
			Object oo = ((SubLObject) o).javaInstance();
			if (oo == o || oo == null) { return Atom.objectToJRef(o); }
			if (true) { return Atom.objectToJRef(o); }
			new JPLException("LOOPED ASS! " + o).printStackTrace();
		}
		if (o instanceof Boolean) return ((Boolean) o).booleanValue() ? JPL.JTRUE : JPL.JFALSE;
		if (o instanceof String) { return new Atom((String) o, "string"); }
		if (o instanceof Float)
		{
			new org.jpl7.Float((Float) o);
		}
		if (o instanceof Double)
		{
			new org.jpl7.Float((Double) o);
		}
		if (o instanceof BigDecimal)
		{
			new org.jpl7.Float(((BigDecimal) o).doubleValue());
		}
		if (o instanceof BigInteger)
		{
			new org.jpl7.Integer((BigInteger) o);
		}
		if (o instanceof Number)
		{
			new org.jpl7.Integer(((Number) o).longValue());
		}
		return Atom.objectToJRef(o);
	}

	public static void updThis(SubLSymbol structName, SubLObject id, SubLObject content)
	{
		sync_println("UPDATE-", structName, " id =", id, ": ", content);

	}

	public PrologSync()
	{
		if (!Main.noBSH)
		{
			addSingleton(this);
		}
		// CycEval.class.getName();
		BeanShellCntrl.addObject("mapClass2Refs", PrologSync.mapClass2Refs);
		addStaticFields(null, PrologSync.class);
	}

	@Override
	public void declareFunctions()
	{

	}

	@Override
	public void initializeVariables()
	{
		initializeTypes();
	}

	@Override
	public void runTopLevelForms()
	{
	}

	public static boolean isPrologReady()
	{
		return prologReady;
	}

	public static void setPrologReady(boolean b)
	{
		if (!b)
		{
			prologReady = b;
			return;
		}
		PrologSync.prologReady = b;

		doReadyList();

	}

	public static void doReadyList()
	{
		needsDone++;
	}

	private static int needsDone = 0;

	private static void doReadyListNow()
	{
		needsDone = 0;
		List doNow = new LinkedList();
		synchronized (PrologSync.laterList)
		{
			laterList.addAll(doNow);
			laterList.clear();
		}

		int start = doNow.size();
		int addLater = 0;
		for (Iterator iterator = doNow.iterator(); iterator.hasNext();)
		{
			AbstractSubLStruct object = (AbstractSubLStruct) iterator.next();
			if (!doSyncStruct(object)) addLater++;
		}
		int did = start - addLater;
		if (addLater < start)
		{
			System.err.println("DID=" + did);
		}
	}

	private static boolean doSyncStruct(AbstractSubLStruct struct)
	{
		if (Lisp.cold || !Lisp.initialized || !prologReady || !Main.trackStructs || Main.disablePrologSync)
		{
			addLater(struct);
			return false;
		}
		Term was = struct.termRef;
		Term checkReady = checkReady(struct);
		if (checkReady == UNREADY)
		{
			if (was != null && !(was instanceof SyncState))
			{
				struct.termRef = NEEDSDELETE;
				long serial = -1L;
				final SubLObject fvs = struct.getSlotArrayElement(0);
				if (fvs != null)
				{
					if (fvs.isInteger())
					{
						final String className = getClassName(struct);
						prologRetract(className, serial, was);
						struct.termRef = null;
						return true;
					}
				}
			}
			addLater(struct);
			return false;
		}
		return true;
	}

	static
	{
		synchronized (PrologSync.syncedTypes)
		{
			if (false)
			{
				PrologSync.syncedTypes.add("CONSTANT");
				PrologSync.syncedTypes.add("ASSERTION-CONTENT");
				// PrologSync.syncedTypes.add("ASSERTION-HANDLES");
				PrologSync.syncedTypes.add("NART");
				PrologSync.syncedTypes.add("DEDUCTION");
			}
			PrologSync.syncedTypes.add("CX");
			PrologSync.syncedTypes.add("EPISODE");
			PrologSync.syncedTypes.add("EPISODIC-RULE");
			PrologSync.syncedTypes.add("OB");
			PrologSync.syncedTypes.add("OBR");

			PrologSync.syncedTypes.add("SUBLFILE");
		}

	}

	static
	{
		addStaticFields(null, PrologSync.class);
		BeanShellCntrl.addObject("mapClass2Refs", PrologSync.mapClass2Refs);
	}

	public interface IPrologifiable
	{
		Term toProlog(java.util.List circle);
	}

	public static final class SyncState extends Atom
	{
		public SyncState(String twoStr)
		{
			super(twoStr, "sync");
		}
		//
		//		@Override
		//		public String toString() {
		//			return toStr;
		//		}

		//@Override
		public int prologType()
		{
			return type();
		}

		//		// @Override
		//		public int type() {
		//			return Prolog.ATOM;
		//		}

		//@Override
		public String prologTypeName()
		{
			return typeName();
		}

		// @Override
		public void put(Map<String, term_t> varnames_to_vars, term_t term)
		{
			// TODO Auto-generated method stub
			if (true)
			{
				Errors.unimplementedMethod("Auto-generated method stub:  Term.put");
			}

		}

		// @Override
		public Object toJavaObject()
		{
			Errors.unimplementedMethod("Auto-generated method stub:  Term.toJavaObject");
			return this;
		}

		// @Override
		public String typeName()
		{
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

	public static final class WeakItem extends WeakReference<Object>
	{
		private Term term;

		public WeakItem(Object arg0, Term term)
		{
			super(arg0);
			this.term = term;
		}

		@Override
		public String toString()
		{
			final Object o = get();
			if (o == null) { return "<NULL>"; }
			if (true) { return o.getClass() + "@" + System.identityHashCode(o); }
			return Lisp.valueOfString(o);
		}
	}

	private static Thread neddsDoneThread = new Thread()
	{
		{
			setName("doReadyList");
		}

		public void run()
		{
			while (true)
			{
				if (needsDone == 0 || !prologReady)
				{
					try
					{
						Thread.sleep((long) 250);
					} catch (Throwable e)
					{
						return;
					}
					continue;
				}
				doReadyListNow();
			}
		};
	};
	static
	{
		neddsDoneThread.start();
	}
	public static SubLFile me = new PrologSync();

	public static void wasSetField(AbstractSubLStruct structureObject, int slotNum, int pingAt, Object was, Object value)
	{
		if (was == null)
		{
			if (Lisp.UNBOUND_VALUE == value || was == value || value == SubLNil.NIL) return;
		}
		if (was == Lisp.UNBOUND_VALUE)
		{

			if (was == value || value == SubLNil.NIL) return;
		}
		if (slotNum != pingAt && slotNum == 0)
		{
			if (was == value) return;
		}
		doSyncStruct(structureObject);

	}
}

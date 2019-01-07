package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispClass;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.Symbol;
import org.jpl7.Atom;
import org.jpl7.Compound;
import org.jpl7.JPL;
import org.jpl7.Term;
import org.jpl7.fli.Prolog;
import org.jpl7.fli.term_t;
import org.logicmoo.bb.BeanBowl;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class PrologSync extends SubLTrampolineFile
{

	static AbstractSubLStruct lastStruct;

	static private LinkedList laterList = new LinkedList();

	private static final Map<Object, LinkedList<WeakItem>> mapClass2Refs = new HashMap<Object, LinkedList<WeakItem>>();
	public static SubLFile me = new PrologSync();
	static volatile Set<String> syncedTypes = new HashSet<String>();

	public static boolean trackStructs = true;

	public static void addLater(final AbstractSubLStruct struct)
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

		if (!PrologSync.trackStructs)
		{
			if (true)
			{
				return;
			}
			addLater(struct);
			return;
		}
		if (PrologSync.lastStruct == struct)
			return;

		if (PrologSync.lastStruct == null)
		{
			PrologSync.lastStruct = struct;
			return;
		} else
		{
			addThis0(PrologSync.lastStruct);
			PrologSync.lastStruct = struct;
		}
	}
	public static void addThis(SubLSymbol structName, SubLObject id, SubLObject kb_object_content)
	{
		sync_println("ADD-", structName, " id =", id, ": ", kb_object_content);
	}

	public static void addThis0(AbstractSubLStruct struct)
	{
		final String typeOf = getClassName(struct);
		if (typeOf == null)
		{
			addLater(struct);
			return;
		}
		if (!isTracked(typeOf))
		{
			struct.termRef = SyncState.IGNORED;
			return;
		}
		struct.termRef = SyncState.UNSYNCED;
		addTypeThing(typeOf, struct);
		checkReady(struct);
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

	public static void checkReady(AbstractSubLStruct struct)
	{
		// if (Main.noBSH) return;
		final String className = getClassName(struct);
		if (!isTracked(className))
		{
			return;
		}
		final int fc = struct.getFieldCount();
		long serial = -1L;
		final SubLObject fvs = struct.getSlotArrayElement(0);
		if (fvs == null)
		{
			return;
		}
		if (fvs.isInteger())
		{
			serial = fvs.longValue();
		}
		for (int i = fc - 1; i >= 0; i--)
		{
			final SubLObject fv = struct.getSlotArrayElement(i);
			if (fv == null)
			{
				return;
			}
		}
		final BeanBowl guibowl = BeanShellCntrl.bowl;
		final Term shouldBe = toProlog(className, struct, new LinkedList());

		if (serial < 0)
		{
			serial = guibowl.generateUniqueName(className, struct);
		}
		// BeanShellCntrl.addObject(className + serial, struct);
		struct.termRef = shouldBe;
		// prologAssert(className, serial, shouldBe);

	}

	private static String getClassName(AbstractSubLStruct struct)
	{

		SubLObject classOf;

		classOf = struct.getName();
		if (classOf != null)
		{
			return classOf.toSymbol().getName();
		}

		classOf = struct.typeOf();
		if (classOf != null)
		{
			return classOf.toSymbol().getName();
		}

		classOf = struct.classOf();
		if (classOf instanceof LispClass)
		{
			final LispClass lispClass = (LispClass) classOf;
			classOf = lispClass.getLispClassName();
			if (classOf != null)
			{
				return classOf.toSymbol().getName();
			}
		}
		if ((Object) struct instanceof LispClass)
		{
			classOf = struct.getType();
			if (classOf != null)
			{
				return classOf.toSymbol().getName();
			}
		}
		classOf = struct.getLispClass();
		if (classOf instanceof LispClass)
		{
			final LispClass lispClass = (LispClass) classOf;
			classOf = lispClass.getLispClassName();
			if (classOf != null)
			{
				return classOf.toSymbol().getName();
			}
		}
		classOf = struct.typeOf();
		if (classOf != null)
		{
			return classOf.toSymbol().getName();
		}
		return null;
	}

	static int indexOfById(List<?> list, Object searchedObject)
	{
		int i = 0;
		for (Object o : list)
		{
			if (o == searchedObject)
				return i;
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
		if (!PrologSync.syncedTypes.contains(class1))
			return false;
		return true;
	}

	private static void prologAssert(String className, long serial, Term shouldBe)
	{
		(new org.jpl7.Query("assert", new Compound("sync", new Term[]{new org.jpl7.Atom(className), new org.jpl7.Integer(serial), shouldBe}))).oneSolution();
	}

	private static void prologRetract(String className, long serial, Term shouldBe)
	{
		(new org.jpl7.Query("retract", new Compound("sync", new Term[]{new org.jpl7.Atom(className), new org.jpl7.Integer(serial), shouldBe}))).oneSolution();
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

					} else
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
			if (ass.termRef.isCompound())
			{
				return ass.termRef;
			}
		}
		final int arity = s.toStruct().getFieldCount();
		if (name == null)
		{
			name = getClassName((AbstractSubLStruct) s);
		}
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
		if (o == null)
			return JPL.JNULL;
		if (o == Lisp.NIL)
			return JPL.LIST_NIL;

		try
		{

			term_t tt;
			skipped.add(o);
			if (o instanceof IPrologifiable)
			{
				return ((IPrologifiable) o).toProlog(skipped);
			}
			if (o instanceof SubLStruct)
			{
				return toProlog(null, (SubLStruct) o, skipped);
			}
			Object oo = o.javaInstance();
			if (oo != null)
			{
				return toPrologFromJava(oo);
			}
			if (o.isSymbol())
			{
				String s = ((Symbol) o.toSymbol()).getQualifiedName();
				return new Atom(s);
			}

			if (o.isInteger())
			{
				return new org.jpl7.Integer(o.bigIntegerValue());
			}
			if (o.isDouble())
			{
				return new org.jpl7.Float(o.doubleValue());
			}
			if (o.isString())
			{
				return new Atom(o.getStringValue());
			}

			int idx = indexOfById(skipped, o);
			if (idx >= 0)
			{
				return toPrologFromJava(o);
			}
		} finally
		{
			// skipped.remove(o);
		}
		return toPrologFromJava(o);
	}

	public static Term toPrologFromJava(Object o)
	{
		if (o instanceof Boolean)
			return ((Boolean) o).booleanValue() ? JPL.JTRUE : JPL.JFALSE;
		if (o instanceof String)
		{

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

	static
	{
		synchronized (PrologSync.syncedTypes)
		{
			PrologSync.syncedTypes.add("CONSTANT");
			PrologSync.syncedTypes.add("ASSERTION-CONTENT");
			PrologSync.syncedTypes.add("ASSERTION-HANDLES");
			PrologSync.syncedTypes.add("NART");
			PrologSync.syncedTypes.add("DEDUCTION");

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
		static Term IGNORED = new SyncState("IGNORED");

		//private final String toStr;

		public static Term UNSYNCED = new SyncState("UNSYNCED");
		// static SyncState SYNCED = new SyncState("SYNCED");
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
			return this;
		}

		// @Override
		public String typeName()
		{
			return "SyncState";
		}
	}

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
			if (o == null)
			{
				return "<NULL>";
			}
			if (true)
			{
				return o.getClass() + "@" + System.identityHashCode(o);
			}
			return Lisp.valueOfString(o);
		}
	}

}

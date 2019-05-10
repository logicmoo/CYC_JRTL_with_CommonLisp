package org.appdapter.core.convert;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

import org.appdapter.core.debug.NoLeakThreadLocal;

public class AggregateConverter implements Converter {

	static NoLeakThreadLocal<List> curretnConversions = new NoLeakThreadLocal<List>() {
		@Override
		protected List initialValue() {
			return null;
		};
	};

	public static List newMcvt() {
		return new ArrayList();
	}

	public static void setMcvt(List cc) {
		List cc0 = curretnConversions.get();
		if (cc == cc0)
			return;
		if (cc != null) {
			///throw new ConcurrentModificationException("converns errors" + cc);
		}
		curretnConversions.set(cc);

	}

	public static List getMcvt() {
		return getMcvt(true);
	}

	public static List getMcvt(boolean check) {
		List cc = curretnConversions.get();
		if (cc == null) {
			cc = new ArrayList();
			curretnConversions.set(cc);
			return cc;
		}
		if (check && cc.size() > 0) {
			if (true) {
				cc.clear();

			} else {
				throw new ConcurrentModificationException("converns errors" + cc);
			}
		}
		return cc;
	}

	List<Converter> cnverters;

	public AggregateConverter(List<Converter> registeredConverters) {
		cnverters = registeredConverters;
	}

	@Override public <T> T convert(Object obj, Class<T> objNeedsToBe, List maxConverts) throws NoSuchConversionException {

		if (obj == null)
			return null;
		NoSuchConversionException issue0 = null;
		Object made = obj;
		if (objNeedsToBe.isPrimitive()) {
			objNeedsToBe = ReflectUtils.nonPrimitiveTypeFor(objNeedsToBe);
		}
		if (objNeedsToBe.isInstance(obj))
			return objNeedsToBe.cast(obj);

		List<Converter> cnverters = this.cnverters;
		synchronized (cnverters) {
			cnverters = new ArrayList<Converter>(cnverters);
		}
		Class from = obj.getClass();
		ConverterSorter sorter = new ConverterSorter(obj, from, objNeedsToBe);
		cnverters = sorter.sort(cnverters);
		for (Converter converter : cnverters) {
			if (!AggregateConverter.registerNewly(obj, objNeedsToBe, converter, maxConverts)) {
				continue;
			}
			try {
				made = converter.convert(obj, objNeedsToBe, maxConverts);
				if (objNeedsToBe.isInstance(made))
					return (T) made;
			} catch (NoSuchConversionException e) {
				issue0 = e;
			} catch (Throwable e) {
				issue0 = ReflectUtils.noSuchConversionException(obj, objNeedsToBe, e);
			}
		}
		// set this to try and set a breakpoint to see why conversion failed
		if (false) {
			for (Converter converter : cnverters) {
				try {
					made = converter.convert(obj, objNeedsToBe, maxConverts);
					if (objNeedsToBe.isInstance(made))
						return (T) made;
				} catch (NoSuchConversionException e) {
					issue0 = e;
				} catch (Throwable e) {
					issue0 = ReflectUtils.noSuchConversionException(obj, objNeedsToBe, e);
				}
			}
		}
		throw ReflectUtils.noSuchConversionException(obj, objNeedsToBe, issue0);
	}

	@Override public Integer declaresConverts(Object val, Class from, Class objNeedsToBe, List maxConverts) {
		List<Converter> cnverters = this.cnverters;
		synchronized (cnverters) {
			cnverters = new ArrayList<Converter>(cnverters);
		}
		boolean maybe = false;
		for (Converter converter : cnverters) {
			if (!AggregateConverter.registerNewly(from, objNeedsToBe, converter, maxConverts)) {
				continue;
			}
			if (converter.declaresConverts(val, from, objNeedsToBe, maxConverts) == WILL)
				return WILL;
			if (converter.declaresConverts(val, from, objNeedsToBe, maxConverts) == MIGHT)
				maybe = true;
		}
		if (maybe)
			return MIGHT;
		return WONT;
	}

	public static boolean registerNewly(Object val, Class objNeedsToBe, Converter conv, List maxConverts) {
		CPair work = createWork(val, objNeedsToBe, conv);
		boolean contained = maxConverts.contains(work);
		if (!contained) {
			maxConverts.add(work);
		}
		return !contained;
	}

	private static CPair createWork(Object val, Class objNeedsToBe, Converter conv) {
		CPair work = new CPair(conv, new CPair(objNeedsToBe, val));
		return work;
	}

	static public class CPair<A, B> {
		A a;
		B b;

		public CPair(A a, B b) {
			super();
			this.a = a;
			this.b = b;
		}

		public A getLeft() {
			return this.a;
		}

		public B getRight() {
			return this.b;
		}

		public A car() {
			return this.a;
		}

		public B cdr() {
			return this.b;
		}

		@Override
		public int hashCode() {
			return hashCodeObject(car()) ^ hashCodeObject(cdr()) << 1;
		}
	    /** HashCode - allow nulls */
	    public static final int hashCodeObject(Object obj) { return hashCodeObject(obj, -4) ; }
	    
	    /** HashCode - allow nulls */
	    public static final int hashCodeObject(Object obj, int nullHashCode)
	    {
	        if ( obj == null )
	            return nullHashCode ; 
	        return obj.hashCode() ;
	    }
		@Override
		public boolean equals(Object other) {
			if (this == other)
				return true;
			if (!(other instanceof CPair))
				return false;
			CPair p2 = (CPair) other;
			return CPair.equal(car(), p2.car()) && CPair.equal(cdr(), p2.cdr());
		}

		private static boolean equal(Object l, Object r) {
			if (l == r)
				return true;
			if (l == null || r == null)
				return false;
			return l.equals(r);
		}

		@Override
		public String toString() {
			return new StringBuilder().append("(").append(org.apache.jena.atlas.lib.StrUtils.str(this.a)).append(", ").append(org.apache.jena.atlas.lib.StrUtils.str(this.b)).append(")").toString();
		}
	}

}
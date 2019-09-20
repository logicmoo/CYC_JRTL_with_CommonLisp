package org.opencyc.cycobject;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.opencyc.xml.TextUtil;
import org.opencyc.xml.XMLWriter;
import org.opencyc.xml.XMLStringWriter;
import java.util.Stack;
import java.util.Comparator;
import java.util.Collections;
import org.opencyc.util.Span;
import java.util.HashMap;
import java.util.Map;
import java.util.ListIterator;
import org.opencyc.util.StringUtils;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Iterator;
import org.opencyc.api.CycApiException;
import java.net.UnknownHostException;
import java.io.IOException;
import org.opencyc.api.CycAccess;
import org.opencyc.api.CycObjectFactory;
import java.util.Collection;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class CycList<E> extends ArrayList<E> implements CycObject, List<E>, Serializable {
	static final long serialVersionUID = 2031704553206469327L;
	public static final String cycListXMLTag = "list";
	public static final String integerXMLTag = "integer";
	public static final String doubleXMLTag = "double";
	public static final String stringXMLTag = "string";
	public static final String dottedElementXMLTag = "dotted-element";
	public static int indentLength;
	private boolean isProperList;
	private E dottedElement;
	public static final CycList EMPTY_CYC_LIST;
	public static final int MAX_STRING_API_VALUE_LIST_LITERAL_SIZE = 2048;
	private static final CycSymbol LIST_NIL;

	public CycList() {
		this.isProperList = true;
	}

	public CycList(final int size) {
		super(size);
		this.isProperList = true;
	}

	public CycList(final CycList<? extends E> list) {
		this.isProperList = true;
		for (int i = 0; i < list.getProperListSize(); ++i) {
			this.add(list.get(i));
		}
		if (!list.isProperList()) {
			this.setDottedElement(list.getDottedElement());
		}
	}

	public CycList(final Collection<? extends E> c) {
		super(c);
		this.isProperList = true;
	}

	public CycList(final E firstElement, final Collection<? extends E> remainingElements) {
		this.isProperList = true;
		this.add(firstElement);
		this.addAll(remainingElements);
	}

	public CycList(final E element) {
		this.isProperList = true;
		this.add(element);
	}

	public CycList(final E element1, final E element2) {
		this.isProperList = true;
		this.add(element1);
		this.add(element2);
	}

	public static <T> CycList<T> makeCycList(final T... elements) {
		final CycList<T> cycList = new CycList<T>();
		for (final T element : elements) {
			cycList.add(element);
		}
		return cycList;
	}

	public static <T> CycList<T> construct(final T object1, final Object object2) {
		final CycList<T> cycList = new CycList<T>(object1);
		if (object2.equals(CycObjectFactory.nil)) {
			return cycList;
		}
		if (object2 instanceof CycList) {
			final CycList cycList2 = (CycList) object2;
			cycList.addAll(cycList2);
			return cycList;
		}
		cycList.setDottedElement((T) object2);
		return cycList;
	}

	public CycList<E> addToBeginning(final E element) {
		if (this.isEmpty()) {
			this.add(element);
		} else {
			this.add(0, element);
		}
		return this;
	}

	public static <T> CycList<T> makeDottedPair(final T normalElement, final T dottedElement) {
		if (CycObjectFactory.nil.equals((Object) dottedElement)) {
			return new CycList<T>(normalElement);
		}
		final CycList<T> cycList = new CycList<T>(normalElement);
		cycList.setDottedElement(dottedElement);
		return cycList;
	}

	@Override
	public Object clone() {
		return new CycList(this);
	}

	public CycList<E> deepCopy() {
		final CycList cycList = new CycList();
		if (!this.isProperList()) {
			if (this.dottedElement instanceof CycList) {
				cycList.setDottedElement(((CycList) this.dottedElement).deepCopy());
			} else {
				cycList.setDottedElement(this.getDottedElement());
			}
		}
		for (int i = 0; i < super.size(); ++i) {
			final Object element = this.get(i);
			if (element instanceof CycList) {
				cycList.add(((CycList) element).deepCopy());
			} else {
				cycList.add(element);
			}
		}
		return cycList;
	}

	public E getDottedElement() {
		return this.dottedElement;
	}

	public void setDottedElement(final E dottedElement) {
		this.dottedElement = dottedElement;
		if (dottedElement == null || CycObjectFactory.nil.equals((Object) dottedElement)) {
			this.isProperList = true;
		} else {
			this.isProperList = false;
		}
	}

	public boolean isProperList() {
		return this.isProperList;
	}

	@Override
	public int size() {
		int result = super.size();
		if (!this.isProperList()) {
			++result;
		}
		return result;
	}

	public int getProperListSize() {
		return super.size();
	}

	public boolean isValid() {
		for (int i = 0; i < this.size(); ++i) {
			final Object object = this.get(i);
			if (!(object instanceof String) && !(object instanceof Integer) && !(object instanceof Guid) && !(object instanceof Float) && !(object instanceof ByteArray) && !(object instanceof CycConstant)) {
				if (!(object instanceof CycNart)) {
					if (!(object instanceof CycList)) {
						return false;
					}
					if (!((CycList) object).isValid()) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public boolean isFormulaWellFormed(final ELMt mt) throws IOException, UnknownHostException, CycApiException {
		return CycAccess.getCurrent().isFormulaWellFormed(this, (CycObject) mt);
	}

	public boolean isCycLNonAtomicReifableTerm() throws IOException, UnknownHostException, CycApiException {
		return CycAccess.getCurrent().isCycLNonAtomicReifableTerm(this);
	}

	public boolean isCycLNonAtomicUnreifableTerm() throws IOException, UnknownHostException, CycApiException {
		return CycAccess.getCurrent().isCycLNonAtomicUnreifableTerm((CycObject) this);
	}

	public static <E> CycList<E> list(final E element) {
		final CycList<E> result = new CycList<E>();
		result.add(element);
		return result;
	}

	public static <E> CycList<E> list(final E element1, final E element2) {
		final CycList<E> result = new CycList<E>();
		result.add(element1);
		result.add(element2);
		return result;
	}

	public static <E> CycList<E> list(final E element1, final E element2, final E element3) {
		final CycList<E> result = new CycList<E>();
		result.add(element1);
		result.add(element2);
		result.add(element3);
		return result;
	}

	public E first() {
		if (this.size() == 0) {
			throw new RuntimeException("First element not available for an empty CycList");
		}
		return this.get(0);
	}

	public E second() {
		if (this.size() < 2) {
			throw new RuntimeException("Second element not available");
		}
		return this.get(1);
	}

	public E third() {
		if (this.size() < 3) {
			throw new RuntimeException("Third element not available");
		}
		return this.get(2);
	}

	public E fourth() {
		if (this.size() < 4) {
			throw new RuntimeException("Fourth element not available");
		}
		return this.get(3);
	}

	public E last() {
		if (this.size() == 0) {
			throw new RuntimeException("Last element not available");
		}
		return this.get(this.size() - 1);
	}

	public Object rest() {
		if (this.size() == 0) {
			throw new RuntimeException("Cannot remove first element of an empty list.");
		}
		if (super.size() == 1 && !this.isProperList) {
			return this.getDottedElement();
		}
		final CycList<E> cycList = new CycList<E>((CycList<? extends E>) this);
		cycList.remove(0);
		return cycList;
	}

	public CycList<E> appendElements(final CycList<? extends E> cycList) {
		this.addAll(cycList);
		return this;
	}

	public CycList<E> appendElement(final E object) {
		this.add(object);
		return this;
	}

	public CycList appendElement(final int i) {
		this.add(i);
		return this;
	}

	public CycList appendElement(final long l) {
		this.add(l);
		return this;
	}

	public CycList appendElement(final boolean b) {
		this.add(b);
		return this;
	}

	@Override
	public boolean add(final E e) {
		return super.add(e);
	}

	public void add(final int i) {
		super.add((E) (Object) i);
	}

	public void add(final long l) {
		super.add((E) (Object) l);
	}

	public void add(final float f) {
		super.add((E) (Object) f);
	}

	public void add(final double d) {
		super.add((E) (Object) d);
	}

	public void add(final boolean b) {
		super.add((E) (Object) b);
	}

	public void addNew(final E object) {
		if (!this.contains(object)) {
			this.add(object);
		}
	}

	public void addAllNew(final Collection<? extends E> objects) {
		final Iterator<? extends E> iter = objects.iterator();
		while (iter.hasNext()) {
			this.addNew(iter.next());
		}
	}

	@Override
	public boolean addAll(final Collection<? extends E> col) {
		final boolean result = super.addAll(col);
		if (col instanceof CycList) {
			final CycList cycList = (CycList) col;
			if (!cycList.isProperList()) {
				final E dottedElement = (E) cycList.getDottedElement();
				if (this.isProperList()) {
					this.setDottedElement(dottedElement);
				} else {
					this.add(this.getDottedElement());
					this.setDottedElement(dottedElement);
				}
			}
		}
		return result;
	}

	@Override
	public boolean contains(final Object obj) {
		return (!this.isProperList() && this.getDottedElement().equals(obj)) || super.contains(obj);
	}

	public boolean containsDuplicates() {
		if (!this.isProperList && this.contains(this.dottedElement)) {
			return true;
		}
		for (int i = 0; i < this.size(); ++i) {
			for (int j = i + 1; j < this.size(); ++j) {
				if (this.get(i).equals(this.get(j))) {
					return true;
				}
			}
		}
		return false;
	}

	public CycList deleteDuplicates() {
		if (this.isProperList && this.contains(this.dottedElement)) {
			this.setDottedElement(null);
		}
		for (int i = 0; i < this.size(); ++i) {
			for (int j = i + 1; j < this.size(); ++j) {
				if (this.get(i).equals(this.get(j))) {
					this.remove(j);
					--j;
				}
			}
		}
		return this;
	}

	public CycList removeDuplicates() {
		final CycList result = this.deepCopy();
		return result.deleteDuplicates();
	}

	public CycList<E> flatten() {
		final CycList<E> result = new CycList<E>();
		for (final E obj : this) {
			if (obj instanceof CycList) {
				result.addAll(((CycList) obj).flatten());
			} else {
				result.add(obj);
			}
		}
		if (!this.isProperList) {
			result.add(this.getDottedElement());
		}
		return result;
	}

	public CycList<E> reverse() {
		if (!this.isProperList) {
			throw new RuntimeException(this + " is not a proper list and cannot be reversed");
		}
		final CycList<E> result = new CycList<E>();
		for (int i = this.size() - 1; i >= 0; --i) {
			result.add(this.get(i));
		}
		return result;
	}

	public CycList<CycList<E>> combinationsOf(final int n) {
		if (!this.isProperList) {
			throw new RuntimeException(this + " is not a proper list");
		}
		if (this.size() == 0 || n == 0) {
			return new CycList<CycList<E>>();
		}
		return combinationsOfInternal(new CycList<E>((Collection<? extends E>) this.subList(0, n)), new CycList<E>((Collection<? extends E>) this.subList(n, this.size())));
	}

	private static <E> CycList<CycList<E>> combinationsOfInternal(final CycList<E> selectedItems, final CycList<E> availableItems) {
		final CycList<CycList<E>> result = list(selectedItems);
		if (availableItems.size() == 0) {
			return result;
		}
		CycList<E> combination = null;
		for (int i = 0; i < selectedItems.size() - 1; ++i) {
			for (int j = 0; j < availableItems.size(); ++j) {
				final E availableItem = availableItems.get(j);
				combination = (CycList<E>) selectedItems.clone();
				combination.remove(i + 1);
				combination.add(availableItem);
				result.add(combination);
			}
		}
		final CycList newSelectedItems = (CycList) selectedItems.rest();
		newSelectedItems.add(availableItems.first());
		final CycList newAvailableItems = (CycList) availableItems.rest();
		result.addAll((Collection<? extends CycList<E>>) combinationsOfInternal(newSelectedItems, (CycList<Object>) newAvailableItems));
		return result;
	}

	public CycList randomPermutation() {
		final Random random = new Random();
		int randomIndex = 0;
		final CycList remainingList = (CycList) this.clone();
		final CycList permutedList = new CycList();
		if (this.size() == 0) {
			return remainingList;
		}
		while (remainingList.size() != 1) {
			randomIndex = random.nextInt(remainingList.size() - 1);
			permutedList.add(remainingList.get(randomIndex));
			remainingList.remove(randomIndex);
		}
		permutedList.addAll(remainingList);
		return permutedList;
	}

	public CycList subst(final E newObject, final E oldObject) {
		final CycList result = new CycList();
		if (!this.isProperList) {
			result.setDottedElement(this.dottedElement.equals(oldObject) ? oldObject : newObject);
		}
		for (int i = 0; i < this.getProperListSize(); ++i) {
			final E element = this.get(i);
			if (element.equals(oldObject)) {
				result.add(newObject);
			} else if (element instanceof CycList) {
				result.add(((CycList) element).subst(newObject, oldObject));
			} else {
				result.add(element);
			}
		}
		return result;
	}

	public String toString() {
		return this.toStringHelper(false);
	}

	protected String toStringHelper(final boolean safe) {
		final StringBuffer result = new StringBuffer("(");
		for (int i = 0; i < super.size(); ++i) {
			if (i > 0) {
				result.append(" ");
			}
			final E element = this.get(i);
			if (element == null) {
				result.append("null");
			} else if (element instanceof String) {
				result.append("\"" + element + "\"");
			} else if (safe) {
				try {
					final Method safeToString = element.getClass().getMethod("safeToString", (Class<?>[]) new Class[0]);
					result.append(safeToString.invoke(element, new Object[0]));
				} catch (Exception e) {
					result.append(element.toString());
				}
			} else {
				result.append(element.toString());
			}
		}
		if (!this.isProperList) {
			result.append(" . ");
			if (this.dottedElement instanceof String) {
				result.append("\"");
				result.append(this.dottedElement);
				result.append("\"");
			} else if (safe) {
				try {
					final Method safeToString2 = this.dottedElement.getClass().getMethod("safeToString", (Class<?>[]) new Class[0]);
					result.append(safeToString2.invoke(this.dottedElement, new Object[0]));
				} catch (Exception e2) {
					result.append(this.dottedElement.toString());
				}
			} else {
				result.append(this.dottedElement.toString());
			}
		}
		result.append(")");
		return result.toString();
	}

	public String toPrettyString(final String indent) {
		return this.toPrettyStringInt(indent, "  ", "\n", false, false);
	}

	public String toPrettyEscapedCyclifiedString(final String indent) {
		return this.toPrettyStringInt(indent, "  ", "\n", true, true);
	}

	public String toPrettyCyclifiedString(final String indent) {
		return this.toPrettyStringInt(indent, "  ", "\n", true, false);
	}

	public String toHTMLPrettyString(final String indent) {
		return "<html><body>" + this.toPrettyStringInt(indent, "&nbsp&nbsp", "<br>", false, false) + "</body></html>";
	}

	public String toHTMLPrettyString() {
		return "<html><body>" + this.toPrettyStringInt("", "&nbsp&nbsp", "<br>", false, false) + "</body></html>";
	}

	public String toPrettyStringInt(final String indent, final String incrementIndent, final String newLineString, final boolean shouldCyclify, final boolean shouldEscape) {
		final StringBuffer result = new StringBuffer(indent + "(");
		for (int i = 0; i < super.size(); ++i) {
			Object element = this.get(i);
			if (element instanceof CycNonAtomicTerm) {
				element = ((CycNonAtomicTerm) element).toCycList();
			}
			if (element instanceof CycFormula) {
				element = element;
			}
			if (element instanceof String) {
				if (i > 0) {
					result.append(" ");
				}
				result.append('\"');
				if (shouldEscape) {
					result.append(StringUtils.escapeDoubleQuotes((String) element));
				} else {
					result.append(element);
				}
				result.append('\"');
			} else if (element instanceof CycList) {
				result.append(newLineString + ((CycList) element).toPrettyStringInt(indent + incrementIndent, incrementIndent, newLineString, shouldCyclify, shouldEscape));
			} else if (element instanceof CycFormula) {
				result.append(newLineString + ((CycFormula) element).toCycList().toPrettyStringInt(indent + incrementIndent, incrementIndent, newLineString, shouldCyclify, shouldEscape));
			} else {
				if (i > 0) {
					result.append(" ");
				}
				if (shouldCyclify) {
					if (shouldEscape) {
						result.append(DefaultCycObject.cyclify(element));
					} else {
						result.append(DefaultCycObject.cyclifyWithEscapeChars(element, false));
					}
				} else {
					result.append(element.toString());
				}
			}
		}
		if (!this.isProperList) {
			result.append(" . ");
			if (this.dottedElement instanceof String) {
				result.append("\"");
				if (shouldEscape) {
					result.append(StringUtils.escapeDoubleQuotes((String) this.dottedElement));
				} else {
					result.append(this.dottedElement);
				}
				result.append("\"");
			} else {
				result.append(this.dottedElement.toString());
			}
		}
		result.append(")");
		return result.toString();
	}

	public boolean equals(final Object o) {
		if (o == this) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (!(o instanceof List)) {
			return false;
		}
		if (!this.isProperList()) {
			if (!(o instanceof CycList)) {
				return false;
			}
			if (((CycList) o).isProperList()) {
				return false;
			}
		} else if (o instanceof CycList && !((CycList) o).isProperList()) {
			return false;
		}
		final ListIterator<E> e1 = this.listIterator();
		final ListIterator e2 = ((List) o).listIterator();
		while (e1.hasNext() && e2.hasNext()) {
			final E o2 = e1.next();
			final Object o3 = e2.next();
			if (o2 instanceof CycList) {
				if (!((CycList) o2).isProperList()) {
					if (!(o3 instanceof CycList)) {
						return false;
					}
					if (((CycList) o3).isProperList()) {
						return false;
					}
				} else if (o3 instanceof CycList && !((CycList) o3).isProperList()) {
					return false;
				}
			}
			if (o2 == null) {
				if (o3 == null) {
					continue;
				}
				return false;
			} else {
				if (!o2.equals(o3)) {
					return false;
				}
				continue;
			}
		}
		if (e1.hasNext() || e2.hasNext()) {
			return false;
		}
		if (this.isProperList()) {
			return !(o instanceof CycList) || (o instanceof CycList && ((CycList) o).isProperList());
		}
		if (!(o instanceof CycList)) {
			return false;
		}
		final CycList otherList = (CycList) o;
		if (otherList.isProperList()) {
			return false;
		}
		final Object dottedElement1 = this.getDottedElement();
		final Object dottedElement2 = otherList.getDottedElement();
		if (dottedElement1 == dottedElement2) {
			return true;
		}
		if (dottedElement1 == null || dottedElement2 == null) {
			return dottedElement1 == dottedElement2;
		}
		return dottedElement1.equals(dottedElement2);
	}

	public int hashCode() {
		int code = 0;
		for (final E item : this) {
			code ^= item.hashCode();
		}
		return code;
	}

	public Map<Object, Object> toMap() {
		final Map<Object, Object> map = new HashMap<Object, Object>(this.size());
		try {
			for (final E elt : this) {
				final CycList<Object> eltAsList = (CycList<Object>) elt;
				map.put(eltAsList.first(), eltAsList.rest());
			}
		} catch (Exception e) {
			throw new UnsupportedOperationException("Unable to convert CycList to Map because CycList is not an association-list.", e);
		}
		return map;
	}

	public boolean equalsAtEL(final Object o) {
		final Map<CycVariable, CycVariable> varMap = new HashMap<CycVariable, CycVariable>();
		return this.equalsAtEL(o, varMap);
	}

	private boolean equalsAtEL(Object o, final Map<CycVariable, CycVariable> varMap) {
		if (o == this) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (o instanceof CycNonAtomicTerm) {
			o = ((CycNonAtomicTerm) o).toCycList();
		}
		if (!(o instanceof List)) {
			return false;
		}
		if (!this.isProperList()) {
			if (!(o instanceof CycList)) {
				return false;
			}
			if (((CycList) o).isProperList()) {
				return false;
			}
		} else if (o instanceof CycList && !((CycList) o).isProperList()) {
			return false;
		}
		final ListIterator<E> e1 = this.listIterator();
		final ListIterator e2 = ((List) o).listIterator();
		while (e1.hasNext() && e2.hasNext()) {
			Object o2 = e1.next();
			if (o2 != null && o2 instanceof CycNonAtomicTerm) {
				o2 = ((CycNonAtomicTerm) o2).toCycList();
			}
			Object o3 = e2.next();
			if (o3 != null && o3 instanceof CycNonAtomicTerm) {
				o3 = ((CycNonAtomicTerm) o3).toCycList();
			}
			if (o2 instanceof CycList) {
				if (!((CycList) o2).isProperList()) {
					if (!(o3 instanceof CycList)) {
						return false;
					}
					if (((CycList) o3).isProperList()) {
						return false;
					}
				} else if (o3 instanceof CycList && !((CycList) o3).isProperList()) {
					return false;
				}
				if (o2 == null) {
					if (o3 == null) {
						continue;
					}
				} else if (((CycList) o2).equalsAtEL(o3, varMap)) {
					continue;
				}
				return false;
			}
			if ((o2 instanceof Integer && o3 instanceof Long) || (o2 instanceof Long && o3 instanceof Integer)) {
				return ((Number) o2).longValue() == ((Number) o3).longValue();
			}
			if ((o2 instanceof Float && o3 instanceof Double) || (o2 instanceof Double && o3 instanceof Float)) {
				return ((Number) o2).doubleValue() == ((Number) o3).doubleValue();
			}
			if (o2 instanceof CycVariable && o3 instanceof CycVariable) {
				if (varMap.containsKey(o2) && !varMap.get(o2).equals(o3)) {
					return false;
				}
				varMap.put((CycVariable) o2, (CycVariable) o3);
			} else {
				if (!(o2 instanceof CycFormulaSentence) || !(o3 instanceof CycFormulaSentence)) {
					if (o2 == null) {
						if (o3 == null) {
							continue;
						}
					} else if (o2.equals(o3)) {
						continue;
					}
					return false;
				}
				if (!((CycFormulaSentence) o2).args.equalsAtEL(((CycFormulaSentence) o3).args, varMap)) {
					return false;
				}
				continue;
			}
		}
		return !e1.hasNext() && !e2.hasNext();
	}

	public int compareTo(final Object o) {
		if (o == this) {
			return 0;
		}
		if (o == null) {
			return 1;
		}
		if (!(o instanceof List)) {
			return 1;
		}
		if (!this.isProperList()) {
			if (!(o instanceof CycList)) {
				return 1;
			}
			if (((CycList) o).isProperList()) {
				return 1;
			}
		} else if (o instanceof CycList && !((CycList) o).isProperList()) {
			return -1;
		}
		final ListIterator<E> e1 = this.listIterator();
		final ListIterator e2 = ((List) o).listIterator();
		while (e1.hasNext() && e2.hasNext()) {
			final E o2 = e1.next();
			final Object o3 = e2.next();
			if (o2 == o3) {
				continue;
			}
			if (o2 == null) {
				return -1;
			}
			if (o3 == null) {
				return 1;
			}
			if (!(o2 instanceof Comparable) && !(o3 instanceof Comparable)) {
				continue;
			}
			if (!(o2 instanceof Comparable)) {
				return 1;
			}
			if (!(o3 instanceof Comparable)) {
				return -1;
			}
			final Comparable co1 = (Comparable) o2;
			final Comparable co2 = (Comparable) o3;
			if (co1 instanceof CycList) {
				if (!((CycList) co1).isProperList()) {
					if (!(co2 instanceof CycList)) {
						return 1;
					}
					if (((CycList) co2).isProperList()) {
						return 1;
					}
				} else if (co2 instanceof CycList && !((CycList) co2).isProperList()) {
					return -1;
				}
			}
			final int ret = co1.compareTo(co2);
			if (ret != 0) {
				return ret;
			}
		}
		if (e1.hasNext()) {
			return 1;
		}
		if (e2.hasNext()) {
			return -1;
		}
		return 0;
	}

	public String cyclifyWithEscapeChars() {
		return this.cyclifyWithEscapeChars(false);
	}

	public String cyclifyWithEscapeChars(final boolean isApi) {
		final StringBuffer result = new StringBuffer("(");
		String cyclifiedObject = null;
		for (int i = 0; i < super.size(); ++i) {
			final E object = this.get(i);
			cyclifiedObject = DefaultCycObject.cyclifyWithEscapeChars((Object) object, isApi);
			if (i > 0) {
				result.append(" ");
			}
			result.append(cyclifiedObject);
		}
		if (!this.isProperList) {
			result.append(" . ");
			result.append(DefaultCycObject.cyclifyWithEscapeChars((Object) this.dottedElement, isApi));
		}
		result.append(")");
		return result.toString();
	}

	public String cyclify() {
		final StringBuffer result = new StringBuffer("(");
		for (int i = 0; i < super.size(); ++i) {
			final E object = this.get(i);
			if (object == null) {
				throw new RuntimeException("Invalid null element after " + (Object) result + " in " + this);
			}
			if (i > 0) {
				result.append(" ");
			}
			result.append(DefaultCycObject.cyclify((Object) object));
		}
		if (!this.isProperList) {
			result.append(" . ");
			result.append(DefaultCycObject.cyclify((Object) this.dottedElement));
		}
		result.append(")");
		return result.toString();
	}

	public Map<ArgPosition, Span> getPrettyStringDetails() {
		final Map<ArgPosition, Span> map = new HashMap<ArgPosition, Span>();
		getPrettyStringDetails(this, "", 0, new ArgPosition(new Integer[0]), map);
		final Span loc = new Span(0, this.toPrettyString("").length());
		map.put(ArgPosition.TOP, loc);
		return map;
	}

	private static int getPrettyStringDetails(final CycList list, final String indent, int currentPos, final ArgPosition argPos, final Map<ArgPosition, Span> map) {
		final String tab = "  ";
		String str = indent + "(";
		currentPos += str.length();
		final String cyclifiedObject = null;
		for (int i = 0, size = list.size(); i < size; ++i) {
			if (i > 0) {
				str = " ";
				currentPos += str.length();
			}
			if (!list.isProperList() && i + 1 >= size) {
				currentPos += 2;
			}
			Object element = list.get(i);
			if (element instanceof CycNart) {
				element = ((CycNart) element).toCycList();
			}
			if (element instanceof String) {
				str = "\"" + element + "\"";
				final ArgPosition newArgPos = argPos.deepCopy();
				newArgPos.extend(i);
				final Span loc = new Span(currentPos, currentPos + str.length());
				map.put(newArgPos, loc);
				currentPos += str.length();
			} else if (element instanceof CycList) {
				argPos.extend(i);
				final int tempPos = currentPos + indent.length() + tab.length();
				currentPos = getPrettyStringDetails((CycList) element, indent + tab, currentPos, argPos, map);
				final Span loc = new Span(tempPos, currentPos);
				final ArgPosition deepCopy = argPos.deepCopy();
				map.put(deepCopy, loc);
				argPos.toParent();
			} else {
				str = element.toString();
				final ArgPosition newArgPos = argPos.deepCopy();
				newArgPos.extend(i);
				final Span loc = new Span(currentPos, currentPos + str.length());
				map.put(newArgPos, loc);
				currentPos += str.length();
			}
		}
		str = ")";
		return currentPos + str.length();
	}

	public String stringApiValue() {
		if (this.isEmpty()) {
			return "(list)";
		}
		final int fullSlices = this.size() / 2048;
		if (fullSlices > 2048) {
			throw new IllegalArgumentException("Cannot currently handle LISTs longer than 4194304");
		}
		final int tailSliceStart = fullSlices * 2048;
		final boolean fitsIntoOneSlice = fullSlices == 0;
		final StringBuilder result = new StringBuilder(this.size() * 20);
		final boolean properList = this.isProperList();
		if (!fitsIntoOneSlice) {
			result.append("(nconc").append(" ");
			for (int i = 0; i < fullSlices; ++i) {
				final int start = i * 2048;
				final int end = start + 2048;
				this.appendSubSlice(result, start, end, true);
			}
		}
		this.appendSubSlice(result, tailSliceStart, this.getProperListSize(), properList);
		if (!fitsIntoOneSlice) {
			result.append(")");
		}
		return result.toString();
	}

	protected StringBuilder appendSubSlice(final StringBuilder builder, final int start, final int end, final boolean properList) {
		builder.append(properList ? "(list" : "(list*");
		for (int i = start; i < end; ++i) {
			this.appendElement(builder, this.get(i));
		}
		if (!properList) {
			final E dottedObject = (E) ((this.dottedElement == null) ? CycList.LIST_NIL : this.dottedElement);
			this.appendElement(builder, dottedObject);
		}
		builder.append(")");
		return builder;
	}

	protected void appendElement(final StringBuilder builder, final E object) {
		if (object == null) {
			throw new RuntimeException("Got unexpected null object.");
		}
		builder.append(" ");
		builder.append(DefaultCycObject.stringApiValue((Object) object));
	}

	public Object cycListApiValue() {
		return this.cycListApiValue(false);
	}

	public Object cycListApiValue(final boolean shouldQuote) {
		if (shouldQuote) {
			return makeCycList(CycObjectFactory.quote, this);
		}
		return this;
	}

	public CycList sort() {
		final CycList sortedList = new CycList((CycList<? extends E>) this);
		Collections.sort((List<Object>) sortedList, (Comparator<? super Object>) new CycListComparator());
		return sortedList;
	}

	public CycListVisitor cycListVisitor() {
		return new CycListVisitor(this);
	}

	public CycList treeConstants() {
		final CycList constants = new CycList();
		final Stack stack = new Stack();
		stack.push(this);
		while (!stack.empty()) {
			final Object obj = stack.pop();
			if (obj instanceof CycConstant) {
				constants.add(obj);
			} else if (obj instanceof CycAssertion) {
				stack.push(((CycAssertion) obj).getMt());
				this.pushTreeConstantElements(((CycAssertion) obj).getFormula(), stack);
			} else if (obj instanceof CycNart) {
				stack.push(((CycNart) obj).getFunctor());
				this.pushTreeConstantElements(((CycNart) obj).getArguments(), stack);
			} else {
				if (!(obj instanceof CycList)) {
					continue;
				}
				this.pushTreeConstantElements((List) obj, stack);
			}
		}
		return constants;
	}

	private void pushTreeConstantElements(final List list, final Stack stack) {
		final Iterator iter = list.iterator();
		while (iter.hasNext()) {
			stack.push(iter.next());
		}
	}

	@Override
	public E get(final int index) {
		if (index == this.size() - 1 && !this.isProperList()) {
			return this.getDottedElement();
		}
		return super.get(index);
	}

	@Override
	public E set(final int index, final E element) {
		if (index == this.size() - 1 && !this.isProperList()) {
			final E oldValue = this.getDottedElement();
			this.setDottedElement(element);
			return oldValue;
		}
		return super.set(index, element);
	}

	public Object getf(final CycSymbol indicator) {
		return this.getf(indicator, null);
	}

	public Object getf(final CycSymbol indicator, final Object defaultResult, final boolean treatNilAsAbsent) {
		final int indicatorIndex = this.firstEvenIndexOf(indicator);
		if (indicatorIndex == -1) {
			return defaultResult;
		}
		final Object value = this.get(indicatorIndex + 1);
		if (treatNilAsAbsent && CycObjectFactory.nil.equals(value)) {
			return defaultResult;
		}
		return value;
	}

	public Object getf(final CycSymbol indicator, final Object defaultResult) {
		return this.getf(indicator, defaultResult, false);
	}

	public boolean isPlist() {
		boolean expectingKeyword = true;
		final List<CycSymbol> keywords = new ArrayList<CycSymbol>();
		for (final Object elt : this) {
			if (expectingKeyword) {
				if (!(elt instanceof CycSymbol) || !((CycSymbol) elt).isKeyword() || keywords.contains(elt)) {
					return false;
				}
				expectingKeyword = false;
				keywords.add((CycSymbol) elt);
			} else {
				expectingKeyword = true;
			}
		}
		return expectingKeyword;
	}

	public static CycList convertMapToPlist(final Map map) {
		final CycList plist = new CycList();
		if (map != null) {
			for (Object entry0 : map.entrySet()) {
				Map.Entry entry = (Map.Entry) entry0;
				plist.add(entry.getKey());
				plist.add(entry.getValue());
			}
		}
		return plist;
	}

	private int firstEvenIndexOf(final Object elem) {
		if (elem == null) {
			for (int i = 0; i < this.size(); i += 2) {
				if (this.get(i) == null) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < this.size(); i += 2) {
				if (elem.equals(this.get(i))) {
					return i;
				}
			}
		}
		return -1;
	}

	public Object findElementAfter(final Object searchObject, final Object notFound) {
		int i = 0;
		for (final Object curElement : this) {
			if (searchObject == curElement || (searchObject != null && searchObject.equals(curElement))) {
				final int index = i + 1;
				if (index >= this.size()) {
					throw new RuntimeException("Search object: " + searchObject + "  appears at end of list: " + this + "");
				}
				return this.get(index);
			} else {
				++i;
			}
		}
		return notFound;
	}

	public Object findElementAfter(final Object searchObject) {
		final String notFound = "notfoundstr_1230948u23jhiekdsfswkfjslkdfs";
		final Object result = this.findElementAfter(searchObject, notFound);
		if (result == notFound) {
			throw new RuntimeException("Search object: " + searchObject + "  is not found in: " + this + "");
		}
		return result;
	}

	public CycList allIndicesOf(final Object elem) {
		final CycList result = new CycList();
		if (elem == null) {
			for (int i = 0; i < this.size(); ++i) {
				if (this.get(i) == null) {
					result.add(i);
				}
			}
		} else {
			for (int i = 0; i < this.size(); ++i) {
				if (elem.equals(this.get(i))) {
					result.add(i);
				}
			}
		}
		return result;
	}

	public CycList treeGather(final Class cls) {
		final CycList result = new CycList();
		final Stack stack = new Stack();
		stack.push(this);
		while (!stack.empty()) {
			final Object obj = stack.pop();
			if (cls.isInstance(obj)) {
				result.add(obj);
			} else {
				if (!(obj instanceof CycList)) {
					continue;
				}
				final CycList l = (CycList) obj;
				final Iterator iter = l.iterator();
				while (iter.hasNext()) {
					stack.push(iter.next());
				}
				if (l.isProperList) {
					continue;
				}
				stack.push(l.getDottedElement());
			}
		}
		return result;
	}

	public boolean treeContains(Object object) {
		if (object instanceof CycNart) {
			object = ((CycNart) object).toCycList();
		}
		if (this.contains(object)) {
			return true;
		}
		for (int i = 0; i < this.size(); ++i) {
			Object element = this.get(i);
			if (element instanceof CycNart) {
				element = ((CycNart) element).toCycList();
			}
			if (element.equals(object)) {
				return true;
			}
			if (element instanceof CycList && ((CycList) element).treeContains(object)) {
				return true;
			}
		}
		return false;
	}

	public boolean doesElementPrecedeOthers(final Object element, final CycList otherElements) {
		for (int i = 0; i < this.size(); ++i) {
			if (element.equals(this.get(i))) {
				return true;
			}
			if (otherElements.contains(this.get(i))) {
				return false;
			}
		}
		return false;
	}

	public String toXMLString() throws IOException {
		final XMLStringWriter xmlStringWriter = new XMLStringWriter();
		this.toXML((XMLWriter) xmlStringWriter, 0, false);
		return xmlStringWriter.toString();
	}

	public void toXML(final XMLWriter xmlWriter, final int indent, final boolean relative) throws IOException {
		final int startingIndent = xmlWriter.getIndentLength();
		xmlWriter.printXMLStartTag("list", indent, relative, true);
		try {
			final Iterator iterator = this.iterator();
			for (int i = 0, size = this.getProperListSize(); i < size; ++i) {
				final Object arg = iterator.next();
				toXML(arg, xmlWriter, CycList.indentLength, true);
			}
			if (!this.isProperList) {
				xmlWriter.printXMLStartTag("dotted-element", CycList.indentLength, relative, true);
				toXML(this.dottedElement, xmlWriter, CycList.indentLength, true);
				xmlWriter.printXMLEndTag("dotted-element", 0, true);
				xmlWriter.setIndent(-CycList.indentLength, true);
			}
		} catch (Exception e) {
			e.printStackTrace(System.err);
		} finally {
			xmlWriter.printXMLEndTag("list", 0, true);
		}
	}

	public static void toXML(final Object object, final XMLWriter xmlWriter, final int indent, final boolean relative) throws IOException {
		final int startingIndent = xmlWriter.getIndentLength();
		if (object instanceof Integer) {
			xmlWriter.printXMLStartTag("integer", CycList.indentLength, true, false);
			xmlWriter.print(object.toString());
			xmlWriter.printXMLEndTag("integer");
		} else if (object instanceof String) {
			xmlWriter.printXMLStartTag("string", CycList.indentLength, true, false);
			xmlWriter.print(TextUtil.doEntityReference((String) object));
			xmlWriter.printXMLEndTag("string");
		} else if (object instanceof Double) {
			xmlWriter.printXMLStartTag("double", CycList.indentLength, true, false);
			xmlWriter.print(object.toString());
			xmlWriter.printXMLEndTag("double");
		} else if (object instanceof CycFort) {
			((CycFort) object).toXML(xmlWriter, CycList.indentLength, true);
		} else if (object instanceof ByteArray) {
			((ByteArray) object).toXML(xmlWriter, CycList.indentLength, true);
		} else if (object instanceof CycVariable) {
			((CycVariable) object).toXML(xmlWriter, CycList.indentLength, true);
		} else if (object instanceof CycSymbol) {
			((CycSymbol) object).toXML(xmlWriter, CycList.indentLength, true);
		} else if (object instanceof Guid) {
			((Guid) object).toXML(xmlWriter, CycList.indentLength, true);
		} else if (object instanceof CycList) {
			((CycList) object).toXML(xmlWriter, CycList.indentLength, true);
		} else if (object instanceof CycFormula) {
			((CycFormula) object).toXML(xmlWriter, CycList.indentLength, true);
		} else {
			if (!(object instanceof CycAssertion)) {
				throw new RuntimeException("Invalid CycList object (" + object.getClass().getSimpleName() + ") " + object);
			}
			((CycAssertion) object).toXML(xmlWriter, CycList.indentLength, true);
		}
		xmlWriter.setIndent(-CycList.indentLength, true);
		if (startingIndent != xmlWriter.getIndentLength()) {
			throw new RuntimeException("Starting indent " + startingIndent + " is not equal to ending indent " + xmlWriter.getIndentLength() + " for object " + object);
		}
	}

	public Object getValueForKeyword(final CycSymbol keyword) {
		for (int i = 0; i < this.size() - 1; ++i) {
			if (this.get(i).equals(keyword)) {
				return this.get(i + 1);
			}
		}
		return null;
	}

	public void addQuoted(final Object object) {
		this.add((E) makeCycList(CycObjectFactory.quote, object));
	}

	public Object getSpecifiedObject(final ArgPosition argPosition) {
		return this.getSpecifiedObject(new CycList(argPosition.getPath()));
	}

	public Object getSpecifiedObject(final CycList pathSpecification) {
		if (pathSpecification.size() == 0) {
			return this;
		}
		Object answer = this.clone();
		CycList tempPathSpecification = pathSpecification;
		int index = 0;
		try {
			while (!tempPathSpecification.isEmpty()) {
				index = (int) tempPathSpecification.first();
				if (answer instanceof CycNart) {
					if (index == 0) {
						answer = ((CycNart) answer).getFunctor();
					} else {
						answer = ((CycNart) answer).getArgument(index);
					}
				} else {
					answer = ((CycList) answer).get(index);
				}
				tempPathSpecification = (CycList) tempPathSpecification.rest();
			}
			return answer;
		} catch (Exception e) {
			throw new RuntimeException("Can't get object specified by path expression: '" + pathSpecification + "' in forumla: '" + this + "'.  answer: " + answer + " index: " + index + "\n" + StringUtils.getStringForException((Throwable) e));
		}
	}

	public void setSpecifiedObject(final ArgPosition pathSpecification, final Object value) {
		this.setSpecifiedObject(new CycList(pathSpecification.getPath()), value);
	}

	public void setSpecifiedObject(CycList pathSpecification, final Object value) {
		CycList parentContainer = null;
		Object container = this;
		int parentIndex = -1;
		int index = (int) pathSpecification.first();
		pathSpecification = (CycList) pathSpecification.rest();
		while (true) {
			if (container instanceof CycNart) {
				container = ((CycNart) container).toCycList();
				parentContainer.set(parentIndex, container);
			}
			if (pathSpecification.isEmpty()) {
				if (container instanceof CycList) {
					container = ((CycList) container).set(index, value);
				} else {
					if (!(container instanceof CycNart)) {
						throw new RuntimeException("Don't know about: " + container);
					}
					if (index == 0) {
						((CycNart) container).setFunctor((CycFort) value);
					} else {
						((CycNart) container).getArguments().set(index - 1, value);
					}
				}
				return;
			}
			parentContainer = (CycList) container;
			if (!(container instanceof CycList)) {
				throw new RuntimeException("Don't know a path into: " + container);
			}
			container = ((CycList) container).get(index);
			parentIndex = index;
			index = (int) pathSpecification.first();
			pathSpecification = (CycList) pathSpecification.rest();
		}
	}

	public void treeSubstitute(final Object oldObject, final Object newObject) {
		final List<ArgPosition> locs = this.getArgPositionsForTerm(oldObject);
		for (final ArgPosition loc : locs) {
			this.setSpecifiedObject(loc, newObject);
		}
	}

	public List<ArgPosition> getArgPositionsForTerm(final Object term) {
		if (this.equals(term)) {
			return Collections.emptyList();
		}
		final List<ArgPosition> result = new ArrayList<ArgPosition>();
		final ArgPosition curArgPosition = ArgPosition.TOP;
		internalGetArgPositionsForTerm(term, this, curArgPosition, result);
		return result;
	}

	private static void internalGetArgPositionsForTerm(Object term, Object subTree, final ArgPosition curPosPath, final List<ArgPosition> result) {
		if (term instanceof CycNart) {
			term = ((CycNart) term).toCycList();
		}
		if (term == subTree) {
			final ArgPosition newArgPos = new ArgPosition(curPosPath.getPath());
			result.add(newArgPos);
			return;
		}
		if (subTree == null) {
			return;
		}
		if (subTree instanceof CycNart) {
			subTree = ((CycNart) subTree).toCycList();
		}
		if (subTree.equals(term)) {
			final ArgPosition newArgPos = new ArgPosition(curPosPath.getPath());
			result.add(newArgPos);
			return;
		}
		if (subTree instanceof CycList && ((CycList) subTree).treeContains(term)) {
			int newPos = 0;
			final Iterator iter = ((List) subTree).iterator();
			while (iter.hasNext()) {
				final ArgPosition newPosPath = new ArgPosition(curPosPath.getPath());
				newPosPath.extend(newPos);
				internalGetArgPositionsForTerm(term, iter.next(), newPosPath, result);
				++newPos;
			}
		}
	}

	public List getReferencedConstants() {
		return this.treeConstants();
	}

	private void writeObject(final ObjectOutputStream stream) throws IOException {
		stream.defaultWriteObject();
		if (!this.isProperList) {
			stream.writeBoolean(false);
			stream.writeObject(this.dottedElement);
		} else {
			stream.writeBoolean(true);
		}
	}

	private void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException {
		stream.defaultReadObject();
		if (!(this.isProperList = stream.readBoolean())) {
			this.dottedElement = (E) stream.readObject();
		}
	}

	@Override
	public ListIterator<E> listIterator(final int index) {
		if (index < 0 || index > this.size()) {
			throw new IndexOutOfBoundsException("Index: " + index);
		}
		return new CycListItr(index);
	}

	@Override
	public ListIterator<E> listIterator() {
		return new CycListItr(0);
	}

	@Override
	public Iterator<E> iterator() {
		return new CycItr();
	}

	private void removeInt(final int i) {
		this.remove(i);
	}

	private void setInt(final int i, final E val) {
		this.set(i, val);
	}

	private void addInt(final int i, final E val) {
		this.add(i, val);
	}

	public static void main(final String[] args) {
		final CycList list = new CycList();
		list.add(new Integer(1));
		list.add(new Integer(2));
		final CycList list2 = new CycList();
		list2.add(new Integer(1));
		list2.add(new Integer(2));
		final CycList list3 = new CycList();
		list3.add(new Integer(1));
		list2.add(list3);
		list.add(list2);
		list.add(new Integer(3));
		list.add(new Integer(1));
		System.out.println("Got original object: " + list);
		list.treeSubstitute(new Integer(1), new Integer(2));
		System.out.println("Got transformed object; " + list);
	}

	static {
		CycList.indentLength = 2;
		EMPTY_CYC_LIST = new UnmodifiableCycList();
		LIST_NIL = new CycSymbol("NIL");
	}

	public static class UnmodifiableCycList<E> extends CycList<E> {
		public UnmodifiableCycList(final CycList<? extends E> list) {
			for (int i = 0; i < list.getProperListSize(); ++i) {
				super.add(list.get(i));
			}
			if (!list.isProperList()) {
				super.setDottedElement(list.getDottedElement());
			}
		}

		private UnmodifiableCycList() {
		}

		@Override
		public boolean add(final E e) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void add(final boolean b) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void add(final double d) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void add(final float f) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void add(final int i) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void add(final long l) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void add(final int index, final E element) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean addAll(final Collection<? extends E> col) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean addAll(final int index, final Collection<? extends E> c) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void addAllNew(final Collection<? extends E> objects) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void addNew(final E object) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void addQuoted(final Object object) {
			throw new UnsupportedOperationException();
		}

		@Override
		public CycList<E> addToBeginning(final E element) {
			throw new UnsupportedOperationException();
		}

		@Override
		public CycList<E> appendElement(final E object) {
			throw new UnsupportedOperationException();
		}

		@Override
		public CycList<E> appendElement(final boolean b) {
			throw new UnsupportedOperationException();
		}

		@Override
		public CycList<E> appendElement(final int i) {
			throw new UnsupportedOperationException();
		}

		@Override
		public CycList<E> appendElement(final long l) {
			throw new UnsupportedOperationException();
		}

		@Override
		protected void appendElement(final StringBuilder builder, final Object object) {
			throw new UnsupportedOperationException();
		}

		@Override
		public CycList<E> appendElements(final CycList<? extends E> cycList) {
			throw new UnsupportedOperationException();
		}

		@Override
		protected StringBuilder appendSubSlice(final StringBuilder builder, final int start, final int end, final boolean properList) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean remove(final Object o) {
			throw new UnsupportedOperationException();
		}

		@Override
		public E remove(final int index) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean removeAll(final Collection c) {
			throw new UnsupportedOperationException();
		}

		@Override
		public CycList removeDuplicates() {
			throw new UnsupportedOperationException();
		}

		@Override
		protected void removeRange(final int fromIndex, final int toIndex) {
			throw new UnsupportedOperationException();
		}

		@Override
		public E set(final int index, final E element) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setDottedElement(final Object dottedElement) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setSpecifiedObject(final CycList pathSpecification, final Object value) {
			throw new UnsupportedOperationException();
		}

		@Override
		public CycList sort() {
			throw new UnsupportedOperationException();
		}

		@Override
		public CycList subst(final Object newObject, final Object oldObject) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void trimToSize() {
			throw new UnsupportedOperationException();
		}
	}

	private class CycItr implements Iterator<E> {
		int cursor;
		int lastRet;
		int expectedModCount;
		int mySize;

		private CycItr() {
			this.lastRet = -1;
			this.expectedModCount = CycList.this.modCount;
			this.mySize = CycList.this.getProperListSize();
		}

		@Override
		public boolean hasNext() {
			return this.cursor != this.mySize;
		}

		@Override
		public E next() {
			this.checkForComodification();
			final int i = this.cursor;
			if (i >= CycList.this.size()) {
				throw new NoSuchElementException();
			}
			this.cursor = i + 1;
			final int n = i;
			this.lastRet = n;
			return CycList.this.get(n);
		}

		@Override
		public void remove() {
			if (this.lastRet < 0) {
				throw new IllegalStateException();
			}
			this.checkForComodification();
			try {
				CycList.this.removeInt(this.lastRet);
				this.cursor = this.lastRet;
				this.lastRet = -1;
				this.expectedModCount = CycList.this.modCount;
			} catch (IndexOutOfBoundsException ex) {
				throw new ConcurrentModificationException();
			}
		}

		final void checkForComodification() {
			if (CycList.this.modCount != this.expectedModCount) {
				throw new ConcurrentModificationException();
			}
		}
	}

	private class CycListItr extends CycItr implements ListIterator<E> {
		CycListItr(final int index) {
			this.cursor = index;
		}

		@Override
		public boolean hasPrevious() {
			return this.cursor != 0;
		}

		@Override
		public int nextIndex() {
			return this.cursor;
		}

		@Override
		public int previousIndex() {
			return this.cursor - 1;
		}

		@Override
		public E previous() {
			this.checkForComodification();
			final int i = this.cursor - 1;
			if (i < 0) {
				throw new NoSuchElementException();
			}
			this.cursor = i;
			final CycList this$0 = CycList.this;
			final int n = i;
			this.lastRet = n;
			return (E) this$0.get(n);
		}

		@Override
		public void set(final E e) {
			if (this.lastRet < 0) {
				throw new IllegalStateException();
			}
			this.checkForComodification();
			try {
				CycList.this.setInt(this.lastRet, e);
			} catch (IndexOutOfBoundsException ex) {
				throw new ConcurrentModificationException();
			}
		}

		@Override
		public void add(final E e) {
			this.checkForComodification();
			try {
				final int i = this.cursor;
				CycList.this.addInt(i, e);
				this.cursor = i + 1;
				this.lastRet = -1;
				this.expectedModCount = CycList.this.modCount;
			} catch (IndexOutOfBoundsException ex) {
				throw new ConcurrentModificationException();
			}
		}
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 610 ms
	
	Decompiled with Procyon 0.5.32.
*/
package org.appdapter.gui.box;

/*
 *  Copyright 2011 by The Appdapter Project (www.appdapter.org).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import java.awt.Component;
import java.awt.Container;
import java.beans.Customizer;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.beans.PropertyVetoException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.appdapter.trigger.bind.jena.ABoxImpl;
import org.appdapter.api.trigger.AnyOper.HasIdent;
import org.appdapter.core.debug.UIAnnotations.UIHidden;
import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.BoxContextImpl;
import org.appdapter.core.jvm.SetObject;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.core.component.KnownComponent;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.log.Debuggable;
import org.appdapter.core.name.Ident;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.DisplayContextProvider;
import org.appdapter.gui.api.DisplayType;
import org.appdapter.gui.api.FocusOnBox;
import org.appdapter.gui.api.GetDisplayContext;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.editors.LargeObjectView;
import org.appdapter.gui.editors.UseEditor;
import org.appdapter.gui.repo.DatabaseManagerPanel;
import org.appdapter.gui.repo.ModelMatrixPanel;
import org.appdapter.gui.repo.RepoManagerPanel;
import org.appdapter.gui.swing.ComponentHost;
import org.appdapter.gui.swing.SmallObjectView;
import org.appdapter.gui.trigger.TriggerMenuFactory;
import org.appdapter.gui.util.PromiscuousClassUtilsA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.graph.FrontsNode;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;

/**
/**  Base implementation of our demo Swing Panel boxes.
 * The default implementation can own one swing panel of each "Kind".
 * This owner does not actually create any kind of GUI resource until it is asked to
 * findBoxPanel(kind).  A strongheaded purpose-specific box might ignore "Kind",
 * and always return whatever panel it thinks is "best".
 * <br/>
 * @author Stu B. <www.texpedient.com>
 */

@UIHidden
public class ScreenBoxImpl<TrigType extends Trigger<? extends ScreenBoxImpl<TrigType>>> //
		extends ABoxImpl<TrigType> //
		implements BT<TrigType>, Comparable {

	static Logger theLogger = LoggerFactory.getLogger(ScreenBoxImpl.class);

	Map<NamedObjectCollection, String> col2Name = null;//new HashMap<NamedObjectCollection, String>();

	public DisplayContext m_displayContext;

	public DisplayType m_displayType = DisplayType.PANEL;

	public boolean notWrapper;

	public static final Object lock = new Object();

	// Because it's a "provider", we have an extra layer of indirection between
	// box and display, enabling independence.
	private DisplayContextProvider myDCP;

	// A box may have up to one panel for any kind.
	//protected Map<Object, JPanel> myPanelMap = new HashMap<Object, JPanel>();

	//private NamedObjectCollection noc;

	public Object valueSetAs = this;

	//private Set<NamedObjectCollection> nocs;

	//==== Constructors ==================================

	/**
	 * Creates a new Box
	 *
	 */
	public ScreenBoxImpl() {
		notWrapper = true;
		Utility.recordCreated(this);
		valueSetAs = this;
	}

	public ScreenBoxImpl(boolean isSelfTheValue) {
		this.notWrapper = isSelfTheValue;
		if (isSelfTheValue)
			valueSetAs = this;
		Utility.recordCreated(this);
	}

	public Box asBox() {
		return this;
	}

	@Override public <T> boolean canConvert(Class<T> c) {
		return ReflectUtils.canConvert(c, getObjects(), this);
	}

	@Override public <T> T convertTo(Class<T> c) {
		return ReflectUtils.convertTo(c, getObjects(), this);
	}

	/**
	 * Updates transient instance variables if necessary
	 */
	private void checkTransient() {

	}

	public void dump() {
		theLogger.info("DUMP-DUMP-DE-DUMP");
	}

	public DisplayContext findDisplayContext(Box b) {
		if (b instanceof GetDisplayContext) {
			return ((GetDisplayContext) b).getDisplayContext();
		}
		Debuggable.notImplemented();
		return m_displayContext;
	}

	public JPanel findExistingBoxPanel(Kind kind) {
		Map<Object, JPanel> myPanelMap = Utility.getPanelMap(getValueOrThis());
		return (JPanel) myPanelMap.get(toKey(kind));
	}

	public JPanel findExistingBoxPanel(Object kind) {
		Map<Object, JPanel> myPanelMap = Utility.getPanelMap(getValueOrThis());
		return myPanelMap.get(toKey(kind));
	}

	/**
	 * The box panel returned might be one that we "made" earlier,
	 * or it might be one that someone "put" onto me.
	 * @param kind
	 * @return
	 */
	public JPanel findOrCreateBoxPanel(Object kind) {
		JPanel bp = findExistingBoxPanel(kind);
		if (bp == null) {
			bp = makeBoxPanelCustomized(kind);
		}
		return bp;
	}

	public BT getBox() {
		return (BT) this;
	}

	public Component getComponent() {
		//if (m_view != null) 			return m_view;
		for (Object o : getObjects()) {
			if (Component.class.isInstance(o)) {
				return (Component) o;
			}
		}
		return findOrCreateBoxPanel(getDisplayType());
	}

	public Component getComponent(DisplayType attachType) {
		return getDisplayTarget(getDisplayType());
	}

	public String getDebugName() {
		try {
			Object o = getValue();
			if (o == null) {
				return getShortLabel();
			}
			return o.toString();
		} catch (Exception e) {
			return super.toString();
		}
	}

	public DisplayContext getDisplayContext() {
		DisplayContext dc = m_displayContext;
		if (dc == null) {
			if (myDCP != null) {
				dc = myDCP.findDisplayContext(this);
			}
			if (dc != null)
				return dc;
		}
		return Utility.browserPanel.getDisplayContext();
	}

	public Container getDisplayTarget(DisplayType attachType) {
		return findOrCreateBoxPanel(attachType);
	}

	public DisplayType getDisplayType() {
		return m_displayType;
	}

	public Class<? extends Object> getObjectClass() {
		Object obj = getValueOrThis();
		if (obj != null) {
			return obj.getClass();
		}
		return Object.class;
	}

	/**
	 * This returns the decomposed Mixins
	 * @return
	 */

	public Iterable<Object> getObjects() {
		synchronized (objects) {
		if (objects.size() == 0) {
			addIfNew(objects, valueSetAs);
			addIfNew(objects, getValue());
			addIfNew(objects, this);
			addIfNew(objects, getIdent());
			addIfNew(objects, getShortLabel());
		}
		return objects;

	}
	}

	List<Object> objects = new ArrayList<Object>();

	static <T> boolean addIfNew(Collection<T> objects2, T valueSetAs2) {
		if (valueSetAs2 != null) {
			if (!objects2.contains(valueSetAs2)) {
				objects2.add(valueSetAs2);
				return true;
			}
		}
		return false;
	}

	static <T> boolean removeIfOld(List<T> objects2, T valueSetAs2) {
		if (valueSetAs2 != null) {
			if (objects2.contains(valueSetAs2)) {
				objects2.remove(valueSetAs2);
				return true;
			}
		}
		return false;
	}

	public <T, E extends T> Iterable getObjects(Class<T> type) {
		if (type == null)
			return (Iterable) getObjects();
		HashSet<E> objs = new HashSet<E>();
		if (this.canConvert(type)) {
			T one = convertTo(type);
			objs.add((E) one);
		}
		for (Object o : getObjects()) {
			if (type.isInstance(o)) {
				objs.add((E) o);
			}
		}
		return objs;
	}

	final public JPanel getPropertiesPanel() {
		Map myPanelMap = Utility.getPanelMap(getValueOrThis());
		Object m_largeview = myPanelMap.get(Kind.OBJECT_PROPERTIES);
		if (m_largeview instanceof JPanel) {
			return (JPanel) m_largeview;
		}
		for (Object o : myPanelMap.values()) {
			if (o instanceof JPanel) {
				return (JPanel) o;
			}
		}
		JPanel pnl = makePropertiesPanel();
		if (m_largeview == null) {
			m_largeview = pnl;
		}
		return pnl;
	}

	public List<TrigType> getTriggers() {
		List<TrigType> tgs = super.getTriggers();
		DisplayContext dc = getDisplayContext();
		for (Class cls : getTypes()) {
			Object obj = convertTo(cls);
			TriggerMenuFactory.addTriggersForInstance(dc, cls, tgs, obj);
		}
		return tgs;
	}

	/**
	 * Returns the Class[]s that this object wrapper represents
	 */
	public Iterable<Class> getTypes() {
		java.util.HashSet al = new java.util.HashSet<Class>();
		Class pojoClass = getObjectClass();
		if (pojoClass != null) {
			al.add(pojoClass);
		} else {
			al.add(getClass());
		}
		return al;
	}

	/**
	 * Returns the name of this value
	 */
	public String getKey() {
		String sl = super_getShortLabel();
		if (sl != null)
			return sl;
		for (NamedObjectCollection noc : getNOCs()) {
			if (noc != null) {
				return generateUniqueName(noc.getNameToBoxIndex());
			}
		}
		return generateUniqueName(null);
	}

	/**
	 * Returns the name of this object
	 */
	final public String generateUniqueName(Map checkAgainst) {
		//String _uname = null;
		String name = super_getShortLabel();
		if (name == null) {
			Ident ident = getIdent();
			if (ident != null) {
				name = ident.getLocalName();
			} else {
				Object object = getValue();
				if (object != null) {
					name = Utility.generateUniqueName(object, checkAgainst);
				} else {
					name = Utility.generateUniqueName(this, checkAgainst);
				}
			}
		}
		setShortLabel(name);
		return name.toString();
	}

	private String super_getShortLabel() {
		return super.getShortLabel();
	}

	public Object getValue() {
		if (valueSetAs == null)
			return this;
		if (valueSetAs == this)
			return this;
		Collection col = defaultItems();
		if (nonDefaultItemCount() != 1) {
			if (valueSetAs != null)
				return valueSetAs;
		}
		if (valueSetAs != null)
			return valueSetAs;
		return this;
	}

	private int nonDefaultItemCount() {
		int count = 0;
		Collection di = defaultItems();
		for (Object o : getObjects()) {
			if (!di.contains(o))
				count++;
		}
		return count;
	}

	Collection keyCol = null;

	private Collection defaultItems() {
		if (keyCol == null) {
			keyCol = new HashSet();
			addIfNew(keyCol, this);
			addIfNew(keyCol, getIdent());
			addIfNew(keyCol, getShortLabel());
		}
		return keyCol;
	}

	/**
	 * Returns the object that this object wrapper represents
	 */
	public Object getValueOrThis() {
		Object value = getValue();
		if (value != null) {
			return value;
		}

		if (value == null) {
			//getLogger().warn("Default implementation of getObject() for NULL is returning 'this'", getShortLabel());
			return this;
		}
		if (value != this) {
			return value;
		}

		//	getLogger().warn("Default implementation of getObject() for {} is returning 'this'", getShortLabel());
		return this;
	}

	/**
	 * This whole "isNamed" thing is a ruse allowing us generality
	 * When these mechanisms mature, we will look at more than just local names
	 * @return
	 */
	public boolean isNamed(String... test) {
		if (test.length == 1) {
			String stest = test[0];
			if (stest.contains(":") || stest.contains("#")) {
				String stest2 = getLocalName(stest, stest.length());
				if (stest != null) {
					return isNamed(stest, stest);
				}
			}
			for (String name : getNames()) {
				if (Utility.stringsEqual(stest, name)) {
					return true;
				}
			}
		} else {
			for (String name : getNames()) {
				for (String stest : test) {
					if (Utility.stringsEqual(stest, name)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/*public BoxPanelSwitchableView getBoxPanelTabPane() {
		return getDisplayContextNoLoop();
	}*/

	// ==== Event listener registration =============
	List<String> names;

	Collection<String> getNames() {
		if (addObjectName(getValue())) {
		}
		addObjectName(getShortLabel());
		addObjectName(getIdent());
		addObjectName(super_getShortLabel());
		return names;
	}

	private boolean addObjectName(Object o) {
		if (o == this)
			return false;
		if (o == null)
			return false;
		if (o instanceof String) {
			if (names == null) {
				names = new ArrayList<String>();
			}
			String s = (String) o;
			int l = s.length();
			if (l == 0)
				return false;
			boolean otherAdded = false;
			String ln = getLocalName(s, l);
			if (ln != null) {
				otherAdded = addObjectName(ln);
			}
			return addIfNew(names, s) || otherAdded;
		}

		if (o instanceof Class) {
			return addObjectName(((Class) o).getName()) || addObjectName(Utility.getSpecialClassName0((Class) o));
		}
		if (o instanceof Number) {
			return addObjectName("" + o);
		}
		if (o instanceof CharSequence) {
			return addObjectName("" + o);
		}
		if (o instanceof RDFNode) {
			if (((RDFNode) o).isURIResource()) {
				return addObjectName(((RDFNode) o).asResource().getURI());
			}
			return addObjectName("" + o);
		}
		if (o instanceof Ident) {
			return addObjectName(((Ident) o).getAbsUriString());
		} else if (o instanceof URI) {
			return addObjectName(((URI) o).toString());
		} else if (o instanceof HasIdent) {
			return addObjectName(((HasIdent) o).getIdent());
		} else if (o instanceof KnownComponent) {
			return addObjectName(((KnownComponent) o).getIdent());
		}
		if (o instanceof FrontsNode) {
			FrontsNode fn = (FrontsNode) o;
			Node node = fn.asNode();
			if (node != o)
				return addObjectName(node);

		}
		return addObjectName(Utility.hasDefaultName(o, false, false));
	}

	private String getLocalName(String s, int l) {
		if (l == 0)
			return null;
		int lh = s.lastIndexOf('#');
		boolean otherAdded = false;
		if (lh > 1 && lh != (l - 1)) {
			return s.substring(lh + 1);
		} else {
			lh = s.lastIndexOf(':');
			if (lh > 1 && lh != (l - 1)) {
				return s.substring(lh + 1);
			}
		}
		return null;
	}

	public boolean isTypeOf(Class type) {
		for (Class c : getTypes()) {
			if (type.isAssignableFrom(c)) {
				return true;
			}
		}
		return type.isInstance(getValue());
	}

	/**
	 * This whole "kind" thing is a ruse allowing us to make some hardwired basic panel types
	 * without the conceptual bloat of yet another registry of named things.  The real generality
	 * named things. The real generality comes when you override this
	 * comes when you override this ScreenBoxImpl class, and provide your own OTHER kind of panel.
	 * When these mechanisms mature, we will expand to a proper GUI component type registry.
	 * @param kind
	 * @return
	 */
	protected JPanel makeBoxPanel(Kind kind) {
		JPanel bp = makeBoxPanelForKind(kind);
		if (bp != null) {
			// Subclasses might do something fancier to share panels among
			// instances.
			putBoxPanel(kind, bp);
		}
		return bp;
	}

	protected JPanel makeBoxPanelCustomized(Object customizer) {
		JPanel bp = makeBoxPanelForCustomizer(customizer);
		if (bp == null) {
			bp = makeOtherPanel();
		}
		if (bp != null) {
			// Subclasses might do something fancier to share panels among
			// instances.
			putBoxPanel(customizer, bp);
		}
		return bp;
	}

	public JPanel makeBoxPanelForCustomizer(Object customizer) {
		if (customizer instanceof Kind) {
			JPanel sbp = makeBoxPanel((Kind) customizer);
			if (sbp != null)
				return sbp;
		}
		return makeBoxPanelForCustomizer2(customizer);
	}

	public JPanel makeBoxPanelForCustomizer2(Object customizer) {
		Object val = getValueOrThis();
		Map<Object, JPanel> myPanelMap = Utility.getPanelMap(val);
		JPanel pnl = myPanelMap.get(toKey(customizer));
		if (pnl != null) {
			return pnl;
		}
		Class objClass = val.getClass();

		if (customizer instanceof Class) {
			Class mustBe = (Class) customizer;
			for (Class cust : Utility.findPanelClasses(objClass)) {
				if (mustBe != null && !mustBe.isAssignableFrom(cust))
					continue;
				if (ReflectUtils.isCreatable(cust)) {
					try {
						Object ni = Utility.newInstance(cust);
						Object pnlMaybe = internPanel(myPanelMap, ni, val);
						if (pnlMaybe instanceof JPanel)
							return (JPanel) pnlMaybe;
					} catch (InstantiationException e) {
					} catch (IllegalAccessException e) {
					} catch (Throwable e) {
					}
				}
			}
		}
		return null;
	}

	public Object internPanel(Map dict, Object customizer, Object val) {
		dict.put(customizer.getClass(), customizer);
		if (customizer instanceof Customizer) {
			Customizer cust = (Customizer) customizer;
			cust.setObject(val);
			if (this instanceof PropertyChangeListener) {
				cust.addPropertyChangeListener((PropertyChangeListener) this);
			}
			if (customizer instanceof JPanel) {
				return customizer;
			}
		}
		if (customizer instanceof PropertyEditor) {
			PropertyEditor editor = (PropertyEditor) customizer;
			Component comp = editor.getCustomEditor();
			if (comp instanceof JComponent) {
				customizer = comp;
				customizer = internPanel(dict, comp, val);
			} else {
				customizer = internPanel(dict, new UseEditor(editor, this), val);
			}
		}
		if (customizer instanceof Component) {
			customizer = ComponentHost.asPanel((Component) customizer, val);
			((ComponentHost) customizer).focusOnBox(this);
		}
		return customizer;

	}

	// ===== Property getters and setters ========================
	public static Class kindToClass(Kind kind) {
		if (kind == Kind.MATRIX)
			return ModelMatrixPanel.class;
		if (kind == Kind.REPO_MANAGER)
			return RepoManagerPanel.class;
		if (kind == Kind.DB_MANAGER)
			return DatabaseManagerPanel.class;
		if (kind == Kind.OBJECT_PROPERTIES)
			return LargeObjectView.class;
		if (kind == Kind.OTHER)
			return Customizer.class;
		if (kind == null)
			return LargeObjectView.class;
		if (Debuggable.isRelease())
			return LargeObjectView.class;
		throw new RuntimeException("Found unexpected ScreenBoxPanelKind: " + kind);
	}

	protected JPanel makeBoxPanelForKind(Kind kind) {

		if (kind == Kind.OTHER)
			return makeOtherPanel();
		Class make = kindToClass(kind);
		try {
			return (JPanel) make.newInstance();
		} catch (Throwable e) {
			throw new RuntimeException("Unable to make ScreenBoxPanelKind: " + make + " for " + kind, e);
		}
	}

	/**
	/** Override this to create an app-specific ScreenBoxPanel kind, and configure
	 * your app to request a panel of kind "OTHER", using BrowseTabFuncs.openBoxPanelAndFocus,
	 * BrowseTabFuncs.openBoxPanelAndFocus, PanelTriggers.OpenTrigger, or your
	 * PanelTriggers.OpenTrigger, or your own mechanism.  Note that your ScreenBoxPanel
	 * may be able to display any number of boxes, by responding to the focusOnBox method.
	 * If those boxes are screen boxes, you may want to tell them to
	 * putBoxPanel() the one currently displaying them, in case they are later asked
	 * to findBoxPanel themselves.
	 *
	 * @return
	 */
	protected JPanel makeOtherPanel() {
		//theLogger.warn("Default implementation of makeOtherPanel() for {} is returning null", getShortLabel());
		return getPropertiesPanel();// Utility.getPropertiesPanel(this);
	}

	protected JPanel makePropertiesPanel() {
		Map<Object, JPanel> myPanelMap = Utility.getPanelMap(getValueOrThis());
		Object m_largeview = myPanelMap.get(toKey(Kind.OBJECT_PROPERTIES));
		if (m_largeview instanceof JPanel) {
			return (JPanel) m_largeview;
		}
		Object obj = getValue();
		if (obj instanceof JPanel) {
			return (JPanel) obj;
		}
		if (obj == null) {
			obj = this;
		}
		JPanel pnl = Utility.getPropertiesPanel(obj);
		if (pnl == null) {
			theLogger.warn("Not getting a panel " + getShortLabel() + " to {} with {} ", this, obj);
			return null;
		}
		pnl.setName(getShortLabel());
		return pnl;
	}

	protected void putBoxPanel(Object kind, JPanel bp) {
		Object key = toKey(kind);
		JPanel oldBP = findExistingBoxPanel(key);
		if (oldBP != null) {
			theLogger.warn("Replacing old ScreenBoxPanel link for " + getShortLabel() + " to {} with {} ", oldBP, bp);
		}
		Map<Object, JPanel> myPanelMap = Utility.getPanelMap(getValueOrThis());
		myPanelMap.put(key, bp);
		setPanelBox(bp);

	}

	protected void setPanelBox(JPanel bp) {
		getObjects();
		addIfNew(objects, bp);
		boolean needSet = true;
		if (needSet && bp instanceof FocusOnBox) {
			try {
				((FocusOnBox) bp).focusOnBox(this);
				needSet = false;
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
		if (needSet && bp instanceof SetObject) {
			try {
				((SetObject) bp).setObject(this);
				needSet = false;
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}

	public Object reallyGetValue() {
		return valueSetAs;
	}

	public void reallySetValue(Object newObject) {
		if (newObject == valueSetAs || newObject == this || newObject == null)
			return;

		Object value = newObject;
		String ds = getDescription();
		if (ds == null) {
			try {
				if (value != null)
					setDescription("" + value + " " + value.getClass());
			} catch (Throwable t) {
				// toString method can cause exceptions!
			}
		}

		if (removeIfOld(objects, valueSetAs)) {
			for (NamedObjectCollection noc : getNOCs()) {
				noc.removeObject(valueSetAs);
			}
		}
		valueSetAs = newObject;
		addValue(valueSetAs);
	}

	// ========= Utility methods =================

	/*
		public NamedObjectCollection getNamedObjectCollection() {
			BoxPanelSwitchableView m_toplevel = getDisplayContextNoLoop();
			if (m_toplevel != null) {
				NamedObjectCollection m_collection = m_toplevel.getNamedObjectCollection();
				if (m_collection != null)
					return m_collection;
			}
			Debuggable.notImplemented();
			Debuggable.notImplemented();
			return (NamedObjectCollection) m_toplevel.getNamedObjectCollection();
		}
	*/

	public boolean representsObject(Object test) {
		if (test == null) {
			return false;
		}
		Object myObj = getValue();
		if (myObj == test) {
			return true;
		}
		if (this == test) {
			return true;
		}
		if (test == m_displayContext) {
			return true;
		}
		Map<Object, JPanel> myPanelMap = Utility.getPanelMap(getValueOrThis());
		for (Object p : myPanelMap.values()) {
			if (p == test) {
				return true;
			}
		}
		if (test instanceof String) {
			return test.equals(getKey());
		}
		return false;
	}

	public void setDisplayContextProvider(DisplayContextProvider dcp) {
		myDCP = dcp;
	}

	public void setNameValue(NamedObjectCollection noc, String uniqueName, Object value) {

		if (value == null) {
			if (notWrapper) {
				value = valueSetAs;
			}
		}

		synchronized (lock) {
			if (col2Name == null) {
				col2Name = new HashMap<NamedObjectCollection, String>();
			}

			if (uniqueName == null) {
				uniqueName = Utility.generateUniqueName_sug(value, uniqueName, noc.getNameToBoxIndex(), false, true);
			}
			col2Name.put(noc, uniqueName);
		}

		setShortLabel(uniqueName);

		try {
			setObject(value);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void setObject(Object value) throws InvocationTargetException {
		Object oldObject = getValue();
		if (oldObject == value) {
			return;
		}
		reallySetValue(value);
		try {
			valueChanged(oldObject, value);
		} catch (PropertyVetoException e) {
			throw Debuggable.reThrowable(e);
		}

	}

	//===== Property getters and setters ========================

	public void setSelectedComponent(Object object) throws PropertyVetoException {

	}

	@Override public String getShortLabel() {
		return super_getShortLabel();
	}

	public void setShortLabel(String shortLabel) {
		BoxedCollectionImpl.labelCheck(shortLabel);
		super.setShortLabel(shortLabel);
	}

	/**
	 * Changes the name of this value. The name should never be null.
	 *
	 * @throws PropertyVetoException if someone refused to allow the name to change
	 */
	public void setUniqueName(String newName) throws PropertyVetoException {
		setUniqueName(newName, Utility.uiObjects.getNameToBoxIndex());
	}

	//========= Utility methods =================

	/**
	 * Changes the name of this object. The name should never be null.
	 *
	 * @throws PropertyVetoException
	 *             if someone refused to allow the name to change
	 */
	public void setUniqueName(String newName, Map checkAgainst) throws PropertyVetoException {
		final String name = generateUniqueName(checkAgainst);
		if (!newName.equals(name)) {
			checkTransient();
			String oldName = name;

			setShortLabel(newName);

		}
	}

	public Object setValue(Object obj) {
		try {
			setObject(obj);
		} catch (Throwable e) {
			throw Debuggable.reThrowable(e);
		}
		return obj;
	}

	public static Object toKey(Object kind) {
		if (kind instanceof Kind) {
			kind = kindToClass((Kind) kind);
		}
		if (kind == null) {
			return null;
		}
		if (kind instanceof Enum) {
			return kind;
		}
		if (kind instanceof Class) {
			Class cind = (Class) kind;
			if (cind.isArray()) {
				kind = Iterable.class;
			} else if (Iterable.class.isAssignableFrom(cind)) {
				kind = Iterable.class;
			}
			return kind;
		}
		return toKey(kind.getClass());
	}

	// the jtree label uses this .. so supply someting good!
	public String toString() {
		String sl = getShortLabel();
		if (sl != null) {
			return sl;
		}
		String name = getKey();
		if (name != null) {
			return name;
		}
		return generateUniqueName(null) + " -> " + getDebugName();

	}

	public void valueChanged(Object oldObject, Object newObject) throws PropertyVetoException {
		checkTransient();
		String oldName = getShortLabel();
		this.reallySetValue(newObject);
	}

	@Override public void addValue(Object val) {
		if (val == this || val == null)
			return;
		if (addIfNew(objects, val)) {
			for (NamedObjectCollection noc : getNOCs()) {
				noc.addValueBoxed(val, this);
			}
			addObjectName(val);
		}

	}

	private Iterable<NamedObjectCollection> getNOCs() {
		synchronized (lock) {
			if (col2Name == null) {
				return Collections.singleton(Utility.getTreeBoxCollection());
			}
			return ReflectUtils.copyOf(col2Name.keySet());
		}
	}

	@Override public void addTitle(String nym) {
		if (addIfNew(getNames(), nym)) {
			for (NamedObjectCollection noc : getNOCs()) {
				noc.addTitleBoxed(nym, this);
			}
		}
	}

	@Override public int compareTo(Object o) {
		if (o == null)
			return 2;
		String a2 = o.toString();
		if (a2 == null || a2.length() == 0)
			return 1;
		return getKey().compareToIgnoreCase(a2);
	}

}
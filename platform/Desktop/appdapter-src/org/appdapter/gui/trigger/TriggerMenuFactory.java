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

package org.appdapter.gui.trigger;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.FeatureDescriptor;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.MenuElement;
import javax.swing.text.JTextComponent;
import javax.swing.tree.DefaultMutableTreeNode;

import org.appdapter.api.trigger.AnyOper.HasIdent;
import org.appdapter.core.debug.UIAnnotations.UIHidden;
import org.appdapter.core.debug.UIAnnotations.UISalient;
import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.MenuName;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.core.component.KnownComponent;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.log.Debuggable;
import org.appdapter.core.name.Ident;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.UIAware;
import org.appdapter.gui.browse.PropertyDescriptorForField;
import org.appdapter.gui.browse.SearchableDemo;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.SafeJMenu;
import org.appdapter.gui.swing.SafeJMenuItem;
import org.appdapter.gui.util.CollectionSetUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.rdf.model.RDFNode;

/**
 * @author Stu B. <www.texpedient.com>
 */
@SuppressWarnings("unchecked")
public class TriggerMenuFactory<TT extends Trigger<Box<TT>> & KnownComponent> {

	static public class TriggerSorter implements Comparator {

		@Override public int compare(Object o1, Object o2) {
			int r = sortByName(o1, o2);
			if (r != 0) {
				return r;
			}
			return compareByIdentity(o1, o2);
		}

		private int sortByName(Object o1, Object o2) {
			if (o1 instanceof Trigger && o2 instanceof Trigger) {
				return compareTrigger((Trigger) o1, (Trigger) o2);
			}
			return getLabel(o1, 2, true).compareToIgnoreCase(getLabel(o2, 2, true));
		}

		private int compareTrigger(Trigger o1, Trigger o2) {
			String p1[] = getTriggerPath(o1);
			String p2[] = getTriggerPath(o1);
			int r = comparePaths(p1, p2);
			if (r != 0) {
				return r;
			}
			return compareByIdentity(o1, o2);
		}

		private int comparePaths(String[] p1, String[] p2) {
			int l1 = p1.length;
			int l2 = p1.length;
			int shortest = Math.min(l1, l2);
			if (l1 != l2) {
				if (shortest == 0)
					return l2 - l1;
				if (shortest == 1)
					return l2 - l1;
			}
			for (int i = 0; i < shortest; i++) {
				int res = (p1[i].compareToIgnoreCase(p2[i]));
				if (res != 0)
					return -res;
			}
			return 0;
		}

		private int compareByIdentity(Object o1, Object o2) {
			return ((Integer) System.identityHashCode(o1)).compareTo(System.identityHashCode(o2));
		}
	}

	static public class JMenuWithPath extends SafeJMenu {

		public JMenuWithPath(String lbl, Object obj) {
			super(true, lbl, obj);
		}

	}

	//It also looks better if you're ignoring case sensitivity:
	public static TriggerSorter nodeComparator = new TriggerSorter();

	static Logger theLogger = LoggerFactory.getLogger(TriggerMenuFactory.class);

	static TriggerMenuFactory triggerMenuFactory = new TriggerMenuFactory();

	public static final TriggerFilter ADD_ALL = new TriggerFilter(true);

	public static final TriggerFilter ADD_INSTANCE = new TriggerFilter(false) {
		{
			addInstance = true;
			addSuperClass = true;
			addAllAccessLevels(true);
		}
	};

	public static final TriggerFilter ADD_STATIC = new TriggerFilter(false) {
		{
			addStatic = true;
			addSuperClass = true;
			addAllAccessLevels(true);
		}
	};

	public final static Class[] CLASS0 = new Class[0];

	public static <TrigType> void addClasses(DisplayContext ctx, Class cls, HashSet<Class> classesVisited) {
		if (cls == null)
			return;
		if (classesVisited.contains(cls))
			return;
		classesVisited.add(cls);
		addClasses(ctx, cls, classesVisited);
		for (Class cls2 : cls.getInterfaces()) {
			addClasses(ctx, cls2, classesVisited);
		}
		addClasses(ctx, cls.getSuperclass(), classesVisited);
	}

	public static <TrigType> void addTriggersForInstance(DisplayContext ctx, Class cls, List<TrigType> tgs, Object poj) {
		final Object pojIn = poj;
		if (poj instanceof BT) {
			BT bt = (BT) poj;
			Object v = bt.getValue();
			if (v != bt && v != null) {
				cls = v.getClass();
				poj = v;
			}
		}
		Boolean was = Utility.canMakeInstanceTriggers.get();
		try {
			for (Object ta : Utility.getTriggerAdders(ctx, cls, poj)) {
				if (ta instanceof TriggerAdder) {
					try {
						((TriggerAdder) ta).addTriggersForObjectInstance(ctx, cls, tgs, poj, ADD_ALL, null);
					} catch (Throwable t) {
						Debuggable.printStackTrace(t);
					}
				}
			}
		} finally {
			Utility.canMakeInstanceTriggers.set(was);
		}
	}

	public static <TrigType> void addTriggersForObjectInstance(boolean isTemplate, DisplayContext ctx, Class cls, List<TrigType> tgs, Object poj, TriggerFilter rulesOfAdd, String menuFmt,
			boolean isDeclNonStatic) {
		addTriggersForObjectInstanceMaster(isTemplate, ctx, cls, tgs, poj, rulesOfAdd, menuFmt, isDeclNonStatic);
	}

	public static <TrigType> void addTriggersForObjectInstanceMaster(boolean isTemplate, DisplayContext ctx, Class cls, List<TrigType> tgs, Object poj, TriggerFilter rulesOfAdd, String menuFmt,
			boolean isDeclNonStatic) {
		final Object pojIn = poj;
		if (poj instanceof BT) {
			BT bt = (BT) poj;
			Object v = bt.getValue();
			if (v != bt && v != null) {
				cls = v.getClass();
				poj = v;
			}
		}
		addClassLevelTriggersOfLowestClass(isTemplate, ctx, cls, tgs, poj, rulesOfAdd, menuFmt, isDeclNonStatic);
		if (UtilityMenuOptions.allTriggersAreGlobal) {
			Utility.addClassMethods(cls);
		}
		if (rulesOfAdd.addPanelClasses)
			addPanelClasses(ctx, cls, tgs, poj);

		if (rulesOfAdd.addGlobalStatics)
			addGlobalStatics(ctx, cls, tgs, poj);

		Object inst = Utility.dref(poj);
		if (inst instanceof Class) {
			TriggerFilter copy = (TriggerFilter) rulesOfAdd.clone();
			copy.addInstance = false;
			addClassLevelTriggersOfLowestClass(isTemplate, ctx, (Class) inst, tgs, null, copy, menuFmt, isDeclNonStatic);
		}
	}

	static <TrigType> void addClassLevelTriggersOfLowestClass(boolean isTemplate, DisplayContext ctx, Class cls, List<TrigType> tgs, Object poj, TriggerFilter rulesOfAdd, String menuFmt,
			boolean isDeclNonStatic) {
		if (rulesOfAdd.addGlobalStatics && UtilityMenuOptions.allTriggersAreGlobal) {
			//already added them
			return;
		}
		HashSet<Class> skippedTriggersClasses = getSkippedTriggerClasses();
		HashSet<Class> flat = new HashSet<Class>();
		if (rulesOfAdd.addSuperClass) {
			addClasses(ctx, cls, flat);
		} else {
			flat.add(cls);
		}
		for (Class cls2 : flat) {
			if (skippedTriggersClasses.contains(cls2))
				continue;
			if (cls2.isInterface())
				continue;
			addClassLevelTriggersPerClass(isTemplate, ctx, cls2, tgs, poj, rulesOfAdd, menuFmt, isDeclNonStatic);
		}
	}

	public static <TrigType> void addClassLevelTriggersPerClass(boolean isTemplate, DisplayContext ctx, Class cls, List<TrigType> tgs, Object poj, TriggerFilter rulesOfAdd, String menuFmt,
			boolean isDeclNonStatic) {
		boolean isSystemPrimitive = Utility.isSystemPrimitive(cls) || cls == Class.class;
		boolean allowStatic = poj == null || isDeclNonStatic;
		boolean allowNonStatic = poj != null;
		for (Method m : ReflectUtils.getAllMethods(cls, true)) {
			if (m.isSynthetic())
				continue;
			boolean isStatic = ReflectUtils.isStatic(m);
			if (isStatic && !allowStatic)
				continue;
			if (!isStatic && !allowNonStatic)
				continue;
			if (isSystemPrimitive && !isStatic)
				continue;
			addFMethodTrigWF(isTemplate, ctx, cls, m, tgs, poj, rulesOfAdd, menuFmt, null, false);
		}
		for (Field m : cls.getDeclaredFields()) {
			if (m.isSynthetic())
				continue;
			boolean isStatic = ReflectUtils.isStatic(m);
			if (isStatic && !allowStatic)
				continue;
			if (!isStatic && !allowNonStatic)
				continue;
			if (ReflectUtils.nonPrimitiveTypeFor(ReflectUtils.getReturnType(m)) == Boolean.class) {
				try {
					addFMethodTrigWF(isTemplate, ctx, cls, m, tgs, poj, rulesOfAdd, menuFmt, PropertyDescriptorForField.findOrCreate(m), true);
				} catch (Throwable e) {
					//	Utility.theLogger.warn("" + cls + ": " + e);
				}
			}
		}
	}

	public static <TrigType> void addClassLevelTriggersPerBeanClass(boolean isTemplate, DisplayContext ctx, Class cls, List<TrigType> tgs, Object poj, TriggerFilter rulesOfAdd, String menuFmt,
			boolean isDeclNonStatic) {
		try {
			boolean onlyThisClass = true;
			BeanInfo bi = Utility.getBeanInfo(cls, onlyThisClass, poj);
			if (bi == null)
				return;
			addFeatureTriggers(isTemplate, ctx, cls, bi.getMethodDescriptors(), tgs, poj, rulesOfAdd, menuFmt, isDeclNonStatic);
			addFeatureTriggers(isTemplate, ctx, cls, bi.getEventSetDescriptors(), tgs, poj, rulesOfAdd, menuFmt, isDeclNonStatic);
			addFeatureTriggers(isTemplate, ctx, cls, bi.getPropertyDescriptors(), tgs, poj, rulesOfAdd, menuFmt, isDeclNonStatic);
		} catch (Exception e) {
			Utility.error("" + cls, e);

		}
	}

	@SuppressWarnings("unchecked") public static <TrigType> void addFeatureTriggers(boolean isTemplate, DisplayContext ctx, Class cls, FeatureDescriptor[] fd, List<TrigType> tgs, Object poj,
			TriggerFilter rulesOfAdd, String menuFmt, boolean isDeclNonStatic) {
		for (FeatureDescriptor f : fd) {
			addFeatureDesc(isTemplate, ctx, cls, f, tgs, poj, rulesOfAdd, menuFmt, isDeclNonStatic);
		}

	}

	@SuppressWarnings("unchecked") public static <TrigType> void addFeatureDesc(boolean isTemplate, DisplayContext ctx, Class cls, FeatureDescriptor fd, List<TrigType> tgs, Object poj,
			TriggerFilter rulesOfAdd, String menuFmt, boolean isDeclNonStatic) {
		if (!rulesOfAdd.addEvents && fd instanceof EventSetDescriptor)
			return;

		if (fd instanceof MethodDescriptor) {
			MethodDescriptor md = (MethodDescriptor) fd;
			addFMethodTrigWF(isTemplate, ctx, cls, md.getMethod(), tgs, poj, rulesOfAdd, menuFmt, fd, false);
			return;
		}

		if (fd instanceof PropertyDescriptor) {
			PropertyDescriptor md = (PropertyDescriptor) fd;
			addFMethodTrigWF(isTemplate, ctx, cls, md.getReadMethod(), tgs, poj, rulesOfAdd, menuFmt, fd, true);
			addFMethodTrigWF(isTemplate, ctx, cls, md.getWriteMethod(), tgs, poj, rulesOfAdd, menuFmt, fd, false);
			return;
		}
	}

	private static <TrigType> void addFMethodTrigWF(boolean isTemplate, DisplayContext ctx, Class cls, Member method, List<TrigType> tgs, Object poj, TriggerFilter rulesOfAdd, String menuFmt,
			FeatureDescriptor featureDesc, boolean isSafe) {
		if (method == null)
			return;
		addMethodAsTrigWF0(isTemplate, ctx, cls, method, tgs, poj, rulesOfAdd, menuFmt, false, featureDesc, isSafe);
	}

	public static <TrigType> void addMethodAsTrig(boolean isTemplate, DisplayContext ctx, Class cls, Member method, List<TrigType> tgs, Object poj, TriggerFilter rulesOfAdd, String menuFmt,
			boolean isDeclNonStatic, boolean isSafe) {
		addMethodAsTrigWF0(isTemplate, ctx, cls, method, tgs, poj, rulesOfAdd, menuFmt, isDeclNonStatic, null, isSafe);
	}

	private static <TrigType> void addMethodAsTrigWF0(boolean isTemplate, DisplayContext ctx, Class cls, Member method, List<TrigType> tgs, Object poj, TriggerFilter rulesOfAdd, String menuFmt,
			boolean isDeclNonStatic, FeatureDescriptor featureDesc, boolean isSafe) {
		Class dc = method.getDeclaringClass();
		boolean clsHidden = hasAnotation(dc, UIHidden.class);
		boolean clsSalient = hasAnotation(dc, UISalient.class);
		UISalient isSalientCls = (UISalient) dc.getAnnotation(UISalient.class);
		UISalient isSalientMethod = isSalientCls;
		AnnotatedElement ae = (AnnotatedElement) method;
		if (hasAnotation(ae, UIHidden.class)) {
			return;
		}
		if (hasAnotation(ae, UISalient.class)) {
			isSalientMethod = ae.getAnnotation(UISalient.class);
		} else {
			if (clsHidden)
				return;
			isSalientMethod = isSalientCls;
		}
		if (!rulesOfAdd.accepts((Member) method))
			return;

		TriggerForMember tfi = new TriggerForMember(isTemplate, menuFmt, ctx, cls, poj, method, isDeclNonStatic, featureDesc, isSafe);
		tfi.applySalience(isSalientMethod);
		if (!tgs.contains(tfi))
			tgs.add((TrigType) tfi);

	}

	public static <TrigType> void addGlobalStatics(DisplayContext ctx, Class cls, List<TrigType> tgs, Object poj) {
		if (!UtilityMenuOptions.addGlobalStatics && !UtilityMenuOptions.allTriggersAreGlobal)
			return;
		for (Trigger trig : Utility.getGlobalTriggers(ctx, cls, poj)) {
			CollectionSetUtils.addIfNew(tgs, (TrigType) trig);
		}
	}

	public static <TrigType> void addPanelClasses(DisplayContext ctx, Class cls, List<TrigType> tgs, Object poj) {
		if (!UtilityMenuOptions.addPanelClasses)
			return;
		for (Class pnlClz : Utility.findPanelClasses(cls)) {
			if (pnlClz == null)
				continue;
			CollectionSetUtils.addIfNew(tgs, ((TrigType) new ShowPanelTrigger(ctx, cls, poj, pnlClz)));
		}
	}

	static void addSeparatorIfNeeded(Container popup, int greaterThan) {
		if (popup.getComponentCount() > greaterThan) {
			if (popup instanceof JMenu) {
				JMenu jmenu = (JMenu) popup;
				jmenu.addSeparator();
				return;
			}
			if (popup instanceof JPopupMenu) {
				JPopupMenu jmenu = (JPopupMenu) popup;
				jmenu.addSeparator();
				return;
			}
		}
	}

	static String checkForDash(String lbl) {
		if (!lbl.startsWith("*") && (lbl.contains("-") || lbl.contains("+"))) {
			return lbl = "* " + lbl;
		}
		return lbl;
	}

	public static void addTriggerToPoppup(Container popup, Object box, String[] path, int idx, Trigger trig) {
		boolean isLast = path.length - idx == 1;
		boolean is2ndLast = path.length - idx == 2;
		if (idx >= path.length) {
			// trying to get something longer than array
			return;
		}
		final String lbl = checkForDash(path[idx].trim());
		if (idx == 0) {
			if (lbl.equals("<toplevel>")) {
				Container cont = Utility.getMenuBar();
				addTriggerToPoppup(cont, box, path, 1, trig);
				return;
			}
		}
		Component child = findChildNamed(popup, true, lbl.toLowerCase());
		if (isLast) {
			if (child == null) {
				popup.add(makeMenuItem(box, lbl, trig));
				return;
			} else {
				//duplicate
				// @todo confirm what to do in this case
				return;
			}

		}
		if (isFavorited(trig)) {
			if (getTriggerPath(trig).length > 1) {
				// continue
			} else {
				if (child == null) {
					popup.add(makeMenuItem(box, lbl, trig));
					return;
				} else {
					//	return;
				}
			}
		}
		if (child == null) {
			JMenuWithPath item = new JMenuWithPath(lbl, box);
			int countOfNonItems = countOfNonItems(popup);
			int at = countOfNonItems + 1;
			int cc = popup.getComponentCount();
			if (at >= cc) {
				popup.add(item);
			} else {
				popup.add(item, at);
			}
			//addSeparatorIfNeeded(popup, 1);
			child = item;
		}
		addTriggerToPoppup((Container) child, box, path, idx + 1, trig);
	}

	private static boolean isFavorited(Trigger trig) {
		if (isFavorited(getMenuPath(trig)))
			return true;
		if (trig instanceof TriggerForClass) {
			TriggerForClass tfi = (TriggerForClass) trig;
			return tfi.isFavorited();
		}
		return true;
	}

	public static boolean isFavorited(String menuPath) {
		if (menuPath == null)
			return false;
		if (menuPath.contains("!"))
			return true;
		return false;
	}

	private static int countOfNonItems(Container popup) {
		int count = 0;
		for (Component c : popup.getComponents()) {
			if (c instanceof JMenuItem)
				continue;
			count++;
		}
		return count;
	}

	public static void addTriggerToPoppup(Container popup, Object box, Trigger trig) {
		String[] path = getTriggerPath(trig);
		addTriggerToPoppup(popup, box, path, 0, trig);
	}

	private static Component[] childrenOf(Container popup) {
		if (popup instanceof JMenu)
			return ((JMenu) popup).getMenuComponents();
		return popup.getComponents();
	}

	public static Class classOrFirstInterface(Class _clazz2) {
		if (true)
			return _clazz2;
		if (_clazz2 == null)
			return null;
		if (_clazz2 == Object.class)
			return null;
		if (_clazz2.isInterface())
			return _clazz2;
		if (hasAnotation(_clazz2, UISalient.class))
			return _clazz2;
		for (Class c : _clazz2.getInterfaces()) {
			if (hasAnotation(c, UIHidden.class))
				continue;
			if (c.getPackage().getName().startsWith("j"))
				continue;
			c = classOrFirstInterface(c);
			if (c == null)
				continue;
			return c;
		}
		Class sc = classOrFirstInterface(_clazz2.getSuperclass());
		if (sc != null)
			return sc;
		return _clazz2;
	}

	public static Class classOrFirstInterfaceR(Class _clazz2) {
		if (true)
			return _clazz2;
		Class sc = classOrFirstInterface(_clazz2);
		if (sc != null)
			return sc;
		return _clazz2;

	}

	public static String describeMethod(Member fd) {
		return fd.toString() + " decl=" + fd.getDeclaringClass();
	}

	public static String describeFD(FeatureDescriptor fd) {
		return fd.getName() + " " + fd.getShortDescription() + " " + fd.getClass().getSimpleName() + " " + Debuggable.toInfoStringF(fd);

	}

	public static Component findChildNamed(Container popup, boolean toLowerCase, Comparable<String> fnd) {
		Component[] comps = childrenOf(popup);
		if (comps == null || comps.length == 0)
			return null;
		Component c2 = null;
		for (Component c : comps) {
			if (c == fnd)
				return c;
			String name = getLabel(c, 1, false);
			if (name == null)
				continue;
			int v = fnd.compareTo(name);
			if (v == 0)
				return c;
			if (toLowerCase) {
				name = name.toLowerCase();
			}
			v = fnd.compareTo(name);
			if (v == 0)
				return c;
			String name2 = c.getName();
			if (name2 != null) {
				v = fnd.compareTo(name2);
				if (v == 0)
					c2 = c;
			}
		}
		return c2;
	}

	public static Field getAnyFieldObject(Class cls, FeatureDescriptor fd) {
		if (cls == null) {
			return null;
		}
		String name = fd.getName();
		if (fd instanceof PropertyDescriptor) {
			for (Field f : cls.getDeclaredFields()) {
				if (f.getName().equalsIgnoreCase(name)) {
					return f;
				}
			}
		}
		return getAnyFieldObject(cls.getSuperclass(), fd);
	}

	public static TriggerMenuFactory getInstance(Object obj) {
		Class triggerClass = Object.class;
		if (obj instanceof Class) {
			triggerClass = (Class) obj;
		} else if (obj != null) {
			triggerClass = obj.getClass();
		}
		return triggerMenuFactory;
	}

	public static String getLabel(Component view, int maxDepth) {
		return getLabel(view, maxDepth, false);
	}

	public static String getLabel(Object c, int maxDepth, boolean includeParent) {
		String sl = txtlabelName(c);
		if (sl != null)
			return sl;
		if (c instanceof Component) {
			return getLabelWithParent((Component) c, maxDepth, includeParent);
		}
		return "" + c;
	}

	private static String txtlabelName(Object c) {
		if (c instanceof Trigger) {
			return getTriggerSortName((Trigger) c);
		}
		if (c instanceof KnownComponent) {
			Ident shortLabel = ((KnownComponent) c).getIdent();
			if (shortLabel != null)
				return shortLabel.getAbsUriString();
		}
		if (c instanceof HasIdent) {
			Ident shortLabel = ((HasIdent) c).getIdent();
			if (shortLabel != null)
				return shortLabel.getAbsUriString();
		}
		if (c instanceof RDFNode) {
			String shortLabel = ((RDFNode) c).toString();
			if (shortLabel != null)
				return shortLabel;
		}
		if (c instanceof KnownComponent) {
			String shortLabel = ((KnownComponent) c).getShortLabel();
			if (shortLabel != null)
				return shortLabel;
		}
		return null;
	}

	public static String getLabelWithParent(Component c, int maxDepth, boolean includeParent) {
		String s = getComponentLabelNoParent(c, maxDepth);
		if (!includeParent)
			return s;
		String ss = getComponentLabelNoParent(c.getParent(), 0);
		if (ss != null)
			return ss + "|" + s;
		return s;
	}

	public static String getComponentLabelNoParent(Component c, int maxDepth) {
		if (c == null)
			return null;

		if (c instanceof JPopupMenu) {
			return ((JPopupMenu) c).getLabel();
		}
		if (c instanceof JMenu) {
			return ((JMenu) c).getText();
		}
		if (c instanceof JMenuItem) {
			return ((JMenuItem) c).getText();
		}
		if (c instanceof JLabel) {
			return ((JLabel) c).getText();
		}
		if (c instanceof JCheckBox) {
			return ((JCheckBox) c).getText();
		}
		if (c instanceof AbstractButton) {
			return ((AbstractButton) c).getText();
		}
		if (c instanceof JTextComponent) {
			return ((JTextComponent) c).getText();
		}
		if (c instanceof MenuElement) {
			Component c2 = ((MenuElement) c).getComponent();
			if (c != c2) {
				String text = getLabel(c2, maxDepth, false);
				if (text != null)
					return text;
			}
		}
		Container p = c.getParent();
		if (p instanceof JTabbedPane) {
			JTabbedPane tabbed = (JTabbedPane) p;
			int index = SearchableDemo.getComponentIndex(p, tabbed);
			if (index != -1) {
				String title = tabbed.getTitleAt(index);
				if (title != null)
					return title;
			}
		}
		if (maxDepth <= 0) {
			String text = c.getName();
			if (text != null)
				return text;
			return text;
		}

		if (c instanceof Container) {
			int mustBeWithin = 2;
			for (Component c2 : ((Container) c).getComponents()) {
				String text = getLabel(c2, maxDepth - 1, false);
				if (text != null)
					return text;
				mustBeWithin--;
				if (mustBeWithin <= 0)
					break;
			}
		}
		return null;
	}

	public static Method getReadMethodObject(FeatureDescriptor _featureDescriptor) {
		if (_featureDescriptor instanceof MethodDescriptor) {
			MethodDescriptor md = (MethodDescriptor) _featureDescriptor;
			return md.getMethod();
		}
		if (_featureDescriptor instanceof EventSetDescriptor) {
			EventSetDescriptor md = (EventSetDescriptor) _featureDescriptor;
			Method em = md.getGetListenerMethod();// md.getGetListenerMethod();
			if (em != null)
				return em;
			return null;// md.getGetListenerMethod();
		}
		if (_featureDescriptor instanceof PropertyDescriptor) {
			PropertyDescriptor md = (PropertyDescriptor) _featureDescriptor;
			Method m = md.getReadMethod();
			if (m != null)
				return m;
			Method m2 = md.getWriteMethod();
			if (m2 != null)
				return m2;
		}
		return null;
	}

	public static String getMenuPath(Object t) {
		if (t == null)
			return "<null trigger>";
		String shortLabel = null;
		if (t instanceof MenuName) {
			shortLabel = ((MenuName) t).getMenuPath();
		} else if (t instanceof KnownComponent) {
			shortLabel = ((KnownComponent) t).getShortLabel();
		} else if (t instanceof Component) {
			shortLabel = getLabel((Component) t, 2);
		} else if (t instanceof Action) {
			shortLabel = "" + ((Action) t).getValue(Action.NAME);
		}
		if (shortLabel != null && isRealLabel(shortLabel))
			return shortLabel;
		return "" + t;
	}

	private static HashSet<Class> getSkippedTriggerClasses() {
		HashSet<Class> flat = new HashSet<Class>();
		flat.add(Object.class);
		//flat.add(BasicDebugger.class);
		//flat.add(Loggable.class);
		// flat.add(NoObject.class);
		flat.add(UIHidden.class);
		flat.add(Annotation.class);
		return flat;
	}

	public static String getTriggerName(Trigger trig) {
		String[] path = getTriggerPath(trig);
		if (path == null || path.length == 0)
			return "" + getMenuPath(trig);
		return path[path.length - 1].trim();
	}

	public static String[] getTriggerPath(Trigger trig) {
		return getTriggerPath(getMenuPath(trig));
	}

	private static String[] getTriggerPath(String shortLabel) {
		return shortLabel.split("\\|");
	}

	public static String getTriggerSortName(Trigger t) {
		if (true)
			return getMenuPath(t);
		String[] tn = getTriggerPath(t);
		return tn[tn.length - 1];
	}

	private static boolean hasAnotation(AnnotatedElement method, final Class<? extends Annotation> class1) {
		if (method == null)
			return false;
		if (true)
			return method.isAnnotationPresent(class1);

		Annotation[] decl = method.getAnnotations();
		if (CollectionSetUtils.containsOne(decl, new CollectionSetUtils.TAccepts<Annotation>() {
			@Override public boolean isCompleteOn(Annotation e) {
				return resultOf(e);
			}

			@Override public boolean resultOf(Annotation e) {
				return class1.isAnnotationPresent(e.annotationType());
			}
		})) {
			return true;
		}
		return false;
	}

	private static boolean isRealLabel(String toStr) {
		if (toStr == null)
			return false;
		if (toStr.length() == 0)
			return false;
		return true;
	}

	public static AbstractButton makeMenuItem(final Object/**/b, String lbl, final Trigger trig) {
		AbstractButton jmi = null;
		try {
			if (trig instanceof ButtonFactory) {
				jmi = ((ButtonFactory) trig).makeMenuItem(lbl, b);
			}
		} catch (Throwable t) {
			t.printStackTrace();
		}
		if (jmi == null) {
			jmi = new SafeJMenuItem(b, true, getTriggerName(trig));
		}
		if (trig instanceof UIAware) {
			jmi = (AbstractButton) ((UIAware) trig).visitComponent(jmi);
		}
		if (trig instanceof ActionListener) {
			jmi.addActionListener((ActionListener) trig);
		} else {
			jmi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Box box = Utility.asBox(b, e);
					trig.fire(box);
				}
			});
		}
		return jmi;
	}

	///===================================== INSTANCE METHODS =======================================================

	public TriggerMenuFactory() {

	}

	public void addMenuItem(Action a, Object/**/box, JMenu menu) {
		addTriggerToPoppup(menu, box, ensureTrigger(a));
	}

	public void addMenuItem(Action a, Object/**/box, JPopupMenu menu) {
		addTriggerToPoppup(menu, box, ensureTrigger(a));
	}

	static public void addTriggersToPopup(Object/**/box, JComponent popup) {
		if (box instanceof UIAware) {
			popup = ((UIAware) box).visitComponent(popup);
		}
		if (box instanceof PopupAdder) {
			if (popup instanceof JPopupMenu) {
				((PopupAdder) box).addLocalContributions((JPopupMenu) popup);
				return;
			} else {
				theLogger.warn("Popup adder cannot add to " + popup.getClass() + " = " + popup);
			}
		}
		if (box instanceof Trigger) {
			addTriggerToPoppup(popup, box, (Trigger) box);
		}
		if (popup instanceof TriggerPopupMenu) {
			// Allready added the items?
			//return;
		}
		List<Trigger> trigs = getTriggers(box);
		for (Trigger trig : trigs) {
			addTriggerToPoppup(popup, box, trig);
		}
	}

	public static List<Trigger> sortTriggers(List<Trigger> trigs) {
		HashMap<String, Trigger> map = new HashMap<String, Trigger>();
		for (Trigger t : trigs) {
			String shortLabel = getMenuPath(t);
			map.put(shortLabel.toLowerCase(), t);
		}
		trigs = new ArrayList(map.values());
		Collections.sort(trigs, new TriggerSorter());
		return trigs;
	}

	static List<Trigger> getTriggers(Object box) {
		if (box instanceof Box) {
			return sortTriggers(((Box) box).getTriggers());
		}
		List<Trigger> tgs = new ArrayList<Trigger>();
		if (box == null)
			return tgs;
		TriggerMenuFactory.addTriggersForInstance(null, box.getClass(), tgs, box);
		return sortTriggers(tgs);
	}

	static public TriggerPopupMenu buildPopupMenuAndShow(MouseEvent e, boolean show, Object... boxes) {
		return buildPopupMenuAndShowC(e, show, Arrays.asList(boxes));
	}

	static public TriggerPopupMenu buildPopupMenuAndShowC(MouseEvent e, boolean show, Collection<Object> boxes) {
		TriggerPopupMenu popup = new TriggerPopupMenu(null, e, null);
		for (Object o : boxes) {
			if (o instanceof Box) {
				Box bt = (Box) o;
				List<Trigger> trigs = bt.getTriggers();
				popup.addTriggers(trigs);
			}
			popup.addMenuFromObject(o);
		}
		if (popup != null && show) {
			e.consume();
			popup.show(e.getComponent(), e.getX(), e.getY());
		}
		return popup;
	}

	static public TriggerPopupMenu buildPopupMenu(Object/**/box) {
		return buildPopupMenuAndShow(null, false, box);
	}

	private Trigger ensureTrigger(final Action a) {
		if (a instanceof Trigger)
			return (Trigger) a;
		return new TriggerForAction(a);
	}

	public static void addMap(Map lastResults, Container popup) {
		Map<?, ?> lr;
		synchronized (lastResults) {
			lr = new HashMap(lastResults);
		}
		for (Map.Entry me : lr.entrySet()) {
			String[] path = getTriggerPath(Utility.getUniqueNameForKey(me.getKey()));
			Object box = me.getValue();
			List trigs = getTriggers(box);
			addTriggersToPoppup(box, path, trigs, popup);
		}
	}

	public static void addCollection(String prepend, Collection lastResults, Container popup) {
		String[] path;
		if (prepend == null || prepend.length() == 0) {
			path = new String[0];
		} else {
			path = getTriggerPath(prepend);
		}
		ArrayList lr;
		synchronized (lastResults) {
			lr = new ArrayList(lastResults);
		}
		for (Object box : lr) {
			List trigs = getTriggers(box);
			addTriggersToPoppup(box, path, trigs, popup);
		}
	}

	private static void addTriggersToPoppup(Object box, String[] path, Collection<Trigger> triggers, Container popup) {
		for (Trigger t : triggers) {
			List<String> sl = joinArrays(path, getTriggerPath(t));
			addTriggerToPoppup(popup, box, sl.toArray(new String[sl.size()]), 0, t);
		}

	}

	private static <T> List<T> joinArrays(T[] path, T[] ts) {
		if (path == null || path.length == 0)
			return ReflectUtils.asList(ts);
		ArrayList<T> sl = new ArrayList();
		sl.addAll(ReflectUtils.asList(path));
		if (ts != null && ts.length > 0)
			sl.addAll(ReflectUtils.asList(ts));
		return sl;
	}

}

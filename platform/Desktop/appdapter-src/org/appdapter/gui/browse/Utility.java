package org.appdapter.gui.browse;

import static org.appdapter.core.convert.ReflectUtils.DEFAULT_CONVERTER;
import static org.appdapter.core.convert.ReflectUtils.addAllNew;
import static org.appdapter.core.convert.ReflectUtils.addIfNew;
import static org.appdapter.core.convert.ReflectUtils.arrayOf;
import static org.appdapter.core.convert.ReflectUtils.convertUsingReflection;
import static org.appdapter.core.convert.ReflectUtils.copyOf;
import static org.appdapter.core.convert.ReflectUtils.equalTypes;
import static org.appdapter.core.convert.ReflectUtils.getAllFields;
import static org.appdapter.core.convert.ReflectUtils.getAllMethods;
import static org.appdapter.core.convert.ReflectUtils.getAnnotationOn;
import static org.appdapter.core.convert.ReflectUtils.getCanonicalSimpleName;
import static org.appdapter.core.convert.ReflectUtils.getComponentType;
import static org.appdapter.core.convert.ReflectUtils.getTypeClass;
import static org.appdapter.core.convert.ReflectUtils.implementsAllClasses;
import static org.appdapter.core.convert.ReflectUtils.invokeOptional;
import static org.appdapter.core.convert.ReflectUtils.isAssignableFrom;
import static org.appdapter.core.convert.ReflectUtils.isCreatable;
import static org.appdapter.core.convert.ReflectUtils.isSameType;
import static org.appdapter.core.convert.ReflectUtils.isStatic;
import static org.appdapter.core.convert.ReflectUtils.isSynthetic;
import static org.appdapter.core.convert.ReflectUtils.noSuchConversion;
import static org.appdapter.core.convert.ReflectUtils.nonPrimitiveTypeFor;
import static org.appdapter.core.convert.ReflectUtils.registerConverter;
import static org.appdapter.core.convert.ReflectUtils.registerConverterMethod;
import static org.appdapter.core.log.Debuggable.notImplemented;
import static org.appdapter.core.log.Debuggable.printStackTrace;
import static org.appdapter.core.log.Debuggable.reThrowable;
import static org.appdapter.core.log.Debuggable.toInfoStringO;
import static org.appdapter.gui.trigger.TriggerMenuFactory.ADD_ALL;
import static org.appdapter.gui.trigger.TriggerMenuFactory.addMethodAsTrig;
import static org.appdapter.gui.trigger.TriggerMenuFactory.addTriggerToPoppup;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.beans.BeanInfo;
import java.beans.Customizer;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.beans.PropertyVetoException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSpinner.DateEditor;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.tools.FileObject;

import org.appdapter.api.trigger.AnyOper;
import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.BoxContext;
import org.appdapter.api.trigger.MutableBox;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.api.trigger.UserResult;
import org.appdapter.bind.rdf.jena.model.JenaLiteralUtils;
import org.appdapter.core.boot.ClassLoaderUtils;
import org.appdapter.core.component.IdentToObjectListener;
import org.appdapter.core.component.KnownComponent;
import org.appdapter.core.convert.AggregateConverter;
import org.appdapter.core.convert.Convertable;
import org.appdapter.core.convert.Converter;
import org.appdapter.core.convert.Converter.ConverterMethod;
import org.appdapter.core.convert.ConverterFromMember;
import org.appdapter.core.convert.NoSuchConversionException;
import org.appdapter.core.convert.OptionalArg;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.convert.ReflectUtils.PCons;
import org.appdapter.core.convert.ToFromKeyConverter;
import org.appdapter.core.debug.UIAnnotations.Autoload;
import org.appdapter.core.debug.UIAnnotations.Singleton;
import org.appdapter.core.debug.UIAnnotations.UIHidden;
import org.appdapter.core.debug.UIAnnotations.UISalient;
import org.appdapter.core.debug.UIAnnotations.UtilClass;
import org.appdapter.core.item.JenaResourceItem;
import org.appdapter.core.jvm.CallableWithParameters;
import org.appdapter.core.jvm.GetObject;
import org.appdapter.core.log.Debuggable;
import org.appdapter.core.name.FreeIdent;
import org.appdapter.core.name.Ident;
import org.appdapter.core.store.Repo;
import org.appdapter.gui.api.AddTabFrames;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.BrowserPanelGUI;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.DisplayType;
import org.appdapter.gui.api.EditableTrigger;
import org.appdapter.gui.api.GetDisplayContext;
import org.appdapter.gui.api.GetSetObject;
import org.appdapter.gui.api.IGetBox;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.POJOCollection;
import org.appdapter.gui.api.WrapperValue;
import org.appdapter.gui.box.BoxedCollectionImpl;
import org.appdapter.gui.box.BoxedCollectionImpl.ScreenBoxImplMade;
import org.appdapter.gui.box.ScreenBoxImpl;
import org.appdapter.gui.demo.DemoBrowser;
import org.appdapter.gui.editors.AbstractCollectionBeanInfo;
import org.appdapter.gui.editors.BooleanEditor;
import org.appdapter.gui.editors.ColorEditor;
import org.appdapter.gui.editors.ColorEditor.ColorCellEditor;
import org.appdapter.gui.editors.EnumPropertyEditor;
import org.appdapter.gui.editors.GoodPropertyEditorSupport;
import org.appdapter.gui.editors.IntEditor;
import org.appdapter.gui.editors.LargeObjectView;
import org.appdapter.gui.editors.ObjectChoiceComboPanel;
import org.appdapter.gui.editors.ObjectChoiceModel;
import org.appdapter.gui.editors.ObjectPanel;
import org.appdapter.gui.editors.SimplePOJOInfo;
import org.appdapter.gui.editors.SpecificObjectCustomizers;
import org.appdapter.gui.editors.SpecificObjectCustomizers.BasicObjectCustomizer;
import org.appdapter.gui.editors.SpecificObjectCustomizers.ClassCustomizer;
import org.appdapter.gui.editors.SpecificObjectCustomizers.CollectionCustomizer;
import org.appdapter.gui.editors.SpecificObjectCustomizers.ThrowableCustomizer;
import org.appdapter.gui.editors.UseEditor;
import org.appdapter.gui.repo.ModelAsTurtleEditor;
import org.appdapter.gui.repo.ModelMatrixPanel;
import org.appdapter.gui.repo.RepoManagerPanel;
import org.appdapter.gui.swing.CollectionEditorUtil;
import org.appdapter.gui.swing.DisplayContextUIImpl;
import org.appdapter.gui.swing.DisplayContextUIImpl.UnknownIcon;
import org.appdapter.gui.swing.ErrorDialog;
import org.appdapter.gui.swing.IsReference;
import org.appdapter.gui.swing.JJPanel;
import org.appdapter.gui.swing.NumberField;
import org.appdapter.gui.swing.PropertyValueControl;
import org.appdapter.gui.swing.PropertyValueControl.RDFObjectReferenceEditor;
import org.appdapter.gui.table.ArrayContentsPanel;
import org.appdapter.gui.table.ArrayContentsPanel.ArrayContentsPanelTabFramer;
import org.appdapter.gui.table.SafeJTable;
import org.appdapter.gui.trigger.EditableTriggerImpl;
import org.appdapter.gui.trigger.TriggerAdder;
import org.appdapter.gui.trigger.TriggerFilter;
import org.appdapter.gui.trigger.TriggerForClass;
import org.appdapter.gui.trigger.TriggerMenuController;
import org.appdapter.gui.trigger.TriggerMenuFactory;
import org.appdapter.gui.trigger.TriggerMouseAdapter;
import org.appdapter.gui.trigger.UtilityMenuOptions;
import org.appdapter.gui.util.ClassFinder;
import org.appdapter.gui.util.PairTable;
import org.appdapter.gui.util.PromiscuousClassUtilsA;
import org.armedbear.lisp.Main;
//import org.slf4j.Logger;
import org.logicmoo.system.BeanShellCntrl;

//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.hp.hpl.jena.graph.FrontsNode;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
//import sun.beans.editors.ColorEditor;
//import sun.beans.editors.IntEditor;

@UIHidden
public class Utility extends UtilityMenuOptions {




	@UISalient
	public static boolean GuiDebugTracing = false;

	// warnings that should never happen and only useful to
	public static void bug(Object... params) {
		if (!GuiDebugTracing)
			return;
		String msg = Debuggable.toInfoStringArgV(params);
		warn("DUG BUG: ");
		if (!Debuggable.isRelease()) {
			Debuggable.warn(msg);
		}
	}

	public static void checkSource(final Object source) {
		if (source == null) {
			Utility.bug("NULL in checkSource");
		} else if (source instanceof JComponent) {
			Utility.bug("checkSource a " + source.getClass());
		} else if (source instanceof ScreenBoxImplMade) {
			Utility.bug("checkSource a " + source.getClass());
		} else if (source instanceof TableModel) {
			Utility.bug("checkSource a " + source.getClass());
		}
	}

	public final static ToFromStringNotSpecialized FROM_STRING_NOT_SPECIALIZED = new ToFromStringNotSpecialized();
	public static SpecialQueue taskEqueue = new SpecialQueue("SpecialQueueForUtility");

	public static class TriggerAdderForInstance<TrigType> implements org.appdapter.gui.trigger.TriggerAdder {
		@Override public String toString() {
			// TODO Auto-generated method stub
			return getClass().getSuperclass() + " addTriggersForObjectInstance";
		}

		@Override public void addTriggersForObjectInstance(DisplayContext ctx, Class cls, List tgs, Object poj, TriggerFilter rulesOfAdd, String menuFmt) {
			//TriggerMenuFactory.addTriggersForObjectInstanceMaster(ctx, cls, tgs, poj, ADD_ALL, menuFmt, false);
			if (cls != null && poj != null && !cls.isInstance(poj) && poj instanceof BT) {
				bug("addTriggersForObjectInstance = " + poj);
			}
			Object also = dref(poj);
			if (also == null) {
				also = poj;
			}
			if (also != null) {
				TriggerMenuFactory.addTriggersForObjectInstanceMaster(false, ctx, also.getClass(), tgs, also, ADD_ALL, menuFmt, false);
			}
			//Object also2 = drefO(poj);
			//if (also2 != null && also2 != poj && also2 != also) {
			//TriggerMenuFactory.addTriggersForObjectInstanceMaster(ctx, also2.getClass(), tgs, also2, ADD_ALL, menuFmt, false);
			//}
		}
	}

	static public class ToFromStringNotSpecialized extends ToFromKeyConverterImpl<Object, String> implements AnyOper.DontAdd {

		public ToFromStringNotSpecialized() {
			super(Object.class, String.class);
		}

		@Override public Object fromKey(String title, Class specializedMaybe) {
			try {
				return fromString(title, specializedMaybe);
			} catch (NoSuchConversionException e) {
				throw new ClassCastException(e.getMessage());
			}
		}

		@Override public String toKey(Object toBecomeAKey) {
			return getUniqueName(toBecomeAKey, uiObjects, true, true, true);
		}

	}

//	public static Logger theLogger = org.slf4j.LoggerFactory.getLogger(Utility.class);

	static public class UtilityConverter implements Converter {

		@Override public String toString() {
			return "{" + Debuggable.toInfoStringArgV("Converter=", getClass()) + "}";
		}

		@Override public <T> T convert(Object obj, Class<T> objNeedsToBe, List maxCvt) throws NoSuchConversionException {
			return (T) recastUtilOnly(obj, objNeedsToBe, maxCvt);
		}

		@Override public Integer declaresConverts(Object val, Class from, Class objNeedsToBe, List maxCvt) {
			if (from != null && objNeedsToBe != null) {
				if (from == String.class)
					if (getToFromKeyConverter(objNeedsToBe, from) != null)
						return WILL;
				if (objNeedsToBe == String.class)
					if (getToFromKeyConverter(from, objNeedsToBe) != null)
						return WILL;
			}
			if (val instanceof Convertable) {
				Convertable convertable = (Convertable) val;
				if (convertable.canConvert(objNeedsToBe))
					return WILL;
				return WONT;
			}
			if (val == null)
				return MIGHT;

			Object o = Utility.dref1(val, true);
			if (o == val) {
				try {
					if (false) {
						o = Utility.recastUtilOnly(val, objNeedsToBe, maxCvt);
						if (objNeedsToBe.isInstance(o)) {
							return WILL;
						}
					}
				} catch (NoSuchConversionException e) {
				}
				return WONT;
			}
			if (o != val && o != null) {
				Class from2 = o.getClass();
				if (from2 != from) {
					return DEFAULT_CONVERTER.declaresConverts(val, from2, objNeedsToBe, maxCvt);
				}
				return DEFAULT_CONVERTER.declaresConverts(val, from2, objNeedsToBe, maxCvt);
			}
			return MIGHT;// .declaresConverts(val, from, objNeedsToBe);
		}

	}

	static public class UtilityToFromConverterOnly implements Converter {

		@Override public String toString() {
			return "{" + Debuggable.toInfoStringArgV("Converter=", getClass()) + "}";
		}

		@Override public <T> T convert(Object obj, Class<T> objNeedsToBe, List maxCvt) throws NoSuchConversionException {
			ToFromKeyConverter converter = getToFromKeyConverter(objNeedsToBe, obj.getClass());
			if (converter == null)
				return noSuchConversion(obj, objNeedsToBe, null);
			if (converter instanceof Converter) {
				return ((Converter) converter).convert(obj, objNeedsToBe, maxCvt);
			}
			return (T) converter.fromKey(obj, objNeedsToBe);
		}

		@Override public Integer declaresConverts(Object val, Class from, Class objNeedsToBe, List maxCvt) {
			if (from != null) {
				if (getToFromKeyConverter(objNeedsToBe, from) != null)
					return WILL;
			}
			return WONT;// .declaresConverts(val, from, objNeedsToBe);
		}

	}

	static public class UtilityUnboxingConverterOnly implements Converter {

		@Override public String toString() {
			return "{" + Debuggable.toInfoStringArgV("Converter=", getClass()) + "}";
		}

		@Override public <T> T convert(Object obj, Class<T> objNeedsToBe, List maxCvt) throws NoSuchConversionException {
			return (T) recastUtilOnly(obj, objNeedsToBe, maxCvt);
		}

		@Override public Integer declaresConverts(Object val, Class from, Class objNeedsToBe, List maxCvt) {
			if (from != null && GetObject.class.isAssignableFrom(from)) {
				return MIGHT;
			}
			if (val instanceof GetObject) {
				return MIGHT;
			}
			return WONT;
		}
	}

	static public class UtilityConvertableConverterOnly implements Converter {

		@Override public String toString() {
			return "{" + Debuggable.toInfoStringArgV("Converter=", getClass()) + "}";
		}

		@Override public <T> T convert(Object val, Class<T> objNeedsToBe, List maxCvt) throws NoSuchConversionException {
			if (val instanceof Convertable) {
				Convertable convertable = (Convertable) val;
				return convertable.convertTo(objNeedsToBe);
			}
			return (T) recastUtilOnly(val, objNeedsToBe, maxCvt);
		}

		@Override public Integer declaresConverts(Object val, Class from, Class objNeedsToBe, List maxCvt) {
			if (val instanceof Convertable) {
				Convertable convertable = (Convertable) val;
				if (convertable.canConvert(objNeedsToBe))
					return WILL;
				return WONT;
			}
			if (from != null && Convertable.class.isAssignableFrom(from)) {
				return MIGHT;
			}
			return WONT;
		}
	}

	static public class UtilityOptionalArgs implements OptionalArg {

		private short filterSpec;

		@Override public String toString() {
			return "OptionalArgs=" + filterSpec;
		}

		public UtilityOptionalArgs(short optionalArgSpecs) {
			this.filterSpec = optionalArgSpecs;
		}

		@Override public Object getArg(Class type) throws NoSuchConversionException {
			return getOptionalArg(type, filterSpec, true);
		}

		@Override public void reset() {
		}
	}

	private static Map panelClassesFromCached = new HashMap();
	public static HashMap<Class, Object> lastResults = new HashMap<Class, Object>();
	public static HashMap<Class, Callable<Object>> singletons = new HashMap<Class, Callable<Object>>();
	public static HashMap<Class, Callable<Object>> factories = new HashMap<Class, Callable<Object>>();
	public static HashMap<Class, Callable<Object>> factoriesNoninteractive = new HashMap<Class, Callable<Object>>();
	private static Collection EMPTY_COLLECTION = Collections.EMPTY_LIST;
	private static ThreadLocal<Boolean> inClassLoadingPing = new ThreadLocal<Boolean>();
	public static Collection<AddTabFrames> addTabFramers = new HashSet<AddTabFrames>();
	final static HashMap<Object, BT> allBoxes = new HashMap();
	private static final Class[] CLASS0 = new Class[0];
	public static final Class Stringable = Enum.class;
	final static Map<Class, Map<Class, ToFromKeyConverter>> toFrmKeyCnvMap = new HashMap<Class, Map<Class, ToFromKeyConverter>>();
	static HashMap<String, LinkedList> displayLists = new HashMap<String, LinkedList>();
	static Map<Object, Thread> slowThreads = new HashMap<Object, Thread>();
	static List<PCons<Class, Class>> classToClassRegistry = new ArrayList<PCons<Class, Class>>();

	// ==== Instance variables ==========
	public static BrowsePanel browserPanel;
	final public static NamedObjectCollection uiObjects = new BoxedCollectionImpl("All UI Objects", null);
	public static NamedObjectCollection clipboardCollection = new BoxedCollectionImpl("Clipboard", null);
	@UISalient(ResultIsSingleton = true)
	//
	private static Collection<TriggerAdder> triggerAdders = new LinkedList<TriggerAdder>();

	static ArrayList<Trigger> appMenuGlobalTriggers0 = new ArrayList<Trigger>();
	static ArrayList<TriggerForClass> objectContextMenuTriggers0 = new ArrayList<TriggerForClass>();
	static public Set<Object> featureQueueUp = new HashSet<Object>();
	final static public Object featureQueueLock = new Object();

	public static JMenu toolsMenu;
	public static JMenu lastResultsMenu;
	public static ThreadLocal<Boolean> disableOptionalArgs = new ThreadLocal<Boolean>() {
		protected Boolean initialValue() {
			return false;
		};
	};
	public static ThreadLocal<Boolean> canMakeInstanceTriggers = new ThreadLocal<Boolean>() {
		protected Boolean initialValue() {
			return false;
		};
	};

	public static Object getOptionalArg(Class type, short optionalArgSpecs, boolean onlyFirstGroup) throws NoSuchConversionException {
		NoSuchConversionException nsce = null;
		Boolean was = disableOptionalArgs.get() == Boolean.TRUE;
		if (was) {
			return null;
		}
		if (type.isArray()) {
			Object fnd;
			try {
				fnd = getOptionalArgSingle(type, optionalArgSpecs, onlyFirstGroup);
				if (type.isInstance(fnd))
					return fnd;
			} catch (NoSuchConversionException e) {
				nsce = e;
			}
			try {
				Class componentType = type.getComponentType();
				Collection c = getOptionalArgCollection(componentType, optionalArgSpecs, onlyFirstGroup);
				if (c.size() == 0)
					noSuchConversion(componentType, type, nsce);
				return c.toArray((Object[]) Array.newInstance(componentType, c.size()));
			} catch (NoSuchConversionException e) {
				throw e;
			}
		} else if (isCollection(type)) {
			Object fnd;
			try {
				fnd = getOptionalArgSingle(type, optionalArgSpecs, onlyFirstGroup);
				if (type.isInstance(fnd))
					return fnd;
			} catch (NoSuchConversionException e) {
				nsce = e;
			}
			try {
				Class componentType = getComponentType(type);
				if (componentType == null)
					throw nsce;
				Collection c = getOptionalArgCollection(componentType, optionalArgSpecs, onlyFirstGroup);
				if (c.size() == 0)
					noSuchConversion(componentType, type, nsce);
				return c;
			} catch (NoSuchConversionException e) {
				throw e;
			}
		}
		return getOptionalArgSingle(type, optionalArgSpecs, onlyFirstGroup);
	}

	public static <T> T getOptionalArgSingle(Class<T> type, short optionalArgSpecs, boolean onlyFirstGroup) throws NoSuchConversionException {
		Collection c;
		c = getOptionalArgCandidates(type, optionalArgSpecs, onlyFirstGroup, true);
		if (c.size() == 1) {
			return (T) firstItem(c);
		}
		return noSuchConversion(OptionalArg.class, type, null);
	}

	public static Collection getOptionalArgCollection(Class type, short optionalArgSpecs, boolean onlyFirstGroup) throws NoSuchConversionException {
		Collection c;
		c = getOptionalArgCandidates(type, optionalArgSpecs, onlyFirstGroup, false);
		if (c.size() > 0) {
			return (c);
		}
		// noSuchConversion throws NoSuchConversionException or returns 'null' so it's castable to collection
		return (Collection) noSuchConversion(OptionalArg.class, type, null);
	}

	private static boolean isCollection(Class type) {
		return Iterable.class.isAssignableFrom(type) || type.isArray();
	}

	public static Collection getOptionalArgCandidates(Class type, short optionalArgSpecs,
			boolean returnOnFirstLargerThanZero, boolean returnIfExactlyOneItem) {
		Boolean was = disableOptionalArgs.get() == Boolean.TRUE;
		if (was)
			return EMPTY_COLLECTION;

		Collection total = new ArrayList<Object>();
		if ((optionalArgSpecs & OptionalArg.OPTIONAL_FROM_CLIPBOARD) != 0) {
			Collection c = getClipboard().findObjectsByType(type);
			if (c.size() == 1 && returnIfExactlyOneItem) {
				return (c);
			}
			if (c.size() > 0) {
				if (returnOnFirstLargerThanZero)
					return c;
				total.addAll(c);
			}
		}

		if ((optionalArgSpecs & OptionalArg.OPTIONAL_FROM_RESULTS) != 0) {
			synchronized (lastResults) {
				Object o = lastResults.get(type);
				if (o != null && returnOnFirstLargerThanZero)
					return Collections.singleton(o);
				if (lastResults.containsKey(type) && returnOnFirstLargerThanZero) {
					return EMPTY_COLLECTION;
				}
			}
		}
		if ((optionalArgSpecs & OptionalArg.OPTIONAL_FROM_SINGLETON) != 0) {
			synchronized (singletons) {
				Callable<Object> o = singletons.get(type);
				if (o != null && returnOnFirstLargerThanZero) {
					try {
						Object r = o.call();
						return Collections.singleton(r);
					} catch (Exception e) {
						printStackTrace(e);
					}
				}
				if (lastResults.containsKey(type) && returnOnFirstLargerThanZero) {
					return EMPTY_COLLECTION;
				}
			}
		}
		if ((optionalArgSpecs & OptionalArg.OPTIONAL_FROM_EVERYYWHERE) != 0) {
			synchronized (singletons) {
				Object r = getSingleton(type);
				if (r != null)
					return Collections.singleton(r);
			}
		}

		if ((optionalArgSpecs & OptionalArg.OPTIONAL_FROM_LOADED) != 0) {
			Collection c = getTreeBoxCollection().findObjectsByType(type);
			if (c.size() == 1 && returnIfExactlyOneItem) {
				return (c);
			}
			if (c.size() > 0) {
				if (returnOnFirstLargerThanZero)
					return c;
				total.addAll(c);
			}
		}
		if (returnIfExactlyOneItem) {
			Collection c = total;
			if (c.size() == 1) {
				return (c);
			}
			//return noSuchConversion(OptionalArg.class, type, null);
		}
		if (total.size() > 0)
			return total;
		return EMPTY_COLLECTION;
	}

	private static Object firstItem(Collection c) {
		if (c == null)
			return null;
		for (Object o : c)
			return o;
		return null;
	}

	public static void addSingletonDefault(Object object) {
		Boolean was = canMakeInstanceTriggers.get();
		try {
			canMakeInstanceTriggers.set(true);
			addClassTemplateTriggers(object, null, true);
		} finally {
			canMakeInstanceTriggers.set(was);
		}
	}

	private static HashSet<java.lang.reflect.AnnotatedElement> loadedClassMethods = new HashSet<java.lang.reflect.AnnotatedElement>(1000);

	public static void addClassMethods(Class cls) {
		if (cls == null)
			return;
		synchronized (featureQueueLock) {
			synchronized (loadedClassMethods) {
				if (loadedClassMethods.contains(cls))
					return;
			}
			Boolean was = canMakeInstanceTriggers.get();
			try {
				canMakeInstanceTriggers.set(false);
				addClassTemplateTriggers(null, cls, false);
				for (Class ifc : cls.getInterfaces()) {
					addClassMethods(ifc);
				}
			} finally {
				canMakeInstanceTriggers.set(was);
			}
		}
	}

	public static void addClassTemplateTriggers(Object object, Class cls, boolean reallySingleton) {
		if (cls == null) {
			if (object == null)
				return;
			cls = object.getClass();
		}
		Boolean was = disableOptionalArgs.get();
		try {
			disableOptionalArgs.set(true);
			addClassTemplateTriggers0(object, cls, reallySingleton);
		} finally {
			disableOptionalArgs.set(was);
		}
	}

	private static void addClassTemplateTriggers0(Object object, Class cls, boolean reallySingleton) {

		if (object != null && cls != null) {
			addLastResultType(object, cls);
		}
		if (cls.isArray()) {
			addClassMethods(cls.getComponentType());
			return;
		}
		if (cls.isAnonymousClass()) {
			Class dc = cls.getDeclaringClass();
			if (dc != null && dc != cls) {
				addClassMethods(dc);
			}
		}
		boolean autoLoad = false;
		/// load autoloads
		if (Autoload.class.isAssignableFrom(cls)) {
			try {
				autoLoad = true;
				///Class.forName(cls.getName(), true, null);
			} catch (Throwable e) {
				printStackTrace(e);
			}
		}
		/// instance singletons
		if ((Singleton.class.isAssignableFrom(cls) && !cls.isInterface()) || reallySingleton) {
			object = makeSingleton(object, cls);
			reallySingleton = true;
			setSingletonValue(cls, object);
		} else {
			object = null;
		}

		if (ObjectPanel.class.isAssignableFrom(cls)) {
			if (ReflectUtils.isCreatable(cls)) {
				Constructor cons;
				try {
					cons = cls.getDeclaredConstructor();
					cons.setAccessible(true);
				} catch (Throwable e) {
					e.printStackTrace();
					Debuggable.warn("" + e);
				}
			}
		}

		List<Trigger> appMenuGlobalTriggers = new ArrayList<Trigger>();
		List<Trigger> objectContextMenuTriggers = new ArrayList<Trigger>();

		DisplayContext ctx = null;
		while (cls != null) {
			if (cls == Object.class) {
				break;
			}

			if (implementsAllClasses(cls, ObjectPanel.class, Component.class)) {
				if (isCreatable(cls)) {
					try {
						Class panelFor = getTypeClass(cls.getMethod("getClassOfBox").getGenericReturnType(), Class.class);
						if (panelFor != null && panelFor != Class.class) {
							registerPanel(cls, panelFor);
						}
					} catch (SecurityException e) {
					} catch (NoSuchMethodException e) {
					}

				}
			}

			synchronized (loadedClassMethods) {
				if (!loadedClassMethods.add(cls)) {
					break;
				}
			}
			if (isSystemPrimitive(cls)) {
				if (!reallySingleton) {
					trace("Skipping methods found in " + cls);
					break;
				}
			}

			for (Method m : ReflectUtils.getAllMethods(cls, false)) {

				if (!loadedClassMethods.add(m)) {
					continue;
				}

				if (isSynthetic(m))
					continue;

				addMethod(m, cls, object, objectContextMenuTriggers, appMenuGlobalTriggers, ctx);
			}

			for (Field m : cls.getDeclaredFields()) {

				if (!loadedClassMethods.add(m)) {
					continue;
				}

				if (isSynthetic(m))
					continue;

				addField(m, cls, object, objectContextMenuTriggers, appMenuGlobalTriggers, ctx);

			}
			cls = cls.getSuperclass();
		}

		int ps1 = 0;
		int ps2 = 0;

		if (appMenuGlobalTriggers.size() > 0) {
			synchronized (appMenuGlobalTriggers0) {
				ps1 = appMenuGlobalTriggers0.size();
				addAllNew(appMenuGlobalTriggers0, appMenuGlobalTriggers);
				ps2 = appMenuGlobalTriggers0.size();
			}
			if (ps1 != ps2)
				updateToolsMenu();
		}
		if (objectContextMenuTriggers.size() > 0) {
			synchronized (objectContextMenuTriggers0) {
				addAllNew(objectContextMenuTriggers0, objectContextMenuTriggers);
			}
		}
	}

	private static void addField(Field m, Class cls, Object object, List objectContextMenuTriggers, List appMenuGlobalTriggers, DisplayContext ctx) {

		m.setAccessible(true);

		boolean isStatic = isStatic(m);

		Class mustBe = cls;
		Object wrap = object;
		boolean canBeGlobal = true;
		if (isStatic) {
			wrap = null;
		} else {
			if (object == null) {
				// cant be registered globally
				canBeGlobal = false;
			}
		}
		Class returnType = nonPrimitiveTypeFor(m.getType());
		boolean isForCheckbox = returnType == Boolean.class;
		if (canBeGlobal) {
			UISalient cmi = getAnnotationOn(m, UISalient.class);
			if (cmi != null && cmi.ResultIsSingleton()) {
				final Object raw0 = wrap;
				final Field m0 = m;
				singletons.put(returnType, new java.util.concurrent.Callable() {
					@Override public Object call() throws Exception {
						return m0.get(raw0);
					}
				});
			}
		}
		if (isForCheckbox && canBeGlobal) {
			TriggerMenuFactory.addMethodAsTrig(false, ctx, cls, m, appMenuGlobalTriggers, wrap, ADD_ALL, "%d|%m", isStatic, true);
		}
		if (!isStatic) {
			TriggerMenuFactory.addMethodAsTrig(true, ctx, cls, m, objectContextMenuTriggers, null, ADD_ALL, "%c|%m", isStatic, true);
		}

	}

	private static void addMethod(Method m, Class cls, Object object, List objectContextMenuTriggers, List appMenuGlobalTriggers, DisplayContext ctx) {
		m.setAccessible(true);

		boolean isStatic = isStatic(m);

		Class mustBe = cls;
		final Object wrap = isStatic ? null : object;

		int plen = m.getParameterTypes().length;

		// rlen = how many objects required to call a method
		int totalLen = plen;
		int missingLen = totalLen;

		if (!isStatic) {
			totalLen++;
			missingLen++;
			if (wrap != null) {
				missingLen--;
			}
		} else {
			if (totalLen > 0) {
				mustBe = m.getParameterTypes()[0];
			}
			if (object != null) {
				missingLen--;
			}
		}

		Class returnType = m.getReturnType();

		/// load ConverterMethods
		if (returnType != void.class) {
			ConverterMethod cmi = getAnnotationOn(m, ConverterMethod.class);
			if (cmi != null) {
				registerConverterMethod(m, cmi);
				// maybe loop here?
			} else {
				String mname = m.getName();
				if (mname.contains("_")) {
					mname = properCase(mname);
				}
				if (!mname.equals("toString")) {
					String returnName = properCase(getCanonicalSimpleName(returnType));
					mname = mname.replace(returnName, "^");
					if ("to^".equals(mname) || "coerce".equals(mname)//
							|| (mname.startsWith("coerce") && missingLen == 1)//
							|| "as^".equals(mname) //
							|| "getAs^".equals(mname) //
							|| "convertTo^".equals(mname) //
							|| "coerce^".equals(mname) //
							|| "from^".equals(mname)) {
						//warn("Registering converter: " + m);
						registerConverterMethod(m, cmi);
					}

				}
			}
		}

		UISalient cmi = getAnnotationOn(m, UISalient.class);

		if (cmi != null) {
			if (cmi.IsFactoryMethod()) {
				TriggerMenuFactory.addMethodAsTrig(false, ctx, cls, m, appMenuGlobalTriggers, null, ADD_ALL, "%m", true, false);
			}
		}

		if (totalLen == 0 && missingLen == 0) {
			TriggerMenuFactory.addMethodAsTrig(false, ctx, cls, m, appMenuGlobalTriggers, null, ADD_ALL, "%d|%m", true, false);
			return;
		}

		if (missingLen == 0) {
			if (cmi != null && cmi.ResultIsSingleton()) {
				final Object raw0 = wrap;
				final Method m0 = m;
				singletons.put(returnType, new java.util.concurrent.Callable() {
					@Override public Object call() throws Exception {
						return invokeFromUI(raw0, m0, OptionalArg.OPTIONAL_FROM_DEFAULTS);
					}
				});
			}
		}
		if (totalLen == 1 && missingLen == 0) {
			if (wrap == null) {
				// gotten below
				// addMethodAsTrig(true, ctx, cls, m, objectContextMenuTriggers, wrap, ADD_ALL, "%c|%m", isStatic, false);
			} else {
				addMethodAsTrig(false, ctx, cls, m, appMenuGlobalTriggers, wrap, ADD_ALL, "%d|%m", isStatic, false);
			}
		}

		if (Component.class.isAssignableFrom(returnType)) {
			if (totalLen == 1) {
				// might be a panel method
				TriggerMenuFactory.addMethodAsTrig(true, ctx, cls, m, objectContextMenuTriggers, null, ADD_ALL, "%c|%m", isStatic, false);
				return;
			}
		}
		TriggerMenuFactory.addMethodAsTrig(true, ctx, cls, m, objectContextMenuTriggers, null, ADD_ALL, "%c|%m", isStatic, false);
	}

	public static <V extends Object> void setSingletonValue(Class cls, V object) {
		final V singleTon = object;
		synchronized (singletons) {
			singletons.put(cls, new Callable<Object>() {
				@Override public V call() throws Exception {
					return singleTon;
				}
			});
		}
	}

	public static <V extends Object> void setFactory(Class<V> cls, Callable function) {
		synchronized (factories) {
			factories.put(cls, function);
		}
	}

	private static Object makeSingleton(Object object, Class cls) {
		if (object != null)
			return object;
		try {
			Collection objs = getOptionalArgCandidates(cls, OptionalArg.OPTIONAL_FROM_EVERYYWHERE, true, true);
			if (objs.size() == 0) {
				object = getSingleton(cls);
				if (object != null)
					return object;
				Constructor constructor = cls.getDeclaredConstructor();
				constructor.setAccessible(true);
				object = constructor.newInstance();
				setSingleton(cls,object);
			} else {
				object = firstItem(objs);
			}
		} catch (Throwable e) {
			printStackTrace(e);
		} finally {
		}
		return object;
	}

	public static boolean isSystemPrimitive(Class cls) {
		return isSystemPrimitive(cls, false);
	}

	public static boolean isSystemPrimitive(Class cls, boolean includeClass) {
		if (cls == null)
			return true;
		if (cls.isPrimitive())
			return true;
		if (CharSequence.class.isAssignableFrom(cls))
			return true;
		if (Iterator.class.isAssignableFrom(cls))
			return true;
		if (Number.class.isAssignableFrom(cls))
			return true;
		if (Boolean.class.isAssignableFrom(cls))
			return true;
		if (includeClass && java.lang.Class.class.isAssignableFrom(cls))
			return true;
		if (includeClass && java.lang.reflect.Type.class.isAssignableFrom(cls))
			return true;
		Package pk = cls.getPackage();
		if (pk != null) {
			String pkn = pk.getName();
			if (Comparable.class.isAssignableFrom(cls) && pkn.startsWith("java.lang."))
				return true;

			if (pkn.startsWith("java.awt."))
				return true;
			if (pkn.startsWith("sun."))
				return true;
			if (pkn.startsWith("com.sun."))
				return true;
			if (pkn.startsWith("javax.swing."))
				return true;

		}
		return false;
	}

	public static void updateToolsMenu() {
		final List<Trigger> appMenuGlobalTriggers = getAppMenuGlobalMethods();
		if (toolsMenu == null)
			return;
		Utility.invokeLater(new Runnable() {
			@Override public void run() {
				toolsMenu.removeAll();
				Boolean was = disableOptionalArgs.get();
				try {
					disableOptionalArgs.set(true);
					TriggerMenuFactory.sortTriggers(appMenuGlobalTriggers);
					for (Trigger tfi : appMenuGlobalTriggers) {
						addTriggerToPoppup(toolsMenu, null, tfi);
					}
				} finally {
					disableOptionalArgs.set(was);
				}
			}
		});
	}

	public static void updateLastResultsMenu() {
		if (lastResults == null || lastResultsMenu == null)
			return;
		Utility.invokeLater(new Runnable() {
			@Override public void run() {
				synchronized (lastResultsMenu) {
					lastResultsMenu.removeAll();
				}

				Boolean was = disableOptionalArgs.get();
				try {
					disableOptionalArgs.set(true);
					TriggerMenuFactory.addMap(lastResults, lastResultsMenu);
				} finally {
					disableOptionalArgs.set(was);
				}
			}
		});

	}

	public static List<Trigger> getAppMenuGlobalMethods() {
		synchronized (appMenuGlobalTriggers0) {
			return new ArrayList<Trigger>(appMenuGlobalTriggers0);
		}
	}

	public static List<TriggerForClass> getObjectGlobalMethods() {
		synchronized (objectContextMenuTriggers0) {
			return new ArrayList<TriggerForClass>(objectContextMenuTriggers0);
		}
	}

	final public static ResourceToFromString RESOURCE_TO_FROM_STRING = new ResourceToFromString(null);
	static AssemblerCacheGrabber singletAssemblerCacheGrabber = new AssemblerCacheGrabber();
	private static Map<Class, ToFromKeyConverter> toFrmKeyCnv = null;
	private static Set<Class> singletonsClasses = new HashSet<Class>();
	static {
		addObjectFeatures(singletAssemblerCacheGrabber);
		JenaLiteralUtils.addIdListener(new IdentToObjectListener() {

			@Override public void registerURI(Ident id, Object value) {
				recordCreated(uiObjects, id, value);
			}

			@Override public void deregisterURI(Ident id, Object value) {
				recordCreated(uiObjects, id, null);
			}

		});
		addClassMethods(UtilityMenuOptions.class);
		addClassMethods(Utility.class);
		registerConverter(new UtilityConverter());
		Utility.toFrmKeyCnv = getKeyConvMap(String.class, true);

		toFrmKeyCnv.put(Ident.class, new ToFromKeyConverterImpl<Ident, String>(Ident.class, String.class) {

			@Override public String toKey(Ident toBecomeAString) {
				return toBecomeAString.getAbsUriString();
			}

			@Override public Ident fromKey(String title, Class further) {
				return new FreeIdent(title);
			}
		});

		addJenaResourceClass(JenaResourceItem.class);
		addJenaResourceClass(FreeIdent.class);

		addJenaResourceClass(Resource.class);
		addJenaResourceClass(FrontsNode.class);
		addJenaResourceClass(Literal.class);
		addJenaResourceClass(RDFNode.class);
		addJenaResourceClass(Node.class);
		//addJenaResourceClass(KnownComponent.class, RESOURCE_TO_FROM_STRING);
	}

	private static void addJenaResourceClass(Class cls) {
		toFrmKeyCnv.put(cls, RESOURCE_TO_FROM_STRING);
	}

	private static Map<Class, ToFromKeyConverter> getKeyConvMap(Class keyType, boolean createIfMissing) {
		return getKeyConvMap(toFrmKeyCnvMap, !createIfMissing ? null : new Callable() {
			@Override public Object call() throws Exception {
				return new HashMap<Class, ToFromKeyConverter>();
			}
		}, keyType);

	}

	private static <T> T getKeyConvMap(Map<Class, T> toFrmKeyCnvMap, Callable<T> whenMissing, Class keyType) {
		if (keyType == null || keyType == Object.class) {
			bug("key class = " + keyType);
		}
		synchronized (toFrmKeyCnvMap) {
			T toFrmKeyCnv = toFrmKeyCnvMap.get(keyType);
			if (toFrmKeyCnv != null)
				return toFrmKeyCnv;
			for (Class key : toFrmKeyCnvMap.keySet()) {
				if (key.isAssignableFrom(keyType)) {
					toFrmKeyCnv = toFrmKeyCnvMap.get(keyType);
					if (toFrmKeyCnv != null)
						return toFrmKeyCnv;
				}
			}
			if (toFrmKeyCnv == null && whenMissing != null) {
				try {
					toFrmKeyCnv = whenMissing.call();
					toFrmKeyCnvMap.put(keyType, toFrmKeyCnv);
					return toFrmKeyCnv;
				} catch (Throwable e) {

				}
			}

			return toFrmKeyCnv;
		}
	}

	private static boolean isSingletonClass(Class cls) {
		if (cls == null)
			return false;
		if( Singleton.class.isAssignableFrom(cls)) return true;
		for (Class class1: cls.getInterfaces()) {
			if(class1.getName().endsWith("Singleton")) return true;
		}

		if(cls.getName().endsWith("Singleton")) return true;
		for (Class class1: singletonsClasses) {
			if(class1.isAssignableFrom(cls)) return true;
		}
		return false;
	}

	public static void addObjectToValues(Object obj) {
		if (obj == null)
			return;
		Class oc = obj.getClass();
		addObjectFeatures(obj);
		if (!(obj instanceof UtilClass)) {
			uiObjects.findOrCreateBox(obj);
		}
	}

	public static void addObjectFeatures(Object obj) {
		if (obj == null)
			return;

		Class oc = obj.getClass();

		if (obj instanceof Singleton || isSingletonClass(oc)) {
			addSingletonDefault(obj);
			return;
		}
		if (obj instanceof Class) {
			addClassMethods((Class) obj);
			return;
		}

		if (!(obj instanceof UtilClass)) {
			return;
		}

		synchronized (featureQueueLock) {
			if (featureQueueUp != null) {
				featureQueueUp.add(oc);
				return;
			}
		}
		addClassMethods(oc);
	}

	public static DisplayContextUIImpl controlApp;
	public static BoxPanelSwitchableView theBoxPanelDisplayContext;
	//public static NamedItemChooserPanel clipBoardPanel;
	public static CollectionEditorUtil clipBoardUtil;
	public static DisplayContext selectedDisplaySontext;

	public LinkedList getBoxListFrom(Object key) {
		String strkey = key.toString();
		synchronized (displayLists) {
			LinkedList lst = displayLists.get(strkey);
			if (lst == null)
				lst = new LinkedList();
			displayLists.put(strkey, lst);
			return lst;
		}
	}

	static public Object getCachedComponent(Ident id) {
		NamedObjectCollection noc = getTreeBoxCollection();
		if (noc == null) {
			warn("NULL namedObjectCollection");
		}
		return noc.findBoxByName(id.toString());
	}

	static public void recordCreated(NamedObjectCollection noc, Ident id, Object comp) {
		//BoxPanelSwitchableView boxPanelDisplayContext = getBoxPanelTabPane();
		try {
			if (id != null)
				recordCreated(noc.findOrCreateBox(getDefaultName(id, true, true), comp));
		} catch (PropertyVetoException e) {
			printStackTrace(e);
			throw reThrowable(e);
		}
	}

	// public static FileMenu fileMenu = new FileMenu();
	public static JMenuBar appMenuBar0;
	//public static FileMenu fileMenu;
	public static JFrame appFrame;

	public static JFrame getAppFrame() {
		if (appFrame == null) {
			if (appMenuBar0 != null) {
				appFrame = (JFrame) appMenuBar0.getTopLevelAncestor();
			}
		}
		return (JFrame) appFrame;
	}

	public static JMenuBar getMenuBar() {
		if (appMenuBar0 == null) {
			if (appFrame != null) {
				appMenuBar0 = appFrame.getJMenuBar();
			}
			if (appMenuBar0 == null) {
				appMenuBar0 = new JMenuBar();
			}
		}
		if (appFrame != null && appFrame.getJMenuBar() != appMenuBar0) {
			appFrame.setJMenuBar(appMenuBar0);
		}
		return appMenuBar0;
	}

	public static BoxPanelSwitchableView getBoxPanelTabPane() {
		if (theBoxPanelDisplayContext == null) {
			warn("NULL theBoxPanelDisplayContext");
		}
		return theBoxPanelDisplayContext;
	}

	/**
	 * The current ObjectNavigator being displayed
	 */
	static public NamedObjectCollection getTreeBoxCollection() {
		if (uiObjects == null) {
			warn("NULL uiObjects");
		}
		return uiObjects;
	}

	/**
	 * The current ObjectNavigator being displayed
	 */
	static public NamedObjectCollection getTreeBoxCollection(Class filter) {
		if (uiObjects == null) {
			warn("NULL uiObjects");
		}
		return uiObjects;
	}

	public static BrowsePanel getCurrentPOJOApp() {
		if (browserPanel == null) {
			warn("NULL browserPanel");
		}
		return browserPanel;
	}

	public static boolean ensureRunning() {
		if (browserPanel == null) {
			try {
				DemoBrowser.ensureRunning(true, new String[0]);
			} catch (Exception e) {
				error("ensureRunning() caught an exception", e);
			}
		}
		return true;
	}

	/**
	 * Returns the global objectsContext, or null if none has been set
	 */
	public static BrowserPanelGUI getCurrentContext() {
		if (controlApp == null) {
			warn("NULL controlApp");
		}
		return controlApp;
	}

	public static DisplayContext getDisplayContext() {
		if (selectedDisplaySontext != null)
			return selectedDisplaySontext;
		return getCurrentContext();
	}

	/*
	 * public static void setDisplayContext(BrowserPanelGUI browserPanelGUI) {
	 * notImplemented();
	 *
	 * }
	 */

	/**
	 * Sets the global objects context
	 */
	/*
	public static void setInstancesOfObjects(NamedObjectCollection newValue) {
		uiObjects = newValue;
	}*/

	/*
	 * public static void setDefaultContext(POJOCollectionWithSwizzler c) {
	 * context = c; }
	 *
	 * public static POJOCollectionWithSwizzler getDefaultContext() { return
	 * context; }
	 */
	// public static POJOApp objectsContext = null;

	/*
	 * public static POJOBox addObject(Object object, boolean showASAP) {
	 *
	 * if (object instanceof POJOBox) { return ((POJOBox) object); } try {
	 * BoxPanelSwitchableView boxPanelDisplayContext = getBoxPanelTabPane();
	 * return boxPanelDisplayContext.addObject(object, showASAP); } catch
	 * (Exception e) { error("addObject", object, e); throw
	 * reThrowable(e); } }
	 */

	@UIHidden
	static final  Utility utility = new Utility();
	private Utility() {
		addSingleton(this);
	}

	public static void registerEditors() {
		registerEditor(IntEditor.class, Integer.class, int.class);

		registerEditor(BooleanEditor.class, Boolean.class, boolean.class);

		registerEditor(ColorEditor.class, Color.class);
		registerEditor(ColorCellEditor.class, Color.class);

		registerEditor(DateEditor.class, Date.class);

		PropertyEditorManager.setEditorSearchPath(new String[] {});
		// ClassFinder.getClasses(PropertyEditor);

		registerTabsCreator(ClassCustomizer.class, Class.class);
		registerTabsCreator(CollectionCustomizer.class, Collection.class);
		registerTabsCreator(ThrowableCustomizer.class, Throwable.class);
		registerTabsCreator(ArrayContentsPanelTabFramer.class, Object[].class);
		registerTabsCreator(SpecificObjectCustomizers.class, Object.class);
		registerTabsCreator(BasicObjectCustomizer.class, Object.class);

		registerPanel(RepoManagerPanel.class, Repo.class);
		registerPanel(ArrayContentsPanel.class, Object[].class);
		registerCustomizer(ArrayContentsPanel.class, ReflectUtils.makeArrayType(ReflectUtils.makeAnyType()));
		//registerPanel(ObjectChoiceComboPanel.class, Class.class);
		registerPanel(ModelAsTurtleEditor.class, Model.class);
		registerPanel(ModelMatrixPanel.class, Model.class);

		//registerCustomizer(org.openide.nodes.IndexedCustomizer.class, List.class);
		registerCustomizer(org.appdapter.gui.editors.LargeObjectView.class, Object.class);
		registerCustomizer(org.appdapter.gui.editors.UseEditor.class, PropertyEditor.class);
		registerCustomizer(org.appdapter.gui.swing.CollectionContentsPanel.class, Collection.class);
		registerCustomizer(org.appdapter.gui.swing.CollectionContentsPanelUsingTable.class, Collection.class);
		registerCustomizer(org.appdapter.gui.swing.ConstructorsListPanel.class, Class.class);
		registerCustomizer(org.appdapter.gui.swing.LargeObjectChooser.class, POJOCollection.class);
		registerCustomizer(org.appdapter.gui.swing.PropertiesPanel.class, ReflectUtils.typeAnd(Object.class, ReflectUtils.typeNot(Object[].class)));
		registerCustomizer(org.appdapter.gui.table.MapContentsPanel.class, Map.class);

		registerEditor(RDFObjectReferenceEditor.class, Resource.class);
		registerEditor(EnumPropertyEditor.class, Enum.class);
		registerEditor(ObjectChoiceComboPanel.class, Object.class);
		registerEditor(PropertyValueControl.class, Object.class);

		/*	registerEditor(org.openide.explorer.propertysheet.PropUtils.DifferentValuesEditor.class, null);
			registerEditor(org.openide.explorer.propertysheet.PropUtils.ExDifferentValuesEditor.class, null);
			registerEditor(org.openide.explorer.propertysheet.PropUtils.NoPropertyEditorEditor.class, null);

			registerEditor(org.openide.loaders.SortModeEditor.class, org.openide.loaders.DataFolder.SortMode.class);*/
		/*registerEditor(org.openide.explorer.propertysheet.Boolean3WayEditor.class, null);
		registerEditor(org.openide.explorer.propertysheet.RendererFactory.ExceptionPropertyEditor.class, null);
		registerEditor(org.openide.explorer.propertysheet.EnumPropertyEditor.class, Enum.class);
		registerEditor(org.openide.explorer.propertysheet.IndexedPropertyEditor.class, Object[].class);
		registerEditor(org.apache.activemq.util.BooleanEditor.class, boolean.class);
		registerEditor(org.apache.activemq.util.ListEditor.class, List.class);
		registerEditor(org.apache.activemq.util.MemoryIntPropertyEditor.class, int.class);
		registerEditor(org.apache.activemq.util.MemoryPropertyEditor.class, long.class);
		registerEditor(org.apache.activemq.util.StringArrayEditor.class, String[].class);
		registerEditor(org.apache.taglibs.standard.lang.jstl.test.Bean2Editor.class, Bean2.class);*/

		/*
		registerEditor(sun.beans.editors.BoolEditor.class, boolean.class);
		registerEditor(sun.beans.editors.ByteEditor.class, byte.class);
		registerEditor(sun.beans.editors.ColorEditor.class, Color.class);
		registerEditor(sun.beans.editors.DoubleEditor.class, double.class);
		registerEditor(sun.beans.editors.FloatEditor.class, float.class);
		registerEditor(sun.beans.editors.FontEditor.class, Font.class);
		registerEditor(sun.beans.editors.IntEditor.class, int.class);
		registerEditor(sun.beans.editors.LongEditor.class, long.class);
		registerEditor(sun.beans.editors.ShortEditor.class, short.class);
		registerEditor(sun.beans.editors.StringEditor.class, String.class);
		*/
		// This next one is covered by PropertyValueControl.ObjectReferenceEditor
		// registerEditor(org.appdapter.gui.browse.PropertyDescriptorForField.ObjectFieldEditor.class, Object.class);
		registerEditor(NumberField.class, Number.class);
		registerEditor(org.appdapter.gui.editors.BooleanEditor.class, boolean.class);
		registerEditor(org.appdapter.gui.editors.ColorEditor.class, Color.class);
		registerEditor(org.appdapter.gui.editors.DateEditor.class, Date.class);
		registerEditor(org.appdapter.gui.editors.IntEditor.class, int.class);
		registerEditor(org.appdapter.gui.editors.StringEditor.class, String.class);
		registerEditor(org.appdapter.gui.swing.PropertyValueControl.class, Object.class);
	}

	private static void registerEditor(Class editor, Type... filter) {
		registerPairs(editor, filter);
	}

	public static void registerTabsCreator(Class<? extends AddTabFrames> class1, Class class2) {
		try {
			addTabFramers.add((AddTabFrames) newInstance(class1));
		} catch (Throwable e) {
			printStackTrace(e);
		}
	}

	private static void registerCustomizer(Class<? extends Customizer> customizer, Type... cls) {
		registerPairs(customizer, cls);
	}

	public static void registerPanel(Class<? extends ObjectPanel> customizer, Type... cls) {
		registerPairs(customizer, cls);
	}

	public static void registerPairs(Class customizer, Type[] cls) {
		for (Type c : cls) {
			registerPair(customizer, c);
		}
	}

	public static void registerPairs(Class customizer, Class[] cls) {
		for (Type c : cls) {
			registerPair(customizer, c);
		}
	}

	static {
		registerEditors();
	}

	public static void setBeanInfoSearchPath() {
		Introspector.setBeanInfoSearchPath(new String[] { AbstractCollectionBeanInfo.class.getPackage().getName() });
	}

	public static Object invokeFromUI(Object obj0, Method method, short optionalArgSpecs) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		return invokeOptional(obj0, method, new UtilityOptionalArgs(optionalArgSpecs));
	}

	static <T> Object recastUtilOnly(Object val, Class<T> objNeedsToBe, List maxCvt) throws NoSuchConversionException {
		//Object obj = val;
		if (val == null)
			return null;
		if (val instanceof Convertable) {
			Convertable cvt = (Convertable) val;
			if (cvt.canConvert(objNeedsToBe)) {
				return cvt.convertTo(objNeedsToBe);
			}
		}
		if (val instanceof IsReference) {
			Object obj2 = dref(val);
			if (obj2 != val && val != null) {
				return recastUtilOnly(obj2, objNeedsToBe, maxCvt);
			}
		}
		if (objNeedsToBe.isInstance(val)) {
			return (T) val;
		}
		if (val instanceof String) {
			Object obj = fromString((String) val, objNeedsToBe, maxCvt);
			if (objNeedsToBe.isInstance(obj)) {
				return objNeedsToBe.cast(obj);
			}
			if (obj != null && obj != val) {
				val = obj;
			}
			return ReflectUtils.noSuchConversion(val, objNeedsToBe, null);
		}

		/*if (val .getClass().getMethod("as"+objNeedsToBe, ) {
			return (T) fromString((String) val, objNeedsToBe, maxCvt);
		}*/
		Object obj = dref1(val, false);
		if (obj != val && obj != null) {
			Object obj2 = recastUtilOnly(obj, objNeedsToBe, maxCvt);
			if (obj2 != null) {
				if (objNeedsToBe.isInstance(obj2))
					return (T) obj2;
				return ReflectUtils.recastRU(obj2, objNeedsToBe, maxCvt);
			}
			return ReflectUtils.recastRU(obj, objNeedsToBe, maxCvt);
		}
		return ReflectUtils.noSuchConversion(val, objNeedsToBe, null);
	}

	public static HashSet<Type> toStringTypes = new HashSet();
	public static HashSet<Type> notToStringTypes = new HashSet();

	static public boolean isToStringType(Class type) {
		for (Type t : notToStringTypes) {
			if (ReflectUtils.isAssignableFrom(t, type))
				return false;
		}
		for (Type t : toStringTypes) {
			if (ReflectUtils.isAssignableFrom(t, type))
				return true;
		}
		if (DisplayType.TOSTRING == getDisplayType(type)) {
			toStringTypes.add(type);
			return true;
		}
		ToFromKeyConverter cvt = getToFromStringConverter(type);
		if (cvt != null && cvt != FROM_STRING_NOT_SPECIALIZED) {
			toStringTypes.add(type);
			return true;
		}
		if (ReflectUtils.roundTrips(String.class, type)) {
			toStringTypes.add(type);
			return true;
		}
		return false;
	}

	public static <T> T recast(Object obj, Class<T> objNeedsToBe) throws NoSuchConversionException {
		return recastUtilFirst(obj, objNeedsToBe);
	}

	public static <T> T recastCC(Object obj, Class<T> objNeedsToBe) throws ClassCastException {
		try {
			return (T) recastUtilFirst(obj, objNeedsToBe);
		} catch (NoSuchConversionException e) {
			throw new ClassCastException(e.getMessage());
		}
	}

	public static Object fromString(Object title, Class objNeedsToBe) throws NoSuchConversionException {
		List maxConverts = AggregateConverter.getMcvt(false);
		List was = new ArrayList(maxConverts);
		try {
			return fromString(title, objNeedsToBe, maxConverts);
		} finally {
			AggregateConverter.setMcvt(was);
		}
	}

	static Map<String, Object> stringToObjectCache = new HashMap();

	public static Object fromString(Object title, Class type, List maxCvt) throws NoSuchConversionException {
		if (title == null)
			return null;
		//List maxCvt = Converter.MCVT;
		Class keyClass = title.getClass();
		if (keyClass != String.class) {
			title = makeToString(title);
			return fromString(title, type, maxCvt);
		}

		String stitle = (String) title;
		stitle = Utility.unquote(stitle);
		if (stringToObjectCache != null) {
			synchronized (stringToObjectCache) {
				if (stringToObjectCache.containsKey(stitle)) {
					Object o = stringToObjectCache.get(stitle);
					if (type.isInstance(o))
						return o;
				}
			}
		}
		Convertable box = getTreeBoxCollection().findBoxByName(stitle);
		if (box != null) {
			if (box.canConvert(type))
				return box.convertTo(type);
		} else {
			//		bug(" trouble!? " + stitle);
		}
		NamedObjectCollection noc = getTreeBoxCollection();
		for (Object o : noc.findObjectsByName(stitle, type)) {
			if (type.isInstance(o))
				return o;
		}

		ToFromKeyConverter conv = getToFromKeyConverter(type, keyClass);
		if (conv != null) {
			Object o = null;
			try {
				o = conv.fromKey(title, type);
				if (type.isInstance(o))
					return o;
				return ReflectUtils.recastRU(o, type, maxCvt);
			} catch (Exception e) {
				if (o != null) {
					Object oo = ReflectUtils.recastRU(o, type, maxCvt);
					printStackTrace(e);
				}
			}
		}
		try {
			return convertUsingReflection(title, type);
		} catch (NoSuchConversionException nsc) {
			if (!isToStringType(type)) {
				warn("!isToStrType=", type);
			}
			throw nsc;
		}
	}

	static final String[] quotingPairs = new String[] { "\"\"", "''", "()" };

	public static String unquote(String stitle) {
		int l = stitle.length() - 1;
		if (l < 1)
			return stitle;
		for (String ch : quotingPairs) {
			if (ch.charAt(0) == stitle.charAt(0) && ch.charAt(1) == stitle.charAt(l))
				return stitle.substring(1, l);
		}

		return stitle;
	}

	public static RuntimeException reThrowable_UnusedNow(Throwable e) {
		if (true)
			return reThrowable(e);
		if (e instanceof InvocationTargetException)
			e = e.getCause();
		if (e instanceof RuntimeException)
			return (RuntimeException) e;
		if (e instanceof Error)
			throw (Error) e;
		return new RuntimeException(e);
	}

	public static BeanInfo getBeanInfo(Class c, final Object toBindTo) throws IntrospectionException {
		return getBeanInfo(c, false, toBindTo);
	}

	public static BeanInfo getBeanInfo(Class c, boolean onlythisClass, final Object toBindTo) throws IntrospectionException {
		return getBeanInfo(c, onlythisClass, null, ADD_ALL);
	}

	public static BeanInfo getBeanInfo(final Class c, boolean onlythisClass, final Object toBindTo, TriggerFilter includeFields) throws IntrospectionException {
		final BeanInfo bi = getBeanInfoNoF(c, onlythisClass);
		return new SimplePOJOInfo(c, null, bi, toBindTo);
	}

	public static BeanInfo getBeanInfoNoF(Class c, boolean onlythisClass) throws IntrospectionException {
		Class stopAtClass = null;// Object.class;// c.getSuperclass();
		if (onlythisClass) {
			stopAtClass = c.getSuperclass();
			if (stopAtClass == null && !c.isInterface()) {
				stopAtClass = Object.class;
			}
		}
		if (stopAtClass == c) {
			stopAtClass = null;
		}
		boolean wasInPing = isInClassLoadPing();
		try {
			inClassLoadingPing.set(Boolean.TRUE);
			BeanInfo bi = Introspector.getBeanInfo(c, stopAtClass);
			return bi;
		} catch (Throwable t) {
			printStackTrace(t);
			throw reThrowable(t, IntrospectionException.class);
		} finally {
			inClassLoadingPing.set(wasInPing);
		}
	}

	public static boolean isInClassLoadPing() {
		return Boolean.TRUE.equals(inClassLoadingPing.get());
	}

	public static void isInClassLoadPing(boolean now) {
		inClassLoadingPing.set(now);
	}

	public static BeanInfo getPOJOInfo(Class<? extends Object> c, int useAllBeaninfo) throws IntrospectionException {
		return Introspector.getBeanInfo(c, useAllBeaninfo);
	}

	public static String loadFile(File file) throws IOException {
		FileInputStream fileIn = new FileInputStream(file);
		ByteArrayOutputStream stringOut = new ByteArrayOutputStream();
		copyStream(fileIn, stringOut);
		fileIn.close();
		return new String(stringOut.toByteArray());
	}

	public static String loadURL(URL url) throws Exception {
		InputStream in = url.openStream();
		ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();

		copyStream(in, bytesOut);
		in.close();
		bytesOut.close();
		return new String(bytesOut.toByteArray());
	}

	public static void saveFile(File file, String contents) throws IOException {
		FileOutputStream fileOut = new FileOutputStream(file);
		PrintWriter writer = new PrintWriter(fileOut);
		writer.print(contents);
		writer.close();
	}

	public static void copyStream(InputStream from, OutputStream to) throws IOException {
		int i = from.read();
		while (i > -1) {
			to.write(i);
			i = from.read();
		}
	}

	public static boolean isEqual(Object newValue, Object stronglyType) {
		if (newValue == stronglyType)
			return true;
		if (newValue == null || null == stronglyType)
			return false;
		Class oldT = stronglyType.getClass();
		Class newT = newValue.getClass();
		if (newT != oldT && !oldT.isAssignableFrom(newT) && !newT.isAssignableFrom(oldT)) {
			bug("Show compare the same kinds of objects");
			return newValue.equals(stronglyType);
		}
		if (newValue.equals(stronglyType)) {
			return true;
		}
		return false;
	}

	/**
	 * Checks if the given object is null, or if toString().trim() == "".
	 */
	public static boolean isEmpty(Object o) {
		if (o == null) {
			return true;
		} else {
			return o.toString().trim().equals("");
		}
	}

	/**
	 * Moves the given window to the center of the screen
	 */
	public static void centerWindow(Window win) {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dim = win.getSize();
		win.setLocation((screen.width / 2) - (dim.width / 2), (screen.height / 2) - (dim.height / 2));
	}

	public static Dimension getConstrainedDimension(Dimension min, Dimension pref, Dimension max) {
		Dimension result = getMinDimension(max, getMaxDimension(min, pref));
		return result;
	}

	public static Dimension getMaxDimension(Dimension a, Dimension b) {
		return new Dimension(Math.max(a.width, b.width), Math.max(a.height, b.height));
	}

	public static Dimension getMinDimension(Dimension a, Dimension b) {
		return new Dimension(Math.min(a.width, b.width), Math.min(a.height, b.height));
	}

	public static String getShortClassName(Class c) {
		if (c.isArray()) {
			return getShortClassName(c.getComponentType()) + "Array";
		}
		return getCanonicalSimpleName(c);
	}

	public static String getSpecialClassName(Class c) {
		String str = getSpecialClassName0(c);
		try {
			BT bt = getTreeBoxCollection().findOrCreateBox(str, c);
			bt.addTitle(str);
			Object c2 = getTreeBoxCollection().findObjectByName(str);
			if (c2 != c) {
				bug("Not using SpecialClassName names ? " + c);
			}
		} catch (PropertyVetoException e) {
			printStackTrace(e);
		}
		return str;
	}

	public static String getSpecialClassName0(Class c) {
		if (c.isArray()) {
			return getSpecialClassName0(c.getComponentType()) + "Array";
		}
		if (c.isPrimitive()) {
			return getSpecialClassName0(nonPrimitiveTypeFor(c)) + "+Primitive";
		}
		String name = getCanonicalSimpleName(c, true);
		int i = name.indexOf(".");
		if (i == -1)
			return name;
		String[] sname = name.split("\\.");
		int last = sname.length - 1;
		String sep = c.isInterface() ? "+" : "-";
		if (i > 3 || last == 1) {
			return sname[0] + sep + sname[last];
		}
		for (int n = 0; n < last; n++) {
			String s = sname[n];
			if (s.length() > 3) {
				return s + sep + sname[last];
			}
		}
		return sname[1] + sep + sname[last];
	}

	/**
	 * Replace all occurences of 'a' in string 's' with 'b'
	 */
	public static String replace(String s, String a, String b) {

		int aLength = a.length();
		int bLength = b.length();
		StringBuffer buf = new StringBuffer(s);

		// how much length changes after each replacement
		int dif = b.length() - a.length();

		int len = s.length();
		int i = buf.toString().indexOf(a);
		int startFrom = 0;
		while (i != -1) {
			buf.replace(i, i + aLength, b);
			startFrom = i + bLength;
			i = buf.toString().indexOf(a, startFrom);
		}

		return buf.toString();
	}

	public static byte[] serialize(Object o) throws Exception {
		ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
		ObjectOutputStream objectOut = new ObjectOutputStream(bytesOut);
		objectOut.writeObject(o);
		objectOut.close();
		return bytesOut.toByteArray();
	}

	public static Object deserialize(byte[] bytes) throws Exception {
		ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
		ObjectInputStream objectIn = new ObjectInputStream(bytesIn);
		Object o = objectIn.readObject();
		objectIn.close();
		return o;
	}

	public static void addLastResultType(Object obj, Class expected) {
		if (obj == null)
			return;
		synchronized (lastResults) {
			if (expected != null) {
				lastResults.put(expected, obj);
			}
			Class tighter = obj.getClass();
			if (tighter != expected) {
				lastResults.put(tighter, obj);
			}
			SwingUtilities.invokeLater(new Runnable() {
				@Override public void run() {
					updateLastResultsMenu();
				}
			});
		}
	}

	public static void addSubResult(Object from, Object targetBox, ActionEvent evt, Object obj, Class expected) throws PropertyVetoException {
		if (expected == null && obj != null)
			expected = obj.getClass();
		addLastResultType(obj, expected);
		expected = nonPrimitiveTypeFor(expected);
		if (expected == Void.class)
			return;
		if (obj == null) {

		}
		if (obj == null && expected != null) {
			obj = "(" + expected.getName() + ")null";
			expected = String.class;
		}
		if (obj == null && expected == null) {
			obj = "No result from " + from;
			expected = String.class;
		}

		if (Number.class.isAssignableFrom(expected)) {
			expected = String.class;
			obj = "" + obj;
		}
		if (Enum.class.isAssignableFrom(expected)) {
			expected = String.class;
			obj = "" + obj;
		}
		if (Boolean.class.isAssignableFrom(expected)) {
			expected = String.class;
			obj = "" + obj;
		}
		if (expected == String.class) {
			try {
				browserPanel.showMessage("" + obj, expected);
				return;
			} catch (Exception e) {
				printStackTrace(e);
				return;
			}
		}
		// narrow type
		if (expected.isInstance(obj)) {
			expected = obj.getClass();
		}
		addNonStringSubResult(targetBox, obj, expected);
	}

	public static void addNonStringSubResult(Object whereFrom, Object obj, Class expected) throws PropertyVetoException {
		DisplayType dt = getDisplayType(expected);
		final DisplayType edt = dt;
		if (dt == DisplayType.TREE) {
			BT boxed = getTreeBoxCollection().findOrCreateBox(null, obj);
			BoxContext bc = asBoxed(whereFrom).getBoxContext();
			bc.contextualizeAndAttachChildBox((Box) whereFrom, (MutableBox) boxed);
			return;
		}
		GetSetObject pnl4 = getPanelFor(expected);
		if (pnl4 != null) {
			try {
				pnl4.setObject(obj);
			} catch (InvocationTargetException e) {
				error("" + pnl4, e);
			}
		}
		if (isToStringType(expected)) {
			info("result from " + whereFrom + " was " + obj);
			String toStr = makeToString(obj);
			getCurrentPOJOApp().showMessage(toStr, expected);
		}
		try {
			getCurrentContext().showScreenBox(obj);
		} catch (Exception e) {
			displayFallback(whereFrom, obj, dt);
		}
	}


	private static void displayFallback(Object whereFrom, Object obj, DisplayType dt) {
		BT boxed = getTreeBoxCollection().findOrCreateBox(obj);
		BoxContext bc = asBoxed(whereFrom).getBoxContext();
		JPanel pnl = boxed.getPropertiesPanel();
		if (dt == DisplayType.FRAME) {
			BoxPanelSwitchableView jtp = getBoxPanelTabPane();
			jtp.addComponent(pnl.getName(), pnl, DisplayType.FRAME);
			return;
		}
		BoxPanelSwitchableView jtp = getBoxPanelTabPane();
		jtp.addComponent(pnl.getName(), pnl, DisplayType.PANEL);
	}

	static Hashtable<Class, GetSetObject> panelsFor = new Hashtable<Class, GetSetObject>();

	private static GetSetObject getPanelFor(Class expected) {
		final Class expectedType = expected;
		GetSetObject gso = panelsFor.get(expected);
		if (gso != null)
			return gso;
		return null;
	}

	public static <T> Collection<Class<? extends T>> findImplmentingForMatch(Class<T> mustBe, Class forTarget) {
		boolean allowConversion = false;
		if (forTarget.isPrimitive()) {
			forTarget = ReflectUtils.nonPrimitiveTypeFor(forTarget);
		}
		synchronized (classToClassRegistry) {
			HashSet<Class<? extends T>> list = new HashSet<Class<? extends T>>();
			for (PCons<Class, Class> rl : classToClassRegistry) {
				Class l = rl.getLeft();
				if (!mustBe.isAssignableFrom(l))
					continue;
				Type r = rl.getRight();
				if (ReflectUtils.isAssignableFromMaybeConvert(r, forTarget, allowConversion)) {
					list.add(l);
				}
			}
			return list;
		}
	}

	public static boolean ensurePanelRegistered(Class mustBe) {
		synchronized (classToClassRegistry) {
			for (PCons<Class, Class> rl : classToClassRegistry) {
				Class l = rl.getLeft();
				if (mustBe == l)
					return true;
			}
			return false;

		}
	}

	private static <T> void registerPair(Class<T> mustBe, Type objClass) {
		if (objClass instanceof Class) {
			if (PropertyEditor.class.isAssignableFrom(mustBe)) {
				try {
					if (mustBe.getDeclaredConstructor() != null) {
						PropertyEditorManager.registerEditor((Class) objClass, mustBe);
					}
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (Exception e) {
				}
			}
		}
		synchronized (classToClassRegistry) {
			PCons pair = new PCons(mustBe, objClass);

			if (!classToClassRegistry.remove(pair))
				if(false)warn("registering pair " + pair.getLeft() + "->" + pair.getRight());
			classToClassRegistry.add(0, pair);
			if (panelClassesFromCached.size() > 0) {
				synchronized (panelClassesFromCached) {
					panelClassesFromCached.clear();
				}
			}
		}

	}

	private static Class makeCustomizerFromEditor(Class objClass) {
		Class pe = findEditorClass(objClass, usePropertyEditorManager, true, true);
		if (pe != null) {
			return UseEditor.class;
		}
		return null;
	}

	public static boolean getEditsObject(Object value, Class objClass, Class comp) {

		if (objClass == null)
			objClass = value.getClass();

		try {
			Method m = comp.getMethod("editsObject", Object.class);
			if (m != null)
				return m.invoke(null, value) == Boolean.TRUE;
		} catch (Throwable e) {
		}
		try {
			Method m = comp.getMethod("editsClass", Class.class);
			if (m != null)
				return m.invoke(null, objClass) == Boolean.TRUE;
		} catch (Throwable e) {
		}
		try {
			Field f = comp.getField("EDITTYPE");
			if (isStatic(f)) {
				Object os = f.get(null);
				if (typeMatches(os, value))
					return true;
			}
		} catch (Throwable e) {
		}

		Class itEdits = getEditsType(comp);
		if (itEdits != null) {
			if (isInstance(itEdits, value))
				return true;
		}
		return false;
	}

	private static boolean typeMatches(Object os, Object value) {
		if (os instanceof Type[]) {
			for (Type c : (Type[]) os) {
				if (typeMatches(c, value))
					return true;
			}
		} else if (os instanceof Class[]) {
			for (Type c : (Class[]) os) {
				if (typeMatches(c, value))
					return true;
			}
		} else if (os instanceof Class) {
			if (isInstance((Class) os, value))
				return true;
		} else if (os instanceof Type) {
			if (isInstance((Type) os, value))
				return true;
		}
		return false;
	}

	public static boolean isInstance(Type os, Object value) {
		return equalTypes(value.getClass(), os, true);
	}

	public static boolean isInstance(Class objNeedsToBe, Object value) {
		try {
			Object v = recastCC(value, objNeedsToBe);
			if (v != null) {
				if (objNeedsToBe.isInstance(v))
					return true;
				return true;
			}
		} catch (ClassCastException nsc) {
		}
		return false;
	}

	public static Class getEditsType(Class comp) {
		try {
			Field f = comp.getField("TYPE");
			if (isStatic(f))
				return (Class) f.get(null);
		} catch (SecurityException e) {
		} catch (NoSuchFieldException e) {
		} catch (IllegalArgumentException e) {
		} catch (IllegalAccessException e) {
		}
		try {
			Field f = comp.getField("EDITTYPE");
			if (isStatic(f)) {
				Object os = f.get(null);
				if (os instanceof Class) {
					return (Class) os;
				}
				if (os instanceof Class[]) {
					return ((Class[]) os)[0];
				}
			}
		} catch (SecurityException e) {
		} catch (NoSuchFieldException e) {
		} catch (IllegalArgumentException e) {
		} catch (IllegalAccessException e) {
		}
		try {
			Type gtype = comp.getMethod("getClassOfBox").getGenericReturnType();
			Class panelFor = getTypeClass(gtype, Class.class);
			if (panelFor != null)
				return panelFor;
		} catch (SecurityException e) {
		} catch (IllegalArgumentException e) {
		} catch (NoSuchMethodException e) {
		}
		String cn = comp.getCanonicalName();
		if (cn.endsWith("Editor")) {
			cn = cn.substring(0, cn.length() - 6);
			try {
				Class panelFor = Class.forName(cn);
				if (panelFor != null)
					return panelFor;
			} catch (ClassNotFoundException e) {
			} catch (LinkageError e) {
			}
		}
		java.beans.SimpleBeanInfo sbi = null;
		return null;
	}

	/**
	 * Locate a value editor for a given target type.
	 *
	 * @param targetType
	 *            The Class object for the type to be edited
	 * @return An editor object for the given target class. The result is null if no suitable editor can be found.
	 */
	public static PropertyEditor findEditor(Class targetType, boolean canUsePEMAnager, boolean mustSupportUI, boolean mustHaveZeroArgConstrutor, Type... otherRequirments) {

		PropertyEditor ped = null;
		for (Class<? extends PropertyEditor> pe : findImplmentingForMatch(PropertyEditor.class, targetType)) {
			if (pe == null || !PropertyEditor.class.isAssignableFrom(pe)) {
				continue;
			}
			if (!ReflectUtils.implementsAllClasses(pe, otherRequirments))
				continue;
			try {

				if (mustHaveZeroArgConstrutor) {
					if (pe.getDeclaredConstructor() == null)
						continue;
				}
				ped = pe.newInstance();
				if (mustSupportUI && !ped.supportsCustomEditor())
					continue;
				return ped;
			} catch (Throwable e) {
				continue;
			}
		}
		boolean wasInClassloaderPing = isInClassLoadPing();
		try {
			if (usePropertyEditorManager && canUsePEMAnager) {
				isInClassLoadPing(true);
				ped = PropertyEditorManager.findEditor(targetType);
				if (ped != null) {
					if (mustSupportUI && ped.supportsCustomEditor())
						return ped;
				}
			}
		} catch (Throwable e) {
			// PropertyEditorManager is a wild and untamed thing
		} finally {
			isInClassLoadPing(wasInClassloaderPing);
		}
		return null;
	}

	public static Class findEditorClass(Class targetType, boolean canUsePEMAnager, boolean mustSupportUI, boolean mustHaveZeroArgConstrutor, Type... otherRequirments) {
		PropertyEditor ped = null;
		for (Class<? extends PropertyEditor> pe : findImplmentingForMatch(PropertyEditor.class, targetType)) {
			if (pe == null || !PropertyEditor.class.isAssignableFrom(pe)) {
				continue;
			}
			if (!ReflectUtils.implementsAllClasses(pe, otherRequirments))
				continue;
			try {
				if (mustHaveZeroArgConstrutor) {
					if (pe.getDeclaredConstructor() == null)
						continue;
				}
				if (mustSupportUI && !GoodPropertyEditorSupport.class.isAssignableFrom(pe)) {
					ped = pe.newInstance();
					if (!ped.supportsCustomEditor())
						continue;
				}
				return pe;
			} catch (Throwable e) {
				continue;
			}
		}
		Class choosen = null;
		boolean wasInClassloaderPing = isInClassLoadPing();
		try {
			if (usePropertyEditorManager && canUsePEMAnager) {
				isInClassLoadPing(true);
				ped = PropertyEditorManager.findEditor(targetType);
				if (ped != null) {
					if (mustSupportUI && ped.supportsCustomEditor())
						choosen = ped.getClass();
					if (choosen != null) {
						if (!ReflectUtils.implementsAllClasses(choosen, otherRequirments)) {
							return null;
						}
						if (mustHaveZeroArgConstrutor) {
							if (choosen.getDeclaredConstructor() == null)
								return null;
						}
					}
				}
			}
		} catch (Throwable e) {
			// PropertyEditorManager is a wild and untamed thing
		} finally {
			isInClassLoadPing(wasInClassloaderPing);
		}
		return null;
	}

	public static Collection<Class> findPanelClasses(Class targetType) {
		synchronized (panelClassesFromCached) {
			Collection<Class> cc = (Collection<Class>) panelClassesFromCached.get(targetType);
			if (cc == null) {
				panelClassesFromCached.put(targetType, EMPTY_COLLECTION);
				cc = findPanelClassesFromCached(targetType);
				if (cc.size() == 0)
					warn("No Panel Classes For " + targetType);
				panelClassesFromCached.put(targetType, cc);
			}

			return cc;
		}
	}

	private static Collection<Class> findPanelClassesFromCached(Class targetType) {
		HashSet<Class> panelClass = new HashSet<Class>();
		PropertyEditor ped = null;
		addIfNew(panelClass, findImplmentingForMatch(PropertyEditor.class, targetType), false);
		addIfNew(panelClass, findImplmentingForMatch(Customizer.class, targetType), false);
		addIfNew(panelClass, findImplmentingForMatch(Component.class, targetType), false);
		addIfNew(panelClass, findImplmentingForMatch(Object.class, targetType), false);
		addIfNew(panelClass, makeCustomizerFromEditor(targetType), false);
		if (usePropertyEditorManager) {
			boolean wasInClassloaderPing = isInClassLoadPing();
			try {
				isInClassLoadPing(true);
				ped = PropertyEditorManager.findEditor(targetType);
				if (ped != null) {
					panelClass.add(ped.getClass());
				}
			} catch (Throwable e) {
				// PropertyEditorManager is a wild and untamed thing
			} finally {
				isInClassLoadPing(wasInClassloaderPing);
			}
		}
		if (panelClass.size() == 0) {
			return EMPTY_COLLECTION;
		}
		return panelClass;
	}

	public static List getSearchableClassList() {
		notImplemented();
		return PromiscuousClassUtilsA.getInstalledClasses();
	}

	public static <T> T newInstance(Class<T> customizerClass) throws InstantiationException, IllegalAccessException {
		for (Constructor cons : customizerClass.getDeclaredConstructors()) {
			if (cons.getParameterTypes().length == 0) {
				cons.setAccessible(true);

				try {
					return (T) cons.newInstance();
				} catch (Exception e) {
				}
			}
		}
		for (Constructor cons : customizerClass.getDeclaredConstructors()) {
			if (cons.getParameterTypes().length == 0) {
				cons.setAccessible(true);

				try {
					return (T) cons.newInstance();
				} catch (Exception e) {
				}
			}
		}
		T customizer = (T) customizerClass.newInstance();
		return customizer;
	}

	public static Action getConfigObject(String path, Class<Action> class1) {
		notImplemented();
		return null;
	}

	public static FileObject getConfigFile(String path) {
		notImplemented();
		notImplemented();
		return null;
	}

	public static HashMap<Object, Class> alreadySearching = new HashMap();

	public static class AlreadyLooking extends JPanel {
		public AlreadyLooking(Object o) {
			add(new JLabel("AlreadyLooking " + o));
		}
	}

	public static Hashtable<Object, JPanel> breadCrumbedObjectViews = new Hashtable<Object, JPanel>();
	public static PairTable<Object, Component> objectWindows = new PairTable();

	/**
	 * Return a JPAnel to edit obj
	 *
	 * @param object
	 * @return
	 */
	public static JPanel getPropertiesPanel(Object objectIn) {
		JPanel view = getLargeObjectView(objectIn);
		return view;
	}

	public static LargeObjectView getLargeObjectView(Object objectIn) {
		return (LargeObjectView) findOrCreateObjectView3(objectIn, LargeObjectView.class, LargeObjectView.class);
	}

	public static JPanel getCustomizerPanel2(Object objectIn, Class<? extends Customizer> customizerClass) {
		final Object object = drefO(objectIn);
		Map<Object, JPanel> myPanelMap = Utility.getPanelMap(object);
		synchronized (myPanelMap) {
			return findOrCreate1ObjectView(objectIn, null, customizerClass, object, myPanelMap);
		}
	}

	public static JPanel findOrCreateObjectView3(Object objectIn, Object key, Class customizerClass) {
		Object object = dref(objectIn);
		Map<Object, JPanel> myPanelMap = Utility.getPanelMap(object);
		synchronized (myPanelMap) {
			return findOrCreate1ObjectView(objectIn, key, customizerClass, object, myPanelMap);
		}
	}

	private static JPanel findOrCreate1ObjectView(Object objectIn, Object key, Class customizerClass, Object object, Map<Object, JPanel> myPanelMap) {
		ScreenBoxImpl bt = asScreenBoxImpl(objectIn);
		if (key == null) {
			key = bt.toKey(customizerClass);
		} else {
			key = bt.toKey(key);
		}
		JPanel view = myPanelMap.get(key);
		if (view != null && !(view instanceof AlreadyLooking)) {
			return view;
		}
		if (customizerClass == null) {
			Class objClass = object.getClass();
			customizerClass = (Class) bt.toKey(customizerClass);
			view = (JPanel) myPanelMap.get(customizerClass);
		}

		if (view instanceof AlreadyLooking) {
			warn("Looping while getting a panel for {} with {} ", objectIn, object);
			bug("Looping for " + objectIn);
			return null;
		} else if (view != null) {
			return view;
		}

		Customizer customizer;
		try {
			customizer = (Customizer) newInstance(customizerClass);
			if (!(customizer instanceof JPanel)) {
				warn("customizer is not a Component " + customizer);
			}

			customizer.setObject(object);
			view = (JPanel) customizer;

			myPanelMap.put(key, view);
			return view;
		} catch (Throwable e) {
			warn("customizer error: " + customizerClass, e);
			return null;
		}
	}

	public static boolean stringsEqual(String s1, String s2) {
		if (s1 == s2)
			return true;

		if (s1 == null || null == s2)
			return false;

		return s1.equalsIgnoreCase(s2);
	}

	public static Collection<BT> boxObjects(Iterable<Object> pojoCollectionObjects) {
		LinkedList<BT> objects = new LinkedList<BT>();
		for (Object pojo : pojoCollectionObjects) {
			objects.add(asWrapped(pojo));
		}
		return objects;
	}

	public static synchronized boolean recordCreated(Object box) {
		if (box instanceof BT) {
			return recordBCreated((BT) box);
		}
		synchronized (allBoxes) {
		if (allBoxes.containsKey(box))
			return false;
		allBoxes.put(box, null);
		}
		return true;
	}

	public static synchronized boolean recordBCreated(BT box) {
		synchronized (allBoxes) {
			if (allBoxes.containsKey(box))
				return false;
			allBoxes.put(box.getValue(), box);
			return true;
		}

	}

	@ConverterMethod public static BT asWrapped(Object pojo) {
		if (pojo instanceof BT)
			return (BT) pojo;
		if (pojo instanceof IGetBox)
			return ((IGetBox) pojo).getBox();
		return uiObjects.findOrCreateBox(pojo);
	}

	@ConverterMethod public static ScreenBoxImpl asScreenBoxImpl(Object pojo) {
		if (pojo instanceof ScreenBoxImpl)
			return (ScreenBoxImpl) pojo;
		if (pojo instanceof IGetBox)
			return asScreenBoxImpl(((IGetBox) pojo).getBox());
		synchronized (uiObjects) {
			return uiObjects.findOrCreateBox(pojo);
		}
	}

	public static BT asWrapped(String title, Object pojo) throws PropertyVetoException {
		if (pojo instanceof BT)
			return (BT) pojo;
		if (pojo instanceof IGetBox)
			return ((IGetBox) pojo).getBox();
		synchronized (uiObjects) {
			return uiObjects.findOrCreateBox(pojo);
		}
	}

	@ConverterMethod public static Box asBoxed(Object pojo) {
		if (pojo instanceof Box)
			return (Box) pojo;
		if (pojo instanceof IGetBox.NotWrapper)
			return ((IGetBox.NotWrapper) pojo).asBox();

		if (pojo instanceof IGetBox)
			return ((IGetBox) pojo).getBox();
		return asWrapped(pojo);
	}

	public static Collection<Object> unboxObjects(Iterable<? extends BT> pojoCollectionObjects) {
		LinkedList<Object> objects = new LinkedList<Object>();
		for (BT pojo : pojoCollectionObjects) {
			objects.add(unboxObject(pojo));
		}
		return objects;
	}

	private static Object unboxObject(BT pojo) {
		return pojo.getValue();
	}

	public static void showError(Object queryWorker, String msg, Throwable error) {
		DisplayContext dc = getDisplayContext();
		if (queryWorker instanceof DisplayContext) {
			dc = (DisplayContext) queryWorker;
		} else if (queryWorker instanceof GetDisplayContext) {
			dc = ((GetDisplayContext) queryWorker).getDisplayContext();
		}
		showError(dc, msg, error);
	}

	/*
	 * public static POJOBox addObject(Object obj) { return addObject(obj,
	 * false); }
	 */
	public static UserResult showError(final DisplayContext context, String msg, final Throwable error) {
		final UserResult[] res = new UserResult[1];
		if (msg == null)
			msg = error.getMessage();
		final String msg0 = msg;
		try {
			Utility.invokeAndWait(new Runnable() {
				@Override public void run() {
					try {
						if (context == null) {
							JPanel pnl = new org.appdapter.gui.swing.ErrorDialog(msg0, error);
							pnl.show();
							res[0] = asUserResult(pnl);
						} else {
							browserPanel.showScreenBox(error); // @temp
							res[0] = null;
						}
					} catch (Throwable err2) {
						ErrorDialog pnl = new ErrorDialog("A new error occurred while trying to display the original error '" + error + "'!", err2);
						pnl.show();
						res[0] = asUserResult(pnl);
					}
				}
			});
		} catch (Throwable e) {
		}

		return res[0];
	}

	/**
	 * Generates a default name for the given object, while will be something like "Button1", "Button2", etc.
	 *
	 * @param nameIndex
	 */
	public static String generateUniqueName(Object object, Map<String, BT> checkAgainst) {
		return generateUniqueName_sug(object, null, checkAgainst, false, true);
	}

	public static String generateUniqueNameWarnIfMissed(Object object, String suggestedName, Map<String, BT> checkAgainst) {
		String newName = generateUniqueName_sug(object, suggestedName, checkAgainst, false, true);
		if (suggestedName != null && !suggestedName.equals(newName)) {
			warn("did not get suggested name : " + suggestedName + " isntead got " + newName + " for " + object);
		}
		return newName;
	}

	public static String getUniqueNamePretty(Object object) {
		if (object == null)
			return "<null>";
		if (object instanceof BT) {
			return ((BT) object).getShortLabel();
		}
		NamedObjectCollection noc = getTreeBoxCollection();
		String un = getUniqueName(object, noc, false, true, false);
		BT box = noc.findOrCreateBox(object);
		box.addTitle(un);
		if (un.contains(" ") || un.contains("-") || un.contains("+"))
			return un;
		//bug("Not pretty string: " + un + " perhaps use " + makeTooltipText(object));
		return un;
	}

	public static boolean isTitled(String title) {
		return title != null && title != NamedObjectCollection.MISSING_COMPONENT && !title.equalsIgnoreCase("<null>") && title.length() > 0;
	}

	public static String getUniqueNameForKey(Object object) {
		if (object == null)
			return "<null>";
		return getUniqueNameForKey(object, null);
	}


	public static String getUniqueNameForKey(Object bean, NamedObjectCollection noc) {
		  boolean wasNoDebug = Main.isNoDebug();
		  try {

			  Main.setNoDebug(true);
			  return getUniqueNameForKey0(bean,noc);
		  } finally {
			  Main.setNoDebug(wasNoDebug);
		  }
	  }


	public static String getUniqueNameForKey0(Object object, NamedObjectCollection noc) {
		String title = getUniqueName(object, noc, true, false, true);
		if (isTitled(title))
			return title;
		bug("bad title " + title + " for " + object);
		return title;
	}

	public static String makeToString(Object object) {
		if (object == null) {
			//breakpoint();
			return "<nULL>";
		}
		Class cls = nonPrimitiveTypeFor(object.getClass());
		if (Number.class.isAssignableFrom(cls))
			return "" + object;
		ToFromKeyConverter<Object, String> conv = getToFromStringConverter(cls);
		if (conv != null) {
			String toKey = conv.toKey((Object) object);
			if (toKey != null || toKey.trim().length() > 0) {
				return toKey;
			} else {
				breakpoint();
				return "" + object;
			}
		}
		if (Enum.class.isAssignableFrom(cls))
			return "" + getSpecialClassName(cls) + "." + object;
		if (ReflectUtils.isPrimitiveBox(cls))
			return "" + object;

		breakpoint();
		return "" + object;
	}

	public static String getUniqueName(Object object, NamedObjectCollection noc, boolean mayCreate, boolean wantsPretty, boolean reReadable) {
		if (object == null)
			return "<null>";
		if(object instanceof CharSequence) {
			return object.toString();
		}
		String title = getUniqueName00(object, noc, mayCreate, wantsPretty, reReadable);
		if (reReadable) {
			// confirm re-readable
			Class objNeedsToBe = object.getClass();
			try {

				Object o2 = fromString(title, objNeedsToBe);
				if (o2 != null && o2.equals(object)) {
					return title;
				} else {
					bug("title " + title + " returns wrong object: " + o2);
				}
			} catch (NoSuchConversionException e) {
				//e.printStackTrace();
			}
		}
		return title;
	}

	private static String getUniqueName00(Object object, NamedObjectCollection noc, boolean mayCreate, boolean wantsPretty, boolean reReadable) {

		String title = hasDefaultName(object, wantsPretty, reReadable);
		BT newBox = null;
		if (noc == null) {
			noc = getTreeBoxCollection();
		}
		if (mayCreate) {
			newBox = noc.findOrCreateBox(object);
		} else {
			if (noc != uiObjects) {
				newBox = noc.findBoxByObject(object);
			}
		}
		if (newBox != null) {
			title = newBox.getShortLabel();
			if (isTitled(title))
				return title;
		} else {
			Map<String, BT> map = noc.getNameToBoxIndex();
			title = generateUniqueName_sug(object, null, map, wantsPretty, reReadable);
			if (isTitled(title)) {
				if (!mayCreate && reReadable) {
					return getUniqueName(object, noc, true, wantsPretty, reReadable);
				}
				if (wantsPretty && !reReadable) {
					return "" + object;
				}
				bug("awol title " + title + " for " + object);
				return title;//"'" + title + "'";
			}
		}
		bug("bad title " + title + " for " + object);
		return title;
	}

	public static String getDefaultName(Object object, boolean wantsPretty, boolean reReadable) {
		if (object == null) {
			return object.toString();
		}
		String title = hasDefaultName(object, wantsPretty, reReadable);
		if (title == null) {
			return object.getClass().getCanonicalName() + "@" + identityHashCode(object);
		}
		return title;
	}

	public static String generateUniqueName_sug(Object object, String suggestedName, Map<String, BT> checkAgainst, boolean wantsPretty, boolean reReadable) {
		if (object == null)
			return "<null>";
		if (object instanceof Class) {
			return getSpecialClassName0((Class) object);
		}
		if (object instanceof KnownComponent) {
			String str = ((KnownComponent) object).getShortLabel();
			if (str != null) {

				if (checkAgainst != null) {
					BT other = null;
					other = checkAgainst.get(str);
					if (other == null)
						return str;
					if (other.representsObject(object))
						return str;
					if (str != null)
						return str;
				}
				// conflict!
			}
		}

		if (checkAgainst == null) {
			if (suggestedName == null)
				return getDefaultName(object, wantsPretty, reReadable);
			return suggestedName + getDefaultName(object, wantsPretty, reReadable);
		}

		String className = suggestedName;
		String name;
		int counter = 1;
		if (className == null) {
			className = getShortClassName(object.getClass());
			name = className + counter;
		} else {
			name = suggestedName;
		}

		boolean done = false;

		while (!done) {
			Object otherPOJO = checkAgainst.get(name);
			if (otherPOJO == null) {
				done = true;
			} else {
				++counter;
				name = className + counter;
			}
		}
		return name;
	}

	public static int identityHashCode(Object object) {
		return System.identityHashCode(object);
	}

	private static void breakpoint() {
		bug("hit bp");
	}

	public static ToFromKeyConverter getToFromStringConverter(Class valueClazz) {
		if (valueClazz == null || valueClazz == Object.class)
			return FROM_STRING_NOT_SPECIALIZED;
		return getToFromKeyConverter(valueClazz, String.class);
	}

	static public <T, K> ToFromKeyConverter<T, K> getToFromKeyConverter(Class<T> valueClazz, Class<K> key) {
		if (key != String.class) {
			return null;
			//warn("to-from=", valueClazz, key);
		}
		Map<Class, ToFromKeyConverter> toFrmKeyCnv = getKeyConvMap(key, false);
		if (toFrmKeyCnv == null)
			return null;
		if (valueClazz == null || valueClazz == Object.class) {
			//warn("to-from=", valueClazz, key);
			return (ToFromKeyConverter<T, K>) FROM_STRING_NOT_SPECIALIZED;
		}
		synchronized (toFrmKeyCnv) {
			for (Class c : toFrmKeyCnv.keySet()) {
				if (valueClazz.isAssignableFrom(c)) {
					return toFrmKeyCnv.get(c);
				}
			}
		}
		return null;
	}

	public static String hasDefaultName(Object object, boolean wantsPretty, boolean reReadable) {
		if (object == null)
			return "<null>";

		Class type = object.getClass();

		if (type == Class.class) {
			String stitle = getSpecialClassName0(((Class) object));
			if (stringToObjectCache != null) {
				synchronized (stringToObjectCache) {
					if (!stringToObjectCache.containsKey(stitle)) {
						stringToObjectCache.put(stitle, object);
					}
				}
			}
		}

		String title;

		if (type == String.class)
			return quoteString((String) object, "\"");

		if (isToStringType(type)) {
			title = makeToString(object);
			if (isTitled(title)) {
				return title;
			}
		}

		if (object instanceof KnownComponent) {
			KnownComponent kc = (KnownComponent) object;
			Ident id = kc.getIdent();
			if (id != null) {
				Object f = JenaLiteralUtils.findComponent(id, object.getClass());
				if (f == object) {
					title = id.getLocalName();
					if (isTitled(title)) {
						return title;
					}
				}
				title = id.getAbsUriString();
				if (isTitled(title)) {
					return title;
				}
			}
		}

		if (object instanceof BT) {
			title = ((BT) object).getShortLabel();
			if (isTitled(title)) {
				return title;
			}
		}

		BT bt = uiObjects.findBoxByObject(object);
		if (bt != null) {
			title = bt.getShortLabel();
			if (isTitled(title)) {
				//if (!wantsPretty)
				return title;
				//bug("want pretty for " + object);
			}
		}

		Object object2 = dref1(object, false);
		if (object2 != null && object2 != object) {
			title = hasDefaultName(object2, wantsPretty, reReadable);
			if (isTitled(title)) {
				return title;
			}
		}

		return null;
	}

	public static String quoteString(String text, String quote) {
		return quote + (text.replace("\\", "\\\\").replace(quote, "\\" + quote)) + quote;
	}

	static public org.appdapter.gui.api.DisplayType getDisplayType(Class expected) {
		if (JPanel.class.isAssignableFrom(expected)) {
			return DisplayType.PANEL;
		}
		if (TreeNode.class.isAssignableFrom(expected)) {
			return DisplayType.TREE;
		}
		if (expected == Object.class) {
			return DisplayType.PANEL;
		}

		ToFromKeyConverter cvt = getToFromStringConverter(expected);
		if (cvt != null && cvt != FROM_STRING_NOT_SPECIALIZED) {
			return DisplayType.TOSTRING;
		}
		if (expected.isPrimitive()) {
			return DisplayType.TOSTRING;
		}
		if (Number.class.isAssignableFrom(expected)) {
			return DisplayType.TOSTRING;
		}
		if (Boolean.class.isAssignableFrom(expected)) {
			return DisplayType.TOSTRING;
		}
		if (Character.class.isAssignableFrom(expected)) {
			return DisplayType.TOSTRING;
		}
		if (Enum.class.isAssignableFrom(expected)) {
			return DisplayType.TOSTRING;
		}
		if (expected == String.class || CharSequence.class.isAssignableFrom(expected)) {
			return DisplayType.TOSTRING;
		}
		if (expected == Boolean.class) {
			return DisplayType.TOSTRING;
		}

		return DisplayType.PANEL;
	}

	public static Class getClassNullOk(Object object) {
		if (object == null)
			return null;
		object = dref(object);
		return object.getClass();
	}

	public static Object dref(Object value, Object onNull) {
		return dref(value, onNull, 4, true);
	}

	public static Object dref(Object value) {
		return dref(value, true);
	}

	public static Object drefO(Object value) {
		return dref(value, false);
	}

	public static Object drefJ(Object value) {
		Object o = dref(value, false);
		if (o == value) {
			if (o instanceof JComponent) {
				o = ((JComponent) o).getParent();
				if (o != null && o != value) {
					o = drefJ(o);
				}
			}
		}
		return o;
	}

	public static Object dref(Object value, boolean onlyReferenceHolders) {
		return dref(value, value, 9, onlyReferenceHolders);
	}

	public static Object dref1(Object value, boolean onlyReferenceHolders) {
		return dref(value, value, 0, onlyReferenceHolders);
	}

	public static Object dref(Object value, Object onNull, int depth, boolean onlyBTAndPanelsAsReferenceHolders) {
		if (value == null)
			return onNull;
		if (value.getClass() == JJPanel.class)
			return value;
		if (value instanceof TriggerMenuController) {
			TriggerMenuController tmc = (TriggerMenuController) value;
			HashSet objs = new HashSet();
			for (Object o : tmc.getObjects(null)) {
				Object v = dref(o, onlyBTAndPanelsAsReferenceHolders);
				objs.add(v);
			}
			if (objs.size() == 1) {
				return objs.iterator().next();
			} else {
				warn("Not Dref-ing a TMC", value);
			}

		}
		boolean wasRealDeref = false;
		boolean onlyDeref1 = depth == 0;
		if (value instanceof Convertable) {
			onlyDeref1 = true;
			// maybe should not dereference?
			if (onlyBTAndPanelsAsReferenceHolders && !(value instanceof BT)) {
				warn("Dref-ing a convertable ", value);
			}
		}

		if (depth < 0) {
			return value;
		}
		Object derefd = null;

		try {
			if (value instanceof JComponent && value instanceof GetObject) {
				derefd = ((GetObject) value).getValue();
				wasRealDeref = true;
			} else if (value instanceof IsReference) {
				derefd = ((IsReference) value).getValue();
				wasRealDeref = true;
			} else if (value instanceof DefaultMutableTreeNode) {
				derefd = ((DefaultMutableTreeNode) value).getUserObject();
				wasRealDeref = true;
			} else if (value instanceof PropertyEditor) {
				derefd = ((PropertyEditor) value).getValue();
				wasRealDeref = true;
			} else if (value instanceof BT) {
				derefd = ((BT) value).getValue();
			} else if (value instanceof IGetBox) {
				derefd = ((IGetBox) value).getBox();
			} else if (!onlyBTAndPanelsAsReferenceHolders) {
				if (value instanceof GetObject) {
					derefd = ((GetObject) value).getValue();
				} else if (value instanceof WrapperValue) {
					derefd = ((WrapperValue) value).reallyGetValue();
				}
			}
		} catch (Throwable t) {

		}

		int nextDepth = depth - (wasRealDeref ? 0 : 1);
		boolean changed = (derefd != null && derefd != value);
		if (wasRealDeref || changed) {
			if (!onlyDeref1) {
				if (!changed) {
					//warn("no value change " + value);
					value = derefd;
				} else {
					value = dref(derefd, derefd, nextDepth, onlyBTAndPanelsAsReferenceHolders);
				}
			} else {
				value = derefd;
			}
		}
		if (value == null)
			return onNull;
		return value;
	}

	public static <T> T[] ChoiceOf(T... o) {
		return o;
	}

	public static <T> T first(T... o) {
		for (T t : o) {
			if (t != null)
				return t;
		}
		return null;
	}

	public static java.net.URL getResource(String filename) {
		return get1Resource(arrayOf("", "icons/"), filename, arrayOf("", ".gif", ".jpg", ".ico"));
	}

	public static java.net.URL get1Resource(String[] prefix, String filename, String[] suffix) {
		java.net.URL url = null;
		for (String pfx : prefix)
			for (String sfx : suffix) {
				String tryFileName = pfx + filename + sfx;
				url = org.appdapter.gui.swing.IconView.class.getResource(tryFileName);
				if (url != null)
					return url;

				url = ClassLoaderUtils.getFileResource(ClassLoaderUtils.ALL_RESOURCE_CLASSLOADER_TYPES, tryFileName);
				if (url != null)
					return url;
			}
		return null;
	}

	public static UserResult asUserResult(Object obj) {
		if (obj instanceof UserResult)
			return (UserResult) obj;
		return UserResult.SUCCESS;
	}

	public static boolean boxesRepresentSame(Box b, Object userObject) {
		if (userObject == b)
			return true;
		Object b0 = dref(b);
		Object uo0 = dref(userObject);
		if (b == null || b0 == null)
			return uo0 == null;
		if (uo0 == b0)
			return true;
		Object b00 = drefO(b0);
		Object uo00 = drefO(uo0);
		if (uo00 == b00)
			return true;
		return false;
	}

	public static String properCase(String text) {
		if (text.contains(" ")) {
			StringBuffer buffer = new StringBuffer();
			for (String sp : text.split(" ")) {
				buffer.append(properCase(sp));
			}
			return buffer.toString();
		}
		if (text.trim().length() < 3) {
			return text;
		}
		return text.substring(0, 1).toUpperCase() + text.substring(1);
	}

	public static String spaceCase(String text) {
		boolean wasUpper = true;
		StringBuffer newName = new StringBuffer();
		for (char c : text.toCharArray()) {
			if (Character.isUpperCase(c)) {
				if (!wasUpper) {
					newName.append(" ");
				}
				wasUpper = true;
			} else {
				wasUpper = false;
			}
			newName.append(c);
		}
		return newName.toString();
	}

	public static String makeTooltipText(Object gv) {
		gv = dref(gv);
		if (gv == null) {
			gv = "<NULL>";
		} else {

			//ToolTipManager man = ToolTipManager.sharedInstance();
			//man.setInitialDelay(400);
			// man.setLightWeightPopupEnabled(!man.isLightWeightPopupEnabled());
			String oc = null;
			if (gv instanceof Class) {
				oc = ((Class) gv).getName();
			} else {
				oc = toInfoStringO(gv);
			}
			if (oc == null) {
				oc = getSpecialClassName0(((Class) gv));
			}
			String gvStr = getSpecialClassName0(gv.getClass()) + ".this.toString: " + oc;
			if (gvStr.length() > 2048) {
				gvStr = gvStr.substring(0, 2048);
				gv = gvStr;
			}
		}
		return "" + gv;
	}

	static {
		synchronized (triggerAdders) {
			triggerAdders.add(new TriggerAdderForInstance<Object>());
		}
	}

	public static NamedObjectCollection getClipboard() {
		return clipboardCollection;
	}

	public static boolean isOSGi() {
		if (true)
			return true;
		ClassLoader cl = PromiscuousClassUtilsA.getCallerClassLoader();
		if (cl != null) {
			Class cls = cl.getClass();
			Class dc = cls.getDeclaringClass();
			if (dc == null) // there is an situation that can cause this on some
							// JVMs
				dc = cls;
			String cn = dc.getCanonicalName();
			if (cn.contains("Bundle")) {
				if (true)
					return false; // for testing if OSGi loading is safe yet
				return true;
			}
		}
		return false;
	}

	public static Collection<PropertyDescriptor> getProperties(Object object) throws IntrospectionException {
		final Class beanClass = object.getClass();
		PropertyDescriptor[] pdsa = getBeanInfo(beanClass, false).getPropertyDescriptors();
		return getProperties(object, beanClass, pdsa);
	}

	public static Collection<PropertyDescriptor> getProperties(Object object, Class beanClass, PropertyDescriptor[] pdsa) throws IntrospectionException {
		Map<String, PropertyDescriptor> props = new HashMap<String, PropertyDescriptor>();
		if (pdsa != null) {
			for (PropertyDescriptor p : pdsa) {
				props.put(p.getName().toLowerCase(), p);
			}
		}
		int fnum = -1;
		for (final Field f : getAllFields(beanClass)) {
			fnum++;
			String propName = PropertyDescriptorForField.clipPropertyNameMethod(f.getName(), "my").toLowerCase();
			PropertyDescriptor pd = props.get(propName);
			if (pd == null) {
				try {
					pd = PropertyDescriptorForField.findOrCreate(f).makePD(object);
					props.put(pd.getName().toLowerCase(), pd);
				} catch (Throwable t) {

				}
			}
		}
		Collection<Method> ml = getAllMethods(beanClass);
		for (Method m : ml) {
			String propName = PropertyDescriptorForField.clipPropertyNameMethod(m.getName(), "is", "get", "set").toLowerCase();
			PropertyDescriptor pd = props.get(propName);
			Class[] pts = m.getParameterTypes();
			int ptsl = pts.length;
			if (pd != null) {
				Class propType = pd.getPropertyType();
				if (propType == null)
					continue;
				try {
					if (ptsl == 0 && isSameType(m.getReturnType(), propType)) {
						pd.setReadMethod(m);
						continue;
					} else {
						if (ptsl == 1 && m.getReturnType() == void.class && isSameType(pts[0], propType)) {
							Method prm = pd.getReadMethod();
							if (pts[0] != propType) {
								//one is primtive;
								continue;
							}

							try {
								pd.setWriteMethod(m);
							} catch (IntrospectionException ie) {
								printStackTrace(ie);
							}
							continue;
						}
					}
				} catch (Throwable t) {
					printStackTrace(t);
					//throw reThrowable(t);

				}
			}
		}
		return props.values();
	}

	public static boolean instanceOf(Object value, Class cls) {
		if (cls == Stringable) {
			return value == null || isToStringType(value.getClass());
		}
		if (cls.isInstance(value))
			return true;
		return false;
	}

	public static boolean instanceOfAny(Object value, Class... clss) {
		for (Class c : clss) {
			if (instanceOf(value, c))
				return true;
		}
		return false;
	}

	public static BT asBTNoCreate(Object obj) {
		if (obj instanceof BT) {
			return (BT) obj;
		}
		if (obj instanceof IGetBox) {
			return ((IGetBox) obj).getBox();
		}
		return null;
	}

	static public Icon getIcon(Class info) {
		try {
			if (!useBeanIcons)
				return null;
			return getIcon(getBeanInfo(info, null));
		} catch (Throwable e) {
			printStackTrace(e);
			return new UnknownIcon();
		}
	}

	/**
	 * Returns an Icon for this object, determined using BeanInfo. If no icon was found a default icon will be returned.
	 */
	static public Icon getIcon(BeanInfo info) {
		Icon icon;
		try {
			Image image;
			image = info.getIcon(BeanInfo.ICON_COLOR_16x16);
			if (image == null) {
				image = info.getIcon(BeanInfo.ICON_MONO_16x16);
			}

			if (image == null) {
				icon = new UnknownIcon("B");
			} else {
				icon = new ImageIcon(image);
			}
		} catch (Exception err) {
			icon = new UnknownIcon("E");
		}
		return icon;
	}

	public static ImageIcon getIcon(String string) {
		return getImageIcon(getImage(string));
	}

	public static ImageIcon getImageIcon(Image url) {
		if (url == null)
			return new ImageIcon(new UnknownIcon("I").asImage());
		return new ImageIcon(url);
	}

	public static ImageIcon getImageIcon(URL url, String text, Color elseC) {
		if (url == null)
			return new ImageIcon(new UnknownIcon(text, elseC).asImage());
		return new ImageIcon(url);
	}

	public static Image getImage(String string) {
		return getImage(getResource(string));
	}

	public static Image getImage(URL uri) {
		try {
			if (uri == null)
				return new UnknownIcon("?").asImage();
			return ImageIO.read(uri);
		} catch (IOException e) {
			printStackTrace(e);
			return new UnknownIcon("?").asImage();
		}
	}

	public static java.net.URL getResource(final Class c, String name) {
		ClassLoader cl = ClassLoaderUtils.getClassLoader(c);
		if (cl == null) {
			// A system class.
			return ClassLoader.getSystemResource(name);
		}
		return cl.getResource(name);
	}

	public static java.awt.Image loadImage(final Class c, final String resourceName) {
		try {
			java.awt.image.ImageProducer ip = (java.awt.image.ImageProducer) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() {
				public Object run() {
					java.net.URL url;
					if ((url = getResource(c, resourceName)) == null) {
						return null;
					} else {
						try {
							return url.getContent();
						} catch (java.io.IOException ioe) {
							return null;
						}
					}
				}
			});

			if (ip == null)
				return null;
			java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
			return tk.createImage(ip);
		} catch (Exception ex) {
			return null;
		}
	}

	public static Collection<Trigger> getGlobalTriggers(DisplayContext ctx, Class cls, Object poj) {
		ArrayList<Trigger> triggersFound = new ArrayList<Trigger>();
		List<TriggerForClass> trigsToTest = getObjectGlobalMethods();
		for (TriggerForClass trigc : trigsToTest) {
			if (trigc.appliesTarget(cls, poj))
				triggersFound.add(trigc.createTrigger(null, ctx, poj));
		}
		return triggersFound;
	}

	public static Map<String, Object> propertyDescriptors(Object object, boolean skipNulls, boolean skipStringables) {
		Map<String, Object> showProps = new HashMap<String, Object>();
		try {
			for (PropertyDescriptor pd : getProperties(object)) {
				Class pt = pd.getPropertyType();
				if (skipStringables && (pt == null || (isToStringType(pt) || pt == Class.class)))
					continue;
				Object v = null;
				Throwable why = null;
				if (pd instanceof PropertyDescriptorForField) {
					try {
						v = ((PropertyDescriptorForField) pd).getFieldValue(object);
					} catch (Throwable t) {
						why = t;
					}
				} else {
					if (pd == null)
						continue;
					Method rm = pd.getReadMethod();
					if (rm == null)
						continue;

					Class rtc = rm.getReturnType();
					if (isSideEffectReturnType(rtc))
						continue;
					try {
						rm.setAccessible(true);
						v = rm.invoke(object);
					} catch (Throwable e) {
						why = e;
					}
				}

				if (v == null && skipNulls)
					continue;
				if (why instanceof InvocationTargetException) {
					why = why.getCause();
				}
				if (v == null)
					if (why instanceof RuntimeException)
						continue;
				showProps.put(pd.getName(), v);

			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return showProps;
	}

	public static boolean isSideEffectReturnType(Class cls) {
		if (Component.class.isAssignableFrom(cls))
			return true;
		if (Iterator.class.isAssignableFrom(cls))
			return true;
		if (Enumeration.class.isAssignableFrom(cls))
			return true;
		if (Object[].class.isAssignableFrom(cls))
			return true;
		if (void.class == cls || Void.class == cls)
			return true;
		return false;
	}

	public static void replaceRunnable(Object key, Runnable runnable) {
		if (!separateSlowThreads) {
			runnable.run();
			return;
		}
		synchronized (slowThreads) {
			Thread fnd = slowThreads.get(key);
			if (fnd != null) {
				killThread(fnd);
			}
			fnd = new Thread(runnable, "Worker for " + key);
			slowThreads.put(key, fnd);
			fnd.start();
		}

	}

	private static void killThread(Thread fnd) {
		if (!fnd.isAlive())
			return;
		fnd.stop();
	}

	public static Collection<TriggerAdder> getTriggerAdders(DisplayContext ctx, Class cls, Object poj) {
		return copyOf(triggerAdders);
	}

	public static void addTriggerForClassInst(TriggerForClass utilClass) {
		warn("Registering triggers from: " + utilClass);
		synchronized (objectContextMenuTriggers0) {
			objectContextMenuTriggers0.add(utilClass);
		}

	}

	public static void attachTo(Object anyObject, String title, Object child) {
		try {
			browserPanel.addToTreeListener.addChildObject(anyObject, title, child);
		} catch (PropertyVetoException e) {
			printStackTrace(e);
			throw reThrowable(e);
		}
	}

	public static HashSet<String> localPackagePrefixs = new HashSet<String>();

	static {
		localPackagePrefixs.add("org.appd");
		localPackagePrefixs.add("org.cog");
		localPackagePrefixs.add("org.robo");
		localPackagePrefixs.add("org.rw");
		localPackagePrefixs.add("org.openide");
		localPackagePrefixs.add("com.hr");
		localPackagePrefixs.add("java.util.");
		localPackagePrefixs.add("java.b");
	}

	static public void initGUIInThread() {
		synchronized (RAN_FIRST_INIT_GUI_LOCK) {
			Thread threadInitGUI = new Thread("Init GUI") {
				@Override public void run() {
					initGUI();
				}
			};
			threadInitGUI.start();
		}
	}

	public static <T> Set<Class<? extends T>> getCoreClasses(final Class<T> ancestor) {
		return ReflectUtils.cachedResult(new Callable() {
			@Override public Object call() throws Exception {
				Set<Class<? extends T>> cls = new HashSet();
				try {
					for (String s : copyOf(localPackagePrefixs)) {
						cls.addAll(ClassFinder.getClasses(s, ancestor));
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

				return cls;
			}
		}, ancestor);
	}

	public static boolean RAN_FIRST_INIT_GUI = false;
	public static Object RAN_FIRST_INIT_GUI_LOCK = new Object();

	public static void initGUI() {
		synchronized (RAN_FIRST_INIT_GUI_LOCK) {
			if (RAN_FIRST_INIT_GUI)
				return;
			RAN_FIRST_INIT_GUI = true;
			initGUI0();
		}
	}

	public static void initGUI0() {
		DemoBrowser.addRepoLoaderMenu();

		try {
			findAndloadMissingUtilityClasses();
		} catch (Throwable e) {
			printStackTrace(e);
		}
		try {
			findAndloadMissingTriggers();
		} catch (Throwable e) {
			printStackTrace(e);
		}
		taskEqueue.addTask("loadAssemblerInstances", new Runnable() {
			public void run() {
				try {
					singletAssemblerCacheGrabber.loadAssemblerInstances();
				} catch (Throwable e) {
					printStackTrace(e);
				}
			}
		});

		taskEqueue.addTask("loadAddedBoxes", new Runnable() {
			public void run() {
				try {
					singletAssemblerCacheGrabber.loadAddedBoxes();
				} catch (Throwable e) {
					printStackTrace(e);
				}
			}
		});

		registerPanel(ModelAsTurtleEditor.class, Model.class);

		unqueueFeatures();
		taskEqueue.waitUntilLastJobComplete();
		taskEqueue.setSynchronous(false);
		UtilityBoot.runLoadComplete();
	}

	private static <T> T recastUtilFirst(Object obj, Class<T> objNeedsToBe) throws NoSuchConversionException {
		List maxConverts = AggregateConverter.getMcvt();
		List was = new ArrayList(maxConverts);
		try {
			try {
				Object ret = recastUtilOnly(obj, objNeedsToBe, maxConverts);
				if (ret != null) {
					if (objNeedsToBe.isInstance(ret))
						return (T) ret;
					return (T) ReflectUtils.recastRU(ret, objNeedsToBe, maxConverts);
				}
			} catch (Throwable t) {

			}
			return (T) ReflectUtils.recastRU(obj, objNeedsToBe, maxConverts);

		} finally {
			AggregateConverter.setMcvt(was);
		}
	}

	public static void addShutdownHook(Runnable runnable) {
		Runtime.getRuntime().addShutdownHook(new Thread(runnable, "Shutdown Hook for " + runnable));

	}

	public static HashSet<Class> localInterfaces = new HashSet<Class>();
	static boolean isLoadComplete = false;
	static List<Runnable> onLoadComplete = new LinkedList<Runnable>();

	static {
		invokeAfterLoader(new Runnable() {

			@Override public void run() {
				UtilityMenuOptions.ensurePanelsAllRegistered();
			}

			@Override public String toString() {
				return "UtilityMenuOptions.ensurePanelsAllRegistered();";
			}

		});
	}
	static {
		localInterfaces.add(Set.class);
		localInterfaces.add(List.class);
		localInterfaces.add(Collection.class);
		localInterfaces.add(RDFNode.class);
		localInterfaces.add(Repo.WithDirectory.class);
	}

	public static boolean isLocalInterface(Class ifc) {
		if (ifc == null)
			return false;
		synchronized (localInterfaces) {
			if (localInterfaces.contains(ifc))
				return true;
		}
		String pname = ifc.getPackage().getName();
		for (String s : copyOf(localPackagePrefixs)) {
			if (pname.startsWith(s))
				return true;
		}
		return false;
	}

	static boolean wasSetup = false;
	public synchronized static void setup() {
		if(wasSetup) return;
		wasSetup = true;

		PromiscuousClassUtilsA.ensureInstalled();
		registerEditors();
		setBeanInfoSearchPath();
	}

	public static Box asBox(Object b, ActionEvent e) {
		if (b == null) {
			if (true)
				return null;
			b = e.getSource();
		}
		if (b instanceof TriggerMenuController) {
			TriggerMenuController tmc = (TriggerMenuController) b;
			HashSet objs = new HashSet();
			for (Object o : tmc.getObjects(null)) {
				Object v = dref(o);
				objs.add(v);
			}
			if (objs.size() == 1) {
				b = objs.iterator().next();
			}

		}
		Object v = dref(b);
		return asBoxed(b);
	}

	static public void makeTablePopupHandler(final JTable jTable) {
		jTable.setAutoCreateRowSorter(true);
		jTable.setFillsViewportHeight(true);
		TriggerMouseAdapter.installMouseAdapter(jTable);
		jTable.setColumnSelectionAllowed(false);
		TableModel tm = jTable.getModel();
		SafeJTable.setComponentRenderers(jTable, tm);
	}

	static public void unqueueFeatures() {
		Collection<Object> todoList = null;
		synchronized (featureQueueLock) {
			todoList = featureQueueUp;
			featureQueueUp = null;
		}
		if (todoList != null) {
			for (Iterator iterator = todoList.iterator(); iterator.hasNext();) {
				Object object = (Object) iterator.next();
				addObjectFeatures(object);
			}
		}

	}

	@UISalient public static Class[] getCreatableSubclasses(Class ancestor) {
		ArrayList<Class> clzs = new ArrayList<Class>();
		try {
			for (Object o : ClassFinder.getClasses(ancestor)) {
				if (o instanceof Class) {
					Class c = (Class) o;
					if (!isCreatable(c))
						continue;
					clzs.add(c);
				}
			}
		} catch (IOException e) {
			printStackTrace(e);
			return null;
		}
		return clzs.toArray(CLASS0);
	}

	@UISalient public static Class[] getImplementingClasses(Class ancestor) {
		try {
			return (Class[]) ClassFinder.getClasses(ancestor).toArray(CLASS0);
		} catch (IOException e) {
			printStackTrace(e);
			return null;
		}
	}

	static public Collection<AddTabFrames> getTabFrameAdders() {
		return copyOf(Utility.addTabFramers);
	}

	/**
	 * @param self
	 */
	static public String createStackTraceSTring(Throwable t) {
		if(t == null) t = new Throwable("");
		final StringBuilder string = new StringBuilder();
		OutputStream outputStream = new OutputStream() {

			@Override
			public void write(int b) throws IOException {
				string.append((char) b);
			}

			// Netbeans IDE automatically overrides this toString()
			public String toString() {
				return string.toString();
			}
		};
		t.printStackTrace(new PrintStream(outputStream));
		return string.toString();
	}

	public static <T> T invokeAndWait(final Callable<T> callable) {
		final Object[] res = new Object[1];
		final Throwable[] ex = new Throwable[1];
		try {
			if (EventQueue.isDispatchThread()) {
				return callable.call();
			}
			final String st = createStackTraceSTring(null);
			SwingUtilities.invokeAndWait(new Runnable() {
				@Override public void run() {
					try {
						Thread.currentThread().setName(st);
						res[0] = callable.call();
					} catch (Throwable e) {
						ex[0] = e;
					}
				}
			});
			if (ex[0] != null)
				throw ex[0];
		} catch (Error e) {
			throw e;
		} catch (RuntimeException e) {
			throw e;
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
		return (T) res[0];
	}

	public static void invokeAndWait(final Runnable runnable) {

		if (EventQueue.isDispatchThread()) {
			runNow(runnable);
			return;
		}
		final Throwable[] ex = new Throwable[1];
		final String st = createStackTraceSTring(null);

		try {

			if(true) {
				SwingUtilities.invokeAndWait(runnable);
				return;
			}

			SwingUtilities.invokeAndWait(new Runnable() {
				@Override public void run() {
					try {
					//	//Thread.currentThread().setName(st);
						runnable.run();
					} catch (Throwable e) {
						ex[0] = e;
					}
				}
			});
			if (ex[0] != null)
				throw ex[0];
		} catch (Error e) {
			throw e;
		} catch (RuntimeException e) {
			throw e;
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
		return;
	}

	public static UserResult invokeLater(Runnable runnable) {
		SwingUtilities.invokeLater(runnable);
		return UserResult.SUCCESS;
	}


	public static UserResult invokeNonGUI(Runnable runnable) {
		//SwingUtilities.invokeLater(runnable);
		runnable.run();
		return UserResult.SUCCESS;
	}

	public static UserResult invokeLater(final Callable runnable) {
		invokeLater(new Runnable() {
			@Override public void run() {
				try {
					runnable.call();
				} catch (Exception e) {
					printStackTrace(e);
				}
			}
		});
		return UserResult.SUCCESS;
	}

	public static UserResult invokeAfterLoader(final Callable<UserResult> callable) {
		invokeAfterLoader(new Runnable() {
			@Override public void run() {
				try {
					callable.call();
				} catch (Exception e) {
					printStackTrace(e);
				}

			}

			@Override public String toString() {
				return "callable.call()=" + callable;
			}

		});
		return UserResult.SUCCESS;
	}

	private static void runNow(Runnable td) {
		try {
			taskEqueue.setSynchronous(false);
			td.run();
		} catch (Error e) {
			throw e;
		} catch (RuntimeException e) {
			throw e;
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	public static void invokeAfterLoader(Runnable runnable) {
		synchronized (onLoadComplete) {
			if (!isLoadComplete) {
				onLoadComplete.add(runnable);
				return;
			}
		}
		runTask(runnable);
	}

	public static void runTask(Runnable runnable) {
		taskEqueue.addTask("" + runnable, runnable);
	}

	static {
		if (false)
			invokeAfterLoader(new Runnable() {
				@Override public void run() {
					JFrame frame = Utility.getAppFrame();
					Component glassPane = frame.getGlassPane();
					JPopupMenu popup = new JPopupMenu();
					popup.add(new JMenuItem("Dogs"));
					popup.add(new JMenuItem("Cats"));
					popup.add(new JMenuItem("Mass Hysteria"));
					RightClickGlassPane rc = new RightClickGlassPane(frame.getContentPane(), popup);
					//glassPane.addMouseListener(rc);
					frame.setGlassPane(rc);
					rc.setVisible(true);
				}

				@Override public String toString() {
					return "Mass Hysteria test";
				}
			});

	}

	static boolean isNeedToRedispatch() {
		return needToRedispatch;
	}

	static boolean needToRedispatch = true;

	static public class RightClickGlassPane extends JComponent implements MouseListener, MouseMotionListener, FocusListener, KeyListener {

		private Container contentPane;
		// trigger for redispatching (allows external control)
		boolean inDrag = false;
		private JPopupMenu popup;

		public RightClickGlassPane(Container contentPane, JPopupMenu menu) {
			addMouseListener(this);
			addMouseMotionListener(this);
			this.contentPane = contentPane;
			this.popup = menu;
		}

		public void setVisible(boolean v) {
			// Make sure we grab the focus so that key events don't go astray.
			if (v)
				requestFocus();
			super.setVisible(v);
		}

		public void paint(Graphics g) {
			//super.paint(g);
		}

		// We only need to redispatch if we're not visible, but having full control
		// over this might prove handy.
		public void setNeedToRedispatch(boolean need) {
			needToRedispatch = need;
		}

		/*
		 * (Based on code from the Java Tutorial) We must forward at least the mouse
		 * drags that started with mouse presses over the check box. Otherwise, when
		 * the user presses the check box then drags off, the check box isn't
		 * disarmed -- it keeps its dark gray background or whatever its L&F uses to
		 * indicate that the button is currently being pressed.
		 */
		public void mouseDragged(MouseEvent e) {
			if (isNeedToRedispatch())
				redispatchMouseEvent(e);
		}

		public void mouseMoved(MouseEvent e) {
			if (isNeedToRedispatch())
				redispatchMouseEvent(e);
		}

		public void mouseClicked(MouseEvent e) {
			if (isNeedToRedispatch())
				redispatchMouseEvent(e);
		}

		public void mouseEntered(MouseEvent e) {
			if (isNeedToRedispatch())
				redispatchMouseEvent(e);
		}

		public void mouseExited(MouseEvent e) {
			if (isNeedToRedispatch())
				redispatchMouseEvent(e);
		}

		public void mousePressed(MouseEvent e) {
			if (isNeedToRedispatch())
				redispatchMouseEvent(e);
		}

		public void mouseReleased(MouseEvent e) {
			if (isNeedToRedispatch()) {
				redispatchMouseEvent(e);
				inDrag = false;
			}
		}

		// Once we have focus, keep it if we're visible
		public void focusLost(FocusEvent fe) {
			if (isVisible())
				requestFocus();
		}

		public void focusGained(FocusEvent fe) {
		}

		private void redispatchMouseEvent(MouseEvent e) {
			JMenuBar menuBar = Utility.getMenuBar();
			boolean inButton = false;
			boolean inMenuBar = false;
			Point glassPanePoint = e.getPoint();
			Component component = null;
			Container container = contentPane;
			Point containerPoint = SwingUtilities.convertPoint(this, glassPanePoint, contentPane);
			int eventID = e.getID();

			if (containerPoint.y < 0) {
				inMenuBar = true;
				container = menuBar;
				containerPoint = SwingUtilities.convertPoint(this, glassPanePoint, menuBar);
				testForDrag(eventID);
			}

			//XXX: If the event is from a component in a popped-up menu,
			//XXX: then the container should probably be the menu's
			//XXX: JPopupMenu, and containerPoint should be adjusted
			//XXX: accordingly.
			component = SwingUtilities.getDeepestComponentAt(container, containerPoint.x, containerPoint.y);
			// if it's a pop up

			if (component == null) {
				return;
			} else {
				inButton = true;
				testForDrag(eventID);
			}

			boolean isPopupTrigger = e.isPopupTrigger();
			Point componentPoint = SwingUtilities.convertPoint(this, glassPanePoint, component);
			MouseEvent ev = new MouseEvent(component, eventID, e.getWhen(), e.getModifiers(), componentPoint.x, componentPoint.y, e.getClickCount(), isPopupTrigger);

			if (inMenuBar || inButton || inDrag || true) {
				component.dispatchEvent(ev);
			}
			if (ev.isConsumed())
				return;

			if (isPopupTrigger) {

				// show the pop up and return
				JPopupMenu popupMenu = new JPopupMenu();
				popupMenu.add("" + component);
				popupMenu.addSeparator();
				Object v = drefJ(component);
				if (v != component) {
					popupMenu.add("" + v);
				}
				popupMenu.addSeparator();
				popupMenu.add(popup);
				popupMenu.addSeparator();
				popupMenu.show(e.getComponent(), e.getX(), e.getY());
			}
		}

		private void redispatchMouseEvent(MouseEvent e, boolean repaint) {

			// if it's a pop up
			if (e.isPopupTrigger()) {
				// show the pop up and return
				//makePopupFor(e.getComponent());
				popup.show(e.getComponent(), e.getX(), e.getY());

			} else {
				// since it's not a pop up we need to redispatch it.
				// get the mouse click point relative to the content pane
				Point containerPoint = SwingUtilities.convertPoint(this, e.getPoint(), contentPane);

				// find the component that is under this point
				Component component = SwingUtilities.getDeepestComponentAt(contentPane, containerPoint.x, containerPoint.y);

				// return if nothing was found
				if (component == null) {
					return;
				}

				// convert point relative to the target component
				Point componentPoint = SwingUtilities.convertPoint(this, e.getPoint(), component);

				// redispatch the event
				component.dispatchEvent(new MouseEvent(component, e.getID(), e.getWhen(), e.getModifiers(), componentPoint.x, componentPoint.y, e.getClickCount(), e.isPopupTrigger()));
			}
		}

		private void testForDrag(int eventID) {
			if (eventID == MouseEvent.MOUSE_PRESSED) {
				inDrag = true;
			}
		}

		@Override public void keyTyped(KeyEvent e) {
			redispatchKeyEvent(e);

		}

		@Override public void keyPressed(KeyEvent e) {
			redispatchKeyEvent(e);

		}

		@Override public void keyReleased(KeyEvent e) {
			redispatchKeyEvent(e);

		}

		private void redispatchKeyEvent(KeyEvent e) {
			contentPane.dispatchEvent(e);
		}

	}

	public static boolean isSideEffectSafe(Class cls) {
		if (Thread.class.isAssignableFrom(cls))
			return false;
		if (Component.class.isAssignableFrom(cls))
			return false;
		return true;
	}

	public static <F, T> void registerConverterFunction(Class<F> from, Class<T> to, CallableWithParameters<F, T> cmi) {
		registerConverter(new ConverterFromMember(from, to, cmi, true, null));
	}

	/**
	 * Register a Trigger to places on all instances of 'cls'
	 *
	 * @param cls
	 * @param menuLabel
	 * @param trigger
	 *
	 * @return a TriggerForInstance (will let you further customize the behaviour for the trigger)
	 *
	 */
	public static EditableTrigger registerTriggerForClassInstances(Class cls, String menuLabel, Trigger trigger) {
		EditableTrigger editableTrigger = new EditableTriggerImpl(cls, menuLabel, trigger);
		synchronized (objectContextMenuTriggers0) {
			objectContextMenuTriggers0.add(editableTrigger);
		}
		/*synchronized (appMenuGlobalTriggers0) {
			appMenuGlobalTriggers0.add(editableTrigger);
		}*/
		return editableTrigger;
	}

	/**
	 * Register a Trigger onto a class Object
	 *
	 * @param cls
	 * @param menuLabel
	 * @param trigger
	 *
	 * @return a TriggerForInstance (will let you further customize the behaviour for the trigger)
	 *
	 */
	public static EditableTrigger registerTriggerForClass(Class cls, String menuLabel, Trigger trigger) {
		EditableTrigger editableTrigger = new EditableTriggerImpl(cls, menuLabel, trigger);
		synchronized (objectContextMenuTriggers0) {
			objectContextMenuTriggers0.add(editableTrigger);
		}
		return editableTrigger;
	}

	/**
	 * Register a Trigger onto a class Object
	 *
	 * @param cls
	 * @param menuLabel
	 * @param trigger
	 *
	 * @return a TriggerForInstance (will let you further customize the behaviour for the trigger)
	 *
	 */
	public static EditableTrigger registerTriggerForPredicate(CallableWithParameters<Box, Boolean> predicate, String menuLabel, Trigger trigger) {
		EditableTrigger editableTrigger = new EditableTriggerImpl(predicate, menuLabel, trigger);
		synchronized (objectContextMenuTriggers0) {
			objectContextMenuTriggers0.add(editableTrigger);
		}
		synchronized (appMenuGlobalTriggers0) {
			appMenuGlobalTriggers0.add(editableTrigger);
		}
		return editableTrigger;
	}

	/**
	 * Register a Factory for a Class
	 *
	 * @param cls
	 * @param menuLabel
	 * @param trigger
	 *
	 * @return a TriggerForInstance (will let you further customize the behaviour for the trigger)
	 *
	 */
	public static <T> EditableTrigger registerFactoryForClass(final Class<T> cls, String menuLabel, final CallableWithParameters<Class<T>, ? extends T> function) {
		EditableTrigger editableTrigger = new EditableTriggerImpl(cls, menuLabel, function);

		setFactory(cls, new Callable() {
			@Override public Object call() throws Exception {
				return function.call(cls);
			}
		});
		synchronized (objectContextMenuTriggers0) {
			objectContextMenuTriggers0.add(editableTrigger);
		}
		synchronized (appMenuGlobalTriggers0) {
			appMenuGlobalTriggers0.add(editableTrigger);
		}
		return editableTrigger;
	}

	/**
	 * Register a Factory for a Class
	 *
	 * @param cls
	 * @param menuLabel
	 * @param trigger
	 *
	 * @return a TriggerForInstance (will let you further customize the behaviour for the trigger)
	 *
	 */
	public static <T> EditableTrigger registerToolsTrigger(String menuLabel, Trigger function) {
		EditableTrigger editableTrigger = new EditableTriggerImpl(menuLabel, function);
		synchronized (appMenuGlobalTriggers0) {
			appMenuGlobalTriggers0.add(editableTrigger);
		}
		return editableTrigger;
	}

	/**
	 * Register a Trigger on a specific object
	 *
	 * @param cls
	 * @param menuLabel
	 * @param trigger
	 *
	 * @return a TriggerForInstance (will let you further customize the behaviour for the trigger)
	 *
	 */
	public static EditableTrigger registerTriggerForObject(Object anyObject, String menuLabel, Trigger trigger) {
		if (anyObject == null) {
			return registerToolsTrigger(menuLabel, trigger);
		}
		EditableTrigger editableTrigger = new EditableTriggerImpl(menuLabel, trigger);
		((MutableBox) asBoxed(anyObject)).attachTrigger(editableTrigger);
		return editableTrigger;
	}

	/**
	 * Register a Trigger onto a class Object
	 *
	 * @param cls
	 * @param menuLabel
	 * @param trigger
	 *
	 * @return a TriggerForInstance (will let you further customize the behaviour for the trigger)
	 *
	 */
	public static EditableTrigger registerCallableForPredicate(CallableWithParameters<Box, Boolean> predicate, String menuLabel, CallableWithParameters function) {
		EditableTrigger editableTrigger = new EditableTriggerImpl(predicate, menuLabel, function);
		synchronized (objectContextMenuTriggers0) {
			objectContextMenuTriggers0.add(editableTrigger);
		}
		return editableTrigger;
	}

	public static void forgetWindow(Object window) {
		synchronized (breadCrumbedObjectViews) {
			breadCrumbedObjectViews.remove(window);
			breadCrumbedObjectViews.values().remove(window);
		}
		synchronized (objectWindows) {
			objectWindows.remove(window);
		}

	}

	private static Map<Object, Map<Object, JPanel>> objectPanelMaps = new HashMap<Object, Map<Object, JPanel>>();

	public static Map<Object, JPanel> getPanelMap(Object valueOrThis) {
		valueOrThis = drefO(valueOrThis);
		synchronized (objectPanelMaps) {
			Map<Object, JPanel> map = objectPanelMaps.get(valueOrThis);
			if (map == null) {
				map = new HashMap<Object, JPanel>();
				objectPanelMaps.put(valueOrThis, map);
			}
			return map;
		}
	}

	public static Callable findCreateNewFromUI(final Class cls, boolean mayUseConversion) {
		synchronized (factories) {
			Callable fm = factories.get(cls);
			if (fm != null)
				return fm;
			Class[] keySet = factories.keySet().toArray(CLASS0);
			for (Class c : keySet) {
				if (cls.isAssignableFrom(c)) {
					fm = factories.get(cls);
					return fm;
				}
			}
			if (mayUseConversion) {
				for (Class c : keySet) {
					if (isAssignableFrom(cls, c)) {
						final Callable subfm = factories.get(cls);
						return new Callable() {
							@Override public Object call() throws Exception {
								Object subObj = subfm.call();
								return recastCC(subObj, cls);
							}

						};
					}
				}
			}
		}
		return null;
	}

	public static <T> T createNewFromUI(Class<T> cls) throws Exception {
		Callable fm = findCreateNewFromUI(cls, true);
		if (fm == null) {
			throw new NoSuchConversionException("New Object", cls);
		}
		return (T) fm.call();
	}

	public static void showResult(Object anyObject) {
		Object lastFrom = null;
		Object lastTargetBox = null;
		ActionEvent lastEvt = null;
		try {
			Utility.addSubResult(lastFrom, lastTargetBox, lastEvt, anyObject, anyObject.getClass());
			Utility.selectInTree(anyObject);
		} catch (PropertyVetoException e) {
			printStackTrace(e);
		}

	}

	public static void selectInTree(Object anyObject) {
		browserPanel.selectInTree(anyObject);
	}

	public static boolean isLAFSafe() {
		if (true)
			return true;
		return !isOSGi();
	}

	public static void actionThreadStart(final Runnable runnable, final String threadName) {
		setLongRunner("actionPerformedThread", runnable, threadName);
	}

	static public Map<String, Thread> longThreads = new HashMap();
	static private Object longThreadSync = longThreads;

	static synchronized void setLongRunner(final String channelName, final Runnable longRunner, final Object taskSpecificName) {
		Thread cj = null;
		synchronized (longThreadSync) {
			cj = longThreads.get(channelName);
			if (cj == null) {
				cj = new Thread(channelName + " doing " + taskSpecificName) {

					@Override public void run() {
						try {
							longRunner.run();
						} catch (Throwable t) {
							String dstr = channelName + " doing " + taskSpecificName;
							setName(dstr + "=" + t);
							error(dstr + " {}", t);
						} finally {
							synchronized (longThreadSync) {
								longThreads.remove(channelName);
							}
						}

					}
				};
				longThreads.put(channelName, cj);
				cj.start();
				return;
			}
		}
		warn("Not starting " + taskSpecificName + "Already doing " + channelName + " as " + cj);

	}

	public static ObjectChoiceModel getObjectChoiceModel(Class type, JComponent comp, PropertyChangeSupport ps, Object valueToStart) {
		return new ObjectChoiceModel(getTreeBoxCollection(), type, "some " + type.getName(), getToFromStringConverter(type), comp, ps, valueToStart);
	}

	public static void showProperties(Object value) {
		try {
			Utility.browserPanel.showScreenBox(getPropertiesPanel(value));
		} catch (Throwable err) {
			Utility.showError(null, "An error occurred while creating an interface for " + value, err);
		}
	}

	public static boolean isAfterLoader = false;
	static {
		invokeAfterLoader(new Runnable() {

			@Override public void run() {
				isAfterLoader = true;
			}

			@Override public String toString() {
				return "isAfterLoader = true";
			}

		});
	}

	public static boolean isAppReady() {
		return isAfterLoader && controlApp != null && browserPanel != null;
	}

	public static void error(String a, Throwable e) {
		getLogger().error(a,e);
	}

	public static void error(String c, Object... args) {
		getLogger().error(c,args);
	}
	public static void warn(String c, Object... args) {
		getLogger().warn(c,args);
	}
	public static void trace(String c, Object... args) {
		getLogger().trace(c,args);
	}

	static org.slf4j.Logger _hiddenLogger = null;
	public static org.slf4j.Logger getLogger() {
		if(_hiddenLogger==null) _hiddenLogger = org.slf4j.LoggerFactory.getLogger(Utility.class);
		return _hiddenLogger;
	}
	public static void info(String c, Object... args) {
		getLogger().info(c,args);
	}

	 public static void warn(String a, Throwable e) {
		 getLogger().warn(a,e);
	}

	public static void addSingleton(Object baseDemoNavigatorCtrl) {
		org.logicmoo.system.BeanShellCntrl.addSingleton(baseDemoNavigatorCtrl);
	}

	public static void setSingleton(Class c , Object baseDemoNavigatorCtrl) {
		// TODO Auto-generated method stub

		//if(true) Errors.unimplementedMethod("Auto-generated method stub:  BeanShellCntrl.addSingleton");
		org.logicmoo.system.BeanShellCntrl.setSingleton(c,baseDemoNavigatorCtrl);

	}
	public static Object getSingleton(Class type) {
		// TODO Auto-generated method stub
		//if(true) Errors.unimplementedMethod("Auto-generated method stub:  BeanShellCntrl.getSingleton");
		return org.logicmoo.system.BeanShellCntrl.getSingleton(type);
	}


}
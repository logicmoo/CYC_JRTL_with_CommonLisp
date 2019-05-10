package org.appdapter.gui.trigger;

import java.awt.event.ActionEvent;
import java.beans.Customizer;
import java.beans.PropertyEditor;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

import org.appdapter.api.trigger.AnyOper;
import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.bind.rdf.jena.model.JenaModelUtils;
import org.appdapter.core.component.KnownComponent;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.convert.TypeAssignable;
import org.appdapter.core.debug.UIAnnotations.Autoload;
import org.appdapter.core.debug.UIAnnotations.UISalient;
import org.appdapter.core.debug.UIAnnotations.UtilClass;
import org.appdapter.core.log.Debuggable;
import org.appdapter.core.store.dataset.RepoDatasetFactory;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.ScreenBox;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.demo.DemoBrowser;
import org.appdapter.gui.editors.ObjectPanel;
import org.appdapter.gui.repo.RepoManagerPanel;
import org.appdapter.gui.swing.ScreenBoxPanel;
import org.appdapter.gui.util.ClassFinder;
import org.appdapter.gui.util.PromiscuousClassUtilsA;
import org.appdapter.trigger.bind.jena.BoxImpl;
import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.shared.ReificationStyle;

@UISalient(NonPublicMethods = false)
abstract public class UtilityMenuOptions implements UtilClass {

	//public static Logger Utility = LoggerFactory.getLogger(UtilityMenuOptions.class);

	public static boolean addPanelClasses = false;
	public static boolean addGlobalStatics = true;
	public static boolean allTriggersAreGlobal = true;
	public static boolean useBeanIcons = false;
	public static boolean usePropertyEditorManager = false;
	public static boolean separateSlowThreads = true;
	public static boolean scanForMissingScreenBoxPanels = false;
	public static boolean doErrorCheckScanForMissingScreenBoxPanels = false;

	public static void setAllFeatures(boolean tf) {
		scanForMissingScreenBoxPanels = tf;
		doErrorCheckScanForMissingScreenBoxPanels = tf;
		ClassFinder.DISABLE_CLASS_FINDER = !tf;
		if (tf) {
			Utility.RAN_FIRST_INIT_GUI = false;
			Utility.initGUI();
		}
	}

	interface VoidFunc2<A, B> {
		void call(A a, B b);
	}

	public static void findAndloadMissingUtilityClasses() throws IOException {
		Utility.addClassMethods(JenaModelUtils.class);
		VoidFunc2 fw = new VoidFunc2<Class, Class>() {
			@Override public void call(Class cls, Class ancestor) {
				Utility.addClassMethods(cls);
			}
		};

		Utility.taskEqueue.setSynchronous(false);
		withSubclasses(KnownComponent.class, fw);
		withSubclasses(DemoBrowser.class, fw);
		withSubclasses(Box.class, fw);
		withSubclasses(Trigger.class, fw);
		withSubclasses(UtilClass.class, fw);
		withSubclasses(AnyOper.class, fw);
		withSubclasses(ModelFactory.class, fw);
		withSubclasses(RepoDatasetFactory.class, fw);
		useScannedClasses("com.hp.hpl.jena.rdf.model.", fw);
		createEnumClass(ReificationStyle.class);

		Utility.taskEqueue.waitUntilLastJobComplete();
		loadAutoloads();
		Utility.addClassMethods(RepoManagerPanel.class);

		if (!scanForMissingScreenBoxPanels)
			return;

		withSubclasses(Customizer.class, fw, false);
		withSubclasses(PropertyEditor.class, fw, false);
		withSubclasses(ObjectPanel.class, fw, true);
		withSubclasses(ScreenBoxPanel.class, fw, true);
	}

	public static void ensurePanelsAllRegistered() {
		if (!doErrorCheckScanForMissingScreenBoxPanels)
			return;
		VoidFunc2<Class, Class> fw = new VoidFunc2<Class, Class>() {
			@Override public void call(Class cls, Class parent) {
				if (!ReflectUtils.isCreatable(cls))
					return;
				if (!Utility.ensurePanelRegistered(cls)) {
					Utility.warn("ERROR unregistered PANEL " + cls + " will be ignored");
				}
			}
		};

		withSubclasses(Customizer.class, fw, false);
		withSubclasses(PropertyEditor.class, fw, false);
		withSubclasses(ObjectPanel.class, fw, true);
		withSubclasses(ScreenBoxPanel.class, fw, true);
	}

	private static void createEnumClass(Class ec) {
		Utility.addClassMethods(ec);
	}

	private static <T> void withSubclasses(final Class<T> ancestor, final VoidFunc2<Class, Class> func, final boolean onlyCore) {

		Utility.runTask(new Runnable() {

			@Override public void run() {
				Collection<Class> which = getSubClasses("", ancestor, onlyCore);
				for (Class cls : which) {
					try {
						func.call(cls, ancestor);
					} catch (Throwable t) {
						Utility.error("With subclass " + cls + " of " + ancestor, t);
					}
				}
			}

			@Override public String toString() {
				return "With subclassof " + ancestor + " via " + func;
			}
		});
	}

	private static <T> Collection<Class> getSubClasses(String packagePrefix, Class<T> ancestor, boolean onlyCore) {

		if (onlyCore) {
			if (packagePrefix == null || packagePrefix.length() == 0) {
				return (Collection) Utility.getCoreClasses(ancestor);
			} else {
				HashSet<Class> which = new HashSet<Class>();
				for (Class c : Utility.getCoreClasses(ancestor)) {
					if (("" + c).contains(packagePrefix)) {
						which.add(c);
					}
				}
				return which;
			}
		} else {
			try {
				return (Collection) ClassFinder.getClasses(packagePrefix, ancestor);
			} catch (IOException e) {
				e.printStackTrace();
				if (packagePrefix == null || packagePrefix.length() == 0) {
					return (Collection) PromiscuousClassUtilsA.getImplementingClasses(ancestor);
				} else {
					HashSet<Class> which = new HashSet<Class>();
					for (Class c : PromiscuousClassUtilsA.getImplementingClasses(ancestor)) {
						if (("" + c).contains(packagePrefix)) {
							which.add(c);
						}
					}
					return which;
				}

			}
		}
	}

	private static <T> void withSubclasses(Class<T> ancestor, VoidFunc2<Class, Class> func) {
		withSubclasses(ancestor, func, true);
	}

	private static <T> void useScannedClasses(String packagePrefix, VoidFunc2<Class, Class> func) {

		final Class ancestor = Object.class;
		try {
			Collection<Class> which = getSubClasses(packagePrefix, ancestor, false);
			for (Class cls : which) {
				try {
					func.call((Class) cls, ancestor);
				} catch (Throwable t) {
					Utility.error("With subclass " + cls + " of " + ancestor, t);
				}
			}
		} catch (Throwable e) {
			Utility.error("With subclass " + packagePrefix + " of " + ancestor, e);
		}
	}

	static @UISalient() public void loadDemoObjects() {
		DemoBrowser.addMoreExamples();
		Utility.updateToolsMenu();
	}

	static @UISalient() public void loadAutoloads() {
		VoidFunc2<Class, Class> fw = new VoidFunc2<Class, Class>() {
			@Override public void call(Class cls, Class ancestor) {
				if (!cls.isInterface())
					Utility.addClassMethods(cls);
			}
		};
		withSubclasses(Autoload.class, fw);
	}

	public static void findAndloadMissingTriggers() throws IOException {
		VoidFunc2<Class, Class> fw = new VoidFunc2<Class, Class>() {
			@Override public void call(Class cls, Class ancestor) {
				if (!cls.isInterface())
					Utility.addClassMethods(cls);
			}
		};
		withSubclasses(Trigger.class, fw);
	}

	static private Set<Class> allBoxTypes = new HashSet<Class>();

	public static Collection<Class> getAllBoxTypes() throws IOException {
		synchronized (allBoxTypes) {
			if (allBoxTypes.size() == 0) {
				for (Class cls : Utility.getCoreClasses(Box.class)) {
					try {
						if (ReflectUtils.isCreatable(cls)) {
							allBoxTypes.add(cls);
						}
					} catch (Throwable t) {
						Debuggable.printStackTrace(t);
					}
				}
			}
		}
		return allBoxTypes;

	}

	static Trigger createTrigger(Class cls, Object... params) throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
		for (Constructor c : cls.getDeclaredConstructors()) {
			Class[] pt = c.getParameterTypes();
			if (pt.length > 0 && pt.length == params.length) {
				return (Trigger) c.newInstance(params);
			}
		}
		return (Trigger) cls.getDeclaredConstructors()[0].newInstance();
	}

	static Collection skippedTypes = new HashSet() {
		{
			add(Box.class);
			add(ScreenBox.class);
			add(org.appdapter.gui.box.ScreenBoxImpl.class);
			add(BoxImpl.class);
			add(Trigger.class);
			add(TriggerImpl.class);
			add(Object.class);
			addAll(ReflectUtils.asList(TriggerImpl.class.getInterfaces()));
			addAll(ReflectUtils.asList(org.appdapter.gui.box.ScreenBoxImpl.class.getInterfaces()));
			add(java.io.Serializable.class);
		}
	};

	private static void addTriggerClass(final Class cls) {
		if (!ReflectUtils.isCreatable(cls))
			return;
		Class classOfBox;
		boolean hasNoSideEffects = false;
		Callable<Trigger> howto = new Callable<Trigger>() {
			@Override
			public Trigger call() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
				return createTrigger(cls);
			}
		};
		String menuName = ReflectUtils.getCanonicalSimpleName(cls);
		if (menuName.endsWith("Trigger")) {
			menuName = menuName.substring(0, menuName.length() - 7);
		}
		Member member;
		final boolean isDeclNonStatic0 = true;

		try {
			// checks for some type and claims this will be good for it
			if (TriggerForClass.class.isAssignableFrom(cls)) {
				Utility.addTriggerForClassInst((TriggerForClass) cls.newInstance());
				return;
			}
		} catch (Throwable e) {
			// otherwise look for another registration method
		}

		try {
			// checks for a static final field of some type and claims this will be good for it
			classOfBox = (Class) cls.getField("boxTargetClass").get(null);
			member = classOfBox.getDeclaredConstructors()[0];
			addTriggerForClass(menuName, classOfBox, member, howto, isDeclNonStatic0, hasNoSideEffects);
			return;
		} catch (Throwable e) {
			// otherwise look for another registration method
		}

		try {
			// checks for a fire(WhatNotBox box) and claims this will be good for it
			Method method = ReflectUtils.getDeclaredMethod(cls, "fire", false, false, 1);
			if (method != null) {
				classOfBox = ReflectUtils.getTypeClass(method.getGenericParameterTypes()[0], null, new ArrayList(skippedTypes));
				if (classOfBox != null) {
					member = method;
					addTriggerForClass(menuName, classOfBox, member, howto, isDeclNonStatic0, hasNoSideEffects);
					return;
				}
			}
		} catch (Throwable e) {
			// otherwise look for another registration method
		}

		try {
			// checks for a SomeTrigger(WhatNot classOfBox) and claims this will be good for it
			Constructor method = ReflectUtils.getDeclaredConstructor(cls, TypeAssignable.ANY, 1);
			if (method != null) {
				classOfBox = ReflectUtils.getTypeClass(method.getGenericParameterTypes()[0], null, new ArrayList(skippedTypes));
				if (classOfBox != null) {
					member = method;
					addTriggerForClass(menuName, classOfBox, member, howto, isDeclNonStatic0, hasNoSideEffects);
					return;
				}
			}
		} catch (Throwable e) {
			// otherwise look for another registration method
		}

		try {
			// checks for some type and claims this will be good for it
			classOfBox = ReflectUtils.getTypeClass(cls.getTypeParameters(), null, new ArrayList(skippedTypes));
			if (classOfBox != null) {
				member = classOfBox.getDeclaredConstructors()[0];
				//@todo ?
				addTriggerForClass(menuName, classOfBox, member, howto, isDeclNonStatic0, hasNoSideEffects);
			}
		} catch (Throwable e) {
			// otherwise look for another registration method
		}

		Utility.warn("Unable to register triggers from: " + cls);
	}

	private static void addTriggerForClass(final String menuName, final Class classOfBox, final Member member, final Callable<Trigger> valueOf, final boolean isDeclNonStatic0,
			final boolean hasNoSideEffects) {

		Utility.addTriggerForClassInst(new TriggerForClass() {

			@Override public boolean isSideEffectSafe() {
				return false;
			}

			@Override public boolean isFavorited() {
				return true;
			}

			@Override public Object getIdentityObject() {
				return member;
			}

			@Override public String toString() {
				return Debuggable.toInfoStringF(this);
			}

			@Override public KMCTrigger createTrigger(String menuFmt, DisplayContext ctx, Object poj) {
				return new KMCTriggerImpl(menuName, ctx, classOfBox, poj, member, isDeclNonStatic0, null, hasNoSideEffects) {
					@Override public void fire(Box targetBox) {
						super.fire(targetBox);
					}

					@Override public Object getIdentityObject() {
						return member;
					}

					@Override public Object valueOf(Box targetBox, ActionEvent actevt, boolean wantSideEffect, boolean isPaste) throws InvocationTargetException {
						try {
							if (!wantSideEffect)
								return null;
							valueOf.call().fire(targetBox);
							return null;
						} catch (InvocationTargetException ite) {
							throw ite;
						} catch (Exception e) {
							throw new InvocationTargetException(e);
						}
					}
				};
			}

			@Override public boolean appliesTarget(Class cls, Object anyObject) {
				return ReflectUtils.convertsTo(anyObject, cls, classOfBox);
			}

			@Override public String getMenuPath() {
				return "" + member;
			}

		});
	}
}

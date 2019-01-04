package org.appdapter.gui.trigger;

import static org.appdapter.core.convert.ReflectUtils.NO_CONVERTER;
import static org.appdapter.core.convert.ReflectUtils.getInterfaceMethod;
import static org.appdapter.core.convert.ReflectUtils.invokeA;
import static org.appdapter.core.convert.ReflectUtils.isStatic;
import static org.appdapter.core.log.Debuggable.printStackTrace;
import static org.appdapter.gui.trigger.TriggerMenuFactory.describeMethod;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.beans.FeatureDescriptor;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.AbstractButton;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

import org.appdapter.core.debug.UIAnnotations.AskIfEqual;
import org.appdapter.core.debug.UIAnnotations.UISalient;
import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.appdapter.core.component.KnownComponent;
import org.appdapter.core.convert.NoSuchConversionException;
import org.appdapter.core.convert.OptionalArg;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.UIAware;
import org.appdapter.gui.browse.PropertyDescriptorForField;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.browse.Utility.UtilityOptionalArgs;
import org.appdapter.gui.swing.SafeJCheckBoxMenuItem;
import org.appdapter.gui.swing.SafeJMenu;
import org.appdapter.gui.swing.SafeJMenuItem;

import com.hp.hpl.jena.rdf.model.Container;

public class TriggerForMember<BT extends Box<TriggerImpl<BT>>> extends TriggerForInstance<BT> implements Comparable<Trigger>, AskIfEqual, TriggerForClass {
	//extends TriggerForInstance implements Comparable<Trigger>, AskIfEqual {

	public static boolean ShowConvertedTargetTriggers = false;

	@UISalient(MenuName = "%m")
	static public boolean PrefixWithIndirectyWhenIndirect = true;

	@UISalient(MenuName = "%m")
	static public boolean UseShowForGetInButtonNames = false;

	/**
	 * 
	 *   isDeclNonStatic = true .. for static Methods can be treated like instance methods 
	 *      by placing the menu target as the first param
	 */
	boolean isDeclNonStatic;
	protected UISalient isSalientMethod;

	/**
	 *  can invoke a method without changing things
	 */
	public Member member;
	public FeatureDescriptor featureDesc;
	Class[] params;
	Object[] filledInParams;
	private String menuFormat;
	public PropertyDescriptorForField propDesc;
	Object retvalCache;
	private boolean isSideEffectSafe;
	boolean isTemplateTrigger = false;

	// means the _object is ingnored
	boolean isDeclaredLikeStatic;

	private boolean isPasteAtPopup;

	private boolean isStatic;

	public TriggerForMember(boolean isTemplate, String menuName, DisplayContext ctx, Class cls, Object obj, Member fd, boolean isDeclNonStatic0, FeatureDescriptor feature, boolean hasNoSideEffects) {
		isTemplateTrigger = isTemplate;
		init(menuName, ctx, cls, obj, fd, isDeclNonStatic0, feature);
		member = fd;
		setSideEffectSafe(hasNoSideEffects);
		recheckSideEffects(fd);
	}

	private void recheckSideEffects(Member fd) {

		if (fd != null && nonPrimReturnType() == Void.class) {
			// void methods must do someting (unsafe)
			setSideEffectSafe(false);
		}
		if (!isSideEffectSafe()) {
			if (fd != null && nonPrimReturnType() != Void.class) {
				if (member.getName().equals("getConverters")) {
					error("getConverters is not sideEffectSafe?");
				}
				if (isReady()) {
					String memberName = fd.getName();
					if (memberName.startsWith("get") || memberName.startsWith("is")) {
						if (Utility.isSideEffectReturnType(getReturnType())) {
							if (isStatic(fd) || Utility.isSideEffectSafe(getDeclaringClass())) {
								setSideEffectSafe(true);
							}
						}
					}
				}
			}
			// if (isSideEffectSafe) theLogger.warn("isSideEffectSafe " + fd);
		}
	}

	@Override public boolean appliesTarget(Class cls, Object anyObject) {
		Class classOfBox = getDeclaringClass();
		if (anyObject != null && classOfBox.isInstance(anyObject)) {
			if (this.member instanceof Method) {
				Collection col = ReflectUtils.getAllMethods(anyObject.getClass(), false);
				if (col.contains(this.member)) {
					return true;
				}
				if (this.isStatic) {
					return true;
				}
				if (classOfBox.isInterface())
					return true;
				return false;
			}
			return true;
		}

		if (classOfBox.isAssignableFrom(cls)) {
			return true;
		}
		if (!ReflectUtils.convertsTo(anyObject, cls, classOfBox))
			return false;
		if (!ShowConvertedTargetTriggers)
			return false;
		return true;
	}

	public boolean appliesToOperand(Class cls) {
		if (cls == null || cls == Void.class || cls == void.class) {
			return noOperand();
		}
		Class[] params = getParameters();
		if (params.length > 1)
			return ReflectUtils.isAssignableFrom(params[1], cls);
		return false;
	}

	public void applySalience(UISalient uiSalient) {
		if (uiSalient == null)
			return;
		this.isSalientMethod = uiSalient;
		String mn = uiSalient.MenuName();
		if (mn != null && mn.length() > 0) {
			menuFormat = mn;
			menuPath_cache = null;
			setShortLabel(mn);
			getMenuPath();
			setMenuInfo();
		}
		if (uiSalient.IsSideEffectSafe()) {
			setSideEffectSafe(true);
		}
		if (uiSalient.IsNotSideEffectSafe()) {
			setSideEffectSafe(false);
		}
		if (uiSalient.TreatLikeStatic()) {
			isDeclaredLikeStatic = true;
		}

	}

	/**
	 * Compares this object with the specified object for order. 
	 *
	 * <p>The subclasser must ensure <tt>sgn(x.compareTo(y)) ==
	 * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
	 * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
	 * <tt>y.compareTo(x)</tt> throws an exception.)
	 *
	 * @param   o the Trigger to be compared.
	 * @return  a 0 = if the objects are the same
	 *   +/-1 if the triggers have the same side effect
	 *   +/-2 if the triggers have a different side effect 
	 *
	 * @throws ClassCastException if the specified object's type prevents it
	 *         from being compared to this object.
	 */
	@Override public int compareTo(@SuppressWarnings("rawtypes") Trigger o) {
		if (this == o)
			return 0;
		else if (this == null)
			return 2;

		if (equalsByObject(o))
			return 0;

		boolean ej = equalJob(o);

		int labelDif = toString().compareTo(o.toString());
		if (ej)
			return (int) Math.signum(labelDif);
		return labelDif;
	}

	public TriggerForInstance createTrigger(String menuFmt, DisplayContext ctx, Object poj) {
		if (menuFmt == null)
			menuFmt = this.menuFormat;
		TriggerForMember tfm = new TriggerForMember(false, menuFmt, ctx, arg0Clazz, poj, member, isDeclNonStatic, featureDesc, isSideEffectSafe());
		tfm.applySalience(this.isSalientMethod);
		tfm.creator = this;
		tfm.useCount = this.useCount;
		return tfm;
	}

	public boolean equalJob(Trigger obj) {

		if (obj instanceof TriggerForClass)

			if (equalsByObject(obj))
				return true;
		if (!(obj instanceof KnownComponent)) {
			return false;
		}
		if (!(obj instanceof TriggerForType))
			return false;
		if (true)
			return getIdentityObject() == ((TriggerForType) obj).getIdentityObject();

		KnownComponent other = (KnownComponent) obj;
		/// assume they are named the same
		String osl = other.getShortLabel();
		if (osl != null && osl.equals(getShortLabel()))
			return true;

		// for now assume a different job if a different datatype
		if (!(obj instanceof TriggerForMember)) {
			return false;
		}

		TriggerForMember tfi = (TriggerForMember) obj;
		Class rt = getReturnType();
		if (rt != tfi.getReturnType())
			return false;
		Member rm = this.getMember();
		if (rm != null) {
			Member om = tfi.getMember();
			if (om != null) {
				boolean sameMName = rm.getName().equals(om.getName());
				if (sameMName) {
					if (ReflectUtils.getParameterTypes(om).length != ReflectUtils.getParameterTypes(rm).length) {
						return false;
					}
					return true;
				}
				return false;
			}
		}
		if (rt == void.class)
			return false;
		return true;

	}

	@Override public boolean equals(Object obj) {
		if (!(obj instanceof Trigger)) {
			return false;
		}
		Trigger other = (Trigger) obj;
		if (equalsByObject(other))
			return true;
		if (equalJob(other))
			return true;
		return false;
	}

	private boolean equalsByObject(Trigger o) {
		if (this == o)
			return true;
		else if (this == null)
			return false;
		if (!(o instanceof TriggerForMember)) {
			return false;
		}
		TriggerForMember tfi = (TriggerForMember) o;
		Member rm = this.getMember();
		if (rm != null) {
			Member om = tfi.getMember();
			if (om != null)
				return rm.getName().equals(om.getName());
		}
		if (tfi.getFieldSummary().equals(getFieldSummary()))
			return true;
		return false;
	}

	@Override public void fireIT(Object targetBox, ActionEvent actevt) throws InvocationTargetException {
		if (lastEvent == actevt) {
			getLogger().debug(Debuggable.toInfoStringArgV(this, " firing 0n ", targetBox, " with " + actevt));
		} else {
			getLogger().debug(Debuggable.toInfoStringArgV(this, " firing on ", targetBox, " with " + actevt));
		}
		Object obj = valueOf(targetBox, actevt, true, wasPaste(actevt));
		Class rt = nonPrimReturnType();
		try {
			Utility.addSubResult(this, targetBox, actevt, obj, rt);
		} catch (PropertyVetoException e) {
			Debuggable.printStackTrace(e);
		}

	}

	public boolean wasPaste(ActionEvent actevt) {
		return isPasteAtPopup;
	}

	public Class getDeclaringClass() {
		if (arg0Clazz != null)
			return arg0Clazz;
		Class fi = getMember().getDeclaringClass();//  classOrFirstInterfaceR(_clazz);
		if (propDesc != null) {
			fi = propDesc.getField().getDeclaringClass();
		}
		return fi;
	}

	@Override public String getDescription() {
		String myDescription = super.getDescription();
		if (myDescription == null) {
			myDescription = "" + getIdentityObject();
			setDescription(myDescription);
		}
		return myDescription;
	}

	public @Override Object getIdentityObject() {
		return member;
	}

	public Member getMember() {
		if (propDesc != null) {
			return propDesc.getField();
		}
		return member;
	}

	public String getMenuPath() {
		boolean was = Debuggable.isNotShowingExceptions();
		Debuggable.setDoNotShowExceptions(true);
		try {
			if (this.menuPath_cache == null || isPasteAtPopup || isReady()) {
				isPasteAtPopup = false;
				menuPath_cache = makeMenuPath();
			}
			return this.menuPath_cache;
		} finally {
			Debuggable.setDoNotShowExceptions(was);
		}
	}

	public boolean isReady() {
		if (isPasteAtPopup)
			return true;
		return getMissingParametersAtPopup() == 0;
	}

	public String makeMenuPath() {
		if (menuFormat != null && !menuFormat.contains("%") && menuFormat.length() > 1)
			// pre-named?
			return menuFormat;
		Object o1 = Utility.dref(_object);
		Class tdc = getDeclaringClass();
		Class mdc = member.getDeclaringClass();
		Class odc = mdc;
		Class ifc = tdc;
		if (o1 != null) {
			ifc = odc = o1.getClass();
		}
		if (mdc.isInterface()) {
			ifc = mdc;
		}

		Type[] gi = ReflectUtils.getGenericInterfaces(odc);
		int ifcCont = gi.length;

		Class getReturnType = getReturnType();
		int missingParamsTotal = getMissingParametersAtPopup();
		/*
		   return getMenuPath(menuFormat, !isDeclNonStatic && ReflectUtils.isStatic(member), o1, tdc, mdc, getReturnType(), new Callable() {
		   @Override public Object call() throws Exception {
		   return valueOf(null, null, false, false);
		   }
		   }, member.getName(), getMissingParametersAtPopup(), new Utility.UtilityOptionalArgs(OptionalArg.OPTIONAL_FROM_DEFAULTS), this);
		   }
		
		   public String getMenuPath(String menuFormat, boolean isStatic, Object o1, Class tdc, Class mdc, Class getReturnType,
		
		   Callable valueOf, String memberName, int missingParamsTotal, OptionalArg optionals, TriggerForMember memb) {
		   */
		boolean isStatic = !isDeclNonStatic && ReflectUtils.isStatic(member);
		String prefix = "";
		StringBuffer suffix = new StringBuffer();

		String s = menuFormat;
		if (s == null || s.length() == 0) {
			s = "%c|%m";
			if (isDeclNonStatic) {
				s = "%m";
			}
		}

		if (isStatic) {
			prefix = "Static|";
		}

		boolean isIndirect = (o1 != null && !tdc.isInstance(o1));

		if (s.contains("%c")) {

			if (false && !tdc.isInterface()) {
				Member member = getMember();
				if (member instanceof Method) {
					Class fi = member.getDeclaringClass();
					Method m = getInterfaceMethod(fi, (Method) member);
					if (m == null) {
						Class srch = mdc;
						if (!isStatic(member)) {
							if (o1 != null) {
								srch = o1.getClass();
							}
						}
						if (srch != fi) {
							m = getInterfaceMethod(srch, (Method) member);
						}
					}
					if (m != null) {
						mdc = m.getDeclaringClass();
						//tdc = mdc;
						if (mdc.isInterface()) {
							ifc = mdc;
						}
					}
				}
			}

			if (ifc.isInterface()) {
				if (ifcCont > 5) {
					prefix = "* Interfaces|" + prefix;
				} else {
					prefix = "* " + prefix;
				}
			}
			String strval = ReflectUtils.getCanonicalSimpleName(ifc);
			if (isIndirect) {
				isIndirect = true;
				if (PrefixWithIndirectyWhenIndirect) {
					suffix.append(" (" + strval + ")");
					strval = "Indirectly";
				}
			}
			s = replace(s, "%c", strval);
		}
		if (s.contains("%d")) {
			String strval = Utility.getSpecialClassName0(mdc);
			if (isIndirect) {
				if (PrefixWithIndirectyWhenIndirect) {
					suffix.append(" (" + strval + ")");
					strval = "Indirectly";
				}
			}
			s = replace(s, "%d", strval);
		}
		if (s.contains("%o")) {
			String strval = Utility.getUniqueNameForKey(ReflectUtils.recastOrOtherwise(o1, tdc, "<NoConversion>"));
			s = replace(s, "%o", strval);
		}
		if (s.contains("%t")) {
			String strval = Utility.getUniqueNameForKey(o1);
			s = replace(s, "%t", strval);
		}
		if (s.contains("%i")) {
			Class fi = mdc;
			if (!fi.isInterface()) {
				Class[] fis = fi.getInterfaces();
				if (fis.length > 0) {
					fi = fis[0];
				}
				if (!fi.isInterface()) {
					if (o1 != null) {
						fi = o1.getClass();
						fis = fi.getInterfaces();
						if (fis.length > 0) {
							fi = fis[0];
						}
					}
				}
				if (!fi.isInterface()) {
					fis = fi.getInterfaces();
					if (fis.length > 0) {
						fi = fis[0];
					}
				}
				if (!fi.isInterface()) {
					fi = tdc;
				}
				if (!fi.isInterface()) {
					fis = fi.getInterfaces();
					if (fis.length > 0) {
						fi = fis[0];
					}
				}
			}
			String strval = Utility.getShortClassName(fi);
			if (o1 != null && !fi.isInstance(o1)) {
				isIndirect = true;
				if (PrefixWithIndirectyWhenIndirect) {
					suffix.append(" (" + strval + ")");
					strval = "Indirectly";
				}
			}
			s = replace(s, "%i", strval);
		}

		if (s.contains("%r")) {
			String strval = Utility.getShortClassName(getReturnType);
			s = replace(s, "%r", strval);
		}

		if (s.contains("%v")) {
			String strval = "";
			try {
				Object obj = valueOf(null, null, false, false);
				if (obj != null) {
					strval = strval + Utility.getUniqueNamePretty(obj);
				}
			} catch (Exception e) {
			}
			s = replace(s, "%v", strval);
		}
		if (s.contains("%m")) {
			String strval = member.getName();
			if (UseShowForGetInButtonNames && strval.length() > 4) {
				if (Character.isUpperCase(strval.charAt(3))) {
					strval = replace(strval, "get", "Show");
					strval = replace(strval, "set", "Replace");
				} else if (Character.isUpperCase(strval.charAt(2))) {
					strval = replace(strval, "is", "Show");
				}
			}
			strval = Utility.spaceCase(Utility.properCase(strval));
			if (nonPrimReturnType() == Void.class) {
				strval = "* " + strval;
			}
			boolean showMoreParamsNeeded = true;
			Class[] params = getParameters();
			Object[] filledInParams = this.filledInParams;
			int plen = params.length;
			if (missingParamsTotal == 1 && plen == 2) {
				OptionalArg optionals = new UtilityOptionalArgs(OptionalArg.OPTIONAL_FROM_CLIPBOARD);
				int last = plen - 1;
				Class operand = params[last];
				try {
					Object paste = optionals.getArg(operand);
					if (operand.isInstance(paste)) {
						missingParamsTotal = 0;
						if (filledInParams == null) {
							this.filledInParams = new Object[] { this._object, paste };
						} else {
							filledInParams[last] = paste;
						}

						strval = "Paste|" + strval + " with '" + Utility.getUniqueNamePretty(paste) + "'";
						isPasteAtPopup = true;
						showMoreParamsNeeded = false;
					}
				} catch (NoSuchConversionException e) {
				}
			}

			if (missingParamsTotal > 0) {
				//filledInParams = memb.filledInParams;
				if (filledInParams != null) {
					int tryForMore = getNullCount(filledInParams);
					OptionalArg optionals = new UtilityOptionalArgs(OptionalArg.OPTIONAL_FROM_DEFAULTS);
					if (optionals != null) {
						tryForMore = fillInParamsFromUI(optionals, suffix);
					}
					if (tryForMore == 0) {
						missingParamsTotal = 0;
						showMoreParamsNeeded = false;
						strval = "With Param Context|" + strval;
					}
				}
				if (showMoreParamsNeeded) {
					strval = "More Params Needed|" + strval;
				}
			}

			s = replace(s, "%m", strval);
		}
		if (missingParamsTotal > 0) {
			if (!s.contains("%p"))
				s = s + " %p";
		}
		if (s.contains("%p")) {
			String strval = "";
			Class[] params = getParameters();
			for (int i = 0; i < params.length; i++) {
				if (strval == "") {
					strval = Utility.getShortClassName(params[i]);
				} else {
					strval += "," + Utility.getShortClassName(params[i]);
				}
			}
			s = replace(s, "%p", "(" + strval + ")");
		}

		return prefix + s + suffix.toString();
	}

	int fillInParamsFromUI(OptionalArg optionals, Appendable debugBuf) {
		int missingParamsTotal = getMissingParametersAtPopup();
		if (missingParamsTotal > 0) {
			if (filledInParams != null) {
				missingParamsTotal = getNullCount(filledInParams);
				if (optionals != null) {
					optionals.reset();
					int plen = params.length;
					for (int i = 0; i < plen; i++) {
						Class needed = params[i];
						Object have = filledInParams[i];
						if (have == null) {
							try {
								have = optionals.getArg(needed);
								if (needed.isInstance(have)) {
									filledInParams[i] = have;
									missingParamsTotal--;
									if (debugBuf != null)
										try {
											debugBuf.append(" (arg" + i + "='" + Utility.getUniqueNamePretty(have) + "')");
										} catch (IOException e) {
										}
								}
							} catch (NoSuchConversionException e) {
								//		break;
							}
						}
					}
				}
			}
		}
		return missingParamsTotal;
	}

	private static String replace(String s, String f, String r) {
		if (r == null || r.length() == 0)
			return s;
		return s.replace(f, r);
	}

	public int getMissingParametersAtPopup() {
		Class[] params = getParameters();
		int needsArgumentsTotal = params.length;

		if (!isDeclaredLikeStatic) {
			if (_object != null) {
				if (filledInParams == null) {
					filledInParams = new Object[params.length];
				}
				if (filledInParams.length == 0) {
					return 0;
				}
				filledInParams[0] = _object;
				needsArgumentsTotal--;
			}
		}
		return needsArgumentsTotal;
	}

	static public int getNullCount(Object[] filledIn) {
		int nullz = 0;
		for (Object o : filledIn) {
			if (o == null)
				nullz++;
		}
		return nullz;
	}

	public Class[] getParameters() {
		if (params == null) {
			Member m = getMember();
			ArrayList<Class> al = new ArrayList<Class>();
			if (m != null) {
				if (!isStatic)
					al.add(getDeclaringClass());

				if (!(m instanceof Field)) {
					for (Class c : ReflectUtils.getParameterTypes(m)) {
						al.add(c);
					}
				}
			}
			params = al.toArray(new Class[al.size()]);
			if (filledInParams == null) {
				filledInParams = new Object[params.length];
			}
		}
		return params;
	}

	public Class getReturnType() {
		if (propDesc != null) {
			return propDesc.getField().getType();
		}
		Member m = getMember();
		if (m == null)
			return null;
		return ReflectUtils.getReturnType(m);
	}

	public Object getSafeValue() {
		if (retvalCache != null)
			return retvalCache;
		if (isSideEffectSafe()) {
			try {
				return retvalCache = valueOf(null, null, false, false);
			} catch (Throwable e) {
			}
		}
		return null;
	}

	public void init(String menuFmt, DisplayContext ctx, Class cls, Object obj, Member fd, boolean isDeclNonStatic0, FeatureDescriptor feature) {
		if (menuFmt != null && menuFmt.length() < 2) {
			menuFmt = null;
		}
		this.menuFormat = menuFmt;
		arg0Clazz = cls;
		member = fd;
		displayContext = ctx;
		featureDesc = feature;
		_object = obj;
		isDeclNonStatic = isDeclNonStatic0;
		this.isStatic = ReflectUtils.isStatic(member);
		if (isDeclNonStatic && !isStatic) {
			theLogger.warn("isDeclNonStatic to non static " + member);
		}

		String desc = describeMethod(fd);
		Class[] ps = getParameters();
		if (ps.length > 0) {
			arg0Clazz = getParameters()[0];
		}

		boolean dirrect = arg0Clazz.isInstance(obj);

		if (!isTemplateTrigger && !dirrect && ps.length > 0) {
			error("not isntance of " + arg0Clazz);
		}
		if (isTemplateTrigger && dirrect) {
			error("not isntance of " + arg0Clazz);
		}

		if (featureDesc instanceof PropertyDescriptorForField) {
			setSideEffectSafe(true);
			propDesc = (PropertyDescriptorForField) feature;
			desc = desc + " " + propDesc.getShortDescription();
			//menuName = propDesc.getSyntheticName(member);
			Field f = propDesc.getField();
			Method rm = propDesc.getReadMethod();
			if (rm == null || rm == member) {
				member = f;
				arg0Clazz = f.getDeclaringClass();
			}
			setDescription(desc);
		} else {
			setDescription(desc);
		}
		//setShortLabel(getShortLabel());
	}

	private void error(String msg) {
		Utility.bug(msg);

	}

	@Override public AbstractButton makeMenuItem(String menuName, final Object b) {
		retvalCache = null;
		//AbstractButton jmi;
		if (menuName == null)
			menuName = getMenuName();

		if (jmi != null) {
			jmi = null;
		}
		final TriggerForMember trig = this;

		if (isSideEffectSafe() && nonPrimReturnType() == Boolean.class) {
			jmi = new SafeJCheckBoxMenuItem(b, true, menuName, null, getSafeValue() == Boolean.TRUE);

		} else {

			jmi = new SafeJMenuItem(b, true, menuName);
		}

		if (trig instanceof UIAware) {
			jmi = (AbstractButton) ((UIAware) trig).visitComponent(jmi);
		}
		jmi.addActionListener(this);
		//if (this.jmi == null)
		//	this.jmi = jmi;
		return jmi;
	}

	private Class nonPrimReturnType() {
		return ReflectUtils.nonPrimitiveTypeFor(getReturnType());
	}

	public boolean noOperand() {
		Class[] params = getParameters();
		return params.length < 2;
	}

	public void setMenuInfo() {
		if (jmi == null) {
			jmi = makeMenuItem(null, _object);
		}
		Member m = getMember();
		if (m == null) {
			jmi.setBackground(Color.RED);
			return;
		}
		boolean isStatic = !isDeclNonStatic && ReflectUtils.isStatic(m);
		if (isStatic) {
			jmi.setBackground(Color.ORANGE);
		}

		if (nonPrimReturnType() == Boolean.class) {
			if (isSideEffectSafe()) {
				boolean b;
				try {
					Object res = getSafeValue();
					if (res != null) {
						b = (boolean) (Boolean) res;
						jmi.setSelected(b);
					}
				} catch (Throwable e) {
				}
			}
		}

		int missingArgumentsTotal = getMissingParametersAtPopup();

		if (filledInParams != null) {
			int nulls = getNullCount(filledInParams);
			missingArgumentsTotal = nulls;
		}
		if (missingArgumentsTotal > 1) {
			jmi.setForeground(Color.WHITE);
			jmi.setBackground(Color.BLACK);
		} else if (missingArgumentsTotal > 2) {
			jmi.setForeground(Color.GRAY);
			jmi.setBackground(Color.BLACK);
		} else {
			if (missingArgumentsTotal > 0) {
				jmi.setForeground(Color.GRAY);
			}
		}
	}

	public Object valueOf(Object targetBox, ActionEvent actevt, boolean wantSideEffect, boolean isPaste) throws InvocationTargetException {
		boolean was = Debuggable.isNotShowingExceptions();
		if (!wantSideEffect) {
			Debuggable.setDoNotShowExceptions(true);
		} else {
			addUseCount();
			if (eventHandled) {
				return retvalCache;
			}
		}
		try {
			return valueOfImpl(targetBox, actevt, wantSideEffect, isPaste);
		} finally {
			Debuggable.setDoNotShowExceptions(was);
			//lastEvent = null;
			eventHandled = false;
		}
	}

	public void addUseCount() {
		useCount++;
		if (creator instanceof TriggerForInstance) {
			TriggerForInstance tfi = (TriggerForInstance) creator;
			tfi.useCount++;
		}

	}

	// ==true mean another event handler has handled the event
	boolean eventHandled = false;

	//MouseEvent lastEvent = null;

	@Override public void onMouseEvent(MouseEvent event) {
		Object src = event.getSource();
		if (src instanceof AbstractButton && src != jmi) {
			jmi = (AbstractButton) src;
		}
		if (super.lastMEvent == event) {
			return;
		}
		super.lastMEvent = event;
		boolean popOutAndNotUp = event.getButton() != 3;
		// handling a right click
		Class type = nonPrimReturnType();
		if (type == Void.class)
			return;
		TriggerMenuFactory tmf = TriggerMenuFactory.getInstance(this);
		if (isSideEffectSafe()) {
			Object valueAtTip;
			try {

				if (jmi == null) {
					return;
				}
				//synchronized (jmi) 
				{
					//event.consume();
					if (eventHandled)
						return;
				}
				valueAtTip = getSafeValue();
				if (valueAtTip == null) {
					valueAtTip = type;
				}
				Container from = null;
				if (jmi instanceof Container) {
					from = (Container) jmi;
				}
				if (src instanceof Container) {
					from = (Container) src;
				}
				// this mouse event handler handles it now
				for (ActionListener al : jmi.getActionListeners()) {
					jmi.removeActionListener(al);
				}
				if (popOutAndNotUp && from != null) {
					showSubMenuExtend(event, valueAtTip, from);
				} else {
					showSubMenuPopup(event, valueAtTip, from);
				}
				eventHandled = true;

			} catch (Throwable e) {
				e.printStackTrace();
			}

		}

	}

	private void showSubMenuPopup(MouseEvent event, Object valueAtTip, Container from) {
		JPopupMenu tpm = TriggerMenuFactory.buildPopupMenuAndShow(event, false, valueAtTip);
		tpm.setLocation((int) event.getLocationOnScreen().getX(), (int) event.getLocationOnScreen().getY());
		tpm.show();
	}

	private void showSubMenuExtend(MouseEvent event, Object valueAtTip, Container from) {
		String submenuName = Utility.getUniqueNameForKey(valueAtTip);
		JMenu tpm = new SafeJMenu(true, submenuName, valueAtTip);
		TriggerMenuFactory.addTriggersToPopup(valueAtTip, tpm);
		from.add(tpm);
		tpm.show();
	}

	private Object valueOfImpl(Object targetBox, ActionEvent actevt, boolean wantSideEffect, boolean isPaste) throws InvocationTargetException {
		Class rt = nonPrimReturnType();
		Member m = getMember();
		{

			try {
				Object tryValue = getParam0(targetBox);
				if (m instanceof Field) {
					String op = "Setting";
					Field f = (Field) m;
					String fname = f.getName();
					Class t = f.getType();
					Object value = ReflectUtils.getFieldValue(tryValue, f.getDeclaringClass(), arg0Clazz, fname);
					if (wantSideEffect) {
						boolean doSet = false;
						if (rt == Boolean.class) {
							value = !((boolean) (Boolean) value);
							doSet = true;
							op = "Toggling";
						} else {
							if (isPaste) {
								try {
									value = Utility.getOptionalArg(t, OptionalArg.OPTIONAL_FROM_CLIPBOARD, true);
									op = "Paste";
								} catch (Throwable tt) {
									throw tt;
								}
							}
						}
						if (doSet) {
							getLogger().debug(op + " " + f + " = " + value);
							Class fclass = f.getDeclaringClass();
							ReflectUtils.setField(tryValue, fclass, arg0Clazz, fname, value);
						} else {
							getLogger().debug("Not " + op + "  " + f + " = " + value);
						}
					}
					return value;
				}
				// is a method
				if (m instanceof Method) {
					if (isSideEffectSafe() || wantSideEffect) {
						OptionalArg optionalArg = new UtilityOptionalArgs(getOptionalArgSpec());
						int missing = fillInParamsFromUI(optionalArg, null);
						if (missing == 0 && retvalCache == null) {
							retvalCache = invokeA(tryValue, NO_CONVERTER, (Method) m, filledInParams);
						}
						return retvalCache;
					} else {
						return retvalCache;
					}
				}
				return retvalCache;
			} catch (NoSuchConversionException e) {
				if (logError(e, wantSideEffect))
					return null;
				throw e;
			} catch (ClassCastException e) {
				if (logError(e, wantSideEffect))
					return null;
				throw e;
			} catch (InvocationTargetException e) {
				if (logError(e, wantSideEffect))
					return null;
				throw e;
			} catch (Throwable e) {
				logError(e, wantSideEffect);
				if (!wantSideEffect)
					return null;
				printStackTrace(e);
				throw new InvocationTargetException(e);
			}
		}
	}

	private boolean logError(Throwable e, boolean wantSideEffect) {
		if (isSideEffectSafe && !wantSideEffect) {
			// error without wanting side effects
			setSideEffectSafe(false);
		}
		return !wantSideEffect;

	}

	protected Object getParam0(Object targetBox) {
		Object tryValue = targetBox;
		if (_object != null) {
			tryValue = _object;
		}
		return tryValue;
	}

	private short getOptionalArgSpec() {
		short optionalArgSpec = OptionalArg.OPTIONAL_FROM_SINGLETON;
		if (isPasteAtPopup) {
			optionalArgSpec += OptionalArg.OPTIONAL_FROM_CLIPBOARD;
		}
		return optionalArgSpec;
	}

	public boolean isSideEffectSafe() {
		if (creator != null && !creator.isSideEffectSafe())
			return false;
		if (!Utility.isSideEffectSafe(getDeclaringClass()))
			return false;
		return isSideEffectSafe;
	}

	void setSideEffectSafe(boolean val) {
		if (creator instanceof TriggerForMember && val == false)
			((TriggerForMember) creator).isSideEffectSafe = false;
		this.isSideEffectSafe = val;
	}
}
/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ResumeException;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.IsolatedClassLoader;
import com.cyc.tool.subl.util.PatchFileLoader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class Loader {
	private static final List<Runnable>[] Passes = new List[] { new ArrayList<Runnable>(), new ArrayList<Runnable>(), new ArrayList<Runnable>() };
	private static int delayPass = 0;

	//// Public Area
	public static String baseCheck = null;
	public static SubLFile currentFile;
	public static Object currentStage = "NUN";
	public static List<String> notAgain = new ArrayList<String>();
	public static List<String> shouldOverride = new ArrayList<String>();
	public static List<String> skippedClasses = new ArrayList<String>();
	public static boolean usePrevious = true;
	public static boolean else_do = true;
	public static String suffix = "";

	static {
		//skippedClasses.add("com.cyc.cycjava.cycl.kbi_.*");
		if (false) {
			skippedClasses.add("com.cyc.cycjava_.*.cycl.cfasl.*");
			skippedClasses.add("com.cyc.cycjava_.*.cycl.dictionary.*");
		}
		// skippedClasses.add("com.cyc.cycjava_3.cycl.cfasl.*");
		// skippedClasses.add("com.cyc.cycjava_2.cycl.dictionary.*");

	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	public static boolean nothingBoundP() {
		if (!SubLTranslatedFile.installingUnderlay)
			return false;
		if ("initializeVariables".equals(currentStage))
			return true;
		return false;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param b
	 */
	public static void setBase(String b) {
		baseCheck = b;

	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param object
	 */
	public static void addPass(int n, Runnable object) {
		if (delayPass < n) {
			object.run();
		} else {
			Passes[n].add(object);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param object
	 */
	public static void withUnderlay(int n, boolean ol, Runnable object) {
		addPass(n, () -> {
			boolean wasNothingBoundP = SubLTranslatedFile.installingUnderlay;
			try {
				SubLTranslatedFile.installingUnderlay = ol;
				object.run();
			} finally {
				SubLTranslatedFile.installingUnderlay = wasNothingBoundP;
			}
		});
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	public static void completePass() {
		for (int n = 0; n < Passes.length; n++) {
			List<Runnable> Pass1 = new ArrayList<Runnable>(Passes[n]);
			Passes[n].clear();
			for (Iterator iterator = Pass1.iterator(); iterator.hasNext();) {
				Runnable runnable = (Runnable) iterator.next();
				runnable.run();
			}
		}
	}

	/**
	 * @param string
	 */
	public static void declareOverridable(String string) {
		shouldOverride.add(string);
	}

	public static void initialize_subl_file(SubLFile file) {
		org.armedbear.lisp.Package p = SubLPackage.getCurrentPackage();
		SubLFile was = currentFile;
		Object statge = currentStage;
		Class fileClass = file.getClass();
		String fileClassName = fileClass.getName();
		String wasCN = SubLFiles.currentClassName;
		try {
			Field f = fileClass.getDeclaredField("myName");
			String maybeFileClassName = (String) f.get(null);
			if (maybeFileClassName != null) {
				if (fileClassName == null || !fileClassName.contentEquals(maybeFileClassName)) {
					//  Errors.warn("maybeFileClassName: " + fileClassName + " -> " + maybeFileClassName);
					//fileClassName = maybeFileClassName;
				}
			}
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e1) {
		}

		boolean wasUUSE_V1 = SubLFiles.USE_V1;
		boolean wasUUSE_V2 = SubLFiles.USE_V2;
		boolean pass2 = false;

		String wasoriginalFileClassName = "" + SubLFiles.originalFileClassName;

		if (wasoriginalFileClassName.contains(".cycjava.")) {
			SubLFiles.USE_V1 = true;
			SubLFiles.USE_V2 = false;
		} else if (wasoriginalFileClassName.contains(".cycjava_2.")) {
			SubLFiles.USE_V1 = false;
			SubLFiles.USE_V2 = true;
			pass2 = true;
		}
		if (V02.class.isInstance(file)) {
			else_do = true;
		}

		try {
			currentFile = file;
			SubLFiles.currentClassName = fileClassName;

			currentStage = "declareFunctions";
			boolean hasAlt = hasMethod("declare_|_file" + "_alt", fileClass);
			if (!pass2 || (hasAlt && pass2) || else_do) {
				if (!usePrevious || !maybeCallMethod("declare_|_file" + suffix, fileClass))
					if (else_do)
						file.declareFunctions();
			}

			currentStage = "initializeVariables";
			hasAlt = hasMethod("init_|_file" + "_alt", fileClass);
			if (!pass2 || (hasAlt && pass2) || else_do) {
				if (!usePrevious || !maybeCallMethod("init_|_file" + suffix, fileClass))
					if (else_do)
						file.initializeVariables();
			}

			currentStage = "runTopLevelForms";
			hasAlt = hasMethod("setup_|_file" + "_alt", fileClass);
			if (!pass2 || (hasAlt && pass2) || else_do) {
				if (!usePrevious || !maybeCallMethod("setup_|_file" + suffix, fileClass))
					if (else_do)
						file.runTopLevelForms();
			}

		} catch (Throwable e) {
			currentStage = currentStage + "_ERROR";
			e.printStackTrace();
			try {
				Errors.cerror("Continue.", "Error initializing SubL file: " + file.getClass().getName(), e);
			} catch (ResumeException re) {
			}
		} finally {
			currentFile = was;
			currentStage = statge;
			SubLFiles.currentClassName = wasCN;
			SubLFiles.USE_V1 = wasUUSE_V1;
			SubLFiles.USE_V2 = wasUUSE_V2;
			SubLPackage.setCurrentPackage(p);
		}
	}

	public static void initialize_subl_file(Class clazz) {
		final String className = clazz.getName();
		notAgain.add(className);

		org.armedbear.lisp.Package p = SubLPackage.getCurrentPackage();
		try {
			if (p != Lisp.PACKAGE_SUBLISP && p != Lisp.PACKAGE_CYC)
				SubLPackage.setCurrentPackage("CYC");
			try {
				//ClassLoader loader = clazz.getClassLoader();
				Field meField = null;
				try {
					meField = clazz.getDeclaredField("me");
				} catch (java.lang.NoSuchFieldException e) {
					try {
						meField = clazz.getField("me");
					} catch (NoSuchFieldException | SecurityException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if (meField == null)
					throw new RuntimeException("Bad SubLFile: " + className);
				meField.setAccessible(true);
				SubLFile file = (SubLFile) meField.get(null);
				if (file == null) {
					file = (SubLFile) clazz.newInstance();
				}
				if (file == null)
					throw new RuntimeException("Bad SubLFile: " + className);
				initialize_subl_file(file);
			} catch (Throwable e) {
				e.printStackTrace();
				Errors.cerror("Continue.", "Error initializing SubL file: " + className, e);
			}
		} finally {
			SubLPackage.setCurrentPackage(p);
		}
	}

	public static void initialize_subl_file_exact(String className, boolean isExact) {
		String shortClassName = className.substring(className.indexOf(".cycl.") + 1);
		if (skippedClasses.contains(className)) {
			return;
		}

		if (baseCheck != null) {
			if (isClassStem(className)) {
				className = baseCheck + "." + className;
			}
		}

		for (String sc : skippedClasses) {
			if (className.matches(sc)) {
				// Errors.warn("Skipping: " + className);
				skippedClasses.add(className);
				return;
			}
		}

		final org.armedbear.lisp.Package p = SubLPackage.getCurrentPackage();
		final String wasOrigFileClassName = SubLFiles.originalFileClassName;
		boolean removeAgain = true;
		boolean was = SubLTranslatedFile.installingUnderlay;

		if (baseCheck == null) {
			if (notAgain.contains(className)) {
				// Errors.warn("Not again: " + className);
				return;
			} else if (notAgain.contains(shortClassName)) {
				//Errors.warn("Again: " + className);
				notAgain.add(className);

				if (!SubLTranslatedFile.installingUnderlay) {
					SubLTranslatedFile.installingUnderlay = true;
				}
			} else {
				notAgain.add(className);
				notAgain.add(shortClassName);
			}
		}

		try

		{
			if (p != Lisp.PACKAGE_SUBLISP && p != Lisp.PACKAGE_CYC)
				SubLPackage.setCurrentPackage("CYC");
			SubLFiles.originalFileClassName = className;
			try {
				final ClassLoader pATCH_FILE_LOADER = PatchFileLoader.PATCH_FILE_LOADER;
				Class clazz = findClassOrNearby(className, pATCH_FILE_LOADER, isExact);
				initialize_subl_file(clazz);
				removeAgain = false;
			} catch (Throwable e) {
				e.printStackTrace();
				Errors.cerror("Continue.", "Error initializing SubL file: " + className, e);
			}
		} finally {
			SubLFiles.originalFileClassName = wasOrigFileClassName;
			if (!was && SubLTranslatedFile.installingUnderlay) {
				SubLTranslatedFile.installingUnderlay = false;
			}
			if (removeAgain)
				notAgain.remove(className);
			SubLPackage.setCurrentPackage(p);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param className
	 * @param pATCH_FILE_LOADER
	 * @param isExact
	 * @return
	 * @throws ClassNotFoundException
	 */
	private static Class findClassOrNearby(String className, final ClassLoader pATCH_FILE_LOADER, boolean isExact) throws ClassNotFoundException {
		Class clazz = null;
		try {
			if (clazz == null)
				clazz = pATCH_FILE_LOADER.loadClass(className);
		} catch (ClassNotFoundException e) {
			if (isExact)
				throw e;
			String otherClassName = className.replace(".cycjava_2.", ".cycjava_0.");
			if (otherClassName.equals(className)) {
				otherClassName = className.replace(".cycjava.", ".cycjava_0.");
			}
			try {
				clazz = pATCH_FILE_LOADER.loadClass(otherClassName);
			} catch (ClassNotFoundException e3) {
				otherClassName = className.replace(".cycjava_2.", ".cycjava.");
				if (otherClassName.equals(className)) {
					otherClassName = className.replace(".cycjava.", ".cycjava_2.");
				}
				try {
					clazz = pATCH_FILE_LOADER.loadClass(otherClassName);
				} catch (ClassNotFoundException e2) {
					throw e;
				}
			}
		}
		return clazz;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param className
	 * @return
	 */
	private static boolean isClassStem(String className) {
		if (className.startsWith("com.") || className.startsWith("org."))
			return false;
		return !className.contains("cycjava");
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param shortName
	 * @param superCl
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	static boolean maybeCallBaseMethod(int n, String prefix, Class fileClass, boolean superClass) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class superCl = fileClass.getSuperclass();
		if (superCl == java.lang.Object.class || superCl == null)
			return false;
		if (superCl.getPackage() == SubLTranslatedFile.class.getPackage())
			return false;

		String shortName = superCl.getSimpleName();
		String superMethod = prefix + shortName + "_file";
		boolean was = SubLTranslatedFile.installingUnderlay;
		try {
			Method m = superCl.getDeclaredMethod(superMethod);
			m.setAccessible(true);
			SubLTranslatedFile.installingUnderlay = true;
			withUnderlay(n, true, () -> {
				try {
					m.invoke(null);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		} catch (Exception e) {
			//e.printStackTrace();
			return false;
		} finally {
			SubLTranslatedFile.installingUnderlay = was;
		}
		return true;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param string
	 * @param fileClass
	 * @return
	 */
	private static boolean maybeCallMethod(String string, Class fileClass) {
		String shortName = fileClass.getSimpleName();
		String superMethod = string.replace("|", shortName);
		Method m;
		try {
			m = IsolatedClassLoader.getDeclaredMethod(fileClass, superMethod);
		} catch (NoSuchMethodException e) {
			return false;
		}
		m.setAccessible(true);
		try {
			m.invoke(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	private static boolean hasMethod(String string, Class fileClass) {
		String shortName = fileClass.getSimpleName();
		String superMethod = string.replace("|", shortName);
		Method m;
		try {
			m = IsolatedClassLoader.getDeclaredMethod(fileClass, superMethod);
		} catch (NoSuchMethodException e) {
			return false;
		}
		return true;
	}

	public static SubLFunction declareFunction(Class file, String className, String methodName, String functionName, int requiredArgCount, int optionalArgCount, boolean allowsRest) {
		final boolean neverRedefine = SubLMain.Never_REDEFINE;
		final boolean alwaysRedefine = SubLMain.Always_REDEFINE;

		try {
			List<Class> parameterTypes = new ArrayList<Class>();
			for (int i = 0; i < requiredArgCount + optionalArgCount; i++)
				parameterTypes.add(SubLObject.class);
			if (allowsRest)
				parameterTypes.add(SubLObject[].class);
			Class[] parameterArray = parameterTypes.toArray(new Class[parameterTypes.size()]);
			Method meth = null;

			if (file != null) {
				meth = getMethod(file, methodName, parameterArray);
			}

			SubLPackage currentPackage = SubLPackage.getCurrentPackage();
			SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);

			if (!functionSymbol.fboundp()) {
				SubLFunction using;
				if (meth == null) {
					using = SubLObjectFactory.makeCompiledFunction(className, methodName, parameterArray, SubLObject.class, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
				} else {
					using = SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
				}
				return using;
			}

			// Conflicts??!
			SubLFunction previous = null;
			previous = functionSymbol.getFunc();
			if (previous.isMacroOperator()) {
				previous = previous.toMacro().getMacroExpander();
			}
			final int b = parameterArray.length - previous.applyArity() + (previous.allowsRest() ? 1 : 0);
			if (b == 0) {
				if (SubLTranslatedFile.installingUnderlay) {
					if (!alwaysRedefine)
						return previous;
				}
				if (!alwaysRedefine) {
					//Errors.warn("Attempt to redefine: " + functionSymbol);
					return previous;
				}
			}
			if (SubLTranslatedFile.installingUnderlay) {
				if (!alwaysRedefine)
					return previous;
			}
			SubLSymbol found = functionSymbol;
			final SubLPackage package1 = found.getPackage();
			if (currentPackage == Lisp.PACKAGE_CYC || currentPackage == Lisp.PACKAGE_SUBLISP) {
				if (package1 != Lisp.PACKAGE_SUBLISP && package1 != Lisp.PACKAGE_CYC) {
					currentPackage.unintern(found);
					functionSymbol = currentPackage.findAccessibleSymbol(functionName);
					if (functionSymbol == null)
						functionSymbol = Lisp.PACKAGE_SUBLISP.findAccessibleSymbol(functionName);
					if (functionSymbol == null)
						functionSymbol = Lisp.PACKAGE_CYC.findAccessibleSymbol(functionName);
					if (functionSymbol == null) {
						functionSymbol = currentPackage.internAndExport(functionName);
					}
					SubLFunction using;
					if (meth == null) {
						using = SubLObjectFactory.makeCompiledFunction(className, methodName, parameterArray, SubLObject.class, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
					} else {
						using = SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
					}
					Errors.warn("Defining " + functionSymbol + " not using " + found);
					return using;
				}
			}

			if (alwaysRedefine) {
				//Errors.warn("ALWAYS Redefining " + functionSymbol);
			} else if (neverRedefine) {
				//Errors.warn("NEVER Redefining " + functionSymbol);
				return previous;
			}

			// SubLFunction func =
			if (meth == null) {
				return SubLObjectFactory.makeCompiledFunction(className, methodName, parameterArray, SubLObject.class, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
			} else {
				return SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
			}
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error while declaring function: " + functionName, e);
			return null;
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param file
	 * @param methodName
	 * @param parameterArray
	 * @return
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	private static Method getMethod(Class file, String methodName, Class[] parameterArray) throws NoSuchMethodException, SecurityException {
		try {
			return file.getMethod(methodName, parameterArray);
		} catch (NoSuchMethodException | SecurityException e) {
			return file.getMethod(methodName + "_alt", parameterArray);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param methodClassStr
	 * @return
	 */
	public static String altClassString(String methodClassStr) {
		if (methodClassStr.contains("cycjava_2"))
			return methodClassStr.replace("cycjava_2", "cycjava");
		if (methodClassStr.contains("cycjava"))
			return methodClassStr.replace("cycjava", "cycjava_2");
		return methodClassStr + "_base";
	}

}

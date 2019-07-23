/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

import org.armedbear.lisp.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;

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

    static {
        //skippedClasses.add("com.cyc.cycjava.cycl.kbi_.*");
        skippedClasses.add("com.cyc.cycjava_2.cycl.cfasl.*");
        skippedClasses.add("com.cyc.cycjava_2.cycl.dictionary.*");
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
        try {
            currentFile = file;
            currentStage = "declareFunctions";
            file.declareFunctions();
            maybeCallBaseMethod(0, "declare_", fileClass);
            currentStage = "initializeVariables";
            addPass(1, () -> {
                file.initializeVariables();
                try {
                    maybeCallBaseMethod(1, "init_", fileClass);
                } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                currentStage = "initializeFns";
                SubLFiles.initializeFns();
            });
            addPass(2, () -> {
                currentStage = "runTopLevelForms";
                file.runTopLevelForms();
                try {
                    maybeCallBaseMethod(2, "setup_", fileClass);
                } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
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

    public static void initialize_subl_file_exact(String className, boolean b) {
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
                Errors.warn("Skipping: " + className);
                skippedClasses.add(className);
                return;
            }
        }

        org.armedbear.lisp.Package p = SubLPackage.getCurrentPackage();

        boolean removeAgain = true;
        boolean was = SubLTranslatedFile.installingUnderlay;

        if (baseCheck == null) {
            if (notAgain.contains(className)) {
                Errors.warn("Not again: " + className);
                return;
            } else if (notAgain.contains(shortClassName)) {
                Errors.warn("Again: " + className);
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
            try {
                final ClassLoader pATCH_FILE_LOADER = PatchFileLoader.PATCH_FILE_LOADER;
                Class clazz = null;
                try {
                    if (clazz == null)
                        clazz = pATCH_FILE_LOADER.loadClass(className);
                } catch (ClassNotFoundException e) {
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
                        clazz = pATCH_FILE_LOADER.loadClass(otherClassName);
                    }
                }

                initialize_subl_file(clazz);
                removeAgain = false;
            } catch (Throwable e) {
                e.printStackTrace();
                Errors.cerror("Continue.", "Error initializing SubL file: " + className, e);
            }
        } finally {
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
    static boolean maybeCallBaseMethod(int n, String prefix, Class fileClass) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
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

    public static void declareFunction(Class file, String className, String methodName, String functionName, int requiredArgCount, int optionalArgCount, boolean allowsRest) {
        final boolean neverRedefine = SubLMain.Never_REDEFINE;
        try {
            List<Class> parameterTypes = new ArrayList<Class>();
            for (int i = 0; i < requiredArgCount + optionalArgCount; i++)
                parameterTypes.add(SubLObject.class);
            if (allowsRest)
                parameterTypes.add(SubLObject[].class);
            Class[] parameterArray = parameterTypes.toArray(new Class[parameterTypes.size()]);
            Method meth = null;

            if (file != null) {
                meth = file.getMethod(methodName, parameterArray);
            }

            SubLPackage currentPackage = Packages.$package$.getDynamicValue().toPackage();
            SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);

            if (!functionSymbol.fboundp()) {
                if (meth == null) {
                    SubLObjectFactory.makeCompiledFunction(className, methodName, parameterArray, SubLObject.class, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
                } else {
                    SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
                }
                return;
            }

            // Conflicts??!
            SubLFunction previous = null;
            previous = functionSymbol.getFunc();
            final int b = parameterArray.length - previous.applyArity() + (previous.allowsRest() ? 1 : 0);
            if (b == 0) {
                if (SubLTranslatedFile.installingUnderlay) {
                    return;
                }
                Errors.warn("Attempt to redefine: " + functionSymbol);
                return;
            }
            if (SubLTranslatedFile.installingUnderlay) {
                return;
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
                    if (meth == null) {
                        SubLObjectFactory.makeCompiledFunction(className, methodName, parameterArray, SubLObject.class, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
                    } else {
                        SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
                    }
                    Errors.warn("Defining " + functionSymbol + " not using " + found);
                    return;
                }
            }
            if (neverRedefine) {
                Errors.warn("NEVER Redefining " + functionSymbol);
                return;
            }

            // SubLFunction func =
            if (meth == null) {
                SubLObjectFactory.makeCompiledFunction(className, methodName, parameterArray, SubLObject.class, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
            } else {
                SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
            }
        } catch (Exception e) {
            Errors.cerror("Continue.", "Error while declaring function: " + functionName, e);
        }
    }

}

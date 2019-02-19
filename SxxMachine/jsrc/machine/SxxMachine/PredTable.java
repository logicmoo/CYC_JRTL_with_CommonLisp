package SxxMachine;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PredTable {

    public static Map<String, Operation> predicateCache = new HashMap<String, Operation>();
    public static Map<String, Operation> hiddenCache = new HashMap<String, Operation>();
    public static Map<String, Operation> initsCache = new HashMap<String, Operation>();

    public static void registerPredicate(String pkg, String functor, int arity, Operation cont) {
        registerPredicate(pkg, functor, arity, cont, false);
    }

    public static void registerPredicate(String pkg, String functor, int arity, Operation cont, boolean forced) {
        final String keyString = keyString(pkg, functor, arity);
        if (!storePred(keyString, cont, forced)) {
        }
        final String bareKeyString = keyString(null, functor, arity);
        if (!bareKeyString.equals(keyString))
            if (!storePred(bareKeyString, cont, false)) {
            }
    }

    public static boolean storePred(final String key, final Operation cont0, boolean forced) {
        Operation cont = cont0 == null ? cont = cont0 : new Operation() {

            @Override
            public Operation exec(Prolog engine) throws PrologException {
                // TODO Auto-generated method stub
                return cont0.exec(engine);
            }

            @Override
            public String toString() {
                // TODO Auto-generated method stub
                return key + " " + cont0.toString();
            }
        };
        final Operation prev = predicateCache.get(key);
        if (prev == null) {
            predicateCache.put(key, cont);
            return true;
        } else if (prev == cont) {
            return true;
        }
        String oldmodule = moduleFromClass(prev);
        if (cont == null) {

            if (forced) {
                System.err.println("Deleting " + key + " which is implemented at " + oldmodule);
                predicateCache.remove(key);
                return true;
            } else {
                System.err.println("Not deleting " + key + " which is implemented at " + oldmodule);
                return false;
            }
        }
        String newmodule = moduleFromClass(cont);

        if (cont.getClass() != prev.getClass()) {
            if (!forced) {
                System.err.println("Not overriding " + key + " which is implemented at " + oldmodule + " with "
                        + newmodule + "::" + key);
                predicateCache.put(newmodule + ":" + key, cont);
                predicateCache.put(oldmodule + ":" + key, cont);
                hiddenCache.put(key, cont);
                return false;
            } else {
                hiddenCache.put(key, prev);
                predicateCache.put(key, cont);
                System.err
                        .println("Overriding " + key + " which is implemented at " + oldmodule + " with " + newmodule);
                return true;
            }
        }
        return false;
    }

    public static void registerWMangle(String pkg, String functor, String mangle, int arity, Operation cont) {
        registerPredicate(pkg, functor, arity, cont);
        registerPredicate(pkg, mangle, arity, cont);
    }

    private static String keyString(String pkg, String functor, int arity) {
        if (pkg == null || isGlobal(pkg))
            return PredFA(functor, arity);
        return pkg + "::" + PredFA(functor, arity);
    }

    /**
     * @param functor
     * @param arity
     * @return
     */
    private static String PredFA(String functor, int arity) {
        return "PRED_" + functor + "_" + arity;
    }

    /**
     * @param pkg
     * @return
     */
    public static boolean isGlobal(String pkg) {
        return pkg != null && ("system".equals(pkg) || "prolog".equals(pkg) || Prolog.BUILTIN.equals(pkg));
        // || "swi_supp".equals(pkg) ||
    }

    public static boolean isLocal(String pkg) {
        return pkg == null;
    }

    public static Operation findPredicateOp(String pkg, String functor, int arity) {
        String key = keyString(pkg, functor, arity);
        Operation op = predicateCache.get(key);
        return op;
    }

    public static void registerBuiltin(String functor, int arity, Operation cont) {
        String module = moduleFromClass(cont);
        if (arity == 0 && isEntryPoint(functor)) {
            registerFileEntryPoint(module, functor, arity, cont);
        } else {
            registerPredicate("system", functor, arity, cont);
            registerPredicate(module, functor, arity, cont, true);
        }
    }

    /**
     * @param functor
     * @return
     */
    private static boolean isEntryPoint(String functor) {

        return functor != null
                && (functor.equals("main") || functor.equals("go") || functor.equals("top") || functor.equals("$init"));
    }

    private static void registerFileEntryPoint(String module, String functor, int arity, Operation cont) {
        String key = keyString(module, functor, arity);
        if (!key.startsWith(module)) {
            key = module + "::" + key;
        }
        storePred(key, cont, false);
        if (!initsCache.containsValue(cont)) {
            System.err.println("File " + module + " entry point: " + key);
            initsCache.put(key, cont);
        }
        registerPredicate(module, functor, arity, cont);
    }

    private static String moduleFromClass(Operation op) {
        Class class1 = op.getClass();
        Class dc = class1.getDeclaringClass();
        if (dc != null) {
            class1 = dc;
        }
        String moduleName = "" + class1.getName();
        int idx = moduleName.indexOf("$$");
        if (idx > 0) {
            moduleName = moduleName.substring(0, idx);
        }
        idx = moduleName.indexOf("_");
        if (idx > 0) {
            moduleName = moduleName.substring(idx + 1);
        }

        return moduleName;
    }

    public static void registerBuiltin(String functor, String mangle, int arity, Operation cont) {
        registerBuiltin(functor, arity, cont);
        registerBuiltin(mangle, arity, cont);
    }

    public static void runInits(Prolog machine) {
        for (Iterator<Entry<String, Operation>> iterator = initsCache.entrySet().iterator(); iterator.hasNext();) {
            Entry<String, Operation> entry = iterator.next();
            String name = entry.getKey();
            Operation oper = entry.getValue();
            int steps = 0;
            System.err.println("Running: " + name + " as " + oper);
            while (oper != null && oper != Success.SUCCESS) {
                //System.err.print(".");
                System.err.flush();
                steps++;

                Operation next = oper.exec(machine);
                System.err.println(" O: " + oper);
                oper = next;
                //  System.err.println(" R: " + next);
            }
            System.err.println("\nDone " + steps);
            System.err.flush();
        }
        System.err.flush();
    }

    public static void scanPreds(Class<?> class1) {
        final String suffix = "_static_exec";
        for (Method m : class1.getDeclaredMethods()) {
            if (!Modifier.isStatic(m.getModifiers()))
                continue;
            Class[] parms = m.getParameterTypes();
            if (parms == null || parms.length != 1)
                continue;
            if (parms[0] != Prolog.class)
                continue;
            String string = m.getName();
            if (!string.endsWith(suffix))
                continue;
            string = string.substring(0, string.length() - suffix.length());
            String functor = PredicateEncoder.decodeFunctor(string);
            int arity = PredicateEncoder.decodeArity(string);
            Operation cont = new Operation() {

                @Override
                public Operation exec(Prolog engine) throws PrologException {
                    try {
                        return (Operation) m.invoke(null, engine);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        throw new JavaException(e);
                    }
                }

                @Override
                public String toString() {
                    return functor + "/" + arity + " " + super.toString();
                }
            };
            registerBuiltin(functor, arity, cont);
        }

    }

}

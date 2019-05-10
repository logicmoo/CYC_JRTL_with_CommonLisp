package SxxMachine;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.Deque;

import SxxMachine.pterm.TermData;

/**
 * Superclass of any predicate's implementation class.
 * <p>
 * Concrete implementations must provide a definition of the Operation's
 * {@link Operation#exec(Prolog)} method. On a successful execution the method
 * must return {@link #cont}.
 * <p>
 * To be compatible with the {@code am2j} compiler implementations must define a
 * constructor matching the signature:
 *
 * <pre>
 *   public ClassName(Term arg1, Term arg2, ..., Operation cont) {
 *     // save arg1, arg2
 *     this.cont = cont;
 *   }
 * </pre>
 */
@SuppressWarnings({ "rawtypes", "unused" })
public abstract class Predicate extends TermData implements Operation {

    protected String name = null;// getClass().getName();
    /** Holds the argument terms of this <code>StructureTerm</code>. */
    protected Term[] LARG;

    public int type() {
        return Term.TYPE_CLOSURE;
    }

    @Override
    public Operation exec(Prolog engine) throws PrologException {
        // TODO Auto-generated method stub
        //oopsy();
        if (true)
            throw new AbstractMethodError(predName() + "/" + predArity() + " " + getClass().getName());
        throw new RuntimeException("" + this);
    }

    public String predName() {
        //if (name != null)
        //	return name;
        return PredicateEncoder.decodeFunctor(getClass().getName());
    }

    // abstract public int predArity();
    public int predArity() {
        if (LARG != null)
            return LARG.length;
        return PredicateEncoder.decodeArity(getClass().getName());
    }

    /**
     * @param engine
     */
    public void push_to_engine(Prolog engine) {
        // int arity = predArity();
        // System.arraycopy(LARG, 0, engine.AREGS, 0, arity);
        engine.AREGS = this.LARG;
        engine.cont = this.cont;
    }

    /**
     * Holds the continuation goal of this predicate.
     * <p>
     * In a Prolog program this is the next operation to perform if this operation
     * was executed successfully.
     */
    public Operation cont;
    // protected Term[] LARG;

    public Predicate() {
        // super((String)null,(Term[])null);
        if (LARG == null) {
            LARG = new Term[predArity()];
        }
    }

    public Predicate(String name, Term[] _args, Operation cont) {
        // super(name,va);
        this.name = name;
        this.LARG = _args;
        this.cont = cont;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        name = null;
        toString(sb);
        return sb.toString();
    }

    public void toString(StringBuilder sb) {
        sb.append(predName());
        if (LARG != null) {
            sb.append('(');
            int len = LARG.length;
            if (len > 0) {
                LARG[1].toQuotedString(1, sb);
                for (int j = 1; j < len; j++) {
                    Term val = LARG[j];
                    sb.append(", ");
                    val.toQuotedString(1, sb);
                }
            }
            sb.append(')');
        } else {
            sb.append("( ... )");
            // toStringLegacy(sb);
        }
    }

    public void toRest(String fixitive, StringBuilder sb) {
        toString(sb);
        if (cont == null)
            return;
        if (cont instanceof Predicate) {
            sb.append(fixitive);
            ((Predicate) cont).toRest(fixitive, sb);
        } else {
            sb.append(fixitive);
            sb.append(cont);
        }
    }

    public void toStringLegacy(StringBuilder sb) {
        Deque<Class> toScan = new ArrayDeque<Class>();
        Class clazz = getClass();
        while (clazz != Predicate.class) {
            toScan.addFirst(clazz);
            clazz = clazz.getSuperclass();
        }
        boolean first = true;
        int i = 1;
        Field f = null;
        Term val = null;
        do {
            if (LARG != null && LARG.length >= i) {
                val = LARG[i];
                if (first) {
                    sb.append('(');
                    first = false;
                } else {
                    sb.append(", ");
                }
                val.toQuotedString(0, sb);
            }
            for (Class c : toScan) {
                try {
                    f = c.getDeclaredField("arg" + i);
                    if ((f.getModifiers() & Modifier.STATIC) == 0 && f.getType() == Term.class) {
                        f.setAccessible(true);
                        val = (Term) f.get(this);
                        if (first) {
                            sb.append('(');
                            first = false;
                        } else {
                            sb.append(", ");
                        }
                        val.toQuotedString(0, sb);
                        break;
                    }
                } catch (Exception e) {
                    f = null;
                }
                try {
                    f = c.getDeclaredField("LARGS");
                    if ((f.getModifiers() & Modifier.STATIC) == 0 && f.getType() == Term[].class) {
                        f.setAccessible(true);
                        Term[] vala = (Term[]) f.get(this);
                        if (vala != null) {
                            for (int j = 0; j < vala.length; j++) {
                                if (first) {
                                    sb.append('(');
                                    first = false;
                                } else {
                                    sb.append(", ");
                                }
                                vala[j].toQuotedString(0, sb);
                                break;
                            }

                        }
                    }
                } catch (Exception e) {
                    f = null;
                }
            }
            i++;
        } while (f != null);
        if (!first) {
            sb.append(')');
        }
    }

    public static abstract class P0 extends Predicate {

        @Override
        public int predArity() {
            return 0;
        }

        @Override
        public void toString(StringBuilder sb) {
            sb.append(predName());
            sb.append('(');
            sb.append(')');
        }

        @Override
        public void push_to_engine(Prolog engine) {
            engine.cont = this.cont;
        }
    }

    public static abstract class P1 extends Predicate {

        @Override
        public int predArity() {
            return 1;
        }

        @Override
        public void toString(StringBuilder sb) {
            sb.append(predName());
            sb.append('(');
            this.LARG[0].toQuotedString(0, sb);
            sb.append(')');
        }

        @Override
        public void push_to_engine(Prolog engine) {
            engine.AREGS[0] = this.LARG[0];
            engine.cont = this.cont;
        }
    }

    public static abstract class P2 extends Predicate {

        public P2(String name, Term[] _args, Operation cont) {
            super(name, _args, cont);
        }

        @Override
        public int predArity() {
            return 2;
        }

        public P2() {
        }

        @Override
        public void toString(StringBuilder sb) {
            sb.append(predName());
            sb.append('(');
            this.LARG[0].toQuotedString(0, sb);
            sb.append(", ");
            this.LARG[1].toQuotedString(0, sb);
            sb.append(')');
        }

        @Override
        public void push_to_engine(Prolog engine) {
            engine.setB0();
            engine.AREGS[0] = this.LARG[0];
            engine.AREGS[1] = this.LARG[1];
            engine.cont = this.cont;
        }
    }

    public static abstract class P3 extends Predicate {

        @Override
        public int predArity() {
            return 3;
        }

        @Override
        public void toString(StringBuilder sb) {
            sb.append(predName());
            sb.append('(');
            this.LARG[0].toQuotedString(0, sb);
            sb.append(", ");
            this.LARG[1].toQuotedString(0, sb);
            sb.append(", ");
            this.LARG[2].toQuotedString(0, sb);
            sb.append(')');
        }

        @Override
        public void push_to_engine(Prolog engine) {
            engine.AREGS[0] = this.LARG[0];
            engine.AREGS[1] = this.LARG[1];
            engine.AREGS[2] = this.LARG[2];
            engine.cont = this.cont;
        }

    }

    public static abstract class P4 extends Predicate {

        @Override
        public void push_to_engine(Prolog engine) {
            engine.AREGS[0] = this.LARG[0];
            engine.AREGS[1] = this.LARG[1];
            engine.AREGS[2] = this.LARG[2];
            engine.AREGS[3] = this.LARG[3];
            int predArity = predArity();
            if (predArity > 4) {
                throw new RuntimeException("Missing Method Error: Push to engine");
            }
            engine.cont = this.cont;
        }

    }

    public static abstract class P5 extends Predicate {

        @Override
        public void push_to_engine(Prolog engine) {
            engine.AREGS[0] = this.LARG[0];
            engine.AREGS[1] = this.LARG[1];
            engine.AREGS[2] = this.LARG[2];
            engine.AREGS[3] = this.LARG[3];
            engine.AREGS[4] = this.LARG[4];
            int predArity = predArity();
            if (predArity > 5) {
                throw new RuntimeException("Missing Method Error: Push to engine");
            }
            engine.cont = this.cont;
        }

        @Override
        abstract public int predArity();
    }
}

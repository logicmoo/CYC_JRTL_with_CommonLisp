package SxxMachine.pterm;

import java.math.BigInteger;

import SxxMachine.CharReader;
import SxxMachine.Compound;
import SxxMachine.Functor;
import SxxMachine.Nonvar;
import SxxMachine.NumberTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.PredicateEncoder;
import SxxMachine.Prolog;
import SxxMachine.PrologFlags;
import SxxMachine.Term;
import SxxMachine.Token;

abstract public class TermData {

    /**
     * @author Administrator
     *
     */
    static public class StaticPred extends Predicate implements Operation {

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            toString(sb);
            return sb.toString();
        }

        @Override
        public void toString(StringBuilder sb) {
            Token.toQuotedString(predName(), sb);
            boolean first = true;
            if (LARG != null) {
                for (int j = 0; j < LARG.length; j++) {
                    if (first) {
                        sb.append('(');
                        first = false;
                    } else {
                        sb.append(", ");
                    }
                    Term val = LARG[j];
                    StructureTerm.toArgString(1, sb, val);
                }
                if (!first) {
                    sb.append(')');
                }
            } else {
                sb.append("( ... )");

                // toStringLegacy(sb);
            }

        }

        private Operation static_closure;
        // private String name;

        @Override
        public int predArity() {
            if (LARG == null) {
                return -1;
            }
            return LARG.length;
        }

        @Override
        public String predName() {
            String name = this.name;
            if (name == null)
                name = guessname();
            return name;
        }

        private String guessname() {
            String name;
            Class c = static_closure.getClass();

            name = c.getName();
            int index;
            index = name.indexOf("SxxMachine.");
            if (index > 0) {
                name = name.substring(index);
            }
            index = name.indexOf("FILE_");
            if (index > 0) {
                name = name.substring(index);
            }
            index = name.indexOf("$$Lambda$");
            if (index > 0) {
                name = name.substring(0, index);
            }
            index = name.indexOf("FILE_");
            if (index > 0) {
                name = name.substring(index);
            }
            index = name.indexOf("PRED_");
            if (index > 0) {
                name = name.substring(index);
            }
            try {
                name = PredicateEncoder.decodeFunctor(name);
            } catch (Exception e) {
                return name;
            }
            if (name != null) {
                this.name = name;
            } else {
                name = "exec=" + static_closure;
            }

            return name;
        }

        public StaticPred(String functor, Operation object, Term[] va, Operation cont) {
            super(functor, va, cont);

            this.static_closure = object;
        }

        /*
         * (non-Javadoc)
         *
         * @see SxxMachine.Operation#exec(SxxMachine.Prolog)
         */
        @Override
        public Operation exec(Prolog engine) {
            push_to_engine(engine);
            return static_closure.exec(engine);
        }

    }

    public static Compound S(String string, Term... s3) {
        return new StructureTerm(string, s3);
    }

    public static Compound S(SxxMachine.Functor f, Term... s3) {
        return new StructureTerm(f, s3);
    }

    public static Term C(String string, Term... s3) {
        return new StructureTerm(string, s3);
    }

    public static Term C(SxxMachine.Functor f, Term... s3) {
        return new StructureTerm(f, s3);
    }
    //
    // private static ListTerm Cons(Term _car, Term _cdr) {
    // return TermData.CONS( _car, _cdr);
    // //return new StructureTerm(ListTerm.SYM_DOT, _car, _cdr);
    // }

    public static Compound CONS(Term _car, Term _cdr) {
        // if(false) return Cons(_car, _cdr);
        return S(Prolog.FUNCTOR_DOT_2, _car, _cdr);
    }

    /** Returns a Prolog atom for the given name. */
    public static SxxMachine.Functor SYM(String _name) {
        return SymbolTerm.intern(_name.intern(), 0);
    }

    /** Returns a Prolog functor for the given name and arity. */
    public static SxxMachine.Functor F(String s, int i) {
        return SymbolTerm.intern(s, i);
    }

    public static VariableTerm V(Prolog engine) {
        return new VariableTerm(engine);
    }

    public static VariableTerm V() {
        return new VariableTerm(Prolog.M);
    }

    public static Predicate Op(Operation object, Term[] LARG, Operation cont) {
        return new TermData.StaticPred(null, object, LARG, cont);
    }

    public static Predicate Op(String str, Operation object, Term[] LARG, Operation cont) {
        return new TermData.StaticPred(str, object, LARG, cont);
    }
    //
    //    public static Predicate Op(Operation object, Term a1, Term a2, Operation cont) {
    //        return new TermData.StaticPred(null, object, VA(a1, a2), cont);
    //    }
    //
    //    public static Predicate Op(Operation object, Term a1, Term a2, Term a3, Operation cont) {
    //        return new TermData.StaticPred(null, object, VA(a1, a2, a3), cont);
    //    }
    //
    //    public static Predicate Op(Operation object, Term a1, Operation cont) {
    //        return new TermData.StaticPred(null, object, VA(a1), cont);
    //    }

    public static LongTerm Long(String s) {
        return new LongTerm(new BigInteger(s));
    }

    public static LongTerm Long(long t) {
        int i = (int) t;
        if ((i) == t) {
            return TermData.Integer(i);
        }
        return new LongTerm(t);
    }

    public static Term Long(char t) {
        return CHAR(t);
    }

    final static int POS_INT_CACHE = 1024;
    final static int NEG_INT_CACHE = 1024;
    static IntegerTerm[] posInts = new IntegerTerm[POS_INT_CACHE];
    static IntegerTerm[] negInts = new IntegerTerm[NEG_INT_CACHE];

    public static IntegerTerm Integer(int i) {
        if (i < POS_INT_CACHE) {
            if (i < 0) {
                if (i >= -NEG_INT_CACHE) {
                    int idx = -i;
                    if (negInts != null) {
                        synchronized (negInts) {
                            IntegerTerm ret = negInts[idx];
                            if (ret == null) {
                                negInts[idx] = ret = new IntegerTerm(i);
                            }
                            return ret;
                        }
                    }
                }
            } else {
                if (posInts != null) {
                    synchronized (posInts) {
                        IntegerTerm ret = posInts[i];
                        if (ret == null) {
                            posInts[i] = ret = new IntegerTerm(i);
                        }
                        return ret;
                    }
                }
            }
        }
        return new IntegerTerm(i);
    }

    static public Term[] VA(Term... array) {
        return array;
    }

    public static Term Closure(Operation _op) {
        return new ClosureTerm((Predicate) _op);
    }

    public static JavaObjectTerm FFIObject(Object _obj) {
        return createJavaObjectTerm(_obj);
    }

    public static ErrorTerm createErrorTerm(Throwable error, Term _functor, Term... _args) {
        return new ErrorTerm(error, _functor, _args);
    }

    public static Compound LIST(Term a1, Term... items) {
        int len = items.length;
        if (len == 0) {
            return CONS(a1, Prolog.Nil);
        }
        Compound t = CONS(items[len - 1], Prolog.Nil);
        for (int i = len - 2; i >= 0; i--) {
            t = CONS(items[i], t);
        }
        return t;
    }

    public static boolean isQuoted(int printingFlags) {
        return (printingFlags & 1) != 0;
    }

    public static Term AND(Term a1, Term a2) {
        return StructureTerm.createCons(Prolog.FUNCTOR_CONJ_2.getString(), a1, a2);
    }

    /**
     * @param r
     * @return
     */
    public static NumberTerm NarrowDouble(double r) {
        NumberTerm T;
        if (Math.floor(r) == r)
            T = TermData.Long((long) r);
        else
            T = TermData.Float(r);
        return T;
    }

    public static HashtableOfTerm asHashtableOfTerm(Object hash) {
        // TODO Auto-generated method stub
        return (HashtableOfTerm) hash;
    }

    public static ErrorTerm asErrorTerm(Term a2) {
        // TODO Auto-generated method stub
        return (ErrorTerm) a2;
    }

    public static DoubleTerm Float(double i) {
        return new DoubleTerm(i);
    }

    public static IntegerTerm Number(int n) {
        return Integer(n);
    }

    public static LongTerm Number(long n) {
        return Long(n);
    }

    public static DoubleTerm Number(double n) {
        return Float(n);
    }

    public static JavaObjectTerm createJavaObjectTerm(Object _obj) {
        return new JavaObjectTerm(_obj);
    }

    /** Checks whether a given object is an instance of Prolog term. */
    public static boolean instanceOfTerm(Object obj0) {
        if (!(obj0 instanceof Term))
            return false;
        Term obj = (Term) obj0;
        return obj.isVar() || obj.isInteger() || obj.isLong() || obj.isDouble() || obj.isAtom() || obj.isCons()
                || obj.isCompound() || obj.isJavaObject() || obj.isClosure();
    }

    /**
     * Converts a list of character codes to a String.
     */
    public static String charsToString(Term Cs) {
        StringBuffer s = new StringBuffer("");

        while (!(Cs.isNil())) {
            if (!(Cs.isCons()))
                return null;
            Term head = Cs.ArgDeRef(0);
            char c = asChar(head);
            s.append(c);
            Cs = Cs.ArgDeRef(1);
        }

        return s.toString();
    }

    /**
     * @param s
     * @return
     */
    public static Term DoubleQuotes(String s) {
        char[] chars = s.toCharArray();
        Term token = Prolog.Nil;
        for (int i = chars.length; i > 0; i--) {
            token = CONS(CHAR(chars[i - 1]), token);
        }
        return token;
    }

    private static char asChar(Term head) {
        if (head.isNumber())
            return (char) head.longValue();
        final String fname = head.getString();
        return fname.charAt(fname.length() - 1);
    }

    public static void soopsy() {
        new Exception().printStackTrace();
        Prolog.Break("soopsy!");
    }

    /** Returns a Prolog atom for the given character. */
    public static Term CHAR(char c) {
        if (PrologFlags.useDoubleQuotes().contentEquals("codes")) {
            return Integer(c);
        }
        if (0 <= c && c <= 127)
            return SYM(Character.toString(c));
        else
            return TermData.SYM(Character.toString(c));
    }

    /** Returns a Prolog atom for the given name. */
    public static Term createAtomic(String _name) {
        return SymbolTerm.screateDynamic(_name.intern());
    }

    /** Returns a Prolog atom for the given name. */
    public static Term BLOB(String _type, String _name) {
        return SymbolTerm.screateDynamic(_name.intern());
    }

    /** Returns a Prolog atom for the given name. */
    public static SxxMachine.Functor createF(String _name, int arity) {
        return SymbolTerm.screateF(_name, arity);
    }

    public static SxxMachine.Functor internToken(String _name) {
        SxxMachine.Functor tok = SYM(_name);
        return tok;
    }

    public static void gc() {
        SymbolTerm.atom_gc();
    }

    public static NumberTerm asInt(Term i) {
        // TODO Auto-generated method stub
        return i.asLongTerm();
    }

    public static Functor asConst(Term i) {
        // TODO Auto-generated method stub
        return i.asConst();
    }

    public static Compound asConj(Term i) {
        // TODO Auto-generated method stub
        return (StructureTerm) i.asStructureTerm();
    }

    public static Compound asCons(Term i) {
        // TODO Auto-generated method stub
        return (StructureTerm) i.asListTerm();
    }

    public static NumberTerm asNum(Term i) {
        // TODO Auto-generated method stub
        return i.asNumberTerm();
    }

    public static Compound asStruct(Term i) {
        // TODO Auto-generated method stub
        return (StructureTerm) i.asStructureTerm();
    }

    public final static Nonvar the(Term X) {
        return (null == X) ? (Nonvar) Prolog.aNo : StructureTerm.S("the", X);
    }

    public static CharReader asCharReader(Term i) {
        // TODO Auto-generated method stub
        return (CharReader) i.toValue();
    }

    public static Term createStructureTerm(String name, int arity) {
        // TODO Auto-generated method stub
        return new StructureTerm(name, arity);
    }

}

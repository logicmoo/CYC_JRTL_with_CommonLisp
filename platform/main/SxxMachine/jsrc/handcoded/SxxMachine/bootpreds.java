package SxxMachine;

import static SxxMachine.JavaPredicate.checkParameterTypes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import SxxMachine.pterm.ErrorTerm;
import SxxMachine.pterm.HashtableOfTerm;
import SxxMachine.pterm.JavaObjectTerm;
import SxxMachine.pterm.ListViewTerm;
import SxxMachine.pterm.Mutex;
import SxxMachine.pterm.TermData;

@SuppressWarnings({ "rawtypes", "unchecked", "unused", "resource" })
public class bootpreds extends sxxtensions {

    final public static NumberTerm int_0 = Integer(0);
    final public static NumberTerm int_1 = Integer(1);
    final public static NumberTerm int_2 = Integer(2);
    final public static NumberTerm int_3 = Integer(3);
    final public static NumberTerm int_4 = Integer(4);
    final public static NumberTerm int_5 = Integer(6);
    final public static NumberTerm int_6 = Integer(6);
    final public static NumberTerm int_7 = Integer(7);
    final public static NumberTerm int_8 = Integer(8);
    final public static NumberTerm int_9 = Integer(9);
    final public static NumberTerm int_10 = Integer(10);
    final public static NumberTerm int_11 = Integer(11);
    final public static NumberTerm int_12 = Integer(12);
    final public static NumberTerm int_13 = Integer(13);
    final public static NumberTerm int_14 = Integer(14);
    final public static NumberTerm int_15 = Integer(15);
    final public static NumberTerm int_16 = Integer(16);
    final public static NumberTerm int_17 = Integer(17);
    final public static NumberTerm int_18 = Integer(18);
    final public static NumberTerm int_19 = Integer(19);
    final public static NumberTerm int_20 = Integer(20);
    final public static NumberTerm int_21 = Integer(21);
    final public static NumberTerm int_22 = Integer(22);
    final public static NumberTerm int_23 = Integer(23);
    final public static NumberTerm int_24 = Integer(24);
    final public static NumberTerm int_25 = Integer(25);
    final public static NumberTerm int_100 = Integer(100);

    final public static NumberTerm int_neg1 = Integer(-1);
    final public static NumberTerm int_neg2 = Integer(-2);
    final public static NumberTerm int_neg3 = Integer(-3);
    final public static NumberTerm int_neg4 = Integer(-4);
    final public static NumberTerm int_neg5 = Integer(-6);
    final public static NumberTerm int_neg6 = Integer(-6);
    final public static NumberTerm int_neg7 = Integer(-7);
    final public static NumberTerm int_neg8 = Integer(-8);
    final public static NumberTerm int_neg9 = Integer(-9);
    final public static NumberTerm int_neg10 = Integer(-10);
    final public static NumberTerm int_neg11 = Integer(-11);
    final public static NumberTerm int_neg12 = Integer(-12);
    final public static NumberTerm int_neg13 = Integer(-13);
    final public static NumberTerm int_neg14 = Integer(-14);
    final public static NumberTerm int_neg15 = Integer(-15);
    final public static NumberTerm int_neg16 = Integer(-16);
    final public static NumberTerm int_neg17 = Integer(-17);
    final public static NumberTerm int_neg18 = Integer(-18);
    final public static NumberTerm int_neg19 = Integer(-19);
    final public static NumberTerm int_neg20 = Integer(-20);
    final public static NumberTerm int_neg21 = Integer(-21);

    /**
     * <code>arg/3</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _between_3 extends Predicate.P3 {
    public static Operation PRED_between_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a1 = a1.dref();
        if ((a1.isVar()))
            throw new PInstantiationException(thiz, 1);
        else if (!(a1.isInteger()))
            throw new IllegalTypeException(thiz, 1, "integer", a1);
        a2 = a2.dref();
        if (!(a2.isInteger()))
            throw new IllegalTypeException(thiz, 3, "integer", a2);
        if (a1.intValue() < a2.intValue()) {
            a3 = a3.dref();
            if (a3.isVariable()) {
                a3.bind(a1, engine.trail);
            }
        }
        return cont;
    }

    /**
     * <code>arg/3</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _arg_3 extends Predicate.P3 {
    public static Operation PRED_arg_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        Term[] args;
        int arity, argNo;
        a1 = a1.dref();
        if ((a1.isVar())) {
            if (a2.isVariable())
                throw new PInstantiationException(thiz, 1);
        }

        else if (!(a1.isInteger()))
            throw new IllegalTypeException(thiz, 1, "integer", a1);
        a2 = a2.dref();
        if ((a2.isCons())) {
            args = new Term[2];
            args[0] = (a2).car();
            args[1] = (a2).cdr();
            arity = 2;
        } else if ((a2.isCompound())) {
            args = (a2).args();
            arity = (a2).arity();
        } else if ((a2.isVar())) {
            throw new PInstantiationException(thiz, 2);
        } else {
            throw new IllegalTypeException(thiz, 2, "compound", a2);
        }
        argNo = (a1).intValue();
        if (argNo < 0)
            throw new IllegalDomainException(thiz, 1, "not_less_than_zero", a1);
        if (argNo > arity || argNo < 1)
            return engine.fail();
        if (!a3.unify(args[argNo - 1], engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>atom_chars/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _atom_chars_2 extends Predicate.P2 {
    public static Operation PRED_atom_chars_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        a1 = a1.dref();
        a2 = a2.dref();
        if ((a1.isVar())) { // atom_chars(-Atom, +CharList)
            if (a2.isNil()) {
                if (!a1.unify(SYM(""), engine.trail))
                    return engine.fail();
                return cont;
            } else if ((a2.isVar())) {
                throw new PInstantiationException(thiz, 2);
            } else if (!(a2.isCons())) {
                throw new IllegalTypeException(thiz, 2, "list", a2);
            }
            StringBuilder sb = new StringBuilder();
            Term x = a2;
            while (!x.isNil()) {
                if ((x.isVar()))
                    throw new PInstantiationException(thiz, 2);
                if (!(x.isCons()))
                    throw new IllegalTypeException(thiz, 2, "list", a2);
                Term car = (x).car().dref();
                if ((car.isVar()))
                    throw new PInstantiationException(thiz, 2);
                if (!(car.isAtom()) || (car).getString().length() != 1)
                    throw new IllegalTypeException(thiz, 2, "character", a2);
                sb.append((car).getString());
                x = (x).cdr().dref();
            }
            if (!a1.unify(TermData.createAtomic(sb.toString()), engine.trail))
                return engine.fail();
            return cont;
        } else if (a2.isNil() || (a2.isVar()) || (a2.isCons())) { // atom_chars(+Atom,
                                                                  // ?CharList)
            if (!(a1.isAtom()))
                throw new IllegalTypeException(thiz, 1, "atom", a1);
            String s = (a1).getString();
            Term x = Prolog.Nil;
            for (int i = s.length(); i > 0; i--) {
                x = CONS(TermData.createAtomic(s.substring(i - 1, i)), x);
            }
            if (!a2.unify(x, engine.trail))
                return engine.fail();
            return cont;
        } else {
            return engine.fail();
        }
    }

    /**
     * <code>atom_codes/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _atom_codes_2 extends Predicate.P2 {
    public static Operation PRED_atom_codes_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        a1 = a1.dref();
        a2 = a2.dref();
        if ((a1.isVar())) { // atom_codes(-Atom, +CharCodeList)
            StringBuilder sb = new StringBuilder();
            Term x = a2;
            while (!x.isNil()) {
                if ((x.isVar()))
                    throw new PInstantiationException(thiz, 2);
                if (!(x.isCons()))
                    throw new IllegalTypeException(thiz, 2, "list", a2);
                Term car = (x).car().dref();
                if ((car.isVar()))
                    throw new PInstantiationException(thiz, 2);
                if (!(car.isInteger()))
                    throw new RepresentationException(thiz, 2, "character_code");
                // car is an integer
                int i = (car).intValue();
                if (!Character.isDefined((char) i))
                    throw new RepresentationException(thiz, 2, "character_code");
                sb.append((char) i);
                x = (x).cdr().dref();
            }
            if (!a1.unify(TermData.createAtomic(sb.toString()), engine.trail))
                return engine.fail();
            return cont;
        } else { // atom_codes(+Atom, ?CharCodeList)
            if (!(a1.isAtom()))
                throw new IllegalTypeException(thiz, 1, "atom", a1);
            char[] chars = (a1).getString().toCharArray();
            Term x = Prolog.Nil;
            for (int i = chars.length; i > 0; i--) {
                x = CONS(Integer(chars[i - 1]), x);
            }
            if (!a2.unify(x, engine.trail))
                return engine.fail();
            return cont;
        }
    }

    /**
     * <code>atom_concat/3</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _atom_concat_3 extends Predicate.P3 {
    private static final Functor AC_2 = F("ac", 2);

    public static Operation PRED_atom_concat_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a3 = a3.dref();
        if ((a3.isAtom())) {
            Functor s3 = a3.asSymbolTerm();
            int endIndex = s3.length();
            Term t = Prolog.Nil;
            for (int i = 0; i <= endIndex; i++) {
                Term[] args = { s3.subsymbol(0, i), s3.subsymbol(i) };
                t = CONS(C(AC_2, args), t);
            }
            return Op(FILE_builtins::PRED_$member_in_reverse_2_static_exec, VA(C(AC_2, a1, a2), t), cont);
        } else if (!(a3.isVar())) {
            throw new IllegalTypeException(thiz, 3, "atom", a3);
        }
        // a3 is a variable
        a1 = a1.dref();
        a2 = a2.dref();
        if ((a1.isVar()))
            throw new PInstantiationException(thiz, 1);
        if ((a2.isVar()))
            throw new PInstantiationException(thiz, 2);
        if (!(a1.isAtom()))
            throw new IllegalTypeException(thiz, 1, "integer", a1);
        if (!(a2.isAtom()))
            throw new IllegalTypeException(thiz, 2, "integer", a2);
        String str3 = (a1).getString().concat((a2).getString());
        if (!a3.unify(TermData.createAtomic(str3), engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * atomic_concat(+Atomic1, +Atomic2, -Atom) Atom represents the text after
     * converting Atomic1 and Atomic2 to text and concatenating the result: ?-
     * atomic_concat(name, 42, X). X = name42. Created by semenov on 27.04.2017.
     * http://www.swi-SxxMachine.org/pldoc/man?predicate=atomic_concat/3
     */
    // _atomic_concat_3 extends Predicate.P3 {
    public static Operation PRED_atomic_concat_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        final Term a1 = LARG[0].dref();
        final Term a2 = LARG[1].dref();
        if (!(a1.isNumber()) && !(a1.isAtom())) {
            throw new IllegalTypeException(thiz, 1, "atomic", a1);
        }
        if (!(a2.isNumber()) && !(a2.isAtom())) {
            throw new IllegalTypeException(thiz, 2, "atomic", a2);
        }
        if (LARG[2].unify(TermData.createAtomic(a1.getString() + a2.getString()), engine.trail)) {
            return cont;
        }
        return engine.fail();
    }

    /**
     * <code>atom_lengt/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _atom_length_2 extends Predicate.P2 {
    public static Operation PRED_atom_length_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        int length;
        a1 = a1.dref();
        a2 = a2.dref();
        if ((a1.isVar()))
            throw new PInstantiationException(thiz, 1);
        if (!(a1.isAtom()))
            throw new IllegalTypeException(thiz, 1, "atom", a1);
        length = (a1).getString().length();
        if ((a2.isVar())) {
            if (!a2.unifyInt((length), engine.trail))
                return engine.fail();
        } else if ((a2.isInteger())) {
            int n = (a2).intValue();
            if (n < 0)
                throw new IllegalDomainException(thiz, 2, "not_less_than_zero", a2);
            if (length != n)
                return engine.fail();
        } else {
            throw new IllegalTypeException(thiz, 1, "integer", a2);
        }
        return cont;
    }

    /**
     * <code>'$atom_type0'/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$atom_type0_2 extends Predicate.P2 {
    public static Operation PRED_$atom_type0_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1, a2;
        int type;
        a1 = LARG[0];
        a2 = LARG[1];
        a1 = a1.dref();
        if (!(a1.isAtom()))
            return engine.fail();
        type = Token.getStringType(a1.getString());
        if (!a2.unifyInt((type), engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>'$begin_exception'/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.2
     */
    public static Operation PRED_$begin_exception_1_static_exec(Prolog engine) {
        return PRED_$begin_exception_1.static_exec(engine);
    }

    static public class PRED_$begin_exception_1 extends BlockPredicate {
        /// private final Term arg1;

        @Override
        public int predArity() {
            return 1;
        }

        public PRED_$begin_exception_1(Term a1, Operation cont) {
            LARG[0] = a1;
            this.cont = cont;
        }

        @Override
        public Operation exec(Prolog engine) { // Operation cont = engine.cont;
                                               // Term[] LARG = engine.AREGS;
                                               // Operation thiz = engine.pred;

            engine.setB0();
            engine.pushCatcherB(engine.B0);
            engine.trail.push(() -> engine.popCatcherB());
            return cont;
        }

        public static Operation static_exec(Prolog engine) {
            Operation cont = engine.cont;
            engine.setB0();
            engine.pushCatcherB(engine.B0);
            engine.trail.push(() -> engine.popCatcherB());
            return cont;
        }
    }

    /**
     * <code>'$begin_sync'/2</code>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.2
     */
    public static Operation PRED_$begin_sync_2_static_exec(Prolog engine) {
        return PRED_$begin_sync_2.static_exec(engine);
    }

    static public class PRED_$begin_sync_2 extends BlockPredicate {
        /// private final Term arg1, arg2;
        @Override
        public int predArity() {
            // TODO Auto-generated method stub
            return 2;
        }

        public PRED_$begin_sync_2(Term a1, Term a2, Operation cont) {
            LARG[0] = a1;
            LARG[1] = a2;
            this.cont = cont;
        }

        @Override
        public Operation exec(Prolog engine) {
            push_to_engine(engine);
            return static_exec(engine);
        }

        static public Operation static_exec(Prolog engine) {
            Term[] LARG = engine.AREGS;
            BlockPredicate thiz = (BlockPredicate) engine.pred;
            engine.setB0();
            Term a1, a2;
            a1 = LARG[0];
            a2 = LARG[1];
            Object o = null;
            Operation code = null;
            // 1st. argument
            a1 = a1.dref();
            if ((a1.isVar()))
                throw new PInstantiationException(thiz, 1);
            if (!(a1.isJavaObject()))
                throw new IllegalTypeException(thiz, 1, "java", a1);
            o = a1.object();
            // 2nd. argument
            a2 = a2.dref();
            if (!(a2.isVar()))
                throw new IllegalTypeException(thiz, 2, "variable", a1);
            a2.asVariableTerm().bind(FFIObject(thiz), engine.trail);
            //
            code = thiz.cont;
            thiz.outOfScope = false;
            thiz.outOfLoop = false;
            engine.trail.push(new OutOfLoop(thiz));
            PrologLogger logger = engine.getLogger();
            try {
                main_loop: while (true) {
                    synchronized (o) {
                        while (!thiz.outOfScope) {
                            if (engine.halt != 0) {
                                break main_loop;
                            }
                            // if (engine.control.isEngineStopped())
                            // break main_loop;
                            if (thiz.outOfLoop)
                                break main_loop;
                            logger.beforeExec(code);
                            code = code.exec(engine);
                        }
                    }
                    while (thiz.outOfScope) {
                        if (engine.halt != 0) {
                            break main_loop;
                        }
                        // if (engine.control.isEngineStopped())
                        // break main_loop;
                        if (thiz.outOfLoop)
                            break main_loop;
                        logger.beforeExec(code);
                        code = code.exec(engine);
                    }
                }
            } catch (StopEngineException see) {
                throw see;
            } catch (RuntimeException e) {
                throw logger.execThrows(e);
            }
            return code;
        }
    }

    /**
     * '$builtin_member'(X, [X|_]). '$builtin_member'(X, [_|L]) :-
     * '$builtin_member'(X, L).
     */

    static public class PRED_$builtin_member_2 extends Predicate.P2 {

        public static Operation static_exec(Prolog engine) {
            Operation cont = engine.cont;
            Term[] LARG = engine.AREGS;
            final Term a1 = LARG[0].dref();
            final Term a2 = LARG[1].dref();
            if (!(a2.isCons())) {
                return engine.fail();
            }

            final Term value = (a2).car();
            final Term next = (a2).cdr().dref();

            if (!next.equalsTerm(Prolog.Nil)) {
                engine.setB0();
                engine.AREGS = LARG;
                engine.AREGS[1] = FFIObject(new Term[] { next });
                engine.cont = cont;
                engine.jtry2(null, PRED_$builtin_member_2::retry); // push new frame
                                                                   // with retry as next
            }
            return (a1.unify(value, engine.trail)) ? cont : engine.fail();
        }

        private static Operation retry(Prolog engine) {
            engine.retry(null, PRED_$builtin_member_2::retry); // restore
                                                               // engine.AREGS[0],
                                                               // AREGS[1], cont
            final Term[] p = (Term[]) engine.AREGS[1].toJava();
            final Trail trail = engine.trail;
            final int top = trail.top();
            Term a2 = p[0];
            while (a2.isCons()) {
                final Term value = (a2).car().dref();
                a2 = (a2).cdr().dref();
                if (engine.AREGS[0].unify(value, engine.trail)) {
                    p[0] = a2;
                    return engine.cont;
                }
                trail.unwind(top);
            }
            return engine.trust(Failure.fail_0);
        }
    }

    /**
     * '$builtin_member'(X, [X|_]). '$builtin_member'(X, [_|L]) :-
     * '$builtin_member'(X, L).
     */
    // _$builtin_member_2 extends Predicate.P2 {
    public static Operation PRED_$builtin_member_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        final Term a1 = LARG[0].dref();
        final Term a2 = LARG[1].dref();
        if (!(a2.isCons())) {
            return engine.fail();
        }
        final Term value = (a2).car();
        final Term next = (a2).cdr().dref();
        if (!next.equalsTerm(Prolog.Nil)) {
            engine.setB0();
            engine.AREGS = LARG;
            engine.AREGS[1] = TermData.FFIObject(new Term[] { next });
            engine.cont = cont;
            engine.jtry2(null, bootpreds::retry_bi_member); // push new frame with
                                                            // retry as next
        }
        return (a1.unify(value, engine.trail)) ? cont : engine.fail();
    }

    private static Operation retry_bi_member(Prolog engine) {
        engine.retry(null, bootpreds::retry_bi_member); // restore engine.AREGS[0],
                                                        // AREGS[1], cont
        final Term[] p = (Term[]) engine.AREGS[1].toJava();
        final Trail trail = engine.trail;
        final int top = trail.top();
        Term a2 = p[0];
        while (a2.isCons()) {
            final Term value = (a2).car().dref();
            a2 = (a2).cdr().dref();
            if (engine.AREGS[0].unify(value, engine.trail)) {
                p[0] = a2;
                return engine.cont;
            }
            trail.unwind(top);
        }
        return engine.trust(Failure.fail_0);
    }

    // jlang.reflect.*;
    /**
     * <code>'$call'/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$call_2 extends Predicate.P2 {
    private static final Functor SYM_SLASH_2 = F("/", 2);
    private static final Functor SYM_COLON_2 = F(":", 2);
    private final static Term[] NO_ARGS = new Term[0];

    public static Operation PRED_$call_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0].dref(); // a1 must be atom of package name
        a2 = LARG[1].dref(); // a2 must be callable name
        Term functor;
        int arity;
        Term[] args;
        // Class clazz;
        // Constructor constr;
        // Operation pred;
        try {
            if (!(a1.isAtom()))
                throw new IllegalTypeException(thiz, 1, "atom", a1);
            if ((a2.isAtom())) {
                functor = a2;
                args = NO_ARGS; // new Term[]{};
                arity = 0;
            } else if ((a2.isCompound())) {
                functor = a2.functor();
                args = (a2).args();
                arity = a2.arity();
            } else {
                throw new IllegalTypeException(thiz, 2, "callable", a2);
            }
            try {
                return engine.pcl.predicate(a1.getString(), functor.getString(), cont, args);
            } catch (ExistenceException e) {
                try {
                    return engine.pcl.predicate(Prolog.BUILTIN, functor.getString(), cont, args);
                } catch (ExistenceException e2) {
                    if ((engine.getUnknown()).equals("fail"))
                        return engine.fail();
                    Term what = C(SYM_COLON_2, a1, C(SYM_SLASH_2, functor, Integer(arity)));
                    String mt = e.getMessage();
                    ExistenceException err = new ExistenceException(thiz, 0, "procedure", what, mt);
                    err.initCause(e);
                    throw err;
                }
            }
        } catch (IllegalArgumentException e) {
            throw new SystemException(e.toString() + " in " + thiz);
        }
    }

    /**
     * <code>'$call_closure'/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$call_closure_1 extends Predicate.P1 {
    public static Operation PRED_$call_closure_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1;
        Predicate code;
        // a1 must be closure
        a1 = LARG[0].dref();
        if (!(a1.isClosure()))
            return engine.fail();
        code = a1.asClosureTerm().getCode();
        code.cont = cont;
        return code;
    }

    /**
     * <code>char_code/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _char_code_2 extends Predicate.P2 {
    public static Operation PRED_char_code_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        a1 = a1.dref();
        a2 = a2.dref();
        if ((a1.isVar())) { // char_code(-Char, +CharCode)
            if ((a2.isVar())) {
                throw new PInstantiationException(thiz, 2);
            } else if (!(a2.isInteger())) {
                throw new IllegalTypeException(thiz, 2, "integer", a2);
            }
            int i = (a2).intValue();
            if (!Character.isDefined(i))
                throw new RepresentationException(thiz, 2, "character_code");
            if (!a1.unify(TermData.CHAR((char) i), engine.trail))
                return engine.fail();
        } else if ((a1.isAtom())) { // char_code(+Char, ?CharCode)
            String s = (a1).getString();
            if (s.length() != 1)
                throw new IllegalTypeException(thiz, 1, "character", a1);
            if (!a2.unifyInt((s.charAt(0)), engine.trail))
                return engine.fail();
        } else {
            return engine.fail();
        }
        return cont;
    }

    /**
     * <code>close/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _close_2 extends Predicate.P2 {
    // private static final Functor SYM_ALIAS_1 = F("alias", 1);
    private static final Functor SYM_FORCE_1 = F("force", 1);
    private static final Functor SYM_TRUE = SYM("true");
    private static final Functor SYM_FALSE = SYM("false");

    public static Operation PRED_close_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.IO, thiz, LARG[0]);
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        boolean forceFlag = false;
        Object stream = null;
        // close options
        a2 = a2.dref();
        Term tmp = a2;
        while (!tmp.isNil()) {
            if ((tmp.isVar()))
                throw new PInstantiationException(thiz, 2);
            if (!(tmp.isCons()))
                throw new IllegalTypeException(thiz, 2, "list", a2);
            Term car = (tmp).car().dref();
            if ((car.isVar()))
                throw new PInstantiationException(thiz, 2);
            if ((car.isCompound())) {
                Term functor = (car).functor();
                Term[] args = (car).args();
                if (functor.equalsTerm(SYM_FORCE_1)) {
                    Term bool = args[0].dref();
                    if (bool.equalsTerm(SYM_TRUE))
                        forceFlag = true;
                    else if (bool.equalsTerm(SYM_FALSE))
                        forceFlag = false;
                    else
                        throw new IllegalDomainException(thiz, 2, "close_option", car);
                } else {
                    throw new IllegalDomainException(thiz, 2, "close_option", car);
                }
            } else {
                throw new IllegalDomainException(thiz, 2, "close_option", car);
            }
            tmp = (tmp).cdr().dref();
        }
        // stream
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getStreamManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "stream", a1, "");
            stream = (engine.getStreamManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            stream = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "stream_or_alias", a1);
        }
        if (stream instanceof PushbackReader) {
            PushbackReader in = (PushbackReader) stream;
            if (in.equals(engine.getUserInput()))
                return cont;
            if (in.equals(engine.getCurrentInput()))
                engine.setCurrentInput(engine.getUserInput());
            try {
                in.close();
            } catch (IOException e) {
                throw new TermException(TermData.FFIObject(e));
            }
        } else if (stream instanceof PrintWriter) {
            PrintWriter out = (PrintWriter) stream;
            if (out.checkError()) {
                if (!forceFlag)
                    throw new SystemException("output stream error");
            }
            out.flush();
            if (out.equals(engine.getUserOutput()) || out.equals(engine.getUserError()))
                return cont;
            if (out.equals(engine.getCurrentOutput()))
                engine.setCurrentOutput(engine.getUserOutput());
            out.close();
        } else {
            throw new IllegalDomainException(thiz, 1, "stream_or_alias", a1);
        }
        // delete associated entries from the stream manager
        HashtableOfTerm streamManager = engine.getStreamManager();
        if ((a1.isAtom())) {
            streamManager.remove(engine.getStreamManager().get(a1));
            streamManager.remove(a1);
        } else if ((a1.isJavaObject())) {
            Term tmp2 = streamManager.get(a1);
            while (!tmp2.isNil()) {
                Term car = (tmp2).car().dref();
                if ((car.isCompound())) {
                    Term functor = (car).functor();
                    Term[] args = (car).args();
                    if (functor.equalsTerm(SYM_ALIAS_1)) {
                        Term alias = args[0].dref();
                        streamManager.remove(alias);
                    }
                }
                tmp2 = (tmp2).cdr().dref();
            }
            streamManager.remove(a1);
        } else {
            throw new IllegalDomainException(thiz, 1, "stream_or_alias", a1);
        }
        return cont;
    }

    // .PNumber;
    // .Operation;
    // .Predicate;
    // .Prolog;
    // .Term;
    // _$compare0_3 extends Predicate.P3 {
    public static Operation PRED_$compare0_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a2 = LARG[1].dref();
        Term a3 = LARG[2].dref();
        if (!LARG[0].unifyInt((a2.compareTo(a3)), engine.trail))
            return engine.fail();
        return cont;
    }

    // .PNumber;
    // .Operation;
    // .Predicate;
    // .Prolog;
    // .Functor;
    // .Term;
    // _$compiled_predicate_3 extends Predicate.P3 {
    public static Operation PRED_$compiled_predicate_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1 = LARG[0].dref();
        Term a2 = LARG[1].dref();
        Term a3 = LARG[2].dref();
        if (!engine.pcl.definedPredicate(a1.getString(), (a2).getString(), (a3).intValue()))
            return engine.fail();
        return cont;
    }

    // .PNumber;
    // .Operation;
    // .Predicate;
    // .Prolog;
    // .Functor;
    // .Term;
    // _$compiled_predicate_or_builtin_3 extends Predicate.P3 {
    public static Operation PRED_$compiled_predicate_or_builtin_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1 = LARG[0].dref();
        Term a2 = LARG[1].dref();
        Term a3 = LARG[2].dref();
        final String atomName = (a2).getString();
        if (!engine.pcl.definedPredicate(a1.getString(), atomName, (a3).intValue())
                && !engine.pcl.definedPredicate(Prolog.BUILTIN, atomName, (a3).intValue()))
            return engine.fail();
        return cont;
    }

    /**
     * <code>current_engine/1</code>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _current_engine_1 extends Predicate.P1 {
    public static Operation PRED_current_engine_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        a1 = a1.dref();
        if (!a1.unify(FFIObject(engine), engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>current_input/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _current_input_1 extends Predicate.P1 {
    public static Operation PRED_current_input_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.IO, thiz, LARG[0]);
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        a1 = a1.dref();
        if ((a1.isVar())) {
            a1.asVariableTerm().bind(TermData.FFIObject(engine.getCurrentInput()), engine.trail);
        } else if ((a1.isJavaObject())) {
            if (!a1.unify(TermData.FFIObject(engine.getCurrentInput()), engine.trail))
                return engine.fail();
        } else {
            throw new IllegalDomainException(thiz, 1, "stream", a1);
        }
        return cont;
    }

    /**
     * <code>current_output/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _current_output_1 extends Predicate.P1 {
    public static Operation PRED_current_output_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.IO, thiz, LARG[0]);
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        a1 = a1.dref();
        if ((a1.isVar())) {
            a1.asVariableTerm().bind(TermData.FFIObject(engine.getCurrentOutput()), engine.trail);
        } else if ((a1.isJavaObject())) {
            if (!a1.unify(TermData.FFIObject(engine.getCurrentOutput()), engine.trail))
                return engine.fail();
        } else {
            throw new IllegalDomainException(thiz, 1, "stream", a1);
        }
        return cont;
    }

    /**
     * <code>'$cut'/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$cut_1 extends Predicate.P1 {
    public static Operation PRED_$cut_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        // engine.setB0();
        Term a1;
        a1 = LARG[0];
        a1 = a1.dref();
        if (!(a1.isInteger())) {
            throw new IllegalTypeException("integer", a1);
        } else {
            engine.cut(a1.intValue());
        }
        return cont;
    }

    /**
     * <code>'$end_exception'/1<code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$end_exception_1 extends Predicate.P1 {
    public static Operation PRED_$end_exception_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        engine.setB0();
        final int B = engine.popCatcherB();
        engine.trail.push(() -> engine.pushCatcherB(B));
        return cont;
    }

    /**
     * <code>'$end_sync'/1</code>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$end_sync_1 extends Predicate.P1 {
    public static Operation PRED_$end_sync_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        a1 = a1.dref();
        if (!(a1.isJavaObject()))
            throw new IllegalTypeException(thiz, 1, "java", a1);
        Object obj = a1.object();
        if (!(obj instanceof PRED_$begin_sync_2))
            throw new SystemException("a1 must be an object of PRED_$begin_sync_2: " + thiz);
        PRED_$begin_sync_2 p = ((PRED_$begin_sync_2) obj);
        p.outOfScope = true;
        engine.trail.push(new OutOfScope(p));
        return cont;
    }

    /**
     * <code>'$erase'/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _$erase_1 extends Predicate.P1 {
    public static Operation PRED_$erase_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1 = LARG[0];
        int idx;
        a1 = a1.dref();
        if (!(a1.isInteger()))
            throw new IllegalTypeException(thiz, 1, "integer", a1);
        idx = (a1).intValue();
        engine.internalDB.erase(idx);
        return cont;
    }

    // jio.File;
    /** {@code exists_directory(+Directory)} */
    // _exists_directory_1 extends Predicate.P1 {
    public static Operation PRED_exists_directory_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.IO, thiz, LARG[0]);
        engine.setB0();
        Term a1 = LARG[0].dref();
        if ((a1.isVar()))
            throw new PInstantiationException(thiz, 1);
        if (!(a1.isAtom()))
            throw new IllegalDomainException(thiz, 1, "directory", a1);
        File file = new File(a1.pprint());
        if (file.isDirectory())
            return cont;
        else
            return engine.fail();
    }

    // jio.File;
    /** {@code exists_file(+File)} */
    // _exists_file_1 extends Predicate.P1 {
    public static Operation PRED_exists_file_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.IO, thiz, LARG[0]);
        engine.setB0();
        Term a1 = LARG[0].dref();
        if ((a1.isVar()))
            throw new PInstantiationException(thiz, 1);
        if (!(a1.isAtom()))
            throw new IllegalDomainException(thiz, 1, "file", a1);
        File file = new File(a1.pprint());
        if (file.isFile())
            return cont;
        else
            return engine.fail();
    }

    /**
     * <code>'$fast_write'/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$fast_write_1 extends Predicate.P1 {
    public static Operation PRED_$fast_write_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1;
        a1 = LARG[0].dref();
        PrintWriter pw = engine.getCurrentOutput();
        pw.print(a1.pprint());
        return cont;
    }

    // jio.PrintWriter;
    /**
     * <code>'$fast_write'/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$fast_write_2 extends Predicate.P2 {
    public static Operation PRED_$fast_write_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a2;
        a2 = LARG[1];
        PrintWriter stream = toPrintWriter(engine, thiz, LARG[0]);
        // print term
        stream.print(a2.dref().pprint());
        return cont;
    }

    /**
     * <code>'$fast_writeq'/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$fast_writeq_1 extends Predicate.P1 {
    public static Operation PRED_$fast_writeq_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1;
        a1 = LARG[0].dref();
        engine.getCurrentOutput().print(a1.toQuotedString());
        return cont;
    }

    // jio.PrintWriter;
    /**
     * <code>'$fast_writeq'/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$fast_writeq_2 extends Predicate.P2 {
    public static Operation PRED_$fast_writeq_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        // S_or_a
        PrintWriter stream = toPrintWriter(engine, thiz, a1);
        // print term
        String qs = a2.dref().toQuotedString();
        if ("/*".equals(qs)) {
            qs = "'" + qs + "'";
        }
        stream.print(qs);
        return cont;
    }

    public static PrintWriter toPrintWriter(Prolog engine, Operation thiz, Term a1) throws BuiltinException {
        Object stream = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getStreamManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "stream", a1, "");
            stream = (engine.getStreamManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            stream = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "stream_or_alias", a1);
        }
        if (!(stream instanceof Writer))
            throw new PermissionException(thiz, "output", "stream", a1, "");
        return (PrintWriter) stream;
    }

    // jio.File;
    /** {@code file_directory_name(+File, -Directory)} */
    // _file_directory_name_2 extends Predicate.P2 {
    public static Operation PRED_file_directory_name_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        Term a1 = LARG[0].dref();
        engine.requireFeature(Prolog.Feature.IO, thiz, a1);
        engine.setB0();
        if ((a1.isVar()))
            throw new PInstantiationException(thiz, 1);
        if (!(a1.isAtom()))
            throw new IllegalDomainException(thiz, 1, "file", a1);
        File file = new File(a1.pprint());
        File dir = file.getParentFile();
        if (dir == null)
            throw new IllegalDomainException(thiz, 1, "file", a1);
        Term a2 = LARG[1].dref();
        if (a2.unify(TermData.createAtomic(dir.getPath()), engine.trail))
            return cont;
        else
            return engine.fail();
    }

    // jio.PrintWriter;
    /**
     * <code>flush_output/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _flush_output_1 extends Predicate.P1 {
    public static Operation PRED_flush_output_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        PrintWriter stream = toPrintWriter(engine, thiz, LARG[0]);
        stream.flush();
        return cont;
    }

    /**
     * <code>functor/3</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _functor_3 extends Predicate.P3 {
    private static final Functor SYM_DOT_0 = SYM(".");

    public static Operation PRED_functor_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        // functor(?X,+Y,+Z)
        a1 = a1.dref();
        if ((a1.isVar())) {
            a2 = a2.dref();
            if ((a2.isVar()))
                throw new PInstantiationException(thiz, 2);
            if (!(a2.isAtom()) && !(a2.isNumber()) && !(a2.isJavaObject()) && !(a2.isClosure()))
                throw new IllegalTypeException(thiz, 2, "atomic", a2);
            a3 = a3.dref();
            if ((a3.isVar()))
                throw new PInstantiationException(thiz, 3);
            if (!(a3.isInteger()))
                throw new IllegalTypeException(thiz, 3, "integer", a3);
            int n = (a3).intValue();
            if (n < 0)
                throw new IllegalDomainException(thiz, 3, "not_less_than_zero", a3);
            if (n == 0) {
                if (!a1.unify(a2, engine.trail))
                    return engine.fail();
                return cont;
            }
            if (!(a2.isAtom()))
                throw new IllegalTypeException(thiz, 2, "atom", a2);
            if (n == 2 && a2.equalsTerm(SYM_DOT_0)) {
                Term t = CONS(V(engine), V(engine));
                if (!a1.unify(t, engine.trail))
                    return engine.fail();
                return cont;
            }
            Term[] args = new Term[n];
            for (int i = 0; i < n; i++)
                args[i] = V(engine);
            Functor sym = TermData.createF((a2).getString(), n);
            if (!a1.unifyS(sym, engine.trail, args))
                return engine.fail();
            return cont;
        }
        // functor(+X,?Y,?Z)
        Term functor;
        NumberTerm arity;
        if ((a1.isAtom()) || (a1.isNumber()) || (a1.isJavaObject()) || (a1.isClosure())) {
            functor = a1;
            arity = Integer(0);
        } else if ((a1.isCons())) {
            functor = SYM_DOT_0;
            arity = Integer(2);
        } else if ((a1.isCompound())) {
            functor = a1.functor();
            arity = Integer(a1.arity());
        } else {
            return engine.fail();
        }
        if (!a2.unify(functor, engine.trail))
            return engine.fail();
        if (!a3.unify(arity, engine.trail))
            return engine.fail();
        return cont;
    }

    // jio.*;
    /**
     * <code>get/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _get_2 extends Predicate.P2 {
    public static Operation PRED_get_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        // Char
        a2 = a2.dref();
        if (!(a2.isVar())) {
            if (!(a2.isInteger()))
                throw new IllegalTypeException(thiz, 2, "integer", a2);
            int n = (a2).intValue();
            if (n != -1 && !Character.isDefined(n))
                throw new RepresentationException(thiz, 2, "in_character_code");
        }
        // S_or_a
        PushbackReader stream = toPBReader(engine, thiz, a1);
        // read a non-blank single character
        try {
            PushbackReader in = stream;
            int c = in.read();
            while (Character.isWhitespace((char) c))
                c = in.read();
            if (c < 0) { // EOF
                if (!a2.unify(INT_EOF, engine.trail))
                    return engine.fail();
                return cont;
            }
            if (!Character.isDefined(c))
                throw new RepresentationException(thiz, 0, "character");
            if (!a2.unifyInt((c), engine.trail))
                return engine.fail();
            return cont;
        } catch (IOException e) {
            throw new TermException(TermData.FFIObject(e));
        }
    }

    // jio.*;
    /**
     * <code>get_byte/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     * @since 1.1
     */
    // _get_byte_2 extends Predicate.P2 {
    public static Operation PRED_get_byte_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        // InByte
        a2 = a2.dref();
        if (!(a2.isVar())) {
            if (!(a2.isInteger()))
                throw new IllegalTypeException(thiz, 2, "in_byte", a2);
            int n = (a2).intValue();
            if (n != -1 && (n < 0 || n > 255))
                throw new RepresentationException(thiz, 2, "in_byte");
        }
        // S_or_a
        PushbackReader stream = toPBReader(engine, thiz, a1);
        // read single byte
        try {
            int c = stream.read();
            if (c < 0) { // EOF
                if (!a2.unify(INT_EOF, engine.trail))
                    return engine.fail();
                return cont;
            }
            if (c > 255)
                throw new RepresentationException(thiz, 0, "byte");
            if (!a2.unifyInt((c), engine.trail))
                return engine.fail();
            return cont;
        } catch (IOException e) {
            throw new TermException(TermData.FFIObject(e));
        }
    }

    /**
     * @param engine
     * @param thiz
     * @param a1
     * @return
     * @throws PInstantiationException
     * @throws ExistenceException
     * @throws IllegalDomainException
     * @throws PermissionException
     */
    public static PushbackReader toPBReader(Prolog engine, Operation thiz, Term a1)
            throws PInstantiationException, ExistenceException, IllegalDomainException, PermissionException {
        Object stream = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getStreamManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "stream", a1, "");
            stream = (engine.getStreamManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            stream = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "stream_or_alias", a1);
        }
        if (!(stream instanceof PushbackReader))
            throw new PermissionException(thiz, "input", "stream", a1, "");
        return (PushbackReader) stream;
    }

    // jio.*;
    /**
     * <code>get_char/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    //
    static boolean inCharacter(Term t) {
        return (t.isAtom()) && (t.equalsTerm(SYM_EOF) || (t).getString().length() == 1);
    }

    public static Operation PRED_get_char_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        // Char
        a2 = a2.dref();
        if (!(a2.isVar()) && !inCharacter(a2))
            throw new IllegalTypeException(thiz, 2, "in_character", a2);
        // S_or_a
        PushbackReader stream = toPBReader(engine, thiz, a1);
        // read single character
        try {
            int c = stream.read();
            if (c < 0) { // EOF
                if (!a2.unify(SYM_EOF, engine.trail))
                    return engine.fail();
                return cont;
            }
            if (!Character.isDefined(c))
                throw new RepresentationException(thiz, 0, "character");
            if (!a2.unify(TermData.CHAR((char) c), engine.trail))
                return engine.fail();
            return cont;
        } catch (IOException e) {
            throw new TermException(TermData.FFIObject(e));
        }
    }

    // jio.*;
    /**
     * <code>get_code/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _get_code_2 extends Predicate.P2 {
    public static Operation PRED_get_code_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        // Char
        a2 = a2.dref();
        if (!(a2.isVar())) {
            if (!(a2.isInteger()))
                throw new IllegalTypeException(thiz, 2, "integer", a2);
            int n = (a2).intValue();
            if (n != -1 && !Character.isDefined(n))
                throw new RepresentationException(thiz, 2, "in_character_code");
        }
        // S_or_a
        // S_or_a
        PushbackReader stream = toPBReader(engine, thiz, a1);
        // read single character
        try {
            int c = stream.read();
            if (c < 0) { // EOF
                if (!a2.unify(INT_EOF, engine.trail))
                    return engine.fail();
                return cont;
            }
            if (!Character.isDefined(c))
                throw new RepresentationException(thiz, 0, "character");
            if (!a2.unifyInt((c), engine.trail))
                return engine.fail();
            return cont;
        } catch (IOException e) {
            throw new TermException(TermData.FFIObject(e));
        }
    }

    /**
     * <code>'$get_current_B'/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$get_current_B_1 extends Predicate.P1 {
    public static Operation PRED_$get_current_B_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        if (!a1.unifyInt((engine.stack.top()), engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>'$get_exception'/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$get_exception_1 extends Predicate.P1 {
    public static Operation PRED_$get_exception_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        if (!a1.unify(engine.getException(), engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>'$get_hash_manager'/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$get_hash_manager_1 extends Predicate.P1 {
    public static Operation PRED_$get_hash_manager_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        a1 = a1.dref();
        if (!(a1.isVar()))
            throw new IllegalTypeException(thiz, 1, "variable", a1);
        if (!a1.unify(TermData.FFIObject(engine.getHashManager()), engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>'$get_instances'/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _$get_instances_2 extends Predicate.P2 {
    private static final Functor COMMA = F(",", 2);

    public static Operation PRED_$get_instances_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        // int idx;
        a1 = a1.dref();
        if (a1.isNil())
            return engine.fail();
        if (!(a1.isCons()))
            throw new IllegalTypeException(thiz, 1, "list", a1);
        Term x = Prolog.Nil;
        Term tmp = a1;
        while (!tmp.isNil()) {
            if (!(tmp.isCons()))
                throw new IllegalTypeException(thiz, 1, "list", a1);
            Term car = (tmp).car().dref();
            if ((car.isVar()))
                throw new PInstantiationException(thiz, 1);
            if (!(car.isInteger()))
                throw new RepresentationException(thiz, 1, "integer");
            // car is an integer
            int i = (car).intValue();
            Term e = engine.internalDB.get(i);
            if (e != null) {
                x = CONS(C(COMMA, e, car), x);
            }
            tmp = (tmp).cdr().dref();
        }
        if (!a2.unify(x, engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>'$get_level'/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$get_level_1 extends Predicate.P1 {
    public static Operation PRED_$get_level_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        // engine.setB0();
        Term a1;
        a1 = LARG[0];
        if (!a1.unifyInt((engine.B0), engine.trail)) {
            return engine.fail();
        }
        return cont;
    }

    private static final Functor TRUE = SYM("true");
    private static final Functor FALSE = SYM("false");
    private static final Functor BOUNDED = SYM("bounded");
    private static final Functor MAX_INTEGER = SYM("max_integer");
    private static final Functor MIN_INTEGER = SYM("min_integer");
    private static final Functor INTEGER_ROUNDING_FUNCTION = SYM("integer_rounding_function");
    private static final Functor MAX_ARITY = SYM("max_arity");

    /**
     * <code>'$get_prolog_impl_flag'/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$get_prolog_impl_flag_2 extends Predicate.P2 {
    public static Operation PRED_$get_prolog_impl_flag_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.equalsTerm(BOUNDED)) {
            if (engine.isBounded()) {
                if (!a2.unify(TRUE, engine.trail))
                    return engine.fail();
            } else {
                if (!a2.unify(FALSE, engine.trail))
                    return engine.fail();
            }
        } else if (a1.equalsTerm(MAX_INTEGER)) {
            if (!a2.unifyInt((engine.getMaxInteger()), engine.trail))
                return engine.fail();
        } else if (a1.equalsTerm(MIN_INTEGER)) {
            if (!a2.unifyInt((engine.getMinInteger()), engine.trail))
                return engine.fail();
        } else if (a1.equalsTerm(INTEGER_ROUNDING_FUNCTION)) {
            if (!a2.unify(SYM(engine.getIntegerRoundingFunction()), engine.trail))
                return engine.fail();
        } else if (a1.equalsTerm(CHAR_CONVERSION)) {
            if (!a2.unify(SYM(engine.getCharConversion()), engine.trail))
                return engine.fail();
        } else if (a1.equalsTerm(DEBUG)) {
            if (!a2.unify(SYM(engine.getDebug()), engine.trail))
                return engine.fail();
        } else if (a1.equalsTerm(MAX_ARITY)) {
            if (!a2.unifyInt((engine.getMaxArity()), engine.trail))
                return engine.fail();
        } else if (a1.equalsTerm(UNKNOWN)) {
            if (!a2.unify(SYM(engine.getUnknown()), engine.trail))
                return engine.fail();
        } else if (a1.equalsTerm(DOUBLE_QUOTES)) {
            if (!a2.unify(SYM(engine.getDoubleQuotes()), engine.trail))
                return engine.fail();
        } else if (a1.equalsTerm(PRINT_STACK_TRACE)) {
            if (!a2.unify(SYM(engine.getPrintStackTrace()), engine.trail))
                return engine.fail();
        } else {
            return engine.fail();
        }
        return cont;
    }

    /**
     * <code>'$get_stream_manager'/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$get_stream_manager_1 extends Predicate.P1 {
    public static Operation PRED_$get_stream_manager_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        a1 = a1.dref();
        if (!(a1.isVar()))
            throw new IllegalTypeException(thiz, 1, "variable", a1);
        if (!a1.unify(TermData.FFIObject(engine.getStreamManager()), engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>halt/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _halt_1 extends Predicate.P1 {
    public static Operation PRED_halt_1_static_exec(Prolog engine) {
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1 = LARG[0];
        a1 = a1.dref();
        if ((a1.isVar()))
            throw new PInstantiationException(thiz, 1);
        if (!(a1.isInteger()))
            throw new IllegalTypeException(thiz, 1, "integer", a1);
        engine.halt = 1 + (a1).intValue();
        return null;
    }

    // jutil.Hashtable;
    /**
     * <code>'$hash_adda'/3</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$hash_adda_3 extends Predicate.P3 {

    public static Operation PRED_$hash_adda_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        Object hash = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getHashManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "hash", a1, "");
            hash = (engine.getHashManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            hash = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "hash_or_alias", a1);
        }
        if (!(HashtableOfTerm.isHashtableOfTerm(hash)))
            throw new InternalException(thiz + ": Hash is not HashtableOfTerm");
        a2 = a2.dref();
        Term elem = TermData.asHashtableOfTerm(hash).get(a2);
        if (elem == null)
            elem = Nil;
        a3 = a3.dref();
        asHashtableOfTerm(hash).put(a2, CONS(a3, elem));
        return cont;
    }

    // jutil.ArrayDeque;
    // jutil.Deque;
    // jutil.Hashtable;
    /**
     * <code>'$hash_addz'/3</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$hash_addz_3 extends Predicate.P3 {

    public static Operation PRED_$hash_addz_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        Object hash = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getHashManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "hash", a1, "");
            hash = (engine.getHashManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            hash = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "hash_or_alias", a1);
        }
        if (!(HashtableOfTerm.isHashtableOfTerm(hash)))
            throw new InternalException(thiz + ": Hash is not HashtableOfTerm");
        a2 = a2.dref();
        a3 = a3.dref();
        Term elem = asHashtableOfTerm(hash).get(a2);
        if (elem == null || Nil.equalsTerm(elem)) {
            elem = new ListViewTerm(a3);
        } else if (elem.isCons()) {
            elem = (elem).add(a3);
        } else {
            throw new InternalException(thiz + ": elem is not a ListTerm");
        }
        asHashtableOfTerm(hash).put(a2, elem);
        return cont;
    }

    // jutil.Hashtable;
    /**
     * <code>hash_clear/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _hash_clear_1 extends Predicate.P1 {
    public static Operation PRED_hash_clear_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        Object hash = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getHashManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "hash", a1, "");
            hash = (engine.getHashManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            hash = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "hash_or_alias", a1);
        }
        if (!(HashtableOfTerm.isHashtableOfTerm(hash)))
            throw new InternalException(thiz + ": Hash is not HashtableOfTerm");
        asHashtableOfTerm(hash).clear();
        return cont;
    }

    // jutil.Hashtable;
    /**
     * <code>hash_contains_key/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    public static Operation PRED_hash_contains_key_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1 = LARG[0].dref();
        Term a2 = LARG[1].dref();
        Object hash = null;
        if ((a1.isJavaObject())) {
            hash = a1.object();
        } else if ((a1.isAtom())) {
            Term t = engine.getHashManager().get(a1);
            if (t == null) {
                throw new ExistenceException(thiz, 1, "hash", a1, "");
            }
            hash = t.object();
        } else if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else {
            throw new IllegalDomainException(thiz, 1, "hash_or_alias", a1);
        }
        if (HashtableOfTerm.isHashtableOfTerm(hash)) {
            if (asHashtableOfTerm(hash).containsKey(a2)) {
                return cont;
            }
            return engine.fail();
        }
        throw new InternalException(thiz + ": Hash is not HashtableOfTerm");
    }

    // jutil.Hashtable;
    /**
     * <code>hash_get/3</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _hash_get_3 extends Predicate.P3 {
    public static Operation PRED_hash_get_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        Object hash = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getHashManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "hash", a1, "");
            hash = (engine.getHashManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            hash = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "hash_or_alias", a1);
        }
        if (!(HashtableOfTerm.isHashtableOfTerm(hash)))
            throw new InternalException(thiz + ": Hash is not HashtableOfTerm");
        a2 = a2.dref();
        Term elem = asHashtableOfTerm(hash).get(a2);
        if (elem == null)
            elem = Prolog.Nil;
        if (!a3.unify(elem, engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>hash_is_empty/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _hash_is_empty_1 extends Predicate.P1 {
    public static Operation PRED_hash_is_empty_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        Object hash = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getHashManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "hash", a1, "");
            hash = (engine.getHashManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            hash = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "hash_or_alias", a1);
        }
        if (!(HashtableOfTerm.isHashtableOfTerm(hash)))
            throw new InternalException(thiz + ": Hash is not HashtableOfTerm");
        if (!asHashtableOfTerm(hash).isEmpty())
            return engine.fail();
        return cont;
    }

    /**
     * <code>hash_keys/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _hash_keys_2 extends Predicate.P2 {
    public static Operation PRED_hash_keys_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        Object hash = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getHashManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "hash", a1, "");
            hash = (engine.getHashManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            hash = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "hash_or_alias", a1);
        }
        if (!(HashtableOfTerm.isHashtableOfTerm(hash)))
            throw new InternalException(thiz + ": Hash is not HashtableOfTerm");
        Term keys = Prolog.Nil;
        for (Term t : asHashtableOfTerm(hash).keySet())
            keys = CONS(t, keys);
        if (!a2.unify(keys, engine.trail))
            return engine.fail();
        return cont;
    }

    // jutil.Hashtable;
    /**
     * <code>hash_put/3</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _hash_put_3 extends Predicate.P3 {
    public static Operation PRED_hash_put_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        Object hash = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getHashManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "hash", a1, "");
            hash = (engine.getHashManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            hash = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "hash_or_alias", a1);
        }
        if (!(HashtableOfTerm.isHashtableOfTerm(hash)))
            throw new InternalException(thiz + ": Hash is not HashtableOfTerm");
        a2 = a2.dref();
        a3 = a3.dref();
        ((HashtableOfTerm) hash).put(a2, a3);
        return cont;
    }

    // .ExistenceException;
    // .HashtableOfTerm;
    // .IllegalDomainException;
    // .InternalException;
    // .FFIObjectTerm;
    // .Operation;
    // .PInstantiationException;
    // .Predicate;
    // .Prolog;
    // .Term;
    /**
     * <code>hash_remove/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _hash_remove_2 extends Predicate.P2 {
    public static Operation PRED_hash_remove_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        Object hash = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getHashManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "hash", a1, "");
            hash = (engine.getHashManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            hash = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "hash_or_alias", a1);
        }
        if (!(HashtableOfTerm.isHashtableOfTerm(hash)))
            throw new InternalException(thiz + ": Hash is not HashtableOfTerm");
        a2 = a2.dref();
        asHashtableOfTerm(hash).remove(a2);
        return cont;
    }

    // jutil.ArrayDeque;
    // jutil.Deque;
    // jutil.Hashtable;
    /**
     * <code>'$hash_remove_first'/3</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$hash_remove_first_3 extends Predicate.P3 {
    //
    public static Operation PRED_$hash_remove_first_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        Object hash = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getHashManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "hash", a1, "");
            hash = (engine.getHashManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            hash = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "hash_or_alias", a1);
        }
        if (!(HashtableOfTerm.isHashtableOfTerm(hash)))
            throw new InternalException(thiz + ": Hash is not HashtableOfTerm");
        a2 = a2.dref();
        Term elem = asHashtableOfTerm(hash).get(a2);
        if (elem == null || elem.isNil())
            return cont;
        a3 = a3.dref();
        Deque<Term> stack = new ArrayDeque<Term>();
        Term t = elem.dref();
        while (t.isCons()) {
            Term lt = t;
            Term y = lt.car().dref();
            t = lt.cdr();
            if (y.equalsTerm(a3)) {
                break;
            }
            stack.push(y);
        }
        while (!stack.isEmpty()) {
            t = CONS(stack.pop(), t);
        }
        elem = t;
        if (elem.isNil() && (a2.isInteger())) {
            asHashtableOfTerm(hash).remove(a2);
            // System.out.println("################ key " + a2 + " is removed");
        } else {
            asHashtableOfTerm(hash).put(a2, elem);
        }
        return cont;
    }

    // jutil.Hashtable;
    /**
     * <code>hash_size/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _hash_size_2 extends Predicate.P2 {
    public static Operation PRED_hash_size_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        Object hash = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if ((a1.isAtom())) {
            if (!engine.getHashManager().containsKey(a1))
                throw new ExistenceException(thiz, 1, "hash", a1, "");
            hash = (engine.getHashManager().get(a1)).object();
        } else if ((a1.isJavaObject())) {
            hash = a1.object();
        } else {
            throw new IllegalDomainException(thiz, 1, "hash_or_alias", a1);
        }
        if (!(HashtableOfTerm.isHashtableOfTerm(hash)))
            throw new InternalException(thiz + ": Hash is not HashtableOfTerm");
        a2 = a2.dref();
        if (!(a2.isVar()) && !(a2.isInteger()))
            throw new IllegalTypeException(thiz, 1, "integer", a2);
        if (!a2.unifyInt((asHashtableOfTerm(hash).size()), engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>'$insert'/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _$insert_2 extends Predicate.P2 {
    public static Operation PRED_$insert_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        int idx;
        a2 = a2.dref();
        if (!(a2.isVar()))
            throw new IllegalTypeException(thiz, 2, "variable", a2);
        a1 = a1.dref();
        idx = engine.internalDB.insert(a1);
        if (!a2.unifyInt((idx), engine.trail))
            return engine.fail();
        return cont;
    }

    // jlang.reflect.*;
    /**
     * <code>java_constructor0/2</code>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _java_constructor0_2 extends FFIPredicate {

    public static Operation PRED_java_constructor0_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.JAVA_REFLECTION, thiz, LARG[0]);
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        Class clazz = null;
        Object instance = null;
        int arity;
        Constructor[] constrs = null;
        Term[] pArgs = null;
        Object[] jArgs = null;
        Constructor c = null;
        try {
            // 2nd. argument (unbound variable)
            a2 = a2.dref();
            if (!(a2.isVar()))
                throw new IllegalTypeException(thiz, 2, "variable", a2);
            // 1st. argument (atom or callable term)
            a1 = a1.dref();
            if ((a1.isVar()))
                throw new PInstantiationException(thiz, 1);
            if (!(a1.isAtom()) && !(a1.isCompound()))
                throw new IllegalTypeException(thiz, 1, "callable", a1);
            if ((a1.isAtom())) { // No argument constructor
                clazz = Class.forName(a1.getString());
                instance = clazz.newInstance();
                if (!a2.unify(toPrologTerm(instance), engine.trail))
                    return engine.fail();
                return cont;
            }
            // Parameterized constructor
            clazz = Class.forName(a1.getString());
            arity = a1.arity();
            constrs = clazz.getConstructors();
            if (constrs.length == 0)
                throw new ExistenceException(thiz, 1, "constructor", a1, "");
            pArgs = a1.args();
            jArgs = new Object[arity];
            for (int i = 0; i < arity; i++) {
                pArgs[i] = pArgs[i].dref();
                if (!(pArgs[i].isJavaObject()))
                    pArgs[i] = TermData.FFIObject(pArgs[i]);
                jArgs[i] = pArgs[i].toJava();
            }
            for (Constructor constr : constrs) {
                if (checkParameterTypes(constr.getParameterTypes(), pArgs)) {
                    try {
                        c = constr;
                        // c.setAccessible(true);
                        instance = c.newInstance(jArgs);
                        break; // Succeeds to create new instance
                    } catch (Exception e) {
                        c = null; // Back to loop
                    }
                }
            }
            if (c == null)
                throw new ExistenceException(thiz, 1, "constructor", a1, "");
            if (!a2.unify(toPrologTerm(instance), engine.trail))
                return engine.fail();
            return cont;
        } catch (ClassNotFoundException e) { // Class.forName(..)
            throw new JavaException(thiz, 1, e);
        } catch (InstantiationException e) { // Class.forName(..) or
                                             // Constructor.newInstance()
            throw new JavaException(thiz, 1, e);
        } catch (IllegalAccessException e) { // Class.forName(..) or
                                             // Constructor.newInstance()
            throw new JavaException(thiz, 1, e);
        } catch (SecurityException e) { // Class.getConstructors()
            throw new JavaException(thiz, 1, e);
        } catch (IllegalArgumentException e) { // Constructor.newInstance()
            throw new JavaException(thiz, 1, e);
        }
    }

    // jutil.List;
    /**
     * <code>java_conversion/2</code>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _java_conversion_2 extends Predicate.P2 {
    public static Operation PRED_java_conversion_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        a1 = a1.dref();
        a2 = a2.dref();
        if ((a1.isVar())) { // a1 = var
            if ((a2.isJavaObject())) { // a1 = var /\ a2 = java
                a1.asVariableTerm().bind(inverseConversion((a2).object()), engine.trail);
            } else { // a1 = var /\ a2 = nonjava
                a1.asVariableTerm().bind(a2, engine.trail);
            }
        } else if (!(a2.isVar())) { // a1 = nonvar /\ a2 = nonvar
            throw new IllegalTypeException(thiz, 2, "variable", a2);
        } else { // a1 = nonvar /\ a2 = var
                 // (a1 = java \/ a1 = str \/ a1 = clo) /\ a2 = var
            if ((a1.isJavaObject()) || (a1.isCompound()) || (a1.isClosure())) {
                a2.asVariableTerm().bind(a1, engine.trail);
            } else { // a1 != java /\ a1 != str /\ a1 != clo /\ a2 = var
                a2.asVariableTerm().bind(TermData.FFIObject(a1.toJava()), engine.trail);
            }
        }
        return cont;
    }

    static Term inverseConversion(Object o) {
        if (o == null) {
            throw new EvaluationException(null, 2, "undefined");
        } else if (o instanceof Byte || o instanceof Short || o instanceof Integer || o instanceof Long) {
            return Integer(((Number) o).intValue());
        } else if (o instanceof Float || o instanceof Double) {
            return Float(((Number) o).doubleValue());
        } else if (o instanceof String) {
            return TermData.createAtomic((String) o);
        } else if (o instanceof List) {
            List v = (List) o;
            Term t = Prolog.Nil;
            for (int i = v.size(); i > 0; i--) {
                t = CONS(inverseConversion(v.get(i - 1)), t);
            }
            return t;
        }
        return TermData.FFIObject(o);
    }

    public static Operation PRED_java_declared_constructor0_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.JAVA_REFLECTION, thiz, LARG[0]);
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        Class clazz = null;
        Object instance = null;
        int arity;
        Constructor[] constrs = null;
        Term[] pArgs = null;
        Object[] jArgs = null;
        Constructor c = null;
        // 2nd. argument (unbound variable)
        a2 = a2.dref();
        if (!(a2.isVar()))
            throw new IllegalTypeException(thiz, 2, "variable", a2);
        // 1st. argument (atom or callable term)
        try {
            a1 = a1.dref();
            if ((a1.isVar()))
                throw new PInstantiationException(thiz, 1);
            if (!(a1.isAtom()) && !(a1.isCompound()))
                throw new IllegalTypeException(thiz, 1, "callable", a1);
            if ((a1.isAtom())) { // No argument constructor
                clazz = Class.forName(a1.getString());
                c = clazz.getDeclaredConstructor();
                if (c == null)
                    throw new ExistenceException(thiz, 1, "constructor", a1, "");
                c.setAccessible(true);
                instance = c.newInstance();
                if (!a2.unify(toPrologTerm(instance), engine.trail))
                    return engine.fail();
                return cont;
            }
            // Parameterized constructor
            clazz = Class.forName(a1.getString());
            arity = a1.arity();
            constrs = clazz.getDeclaredConstructors();
            if (constrs.length == 0)
                throw new ExistenceException(thiz, 1, "constructor", a1, "");
            pArgs = a1.args();
            jArgs = new Object[arity];
            for (int i = 0; i < arity; i++) {
                pArgs[i] = pArgs[i].dref();
                if (!(pArgs[i].isJavaObject()))
                    pArgs[i] = TermData.FFIObject(pArgs[i]);
                jArgs[i] = pArgs[i].toJava();
            }
            for (Constructor constr : constrs) {
                if (checkParameterTypes(constr.getParameterTypes(), pArgs)) {
                    try {
                        c = constr;
                        c.setAccessible(true);
                        instance = c.newInstance(jArgs);
                        break; // Succeeds to create new instance
                    } catch (Exception e) {
                        c = null; // Back to loop
                    }
                }
            }
            if (c == null)
                throw new ExistenceException(thiz, 1, "constructor", a1, "");
            if (!a2.unify(toPrologTerm(instance), engine.trail))
                return engine.fail();
            return cont;
        } catch (ClassNotFoundException e) { // Class.forName(..)
            throw new JavaException(thiz, 1, e);
        } catch (InstantiationException e) { // Class.forName(..) or
                                             // Constructor.newInstance()
            throw new JavaException(thiz, 1, e);
        } catch (IllegalAccessException e) { // Class.forName(..) or
                                             // Constructor.newInstance()
            throw new JavaException(thiz, 1, e);
        } catch (NoSuchMethodException e) { // Class.getDeclaredConstructor()
            throw new JavaException(thiz, 1, e);
        } catch (SecurityException e) { // Class.getDeclaredConstructors()
            throw new JavaException(thiz, 1, e);
        } catch (IllegalArgumentException e) { // Constructor.newInstance()
            throw new JavaException(thiz, 1, e);
        } catch (InvocationTargetException e) { // Constructor.newInstance()
            throw new JavaException(thiz, 1, e);
        }
    }

    // jlang.reflect.*;
    /**
     * <code>java_declared_method0/3</code>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _java_declared_method0_3 extends FFIPredicate {

    public static Operation PRED_java_declared_method0_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.JAVA_REFLECTION, thiz, LARG[0]);
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        Class clazz = null;
        Object instance = null;
        Method[] methods = null;
        Method m = null;
        Object value = null;
        int arity;
        Term[] pArgs = null;
        Object[] jArgs = null;
        String methodName = null;
        // 3rd. argument (unbound variable)
        a3 = a3.dref();
        if (!(a3.isVar()))
            throw new IllegalTypeException(thiz, 3, "variable", a3);
        try {
            // 1st. argument (atom or java term)
            a1 = a1.dref();
            if ((a1.isVar())) {
                throw new PInstantiationException(thiz, 1);
            } else if ((a1.isAtom())) { // class
                clazz = Class.forName(a1.getString());
            } else if ((a1.isJavaObject())) { // instance
                instance = a1.object();
                clazz = a1.getIntendedClass();
            } else {
                throw new IllegalTypeException(thiz, 1, "atom_or_java", a1);
            }
            // 2nd. argument (atom or callable term)
            a2 = a2.dref();
            if ((a2.isVar())) {
                throw new PInstantiationException(thiz, 2);
            } else if ((a2.isAtom())) { // No argument method
                m = clazz.getDeclaredMethod((a2).getString());
                m.setAccessible(true);
                value = m.invoke(instance);
            } else if ((a2.isCompound())) { // Parameterized method
                methodName = (a2).getString();
                arity = (a2).arity();
                methods = clazz.getDeclaredMethods();
                if (methods.length == 0)
                    throw new ExistenceException(thiz, 2, "method", a2, "");
                pArgs = (a2).args();
                jArgs = new Object[arity];
                for (int i = 0; i < arity; i++) {
                    pArgs[i] = pArgs[i].dref();
                    if (!(pArgs[i].isJavaObject()))
                        pArgs[i] = TermData.FFIObject(pArgs[i]);
                    jArgs[i] = pArgs[i].toJava();
                }
                for (Method method : methods) {
                    if (method.getName().equals(methodName) && checkParameterTypes(method.getParameterTypes(), pArgs)) {
                        try {
                            m = method;
                            m.setAccessible(true);
                            value = m.invoke(instance, jArgs);
                            break; // Succeeds to invoke the method
                        } catch (Exception e) {
                            m = null; // Back to loop
                        }
                    }
                }
                if (m == null)
                    throw new ExistenceException(thiz, 2, "method", a2, "");
            } else {
                throw new IllegalTypeException(thiz, 2, "callable", a2);
            }
            if (value == null)
                return cont;
            if (!a3.unify(toPrologTerm(value), engine.trail))
                return engine.fail();
            return cont;
        } catch (ClassNotFoundException e) { // Class.forName
            throw new JavaException(thiz, 1, e);
        } catch (NoSuchMethodException e) { // Class.getDeclaredMethod
            throw new JavaException(thiz, 2, e);
        } catch (SecurityException e) { // Class.getDeclaredMethods
            throw new JavaException(thiz, 2, e);
        } catch (IllegalAccessException e) { // Method.invoke
            throw new JavaException(thiz, 2, e);
        } catch (IllegalArgumentException e) { // Method.invoke
            throw new JavaException(thiz, 2, e);
        } catch (InvocationTargetException e) { // Method.invoke
            throw new JavaException(thiz, 2, e);
        } catch (NullPointerException e) { // Method.invoke
            throw new JavaException(thiz, 2, e);
        }
    }

    // jlang.reflect.*;
    /**
     * <code>java_get_declared_field0/3</code>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // extends FFIPredicate {
    public static Operation PRED_java_get_declared_field0_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.JAVA_REFLECTION, thiz, LARG[0]);
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        Class clazz = null;
        Object instance = null;
        Field field = null;
        Object value = null;
        // 3rd. argument (unbound variable)
        a3 = a3.dref();
        if (!(a3.isVar()))
            throw new IllegalTypeException(thiz, 3, "variable", a3);
        try {
            // 1st. argument (atom or java term)
            a1 = a1.dref();
            if ((a1.isVar())) {
                throw new PInstantiationException(thiz, 1);
            } else if ((a1.isAtom())) { // class
                clazz = Class.forName(a1.getString());
            } else if ((a1.isJavaObject())) { // instance
                instance = a1.object();
                clazz = a1.getIntendedClass();
            } else {
                throw new IllegalTypeException(thiz, 1, "atom_or_java", a1);
            }
            // 2nd. argument (atom)
            a2 = a2.dref();
            if ((a2.isVar())) {
                throw new PInstantiationException(thiz, 2);
            } else if (!(a2.isAtom())) {
                throw new IllegalTypeException(thiz, 2, "atom", a2);
            }
            field = clazz.getDeclaredField((a2).getString());
            field.setAccessible(true);
            value = field.get(instance);
            // 3rd. argument
            if (value == null)
                return cont;
            if (!a3.unify(toPrologTerm(value), engine.trail))
                return engine.fail();
            return cont;
        } catch (ClassNotFoundException e) { // Class.forName
            throw new JavaException(thiz, 1, e);
        } catch (NoSuchFieldException e) { // Class.getField(..)
            throw new JavaException(thiz, 2, e);
        } catch (SecurityException e) { // Class.getField(..)
            throw new JavaException(thiz, 2, e);
        } catch (NullPointerException e) { // Class.getField(..)
            throw new JavaException(thiz, 2, e);
        } catch (IllegalAccessException e) { // Field.get(..)
            throw new JavaException(thiz, 2, e);
        } catch (IllegalArgumentException e) { // Field.get(..)
            throw new JavaException(thiz, 2, e);
        }
    }

    // jlang.reflect.*;
    /**
     * <code>java_get_field0/3</code>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */

    public static Operation PRED_java_get_field0_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.JAVA_REFLECTION, thiz, LARG[0]);
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        Class clazz = null;
        Object instance = null;
        Field field = null;
        Object value = null;
        // 3rd. argument (unbound variable)
        a3 = a3.dref();
        if (!(a3.isVar()))
            throw new IllegalTypeException(thiz, 3, "variable", a3);
        try {
            // 1st. argument (atom or java term)
            a1 = a1.dref();
            if ((a1.isVar())) {
                throw new PInstantiationException(thiz, 1);
            } else if ((a1.isAtom())) { // class
                clazz = Class.forName(a1.getString());
            } else if ((a1.isJavaObject())) { // instance
                instance = a1.object();
                clazz = a1.getIntendedClass();
            } else {
                throw new IllegalTypeException(thiz, 1, "atom_or_java", a1);
            }
            // 2nd. argument (atom)
            a2 = a2.dref();
            if ((a2.isVar())) {
                throw new PInstantiationException(thiz, 2);
            } else if (!(a2.isAtom())) {
                throw new IllegalTypeException(thiz, 2, "atom", a2);
            }
            field = clazz.getField((a2).getString());
            value = field.get(instance);
            // 3rd. argument
            if (value == null)
                return cont;
            if (!a3.unify(toPrologTerm(value), engine.trail))
                return engine.fail();
            return cont;
        } catch (ClassNotFoundException e) { // Class.forName
            throw new JavaException(thiz, 1, e);
        } catch (NoSuchFieldException e) { // Class.getField(..)
            throw new JavaException(thiz, 2, e);
        } catch (SecurityException e) { // Class.getField(..)
            throw new JavaException(thiz, 2, e);
        } catch (NullPointerException e) { // Class.getField(..)
            throw new JavaException(thiz, 2, e);
        } catch (IllegalAccessException e) { // Field.get(..)
            throw new JavaException(thiz, 2, e);
        } catch (IllegalArgumentException e) { // Field.get(..)
            throw new JavaException(thiz, 2, e);
        }
    }

    static Term toPrologTerm(Object obj) {
        if (TermData.instanceOfTerm(obj))
            return (Term) obj;
        else
            return TermData.FFIObject(obj);
    }

    // jlang.reflect.*;
    /**
     * <code>java_method0/3</code>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _java_method0_3 extends FFIPredicate {
    public static Operation PRED_java_method0_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.JAVA_REFLECTION, thiz, LARG[0]);
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        Class clazz = null;
        Object instance = null;
        Method[] methods = null;
        Method m = null;
        Object value = null;
        int arity;
        Term[] pArgs = null;
        Object[] jArgs = null;
        String methodName = null;
        // 3rd. argument (unbound variable)
        a3 = a3.dref();
        if (!(a3.isVar()))
            throw new IllegalTypeException(thiz, 3, "variable", a3);
        try {
            // 1st. argument (atom or java term)
            a1 = a1.dref();
            if ((a1.isVar())) {
                throw new PInstantiationException(thiz, 1);
            } else if ((a1.isAtom())) { // class
                clazz = Class.forName(a1.getString());
            } else if ((a1.isJavaObject())) { // instance
                instance = a1.object();
                clazz = a1.getIntendedClass();
            } else {
                throw new IllegalTypeException(thiz, 1, "atom_or_java", a1);
            }
            // 2nd. argument (atom or callable term)
            a2 = a2.dref();
            if ((a2.isVar())) {
                throw new PInstantiationException(thiz, 2);
            } else if ((a2.isAtom())) { // No argument method
                m = clazz.getMethod((a2).getString());
                // m.setAccessible(true);
                value = m.invoke(instance);
            } else if ((a2.isCompound())) { // Parameterized method
                methodName = (a2).getString();
                arity = (a2).arity();
                methods = clazz.getMethods();
                if (methods.length == 0)
                    throw new ExistenceException(thiz, 2, "method", a2, "");
                pArgs = (a2).args();
                jArgs = new Object[arity];
                for (int i = 0; i < arity; i++) {
                    pArgs[i] = pArgs[i].dref();
                    if (!(pArgs[i].isJavaObject()))
                        pArgs[i] = TermData.FFIObject(pArgs[i]);
                    jArgs[i] = pArgs[i].toJava();
                }
                for (Method method : methods) {
                    if (method.getName().equals(methodName) && checkParameterTypes(method.getParameterTypes(), pArgs)) {
                        try {
                            m = method;
                            // m.setAccessible(true);
                            value = m.invoke(instance, jArgs);
                            break; // Succeeds to invoke the method
                        } catch (Exception e) {
                            m = null; // Back to loop
                        }
                    }
                }
                if (m == null)
                    throw new ExistenceException(thiz, 2, "method", a2, "");
            } else {
                throw new IllegalTypeException(thiz, 2, "callable", a2);
            }
            if (value == null)
                return cont;
            if (!a3.unify(toPrologTerm(value), engine.trail))
                return engine.fail();
            return cont;
        } catch (ClassNotFoundException e) { // Class.forName
            throw new JavaException(thiz, 1, e);
        } catch (NoSuchMethodException e) { // Class.getDeclaredMethod
            throw new JavaException(thiz, 2, e);
        } catch (SecurityException e) { // Class.getDeclaredMethods
            throw new JavaException(thiz, 2, e);
        } catch (IllegalAccessException e) { // Method.invoke
            throw new JavaException(thiz, 2, e);
        } catch (IllegalArgumentException e) { // Method.invoke
            throw new JavaException(thiz, 2, e);
        } catch (InvocationTargetException e) { // Method.invoke
            throw new JavaException(thiz, 2, e);
        } catch (NullPointerException e) { // Method.invoke
            throw new JavaException(thiz, 2, e);
        }
    }

    // jlang.reflect.*;
    /**
     * <code>java_set_declared_field0/3</code>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _java_set_declared_field0_3 extends FFIPredicate {

    public static Operation PRED_java_set_declared_field0_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.JAVA_REFLECTION, thiz, LARG[0]);
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        Class clazz = null;
        Object instance = null;
        Field field = null;
        Object value = null;
        try {
            // 1st. argument (atom or java term)
            a1 = a1.dref();
            if ((a1.isVar())) {
                throw new PInstantiationException(thiz, 1);
            } else if ((a1.isAtom())) { // class
                clazz = Class.forName(a1.getString());
            } else if ((a1.isJavaObject())) { // instance
                instance = a1.object();
                clazz = a1.getIntendedClass();
            } else {
                throw new IllegalTypeException(thiz, 1, "atom_or_java", a1);
            }
            // 2nd. argument (atom)
            a2 = a2.dref();
            if ((a2.isVar())) {
                throw new PInstantiationException(thiz, 2);
            } else if (!(a2.isAtom())) {
                throw new IllegalTypeException(thiz, 2, "atom", a2);
            }
            field = clazz.getDeclaredField((a2).getString());
            // 3rd. argument (term)
            a3 = a3.dref();
            if ((a3.isJavaObject()))
                value = a3.toJava();
            else
                value = a3;
            field.setAccessible(true);
            field.set(instance, value);
            return cont;
        } catch (ClassNotFoundException e) { // Class.forName
            throw new JavaException(thiz, 1, e);
        } catch (NoSuchFieldException e) { // Class.getField(..)
            throw new JavaException(thiz, 2, e);
        } catch (SecurityException e) { // Class.getField(..)
            throw new JavaException(thiz, 2, e);
        } catch (NullPointerException e) { // Class.getField(..)
            throw new JavaException(thiz, 2, e);
        } catch (IllegalAccessException e) { // Field.get(..)
            throw new JavaException(thiz, 2, e);
        } catch (IllegalArgumentException e) { // Field.get(..)
            throw new JavaException(thiz, 2, e);
        }
    }

    // jlang.reflect.*;
    /**
     * <code>java_set_field0/3</code>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _java_set_field0_3 extends FFIPredicate {

    public static Operation PRED_java_set_field0_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.JAVA_REFLECTION, thiz, LARG[0]);
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        Class clazz = null;
        Object instance = null;
        Field field = null;
        Object value = null;
        try {
            // 1st. argument (atom or java term)
            a1 = a1.dref();
            if ((a1.isVar())) {
                throw new PInstantiationException(thiz, 1);
            } else if ((a1.isAtom())) { // class
                clazz = Class.forName(a1.getString());
            } else if ((a1.isJavaObject())) { // instance
                instance = a1.object();
                clazz = a1.getIntendedClass();
            } else {
                throw new IllegalTypeException(thiz, 1, "atom_or_java", a1);
            }
            // 2nd. argument (atom)
            a2 = a2.dref();
            if ((a2.isVar())) {
                throw new PInstantiationException(thiz, 2);
            } else if (!(a2.isAtom())) {
                throw new IllegalTypeException(thiz, 2, "atom", a2);
            }
            field = clazz.getField((a2).getString());
            // 3rd. argument (term)
            a3 = a3.dref();
            if ((a3.isJavaObject()))
                value = a3.toJava();
            else
                value = a3;
            field.set(instance, value);
            return cont;
        } catch (ClassNotFoundException e) { // Class.forName
            throw new JavaException(thiz, 1, e);
        } catch (NoSuchFieldException e) { // Class.getField(..)
            throw new JavaException(thiz, 2, e);
        } catch (SecurityException e) { // Class.getField(..)
            throw new JavaException(thiz, 2, e);
        } catch (NullPointerException e) { // Class.getField(..)
            throw new JavaException(thiz, 2, e);
        } catch (IllegalAccessException e) { // Field.get(..)
            throw new JavaException(thiz, 2, e);
        } catch (IllegalArgumentException e) { // Field.get(..)
            throw new JavaException(thiz, 2, e);
        }
    }

    // jutil.Arrays;
    /**
     * <code>keysort/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _keysort_2 extends Predicate.P2 {
    private static final Functor SYM_HYPHEN_2 = F("-", 2);

    public static Operation PRED_keysort_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        int len;
        Term tmp;
        Term[] list;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if (a1.equalsTerm(Prolog.Nil)) {
            if (!a2.unify(Prolog.Nil, engine.trail))
                return engine.fail();
            return cont;
        } else if (!(a1.isCons())) {
            throw new IllegalTypeException(thiz, 1, "list", a1);
        }
        len = (a1).length();
        list = new Term[len];
        tmp = a1;
        for (int i = 0; i < len; i++) {
            if (!(tmp.isCons()))
                throw new IllegalTypeException(thiz, 1, "list", a1);
            list[i] = (tmp).car().dref();
            if (list[i].isVar())
                throw new PInstantiationException(thiz, 1);
            if (!(list[i].isCompound()))
                throw new IllegalTypeException(thiz, 1, "key_value_pair", a1);
            if (!(list[i]).functor().equalsTerm(SYM_HYPHEN_2))
                throw new IllegalTypeException(thiz, 1, "key_value_pair", a1);
            tmp = (tmp).cdr().dref();
        }
        if (!tmp.equalsTerm(Prolog.Nil))
            throw new PInstantiationException(thiz, 1);
        try {
            Arrays.sort(list, new KeySortComparator());
        } catch (BuiltinException e) {
            e.goal = thiz;
            e.argNo = 1;
            throw e;
        } catch (ClassCastException e1) {
            throw new JavaException(thiz, 1, e1);
        }
        tmp = Prolog.Nil;
        for (int i = list.length - 1; i >= 0; i--) {
            tmp = CONS(list[i], tmp);
        }
        if (!a2.unify(tmp, engine.trail))
            return engine.fail();
        return cont;
    }

    static class KeySortComparator implements java.util.Comparator<Term> {
        @Override
        public int compare(Term t1, Term t2) {
            Term arg1 = (t1).args()[0].dref();
            Term arg2 = (t2).args()[0].dref();
            return arg1.compareTo(arg2);
        }
    }

    // .Predicate.P2;
    // jio.PushbackReader;
    // _line_count_2 extends P2 {
    public static Operation PRED_line_count_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        // S_or_a
        PushbackReader stream = toPBReader(engine, thiz, a1);
        // get line number
        if (!(stream instanceof LineNumberPushbackReader)
                || !a2.unifyInt((((LineNumberPushbackReader) stream).getLineNumber() + 1), engine.trail)) {
            // if (!a2.unifyInt((0),engine.trail)){ // uncomment this for creating
            // patch and comment two lines above
            return engine.fail();
        }
        return cont;
    }

    // jutil.logging.Level;
    // jutil.logging.Logger;
    // .Predicate.P2;
    // import static SxxMachine.PRED_loggable_1.LEVELS;
    /**
     * <b>log(package:level, message)</b> - logs given <i>message</i> to the logger,
     * corresponding to <i>package</i>, under the given <i>level</i>.
     * <p>
     * <i>package</i> is expected to be atom. (Variable will cause errors). If
     * package is absent, then current package is automatically added by prolog
     * compiler. So call log('INFO','message') is valid.
     * <p>
     * <i>level</i> can be either variable or atom. If it is a variable, it will be
     * bound to current logging level of given package. If it is an atom, the
     * current logging level of given package will be set to its value. Value can be
     * one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
     * (from highest to lowest). Also lower case variants without quotes are
     * accepted. So log(info,'message') is valid.
     * <p>
     * <i>message</i> can be any term, including free variable. It will be converted
     * to string using method {@link Object#toString()}
     *
     * <p>
     * The predicate finds {@link Logger} instance, corresponding to given package,
     * and calls its method {@link Logger#log(Level, String)} with level and message
     * as arguments.
     *
     * @author semenov
     *
     */
    // _log_2 extends P2 {
    public static Operation PRED_log_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        final Term a1 = LARG[0].dref();
        final Term a2 = LARG[1].dref();
        if (!(a1.isCompound()) || a1.arity() != 2) {
            throw new IllegalTypeException(thiz, 1, "package:level", a1);
        }
        final Logger logger = Logger.getLogger(a1.arg0(0).getString());
        final Level level = LEVELS.getOrDefault(a1.arg0(1), Level.INFO);
        logger.log(level, a2::getString);
        return cont;
    }

    // jutil.logging.Level;
    // jutil.logging.Logger;
    // .Predicate.P3;
    // import static SxxMachine.PRED_loggable_1.LEVELS;
    /**
     * <b>log(package:level, format, arg1)</b> - logs message, specified by
     * <i>format</i> and <i>arg1</i>, to the logger, corresponding to
     * <i>package</i>, under the given <i>level</i>.
     * <p>
     * <i>package</i> is expected to be atom. (Variable will cause errors). If
     * package is absent, then current package is automatically added by prolog
     * compiler. So call log('INFO','%s','message') is valid.
     * <p>
     * <i>level</i> can be either variable or atom. If it is a variable, it will be
     * bound to current logging level of given package. If it is an atom, the
     * current logging level of given package will be set to its value. Value can be
     * one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
     * (from highest to lowest). Also lower case variants without quotes are
     * accepted. So log(info,'%s','message') is valid.
     * <p>
     * <i>format</i> - is expected to be an atom, holding format string, that will
     * be supplied to method {@link String#format(String, Object...)}. Variable will
     * cause error.
     * <p>
     * <i>arg1</i> - can be any term, including free variable. It will be converted
     * to string using method {@link Object#toString()}
     *
     * <p>
     * The predicate finds {@link Logger} instance, corresponding to given package,
     * and calls its method {@link Logger#log(Level, String)} with level and the
     * result of {@link String#format(String, Object...)} call with format and arg1
     * as arguments.
     *
     * @author semenov
     *
     */
    // _log_3 extends P3 {
    public static Operation PRED_log_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        final Term a1 = LARG[0].dref();
        final Term a2 = LARG[1].dref();
        final Term a3 = LARG[2].dref();
        if (!(a1.isCompound()) || a1.arity() != 2) {
            throw new IllegalTypeException(thiz, 1, "package:level", a1);
        }
        if (!(a2.isAtom())) {
            throw new IllegalTypeException(thiz, 2, "atom", a2);
        }
        final Logger logger = Logger.getLogger(a1.arg0(0).getString());
        final Level level = LEVELS.getOrDefault(a1.arg0(1), Level.INFO);
        logger.log(level, () -> String.format(a2.pprint(), a3.toJava()));
        return cont;
    }

    // jutil.logging.Level;
    // jutil.logging.Logger;
    // .Predicate.P4;
    // import static SxxMachine.PRED_loggable_1.LEVELS;
    /**
     * <b>log(package:level, format, arg1, arg2)</b> - logs message, specified by
     * <i>format</i> and <i>arg1</i>,<i>arg2</i> to the logger, corresponding to
     * <i>package</i>, under the given <i>level</i>.
     * <p>
     * <i>package</i> is expected to be atom. (Variable will cause errors). If
     * package is absent, then current package is automatically added by prolog
     * compiler. So call log('INFO','%s','message') is valid.
     * <p>
     * <i>level</i> can be either variable or atom. If it is a variable, it will be
     * bound to current logging level of given package. If it is an atom, the
     * current logging level of given package will be set to its value. Value can be
     * one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
     * (from highest to lowest). Also lower case variants without quotes are
     * accepted. So log(info,'%s','message') is valid.
     * <p>
     * <i>format</i> - is expected to be an atom, holding format string, that will
     * be supplied to method {@link String#format(String, Object...)}. Variable will
     * cause error.
     * <p>
     * <i>arg1</i> - can be any term, including free variable. It will be converted
     * to string using method {@link Object#toString()}
     * <p>
     * <i>arg2</i> - can be any term, including free variable. It will be converted
     * to string using method {@link Object#toString()}
     * <p>
     * The predicate finds {@link Logger} instance, corresponding to given package,
     * and calls its method {@link Logger#log(Level, String)} with level and the
     * result of {@link String#format(String, Object...)} call with <i>format</i>
     * and <i>arg1</i>,<i>arg2</i> as arguments.
     *
     * @author semenov
     *
     */
    // _log_4 extends P4 {
    public static Operation PRED_log_4_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        final Term a1 = LARG[0].dref();
        final Term a2 = LARG[1].dref();
        final Term a3 = LARG[2].dref();
        final Term a4 = LARG[3].dref();
        if (!(a1.isCompound()) || a1.arity() != 2) {
            throw new IllegalTypeException(thiz, 1, "package:level", a1);
        }
        if (!(a2.isAtom())) {
            throw new IllegalTypeException(thiz, 2, "atom", a2);
        }
        final Logger logger = Logger.getLogger(a1.arg0(0).getString());
        final Level level = LEVELS.getOrDefault(a1.arg0(1), Level.INFO);
        logger.log(level, () -> String.format(a2.pprint(), a3.toJava(), a4.toJava()));
        return cont;
    }

    // jutil.logging.Level;
    // jutil.logging.Logger;
    // import static SxxMachine.PRED_loggable_1.LEVELS;
    /**
     * <b>log(package:level, format, arg1,... argN)</b> - logs message, specified by
     * <i>format</i> and <i>arg1</i>...<i>argN</i> to the logger, corresponding to
     * <i>package</i>, under the given <i>level</i>.
     * <p>
     * <i>package</i> is expected to be atom. (Variable will cause errors). If
     * package is absent, then current package is automatically added by prolog
     * compiler. So call log('INFO','%s','message') is valid.
     * <p>
     * <i>level</i> can be either variable or atom. If it is a variable, it will be
     * bound to current logging level of given package. If it is an atom, the
     * current logging level of given package will be set to its value. Value can be
     * one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
     * (from highest to lowest). Also lower case variants without quotes are
     * accepted. So log(info,'%s','message') is valid.
     * <p>
     * <i>format</i> - is expected to be an atom, holding format string, that will
     * be supplied to method {@link String#format(String, Object...)}. Variable will
     * cause error.
     * <p>
     * <i>arg1</i> - can be any term, including free variable. It will be converted
     * to string using method {@link Object#toString()}
     * <p>
     * ...
     * <p>
     * <i>argN</i> - can be any term, including free variable. It will be converted
     * to string using method {@link Object#toString()}
     * <p>
     * The predicate finds {@link Logger} instance, corresponding to given package,
     * and calls its method {@link Logger#log(Level, String)} with level and the
     * result of {@link String#format(String, Object...)} call with <i>format</i>
     * and <i>arg1</i>...<i>argN</i> as arguments.
     *
     * @author semenov
     *
     */
    // _log_5 extends Predicate {

    public static Operation PRED_log_5_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        final Term a1 = LARG[0].dref();
        final Term a2 = LARG[1].dref();
        final Term a3 = LARG[2].dref();
        final Term a4 = LARG[3].dref();
        final Term a5 = LARG[4].dref();
        if (!(a1.isCompound()) || a1.arity() != 2) {
            throw new IllegalTypeException(thiz, 1, "package:level", a1);
        }
        if (!(a2.isAtom())) {
            throw new IllegalTypeException(thiz, 2, "atom", a2);
        }
        final Logger logger = Logger.getLogger(a1.arg0(0).getString());
        final Level level = LEVELS.getOrDefault(a1.arg0(1), Level.INFO);
        logger.log(level, () -> String.format(a2.pprint(), a3.toJava(), a4.toJava(), a5.toJava()));
        return cont;
    }

    // jutil.logging.Level;
    // jutil.logging.Logger;
    // import static SxxMachine.PRED_loggable_1.LEVELS;
    /**
     * <b>log(package:level, format, arg1,... argN)</b> - logs message, specified by
     * <i>format</i> and <i>arg1</i>...<i>argN</i> to the logger, corresponding to
     * <i>package</i>, under the given <i>level</i>.
     * <p>
     * <i>package</i> is expected to be atom. (Variable will cause errors). If
     * package is absent, then current package is automatically added by prolog
     * compiler. So call log('INFO','%s','message') is valid.
     * <p>
     * <i>level</i> can be either variable or atom. If it is a variable, it will be
     * bound to current logging level of given package. If it is an atom, the
     * current logging level of given package will be set to its value. Value can be
     * one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
     * (from highest to lowest). Also lower case variants without quotes are
     * accepted. So log(info,'%s','message') is valid.
     * <p>
     * <i>format</i> - is expected to be an atom, holding format string, that will
     * be supplied to method {@link String#format(String, Object...)}. Variable will
     * cause error.
     * <p>
     * <i>arg1</i> - can be any term, including free variable. It will be converted
     * to string using method {@link Object#toString()}
     * <p>
     * ...
     * <p>
     * <i>argN</i> - can be any term, including free variable. It will be converted
     * to string using method {@link Object#toString()}
     * <p>
     * The predicate finds {@link Logger} instance, corresponding to given package,
     * and calls its method {@link Logger#log(Level, String)} with level and the
     * result of {@link String#format(String, Object...)} call with <i>format</i>
     * and <i>arg1</i>...<i>argN</i> as arguments.
     *
     * @author semenov
     *
     */
    // _log_6 extends Predicate {
    public static Operation PRED_log_6_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        final Term a1 = LARG[0].dref();
        final Term a2 = LARG[1].dref();
        final Term a3 = LARG[2].dref();
        final Term a4 = LARG[3].dref();
        final Term a5 = LARG[4].dref();
        final Term a6 = LARG[5].dref();
        if (!(a1.isCompound()) || a1.arity() != 2) {
            throw new IllegalTypeException(thiz, 1, "package:level", a1);
        }
        if (!(a2.isAtom())) {
            throw new IllegalTypeException(thiz, 2, "atom", a2);
        }
        final Logger logger = Logger.getLogger(a1.arg0(0).getString());
        final Level level = LEVELS.getOrDefault(a1.arg0(1), Level.INFO);
        logger.log(level, () -> String.format(a2.pprint(), a3.toJava(), a4.toJava(), a5.toJava(), a6.toJava()));
        return cont;
    }

    // jutil.logging.Level;
    // jutil.logging.Logger;
    // import static SxxMachine.PRED_loggable_1.LEVELS;
    /**
     * <b>log(package:level, format, arg1,... argN)</b> - logs message, specified by
     * <i>format</i> and <i>arg1</i>...<i>argN</i> to the logger, corresponding to
     * <i>package</i>, under the given <i>level</i>.
     * <p>
     * <i>package</i> is expected to be atom. (Variable will cause errors). If
     * package is absent, then current package is automatically added by prolog
     * compiler. So call log('INFO','%s','message') is valid.
     * <p>
     * <i>level</i> can be either variable or atom. If it is a variable, it will be
     * bound to current logging level of given package. If it is an atom, the
     * current logging level of given package will be set to its value. Value can be
     * one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
     * (from highest to lowest). Also lower case variants without quotes are
     * accepted. So log(info,'%s','message') is valid.
     * <p>
     * <i>format</i> - is expected to be an atom, holding format string, that will
     * be supplied to method {@link String#format(String, Object...)}. Variable will
     * cause error.
     * <p>
     * <i>arg1</i> - can be any term, including free variable. It will be converted
     * to string using method {@link Object#toString()}
     * <p>
     * ...
     * <p>
     * <i>argN</i> - can be any term, including free variable. It will be converted
     * to string using method {@link Object#toString()}
     * <p>
     * The predicate finds {@link Logger} instance, corresponding to given package,
     * and calls its method {@link Logger#log(Level, String)} with level and the
     * result of {@link String#format(String, Object...)} call with <i>format</i>
     * and <i>arg1</i>...<i>argN</i> as arguments.
     *
     * @author semenov
     *
     */
    // _log_7 extends Predicate {

    public static Operation PRED_log_7_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        final Term a1 = LARG[0].dref();
        final Term a2 = LARG[1].dref();
        final Term a3 = LARG[2].dref();
        final Term a4 = LARG[3].dref();
        final Term a5 = LARG[4].dref();
        final Term a6 = LARG[5].dref();
        final Term a7 = LARG[6].dref();
        if (!(a1.isCompound()) || a1.arity() != 2) {
            throw new IllegalTypeException(thiz, 1, "package:level", a1);
        }
        if (!(a2.isAtom())) {
            throw new IllegalTypeException(thiz, 2, "atom", a2);
        }
        final Logger logger = Logger.getLogger(a1.arg0(0).getString());
        final Level level = LEVELS.getOrDefault(a1.arg0(1), Level.INFO);
        logger.log(level, () -> String
                .format(a2.pprint(), a3.toJava(), a4.toJava(), a5.toJava(), a6.toJava(), a7.toJava()));
        return cont;
    }

    // jutil.logging.Level;
    // jutil.logging.Logger;
    // .Predicate.P2;
    // import static SxxMachine.PRED_loggable_1.LEVELS;
    /**
     * <b>log_error(package:level, error)</b> - logs given <i>error</i> to the
     * logger, corresponding to <i>package</i>, under the given <i>level</i>. If
     * possible, java and prolog stack traces are also written.
     * <p>
     * <i>package</i> is expected to be atom. (Variable will cause errors). If
     * package is absent, then current package is automatically added by prolog
     * compiler. So call log('INFO','message') is valid.
     * <p>
     * <i>level</i> can be either variable or atom. If it is a variable, it will be
     * bound to current logging level of given package. If it is an atom, the
     * current logging level of given package will be set to its value. Value can be
     * one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
     * (from highest to lowest). Also lower case variants without quotes are
     * accepted. So log(info,'message') is valid.
     * <p>
     * <i>error</i> can be any term, including free variable.
     *
     * <p>
     * The predicate finds {@link Logger} instance, corresponding to given package,
     * and calls its method {@link Logger#log(Level, String)} with level and message
     * as arguments.
     *
     * @author semenov
     *
     */
    // _log_error_2 extends P2 {
    public static Operation PRED_log_error_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        final Term a1 = LARG[0].dref();
        final Term a2 = LARG[1].dref();
        if (!(a1.isCompound()) || a1.arity() != 2) {
            throw new IllegalTypeException(thiz, 1, "package:level", a1);
        }
        final Logger logger = Logger.getLogger(a1.arg0(0).getString());
        final Level level = LEVELS.getOrDefault(a1.arg0(1), Level.INFO);
        if (logger.isLoggable(level)) {
            Throwable t = null;
            if (a2.isJavaObject() && (a2.toJava() instanceof Throwable)) {
                t = (Throwable) a2.toJava();
            } else if (a2 instanceof ErrorTerm) {
                t = TermData.asErrorTerm(a2).getThrowable();
            }
            logger.log(level, a2.getString());
            if (t != null) {
                logger.log(level, "", t);
            }
        }
        return cont;
    }

    // jutil.HashMap;
    // jutil.Map;
    // jutil.logging.Level;
    // jutil.logging.Logger;
    // .Predicate.P1;
    /**
     * <p>
     * <b>loggable(package:level)</b> - succeed if given level is loggable for given
     * package. If package is absent, then current package is automatically added by
     * prolog compiler. So call loggable('INFO') is valid. Both package and level
     * are expected to be atoms. (Variables will cause errors). Level can be one of
     * 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL' (from
     * highest to lowest). Also lower case variants without quotes are accepted.
     *
     * <p>
     * The predicate finds {@link Logger} instance, corresponding to given package,
     * and calls its {@link Logger#isLoggable(Level)} method with given level.
     *
     * @author semenov
     *
     */
    // _loggable_1 extends P1 {
    public static final Map<Term, Level> LEVELS = new HashMap<>();
    static {
        LEVELS.put(SYM("ALL"), Level.ALL);
        LEVELS.put(SYM("all"), Level.ALL);
        LEVELS.put(SYM("FINEST"), Level.FINEST);
        LEVELS.put(SYM("finest"), Level.FINEST);
        LEVELS.put(SYM("FINER"), Level.FINER);
        LEVELS.put(SYM("finer"), Level.FINER);
        LEVELS.put(SYM("FINE"), Level.FINE);
        LEVELS.put(SYM("fine"), Level.FINE);
        LEVELS.put(SYM("INFO"), Level.INFO);
        LEVELS.put(SYM("info"), Level.INFO);
        LEVELS.put(SYM("CONFIG"), Level.CONFIG);
        LEVELS.put(SYM("config"), Level.CONFIG);
        LEVELS.put(SYM("WARNING"), Level.WARNING);
        LEVELS.put(SYM("warning"), Level.WARNING);
        LEVELS.put(SYM("SEVERE"), Level.SEVERE);
        LEVELS.put(SYM("severe"), Level.SEVERE);
    }

    public static Operation PRED_loggable_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        Term a1 = LARG[0].dref();
        if (!(a1.isCompound()) || a1.arity() != 2) {
            throw new IllegalTypeException(thiz, 1, "package:level", a1);
        }
        Logger logger = Logger.getLogger(a1.arg0(0).getString());
        if (!logger.isLoggable(LEVELS.getOrDefault(a1.arg0(1), Level.INFO))) {
            return engine.fail();
        }
        return cont;
    }

    // jutil.logging.Level;
    // jutil.logging.Logger;
    // .Predicate.P1;
    // import static SxxMachine.PRED_loggable_1.LEVELS;
    /**
     * <p>
     * <b>log_level(package:level)</b> - gets or sets logging level for given
     * package.
     * <p>
     * <i>package</i> is expected to be atom. (Variable will cause errors). If
     * package is absent, then current package is automatically added by prolog
     * compiler. So call log_level('INFO') is valid.
     * <p>
     * <i>level</i> can be either variable or atom. If it is a variable, it will be
     * bound to current logging level of given package. If it is an atom, the
     * current logging level of given package will be set to its value. Value can be
     * one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL'
     * (from highest to lowest). Also lower case variants without quotes are
     * accepted. So log_level(info) is valid.
     *
     * <p>
     * If <i>level</i> is bound to atom value, the predicate finds {@link Logger}
     * instance, corresponding to given package, and calls its
     * {@link Logger#setLevel(Level)} method with given <i>level</i> value.
     * <p>
     * If level is free variable, the predicate finds {@link Logger} instance,
     * corresponding to given package, calls its {@link Logger#getLevel()} method to
     * find out it is level and binds the value to the <i>level</i> argument
     *
     * @author semenov
     *
     */
    // _log_level_1 extends P1 {
    public static Operation PRED_log_level_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        final Term a1 = LARG[0].dref();
        if (!(a1.isCompound()) || a1.arity() != 2) {
            throw new IllegalTypeException(thiz, 1, "package:level", a1);
        }
        final Term packageTerm = a1.arg0(0);
        final Logger logger = Logger.getLogger(packageTerm.getString());
        final Term levelTerm = a1.arg0(1);
        if ((levelTerm.isVar())) {
            // obtain logger's level, which may be inherited from parent
            Level level = null;
            for (Logger l = logger; l != null && (level = l.getLevel()) == null; l = l.getParent()) {
            }
            if (level == null) {
                level = Level.INFO;
            }
            if (!levelTerm.unify(TermData.createAtomic(level.getName()), engine.trail)) {
                return engine.fail();
            }
        } else if (levelTerm.isAtom()) {
            logger.setLevel(LEVELS.getOrDefault(levelTerm, Level.INFO));
        } else {
            throw new IllegalTypeException(thiz, 1, "package:level", a1);
        }
        return cont;
    }

    // jio.File;
    /** {@code make_directory(+Dir)} */
    // _make_directory_1 extends Predicate.P1 {
    public static Operation PRED_make_directory_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.IO, thiz, LARG[0]);
        engine.setB0();
        Term a1 = LARG[0].dref();
        if ((a1.isVar()))
            throw new PInstantiationException(thiz, 1);
        if (!(a1.isAtom()))
            throw new IllegalDomainException(thiz, 1, "dir", a1);
        File file = new File(a1.getString());
        if (file.mkdir())
            return cont;
        else
            throw new PermissionException(thiz, "open", "dir", a1, "cannot create");
    }

    // .Predicate.P1;
    /**
     * <p>
     * mutex_create(?MutexId)
     * <p>
     * Create a mutex. If MutexId is an atom, a named mutex is created. If it is a
     * variable, an anonymous mutex reference is returned. There is no limit to the
     * number of mutexes that can be created.
     * <p>
     * description is copied from swi prolog documentation
     *
     * @author semenov
     *
     */
    // _mutex_create_1 extends P1 {
    public static Operation PRED_mutex_create_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        Term a1 = LARG[0].dref();
        if ((a1.isAtom())) {
            Mutex.getInstance(a1.getString());
        } else if ((a1.isVar())) {
            if (!a1.unify(TermData.FFIObject(Mutex.getInstance()), engine.trail)) {
                return engine.fail();
            }
        } else {
            throw new IllegalTypeException(thiz, 1, "atom or variable", a1);
        }
        return cont;
    }

    // .Predicate.P1;
    // jutil.concurrent.locks.Lock;
    /**
     * <p>
     * mutex_lock_bt(+MutexId)
     * <p>
     * Lock the mutex. Prolog mutexes are recursive mutexes: they can be locked
     * multiple times by the same thread. Only after unlocking it as many times as
     * it is locked does the mutex become available for locking by other threads. If
     * another thread has locked the mutex the calling thread is suspended until the
     * mutex is unlocked.
     * <p>
     * If MutexId is an atom, and there is no current mutex with that name, the
     * mutex is created automatically using mutex_create/1. This implies named
     * mutexes need not be declared explicitly.
     * <p>
     * Please note that locking and unlocking mutexes should be paired carefully.
     * Especially make sure to unlock mutexes even if the protected code fails or
     * raises an exception. For most common cases, use with_mutex/2, which provides
     * a safer way for handling Prolog-level mutexes. The predicate
     * setup_call_cleanup/3 is another way to guarantee that the mutex is unlocked
     * while retaining non-determinism.
     * <p>
     * description is copied from swi prolog documentation
     *
     * @author semenov
     *
     */
    // _mutex_lock_1 extends P1 {
    public static Operation PRED_mutex_lock_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        Term a1 = LARG[0].dref();
        Lock lock;
        if ((a1.isAtom())) {
            lock = Mutex.getInstance(a1.getString());
        } else if ((a1.isJavaObject()) && (a1.toJava() instanceof Lock)) {
            lock = (Lock) a1.toJava();
        } else {
            throw new IllegalTypeException(thiz, 1, "atom or JavaObjectTerm(Lock)", a1);
        }
        lock.lock();
        return cont;
    }

    // .Predicate.P1;
    // jutil.concurrent.locks.Lock;
    /**
     * <p>
     * mutex_lock(+MutexId)
     * <p>
     * Lock the mutex. Prolog mutexes are recursive mutexes: they can be locked
     * multiple times by the same thread. Only after unlocking it as many times as
     * it is locked does the mutex become available for locking by other threads. If
     * another thread has locked the mutex the calling thread is suspended until the
     * mutex is unlocked.
     * <p>
     * If MutexId is an atom, and there is no current mutex with that name, the
     * mutex is created automatically using mutex_create/1. This implies named
     * mutexes need not be declared explicitly.
     * <p>
     * Please note that locking and unlocking mutexes should be paired carefully.
     * Especially make sure to unlock mutexes even if the protected code fails or
     * raises an exception. For most common cases, use with_mutex/2, which provides
     * a safer way for handling Prolog-level mutexes. The predicate
     * setup_call_cleanup/3 is another way to guarantee that the mutex is unlocked
     * while retaining non-determinism.
     * <p>
     * the returned mutex is automatically unlocked on backtracking
     * <p>
     * description is copied from swi prolog documentation
     *
     * @author semenov
     *
     */
    // _mutex_lock_bt_1 extends P1 {
    public static Operation PRED_mutex_lock_bt_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        Term a1 = LARG[0].dref();
        final Lock lock;
        if ((a1.isAtom())) {
            lock = Mutex.getInstance(a1.getString());
        } else if ((a1.isJavaObject()) && (a1.toJava() instanceof Lock)) {
            lock = (Lock) a1.toJava();
        } else {
            throw new IllegalTypeException(thiz, 1, "atom or JavaObjectTerm(Lock)", a1);
        }
        lock.lock();
        engine.trail.push(() -> {
            try {
                lock.unlock();
            } catch (IllegalMonitorStateException e) {
                // ignore, because the lock is already unlocked explicitly
            }
        });
        return cont;
    }

    // .Predicate.P1;
    // jutil.concurrent.locks.Lock;
    /**
     * <p>
     * mutex_trylock(+MutexId) As mutex_lock/1, but if the mutex is held by another
     * thread, this predicates fails immediately.
     *
     * <p>
     * description is copied from swi prolog documentation
     *
     * @author semenov
     *
     */
    // _mutex_trylock_1 extends P1 {
    public static Operation PRED_mutex_trylock_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        Term a1 = LARG[0].dref();
        Lock lock;
        if ((a1.isAtom())) {
            lock = Mutex.getInstance(a1.getString());
        } else if ((a1.isJavaObject()) && (a1.toJava() instanceof Lock)) {
            lock = (Lock) a1.toJava();
        } else {
            throw new IllegalTypeException(thiz, 1, "atom or JavaObjectTerm(Lock)", a1);
        }
        if (!lock.tryLock()) {
            return engine.fail();
        }
        return cont;
    }

    // .Predicate.P1;
    // jutil.concurrent.locks.Lock;
    /**
     * <p>
     * mutex_unlock(+MutexId)
     * <p>
     * Unlock the mutex. This can only be called if the mutex is held by the calling
     * thread. If this is not the case, a permission_error exception is raised.
     * <p>
     * description is copied from swi prolog documentation
     *
     * @author semenov
     *
     */
    // extends P1 {
    public static Operation PRED_mutex_unlock_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        Term a1 = LARG[0].dref();
        Lock lock;
        if ((a1.isAtom())) {
            lock = Mutex.getInstance(a1.getString());
        } else if ((a1.isJavaObject()) && (a1.toJava() instanceof Lock)) {
            lock = (Lock) a1.toJava();
        } else {
            throw new IllegalTypeException(thiz, 1, "atom or JavaObjectTerm(Lock)", a1);
        }
        lock.unlock();
        return cont;
    }

    /**
     * <code>'$neck_cut'/0</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$neck_cut_0 extends Predicate.P0 {
    public static Operation PRED_$neck_cut_0_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        // engine.setB0();
        engine.neckCut();
        return cont;
    }

    /**
     * <code>new_hash/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _new_hash_2 extends Predicate.P2 {
    private static final Functor SYM_ALIAS_1 = F("alias", 1);

    public static Operation PRED_new_hash_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        a1 = a1.dref();
        if (!(a1.isVar()))
            throw new IllegalTypeException(thiz, 1, "variable", a1);
        Term newHash = TermData.FFIObject(new HashtableOfTerm());
        a2 = a2.dref();
        if (a2.isNil()) {
            if (!a1.unify(newHash, engine.trail))
                return engine.fail();
            return cont;
        } else if (!(a2.isCons())) {
            throw new IllegalTypeException(thiz, 2, "list", a2);
        }
        // a2 is list
        Term tmp = a2;
        while (!tmp.isNil()) {
            if ((tmp.isVar()))
                throw new PInstantiationException(thiz, 2);
            if (!(tmp.isCons()))
                throw new IllegalTypeException(thiz, 2, "list", a2);
            Term car = (tmp).car().dref();
            if ((car.isVar()))
                throw new PInstantiationException(thiz, 2);
            if ((car.isCompound())) {
                Term functor = (car).functor();
                Term[] args = (car).args();
                if (functor.equalsTerm(SYM_ALIAS_1)) {
                    Term alias = args[0].dref();
                    if (!(alias.isAtom()))
                        throw new IllegalDomainException(thiz, 2, "hash_option", car);
                    else {
                        if (engine.getHashManager().containsKey(alias))
                            throw new PermissionException(thiz, "new", "hash", car, "");
                        engine.getHashManager().put(alias, newHash);
                    }
                } else {
                    throw new IllegalDomainException(thiz, 2, "hash_option", car);
                }
            } else {
                throw new IllegalDomainException(thiz, 2, "hash_option", car);
            }
            tmp = (tmp).cdr().dref();
        }
        if (!a1.unify(newHash, engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>nl/0</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _nl_0 extends Predicate.P0 {
    public static Operation PRED_nl_0_static_exec_bootpred(Prolog engine) {
        Operation cont = engine.cont;
        engine.setB0();
        engine.getCurrentOutput().println();
        return cont;
    }

    /**
     * <code>number_chars/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _number_chars_2 extends Predicate.P2 {
    public static Operation PRED_number_chars_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        a1 = a1.dref();
        a2 = a2.dref();
        if (a2.isNil())
            throw new SyntaxException(thiz, 2, "character_code_list", a2, "");
        if ((a1.isVar())) { // number_chars(-Number, +CharList)
            if ((a2.isVar())) {
                throw new PInstantiationException(thiz, 2);
            } else if (!(a2.isCons())) {
                throw new IllegalTypeException(thiz, 2, "list", a2);
            }
            StringBuilder sb = new StringBuilder();
            Term x = a2;
            while (!x.isNil()) {
                if ((x.isVar()))
                    throw new PInstantiationException(thiz, 2);
                if (!(x.isCons()))
                    throw new IllegalTypeException(thiz, 2, "list", a2);
                Term car = (x).car().dref();
                if ((car.isVar()))
                    throw new PInstantiationException(thiz, 2);
                if (!(car.isAtom()) || (car).getString().length() != 1)
                    throw new IllegalTypeException(thiz, 2, "character", a2);
                sb.append((car).getString());
                x = (x).cdr().dref();
            }
            try {
                if (!a1.unifyInt((Integer.parseInt(sb.toString())), engine.trail))
                    return engine.fail();
                return cont;
            } catch (NumberFormatException e) {
            }
            try {
                if (!a1.unify(Float(sb.toString()), engine.trail))
                    return engine.fail();
                return cont;
            } catch (NumberFormatException e) {
                throw new SyntaxException(thiz, 2, "character_code_list", a2, "");
            }
        } else if ((a1.isNumber())) { // number_chars(+Number, ?CharList)
            String s = a1.getString();
            Term y = Prolog.Nil;
            for (int i = s.length() - 1; i >= 0; i--) {
                y = CONS(TermData.CHAR(s.charAt(i)), y);
            }
            if (!a2.unify(y, engine.trail))
                return engine.fail();
            return cont;
        } else {
            throw new IllegalTypeException(thiz, 1, "number", a1);
        }
    }

    private static Term Float(String string) {
        return Float(Double.parseDouble(string));
    }

    /**
     * <code>number_codes/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _number_codes_2 extends Predicate.P2 {
    public static Operation PRED_number_codes_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        a1 = a1.dref();
        a2 = a2.dref();
        if (a2.isNil())
            throw new SyntaxException(thiz, 2, "character_code_list", a2, "");
        if ((a1.isVar())) { // number_codes(-Number, +CharCodeList)
            StringBuilder sb = new StringBuilder();
            Term x = a2;
            while (!x.isNil()) {
                if ((x.isVar()))
                    throw new PInstantiationException(thiz, 2);
                if (!(x.isCons()))
                    throw new IllegalTypeException(thiz, 2, "list", a2);
                Term car = (x).car().dref();
                if ((car.isVar()))
                    throw new PInstantiationException(thiz, 2);
                if (!(car.isInteger()))
                    throw new RepresentationException(thiz, 2, "character_code");
                // car is an integer
                int i = (car).intValue();
                if (!Character.isDefined((char) i))
                    throw new RepresentationException(thiz, 2, "character_code");
                sb.append((char) i);
                x = (x).cdr().dref();
            }
            try {
                if (!a1.unifyInt((Integer.parseInt(sb.toString())), engine.trail))
                    return engine.fail();
                return cont;
            } catch (NumberFormatException e) {
            }
            try {
                if (!a1.unify(Float(sb.toString()), engine.trail))
                    return engine.fail();
                return cont;
            } catch (NumberFormatException e) {
                throw new SyntaxException(thiz, 2, "character_code_list", a2, "");
            }
        } else if ((a1.isNumber())) { // number_codes(+Number, ?CharCodeList)
            char[] chars = a1.getString().toCharArray();
            Term y = Prolog.Nil;
            for (int i = chars.length; i > 0; i--) {
                y = CONS(Integer(chars[i - 1]), y);
            }
            if (!a2.unify(y, engine.trail))
                return engine.fail();
            return cont;
        } else {
            throw new IllegalTypeException(thiz, 1, "number", a1);
        }
    }

    private static final Functor SYM_TEXT = SYM("text");
    private static final Functor SYM_READ = SYM("read");
    private static final Functor SYM_WRITE = SYM("write");
    private static final Functor SYM_APPEND = SYM("append");
    private static final Functor SYM_INPUT = SYM("input");
    private static final Functor SYM_OUTPUT = SYM("output");
    // private static final Functor SYM_ALIAS_1 = F("alias", 1);
    private static final Functor SYM_MODE_1 = F("mode", 1);
    private static final Functor SYM_TYPE_1 = F("type", 1);
    private static final Functor SYM_FILE_NAME_1 = F("file_name", 1);
    private static final Functor SYM_CHARSET = F("charset", 1);
    private static final Functor SYM_AUTOCLOSE = F("autoclose", 1);

    // jio.*;
    // jnio.charset.Charset;
    // jutil.HashMap;
    // jutil.Map;
    /**
     * <code>open/4</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _open_4 extends Predicate.P4 {
    public static Operation PRED_open_4_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.requireFeature(Prolog.Feature.IO, thiz, LARG[0]);
        engine.setB0();
        File file = null;
        String resourceName = null;
        Term alias = null;
        Term opts = Prolog.Nil;
        JavaObjectTerm streamObject;
        Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        // stream
        a3 = a3.dref();
        if (!(a3.isVar()))
            throw new IllegalTypeException(thiz, 3, "variable", a3);
        // source_sink
        a1 = a1.dref();
        if ((a1.isVar()))
            throw new PInstantiationException(thiz, 1);
        if ((a1.isAtom())) {
            file = new File(a1.getString());
        } else if ((a1.isCompound()) && ":".equals(a1.getString()) && 2 == a1.arity()) {
            Term pkg = a1.arg0(0).dref();
            Term name = a1.arg0(1).dref();
            if (!(pkg.isAtom()) || !(name.isAtom())) {
                throw new IllegalDomainException(thiz, 1, "source_sink", a1);
            }
            resourceName = '/' + pkg.getString().replace('.', '/') + '/' + name.getString();
        } else {
            throw new IllegalDomainException(thiz, 1, "source_sink", a1);
        }
        // io_mode
        a2 = a2.dref();
        if ((a2.isVar()))
            throw new PInstantiationException(thiz, 2);
        if (!(a2.isAtom()))
            throw new IllegalTypeException(thiz, 2, "atom", a2);
        if (resourceName != null && !a2.equalsTerm(SYM_READ)) { // writing to
                                                                // resources is
                                                                // prohibited
            throw new PermissionException(thiz, "open", "source_sink", a1, "");
        }
        Map<Functor, Term> options = processOptions(a4.dref());
        Charset charset = Charset.defaultCharset();
        if (options.containsKey(SYM_CHARSET)) {
            Term charsetOption = options.get(SYM_CHARSET);
            if (charsetOption.arity() != 1 || !(charsetOption.arg0(0).isAtom())) {
                throw new IllegalDomainException(thiz, 4, "stream_option", charsetOption);
            }
            String charsetName = charsetOption.arg0(0).dref().getString();
            charset = Charset.forName(charsetName);
        }
        try {
            if (a2.equalsTerm(SYM_READ)) {
                InputStream inputStream = null;
                if (resourceName != null) {
                    inputStream = bootpreds.class.getResourceAsStream(resourceName);
                } else if (file.exists()) {
                    inputStream = new FileInputStream(file);
                }
                if (inputStream == null) {
                    throw new ExistenceException(thiz, 1, "source_sink", a1, "");
                }
                PushbackReader in = new LineNumberPushbackReader(
                        new BufferedReader(new InputStreamReader(inputStream, charset)), Prolog.PUSHBACK_SIZE);
                streamObject = TermData.FFIObject(in);
                opts = CONS(SYM_INPUT, opts);
            } else if (a2.equalsTerm(SYM_WRITE)) {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                PrintWriter out = new PrintWriter(
                        new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, false), charset)));
                streamObject = TermData.FFIObject(out);
                opts = CONS(SYM_OUTPUT, opts);
            } else if (a2.equalsTerm(SYM_APPEND)) {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                PrintWriter out = new PrintWriter(
                        new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), charset)));
                streamObject = TermData.FFIObject(out);
                opts = CONS(SYM_OUTPUT, opts);
            } else {
                throw new IllegalDomainException(thiz, 2, "io_mode", a2);
            }
        } catch (IOException e) {
            throw new PermissionException(thiz, "open", "source_sink", a1, "");
        }
        if (engine.getStreamManager().containsKey(streamObject))
            throw new InternalException("stream object is duplicated");
        // stream_options
        if (options.containsKey(SYM_ALIAS_1)) {
            Term aliasOption = options.get(SYM_ALIAS_1);
            if (aliasOption.arity() != 1 || !(aliasOption.arg0(0).isAtom())) {
                throw new IllegalDomainException(thiz, 4, "stream_option", aliasOption);
            }
            alias = aliasOption.arg0(0).dref();
            if (engine.getStreamManager().containsKey(alias))
                throw new PermissionException(thiz, "open", "source_sink", aliasOption, "");
        }
        opts = CONS(C(SYM_TYPE_1, SYM_TEXT), opts);
        opts = CONS(C(SYM_MODE_1, a2), opts);
        opts = CONS(C(SYM_FILE_NAME_1, file == null ? a1 : TermData.createAtomic(file.getAbsolutePath())), opts);
        if (alias != null) {
            engine.getStreamManager().put(alias, streamObject);
            opts = CONS(C(SYM_ALIAS_1, alias), opts);
        }
        a3.asVariableTerm().bind(streamObject, engine.trail);
        engine.getStreamManager().put(streamObject, opts);
        if (options.containsKey(SYM_AUTOCLOSE)) {
            Term autoCloseOption = options.get(SYM_AUTOCLOSE);
            if (autoCloseOption.arity() != 1 || !(autoCloseOption.arg0(0).isAtom())) {
                throw new IllegalDomainException(thiz, 4, "stream_option", autoCloseOption);
            }
            if ("true".equals(autoCloseOption.arg0(0).getString())) {
                engine.trail.push(new CloseHelper(engine, streamObject, alias));
            }
        }
        return cont;
    }

    // @SuppressWarnings("unused")
    static Map<Functor, Term> processOptions(Term options) {
        Operation thiz = Prolog.M.pred;
        Map<Functor, Term> result = new HashMap<Functor, Term>();
        Term p = options;
        while (!p.isNil()) {
            // type check
            if ((p.isVar()))
                throw new PInstantiationException(thiz, 4);
            if (!(p.isCons()))
                throw new IllegalTypeException(thiz, 4, "list", options);
            Term option = (p).car().dref();
            if ((option.isVar()))
                throw new PInstantiationException(thiz, 4);
            if ((option.isCompound())) {
                Functor functor = (option).functor().asSymbolTerm();
                result.put(functor, option);
            } else {
                throw new IllegalDomainException(thiz, 4, "stream_option", option);
            }
            p = (p).cdr().dref();
        }
        return result;
    }

    private static class CloseHelper implements Undoable {
        private final Prolog engine;
        private final JavaObjectTerm streamObject;
        private final Term alias;

        public CloseHelper(Prolog engine, JavaObjectTerm streamObject, Term alias) {
            this.engine = engine;
            this.streamObject = streamObject;
            this.alias = alias;
        }

        @Override
        public void undo() {
            this.engine.getStreamManager().remove(this.streamObject);
            if (this.alias != null) {
                this.engine.getStreamManager().remove(this.alias);
            }
            Closeable closeable = (Closeable) this.streamObject.object();
            try {
                closeable.close();
            } catch (IOException e) {
                throw new JavaException(e);
            }
        }
    }

    // jio.*;
    /**
     * <code>peek_byte/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     * @since 1.1
     */
    // _peek_byte_2 extends Predicate.P2 {

    public static Operation PRED_peek_byte_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        // InByte
        a2 = a2.dref();
        if (!(a2.isVar())) {
            if (!(a2.isInteger()))
                throw new IllegalTypeException(thiz, 2, "in_byte", a2);
            int n = (a2).intValue();
            if (n != -1 && (n < 0 || n > 255))
                throw new RepresentationException(thiz, 2, "in_byte");
        }
        // S_or_a
        PushbackReader stream = toPBReader(engine, thiz, a1);
        // read single byte
        try {
            int c = stream.read();
            if (c < 0) { // EOF
                if (!a2.unify(INT_EOF, engine.trail))
                    return engine.fail();
                return cont;
            }
            if (c > 255)
                throw new RepresentationException(thiz, 0, "byte");
            stream.unread(c);
            if (!a2.unifyInt((c), engine.trail))
                return engine.fail();
            return cont;
        } catch (IOException e) {
            throw new TermException(TermData.FFIObject(e));
        }
    }

    // jio.*;
    /**
     * <code>peek_char/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _peek_char_2 extends Predicate.P2 {
    private static final Functor SYM_EOF = SYM("end_of_file");

    public static Operation PRED_peek_char_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        // Char
        a2 = a2.dref();
        if (!(a2.isVar()) && !inCharacter(a2))
            throw new IllegalTypeException(thiz, 2, "in_character", a2);
        // S_or_a
        PushbackReader stream = toPBReader(engine, thiz, a1);
        // read single character
        try {
            int c = stream.read();
            if (c < 0) { // EOF
                if (!a2.unify(SYM_EOF, engine.trail))
                    return engine.fail();
                return cont;
            }
            if (!Character.isDefined(c))
                throw new RepresentationException(thiz, 0, "character");
            stream.unread(c);
            if (!a2.unify(TermData.CHAR((char) c), engine.trail))
                return engine.fail();
            return cont;
        } catch (IOException e) {
            throw new TermException(TermData.FFIObject(e));
        }
    }

    // jio.*;
    /**
     * <code>peek_code/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _peek_code_2 extends Predicate.P2 {
    private static final NumberTerm INT_EOF = Integer(-1);

    public static Operation PRED_peek_code_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        // Char
        a2 = a2.dref();
        if (!(a2.isVar())) {
            if (!(a2.isInteger()))
                throw new IllegalTypeException(thiz, 2, "integer", a2);
            int n = (a2).intValue();
            if (n != -1 && !Character.isDefined(n))
                throw new RepresentationException(thiz, 2, "in_character_code");
        }
        // S_or_a
        PushbackReader stream = toPBReader(engine, thiz, a1);
        // read single character
        try {
            int c = stream.read();
            if (c < 0) { // EOF
                if (!a2.unify(INT_EOF, engine.trail))
                    return engine.fail();
                return cont;
            }
            if (!Character.isDefined(c))
                throw new RepresentationException(thiz, 0, "character");
            stream.unread(c);
            if (!a2.unifyInt((c), engine.trail))
                return engine.fail();
            return cont;
        } catch (IOException e) {
            throw new TermException(TermData.FFIObject(e));
        }
    }

    /**
     * <code>'$print_stack_trace'/1</code>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$print_stack_trace_1 extends Predicate.P1 {
    public static Operation PRED_$print_stack_trace_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        a1 = a1.dref();
        if ((a1.isVar()))
            throw new PInstantiationException(thiz, 1);
        if (!(a1.isJavaObject()))
            throw new IllegalTypeException(thiz, 1, "java", a1);
        Object obj = a1.object();
        if (obj instanceof InterruptedException)
            throw new JavaInterruptedException((InterruptedException) obj);
        if (engine.getPrintStackTrace().equals("on"))
            engine.control.printStackTrace((Throwable) obj);
        return cont;
    }

    // jio.*;
    /**
     * <code>put_byte/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     * @since 1.1
     */
    // _put_byte_2 extends Predicate.P2 {
    public static Operation PRED_put_byte_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a2;
        a2 = LARG[1];
        int c;
        // Byte
        a2 = a2.dref();
        if ((a2.isVar()))
            throw new PInstantiationException(thiz, 2);
        if (!(a2.isInteger()))
            throw new IllegalTypeException(thiz, 2, "byte", a2);
        c = (a2).intValue();
        if (c < 0 || c > 255)
            throw new IllegalTypeException(thiz, 2, "byte", a2);
        // S_or_a
        PrintWriter stream = toPrintWriter(engine, thiz, LARG[0]);
        // print single byte
        stream.print((char) c);
        return cont;
    }

    // jio.*;
    /**
     * <code>put_char/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _put_char_2 extends Predicate.P2 {
    public static Operation PRED_put_char_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a2;
        a2 = LARG[1];
        String str;
        char c;
        // Char
        a2 = a2.dref();
        if ((a2.isVar()))
            throw new PInstantiationException(thiz, 2);
        if (!(a2.isAtom()))
            throw new IllegalTypeException(thiz, 2, "character", a2);
        // S_or_a
        PrintWriter stream = toPrintWriter(engine, thiz, LARG[0]);
        // print single character
        str = (a2).getString();
        if (str.length() != 1)
            throw new IllegalTypeException(thiz, 2, "character", a2);
        c = str.charAt(0);
        if (!Character.isDefined(c))
            throw new RepresentationException(thiz, 2, "character");
        stream.print(c);
        return cont;
    }

    // jio.*;
    /**
     * <code>put_code/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // extends Predicate.P2 {
    public static Operation PRED_put_code_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a2;
        a2 = LARG[1];
        int c;
        // Char
        a2 = a2.dref();
        if ((a2.isVar()))
            throw new PInstantiationException(thiz, 2);
        if (!(a2.isInteger()))
            throw new IllegalTypeException(thiz, 2, "integer", a2);
        // S_or_a
        PrintWriter stream = toPrintWriter(engine, thiz, LARG[0]);
        // print single character
        c = (a2).intValue();
        if (!Character.isDefined(c))
            throw new RepresentationException(thiz, 2, "character");
        stream.print((char) c);
        return cont;
    }

    /**
     * <code>raise_exception/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _raise_exception_1 extends Predicate.P1 {
    public static Operation PRED_raise_exception_1_static_exec(Prolog engine) {
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        a1 = a1.dref();
        if ((a1.isVar()))
            throw new PInstantiationException(thiz, 1);
        throw new TermException(a1);
    }

    public static Operation PRED_throw_1_static_exec(Prolog engine) {
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        a1 = a1.dref();
        if ((a1.isVar()))
            throw new PInstantiationException(thiz, 1);
        throw new TermException(a1);
    }

    /**
     * PREDICATE: $unify/2 from:
     * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtins.pl
     */

    public static Operation PRED_$unify_2_static_exec_builtins(Prolog m) {
        Operation cont = m.cont;
        Term[] LARG = m.AREGS;
        // '$unify'(A,B):-'$unify'(A,B)
        m.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        // '$unify'(A,B):-['$unify'(A,B)]
        // START inline expansion of $unify(a(1),a(2))
        if (!a1.unify(a2, m.trail)) {
            return m.fail();
        }
        // END inline expansion
        return cont;
    }

    // jio.*;
    /**
     * <code>read_line/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _read_line_2 extends Predicate.P2 {
    public static Operation PRED_read_line_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        String line;
        char[] chars;
        Term t;
        // S_or_a
        PushbackReader stream = toPBReader(engine, thiz, a1);
        // read line
        try {
            PushbackReader pbr = stream;
            cleanPendingNewlines(pbr);
            line = (new BufferedReader(pbr)).readLine();
            if (line == null) { // end_of_stream
                if (!a2.unifyInt((-1), engine.trail))
                    return engine.fail();
                return cont;
            }
            chars = line.toCharArray();
            t = Prolog.Nil;
            for (int i = chars.length; i > 0; i--) {
                if (!Character.isDefined((int) chars[i - 1]))
                    throw new RepresentationException(thiz, 0, "character");
                t = CONS(Integer(chars[i - 1]), t);
            }
            if (!a2.unify(t, engine.trail))
                return engine.fail();
            return cont;
        } catch (IOException e) {
            throw new TermException(TermData.FFIObject(e));
        }
    }

    static void cleanPendingNewlines(PushbackReader pbr) throws IOException {
        while (pbr.ready()) {
            int curr = (char) pbr.read();
            if (curr != 13 && curr != 10 && curr != 0) {
                pbr.unread(1);
                return;
            }
        }
    }

    // jio.*;
    /**
     * <code>'$read_token0'/3</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     * @since 0.7
     */
    // _$read_token0_3 extends Predicate.P3 {

    /*
     * The a1 must be user, user_input, and java.io.PushbackReader, otherwise fails.
     */
    public static Operation PRED_$read_token0_3_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        StringBuilder s;
        int type;
        Term token;
        // S_or_a
        PushbackReader stream = toPBReader(engine, thiz, a1);
        // read token
        s = new StringBuilder();
        try {
            type = Token.read_token(s, stream);
            final String string = s.toString();
            switch (type) {
                case Token.TOKEN_INTEGER:
                    token = Integer(Integer.parseInt(string));
                    break;
                case Token.TOKEN_CHAR:
                    token = Integer(string.charAt(string.length() - 1));
                    break;
                case Token.TOKEN_LONG:
                    token = Long(string);
                    break;
                case Token.TOKEN_DOUBLE:
                    token = Float(Double.parseDouble(string));
                    break;
                case 'S':
                    token = DoubleQuotes(string);
                    break;
                default:
                    token = createAtomic(string);
                    break;
            }
        } catch (Exception e) {
            throw new JavaException(thiz, 1, e);
        }
        if (!a2.unifyInt((type), engine.trail))
            return engine.fail();
        if (!a3.unify(token, engine.trail))
            return engine.fail();
        return cont;
    }

    // jutil.regex.Pattern;
    /**
     * <code>regex_compile/2</code><br>
     *
     * <pre>
     *   'regex_compile'(+regex string, -Pattern object)
     * </pre>
     */
    // _regex_compile_2 extends Predicate.P2 {
    public static Operation PRED_regex_compile_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1 = LARG[0].dref();
        Term a2 = LARG[1].dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        }
        if (!(a1.isAtom())) {
            throw new IllegalTypeException(thiz, 1, "atom", a1);
        }
        Pattern pattern = Pattern.compile(a1.getString(), Pattern.MULTILINE);
        if (!a2.unify(TermData.FFIObject(pattern), engine.trail)) {
            return engine.fail();
        }
        return cont;
    }

    // jutil.regex.Matcher;
    // jutil.regex.Pattern;
    /**
     * <code>regex_match/3</code><br>
     * <p>
     *
     * <pre>
     *   'regex_match'(+Pattern object, +Chars, -Matches)
     * </pre>
     */
    // _regex_match_3 extends Predicate.P3 {
    public static Operation PRED_regex_match_3_static_exec(Prolog engine) {
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1 = LARG[0].dref();
        Term a2 = LARG[1].dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        }
        Pattern pattern = (Pattern) a1.object();
        if ((a2.isVar())) {
            throw new PInstantiationException(thiz, 1);
        }
        if (!(a2.isAtom())) {
            throw new IllegalTypeException(thiz, 1, "atom", a2);
        }
        Matcher matcher = pattern.matcher(a2.getString());
        if (!matcher.find()) {
            return engine.fail();
        }
        engine.AREGS[0] = TermData.FFIObject(matcher);
        engine.AREGS[1] = LARG[2];
        return engine.jtry2(bootpreds::regex_check, bootpreds::regex_next);
    }

    private static Operation regex_check(Prolog engine) {
        Term a1 = engine.AREGS[0];
        Term result = engine.AREGS[1];
        Matcher matcher = (Matcher) a1.object();
        Term matches = getMatches(matcher);
        if (matches == Prolog.Nil || !result.unify(matches, engine.trail)) {
            return engine.fail();
        }
        return engine.cont;
    }

    private static Operation regex_next(Prolog engine) {
        return engine.trust(bootpreds::regex_empty);
    }

    private static Operation regex_empty(Prolog engine) {
        Term a1 = engine.AREGS[0];
        Matcher matcher = (Matcher) a1.object();
        if (!matcher.find()) {
            return engine.fail();
        }
        return engine.jtry2(bootpreds::regex_check, bootpreds::regex_next);
    }

    private static Term getMatches(Matcher matcher) {
        Term list = Prolog.Nil;
        for (int i = matcher.groupCount(); i >= 0; i--) {
            Term match = TermData.createAtomic(matcher.group(i));
            list = CONS(match, list);
        }
        return list;
    }

    // _reverse_2 extends Predicate.P2 {
    public static Operation PRED_reverse_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1 = LARG[0].dref();
        Term a2 = LARG[1].dref();
        if (a1.isCons() || a1.isNil()) {
            Term r = Prolog.Nil;
            while (a1.isCons()) {
                r = CONS(a1.car(), r);
                a1 = (a1).cdr();
            }
            if (a1.isNil() && a2.unify(r, engine.trail)) {
                return cont;
            }
        }
        return engine.fail();
    }

    /**
     * <code>'$set_exception'/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$set_exception_1 extends Predicate.P1 {
    public static Operation PRED_$set_exception_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        a1 = a1.dref();
        engine.setException(a1);
        return cont;
    }

    // jio.PushbackReader;
    /**
     * <code>set_input/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _set_input_1 extends Predicate.P1 {
    public static Operation PRED_set_input_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1;
        a1 = LARG[0];
        PushbackReader stream = toPBReader(engine, thiz, a1);
        engine.setCurrentInput(stream);
        return cont;
    }

    // jio.PrintWriter;
    /**
     * <code>set_output/1</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _set_output_1 extends Predicate.P1 {
    public static Operation PRED_set_output_1_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Operation thiz = engine.pred;
        engine.setB0();
        // S_or_a
        PrintWriter stream = toPrintWriter(engine, thiz, engine.AREGS[0]);
        engine.setCurrentOutput(stream);
        return cont;
    }

    /**
     * <code>'$set_prolog_impl_flag'/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$set_prolog_impl_flag_2 extends Predicate.P2 {
    private static final Functor CHAR_CONVERSION = SYM("char_conversion");
    private static final Functor DEBUG = SYM("debug");
    private static final Functor UNKNOWN = SYM("unknown");
    private static final Functor DOUBLE_QUOTES = SYM("double_quotes");
    private static final Functor PRINT_STACK_TRACE = SYM("print_stack_trace");

    public static Operation PRED_$set_prolog_impl_flag_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        a1 = a1.dref();
        a2 = a2.dref();
        if (a1.equalsTerm(CHAR_CONVERSION)) {
            if (!(a2.isAtom()))
                return engine.fail();
            engine.setCharConversion((a2).getString());
        } else if (a1.equalsTerm(DEBUG)) {
            if (!(a2.isAtom()))
                return engine.fail();
            engine.setDebug((a2).getString());
        } else if (a1.equalsTerm(UNKNOWN)) {
            if (!(a2.isAtom()))
                return engine.fail();
            engine.setUnknown((a2).getString());
        } else if (a1.equalsTerm(DOUBLE_QUOTES)) {
            if (!(a2.isAtom()))
                return engine.fail();
            engine.setDoubleQuotes((a2).getString());
        } else if (a1.equalsTerm(PRINT_STACK_TRACE)) {
            if (!(a2.isAtom()))
                return engine.fail();
            engine.setPrintStackTrace((a2).getString());
        } else {
            return engine.fail();
        }
        return cont;
    }

    // jio.*;
    /**
     * <code>skip/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _skip_2 extends Predicate.P2 {

    public static Operation PRED_skip_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        int n;
        // Char
        a2 = a2.dref();
        if ((a2.isVar()))
            throw new PInstantiationException(thiz, 2);
        if (!(a2.isInteger())) {
            try {
                a2 = Arithmetic.evaluate(a2);
            } catch (BuiltinException e) {
                e.goal = thiz;
                e.argNo = 2;
                throw e;
            }
        }
        n = a2.asNumberTerm().intValue();
        if (!Character.isDefined(n))
            throw new RepresentationException(thiz, 2, "character_code");
        // S_or_a
        PushbackReader stream = toPBReader(engine, thiz, a1);
        // skip
        try {
            PushbackReader in = stream;
            int c = in.read();
            while (c != n) {
                c = in.read();
                if (c == -1) // EOF
                    return cont;
                if (!Character.isDefined(c))
                    throw new RepresentationException(thiz, 0, "character");
            }
            return cont;
        } catch (IOException e) {
            throw new TermException(TermData.FFIObject(e));
        }
    }

    // jutil.Arrays;
    /**
     * <code>sort/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _sort_2 extends Predicate.P2 {
    public static Operation PRED_sort_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        int len;
        Term tmp;// , tmp2;
        Term[] list;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if (a1.equalsTerm(Prolog.Nil)) {
            if (!a2.unify(Prolog.Nil, engine.trail))
                return engine.fail();
            return cont;
        } else if (!(a1.isCons())) {
            throw new IllegalTypeException(thiz, 1, "list", a1);
        }
        len = (a1).length();
        list = new Term[len];
        tmp = a1;
        for (int i = 0; i < len; i++) {
            if (!(tmp.isCons()))
                throw new IllegalTypeException(thiz, 1, "list", a1);
            list[i] = (tmp).car().dref();
            tmp = (tmp).cdr().dref();
        }
        if (!tmp.equalsTerm(Prolog.Nil))
            throw new PInstantiationException(thiz, 1);
        try {
            Arrays.sort(list);
        } catch (ClassCastException e) {
            throw new JavaException(thiz, 1, e);
        }
        tmp = Prolog.Nil;
        Object tmp2 = null;
        for (int i = list.length - 1; i >= 0; i--) {
            if (!list[i].equals(tmp2))
                tmp = CONS(list[i], tmp);
            tmp2 = list[i];
        }
        if (!a2.unify(tmp, engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>'$statistics'/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$statistics_2 extends Predicate.P2 {
    private static final Term Nil = Prolog.Nil;
    private static final Functor SYM_RUNTIME = SYM("runtime");
    private static final Functor SYM_TRAIL = SYM("trail");
    private static final Functor SYM_CHOICE = SYM("choice");

    public static Operation PRED_$statistics_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        Term result = null;
        a1 = a1.dref();
        if ((a1.isVar())) {
            throw new PInstantiationException(thiz, 1);
        } else if (!(a1.isAtom())) {
            throw new IllegalTypeException(thiz, 1, "atom", a1);
        } else if (a1.equalsTerm(SYM_RUNTIME)) {
            engine.requireFeature(Prolog.Feature.STATISTICS_RUNTIME, thiz, a1);
            long val1, val2;
            Term start, previous;
            val1 = System.currentTimeMillis() - engine.getStartRuntime();
            val2 = val1 - engine.getPreviousRuntime();
            engine.setPreviousRuntime(val1);
            start = Integer((int) val1);
            previous = Integer((int) val2);
            result = CONS(start, CONS(previous, Nil));
        } else if (a1.equalsTerm(SYM_TRAIL)) {
            int top, max;
            Term free, used;
            top = engine.trail.top();
            max = engine.trail.max();
            used = Integer(top);
            free = Integer(max - top);
            result = CONS(used, CONS(free, Nil));
        } else if (a1.equalsTerm(SYM_CHOICE)) {
            int top, max;
            Term free, used;
            top = engine.stack.top();
            max = engine.stack.max();
            used = Integer(top);
            free = Integer(max - top);
            result = CONS(used, CONS(free, Nil));
        } else {
            return engine.fail();
        }
        if (!a2.unify(result, engine.trail))
            return engine.fail();
        return cont;
    }

    // jio.*;
    /**
     * <code>tab/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _tab_2 extends Predicate.P2 {
    public static Operation PRED_tab_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a2;
        a2 = LARG[1];
        int n;
        // String s = "";
        // Char
        a2 = a2.dref();
        if ((a2.isVar()))
            throw new PInstantiationException(thiz, 2);
        if (!(a2.isInteger())) {
            try {
                a2 = Arithmetic.evaluate(a2);
            } catch (BuiltinException e) {
                e.goal = thiz;
                e.argNo = 2;
                throw e;
            }
        }
        n = a2.asNumberTerm().intValue();
        // S_or_a
        PrintWriter stream = toPrintWriter(engine, thiz, engine.AREGS[0]);
        // tab
        for (int i = 0; i < n; i++) {
            // s.append(" ");
            stream.print(" ");
        }
        return cont;
    }

    /**
     * <code>'$term_hash'/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.1
     */
    // _$term_hash_2 extends Predicate.P2 {
    public static Operation PRED_$term_hash_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        a1 = a1.dref();
        if (!a2.unifyInt((a1.termHashCode()), engine.trail))
            return engine.fail();
        return cont;
    }

    /**
     * <code>'$univ'/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // extends Predicate.P2 {
    public static Operation PRED_$univ_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
        a1 = a1.dref();
        if ((a1.isAtom()) || (a1.isNumber()) || (a1.isJavaObject()) || (a1.isClosure())) {
            if (!a2.unifyS(Prolog.FUNCTOR_DOT_2, engine.trail, a1, Nil))
                return engine.fail();
        } else if ((a1.isCons())) {
            Term t = CONS(a1.cdr(), Nil);
            t = CONS(a1.car(), t);
            t = CONS(SYM_DOT_0, t);
            if (!a2.unify(t, engine.trail))
                return engine.fail();
        } else if ((a1.isCompound())) {
            Term sym = a1.functor();
            Term[] args = a1.args();
            Term t = Nil;
            for (int i = args.length; i > 0; i--)
                t = CONS(args[i - 1], t);
            if (!a2.unifyS(Prolog.FUNCTOR_DOT_2, engine.trail, sym, t))
                return engine.fail();
        } else if ((a1.isVar())) {
            a2 = a2.dref();
            if ((a2.isVar()))
                throw new PInstantiationException(thiz, 2);
            else if (a2.isNil())
                throw new IllegalDomainException(thiz, 2, "non_empty_list", a2);
            else if (!(a2.isCons()))
                throw new IllegalTypeException(thiz, 2, "list", a2);
            Term head = (a2).car().dref();
            Term tail = (a2).cdr().dref();
            if ((head.isVar()))
                throw new PInstantiationException(thiz, 2);
            if (tail.isNil()) {
                if ((head.isAtom()) || (head.isNumber()) || (head.isJavaObject()) || (head.isClosure())) {
                    if (!a1.unify(head, engine.trail))
                        return engine.fail();
                    return cont;
                } else {
                    throw new IllegalTypeException(thiz, 2, "atomic", head);
                }
            }
            if (!(head.isAtom()))
                throw new IllegalTypeException(thiz, 2, "atom", head);
            Term x = tail;
            while (!x.isNil()) {
                if ((x.isVar()))
                    throw new PInstantiationException(thiz, 2);
                if (!(x.isCons()))
                    throw new IllegalTypeException(thiz, 2, "list", a2);
                x = (x).cdr().dref();
            }
            int n = (a2).length() - 1;
            Functor sym = TermData.createF((head).getString(), n);
            Term[] args = new Term[n];
            for (int i = 0; i < n; i++) {
                args[i] = (tail).car().dref();
                tail = (tail).cdr().dref();
            }
            Term t = null;
            if (SYM_DOT_0.equalsTerm(head)) {
                if (n != 2) {
                    throw new IllegalDomainException(thiz, 2, "['.',head,tail]", a2);
                }
                t = CONS(args[0], args[1]);
            } else {
                t = C(sym, args);
            }
            if (!a1.unify(t, engine.trail))
                return engine.fail();
        } else {
            return engine.fail();
        }
        return cont;
    }

    // .Predicate.P2;
    // jio.File;
    // jio.FileInputStream;
    // jio.FileOutputStream;
    // jio.IOException;
    // jutil.Properties;
    /**
     * <p>
     * write_domain_definitions(+OutputDir,+DomainDefinitionsList)
     * <p>
     * Writes domain definitions into properties file in the folder corresponding to
     * package.
     * <p>
     * Arguments are:
     * <UL>
     * <LI>OutputDir - the base directory for output. It will be used as prefix for
     * package directory</LI>
     * <LI>DomainDefinitionsList - the list of domain definitions. Each item is
     * expected to be complex StructureTerm: packageName:domainName =
     * (aaa;bbb*;ccc(ddd,eee))</LI>
     * </UL>
     * <p>
     * All items must reference the same package.
     * <p>
     * If the properties file already exist, its content will be merged with given
     * domain definitions. The existing domain definition will be overwritten by new
     * one.
     * <p>
     * The predicate is thread safe. Concurrent threads will write definitions
     * sequentially, one by one, merging the domain definitions, written earlier.
     * The execution order for competing threads is not defined.
     *
     * @author semenov
     *
     */
    // _write_domain_definitions_2 extends P2 {
    public static Operation PRED_write_domain_definitions_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        Term a1 = LARG[0].dref();
        Term a2 = LARG[1].dref();
        // input check
        // a1 is output directory
        if (!(a1.isAtom())) {
            throw new IllegalTypeException(thiz, 1, "atom", a1);
        }
        // a2 is a list of domain definitions in form package:name =
        // (aaa;bbb*;ccc(ddd,eee))
        if (!a2.isNil() && !(a2.isCons())) {
            throw new IllegalTypeException(thiz, 2, "list", a2);
        }
        // process domain definitions
        String packageName = null;
        Properties p = new Properties();
        Term lt = a2;
        while (!lt.isNil()) {
            Term t = (lt).car();
            lt = (lt).cdr();
            if (!(t.isCompound()) || !"=".equals(t.getString()) || t.arity() != 2) {
                throw new IllegalDomainException(thiz, 2, "package:name = (aaa;bbb*;ccc(ddd,eee))", t);
            }
            Term packageAndName = t.arg0(0);
            if (!(packageAndName.isCompound()) || !":".equals(packageAndName.getString())
                    || packageAndName.arity() != 2) {
                throw new IllegalDomainException(thiz, 2, "package:name = (aaa;bbb*;ccc(ddd,eee))", t);
            }
            Term packageTerm = packageAndName.arg0(0);
            if (packageName == null) {
                packageName = packageTerm.getString();
            } else if (!packageName.equals(packageTerm.getString())) {
                throw new IllegalDomainException(thiz, 2, "same package in every list item", a2);
            }
            Term name = packageAndName.arg0(1);
            Term definition = t.arg0(1);
            StringBuilder sb = new StringBuilder();
            Term d = definition;
            while (";".equals(d.getString())) {
                sb.append(d.arg0(0).getString()).append(';');
                d = d.arg0(1);
            }
            sb.append(d.getString());
            p.put(name.getString(), sb.toString());
        }
        if (packageName != null && !p.isEmpty()) {
            writeDomainDefinitions(a1.getString(), packageName, p);
        }
        return cont;
    }

    /**
     * Writes given domain definition as properties file for given package and
     * destination folder. The method is static and synchronized to allow writing
     * from different threads. Writing from different processes will lead to
     * unpredicted results.
     *
     * @param folder
     * @param packageName
     * @param domains
     */
    private static synchronized void writeDomainDefinitions(String folder, String packageName, Properties domains) {
        if (folder == null || "".equals(folder)) {
            folder = ".";
        }
        File dir = new File(folder, packageName.replace('.', File.separatorChar));
        File file = new File(dir, "domain.properties");
        Properties p = new Properties();
        if (file.exists()) {
            // read the file first
            FileInputStream in = null;
            try {
                in = new FileInputStream(file);
                p.load(in);
            } catch (IOException e) {
                throw new JavaException(e);
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        // ignore since we can do nothing about it
                    }
                }
            }
        }
        p.putAll(domains);
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file);
            p.store(out, "");
        } catch (IOException e) {
            throw new JavaException(e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // ignore since we can do nothing about it
                }
            }
        }
    }

    /**
     * <code>'$write_toString'/2</code><br>
     *
     * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
     * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
     * @version 1.0
     */
    // _$write_toString_2 extends Predicate.P2 {
    public static Operation PRED_$write_toString_2_static_exec(Prolog engine) {
        Operation cont = engine.cont;
        Term[] LARG = engine.AREGS;
        Operation thiz = engine.pred;
        engine.setB0();
        Term a2;
        a2 = LARG[1];
        // S_or_a
        PrintWriter stream = toPrintWriter(engine, thiz, engine.AREGS[0]);
        a2 = a2.dref();
        if (!(a2.isJavaObject()))
            throw new IllegalTypeException(thiz, 2, "java", a2);
        // print java
        stream.print((a2).object().toString());
        return cont;
    }

    public static void loadFile() {
        // PredTable.register("assert",2,PRED_assert_2(null,null,null));
        // PredTable.register("asserta",2,PRED_asserta_2(null,null,null));
        // PredTable.register("assertz",2,PRED_assertz_2(null,null,null));
        // PredTable.register("erase",1,PRED_erase(null,null));
        // PredTable.register("db_assert",2,PRED_db_assert_2(null,null,null));
        // PredTable.register("db_asserta",2,PRED_db_asserta_2(null,null,null));
        // PredTable.register("db_assertz",2,PRED_db_assertz_2(null,null,null));
        // PredTable.register("db_retract",2,PRED_db_retract_2(null,null,null));
        // PredTable.register("db_retractall",2,PRED_db_retractall_2(null,null,null));
        // PredTable.register("db_save","save",2,PRED_db_save_2(null,null,null));
        PredTable.registerBuiltin("$atom_type0", 2, bootpreds::PRED_$atom_type0_2_static_exec);
        PredTable.registerBuiltin("$begin_exception", 1, PRED_$begin_exception_1::static_exec);
        PredTable.registerBuiltin("$begin_sync", 2, PRED_$begin_sync_2::static_exec);
        PredTable.registerBuiltin("$call", 2, bootpreds::PRED_$call_2_static_exec);
        PredTable.registerBuiltin("$call_closure", 1, bootpreds::PRED_$call_closure_1_static_exec);
        PredTable.registerBuiltin("$cut", 1, bootpreds::PRED_$cut_1_static_exec);
        PredTable.registerBuiltin("$end_exception", 1, bootpreds::PRED_$end_exception_1_static_exec);
        PredTable.registerBuiltin("$end_sync", 1, bootpreds::PRED_$end_sync_1_static_exec);
        PredTable.registerBuiltin("$erase", 1, bootpreds::PRED_$erase_1_static_exec);
        PredTable.registerBuiltin("$fast_write", 1, bootpreds::PRED_$fast_write_1_static_exec);
        PredTable.registerBuiltin("$fast_write", 2, bootpreds::PRED_$fast_write_2_static_exec);
        PredTable.registerBuiltin("$fast_writeq", 1, bootpreds::PRED_$fast_writeq_1_static_exec);
        PredTable.registerBuiltin("$fast_writeq", 2, bootpreds::PRED_$fast_writeq_2_static_exec);
        PredTable.registerBuiltin("$get_current_B", 1, bootpreds::PRED_$get_current_B_1_static_exec);
        PredTable.registerBuiltin("$get_exception", 1, bootpreds::PRED_$get_exception_1_static_exec);
        PredTable.registerBuiltin("$get_hash_manager", 1, bootpreds::PRED_$get_hash_manager_1_static_exec);
        PredTable.registerBuiltin("$get_instances", 2, bootpreds::PRED_$get_instances_2_static_exec);
        PredTable.registerBuiltin("$get_level", 1, bootpreds::PRED_$get_level_1_static_exec);
        PredTable.registerBuiltin("$get_prolog_impl_flag", 2, bootpreds::PRED_$get_prolog_impl_flag_2_static_exec);
        PredTable.registerBuiltin("$get_stream_manager", 1, bootpreds::PRED_$get_stream_manager_1_static_exec);
        PredTable.registerBuiltin("$hash_adda", 3, bootpreds::PRED_$hash_adda_3_static_exec);
        PredTable.registerBuiltin("$hash_addz", 3, bootpreds::PRED_$hash_addz_3_static_exec);
        PredTable.registerBuiltin("$hash_remove_first", 3, bootpreds::PRED_$hash_remove_first_3_static_exec);
        PredTable.registerBuiltin("$insert", 2, bootpreds::PRED_$insert_2_static_exec);
        PredTable.registerBuiltin("$neck_cut", 0, bootpreds::PRED_$neck_cut_0_static_exec);
        PredTable.registerBuiltin("$print_stack_trace", 1, bootpreds::PRED_$print_stack_trace_1_static_exec);
        PredTable.registerBuiltin("$read_token0", 3, bootpreds::PRED_$read_token0_3_static_exec);
        PredTable.registerBuiltin("$set_exception", 1, bootpreds::PRED_$set_exception_1_static_exec);
        PredTable.registerBuiltin("$set_prolog_impl_flag", 2, bootpreds::PRED_$set_prolog_impl_flag_2_static_exec);
        PredTable.registerBuiltin("$statistics", 2, bootpreds::PRED_$statistics_2_static_exec);
        PredTable.registerBuiltin("$term_hash", 2, bootpreds::PRED_$term_hash_2_static_exec);
        PredTable.registerBuiltin("$univ", 2, bootpreds::PRED_$univ_2_static_exec);
        PredTable.registerBuiltin("$write_toString", 2, bootpreds::PRED_$write_toString_2_static_exec);
        PredTable.registerBuiltin("arg", 3, bootpreds::PRED_arg_3_static_exec);
        PredTable.registerBuiltin("atom_chars", 2, bootpreds::PRED_atom_chars_2_static_exec);
        PredTable.registerBuiltin("atom_codes", 2, bootpreds::PRED_atom_codes_2_static_exec);
        PredTable.registerBuiltin("atom_concat", 3, bootpreds::PRED_atom_concat_3_static_exec);
        PredTable.registerBuiltin("atom_length", 2, bootpreds::PRED_atom_length_2_static_exec);
        PredTable.registerBuiltin("char_code", 2, bootpreds::PRED_char_code_2_static_exec);
        PredTable.registerBuiltin("close", 2, bootpreds::PRED_close_2_static_exec);
        PredTable.registerBuiltin("current_engine", 1, bootpreds::PRED_current_engine_1_static_exec);
        PredTable.registerBuiltin("current_input", 1, bootpreds::PRED_current_input_1_static_exec);
        PredTable.registerBuiltin("current_output", 1, bootpreds::PRED_current_output_1_static_exec);
        PredTable.registerBuiltin("flush_output", 1, bootpreds::PRED_flush_output_1_static_exec);
        PredTable.registerBuiltin("functor", 3, bootpreds::PRED_functor_3_static_exec);
        PredTable.registerBuiltin("get", 2, bootpreds::PRED_get_2_static_exec);
        PredTable.registerBuiltin("get_byte", 2, bootpreds::PRED_get_byte_2_static_exec);
        PredTable.registerBuiltin("get_char", 2, bootpreds::PRED_get_char_2_static_exec);
        PredTable.registerBuiltin("get_code", 2, bootpreds::PRED_get_code_2_static_exec);
        PredTable.registerBuiltin("halt", 1, bootpreds::PRED_halt_1_static_exec);
        PredTable.registerBuiltin("hash_clear", 1, bootpreds::PRED_hash_clear_1_static_exec);
        PredTable.registerBuiltin("hash_contains_key", 2, bootpreds::PRED_hash_contains_key_2_static_exec);
        PredTable.registerBuiltin("hash_get", 3, bootpreds::PRED_hash_get_3_static_exec);
        PredTable.registerBuiltin("hash_is_empty", 1, bootpreds::PRED_hash_is_empty_1_static_exec);
        PredTable.registerBuiltin("hash_keys", 2, bootpreds::PRED_hash_keys_2_static_exec);
        PredTable.registerBuiltin("hash_put", 3, bootpreds::PRED_hash_put_3_static_exec);
        PredTable.registerBuiltin("hash_remove", 2, bootpreds::PRED_hash_remove_2_static_exec);
        PredTable.registerBuiltin("hash_size", 2, bootpreds::PRED_hash_size_2_static_exec);
        PredTable.registerBuiltin("java_constructor0", 2, bootpreds::PRED_java_constructor0_2_static_exec);
        PredTable.registerBuiltin("java_conversion", 2, bootpreds::PRED_java_conversion_2_static_exec);
        PredTable
                .registerBuiltin("java_declared_constructor0", 2, bootpreds::PRED_java_declared_constructor0_2_static_exec);
        PredTable.registerBuiltin("java_declared_method0", 3, bootpreds::PRED_java_declared_method0_3_static_exec);
        PredTable
                .registerBuiltin("java_get_declared_field0", 3, bootpreds::PRED_java_get_declared_field0_3_static_exec);
        PredTable.registerBuiltin("java_get_field0", 3, bootpreds::PRED_java_get_field0_3_static_exec);
        PredTable.registerBuiltin("java_method0", 3, bootpreds::PRED_java_method0_3_static_exec);
        PredTable
                .registerBuiltin("java_set_declared_field0", 3, bootpreds::PRED_java_set_declared_field0_3_static_exec);
        PredTable.registerBuiltin("java_set_field0", 3, bootpreds::PRED_java_set_field0_3_static_exec);
        PredTable.registerBuiltin("keysort", 2, bootpreds::PRED_keysort_2_static_exec);
        PredTable.registerBuiltin("log", 2, bootpreds::PRED_log_2_static_exec);
        PredTable.registerBuiltin("log", 3, bootpreds::PRED_log_3_static_exec);
        PredTable.registerBuiltin("log", 4, bootpreds::PRED_log_4_static_exec);
        PredTable.registerBuiltin("log", 5, bootpreds::PRED_log_5_static_exec);
        PredTable.registerBuiltin("log", 6, bootpreds::PRED_log_6_static_exec);
        PredTable.registerBuiltin("log", 7, bootpreds::PRED_log_7_static_exec);
        PredTable.registerBuiltin("log_error", 2, bootpreds::PRED_log_error_2_static_exec);
        PredTable.registerBuiltin("log_level", 1, bootpreds::PRED_log_level_1_static_exec);
        PredTable.registerBuiltin("loggable", 1, bootpreds::PRED_loggable_1_static_exec);
        PredTable.registerBuiltin("new_hash", 2, bootpreds::PRED_new_hash_2_static_exec);
        PredTable.registerBuiltin("nl", 0, bootpreds::PRED_nl_0_static_exec_bootpred);
        PredTable.registerBuiltin("number_chars", 2, bootpreds::PRED_number_chars_2_static_exec);
        PredTable.registerBuiltin("number_codes", 2, bootpreds::PRED_number_codes_2_static_exec);
        PredTable.registerBuiltin("open", 4, bootpreds::PRED_open_4_static_exec);
        PredTable.registerBuiltin("peek_byte", 2, bootpreds::PRED_peek_byte_2_static_exec);
        PredTable.registerBuiltin("peek_char", 2, bootpreds::PRED_peek_char_2_static_exec);
        PredTable.registerBuiltin("peek_code", 2, bootpreds::PRED_peek_code_2_static_exec);
        PredTable.registerBuiltin("put_byte", 2, bootpreds::PRED_put_byte_2_static_exec);
        PredTable.registerBuiltin("put_char", 2, bootpreds::PRED_put_char_2_static_exec);
        PredTable.registerBuiltin("put_code", 2, bootpreds::PRED_put_code_2_static_exec);
        PredTable.registerBuiltin("raise_exception", 1, bootpreds::PRED_raise_exception_1_static_exec);
        PredTable.registerBuiltin("read_line", 2, bootpreds::PRED_read_line_2_static_exec);
        PredTable.registerBuiltin("regex_compile", 2, bootpreds::PRED_regex_compile_2_static_exec);
        PredTable.registerBuiltin("regex_match", 3, bootpreds::PRED_regex_match_3_static_exec);
        PredTable.registerBuiltin("set_input", 1, bootpreds::PRED_set_input_1_static_exec);
        PredTable.registerBuiltin("set_output", 1, bootpreds::PRED_set_output_1_static_exec);
        PredTable.registerBuiltin("skip", 2, bootpreds::PRED_skip_2_static_exec);
        PredTable.registerBuiltin("sort", 2, bootpreds::PRED_sort_2_static_exec);
        PredTable.registerBuiltin("tab", 2, bootpreds::PRED_tab_2_static_exec);
        PredTable
                .registerBuiltin("write_domain_definitions", 2, bootpreds::PRED_write_domain_definitions_2_static_exec);
        // PredTable.register("$current_operator", "$current_operator", 3,
        // bootpreds::PRED_$current_operator_3.class);
    }
}

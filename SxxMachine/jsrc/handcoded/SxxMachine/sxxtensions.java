package SxxMachine;

import java.util.IdentityHashMap;
import java.util.Map;

import SxxMachine.pterm.VariableTerm;

public class sxxtensions extends missing_preds {

    public static Operation PRED_$003A$002D_2_static_exec(Prolog m) {
        return PRED_nb_getval_2_static_exec(m);
    }

    static {
        PredTable.scanPreds(sxxtensions.class);
    }

    public static Operation PRED_nb_linkval_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.AREGS[0].dref();
        a2 = m.AREGS[1].dref();
        linkval(m, a1, a2);
        return m.cont;
    }

    static void linkval(Prolog m, Term a1, Term a2) {
        Map<Term, Term> saved = m.getTermBlackboard();
        saved.put(a1.functor(), a2);
    }

    static Term currentval(Prolog m, Term a1) {
        Map<Term, Term> saved = m.getTermBlackboard();
        return saved.get(a1.functor());
    }

    public static Operation PRED_b_setval_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.AREGS[0].dref();
        a2 = m.AREGS[1].dref();
        Map<Term, Term> saved = m.getTermBlackboard();
        Term was = saved.get(a1.functor());
        if (was == null)
            was = Prolog.Nil;
        VariableTerm sav = new VariableTerm();
        sav.val = was;
        sav.bind(a2, m.trail);
        linkval(m, a1, sav);
        return m.cont;
    }

    public static Operation PRED_nb_setval_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.AREGS[0].dref();
        a2 = m.AREGS[1].dref();
        linkval(m, a1, a2.copy());
        return m.cont;
    }

    public static Operation PRED_b_getval_2_static_exec(Prolog m) {
        return PRED_nb_getval_2_static_exec(m);
    }

    public static Operation PRED_nb_getval_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.AREGS[0].dref();
        a2 = m.AREGS[1].dref();
        Map<Term, Term> saved = m.getTermBlackboard();
        final Term arg0 = saved.get(a1.functor());
        if (!a2.unify(arg0, m.trail)) {
            return m.fail();
        }
        return m.cont;
    }

    public static Operation PRED_nb_current_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.AREGS[0].dref();
        a2 = m.AREGS[1].dref();
        Map<Term, Term> saved = m.getTermBlackboard();
        final Term arg0 = saved.get(a1.functor());
        if (arg0 == null || !a2.unify(arg0, m.trail)) {
            return m.fail();
        }
        return m.cont;
    }

    public Operation PRED_cputime_1_static_exec(Prolog m) {
        m.setB0();
        long t = java.lang.System.currentTimeMillis();
        if (!m.AREGS[0].unify(Long(t), m.trail))
            return m.fail();
        return m.cont;
    }

    public static boolean DoSetArg3(Prolog m, Term arg1, Term arg2, Term arg3) {
        arg1 = arg1.dref();
        arg2 = arg2.dref();
        arg3 = arg3.dref();
        if (!(arg1.isInteger()))
            return false;
        if (!(arg2.isCompound()))
            return false;
        int i = arg1.intValue();
        if (i < 1)
            return false;
        int l = arg2.arity();
        if (i > l)
            return false;
        return DoSetArg3_p2(m, i, arg2, arg3);
    }

    public static boolean DoSetArg3_p2(Prolog m, int i, Term arg2, Term arg3) {
        if (m == null) {
            arg2.setarg0(null, i - 1, arg3);
            return true;
        }
        Term x = arg2.arg0(i - 1);
        VariableTerm v = V(m);
        v.val = arg3;
        arg2.setarg0(null, i - 1, v);
        m.push(new SetArgTrail(x, v, m));
        return true;
    }

    public static Operation PRED_setarg_3_static_exec(Prolog m) {
        m.setB0();
        if (!DoSetArg3(m, m.AREGS[0], m.AREGS[1], m.AREGS[2]))
            return m.fail();
        return m.cont;
    }

    // A = foo(1),setarg(1,A,2)
    static {
        PredTable.registerBuiltin("setarg", 3, sxxtensions::PRED_setarg_3_static_exec);
        PredTable.registerBuiltin("nb_setarg", 3, sxxtensions::PRED_nb_setarg_3_static_exec);
    }

    // A = foo(1), findall(A, (nb_setarg(1,A,2) ; true), L), [foo(2),foo(2)] = L.

    static boolean NonBacktrackingSetArg(Prolog m, Term arg1, Term arg2, Term arg3) {
        arg1 = arg1.dref();
        arg2 = arg2.dref();
        arg3 = arg3.dref();

        if (!(arg1.isInteger()))
            return false;
        if (arg2.isAtomicValue())
            return false;
        int i = arg1.intValue();
        if (i < 1)
            return false;
        int l = arg2.arity();
        if (i > l)
            return false;
        (arg2).args()[i - 1] = arg3.dref();
        return true;
    }

    public static Operation PRED_nb_setarg_3_static_exec(Prolog m) {
        m.setB0();
        if (!NonBacktrackingSetArg(m, m.AREGS[0], m.AREGS[1], m.AREGS[2]))
            return m.fail();
        return m.cont;
    }

    public final static class SetArgTrail implements Undoable {
        Term OldValue;
        VariableTerm Which;
        Prolog m;

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "$SetArgTrail " + OldValue + " " + Which;
        }

        SetArgTrail(Term old, Var changed, Prolog m) {
            //  super("$SetArgTrail", old, changed);
            this.OldValue = old;
            this.Which = (VariableTerm) changed;
            this.m = m;
        }

        @Override
        public void undo() {
            this.Which.val = this.OldValue;
            this.Which.timeStamp = this.m.getCPFTimeStamp();
        }

    }

    public final static class PopPendingGoals implements Undoable {
        Prolog m;
        Term old;

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "$PopPendingGoals " + old;
        }

        public PopPendingGoals(Prolog m, Term o) {
            //super("$PopPendingGoals", o);
            this.m = m;
            this.old = o;
        }

        @Override
        public void undo() {
            this.m.pendingGoals = this.old;
        }

    }

    public final static class PopAssumptions implements Undoable {
        Prolog m;
        Term old;

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "$PopAssumptions " + old;
        }

        PopAssumptions(Prolog m, Term o) {
            // super("$PopAssumptions", o);
            this.m = m;
            this.old = o;
        }

        @Override
        public void undo() {
            this.m.assumptions = this.old;
        }

    }

    static {
        PredTable.registerBuiltin("freeze", 2, sxxtensions::PRED_freeze_2_static_exec);
        PredTable.registerBuiltin("frozen", 2, sxxtensions::PRED_frozen_2_static_exec);
    }

    public static Operation PRED_freeze_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.AREGS[0].dref();
        a2 = m.AREGS[1].dref();
        a1.freeze(m.trail, a2);
        return m.cont;
    }

    public static Operation PRED_frozen_2_static_exec(Prolog m) {

        m.setB0();
        Term a1, a2;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1].dref();
        Term goals = a1.frozenGoals();
        if (!a2.unify(goals, m.trail)) {
            return m.fail();
        }

        return m.cont;
    }
    // package TauMachine.builtin;

    // import TauMachine.Operation;
    // import TauMachine.Predicate;
    // import TauMachine.Prolog;
    // import TauMachine.Term;
    static {
        PredTable.registerBuiltin("copy_term_nat", 2, sxxtensions::PRED_copy_term_nat_2_static_exec);
        PredTable.registerBuiltin("copy_term_att", 2, sxxtensions::PRED_copy_term_att_2_static_exec);
        PredTable.registerBuiltin("copy_term", 3, sxxtensions::PRED_copy_term_3_static_exec);

        PredTable.registerBuiltin("attvar", 1, sxxtensions::PRED_attvar_1_static_exec);
        PredTable.registerBuiltin("get_attr", 3, sxxtensions::PRED_get_attr_3_static_exec);
        PredTable.registerBuiltin("put_attr", 3, sxxtensions::PRED_put_attr_3_static_exec);
        PredTable.registerBuiltin("get_attrs", 2, sxxtensions::PRED_get_attrs_2_static_exec);
        PredTable.registerBuiltin("put_attrs", 2, sxxtensions::PRED_put_attrs_2_static_exec);
    }

    public static Operation PRED_copy_term_3_static_exec(Prolog m) {
        Term a1, a2, a3;
        a1 = m.AREGS[0].dref();
        a2 = m.AREGS[1].dref();
        a3 = m.AREGS[2].dref();
        Map<Object, Term> saved = new IdentityHashMap<Object, Term>();
        if (!a2.unify(a1.copy(saved, Term.COPY_SAVE_ATTRS_COPY), m.trail)) {
            return m.fail();
        }
        Term copyGoals = saved.get(Prolog.GOALS);
        if (sxxtensions.isNoGoal(copyGoals)) {
            if (!a3.unify(Prolog.Nil, m.trail)) {
                return m.fail();
            }
        } else {
            if (!a3.unify(copyGoals, m.trail)) {
                return m.fail();
            }
        }
        return m.cont;
    }

    public static Operation PRED_copy_term_nat_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.AREGS[0].dref();
        a2 = m.AREGS[1].dref();
        Map<Object, Term> saved = new IdentityHashMap<Object, Term>();
        if (!a2.unify(a1.copy(saved, Term.COPY_NO_ATTRS), m.trail)) {
            return m.fail();
        }
        return m.cont;
    }

    public static Operation PRED_copy_term_att_2_static_exec(Prolog m) {
        Term a1, a2;
        a1 = m.AREGS[0].dref();
        a2 = m.AREGS[1].dref();
        Map<Object, Term> saved = new IdentityHashMap<Object, Term>();
        Term copy = a1.copy(saved, Term.COPY_ALL);
        if (!a2.unify(copy, m.trail)) {
            return m.fail();
        }
        return m.cont;
    }

    public static Operation PRED_attvar_1_static_exec(Prolog m) {
        m.setB0();
        Term a1;
        a1 = m.AREGS[0];
        a1 = a1.dref();
        if (!a1.isAttvar()) {
            return m.fail();
        }
        return m.cont;
    }

    public static Operation PRED_get_attr_3_static_exec(Prolog m) {
        m.setB0();
        Term a1, a2, a3;
        a1 = m.AREGS[0].dref();
        a2 = m.AREGS[1].dref();
        a3 = m.AREGS[2].dref();
        Term t = a1.findOrAttrValue(m.trail, false, a2);
        if (!t.isCompound())
            return m.fail();
        if (!a3.unify(t.arg0(1), m.trail))
            return m.fail();
        return m.cont;
    }

    public static Operation PRED_get_attrs_2_static_exec(Prolog m) {

        m.setB0();
        Term a1, a2;
        a1 = m.AREGS[0].dref();
        a2 = m.AREGS[1].dref();
        Term attrs = a1.getAttrs();
        if (!a2.unify(attrs, m.trail)) {
            return m.fail();
        }

        return m.cont;
    }

    public static Operation PRED_put_attr_3_static_exec(Prolog m) {
        Term a1, a2, a3;
        a1 = m.AREGS[0].dref();
        a2 = m.AREGS[1].dref();
        a3 = m.AREGS[2].dref();
        a1.putAttrValue(m.trail, a2, a3);
        return m.cont;
    }

    public static Operation PRED_put_attrs_2_static_exec(Prolog m) {
        m.AREGS[0].dref().setAttrs(m.trail, m.AREGS[1].dref());
        return m.cont;

    }

    public static Operation PRED_peek_pending_1_static_exec(final Prolog m) {
        m.setB0();
        final Term a1 = m.AREGS[0].dref();
        Term goals = m.peekPendingGoals();
        if (!a1.unify(goals, m.trail)) {
            return m.fail();
        }
        return m.cont;
    }

    public static Operation PRED_add_pending_1_static_exec(final Prolog m) {
        final Term a1 = m.AREGS[0].dref();
        m.addPendingGoal(a1);
        return m.cont;
    }

    public static Operation PRED_push_pending_1_static_exec(final Prolog m) {
        final Term a1 = m.AREGS[0].dref();
        m.addPendingGoal(a1);
        return m.cont;
    }

    public static Operation PRED_undo_1_static_exec(final Prolog m) {
        final Term a1 = m.AREGS[0].dref();
        m.push(new Undoable() {
            @Override
            public void undo() {
                m.addPendingGoal(a1);
            }
        });
        return m.cont;
    }

    public static Operation PRED_assume_1_static_exec(Prolog m) {
        Term arg1 = m.AREGS[0].dref();
        Term ass = (m.assumptions).dref();
        m.push(new PopAssumptions(m, ass));
        m.assumptions = CONS(arg1, ass);
        return m.cont;
    }

    public static Operation PRED_allassumed_1_static_exec(Prolog m) {
        Term arg1 = m.AREGS[0].dref();
        Term ass = (m.assumptions).dref();
        if (!(arg1.unify(ass, m.trail)))
            return m.fail();
        return m.cont;
    }

    public static void loadFile() {
        PredTable.registerBuiltin("undo", 1, sxxtensions::PRED_undo_1_static_exec);
        PredTable.registerBuiltin("add_pending", 1, sxxtensions::PRED_add_pending_1_static_exec);
        PredTable.registerBuiltin("push_pending", 1, sxxtensions::PRED_push_pending_1_static_exec);
        PredTable.registerBuiltin("peek_pending", 1, sxxtensions::PRED_peek_pending_1_static_exec);
        PredTable.registerBuiltin("assume", 1, sxxtensions::PRED_assume_1_static_exec);
        PredTable.registerBuiltin("allassumed", 1, sxxtensions::PRED_allassumed_1_static_exec);
    }

    public static Term get_attribute_goals(Term copy, Term frozen) {
        if (sxxtensions.isNoGoal(frozen))
            return null;
        return S("put_attrs", copy, frozen);
    }

    public static Term appendGoals(Term sofar, Term goals1) {
        Term result = null;
        if (sxxtensions.isNoGoal(sofar)) {
            result = goals1;
        } else if (sxxtensions.isNoGoal(goals1)) {
            result = sofar;
        } else {
            return S(",", sofar, goals1);
        }
        if (sxxtensions.isNoGoal(result)) {
            result = null;
        }
        return result;
    }

    public static boolean isNoGoal(Term sofar) {
        return sofar == null || sofar == Prolog.Nil || sofar == Prolog.True;
    }
}

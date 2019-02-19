package SxxMachine;
 
import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.locks.*;
import java.util.logging.*;
import static SxxMachine.bootpreds.*;
import static SxxMachine.bootpreds.LEVELS;
import static SxxMachine.FILE_builtins.*;
import static SxxMachine.FILE_cafeteria.*;
import static SxxMachine.FILE_io.*;
import static SxxMachine.FILE_swi_supp.*;
import static SxxMachine.FILE_system.*;
import static SxxMachine.sxxtensions.*;
import static SxxMachine.Failure.*;
import static SxxMachine.Predicate.*;
import static SxxMachine.Prolog.*;
import static SxxMachine.Success.*;
import static SxxMachine.pterm.TermData.*;
import SxxMachine.*;
import SxxMachine.pterm.*;
import SxxMachine.bootpreds.*;
import SxxMachine.bootpreds.PRED_$begin_exception_1;
import SxxMachine.bootpreds.PRED_$begin_sync_2;
import SxxMachine.bootpreds.PRED_$builtin_member_2;
import SxxMachine.FILE_builtins.*;
import SxxMachine.sxxtensions.*;
@SuppressWarnings("unused")
public class FILE_prover extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/prover.pl
*/
    // main(top/0,public)




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-prover
        m.setB0();
    // top:-[prover]
        return //
 Op("prover", FILE_prover::PRED_prover_0_static_exec, VA(), cont);
    }
/** PREDICATE: prover/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/prover.pl
*/
    // main(prover/0,public)




    public static Operation PRED_prover_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry0(null, FILE_prover::prover_0_sub_1);
        return prover_0_1(m);
    }

    private final static Operation prover_0_sub_1(Prolog m) { 
        m.trust(null);
        return prover_0_2(m);
    }

    private final static Operation prover_0_1(Prolog m) { 
    // prover:-problem(A,B,C),implies(B,C),fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        cont = m.cont;
    // prover:-[problem(A,B,C),implies(B,C),fail]
        a1 = m.mkvar1();
        a2 = m.mkvar1();
        return //
 Op("problem", FILE_prover::PRED_problem_3_static_exec, VA(m.DONT_CARE2(), a1, a2), //
 Op("implies", FILE_prover::PRED_implies_2_static_exec, VA(a1, a2), fail_0));
    }

    private final static Operation prover_0_2(Prolog m) { 
    // prover:-true
        Operation cont;
        cont = m.cont;
    // prover:-[]
        return cont;
    }
/** PREDICATE: problem/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/prover.pl
*/
    // main(problem/3,public)
        final static Functor FUNCTOR_$002D_1 = F("-",1);
        final static Functor ATOM_a = SYM("a");
    private static final Compound L_problem_3_s5 = S( FUNCTOR_$002D_1 ,  ATOM_a );
        final static Functor FUNCTOR_$002B_1 = F("+",1);
    private static final Compound L_problem_3_s7 = S( FUNCTOR_$002B_1 ,  ATOM_a );
        final static Functor FUNCTOR_$0026_2 = F("&",2);
    private static final Compound L_problem_3_s11 = S( FUNCTOR_$0026_2 , L_problem_3_s5, L_problem_3_s5);
        final static Functor FUNCTOR_$0023_2 = F("#",2);
        final static Functor ATOM_to_be = SYM("to_be");
    private static final Compound L_problem_3_s16 = S( FUNCTOR_$002B_1 ,  ATOM_to_be );
    private static final Compound L_problem_3_s17 = S( FUNCTOR_$002D_1 ,  ATOM_to_be );
    private static final Compound L_problem_3_s19 = S( FUNCTOR_$0023_2 , L_problem_3_s16, L_problem_3_s17);
        final static Functor ATOM_b = SYM("b");
    private static final Compound L_problem_3_s24 = S( FUNCTOR_$002B_1 ,  ATOM_b );
    private static final Compound L_problem_3_s26 = S( FUNCTOR_$0023_2 , L_problem_3_s24, L_problem_3_s5);
    private static final Compound L_problem_3_s28 = S( FUNCTOR_$002D_1 ,  ATOM_b );
    private static final Compound L_problem_3_s30 = S( FUNCTOR_$0026_2 , L_problem_3_s5, L_problem_3_s28);
    private static final Compound L_problem_3_s32 = S( FUNCTOR_$0026_2 , L_problem_3_s28, L_problem_3_s5);
    private static final Compound L_problem_3_s34 = S( FUNCTOR_$0026_2 , L_problem_3_s24, L_problem_3_s5);
    private static final Compound L_problem_3_s36 = S( FUNCTOR_$0023_2 , L_problem_3_s28, L_problem_3_s34);
        final static Functor ATOM_c = SYM("c");
    private static final Compound L_problem_3_s40 = S( FUNCTOR_$002B_1 ,  ATOM_c );
    private static final Compound L_problem_3_s42 = S( FUNCTOR_$0023_2 , L_problem_3_s28, L_problem_3_s40);
    private static final Compound L_problem_3_s44 = S( FUNCTOR_$0023_2 , L_problem_3_s5, L_problem_3_s42);
    private static final Compound L_problem_3_s46 = S( FUNCTOR_$0023_2 , L_problem_3_s5, L_problem_3_s40);
    private static final Compound L_problem_3_s48 = S( FUNCTOR_$0023_2 , L_problem_3_s28, L_problem_3_s46);
    private static final Compound L_problem_3_s51 = S( FUNCTOR_$0023_2 , L_problem_3_s5, L_problem_3_s24);
    private static final Compound L_problem_3_s52 = S( FUNCTOR_$002D_1 ,  ATOM_c );
    private static final Compound L_problem_3_s54 = S( FUNCTOR_$0026_2 , L_problem_3_s24, L_problem_3_s52);
    private static final Compound L_problem_3_s56 = S( FUNCTOR_$0023_2 , L_problem_3_s54, L_problem_3_s46);
    private static final Compound L_problem_3_s59 = S( FUNCTOR_$0026_2 , L_problem_3_s46, L_problem_3_s42);
    private static final Compound L_problem_3_s61 = S( FUNCTOR_$0023_2 , L_problem_3_s30, L_problem_3_s40);




    public static Operation PRED_problem_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_prover::problem_3_var, FILE_prover::problem_3_var, fail_0, fail_0, fail_0, fail_0); 
    }

    private final static Operation problem_3_var(Prolog m) { 
        m.jtry3(null, FILE_prover::problem_3_var_1);
        return problem_3_1(m);
    }

    private final static Operation problem_3_var_1(Prolog m) { 
        m.retry(null, FILE_prover::problem_3_var_2);
        return problem_3_2(m);
    }

    private final static Operation problem_3_var_2(Prolog m) { 
        m.retry(null, FILE_prover::problem_3_var_3);
        return problem_3_3(m);
    }

    private final static Operation problem_3_var_3(Prolog m) { 
        m.retry(null, FILE_prover::problem_3_var_4);
        return problem_3_4(m);
    }

    private final static Operation problem_3_var_4(Prolog m) { 
        m.retry(null, FILE_prover::problem_3_var_5);
        return problem_3_5(m);
    }

    private final static Operation problem_3_var_5(Prolog m) { 
        m.retry(null, FILE_prover::problem_3_var_6);
        return problem_3_6(m);
    }

    private final static Operation problem_3_var_6(Prolog m) { 
        m.retry(null, FILE_prover::problem_3_var_7);
        return problem_3_7(m);
    }

    private final static Operation problem_3_var_7(Prolog m) { 
        m.retry(null, FILE_prover::problem_3_var_8);
        return problem_3_8(m);
    }

    private final static Operation problem_3_var_8(Prolog m) { 
        m.retry(null, FILE_prover::problem_3_var_9);
        return problem_3_9(m);
    }

    private final static Operation problem_3_var_9(Prolog m) { 
        m.trust(null);
        return problem_3_10(m);
    }

    private final static Operation problem_3_1(Prolog m) { 
    // problem(1,-a,+a):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // problem(1,-a,+a):-[]
        if (!  int_1 .unify(a1, m.trail))
            return m.fail();
        if (! L_problem_3_s5.unify(a2, m.trail))
            return m.fail();
        if (! L_problem_3_s7.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation problem_3_2(Prolog m) { 
    // problem(2,+a,-a& -a):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // problem(2,+a,-a& -a):-[]
        if (!  int_2 .unify(a1, m.trail))
            return m.fail();
        if (! L_problem_3_s7.unify(a2, m.trail))
            return m.fail();
        if (! L_problem_3_s11.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation problem_3_3(Prolog m) { 
    // problem(3,-a,+to_be# -to_be):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // problem(3,-a,+to_be# -to_be):-[]
        if (!  int_3 .unify(a1, m.trail))
            return m.fail();
        if (! L_problem_3_s5.unify(a2, m.trail))
            return m.fail();
        if (! L_problem_3_s19.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation problem_3_4(Prolog m) { 
    // problem(4,-a& -a,-a):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // problem(4,-a& -a,-a):-[]
        if (!  int_4 .unify(a1, m.trail))
            return m.fail();
        if (! L_problem_3_s11.unify(a2, m.trail))
            return m.fail();
        if (! L_problem_3_s5.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation problem_3_5(Prolog m) { 
    // problem(5,-a,+b# -a):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // problem(5,-a,+b# -a):-[]
        if (!  int_5 .unify(a1, m.trail))
            return m.fail();
        if (! L_problem_3_s5.unify(a2, m.trail))
            return m.fail();
        if (! L_problem_3_s26.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation problem_3_6(Prolog m) { 
    // problem(6,-a& -b,-b& -a):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // problem(6,-a& -b,-b& -a):-[]
        if (!  int_6 .unify(a1, m.trail))
            return m.fail();
        if (! L_problem_3_s30.unify(a2, m.trail))
            return m.fail();
        if (! L_problem_3_s32.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation problem_3_7(Prolog m) { 
    // problem(7,-a,-b# +b& -a):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // problem(7,-a,-b# +b& -a):-[]
        if (!  int_7 .unify(a1, m.trail))
            return m.fail();
        if (! L_problem_3_s5.unify(a2, m.trail))
            return m.fail();
        if (! L_problem_3_s36.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation problem_3_8(Prolog m) { 
    // problem(8,-a# -b# +c,-b# -a# +c):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // problem(8,-a# -b# +c,-b# -a# +c):-[]
        if (!  int_8 .unify(a1, m.trail))
            return m.fail();
        if (! L_problem_3_s44.unify(a2, m.trail))
            return m.fail();
        if (! L_problem_3_s48.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation problem_3_9(Prolog m) { 
    // problem(9,-a# +b,+b& -c# -a# +c):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // problem(9,-a# +b,+b& -c# -a# +c):-[]
        if (!  int_9 .unify(a1, m.trail))
            return m.fail();
        if (! L_problem_3_s51.unify(a2, m.trail))
            return m.fail();
        if (! L_problem_3_s56.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation problem_3_10(Prolog m) { 
    // problem(10,(-a# +c)&(-b# +c),-a& -b# +c):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // problem(10,(-a# +c)&(-b# +c),-a& -b# +c):-[]
        if (!  int_10 .unify(a1, m.trail))
            return m.fail();
        if (! L_problem_3_s59.unify(a2, m.trail))
            return m.fail();
        if (! L_problem_3_s61.unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: implies/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/prover.pl
*/
    // main(implies/2,public)
        final static Functor FUNCTOR_fs_4 = F("fs",4);
    private static final Compound L_implies_2_s4 = S( FUNCTOR_fs_4 ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );




    public static Operation PRED_implies_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // implies(A,B):-opposite(B,C),add_conjunction(A,C,fs([],[],[],[]))
        m.setB0();
         Term a1, a2, a3;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // implies(A,B):-[opposite(B,C),add_conjunction(A,C,fs([],[],[],[]))]
        a3 = m.mkvar1();
        return //
 Op("opposite", FILE_prover::PRED_opposite_2_static_exec, VA(a2, a3), //
 Op("add_conjunction", FILE_prover::PRED_add_conjunction_3_static_exec, VA(a1, a3, L_implies_2_s4), cont));
    }
/** PREDICATE: opposite/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/prover.pl
*/
    // main(opposite/2,public)




    public static Operation PRED_opposite_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return opposite_2_top(m);
    }

    private final static Operation opposite_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_prover::opposite_2_var, fail_0, fail_0, fail_0, FILE_prover::opposite_2_var, fail_0); 
    }

    private final static Operation opposite_2_var(Prolog m) { 
        m.jtry2(null, FILE_prover::opposite_2_var_1);
        return opposite_2_1(m);
    }

    private final static Operation opposite_2_var_1(Prolog m) { 
        m.retry(null, FILE_prover::opposite_2_var_2);
        return opposite_2_2(m);
    }

    private final static Operation opposite_2_var_2(Prolog m) { 
        m.retry(null, FILE_prover::opposite_2_var_3);
        return opposite_2_3(m);
    }

    private final static Operation opposite_2_var_3(Prolog m) { 
        m.trust(null);
        return opposite_2_4(m);
    }

    private final static Operation opposite_2_1(Prolog m) { 
    // opposite(A&B,C#D):-!,opposite(A,C),opposite(B,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // opposite(A&B,C#D):-['$neck_cut',opposite(A,C),opposite(B,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$0026_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$0023_2 , m.trail, a5, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op("opposite", FILE_prover::PRED_opposite_2_static_exec, VA(a4, a6), cont);
        m.AREGS[0] = a3;
        m.AREGS[1] = a5;
        m.cont = p1;
        return opposite_2_top(m);
    }

    private final static Operation opposite_2_2(Prolog m) { 
    // opposite(A#B,C&D):-!,opposite(A,C),opposite(B,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // opposite(A#B,C&D):-['$neck_cut',opposite(A,C),opposite(B,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$0023_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$0026_2 , m.trail, a5, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op("opposite", FILE_prover::PRED_opposite_2_static_exec, VA(a4, a6), cont);
        m.AREGS[0] = a3;
        m.AREGS[1] = a5;
        m.cont = p1;
        return opposite_2_top(m);
    }

    private final static Operation opposite_2_3(Prolog m) { 
    // opposite(+A,-A):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // opposite(+A,-A):-['$neck_cut']
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002B_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_$002D_1 , m.trail, a3)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation opposite_2_4(Prolog m) { 
    // opposite(-A,+A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // opposite(-A,+A):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_$002B_1 , m.trail, a3)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: add_conjunction/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/prover.pl
*/
    // main(add_conjunction/3,public)




    public static Operation PRED_add_conjunction_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // add_conjunction(A,B,C):-expand(A,C,D),expand(B,D,E),refute(E)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // add_conjunction(A,B,C):-[expand(A,C,D),expand(B,D,E),refute(E)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op("expand", FILE_prover::PRED_expand_3_static_exec, VA(a1, a3, a4), //
 Op("expand", FILE_prover::PRED_expand_3_static_exec, VA(a2, a4, a5), //
 Op("refute", FILE_prover::PRED_refute_1_static_exec, VA(a5), cont)));
    }
/** PREDICATE: expand/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/prover.pl
*/
    // main(expand/3,public)
        final static Functor ATOM_refuted = SYM("refuted");




    public static Operation PRED_expand_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return expand_3_top(m);
    }

    private final static Operation expand_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_prover::expand_3_var, FILE_prover::expand_3_1, FILE_prover::expand_3_1, FILE_prover::expand_3_1, FILE_prover::expand_3_var, FILE_prover::expand_3_1); 
    }

    private final static Operation expand_3_var(Prolog m) { 
        m.jtry3(null, FILE_prover::expand_3_var_1);
        return expand_3_1(m);
    }

    private final static Operation expand_3_var_1(Prolog m) { 
        m.retry(null, FILE_prover::expand_3_var_2);
        return expand_3_2(m);
    }

    private final static Operation expand_3_var_2(Prolog m) { 
        m.retry(null, FILE_prover::expand_3_var_3);
        return expand_3_3(m);
    }

    private final static Operation expand_3_var_3(Prolog m) { 
        m.retry(null, FILE_prover::expand_3_var_4);
        return expand_3_4(m);
    }

    private final static Operation expand_3_var_4(Prolog m) { 
        m.retry(null, FILE_prover::expand_3_var_5);
        return expand_3_5(m);
    }

    private final static Operation expand_3_var_5(Prolog m) { 
        m.retry(null, FILE_prover::expand_3_var_6);
        return expand_3_6(m);
    }

    private final static Operation expand_3_var_6(Prolog m) { 
        m.trust(null);
        return expand_3_7(m);
    }

    private final static Operation expand_3_1(Prolog m) { 
    // expand(A,refuted,refuted):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // expand(A,refuted,refuted):-['$neck_cut']
        if (!  ATOM_refuted .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_refuted .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation expand_3_2(Prolog m) { 
    // expand(A&B,fs(C,D,E,F),refuted):-includes(C,A&B),!
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // expand(A&B,fs(C,D,E,F),refuted):-['$get_level'(G),includes(C,A&B),'$cut'(G)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$0026_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_fs_4 , m.trail, a6, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        if (!  ATOM_refuted .unify(a3, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$0026_2'),y(1),a(8))
        a8 =  S( FUNCTOR_$0026_2 , a4, a5);
 ;
        return //
 Op("includes", FILE_prover::PRED_includes_2_static_exec, VA(a6, a8), //
 Op("$cut", FILE_prover::PRED_$cut_1_static_exec, VA(a7), cont));
    }

    private final static Operation expand_3_3(Prolog m) { 
    // expand(A&B,fs(C,D,E,F),fs(C,D,E,F)):-includes(D,A&B),!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // expand(A&B,fs(C,D,E,F),fs(C,D,E,F)):-['$get_level'(G),includes(D,A&B),'$cut'(G)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$0026_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_fs_4 , m.trail, a6, a7, a8, a9)){
                return m.fail();
            }
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_fs_4 , m.trail, a6, a7, a8, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$0026_2'),y(1),a(11))
        a11 =  S( FUNCTOR_$0026_2 , a4, a5);
 ;
        return //
 Op("includes", FILE_prover::PRED_includes_2_static_exec, VA(a7, a11), //
 Op("$cut", FILE_prover::PRED_$cut_1_static_exec, VA(a10), cont));
    }

    private final static Operation expand_3_4(Prolog m) { 
    // expand(A&B,fs(C,D,E,F),G):-!,expand(A,fs(C,[A&B|D],E,F),H),expand(B,H,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // expand(A&B,fs(C,D,E,F),G):-['$neck_cut',expand(A,fs(C,[A&B|D],E,F),H),expand(B,H,G)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$0026_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_fs_4 , m.trail, a6, a7, a8, a9)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$0026_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$0026_2 , a4, a5);
 ;
        a11 = CONS(a10, a7);
    // put_str_args([a(6),a(11),a(8),a(9)],y(2)),put_str(@('FUNCTOR_fs_4'),y(2),a(12))
        a12 =  S( FUNCTOR_fs_4 , a6, a11, a8, a9);
 ;
        a13 = m.mkvar1();
        p1 = //
 Op("expand", FILE_prover::PRED_expand_3_static_exec, VA(a5, a13, a3), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a12;
        m.AREGS[2] = a13;
        m.cont = p1;
        return expand_3_top(m);
    }

    private final static Operation expand_3_5(Prolog m) { 
    // expand(A#B,fs(C,D,E,F),G):-!,opposite(A#B,H),extend(H,C,D,I,fs(I,D,E,F),G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // expand(A#B,fs(C,D,E,F),G):-['$neck_cut',opposite(A#B,H),extend(H,C,D,I,fs(I,D,E,F),G)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$0023_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_fs_4 , m.trail, a6, a7, a8, a9)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$0023_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$0023_2 , a4, a5);
 ;
        a11 = m.mkvar1();
        a12 = m.mkvar1();
    // put_str_args([a(12),a(7),a(8),a(9)],y(2)),put_str(@('FUNCTOR_fs_4'),y(2),a(13))
        a13 =  S( FUNCTOR_fs_4 , a12, a7, a8, a9);
 ;
        return //
 Op("opposite", FILE_prover::PRED_opposite_2_static_exec, VA(a10, a11), //
 Op("extend", FILE_prover::PRED_extend_6_static_exec, VA(a11, a6, a7, a12, a13, a3), cont));
    }

    private final static Operation expand_3_6(Prolog m) { 
    // expand(+A,fs(B,C,D,E),F):-!,extend(A,D,E,G,fs(B,C,G,E),F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // expand(+A,fs(B,C,D,E),F):-['$neck_cut',extend(A,D,E,G,fs(B,C,G,E),F)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002B_1 , m.trail, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_fs_4 , m.trail, a5, a6, a7, a8)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a9 = m.mkvar1();
    // put_str_args([a(5),a(6),a(9),a(8)],y(1)),put_str(@('FUNCTOR_fs_4'),y(1),a(10))
        a10 =  S( FUNCTOR_fs_4 , a5, a6, a9, a8);
 ;
        return //
 Op("extend", FILE_prover::PRED_extend_6_static_exec, VA(a4, a7, a8, a9, a10, a3), cont);
    }

    private final static Operation expand_3_7(Prolog m) { 
    // expand(-A,fs(B,C,D,E),F):-extend(A,E,D,G,fs(B,C,D,G),F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // expand(-A,fs(B,C,D,E),F):-[extend(A,E,D,G,fs(B,C,D,G),F)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D_1 , m.trail, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_fs_4 , m.trail, a5, a6, a7, a8)){
                return m.fail();
            }
        a9 = m.mkvar1();
    // put_str_args([a(5),a(6),a(7),a(9)],y(1)),put_str(@('FUNCTOR_fs_4'),y(1),a(10))
        a10 =  S( FUNCTOR_fs_4 , a5, a6, a7, a9);
 ;
        return //
 Op("extend", FILE_prover::PRED_extend_6_static_exec, VA(a4, a8, a7, a9, a10, a3), cont);
    }
/** PREDICATE: includes/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/prover.pl
*/
    // main(includes/2,public)




    public static Operation PRED_includes_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return includes_2_top(m);
    }

    private final static Operation includes_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_prover::includes_2_var, fail_0, fail_0, fail_0, fail_0, FILE_prover::includes_2_var); 
    }

    private final static Operation includes_2_var(Prolog m) { 
        m.jtry2(null, FILE_prover::includes_2_var_1);
        return includes_2_1(m);
    }

    private final static Operation includes_2_var_1(Prolog m) { 
        m.trust(null);
        return includes_2_2(m);
    }

    private final static Operation includes_2_1(Prolog m) { 
    // includes([A|B],A):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // includes([A|B],A):-['$neck_cut']
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(a3, m.DONTCARE("cons(a(1))")), m.trail);
        } else {
            return m.fail();
        }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation includes_2_2(Prolog m) { 
    // includes([A|B],C):-includes(B,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // includes([A|B],C):-[includes(B,C)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.cdr();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(m.DONTCARE("cons(a(1))"), a3), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a3;
        m.AREGS[1] = a2;
m.cont = cont;
        return includes_2_top(m);
    }
/** PREDICATE: extend/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/prover.pl
*/
    // main(extend/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_extend_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_prover::extend_6_sub_1);
        return extend_6_1(m);
    }

    private final static Operation extend_6_sub_1(Prolog m) { 
        m.retry(null, FILE_prover::extend_6_sub_2);
        return extend_6_2(m);
    }

    private final static Operation extend_6_sub_2(Prolog m) { 
        m.trust(null);
        return extend_6_3(m);
    }

    private final static Operation extend_6_1(Prolog m) { 
    // extend(A,B,C,D,E,refuted):-includes(C,A),!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // extend(A,B,C,D,E,refuted):-['$get_level'(F),includes(C,A),'$cut'(F)]
        if (!  ATOM_refuted .unify(a6, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("includes", FILE_prover::PRED_includes_2_static_exec, VA(a3, a1), //
 Op("$cut", FILE_prover::PRED_$cut_1_static_exec, VA(a7), cont));
    }

    private final static Operation extend_6_2(Prolog m) { 
    // extend(A,B,C,B,D,D):-includes(B,A),!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // extend(A,B,C,B,D,D):-['$get_level'(E),includes(B,A),'$cut'(E)]
        if (! a2.unify(a4, m.trail))
            return m.fail();
        if (! a5.unify(a6, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("includes", FILE_prover::PRED_includes_2_static_exec, VA(a2, a1), //
 Op("$cut", FILE_prover::PRED_$cut_1_static_exec, VA(a7), cont));
    }

    private final static Operation extend_6_3(Prolog m) { 
    // extend(A,B,C,[A|B],D,D):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // extend(A,B,C,[A|B],D,D):-[]
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! a1.unify(a4.car(), m.trail))
                return m.fail();
            if (! a2.unify(a4.cdr(), m.trail))
                return m.fail();
        } else if (a4.isVar()){
             a4.bind(CONS(a1, a2), m.trail);
        } else {
            return m.fail();
        }
        if (! a5.unify(a6, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: refute/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/prover.pl
*/
    // main(refute/1,public)




    public static Operation PRED_refute_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_prover::refute_1_var, fail_0, fail_0, FILE_prover::refute_1_1, FILE_prover::refute_1_2, fail_0); 
    }

    private final static Operation refute_1_var(Prolog m) { 
        m.jtry1(null, FILE_prover::refute_1_var_1);
        return refute_1_1(m);
    }

    private final static Operation refute_1_var_1(Prolog m) { 
        m.trust(null);
        return refute_1_2(m);
    }

    private final static Operation refute_1_1(Prolog m) { 
    // refute(refuted):-!
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // refute(refuted):-['$neck_cut']
        if (!  ATOM_refuted .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation refute_1_2(Prolog m) { 
    // refute(fs([A&B|C],D,E,F)):-opposite(A,G),opposite(B,H),I=fs(C,D,E,F),add_conjunction(G,B,I),add_conjunction(G,H,I),add_conjunction(A,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // refute(fs([A&B|C],D,E,F)):-[opposite(A,G),opposite(B,H),'$unify'(I,fs(C,D,E,F)),add_conjunction(G,B,I),add_conjunction(G,H,I),add_conjunction(A,H,I)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_fs_4 , m.trail, a2, a3, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$0026_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
    // put_str_args([a(7),a(3),a(4),a(5)],y(1)),put_str(@('FUNCTOR_fs_4'),y(1),a(13))
        a13 =  S( FUNCTOR_fs_4 , a7, a3, a4, a5);
 ;
        return //
 Op("opposite", FILE_prover::PRED_opposite_2_static_exec, VA(a8, a10), //
 Op("opposite", FILE_prover::PRED_opposite_2_static_exec, VA(a9, a11), //
 Op("$unify", FILE_prover::PRED_$unify_2_static_exec, VA(a12, a13), //
 Op("add_conjunction", FILE_prover::PRED_add_conjunction_3_static_exec, VA(a10, a9, a12), //
 Op("add_conjunction", FILE_prover::PRED_add_conjunction_3_static_exec, VA(a10, a11, a12), //
 Op("add_conjunction", FILE_prover::PRED_add_conjunction_3_static_exec, VA(a8, a11, a12), cont))))));
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_prover::PRED_top_0_static_exec);
   PredTable.registerBuiltin("prover",0,FILE_prover::PRED_prover_0_static_exec);
   PredTable.registerBuiltin("problem",3,FILE_prover::PRED_problem_3_static_exec);
   PredTable.registerBuiltin("implies",2,FILE_prover::PRED_implies_2_static_exec);
   PredTable.registerBuiltin("opposite",2,FILE_prover::PRED_opposite_2_static_exec);
   PredTable.registerBuiltin("add_conjunction",3,FILE_prover::PRED_add_conjunction_3_static_exec);
   PredTable.registerBuiltin("expand",3,FILE_prover::PRED_expand_3_static_exec);
   PredTable.registerBuiltin("includes",2,FILE_prover::PRED_includes_2_static_exec);
   PredTable.registerBuiltin("extend",6,FILE_prover::PRED_extend_6_static_exec);
   PredTable.registerBuiltin("refute",1,FILE_prover::PRED_refute_1_static_exec);
}
}

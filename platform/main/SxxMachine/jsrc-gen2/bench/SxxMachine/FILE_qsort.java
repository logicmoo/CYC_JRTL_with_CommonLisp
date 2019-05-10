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
public class FILE_qsort extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/qsort.pl
*/
    // main(top/0,public)




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-qsort
        m.setB0();
    // top:-[qsort]
        return //
 Op("qsort", FILE_qsort::PRED_qsort_0_static_exec, VA(), cont);
    }
/** PREDICATE: qsort/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/qsort.pl
*/
    // main(qsort/0,public)
        final static NumberTerm int_27 = Integer(27);
        final static NumberTerm int_74 = Integer(74);
        final static NumberTerm int_33 = Integer(33);
        final static NumberTerm int_94 = Integer(94);
        final static NumberTerm int_46 = Integer(46);
        final static NumberTerm int_83 = Integer(83);
        final static NumberTerm int_65 = Integer(65);
        final static NumberTerm int_32 = Integer(32);
        final static NumberTerm int_53 = Integer(53);
        final static NumberTerm int_28 = Integer(28);
        final static NumberTerm int_85 = Integer(85);
        final static NumberTerm int_99 = Integer(99);
        final static NumberTerm int_47 = Integer(47);
        final static NumberTerm int_82 = Integer(82);
        final static NumberTerm int_55 = Integer(55);
        final static NumberTerm int_29 = Integer(29);
        final static NumberTerm int_39 = Integer(39);
        final static NumberTerm int_81 = Integer(81);
        final static NumberTerm int_90 = Integer(90);
        final static NumberTerm int_37 = Integer(37);
        final static NumberTerm int_66 = Integer(66);
        final static NumberTerm int_51 = Integer(51);
        final static NumberTerm int_31 = Integer(31);
        final static NumberTerm int_63 = Integer(63);
        final static NumberTerm int_75 = Integer(75);
        final static NumberTerm int_95 = Integer(95);
        final static NumberTerm int_61 = Integer(61);
        final static NumberTerm int_92 = Integer(92);
        final static NumberTerm int_40 = Integer(40);
        final static NumberTerm int_59 = Integer(59);
    private static final Compound L_qsort_0_s43 = CONS( int_8 ,  Prolog.Nil );
    private static final Compound L_qsort_0_s44 = CONS( int_59 , L_qsort_0_s43);
    private static final Compound L_qsort_0_s45 = CONS( int_53 , L_qsort_0_s44);
    private static final Compound L_qsort_0_s46 = CONS( int_40 , L_qsort_0_s45);
    private static final Compound L_qsort_0_s47 = CONS( int_92 , L_qsort_0_s46);
    private static final Compound L_qsort_0_s48 = CONS( int_18 , L_qsort_0_s47);
    private static final Compound L_qsort_0_s49 = CONS( int_74 , L_qsort_0_s48);
    private static final Compound L_qsort_0_s50 = CONS( int_61 , L_qsort_0_s49);
    private static final Compound L_qsort_0_s51 = CONS( int_28 , L_qsort_0_s50);
    private static final Compound L_qsort_0_s52 = CONS( int_11 , L_qsort_0_s51);
    private static final Compound L_qsort_0_s53 = CONS( int_99 , L_qsort_0_s52);
    private static final Compound L_qsort_0_s54 = CONS( int_95 , L_qsort_0_s53);
    private static final Compound L_qsort_0_s55 = CONS( int_4 , L_qsort_0_s54);
    private static final Compound L_qsort_0_s56 = CONS( int_75 , L_qsort_0_s55);
    private static final Compound L_qsort_0_s57 = CONS( int_63 , L_qsort_0_s56);
    private static final Compound L_qsort_0_s58 = CONS( int_31 , L_qsort_0_s57);
    private static final Compound L_qsort_0_s59 = CONS( int_27 , L_qsort_0_s58);
    private static final Compound L_qsort_0_s60 = CONS( int_85 , L_qsort_0_s59);
    private static final Compound L_qsort_0_s61 = CONS( int_21 , L_qsort_0_s60);
    private static final Compound L_qsort_0_s62 = CONS( int_7 , L_qsort_0_s61);
    private static final Compound L_qsort_0_s63 = CONS( int_51 , L_qsort_0_s62);
    private static final Compound L_qsort_0_s64 = CONS( int_66 , L_qsort_0_s63);
    private static final Compound L_qsort_0_s65 = CONS( int_0 , L_qsort_0_s64);
    private static final Compound L_qsort_0_s66 = CONS( int_10 , L_qsort_0_s65);
    private static final Compound L_qsort_0_s67 = CONS( int_37 , L_qsort_0_s66);
    private static final Compound L_qsort_0_s68 = CONS( int_90 , L_qsort_0_s67);
    private static final Compound L_qsort_0_s69 = CONS( int_81 , L_qsort_0_s68);
    private static final Compound L_qsort_0_s70 = CONS( int_39 , L_qsort_0_s69);
    private static final Compound L_qsort_0_s71 = CONS( int_29 , L_qsort_0_s70);
    private static final Compound L_qsort_0_s72 = CONS( int_55 , L_qsort_0_s71);
    private static final Compound L_qsort_0_s73 = CONS( int_11 , L_qsort_0_s72);
    private static final Compound L_qsort_0_s74 = CONS( int_6 , L_qsort_0_s73);
    private static final Compound L_qsort_0_s75 = CONS( int_82 , L_qsort_0_s74);
    private static final Compound L_qsort_0_s76 = CONS( int_28 , L_qsort_0_s75);
    private static final Compound L_qsort_0_s77 = CONS( int_47 , L_qsort_0_s76);
    private static final Compound L_qsort_0_s78 = CONS( int_99 , L_qsort_0_s77);
    private static final Compound L_qsort_0_s79 = CONS( int_85 , L_qsort_0_s78);
    private static final Compound L_qsort_0_s80 = CONS( int_28 , L_qsort_0_s79);
    private static final Compound L_qsort_0_s81 = CONS( int_53 , L_qsort_0_s80);
    private static final Compound L_qsort_0_s82 = CONS( int_32 , L_qsort_0_s81);
    private static final Compound L_qsort_0_s83 = CONS( int_2 , L_qsort_0_s82);
    private static final Compound L_qsort_0_s84 = CONS( int_65 , L_qsort_0_s83);
    private static final Compound L_qsort_0_s85 = CONS( int_83 , L_qsort_0_s84);
    private static final Compound L_qsort_0_s86 = CONS( int_46 , L_qsort_0_s85);
    private static final Compound L_qsort_0_s87 = CONS( int_18 , L_qsort_0_s86);
    private static final Compound L_qsort_0_s88 = CONS( int_94 , L_qsort_0_s87);
    private static final Compound L_qsort_0_s89 = CONS( int_33 , L_qsort_0_s88);
    private static final Compound L_qsort_0_s90 = CONS( int_17 , L_qsort_0_s89);
    private static final Compound L_qsort_0_s91 = CONS( int_74 , L_qsort_0_s90);
    private static final Compound L_qsort_0_s92 = CONS( int_27 , L_qsort_0_s91);




    public static Operation PRED_qsort_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // qsort:-qsort([27,74,17,33,94,18,46,83,65,2,32,53,28,85,99,47,28,82,6,11,55,29,39,81,90,37,10,0,66,51,7,21,85,27,31,63,75,4,95,99,11,28,61,74,18,92,40,53,59,8],A,[])
        m.setB0();
    // qsort:-[qsort([27,74,17,33,94,18,46,83,65,2,32,53,28,85,99,47,28,82,6,11,55,29,39,81,90,37,10,0,66,51,7,21,85,27,31,63,75,4,95,99,11,28,61,74,18,92,40,53,59,8],A,[])]
        return //
 Op("qsort", FILE_qsort::PRED_qsort_3_static_exec, VA(L_qsort_0_s92, m.DONT_CARE2(),  Prolog.Nil ), cont);
    }
/** PREDICATE: qsort/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/qsort.pl
*/
    // main(qsort/3,public)




    public static Operation PRED_qsort_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_qsort::qsort_3_var, fail_0, fail_0, FILE_qsort::qsort_3_2, fail_0, FILE_qsort::qsort_3_1); 
    }

    private final static Operation qsort_3_var(Prolog m) { 
        m.jtry3(null, FILE_qsort::qsort_3_var_1);
        return qsort_3_1(m);
    }

    private final static Operation qsort_3_var_1(Prolog m) { 
        m.trust(null);
        return qsort_3_2(m);
    }

    private final static Operation qsort_3_1(Prolog m) { 
    // qsort([A|B],C,D):-partition(B,A,E,F),qsort(F,G,D),qsort(E,C,[A|G])
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // qsort([A|B],C,D):-[partition(B,A,E,F),qsort(F,G,D),qsort(E,C,[A|G])]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a4 = a1.car();
            a5 = a1.cdr();
        } else if (a1.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a1.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = CONS(a4, a8);
        return //
 Op("partition", FILE_qsort::PRED_partition_4_static_exec, VA(a5, a4, a6, a7), //
 Op("qsort", FILE_qsort::PRED_qsort_3_static_exec, VA(a7, a8, a3), //
 Op("qsort", FILE_qsort::PRED_qsort_3_static_exec, VA(a6, a2, a9), cont)));
    }

    private final static Operation qsort_3_2(Prolog m) { 
    // qsort([],A,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // qsort([],A,A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: partition/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/qsort.pl
*/
    // main(partition/4,public)




    public static Operation PRED_partition_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return partition_4_top(m);
    }

    private final static Operation partition_4_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_qsort::partition_4_var, fail_0, fail_0, FILE_qsort::partition_4_3, fail_0, FILE_qsort::partition_4_lis); 
    }

    private final static Operation partition_4_var(Prolog m) { 
        m.jtry4(null, FILE_qsort::partition_4_var_1);
        return partition_4_1(m);
    }

    private final static Operation partition_4_var_1(Prolog m) { 
        m.retry(null, FILE_qsort::partition_4_var_2);
        return partition_4_2(m);
    }

    private final static Operation partition_4_var_2(Prolog m) { 
        m.trust(null);
        return partition_4_3(m);
    }

    private final static Operation partition_4_lis(Prolog m) { 
        m.jtry4(null, FILE_qsort::partition_4_lis_1);
        return partition_4_1(m);
    }

    private final static Operation partition_4_lis_1(Prolog m) { 
        m.trust(null);
        return partition_4_2(m);
    }

    private final static Operation partition_4_1(Prolog m) { 
    // partition([A|B],C,[A|D],E):-A=<C,!,partition(B,C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // partition([A|B],C,[A|D],E):-['$get_level'(F),'$less_or_equal'(A,C),'$cut'(F),partition(B,C,D,E)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a5 = a1.car();
            a6 = a1.cdr();
        } else if (a1.isVar()){
            a5 = m.mkvar2();
            a6 = m.mkvar2();
             a1.bind(CONS(a5, a6), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a5.unify(a3.car(), m.trail))
                return m.fail();
            a7 = a3.cdr();
        } else if (a3.isVar()){
            a7 = m.mkvar2();
             a3.bind(CONS(a5, a7), m.trail);
        } else {
            return m.fail();
        }
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_or_equal(a(5),a(2))
        if (Arithmetic.evaluate(a5).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(8))
        a8 = a8.dref();
                  m.cut( a8.intValue());
        //END inline expansion
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
        m.AREGS[2] = a7;
        m.AREGS[3] = a4;
m.cont = cont;
        return partition_4_top(m);
    }

    private final static Operation partition_4_2(Prolog m) { 
    // partition([A|B],C,D,[A|E]):-partition(B,C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // partition([A|B],C,D,[A|E]):-[partition(B,C,D,E)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a5 = a1.car();
            a6 = a1.cdr();
        } else if (a1.isVar()){
            a5 = m.mkvar2();
            a6 = m.mkvar2();
             a1.bind(CONS(a5, a6), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! a5.unify(a4.car(), m.trail))
                return m.fail();
            a7 = a4.cdr();
        } else if (a4.isVar()){
            a7 = m.mkvar2();
             a4.bind(CONS(a5, a7), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a7;
m.cont = cont;
        return partition_4_top(m);
    }

    private final static Operation partition_4_3(Prolog m) { 
    // partition([],A,[],[]):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // partition([],A,[],[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a4, m.trail))
            return m.fail();
        return cont;
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_qsort::PRED_top_0_static_exec);
   PredTable.registerBuiltin("qsort",0,FILE_qsort::PRED_qsort_0_static_exec);
   PredTable.registerBuiltin("qsort",3,FILE_qsort::PRED_qsort_3_static_exec);
   PredTable.registerBuiltin("partition",4,FILE_qsort::PRED_partition_4_static_exec);
}
}

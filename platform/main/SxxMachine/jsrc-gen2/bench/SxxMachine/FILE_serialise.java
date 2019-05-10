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
public class FILE_serialise extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/serialise.pl
*/
    // main(top/0,public)




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-serialise
        m.setB0();
    // top:-[serialise]
        return //
 Op("serialise", FILE_serialise::PRED_serialise_0_static_exec, VA(), cont);
    }
/** PREDICATE: serialise/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/serialise.pl
*/
    // main(serialise/0,public)
        final static NumberTerm int_65 = Integer(65);
        final static NumberTerm int_66 = Integer(66);
        final static NumberTerm int_76 = Integer(76);
        final static NumberTerm int_69 = Integer(69);
        final static NumberTerm int_32 = Integer(32);
        final static NumberTerm int_87 = Integer(87);
        final static NumberTerm int_83 = Integer(83);
        final static NumberTerm int_73 = Integer(73);
        final static NumberTerm int_82 = Integer(82);
    private static final Compound L_serialise_0_s11 = CONS( int_65 ,  Prolog.Nil );
    private static final Compound L_serialise_0_s12 = CONS( int_66 , L_serialise_0_s11);
    private static final Compound L_serialise_0_s13 = CONS( int_76 , L_serialise_0_s12);
    private static final Compound L_serialise_0_s14 = CONS( int_69 , L_serialise_0_s13);
    private static final Compound L_serialise_0_s15 = CONS( int_32 , L_serialise_0_s14);
    private static final Compound L_serialise_0_s16 = CONS( int_87 , L_serialise_0_s15);
    private static final Compound L_serialise_0_s17 = CONS( int_65 , L_serialise_0_s16);
    private static final Compound L_serialise_0_s18 = CONS( int_83 , L_serialise_0_s17);
    private static final Compound L_serialise_0_s19 = CONS( int_32 , L_serialise_0_s18);
    private static final Compound L_serialise_0_s20 = CONS( int_73 , L_serialise_0_s19);
    private static final Compound L_serialise_0_s21 = CONS( int_32 , L_serialise_0_s20);
    private static final Compound L_serialise_0_s22 = CONS( int_69 , L_serialise_0_s21);
    private static final Compound L_serialise_0_s23 = CONS( int_82 , L_serialise_0_s22);
    private static final Compound L_serialise_0_s24 = CONS( int_69 , L_serialise_0_s23);
    private static final Compound L_serialise_0_s25 = CONS( int_32 , L_serialise_0_s24);
    private static final Compound L_serialise_0_s26 = CONS( int_73 , L_serialise_0_s25);
    private static final Compound L_serialise_0_s27 = CONS( int_32 , L_serialise_0_s26);
    private static final Compound L_serialise_0_s28 = CONS( int_83 , L_serialise_0_s27);
    private static final Compound L_serialise_0_s29 = CONS( int_65 , L_serialise_0_s28);
    private static final Compound L_serialise_0_s30 = CONS( int_87 , L_serialise_0_s29);
    private static final Compound L_serialise_0_s31 = CONS( int_32 , L_serialise_0_s30);
    private static final Compound L_serialise_0_s32 = CONS( int_69 , L_serialise_0_s31);
    private static final Compound L_serialise_0_s33 = CONS( int_76 , L_serialise_0_s32);
    private static final Compound L_serialise_0_s34 = CONS( int_66 , L_serialise_0_s33);
    private static final Compound L_serialise_0_s35 = CONS( int_65 , L_serialise_0_s34);




    public static Operation PRED_serialise_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // serialise:-serialise([65,66,76,69,32,87,65,83,32,73,32,69,82,69,32,73,32,83,65,87,32,69,76,66,65],A)
        m.setB0();
    // serialise:-[serialise([65,66,76,69,32,87,65,83,32,73,32,69,82,69,32,73,32,83,65,87,32,69,76,66,65],A)]
        return //
 Op("serialise", FILE_serialise::PRED_serialise_2_static_exec, VA(L_serialise_0_s35, m.DONT_CARE2()), cont);
    }
/** PREDICATE: serialise/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/serialise.pl
*/
    // main(serialise/2,public)




    public static Operation PRED_serialise_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // serialise(A,B):-pairlists(A,B,C),arrange(C,D),numbered(D,1,E)
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
    // serialise(A,B):-[pairlists(A,B,C),arrange(C,D),numbered(D,1,E)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        return //
 Op("pairlists", FILE_serialise::PRED_pairlists_3_static_exec, VA(a1, a2, a3), //
 Op("arrange", FILE_serialise::PRED_arrange_2_static_exec, VA(a3, a4), //
 Op("numbered", FILE_serialise::PRED_numbered_3_static_exec, VA(a4,  int_1 , m.DONT_CARE2()), cont)));
    }
/** PREDICATE: pairlists/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/serialise.pl
*/
    // main(pairlists/3,public)
        final static Functor FUNCTOR_pair_2 = F("pair",2);




    public static Operation PRED_pairlists_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return pairlists_3_top(m);
    }

    private final static Operation pairlists_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_serialise::pairlists_3_var, fail_0, fail_0, FILE_serialise::pairlists_3_2, fail_0, FILE_serialise::pairlists_3_1); 
    }

    private final static Operation pairlists_3_var(Prolog m) { 
        m.jtry3(null, FILE_serialise::pairlists_3_var_1);
        return pairlists_3_1(m);
    }

    private final static Operation pairlists_3_var_1(Prolog m) { 
        m.trust(null);
        return pairlists_3_2(m);
    }

    private final static Operation pairlists_3_1(Prolog m) { 
    // pairlists([A|B],[C|D],[pair(A,C)|E]):-pairlists(B,D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // pairlists([A|B],[C|D],[pair(A,C)|E]):-[pairlists(B,D,E)]
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
        a3 = a3.dref();
        if (a3 .isCons()){
                        a8 = a3.car();
            a9 = a3.cdr();
        } else if (a3.isVar()){
            a8 = m.mkvar2();
            a9 = m.mkvar2();
             a3.bind(CONS(a8, a9), m.trail);
        } else {
            return m.fail();
        }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_pair_2 , m.trail, a4, a6)){
                return m.fail();
            }
        m.AREGS[0] = a5;
        m.AREGS[1] = a7;
        m.AREGS[2] = a9;
m.cont = cont;
        return pairlists_3_top(m);
    }

    private final static Operation pairlists_3_2(Prolog m) { 
    // pairlists([],[],[]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // pairlists([],[],[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: arrange/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/serialise.pl
*/
    // main(arrange/2,public)
        final static Functor FUNCTOR_tree_3 = F("tree",3);
        final static Functor ATOM_void = SYM("void");




    public static Operation PRED_arrange_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_serialise::arrange_2_var, fail_0, fail_0, FILE_serialise::arrange_2_2, fail_0, FILE_serialise::arrange_2_1); 
    }

    private final static Operation arrange_2_var(Prolog m) { 
        m.jtry2(null, FILE_serialise::arrange_2_var_1);
        return arrange_2_1(m);
    }

    private final static Operation arrange_2_var_1(Prolog m) { 
        m.trust(null);
        return arrange_2_2(m);
    }

    private final static Operation arrange_2_1(Prolog m) { 
    // arrange([A|B],tree(C,A,D)):-split(B,A,E,F),arrange(E,C),arrange(F,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // arrange([A|B],tree(C,A,D)):-[split(B,A,E,F),arrange(E,C),arrange(F,D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
            a4 = a1.cdr();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
            a4 = m.mkvar2();
             a1.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_tree_3 , m.trail, a5, a3, a6)){
                return m.fail();
            }
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        return //
 Op("split", FILE_serialise::PRED_split_4_static_exec, VA(a4, a3, a7, a8), //
 Op("arrange", FILE_serialise::PRED_arrange_2_static_exec, VA(a7, a5), //
 Op("arrange", FILE_serialise::PRED_arrange_2_static_exec, VA(a8, a6), cont)));
    }

    private final static Operation arrange_2_2(Prolog m) { 
    // arrange([],void):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // arrange([],void):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_void .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: split/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/serialise.pl
*/
    // main(split/4,public)




    public static Operation PRED_split_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return split_4_top(m);
    }

    private final static Operation split_4_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_serialise::split_4_var, fail_0, fail_0, FILE_serialise::split_4_4, fail_0, FILE_serialise::split_4_lis); 
    }

    private final static Operation split_4_var(Prolog m) { 
        m.jtry4(null, FILE_serialise::split_4_var_1);
        return split_4_1(m);
    }

    private final static Operation split_4_var_1(Prolog m) { 
        m.retry(null, FILE_serialise::split_4_var_2);
        return split_4_2(m);
    }

    private final static Operation split_4_var_2(Prolog m) { 
        m.retry(null, FILE_serialise::split_4_var_3);
        return split_4_3(m);
    }

    private final static Operation split_4_var_3(Prolog m) { 
        m.trust(null);
        return split_4_4(m);
    }

    private final static Operation split_4_lis(Prolog m) { 
        m.jtry4(null, FILE_serialise::split_4_lis_1);
        return split_4_1(m);
    }

    private final static Operation split_4_lis_1(Prolog m) { 
        m.retry(null, FILE_serialise::split_4_lis_2);
        return split_4_2(m);
    }

    private final static Operation split_4_lis_2(Prolog m) { 
        m.trust(null);
        return split_4_3(m);
    }

    private final static Operation split_4_1(Prolog m) { 
    // split([A|B],A,C,D):-!,split(B,A,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // split([A|B],A,C,D):-['$neck_cut',split(B,A,C,D)]
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
        if (! a5.unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a6;
        m.AREGS[1] = a5;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
m.cont = cont;
        return split_4_top(m);
    }

    private final static Operation split_4_2(Prolog m) { 
    // split([A|B],C,[A|D],E):-before(A,C),!,split(B,C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // split([A|B],C,[A|D],E):-['$get_level'(F),before(A,C),'$cut'(F),split(B,C,D,E)]
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
        return //
 Op("before", FILE_serialise::PRED_before_2_static_exec, VA(a5, a2), //
 Op("$cut", FILE_serialise::PRED_$cut_1_static_exec, VA(a8), //
 Op("split", FILE_serialise::PRED_split_4_static_exec, VA(a6, a2, a7, a4), cont)));
    }

    private final static Operation split_4_3(Prolog m) { 
    // split([A|B],C,D,[A|E]):-before(C,A),!,split(B,C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // split([A|B],C,D,[A|E]):-['$get_level'(F),before(C,A),'$cut'(F),split(B,C,D,E)]
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
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("before", FILE_serialise::PRED_before_2_static_exec, VA(a2, a5), //
 Op("$cut", FILE_serialise::PRED_$cut_1_static_exec, VA(a8), //
 Op("split", FILE_serialise::PRED_split_4_static_exec, VA(a6, a2, a3, a7), cont)));
    }

    private final static Operation split_4_4(Prolog m) { 
    // split([],A,[],[]):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // split([],A,[],[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a4, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: before/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/serialise.pl
*/
    // main(before/2,public)




    public static Operation PRED_before_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // before(pair(A,B),pair(C,D)):-A<C
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
    // before(pair(A,B),pair(C,D)):-['$less_than'(A,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_pair_2 , m.trail, a3, m.DONT_CARE1())){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_pair_2 , m.trail, a4, m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $less_than(a(3),a(4))
        if (Arithmetic.evaluate(a3).arithCompareTo(Arithmetic.evaluate(a4)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: numbered/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/serialise.pl
*/
    // main(numbered/3,public)
        final static Functor FUNCTOR_$002B_2 = F("+",2);




    public static Operation PRED_numbered_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return numbered_3_top(m);
    }

    private final static Operation numbered_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_serialise::numbered_3_var, fail_0, fail_0, FILE_serialise::numbered_3_2, FILE_serialise::numbered_3_1, fail_0); 
    }

    private final static Operation numbered_3_var(Prolog m) { 
        m.jtry3(null, FILE_serialise::numbered_3_var_1);
        return numbered_3_1(m);
    }

    private final static Operation numbered_3_var_1(Prolog m) { 
        m.trust(null);
        return numbered_3_2(m);
    }

    private final static Operation numbered_3_1(Prolog m) { 
    // numbered(tree(A,pair(B,C),D),E,F):-numbered(A,E,C),G is C+1,numbered(D,G,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // numbered(tree(A,pair(B,C),D),E,F):-[numbered(A,E,C),G is C+1,numbered(D,G,F)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_tree_3 , m.trail, a4, a5, a6)){
                return m.fail();
            }
        a5 = a5.dref();
            a7 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_pair_2 , m.trail, m.DONT_CARE1(), a7)){
                return m.fail();
            }
        a8 = m.mkvar1();
    // put_str_args([a(7),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(9))
        a9 =  S( FUNCTOR_$002B_2 , a7,  int_1 );
 ;
        p2 = //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a8, a9), //
 Op("numbered", FILE_serialise::PRED_numbered_3_static_exec, VA(a6, a8, a3), cont));
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a7;
        m.cont = p2;
        return numbered_3_top(m);
    }

    private final static Operation numbered_3_2(Prolog m) { 
    // numbered(void,A,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // numbered(void,A,A):-[]
        if (!  ATOM_void .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_serialise::PRED_top_0_static_exec);
   PredTable.registerBuiltin("serialise",0,FILE_serialise::PRED_serialise_0_static_exec);
   PredTable.registerBuiltin("serialise",2,FILE_serialise::PRED_serialise_2_static_exec);
   PredTable.registerBuiltin("pairlists",3,FILE_serialise::PRED_pairlists_3_static_exec);
   PredTable.registerBuiltin("arrange",2,FILE_serialise::PRED_arrange_2_static_exec);
   PredTable.registerBuiltin("split",4,FILE_serialise::PRED_split_4_static_exec);
   PredTable.registerBuiltin("before",2,FILE_serialise::PRED_before_2_static_exec);
   PredTable.registerBuiltin("numbered",3,FILE_serialise::PRED_numbered_3_static_exec);
}
}

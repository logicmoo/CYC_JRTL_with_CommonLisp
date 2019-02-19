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
public class FILE_boyer extends FILE_system {
/** PREDICATE: go/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(go/0,public)
        final static Functor ATOM_runtime = SYM("runtime");
        final static Functor ATOM_execution$0020time$0020is$0020 = SYM("execution time is ");
        final static Functor ATOM_$0020milliseconds = SYM(" milliseconds");




    public static Operation PRED_go_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // go:-statistics(runtime,[A,B]),wff(C),rewrite(C,D),tautology(D,[],[]),statistics(runtime,[E,F]),write('execution time is '),write(F),write(' milliseconds')
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3, p4, p5, p6, p7;
    // go:-[statistics(runtime,[A,B]),wff(C),rewrite(C,D),tautology(D,[],[]),statistics(runtime,[E,F]),write('execution time is '),write(F),write(' milliseconds')]
        a1 = CONS(m.DONT_CARE1(),  Prolog.Nil );
        a2 = CONS(m.DONT_CARE1(), a1);
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = CONS(a5,  Prolog.Nil );
        a7 = CONS(m.DONT_CARE1(), a6);
        return //
 Op("statistics", FILE_boyer::PRED_statistics_2_static_exec, VA( ATOM_runtime , a2), //
 Op("wff", FILE_boyer::PRED_wff_1_static_exec, VA(a3), //
 Op("rewrite", FILE_boyer::PRED_rewrite_2_static_exec, VA(a3, a4), //
 Op("tautology", FILE_boyer::PRED_tautology_3_static_exec, VA(a4,  Prolog.Nil ,  Prolog.Nil ), //
 Op("statistics", FILE_boyer::PRED_statistics_2_static_exec, VA( ATOM_runtime , a7), //
 Op("write", FILE_boyer::PRED_write_1_static_exec, VA( ATOM_execution$0020time$0020is$0020 ), //
 Op("write", FILE_boyer::PRED_write_1_static_exec, VA(a5), //
 Op("write", FILE_boyer::PRED_write_1_static_exec, VA( ATOM_$0020milliseconds ), cont))))))));
    }
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(top/0,public)




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-wff(A),rewrite(A,B),tautology(B,[],[])
        m.setB0();
         Term a1, a2;
        Operation p1, p2;
    // top:-[wff(A),rewrite(A,B),tautology(B,[],[])]
        a1 = m.mkvar1();
        a2 = m.mkvar1();
        return //
 Op("wff", FILE_boyer::PRED_wff_1_static_exec, VA(a1), //
 Op("rewrite", FILE_boyer::PRED_rewrite_2_static_exec, VA(a1, a2), //
 Op("tautology", FILE_boyer::PRED_tautology_3_static_exec, VA(a2,  Prolog.Nil ,  Prolog.Nil ), cont)));
    }
/** PREDICATE: wff/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(wff/1,public)
        final static Functor FUNCTOR_implies_2 = F("implies",2);
        final static Functor FUNCTOR_and_2 = F("and",2);
        final static Functor FUNCTOR_f_1 = F("f",1);
        final static Functor FUNCTOR_myplus_2 = F("myplus",2);
        final static Functor ATOM_a = SYM("a");
        final static Functor ATOM_b = SYM("b");
    private static final Compound L_wff_1_s8 = S( FUNCTOR_myplus_2 ,  ATOM_a ,  ATOM_b );
        final static Functor ATOM_c = SYM("c");
        final static Functor ATOM_zero = SYM("zero");
    private static final Compound L_wff_1_s12 = S( FUNCTOR_myplus_2 ,  ATOM_c ,  ATOM_zero );
    private static final Compound L_wff_1_s14 = S( FUNCTOR_myplus_2 , L_wff_1_s8, L_wff_1_s12);
    private static final Compound L_wff_1_s16 = S( FUNCTOR_f_1 , L_wff_1_s14);
        final static Functor FUNCTOR_times_2 = F("times",2);
    private static final Compound L_wff_1_s18 = S( FUNCTOR_times_2 ,  ATOM_a ,  ATOM_b );
        final static Functor ATOM_d = SYM("d");
    private static final Compound L_wff_1_s21 = S( FUNCTOR_myplus_2 ,  ATOM_c ,  ATOM_d );
    private static final Compound L_wff_1_s23 = S( FUNCTOR_times_2 , L_wff_1_s18, L_wff_1_s21);
    private static final Compound L_wff_1_s25 = S( FUNCTOR_f_1 , L_wff_1_s23);
        final static Functor FUNCTOR_reverse_1 = F("reverse",1);
        final static Functor FUNCTOR_append_2 = F("append",2);
    private static final Compound L_wff_1_s28 = S( FUNCTOR_append_2 ,  ATOM_a ,  ATOM_b );
    private static final Compound L_wff_1_s31 = S( FUNCTOR_append_2 , L_wff_1_s28,  Prolog.Nil );
    private static final Compound L_wff_1_s33 = S( FUNCTOR_reverse_1 , L_wff_1_s31);
    private static final Compound L_wff_1_s35 = S( FUNCTOR_f_1 , L_wff_1_s33);
        final static Functor FUNCTOR_equal_2 = F("equal",2);
        final static Functor FUNCTOR_boyer_difference_2 = F("boyer_difference",2);
        final static Functor ATOM_x = SYM("x");
        final static Functor ATOM_y = SYM("y");
    private static final Compound L_wff_1_s41 = S( FUNCTOR_boyer_difference_2 ,  ATOM_x ,  ATOM_y );
    private static final Compound L_wff_1_s43 = S( FUNCTOR_equal_2 , L_wff_1_s8, L_wff_1_s41);
        final static Functor FUNCTOR_lessp_2 = F("lessp",2);
        final static Functor FUNCTOR_remainder_2 = F("remainder",2);
    private static final Compound L_wff_1_s46 = S( FUNCTOR_remainder_2 ,  ATOM_a ,  ATOM_b );
        final static Functor FUNCTOR_boyer_member_2 = F("boyer_member",2);
        final static Functor FUNCTOR_length_1 = F("length",1);
    private static final Compound L_wff_1_s50 = S( FUNCTOR_length_1 ,  ATOM_b );
    private static final Compound L_wff_1_s52 = S( FUNCTOR_boyer_member_2 ,  ATOM_a , L_wff_1_s50);
    private static final Compound L_wff_1_s54 = S( FUNCTOR_lessp_2 , L_wff_1_s46, L_wff_1_s52);




    public static Operation PRED_wff_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // wff(implies(and(implies(A,B),and(implies(B,C),and(implies(C,D),implies(D,E)))),implies(A,E))):-A=f(myplus(myplus(a,b),myplus(c,zero))),B=f(times(times(a,b),myplus(c,d))),C=f(reverse(append(append(a,b),[]))),D=equal(myplus(a,b),boyer_difference(x,y)),E=lessp(remainder(a,b),boyer_member(a,length(b)))
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        a1 = LARG[0];
    // wff(implies(and(implies(A,B),and(implies(B,C),and(implies(C,D),implies(D,E)))),implies(A,E))):-['$unify'(A,f(myplus(myplus(a,b),myplus(c,zero)))),'$unify'(B,f(times(times(a,b),myplus(c,d)))),'$unify'(C,f(reverse(append(append(a,b),[])))),'$unify'(D,equal(myplus(a,b),boyer_difference(x,y))),'$unify'(E,lessp(remainder(a,b),boyer_member(a,length(b))))]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_implies_2 , m.trail, a2, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_and_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a4 = a4.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_implies_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a5 = a5.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_and_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a8 = a8.dref();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_implies_2 , m.trail, a7, a10)){
                return m.fail();
            }
        a9 = a9.dref();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_and_2 , m.trail, a11, a12)){
                return m.fail();
            }
        a11 = a11.dref();
            a13 = m.mkvar2();
            if (!a11.unifyS( FUNCTOR_implies_2 , m.trail, a10, a13)){
                return m.fail();
            }
        a12 = a12.dref();
            a14 = m.mkvar2();
            if (!a12.unifyS( FUNCTOR_implies_2 , m.trail, a13, a14)){
                return m.fail();
            }
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_implies_2 , m.trail, a6, a14)){
                return m.fail();
            }
        //START inline expansion of $unify(a(6),s(16))
        if (! a6.unify(L_wff_1_s16, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(7),s(25))
        if (! a7.unify(L_wff_1_s25, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(10),s(35))
        if (! a10.unify(L_wff_1_s35, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(13),s(43))
        if (! a13.unify(L_wff_1_s43, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(14),s(54))
        if (! a14.unify(L_wff_1_s54, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: tautology/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(tautology/1,public)




    public static Operation PRED_tautology_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // tautology(A):-rewrite(A,B),tautology(B,[],[])
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // tautology(A):-[rewrite(A,B),tautology(B,[],[])]
        a2 = m.mkvar1();
        return //
 Op("rewrite", FILE_boyer::PRED_rewrite_2_static_exec, VA(a1, a2), //
 Op("tautology", FILE_boyer::PRED_tautology_3_static_exec, VA(a2,  Prolog.Nil ,  Prolog.Nil ), cont));
    }
/** PREDICATE: $dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_boyer::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_sub_1);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_1(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_sub_1(Prolog m) { 
        m.retry(null, FILE_boyer::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_sub_2);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_2(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_3(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_1(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F):-truep(A,B),!,true
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
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F):-['$get_level'(G),truep(A,B),'$cut'(G)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("truep", FILE_boyer::PRED_truep_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_boyer::PRED_$cut_1_static_exec, VA(a7), cont));
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_2(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F):-'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F):-['$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,C)]
        return //
 Op("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl", FILE_boyer::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_2_static_exec, VA(a1, a3), cont);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_3(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F):-'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F):-['$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F)]
        return //
 Op("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl", FILE_boyer::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_static_exec, VA(a1, a2, a3, a4, a5, a6), cont);
    }
/** PREDICATE: $dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main('$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'/2,public)




    public static Operation PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_boyer::$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_2_sub_1);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_2_1(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_2_2(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_2_1(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B):-falsep(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B):-['$get_level'(C),falsep(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("falsep", FILE_boyer::PRED_falsep_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_boyer::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_2_2(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main('$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'/5,public)

    // private final Term arg5;




    public static Operation PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_boyer::$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_sub_1);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_1(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_sub_1(Prolog m) { 
        m.retry(null, FILE_boyer::$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_sub_2);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_2(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_3(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_1(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E):-truep(C,A),!,tautology(D,A,B)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E):-['$get_level'(F),truep(C,A),'$cut'(F),tautology(D,A,B)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("truep", FILE_boyer::PRED_truep_2_static_exec, VA(a3, a1), //
 Op("$cut", FILE_boyer::PRED_$cut_1_static_exec, VA(a6), //
 Op("tautology", FILE_boyer::PRED_tautology_3_static_exec, VA(a4, a1, a2), cont)));
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_2(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E):-'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,E)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E):-['$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,E)]
        return //
 Op("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl", FILE_boyer::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_4_static_exec, VA(a1, a2, a3, a5), cont);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_3(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E):-tautology(D,[C|A],B),tautology(E,A,[C|B])
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E):-[tautology(D,[C|A],B),tautology(E,A,[C|B])]
        a6 = CONS(a3, a1);
        a7 = CONS(a3, a2);
        return //
 Op("tautology", FILE_boyer::PRED_tautology_3_static_exec, VA(a4, a6, a2), //
 Op("tautology", FILE_boyer::PRED_tautology_3_static_exec, VA(a5, a1, a7), cont));
    }
/** PREDICATE: $dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main('$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'/4,public)




    public static Operation PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_boyer::$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_4_sub_1);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_4_1(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_4_2(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_4_1(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D):-falsep(C,B),!,tautology(D,A,B)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D):-['$get_level'(E),falsep(C,B),'$cut'(E),tautology(D,A,B)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("falsep", FILE_boyer::PRED_falsep_2_static_exec, VA(a3, a2), //
 Op("$cut", FILE_boyer::PRED_$cut_1_static_exec, VA(a5), //
 Op("tautology", FILE_boyer::PRED_tautology_3_static_exec, VA(a4, a1, a2), cont)));
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_4_2(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D):-fail
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main('$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'/6,public)
        final static Functor FUNCTOR_if_3 = F("if",3);

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_boyer::$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_sub_1);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_1(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_2(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_1(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F):-A=if(D,E,F),!,'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F):-['$get_level'(G),'$unify'(A,if(D,E,F)),'$cut'(G),'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(B,C,D,E,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(4),a(5),a(6)],y(1)),put_str(@('FUNCTOR_if_3'),y(1),a(8))
        a8 =  S( FUNCTOR_if_3 , a4, a5, a6);
 ;
        //START inline expansion of $unify(a(1),a(8))
        if (! a1.unify(a8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        return //
 Op("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl", FILE_boyer::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_static_exec, VA(a2, a3, a4, a5, a6), cont);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_2(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F):-fail
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: tautology/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(tautology/3,public)




    public static Operation PRED_tautology_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // tautology(A,B,C):-'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,D,E,F),!
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // tautology(A,B,C):-['$get_level'(D),'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C,E,F,G),'$cut'(D)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl", FILE_boyer::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_static_exec, VA(a1, a2, a3, m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2()), //
 Op("$cut", FILE_boyer::PRED_$cut_1_static_exec, VA(a4), cont));
    }
/** PREDICATE: rewrite/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(rewrite/2,public)




    public static Operation PRED_rewrite_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_boyer::rewrite_2_sub_1);
        return rewrite_2_1(m);
    }

    private final static Operation rewrite_2_sub_1(Prolog m) { 
        m.trust(null);
        return rewrite_2_2(m);
    }

    private final static Operation rewrite_2_1(Prolog m) { 
    // rewrite(A,A):-atomic(A),!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // rewrite(A,A):-['$get_level'(B),atomic(A),'$cut'(B)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation rewrite_2_2(Prolog m) { 
    // rewrite(A,B):-functor(A,C,D),functor(E,C,D),rewrite_args(D,A,E),'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(B,E,F),!
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // rewrite(A,B):-['$get_level'(C),functor(A,D,E),functor(F,D,E),rewrite_args(E,A,F),'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(B,F,G),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        return //
 Op("functor", FILE_boyer::PRED_functor_3_static_exec, VA(a1, a4, a5), //
 Op("functor", FILE_boyer::PRED_functor_3_static_exec, VA(a6, a4, a5), //
 Op("rewrite_args", FILE_boyer::PRED_rewrite_args_3_static_exec, VA(a5, a1, a6), //
 Op("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl", FILE_boyer::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_3_static_exec, VA(a2, a6, m.DONT_CARE2()), //
 Op("$cut", FILE_boyer::PRED_$cut_1_static_exec, VA(a3), cont)))));
    }
/** PREDICATE: $dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main('$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'/3,public)




    public static Operation PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_boyer::$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_3_sub_1);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_3_1(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_3_2(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_3_1(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C):-equal(B,C),rewrite(C,A)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C):-[equal(B,C),rewrite(C,A)]
        return //
 Op("equal", FILE_boyer::PRED_equal_2_static_exec, VA(a2, a3), //
 Op("rewrite", FILE_boyer::PRED_rewrite_2_static_exec, VA(a3, a1), cont));
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_3_2(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C):-A=B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl'(A,B,C):-['$unify'(A,B)]
        //START inline expansion of $unify(a(1),a(2))
        if (! a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: rewrite_args/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(rewrite_args/3,public)
        final static Functor FUNCTOR_$002D_2 = F("-",2);




    public static Operation PRED_rewrite_args_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::rewrite_args_3_var, FILE_boyer::rewrite_args_3_var, FILE_boyer::rewrite_args_3_2, FILE_boyer::rewrite_args_3_2, FILE_boyer::rewrite_args_3_2, FILE_boyer::rewrite_args_3_2); 
    }

    private final static Operation rewrite_args_3_var(Prolog m) { 
        m.jtry3(null, FILE_boyer::rewrite_args_3_var_1);
        return rewrite_args_3_1(m);
    }

    private final static Operation rewrite_args_3_var_1(Prolog m) { 
        m.trust(null);
        return rewrite_args_3_2(m);
    }

    private final static Operation rewrite_args_3_1(Prolog m) { 
    // rewrite_args(0,A,B):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // rewrite_args(0,A,B):-['$neck_cut']
        if (!  int_0 .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation rewrite_args_3_2(Prolog m) { 
    // rewrite_args(A,B,C):-arg(A,B,D),arg(A,C,E),rewrite(D,E),F is A-1,rewrite_args(F,B,C)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // rewrite_args(A,B,C):-[arg(A,B,D),arg(A,C,E),rewrite(D,E),F is A-1,rewrite_args(F,B,C)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(7))
        a7 =  S( FUNCTOR_$002D_2 , a1,  int_1 );
 ;
        return //
 Op("arg", FILE_boyer::PRED_arg_3_static_exec, VA(a1, a2, a4), //
 Op("arg", FILE_boyer::PRED_arg_3_static_exec, VA(a1, a3, a5), //
 Op("rewrite", FILE_boyer::PRED_rewrite_2_static_exec, VA(a4, a5), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a6, a7), //
 Op("rewrite_args", FILE_boyer::PRED_rewrite_args_3_static_exec, VA(a6, a2, a3), cont)))));
    }
/** PREDICATE: truep/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(truep/2,public)
        final static Functor ATOM_t = SYM("t");




    public static Operation PRED_truep_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::truep_2_var, FILE_boyer::truep_2_2, FILE_boyer::truep_2_2, FILE_boyer::truep_2_var, FILE_boyer::truep_2_2, FILE_boyer::truep_2_2); 
    }

    private final static Operation truep_2_var(Prolog m) { 
        m.jtry2(null, FILE_boyer::truep_2_var_1);
        return truep_2_1(m);
    }

    private final static Operation truep_2_var_1(Prolog m) { 
        m.trust(null);
        return truep_2_2(m);
    }

    private final static Operation truep_2_1(Prolog m) { 
    // truep(t,A):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // truep(t,A):-['$neck_cut']
        if (!  ATOM_t .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation truep_2_2(Prolog m) { 
    // truep(A,B):-boyer_member(A,B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // truep(A,B):-[boyer_member(A,B)]
        return //
 Op("boyer_member", FILE_boyer::PRED_boyer_member_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: falsep/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(falsep/2,public)
        final static Functor ATOM_f = SYM("f");




    public static Operation PRED_falsep_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::falsep_2_var, FILE_boyer::falsep_2_2, FILE_boyer::falsep_2_2, FILE_boyer::falsep_2_var, FILE_boyer::falsep_2_2, FILE_boyer::falsep_2_2); 
    }

    private final static Operation falsep_2_var(Prolog m) { 
        m.jtry2(null, FILE_boyer::falsep_2_var_1);
        return falsep_2_1(m);
    }

    private final static Operation falsep_2_var_1(Prolog m) { 
        m.trust(null);
        return falsep_2_2(m);
    }

    private final static Operation falsep_2_1(Prolog m) { 
    // falsep(f,A):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // falsep(f,A):-['$neck_cut']
        if (!  ATOM_f .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation falsep_2_2(Prolog m) { 
    // falsep(A,B):-boyer_member(A,B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // falsep(A,B):-[boyer_member(A,B)]
        return //
 Op("boyer_member", FILE_boyer::PRED_boyer_member_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: boyer_member/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(boyer_member/2,public)




    public static Operation PRED_boyer_member_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return boyer_member_2_top(m);
    }

    private final static Operation boyer_member_2_top(Prolog m) { 
        m.setB0();
        m.jtry2(null, FILE_boyer::boyer_member_2_sub_1);
        return boyer_member_2_1(m);
    }

    private final static Operation boyer_member_2_sub_1(Prolog m) { 
        m.trust(null);
        return boyer_member_2_2(m);
    }

    private final static Operation boyer_member_2_1(Prolog m) { 
    // boyer_member(A,[A|B]):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // boyer_member(A,[A|B]):-['$neck_cut']
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a1.unify(a2.car(), m.trail))
                return m.fail();
        } else if (a2.isVar()){
             a2.bind(CONS(a1, m.DONTCARE("cons(a(2))")), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation boyer_member_2_2(Prolog m) { 
    // boyer_member(A,[B|C]):-boyer_member(A,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // boyer_member(A,[B|C]):-[boyer_member(A,C)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a3 = a2.cdr();
        } else if (a2.isVar()){
            a3 = m.mkvar2();
             a2.bind(CONS(m.DONTCARE("cons(a(2))"), a3), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a1;
        m.AREGS[1] = a3;
m.cont = cont;
        return boyer_member_2_top(m);
    }
/** PREDICATE: equal/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(equal/2,public)
        final static Functor FUNCTOR_assignment_2 = F("assignment",2);
        final static Functor FUNCTOR_assignedp_2 = F("assignedp",2);
        final static Functor FUNCTOR_assume_false_2 = F("assume_false",2);
        final static Functor FUNCTOR_cons_2 = F("cons",2);
        final static Functor FUNCTOR_assume_true_2 = F("assume_true",2);
        final static Functor FUNCTOR_boolean_1 = F("boolean",1);
        final static Functor FUNCTOR_or_2 = F("or",2);
        final static Functor FUNCTOR_car_1 = F("car",1);
        final static Functor FUNCTOR_gopher_1 = F("gopher",1);
        final static Functor FUNCTOR_listp_1 = F("listp",1);
        final static Functor FUNCTOR_flatten_1 = F("flatten",1);
        final static Functor FUNCTOR_compile_1 = F("compile",1);
        final static Functor FUNCTOR_codegen_2 = F("codegen",2);
        final static Functor FUNCTOR_optimize_1 = F("optimize",1);
        final static Functor FUNCTOR_count_list_2 = F("count_list",2);
        final static Functor FUNCTOR_sort_lp_2 = F("sort_lp",2);
        final static Functor FUNCTOR_countps__2 = F("countps_",2);
        final static Functor FUNCTOR_countps_loop_3 = F("countps_loop",3);
        final static Functor FUNCTOR_divides_2 = F("divides",2);
        final static Functor FUNCTOR_zerop_1 = F("zerop",1);
        final static Functor FUNCTOR_dsort_1 = F("dsort",1);
        final static Functor FUNCTOR_sort2_1 = F("sort2",1);
        final static Functor FUNCTOR_eqp_2 = F("eqp",2);
        final static Functor FUNCTOR_fix_1 = F("fix",1);
        final static Functor FUNCTOR_even1_1 = F("even1",1);
        final static Functor FUNCTOR_odd_1 = F("odd",1);
        final static Functor FUNCTOR_decr_1 = F("decr",1);
        final static Functor FUNCTOR_exec_3 = F("exec",3);
        final static Functor FUNCTOR_exp_2 = F("exp",2);
        final static Functor FUNCTOR_fact__1 = F("fact_",1);
        final static Functor FUNCTOR_fact_loop_2 = F("fact_loop",2);
        final static Functor FUNCTOR_falsify_1 = F("falsify",1);
        final static Functor FUNCTOR_falsify1_2 = F("falsify1",2);
        final static Functor FUNCTOR_normalize_1 = F("normalize",1);
        final static Functor FUNCTOR_numberp_1 = F("numberp",1);
        final static Functor FUNCTOR_cdr_1 = F("cdr",1);
    private static final Compound L_equal_2_s51 = S( FUNCTOR_cons_2 ,  ATOM_zero ,  Prolog.Nil );
        final static Functor FUNCTOR_gcd_2 = F("gcd",2);
        final static Functor FUNCTOR_get_2 = F("get",2);
        final static Functor FUNCTOR_set_3 = F("set",3);
        final static Functor FUNCTOR_greatereqp_2 = F("greatereqp",2);
        final static Functor FUNCTOR_not_1 = F("not",1);
        final static Functor FUNCTOR_greatereqpr_2 = F("greatereqpr",2);
        final static Functor FUNCTOR_greaterp_2 = F("greaterp",2);
        final static Functor FUNCTOR_iff_2 = F("iff",2);
        final static Functor FUNCTOR_last_1 = F("last",1);
        final static Functor FUNCTOR_cons_1 = F("cons",1);
        final static Functor FUNCTOR_lesseqp_2 = F("lesseqp",2);
        final static Functor FUNCTOR_mc_flatten_2 = F("mc_flatten",2);
        final static Functor FUNCTOR_meaning_2 = F("meaning",2);
        final static Functor FUNCTOR_nth_2 = F("nth",2);
        final static Functor FUNCTOR_greatest_factor_2 = F("greatest_factor",2);
        final static Functor FUNCTOR_if_4 = F("if",4);
        final static Functor FUNCTOR_power_eval_2 = F("power_eval",2);
        final static Functor FUNCTOR_prime_1 = F("prime",1);
        final static Functor FUNCTOR_add1_1 = F("add1",1);
    private static final Compound L_equal_2_s76 = S( FUNCTOR_add1_1 ,  ATOM_zero );
        final static Functor FUNCTOR_prime1_2 = F("prime1",2);
        final static Functor FUNCTOR_prime_list_1 = F("prime_list",1);
        final static Functor FUNCTOR_quotient_2 = F("quotient",2);
        final static Functor FUNCTOR_reverse__1 = F("reverse_",1);
        final static Functor FUNCTOR_reverse_loop_2 = F("reverse_loop",2);
        final static Functor FUNCTOR_samefringe_2 = F("samefringe",2);
        final static Functor FUNCTOR_sigma_2 = F("sigma",2);
        final static Functor FUNCTOR_delete_2 = F("delete",2);
        final static Functor FUNCTOR_tautology_checker_1 = F("tautology_checker",1);
        final static Functor FUNCTOR_tautologyp_2 = F("tautologyp",2);
        final static Functor FUNCTOR_times_list_1 = F("times_list",1);
        final static Functor FUNCTOR_value_2 = F("value",2);




    public static Operation PRED_equal_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::equal_2_var, fail_0, fail_0, fail_0, FILE_boyer::equal_2_var, fail_0); 
    }

    private final static Operation equal_2_var(Prolog m) { 
        m.jtry2(null, FILE_boyer::equal_2_var_1);
        return equal_2_1(m);
    }

    private final static Operation equal_2_var_1(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_2);
        return equal_2_2(m);
    }

    private final static Operation equal_2_var_2(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_3);
        return equal_2_3(m);
    }

    private final static Operation equal_2_var_3(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_4);
        return equal_2_4(m);
    }

    private final static Operation equal_2_var_4(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_5);
        return equal_2_5(m);
    }

    private final static Operation equal_2_var_5(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_6);
        return equal_2_6(m);
    }

    private final static Operation equal_2_var_6(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_7);
        return equal_2_7(m);
    }

    private final static Operation equal_2_var_7(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_8);
        return equal_2_8(m);
    }

    private final static Operation equal_2_var_8(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_9);
        return equal_2_9(m);
    }

    private final static Operation equal_2_var_9(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_10);
        return equal_2_10(m);
    }

    private final static Operation equal_2_var_10(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_11);
        return equal_2_11(m);
    }

    private final static Operation equal_2_var_11(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_12);
        return equal_2_12(m);
    }

    private final static Operation equal_2_var_12(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_13);
        return equal_2_13(m);
    }

    private final static Operation equal_2_var_13(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_14);
        return equal_2_14(m);
    }

    private final static Operation equal_2_var_14(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_15);
        return equal_2_15(m);
    }

    private final static Operation equal_2_var_15(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_16);
        return equal_2_16(m);
    }

    private final static Operation equal_2_var_16(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_17);
        return equal_2_17(m);
    }

    private final static Operation equal_2_var_17(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_18);
        return equal_2_18(m);
    }

    private final static Operation equal_2_var_18(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_19);
        return equal_2_19(m);
    }

    private final static Operation equal_2_var_19(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_20);
        return equal_2_20(m);
    }

    private final static Operation equal_2_var_20(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_21);
        return equal_2_21(m);
    }

    private final static Operation equal_2_var_21(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_22);
        return equal_2_22(m);
    }

    private final static Operation equal_2_var_22(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_23);
        return equal_2_23(m);
    }

    private final static Operation equal_2_var_23(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_24);
        return equal_2_24(m);
    }

    private final static Operation equal_2_var_24(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_25);
        return equal_2_25(m);
    }

    private final static Operation equal_2_var_25(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_26);
        return equal_2_26(m);
    }

    private final static Operation equal_2_var_26(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_27);
        return equal_2_27(m);
    }

    private final static Operation equal_2_var_27(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_28);
        return equal_2_28(m);
    }

    private final static Operation equal_2_var_28(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_29);
        return equal_2_29(m);
    }

    private final static Operation equal_2_var_29(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_30);
        return equal_2_30(m);
    }

    private final static Operation equal_2_var_30(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_31);
        return equal_2_31(m);
    }

    private final static Operation equal_2_var_31(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_32);
        return equal_2_32(m);
    }

    private final static Operation equal_2_var_32(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_33);
        return equal_2_33(m);
    }

    private final static Operation equal_2_var_33(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_34);
        return equal_2_34(m);
    }

    private final static Operation equal_2_var_34(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_35);
        return equal_2_35(m);
    }

    private final static Operation equal_2_var_35(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_36);
        return equal_2_36(m);
    }

    private final static Operation equal_2_var_36(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_37);
        return equal_2_37(m);
    }

    private final static Operation equal_2_var_37(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_38);
        return equal_2_38(m);
    }

    private final static Operation equal_2_var_38(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_39);
        return equal_2_39(m);
    }

    private final static Operation equal_2_var_39(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_40);
        return equal_2_40(m);
    }

    private final static Operation equal_2_var_40(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_41);
        return equal_2_41(m);
    }

    private final static Operation equal_2_var_41(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_42);
        return equal_2_42(m);
    }

    private final static Operation equal_2_var_42(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_43);
        return equal_2_43(m);
    }

    private final static Operation equal_2_var_43(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_44);
        return equal_2_44(m);
    }

    private final static Operation equal_2_var_44(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_45);
        return equal_2_45(m);
    }

    private final static Operation equal_2_var_45(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_46);
        return equal_2_46(m);
    }

    private final static Operation equal_2_var_46(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_47);
        return equal_2_47(m);
    }

    private final static Operation equal_2_var_47(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_48);
        return equal_2_48(m);
    }

    private final static Operation equal_2_var_48(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_49);
        return equal_2_49(m);
    }

    private final static Operation equal_2_var_49(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_50);
        return equal_2_50(m);
    }

    private final static Operation equal_2_var_50(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_51);
        return equal_2_51(m);
    }

    private final static Operation equal_2_var_51(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_52);
        return equal_2_52(m);
    }

    private final static Operation equal_2_var_52(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_53);
        return equal_2_53(m);
    }

    private final static Operation equal_2_var_53(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_54);
        return equal_2_54(m);
    }

    private final static Operation equal_2_var_54(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_55);
        return equal_2_55(m);
    }

    private final static Operation equal_2_var_55(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_56);
        return equal_2_56(m);
    }

    private final static Operation equal_2_var_56(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_57);
        return equal_2_57(m);
    }

    private final static Operation equal_2_var_57(Prolog m) { 
        m.retry(null, FILE_boyer::equal_2_var_58);
        return equal_2_58(m);
    }

    private final static Operation equal_2_var_58(Prolog m) { 
        m.trust(null);
        return equal_2_59(m);
    }

    private final static Operation equal_2_1(Prolog m) { 
    // equal(and(A,B),if(A,if(B,t,f),f)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(and(A,B),if(A,if(B,t,f),f)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_and_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_if_3 , m.trail, a3, a5,  ATOM_f )){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_if_3 , m.trail, a4,  ATOM_t ,  ATOM_f )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_2(Prolog m) { 
    // equal(append(append(A,B),C),append(A,append(B,C))):-true
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(append(append(A,B),C),append(A,append(B,C))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_append_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_append_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a2 = a2.dref();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_append_2 , m.trail, a5, a7)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_append_2 , m.trail, a6, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_3(Prolog m) { 
    // equal(assignment(A,append(B,C)),if(assignedp(A,B),assignment(A,B),assignment(A,C))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(assignment(A,append(B,C)),if(assignedp(A,B),assignment(A,B),assignment(A,C))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_assignment_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_append_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a2 = a2.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_if_3 , m.trail, a7, a8, a9)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_assignedp_2 , m.trail, a3, a5)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_assignment_2 , m.trail, a3, a5)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_assignment_2 , m.trail, a3, a6)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_4(Prolog m) { 
    // equal(assume_false(A,B),cons(cons(A,f),B)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(assume_false(A,B),cons(cons(A,f),B)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_assume_false_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_cons_2 , m.trail, a5, a4)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_cons_2 , m.trail, a3,  ATOM_f )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_5(Prolog m) { 
    // equal(assume_true(A,B),cons(cons(A,t),B)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(assume_true(A,B),cons(cons(A,t),B)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_assume_true_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_cons_2 , m.trail, a5, a4)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_cons_2 , m.trail, a3,  ATOM_t )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_6(Prolog m) { 
    // equal(boolean(A),or(equal(A,t),equal(A,f))):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(boolean(A),or(equal(A,t),equal(A,f))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_boolean_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_or_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_equal_2 , m.trail, a3,  ATOM_t )){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_equal_2 , m.trail, a3,  ATOM_f )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_7(Prolog m) { 
    // equal(car(gopher(A)),if(listp(A),car(flatten(A)),zero)):-true
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(car(gopher(A)),if(listp(A),car(flatten(A)),zero)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_car_1 , m.trail, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_gopher_1 , m.trail, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_if_3 , m.trail, a5, a6,  ATOM_zero )){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_listp_1 , m.trail, a4)){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_car_1 , m.trail, a7)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_flatten_1 , m.trail, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_8(Prolog m) { 
    // equal(compile(A),reverse(codegen(optimize(A),[]))):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(compile(A),reverse(codegen(optimize(A),[]))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_compile_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_reverse_1 , m.trail, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_codegen_2 , m.trail, a5,  Prolog.Nil )){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_optimize_1 , m.trail, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_9(Prolog m) { 
    // equal(count_list(A,sort_lp(B,C)),myplus(count_list(A,B),count_list(A,C))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(count_list(A,sort_lp(B,C)),myplus(count_list(A,B),count_list(A,C))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_count_list_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_sort_lp_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a2 = a2.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_myplus_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_count_list_2 , m.trail, a3, a5)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_count_list_2 , m.trail, a3, a6)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_10(Prolog m) { 
    // equal(countps_(A,B),countps_loop(A,B,zero)):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(countps_(A,B),countps_loop(A,B,zero)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_countps__2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_countps_loop_3 , m.trail, a3, a4,  ATOM_zero )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_11(Prolog m) { 
    // equal(boyer_difference(A,B),C):-boyer_difference(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(boyer_difference(A,B),C):-[boyer_difference(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_boyer_difference_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("boyer_difference", FILE_boyer::PRED_boyer_difference_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_12(Prolog m) { 
    // equal(divides(A,B),zerop(remainder(B,A))):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(divides(A,B),zerop(remainder(B,A))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_divides_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_zerop_1 , m.trail, a5)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_remainder_2 , m.trail, a4, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_13(Prolog m) { 
    // equal(dsort(A),sort2(A)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(dsort(A),sort2(A)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_dsort_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_sort2_1 , m.trail, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_14(Prolog m) { 
    // equal(eqp(A,B),equal(fix(A),fix(B))):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(eqp(A,B),equal(fix(A),fix(B))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_eqp_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_equal_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_fix_1 , m.trail, a3)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_fix_1 , m.trail, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_15(Prolog m) { 
    // equal(equal(A,B),C):-eq(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(equal(A,B),C):-[eq(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_equal_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("eq", FILE_boyer::PRED_eq_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_16(Prolog m) { 
    // equal(even1(A),if(zerop(A),t,odd(decr(A)))):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(even1(A),if(zerop(A),t,odd(decr(A)))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_even1_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_if_3 , m.trail, a4,  ATOM_t , a5)){
                return m.fail();
            }
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_zerop_1 , m.trail, a3)){
                return m.fail();
            }
        a5 = a5.dref();
            a6 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_odd_1 , m.trail, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_decr_1 , m.trail, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_17(Prolog m) { 
    // equal(exec(append(A,B),C,D),exec(B,exec(A,C,D),D)):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(exec(append(A,B),C,D),exec(B,exec(A,C,D),D)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_exec_3 , m.trail, a3, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_append_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a2 = a2.dref();
            a8 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_exec_3 , m.trail, a7, a8, a5)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_exec_3 , m.trail, a6, a4, a5)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_18(Prolog m) { 
    // equal(exp(A,B),C):-exp(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(exp(A,B),C):-[exp(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_exp_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("exp", FILE_boyer::PRED_exp_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_19(Prolog m) { 
    // equal(fact_(A),fact_loop(A,1)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(fact_(A),fact_loop(A,1)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_fact__1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_fact_loop_2 , m.trail, a3,  int_1 )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_20(Prolog m) { 
    // equal(falsify(A),falsify1(normalize(A),[])):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(falsify(A),falsify1(normalize(A),[])):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_falsify_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_falsify1_2 , m.trail, a4,  Prolog.Nil )){
                return m.fail();
            }
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_normalize_1 , m.trail, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_21(Prolog m) { 
    // equal(fix(A),if(numberp(A),A,zero)):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(fix(A),if(numberp(A),A,zero)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_fix_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_if_3 , m.trail, a4, a3,  ATOM_zero )){
                return m.fail();
            }
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_numberp_1 , m.trail, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_22(Prolog m) { 
    // equal(flatten(cdr(gopher(A))),if(listp(A),cdr(flatten(A)),cons(zero,[]))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(flatten(cdr(gopher(A))),if(listp(A),cdr(flatten(A)),cons(zero,[]))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_flatten_1 , m.trail, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_cdr_1 , m.trail, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_gopher_1 , m.trail, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_if_3 , m.trail, a6, a7, L_equal_2_s51)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_listp_1 , m.trail, a5)){
                return m.fail();
            }
        a7 = a7.dref();
            a8 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_cdr_1 , m.trail, a8)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_flatten_1 , m.trail, a5)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_23(Prolog m) { 
    // equal(gcd(A,B),C):-gcd(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(gcd(A,B),C):-[gcd(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_gcd_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("gcd", FILE_boyer::PRED_gcd_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_24(Prolog m) { 
    // equal(get(A,set(B,C,D)),if(eqp(A,B),C,get(A,D))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(get(A,set(B,C,D)),if(eqp(A,B),C,get(A,D))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_get_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_set_3 , m.trail, a5, a6, a7)){
                return m.fail();
            }
        a2 = a2.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_if_3 , m.trail, a8, a6, a9)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_eqp_2 , m.trail, a3, a5)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_get_2 , m.trail, a3, a7)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_25(Prolog m) { 
    // equal(greatereqp(A,B),not(lessp(A,B))):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(greatereqp(A,B),not(lessp(A,B))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_greatereqp_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_not_1 , m.trail, a5)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_lessp_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_26(Prolog m) { 
    // equal(greatereqpr(A,B),not(lessp(A,B))):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(greatereqpr(A,B),not(lessp(A,B))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_greatereqpr_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_not_1 , m.trail, a5)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_lessp_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_27(Prolog m) { 
    // equal(greaterp(A,B),lessp(B,A)):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(greaterp(A,B),lessp(B,A)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_greaterp_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_lessp_2 , m.trail, a4, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_28(Prolog m) { 
    // equal(if(if(A,B,C),D,E),if(A,if(B,D,E),if(C,D,E))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(if(if(A,B,C),D,E),if(A,if(B,D,E),if(C,D,E))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_if_3 , m.trail, a3, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_if_3 , m.trail, a6, a7, a8)){
                return m.fail();
            }
        a2 = a2.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_if_3 , m.trail, a6, a9, a10)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_if_3 , m.trail, a7, a4, a5)){
                return m.fail();
            }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_if_3 , m.trail, a8, a4, a5)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_29(Prolog m) { 
    // equal(iff(A,B),and(implies(A,B),implies(B,A))):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(iff(A,B),and(implies(A,B),implies(B,A))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_iff_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_and_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_implies_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_implies_2 , m.trail, a4, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_30(Prolog m) { 
    // equal(implies(A,B),if(A,if(B,t,f),t)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(implies(A,B),if(A,if(B,t,f),t)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_implies_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_if_3 , m.trail, a3, a5,  ATOM_t )){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_if_3 , m.trail, a4,  ATOM_t ,  ATOM_f )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_31(Prolog m) { 
    // equal(last(append(A,B)),if(listp(B),last(B),if(listp(A),cons(car(last(A))),B))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(last(append(A,B)),if(listp(B),last(B),if(listp(A),cons(car(last(A))),B))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_last_1 , m.trail, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_append_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_if_3 , m.trail, a6, a7, a8)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_listp_1 , m.trail, a5)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_last_1 , m.trail, a5)){
                return m.fail();
            }
        a8 = a8.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_if_3 , m.trail, a9, a10, a5)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_listp_1 , m.trail, a4)){
                return m.fail();
            }
        a10 = a10.dref();
            a11 = m.mkvar2();
            if (!a10.unifyS( FUNCTOR_cons_1 , m.trail, a11)){
                return m.fail();
            }
        a11 = a11.dref();
            a12 = m.mkvar2();
            if (!a11.unifyS( FUNCTOR_car_1 , m.trail, a12)){
                return m.fail();
            }
        a12 = a12.dref();
            if (!a12.unifyS( FUNCTOR_last_1 , m.trail, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_32(Prolog m) { 
    // equal(length(A),B):-mylength(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(length(A),B):-[mylength(A,B)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_length_1 , m.trail, a3)){
                return m.fail();
            }
        return //
 Op("mylength", FILE_boyer::PRED_mylength_2_static_exec, VA(a3, a2), cont);
    }

    private final static Operation equal_2_33(Prolog m) { 
    // equal(lesseqp(A,B),not(lessp(B,A))):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(lesseqp(A,B),not(lessp(B,A))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_lesseqp_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_not_1 , m.trail, a5)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_lessp_2 , m.trail, a4, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_34(Prolog m) { 
    // equal(lessp(A,B),C):-lessp(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(lessp(A,B),C):-[lessp(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_lessp_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("lessp", FILE_boyer::PRED_lessp_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_35(Prolog m) { 
    // equal(listp(gopher(A)),listp(A)):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(listp(gopher(A)),listp(A)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_listp_1 , m.trail, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_gopher_1 , m.trail, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_listp_1 , m.trail, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_36(Prolog m) { 
    // equal(mc_flatten(A,B),append(flatten(A),B)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(mc_flatten(A,B),append(flatten(A),B)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_mc_flatten_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_append_2 , m.trail, a5, a4)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_flatten_1 , m.trail, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_37(Prolog m) { 
    // equal(meaning(A,B),C):-meaning(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(meaning(A,B),C):-[meaning(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_meaning_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("meaning", FILE_boyer::PRED_meaning_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_38(Prolog m) { 
    // equal(boyer_member(A,B),C):-myboyer_member(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(boyer_member(A,B),C):-[myboyer_member(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_boyer_member_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("myboyer_member", FILE_boyer::PRED_myboyer_member_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_39(Prolog m) { 
    // equal(not(A),if(A,f,t)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(not(A),if(A,f,t)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_not_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_if_3 , m.trail, a3,  ATOM_f ,  ATOM_t )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_40(Prolog m) { 
    // equal(nth(A,B),C):-nth(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(nth(A,B),C):-[nth(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_nth_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("nth", FILE_boyer::PRED_nth_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_41(Prolog m) { 
    // equal(numberp(greatest_factor(A,B)),not(and(or(zerop(B),equal(B,1)),not(numberp(A))))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(numberp(greatest_factor(A,B)),not(and(or(zerop(B),equal(B,1)),not(numberp(A))))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_numberp_1 , m.trail, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_greatest_factor_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_not_1 , m.trail, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_and_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_or_2 , m.trail, a9, a10)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_zerop_1 , m.trail, a5)){
                return m.fail();
            }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_equal_2 , m.trail, a5,  int_1 )){
                return m.fail();
            }
        a8 = a8.dref();
            a11 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_not_1 , m.trail, a11)){
                return m.fail();
            }
        a11 = a11.dref();
            if (!a11.unifyS( FUNCTOR_numberp_1 , m.trail, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_42(Prolog m) { 
    // equal(or(A,B),if(A,t,if(B,t,f),f)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(or(A,B),if(A,t,if(B,t,f),f)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_or_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_if_4 , m.trail, a3,  ATOM_t , a5,  ATOM_f )){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_if_3 , m.trail, a4,  ATOM_t ,  ATOM_f )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_43(Prolog m) { 
    // equal(myplus(A,B),C):-myplus(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(myplus(A,B),C):-[myplus(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_myplus_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("myplus", FILE_boyer::PRED_myplus_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_44(Prolog m) { 
    // equal(power_eval(A,B),C):-power_eval(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(power_eval(A,B),C):-[power_eval(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_power_eval_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("power_eval", FILE_boyer::PRED_power_eval_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_45(Prolog m) { 
    // equal(prime(A),and(not(zerop(A)),and(not(equal(A,add1(zero))),prime1(A,decr(A))))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(prime(A),and(not(zerop(A)),and(not(equal(A,add1(zero))),prime1(A,decr(A))))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_prime_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_and_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a4 = a4.dref();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_not_1 , m.trail, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_zerop_1 , m.trail, a3)){
                return m.fail();
            }
        a5 = a5.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_and_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_not_1 , m.trail, a9)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_equal_2 , m.trail, a3, L_equal_2_s76)){
                return m.fail();
            }
        a8 = a8.dref();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_prime1_2 , m.trail, a3, a10)){
                return m.fail();
            }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_decr_1 , m.trail, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_46(Prolog m) { 
    // equal(prime_list(append(A,B)),and(prime_list(A),prime_list(B))):-true
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(prime_list(append(A,B)),and(prime_list(A),prime_list(B))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_prime_list_1 , m.trail, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_append_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_and_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_prime_list_1 , m.trail, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_prime_list_1 , m.trail, a5)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_47(Prolog m) { 
    // equal(quotient(A,B),C):-quotient(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(quotient(A,B),C):-[quotient(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_quotient_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("quotient", FILE_boyer::PRED_quotient_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_48(Prolog m) { 
    // equal(remainder(A,B),C):-remainder(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(remainder(A,B),C):-[remainder(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_remainder_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("remainder", FILE_boyer::PRED_remainder_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_49(Prolog m) { 
    // equal(reverse_(A),reverse_loop(A,[])):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(reverse_(A),reverse_loop(A,[])):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_reverse__1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_reverse_loop_2 , m.trail, a3,  Prolog.Nil )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_50(Prolog m) { 
    // equal(reverse(append(A,B)),append(reverse(B),reverse(A))):-true
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(reverse(append(A,B)),append(reverse(B),reverse(A))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_reverse_1 , m.trail, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_append_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_append_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_reverse_1 , m.trail, a5)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_reverse_1 , m.trail, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_51(Prolog m) { 
    // equal(reverse_loop(A,B),C):-reverse_loop(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(reverse_loop(A,B),C):-[reverse_loop(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_reverse_loop_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("reverse_loop", FILE_boyer::PRED_reverse_loop_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_52(Prolog m) { 
    // equal(samefringe(A,B),equal(flatten(A),flatten(B))):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(samefringe(A,B),equal(flatten(A),flatten(B))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_samefringe_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_equal_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_flatten_1 , m.trail, a3)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_flatten_1 , m.trail, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_53(Prolog m) { 
    // equal(sigma(zero,A),quotient(times(A,add1(A)),2)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(sigma(zero,A),quotient(times(A,add1(A)),2)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_sigma_2 , m.trail,  ATOM_zero , a3)){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_quotient_2 , m.trail, a4,  int_2 )){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_times_2 , m.trail, a3, a5)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_add1_1 , m.trail, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_54(Prolog m) { 
    // equal(sort2(delete(A,B)),delete(A,sort2(B))):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(sort2(delete(A,B)),delete(A,sort2(B))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_sort2_1 , m.trail, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_delete_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_delete_2 , m.trail, a4, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_sort2_1 , m.trail, a5)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_55(Prolog m) { 
    // equal(tautology_checker(A),tautologyp(normalize(A),[])):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(tautology_checker(A),tautologyp(normalize(A),[])):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_tautology_checker_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_tautologyp_2 , m.trail, a4,  Prolog.Nil )){
                return m.fail();
            }
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_normalize_1 , m.trail, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_56(Prolog m) { 
    // equal(times(A,B),C):-times(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(times(A,B),C):-[times(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_times_2 , m.trail, a3, a4)){
                return m.fail();
            }
        return //
 Op("times", FILE_boyer::PRED_times_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation equal_2_57(Prolog m) { 
    // equal(times_list(append(A,B)),times(times_list(A),times_list(B))):-true
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(times_list(append(A,B)),times(times_list(A),times_list(B))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_times_list_1 , m.trail, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_append_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_times_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_times_list_1 , m.trail, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_times_list_1 , m.trail, a5)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_58(Prolog m) { 
    // equal(value(normalize(A),B),value(A,B)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(value(normalize(A),B),value(A,B)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_value_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a3 = a3.dref();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_normalize_1 , m.trail, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_value_2 , m.trail, a5, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation equal_2_59(Prolog m) { 
    // equal(zerop(A),or(equal(A,zero),not(numberp(A)))):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // equal(zerop(A),or(equal(A,zero),not(numberp(A)))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_zerop_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_or_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_equal_2 , m.trail, a3,  ATOM_zero )){
                return m.fail();
            }
        a5 = a5.dref();
            a6 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_not_1 , m.trail, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_numberp_1 , m.trail, a3)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: boyer_difference/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(boyer_difference/3,public)




    public static Operation PRED_boyer_difference_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::boyer_difference_3_var, FILE_boyer::boyer_difference_3_1, FILE_boyer::boyer_difference_3_1, FILE_boyer::boyer_difference_3_1, FILE_boyer::boyer_difference_3_var, FILE_boyer::boyer_difference_3_1); 
    }

    private final static Operation boyer_difference_3_var(Prolog m) { 
        m.jtry3(null, FILE_boyer::boyer_difference_3_var_1);
        return boyer_difference_3_1(m);
    }

    private final static Operation boyer_difference_3_var_1(Prolog m) { 
        m.retry(null, FILE_boyer::boyer_difference_3_var_2);
        return boyer_difference_3_2(m);
    }

    private final static Operation boyer_difference_3_var_2(Prolog m) { 
        m.retry(null, FILE_boyer::boyer_difference_3_var_3);
        return boyer_difference_3_3(m);
    }

    private final static Operation boyer_difference_3_var_3(Prolog m) { 
        m.retry(null, FILE_boyer::boyer_difference_3_var_4);
        return boyer_difference_3_4(m);
    }

    private final static Operation boyer_difference_3_var_4(Prolog m) { 
        m.retry(null, FILE_boyer::boyer_difference_3_var_5);
        return boyer_difference_3_5(m);
    }

    private final static Operation boyer_difference_3_var_5(Prolog m) { 
        m.retry(null, FILE_boyer::boyer_difference_3_var_6);
        return boyer_difference_3_6(m);
    }

    private final static Operation boyer_difference_3_var_6(Prolog m) { 
        m.trust(null);
        return boyer_difference_3_7(m);
    }

    private final static Operation boyer_difference_3_1(Prolog m) { 
    // boyer_difference(A,A,zero):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // boyer_difference(A,A,zero):-['$neck_cut']
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_zero .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation boyer_difference_3_2(Prolog m) { 
    // boyer_difference(myplus(A,B),A,fix(B)):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // boyer_difference(myplus(A,B),A,fix(B)):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a5)){
                return m.fail();
            }
        if (! a4.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_fix_1 , m.trail, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation boyer_difference_3_3(Prolog m) { 
    // boyer_difference(myplus(A,B),B,fix(A)):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // boyer_difference(myplus(A,B),B,fix(A)):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a5)){
                return m.fail();
            }
        if (! a5.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_fix_1 , m.trail, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation boyer_difference_3_4(Prolog m) { 
    // boyer_difference(myplus(A,B),myplus(A,C),boyer_difference(B,C)):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // boyer_difference(myplus(A,B),myplus(A,C),boyer_difference(B,C)):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a6)){
                return m.fail();
            }
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_boyer_difference_2 , m.trail, a5, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation boyer_difference_3_5(Prolog m) { 
    // boyer_difference(myplus(A,myplus(B,C)),B,myplus(A,C)):-!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // boyer_difference(myplus(A,myplus(B,C)),B,myplus(A,C)):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a5 = a5.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_myplus_2 , m.trail, a6, a7)){
                return m.fail();
            }
        if (! a6.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation boyer_difference_3_6(Prolog m) { 
    // boyer_difference(add1(myplus(A,B)),B,add1(A)):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // boyer_difference(add1(myplus(A,B)),B,add1(A)):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_add1_1 , m.trail, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_myplus_2 , m.trail, a5, a6)){
                return m.fail();
            }
        if (! a6.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_add1_1 , m.trail, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation boyer_difference_3_7(Prolog m) { 
    // boyer_difference(add1(add1(A)),2,fix(A)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // boyer_difference(add1(add1(A)),2,fix(A)):-[]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_add1_1 , m.trail, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_add1_1 , m.trail, a5)){
                return m.fail();
            }
        if (!  int_2 .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_fix_1 , m.trail, a5)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: eq/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(eq/3,public)
        final static Functor FUNCTOR_and_1 = F("and",1);
        final static Functor FUNCTOR_nlistp_1 = F("nlistp",1);




    public static Operation PRED_eq_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::eq_3_var, FILE_boyer::eq_3_int, FILE_boyer::eq_3_int, FILE_boyer::eq_3_con, FILE_boyer::eq_3_str, FILE_boyer::eq_3_int); 
    }

    private final static Operation eq_3_var(Prolog m) { 
        m.jtry3(null, FILE_boyer::eq_3_var_1);
        return eq_3_1(m);
    }

    private final static Operation eq_3_var_1(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_var_2);
        return eq_3_2(m);
    }

    private final static Operation eq_3_var_2(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_var_3);
        return eq_3_3(m);
    }

    private final static Operation eq_3_var_3(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_var_4);
        return eq_3_4(m);
    }

    private final static Operation eq_3_var_4(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_var_5);
        return eq_3_5(m);
    }

    private final static Operation eq_3_var_5(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_var_6);
        return eq_3_6(m);
    }

    private final static Operation eq_3_var_6(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_var_7);
        return eq_3_7(m);
    }

    private final static Operation eq_3_var_7(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_var_8);
        return eq_3_8(m);
    }

    private final static Operation eq_3_var_8(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_var_9);
        return eq_3_9(m);
    }

    private final static Operation eq_3_var_9(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_var_10);
        return eq_3_10(m);
    }

    private final static Operation eq_3_var_10(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_var_11);
        return eq_3_11(m);
    }

    private final static Operation eq_3_var_11(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_var_12);
        return eq_3_12(m);
    }

    private final static Operation eq_3_var_12(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_var_13);
        return eq_3_13(m);
    }

    private final static Operation eq_3_var_13(Prolog m) { 
        m.trust(null);
        return eq_3_14(m);
    }

    private final static Operation eq_3_int(Prolog m) { 
        m.jtry3(null, FILE_boyer::eq_3_int_1);
        return eq_3_4(m);
    }

    private final static Operation eq_3_int_1(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_int_2);
        return eq_3_10(m);
    }

    private final static Operation eq_3_int_2(Prolog m) { 
        m.trust(null);
        return eq_3_11(m);
    }

    private final static Operation eq_3_con(Prolog m) { 
        m.jtry3(null, FILE_boyer::eq_3_con_1);
        return eq_3_3(m);
    }

    private final static Operation eq_3_con_1(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_con_2);
        return eq_3_4(m);
    }

    private final static Operation eq_3_con_2(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_con_3);
        return eq_3_10(m);
    }

    private final static Operation eq_3_con_3(Prolog m) { 
        m.trust(null);
        return eq_3_11(m);
    }

    private final static Operation eq_3_str(Prolog m) { 
        m.jtry3(null, FILE_boyer::eq_3_str_1);
        return eq_3_1(m);
    }

    private final static Operation eq_3_str_1(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_str_2);
        return eq_3_2(m);
    }

    private final static Operation eq_3_str_2(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_str_3);
        return eq_3_4(m);
    }

    private final static Operation eq_3_str_3(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_str_4);
        return eq_3_5(m);
    }

    private final static Operation eq_3_str_4(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_str_5);
        return eq_3_6(m);
    }

    private final static Operation eq_3_str_5(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_str_6);
        return eq_3_7(m);
    }

    private final static Operation eq_3_str_6(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_str_7);
        return eq_3_8(m);
    }

    private final static Operation eq_3_str_7(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_str_8);
        return eq_3_9(m);
    }

    private final static Operation eq_3_str_8(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_str_9);
        return eq_3_10(m);
    }

    private final static Operation eq_3_str_9(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_str_10);
        return eq_3_11(m);
    }

    private final static Operation eq_3_str_10(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_str_11);
        return eq_3_12(m);
    }

    private final static Operation eq_3_str_11(Prolog m) { 
        m.retry(null, FILE_boyer::eq_3_str_12);
        return eq_3_13(m);
    }

    private final static Operation eq_3_str_12(Prolog m) { 
        m.trust(null);
        return eq_3_14(m);
    }

    private final static Operation eq_3_1(Prolog m) { 
    // eq(myplus(A,B),zero,and(zerop(A),zerop(B))):-!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(myplus(A,B),zero,and(zerop(A),zerop(B))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a5)){
                return m.fail();
            }
        if (!  ATOM_zero .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_and_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_zerop_1 , m.trail, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_zerop_1 , m.trail, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_2(Prolog m) { 
    // eq(myplus(A,B),myplus(A,C),equal(fix(B),fix(C))):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(myplus(A,B),myplus(A,C),equal(fix(B),fix(C))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a6)){
                return m.fail();
            }
        a3 = a3.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_equal_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_fix_1 , m.trail, a5)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_fix_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_3(Prolog m) { 
    // eq(zero,boyer_difference(A,B),not(lessp(B,A))):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(zero,boyer_difference(A,B),not(lessp(B,A))):-['$neck_cut']
        if (!  ATOM_zero .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_boyer_difference_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_not_1 , m.trail, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_lessp_2 , m.trail, a5, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_4(Prolog m) { 
    // eq(A,boyer_difference(A,B),and(numberp(A),and(or(equal(A,zero),zerop(B))))):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(A,boyer_difference(A,B),and(numberp(A),and(or(equal(A,zero),zerop(B))))):-['$neck_cut']
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_boyer_difference_2 , m.trail, a1, a4)){
                return m.fail();
            }
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_and_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_numberp_1 , m.trail, a1)){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_and_1 , m.trail, a7)){
                return m.fail();
            }
        a7 = a7.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_or_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_equal_2 , m.trail, a1,  ATOM_zero )){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_zerop_1 , m.trail, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_5(Prolog m) { 
    // eq(times(A,B),zero,or(zerop(A),zerop(B))):-!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(times(A,B),zero,or(zerop(A),zerop(B))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_times_2 , m.trail, a4, a5)){
                return m.fail();
            }
        if (!  ATOM_zero .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_or_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_zerop_1 , m.trail, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_zerop_1 , m.trail, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_6(Prolog m) { 
    // eq(append(A,B),append(A,C),equal(B,C)):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(append(A,B),append(A,C),equal(B,C)):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_append_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_append_2 , m.trail, a4, a6)){
                return m.fail();
            }
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_equal_2 , m.trail, a5, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_7(Prolog m) { 
    // eq(flatten(A),cons(B,[]),and(nlistp(A),equal(A,B))):-!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(flatten(A),cons(B,[]),and(nlistp(A),equal(A,B))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_flatten_1 , m.trail, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_cons_2 , m.trail, a5,  Prolog.Nil )){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_and_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_nlistp_1 , m.trail, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_equal_2 , m.trail, a4, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_8(Prolog m) { 
    // eq(greatest_factor(A,B),zero,and(or(zerop(B),equal(B,1)),equal(A,zero))):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(greatest_factor(A,B),zero,and(or(zerop(B),equal(B,1)),equal(A,zero))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_greatest_factor_2 , m.trail, a4, a5)){
                return m.fail();
            }
        if (!  ATOM_zero .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_and_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_or_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_zerop_1 , m.trail, a5)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_equal_2 , m.trail, a5,  int_1 )){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_equal_2 , m.trail, a4,  ATOM_zero )){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_9(Prolog m) { 
    // eq(greatest_factor(A,B),1,equal(A,1)):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(greatest_factor(A,B),1,equal(A,1)):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_greatest_factor_2 , m.trail, a4, m.DONT_CARE1())){
                return m.fail();
            }
        if (!  int_1 .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_equal_2 , m.trail, a4,  int_1 )){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_10(Prolog m) { 
    // eq(A,times(B,A),and(numberp(A),or(equal(A,zero),equal(B,1)))):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(A,times(B,A),and(numberp(A),or(equal(A,zero),equal(B,1)))):-['$neck_cut']
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_times_2 , m.trail, a4, a1)){
                return m.fail();
            }
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_and_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_numberp_1 , m.trail, a1)){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_or_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_equal_2 , m.trail, a1,  ATOM_zero )){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_equal_2 , m.trail, a4,  int_1 )){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_11(Prolog m) { 
    // eq(A,times(A,B),or(equal(A,zero),and(numberp(A),equal(B,1)))):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(A,times(A,B),or(equal(A,zero),and(numberp(A),equal(B,1)))):-['$neck_cut']
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_times_2 , m.trail, a1, a4)){
                return m.fail();
            }
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_or_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_equal_2 , m.trail, a1,  ATOM_zero )){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_and_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_numberp_1 , m.trail, a1)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_equal_2 , m.trail, a4,  int_1 )){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_12(Prolog m) { 
    // eq(times(A,B),1,and(not(equal(A,zero)),and(not(equal(B,zero)),and(numberp(A),and(numberp(B),and(equal(decr(A),zero),equal(decr(B),zero))))))):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(times(A,B),1,and(not(equal(A,zero)),and(not(equal(B,zero)),and(numberp(A),and(numberp(B),and(equal(decr(A),zero),equal(decr(B),zero))))))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_times_2 , m.trail, a4, a5)){
                return m.fail();
            }
        if (!  int_1 .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_and_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_not_1 , m.trail, a8)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_equal_2 , m.trail, a4,  ATOM_zero )){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_and_2 , m.trail, a9, a10)){
                return m.fail();
            }
        a9 = a9.dref();
            a11 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_not_1 , m.trail, a11)){
                return m.fail();
            }
        a11 = a11.dref();
            if (!a11.unifyS( FUNCTOR_equal_2 , m.trail, a5,  ATOM_zero )){
                return m.fail();
            }
        a10 = a10.dref();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a10.unifyS( FUNCTOR_and_2 , m.trail, a12, a13)){
                return m.fail();
            }
        a12 = a12.dref();
            if (!a12.unifyS( FUNCTOR_numberp_1 , m.trail, a4)){
                return m.fail();
            }
        a13 = a13.dref();
            a14 = m.mkvar2();
            a15 = m.mkvar2();
            if (!a13.unifyS( FUNCTOR_and_2 , m.trail, a14, a15)){
                return m.fail();
            }
        a14 = a14.dref();
            if (!a14.unifyS( FUNCTOR_numberp_1 , m.trail, a5)){
                return m.fail();
            }
        a15 = a15.dref();
            a16 = m.mkvar2();
            a17 = m.mkvar2();
            if (!a15.unifyS( FUNCTOR_and_2 , m.trail, a16, a17)){
                return m.fail();
            }
        a16 = a16.dref();
            a18 = m.mkvar2();
            if (!a16.unifyS( FUNCTOR_equal_2 , m.trail, a18,  ATOM_zero )){
                return m.fail();
            }
        a18 = a18.dref();
            if (!a18.unifyS( FUNCTOR_decr_1 , m.trail, a4)){
                return m.fail();
            }
        a17 = a17.dref();
            a19 = m.mkvar2();
            if (!a17.unifyS( FUNCTOR_equal_2 , m.trail, a19,  ATOM_zero )){
                return m.fail();
            }
        a19 = a19.dref();
            if (!a19.unifyS( FUNCTOR_decr_1 , m.trail, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_13(Prolog m) { 
    // eq(boyer_difference(A,B),boyer_difference(C,B),if(lessp(A,B),not(lessp(B,C)),if(lessp(C,B),not(lessp(B,A)),equal(fix(A),fix(C))))):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(boyer_difference(A,B),boyer_difference(C,B),if(lessp(A,B),not(lessp(B,C)),if(lessp(C,B),not(lessp(B,A)),equal(fix(A),fix(C))))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_boyer_difference_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_boyer_difference_2 , m.trail, a6, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_if_3 , m.trail, a7, a8, a9)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_lessp_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a8 = a8.dref();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_not_1 , m.trail, a10)){
                return m.fail();
            }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_lessp_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a9 = a9.dref();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_if_3 , m.trail, a11, a12, a13)){
                return m.fail();
            }
        a11 = a11.dref();
            if (!a11.unifyS( FUNCTOR_lessp_2 , m.trail, a6, a5)){
                return m.fail();
            }
        a12 = a12.dref();
            a14 = m.mkvar2();
            if (!a12.unifyS( FUNCTOR_not_1 , m.trail, a14)){
                return m.fail();
            }
        a14 = a14.dref();
            if (!a14.unifyS( FUNCTOR_lessp_2 , m.trail, a5, a4)){
                return m.fail();
            }
        a13 = a13.dref();
            a15 = m.mkvar2();
            a16 = m.mkvar2();
            if (!a13.unifyS( FUNCTOR_equal_2 , m.trail, a15, a16)){
                return m.fail();
            }
        a15 = a15.dref();
            if (!a15.unifyS( FUNCTOR_fix_1 , m.trail, a4)){
                return m.fail();
            }
        a16 = a16.dref();
            if (!a16.unifyS( FUNCTOR_fix_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation eq_3_14(Prolog m) { 
    // eq(lessp(A,B),C,if(lessp(A,B),equal(t,C),equal(f,C))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // eq(lessp(A,B),C,if(lessp(A,B),equal(t,C),equal(f,C))):-[]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_lessp_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_if_3 , m.trail, a6, a7, a8)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_lessp_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_equal_2 , m.trail,  ATOM_t , a2)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_equal_2 , m.trail,  ATOM_f , a2)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: exp/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(exp/3,public)




    public static Operation PRED_exp_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_boyer::exp_3_sub_1);
        return exp_3_1(m);
    }

    private final static Operation exp_3_sub_1(Prolog m) { 
        m.trust(null);
        return exp_3_2(m);
    }

    private final static Operation exp_3_1(Prolog m) { 
    // exp(A,myplus(B,C),times(exp(A,B),exp(A,C))):-!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // exp(A,myplus(B,C),times(exp(A,B),exp(A,C))):-['$neck_cut']
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_times_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_exp_2 , m.trail, a1, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_exp_2 , m.trail, a1, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation exp_3_2(Prolog m) { 
    // exp(A,times(B,C),exp(exp(A,B),C)):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // exp(A,times(B,C),exp(exp(A,B),C)):-[]
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_times_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_exp_2 , m.trail, a6, a5)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_exp_2 , m.trail, a1, a4)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: gcd/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(gcd/3,public)




    public static Operation PRED_gcd_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::gcd_3_var, FILE_boyer::gcd_3_1, FILE_boyer::gcd_3_1, FILE_boyer::gcd_3_1, FILE_boyer::gcd_3_var, FILE_boyer::gcd_3_1); 
    }

    private final static Operation gcd_3_var(Prolog m) { 
        m.jtry3(null, FILE_boyer::gcd_3_var_1);
        return gcd_3_1(m);
    }

    private final static Operation gcd_3_var_1(Prolog m) { 
        m.trust(null);
        return gcd_3_2(m);
    }

    private final static Operation gcd_3_1(Prolog m) { 
    // gcd(A,B,gcd(B,A)):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // gcd(A,B,gcd(B,A)):-['$neck_cut']
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_gcd_2 , m.trail, a2, a1)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation gcd_3_2(Prolog m) { 
    // gcd(times(A,B),times(C,B),times(B,gcd(A,C))):-true
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // gcd(times(A,B),times(C,B),times(B,gcd(A,C))):-[]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_times_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_times_2 , m.trail, a6, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_times_2 , m.trail, a5, a7)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_gcd_2 , m.trail, a4, a6)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: mylength/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(mylength/2,public)




    public static Operation PRED_mylength_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::mylength_2_var, fail_0, fail_0, fail_0, FILE_boyer::mylength_2_var, fail_0); 
    }

    private final static Operation mylength_2_var(Prolog m) { 
        m.jtry2(null, FILE_boyer::mylength_2_var_1);
        return mylength_2_1(m);
    }

    private final static Operation mylength_2_var_1(Prolog m) { 
        m.trust(null);
        return mylength_2_2(m);
    }

    private final static Operation mylength_2_1(Prolog m) { 
    // mylength(reverse(A),length(A)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // mylength(reverse(A),length(A)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_reverse_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_length_1 , m.trail, a3)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation mylength_2_2(Prolog m) { 
    // mylength(cons(A,cons(B,cons(C,cons(D,cons(E,cons(F,G)))))),myplus(6,length(G))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // mylength(cons(A,cons(B,cons(C,cons(D,cons(E,cons(F,G)))))),myplus(6,length(G))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_cons_2 , m.trail, m.DONT_CARE1(), a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_cons_2 , m.trail, m.DONT_CARE1(), a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_cons_2 , m.trail, m.DONT_CARE1(), a5)){
                return m.fail();
            }
        a5 = a5.dref();
            a6 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_cons_2 , m.trail, m.DONT_CARE1(), a6)){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_cons_2 , m.trail, m.DONT_CARE1(), a7)){
                return m.fail();
            }
        a7 = a7.dref();
            a8 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_cons_2 , m.trail, m.DONT_CARE1(), a8)){
                return m.fail();
            }
        a2 = a2.dref();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_myplus_2 , m.trail,  int_6 , a9)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_length_1 , m.trail, a8)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: lessp/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(lessp/3,public)




    public static Operation PRED_lessp_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::lessp_3_var, FILE_boyer::lessp_3_6, FILE_boyer::lessp_3_6, FILE_boyer::lessp_3_6, FILE_boyer::lessp_3_var, FILE_boyer::lessp_3_6); 
    }

    private final static Operation lessp_3_var(Prolog m) { 
        m.jtry3(null, FILE_boyer::lessp_3_var_1);
        return lessp_3_1(m);
    }

    private final static Operation lessp_3_var_1(Prolog m) { 
        m.retry(null, FILE_boyer::lessp_3_var_2);
        return lessp_3_2(m);
    }

    private final static Operation lessp_3_var_2(Prolog m) { 
        m.retry(null, FILE_boyer::lessp_3_var_3);
        return lessp_3_3(m);
    }

    private final static Operation lessp_3_var_3(Prolog m) { 
        m.retry(null, FILE_boyer::lessp_3_var_4);
        return lessp_3_4(m);
    }

    private final static Operation lessp_3_var_4(Prolog m) { 
        m.retry(null, FILE_boyer::lessp_3_var_5);
        return lessp_3_5(m);
    }

    private final static Operation lessp_3_var_5(Prolog m) { 
        m.retry(null, FILE_boyer::lessp_3_var_6);
        return lessp_3_6(m);
    }

    private final static Operation lessp_3_var_6(Prolog m) { 
        m.trust(null);
        return lessp_3_7(m);
    }

    private final static Operation lessp_3_1(Prolog m) { 
    // lessp(remainder(A,B),B,not(zerop(B))):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // lessp(remainder(A,B),B,not(zerop(B))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_remainder_2 , m.trail, m.DONT_CARE1(), a4)){
                return m.fail();
            }
        if (! a4.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_not_1 , m.trail, a5)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_zerop_1 , m.trail, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation lessp_3_2(Prolog m) { 
    // lessp(quotient(A,B),A,and(not(zerop(A)),or(zerop(B),not(equal(B,1))))):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // lessp(quotient(A,B),A,and(not(zerop(A)),or(zerop(B),not(equal(B,1))))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_quotient_2 , m.trail, a4, a5)){
                return m.fail();
            }
        if (! a4.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_and_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_not_1 , m.trail, a8)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_zerop_1 , m.trail, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_or_2 , m.trail, a9, a10)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_zerop_1 , m.trail, a5)){
                return m.fail();
            }
        a10 = a10.dref();
            a11 = m.mkvar2();
            if (!a10.unifyS( FUNCTOR_not_1 , m.trail, a11)){
                return m.fail();
            }
        a11 = a11.dref();
            if (!a11.unifyS( FUNCTOR_equal_2 , m.trail, a5,  int_1 )){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation lessp_3_3(Prolog m) { 
    // lessp(remainder(A,B),A,and(not(zerop(B)),and(not(zerop(A)),not(lessp(A,B))))):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // lessp(remainder(A,B),A,and(not(zerop(B)),and(not(zerop(A)),not(lessp(A,B))))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_remainder_2 , m.trail, a4, a5)){
                return m.fail();
            }
        if (! a4.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_and_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_not_1 , m.trail, a8)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_zerop_1 , m.trail, a5)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_and_2 , m.trail, a9, a10)){
                return m.fail();
            }
        a9 = a9.dref();
            a11 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_not_1 , m.trail, a11)){
                return m.fail();
            }
        a11 = a11.dref();
            if (!a11.unifyS( FUNCTOR_zerop_1 , m.trail, a4)){
                return m.fail();
            }
        a10 = a10.dref();
            a12 = m.mkvar2();
            if (!a10.unifyS( FUNCTOR_not_1 , m.trail, a12)){
                return m.fail();
            }
        a12 = a12.dref();
            if (!a12.unifyS( FUNCTOR_lessp_2 , m.trail, a4, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation lessp_3_4(Prolog m) { 
    // lessp(myplus(A,B),myplus(A,C),lessp(B,C)):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // lessp(myplus(A,B),myplus(A,C),lessp(B,C)):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a6)){
                return m.fail();
            }
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_lessp_2 , m.trail, a5, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation lessp_3_5(Prolog m) { 
    // lessp(times(A,B),times(C,B),and(not(zerop(B)),lessp(A,C))):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // lessp(times(A,B),times(C,B),and(not(zerop(B)),lessp(A,C))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_times_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_times_2 , m.trail, a6, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_and_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_not_1 , m.trail, a9)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_zerop_1 , m.trail, a5)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_lessp_2 , m.trail, a4, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation lessp_3_6(Prolog m) { 
    // lessp(A,myplus(B,A),not(zerop(B))):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // lessp(A,myplus(B,A),not(zerop(B))):-['$neck_cut']
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a1)){
                return m.fail();
            }
        a3 = a3.dref();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_not_1 , m.trail, a5)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_zerop_1 , m.trail, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation lessp_3_7(Prolog m) { 
    // lessp(length(delete(A,B)),length(B),boyer_member(A,B)):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // lessp(length(delete(A,B)),length(B),boyer_member(A,B)):-[]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_length_1 , m.trail, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_delete_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_length_1 , m.trail, a6)){
                return m.fail();
            }
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_boyer_member_2 , m.trail, a5, a6)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: meaning/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(meaning/3,public)
        final static Functor FUNCTOR_plus_tree_1 = F("plus_tree",1);
        final static Functor FUNCTOR_plus_fringe_1 = F("plus_fringe",1);




    public static Operation PRED_meaning_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::meaning_3_var, fail_0, fail_0, fail_0, FILE_boyer::meaning_3_var, fail_0); 
    }

    private final static Operation meaning_3_var(Prolog m) { 
        m.jtry3(null, FILE_boyer::meaning_3_var_1);
        return meaning_3_1(m);
    }

    private final static Operation meaning_3_var_1(Prolog m) { 
        m.retry(null, FILE_boyer::meaning_3_var_2);
        return meaning_3_2(m);
    }

    private final static Operation meaning_3_var_2(Prolog m) { 
        m.trust(null);
        return meaning_3_3(m);
    }

    private final static Operation meaning_3_1(Prolog m) { 
    // meaning(plus_tree(append(A,B)),C,myplus(meaning(plus_tree(A),C),meaning(plus_tree(B),C))):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // meaning(plus_tree(append(A,B)),C,myplus(meaning(plus_tree(A),C),meaning(plus_tree(B),C))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_plus_tree_1 , m.trail, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_append_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a3 = a3.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_myplus_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_meaning_2 , m.trail, a9, a2)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_plus_tree_1 , m.trail, a5)){
                return m.fail();
            }
        a8 = a8.dref();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_meaning_2 , m.trail, a10, a2)){
                return m.fail();
            }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_plus_tree_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation meaning_3_2(Prolog m) { 
    // meaning(plus_tree(plus_fringe(A)),B,fix(meaning(A,B))):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // meaning(plus_tree(plus_fringe(A)),B,fix(meaning(A,B))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_plus_tree_1 , m.trail, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_plus_fringe_1 , m.trail, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_fix_1 , m.trail, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_meaning_2 , m.trail, a5, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation meaning_3_3(Prolog m) { 
    // meaning(plus_tree(delete(A,B)),C,if(boyer_member(A,B),boyer_difference(meaning(plus_tree(B),C),meaning(A,C)),meaning(plus_tree(B),C))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // meaning(plus_tree(delete(A,B)),C,if(boyer_member(A,B),boyer_difference(meaning(plus_tree(B),C),meaning(A,C)),meaning(plus_tree(B),C))):-[]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_plus_tree_1 , m.trail, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_delete_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a3 = a3.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_if_3 , m.trail, a7, a8, a9)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_boyer_member_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a8 = a8.dref();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_boyer_difference_2 , m.trail, a10, a11)){
                return m.fail();
            }
        a10 = a10.dref();
            a12 = m.mkvar2();
            if (!a10.unifyS( FUNCTOR_meaning_2 , m.trail, a12, a2)){
                return m.fail();
            }
        a12 = a12.dref();
            if (!a12.unifyS( FUNCTOR_plus_tree_1 , m.trail, a6)){
                return m.fail();
            }
        a11 = a11.dref();
            if (!a11.unifyS( FUNCTOR_meaning_2 , m.trail, a5, a2)){
                return m.fail();
            }
        a9 = a9.dref();
            a13 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_meaning_2 , m.trail, a13, a2)){
                return m.fail();
            }
        a13 = a13.dref();
            if (!a13.unifyS( FUNCTOR_plus_tree_1 , m.trail, a6)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: myboyer_member/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(myboyer_member/3,public)
        final static Functor FUNCTOR_intersect_2 = F("intersect",2);




    public static Operation PRED_myboyer_member_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_boyer::myboyer_member_3_sub_1);
        return myboyer_member_3_1(m);
    }

    private final static Operation myboyer_member_3_sub_1(Prolog m) { 
        m.retry(null, FILE_boyer::myboyer_member_3_sub_2);
        return myboyer_member_3_2(m);
    }

    private final static Operation myboyer_member_3_sub_2(Prolog m) { 
        m.trust(null);
        return myboyer_member_3_3(m);
    }

    private final static Operation myboyer_member_3_1(Prolog m) { 
    // myboyer_member(A,append(B,C),or(boyer_member(A,B),boyer_member(A,C))):-!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // myboyer_member(A,append(B,C),or(boyer_member(A,B),boyer_member(A,C))):-['$neck_cut']
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_append_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_or_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_boyer_member_2 , m.trail, a1, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_boyer_member_2 , m.trail, a1, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation myboyer_member_3_2(Prolog m) { 
    // myboyer_member(A,reverse(B),boyer_member(A,B)):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // myboyer_member(A,reverse(B),boyer_member(A,B)):-['$neck_cut']
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_reverse_1 , m.trail, a4)){
                return m.fail();
            }
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_boyer_member_2 , m.trail, a1, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation myboyer_member_3_3(Prolog m) { 
    // myboyer_member(A,intersect(B,C),and(boyer_member(A,B),boyer_member(A,C))):-true
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // myboyer_member(A,intersect(B,C),and(boyer_member(A,B),boyer_member(A,C))):-[]
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_intersect_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_and_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_boyer_member_2 , m.trail, a1, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_boyer_member_2 , m.trail, a1, a5)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: nth/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(nth/3,public)




    public static Operation PRED_nth_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::nth_3_var, fail_0, fail_0, FILE_boyer::nth_3_con, FILE_boyer::nth_3_3, fail_0); 
    }

    private final static Operation nth_3_var(Prolog m) { 
        m.jtry3(null, FILE_boyer::nth_3_var_1);
        return nth_3_1(m);
    }

    private final static Operation nth_3_var_1(Prolog m) { 
        m.retry(null, FILE_boyer::nth_3_var_2);
        return nth_3_2(m);
    }

    private final static Operation nth_3_var_2(Prolog m) { 
        m.trust(null);
        return nth_3_3(m);
    }

    private final static Operation nth_3_con(Prolog m) { 
        m.jtry3(null, FILE_boyer::nth_3_con_1);
        return nth_3_1(m);
    }

    private final static Operation nth_3_con_1(Prolog m) { 
        m.trust(null);
        return nth_3_2(m);
    }

    private final static Operation nth_3_1(Prolog m) { 
    // nth(zero,A,zero):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // nth(zero,A,zero):-[]
        if (!  ATOM_zero .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_zero .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation nth_3_2(Prolog m) { 
    // nth([],A,if(zerop(A),[],zero)):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // nth([],A,if(zerop(A),[],zero)):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
            a4 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_if_3 , m.trail, a4,  Prolog.Nil ,  ATOM_zero )){
                return m.fail();
            }
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_zerop_1 , m.trail, a2)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation nth_3_3(Prolog m) { 
    // nth(append(A,B),C,append(nth(A,C),nth(B,boyer_difference(C,length(A))))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // nth(append(A,B),C,append(nth(A,C),nth(B,boyer_difference(C,length(A))))):-[]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_append_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_append_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_nth_2 , m.trail, a4, a2)){
                return m.fail();
            }
        a7 = a7.dref();
            a8 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_nth_2 , m.trail, a5, a8)){
                return m.fail();
            }
        a8 = a8.dref();
            a9 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_boyer_difference_2 , m.trail, a2, a9)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_length_1 , m.trail, a4)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: myplus/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(myplus/3,public)




    public static Operation PRED_myplus_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::myplus_3_var, FILE_boyer::myplus_3_3, FILE_boyer::myplus_3_3, FILE_boyer::myplus_3_3, FILE_boyer::myplus_3_var, FILE_boyer::myplus_3_3); 
    }

    private final static Operation myplus_3_var(Prolog m) { 
        m.jtry3(null, FILE_boyer::myplus_3_var_1);
        return myplus_3_1(m);
    }

    private final static Operation myplus_3_var_1(Prolog m) { 
        m.retry(null, FILE_boyer::myplus_3_var_2);
        return myplus_3_2(m);
    }

    private final static Operation myplus_3_var_2(Prolog m) { 
        m.trust(null);
        return myplus_3_3(m);
    }

    private final static Operation myplus_3_1(Prolog m) { 
    // myplus(myplus(A,B),C,myplus(A,myplus(B,C))):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // myplus(myplus(A,B),C,myplus(A,myplus(B,C))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_myplus_2 , m.trail, a5, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation myplus_3_2(Prolog m) { 
    // myplus(remainder(A,B),times(B,quotient(A,B)),fix(A)):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // myplus(remainder(A,B),times(B,quotient(A,B)),fix(A)):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_remainder_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_times_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_quotient_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_fix_1 , m.trail, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation myplus_3_3(Prolog m) { 
    // myplus(A,add1(B),if(numberp(B),add1(myplus(A,B)),add1(A))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // myplus(A,add1(B),if(numberp(B),add1(myplus(A,B)),add1(A))):-[]
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_add1_1 , m.trail, a4)){
                return m.fail();
            }
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_if_3 , m.trail, a5, a6, a7)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_numberp_1 , m.trail, a4)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_add1_1 , m.trail, a8)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_myplus_2 , m.trail, a1, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_add1_1 , m.trail, a1)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: power_eval/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(power_eval/3,public)
        final static Functor FUNCTOR_big_plus1_3 = F("big_plus1",3);
        final static Functor FUNCTOR_power_rep_2 = F("power_rep",2);
        final static Functor FUNCTOR_big_plus_4 = F("big_plus",4);




    public static Operation PRED_power_eval_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::power_eval_3_var, fail_0, fail_0, fail_0, FILE_boyer::power_eval_3_var, fail_0); 
    }

    private final static Operation power_eval_3_var(Prolog m) { 
        m.jtry3(null, FILE_boyer::power_eval_3_var_1);
        return power_eval_3_1(m);
    }

    private final static Operation power_eval_3_var_1(Prolog m) { 
        m.retry(null, FILE_boyer::power_eval_3_var_2);
        return power_eval_3_2(m);
    }

    private final static Operation power_eval_3_var_2(Prolog m) { 
        m.retry(null, FILE_boyer::power_eval_3_var_3);
        return power_eval_3_3(m);
    }

    private final static Operation power_eval_3_var_3(Prolog m) { 
        m.trust(null);
        return power_eval_3_4(m);
    }

    private final static Operation power_eval_3_1(Prolog m) { 
    // power_eval(big_plus1(A,B,C),C,myplus(power_eval(A,C),B)):-!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // power_eval(big_plus1(A,B,C),C,myplus(power_eval(A,C),B)):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_big_plus1_3 , m.trail, a4, a5, a6)){
                return m.fail();
            }
        if (! a6.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_myplus_2 , m.trail, a7, a5)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_power_eval_2 , m.trail, a4, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation power_eval_3_2(Prolog m) { 
    // power_eval(power_rep(A,B),B,fix(A)):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // power_eval(power_rep(A,B),B,fix(A)):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_power_rep_2 , m.trail, a4, a5)){
                return m.fail();
            }
        if (! a5.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_fix_1 , m.trail, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation power_eval_3_3(Prolog m) { 
    // power_eval(big_plus(A,B,C,D),D,myplus(C,myplus(power_eval(A,D),power_eval(B,D)))):-!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // power_eval(big_plus(A,B,C,D),D,myplus(C,myplus(power_eval(A,D),power_eval(B,D)))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_big_plus_4 , m.trail, a4, a5, a6, a7)){
                return m.fail();
            }
        if (! a7.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            a8 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_myplus_2 , m.trail, a6, a8)){
                return m.fail();
            }
        a8 = a8.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_myplus_2 , m.trail, a9, a10)){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_power_eval_2 , m.trail, a4, a7)){
                return m.fail();
            }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_power_eval_2 , m.trail, a5, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation power_eval_3_4(Prolog m) { 
    // power_eval(big_plus(power_rep(A,B),power_rep(C,B),zero,B),B,myplus(A,C)):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // power_eval(big_plus(power_rep(A,B),power_rep(C,B),zero,B),B,myplus(A,C)):-[]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_big_plus_4 , m.trail, a4, a5,  ATOM_zero , a6)){
                return m.fail();
            }
        a4 = a4.dref();
            a7 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_power_rep_2 , m.trail, a7, a6)){
                return m.fail();
            }
        a5 = a5.dref();
            a8 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_power_rep_2 , m.trail, a8, a6)){
                return m.fail();
            }
        if (! a6.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_myplus_2 , m.trail, a7, a8)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: quotient/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(quotient/3,public)




    public static Operation PRED_quotient_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::quotient_3_var, fail_0, fail_0, fail_0, FILE_boyer::quotient_3_var, fail_0); 
    }

    private final static Operation quotient_3_var(Prolog m) { 
        m.jtry3(null, FILE_boyer::quotient_3_var_1);
        return quotient_3_1(m);
    }

    private final static Operation quotient_3_var_1(Prolog m) { 
        m.trust(null);
        return quotient_3_2(m);
    }

    private final static Operation quotient_3_1(Prolog m) { 
    // quotient(myplus(A,myplus(A,B)),2,myplus(A,quotient(B,2))):-true
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quotient(myplus(A,myplus(A,B)),2,myplus(A,quotient(B,2))):-[]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a5 = a5.dref();
            a6 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a6)){
                return m.fail();
            }
        if (!  int_2 .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a7)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_quotient_2 , m.trail, a6,  int_2 )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation quotient_3_2(Prolog m) { 
    // quotient(times(A,B),A,if(zerop(A),zero,fix(B))):-true
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quotient(times(A,B),A,if(zerop(A),zero,fix(B))):-[]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_times_2 , m.trail, a4, a5)){
                return m.fail();
            }
        if (! a4.unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_if_3 , m.trail, a6,  ATOM_zero , a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_zerop_1 , m.trail, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_fix_1 , m.trail, a5)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: remainder/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(remainder/3,public)




    public static Operation PRED_remainder_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::remainder_3_var, FILE_boyer::remainder_3_int, FILE_boyer::remainder_3_int, FILE_boyer::remainder_3_int, FILE_boyer::remainder_3_var, FILE_boyer::remainder_3_int); 
    }

    private final static Operation remainder_3_var(Prolog m) { 
        m.jtry3(null, FILE_boyer::remainder_3_var_1);
        return remainder_3_1(m);
    }

    private final static Operation remainder_3_var_1(Prolog m) { 
        m.retry(null, FILE_boyer::remainder_3_var_2);
        return remainder_3_2(m);
    }

    private final static Operation remainder_3_var_2(Prolog m) { 
        m.retry(null, FILE_boyer::remainder_3_var_3);
        return remainder_3_3(m);
    }

    private final static Operation remainder_3_var_3(Prolog m) { 
        m.trust(null);
        return remainder_3_4(m);
    }

    private final static Operation remainder_3_int(Prolog m) { 
        m.jtry3(null, FILE_boyer::remainder_3_int_1);
        return remainder_3_1(m);
    }

    private final static Operation remainder_3_int_1(Prolog m) { 
        m.trust(null);
        return remainder_3_2(m);
    }

    private final static Operation remainder_3_1(Prolog m) { 
    // remainder(A,1,zero):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // remainder(A,1,zero):-['$neck_cut']
        if (!  int_1 .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_zero .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation remainder_3_2(Prolog m) { 
    // remainder(A,A,zero):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // remainder(A,A,zero):-['$neck_cut']
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_zero .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation remainder_3_3(Prolog m) { 
    // remainder(times(A,B),B,zero):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // remainder(times(A,B),B,zero):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_times_2 , m.trail, m.DONT_CARE1(), a4)){
                return m.fail();
            }
        if (! a4.unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_zero .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation remainder_3_4(Prolog m) { 
    // remainder(times(A,B),A,zero):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // remainder(times(A,B),A,zero):-[]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_times_2 , m.trail, a4, m.DONT_CARE1())){
                return m.fail();
            }
        if (! a4.unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_zero .unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: reverse_loop/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(reverse_loop/3,public)




    public static Operation PRED_reverse_loop_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_boyer::reverse_loop_3_sub_1);
        return reverse_loop_3_1(m);
    }

    private final static Operation reverse_loop_3_sub_1(Prolog m) { 
        m.trust(null);
        return reverse_loop_3_2(m);
    }

    private final static Operation reverse_loop_3_1(Prolog m) { 
    // reverse_loop(A,B,append(reverse(A),B)):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // reverse_loop(A,B,append(reverse(A),B)):-['$neck_cut']
        a3 = a3.dref();
            a4 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_append_2 , m.trail, a4, a2)){
                return m.fail();
            }
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_reverse_1 , m.trail, a1)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation reverse_loop_3_2(Prolog m) { 
    // reverse_loop(A,[],reverse(A)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // reverse_loop(A,[],reverse(A)):-[]
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_reverse_1 , m.trail, a1)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: times/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl
*/
    // main(times/3,public)




    public static Operation PRED_times_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_boyer::times_3_var, FILE_boyer::times_3_int, FILE_boyer::times_3_int, FILE_boyer::times_3_int, FILE_boyer::times_3_var, FILE_boyer::times_3_int); 
    }

    private final static Operation times_3_var(Prolog m) { 
        m.jtry3(null, FILE_boyer::times_3_var_1);
        return times_3_1(m);
    }

    private final static Operation times_3_var_1(Prolog m) { 
        m.retry(null, FILE_boyer::times_3_var_2);
        return times_3_2(m);
    }

    private final static Operation times_3_var_2(Prolog m) { 
        m.retry(null, FILE_boyer::times_3_var_3);
        return times_3_3(m);
    }

    private final static Operation times_3_var_3(Prolog m) { 
        m.trust(null);
        return times_3_4(m);
    }

    private final static Operation times_3_int(Prolog m) { 
        m.jtry3(null, FILE_boyer::times_3_int_1);
        return times_3_1(m);
    }

    private final static Operation times_3_int_1(Prolog m) { 
        m.retry(null, FILE_boyer::times_3_int_2);
        return times_3_3(m);
    }

    private final static Operation times_3_int_2(Prolog m) { 
        m.trust(null);
        return times_3_4(m);
    }

    private final static Operation times_3_1(Prolog m) { 
    // times(A,myplus(B,C),myplus(times(A,B),times(A,C))):-!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // times(A,myplus(B,C),myplus(times(A,B),times(A,C))):-['$neck_cut']
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_myplus_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_myplus_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_times_2 , m.trail, a1, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_times_2 , m.trail, a1, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation times_3_2(Prolog m) { 
    // times(times(A,B),C,times(A,times(B,C))):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // times(times(A,B),C,times(A,times(B,C))):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_times_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_times_2 , m.trail, a4, a6)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_times_2 , m.trail, a5, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation times_3_3(Prolog m) { 
    // times(A,boyer_difference(B,C),boyer_difference(times(B,A),times(C,A))):-!
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // times(A,boyer_difference(B,C),boyer_difference(times(B,A),times(C,A))):-['$neck_cut']
        a2 = a2.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_boyer_difference_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_boyer_difference_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_times_2 , m.trail, a4, a1)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_times_2 , m.trail, a5, a1)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation times_3_4(Prolog m) { 
    // times(A,add1(B),if(numberp(B),myplus(A,times(A,B)),fix(A))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // times(A,add1(B),if(numberp(B),myplus(A,times(A,B)),fix(A))):-[]
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_add1_1 , m.trail, a4)){
                return m.fail();
            }
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_if_3 , m.trail, a5, a6, a7)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_numberp_1 , m.trail, a4)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_myplus_2 , m.trail, a1, a8)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_times_2 , m.trail, a1, a4)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_fix_1 , m.trail, a1)){
                return m.fail();
            }
        return cont;
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("go",0,FILE_boyer::PRED_go_0_static_exec);
   PredTable.registerBuiltin("top",0,FILE_boyer::PRED_top_0_static_exec);
   PredTable.registerBuiltin("wff",1,FILE_boyer::PRED_wff_1_static_exec);
   PredTable.registerBuiltin("tautology",1,FILE_boyer::PRED_tautology_1_static_exec);
   PredTable.registerBuiltin("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl","$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl",6,FILE_boyer::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl","$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl",2,FILE_boyer::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl","$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl",5,FILE_boyer::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_5_static_exec);
   PredTable.registerBuiltin("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl","$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl",4,FILE_boyer::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_4_static_exec);
   PredTable.registerBuiltin("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl","$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl",6,FILE_boyer::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_6_static_exec);
   PredTable.registerBuiltin("tautology",3,FILE_boyer::PRED_tautology_3_static_exec);
   PredTable.registerBuiltin("rewrite",2,FILE_boyer::PRED_rewrite_2_static_exec);
   PredTable.registerBuiltin("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/boyer.pl","$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl",3,FILE_boyer::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fboyer$002Epl_3_static_exec);
   PredTable.registerBuiltin("rewrite_args",3,FILE_boyer::PRED_rewrite_args_3_static_exec);
   PredTable.registerBuiltin("truep",2,FILE_boyer::PRED_truep_2_static_exec);
   PredTable.registerBuiltin("falsep",2,FILE_boyer::PRED_falsep_2_static_exec);
   PredTable.registerBuiltin("boyer_member",2,FILE_boyer::PRED_boyer_member_2_static_exec);
   PredTable.registerBuiltin("equal",2,FILE_boyer::PRED_equal_2_static_exec);
   PredTable.registerBuiltin("boyer_difference",3,FILE_boyer::PRED_boyer_difference_3_static_exec);
   PredTable.registerBuiltin("eq",3,FILE_boyer::PRED_eq_3_static_exec);
   PredTable.registerBuiltin("exp",3,FILE_boyer::PRED_exp_3_static_exec);
   PredTable.registerBuiltin("gcd",3,FILE_boyer::PRED_gcd_3_static_exec);
   PredTable.registerBuiltin("mylength",2,FILE_boyer::PRED_mylength_2_static_exec);
   PredTable.registerBuiltin("lessp",3,FILE_boyer::PRED_lessp_3_static_exec);
   PredTable.registerBuiltin("meaning",3,FILE_boyer::PRED_meaning_3_static_exec);
   PredTable.registerBuiltin("myboyer_member",3,FILE_boyer::PRED_myboyer_member_3_static_exec);
   PredTable.registerBuiltin("nth",3,FILE_boyer::PRED_nth_3_static_exec);
   PredTable.registerBuiltin("myplus",3,FILE_boyer::PRED_myplus_3_static_exec);
   PredTable.registerBuiltin("power_eval",3,FILE_boyer::PRED_power_eval_3_static_exec);
   PredTable.registerBuiltin("quotient",3,FILE_boyer::PRED_quotient_3_static_exec);
   PredTable.registerBuiltin("remainder",3,FILE_boyer::PRED_remainder_3_static_exec);
   PredTable.registerBuiltin("reverse_loop",3,FILE_boyer::PRED_reverse_loop_3_static_exec);
   PredTable.registerBuiltin("times",3,FILE_boyer::PRED_times_3_static_exec);
}
}

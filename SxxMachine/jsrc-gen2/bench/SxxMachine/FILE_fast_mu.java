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
public class FILE_fast_mu extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl
*/
    // main(top/0,public)
        final static Functor ATOM_m = SYM("m");
        final static Functor ATOM_u = SYM("u");
        final static Functor ATOM_i = SYM("i");
    private static final Compound L_top_0_s5 = CONS( ATOM_u ,  Prolog.Nil );
    private static final Compound L_top_0_s6 = CONS( ATOM_i , L_top_0_s5);
    private static final Compound L_top_0_s7 = CONS( ATOM_i , L_top_0_s6);
    private static final Compound L_top_0_s8 = CONS( ATOM_u , L_top_0_s7);
    private static final Compound L_top_0_s9 = CONS( ATOM_m , L_top_0_s8);




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-theorem([m,u,i,i,u])
        m.setB0();
    // top:-[theorem([m,u,i,i,u])]
        return //
 Op("theorem", FILE_fast_mu::PRED_theorem_1_static_exec, VA(L_top_0_s9), cont);
    }
/** PREDICATE: theorem/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl
*/
    // main(theorem/1,public)
        final static Functor FUNCTOR_$002D_2 = F("-",2);
    private static final Compound L_theorem_1_s6 = CONS( ATOM_i ,  Prolog.Nil );
    private static final Compound L_theorem_1_s7 = CONS( ATOM_m , L_theorem_1_s6);




    public static Operation PRED_theorem_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // theorem(A):-length(A,B),C is B-1,derive([m,i],A,1,C,D,0)
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1, p2;
        a1 = LARG[0];
    // theorem(A):-[length(A,B),C is B-1,derive([m,i],A,1,C,D,0)]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
    // put_str_args([a(2),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$002D_2 , a2,  int_1 );
 ;
        return //
 Op("length", FILE_fast_mu::PRED_length_2_static_exec, VA(a1, a2), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a3, a4), //
 Op("derive", FILE_fast_mu::PRED_derive_6_static_exec, VA(L_theorem_1_s7, a1,  int_1 , a3, m.DONT_CARE2(),  int_0 ), cont)));
    }
/** PREDICATE: derive/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl
*/
    // main(derive/6,public)
        final static Functor FUNCTOR_$002B_2 = F("+",2);

    // private final Term arg5, arg6;




    public static Operation PRED_derive_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return derive_6_top(m);
    }

    private final static Operation derive_6_top(Prolog m) { 
        m.setB0();
        m.jtry6(null, FILE_fast_mu::derive_6_sub_1);
        return derive_6_1(m);
    }

    private final static Operation derive_6_sub_1(Prolog m) { 
        m.trust(null);
        return derive_6_2(m);
    }

    private final static Operation derive_6_1(Prolog m) { 
    // derive(A,B,C,D,E,F):-derive2(A,B,C,D,1,E,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // derive(A,B,C,D,E,F):-[derive2(A,B,C,D,1,E,F)]
        return //
 Op("derive2", FILE_fast_mu::PRED_derive2_7_static_exec, VA(a1, a2, a3, a4,  int_1 , a5, a6), cont);
    }

    private final static Operation derive_6_2(Prolog m) { 
    // derive(A,B,C,D,E,F):-G is F+1,derive(A,B,C,D,E,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // derive(A,B,C,D,E,F):-[G is F+1,derive(A,B,C,D,E,G)]
        a7 = m.mkvar1();
    // put_str_args([a(6),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(8))
        a8 =  S( FUNCTOR_$002B_2 , a6,  int_1 );
 ;
        //START inline expansion of a(7)is a(8)
        if (! a7.unify(Arithmetic.evaluate(a8), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a1;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a7;
m.cont = cont;
        return derive_6_top(m);
    }
/** PREDICATE: derive2/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl
*/
    // main(derive2/7,public)
        final static Functor FUNCTOR_rule_2 = F("rule",2);

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_derive2_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_fast_mu::derive2_7_sub_1);
        return derive2_7_1(m);
    }

    private final static Operation derive2_7_sub_1(Prolog m) { 
        m.trust(null);
        return derive2_7_2(m);
    }

    private final static Operation derive2_7_1(Prolog m) { 
    // derive2(A,A,B,B,C,[],D):-true
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // derive2(A,A,B,B,C,[],D):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a6, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation derive2_7_2(Prolog m) { 
    // derive2(A,B,C,D,E,[rule(F,G)|H],I):-lower_bound(C,D,J),I>=J,K is I-1,rule(A,G,C,L,E,M,F),derive2(G,B,L,D,M,H,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // derive2(A,B,C,D,E,[rule(F,G)|H],I):-[lower_bound(C,D,J),'$greater_or_equal'(I,J),K is I-1,rule(A,G,C,L,E,M,F),derive2(G,B,L,D,M,H,K)]
        a6 = a6.dref();
        if (a6 .isCons()){
                        a8 = a6.car();
            a9 = a6.cdr();
        } else if (a6.isVar()){
            a8 = m.mkvar2();
            a9 = m.mkvar2();
             a6.bind(CONS(a8, a9), m.trail);
        } else {
            return m.fail();
        }
        a8 = a8.dref();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_rule_2 , m.trail, a10, a11)){
                return m.fail();
            }
        a12 = m.mkvar1();
        a13 = m.mkvar1();
    // put_str_args([a(7),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(14))
        a14 =  S( FUNCTOR_$002D_2 , a7,  int_1 );
 ;
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        return //
 Op("lower_bound", FILE_fast_mu::PRED_lower_bound_3_static_exec, VA(a3, a4, a12), //
 Op("$greater_or_equal", FILE_fast_mu::PRED_$greater_or_equal_2_static_exec, VA(a7, a12), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a13, a14), //
 Op("rule", FILE_fast_mu::PRED_rule_7_static_exec, VA(a1, a11, a3, a15, a5, a16, a10), //
 Op("derive2", FILE_fast_mu::PRED_derive2_7_static_exec, VA(a11, a2, a15, a4, a16, a9, a13), cont)))));
    }
/** PREDICATE: rule/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl
*/
    // main(rule/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_rule_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rule([m|A],[m|B],C,D,E,F,G):-rule(A,B,C,D,E,F,1,i,G,H,H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
    // rule([m|A],[m|B],C,D,E,F,G):-[rule(A,B,C,D,E,F,1,i,G,H,H)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        if (!  ATOM_m .unify(a1.car(), m.trail))
                return m.fail();
            a8 = a1.cdr();
        } else if (a1.isVar()){
            a8 = m.mkvar2();
             a1.bind(CONS( ATOM_m , a8), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (!  ATOM_m .unify(a2.car(), m.trail))
                return m.fail();
            a9 = a2.cdr();
        } else if (a2.isVar()){
            a9 = m.mkvar2();
             a2.bind(CONS( ATOM_m , a9), m.trail);
        } else {
            return m.fail();
        }
        a10 = m.mkvar1();
        return //
 Op("rule", FILE_fast_mu::PRED_rule_11_static_exec, VA(a8, a9, a3, a4, a5, a6,  int_1 ,  ATOM_i , a7, a10, a10), cont);
    }
/** PREDICATE: rule/11
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl
*/
    // main(rule/11,public)
    private static final Compound L_rule_11_s3 = CONS( ATOM_i ,  Prolog.Nil );
    private static final Compound L_rule_11_s5 = CONS( ATOM_u ,  Prolog.Nil );
    private static final Compound L_rule_11_s6 = CONS( ATOM_i , L_rule_11_s5);

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;




    public static Operation PRED_rule_11_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return rule_11_top(m);
    }

    private final static Operation rule_11_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_fast_mu::rule_11_var, fail_0, fail_0, FILE_fast_mu::rule_11_2, fail_0, FILE_fast_mu::rule_11_lis); 
    }

    private final static Operation rule_11_var(Prolog m) { 
        m.jtry(11, null, FILE_fast_mu::rule_11_var_1);
        return rule_11_1(m);
    }

    private final static Operation rule_11_var_1(Prolog m) { 
        m.retry(null, FILE_fast_mu::rule_11_var_2);
        return rule_11_2(m);
    }

    private final static Operation rule_11_var_2(Prolog m) { 
        m.retry(null, FILE_fast_mu::rule_11_var_3);
        return rule_11_3(m);
    }

    private final static Operation rule_11_var_3(Prolog m) { 
        m.retry(null, FILE_fast_mu::rule_11_var_4);
        return rule_11_4(m);
    }

    private final static Operation rule_11_var_4(Prolog m) { 
        m.trust(null);
        return rule_11_5(m);
    }

    private final static Operation rule_11_lis(Prolog m) { 
        m.jtry(11, null, FILE_fast_mu::rule_11_lis_1);
        return rule_11_1(m);
    }

    private final static Operation rule_11_lis_1(Prolog m) { 
        m.retry(null, FILE_fast_mu::rule_11_lis_2);
        return rule_11_3(m);
    }

    private final static Operation rule_11_lis_2(Prolog m) { 
        m.retry(null, FILE_fast_mu::rule_11_lis_3);
        return rule_11_4(m);
    }

    private final static Operation rule_11_lis_3(Prolog m) { 
        m.trust(null);
        return rule_11_5(m);
    }

    private final static Operation rule_11_1(Prolog m) { 
    // rule([i],[i,u],A,B,C,D,E,F,1,G,H):-E>=C,D is E-2,B is A+1
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // rule([i],[i,u],A,B,C,D,E,F,1,G,H):-['$greater_or_equal'(E,C),D is E-2,B is A+1]
        if (! L_rule_11_s3.unify(a1, m.trail))
            return m.fail();
        if (! L_rule_11_s6.unify(a2, m.trail))
            return m.fail();
        if (!  int_1 .unify(a9, m.trail))
            return m.fail();
        //START inline expansion of $greater_or_equal(a(7),a(5))
        if (Arithmetic.evaluate(a7).arithCompareTo(Arithmetic.evaluate(a5)) < 0) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(7),@(int_2)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(12))
        a12 =  S( FUNCTOR_$002D_2 , a7,  int_2 );
 ;
        //START inline expansion of a(6)is a(12)
        if (! a6.unify(Arithmetic.evaluate(a12), m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(3),@(int_1)],y(2)),put_str(@('FUNCTOR_$002B_2'),y(2),a(13))
        a13 =  S( FUNCTOR_$002B_2 , a3,  int_1 );
 ;
        //START inline expansion of a(4)is a(13)
        if (! a4.unify(Arithmetic.evaluate(a13), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation rule_11_2(Prolog m) { 
    // rule([],A,B,C,D,1,E,F,2,A,[]):-C is B+B
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // rule([],A,B,C,D,1,E,F,2,A,[]):-[C is B+B]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a6, m.trail))
            return m.fail();
        if (!  int_2 .unify(a9, m.trail))
            return m.fail();
        if (! a2.unify(a10, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a11, m.trail))
            return m.fail();
    // put_str_args([a(3),a(3)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(12))
        a12 =  S( FUNCTOR_$002B_2 , a3, a3);
 ;
        //START inline expansion of a(4)is a(12)
        if (! a4.unify(Arithmetic.evaluate(a12), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation rule_11_3(Prolog m) { 
    // rule([i,i,i|A],[u|A],B,C,D,E,F,G,3,H,I):-F>=D,E is F-1,C is B-2
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // rule([i,i,i|A],[u|A],B,C,D,E,F,G,3,H,I):-['$greater_or_equal'(F,D),E is F-1,C is B-2]
        a1 = a1.dref();
        if (a1 .isCons()){
                        if (!  ATOM_i .unify(a1.car(), m.trail))
                return m.fail();
            a12 = a1.cdr();
        } else if (a1.isVar()){
            a12 = m.mkvar2();
             a1.bind(CONS( ATOM_i , a12), m.trail);
        } else {
            return m.fail();
        }
        a12 = a12.dref();
        if (a12 .isCons()){
                        if (!  ATOM_i .unify(a12.car(), m.trail))
                return m.fail();
            a13 = a12.cdr();
        } else if (a12.isVar()){
            a13 = m.mkvar2();
             a12.bind(CONS( ATOM_i , a13), m.trail);
        } else {
            return m.fail();
        }
        a13 = a13.dref();
        if (a13 .isCons()){
                        if (!  ATOM_i .unify(a13.car(), m.trail))
                return m.fail();
            a14 = a13.cdr();
        } else if (a13.isVar()){
            a14 = m.mkvar2();
             a13.bind(CONS( ATOM_i , a14), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (!  ATOM_u .unify(a2.car(), m.trail))
                return m.fail();
            if (! a14.unify(a2.cdr(), m.trail))
                return m.fail();
        } else if (a2.isVar()){
             a2.bind(CONS( ATOM_u , a14), m.trail);
        } else {
            return m.fail();
        }
        if (!  int_3 .unify(a9, m.trail))
            return m.fail();
        //START inline expansion of $greater_or_equal(a(7),a(5))
        if (Arithmetic.evaluate(a7).arithCompareTo(Arithmetic.evaluate(a5)) < 0) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(7),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(15))
        a15 =  S( FUNCTOR_$002D_2 , a7,  int_1 );
 ;
        //START inline expansion of a(6)is a(15)
        if (! a6.unify(Arithmetic.evaluate(a15), m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(3),@(int_2)],y(2)),put_str(@('FUNCTOR_$002D_2'),y(2),a(16))
        a16 =  S( FUNCTOR_$002D_2 , a3,  int_2 );
 ;
        //START inline expansion of a(4)is a(16)
        if (! a4.unify(Arithmetic.evaluate(a16), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation rule_11_4(Prolog m) { 
    // rule([u,u|A],A,B,C,D,E,F,i,4,G,H):-F>=D,E is F-2,C is B-2
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // rule([u,u|A],A,B,C,D,E,F,i,4,G,H):-['$greater_or_equal'(F,D),E is F-2,C is B-2]
        a1 = a1.dref();
        if (a1 .isCons()){
                        if (!  ATOM_u .unify(a1.car(), m.trail))
                return m.fail();
            a12 = a1.cdr();
        } else if (a1.isVar()){
            a12 = m.mkvar2();
             a1.bind(CONS( ATOM_u , a12), m.trail);
        } else {
            return m.fail();
        }
        a12 = a12.dref();
        if (a12 .isCons()){
                        if (!  ATOM_u .unify(a12.car(), m.trail))
                return m.fail();
            a13 = a12.cdr();
        } else if (a12.isVar()){
            a13 = m.mkvar2();
             a12.bind(CONS( ATOM_u , a13), m.trail);
        } else {
            return m.fail();
        }
        if (! a13.unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_i .unify(a8, m.trail))
            return m.fail();
        if (!  int_4 .unify(a9, m.trail))
            return m.fail();
        //START inline expansion of $greater_or_equal(a(7),a(5))
        if (Arithmetic.evaluate(a7).arithCompareTo(Arithmetic.evaluate(a5)) < 0) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(7),@(int_2)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(14))
        a14 =  S( FUNCTOR_$002D_2 , a7,  int_2 );
 ;
        //START inline expansion of a(6)is a(14)
        if (! a6.unify(Arithmetic.evaluate(a14), m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(3),@(int_2)],y(2)),put_str(@('FUNCTOR_$002D_2'),y(2),a(15))
        a15 =  S( FUNCTOR_$002D_2 , a3,  int_2 );
 ;
        //START inline expansion of a(4)is a(15)
        if (! a4.unify(Arithmetic.evaluate(a15), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation rule_11_5(Prolog m) { 
    // rule([A|B],[A|C],D,E,F,G,H,I,J,K,[A|L]):-M is H+1,rule(B,C,D,E,F,G,M,A,J,K,L)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // rule([A|B],[A|C],D,E,F,G,H,I,J,K,[A|L]):-[M is H+1,rule(B,C,D,E,F,G,M,A,J,K,L)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a12 = a1.car();
            a13 = a1.cdr();
        } else if (a1.isVar()){
            a12 = m.mkvar2();
            a13 = m.mkvar2();
             a1.bind(CONS(a12, a13), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a12.unify(a2.car(), m.trail))
                return m.fail();
            a14 = a2.cdr();
        } else if (a2.isVar()){
            a14 = m.mkvar2();
             a2.bind(CONS(a12, a14), m.trail);
        } else {
            return m.fail();
        }
        a11 = a11.dref();
        if (a11 .isCons()){
                        if (! a12.unify(a11.car(), m.trail))
                return m.fail();
            a15 = a11.cdr();
        } else if (a11.isVar()){
            a15 = m.mkvar2();
             a11.bind(CONS(a12, a15), m.trail);
        } else {
            return m.fail();
        }
        a16 = m.mkvar1();
    // put_str_args([a(7),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(17))
        a17 =  S( FUNCTOR_$002B_2 , a7,  int_1 );
 ;
        //START inline expansion of a(16)is a(17)
        if (! a16.unify(Arithmetic.evaluate(a17), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a13;
        m.AREGS[1] = a14;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a6;
        m.AREGS[6] = a16;
        m.AREGS[7] = a12;
        m.AREGS[8] = a9;
        m.AREGS[9] = a10;
        m.AREGS[10] = a15;
m.cont = cont;
        return rule_11_top(m);
    }
/** PREDICATE: lower_bound/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl
*/
    // main(lower_bound/3,public)
        final static Functor FUNCTOR_$002F$005C_2 = F("/\\",2);




    public static Operation PRED_lower_bound_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_fast_mu::lower_bound_3_sub_1);
        return lower_bound_3_1(m);
    }

    private final static Operation lower_bound_3_sub_1(Prolog m) { 
        m.retry(null, FILE_fast_mu::lower_bound_3_sub_2);
        return lower_bound_3_2(m);
    }

    private final static Operation lower_bound_3_sub_2(Prolog m) { 
        m.trust(null);
        return lower_bound_3_3(m);
    }

    private final static Operation lower_bound_3_1(Prolog m) { 
    // lower_bound(A,B,1):-A<B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // lower_bound(A,B,1):-['$less_than'(A,B)]
        if (!  int_1 .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $less_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation lower_bound_3_2(Prolog m) { 
    // lower_bound(A,A,2):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // lower_bound(A,A,2):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (!  int_2 .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation lower_bound_3_3(Prolog m) { 
    // lower_bound(A,B,C):-A>B,D is A-B,E is D/\1,'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl'(C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // lower_bound(A,B,C):-['$greater_than'(A,B),D is A-B,E is D/\1,'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl'(C,D,E)]
        //START inline expansion of $greater_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002D_2 , a1, a2);
 ;
        //START inline expansion of a(4)is a(5)
        if (! a4.unify(Arithmetic.evaluate(a5), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a6 = m.mkvar1();
    // put_str_args([a(4),@(int_1)],y(2)),put_str(@('FUNCTOR_$002F$005C_2'),y(2),a(7))
        a7 =  S( FUNCTOR_$002F$005C_2 , a4,  int_1 );
 ;
        //START inline expansion of a(6)is a(7)
        if (! a6.unify(Arithmetic.evaluate(a7), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl", FILE_fast_mu::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Ffast_mu$002Epl_3_static_exec, VA(a3, a4, a6), cont);
    }
/** PREDICATE: $dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl
*/
    // main('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl'/3,public)
        final static Functor FUNCTOR_$003E$003E_2 = F(">>",2);




    public static Operation PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Ffast_mu$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_fast_mu::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Ffast_mu$002Epl_3_sub_1);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Ffast_mu$002Epl_3_1(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Ffast_mu$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Ffast_mu$002Epl_3_2(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Ffast_mu$002Epl_3_1(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl'(A,B,C):-C=:=0,!,A is B>>1
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl'(A,B,C):-['$get_level'(D),E is 0,'$arith_equal'(C,E),'$cut'(D),A is B>>1]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        //START inline expansion of a(5)is@(int_0)
        if (! a5.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $arith_equal(a(3),a(5))
        if (Arithmetic.evaluate(a3).arithCompareTo(Arithmetic.evaluate(a5)) != 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
    // put_str_args([a(2),@(int_1)],y(1)),put_str(@('FUNCTOR_$003E$003E_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$003E$003E_2 , a2,  int_1 );
 ;
        //START inline expansion of a(1)is a(6)
        if (! a1.unify(Arithmetic.evaluate(a6), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Ffast_mu$002Epl_3_2(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl'(A,B,C):-A is (B+1)>>1+1
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl'(A,B,C):-[A is (B+1)>>1+1]
    // put_str_args([a(2),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$002B_2 , a2,  int_1 );
 ;
    // put_str_args([a(4),@(int_1)],y(2)),put_str(@('FUNCTOR_$003E$003E_2'),y(2),a(5))
        a5 =  S( FUNCTOR_$003E$003E_2 , a4,  int_1 );
 ;
    // put_str_args([a(5),@(int_1)],y(3)),put_str(@('FUNCTOR_$002B_2'),y(3),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a5,  int_1 );
 ;
        //START inline expansion of a(1)is a(6)
        if (! a1.unify(Arithmetic.evaluate(a6), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_fast_mu::PRED_top_0_static_exec);
   PredTable.registerBuiltin("theorem",1,FILE_fast_mu::PRED_theorem_1_static_exec);
   PredTable.registerBuiltin("derive",6,FILE_fast_mu::PRED_derive_6_static_exec);
   PredTable.registerBuiltin("derive2",7,FILE_fast_mu::PRED_derive2_7_static_exec);
   PredTable.registerBuiltin("rule",7,FILE_fast_mu::PRED_rule_7_static_exec);
   PredTable.registerBuiltin("rule",11,FILE_fast_mu::PRED_rule_11_static_exec);
   PredTable.registerBuiltin("lower_bound",3,FILE_fast_mu::PRED_lower_bound_3_static_exec);
   PredTable.registerBuiltin("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/fast_mu.pl","$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Ffast_mu$002Epl",3,FILE_fast_mu::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Ffast_mu$002Epl_3_static_exec);
}
}

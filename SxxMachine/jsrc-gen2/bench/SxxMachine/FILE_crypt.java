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
public class FILE_crypt extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/crypt.pl
*/
    // main(top/0,public)




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-odd(A),even(B),even(C),even(D),mult([C,B,A],D,[E,F,G,H|I]),lefteven(H),odd(G),even(F),even(E),zero(I),lefteven(J),mult([C,B,A],J,[K,L,M|N]),lefteven(M),odd(L),even(K),zero(N),sum([E,F,G,H],[0,K,L,M],[O,P,Q,R|S]),odd(R),odd(Q),even(P),even(O),zero(S)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21;
    // top:-[odd(A),even(B),even(C),even(D),mult([C,B,A],D,[E,F,G,H|I]),lefteven(H),odd(G),even(F),even(E),zero(I),lefteven(J),mult([C,B,A],J,[K,L,M|N]),lefteven(M),odd(L),even(K),zero(N),sum([E,F,G,H],[0,K,L,M],[O,P,Q,R|S]),odd(R),odd(Q),even(P),even(O),zero(S)]
        a1 = m.mkvar1();
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = CONS(a1,  Prolog.Nil );
        a6 = CONS(a2, a5);
        a7 = CONS(a3, a6);
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = CONS(a11, a12);
        a14 = CONS(a10, a13);
        a15 = CONS(a9, a14);
        a16 = CONS(a8, a15);
        a17 = m.mkvar1();
        a18 = CONS(a1,  Prolog.Nil );
        a19 = CONS(a2, a18);
        a20 = CONS(a3, a19);
        a21 = m.mkvar1();
        a22 = m.mkvar1();
        a23 = m.mkvar1();
        a24 = m.mkvar1();
        a25 = CONS(a23, a24);
        a26 = CONS(a22, a25);
        a27 = CONS(a21, a26);
        a28 = CONS(a11,  Prolog.Nil );
        a29 = CONS(a10, a28);
        a30 = CONS(a9, a29);
        a31 = CONS(a8, a30);
        a32 = CONS(a23,  Prolog.Nil );
        a33 = CONS(a22, a32);
        a34 = CONS(a21, a33);
        a35 = CONS( int_0 , a34);
        a36 = m.mkvar1();
        a37 = m.mkvar1();
        a38 = m.mkvar1();
        a39 = m.mkvar1();
        a40 = m.mkvar1();
        a41 = CONS(a39, a40);
        a42 = CONS(a38, a41);
        a43 = CONS(a37, a42);
        a44 = CONS(a36, a43);
        return //
 Op("odd", FILE_crypt::PRED_odd_1_static_exec, VA(a1), //
 Op("even", FILE_crypt::PRED_even_1_static_exec, VA(a2), //
 Op("even", FILE_crypt::PRED_even_1_static_exec, VA(a3), //
 Op("even", FILE_crypt::PRED_even_1_static_exec, VA(a4), //
 Op("mult", FILE_crypt::PRED_mult_3_static_exec, VA(a7, a4, a16), //
 Op("lefteven", FILE_crypt::PRED_lefteven_1_static_exec, VA(a11), //
 Op("odd", FILE_crypt::PRED_odd_1_static_exec, VA(a10), //
 Op("even", FILE_crypt::PRED_even_1_static_exec, VA(a9), //
 Op("even", FILE_crypt::PRED_even_1_static_exec, VA(a8), //
 Op("zero", FILE_crypt::PRED_zero_1_static_exec, VA(a12), //
 Op("lefteven", FILE_crypt::PRED_lefteven_1_static_exec, VA(a17), //
 Op("mult", FILE_crypt::PRED_mult_3_static_exec, VA(a20, a17, a27), //
 Op("lefteven", FILE_crypt::PRED_lefteven_1_static_exec, VA(a23), //
 Op("odd", FILE_crypt::PRED_odd_1_static_exec, VA(a22), //
 Op("even", FILE_crypt::PRED_even_1_static_exec, VA(a21), //
 Op("zero", FILE_crypt::PRED_zero_1_static_exec, VA(a24), //
 Op("sum", FILE_crypt::PRED_sum_3_static_exec, VA(a31, a35, a44), //
 Op("odd", FILE_crypt::PRED_odd_1_static_exec, VA(a39), //
 Op("odd", FILE_crypt::PRED_odd_1_static_exec, VA(a38), //
 Op("even", FILE_crypt::PRED_even_1_static_exec, VA(a37), //
 Op("even", FILE_crypt::PRED_even_1_static_exec, VA(a36), //
 Op("zero", FILE_crypt::PRED_zero_1_static_exec, VA(a40), cont))))))))))))))))))))));
    }
/** PREDICATE: sum/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/crypt.pl
*/
    // main(sum/3,public)




    public static Operation PRED_sum_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // sum(A,B,C):-sum(A,B,0,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // sum(A,B,C):-[sum(A,B,0,C)]
        return //
 Op("sum", FILE_crypt::PRED_sum_4_static_exec, VA(a1, a2,  int_0 , a3), cont);
    }
/** PREDICATE: sum/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/crypt.pl
*/
    // main(sum/4,public)
        final static Functor FUNCTOR_$002B_2 = F("+",2);
        final static Functor FUNCTOR_mod_2 = F("mod",2);
        final static Functor FUNCTOR_$002F$002F_2 = F("//",2);




    public static Operation PRED_sum_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return sum_4_top(m);
    }

    private final static Operation sum_4_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_crypt::sum_4_var, FILE_crypt::sum_4_3, FILE_crypt::sum_4_3, FILE_crypt::sum_4_con, FILE_crypt::sum_4_3, FILE_crypt::sum_4_lis); 
    }

    private final static Operation sum_4_var(Prolog m) { 
        m.jtry4(null, FILE_crypt::sum_4_var_1);
        return sum_4_1(m);
    }

    private final static Operation sum_4_var_1(Prolog m) { 
        m.retry(null, FILE_crypt::sum_4_var_2);
        return sum_4_2(m);
    }

    private final static Operation sum_4_var_2(Prolog m) { 
        m.retry(null, FILE_crypt::sum_4_var_3);
        return sum_4_3(m);
    }

    private final static Operation sum_4_var_3(Prolog m) { 
        m.retry(null, FILE_crypt::sum_4_var_4);
        return sum_4_4(m);
    }

    private final static Operation sum_4_var_4(Prolog m) { 
        m.retry(null, FILE_crypt::sum_4_var_5);
        return sum_4_5(m);
    }

    private final static Operation sum_4_var_5(Prolog m) { 
        m.trust(null);
        return sum_4_6(m);
    }

    private final static Operation sum_4_con(Prolog m) { 
        m.jtry4(null, FILE_crypt::sum_4_con_1);
        return sum_4_2(m);
    }

    private final static Operation sum_4_con_1(Prolog m) { 
        m.retry(null, FILE_crypt::sum_4_con_2);
        return sum_4_3(m);
    }

    private final static Operation sum_4_con_2(Prolog m) { 
        m.retry(null, FILE_crypt::sum_4_con_3);
        return sum_4_4(m);
    }

    private final static Operation sum_4_con_3(Prolog m) { 
        m.trust(null);
        return sum_4_6(m);
    }

    private final static Operation sum_4_lis(Prolog m) { 
        m.jtry4(null, FILE_crypt::sum_4_lis_1);
        return sum_4_1(m);
    }

    private final static Operation sum_4_lis_1(Prolog m) { 
        m.retry(null, FILE_crypt::sum_4_lis_2);
        return sum_4_3(m);
    }

    private final static Operation sum_4_lis_2(Prolog m) { 
        m.trust(null);
        return sum_4_5(m);
    }

    private final static Operation sum_4_1(Prolog m) { 
    // sum([A|B],[C|D],E,[F|G]):-!,H is A+C+E,F is H mod 10,I is H//10,sum(B,D,I,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // sum([A|B],[C|D],E,[F|G]):-['$neck_cut',H is A+C+E,F is H mod 10,I is H//10,sum(B,D,I,G)]
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
        a2 = a2.dref();
        if (a2 .isCons()){
                        a7 = a2.car();
            a8 = a2.cdr();
        } else if (a2.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a2.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
        if (a4 .isCons()){
                        a9 = a4.car();
            a10 = a4.cdr();
        } else if (a4.isVar()){
            a9 = m.mkvar2();
            a10 = m.mkvar2();
             a4.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a11 = m.mkvar1();
    // put_str_args([a(5),a(7)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(12))
        a12 =  S( FUNCTOR_$002B_2 , a5, a7);
 ;
    // put_str_args([a(12),a(3)],y(2)),put_str(@('FUNCTOR_$002B_2'),y(2),a(13))
        a13 =  S( FUNCTOR_$002B_2 , a12, a3);
 ;
        //START inline expansion of a(11)is a(13)
        if (! a11.unify(Arithmetic.evaluate(a13), m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(11),@(int_10)],y(3)),put_str(@('FUNCTOR_mod_2'),y(3),a(14))
        a14 =  S( FUNCTOR_mod_2 , a11,  int_10 );
 ;
        //START inline expansion of a(9)is a(14)
        if (! a9.unify(Arithmetic.evaluate(a14), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a15 = m.mkvar1();
    // put_str_args([a(11),@(int_10)],y(4)),put_str(@('FUNCTOR_$002F$002F_2'),y(4),a(16))
        a16 =  S( FUNCTOR_$002F$002F_2 , a11,  int_10 );
 ;
        //START inline expansion of a(15)is a(16)
        if (! a15.unify(Arithmetic.evaluate(a16), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a6;
        m.AREGS[1] = a8;
        m.AREGS[2] = a15;
        m.AREGS[3] = a10;
m.cont = cont;
        return sum_4_top(m);
    }

    private final static Operation sum_4_2(Prolog m) { 
    // sum([],A,0,A):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // sum([],A,0,A):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        if (! a2.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation sum_4_3(Prolog m) { 
    // sum(A,[],0,A):-!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // sum(A,[],0,A):-['$neck_cut']
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        if (! a1.unify(a4, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation sum_4_4(Prolog m) { 
    // sum([],[A|B],C,[D|E]):-!,F is A+C,G is F//10,D is F mod 10,sum([],B,G,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // sum([],[A|B],C,[D|E]):-['$neck_cut',F is A+C,G is F//10,D is F mod 10,sum([],B,G,E)]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        a5 = a2.car();
            a6 = a2.cdr();
        } else if (a2.isVar()){
            a5 = m.mkvar2();
            a6 = m.mkvar2();
             a2.bind(CONS(a5, a6), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
        if (a4 .isCons()){
                        a7 = a4.car();
            a8 = a4.cdr();
        } else if (a4.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a4.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a9 = m.mkvar1();
    // put_str_args([a(5),a(3)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$002B_2 , a5, a3);
 ;
        //START inline expansion of a(9)is a(10)
        if (! a9.unify(Arithmetic.evaluate(a10), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a11 = m.mkvar1();
    // put_str_args([a(9),@(int_10)],y(2)),put_str(@('FUNCTOR_$002F$002F_2'),y(2),a(12))
        a12 =  S( FUNCTOR_$002F$002F_2 , a9,  int_10 );
 ;
        //START inline expansion of a(11)is a(12)
        if (! a11.unify(Arithmetic.evaluate(a12), m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(9),@(int_10)],y(3)),put_str(@('FUNCTOR_mod_2'),y(3),a(13))
        a13 =  S( FUNCTOR_mod_2 , a9,  int_10 );
 ;
        //START inline expansion of a(7)is a(13)
        if (! a7.unify(Arithmetic.evaluate(a13), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] =  Prolog.Nil ;
        m.AREGS[1] = a6;
        m.AREGS[2] = a11;
        m.AREGS[3] = a8;
m.cont = cont;
        return sum_4_top(m);
    }

    private final static Operation sum_4_5(Prolog m) { 
    // sum([A|B],[],C,[D|E]):-!,F is A+C,G is F//10,D is F mod 10,sum([],B,G,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // sum([A|B],[],C,[D|E]):-['$neck_cut',F is A+C,G is F//10,D is F mod 10,sum([],B,G,E)]
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
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        a7 = a4.car();
            a8 = a4.cdr();
        } else if (a4.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a4.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a9 = m.mkvar1();
    // put_str_args([a(5),a(3)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$002B_2 , a5, a3);
 ;
        //START inline expansion of a(9)is a(10)
        if (! a9.unify(Arithmetic.evaluate(a10), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a11 = m.mkvar1();
    // put_str_args([a(9),@(int_10)],y(2)),put_str(@('FUNCTOR_$002F$002F_2'),y(2),a(12))
        a12 =  S( FUNCTOR_$002F$002F_2 , a9,  int_10 );
 ;
        //START inline expansion of a(11)is a(12)
        if (! a11.unify(Arithmetic.evaluate(a12), m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(9),@(int_10)],y(3)),put_str(@('FUNCTOR_mod_2'),y(3),a(13))
        a13 =  S( FUNCTOR_mod_2 , a9,  int_10 );
 ;
        //START inline expansion of a(7)is a(13)
        if (! a7.unify(Arithmetic.evaluate(a13), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] =  Prolog.Nil ;
        m.AREGS[1] = a6;
        m.AREGS[2] = a11;
        m.AREGS[3] = a8;
m.cont = cont;
        return sum_4_top(m);
    }

    private final static Operation sum_4_6(Prolog m) { 
    // sum([],[],A,[A]):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // sum([],[],A,[A]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! a3.unify(a4.car(), m.trail))
                return m.fail();
            if (!  Prolog.Nil .unify(a4.cdr(), m.trail))
                return m.fail();
        } else if (a4.isVar()){
             a4.bind(CONS(a3,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }
/** PREDICATE: mult/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/crypt.pl
*/
    // main(mult/3,public)




    public static Operation PRED_mult_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // mult(A,B,C):-mult(A,B,0,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // mult(A,B,C):-[mult(A,B,0,C)]
        return //
 Op("mult", FILE_crypt::PRED_mult_4_static_exec, VA(a1, a2,  int_0 , a3), cont);
    }
/** PREDICATE: mult/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/crypt.pl
*/
    // main(mult/4,public)
        final static Functor FUNCTOR_$002A_2 = F("*",2);




    public static Operation PRED_mult_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return mult_4_top(m);
    }

    private final static Operation mult_4_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_crypt::mult_4_var, fail_0, fail_0, FILE_crypt::mult_4_2, fail_0, FILE_crypt::mult_4_1); 
    }

    private final static Operation mult_4_var(Prolog m) { 
        m.jtry4(null, FILE_crypt::mult_4_var_1);
        return mult_4_1(m);
    }

    private final static Operation mult_4_var_1(Prolog m) { 
        m.trust(null);
        return mult_4_2(m);
    }

    private final static Operation mult_4_1(Prolog m) { 
    // mult([A|B],C,D,[E|F]):-G is A*C+D,E is G mod 10,H is G//10,mult(B,C,H,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // mult([A|B],C,D,[E|F]):-[G is A*C+D,E is G mod 10,H is G//10,mult(B,C,H,F)]
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
                        a7 = a4.car();
            a8 = a4.cdr();
        } else if (a4.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a4.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a9 = m.mkvar1();
    // put_str_args([a(5),a(2)],y(1)),put_str(@('FUNCTOR_$002A_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$002A_2 , a5, a2);
 ;
    // put_str_args([a(10),a(3)],y(2)),put_str(@('FUNCTOR_$002B_2'),y(2),a(11))
        a11 =  S( FUNCTOR_$002B_2 , a10, a3);
 ;
        //START inline expansion of a(9)is a(11)
        if (! a9.unify(Arithmetic.evaluate(a11), m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(9),@(int_10)],y(3)),put_str(@('FUNCTOR_mod_2'),y(3),a(12))
        a12 =  S( FUNCTOR_mod_2 , a9,  int_10 );
 ;
        //START inline expansion of a(7)is a(12)
        if (! a7.unify(Arithmetic.evaluate(a12), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a13 = m.mkvar1();
    // put_str_args([a(9),@(int_10)],y(4)),put_str(@('FUNCTOR_$002F$002F_2'),y(4),a(14))
        a14 =  S( FUNCTOR_$002F$002F_2 , a9,  int_10 );
 ;
        //START inline expansion of a(13)is a(14)
        if (! a13.unify(Arithmetic.evaluate(a14), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
        m.AREGS[2] = a13;
        m.AREGS[3] = a8;
m.cont = cont;
        return mult_4_top(m);
    }

    private final static Operation mult_4_2(Prolog m) { 
    // mult([],A,B,[C,D]):-C is B mod 10,D is B//10
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // mult([],A,B,[C,D]):-[C is B mod 10,D is B//10]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        a5 = a4.car();
            a6 = a4.cdr();
        } else if (a4.isVar()){
            a5 = m.mkvar2();
            a6 = m.mkvar2();
             a4.bind(CONS(a5, a6), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
        if (a6 .isCons()){
                        a7 = a6.car();
            if (!  Prolog.Nil .unify(a6.cdr(), m.trail))
                return m.fail();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
             a6.bind(CONS(a7,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
    // put_str_args([a(3),@(int_10)],y(1)),put_str(@('FUNCTOR_mod_2'),y(1),a(8))
        a8 =  S( FUNCTOR_mod_2 , a3,  int_10 );
 ;
        //START inline expansion of a(5)is a(8)
        if (! a5.unify(Arithmetic.evaluate(a8), m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(3),@(int_10)],y(2)),put_str(@('FUNCTOR_$002F$002F_2'),y(2),a(9))
        a9 =  S( FUNCTOR_$002F$002F_2 , a3,  int_10 );
 ;
        //START inline expansion of a(7)is a(9)
        if (! a7.unify(Arithmetic.evaluate(a9), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: zero/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/crypt.pl
*/
    // main(zero/1,public)




    public static Operation PRED_zero_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return zero_1_top(m);
    }

    private final static Operation zero_1_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_crypt::zero_1_var, fail_0, fail_0, FILE_crypt::zero_1_1, fail_0, FILE_crypt::zero_1_2); 
    }

    private final static Operation zero_1_var(Prolog m) { 
        m.jtry1(null, FILE_crypt::zero_1_var_1);
        return zero_1_1(m);
    }

    private final static Operation zero_1_var_1(Prolog m) { 
        m.trust(null);
        return zero_1_2(m);
    }

    private final static Operation zero_1_1(Prolog m) { 
    // zero([]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // zero([]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation zero_1_2(Prolog m) { 
    // zero([0|A]):-zero(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // zero([0|A]):-[zero(A)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        if (!  int_0 .unify(a1.car(), m.trail))
                return m.fail();
            a2 = a1.cdr();
        } else if (a1.isVar()){
            a2 = m.mkvar2();
             a1.bind(CONS( int_0 , a2), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a2;
m.cont = cont;
        return zero_1_top(m);
    }
/** PREDICATE: odd/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/crypt.pl
*/
    // main(odd/1,public)




    public static Operation PRED_odd_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_crypt::odd_1_var, FILE_crypt::odd_1_var, fail_0, fail_0, fail_0, fail_0); 
    }

    private final static Operation odd_1_var(Prolog m) { 
        m.jtry1(null, FILE_crypt::odd_1_var_1);
        return odd_1_1(m);
    }

    private final static Operation odd_1_var_1(Prolog m) { 
        m.retry(null, FILE_crypt::odd_1_var_2);
        return odd_1_2(m);
    }

    private final static Operation odd_1_var_2(Prolog m) { 
        m.retry(null, FILE_crypt::odd_1_var_3);
        return odd_1_3(m);
    }

    private final static Operation odd_1_var_3(Prolog m) { 
        m.retry(null, FILE_crypt::odd_1_var_4);
        return odd_1_4(m);
    }

    private final static Operation odd_1_var_4(Prolog m) { 
        m.trust(null);
        return odd_1_5(m);
    }

    private final static Operation odd_1_1(Prolog m) { 
    // odd(1):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // odd(1):-[]
        if (!  int_1 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation odd_1_2(Prolog m) { 
    // odd(3):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // odd(3):-[]
        if (!  int_3 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation odd_1_3(Prolog m) { 
    // odd(5):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // odd(5):-[]
        if (!  int_5 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation odd_1_4(Prolog m) { 
    // odd(7):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // odd(7):-[]
        if (!  int_7 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation odd_1_5(Prolog m) { 
    // odd(9):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // odd(9):-[]
        if (!  int_9 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: even/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/crypt.pl
*/
    // main(even/1,public)




    public static Operation PRED_even_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_crypt::even_1_var, FILE_crypt::even_1_var, fail_0, fail_0, fail_0, fail_0); 
    }

    private final static Operation even_1_var(Prolog m) { 
        m.jtry1(null, FILE_crypt::even_1_var_1);
        return even_1_1(m);
    }

    private final static Operation even_1_var_1(Prolog m) { 
        m.retry(null, FILE_crypt::even_1_var_2);
        return even_1_2(m);
    }

    private final static Operation even_1_var_2(Prolog m) { 
        m.retry(null, FILE_crypt::even_1_var_3);
        return even_1_3(m);
    }

    private final static Operation even_1_var_3(Prolog m) { 
        m.retry(null, FILE_crypt::even_1_var_4);
        return even_1_4(m);
    }

    private final static Operation even_1_var_4(Prolog m) { 
        m.trust(null);
        return even_1_5(m);
    }

    private final static Operation even_1_1(Prolog m) { 
    // even(0):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // even(0):-[]
        if (!  int_0 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation even_1_2(Prolog m) { 
    // even(2):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // even(2):-[]
        if (!  int_2 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation even_1_3(Prolog m) { 
    // even(4):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // even(4):-[]
        if (!  int_4 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation even_1_4(Prolog m) { 
    // even(6):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // even(6):-[]
        if (!  int_6 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation even_1_5(Prolog m) { 
    // even(8):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // even(8):-[]
        if (!  int_8 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: lefteven/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/crypt.pl
*/
    // main(lefteven/1,public)




    public static Operation PRED_lefteven_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_crypt::lefteven_1_var, FILE_crypt::lefteven_1_var, fail_0, fail_0, fail_0, fail_0); 
    }

    private final static Operation lefteven_1_var(Prolog m) { 
        m.jtry1(null, FILE_crypt::lefteven_1_var_1);
        return lefteven_1_1(m);
    }

    private final static Operation lefteven_1_var_1(Prolog m) { 
        m.retry(null, FILE_crypt::lefteven_1_var_2);
        return lefteven_1_2(m);
    }

    private final static Operation lefteven_1_var_2(Prolog m) { 
        m.retry(null, FILE_crypt::lefteven_1_var_3);
        return lefteven_1_3(m);
    }

    private final static Operation lefteven_1_var_3(Prolog m) { 
        m.trust(null);
        return lefteven_1_4(m);
    }

    private final static Operation lefteven_1_1(Prolog m) { 
    // lefteven(2):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // lefteven(2):-[]
        if (!  int_2 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation lefteven_1_2(Prolog m) { 
    // lefteven(4):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // lefteven(4):-[]
        if (!  int_4 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation lefteven_1_3(Prolog m) { 
    // lefteven(6):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // lefteven(6):-[]
        if (!  int_6 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation lefteven_1_4(Prolog m) { 
    // lefteven(8):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // lefteven(8):-[]
        if (!  int_8 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_crypt::PRED_top_0_static_exec);
   PredTable.registerBuiltin("sum",3,FILE_crypt::PRED_sum_3_static_exec);
   PredTable.registerBuiltin("sum",4,FILE_crypt::PRED_sum_4_static_exec);
   PredTable.registerBuiltin("mult",3,FILE_crypt::PRED_mult_3_static_exec);
   PredTable.registerBuiltin("mult",4,FILE_crypt::PRED_mult_4_static_exec);
   PredTable.registerBuiltin("zero",1,FILE_crypt::PRED_zero_1_static_exec);
   PredTable.registerBuiltin("odd",1,FILE_crypt::PRED_odd_1_static_exec);
   PredTable.registerBuiltin("even",1,FILE_crypt::PRED_even_1_static_exec);
   PredTable.registerBuiltin("lefteven",1,FILE_crypt::PRED_lefteven_1_static_exec);
}
}

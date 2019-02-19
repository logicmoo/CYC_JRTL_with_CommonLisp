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
public class FILE_zebra extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/zebra.pl
*/
    // main(top/0,public)
        final static Functor FUNCTOR_house_5 = F("house",5);
        final static Functor ATOM_red = SYM("red");
        final static Functor ATOM_english = SYM("english");
        final static Functor ATOM_spanish = SYM("spanish");
        final static Functor ATOM_dog = SYM("dog");
        final static Functor ATOM_green = SYM("green");
        final static Functor ATOM_coffee = SYM("coffee");
        final static Functor ATOM_ukrainian = SYM("ukrainian");
        final static Functor ATOM_tea = SYM("tea");
        final static Functor ATOM_ivory = SYM("ivory");
        final static Functor ATOM_snails = SYM("snails");
        final static Functor ATOM_winstons = SYM("winstons");
        final static Functor ATOM_yellow = SYM("yellow");
        final static Functor ATOM_kools = SYM("kools");
        final static Functor ATOM_milk = SYM("milk");
        final static Functor ATOM_norwegian = SYM("norwegian");
        final static Functor ATOM_chesterfields = SYM("chesterfields");
        final static Functor ATOM_fox = SYM("fox");
        final static Functor ATOM_horse = SYM("horse");
        final static Functor ATOM_orange_juice = SYM("orange_juice");
        final static Functor ATOM_lucky_strikes = SYM("lucky_strikes");
        final static Functor ATOM_japanese = SYM("japanese");
        final static Functor ATOM_parliaments = SYM("parliaments");
        final static Functor ATOM_blue = SYM("blue");
        final static Functor ATOM_zebra = SYM("zebra");
        final static Functor ATOM_water = SYM("water");




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-houses(A),member(house(red,english,B,C,D),A),member(house(E,spanish,dog,F,G),A),member(house(green,H,I,coffee,J),A),member(house(K,ukrainian,L,tea,M),A),right_of(house(green,N,O,P,Q),house(ivory,R,S,T,U),A),member(house(V,W,snails,X,winstons),A),member(house(yellow,Y,Z,A1,kools),A),A=[B1,C1,house(D1,E1,F1,milk,G1),H1,I1],A=[house(J1,norwegian,K1,L1,M1)|N1],next_to(house(O1,P1,Q1,R1,chesterfields),house(S1,T1,fox,U1,V1),A),next_to(house(W1,X1,Y1,Z1,kools),house(A2,B2,horse,C2,D2),A),member(house(E2,F2,G2,orange_juice,lucky_strikes),A),member(house(H2,japanese,I2,J2,parliaments),A),next_to(house(K2,norwegian,L2,M2,N2),house(blue,O2,P2,Q2,R2),A),member(house(S2,T2,zebra,U2,V2),A),member(house(W2,X2,Y2,water,Z2),A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16;
    // top:-[houses(A),member(house(red,english,B,C,D),A),member(house(E,spanish,dog,F,G),A),member(house(green,H,I,coffee,J),A),member(house(K,ukrainian,L,tea,M),A),right_of(house(green,N,O,P,Q),house(ivory,R,S,T,U),A),member(house(V,W,snails,X,winstons),A),member(house(yellow,Y,Z,A1,kools),A),'$unify'(A,[B1,C1,house(D1,E1,F1,milk,G1),H1,I1]),'$unify'(A,[house(J1,norwegian,K1,L1,M1)|N1]),next_to(house(O1,P1,Q1,R1,chesterfields),house(S1,T1,fox,U1,V1),A),next_to(house(W1,X1,Y1,Z1,kools),house(A2,B2,horse,C2,D2),A),member(house(E2,F2,G2,orange_juice,lucky_strikes),A),member(house(H2,japanese,I2,J2,parliaments),A),next_to(house(K2,norwegian,L2,M2,N2),house(blue,O2,P2,Q2,R2),A),member(house(S2,T2,zebra,U2,V2),A),member(house(W2,X2,Y2,water,Z2),A)]
        a1 = m.mkvar1();
    // put_str_args([@('ATOM_red'),@('ATOM_english'),void,void,void],y(1)),put_str(@('FUNCTOR_house_5'),y(1),a(2))
        a2 =  S( FUNCTOR_house_5 ,  ATOM_red ,  ATOM_english , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([void,@('ATOM_spanish'),@('ATOM_dog'),void,void],y(2)),put_str(@('FUNCTOR_house_5'),y(2),a(3))
        a3 =  S( FUNCTOR_house_5 , m.mkvar3(),  ATOM_spanish ,  ATOM_dog , m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_green'),void,void,@('ATOM_coffee'),void],y(3)),put_str(@('FUNCTOR_house_5'),y(3),a(4))
        a4 =  S( FUNCTOR_house_5 ,  ATOM_green , m.mkvar3(), m.mkvar3(),  ATOM_coffee , m.mkvar3());
 ;
    // put_str_args([void,@('ATOM_ukrainian'),void,@('ATOM_tea'),void],y(4)),put_str(@('FUNCTOR_house_5'),y(4),a(5))
        a5 =  S( FUNCTOR_house_5 , m.mkvar3(),  ATOM_ukrainian , m.mkvar3(),  ATOM_tea , m.mkvar3());
 ;
    // put_str_args([@('ATOM_green'),void,void,void,void],y(5)),put_str(@('FUNCTOR_house_5'),y(5),a(6))
        a6 =  S( FUNCTOR_house_5 ,  ATOM_green , m.mkvar3(), m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_ivory'),void,void,void,void],y(6)),put_str(@('FUNCTOR_house_5'),y(6),a(7))
        a7 =  S( FUNCTOR_house_5 ,  ATOM_ivory , m.mkvar3(), m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([void,void,@('ATOM_snails'),void,@('ATOM_winstons')],y(7)),put_str(@('FUNCTOR_house_5'),y(7),a(8))
        a8 =  S( FUNCTOR_house_5 , m.mkvar3(), m.mkvar3(),  ATOM_snails , m.mkvar3(),  ATOM_winstons );
 ;
    // put_str_args([@('ATOM_yellow'),void,void,void,@('ATOM_kools')],y(8)),put_str(@('FUNCTOR_house_5'),y(8),a(9))
        a9 =  S( FUNCTOR_house_5 ,  ATOM_yellow , m.mkvar3(), m.mkvar3(), m.mkvar3(),  ATOM_kools );
 ;
    // put_str_args([void,void,void,@('ATOM_milk'),void],y(9)),put_str(@('FUNCTOR_house_5'),y(9),a(10))
        a10 =  S( FUNCTOR_house_5 , m.mkvar3(), m.mkvar3(), m.mkvar3(),  ATOM_milk , m.mkvar3());
 ;
        a11 = CONS(m.DONT_CARE1(),  Prolog.Nil );
        a12 = CONS(m.DONT_CARE1(), a11);
        a13 = CONS(a10, a12);
        a14 = CONS(m.DONT_CARE1(), a13);
        a15 = CONS(m.DONT_CARE1(), a14);
    // put_str_args([void,@('ATOM_norwegian'),void,void,void],y(10)),put_str(@('FUNCTOR_house_5'),y(10),a(16))
        a16 =  S( FUNCTOR_house_5 , m.mkvar3(),  ATOM_norwegian , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
        a17 = CONS(a16, m.DONT_CARE1());
    // put_str_args([void,void,void,void,@('ATOM_chesterfields')],y(11)),put_str(@('FUNCTOR_house_5'),y(11),a(18))
        a18 =  S( FUNCTOR_house_5 , m.mkvar3(), m.mkvar3(), m.mkvar3(), m.mkvar3(),  ATOM_chesterfields );
 ;
    // put_str_args([void,void,@('ATOM_fox'),void,void],y(12)),put_str(@('FUNCTOR_house_5'),y(12),a(19))
        a19 =  S( FUNCTOR_house_5 , m.mkvar3(), m.mkvar3(),  ATOM_fox , m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([void,void,void,void,@('ATOM_kools')],y(13)),put_str(@('FUNCTOR_house_5'),y(13),a(20))
        a20 =  S( FUNCTOR_house_5 , m.mkvar3(), m.mkvar3(), m.mkvar3(), m.mkvar3(),  ATOM_kools );
 ;
    // put_str_args([void,void,@('ATOM_horse'),void,void],y(14)),put_str(@('FUNCTOR_house_5'),y(14),a(21))
        a21 =  S( FUNCTOR_house_5 , m.mkvar3(), m.mkvar3(),  ATOM_horse , m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([void,void,void,@('ATOM_orange_juice'),@('ATOM_lucky_strikes')],y(15)),put_str(@('FUNCTOR_house_5'),y(15),a(22))
        a22 =  S( FUNCTOR_house_5 , m.mkvar3(), m.mkvar3(), m.mkvar3(),  ATOM_orange_juice ,  ATOM_lucky_strikes );
 ;
    // put_str_args([void,@('ATOM_japanese'),void,void,@('ATOM_parliaments')],y(16)),put_str(@('FUNCTOR_house_5'),y(16),a(23))
        a23 =  S( FUNCTOR_house_5 , m.mkvar3(),  ATOM_japanese , m.mkvar3(), m.mkvar3(),  ATOM_parliaments );
 ;
    // put_str_args([void,@('ATOM_norwegian'),void,void,void],y(17)),put_str(@('FUNCTOR_house_5'),y(17),a(24))
        a24 =  S( FUNCTOR_house_5 , m.mkvar3(),  ATOM_norwegian , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_blue'),void,void,void,void],y(18)),put_str(@('FUNCTOR_house_5'),y(18),a(25))
        a25 =  S( FUNCTOR_house_5 ,  ATOM_blue , m.mkvar3(), m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([void,void,@('ATOM_zebra'),void,void],y(19)),put_str(@('FUNCTOR_house_5'),y(19),a(26))
        a26 =  S( FUNCTOR_house_5 , m.mkvar3(), m.mkvar3(),  ATOM_zebra , m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([void,void,void,@('ATOM_water'),void],y(20)),put_str(@('FUNCTOR_house_5'),y(20),a(27))
        a27 =  S( FUNCTOR_house_5 , m.mkvar3(), m.mkvar3(), m.mkvar3(),  ATOM_water , m.mkvar3());
 ;
        return //
 Op("houses", FILE_zebra::PRED_houses_1_static_exec, VA(a1), //
 Op("member", FILE_zebra::PRED_member_2_static_exec, VA(a2, a1), //
 Op("member", FILE_zebra::PRED_member_2_static_exec, VA(a3, a1), //
 Op("member", FILE_zebra::PRED_member_2_static_exec, VA(a4, a1), //
 Op("member", FILE_zebra::PRED_member_2_static_exec, VA(a5, a1), //
 Op("right_of", FILE_zebra::PRED_right_of_3_static_exec, VA(a6, a7, a1), //
 Op("member", FILE_zebra::PRED_member_2_static_exec, VA(a8, a1), //
 Op("member", FILE_zebra::PRED_member_2_static_exec, VA(a9, a1), //
 Op("$unify", FILE_zebra::PRED_$unify_2_static_exec, VA(a1, a15), //
 Op("$unify", FILE_zebra::PRED_$unify_2_static_exec, VA(a1, a17), //
 Op("next_to", FILE_zebra::PRED_next_to_3_static_exec, VA(a18, a19, a1), //
 Op("next_to", FILE_zebra::PRED_next_to_3_static_exec, VA(a20, a21, a1), //
 Op("member", FILE_zebra::PRED_member_2_static_exec, VA(a22, a1), //
 Op("member", FILE_zebra::PRED_member_2_static_exec, VA(a23, a1), //
 Op("next_to", FILE_zebra::PRED_next_to_3_static_exec, VA(a24, a25, a1), //
 Op("member", FILE_zebra::PRED_member_2_static_exec, VA(a26, a1), //
 Op("member", FILE_zebra::PRED_member_2_static_exec, VA(a27, a1), cont)))))))))))))))));
    }
/** PREDICATE: houses/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/zebra.pl
*/
    // main(houses/1,public)




    public static Operation PRED_houses_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // houses([house(A,B,C,D,E),house(F,G,H,I,J),house(K,L,M,N,O),house(P,Q,R,S,T),house(U,V,W,X,Y)]):-true
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        a1 = LARG[0];
    // houses([house(A,B,C,D,E),house(F,G,H,I,J),house(K,L,M,N,O),house(P,Q,R,S,T),house(U,V,W,X,Y)]):-[]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a2 = a1.car();
            a3 = a1.cdr();
        } else if (a1.isVar()){
            a2 = m.mkvar2();
            a3 = m.mkvar2();
             a1.bind(CONS(a2, a3), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_house_5 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        a3 = a3.dref();
        if (a3 .isCons()){
                        a4 = a3.car();
            a5 = a3.cdr();
        } else if (a3.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a3.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_house_5 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        a5 = a5.dref();
        if (a5 .isCons()){
                        a6 = a5.car();
            a7 = a5.cdr();
        } else if (a5.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a5.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
            if (!a6.unifyS( FUNCTOR_house_5 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        a7 = a7.dref();
        if (a7 .isCons()){
                        a8 = a7.car();
            a9 = a7.cdr();
        } else if (a7.isVar()){
            a8 = m.mkvar2();
            a9 = m.mkvar2();
             a7.bind(CONS(a8, a9), m.trail);
        } else {
            return m.fail();
        }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_house_5 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        a9 = a9.dref();
        if (a9 .isCons()){
                        a10 = a9.car();
            if (!  Prolog.Nil .unify(a9.cdr(), m.trail))
                return m.fail();
        } else if (a9.isVar()){
            a10 = m.mkvar2();
             a9.bind(CONS(a10,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_house_5 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: right_of/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/zebra.pl
*/
    // main(right_of/3,public)




    public static Operation PRED_right_of_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return right_of_3_top(m);
    }

    private final static Operation right_of_3_top(Prolog m) { 
        m.setB0();
        m.jtry3(null, FILE_zebra::right_of_3_sub_1);
        return right_of_3_1(m);
    }

    private final static Operation right_of_3_sub_1(Prolog m) { 
        m.trust(null);
        return right_of_3_2(m);
    }

    private final static Operation right_of_3_1(Prolog m) { 
    // right_of(A,B,[B,A|C]):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // right_of(A,B,[B,A|C]):-[]
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a2.unify(a3.car(), m.trail))
                return m.fail();
            a4 = a3.cdr();
        } else if (a3.isVar()){
            a4 = m.mkvar2();
             a3.bind(CONS(a2, a4), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! a1.unify(a4.car(), m.trail))
                return m.fail();
        } else if (a4.isVar()){
             a4.bind(CONS(a1, m.DONTCARE("cons(a(4))")), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation right_of_3_2(Prolog m) { 
    // right_of(A,B,[C|D]):-right_of(A,B,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // right_of(A,B,[C|D]):-[right_of(A,B,D)]
        a3 = a3.dref();
        if (a3 .isCons()){
                        a4 = a3.cdr();
        } else if (a3.isVar()){
            a4 = m.mkvar2();
             a3.bind(CONS(m.DONTCARE("cons(a(3))"), a4), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a1;
        m.AREGS[1] = a2;
        m.AREGS[2] = a4;
m.cont = cont;
        return right_of_3_top(m);
    }
/** PREDICATE: next_to/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/zebra.pl
*/
    // main(next_to/3,public)




    public static Operation PRED_next_to_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return next_to_3_top(m);
    }

    private final static Operation next_to_3_top(Prolog m) { 
        m.setB0();
        m.jtry3(null, FILE_zebra::next_to_3_sub_1);
        return next_to_3_1(m);
    }

    private final static Operation next_to_3_sub_1(Prolog m) { 
        m.retry(null, FILE_zebra::next_to_3_sub_2);
        return next_to_3_2(m);
    }

    private final static Operation next_to_3_sub_2(Prolog m) { 
        m.trust(null);
        return next_to_3_3(m);
    }

    private final static Operation next_to_3_1(Prolog m) { 
    // next_to(A,B,[A,B|C]):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // next_to(A,B,[A,B|C]):-[]
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a1.unify(a3.car(), m.trail))
                return m.fail();
            a4 = a3.cdr();
        } else if (a3.isVar()){
            a4 = m.mkvar2();
             a3.bind(CONS(a1, a4), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! a2.unify(a4.car(), m.trail))
                return m.fail();
        } else if (a4.isVar()){
             a4.bind(CONS(a2, m.DONTCARE("cons(a(4))")), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation next_to_3_2(Prolog m) { 
    // next_to(A,B,[B,A|C]):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // next_to(A,B,[B,A|C]):-[]
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a2.unify(a3.car(), m.trail))
                return m.fail();
            a4 = a3.cdr();
        } else if (a3.isVar()){
            a4 = m.mkvar2();
             a3.bind(CONS(a2, a4), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! a1.unify(a4.car(), m.trail))
                return m.fail();
        } else if (a4.isVar()){
             a4.bind(CONS(a1, m.DONTCARE("cons(a(4))")), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation next_to_3_3(Prolog m) { 
    // next_to(A,B,[C|D]):-next_to(A,B,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // next_to(A,B,[C|D]):-[next_to(A,B,D)]
        a3 = a3.dref();
        if (a3 .isCons()){
                        a4 = a3.cdr();
        } else if (a3.isVar()){
            a4 = m.mkvar2();
             a3.bind(CONS(m.DONTCARE("cons(a(3))"), a4), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a1;
        m.AREGS[1] = a2;
        m.AREGS[2] = a4;
m.cont = cont;
        return next_to_3_top(m);
    }
/** PREDICATE: member/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/zebra.pl
*/
    // main(member/2,public)




    public static Operation PRED_member_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return member_2_top(m);
    }

    private final static Operation member_2_top(Prolog m) { 
        m.setB0();
        m.jtry2(null, FILE_zebra::member_2_sub_1);
        return member_2_1(m);
    }

    private final static Operation member_2_sub_1(Prolog m) { 
        m.trust(null);
        return member_2_2(m);
    }

    private final static Operation member_2_1(Prolog m) { 
    // member(A,[A|B]):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // member(A,[A|B]):-[]
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a1.unify(a2.car(), m.trail))
                return m.fail();
        } else if (a2.isVar()){
             a2.bind(CONS(a1, m.DONTCARE("cons(a(2))")), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation member_2_2(Prolog m) { 
    // member(A,[B|C]):-member(A,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // member(A,[B|C]):-[member(A,C)]
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
        return member_2_top(m);
    }
/** PREDICATE: print_houses/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/zebra.pl
*/
    // main(print_houses/1,public)




    public static Operation PRED_print_houses_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_zebra::print_houses_1_var, fail_0, fail_0, FILE_zebra::print_houses_1_2, fail_0, FILE_zebra::print_houses_1_1); 
    }

    private final static Operation print_houses_1_var(Prolog m) { 
        m.jtry1(null, FILE_zebra::print_houses_1_var_1);
        return print_houses_1_1(m);
    }

    private final static Operation print_houses_1_var_1(Prolog m) { 
        m.trust(null);
        return print_houses_1_2(m);
    }

    private final static Operation print_houses_1_1(Prolog m) { 
    // print_houses([A|B]):-!,write(A),nl,print_houses(B)
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // print_houses([A|B]):-['$neck_cut',write(A),nl,print_houses(B)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a2 = a1.car();
            a3 = a1.cdr();
        } else if (a1.isVar()){
            a2 = m.mkvar2();
            a3 = m.mkvar2();
             a1.bind(CONS(a2, a3), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("write", FILE_zebra::PRED_write_1_static_exec, VA(a2), //
 Op("nl", FILE_zebra::PRED_nl_0_static_exec, VA(), //
 Op("print_houses", FILE_zebra::PRED_print_houses_1_static_exec, VA(a3), cont)));
    }

    private final static Operation print_houses_1_2(Prolog m) { 
    // print_houses([]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // print_houses([]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_zebra::PRED_top_0_static_exec);
   PredTable.registerBuiltin("houses",1,FILE_zebra::PRED_houses_1_static_exec);
   PredTable.registerBuiltin("right_of",3,FILE_zebra::PRED_right_of_3_static_exec);
   PredTable.registerBuiltin("next_to",3,FILE_zebra::PRED_next_to_3_static_exec);
   PredTable.registerBuiltin("member",2,FILE_zebra::PRED_member_2_static_exec);
   PredTable.registerBuiltin("print_houses",1,FILE_zebra::PRED_print_houses_1_static_exec);
}
}

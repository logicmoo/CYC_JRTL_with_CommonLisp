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
public class FILE_unify extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(top/0,public)




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-main(A)
        m.setB0();
    // top:-[main(A)]
        return //
 Op("main", FILE_unify::PRED_main_1_static_exec, VA(m.DONT_CARE2()), cont);
    }
/** PREDICATE: main/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(main/1,public)




    public static Operation PRED_main_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // main(A):-u(B,[1,C],[B],D),size(D,0,A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        a1 = LARG[0];
    // main(A):-[u(B,[1,C],[B],D),size(D,0,A)]
        a2 = m.mkvar1();
        a3 = CONS(m.DONT_CARE1(),  Prolog.Nil );
        a4 = CONS( int_1 , a3);
        a5 = CONS(a2,  Prolog.Nil );
        a6 = m.mkvar1();
        return //
 Op("u", FILE_unify::PRED_u_4_static_exec, VA(a2, a4, a5, a6), //
 Op("size", FILE_unify::PRED_size_3_static_exec, VA(a6,  int_0 , a1), cont));
    }
/** PREDICATE: u/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(u/4,public)




    public static Operation PRED_u_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // u(A,B,C,D):-unify(A,B,C,E,D,[])
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // u(A,B,C,D):-[unify(A,B,C,E,D,[])]
        return //
 Op("unify", FILE_unify::PRED_unify_6_static_exec, VA(a1, a2, a3, m.DONT_CARE2(), a4,  Prolog.Nil ), cont);
    }
/** PREDICATE: $dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'/2,public)




    public static Operation PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_unify::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_sub_1);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_1(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_2(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_1(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-myin(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-['$get_level'(C),myin(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_2(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: unify/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(unify/6,public)
        final static Functor ATOM_nonlast = SYM("nonlast");

    // private final Term arg5, arg6;




    public static Operation PRED_unify_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_unify::unify_6_sub_1);
        return unify_6_1(m);
    }

    private final static Operation unify_6_sub_1(Prolog m) { 
        m.trust(null);
        return unify_6_2(m);
    }

    private final static Operation unify_6_1(Prolog m) { 
    // unify(A,B,C,D,E,F):-('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,C),G=E),(!,H=G),uninit(A,B,C,D,H,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // unify(A,B,C,D,E,F):-['$get_level'(G),'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,C),'$unify'(H,E),'$cut'(G),'$unify'(I,H),uninit(A,B,C,D,I,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl", FILE_unify::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec, VA(a1, a3), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a8, a5), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a7), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a8), //
 Op("uninit", FILE_unify::PRED_uninit_6_static_exec, VA(a1, a2, a3, a4, a9, a6), cont)))));
    }

    private final static Operation unify_6_2(Prolog m) { 
    // unify(A,B,C,D,E,F):-(myin(A,C),G=E),(!,H=G),init(A,B,C,D,nonlast,I,H,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // unify(A,B,C,D,E,F):-['$get_level'(G),myin(A,C),'$unify'(H,E),'$cut'(G),'$unify'(I,H),init(A,B,C,D,nonlast,J,I,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a1, a3), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a8, a5), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a7), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a8), //
 Op("init", FILE_unify::PRED_init_8_static_exec, VA(a1, a2, a3, a4,  ATOM_nonlast , m.DONT_CARE2(), a9, a6), cont)))));
    }
/** PREDICATE: uninit/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(uninit/6,public)
        final static Functor FUNCTOR_move_2 = F("move",2);
        final static Functor FUNCTOR_$005E_2 = F("^",2);
        final static Functor ATOM_h = SYM("h");
        final static Functor ATOM_tatm = SYM("tatm");

    // private final Term arg5, arg6;




    public static Operation PRED_uninit_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_unify::uninit_6_sub_1);
        return uninit_6_1(m);
    }

    private final static Operation uninit_6_sub_1(Prolog m) { 
        m.retry(null, FILE_unify::uninit_6_sub_2);
        return uninit_6_2(m);
    }

    private final static Operation uninit_6_sub_2(Prolog m) { 
        m.trust(null);
        return uninit_6_3(m);
    }

    private final static Operation uninit_6_1(Prolog m) { 
    // uninit(A,B,C,D,E,F):-(my_compound(B),G=E),(!,H=G),H=[move(I^h,A)|J],(termtag(B,I),K=J),unify_block(nonlast,B,L,C,M,N,K,O),incl(A,M,D),F=O
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // uninit(A,B,C,D,E,F):-['$get_level'(G),my_compound(B),'$unify'(H,E),'$cut'(G),'$unify'(I,H),'$unify'(I,[move(J^h,A)|K]),termtag(B,J),'$unify'(L,K),unify_block(nonlast,B,M,C,N,O,L,P),incl(A,N,D),'$unify'(F,P)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
    // put_str_args([a(10),@('ATOM_h')],y(1)),put_str(@('FUNCTOR_$005E_2'),y(1),a(11))
        a11 =  S( FUNCTOR_$005E_2 , a10,  ATOM_h );
 ;
    // put_str_args([a(11),a(1)],y(2)),put_str(@('FUNCTOR_move_2'),y(2),a(12))
        a12 =  S( FUNCTOR_move_2 , a11, a1);
 ;
        a13 = m.mkvar1();
        a14 = CONS(a12, a13);
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        return //
 Op("my_compound", FILE_unify::PRED_my_compound_1_static_exec, VA(a2), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a8, a5), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a7), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a8), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a14), //
 Op("termtag", FILE_unify::PRED_termtag_2_static_exec, VA(a2, a10), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a15, a13), //
 Op("unify_block", FILE_unify::PRED_unify_block_8_static_exec, VA( ATOM_nonlast , a2, m.DONT_CARE2(), a3, a16, m.DONT_CARE2(), a15, a17), //
 Op("incl", FILE_unify::PRED_incl_3_static_exec, VA(a1, a16, a4), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a6, a17), cont))))))))));
    }

    private final static Operation uninit_6_2(Prolog m) { 
    // uninit(A,B,C,D,E,F):-(atomic(B),G=E),(!,H=G),H=[move(tatm^B,A)|I],incl(A,C,D),F=I
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // uninit(A,B,C,D,E,F):-['$get_level'(G),atomic(B),'$unify'(H,E),'$cut'(G),'$unify'(I,H),'$unify'(I,[move(tatm^B,A)|J]),incl(A,C,D),'$unify'(F,J)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(2))
        a2 = a2.dref();
        if (! a2.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        //START inline expansion of $unify(a(8),a(5))
        if (! a8.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        a9 = m.mkvar1();
        //START inline expansion of $unify(a(9),a(8))
        if (! a9.unify(a8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_tatm'),a(2)],y(1)),put_str(@('FUNCTOR_$005E_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$005E_2 ,  ATOM_tatm , a2);
 ;
    // put_str_args([a(10),a(1)],y(2)),put_str(@('FUNCTOR_move_2'),y(2),a(11))
        a11 =  S( FUNCTOR_move_2 , a10, a1);
 ;
        a12 = m.mkvar1();
        a13 = CONS(a11, a12);
        //START inline expansion of $unify(a(9),a(13))
        if (! a9.unify(a13, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("incl", FILE_unify::PRED_incl_3_static_exec, VA(a1, a3, a4), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a6, a12), cont));
    }

    private final static Operation uninit_6_3(Prolog m) { 
    // uninit(A,B,C,D,E,F):-(var(B),G=E),(!,H=G),unify_var(A,B,C,D,H,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // uninit(A,B,C,D,E,F):-['$get_level'(G),var(B),'$unify'(H,E),'$cut'(G),'$unify'(I,H),unify_var(A,B,C,D,I,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(2))
        a2 = a2.dref();
        if (! (a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        //START inline expansion of $unify(a(8),a(5))
        if (! a8.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        a9 = m.mkvar1();
        //START inline expansion of $unify(a(9),a(8))
        if (! a9.unify(a8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("unify_var", FILE_unify::PRED_unify_var_6_static_exec, VA(a1, a2, a3, a4, a9, a6), cont);
    }
/** PREDICATE: init/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(init/8,public)
        final static Functor FUNCTOR_deref_1 = F("deref",1);
        final static Functor FUNCTOR_switch_5 = F("switch",5);
        final static Functor FUNCTOR_trail_1 = F("trail",1);
        final static Functor ATOM_fail = SYM("fail");

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_init_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry8(null, FILE_unify::init_8_sub_1);
        return init_8_1(m);
    }

    private final static Operation init_8_sub_1(Prolog m) { 
        m.trust(null);
        return init_8_2(m);
    }

    private final static Operation init_8_1(Prolog m) { 
    // init(A,B,C,D,E,F,G,H):-(nonvar(B),I=G),(!,J=I),(termtag(B,K),L=J),L=[deref(A),switch(K,A,[trail(A)|M],N,fail)|O],(unify_writemode(A,B,C,E,F,M,[]),P=O),unify_readmode(A,B,C,D,F,N,[]),H=P
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // init(A,B,C,D,E,F,G,H):-['$get_level'(I),nonvar(B),'$unify'(J,G),'$cut'(I),'$unify'(K,J),termtag(B,L),'$unify'(M,K),'$unify'(M,[deref(A),switch(L,A,[trail(A)|N],O,fail)|P]),unify_writemode(A,B,C,E,F,N,[]),'$unify'(Q,P),unify_readmode(A,B,C,D,F,O,[]),'$unify'(H,Q)]
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of nonvar(a(2))
        a2 = a2.dref();
        if ((a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a10 = m.mkvar1();
        //START inline expansion of $unify(a(10),a(7))
        if (! a10.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(9))
        a9 = a9.dref();
                  m.cut( a9.intValue());
        //END inline expansion
        a11 = m.mkvar1();
        //START inline expansion of $unify(a(11),a(10))
        if (! a11.unify(a10, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a12 = m.mkvar1();
        a13 = m.mkvar1();
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_deref_1'),y(1),a(14))
        a14 =  S( FUNCTOR_deref_1 , a1);
 ;
    // put_str_args([a(1)],y(2)),put_str(@('FUNCTOR_trail_1'),y(2),a(15))
        a15 =  S( FUNCTOR_trail_1 , a1);
 ;
        a16 = m.mkvar1();
        a17 = CONS(a15, a16);
        a18 = m.mkvar1();
    // put_str_args([a(12),a(1),a(17),a(18),@('ATOM_fail')],y(3)),put_str(@('FUNCTOR_switch_5'),y(3),a(19))
        a19 =  S( FUNCTOR_switch_5 , a12, a1, a17, a18,  ATOM_fail );
 ;
        a20 = m.mkvar1();
        a21 = CONS(a19, a20);
        a22 = CONS(a14, a21);
        a23 = m.mkvar1();
        return //
 Op("termtag", FILE_unify::PRED_termtag_2_static_exec, VA(a2, a12), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a13, a11), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a13, a22), //
 Op("unify_writemode", FILE_unify::PRED_unify_writemode_7_static_exec, VA(a1, a2, a3, a5, a6, a16,  Prolog.Nil ), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a23, a20), //
 Op("unify_readmode", FILE_unify::PRED_unify_readmode_7_static_exec, VA(a1, a2, a3, a4, a6, a18,  Prolog.Nil ), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a8, a23), cont)))))));
    }

    private final static Operation init_8_2(Prolog m) { 
    // init(A,B,C,D,E,F,G,H):-(var(B),I=G),(!,J=I),unify_var(A,B,C,D,J,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // init(A,B,C,D,E,F,G,H):-['$get_level'(I),var(B),'$unify'(J,G),'$cut'(I),'$unify'(K,J),unify_var(A,B,C,D,K,H)]
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(2))
        a2 = a2.dref();
        if (! (a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a10 = m.mkvar1();
        //START inline expansion of $unify(a(10),a(7))
        if (! a10.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(9))
        a9 = a9.dref();
                  m.cut( a9.intValue());
        //END inline expansion
        a11 = m.mkvar1();
        //START inline expansion of $unify(a(11),a(10))
        if (! a11.unify(a10, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("unify_var", FILE_unify::PRED_unify_var_6_static_exec, VA(a1, a2, a3, a4, a11, a8), cont);
    }
/** PREDICATE: unify_var/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(unify_var/6,public)
        final static Functor FUNCTOR_unify_3 = F("unify",3);
        final static Functor ATOM_tvar = SYM("tvar");
    private static final Compound L_unify_var_6_s8 = S( FUNCTOR_$005E_2 ,  ATOM_tvar ,  ATOM_h );
        final static Functor FUNCTOR_add_2 = F("add",2);
    private static final Compound L_unify_var_6_s12 = S( FUNCTOR_add_2 ,  int_1 ,  ATOM_h );
        final static Functor FUNCTOR_$002D_2 = F("-",2);
    private static final Compound L_unify_var_6_s15 = S( FUNCTOR_$002D_2 ,  ATOM_h ,  int_1 );
    private static final Compound L_unify_var_6_s17 = CONS(L_unify_var_6_s15,  Prolog.Nil );

    // private final Term arg5, arg6;




    public static Operation PRED_unify_var_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_unify::unify_var_6_sub_1);
        return unify_var_6_1(m);
    }

    private final static Operation unify_var_6_sub_1(Prolog m) { 
        m.retry(null, FILE_unify::unify_var_6_sub_2);
        return unify_var_6_2(m);
    }

    private final static Operation unify_var_6_sub_2(Prolog m) { 
        m.retry(null, FILE_unify::unify_var_6_sub_3);
        return unify_var_6_3(m);
    }

    private final static Operation unify_var_6_sub_3(Prolog m) { 
        m.trust(null);
        return unify_var_6_4(m);
    }

    private final static Operation unify_var_6_1(Prolog m) { 
    // unify_var(A,B,C,C,D,E):-((myin(A,C),myin(B,C)),F=D),(!,G=F),G=[unify(A,B,fail)|E]
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // unify_var(A,B,C,C,D,E):-['$get_level'(F),myin(A,C),myin(B,C),'$unify'(G,D),'$cut'(F),'$unify'(H,G),'$unify'(H,[unify(A,B,fail)|E])]
        if (! a3.unify(a4, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([a(1),a(2),@('ATOM_fail')],y(1)),put_str(@('FUNCTOR_unify_3'),y(1),a(10))
        a10 =  S( FUNCTOR_unify_3 , a1, a2,  ATOM_fail );
 ;
        a11 = CONS(a10, a6);
        return //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a1, a3), //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a2, a3), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a8, a5), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a7), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a8), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a11), cont))))));
    }

    private final static Operation unify_var_6_2(Prolog m) { 
    // unify_var(A,B,C,D,E,F):-((myin(A,C),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(B,C)),G=E),(!,H=G),H=[move(A,B)|I],incl(B,C,D),F=I
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // unify_var(A,B,C,D,E,F):-['$get_level'(G),myin(A,C),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(B,C),'$unify'(H,E),'$cut'(G),'$unify'(I,H),'$unify'(I,[move(A,B)|J]),incl(B,C,D),'$unify'(F,J)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_move_2'),y(1),a(10))
        a10 =  S( FUNCTOR_move_2 , a1, a2);
 ;
        a11 = m.mkvar1();
        a12 = CONS(a10, a11);
        return //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a1, a3), //
 Op("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl", FILE_unify::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec, VA(a2, a3), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a8, a5), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a7), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a8), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a12), //
 Op("incl", FILE_unify::PRED_incl_3_static_exec, VA(a2, a3, a4), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a6, a11), cont))))))));
    }

    private final static Operation unify_var_6_3(Prolog m) { 
    // unify_var(A,B,C,D,E,F):-(('$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,C),myin(B,C)),G=E),(!,H=G),H=[move(B,A)|I],incl(A,C,D),F=I
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // unify_var(A,B,C,D,E,F):-['$get_level'(G),'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,C),myin(B,C),'$unify'(H,E),'$cut'(G),'$unify'(I,H),'$unify'(I,[move(B,A)|J]),incl(A,C,D),'$unify'(F,J)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([a(2),a(1)],y(1)),put_str(@('FUNCTOR_move_2'),y(1),a(10))
        a10 =  S( FUNCTOR_move_2 , a2, a1);
 ;
        a11 = m.mkvar1();
        a12 = CONS(a10, a11);
        return //
 Op("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl", FILE_unify::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec, VA(a1, a3), //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a2, a3), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a8, a5), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a7), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a8), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a12), //
 Op("incl", FILE_unify::PRED_incl_3_static_exec, VA(a1, a3, a4), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a6, a11), cont))))))));
    }

    private final static Operation unify_var_6_4(Prolog m) { 
    // unify_var(A,B,C,D,E,F):-(('$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,C),'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(B,C)),G=E),(!,H=G),H=[move(tvar^h,A),move(tvar^h,B),add(1,h),move(B,[h-1])|I],(incl(A,C,J),incl(B,J,D)),F=I
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18;
        Operation p1, p2, p3, p4, p5, p6, p7, p8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // unify_var(A,B,C,D,E,F):-['$get_level'(G),'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,C),'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(B,C),'$unify'(H,E),'$cut'(G),'$unify'(I,H),'$unify'(I,[move(tvar^h,A),move(tvar^h,B),add(1,h),move(B,[h-1])|J]),incl(A,C,K),incl(B,K,D),'$unify'(F,J)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([s(8),a(1)],y(1)),put_str(@('FUNCTOR_move_2'),y(1),a(10))
        a10 =  S( FUNCTOR_move_2 , L_unify_var_6_s8, a1);
 ;
    // put_str_args([s(8),a(2)],y(2)),put_str(@('FUNCTOR_move_2'),y(2),a(11))
        a11 =  S( FUNCTOR_move_2 , L_unify_var_6_s8, a2);
 ;
    // put_str_args([a(2),s(17)],y(3)),put_str(@('FUNCTOR_move_2'),y(3),a(12))
        a12 =  S( FUNCTOR_move_2 , a2, L_unify_var_6_s17);
 ;
        a13 = m.mkvar1();
        a14 = CONS(a12, a13);
        a15 = CONS(L_unify_var_6_s12, a14);
        a16 = CONS(a11, a15);
        a17 = CONS(a10, a16);
        a18 = m.mkvar1();
        return //
 Op("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl", FILE_unify::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec, VA(a1, a3), //
 Op("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl", FILE_unify::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec, VA(a2, a3), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a8, a5), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a7), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a8), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a17), //
 Op("incl", FILE_unify::PRED_incl_3_static_exec, VA(a1, a3, a18), //
 Op("incl", FILE_unify::PRED_incl_3_static_exec, VA(a2, a18, a4), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a6, a13), cont)))))))));
    }
/** PREDICATE: $dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main('$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'/2,public)




    public static Operation PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_unify::$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_sub_1);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_1(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_2(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_1(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-myin(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-['$get_level'(C),myin(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_2(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main('$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'/2,public)




    public static Operation PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_unify::$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_sub_1);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_1(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_2(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_1(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-myin(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-['$get_level'(C),myin(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_2(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main('$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'/2,public)




    public static Operation PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_unify::$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_sub_1);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_1(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_2(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_1(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-myin(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-['$get_level'(C),myin(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_2(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main('$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'/2,public)




    public static Operation PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_unify::$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_sub_1);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_1(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_2(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_1(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-myin(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-['$get_level'(C),myin(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_2(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: unify_readmode/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(unify_readmode/7,public)
        final static Functor FUNCTOR_equal_3 = F("equal",3);
        final static Functor FUNCTOR_$002F_2 = F("/",2);

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_unify_readmode_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_unify::unify_readmode_7_sub_1);
        return unify_readmode_7_1(m);
    }

    private final static Operation unify_readmode_7_sub_1(Prolog m) { 
        m.retry(null, FILE_unify::unify_readmode_7_sub_2);
        return unify_readmode_7_2(m);
    }

    private final static Operation unify_readmode_7_sub_2(Prolog m) { 
        m.trust(null);
        return unify_readmode_7_3(m);
    }

    private final static Operation unify_readmode_7_1(Prolog m) { 
    // unify_readmode(A,B,C,D,E,F,G):-(structure(B),H=F),(!,I=H),I=[equal([A],tatm^(J/K),fail)|L],(functor(B,J,K),M=L),unify_args(1,K,B,C,D,0,A,E,M,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // unify_readmode(A,B,C,D,E,F,G):-['$get_level'(H),structure(B),'$unify'(I,F),'$cut'(H),'$unify'(J,I),'$unify'(J,[equal([A],tatm^(K/L),fail)|M]),functor(B,K,L),'$unify'(N,M),unify_args(1,L,B,C,D,0,A,E,N,G)]
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = CONS(a1,  Prolog.Nil );
        a12 = m.mkvar1();
        a13 = m.mkvar1();
    // put_str_args([a(12),a(13)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(14))
        a14 =  S( FUNCTOR_$002F_2 , a12, a13);
 ;
    // put_str_args([@('ATOM_tatm'),a(14)],y(2)),put_str(@('FUNCTOR_$005E_2'),y(2),a(15))
        a15 =  S( FUNCTOR_$005E_2 ,  ATOM_tatm , a14);
 ;
    // put_str_args([a(11),a(15),@('ATOM_fail')],y(3)),put_str(@('FUNCTOR_equal_3'),y(3),a(16))
        a16 =  S( FUNCTOR_equal_3 , a11, a15,  ATOM_fail );
 ;
        a17 = m.mkvar1();
        a18 = CONS(a16, a17);
        a19 = m.mkvar1();
        return //
 Op("structure", FILE_unify::PRED_structure_1_static_exec, VA(a2), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a6), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a8), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a10, a9), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a10, a18), //
 Op("functor", FILE_unify::PRED_functor_3_static_exec, VA(a2, a12, a13), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a19, a17), //
 Op("unify_args", FILE_unify::PRED_unify_args_10_static_exec, VA( int_1 , a13, a2, a3, a4,  int_0 , a1, a5, a19, a7), cont))))))));
    }

    private final static Operation unify_readmode_7_2(Prolog m) { 
    // unify_readmode(A,B,C,D,E,F,G):-(cons(B),H=F),(!,I=H),unify_args(1,2,B,C,D,-1,A,E,I,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
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
    // unify_readmode(A,B,C,D,E,F,G):-['$get_level'(H),cons(B),'$unify'(I,F),'$cut'(H),'$unify'(J,I),unify_args(1,2,B,C,D,-1,A,E,J,G)]
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        return //
 Op("cons", FILE_unify::PRED_cons_1_static_exec, VA(a2), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a6), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a8), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a10, a9), //
 Op("unify_args", FILE_unify::PRED_unify_args_10_static_exec, VA( int_1 ,  int_2 , a2, a3, a4,  int_neg1 , a1, a5, a10, a7), cont)))));
    }

    private final static Operation unify_readmode_7_3(Prolog m) { 
    // unify_readmode(A,B,C,C,D,E,F):-(atomic(B),G=E),(!,H=G),H=[equal(A,tatm^B,fail)|F]
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // unify_readmode(A,B,C,C,D,E,F):-['$get_level'(G),atomic(B),'$unify'(H,E),'$cut'(G),'$unify'(I,H),'$unify'(I,[equal(A,tatm^B,fail)|F])]
        if (! a3.unify(a4, m.trail))
            return m.fail();
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(2))
        a2 = a2.dref();
        if (! a2.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        a9 = m.mkvar1();
        //START inline expansion of $unify(a(9),a(6))
        if (! a9.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(8))
        a8 = a8.dref();
                  m.cut( a8.intValue());
        //END inline expansion
        a10 = m.mkvar1();
        //START inline expansion of $unify(a(10),a(9))
        if (! a10.unify(a9, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_tatm'),a(2)],y(1)),put_str(@('FUNCTOR_$005E_2'),y(1),a(11))
        a11 =  S( FUNCTOR_$005E_2 ,  ATOM_tatm , a2);
 ;
    // put_str_args([a(1),a(11),@('ATOM_fail')],y(2)),put_str(@('FUNCTOR_equal_3'),y(2),a(12))
        a12 =  S( FUNCTOR_equal_3 , a1, a11,  ATOM_fail );
 ;
        a13 = CONS(a12, a7);
        //START inline expansion of $unify(a(10),a(13))
        if (! a10.unify(a13, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: unify_args/10
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(unify_args/10,public)
        final static Functor ATOM_last = SYM("last");
        final static Functor FUNCTOR_$002B_2 = F("+",2);

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10;




    public static Operation PRED_unify_args_10_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(10, null, FILE_unify::unify_args_10_sub_1);
        return unify_args_10_1(m);
    }

    private final static Operation unify_args_10_sub_1(Prolog m) { 
        m.retry(null, FILE_unify::unify_args_10_sub_2);
        return unify_args_10_2(m);
    }

    private final static Operation unify_args_10_sub_2(Prolog m) { 
        m.trust(null);
        return unify_args_10_3(m);
    }

    private final static Operation unify_args_10_1(Prolog m) { 
    // unify_args(A,B,C,D,D,E,F,G,H,I):-(A>B,J=H),!,I=J
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
        cont = m.cont;
    // unify_args(A,B,C,D,D,E,F,G,H,I):-['$get_level'(J),'$greater_than'(A,B),'$unify'(K,H),'$cut'(J),'$unify'(I,K)]
        if (! a4.unify(a5, m.trail))
            return m.fail();
        a11 = m.mkvar1();
        //START inline expansion of $get_level(a(11))
        if (! a11.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        a12 = m.mkvar1();
        //START inline expansion of $unify(a(12),a(9))
        if (! a12.unify(a9, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(11))
        a11 = a11.dref();
                  m.cut( a11.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(10),a(12))
        if (! a10.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation unify_args_10_2(Prolog m) { 
    // unify_args(A,B,C,D,E,F,G,[H|I],J,K):-(A=B,L=J),(!,M=L),unify_arg(A,C,D,E,F,G,last,I,M,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
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
        cont = m.cont;
    // unify_args(A,B,C,D,E,F,G,[H|I],J,K):-['$get_level'(L),'$unify'(A,B),'$unify'(M,J),'$cut'(L),'$unify'(N,M),unify_arg(A,C,D,E,F,G,last,I,N,K)]
        a8 = a8.dref();
        if (a8 .isCons()){
                        a11 = a8.cdr();
        } else if (a8.isVar()){
            a11 = m.mkvar2();
             a8.bind(CONS(m.DONTCARE("cons(a(8))"), a11), m.trail);
        } else {
            return m.fail();
        }
        a12 = m.mkvar1();
        //START inline expansion of $get_level(a(12))
        if (! a12.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),a(2))
        if (! a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a13 = m.mkvar1();
        //START inline expansion of $unify(a(13),a(9))
        if (! a13.unify(a9, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(12))
        a12 = a12.dref();
                  m.cut( a12.intValue());
        //END inline expansion
        a14 = m.mkvar1();
        //START inline expansion of $unify(a(14),a(13))
        if (! a14.unify(a13, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("unify_arg", FILE_unify::PRED_unify_arg_10_static_exec, VA(a1, a3, a4, a5, a6, a7,  ATOM_last , a11, a14, a10), cont);
    }

    private final static Operation unify_args_10_3(Prolog m) { 
    // unify_args(A,B,C,D,E,F,G,H,I,J):-(A<B,K=I),(!,L=K),unify_arg(A,C,D,M,F,G,nonlast,N,L,O),(P is A+1,Q=O),unify_args(P,B,C,M,E,F,G,H,Q,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18;
        Operation p1, p2, p3;
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
        cont = m.cont;
    // unify_args(A,B,C,D,E,F,G,H,I,J):-['$get_level'(K),'$less_than'(A,B),'$unify'(L,I),'$cut'(K),'$unify'(M,L),unify_arg(A,C,D,N,F,G,nonlast,O,M,P),Q is A+1,'$unify'(R,P),unify_args(Q,B,C,N,E,F,G,H,R,J)]
        a11 = m.mkvar1();
        //START inline expansion of $get_level(a(11))
        if (! a11.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        a12 = m.mkvar1();
        //START inline expansion of $unify(a(12),a(9))
        if (! a12.unify(a9, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(11))
        a11 = a11.dref();
                  m.cut( a11.intValue());
        //END inline expansion
        a13 = m.mkvar1();
        //START inline expansion of $unify(a(13),a(12))
        if (! a13.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(17))
        a17 =  S( FUNCTOR_$002B_2 , a1,  int_1 );
 ;
        a18 = m.mkvar1();
        return //
 Op("unify_arg", FILE_unify::PRED_unify_arg_10_static_exec, VA(a1, a3, a4, a14, a6, a7,  ATOM_nonlast , m.DONT_CARE2(), a13, a15), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a16, a17), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a18, a15), //
 Op("unify_args", FILE_unify::PRED_unify_args_10_static_exec, VA(a16, a2, a3, a14, a5, a6, a7, a8, a18, a10), cont))));
    }
/** PREDICATE: unify_arg/10
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(unify_arg/10,public)

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10;




    public static Operation PRED_unify_arg_10_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // unify_arg(A,B,C,D,E,F,G,H,[move([F+I],J)|K],L):-((I is A+E,incl(J,C,M),arg(A,B,N)),O=K),init(J,N,M,D,G,H,O,L)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
        a8 = LARG[7];
        a9 = LARG[8];
        a10 = LARG[9];
    // unify_arg(A,B,C,D,E,F,G,H,[move([F+I],J)|K],L):-[I is A+E,incl(J,C,M),arg(A,B,N),'$unify'(O,K),init(J,N,M,D,G,H,O,L)]
        a9 = a9.dref();
        if (a9 .isCons()){
                        a11 = a9.car();
            a12 = a9.cdr();
        } else if (a9.isVar()){
            a11 = m.mkvar2();
            a12 = m.mkvar2();
             a9.bind(CONS(a11, a12), m.trail);
        } else {
            return m.fail();
        }
        a11 = a11.dref();
            a13 = m.mkvar2();
            a14 = m.mkvar2();
            if (!a11.unifyS( FUNCTOR_move_2 , m.trail, a13, a14)){
                return m.fail();
            }
        a13 = a13.dref();
        if (a13 .isCons()){
                        a15 = a13.car();
            if (!  Prolog.Nil .unify(a13.cdr(), m.trail))
                return m.fail();
        } else if (a13.isVar()){
            a15 = m.mkvar2();
             a13.bind(CONS(a15,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a15 = a15.dref();
            a16 = m.mkvar2();
            if (!a15.unifyS( FUNCTOR_$002B_2 , m.trail, a6, a16)){
                return m.fail();
            }
    // put_str_args([a(1),a(5)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(17))
        a17 =  S( FUNCTOR_$002B_2 , a1, a5);
 ;
        //START inline expansion of a(16)is a(17)
        if (! a16.unify(Arithmetic.evaluate(a17), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        return //
 Op("incl", FILE_unify::PRED_incl_3_static_exec, VA(a14, a3, a18), //
 Op("arg", FILE_unify::PRED_arg_3_static_exec, VA(a1, a2, a19), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a20, a12), //
 Op("init", FILE_unify::PRED_init_8_static_exec, VA(a14, a19, a18, a4, a7, a8, a20, a10), cont))));
    }
/** PREDICATE: unify_writemode/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(unify_writemode/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_unify_writemode_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_unify::unify_writemode_7_sub_1);
        return unify_writemode_7_1(m);
    }

    private final static Operation unify_writemode_7_sub_1(Prolog m) { 
        m.trust(null);
        return unify_writemode_7_2(m);
    }

    private final static Operation unify_writemode_7_1(Prolog m) { 
    // unify_writemode(A,B,C,D,E,F,G):-(my_compound(B),H=F),(!,I=H),I=[move(J^h,[A])|K],(termtag(B,J),L=K),unify_block(D,B,M,C,N,E,L,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // unify_writemode(A,B,C,D,E,F,G):-['$get_level'(H),my_compound(B),'$unify'(I,F),'$cut'(H),'$unify'(J,I),'$unify'(J,[move(K^h,[A])|L]),termtag(B,K),'$unify'(M,L),unify_block(D,B,N,C,O,E,M,G)]
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
    // put_str_args([a(11),@('ATOM_h')],y(1)),put_str(@('FUNCTOR_$005E_2'),y(1),a(12))
        a12 =  S( FUNCTOR_$005E_2 , a11,  ATOM_h );
 ;
        a13 = CONS(a1,  Prolog.Nil );
    // put_str_args([a(12),a(13)],y(2)),put_str(@('FUNCTOR_move_2'),y(2),a(14))
        a14 =  S( FUNCTOR_move_2 , a12, a13);
 ;
        a15 = m.mkvar1();
        a16 = CONS(a14, a15);
        a17 = m.mkvar1();
        return //
 Op("my_compound", FILE_unify::PRED_my_compound_1_static_exec, VA(a2), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a9, a6), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a8), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a10, a9), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a10, a16), //
 Op("termtag", FILE_unify::PRED_termtag_2_static_exec, VA(a2, a11), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a17, a15), //
 Op("unify_block", FILE_unify::PRED_unify_block_8_static_exec, VA(a4, a2, m.DONT_CARE2(), a3, m.DONT_CARE2(), a5, a17, a7), cont))))))));
    }

    private final static Operation unify_writemode_7_2(Prolog m) { 
    // unify_writemode(A,B,C,D,E,F,G):-(atomic(B),H=F),(!,I=H),I=[move(tatm^B,[A])|G]
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // unify_writemode(A,B,C,D,E,F,G):-['$get_level'(H),atomic(B),'$unify'(I,F),'$cut'(H),'$unify'(J,I),'$unify'(J,[move(tatm^B,[A])|G])]
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(2))
        a2 = a2.dref();
        if (! a2.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        a9 = m.mkvar1();
        //START inline expansion of $unify(a(9),a(6))
        if (! a9.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(8))
        a8 = a8.dref();
                  m.cut( a8.intValue());
        //END inline expansion
        a10 = m.mkvar1();
        //START inline expansion of $unify(a(10),a(9))
        if (! a10.unify(a9, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_tatm'),a(2)],y(1)),put_str(@('FUNCTOR_$005E_2'),y(1),a(11))
        a11 =  S( FUNCTOR_$005E_2 ,  ATOM_tatm , a2);
 ;
        a12 = CONS(a1,  Prolog.Nil );
    // put_str_args([a(11),a(12)],y(2)),put_str(@('FUNCTOR_move_2'),y(2),a(13))
        a13 =  S( FUNCTOR_move_2 , a11, a12);
 ;
        a14 = CONS(a13, a7);
        //START inline expansion of $unify(a(10),a(14))
        if (! a10.unify(a14, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: unify_block/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(unify_block/8,public)
        final static Functor FUNCTOR_jump_1 = F("jump",1);
        final static Functor FUNCTOR_$002D_1 = F("-",1);

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_unify_block_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_unify::unify_block_8_var, fail_0, fail_0, FILE_unify::unify_block_8_var, fail_0, fail_0); 
    }

    private final static Operation unify_block_8_var(Prolog m) { 
        m.jtry8(null, FILE_unify::unify_block_8_var_1);
        return unify_block_8_1(m);
    }

    private final static Operation unify_block_8_var_1(Prolog m) { 
        m.trust(null);
        return unify_block_8_2(m);
    }

    private final static Operation unify_block_8_1(Prolog m) { 
    // unify_block(last,A,B,C,C,[D|E],F,G):-(!,H=F),H=[add(B,h),jump(D)|I],size(A,0,B),G=I
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // unify_block(last,A,B,C,C,[D|E],F,G):-['$neck_cut','$unify'(H,F),'$unify'(H,[add(B,h),jump(D)|I]),size(A,0,B),'$unify'(G,I)]
        if (!  ATOM_last .unify(a1, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        a6 = a6.dref();
        if (a6 .isCons()){
                        a9 = a6.car();
        } else if (a6.isVar()){
            a9 = m.mkvar2();
             a6.bind(CONS(a9, m.DONTCARE("cons(a(6))")), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a10 = m.mkvar1();
        //START inline expansion of $unify(a(10),a(7))
        if (! a10.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(3),@('ATOM_h')],y(1)),put_str(@('FUNCTOR_add_2'),y(1),a(11))
        a11 =  S( FUNCTOR_add_2 , a3,  ATOM_h );
 ;
    // put_str_args([a(9)],y(2)),put_str(@('FUNCTOR_jump_1'),y(2),a(12))
        a12 =  S( FUNCTOR_jump_1 , a9);
 ;
        a13 = m.mkvar1();
        a14 = CONS(a12, a13);
        a15 = CONS(a11, a14);
        //START inline expansion of $unify(a(10),a(15))
        if (! a10.unify(a15, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("size", FILE_unify::PRED_size_3_static_exec, VA(a2,  int_0 , a3), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a8, a13), cont));
    }

    private final static Operation unify_block_8_2(Prolog m) { 
    // unify_block(nonlast,A,B,C,D,[E|F],G,H):-(!,I=G),I=[add(B,h)|J],((size(A,0,B),K is -B),L=J),block(A,K,0,C,D,F,L,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // unify_block(nonlast,A,B,C,D,[E|F],G,H):-['$neck_cut','$unify'(I,G),'$unify'(I,[add(B,h)|J]),size(A,0,B),K is -B,'$unify'(L,J),block(A,K,0,C,D,F,L,H)]
        if (!  ATOM_nonlast .unify(a1, m.trail))
            return m.fail();
        a6 = a6.dref();
        if (a6 .isCons()){
                        a9 = a6.cdr();
        } else if (a6.isVar()){
            a9 = m.mkvar2();
             a6.bind(CONS(m.DONTCARE("cons(a(6))"), a9), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a10 = m.mkvar1();
        //START inline expansion of $unify(a(10),a(7))
        if (! a10.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(3),@('ATOM_h')],y(1)),put_str(@('FUNCTOR_add_2'),y(1),a(11))
        a11 =  S( FUNCTOR_add_2 , a3,  ATOM_h );
 ;
        a12 = m.mkvar1();
        a13 = CONS(a11, a12);
        //START inline expansion of $unify(a(10),a(13))
        if (! a10.unify(a13, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a14 = m.mkvar1();
    // put_str_args([a(3)],y(2)),put_str(@('FUNCTOR_$002D_1'),y(2),a(15))
        a15 =  S( FUNCTOR_$002D_1 , a3);
 ;
        a16 = m.mkvar1();
        return //
 Op("size", FILE_unify::PRED_size_3_static_exec, VA(a2,  int_0 , a3), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a14, a15), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a16, a12), //
 Op("block", FILE_unify::PRED_block_8_static_exec, VA(a2, a14,  int_0 , a4, a5, a9, a16, a8), cont))));
    }
/** PREDICATE: (block)/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main((block)/8,public)

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_block_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry8(null, FILE_unify::block_8_sub_1);
        return block_8_1(m);
    }

    private final static Operation block_8_sub_1(Prolog m) { 
        m.retry(null, FILE_unify::block_8_sub_2);
        return block_8_2(m);
    }

    private final static Operation block_8_sub_2(Prolog m) { 
        m.retry(null, FILE_unify::block_8_sub_3);
        return block_8_3(m);
    }

    private final static Operation block_8_sub_3(Prolog m) { 
        m.trust(null);
        return block_8_4(m);
    }

    private final static Operation block_8_1(Prolog m) { 
    // block(A,B,C,D,E,F,G,H):-(structure(A),I=G),(!,J=I),J=[move(tatm^(K/L),[h+B])|M],((functor(A,K,L),N is B+L+1,O is B+1),P=M),make_slots(1,L,A,O,Q,D,R,P,S),block_args(1,L,A,N,C,Q,R,E,F,S,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // block(A,B,C,D,E,F,G,H):-['$get_level'(I),structure(A),'$unify'(J,G),'$cut'(I),'$unify'(K,J),'$unify'(K,[move(tatm^(L/M),[h+B])|N]),functor(A,L,M),O is B+M+1,P is B+1,'$unify'(Q,N),make_slots(1,M,A,P,R,D,S,Q,T),block_args(1,M,A,O,C,R,S,E,F,T,H)]
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
    // put_str_args([a(12),a(13)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(14))
        a14 =  S( FUNCTOR_$002F_2 , a12, a13);
 ;
    // put_str_args([@('ATOM_tatm'),a(14)],y(2)),put_str(@('FUNCTOR_$005E_2'),y(2),a(15))
        a15 =  S( FUNCTOR_$005E_2 ,  ATOM_tatm , a14);
 ;
    // put_str_args([@('ATOM_h'),a(2)],y(3)),put_str(@('FUNCTOR_$002B_2'),y(3),a(16))
        a16 =  S( FUNCTOR_$002B_2 ,  ATOM_h , a2);
 ;
        a17 = CONS(a16,  Prolog.Nil );
    // put_str_args([a(15),a(17)],y(4)),put_str(@('FUNCTOR_move_2'),y(4),a(18))
        a18 =  S( FUNCTOR_move_2 , a15, a17);
 ;
        a19 = m.mkvar1();
        a20 = CONS(a18, a19);
        a21 = m.mkvar1();
    // put_str_args([a(2),a(13)],y(5)),put_str(@('FUNCTOR_$002B_2'),y(5),a(22))
        a22 =  S( FUNCTOR_$002B_2 , a2, a13);
 ;
    // put_str_args([a(22),@(int_1)],y(6)),put_str(@('FUNCTOR_$002B_2'),y(6),a(23))
        a23 =  S( FUNCTOR_$002B_2 , a22,  int_1 );
 ;
        a24 = m.mkvar1();
    // put_str_args([a(2),@(int_1)],y(7)),put_str(@('FUNCTOR_$002B_2'),y(7),a(25))
        a25 =  S( FUNCTOR_$002B_2 , a2,  int_1 );
 ;
        a26 = m.mkvar1();
        a27 = m.mkvar1();
        a28 = m.mkvar1();
        a29 = m.mkvar1();
        return //
 Op("structure", FILE_unify::PRED_structure_1_static_exec, VA(a1), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a10, a7), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a9), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a11, a10), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a11, a20), //
 Op("functor", FILE_unify::PRED_functor_3_static_exec, VA(a1, a12, a13), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a21, a23), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a24, a25), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a26, a19), //
 Op("make_slots", FILE_unify::PRED_make_slots_9_static_exec, VA( int_1 , a13, a1, a24, a27, a4, a28, a26, a29), //
 Op("block_args", FILE_unify::PRED_block_args_11_static_exec, VA( int_1 , a13, a1, a21, a3, a27, a28, a5, a6, a29, a8), cont)))))))))));
    }

    private final static Operation block_8_2(Prolog m) { 
    // block(A,B,C,D,E,F,G,H):-(cons(A),I=G),(!,J=I),(K is B+2,L=J),make_slots(1,2,A,B,M,D,N,L,O),block_args(1,2,A,K,C,M,N,E,F,O,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // block(A,B,C,D,E,F,G,H):-['$get_level'(I),cons(A),'$unify'(J,G),'$cut'(I),'$unify'(K,J),L is B+2,'$unify'(M,K),make_slots(1,2,A,B,N,D,O,M,P),block_args(1,2,A,L,C,N,O,E,F,P,H)]
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
    // put_str_args([a(2),@(int_2)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(13))
        a13 =  S( FUNCTOR_$002B_2 , a2,  int_2 );
 ;
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        return //
 Op("cons", FILE_unify::PRED_cons_1_static_exec, VA(a1), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a10, a7), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a9), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a11, a10), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a12, a13), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a14, a11), //
 Op("make_slots", FILE_unify::PRED_make_slots_9_static_exec, VA( int_1 ,  int_2 , a1, a2, a15, a4, a16, a14, a17), //
 Op("block_args", FILE_unify::PRED_block_args_11_static_exec, VA( int_1 ,  int_2 , a1, a12, a3, a15, a16, a5, a6, a17, a8), cont))))))));
    }

    private final static Operation block_8_3(Prolog m) { 
    // block(A,B,B,C,C,[],D,E):-(atomic(A),F=D),!,E=F
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // block(A,B,B,C,C,[],D,E):-['$get_level'(F),atomic(A),'$unify'(G,D),'$cut'(F),'$unify'(E,G)]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a6, m.trail))
            return m.fail();
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        a10 = m.mkvar1();
        //START inline expansion of $unify(a(10),a(7))
        if (! a10.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(9))
        a9 = a9.dref();
                  m.cut( a9.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(8),a(10))
        if (! a8.unify(a10, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation block_8_4(Prolog m) { 
    // block(A,B,B,C,C,[],D,E):-(var(A),F=D),!,E=F
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        a8 = m.AREGS[7];
        cont = m.cont;
    // block(A,B,B,C,C,[],D,E):-['$get_level'(F),var(A),'$unify'(G,D),'$cut'(F),'$unify'(E,G)]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a6, m.trail))
            return m.fail();
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a10 = m.mkvar1();
        //START inline expansion of $unify(a(10),a(7))
        if (! a10.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(9))
        a9 = a9.dref();
                  m.cut( a9.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(8),a(10))
        if (! a8.unify(a10, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: block_args/11
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(block_args/11,public)
        final static Functor FUNCTOR_label_1 = F("label",1);

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;




    public static Operation PRED_block_args_11_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(11, null, FILE_unify::block_args_11_sub_1);
        return block_args_11_1(m);
    }

    private final static Operation block_args_11_sub_1(Prolog m) { 
        m.retry(null, FILE_unify::block_args_11_sub_2);
        return block_args_11_2(m);
    }

    private final static Operation block_args_11_sub_2(Prolog m) { 
        m.trust(null);
        return block_args_11_3(m);
    }

    private final static Operation block_args_11_1(Prolog m) { 
    // block_args(A,B,C,D,D,[],E,E,[],F,G):-(A>B,H=F),!,G=H
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
    // block_args(A,B,C,D,D,[],E,E,[],F,G):-['$get_level'(H),'$greater_than'(A,B),'$unify'(I,F),'$cut'(H),'$unify'(G,I)]
        if (! a4.unify(a5, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a6, m.trail))
            return m.fail();
        if (! a7.unify(a8, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a9, m.trail))
            return m.fail();
        a12 = m.mkvar1();
        //START inline expansion of $get_level(a(12))
        if (! a12.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        a13 = m.mkvar1();
        //START inline expansion of $unify(a(13),a(10))
        if (! a13.unify(a10, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(12))
        a12 = a12.dref();
                  m.cut( a12.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(11),a(13))
        if (! a11.unify(a13, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation block_args_11_2(Prolog m) { 
    // block_args(A,B,C,D,E,[D],F,G,[H|I],J,K):-(A=B,L=J),(!,M=L),M=[label(H)|N],(arg(A,C,O),P=N),block(O,D,E,F,G,I,P,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21;
        Operation p1, p2;
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
    // block_args(A,B,C,D,E,[D],F,G,[H|I],J,K):-['$get_level'(L),'$unify'(A,B),'$unify'(M,J),'$cut'(L),'$unify'(N,M),'$unify'(N,[label(H)|O]),arg(A,C,P),'$unify'(Q,O),block(P,D,E,F,G,I,Q,K)]
        a6 = a6.dref();
        if (a6 .isCons()){
                        if (! a4.unify(a6.car(), m.trail))
                return m.fail();
            if (!  Prolog.Nil .unify(a6.cdr(), m.trail))
                return m.fail();
        } else if (a6.isVar()){
             a6.bind(CONS(a4,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a9 = a9.dref();
        if (a9 .isCons()){
                        a12 = a9.car();
            a13 = a9.cdr();
        } else if (a9.isVar()){
            a12 = m.mkvar2();
            a13 = m.mkvar2();
             a9.bind(CONS(a12, a13), m.trail);
        } else {
            return m.fail();
        }
        a14 = m.mkvar1();
        //START inline expansion of $get_level(a(14))
        if (! a14.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),a(2))
        if (! a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a15 = m.mkvar1();
        //START inline expansion of $unify(a(15),a(10))
        if (! a15.unify(a10, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(14))
        a14 = a14.dref();
                  m.cut( a14.intValue());
        //END inline expansion
        a16 = m.mkvar1();
        //START inline expansion of $unify(a(16),a(15))
        if (! a16.unify(a15, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(12)],y(1)),put_str(@('FUNCTOR_label_1'),y(1),a(17))
        a17 =  S( FUNCTOR_label_1 , a12);
 ;
        a18 = m.mkvar1();
        a19 = CONS(a17, a18);
        //START inline expansion of $unify(a(16),a(19))
        if (! a16.unify(a19, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a20 = m.mkvar1();
        a21 = m.mkvar1();
        return //
 Op("arg", FILE_unify::PRED_arg_3_static_exec, VA(a1, a3, a20), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a21, a18), //
 Op("block", FILE_unify::PRED_block_8_static_exec, VA(a20, a4, a5, a7, a8, a13, a21, a11), cont)));
    }

    private final static Operation block_args_11_3(Prolog m) { 
    // block_args(A,B,C,D,E,[D|F],G,H,I,J,K):-(A<B,L=J),(!,M=L),(arg(A,C,N),O=M),block(N,D,P,G,Q,R,O,S),(T is A+1,U=S),block_args(T,B,C,P,E,F,Q,H,I,U,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23;
        Operation p1, p2, p3, p4, p5;
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
    // block_args(A,B,C,D,E,[D|F],G,H,I,J,K):-['$get_level'(L),'$less_than'(A,B),'$unify'(M,J),'$cut'(L),'$unify'(N,M),arg(A,C,O),'$unify'(P,N),block(O,D,Q,G,R,S,P,T),U is A+1,'$unify'(V,T),block_args(U,B,C,Q,E,F,R,H,I,V,K)]
        a6 = a6.dref();
        if (a6 .isCons()){
                        if (! a4.unify(a6.car(), m.trail))
                return m.fail();
            a12 = a6.cdr();
        } else if (a6.isVar()){
            a12 = m.mkvar2();
             a6.bind(CONS(a4, a12), m.trail);
        } else {
            return m.fail();
        }
        a13 = m.mkvar1();
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        a14 = m.mkvar1();
        //START inline expansion of $unify(a(14),a(10))
        if (! a14.unify(a10, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(13))
        a13 = a13.dref();
                  m.cut( a13.intValue());
        //END inline expansion
        a15 = m.mkvar1();
        //START inline expansion of $unify(a(15),a(14))
        if (! a15.unify(a14, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        a21 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(22))
        a22 =  S( FUNCTOR_$002B_2 , a1,  int_1 );
 ;
        a23 = m.mkvar1();
        return //
 Op("arg", FILE_unify::PRED_arg_3_static_exec, VA(a1, a3, a16), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a17, a15), //
 Op("block", FILE_unify::PRED_block_8_static_exec, VA(a16, a4, a18, a7, a19, m.DONT_CARE2(), a17, a20), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a21, a22), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a23, a20), //
 Op("block_args", FILE_unify::PRED_block_args_11_static_exec, VA(a21, a2, a3, a18, a5, a12, a19, a8, a9, a23, a11), cont))))));
    }
/** PREDICATE: make_slots/9
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(make_slots/9,public)

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_make_slots_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(9, null, FILE_unify::make_slots_9_sub_1);
        return make_slots_9_1(m);
    }

    private final static Operation make_slots_9_sub_1(Prolog m) { 
        m.trust(null);
        return make_slots_9_2(m);
    }

    private final static Operation make_slots_9_1(Prolog m) { 
    // make_slots(A,B,C,D,[],E,E,F,G):-(A>B,H=F),!,G=H
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
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
        cont = m.cont;
    // make_slots(A,B,C,D,[],E,E,F,G):-['$get_level'(H),'$greater_than'(A,B),'$unify'(I,F),'$cut'(H),'$unify'(G,I)]
        if (!  Prolog.Nil .unify(a5, m.trail))
            return m.fail();
        if (! a6.unify(a7, m.trail))
            return m.fail();
        a10 = m.mkvar1();
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        a11 = m.mkvar1();
        //START inline expansion of $unify(a(11),a(8))
        if (! a11.unify(a8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(10))
        a10 = a10.dref();
                  m.cut( a10.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(9),a(11))
        if (! a9.unify(a11, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation make_slots_9_2(Prolog m) { 
    // make_slots(A,B,C,D,[E|F],G,H,I,J):-(A=<B,K=I),(!,L=K),(arg(A,C,M),N=L),init_var(M,D,G,N,O),((incl(M,G,P),make_word(M,E,Q)),R=O),R=[move(Q,[h+D])|S],((T is D+1,U is A+1),V=S),make_slots(U,B,C,T,F,P,H,V,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
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
        cont = m.cont;
    // make_slots(A,B,C,D,[E|F],G,H,I,J):-['$get_level'(K),'$less_or_equal'(A,B),'$unify'(L,I),'$cut'(K),'$unify'(M,L),arg(A,C,N),'$unify'(O,M),init_var(N,D,G,O,P),incl(N,G,Q),make_word(N,E,R),'$unify'(S,P),'$unify'(S,[move(R,[h+D])|T]),U is D+1,V is A+1,'$unify'(W,T),make_slots(V,B,C,U,F,Q,H,W,J)]
        a5 = a5.dref();
        if (a5 .isCons()){
                        a10 = a5.car();
            a11 = a5.cdr();
        } else if (a5.isVar()){
            a10 = m.mkvar2();
            a11 = m.mkvar2();
             a5.bind(CONS(a10, a11), m.trail);
        } else {
            return m.fail();
        }
        a12 = m.mkvar1();
        //START inline expansion of $get_level(a(12))
        if (! a12.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_or_equal(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
            return m.fail();
        }
        //END inline expansion
        a13 = m.mkvar1();
        //START inline expansion of $unify(a(13),a(8))
        if (! a13.unify(a8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(12))
        a12 = a12.dref();
                  m.cut( a12.intValue());
        //END inline expansion
        a14 = m.mkvar1();
        //START inline expansion of $unify(a(14),a(13))
        if (! a14.unify(a13, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
    // put_str_args([@('ATOM_h'),a(4)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(21))
        a21 =  S( FUNCTOR_$002B_2 ,  ATOM_h , a4);
 ;
        a22 = CONS(a21,  Prolog.Nil );
    // put_str_args([a(19),a(22)],y(2)),put_str(@('FUNCTOR_move_2'),y(2),a(23))
        a23 =  S( FUNCTOR_move_2 , a19, a22);
 ;
        a24 = m.mkvar1();
        a25 = CONS(a23, a24);
        a26 = m.mkvar1();
    // put_str_args([a(4),@(int_1)],y(3)),put_str(@('FUNCTOR_$002B_2'),y(3),a(27))
        a27 =  S( FUNCTOR_$002B_2 , a4,  int_1 );
 ;
        a28 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(4)),put_str(@('FUNCTOR_$002B_2'),y(4),a(29))
        a29 =  S( FUNCTOR_$002B_2 , a1,  int_1 );
 ;
        a30 = m.mkvar1();
        return //
 Op("arg", FILE_unify::PRED_arg_3_static_exec, VA(a1, a3, a15), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a16, a14), //
 Op("init_var", FILE_unify::PRED_init_var_5_static_exec, VA(a15, a4, a6, a16, a17), //
 Op("incl", FILE_unify::PRED_incl_3_static_exec, VA(a15, a6, a18), //
 Op("make_word", FILE_unify::PRED_make_word_3_static_exec, VA(a15, a10, a19), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a20, a17), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a20, a25), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a26, a27), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a28, a29), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a30, a24), //
 Op("make_slots", FILE_unify::PRED_make_slots_9_static_exec, VA(a28, a2, a3, a26, a11, a18, a7, a30, a9), cont)))))))))));
    }
/** PREDICATE: $dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main('$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'/2,public)




    public static Operation PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_unify::$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_sub_1);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_1(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_2(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_1(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-myin(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-['$get_level'(C),myin(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_2(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: init_var/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(init_var/5,public)

    // private final Term arg5;




    public static Operation PRED_init_var_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_unify::init_var_5_sub_1);
        return init_var_5_1(m);
    }

    private final static Operation init_var_5_sub_1(Prolog m) { 
        m.retry(null, FILE_unify::init_var_5_sub_2);
        return init_var_5_2(m);
    }

    private final static Operation init_var_5_sub_2(Prolog m) { 
        m.trust(null);
        return init_var_5_3(m);
    }

    private final static Operation init_var_5_1(Prolog m) { 
    // init_var(A,B,C,D,E):-((var(A),'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,C)),F=D),(!,G=F),G=[move(tvar^(h+B),A)|E]
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // init_var(A,B,C,D,E):-['$get_level'(F),var(A),'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,C),'$unify'(G,D),'$cut'(F),'$unify'(H,G),'$unify'(H,[move(tvar^(h+B),A)|E])]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        a8 = m.mkvar1();
    // put_str_args([@('ATOM_h'),a(2)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(9))
        a9 =  S( FUNCTOR_$002B_2 ,  ATOM_h , a2);
 ;
    // put_str_args([@('ATOM_tvar'),a(9)],y(2)),put_str(@('FUNCTOR_$005E_2'),y(2),a(10))
        a10 =  S( FUNCTOR_$005E_2 ,  ATOM_tvar , a9);
 ;
    // put_str_args([a(10),a(1)],y(3)),put_str(@('FUNCTOR_move_2'),y(3),a(11))
        a11 =  S( FUNCTOR_move_2 , a10, a1);
 ;
        a12 = CONS(a11, a5);
        return //
 Op("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl", FILE_unify::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec, VA(a1, a3), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a7, a4), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a6), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a8, a7), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a8, a12), cont)))));
    }

    private final static Operation init_var_5_2(Prolog m) { 
    // init_var(A,B,C,D,E):-((var(A),myin(A,C)),F=D),!,E=F
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // init_var(A,B,C,D,E):-['$get_level'(F),var(A),myin(A,C),'$unify'(G,D),'$cut'(F),'$unify'(E,G)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        return //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a1, a3), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a7, a4), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a6), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a5, a7), cont))));
    }

    private final static Operation init_var_5_3(Prolog m) { 
    // init_var(A,B,C,D,E):-(nonvar(A),F=D),!,E=F
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // init_var(A,B,C,D,E):-['$get_level'(F),nonvar(A),'$unify'(G,D),'$cut'(F),'$unify'(E,G)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of nonvar(a(1))
        a1 = a1.dref();
        if ((a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        //START inline expansion of $unify(a(7),a(4))
        if (! a7.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(5),a(7))
        if (! a5.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: make_word/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(make_word/3,public)




    public static Operation PRED_make_word_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_unify::make_word_3_sub_1);
        return make_word_3_1(m);
    }

    private final static Operation make_word_3_sub_1(Prolog m) { 
        m.retry(null, FILE_unify::make_word_3_sub_2);
        return make_word_3_2(m);
    }

    private final static Operation make_word_3_sub_2(Prolog m) { 
        m.trust(null);
        return make_word_3_3(m);
    }

    private final static Operation make_word_3_1(Prolog m) { 
    // make_word(A,B,C^(h+B)):-my_compound(A),!,termtag(A,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // make_word(A,B,C^(h+B)):-['$get_level'(D),my_compound(A),'$cut'(D),termtag(A,C)]
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$005E_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_$002B_2 , m.trail,  ATOM_h , a2)){
                return m.fail();
            }
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("my_compound", FILE_unify::PRED_my_compound_1_static_exec, VA(a1), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a6), //
 Op("termtag", FILE_unify::PRED_termtag_2_static_exec, VA(a1, a4), cont)));
    }

    private final static Operation make_word_3_2(Prolog m) { 
    // make_word(A,B,A):-var(A),!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // make_word(A,B,A):-['$get_level'(C),var(A),'$cut'(C)]
        if (! a1.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation make_word_3_3(Prolog m) { 
    // make_word(A,B,tatm^A):-atomic(A),!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // make_word(A,B,tatm^A):-['$get_level'(C),atomic(A),'$cut'(C)]
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_$005E_2 , m.trail,  ATOM_tatm , a1)){
                return m.fail();
            }
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }
/** PREDICATE: size/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(size/3,public)




    public static Operation PRED_size_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_unify::size_3_sub_1);
        return size_3_1(m);
    }

    private final static Operation size_3_sub_1(Prolog m) { 
        m.retry(null, FILE_unify::size_3_sub_2);
        return size_3_2(m);
    }

    private final static Operation size_3_sub_2(Prolog m) { 
        m.retry(null, FILE_unify::size_3_sub_3);
        return size_3_3(m);
    }

    private final static Operation size_3_sub_3(Prolog m) { 
        m.trust(null);
        return size_3_4(m);
    }

    private final static Operation size_3_1(Prolog m) { 
    // size(A,B,C):-(structure(A),D=B),(!,E=D),(functor(A,F,G),H=E),add(1,H,I),add(G,I,J),size_args(1,G,A,J,C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4, p5, p6, p7, p8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // size(A,B,C):-['$get_level'(D),structure(A),'$unify'(E,B),'$cut'(D),'$unify'(F,E),functor(A,G,H),'$unify'(I,F),add(1,I,J),add(H,J,K),size_args(1,H,A,K,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        return //
 Op("structure", FILE_unify::PRED_structure_1_static_exec, VA(a1), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a5, a2), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a4), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a6, a5), //
 Op("functor", FILE_unify::PRED_functor_3_static_exec, VA(a1, m.DONT_CARE2(), a7), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a8, a6), //
 Op("add", FILE_unify::PRED_add_3_static_exec, VA( int_1 , a8, a9), //
 Op("add", FILE_unify::PRED_add_3_static_exec, VA(a7, a9, a10), //
 Op("size_args", FILE_unify::PRED_size_args_5_static_exec, VA( int_1 , a7, a1, a10, a3), cont)))))))));
    }

    private final static Operation size_3_2(Prolog m) { 
    // size(A,B,C):-(cons(A),D=B),(!,E=D),add(2,E,F),size_args(1,2,A,F,C)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // size(A,B,C):-['$get_level'(D),cons(A),'$unify'(E,B),'$cut'(D),'$unify'(F,E),add(2,F,G),size_args(1,2,A,G,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op("cons", FILE_unify::PRED_cons_1_static_exec, VA(a1), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a5, a2), //
 Op("$cut", FILE_unify::PRED_$cut_1_static_exec, VA(a4), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a6, a5), //
 Op("add", FILE_unify::PRED_add_3_static_exec, VA( int_2 , a6, a7), //
 Op("size_args", FILE_unify::PRED_size_args_5_static_exec, VA( int_1 ,  int_2 , a1, a7, a3), cont))))));
    }

    private final static Operation size_3_3(Prolog m) { 
    // size(A,B,C):-(atomic(A),D=B),!,C=D
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // size(A,B,C):-['$get_level'(D),atomic(A),'$unify'(E,B),'$cut'(D),'$unify'(C,E)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        //START inline expansion of $unify(a(5),a(2))
        if (! a5.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(3),a(5))
        if (! a3.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation size_3_4(Prolog m) { 
    // size(A,B,C):-(var(A),D=B),!,C=D
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // size(A,B,C):-['$get_level'(D),var(A),'$unify'(E,B),'$cut'(D),'$unify'(C,E)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        //START inline expansion of $unify(a(5),a(2))
        if (! a5.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(3),a(5))
        if (! a3.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: size_args/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(size_args/5,public)

    // private final Term arg5;




    public static Operation PRED_size_args_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_unify::size_args_5_sub_1);
        return size_args_5_1(m);
    }

    private final static Operation size_args_5_sub_1(Prolog m) { 
        m.trust(null);
        return size_args_5_2(m);
    }

    private final static Operation size_args_5_1(Prolog m) { 
    // size_args(A,B,C,D,E):-(A>B,F=D),!,E=F
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // size_args(A,B,C,D,E):-['$get_level'(F),'$greater_than'(A,B),'$unify'(G,D),'$cut'(F),'$unify'(E,G)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        //START inline expansion of $unify(a(7),a(4))
        if (! a7.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(5),a(7))
        if (! a5.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation size_args_5_2(Prolog m) { 
    // size_args(A,B,C,D,E):-(A=<B,F=D),(!,G=F),(arg(A,C,H),I=G),size(H,I,J),(K is A+1,L=J),size_args(K,B,C,L,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // size_args(A,B,C,D,E):-['$get_level'(F),'$less_or_equal'(A,B),'$unify'(G,D),'$cut'(F),'$unify'(H,G),arg(A,C,I),'$unify'(J,H),size(I,J,K),L is A+1,'$unify'(M,K),size_args(L,B,C,M,E)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_or_equal(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        //START inline expansion of $unify(a(7),a(4))
        if (! a7.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        a8 = m.mkvar1();
        //START inline expansion of $unify(a(8),a(7))
        if (! a8.unify(a7, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(13))
        a13 =  S( FUNCTOR_$002B_2 , a1,  int_1 );
 ;
        a14 = m.mkvar1();
        return //
 Op("arg", FILE_unify::PRED_arg_3_static_exec, VA(a1, a3, a9), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a10, a8), //
 Op("size", FILE_unify::PRED_size_3_static_exec, VA(a9, a10, a11), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a12, a13), //
 Op("$unify", FILE_unify::PRED_$unify_2_static_exec, VA(a14, a11), //
 Op("size_args", FILE_unify::PRED_size_args_5_static_exec, VA(a12, a2, a3, a14, a5), cont))))));
    }
/** PREDICATE: add/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(add/3,public)




    public static Operation PRED_add_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // add(A,B,C):-C is B+A
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // add(A,B,C):-[C is B+A]
    // put_str_args([a(2),a(1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$002B_2 , a2, a1);
 ;
        //START inline expansion of a(3)is a(4)
        if (! a3.unify(Arithmetic.evaluate(a4), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: myin/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(myin/2,public)




    public static Operation PRED_myin_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // myin(A,[B|C]):-compare(D,A,B),in_2(D,A,C)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // myin(A,[B|C]):-[compare(D,A,B),in_2(D,A,C)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a3 = a2.car();
            a4 = a2.cdr();
        } else if (a2.isVar()){
            a3 = m.mkvar2();
            a4 = m.mkvar2();
             a2.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        a5 = m.mkvar1();
        return //
 Op("compare", FILE_builtins::PRED_compare_3_static_exec, VA(a5, a1, a3), //
 Op("in_2", FILE_unify::PRED_in_2_3_static_exec, VA(a5, a1, a4), cont));
    }
/** PREDICATE: in_2/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(in_2/3,public)
        final static Functor ATOM_$003D = SYM("=");
        final static Functor ATOM_$003E = SYM(">");




    public static Operation PRED_in_2_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_unify::in_2_3_var, fail_0, fail_0, FILE_unify::in_2_3_var, fail_0, fail_0); 
    }

    private final static Operation in_2_3_var(Prolog m) { 
        m.jtry3(null, FILE_unify::in_2_3_var_1);
        return in_2_3_1(m);
    }

    private final static Operation in_2_3_var_1(Prolog m) { 
        m.trust(null);
        return in_2_3_2(m);
    }

    private final static Operation in_2_3_1(Prolog m) { 
    // in_2(=,A,B):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // in_2(=,A,B):-[]
        if (!  ATOM_$003D .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation in_2_3_2(Prolog m) { 
    // in_2(>,A,B):-myin(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // in_2(>,A,B):-[myin(A,B)]
        if (!  ATOM_$003E .unify(a1, m.trail))
            return m.fail();
        return //
 Op("myin", FILE_unify::PRED_myin_2_static_exec, VA(a2, a3), cont);
    }
/** PREDICATE: incl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(incl/3,public)




    public static Operation PRED_incl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // incl(A,B,C):-incl_2(B,A,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // incl(A,B,C):-[incl_2(B,A,C)]
        return //
 Op("incl_2", FILE_unify::PRED_incl_2_3_static_exec, VA(a2, a1, a3), cont);
    }
/** PREDICATE: incl_2/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(incl_2/3,public)




    public static Operation PRED_incl_2_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_unify::incl_2_3_var, fail_0, fail_0, FILE_unify::incl_2_3_1, fail_0, FILE_unify::incl_2_3_2); 
    }

    private final static Operation incl_2_3_var(Prolog m) { 
        m.jtry3(null, FILE_unify::incl_2_3_var_1);
        return incl_2_3_1(m);
    }

    private final static Operation incl_2_3_var_1(Prolog m) { 
        m.trust(null);
        return incl_2_3_2(m);
    }

    private final static Operation incl_2_3_1(Prolog m) { 
    // incl_2([],A,[A]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // incl_2([],A,[A]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a2.unify(a3.car(), m.trail))
                return m.fail();
            if (!  Prolog.Nil .unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
             a3.bind(CONS(a2,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation incl_2_3_2(Prolog m) { 
    // incl_2([A|B],C,D):-compare(E,C,A),incl_3(E,C,A,B,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // incl_2([A|B],C,D):-[compare(E,C,A),incl_3(E,C,A,B,D)]
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
        return //
 Op("compare", FILE_builtins::PRED_compare_3_static_exec, VA(a6, a2, a4), //
 Op("incl_3", FILE_unify::PRED_incl_3_5_static_exec, VA(a6, a2, a4, a5, a3), cont));
    }
/** PREDICATE: incl_3/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(incl_3/5,public)
        final static Functor ATOM_$003C = SYM("<");

    // private final Term arg5;




    public static Operation PRED_incl_3_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_unify::incl_3_5_var, fail_0, fail_0, FILE_unify::incl_3_5_var, fail_0, fail_0); 
    }

    private final static Operation incl_3_5_var(Prolog m) { 
        m.jtry5(null, FILE_unify::incl_3_5_var_1);
        return incl_3_5_1(m);
    }

    private final static Operation incl_3_5_var_1(Prolog m) { 
        m.retry(null, FILE_unify::incl_3_5_var_2);
        return incl_3_5_2(m);
    }

    private final static Operation incl_3_5_var_2(Prolog m) { 
        m.trust(null);
        return incl_3_5_3(m);
    }

    private final static Operation incl_3_5_1(Prolog m) { 
    // incl_3(<,A,B,C,[A,B|C]):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // incl_3(<,A,B,C,[A,B|C]):-[]
        if (!  ATOM_$003C .unify(a1, m.trail))
            return m.fail();
        a5 = a5.dref();
        if (a5 .isCons()){
                        if (! a2.unify(a5.car(), m.trail))
                return m.fail();
            a6 = a5.cdr();
        } else if (a5.isVar()){
            a6 = m.mkvar2();
             a5.bind(CONS(a2, a6), m.trail);
        } else {
            return m.fail();
        }
        a6 = a6.dref();
        if (a6 .isCons()){
                        if (! a3.unify(a6.car(), m.trail))
                return m.fail();
            if (! a4.unify(a6.cdr(), m.trail))
                return m.fail();
        } else if (a6.isVar()){
             a6.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation incl_3_5_2(Prolog m) { 
    // incl_3(=,A,B,C,[B|C]):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // incl_3(=,A,B,C,[B|C]):-[]
        if (!  ATOM_$003D .unify(a1, m.trail))
            return m.fail();
        a5 = a5.dref();
        if (a5 .isCons()){
                        if (! a3.unify(a5.car(), m.trail))
                return m.fail();
            if (! a4.unify(a5.cdr(), m.trail))
                return m.fail();
        } else if (a5.isVar()){
             a5.bind(CONS(a3, a4), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation incl_3_5_3(Prolog m) { 
    // incl_3(>,A,B,C,[B|D]):-incl_2(C,A,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // incl_3(>,A,B,C,[B|D]):-[incl_2(C,A,D)]
        if (!  ATOM_$003E .unify(a1, m.trail))
            return m.fail();
        a5 = a5.dref();
        if (a5 .isCons()){
                        if (! a3.unify(a5.car(), m.trail))
                return m.fail();
            a6 = a5.cdr();
        } else if (a5.isVar()){
            a6 = m.mkvar2();
             a5.bind(CONS(a3, a6), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("incl_2", FILE_unify::PRED_incl_2_3_static_exec, VA(a4, a2, a6), cont);
    }
/** PREDICATE: $dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main('$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'/1,public)




    public static Operation PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_unify::$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_1_sub_1);
        return $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_1_1(m);
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_1_2(m);
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_1_1(Prolog m) { 
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A):-atomic(A),!,fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A):-['$get_level'(B),atomic(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_1_2(Prolog m) { 
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A):-[]
        return cont;
    }
/** PREDICATE: my_compound/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(my_compound/1,public)




    public static Operation PRED_my_compound_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // my_compound(A):-nonvar(A),'$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // my_compound(A):-[nonvar(A),'$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A)]
        //START inline expansion of nonvar(a(1))
        a1 = a1.dref();
        if ((a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl", FILE_unify::PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: cons/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(cons/1,public)




    public static Operation PRED_cons_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // cons(A):-nonvar(A),A=[B|C]
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // cons(A):-[nonvar(A),'$unify'(A,[B|C])]
        //START inline expansion of nonvar(a(1))
        a1 = a1.dref();
        if ((a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        a2 = CONS(m.DONT_CARE1(), m.DONT_CARE1());
        //START inline expansion of $unify(a(1),a(2))
        if (! a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main('$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'/3,public)




    public static Operation PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_unify::$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_3_sub_1);
        return $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_3_1(m);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_3_2(m);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_3_1(Prolog m) { 
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B,C):-A=[B|C],!,fail
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B,C):-['$get_level'(D),'$unify'(A,[B|C]),'$cut'(D),fail]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = CONS(a2, a3);
        //START inline expansion of $unify(a(1),a(5))
        if (! a1.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_3_2(Prolog m) { 
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B,C):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B,C):-[]
        return cont;
    }
/** PREDICATE: structure/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(structure/1,public)




    public static Operation PRED_structure_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // structure(A):-my_compound(A),'$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B,C)
        m.setB0();
         Term a1;
        Operation p1;
        a1 = LARG[0];
    // structure(A):-[my_compound(A),'$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl'(A,B,C)]
        return //
 Op("my_compound", FILE_unify::PRED_my_compound_1_static_exec, VA(a1), //
 Op("$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl", FILE_unify::PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_3_static_exec, VA(a1, m.DONT_CARE2(), m.DONT_CARE2()), cont));
    }
/** PREDICATE: termtag/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl
*/
    // main(termtag/2,public)
        final static Functor ATOM_tstr = SYM("tstr");
        final static Functor ATOM_tlst = SYM("tlst");




    public static Operation PRED_termtag_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_unify::termtag_2_sub_1);
        return termtag_2_1(m);
    }

    private final static Operation termtag_2_sub_1(Prolog m) { 
        m.retry(null, FILE_unify::termtag_2_sub_2);
        return termtag_2_2(m);
    }

    private final static Operation termtag_2_sub_2(Prolog m) { 
        m.retry(null, FILE_unify::termtag_2_sub_3);
        return termtag_2_3(m);
    }

    private final static Operation termtag_2_sub_3(Prolog m) { 
        m.trust(null);
        return termtag_2_4(m);
    }

    private final static Operation termtag_2_1(Prolog m) { 
    // termtag(A,tstr):-structure(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // termtag(A,tstr):-[structure(A)]
        if (!  ATOM_tstr .unify(a2, m.trail))
            return m.fail();
        return //
 Op("structure", FILE_unify::PRED_structure_1_static_exec, VA(a1), cont);
    }

    private final static Operation termtag_2_2(Prolog m) { 
    // termtag(A,tlst):-cons(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // termtag(A,tlst):-[cons(A)]
        if (!  ATOM_tlst .unify(a2, m.trail))
            return m.fail();
        return //
 Op("cons", FILE_unify::PRED_cons_1_static_exec, VA(a1), cont);
    }

    private final static Operation termtag_2_3(Prolog m) { 
    // termtag(A,tatm):-atomic(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // termtag(A,tatm):-[atomic(A)]
        if (!  ATOM_tatm .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation termtag_2_4(Prolog m) { 
    // termtag(A,tvar):-var(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // termtag(A,tvar):-[var(A)]
        if (!  ATOM_tvar .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_unify::PRED_top_0_static_exec);
   PredTable.registerBuiltin("main",1,FILE_unify::PRED_main_1_static_exec);
   PredTable.registerBuiltin("u",4,FILE_unify::PRED_u_4_static_exec);
   PredTable.registerBuiltin("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl","$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl",2,FILE_unify::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec);
   PredTable.registerBuiltin("unify",6,FILE_unify::PRED_unify_6_static_exec);
   PredTable.registerBuiltin("uninit",6,FILE_unify::PRED_uninit_6_static_exec);
   PredTable.registerBuiltin("init",8,FILE_unify::PRED_init_8_static_exec);
   PredTable.registerBuiltin("unify_var",6,FILE_unify::PRED_unify_var_6_static_exec);
   PredTable.registerBuiltin("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl","$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl",2,FILE_unify::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl","$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl",2,FILE_unify::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl","$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl",2,FILE_unify::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl","$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl",2,FILE_unify::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec);
   PredTable.registerBuiltin("unify_readmode",7,FILE_unify::PRED_unify_readmode_7_static_exec);
   PredTable.registerBuiltin("unify_args",10,FILE_unify::PRED_unify_args_10_static_exec);
   PredTable.registerBuiltin("unify_arg",10,FILE_unify::PRED_unify_arg_10_static_exec);
   PredTable.registerBuiltin("unify_writemode",7,FILE_unify::PRED_unify_writemode_7_static_exec);
   PredTable.registerBuiltin("unify_block",8,FILE_unify::PRED_unify_block_8_static_exec);
   PredTable.registerBuiltin("block",8,FILE_unify::PRED_block_8_static_exec);
   PredTable.registerBuiltin("block_args",11,FILE_unify::PRED_block_args_11_static_exec);
   PredTable.registerBuiltin("make_slots",9,FILE_unify::PRED_make_slots_9_static_exec);
   PredTable.registerBuiltin("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl","$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl",2,FILE_unify::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_2_static_exec);
   PredTable.registerBuiltin("init_var",5,FILE_unify::PRED_init_var_5_static_exec);
   PredTable.registerBuiltin("make_word",3,FILE_unify::PRED_make_word_3_static_exec);
   PredTable.registerBuiltin("size",3,FILE_unify::PRED_size_3_static_exec);
   PredTable.registerBuiltin("size_args",5,FILE_unify::PRED_size_args_5_static_exec);
   PredTable.registerBuiltin("add",3,FILE_unify::PRED_add_3_static_exec);
   PredTable.registerBuiltin("myin",2,FILE_unify::PRED_myin_2_static_exec);
   PredTable.registerBuiltin("in_2",3,FILE_unify::PRED_in_2_3_static_exec);
   PredTable.registerBuiltin("incl",3,FILE_unify::PRED_incl_3_static_exec);
   PredTable.registerBuiltin("incl_2",3,FILE_unify::PRED_incl_2_3_static_exec);
   PredTable.registerBuiltin("incl_3",5,FILE_unify::PRED_incl_3_5_static_exec);
   PredTable.registerBuiltin("$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl","$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl",1,FILE_unify::PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_1_static_exec);
   PredTable.registerBuiltin("my_compound",1,FILE_unify::PRED_my_compound_1_static_exec);
   PredTable.registerBuiltin("cons",1,FILE_unify::PRED_cons_1_static_exec);
   PredTable.registerBuiltin("$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/unify.pl","$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl",3,FILE_unify::PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Funify$002Epl_3_static_exec);
   PredTable.registerBuiltin("structure",1,FILE_unify::PRED_structure_1_static_exec);
   PredTable.registerBuiltin("termtag",2,FILE_unify::PRED_termtag_2_static_exec);
}
}

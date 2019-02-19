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
public class FILE_reducer extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(top/0,public)
        final static Functor FUNCTOR_fac_1 = F("fac",1);
    private static final Compound L_top_0_s4 = S( FUNCTOR_fac_1 ,  int_3 );
        final static Functor FUNCTOR_quick_1 = F("quick",1);
    private static final Compound L_top_0_s9 = CONS( int_2 ,  Prolog.Nil );
    private static final Compound L_top_0_s10 = CONS( int_1 , L_top_0_s9);
    private static final Compound L_top_0_s11 = CONS( int_3 , L_top_0_s10);
    private static final Compound L_top_0_s13 = S( FUNCTOR_quick_1 , L_top_0_s11);




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-try(fac(3),A),try(quick([3,1,2]),B)
        m.setB0();
        Operation p1;
    // top:-[try(fac(3),A),try(quick([3,1,2]),B)]
        return //
 Op("try", FILE_reducer::PRED_try_2_static_exec, VA(L_top_0_s4, m.DONT_CARE2()), //
 Op("try", FILE_reducer::PRED_try_2_static_exec, VA(L_top_0_s13, m.DONT_CARE2()), cont));
    }
/** PREDICATE: try/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(try/2,public)




    public static Operation PRED_try_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // try(A,B):-listify(A,C),curry(C,D),t_reduce(D,E),make_list(E,B)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
    // try(A,B):-[listify(A,C),curry(C,D),t_reduce(D,E),make_list(E,B)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op("listify", FILE_reducer::PRED_listify_2_static_exec, VA(a1, a3), //
 Op("curry", FILE_reducer::PRED_curry_2_static_exec, VA(a3, a4), //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a4, a5), //
 Op("make_list", FILE_reducer::PRED_make_list_2_static_exec, VA(a5, a2), cont))));
    }
/** PREDICATE: end/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(end/1,public)




    public static Operation PRED_end_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_reducer::end_1_sub_1);
        return end_1_1(m);
    }

    private final static Operation end_1_sub_1(Prolog m) { 
        m.trust(null);
        return end_1_2(m);
    }

    private final static Operation end_1_1(Prolog m) { 
    // end(A):-atom(A),!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // end(A):-['$get_level'(B),atom(A),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(1))
        a1 = a1.dref();
        if (! (a1 .isAtom())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation end_1_2(Prolog m) { 
    // end(A):-A==[]
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // end(A):-['$equality_of_term'(A,[])]
        //START inline expansion of $equality_of_term(a(1),@(Prolog.Nil))
        a1 = a1.dref();
        if (! a1.equalsTerm(Prolog.Nil)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: list_functor_name/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(list_functor_name/1,public)




    public static Operation PRED_list_functor_name_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // list_functor_name(A):-functor([B|C],A,D)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // list_functor_name(A):-[functor([B|C],A,D)]
        a2 = CONS(m.DONT_CARE1(), m.DONT_CARE1());
        return //
 Op("functor", FILE_reducer::PRED_functor_3_static_exec, VA(a2, a1, m.DONT_CARE2()), cont);
    }
/** PREDICATE: t_def/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(t_def/3,public)
        final static Functor ATOM_fac = SYM("fac");
        final static Functor FUNCTOR_cond_3 = F("cond",3);
        final static Functor FUNCTOR_$003D_2 = F("=",2);
        final static Functor FUNCTOR_$002A_2 = F("*",2);
        final static Functor FUNCTOR_$002D_2 = F("-",2);
        final static Functor ATOM_quick = SYM("quick");
        final static Functor FUNCTOR_tl_1 = F("tl",1);
        final static Functor FUNCTOR_quick2_1 = F("quick2",1);
        final static Functor FUNCTOR_split_2 = F("split",2);
        final static Functor FUNCTOR_hd_1 = F("hd",1);
        final static Functor ATOM_quick2 = SYM("quick2");
        final static Functor FUNCTOR_append_2 = F("append",2);
        final static Functor ATOM_split = SYM("split");
        final static Functor FUNCTOR_$003D$003C_2 = F("=<",2);
        final static Functor FUNCTOR_inserthead_2 = F("inserthead",2);
        final static Functor FUNCTOR_inserttail_2 = F("inserttail",2);
        final static Functor ATOM_inserthead = SYM("inserthead");
        final static Functor ATOM_inserttail = SYM("inserttail");
        final static Functor ATOM_append = SYM("append");




    public static Operation PRED_t_def_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::t_def_3_var, fail_0, fail_0, FILE_reducer::t_def_3_var, fail_0, fail_0); 
    }

    private final static Operation t_def_3_var(Prolog m) { 
        m.jtry3(null, FILE_reducer::t_def_3_var_1);
        return t_def_3_1(m);
    }

    private final static Operation t_def_3_var_1(Prolog m) { 
        m.retry(null, FILE_reducer::t_def_3_var_2);
        return t_def_3_2(m);
    }

    private final static Operation t_def_3_var_2(Prolog m) { 
        m.retry(null, FILE_reducer::t_def_3_var_3);
        return t_def_3_3(m);
    }

    private final static Operation t_def_3_var_3(Prolog m) { 
        m.retry(null, FILE_reducer::t_def_3_var_4);
        return t_def_3_4(m);
    }

    private final static Operation t_def_3_var_4(Prolog m) { 
        m.retry(null, FILE_reducer::t_def_3_var_5);
        return t_def_3_5(m);
    }

    private final static Operation t_def_3_var_5(Prolog m) { 
        m.retry(null, FILE_reducer::t_def_3_var_6);
        return t_def_3_6(m);
    }

    private final static Operation t_def_3_var_6(Prolog m) { 
        m.trust(null);
        return t_def_3_7(m);
    }

    private final static Operation t_def_3_1(Prolog m) { 
    // t_def(fac,[A],cond(A=0,1,A*fac(A-1))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // t_def(fac,[A],cond(A=0,1,A*fac(A-1))):-[]
        if (!  ATOM_fac .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        a4 = a2.car();
            if (!  Prolog.Nil .unify(a2.cdr(), m.trail))
                return m.fail();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
             a2.bind(CONS(a4,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_cond_3 , m.trail, a5,  int_1 , a6)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_$003D_2 , m.trail, a4,  int_0 )){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002A_2 , m.trail, a4, a7)){
                return m.fail();
            }
        a7 = a7.dref();
            a8 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_fac_1 , m.trail, a8)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_$002D_2 , m.trail, a4,  int_1 )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation t_def_3_2(Prolog m) { 
    // t_def(quick,[A],cond(A=[],[],cond(tl(A)=[],A,quick2(split(hd(A),tl(A)))))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // t_def(quick,[A],cond(A=[],[],cond(tl(A)=[],A,quick2(split(hd(A),tl(A)))))):-[]
        if (!  ATOM_quick .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        a4 = a2.car();
            if (!  Prolog.Nil .unify(a2.cdr(), m.trail))
                return m.fail();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
             a2.bind(CONS(a4,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_cond_3 , m.trail, a5,  Prolog.Nil , a6)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_$003D_2 , m.trail, a4,  Prolog.Nil )){
                return m.fail();
            }
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_cond_3 , m.trail, a7, a4, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_$003D_2 , m.trail, a9,  Prolog.Nil )){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_tl_1 , m.trail, a4)){
                return m.fail();
            }
        a8 = a8.dref();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_quick2_1 , m.trail, a10)){
                return m.fail();
            }
        a10 = a10.dref();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            if (!a10.unifyS( FUNCTOR_split_2 , m.trail, a11, a12)){
                return m.fail();
            }
        a11 = a11.dref();
            if (!a11.unifyS( FUNCTOR_hd_1 , m.trail, a4)){
                return m.fail();
            }
        a12 = a12.dref();
            if (!a12.unifyS( FUNCTOR_tl_1 , m.trail, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation t_def_3_3(Prolog m) { 
    // t_def(quick2,[A],append(quick(hd(A)),quick(tl(A)))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // t_def(quick2,[A],append(quick(hd(A)),quick(tl(A)))):-[]
        if (!  ATOM_quick2 .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        a4 = a2.car();
            if (!  Prolog.Nil .unify(a2.cdr(), m.trail))
                return m.fail();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
             a2.bind(CONS(a4,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_append_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a5 = a5.dref();
            a7 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_quick_1 , m.trail, a7)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_hd_1 , m.trail, a4)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_quick_1 , m.trail, a8)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_tl_1 , m.trail, a4)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation t_def_3_4(Prolog m) { 
    // t_def(split,[A,B],cond(B=[],[[A]],cond(hd(B)=<A,inserthead(hd(B),split(A,tl(B))),inserttail(hd(B),split(A,tl(B)))))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // t_def(split,[A,B],cond(B=[],[[A]],cond(hd(B)=<A,inserthead(hd(B),split(A,tl(B))),inserttail(hd(B),split(A,tl(B)))))):-[]
        if (!  ATOM_split .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        a4 = a2.car();
            a5 = a2.cdr();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a2.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a5 = a5.dref();
        if (a5 .isCons()){
                        a6 = a5.car();
            if (!  Prolog.Nil .unify(a5.cdr(), m.trail))
                return m.fail();
        } else if (a5.isVar()){
            a6 = m.mkvar2();
             a5.bind(CONS(a6,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_cond_3 , m.trail, a7, a8, a9)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_$003D_2 , m.trail, a6,  Prolog.Nil )){
                return m.fail();
            }
        a8 = a8.dref();
        if (a8 .isCons()){
                        a10 = a8.car();
            if (!  Prolog.Nil .unify(a8.cdr(), m.trail))
                return m.fail();
        } else if (a8.isVar()){
            a10 = m.mkvar2();
             a8.bind(CONS(a10,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
        if (a10 .isCons()){
                        if (! a4.unify(a10.car(), m.trail))
                return m.fail();
            if (!  Prolog.Nil .unify(a10.cdr(), m.trail))
                return m.fail();
        } else if (a10.isVar()){
             a10.bind(CONS(a4,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a9 = a9.dref();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_cond_3 , m.trail, a11, a12, a13)){
                return m.fail();
            }
        a11 = a11.dref();
            a14 = m.mkvar2();
            if (!a11.unifyS( FUNCTOR_$003D$003C_2 , m.trail, a14, a4)){
                return m.fail();
            }
        a14 = a14.dref();
            if (!a14.unifyS( FUNCTOR_hd_1 , m.trail, a6)){
                return m.fail();
            }
        a12 = a12.dref();
            a15 = m.mkvar2();
            a16 = m.mkvar2();
            if (!a12.unifyS( FUNCTOR_inserthead_2 , m.trail, a15, a16)){
                return m.fail();
            }
        a15 = a15.dref();
            if (!a15.unifyS( FUNCTOR_hd_1 , m.trail, a6)){
                return m.fail();
            }
        a16 = a16.dref();
            a17 = m.mkvar2();
            if (!a16.unifyS( FUNCTOR_split_2 , m.trail, a4, a17)){
                return m.fail();
            }
        a17 = a17.dref();
            if (!a17.unifyS( FUNCTOR_tl_1 , m.trail, a6)){
                return m.fail();
            }
        a13 = a13.dref();
            a18 = m.mkvar2();
            a19 = m.mkvar2();
            if (!a13.unifyS( FUNCTOR_inserttail_2 , m.trail, a18, a19)){
                return m.fail();
            }
        a18 = a18.dref();
            if (!a18.unifyS( FUNCTOR_hd_1 , m.trail, a6)){
                return m.fail();
            }
        a19 = a19.dref();
            a20 = m.mkvar2();
            if (!a19.unifyS( FUNCTOR_split_2 , m.trail, a4, a20)){
                return m.fail();
            }
        a20 = a20.dref();
            if (!a20.unifyS( FUNCTOR_tl_1 , m.trail, a6)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation t_def_3_5(Prolog m) { 
    // t_def(inserthead,[A,B],[[A|hd(B)]|tl(B)]):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // t_def(inserthead,[A,B],[[A|hd(B)]|tl(B)]):-[]
        if (!  ATOM_inserthead .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        a4 = a2.car();
            a5 = a2.cdr();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a2.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a5 = a5.dref();
        if (a5 .isCons()){
                        a6 = a5.car();
            if (!  Prolog.Nil .unify(a5.cdr(), m.trail))
                return m.fail();
        } else if (a5.isVar()){
            a6 = m.mkvar2();
             a5.bind(CONS(a6,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        a7 = a3.car();
            a8 = a3.cdr();
        } else if (a3.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a3.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a7 = a7.dref();
        if (a7 .isCons()){
                        if (! a4.unify(a7.car(), m.trail))
                return m.fail();
            a9 = a7.cdr();
        } else if (a7.isVar()){
            a9 = m.mkvar2();
             a7.bind(CONS(a4, a9), m.trail);
        } else {
            return m.fail();
        }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_hd_1 , m.trail, a6)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_tl_1 , m.trail, a6)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation t_def_3_6(Prolog m) { 
    // t_def(inserttail,[A,B],[hd(B),A|tl(B)]):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // t_def(inserttail,[A,B],[hd(B),A|tl(B)]):-[]
        if (!  ATOM_inserttail .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        a4 = a2.car();
            a5 = a2.cdr();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a2.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a5 = a5.dref();
        if (a5 .isCons()){
                        a6 = a5.car();
            if (!  Prolog.Nil .unify(a5.cdr(), m.trail))
                return m.fail();
        } else if (a5.isVar()){
            a6 = m.mkvar2();
             a5.bind(CONS(a6,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        a7 = a3.car();
            a8 = a3.cdr();
        } else if (a3.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a3.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_hd_1 , m.trail, a6)){
                return m.fail();
            }
        a8 = a8.dref();
        if (a8 .isCons()){
                        if (! a4.unify(a8.car(), m.trail))
                return m.fail();
            a9 = a8.cdr();
        } else if (a8.isVar()){
            a9 = m.mkvar2();
             a8.bind(CONS(a4, a9), m.trail);
        } else {
            return m.fail();
        }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_tl_1 , m.trail, a6)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation t_def_3_7(Prolog m) { 
    // t_def(append,[A,B],cond(A=[],B,[hd(A)|append(tl(A),B)])):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // t_def(append,[A,B],cond(A=[],B,[hd(A)|append(tl(A),B)])):-[]
        if (!  ATOM_append .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        a4 = a2.car();
            a5 = a2.cdr();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
            a5 = m.mkvar2();
             a2.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        a5 = a5.dref();
        if (a5 .isCons()){
                        a6 = a5.car();
            if (!  Prolog.Nil .unify(a5.cdr(), m.trail))
                return m.fail();
        } else if (a5.isVar()){
            a6 = m.mkvar2();
             a5.bind(CONS(a6,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_cond_3 , m.trail, a7, a6, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_$003D_2 , m.trail, a4,  Prolog.Nil )){
                return m.fail();
            }
        a8 = a8.dref();
        if (a8 .isCons()){
                        a9 = a8.car();
            a10 = a8.cdr();
        } else if (a8.isVar()){
            a9 = m.mkvar2();
            a10 = m.mkvar2();
             a8.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_hd_1 , m.trail, a4)){
                return m.fail();
            }
        a10 = a10.dref();
            a11 = m.mkvar2();
            if (!a10.unifyS( FUNCTOR_append_2 , m.trail, a11, a6)){
                return m.fail();
            }
        a11 = a11.dref();
            if (!a11.unifyS( FUNCTOR_tl_1 , m.trail, a4)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: t_reduce/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(t_reduce/2,public)




    public static Operation PRED_t_reduce_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::t_reduce_2_var, FILE_reducer::t_reduce_2_int, FILE_reducer::t_reduce_2_int, FILE_reducer::t_reduce_2_int, FILE_reducer::t_reduce_2_int, FILE_reducer::t_reduce_2_var); 
    }

    private final static Operation t_reduce_2_var(Prolog m) { 
        m.jtry2(null, FILE_reducer::t_reduce_2_var_1);
        return t_reduce_2_1(m);
    }

    private final static Operation t_reduce_2_var_1(Prolog m) { 
        m.retry(null, FILE_reducer::t_reduce_2_var_2);
        return t_reduce_2_2(m);
    }

    private final static Operation t_reduce_2_var_2(Prolog m) { 
        m.trust(null);
        return t_reduce_2_3(m);
    }

    private final static Operation t_reduce_2_int(Prolog m) { 
        m.jtry2(null, FILE_reducer::t_reduce_2_int_1);
        return t_reduce_2_1(m);
    }

    private final static Operation t_reduce_2_int_1(Prolog m) { 
        m.trust(null);
        return t_reduce_2_3(m);
    }

    private final static Operation t_reduce_2_1(Prolog m) { 
    // t_reduce(A,B):-atomic(A),!,B=A
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_reduce(A,B):-['$get_level'(C),atomic(A),'$cut'(C),'$unify'(B,A)]
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
        //START inline expansion of $unify(a(2),a(1))
        if (! a2.unify(a1, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation t_reduce_2_2(Prolog m) { 
    // t_reduce([A,B|C],[D,E|C]):-list_functor_name(C),t_reduce(B,E),!,t_reduce(A,D),!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_reduce([A,B|C],[D,E|C]):-['$get_level'(F),list_functor_name(C),t_reduce(B,E),'$cut'(F),t_reduce(A,D),'$cut'(F)]
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
        a8 = a8.dref();
        if (a8 .isCons()){
                        a9 = a8.car();
            if (! a6.unify(a8.cdr(), m.trail))
                return m.fail();
        } else if (a8.isVar()){
            a9 = m.mkvar2();
             a8.bind(CONS(a9, a6), m.trail);
        } else {
            return m.fail();
        }
        a10 = m.mkvar1();
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("list_functor_name", FILE_reducer::PRED_list_functor_name_1_static_exec, VA(a6), //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a5, a9), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a10), //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a3, a7), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a10), cont)))));
    }

    private final static Operation t_reduce_2_3(Prolog m) { 
    // t_reduce(A,B):-t_append(C,D,E,A),t_redex(E,D),!,t_reduce(C,B),!
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_reduce(A,B):-['$get_level'(C),t_append(D,E,F,A),t_redex(F,E),'$cut'(C),t_reduce(D,B),'$cut'(C)]
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
 Op("t_append", FILE_reducer::PRED_t_append_4_static_exec, VA(a4, a5, a6, a1), //
 Op("t_redex", FILE_reducer::PRED_t_redex_2_static_exec, VA(a6, a5), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a3), //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a4, a2), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a3), cont)))));
    }
/** PREDICATE: t_append/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(t_append/4,public)




    public static Operation PRED_t_append_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return t_append_4_top(m);
    }

    private final static Operation t_append_4_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_reducer::t_append_4_var, FILE_reducer::t_append_4_1, FILE_reducer::t_append_4_1, FILE_reducer::t_append_4_1, FILE_reducer::t_append_4_1, FILE_reducer::t_append_4_var); 
    }

    private final static Operation t_append_4_var(Prolog m) { 
        m.jtry4(null, FILE_reducer::t_append_4_var_1);
        return t_append_4_1(m);
    }

    private final static Operation t_append_4_var_1(Prolog m) { 
        m.trust(null);
        return t_append_4_2(m);
    }

    private final static Operation t_append_4_1(Prolog m) { 
    // t_append(A,A,B,B):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // t_append(A,A,B,B):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation t_append_4_2(Prolog m) { 
    // t_append([A|B],C,D,[A|E]):-t_append(B,C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // t_append([A|B],C,D,[A|E]):-[t_append(B,C,D,E)]
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
        return t_append_4_top(m);
    }
/** PREDICATE: t_redex/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(t_redex/2,public)
        final static Functor ATOM_sp = SYM("sp");
        final static Functor ATOM_bp = SYM("bp");
        final static Functor ATOM_cp = SYM("cp");
        final static Functor ATOM_s = SYM("s");
        final static Functor ATOM_b = SYM("b");
        final static Functor ATOM_c = SYM("c");
        final static Functor ATOM_k = SYM("k");
        final static Functor ATOM_i = SYM("i");
        final static Functor ATOM_cond = SYM("cond");
        final static Functor ATOM_apply = SYM("apply");
        final static Functor ATOM_hd = SYM("hd");
        final static Functor ATOM_tl = SYM("tl");
        final static Functor ATOM_$002B = SYM("+");
        final static Functor ATOM_$002D = SYM("-");
        final static Functor ATOM_$002A = SYM("*");
        final static Functor ATOM_$002F$002F = SYM("//");
        final static Functor ATOM_mod = SYM("mod");
    private static final Compound L_t_redex_2_s20 = CONS( ATOM_mod ,  Prolog.Nil );
    private static final Compound L_t_redex_2_s21 = CONS( ATOM_$002F$002F , L_t_redex_2_s20);
    private static final Compound L_t_redex_2_s22 = CONS( ATOM_$002A , L_t_redex_2_s21);
    private static final Compound L_t_redex_2_s23 = CONS( ATOM_$002D , L_t_redex_2_s22);
    private static final Compound L_t_redex_2_s24 = CONS( ATOM_$002B , L_t_redex_2_s23);
        final static Functor ATOM_$003C = SYM("<");
        final static Functor ATOM_$003E = SYM(">");
        final static Functor ATOM_$003D$003C = SYM("=<");
        final static Functor ATOM_$003E$003D = SYM(">=");
        final static Functor ATOM_$003D$005C$003D = SYM("=\\=");
        final static Functor ATOM_$003D$003A$003D = SYM("=:=");
    private static final Compound L_t_redex_2_s31 = CONS( ATOM_$003D$003A$003D ,  Prolog.Nil );
    private static final Compound L_t_redex_2_s32 = CONS( ATOM_$003D$005C$003D , L_t_redex_2_s31);
    private static final Compound L_t_redex_2_s33 = CONS( ATOM_$003E$003D , L_t_redex_2_s32);
    private static final Compound L_t_redex_2_s34 = CONS( ATOM_$003D$003C , L_t_redex_2_s33);
    private static final Compound L_t_redex_2_s35 = CONS( ATOM_$003E , L_t_redex_2_s34);
    private static final Compound L_t_redex_2_s36 = CONS( ATOM_$003C , L_t_redex_2_s35);
        final static Functor ATOM_$003D = SYM("=");
    private static final Compound L_t_redex_2_s38 = CONS( ATOM_$002D ,  Prolog.Nil );




    public static Operation PRED_t_redex_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::t_redex_2_var, FILE_reducer::t_redex_2_18, FILE_reducer::t_redex_2_18, FILE_reducer::t_redex_2_18, FILE_reducer::t_redex_2_18, FILE_reducer::t_redex_2_var); 
    }

    private final static Operation t_redex_2_var(Prolog m) { 
        m.jtry2(null, FILE_reducer::t_redex_2_var_1);
        return t_redex_2_1(m);
    }

    private final static Operation t_redex_2_var_1(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_2);
        return t_redex_2_2(m);
    }

    private final static Operation t_redex_2_var_2(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_3);
        return t_redex_2_3(m);
    }

    private final static Operation t_redex_2_var_3(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_4);
        return t_redex_2_4(m);
    }

    private final static Operation t_redex_2_var_4(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_5);
        return t_redex_2_5(m);
    }

    private final static Operation t_redex_2_var_5(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_6);
        return t_redex_2_6(m);
    }

    private final static Operation t_redex_2_var_6(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_7);
        return t_redex_2_7(m);
    }

    private final static Operation t_redex_2_var_7(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_8);
        return t_redex_2_8(m);
    }

    private final static Operation t_redex_2_var_8(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_9);
        return t_redex_2_9(m);
    }

    private final static Operation t_redex_2_var_9(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_10);
        return t_redex_2_10(m);
    }

    private final static Operation t_redex_2_var_10(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_11);
        return t_redex_2_11(m);
    }

    private final static Operation t_redex_2_var_11(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_12);
        return t_redex_2_12(m);
    }

    private final static Operation t_redex_2_var_12(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_13);
        return t_redex_2_13(m);
    }

    private final static Operation t_redex_2_var_13(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_14);
        return t_redex_2_14(m);
    }

    private final static Operation t_redex_2_var_14(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_15);
        return t_redex_2_15(m);
    }

    private final static Operation t_redex_2_var_15(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_16);
        return t_redex_2_16(m);
    }

    private final static Operation t_redex_2_var_16(Prolog m) { 
        m.retry(null, FILE_reducer::t_redex_2_var_17);
        return t_redex_2_17(m);
    }

    private final static Operation t_redex_2_var_17(Prolog m) { 
        m.trust(null);
        return t_redex_2_18(m);
    }

    private final static Operation t_redex_2_1(Prolog m) { 
    // t_redex([A,B,C,D|sp],[[E|B],[E|C]|D]):-t_reduce(A,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A,B,C,D|sp],[[E|B],[E|C]|D]):-[t_reduce(A,E)]
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
            a8 = a6.cdr();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a6.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a8 = a8.dref();
        if (a8 .isCons()){
                        a9 = a8.car();
            if (!  ATOM_sp .unify(a8.cdr(), m.trail))
                return m.fail();
        } else if (a8.isVar()){
            a9 = m.mkvar2();
             a8.bind(CONS(a9,  ATOM_sp ), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a10 = a2.car();
            a11 = a2.cdr();
        } else if (a2.isVar()){
            a10 = m.mkvar2();
            a11 = m.mkvar2();
             a2.bind(CONS(a10, a11), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
        if (a10 .isCons()){
                        a12 = a10.car();
            if (! a5.unify(a10.cdr(), m.trail))
                return m.fail();
        } else if (a10.isVar()){
            a12 = m.mkvar2();
             a10.bind(CONS(a12, a5), m.trail);
        } else {
            return m.fail();
        }
        a11 = a11.dref();
        if (a11 .isCons()){
                        a13 = a11.car();
            if (! a9.unify(a11.cdr(), m.trail))
                return m.fail();
        } else if (a11.isVar()){
            a13 = m.mkvar2();
             a11.bind(CONS(a13, a9), m.trail);
        } else {
            return m.fail();
        }
        a13 = a13.dref();
        if (a13 .isCons()){
                        if (! a12.unify(a13.car(), m.trail))
                return m.fail();
            if (! a7.unify(a13.cdr(), m.trail))
                return m.fail();
        } else if (a13.isVar()){
             a13.bind(CONS(a12, a7), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a3, a12), cont);
    }

    private final static Operation t_redex_2_2(Prolog m) { 
    // t_redex([A,B,C,D|bp],[[A|B],C|D]):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A,B,C,D|bp],[[A|B],C|D]):-[]
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
            a8 = a6.cdr();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a6.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a8 = a8.dref();
        if (a8 .isCons()){
                        a9 = a8.car();
            if (!  ATOM_bp .unify(a8.cdr(), m.trail))
                return m.fail();
        } else if (a8.isVar()){
            a9 = m.mkvar2();
             a8.bind(CONS(a9,  ATOM_bp ), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a10 = a2.car();
            a11 = a2.cdr();
        } else if (a2.isVar()){
            a10 = m.mkvar2();
            a11 = m.mkvar2();
             a2.bind(CONS(a10, a11), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
        if (a10 .isCons()){
                        if (! a3.unify(a10.car(), m.trail))
                return m.fail();
            if (! a5.unify(a10.cdr(), m.trail))
                return m.fail();
        } else if (a10.isVar()){
             a10.bind(CONS(a3, a5), m.trail);
        } else {
            return m.fail();
        }
        a11 = a11.dref();
        if (a11 .isCons()){
                        if (! a7.unify(a11.car(), m.trail))
                return m.fail();
            if (! a9.unify(a11.cdr(), m.trail))
                return m.fail();
        } else if (a11.isVar()){
             a11.bind(CONS(a7, a9), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation t_redex_2_3(Prolog m) { 
    // t_redex([A,B,C,D|cp],[B,[A|C]|D]):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A,B,C,D|cp],[B,[A|C]|D]):-[]
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
            a8 = a6.cdr();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a6.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a8 = a8.dref();
        if (a8 .isCons()){
                        a9 = a8.car();
            if (!  ATOM_cp .unify(a8.cdr(), m.trail))
                return m.fail();
        } else if (a8.isVar()){
            a9 = m.mkvar2();
             a8.bind(CONS(a9,  ATOM_cp ), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a5.unify(a2.car(), m.trail))
                return m.fail();
            a10 = a2.cdr();
        } else if (a2.isVar()){
            a10 = m.mkvar2();
             a2.bind(CONS(a5, a10), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
        if (a10 .isCons()){
                        a11 = a10.car();
            if (! a9.unify(a10.cdr(), m.trail))
                return m.fail();
        } else if (a10.isVar()){
            a11 = m.mkvar2();
             a10.bind(CONS(a11, a9), m.trail);
        } else {
            return m.fail();
        }
        a11 = a11.dref();
        if (a11 .isCons()){
                        if (! a3.unify(a11.car(), m.trail))
                return m.fail();
            if (! a7.unify(a11.cdr(), m.trail))
                return m.fail();
        } else if (a11.isVar()){
             a11.bind(CONS(a3, a7), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation t_redex_2_4(Prolog m) { 
    // t_redex([A,B,C|s],[[D|B],D|C]):-t_reduce(A,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A,B,C|s],[[D|B],D|C]):-[t_reduce(A,D)]
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
            if (!  ATOM_s .unify(a6.cdr(), m.trail))
                return m.fail();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
             a6.bind(CONS(a7,  ATOM_s ), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a8 = a2.car();
            a9 = a2.cdr();
        } else if (a2.isVar()){
            a8 = m.mkvar2();
            a9 = m.mkvar2();
             a2.bind(CONS(a8, a9), m.trail);
        } else {
            return m.fail();
        }
        a8 = a8.dref();
        if (a8 .isCons()){
                        a10 = a8.car();
            if (! a5.unify(a8.cdr(), m.trail))
                return m.fail();
        } else if (a8.isVar()){
            a10 = m.mkvar2();
             a8.bind(CONS(a10, a5), m.trail);
        } else {
            return m.fail();
        }
        a9 = a9.dref();
        if (a9 .isCons()){
                        if (! a10.unify(a9.car(), m.trail))
                return m.fail();
            if (! a7.unify(a9.cdr(), m.trail))
                return m.fail();
        } else if (a9.isVar()){
             a9.bind(CONS(a10, a7), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a3, a10), cont);
    }

    private final static Operation t_redex_2_5(Prolog m) { 
    // t_redex([A,B,C|b],[[A|B]|C]):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A,B,C|b],[[A|B]|C]):-[]
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
            if (!  ATOM_b .unify(a6.cdr(), m.trail))
                return m.fail();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
             a6.bind(CONS(a7,  ATOM_b ), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a8 = a2.car();
            if (! a7.unify(a2.cdr(), m.trail))
                return m.fail();
        } else if (a2.isVar()){
            a8 = m.mkvar2();
             a2.bind(CONS(a8, a7), m.trail);
        } else {
            return m.fail();
        }
        a8 = a8.dref();
        if (a8 .isCons()){
                        if (! a3.unify(a8.car(), m.trail))
                return m.fail();
            if (! a5.unify(a8.cdr(), m.trail))
                return m.fail();
        } else if (a8.isVar()){
             a8.bind(CONS(a3, a5), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation t_redex_2_6(Prolog m) { 
    // t_redex([A,B,C|c],[B,A|C]):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A,B,C|c],[B,A|C]):-[]
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
            if (!  ATOM_c .unify(a6.cdr(), m.trail))
                return m.fail();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
             a6.bind(CONS(a7,  ATOM_c ), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a5.unify(a2.car(), m.trail))
                return m.fail();
            a8 = a2.cdr();
        } else if (a2.isVar()){
            a8 = m.mkvar2();
             a2.bind(CONS(a5, a8), m.trail);
        } else {
            return m.fail();
        }
        a8 = a8.dref();
        if (a8 .isCons()){
                        if (! a3.unify(a8.car(), m.trail))
                return m.fail();
            if (! a7.unify(a8.cdr(), m.trail))
                return m.fail();
        } else if (a8.isVar()){
             a8.bind(CONS(a3, a7), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation t_redex_2_7(Prolog m) { 
    // t_redex([A,B|k],B):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A,B|k],B):-[]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.cdr();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(m.DONTCARE("cons(a(1))"), a3), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        a4 = a3.car();
            if (!  ATOM_k .unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
            a4 = m.mkvar2();
             a3.bind(CONS(a4,  ATOM_k ), m.trail);
        } else {
            return m.fail();
        }
        if (! a4.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation t_redex_2_8(Prolog m) { 
    // t_redex([A|i],A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A|i],A):-[]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
            if (!  ATOM_i .unify(a1.cdr(), m.trail))
                return m.fail();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(a3,  ATOM_i ), m.trail);
        } else {
            return m.fail();
        }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation t_redex_2_9(Prolog m) { 
    // t_redex([A,B,C|cond],B):-t_reduce(C,D),D=true,!
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A,B,C|cond],B):-['$get_level'(D),t_reduce(C,E),'$unify'(E,true),'$cut'(D)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.cdr();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(m.DONTCARE("cons(a(1))"), a3), m.trail);
        } else {
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
        a5 = a5.dref();
        if (a5 .isCons()){
                        a6 = a5.car();
            if (!  ATOM_cond .unify(a5.cdr(), m.trail))
                return m.fail();
        } else if (a5.isVar()){
            a6 = m.mkvar2();
             a5.bind(CONS(a6,  ATOM_cond ), m.trail);
        } else {
            return m.fail();
        }
        if (! a4.unify(a2, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        return //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a6, a8), //
 Op("$unify", FILE_reducer::PRED_$unify_2_static_exec, VA(a8,  Prolog.True ), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a7), cont)));
    }

    private final static Operation t_redex_2_10(Prolog m) { 
    // t_redex([A,B,C|cond],A):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A,B,C|cond],A):-[]
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
        a4 = a4.dref();
        if (a4 .isCons()){
                        a5 = a4.cdr();
        } else if (a4.isVar()){
            a5 = m.mkvar2();
             a4.bind(CONS(m.DONTCARE("cons(a(4))"), a5), m.trail);
        } else {
            return m.fail();
        }
        a5 = a5.dref();
        if (a5 .isCons()){
                        if (!  ATOM_cond .unify(a5.cdr(), m.trail))
                return m.fail();
        } else if (a5.isVar()){
             a5.bind(CONS(m.DONTCARE("cons(a(5))"),  ATOM_cond ), m.trail);
        } else {
            return m.fail();
        }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation t_redex_2_11(Prolog m) { 
    // t_redex([A|apply],B):-t_reduce(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A|apply],B):-[t_reduce(A,B)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
            if (!  ATOM_apply .unify(a1.cdr(), m.trail))
                return m.fail();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(a3,  ATOM_apply ), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a3, a2), cont);
    }

    private final static Operation t_redex_2_12(Prolog m) { 
    // t_redex([A|hd],B):-list_functor_name(C),t_reduce(A,[D,B|C])
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A|hd],B):-[list_functor_name(C),t_reduce(A,[D,B|C])]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
            if (!  ATOM_hd .unify(a1.cdr(), m.trail))
                return m.fail();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(a3,  ATOM_hd ), m.trail);
        } else {
            return m.fail();
        }
        a4 = m.mkvar1();
        a5 = CONS(a2, a4);
        a6 = CONS(m.DONT_CARE1(), a5);
        return //
 Op("list_functor_name", FILE_reducer::PRED_list_functor_name_1_static_exec, VA(a4), //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a3, a6), cont));
    }

    private final static Operation t_redex_2_13(Prolog m) { 
    // t_redex([A|tl],B):-list_functor_name(C),t_reduce(A,[B,D|C])
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A|tl],B):-[list_functor_name(C),t_reduce(A,[B,D|C])]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
            if (!  ATOM_tl .unify(a1.cdr(), m.trail))
                return m.fail();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(a3,  ATOM_tl ), m.trail);
        } else {
            return m.fail();
        }
        a4 = m.mkvar1();
        a5 = CONS(m.DONT_CARE1(), a4);
        a6 = CONS(a2, a5);
        return //
 Op("list_functor_name", FILE_reducer::PRED_list_functor_name_1_static_exec, VA(a4), //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a3, a6), cont));
    }

    private final static Operation t_redex_2_14(Prolog m) { 
    // t_redex([A,B|C],D):-end(C),member(C,[+,-,*,//,mod]),t_reduce(B,E),t_reduce(A,F),number(E),number(F),eval(C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A,B|C],D):-[end(C),member(C,[+,-,*,//,mod]),t_reduce(B,E),t_reduce(A,F),number(E),number(F),eval(C,D,E,F)]
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
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        return //
 Op("end", FILE_reducer::PRED_end_1_static_exec, VA(a6), //
 Op("member", FILE_reducer::PRED_member_2_static_exec, VA(a6, L_t_redex_2_s24), //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a5, a7), //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a3, a8), //
 Op("number", FILE_reducer::PRED_number_1_static_exec, VA(a7), //
 Op("number", FILE_reducer::PRED_number_1_static_exec, VA(a8), //
 Op("eval", FILE_reducer::PRED_eval_4_static_exec, VA(a6, a2, a7, a8), cont)))))));
    }

    private final static Operation t_redex_2_15(Prolog m) { 
    // t_redex([A,B|C],D):-end(C),member(C,[<,>,=<,>=,=\=,=:=]),t_reduce(B,E),t_reduce(A,F),number(E),number(F),'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(C,D,E,F),!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A,B|C],D):-['$get_level'(E),end(C),member(C,[<,>,=<,>=,=\=,=:=]),t_reduce(B,F),t_reduce(A,G),number(F),number(G),'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(C,D,F,G),'$cut'(E)]
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
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op("end", FILE_reducer::PRED_end_1_static_exec, VA(a6), //
 Op("member", FILE_reducer::PRED_member_2_static_exec, VA(a6, L_t_redex_2_s36), //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a5, a8), //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a3, a9), //
 Op("number", FILE_reducer::PRED_number_1_static_exec, VA(a8), //
 Op("number", FILE_reducer::PRED_number_1_static_exec, VA(a9), //
 Op("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl", FILE_reducer::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_4_static_exec, VA(a6, a2, a8, a9), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a7), cont))))))));
    }

    private final static Operation t_redex_2_16(Prolog m) { 
    // t_redex([A,B|=],C):-t_reduce(B,D),t_reduce(A,E),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(C,D,E),!
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A,B|=],C):-['$get_level'(D),t_reduce(B,E),t_reduce(A,F),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(C,E,F),'$cut'(D)]
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
        a4 = a4.dref();
        if (a4 .isCons()){
                        a5 = a4.car();
            if (!  ATOM_$003D .unify(a4.cdr(), m.trail))
                return m.fail();
        } else if (a4.isVar()){
            a5 = m.mkvar2();
             a4.bind(CONS(a5,  ATOM_$003D ), m.trail);
        } else {
            return m.fail();
        }
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        return //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a5, a7), //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a3, a8), //
 Op("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl", FILE_reducer::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_3_static_exec, VA(a2, a7, a8), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a6), cont))));
    }

    private final static Operation t_redex_2_17(Prolog m) { 
    // t_redex([A|B],C):-end(B),member(B,[-]),t_reduce(A,D),number(D),eval1(B,E,D)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex([A|B],C):-[end(B),member(B,[-]),t_reduce(A,D),number(D),eval1(B,E,D)]
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
        a5 = m.mkvar1();
        return //
 Op("end", FILE_reducer::PRED_end_1_static_exec, VA(a4), //
 Op("member", FILE_reducer::PRED_member_2_static_exec, VA(a4, L_t_redex_2_s38), //
 Op("t_reduce", FILE_reducer::PRED_t_reduce_2_static_exec, VA(a3, a5), //
 Op("number", FILE_reducer::PRED_number_1_static_exec, VA(a5), //
 Op("eval1", FILE_reducer::PRED_eval1_3_static_exec, VA(a4, m.DONT_CARE2(), a5), cont)))));
    }

    private final static Operation t_redex_2_18(Prolog m) { 
    // t_redex(A,B):-append(C,D,A),end(D),t_def(D,E,F),t(E,F,G),append(C,G,B)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_redex(A,B):-[append(C,D,A),end(D),t_def(D,E,F),t(E,F,G),append(C,G,B)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op("append", FILE_reducer::PRED_append_3_static_exec, VA(a3, a4, a1), //
 Op("end", FILE_reducer::PRED_end_1_static_exec, VA(a4), //
 Op("t_def", FILE_reducer::PRED_t_def_3_static_exec, VA(a4, a5, a6), //
 Op("t", FILE_reducer::PRED_t_3_static_exec, VA(a5, a6, a7), //
 Op("append", FILE_reducer::PRED_append_3_static_exec, VA(a3, a7, a2), cont)))));
    }
/** PREDICATE: $dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'/4,public)
        final static Functor ATOM_false = SYM("false");




    public static Operation PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_reducer::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_4_sub_1);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_4_1(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_4_2(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_4_1(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B,C,D):-relop(A,C,D),!,B=true
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B,C,D):-['$get_level'(E),relop(A,C,D),'$cut'(E),'$unify'(B,true)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("relop", FILE_reducer::PRED_relop_3_static_exec, VA(a1, a3, a4), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a5), //
 Op("$unify", FILE_reducer::PRED_$unify_2_static_exec, VA(a2,  Prolog.True ), cont)));
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_4_2(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B,C,D):-B=false
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B,C,D):-['$unify'(B,false)]
        //START inline expansion of $unify(a(2),@(ATOM_false))
        if (! a2.unify(ATOM_false, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main('$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'/3,public)




    public static Operation PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_reducer::$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_3_sub_1);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_3_1(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_3_2(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_3_1(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B,C):-B=C,!,A=true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B,C):-['$get_level'(D),'$unify'(B,C),'$cut'(D),'$unify'(A,true)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(2),a(3))
        if (! a2.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(1),@(Prolog.True))
        if (! a1.unify(Prolog.True, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_3_2(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B,C):-A=false
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B,C):-['$unify'(A,false)]
        //START inline expansion of $unify(a(1),@(ATOM_false))
        if (! a1.unify(ATOM_false, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: eval/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(eval/4,public)
        final static Functor FUNCTOR_$002B_2 = F("+",2);
        final static Functor FUNCTOR_$002F$002F_2 = F("//",2);
        final static Functor FUNCTOR_mod_2 = F("mod",2);




    public static Operation PRED_eval_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::eval_4_var, fail_0, fail_0, FILE_reducer::eval_4_var, fail_0, fail_0); 
    }

    private final static Operation eval_4_var(Prolog m) { 
        m.jtry4(null, FILE_reducer::eval_4_var_1);
        return eval_4_1(m);
    }

    private final static Operation eval_4_var_1(Prolog m) { 
        m.retry(null, FILE_reducer::eval_4_var_2);
        return eval_4_2(m);
    }

    private final static Operation eval_4_var_2(Prolog m) { 
        m.retry(null, FILE_reducer::eval_4_var_3);
        return eval_4_3(m);
    }

    private final static Operation eval_4_var_3(Prolog m) { 
        m.retry(null, FILE_reducer::eval_4_var_4);
        return eval_4_4(m);
    }

    private final static Operation eval_4_var_4(Prolog m) { 
        m.trust(null);
        return eval_4_5(m);
    }

    private final static Operation eval_4_1(Prolog m) { 
    // eval(+,A,B,C):-A is B+C
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // eval(+,A,B,C):-[A is B+C]
        if (!  ATOM_$002B .unify(a1, m.trail))
            return m.fail();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002B_2 , a3, a4);
 ;
        //START inline expansion of a(2)is a(5)
        if (! a2.unify(Arithmetic.evaluate(a5), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation eval_4_2(Prolog m) { 
    // eval(-,A,B,C):-A is B-C
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // eval(-,A,B,C):-[A is B-C]
        if (!  ATOM_$002D .unify(a1, m.trail))
            return m.fail();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002D_2 , a3, a4);
 ;
        //START inline expansion of a(2)is a(5)
        if (! a2.unify(Arithmetic.evaluate(a5), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation eval_4_3(Prolog m) { 
    // eval(*,A,B,C):-A is B*C
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // eval(*,A,B,C):-[A is B*C]
        if (!  ATOM_$002A .unify(a1, m.trail))
            return m.fail();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_$002A_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002A_2 , a3, a4);
 ;
        //START inline expansion of a(2)is a(5)
        if (! a2.unify(Arithmetic.evaluate(a5), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation eval_4_4(Prolog m) { 
    // eval(//,A,B,C):-A is B//C
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // eval(//,A,B,C):-[A is B//C]
        if (!  ATOM_$002F$002F .unify(a1, m.trail))
            return m.fail();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_$002F$002F_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002F$002F_2 , a3, a4);
 ;
        //START inline expansion of a(2)is a(5)
        if (! a2.unify(Arithmetic.evaluate(a5), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation eval_4_5(Prolog m) { 
    // eval(mod,A,B,C):-A is B mod C
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // eval(mod,A,B,C):-[A is B mod C]
        if (!  ATOM_mod .unify(a1, m.trail))
            return m.fail();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_mod_2'),y(1),a(5))
        a5 =  S( FUNCTOR_mod_2 , a3, a4);
 ;
        //START inline expansion of a(2)is a(5)
        if (! a2.unify(Arithmetic.evaluate(a5), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: eval1/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(eval1/3,public)
        final static Functor FUNCTOR_$002D_1 = F("-",1);




    public static Operation PRED_eval1_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // eval1(-,A,B):-A is -B
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // eval1(-,A,B):-[A is -B]
        if (!  ATOM_$002D .unify(a1, m.trail))
            return m.fail();
    // put_str_args([a(3)],y(1)),put_str(@('FUNCTOR_$002D_1'),y(1),a(4))
        a4 =  S( FUNCTOR_$002D_1 , a3);
 ;
        //START inline expansion of a(2)is a(4)
        if (! a2.unify(Arithmetic.evaluate(a4), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: relop/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(relop/3,public)




    public static Operation PRED_relop_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::relop_3_var, fail_0, fail_0, FILE_reducer::relop_3_var, fail_0, fail_0); 
    }

    private final static Operation relop_3_var(Prolog m) { 
        m.jtry3(null, FILE_reducer::relop_3_var_1);
        return relop_3_1(m);
    }

    private final static Operation relop_3_var_1(Prolog m) { 
        m.retry(null, FILE_reducer::relop_3_var_2);
        return relop_3_2(m);
    }

    private final static Operation relop_3_var_2(Prolog m) { 
        m.retry(null, FILE_reducer::relop_3_var_3);
        return relop_3_3(m);
    }

    private final static Operation relop_3_var_3(Prolog m) { 
        m.retry(null, FILE_reducer::relop_3_var_4);
        return relop_3_4(m);
    }

    private final static Operation relop_3_var_4(Prolog m) { 
        m.retry(null, FILE_reducer::relop_3_var_5);
        return relop_3_5(m);
    }

    private final static Operation relop_3_var_5(Prolog m) { 
        m.trust(null);
        return relop_3_6(m);
    }

    private final static Operation relop_3_1(Prolog m) { 
    // relop(<,A,B):-A<B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // relop(<,A,B):-['$less_than'(A,B)]
        if (!  ATOM_$003C .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $less_than(a(2),a(3))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation relop_3_2(Prolog m) { 
    // relop(>,A,B):-A>B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // relop(>,A,B):-['$greater_than'(A,B)]
        if (!  ATOM_$003E .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $greater_than(a(2),a(3))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation relop_3_3(Prolog m) { 
    // relop(=<,A,B):-A=<B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // relop(=<,A,B):-['$less_or_equal'(A,B)]
        if (!  ATOM_$003D$003C .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $less_or_equal(a(2),a(3))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) > 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation relop_3_4(Prolog m) { 
    // relop(>=,A,B):-A>=B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // relop(>=,A,B):-['$greater_or_equal'(A,B)]
        if (!  ATOM_$003E$003D .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $greater_or_equal(a(2),a(3))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) < 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation relop_3_5(Prolog m) { 
    // relop(=\=,A,B):-A=\=B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // relop(=\=,A,B):-['$arith_not_equal'(A,B)]
        if (!  ATOM_$003D$005C$003D .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $arith_not_equal(a(2),a(3))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) == 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation relop_3_6(Prolog m) { 
    // relop(=:=,A,B):-A=:=B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // relop(=:=,A,B):-['$arith_equal'(A,B)]
        if (!  ATOM_$003D$003A$003D .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $arith_equal(a(2),a(3))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) != 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: t/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(t/3,public)




    public static Operation PRED_t_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // t(A,B,C):-listify(B,D),curry(D,E),t_argvars(A,E,C),!
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // t(A,B,C):-['$get_level'(D),listify(B,E),curry(E,F),t_argvars(A,F,C),'$cut'(D)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        return //
 Op("listify", FILE_reducer::PRED_listify_2_static_exec, VA(a2, a5), //
 Op("curry", FILE_reducer::PRED_curry_2_static_exec, VA(a5, a6), //
 Op("t_argvars", FILE_reducer::PRED_t_argvars_3_static_exec, VA(a1, a6, a3), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a4), cont))));
    }
/** PREDICATE: t_argvars/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(t_argvars/3,public)




    public static Operation PRED_t_argvars_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return t_argvars_3_top(m);
    }

    private final static Operation t_argvars_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_reducer::t_argvars_3_var, fail_0, fail_0, FILE_reducer::t_argvars_3_1, fail_0, FILE_reducer::t_argvars_3_2); 
    }

    private final static Operation t_argvars_3_var(Prolog m) { 
        m.jtry3(null, FILE_reducer::t_argvars_3_var_1);
        return t_argvars_3_1(m);
    }

    private final static Operation t_argvars_3_var_1(Prolog m) { 
        m.trust(null);
        return t_argvars_3_2(m);
    }

    private final static Operation t_argvars_3_1(Prolog m) { 
    // t_argvars([],A,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // t_argvars([],A,A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation t_argvars_3_2(Prolog m) { 
    // t_argvars([A|B],C,D):-t_argvars(B,C,E),t_vars(E,F),t_trans(A,E,F,D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // t_argvars([A|B],C,D):-[t_argvars(B,C,E),t_vars(E,F),t_trans(A,E,F,D)]
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
        p2 = //
 Op("t_vars", FILE_reducer::PRED_t_vars_2_static_exec, VA(a6, a7), //
 Op("t_trans", FILE_reducer::PRED_t_trans_4_static_exec, VA(a4, a6, a7, a3), cont));
        m.AREGS[0] = a5;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
        m.cont = p2;
        return t_argvars_3_top(m);
    }
/** PREDICATE: $dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main('$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'/1,public)




    public static Operation PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_reducer::$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_sub_1);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_1(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_2(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_1(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A):-var(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A):-[var(A)]
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_2(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A):-atomic(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A):-[atomic(A)]
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: curry/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(curry/2,public)




    public static Operation PRED_curry_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::curry_2_var, FILE_reducer::curry_2_1, FILE_reducer::curry_2_1, FILE_reducer::curry_2_1, FILE_reducer::curry_2_1, FILE_reducer::curry_2_var); 
    }

    private final static Operation curry_2_var(Prolog m) { 
        m.jtry2(null, FILE_reducer::curry_2_var_1);
        return curry_2_1(m);
    }

    private final static Operation curry_2_var_1(Prolog m) { 
        m.trust(null);
        return curry_2_2(m);
    }

    private final static Operation curry_2_1(Prolog m) { 
    // curry(A,A):-'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A),!
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // curry(A,A):-['$get_level'(B),'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A),'$cut'(B)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl", FILE_reducer::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_static_exec, VA(a1), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation curry_2_2(Prolog m) { 
    // curry([A|B],C):-currylist(B,C,A)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // curry([A|B],C):-[currylist(B,C,A)]
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
        return //
 Op("currylist", FILE_reducer::PRED_currylist_3_static_exec, VA(a4, a2, a3), cont);
    }
/** PREDICATE: currylist/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(currylist/3,public)




    public static Operation PRED_currylist_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::currylist_3_var, fail_0, fail_0, FILE_reducer::currylist_3_1, fail_0, FILE_reducer::currylist_3_2); 
    }

    private final static Operation currylist_3_var(Prolog m) { 
        m.jtry3(null, FILE_reducer::currylist_3_var_1);
        return currylist_3_1(m);
    }

    private final static Operation currylist_3_var_1(Prolog m) { 
        m.trust(null);
        return currylist_3_2(m);
    }

    private final static Operation currylist_3_1(Prolog m) { 
    // currylist([],A,A):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // currylist([],A,A):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation currylist_3_2(Prolog m) { 
    // currylist([A|B],C,D):-curry(A,E),currylist(B,C,[E|D])
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // currylist([A|B],C,D):-[curry(A,E),currylist(B,C,[E|D])]
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
        a7 = CONS(a6, a3);
        return //
 Op("curry", FILE_reducer::PRED_curry_2_static_exec, VA(a4, a6), //
 Op("currylist", FILE_reducer::PRED_currylist_3_static_exec, VA(a5, a2, a7), cont));
    }
/** PREDICATE: t_vars/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(t_vars/2,public)
    private static final Compound L_t_vars_2_s2 = CONS( Prolog.Nil ,  Prolog.Nil );




    public static Operation PRED_t_vars_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return t_vars_2_top(m);
    }

    private final static Operation t_vars_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_reducer::t_vars_2_var, FILE_reducer::t_vars_2_int, FILE_reducer::t_vars_2_int, FILE_reducer::t_vars_2_int, FILE_reducer::t_vars_2_int, FILE_reducer::t_vars_2_var); 
    }

    private final static Operation t_vars_2_var(Prolog m) { 
        m.jtry2(null, FILE_reducer::t_vars_2_var_1);
        return t_vars_2_1(m);
    }

    private final static Operation t_vars_2_var_1(Prolog m) { 
        m.retry(null, FILE_reducer::t_vars_2_var_2);
        return t_vars_2_2(m);
    }

    private final static Operation t_vars_2_var_2(Prolog m) { 
        m.retry(null, FILE_reducer::t_vars_2_var_3);
        return t_vars_2_3(m);
    }

    private final static Operation t_vars_2_var_3(Prolog m) { 
        m.trust(null);
        return t_vars_2_4(m);
    }

    private final static Operation t_vars_2_int(Prolog m) { 
        m.jtry2(null, FILE_reducer::t_vars_2_int_1);
        return t_vars_2_1(m);
    }

    private final static Operation t_vars_2_int_1(Prolog m) { 
        m.trust(null);
        return t_vars_2_2(m);
    }

    private final static Operation t_vars_2_1(Prolog m) { 
    // t_vars(A,[[A]]):-var(A),!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_vars(A,[[A]]):-['$get_level'(B),var(A),'$cut'(B)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a3 = a2.car();
            if (!  Prolog.Nil .unify(a2.cdr(), m.trail))
                return m.fail();
        } else if (a2.isVar()){
            a3 = m.mkvar2();
             a2.bind(CONS(a3,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a1.unify(a3.car(), m.trail))
                return m.fail();
            if (!  Prolog.Nil .unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
             a3.bind(CONS(a1,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
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

    private final static Operation t_vars_2_2(Prolog m) { 
    // t_vars(A,[[]]):-atomic(A),!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_vars(A,[[]]):-['$get_level'(B),atomic(A),'$cut'(B)]
        if (! L_t_vars_2_s2.unify(a2, m.trail))
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

    private final static Operation t_vars_2_3(Prolog m) { 
    // t_vars([A],[[]]):-atomic(A),!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_vars([A],[[]]):-['$get_level'(B),atomic(A),'$cut'(B)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
            if (!  Prolog.Nil .unify(a1.cdr(), m.trail))
                return m.fail();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(a3,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        if (! L_t_vars_2_s2.unify(a2, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(3))
        a3 = a3.dref();
        if (! a3.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation t_vars_2_4(Prolog m) { 
    // t_vars([A|B],[C,[D|E],[F|G]]):-t_vars(A,[D|E]),t_vars(B,[F|G]),unionv(D,F,C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // t_vars([A|B],[C,[D|E],[F|G]]):-[t_vars(A,[D|E]),t_vars(B,[F|G]),unionv(D,F,C)]
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
        a6 = a6.dref();
        if (a6 .isCons()){
                        a7 = a6.car();
            a8 = a6.cdr();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a6.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a7 = a7.dref();
        if (a7 .isCons()){
                        a9 = a7.car();
            a10 = a7.cdr();
        } else if (a7.isVar()){
            a9 = m.mkvar2();
            a10 = m.mkvar2();
             a7.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        a8 = a8.dref();
        if (a8 .isCons()){
                        a11 = a8.car();
            if (!  Prolog.Nil .unify(a8.cdr(), m.trail))
                return m.fail();
        } else if (a8.isVar()){
            a11 = m.mkvar2();
             a8.bind(CONS(a11,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a11 = a11.dref();
        if (a11 .isCons()){
                        a12 = a11.car();
            a13 = a11.cdr();
        } else if (a11.isVar()){
            a12 = m.mkvar2();
            a13 = m.mkvar2();
             a11.bind(CONS(a12, a13), m.trail);
        } else {
            return m.fail();
        }
        a14 = CONS(a9, a10);
        a15 = CONS(a12, a13);
        p2 = //
 Op("t_vars", FILE_reducer::PRED_t_vars_2_static_exec, VA(a4, a15), //
 Op("unionv", FILE_reducer::PRED_unionv_3_static_exec, VA(a9, a12, a5), cont));
        m.AREGS[0] = a3;
        m.AREGS[1] = a14;
        m.cont = p2;
        return t_vars_2_top(m);
    }
/** PREDICATE: $dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main('$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'/2,public)




    public static Operation PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_reducer::$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_2_sub_1);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_2_1(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_2_2(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_2_1(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B):-atomic(B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B):-[atomic(B)]
        //START inline expansion of atomic(a(2))
        a2 = a2.dref();
        if (! a2.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_2_2(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B):-var(B),B\==A
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B):-[var(B),'$inequality_of_term'(B,A)]
        //START inline expansion of var(a(2))
        a2 = a2.dref();
        if (! (a2 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $inequality_of_term(a(2),a(1))
        a2 = a2.dref();
        a1 = a1.dref();
        if (a2.equalsTerm(a1)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: t_trans/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(t_trans/4,public)




    public static Operation PRED_t_trans_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_reducer::t_trans_4_sub_1);
        return t_trans_4_1(m);
    }

    private final static Operation t_trans_4_sub_1(Prolog m) { 
        m.retry(null, FILE_reducer::t_trans_4_sub_2);
        return t_trans_4_2(m);
    }

    private final static Operation t_trans_4_sub_2(Prolog m) { 
        m.retry(null, FILE_reducer::t_trans_4_sub_3);
        return t_trans_4_3(m);
    }

    private final static Operation t_trans_4_sub_3(Prolog m) { 
        m.retry(null, FILE_reducer::t_trans_4_sub_4);
        return t_trans_4_4(m);
    }

    private final static Operation t_trans_4_sub_4(Prolog m) { 
        m.trust(null);
        return t_trans_4_5(m);
    }

    private final static Operation t_trans_4_1(Prolog m) { 
    // t_trans(A,B,C,[B|k]):-'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B),!
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // t_trans(A,B,C,[B|k]):-['$get_level'(D),'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B),'$cut'(D)]
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! a2.unify(a4.car(), m.trail))
                return m.fail();
            if (!  ATOM_k .unify(a4.cdr(), m.trail))
                return m.fail();
        } else if (a4.isVar()){
             a4.bind(CONS(a2,  ATOM_k ), m.trail);
        } else {
            return m.fail();
        }
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl", FILE_reducer::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a5), cont));
    }

    private final static Operation t_trans_4_2(Prolog m) { 
    // t_trans(A,B,C,i):-A==B,!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // t_trans(A,B,C,i):-['$get_level'(D),'$equality_of_term'(A,B),'$cut'(D)]
        if (!  ATOM_i .unify(a4, m.trail))
            return m.fail();
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),a(2))
        a1 = a1.dref();
        a2 = a2.dref();
        if (! a1.equalsTerm(a2)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(5))
        a5 = a5.dref();
                  m.cut( a5.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation t_trans_4_3(Prolog m) { 
    // t_trans(A,B,[C|D],[B|k]):-notinv(A,C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // t_trans(A,B,[C|D],[B|k]):-[notinv(A,C)]
        a3 = a3.dref();
        if (a3 .isCons()){
                        a5 = a3.car();
        } else if (a3.isVar()){
            a5 = m.mkvar2();
             a3.bind(CONS(a5, m.DONTCARE("cons(a(3))")), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! a2.unify(a4.car(), m.trail))
                return m.fail();
            if (!  ATOM_k .unify(a4.cdr(), m.trail))
                return m.fail();
        } else if (a4.isVar()){
             a4.bind(CONS(a2,  ATOM_k ), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("notinv", FILE_reducer::PRED_notinv_2_static_exec, VA(a1, a5), cont);
    }

    private final static Operation t_trans_4_4(Prolog m) { 
    // t_trans(A,[B|C],[D,E,F],G):-E=[H|I],F=[J|K],'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(C,K,L,M,N),t_rule1(A,C,J,F,B,H,E,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // t_trans(A,[B|C],[D,E,F],G):-['$unify'(E,[H|I]),'$unify'(F,[J|K]),'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(C,K,L,M,N),t_rule1(A,C,J,F,B,H,E,G)]
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
        a3 = a3.dref();
        if (a3 .isCons()){
                        a7 = a3.cdr();
        } else if (a3.isVar()){
            a7 = m.mkvar2();
             a3.bind(CONS(m.DONTCARE("cons(a(3))"), a7), m.trail);
        } else {
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
        a11 = m.mkvar1();
        a12 = CONS(a11, m.DONT_CARE1());
        //START inline expansion of $unify(a(8),a(12))
        if (! a8.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = CONS(a13, a14);
        //START inline expansion of $unify(a(10),a(15))
        if (! a10.unify(a15, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl", FILE_reducer::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_5_static_exec, VA(a6, a14, m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2()), //
 Op("t_rule1", FILE_reducer::PRED_t_rule1_8_static_exec, VA(a1, a6, a13, a10, a5, a11, a8, a4), cont));
    }

    private final static Operation t_trans_4_5(Prolog m) { 
    // t_trans(A,[B,C|D],[E,F,G],H):-F=[I|J],G=[K,L,M],M=[N|O],L=[P|Q],t_rule2(A,D,C,P,L,B,I,F,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // t_trans(A,[B,C|D],[E,F,G],H):-['$unify'(F,[I|J]),'$unify'(G,[K,L,M]),'$unify'(M,[N|O]),'$unify'(L,[P|Q]),t_rule2(A,D,C,P,L,B,I,F,H)]
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
        a6 = a6.dref();
        if (a6 .isCons()){
                        a7 = a6.car();
            a8 = a6.cdr();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a6.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        a9 = a3.cdr();
        } else if (a3.isVar()){
            a9 = m.mkvar2();
             a3.bind(CONS(m.DONTCARE("cons(a(3))"), a9), m.trail);
        } else {
            return m.fail();
        }
        a9 = a9.dref();
        if (a9 .isCons()){
                        a10 = a9.car();
            a11 = a9.cdr();
        } else if (a9.isVar()){
            a10 = m.mkvar2();
            a11 = m.mkvar2();
             a9.bind(CONS(a10, a11), m.trail);
        } else {
            return m.fail();
        }
        a11 = a11.dref();
        if (a11 .isCons()){
                        a12 = a11.car();
            if (!  Prolog.Nil .unify(a11.cdr(), m.trail))
                return m.fail();
        } else if (a11.isVar()){
            a12 = m.mkvar2();
             a11.bind(CONS(a12,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a13 = m.mkvar1();
        a14 = CONS(a13, m.DONT_CARE1());
        //START inline expansion of $unify(a(10),a(14))
        if (! a10.unify(a14, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = CONS(a16,  Prolog.Nil );
        a18 = CONS(a15, a17);
        a19 = CONS(m.DONT_CARE1(), a18);
        //START inline expansion of $unify(a(12),a(19))
        if (! a12.unify(a19, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a20 = CONS(m.DONT_CARE1(), m.DONT_CARE1());
        //START inline expansion of $unify(a(16),a(20))
        if (! a16.unify(a20, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a21 = m.mkvar1();
        a22 = CONS(a21, m.DONT_CARE1());
        //START inline expansion of $unify(a(15),a(22))
        if (! a15.unify(a22, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("t_rule2", FILE_reducer::PRED_t_rule2_9_static_exec, VA(a1, a8, a7, a21, a15, a5, a13, a10, a4), cont);
    }
/** PREDICATE: $dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main('$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'/5,public)

    // private final Term arg5;




    public static Operation PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_reducer::$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_5_sub_1);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_5_1(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_5_2(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_5_1(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B,C,D,E):-end(A)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B,C,D,E):-[end(A)]
        return //
 Op("end", FILE_reducer::PRED_end_1_static_exec, VA(a1), cont);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_5_2(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B,C,D,E):-B=[C,[D|E]],D\==[]
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A,B,C,D,E):-['$unify'(B,[C,[D|E]]),'$inequality_of_term'(D,[])]
        a6 = CONS(a4, a5);
        a7 = CONS(a6,  Prolog.Nil );
        a8 = CONS(a3, a7);
        //START inline expansion of $unify(a(2),a(8))
        if (! a2.unify(a8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $inequality_of_term(a(4),@(Prolog.Nil))
        a4 = a4.dref();
        if (a4.equalsTerm(Prolog.Nil)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: t_rule1/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(t_rule1/8,public)

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_t_rule1_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry8(null, FILE_reducer::t_rule1_8_sub_1);
        return t_rule1_8_1(m);
    }

    private final static Operation t_rule1_8_sub_1(Prolog m) { 
        m.retry(null, FILE_reducer::t_rule1_8_sub_2);
        return t_rule1_8_2(m);
    }

    private final static Operation t_rule1_8_sub_2(Prolog m) { 
        m.retry(null, FILE_reducer::t_rule1_8_sub_3);
        return t_rule1_8_3(m);
    }

    private final static Operation t_rule1_8_sub_3(Prolog m) { 
        m.trust(null);
        return t_rule1_8_4(m);
    }

    private final static Operation t_rule1_8_1(Prolog m) { 
    // t_rule1(A,B,C,D,E,F,G,B):-notinv(A,C),A==E,!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
        cont = m.cont;
    // t_rule1(A,B,C,D,E,F,G,B):-['$get_level'(H),notinv(A,C),'$equality_of_term'(A,E),'$cut'(H)]
        if (! a2.unify(a8, m.trail))
            return m.fail();
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("notinv", FILE_reducer::PRED_notinv_2_static_exec, VA(a1, a3), //
 Op("$equality_of_term", FILE_reducer::PRED_$equality_of_term_2_static_exec, VA(a1, a5), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a9), cont)));
    }

    private final static Operation t_rule1_8_2(Prolog m) { 
    // t_rule1(A,B,C,D,E,F,G,[H,B|b]):-notinv(A,C),inv(A,F),A\==E,!,t_trans(A,E,G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4;
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
    // t_rule1(A,B,C,D,E,F,G,[H,B|b]):-['$get_level'(I),notinv(A,C),inv(A,F),'$inequality_of_term'(A,E),'$cut'(I),t_trans(A,E,G,H)]
        a8 = a8.dref();
        if (a8 .isCons()){
                        a9 = a8.car();
            a10 = a8.cdr();
        } else if (a8.isVar()){
            a9 = m.mkvar2();
            a10 = m.mkvar2();
             a8.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
        if (a10 .isCons()){
                        if (! a2.unify(a10.car(), m.trail))
                return m.fail();
            if (!  ATOM_b .unify(a10.cdr(), m.trail))
                return m.fail();
        } else if (a10.isVar()){
             a10.bind(CONS(a2,  ATOM_b ), m.trail);
        } else {
            return m.fail();
        }
        a11 = m.mkvar1();
        //START inline expansion of $get_level(a(11))
        if (! a11.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("notinv", FILE_reducer::PRED_notinv_2_static_exec, VA(a1, a3), //
 Op("inv", FILE_reducer::PRED_inv_2_static_exec, VA(a1, a6), //
 Op("$inequality_of_term", FILE_reducer::PRED_$inequality_of_term_2_static_exec, VA(a1, a5), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a11), //
 Op("t_trans", FILE_reducer::PRED_t_trans_4_static_exec, VA(a1, a5, a7, a9), cont)))));
    }

    private final static Operation t_rule1_8_3(Prolog m) { 
    // t_rule1(A,B,C,D,E,F,G,[E,H|c]):-notinv(A,F),!,t_trans(A,B,D,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
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
        cont = m.cont;
    // t_rule1(A,B,C,D,E,F,G,[E,H|c]):-['$get_level'(I),notinv(A,F),'$cut'(I),t_trans(A,B,D,H)]
        a8 = a8.dref();
        if (a8 .isCons()){
                        if (! a5.unify(a8.car(), m.trail))
                return m.fail();
            a9 = a8.cdr();
        } else if (a8.isVar()){
            a9 = m.mkvar2();
             a8.bind(CONS(a5, a9), m.trail);
        } else {
            return m.fail();
        }
        a9 = a9.dref();
        if (a9 .isCons()){
                        a10 = a9.car();
            if (!  ATOM_c .unify(a9.cdr(), m.trail))
                return m.fail();
        } else if (a9.isVar()){
            a10 = m.mkvar2();
             a9.bind(CONS(a10,  ATOM_c ), m.trail);
        } else {
            return m.fail();
        }
        a11 = m.mkvar1();
        //START inline expansion of $get_level(a(11))
        if (! a11.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("notinv", FILE_reducer::PRED_notinv_2_static_exec, VA(a1, a6), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a11), //
 Op("t_trans", FILE_reducer::PRED_t_trans_4_static_exec, VA(a1, a2, a4, a10), cont)));
    }

    private final static Operation t_rule1_8_4(Prolog m) { 
    // t_rule1(A,B,C,D,E,F,G,[H,I|s]):-t_trans(A,B,D,I),t_trans(A,E,G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
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
    // t_rule1(A,B,C,D,E,F,G,[H,I|s]):-[t_trans(A,B,D,I),t_trans(A,E,G,H)]
        a8 = a8.dref();
        if (a8 .isCons()){
                        a9 = a8.car();
            a10 = a8.cdr();
        } else if (a8.isVar()){
            a9 = m.mkvar2();
            a10 = m.mkvar2();
             a8.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
        if (a10 .isCons()){
                        a11 = a10.car();
            if (!  ATOM_s .unify(a10.cdr(), m.trail))
                return m.fail();
        } else if (a10.isVar()){
            a11 = m.mkvar2();
             a10.bind(CONS(a11,  ATOM_s ), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("t_trans", FILE_reducer::PRED_t_trans_4_static_exec, VA(a1, a2, a4, a11), //
 Op("t_trans", FILE_reducer::PRED_t_trans_4_static_exec, VA(a1, a5, a7, a9), cont));
    }
/** PREDICATE: t_rule2/9
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(t_rule2/9,public)

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_t_rule2_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(9, null, FILE_reducer::t_rule2_9_sub_1);
        return t_rule2_9_1(m);
    }

    private final static Operation t_rule2_9_sub_1(Prolog m) { 
        m.retry(null, FILE_reducer::t_rule2_9_sub_2);
        return t_rule2_9_2(m);
    }

    private final static Operation t_rule2_9_sub_2(Prolog m) { 
        m.retry(null, FILE_reducer::t_rule2_9_sub_3);
        return t_rule2_9_3(m);
    }

    private final static Operation t_rule2_9_sub_3(Prolog m) { 
        m.retry(null, FILE_reducer::t_rule2_9_sub_4);
        return t_rule2_9_4(m);
    }

    private final static Operation t_rule2_9_sub_4(Prolog m) { 
        m.retry(null, FILE_reducer::t_rule2_9_sub_5);
        return t_rule2_9_5(m);
    }

    private final static Operation t_rule2_9_sub_5(Prolog m) { 
        m.trust(null);
        return t_rule2_9_6(m);
    }

    private final static Operation t_rule2_9_1(Prolog m) { 
    // t_rule2(A,B,C,D,E,F,G,H,[F,B|c]):-A==C,notinv(A,G),!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
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
        a9 = m.AREGS[8];
        cont = m.cont;
    // t_rule2(A,B,C,D,E,F,G,H,[F,B|c]):-['$get_level'(I),'$equality_of_term'(A,C),notinv(A,G),'$cut'(I)]
        a9 = a9.dref();
        if (a9 .isCons()){
                        if (! a6.unify(a9.car(), m.trail))
                return m.fail();
            a10 = a9.cdr();
        } else if (a9.isVar()){
            a10 = m.mkvar2();
             a9.bind(CONS(a6, a10), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
        if (a10 .isCons()){
                        if (! a2.unify(a10.car(), m.trail))
                return m.fail();
            if (!  ATOM_c .unify(a10.cdr(), m.trail))
                return m.fail();
        } else if (a10.isVar()){
             a10.bind(CONS(a2,  ATOM_c ), m.trail);
        } else {
            return m.fail();
        }
        a11 = m.mkvar1();
        //START inline expansion of $get_level(a(11))
        if (! a11.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),a(3))
        a1 = a1.dref();
        a3 = a3.dref();
        if (! a1.equalsTerm(a3)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("notinv", FILE_reducer::PRED_notinv_2_static_exec, VA(a1, a7), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a11), cont));
    }

    private final static Operation t_rule2_9_2(Prolog m) { 
    // t_rule2(A,B,C,D,E,F,G,H,[I,B|s]):-A==C,!,t_trans(A,F,H,I)
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
        cont = m.cont;
    // t_rule2(A,B,C,D,E,F,G,H,[I,B|s]):-['$get_level'(J),'$equality_of_term'(A,C),'$cut'(J),t_trans(A,F,H,I)]
        a9 = a9.dref();
        if (a9 .isCons()){
                        a10 = a9.car();
            a11 = a9.cdr();
        } else if (a9.isVar()){
            a10 = m.mkvar2();
            a11 = m.mkvar2();
             a9.bind(CONS(a10, a11), m.trail);
        } else {
            return m.fail();
        }
        a11 = a11.dref();
        if (a11 .isCons()){
                        if (! a2.unify(a11.car(), m.trail))
                return m.fail();
            if (!  ATOM_s .unify(a11.cdr(), m.trail))
                return m.fail();
        } else if (a11.isVar()){
             a11.bind(CONS(a2,  ATOM_s ), m.trail);
        } else {
            return m.fail();
        }
        a12 = m.mkvar1();
        //START inline expansion of $get_level(a(12))
        if (! a12.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),a(3))
        a1 = a1.dref();
        a3 = a3.dref();
        if (! a1.equalsTerm(a3)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(12))
        a12 = a12.dref();
                  m.cut( a12.intValue());
        //END inline expansion
        return //
 Op("t_trans", FILE_reducer::PRED_t_trans_4_static_exec, VA(a1, a6, a8, a10), cont);
    }

    private final static Operation t_rule2_9_3(Prolog m) { 
    // t_rule2(A,B,C,D,E,F,G,H,[F,I,B|cp]):-inv(A,D),notinv(A,G),!,t_trans(A,C,E,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
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
        cont = m.cont;
    // t_rule2(A,B,C,D,E,F,G,H,[F,I,B|cp]):-['$get_level'(J),inv(A,D),notinv(A,G),'$cut'(J),t_trans(A,C,E,I)]
        a9 = a9.dref();
        if (a9 .isCons()){
                        if (! a6.unify(a9.car(), m.trail))
                return m.fail();
            a10 = a9.cdr();
        } else if (a9.isVar()){
            a10 = m.mkvar2();
             a9.bind(CONS(a6, a10), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
        if (a10 .isCons()){
                        a11 = a10.car();
            a12 = a10.cdr();
        } else if (a10.isVar()){
            a11 = m.mkvar2();
            a12 = m.mkvar2();
             a10.bind(CONS(a11, a12), m.trail);
        } else {
            return m.fail();
        }
        a12 = a12.dref();
        if (a12 .isCons()){
                        if (! a2.unify(a12.car(), m.trail))
                return m.fail();
            if (!  ATOM_cp .unify(a12.cdr(), m.trail))
                return m.fail();
        } else if (a12.isVar()){
             a12.bind(CONS(a2,  ATOM_cp ), m.trail);
        } else {
            return m.fail();
        }
        a13 = m.mkvar1();
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("inv", FILE_reducer::PRED_inv_2_static_exec, VA(a1, a4), //
 Op("notinv", FILE_reducer::PRED_notinv_2_static_exec, VA(a1, a7), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a13), //
 Op("t_trans", FILE_reducer::PRED_t_trans_4_static_exec, VA(a1, a3, a5, a11), cont))));
    }

    private final static Operation t_rule2_9_4(Prolog m) { 
    // t_rule2(A,B,C,D,E,F,G,H,[I,J,B|sp]):-inv(A,D),!,t_trans(A,C,E,J),t_trans(A,F,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
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
        cont = m.cont;
    // t_rule2(A,B,C,D,E,F,G,H,[I,J,B|sp]):-['$get_level'(K),inv(A,D),'$cut'(K),t_trans(A,C,E,J),t_trans(A,F,H,I)]
        a9 = a9.dref();
        if (a9 .isCons()){
                        a10 = a9.car();
            a11 = a9.cdr();
        } else if (a9.isVar()){
            a10 = m.mkvar2();
            a11 = m.mkvar2();
             a9.bind(CONS(a10, a11), m.trail);
        } else {
            return m.fail();
        }
        a11 = a11.dref();
        if (a11 .isCons()){
                        a12 = a11.car();
            a13 = a11.cdr();
        } else if (a11.isVar()){
            a12 = m.mkvar2();
            a13 = m.mkvar2();
             a11.bind(CONS(a12, a13), m.trail);
        } else {
            return m.fail();
        }
        a13 = a13.dref();
        if (a13 .isCons()){
                        if (! a2.unify(a13.car(), m.trail))
                return m.fail();
            if (!  ATOM_sp .unify(a13.cdr(), m.trail))
                return m.fail();
        } else if (a13.isVar()){
             a13.bind(CONS(a2,  ATOM_sp ), m.trail);
        } else {
            return m.fail();
        }
        a14 = m.mkvar1();
        //START inline expansion of $get_level(a(14))
        if (! a14.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("inv", FILE_reducer::PRED_inv_2_static_exec, VA(a1, a4), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a14), //
 Op("t_trans", FILE_reducer::PRED_t_trans_4_static_exec, VA(a1, a3, a5, a12), //
 Op("t_trans", FILE_reducer::PRED_t_trans_4_static_exec, VA(a1, a6, a8, a10), cont))));
    }

    private final static Operation t_rule2_9_5(Prolog m) { 
    // t_rule2(A,B,C,D,E,F,G,H,[C|B]):-A==F,!
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
        a9 = m.AREGS[8];
        cont = m.cont;
    // t_rule2(A,B,C,D,E,F,G,H,[C|B]):-['$get_level'(I),'$equality_of_term'(A,F),'$cut'(I)]
        a9 = a9.dref();
        if (a9 .isCons()){
                        if (! a3.unify(a9.car(), m.trail))
                return m.fail();
            if (! a2.unify(a9.cdr(), m.trail))
                return m.fail();
        } else if (a9.isVar()){
             a9.bind(CONS(a3, a2), m.trail);
        } else {
            return m.fail();
        }
        a10 = m.mkvar1();
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),a(6))
        a1 = a1.dref();
        a6 = a6.dref();
        if (! a1.equalsTerm(a6)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(10))
        a10 = a10.dref();
                  m.cut( a10.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation t_rule2_9_6(Prolog m) { 
    // t_rule2(A,B,C,D,E,F,G,H,[I,C,B|bp]):-t_trans(A,F,H,I)
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
        cont = m.cont;
    // t_rule2(A,B,C,D,E,F,G,H,[I,C,B|bp]):-[t_trans(A,F,H,I)]
        a9 = a9.dref();
        if (a9 .isCons()){
                        a10 = a9.car();
            a11 = a9.cdr();
        } else if (a9.isVar()){
            a10 = m.mkvar2();
            a11 = m.mkvar2();
             a9.bind(CONS(a10, a11), m.trail);
        } else {
            return m.fail();
        }
        a11 = a11.dref();
        if (a11 .isCons()){
                        if (! a3.unify(a11.car(), m.trail))
                return m.fail();
            a12 = a11.cdr();
        } else if (a11.isVar()){
            a12 = m.mkvar2();
             a11.bind(CONS(a3, a12), m.trail);
        } else {
            return m.fail();
        }
        a12 = a12.dref();
        if (a12 .isCons()){
                        if (! a2.unify(a12.car(), m.trail))
                return m.fail();
            if (!  ATOM_bp .unify(a12.cdr(), m.trail))
                return m.fail();
        } else if (a12.isVar()){
             a12.bind(CONS(a2,  ATOM_bp ), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("t_trans", FILE_reducer::PRED_t_trans_4_static_exec, VA(a1, a6, a8, a10), cont);
    }
/** PREDICATE: make_list/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(make_list/2,public)




    public static Operation PRED_make_list_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::make_list_2_var, FILE_reducer::make_list_2_1, FILE_reducer::make_list_2_1, FILE_reducer::make_list_2_1, FILE_reducer::make_list_2_1, FILE_reducer::make_list_2_var); 
    }

    private final static Operation make_list_2_var(Prolog m) { 
        m.jtry2(null, FILE_reducer::make_list_2_var_1);
        return make_list_2_1(m);
    }

    private final static Operation make_list_2_var_1(Prolog m) { 
        m.trust(null);
        return make_list_2_2(m);
    }

    private final static Operation make_list_2_1(Prolog m) { 
    // make_list(A,A):-atomic(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // make_list(A,A):-[atomic(A)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation make_list_2_2(Prolog m) { 
    // make_list([A,B|C],[B|D]):-list_functor_name(C),make_list(A,D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // make_list([A,B|C],[B|D]):-[list_functor_name(C),make_list(A,D)]
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
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a5.unify(a2.car(), m.trail))
                return m.fail();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a7 = m.mkvar2();
             a2.bind(CONS(a5, a7), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("list_functor_name", FILE_reducer::PRED_list_functor_name_1_static_exec, VA(a6), //
 Op("make_list", FILE_reducer::PRED_make_list_2_static_exec, VA(a3, a7), cont));
    }
/** PREDICATE: $dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main('$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'/1,public)




    public static Operation PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_reducer::$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_sub_1);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_1(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_2(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_1(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A):-var(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A):-[var(A)]
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_2(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A):-atomic(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A):-[atomic(A)]
        //START inline expansion of atomic(a(1))
        a1 = a1.dref();
        if (! a1.isAtomicValue()) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: listify/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(listify/2,public)




    public static Operation PRED_listify_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_reducer::listify_2_sub_1);
        return listify_2_1(m);
    }

    private final static Operation listify_2_sub_1(Prolog m) { 
        m.trust(null);
        return listify_2_2(m);
    }

    private final static Operation listify_2_1(Prolog m) { 
    // listify(A,A):-'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A),!
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // listify(A,A):-['$get_level'(B),'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl'(A),'$cut'(B)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl", FILE_reducer::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_static_exec, VA(a1), //
 Op("$cut", FILE_reducer::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation listify_2_2(Prolog m) { 
    // listify(A,[B|C]):-functor(A,B,D),listify_list(1,D,A,C)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // listify(A,[B|C]):-[functor(A,B,D),listify_list(1,D,A,C)]
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
 Op("functor", FILE_reducer::PRED_functor_3_static_exec, VA(a1, a3, a5), //
 Op("listify_list", FILE_reducer::PRED_listify_list_4_static_exec, VA( int_1 , a5, a1, a4), cont));
    }
/** PREDICATE: listify_list/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(listify_list/4,public)




    public static Operation PRED_listify_list_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_reducer::listify_list_4_sub_1);
        return listify_list_4_1(m);
    }

    private final static Operation listify_list_4_sub_1(Prolog m) { 
        m.trust(null);
        return listify_list_4_2(m);
    }

    private final static Operation listify_list_4_1(Prolog m) { 
    // listify_list(A,B,C,[]):-A>B,!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // listify_list(A,B,C,[]):-['$get_level'(D),'$greater_than'(A,B),'$cut'(D)]
        if (!  Prolog.Nil .unify(a4, m.trail))
            return m.fail();
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(5))
        a5 = a5.dref();
                  m.cut( a5.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation listify_list_4_2(Prolog m) { 
    // listify_list(A,B,C,[D|E]):-A=<B,!,arg(A,C,F),listify(F,D),G is A+1,listify_list(G,B,C,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // listify_list(A,B,C,[D|E]):-['$get_level'(F),'$less_or_equal'(A,B),'$cut'(F),arg(A,C,G),listify(G,D),H is A+1,listify_list(H,B,C,E)]
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
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_or_equal(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$002B_2 , a1,  int_1 );
 ;
        return //
 Op("arg", FILE_reducer::PRED_arg_3_static_exec, VA(a1, a3, a8), //
 Op("listify", FILE_reducer::PRED_listify_2_static_exec, VA(a8, a5), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a9, a10), //
 Op("listify_list", FILE_reducer::PRED_listify_list_4_static_exec, VA(a9, a2, a3, a6), cont))));
    }
/** PREDICATE: member/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(member/2,public)




    public static Operation PRED_member_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return member_2_top(m);
    }

    private final static Operation member_2_top(Prolog m) { 
        m.setB0();
        m.jtry2(null, FILE_reducer::member_2_sub_1);
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
/** PREDICATE: append/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(append/3,public)




    public static Operation PRED_append_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return append_3_top(m);
    }

    private final static Operation append_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_reducer::append_3_var, fail_0, fail_0, FILE_reducer::append_3_1, fail_0, FILE_reducer::append_3_2); 
    }

    private final static Operation append_3_var(Prolog m) { 
        m.jtry3(null, FILE_reducer::append_3_var_1);
        return append_3_1(m);
    }

    private final static Operation append_3_var_1(Prolog m) { 
        m.trust(null);
        return append_3_2(m);
    }

    private final static Operation append_3_1(Prolog m) { 
    // append([],A,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // append([],A,A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation append_3_2(Prolog m) { 
    // append([A|B],C,[A|D]):-append(B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // append([A|B],C,[A|D]):-[append(B,C,D)]
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
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a4.unify(a3.car(), m.trail))
                return m.fail();
            a6 = a3.cdr();
        } else if (a3.isVar()){
            a6 = m.mkvar2();
             a3.bind(CONS(a4, a6), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a5;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
m.cont = cont;
        return append_3_top(m);
    }
/** PREDICATE: intersectv/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(intersectv/3,public)




    public static Operation PRED_intersectv_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::intersectv_3_var, fail_0, fail_0, FILE_reducer::intersectv_3_1, fail_0, FILE_reducer::intersectv_3_2); 
    }

    private final static Operation intersectv_3_var(Prolog m) { 
        m.jtry3(null, FILE_reducer::intersectv_3_var_1);
        return intersectv_3_1(m);
    }

    private final static Operation intersectv_3_var_1(Prolog m) { 
        m.trust(null);
        return intersectv_3_2(m);
    }

    private final static Operation intersectv_3_1(Prolog m) { 
    // intersectv([],A,[]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // intersectv([],A,[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation intersectv_3_2(Prolog m) { 
    // intersectv([A|B],C,D):-intersectv_2(C,A,B,D)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // intersectv([A|B],C,D):-[intersectv_2(C,A,B,D)]
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
        return //
 Op("intersectv_2", FILE_reducer::PRED_intersectv_2_4_static_exec, VA(a2, a4, a5, a3), cont);
    }
/** PREDICATE: intersectv_2/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(intersectv_2/4,public)




    public static Operation PRED_intersectv_2_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::intersectv_2_4_var, fail_0, fail_0, FILE_reducer::intersectv_2_4_1, fail_0, FILE_reducer::intersectv_2_4_2); 
    }

    private final static Operation intersectv_2_4_var(Prolog m) { 
        m.jtry4(null, FILE_reducer::intersectv_2_4_var_1);
        return intersectv_2_4_1(m);
    }

    private final static Operation intersectv_2_4_var_1(Prolog m) { 
        m.trust(null);
        return intersectv_2_4_2(m);
    }

    private final static Operation intersectv_2_4_1(Prolog m) { 
    // intersectv_2([],A,B,[]):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // intersectv_2([],A,B,[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation intersectv_2_4_2(Prolog m) { 
    // intersectv_2([A|B],C,D,E):-compare(F,C,A),intersectv_3(F,C,D,A,B,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // intersectv_2([A|B],C,D,E):-[compare(F,C,A),intersectv_3(F,C,D,A,B,E)]
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
        a7 = m.mkvar1();
        return //
 Op("compare", FILE_builtins::PRED_compare_3_static_exec, VA(a7, a2, a5), //
 Op("intersectv_3", FILE_reducer::PRED_intersectv_3_6_static_exec, VA(a7, a2, a3, a5, a6, a4), cont));
    }
/** PREDICATE: intersectv_3/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(intersectv_3/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_intersectv_3_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::intersectv_3_6_var, fail_0, fail_0, FILE_reducer::intersectv_3_6_var, fail_0, fail_0); 
    }

    private final static Operation intersectv_3_6_var(Prolog m) { 
        m.jtry6(null, FILE_reducer::intersectv_3_6_var_1);
        return intersectv_3_6_1(m);
    }

    private final static Operation intersectv_3_6_var_1(Prolog m) { 
        m.retry(null, FILE_reducer::intersectv_3_6_var_2);
        return intersectv_3_6_2(m);
    }

    private final static Operation intersectv_3_6_var_2(Prolog m) { 
        m.trust(null);
        return intersectv_3_6_3(m);
    }

    private final static Operation intersectv_3_6_1(Prolog m) { 
    // intersectv_3(<,A,B,C,D,E):-intersectv_2(B,C,D,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // intersectv_3(<,A,B,C,D,E):-[intersectv_2(B,C,D,E)]
        if (!  ATOM_$003C .unify(a1, m.trail))
            return m.fail();
        return //
 Op("intersectv_2", FILE_reducer::PRED_intersectv_2_4_static_exec, VA(a3, a4, a5, a6), cont);
    }

    private final static Operation intersectv_3_6_2(Prolog m) { 
    // intersectv_3(=,A,B,C,D,[A|E]):-intersectv(B,D,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // intersectv_3(=,A,B,C,D,[A|E]):-[intersectv(B,D,E)]
        if (!  ATOM_$003D .unify(a1, m.trail))
            return m.fail();
        a6 = a6.dref();
        if (a6 .isCons()){
                        if (! a2.unify(a6.car(), m.trail))
                return m.fail();
            a7 = a6.cdr();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
             a6.bind(CONS(a2, a7), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("intersectv", FILE_reducer::PRED_intersectv_3_static_exec, VA(a3, a5, a7), cont);
    }

    private final static Operation intersectv_3_6_3(Prolog m) { 
    // intersectv_3(>,A,B,C,D,E):-intersectv_2(D,A,B,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // intersectv_3(>,A,B,C,D,E):-[intersectv_2(D,A,B,E)]
        if (!  ATOM_$003E .unify(a1, m.trail))
            return m.fail();
        return //
 Op("intersectv_2", FILE_reducer::PRED_intersectv_2_4_static_exec, VA(a5, a2, a3, a6), cont);
    }
/** PREDICATE: intersectv_list/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(intersectv_list/2,public)




    public static Operation PRED_intersectv_list_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::intersectv_list_2_var, fail_0, fail_0, FILE_reducer::intersectv_list_2_1, fail_0, FILE_reducer::intersectv_list_2_2); 
    }

    private final static Operation intersectv_list_2_var(Prolog m) { 
        m.jtry2(null, FILE_reducer::intersectv_list_2_var_1);
        return intersectv_list_2_1(m);
    }

    private final static Operation intersectv_list_2_var_1(Prolog m) { 
        m.trust(null);
        return intersectv_list_2_2(m);
    }

    private final static Operation intersectv_list_2_1(Prolog m) { 
    // intersectv_list([],[]):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // intersectv_list([],[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation intersectv_list_2_2(Prolog m) { 
    // intersectv_list([A|B],C):-intersectv_list(B,A,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // intersectv_list([A|B],C):-[intersectv_list(B,A,C)]
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
        return //
 Op("intersectv_list", FILE_reducer::PRED_intersectv_list_3_static_exec, VA(a4, a3, a2), cont);
    }
/** PREDICATE: intersectv_list/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(intersectv_list/3,public)




    public static Operation PRED_intersectv_list_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::intersectv_list_3_var, fail_0, fail_0, FILE_reducer::intersectv_list_3_1, fail_0, FILE_reducer::intersectv_list_3_2); 
    }

    private final static Operation intersectv_list_3_var(Prolog m) { 
        m.jtry3(null, FILE_reducer::intersectv_list_3_var_1);
        return intersectv_list_3_1(m);
    }

    private final static Operation intersectv_list_3_var_1(Prolog m) { 
        m.trust(null);
        return intersectv_list_3_2(m);
    }

    private final static Operation intersectv_list_3_1(Prolog m) { 
    // intersectv_list([],A,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // intersectv_list([],A,A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation intersectv_list_3_2(Prolog m) { 
    // intersectv_list([A|B],C,D):-intersectv(A,C,E),intersectv_list(B,E,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // intersectv_list([A|B],C,D):-[intersectv(A,C,E),intersectv_list(B,E,D)]
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
 Op("intersectv", FILE_reducer::PRED_intersectv_3_static_exec, VA(a4, a2, a6), //
 Op("intersectv_list", FILE_reducer::PRED_intersectv_list_3_static_exec, VA(a5, a6, a3), cont));
    }
/** PREDICATE: diffv/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(diffv/3,public)




    public static Operation PRED_diffv_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::diffv_3_var, fail_0, fail_0, FILE_reducer::diffv_3_1, fail_0, FILE_reducer::diffv_3_2); 
    }

    private final static Operation diffv_3_var(Prolog m) { 
        m.jtry3(null, FILE_reducer::diffv_3_var_1);
        return diffv_3_1(m);
    }

    private final static Operation diffv_3_var_1(Prolog m) { 
        m.trust(null);
        return diffv_3_2(m);
    }

    private final static Operation diffv_3_1(Prolog m) { 
    // diffv([],A,[]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // diffv([],A,[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation diffv_3_2(Prolog m) { 
    // diffv([A|B],C,D):-diffv_2(C,A,B,D)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // diffv([A|B],C,D):-[diffv_2(C,A,B,D)]
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
        return //
 Op("diffv_2", FILE_reducer::PRED_diffv_2_4_static_exec, VA(a2, a4, a5, a3), cont);
    }
/** PREDICATE: diffv_2/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(diffv_2/4,public)




    public static Operation PRED_diffv_2_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::diffv_2_4_var, fail_0, fail_0, FILE_reducer::diffv_2_4_1, fail_0, FILE_reducer::diffv_2_4_2); 
    }

    private final static Operation diffv_2_4_var(Prolog m) { 
        m.jtry4(null, FILE_reducer::diffv_2_4_var_1);
        return diffv_2_4_1(m);
    }

    private final static Operation diffv_2_4_var_1(Prolog m) { 
        m.trust(null);
        return diffv_2_4_2(m);
    }

    private final static Operation diffv_2_4_1(Prolog m) { 
    // diffv_2([],A,B,[A|B]):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // diffv_2([],A,B,[A|B]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! a2.unify(a4.car(), m.trail))
                return m.fail();
            if (! a3.unify(a4.cdr(), m.trail))
                return m.fail();
        } else if (a4.isVar()){
             a4.bind(CONS(a2, a3), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation diffv_2_4_2(Prolog m) { 
    // diffv_2([A|B],C,D,E):-compare(F,C,A),diffv_3(F,C,D,A,B,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // diffv_2([A|B],C,D,E):-[compare(F,C,A),diffv_3(F,C,D,A,B,E)]
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
        a7 = m.mkvar1();
        return //
 Op("compare", FILE_builtins::PRED_compare_3_static_exec, VA(a7, a2, a5), //
 Op("diffv_3", FILE_reducer::PRED_diffv_3_6_static_exec, VA(a7, a2, a3, a5, a6, a4), cont));
    }
/** PREDICATE: diffv_3/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(diffv_3/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_diffv_3_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::diffv_3_6_var, fail_0, fail_0, FILE_reducer::diffv_3_6_var, fail_0, fail_0); 
    }

    private final static Operation diffv_3_6_var(Prolog m) { 
        m.jtry6(null, FILE_reducer::diffv_3_6_var_1);
        return diffv_3_6_1(m);
    }

    private final static Operation diffv_3_6_var_1(Prolog m) { 
        m.retry(null, FILE_reducer::diffv_3_6_var_2);
        return diffv_3_6_2(m);
    }

    private final static Operation diffv_3_6_var_2(Prolog m) { 
        m.trust(null);
        return diffv_3_6_3(m);
    }

    private final static Operation diffv_3_6_1(Prolog m) { 
    // diffv_3(<,A,B,C,D,[A|E]):-diffv(B,[C|D],E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // diffv_3(<,A,B,C,D,[A|E]):-[diffv(B,[C|D],E)]
        if (!  ATOM_$003C .unify(a1, m.trail))
            return m.fail();
        a6 = a6.dref();
        if (a6 .isCons()){
                        if (! a2.unify(a6.car(), m.trail))
                return m.fail();
            a7 = a6.cdr();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
             a6.bind(CONS(a2, a7), m.trail);
        } else {
            return m.fail();
        }
        a8 = CONS(a4, a5);
        return //
 Op("diffv", FILE_reducer::PRED_diffv_3_static_exec, VA(a3, a8, a7), cont);
    }

    private final static Operation diffv_3_6_2(Prolog m) { 
    // diffv_3(=,A,B,C,D,E):-diffv(B,D,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // diffv_3(=,A,B,C,D,E):-[diffv(B,D,E)]
        if (!  ATOM_$003D .unify(a1, m.trail))
            return m.fail();
        return //
 Op("diffv", FILE_reducer::PRED_diffv_3_static_exec, VA(a3, a5, a6), cont);
    }

    private final static Operation diffv_3_6_3(Prolog m) { 
    // diffv_3(>,A,B,C,D,E):-diffv_2(D,A,B,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // diffv_3(>,A,B,C,D,E):-[diffv_2(D,A,B,E)]
        if (!  ATOM_$003E .unify(a1, m.trail))
            return m.fail();
        return //
 Op("diffv_2", FILE_reducer::PRED_diffv_2_4_static_exec, VA(a5, a2, a3, a6), cont);
    }
/** PREDICATE: unionv/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(unionv/3,public)




    public static Operation PRED_unionv_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::unionv_3_var, fail_0, fail_0, FILE_reducer::unionv_3_1, fail_0, FILE_reducer::unionv_3_2); 
    }

    private final static Operation unionv_3_var(Prolog m) { 
        m.jtry3(null, FILE_reducer::unionv_3_var_1);
        return unionv_3_1(m);
    }

    private final static Operation unionv_3_var_1(Prolog m) { 
        m.trust(null);
        return unionv_3_2(m);
    }

    private final static Operation unionv_3_1(Prolog m) { 
    // unionv([],A,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // unionv([],A,A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation unionv_3_2(Prolog m) { 
    // unionv([A|B],C,D):-unionv_2(C,A,B,D)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // unionv([A|B],C,D):-[unionv_2(C,A,B,D)]
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
        return //
 Op("unionv_2", FILE_reducer::PRED_unionv_2_4_static_exec, VA(a2, a4, a5, a3), cont);
    }
/** PREDICATE: unionv_2/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(unionv_2/4,public)




    public static Operation PRED_unionv_2_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::unionv_2_4_var, fail_0, fail_0, FILE_reducer::unionv_2_4_1, fail_0, FILE_reducer::unionv_2_4_2); 
    }

    private final static Operation unionv_2_4_var(Prolog m) { 
        m.jtry4(null, FILE_reducer::unionv_2_4_var_1);
        return unionv_2_4_1(m);
    }

    private final static Operation unionv_2_4_var_1(Prolog m) { 
        m.trust(null);
        return unionv_2_4_2(m);
    }

    private final static Operation unionv_2_4_1(Prolog m) { 
    // unionv_2([],A,B,[A|B]):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // unionv_2([],A,B,[A|B]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        a4 = a4.dref();
        if (a4 .isCons()){
                        if (! a2.unify(a4.car(), m.trail))
                return m.fail();
            if (! a3.unify(a4.cdr(), m.trail))
                return m.fail();
        } else if (a4.isVar()){
             a4.bind(CONS(a2, a3), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation unionv_2_4_2(Prolog m) { 
    // unionv_2([A|B],C,D,E):-compare(F,C,A),unionv_3(F,C,D,A,B,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // unionv_2([A|B],C,D,E):-[compare(F,C,A),unionv_3(F,C,D,A,B,E)]
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
        a7 = m.mkvar1();
        return //
 Op("compare", FILE_builtins::PRED_compare_3_static_exec, VA(a7, a2, a5), //
 Op("unionv_3", FILE_reducer::PRED_unionv_3_6_static_exec, VA(a7, a2, a3, a5, a6, a4), cont));
    }
/** PREDICATE: unionv_3/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(unionv_3/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_unionv_3_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::unionv_3_6_var, fail_0, fail_0, FILE_reducer::unionv_3_6_var, fail_0, fail_0); 
    }

    private final static Operation unionv_3_6_var(Prolog m) { 
        m.jtry6(null, FILE_reducer::unionv_3_6_var_1);
        return unionv_3_6_1(m);
    }

    private final static Operation unionv_3_6_var_1(Prolog m) { 
        m.retry(null, FILE_reducer::unionv_3_6_var_2);
        return unionv_3_6_2(m);
    }

    private final static Operation unionv_3_6_var_2(Prolog m) { 
        m.trust(null);
        return unionv_3_6_3(m);
    }

    private final static Operation unionv_3_6_1(Prolog m) { 
    // unionv_3(<,A,B,C,D,[A|E]):-unionv_2(B,C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // unionv_3(<,A,B,C,D,[A|E]):-[unionv_2(B,C,D,E)]
        if (!  ATOM_$003C .unify(a1, m.trail))
            return m.fail();
        a6 = a6.dref();
        if (a6 .isCons()){
                        if (! a2.unify(a6.car(), m.trail))
                return m.fail();
            a7 = a6.cdr();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
             a6.bind(CONS(a2, a7), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("unionv_2", FILE_reducer::PRED_unionv_2_4_static_exec, VA(a3, a4, a5, a7), cont);
    }

    private final static Operation unionv_3_6_2(Prolog m) { 
    // unionv_3(=,A,B,C,D,[A|E]):-unionv(B,D,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // unionv_3(=,A,B,C,D,[A|E]):-[unionv(B,D,E)]
        if (!  ATOM_$003D .unify(a1, m.trail))
            return m.fail();
        a6 = a6.dref();
        if (a6 .isCons()){
                        if (! a2.unify(a6.car(), m.trail))
                return m.fail();
            a7 = a6.cdr();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
             a6.bind(CONS(a2, a7), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("unionv", FILE_reducer::PRED_unionv_3_static_exec, VA(a3, a5, a7), cont);
    }

    private final static Operation unionv_3_6_3(Prolog m) { 
    // unionv_3(>,A,B,C,D,[C|E]):-unionv_2(D,A,B,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // unionv_3(>,A,B,C,D,[C|E]):-[unionv_2(D,A,B,E)]
        if (!  ATOM_$003E .unify(a1, m.trail))
            return m.fail();
        a6 = a6.dref();
        if (a6 .isCons()){
                        if (! a4.unify(a6.car(), m.trail))
                return m.fail();
            a7 = a6.cdr();
        } else if (a6.isVar()){
            a7 = m.mkvar2();
             a6.bind(CONS(a4, a7), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("unionv_2", FILE_reducer::PRED_unionv_2_4_static_exec, VA(a5, a2, a3, a7), cont);
    }
/** PREDICATE: subsetv/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(subsetv/2,public)




    public static Operation PRED_subsetv_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::subsetv_2_var, fail_0, fail_0, FILE_reducer::subsetv_2_1, fail_0, FILE_reducer::subsetv_2_2); 
    }

    private final static Operation subsetv_2_var(Prolog m) { 
        m.jtry2(null, FILE_reducer::subsetv_2_var_1);
        return subsetv_2_1(m);
    }

    private final static Operation subsetv_2_var_1(Prolog m) { 
        m.trust(null);
        return subsetv_2_2(m);
    }

    private final static Operation subsetv_2_1(Prolog m) { 
    // subsetv([],A):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // subsetv([],A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation subsetv_2_2(Prolog m) { 
    // subsetv([A|B],[C|D]):-compare(E,A,C),subsetv_2(E,A,B,D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // subsetv([A|B],[C|D]):-[compare(E,A,C),subsetv_2(E,A,B,D)]
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
        a7 = m.mkvar1();
        return //
 Op("compare", FILE_builtins::PRED_compare_3_static_exec, VA(a7, a3, a5), //
 Op("subsetv_2", FILE_reducer::PRED_subsetv_2_4_static_exec, VA(a7, a3, a4, a6), cont));
    }
/** PREDICATE: subsetv_2/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(subsetv_2/4,public)




    public static Operation PRED_subsetv_2_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::subsetv_2_4_var, fail_0, fail_0, FILE_reducer::subsetv_2_4_var, fail_0, fail_0); 
    }

    private final static Operation subsetv_2_4_var(Prolog m) { 
        m.jtry4(null, FILE_reducer::subsetv_2_4_var_1);
        return subsetv_2_4_1(m);
    }

    private final static Operation subsetv_2_4_var_1(Prolog m) { 
        m.trust(null);
        return subsetv_2_4_2(m);
    }

    private final static Operation subsetv_2_4_1(Prolog m) { 
    // subsetv_2(=,A,B,C):-subsetv(B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // subsetv_2(=,A,B,C):-[subsetv(B,C)]
        if (!  ATOM_$003D .unify(a1, m.trail))
            return m.fail();
        return //
 Op("subsetv", FILE_reducer::PRED_subsetv_2_static_exec, VA(a3, a4), cont);
    }

    private final static Operation subsetv_2_4_2(Prolog m) { 
    // subsetv_2(>,A,B,C):-subsetv([A|B],C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // subsetv_2(>,A,B,C):-[subsetv([A|B],C)]
        if (!  ATOM_$003E .unify(a1, m.trail))
            return m.fail();
        a5 = CONS(a2, a3);
        return //
 Op("subsetv", FILE_reducer::PRED_subsetv_2_static_exec, VA(a5, a4), cont);
    }
/** PREDICATE: small_subsetv/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(small_subsetv/2,public)




    public static Operation PRED_small_subsetv_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::small_subsetv_2_var, fail_0, fail_0, FILE_reducer::small_subsetv_2_1, fail_0, FILE_reducer::small_subsetv_2_2); 
    }

    private final static Operation small_subsetv_2_var(Prolog m) { 
        m.jtry2(null, FILE_reducer::small_subsetv_2_var_1);
        return small_subsetv_2_1(m);
    }

    private final static Operation small_subsetv_2_var_1(Prolog m) { 
        m.trust(null);
        return small_subsetv_2_2(m);
    }

    private final static Operation small_subsetv_2_1(Prolog m) { 
    // small_subsetv([],A):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // small_subsetv([],A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation small_subsetv_2_2(Prolog m) { 
    // small_subsetv([A|B],C):-inv(A,C),small_subsetv(B,C)
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // small_subsetv([A|B],C):-[inv(A,C),small_subsetv(B,C)]
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
        return //
 Op("inv", FILE_reducer::PRED_inv_2_static_exec, VA(a3, a2), //
 Op("small_subsetv", FILE_reducer::PRED_small_subsetv_2_static_exec, VA(a4, a2), cont));
    }
/** PREDICATE: inv/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(inv/2,public)




    public static Operation PRED_inv_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // inv(A,[B|C]):-compare(D,A,B),inv_2(D,A,C)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // inv(A,[B|C]):-[compare(D,A,B),inv_2(D,A,C)]
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
 Op("inv_2", FILE_reducer::PRED_inv_2_3_static_exec, VA(a5, a1, a4), cont));
    }
/** PREDICATE: inv_2/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(inv_2/3,public)




    public static Operation PRED_inv_2_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::inv_2_3_var, fail_0, fail_0, FILE_reducer::inv_2_3_var, fail_0, fail_0); 
    }

    private final static Operation inv_2_3_var(Prolog m) { 
        m.jtry3(null, FILE_reducer::inv_2_3_var_1);
        return inv_2_3_1(m);
    }

    private final static Operation inv_2_3_var_1(Prolog m) { 
        m.trust(null);
        return inv_2_3_2(m);
    }

    private final static Operation inv_2_3_1(Prolog m) { 
    // inv_2(=,A,B):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // inv_2(=,A,B):-[]
        if (!  ATOM_$003D .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation inv_2_3_2(Prolog m) { 
    // inv_2(>,A,B):-inv(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // inv_2(>,A,B):-[inv(A,B)]
        if (!  ATOM_$003E .unify(a1, m.trail))
            return m.fail();
        return //
 Op("inv", FILE_reducer::PRED_inv_2_static_exec, VA(a2, a3), cont);
    }
/** PREDICATE: notinv/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(notinv/2,public)




    public static Operation PRED_notinv_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // notinv(A,B):-notinv_2(B,A)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // notinv(A,B):-[notinv_2(B,A)]
        return //
 Op("notinv_2", FILE_reducer::PRED_notinv_2_2_static_exec, VA(a2, a1), cont);
    }
/** PREDICATE: notinv_2/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(notinv_2/2,public)




    public static Operation PRED_notinv_2_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::notinv_2_2_var, fail_0, fail_0, FILE_reducer::notinv_2_2_1, fail_0, FILE_reducer::notinv_2_2_2); 
    }

    private final static Operation notinv_2_2_var(Prolog m) { 
        m.jtry2(null, FILE_reducer::notinv_2_2_var_1);
        return notinv_2_2_1(m);
    }

    private final static Operation notinv_2_2_var_1(Prolog m) { 
        m.trust(null);
        return notinv_2_2_2(m);
    }

    private final static Operation notinv_2_2_1(Prolog m) { 
    // notinv_2([],A):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // notinv_2([],A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation notinv_2_2_2(Prolog m) { 
    // notinv_2([A|B],C):-compare(D,C,A),notinv_3(D,C,B)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // notinv_2([A|B],C):-[compare(D,C,A),notinv_3(D,C,B)]
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
        a5 = m.mkvar1();
        return //
 Op("compare", FILE_builtins::PRED_compare_3_static_exec, VA(a5, a2, a3), //
 Op("notinv_3", FILE_reducer::PRED_notinv_3_3_static_exec, VA(a5, a2, a4), cont));
    }
/** PREDICATE: notinv_3/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl
*/
    // main(notinv_3/3,public)




    public static Operation PRED_notinv_3_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_reducer::notinv_3_3_var, fail_0, fail_0, FILE_reducer::notinv_3_3_var, fail_0, fail_0); 
    }

    private final static Operation notinv_3_3_var(Prolog m) { 
        m.jtry3(null, FILE_reducer::notinv_3_3_var_1);
        return notinv_3_3_1(m);
    }

    private final static Operation notinv_3_3_var_1(Prolog m) { 
        m.trust(null);
        return notinv_3_3_2(m);
    }

    private final static Operation notinv_3_3_1(Prolog m) { 
    // notinv_3(<,A,B):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // notinv_3(<,A,B):-[]
        if (!  ATOM_$003C .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation notinv_3_3_2(Prolog m) { 
    // notinv_3(>,A,B):-notinv_2(B,A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // notinv_3(>,A,B):-[notinv_2(B,A)]
        if (!  ATOM_$003E .unify(a1, m.trail))
            return m.fail();
        return //
 Op("notinv_2", FILE_reducer::PRED_notinv_2_2_static_exec, VA(a3, a2), cont);
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_reducer::PRED_top_0_static_exec);
   PredTable.registerBuiltin("try",2,FILE_reducer::PRED_try_2_static_exec);
   PredTable.registerBuiltin("end",1,FILE_reducer::PRED_end_1_static_exec);
   PredTable.registerBuiltin("list_functor_name",1,FILE_reducer::PRED_list_functor_name_1_static_exec);
   PredTable.registerBuiltin("t_def",3,FILE_reducer::PRED_t_def_3_static_exec);
   PredTable.registerBuiltin("t_reduce",2,FILE_reducer::PRED_t_reduce_2_static_exec);
   PredTable.registerBuiltin("t_append",4,FILE_reducer::PRED_t_append_4_static_exec);
   PredTable.registerBuiltin("t_redex",2,FILE_reducer::PRED_t_redex_2_static_exec);
   PredTable.registerBuiltin("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl","$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl",4,FILE_reducer::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_4_static_exec);
   PredTable.registerBuiltin("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl","$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl",3,FILE_reducer::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_3_static_exec);
   PredTable.registerBuiltin("eval",4,FILE_reducer::PRED_eval_4_static_exec);
   PredTable.registerBuiltin("eval1",3,FILE_reducer::PRED_eval1_3_static_exec);
   PredTable.registerBuiltin("relop",3,FILE_reducer::PRED_relop_3_static_exec);
   PredTable.registerBuiltin("t",3,FILE_reducer::PRED_t_3_static_exec);
   PredTable.registerBuiltin("t_argvars",3,FILE_reducer::PRED_t_argvars_3_static_exec);
   PredTable.registerBuiltin("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl","$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl",1,FILE_reducer::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_static_exec);
   PredTable.registerBuiltin("curry",2,FILE_reducer::PRED_curry_2_static_exec);
   PredTable.registerBuiltin("currylist",3,FILE_reducer::PRED_currylist_3_static_exec);
   PredTable.registerBuiltin("t_vars",2,FILE_reducer::PRED_t_vars_2_static_exec);
   PredTable.registerBuiltin("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl","$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl",2,FILE_reducer::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_2_static_exec);
   PredTable.registerBuiltin("t_trans",4,FILE_reducer::PRED_t_trans_4_static_exec);
   PredTable.registerBuiltin("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl","$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl",5,FILE_reducer::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_5_static_exec);
   PredTable.registerBuiltin("t_rule1",8,FILE_reducer::PRED_t_rule1_8_static_exec);
   PredTable.registerBuiltin("t_rule2",9,FILE_reducer::PRED_t_rule2_9_static_exec);
   PredTable.registerBuiltin("make_list",2,FILE_reducer::PRED_make_list_2_static_exec);
   PredTable.registerBuiltin("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/reducer.pl","$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl",1,FILE_reducer::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Freducer$002Epl_1_static_exec);
   PredTable.registerBuiltin("listify",2,FILE_reducer::PRED_listify_2_static_exec);
   PredTable.registerBuiltin("listify_list",4,FILE_reducer::PRED_listify_list_4_static_exec);
   PredTable.registerBuiltin("member",2,FILE_reducer::PRED_member_2_static_exec);
   PredTable.registerBuiltin("append",3,FILE_reducer::PRED_append_3_static_exec);
   PredTable.registerBuiltin("intersectv",3,FILE_reducer::PRED_intersectv_3_static_exec);
   PredTable.registerBuiltin("intersectv_2",4,FILE_reducer::PRED_intersectv_2_4_static_exec);
   PredTable.registerBuiltin("intersectv_3",6,FILE_reducer::PRED_intersectv_3_6_static_exec);
   PredTable.registerBuiltin("intersectv_list",2,FILE_reducer::PRED_intersectv_list_2_static_exec);
   PredTable.registerBuiltin("intersectv_list",3,FILE_reducer::PRED_intersectv_list_3_static_exec);
   PredTable.registerBuiltin("diffv",3,FILE_reducer::PRED_diffv_3_static_exec);
   PredTable.registerBuiltin("diffv_2",4,FILE_reducer::PRED_diffv_2_4_static_exec);
   PredTable.registerBuiltin("diffv_3",6,FILE_reducer::PRED_diffv_3_6_static_exec);
   PredTable.registerBuiltin("unionv",3,FILE_reducer::PRED_unionv_3_static_exec);
   PredTable.registerBuiltin("unionv_2",4,FILE_reducer::PRED_unionv_2_4_static_exec);
   PredTable.registerBuiltin("unionv_3",6,FILE_reducer::PRED_unionv_3_6_static_exec);
   PredTable.registerBuiltin("subsetv",2,FILE_reducer::PRED_subsetv_2_static_exec);
   PredTable.registerBuiltin("subsetv_2",4,FILE_reducer::PRED_subsetv_2_4_static_exec);
   PredTable.registerBuiltin("small_subsetv",2,FILE_reducer::PRED_small_subsetv_2_static_exec);
   PredTable.registerBuiltin("inv",2,FILE_reducer::PRED_inv_2_static_exec);
   PredTable.registerBuiltin("inv_2",3,FILE_reducer::PRED_inv_2_3_static_exec);
   PredTable.registerBuiltin("notinv",2,FILE_reducer::PRED_notinv_2_static_exec);
   PredTable.registerBuiltin("notinv_2",2,FILE_reducer::PRED_notinv_2_2_static_exec);
   PredTable.registerBuiltin("notinv_3",3,FILE_reducer::PRED_notinv_3_3_static_exec);
}
}

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
public class FILE_meta_qsort extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl
*/
    // main(top/0,public)




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-meta_qsort
        m.setB0();
    // top:-[meta_qsort]
        return //
 Op("meta_qsort", FILE_meta_qsort::PRED_meta_qsort_0_static_exec, VA(), cont);
    }
/** PREDICATE: meta_qsort/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl
*/
    // main(meta_qsort/0,public)
        final static Functor ATOM_qsort = SYM("qsort");




    public static Operation PRED_meta_qsort_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // meta_qsort:-interpret(qsort)
        m.setB0();
    // meta_qsort:-[interpret(qsort)]
        return //
 Op("interpret", FILE_meta_qsort::PRED_interpret_1_static_exec, VA( ATOM_qsort ), cont);
    }
/** PREDICATE: $dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl
*/
    // main('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'/1,public)




    public static Operation PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_meta_qsort::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_1_sub_1);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_1_1(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_1_2(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_1_1(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(A):-nonvar(A),!,interpret(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(A):-['$get_level'(B),nonvar(A),'$cut'(B),interpret(A)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of nonvar(a(1))
        a1 = a1.dref();
        if ((a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        return //
 Op("interpret", FILE_meta_qsort::PRED_interpret_1_static_exec, VA(a1), cont);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_1_2(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(A):-[]
        return cont;
    }
/** PREDICATE: interpret/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl
*/
    // main(interpret/1,public)




    public static Operation PRED_interpret_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // interpret(A):-interpret(A,B),'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(B)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // interpret(A):-[interpret(A,B),'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(B)]
        a2 = m.mkvar1();
        return //
 Op("interpret", FILE_meta_qsort::PRED_interpret_2_static_exec, VA(a1, a2), //
 Op("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl", FILE_meta_qsort::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_1_static_exec, VA(a2), cont));
    }
/** PREDICATE: interpret/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl
*/
    // main(interpret/2,public)
        final static Functor FUNCTOR_$002C_2 = F(",",2);
        final static Functor FUNCTOR_or_2 = F(";",2);
        final static Functor FUNCTOR_$002D$003E_2 = F("->",2);
        final static Functor ATOM_fail = SYM("fail");
        final static Functor FUNCTOR_$005C$002B_1 = F("\\+",1);
        final static Functor ATOM_$0021 = SYM("!");




    public static Operation PRED_interpret_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return interpret_2_top(m);
    }

    private final static Operation interpret_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_meta_qsort::interpret_2_var, FILE_meta_qsort::interpret_2_int, FILE_meta_qsort::interpret_2_int, FILE_meta_qsort::interpret_2_con, FILE_meta_qsort::interpret_2_str, FILE_meta_qsort::interpret_2_int); 
    }

    private final static Operation interpret_2_var(Prolog m) { 
        m.jtry2(null, FILE_meta_qsort::interpret_2_var_1);
        return interpret_2_1(m);
    }

    private final static Operation interpret_2_var_1(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_var_2);
        return interpret_2_2(m);
    }

    private final static Operation interpret_2_var_2(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_var_3);
        return interpret_2_3(m);
    }

    private final static Operation interpret_2_var_3(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_var_4);
        return interpret_2_4(m);
    }

    private final static Operation interpret_2_var_4(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_var_5);
        return interpret_2_5(m);
    }

    private final static Operation interpret_2_var_5(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_var_6);
        return interpret_2_6(m);
    }

    private final static Operation interpret_2_var_6(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_var_7);
        return interpret_2_7(m);
    }

    private final static Operation interpret_2_var_7(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_var_8);
        return interpret_2_8(m);
    }

    private final static Operation interpret_2_var_8(Prolog m) { 
        m.trust(null);
        return interpret_2_9(m);
    }

    private final static Operation interpret_2_int(Prolog m) { 
        m.jtry2(null, FILE_meta_qsort::interpret_2_int_1);
        return interpret_2_1(m);
    }

    private final static Operation interpret_2_int_1(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_int_2);
        return interpret_2_7(m);
    }

    private final static Operation interpret_2_int_2(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_int_3);
        return interpret_2_8(m);
    }

    private final static Operation interpret_2_int_3(Prolog m) { 
        m.trust(null);
        return interpret_2_9(m);
    }

    private final static Operation interpret_2_con(Prolog m) { 
        m.jtry2(null, FILE_meta_qsort::interpret_2_con_1);
        return interpret_2_1(m);
    }

    private final static Operation interpret_2_con_1(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_con_2);
        return interpret_2_6(m);
    }

    private final static Operation interpret_2_con_2(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_con_3);
        return interpret_2_7(m);
    }

    private final static Operation interpret_2_con_3(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_con_4);
        return interpret_2_8(m);
    }

    private final static Operation interpret_2_con_4(Prolog m) { 
        m.trust(null);
        return interpret_2_9(m);
    }

    private final static Operation interpret_2_str(Prolog m) { 
        m.jtry2(null, FILE_meta_qsort::interpret_2_str_1);
        return interpret_2_1(m);
    }

    private final static Operation interpret_2_str_1(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_str_2);
        return interpret_2_2(m);
    }

    private final static Operation interpret_2_str_2(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_str_3);
        return interpret_2_3(m);
    }

    private final static Operation interpret_2_str_3(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_str_4);
        return interpret_2_4(m);
    }

    private final static Operation interpret_2_str_4(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_str_5);
        return interpret_2_5(m);
    }

    private final static Operation interpret_2_str_5(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_str_6);
        return interpret_2_7(m);
    }

    private final static Operation interpret_2_str_6(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_2_str_7);
        return interpret_2_8(m);
    }

    private final static Operation interpret_2_str_7(Prolog m) { 
        m.trust(null);
        return interpret_2_9(m);
    }

    private final static Operation interpret_2_1(Prolog m) { 
    // interpret(A,B):-var(A),!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // interpret(A,B):-['$get_level'(C),var(A),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation interpret_2_2(Prolog m) { 
    // interpret((A,B),C):-!,interpret(A,D),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(B,C,D)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // interpret((A,B),C):-['$neck_cut',interpret(A,D),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(B,C,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002C_2 , m.trail, a3, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a5 = m.mkvar1();
        p1 = //
 Op("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl", FILE_meta_qsort::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_static_exec, VA(a4, a2, a5), cont);
        m.AREGS[0] = a3;
        m.AREGS[1] = a5;
        m.cont = p1;
        return interpret_2_top(m);
    }

    private final static Operation interpret_2_3(Prolog m) { 
    // interpret((A;B),C):-!,interpret_disjunction(A,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // interpret((A;B),C):-['$neck_cut',interpret_disjunction(A,B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_or_2 , m.trail, a3, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("interpret_disjunction", FILE_meta_qsort::PRED_interpret_disjunction_3_static_exec, VA(a3, a4, a2), cont);
    }

    private final static Operation interpret_2_4(Prolog m) { 
    // interpret((A->B),C):-!,interpret_disjunction((A->B),fail,C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // interpret((A->B),C):-['$neck_cut',interpret_disjunction((A->B),fail,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a3, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_$002D$003E_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002D$003E_2 , a3, a4);
 ;
        return //
 Op("interpret_disjunction", FILE_meta_qsort::PRED_interpret_disjunction_3_static_exec, VA(a5,  ATOM_fail , a2), cont);
    }

    private final static Operation interpret_2_5(Prolog m) { 
    // interpret(\+A,B):-!,interpret_disjunction((A->fail),true,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // interpret(\+A,B):-['$neck_cut',interpret_disjunction((A->fail),true,B)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$005C$002B_1 , m.trail, a3)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(3),@('ATOM_fail')],y(1)),put_str(@('FUNCTOR_$002D$003E_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$002D$003E_2 , a3,  ATOM_fail );
 ;
        return //
 Op("interpret_disjunction", FILE_meta_qsort::PRED_interpret_disjunction_3_static_exec, VA(a4,  Prolog.True , a2), cont);
    }

    private final static Operation interpret_2_6(Prolog m) { 
    // interpret(!,true):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // interpret(!,true):-['$neck_cut']
        if (!  ATOM_$0021 .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.True .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation interpret_2_7(Prolog m) { 
    // interpret(A,B):-number(A),!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // interpret(A,B):-['$get_level'(C),number(A),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of number(a(1))
        a1 = a1.dref();
        if (! a1.isNumber()) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation interpret_2_8(Prolog m) { 
    // interpret(A,B):-is_built_in(A),!,interpret_built_in(A)
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // interpret(A,B):-['$get_level'(C),is_built_in(A),'$cut'(C),interpret_built_in(A)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_built_in", FILE_meta_qsort::PRED_is_built_in_1_static_exec, VA(a1), //
 Op("$cut", FILE_meta_qsort::PRED_$cut_1_static_exec, VA(a3), //
 Op("interpret_built_in", FILE_meta_qsort::PRED_interpret_built_in_1_static_exec, VA(a1), cont)));
    }

    private final static Operation interpret_2_9(Prolog m) { 
    // interpret(A,B):-define(A,C),interpret(C)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // interpret(A,B):-[define(A,C),interpret(C)]
        a3 = m.mkvar1();
        return //
 Op("define", FILE_meta_qsort::PRED_define_2_static_exec, VA(a1, a3), //
 Op("interpret", FILE_meta_qsort::PRED_interpret_1_static_exec, VA(a3), cont));
    }
/** PREDICATE: $dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl
*/
    // main('$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'/3,public)




    public static Operation PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_meta_qsort::$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_sub_1);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_1(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_2(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_1(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(A,B,C):-nonvar(C),!,B=(C,A)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(A,B,C):-['$get_level'(D),nonvar(C),'$cut'(D),'$unify'(B,(C,A))]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of nonvar(a(3))
        a3 = a3.dref();
        if ((a3 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
    // put_str_args([a(3),a(1)],y(1)),put_str(@('FUNCTOR_$002C_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002C_2 , a3, a1);
 ;
        //START inline expansion of $unify(a(2),a(5))
        if (! a2.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_2(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(A,B,C):-interpret(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(A,B,C):-[interpret(A,B)]
        return //
 Op("interpret", FILE_meta_qsort::PRED_interpret_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: $dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl
*/
    // main('$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'/3,public)




    public static Operation PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_meta_qsort::$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_sub_1);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_1(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_2(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_1(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(A,B,C):-nonvar(C),!,B=(C->A)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(A,B,C):-['$get_level'(D),nonvar(C),'$cut'(D),'$unify'(B,(C->A))]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of nonvar(a(3))
        a3 = a3.dref();
        if ((a3 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
    // put_str_args([a(3),a(1)],y(1)),put_str(@('FUNCTOR_$002D$003E_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002D$003E_2 , a3, a1);
 ;
        //START inline expansion of $unify(a(2),a(5))
        if (! a2.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_2(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(A,B,C):-interpret(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(A,B,C):-[interpret(A,B)]
        return //
 Op("interpret", FILE_meta_qsort::PRED_interpret_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: interpret_disjunction/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl
*/
    // main(interpret_disjunction/3,public)




    public static Operation PRED_interpret_disjunction_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_meta_qsort::interpret_disjunction_3_var, FILE_meta_qsort::interpret_disjunction_3_int, FILE_meta_qsort::interpret_disjunction_3_int, FILE_meta_qsort::interpret_disjunction_3_int, FILE_meta_qsort::interpret_disjunction_3_var, FILE_meta_qsort::interpret_disjunction_3_int); 
    }

    private final static Operation interpret_disjunction_3_var(Prolog m) { 
        m.jtry3(null, FILE_meta_qsort::interpret_disjunction_3_var_1);
        return interpret_disjunction_3_1(m);
    }

    private final static Operation interpret_disjunction_3_var_1(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_disjunction_3_var_2);
        return interpret_disjunction_3_2(m);
    }

    private final static Operation interpret_disjunction_3_var_2(Prolog m) { 
        m.retry(null, FILE_meta_qsort::interpret_disjunction_3_var_3);
        return interpret_disjunction_3_3(m);
    }

    private final static Operation interpret_disjunction_3_var_3(Prolog m) { 
        m.trust(null);
        return interpret_disjunction_3_4(m);
    }

    private final static Operation interpret_disjunction_3_int(Prolog m) { 
        m.jtry3(null, FILE_meta_qsort::interpret_disjunction_3_int_1);
        return interpret_disjunction_3_3(m);
    }

    private final static Operation interpret_disjunction_3_int_1(Prolog m) { 
        m.trust(null);
        return interpret_disjunction_3_4(m);
    }

    private final static Operation interpret_disjunction_3_1(Prolog m) { 
    // interpret_disjunction((A->B),C,D):-interpret(A,E),!,'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(B,D,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // interpret_disjunction((A->B),C,D):-['$get_level'(E),interpret(A,F),'$cut'(E),'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl'(B,D,F)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        return //
 Op("interpret", FILE_meta_qsort::PRED_interpret_2_static_exec, VA(a4, a7), //
 Op("$cut", FILE_meta_qsort::PRED_$cut_1_static_exec, VA(a6), //
 Op("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl", FILE_meta_qsort::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_static_exec, VA(a5, a3, a7), cont)));
    }

    private final static Operation interpret_disjunction_3_2(Prolog m) { 
    // interpret_disjunction((A->B),C,D):-!,interpret(C,D)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // interpret_disjunction((A->B),C,D):-['$neck_cut',interpret(C,D)]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$002D$003E_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("interpret", FILE_meta_qsort::PRED_interpret_2_static_exec, VA(a2, a3), cont);
    }

    private final static Operation interpret_disjunction_3_3(Prolog m) { 
    // interpret_disjunction(A,B,C):-interpret(A,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // interpret_disjunction(A,B,C):-[interpret(A,C)]
        return //
 Op("interpret", FILE_meta_qsort::PRED_interpret_2_static_exec, VA(a1, a3), cont);
    }

    private final static Operation interpret_disjunction_3_4(Prolog m) { 
    // interpret_disjunction(A,B,C):-interpret(B,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // interpret_disjunction(A,B,C):-[interpret(B,C)]
        return //
 Op("interpret", FILE_meta_qsort::PRED_interpret_2_static_exec, VA(a2, a3), cont);
    }
/** PREDICATE: is_built_in/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl
*/
    // main(is_built_in/1,public)
        final static Functor FUNCTOR_$003D$003C_2 = F("=<",2);




    public static Operation PRED_is_built_in_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_meta_qsort::is_built_in_1_var, fail_0, fail_0, FILE_meta_qsort::is_built_in_1_1, FILE_meta_qsort::is_built_in_1_2, fail_0); 
    }

    private final static Operation is_built_in_1_var(Prolog m) { 
        m.jtry1(null, FILE_meta_qsort::is_built_in_1_var_1);
        return is_built_in_1_1(m);
    }

    private final static Operation is_built_in_1_var_1(Prolog m) { 
        m.trust(null);
        return is_built_in_1_2(m);
    }

    private final static Operation is_built_in_1_1(Prolog m) { 
    // is_built_in(true):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_built_in(true):-[]
        if (!  Prolog.True .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation is_built_in_1_2(Prolog m) { 
    // is_built_in(A=<B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_built_in(A=<B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$003D$003C_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: interpret_built_in/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl
*/
    // main(interpret_built_in/1,public)




    public static Operation PRED_interpret_built_in_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_meta_qsort::interpret_built_in_1_var, fail_0, fail_0, FILE_meta_qsort::interpret_built_in_1_1, FILE_meta_qsort::interpret_built_in_1_2, fail_0); 
    }

    private final static Operation interpret_built_in_1_var(Prolog m) { 
        m.jtry1(null, FILE_meta_qsort::interpret_built_in_1_var_1);
        return interpret_built_in_1_1(m);
    }

    private final static Operation interpret_built_in_1_var_1(Prolog m) { 
        m.trust(null);
        return interpret_built_in_1_2(m);
    }

    private final static Operation interpret_built_in_1_1(Prolog m) { 
    // interpret_built_in(true):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // interpret_built_in(true):-[]
        if (!  Prolog.True .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation interpret_built_in_1_2(Prolog m) { 
    // interpret_built_in(A=<B):-A=<B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // interpret_built_in(A=<B):-['$less_or_equal'(A,B)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003D$003C_2 , m.trail, a2, a3)){
                return m.fail();
            }
        //START inline expansion of $less_or_equal(a(2),a(3))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) > 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: define/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl
*/
    // main(define/2,public)
        final static Functor FUNCTOR_qsort_3 = F("qsort",3);
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
    private static final Compound L_define_2_s45 = CONS( int_8 ,  Prolog.Nil );
    private static final Compound L_define_2_s46 = CONS( int_59 , L_define_2_s45);
    private static final Compound L_define_2_s47 = CONS( int_53 , L_define_2_s46);
    private static final Compound L_define_2_s48 = CONS( int_40 , L_define_2_s47);
    private static final Compound L_define_2_s49 = CONS( int_92 , L_define_2_s48);
    private static final Compound L_define_2_s50 = CONS( int_18 , L_define_2_s49);
    private static final Compound L_define_2_s51 = CONS( int_74 , L_define_2_s50);
    private static final Compound L_define_2_s52 = CONS( int_61 , L_define_2_s51);
    private static final Compound L_define_2_s53 = CONS( int_28 , L_define_2_s52);
    private static final Compound L_define_2_s54 = CONS( int_11 , L_define_2_s53);
    private static final Compound L_define_2_s55 = CONS( int_99 , L_define_2_s54);
    private static final Compound L_define_2_s56 = CONS( int_95 , L_define_2_s55);
    private static final Compound L_define_2_s57 = CONS( int_4 , L_define_2_s56);
    private static final Compound L_define_2_s58 = CONS( int_75 , L_define_2_s57);
    private static final Compound L_define_2_s59 = CONS( int_63 , L_define_2_s58);
    private static final Compound L_define_2_s60 = CONS( int_31 , L_define_2_s59);
    private static final Compound L_define_2_s61 = CONS( int_27 , L_define_2_s60);
    private static final Compound L_define_2_s62 = CONS( int_85 , L_define_2_s61);
    private static final Compound L_define_2_s63 = CONS( int_21 , L_define_2_s62);
    private static final Compound L_define_2_s64 = CONS( int_7 , L_define_2_s63);
    private static final Compound L_define_2_s65 = CONS( int_51 , L_define_2_s64);
    private static final Compound L_define_2_s66 = CONS( int_66 , L_define_2_s65);
    private static final Compound L_define_2_s67 = CONS( int_0 , L_define_2_s66);
    private static final Compound L_define_2_s68 = CONS( int_10 , L_define_2_s67);
    private static final Compound L_define_2_s69 = CONS( int_37 , L_define_2_s68);
    private static final Compound L_define_2_s70 = CONS( int_90 , L_define_2_s69);
    private static final Compound L_define_2_s71 = CONS( int_81 , L_define_2_s70);
    private static final Compound L_define_2_s72 = CONS( int_39 , L_define_2_s71);
    private static final Compound L_define_2_s73 = CONS( int_29 , L_define_2_s72);
    private static final Compound L_define_2_s74 = CONS( int_55 , L_define_2_s73);
    private static final Compound L_define_2_s75 = CONS( int_11 , L_define_2_s74);
    private static final Compound L_define_2_s76 = CONS( int_6 , L_define_2_s75);
    private static final Compound L_define_2_s77 = CONS( int_82 , L_define_2_s76);
    private static final Compound L_define_2_s78 = CONS( int_28 , L_define_2_s77);
    private static final Compound L_define_2_s79 = CONS( int_47 , L_define_2_s78);
    private static final Compound L_define_2_s80 = CONS( int_99 , L_define_2_s79);
    private static final Compound L_define_2_s81 = CONS( int_85 , L_define_2_s80);
    private static final Compound L_define_2_s82 = CONS( int_28 , L_define_2_s81);
    private static final Compound L_define_2_s83 = CONS( int_53 , L_define_2_s82);
    private static final Compound L_define_2_s84 = CONS( int_32 , L_define_2_s83);
    private static final Compound L_define_2_s85 = CONS( int_2 , L_define_2_s84);
    private static final Compound L_define_2_s86 = CONS( int_65 , L_define_2_s85);
    private static final Compound L_define_2_s87 = CONS( int_83 , L_define_2_s86);
    private static final Compound L_define_2_s88 = CONS( int_46 , L_define_2_s87);
    private static final Compound L_define_2_s89 = CONS( int_18 , L_define_2_s88);
    private static final Compound L_define_2_s90 = CONS( int_94 , L_define_2_s89);
    private static final Compound L_define_2_s91 = CONS( int_33 , L_define_2_s90);
    private static final Compound L_define_2_s92 = CONS( int_17 , L_define_2_s91);
    private static final Compound L_define_2_s93 = CONS( int_74 , L_define_2_s92);
    private static final Compound L_define_2_s94 = CONS( int_27 , L_define_2_s93);
        final static Functor FUNCTOR_partition_4 = F("partition",4);




    public static Operation PRED_define_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_meta_qsort::define_2_var, fail_0, fail_0, FILE_meta_qsort::define_2_1, FILE_meta_qsort::define_2_str, fail_0); 
    }

    private final static Operation define_2_var(Prolog m) { 
        m.jtry2(null, FILE_meta_qsort::define_2_var_1);
        return define_2_1(m);
    }

    private final static Operation define_2_var_1(Prolog m) { 
        m.retry(null, FILE_meta_qsort::define_2_var_2);
        return define_2_2(m);
    }

    private final static Operation define_2_var_2(Prolog m) { 
        m.retry(null, FILE_meta_qsort::define_2_var_3);
        return define_2_3(m);
    }

    private final static Operation define_2_var_3(Prolog m) { 
        m.retry(null, FILE_meta_qsort::define_2_var_4);
        return define_2_4(m);
    }

    private final static Operation define_2_var_4(Prolog m) { 
        m.retry(null, FILE_meta_qsort::define_2_var_5);
        return define_2_5(m);
    }

    private final static Operation define_2_var_5(Prolog m) { 
        m.trust(null);
        return define_2_6(m);
    }

    private final static Operation define_2_str(Prolog m) { 
        m.jtry2(null, FILE_meta_qsort::define_2_str_1);
        return define_2_2(m);
    }

    private final static Operation define_2_str_1(Prolog m) { 
        m.retry(null, FILE_meta_qsort::define_2_str_2);
        return define_2_3(m);
    }

    private final static Operation define_2_str_2(Prolog m) { 
        m.retry(null, FILE_meta_qsort::define_2_str_3);
        return define_2_4(m);
    }

    private final static Operation define_2_str_3(Prolog m) { 
        m.retry(null, FILE_meta_qsort::define_2_str_4);
        return define_2_5(m);
    }

    private final static Operation define_2_str_4(Prolog m) { 
        m.trust(null);
        return define_2_6(m);
    }

    private final static Operation define_2_1(Prolog m) { 
    // define(qsort,qsort([27,74,17,33,94,18,46,83,65,2,32,53,28,85,99,47,28,82,6,11,55,29,39,81,90,37,10,0,66,51,7,21,85,27,31,63,75,4,95,99,11,28,61,74,18,92,40,53,59,8],A,[])):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // define(qsort,qsort([27,74,17,33,94,18,46,83,65,2,32,53,28,85,99,47,28,82,6,11,55,29,39,81,90,37,10,0,66,51,7,21,85,27,31,63,75,4,95,99,11,28,61,74,18,92,40,53,59,8],A,[])):-[]
        if (!  ATOM_qsort .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_qsort_3 , m.trail, L_define_2_s94, m.DONT_CARE1(),  Prolog.Nil )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation define_2_2(Prolog m) { 
    // define(qsort([A|B],C,D),(partition(B,A,E,F),qsort(F,G,D),qsort(E,C,[A|G]))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // define(qsort([A|B],C,D),(partition(B,A,E,F),qsort(F,G,D),qsort(E,C,[A|G]))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_qsort_3 , m.trail, a3, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
        if (a3 .isCons()){
                        a6 = a3.car();
            a7 = a3.cdr();
        } else if (a3.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a3.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002C_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a8 = a8.dref();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_partition_4 , m.trail, a7, a6, a10, a11)){
                return m.fail();
            }
        a9 = a9.dref();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_$002C_2 , m.trail, a12, a13)){
                return m.fail();
            }
        a12 = a12.dref();
            a14 = m.mkvar2();
            if (!a12.unifyS( FUNCTOR_qsort_3 , m.trail, a11, a14, a5)){
                return m.fail();
            }
        a13 = a13.dref();
            a15 = m.mkvar2();
            if (!a13.unifyS( FUNCTOR_qsort_3 , m.trail, a10, a4, a15)){
                return m.fail();
            }
        a15 = a15.dref();
        if (a15 .isCons()){
                        if (! a6.unify(a15.car(), m.trail))
                return m.fail();
            if (! a14.unify(a15.cdr(), m.trail))
                return m.fail();
        } else if (a15.isVar()){
             a15.bind(CONS(a6, a14), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation define_2_3(Prolog m) { 
    // define(qsort([],A,A),true):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // define(qsort([],A,A),true):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_qsort_3 , m.trail,  Prolog.Nil , a3, a3)){
                return m.fail();
            }
        if (!  Prolog.True .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation define_2_4(Prolog m) { 
    // define(partition([A|B],C,[A|D],E),(A=<C,!,partition(B,C,D,E))):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // define(partition([A|B],C,[A|D],E),(A=<C,!,partition(B,C,D,E))):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_partition_4 , m.trail, a3, a4, a5, a6)){
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
        a5 = a5.dref();
        if (a5 .isCons()){
                        if (! a7.unify(a5.car(), m.trail))
                return m.fail();
            a9 = a5.cdr();
        } else if (a5.isVar()){
            a9 = m.mkvar2();
             a5.bind(CONS(a7, a9), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002C_2 , m.trail, a10, a11)){
                return m.fail();
            }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_$003D$003C_2 , m.trail, a7, a4)){
                return m.fail();
            }
        a11 = a11.dref();
            a12 = m.mkvar2();
            if (!a11.unifyS( FUNCTOR_$002C_2 , m.trail,  ATOM_$0021 , a12)){
                return m.fail();
            }
        a12 = a12.dref();
            if (!a12.unifyS( FUNCTOR_partition_4 , m.trail, a8, a4, a9, a6)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation define_2_5(Prolog m) { 
    // define(partition([A|B],C,D,[A|E]),partition(B,C,D,E)):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // define(partition([A|B],C,D,[A|E]),partition(B,C,D,E)):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_partition_4 , m.trail, a3, a4, a5, a6)){
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
        a6 = a6.dref();
        if (a6 .isCons()){
                        if (! a7.unify(a6.car(), m.trail))
                return m.fail();
            a9 = a6.cdr();
        } else if (a6.isVar()){
            a9 = m.mkvar2();
             a6.bind(CONS(a7, a9), m.trail);
        } else {
            return m.fail();
        }
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_partition_4 , m.trail, a8, a4, a5, a9)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation define_2_6(Prolog m) { 
    // define(partition([],A,[],[]),true):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // define(partition([],A,[],[]),true):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_partition_4 , m.trail,  Prolog.Nil , m.DONT_CARE1(),  Prolog.Nil ,  Prolog.Nil )){
                return m.fail();
            }
        if (!  Prolog.True .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_meta_qsort::PRED_top_0_static_exec);
   PredTable.registerBuiltin("meta_qsort",0,FILE_meta_qsort::PRED_meta_qsort_0_static_exec);
   PredTable.registerBuiltin("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl","$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl",1,FILE_meta_qsort::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_1_static_exec);
   PredTable.registerBuiltin("interpret",1,FILE_meta_qsort::PRED_interpret_1_static_exec);
   PredTable.registerBuiltin("interpret",2,FILE_meta_qsort::PRED_interpret_2_static_exec);
   PredTable.registerBuiltin("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl","$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl",3,FILE_meta_qsort::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/meta_qsort.pl","$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl",3,FILE_meta_qsort::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fmeta_qsort$002Epl_3_static_exec);
   PredTable.registerBuiltin("interpret_disjunction",3,FILE_meta_qsort::PRED_interpret_disjunction_3_static_exec);
   PredTable.registerBuiltin("is_built_in",1,FILE_meta_qsort::PRED_is_built_in_1_static_exec);
   PredTable.registerBuiltin("interpret_built_in",1,FILE_meta_qsort::PRED_interpret_built_in_1_static_exec);
   PredTable.registerBuiltin("define",2,FILE_meta_qsort::PRED_define_2_static_exec);
}
}

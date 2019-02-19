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
public class FILE_cafeteria extends FILE_builtins {
/** PREDICATE: cafeteria/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(cafeteria/0,public)
        final static Functor ATOM_error = SYM("error");
        final static Functor ATOM_end_of_file = SYM("end_of_file");
        final static Functor ATOM_bye = SYM("bye");




    public static Operation PRED_cafeteria_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // cafeteria:-'$cafeteria_init',repeat,'$toplvel_loop',on_exception(A,'$cafeteria'(B),print_message(error,A)),B==end_of_file,!,nl,'$fast_write'(bye),nl
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3, p4, p5, p6, p7, p8;
    // cafeteria:-['$get_level'(A),'$cafeteria_init',repeat,'$toplvel_loop',on_exception(B,'SxxMachine':'$cafeteria'(C),'SxxMachine':print_message(error,B)),'$equality_of_term'(C,end_of_file),'$cut'(A),nl,'$fast_write'(bye),nl]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        a4 = Closure( //
 Op("$cafeteria", FILE_system::PRED_$cafeteria_1_static_exec, VA(a3), null));
        a5 = Closure( //
 Op("print_message", FILE_system::PRED_print_message_2_static_exec, VA( ATOM_error , a2), null));
        return //
 Op("$cafeteria_init", FILE_system::PRED_$cafeteria_init_0_static_exec, VA(), //
 Op("repeat", FILE_system::PRED_repeat_0_static_exec, VA(), //
 Op("$toplvel_loop", FILE_system::PRED_$toplvel_loop_0_static_exec, VA(), //
 Op("on_exception", FILE_system::PRED_on_exception_3_static_exec, VA(a2, a4, a5), //
 Op("$equality_of_term", FILE_system::PRED_$equality_of_term_2_static_exec, VA(a3,  ATOM_end_of_file ), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a1), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_bye ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), cont)))))))));
    }
/** PREDICATE: $cafeteria_init/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$cafeteria_init'/0,non-(public))
        final static Functor ATOM_SxxMachine = SYM("SxxMachine");
        final static Functor FUNCTOR_$002F_2 = F("/",2);
        final static Functor ATOM_$0024leap_flag = SYM("$leap_flag");
    private static final Compound L_$cafeteria_init_0_s6 = S( FUNCTOR_$002F_2 ,  ATOM_$0024leap_flag ,  int_1 );
        final static Functor ATOM_$0024current_spypoint = SYM("$current_spypoint");
    private static final Compound L_$cafeteria_init_0_s10 = S( FUNCTOR_$002F_2 ,  ATOM_$0024current_spypoint ,  int_3 );
        final static Functor ATOM_$0024current_leash = SYM("$current_leash");
    private static final Compound L_$cafeteria_init_0_s13 = S( FUNCTOR_$002F_2 ,  ATOM_$0024current_leash ,  int_1 );
        final static Functor FUNCTOR_module_colon_2 = F(":",2);
        final static Functor FUNCTOR_$0024leap_flag_1 = F("$leap_flag",1);
        final static Functor FUNCTOR_$0024current_leash_1 = F("$current_leash",1);
        final static Functor FUNCTOR_$0024current_spypoint_3 = F("$current_spypoint",3);
        final static Functor FUNCTOR_$0024consulted_file_1 = F("$consulted_file",1);
        final static Functor FUNCTOR_$0024consulted_package_1 = F("$consulted_package",1);
        final static Functor FUNCTOR_$0024consulted_predicate_3 = F("$consulted_predicate",3);
        final static Functor ATOM_no = SYM("no");
    private static final Compound L_$cafeteria_init_0_s23 = S( FUNCTOR_$0024leap_flag_1 ,  ATOM_no );
    private static final Compound L_$cafeteria_init_0_s25 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$cafeteria_init_0_s23);
        final static Functor ATOM_call = SYM("call");
    private static final Compound L_$cafeteria_init_0_s28 = S( FUNCTOR_$0024current_leash_1 ,  ATOM_call );
    private static final Compound L_$cafeteria_init_0_s30 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$cafeteria_init_0_s28);
        final static Functor ATOM_exit = SYM("exit");
    private static final Compound L_$cafeteria_init_0_s33 = S( FUNCTOR_$0024current_leash_1 ,  ATOM_exit );
    private static final Compound L_$cafeteria_init_0_s35 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$cafeteria_init_0_s33);
        final static Functor ATOM_redo = SYM("redo");
    private static final Compound L_$cafeteria_init_0_s38 = S( FUNCTOR_$0024current_leash_1 ,  ATOM_redo );
    private static final Compound L_$cafeteria_init_0_s40 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$cafeteria_init_0_s38);
        final static Functor ATOM_fail = SYM("fail");
    private static final Compound L_$cafeteria_init_0_s43 = S( FUNCTOR_$0024current_leash_1 ,  ATOM_fail );
    private static final Compound L_$cafeteria_init_0_s45 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$cafeteria_init_0_s43);




    public static Operation PRED_$cafeteria_init_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$cafeteria_init':-'$new_indexing_hash'('SxxMachine','$leap_flag'/1,A),'$new_indexing_hash'('SxxMachine','$current_spypoint'/3,B),'$new_indexing_hash'('SxxMachine','$current_leash'/1,C),retractall('$leap_flag'(D)),retractall('$current_leash'(E)),retractall('$current_spypoint'(F,G,H)),retractall('$consulted_file'(I)),retractall('$consulted_package'(J)),retractall('$consulted_predicate'(K,L,M)),assertz('$leap_flag'(no)),assertz('$current_leash'(call)),assertz('$current_leash'(exit)),assertz('$current_leash'(redo)),assertz('$current_leash'(fail)),!
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14;
    // '$cafeteria_init':-['$get_level'(A),'$new_indexing_hash'('SxxMachine','$leap_flag'/1,B),'$new_indexing_hash'('SxxMachine','$current_spypoint'/3,C),'$new_indexing_hash'('SxxMachine','$current_leash'/1,D),retractall('SxxMachine':'$leap_flag'(E)),retractall('SxxMachine':'$current_leash'(F)),retractall('SxxMachine':'$current_spypoint'(G,H,I)),retractall('SxxMachine':'$consulted_file'(J)),retractall('SxxMachine':'$consulted_package'(K)),retractall('SxxMachine':'$consulted_predicate'(L,M,N)),assertz('SxxMachine':'$leap_flag'(no)),assertz('SxxMachine':'$current_leash'(call)),assertz('SxxMachine':'$current_leash'(exit)),assertz('SxxMachine':'$current_leash'(redo)),assertz('SxxMachine':'$current_leash'(fail)),'$cut'(A)]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_$0024leap_flag_1'),y(1),a(2))
        a2 =  S( FUNCTOR_$0024leap_flag_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
    // put_str_args([void],y(3)),put_str(@('FUNCTOR_$0024current_leash_1'),y(3),a(4))
        a4 =  S( FUNCTOR_$0024current_leash_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
    // put_str_args([void,void,void],y(5)),put_str(@('FUNCTOR_$0024current_spypoint_3'),y(5),a(6))
        a6 =  S( FUNCTOR_$0024current_spypoint_3 , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(6)],y(6)),put_str(@('FUNCTOR_module_colon_2'),y(6),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a6);
 ;
    // put_str_args([void],y(7)),put_str(@('FUNCTOR_$0024consulted_file_1'),y(7),a(8))
        a8 =  S( FUNCTOR_$0024consulted_file_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(8)],y(8)),put_str(@('FUNCTOR_module_colon_2'),y(8),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a8);
 ;
    // put_str_args([void],y(9)),put_str(@('FUNCTOR_$0024consulted_package_1'),y(9),a(10))
        a10 =  S( FUNCTOR_$0024consulted_package_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(10)],y(10)),put_str(@('FUNCTOR_module_colon_2'),y(10),a(11))
        a11 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a10);
 ;
    // put_str_args([void,void,void],y(11)),put_str(@('FUNCTOR_$0024consulted_predicate_3'),y(11),a(12))
        a12 =  S( FUNCTOR_$0024consulted_predicate_3 , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(12)],y(12)),put_str(@('FUNCTOR_module_colon_2'),y(12),a(13))
        a13 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a12);
 ;
        return //
 Op("$new_indexing_hash", FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_SxxMachine , L_$cafeteria_init_0_s6, m.DONT_CARE2()), //
 Op("$new_indexing_hash", FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_SxxMachine , L_$cafeteria_init_0_s10, m.DONT_CARE2()), //
 Op("$new_indexing_hash", FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_SxxMachine , L_$cafeteria_init_0_s13, m.DONT_CARE2()), //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a3), //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a5), //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a7), //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a9), //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a11), //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a13), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$cafeteria_init_0_s25), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$cafeteria_init_0_s30), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$cafeteria_init_0_s35), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$cafeteria_init_0_s40), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$cafeteria_init_0_s45), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a1), cont)))))))))))))));
    }
/** PREDICATE: $dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'/1,non-(public))
        final static Functor ATOM_off = SYM("off");
        final static Functor ATOM_info = SYM("info");
        final static Functor ATOM_debug = SYM("debug");
    private static final Compound L_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_s5 = CONS( ATOM_debug ,  Prolog.Nil );




    public static Operation PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_cafeteria::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_sub_1);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_1(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_2(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_1(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A):-A==off,!,true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A):-['$get_level'(B),'$equality_of_term'(A,off),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),@(ATOM_off))
        a1 = a1.dref();
        if (! a1.equalsTerm(ATOM_off)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_2(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A):-print_message(info,[debug])
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A):-[print_message(info,[debug])]
        return //
 Op("print_message", FILE_system::PRED_print_message_2_static_exec, VA( ATOM_info , L_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_s5), cont);
    }
/** PREDICATE: $dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'/1,non-(public))
        final static Functor ATOM_SxxMachbine = SYM("SxxMachbine");




    public static Operation PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_cafeteria::$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_sub_1);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_1(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_2(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_1(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A):-A=='SxxMachbine',!,'$fast_write'(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A):-['$get_level'(B),'$equality_of_term'(A,'SxxMachbine'),'$cut'(B),'$fast_write'(A)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),@(ATOM_SxxMachbine))
        a1 = a1.dref();
        if (! a1.equalsTerm(ATOM_SxxMachbine)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA(a1), cont);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_2(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A):-'$fast_write'(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A):-['$fast_write'(A)]
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: $toplvel_loop/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$toplvel_loop'/0,non-(public))
        final static Functor ATOM_$007C$0020$003F$002D$0020 = SYM("| ?- ");




    public static Operation PRED_$toplvel_loop_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$toplvel_loop':-current_prolog_flag(debug,A),typein_module(B),!,'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(B),'$fast_write'('| ?- '),flush_output
        m.setB0();
         Term a1, a2, a3;
        Operation p1, p2, p3, p4, p5, p6;
    // '$toplvel_loop':-['$get_level'(A),current_prolog_flag(debug,B),typein_module(C),'$cut'(A),'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(B),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(C),'$fast_write'('| ?- '),flush_output]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        return //
 Op("current_prolog_flag", FILE_system::PRED_current_prolog_flag_2_static_exec, VA( ATOM_debug , a2), //
 Op("typein_module", FILE_system::PRED_typein_module_1_static_exec, VA(a3), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a1), //
 Op("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl", FILE_system::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_static_exec, VA(a2), //
 Op("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl", FILE_system::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_static_exec, VA(a3), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$007C$0020$003F$002D$0020 ), //
 Op("flush_output", FILE_system::PRED_flush_output_0_static_exec, VA(), cont)))))));
    }
/** PREDICATE: $cafeteria/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$cafeteria'/1,non-(public))




    public static Operation PRED_$cafeteria_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$cafeteria'(A):-read_with_variables(A,B),'$process_order'(A,B)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // '$cafeteria'(A):-[read_with_variables(A,B),'$process_order'(A,B)]
        a2 = m.mkvar1();
        return //
 Op("read_with_variables", FILE_system::PRED_read_with_variables_2_static_exec, VA(a1, a2), //
 Op("$process_order", FILE_system::PRED_$process_order_2_static_exec, VA(a1, a2), cont));
    }
/** PREDICATE: $process_order/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$process_order'/2,non-(public))
        final static Functor ATOM_var = SYM("var");
        final static Functor FUNCTOR_$003F$002D_1 = F("?-",1);
        final static Functor ATOM_yes = SYM("yes");




    public static Operation PRED_$process_order_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$process_order_2_var, FILE_cafeteria::$process_order_2_int, FILE_cafeteria::$process_order_2_int, FILE_cafeteria::$process_order_2_con, FILE_cafeteria::$process_order_2_int, FILE_cafeteria::$process_order_2_lis); 
    }

    private final static Operation $process_order_2_var(Prolog m) { 
        m.jtry2(null, FILE_cafeteria::$process_order_2_var_1);
        return $process_order_2_1(m);
    }

    private final static Operation $process_order_2_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$process_order_2_var_2);
        return $process_order_2_2(m);
    }

    private final static Operation $process_order_2_var_2(Prolog m) { 
        m.retry(null, FILE_cafeteria::$process_order_2_var_3);
        return $process_order_2_3(m);
    }

    private final static Operation $process_order_2_var_3(Prolog m) { 
        m.retry(null, FILE_cafeteria::$process_order_2_var_4);
        return $process_order_2_4(m);
    }

    private final static Operation $process_order_2_var_4(Prolog m) { 
        m.trust(null);
        return $process_order_2_5(m);
    }

    private final static Operation $process_order_2_int(Prolog m) { 
        m.jtry2(null, FILE_cafeteria::$process_order_2_int_1);
        return $process_order_2_1(m);
    }

    private final static Operation $process_order_2_int_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$process_order_2_int_2);
        return $process_order_2_4(m);
    }

    private final static Operation $process_order_2_int_2(Prolog m) { 
        m.trust(null);
        return $process_order_2_5(m);
    }

    private final static Operation $process_order_2_con(Prolog m) { 
        m.jtry2(null, FILE_cafeteria::$process_order_2_con_1);
        return $process_order_2_1(m);
    }

    private final static Operation $process_order_2_con_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$process_order_2_con_2);
        return $process_order_2_2(m);
    }

    private final static Operation $process_order_2_con_2(Prolog m) { 
        m.retry(null, FILE_cafeteria::$process_order_2_con_3);
        return $process_order_2_4(m);
    }

    private final static Operation $process_order_2_con_3(Prolog m) { 
        m.trust(null);
        return $process_order_2_5(m);
    }

    private final static Operation $process_order_2_lis(Prolog m) { 
        m.jtry2(null, FILE_cafeteria::$process_order_2_lis_1);
        return $process_order_2_1(m);
    }

    private final static Operation $process_order_2_lis_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$process_order_2_lis_2);
        return $process_order_2_3(m);
    }

    private final static Operation $process_order_2_lis_2(Prolog m) { 
        m.retry(null, FILE_cafeteria::$process_order_2_lis_3);
        return $process_order_2_4(m);
    }

    private final static Operation $process_order_2_lis_3(Prolog m) { 
        m.trust(null);
        return $process_order_2_5(m);
    }

    private final static Operation $process_order_2_1(Prolog m) { 
    // '$process_order'(A,B):-var(A),!,illarg(var,(?-A),1)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$process_order'(A,B):-['$get_level'(C),var(A),'$cut'(C),illarg(var,(?-A),1)]
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
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_$003F$002D_1'),y(1),a(4))
        a4 =  S( FUNCTOR_$003F$002D_1 , a1);
 ;
        return //
 Op("illarg", FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a4,  int_1 ), cont);
    }

    private final static Operation $process_order_2_2(Prolog m) { 
    // '$process_order'(end_of_file,A):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$process_order'(end_of_file,A):-['$neck_cut']
        if (!  ATOM_end_of_file .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $process_order_2_3(Prolog m) { 
    // '$process_order'([A|B],C):-!,consult([A|B])
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$process_order'([A|B],C):-['$neck_cut',consult([A|B])]
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
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a5 = CONS(a3, a4);
        return //
 Op("consult", FILE_system::PRED_consult_1_static_exec, VA(a5), cont);
    }

    private final static Operation $process_order_2_4(Prolog m) { 
    // '$process_order'(A,B):-context_module(C),current_prolog_flag(debug,D),'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,C,D),nl,'$rm_redundant_vars'(B,E),'$give_answers_with_prompt'(E),!,'$fast_write'(yes),nl
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4, p5, p6, p7, p8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$process_order'(A,B):-['$get_level'(C),context_module(D),current_prolog_flag(debug,E),'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,D,E),nl,'$rm_redundant_vars'(B,F),'$give_answers_with_prompt'(F),'$cut'(C),'$fast_write'(yes),nl]
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
 Op("context_module", FILE_system::PRED_context_module_1_static_exec, VA(a4), //
 Op("current_prolog_flag", FILE_system::PRED_current_prolog_flag_2_static_exec, VA( ATOM_debug , a5), //
 Op("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl", FILE_system::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_static_exec, VA(a1, a4, a5), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("$rm_redundant_vars", FILE_system::PRED_$rm_redundant_vars_2_static_exec, VA(a2, a6), //
 Op("$give_answers_with_prompt", FILE_system::PRED_$give_answers_with_prompt_1_static_exec, VA(a6), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_yes ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), cont)))))))));
    }

    private final static Operation $process_order_2_5(Prolog m) { 
    // '$process_order'(A,B):-nl,'$fast_write'(no),nl
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$process_order'(A,B):-[nl,'$fast_write'(no),nl]
        return //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_no ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), cont)));
    }
/** PREDICATE: $dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'/3,non-(public))




    public static Operation PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_cafeteria::$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_sub_1);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_1(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_2(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_1(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C):-C==off,!,call(B:A)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C):-['$get_level'(D),'$equality_of_term'(C,off),'$cut'(D),call(B:A)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(3),@(ATOM_off))
        a3 = a3.dref();
        if (! a3.equalsTerm(ATOM_off)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
    // put_str_args([a(2),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 , a2, a1);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a5), cont);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_2(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C):-'$trace_goal'(B:A)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C):-['$trace_goal'(B:A)]
    // put_str_args([a(2),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 , a2, a1);
 ;
        return //
 Op("$trace_goal", FILE_system::PRED_$trace_goal_1_static_exec, VA(a4), cont);
    }
/** PREDICATE: $rm_redundant_vars/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$rm_redundant_vars'/2,non-(public))
        final static Functor FUNCTOR_$003D_2 = F("=",2);
        final static Functor ATOM__ = SYM("_");




    public static Operation PRED_$rm_redundant_vars_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $rm_redundant_vars_2_top(m);
    }

    private final static Operation $rm_redundant_vars_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$rm_redundant_vars_2_var, fail_0, fail_0, FILE_cafeteria::$rm_redundant_vars_2_1, fail_0, FILE_cafeteria::$rm_redundant_vars_2_lis); 
    }

    private final static Operation $rm_redundant_vars_2_var(Prolog m) { 
        m.jtry2(null, FILE_cafeteria::$rm_redundant_vars_2_var_1);
        return $rm_redundant_vars_2_1(m);
    }

    private final static Operation $rm_redundant_vars_2_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$rm_redundant_vars_2_var_2);
        return $rm_redundant_vars_2_2(m);
    }

    private final static Operation $rm_redundant_vars_2_var_2(Prolog m) { 
        m.trust(null);
        return $rm_redundant_vars_2_3(m);
    }

    private final static Operation $rm_redundant_vars_2_lis(Prolog m) { 
        m.jtry2(null, FILE_cafeteria::$rm_redundant_vars_2_lis_1);
        return $rm_redundant_vars_2_2(m);
    }

    private final static Operation $rm_redundant_vars_2_lis_1(Prolog m) { 
        m.trust(null);
        return $rm_redundant_vars_2_3(m);
    }

    private final static Operation $rm_redundant_vars_2_1(Prolog m) { 
    // '$rm_redundant_vars'([],[]):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$rm_redundant_vars'([],[]):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $rm_redundant_vars_2_2(Prolog m) { 
    // '$rm_redundant_vars'(['_'=A|B],C):-!,'$rm_redundant_vars'(B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$rm_redundant_vars'(['_'=A|B],C):-['$neck_cut','$rm_redundant_vars'(B,C)]
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
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_$003D_2 , m.trail,  ATOM__ , m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
m.cont = cont;
        return $rm_redundant_vars_2_top(m);
    }

    private final static Operation $rm_redundant_vars_2_3(Prolog m) { 
    // '$rm_redundant_vars'([A|B],[A|C]):-'$rm_redundant_vars'(B,C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$rm_redundant_vars'([A|B],[A|C]):-['$rm_redundant_vars'(B,C)]
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
                        if (! a3.unify(a2.car(), m.trail))
                return m.fail();
            a5 = a2.cdr();
        } else if (a2.isVar()){
            a5 = m.mkvar2();
             a2.bind(CONS(a3, a5), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a4;
        m.AREGS[1] = a5;
m.cont = cont;
        return $rm_redundant_vars_2_top(m);
    }
/** PREDICATE: $give_answers_with_prompt/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$give_answers_with_prompt'/1,non-(public))
        final static Functor ATOM_$0020$003F$0020 = SYM(" ? ");
        final static NumberTerm int_59 = Integer(59);
    private static final Compound L_$give_answers_with_prompt_1_s4 = CONS( int_59 ,  Prolog.Nil );




    public static Operation PRED_$give_answers_with_prompt_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$give_answers_with_prompt_1_var, FILE_cafeteria::$give_answers_with_prompt_1_2, FILE_cafeteria::$give_answers_with_prompt_1_2, FILE_cafeteria::$give_answers_with_prompt_1_var, FILE_cafeteria::$give_answers_with_prompt_1_2, FILE_cafeteria::$give_answers_with_prompt_1_2); 
    }

    private final static Operation $give_answers_with_prompt_1_var(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::$give_answers_with_prompt_1_var_1);
        return $give_answers_with_prompt_1_1(m);
    }

    private final static Operation $give_answers_with_prompt_1_var_1(Prolog m) { 
        m.trust(null);
        return $give_answers_with_prompt_1_2(m);
    }

    private final static Operation $give_answers_with_prompt_1_1(Prolog m) { 
    // '$give_answers_with_prompt'([]):-!
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$give_answers_with_prompt'([]):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $give_answers_with_prompt_1_2(Prolog m) { 
    // '$give_answers_with_prompt'(A):-'$give_an_answer'(A),'$fast_write'(' ? '),flush_output,read_line(B),B\==[59],nl
         Term a1, a2;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$give_answers_with_prompt'(A):-['$give_an_answer'(A),'$fast_write'(' ? '),flush_output,read_line(B),'$inequality_of_term'(B,[59]),nl]
        a2 = m.mkvar1();
        return //
 Op("$give_an_answer", FILE_system::PRED_$give_an_answer_1_static_exec, VA(a1), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$0020$003F$0020 ), //
 Op("flush_output", FILE_system::PRED_flush_output_0_static_exec, VA(), //
 Op("read_line", FILE_system::PRED_read_line_1_static_exec, VA(a2), //
 Op("$inequality_of_term", FILE_system::PRED_$inequality_of_term_2_static_exec, VA(a2, L_$give_answers_with_prompt_1_s4), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), cont))))));
    }
/** PREDICATE: $give_an_answer/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$give_an_answer'/1,non-(public))
        final static Functor ATOM_$002C = SYM(",");




    public static Operation PRED_$give_an_answer_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$give_an_answer_1_var, fail_0, fail_0, FILE_cafeteria::$give_an_answer_1_1, fail_0, FILE_cafeteria::$give_an_answer_1_lis); 
    }

    private final static Operation $give_an_answer_1_var(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::$give_an_answer_1_var_1);
        return $give_an_answer_1_1(m);
    }

    private final static Operation $give_an_answer_1_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$give_an_answer_1_var_2);
        return $give_an_answer_1_2(m);
    }

    private final static Operation $give_an_answer_1_var_2(Prolog m) { 
        m.trust(null);
        return $give_an_answer_1_3(m);
    }

    private final static Operation $give_an_answer_1_lis(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::$give_an_answer_1_lis_1);
        return $give_an_answer_1_2(m);
    }

    private final static Operation $give_an_answer_1_lis_1(Prolog m) { 
        m.trust(null);
        return $give_an_answer_1_3(m);
    }

    private final static Operation $give_an_answer_1_1(Prolog m) { 
    // '$give_an_answer'([]):-!,'$fast_write'(true)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$give_an_answer'([]):-['$neck_cut','$fast_write'(true)]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( Prolog.True ), cont);
    }

    private final static Operation $give_an_answer_1_2(Prolog m) { 
    // '$give_an_answer'([A]):-!,'$print_an answer'(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$give_an_answer'([A]):-['$neck_cut','$print_an answer'(A)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a2 = a1.car();
            if (!  Prolog.Nil .unify(a1.cdr(), m.trail))
                return m.fail();
        } else if (a1.isVar()){
            a2 = m.mkvar2();
             a1.bind(CONS(a2,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$print_an answer", FILE_system::PRED_$print_an$0020answer_1_static_exec, VA(a2), cont);
    }

    private final static Operation $give_an_answer_1_3(Prolog m) { 
    // '$give_an_answer'([A|B]):-'$print_an answer'(A),'$fast_write'(','),nl,'$give_an_answer'(B)
         Term a1, a2, a3;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$give_an_answer'([A|B]):-['$print_an answer'(A),'$fast_write'(','),nl,'$give_an_answer'(B)]
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
        return //
 Op("$print_an answer", FILE_system::PRED_$print_an$0020answer_1_static_exec, VA(a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$002C ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("$give_an_answer", FILE_system::PRED_$give_an_answer_1_static_exec, VA(a3), cont))));
    }
/** PREDICATE: $print_an answer/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$print_an answer'/1,non-(public))
        final static Functor ATOM_$0020$003D$0020 = SYM(" = ");




    public static Operation PRED_$print_an$0020answer_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$print_an answer'(A=B):-write(A),'$fast_write'(' = '),writeq(B)
        m.setB0();
         Term a1, a2, a3;
        Operation p1, p2;
        a1 = LARG[0];
    // '$print_an answer'(A=B):-[write(A),'$fast_write'(' = '),writeq(B)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$003D_2 , m.trail, a2, a3)){
                return m.fail();
            }
        return //
 Op("write", FILE_system::PRED_write_1_static_exec, VA(a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$0020$003D$0020 ), //
 Op("writeq", FILE_system::PRED_writeq_1_static_exec, VA(a3), cont)));
    }
/** PREDICATE: consult/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(consult/1,public)
        final static Functor FUNCTOR_consult_1 = F("consult",1);




    public static Operation PRED_consult_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return consult_1_top(m);
    }

    private final static Operation consult_1_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::consult_1_var, FILE_cafeteria::consult_1_int, FILE_cafeteria::consult_1_int, FILE_cafeteria::consult_1_con, FILE_cafeteria::consult_1_int, FILE_cafeteria::consult_1_lis); 
    }

    private final static Operation consult_1_var(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::consult_1_var_1);
        return consult_1_1(m);
    }

    private final static Operation consult_1_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::consult_1_var_2);
        return consult_1_2(m);
    }

    private final static Operation consult_1_var_2(Prolog m) { 
        m.retry(null, FILE_cafeteria::consult_1_var_3);
        return consult_1_3(m);
    }

    private final static Operation consult_1_var_3(Prolog m) { 
        m.trust(null);
        return consult_1_4(m);
    }

    private final static Operation consult_1_int(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::consult_1_int_1);
        return consult_1_1(m);
    }

    private final static Operation consult_1_int_1(Prolog m) { 
        m.trust(null);
        return consult_1_4(m);
    }

    private final static Operation consult_1_con(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::consult_1_con_1);
        return consult_1_1(m);
    }

    private final static Operation consult_1_con_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::consult_1_con_2);
        return consult_1_2(m);
    }

    private final static Operation consult_1_con_2(Prolog m) { 
        m.trust(null);
        return consult_1_4(m);
    }

    private final static Operation consult_1_lis(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::consult_1_lis_1);
        return consult_1_1(m);
    }

    private final static Operation consult_1_lis_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::consult_1_lis_2);
        return consult_1_3(m);
    }

    private final static Operation consult_1_lis_2(Prolog m) { 
        m.trust(null);
        return consult_1_4(m);
    }

    private final static Operation consult_1_1(Prolog m) { 
    // consult(A):-var(A),!,illarg(var,consult(A),1)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // consult(A):-['$get_level'(B),var(A),'$cut'(B),illarg(var,consult(A),1)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_consult_1'),y(1),a(3))
        a3 =  S( FUNCTOR_consult_1 , a1);
 ;
        return //
 Op("illarg", FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a3,  int_1 ), cont);
    }

    private final static Operation consult_1_2(Prolog m) { 
    // consult([]):-!
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // consult([]):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation consult_1_3(Prolog m) { 
    // consult([A|B]):-!,consult(A),consult(B)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // consult([A|B]):-['$neck_cut',consult(A),consult(B)]
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
        p1 = //
 Op("consult", FILE_system::PRED_consult_1_static_exec, VA(a3), cont);
        m.AREGS[0] = a2;
        m.cont = p1;
        return consult_1_top(m);
    }

    private final static Operation consult_1_4(Prolog m) { 
    // consult(A):-atom(A),!,'$consult'(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // consult(A):-['$get_level'(B),atom(A),'$cut'(B),'$consult'(A)]
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
        return //
 Op("$consult", FILE_system::PRED_$consult_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: $consult/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$consult'/1,non-(public))
        final static Functor ATOM_read = SYM("read");
        final static Functor FUNCTOR_file_name_1 = F("file_name",1);
        final static Functor ATOM_consulting = SYM("consulting");
        final static Functor ATOM_$002E$002E$002E = SYM("...");
    private static final Compound L_$consult_1_s7 = CONS( ATOM_$002E$002E$002E ,  Prolog.Nil );
        final static Functor ATOM_runtime = SYM("runtime");
        final static Functor ATOM_consulted = SYM("consulted");
        final static Functor ATOM_msec = SYM("msec");
    private static final Compound L_$consult_1_s11 = CONS( ATOM_msec ,  Prolog.Nil );




    public static Operation PRED_$consult_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$consult'(A):-'$prolog_file_name'(A,B),open(B,read,C),stream_property(C,file_name(D)),print_message(info,[consulting,D,...]),statistics(runtime,E),consult_stream(D,C),statistics(runtime,[F,G]),print_message(info,[D,consulted,G,msec]),close(C)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1, p2, p3, p4, p5, p6, p7, p8;
        a1 = LARG[0];
    // '$consult'(A):-['$prolog_file_name'(A,B),open(B,read,C),stream_property(C,file_name(D)),print_message(info,[consulting,D,...]),statistics(runtime,E),consult_stream(D,C),statistics(runtime,[F,G]),print_message(info,[D,consulted,G,msec]),close(C)]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(4)],y(1)),put_str(@('FUNCTOR_file_name_1'),y(1),a(5))
        a5 =  S( FUNCTOR_file_name_1 , a4);
 ;
        a6 = CONS(a4, L_$consult_1_s7);
        a7 = CONS( ATOM_consulting , a6);
        a8 = m.mkvar1();
        a9 = CONS(a8,  Prolog.Nil );
        a10 = CONS(m.DONT_CARE1(), a9);
        a11 = CONS(a8, L_$consult_1_s11);
        a12 = CONS( ATOM_consulted , a11);
        a13 = CONS(a4, a12);
        return //
 Op("$prolog_file_name", FILE_system::PRED_$prolog_file_name_2_static_exec, VA(a1, a2), //
 Op("open", FILE_system::PRED_open_3_static_exec, VA(a2,  ATOM_read , a3), //
 Op("stream_property", FILE_system::PRED_stream_property_2_static_exec, VA(a3, a5), //
 Op("print_message", FILE_system::PRED_print_message_2_static_exec, VA( ATOM_info , a7), //
 Op("statistics", FILE_system::PRED_statistics_2_static_exec, VA( ATOM_runtime , m.DONT_CARE2()), //
 Op("consult_stream", FILE_system::PRED_consult_stream_2_static_exec, VA(a4, a3), //
 Op("statistics", FILE_system::PRED_statistics_2_static_exec, VA( ATOM_runtime , a10), //
 Op("print_message", FILE_system::PRED_print_message_2_static_exec, VA( ATOM_info , a13), //
 Op("close", FILE_system::PRED_close_1_static_exec, VA(a3), cont)))))))));
    }
/** PREDICATE: $prolog_file_name/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$prolog_file_name'/2,non-(public))
        final static Functor ATOM_$002E = SYM(".");
        final static Functor ATOM_$002Epl = SYM(".pl");




    public static Operation PRED_$prolog_file_name_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_cafeteria::$prolog_file_name_2_sub_1);
        return $prolog_file_name_2_1(m);
    }

    private final static Operation $prolog_file_name_2_sub_1(Prolog m) { 
        m.trust(null);
        return $prolog_file_name_2_2(m);
    }

    private final static Operation $prolog_file_name_2_1(Prolog m) { 
    // '$prolog_file_name'(A,A):-sub_atom(A,B,C,D,'.'),D>0,!
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$prolog_file_name'(A,A):-['$get_level'(B),sub_atom(A,C,D,E,'.'),F is 0,'$greater_than'(E,F),'$cut'(B)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op("sub_atom", FILE_system::PRED_sub_atom_5_static_exec, VA(a1, m.DONT_CARE2(), m.DONT_CARE2(), a4,  ATOM_$002E ), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a5,  int_0 ), //
 Op("$greater_than", FILE_system::PRED_$greater_than_2_static_exec, VA(a4, a5), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), cont))));
    }

    private final static Operation $prolog_file_name_2_2(Prolog m) { 
    // '$prolog_file_name'(A,B):-atom_concat(A,'.pl',B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$prolog_file_name'(A,B):-[atom_concat(A,'.pl',B)]
        return //
 Op("atom_concat", FILE_system::PRED_atom_concat_3_static_exec, VA(a1,  ATOM_$002Epl , a2), cont);
    }
/** PREDICATE: trace/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(trace/0,public)
        final static Functor ATOM_on = SYM("on");
        final static Functor ATOM_$007BSmall$0020debugger$0020is$0020switch$0020on$007D = SYM("{Small debugger is switch on}");




    public static Operation PRED_trace_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry0(null, FILE_cafeteria::trace_0_sub_1);
        return trace_0_1(m);
    }

    private final static Operation trace_0_sub_1(Prolog m) { 
        m.trust(null);
        return trace_0_2(m);
    }

    private final static Operation trace_0_1(Prolog m) { 
    // trace:-current_prolog_flag(debug,on),!
         Term a1;
        Operation p1;
        Operation cont;
        cont = m.cont;
    // trace:-['$get_level'(A),current_prolog_flag(debug,on),'$cut'(A)]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("current_prolog_flag", FILE_system::PRED_current_prolog_flag_2_static_exec, VA( ATOM_debug ,  ATOM_on ), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a1), cont));
    }

    private final static Operation trace_0_2(Prolog m) { 
    // trace:-set_prolog_flag(debug,on),'$trace_init','$fast_write'('{Small debugger is switch on}'),nl,!
         Term a1;
        Operation p1, p2, p3, p4;
        Operation cont;
        cont = m.cont;
    // trace:-['$get_level'(A),set_prolog_flag(debug,on),'$trace_init','$fast_write'('{Small debugger is switch on}'),nl,'$cut'(A)]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_prolog_flag", FILE_system::PRED_set_prolog_flag_2_static_exec, VA( ATOM_debug ,  ATOM_on ), //
 Op("$trace_init", FILE_system::PRED_$trace_init_0_static_exec, VA(), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$007BSmall$0020debugger$0020is$0020switch$0020on$007D ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a1), cont)))));
    }
/** PREDICATE: $trace_init/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$trace_init'/0,non-(public))
    private static final Compound L_$trace_init_0_s8 = S( FUNCTOR_$0024leap_flag_1 ,  ATOM_no );
    private static final Compound L_$trace_init_0_s10 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$trace_init_0_s8);
    private static final Compound L_$trace_init_0_s13 = S( FUNCTOR_$0024current_leash_1 ,  ATOM_call );
    private static final Compound L_$trace_init_0_s15 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$trace_init_0_s13);
    private static final Compound L_$trace_init_0_s18 = S( FUNCTOR_$0024current_leash_1 ,  ATOM_exit );
    private static final Compound L_$trace_init_0_s20 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$trace_init_0_s18);
    private static final Compound L_$trace_init_0_s23 = S( FUNCTOR_$0024current_leash_1 ,  ATOM_redo );
    private static final Compound L_$trace_init_0_s25 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$trace_init_0_s23);
    private static final Compound L_$trace_init_0_s28 = S( FUNCTOR_$0024current_leash_1 ,  ATOM_fail );
    private static final Compound L_$trace_init_0_s30 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$trace_init_0_s28);




    public static Operation PRED_$trace_init_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$trace_init':-retractall('$leap_flag'(A)),retractall('$current_leash'(B)),retractall('$current_spypoint'(C,D,E)),assertz('$leap_flag'(no)),assertz('$current_leash'(call)),assertz('$current_leash'(exit)),assertz('$current_leash'(redo)),assertz('$current_leash'(fail)),!
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3, p4, p5, p6, p7, p8;
    // '$trace_init':-['$get_level'(A),retractall('SxxMachine':'$leap_flag'(B)),retractall('SxxMachine':'$current_leash'(C)),retractall('SxxMachine':'$current_spypoint'(D,E,F)),assertz('SxxMachine':'$leap_flag'(no)),assertz('SxxMachine':'$current_leash'(call)),assertz('SxxMachine':'$current_leash'(exit)),assertz('SxxMachine':'$current_leash'(redo)),assertz('SxxMachine':'$current_leash'(fail)),'$cut'(A)]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_$0024leap_flag_1'),y(1),a(2))
        a2 =  S( FUNCTOR_$0024leap_flag_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
    // put_str_args([void],y(3)),put_str(@('FUNCTOR_$0024current_leash_1'),y(3),a(4))
        a4 =  S( FUNCTOR_$0024current_leash_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
    // put_str_args([void,void,void],y(5)),put_str(@('FUNCTOR_$0024current_spypoint_3'),y(5),a(6))
        a6 =  S( FUNCTOR_$0024current_spypoint_3 , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(6)],y(6)),put_str(@('FUNCTOR_module_colon_2'),y(6),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a6);
 ;
        return //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a3), //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a5), //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a7), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$trace_init_0_s10), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$trace_init_0_s15), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$trace_init_0_s20), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$trace_init_0_s25), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$trace_init_0_s30), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a1), cont)))))))));
    }
/** PREDICATE: notrace/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(notrace/0,public)
        final static Functor ATOM_$007BSmall$0020debugger$0020is$0020switch$0020off$007D = SYM("{Small debugger is switch off}");




    public static Operation PRED_notrace_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry0(null, FILE_cafeteria::notrace_0_sub_1);
        return notrace_0_1(m);
    }

    private final static Operation notrace_0_sub_1(Prolog m) { 
        m.trust(null);
        return notrace_0_2(m);
    }

    private final static Operation notrace_0_1(Prolog m) { 
    // notrace:-current_prolog_flag(debug,off),!
         Term a1;
        Operation p1;
        Operation cont;
        cont = m.cont;
    // notrace:-['$get_level'(A),current_prolog_flag(debug,off),'$cut'(A)]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("current_prolog_flag", FILE_system::PRED_current_prolog_flag_2_static_exec, VA( ATOM_debug ,  ATOM_off ), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a1), cont));
    }

    private final static Operation notrace_0_2(Prolog m) { 
    // notrace:-set_prolog_flag(debug,off),'$fast_write'('{Small debugger is switch off}'),nl,!
         Term a1;
        Operation p1, p2, p3;
        Operation cont;
        cont = m.cont;
    // notrace:-['$get_level'(A),set_prolog_flag(debug,off),'$fast_write'('{Small debugger is switch off}'),nl,'$cut'(A)]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_prolog_flag", FILE_system::PRED_set_prolog_flag_2_static_exec, VA( ATOM_debug ,  ATOM_off ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$007BSmall$0020debugger$0020is$0020switch$0020off$007D ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a1), cont))));
    }
/** PREDICATE: debug/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(debug/0,public)




    public static Operation PRED_debug_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // debug:-trace
        m.setB0();
    // debug:-[trace]
        return //
 Op("trace", FILE_system::PRED_trace_0_static_exec, VA(), cont);
    }
/** PREDICATE: nodebug/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(nodebug/0,public)




    public static Operation PRED_nodebug_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // nodebug:-notrace
        m.setB0();
    // nodebug:-[notrace]
        return //
 Op("notrace", FILE_system::PRED_notrace_0_static_exec, VA(), cont);
    }
/** PREDICATE: $trace_goal/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$trace_goal'/1,non-(public))
        final static Functor ATOM_leap = SYM("leap");
        final static Functor ATOM_trace = SYM("trace");




    public static Operation PRED_$trace_goal_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$trace_goal'(A):-'$set_debug_flag'(leap,no),'$get_current_B'(B),context_module(C),'$meta_call'(A,C,B,0,trace)
        m.setB0();
         Term a1, a2, a3;
        Operation p1, p2, p3;
        a1 = LARG[0];
    // '$trace_goal'(A):-['$set_debug_flag'(leap,no),'$get_current_B'(B),context_module(C),'$meta_call'(A,C,B,0,trace)]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        return //
 Op("$set_debug_flag", FILE_system::PRED_$set_debug_flag_2_static_exec, VA( ATOM_leap ,  ATOM_no ), //
 Op("$get_current_B", FILE_system::PRED_$get_current_B_1_static_exec, VA(a2), //
 Op("context_module", FILE_system::PRED_context_module_1_static_exec, VA(a3), //
 Op("$meta_call", FILE_system::PRED_$meta_call_5_static_exec, VA(a1, a3, a2,  int_0 ,  ATOM_trace ), cont))));
    }
/** PREDICATE: $trace_goal/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$trace_goal'/4,non-(public))




    public static Operation PRED_$trace_goal_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_cafeteria::$trace_goal_4_sub_1);
        return $trace_goal_4_1(m);
    }

    private final static Operation $trace_goal_4_sub_1(Prolog m) { 
        m.trust(null);
        return $trace_goal_4_2(m);
    }

    private final static Operation $trace_goal_4_1(Prolog m) { 
    // '$trace_goal'(A,B,C,D):-print_procedure_box(call,A,B,C,D),'$call_internal'(A,B,C,D,trace),print_procedure_box(exit,A,B,C,D),redo_procedure_box(A,B,C,D)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$trace_goal'(A,B,C,D):-[print_procedure_box(call,A,B,C,D),'$call_internal'(A,B,C,D,trace),print_procedure_box(exit,A,B,C,D),redo_procedure_box(A,B,C,D)]
        return //
 Op("print_procedure_box", FILE_system::PRED_print_procedure_box_5_static_exec, VA( ATOM_call , a1, a2, a3, a4), //
 Op("$call_internal", FILE_system::PRED_$call_internal_5_static_exec, VA(a1, a2, a3, a4,  ATOM_trace ), //
 Op("print_procedure_box", FILE_system::PRED_print_procedure_box_5_static_exec, VA( ATOM_exit , a1, a2, a3, a4), //
 Op("redo_procedure_box", FILE_system::PRED_redo_procedure_box_4_static_exec, VA(a1, a2, a3, a4), cont))));
    }

    private final static Operation $trace_goal_4_2(Prolog m) { 
    // '$trace_goal'(A,B,C,D):-print_procedure_box(fail,A,B,C,D),fail
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$trace_goal'(A,B,C,D):-[print_procedure_box(fail,A,B,C,D),fail]
        return //
 Op("print_procedure_box", FILE_system::PRED_print_procedure_box_5_static_exec, VA( ATOM_fail , a1, a2, a3, a4), fail_0);
    }
/** PREDICATE: print_procedure_box/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(print_procedure_box/5,non-(public))
        final static Functor ATOM_$002B = SYM("+");
        final static Functor ATOM_module_colon = SYM(":");
        final static Functor FUNCTOR_print_procedure_box_5 = F("print_procedure_box",5);
    private static final Compound L_print_procedure_box_5_s12 = S( FUNCTOR_$0024leap_flag_1 ,  ATOM_no );
    private static final Compound L_print_procedure_box_5_s14 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_print_procedure_box_5_s12);
        final static Functor ATOM_$0020 = SYM(" ");

    // private final Term arg5;




    public static Operation PRED_print_procedure_box_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_cafeteria::print_procedure_box_5_sub_1);
        return print_procedure_box_5_1(m);
    }

    private final static Operation print_procedure_box_5_sub_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::print_procedure_box_5_sub_2);
        return print_procedure_box_5_2(m);
    }

    private final static Operation print_procedure_box_5_sub_2(Prolog m) { 
        m.trust(null);
        return print_procedure_box_5_3(m);
    }

    private final static Operation print_procedure_box_5_1(Prolog m) { 
    // print_procedure_box(A,B,C,D/E,F):-clause('$current_spypoint'(C,D,E),G),!,'$builtin_message'([+,F,A,:,C:B]),'$read_blocked'(print_procedure_box(A,B,C,D/E,F))
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // print_procedure_box(A,B,C,D/E,F):-['$get_level'(G),clause('SxxMachine':'$current_spypoint'(C,D,E),H),'$cut'(G),'$builtin_message'([+,F,A,:,C:B]),'$read_blocked'(print_procedure_box(A,B,C,D/E,F))]
        a4 = a4.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_$002F_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(3),a(6),a(7)],y(1)),put_str(@('FUNCTOR_$0024current_spypoint_3'),y(1),a(9))
        a9 =  S( FUNCTOR_$0024current_spypoint_3 , a3, a6, a7);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(9)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(10))
        a10 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a9);
 ;
    // put_str_args([a(3),a(2)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(11))
        a11 =  S( FUNCTOR_module_colon_2 , a3, a2);
 ;
        a12 = CONS(a11,  Prolog.Nil );
        a13 = CONS( ATOM_module_colon , a12);
        a14 = CONS(a1, a13);
        a15 = CONS(a5, a14);
        a16 = CONS( ATOM_$002B , a15);
    // put_str_args([a(6),a(7)],y(4)),put_str(@('FUNCTOR_$002F_2'),y(4),a(17))
        a17 =  S( FUNCTOR_$002F_2 , a6, a7);
 ;
    // put_str_args([a(1),a(2),a(3),a(17),a(5)],y(5)),put_str(@('FUNCTOR_print_procedure_box_5'),y(5),a(18))
        a18 =  S( FUNCTOR_print_procedure_box_5 , a1, a2, a3, a17, a5);
 ;
        return //
 Op("clause", FILE_system::PRED_clause_2_static_exec, VA(a10, m.DONT_CARE2()), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a8), //
 Op("$builtin_message", FILE_system::PRED_$builtin_message_1_static_exec, VA(a16), //
 Op("$read_blocked", FILE_system::PRED_$read_blocked_1_static_exec, VA(a18), cont))));
    }

    private final static Operation print_procedure_box_5_2(Prolog m) { 
    // print_procedure_box(A,B,C,D,E):-clause('$leap_flag'(no),F),!,'$builtin_message'([' ',E,A,:,C:B]),'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C,D,E,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // print_procedure_box(A,B,C,D,E):-['$get_level'(F),clause('SxxMachine':'$leap_flag'(no),G),'$cut'(F),'$builtin_message'([' ',E,A,:,C:B]),'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C,D,E,H)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(3),a(2)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a3, a2);
 ;
        a8 = CONS(a7,  Prolog.Nil );
        a9 = CONS( ATOM_module_colon , a8);
        a10 = CONS(a1, a9);
        a11 = CONS(a5, a10);
        a12 = CONS( ATOM_$0020 , a11);
        return //
 Op("clause", FILE_system::PRED_clause_2_static_exec, VA(L_print_procedure_box_5_s14, m.DONT_CARE2()), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a6), //
 Op("$builtin_message", FILE_system::PRED_$builtin_message_1_static_exec, VA(a12), //
 Op("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl", FILE_system::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_6_static_exec, VA(a1, a2, a3, a4, a5, m.DONT_CARE2()), cont))));
    }

    private final static Operation print_procedure_box_5_3(Prolog m) { 
    // print_procedure_box(A,B,C,D,E):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // print_procedure_box(A,B,C,D,E):-[]
        return cont;
    }
/** PREDICATE: $dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'/6,non-(public))

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_cafeteria::$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_6_sub_1);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_6_1(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_6_2(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_6_1(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C,D,E,F):-clause('$current_leash'(A),F),!,'$read_blocked'(print_procedure_box(A,B,C,D,E))
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C,D,E,F):-['$get_level'(G),clause('SxxMachine':'$current_leash'(A),F),'$cut'(G),'$read_blocked'(print_procedure_box(A,B,C,D,E))]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_$0024current_leash_1'),y(1),a(8))
        a8 =  S( FUNCTOR_$0024current_leash_1 , a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(8)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a8);
 ;
    // put_str_args([a(1),a(2),a(3),a(4),a(5)],y(3)),put_str(@('FUNCTOR_print_procedure_box_5'),y(3),a(10))
        a10 =  S( FUNCTOR_print_procedure_box_5 , a1, a2, a3, a4, a5);
 ;
        return //
 Op("clause", FILE_system::PRED_clause_2_static_exec, VA(a9, a6), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a7), //
 Op("$read_blocked", FILE_system::PRED_$read_blocked_1_static_exec, VA(a10), cont)));
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_6_2(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C,D,E,F):-nl
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C,D,E,F):-[nl]
        return //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), cont);
    }
/** PREDICATE: redo_procedure_box/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(redo_procedure_box/4,non-(public))




    public static Operation PRED_redo_procedure_box_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_cafeteria::redo_procedure_box_4_sub_1);
        return redo_procedure_box_4_1(m);
    }

    private final static Operation redo_procedure_box_4_sub_1(Prolog m) { 
        m.trust(null);
        return redo_procedure_box_4_2(m);
    }

    private final static Operation redo_procedure_box_4_1(Prolog m) { 
    // redo_procedure_box(A,B,C,D):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // redo_procedure_box(A,B,C,D):-[]
        return cont;
    }

    private final static Operation redo_procedure_box_4_2(Prolog m) { 
    // redo_procedure_box(A,B,C,D):-print_procedure_box(redo,A,B,C,D),fail
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // redo_procedure_box(A,B,C,D):-[print_procedure_box(redo,A,B,C,D),fail]
        return //
 Op("print_procedure_box", FILE_system::PRED_print_procedure_box_5_static_exec, VA( ATOM_redo , a1, a2, a3, a4), fail_0);
    }
/** PREDICATE: $dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'/3,non-(public))
        final static NumberTerm int_99 = Integer(99);




    public static Operation PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_cafeteria::$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_sub_1);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_1(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_2(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_1(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C):-A==[],!,B=99
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C):-['$get_level'(D),'$equality_of_term'(A,[]),'$cut'(D),'$unify'(B,99)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $equality_of_term(a(1),@(Prolog.Nil))
        a1 = a1.dref();
        if (! a1.equalsTerm(Prolog.Nil)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(2),@(int_99))
        if (! a2.unify(int_99, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_2(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C):-A=[B|C]
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(A,B,C):-['$unify'(A,[B|C])]
        a4 = CONS(a2, a3);
        //START inline expansion of $unify(a(1),a(4))
        if (! a1.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $read_blocked/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$read_blocked'/1,non-(public))




    public static Operation PRED_$read_blocked_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$read_blocked'(A):-'$fast_write'(' ? '),flush_output,read_line(B),'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(B,C,D),'$debug_option'(C,A)
        m.setB0();
         Term a1, a2, a3;
        Operation p1, p2, p3, p4;
        a1 = LARG[0];
    // '$read_blocked'(A):-['$fast_write'(' ? '),flush_output,read_line(B),'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl'(B,C,D),'$debug_option'(C,A)]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$0020$003F$0020 ), //
 Op("flush_output", FILE_system::PRED_flush_output_0_static_exec, VA(), //
 Op("read_line", FILE_system::PRED_read_line_1_static_exec, VA(a2), //
 Op("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl", FILE_system::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_static_exec, VA(a2, a3, m.DONT_CARE2()), //
 Op("$debug_option", FILE_system::PRED_$debug_option_2_static_exec, VA(a3, a1), cont)))));
    }
/** PREDICATE: $debug_option/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$debug_option'/2,non-(public))
        final static NumberTerm int_97 = Integer(97);
        final static NumberTerm int_108 = Integer(108);
        final static NumberTerm int_43 = Integer(43);
        final static NumberTerm int_45 = Integer(45);
        final static NumberTerm int_63 = Integer(63);
        final static NumberTerm int_104 = Integer(104);




    public static Operation PRED_$debug_option_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$debug_option_2_var, FILE_cafeteria::$debug_option_2_var, FILE_cafeteria::$debug_option_2_8, FILE_cafeteria::$debug_option_2_8, FILE_cafeteria::$debug_option_2_8, FILE_cafeteria::$debug_option_2_8); 
    }

    private final static Operation $debug_option_2_var(Prolog m) { 
        m.jtry2(null, FILE_cafeteria::$debug_option_2_var_1);
        return $debug_option_2_1(m);
    }

    private final static Operation $debug_option_2_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$debug_option_2_var_2);
        return $debug_option_2_2(m);
    }

    private final static Operation $debug_option_2_var_2(Prolog m) { 
        m.retry(null, FILE_cafeteria::$debug_option_2_var_3);
        return $debug_option_2_3(m);
    }

    private final static Operation $debug_option_2_var_3(Prolog m) { 
        m.retry(null, FILE_cafeteria::$debug_option_2_var_4);
        return $debug_option_2_4(m);
    }

    private final static Operation $debug_option_2_var_4(Prolog m) { 
        m.retry(null, FILE_cafeteria::$debug_option_2_var_5);
        return $debug_option_2_5(m);
    }

    private final static Operation $debug_option_2_var_5(Prolog m) { 
        m.retry(null, FILE_cafeteria::$debug_option_2_var_6);
        return $debug_option_2_6(m);
    }

    private final static Operation $debug_option_2_var_6(Prolog m) { 
        m.retry(null, FILE_cafeteria::$debug_option_2_var_7);
        return $debug_option_2_7(m);
    }

    private final static Operation $debug_option_2_var_7(Prolog m) { 
        m.trust(null);
        return $debug_option_2_8(m);
    }

    private final static Operation $debug_option_2_1(Prolog m) { 
    // '$debug_option'(97,A):-!,notrace,abort
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$debug_option'(97,A):-['$neck_cut',notrace,abort]
        if (!  int_97 .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("notrace", FILE_system::PRED_notrace_0_static_exec, VA(), //
 Op("abort", FILE_system::PRED_abort_0_static_exec, VA(), cont));
    }

    private final static Operation $debug_option_2_2(Prolog m) { 
    // '$debug_option'(99,A):-!,'$set_debug_flag'(leap,no)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$debug_option'(99,A):-['$neck_cut','$set_debug_flag'(leap,no)]
        if (!  int_99 .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$set_debug_flag", FILE_system::PRED_$set_debug_flag_2_static_exec, VA( ATOM_leap ,  ATOM_no ), cont);
    }

    private final static Operation $debug_option_2_3(Prolog m) { 
    // '$debug_option'(108,A):-!,'$set_debug_flag'(leap,yes)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$debug_option'(108,A):-['$neck_cut','$set_debug_flag'(leap,yes)]
        if (!  int_108 .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$set_debug_flag", FILE_system::PRED_$set_debug_flag_2_static_exec, VA( ATOM_leap ,  ATOM_yes ), cont);
    }

    private final static Operation $debug_option_2_4(Prolog m) { 
    // '$debug_option'(43,print_procedure_box(A,B,C,D,E)):-!,spy(C:D),call(print_procedure_box(A,B,C,D,E))
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$debug_option'(43,print_procedure_box(A,B,C,D,E)):-['$neck_cut',spy(C:D),call('SxxMachine':print_procedure_box(A,B,C,D,E))]
        if (!  int_43 .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_print_procedure_box_5 , m.trail, a3, a4, a5, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(5),a(6)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(8))
        a8 =  S( FUNCTOR_module_colon_2 , a5, a6);
 ;
        a9 = Closure( //
 Op("print_procedure_box", FILE_system::PRED_print_procedure_box_5_static_exec, VA(a3, a4, a5, a6, a7), null));
        return //
 Op("spy", FILE_system::PRED_spy_1_static_exec, VA(a8), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a9), cont));
    }

    private final static Operation $debug_option_2_5(Prolog m) { 
    // '$debug_option'(45,print_procedure_box(A,B,C,D,E)):-!,nospy(C:D),call(print_procedure_box(A,B,C,D,E))
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$debug_option'(45,print_procedure_box(A,B,C,D,E)):-['$neck_cut',nospy(C:D),call('SxxMachine':print_procedure_box(A,B,C,D,E))]
        if (!  int_45 .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_print_procedure_box_5 , m.trail, a3, a4, a5, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(5),a(6)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(8))
        a8 =  S( FUNCTOR_module_colon_2 , a5, a6);
 ;
        a9 = Closure( //
 Op("print_procedure_box", FILE_system::PRED_print_procedure_box_5_static_exec, VA(a3, a4, a5, a6, a7), null));
        return //
 Op("nospy", FILE_system::PRED_nospy_1_static_exec, VA(a8), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a9), cont));
    }

    private final static Operation $debug_option_2_6(Prolog m) { 
    // '$debug_option'(63,A):-!,'$show_debug_option',call(A)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$debug_option'(63,A):-['$neck_cut','$show_debug_option',call('SxxMachine':A)]
        if (!  int_63 .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op("$show_debug_option", FILE_system::PRED_$show_debug_option_0_static_exec, VA(), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a3), cont));
    }

    private final static Operation $debug_option_2_7(Prolog m) { 
    // '$debug_option'(104,A):-!,'$show_debug_option',call(A)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$debug_option'(104,A):-['$neck_cut','$show_debug_option',call('SxxMachine':A)]
        if (!  int_104 .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op("$show_debug_option", FILE_system::PRED_$show_debug_option_0_static_exec, VA(), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a3), cont));
    }

    private final static Operation $debug_option_2_8(Prolog m) { 
    // '$debug_option'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$debug_option'(A,B):-[]
        return cont;
    }
/** PREDICATE: $show_debug_option/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$show_debug_option'/0,non-(public))
        final static Functor ATOM_Debugging$0020options$003A = SYM("Debugging options:");
        final static Functor ATOM_a$0020$0020$0020$0020$0020$0020abort = SYM("a      abort");
        final static Functor ATOM_RET$0020$0020$0020$0020creep = SYM("RET    creep");
        final static Functor ATOM_c$0020$0020$0020$0020$0020$0020creep = SYM("c      creep");
        final static Functor ATOM_l$0020$0020$0020$0020$0020$0020leap = SYM("l      leap");
        final static Functor ATOM_$002B$0020$0020$0020$0020$0020$0020spy$0020this = SYM("+      spy this");
        final static Functor ATOM_$002D$0020$0020$0020$0020$0020$0020nospy$0020this = SYM("-      nospy this");
        final static Functor ATOM_$003F$0020$0020$0020$0020$0020$0020help = SYM("?      help");
        final static Functor ATOM_h$0020$0020$0020$0020$0020$0020help = SYM("h      help");




    public static Operation PRED_$show_debug_option_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$show_debug_option':-tab(4),'$fast_write'('Debugging options:'),nl,tab(4),'$fast_write'('a      abort'),nl,tab(4),'$fast_write'('RET    creep'),nl,tab(4),'$fast_write'('c      creep'),nl,tab(4),'$fast_write'('l      leap'),nl,tab(4),'$fast_write'('+      spy this'),nl,tab(4),'$fast_write'('-      nospy this'),nl,tab(4),'$fast_write'('?      help'),nl,tab(4),'$fast_write'('h      help'),nl
        m.setB0();
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26;
    // '$show_debug_option':-[tab(4),'$fast_write'('Debugging options:'),nl,tab(4),'$fast_write'('a      abort'),nl,tab(4),'$fast_write'('RET    creep'),nl,tab(4),'$fast_write'('c      creep'),nl,tab(4),'$fast_write'('l      leap'),nl,tab(4),'$fast_write'('+      spy this'),nl,tab(4),'$fast_write'('-      nospy this'),nl,tab(4),'$fast_write'('?      help'),nl,tab(4),'$fast_write'('h      help'),nl]
        return //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA( int_4 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_Debugging$0020options$003A ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA( int_4 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_a$0020$0020$0020$0020$0020$0020abort ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA( int_4 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_RET$0020$0020$0020$0020creep ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA( int_4 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_c$0020$0020$0020$0020$0020$0020creep ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA( int_4 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_l$0020$0020$0020$0020$0020$0020leap ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA( int_4 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$002B$0020$0020$0020$0020$0020$0020spy$0020this ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA( int_4 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$002D$0020$0020$0020$0020$0020$0020nospy$0020this ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA( int_4 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$003F$0020$0020$0020$0020$0020$0020help ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA( int_4 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_h$0020$0020$0020$0020$0020$0020help ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), cont)))))))))))))))))))))))))));
    }
/** PREDICATE: $set_debug_flag/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$set_debug_flag'/2,non-(public))




    public static Operation PRED_$set_debug_flag_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$set_debug_flag_2_var, fail_0, fail_0, FILE_cafeteria::$set_debug_flag_2_var, fail_0, fail_0); 
    }

    private final static Operation $set_debug_flag_2_var(Prolog m) { 
        m.jtry2(null, FILE_cafeteria::$set_debug_flag_2_var_1);
        return $set_debug_flag_2_1(m);
    }

    private final static Operation $set_debug_flag_2_var_1(Prolog m) { 
        m.trust(null);
        return $set_debug_flag_2_2(m);
    }

    private final static Operation $set_debug_flag_2_1(Prolog m) { 
    // '$set_debug_flag'(leap,A):-clause('$leap_flag'(A),B),!
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$set_debug_flag'(leap,A):-['$get_level'(B),clause('SxxMachine':'$leap_flag'(A),C),'$cut'(B)]
        if (!  ATOM_leap .unify(a1, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_$0024leap_flag_1'),y(1),a(4))
        a4 =  S( FUNCTOR_$0024leap_flag_1 , a2);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
        return //
 Op("clause", FILE_system::PRED_clause_2_static_exec, VA(a5, m.DONT_CARE2()), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation $set_debug_flag_2_2(Prolog m) { 
    // '$set_debug_flag'(leap,A):-retractall('$leap_flag'(B)),assertz('$leap_flag'(A))
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$set_debug_flag'(leap,A):-[retractall('SxxMachine':'$leap_flag'(B)),assertz('SxxMachine':'$leap_flag'(A))]
        if (!  ATOM_leap .unify(a1, m.trail))
            return m.fail();
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_$0024leap_flag_1'),y(1),a(3))
        a3 =  S( FUNCTOR_$0024leap_flag_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a3);
 ;
    // put_str_args([a(2)],y(3)),put_str(@('FUNCTOR_$0024leap_flag_1'),y(3),a(5))
        a5 =  S( FUNCTOR_$0024leap_flag_1 , a2);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(5)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a5);
 ;
        return //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a4), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(a6), cont));
    }
/** PREDICATE: spy/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(spy/1,public)
        final static Functor FUNCTOR_spy_1 = F("spy",1);




    public static Operation PRED_spy_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // spy(A):-'$term_to_predicateindicator'(A,B,spy(A)),trace,'$assert_spypoint'(B),'$set_debug_flag'(leap,yes),!
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1, p2, p3, p4;
        a1 = LARG[0];
    // spy(A):-['$get_level'(B),'$term_to_predicateindicator'(A,C,spy(A)),trace,'$assert_spypoint'(C),'$set_debug_flag'(leap,yes),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_spy_1'),y(1),a(4))
        a4 =  S( FUNCTOR_spy_1 , a1);
 ;
        return //
 Op("$term_to_predicateindicator", FILE_system::PRED_$term_to_predicateindicator_3_static_exec, VA(a1, a3, a4), //
 Op("trace", FILE_system::PRED_trace_0_static_exec, VA(), //
 Op("$assert_spypoint", FILE_system::PRED_$assert_spypoint_1_static_exec, VA(a3), //
 Op("$set_debug_flag", FILE_system::PRED_$set_debug_flag_2_static_exec, VA( ATOM_leap ,  ATOM_yes ), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), cont)))));
    }
/** PREDICATE: $assert_spypoint/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$assert_spypoint'/1,non-(public))
        final static Functor ATOM_spypoint = SYM("spypoint");
        final static Functor ATOM_is = SYM("is");
        final static Functor ATOM_already = SYM("already");
        final static Functor ATOM_added = SYM("added");
    private static final Compound L_$assert_spypoint_1_s11 = CONS( ATOM_added ,  Prolog.Nil );
    private static final Compound L_$assert_spypoint_1_s12 = CONS( ATOM_already , L_$assert_spypoint_1_s11);
    private static final Compound L_$assert_spypoint_1_s13 = CONS( ATOM_is , L_$assert_spypoint_1_s12);
    private static final Compound L_$assert_spypoint_1_s15 = CONS( ATOM_is , L_$assert_spypoint_1_s11);
        final static Functor ATOM_warning = SYM("warning");
        final static Functor ATOM_matching = SYM("matching");
        final static Functor ATOM_predicate = SYM("predicate");
        final static Functor ATOM_for = SYM("for");
        final static Functor ATOM_spy = SYM("spy");




    public static Operation PRED_$assert_spypoint_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$assert_spypoint_1_var, fail_0, fail_0, fail_0, FILE_cafeteria::$assert_spypoint_1_var, fail_0); 
    }

    private final static Operation $assert_spypoint_1_var(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::$assert_spypoint_1_var_1);
        return $assert_spypoint_1_1(m);
    }

    private final static Operation $assert_spypoint_1_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$assert_spypoint_1_var_2);
        return $assert_spypoint_1_2(m);
    }

    private final static Operation $assert_spypoint_1_var_2(Prolog m) { 
        m.trust(null);
        return $assert_spypoint_1_3(m);
    }

    private final static Operation $assert_spypoint_1_1(Prolog m) { 
    // '$assert_spypoint'(A:B/C):-clause('$current_spypoint'(A,B,C),D),print_message(info,[spypoint,A:B/C,is,already,added]),!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$assert_spypoint'(A:B/C):-['$get_level'(D),clause('SxxMachine':'$current_spypoint'(A,B,C),E),print_message(info,[spypoint,A:B/C,is,already,added]),'$cut'(D)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a2, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002F_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2),a(4),a(5)],y(1)),put_str(@('FUNCTOR_$0024current_spypoint_3'),y(1),a(7))
        a7 =  S( FUNCTOR_$0024current_spypoint_3 , a2, a4, a5);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(7)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(8))
        a8 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a7);
 ;
    // put_str_args([a(4),a(5)],y(3)),put_str(@('FUNCTOR_$002F_2'),y(3),a(9))
        a9 =  S( FUNCTOR_$002F_2 , a4, a5);
 ;
    // put_str_args([a(2),a(9)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(10))
        a10 =  S( FUNCTOR_module_colon_2 , a2, a9);
 ;
        a11 = CONS(a10, L_$assert_spypoint_1_s13);
        a12 = CONS( ATOM_spypoint , a11);
        return //
 Op("clause", FILE_system::PRED_clause_2_static_exec, VA(a8, m.DONT_CARE2()), //
 Op("print_message", FILE_system::PRED_print_message_2_static_exec, VA( ATOM_info , a12), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a6), cont)));
    }

    private final static Operation $assert_spypoint_1_2(Prolog m) { 
    // '$assert_spypoint'(A:B/C):-clause('$consulted_predicate'(A,B/C,D),E),assertz('$current_spypoint'(A,B,C)),print_message(info,[spypoint,A:B/C,is,added]),!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$assert_spypoint'(A:B/C):-['$get_level'(D),clause('SxxMachine':'$consulted_predicate'(A,B/C,E),F),assertz('SxxMachine':'$current_spypoint'(A,B,C)),print_message(info,[spypoint,A:B/C,is,added]),'$cut'(D)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a2, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002F_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(7))
        a7 =  S( FUNCTOR_$002F_2 , a4, a5);
 ;
    // put_str_args([a(2),a(7),void],y(2)),put_str(@('FUNCTOR_$0024consulted_predicate_3'),y(2),a(8))
        a8 =  S( FUNCTOR_$0024consulted_predicate_3 , a2, a7, m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(8)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a8);
 ;
    // put_str_args([a(2),a(4),a(5)],y(4)),put_str(@('FUNCTOR_$0024current_spypoint_3'),y(4),a(10))
        a10 =  S( FUNCTOR_$0024current_spypoint_3 , a2, a4, a5);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(10)],y(5)),put_str(@('FUNCTOR_module_colon_2'),y(5),a(11))
        a11 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a10);
 ;
    // put_str_args([a(4),a(5)],y(6)),put_str(@('FUNCTOR_$002F_2'),y(6),a(12))
        a12 =  S( FUNCTOR_$002F_2 , a4, a5);
 ;
    // put_str_args([a(2),a(12)],y(7)),put_str(@('FUNCTOR_module_colon_2'),y(7),a(13))
        a13 =  S( FUNCTOR_module_colon_2 , a2, a12);
 ;
        a14 = CONS(a13, L_$assert_spypoint_1_s15);
        a15 = CONS( ATOM_spypoint , a14);
        return //
 Op("clause", FILE_system::PRED_clause_2_static_exec, VA(a9, m.DONT_CARE2()), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(a11), //
 Op("print_message", FILE_system::PRED_print_message_2_static_exec, VA( ATOM_info , a15), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a6), cont))));
    }

    private final static Operation $assert_spypoint_1_3(Prolog m) { 
    // '$assert_spypoint'(A:B/C):-print_message(warning,[no,matching,predicate,for,spy,A:B/C])
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$assert_spypoint'(A:B/C):-[print_message(warning,[no,matching,predicate,for,spy,A:B/C])]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a2, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002F_2 , m.trail, a4, a5)){
                return m.fail();
            }
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002F_2 , a4, a5);
 ;
    // put_str_args([a(2),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a2, a6);
 ;
        a8 = CONS(a7,  Prolog.Nil );
        a9 = CONS( ATOM_spy , a8);
        a10 = CONS( ATOM_for , a9);
        a11 = CONS( ATOM_predicate , a10);
        a12 = CONS( ATOM_matching , a11);
        a13 = CONS( ATOM_no , a12);
        return //
 Op("print_message", FILE_system::PRED_print_message_2_static_exec, VA( ATOM_warning , a13), cont);
    }
/** PREDICATE: nospy/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(nospy/1,public)
        final static Functor FUNCTOR_nospy_1 = F("nospy",1);




    public static Operation PRED_nospy_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // nospy(A):-'$term_to_predicateindicator'(A,B,nospy(A)),'$retract_spypoint'(B),'$set_debug_flag'(leap,no),!
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        a1 = LARG[0];
    // nospy(A):-['$get_level'(B),'$term_to_predicateindicator'(A,C,nospy(A)),'$retract_spypoint'(C),'$set_debug_flag'(leap,no),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_nospy_1'),y(1),a(4))
        a4 =  S( FUNCTOR_nospy_1 , a1);
 ;
        return //
 Op("$term_to_predicateindicator", FILE_system::PRED_$term_to_predicateindicator_3_static_exec, VA(a1, a3, a4), //
 Op("$retract_spypoint", FILE_system::PRED_$retract_spypoint_1_static_exec, VA(a3), //
 Op("$set_debug_flag", FILE_system::PRED_$set_debug_flag_2_static_exec, VA( ATOM_leap ,  ATOM_no ), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), cont))));
    }
/** PREDICATE: $retract_spypoint/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$retract_spypoint'/1,non-(public))
        final static Functor ATOM_removed = SYM("removed");
    private static final Compound L_$retract_spypoint_1_s10 = CONS( ATOM_removed ,  Prolog.Nil );
    private static final Compound L_$retract_spypoint_1_s11 = CONS( ATOM_is , L_$retract_spypoint_1_s10);




    public static Operation PRED_$retract_spypoint_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$retract_spypoint_1_var, FILE_cafeteria::$retract_spypoint_1_2, FILE_cafeteria::$retract_spypoint_1_2, FILE_cafeteria::$retract_spypoint_1_2, FILE_cafeteria::$retract_spypoint_1_var, FILE_cafeteria::$retract_spypoint_1_2); 
    }

    private final static Operation $retract_spypoint_1_var(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::$retract_spypoint_1_var_1);
        return $retract_spypoint_1_1(m);
    }

    private final static Operation $retract_spypoint_1_var_1(Prolog m) { 
        m.trust(null);
        return $retract_spypoint_1_2(m);
    }

    private final static Operation $retract_spypoint_1_1(Prolog m) { 
    // '$retract_spypoint'(A:B/C):-retract('$current_spypoint'(A,B,C)),print_message(info,[spypoint,A:B/C,is,removed]),!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$retract_spypoint'(A:B/C):-['$get_level'(D),retract('SxxMachine':'$current_spypoint'(A,B,C)),print_message(info,[spypoint,A:B/C,is,removed]),'$cut'(D)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a2, a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002F_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2),a(4),a(5)],y(1)),put_str(@('FUNCTOR_$0024current_spypoint_3'),y(1),a(7))
        a7 =  S( FUNCTOR_$0024current_spypoint_3 , a2, a4, a5);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(7)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(8))
        a8 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a7);
 ;
    // put_str_args([a(4),a(5)],y(3)),put_str(@('FUNCTOR_$002F_2'),y(3),a(9))
        a9 =  S( FUNCTOR_$002F_2 , a4, a5);
 ;
    // put_str_args([a(2),a(9)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(10))
        a10 =  S( FUNCTOR_module_colon_2 , a2, a9);
 ;
        a11 = CONS(a10, L_$retract_spypoint_1_s11);
        a12 = CONS( ATOM_spypoint , a11);
        return //
 Op("retract", FILE_system::PRED_retract_1_static_exec, VA(a8), //
 Op("print_message", FILE_system::PRED_print_message_2_static_exec, VA( ATOM_info , a12), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a6), cont)));
    }

    private final static Operation $retract_spypoint_1_2(Prolog m) { 
    // '$retract_spypoint'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$retract_spypoint'(A):-[]
        return cont;
    }
/** PREDICATE: nospyall/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(nospyall/0,public)




    public static Operation PRED_nospyall_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // nospyall:-retractall('$current_spypoint'(A,B,C)),'$set_debug_flag'(leap,no)
        m.setB0();
         Term a1, a2;
        Operation p1;
    // nospyall:-[retractall('SxxMachine':'$current_spypoint'(A,B,C)),'$set_debug_flag'(leap,no)]
    // put_str_args([void,void,void],y(1)),put_str(@('FUNCTOR_$0024current_spypoint_3'),y(1),a(1))
        a1 =  S( FUNCTOR_$0024current_spypoint_3 , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
        return //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a2), //
 Op("$set_debug_flag", FILE_system::PRED_$set_debug_flag_2_static_exec, VA( ATOM_leap ,  ATOM_no ), cont));
    }
/** PREDICATE: leash/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(leash/1,public)
        final static Functor FUNCTOR_type_1 = F("type",1);
        final static Functor ATOM_leash_specifier = SYM("leash_specifier");
    private static final Compound L_leash_1_s4 = S( FUNCTOR_type_1 ,  ATOM_leash_specifier );
        final static Functor FUNCTOR_leash_1 = F("leash",1);




    public static Operation PRED_leash_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_cafeteria::leash_1_sub_1);
        return leash_1_1(m);
    }

    private final static Operation leash_1_sub_1(Prolog m) { 
        m.trust(null);
        return leash_1_2(m);
    }

    private final static Operation leash_1_1(Prolog m) { 
    // leash(A):-nonvar(A),'$leash'(A),!
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // leash(A):-['$get_level'(B),nonvar(A),'$leash'(A),'$cut'(B)]
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
        return //
 Op("$leash", FILE_system::PRED_$leash_1_static_exec, VA(a1), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), cont));
    }

    private final static Operation leash_1_2(Prolog m) { 
    // leash(A):-illarg(type(leash_specifier),leash(A),1)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // leash(A):-[illarg(type(leash_specifier),leash(A),1)]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_leash_1'),y(1),a(2))
        a2 =  S( FUNCTOR_leash_1 , a1);
 ;
        return //
 Op("illarg", FILE_system::PRED_illarg_3_static_exec, VA(L_leash_1_s4, a2,  int_1 ), cont);
    }
/** PREDICATE: $leash/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$leash'/1,non-(public))
        final static Functor ATOM_leashing = SYM("leashing");
    private static final Compound L_$leash_1_s8 = CONS( ATOM_leashing ,  Prolog.Nil );
    private static final Compound L_$leash_1_s9 = CONS( ATOM_no , L_$leash_1_s8);
        final static Functor ATOM_stopping = SYM("stopping");




    public static Operation PRED_$leash_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$leash_1_var, FILE_cafeteria::$leash_1_2, FILE_cafeteria::$leash_1_2, FILE_cafeteria::$leash_1_var, FILE_cafeteria::$leash_1_2, FILE_cafeteria::$leash_1_2); 
    }

    private final static Operation $leash_1_var(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::$leash_1_var_1);
        return $leash_1_1(m);
    }

    private final static Operation $leash_1_var_1(Prolog m) { 
        m.trust(null);
        return $leash_1_2(m);
    }

    private final static Operation $leash_1_1(Prolog m) { 
    // '$leash'([]):-!,retractall('$current_leash'(A)),print_message(info,[no,leashing])
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$leash'([]):-['$neck_cut',retractall('SxxMachine':'$current_leash'(A)),print_message(info,[no,leashing])]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_$0024current_leash_1'),y(1),a(2))
        a2 =  S( FUNCTOR_$0024current_leash_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a3), //
 Op("print_message", FILE_system::PRED_print_message_2_static_exec, VA( ATOM_info , L_$leash_1_s9), cont));
    }

    private final static Operation $leash_1_2(Prolog m) { 
    // '$leash'(A):-retractall('$current_leash'(B)),'$assert_leash'(A),print_message(info,[leashing,stopping,on,A])
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$leash'(A):-[retractall('SxxMachine':'$current_leash'(B)),'$assert_leash'(A),print_message(info,[leashing,stopping,on,A])]
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_$0024current_leash_1'),y(1),a(2))
        a2 =  S( FUNCTOR_$0024current_leash_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        a4 = CONS(a1,  Prolog.Nil );
        a5 = CONS( ATOM_on , a4);
        a6 = CONS( ATOM_stopping , a5);
        a7 = CONS( ATOM_leashing , a6);
        return //
 Op("retractall", FILE_system::PRED_retractall_1_static_exec, VA(a3), //
 Op("$assert_leash", FILE_system::PRED_$assert_leash_1_static_exec, VA(a1), //
 Op("print_message", FILE_system::PRED_print_message_2_static_exec, VA( ATOM_info , a7), cont)));
    }
/** PREDICATE: $assert_leash/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$assert_leash'/1,non-(public))




    public static Operation PRED_$assert_leash_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$assert_leash_1_var, fail_0, fail_0, FILE_cafeteria::$assert_leash_1_1, fail_0, FILE_cafeteria::$assert_leash_1_2); 
    }

    private final static Operation $assert_leash_1_var(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::$assert_leash_1_var_1);
        return $assert_leash_1_1(m);
    }

    private final static Operation $assert_leash_1_var_1(Prolog m) { 
        m.trust(null);
        return $assert_leash_1_2(m);
    }

    private final static Operation $assert_leash_1_1(Prolog m) { 
    // '$assert_leash'([]):-!
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$assert_leash'([]):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $assert_leash_1_2(Prolog m) { 
    // '$assert_leash'([A|B]):-'$leash_specifier'(A),assertz('$current_leash'(A)),'$assert_leash'(B)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$assert_leash'([A|B]):-['$leash_specifier'(A),assertz('SxxMachine':'$current_leash'(A)),'$assert_leash'(B)]
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
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_$0024current_leash_1'),y(1),a(4))
        a4 =  S( FUNCTOR_$0024current_leash_1 , a2);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
        return //
 Op("$leash_specifier", FILE_system::PRED_$leash_specifier_1_static_exec, VA(a2), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(a5), //
 Op("$assert_leash", FILE_system::PRED_$assert_leash_1_static_exec, VA(a3), cont)));
    }
/** PREDICATE: $leash_specifier/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$leash_specifier'/1,non-(public))




    public static Operation PRED_$leash_specifier_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$leash_specifier_1_var, fail_0, fail_0, FILE_cafeteria::$leash_specifier_1_var, fail_0, fail_0); 
    }

    private final static Operation $leash_specifier_1_var(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::$leash_specifier_1_var_1);
        return $leash_specifier_1_1(m);
    }

    private final static Operation $leash_specifier_1_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$leash_specifier_1_var_2);
        return $leash_specifier_1_2(m);
    }

    private final static Operation $leash_specifier_1_var_2(Prolog m) { 
        m.retry(null, FILE_cafeteria::$leash_specifier_1_var_3);
        return $leash_specifier_1_3(m);
    }

    private final static Operation $leash_specifier_1_var_3(Prolog m) { 
        m.trust(null);
        return $leash_specifier_1_4(m);
    }

    private final static Operation $leash_specifier_1_1(Prolog m) { 
    // '$leash_specifier'(call):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$leash_specifier'(call):-[]
        if (!  ATOM_call .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $leash_specifier_1_2(Prolog m) { 
    // '$leash_specifier'(exit):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$leash_specifier'(exit):-[]
        if (!  ATOM_exit .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $leash_specifier_1_3(Prolog m) { 
    // '$leash_specifier'(redo):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$leash_specifier'(redo):-[]
        if (!  ATOM_redo .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $leash_specifier_1_4(Prolog m) { 
    // '$leash_specifier'(fail):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$leash_specifier'(fail):-[]
        if (!  ATOM_fail .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: listing/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(listing/0,public)




    public static Operation PRED_listing_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // listing:-context_module(A),'$listing'(B,A)
        m.setB0();
         Term a1;
        Operation p1;
    // listing:-[context_module(A),'$listing'(B,A)]
        a1 = m.mkvar1();
        return //
 Op("context_module", FILE_system::PRED_context_module_1_static_exec, VA(a1), //
 Op("$listing", FILE_system::PRED_$listing_2_static_exec, VA(m.DONT_CARE2(), a1), cont));
    }
/** PREDICATE: listing/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(listing/1,public)
        final static Functor FUNCTOR_listing_1 = F("listing",1);
        final static Functor ATOM_predicate_indicator = SYM("predicate_indicator");
    private static final Compound L_listing_1_s9 = S( FUNCTOR_type_1 ,  ATOM_predicate_indicator );




    public static Operation PRED_listing_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::listing_1_var, FILE_cafeteria::listing_1_int, FILE_cafeteria::listing_1_int, FILE_cafeteria::listing_1_int, FILE_cafeteria::listing_1_var, FILE_cafeteria::listing_1_int); 
    }

    private final static Operation listing_1_var(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::listing_1_var_1);
        return listing_1_1(m);
    }

    private final static Operation listing_1_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::listing_1_var_2);
        return listing_1_2(m);
    }

    private final static Operation listing_1_var_2(Prolog m) { 
        m.retry(null, FILE_cafeteria::listing_1_var_3);
        return listing_1_3(m);
    }

    private final static Operation listing_1_var_3(Prolog m) { 
        m.retry(null, FILE_cafeteria::listing_1_var_4);
        return listing_1_4(m);
    }

    private final static Operation listing_1_var_4(Prolog m) { 
        m.trust(null);
        return listing_1_5(m);
    }

    private final static Operation listing_1_int(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::listing_1_int_1);
        return listing_1_1(m);
    }

    private final static Operation listing_1_int_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::listing_1_int_2);
        return listing_1_2(m);
    }

    private final static Operation listing_1_int_2(Prolog m) { 
        m.trust(null);
        return listing_1_5(m);
    }

    private final static Operation listing_1_1(Prolog m) { 
    // listing(A):-var(A),!,illarg(var,listing(A),1)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // listing(A):-['$get_level'(B),var(A),'$cut'(B),illarg(var,listing(A),1)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_listing_1'),y(1),a(3))
        a3 =  S( FUNCTOR_listing_1 , a1);
 ;
        return //
 Op("illarg", FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a3,  int_1 ), cont);
    }

    private final static Operation listing_1_2(Prolog m) { 
    // listing(A):-atom(A),!,'$listing'(B,A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // listing(A):-['$get_level'(B),atom(A),'$cut'(B),'$listing'(C,A)]
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
        return //
 Op("$listing", FILE_system::PRED_$listing_2_static_exec, VA(m.DONT_CARE2(), a1), cont);
    }

    private final static Operation listing_1_3(Prolog m) { 
    // listing(A/B):-context_module(C),!,'$listing'(A/B,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // listing(A/B):-['$get_level'(C),context_module(D),'$cut'(C),'$listing'(A/B,D)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002F_2 , m.trail, a2, a3)){
                return m.fail();
            }
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002F_2 , a2, a3);
 ;
        return //
 Op("context_module", FILE_system::PRED_context_module_1_static_exec, VA(a5), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op("$listing", FILE_system::PRED_$listing_2_static_exec, VA(a6, a5), cont)));
    }

    private final static Operation listing_1_4(Prolog m) { 
    // listing(A:B):-atom(A),!,'$listing'(B,A)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // listing(A:B):-['$get_level'(C),atom(A),'$cut'(C),'$listing'(B,A)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a2, a3)){
                return m.fail();
            }
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(2))
        a2 = a2.dref();
        if (! (a2 .isAtom())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return //
 Op("$listing", FILE_system::PRED_$listing_2_static_exec, VA(a3, a2), cont);
    }

    private final static Operation listing_1_5(Prolog m) { 
    // listing(A):-illarg(type(predicate_indicator),listing(A),1)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // listing(A):-[illarg(type(predicate_indicator),listing(A),1)]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_listing_1'),y(1),a(2))
        a2 =  S( FUNCTOR_listing_1 , a1);
 ;
        return //
 Op("illarg", FILE_system::PRED_illarg_3_static_exec, VA(L_listing_1_s9, a2,  int_1 ), cont);
    }
/** PREDICATE: $listing/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$listing'/2,non-(public))
    private static final Compound L_$listing_2_s5 = S( FUNCTOR_type_1 ,  ATOM_predicate_indicator );




    public static Operation PRED_$listing_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$listing_2_var, FILE_cafeteria::$listing_2_int, FILE_cafeteria::$listing_2_int, FILE_cafeteria::$listing_2_int, FILE_cafeteria::$listing_2_var, FILE_cafeteria::$listing_2_int); 
    }

    private final static Operation $listing_2_var(Prolog m) { 
        m.jtry2(null, FILE_cafeteria::$listing_2_var_1);
        return $listing_2_1(m);
    }

    private final static Operation $listing_2_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$listing_2_var_2);
        return $listing_2_2(m);
    }

    private final static Operation $listing_2_var_2(Prolog m) { 
        m.trust(null);
        return $listing_2_3(m);
    }

    private final static Operation $listing_2_int(Prolog m) { 
        m.jtry2(null, FILE_cafeteria::$listing_2_int_1);
        return $listing_2_1(m);
    }

    private final static Operation $listing_2_int_1(Prolog m) { 
        m.trust(null);
        return $listing_2_3(m);
    }

    private final static Operation $listing_2_1(Prolog m) { 
    // '$listing'(A,B):-var(A),!,'$listing_dynamic_clause'(B,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$listing'(A,B):-['$get_level'(C),var(A),'$cut'(C),'$listing_dynamic_clause'(B,D)]
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
        return //
 Op("$listing_dynamic_clause", FILE_system::PRED_$listing_dynamic_clause_2_static_exec, VA(a2, m.DONT_CARE2()), cont);
    }

    private final static Operation $listing_2_2(Prolog m) { 
    // '$listing'(A/B,C):-atom(A),integer(B),!,'$listing_dynamic_clause'(C,A/B)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$listing'(A/B,C):-['$get_level'(D),atom(A),integer(B),'$cut'(D),'$listing_dynamic_clause'(C,A/B)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002F_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of atom(a(3))
        a3 = a3.dref();
        if (! (a3 .isAtom())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of integer(a(4))
        a4 = a4.dref();
        if (! (a4 .isInteger())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(5))
        a5 = a5.dref();
                  m.cut( a5.intValue());
        //END inline expansion
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002F_2 , a3, a4);
 ;
        return //
 Op("$listing_dynamic_clause", FILE_system::PRED_$listing_dynamic_clause_2_static_exec, VA(a2, a6), cont);
    }

    private final static Operation $listing_2_3(Prolog m) { 
    // '$listing'(A,B):-illarg(type(predicate_indicator),listing(B:A),1)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$listing'(A,B):-[illarg(type(predicate_indicator),listing(B:A),1)]
    // put_str_args([a(2),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 , a2, a1);
 ;
    // put_str_args([a(3)],y(2)),put_str(@('FUNCTOR_listing_1'),y(2),a(4))
        a4 =  S( FUNCTOR_listing_1 , a3);
 ;
        return //
 Op("illarg", FILE_system::PRED_illarg_3_static_exec, VA(L_$listing_2_s5, a4,  int_1 ), cont);
    }
/** PREDICATE: $listing_dynamic_clause/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$listing_dynamic_clause'/2,non-(public))




    public static Operation PRED_$listing_dynamic_clause_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_cafeteria::$listing_dynamic_clause_2_sub_1);
        return $listing_dynamic_clause_2_1(m);
    }

    private final static Operation $listing_dynamic_clause_2_sub_1(Prolog m) { 
        m.trust(null);
        return $listing_dynamic_clause_2_2(m);
    }

    private final static Operation $listing_dynamic_clause_2_1(Prolog m) { 
    // '$listing_dynamic_clause'(A,B):-'$new_internal_database'(A),hash_keys(A,C),'$builtin_member'(B,C),B=D/E,functor(F,D,E),'$clause_internal'(A,B,F,G,H),'$write_dynamic_clause'(A,G),fail
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$listing_dynamic_clause'(A,B):-['$new_internal_database'(A),hash_keys(A,C),'$builtin_member'(B,C),'$unify'(B,D/E),functor(F,D,E),'$clause_internal'(A,B,F,G,H),'$write_dynamic_clause'(A,G),fail]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002F_2 , a4, a5);
 ;
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        return //
 Op("$new_internal_database", FILE_system::PRED_$new_internal_database_1_static_exec, VA(a1), //
 Op("hash_keys", FILE_system::PRED_hash_keys_2_static_exec, VA(a1, a3), //
 Op("$builtin_member", FILE_system::PRED_$builtin_member_2_static_exec, VA(a2, a3), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a2, a6), //
 Op("functor", FILE_system::PRED_functor_3_static_exec, VA(a7, a4, a5), //
 Op("$clause_internal", FILE_system::PRED_$clause_internal_5_static_exec, VA(a1, a2, a7, a8, m.DONT_CARE2()), //
 Op("$write_dynamic_clause", FILE_system::PRED_$write_dynamic_clause_2_static_exec, VA(a1, a8), fail_0)))))));
    }

    private final static Operation $listing_dynamic_clause_2_2(Prolog m) { 
    // '$listing_dynamic_clause'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$listing_dynamic_clause'(A,B):-[]
        return cont;
    }
/** PREDICATE: $write_dynamic_clause/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$write_dynamic_clause'/2,non-(public))
        final static Functor FUNCTOR_$003A$002D_2 = F(":-",2);
        final static Functor ATOM_$0020$003A$002D = SYM(" :-");




    public static Operation PRED_$write_dynamic_clause_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_cafeteria::$write_dynamic_clause_2_sub_1);
        return $write_dynamic_clause_2_1(m);
    }

    private final static Operation $write_dynamic_clause_2_sub_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$write_dynamic_clause_2_sub_2);
        return $write_dynamic_clause_2_2(m);
    }

    private final static Operation $write_dynamic_clause_2_sub_2(Prolog m) { 
        m.trust(null);
        return $write_dynamic_clause_2_3(m);
    }

    private final static Operation $write_dynamic_clause_2_1(Prolog m) { 
    // '$write_dynamic_clause'(A,B):-var(B),!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_dynamic_clause'(A,B):-['$get_level'(C),var(B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(2))
        a2 = a2.dref();
        if (! (a2 .isVariable())) {
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

    private final static Operation $write_dynamic_clause_2_2(Prolog m) { 
    // '$write_dynamic_clause'(A,(B:-true)):-!,numbervars(B,0,C),'$write_dynamic_head'(A,B),write('.'),nl
         Term a1, a2, a3;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_dynamic_clause'(A,(B:-true)):-['$neck_cut',numbervars(B,0,C),'$write_dynamic_head'(A,B),write('.'),nl]
        a2 = a2.dref();
            a3 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a3,  Prolog.True )){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("numbervars", FILE_system::PRED_numbervars_3_static_exec, VA(a3,  int_0 , m.DONT_CARE2()), //
 Op("$write_dynamic_head", FILE_system::PRED_$write_dynamic_head_2_static_exec, VA(a1, a3), //
 Op("write", FILE_system::PRED_write_1_static_exec, VA( ATOM_$002E ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), cont))));
    }

    private final static Operation $write_dynamic_clause_2_3(Prolog m) { 
    // '$write_dynamic_clause'(A,(B:-C)):-!,numbervars((B:-C),0,D),'$write_dynamic_head'(A,B),write(' :-'),nl,'$write_dynamic_body'(C,8),write('.'),nl
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_dynamic_clause'(A,(B:-C)):-['$neck_cut',numbervars((B:-C),0,D),'$write_dynamic_head'(A,B),write(' :-'),nl,'$write_dynamic_body'(C,8),write('.'),nl]
        a2 = a2.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$003A$002D_2 , m.trail, a3, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_$003A$002D_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$003A$002D_2 , a3, a4);
 ;
        return //
 Op("numbervars", FILE_system::PRED_numbervars_3_static_exec, VA(a5,  int_0 , m.DONT_CARE2()), //
 Op("$write_dynamic_head", FILE_system::PRED_$write_dynamic_head_2_static_exec, VA(a1, a3), //
 Op("write", FILE_system::PRED_write_1_static_exec, VA( ATOM_$0020$003A$002D ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("$write_dynamic_body", FILE_system::PRED_$write_dynamic_body_2_static_exec, VA(a4,  int_8 ), //
 Op("write", FILE_system::PRED_write_1_static_exec, VA( ATOM_$002E ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), cont)))))));
    }
/** PREDICATE: $write_dynamic_head/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$write_dynamic_head'/2,non-(public))




    public static Operation PRED_$write_dynamic_head_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_cafeteria::$write_dynamic_head_2_sub_1);
        return $write_dynamic_head_2_1(m);
    }

    private final static Operation $write_dynamic_head_2_sub_1(Prolog m) { 
        m.trust(null);
        return $write_dynamic_head_2_2(m);
    }

    private final static Operation $write_dynamic_head_2_1(Prolog m) { 
    // '$write_dynamic_head'(A,B):-context_module(A),!,writeq(B)
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_dynamic_head'(A,B):-['$get_level'(C),context_module(A),'$cut'(C),writeq(B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("context_module", FILE_system::PRED_context_module_1_static_exec, VA(a1), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("writeq", FILE_system::PRED_writeq_1_static_exec, VA(a2), cont)));
    }

    private final static Operation $write_dynamic_head_2_2(Prolog m) { 
    // '$write_dynamic_head'(A,B):-write(A),write(:),writeq(B)
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_dynamic_head'(A,B):-[write(A),write(:),writeq(B)]
        return //
 Op("write", FILE_system::PRED_write_1_static_exec, VA(a1), //
 Op("write", FILE_system::PRED_write_1_static_exec, VA( ATOM_module_colon ), //
 Op("writeq", FILE_system::PRED_writeq_1_static_exec, VA(a2), cont)));
    }
/** PREDICATE: $write_dynamic_body/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$write_dynamic_body'/2,non-(public))
        final static Functor FUNCTOR_$002C_2 = F(",",2);
        final static Functor FUNCTOR_or_2 = F(";",2);
        final static Functor FUNCTOR_$002B_2 = F("+",2);
        final static Functor ATOM_$0028 = SYM("(");
        final static Functor ATOM_or = SYM(";");
        final static Functor ATOM_$0029 = SYM(")");
        final static Functor FUNCTOR_$002D$003E_2 = F("->",2);
        final static Functor ATOM_$002D$003E = SYM("->");




    public static Operation PRED_$write_dynamic_body_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return $write_dynamic_body_2_top(m);
    }

    private final static Operation $write_dynamic_body_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$write_dynamic_body_2_var, FILE_cafeteria::$write_dynamic_body_2_4, FILE_cafeteria::$write_dynamic_body_2_4, FILE_cafeteria::$write_dynamic_body_2_4, FILE_cafeteria::$write_dynamic_body_2_var, FILE_cafeteria::$write_dynamic_body_2_4); 
    }

    private final static Operation $write_dynamic_body_2_var(Prolog m) { 
        m.jtry2(null, FILE_cafeteria::$write_dynamic_body_2_var_1);
        return $write_dynamic_body_2_1(m);
    }

    private final static Operation $write_dynamic_body_2_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$write_dynamic_body_2_var_2);
        return $write_dynamic_body_2_2(m);
    }

    private final static Operation $write_dynamic_body_2_var_2(Prolog m) { 
        m.retry(null, FILE_cafeteria::$write_dynamic_body_2_var_3);
        return $write_dynamic_body_2_3(m);
    }

    private final static Operation $write_dynamic_body_2_var_3(Prolog m) { 
        m.trust(null);
        return $write_dynamic_body_2_4(m);
    }

    private final static Operation $write_dynamic_body_2_1(Prolog m) { 
    // '$write_dynamic_body'((A,B),C):-!,'$write_dynamic_body'(A,C),write(','),nl,'$write_dynamic_body'(B,C)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_dynamic_body'((A,B),C):-['$neck_cut','$write_dynamic_body'(A,C),write(','),nl,'$write_dynamic_body'(B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002C_2 , m.trail, a3, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p3 = //
 Op("write", FILE_system::PRED_write_1_static_exec, VA( ATOM_$002C ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("$write_dynamic_body", FILE_system::PRED_$write_dynamic_body_2_static_exec, VA(a4, a2), cont)));
        m.AREGS[0] = a3;
        m.AREGS[1] = a2;
        m.cont = p3;
        return $write_dynamic_body_2_top(m);
    }

    private final static Operation $write_dynamic_body_2_2(Prolog m) { 
    // '$write_dynamic_body'((A;B),C):-!,D is C+4,tab(C),write('('),nl,'$write_dynamic_body'(A,D),nl,tab(C),write(;),nl,'$write_dynamic_body'(B,D),nl,tab(C),write(')')
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_dynamic_body'((A;B),C):-['$neck_cut',D is C+4,tab(C),write('('),nl,'$write_dynamic_body'(A,D),nl,tab(C),write(;),nl,'$write_dynamic_body'(B,D),nl,tab(C),write(')')]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_or_2 , m.trail, a3, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a5 = m.mkvar1();
    // put_str_args([a(2),@(int_4)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a2,  int_4 );
 ;
        //START inline expansion of a(5)is a(6)
        if (! a5.unify(Arithmetic.evaluate(a6), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA(a2), //
 Op("write", FILE_system::PRED_write_1_static_exec, VA( ATOM_$0028 ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("$write_dynamic_body", FILE_system::PRED_$write_dynamic_body_2_static_exec, VA(a3, a5), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA(a2), //
 Op("write", FILE_system::PRED_write_1_static_exec, VA( ATOM_or ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("$write_dynamic_body", FILE_system::PRED_$write_dynamic_body_2_static_exec, VA(a4, a5), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA(a2), //
 Op("write", FILE_system::PRED_write_1_static_exec, VA( ATOM_$0029 ), cont))))))))))));
    }

    private final static Operation $write_dynamic_body_2_3(Prolog m) { 
    // '$write_dynamic_body'((A->B),C):-!,D is C+4,tab(C),write('('),nl,'$write_dynamic_body'(A,D),nl,tab(C),write(->),nl,'$write_dynamic_body'(B,D),nl,tab(C),write(')')
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_dynamic_body'((A->B),C):-['$neck_cut',D is C+4,tab(C),write('('),nl,'$write_dynamic_body'(A,D),nl,tab(C),write(->),nl,'$write_dynamic_body'(B,D),nl,tab(C),write(')')]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a3, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a5 = m.mkvar1();
    // put_str_args([a(2),@(int_4)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a2,  int_4 );
 ;
        //START inline expansion of a(5)is a(6)
        if (! a5.unify(Arithmetic.evaluate(a6), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA(a2), //
 Op("write", FILE_system::PRED_write_1_static_exec, VA( ATOM_$0028 ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("$write_dynamic_body", FILE_system::PRED_$write_dynamic_body_2_static_exec, VA(a3, a5), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA(a2), //
 Op("write", FILE_system::PRED_write_1_static_exec, VA( ATOM_$002D$003E ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("$write_dynamic_body", FILE_system::PRED_$write_dynamic_body_2_static_exec, VA(a4, a5), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA(a2), //
 Op("write", FILE_system::PRED_write_1_static_exec, VA( ATOM_$0029 ), cont))))))))))));
    }

    private final static Operation $write_dynamic_body_2_4(Prolog m) { 
    // '$write_dynamic_body'(A,B):-tab(B),writeq(A)
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_dynamic_body'(A,B):-[tab(B),writeq(A)]
        return //
 Op("tab", FILE_system::PRED_tab_1_static_exec, VA(a2), //
 Op("writeq", FILE_system::PRED_writeq_1_static_exec, VA(a1), cont));
    }
/** PREDICATE: print_message/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(print_message/2,non-(public))
        final static Functor FUNCTOR_print_message_2 = F("print_message",2);
        final static Functor ATOM_$007B = SYM("{");
        final static Functor ATOM_$007D = SYM("}");
        final static Functor ATOM_$007BWARNING$003A$0020 = SYM("{WARNING: ");




    public static Operation PRED_print_message_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::print_message_2_var, FILE_cafeteria::print_message_2_1, FILE_cafeteria::print_message_2_1, FILE_cafeteria::print_message_2_var, FILE_cafeteria::print_message_2_1, FILE_cafeteria::print_message_2_1); 
    }

    private final static Operation print_message_2_var(Prolog m) { 
        m.jtry2(null, FILE_cafeteria::print_message_2_var_1);
        return print_message_2_1(m);
    }

    private final static Operation print_message_2_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::print_message_2_var_2);
        return print_message_2_2(m);
    }

    private final static Operation print_message_2_var_2(Prolog m) { 
        m.retry(null, FILE_cafeteria::print_message_2_var_3);
        return print_message_2_3(m);
    }

    private final static Operation print_message_2_var_3(Prolog m) { 
        m.trust(null);
        return print_message_2_4(m);
    }

    private final static Operation print_message_2_1(Prolog m) { 
    // print_message(A,B):-var(A),!,illarg(var,print_message(A,B),1)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // print_message(A,B):-['$get_level'(C),var(A),'$cut'(C),illarg(var,print_message(A,B),1)]
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
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_print_message_2'),y(1),a(4))
        a4 =  S( FUNCTOR_print_message_2 , a1, a2);
 ;
        return //
 Op("illarg", FILE_system::PRED_illarg_3_static_exec, VA( ATOM_var , a4,  int_1 ), cont);
    }

    private final static Operation print_message_2_2(Prolog m) { 
    // print_message(error,A):-!,'$error_message'(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // print_message(error,A):-['$neck_cut','$error_message'(A)]
        if (!  ATOM_error .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$error_message", FILE_system::PRED_$error_message_1_static_exec, VA(a2), cont);
    }

    private final static Operation print_message_2_3(Prolog m) { 
    // print_message(info,A):-!,'$fast_write'('{'),'$builtin_message'(A),'$fast_write'('}'),nl
         Term a1, a2;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // print_message(info,A):-['$neck_cut','$fast_write'('{'),'$builtin_message'(A),'$fast_write'('}'),nl]
        if (!  ATOM_info .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$007B ), //
 Op("$builtin_message", FILE_system::PRED_$builtin_message_1_static_exec, VA(a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), cont))));
    }

    private final static Operation print_message_2_4(Prolog m) { 
    // print_message(warning,A):-!,'$fast_write'('{WARNING: '),'$builtin_message'(A),'$fast_write'('}'),nl
         Term a1, a2;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // print_message(warning,A):-['$neck_cut','$fast_write'('{WARNING: '),'$builtin_message'(A),'$fast_write'('}'),nl]
        if (!  ATOM_warning .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$007BWARNING$003A$0020 ), //
 Op("$builtin_message", FILE_system::PRED_$builtin_message_1_static_exec, VA(a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), cont))));
    }
/** PREDICATE: nl/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main(nl/0,non-(public))




    public static Operation PRED_nl_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // nl:-current_output(A),nl(A)
        m.setB0();
         Term a1;
        Operation p1;
    // nl:-[current_output(A),nl(A)]
        a1 = m.mkvar1();
        return //
 Op("current_output", FILE_system::PRED_current_output_1_static_exec, VA(a1), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA(a1), cont));
    }
/** PREDICATE: $builtin_message/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$builtin_message'/1,non-(public))




    public static Operation PRED_$builtin_message_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$builtin_message_1_var, fail_0, fail_0, FILE_cafeteria::$builtin_message_1_1, fail_0, FILE_cafeteria::$builtin_message_1_lis); 
    }

    private final static Operation $builtin_message_1_var(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::$builtin_message_1_var_1);
        return $builtin_message_1_1(m);
    }

    private final static Operation $builtin_message_1_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$builtin_message_1_var_2);
        return $builtin_message_1_2(m);
    }

    private final static Operation $builtin_message_1_var_2(Prolog m) { 
        m.trust(null);
        return $builtin_message_1_3(m);
    }

    private final static Operation $builtin_message_1_lis(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::$builtin_message_1_lis_1);
        return $builtin_message_1_2(m);
    }

    private final static Operation $builtin_message_1_lis_1(Prolog m) { 
        m.trust(null);
        return $builtin_message_1_3(m);
    }

    private final static Operation $builtin_message_1_1(Prolog m) { 
    // '$builtin_message'([]):-!
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$builtin_message'([]):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation $builtin_message_1_2(Prolog m) { 
    // '$builtin_message'([A]):-!,write(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$builtin_message'([A]):-['$neck_cut',write(A)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a2 = a1.car();
            if (!  Prolog.Nil .unify(a1.cdr(), m.trail))
                return m.fail();
        } else if (a1.isVar()){
            a2 = m.mkvar2();
             a1.bind(CONS(a2,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("write", FILE_system::PRED_write_1_static_exec, VA(a2), cont);
    }

    private final static Operation $builtin_message_1_3(Prolog m) { 
    // '$builtin_message'([A|B]):-write(A),'$fast_write'(' '),'$builtin_message'(B)
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$builtin_message'([A|B]):-[write(A),'$fast_write'(' '),'$builtin_message'(B)]
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
        return //
 Op("write", FILE_system::PRED_write_1_static_exec, VA(a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_1_static_exec, VA( ATOM_$0020 ), //
 Op("$builtin_message", FILE_system::PRED_$builtin_message_1_static_exec, VA(a3), cont)));
    }
/** PREDICATE: $error_message/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$error_message'/1,non-(public))
        final static Functor FUNCTOR_instantiation_error_2 = F("instantiation_error",2);
        final static Functor ATOM_user_error = SYM("user_error");
        final static Functor ATOM_$007BINSTANTIATION$0020ERROR$003A$0020 = SYM("{INSTANTIATION ERROR: ");
        final static Functor ATOM_$0020$002D$0020arg$0020 = SYM(" - arg ");
        final static Functor FUNCTOR_type_error_4 = F("type_error",4);
        final static Functor ATOM_$007BTYPE$0020ERROR$003A$0020 = SYM("{TYPE ERROR: ");
        final static Functor ATOM_$003A$0020expected$0020 = SYM(": expected ");
        final static Functor ATOM_$002C$0020found$0020 = SYM(", found ");
        final static Functor FUNCTOR_domain_error_4 = F("domain_error",4);
        final static Functor ATOM_$007BDOMAIN$0020ERROR$003A$0020 = SYM("{DOMAIN ERROR: ");
        final static Functor FUNCTOR_existence_error_5 = F("existence_error",5);
        final static Functor ATOM_$007BEXISTENCE$0020ERROR$003A$0020 = SYM("{EXISTENCE ERROR: ");
        final static Functor ATOM_$0020does$0020not$0020exist = SYM(" does not exist");
        final static Functor ATOM_$003A$0020 = SYM(": ");
        final static Functor FUNCTOR_permission_error_5 = F("permission_error",5);
        final static Functor ATOM_$007BPERMISSION$0020ERROR$003A$0020 = SYM("{PERMISSION ERROR: ");
        final static Functor ATOM_$0020$002D$0020can$0020not$0020 = SYM(" - can not ");
        final static Functor FUNCTOR_representation_error_3 = F("representation_error",3);
        final static Functor ATOM_$007BREPRESENTATION$0020ERROR$003A$0020 = SYM("{REPRESENTATION ERROR: ");
        final static Functor ATOM_$003A$0020limit$0020of$0020 = SYM(": limit of ");
        final static Functor ATOM_$0020is$0020breached = SYM(" is breached");
        final static Functor FUNCTOR_evaluation_error_3 = F("evaluation_error",3);
        final static Functor ATOM_$007BEVALUATION$0020ERROR$003A$0020 = SYM("{EVALUATION ERROR: ");
        final static Functor FUNCTOR_syntax_error_5 = F("syntax_error",5);
        final static Functor ATOM_$007BSYNTAX$0020ERROR$003A$0020 = SYM("{SYNTAX ERROR: ");
        final static Functor FUNCTOR_system_error_1 = F("system_error",1);
        final static Functor ATOM_$007BSYSTEM$0020ERROR$003A$0020 = SYM("{SYSTEM ERROR: ");
        final static Functor FUNCTOR_internal_error_1 = F("internal_error",1);
        final static Functor ATOM_$007BINTERNAL$0020ERROR$003A$0020 = SYM("{INTERNAL ERROR: ");
        final static Functor FUNCTOR_java_error_3 = F("java_error",3);
        final static Functor ATOM_$007BJAVA$0020ERROR$003A$0020 = SYM("{JAVA ERROR: ");




    public static Operation PRED_$error_message_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_cafeteria::$error_message_1_var, FILE_cafeteria::$error_message_1_14, FILE_cafeteria::$error_message_1_14, FILE_cafeteria::$error_message_1_14, FILE_cafeteria::$error_message_1_var, FILE_cafeteria::$error_message_1_14); 
    }

    private final static Operation $error_message_1_var(Prolog m) { 
        m.jtry1(null, FILE_cafeteria::$error_message_1_var_1);
        return $error_message_1_1(m);
    }

    private final static Operation $error_message_1_var_1(Prolog m) { 
        m.retry(null, FILE_cafeteria::$error_message_1_var_2);
        return $error_message_1_2(m);
    }

    private final static Operation $error_message_1_var_2(Prolog m) { 
        m.retry(null, FILE_cafeteria::$error_message_1_var_3);
        return $error_message_1_3(m);
    }

    private final static Operation $error_message_1_var_3(Prolog m) { 
        m.retry(null, FILE_cafeteria::$error_message_1_var_4);
        return $error_message_1_4(m);
    }

    private final static Operation $error_message_1_var_4(Prolog m) { 
        m.retry(null, FILE_cafeteria::$error_message_1_var_5);
        return $error_message_1_5(m);
    }

    private final static Operation $error_message_1_var_5(Prolog m) { 
        m.retry(null, FILE_cafeteria::$error_message_1_var_6);
        return $error_message_1_6(m);
    }

    private final static Operation $error_message_1_var_6(Prolog m) { 
        m.retry(null, FILE_cafeteria::$error_message_1_var_7);
        return $error_message_1_7(m);
    }

    private final static Operation $error_message_1_var_7(Prolog m) { 
        m.retry(null, FILE_cafeteria::$error_message_1_var_8);
        return $error_message_1_8(m);
    }

    private final static Operation $error_message_1_var_8(Prolog m) { 
        m.retry(null, FILE_cafeteria::$error_message_1_var_9);
        return $error_message_1_9(m);
    }

    private final static Operation $error_message_1_var_9(Prolog m) { 
        m.retry(null, FILE_cafeteria::$error_message_1_var_10);
        return $error_message_1_10(m);
    }

    private final static Operation $error_message_1_var_10(Prolog m) { 
        m.retry(null, FILE_cafeteria::$error_message_1_var_11);
        return $error_message_1_11(m);
    }

    private final static Operation $error_message_1_var_11(Prolog m) { 
        m.retry(null, FILE_cafeteria::$error_message_1_var_12);
        return $error_message_1_12(m);
    }

    private final static Operation $error_message_1_var_12(Prolog m) { 
        m.retry(null, FILE_cafeteria::$error_message_1_var_13);
        return $error_message_1_13(m);
    }

    private final static Operation $error_message_1_var_13(Prolog m) { 
        m.trust(null);
        return $error_message_1_14(m);
    }

    private final static Operation $error_message_1_1(Prolog m) { 
    // '$error_message'(instantiation_error(A,0)):-!,'$fast_write'(user_error,'{INSTANTIATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1, a2;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(instantiation_error(A,0)):-['$neck_cut','$fast_write'(user_error,'{INSTANTIATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_instantiation_error_2 , m.trail, a2,  int_0 )){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BINSTANTIATION$0020ERROR$003A$0020 ), //
 Op("$write_goal", FILE_system::PRED_$write_goal_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont)))));
    }

    private final static Operation $error_message_1_2(Prolog m) { 
    // '$error_message'(instantiation_error(A,B)):-!,'$fast_write'(user_error,'{INSTANTIATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1, a2, a3;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(instantiation_error(A,B)):-['$neck_cut','$fast_write'(user_error,'{INSTANTIATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_instantiation_error_2 , m.trail, a2, a3)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BINSTANTIATION$0020ERROR$003A$0020 ), //
 Op("$write_goal", FILE_system::PRED_$write_goal_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020$002D$0020arg$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a3), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont)))))));
    }

    private final static Operation $error_message_1_3(Prolog m) { 
    // '$error_message'(type_error(A,B,C,D)):-!,'$fast_write'(user_error,'{TYPE ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': expected '),'$fast_write'(user_error,C),'$fast_write'(user_error,', found '),write(user_error,D),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(type_error(A,B,C,D)):-['$neck_cut','$fast_write'(user_error,'{TYPE ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': expected '),'$fast_write'(user_error,C),'$fast_write'(user_error,', found '),write(user_error,D),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_type_error_4 , m.trail, a2, a3, a4, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BTYPE$0020ERROR$003A$0020 ), //
 Op("$write_goal", FILE_system::PRED_$write_goal_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020$002D$0020arg$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a3), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$003A$0020expected$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a4), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$002C$0020found$0020 ), //
 Op("write", FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error , a5), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont)))))))))));
    }

    private final static Operation $error_message_1_4(Prolog m) { 
    // '$error_message'(domain_error(A,B,C,D)):-!,'$fast_write'(user_error,'{DOMAIN ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': expected '),'$fast_write'(user_error,C),'$fast_write'(user_error,', found '),write(user_error,D),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(domain_error(A,B,C,D)):-['$neck_cut','$fast_write'(user_error,'{DOMAIN ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': expected '),'$fast_write'(user_error,C),'$fast_write'(user_error,', found '),write(user_error,D),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_domain_error_4 , m.trail, a2, a3, a4, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BDOMAIN$0020ERROR$003A$0020 ), //
 Op("$write_goal", FILE_system::PRED_$write_goal_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020$002D$0020arg$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a3), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$003A$0020expected$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a4), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$002C$0020found$0020 ), //
 Op("write", FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error , a5), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont)))))))))));
    }

    private final static Operation $error_message_1_5(Prolog m) { 
    // '$error_message'(existence_error(A,0,B,C,D)):-!,'$fast_write'(user_error,'{EXISTENCE ERROR: '),'$fast_write'(user_error,B),'$fast_write'(user_error,' '),write(user_error,C),'$fast_write'(user_error,' does not exist'),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1, a2, a3;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(existence_error(A,0,B,C,D)):-['$neck_cut','$fast_write'(user_error,'{EXISTENCE ERROR: '),'$fast_write'(user_error,B),'$fast_write'(user_error,' '),write(user_error,C),'$fast_write'(user_error,' does not exist'),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_existence_error_5 , m.trail, m.DONT_CARE1(),  int_0 , a2, a3, m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BEXISTENCE$0020ERROR$003A$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020 ), //
 Op("write", FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error , a3), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020does$0020not$0020exist ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont))))))));
    }

    private final static Operation $error_message_1_6(Prolog m) { 
    // '$error_message'(existence_error(A,B,C,D,E)):-!,'$fast_write'(user_error,'{EXISTENCE ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': '),'$fast_write'(user_error,C),'$fast_write'(user_error,' '),write(user_error,D),'$fast_write'(user_error,' does not exist'),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(existence_error(A,B,C,D,E)):-['$neck_cut','$fast_write'(user_error,'{EXISTENCE ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': '),'$fast_write'(user_error,C),'$fast_write'(user_error,' '),write(user_error,D),'$fast_write'(user_error,' does not exist'),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_existence_error_5 , m.trail, a2, a3, a4, a5, m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BEXISTENCE$0020ERROR$003A$0020 ), //
 Op("$write_goal", FILE_system::PRED_$write_goal_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020$002D$0020arg$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a3), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$003A$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a4), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020 ), //
 Op("write", FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error , a5), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020does$0020not$0020exist ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont))))))))))));
    }

    private final static Operation $error_message_1_7(Prolog m) { 
    // '$error_message'(permission_error(A,B,C,D,E)):-!,'$fast_write'(user_error,'{PERMISSION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - can not '),'$fast_write'(user_error,B),'$fast_write'(user_error,' '),'$fast_write'(user_error,C),'$fast_write'(user_error,' '),write(user_error,D),'$fast_write'(user_error,': '),'$fast_write'(user_error,E),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(permission_error(A,B,C,D,E)):-['$neck_cut','$fast_write'(user_error,'{PERMISSION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - can not '),'$fast_write'(user_error,B),'$fast_write'(user_error,' '),'$fast_write'(user_error,C),'$fast_write'(user_error,' '),write(user_error,D),'$fast_write'(user_error,': '),'$fast_write'(user_error,E),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_permission_error_5 , m.trail, a2, a3, a4, a5, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BPERMISSION$0020ERROR$003A$0020 ), //
 Op("$write_goal", FILE_system::PRED_$write_goal_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020$002D$0020can$0020not$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a3), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a4), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020 ), //
 Op("write", FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error , a5), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$003A$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a6), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont)))))))))))));
    }

    private final static Operation $error_message_1_8(Prolog m) { 
    // '$error_message'(representation_error(A,B,C)):-!,'$fast_write'(user_error,'{REPRESENTATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': limit of '),'$fast_write'(user_error,C),'$fast_write'(user_error,' is breached'),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(representation_error(A,B,C)):-['$neck_cut','$fast_write'(user_error,'{REPRESENTATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': limit of '),'$fast_write'(user_error,C),'$fast_write'(user_error,' is breached'),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_representation_error_3 , m.trail, a2, a3, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BREPRESENTATION$0020ERROR$003A$0020 ), //
 Op("$write_goal", FILE_system::PRED_$write_goal_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020$002D$0020arg$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a3), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$003A$0020limit$0020of$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a4), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020is$0020breached ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont))))))))));
    }

    private final static Operation $error_message_1_9(Prolog m) { 
    // '$error_message'(evaluation_error(A,B,C)):-!,'$fast_write'(user_error,'{EVALUATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,', found '),'$fast_write'(user_error,C),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3, p4, p5, p6, p7, p8;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(evaluation_error(A,B,C)):-['$neck_cut','$fast_write'(user_error,'{EVALUATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,', found '),'$fast_write'(user_error,C),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_evaluation_error_3 , m.trail, a2, a3, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BEVALUATION$0020ERROR$003A$0020 ), //
 Op("$write_goal", FILE_system::PRED_$write_goal_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020$002D$0020arg$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a3), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$002C$0020found$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a4), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont)))))))));
    }

    private final static Operation $error_message_1_10(Prolog m) { 
    // '$error_message'(syntax_error(A,B,C,D,E)):-!,'$fast_write'(user_error,'{SYNTAX ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': expected '),'$fast_write'(user_error,C),'$fast_write'(user_error,', found '),write(user_error,D),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(syntax_error(A,B,C,D,E)):-['$neck_cut','$fast_write'(user_error,'{SYNTAX ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': expected '),'$fast_write'(user_error,C),'$fast_write'(user_error,', found '),write(user_error,D),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_syntax_error_5 , m.trail, a2, a3, a4, a5, m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BSYNTAX$0020ERROR$003A$0020 ), //
 Op("$write_goal", FILE_system::PRED_$write_goal_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020$002D$0020arg$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a3), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$003A$0020expected$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a4), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$002C$0020found$0020 ), //
 Op("write", FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error , a5), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont)))))))))));
    }

    private final static Operation $error_message_1_11(Prolog m) { 
    // '$error_message'(system_error(A)):-!,'$fast_write'(user_error,'{SYSTEM ERROR: '),write(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1, a2;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(system_error(A)):-['$neck_cut','$fast_write'(user_error,'{SYSTEM ERROR: '),write(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_system_error_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BSYSTEM$0020ERROR$003A$0020 ), //
 Op("write", FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont)))));
    }

    private final static Operation $error_message_1_12(Prolog m) { 
    // '$error_message'(internal_error(A)):-!,'$fast_write'(user_error,'{INTERNAL ERROR: '),write(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1, a2;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(internal_error(A)):-['$neck_cut','$fast_write'(user_error,'{INTERNAL ERROR: '),write(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_internal_error_1 , m.trail, a2)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BINTERNAL$0020ERROR$003A$0020 ), //
 Op("write", FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont)))));
    }

    private final static Operation $error_message_1_13(Prolog m) { 
    // '$error_message'(java_error(A,B,C)):-!,'$fast_write'(user_error,'{JAVA ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,', found '),'$write_goal'(user_error,C),'$fast_write'(user_error,'}'),nl(user_error),'$print_stack_trace'(C),flush_output(user_error)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(java_error(A,B,C)):-['$neck_cut','$fast_write'(user_error,'{JAVA ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,', found '),'$write_goal'(user_error,C),'$fast_write'(user_error,'}'),nl(user_error),'$print_stack_trace'(C),flush_output(user_error)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_java_error_3 , m.trail, a2, a3, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007BJAVA$0020ERROR$003A$0020 ), //
 Op("$write_goal", FILE_system::PRED_$write_goal_2_static_exec, VA( ATOM_user_error , a2), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$0020$002D$0020arg$0020 ), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error , a3), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$002C$0020found$0020 ), //
 Op("$write_goal", FILE_system::PRED_$write_goal_2_static_exec, VA( ATOM_user_error , a4), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("$print_stack_trace", FILE_system::PRED_$print_stack_trace_1_static_exec, VA(a4), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont))))))))));
    }

    private final static Operation $error_message_1_14(Prolog m) { 
    // '$error_message'(A):-'$fast_write'(user_error,'{'),write(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
         Term a1;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$error_message'(A):-['$fast_write'(user_error,'{'),write(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
        return //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007B ), //
 Op("write", FILE_system::PRED_write_2_static_exec, VA( ATOM_user_error , a1), //
 Op("$fast_write", FILE_system::PRED_$fast_write_2_static_exec, VA( ATOM_user_error ,  ATOM_$007D ), //
 Op("nl", FILE_system::PRED_nl_1_static_exec, VA( ATOM_user_error ), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA( ATOM_user_error ), cont)))));
    }
/** PREDICATE: $write_goal/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$write_goal'/1,non-(public))




    public static Operation PRED_$write_goal_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_cafeteria::$write_goal_1_sub_1);
        return $write_goal_1_1(m);
    }

    private final static Operation $write_goal_1_sub_1(Prolog m) { 
        m.trust(null);
        return $write_goal_1_2(m);
    }

    private final static Operation $write_goal_1_1(Prolog m) { 
    // '$write_goal'(A):-java(A),!,'$write_toString'(user_error,A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$write_goal'(A):-['$get_level'(B),java(A),'$cut'(B),'$write_toString'(user_error,A)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of java(a(1))
        a1 = a1.dref();
        if (! (a1 .isJavaObject())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        return //
 Op("$write_toString", FILE_system::PRED_$write_toString_2_static_exec, VA( ATOM_user_error , a1), cont);
    }

    private final static Operation $write_goal_1_2(Prolog m) { 
    // '$write_goal'(A):-write(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$write_goal'(A):-[write(A)]
        return //
 Op("write", FILE_system::PRED_write_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: $write_goal/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl
*/
    // main('$write_goal'/2,non-(public))




    public static Operation PRED_$write_goal_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_cafeteria::$write_goal_2_sub_1);
        return $write_goal_2_1(m);
    }

    private final static Operation $write_goal_2_sub_1(Prolog m) { 
        m.trust(null);
        return $write_goal_2_2(m);
    }

    private final static Operation $write_goal_2_1(Prolog m) { 
    // '$write_goal'(A,B):-java(B),!,'$write_toString'(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_goal'(A,B):-['$get_level'(C),java(B),'$cut'(C),'$write_toString'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of java(a(2))
        a2 = a2.dref();
        if (! (a2 .isJavaObject())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return //
 Op("$write_toString", FILE_system::PRED_$write_toString_2_static_exec, VA(a1, a2), cont);
    }

    private final static Operation $write_goal_2_2(Prolog m) { 
    // '$write_goal'(A,B):-write(A,B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$write_goal'(A,B):-[write(A,B)]
        return //
 Op("write", FILE_system::PRED_write_2_static_exec, VA(a1, a2), cont);
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("cafeteria",0,FILE_cafeteria::PRED_cafeteria_0_static_exec);
   PredTable.registerBuiltin("$cafeteria_init",0,FILE_cafeteria::PRED_$cafeteria_init_0_static_exec);
   PredTable.registerBuiltin("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl","$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl",1,FILE_cafeteria::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl","$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl",1,FILE_cafeteria::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_1_static_exec);
   PredTable.registerBuiltin("$toplvel_loop",0,FILE_cafeteria::PRED_$toplvel_loop_0_static_exec);
   PredTable.registerBuiltin("$cafeteria",1,FILE_cafeteria::PRED_$cafeteria_1_static_exec);
   PredTable.registerBuiltin("$process_order",2,FILE_cafeteria::PRED_$process_order_2_static_exec);
   PredTable.registerBuiltin("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl","$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl",3,FILE_cafeteria::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_static_exec);
   PredTable.registerBuiltin("$rm_redundant_vars",2,FILE_cafeteria::PRED_$rm_redundant_vars_2_static_exec);
   PredTable.registerBuiltin("$give_answers_with_prompt",1,FILE_cafeteria::PRED_$give_answers_with_prompt_1_static_exec);
   PredTable.registerBuiltin("$give_an_answer",1,FILE_cafeteria::PRED_$give_an_answer_1_static_exec);
   PredTable.registerBuiltin("$print_an answer","$print_an$0020answer",1,FILE_cafeteria::PRED_$print_an$0020answer_1_static_exec);
   PredTable.registerBuiltin("consult",1,FILE_cafeteria::PRED_consult_1_static_exec);
   PredTable.registerBuiltin("$consult",1,FILE_cafeteria::PRED_$consult_1_static_exec);
   PredTable.registerBuiltin("$prolog_file_name",2,FILE_cafeteria::PRED_$prolog_file_name_2_static_exec);
   PredTable.registerBuiltin("trace",0,FILE_cafeteria::PRED_trace_0_static_exec);
   PredTable.registerBuiltin("$trace_init",0,FILE_cafeteria::PRED_$trace_init_0_static_exec);
   PredTable.registerBuiltin("notrace",0,FILE_cafeteria::PRED_notrace_0_static_exec);
   PredTable.registerBuiltin("debug",0,FILE_cafeteria::PRED_debug_0_static_exec);
   PredTable.registerBuiltin("nodebug",0,FILE_cafeteria::PRED_nodebug_0_static_exec);
   PredTable.registerBuiltin("$trace_goal",1,FILE_cafeteria::PRED_$trace_goal_1_static_exec);
   PredTable.registerBuiltin("$trace_goal",4,FILE_cafeteria::PRED_$trace_goal_4_static_exec);
   PredTable.registerBuiltin("print_procedure_box",5,FILE_cafeteria::PRED_print_procedure_box_5_static_exec);
   PredTable.registerBuiltin("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl","$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl",6,FILE_cafeteria::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_6_static_exec);
   PredTable.registerBuiltin("redo_procedure_box",4,FILE_cafeteria::PRED_redo_procedure_box_4_static_exec);
   PredTable.registerBuiltin("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/cafeteria.pl","$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl",3,FILE_cafeteria::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Frepl$002Fcafeteria$002Epl_3_static_exec);
   PredTable.registerBuiltin("$read_blocked",1,FILE_cafeteria::PRED_$read_blocked_1_static_exec);
   PredTable.registerBuiltin("$debug_option",2,FILE_cafeteria::PRED_$debug_option_2_static_exec);
   PredTable.registerBuiltin("$show_debug_option",0,FILE_cafeteria::PRED_$show_debug_option_0_static_exec);
   PredTable.registerBuiltin("$set_debug_flag",2,FILE_cafeteria::PRED_$set_debug_flag_2_static_exec);
   PredTable.registerBuiltin("spy",1,FILE_cafeteria::PRED_spy_1_static_exec);
   PredTable.registerBuiltin("$assert_spypoint",1,FILE_cafeteria::PRED_$assert_spypoint_1_static_exec);
   PredTable.registerBuiltin("nospy",1,FILE_cafeteria::PRED_nospy_1_static_exec);
   PredTable.registerBuiltin("$retract_spypoint",1,FILE_cafeteria::PRED_$retract_spypoint_1_static_exec);
   PredTable.registerBuiltin("nospyall",0,FILE_cafeteria::PRED_nospyall_0_static_exec);
   PredTable.registerBuiltin("leash",1,FILE_cafeteria::PRED_leash_1_static_exec);
   PredTable.registerBuiltin("$leash",1,FILE_cafeteria::PRED_$leash_1_static_exec);
   PredTable.registerBuiltin("$assert_leash",1,FILE_cafeteria::PRED_$assert_leash_1_static_exec);
   PredTable.registerBuiltin("$leash_specifier",1,FILE_cafeteria::PRED_$leash_specifier_1_static_exec);
   PredTable.registerBuiltin("listing",0,FILE_cafeteria::PRED_listing_0_static_exec);
   PredTable.registerBuiltin("listing",1,FILE_cafeteria::PRED_listing_1_static_exec);
   PredTable.registerBuiltin("$listing",2,FILE_cafeteria::PRED_$listing_2_static_exec);
   PredTable.registerBuiltin("$listing_dynamic_clause",2,FILE_cafeteria::PRED_$listing_dynamic_clause_2_static_exec);
   PredTable.registerBuiltin("$write_dynamic_clause",2,FILE_cafeteria::PRED_$write_dynamic_clause_2_static_exec);
   PredTable.registerBuiltin("$write_dynamic_head",2,FILE_cafeteria::PRED_$write_dynamic_head_2_static_exec);
   PredTable.registerBuiltin("$write_dynamic_body",2,FILE_cafeteria::PRED_$write_dynamic_body_2_static_exec);
   PredTable.registerBuiltin("print_message",2,FILE_cafeteria::PRED_print_message_2_static_exec);
   PredTable.registerBuiltin("nl",0,FILE_cafeteria::PRED_nl_0_static_exec);
   PredTable.registerBuiltin("$builtin_message",1,FILE_cafeteria::PRED_$builtin_message_1_static_exec);
   PredTable.registerBuiltin("$error_message",1,FILE_cafeteria::PRED_$error_message_1_static_exec);
   PredTable.registerBuiltin("$write_goal",1,FILE_cafeteria::PRED_$write_goal_1_static_exec);
   PredTable.registerBuiltin("$write_goal",2,FILE_cafeteria::PRED_$write_goal_2_static_exec);
}
}

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
public class FILE_run extends FILE_system {
/** PREDICATE: run/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(run/1,public)
        final static Functor ATOM_current_output = SYM("current_output");




    public static Operation PRED_run_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // run(A):-run(current_output,A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // run(A):-[run(current_output,A)]
        return //
 Op("run", FILE_run::PRED_run_2_static_exec, VA( ATOM_current_output , a1), cont);
    }
/** PREDICATE: run/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(run/2,public)
        final static Functor ATOM_$007Ep$007Et$007E18$007C$0020$007Et$007Ew$007E25$007C$0020$007Et$007Ew$007E32$007C$007En = SYM("~p~t~18| ~t~w~25| ~t~w~32|~n");
        final static Functor ATOM_Program = SYM("Program");
        final static Functor ATOM_Time = SYM("Time");
        final static Functor ATOM_GC = SYM("GC");
    private static final Compound L_run_2_s6 = CONS( ATOM_GC ,  Prolog.Nil );
    private static final Compound L_run_2_s7 = CONS( ATOM_Time , L_run_2_s6);
    private static final Compound L_run_2_s8 = CONS( ATOM_Program , L_run_2_s7);
        final static Functor ATOM_$007E$0060$003Dt$007E32$007C$007En = SYM("~`=t~32|~n");
        final static Functor FUNCTOR_total_3 = F("total",3);
    private static final Compound L_run_2_s13 = S( FUNCTOR_total_3 ,  int_0 ,  int_0 ,  int_0 );
        final static Functor FUNCTOR_program_3 = F("program",3);
        final static Functor FUNCTOR_run_program_4 = F("run_program",4);
        final static Functor FUNCTOR_$002F_2 = F("/",2);
        final static Functor ATOM_$007Et$007Ew$007E18$007C$0020$007Et$007E3f$007E25$007C$0020$007Et$007E3f$007E32$007C$007En = SYM("~t~w~18| ~t~3f~25| ~t~3f~32|~n");
        final static Functor ATOM_average = SYM("average");




    public static Operation PRED_run_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // run(A,B):-compile_programs,format(A,'~p~t~18| ~t~w~25| ~t~w~32|~n',['Program','Time','GC']),format(A,'~`=t~32|~n',[]),C=total(0,0,0),forall(program(D,E,B),run_program(D,E,A,C)),C=total(F,G,H),I is G/F,J is H/F,format(A,'~t~w~18| ~t~3f~25| ~t~3f~32|~n',[average,I,J])
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18;
        Operation p1, p2, p3, p4, p5, p6, p7, p8;
        a1 = LARG[0];
        a2 = LARG[1];
    // run(A,B):-[compile_programs,format(A,'~p~t~18| ~t~w~25| ~t~w~32|~n',['Program','Time','GC']),format(A,'~`=t~32|~n',[]),'$unify'(C,total(0,0,0)),forall(program(D,E,B),run_program(D,E,A,C)),'$unify'(C,total(F,G,H)),I is G/F,J is H/F,format(A,'~t~w~18| ~t~3f~25| ~t~3f~32|~n',[average,I,J])]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5),a(2)],y(1)),put_str(@('FUNCTOR_program_3'),y(1),a(6))
        a6 =  S( FUNCTOR_program_3 , a4, a5, a2);
 ;
    // put_str_args([a(4),a(5),a(1),a(3)],y(2)),put_str(@('FUNCTOR_run_program_4'),y(2),a(7))
        a7 =  S( FUNCTOR_run_program_4 , a4, a5, a1, a3);
 ;
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
    // put_str_args([a(8),a(9),a(10)],y(3)),put_str(@('FUNCTOR_total_3'),y(3),a(11))
        a11 =  S( FUNCTOR_total_3 , a8, a9, a10);
 ;
        a12 = m.mkvar1();
    // put_str_args([a(9),a(8)],y(4)),put_str(@('FUNCTOR_$002F_2'),y(4),a(13))
        a13 =  S( FUNCTOR_$002F_2 , a9, a8);
 ;
        a14 = m.mkvar1();
    // put_str_args([a(10),a(8)],y(5)),put_str(@('FUNCTOR_$002F_2'),y(5),a(15))
        a15 =  S( FUNCTOR_$002F_2 , a10, a8);
 ;
        a16 = CONS(a14,  Prolog.Nil );
        a17 = CONS(a12, a16);
        a18 = CONS( ATOM_average , a17);
        return //
 Op("compile_programs", FILE_run::PRED_compile_programs_0_static_exec, VA(), //
 Op("format", FILE_run::PRED_format_3_static_exec, VA(a1,  ATOM_$007Ep$007Et$007E18$007C$0020$007Et$007Ew$007E25$007C$0020$007Et$007Ew$007E32$007C$007En , L_run_2_s8), //
 Op("format", FILE_run::PRED_format_3_static_exec, VA(a1,  ATOM_$007E$0060$003Dt$007E32$007C$007En ,  Prolog.Nil ), //
 Op("$unify", FILE_run::PRED_$unify_2_static_exec, VA(a3, L_run_2_s13), //
 Op("forall", FILE_run::PRED_forall_2_static_exec, VA(a6, a7), //
 Op("$unify", FILE_run::PRED_$unify_2_static_exec, VA(a3, a11), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a12, a13), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a14, a15), //
 Op("format", FILE_run::PRED_format_3_static_exec, VA(a1,  ATOM_$007Et$007Ew$007E18$007C$0020$007Et$007E3f$007E25$007C$0020$007Et$007E3f$007E32$007C$007En , a18), cont)))))))));
    }
/** PREDICATE: compile_programs/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(compile_programs/0,public)
        final static Functor FUNCTOR_$002D_1 = F("-",1);
        final static Functor ATOM_singleton = SYM("singleton");
    private static final Compound L_compile_programs_0_s4 = S( FUNCTOR_$002D_1 ,  ATOM_singleton );
        final static Functor FUNCTOR_program_2 = F("program",2);
        final static Functor FUNCTOR_load_files_2 = F("load_files",2);
        final static Functor FUNCTOR_module_colon_2 = F(":",2);
        final static Functor FUNCTOR_bench_1 = F("bench",1);
        final static Functor FUNCTOR_silent_1 = F("silent",1);
    private static final Compound L_compile_programs_0_s12 = S( FUNCTOR_silent_1 ,  Prolog.True );
        final static Functor FUNCTOR_if_1 = F("if",1);
        final static Functor ATOM_changed = SYM("changed");
    private static final Compound L_compile_programs_0_s16 = S( FUNCTOR_if_1 ,  ATOM_changed );
    private static final Compound L_compile_programs_0_s18 = CONS(L_compile_programs_0_s16,  Prolog.Nil );
    private static final Compound L_compile_programs_0_s19 = CONS(L_compile_programs_0_s12, L_compile_programs_0_s18);




    public static Operation PRED_compile_programs_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // compile_programs:-style_check(-singleton),forall(program(A,B),load_files(A:bench(A),[silent(true),if(changed)]))
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1;
    // compile_programs:-[style_check(-singleton),forall(program(A,B),load_files(A:bench(A),[silent(true),if(changed)]))]
        a1 = m.mkvar1();
    // put_str_args([a(1),void],y(1)),put_str(@('FUNCTOR_program_2'),y(1),a(2))
        a2 =  S( FUNCTOR_program_2 , a1, m.mkvar3());
 ;
    // put_str_args([a(1)],y(2)),put_str(@('FUNCTOR_bench_1'),y(2),a(3))
        a3 =  S( FUNCTOR_bench_1 , a1);
 ;
    // put_str_args([a(1),a(3)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(4))
        a4 =  S( FUNCTOR_module_colon_2 , a1, a3);
 ;
    // put_str_args([a(4),s(19)],y(4)),put_str(@('FUNCTOR_load_files_2'),y(4),a(5))
        a5 =  S( FUNCTOR_load_files_2 , a4, L_compile_programs_0_s19);
 ;
        return //
 Op("style_check", FILE_run::PRED_style_check_1_static_exec, VA(L_compile_programs_0_s4), //
 Op("forall", FILE_run::PRED_forall_2_static_exec, VA(a2, a5), cont));
    }
/** PREDICATE: run_program/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(run_program/4,public)
        final static Functor ATOM_$007Ep$007Et$007E18$007C$0020$007Et$007E3f$007E25$007C$0020$007Et$007E3f$007E32$007C$007En = SYM("~p~t~18| ~t~3f~25| ~t~3f~32|~n");




    public static Operation PRED_run_program_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // run_program(A,B,C,D):-ntimes(A,B,E,F),!,add(1,D,1),add(2,D,E),add(3,D,F),format(C,'~p~t~18| ~t~3f~25| ~t~3f~32|~n',[A,E,F])
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4, p5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // run_program(A,B,C,D):-['$get_level'(E),ntimes(A,B,F,G),'$cut'(E),add(1,D,1),add(2,D,F),add(3,D,G),format(C,'~p~t~18| ~t~3f~25| ~t~3f~32|~n',[A,F,G])]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = CONS(a7,  Prolog.Nil );
        a9 = CONS(a6, a8);
        a10 = CONS(a1, a9);
        return //
 Op("ntimes", FILE_run::PRED_ntimes_4_static_exec, VA(a1, a2, a6, a7), //
 Op("$cut", FILE_run::PRED_$cut_1_static_exec, VA(a5), //
 Op("add", FILE_run::PRED_add_3_static_exec, VA( int_1 , a4,  int_1 ), //
 Op("add", FILE_run::PRED_add_3_static_exec, VA( int_2 , a4, a6), //
 Op("add", FILE_run::PRED_add_3_static_exec, VA( int_3 , a4, a7), //
 Op("format", FILE_run::PRED_format_3_static_exec, VA(a3,  ATOM_$007Ep$007Et$007E18$007C$0020$007Et$007E3f$007E25$007C$0020$007Et$007E3f$007E32$007C$007En , a10), cont))))));
    }
/** PREDICATE: add/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(add/3,public)
        final static Functor FUNCTOR_$002B_2 = F("+",2);




    public static Operation PRED_add_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // add(A,B,C):-arg(A,B,D),E is D+C,nb_setarg(A,B,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // add(A,B,C):-[arg(A,B,D),E is D+C,nb_setarg(A,B,E)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(3)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a4, a3);
 ;
        return //
 Op("arg", FILE_run::PRED_arg_3_static_exec, VA(a1, a2, a4), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a5, a6), //
 Op("nb_setarg", sxxtensions::PRED_nb_setarg_3_static_exec, VA(a1, a2, a5), cont)));
    }
/** PREDICATE: get_performance_stats/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(get_performance_stats/2,public)
        final static Functor ATOM_gctime = SYM("gctime");
        final static Functor ATOM_cputime = SYM("cputime");




    public static Operation PRED_get_performance_stats_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // get_performance_stats(A,B):-statistics(gctime,A),statistics(cputime,B)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // get_performance_stats(A,B):-[statistics(gctime,A),statistics(cputime,B)]
        return //
 Op("statistics", FILE_run::PRED_statistics_2_static_exec, VA( ATOM_gctime , a1), //
 Op("statistics", FILE_run::PRED_statistics_2_static_exec, VA( ATOM_cputime , a2), cont));
    }
/** PREDICATE: ntimes/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(ntimes/4,public)
        final static Functor FUNCTOR_$002D_2 = F("-",2);




    public static Operation PRED_ntimes_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // ntimes(A,B,C,D):-get_performance_stats(E,F),ntimes(A,B),get_performance_stats(G,H),ntimes_dummy(B),get_performance_stats(I,J),C is H-F-(J-H),D is G-E-(I-G)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation p1, p2, p3, p4, p5, p6;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // ntimes(A,B,C,D):-[get_performance_stats(E,F),ntimes(A,B),get_performance_stats(G,H),ntimes_dummy(B),get_performance_stats(I,J),C is H-F-(J-H),D is G-E-(I-G)]
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
    // put_str_args([a(8),a(6)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(11))
        a11 =  S( FUNCTOR_$002D_2 , a8, a6);
 ;
    // put_str_args([a(10),a(8)],y(2)),put_str(@('FUNCTOR_$002D_2'),y(2),a(12))
        a12 =  S( FUNCTOR_$002D_2 , a10, a8);
 ;
    // put_str_args([a(11),a(12)],y(3)),put_str(@('FUNCTOR_$002D_2'),y(3),a(13))
        a13 =  S( FUNCTOR_$002D_2 , a11, a12);
 ;
    // put_str_args([a(7),a(5)],y(4)),put_str(@('FUNCTOR_$002D_2'),y(4),a(14))
        a14 =  S( FUNCTOR_$002D_2 , a7, a5);
 ;
    // put_str_args([a(9),a(7)],y(5)),put_str(@('FUNCTOR_$002D_2'),y(5),a(15))
        a15 =  S( FUNCTOR_$002D_2 , a9, a7);
 ;
    // put_str_args([a(14),a(15)],y(6)),put_str(@('FUNCTOR_$002D_2'),y(6),a(16))
        a16 =  S( FUNCTOR_$002D_2 , a14, a15);
 ;
        return //
 Op("get_performance_stats", FILE_run::PRED_get_performance_stats_2_static_exec, VA(a5, a6), //
 Op("ntimes", FILE_run::PRED_ntimes_2_static_exec, VA(a1, a2), //
 Op("get_performance_stats", FILE_run::PRED_get_performance_stats_2_static_exec, VA(a7, a8), //
 Op("ntimes_dummy", FILE_run::PRED_ntimes_dummy_1_static_exec, VA(a2), //
 Op("get_performance_stats", FILE_run::PRED_get_performance_stats_2_static_exec, VA(a9, a10), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a3, a13), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a4, a16), cont)))))));
    }
/** PREDICATE: ntimes/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(ntimes/2,public)




    public static Operation PRED_ntimes_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_run::ntimes_2_sub_1);
        return ntimes_2_1(m);
    }

    private final static Operation ntimes_2_sub_1(Prolog m) { 
        m.trust(null);
        return ntimes_2_2(m);
    }

    private final static Operation ntimes_2_1(Prolog m) { 
    // ntimes(A,B):-B=:=0,!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // ntimes(A,B):-['$get_level'(C),D is 0,'$arith_equal'(B,D),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        //START inline expansion of a(4)is@(int_0)
        if (! a4.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $arith_equal(a(2),a(4))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a4)) != 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation ntimes_2_2(Prolog m) { 
    // ntimes(A,B):-not_not_top(A),!,C is B-1,ntimes(A,C)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // ntimes(A,B):-['$get_level'(C),not_not_top(A),'$cut'(C),D is B-1,ntimes(A,D)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
    // put_str_args([a(2),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002D_2 , a2,  int_1 );
 ;
        return //
 Op("not_not_top", FILE_run::PRED_not_not_top_1_static_exec, VA(a1), //
 Op("$cut", FILE_run::PRED_$cut_1_static_exec, VA(a3), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a4, a5), //
 Op("ntimes", FILE_run::PRED_ntimes_2_static_exec, VA(a1, a4), cont))));
    }
/** PREDICATE: ntimes_dummy/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(ntimes_dummy/1,public)




    public static Operation PRED_ntimes_dummy_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_run::ntimes_dummy_1_sub_1);
        return ntimes_dummy_1_1(m);
    }

    private final static Operation ntimes_dummy_1_sub_1(Prolog m) { 
        m.trust(null);
        return ntimes_dummy_1_2(m);
    }

    private final static Operation ntimes_dummy_1_1(Prolog m) { 
    // ntimes_dummy(A):-A=:=0,!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ntimes_dummy(A):-['$get_level'(B),C is 0,'$arith_equal'(A,C),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
        //START inline expansion of a(3)is@(int_0)
        if (! a3.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $arith_equal(a(1),a(3))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a3)) != 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(2))
        a2 = a2.dref();
                  m.cut( a2.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation ntimes_dummy_1_2(Prolog m) { 
    // ntimes_dummy(A):-not_not_dummy,!,B is A-1,ntimes_dummy(B)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ntimes_dummy(A):-['$get_level'(B),not_not_dummy,'$cut'(B),C is A-1,ntimes_dummy(C)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$002D_2 , a1,  int_1 );
 ;
        return //
 Op("not_not_dummy", FILE_run::PRED_not_not_dummy_0_static_exec, VA(), //
 Op("$cut", FILE_run::PRED_$cut_1_static_exec, VA(a2), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a3, a4), //
 Op("ntimes_dummy", FILE_run::PRED_ntimes_dummy_1_static_exec, VA(a3), cont))));
    }
/** PREDICATE: not_not_top/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(not_not_top/1,public)




    public static Operation PRED_not_not_top_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_run::not_not_top_1_sub_1);
        return not_not_top_1_1(m);
    }

    private final static Operation not_not_top_1_sub_1(Prolog m) { 
        m.trust(null);
        return not_not_top_1_2(m);
    }

    private final static Operation not_not_top_1_1(Prolog m) { 
    // not_not_top(A):-not_top(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // not_not_top(A):-['$get_level'(B),not_top(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("not_top", FILE_run::PRED_not_top_1_static_exec, VA(a1), //
 Op("$cut", FILE_run::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation not_not_top_1_2(Prolog m) { 
    // not_not_top(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // not_not_top(A):-[]
        return cont;
    }
/** PREDICATE: not_top/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(not_top/1,public)
        final static Functor ATOM_top = SYM("top");




    public static Operation PRED_not_top_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_run::not_top_1_sub_1);
        return not_top_1_1(m);
    }

    private final static Operation not_top_1_sub_1(Prolog m) { 
        m.trust(null);
        return not_top_1_2(m);
    }

    private final static Operation not_top_1_1(Prolog m) { 
    // not_top(A):-A:top,!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // not_top(A):-['$get_level'(B),call(A:top),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),@('ATOM_top')],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 , a1,  ATOM_top );
 ;
        return //
 Op("call", FILE_run::PRED_call_1_static_exec, VA(a3), //
 Op("$cut", FILE_run::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation not_top_1_2(Prolog m) { 
    // not_top(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // not_top(A):-[]
        return cont;
    }
/** PREDICATE: not_not_dummy/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(not_not_dummy/0,public)




    public static Operation PRED_not_not_dummy_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry0(null, FILE_run::not_not_dummy_0_sub_1);
        return not_not_dummy_0_1(m);
    }

    private final static Operation not_not_dummy_0_sub_1(Prolog m) { 
        m.trust(null);
        return not_not_dummy_0_2(m);
    }

    private final static Operation not_not_dummy_0_1(Prolog m) { 
    // not_not_dummy:-not_dummy,!,fail
         Term a1;
        Operation p1, p2;
        Operation cont;
        cont = m.cont;
    // not_not_dummy:-['$get_level'(A),not_dummy,'$cut'(A),fail]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("not_dummy", FILE_run::PRED_not_dummy_0_static_exec, VA(), //
 Op("$cut", FILE_run::PRED_$cut_1_static_exec, VA(a1), fail_0));
    }

    private final static Operation not_not_dummy_0_2(Prolog m) { 
    // not_not_dummy:-true
        Operation cont;
        cont = m.cont;
    // not_not_dummy:-[]
        return cont;
    }
/** PREDICATE: not_dummy/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(not_dummy/0,public)




    public static Operation PRED_not_dummy_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry0(null, FILE_run::not_dummy_0_sub_1);
        return not_dummy_0_1(m);
    }

    private final static Operation not_dummy_0_sub_1(Prolog m) { 
        m.trust(null);
        return not_dummy_0_2(m);
    }

    private final static Operation not_dummy_0_1(Prolog m) { 
    // not_dummy:-dummy,!,fail
         Term a1;
        Operation p1, p2;
        Operation cont;
        cont = m.cont;
    // not_dummy:-['$get_level'(A),dummy,'$cut'(A),fail]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("dummy", FILE_run::PRED_dummy_0_static_exec, VA(), //
 Op("$cut", FILE_run::PRED_$cut_1_static_exec, VA(a1), fail_0));
    }

    private final static Operation not_dummy_0_2(Prolog m) { 
    // not_dummy:-true
        Operation cont;
        cont = m.cont;
    // not_dummy:-[]
        return cont;
    }
/** PREDICATE: dummy/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(dummy/0,public)




    public static Operation PRED_dummy_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dummy:-true
        m.setB0();
    // dummy:-[]
        return cont;
    }
/** PREDICATE: tune_counts/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(tune_counts/0,public)
        final static Functor FUNCTOR_$002C_2 = F(",",2);
        final static Functor FUNCTOR_tune_count_2 = F("tune_count",2);
        final static Functor FUNCTOR_format_2 = F("format",2);
        final static Functor ATOM_$007Eq$002E$007En = SYM("~q.~n");




    public static Operation PRED_tune_counts_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // tune_counts:-forall(program(A,B),(tune_count(A,C),format('~q.~n',[program(A,C)])))
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8;
    // tune_counts:-[forall(program(A,B),(tune_count(A,C),format('~q.~n',[program(A,C)])))]
        a1 = m.mkvar1();
    // put_str_args([a(1),void],y(1)),put_str(@('FUNCTOR_program_2'),y(1),a(2))
        a2 =  S( FUNCTOR_program_2 , a1, m.mkvar3());
 ;
        a3 = m.mkvar1();
    // put_str_args([a(1),a(3)],y(2)),put_str(@('FUNCTOR_tune_count_2'),y(2),a(4))
        a4 =  S( FUNCTOR_tune_count_2 , a1, a3);
 ;
    // put_str_args([a(1),a(3)],y(3)),put_str(@('FUNCTOR_program_2'),y(3),a(5))
        a5 =  S( FUNCTOR_program_2 , a1, a3);
 ;
        a6 = CONS(a5,  Prolog.Nil );
    // put_str_args([@('ATOM_$007Eq$002E$007En'),a(6)],y(4)),put_str(@('FUNCTOR_format_2'),y(4),a(7))
        a7 =  S( FUNCTOR_format_2 ,  ATOM_$007Eq$002E$007En , a6);
 ;
    // put_str_args([a(4),a(7)],y(5)),put_str(@('FUNCTOR_$002C_2'),y(5),a(8))
        a8 =  S( FUNCTOR_$002C_2 , a4, a7);
 ;
        return //
 Op("forall", FILE_run::PRED_forall_2_static_exec, VA(a2, a8), cont);
    }
/** PREDICATE: tune_count/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(tune_count/2,public)
        final static NumberTerm int_100 = Integer(100);
        final static Functor FUNCTOR_$003C$003C_2 = F("<<",2);
    private static final NumberTerm sf4 = Float(0.5);
        final static Functor FUNCTOR_round_1 = F("round",1);
        final static Functor FUNCTOR_$002A_2 = F("*",2);




    public static Operation PRED_tune_count_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // tune_count(A,B):-between(1,100,C),D is 1<<C,ntimes(A,D,E,F),E>0.5,!,B is round(D*(1/E))
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4, p5, p6;
        a1 = LARG[0];
        a2 = LARG[1];
    // tune_count(A,B):-['$get_level'(C),between(1,100,D),E is 1<<D,ntimes(A,E,F,G),H is 0.5,'$greater_than'(F,H),'$cut'(C),B is round(E*(1/F))]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([@(int_1),a(4)],y(1)),put_str(@('FUNCTOR_$003C$003C_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$003C$003C_2 ,  int_1 , a4);
 ;
        a7 = m.mkvar1();
        a8 = m.mkvar1();
    // put_str_args([@(int_1),a(7)],y(2)),put_str(@('FUNCTOR_$002F_2'),y(2),a(9))
        a9 =  S( FUNCTOR_$002F_2 ,  int_1 , a7);
 ;
    // put_str_args([a(5),a(9)],y(3)),put_str(@('FUNCTOR_$002A_2'),y(3),a(10))
        a10 =  S( FUNCTOR_$002A_2 , a5, a9);
 ;
    // put_str_args([a(10)],y(4)),put_str(@('FUNCTOR_round_1'),y(4),a(11))
        a11 =  S( FUNCTOR_round_1 , a10);
 ;
        return //
 Op("between", FILE_run::PRED_between_3_static_exec, VA( int_1 ,  int_100 , a4), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a5, a6), //
 Op("ntimes", FILE_run::PRED_ntimes_4_static_exec, VA(a1, a5, a7, m.DONT_CARE2()), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a8, sf4), //
 Op("$greater_than", FILE_run::PRED_$greater_than_2_static_exec, VA(a7, a8), //
 Op("$cut", FILE_run::PRED_$cut_1_static_exec, VA(a3), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a2, a11), cont)))))));
    }
/** PREDICATE: program/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(program/3,public)
        final static Functor FUNCTOR_max_2 = F("max",2);




    public static Operation PRED_program_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // program(A,B,C):-program(A,D),B is max(1,round(D*C))
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // program(A,B,C):-[program(A,D),B is max(1,round(D*C))]
        a4 = m.mkvar1();
    // put_str_args([a(4),a(3)],y(1)),put_str(@('FUNCTOR_$002A_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002A_2 , a4, a3);
 ;
    // put_str_args([a(5)],y(2)),put_str(@('FUNCTOR_round_1'),y(2),a(6))
        a6 =  S( FUNCTOR_round_1 , a5);
 ;
    // put_str_args([@(int_1),a(6)],y(3)),put_str(@('FUNCTOR_max_2'),y(3),a(7))
        a7 =  S( FUNCTOR_max_2 ,  int_1 , a6);
 ;
        return //
 Op("program", FILE_run::PRED_program_2_static_exec, VA(a1, a4), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a2, a7), cont));
    }
/** PREDICATE: program/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(program/2,public)
        final static Functor ATOM_boyer = SYM("boyer");
        final static Functor ATOM_browse = SYM("browse");
        final static Functor ATOM_chat_parser = SYM("chat_parser");
        final static NumberTerm int_46 = Integer(46);
        final static Functor ATOM_crypt = SYM("crypt");
        final static NumberTerm int_868 = Integer(868);
        final static Functor ATOM_fast_mu = SYM("fast_mu");
        final static NumberTerm int_4819 = Integer(4819);
        final static Functor ATOM_flatten = SYM("flatten");
        final static NumberTerm int_8275 = Integer(8275);
        final static Functor ATOM_meta_qsort = SYM("meta_qsort");
        final static NumberTerm int_966 = Integer(966);
        final static Functor ATOM_mu = SYM("mu");
        final static NumberTerm int_6827 = Integer(6827);
        final static Functor ATOM_nreverse = SYM("nreverse");
        final static NumberTerm int_11378 = Integer(11378);
        final static Functor ATOM_poly_10 = SYM("poly_10");
        final static NumberTerm int_105 = Integer(105);
        final static Functor ATOM_prover = SYM("prover");
        final static NumberTerm int_6400 = Integer(6400);
        final static Functor ATOM_qsort = SYM("qsort");
        final static NumberTerm int_8445 = Integer(8445);
        final static Functor ATOM_queens_8 = SYM("queens_8");
        final static NumberTerm int_63 = Integer(63);
        final static Functor ATOM_query = SYM("query");
        final static NumberTerm int_1219 = Integer(1219);
        final static Functor ATOM_reducer = SYM("reducer");
        final static NumberTerm int_164 = Integer(164);
        final static Functor ATOM_sendmore = SYM("sendmore");
        final static NumberTerm int_44 = Integer(44);
        final static Functor ATOM_simple_analyzer = SYM("simple_analyzer");
        final static NumberTerm int_320 = Integer(320);
        final static Functor ATOM_tak = SYM("tak");
        final static NumberTerm int_35 = Integer(35);
        final static Functor ATOM_zebra = SYM("zebra");
        final static NumberTerm int_166 = Integer(166);




    public static Operation PRED_program_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_run::program_2_var, fail_0, fail_0, FILE_run::program_2_var, fail_0, fail_0); 
    }

    private final static Operation program_2_var(Prolog m) { 
        m.jtry2(null, FILE_run::program_2_var_1);
        return program_2_1(m);
    }

    private final static Operation program_2_var_1(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_2);
        return program_2_2(m);
    }

    private final static Operation program_2_var_2(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_3);
        return program_2_3(m);
    }

    private final static Operation program_2_var_3(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_4);
        return program_2_4(m);
    }

    private final static Operation program_2_var_4(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_5);
        return program_2_5(m);
    }

    private final static Operation program_2_var_5(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_6);
        return program_2_6(m);
    }

    private final static Operation program_2_var_6(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_7);
        return program_2_7(m);
    }

    private final static Operation program_2_var_7(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_8);
        return program_2_8(m);
    }

    private final static Operation program_2_var_8(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_9);
        return program_2_9(m);
    }

    private final static Operation program_2_var_9(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_10);
        return program_2_10(m);
    }

    private final static Operation program_2_var_10(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_11);
        return program_2_11(m);
    }

    private final static Operation program_2_var_11(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_12);
        return program_2_12(m);
    }

    private final static Operation program_2_var_12(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_13);
        return program_2_13(m);
    }

    private final static Operation program_2_var_13(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_14);
        return program_2_14(m);
    }

    private final static Operation program_2_var_14(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_15);
        return program_2_15(m);
    }

    private final static Operation program_2_var_15(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_16);
        return program_2_16(m);
    }

    private final static Operation program_2_var_16(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_17);
        return program_2_17(m);
    }

    private final static Operation program_2_var_17(Prolog m) { 
        m.retry(null, FILE_run::program_2_var_18);
        return program_2_18(m);
    }

    private final static Operation program_2_var_18(Prolog m) { 
        m.trust(null);
        return program_2_19(m);
    }

    private final static Operation program_2_1(Prolog m) { 
    // program(boyer,8):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(boyer,8):-[]
        if (!  ATOM_boyer .unify(a1, m.trail))
            return m.fail();
        if (!  int_8 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_2(Prolog m) { 
    // program(browse,7):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(browse,7):-[]
        if (!  ATOM_browse .unify(a1, m.trail))
            return m.fail();
        if (!  int_7 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_3(Prolog m) { 
    // program(chat_parser,46):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(chat_parser,46):-[]
        if (!  ATOM_chat_parser .unify(a1, m.trail))
            return m.fail();
        if (!  int_46 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_4(Prolog m) { 
    // program(crypt,868):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(crypt,868):-[]
        if (!  ATOM_crypt .unify(a1, m.trail))
            return m.fail();
        if (!  int_868 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_5(Prolog m) { 
    // program(fast_mu,4819):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(fast_mu,4819):-[]
        if (!  ATOM_fast_mu .unify(a1, m.trail))
            return m.fail();
        if (!  int_4819 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_6(Prolog m) { 
    // program(flatten,8275):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(flatten,8275):-[]
        if (!  ATOM_flatten .unify(a1, m.trail))
            return m.fail();
        if (!  int_8275 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_7(Prolog m) { 
    // program(meta_qsort,966):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(meta_qsort,966):-[]
        if (!  ATOM_meta_qsort .unify(a1, m.trail))
            return m.fail();
        if (!  int_966 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_8(Prolog m) { 
    // program(mu,6827):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(mu,6827):-[]
        if (!  ATOM_mu .unify(a1, m.trail))
            return m.fail();
        if (!  int_6827 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_9(Prolog m) { 
    // program(nreverse,11378):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(nreverse,11378):-[]
        if (!  ATOM_nreverse .unify(a1, m.trail))
            return m.fail();
        if (!  int_11378 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_10(Prolog m) { 
    // program(poly_10,105):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(poly_10,105):-[]
        if (!  ATOM_poly_10 .unify(a1, m.trail))
            return m.fail();
        if (!  int_105 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_11(Prolog m) { 
    // program(prover,6400):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(prover,6400):-[]
        if (!  ATOM_prover .unify(a1, m.trail))
            return m.fail();
        if (!  int_6400 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_12(Prolog m) { 
    // program(qsort,8445):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(qsort,8445):-[]
        if (!  ATOM_qsort .unify(a1, m.trail))
            return m.fail();
        if (!  int_8445 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_13(Prolog m) { 
    // program(queens_8,63):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(queens_8,63):-[]
        if (!  ATOM_queens_8 .unify(a1, m.trail))
            return m.fail();
        if (!  int_63 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_14(Prolog m) { 
    // program(query,1219):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(query,1219):-[]
        if (!  ATOM_query .unify(a1, m.trail))
            return m.fail();
        if (!  int_1219 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_15(Prolog m) { 
    // program(reducer,164):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(reducer,164):-[]
        if (!  ATOM_reducer .unify(a1, m.trail))
            return m.fail();
        if (!  int_164 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_16(Prolog m) { 
    // program(sendmore,44):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(sendmore,44):-[]
        if (!  ATOM_sendmore .unify(a1, m.trail))
            return m.fail();
        if (!  int_44 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_17(Prolog m) { 
    // program(simple_analyzer,320):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(simple_analyzer,320):-[]
        if (!  ATOM_simple_analyzer .unify(a1, m.trail))
            return m.fail();
        if (!  int_320 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_18(Prolog m) { 
    // program(tak,35):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(tak,35):-[]
        if (!  ATOM_tak .unify(a1, m.trail))
            return m.fail();
        if (!  int_35 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation program_2_19(Prolog m) { 
    // program(zebra,166):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // program(zebra,166):-[]
        if (!  ATOM_zebra .unify(a1, m.trail))
            return m.fail();
        if (!  int_166 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: run_interleaved/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(run_interleaved/1,public)
        final static Functor FUNCTOR_seq_interleaved_1 = F("seq_interleaved",1);
        final static Functor ATOM_SxxMachine = SYM("SxxMachine");
        final static Functor ATOM_rni = SYM("rni");
    private static final Compound L_run_interleaved_1_s7 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine ,  ATOM_rni );
        final static Functor FUNCTOR_$003A$002D_2 = F(":-",2);




    public static Operation PRED_run_interleaved_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // run_interleaved(A):-compile_programs,findall(B-C,program(C,B,A),D),phrase(seq_interleaved(D),E),seq_clause(E,F),retractall(rni),assert((rni:-F),G),garbage_collect,time(rni),erase(G)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4, p5, p6, p7, p8;
        a1 = LARG[0];
    // run_interleaved(A):-[compile_programs,findall(B-C,'SxxMachine':program(C,B,A),D),phrase(seq_interleaved(D),E),seq_clause(E,F),retractall('SxxMachine':rni),assert('SxxMachine':(rni:-F),G),garbage_collect,time(rni),erase(G)]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$002D_2 , a2, a3);
 ;
        a5 = Closure( //
 Op("program", FILE_run::PRED_program_3_static_exec, VA(a3, a2, a1), null));
        a6 = m.mkvar1();
    // put_str_args([a(6)],y(2)),put_str(@('FUNCTOR_seq_interleaved_1'),y(2),a(7))
        a7 =  S( FUNCTOR_seq_interleaved_1 , a6);
 ;
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([@('ATOM_rni'),a(9)],y(3)),put_str(@('FUNCTOR_$003A$002D_2'),y(3),a(10))
        a10 =  S( FUNCTOR_$003A$002D_2 ,  ATOM_rni , a9);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(10)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(11))
        a11 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a10);
 ;
        a12 = m.mkvar1();
        return //
 Op("compile_programs", FILE_run::PRED_compile_programs_0_static_exec, VA(), //
 Op("findall", FILE_run::PRED_findall_3_static_exec, VA(a4, a5, a6), //
 Op("phrase", FILE_run::PRED_phrase_2_static_exec, VA(a7, a8), //
 Op("seq_clause", FILE_run::PRED_seq_clause_2_static_exec, VA(a8, a9), //
 Op("retractall", FILE_run::PRED_retractall_1_static_exec, VA(L_run_interleaved_1_s7), //
 Op("assert", FILE_run::PRED_assert_2_static_exec, VA(a11, a12), //
 Op("garbage_collect", FILE_run::PRED_garbage_collect_0_static_exec, VA(), //
 Op("time", FILE_run::PRED_time_1_static_exec, VA( ATOM_rni ), //
 Op("erase", FILE_run::PRED_erase_1_static_exec, VA(a12), cont)))))))));
    }
/** PREDICATE: seq_interleaved/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(seq_interleaved/3,public)




    public static Operation PRED_seq_interleaved_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_run::seq_interleaved_3_var, FILE_run::seq_interleaved_3_2, FILE_run::seq_interleaved_3_2, FILE_run::seq_interleaved_3_var, FILE_run::seq_interleaved_3_2, FILE_run::seq_interleaved_3_2); 
    }

    private final static Operation seq_interleaved_3_var(Prolog m) { 
        m.jtry3(null, FILE_run::seq_interleaved_3_var_1);
        return seq_interleaved_3_1(m);
    }

    private final static Operation seq_interleaved_3_var_1(Prolog m) { 
        m.trust(null);
        return seq_interleaved_3_2(m);
    }

    private final static Operation seq_interleaved_3_1(Prolog m) { 
    // seq_interleaved([],A,B):-!,B=A
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // seq_interleaved([],A,B):-['$neck_cut','$unify'(B,A)]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of $unify(a(3),a(2))
        if (! a3.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation seq_interleaved_3_2(Prolog m) { 
    // seq_interleaved(A,B,C):-seq_interleaved(A,D,B,E),seq_interleaved(D,E,C)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // seq_interleaved(A,B,C):-[seq_interleaved(A,D,B,E),seq_interleaved(D,E,C)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op("seq_interleaved", FILE_run::PRED_seq_interleaved_4_static_exec, VA(a1, a4, a2, a5), //
 Op("seq_interleaved", FILE_run::PRED_seq_interleaved_3_static_exec, VA(a4, a5, a3), cont));
    }
/** PREDICATE: seq_interleaved/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(seq_interleaved/4,public)




    public static Operation PRED_seq_interleaved_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return seq_interleaved_4_top(m);
    }

    private final static Operation seq_interleaved_4_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_run::seq_interleaved_4_var, fail_0, fail_0, FILE_run::seq_interleaved_4_1, fail_0, FILE_run::seq_interleaved_4_lis); 
    }

    private final static Operation seq_interleaved_4_var(Prolog m) { 
        m.jtry4(null, FILE_run::seq_interleaved_4_var_1);
        return seq_interleaved_4_1(m);
    }

    private final static Operation seq_interleaved_4_var_1(Prolog m) { 
        m.retry(null, FILE_run::seq_interleaved_4_var_2);
        return seq_interleaved_4_2(m);
    }

    private final static Operation seq_interleaved_4_var_2(Prolog m) { 
        m.trust(null);
        return seq_interleaved_4_3(m);
    }

    private final static Operation seq_interleaved_4_lis(Prolog m) { 
        m.jtry4(null, FILE_run::seq_interleaved_4_lis_1);
        return seq_interleaved_4_2(m);
    }

    private final static Operation seq_interleaved_4_lis_1(Prolog m) { 
        m.trust(null);
        return seq_interleaved_4_3(m);
    }

    private final static Operation seq_interleaved_4_1(Prolog m) { 
    // seq_interleaved([],[],A,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // seq_interleaved([],[],A,A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation seq_interleaved_4_2(Prolog m) { 
    // seq_interleaved([1-A|B],C,D,E):-(!,F=D),F=[A|G],seq_interleaved(B,C,G,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // seq_interleaved([1-A|B],C,D,E):-['$neck_cut','$unify'(F,D),'$unify'(F,[A|G]),seq_interleaved(B,C,G,E)]
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
        a5 = a5.dref();
            a7 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_$002D_2 , m.trail,  int_1 , a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a8 = m.mkvar1();
        //START inline expansion of $unify(a(8),a(3))
        if (! a8.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a9 = m.mkvar1();
        a10 = CONS(a7, a9);
        //START inline expansion of $unify(a(8),a(10))
        if (! a8.unify(a10, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
        m.AREGS[2] = a9;
        m.AREGS[3] = a4;
m.cont = cont;
        return seq_interleaved_4_top(m);
    }

    private final static Operation seq_interleaved_4_3(Prolog m) { 
    // seq_interleaved([A-B|C],[D-B|E],[B|F],G):-(D is A-1,H=F),seq_interleaved(C,E,H,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // seq_interleaved([A-B|C],[D-B|E],[B|F],G):-[D is A-1,'$unify'(H,F),seq_interleaved(C,E,H,G)]
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
        a5 = a5.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_$002D_2 , m.trail, a7, a8)){
                return m.fail();
            }
        a2 = a2.dref();
        if (a2 .isCons()){
                        a9 = a2.car();
            a10 = a2.cdr();
        } else if (a2.isVar()){
            a9 = m.mkvar2();
            a10 = m.mkvar2();
             a2.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        a9 = a9.dref();
            a11 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_$002D_2 , m.trail, a11, a8)){
                return m.fail();
            }
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a8.unify(a3.car(), m.trail))
                return m.fail();
            a12 = a3.cdr();
        } else if (a3.isVar()){
            a12 = m.mkvar2();
             a3.bind(CONS(a8, a12), m.trail);
        } else {
            return m.fail();
        }
    // put_str_args([a(7),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(13))
        a13 =  S( FUNCTOR_$002D_2 , a7,  int_1 );
 ;
        //START inline expansion of a(11)is a(13)
        if (! a11.unify(Arithmetic.evaluate(a13), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a14 = m.mkvar1();
        //START inline expansion of $unify(a(14),a(12))
        if (! a14.unify(a12, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a6;
        m.AREGS[1] = a10;
        m.AREGS[2] = a14;
        m.AREGS[3] = a4;
m.cont = cont;
        return seq_interleaved_4_top(m);
    }
/** PREDICATE: seq_clause/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(seq_clause/2,public)
        final static Functor FUNCTOR_$005C$002B_1 = F("\\+",1);




    public static Operation PRED_seq_clause_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return seq_clause_2_top(m);
    }

    private final static Operation seq_clause_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_run::seq_clause_2_var, fail_0, fail_0, FILE_run::seq_clause_2_1, fail_0, FILE_run::seq_clause_2_2); 
    }

    private final static Operation seq_clause_2_var(Prolog m) { 
        m.jtry2(null, FILE_run::seq_clause_2_var_1);
        return seq_clause_2_1(m);
    }

    private final static Operation seq_clause_2_var_1(Prolog m) { 
        m.trust(null);
        return seq_clause_2_2(m);
    }

    private final static Operation seq_clause_2_1(Prolog m) { 
    // seq_clause([],true):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // seq_clause([],true):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.True .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation seq_clause_2_2(Prolog m) { 
    // seq_clause([A|B],(\+ \+A:top,C)):-seq_clause(B,C)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // seq_clause([A|B],(\+ \+A:top,C)):-[seq_clause(B,C)]
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
            if (!a2.unifyS( FUNCTOR_$002C_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a5 = a5.dref();
            a7 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_$005C$002B_1 , m.trail, a7)){
                return m.fail();
            }
        a7 = a7.dref();
            a8 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_$005C$002B_1 , m.trail, a8)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_module_colon_2 , m.trail, a3,  ATOM_top )){
                return m.fail();
            }
        m.AREGS[0] = a4;
        m.AREGS[1] = a6;
m.cont = cont;
        return seq_clause_2_top(m);
    }
/** PREDICATE: run_non_interleaved/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(run_non_interleaved/1,public)
        final static Functor FUNCTOR_seq_non_interleaved_1 = F("seq_non_interleaved",1);




    public static Operation PRED_run_non_interleaved_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // run_non_interleaved(A):-compile_programs,findall(B-C,program(C,B,A),D),phrase(seq_non_interleaved(D),E),seq_clause(E,F),assert((rni:-F),G),garbage_collect,time(rni),erase(G)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4, p5, p6, p7;
        a1 = LARG[0];
    // run_non_interleaved(A):-[compile_programs,findall(B-C,'SxxMachine':program(C,B,A),D),phrase(seq_non_interleaved(D),E),seq_clause(E,F),assert('SxxMachine':(rni:-F),G),garbage_collect,time(rni),erase(G)]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$002D_2 , a2, a3);
 ;
        a5 = Closure( //
 Op("program", FILE_run::PRED_program_3_static_exec, VA(a3, a2, a1), null));
        a6 = m.mkvar1();
    // put_str_args([a(6)],y(2)),put_str(@('FUNCTOR_seq_non_interleaved_1'),y(2),a(7))
        a7 =  S( FUNCTOR_seq_non_interleaved_1 , a6);
 ;
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([@('ATOM_rni'),a(9)],y(3)),put_str(@('FUNCTOR_$003A$002D_2'),y(3),a(10))
        a10 =  S( FUNCTOR_$003A$002D_2 ,  ATOM_rni , a9);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(10)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(11))
        a11 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a10);
 ;
        a12 = m.mkvar1();
        return //
 Op("compile_programs", FILE_run::PRED_compile_programs_0_static_exec, VA(), //
 Op("findall", FILE_run::PRED_findall_3_static_exec, VA(a4, a5, a6), //
 Op("phrase", FILE_run::PRED_phrase_2_static_exec, VA(a7, a8), //
 Op("seq_clause", FILE_run::PRED_seq_clause_2_static_exec, VA(a8, a9), //
 Op("assert", FILE_run::PRED_assert_2_static_exec, VA(a11, a12), //
 Op("garbage_collect", FILE_run::PRED_garbage_collect_0_static_exec, VA(), //
 Op("time", FILE_run::PRED_time_1_static_exec, VA( ATOM_rni ), //
 Op("erase", FILE_run::PRED_erase_1_static_exec, VA(a12), cont))))))));
    }
/** PREDICATE: seq_non_interleaved/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main(seq_non_interleaved/3,public)




    public static Operation PRED_seq_non_interleaved_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return seq_non_interleaved_3_top(m);
    }

    private final static Operation seq_non_interleaved_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_run::seq_non_interleaved_3_var, fail_0, fail_0, FILE_run::seq_non_interleaved_3_1, fail_0, FILE_run::seq_non_interleaved_3_lis); 
    }

    private final static Operation seq_non_interleaved_3_var(Prolog m) { 
        m.jtry3(null, FILE_run::seq_non_interleaved_3_var_1);
        return seq_non_interleaved_3_1(m);
    }

    private final static Operation seq_non_interleaved_3_var_1(Prolog m) { 
        m.retry(null, FILE_run::seq_non_interleaved_3_var_2);
        return seq_non_interleaved_3_2(m);
    }

    private final static Operation seq_non_interleaved_3_var_2(Prolog m) { 
        m.trust(null);
        return seq_non_interleaved_3_3(m);
    }

    private final static Operation seq_non_interleaved_3_lis(Prolog m) { 
        m.jtry3(null, FILE_run::seq_non_interleaved_3_lis_1);
        return seq_non_interleaved_3_2(m);
    }

    private final static Operation seq_non_interleaved_3_lis_1(Prolog m) { 
        m.trust(null);
        return seq_non_interleaved_3_3(m);
    }

    private final static Operation seq_non_interleaved_3_1(Prolog m) { 
    // seq_non_interleaved([],A,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // seq_non_interleaved([],A,A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation seq_non_interleaved_3_2(Prolog m) { 
    // seq_non_interleaved([0-A|B],C,D):-(!,E=C),seq_non_interleaved(B,E,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // seq_non_interleaved([0-A|B],C,D):-['$neck_cut','$unify'(E,C),seq_non_interleaved(B,E,D)]
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
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_$002D_2 , m.trail,  int_0 , m.DONT_CARE1())){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a6 = m.mkvar1();
        //START inline expansion of $unify(a(6),a(2))
        if (! a6.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a5;
        m.AREGS[1] = a6;
        m.AREGS[2] = a3;
m.cont = cont;
        return seq_non_interleaved_3_top(m);
    }

    private final static Operation seq_non_interleaved_3_3(Prolog m) { 
    // seq_non_interleaved([A-B|C],[B|D],E):-(F is A-1,G=D),seq_non_interleaved([F-B|C],G,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // seq_non_interleaved([A-B|C],[B|D],E):-[F is A-1,'$unify'(G,D),seq_non_interleaved([F-B|C],G,E)]
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
        a4 = a4.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_$002D_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a7.unify(a2.car(), m.trail))
                return m.fail();
            a8 = a2.cdr();
        } else if (a2.isVar()){
            a8 = m.mkvar2();
             a2.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a9 = m.mkvar1();
    // put_str_args([a(6),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$002D_2 , a6,  int_1 );
 ;
        //START inline expansion of a(9)is a(10)
        if (! a9.unify(Arithmetic.evaluate(a10), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a11 = m.mkvar1();
        //START inline expansion of $unify(a(11),a(8))
        if (! a11.unify(a8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(9),a(7)],y(2)),put_str(@('FUNCTOR_$002D_2'),y(2),a(12))
        a12 =  S( FUNCTOR_$002D_2 , a9, a7);
 ;
        a13 = CONS(a12, a5);
        m.AREGS[0] = a13;
        m.AREGS[1] = a11;
        m.AREGS[2] = a3;
m.cont = cont;
        return seq_non_interleaved_3_top(m);
    }
/** PREDICATE: $init/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/run.pl
*/
    // main('$init'/0,public)
    private static final Compound L_$init_0_s6 = S( FUNCTOR_$002F_2 ,  ATOM_rni ,  int_0 );




    public static Operation PRED_$init_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$init':-'$new_indexing_hash'('SxxMachine',rni/0,A)
        m.setB0();
    // '$init':-['$new_indexing_hash'('SxxMachine',rni/0,A)]
        return //
 Op("$new_indexing_hash", FILE_run::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_SxxMachine , L_$init_0_s6, m.DONT_CARE2()), cont);
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("run",1,FILE_run::PRED_run_1_static_exec);
   PredTable.registerBuiltin("run",2,FILE_run::PRED_run_2_static_exec);
   PredTable.registerBuiltin("compile_programs",0,FILE_run::PRED_compile_programs_0_static_exec);
   PredTable.registerBuiltin("run_program",4,FILE_run::PRED_run_program_4_static_exec);
   PredTable.registerBuiltin("add",3,FILE_run::PRED_add_3_static_exec);
   PredTable.registerBuiltin("get_performance_stats",2,FILE_run::PRED_get_performance_stats_2_static_exec);
   PredTable.registerBuiltin("ntimes",4,FILE_run::PRED_ntimes_4_static_exec);
   PredTable.registerBuiltin("ntimes",2,FILE_run::PRED_ntimes_2_static_exec);
   PredTable.registerBuiltin("ntimes_dummy",1,FILE_run::PRED_ntimes_dummy_1_static_exec);
   PredTable.registerBuiltin("not_not_top",1,FILE_run::PRED_not_not_top_1_static_exec);
   PredTable.registerBuiltin("not_top",1,FILE_run::PRED_not_top_1_static_exec);
   PredTable.registerBuiltin("not_not_dummy",0,FILE_run::PRED_not_not_dummy_0_static_exec);
   PredTable.registerBuiltin("not_dummy",0,FILE_run::PRED_not_dummy_0_static_exec);
   PredTable.registerBuiltin("dummy",0,FILE_run::PRED_dummy_0_static_exec);
   PredTable.registerBuiltin("tune_counts",0,FILE_run::PRED_tune_counts_0_static_exec);
   PredTable.registerBuiltin("tune_count",2,FILE_run::PRED_tune_count_2_static_exec);
   PredTable.registerBuiltin("program",3,FILE_run::PRED_program_3_static_exec);
   PredTable.registerBuiltin("program",2,FILE_run::PRED_program_2_static_exec);
   PredTable.registerBuiltin("run_interleaved",1,FILE_run::PRED_run_interleaved_1_static_exec);
   PredTable.registerBuiltin("seq_interleaved",3,FILE_run::PRED_seq_interleaved_3_static_exec);
   PredTable.registerBuiltin("seq_interleaved",4,FILE_run::PRED_seq_interleaved_4_static_exec);
   PredTable.registerBuiltin("seq_clause",2,FILE_run::PRED_seq_clause_2_static_exec);
   PredTable.registerBuiltin("run_non_interleaved",1,FILE_run::PRED_run_non_interleaved_1_static_exec);
   PredTable.registerBuiltin("seq_non_interleaved",3,FILE_run::PRED_seq_non_interleaved_3_static_exec);
   PredTable.registerBuiltin("$init",0,FILE_run::PRED_$init_0_static_exec);
}
}

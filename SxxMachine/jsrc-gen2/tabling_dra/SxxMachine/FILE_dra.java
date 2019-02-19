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
public class FILE_dra extends FILE_system {
/** PREDICATE: init_dra/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(init_dra/1,non-(public))
        final static Functor ATOM_file0 = SYM("file0");
        final static Functor ATOM_access_level = SYM("access_level");
        final static Functor FUNCTOR_module_colon_2 = F(":",2);
        final static Functor ATOM_$0024dra = SYM("$dra");
        final static Functor FUNCTOR_was_access_level_1 = F("was_access_level",1);
        final static Functor ATOM_file1 = SYM("file1");
        final static Functor ATOM_user = SYM("user");
        final static Functor FUNCTOR_property_pred_2 = F("property_pred",2);
        final static Functor FUNCTOR_make_db_pred_2 = F("make_db_pred",2);
        final static Functor ATOM_number_of_answers = SYM("number_of_answers");
        final static Functor ATOM_unique_index = SYM("unique_index");
        final static Functor ATOM_$0024tabling_exec = SYM("$tabling_exec");
        final static Functor FUNCTOR_dra_state_4 = F("dra_state",4);
        final static Functor ATOM_file7 = SYM("file7");
        final static Functor ATOM_module = SYM("module");
        final static Functor FUNCTOR_source_file_2 = F("source_file",2);
        final static Functor FUNCTOR_ignore_1 = F("ignore",1);
        final static Functor FUNCTOR_$002C_2 = F(",",2);
        final static Functor FUNCTOR_functor_3 = F("functor",3);
        final static Functor FUNCTOR_$005C$002B_1 = F("\\+",1);
        final static Functor FUNCTOR_atom_concat_3 = F("atom_concat",3);
        final static Functor ATOM_$0024 = SYM("$");
        final static Functor FUNCTOR_export_1 = F("export",1);
        final static Functor FUNCTOR_$002F_2 = F("/",2);
        final static Functor FUNCTOR_predicate_property_2 = F("predicate_property",2);
        final static Functor ATOM_transparent = SYM("transparent");
        final static Functor ATOM___aux = SYM("__aux");
        final static Functor FUNCTOR_module_transparent_1 = F("module_transparent",1);
        final static Functor ATOM_file = SYM("file");




    public static Operation PRED_init_dra_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_dra::init_dra_1_var, FILE_dra::init_dra_1_int, fail_0, FILE_dra::init_dra_1_con, fail_0, fail_0); 
    }

    private final static Operation init_dra_1_var(Prolog m) { 
        m.jtry1(null, FILE_dra::init_dra_1_var_1);
        return init_dra_1_1(m);
    }

    private final static Operation init_dra_1_var_1(Prolog m) { 
        m.retry(null, FILE_dra::init_dra_1_var_2);
        return init_dra_1_2(m);
    }

    private final static Operation init_dra_1_var_2(Prolog m) { 
        m.retry(null, FILE_dra::init_dra_1_var_3);
        return init_dra_1_3(m);
    }

    private final static Operation init_dra_1_var_3(Prolog m) { 
        m.retry(null, FILE_dra::init_dra_1_var_4);
        return init_dra_1_4(m);
    }

    private final static Operation init_dra_1_var_4(Prolog m) { 
        m.retry(null, FILE_dra::init_dra_1_var_5);
        return init_dra_1_5(m);
    }

    private final static Operation init_dra_1_var_5(Prolog m) { 
        m.retry(null, FILE_dra::init_dra_1_var_6);
        return init_dra_1_6(m);
    }

    private final static Operation init_dra_1_var_6(Prolog m) { 
        m.trust(null);
        return init_dra_1_7(m);
    }

    private final static Operation init_dra_1_int(Prolog m) { 
        m.jtry1(null, FILE_dra::init_dra_1_int_1);
        return init_dra_1_3(m);
    }

    private final static Operation init_dra_1_int_1(Prolog m) { 
        m.retry(null, FILE_dra::init_dra_1_int_2);
        return init_dra_1_4(m);
    }

    private final static Operation init_dra_1_int_2(Prolog m) { 
        m.trust(null);
        return init_dra_1_5(m);
    }

    private final static Operation init_dra_1_con(Prolog m) { 
        m.jtry1(null, FILE_dra::init_dra_1_con_1);
        return init_dra_1_1(m);
    }

    private final static Operation init_dra_1_con_1(Prolog m) { 
        m.retry(null, FILE_dra::init_dra_1_con_2);
        return init_dra_1_2(m);
    }

    private final static Operation init_dra_1_con_2(Prolog m) { 
        m.retry(null, FILE_dra::init_dra_1_con_3);
        return init_dra_1_6(m);
    }

    private final static Operation init_dra_1_con_3(Prolog m) { 
        m.trust(null);
        return init_dra_1_7(m);
    }

    private final static Operation init_dra_1_1(Prolog m) { 
    // init_dra(file0):-current_prolog_flag(access_level,A),asserta(was_access_level(A))
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // init_dra(file0):-[current_prolog_flag(access_level,A),asserta('$dra':was_access_level(A))]
        if (!  ATOM_file0 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_was_access_level_1'),y(1),a(3))
        a3 =  S( FUNCTOR_was_access_level_1 , a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a3);
 ;
        return //
 Op("current_prolog_flag", FILE_dra::PRED_current_prolog_flag_2_static_exec, VA( ATOM_access_level , a2), //
 Op("asserta", FILE_dra::PRED_asserta_1_static_exec, VA(a4), cont));
    }

    private final static Operation init_dra_1_2(Prolog m) { 
    // init_dra(file1):-set_prolog_flag(access_level,user)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // init_dra(file1):-[set_prolog_flag(access_level,user)]
        if (!  ATOM_file1 .unify(a1, m.trail))
            return m.fail();
        return //
 Op("set_prolog_flag", FILE_dra::PRED_set_prolog_flag_2_static_exec, VA( ATOM_access_level ,  ATOM_user ), cont);
    }

    private final static Operation init_dra_1_3(Prolog m) { 
    // init_dra(1):-forall(property_pred(A,B),make_db_pred(A,B))
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // init_dra(1):-[forall(property_pred(A,B),make_db_pred(A,B))]
        if (!  int_1 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = m.mkvar1();
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_property_pred_2'),y(1),a(4))
        a4 =  S( FUNCTOR_property_pred_2 , a2, a3);
 ;
    // put_str_args([a(2),a(3)],y(2)),put_str(@('FUNCTOR_make_db_pred_2'),y(2),a(5))
        a5 =  S( FUNCTOR_make_db_pred_2 , a2, a3);
 ;
        return //
 Op("forall", FILE_dra::PRED_forall_2_static_exec, VA(a4, a5), cont);
    }

    private final static Operation init_dra_1_4(Prolog m) { 
    // init_dra(2):-dra_setval_flag(number_of_answers,0),dra_setval_flag(unique_index,0)
         Term a1;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // init_dra(2):-[dra_setval_flag(number_of_answers,0),dra_setval_flag(unique_index,0)]
        if (!  int_2 .unify(a1, m.trail))
            return m.fail();
        return //
 Op("dra_setval_flag", FILE_dra::PRED_dra_setval_flag_2_static_exec, VA( ATOM_number_of_answers ,  int_0 ), //
 Op("dra_setval_flag", FILE_dra::PRED_dra_setval_flag_2_static_exec, VA( ATOM_unique_index ,  int_0 ), cont));
    }

    private final static Operation init_dra_1_5(Prolog m) { 
    // init_dra(3):-empty_hypotheses(A),empty_stack(B),nb_setval('$tabling_exec',dra_state(B,A,-1,C))
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // init_dra(3):-[empty_hypotheses(A),empty_stack(B),nb_setval('$tabling_exec',dra_state(B,A,-1,C))]
        if (!  int_3 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = m.mkvar1();
    // put_str_args([a(3),a(2),@(int_neg1),void],y(1)),put_str(@('FUNCTOR_dra_state_4'),y(1),a(4))
        a4 =  S( FUNCTOR_dra_state_4 , a3, a2,  int_neg1 , m.mkvar3());
 ;
        return //
 Op("empty_hypotheses", FILE_dra::PRED_empty_hypotheses_1_static_exec, VA(a2), //
 Op("empty_stack", FILE_dra::PRED_empty_stack_1_static_exec, VA(a3), //
 Op("nb_setval", sxxtensions::PRED_nb_setval_2_static_exec, VA( ATOM_$0024tabling_exec , a4), cont)));
    }

    private final static Operation init_dra_1_6(Prolog m) { 
    // init_dra(file7):-source_location(A,B),prolog_load_context(module,C),forall(source_file(D:E,A),ignore((functor(E,F,G),\+atom_concat($,H,F),D:export(D:F/G),\+predicate_property(D:E,transparent),\+atom_concat('__aux',I,F),C:(module_transparent D:F/G))))
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // init_dra(file7):-[source_location(A,B),prolog_load_context(module,C),forall(source_file(D:E,A),ignore((functor(E,F,G),\+atom_concat($,H,F),D:export(D:F/G),\+predicate_property(D:E,transparent),\+atom_concat('__aux',I,F),C:(module_transparent D:F/G))))]
        if (!  ATOM_file7 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(6))
        a6 =  S( FUNCTOR_module_colon_2 , a4, a5);
 ;
    // put_str_args([a(6),a(2)],y(2)),put_str(@('FUNCTOR_source_file_2'),y(2),a(7))
        a7 =  S( FUNCTOR_source_file_2 , a6, a2);
 ;
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([a(5),a(8),a(9)],y(3)),put_str(@('FUNCTOR_functor_3'),y(3),a(10))
        a10 =  S( FUNCTOR_functor_3 , a5, a8, a9);
 ;
    // put_str_args([@('ATOM_$0024'),void,a(8)],y(4)),put_str(@('FUNCTOR_atom_concat_3'),y(4),a(11))
        a11 =  S( FUNCTOR_atom_concat_3 ,  ATOM_$0024 , m.mkvar3(), a8);
 ;
    // put_str_args([a(11)],y(5)),put_str(@('FUNCTOR_$005C$002B_1'),y(5),a(12))
        a12 =  S( FUNCTOR_$005C$002B_1 , a11);
 ;
    // put_str_args([a(8),a(9)],y(6)),put_str(@('FUNCTOR_$002F_2'),y(6),a(13))
        a13 =  S( FUNCTOR_$002F_2 , a8, a9);
 ;
    // put_str_args([a(4),a(13)],y(7)),put_str(@('FUNCTOR_module_colon_2'),y(7),a(14))
        a14 =  S( FUNCTOR_module_colon_2 , a4, a13);
 ;
    // put_str_args([a(14)],y(8)),put_str(@('FUNCTOR_export_1'),y(8),a(15))
        a15 =  S( FUNCTOR_export_1 , a14);
 ;
    // put_str_args([a(4),a(15)],y(9)),put_str(@('FUNCTOR_module_colon_2'),y(9),a(16))
        a16 =  S( FUNCTOR_module_colon_2 , a4, a15);
 ;
    // put_str_args([a(4),a(5)],y(10)),put_str(@('FUNCTOR_module_colon_2'),y(10),a(17))
        a17 =  S( FUNCTOR_module_colon_2 , a4, a5);
 ;
    // put_str_args([a(17),@('ATOM_transparent')],y(11)),put_str(@('FUNCTOR_predicate_property_2'),y(11),a(18))
        a18 =  S( FUNCTOR_predicate_property_2 , a17,  ATOM_transparent );
 ;
    // put_str_args([a(18)],y(12)),put_str(@('FUNCTOR_$005C$002B_1'),y(12),a(19))
        a19 =  S( FUNCTOR_$005C$002B_1 , a18);
 ;
    // put_str_args([@('ATOM___aux'),void,a(8)],y(13)),put_str(@('FUNCTOR_atom_concat_3'),y(13),a(20))
        a20 =  S( FUNCTOR_atom_concat_3 ,  ATOM___aux , m.mkvar3(), a8);
 ;
    // put_str_args([a(20)],y(14)),put_str(@('FUNCTOR_$005C$002B_1'),y(14),a(21))
        a21 =  S( FUNCTOR_$005C$002B_1 , a20);
 ;
    // put_str_args([a(8),a(9)],y(15)),put_str(@('FUNCTOR_$002F_2'),y(15),a(22))
        a22 =  S( FUNCTOR_$002F_2 , a8, a9);
 ;
    // put_str_args([a(4),a(22)],y(16)),put_str(@('FUNCTOR_module_colon_2'),y(16),a(23))
        a23 =  S( FUNCTOR_module_colon_2 , a4, a22);
 ;
    // put_str_args([a(23)],y(17)),put_str(@('FUNCTOR_module_transparent_1'),y(17),a(24))
        a24 =  S( FUNCTOR_module_transparent_1 , a23);
 ;
    // put_str_args([a(3),a(24)],y(18)),put_str(@('FUNCTOR_module_colon_2'),y(18),a(25))
        a25 =  S( FUNCTOR_module_colon_2 , a3, a24);
 ;
    // put_str_args([a(21),a(25)],y(19)),put_str(@('FUNCTOR_$002C_2'),y(19),a(26))
        a26 =  S( FUNCTOR_$002C_2 , a21, a25);
 ;
    // put_str_args([a(19),a(26)],y(20)),put_str(@('FUNCTOR_$002C_2'),y(20),a(27))
        a27 =  S( FUNCTOR_$002C_2 , a19, a26);
 ;
    // put_str_args([a(16),a(27)],y(21)),put_str(@('FUNCTOR_$002C_2'),y(21),a(28))
        a28 =  S( FUNCTOR_$002C_2 , a16, a27);
 ;
    // put_str_args([a(12),a(28)],y(22)),put_str(@('FUNCTOR_$002C_2'),y(22),a(29))
        a29 =  S( FUNCTOR_$002C_2 , a12, a28);
 ;
    // put_str_args([a(10),a(29)],y(23)),put_str(@('FUNCTOR_$002C_2'),y(23),a(30))
        a30 =  S( FUNCTOR_$002C_2 , a10, a29);
 ;
    // put_str_args([a(30)],y(24)),put_str(@('FUNCTOR_ignore_1'),y(24),a(31))
        a31 =  S( FUNCTOR_ignore_1 , a30);
 ;
        return //
 Op("source_location", FILE_dra::PRED_source_location_2_static_exec, VA(a2, m.DONT_CARE2()), //
 Op("prolog_load_context", FILE_dra::PRED_prolog_load_context_2_static_exec, VA( ATOM_module , a3), //
 Op("forall", FILE_dra::PRED_forall_2_static_exec, VA(a7, a31), cont)));
    }

    private final static Operation init_dra_1_7(Prolog m) { 
    // init_dra(file):-retract(was_access_level(A)),set_prolog_flag(access_level,A)
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // init_dra(file):-[retract('$dra':was_access_level(A)),set_prolog_flag(access_level,A)]
        if (!  ATOM_file .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_was_access_level_1'),y(1),a(3))
        a3 =  S( FUNCTOR_was_access_level_1 , a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a3);
 ;
        return //
 Op("retract", FILE_dra::PRED_retract_1_static_exec, VA(a4), //
 Op("set_prolog_flag", FILE_dra::PRED_set_prolog_flag_2_static_exec, VA( ATOM_access_level , a2), cont));
    }
/** PREDICATE: $exit_dra/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$exit_dra'/0,non-(public))




    public static Operation PRED_$exit_dra_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$exit_dra':-true
        m.setB0();
    // '$exit_dra':-[]
        return cont;
    }
/** PREDICATE: $enter_dra/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$enter_dra'/0,non-(public))




    public static Operation PRED_$enter_dra_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$enter_dra':-true
        m.setB0();
    // '$enter_dra':-[]
        return cont;
    }
/** PREDICATE: std_trace_stream/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(std_trace_stream/1,non-(public))
        final static Functor ATOM_user_error = SYM("user_error");




    public static Operation PRED_std_trace_stream_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // std_trace_stream(user_error):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // std_trace_stream(user_error):-[]
        if (!  ATOM_user_error .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: dra_w/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_w/1,non-(public))
        final static Functor ATOM_$007Eq = SYM("~q");




    public static Operation PRED_dra_w_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_w(A):-std_trace_stream(B),format(B,'~q',[A]),flush_output(B)
        m.setB0();
         Term a1, a2, a3;
        Operation p1, p2;
        a1 = LARG[0];
    // dra_w(A):-[std_trace_stream(B),format(B,'~q',[A]),flush_output(B)]
        a2 = m.mkvar1();
        a3 = CONS(a1,  Prolog.Nil );
        return //
 Op("std_trace_stream", FILE_dra::PRED_std_trace_stream_1_static_exec, VA(a2), //
 Op("format", FILE_dra::PRED_format_3_static_exec, VA(a2,  ATOM_$007Eq , a3), //
 Op("flush_output", FILE_dra::PRED_flush_output_1_static_exec, VA(a2), cont)));
    }
/** PREDICATE: dra_wln/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_wln/1,non-(public))
        final static Functor ATOM_notrace = SYM("notrace");
        final static Functor FUNCTOR_current_predicate_1 = F("current_predicate",1);
        final static Functor ATOM_logicmoo_util_dmsg = SYM("logicmoo_util_dmsg");
        final static Functor ATOM_dmsg = SYM("dmsg");
    private static final Compound L_dra_wln_1_s10 = S( FUNCTOR_$002F_2 ,  ATOM_dmsg ,  int_1 );
    private static final Compound L_dra_wln_1_s12 = S( FUNCTOR_module_colon_2 ,  ATOM_logicmoo_util_dmsg , L_dra_wln_1_s10);
    private static final Compound L_dra_wln_1_s14 = S( FUNCTOR_current_predicate_1 , L_dra_wln_1_s12);
        final static Functor ATOM_$0021 = SYM("!");
        final static Functor FUNCTOR_dmsg_1 = F("dmsg",1);
        final static Functor ATOM_$007Eq$002E$007En = SYM("~q.~n");




    public static Operation PRED_dra_wln_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::dra_wln_1_sub_1);
        return dra_wln_1_1(m);
    }

    private final static Operation dra_wln_1_sub_1(Prolog m) { 
        m.trust(null);
        return dra_wln_1_2(m);
    }

    private final static Operation dra_wln_1_1(Prolog m) { 
    // dra_wln(A):-call(notrace,(current_predicate(logicmoo_util_dmsg:dmsg/1),!,logicmoo_util_dmsg:dmsg(A))),!
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // dra_wln(A):-['$get_level'(B),call(notrace,(current_predicate(logicmoo_util_dmsg:dmsg/1),!,logicmoo_util_dmsg:dmsg(A))),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_dmsg_1'),y(1),a(3))
        a3 =  S( FUNCTOR_dmsg_1 , a1);
 ;
    // put_str_args([@('ATOM_logicmoo_util_dmsg'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_logicmoo_util_dmsg , a3);
 ;
    // put_str_args([@('ATOM_$0021'),a(4)],y(3)),put_str(@('FUNCTOR_$002C_2'),y(3),a(5))
        a5 =  S( FUNCTOR_$002C_2 ,  ATOM_$0021 , a4);
 ;
    // put_str_args([s(14),a(5)],y(4)),put_str(@('FUNCTOR_$002C_2'),y(4),a(6))
        a6 =  S( FUNCTOR_$002C_2 , L_dra_wln_1_s14, a5);
 ;
        return //
 Op("call", FILE_dra::PRED_call_2_static_exec, VA( ATOM_notrace , a6), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), cont));
    }

    private final static Operation dra_wln_1_2(Prolog m) { 
    // dra_wln(A):-std_trace_stream(B),format(B,'~q.~n',[A]),flush_output(B)
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // dra_wln(A):-[std_trace_stream(B),format(B,'~q.~n',[A]),flush_output(B)]
        a2 = m.mkvar1();
        a3 = CONS(a1,  Prolog.Nil );
        return //
 Op("std_trace_stream", FILE_dra::PRED_std_trace_stream_1_static_exec, VA(a2), //
 Op("format", FILE_dra::PRED_format_3_static_exec, VA(a2,  ATOM_$007Eq$002E$007En , a3), //
 Op("flush_output", FILE_dra::PRED_flush_output_1_static_exec, VA(a2), cont)));
    }
/** PREDICATE: dra_retract_all/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_retract_all/1,non-(public))
        final static Functor FUNCTOR_retract_1 = F("retract",1);
        final static Functor ATOM_fail = SYM("fail");




    public static Operation PRED_dra_retract_all_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_retract_all(A):-ignore((retract(A),fail))
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
    // dra_retract_all(A):-[ignore((retract(A),fail))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_retract_1'),y(1),a(2))
        a2 =  S( FUNCTOR_retract_1 , a1);
 ;
    // put_str_args([a(2),@('ATOM_fail')],y(2)),put_str(@('FUNCTOR_$002C_2'),y(2),a(3))
        a3 =  S( FUNCTOR_$002C_2 , a2,  ATOM_fail );
 ;
        return //
 Op("ignore", FILE_dra::PRED_ignore_1_static_exec, VA(a3), cont);
    }
/** PREDICATE: dra_asserta_new/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_asserta_new/1,non-(public))




    public static Operation PRED_dra_asserta_new_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_asserta_new(A):-dra_retract_all(A),asserta(A)
        m.setB0();
         Term a1, a2, a3;
        Operation p1;
        a1 = LARG[0];
    // dra_asserta_new(A):-[dra_retract_all('$dra':A),asserta('$dra':A)]
    // put_str_args([@('ATOM_$0024dra'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(1)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a1);
 ;
        return //
 Op("dra_retract_all", FILE_dra::PRED_dra_retract_all_1_static_exec, VA(a2), //
 Op("asserta", FILE_dra::PRED_asserta_1_static_exec, VA(a3), cont));
    }
/** PREDICATE: dra_assertz_new/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_assertz_new/1,non-(public))




    public static Operation PRED_dra_assertz_new_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_assertz_new(A):-dra_retract_all(A),assertz(A)
        m.setB0();
         Term a1, a2, a3;
        Operation p1;
        a1 = LARG[0];
    // dra_assertz_new(A):-[dra_retract_all('$dra':A),assertz('$dra':A)]
    // put_str_args([@('ATOM_$0024dra'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(1)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a1);
 ;
        return //
 Op("dra_retract_all", FILE_dra::PRED_dra_retract_all_1_static_exec, VA(a2), //
 Op("assertz", FILE_dra::PRED_assertz_1_static_exec, VA(a3), cont));
    }
/** PREDICATE: dra_must/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_must/1,non-(public))
        final static Functor FUNCTOR_failed_dra_must_1 = F("failed_dra_must",1);




    public static Operation PRED_dra_must_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return dra_must_1_top(m);
    }

    private final static Operation dra_must_1_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_dra::dra_must_1_var, FILE_dra::dra_must_1_int, FILE_dra::dra_must_1_int, FILE_dra::dra_must_1_int, FILE_dra::dra_must_1_var, FILE_dra::dra_must_1_int); 
    }

    private final static Operation dra_must_1_var(Prolog m) { 
        m.jtry1(null, FILE_dra::dra_must_1_var_1);
        return dra_must_1_1(m);
    }

    private final static Operation dra_must_1_var_1(Prolog m) { 
        m.retry(null, FILE_dra::dra_must_1_var_2);
        return dra_must_1_2(m);
    }

    private final static Operation dra_must_1_var_2(Prolog m) { 
        m.trust(null);
        return dra_must_1_3(m);
    }

    private final static Operation dra_must_1_int(Prolog m) { 
        m.jtry1(null, FILE_dra::dra_must_1_int_1);
        return dra_must_1_2(m);
    }

    private final static Operation dra_must_1_int_1(Prolog m) { 
        m.trust(null);
        return dra_must_1_3(m);
    }

    private final static Operation dra_must_1_1(Prolog m) { 
    // dra_must((A,B)):-!,dra_must(A),dra_must(B)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // dra_must((A,B)):-['$neck_cut',dra_must(A),dra_must(B)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002C_2 , m.trail, a2, a3)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op("dra_must", FILE_dra::PRED_dra_must_1_static_exec, VA(a3), cont);
        m.AREGS[0] = a2;
        m.cont = p1;
        return dra_must_1_top(m);
    }

    private final static Operation dra_must_1_2(Prolog m) { 
    // dra_must(A):-A*->true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // dra_must(A):-[(A*->true)]
        return //
 Op("*->", FILE_dra::PRED_$002A$002D$003E_2_static_exec, VA(a1,  Prolog.True ), cont);
    }

    private final static Operation dra_must_1_3(Prolog m) { 
    // dra_must(A):-dra_error(failed_dra_must(A))
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // dra_must(A):-[dra_error(failed_dra_must(A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_failed_dra_must_1'),y(1),a(2))
        a2 =  S( FUNCTOR_failed_dra_must_1 , a1);
 ;
        return //
 Op("dra_error", FILE_dra::PRED_dra_error_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: dra_error/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_error/1,non-(public))
        final static Functor FUNCTOR_dra_error_1 = F("dra_error",1);




    public static Operation PRED_dra_error_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_error(A):-throw(dra_error(A))
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // dra_error(A):-[throw(dra_error(A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_dra_error_1'),y(1),a(2))
        a2 =  S( FUNCTOR_dra_error_1 , a1);
 ;
        return //
 Op("throw", FILE_dra::PRED_throw_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: add_clauses/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(add_clauses/2,non-(public))
        final static Functor ATOM_xref = SYM("xref");
        final static Functor ATOM_dynamic = SYM("dynamic");
        final static Functor FUNCTOR_number_of_clauses_1 = F("number_of_clauses",1);
        final static Functor ATOM_static = SYM("static");
        final static Functor FUNCTOR_$003A$002D_2 = F(":-",2);
        final static Functor ATOM_undefined = SYM("undefined");




    public static Operation PRED_add_clauses_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::add_clauses_2_sub_1);
        return add_clauses_2_1(m);
    }

    private final static Operation add_clauses_2_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::add_clauses_2_sub_2);
        return add_clauses_2_2(m);
    }

    private final static Operation add_clauses_2_sub_2(Prolog m) { 
        m.retry(null, FILE_dra::add_clauses_2_sub_3);
        return add_clauses_2_3(m);
    }

    private final static Operation add_clauses_2_sub_3(Prolog m) { 
        m.retry(null, FILE_dra::add_clauses_2_sub_4);
        return add_clauses_2_4(m);
    }

    private final static Operation add_clauses_2_sub_4(Prolog m) { 
        m.retry(null, FILE_dra::add_clauses_2_sub_5);
        return add_clauses_2_5(m);
    }

    private final static Operation add_clauses_2_sub_5(Prolog m) { 
        m.trust(null);
        return add_clauses_2_6(m);
    }

    private final static Operation add_clauses_2_1(Prolog m) { 
    // add_clauses(A,B):-current_prolog_flag(xref,true),!
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_clauses(A,B):-['$get_level'(C),current_prolog_flag(xref,true),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("current_prolog_flag", FILE_dra::PRED_current_prolog_flag_2_static_exec, VA( ATOM_xref ,  Prolog.True ), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation add_clauses_2_2(Prolog m) { 
    // add_clauses(A,B):-predicate_property(A,dynamic),!,dra_asserta_new((A:-B))
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_clauses(A,B):-['$get_level'(C),predicate_property(A,dynamic),'$cut'(C),dra_asserta_new('$dra':(A:-B))]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = Closure( //
 Op(":-", FILE_dra::PRED_$003A$002D_2_static_exec, VA(a1, a2), null));
        return //
 Op("predicate_property", FILE_dra::PRED_predicate_property_2_static_exec, VA(a1,  ATOM_dynamic ), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("dra_asserta_new", FILE_dra::PRED_dra_asserta_new_1_static_exec, VA(a4), cont)));
    }

    private final static Operation add_clauses_2_3(Prolog m) { 
    // add_clauses(A,B):-predicate_property(A,number_of_clauses(C)),'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),!
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_clauses(A,B):-['$get_level'(C),predicate_property(A,number_of_clauses(D)),'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_number_of_clauses_1'),y(1),a(4))
        a4 =  S( FUNCTOR_number_of_clauses_1 , m.mkvar3());
 ;
        return //
 Op("predicate_property", FILE_dra::PRED_predicate_property_2_static_exec, VA(a1, a4), //
 Op("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont)));
    }

    private final static Operation add_clauses_2_4(Prolog m) { 
    // add_clauses(A,B):-predicate_property(A,static),!,directive_source_file(C),'$compile_aux_clauses'([(A:-B)],C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_clauses(A,B):-['$get_level'(C),predicate_property(A,static),'$cut'(C),directive_source_file(D),'$compile_aux_clauses'([(A:-B)],D)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_$003A$002D_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$003A$002D_2 , a1, a2);
 ;
        a6 = CONS(a5,  Prolog.Nil );
        return //
 Op("predicate_property", FILE_dra::PRED_predicate_property_2_static_exec, VA(a1,  ATOM_static ), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("directive_source_file", FILE_dra::PRED_directive_source_file_1_static_exec, VA(a4), //
 Op("$compile_aux_clauses", FILE_dra::PRED_$compile_aux_clauses_2_static_exec, VA(a6, a4), cont))));
    }

    private final static Operation add_clauses_2_5(Prolog m) { 
    // add_clauses(A,B):-predicate_property(A,undefined),'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(C,D),!,dra_asserta_new((A:-B))
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_clauses(A,B):-['$get_level'(C),predicate_property(A,undefined),'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(D,E),'$cut'(C),dra_asserta_new('$dra':(A:-B))]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = Closure( //
 Op(":-", FILE_dra::PRED_$003A$002D_2_static_exec, VA(a1, a2), null));
        return //
 Op("predicate_property", FILE_dra::PRED_predicate_property_2_static_exec, VA(a1,  ATOM_undefined ), //
 Op("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(m.DONT_CARE2(), m.DONT_CARE2()), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("dra_asserta_new", FILE_dra::PRED_dra_asserta_new_1_static_exec, VA(a4), cont))));
    }

    private final static Operation add_clauses_2_6(Prolog m) { 
    // add_clauses(A,B):-directive_source_file(C),'$compile_aux_clauses'([(A:-B)],C)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_clauses(A,B):-[directive_source_file(C),'$compile_aux_clauses'([(A:-B)],C)]
        a3 = m.mkvar1();
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_$003A$002D_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$003A$002D_2 , a1, a2);
 ;
        a5 = CONS(a4,  Prolog.Nil );
        return //
 Op("directive_source_file", FILE_dra::PRED_directive_source_file_1_static_exec, VA(a3), //
 Op("$compile_aux_clauses", FILE_dra::PRED_$compile_aux_clauses_2_static_exec, VA(a5, a3), cont));
    }
/** PREDICATE: $dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-clause(A,B),!,fail
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),clause('$dra':A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_$0024dra'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a1);
 ;
        return //
 Op("clause", FILE_dra::PRED_clause_2_static_exec, VA(a4, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-source_location(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),source_location(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("source_location", FILE_dra::PRED_source_location_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: directive_source_file/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(directive_source_file/1,non-(public))
        final static Functor ATOM_source = SYM("source");




    public static Operation PRED_directive_source_file_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::directive_source_file_1_sub_1);
        return directive_source_file_1_1(m);
    }

    private final static Operation directive_source_file_1_sub_1(Prolog m) { 
        m.trust(null);
        return directive_source_file_1_2(m);
    }

    private final static Operation directive_source_file_1_1(Prolog m) { 
    // directive_source_file(A):-prolog_load_context(source,A),!
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // directive_source_file(A):-['$get_level'(B),prolog_load_context(source,A),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("prolog_load_context", FILE_dra::PRED_prolog_load_context_2_static_exec, VA( ATOM_source , a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), cont));
    }

    private final static Operation directive_source_file_1_2(Prolog m) { 
    // directive_source_file(A):-prolog_load_context(module,A),!
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // directive_source_file(A):-['$get_level'(B),prolog_load_context(module,A),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("prolog_load_context", FILE_dra::PRED_prolog_load_context_2_static_exec, VA( ATOM_module , a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), cont));
    }
/** PREDICATE: property_pred/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(property_pred/2,non-(public))
        final static Functor ATOM_table = SYM("table");
        final static Functor ATOM_is_tabled = SYM("is_tabled");
        final static Functor ATOM_coinductive0 = SYM("coinductive0");
        final static Functor ATOM_is_coinductive0 = SYM("is_coinductive0");
        final static Functor ATOM_coinductive1 = SYM("coinductive1");
        final static Functor ATOM_is_coinductive1 = SYM("is_coinductive1");
        final static Functor ATOM_traces = SYM("traces");
        final static Functor ATOM_is_traced = SYM("is_traced");
        final static Functor ATOM_cut_ok = SYM("cut_ok");
        final static Functor ATOM_is_cut_ok = SYM("is_cut_ok");
        final static Functor ATOM_old_first = SYM("old_first");
        final static Functor ATOM_is_old_first = SYM("is_old_first");
        final static Functor ATOM_never_tabled = SYM("never_tabled");
        final static Functor ATOM_is_never_tabled = SYM("is_never_tabled");
        final static Functor ATOM_hilog = SYM("hilog");
        final static Functor ATOM_is_hilog = SYM("is_hilog");
        final static Functor ATOM_topl = SYM("topl");
        final static Functor ATOM_is_topl = SYM("is_topl");




    public static Operation PRED_property_pred_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_dra::property_pred_2_var, fail_0, fail_0, FILE_dra::property_pred_2_var, fail_0, fail_0); 
    }

    private final static Operation property_pred_2_var(Prolog m) { 
        m.jtry2(null, FILE_dra::property_pred_2_var_1);
        return property_pred_2_1(m);
    }

    private final static Operation property_pred_2_var_1(Prolog m) { 
        m.retry(null, FILE_dra::property_pred_2_var_2);
        return property_pred_2_2(m);
    }

    private final static Operation property_pred_2_var_2(Prolog m) { 
        m.retry(null, FILE_dra::property_pred_2_var_3);
        return property_pred_2_3(m);
    }

    private final static Operation property_pred_2_var_3(Prolog m) { 
        m.retry(null, FILE_dra::property_pred_2_var_4);
        return property_pred_2_4(m);
    }

    private final static Operation property_pred_2_var_4(Prolog m) { 
        m.retry(null, FILE_dra::property_pred_2_var_5);
        return property_pred_2_5(m);
    }

    private final static Operation property_pred_2_var_5(Prolog m) { 
        m.retry(null, FILE_dra::property_pred_2_var_6);
        return property_pred_2_6(m);
    }

    private final static Operation property_pred_2_var_6(Prolog m) { 
        m.retry(null, FILE_dra::property_pred_2_var_7);
        return property_pred_2_7(m);
    }

    private final static Operation property_pred_2_var_7(Prolog m) { 
        m.retry(null, FILE_dra::property_pred_2_var_8);
        return property_pred_2_8(m);
    }

    private final static Operation property_pred_2_var_8(Prolog m) { 
        m.trust(null);
        return property_pred_2_9(m);
    }

    private final static Operation property_pred_2_1(Prolog m) { 
    // property_pred(table,is_tabled):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // property_pred(table,is_tabled):-[]
        if (!  ATOM_table .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_is_tabled .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation property_pred_2_2(Prolog m) { 
    // property_pred(coinductive0,is_coinductive0):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // property_pred(coinductive0,is_coinductive0):-[]
        if (!  ATOM_coinductive0 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_is_coinductive0 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation property_pred_2_3(Prolog m) { 
    // property_pred(coinductive1,is_coinductive1):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // property_pred(coinductive1,is_coinductive1):-[]
        if (!  ATOM_coinductive1 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_is_coinductive1 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation property_pred_2_4(Prolog m) { 
    // property_pred(traces,is_traced):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // property_pred(traces,is_traced):-[]
        if (!  ATOM_traces .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_is_traced .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation property_pred_2_5(Prolog m) { 
    // property_pred(cut_ok,is_cut_ok):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // property_pred(cut_ok,is_cut_ok):-[]
        if (!  ATOM_cut_ok .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_is_cut_ok .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation property_pred_2_6(Prolog m) { 
    // property_pred(old_first,is_old_first):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // property_pred(old_first,is_old_first):-[]
        if (!  ATOM_old_first .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_is_old_first .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation property_pred_2_7(Prolog m) { 
    // property_pred(never_tabled,is_never_tabled):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // property_pred(never_tabled,is_never_tabled):-[]
        if (!  ATOM_never_tabled .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_is_never_tabled .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation property_pred_2_8(Prolog m) { 
    // property_pred(hilog,is_hilog):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // property_pred(hilog,is_hilog):-[]
        if (!  ATOM_hilog .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_is_hilog .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation property_pred_2_9(Prolog m) { 
    // property_pred(topl,is_topl):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // property_pred(topl,is_topl):-[]
        if (!  ATOM_topl .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_is_topl .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: (table)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main((table)/1,public)
        final static Functor FUNCTOR_table_1 = F("table",1);




    public static Operation PRED_table_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // table A:-process_dra_ective((table A))
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // table A:-[process_dra_ective((table A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_table_1'),y(1),a(2))
        a2 =  S( FUNCTOR_table_1 , a1);
 ;
        return //
 Op("process_dra_ective", FILE_dra::PRED_process_dra_ective_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: (coinductive0)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main((coinductive0)/1,public)
        final static Functor FUNCTOR_coinductive0_1 = F("coinductive0",1);




    public static Operation PRED_coinductive0_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // coinductive0 A:-process_dra_ective((coinductive0 A))
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // coinductive0 A:-[process_dra_ective((coinductive0 A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_coinductive0_1'),y(1),a(2))
        a2 =  S( FUNCTOR_coinductive0_1 , a1);
 ;
        return //
 Op("process_dra_ective", FILE_dra::PRED_process_dra_ective_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: (coinductive1)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main((coinductive1)/1,public)
        final static Functor FUNCTOR_coinductive1_1 = F("coinductive1",1);




    public static Operation PRED_coinductive1_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // coinductive1 A:-process_dra_ective((coinductive1 A))
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // coinductive1 A:-[process_dra_ective((coinductive1 A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_coinductive1_1'),y(1),a(2))
        a2 =  S( FUNCTOR_coinductive1_1 , a1);
 ;
        return //
 Op("process_dra_ective", FILE_dra::PRED_process_dra_ective_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: topl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(topl/1,non-(public))
        final static Functor FUNCTOR_topl_1 = F("topl",1);




    public static Operation PRED_topl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // topl(A):-process_dra_ective(topl(A))
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // topl(A):-[process_dra_ective(topl(A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_topl_1'),y(1),a(2))
        a2 =  S( FUNCTOR_topl_1 , a1);
 ;
        return //
 Op("process_dra_ective", FILE_dra::PRED_process_dra_ective_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: $dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/3,non-(public))
        final static Functor ATOM_system = SYM("system");




    public static Operation PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_dra::$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_2);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_3(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-predicate_property(C:A,B),!,true
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$get_level'(D),predicate_property(C:A,B),'$cut'(D)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(3),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 , a3, a1);
 ;
        return //
 Op("predicate_property", FILE_dra::PRED_predicate_property_2_static_exec, VA(a5, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a4), cont));
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,C)]
        return //
 Op("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a3), cont);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_3(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-C=system
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$unify'(C,system)]
        //START inline expansion of $unify(a(3),@(ATOM_system))
        if (! a3.unify(ATOM_system, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))
        final static Functor FUNCTOR_imported_from_1 = F("imported_from",1);




    public static Operation PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-predicate_property(A,imported_from(B)),!,true
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),predicate_property(A,imported_from(B)),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_imported_from_1'),y(1),a(4))
        a4 =  S( FUNCTOR_imported_from_1 , a2);
 ;
        return //
 Op("predicate_property", FILE_dra::PRED_predicate_property_2_static_exec, VA(a1, a4), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))
        final static Functor ATOM_fy = SYM("fy");




    public static Operation PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-current_op(B,fy,user:A),!,fail
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),current_op(B,fy,user:A),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_user'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_user , a1);
 ;
        return //
 Op("current_op", FILE_dra::PRED_current_op_3_static_exec, VA(a2,  ATOM_fy , a4), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))
        final static NumberTerm int_1010 = Integer(1010);




    public static Operation PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-'$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),!,op(1010,fy,user:A)
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),'$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),'$cut'(C),op(1010,fy,user:A)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_user'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_user , a1);
 ;
        return //
 Op("$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("op", FILE_dra::PRED_op_3_static_exec, VA( int_1010 ,  ATOM_fy , a4), cont)));
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: make_db_pred/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(make_db_pred/2,non-(public))
        final static Functor FUNCTOR_process_dra_ective_1 = F("process_dra_ective",1);




    public static Operation PRED_make_db_pred_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // make_db_pred(A,B):-C=..[A,D],'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(C,E,F),(module_transparent F:C),add_clauses(F:C,process_dra_ective(C)),'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,G),(dynamic B/1),(multifile B/1)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4, p5, p6;
        a1 = LARG[0];
        a2 = LARG[1];
    // make_db_pred(A,B):-['$univ'(C,[A,D]),'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(C,E,F),(module_transparent F:C),add_clauses(F:C,process_dra_ective(C)),'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,G),(dynamic B/1),(multifile B/1)]
        a3 = m.mkvar1();
        a4 = CONS(m.DONT_CARE1(),  Prolog.Nil );
        a5 = CONS(a1, a4);
        a6 = m.mkvar1();
    // put_str_args([a(6),a(3)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a6, a3);
 ;
    // put_str_args([a(6),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(8))
        a8 =  S( FUNCTOR_module_colon_2 , a6, a3);
 ;
    // put_str_args([a(3)],y(3)),put_str(@('FUNCTOR_process_dra_ective_1'),y(3),a(9))
        a9 =  S( FUNCTOR_process_dra_ective_1 , a3);
 ;
    // put_str_args([a(2),@(int_1)],y(4)),put_str(@('FUNCTOR_$002F_2'),y(4),a(10))
        a10 =  S( FUNCTOR_$002F_2 , a2,  int_1 );
 ;
    // put_str_args([a(2),@(int_1)],y(5)),put_str(@('FUNCTOR_$002F_2'),y(5),a(11))
        a11 =  S( FUNCTOR_$002F_2 , a2,  int_1 );
 ;
        return //
 Op("$univ", FILE_dra::PRED_$univ_2_static_exec, VA(a3, a5), //
 Op("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec, VA(a3, m.DONT_CARE2(), a6), //
 Op("module_transparent", FILE_dra::PRED_module_transparent_1_static_exec, VA(a7), //
 Op("add_clauses", FILE_dra::PRED_add_clauses_2_static_exec, VA(a8, a9), //
 Op("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, m.DONT_CARE2()), //
 Op("dynamic", FILE_dra::PRED_dynamic_1_static_exec, VA(a10), //
 Op("multifile", FILE_dra::PRED_multifile_1_static_exec, VA(a11), cont)))))));
    }
/** PREDICATE: set_meta/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(set_meta/2,non-(public))
        final static Functor FUNCTOR_dra_call_coind0_1 = F("dra_call_coind0",1);
        final static Functor FUNCTOR_is_coinductive0_1 = F("is_coinductive0",1);
        final static Functor FUNCTOR_dra_call_coind1_1 = F("dra_call_coind1",1);
        final static Functor FUNCTOR_is_coinductive1_1 = F("is_coinductive1",1);
        final static Functor FUNCTOR_is_tabled_1 = F("is_tabled",1);
        final static Functor FUNCTOR_is_old_first_1 = F("is_old_first",1);
        final static Functor FUNCTOR_dra_call_tabled_1 = F("dra_call_tabled",1);
        final static Functor FUNCTOR_is_never_tabled_1 = F("is_never_tabled",1);




    public static Operation PRED_set_meta_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return set_meta_2_top(m);
    }

    private final static Operation set_meta_2_top(Prolog m) { 
        m.setB0();
        m.jtry2(null, FILE_dra::set_meta_2_sub_1);
        return set_meta_2_1(m);
    }

    private final static Operation set_meta_2_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::set_meta_2_sub_2);
        return set_meta_2_2(m);
    }

    private final static Operation set_meta_2_sub_2(Prolog m) { 
        m.retry(null, FILE_dra::set_meta_2_sub_3);
        return set_meta_2_3(m);
    }

    private final static Operation set_meta_2_sub_3(Prolog m) { 
        m.retry(null, FILE_dra::set_meta_2_sub_4);
        return set_meta_2_4(m);
    }

    private final static Operation set_meta_2_sub_4(Prolog m) { 
        m.retry(null, FILE_dra::set_meta_2_sub_5);
        return set_meta_2_5(m);
    }

    private final static Operation set_meta_2_sub_5(Prolog m) { 
        m.trust(null);
        return set_meta_2_6(m);
    }

    private final static Operation set_meta_2_1(Prolog m) { 
    // set_meta(A,is_coinductive0):-!,set_meta(A,is_coinductive1),add_clauses(A,(!,dra_call_coind0(A))),dra_asserta_new(is_coinductive0(A))
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_meta(A,is_coinductive0):-['$neck_cut',set_meta(A,is_coinductive1),add_clauses(A,(!,dra_call_coind0(A))),dra_asserta_new('$dra':is_coinductive0(A))]
        if (!  ATOM_is_coinductive0 .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_dra_call_coind0_1'),y(1),a(3))
        a3 =  S( FUNCTOR_dra_call_coind0_1 , a1);
 ;
    // put_str_args([@('ATOM_$0021'),a(3)],y(2)),put_str(@('FUNCTOR_$002C_2'),y(2),a(4))
        a4 =  S( FUNCTOR_$002C_2 ,  ATOM_$0021 , a3);
 ;
    // put_str_args([a(1)],y(3)),put_str(@('FUNCTOR_is_coinductive0_1'),y(3),a(5))
        a5 =  S( FUNCTOR_is_coinductive0_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
        p2 = //
 Op("add_clauses", FILE_dra::PRED_add_clauses_2_static_exec, VA(a1, a4), //
 Op("dra_asserta_new", FILE_dra::PRED_dra_asserta_new_1_static_exec, VA(a6), cont));
        m.AREGS[0] = a1;
        m.AREGS[1] =  ATOM_is_coinductive1 ;
        m.cont = p2;
        return set_meta_2_top(m);
    }

    private final static Operation set_meta_2_2(Prolog m) { 
    // set_meta(A,is_coinductive1):-!,add_clauses(A,(!,dra_call_coind1(A))),dra_asserta_new(is_coinductive1(A))
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_meta(A,is_coinductive1):-['$neck_cut',add_clauses(A,(!,dra_call_coind1(A))),dra_asserta_new('$dra':is_coinductive1(A))]
        if (!  ATOM_is_coinductive1 .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_dra_call_coind1_1'),y(1),a(3))
        a3 =  S( FUNCTOR_dra_call_coind1_1 , a1);
 ;
    // put_str_args([@('ATOM_$0021'),a(3)],y(2)),put_str(@('FUNCTOR_$002C_2'),y(2),a(4))
        a4 =  S( FUNCTOR_$002C_2 ,  ATOM_$0021 , a3);
 ;
    // put_str_args([a(1)],y(3)),put_str(@('FUNCTOR_is_coinductive1_1'),y(3),a(5))
        a5 =  S( FUNCTOR_is_coinductive1_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
        return //
 Op("add_clauses", FILE_dra::PRED_add_clauses_2_static_exec, VA(a1, a4), //
 Op("dra_asserta_new", FILE_dra::PRED_dra_asserta_new_1_static_exec, VA(a6), cont));
    }

    private final static Operation set_meta_2_3(Prolog m) { 
    // set_meta(A,is_never_tabled):-!,dra_retract_all(is_tabled(A)),dra_retract_all(is_old_first(A)),dra_retract_all((A:-!,dra_call_tabled(A))),'$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_meta(A,is_never_tabled):-['$neck_cut',dra_retract_all('$dra':is_tabled(A)),dra_retract_all('$dra':is_old_first(A)),dra_retract_all('$dra':(A:-!,dra_call_tabled(A))),'$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A)]
        if (!  ATOM_is_never_tabled .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_is_tabled_1'),y(1),a(3))
        a3 =  S( FUNCTOR_is_tabled_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a3);
 ;
    // put_str_args([a(1)],y(3)),put_str(@('FUNCTOR_is_old_first_1'),y(3),a(5))
        a5 =  S( FUNCTOR_is_old_first_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
    // put_str_args([a(1)],y(5)),put_str(@('FUNCTOR_dra_call_tabled_1'),y(5),a(7))
        a7 =  S( FUNCTOR_dra_call_tabled_1 , a1);
 ;
    // put_str_args([@('ATOM_$0021'),a(7)],y(6)),put_str(@('FUNCTOR_$002C_2'),y(6),a(8))
        a8 =  S( FUNCTOR_$002C_2 ,  ATOM_$0021 , a7);
 ;
        a9 = Closure( //
 Op(":-", FILE_dra::PRED_$003A$002D_2_static_exec, VA(a1, a8), null));
        return //
 Op("dra_retract_all", FILE_dra::PRED_dra_retract_all_1_static_exec, VA(a4), //
 Op("dra_retract_all", FILE_dra::PRED_dra_retract_all_1_static_exec, VA(a6), //
 Op("dra_retract_all", FILE_dra::PRED_dra_retract_all_1_static_exec, VA(a9), //
 Op("$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec, VA(a1), cont))));
    }

    private final static Operation set_meta_2_4(Prolog m) { 
    // set_meta(A,is_tabled):-dra_retract_all(is_never_tabled(A)),dra_asserta_new(is_tabled(A)),add_clauses(A,(!,dra_call_tabled(A))),functor(A,B,C),(discontiguous B/C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_meta(A,is_tabled):-[dra_retract_all('$dra':is_never_tabled(A)),dra_asserta_new('$dra':is_tabled(A)),add_clauses(A,(!,dra_call_tabled(A))),functor(A,B,C),(discontiguous B/C)]
        if (!  ATOM_is_tabled .unify(a2, m.trail))
            return m.fail();
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_is_never_tabled_1'),y(1),a(3))
        a3 =  S( FUNCTOR_is_never_tabled_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a3);
 ;
    // put_str_args([a(1)],y(3)),put_str(@('FUNCTOR_is_tabled_1'),y(3),a(5))
        a5 =  S( FUNCTOR_is_tabled_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
    // put_str_args([a(1)],y(5)),put_str(@('FUNCTOR_dra_call_tabled_1'),y(5),a(7))
        a7 =  S( FUNCTOR_dra_call_tabled_1 , a1);
 ;
    // put_str_args([@('ATOM_$0021'),a(7)],y(6)),put_str(@('FUNCTOR_$002C_2'),y(6),a(8))
        a8 =  S( FUNCTOR_$002C_2 ,  ATOM_$0021 , a7);
 ;
        a9 = m.mkvar1();
        a10 = m.mkvar1();
    // put_str_args([a(9),a(10)],y(7)),put_str(@('FUNCTOR_$002F_2'),y(7),a(11))
        a11 =  S( FUNCTOR_$002F_2 , a9, a10);
 ;
        return //
 Op("dra_retract_all", FILE_dra::PRED_dra_retract_all_1_static_exec, VA(a4), //
 Op("dra_asserta_new", FILE_dra::PRED_dra_asserta_new_1_static_exec, VA(a6), //
 Op("add_clauses", FILE_dra::PRED_add_clauses_2_static_exec, VA(a1, a8), //
 Op("functor", FILE_dra::PRED_functor_3_static_exec, VA(a1, a9, a10), //
 Op("discontiguous", FILE_dra::PRED_discontiguous_1_static_exec, VA(a11), cont)))));
    }

    private final static Operation set_meta_2_5(Prolog m) { 
    // set_meta(A,is_old_first):-set_meta(A,is_tabled),dra_asserta_new(is_old_first(A))
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_meta(A,is_old_first):-[set_meta(A,is_tabled),dra_asserta_new('$dra':is_old_first(A))]
        if (!  ATOM_is_old_first .unify(a2, m.trail))
            return m.fail();
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_is_old_first_1'),y(1),a(3))
        a3 =  S( FUNCTOR_is_old_first_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a3);
 ;
        p1 = //
 Op("dra_asserta_new", FILE_dra::PRED_dra_asserta_new_1_static_exec, VA(a4), cont);
        m.AREGS[0] = a1;
        m.AREGS[1] =  ATOM_is_tabled ;
        m.cont = p1;
        return set_meta_2_top(m);
    }

    private final static Operation set_meta_2_6(Prolog m) { 
    // set_meta(A,B):-C=..[B,A],dra_asserta_new(C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_meta(A,B):-['$univ'(C,[B,A]),dra_asserta_new('$dra':C)]
        a3 = m.mkvar1();
        a4 = CONS(a1,  Prolog.Nil );
        a5 = CONS(a2, a4);
    // put_str_args([@('ATOM_$0024dra'),a(3)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a3);
 ;
        return //
 Op("$univ", FILE_dra::PRED_$univ_2_static_exec, VA(a3, a5), //
 Op("dra_asserta_new", FILE_dra::PRED_dra_asserta_new_1_static_exec, VA(a6), cont));
    }
/** PREDICATE: $dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/1,non-(public))




    public static Operation PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1);
        return $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(m);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(m);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(Prolog m) { 
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-is_never_tabled(A),!,true
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-['$get_level'(B),call('$dra':is_never_tabled(A)),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_is_never_tabled_1'),y(1),a(3))
        a3 =  S( FUNCTOR_is_never_tabled_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a3);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a4), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), cont));
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(Prolog m) { 
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-dra_asserta_new(is_never_tabled(A))
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-[dra_asserta_new('$dra':is_never_tabled(A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_is_never_tabled_1'),y(1),a(2))
        a2 =  S( FUNCTOR_is_never_tabled_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a2);
 ;
        return //
 Op("dra_asserta_new", FILE_dra::PRED_dra_asserta_new_1_static_exec, VA(a3), cont);
    }
/** PREDICATE: is_builtin/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(is_builtin/1,non-(public))




    public static Operation PRED_is_builtin_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::is_builtin_1_sub_1);
        return is_builtin_1_1(m);
    }

    private final static Operation is_builtin_1_sub_1(Prolog m) { 
        m.trust(null);
        return is_builtin_1_2(m);
    }

    private final static Operation is_builtin_1_1(Prolog m) { 
    // is_builtin(A):-is_swi_builtin(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_builtin(A):-[is_swi_builtin(A)]
        return //
 Op("is_swi_builtin", FILE_dra::PRED_is_swi_builtin_1_static_exec, VA(a1), cont);
    }

    private final static Operation is_builtin_1_2(Prolog m) { 
    // is_builtin(A):-functor(A,B,C),atom_concat($,D,B)
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_builtin(A):-[functor(A,B,C),atom_concat($,D,B)]
        a2 = m.mkvar1();
        return //
 Op("functor", FILE_dra::PRED_functor_3_static_exec, VA(a1, a2, m.DONT_CARE2()), //
 Op("atom_concat", FILE_dra::PRED_atom_concat_3_static_exec, VA( ATOM_$0024 , m.DONT_CARE2(), a2), cont));
    }
/** PREDICATE: mk_pattern/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(mk_pattern/3,non-(public))




    public static Operation PRED_mk_pattern_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // mk_pattern(A,B,C):-functor(C,A,B)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // mk_pattern(A,B,C):-[functor(C,A,B)]
        return //
 Op("functor", FILE_dra::PRED_functor_3_static_exec, VA(a3, a1, a2), cont);
    }
/** PREDICATE: predspecs_to_patterns/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(predspecs_to_patterns/2,non-(public))
        final static Functor ATOM_A$0020variable$0020instead$0020of$0020predicate$0020specifications$003A$0020$0022 = SYM("A variable instead of predicate specifications: \"");
        final static Functor ATOM_$0022 = SYM("\"");
    private static final Compound L_predspecs_to_patterns_2_s4 = CONS( ATOM_$0022 ,  Prolog.Nil );




    public static Operation PRED_predspecs_to_patterns_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_dra::predspecs_to_patterns_2_var, FILE_dra::predspecs_to_patterns_2_int, FILE_dra::predspecs_to_patterns_2_int, FILE_dra::predspecs_to_patterns_2_int, FILE_dra::predspecs_to_patterns_2_str, FILE_dra::predspecs_to_patterns_2_lis); 
    }

    private final static Operation predspecs_to_patterns_2_var(Prolog m) { 
        m.jtry2(null, FILE_dra::predspecs_to_patterns_2_var_1);
        return predspecs_to_patterns_2_1(m);
    }

    private final static Operation predspecs_to_patterns_2_var_1(Prolog m) { 
        m.retry(null, FILE_dra::predspecs_to_patterns_2_var_2);
        return predspecs_to_patterns_2_2(m);
    }

    private final static Operation predspecs_to_patterns_2_var_2(Prolog m) { 
        m.retry(null, FILE_dra::predspecs_to_patterns_2_var_3);
        return predspecs_to_patterns_2_3(m);
    }

    private final static Operation predspecs_to_patterns_2_var_3(Prolog m) { 
        m.trust(null);
        return predspecs_to_patterns_2_4(m);
    }

    private final static Operation predspecs_to_patterns_2_int(Prolog m) { 
        m.jtry2(null, FILE_dra::predspecs_to_patterns_2_int_1);
        return predspecs_to_patterns_2_1(m);
    }

    private final static Operation predspecs_to_patterns_2_int_1(Prolog m) { 
        m.trust(null);
        return predspecs_to_patterns_2_4(m);
    }

    private final static Operation predspecs_to_patterns_2_str(Prolog m) { 
        m.jtry2(null, FILE_dra::predspecs_to_patterns_2_str_1);
        return predspecs_to_patterns_2_1(m);
    }

    private final static Operation predspecs_to_patterns_2_str_1(Prolog m) { 
        m.retry(null, FILE_dra::predspecs_to_patterns_2_str_2);
        return predspecs_to_patterns_2_3(m);
    }

    private final static Operation predspecs_to_patterns_2_str_2(Prolog m) { 
        m.trust(null);
        return predspecs_to_patterns_2_4(m);
    }

    private final static Operation predspecs_to_patterns_2_lis(Prolog m) { 
        m.jtry2(null, FILE_dra::predspecs_to_patterns_2_lis_1);
        return predspecs_to_patterns_2_1(m);
    }

    private final static Operation predspecs_to_patterns_2_lis_1(Prolog m) { 
        m.retry(null, FILE_dra::predspecs_to_patterns_2_lis_2);
        return predspecs_to_patterns_2_2(m);
    }

    private final static Operation predspecs_to_patterns_2_lis_2(Prolog m) { 
        m.trust(null);
        return predspecs_to_patterns_2_4(m);
    }

    private final static Operation predspecs_to_patterns_2_1(Prolog m) { 
    // predspecs_to_patterns(A,B):-var(A),!,trace,dra_error(['A variable instead of predicate specifications: "',A,'"'])
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // predspecs_to_patterns(A,B):-['$get_level'(C),var(A),'$cut'(C),trace,dra_error(['A variable instead of predicate specifications: "',A,'"'])]
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
        a4 = CONS(a1, L_predspecs_to_patterns_2_s4);
        a5 = CONS( ATOM_A$0020variable$0020instead$0020of$0020predicate$0020specifications$003A$0020$0022 , a4);
        return //
 Op("trace", FILE_dra::PRED_trace_0_static_exec, VA(), //
 Op("dra_error", FILE_dra::PRED_dra_error_1_static_exec, VA(a5), cont));
    }

    private final static Operation predspecs_to_patterns_2_2(Prolog m) { 
    // predspecs_to_patterns([A|B],[C|D]):-!,predspec_to_pattern(A,C),predspecs_to_patterns(B,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // predspecs_to_patterns([A|B],[C|D]):-['$neck_cut',predspec_to_pattern(A,C),predspecs_to_patterns(B,D)]
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
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("predspec_to_pattern", FILE_dra::PRED_predspec_to_pattern_2_static_exec, VA(a3, a5), //
 Op("predspecs_to_patterns", FILE_dra::PRED_predspecs_to_patterns_2_static_exec, VA(a4, a6), cont));
    }

    private final static Operation predspecs_to_patterns_2_3(Prolog m) { 
    // predspecs_to_patterns((A,B),[C|D]):-!,predspec_to_pattern(A,C),predspecs_to_patterns(B,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // predspecs_to_patterns((A,B),[C|D]):-['$neck_cut',predspec_to_pattern(A,C),predspecs_to_patterns(B,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002C_2 , m.trail, a3, a4)){
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
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("predspec_to_pattern", FILE_dra::PRED_predspec_to_pattern_2_static_exec, VA(a3, a5), //
 Op("predspecs_to_patterns", FILE_dra::PRED_predspecs_to_patterns_2_static_exec, VA(a4, a6), cont));
    }

    private final static Operation predspecs_to_patterns_2_4(Prolog m) { 
    // predspecs_to_patterns(A,[B]):-predspec_to_pattern(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // predspecs_to_patterns(A,[B]):-[predspec_to_pattern(A,B)]
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
        return //
 Op("predspec_to_pattern", FILE_dra::PRED_predspec_to_pattern_2_static_exec, VA(a1, a3), cont);
    }
/** PREDICATE: predspec_to_pattern/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(predspec_to_pattern/2,non-(public))
        final static Functor FUNCTOR_$002B_1 = F("+",1);
        final static Functor FUNCTOR_$002D_1 = F("-",1);




    public static Operation PRED_predspec_to_pattern_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return predspec_to_pattern_2_top(m);
    }

    private final static Operation predspec_to_pattern_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_dra::predspec_to_pattern_2_var, FILE_dra::predspec_to_pattern_2_int, FILE_dra::predspec_to_pattern_2_int, FILE_dra::predspec_to_pattern_2_int, FILE_dra::predspec_to_pattern_2_var, FILE_dra::predspec_to_pattern_2_int); 
    }

    private final static Operation predspec_to_pattern_2_var(Prolog m) { 
        m.jtry2(null, FILE_dra::predspec_to_pattern_2_var_1);
        return predspec_to_pattern_2_1(m);
    }

    private final static Operation predspec_to_pattern_2_var_1(Prolog m) { 
        m.retry(null, FILE_dra::predspec_to_pattern_2_var_2);
        return predspec_to_pattern_2_2(m);
    }

    private final static Operation predspec_to_pattern_2_var_2(Prolog m) { 
        m.retry(null, FILE_dra::predspec_to_pattern_2_var_3);
        return predspec_to_pattern_2_3(m);
    }

    private final static Operation predspec_to_pattern_2_var_3(Prolog m) { 
        m.retry(null, FILE_dra::predspec_to_pattern_2_var_4);
        return predspec_to_pattern_2_4(m);
    }

    private final static Operation predspec_to_pattern_2_var_4(Prolog m) { 
        m.trust(null);
        return predspec_to_pattern_2_5(m);
    }

    private final static Operation predspec_to_pattern_2_int(Prolog m) { 
        m.jtry2(null, FILE_dra::predspec_to_pattern_2_int_1);
        return predspec_to_pattern_2_4(m);
    }

    private final static Operation predspec_to_pattern_2_int_1(Prolog m) { 
        m.trust(null);
        return predspec_to_pattern_2_5(m);
    }

    private final static Operation predspec_to_pattern_2_1(Prolog m) { 
    // predspec_to_pattern(+A,+B):-!,predspec_to_pattern(A,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // predspec_to_pattern(+A,+B):-['$neck_cut',predspec_to_pattern(A,B)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002B_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002B_1 , m.trail, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a3;
        m.AREGS[1] = a4;
m.cont = cont;
        return predspec_to_pattern_2_top(m);
    }

    private final static Operation predspec_to_pattern_2_2(Prolog m) { 
    // predspec_to_pattern(-A,-B):-!,predspec_to_pattern(A,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // predspec_to_pattern(-A,-B):-['$neck_cut',predspec_to_pattern(A,B)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D_1 , m.trail, a3)){
                return m.fail();
            }
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002D_1 , m.trail, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a3;
        m.AREGS[1] = a4;
m.cont = cont;
        return predspec_to_pattern_2_top(m);
    }

    private final static Operation predspec_to_pattern_2_3(Prolog m) { 
    // predspec_to_pattern(A:B,A:C):-!,predspec_to_pattern(B,C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // predspec_to_pattern(A:B,A:C):-['$neck_cut',predspec_to_pattern(B,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a2 = a2.dref();
            a5 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a5;
m.cont = cont;
        return predspec_to_pattern_2_top(m);
    }

    private final static Operation predspec_to_pattern_2_4(Prolog m) { 
    // predspec_to_pattern(A,B):-B\=C/D,!,A=B
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // predspec_to_pattern(A,B):-['$get_level'(C),'$not_unifiable'(B,D/E),'$cut'(C),'$unify'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void,void],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$002F_2 , m.mkvar3(), m.mkvar3());
 ;
        //START inline expansion of $not_unifiable(a(2),a(4))
        if (a2.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(1),a(2))
        if (! a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation predspec_to_pattern_2_5(Prolog m) { 
    // predspec_to_pattern(A,B):-check_predspec(A),A=C/D,mk_pattern(C,D,B)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // predspec_to_pattern(A,B):-[check_predspec(A),'$unify'(A,C/D),mk_pattern(C,D,B)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002F_2 , a3, a4);
 ;
        return //
 Op("check_predspec", FILE_dra::PRED_check_predspec_1_static_exec, VA(a1), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a1, a5), //
 Op("mk_pattern", FILE_dra::PRED_mk_pattern_3_static_exec, VA(a3, a4, a2), cont)));
    }
/** PREDICATE: check_predspec/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(check_predspec/1,non-(public))
        final static Functor ATOM_A$0020variable$0020instead$0020of$0020a$0020predicate$0020specification$003A$0020$0022 = SYM("A variable instead of a predicate specification: \"");
    private static final Compound L_check_predspec_1_s4 = CONS( ATOM_$0022 ,  Prolog.Nil );
        final static Functor ATOM_An$0020incorrect$0020predicate$0020specification$003A$0020$0022 = SYM("An incorrect predicate specification: \"");




    public static Operation PRED_check_predspec_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_dra::check_predspec_1_var, FILE_dra::check_predspec_1_int, FILE_dra::check_predspec_1_int, FILE_dra::check_predspec_1_int, FILE_dra::check_predspec_1_var, FILE_dra::check_predspec_1_int); 
    }

    private final static Operation check_predspec_1_var(Prolog m) { 
        m.jtry1(null, FILE_dra::check_predspec_1_var_1);
        return check_predspec_1_1(m);
    }

    private final static Operation check_predspec_1_var_1(Prolog m) { 
        m.retry(null, FILE_dra::check_predspec_1_var_2);
        return check_predspec_1_2(m);
    }

    private final static Operation check_predspec_1_var_2(Prolog m) { 
        m.trust(null);
        return check_predspec_1_3(m);
    }

    private final static Operation check_predspec_1_int(Prolog m) { 
        m.jtry1(null, FILE_dra::check_predspec_1_int_1);
        return check_predspec_1_1(m);
    }

    private final static Operation check_predspec_1_int_1(Prolog m) { 
        m.trust(null);
        return check_predspec_1_3(m);
    }

    private final static Operation check_predspec_1_1(Prolog m) { 
    // check_predspec(A):-var(A),!,dra_error(['A variable instead of a predicate specification: "',A,'"'])
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // check_predspec(A):-['$get_level'(B),var(A),'$cut'(B),dra_error(['A variable instead of a predicate specification: "',A,'"'])]
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
        a3 = CONS(a1, L_check_predspec_1_s4);
        a4 = CONS( ATOM_A$0020variable$0020instead$0020of$0020a$0020predicate$0020specification$003A$0020$0022 , a3);
        return //
 Op("dra_error", FILE_dra::PRED_dra_error_1_static_exec, VA(a4), cont);
    }

    private final static Operation check_predspec_1_2(Prolog m) { 
    // check_predspec(A/B):-atom(A),integer(B),B>=0,!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // check_predspec(A/B):-['$get_level'(C),atom(A),integer(B),D is 0,'$greater_or_equal'(B,D),'$cut'(C)]
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
        //START inline expansion of atom(a(2))
        a2 = a2.dref();
        if (! (a2 .isAtom())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of integer(a(3))
        a3 = a3.dref();
        if (! (a3 .isInteger())) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        //START inline expansion of a(5)is@(int_0)
        if (! a5.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_or_equal(a(3),a(5))
        if (Arithmetic.evaluate(a3).arithCompareTo(Arithmetic.evaluate(a5)) < 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation check_predspec_1_3(Prolog m) { 
    // check_predspec(A):-trace,dra_error(['An incorrect predicate specification: "',A,'"'])
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // check_predspec(A):-[trace,dra_error(['An incorrect predicate specification: "',A,'"'])]
        a2 = CONS(a1, L_check_predspec_1_s4);
        a3 = CONS( ATOM_An$0020incorrect$0020predicate$0020specification$003A$0020$0022 , a2);
        return //
 Op("trace", FILE_dra::PRED_trace_0_static_exec, VA(), //
 Op("dra_error", FILE_dra::PRED_dra_error_1_static_exec, VA(a3), cont));
    }
/** PREDICATE: are_variants/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(are_variants/2,non-(public))




    public static Operation PRED_are_variants_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // are_variants(A,B):-variant(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // are_variants(A,B):-[variant(A,B)]
        return //
 Op("variant", FILE_dra::PRED_variant_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: write_shallow/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(write_shallow/3,non-(public))
        final static Functor FUNCTOR_max_depth_1 = F("max_depth",1);




    public static Operation PRED_write_shallow_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // write_shallow(A,B,C):-write_term(A,B,[max_depth(C)])
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // write_shallow(A,B,C):-[write_term(A,B,[max_depth(C)])]
    // put_str_args([a(3)],y(1)),put_str(@('FUNCTOR_max_depth_1'),y(1),a(4))
        a4 =  S( FUNCTOR_max_depth_1 , a3);
 ;
        a5 = CONS(a4,  Prolog.Nil );
        return //
 Op("write_term", FILE_dra::PRED_write_term_3_static_exec, VA(a1, a2, a5), cont);
    }
/** PREDICATE: $dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/1,non-(public))
        final static Functor ATOM_built_in = SYM("built_in");




    public static Operation PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1);
        return $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(m);
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(m);
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(Prolog m) { 
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-(predicate_property(A,built_in),predicate_property(A,static)),!,fail
         Term a1, a2;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-['$get_level'(B),predicate_property(A,built_in),predicate_property(A,static),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("predicate_property", FILE_dra::PRED_predicate_property_2_static_exec, VA(a1,  ATOM_built_in ), //
 Op("predicate_property", FILE_dra::PRED_predicate_property_2_static_exec, VA(a1,  ATOM_static ), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), fail_0)));
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(Prolog m) { 
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/1,non-(public))




    public static Operation PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1);
        return $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(m);
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(m);
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(Prolog m) { 
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-'$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-['$get_level'(B),'$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec, VA(a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(Prolog m) { 
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-[]
        return cont;
    }
/** PREDICATE: is_swi_builtin/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(is_swi_builtin/1,non-(public))




    public static Operation PRED_is_swi_builtin_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // is_swi_builtin(A):-'$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // is_swi_builtin(A):-['$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A)]
        return //
 Op("$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: dra_setval_flag/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_setval_flag/2,non-(public))




    public static Operation PRED_dra_setval_flag_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_setval_flag(A,B):-flag(A,C,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // dra_setval_flag(A,B):-[flag(A,C,B)]
        return //
 Op("flag", FILE_dra::PRED_flag_3_static_exec, VA(a1, m.DONT_CARE2(), a2), cont);
    }
/** PREDICATE: dra_getval_flag/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_getval_flag/2,non-(public))




    public static Operation PRED_dra_getval_flag_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_getval_flag(A,B):-flag(A,B,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // dra_getval_flag(A,B):-[flag(A,B,B)]
        return //
 Op("flag", FILE_dra::PRED_flag_3_static_exec, VA(a1, a2, a2), cont);
    }
/** PREDICATE: dra_incval_flag/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_incval_flag/1,non-(public))
        final static Functor FUNCTOR_$002B_2 = F("+",2);




    public static Operation PRED_dra_incval_flag_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_incval_flag(A):-flag(A,B,B+1)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
    // dra_incval_flag(A):-[flag(A,B,B+1)]
        a2 = m.mkvar1();
    // put_str_args([a(2),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(3))
        a3 =  S( FUNCTOR_$002B_2 , a2,  int_1 );
 ;
        return //
 Op("flag", FILE_dra::PRED_flag_3_static_exec, VA(a1, a2, a3), cont);
    }
/** PREDICATE: empty_tree/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(empty_tree/1,non-(public))
        final static Functor ATOM_empty = SYM("empty");




    public static Operation PRED_empty_tree_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // empty_tree(empty):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // empty_tree(empty):-[]
        if (!  ATOM_empty .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/7,non-(public))

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_dra::$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_sub_1);
        return $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_1(m);
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_sub_2);
        return $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_2(m);
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_3(m);
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_1(Prolog m) { 
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-A=D,!,C=E
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-['$get_level'(H),'$unify'(A,D),'$cut'(H),'$unify'(C,E)]
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),a(4))
        if (! a1.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(8))
        a8 = a8.dref();
                  m.cut( a8.intValue());
        //END inline expansion
        //START inline expansion of $unify(a(3),a(5))
        if (! a3.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_2(Prolog m) { 
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-'$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,F)
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
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-['$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,F)]
        return //
 Op("$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_static_exec, VA(a1, a2, a3, a4, a6), cont);
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_3(Prolog m) { 
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-is_in_tree(G,A,B,C)
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
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-[is_in_tree(G,A,B,C)]
        return //
 Op("is_in_tree", FILE_dra::PRED_is_in_tree_4_static_exec, VA(a7, a1, a2, a3), cont);
    }
/** PREDICATE: $dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_dra::$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_sub_1);
        return $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_1(m);
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_2(m);
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_1(Prolog m) { 
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-call(B,A,D),!,is_in_tree(E,A,B,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-['$get_level'(F),call(B,A,D),'$cut'(F),is_in_tree(E,A,B,C)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("call", FILE_dra::PRED_call_3_static_exec, VA(a2, a1, a4), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a6), //
 Op("is_in_tree", FILE_dra::PRED_is_in_tree_4_static_exec, VA(a5, a1, a2, a3), cont)));
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_2(Prolog m) { 
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-fail
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: is_in_tree/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(is_in_tree/4,non-(public))
        final static Functor FUNCTOR_t_4 = F("t",4);




    public static Operation PRED_is_in_tree_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // is_in_tree(A,B,C,D):-A=t(E,F,G,H),'$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,C,D,E,F,G,H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // is_in_tree(A,B,C,D):-['$unify'(A,t(E,F,G,H)),'$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,C,D,E,F,G,H)]
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
    // put_str_args([a(5),a(6),a(7),a(8)],y(1)),put_str(@('FUNCTOR_t_4'),y(1),a(9))
        a9 =  S( FUNCTOR_t_4 , a5, a6, a7, a8);
 ;
        //START inline expansion of $unify(a(1),a(9))
        if (! a1.unify(a9, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_static_exec, VA(a2, a3, a4, a5, a6, a7, a8), cont);
    }
/** PREDICATE: $dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/6,non-(public))

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_dra::$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1);
        return $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(m);
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(m);
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(Prolog m) { 
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-empty_tree(A),!,D=t(B,C,E,F),empty_tree(E),empty_tree(F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-['$get_level'(G),empty_tree(A),'$cut'(G),'$unify'(D,t(B,C,E,F)),empty_tree(E),empty_tree(F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2),a(3),a(5),a(6)],y(1)),put_str(@('FUNCTOR_t_4'),y(1),a(8))
        a8 =  S( FUNCTOR_t_4 , a2, a3, a5, a6);
 ;
        return //
 Op("empty_tree", FILE_dra::PRED_empty_tree_1_static_exec, VA(a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a7), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a4, a8), //
 Op("empty_tree", FILE_dra::PRED_empty_tree_1_static_exec, VA(a5), //
 Op("empty_tree", FILE_dra::PRED_empty_tree_1_static_exec, VA(a6), cont)))));
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(Prolog m) { 
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-fail
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: tree_add/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(tree_add/6,non-(public))

    // private final Term arg5, arg6;




    public static Operation PRED_tree_add_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_dra::tree_add_6_sub_1);
        return tree_add_6_1(m);
    }

    private final static Operation tree_add_6_sub_1(Prolog m) { 
        m.trust(null);
        return tree_add_6_2(m);
    }

    private final static Operation tree_add_6_1(Prolog m) { 
    // tree_add(A,B,C,D,E,F):-'$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,F,G,H)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // tree_add(A,B,C,D,E,F):-['$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,F,G,H)]
        return //
 Op("$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec, VA(a1, a2, a3, a6, m.DONT_CARE2(), m.DONT_CARE2()), cont);
    }

    private final static Operation tree_add_6_2(Prolog m) { 
    // tree_add(A,B,C,D,E,F):-A=t(G,H,I,J),'$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,C,D,E,F,G,H,I,J,K,L,M)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // tree_add(A,B,C,D,E,F):-['$unify'(A,t(G,H,I,J)),'$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,C,D,E,F,G,H,I,J,K,L,M)]
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
    // put_str_args([a(7),a(8),a(9),a(10)],y(1)),put_str(@('FUNCTOR_t_4'),y(1),a(11))
        a11 =  S( FUNCTOR_t_4 , a7, a8, a9, a10);
 ;
        //START inline expansion of $unify(a(1),a(11))
        if (! a1.unify(a11, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_static_exec, VA(a2, a3, a4, a5, a6, a7, a8, a9, a10, m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2()), cont);
    }
/** PREDICATE: $dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/12
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/12,non-(public))

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12;




    public static Operation PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(12, null, FILE_dra::$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_sub_1);
        return $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_1(m);
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_sub_2);
        return $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_2(m);
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_3(m);
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_1(Prolog m) { 
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-A=F,!,call(D,G,B,J),E=t(F,J,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
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
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        cont = m.cont;
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-['$get_level'(M),'$unify'(A,F),'$cut'(M),call(D,G,B,J),'$unify'(E,t(F,J,H,I))]
        a13 = m.mkvar1();
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),a(6))
        if (! a1.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(13))
        a13 = a13.dref();
                  m.cut( a13.intValue());
        //END inline expansion
    // put_str_args([a(6),a(10),a(8),a(9)],y(1)),put_str(@('FUNCTOR_t_4'),y(1),a(14))
        a14 =  S( FUNCTOR_t_4 , a6, a10, a8, a9);
 ;
        return //
 Op("call", FILE_dra::PRED_call_4_static_exec, VA(a4, a7, a2, a10), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a5, a14), cont));
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_2(Prolog m) { 
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-'$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,K)
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
        a12 = m.AREGS[11];
        cont = m.cont;
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-['$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,K)]
        return //
 Op("$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_10_static_exec, VA(a1, a2, a3, a4, a5, a6, a7, a8, a9, a11), cont);
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_3(Prolog m) { 
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-E=t(A,G,H,L),tree_add(I,A,B,C,D,L)
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
        a12 = m.AREGS[11];
        cont = m.cont;
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L):-['$unify'(E,t(A,G,H,L)),tree_add(I,A,B,C,D,L)]
    // put_str_args([a(1),a(7),a(8),a(12)],y(1)),put_str(@('FUNCTOR_t_4'),y(1),a(13))
        a13 =  S( FUNCTOR_t_4 , a1, a7, a8, a12);
 ;
        //START inline expansion of $unify(a(5),a(13))
        if (! a5.unify(a13, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("tree_add", FILE_dra::PRED_tree_add_6_static_exec, VA(a9, a1, a2, a3, a4, a12), cont);
    }
/** PREDICATE: $dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/10
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/10,non-(public))

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10;




    public static Operation PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_10_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(10, null, FILE_dra::$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_10_sub_1);
        return $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_10_1(m);
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_10_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_10_2(m);
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_10_1(Prolog m) { 
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J):-call(C,A,F),!,E=t(A,G,J,I),tree_add(H,A,B,C,D,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
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
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J):-['$get_level'(K),call(C,A,F),'$cut'(K),'$unify'(E,t(A,G,J,I)),tree_add(H,A,B,C,D,J)]
        a11 = m.mkvar1();
        //START inline expansion of $get_level(a(11))
        if (! a11.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),a(7),a(10),a(9)],y(1)),put_str(@('FUNCTOR_t_4'),y(1),a(12))
        a12 =  S( FUNCTOR_t_4 , a1, a7, a10, a9);
 ;
        return //
 Op("call", FILE_dra::PRED_call_3_static_exec, VA(a3, a1, a6), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a11), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a5, a12), //
 Op("tree_add", FILE_dra::PRED_tree_add_6_static_exec, VA(a8, a1, a2, a3, a4, a10), cont))));
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_10_2(Prolog m) { 
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J):-fail
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
        a10 = m.AREGS[9];
        cont = m.cont;
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: empty_goal_table/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(empty_goal_table/1,non-(public))




    public static Operation PRED_empty_goal_table_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // empty_goal_table(A):-empty_tree(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // empty_goal_table(A):-[empty_tree(A)]
        return //
 Op("empty_tree", FILE_dra::PRED_empty_tree_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: goal_table_member/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(goal_table_member/2,non-(public))
        final static Functor ATOM_$0040$003C = SYM("@<");
        final static Functor FUNCTOR_essence_hook_2 = F("essence_hook",2);




    public static Operation PRED_goal_table_member_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // goal_table_member(A,B):-functor(A,C,D),is_in_tree(B,C/D,@<,E),once(essence_hook(A,F)),member_reversed(G,E),once(essence_hook(G,F))
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4;
        a1 = LARG[0];
        a2 = LARG[1];
    // goal_table_member(A,B):-[functor(A,C,D),is_in_tree(B,C/D,@<,E),once('$dra':essence_hook(A,F)),member_reversed(G,E),once('$dra':essence_hook(G,F))]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002F_2 , a3, a4);
 ;
        a6 = m.mkvar1();
        a7 = m.mkvar1();
    // put_str_args([a(1),a(7)],y(2)),put_str(@('FUNCTOR_essence_hook_2'),y(2),a(8))
        a8 =  S( FUNCTOR_essence_hook_2 , a1, a7);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(8)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a8);
 ;
        a10 = m.mkvar1();
    // put_str_args([a(10),a(7)],y(4)),put_str(@('FUNCTOR_essence_hook_2'),y(4),a(11))
        a11 =  S( FUNCTOR_essence_hook_2 , a10, a7);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(11)],y(5)),put_str(@('FUNCTOR_module_colon_2'),y(5),a(12))
        a12 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a11);
 ;
        return //
 Op("functor", FILE_dra::PRED_functor_3_static_exec, VA(a1, a3, a4), //
 Op("is_in_tree", FILE_dra::PRED_is_in_tree_4_static_exec, VA(a2, a5,  ATOM_$0040$003C , a6), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a9), //
 Op("member_reversed", FILE_dra::PRED_member_reversed_2_static_exec, VA(a10, a6), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a12), cont)))));
    }
/** PREDICATE: is_a_variant_in_goal_table/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(is_a_variant_in_goal_table/2,non-(public))




    public static Operation PRED_is_a_variant_in_goal_table_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // is_a_variant_in_goal_table(A,B):-once(essence_hook(A,C)),functor(A,D,E),is_in_tree(B,D/E,@<,F),member_reversed(G,F),once(essence_hook(G,H)),are_variants(H,C),!
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1, p2, p3, p4, p5, p6;
        a1 = LARG[0];
        a2 = LARG[1];
    // is_a_variant_in_goal_table(A,B):-['$get_level'(C),once('$dra':essence_hook(A,D)),functor(A,E,F),is_in_tree(B,E/F,@<,G),member_reversed(H,G),once('$dra':essence_hook(H,I)),are_variants(I,D),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
    // put_str_args([a(1),a(4)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(5))
        a5 =  S( FUNCTOR_essence_hook_2 , a1, a4);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
        a7 = m.mkvar1();
        a8 = m.mkvar1();
    // put_str_args([a(7),a(8)],y(3)),put_str(@('FUNCTOR_$002F_2'),y(3),a(9))
        a9 =  S( FUNCTOR_$002F_2 , a7, a8);
 ;
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
    // put_str_args([a(11),a(12)],y(4)),put_str(@('FUNCTOR_essence_hook_2'),y(4),a(13))
        a13 =  S( FUNCTOR_essence_hook_2 , a11, a12);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(13)],y(5)),put_str(@('FUNCTOR_module_colon_2'),y(5),a(14))
        a14 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a13);
 ;
        return //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a6), //
 Op("functor", FILE_dra::PRED_functor_3_static_exec, VA(a1, a7, a8), //
 Op("is_in_tree", FILE_dra::PRED_is_in_tree_4_static_exec, VA(a2, a9,  ATOM_$0040$003C , a10), //
 Op("member_reversed", FILE_dra::PRED_member_reversed_2_static_exec, VA(a11, a10), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a14), //
 Op("are_variants", FILE_dra::PRED_are_variants_2_static_exec, VA(a12, a4), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont)))))));
    }
/** PREDICATE: member_reversed/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(member_reversed/2,non-(public))




    public static Operation PRED_member_reversed_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return member_reversed_2_top(m);
    }

    private final static Operation member_reversed_2_top(Prolog m) { 
        m.setB0();
        m.jtry2(null, FILE_dra::member_reversed_2_sub_1);
        return member_reversed_2_1(m);
    }

    private final static Operation member_reversed_2_sub_1(Prolog m) { 
        m.trust(null);
        return member_reversed_2_2(m);
    }

    private final static Operation member_reversed_2_1(Prolog m) { 
    // member_reversed(A,[B|C]):-member_reversed(A,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // member_reversed(A,[B|C]):-[member_reversed(A,C)]
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
        return member_reversed_2_top(m);
    }

    private final static Operation member_reversed_2_2(Prolog m) { 
    // member_reversed(A,[A|B]):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // member_reversed(A,[A|B]):-[]
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
/** PREDICATE: goal_table_add/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(goal_table_add/3,non-(public))
        final static Functor ATOM_add_to_list = SYM("add_to_list");




    public static Operation PRED_goal_table_add_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // goal_table_add(A,B,C):-functor(B,D,E),tree_add(A,D/E,[B],@<,add_to_list,C)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // goal_table_add(A,B,C):-[functor(B,D,E),tree_add(A,D/E,[B],@<,add_to_list,C)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002F_2 , a4, a5);
 ;
        a7 = CONS(a2,  Prolog.Nil );
        return //
 Op("functor", FILE_dra::PRED_functor_3_static_exec, VA(a2, a4, a5), //
 Op("tree_add", FILE_dra::PRED_tree_add_6_static_exec, VA(a1, a6, a7,  ATOM_$0040$003C ,  ATOM_add_to_list , a3), cont));
    }
/** PREDICATE: add_to_list/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(add_to_list/3,non-(public))




    public static Operation PRED_add_to_list_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // add_to_list(A,[B],[B|A]):-true
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // add_to_list(A,[B],[B|A]):-[]
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
        if (a3 .isCons()){
                        if (! a4.unify(a3.car(), m.trail))
                return m.fail();
            if (! a1.unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
             a3.bind(CONS(a4, a1), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }
/** PREDICATE: empty_hypotheses/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(empty_hypotheses/1,non-(public))




    public static Operation PRED_empty_hypotheses_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // empty_hypotheses(A):-empty_goal_table(A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // empty_hypotheses(A):-[empty_goal_table(A)]
        return //
 Op("empty_goal_table", FILE_dra::PRED_empty_goal_table_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: push_is_coinductive/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(push_is_coinductive/3,non-(public))




    public static Operation PRED_push_is_coinductive_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // push_is_coinductive(A,B,C):-goal_table_add(B,A,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // push_is_coinductive(A,B,C):-[goal_table_add(B,A,C)]
        return //
 Op("goal_table_add", FILE_dra::PRED_goal_table_add_3_static_exec, VA(a2, a1, a3), cont);
    }
/** PREDICATE: unify_with_coinductive_ancestor/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(unify_with_coinductive_ancestor/2,non-(public))




    public static Operation PRED_unify_with_coinductive_ancestor_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // unify_with_coinductive_ancestor(A,B):-goal_table_member(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // unify_with_coinductive_ancestor(A,B):-[goal_table_member(A,B)]
        return //
 Op("goal_table_member", FILE_dra::PRED_goal_table_member_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: empty_stack/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(empty_stack/1,non-(public))
        final static Functor FUNCTOR_tstack_2 = F("tstack",2);




    public static Operation PRED_empty_stack_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // empty_stack(tstack([],A)):-empty_goal_table(A)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // empty_stack(tstack([],A)):-[empty_goal_table(A)]
        a1 = a1.dref();
            a2 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_tstack_2 , m.trail,  Prolog.Nil , a2)){
                return m.fail();
            }
        return //
 Op("empty_goal_table", FILE_dra::PRED_empty_goal_table_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: push_is_tabled/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(push_is_tabled/5,non-(public))
        final static Functor FUNCTOR_triple_3 = F("triple",3);

    // private final Term arg5;




    public static Operation PRED_push_is_tabled_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // push_is_tabled(A,B,C,tstack(D,E),tstack([triple(A,B,C)|D],F)):-goal_table_add(E,A,F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // push_is_tabled(A,B,C,tstack(D,E),tstack([triple(A,B,C)|D],F)):-[goal_table_add(E,A,F)]
        a4 = a4.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_tstack_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a5 = a5.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_tstack_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a8 = a8.dref();
        if (a8 .isCons()){
                        a10 = a8.car();
            if (! a6.unify(a8.cdr(), m.trail))
                return m.fail();
        } else if (a8.isVar()){
            a10 = m.mkvar2();
             a8.bind(CONS(a10, a6), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_triple_3 , m.trail, a1, a2, a3)){
                return m.fail();
            }
        return //
 Op("goal_table_add", FILE_dra::PRED_goal_table_add_3_static_exec, VA(a7, a1, a9), cont);
    }
/** PREDICATE: is_variant_of_ancestor/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(is_variant_of_ancestor/4,non-(public))




    public static Operation PRED_is_variant_of_ancestor_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // is_variant_of_ancestor(A,tstack(B,C),D,E):-is_a_variant_in_goal_table(A,C),append(E,[D|F],B),D=triple(G,H,I),are_essences_variants(A,G),!
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // is_variant_of_ancestor(A,tstack(B,C),D,E):-['$get_level'(F),is_a_variant_in_goal_table(A,C),append(E,[D|G],B),'$unify'(D,triple(H,I,J)),are_essences_variants(A,H),'$cut'(F)]
        a2 = a2.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_tstack_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = CONS(a3, m.DONT_CARE1());
        a9 = m.mkvar1();
    // put_str_args([a(9),void,void],y(1)),put_str(@('FUNCTOR_triple_3'),y(1),a(10))
        a10 =  S( FUNCTOR_triple_3 , a9, m.mkvar3(), m.mkvar3());
 ;
        return //
 Op("is_a_variant_in_goal_table", FILE_dra::PRED_is_a_variant_in_goal_table_2_static_exec, VA(a1, a6), //
 Op("append", FILE_dra::PRED_append_3_static_exec, VA(a4, a8, a5), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a3, a10), //
 Op("are_essences_variants", FILE_dra::PRED_are_essences_variants_2_static_exec, VA(a1, a9), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a7), cont)))));
    }
/** PREDICATE: dra_version/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_version/1,non-(public))
        final static Functor ATOM_DRA$0020$0028$0028c$0029$0020UTD$00202009$0029$0020version$00200$002E97$0020$0028beta$0029$002C$0020June$00202011$0020$002D$0020LOGICMOO = SYM("DRA ((c) UTD 2009) version 0.97 (beta), June 2011 - LOGICMOO");




    public static Operation PRED_dra_version_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_version('DRA ((c) UTD 2009) version 0.97 (beta), June 2011 - LOGICMOO'):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // dra_version('DRA ((c) UTD 2009) version 0.97 (beta), June 2011 - LOGICMOO'):-[]
        if (!  ATOM_DRA$0020$0028$0028c$0029$0020UTD$00202009$0029$0020version$00200$002E97$0020$0028beta$0029$002C$0020June$00202011$0020$002D$0020LOGICMOO .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: initialize_table/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(initialize_table/0,public)
        final static Functor FUNCTOR_dra_version_1 = F("dra_version",1);
        final static Functor FUNCTOR_dra_w_1 = F("dra_w",1);




    public static Operation PRED_initialize_table_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // initialize_table:-abolish_tables,retractall(is_coinductive0(A)),retractall(is_coinductive1(B)),retractall(is_tabled(C)),retractall(is_old_first(D)),dra_must((dra_version(E),dra_w(E)))
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4, p5;
    // initialize_table:-[abolish_tables,retractall('$dra':is_coinductive0(A)),retractall('$dra':is_coinductive1(B)),retractall('$dra':is_tabled(C)),retractall('$dra':is_old_first(D)),dra_must((dra_version(E),dra_w(E)))]
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_is_coinductive0_1'),y(1),a(1))
        a1 =  S( FUNCTOR_is_coinductive0_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(1)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a1);
 ;
    // put_str_args([void],y(3)),put_str(@('FUNCTOR_is_coinductive1_1'),y(3),a(3))
        a3 =  S( FUNCTOR_is_coinductive1_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(3)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a3);
 ;
    // put_str_args([void],y(5)),put_str(@('FUNCTOR_is_tabled_1'),y(5),a(5))
        a5 =  S( FUNCTOR_is_tabled_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(6)),put_str(@('FUNCTOR_module_colon_2'),y(6),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
    // put_str_args([void],y(7)),put_str(@('FUNCTOR_is_old_first_1'),y(7),a(7))
        a7 =  S( FUNCTOR_is_old_first_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(7)],y(8)),put_str(@('FUNCTOR_module_colon_2'),y(8),a(8))
        a8 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a7);
 ;
        a9 = m.mkvar1();
    // put_str_args([a(9)],y(9)),put_str(@('FUNCTOR_dra_version_1'),y(9),a(10))
        a10 =  S( FUNCTOR_dra_version_1 , a9);
 ;
    // put_str_args([a(9)],y(10)),put_str(@('FUNCTOR_dra_w_1'),y(10),a(11))
        a11 =  S( FUNCTOR_dra_w_1 , a9);
 ;
    // put_str_args([a(10),a(11)],y(11)),put_str(@('FUNCTOR_$002C_2'),y(11),a(12))
        a12 =  S( FUNCTOR_$002C_2 , a10, a11);
 ;
        return //
 Op("abolish_tables", FILE_dra::PRED_abolish_tables_0_static_exec, VA(), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a2), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a4), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a6), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a8), //
 Op("dra_must", FILE_dra::PRED_dra_must_1_static_exec, VA(a12), cont))))));
    }
/** PREDICATE: abolish_tables/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(abolish_tables/0,public)
        final static Functor ATOM_reinitialise_answer = SYM("reinitialise_answer");
        final static Functor ATOM_reinitialise_result = SYM("reinitialise_result");
        final static Functor ATOM_reinitialise_pioneer = SYM("reinitialise_pioneer");
        final static Functor ATOM_reinitialise_loop = SYM("reinitialise_loop");
        final static Functor ATOM_reinitialise_looping_alternative = SYM("reinitialise_looping_alternative");
        final static Functor ATOM_reinitialise_completed = SYM("reinitialise_completed");
        final static Functor FUNCTOR_retractall_1 = F("retractall",1);
        final static Functor FUNCTOR_is_traced_1 = F("is_traced",1);
        final static Functor FUNCTOR_dra_setval_flag_2 = F("dra_setval_flag",2);
    private static final Compound L_abolish_tables_0_s14 = S( FUNCTOR_dra_setval_flag_2 ,  ATOM_number_of_answers ,  int_0 );
    private static final Compound L_abolish_tables_0_s17 = S( FUNCTOR_dra_setval_flag_2 ,  ATOM_unique_index ,  int_0 );
        final static Functor ATOM_step_counter = SYM("step_counter");
    private static final Compound L_abolish_tables_0_s20 = S( FUNCTOR_dra_setval_flag_2 ,  ATOM_step_counter ,  int_0 );
        final static Functor ATOM_old_table_size = SYM("old_table_size");
    private static final Compound L_abolish_tables_0_s23 = S( FUNCTOR_dra_setval_flag_2 ,  ATOM_old_table_size ,  int_0 );
    private static final Compound L_abolish_tables_0_s25 = S( FUNCTOR_$002C_2 , L_abolish_tables_0_s20, L_abolish_tables_0_s23);
    private static final Compound L_abolish_tables_0_s27 = S( FUNCTOR_$002C_2 , L_abolish_tables_0_s17, L_abolish_tables_0_s25);
    private static final Compound L_abolish_tables_0_s29 = S( FUNCTOR_$002C_2 , L_abolish_tables_0_s14, L_abolish_tables_0_s27);




    public static Operation PRED_abolish_tables_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // abolish_tables:-dra_must((reinitialise_answer,reinitialise_result,reinitialise_pioneer,reinitialise_loop,reinitialise_looping_alternative,reinitialise_completed,retractall(is_traced(A)),dra_setval_flag(number_of_answers,0),dra_setval_flag(unique_index,0),dra_setval_flag(step_counter,0),dra_setval_flag(old_table_size,0))),!
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1;
    // abolish_tables:-['$get_level'(A),dra_must((reinitialise_answer,reinitialise_result,reinitialise_pioneer,reinitialise_loop,reinitialise_looping_alternative,reinitialise_completed,retractall(is_traced(B)),dra_setval_flag(number_of_answers,0),dra_setval_flag(unique_index,0),dra_setval_flag(step_counter,0),dra_setval_flag(old_table_size,0))),'$cut'(A)]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_is_traced_1'),y(1),a(2))
        a2 =  S( FUNCTOR_is_traced_1 , m.mkvar3());
 ;
    // put_str_args([a(2)],y(2)),put_str(@('FUNCTOR_retractall_1'),y(2),a(3))
        a3 =  S( FUNCTOR_retractall_1 , a2);
 ;
    // put_str_args([a(3),s(29)],y(3)),put_str(@('FUNCTOR_$002C_2'),y(3),a(4))
        a4 =  S( FUNCTOR_$002C_2 , a3, L_abolish_tables_0_s29);
 ;
    // put_str_args([@('ATOM_reinitialise_completed'),a(4)],y(4)),put_str(@('FUNCTOR_$002C_2'),y(4),a(5))
        a5 =  S( FUNCTOR_$002C_2 ,  ATOM_reinitialise_completed , a4);
 ;
    // put_str_args([@('ATOM_reinitialise_looping_alternative'),a(5)],y(5)),put_str(@('FUNCTOR_$002C_2'),y(5),a(6))
        a6 =  S( FUNCTOR_$002C_2 ,  ATOM_reinitialise_looping_alternative , a5);
 ;
    // put_str_args([@('ATOM_reinitialise_loop'),a(6)],y(6)),put_str(@('FUNCTOR_$002C_2'),y(6),a(7))
        a7 =  S( FUNCTOR_$002C_2 ,  ATOM_reinitialise_loop , a6);
 ;
    // put_str_args([@('ATOM_reinitialise_pioneer'),a(7)],y(7)),put_str(@('FUNCTOR_$002C_2'),y(7),a(8))
        a8 =  S( FUNCTOR_$002C_2 ,  ATOM_reinitialise_pioneer , a7);
 ;
    // put_str_args([@('ATOM_reinitialise_result'),a(8)],y(8)),put_str(@('FUNCTOR_$002C_2'),y(8),a(9))
        a9 =  S( FUNCTOR_$002C_2 ,  ATOM_reinitialise_result , a8);
 ;
    // put_str_args([@('ATOM_reinitialise_answer'),a(9)],y(9)),put_str(@('FUNCTOR_$002C_2'),y(9),a(10))
        a10 =  S( FUNCTOR_$002C_2 ,  ATOM_reinitialise_answer , a9);
 ;
        return //
 Op("dra_must", FILE_dra::PRED_dra_must_1_static_exec, VA(a10), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a1), cont));
    }
/** PREDICATE: legal_directive/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(legal_directive/1,non-(public))
        final static Functor FUNCTOR_coinductive_1 = F("coinductive",1);
        final static Functor FUNCTOR_dynamic_1 = F("dynamic",1);
        final static Functor FUNCTOR_old_first_1 = F("old_first",1);
        final static Functor FUNCTOR_multifile_1 = F("multifile",1);
        final static Functor FUNCTOR_answers_2 = F("answers",2);
        final static Functor ATOM_answers = SYM("answers");
        final static Functor FUNCTOR_call_1 = F("call",1);
        final static Functor FUNCTOR_hilog_1 = F("hilog",1);
        final static Functor ATOM_trace = SYM("trace");
        final static Functor FUNCTOR_legal_directive_1 = F("legal_directive",1);




    public static Operation PRED_legal_directive_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_dra::legal_directive_1_var, FILE_dra::legal_directive_1_14, FILE_dra::legal_directive_1_14, FILE_dra::legal_directive_1_con, FILE_dra::legal_directive_1_str, FILE_dra::legal_directive_1_14); 
    }

    private final static Operation legal_directive_1_var(Prolog m) { 
        m.jtry1(null, FILE_dra::legal_directive_1_var_1);
        return legal_directive_1_1(m);
    }

    private final static Operation legal_directive_1_var_1(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_var_2);
        return legal_directive_1_2(m);
    }

    private final static Operation legal_directive_1_var_2(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_var_3);
        return legal_directive_1_3(m);
    }

    private final static Operation legal_directive_1_var_3(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_var_4);
        return legal_directive_1_4(m);
    }

    private final static Operation legal_directive_1_var_4(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_var_5);
        return legal_directive_1_5(m);
    }

    private final static Operation legal_directive_1_var_5(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_var_6);
        return legal_directive_1_6(m);
    }

    private final static Operation legal_directive_1_var_6(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_var_7);
        return legal_directive_1_7(m);
    }

    private final static Operation legal_directive_1_var_7(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_var_8);
        return legal_directive_1_8(m);
    }

    private final static Operation legal_directive_1_var_8(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_var_9);
        return legal_directive_1_9(m);
    }

    private final static Operation legal_directive_1_var_9(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_var_10);
        return legal_directive_1_10(m);
    }

    private final static Operation legal_directive_1_var_10(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_var_11);
        return legal_directive_1_11(m);
    }

    private final static Operation legal_directive_1_var_11(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_var_12);
        return legal_directive_1_12(m);
    }

    private final static Operation legal_directive_1_var_12(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_var_13);
        return legal_directive_1_13(m);
    }

    private final static Operation legal_directive_1_var_13(Prolog m) { 
        m.trust(null);
        return legal_directive_1_14(m);
    }

    private final static Operation legal_directive_1_con(Prolog m) { 
        m.jtry1(null, FILE_dra::legal_directive_1_con_1);
        return legal_directive_1_8(m);
    }

    private final static Operation legal_directive_1_con_1(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_con_2);
        return legal_directive_1_11(m);
    }

    private final static Operation legal_directive_1_con_2(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_con_3);
        return legal_directive_1_12(m);
    }

    private final static Operation legal_directive_1_con_3(Prolog m) { 
        m.trust(null);
        return legal_directive_1_14(m);
    }

    private final static Operation legal_directive_1_str(Prolog m) { 
        m.jtry1(null, FILE_dra::legal_directive_1_str_1);
        return legal_directive_1_1(m);
    }

    private final static Operation legal_directive_1_str_1(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_str_2);
        return legal_directive_1_2(m);
    }

    private final static Operation legal_directive_1_str_2(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_str_3);
        return legal_directive_1_3(m);
    }

    private final static Operation legal_directive_1_str_3(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_str_4);
        return legal_directive_1_4(m);
    }

    private final static Operation legal_directive_1_str_4(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_str_5);
        return legal_directive_1_5(m);
    }

    private final static Operation legal_directive_1_str_5(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_str_6);
        return legal_directive_1_6(m);
    }

    private final static Operation legal_directive_1_str_6(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_str_7);
        return legal_directive_1_7(m);
    }

    private final static Operation legal_directive_1_str_7(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_str_8);
        return legal_directive_1_9(m);
    }

    private final static Operation legal_directive_1_str_8(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_str_9);
        return legal_directive_1_10(m);
    }

    private final static Operation legal_directive_1_str_9(Prolog m) { 
        m.retry(null, FILE_dra::legal_directive_1_str_10);
        return legal_directive_1_13(m);
    }

    private final static Operation legal_directive_1_str_10(Prolog m) { 
        m.trust(null);
        return legal_directive_1_14(m);
    }

    private final static Operation legal_directive_1_1(Prolog m) { 
    // legal_directive(coinductive(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive(coinductive(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_coinductive_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation legal_directive_1_2(Prolog m) { 
    // legal_directive((coinductive1 A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive((coinductive1 A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_coinductive1_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation legal_directive_1_3(Prolog m) { 
    // legal_directive((table A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive((table A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_table_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation legal_directive_1_4(Prolog m) { 
    // legal_directive((dynamic A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive((dynamic A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_dynamic_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation legal_directive_1_5(Prolog m) { 
    // legal_directive((old_first A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive((old_first A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_old_first_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation legal_directive_1_6(Prolog m) { 
    // legal_directive((multifile A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive((multifile A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_multifile_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation legal_directive_1_7(Prolog m) { 
    // legal_directive(answers(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive(answers(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_answers_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation legal_directive_1_8(Prolog m) { 
    // legal_directive(answers):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive(answers):-[]
        if (!  ATOM_answers .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation legal_directive_1_9(Prolog m) { 
    // legal_directive(call(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive(call(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_call_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation legal_directive_1_10(Prolog m) { 
    // legal_directive((hilog A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive((hilog A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_hilog_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation legal_directive_1_11(Prolog m) { 
    // legal_directive(trace):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive(trace):-[]
        if (!  ATOM_trace .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation legal_directive_1_12(Prolog m) { 
    // legal_directive(notrace):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive(notrace):-[]
        if (!  ATOM_notrace .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation legal_directive_1_13(Prolog m) { 
    // legal_directive(A:B):-atom(A),A:legal_directive(B)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive(A:B):-[atom(A),call(A:legal_directive(B))]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a2, a3)){
                return m.fail();
            }
        //START inline expansion of atom(a(2))
        a2 = a2.dref();
        if (! (a2 .isAtom())) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(3)],y(1)),put_str(@('FUNCTOR_legal_directive_1'),y(1),a(4))
        a4 =  S( FUNCTOR_legal_directive_1 , a3);
 ;
    // put_str_args([a(2),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 , a2, a4);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a5), cont);
    }

    private final static Operation legal_directive_1_14(Prolog m) { 
    // legal_directive(A):-compound(A),functor(A,B,1),property_pred(B,C)
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // legal_directive(A):-[compound(A),functor(A,B,1),property_pred(B,C)]
        a2 = m.mkvar1();
        return //
 Op("compound", FILE_dra::PRED_compound_1_static_exec, VA(a1), //
 Op("functor", FILE_dra::PRED_functor_3_static_exec, VA(a1, a2,  int_1 ), //
 Op("property_pred", FILE_dra::PRED_property_pred_2_static_exec, VA(a2, m.DONT_CARE2()), cont)));
    }
/** PREDICATE: $dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/1,non-(public))




    public static Operation PRED_$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1);
        return $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(m);
    }

    private final static Operation $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(m);
    }

    private final static Operation $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(Prolog m) { 
    // '$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-legal_directive(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-['$get_level'(B),legal_directive(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("legal_directive", FILE_dra::PRED_legal_directive_1_static_exec, VA(a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(Prolog m) { 
    // '$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-[]
        return cont;
    }
/** PREDICATE: process_dra_ective/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(process_dra_ective/1,public)
        final static Functor FUNCTOR_lines_1 = F("lines",1);
        final static Functor ATOM_Unknown$0020directive$003A = SYM("Unknown directive:");
        final static Functor FUNCTOR_$003A$002D_1 = F(":-",1);
        final static Functor ATOM_$002E = SYM(".");
    private static final Compound L_process_dra_ective_1_s6 = CONS( ATOM_$002E ,  Prolog.Nil );
        final static Functor FUNCTOR_print_required_answers_2 = F("print_required_answers",2);




    public static Operation PRED_process_dra_ective_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_dra::process_dra_ective_1_var, FILE_dra::process_dra_ective_1_int, FILE_dra::process_dra_ective_1_int, FILE_dra::process_dra_ective_1_int, FILE_dra::process_dra_ective_1_var, FILE_dra::process_dra_ective_1_int); 
    }

    private final static Operation process_dra_ective_1_var(Prolog m) { 
        m.jtry1(null, FILE_dra::process_dra_ective_1_var_1);
        return process_dra_ective_1_1(m);
    }

    private final static Operation process_dra_ective_1_var_1(Prolog m) { 
        m.retry(null, FILE_dra::process_dra_ective_1_var_2);
        return process_dra_ective_1_2(m);
    }

    private final static Operation process_dra_ective_1_var_2(Prolog m) { 
        m.trust(null);
        return process_dra_ective_1_3(m);
    }

    private final static Operation process_dra_ective_1_int(Prolog m) { 
        m.jtry1(null, FILE_dra::process_dra_ective_1_int_1);
        return process_dra_ective_1_1(m);
    }

    private final static Operation process_dra_ective_1_int_1(Prolog m) { 
        m.trust(null);
        return process_dra_ective_1_3(m);
    }

    private final static Operation process_dra_ective_1_1(Prolog m) { 
    // process_dra_ective(A):-'$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A),!,dra_error(lines(['Unknown directive:',[(:-A),'.']]))
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // process_dra_ective(A):-['$get_level'(B),'$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A),'$cut'(B),dra_error(lines(['Unknown directive:',[(:-A),'.']]))]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_$003A$002D_1'),y(1),a(3))
        a3 =  S( FUNCTOR_$003A$002D_1 , a1);
 ;
        a4 = CONS(a3, L_process_dra_ective_1_s6);
        a5 = CONS(a4,  Prolog.Nil );
        a6 = CONS( ATOM_Unknown$0020directive$003A , a5);
    // put_str_args([a(6)],y(2)),put_str(@('FUNCTOR_lines_1'),y(2),a(7))
        a7 =  S( FUNCTOR_lines_1 , a6);
 ;
        return //
 Op("$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec, VA(a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), //
 Op("dra_error", FILE_dra::PRED_dra_error_1_static_exec, VA(a7), cont)));
    }

    private final static Operation process_dra_ective_1_2(Prolog m) { 
    // process_dra_ective(answers(A,B)):-dra_w(print_required_answers(A,B))
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // process_dra_ective(answers(A,B)):-[dra_w(print_required_answers(A,B))]
        a1 = a1.dref();
            a2 = m.mkvar2();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_answers_2 , m.trail, a2, a3)){
                return m.fail();
            }
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_print_required_answers_2'),y(1),a(4))
        a4 =  S( FUNCTOR_print_required_answers_2 , a2, a3);
 ;
        return //
 Op("dra_w", FILE_dra::PRED_dra_w_1_static_exec, VA(a4), cont);
    }

    private final static Operation process_dra_ective_1_3(Prolog m) { 
    // process_dra_ective(A):-property_pred(B,C),A=..[B,D],predspecs_to_patterns(D,E),!,add_patterns(E,C)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // process_dra_ective(A):-['$get_level'(B),property_pred(C,D),'$univ'(A,[C,E]),predspecs_to_patterns(E,F),'$cut'(B),add_patterns(F,D)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = CONS(a5,  Prolog.Nil );
        a7 = CONS(a3, a6);
        a8 = m.mkvar1();
        return //
 Op("property_pred", FILE_dra::PRED_property_pred_2_static_exec, VA(a3, a4), //
 Op("$univ", FILE_dra::PRED_$univ_2_static_exec, VA(a1, a7), //
 Op("predspecs_to_patterns", FILE_dra::PRED_predspecs_to_patterns_2_static_exec, VA(a5, a8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), //
 Op("add_patterns", FILE_dra::PRED_add_patterns_2_static_exec, VA(a8, a4), cont)))));
    }
/** PREDICATE: add_patterns/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(add_patterns/2,non-(public))




    public static Operation PRED_add_patterns_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_dra::add_patterns_2_var, fail_0, fail_0, FILE_dra::add_patterns_2_1, fail_0, FILE_dra::add_patterns_2_2); 
    }

    private final static Operation add_patterns_2_var(Prolog m) { 
        m.jtry2(null, FILE_dra::add_patterns_2_var_1);
        return add_patterns_2_1(m);
    }

    private final static Operation add_patterns_2_var_1(Prolog m) { 
        m.trust(null);
        return add_patterns_2_2(m);
    }

    private final static Operation add_patterns_2_1(Prolog m) { 
    // add_patterns([],A):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_patterns([],A):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation add_patterns_2_2(Prolog m) { 
    // add_patterns([A|B],C):-add_pattern(A,C),!,add_patterns(B,C)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_patterns([A|B],C):-['$get_level'(D),add_pattern(A,C),'$cut'(D),add_patterns(B,C)]
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
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("add_pattern", FILE_dra::PRED_add_pattern_2_static_exec, VA(a3, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a5), //
 Op("add_patterns", FILE_dra::PRED_add_patterns_2_static_exec, VA(a4, a2), cont)));
    }
/** PREDICATE: add_pattern/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(add_pattern/2,non-(public))




    public static Operation PRED_add_pattern_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return add_pattern_2_top(m);
    }

    private final static Operation add_pattern_2_top(Prolog m) { 
        m.setB0();
        m.jtry2(null, FILE_dra::add_pattern_2_sub_1);
        return add_pattern_2_1(m);
    }

    private final static Operation add_pattern_2_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::add_pattern_2_sub_2);
        return add_pattern_2_2(m);
    }

    private final static Operation add_pattern_2_sub_2(Prolog m) { 
        m.trust(null);
        return add_pattern_2_3(m);
    }

    private final static Operation add_pattern_2_1(Prolog m) { 
    // add_pattern(A,-B):-!,C=..[B,A],dra_retract_all(C)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_pattern(A,-B):-['$neck_cut','$univ'(C,[B,A]),dra_retract_all('$dra':C)]
        a2 = a2.dref();
            a3 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002D_1 , m.trail, a3)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a4 = m.mkvar1();
        a5 = CONS(a1,  Prolog.Nil );
        a6 = CONS(a3, a5);
    // put_str_args([@('ATOM_$0024dra'),a(4)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a4);
 ;
        return //
 Op("$univ", FILE_dra::PRED_$univ_2_static_exec, VA(a4, a6), //
 Op("dra_retract_all", FILE_dra::PRED_dra_retract_all_1_static_exec, VA(a7), cont));
    }

    private final static Operation add_pattern_2_2(Prolog m) { 
    // add_pattern(A,+B):-!,add_pattern(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_pattern(A,+B):-['$neck_cut',add_pattern(A,B)]
        a2 = a2.dref();
            a3 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002B_1 , m.trail, a3)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a1;
        m.AREGS[1] = a3;
m.cont = cont;
        return add_pattern_2_top(m);
    }

    private final static Operation add_pattern_2_3(Prolog m) { 
    // add_pattern(A,B):-C=..[B,A],set_meta(A,B),dra_assertz_new(C),!
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_pattern(A,B):-['$get_level'(C),'$univ'(D,[B,A]),set_meta(A,B),dra_assertz_new(D),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        a5 = CONS(a1,  Prolog.Nil );
        a6 = CONS(a2, a5);
        return //
 Op("$univ", FILE_dra::PRED_$univ_2_static_exec, VA(a4, a6), //
 Op("set_meta", FILE_dra::PRED_set_meta_2_static_exec, VA(a1, a2), //
 Op("dra_assertz_new", FILE_dra::PRED_dra_assertz_new_1_static_exec, VA(a4), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont))));
    }
/** PREDICATE: (tnot)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main((tnot)/1,public)
        final static Functor FUNCTOR_tnot_1 = F("tnot",1);




    public static Operation PRED_tnot_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // tnot A:-dra_call_interp(tnot A)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // tnot A:-[dra_call_interp(tnot A)]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_tnot_1'),y(1),a(2))
        a2 =  S( FUNCTOR_tnot_1 , a1);
 ;
        return //
 Op("dra_call_interp", FILE_dra::PRED_dra_call_interp_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: dra_call_tabled/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_call_tabled/1,public)
        final static Functor ATOM_dra_call_tabled = SYM("dra_call_tabled");




    public static Operation PRED_dra_call_tabled_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_call_tabled(A):-dra_use_interp(dra_call_tabled,A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // dra_call_tabled(A):-[dra_use_interp(dra_call_tabled,A)]
        return //
 Op("dra_use_interp", FILE_dra::PRED_dra_use_interp_2_static_exec, VA( ATOM_dra_call_tabled , a1), cont);
    }
/** PREDICATE: dra_call_coind0/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_call_coind0/1,public)
        final static Functor ATOM_dra_interp = SYM("dra_interp");




    public static Operation PRED_dra_call_coind0_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_call_coind0(A):-dra_use_interp(dra_interp,A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // dra_call_coind0(A):-[dra_use_interp(dra_interp,A)]
        return //
 Op("dra_use_interp", FILE_dra::PRED_dra_use_interp_2_static_exec, VA( ATOM_dra_interp , a1), cont);
    }
/** PREDICATE: dra_call_coind1/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_call_coind1/1,public)




    public static Operation PRED_dra_call_coind1_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_call_coind1(A):-dra_use_interp(dra_interp,A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // dra_call_coind1(A):-[dra_use_interp(dra_interp,A)]
        return //
 Op("dra_use_interp", FILE_dra::PRED_dra_use_interp_2_static_exec, VA( ATOM_dra_interp , a1), cont);
    }
/** PREDICATE: dra_call_interp/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_call_interp/1,public)




    public static Operation PRED_dra_call_interp_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_call_interp(A):-dra_use_interp(dra_interp,A)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // dra_call_interp(A):-[dra_use_interp(dra_interp,A)]
        return //
 Op("dra_use_interp", FILE_dra::PRED_dra_use_interp_2_static_exec, VA( ATOM_dra_interp , a1), cont);
    }
/** PREDICATE: dra_use_interp/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_use_interp/2,non-(public))
        final static Functor FUNCTOR_b_getval_2 = F("b_getval",2);
        final static Functor FUNCTOR_or_2 = F(";",2);
        final static Functor FUNCTOR_$002D$003E_2 = F("->",2);
        final static Functor FUNCTOR_$003C_2 = F("<",2);
        final static Functor ATOM_init_dra_call = SYM("init_dra_call");
    private static final Compound L_dra_use_interp_2_s13 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra ,  ATOM_init_dra_call );
        final static Functor FUNCTOR_$003D_2 = F("=",2);
        final static Functor ATOM_exit_dra_call = SYM("exit_dra_call");
    private static final Compound L_dra_use_interp_2_s17 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra ,  ATOM_exit_dra_call );
        final static Functor ATOM_cont_dra_call = SYM("cont_dra_call");
    private static final Compound L_dra_use_interp_2_s20 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra ,  ATOM_cont_dra_call );
        final static Functor FUNCTOR_is_2 = F("is",2);
        final static Functor FUNCTOR_call_6 = F("call",6);
        final static Functor FUNCTOR_var_1 = F("var",1);
        final static Functor FUNCTOR_non_cutted_3 = F("non_cutted",3);
    private static final Compound L_dra_use_interp_2_s32 = S( FUNCTOR_$002C_2 ,  ATOM_$0021 ,  ATOM_fail );




    public static Operation PRED_dra_use_interp_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // dra_use_interp(A,B):-'$dra':dra_must(b_getval('$tabling_exec',dra_state(C,D,E,F))),setup_call_cleanup((E<0->'$dra':init_dra_call,G='$dra':exit_dra_call;G='$dra':cont_dra_call),(H is E+1,call(A,I,B,C,D,H),((var(I);trace,'$dra':non_cutted(B,I,F))->true;!,fail),G),G)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // dra_use_interp(A,B):-[dra_must(b_getval('$tabling_exec',dra_state(C,D,E,F))),setup_call_cleanup((E<0->'$dra':init_dra_call,G='$dra':exit_dra_call;G='$dra':cont_dra_call),(H is E+1,call(A,I,B,C,D,H),((var(I);trace,'$dra':non_cutted(B,I,F))->true;!,fail),G),G)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = m.mkvar1();
    // put_str_args([a(3),a(4),a(5),a(6)],y(1)),put_str(@('FUNCTOR_dra_state_4'),y(1),a(7))
        a7 =  S( FUNCTOR_dra_state_4 , a3, a4, a5, a6);
 ;
    // put_str_args([@('ATOM_$0024tabling_exec'),a(7)],y(2)),put_str(@('FUNCTOR_b_getval_2'),y(2),a(8))
        a8 =  S( FUNCTOR_b_getval_2 ,  ATOM_$0024tabling_exec , a7);
 ;
    // put_str_args([a(5),@(int_0)],y(3)),put_str(@('FUNCTOR_$003C_2'),y(3),a(9))
        a9 =  S( FUNCTOR_$003C_2 , a5,  int_0 );
 ;
        a10 = m.mkvar1();
    // put_str_args([a(10),s(17)],y(4)),put_str(@('FUNCTOR_$003D_2'),y(4),a(11))
        a11 =  S( FUNCTOR_$003D_2 , a10, L_dra_use_interp_2_s17);
 ;
    // put_str_args([s(13),a(11)],y(5)),put_str(@('FUNCTOR_$002C_2'),y(5),a(12))
        a12 =  S( FUNCTOR_$002C_2 , L_dra_use_interp_2_s13, a11);
 ;
    // put_str_args([a(9),a(12)],y(6)),put_str(@('FUNCTOR_$002D$003E_2'),y(6),a(13))
        a13 =  S( FUNCTOR_$002D$003E_2 , a9, a12);
 ;
    // put_str_args([a(10),s(20)],y(7)),put_str(@('FUNCTOR_$003D_2'),y(7),a(14))
        a14 =  S( FUNCTOR_$003D_2 , a10, L_dra_use_interp_2_s20);
 ;
    // put_str_args([a(13),a(14)],y(8)),put_str(@('FUNCTOR_or_2'),y(8),a(15))
        a15 =  S( FUNCTOR_or_2 , a13, a14);
 ;
        a16 = m.mkvar1();
    // put_str_args([a(5),@(int_1)],y(9)),put_str(@('FUNCTOR_$002B_2'),y(9),a(17))
        a17 =  S( FUNCTOR_$002B_2 , a5,  int_1 );
 ;
    // put_str_args([a(16),a(17)],y(10)),put_str(@('FUNCTOR_is_2'),y(10),a(18))
        a18 =  S( FUNCTOR_is_2 , a16, a17);
 ;
        a19 = m.mkvar1();
    // put_str_args([a(1),a(19),a(2),a(3),a(4),a(16)],y(11)),put_str(@('FUNCTOR_call_6'),y(11),a(20))
        a20 =  S( FUNCTOR_call_6 , a1, a19, a2, a3, a4, a16);
 ;
    // put_str_args([a(19)],y(12)),put_str(@('FUNCTOR_var_1'),y(12),a(21))
        a21 =  S( FUNCTOR_var_1 , a19);
 ;
    // put_str_args([a(2),a(19),a(6)],y(13)),put_str(@('FUNCTOR_non_cutted_3'),y(13),a(22))
        a22 =  S( FUNCTOR_non_cutted_3 , a2, a19, a6);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(22)],y(14)),put_str(@('FUNCTOR_module_colon_2'),y(14),a(23))
        a23 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a22);
 ;
    // put_str_args([@('ATOM_trace'),a(23)],y(15)),put_str(@('FUNCTOR_$002C_2'),y(15),a(24))
        a24 =  S( FUNCTOR_$002C_2 ,  ATOM_trace , a23);
 ;
    // put_str_args([a(21),a(24)],y(16)),put_str(@('FUNCTOR_or_2'),y(16),a(25))
        a25 =  S( FUNCTOR_or_2 , a21, a24);
 ;
    // put_str_args([a(25),@('Prolog.True')],y(17)),put_str(@('FUNCTOR_$002D$003E_2'),y(17),a(26))
        a26 =  S( FUNCTOR_$002D$003E_2 , a25,  Prolog.True );
 ;
    // put_str_args([a(26),s(32)],y(18)),put_str(@('FUNCTOR_or_2'),y(18),a(27))
        a27 =  S( FUNCTOR_or_2 , a26, L_dra_use_interp_2_s32);
 ;
    // put_str_args([a(27),a(10)],y(19)),put_str(@('FUNCTOR_$002C_2'),y(19),a(28))
        a28 =  S( FUNCTOR_$002C_2 , a27, a10);
 ;
    // put_str_args([a(20),a(28)],y(20)),put_str(@('FUNCTOR_$002C_2'),y(20),a(29))
        a29 =  S( FUNCTOR_$002C_2 , a20, a28);
 ;
    // put_str_args([a(18),a(29)],y(21)),put_str(@('FUNCTOR_$002C_2'),y(21),a(30))
        a30 =  S( FUNCTOR_$002C_2 , a18, a29);
 ;
        return //
 Op("dra_must", FILE_dra::PRED_dra_must_1_static_exec, VA(a8), //
 Op("setup_call_cleanup", FILE_dra::PRED_setup_call_cleanup_3_static_exec, VA(a15, a30, a10), cont));
    }
/** PREDICATE: init_dra_call/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(init_dra_call/0,public)




    public static Operation PRED_init_dra_call_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // init_dra_call:-reinitialise_pioneer,reinitialise_result,reinitialise_loop,reinitialise_looping_alternative,dra_setval_flag(unique_index,0),dra_getval_flag(number_of_answers,A),dra_setval_flag(old_table_size,A),dra_setval_flag(step_counter,0)
        m.setB0();
         Term a1;
        Operation p1, p2, p3, p4, p5, p6, p7;
    // init_dra_call:-[reinitialise_pioneer,reinitialise_result,reinitialise_loop,reinitialise_looping_alternative,dra_setval_flag(unique_index,0),dra_getval_flag(number_of_answers,A),dra_setval_flag(old_table_size,A),dra_setval_flag(step_counter,0)]
        a1 = m.mkvar1();
        return //
 Op("reinitialise_pioneer", FILE_dra::PRED_reinitialise_pioneer_0_static_exec, VA(), //
 Op("reinitialise_result", FILE_dra::PRED_reinitialise_result_0_static_exec, VA(), //
 Op("reinitialise_loop", FILE_dra::PRED_reinitialise_loop_0_static_exec, VA(), //
 Op("reinitialise_looping_alternative", FILE_dra::PRED_reinitialise_looping_alternative_0_static_exec, VA(), //
 Op("dra_setval_flag", FILE_dra::PRED_dra_setval_flag_2_static_exec, VA( ATOM_unique_index ,  int_0 ), //
 Op("dra_getval_flag", FILE_dra::PRED_dra_getval_flag_2_static_exec, VA( ATOM_number_of_answers , a1), //
 Op("dra_setval_flag", FILE_dra::PRED_dra_setval_flag_2_static_exec, VA( ATOM_old_table_size , a1), //
 Op("dra_setval_flag", FILE_dra::PRED_dra_setval_flag_2_static_exec, VA( ATOM_step_counter ,  int_0 ), cont))))))));
    }
/** PREDICATE: cont_dra_call/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(cont_dra_call/0,public)




    public static Operation PRED_cont_dra_call_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // cont_dra_call:-print_statistics,call(system:'$exit_dra')
        m.setB0();
         Term a1;
        Operation p1;
    // cont_dra_call:-[print_statistics,call(system:'$exit_dra')]
        a1 = Closure( //
 Op("$exit_dra", FILE_dra::PRED_$exit_dra_0_static_exec, VA(), null));
        return //
 Op("print_statistics", FILE_dra::PRED_print_statistics_0_static_exec, VA(), //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a1), cont));
    }
/** PREDICATE: exit_dra_call/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(exit_dra_call/0,public)




    public static Operation PRED_exit_dra_call_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // exit_dra_call:-print_statistics,dra_setval_flag(step_counter,0),dra_getval_flag(number_of_answers,A),dra_setval_flag(old_table_size,A),call(system:'$exit_dra')
        m.setB0();
         Term a1, a2;
        Operation p1, p2, p3, p4;
    // exit_dra_call:-[print_statistics,dra_setval_flag(step_counter,0),dra_getval_flag(number_of_answers,A),dra_setval_flag(old_table_size,A),call(system:'$exit_dra')]
        a1 = m.mkvar1();
        a2 = Closure( //
 Op("$exit_dra", FILE_dra::PRED_$exit_dra_0_static_exec, VA(), null));
        return //
 Op("print_statistics", FILE_dra::PRED_print_statistics_0_static_exec, VA(), //
 Op("dra_setval_flag", FILE_dra::PRED_dra_setval_flag_2_static_exec, VA( ATOM_step_counter ,  int_0 ), //
 Op("dra_getval_flag", FILE_dra::PRED_dra_getval_flag_2_static_exec, VA( ATOM_number_of_answers , a1), //
 Op("dra_setval_flag", FILE_dra::PRED_dra_setval_flag_2_static_exec, VA( ATOM_old_table_size , a1), //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a2), cont)))));
    }
/** PREDICATE: print_statistics/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(print_statistics/0,non-(public))
        final static Functor FUNCTOR_dra_getval_flag_2 = F("dra_getval_flag",2);
        final static Functor FUNCTOR_$002D_2 = F("-",2);
        final static Functor FUNCTOR_$003E_2 = F(">",2);
        final static Functor FUNCTOR_dra_wln_1 = F("dra_wln",1);
        final static Functor ATOM_step = SYM("step");
        final static Functor ATOM_growth = SYM("growth");
        final static Functor ATOM_tabled = SYM("tabled");




    public static Operation PRED_print_statistics_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // print_statistics:-quietly((dra_getval_flag(step_counter,A),dra_getval_flag(number_of_answers,B),dra_getval_flag(old_table_size,C),D is B-C,(D>0->dra_wln([step=A,growth=D,tabled=B]);true)))
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23;
    // print_statistics:-[quietly((dra_getval_flag(step_counter,A),dra_getval_flag(number_of_answers,B),dra_getval_flag(old_table_size,C),D is B-C,(D>0->dra_wln([step=A,growth=D,tabled=B]);true)))]
        a1 = m.mkvar1();
    // put_str_args([@('ATOM_step_counter'),a(1)],y(1)),put_str(@('FUNCTOR_dra_getval_flag_2'),y(1),a(2))
        a2 =  S( FUNCTOR_dra_getval_flag_2 ,  ATOM_step_counter , a1);
 ;
        a3 = m.mkvar1();
    // put_str_args([@('ATOM_number_of_answers'),a(3)],y(2)),put_str(@('FUNCTOR_dra_getval_flag_2'),y(2),a(4))
        a4 =  S( FUNCTOR_dra_getval_flag_2 ,  ATOM_number_of_answers , a3);
 ;
        a5 = m.mkvar1();
    // put_str_args([@('ATOM_old_table_size'),a(5)],y(3)),put_str(@('FUNCTOR_dra_getval_flag_2'),y(3),a(6))
        a6 =  S( FUNCTOR_dra_getval_flag_2 ,  ATOM_old_table_size , a5);
 ;
        a7 = m.mkvar1();
    // put_str_args([a(3),a(5)],y(4)),put_str(@('FUNCTOR_$002D_2'),y(4),a(8))
        a8 =  S( FUNCTOR_$002D_2 , a3, a5);
 ;
    // put_str_args([a(7),a(8)],y(5)),put_str(@('FUNCTOR_is_2'),y(5),a(9))
        a9 =  S( FUNCTOR_is_2 , a7, a8);
 ;
    // put_str_args([a(7),@(int_0)],y(6)),put_str(@('FUNCTOR_$003E_2'),y(6),a(10))
        a10 =  S( FUNCTOR_$003E_2 , a7,  int_0 );
 ;
    // put_str_args([@('ATOM_step'),a(1)],y(7)),put_str(@('FUNCTOR_$003D_2'),y(7),a(11))
        a11 =  S( FUNCTOR_$003D_2 ,  ATOM_step , a1);
 ;
    // put_str_args([@('ATOM_growth'),a(7)],y(8)),put_str(@('FUNCTOR_$003D_2'),y(8),a(12))
        a12 =  S( FUNCTOR_$003D_2 ,  ATOM_growth , a7);
 ;
    // put_str_args([@('ATOM_tabled'),a(3)],y(9)),put_str(@('FUNCTOR_$003D_2'),y(9),a(13))
        a13 =  S( FUNCTOR_$003D_2 ,  ATOM_tabled , a3);
 ;
        a14 = CONS(a13,  Prolog.Nil );
        a15 = CONS(a12, a14);
        a16 = CONS(a11, a15);
    // put_str_args([a(16)],y(10)),put_str(@('FUNCTOR_dra_wln_1'),y(10),a(17))
        a17 =  S( FUNCTOR_dra_wln_1 , a16);
 ;
    // put_str_args([a(10),a(17)],y(11)),put_str(@('FUNCTOR_$002D$003E_2'),y(11),a(18))
        a18 =  S( FUNCTOR_$002D$003E_2 , a10, a17);
 ;
    // put_str_args([a(18),@('Prolog.True')],y(12)),put_str(@('FUNCTOR_or_2'),y(12),a(19))
        a19 =  S( FUNCTOR_or_2 , a18,  Prolog.True );
 ;
    // put_str_args([a(9),a(19)],y(13)),put_str(@('FUNCTOR_$002C_2'),y(13),a(20))
        a20 =  S( FUNCTOR_$002C_2 , a9, a19);
 ;
    // put_str_args([a(6),a(20)],y(14)),put_str(@('FUNCTOR_$002C_2'),y(14),a(21))
        a21 =  S( FUNCTOR_$002C_2 , a6, a20);
 ;
    // put_str_args([a(4),a(21)],y(15)),put_str(@('FUNCTOR_$002C_2'),y(15),a(22))
        a22 =  S( FUNCTOR_$002C_2 , a4, a21);
 ;
    // put_str_args([a(2),a(22)],y(16)),put_str(@('FUNCTOR_$002C_2'),y(16),a(23))
        a23 =  S( FUNCTOR_$002C_2 , a2, a22);
 ;
        return //
 Op("quietly", FILE_dra::PRED_quietly_1_static_exec, VA(a23), cont);
    }
/** PREDICATE: $dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/3,non-(public))




    public static Operation PRED_$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_dra::$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1);
        return $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(m);
    }

    private final static Operation $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(m);
    }

    private final static Operation $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(Prolog m) { 
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-var(C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-[var(C)]
        //START inline expansion of var(a(3))
        a3 = a3.dref();
        if (! (a3 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(Prolog m) { 
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-non_cutted(B,C,A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-[non_cutted(B,C,A)]
        return //
 Op("non_cutted", FILE_dra::PRED_non_cutted_3_static_exec, VA(a2, a3, a1), cont);
    }
/** PREDICATE: $dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/3,non-(public))




    public static Operation PRED_$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_dra::$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1);
        return $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(m);
    }

    private final static Operation $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(m);
    }

    private final static Operation $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(Prolog m) { 
    // '$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-'$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C),!,true
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$get_level'(D),'$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C),'$cut'(D)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec, VA(a1, a2, a3), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a4), cont));
    }

    private final static Operation $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(Prolog m) { 
    // '$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$neck_cut',fail]
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: dra_interp/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_interp/5,non-(public))
        final static Functor FUNCTOR_nonvar_1 = F("nonvar",1);
        final static Functor ATOM_normal = SYM("normal");
        final static Functor ATOM_$003F = SYM("?");
        final static Functor FUNCTOR_once_1 = F("once",1);
        final static Functor FUNCTOR_findall_3 = F("findall",3);
        final static Functor FUNCTOR_$0021_1 = F("!",1);

    // private final Term arg5;




    public static Operation PRED_dra_interp_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return dra_interp_5_top(m);
    }

    private final static Operation dra_interp_5_top(Prolog m) { 
        m.setB0();
        m.jtry5(null, FILE_dra::dra_interp_5_sub_1);
        return dra_interp_5_1(m);
    }

    private final static Operation dra_interp_5_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_2);
        return dra_interp_5_2(m);
    }

    private final static Operation dra_interp_5_sub_2(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_3);
        return dra_interp_5_3(m);
    }

    private final static Operation dra_interp_5_sub_3(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_4);
        return dra_interp_5_4(m);
    }

    private final static Operation dra_interp_5_sub_4(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_5);
        return dra_interp_5_5(m);
    }

    private final static Operation dra_interp_5_sub_5(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_6);
        return dra_interp_5_6(m);
    }

    private final static Operation dra_interp_5_sub_6(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_7);
        return dra_interp_5_7(m);
    }

    private final static Operation dra_interp_5_sub_7(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_8);
        return dra_interp_5_8(m);
    }

    private final static Operation dra_interp_5_sub_8(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_9);
        return dra_interp_5_9(m);
    }

    private final static Operation dra_interp_5_sub_9(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_10);
        return dra_interp_5_10(m);
    }

    private final static Operation dra_interp_5_sub_10(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_11);
        return dra_interp_5_11(m);
    }

    private final static Operation dra_interp_5_sub_11(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_12);
        return dra_interp_5_12(m);
    }

    private final static Operation dra_interp_5_sub_12(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_13);
        return dra_interp_5_13(m);
    }

    private final static Operation dra_interp_5_sub_13(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_14);
        return dra_interp_5_14(m);
    }

    private final static Operation dra_interp_5_sub_14(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_15);
        return dra_interp_5_15(m);
    }

    private final static Operation dra_interp_5_sub_15(Prolog m) { 
        m.retry(null, FILE_dra::dra_interp_5_sub_16);
        return dra_interp_5_16(m);
    }

    private final static Operation dra_interp_5_sub_16(Prolog m) { 
        m.trust(null);
        return dra_interp_5_17(m);
    }

    private final static Operation dra_interp_5_1(Prolog m) { 
    // dra_interp(A,B,C,D,E):-assertion(nonvar(B)),is_tabled(B),!,dra_call_tabled(F,B,C,D,E),'$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,B,C,D,E):-['$get_level'(F),assertion(nonvar(B)),call('$dra':is_tabled(B)),'$cut'(F),dra_call_tabled(G,B,C,D,E),'$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,G)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_nonvar_1'),y(1),a(7))
        a7 =  S( FUNCTOR_nonvar_1 , a2);
 ;
    // put_str_args([a(2)],y(2)),put_str(@('FUNCTOR_is_tabled_1'),y(2),a(8))
        a8 =  S( FUNCTOR_is_tabled_1 , a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(8)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a8);
 ;
        a10 = m.mkvar1();
        return //
 Op("assertion", FILE_dra::PRED_assertion_1_static_exec, VA(a7), //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a9), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a6), //
 Op("dra_call_tabled", FILE_dra::PRED_dra_call_tabled_5_static_exec, VA(a10, a2, a3, a4, a5), //
 Op("$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec, VA(a1, a2, a10), cont)))));
    }

    private final static Operation dra_interp_5_2(Prolog m) { 
    // dra_interp(A,true,B,C,D):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,true,B,C,D):-['$neck_cut']
        if (!  Prolog.True .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation dra_interp_5_3(Prolog m) { 
    // dra_interp(A,\+B,C,D,E):-!,F is E+1,trace_entry(normal,\+B,?,E),'$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,\+B,C,D,E):-['$neck_cut',F is E+1,trace_entry(normal,\+B,?,E),'$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F)]
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$005C$002B_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a7 = m.mkvar1();
    // put_str_args([a(5),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(8))
        a8 =  S( FUNCTOR_$002B_2 , a5,  int_1 );
 ;
        //START inline expansion of a(7)is a(8)
        if (! a7.unify(Arithmetic.evaluate(a8), m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(6)],y(2)),put_str(@('FUNCTOR_$005C$002B_1'),y(2),a(9))
        a9 =  S( FUNCTOR_$005C$002B_1 , a6);
 ;
        return //
 Op("trace_entry", FILE_dra::PRED_trace_entry_4_static_exec, VA( ATOM_normal , a9,  ATOM_$003F , a5), //
 Op("$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec, VA(a1, a6, a3, a4, a5, a7), cont));
    }

    private final static Operation dra_interp_5_4(Prolog m) { 
    // dra_interp(A,tnot B,C,D,E):-!,findall(A-B,dra_interp(A,B,C,D,E),F),F=[]
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,tnot B,C,D,E):-['$neck_cut',findall(A-B,'$dra':dra_interp(A,B,C,D,E),F),'$unify'(F,[])]
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_tnot_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(1),a(6)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(7))
        a7 =  S( FUNCTOR_$002D_2 , a1, a6);
 ;
        a8 = Closure( //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a6, a3, a4, a5), null));
        a9 = m.mkvar1();
        return //
 Op("findall", FILE_dra::PRED_findall_3_static_exec, VA(a7, a8, a9), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a9,  Prolog.Nil ), cont));
    }

    private final static Operation dra_interp_5_5(Prolog m) { 
    // dra_interp(A,once(B),C,D,E):-!,F is E+1,trace_entry(normal,once(B),?,E),'$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,once(B),C,D,E):-['$neck_cut',F is E+1,trace_entry(normal,once(B),?,E),'$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F)]
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_once_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a7 = m.mkvar1();
    // put_str_args([a(5),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(8))
        a8 =  S( FUNCTOR_$002B_2 , a5,  int_1 );
 ;
        //START inline expansion of a(7)is a(8)
        if (! a7.unify(Arithmetic.evaluate(a8), m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(6)],y(2)),put_str(@('FUNCTOR_once_1'),y(2),a(9))
        a9 =  S( FUNCTOR_once_1 , a6);
 ;
        return //
 Op("trace_entry", FILE_dra::PRED_trace_entry_4_static_exec, VA( ATOM_normal , a9,  ATOM_$003F , a5), //
 Op("$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec, VA(a1, a6, a3, a4, a5, a7), cont));
    }

    private final static Operation dra_interp_5_6(Prolog m) { 
    // dra_interp(A,(B->C;D),E,F,G):-!,'$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,(B->C;D),E,F,G):-['$neck_cut','$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G)]
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_or_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a8, a9)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_static_exec, VA(a1, a8, a9, a7, a3, a4, a5), cont);
    }

    private final static Operation dra_interp_5_7(Prolog m) { 
    // dra_interp(A,(B->C),D,E,F):-!,'$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,(B->C),D,E,F):-['$neck_cut','$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F)]
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002D$003E_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec, VA(a1, a6, a7, a3, a4, a5), cont);
    }

    private final static Operation dra_interp_5_8(Prolog m) { 
    // dra_interp(A,(B;C),D,E,F):-!,'$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,(B;C),D,E,F):-['$neck_cut','$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F)]
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_or_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec, VA(a1, a6, a7, a3, a4, a5), cont);
    }

    private final static Operation dra_interp_5_9(Prolog m) { 
    // dra_interp(A,(B,C),D,E,F):-!,dra_interp(A,B,D,E,F),dra_interp(A,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,(B,C),D,E,F):-['$neck_cut',dra_interp(A,B,D,E,F),dra_interp(A,C,D,E,F)]
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002C_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a7, a3, a4, a5), cont);
        m.AREGS[0] = a1;
        m.AREGS[1] = a6;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.cont = p1;
        return dra_interp_5_top(m);
    }

    private final static Operation dra_interp_5_10(Prolog m) { 
    // dra_interp(A,call(B),C,D,E):-!,dra_interp(A,B,C,D,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,call(B),C,D,E):-['$neck_cut',dra_interp(A,B,C,D,E)]
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_call_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a1;
        m.AREGS[1] = a6;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
m.cont = cont;
        return dra_interp_5_top(m);
    }

    private final static Operation dra_interp_5_11(Prolog m) { 
    // dra_interp(A,findall(B,C,D),E,F,G):-!,H is G+1,findall(B,dra_interp(A,C,E,F,H),D)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,findall(B,C,D),E,F,G):-['$neck_cut',H is G+1,findall(B,'$dra':dra_interp(A,C,E,F,H),D)]
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_findall_3 , m.trail, a6, a7, a8)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a9 = m.mkvar1();
    // put_str_args([a(5),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$002B_2 , a5,  int_1 );
 ;
        //START inline expansion of a(9)is a(10)
        if (! a9.unify(Arithmetic.evaluate(a10), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a11 = Closure( //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a7, a3, a4, a9), null));
        return //
 Op("findall", FILE_dra::PRED_findall_3_static_exec, VA(a6, a11, a8), cont);
    }

    private final static Operation dra_interp_5_12(Prolog m) { 
    // dra_interp(A,!,B,C,D):-!,'$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,!,B,C,D):-['$neck_cut','$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A)]
        if (!  ATOM_$0021 .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec, VA(a1), cont);
    }

    private final static Operation dra_interp_5_13(Prolog m) { 
    // dra_interp(A,!(B),C,D,E):-!,'$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,!(B),C,D,E):-['$neck_cut','$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B)]
        a2 = a2.dref();
            a6 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$0021_1 , m.trail, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a6), cont);
    }

    private final static Operation dra_interp_5_14(Prolog m) { 
    // dra_interp(A,B,C,D,E):-fail,is_coinductive1(B),!,dra_incval_flag(step_counter),trace_entry(coinductive0,B,?,E),'$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,B,C,D,E):-['$get_level'(F),fail,call('$dra':is_coinductive1(B)),'$cut'(F),dra_incval_flag(step_counter),trace_entry(coinductive0,B,?,E),'$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,G,H,I)]
        //START inline expansion of $get_level(void)
        if (! m.mkvar3().unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation dra_interp_5_15(Prolog m) { 
    // dra_interp(A,B,C,D,E):-!,b_setval('$tabling_exec',dra_state(C,D,E,F)),call(B),'$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,B,C,D,E):-['$neck_cut',b_setval('$tabling_exec',dra_state(C,D,E,F)),call('$dra':B),'$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,F)]
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a6 = m.mkvar1();
    // put_str_args([a(3),a(4),a(5),a(6)],y(1)),put_str(@('FUNCTOR_dra_state_4'),y(1),a(7))
        a7 =  S( FUNCTOR_dra_state_4 , a3, a4, a5, a6);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(8))
        a8 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a2);
 ;
        return //
 Op("b_setval", FILE_dra::PRED_b_setval_2_static_exec, VA( ATOM_$0024tabling_exec , a7), //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a8), //
 Op("$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec, VA(a1, a2, a6), cont)));
    }

    private final static Operation dra_interp_5_16(Prolog m) { 
    // dra_interp(A,B,C,D,E):-fail,is_cut_ok(B),set_meta(B,is_tabled),!,dra_call_tabled(F,B,C,D,E),'$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,F)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,B,C,D,E):-['$get_level'(F),fail,is_cut_ok(B),set_meta(B,is_tabled),'$cut'(F),dra_call_tabled(G,B,C,D,E),'$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,G)]
        //START inline expansion of $get_level(void)
        if (! m.mkvar3().unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation dra_interp_5_17(Prolog m) { 
    // dra_interp(A,B,C,D,E):-trace_entry(normal,B,?,E),'$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_interp(A,B,C,D,E):-[trace_entry(normal,B,?,E),'$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G)]
        return //
 Op("trace_entry", FILE_dra::PRED_trace_entry_4_static_exec, VA( ATOM_normal , a2,  ATOM_$003F , a5), //
 Op("$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_static_exec, VA(a1, a2, a3, a4, a5, m.DONT_CARE2(), m.DONT_CARE2()), cont));
    }
/** PREDICATE: $dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_dra::$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_sub_1);
        return $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_1(m);
    }

    private final static Operation $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_2(m);
    }

    private final static Operation $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_1(Prolog m) { 
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-dra_interp(A,B,C,D,E),!,fail
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-['$get_level'(F),dra_interp(A,B,C,D,E),'$cut'(F),fail]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a2, a3, a4, a5), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a6), fail_0));
    }

    private final static Operation $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_2(Prolog m) { 
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-[]
        return cont;
    }
/** PREDICATE: $dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/6,non-(public))

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_dra::$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1);
        return $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(m);
    }

    private final static Operation $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(m);
    }

    private final static Operation $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(Prolog m) { 
    // '$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-'$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,F),trace_success(normal,\+B,?,E)
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
    // '$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-['$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,F),trace_success(normal,\+B,?,E)]
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_$005C$002B_1'),y(1),a(7))
        a7 =  S( FUNCTOR_$005C$002B_1 , a2);
 ;
        return //
 Op("$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_static_exec, VA(a1, a2, a3, a4, a6), //
 Op("trace_success", FILE_dra::PRED_trace_success_4_static_exec, VA( ATOM_normal , a7,  ATOM_$003F , a5), cont));
    }

    private final static Operation $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(Prolog m) { 
    // '$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-trace_failure(normal,\+B,?,E),fail
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
    // '$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[trace_failure(normal,\+B,?,E),fail]
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_$005C$002B_1'),y(1),a(7))
        a7 =  S( FUNCTOR_$005C$002B_1 , a2);
 ;
        return //
 Op("trace_failure", FILE_dra::PRED_trace_failure_4_static_exec, VA( ATOM_normal , a7,  ATOM_$003F , a5), fail_0);
    }
/** PREDICATE: $dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/6,non-(public))

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_dra::$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1);
        return $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(m);
    }

    private final static Operation $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(m);
    }

    private final static Operation $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(Prolog m) { 
    // '$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-once(dra_interp(A,B,C,D,F)),trace_success(normal,once(B),?,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[once('$dra':dra_interp(A,B,C,D,F)),trace_success(normal,once(B),?,E)]
        a7 = Closure( //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a2, a3, a4, a6), null));
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_once_1'),y(1),a(8))
        a8 =  S( FUNCTOR_once_1 , a2);
 ;
        return //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a7), //
 Op("trace_success", FILE_dra::PRED_trace_success_4_static_exec, VA( ATOM_normal , a8,  ATOM_$003F , a5), cont));
    }

    private final static Operation $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(Prolog m) { 
    // '$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-trace_failure(normal,once(B),?,E),fail
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
    // '$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[trace_failure(normal,once(B),?,E),fail]
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_once_1'),y(1),a(7))
        a7 =  S( FUNCTOR_once_1 , a2);
 ;
        return //
 Op("trace_failure", FILE_dra::PRED_trace_failure_4_static_exec, VA( ATOM_normal , a7,  ATOM_$003F , a5), fail_0);
    }
/** PREDICATE: $dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/7,non-(public))

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_dra::$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_sub_1);
        return $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_1(m);
    }

    private final static Operation $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_2(m);
    }

    private final static Operation $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_1(Prolog m) { 
    // '$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-dra_interp(A,B,E,F,G),!,dra_interp(A,C,E,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-['$get_level'(H),dra_interp(A,B,E,F,G),'$cut'(H),dra_interp(A,C,E,F,G)]
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a2, a5, a6, a7), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a8), //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a3, a5, a6, a7), cont)));
    }

    private final static Operation $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_2(Prolog m) { 
    // '$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-dra_interp(A,D,E,F,G)
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
    // '$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-[dra_interp(A,D,E,F,G)]
        return //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a4, a5, a6, a7), cont);
    }
/** PREDICATE: $dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/6,non-(public))

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_dra::$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1);
        return $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(m);
    }

    private final static Operation $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(m);
    }

    private final static Operation $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(Prolog m) { 
    // '$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-dra_interp(A,B,D,E,F),!,dra_interp(A,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-['$get_level'(G),dra_interp(A,B,D,E,F),'$cut'(G),dra_interp(A,C,D,E,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a2, a4, a5, a6), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a7), //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a3, a4, a5, a6), cont)));
    }

    private final static Operation $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(Prolog m) { 
    // '$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-fail
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/6,non-(public))

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_dra::$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1);
        return $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(m);
    }

    private final static Operation $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(m);
    }

    private final static Operation $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(Prolog m) { 
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-dra_interp(A,B,D,E,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[dra_interp(A,B,D,E,F)]
        return //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a2, a4, a5, a6), cont);
    }

    private final static Operation $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(Prolog m) { 
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-dra_interp(A,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[dra_interp(A,C,D,E,F)]
        return //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a3, a4, a5, a6), cont);
    }
/** PREDICATE: $dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/1,non-(public))
        final static Functor ATOM_cut = SYM("cut");




    public static Operation PRED_$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1);
        return $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(m);
    }

    private final static Operation $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(m);
    }

    private final static Operation $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(Prolog m) { 
    // '$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-var(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-[var(A)]
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(Prolog m) { 
    // '$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-A=cut
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-['$unify'(A,cut)]
        //START inline expansion of $unify(a(1),@(ATOM_cut))
        if (! a1.unify(ATOM_cut, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))
        final static Functor FUNCTOR_cut_to_1 = F("cut_to",1);




    public static Operation PRED_$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-var(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[var(A)]
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-A=cut_to(B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$unify'(A,cut_to(B))]
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_cut_to_1'),y(1),a(3))
        a3 =  S( FUNCTOR_cut_to_1 , a2);
 ;
        //START inline expansion of $unify(a(1),a(3))
        if (! a1.unify(a3, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/1,non-(public))




    public static Operation PRED_$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1);
        return $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(m);
    }

    private final static Operation $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(m);
    }

    private final static Operation $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(Prolog m) { 
    // '$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-is_coinductive0(A),!,fail
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-['$get_level'(B),call('$dra':is_coinductive0(A)),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_is_coinductive0_1'),y(1),a(3))
        a3 =  S( FUNCTOR_is_coinductive0_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a3);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a4), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(Prolog m) { 
    // '$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))
        final static Functor ATOM_coinductive$0020$0028hypothesis$0029 = SYM("coinductive (hypothesis)");
        final static Functor ATOM_coinductive = SYM("coinductive");




    public static Operation PRED_$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-trace_success('coinductive (hypothesis)',A,?,B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[trace_success('coinductive (hypothesis)',A,?,B)]
        return //
 Op("trace_success", FILE_dra::PRED_trace_success_4_static_exec, VA( ATOM_coinductive$0020$0028hypothesis$0029 , a1,  ATOM_$003F , a2), cont);
    }

    private final static Operation $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-trace_failure(coinductive,A,?,B),fail
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[trace_failure(coinductive,A,?,B),fail]
        return //
 Op("trace_failure", FILE_dra::PRED_trace_failure_4_static_exec, VA( ATOM_coinductive , a1,  ATOM_$003F , a2), fail_0);
    }
/** PREDICATE: $dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/8,non-(public))
        final static Functor ATOM_coinductive0$0028hypothesis$0029 = SYM("coinductive0(hypothesis)");
        final static Functor ATOM_coinductive$0020$0028clause$0029 = SYM("coinductive (clause)");

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry8(null, FILE_dra::$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_sub_1);
        return $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_1(m);
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_sub_2);
        return $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_2(m);
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_sub_2(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_sub_3);
        return $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_3(m);
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_sub_3(Prolog m) { 
        m.trust(null);
        return $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_4(m);
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_1(Prolog m) { 
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H):-('$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B),unify_with_coinductive_ancestor(B,D)),!,'$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H):-['$get_level'(I),'$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B),unify_with_coinductive_ancestor(B,D),'$cut'(I),'$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,E)]
        a9 = m.mkvar1();
        //START inline expansion of $get_level(a(9))
        if (! a9.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec, VA(a2), //
 Op("unify_with_coinductive_ancestor", FILE_dra::PRED_unify_with_coinductive_ancestor_2_static_exec, VA(a2, a4), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a9), //
 Op("$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a2, a5), cont))));
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_2(Prolog m) { 
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H):-is_coinductive0(B),unify_with_coinductive_ancestor(B,D),trace_success('coinductive0(hypothesis)',B,?,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
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
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H):-[call('$dra':is_coinductive0(B)),unify_with_coinductive_ancestor(B,D),trace_success('coinductive0(hypothesis)',B,?,E)]
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_is_coinductive0_1'),y(1),a(9))
        a9 =  S( FUNCTOR_is_coinductive0_1 , a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(9)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(10))
        a10 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a9);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a10), //
 Op("unify_with_coinductive_ancestor", FILE_dra::PRED_unify_with_coinductive_ancestor_2_static_exec, VA(a2, a4), //
 Op("trace_success", FILE_dra::PRED_trace_success_4_static_exec, VA( ATOM_coinductive0$0028hypothesis$0029 , a2,  ATOM_$003F , a5), cont)));
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_3(Prolog m) { 
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H):-F is E+1,use_clause(B,G),push_is_coinductive(B,D,H),dra_interp(A,G,C,H,F),trace_success('coinductive (clause)',B,?,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H):-[F is E+1,use_clause(B,G),push_is_coinductive(B,D,H),dra_interp(A,G,C,H,F),trace_success('coinductive (clause)',B,?,E)]
    // put_str_args([a(5),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(9))
        a9 =  S( FUNCTOR_$002B_2 , a5,  int_1 );
 ;
        //START inline expansion of a(6)is a(9)
        if (! a6.unify(Arithmetic.evaluate(a9), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("use_clause", FILE_dra::PRED_use_clause_2_static_exec, VA(a2, a7), //
 Op("push_is_coinductive", FILE_dra::PRED_push_is_coinductive_3_static_exec, VA(a2, a4, a8), //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a7, a3, a8, a6), //
 Op("trace_success", FILE_dra::PRED_trace_success_4_static_exec, VA( ATOM_coinductive$0020$0028clause$0029 , a2,  ATOM_$003F , a5), cont))));
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_4(Prolog m) { 
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H):-trace_failure(coinductive,B,?,E),fail
         Term a1, a2, a3, a4, a5, a6, a7, a8;
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
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H):-[trace_failure(coinductive,B,?,E),fail]
        return //
 Op("trace_failure", FILE_dra::PRED_trace_failure_4_static_exec, VA( ATOM_coinductive , a2,  ATOM_$003F , a5), fail_0);
    }
/** PREDICATE: $dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/3,non-(public))




    public static Operation PRED_$dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_dra::$dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1);
        return $dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(m);
    }

    private final static Operation $dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(m);
    }

    private final static Operation $dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(Prolog m) { 
    // '$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-var(C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-[var(C)]
        //START inline expansion of var(a(3))
        a3 = a3.dref();
        if (! (a3 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(Prolog m) { 
    // '$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-trace,non_cutted(B,C,A)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-[trace,non_cutted(B,C,A)]
        return //
 Op("trace", FILE_dra::PRED_trace_0_static_exec, VA(), //
 Op("non_cutted", FILE_dra::PRED_non_cutted_3_static_exec, VA(a2, a3, a1), cont));
    }
/** PREDICATE: $dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/3,non-(public))




    public static Operation PRED_$dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_dra::$dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1);
        return $dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(m);
    }

    private final static Operation $dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(m);
    }

    private final static Operation $dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(Prolog m) { 
    // '$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-'$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C),!,true
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$get_level'(D),'$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C),'$cut'(D)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec, VA(a1, a2, a3), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a4), cont));
    }

    private final static Operation $dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(Prolog m) { 
    // '$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$neck_cut',fail]
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/3,non-(public))




    public static Operation PRED_$dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_dra::$dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1);
        return $dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(m);
    }

    private final static Operation $dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(m);
    }

    private final static Operation $dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(Prolog m) { 
    // '$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-var(C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-[var(C)]
        //START inline expansion of var(a(3))
        a3 = a3.dref();
        if (! (a3 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(Prolog m) { 
    // '$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-non_cutted(B,C,A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-[non_cutted(B,C,A)]
        return //
 Op("non_cutted", FILE_dra::PRED_non_cutted_3_static_exec, VA(a2, a3, a1), cont);
    }
/** PREDICATE: $dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/3,non-(public))




    public static Operation PRED_$dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_dra::$dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1);
        return $dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(m);
    }

    private final static Operation $dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(m);
    }

    private final static Operation $dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(Prolog m) { 
    // '$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-'$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C),!,true
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$get_level'(D),'$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C),'$cut'(D)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec, VA(a1, a2, a3), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a4), cont));
    }

    private final static Operation $dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(Prolog m) { 
    // '$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$neck_cut',fail]
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/7,non-(public))

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_$dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_dra::$dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_sub_1);
        return $dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_1(m);
    }

    private final static Operation $dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_2(m);
    }

    private final static Operation $dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_1(Prolog m) { 
    // '$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-F is E+1,use_clause(B,G),dra_interp(A,G,C,D,F),trace_success(normal,B,?,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-[F is E+1,use_clause(B,G),dra_interp(A,G,C,D,F),trace_success(normal,B,?,E)]
    // put_str_args([a(5),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(8))
        a8 =  S( FUNCTOR_$002B_2 , a5,  int_1 );
 ;
        //START inline expansion of a(6)is a(8)
        if (! a6.unify(Arithmetic.evaluate(a8), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("use_clause", FILE_dra::PRED_use_clause_2_static_exec, VA(a2, a7), //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a7, a3, a4, a6), //
 Op("trace_success", FILE_dra::PRED_trace_success_4_static_exec, VA( ATOM_normal , a2,  ATOM_$003F , a5), cont)));
    }

    private final static Operation $dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_2(Prolog m) { 
    // '$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-trace_failure(normal,B,?,E),fail
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-[trace_failure(normal,B,?,E),fail]
        return //
 Op("trace_failure", FILE_dra::PRED_trace_failure_4_static_exec, VA( ATOM_normal , a2,  ATOM_$003F , a5), fail_0);
    }
/** PREDICATE: non_cutted/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(non_cutted/3,non-(public))




    public static Operation PRED_non_cutted_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_dra::non_cutted_3_sub_1);
        return non_cutted_3_1(m);
    }

    private final static Operation non_cutted_3_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::non_cutted_3_sub_2);
        return non_cutted_3_2(m);
    }

    private final static Operation non_cutted_3_sub_2(Prolog m) { 
        m.trust(null);
        return non_cutted_3_3(m);
    }

    private final static Operation non_cutted_3_1(Prolog m) { 
    // non_cutted(A,cut,B):-!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // non_cutted(A,cut,B):-['$neck_cut',fail]
        if (!  ATOM_cut .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }

    private final static Operation non_cutted_3_2(Prolog m) { 
    // non_cutted(A,cut_to(B),C):-dra_must(nonvar(B)),A=B,!,fail
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // non_cutted(A,cut_to(B),C):-['$get_level'(D),dra_must(nonvar(B)),'$unify'(A,B),'$cut'(D),fail]
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_cut_to_1 , m.trail, a4)){
                return m.fail();
            }
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(4)],y(1)),put_str(@('FUNCTOR_nonvar_1'),y(1),a(6))
        a6 =  S( FUNCTOR_nonvar_1 , a4);
 ;
        return //
 Op("dra_must", FILE_dra::PRED_dra_must_1_static_exec, VA(a6), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a1, a4), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a5), fail_0)));
    }

    private final static Operation non_cutted_3_3(Prolog m) { 
    // non_cutted(A,B,B):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // non_cutted(A,B,B):-[]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))
        final static Functor ATOM_completed = SYM("completed");




    public static Operation PRED_$dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-get_all_tabled_answers(A,?,completed,B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[get_all_tabled_answers(A,?,completed,B)]
        return //
 Op("get_all_tabled_answers", FILE_dra::PRED_get_all_tabled_answers_4_static_exec, VA(a1,  ATOM_$003F ,  ATOM_completed , a2), cont);
    }

    private final static Operation $dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-trace_failure(completed,A,?,B),fail
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[trace_failure(completed,A,?,B),fail]
        return //
 Op("trace_failure", FILE_dra::PRED_trace_failure_4_static_exec, VA( ATOM_completed , a1,  ATOM_$003F , a2), fail_0);
    }
/** PREDICATE: dra_call_tabled/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(dra_call_tabled/5,non-(public))
        final static Functor ATOM_variant = SYM("variant");
        final static Functor ATOM_pioneer = SYM("pioneer");

    // private final Term arg5;




    public static Operation PRED_dra_call_tabled_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_dra::dra_call_tabled_5_sub_1);
        return dra_call_tabled_5_1(m);
    }

    private final static Operation dra_call_tabled_5_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::dra_call_tabled_5_sub_2);
        return dra_call_tabled_5_2(m);
    }

    private final static Operation dra_call_tabled_5_sub_2(Prolog m) { 
        m.trust(null);
        return dra_call_tabled_5_3(m);
    }

    private final static Operation dra_call_tabled_5_1(Prolog m) { 
    // dra_call_tabled(A,B,C,D,E):-is_completed(B),!,dra_incval_flag(step_counter),trace_entry(completed,B,?,E),'$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_call_tabled(A,B,C,D,E):-['$get_level'(F),is_completed(B),'$cut'(F),dra_incval_flag(step_counter),trace_entry(completed,B,?,E),'$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,E)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_completed", FILE_dra::PRED_is_completed_1_static_exec, VA(a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a6), //
 Op("dra_incval_flag", FILE_dra::PRED_dra_incval_flag_1_static_exec, VA( ATOM_step_counter ), //
 Op("trace_entry", FILE_dra::PRED_trace_entry_4_static_exec, VA( ATOM_completed , a2,  ATOM_$003F , a5), //
 Op("$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a2, a5), cont)))));
    }

    private final static Operation dra_call_tabled_5_2(Prolog m) { 
    // dra_call_tabled(A,B,C,D,E):-is_variant_of_ancestor(B,C,triple(F,G,H),I),!,dra_incval_flag(step_counter),get_unique_index(J),trace_entry(variant,B,J,E),suppress_pioneers_on_list(I,E),'$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(F,G,H,I,K),'$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,D,E,J,L,M,N)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_call_tabled(A,B,C,D,E):-['$get_level'(F),is_variant_of_ancestor(B,C,triple(G,H,I),J),'$cut'(F),dra_incval_flag(step_counter),get_unique_index(K),trace_entry(variant,B,K,E),suppress_pioneers_on_list(J,E),'$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(G,H,I,J,L),'$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,D,E,K,M,N,O)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([a(7),a(8),a(9)],y(1)),put_str(@('FUNCTOR_triple_3'),y(1),a(10))
        a10 =  S( FUNCTOR_triple_3 , a7, a8, a9);
 ;
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        return //
 Op("is_variant_of_ancestor", FILE_dra::PRED_is_variant_of_ancestor_4_static_exec, VA(a2, a3, a10, a11), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a6), //
 Op("dra_incval_flag", FILE_dra::PRED_dra_incval_flag_1_static_exec, VA( ATOM_step_counter ), //
 Op("get_unique_index", FILE_dra::PRED_get_unique_index_1_static_exec, VA(a12), //
 Op("trace_entry", FILE_dra::PRED_trace_entry_4_static_exec, VA( ATOM_variant , a2, a12, a5), //
 Op("suppress_pioneers_on_list", FILE_dra::PRED_suppress_pioneers_on_list_2_static_exec, VA(a11, a5), //
 Op("$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_static_exec, VA(a7, a8, a9, a11, m.DONT_CARE2()), //
 Op("$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_static_exec, VA(a2, a4, a5, a12, m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2()), cont))))))));
    }

    private final static Operation dra_call_tabled_5_3(Prolog m) { 
    // dra_call_tabled(A,B,C,D,E):-'$dummy_39_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,D,F),dra_incval_flag(step_counter),copy_term(B,G),add_pioneer(B,H),trace_entry(pioneer,B,H,E),'$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // dra_call_tabled(A,B,C,D,E):-['$dummy_39_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,D,F),dra_incval_flag(step_counter),copy_term(B,G),add_pioneer(B,H),trace_entry(pioneer,B,H,E),'$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N)]
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        return //
 Op("$dummy_39_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_39_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec, VA(a2, a4, a6), //
 Op("dra_incval_flag", FILE_dra::PRED_dra_incval_flag_1_static_exec, VA( ATOM_step_counter ), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a2, a7), //
 Op("add_pioneer", FILE_dra::PRED_add_pioneer_2_static_exec, VA(a2, a8), //
 Op("trace_entry", FILE_dra::PRED_trace_entry_4_static_exec, VA( ATOM_pioneer , a2, a8, a5), //
 Op("$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_static_exec, VA(a1, a2, a3, a4, a5, a6, a7, a8, m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2()), cont))))));
    }
/** PREDICATE: $dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_$dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_dra::$dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_sub_1);
        return $dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_1(m);
    }

    private final static Operation $dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_2(m);
    }

    private final static Operation $dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_1(Prolog m) { 
    // '$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-is_a_variant_of_a_pioneer(A,B),!,extract_goals(D,E),add_loop(B,E),add_looping_alternative(B,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-['$get_level'(F),is_a_variant_of_a_pioneer(A,B),'$cut'(F),extract_goals(D,E),add_loop(B,E),add_looping_alternative(B,C)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_a_variant_of_a_pioneer", FILE_dra::PRED_is_a_variant_of_a_pioneer_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a6), //
 Op("extract_goals", FILE_dra::PRED_extract_goals_2_static_exec, VA(a4, a5), //
 Op("add_loop", FILE_dra::PRED_add_loop_2_static_exec, VA(a2, a5), //
 Op("add_looping_alternative", FILE_dra::PRED_add_looping_alternative_2_static_exec, VA(a2, a3), cont)))));
    }

    private final static Operation $dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_2(Prolog m) { 
    // '$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-[]
        return cont;
    }
/** PREDICATE: $dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/6,non-(public))
        final static Functor ATOM_variant$0020$0028coinductive0$0029 = SYM("variant (coinductive0)");
        final static Functor FUNCTOR_result_2 = F("result",2);

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_dra::$dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1);
        return $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(m);
    }

    private final static Operation $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_2);
        return $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(m);
    }

    private final static Operation $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_2(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_3);
        return $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_3(m);
    }

    private final static Operation $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_3(Prolog m) { 
        m.trust(null);
        return $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_4(m);
    }

    private final static Operation $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(Prolog m) { 
    // '$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-get_tabled_if_old_first(A,D,'variant (coinductive0)',C)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[get_tabled_if_old_first(A,D,'variant (coinductive0)',C)]
        return //
 Op("get_tabled_if_old_first", FILE_dra::PRED_get_tabled_if_old_first_4_static_exec, VA(a1, a4,  ATOM_variant$0020$0028coinductive0$0029 , a3), cont);
    }

    private final static Operation $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(Prolog m) { 
    // '$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-unify_with_coinductive_ancestor(A,B),'$dummy_38_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,E),memo(E,A,C),new_result_or_fail(D,A),trace_success('variant (coinductive0)',A,D,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[unify_with_coinductive_ancestor(A,B),'$dummy_38_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,E),memo(E,A,C),new_result_or_fail(D,A),trace_success('variant (coinductive0)',A,D,C)]
        return //
 Op("unify_with_coinductive_ancestor", FILE_dra::PRED_unify_with_coinductive_ancestor_2_static_exec, VA(a1, a2), //
 Op("$dummy_38_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_38_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a5), //
 Op("memo", FILE_dra::PRED_memo_3_static_exec, VA(a5, a1, a3), //
 Op("new_result_or_fail", FILE_dra::PRED_new_result_or_fail_2_static_exec, VA(a4, a1), //
 Op("trace_success", FILE_dra::PRED_trace_success_4_static_exec, VA( ATOM_variant$0020$0028coinductive0$0029 , a1, a4, a3), cont)))));
    }

    private final static Operation $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_3(Prolog m) { 
    // '$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-get_remaining_tabled_answers(A,D,variant,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[get_remaining_tabled_answers(A,D,variant,C)]
        return //
 Op("get_remaining_tabled_answers", FILE_dra::PRED_get_remaining_tabled_answers_4_static_exec, VA(a1, a4,  ATOM_variant , a3), cont);
    }

    private final static Operation $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_4(Prolog m) { 
    // '$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-trace_failure('variant (coinductive0)',A,D,C),retractall(result(D,F)),fail
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[trace_failure('variant (coinductive0)',A,D,C),retractall('$dra':result(D,F)),fail]
    // put_str_args([a(4),a(6)],y(1)),put_str(@('FUNCTOR_result_2'),y(1),a(7))
        a7 =  S( FUNCTOR_result_2 , a4, a6);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(7)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(8))
        a8 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a7);
 ;
        return //
 Op("trace_failure", FILE_dra::PRED_trace_failure_4_static_exec, VA( ATOM_variant$0020$0028coinductive0$0029 , a1, a4, a3), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a8), fail_0));
    }
/** PREDICATE: $dummy_38_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_38_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_38_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_38_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_38_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_38_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_38_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_38_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_38_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-is_answer_known(B,A),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_38_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),is_answer_known(B,A),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_answer_known", FILE_dra::PRED_is_answer_known_2_static_exec, VA(a2, a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_38_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_38_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_38_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/7,non-(public))

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_$dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_dra::$dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_sub_1);
        return $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_1(m);
    }

    private final static Operation $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_sub_2);
        return $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_2(m);
    }

    private final static Operation $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_3(m);
    }

    private final static Operation $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_1(Prolog m) { 
    // '$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-is_coinductive1(A),!,copy_term(A,E),'$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // '$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-['$get_level'(H),call('$dra':is_coinductive1(A)),'$cut'(H),copy_term(A,E),'$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F)]
        a8 = m.mkvar1();
        //START inline expansion of $get_level(a(8))
        if (! a8.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_is_coinductive1_1'),y(1),a(9))
        a9 =  S( FUNCTOR_is_coinductive1_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(9)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(10))
        a10 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a9);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a10), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a8), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a1, a5), //
 Op("$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec, VA(a1, a2, a3, a4, a5, a6), cont))));
    }

    private final static Operation $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_2(Prolog m) { 
    // '$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-get_all_tabled_answers(A,D,variant,C)
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
    // '$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-[get_all_tabled_answers(A,D,variant,C)]
        return //
 Op("get_all_tabled_answers", FILE_dra::PRED_get_all_tabled_answers_4_static_exec, VA(a1, a4,  ATOM_variant , a3), cont);
    }

    private final static Operation $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_3(Prolog m) { 
    // '$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-trace_failure(variant,A,D,C),retractall(result(D,G)),fail
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
        cont = m.cont;
    // '$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G):-[trace_failure(variant,A,D,C),retractall('$dra':result(D,G)),fail]
    // put_str_args([a(4),a(7)],y(1)),put_str(@('FUNCTOR_result_2'),y(1),a(8))
        a8 =  S( FUNCTOR_result_2 , a4, a7);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(8)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a8);
 ;
        return //
 Op("trace_failure", FILE_dra::PRED_trace_failure_4_static_exec, VA( ATOM_variant , a1, a4, a3), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a9), fail_0));
    }
/** PREDICATE: $dummy_39_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_39_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/3,non-(public))




    public static Operation PRED_$dummy_39_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_dra::$dummy_39_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1);
        return $dummy_39_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(m);
    }

    private final static Operation $dummy_39_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_39_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(m);
    }

    private final static Operation $dummy_39_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(Prolog m) { 
    // '$dummy_39_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-is_coinductive1(A),!,push_is_coinductive(A,B,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_39_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$get_level'(D),call('$dra':is_coinductive1(A)),'$cut'(D),push_is_coinductive(A,B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_is_coinductive1_1'),y(1),a(5))
        a5 =  S( FUNCTOR_is_coinductive1_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a6), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a4), //
 Op("push_is_coinductive", FILE_dra::PRED_push_is_coinductive_3_static_exec, VA(a1, a2, a3), cont)));
    }

    private final static Operation $dummy_39_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(Prolog m) { 
    // '$dummy_39_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-C=B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_39_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$unify'(C,B)]
        //START inline expansion of $unify(a(3),a(2))
        if (! a3.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/14
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/14,non-(public))
        final static Functor ATOM_$0028no$0020longer$0020a$0020pioneer$0029 = SYM("(no longer a pioneer)");

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14;




    public static Operation PRED_$dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(14, null, FILE_dra::$dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_sub_1);
        return $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_1(m);
    }

    private final static Operation $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_sub_2);
        return $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_2(m);
    }

    private final static Operation $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_sub_2(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_sub_3);
        return $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_3(m);
    }

    private final static Operation $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_sub_3(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_sub_4);
        return $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_4(m);
    }

    private final static Operation $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_sub_4(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_sub_5);
        return $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_5(m);
    }

    private final static Operation $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_sub_5(Prolog m) { 
        m.trust(null);
        return $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_6(m);
    }

    private final static Operation $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_1(Prolog m) { 
    // '$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N):-get_tabled_if_old_first(B,H,pioneer,E)
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
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        a13 = m.AREGS[12];
        a14 = m.AREGS[13];
        cont = m.cont;
    // '$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N):-[get_tabled_if_old_first(B,H,pioneer,E)]
        return //
 Op("get_tabled_if_old_first", FILE_dra::PRED_get_tabled_if_old_first_4_static_exec, VA(a2, a8,  ATOM_pioneer , a5), cont);
    }

    private final static Operation $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_2(Prolog m) { 
    // '$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N):-I is E+1,use_clause(B,J),'$dummy_41_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(G),copy_term((B:-J),K),push_is_tabled(G,H,K,C,L),dra_interp(A,J,L,F,I),'$dummy_42_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,G),memo(G,B,E),new_result_or_fail(H,B),trace_success(pioneer,B,H,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation p1, p2, p3, p4, p5, p6, p7, p8;
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
        a12 = m.AREGS[11];
        a13 = m.AREGS[12];
        a14 = m.AREGS[13];
        cont = m.cont;
    // '$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N):-[I is E+1,use_clause(B,J),'$dummy_41_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(G),copy_term((B:-J),K),push_is_tabled(G,H,K,C,L),dra_interp(A,J,L,F,I),'$dummy_42_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,G),memo(G,B,E),new_result_or_fail(H,B),trace_success(pioneer,B,H,E)]
    // put_str_args([a(5),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(15))
        a15 =  S( FUNCTOR_$002B_2 , a5,  int_1 );
 ;
        //START inline expansion of a(9)is a(15)
        if (! a9.unify(Arithmetic.evaluate(a15), m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2),a(10)],y(2)),put_str(@('FUNCTOR_$003A$002D_2'),y(2),a(16))
        a16 =  S( FUNCTOR_$003A$002D_2 , a2, a10);
 ;
        return //
 Op("use_clause", FILE_dra::PRED_use_clause_2_static_exec, VA(a2, a10), //
 Op("$dummy_41_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_41_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec, VA(a7), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a16, a11), //
 Op("push_is_tabled", FILE_dra::PRED_push_is_tabled_5_static_exec, VA(a7, a8, a11, a3, a12), //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a1, a10, a12, a6, a9), //
 Op("$dummy_42_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_42_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a2, a7), //
 Op("memo", FILE_dra::PRED_memo_3_static_exec, VA(a7, a2, a5), //
 Op("new_result_or_fail", FILE_dra::PRED_new_result_or_fail_2_static_exec, VA(a8, a2), //
 Op("trace_success", FILE_dra::PRED_trace_success_4_static_exec, VA( ATOM_pioneer , a2, a8, a5), cont)))))))));
    }

    private final static Operation $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_3(Prolog m) { 
    // '$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N):-'$dummy_43_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,E,H)
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
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        a13 = m.AREGS[12];
        a14 = m.AREGS[13];
        cont = m.cont;
    // '$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N):-['$dummy_43_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,E,H)]
        return //
 Op("$dummy_43_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_43_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec, VA(a2, a5, a8), cont);
    }

    private final static Operation $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_4(Prolog m) { 
    // '$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N):-'$dummy_44_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,C,D,E,H,M)
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
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        a13 = m.AREGS[12];
        a14 = m.AREGS[13];
        cont = m.cont;
    // '$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N):-['$dummy_44_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(B,C,D,E,H,M)]
        return //
 Op("$dummy_44_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_44_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec, VA(a2, a3, a4, a5, a8, a13), cont);
    }

    private final static Operation $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_5(Prolog m) { 
    // '$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N):-get_remaining_tabled_answers(B,H,'(no longer a pioneer)',E)
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
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        a13 = m.AREGS[12];
        a14 = m.AREGS[13];
        cont = m.cont;
    // '$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N):-[get_remaining_tabled_answers(B,H,'(no longer a pioneer)',E)]
        return //
 Op("get_remaining_tabled_answers", FILE_dra::PRED_get_remaining_tabled_answers_4_static_exec, VA(a2, a8,  ATOM_$0028no$0020longer$0020a$0020pioneer$0029 , a5), cont);
    }

    private final static Operation $dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_6(Prolog m) { 
    // '$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N):-trace_failure('(no longer a pioneer)',B,H,E),retractall(result(H,N)),fail
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
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
        a12 = m.AREGS[11];
        a13 = m.AREGS[12];
        a14 = m.AREGS[13];
        cont = m.cont;
    // '$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N):-[trace_failure('(no longer a pioneer)',B,H,E),retractall('$dra':result(H,N)),fail]
    // put_str_args([a(8),a(14)],y(1)),put_str(@('FUNCTOR_result_2'),y(1),a(15))
        a15 =  S( FUNCTOR_result_2 , a8, a14);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(15)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(16))
        a16 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a15);
 ;
        return //
 Op("trace_failure", FILE_dra::PRED_trace_failure_4_static_exec, VA( ATOM_$0028no$0020longer$0020a$0020pioneer$0029 , a2, a8, a5), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a16), fail_0));
    }
/** PREDICATE: $dummy_41_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_41_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/1,non-(public))




    public static Operation PRED_$dummy_41_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::$dummy_41_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1);
        return $dummy_41_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(m);
    }

    private final static Operation $dummy_41_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_41_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(m);
    }

    private final static Operation $dummy_41_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(Prolog m) { 
    // '$dummy_41_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-is_completed(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_41_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-['$get_level'(B),is_completed(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_completed", FILE_dra::PRED_is_completed_1_static_exec, VA(a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_41_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(Prolog m) { 
    // '$dummy_41_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_41_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_42_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_42_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_42_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_42_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_42_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_42_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_42_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_42_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_42_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-is_answer_known(B,A),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_42_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),is_answer_known(B,A),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_answer_known", FILE_dra::PRED_is_answer_known_2_static_exec, VA(a2, a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_42_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_42_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_42_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_43_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_43_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/3,non-(public))
        final static Functor ATOM_Removing$0020completed$0020pioneer = SYM("Removing completed pioneer");
        final static Functor ATOM_completed$0020now = SYM("completed now");




    public static Operation PRED_$dummy_43_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_dra::$dummy_43_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1);
        return $dummy_43_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(m);
    }

    private final static Operation $dummy_43_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_43_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(m);
    }

    private final static Operation $dummy_43_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(Prolog m) { 
    // '$dummy_43_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-is_completed(A),!,trace_other('Removing completed pioneer',A,C,B),rescind_pioneer_status(C),get_remaining_tabled_answers(A,C,'completed now',B)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_43_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$get_level'(D),is_completed(A),'$cut'(D),trace_other('Removing completed pioneer',A,C,B),rescind_pioneer_status(C),get_remaining_tabled_answers(A,C,'completed now',B)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_completed", FILE_dra::PRED_is_completed_1_static_exec, VA(a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a4), //
 Op("trace_other", FILE_dra::PRED_trace_other_4_static_exec, VA( ATOM_Removing$0020completed$0020pioneer , a1, a3, a2), //
 Op("rescind_pioneer_status", FILE_dra::PRED_rescind_pioneer_status_1_static_exec, VA(a3), //
 Op("get_remaining_tabled_answers", FILE_dra::PRED_get_remaining_tabled_answers_4_static_exec, VA(a1, a3,  ATOM_completed$0020now , a2), cont)))));
    }

    private final static Operation $dummy_43_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(Prolog m) { 
    // '$dummy_43_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_43_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: $dummy_46_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_46_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_46_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_46_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_46_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_46_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_46_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_46_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_46_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-new_result_or_fail(B,A),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_46_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),new_result_or_fail(B,A),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("new_result_or_fail", FILE_dra::PRED_new_result_or_fail_2_static_exec, VA(a2, a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_46_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_46_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_46_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_45_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_45_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/6,non-(public))
        final static Functor ATOM_Computing$0020fixed$0020point$0020for = SYM("Computing fixed point for");
        final static Functor ATOM_Fixed$0020point$0020computed = SYM("Fixed point computed");
        final static Functor ATOM_Removing$0020pioneer = SYM("Removing pioneer");

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_dra::$dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1);
        return $dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(m);
    }

    private final static Operation $dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::$dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_2);
        return $dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(m);
    }

    private final static Operation $dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_3(m);
    }

    private final static Operation $dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(Prolog m) { 
    // '$dummy_45_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-trace_other('Computing fixed point for',A,E,D),compute_fixed_point(A,E,B,C,D),'$dummy_46_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,E),trace_success(pioneer,A,E,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_45_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[trace_other('Computing fixed point for',A,E,D),compute_fixed_point(A,E,B,C,D),'$dummy_46_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,E),trace_success(pioneer,A,E,D)]
        return //
 Op("trace_other", FILE_dra::PRED_trace_other_4_static_exec, VA( ATOM_Computing$0020fixed$0020point$0020for , a1, a5, a4), //
 Op("compute_fixed_point", FILE_dra::PRED_compute_fixed_point_5_static_exec, VA(a1, a5, a2, a3, a4), //
 Op("$dummy_46_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_46_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a5), //
 Op("trace_success", FILE_dra::PRED_trace_success_4_static_exec, VA( ATOM_pioneer , a1, a5, a4), cont))));
    }

    private final static Operation $dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(Prolog m) { 
    // '$dummy_45_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-trace_other('Fixed point computed',A,E,D),complete_goal(A,D),complete_cluster(E,D),trace_other('Removing pioneer',A,E,D),rescind_pioneer_status(E),get_remaining_tabled_answers(A,E,'completed now',D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_45_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[trace_other('Fixed point computed',A,E,D),complete_goal(A,D),complete_cluster(E,D),trace_other('Removing pioneer',A,E,D),rescind_pioneer_status(E),get_remaining_tabled_answers(A,E,'completed now',D)]
        return //
 Op("trace_other", FILE_dra::PRED_trace_other_4_static_exec, VA( ATOM_Fixed$0020point$0020computed , a1, a5, a4), //
 Op("complete_goal", FILE_dra::PRED_complete_goal_2_static_exec, VA(a1, a4), //
 Op("complete_cluster", FILE_dra::PRED_complete_cluster_2_static_exec, VA(a5, a4), //
 Op("trace_other", FILE_dra::PRED_trace_other_4_static_exec, VA( ATOM_Removing$0020pioneer , a1, a5, a4), //
 Op("rescind_pioneer_status", FILE_dra::PRED_rescind_pioneer_status_1_static_exec, VA(a5), //
 Op("get_remaining_tabled_answers", FILE_dra::PRED_get_remaining_tabled_answers_4_static_exec, VA(a1, a5,  ATOM_completed$0020now , a4), cont))))));
    }

    private final static Operation $dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_3(Prolog m) { 
    // '$dummy_45_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-retractall(result(E,F)),fail
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_45_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[retractall('$dra':result(E,F)),fail]
    // put_str_args([a(5),a(6)],y(1)),put_str(@('FUNCTOR_result_2'),y(1),a(7))
        a7 =  S( FUNCTOR_result_2 , a5, a6);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(7)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(8))
        a8 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a7);
 ;
        return //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a8), fail_0);
    }
/** PREDICATE: $dummy_44_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_44_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/6,non-(public))

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_44_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_dra::$dummy_44_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1);
        return $dummy_44_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(m);
    }

    private final static Operation $dummy_44_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_44_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(m);
    }

    private final static Operation $dummy_44_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_1(Prolog m) { 
    // '$dummy_44_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-is_a_variant_of_a_pioneer(A,E),!,'$dummy_45_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_44_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-['$get_level'(G),is_a_variant_of_a_pioneer(A,E),'$cut'(G),'$dummy_45_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_a_variant_of_a_pioneer", FILE_dra::PRED_is_a_variant_of_a_pioneer_2_static_exec, VA(a1, a5), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a7), //
 Op("$dummy_45_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec, VA(a1, a2, a3, a4, a5, a6), cont)));
    }

    private final static Operation $dummy_44_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_2(Prolog m) { 
    // '$dummy_44_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-fail
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_44_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E,F):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: get_tabled_if_old_first/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(get_tabled_if_old_first/4,non-(public))




    public static Operation PRED_get_tabled_if_old_first_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // get_tabled_if_old_first(A,B,C,D):-is_old_first(A),get_all_tabled_answers(A,B,C,D),new_result_or_fail(B,A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // get_tabled_if_old_first(A,B,C,D):-[call('$dra':is_old_first(A)),get_all_tabled_answers(A,B,C,D),new_result_or_fail(B,A)]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_is_old_first_1'),y(1),a(5))
        a5 =  S( FUNCTOR_is_old_first_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a6), //
 Op("get_all_tabled_answers", FILE_dra::PRED_get_all_tabled_answers_4_static_exec, VA(a1, a2, a3, a4), //
 Op("new_result_or_fail", FILE_dra::PRED_new_result_or_fail_2_static_exec, VA(a2, a1), cont)));
    }
/** PREDICATE: get_all_tabled_answers/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(get_all_tabled_answers/4,non-(public))




    public static Operation PRED_get_all_tabled_answers_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // get_all_tabled_answers(A,B,C,D):-get_answer(A),trace_success(C,A,B,D)
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // get_all_tabled_answers(A,B,C,D):-[get_answer(A),trace_success(C,A,B,D)]
        return //
 Op("get_answer", FILE_dra::PRED_get_answer_1_static_exec, VA(a1), //
 Op("trace_success", FILE_dra::PRED_trace_success_4_static_exec, VA(a3, a1, a2, a4), cont));
    }
/** PREDICATE: $dummy_47_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_47_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_47_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_47_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_47_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_47_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_47_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_47_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_47_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-is_result_known(B,A),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_47_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),is_result_known(B,A),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_result_known", FILE_dra::PRED_is_result_known_2_static_exec, VA(a2, a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_47_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_47_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_47_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: get_remaining_tabled_answers/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(get_remaining_tabled_answers/4,non-(public))




    public static Operation PRED_get_remaining_tabled_answers_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // get_remaining_tabled_answers(A,B,C,D):-get_answer(A),'$dummy_47_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),trace_success(C,A,B,D)
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // get_remaining_tabled_answers(A,B,C,D):-[get_answer(A),'$dummy_47_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),trace_success(C,A,B,D)]
        return //
 Op("get_answer", FILE_dra::PRED_get_answer_1_static_exec, VA(a1), //
 Op("$dummy_47_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_47_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a2), //
 Op("trace_success", FILE_dra::PRED_trace_success_4_static_exec, VA(a3, a1, a2, a4), cont)));
    }
/** PREDICATE: use_clause/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(use_clause/2,non-(public))




    public static Operation PRED_use_clause_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::use_clause_2_sub_1);
        return use_clause_2_1(m);
    }

    private final static Operation use_clause_2_sub_1(Prolog m) { 
        m.trust(null);
        return use_clause_2_2(m);
    }

    private final static Operation use_clause_2_1(Prolog m) { 
    // use_clause(A,B):-predicate_property(A,number_of_clauses(C)),!,clause(A,B),B\=(!,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // use_clause(A,B):-['$get_level'(C),predicate_property(A,number_of_clauses(D)),'$cut'(C),clause('$dra':A,B),'$not_unifiable'(B,(!,E))]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_number_of_clauses_1'),y(1),a(4))
        a4 =  S( FUNCTOR_number_of_clauses_1 , m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(1)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a1);
 ;
    // put_str_args([@('ATOM_$0021'),void],y(3)),put_str(@('FUNCTOR_$002C_2'),y(3),a(6))
        a6 =  S( FUNCTOR_$002C_2 ,  ATOM_$0021 , m.mkvar3());
 ;
        return //
 Op("predicate_property", FILE_dra::PRED_predicate_property_2_static_exec, VA(a1, a4), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("clause", FILE_dra::PRED_clause_2_static_exec, VA(a5, a2), //
 Op("$not_unifiable", FILE_dra::PRED_$not_unifiable_2_static_exec, VA(a2, a6), cont))));
    }

    private final static Operation use_clause_2_2(Prolog m) { 
    // use_clause(A,B):-set_meta(A,is_never_tabled),B=call(A)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // use_clause(A,B):-[set_meta(A,is_never_tabled),'$unify'(B,call(A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_call_1'),y(1),a(3))
        a3 =  S( FUNCTOR_call_1 , a1);
 ;
        return //
 Op("set_meta", FILE_dra::PRED_set_meta_2_static_exec, VA(a1,  ATOM_is_never_tabled ), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a2, a3), cont));
    }
/** PREDICATE: $dummy_48_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_48_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/3,non-(public))




    public static Operation PRED_$dummy_48_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_dra::$dummy_48_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1);
        return $dummy_48_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(m);
    }

    private final static Operation $dummy_48_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_48_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(m);
    }

    private final static Operation $dummy_48_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_1(Prolog m) { 
    // '$dummy_48_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-is_coinductive1(A),!,push_is_coinductive(A,B,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_48_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$get_level'(D),call('$dra':is_coinductive1(A)),'$cut'(D),push_is_coinductive(A,B,C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_is_coinductive1_1'),y(1),a(5))
        a5 =  S( FUNCTOR_is_coinductive1_1 , a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a6), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a4), //
 Op("push_is_coinductive", FILE_dra::PRED_push_is_coinductive_3_static_exec, VA(a1, a2, a3), cont)));
    }

    private final static Operation $dummy_48_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_2(Prolog m) { 
    // '$dummy_48_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-C=B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_48_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C):-['$unify'(C,B)]
        //START inline expansion of $unify(a(3),a(2))
        if (! a3.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: compute_fixed_point/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(compute_fixed_point/5,non-(public))

    // private final Term arg5;




    public static Operation PRED_compute_fixed_point_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // compute_fixed_point(A,B,C,D,E):-F is E+1,'$dummy_48_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,D,G),dra_getval_flag(number_of_answers,H),compute_fixed_point_(A,B,C,G,F,H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // compute_fixed_point(A,B,C,D,E):-[F is E+1,'$dummy_48_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,D,G),dra_getval_flag(number_of_answers,H),compute_fixed_point_(A,B,C,G,F,H)]
        a6 = m.mkvar1();
    // put_str_args([a(5),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(7))
        a7 =  S( FUNCTOR_$002B_2 , a5,  int_1 );
 ;
        //START inline expansion of a(6)is a(7)
        if (! a6.unify(Arithmetic.evaluate(a7), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op("$dummy_48_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_48_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec, VA(a1, a4, a8), //
 Op("dra_getval_flag", FILE_dra::PRED_dra_getval_flag_2_static_exec, VA( ATOM_number_of_answers , a9), //
 Op("compute_fixed_point_", FILE_dra::PRED_compute_fixed_point__6_static_exec, VA(a1, a2, a3, a8, a6, a9), cont)));
    }
/** PREDICATE: $dummy_51_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_51_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_51_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_51_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_51_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_51_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_51_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_51_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_51_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-B=A,!,fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_51_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),'$unify'(B,A),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(2),a(1))
        if (! a2.unify(a1, m.trail)) {
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

    private final static Operation $dummy_51_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_51_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_51_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_49_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_49_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_49_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_49_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_49_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_49_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_49_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_49_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_49_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-'$dummy_51_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_49_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),'$dummy_51_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_51_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_51_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_49_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_49_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_49_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_50_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_50_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/1,non-(public))
        final static Functor ATOM_warning = SYM("warning");
        final static Functor ATOM_cutted$0020at$0020 = SYM("cutted at ");




    public static Operation PRED_$dummy_50_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::$dummy_50_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1);
        return $dummy_50_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(m);
    }

    private final static Operation $dummy_50_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_50_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(m);
    }

    private final static Operation $dummy_50_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(Prolog m) { 
    // '$dummy_50_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-nonvar(A),!,print_message(warning,[warning,'cutted at ',A])
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_50_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-['$get_level'(B),nonvar(A),'$cut'(B),print_message(warning,[warning,'cutted at ',A])]
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
        a3 = CONS(a1,  Prolog.Nil );
        a4 = CONS( ATOM_cutted$0020at$0020 , a3);
        a5 = CONS( ATOM_warning , a4);
        return //
 Op("print_message", FILE_dra::PRED_print_message_2_static_exec, VA( ATOM_warning , a5), cont);
    }

    private final static Operation $dummy_50_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(Prolog m) { 
    // '$dummy_50_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_50_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-[]
        return cont;
    }
/** PREDICATE: compute_fixed_point_/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(compute_fixed_point_/6,non-(public))

    // private final Term arg5, arg6;




    public static Operation PRED_compute_fixed_point__6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_dra::compute_fixed_point__6_sub_1);
        return compute_fixed_point__6_1(m);
    }

    private final static Operation compute_fixed_point__6_sub_1(Prolog m) { 
        m.trust(null);
        return compute_fixed_point__6_2(m);
    }

    private final static Operation compute_fixed_point__6_1(Prolog m) { 
    // compute_fixed_point_(A,B,C,D,E,F):-copy_term(A,G),get_looping_alternative(B,(H:-I)),'$dummy_49_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,H),copy_term((H:-I),J),H=A,push_is_tabled(G,B,J,C,K),dra_interp(L,I,K,D,E),'$dummy_50_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(L),new_result_or_fail(B,A),memo(G,A,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1, p2, p3, p4, p5, p6, p7, p8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // compute_fixed_point_(A,B,C,D,E,F):-[copy_term(A,G),get_looping_alternative(B,(H:-I)),'$dummy_49_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,H),copy_term((H:-I),J),'$unify'(H,A),push_is_tabled(G,B,J,C,K),dra_interp(L,I,K,D,E),'$dummy_50_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(L),new_result_or_fail(B,A),memo(G,A,E)]
        a7 = m.mkvar1();
        //START inline expansion of copy_term(a(1),a(7))
        a1 = a1.dref();
        if (! a7.unify(m.copy(a1), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([a(8),a(9)],y(1)),put_str(@('FUNCTOR_$003A$002D_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$003A$002D_2 , a8, a9);
 ;
    // put_str_args([a(8),a(9)],y(2)),put_str(@('FUNCTOR_$003A$002D_2'),y(2),a(11))
        a11 =  S( FUNCTOR_$003A$002D_2 , a8, a9);
 ;
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        return //
 Op("get_looping_alternative", FILE_dra::PRED_get_looping_alternative_2_static_exec, VA(a2, a10), //
 Op("$dummy_49_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_49_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a8), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a11, a12), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a8, a1), //
 Op("push_is_tabled", FILE_dra::PRED_push_is_tabled_5_static_exec, VA(a7, a2, a12, a3, a13), //
 Op("dra_interp", FILE_dra::PRED_dra_interp_5_static_exec, VA(a14, a9, a13, a4, a5), //
 Op("$dummy_50_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_50_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec, VA(a14), //
 Op("new_result_or_fail", FILE_dra::PRED_new_result_or_fail_2_static_exec, VA(a2, a1), //
 Op("memo", FILE_dra::PRED_memo_3_static_exec, VA(a7, a1, a5), cont)))))))));
    }

    private final static Operation compute_fixed_point__6_2(Prolog m) { 
    // compute_fixed_point_(A,B,C,D,E,F):-dra_getval_flag(number_of_answers,G),G\=F,compute_fixed_point_(A,B,C,D,E,G)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // compute_fixed_point_(A,B,C,D,E,F):-[dra_getval_flag(number_of_answers,G),'$not_unifiable'(G,F),compute_fixed_point_(A,B,C,D,E,G)]
        a7 = m.mkvar1();
        return //
 Op("dra_getval_flag", FILE_dra::PRED_dra_getval_flag_2_static_exec, VA( ATOM_number_of_answers , a7), //
 Op("$not_unifiable", FILE_dra::PRED_$not_unifiable_2_static_exec, VA(a7, a6), //
 Op("compute_fixed_point_", FILE_dra::PRED_compute_fixed_point__6_static_exec, VA(a1, a2, a3, a4, a5, a7), cont)));
    }
/** PREDICATE: suppress_pioneers_on_list/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(suppress_pioneers_on_list/2,non-(public))




    public static Operation PRED_suppress_pioneers_on_list_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::suppress_pioneers_on_list_2_sub_1);
        return suppress_pioneers_on_list_2_1(m);
    }

    private final static Operation suppress_pioneers_on_list_2_sub_1(Prolog m) { 
        m.trust(null);
        return suppress_pioneers_on_list_2_2(m);
    }

    private final static Operation suppress_pioneers_on_list_2_1(Prolog m) { 
    // suppress_pioneers_on_list(A,B):-member(triple(C,D,E),A),is_a_variant_of_a_pioneer(C,D),trace_other('Removing pioneer',C,D,B),rescind_pioneer_status(D),fail
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // suppress_pioneers_on_list(A,B):-[member(triple(C,D,E),A),is_a_variant_of_a_pioneer(C,D),trace_other('Removing pioneer',C,D,B),rescind_pioneer_status(D),fail]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(3),a(4),void],y(1)),put_str(@('FUNCTOR_triple_3'),y(1),a(5))
        a5 =  S( FUNCTOR_triple_3 , a3, a4, m.mkvar3());
 ;
        return //
 Op("member", FILE_dra::PRED_member_2_static_exec, VA(a5, a1), //
 Op("is_a_variant_of_a_pioneer", FILE_dra::PRED_is_a_variant_of_a_pioneer_2_static_exec, VA(a3, a4), //
 Op("trace_other", FILE_dra::PRED_trace_other_4_static_exec, VA( ATOM_Removing$0020pioneer , a3, a4, a2), //
 Op("rescind_pioneer_status", FILE_dra::PRED_rescind_pioneer_status_1_static_exec, VA(a4), fail_0))));
    }

    private final static Operation suppress_pioneers_on_list_2_2(Prolog m) { 
    // suppress_pioneers_on_list(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // suppress_pioneers_on_list(A,B):-[]
        return cont;
    }
/** PREDICATE: rescind_pioneer_status/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(rescind_pioneer_status/1,non-(public))




    public static Operation PRED_rescind_pioneer_status_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rescind_pioneer_status(A):-delete_pioneer(A),delete_loops(A),delete_looping_alternatives(A)
        m.setB0();
         Term a1;
        Operation p1, p2;
        a1 = LARG[0];
    // rescind_pioneer_status(A):-[delete_pioneer(A),delete_loops(A),delete_looping_alternatives(A)]
        return //
 Op("delete_pioneer", FILE_dra::PRED_delete_pioneer_1_static_exec, VA(a1), //
 Op("delete_loops", FILE_dra::PRED_delete_loops_1_static_exec, VA(a1), //
 Op("delete_looping_alternatives", FILE_dra::PRED_delete_looping_alternatives_1_static_exec, VA(a1), cont)));
    }
/** PREDICATE: complete_cluster/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(complete_cluster/2,non-(public))




    public static Operation PRED_complete_cluster_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::complete_cluster_2_sub_1);
        return complete_cluster_2_1(m);
    }

    private final static Operation complete_cluster_2_sub_1(Prolog m) { 
        m.trust(null);
        return complete_cluster_2_2(m);
    }

    private final static Operation complete_cluster_2_1(Prolog m) { 
    // complete_cluster(A,B):-get_loop(A,C),member(D,C),complete_goal(D,B),fail
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // complete_cluster(A,B):-[get_loop(A,C),member(D,C),complete_goal(D,B),fail]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        return //
 Op("get_loop", FILE_dra::PRED_get_loop_2_static_exec, VA(a1, a3), //
 Op("member", FILE_dra::PRED_member_2_static_exec, VA(a4, a3), //
 Op("complete_goal", FILE_dra::PRED_complete_goal_2_static_exec, VA(a4, a2), fail_0)));
    }

    private final static Operation complete_cluster_2_2(Prolog m) { 
    // complete_cluster(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // complete_cluster(A,B):-[]
        return cont;
    }
/** PREDICATE: extract_goals/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(extract_goals/2,non-(public))




    public static Operation PRED_extract_goals_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return extract_goals_2_top(m);
    }

    private final static Operation extract_goals_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_dra::extract_goals_2_var, fail_0, fail_0, FILE_dra::extract_goals_2_1, fail_0, FILE_dra::extract_goals_2_2); 
    }

    private final static Operation extract_goals_2_var(Prolog m) { 
        m.jtry2(null, FILE_dra::extract_goals_2_var_1);
        return extract_goals_2_1(m);
    }

    private final static Operation extract_goals_2_var_1(Prolog m) { 
        m.trust(null);
        return extract_goals_2_2(m);
    }

    private final static Operation extract_goals_2_1(Prolog m) { 
    // extract_goals([],[]):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // extract_goals([],[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation extract_goals_2_2(Prolog m) { 
    // extract_goals([triple(A,B,C)|D],[A|E]):-extract_goals(D,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // extract_goals([triple(A,B,C)|D],[A|E]):-[extract_goals(D,E)]
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
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_triple_3 , m.trail, a5, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a5.unify(a2.car(), m.trail))
                return m.fail();
            a6 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
             a2.bind(CONS(a5, a6), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a4;
        m.AREGS[1] = a6;
m.cont = cont;
        return extract_goals_2_top(m);
    }
/** PREDICATE: get_unique_index/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(get_unique_index/1,non-(public))




    public static Operation PRED_get_unique_index_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // get_unique_index(A):-dra_getval_flag(unique_index,A),dra_incval_flag(unique_index)
        m.setB0();
         Term a1;
        Operation p1;
        a1 = LARG[0];
    // get_unique_index(A):-[dra_getval_flag(unique_index,A),dra_incval_flag(unique_index)]
        return //
 Op("dra_getval_flag", FILE_dra::PRED_dra_getval_flag_2_static_exec, VA( ATOM_unique_index , a1), //
 Op("dra_incval_flag", FILE_dra::PRED_dra_incval_flag_1_static_exec, VA( ATOM_unique_index ), cont));
    }
/** PREDICATE: are_essences_variants/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(are_essences_variants/2,non-(public))




    public static Operation PRED_are_essences_variants_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // are_essences_variants(A,B):-once(essence_hook(A,C)),once(essence_hook(B,D)),are_variants(C,D)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
    // are_essences_variants(A,B):-[once('$dra':essence_hook(A,C)),once('$dra':essence_hook(B,D)),are_variants(C,D)]
        a3 = m.mkvar1();
    // put_str_args([a(1),a(3)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(4))
        a4 =  S( FUNCTOR_essence_hook_2 , a1, a3);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a4);
 ;
        a6 = m.mkvar1();
    // put_str_args([a(2),a(6)],y(3)),put_str(@('FUNCTOR_essence_hook_2'),y(3),a(7))
        a7 =  S( FUNCTOR_essence_hook_2 , a2, a6);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(7)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(8))
        a8 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a7);
 ;
        return //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a5), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a8), //
 Op("are_variants", FILE_dra::PRED_are_variants_2_static_exec, VA(a3, a6), cont)));
    }
/** PREDICATE: trace_entry/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(trace_entry/4,non-(public))
        final static Functor ATOM_Entering$0020 = SYM("Entering ");




    public static Operation PRED_trace_entry_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_dra::trace_entry_4_sub_1);
        return trace_entry_4_1(m);
    }

    private final static Operation trace_entry_4_sub_1(Prolog m) { 
        m.trust(null);
        return trace_entry_4_2(m);
    }

    private final static Operation trace_entry_4_1(Prolog m) { 
    // trace_entry(A,B,C,D):-is_traced(B),!,write_level(D),std_trace_stream(E),dra_w('Entering '),write_label_and_goal(A,B,C),nl(E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // trace_entry(A,B,C,D):-['$get_level'(E),call('$dra':is_traced(B)),'$cut'(E),write_level(D),std_trace_stream(F),dra_w('Entering '),write_label_and_goal(A,B,C),nl(F)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_is_traced_1'),y(1),a(6))
        a6 =  S( FUNCTOR_is_traced_1 , a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a6);
 ;
        a8 = m.mkvar1();
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a7), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a5), //
 Op("write_level", FILE_dra::PRED_write_level_1_static_exec, VA(a4), //
 Op("std_trace_stream", FILE_dra::PRED_std_trace_stream_1_static_exec, VA(a8), //
 Op("dra_w", FILE_dra::PRED_dra_w_1_static_exec, VA( ATOM_Entering$0020 ), //
 Op("write_label_and_goal", FILE_dra::PRED_write_label_and_goal_3_static_exec, VA(a1, a2, a3), //
 Op("nl", FILE_dra::PRED_nl_1_static_exec, VA(a8), cont)))))));
    }

    private final static Operation trace_entry_4_2(Prolog m) { 
    // trace_entry(A,B,C,D):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // trace_entry(A,B,C,D):-[]
        return cont;
    }
/** PREDICATE: $dummy_52_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_52_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/5,non-(public))
        final static Functor ATOM_Success$0020 = SYM("Success ");
        final static Functor ATOM_Retrying$0020 = SYM("Retrying ");

    // private final Term arg5;




    public static Operation PRED_$dummy_52_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_dra::$dummy_52_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_sub_1);
        return $dummy_52_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_1(m);
    }

    private final static Operation $dummy_52_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_52_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_2(m);
    }

    private final static Operation $dummy_52_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_1(Prolog m) { 
    // '$dummy_52_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-write_level(D),dra_w('Success '),write_label_and_goal(A,B,C),nl(E)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_52_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-[write_level(D),dra_w('Success '),write_label_and_goal(A,B,C),nl(E)]
        return //
 Op("write_level", FILE_dra::PRED_write_level_1_static_exec, VA(a4), //
 Op("dra_w", FILE_dra::PRED_dra_w_1_static_exec, VA( ATOM_Success$0020 ), //
 Op("write_label_and_goal", FILE_dra::PRED_write_label_and_goal_3_static_exec, VA(a1, a2, a3), //
 Op("nl", FILE_dra::PRED_nl_1_static_exec, VA(a5), cont))));
    }

    private final static Operation $dummy_52_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_2(Prolog m) { 
    // '$dummy_52_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-write_level(D),dra_w('Retrying '),write_label_and_goal(A,B,C),nl(E),fail
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_52_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E):-[write_level(D),dra_w('Retrying '),write_label_and_goal(A,B,C),nl(E),fail]
        return //
 Op("write_level", FILE_dra::PRED_write_level_1_static_exec, VA(a4), //
 Op("dra_w", FILE_dra::PRED_dra_w_1_static_exec, VA( ATOM_Retrying$0020 ), //
 Op("write_label_and_goal", FILE_dra::PRED_write_label_and_goal_3_static_exec, VA(a1, a2, a3), //
 Op("nl", FILE_dra::PRED_nl_1_static_exec, VA(a5), fail_0))));
    }
/** PREDICATE: trace_success/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(trace_success/4,non-(public))




    public static Operation PRED_trace_success_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_dra::trace_success_4_sub_1);
        return trace_success_4_1(m);
    }

    private final static Operation trace_success_4_sub_1(Prolog m) { 
        m.trust(null);
        return trace_success_4_2(m);
    }

    private final static Operation trace_success_4_1(Prolog m) { 
    // trace_success(A,B,C,D):-is_traced(B),!,std_trace_stream(E),'$dummy_52_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // trace_success(A,B,C,D):-['$get_level'(E),call('$dra':is_traced(B)),'$cut'(E),std_trace_stream(F),'$dummy_52_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B,C,D,F)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_is_traced_1'),y(1),a(6))
        a6 =  S( FUNCTOR_is_traced_1 , a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a6);
 ;
        a8 = m.mkvar1();
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a7), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a5), //
 Op("std_trace_stream", FILE_dra::PRED_std_trace_stream_1_static_exec, VA(a8), //
 Op("$dummy_52_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_52_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_static_exec, VA(a1, a2, a3, a4, a8), cont))));
    }

    private final static Operation trace_success_4_2(Prolog m) { 
    // trace_success(A,B,C,D):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // trace_success(A,B,C,D):-[]
        return cont;
    }
/** PREDICATE: trace_failure/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(trace_failure/4,non-(public))
        final static Functor ATOM_Failing$0020 = SYM("Failing ");




    public static Operation PRED_trace_failure_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_dra::trace_failure_4_sub_1);
        return trace_failure_4_1(m);
    }

    private final static Operation trace_failure_4_sub_1(Prolog m) { 
        m.trust(null);
        return trace_failure_4_2(m);
    }

    private final static Operation trace_failure_4_1(Prolog m) { 
    // trace_failure(A,B,C,D):-is_traced(B),!,write_level(D),std_trace_stream(E),dra_w('Failing '),write_label_and_goal(A,B,C),nl(E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // trace_failure(A,B,C,D):-['$get_level'(E),call('$dra':is_traced(B)),'$cut'(E),write_level(D),std_trace_stream(F),dra_w('Failing '),write_label_and_goal(A,B,C),nl(F)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_is_traced_1'),y(1),a(6))
        a6 =  S( FUNCTOR_is_traced_1 , a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a6);
 ;
        a8 = m.mkvar1();
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a7), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a5), //
 Op("write_level", FILE_dra::PRED_write_level_1_static_exec, VA(a4), //
 Op("std_trace_stream", FILE_dra::PRED_std_trace_stream_1_static_exec, VA(a8), //
 Op("dra_w", FILE_dra::PRED_dra_w_1_static_exec, VA( ATOM_Failing$0020 ), //
 Op("write_label_and_goal", FILE_dra::PRED_write_label_and_goal_3_static_exec, VA(a1, a2, a3), //
 Op("nl", FILE_dra::PRED_nl_1_static_exec, VA(a8), cont)))))));
    }

    private final static Operation trace_failure_4_2(Prolog m) { 
    // trace_failure(A,B,C,D):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // trace_failure(A,B,C,D):-[]
        return cont;
    }
/** PREDICATE: trace_other/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(trace_other/4,non-(public))




    public static Operation PRED_trace_other_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_dra::trace_other_4_sub_1);
        return trace_other_4_1(m);
    }

    private final static Operation trace_other_4_sub_1(Prolog m) { 
        m.trust(null);
        return trace_other_4_2(m);
    }

    private final static Operation trace_other_4_1(Prolog m) { 
    // trace_other(A,B,C,D):-is_traced(B),!,write_level(D),write_label_and_goal(A,B,C),std_trace_stream(E),nl(E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // trace_other(A,B,C,D):-['$get_level'(E),call('$dra':is_traced(B)),'$cut'(E),write_level(D),write_label_and_goal(A,B,C),std_trace_stream(F),nl(F)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_is_traced_1'),y(1),a(6))
        a6 =  S( FUNCTOR_is_traced_1 , a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a6);
 ;
        a8 = m.mkvar1();
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a7), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a5), //
 Op("write_level", FILE_dra::PRED_write_level_1_static_exec, VA(a4), //
 Op("write_label_and_goal", FILE_dra::PRED_write_label_and_goal_3_static_exec, VA(a1, a2, a3), //
 Op("std_trace_stream", FILE_dra::PRED_std_trace_stream_1_static_exec, VA(a8), //
 Op("nl", FILE_dra::PRED_nl_1_static_exec, VA(a8), cont))))));
    }

    private final static Operation trace_other_4_2(Prolog m) { 
    // trace_other(A,B,C,D):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // trace_other(A,B,C,D):-[]
        return cont;
    }
/** PREDICATE: write_level/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(write_level/1,non-(public))




    public static Operation PRED_write_level_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // write_level(A):-dra_w([A])
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // write_level(A):-[dra_w([A])]
        a2 = CONS(a1,  Prolog.Nil );
        return //
 Op("dra_w", FILE_dra::PRED_dra_w_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: write_label_and_goal/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(write_label_and_goal/3,non-(public))
        final static Functor FUNCTOR_print_depth_1 = F("print_depth",1);
        final static Functor ATOM_$003A$0020 = SYM(": ");




    public static Operation PRED_write_label_and_goal_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // write_label_and_goal(A,B,C):-print_depth(D),std_trace_stream(E),dra_w(A),dra_w(': '),write_goal_number(C),write_shallow(E,B,D)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3, p4, p5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // write_label_and_goal(A,B,C):-[call('$dra':print_depth(D)),std_trace_stream(E),dra_w(A),dra_w(': '),write_goal_number(C),write_shallow(E,B,D)]
        a4 = m.mkvar1();
    // put_str_args([a(4)],y(1)),put_str(@('FUNCTOR_print_depth_1'),y(1),a(5))
        a5 =  S( FUNCTOR_print_depth_1 , a4);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
        a7 = m.mkvar1();
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a6), //
 Op("std_trace_stream", FILE_dra::PRED_std_trace_stream_1_static_exec, VA(a7), //
 Op("dra_w", FILE_dra::PRED_dra_w_1_static_exec, VA(a1), //
 Op("dra_w", FILE_dra::PRED_dra_w_1_static_exec, VA( ATOM_$003A$0020 ), //
 Op("write_goal_number", FILE_dra::PRED_write_goal_number_1_static_exec, VA(a3), //
 Op("write_shallow", FILE_dra::PRED_write_shallow_3_static_exec, VA(a7, a2, a4), cont))))));
    }
/** PREDICATE: write_goal_number/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(write_goal_number/1,non-(public))
        final static Functor ATOM_$003C = SYM("<");
        final static Functor ATOM_$003E$0020 = SYM("> ");




    public static Operation PRED_write_goal_number_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_dra::write_goal_number_1_var, FILE_dra::write_goal_number_1_2, FILE_dra::write_goal_number_1_2, FILE_dra::write_goal_number_1_var, FILE_dra::write_goal_number_1_2, FILE_dra::write_goal_number_1_2); 
    }

    private final static Operation write_goal_number_1_var(Prolog m) { 
        m.jtry1(null, FILE_dra::write_goal_number_1_var_1);
        return write_goal_number_1_1(m);
    }

    private final static Operation write_goal_number_1_var_1(Prolog m) { 
        m.trust(null);
        return write_goal_number_1_2(m);
    }

    private final static Operation write_goal_number_1_1(Prolog m) { 
    // write_goal_number(?):-!
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // write_goal_number(?):-['$neck_cut']
        if (!  ATOM_$003F .unify(a1, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation write_goal_number_1_2(Prolog m) { 
    // write_goal_number(A):-dra_w(<),dra_w(A),dra_w('> ')
         Term a1;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // write_goal_number(A):-[dra_w(<),dra_w(A),dra_w('> ')]
        return //
 Op("dra_w", FILE_dra::PRED_dra_w_1_static_exec, VA( ATOM_$003C ), //
 Op("dra_w", FILE_dra::PRED_dra_w_1_static_exec, VA(a1), //
 Op("dra_w", FILE_dra::PRED_dra_w_1_static_exec, VA( ATOM_$003E$0020 ), cont)));
    }
/** PREDICATE: optional_trace/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(optional_trace/4,non-(public))
        final static Functor ATOM_$0020$003A$0020 = SYM(" : ");




    public static Operation PRED_optional_trace_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_dra::optional_trace_4_sub_1);
        return optional_trace_4_1(m);
    }

    private final static Operation optional_trace_4_sub_1(Prolog m) { 
        m.trust(null);
        return optional_trace_4_2(m);
    }

    private final static Operation optional_trace_4_1(Prolog m) { 
    // optional_trace(A,B,C,D):-is_traced(B),!,print_depth(E),write_level(D),std_trace_stream(F),write(F,A),write_shallow(F,B,E),write(F,' : '),write_shallow(F,C,E),nl(F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // optional_trace(A,B,C,D):-['$get_level'(E),call('$dra':is_traced(B)),'$cut'(E),call('$dra':print_depth(F)),write_level(D),std_trace_stream(G),write(G,A),write_shallow(G,B,F),write(G,' : '),write_shallow(G,C,F),nl(G)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_is_traced_1'),y(1),a(6))
        a6 =  S( FUNCTOR_is_traced_1 , a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a6);
 ;
        a8 = m.mkvar1();
    // put_str_args([a(8)],y(3)),put_str(@('FUNCTOR_print_depth_1'),y(3),a(9))
        a9 =  S( FUNCTOR_print_depth_1 , a8);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(9)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(10))
        a10 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a9);
 ;
        a11 = m.mkvar1();
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a7), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a5), //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a10), //
 Op("write_level", FILE_dra::PRED_write_level_1_static_exec, VA(a4), //
 Op("std_trace_stream", FILE_dra::PRED_std_trace_stream_1_static_exec, VA(a11), //
 Op("write", FILE_dra::PRED_write_2_static_exec, VA(a11, a1), //
 Op("write_shallow", FILE_dra::PRED_write_shallow_3_static_exec, VA(a11, a2, a8), //
 Op("write", FILE_dra::PRED_write_2_static_exec, VA(a11,  ATOM_$0020$003A$0020 ), //
 Op("write_shallow", FILE_dra::PRED_write_shallow_3_static_exec, VA(a11, a3, a8), //
 Op("nl", FILE_dra::PRED_nl_1_static_exec, VA(a11), cont))))))))));
    }

    private final static Operation optional_trace_4_2(Prolog m) { 
    // optional_trace(A,B,C,D):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // optional_trace(A,B,C,D):-[]
        return cont;
    }
/** PREDICATE: $dummy_53_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_53_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_53_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_53_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_53_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_53_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_53_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_53_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_53_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-recorded(A,B),!,true
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_53_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),recorded(A,B),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("recorded", FILE_dra::PRED_recorded_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation $dummy_53_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_53_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_53_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: ensure_recorded/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(ensure_recorded/2,non-(public))




    public static Operation PRED_ensure_recorded_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::ensure_recorded_2_sub_1);
        return ensure_recorded_2_1(m);
    }

    private final static Operation ensure_recorded_2_sub_1(Prolog m) { 
        m.trust(null);
        return ensure_recorded_2_2(m);
    }

    private final static Operation ensure_recorded_2_1(Prolog m) { 
    // ensure_recorded(A,B):-'$dummy_53_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // ensure_recorded(A,B):-['$dummy_53_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B)]
        return //
 Op("$dummy_53_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_53_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a2), cont);
    }

    private final static Operation ensure_recorded_2_2(Prolog m) { 
    // ensure_recorded(A,B):-recordz(A,B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // ensure_recorded(A,B):-[recordz(A,B)]
        return //
 Op("recordz", FILE_dra::PRED_recordz_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: print_tables/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(print_tables/0,public)
        final static Functor FUNCTOR_answer_3 = F("answer",3);
        final static Functor FUNCTOR_pioneer_3 = F("pioneer",3);
        final static Functor FUNCTOR_loop_2 = F("loop",2);
        final static Functor FUNCTOR_looping_alternative_2 = F("looping_alternative",2);
        final static Functor FUNCTOR_completed_2 = F("completed",2);




    public static Operation PRED_print_tables_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // print_tables:-recorded_listing(answer(A,B,C)),recorded_listing(result(D,E)),recorded_listing(pioneer(F,G,H)),recorded_listing(loop(I,J)),recorded_listing(looping_alternative(K,L)),recorded_listing(completed(M,N))
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4, p5;
    // print_tables:-[recorded_listing(answer(A,B,C)),recorded_listing(result(D,E)),recorded_listing(pioneer(F,G,H)),recorded_listing(loop(I,J)),recorded_listing(looping_alternative(K,L)),recorded_listing(completed(M,N))]
    // put_str_args([void,void,void],y(1)),put_str(@('FUNCTOR_answer_3'),y(1),a(1))
        a1 =  S( FUNCTOR_answer_3 , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([void,void],y(2)),put_str(@('FUNCTOR_result_2'),y(2),a(2))
        a2 =  S( FUNCTOR_result_2 , m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([void,void,void],y(3)),put_str(@('FUNCTOR_pioneer_3'),y(3),a(3))
        a3 =  S( FUNCTOR_pioneer_3 , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([void,void],y(4)),put_str(@('FUNCTOR_loop_2'),y(4),a(4))
        a4 =  S( FUNCTOR_loop_2 , m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([void,void],y(5)),put_str(@('FUNCTOR_looping_alternative_2'),y(5),a(5))
        a5 =  S( FUNCTOR_looping_alternative_2 , m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([void,void],y(6)),put_str(@('FUNCTOR_completed_2'),y(6),a(6))
        a6 =  S( FUNCTOR_completed_2 , m.mkvar3(), m.mkvar3());
 ;
        return //
 Op("recorded_listing", FILE_dra::PRED_recorded_listing_1_static_exec, VA(a1), //
 Op("recorded_listing", FILE_dra::PRED_recorded_listing_1_static_exec, VA(a2), //
 Op("recorded_listing", FILE_dra::PRED_recorded_listing_1_static_exec, VA(a3), //
 Op("recorded_listing", FILE_dra::PRED_recorded_listing_1_static_exec, VA(a4), //
 Op("recorded_listing", FILE_dra::PRED_recorded_listing_1_static_exec, VA(a5), //
 Op("recorded_listing", FILE_dra::PRED_recorded_listing_1_static_exec, VA(a6), cont))))));
    }
/** PREDICATE: $dummy_54_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_54_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_54_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_54_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_54_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_54_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_54_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_54_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_54_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-current_predicate(B,A),!,listing(A)
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_54_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),current_predicate(B,A),'$cut'(C),listing(A)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("current_predicate", FILE_dra::PRED_current_predicate_2_static_exec, VA(a2, a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("listing", FILE_dra::PRED_listing_1_static_exec, VA(a1), cont)));
    }

    private final static Operation $dummy_54_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_54_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_54_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: recorded_listing/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(recorded_listing/1,non-(public))
        final static Functor FUNCTOR_recorded_2 = F("recorded",2);




    public static Operation PRED_recorded_listing_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // recorded_listing(A):-'$dummy_54_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),forall(recorded(A,C),dra_wln((A->C))),forall(recorded(C,A),dra_wln((C->A))),!
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3;
        a1 = LARG[0];
    // recorded_listing(A):-['$get_level'(B),'$dummy_54_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,C),forall(recorded(A,D),dra_wln((A->D))),forall(recorded(D,A),dra_wln((D->A))),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
    // put_str_args([a(1),a(3)],y(1)),put_str(@('FUNCTOR_recorded_2'),y(1),a(4))
        a4 =  S( FUNCTOR_recorded_2 , a1, a3);
 ;
    // put_str_args([a(1),a(3)],y(2)),put_str(@('FUNCTOR_$002D$003E_2'),y(2),a(5))
        a5 =  S( FUNCTOR_$002D$003E_2 , a1, a3);
 ;
    // put_str_args([a(5)],y(3)),put_str(@('FUNCTOR_dra_wln_1'),y(3),a(6))
        a6 =  S( FUNCTOR_dra_wln_1 , a5);
 ;
    // put_str_args([a(3),a(1)],y(4)),put_str(@('FUNCTOR_recorded_2'),y(4),a(7))
        a7 =  S( FUNCTOR_recorded_2 , a3, a1);
 ;
    // put_str_args([a(3),a(1)],y(5)),put_str(@('FUNCTOR_$002D$003E_2'),y(5),a(8))
        a8 =  S( FUNCTOR_$002D$003E_2 , a3, a1);
 ;
    // put_str_args([a(8)],y(6)),put_str(@('FUNCTOR_dra_wln_1'),y(6),a(9))
        a9 =  S( FUNCTOR_dra_wln_1 , a8);
 ;
        return //
 Op("$dummy_54_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_54_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, m.DONT_CARE2()), //
 Op("forall", FILE_dra::PRED_forall_2_static_exec, VA(a4, a6), //
 Op("forall", FILE_dra::PRED_forall_2_static_exec, VA(a7, a9), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), cont))));
    }
/** PREDICATE: reinitialise_answer/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(reinitialise_answer/0,non-(public))
        final static Functor FUNCTOR_tabling_store_1 = F("tabling_store",1);
        final static Functor ATOM_assert = SYM("assert");
    private static final Compound L_reinitialise_answer_0_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_reinitialise_answer_0_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_reinitialise_answer_0_s6);
        final static Functor ATOM_answer_key = SYM("answer_key");




    public static Operation PRED_reinitialise_answer_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry0(null, FILE_dra::reinitialise_answer_0_sub_1);
        return reinitialise_answer_0_1(m);
    }

    private final static Operation reinitialise_answer_0_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::reinitialise_answer_0_sub_2);
        return reinitialise_answer_0_2(m);
    }

    private final static Operation reinitialise_answer_0_sub_2(Prolog m) { 
        m.trust(null);
        return reinitialise_answer_0_3(m);
    }

    private final static Operation reinitialise_answer_0_1(Prolog m) { 
    // reinitialise_answer:-tabling_store(assert),!,retractall(answer(A,B,C))
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        cont = m.cont;
    // reinitialise_answer:-['$get_level'(A),call('$dra':tabling_store(assert)),'$cut'(A),retractall('$dra':answer(B,C,D))]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void,void,void],y(1)),put_str(@('FUNCTOR_answer_3'),y(1),a(2))
        a2 =  S( FUNCTOR_answer_3 , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a2);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_reinitialise_answer_0_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a1), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a3), cont)));
    }

    private final static Operation reinitialise_answer_0_2(Prolog m) { 
    // reinitialise_answer:-recorded(answer_key,A,B),erase(B),recorded(A,answer(C,D,E),F),erase(F),fail
         Term a1, a2, a3, a4;
        Operation p1, p2, p3, p4;
        Operation cont;
        cont = m.cont;
    // reinitialise_answer:-[recorded(answer_key,A,B),erase(B),recorded(A,answer(C,D,E),F),erase(F),fail]
        a1 = m.mkvar1();
        a2 = m.mkvar1();
    // put_str_args([void,void,void],y(1)),put_str(@('FUNCTOR_answer_3'),y(1),a(3))
        a3 =  S( FUNCTOR_answer_3 , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
        a4 = m.mkvar1();
        return //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA( ATOM_answer_key , a1, a2), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a2), //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA(a1, a3, a4), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a4), fail_0))));
    }

    private final static Operation reinitialise_answer_0_3(Prolog m) { 
    // reinitialise_answer:-true
        Operation cont;
        cont = m.cont;
    // reinitialise_answer:-[]
        return cont;
    }
/** PREDICATE: is_answer_known/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(is_answer_known/2,non-(public))
    private static final Compound L_is_answer_known_2_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_is_answer_known_2_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_is_answer_known_2_s6);




    public static Operation PRED_is_answer_known_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::is_answer_known_2_sub_1);
        return is_answer_known_2_1(m);
    }

    private final static Operation is_answer_known_2_sub_1(Prolog m) { 
        m.trust(null);
        return is_answer_known_2_2(m);
    }

    private final static Operation is_answer_known_2_1(Prolog m) { 
    // is_answer_known(A,B):-tabling_store(assert),!,copy_term(A,C),once(essence_hook(C,D)),answer(D,E,F),are_essences_variants(E,A),are_essences_variants(F,B),!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // is_answer_known(A,B):-['$get_level'(C),call('$dra':tabling_store(assert)),'$cut'(C),copy_term(A,D),once('$dra':essence_hook(D,E)),call('$dra':answer(E,F,G)),are_essences_variants(F,A),are_essences_variants(G,B),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(6))
        a6 =  S( FUNCTOR_essence_hook_2 , a4, a5);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a6);
 ;
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([a(5),a(8),a(9)],y(3)),put_str(@('FUNCTOR_answer_3'),y(3),a(10))
        a10 =  S( FUNCTOR_answer_3 , a5, a8, a9);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(10)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(11))
        a11 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a10);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_is_answer_known_2_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a1, a4), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a7), //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a11), //
 Op("are_essences_variants", FILE_dra::PRED_are_essences_variants_2_static_exec, VA(a8, a1), //
 Op("are_essences_variants", FILE_dra::PRED_are_essences_variants_2_static_exec, VA(a9, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont))))))));
    }

    private final static Operation is_answer_known_2_2(Prolog m) { 
    // is_answer_known(A,B):-copy_term(A,C),once(essence_hook(C,D)),recorded(A,answer(D,E,F)),are_essences_variants(E,A),are_essences_variants(F,B),!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // is_answer_known(A,B):-['$get_level'(C),copy_term(A,D),once('$dra':essence_hook(D,E)),recorded(A,answer(E,F,G)),are_essences_variants(F,A),are_essences_variants(G,B),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        //START inline expansion of copy_term(a(1),a(4))
        a1 = a1.dref();
        if (! a4.unify(m.copy(a1), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(6))
        a6 =  S( FUNCTOR_essence_hook_2 , a4, a5);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a6);
 ;
        a8 = m.mkvar1();
        a9 = m.mkvar1();
    // put_str_args([a(5),a(8),a(9)],y(3)),put_str(@('FUNCTOR_answer_3'),y(3),a(10))
        a10 =  S( FUNCTOR_answer_3 , a5, a8, a9);
 ;
        return //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a7), //
 Op("recorded", FILE_dra::PRED_recorded_2_static_exec, VA(a1, a10), //
 Op("are_essences_variants", FILE_dra::PRED_are_essences_variants_2_static_exec, VA(a8, a1), //
 Op("are_essences_variants", FILE_dra::PRED_are_essences_variants_2_static_exec, VA(a9, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont)))));
    }
/** PREDICATE: memo/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(memo/3,non-(public))
    private static final Compound L_memo_3_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_memo_3_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_memo_3_s6);
        final static Functor ATOM_Storing$0020answer$003A$0020 = SYM("Storing answer: ");




    public static Operation PRED_memo_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_dra::memo_3_sub_1);
        return memo_3_1(m);
    }

    private final static Operation memo_3_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::memo_3_sub_2);
        return memo_3_2(m);
    }

    private final static Operation memo_3_sub_2(Prolog m) { 
        m.trust(null);
        return memo_3_3(m);
    }

    private final static Operation memo_3_1(Prolog m) { 
    // memo(A,B,C):-is_answer_known(A,B),!
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // memo(A,B,C):-['$get_level'(D),is_answer_known(A,B),'$cut'(D)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_answer_known", FILE_dra::PRED_is_answer_known_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a4), cont));
    }

    private final static Operation memo_3_2(Prolog m) { 
    // memo(A,B,C):-tabling_store(assert),!,optional_trace('Storing answer: ',A,B,C),copy_term(A,D),once(essence_hook(D,E)),assert(answer(E,A,B)),dra_incval_flag(number_of_answers)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // memo(A,B,C):-['$get_level'(D),call('$dra':tabling_store(assert)),'$cut'(D),optional_trace('Storing answer: ',A,B,C),copy_term(A,E),once('$dra':essence_hook(E,F)),assert('$dra':answer(F,A,B)),dra_incval_flag(number_of_answers)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        a6 = m.mkvar1();
    // put_str_args([a(5),a(6)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(7))
        a7 =  S( FUNCTOR_essence_hook_2 , a5, a6);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(7)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(8))
        a8 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a7);
 ;
    // put_str_args([a(6),a(1),a(2)],y(3)),put_str(@('FUNCTOR_answer_3'),y(3),a(9))
        a9 =  S( FUNCTOR_answer_3 , a6, a1, a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(9)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(10))
        a10 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a9);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_memo_3_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a4), //
 Op("optional_trace", FILE_dra::PRED_optional_trace_4_static_exec, VA( ATOM_Storing$0020answer$003A$0020 , a1, a2, a3), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a1, a5), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a8), //
 Op("assert", FILE_dra::PRED_assert_1_static_exec, VA(a10), //
 Op("dra_incval_flag", FILE_dra::PRED_dra_incval_flag_1_static_exec, VA( ATOM_number_of_answers ), cont)))))));
    }

    private final static Operation memo_3_3(Prolog m) { 
    // memo(A,B,C):-optional_trace('Storing answer: ',A,B,C),copy_term(A,D),once(essence_hook(D,E)),recordz(A,answer(E,A,B)),most_general_instance(A,F),ensure_recorded(answer_key,F),dra_incval_flag(number_of_answers)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // memo(A,B,C):-[optional_trace('Storing answer: ',A,B,C),copy_term(A,D),once('$dra':essence_hook(D,E)),recordz(A,answer(E,A,B)),most_general_instance(A,F),ensure_recorded(answer_key,F),dra_incval_flag(number_of_answers)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(6))
        a6 =  S( FUNCTOR_essence_hook_2 , a4, a5);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a6);
 ;
    // put_str_args([a(5),a(1),a(2)],y(3)),put_str(@('FUNCTOR_answer_3'),y(3),a(8))
        a8 =  S( FUNCTOR_answer_3 , a5, a1, a2);
 ;
        a9 = m.mkvar1();
        return //
 Op("optional_trace", FILE_dra::PRED_optional_trace_4_static_exec, VA( ATOM_Storing$0020answer$003A$0020 , a1, a2, a3), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a1, a4), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a7), //
 Op("recordz", FILE_dra::PRED_recordz_2_static_exec, VA(a1, a8), //
 Op("most_general_instance", FILE_dra::PRED_most_general_instance_2_static_exec, VA(a1, a9), //
 Op("ensure_recorded", FILE_dra::PRED_ensure_recorded_2_static_exec, VA( ATOM_answer_key , a9), //
 Op("dra_incval_flag", FILE_dra::PRED_dra_incval_flag_1_static_exec, VA( ATOM_number_of_answers ), cont)))))));
    }
/** PREDICATE: most_general_instance/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(most_general_instance/2,non-(public))




    public static Operation PRED_most_general_instance_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // most_general_instance(A,B):-functor(A,C,D),functor(B,C,D)
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // most_general_instance(A,B):-[functor(A,C,D),functor(B,C,D)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        return //
 Op("functor", FILE_dra::PRED_functor_3_static_exec, VA(a1, a3, a4), //
 Op("functor", FILE_dra::PRED_functor_3_static_exec, VA(a2, a3, a4), cont));
    }
/** PREDICATE: get_answer/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(get_answer/1,non-(public))
    private static final Compound L_get_answer_1_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_get_answer_1_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_get_answer_1_s6);




    public static Operation PRED_get_answer_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::get_answer_1_sub_1);
        return get_answer_1_1(m);
    }

    private final static Operation get_answer_1_sub_1(Prolog m) { 
        m.trust(null);
        return get_answer_1_2(m);
    }

    private final static Operation get_answer_1_1(Prolog m) { 
    // get_answer(A):-tabling_store(assert),!,once(essence_hook(A,B)),copy_term(A,C),once(essence_hook(C,D)),answer(D,E,F),once(essence_hook(E,G)),are_variants(B,G),B=G,once(essence_hook(F,H)),B=H
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // get_answer(A):-['$get_level'(B),call('$dra':tabling_store(assert)),'$cut'(B),once('$dra':essence_hook(A,C)),copy_term(A,D),once('$dra':essence_hook(D,E)),call('$dra':answer(E,F,G)),once('$dra':essence_hook(F,H)),are_variants(C,H),'$unify'(C,H),once('$dra':essence_hook(G,I)),'$unify'(C,I)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
    // put_str_args([a(1),a(3)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(4))
        a4 =  S( FUNCTOR_essence_hook_2 , a1, a3);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a4);
 ;
        a6 = m.mkvar1();
        a7 = m.mkvar1();
    // put_str_args([a(6),a(7)],y(3)),put_str(@('FUNCTOR_essence_hook_2'),y(3),a(8))
        a8 =  S( FUNCTOR_essence_hook_2 , a6, a7);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(8)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a8);
 ;
        a10 = m.mkvar1();
        a11 = m.mkvar1();
    // put_str_args([a(7),a(10),a(11)],y(5)),put_str(@('FUNCTOR_answer_3'),y(5),a(12))
        a12 =  S( FUNCTOR_answer_3 , a7, a10, a11);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(12)],y(6)),put_str(@('FUNCTOR_module_colon_2'),y(6),a(13))
        a13 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a12);
 ;
        a14 = m.mkvar1();
    // put_str_args([a(10),a(14)],y(7)),put_str(@('FUNCTOR_essence_hook_2'),y(7),a(15))
        a15 =  S( FUNCTOR_essence_hook_2 , a10, a14);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(15)],y(8)),put_str(@('FUNCTOR_module_colon_2'),y(8),a(16))
        a16 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a15);
 ;
        a17 = m.mkvar1();
    // put_str_args([a(11),a(17)],y(9)),put_str(@('FUNCTOR_essence_hook_2'),y(9),a(18))
        a18 =  S( FUNCTOR_essence_hook_2 , a11, a17);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(18)],y(10)),put_str(@('FUNCTOR_module_colon_2'),y(10),a(19))
        a19 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a18);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_get_answer_1_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a5), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a1, a6), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a9), //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a13), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a16), //
 Op("are_variants", FILE_dra::PRED_are_variants_2_static_exec, VA(a3, a14), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a3, a14), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a19), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a3, a17), cont)))))))))));
    }

    private final static Operation get_answer_1_2(Prolog m) { 
    // get_answer(A):-copy_term(A,B),once(essence_hook(B,C)),once(essence_hook(A,D)),recorded(A,answer(C,E,F)),once(essence_hook(E,G)),are_variants(D,G),D=G,once(essence_hook(F,H)),D=H
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // get_answer(A):-[copy_term(A,B),once('$dra':essence_hook(B,C)),once('$dra':essence_hook(A,D)),recorded(A,answer(C,E,F)),once('$dra':essence_hook(E,G)),are_variants(D,G),'$unify'(D,G),once('$dra':essence_hook(F,H)),'$unify'(D,H)]
        a2 = m.mkvar1();
        //START inline expansion of copy_term(a(1),a(2))
        a1 = a1.dref();
        if (! a2.unify(m.copy(a1), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(4))
        a4 =  S( FUNCTOR_essence_hook_2 , a2, a3);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a4);
 ;
        a6 = m.mkvar1();
    // put_str_args([a(1),a(6)],y(3)),put_str(@('FUNCTOR_essence_hook_2'),y(3),a(7))
        a7 =  S( FUNCTOR_essence_hook_2 , a1, a6);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(7)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(8))
        a8 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a7);
 ;
        a9 = m.mkvar1();
        a10 = m.mkvar1();
    // put_str_args([a(3),a(9),a(10)],y(5)),put_str(@('FUNCTOR_answer_3'),y(5),a(11))
        a11 =  S( FUNCTOR_answer_3 , a3, a9, a10);
 ;
        a12 = m.mkvar1();
    // put_str_args([a(9),a(12)],y(6)),put_str(@('FUNCTOR_essence_hook_2'),y(6),a(13))
        a13 =  S( FUNCTOR_essence_hook_2 , a9, a12);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(13)],y(7)),put_str(@('FUNCTOR_module_colon_2'),y(7),a(14))
        a14 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a13);
 ;
        a15 = m.mkvar1();
    // put_str_args([a(10),a(15)],y(8)),put_str(@('FUNCTOR_essence_hook_2'),y(8),a(16))
        a16 =  S( FUNCTOR_essence_hook_2 , a10, a15);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(16)],y(9)),put_str(@('FUNCTOR_module_colon_2'),y(9),a(17))
        a17 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a16);
 ;
        return //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a5), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a8), //
 Op("recorded", FILE_dra::PRED_recorded_2_static_exec, VA(a1, a11), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a14), //
 Op("are_variants", FILE_dra::PRED_are_variants_2_static_exec, VA(a6, a12), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a6, a12), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a17), //
 Op("$unify", FILE_dra::PRED_$unify_2_static_exec, VA(a6, a15), cont))))))));
    }
/** PREDICATE: get_all_tabled_goals/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(get_all_tabled_goals/1,public)
    private static final Compound L_get_all_tabled_goals_1_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_get_all_tabled_goals_1_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_get_all_tabled_goals_1_s6);




    public static Operation PRED_get_all_tabled_goals_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::get_all_tabled_goals_1_sub_1);
        return get_all_tabled_goals_1_1(m);
    }

    private final static Operation get_all_tabled_goals_1_sub_1(Prolog m) { 
        m.trust(null);
        return get_all_tabled_goals_1_2(m);
    }

    private final static Operation get_all_tabled_goals_1_1(Prolog m) { 
    // get_all_tabled_goals(A):-tabling_store(assert),!,findall(B,answer(C,B,D),A)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // get_all_tabled_goals(A):-['$get_level'(B),call('$dra':tabling_store(assert)),'$cut'(B),findall(C,'$dra':answer(D,C,E),A)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
    // put_str_args([void,a(3),void],y(1)),put_str(@('FUNCTOR_answer_3'),y(1),a(4))
        a4 =  S( FUNCTOR_answer_3 , m.mkvar3(), a3, m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a4);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_get_all_tabled_goals_1_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), //
 Op("findall", FILE_dra::PRED_findall_3_static_exec, VA(a3, a5, a1), cont)));
    }

    private final static Operation get_all_tabled_goals_1_2(Prolog m) { 
    // get_all_tabled_goals(A):-findall(B,(recorded(answer_key,C),recorded(C,answer(D,B,E))),A)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // get_all_tabled_goals(A):-[findall(B,'$dra':(recorded(answer_key,C),recorded(C,answer(D,B,E))),A)]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
    // put_str_args([@('ATOM_answer_key'),a(3)],y(1)),put_str(@('FUNCTOR_recorded_2'),y(1),a(4))
        a4 =  S( FUNCTOR_recorded_2 ,  ATOM_answer_key , a3);
 ;
    // put_str_args([void,a(2),void],y(2)),put_str(@('FUNCTOR_answer_3'),y(2),a(5))
        a5 =  S( FUNCTOR_answer_3 , m.mkvar3(), a2, m.mkvar3());
 ;
    // put_str_args([a(3),a(5)],y(3)),put_str(@('FUNCTOR_recorded_2'),y(3),a(6))
        a6 =  S( FUNCTOR_recorded_2 , a3, a5);
 ;
        a7 = Closure( //
 Op(",", FILE_dra::PRED_$002C_2_static_exec, VA(a4, a6), null));
        return //
 Op("findall", FILE_dra::PRED_findall_3_static_exec, VA(a2, a7, a1), cont);
    }
/** PREDICATE: reinitialise_result/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(reinitialise_result/0,non-(public))
    private static final Compound L_reinitialise_result_0_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_reinitialise_result_0_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_reinitialise_result_0_s6);
        final static Functor ATOM_result_key = SYM("result_key");
        final static Functor FUNCTOR_result_1 = F("result",1);




    public static Operation PRED_reinitialise_result_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry0(null, FILE_dra::reinitialise_result_0_sub_1);
        return reinitialise_result_0_1(m);
    }

    private final static Operation reinitialise_result_0_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::reinitialise_result_0_sub_2);
        return reinitialise_result_0_2(m);
    }

    private final static Operation reinitialise_result_0_sub_2(Prolog m) { 
        m.trust(null);
        return reinitialise_result_0_3(m);
    }

    private final static Operation reinitialise_result_0_1(Prolog m) { 
    // reinitialise_result:-tabling_store(assert),!,retractall(result(A,B))
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        cont = m.cont;
    // reinitialise_result:-['$get_level'(A),call('$dra':tabling_store(assert)),'$cut'(A),retractall('$dra':result(B,C))]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void,void],y(1)),put_str(@('FUNCTOR_result_2'),y(1),a(2))
        a2 =  S( FUNCTOR_result_2 , m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a2);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_reinitialise_result_0_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a1), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a3), cont)));
    }

    private final static Operation reinitialise_result_0_2(Prolog m) { 
    // reinitialise_result:-recorded(result_key,A,B),erase(B),recorded(A,result(C),D),erase(D),fail
         Term a1, a2, a3, a4;
        Operation p1, p2, p3, p4;
        Operation cont;
        cont = m.cont;
    // reinitialise_result:-[recorded(result_key,A,B),erase(B),recorded(A,result(C),D),erase(D),fail]
        a1 = m.mkvar1();
        a2 = m.mkvar1();
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_result_1'),y(1),a(3))
        a3 =  S( FUNCTOR_result_1 , m.mkvar3());
 ;
        a4 = m.mkvar1();
        return //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA( ATOM_result_key , a1, a2), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a2), //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA(a1, a3, a4), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a4), fail_0))));
    }

    private final static Operation reinitialise_result_0_3(Prolog m) { 
    // reinitialise_result:-true
        Operation cont;
        cont = m.cont;
    // reinitialise_result:-[]
        return cont;
    }
/** PREDICATE: is_result_known/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(is_result_known/2,non-(public))
    private static final Compound L_is_result_known_2_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_is_result_known_2_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_is_result_known_2_s6);




    public static Operation PRED_is_result_known_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::is_result_known_2_sub_1);
        return is_result_known_2_1(m);
    }

    private final static Operation is_result_known_2_sub_1(Prolog m) { 
        m.trust(null);
        return is_result_known_2_2(m);
    }

    private final static Operation is_result_known_2_1(Prolog m) { 
    // is_result_known(A,B):-tabling_store(assert),!,result(A,C),are_essences_variants(C,B),!
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // is_result_known(A,B):-['$get_level'(C),call('$dra':tabling_store(assert)),'$cut'(C),call('$dra':result(A,D)),are_essences_variants(D,B),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
    // put_str_args([a(1),a(4)],y(1)),put_str(@('FUNCTOR_result_2'),y(1),a(5))
        a5 =  S( FUNCTOR_result_2 , a1, a4);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_is_result_known_2_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a6), //
 Op("are_essences_variants", FILE_dra::PRED_are_essences_variants_2_static_exec, VA(a4, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont)))));
    }

    private final static Operation is_result_known_2_2(Prolog m) { 
    // is_result_known(A,B):-recorded(A,result(C)),are_essences_variants(C,B),!
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // is_result_known(A,B):-['$get_level'(C),recorded(A,result(D)),are_essences_variants(D,B),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
    // put_str_args([a(4)],y(1)),put_str(@('FUNCTOR_result_1'),y(1),a(5))
        a5 =  S( FUNCTOR_result_1 , a4);
 ;
        return //
 Op("recorded", FILE_dra::PRED_recorded_2_static_exec, VA(a1, a5), //
 Op("are_essences_variants", FILE_dra::PRED_are_essences_variants_2_static_exec, VA(a4, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont)));
    }
/** PREDICATE: $dummy_55_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_55_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_55_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_55_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_55_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_55_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_55_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_55_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_55_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-is_result_known(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_55_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),is_result_known(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_result_known", FILE_dra::PRED_is_result_known_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_55_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_55_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_55_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: new_result_or_fail/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(new_result_or_fail/2,non-(public))
    private static final Compound L_new_result_or_fail_2_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_new_result_or_fail_2_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_new_result_or_fail_2_s6);




    public static Operation PRED_new_result_or_fail_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::new_result_or_fail_2_sub_1);
        return new_result_or_fail_2_1(m);
    }

    private final static Operation new_result_or_fail_2_sub_1(Prolog m) { 
        m.trust(null);
        return new_result_or_fail_2_2(m);
    }

    private final static Operation new_result_or_fail_2_1(Prolog m) { 
    // new_result_or_fail(A,B):-tabling_store(assert),!,'$dummy_55_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),assert(result(A,B))
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // new_result_or_fail(A,B):-['$get_level'(C),call('$dra':tabling_store(assert)),'$cut'(C),'$dummy_55_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),assert('$dra':result(A,B))]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_result_2'),y(1),a(4))
        a4 =  S( FUNCTOR_result_2 , a1, a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a4);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_new_result_or_fail_2_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("$dummy_55_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_55_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a2), //
 Op("assert", FILE_dra::PRED_assert_1_static_exec, VA(a5), cont))));
    }

    private final static Operation new_result_or_fail_2_2(Prolog m) { 
    // new_result_or_fail(A,B):-'$dummy_56_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),recordz(A,result(B)),ensure_recorded(result_key,A)
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // new_result_or_fail(A,B):-['$dummy_56_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B),recordz(A,result(B)),ensure_recorded(result_key,A)]
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_result_1'),y(1),a(3))
        a3 =  S( FUNCTOR_result_1 , a2);
 ;
        return //
 Op("$dummy_56_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_56_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec, VA(a1, a2), //
 Op("recordz", FILE_dra::PRED_recordz_2_static_exec, VA(a1, a3), //
 Op("ensure_recorded", FILE_dra::PRED_ensure_recorded_2_static_exec, VA( ATOM_result_key , a1), cont)));
    }
/** PREDICATE: $dummy_56_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_56_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/2,non-(public))




    public static Operation PRED_$dummy_56_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::$dummy_56_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1);
        return $dummy_56_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(m);
    }

    private final static Operation $dummy_56_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_56_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(m);
    }

    private final static Operation $dummy_56_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_1(Prolog m) { 
    // '$dummy_56_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-is_result_known(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_56_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-['$get_level'(C),is_result_known(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_result_known", FILE_dra::PRED_is_result_known_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_56_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_2(Prolog m) { 
    // '$dummy_56_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_56_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: reinitialise_pioneer/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(reinitialise_pioneer/0,non-(public))
    private static final Compound L_reinitialise_pioneer_0_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_reinitialise_pioneer_0_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_reinitialise_pioneer_0_s6);
        final static Functor ATOM_pioneer_key = SYM("pioneer_key");




    public static Operation PRED_reinitialise_pioneer_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry0(null, FILE_dra::reinitialise_pioneer_0_sub_1);
        return reinitialise_pioneer_0_1(m);
    }

    private final static Operation reinitialise_pioneer_0_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::reinitialise_pioneer_0_sub_2);
        return reinitialise_pioneer_0_2(m);
    }

    private final static Operation reinitialise_pioneer_0_sub_2(Prolog m) { 
        m.trust(null);
        return reinitialise_pioneer_0_3(m);
    }

    private final static Operation reinitialise_pioneer_0_1(Prolog m) { 
    // reinitialise_pioneer:-tabling_store(assert),!,retractall(pioneer(A,B,C))
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        cont = m.cont;
    // reinitialise_pioneer:-['$get_level'(A),call('$dra':tabling_store(assert)),'$cut'(A),retractall('$dra':pioneer(B,C,D))]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void,void,void],y(1)),put_str(@('FUNCTOR_pioneer_3'),y(1),a(2))
        a2 =  S( FUNCTOR_pioneer_3 , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a2);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_reinitialise_pioneer_0_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a1), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a3), cont)));
    }

    private final static Operation reinitialise_pioneer_0_2(Prolog m) { 
    // reinitialise_pioneer:-recorded(pioneer_key,A,B),erase(B),recorded(A,pioneer(C,D,E),F),erase(F),fail
         Term a1, a2, a3, a4;
        Operation p1, p2, p3, p4;
        Operation cont;
        cont = m.cont;
    // reinitialise_pioneer:-[recorded(pioneer_key,A,B),erase(B),recorded(A,pioneer(C,D,E),F),erase(F),fail]
        a1 = m.mkvar1();
        a2 = m.mkvar1();
    // put_str_args([void,void,void],y(1)),put_str(@('FUNCTOR_pioneer_3'),y(1),a(3))
        a3 =  S( FUNCTOR_pioneer_3 , m.mkvar3(), m.mkvar3(), m.mkvar3());
 ;
        a4 = m.mkvar1();
        return //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA( ATOM_pioneer_key , a1, a2), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a2), //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA(a1, a3, a4), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a4), fail_0))));
    }

    private final static Operation reinitialise_pioneer_0_3(Prolog m) { 
    // reinitialise_pioneer:-true
        Operation cont;
        cont = m.cont;
    // reinitialise_pioneer:-[]
        return cont;
    }
/** PREDICATE: is_a_variant_of_a_pioneer/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(is_a_variant_of_a_pioneer/2,non-(public))
    private static final Compound L_is_a_variant_of_a_pioneer_2_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_is_a_variant_of_a_pioneer_2_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_is_a_variant_of_a_pioneer_2_s6);




    public static Operation PRED_is_a_variant_of_a_pioneer_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::is_a_variant_of_a_pioneer_2_sub_1);
        return is_a_variant_of_a_pioneer_2_1(m);
    }

    private final static Operation is_a_variant_of_a_pioneer_2_sub_1(Prolog m) { 
        m.trust(null);
        return is_a_variant_of_a_pioneer_2_2(m);
    }

    private final static Operation is_a_variant_of_a_pioneer_2_1(Prolog m) { 
    // is_a_variant_of_a_pioneer(A,B):-tabling_store(assert),!,copy_term(A,C),once(essence_hook(C,D)),pioneer(D,E,B),are_essences_variants(A,E),!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // is_a_variant_of_a_pioneer(A,B):-['$get_level'(C),call('$dra':tabling_store(assert)),'$cut'(C),copy_term(A,D),once('$dra':essence_hook(D,E)),call('$dra':pioneer(E,F,B)),are_essences_variants(A,F),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(6))
        a6 =  S( FUNCTOR_essence_hook_2 , a4, a5);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a6);
 ;
        a8 = m.mkvar1();
    // put_str_args([a(5),a(8),a(2)],y(3)),put_str(@('FUNCTOR_pioneer_3'),y(3),a(9))
        a9 =  S( FUNCTOR_pioneer_3 , a5, a8, a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(9)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(10))
        a10 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a9);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_is_a_variant_of_a_pioneer_2_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a1, a4), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a7), //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a10), //
 Op("are_essences_variants", FILE_dra::PRED_are_essences_variants_2_static_exec, VA(a1, a8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont)))))));
    }

    private final static Operation is_a_variant_of_a_pioneer_2_2(Prolog m) { 
    // is_a_variant_of_a_pioneer(A,B):-copy_term(A,C),once(essence_hook(C,D)),recorded(A,pioneer(D,E,B)),are_essences_variants(A,E),!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // is_a_variant_of_a_pioneer(A,B):-['$get_level'(C),copy_term(A,D),once('$dra':essence_hook(D,E)),recorded(A,pioneer(E,F,B)),are_essences_variants(A,F),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        //START inline expansion of copy_term(a(1),a(4))
        a1 = a1.dref();
        if (! a4.unify(m.copy(a1), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(6))
        a6 =  S( FUNCTOR_essence_hook_2 , a4, a5);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a6);
 ;
        a8 = m.mkvar1();
    // put_str_args([a(5),a(8),a(2)],y(3)),put_str(@('FUNCTOR_pioneer_3'),y(3),a(9))
        a9 =  S( FUNCTOR_pioneer_3 , a5, a8, a2);
 ;
        return //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a7), //
 Op("recorded", FILE_dra::PRED_recorded_2_static_exec, VA(a1, a9), //
 Op("are_essences_variants", FILE_dra::PRED_are_essences_variants_2_static_exec, VA(a1, a8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont))));
    }
/** PREDICATE: add_pioneer/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(add_pioneer/2,non-(public))
    private static final Compound L_add_pioneer_2_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_add_pioneer_2_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_add_pioneer_2_s6);
        final static Functor FUNCTOR_pioneer_goal_1 = F("pioneer_goal",1);




    public static Operation PRED_add_pioneer_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::add_pioneer_2_sub_1);
        return add_pioneer_2_1(m);
    }

    private final static Operation add_pioneer_2_sub_1(Prolog m) { 
        m.trust(null);
        return add_pioneer_2_2(m);
    }

    private final static Operation add_pioneer_2_1(Prolog m) { 
    // add_pioneer(A,B):-tabling_store(assert),!,copy_term(A,C),once(essence_hook(C,D)),get_unique_index(B),assert(pioneer(D,A,B))
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_pioneer(A,B):-['$get_level'(C),call('$dra':tabling_store(assert)),'$cut'(C),copy_term(A,D),once('$dra':essence_hook(D,E)),get_unique_index(B),assert('$dra':pioneer(E,A,B))]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(6))
        a6 =  S( FUNCTOR_essence_hook_2 , a4, a5);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a6);
 ;
    // put_str_args([a(5),a(1),a(2)],y(3)),put_str(@('FUNCTOR_pioneer_3'),y(3),a(8))
        a8 =  S( FUNCTOR_pioneer_3 , a5, a1, a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(8)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a8);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_add_pioneer_2_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a1, a4), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a7), //
 Op("get_unique_index", FILE_dra::PRED_get_unique_index_1_static_exec, VA(a2), //
 Op("assert", FILE_dra::PRED_assert_1_static_exec, VA(a9), cont))))));
    }

    private final static Operation add_pioneer_2_2(Prolog m) { 
    // add_pioneer(A,B):-get_unique_index(B),copy_term(A,C),once(essence_hook(C,D)),recordz(A,pioneer(D,A,B)),most_general_instance(A,E),ensure_recorded(pioneer_key,E),recordz(B,pioneer_goal(E))
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4, p5, p6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_pioneer(A,B):-[get_unique_index(B),copy_term(A,C),once('$dra':essence_hook(C,D)),recordz(A,pioneer(D,A,B)),most_general_instance(A,E),ensure_recorded(pioneer_key,E),recordz(B,pioneer_goal(E))]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(5))
        a5 =  S( FUNCTOR_essence_hook_2 , a3, a4);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
    // put_str_args([a(4),a(1),a(2)],y(3)),put_str(@('FUNCTOR_pioneer_3'),y(3),a(7))
        a7 =  S( FUNCTOR_pioneer_3 , a4, a1, a2);
 ;
        a8 = m.mkvar1();
    // put_str_args([a(8)],y(4)),put_str(@('FUNCTOR_pioneer_goal_1'),y(4),a(9))
        a9 =  S( FUNCTOR_pioneer_goal_1 , a8);
 ;
        return //
 Op("get_unique_index", FILE_dra::PRED_get_unique_index_1_static_exec, VA(a2), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a1, a3), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a6), //
 Op("recordz", FILE_dra::PRED_recordz_2_static_exec, VA(a1, a7), //
 Op("most_general_instance", FILE_dra::PRED_most_general_instance_2_static_exec, VA(a1, a8), //
 Op("ensure_recorded", FILE_dra::PRED_ensure_recorded_2_static_exec, VA( ATOM_pioneer_key , a8), //
 Op("recordz", FILE_dra::PRED_recordz_2_static_exec, VA(a2, a9), cont)))))));
    }
/** PREDICATE: delete_pioneer/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(delete_pioneer/1,non-(public))
    private static final Compound L_delete_pioneer_1_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_delete_pioneer_1_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_delete_pioneer_1_s6);




    public static Operation PRED_delete_pioneer_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::delete_pioneer_1_sub_1);
        return delete_pioneer_1_1(m);
    }

    private final static Operation delete_pioneer_1_sub_1(Prolog m) { 
        m.trust(null);
        return delete_pioneer_1_2(m);
    }

    private final static Operation delete_pioneer_1_1(Prolog m) { 
    // delete_pioneer(A):-tabling_store(assert),!,retract(pioneer(B,C,A))
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // delete_pioneer(A):-['$get_level'(B),call('$dra':tabling_store(assert)),'$cut'(B),retract('$dra':pioneer(C,D,A))]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void,void,a(1)],y(1)),put_str(@('FUNCTOR_pioneer_3'),y(1),a(3))
        a3 =  S( FUNCTOR_pioneer_3 , m.mkvar3(), m.mkvar3(), a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a3);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_delete_pioneer_1_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), //
 Op("retract", FILE_dra::PRED_retract_1_static_exec, VA(a4), cont)));
    }

    private final static Operation delete_pioneer_1_2(Prolog m) { 
    // delete_pioneer(A):-recorded(A,pioneer_goal(B),C),erase(C),recorded(B,pioneer(D,E,A),F),erase(F)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // delete_pioneer(A):-[recorded(A,pioneer_goal(B),C),erase(C),recorded(B,pioneer(D,E,A),F),erase(F)]
        a2 = m.mkvar1();
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_pioneer_goal_1'),y(1),a(3))
        a3 =  S( FUNCTOR_pioneer_goal_1 , a2);
 ;
        a4 = m.mkvar1();
    // put_str_args([void,void,a(1)],y(2)),put_str(@('FUNCTOR_pioneer_3'),y(2),a(5))
        a5 =  S( FUNCTOR_pioneer_3 , m.mkvar3(), m.mkvar3(), a1);
 ;
        a6 = m.mkvar1();
        return //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA(a1, a3, a4), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a4), //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA(a2, a5, a6), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a6), cont))));
    }
/** PREDICATE: reinitialise_loop/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(reinitialise_loop/0,non-(public))
    private static final Compound L_reinitialise_loop_0_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_reinitialise_loop_0_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_reinitialise_loop_0_s6);
        final static Functor ATOM_loop_key = SYM("loop_key");




    public static Operation PRED_reinitialise_loop_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry0(null, FILE_dra::reinitialise_loop_0_sub_1);
        return reinitialise_loop_0_1(m);
    }

    private final static Operation reinitialise_loop_0_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::reinitialise_loop_0_sub_2);
        return reinitialise_loop_0_2(m);
    }

    private final static Operation reinitialise_loop_0_sub_2(Prolog m) { 
        m.trust(null);
        return reinitialise_loop_0_3(m);
    }

    private final static Operation reinitialise_loop_0_1(Prolog m) { 
    // reinitialise_loop:-tabling_store(assert),!,retractall(loop(A,B))
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        cont = m.cont;
    // reinitialise_loop:-['$get_level'(A),call('$dra':tabling_store(assert)),'$cut'(A),retractall('$dra':loop(B,C))]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void,void],y(1)),put_str(@('FUNCTOR_loop_2'),y(1),a(2))
        a2 =  S( FUNCTOR_loop_2 , m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a2);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_reinitialise_loop_0_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a1), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a3), cont)));
    }

    private final static Operation reinitialise_loop_0_2(Prolog m) { 
    // reinitialise_loop:-recorded(loop_key,A,B),erase(B),delete_loops(A),fail
         Term a1, a2;
        Operation p1, p2, p3;
        Operation cont;
        cont = m.cont;
    // reinitialise_loop:-[recorded(loop_key,A,B),erase(B),delete_loops(A),fail]
        a1 = m.mkvar1();
        a2 = m.mkvar1();
        return //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA( ATOM_loop_key , a1, a2), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a2), //
 Op("delete_loops", FILE_dra::PRED_delete_loops_1_static_exec, VA(a1), fail_0)));
    }

    private final static Operation reinitialise_loop_0_3(Prolog m) { 
    // reinitialise_loop:-true
        Operation cont;
        cont = m.cont;
    // reinitialise_loop:-[]
        return cont;
    }
/** PREDICATE: add_loop/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(add_loop/2,non-(public))
    private static final Compound L_add_loop_2_s7 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_add_loop_2_s9 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_add_loop_2_s7);
        final static Functor FUNCTOR_loop_1 = F("loop",1);




    public static Operation PRED_add_loop_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::add_loop_2_sub_1);
        return add_loop_2_1(m);
    }

    private final static Operation add_loop_2_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::add_loop_2_sub_2);
        return add_loop_2_2(m);
    }

    private final static Operation add_loop_2_sub_2(Prolog m) { 
        m.retry(null, FILE_dra::add_loop_2_sub_3);
        return add_loop_2_3(m);
    }

    private final static Operation add_loop_2_sub_3(Prolog m) { 
        m.trust(null);
        return add_loop_2_4(m);
    }

    private final static Operation add_loop_2_1(Prolog m) { 
    // add_loop(A,[]):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_loop(A,[]):-['$neck_cut']
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation add_loop_2_2(Prolog m) { 
    // add_loop(A,B):-get_loop(A,C),are_variants(B,C),!
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_loop(A,B):-['$get_level'(C),get_loop(A,D),are_variants(B,D),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        return //
 Op("get_loop", FILE_dra::PRED_get_loop_2_static_exec, VA(a1, a4), //
 Op("are_variants", FILE_dra::PRED_are_variants_2_static_exec, VA(a2, a4), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont)));
    }

    private final static Operation add_loop_2_3(Prolog m) { 
    // add_loop(A,B):-tabling_store(assert),!,assert(loop(A,B))
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_loop(A,B):-['$get_level'(C),call('$dra':tabling_store(assert)),'$cut'(C),assert('$dra':loop(A,B))]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_loop_2'),y(1),a(4))
        a4 =  S( FUNCTOR_loop_2 , a1, a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a4);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_add_loop_2_s9), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("assert", FILE_dra::PRED_assert_1_static_exec, VA(a5), cont)));
    }

    private final static Operation add_loop_2_4(Prolog m) { 
    // add_loop(A,B):-recordz(A,loop(B)),ensure_recorded(loop_key,A)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_loop(A,B):-[recordz(A,loop(B)),ensure_recorded(loop_key,A)]
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_loop_1'),y(1),a(3))
        a3 =  S( FUNCTOR_loop_1 , a2);
 ;
        return //
 Op("recordz", FILE_dra::PRED_recordz_2_static_exec, VA(a1, a3), //
 Op("ensure_recorded", FILE_dra::PRED_ensure_recorded_2_static_exec, VA( ATOM_loop_key , a1), cont));
    }
/** PREDICATE: delete_loops/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(delete_loops/1,non-(public))
    private static final Compound L_delete_loops_1_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_delete_loops_1_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_delete_loops_1_s6);




    public static Operation PRED_delete_loops_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::delete_loops_1_sub_1);
        return delete_loops_1_1(m);
    }

    private final static Operation delete_loops_1_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::delete_loops_1_sub_2);
        return delete_loops_1_2(m);
    }

    private final static Operation delete_loops_1_sub_2(Prolog m) { 
        m.trust(null);
        return delete_loops_1_3(m);
    }

    private final static Operation delete_loops_1_1(Prolog m) { 
    // delete_loops(A):-tabling_store(assert),!,retractall(loop(A,B))
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // delete_loops(A):-['$get_level'(B),call('$dra':tabling_store(assert)),'$cut'(B),retractall('$dra':loop(A,C))]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),void],y(1)),put_str(@('FUNCTOR_loop_2'),y(1),a(3))
        a3 =  S( FUNCTOR_loop_2 , a1, m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a3);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_delete_loops_1_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a4), cont)));
    }

    private final static Operation delete_loops_1_2(Prolog m) { 
    // delete_loops(A):-recorded(A,loop(B),C),erase(C),fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // delete_loops(A):-[recorded(A,loop(B),C),erase(C),fail]
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_loop_1'),y(1),a(2))
        a2 =  S( FUNCTOR_loop_1 , m.mkvar3());
 ;
        a3 = m.mkvar1();
        return //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA(a1, a2, a3), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation delete_loops_1_3(Prolog m) { 
    // delete_loops(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // delete_loops(A):-[]
        return cont;
    }
/** PREDICATE: get_loop/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(get_loop/2,non-(public))
    private static final Compound L_get_loop_2_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_get_loop_2_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_get_loop_2_s6);




    public static Operation PRED_get_loop_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::get_loop_2_sub_1);
        return get_loop_2_1(m);
    }

    private final static Operation get_loop_2_sub_1(Prolog m) { 
        m.trust(null);
        return get_loop_2_2(m);
    }

    private final static Operation get_loop_2_1(Prolog m) { 
    // get_loop(A,B):-tabling_store(assert),!,loop(A,B)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // get_loop(A,B):-['$get_level'(C),call('$dra':tabling_store(assert)),'$cut'(C),call('$dra':loop(A,B))]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_loop_2'),y(1),a(4))
        a4 =  S( FUNCTOR_loop_2 , a1, a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a4);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_get_loop_2_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a5), cont)));
    }

    private final static Operation get_loop_2_2(Prolog m) { 
    // get_loop(A,B):-recorded(A,loop(B))
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // get_loop(A,B):-[recorded(A,loop(B))]
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_loop_1'),y(1),a(3))
        a3 =  S( FUNCTOR_loop_1 , a2);
 ;
        return //
 Op("recorded", FILE_dra::PRED_recorded_2_static_exec, VA(a1, a3), cont);
    }
/** PREDICATE: reinitialise_looping_alternative/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(reinitialise_looping_alternative/0,non-(public))
    private static final Compound L_reinitialise_looping_alternative_0_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_reinitialise_looping_alternative_0_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_reinitialise_looping_alternative_0_s6);
        final static Functor ATOM_looping_alternative_key = SYM("looping_alternative_key");




    public static Operation PRED_reinitialise_looping_alternative_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry0(null, FILE_dra::reinitialise_looping_alternative_0_sub_1);
        return reinitialise_looping_alternative_0_1(m);
    }

    private final static Operation reinitialise_looping_alternative_0_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::reinitialise_looping_alternative_0_sub_2);
        return reinitialise_looping_alternative_0_2(m);
    }

    private final static Operation reinitialise_looping_alternative_0_sub_2(Prolog m) { 
        m.trust(null);
        return reinitialise_looping_alternative_0_3(m);
    }

    private final static Operation reinitialise_looping_alternative_0_1(Prolog m) { 
    // reinitialise_looping_alternative:-tabling_store(assert),!,retractall(looping_alternative(A,B))
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        cont = m.cont;
    // reinitialise_looping_alternative:-['$get_level'(A),call('$dra':tabling_store(assert)),'$cut'(A),retractall('$dra':looping_alternative(B,C))]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void,void],y(1)),put_str(@('FUNCTOR_looping_alternative_2'),y(1),a(2))
        a2 =  S( FUNCTOR_looping_alternative_2 , m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a2);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_reinitialise_looping_alternative_0_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a1), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a3), cont)));
    }

    private final static Operation reinitialise_looping_alternative_0_2(Prolog m) { 
    // reinitialise_looping_alternative:-recorded(looping_alternative_key,A,B),erase(B),delete_looping_alternatives(A),fail
         Term a1, a2;
        Operation p1, p2, p3;
        Operation cont;
        cont = m.cont;
    // reinitialise_looping_alternative:-[recorded(looping_alternative_key,A,B),erase(B),delete_looping_alternatives(A),fail]
        a1 = m.mkvar1();
        a2 = m.mkvar1();
        return //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA( ATOM_looping_alternative_key , a1, a2), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a2), //
 Op("delete_looping_alternatives", FILE_dra::PRED_delete_looping_alternatives_1_static_exec, VA(a1), fail_0)));
    }

    private final static Operation reinitialise_looping_alternative_0_3(Prolog m) { 
    // reinitialise_looping_alternative:-true
        Operation cont;
        cont = m.cont;
    // reinitialise_looping_alternative:-[]
        return cont;
    }
/** PREDICATE: add_looping_alternative/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(add_looping_alternative/2,non-(public))
    private static final Compound L_add_looping_alternative_2_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_add_looping_alternative_2_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_add_looping_alternative_2_s6);
        final static Functor FUNCTOR_looping_alternative_1 = F("looping_alternative",1);




    public static Operation PRED_add_looping_alternative_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::add_looping_alternative_2_sub_1);
        return add_looping_alternative_2_1(m);
    }

    private final static Operation add_looping_alternative_2_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::add_looping_alternative_2_sub_2);
        return add_looping_alternative_2_2(m);
    }

    private final static Operation add_looping_alternative_2_sub_2(Prolog m) { 
        m.trust(null);
        return add_looping_alternative_2_3(m);
    }

    private final static Operation add_looping_alternative_2_1(Prolog m) { 
    // add_looping_alternative(A,B):-get_looping_alternative(A,C),are_variants(B,C),!
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_looping_alternative(A,B):-['$get_level'(C),get_looping_alternative(A,D),are_variants(B,D),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        return //
 Op("get_looping_alternative", FILE_dra::PRED_get_looping_alternative_2_static_exec, VA(a1, a4), //
 Op("are_variants", FILE_dra::PRED_are_variants_2_static_exec, VA(a2, a4), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont)));
    }

    private final static Operation add_looping_alternative_2_2(Prolog m) { 
    // add_looping_alternative(A,B):-tabling_store(assert),!,assert(looping_alternative(A,B))
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_looping_alternative(A,B):-['$get_level'(C),call('$dra':tabling_store(assert)),'$cut'(C),assert('$dra':looping_alternative(A,B))]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_looping_alternative_2'),y(1),a(4))
        a4 =  S( FUNCTOR_looping_alternative_2 , a1, a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a4);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_add_looping_alternative_2_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("assert", FILE_dra::PRED_assert_1_static_exec, VA(a5), cont)));
    }

    private final static Operation add_looping_alternative_2_3(Prolog m) { 
    // add_looping_alternative(A,B):-recordz(A,looping_alternative(B)),ensure_recorded(looping_alternative_key,A)
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // add_looping_alternative(A,B):-[recordz(A,looping_alternative(B)),ensure_recorded(looping_alternative_key,A)]
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_looping_alternative_1'),y(1),a(3))
        a3 =  S( FUNCTOR_looping_alternative_1 , a2);
 ;
        return //
 Op("recordz", FILE_dra::PRED_recordz_2_static_exec, VA(a1, a3), //
 Op("ensure_recorded", FILE_dra::PRED_ensure_recorded_2_static_exec, VA( ATOM_looping_alternative_key , a1), cont));
    }
/** PREDICATE: delete_looping_alternatives/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(delete_looping_alternatives/1,non-(public))
    private static final Compound L_delete_looping_alternatives_1_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_delete_looping_alternatives_1_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_delete_looping_alternatives_1_s6);




    public static Operation PRED_delete_looping_alternatives_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::delete_looping_alternatives_1_sub_1);
        return delete_looping_alternatives_1_1(m);
    }

    private final static Operation delete_looping_alternatives_1_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::delete_looping_alternatives_1_sub_2);
        return delete_looping_alternatives_1_2(m);
    }

    private final static Operation delete_looping_alternatives_1_sub_2(Prolog m) { 
        m.trust(null);
        return delete_looping_alternatives_1_3(m);
    }

    private final static Operation delete_looping_alternatives_1_1(Prolog m) { 
    // delete_looping_alternatives(A):-tabling_store(assert),!,retractall(looping_alternative(A,B))
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // delete_looping_alternatives(A):-['$get_level'(B),call('$dra':tabling_store(assert)),'$cut'(B),retractall('$dra':looping_alternative(A,C))]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),void],y(1)),put_str(@('FUNCTOR_looping_alternative_2'),y(1),a(3))
        a3 =  S( FUNCTOR_looping_alternative_2 , a1, m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(3)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a3);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_delete_looping_alternatives_1_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a4), cont)));
    }

    private final static Operation delete_looping_alternatives_1_2(Prolog m) { 
    // delete_looping_alternatives(A):-recorded(A,looping_alternative(B),C),erase(C),fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // delete_looping_alternatives(A):-[recorded(A,looping_alternative(B),C),erase(C),fail]
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_looping_alternative_1'),y(1),a(2))
        a2 =  S( FUNCTOR_looping_alternative_1 , m.mkvar3());
 ;
        a3 = m.mkvar1();
        return //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA(a1, a2, a3), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation delete_looping_alternatives_1_3(Prolog m) { 
    // delete_looping_alternatives(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // delete_looping_alternatives(A):-[]
        return cont;
    }
/** PREDICATE: get_looping_alternative/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(get_looping_alternative/2,non-(public))
    private static final Compound L_get_looping_alternative_2_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_get_looping_alternative_2_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_get_looping_alternative_2_s6);




    public static Operation PRED_get_looping_alternative_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::get_looping_alternative_2_sub_1);
        return get_looping_alternative_2_1(m);
    }

    private final static Operation get_looping_alternative_2_sub_1(Prolog m) { 
        m.trust(null);
        return get_looping_alternative_2_2(m);
    }

    private final static Operation get_looping_alternative_2_1(Prolog m) { 
    // get_looping_alternative(A,B):-tabling_store(assert),!,looping_alternative(A,B)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // get_looping_alternative(A,B):-['$get_level'(C),call('$dra':tabling_store(assert)),'$cut'(C),call('$dra':looping_alternative(A,B))]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_looping_alternative_2'),y(1),a(4))
        a4 =  S( FUNCTOR_looping_alternative_2 , a1, a2);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a4);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_get_looping_alternative_2_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a5), cont)));
    }

    private final static Operation get_looping_alternative_2_2(Prolog m) { 
    // get_looping_alternative(A,B):-recorded(A,looping_alternative(B))
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // get_looping_alternative(A,B):-[recorded(A,looping_alternative(B))]
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_looping_alternative_1'),y(1),a(3))
        a3 =  S( FUNCTOR_looping_alternative_1 , a2);
 ;
        return //
 Op("recorded", FILE_dra::PRED_recorded_2_static_exec, VA(a1, a3), cont);
    }
/** PREDICATE: reinitialise_completed/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(reinitialise_completed/0,non-(public))
    private static final Compound L_reinitialise_completed_0_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_reinitialise_completed_0_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_reinitialise_completed_0_s6);
        final static Functor ATOM_completed_key = SYM("completed_key");




    public static Operation PRED_reinitialise_completed_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry0(null, FILE_dra::reinitialise_completed_0_sub_1);
        return reinitialise_completed_0_1(m);
    }

    private final static Operation reinitialise_completed_0_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::reinitialise_completed_0_sub_2);
        return reinitialise_completed_0_2(m);
    }

    private final static Operation reinitialise_completed_0_sub_2(Prolog m) { 
        m.trust(null);
        return reinitialise_completed_0_3(m);
    }

    private final static Operation reinitialise_completed_0_1(Prolog m) { 
    // reinitialise_completed:-tabling_store(assert),!,retractall(completed(A,B))
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        cont = m.cont;
    // reinitialise_completed:-['$get_level'(A),call('$dra':tabling_store(assert)),'$cut'(A),retractall('$dra':completed(B,C))]
        a1 = m.mkvar1();
        //START inline expansion of $get_level(a(1))
        if (! a1.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([void,void],y(1)),put_str(@('FUNCTOR_completed_2'),y(1),a(2))
        a2 =  S( FUNCTOR_completed_2 , m.mkvar3(), m.mkvar3());
 ;
    // put_str_args([@('ATOM_$0024dra'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a2);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_reinitialise_completed_0_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a1), //
 Op("retractall", FILE_dra::PRED_retractall_1_static_exec, VA(a3), cont)));
    }

    private final static Operation reinitialise_completed_0_2(Prolog m) { 
    // reinitialise_completed:-recorded(completed_key,A,B),erase(B),recorded(A,completed(C,D),E),erase(E),fail
         Term a1, a2, a3, a4;
        Operation p1, p2, p3, p4;
        Operation cont;
        cont = m.cont;
    // reinitialise_completed:-[recorded(completed_key,A,B),erase(B),recorded(A,completed(C,D),E),erase(E),fail]
        a1 = m.mkvar1();
        a2 = m.mkvar1();
    // put_str_args([void,void],y(1)),put_str(@('FUNCTOR_completed_2'),y(1),a(3))
        a3 =  S( FUNCTOR_completed_2 , m.mkvar3(), m.mkvar3());
 ;
        a4 = m.mkvar1();
        return //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA( ATOM_completed_key , a1, a2), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a2), //
 Op("recorded", FILE_dra::PRED_recorded_3_static_exec, VA(a1, a3, a4), //
 Op("erase", FILE_dra::PRED_erase_1_static_exec, VA(a4), fail_0))));
    }

    private final static Operation reinitialise_completed_0_3(Prolog m) { 
    // reinitialise_completed:-true
        Operation cont;
        cont = m.cont;
    // reinitialise_completed:-[]
        return cont;
    }
/** PREDICATE: is_completed/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(is_completed/1,non-(public))
    private static final Compound L_is_completed_1_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_is_completed_1_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_is_completed_1_s6);




    public static Operation PRED_is_completed_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::is_completed_1_sub_1);
        return is_completed_1_1(m);
    }

    private final static Operation is_completed_1_sub_1(Prolog m) { 
        m.trust(null);
        return is_completed_1_2(m);
    }

    private final static Operation is_completed_1_1(Prolog m) { 
    // is_completed(A):-tabling_store(assert),!,copy_term(A,B),once(essence_hook(B,C)),completed(C,D),are_essences_variants(A,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_completed(A):-['$get_level'(B),call('$dra':tabling_store(assert)),'$cut'(B),copy_term(A,C),once('$dra':essence_hook(C,D)),call('$dra':completed(D,E)),are_essences_variants(A,E)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(5))
        a5 =  S( FUNCTOR_essence_hook_2 , a3, a4);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
        a7 = m.mkvar1();
    // put_str_args([a(4),a(7)],y(3)),put_str(@('FUNCTOR_completed_2'),y(3),a(8))
        a8 =  S( FUNCTOR_completed_2 , a4, a7);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(8)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a8);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_is_completed_1_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a1, a3), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a6), //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a9), //
 Op("are_essences_variants", FILE_dra::PRED_are_essences_variants_2_static_exec, VA(a1, a7), cont))))));
    }

    private final static Operation is_completed_1_2(Prolog m) { 
    // is_completed(A):-copy_term(A,B),once(essence_hook(B,C)),recorded(A,completed(C,D)),are_essences_variants(A,D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_completed(A):-[copy_term(A,B),once('$dra':essence_hook(B,C)),recorded(A,completed(C,D)),are_essences_variants(A,D)]
        a2 = m.mkvar1();
        //START inline expansion of copy_term(a(1),a(2))
        a1 = a1.dref();
        if (! a2.unify(m.copy(a1), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(4))
        a4 =  S( FUNCTOR_essence_hook_2 , a2, a3);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a4);
 ;
        a6 = m.mkvar1();
    // put_str_args([a(3),a(6)],y(3)),put_str(@('FUNCTOR_completed_2'),y(3),a(7))
        a7 =  S( FUNCTOR_completed_2 , a3, a6);
 ;
        return //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a5), //
 Op("recorded", FILE_dra::PRED_recorded_2_static_exec, VA(a1, a7), //
 Op("are_essences_variants", FILE_dra::PRED_are_essences_variants_2_static_exec, VA(a1, a6), cont)));
    }
/** PREDICATE: complete_goal/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(complete_goal/2,non-(public))
    private static final Compound L_complete_goal_2_s6 = S( FUNCTOR_tabling_store_1 ,  ATOM_assert );
    private static final Compound L_complete_goal_2_s8 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_complete_goal_2_s6);
        final static Functor ATOM_Completing = SYM("Completing");




    public static Operation PRED_complete_goal_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_dra::complete_goal_2_sub_1);
        return complete_goal_2_1(m);
    }

    private final static Operation complete_goal_2_sub_1(Prolog m) { 
        m.retry(null, FILE_dra::complete_goal_2_sub_2);
        return complete_goal_2_2(m);
    }

    private final static Operation complete_goal_2_sub_2(Prolog m) { 
        m.trust(null);
        return complete_goal_2_3(m);
    }

    private final static Operation complete_goal_2_1(Prolog m) { 
    // complete_goal(A,B):-is_completed(A),!
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // complete_goal(A,B):-['$get_level'(C),is_completed(A),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("is_completed", FILE_dra::PRED_is_completed_1_static_exec, VA(a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), cont));
    }

    private final static Operation complete_goal_2_2(Prolog m) { 
    // complete_goal(A,B):-tabling_store(assert),!,copy_term(A,C),once(essence_hook(C,D)),trace_other('Completing',A,?,B),assert(completed(D,A))
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // complete_goal(A,B):-['$get_level'(C),call('$dra':tabling_store(assert)),'$cut'(C),copy_term(A,D),once('$dra':essence_hook(D,E)),trace_other('Completing',A,?,B),assert('$dra':completed(E,A))]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(6))
        a6 =  S( FUNCTOR_essence_hook_2 , a4, a5);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a6);
 ;
    // put_str_args([a(5),a(1)],y(3)),put_str(@('FUNCTOR_completed_2'),y(3),a(8))
        a8 =  S( FUNCTOR_completed_2 , a5, a1);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(8)],y(4)),put_str(@('FUNCTOR_module_colon_2'),y(4),a(9))
        a9 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a8);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(L_complete_goal_2_s8), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a3), //
 Op("copy_term", FILE_dra::PRED_copy_term_2_static_exec, VA(a1, a4), //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a7), //
 Op("trace_other", FILE_dra::PRED_trace_other_4_static_exec, VA( ATOM_Completing , a1,  ATOM_$003F , a2), //
 Op("assert", FILE_dra::PRED_assert_1_static_exec, VA(a9), cont))))));
    }

    private final static Operation complete_goal_2_3(Prolog m) { 
    // complete_goal(A,B):-copy_term(A,C),once(essence_hook(C,D)),trace_other('Completing',A,?,B),recordz(A,completed(D,A)),most_general_instance(A,E),ensure_recorded(completed_key,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // complete_goal(A,B):-[copy_term(A,C),once('$dra':essence_hook(C,D)),trace_other('Completing',A,?,B),recordz(A,completed(D,A)),most_general_instance(A,E),ensure_recorded(completed_key,E)]
        a3 = m.mkvar1();
        //START inline expansion of copy_term(a(1),a(3))
        a1 = a1.dref();
        if (! a3.unify(m.copy(a1), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_essence_hook_2'),y(1),a(5))
        a5 =  S( FUNCTOR_essence_hook_2 , a3, a4);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
    // put_str_args([a(4),a(1)],y(3)),put_str(@('FUNCTOR_completed_2'),y(3),a(7))
        a7 =  S( FUNCTOR_completed_2 , a4, a1);
 ;
        a8 = m.mkvar1();
        return //
 Op("once", FILE_dra::PRED_once_1_static_exec, VA(a6), //
 Op("trace_other", FILE_dra::PRED_trace_other_4_static_exec, VA( ATOM_Completing , a1,  ATOM_$003F , a2), //
 Op("recordz", FILE_dra::PRED_recordz_2_static_exec, VA(a1, a7), //
 Op("most_general_instance", FILE_dra::PRED_most_general_instance_2_static_exec, VA(a1, a8), //
 Op("ensure_recorded", FILE_dra::PRED_ensure_recorded_2_static_exec, VA( ATOM_completed_key , a8), cont)))));
    }
/** PREDICATE: $dummy_57_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_57_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/1,non-(public))




    public static Operation PRED_$dummy_57_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::$dummy_57_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1);
        return $dummy_57_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(m);
    }

    private final static Operation $dummy_57_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_57_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(m);
    }

    private final static Operation $dummy_57_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(Prolog m) { 
    // '$dummy_57_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-quietly(A),!,true
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_57_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-['$get_level'(B),quietly(A),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("quietly", FILE_dra::PRED_quietly_1_static_exec, VA(a1), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), cont));
    }

    private final static Operation $dummy_57_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(Prolog m) { 
    // '$dummy_57_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-fail
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_57_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: assertion/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(assertion/1,public)
        final static Functor FUNCTOR_assertion_failed_1 = F("assertion_failed",1);




    public static Operation PRED_assertion_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::assertion_1_sub_1);
        return assertion_1_1(m);
    }

    private final static Operation assertion_1_sub_1(Prolog m) { 
        m.trust(null);
        return assertion_1_2(m);
    }

    private final static Operation assertion_1_1(Prolog m) { 
    // assertion(A):-'$dummy_57_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // assertion(A):-['$dummy_57_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A)]
        return //
 Op("$dummy_57_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_57_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec, VA(a1), cont);
    }

    private final static Operation assertion_1_2(Prolog m) { 
    // assertion(A):-throw(assertion_failed(A))
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // assertion(A):-[throw(assertion_failed(A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_assertion_failed_1'),y(1),a(2))
        a2 =  S( FUNCTOR_assertion_failed_1 , a1);
 ;
        return //
 Op("throw", FILE_dra::PRED_throw_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: $dummy_58_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_58_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/1,non-(public))




    public static Operation PRED_$dummy_58_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::$dummy_58_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1);
        return $dummy_58_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(m);
    }

    private final static Operation $dummy_58_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_58_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(m);
    }

    private final static Operation $dummy_58_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(Prolog m) { 
    // '$dummy_58_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-tracing,!,each_call_cleanup(notrace,call(A),trace)
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_58_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-['$get_level'(B),tracing,'$cut'(B),each_call_cleanup(notrace,call(A),trace)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_call_1'),y(1),a(3))
        a3 =  S( FUNCTOR_call_1 , a1);
 ;
        return //
 Op("tracing", FILE_dra::PRED_tracing_0_static_exec, VA(), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), //
 Op("each_call_cleanup", FILE_dra::PRED_each_call_cleanup_3_static_exec, VA( ATOM_notrace , a3,  ATOM_trace ), cont)));
    }

    private final static Operation $dummy_58_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(Prolog m) { 
    // '$dummy_58_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-fail
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_58_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: quietly/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(quietly/1,public)




    public static Operation PRED_quietly_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::quietly_1_sub_1);
        return quietly_1_1(m);
    }

    private final static Operation quietly_1_sub_1(Prolog m) { 
        m.trust(null);
        return quietly_1_2(m);
    }

    private final static Operation quietly_1_1(Prolog m) { 
    // quietly(A):-'$dummy_58_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // quietly(A):-['$dummy_58_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A)]
        return //
 Op("$dummy_58_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_58_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec, VA(a1), cont);
    }

    private final static Operation quietly_1_2(Prolog m) { 
    // quietly(A):-call(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // quietly(A):-[call('$dra':A)]
    // put_str_args([@('ATOM_$0024dra'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a1);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: $dummy_59_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$dummy_59_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'/1,non-(public))




    public static Operation PRED_$dummy_59_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::$dummy_59_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1);
        return $dummy_59_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(m);
    }

    private final static Operation $dummy_59_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_59_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(m);
    }

    private final static Operation $dummy_59_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_1(Prolog m) { 
    // '$dummy_59_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-tracing,!,each_call_cleanup(notrace,call(A),trace)
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_59_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-['$get_level'(B),tracing,'$cut'(B),each_call_cleanup(notrace,call(A),trace)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_call_1'),y(1),a(3))
        a3 =  S( FUNCTOR_call_1 , a1);
 ;
        return //
 Op("tracing", FILE_dra::PRED_tracing_0_static_exec, VA(), //
 Op("$cut", FILE_dra::PRED_$cut_1_static_exec, VA(a2), //
 Op("each_call_cleanup", FILE_dra::PRED_each_call_cleanup_3_static_exec, VA( ATOM_notrace , a3,  ATOM_trace ), cont)));
    }

    private final static Operation $dummy_59_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_2(Prolog m) { 
    // '$dummy_59_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-fail
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_59_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: (dynamic)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main((dynamic)/1,public)




    public static Operation PRED_dynamic_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_dra::dynamic_1_sub_1);
        return dynamic_1_1(m);
    }

    private final static Operation dynamic_1_sub_1(Prolog m) { 
        m.trust(null);
        return dynamic_1_2(m);
    }

    private final static Operation dynamic_1_1(Prolog m) { 
    // dynamic A:-'$dummy_59_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // dynamic A:-['$dummy_59_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl'(A)]
        return //
 Op("$dummy_59_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl", FILE_dra::PRED_$dummy_59_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec, VA(a1), cont);
    }

    private final static Operation dynamic_1_2(Prolog m) { 
    // dynamic A:-call(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // dynamic A:-[call('$dra':A)]
    // put_str_args([@('ATOM_$0024dra'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a1);
 ;
        return //
 Op("call", FILE_dra::PRED_call_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: tracing/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main(tracing/0,public)




    public static Operation PRED_tracing_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // tracing:-'SxxMachine':'$tracing'
        m.setB0();
    // tracing:-['SxxMachine':'$tracing']
        return //
 Op("$tracing", FILE_dra::PRED_$tracing_0_static_exec, VA(), cont);
    }
/** PREDICATE: $init/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl
*/
    // main('$init'/0,public)
        final static Functor ATOM_was_access_level = SYM("was_access_level");
    private static final Compound L_$init_0_s6 = S( FUNCTOR_$002F_2 ,  ATOM_was_access_level ,  int_1 );
        final static Functor FUNCTOR_is_table_ok_1 = F("is_table_ok",1);
    private static final Compound L_$init_0_s15 = S( FUNCTOR_$002C_2 ,  ATOM_$0021 ,  ATOM_fail );
        final static Functor FUNCTOR_is_builtin_1 = F("is_builtin",1);
        final static Functor FUNCTOR_asserta_1 = F("asserta",1);
        final static Functor ATOM_is_table_ok = SYM("is_table_ok");
    private static final Compound L_$init_0_s21 = S( FUNCTOR_$002F_2 ,  ATOM_is_table_ok ,  int_1 );
    private static final Compound L_$init_0_s26 = S( FUNCTOR_$002F_2 ,  ATOM_is_coinductive0 ,  int_1 );
    private static final Compound L_$init_0_s29 = S( FUNCTOR_$002F_2 ,  ATOM_is_coinductive1 ,  int_1 );
    private static final Compound L_$init_0_s32 = S( FUNCTOR_$002F_2 ,  ATOM_is_tabled ,  int_1 );
    private static final Compound L_$init_0_s35 = S( FUNCTOR_$002F_2 ,  ATOM_is_old_first ,  int_1 );
    private static final Compound L_$init_0_s38 = S( FUNCTOR_$002F_2 ,  ATOM_is_traced ,  int_1 );
    private static final Compound L_$init_0_s42 = S( FUNCTOR_print_depth_1 ,  int_10 );
    private static final Compound L_$init_0_s44 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s42,  Prolog.True );
    private static final Compound L_$init_0_s46 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_$init_0_s44);
        final static Functor ATOM_hybrid = SYM("hybrid");
    private static final Compound L_$init_0_s50 = S( FUNCTOR_tabling_store_1 ,  ATOM_hybrid );
    private static final Compound L_$init_0_s52 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s50,  Prolog.True );
    private static final Compound L_$init_0_s54 = S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , L_$init_0_s52);
        final static Functor ATOM_answer = SYM("answer");
    private static final Compound L_$init_0_s58 = S( FUNCTOR_$002F_2 ,  ATOM_answer ,  int_3 );
    private static final Compound L_$init_0_s61 = S( FUNCTOR_$002F_2 ,  ATOM_pioneer ,  int_3 );
        final static Functor ATOM_result = SYM("result");
    private static final Compound L_$init_0_s65 = S( FUNCTOR_$002F_2 ,  ATOM_result ,  int_2 );
        final static Functor ATOM_loop = SYM("loop");
    private static final Compound L_$init_0_s68 = S( FUNCTOR_$002F_2 ,  ATOM_loop ,  int_2 );
        final static Functor ATOM_looping_alternative = SYM("looping_alternative");
    private static final Compound L_$init_0_s71 = S( FUNCTOR_$002F_2 ,  ATOM_looping_alternative ,  int_2 );
    private static final Compound L_$init_0_s74 = S( FUNCTOR_$002F_2 ,  ATOM_completed ,  int_2 );
        final static Functor ATOM_$0024tracing = SYM("$tracing");
    private static final Compound L_$init_0_s78 = S( FUNCTOR_$002F_2 ,  ATOM_$0024tracing ,  int_0 );




    public static Operation PRED_$init_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$init':-'$new_indexing_hash'('$dra',was_access_level/1,A),assertz((is_never_tabled(B):-is_table_ok(B),!,fail)),assertz((is_never_tabled(C):-is_builtin(C),asserta(is_never_tabled(C)),!)),assertz((is_never_tabled(D):-functor(D,E,F),functor(G,E,F),asserta(is_table_ok(G)),!,fail)),'$new_indexing_hash'('$dra',is_table_ok/1,H),assertz((essence_hook(I,I):-true)),'$new_indexing_hash'('$dra',is_coinductive0/1,J),'$new_indexing_hash'('$dra',is_coinductive1/1,K),'$new_indexing_hash'('$dra',is_tabled/1,L),'$new_indexing_hash'('$dra',is_old_first/1,M),'$new_indexing_hash'('$dra',is_traced/1,N),assertz((print_depth(10):-true)),assertz((tabling_store(hybrid):-true)),'$new_indexing_hash'('$dra',answer/3,O),'$new_indexing_hash'('$dra',pioneer/3,P),'$new_indexing_hash'('$dra',result/2,Q),'$new_indexing_hash'('$dra',loop/2,R),'$new_indexing_hash'('$dra',looping_alternative/2,S),'$new_indexing_hash'('$dra',completed/2,T),'$new_indexing_hash'('$dra','$tracing'/0,U)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19;
    // '$init':-['$new_indexing_hash'('$dra',was_access_level/1,A),assertz('$dra':(is_never_tabled(B):-is_table_ok(B),!,fail)),assertz('$dra':(is_never_tabled(C):-is_builtin(C),asserta(is_never_tabled(C)),!)),assertz('$dra':(is_never_tabled(D):-functor(D,E,F),functor(G,E,F),asserta(is_table_ok(G)),!,fail)),'$new_indexing_hash'('$dra',is_table_ok/1,H),assertz('$dra':(essence_hook(I,I):-true)),'$new_indexing_hash'('$dra',is_coinductive0/1,J),'$new_indexing_hash'('$dra',is_coinductive1/1,K),'$new_indexing_hash'('$dra',is_tabled/1,L),'$new_indexing_hash'('$dra',is_old_first/1,M),'$new_indexing_hash'('$dra',is_traced/1,N),assertz('$dra':(print_depth(10):-true)),assertz('$dra':(tabling_store(hybrid):-true)),'$new_indexing_hash'('$dra',answer/3,O),'$new_indexing_hash'('$dra',pioneer/3,P),'$new_indexing_hash'('$dra',result/2,Q),'$new_indexing_hash'('$dra',loop/2,R),'$new_indexing_hash'('$dra',looping_alternative/2,S),'$new_indexing_hash'('$dra',completed/2,T),'$new_indexing_hash'('$dra','$tracing'/0,U)]
        a1 = m.mkvar1();
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_is_never_tabled_1'),y(1),a(2))
        a2 =  S( FUNCTOR_is_never_tabled_1 , a1);
 ;
    // put_str_args([a(1)],y(2)),put_str(@('FUNCTOR_is_table_ok_1'),y(2),a(3))
        a3 =  S( FUNCTOR_is_table_ok_1 , a1);
 ;
    // put_str_args([a(3),s(15)],y(3)),put_str(@('FUNCTOR_$002C_2'),y(3),a(4))
        a4 =  S( FUNCTOR_$002C_2 , a3, L_$init_0_s15);
 ;
    // put_str_args([a(2),a(4)],y(4)),put_str(@('FUNCTOR_$003A$002D_2'),y(4),a(5))
        a5 =  S( FUNCTOR_$003A$002D_2 , a2, a4);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(5)],y(5)),put_str(@('FUNCTOR_module_colon_2'),y(5),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a5);
 ;
        a7 = m.mkvar1();
    // put_str_args([a(7)],y(6)),put_str(@('FUNCTOR_is_never_tabled_1'),y(6),a(8))
        a8 =  S( FUNCTOR_is_never_tabled_1 , a7);
 ;
    // put_str_args([a(7)],y(7)),put_str(@('FUNCTOR_is_builtin_1'),y(7),a(9))
        a9 =  S( FUNCTOR_is_builtin_1 , a7);
 ;
    // put_str_args([a(7)],y(8)),put_str(@('FUNCTOR_is_never_tabled_1'),y(8),a(10))
        a10 =  S( FUNCTOR_is_never_tabled_1 , a7);
 ;
    // put_str_args([a(10)],y(9)),put_str(@('FUNCTOR_asserta_1'),y(9),a(11))
        a11 =  S( FUNCTOR_asserta_1 , a10);
 ;
    // put_str_args([a(11),@('ATOM_$0021')],y(10)),put_str(@('FUNCTOR_$002C_2'),y(10),a(12))
        a12 =  S( FUNCTOR_$002C_2 , a11,  ATOM_$0021 );
 ;
    // put_str_args([a(9),a(12)],y(11)),put_str(@('FUNCTOR_$002C_2'),y(11),a(13))
        a13 =  S( FUNCTOR_$002C_2 , a9, a12);
 ;
    // put_str_args([a(8),a(13)],y(12)),put_str(@('FUNCTOR_$003A$002D_2'),y(12),a(14))
        a14 =  S( FUNCTOR_$003A$002D_2 , a8, a13);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(14)],y(13)),put_str(@('FUNCTOR_module_colon_2'),y(13),a(15))
        a15 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a14);
 ;
        a16 = m.mkvar1();
    // put_str_args([a(16)],y(14)),put_str(@('FUNCTOR_is_never_tabled_1'),y(14),a(17))
        a17 =  S( FUNCTOR_is_never_tabled_1 , a16);
 ;
        a18 = m.mkvar1();
        a19 = m.mkvar1();
    // put_str_args([a(16),a(18),a(19)],y(15)),put_str(@('FUNCTOR_functor_3'),y(15),a(20))
        a20 =  S( FUNCTOR_functor_3 , a16, a18, a19);
 ;
        a21 = m.mkvar1();
    // put_str_args([a(21),a(18),a(19)],y(16)),put_str(@('FUNCTOR_functor_3'),y(16),a(22))
        a22 =  S( FUNCTOR_functor_3 , a21, a18, a19);
 ;
    // put_str_args([a(21)],y(17)),put_str(@('FUNCTOR_is_table_ok_1'),y(17),a(23))
        a23 =  S( FUNCTOR_is_table_ok_1 , a21);
 ;
    // put_str_args([a(23)],y(18)),put_str(@('FUNCTOR_asserta_1'),y(18),a(24))
        a24 =  S( FUNCTOR_asserta_1 , a23);
 ;
    // put_str_args([a(24),s(15)],y(19)),put_str(@('FUNCTOR_$002C_2'),y(19),a(25))
        a25 =  S( FUNCTOR_$002C_2 , a24, L_$init_0_s15);
 ;
    // put_str_args([a(22),a(25)],y(20)),put_str(@('FUNCTOR_$002C_2'),y(20),a(26))
        a26 =  S( FUNCTOR_$002C_2 , a22, a25);
 ;
    // put_str_args([a(20),a(26)],y(21)),put_str(@('FUNCTOR_$002C_2'),y(21),a(27))
        a27 =  S( FUNCTOR_$002C_2 , a20, a26);
 ;
    // put_str_args([a(17),a(27)],y(22)),put_str(@('FUNCTOR_$003A$002D_2'),y(22),a(28))
        a28 =  S( FUNCTOR_$003A$002D_2 , a17, a27);
 ;
    // put_str_args([@('ATOM_$0024dra'),a(28)],y(23)),put_str(@('FUNCTOR_module_colon_2'),y(23),a(29))
        a29 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a28);
 ;
        a30 = m.mkvar1();
    // put_str_args([a(30),a(30)],y(24)),put_str(@('FUNCTOR_essence_hook_2'),y(24),a(31))
        a31 =  S( FUNCTOR_essence_hook_2 , a30, a30);
 ;
    // put_str_args([a(31),@('Prolog.True')],y(25)),put_str(@('FUNCTOR_$003A$002D_2'),y(25),a(32))
        a32 =  S( FUNCTOR_$003A$002D_2 , a31,  Prolog.True );
 ;
    // put_str_args([@('ATOM_$0024dra'),a(32)],y(26)),put_str(@('FUNCTOR_module_colon_2'),y(26),a(33))
        a33 =  S( FUNCTOR_module_colon_2 ,  ATOM_$0024dra , a32);
 ;
        return //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s6, m.DONT_CARE2()), //
 Op("assertz", FILE_dra::PRED_assertz_1_static_exec, VA(a6), //
 Op("assertz", FILE_dra::PRED_assertz_1_static_exec, VA(a15), //
 Op("assertz", FILE_dra::PRED_assertz_1_static_exec, VA(a29), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s21, m.DONT_CARE2()), //
 Op("assertz", FILE_dra::PRED_assertz_1_static_exec, VA(a33), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s26, m.DONT_CARE2()), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s29, m.DONT_CARE2()), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s32, m.DONT_CARE2()), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s35, m.DONT_CARE2()), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s38, m.DONT_CARE2()), //
 Op("assertz", FILE_dra::PRED_assertz_1_static_exec, VA(L_$init_0_s46), //
 Op("assertz", FILE_dra::PRED_assertz_1_static_exec, VA(L_$init_0_s54), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s58, m.DONT_CARE2()), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s61, m.DONT_CARE2()), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s65, m.DONT_CARE2()), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s68, m.DONT_CARE2()), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s71, m.DONT_CARE2()), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s74, m.DONT_CARE2()), //
 Op("$new_indexing_hash", FILE_dra::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_$0024dra , L_$init_0_s78, m.DONT_CARE2()), cont))))))))))))))))))));
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("init_dra",1,FILE_dra::PRED_init_dra_1_static_exec);
   PredTable.registerBuiltin("$exit_dra",0,FILE_dra::PRED_$exit_dra_0_static_exec);
   PredTable.registerBuiltin("$enter_dra",0,FILE_dra::PRED_$enter_dra_0_static_exec);
   PredTable.registerBuiltin("std_trace_stream",1,FILE_dra::PRED_std_trace_stream_1_static_exec);
   PredTable.registerBuiltin("dra_w",1,FILE_dra::PRED_dra_w_1_static_exec);
   PredTable.registerBuiltin("dra_wln",1,FILE_dra::PRED_dra_wln_1_static_exec);
   PredTable.registerBuiltin("dra_retract_all",1,FILE_dra::PRED_dra_retract_all_1_static_exec);
   PredTable.registerBuiltin("dra_asserta_new",1,FILE_dra::PRED_dra_asserta_new_1_static_exec);
   PredTable.registerBuiltin("dra_assertz_new",1,FILE_dra::PRED_dra_assertz_new_1_static_exec);
   PredTable.registerBuiltin("dra_must",1,FILE_dra::PRED_dra_must_1_static_exec);
   PredTable.registerBuiltin("dra_error",1,FILE_dra::PRED_dra_error_1_static_exec);
   PredTable.registerBuiltin("add_clauses",2,FILE_dra::PRED_add_clauses_2_static_exec);
   PredTable.registerBuiltin("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("directive_source_file",1,FILE_dra::PRED_directive_source_file_1_static_exec);
   PredTable.registerBuiltin("property_pred",2,FILE_dra::PRED_property_pred_2_static_exec);
   PredTable.registerBuiltin("table",1,FILE_dra::PRED_table_1_static_exec);
   PredTable.registerBuiltin("coinductive0",1,FILE_dra::PRED_coinductive0_1_static_exec);
   PredTable.registerBuiltin("coinductive1",1,FILE_dra::PRED_coinductive1_1_static_exec);
   PredTable.registerBuiltin("topl",1,FILE_dra::PRED_topl_1_static_exec);
   PredTable.registerBuiltin("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",3,FILE_dra::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("make_db_pred",2,FILE_dra::PRED_make_db_pred_2_static_exec);
   PredTable.registerBuiltin("set_meta",2,FILE_dra::PRED_set_meta_2_static_exec);
   PredTable.registerBuiltin("$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",1,FILE_dra::PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec);
   PredTable.registerBuiltin("is_builtin",1,FILE_dra::PRED_is_builtin_1_static_exec);
   PredTable.registerBuiltin("mk_pattern",3,FILE_dra::PRED_mk_pattern_3_static_exec);
   PredTable.registerBuiltin("predspecs_to_patterns",2,FILE_dra::PRED_predspecs_to_patterns_2_static_exec);
   PredTable.registerBuiltin("predspec_to_pattern",2,FILE_dra::PRED_predspec_to_pattern_2_static_exec);
   PredTable.registerBuiltin("check_predspec",1,FILE_dra::PRED_check_predspec_1_static_exec);
   PredTable.registerBuiltin("are_variants",2,FILE_dra::PRED_are_variants_2_static_exec);
   PredTable.registerBuiltin("write_shallow",3,FILE_dra::PRED_write_shallow_3_static_exec);
   PredTable.registerBuiltin("$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",1,FILE_dra::PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",1,FILE_dra::PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec);
   PredTable.registerBuiltin("is_swi_builtin",1,FILE_dra::PRED_is_swi_builtin_1_static_exec);
   PredTable.registerBuiltin("dra_setval_flag",2,FILE_dra::PRED_dra_setval_flag_2_static_exec);
   PredTable.registerBuiltin("dra_getval_flag",2,FILE_dra::PRED_dra_getval_flag_2_static_exec);
   PredTable.registerBuiltin("dra_incval_flag",1,FILE_dra::PRED_dra_incval_flag_1_static_exec);
   PredTable.registerBuiltin("empty_tree",1,FILE_dra::PRED_empty_tree_1_static_exec);
   PredTable.registerBuiltin("$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",7,FILE_dra::PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_static_exec);
   PredTable.registerBuiltin("$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",5,FILE_dra::PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_static_exec);
   PredTable.registerBuiltin("is_in_tree",4,FILE_dra::PRED_is_in_tree_4_static_exec);
   PredTable.registerBuiltin("$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",6,FILE_dra::PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec);
   PredTable.registerBuiltin("tree_add",6,FILE_dra::PRED_tree_add_6_static_exec);
   PredTable.registerBuiltin("$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",12,FILE_dra::PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_12_static_exec);
   PredTable.registerBuiltin("$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",10,FILE_dra::PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_10_static_exec);
   PredTable.registerBuiltin("empty_goal_table",1,FILE_dra::PRED_empty_goal_table_1_static_exec);
   PredTable.registerBuiltin("goal_table_member",2,FILE_dra::PRED_goal_table_member_2_static_exec);
   PredTable.registerBuiltin("is_a_variant_in_goal_table",2,FILE_dra::PRED_is_a_variant_in_goal_table_2_static_exec);
   PredTable.registerBuiltin("member_reversed",2,FILE_dra::PRED_member_reversed_2_static_exec);
   PredTable.registerBuiltin("goal_table_add",3,FILE_dra::PRED_goal_table_add_3_static_exec);
   PredTable.registerBuiltin("add_to_list",3,FILE_dra::PRED_add_to_list_3_static_exec);
   PredTable.registerBuiltin("empty_hypotheses",1,FILE_dra::PRED_empty_hypotheses_1_static_exec);
   PredTable.registerBuiltin("push_is_coinductive",3,FILE_dra::PRED_push_is_coinductive_3_static_exec);
   PredTable.registerBuiltin("unify_with_coinductive_ancestor",2,FILE_dra::PRED_unify_with_coinductive_ancestor_2_static_exec);
   PredTable.registerBuiltin("empty_stack",1,FILE_dra::PRED_empty_stack_1_static_exec);
   PredTable.registerBuiltin("push_is_tabled",5,FILE_dra::PRED_push_is_tabled_5_static_exec);
   PredTable.registerBuiltin("is_variant_of_ancestor",4,FILE_dra::PRED_is_variant_of_ancestor_4_static_exec);
   PredTable.registerBuiltin("dra_version",1,FILE_dra::PRED_dra_version_1_static_exec);
   PredTable.registerBuiltin("initialize_table",0,FILE_dra::PRED_initialize_table_0_static_exec);
   PredTable.registerBuiltin("abolish_tables",0,FILE_dra::PRED_abolish_tables_0_static_exec);
   PredTable.registerBuiltin("legal_directive",1,FILE_dra::PRED_legal_directive_1_static_exec);
   PredTable.registerBuiltin("$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",1,FILE_dra::PRED_$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec);
   PredTable.registerBuiltin("process_dra_ective",1,FILE_dra::PRED_process_dra_ective_1_static_exec);
   PredTable.registerBuiltin("add_patterns",2,FILE_dra::PRED_add_patterns_2_static_exec);
   PredTable.registerBuiltin("add_pattern",2,FILE_dra::PRED_add_pattern_2_static_exec);
   PredTable.registerBuiltin("tnot",1,FILE_dra::PRED_tnot_1_static_exec);
   PredTable.registerBuiltin("dra_call_tabled",1,FILE_dra::PRED_dra_call_tabled_1_static_exec);
   PredTable.registerBuiltin("dra_call_coind0",1,FILE_dra::PRED_dra_call_coind0_1_static_exec);
   PredTable.registerBuiltin("dra_call_coind1",1,FILE_dra::PRED_dra_call_coind1_1_static_exec);
   PredTable.registerBuiltin("dra_call_interp",1,FILE_dra::PRED_dra_call_interp_1_static_exec);
   PredTable.registerBuiltin("dra_use_interp",2,FILE_dra::PRED_dra_use_interp_2_static_exec);
   PredTable.registerBuiltin("init_dra_call",0,FILE_dra::PRED_init_dra_call_0_static_exec);
   PredTable.registerBuiltin("cont_dra_call",0,FILE_dra::PRED_cont_dra_call_0_static_exec);
   PredTable.registerBuiltin("exit_dra_call",0,FILE_dra::PRED_exit_dra_call_0_static_exec);
   PredTable.registerBuiltin("print_statistics",0,FILE_dra::PRED_print_statistics_0_static_exec);
   PredTable.registerBuiltin("$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",3,FILE_dra::PRED_$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",3,FILE_dra::PRED_$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec);
   PredTable.registerBuiltin("dra_interp",5,FILE_dra::PRED_dra_interp_5_static_exec);
   PredTable.registerBuiltin("$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",5,FILE_dra::PRED_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_static_exec);
   PredTable.registerBuiltin("$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",6,FILE_dra::PRED_$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",6,FILE_dra::PRED_$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",7,FILE_dra::PRED_$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_static_exec);
   PredTable.registerBuiltin("$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",6,FILE_dra::PRED_$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",6,FILE_dra::PRED_$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",1,FILE_dra::PRED_$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",1,FILE_dra::PRED_$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",8,FILE_dra::PRED_$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_8_static_exec);
   PredTable.registerBuiltin("$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",3,FILE_dra::PRED_$dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",3,FILE_dra::PRED_$dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",3,FILE_dra::PRED_$dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",3,FILE_dra::PRED_$dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",7,FILE_dra::PRED_$dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_static_exec);
   PredTable.registerBuiltin("non_cutted",3,FILE_dra::PRED_non_cutted_3_static_exec);
   PredTable.registerBuiltin("$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("dra_call_tabled",5,FILE_dra::PRED_dra_call_tabled_5_static_exec);
   PredTable.registerBuiltin("$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",5,FILE_dra::PRED_$dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_static_exec);
   PredTable.registerBuiltin("$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",6,FILE_dra::PRED_$dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_38_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_38_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_38_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",7,FILE_dra::PRED_$dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_7_static_exec);
   PredTable.registerBuiltin("$dummy_39_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_39_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",3,FILE_dra::PRED_$dummy_39_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_40_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",14,FILE_dra::PRED_$dummy_40_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_14_static_exec);
   PredTable.registerBuiltin("$dummy_41_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_41_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",1,FILE_dra::PRED_$dummy_41_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_42_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_42_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_42_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_43_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_43_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",3,FILE_dra::PRED_$dummy_43_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_46_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_46_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_46_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_45_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",6,FILE_dra::PRED_$dummy_45_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_44_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_44_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",6,FILE_dra::PRED_$dummy_44_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_6_static_exec);
   PredTable.registerBuiltin("get_tabled_if_old_first",4,FILE_dra::PRED_get_tabled_if_old_first_4_static_exec);
   PredTable.registerBuiltin("get_all_tabled_answers",4,FILE_dra::PRED_get_all_tabled_answers_4_static_exec);
   PredTable.registerBuiltin("$dummy_47_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_47_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_47_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("get_remaining_tabled_answers",4,FILE_dra::PRED_get_remaining_tabled_answers_4_static_exec);
   PredTable.registerBuiltin("use_clause",2,FILE_dra::PRED_use_clause_2_static_exec);
   PredTable.registerBuiltin("$dummy_48_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_48_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",3,FILE_dra::PRED_$dummy_48_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_3_static_exec);
   PredTable.registerBuiltin("compute_fixed_point",5,FILE_dra::PRED_compute_fixed_point_5_static_exec);
   PredTable.registerBuiltin("$dummy_51_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_51_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_51_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_49_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_49_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_49_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_50_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_50_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",1,FILE_dra::PRED_$dummy_50_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec);
   PredTable.registerBuiltin("compute_fixed_point_",6,FILE_dra::PRED_compute_fixed_point__6_static_exec);
   PredTable.registerBuiltin("suppress_pioneers_on_list",2,FILE_dra::PRED_suppress_pioneers_on_list_2_static_exec);
   PredTable.registerBuiltin("rescind_pioneer_status",1,FILE_dra::PRED_rescind_pioneer_status_1_static_exec);
   PredTable.registerBuiltin("complete_cluster",2,FILE_dra::PRED_complete_cluster_2_static_exec);
   PredTable.registerBuiltin("extract_goals",2,FILE_dra::PRED_extract_goals_2_static_exec);
   PredTable.registerBuiltin("get_unique_index",1,FILE_dra::PRED_get_unique_index_1_static_exec);
   PredTable.registerBuiltin("are_essences_variants",2,FILE_dra::PRED_are_essences_variants_2_static_exec);
   PredTable.registerBuiltin("trace_entry",4,FILE_dra::PRED_trace_entry_4_static_exec);
   PredTable.registerBuiltin("$dummy_52_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_52_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",5,FILE_dra::PRED_$dummy_52_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_5_static_exec);
   PredTable.registerBuiltin("trace_success",4,FILE_dra::PRED_trace_success_4_static_exec);
   PredTable.registerBuiltin("trace_failure",4,FILE_dra::PRED_trace_failure_4_static_exec);
   PredTable.registerBuiltin("trace_other",4,FILE_dra::PRED_trace_other_4_static_exec);
   PredTable.registerBuiltin("write_level",1,FILE_dra::PRED_write_level_1_static_exec);
   PredTable.registerBuiltin("write_label_and_goal",3,FILE_dra::PRED_write_label_and_goal_3_static_exec);
   PredTable.registerBuiltin("write_goal_number",1,FILE_dra::PRED_write_goal_number_1_static_exec);
   PredTable.registerBuiltin("optional_trace",4,FILE_dra::PRED_optional_trace_4_static_exec);
   PredTable.registerBuiltin("$dummy_53_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_53_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_53_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("ensure_recorded",2,FILE_dra::PRED_ensure_recorded_2_static_exec);
   PredTable.registerBuiltin("print_tables",0,FILE_dra::PRED_print_tables_0_static_exec);
   PredTable.registerBuiltin("$dummy_54_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_54_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_54_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("recorded_listing",1,FILE_dra::PRED_recorded_listing_1_static_exec);
   PredTable.registerBuiltin("reinitialise_answer",0,FILE_dra::PRED_reinitialise_answer_0_static_exec);
   PredTable.registerBuiltin("is_answer_known",2,FILE_dra::PRED_is_answer_known_2_static_exec);
   PredTable.registerBuiltin("memo",3,FILE_dra::PRED_memo_3_static_exec);
   PredTable.registerBuiltin("most_general_instance",2,FILE_dra::PRED_most_general_instance_2_static_exec);
   PredTable.registerBuiltin("get_answer",1,FILE_dra::PRED_get_answer_1_static_exec);
   PredTable.registerBuiltin("get_all_tabled_goals",1,FILE_dra::PRED_get_all_tabled_goals_1_static_exec);
   PredTable.registerBuiltin("reinitialise_result",0,FILE_dra::PRED_reinitialise_result_0_static_exec);
   PredTable.registerBuiltin("is_result_known",2,FILE_dra::PRED_is_result_known_2_static_exec);
   PredTable.registerBuiltin("$dummy_55_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_55_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_55_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("new_result_or_fail",2,FILE_dra::PRED_new_result_or_fail_2_static_exec);
   PredTable.registerBuiltin("$dummy_56_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_56_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",2,FILE_dra::PRED_$dummy_56_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_2_static_exec);
   PredTable.registerBuiltin("reinitialise_pioneer",0,FILE_dra::PRED_reinitialise_pioneer_0_static_exec);
   PredTable.registerBuiltin("is_a_variant_of_a_pioneer",2,FILE_dra::PRED_is_a_variant_of_a_pioneer_2_static_exec);
   PredTable.registerBuiltin("add_pioneer",2,FILE_dra::PRED_add_pioneer_2_static_exec);
   PredTable.registerBuiltin("delete_pioneer",1,FILE_dra::PRED_delete_pioneer_1_static_exec);
   PredTable.registerBuiltin("reinitialise_loop",0,FILE_dra::PRED_reinitialise_loop_0_static_exec);
   PredTable.registerBuiltin("add_loop",2,FILE_dra::PRED_add_loop_2_static_exec);
   PredTable.registerBuiltin("delete_loops",1,FILE_dra::PRED_delete_loops_1_static_exec);
   PredTable.registerBuiltin("get_loop",2,FILE_dra::PRED_get_loop_2_static_exec);
   PredTable.registerBuiltin("reinitialise_looping_alternative",0,FILE_dra::PRED_reinitialise_looping_alternative_0_static_exec);
   PredTable.registerBuiltin("add_looping_alternative",2,FILE_dra::PRED_add_looping_alternative_2_static_exec);
   PredTable.registerBuiltin("delete_looping_alternatives",1,FILE_dra::PRED_delete_looping_alternatives_1_static_exec);
   PredTable.registerBuiltin("get_looping_alternative",2,FILE_dra::PRED_get_looping_alternative_2_static_exec);
   PredTable.registerBuiltin("reinitialise_completed",0,FILE_dra::PRED_reinitialise_completed_0_static_exec);
   PredTable.registerBuiltin("is_completed",1,FILE_dra::PRED_is_completed_1_static_exec);
   PredTable.registerBuiltin("complete_goal",2,FILE_dra::PRED_complete_goal_2_static_exec);
   PredTable.registerBuiltin("$dummy_57_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_57_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",1,FILE_dra::PRED_$dummy_57_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec);
   PredTable.registerBuiltin("assertion",1,FILE_dra::PRED_assertion_1_static_exec);
   PredTable.registerBuiltin("$dummy_58_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_58_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",1,FILE_dra::PRED_$dummy_58_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec);
   PredTable.registerBuiltin("quietly",1,FILE_dra::PRED_quietly_1_static_exec);
   PredTable.registerBuiltin("$dummy_59_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tabling_dra/dra.pl","$dummy_59_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl",1,FILE_dra::PRED_$dummy_59_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Ftabling_dra$002Fdra$002Epl_1_static_exec);
   PredTable.registerBuiltin("dynamic",1,FILE_dra::PRED_dynamic_1_static_exec);
   PredTable.registerBuiltin("tracing",0,FILE_dra::PRED_tracing_0_static_exec);
   PredTable.registerBuiltin("$init",0,FILE_dra::PRED_$init_0_static_exec);
}
}

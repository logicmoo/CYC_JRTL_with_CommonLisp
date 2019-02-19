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
public class FILE_system extends FILE_swi_supp {
/** PREDICATE: system_predicate/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/system.pl
*/
    // main(system_predicate/1,public)
        final static Functor FUNCTOR_system_predicate_1 = F("system_predicate",1);
        final static Functor ATOM_otherwise = SYM("otherwise");
        final static Functor ATOM_fail = SYM("fail");
        final static Functor ATOM_false = SYM("false");
        final static Functor ATOM_$0021 = SYM("!");
        final static Functor FUNCTOR_$0024get_level_1 = F("$get_level",1);
        final static Functor ATOM_$0024neck_cut = SYM("$neck_cut");
        final static Functor FUNCTOR_$0024cut_1 = F("$cut",1);
        final static Functor FUNCTOR_$005E_2 = F("^",2);
        final static Functor FUNCTOR_$002C_2 = F(",",2);
        final static Functor FUNCTOR_or_2 = F(";",2);
        final static Functor FUNCTOR_$002D$003E_2 = F("->",2);
        final static Functor FUNCTOR_call_1 = F("call",1);
        final static Functor FUNCTOR_catch_3 = F("catch",3);
        final static Functor FUNCTOR_throw_1 = F("throw",1);
        final static Functor FUNCTOR_on_exception_3 = F("on_exception",3);
        final static Functor FUNCTOR_raise_exception_1 = F("raise_exception",1);
        final static Functor FUNCTOR_$003D_2 = F("=",2);
        final static Functor FUNCTOR_$0024unify_2 = F("$unify",2);
        final static Functor FUNCTOR_$005C$003D_2 = F("\\=",2);
        final static Functor FUNCTOR_$0024not_unifiable_2 = F("$not_unifiable",2);
        final static Functor FUNCTOR_var_1 = F("var",1);
        final static Functor FUNCTOR_atom_1 = F("atom",1);
        final static Functor FUNCTOR_integer_1 = F("integer",1);
        final static Functor FUNCTOR_long_1 = F("long",1);
        final static Functor FUNCTOR_float_1 = F("float",1);
        final static Functor FUNCTOR_atomic_1 = F("atomic",1);
        final static Functor FUNCTOR_compound_1 = F("compound",1);
        final static Functor FUNCTOR_nonvar_1 = F("nonvar",1);
        final static Functor FUNCTOR_number_1 = F("number",1);
        final static Functor FUNCTOR_java_1 = F("java",1);
        final static Functor FUNCTOR_java_2 = F("java",2);
        final static Functor FUNCTOR_closure_1 = F("closure",1);
        final static Functor FUNCTOR_ground_1 = F("ground",1);
        final static Functor FUNCTOR_callable_1 = F("callable",1);
        final static Functor FUNCTOR_$003D$003D_2 = F("==",2);
        final static Functor FUNCTOR_$0024equality_of_term_2 = F("$equality_of_term",2);
        final static Functor FUNCTOR_$005C$003D$003D_2 = F("\\==",2);
        final static Functor FUNCTOR_$0024inequality_of_term_2 = F("$inequality_of_term",2);
        final static Functor FUNCTOR_$003D$0040$003D_2 = F("=@=",2);
        final static Functor FUNCTOR_$0024variant_2 = F("$variant",2);
        final static Functor FUNCTOR_$005C$003D$0040$003D_2 = F("\\=@=",2);
        final static Functor FUNCTOR_$0024not_variant_2 = F("$not_variant",2);
        final static Functor FUNCTOR_$0040$003C_2 = F("@<",2);
        final static Functor FUNCTOR_$0024before_2 = F("$before",2);
        final static Functor FUNCTOR_$0040$003E_2 = F("@>",2);
        final static Functor FUNCTOR_$0024after_2 = F("$after",2);
        final static Functor FUNCTOR_$0040$003D$003C_2 = F("@=<",2);
        final static Functor FUNCTOR_$0024not_after_2 = F("$not_after",2);
        final static Functor FUNCTOR_$0040$003E$003D_2 = F("@>=",2);
        final static Functor FUNCTOR_$0024not_before_2 = F("$not_before",2);
        final static Functor FUNCTOR_$003F$003D_2 = F("?=",2);
        final static Functor FUNCTOR_$0024identical_or_cannot_unify_2 = F("$identical_or_cannot_unify",2);
        final static Functor FUNCTOR_compare_3 = F("compare",3);
        final static Functor FUNCTOR_sort_2 = F("sort",2);
        final static Functor FUNCTOR_keysort_2 = F("keysort",2);
        final static Functor FUNCTOR_arg_3 = F("arg",3);
        final static Functor FUNCTOR_functor_3 = F("functor",3);
        final static Functor FUNCTOR_$003D$002E$002E_2 = F("=..",2);
        final static Functor FUNCTOR_$0024univ_2 = F("$univ",2);
        final static Functor FUNCTOR_copy_term_2 = F("copy_term",2);
        final static Functor FUNCTOR_is_2 = F("is",2);
        final static Functor FUNCTOR_$0024abs_2 = F("$abs",2);
        final static Functor FUNCTOR_$0024asin_2 = F("$asin",2);
        final static Functor FUNCTOR_$0024acos_2 = F("$acos",2);
        final static Functor FUNCTOR_$0024atan_2 = F("$atan",2);
        final static Functor FUNCTOR_$0024bitwise_conj_3 = F("$bitwise_conj",3);
        final static Functor FUNCTOR_$0024bitwise_disj_3 = F("$bitwise_disj",3);
        final static Functor FUNCTOR_$0024bitwise_exclusive_or_3 = F("$bitwise_exclusive_or",3);
        final static Functor FUNCTOR_$0024bitwise_neg_2 = F("$bitwise_neg",2);
        final static Functor FUNCTOR_$0024ceil_2 = F("$ceil",2);
        final static Functor FUNCTOR_$0024cos_2 = F("$cos",2);
        final static Functor FUNCTOR_$0024degrees_2 = F("$degrees",2);
        final static Functor FUNCTOR_$0024exp_2 = F("$exp",2);
        final static Functor FUNCTOR_$0024float_2 = F("$float",2);
        final static Functor FUNCTOR_$0024float_integer_part_2 = F("$float_integer_part",2);
        final static Functor FUNCTOR_$0024float_fractional_part_2 = F("$float_fractional_part",2);
        final static Functor FUNCTOR_$0024float_quotient_3 = F("$float_quotient",3);
        final static Functor FUNCTOR_$0024floor_2 = F("$floor",2);
        final static Functor FUNCTOR_$0024int_quotient_3 = F("$int_quotient",3);
        final static Functor FUNCTOR_$0024log_2 = F("$log",2);
        final static Functor FUNCTOR_$0024max_3 = F("$max",3);
        final static Functor FUNCTOR_$0024min_3 = F("$min",3);
        final static Functor FUNCTOR_$0024minus_3 = F("$minus",3);
        final static Functor FUNCTOR_$0024mod_3 = F("$mod",3);
        final static Functor FUNCTOR_$0024multi_3 = F("$multi",3);
        final static Functor FUNCTOR_$0024plus_3 = F("$plus",3);
        final static Functor FUNCTOR_$0024pow_3 = F("$pow",3);
        final static Functor FUNCTOR_$0024radians_2 = F("$radians",2);
        final static Functor FUNCTOR_$0024rint_2 = F("$rint",2);
        final static Functor FUNCTOR_$0024round_2 = F("$round",2);
        final static Functor FUNCTOR_$0024shift_left_3 = F("$shift_left",3);
        final static Functor FUNCTOR_$0024shift_right_3 = F("$shift_right",3);
        final static Functor FUNCTOR_$0024sign_2 = F("$sign",2);
        final static Functor FUNCTOR_$0024sin_2 = F("$sin",2);
        final static Functor FUNCTOR_$0024sqrt_2 = F("$sqrt",2);
        final static Functor FUNCTOR_$0024tan_2 = F("$tan",2);
        final static Functor FUNCTOR_$0024truncate_2 = F("$truncate",2);
        final static Functor FUNCTOR_$003D$003A$003D_2 = F("=:=",2);
        final static Functor FUNCTOR_$0024arith_equal_2 = F("$arith_equal",2);
        final static Functor FUNCTOR_$003D$005C$003D_2 = F("=\\=",2);
        final static Functor FUNCTOR_$0024arith_not_equal_2 = F("$arith_not_equal",2);
        final static Functor FUNCTOR_$003C_2 = F("<",2);
        final static Functor FUNCTOR_$0024less_than_2 = F("$less_than",2);
        final static Functor FUNCTOR_$003D$003C_2 = F("=<",2);
        final static Functor FUNCTOR_$0024less_or_equal_2 = F("$less_or_equal",2);
        final static Functor FUNCTOR_$003E_2 = F(">",2);
        final static Functor FUNCTOR_$0024greater_than_2 = F("$greater_than",2);
        final static Functor FUNCTOR_$003E$003D_2 = F(">=",2);
        final static Functor FUNCTOR_$0024greater_or_equal_2 = F("$greater_or_equal",2);
        final static Functor FUNCTOR_clause_2 = F("clause",2);
        final static Functor FUNCTOR_initialization_2 = F("initialization",2);
        final static Functor FUNCTOR_$0024new_indexing_hash_3 = F("$new_indexing_hash",3);
        final static Functor FUNCTOR_assert_1 = F("assert",1);
        final static Functor FUNCTOR_assertz_1 = F("assertz",1);
        final static Functor FUNCTOR_asserta_1 = F("asserta",1);
        final static Functor FUNCTOR_retract_1 = F("retract",1);
        final static Functor FUNCTOR_abolish_1 = F("abolish",1);
        final static Functor FUNCTOR_retractall_1 = F("retractall",1);
        final static Functor FUNCTOR_findall_3 = F("findall",3);
        final static Functor FUNCTOR_bagof_3 = F("bagof",3);
        final static Functor FUNCTOR_setof_3 = F("setof",3);
        final static Functor FUNCTOR_current_input_1 = F("current_input",1);
        final static Functor FUNCTOR_current_output_1 = F("current_output",1);
        final static Functor FUNCTOR_set_input_1 = F("set_input",1);
        final static Functor FUNCTOR_set_output_1 = F("set_output",1);
        final static Functor FUNCTOR_open_3 = F("open",3);
        final static Functor FUNCTOR_open_4 = F("open",4);
        final static Functor FUNCTOR_close_1 = F("close",1);
        final static Functor FUNCTOR_close_2 = F("close",2);
        final static Functor FUNCTOR_flush_output_1 = F("flush_output",1);
        final static Functor ATOM_flush_output = SYM("flush_output");
        final static Functor FUNCTOR_stream_property_2 = F("stream_property",2);
        final static Functor FUNCTOR_get_char_1 = F("get_char",1);
        final static Functor FUNCTOR_get_char_2 = F("get_char",2);
        final static Functor FUNCTOR_get_code_1 = F("get_code",1);
        final static Functor FUNCTOR_get_code_2 = F("get_code",2);
        final static Functor FUNCTOR_peek_char_1 = F("peek_char",1);
        final static Functor FUNCTOR_peek_char_2 = F("peek_char",2);
        final static Functor FUNCTOR_peek_code_1 = F("peek_code",1);
        final static Functor FUNCTOR_peek_code_2 = F("peek_code",2);
        final static Functor FUNCTOR_put_char_1 = F("put_char",1);
        final static Functor FUNCTOR_put_char_2 = F("put_char",2);
        final static Functor FUNCTOR_put_code_1 = F("put_code",1);
        final static Functor FUNCTOR_put_code_2 = F("put_code",2);
        final static Functor ATOM_nl = SYM("nl");
        final static Functor FUNCTOR_nl_1 = F("nl",1);
        final static Functor FUNCTOR_get0_1 = F("get0",1);
        final static Functor FUNCTOR_get0_2 = F("get0",2);
        final static Functor FUNCTOR_get_1 = F("get",1);
        final static Functor FUNCTOR_get_2 = F("get",2);
        final static Functor FUNCTOR_put_1 = F("put",1);
        final static Functor FUNCTOR_put_2 = F("put",2);
        final static Functor FUNCTOR_tab_1 = F("tab",1);
        final static Functor FUNCTOR_tab_2 = F("tab",2);
        final static Functor FUNCTOR_skip_1 = F("skip",1);
        final static Functor FUNCTOR_skip_2 = F("skip",2);
        final static Functor FUNCTOR_get_byte_1 = F("get_byte",1);
        final static Functor FUNCTOR_get_byte_2 = F("get_byte",2);
        final static Functor FUNCTOR_peek_byte_1 = F("peek_byte",1);
        final static Functor FUNCTOR_peek_byte_2 = F("peek_byte",2);
        final static Functor FUNCTOR_put_byte_1 = F("put_byte",1);
        final static Functor FUNCTOR_put_byte_2 = F("put_byte",2);
        final static Functor FUNCTOR_read_1 = F("read",1);
        final static Functor FUNCTOR_read_2 = F("read",2);
        final static Functor FUNCTOR_read_with_variables_2 = F("read_with_variables",2);
        final static Functor FUNCTOR_read_with_variables_3 = F("read_with_variables",3);
        final static Functor FUNCTOR_read_line_1 = F("read_line",1);
        final static Functor FUNCTOR_read_line_2 = F("read_line",2);
        final static Functor FUNCTOR_write_1 = F("write",1);
        final static Functor FUNCTOR_write_2 = F("write",2);
        final static Functor FUNCTOR_writeq_1 = F("writeq",1);
        final static Functor FUNCTOR_writeq_2 = F("writeq",2);
        final static Functor FUNCTOR_write_canonical_1 = F("write_canonical",1);
        final static Functor FUNCTOR_write_canonical_2 = F("write_canonical",2);
        final static Functor FUNCTOR_write_term_2 = F("write_term",2);
        final static Functor FUNCTOR_write_term_3 = F("write_term",3);
        final static Functor FUNCTOR_op_3 = F("op",3);
        final static Functor FUNCTOR_current_op_3 = F("current_op",3);
        final static Functor FUNCTOR_$005C$002B_1 = F("\\+",1);
        final static Functor FUNCTOR_once_1 = F("once",1);
        final static Functor ATOM_repeat = SYM("repeat");
        final static Functor FUNCTOR_atom_length_2 = F("atom_length",2);
        final static Functor FUNCTOR_atom_concat_3 = F("atom_concat",3);
        final static Functor FUNCTOR_sub_atom_5 = F("sub_atom",5);
        final static Functor FUNCTOR_atom_chars_2 = F("atom_chars",2);
        final static Functor FUNCTOR_atom_codes_2 = F("atom_codes",2);
        final static Functor FUNCTOR_char_code_2 = F("char_code",2);
        final static Functor FUNCTOR_number_chars_2 = F("number_chars",2);
        final static Functor FUNCTOR_number_codes_2 = F("number_codes",2);
        final static Functor FUNCTOR_name_2 = F("name",2);
        final static Functor FUNCTOR_set_prolog_flag_2 = F("set_prolog_flag",2);
        final static Functor FUNCTOR_current_prolog_flag_2 = F("current_prolog_flag",2);
        final static Functor ATOM_halt = SYM("halt");
        final static Functor FUNCTOR_halt_1 = F("halt",1);
        final static Functor ATOM_abort = SYM("abort");
        final static Functor FUNCTOR_C_3 = F("C",3);
        final static Functor FUNCTOR_expand_term_2 = F("expand_term",2);
        final static Functor FUNCTOR_new_hash_1 = F("new_hash",1);
        final static Functor FUNCTOR_new_hash_2 = F("new_hash",2);
        final static Functor FUNCTOR_hash_clear_1 = F("hash_clear",1);
        final static Functor FUNCTOR_hash_contains_key_2 = F("hash_contains_key",2);
        final static Functor FUNCTOR_hash_get_3 = F("hash_get",3);
        final static Functor FUNCTOR_hash_is_empty_1 = F("hash_is_empty",1);
        final static Functor FUNCTOR_hash_keys_2 = F("hash_keys",2);
        final static Functor FUNCTOR_hash_map_2 = F("hash_map",2);
        final static Functor FUNCTOR_hash_put_3 = F("hash_put",3);
        final static Functor FUNCTOR_hash_remove_2 = F("hash_remove",2);
        final static Functor FUNCTOR_hash_size_2 = F("hash_size",2);
        final static Functor FUNCTOR_$0024get_hash_manager_1 = F("$get_hash_manager",1);
        final static Functor FUNCTOR_java_constructor0_2 = F("java_constructor0",2);
        final static Functor FUNCTOR_java_constructor_2 = F("java_constructor",2);
        final static Functor FUNCTOR_java_declared_constructor0_2 = F("java_declared_constructor0",2);
        final static Functor FUNCTOR_java_declared_constructor_2 = F("java_declared_constructor",2);
        final static Functor FUNCTOR_java_method0_3 = F("java_method0",3);
        final static Functor FUNCTOR_java_method_3 = F("java_method",3);
        final static Functor FUNCTOR_java_declared_method0_3 = F("java_declared_method0",3);
        final static Functor FUNCTOR_java_declared_method_3 = F("java_declared_method",3);
        final static Functor FUNCTOR_java_get_field0_3 = F("java_get_field0",3);
        final static Functor FUNCTOR_java_get_field_3 = F("java_get_field",3);
        final static Functor FUNCTOR_java_get_declared_field0_3 = F("java_get_declared_field0",3);
        final static Functor FUNCTOR_java_get_declared_field_3 = F("java_get_declared_field",3);
        final static Functor FUNCTOR_java_set_field0_3 = F("java_set_field0",3);
        final static Functor FUNCTOR_java_set_field_3 = F("java_set_field",3);
        final static Functor FUNCTOR_java_set_declared_field0_3 = F("java_set_declared_field0",3);
        final static Functor FUNCTOR_java_set_declared_field_3 = F("java_set_declared_field",3);
        final static Functor FUNCTOR_synchronized_2 = F("synchronized",2);
        final static Functor FUNCTOR_java_conversion_2 = F("java_conversion",2);
        final static Functor ATOM_cafeteria = SYM("cafeteria");
        final static Functor FUNCTOR_consult_1 = F("consult",1);
        final static Functor ATOM_trace = SYM("trace");
        final static Functor ATOM_notrace = SYM("notrace");
        final static Functor ATOM_debug = SYM("debug");
        final static Functor ATOM_nodebug = SYM("nodebug");
        final static Functor FUNCTOR_leash_1 = F("leash",1);
        final static Functor FUNCTOR_spy_1 = F("spy",1);
        final static Functor FUNCTOR_nospy_1 = F("nospy",1);
        final static Functor ATOM_nospyall = SYM("nospyall");
        final static Functor ATOM_listing = SYM("listing");
        final static Functor FUNCTOR_listing_1 = F("listing",1);
        final static Functor FUNCTOR_length_2 = F("length",2);
        final static Functor FUNCTOR_numbervars_3 = F("numbervars",3);
        final static Functor FUNCTOR_statistics_2 = F("statistics",2);
        final static Functor ATOM_system_predicate_ext = SYM("system_predicate_ext");




    public static Operation PRED_system_predicate_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_system::system_predicate_1_var, FILE_system::system_predicate_1_245, FILE_system::system_predicate_1_245, FILE_system::system_predicate_1_con, FILE_system::system_predicate_1_str, FILE_system::system_predicate_1_245); 
    }

    private final static Operation system_predicate_1_var(Prolog m) { 
        m.jtry1(null, FILE_system::system_predicate_1_var_1);
        return system_predicate_1_1(m);
    }

    private final static Operation system_predicate_1_var_1(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_2);
        return system_predicate_1_2(m);
    }

    private final static Operation system_predicate_1_var_2(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_3);
        return system_predicate_1_3(m);
    }

    private final static Operation system_predicate_1_var_3(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_4);
        return system_predicate_1_4(m);
    }

    private final static Operation system_predicate_1_var_4(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_5);
        return system_predicate_1_5(m);
    }

    private final static Operation system_predicate_1_var_5(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_6);
        return system_predicate_1_6(m);
    }

    private final static Operation system_predicate_1_var_6(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_7);
        return system_predicate_1_7(m);
    }

    private final static Operation system_predicate_1_var_7(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_8);
        return system_predicate_1_8(m);
    }

    private final static Operation system_predicate_1_var_8(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_9);
        return system_predicate_1_9(m);
    }

    private final static Operation system_predicate_1_var_9(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_10);
        return system_predicate_1_10(m);
    }

    private final static Operation system_predicate_1_var_10(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_11);
        return system_predicate_1_11(m);
    }

    private final static Operation system_predicate_1_var_11(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_12);
        return system_predicate_1_12(m);
    }

    private final static Operation system_predicate_1_var_12(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_13);
        return system_predicate_1_13(m);
    }

    private final static Operation system_predicate_1_var_13(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_14);
        return system_predicate_1_14(m);
    }

    private final static Operation system_predicate_1_var_14(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_15);
        return system_predicate_1_15(m);
    }

    private final static Operation system_predicate_1_var_15(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_16);
        return system_predicate_1_16(m);
    }

    private final static Operation system_predicate_1_var_16(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_17);
        return system_predicate_1_17(m);
    }

    private final static Operation system_predicate_1_var_17(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_18);
        return system_predicate_1_18(m);
    }

    private final static Operation system_predicate_1_var_18(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_19);
        return system_predicate_1_19(m);
    }

    private final static Operation system_predicate_1_var_19(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_20);
        return system_predicate_1_20(m);
    }

    private final static Operation system_predicate_1_var_20(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_21);
        return system_predicate_1_21(m);
    }

    private final static Operation system_predicate_1_var_21(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_22);
        return system_predicate_1_22(m);
    }

    private final static Operation system_predicate_1_var_22(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_23);
        return system_predicate_1_23(m);
    }

    private final static Operation system_predicate_1_var_23(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_24);
        return system_predicate_1_24(m);
    }

    private final static Operation system_predicate_1_var_24(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_25);
        return system_predicate_1_25(m);
    }

    private final static Operation system_predicate_1_var_25(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_26);
        return system_predicate_1_26(m);
    }

    private final static Operation system_predicate_1_var_26(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_27);
        return system_predicate_1_27(m);
    }

    private final static Operation system_predicate_1_var_27(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_28);
        return system_predicate_1_28(m);
    }

    private final static Operation system_predicate_1_var_28(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_29);
        return system_predicate_1_29(m);
    }

    private final static Operation system_predicate_1_var_29(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_30);
        return system_predicate_1_30(m);
    }

    private final static Operation system_predicate_1_var_30(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_31);
        return system_predicate_1_31(m);
    }

    private final static Operation system_predicate_1_var_31(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_32);
        return system_predicate_1_32(m);
    }

    private final static Operation system_predicate_1_var_32(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_33);
        return system_predicate_1_33(m);
    }

    private final static Operation system_predicate_1_var_33(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_34);
        return system_predicate_1_34(m);
    }

    private final static Operation system_predicate_1_var_34(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_35);
        return system_predicate_1_35(m);
    }

    private final static Operation system_predicate_1_var_35(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_36);
        return system_predicate_1_36(m);
    }

    private final static Operation system_predicate_1_var_36(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_37);
        return system_predicate_1_37(m);
    }

    private final static Operation system_predicate_1_var_37(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_38);
        return system_predicate_1_38(m);
    }

    private final static Operation system_predicate_1_var_38(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_39);
        return system_predicate_1_39(m);
    }

    private final static Operation system_predicate_1_var_39(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_40);
        return system_predicate_1_40(m);
    }

    private final static Operation system_predicate_1_var_40(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_41);
        return system_predicate_1_41(m);
    }

    private final static Operation system_predicate_1_var_41(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_42);
        return system_predicate_1_42(m);
    }

    private final static Operation system_predicate_1_var_42(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_43);
        return system_predicate_1_43(m);
    }

    private final static Operation system_predicate_1_var_43(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_44);
        return system_predicate_1_44(m);
    }

    private final static Operation system_predicate_1_var_44(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_45);
        return system_predicate_1_45(m);
    }

    private final static Operation system_predicate_1_var_45(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_46);
        return system_predicate_1_46(m);
    }

    private final static Operation system_predicate_1_var_46(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_47);
        return system_predicate_1_47(m);
    }

    private final static Operation system_predicate_1_var_47(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_48);
        return system_predicate_1_48(m);
    }

    private final static Operation system_predicate_1_var_48(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_49);
        return system_predicate_1_49(m);
    }

    private final static Operation system_predicate_1_var_49(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_50);
        return system_predicate_1_50(m);
    }

    private final static Operation system_predicate_1_var_50(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_51);
        return system_predicate_1_51(m);
    }

    private final static Operation system_predicate_1_var_51(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_52);
        return system_predicate_1_52(m);
    }

    private final static Operation system_predicate_1_var_52(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_53);
        return system_predicate_1_53(m);
    }

    private final static Operation system_predicate_1_var_53(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_54);
        return system_predicate_1_54(m);
    }

    private final static Operation system_predicate_1_var_54(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_55);
        return system_predicate_1_55(m);
    }

    private final static Operation system_predicate_1_var_55(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_56);
        return system_predicate_1_56(m);
    }

    private final static Operation system_predicate_1_var_56(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_57);
        return system_predicate_1_57(m);
    }

    private final static Operation system_predicate_1_var_57(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_58);
        return system_predicate_1_58(m);
    }

    private final static Operation system_predicate_1_var_58(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_59);
        return system_predicate_1_59(m);
    }

    private final static Operation system_predicate_1_var_59(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_60);
        return system_predicate_1_60(m);
    }

    private final static Operation system_predicate_1_var_60(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_61);
        return system_predicate_1_61(m);
    }

    private final static Operation system_predicate_1_var_61(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_62);
        return system_predicate_1_62(m);
    }

    private final static Operation system_predicate_1_var_62(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_63);
        return system_predicate_1_63(m);
    }

    private final static Operation system_predicate_1_var_63(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_64);
        return system_predicate_1_64(m);
    }

    private final static Operation system_predicate_1_var_64(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_65);
        return system_predicate_1_65(m);
    }

    private final static Operation system_predicate_1_var_65(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_66);
        return system_predicate_1_66(m);
    }

    private final static Operation system_predicate_1_var_66(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_67);
        return system_predicate_1_67(m);
    }

    private final static Operation system_predicate_1_var_67(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_68);
        return system_predicate_1_68(m);
    }

    private final static Operation system_predicate_1_var_68(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_69);
        return system_predicate_1_69(m);
    }

    private final static Operation system_predicate_1_var_69(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_70);
        return system_predicate_1_70(m);
    }

    private final static Operation system_predicate_1_var_70(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_71);
        return system_predicate_1_71(m);
    }

    private final static Operation system_predicate_1_var_71(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_72);
        return system_predicate_1_72(m);
    }

    private final static Operation system_predicate_1_var_72(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_73);
        return system_predicate_1_73(m);
    }

    private final static Operation system_predicate_1_var_73(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_74);
        return system_predicate_1_74(m);
    }

    private final static Operation system_predicate_1_var_74(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_75);
        return system_predicate_1_75(m);
    }

    private final static Operation system_predicate_1_var_75(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_76);
        return system_predicate_1_76(m);
    }

    private final static Operation system_predicate_1_var_76(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_77);
        return system_predicate_1_77(m);
    }

    private final static Operation system_predicate_1_var_77(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_78);
        return system_predicate_1_78(m);
    }

    private final static Operation system_predicate_1_var_78(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_79);
        return system_predicate_1_79(m);
    }

    private final static Operation system_predicate_1_var_79(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_80);
        return system_predicate_1_80(m);
    }

    private final static Operation system_predicate_1_var_80(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_81);
        return system_predicate_1_81(m);
    }

    private final static Operation system_predicate_1_var_81(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_82);
        return system_predicate_1_82(m);
    }

    private final static Operation system_predicate_1_var_82(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_83);
        return system_predicate_1_83(m);
    }

    private final static Operation system_predicate_1_var_83(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_84);
        return system_predicate_1_84(m);
    }

    private final static Operation system_predicate_1_var_84(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_85);
        return system_predicate_1_85(m);
    }

    private final static Operation system_predicate_1_var_85(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_86);
        return system_predicate_1_86(m);
    }

    private final static Operation system_predicate_1_var_86(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_87);
        return system_predicate_1_87(m);
    }

    private final static Operation system_predicate_1_var_87(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_88);
        return system_predicate_1_88(m);
    }

    private final static Operation system_predicate_1_var_88(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_89);
        return system_predicate_1_89(m);
    }

    private final static Operation system_predicate_1_var_89(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_90);
        return system_predicate_1_90(m);
    }

    private final static Operation system_predicate_1_var_90(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_91);
        return system_predicate_1_91(m);
    }

    private final static Operation system_predicate_1_var_91(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_92);
        return system_predicate_1_92(m);
    }

    private final static Operation system_predicate_1_var_92(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_93);
        return system_predicate_1_93(m);
    }

    private final static Operation system_predicate_1_var_93(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_94);
        return system_predicate_1_94(m);
    }

    private final static Operation system_predicate_1_var_94(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_95);
        return system_predicate_1_95(m);
    }

    private final static Operation system_predicate_1_var_95(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_96);
        return system_predicate_1_96(m);
    }

    private final static Operation system_predicate_1_var_96(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_97);
        return system_predicate_1_97(m);
    }

    private final static Operation system_predicate_1_var_97(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_98);
        return system_predicate_1_98(m);
    }

    private final static Operation system_predicate_1_var_98(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_99);
        return system_predicate_1_99(m);
    }

    private final static Operation system_predicate_1_var_99(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_100);
        return system_predicate_1_100(m);
    }

    private final static Operation system_predicate_1_var_100(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_101);
        return system_predicate_1_101(m);
    }

    private final static Operation system_predicate_1_var_101(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_102);
        return system_predicate_1_102(m);
    }

    private final static Operation system_predicate_1_var_102(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_103);
        return system_predicate_1_103(m);
    }

    private final static Operation system_predicate_1_var_103(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_104);
        return system_predicate_1_104(m);
    }

    private final static Operation system_predicate_1_var_104(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_105);
        return system_predicate_1_105(m);
    }

    private final static Operation system_predicate_1_var_105(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_106);
        return system_predicate_1_106(m);
    }

    private final static Operation system_predicate_1_var_106(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_107);
        return system_predicate_1_107(m);
    }

    private final static Operation system_predicate_1_var_107(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_108);
        return system_predicate_1_108(m);
    }

    private final static Operation system_predicate_1_var_108(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_109);
        return system_predicate_1_109(m);
    }

    private final static Operation system_predicate_1_var_109(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_110);
        return system_predicate_1_110(m);
    }

    private final static Operation system_predicate_1_var_110(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_111);
        return system_predicate_1_111(m);
    }

    private final static Operation system_predicate_1_var_111(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_112);
        return system_predicate_1_112(m);
    }

    private final static Operation system_predicate_1_var_112(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_113);
        return system_predicate_1_113(m);
    }

    private final static Operation system_predicate_1_var_113(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_114);
        return system_predicate_1_114(m);
    }

    private final static Operation system_predicate_1_var_114(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_115);
        return system_predicate_1_115(m);
    }

    private final static Operation system_predicate_1_var_115(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_116);
        return system_predicate_1_116(m);
    }

    private final static Operation system_predicate_1_var_116(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_117);
        return system_predicate_1_117(m);
    }

    private final static Operation system_predicate_1_var_117(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_118);
        return system_predicate_1_118(m);
    }

    private final static Operation system_predicate_1_var_118(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_119);
        return system_predicate_1_119(m);
    }

    private final static Operation system_predicate_1_var_119(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_120);
        return system_predicate_1_120(m);
    }

    private final static Operation system_predicate_1_var_120(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_121);
        return system_predicate_1_121(m);
    }

    private final static Operation system_predicate_1_var_121(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_122);
        return system_predicate_1_122(m);
    }

    private final static Operation system_predicate_1_var_122(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_123);
        return system_predicate_1_123(m);
    }

    private final static Operation system_predicate_1_var_123(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_124);
        return system_predicate_1_124(m);
    }

    private final static Operation system_predicate_1_var_124(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_125);
        return system_predicate_1_125(m);
    }

    private final static Operation system_predicate_1_var_125(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_126);
        return system_predicate_1_126(m);
    }

    private final static Operation system_predicate_1_var_126(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_127);
        return system_predicate_1_127(m);
    }

    private final static Operation system_predicate_1_var_127(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_128);
        return system_predicate_1_128(m);
    }

    private final static Operation system_predicate_1_var_128(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_129);
        return system_predicate_1_129(m);
    }

    private final static Operation system_predicate_1_var_129(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_130);
        return system_predicate_1_130(m);
    }

    private final static Operation system_predicate_1_var_130(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_131);
        return system_predicate_1_131(m);
    }

    private final static Operation system_predicate_1_var_131(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_132);
        return system_predicate_1_132(m);
    }

    private final static Operation system_predicate_1_var_132(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_133);
        return system_predicate_1_133(m);
    }

    private final static Operation system_predicate_1_var_133(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_134);
        return system_predicate_1_134(m);
    }

    private final static Operation system_predicate_1_var_134(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_135);
        return system_predicate_1_135(m);
    }

    private final static Operation system_predicate_1_var_135(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_136);
        return system_predicate_1_136(m);
    }

    private final static Operation system_predicate_1_var_136(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_137);
        return system_predicate_1_137(m);
    }

    private final static Operation system_predicate_1_var_137(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_138);
        return system_predicate_1_138(m);
    }

    private final static Operation system_predicate_1_var_138(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_139);
        return system_predicate_1_139(m);
    }

    private final static Operation system_predicate_1_var_139(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_140);
        return system_predicate_1_140(m);
    }

    private final static Operation system_predicate_1_var_140(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_141);
        return system_predicate_1_141(m);
    }

    private final static Operation system_predicate_1_var_141(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_142);
        return system_predicate_1_142(m);
    }

    private final static Operation system_predicate_1_var_142(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_143);
        return system_predicate_1_143(m);
    }

    private final static Operation system_predicate_1_var_143(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_144);
        return system_predicate_1_144(m);
    }

    private final static Operation system_predicate_1_var_144(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_145);
        return system_predicate_1_145(m);
    }

    private final static Operation system_predicate_1_var_145(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_146);
        return system_predicate_1_146(m);
    }

    private final static Operation system_predicate_1_var_146(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_147);
        return system_predicate_1_147(m);
    }

    private final static Operation system_predicate_1_var_147(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_148);
        return system_predicate_1_148(m);
    }

    private final static Operation system_predicate_1_var_148(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_149);
        return system_predicate_1_149(m);
    }

    private final static Operation system_predicate_1_var_149(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_150);
        return system_predicate_1_150(m);
    }

    private final static Operation system_predicate_1_var_150(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_151);
        return system_predicate_1_151(m);
    }

    private final static Operation system_predicate_1_var_151(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_152);
        return system_predicate_1_152(m);
    }

    private final static Operation system_predicate_1_var_152(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_153);
        return system_predicate_1_153(m);
    }

    private final static Operation system_predicate_1_var_153(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_154);
        return system_predicate_1_154(m);
    }

    private final static Operation system_predicate_1_var_154(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_155);
        return system_predicate_1_155(m);
    }

    private final static Operation system_predicate_1_var_155(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_156);
        return system_predicate_1_156(m);
    }

    private final static Operation system_predicate_1_var_156(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_157);
        return system_predicate_1_157(m);
    }

    private final static Operation system_predicate_1_var_157(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_158);
        return system_predicate_1_158(m);
    }

    private final static Operation system_predicate_1_var_158(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_159);
        return system_predicate_1_159(m);
    }

    private final static Operation system_predicate_1_var_159(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_160);
        return system_predicate_1_160(m);
    }

    private final static Operation system_predicate_1_var_160(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_161);
        return system_predicate_1_161(m);
    }

    private final static Operation system_predicate_1_var_161(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_162);
        return system_predicate_1_162(m);
    }

    private final static Operation system_predicate_1_var_162(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_163);
        return system_predicate_1_163(m);
    }

    private final static Operation system_predicate_1_var_163(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_164);
        return system_predicate_1_164(m);
    }

    private final static Operation system_predicate_1_var_164(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_165);
        return system_predicate_1_165(m);
    }

    private final static Operation system_predicate_1_var_165(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_166);
        return system_predicate_1_166(m);
    }

    private final static Operation system_predicate_1_var_166(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_167);
        return system_predicate_1_167(m);
    }

    private final static Operation system_predicate_1_var_167(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_168);
        return system_predicate_1_168(m);
    }

    private final static Operation system_predicate_1_var_168(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_169);
        return system_predicate_1_169(m);
    }

    private final static Operation system_predicate_1_var_169(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_170);
        return system_predicate_1_170(m);
    }

    private final static Operation system_predicate_1_var_170(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_171);
        return system_predicate_1_171(m);
    }

    private final static Operation system_predicate_1_var_171(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_172);
        return system_predicate_1_172(m);
    }

    private final static Operation system_predicate_1_var_172(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_173);
        return system_predicate_1_173(m);
    }

    private final static Operation system_predicate_1_var_173(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_174);
        return system_predicate_1_174(m);
    }

    private final static Operation system_predicate_1_var_174(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_175);
        return system_predicate_1_175(m);
    }

    private final static Operation system_predicate_1_var_175(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_176);
        return system_predicate_1_176(m);
    }

    private final static Operation system_predicate_1_var_176(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_177);
        return system_predicate_1_177(m);
    }

    private final static Operation system_predicate_1_var_177(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_178);
        return system_predicate_1_178(m);
    }

    private final static Operation system_predicate_1_var_178(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_179);
        return system_predicate_1_179(m);
    }

    private final static Operation system_predicate_1_var_179(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_180);
        return system_predicate_1_180(m);
    }

    private final static Operation system_predicate_1_var_180(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_181);
        return system_predicate_1_181(m);
    }

    private final static Operation system_predicate_1_var_181(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_182);
        return system_predicate_1_182(m);
    }

    private final static Operation system_predicate_1_var_182(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_183);
        return system_predicate_1_183(m);
    }

    private final static Operation system_predicate_1_var_183(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_184);
        return system_predicate_1_184(m);
    }

    private final static Operation system_predicate_1_var_184(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_185);
        return system_predicate_1_185(m);
    }

    private final static Operation system_predicate_1_var_185(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_186);
        return system_predicate_1_186(m);
    }

    private final static Operation system_predicate_1_var_186(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_187);
        return system_predicate_1_187(m);
    }

    private final static Operation system_predicate_1_var_187(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_188);
        return system_predicate_1_188(m);
    }

    private final static Operation system_predicate_1_var_188(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_189);
        return system_predicate_1_189(m);
    }

    private final static Operation system_predicate_1_var_189(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_190);
        return system_predicate_1_190(m);
    }

    private final static Operation system_predicate_1_var_190(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_191);
        return system_predicate_1_191(m);
    }

    private final static Operation system_predicate_1_var_191(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_192);
        return system_predicate_1_192(m);
    }

    private final static Operation system_predicate_1_var_192(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_193);
        return system_predicate_1_193(m);
    }

    private final static Operation system_predicate_1_var_193(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_194);
        return system_predicate_1_194(m);
    }

    private final static Operation system_predicate_1_var_194(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_195);
        return system_predicate_1_195(m);
    }

    private final static Operation system_predicate_1_var_195(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_196);
        return system_predicate_1_196(m);
    }

    private final static Operation system_predicate_1_var_196(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_197);
        return system_predicate_1_197(m);
    }

    private final static Operation system_predicate_1_var_197(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_198);
        return system_predicate_1_198(m);
    }

    private final static Operation system_predicate_1_var_198(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_199);
        return system_predicate_1_199(m);
    }

    private final static Operation system_predicate_1_var_199(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_200);
        return system_predicate_1_200(m);
    }

    private final static Operation system_predicate_1_var_200(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_201);
        return system_predicate_1_201(m);
    }

    private final static Operation system_predicate_1_var_201(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_202);
        return system_predicate_1_202(m);
    }

    private final static Operation system_predicate_1_var_202(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_203);
        return system_predicate_1_203(m);
    }

    private final static Operation system_predicate_1_var_203(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_204);
        return system_predicate_1_204(m);
    }

    private final static Operation system_predicate_1_var_204(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_205);
        return system_predicate_1_205(m);
    }

    private final static Operation system_predicate_1_var_205(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_206);
        return system_predicate_1_206(m);
    }

    private final static Operation system_predicate_1_var_206(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_207);
        return system_predicate_1_207(m);
    }

    private final static Operation system_predicate_1_var_207(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_208);
        return system_predicate_1_208(m);
    }

    private final static Operation system_predicate_1_var_208(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_209);
        return system_predicate_1_209(m);
    }

    private final static Operation system_predicate_1_var_209(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_210);
        return system_predicate_1_210(m);
    }

    private final static Operation system_predicate_1_var_210(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_211);
        return system_predicate_1_211(m);
    }

    private final static Operation system_predicate_1_var_211(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_212);
        return system_predicate_1_212(m);
    }

    private final static Operation system_predicate_1_var_212(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_213);
        return system_predicate_1_213(m);
    }

    private final static Operation system_predicate_1_var_213(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_214);
        return system_predicate_1_214(m);
    }

    private final static Operation system_predicate_1_var_214(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_215);
        return system_predicate_1_215(m);
    }

    private final static Operation system_predicate_1_var_215(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_216);
        return system_predicate_1_216(m);
    }

    private final static Operation system_predicate_1_var_216(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_217);
        return system_predicate_1_217(m);
    }

    private final static Operation system_predicate_1_var_217(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_218);
        return system_predicate_1_218(m);
    }

    private final static Operation system_predicate_1_var_218(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_219);
        return system_predicate_1_219(m);
    }

    private final static Operation system_predicate_1_var_219(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_220);
        return system_predicate_1_220(m);
    }

    private final static Operation system_predicate_1_var_220(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_221);
        return system_predicate_1_221(m);
    }

    private final static Operation system_predicate_1_var_221(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_222);
        return system_predicate_1_222(m);
    }

    private final static Operation system_predicate_1_var_222(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_223);
        return system_predicate_1_223(m);
    }

    private final static Operation system_predicate_1_var_223(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_224);
        return system_predicate_1_224(m);
    }

    private final static Operation system_predicate_1_var_224(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_225);
        return system_predicate_1_225(m);
    }

    private final static Operation system_predicate_1_var_225(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_226);
        return system_predicate_1_226(m);
    }

    private final static Operation system_predicate_1_var_226(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_227);
        return system_predicate_1_227(m);
    }

    private final static Operation system_predicate_1_var_227(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_228);
        return system_predicate_1_228(m);
    }

    private final static Operation system_predicate_1_var_228(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_229);
        return system_predicate_1_229(m);
    }

    private final static Operation system_predicate_1_var_229(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_230);
        return system_predicate_1_230(m);
    }

    private final static Operation system_predicate_1_var_230(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_231);
        return system_predicate_1_231(m);
    }

    private final static Operation system_predicate_1_var_231(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_232);
        return system_predicate_1_232(m);
    }

    private final static Operation system_predicate_1_var_232(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_233);
        return system_predicate_1_233(m);
    }

    private final static Operation system_predicate_1_var_233(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_234);
        return system_predicate_1_234(m);
    }

    private final static Operation system_predicate_1_var_234(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_235);
        return system_predicate_1_235(m);
    }

    private final static Operation system_predicate_1_var_235(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_236);
        return system_predicate_1_236(m);
    }

    private final static Operation system_predicate_1_var_236(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_237);
        return system_predicate_1_237(m);
    }

    private final static Operation system_predicate_1_var_237(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_238);
        return system_predicate_1_238(m);
    }

    private final static Operation system_predicate_1_var_238(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_239);
        return system_predicate_1_239(m);
    }

    private final static Operation system_predicate_1_var_239(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_240);
        return system_predicate_1_240(m);
    }

    private final static Operation system_predicate_1_var_240(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_241);
        return system_predicate_1_241(m);
    }

    private final static Operation system_predicate_1_var_241(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_242);
        return system_predicate_1_242(m);
    }

    private final static Operation system_predicate_1_var_242(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_243);
        return system_predicate_1_243(m);
    }

    private final static Operation system_predicate_1_var_243(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_var_244);
        return system_predicate_1_244(m);
    }

    private final static Operation system_predicate_1_var_244(Prolog m) { 
        m.trust(null);
        return system_predicate_1_245(m);
    }

    private final static Operation system_predicate_1_con(Prolog m) { 
        m.jtry1(null, FILE_system::system_predicate_1_con_1);
        return system_predicate_1_2(m);
    }

    private final static Operation system_predicate_1_con_1(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_2);
        return system_predicate_1_3(m);
    }

    private final static Operation system_predicate_1_con_2(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_3);
        return system_predicate_1_4(m);
    }

    private final static Operation system_predicate_1_con_3(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_4);
        return system_predicate_1_5(m);
    }

    private final static Operation system_predicate_1_con_4(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_5);
        return system_predicate_1_6(m);
    }

    private final static Operation system_predicate_1_con_5(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_6);
        return system_predicate_1_8(m);
    }

    private final static Operation system_predicate_1_con_6(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_7);
        return system_predicate_1_133(m);
    }

    private final static Operation system_predicate_1_con_7(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_8);
        return system_predicate_1_147(m);
    }

    private final static Operation system_predicate_1_con_8(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_9);
        return system_predicate_1_183(m);
    }

    private final static Operation system_predicate_1_con_9(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_10);
        return system_predicate_1_195(m);
    }

    private final static Operation system_predicate_1_con_10(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_11);
        return system_predicate_1_197(m);
    }

    private final static Operation system_predicate_1_con_11(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_12);
        return system_predicate_1_230(m);
    }

    private final static Operation system_predicate_1_con_12(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_13);
        return system_predicate_1_232(m);
    }

    private final static Operation system_predicate_1_con_13(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_14);
        return system_predicate_1_233(m);
    }

    private final static Operation system_predicate_1_con_14(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_15);
        return system_predicate_1_234(m);
    }

    private final static Operation system_predicate_1_con_15(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_16);
        return system_predicate_1_235(m);
    }

    private final static Operation system_predicate_1_con_16(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_17);
        return system_predicate_1_239(m);
    }

    private final static Operation system_predicate_1_con_17(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_con_18);
        return system_predicate_1_240(m);
    }

    private final static Operation system_predicate_1_con_18(Prolog m) { 
        m.trust(null);
        return system_predicate_1_245(m);
    }

    private final static Operation system_predicate_1_str(Prolog m) { 
        m.jtry1(null, FILE_system::system_predicate_1_str_1);
        return system_predicate_1_1(m);
    }

    private final static Operation system_predicate_1_str_1(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_2);
        return system_predicate_1_7(m);
    }

    private final static Operation system_predicate_1_str_2(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_3);
        return system_predicate_1_9(m);
    }

    private final static Operation system_predicate_1_str_3(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_4);
        return system_predicate_1_10(m);
    }

    private final static Operation system_predicate_1_str_4(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_5);
        return system_predicate_1_11(m);
    }

    private final static Operation system_predicate_1_str_5(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_6);
        return system_predicate_1_12(m);
    }

    private final static Operation system_predicate_1_str_6(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_7);
        return system_predicate_1_13(m);
    }

    private final static Operation system_predicate_1_str_7(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_8);
        return system_predicate_1_14(m);
    }

    private final static Operation system_predicate_1_str_8(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_9);
        return system_predicate_1_15(m);
    }

    private final static Operation system_predicate_1_str_9(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_10);
        return system_predicate_1_16(m);
    }

    private final static Operation system_predicate_1_str_10(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_11);
        return system_predicate_1_17(m);
    }

    private final static Operation system_predicate_1_str_11(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_12);
        return system_predicate_1_18(m);
    }

    private final static Operation system_predicate_1_str_12(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_13);
        return system_predicate_1_19(m);
    }

    private final static Operation system_predicate_1_str_13(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_14);
        return system_predicate_1_20(m);
    }

    private final static Operation system_predicate_1_str_14(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_15);
        return system_predicate_1_21(m);
    }

    private final static Operation system_predicate_1_str_15(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_16);
        return system_predicate_1_22(m);
    }

    private final static Operation system_predicate_1_str_16(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_17);
        return system_predicate_1_23(m);
    }

    private final static Operation system_predicate_1_str_17(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_18);
        return system_predicate_1_24(m);
    }

    private final static Operation system_predicate_1_str_18(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_19);
        return system_predicate_1_25(m);
    }

    private final static Operation system_predicate_1_str_19(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_20);
        return system_predicate_1_26(m);
    }

    private final static Operation system_predicate_1_str_20(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_21);
        return system_predicate_1_27(m);
    }

    private final static Operation system_predicate_1_str_21(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_22);
        return system_predicate_1_28(m);
    }

    private final static Operation system_predicate_1_str_22(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_23);
        return system_predicate_1_29(m);
    }

    private final static Operation system_predicate_1_str_23(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_24);
        return system_predicate_1_30(m);
    }

    private final static Operation system_predicate_1_str_24(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_25);
        return system_predicate_1_31(m);
    }

    private final static Operation system_predicate_1_str_25(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_26);
        return system_predicate_1_32(m);
    }

    private final static Operation system_predicate_1_str_26(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_27);
        return system_predicate_1_33(m);
    }

    private final static Operation system_predicate_1_str_27(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_28);
        return system_predicate_1_34(m);
    }

    private final static Operation system_predicate_1_str_28(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_29);
        return system_predicate_1_35(m);
    }

    private final static Operation system_predicate_1_str_29(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_30);
        return system_predicate_1_36(m);
    }

    private final static Operation system_predicate_1_str_30(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_31);
        return system_predicate_1_37(m);
    }

    private final static Operation system_predicate_1_str_31(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_32);
        return system_predicate_1_38(m);
    }

    private final static Operation system_predicate_1_str_32(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_33);
        return system_predicate_1_39(m);
    }

    private final static Operation system_predicate_1_str_33(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_34);
        return system_predicate_1_40(m);
    }

    private final static Operation system_predicate_1_str_34(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_35);
        return system_predicate_1_41(m);
    }

    private final static Operation system_predicate_1_str_35(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_36);
        return system_predicate_1_42(m);
    }

    private final static Operation system_predicate_1_str_36(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_37);
        return system_predicate_1_43(m);
    }

    private final static Operation system_predicate_1_str_37(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_38);
        return system_predicate_1_44(m);
    }

    private final static Operation system_predicate_1_str_38(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_39);
        return system_predicate_1_45(m);
    }

    private final static Operation system_predicate_1_str_39(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_40);
        return system_predicate_1_46(m);
    }

    private final static Operation system_predicate_1_str_40(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_41);
        return system_predicate_1_47(m);
    }

    private final static Operation system_predicate_1_str_41(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_42);
        return system_predicate_1_48(m);
    }

    private final static Operation system_predicate_1_str_42(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_43);
        return system_predicate_1_49(m);
    }

    private final static Operation system_predicate_1_str_43(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_44);
        return system_predicate_1_50(m);
    }

    private final static Operation system_predicate_1_str_44(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_45);
        return system_predicate_1_51(m);
    }

    private final static Operation system_predicate_1_str_45(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_46);
        return system_predicate_1_52(m);
    }

    private final static Operation system_predicate_1_str_46(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_47);
        return system_predicate_1_53(m);
    }

    private final static Operation system_predicate_1_str_47(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_48);
        return system_predicate_1_54(m);
    }

    private final static Operation system_predicate_1_str_48(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_49);
        return system_predicate_1_55(m);
    }

    private final static Operation system_predicate_1_str_49(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_50);
        return system_predicate_1_56(m);
    }

    private final static Operation system_predicate_1_str_50(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_51);
        return system_predicate_1_57(m);
    }

    private final static Operation system_predicate_1_str_51(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_52);
        return system_predicate_1_58(m);
    }

    private final static Operation system_predicate_1_str_52(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_53);
        return system_predicate_1_59(m);
    }

    private final static Operation system_predicate_1_str_53(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_54);
        return system_predicate_1_60(m);
    }

    private final static Operation system_predicate_1_str_54(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_55);
        return system_predicate_1_61(m);
    }

    private final static Operation system_predicate_1_str_55(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_56);
        return system_predicate_1_62(m);
    }

    private final static Operation system_predicate_1_str_56(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_57);
        return system_predicate_1_63(m);
    }

    private final static Operation system_predicate_1_str_57(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_58);
        return system_predicate_1_64(m);
    }

    private final static Operation system_predicate_1_str_58(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_59);
        return system_predicate_1_65(m);
    }

    private final static Operation system_predicate_1_str_59(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_60);
        return system_predicate_1_66(m);
    }

    private final static Operation system_predicate_1_str_60(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_61);
        return system_predicate_1_67(m);
    }

    private final static Operation system_predicate_1_str_61(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_62);
        return system_predicate_1_68(m);
    }

    private final static Operation system_predicate_1_str_62(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_63);
        return system_predicate_1_69(m);
    }

    private final static Operation system_predicate_1_str_63(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_64);
        return system_predicate_1_70(m);
    }

    private final static Operation system_predicate_1_str_64(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_65);
        return system_predicate_1_71(m);
    }

    private final static Operation system_predicate_1_str_65(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_66);
        return system_predicate_1_72(m);
    }

    private final static Operation system_predicate_1_str_66(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_67);
        return system_predicate_1_73(m);
    }

    private final static Operation system_predicate_1_str_67(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_68);
        return system_predicate_1_74(m);
    }

    private final static Operation system_predicate_1_str_68(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_69);
        return system_predicate_1_75(m);
    }

    private final static Operation system_predicate_1_str_69(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_70);
        return system_predicate_1_76(m);
    }

    private final static Operation system_predicate_1_str_70(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_71);
        return system_predicate_1_77(m);
    }

    private final static Operation system_predicate_1_str_71(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_72);
        return system_predicate_1_78(m);
    }

    private final static Operation system_predicate_1_str_72(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_73);
        return system_predicate_1_79(m);
    }

    private final static Operation system_predicate_1_str_73(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_74);
        return system_predicate_1_80(m);
    }

    private final static Operation system_predicate_1_str_74(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_75);
        return system_predicate_1_81(m);
    }

    private final static Operation system_predicate_1_str_75(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_76);
        return system_predicate_1_82(m);
    }

    private final static Operation system_predicate_1_str_76(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_77);
        return system_predicate_1_83(m);
    }

    private final static Operation system_predicate_1_str_77(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_78);
        return system_predicate_1_84(m);
    }

    private final static Operation system_predicate_1_str_78(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_79);
        return system_predicate_1_85(m);
    }

    private final static Operation system_predicate_1_str_79(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_80);
        return system_predicate_1_86(m);
    }

    private final static Operation system_predicate_1_str_80(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_81);
        return system_predicate_1_87(m);
    }

    private final static Operation system_predicate_1_str_81(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_82);
        return system_predicate_1_88(m);
    }

    private final static Operation system_predicate_1_str_82(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_83);
        return system_predicate_1_89(m);
    }

    private final static Operation system_predicate_1_str_83(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_84);
        return system_predicate_1_90(m);
    }

    private final static Operation system_predicate_1_str_84(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_85);
        return system_predicate_1_91(m);
    }

    private final static Operation system_predicate_1_str_85(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_86);
        return system_predicate_1_92(m);
    }

    private final static Operation system_predicate_1_str_86(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_87);
        return system_predicate_1_93(m);
    }

    private final static Operation system_predicate_1_str_87(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_88);
        return system_predicate_1_94(m);
    }

    private final static Operation system_predicate_1_str_88(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_89);
        return system_predicate_1_95(m);
    }

    private final static Operation system_predicate_1_str_89(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_90);
        return system_predicate_1_96(m);
    }

    private final static Operation system_predicate_1_str_90(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_91);
        return system_predicate_1_97(m);
    }

    private final static Operation system_predicate_1_str_91(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_92);
        return system_predicate_1_98(m);
    }

    private final static Operation system_predicate_1_str_92(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_93);
        return system_predicate_1_99(m);
    }

    private final static Operation system_predicate_1_str_93(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_94);
        return system_predicate_1_100(m);
    }

    private final static Operation system_predicate_1_str_94(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_95);
        return system_predicate_1_101(m);
    }

    private final static Operation system_predicate_1_str_95(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_96);
        return system_predicate_1_102(m);
    }

    private final static Operation system_predicate_1_str_96(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_97);
        return system_predicate_1_103(m);
    }

    private final static Operation system_predicate_1_str_97(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_98);
        return system_predicate_1_104(m);
    }

    private final static Operation system_predicate_1_str_98(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_99);
        return system_predicate_1_105(m);
    }

    private final static Operation system_predicate_1_str_99(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_100);
        return system_predicate_1_106(m);
    }

    private final static Operation system_predicate_1_str_100(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_101);
        return system_predicate_1_107(m);
    }

    private final static Operation system_predicate_1_str_101(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_102);
        return system_predicate_1_108(m);
    }

    private final static Operation system_predicate_1_str_102(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_103);
        return system_predicate_1_109(m);
    }

    private final static Operation system_predicate_1_str_103(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_104);
        return system_predicate_1_110(m);
    }

    private final static Operation system_predicate_1_str_104(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_105);
        return system_predicate_1_111(m);
    }

    private final static Operation system_predicate_1_str_105(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_106);
        return system_predicate_1_112(m);
    }

    private final static Operation system_predicate_1_str_106(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_107);
        return system_predicate_1_113(m);
    }

    private final static Operation system_predicate_1_str_107(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_108);
        return system_predicate_1_114(m);
    }

    private final static Operation system_predicate_1_str_108(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_109);
        return system_predicate_1_115(m);
    }

    private final static Operation system_predicate_1_str_109(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_110);
        return system_predicate_1_116(m);
    }

    private final static Operation system_predicate_1_str_110(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_111);
        return system_predicate_1_117(m);
    }

    private final static Operation system_predicate_1_str_111(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_112);
        return system_predicate_1_118(m);
    }

    private final static Operation system_predicate_1_str_112(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_113);
        return system_predicate_1_119(m);
    }

    private final static Operation system_predicate_1_str_113(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_114);
        return system_predicate_1_120(m);
    }

    private final static Operation system_predicate_1_str_114(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_115);
        return system_predicate_1_121(m);
    }

    private final static Operation system_predicate_1_str_115(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_116);
        return system_predicate_1_122(m);
    }

    private final static Operation system_predicate_1_str_116(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_117);
        return system_predicate_1_123(m);
    }

    private final static Operation system_predicate_1_str_117(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_118);
        return system_predicate_1_124(m);
    }

    private final static Operation system_predicate_1_str_118(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_119);
        return system_predicate_1_125(m);
    }

    private final static Operation system_predicate_1_str_119(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_120);
        return system_predicate_1_126(m);
    }

    private final static Operation system_predicate_1_str_120(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_121);
        return system_predicate_1_127(m);
    }

    private final static Operation system_predicate_1_str_121(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_122);
        return system_predicate_1_128(m);
    }

    private final static Operation system_predicate_1_str_122(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_123);
        return system_predicate_1_129(m);
    }

    private final static Operation system_predicate_1_str_123(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_124);
        return system_predicate_1_130(m);
    }

    private final static Operation system_predicate_1_str_124(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_125);
        return system_predicate_1_131(m);
    }

    private final static Operation system_predicate_1_str_125(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_126);
        return system_predicate_1_132(m);
    }

    private final static Operation system_predicate_1_str_126(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_127);
        return system_predicate_1_134(m);
    }

    private final static Operation system_predicate_1_str_127(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_128);
        return system_predicate_1_135(m);
    }

    private final static Operation system_predicate_1_str_128(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_129);
        return system_predicate_1_136(m);
    }

    private final static Operation system_predicate_1_str_129(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_130);
        return system_predicate_1_137(m);
    }

    private final static Operation system_predicate_1_str_130(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_131);
        return system_predicate_1_138(m);
    }

    private final static Operation system_predicate_1_str_131(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_132);
        return system_predicate_1_139(m);
    }

    private final static Operation system_predicate_1_str_132(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_133);
        return system_predicate_1_140(m);
    }

    private final static Operation system_predicate_1_str_133(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_134);
        return system_predicate_1_141(m);
    }

    private final static Operation system_predicate_1_str_134(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_135);
        return system_predicate_1_142(m);
    }

    private final static Operation system_predicate_1_str_135(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_136);
        return system_predicate_1_143(m);
    }

    private final static Operation system_predicate_1_str_136(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_137);
        return system_predicate_1_144(m);
    }

    private final static Operation system_predicate_1_str_137(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_138);
        return system_predicate_1_145(m);
    }

    private final static Operation system_predicate_1_str_138(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_139);
        return system_predicate_1_146(m);
    }

    private final static Operation system_predicate_1_str_139(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_140);
        return system_predicate_1_148(m);
    }

    private final static Operation system_predicate_1_str_140(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_141);
        return system_predicate_1_149(m);
    }

    private final static Operation system_predicate_1_str_141(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_142);
        return system_predicate_1_150(m);
    }

    private final static Operation system_predicate_1_str_142(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_143);
        return system_predicate_1_151(m);
    }

    private final static Operation system_predicate_1_str_143(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_144);
        return system_predicate_1_152(m);
    }

    private final static Operation system_predicate_1_str_144(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_145);
        return system_predicate_1_153(m);
    }

    private final static Operation system_predicate_1_str_145(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_146);
        return system_predicate_1_154(m);
    }

    private final static Operation system_predicate_1_str_146(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_147);
        return system_predicate_1_155(m);
    }

    private final static Operation system_predicate_1_str_147(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_148);
        return system_predicate_1_156(m);
    }

    private final static Operation system_predicate_1_str_148(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_149);
        return system_predicate_1_157(m);
    }

    private final static Operation system_predicate_1_str_149(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_150);
        return system_predicate_1_158(m);
    }

    private final static Operation system_predicate_1_str_150(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_151);
        return system_predicate_1_159(m);
    }

    private final static Operation system_predicate_1_str_151(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_152);
        return system_predicate_1_160(m);
    }

    private final static Operation system_predicate_1_str_152(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_153);
        return system_predicate_1_161(m);
    }

    private final static Operation system_predicate_1_str_153(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_154);
        return system_predicate_1_162(m);
    }

    private final static Operation system_predicate_1_str_154(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_155);
        return system_predicate_1_163(m);
    }

    private final static Operation system_predicate_1_str_155(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_156);
        return system_predicate_1_164(m);
    }

    private final static Operation system_predicate_1_str_156(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_157);
        return system_predicate_1_165(m);
    }

    private final static Operation system_predicate_1_str_157(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_158);
        return system_predicate_1_166(m);
    }

    private final static Operation system_predicate_1_str_158(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_159);
        return system_predicate_1_167(m);
    }

    private final static Operation system_predicate_1_str_159(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_160);
        return system_predicate_1_168(m);
    }

    private final static Operation system_predicate_1_str_160(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_161);
        return system_predicate_1_169(m);
    }

    private final static Operation system_predicate_1_str_161(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_162);
        return system_predicate_1_170(m);
    }

    private final static Operation system_predicate_1_str_162(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_163);
        return system_predicate_1_171(m);
    }

    private final static Operation system_predicate_1_str_163(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_164);
        return system_predicate_1_172(m);
    }

    private final static Operation system_predicate_1_str_164(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_165);
        return system_predicate_1_173(m);
    }

    private final static Operation system_predicate_1_str_165(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_166);
        return system_predicate_1_174(m);
    }

    private final static Operation system_predicate_1_str_166(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_167);
        return system_predicate_1_175(m);
    }

    private final static Operation system_predicate_1_str_167(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_168);
        return system_predicate_1_176(m);
    }

    private final static Operation system_predicate_1_str_168(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_169);
        return system_predicate_1_177(m);
    }

    private final static Operation system_predicate_1_str_169(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_170);
        return system_predicate_1_178(m);
    }

    private final static Operation system_predicate_1_str_170(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_171);
        return system_predicate_1_179(m);
    }

    private final static Operation system_predicate_1_str_171(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_172);
        return system_predicate_1_180(m);
    }

    private final static Operation system_predicate_1_str_172(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_173);
        return system_predicate_1_181(m);
    }

    private final static Operation system_predicate_1_str_173(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_174);
        return system_predicate_1_182(m);
    }

    private final static Operation system_predicate_1_str_174(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_175);
        return system_predicate_1_184(m);
    }

    private final static Operation system_predicate_1_str_175(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_176);
        return system_predicate_1_185(m);
    }

    private final static Operation system_predicate_1_str_176(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_177);
        return system_predicate_1_186(m);
    }

    private final static Operation system_predicate_1_str_177(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_178);
        return system_predicate_1_187(m);
    }

    private final static Operation system_predicate_1_str_178(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_179);
        return system_predicate_1_188(m);
    }

    private final static Operation system_predicate_1_str_179(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_180);
        return system_predicate_1_189(m);
    }

    private final static Operation system_predicate_1_str_180(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_181);
        return system_predicate_1_190(m);
    }

    private final static Operation system_predicate_1_str_181(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_182);
        return system_predicate_1_191(m);
    }

    private final static Operation system_predicate_1_str_182(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_183);
        return system_predicate_1_192(m);
    }

    private final static Operation system_predicate_1_str_183(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_184);
        return system_predicate_1_193(m);
    }

    private final static Operation system_predicate_1_str_184(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_185);
        return system_predicate_1_194(m);
    }

    private final static Operation system_predicate_1_str_185(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_186);
        return system_predicate_1_196(m);
    }

    private final static Operation system_predicate_1_str_186(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_187);
        return system_predicate_1_198(m);
    }

    private final static Operation system_predicate_1_str_187(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_188);
        return system_predicate_1_199(m);
    }

    private final static Operation system_predicate_1_str_188(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_189);
        return system_predicate_1_200(m);
    }

    private final static Operation system_predicate_1_str_189(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_190);
        return system_predicate_1_201(m);
    }

    private final static Operation system_predicate_1_str_190(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_191);
        return system_predicate_1_202(m);
    }

    private final static Operation system_predicate_1_str_191(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_192);
        return system_predicate_1_203(m);
    }

    private final static Operation system_predicate_1_str_192(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_193);
        return system_predicate_1_204(m);
    }

    private final static Operation system_predicate_1_str_193(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_194);
        return system_predicate_1_205(m);
    }

    private final static Operation system_predicate_1_str_194(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_195);
        return system_predicate_1_206(m);
    }

    private final static Operation system_predicate_1_str_195(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_196);
        return system_predicate_1_207(m);
    }

    private final static Operation system_predicate_1_str_196(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_197);
        return system_predicate_1_208(m);
    }

    private final static Operation system_predicate_1_str_197(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_198);
        return system_predicate_1_209(m);
    }

    private final static Operation system_predicate_1_str_198(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_199);
        return system_predicate_1_210(m);
    }

    private final static Operation system_predicate_1_str_199(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_200);
        return system_predicate_1_211(m);
    }

    private final static Operation system_predicate_1_str_200(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_201);
        return system_predicate_1_212(m);
    }

    private final static Operation system_predicate_1_str_201(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_202);
        return system_predicate_1_213(m);
    }

    private final static Operation system_predicate_1_str_202(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_203);
        return system_predicate_1_214(m);
    }

    private final static Operation system_predicate_1_str_203(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_204);
        return system_predicate_1_215(m);
    }

    private final static Operation system_predicate_1_str_204(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_205);
        return system_predicate_1_216(m);
    }

    private final static Operation system_predicate_1_str_205(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_206);
        return system_predicate_1_217(m);
    }

    private final static Operation system_predicate_1_str_206(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_207);
        return system_predicate_1_218(m);
    }

    private final static Operation system_predicate_1_str_207(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_208);
        return system_predicate_1_219(m);
    }

    private final static Operation system_predicate_1_str_208(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_209);
        return system_predicate_1_220(m);
    }

    private final static Operation system_predicate_1_str_209(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_210);
        return system_predicate_1_221(m);
    }

    private final static Operation system_predicate_1_str_210(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_211);
        return system_predicate_1_222(m);
    }

    private final static Operation system_predicate_1_str_211(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_212);
        return system_predicate_1_223(m);
    }

    private final static Operation system_predicate_1_str_212(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_213);
        return system_predicate_1_224(m);
    }

    private final static Operation system_predicate_1_str_213(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_214);
        return system_predicate_1_225(m);
    }

    private final static Operation system_predicate_1_str_214(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_215);
        return system_predicate_1_226(m);
    }

    private final static Operation system_predicate_1_str_215(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_216);
        return system_predicate_1_227(m);
    }

    private final static Operation system_predicate_1_str_216(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_217);
        return system_predicate_1_228(m);
    }

    private final static Operation system_predicate_1_str_217(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_218);
        return system_predicate_1_229(m);
    }

    private final static Operation system_predicate_1_str_218(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_219);
        return system_predicate_1_231(m);
    }

    private final static Operation system_predicate_1_str_219(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_220);
        return system_predicate_1_236(m);
    }

    private final static Operation system_predicate_1_str_220(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_221);
        return system_predicate_1_237(m);
    }

    private final static Operation system_predicate_1_str_221(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_222);
        return system_predicate_1_238(m);
    }

    private final static Operation system_predicate_1_str_222(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_223);
        return system_predicate_1_241(m);
    }

    private final static Operation system_predicate_1_str_223(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_224);
        return system_predicate_1_242(m);
    }

    private final static Operation system_predicate_1_str_224(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_225);
        return system_predicate_1_243(m);
    }

    private final static Operation system_predicate_1_str_225(Prolog m) { 
        m.retry(null, FILE_system::system_predicate_1_str_226);
        return system_predicate_1_244(m);
    }

    private final static Operation system_predicate_1_str_226(Prolog m) { 
        m.trust(null);
        return system_predicate_1_245(m);
    }

    private final static Operation system_predicate_1_1(Prolog m) { 
    // system_predicate(system_predicate(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(system_predicate(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_system_predicate_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_2(Prolog m) { 
    // system_predicate(true):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(true):-[]
        if (!  Prolog.True .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_3(Prolog m) { 
    // system_predicate(otherwise):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(otherwise):-[]
        if (!  ATOM_otherwise .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_4(Prolog m) { 
    // system_predicate(fail):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(fail):-[]
        if (!  ATOM_fail .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_5(Prolog m) { 
    // system_predicate(false):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(false):-[]
        if (!  ATOM_false .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_6(Prolog m) { 
    // system_predicate(!):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(!):-[]
        if (!  ATOM_$0021 .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_7(Prolog m) { 
    // system_predicate('$get_level'(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$get_level'(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024get_level_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_8(Prolog m) { 
    // system_predicate('$neck_cut'):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$neck_cut'):-[]
        if (!  ATOM_$0024neck_cut .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_9(Prolog m) { 
    // system_predicate('$cut'(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$cut'(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024cut_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_10(Prolog m) { 
    // system_predicate(A^B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A^B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$005E_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_11(Prolog m) { 
    // system_predicate((A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate((A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$002C_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_12(Prolog m) { 
    // system_predicate((A;B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate((A;B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_or_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_13(Prolog m) { 
    // system_predicate((A->B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate((A->B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$002D$003E_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_14(Prolog m) { 
    // system_predicate(call(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(call(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_call_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_15(Prolog m) { 
    // system_predicate(catch(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(catch(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_catch_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_16(Prolog m) { 
    // system_predicate(throw(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(throw(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_throw_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_17(Prolog m) { 
    // system_predicate(on_exception(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(on_exception(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_on_exception_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_18(Prolog m) { 
    // system_predicate(raise_exception(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(raise_exception(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_raise_exception_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_19(Prolog m) { 
    // system_predicate(A=B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A=B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$003D_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_20(Prolog m) { 
    // system_predicate('$unify'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$unify'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024unify_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_21(Prolog m) { 
    // system_predicate(A\=B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A\=B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$005C$003D_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_22(Prolog m) { 
    // system_predicate('$not_unifiable'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$not_unifiable'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024not_unifiable_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_23(Prolog m) { 
    // system_predicate(var(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(var(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_var_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_24(Prolog m) { 
    // system_predicate(atom(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(atom(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_atom_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_25(Prolog m) { 
    // system_predicate(integer(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(integer(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_integer_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_26(Prolog m) { 
    // system_predicate(long(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(long(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_long_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_27(Prolog m) { 
    // system_predicate(float(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(float(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_float_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_28(Prolog m) { 
    // system_predicate(atomic(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(atomic(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_atomic_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_29(Prolog m) { 
    // system_predicate(compound(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(compound(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_compound_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_30(Prolog m) { 
    // system_predicate(nonvar(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(nonvar(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_nonvar_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_31(Prolog m) { 
    // system_predicate(number(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(number(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_number_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_32(Prolog m) { 
    // system_predicate(java(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_33(Prolog m) { 
    // system_predicate(java(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_34(Prolog m) { 
    // system_predicate(closure(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(closure(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_closure_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_35(Prolog m) { 
    // system_predicate(ground(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(ground(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_ground_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_36(Prolog m) { 
    // system_predicate(callable(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(callable(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_callable_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_37(Prolog m) { 
    // system_predicate(A==B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A==B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$003D$003D_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_38(Prolog m) { 
    // system_predicate('$equality_of_term'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$equality_of_term'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024equality_of_term_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_39(Prolog m) { 
    // system_predicate(A\==B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A\==B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$005C$003D$003D_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_40(Prolog m) { 
    // system_predicate('$inequality_of_term'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$inequality_of_term'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024inequality_of_term_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_41(Prolog m) { 
    // system_predicate(A=@=B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A=@=B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$003D$0040$003D_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_42(Prolog m) { 
    // system_predicate('$variant'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$variant'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024variant_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_43(Prolog m) { 
    // system_predicate(A\=@=B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A\=@=B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$005C$003D$0040$003D_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_44(Prolog m) { 
    // system_predicate('$not_variant'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$not_variant'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024not_variant_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_45(Prolog m) { 
    // system_predicate(A@<B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A@<B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0040$003C_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_46(Prolog m) { 
    // system_predicate('$before'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$before'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024before_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_47(Prolog m) { 
    // system_predicate(A@>B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A@>B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0040$003E_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_48(Prolog m) { 
    // system_predicate('$after'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$after'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024after_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_49(Prolog m) { 
    // system_predicate(A@=<B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A@=<B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0040$003D$003C_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_50(Prolog m) { 
    // system_predicate('$not_after'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$not_after'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024not_after_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_51(Prolog m) { 
    // system_predicate(A@>=B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A@>=B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0040$003E$003D_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_52(Prolog m) { 
    // system_predicate('$not_before'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$not_before'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024not_before_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_53(Prolog m) { 
    // system_predicate(?=(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(?=(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$003F$003D_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_54(Prolog m) { 
    // system_predicate('$identical_or_cannot_unify'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$identical_or_cannot_unify'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024identical_or_cannot_unify_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_55(Prolog m) { 
    // system_predicate(compare(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(compare(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_compare_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_56(Prolog m) { 
    // system_predicate(sort(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(sort(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_sort_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_57(Prolog m) { 
    // system_predicate(keysort(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(keysort(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_keysort_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_58(Prolog m) { 
    // system_predicate(arg(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(arg(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_arg_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_59(Prolog m) { 
    // system_predicate(functor(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(functor(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_functor_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_60(Prolog m) { 
    // system_predicate(A=..B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A=..B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$003D$002E$002E_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_61(Prolog m) { 
    // system_predicate('$univ'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$univ'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024univ_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_62(Prolog m) { 
    // system_predicate(copy_term(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(copy_term(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_copy_term_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_63(Prolog m) { 
    // system_predicate(A is B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A is B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_is_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_64(Prolog m) { 
    // system_predicate('$abs'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$abs'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024abs_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_65(Prolog m) { 
    // system_predicate('$asin'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$asin'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024asin_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_66(Prolog m) { 
    // system_predicate('$acos'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$acos'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024acos_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_67(Prolog m) { 
    // system_predicate('$atan'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$atan'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024atan_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_68(Prolog m) { 
    // system_predicate('$bitwise_conj'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$bitwise_conj'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024bitwise_conj_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_69(Prolog m) { 
    // system_predicate('$bitwise_disj'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$bitwise_disj'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024bitwise_disj_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_70(Prolog m) { 
    // system_predicate('$bitwise_exclusive_or'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$bitwise_exclusive_or'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024bitwise_exclusive_or_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_71(Prolog m) { 
    // system_predicate('$bitwise_neg'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$bitwise_neg'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024bitwise_neg_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_72(Prolog m) { 
    // system_predicate('$ceil'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$ceil'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024ceil_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_73(Prolog m) { 
    // system_predicate('$cos'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$cos'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024cos_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_74(Prolog m) { 
    // system_predicate('$degrees'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$degrees'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024degrees_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_75(Prolog m) { 
    // system_predicate('$exp'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$exp'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024exp_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_76(Prolog m) { 
    // system_predicate('$float'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$float'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024float_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_77(Prolog m) { 
    // system_predicate('$float_integer_part'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$float_integer_part'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024float_integer_part_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_78(Prolog m) { 
    // system_predicate('$float_fractional_part'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$float_fractional_part'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024float_fractional_part_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_79(Prolog m) { 
    // system_predicate('$float_quotient'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$float_quotient'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024float_quotient_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_80(Prolog m) { 
    // system_predicate('$floor'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$floor'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024floor_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_81(Prolog m) { 
    // system_predicate('$int_quotient'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$int_quotient'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024int_quotient_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_82(Prolog m) { 
    // system_predicate('$log'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$log'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024log_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_83(Prolog m) { 
    // system_predicate('$max'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$max'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024max_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_84(Prolog m) { 
    // system_predicate('$min'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$min'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024min_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_85(Prolog m) { 
    // system_predicate('$minus'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$minus'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024minus_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_86(Prolog m) { 
    // system_predicate('$mod'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$mod'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024mod_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_87(Prolog m) { 
    // system_predicate('$multi'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$multi'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024multi_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_88(Prolog m) { 
    // system_predicate('$plus'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$plus'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024plus_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_89(Prolog m) { 
    // system_predicate('$pow'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$pow'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024pow_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_90(Prolog m) { 
    // system_predicate('$radians'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$radians'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024radians_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_91(Prolog m) { 
    // system_predicate('$rint'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$rint'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024rint_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_92(Prolog m) { 
    // system_predicate('$round'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$round'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024round_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_93(Prolog m) { 
    // system_predicate('$shift_left'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$shift_left'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024shift_left_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_94(Prolog m) { 
    // system_predicate('$shift_right'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$shift_right'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024shift_right_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_95(Prolog m) { 
    // system_predicate('$sign'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$sign'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024sign_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_96(Prolog m) { 
    // system_predicate('$sin'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$sin'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024sin_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_97(Prolog m) { 
    // system_predicate('$sqrt'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$sqrt'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024sqrt_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_98(Prolog m) { 
    // system_predicate('$tan'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$tan'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024tan_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_99(Prolog m) { 
    // system_predicate('$truncate'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$truncate'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024truncate_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_100(Prolog m) { 
    // system_predicate(A=:=B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A=:=B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$003D$003A$003D_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_101(Prolog m) { 
    // system_predicate('$arith_equal'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$arith_equal'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024arith_equal_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_102(Prolog m) { 
    // system_predicate(A=\=B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A=\=B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$003D$005C$003D_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_103(Prolog m) { 
    // system_predicate('$arith_not_equal'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$arith_not_equal'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024arith_not_equal_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_104(Prolog m) { 
    // system_predicate(A<B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A<B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$003C_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_105(Prolog m) { 
    // system_predicate('$less_than'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$less_than'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024less_than_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_106(Prolog m) { 
    // system_predicate(A=<B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A=<B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$003D$003C_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_107(Prolog m) { 
    // system_predicate('$less_or_equal'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$less_or_equal'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024less_or_equal_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_108(Prolog m) { 
    // system_predicate(A>B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A>B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$003E_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_109(Prolog m) { 
    // system_predicate('$greater_than'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$greater_than'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024greater_than_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_110(Prolog m) { 
    // system_predicate(A>=B):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A>=B):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$003E$003D_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_111(Prolog m) { 
    // system_predicate('$greater_or_equal'(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$greater_or_equal'(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024greater_or_equal_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_112(Prolog m) { 
    // system_predicate(clause(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(clause(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_clause_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_113(Prolog m) { 
    // system_predicate(initialization(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(initialization(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_initialization_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_114(Prolog m) { 
    // system_predicate('$new_indexing_hash'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$new_indexing_hash'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024new_indexing_hash_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_115(Prolog m) { 
    // system_predicate(assert(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(assert(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_assert_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_116(Prolog m) { 
    // system_predicate(assertz(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(assertz(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_assertz_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_117(Prolog m) { 
    // system_predicate(asserta(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(asserta(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_asserta_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_118(Prolog m) { 
    // system_predicate(retract(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(retract(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_retract_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_119(Prolog m) { 
    // system_predicate(abolish(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(abolish(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_abolish_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_120(Prolog m) { 
    // system_predicate(retractall(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(retractall(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_retractall_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_121(Prolog m) { 
    // system_predicate(findall(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(findall(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_findall_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_122(Prolog m) { 
    // system_predicate(bagof(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(bagof(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_bagof_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_123(Prolog m) { 
    // system_predicate(setof(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(setof(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_setof_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_124(Prolog m) { 
    // system_predicate(current_input(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(current_input(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_current_input_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_125(Prolog m) { 
    // system_predicate(current_output(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(current_output(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_current_output_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_126(Prolog m) { 
    // system_predicate(set_input(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(set_input(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_set_input_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_127(Prolog m) { 
    // system_predicate(set_output(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(set_output(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_set_output_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_128(Prolog m) { 
    // system_predicate(open(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(open(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_open_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_129(Prolog m) { 
    // system_predicate(open(A,B,C,D)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(open(A,B,C,D)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_open_4 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_130(Prolog m) { 
    // system_predicate(close(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(close(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_close_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_131(Prolog m) { 
    // system_predicate(close(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(close(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_close_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_132(Prolog m) { 
    // system_predicate(flush_output(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(flush_output(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_flush_output_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_133(Prolog m) { 
    // system_predicate(flush_output):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(flush_output):-[]
        if (!  ATOM_flush_output .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_134(Prolog m) { 
    // system_predicate(stream_property(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(stream_property(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_stream_property_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_135(Prolog m) { 
    // system_predicate(get_char(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(get_char(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_get_char_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_136(Prolog m) { 
    // system_predicate(get_char(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(get_char(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_get_char_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_137(Prolog m) { 
    // system_predicate(get_code(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(get_code(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_get_code_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_138(Prolog m) { 
    // system_predicate(get_code(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(get_code(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_get_code_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_139(Prolog m) { 
    // system_predicate(peek_char(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(peek_char(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_peek_char_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_140(Prolog m) { 
    // system_predicate(peek_char(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(peek_char(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_peek_char_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_141(Prolog m) { 
    // system_predicate(peek_code(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(peek_code(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_peek_code_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_142(Prolog m) { 
    // system_predicate(peek_code(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(peek_code(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_peek_code_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_143(Prolog m) { 
    // system_predicate(put_char(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(put_char(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_put_char_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_144(Prolog m) { 
    // system_predicate(put_char(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(put_char(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_put_char_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_145(Prolog m) { 
    // system_predicate(put_code(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(put_code(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_put_code_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_146(Prolog m) { 
    // system_predicate(put_code(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(put_code(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_put_code_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_147(Prolog m) { 
    // system_predicate(nl):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(nl):-[]
        if (!  ATOM_nl .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_148(Prolog m) { 
    // system_predicate(nl(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(nl(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_nl_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_149(Prolog m) { 
    // system_predicate(get0(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(get0(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_get0_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_150(Prolog m) { 
    // system_predicate(get0(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(get0(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_get0_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_151(Prolog m) { 
    // system_predicate(get(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(get(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_get_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_152(Prolog m) { 
    // system_predicate(get(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(get(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_get_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_153(Prolog m) { 
    // system_predicate(put(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(put(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_put_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_154(Prolog m) { 
    // system_predicate(put(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(put(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_put_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_155(Prolog m) { 
    // system_predicate(tab(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(tab(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_tab_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_156(Prolog m) { 
    // system_predicate(tab(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(tab(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_tab_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_157(Prolog m) { 
    // system_predicate(skip(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(skip(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_skip_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_158(Prolog m) { 
    // system_predicate(skip(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(skip(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_skip_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_159(Prolog m) { 
    // system_predicate(get_byte(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(get_byte(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_get_byte_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_160(Prolog m) { 
    // system_predicate(get_byte(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(get_byte(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_get_byte_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_161(Prolog m) { 
    // system_predicate(peek_byte(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(peek_byte(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_peek_byte_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_162(Prolog m) { 
    // system_predicate(peek_byte(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(peek_byte(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_peek_byte_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_163(Prolog m) { 
    // system_predicate(put_byte(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(put_byte(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_put_byte_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_164(Prolog m) { 
    // system_predicate(put_byte(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(put_byte(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_put_byte_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_165(Prolog m) { 
    // system_predicate(read(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(read(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_read_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_166(Prolog m) { 
    // system_predicate(read(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(read(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_read_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_167(Prolog m) { 
    // system_predicate(read_with_variables(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(read_with_variables(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_read_with_variables_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_168(Prolog m) { 
    // system_predicate(read_with_variables(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(read_with_variables(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_read_with_variables_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_169(Prolog m) { 
    // system_predicate(read_line(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(read_line(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_read_line_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_170(Prolog m) { 
    // system_predicate(read_line(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(read_line(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_read_line_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_171(Prolog m) { 
    // system_predicate(write(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(write(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_write_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_172(Prolog m) { 
    // system_predicate(write(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(write(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_write_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_173(Prolog m) { 
    // system_predicate(writeq(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(writeq(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_writeq_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_174(Prolog m) { 
    // system_predicate(writeq(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(writeq(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_writeq_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_175(Prolog m) { 
    // system_predicate(write_canonical(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(write_canonical(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_write_canonical_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_176(Prolog m) { 
    // system_predicate(write_canonical(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(write_canonical(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_write_canonical_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_177(Prolog m) { 
    // system_predicate(write_term(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(write_term(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_write_term_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_178(Prolog m) { 
    // system_predicate(write_term(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(write_term(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_write_term_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_179(Prolog m) { 
    // system_predicate(op(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(op(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_op_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_180(Prolog m) { 
    // system_predicate(current_op(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(current_op(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_current_op_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_181(Prolog m) { 
    // system_predicate(\+A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(\+A):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$005C$002B_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_182(Prolog m) { 
    // system_predicate(once(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(once(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_once_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_183(Prolog m) { 
    // system_predicate(repeat):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(repeat):-[]
        if (!  ATOM_repeat .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_184(Prolog m) { 
    // system_predicate(atom_length(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(atom_length(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_atom_length_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_185(Prolog m) { 
    // system_predicate(atom_concat(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(atom_concat(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_atom_concat_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_186(Prolog m) { 
    // system_predicate(sub_atom(A,B,C,D,E)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(sub_atom(A,B,C,D,E)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_sub_atom_5 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_187(Prolog m) { 
    // system_predicate(atom_chars(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(atom_chars(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_atom_chars_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_188(Prolog m) { 
    // system_predicate(atom_codes(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(atom_codes(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_atom_codes_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_189(Prolog m) { 
    // system_predicate(char_code(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(char_code(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_char_code_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_190(Prolog m) { 
    // system_predicate(number_chars(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(number_chars(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_number_chars_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_191(Prolog m) { 
    // system_predicate(number_codes(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(number_codes(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_number_codes_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_192(Prolog m) { 
    // system_predicate(name(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(name(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_name_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_193(Prolog m) { 
    // system_predicate(set_prolog_flag(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(set_prolog_flag(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_set_prolog_flag_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_194(Prolog m) { 
    // system_predicate(current_prolog_flag(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(current_prolog_flag(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_current_prolog_flag_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_195(Prolog m) { 
    // system_predicate(halt):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(halt):-[]
        if (!  ATOM_halt .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_196(Prolog m) { 
    // system_predicate(halt(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(halt(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_halt_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_197(Prolog m) { 
    // system_predicate(abort):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(abort):-[]
        if (!  ATOM_abort .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_198(Prolog m) { 
    // system_predicate('C'(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('C'(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_C_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_199(Prolog m) { 
    // system_predicate(expand_term(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(expand_term(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_expand_term_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_200(Prolog m) { 
    // system_predicate(new_hash(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(new_hash(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_new_hash_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_201(Prolog m) { 
    // system_predicate(new_hash(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(new_hash(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_new_hash_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_202(Prolog m) { 
    // system_predicate(hash_clear(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(hash_clear(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_hash_clear_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_203(Prolog m) { 
    // system_predicate(hash_contains_key(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(hash_contains_key(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_hash_contains_key_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_204(Prolog m) { 
    // system_predicate(hash_get(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(hash_get(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_hash_get_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_205(Prolog m) { 
    // system_predicate(hash_is_empty(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(hash_is_empty(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_hash_is_empty_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_206(Prolog m) { 
    // system_predicate(hash_keys(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(hash_keys(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_hash_keys_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_207(Prolog m) { 
    // system_predicate(hash_map(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(hash_map(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_hash_map_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_208(Prolog m) { 
    // system_predicate(hash_put(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(hash_put(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_hash_put_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_209(Prolog m) { 
    // system_predicate(hash_remove(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(hash_remove(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_hash_remove_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_210(Prolog m) { 
    // system_predicate(hash_size(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(hash_size(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_hash_size_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_211(Prolog m) { 
    // system_predicate('$get_hash_manager'(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate('$get_hash_manager'(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0024get_hash_manager_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_212(Prolog m) { 
    // system_predicate(java_constructor0(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_constructor0(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_constructor0_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_213(Prolog m) { 
    // system_predicate(java_constructor(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_constructor(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_constructor_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_214(Prolog m) { 
    // system_predicate(java_declared_constructor0(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_declared_constructor0(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_declared_constructor0_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_215(Prolog m) { 
    // system_predicate(java_declared_constructor(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_declared_constructor(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_declared_constructor_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_216(Prolog m) { 
    // system_predicate(java_method0(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_method0(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_method0_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_217(Prolog m) { 
    // system_predicate(java_method(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_method(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_method_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_218(Prolog m) { 
    // system_predicate(java_declared_method0(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_declared_method0(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_declared_method0_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_219(Prolog m) { 
    // system_predicate(java_declared_method(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_declared_method(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_declared_method_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_220(Prolog m) { 
    // system_predicate(java_get_field0(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_get_field0(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_get_field0_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_221(Prolog m) { 
    // system_predicate(java_get_field(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_get_field(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_get_field_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_222(Prolog m) { 
    // system_predicate(java_get_declared_field0(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_get_declared_field0(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_get_declared_field0_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_223(Prolog m) { 
    // system_predicate(java_get_declared_field(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_get_declared_field(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_get_declared_field_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_224(Prolog m) { 
    // system_predicate(java_set_field0(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_set_field0(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_set_field0_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_225(Prolog m) { 
    // system_predicate(java_set_field(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_set_field(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_set_field_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_226(Prolog m) { 
    // system_predicate(java_set_declared_field0(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_set_declared_field0(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_set_declared_field0_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_227(Prolog m) { 
    // system_predicate(java_set_declared_field(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_set_declared_field(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_set_declared_field_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_228(Prolog m) { 
    // system_predicate(synchronized(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(synchronized(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_synchronized_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_229(Prolog m) { 
    // system_predicate(java_conversion(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(java_conversion(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_java_conversion_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_230(Prolog m) { 
    // system_predicate(cafeteria):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(cafeteria):-[]
        if (!  ATOM_cafeteria .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_231(Prolog m) { 
    // system_predicate(consult(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(consult(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_consult_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_232(Prolog m) { 
    // system_predicate(trace):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(trace):-[]
        if (!  ATOM_trace .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_233(Prolog m) { 
    // system_predicate(notrace):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(notrace):-[]
        if (!  ATOM_notrace .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_234(Prolog m) { 
    // system_predicate(debug):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(debug):-[]
        if (!  ATOM_debug .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_235(Prolog m) { 
    // system_predicate(nodebug):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(nodebug):-[]
        if (!  ATOM_nodebug .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_236(Prolog m) { 
    // system_predicate(leash(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(leash(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_leash_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_237(Prolog m) { 
    // system_predicate(spy(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(spy(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_spy_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_238(Prolog m) { 
    // system_predicate(nospy(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(nospy(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_nospy_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_239(Prolog m) { 
    // system_predicate(nospyall):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(nospyall):-[]
        if (!  ATOM_nospyall .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_240(Prolog m) { 
    // system_predicate(listing):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(listing):-[]
        if (!  ATOM_listing .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation system_predicate_1_241(Prolog m) { 
    // system_predicate(listing(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(listing(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_listing_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_242(Prolog m) { 
    // system_predicate(length(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(length(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_length_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_243(Prolog m) { 
    // system_predicate(numbervars(A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(numbervars(A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_numbervars_3 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_244(Prolog m) { 
    // system_predicate(statistics(A,B)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(statistics(A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_statistics_2 , m.trail, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation system_predicate_1_245(Prolog m) { 
    // system_predicate(A):-call(system_predicate_ext,A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // system_predicate(A):-[call(system_predicate_ext,A)]
        return //
 Op("call", FILE_system::PRED_call_2_static_exec, VA( ATOM_system_predicate_ext , a1), cont);
    }
/** PREDICATE: $init/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/system.pl
*/
    // main('$init'/0,public)
        final static Functor ATOM_SxxMachine = SYM("SxxMachine");
        final static Functor FUNCTOR_$002F_2 = F("/",2);
    private static final Compound L_$init_0_s6 = S( FUNCTOR_$002F_2 ,  ATOM_system_predicate_ext ,  int_1 );




    public static Operation PRED_$init_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$init':-'$new_indexing_hash'('SxxMachine',system_predicate_ext/1,A)
        m.setB0();
    // '$init':-['$new_indexing_hash'('SxxMachine',system_predicate_ext/1,A)]
        return //
 Op("$new_indexing_hash", FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_SxxMachine , L_$init_0_s6, m.DONT_CARE2()), cont);
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("system_predicate",1,FILE_system::PRED_system_predicate_1_static_exec);
   PredTable.registerBuiltin("$init",0,FILE_system::PRED_$init_0_static_exec);
}
}

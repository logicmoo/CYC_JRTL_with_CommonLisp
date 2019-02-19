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
public class FILE_io extends FILE_cafeteria {
/** PREDICATE: (package)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main((package)/1,non-(public))




    public static Operation PRED_package_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // package A:-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // package A:-[]
        return cont;
    }
/** PREDICATE: open/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(open/3,public)




    public static Operation PRED_open_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // open(A,B,C):-open(A,B,C,[])
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // open(A,B,C):-[open(A,B,C,[])]
        return //
 Op("open", FILE_system::PRED_open_4_static_exec, VA(a1, a2, a3,  Prolog.Nil ), cont);
    }
/** PREDICATE: close/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(close/1,public)




    public static Operation PRED_close_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // close(A):-close(A,[])
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // close(A):-[close(A,[])]
        return //
 Op("close", FILE_system::PRED_close_2_static_exec, VA(a1,  Prolog.Nil ), cont);
    }
/** PREDICATE: flush_output/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(flush_output/0,public)




    public static Operation PRED_flush_output_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // flush_output:-current_output(A),flush_output(A)
        m.setB0();
         Term a1;
        Operation p1;
    // flush_output:-[current_output(A),flush_output(A)]
        a1 = m.mkvar1();
        return //
 Op("current_output", FILE_system::PRED_current_output_1_static_exec, VA(a1), //
 Op("flush_output", FILE_system::PRED_flush_output_1_static_exec, VA(a1), cont));
    }
/** PREDICATE: stream_property/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(stream_property/2,public)
        final static Functor FUNCTOR_domain_2 = F("domain",2);
        final static Functor ATOM_term = SYM("term");
        final static Functor ATOM_stream_property = SYM("stream_property");
    private static final Compound L_stream_property_2_s5 = S( FUNCTOR_domain_2 ,  ATOM_term ,  ATOM_stream_property );
        final static Functor FUNCTOR_stream_property_2 = F("stream_property",2);




    public static Operation PRED_stream_property_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_io::stream_property_2_sub_1);
        return stream_property_2_1(m);
    }

    private final static Operation stream_property_2_sub_1(Prolog m) { 
        m.retry(null, FILE_io::stream_property_2_sub_2);
        return stream_property_2_2(m);
    }

    private final static Operation stream_property_2_sub_2(Prolog m) { 
        m.trust(null);
        return stream_property_2_3(m);
    }

    private final static Operation stream_property_2_1(Prolog m) { 
    // stream_property(A,B):-var(B),!,'$stream_property'(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // stream_property(A,B):-['$get_level'(C),var(B),'$cut'(C),'$stream_property'(A,B)]
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
        return //
 Op("$stream_property", FILE_system::PRED_$stream_property_2_static_exec, VA(a1, a2), cont);
    }

    private final static Operation stream_property_2_2(Prolog m) { 
    // stream_property(A,B):-'$stream_property_specifier'(B),!,'$stream_property'(A,B)
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // stream_property(A,B):-['$get_level'(C),'$stream_property_specifier'(B),'$cut'(C),'$stream_property'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$stream_property_specifier", FILE_system::PRED_$stream_property_specifier_1_static_exec, VA(a2), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("$stream_property", FILE_system::PRED_$stream_property_2_static_exec, VA(a1, a2), cont)));
    }

    private final static Operation stream_property_2_3(Prolog m) { 
    // stream_property(A,B):-illarg(domain(term,stream_property),stream_property(A,B),2)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // stream_property(A,B):-[illarg(domain(term,stream_property),stream_property(A,B),2)]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_stream_property_2'),y(1),a(3))
        a3 =  S( FUNCTOR_stream_property_2 , a1, a2);
 ;
        return //
 Op("illarg", FILE_system::PRED_illarg_3_static_exec, VA(L_stream_property_2_s5, a3,  int_2 ), cont);
    }
/** PREDICATE: $stream_property/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main('$stream_property'/2,non-(public))
        final static Functor FUNCTOR_$002C_2 = F(",",2);
        final static Functor ATOM_stream = SYM("stream");
    private static final Compound L_$stream_property_2_s5 = S( FUNCTOR_domain_2 ,  ATOM_stream ,  ATOM_stream );




    public static Operation PRED_$stream_property_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_io::$stream_property_2_sub_1);
        return $stream_property_2_1(m);
    }

    private final static Operation $stream_property_2_sub_1(Prolog m) { 
        m.retry(null, FILE_io::$stream_property_2_sub_2);
        return $stream_property_2_2(m);
    }

    private final static Operation $stream_property_2_sub_2(Prolog m) { 
        m.trust(null);
        return $stream_property_2_3(m);
    }

    private final static Operation $stream_property_2_1(Prolog m) { 
    // '$stream_property'(A,B):-var(A),!,'$get_stream_manager'(C),hash_map(C,D),'$builtin_member'((A,E),D),java(A),'$builtin_member'(B,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$stream_property'(A,B):-['$get_level'(C),var(A),'$cut'(C),'$get_stream_manager'(D),hash_map(D,E),'$builtin_member'((A,F),E),java(A),'$builtin_member'(B,F)]
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
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = m.mkvar1();
    // put_str_args([a(1),a(6)],y(1)),put_str(@('FUNCTOR_$002C_2'),y(1),a(7))
        a7 =  S( FUNCTOR_$002C_2 , a1, a6);
 ;
        return //
 Op("$get_stream_manager", FILE_system::PRED_$get_stream_manager_1_static_exec, VA(a4), //
 Op("hash_map", FILE_system::PRED_hash_map_2_static_exec, VA(a4, a5), //
 Op("$builtin_member", FILE_system::PRED_$builtin_member_2_static_exec, VA(a7, a5), //
 Op("java", FILE_system::PRED_java_1_static_exec, VA(a1), //
 Op("$builtin_member", FILE_system::PRED_$builtin_member_2_static_exec, VA(a2, a6), cont)))));
    }

    private final static Operation $stream_property_2_2(Prolog m) { 
    // '$stream_property'(A,B):-java(A),!,'$get_stream_manager'(C),hash_get(C,A,D),'$builtin_member'(B,D)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$stream_property'(A,B):-['$get_level'(C),java(A),'$cut'(C),'$get_stream_manager'(D),hash_get(D,A,E),'$builtin_member'(B,E)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of java(a(1))
        a1 = a1.dref();
        if (! (a1 .isJavaObject())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(3))
        a3 = a3.dref();
                  m.cut( a3.intValue());
        //END inline expansion
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op("$get_stream_manager", FILE_system::PRED_$get_stream_manager_1_static_exec, VA(a4), //
 Op("hash_get", FILE_system::PRED_hash_get_3_static_exec, VA(a4, a1, a5), //
 Op("$builtin_member", FILE_system::PRED_$builtin_member_2_static_exec, VA(a2, a5), cont)));
    }

    private final static Operation $stream_property_2_3(Prolog m) { 
    // '$stream_property'(A,B):-illarg(domain(stream,stream),stream_property(A,B),1)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$stream_property'(A,B):-[illarg(domain(stream,stream),stream_property(A,B),1)]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_stream_property_2'),y(1),a(3))
        a3 =  S( FUNCTOR_stream_property_2 , a1, a2);
 ;
        return //
 Op("illarg", FILE_system::PRED_illarg_3_static_exec, VA(L_$stream_property_2_s5, a3,  int_1 ), cont);
    }
/** PREDICATE: $stream_property_specifier/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main('$stream_property_specifier'/1,non-(public))
        final static Functor ATOM_input = SYM("input");
        final static Functor ATOM_output = SYM("output");
        final static Functor FUNCTOR_alias_1 = F("alias",1);
        final static Functor FUNCTOR_mode_1 = F("mode",1);
        final static Functor FUNCTOR_type_1 = F("type",1);
        final static Functor FUNCTOR_file_name_1 = F("file_name",1);




    public static Operation PRED_$stream_property_specifier_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_io::$stream_property_specifier_1_var, fail_0, fail_0, FILE_io::$stream_property_specifier_1_con, FILE_io::$stream_property_specifier_1_str, fail_0); 
    }

    private final static Operation $stream_property_specifier_1_var(Prolog m) { 
        m.jtry1(null, FILE_io::$stream_property_specifier_1_var_1);
        return $stream_property_specifier_1_1(m);
    }

    private final static Operation $stream_property_specifier_1_var_1(Prolog m) { 
        m.retry(null, FILE_io::$stream_property_specifier_1_var_2);
        return $stream_property_specifier_1_2(m);
    }

    private final static Operation $stream_property_specifier_1_var_2(Prolog m) { 
        m.retry(null, FILE_io::$stream_property_specifier_1_var_3);
        return $stream_property_specifier_1_3(m);
    }

    private final static Operation $stream_property_specifier_1_var_3(Prolog m) { 
        m.retry(null, FILE_io::$stream_property_specifier_1_var_4);
        return $stream_property_specifier_1_4(m);
    }

    private final static Operation $stream_property_specifier_1_var_4(Prolog m) { 
        m.retry(null, FILE_io::$stream_property_specifier_1_var_5);
        return $stream_property_specifier_1_5(m);
    }

    private final static Operation $stream_property_specifier_1_var_5(Prolog m) { 
        m.trust(null);
        return $stream_property_specifier_1_6(m);
    }

    private final static Operation $stream_property_specifier_1_con(Prolog m) { 
        m.jtry1(null, FILE_io::$stream_property_specifier_1_con_1);
        return $stream_property_specifier_1_1(m);
    }

    private final static Operation $stream_property_specifier_1_con_1(Prolog m) { 
        m.trust(null);
        return $stream_property_specifier_1_2(m);
    }

    private final static Operation $stream_property_specifier_1_str(Prolog m) { 
        m.jtry1(null, FILE_io::$stream_property_specifier_1_str_1);
        return $stream_property_specifier_1_3(m);
    }

    private final static Operation $stream_property_specifier_1_str_1(Prolog m) { 
        m.retry(null, FILE_io::$stream_property_specifier_1_str_2);
        return $stream_property_specifier_1_4(m);
    }

    private final static Operation $stream_property_specifier_1_str_2(Prolog m) { 
        m.retry(null, FILE_io::$stream_property_specifier_1_str_3);
        return $stream_property_specifier_1_5(m);
    }

    private final static Operation $stream_property_specifier_1_str_3(Prolog m) { 
        m.trust(null);
        return $stream_property_specifier_1_6(m);
    }

    private final static Operation $stream_property_specifier_1_1(Prolog m) { 
    // '$stream_property_specifier'(input):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$stream_property_specifier'(input):-[]
        if (!  ATOM_input .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $stream_property_specifier_1_2(Prolog m) { 
    // '$stream_property_specifier'(output):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$stream_property_specifier'(output):-[]
        if (!  ATOM_output .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $stream_property_specifier_1_3(Prolog m) { 
    // '$stream_property_specifier'(alias(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$stream_property_specifier'(alias(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_alias_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation $stream_property_specifier_1_4(Prolog m) { 
    // '$stream_property_specifier'((mode A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$stream_property_specifier'((mode A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_mode_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation $stream_property_specifier_1_5(Prolog m) { 
    // '$stream_property_specifier'(type(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$stream_property_specifier'(type(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_type_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation $stream_property_specifier_1_6(Prolog m) { 
    // '$stream_property_specifier'(file_name(A)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$stream_property_specifier'(file_name(A)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_file_name_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: get_char/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(get_char/1,public)




    public static Operation PRED_get_char_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // get_char(A):-current_input(B),get_char(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // get_char(A):-[current_input(B),get_char(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_input", FILE_system::PRED_current_input_1_static_exec, VA(a2), //
 Op("get_char", FILE_system::PRED_get_char_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: get_code/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(get_code/1,public)




    public static Operation PRED_get_code_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // get_code(A):-current_input(B),get_code(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // get_code(A):-[current_input(B),get_code(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_input", FILE_system::PRED_current_input_1_static_exec, VA(a2), //
 Op("get_code", FILE_system::PRED_get_code_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: peek_char/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(peek_char/1,public)




    public static Operation PRED_peek_char_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // peek_char(A):-current_input(B),peek_char(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // peek_char(A):-[current_input(B),peek_char(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_input", FILE_system::PRED_current_input_1_static_exec, VA(a2), //
 Op("peek_char", FILE_system::PRED_peek_char_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: peek_code/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(peek_code/1,public)




    public static Operation PRED_peek_code_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // peek_code(A):-current_input(B),peek_code(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // peek_code(A):-[current_input(B),peek_code(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_input", FILE_system::PRED_current_input_1_static_exec, VA(a2), //
 Op("peek_code", FILE_system::PRED_peek_code_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: put_char/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(put_char/1,public)




    public static Operation PRED_put_char_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // put_char(A):-current_output(B),put_char(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // put_char(A):-[current_output(B),put_char(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_output", FILE_system::PRED_current_output_1_static_exec, VA(a2), //
 Op("put_char", FILE_system::PRED_put_char_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: put_code/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(put_code/1,public)




    public static Operation PRED_put_code_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // put_code(A):-current_output(B),put_code(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // put_code(A):-[current_output(B),put_code(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_output", FILE_system::PRED_current_output_1_static_exec, VA(a2), //
 Op("put_code", FILE_system::PRED_put_code_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: nl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(nl/1,public)
        final static Functor ATOM_$000A = SYM("\n");




    public static Operation PRED_nl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // nl(A):-put_char(A,'\n')
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // nl(A):-[put_char(A,'\n')]
        return //
 Op("put_char", FILE_system::PRED_put_char_2_static_exec, VA(a1,  ATOM_$000A ), cont);
    }
/** PREDICATE: get0/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(get0/1,public)




    public static Operation PRED_get0_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // get0(A):-current_input(B),get_code(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // get0(A):-[current_input(B),get_code(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_input", FILE_system::PRED_current_input_1_static_exec, VA(a2), //
 Op("get_code", FILE_system::PRED_get_code_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: get0/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(get0/2,public)




    public static Operation PRED_get0_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // get0(A,B):-get_code(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // get0(A,B):-[get_code(A,B)]
        return //
 Op("get_code", FILE_system::PRED_get_code_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: get/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(get/1,public)




    public static Operation PRED_get_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // get(A):-current_input(B),get(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // get(A):-[current_input(B),get(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_input", FILE_system::PRED_current_input_1_static_exec, VA(a2), //
 Op("get", FILE_system::PRED_get_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: put/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(put/1,public)




    public static Operation PRED_put_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // put(A):-current_output(B),put(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // put(A):-[current_output(B),put(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_output", FILE_system::PRED_current_output_1_static_exec, VA(a2), //
 Op("put", FILE_system::PRED_put_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: put/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(put/2,public)




    public static Operation PRED_put_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // put(A,B):-C is B,put_code(A,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // put(A,B):-[C is B,put_code(A,C)]
        a3 = m.mkvar1();
        //START inline expansion of a(3)is a(2)
        if (! a3.unify(Arithmetic.evaluate(a2), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("put_code", FILE_system::PRED_put_code_2_static_exec, VA(a1, a3), cont);
    }
/** PREDICATE: tab/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(tab/1,public)




    public static Operation PRED_tab_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // tab(A):-current_output(B),tab(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // tab(A):-[current_output(B),tab(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_output", FILE_system::PRED_current_output_1_static_exec, VA(a2), //
 Op("tab", FILE_system::PRED_tab_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: skip/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(skip/1,public)




    public static Operation PRED_skip_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // skip(A):-current_input(B),skip(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // skip(A):-[current_input(B),skip(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_input", FILE_system::PRED_current_input_1_static_exec, VA(a2), //
 Op("skip", FILE_system::PRED_skip_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: get_byte/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(get_byte/1,public)




    public static Operation PRED_get_byte_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // get_byte(A):-current_input(B),get_byte(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // get_byte(A):-[current_input(B),get_byte(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_input", FILE_system::PRED_current_input_1_static_exec, VA(a2), //
 Op("get_byte", FILE_system::PRED_get_byte_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: peek_byte/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(peek_byte/1,public)




    public static Operation PRED_peek_byte_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // peek_byte(A):-current_input(B),peek_byte(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // peek_byte(A):-[current_input(B),peek_byte(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_input", FILE_system::PRED_current_input_1_static_exec, VA(a2), //
 Op("peek_byte", FILE_system::PRED_peek_byte_2_static_exec, VA(a2, a1), cont));
    }
/** PREDICATE: put_byte/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/repl/io.pl
*/
    // main(put_byte/1,public)




    public static Operation PRED_put_byte_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // put_byte(A):-current_output(B),put_byte(B,A)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // put_byte(A):-[current_output(B),put_byte(B,A)]
        a2 = m.mkvar1();
        return //
 Op("current_output", FILE_system::PRED_current_output_1_static_exec, VA(a2), //
 Op("put_byte", FILE_system::PRED_put_byte_2_static_exec, VA(a2, a1), cont));
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("package",1,FILE_io::PRED_package_1_static_exec);
   PredTable.registerBuiltin("open",3,FILE_io::PRED_open_3_static_exec);
   PredTable.registerBuiltin("close",1,FILE_io::PRED_close_1_static_exec);
   PredTable.registerBuiltin("flush_output",0,FILE_io::PRED_flush_output_0_static_exec);
   PredTable.registerBuiltin("stream_property",2,FILE_io::PRED_stream_property_2_static_exec);
   PredTable.registerBuiltin("$stream_property",2,FILE_io::PRED_$stream_property_2_static_exec);
   PredTable.registerBuiltin("$stream_property_specifier",1,FILE_io::PRED_$stream_property_specifier_1_static_exec);
   PredTable.registerBuiltin("get_char",1,FILE_io::PRED_get_char_1_static_exec);
   PredTable.registerBuiltin("get_code",1,FILE_io::PRED_get_code_1_static_exec);
   PredTable.registerBuiltin("peek_char",1,FILE_io::PRED_peek_char_1_static_exec);
   PredTable.registerBuiltin("peek_code",1,FILE_io::PRED_peek_code_1_static_exec);
   PredTable.registerBuiltin("put_char",1,FILE_io::PRED_put_char_1_static_exec);
   PredTable.registerBuiltin("put_code",1,FILE_io::PRED_put_code_1_static_exec);
   PredTable.registerBuiltin("nl",1,FILE_io::PRED_nl_1_static_exec);
   PredTable.registerBuiltin("get0",1,FILE_io::PRED_get0_1_static_exec);
   PredTable.registerBuiltin("get0",2,FILE_io::PRED_get0_2_static_exec);
   PredTable.registerBuiltin("get",1,FILE_io::PRED_get_1_static_exec);
   PredTable.registerBuiltin("put",1,FILE_io::PRED_put_1_static_exec);
   PredTable.registerBuiltin("put",2,FILE_io::PRED_put_2_static_exec);
   PredTable.registerBuiltin("tab",1,FILE_io::PRED_tab_1_static_exec);
   PredTable.registerBuiltin("skip",1,FILE_io::PRED_skip_1_static_exec);
   PredTable.registerBuiltin("get_byte",1,FILE_io::PRED_get_byte_1_static_exec);
   PredTable.registerBuiltin("peek_byte",1,FILE_io::PRED_peek_byte_1_static_exec);
   PredTable.registerBuiltin("put_byte",1,FILE_io::PRED_put_byte_1_static_exec);
}
}

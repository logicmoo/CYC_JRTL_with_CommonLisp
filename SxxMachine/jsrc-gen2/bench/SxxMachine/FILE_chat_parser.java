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
public class FILE_chat_parser extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(top/0,public)




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-chat_parser
        m.setB0();
    // top:-[chat_parser]
        return //
 Op("chat_parser", FILE_chat_parser::PRED_chat_parser_0_static_exec, VA(), cont);
    }
/** PREDICATE: go/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(go/0,public)
        final static Functor ATOM_runtime = SYM("runtime");
        final static Functor ATOM_execution$0020time$0020is$0020 = SYM("execution time is ");
        final static Functor ATOM_milliseconds = SYM("milliseconds");




    public static Operation PRED_go_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // go:-statistics(runtime,[A,B]),chat_parser,statistics(runtime,[C,D]),write('execution time is '),write(D),write(milliseconds)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3, p4, p5;
    // go:-[statistics(runtime,[A,B]),chat_parser,statistics(runtime,[C,D]),write('execution time is '),write(D),write(milliseconds)]
        a1 = CONS(m.DONT_CARE1(),  Prolog.Nil );
        a2 = CONS(m.DONT_CARE1(), a1);
        a3 = m.mkvar1();
        a4 = CONS(a3,  Prolog.Nil );
        a5 = CONS(m.DONT_CARE1(), a4);
        return //
 Op("statistics", FILE_chat_parser::PRED_statistics_2_static_exec, VA( ATOM_runtime , a2), //
 Op("chat_parser", FILE_chat_parser::PRED_chat_parser_0_static_exec, VA(), //
 Op("statistics", FILE_chat_parser::PRED_statistics_2_static_exec, VA( ATOM_runtime , a5), //
 Op("write", FILE_chat_parser::PRED_write_1_static_exec, VA( ATOM_execution$0020time$0020is$0020 ), //
 Op("write", FILE_chat_parser::PRED_write_1_static_exec, VA(a3), //
 Op("write", FILE_chat_parser::PRED_write_1_static_exec, VA( ATOM_milliseconds ), cont))))));
    }
/** PREDICATE: chat_parser/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(chat_parser/0,public)




    public static Operation PRED_chat_parser_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry0(null, FILE_chat_parser::chat_parser_0_sub_1);
        return chat_parser_0_1(m);
    }

    private final static Operation chat_parser_0_sub_1(Prolog m) { 
        m.trust(null);
        return chat_parser_0_2(m);
    }

    private final static Operation chat_parser_0_1(Prolog m) { 
    // chat_parser:-my_string(A),determinate_say(A,B),fail
         Term a1;
        Operation p1, p2;
        Operation cont;
        cont = m.cont;
    // chat_parser:-[my_string(A),determinate_say(A,B),fail]
        a1 = m.mkvar1();
        return //
 Op("my_string", FILE_chat_parser::PRED_my_string_1_static_exec, VA(a1), //
 Op("determinate_say", FILE_chat_parser::PRED_determinate_say_2_static_exec, VA(a1, m.DONT_CARE2()), fail_0));
    }

    private final static Operation chat_parser_0_2(Prolog m) { 
    // chat_parser:-true
        Operation cont;
        cont = m.cont;
    // chat_parser:-[]
        return cont;
    }
/** PREDICATE: my_string/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(my_string/1,public)
        final static Functor ATOM_what = SYM("what");
        final static Functor ATOM_rivers = SYM("rivers");
        final static Functor ATOM_are = SYM("are");
        final static Functor ATOM_there = SYM("there");
        final static Functor ATOM_$003F = SYM("?");
    private static final Compound L_my_string_1_s7 = CONS( ATOM_$003F ,  Prolog.Nil );
    private static final Compound L_my_string_1_s8 = CONS( ATOM_there , L_my_string_1_s7);
    private static final Compound L_my_string_1_s9 = CONS( ATOM_are , L_my_string_1_s8);
    private static final Compound L_my_string_1_s10 = CONS( ATOM_rivers , L_my_string_1_s9);
    private static final Compound L_my_string_1_s11 = CONS( ATOM_what , L_my_string_1_s10);
        final static Functor ATOM_does = SYM("does");
        final static Functor ATOM_afghanistan = SYM("afghanistan");
        final static Functor ATOM_border = SYM("border");
        final static Functor ATOM_china = SYM("china");
    private static final Compound L_my_string_1_s16 = CONS( ATOM_china , L_my_string_1_s7);
    private static final Compound L_my_string_1_s17 = CONS( ATOM_border , L_my_string_1_s16);
    private static final Compound L_my_string_1_s18 = CONS( ATOM_afghanistan , L_my_string_1_s17);
    private static final Compound L_my_string_1_s19 = CONS( ATOM_does , L_my_string_1_s18);
        final static Functor ATOM_is = SYM("is");
        final static Functor ATOM_the = SYM("the");
        final static Functor ATOM_capital = SYM("capital");
        final static Functor ATOM_of = SYM("of");
        final static Functor ATOM_upper_volta = SYM("upper_volta");
    private static final Compound L_my_string_1_s25 = CONS( ATOM_upper_volta , L_my_string_1_s7);
    private static final Compound L_my_string_1_s26 = CONS( ATOM_of , L_my_string_1_s25);
    private static final Compound L_my_string_1_s27 = CONS( ATOM_capital , L_my_string_1_s26);
    private static final Compound L_my_string_1_s28 = CONS( ATOM_the , L_my_string_1_s27);
    private static final Compound L_my_string_1_s29 = CONS( ATOM_is , L_my_string_1_s28);
    private static final Compound L_my_string_1_s30 = CONS( ATOM_what , L_my_string_1_s29);
        final static Functor ATOM_where = SYM("where");
        final static Functor ATOM_largest = SYM("largest");
        final static Functor ATOM_country = SYM("country");
    private static final Compound L_my_string_1_s34 = CONS( ATOM_country , L_my_string_1_s7);
    private static final Compound L_my_string_1_s35 = CONS( ATOM_largest , L_my_string_1_s34);
    private static final Compound L_my_string_1_s36 = CONS( ATOM_the , L_my_string_1_s35);
    private static final Compound L_my_string_1_s37 = CONS( ATOM_is , L_my_string_1_s36);
    private static final Compound L_my_string_1_s38 = CONS( ATOM_where , L_my_string_1_s37);
        final static Functor ATOM_which = SYM("which");
        final static Functor ATOM_$007E = SYM("~");
        final static Functor ATOM_s = SYM("s");
        final static Functor ATOM_london = SYM("london");
    private static final Compound L_my_string_1_s43 = CONS( ATOM_london , L_my_string_1_s7);
    private static final Compound L_my_string_1_s44 = CONS( ATOM_is , L_my_string_1_s43);
    private static final Compound L_my_string_1_s45 = CONS( ATOM_capital , L_my_string_1_s44);
    private static final Compound L_my_string_1_s46 = CONS( ATOM_s , L_my_string_1_s45);
    private static final Compound L_my_string_1_s47 = CONS( ATOM_$007E , L_my_string_1_s46);
    private static final Compound L_my_string_1_s48 = CONS( ATOM_country , L_my_string_1_s47);
    private static final Compound L_my_string_1_s49 = CONS( ATOM_which , L_my_string_1_s48);
        final static Functor ATOM_countries = SYM("countries");
        final static Functor ATOM_european = SYM("european");
    private static final Compound L_my_string_1_s52 = CONS( ATOM_european , L_my_string_1_s7);
    private static final Compound L_my_string_1_s53 = CONS( ATOM_are , L_my_string_1_s52);
    private static final Compound L_my_string_1_s54 = CONS( ATOM_countries , L_my_string_1_s53);
    private static final Compound L_my_string_1_s55 = CONS( ATOM_which , L_my_string_1_s54);
        final static Functor ATOM_how = SYM("how");
        final static Functor ATOM_large = SYM("large");
        final static Functor ATOM_smallest = SYM("smallest");
        final static Functor ATOM_american = SYM("american");
    private static final Compound L_my_string_1_s60 = CONS( ATOM_american , L_my_string_1_s34);
    private static final Compound L_my_string_1_s61 = CONS( ATOM_smallest , L_my_string_1_s60);
    private static final Compound L_my_string_1_s62 = CONS( ATOM_the , L_my_string_1_s61);
    private static final Compound L_my_string_1_s63 = CONS( ATOM_is , L_my_string_1_s62);
    private static final Compound L_my_string_1_s64 = CONS( ATOM_large , L_my_string_1_s63);
    private static final Compound L_my_string_1_s65 = CONS( ATOM_how , L_my_string_1_s64);
        final static Functor ATOM_ocean = SYM("ocean");
        final static Functor ATOM_that = SYM("that");
        final static Functor ATOM_borders = SYM("borders");
        final static Functor ATOM_african = SYM("african");
        final static Functor ATOM_and = SYM("and");
        final static Functor ATOM_asian = SYM("asian");
    private static final Compound L_my_string_1_s72 = CONS( ATOM_countries , L_my_string_1_s7);
    private static final Compound L_my_string_1_s73 = CONS( ATOM_asian , L_my_string_1_s72);
    private static final Compound L_my_string_1_s74 = CONS( ATOM_borders , L_my_string_1_s73);
    private static final Compound L_my_string_1_s75 = CONS( ATOM_that , L_my_string_1_s74);
    private static final Compound L_my_string_1_s76 = CONS( ATOM_and , L_my_string_1_s75);
    private static final Compound L_my_string_1_s77 = CONS( ATOM_countries , L_my_string_1_s76);
    private static final Compound L_my_string_1_s78 = CONS( ATOM_african , L_my_string_1_s77);
    private static final Compound L_my_string_1_s79 = CONS( ATOM_borders , L_my_string_1_s78);
    private static final Compound L_my_string_1_s80 = CONS( ATOM_that , L_my_string_1_s79);
    private static final Compound L_my_string_1_s81 = CONS( ATOM_ocean , L_my_string_1_s80);
    private static final Compound L_my_string_1_s82 = CONS( ATOM_the , L_my_string_1_s81);
    private static final Compound L_my_string_1_s83 = CONS( ATOM_is , L_my_string_1_s82);
    private static final Compound L_my_string_1_s84 = CONS( ATOM_what , L_my_string_1_s83);
        final static Functor ATOM_capitals = SYM("capitals");
        final static Functor ATOM_bordering = SYM("bordering");
        final static Functor ATOM_baltic = SYM("baltic");
    private static final Compound L_my_string_1_s88 = CONS( ATOM_baltic , L_my_string_1_s7);
    private static final Compound L_my_string_1_s89 = CONS( ATOM_the , L_my_string_1_s88);
    private static final Compound L_my_string_1_s90 = CONS( ATOM_bordering , L_my_string_1_s89);
    private static final Compound L_my_string_1_s91 = CONS( ATOM_countries , L_my_string_1_s90);
    private static final Compound L_my_string_1_s92 = CONS( ATOM_the , L_my_string_1_s91);
    private static final Compound L_my_string_1_s93 = CONS( ATOM_of , L_my_string_1_s92);
    private static final Compound L_my_string_1_s94 = CONS( ATOM_capitals , L_my_string_1_s93);
    private static final Compound L_my_string_1_s95 = CONS( ATOM_the , L_my_string_1_s94);
    private static final Compound L_my_string_1_s96 = CONS( ATOM_are , L_my_string_1_s95);
    private static final Compound L_my_string_1_s97 = CONS( ATOM_what , L_my_string_1_s96);
        final static Functor ATOM_bordered = SYM("bordered");
        final static Functor ATOM_by = SYM("by");
        final static Functor ATOM_two = SYM("two");
        final static Functor ATOM_seas = SYM("seas");
    private static final Compound L_my_string_1_s102 = CONS( ATOM_seas , L_my_string_1_s7);
    private static final Compound L_my_string_1_s103 = CONS( ATOM_two , L_my_string_1_s102);
    private static final Compound L_my_string_1_s104 = CONS( ATOM_by , L_my_string_1_s103);
    private static final Compound L_my_string_1_s105 = CONS( ATOM_bordered , L_my_string_1_s104);
    private static final Compound L_my_string_1_s106 = CONS( ATOM_are , L_my_string_1_s105);
    private static final Compound L_my_string_1_s107 = CONS( ATOM_countries , L_my_string_1_s106);
    private static final Compound L_my_string_1_s108 = CONS( ATOM_which , L_my_string_1_s107);
        final static Functor ATOM_many = SYM("many");
        final static Functor ATOM_danube = SYM("danube");
        final static Functor ATOM_flow = SYM("flow");
        final static Functor ATOM_through = SYM("through");
    private static final Compound L_my_string_1_s113 = CONS( ATOM_through , L_my_string_1_s7);
    private static final Compound L_my_string_1_s114 = CONS( ATOM_flow , L_my_string_1_s113);
    private static final Compound L_my_string_1_s115 = CONS( ATOM_danube , L_my_string_1_s114);
    private static final Compound L_my_string_1_s116 = CONS( ATOM_the , L_my_string_1_s115);
    private static final Compound L_my_string_1_s117 = CONS( ATOM_does , L_my_string_1_s116);
    private static final Compound L_my_string_1_s118 = CONS( ATOM_countries , L_my_string_1_s117);
    private static final Compound L_my_string_1_s119 = CONS( ATOM_many , L_my_string_1_s118);
    private static final Compound L_my_string_1_s120 = CONS( ATOM_how , L_my_string_1_s119);
        final static Functor ATOM_total = SYM("total");
        final static Functor ATOM_area = SYM("area");
        final static Functor ATOM_south = SYM("south");
        final static Functor ATOM_equator = SYM("equator");
        final static Functor ATOM_not = SYM("not");
        final static Functor ATOM_in = SYM("in");
        final static Functor ATOM_australasia = SYM("australasia");
    private static final Compound L_my_string_1_s128 = CONS( ATOM_australasia , L_my_string_1_s7);
    private static final Compound L_my_string_1_s129 = CONS( ATOM_in , L_my_string_1_s128);
    private static final Compound L_my_string_1_s130 = CONS( ATOM_not , L_my_string_1_s129);
    private static final Compound L_my_string_1_s131 = CONS( ATOM_and , L_my_string_1_s130);
    private static final Compound L_my_string_1_s132 = CONS( ATOM_equator , L_my_string_1_s131);
    private static final Compound L_my_string_1_s133 = CONS( ATOM_the , L_my_string_1_s132);
    private static final Compound L_my_string_1_s134 = CONS( ATOM_of , L_my_string_1_s133);
    private static final Compound L_my_string_1_s135 = CONS( ATOM_south , L_my_string_1_s134);
    private static final Compound L_my_string_1_s136 = CONS( ATOM_countries , L_my_string_1_s135);
    private static final Compound L_my_string_1_s137 = CONS( ATOM_of , L_my_string_1_s136);
    private static final Compound L_my_string_1_s138 = CONS( ATOM_area , L_my_string_1_s137);
    private static final Compound L_my_string_1_s139 = CONS( ATOM_total , L_my_string_1_s138);
    private static final Compound L_my_string_1_s140 = CONS( ATOM_the , L_my_string_1_s139);
    private static final Compound L_my_string_1_s141 = CONS( ATOM_is , L_my_string_1_s140);
    private static final Compound L_my_string_1_s142 = CONS( ATOM_what , L_my_string_1_s141);
        final static Functor ATOM_average = SYM("average");
        final static Functor ATOM_each = SYM("each");
        final static Functor ATOM_continent = SYM("continent");
    private static final Compound L_my_string_1_s146 = CONS( ATOM_continent , L_my_string_1_s7);
    private static final Compound L_my_string_1_s147 = CONS( ATOM_each , L_my_string_1_s146);
    private static final Compound L_my_string_1_s148 = CONS( ATOM_in , L_my_string_1_s147);
    private static final Compound L_my_string_1_s149 = CONS( ATOM_countries , L_my_string_1_s148);
    private static final Compound L_my_string_1_s150 = CONS( ATOM_the , L_my_string_1_s149);
    private static final Compound L_my_string_1_s151 = CONS( ATOM_of , L_my_string_1_s150);
    private static final Compound L_my_string_1_s152 = CONS( ATOM_area , L_my_string_1_s151);
    private static final Compound L_my_string_1_s153 = CONS( ATOM_average , L_my_string_1_s152);
    private static final Compound L_my_string_1_s154 = CONS( ATOM_the , L_my_string_1_s153);
    private static final Compound L_my_string_1_s155 = CONS( ATOM_is , L_my_string_1_s154);
    private static final Compound L_my_string_1_s156 = CONS( ATOM_what , L_my_string_1_s155);
        final static Functor ATOM_more = SYM("more");
        final static Functor ATOM_than = SYM("than");
        final static Functor ATOM_one = SYM("one");
    private static final Compound L_my_string_1_s160 = CONS( ATOM_country , L_my_string_1_s148);
    private static final Compound L_my_string_1_s161 = CONS( ATOM_one , L_my_string_1_s160);
    private static final Compound L_my_string_1_s162 = CONS( ATOM_than , L_my_string_1_s161);
    private static final Compound L_my_string_1_s163 = CONS( ATOM_more , L_my_string_1_s162);
    private static final Compound L_my_string_1_s164 = CONS( ATOM_there , L_my_string_1_s163);
    private static final Compound L_my_string_1_s165 = CONS( ATOM_is , L_my_string_1_s164);
        final static Functor ATOM_some = SYM("some");
        final static Functor ATOM_any = SYM("any");
    private static final Compound L_my_string_1_s168 = CONS( ATOM_any , L_my_string_1_s34);
    private static final Compound L_my_string_1_s169 = CONS( ATOM_border , L_my_string_1_s168);
    private static final Compound L_my_string_1_s170 = CONS( ATOM_not , L_my_string_1_s169);
    private static final Compound L_my_string_1_s171 = CONS( ATOM_does , L_my_string_1_s170);
    private static final Compound L_my_string_1_s172 = CONS( ATOM_that , L_my_string_1_s171);
    private static final Compound L_my_string_1_s173 = CONS( ATOM_ocean , L_my_string_1_s172);
    private static final Compound L_my_string_1_s174 = CONS( ATOM_some , L_my_string_1_s173);
    private static final Compound L_my_string_1_s175 = CONS( ATOM_there , L_my_string_1_s174);
    private static final Compound L_my_string_1_s176 = CONS( ATOM_is , L_my_string_1_s175);
        final static Functor ATOM_from = SYM("from");
        final static Functor ATOM_a = SYM("a");
        final static Functor ATOM_river = SYM("river");
        final static Functor ATOM_flows = SYM("flows");
        final static Functor ATOM_into = SYM("into");
        final static Functor ATOM_black_sea = SYM("black_sea");
    private static final Compound L_my_string_1_s183 = CONS( ATOM_black_sea , L_my_string_1_s7);
    private static final Compound L_my_string_1_s184 = CONS( ATOM_the , L_my_string_1_s183);
    private static final Compound L_my_string_1_s185 = CONS( ATOM_into , L_my_string_1_s184);
    private static final Compound L_my_string_1_s186 = CONS( ATOM_flows , L_my_string_1_s185);
    private static final Compound L_my_string_1_s187 = CONS( ATOM_river , L_my_string_1_s186);
    private static final Compound L_my_string_1_s188 = CONS( ATOM_a , L_my_string_1_s187);
    private static final Compound L_my_string_1_s189 = CONS( ATOM_which , L_my_string_1_s188);
    private static final Compound L_my_string_1_s190 = CONS( ATOM_from , L_my_string_1_s189);
    private static final Compound L_my_string_1_s191 = CONS( ATOM_countries , L_my_string_1_s190);
    private static final Compound L_my_string_1_s192 = CONS( ATOM_the , L_my_string_1_s191);
    private static final Compound L_my_string_1_s193 = CONS( ATOM_are , L_my_string_1_s192);
    private static final Compound L_my_string_1_s194 = CONS( ATOM_what , L_my_string_1_s193);




    public static Operation PRED_my_string_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::my_string_1_var, fail_0, fail_0, fail_0, fail_0, FILE_chat_parser::my_string_1_var); 
    }

    private final static Operation my_string_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::my_string_1_var_1);
        return my_string_1_1(m);
    }

    private final static Operation my_string_1_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_2);
        return my_string_1_2(m);
    }

    private final static Operation my_string_1_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_3);
        return my_string_1_3(m);
    }

    private final static Operation my_string_1_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_4);
        return my_string_1_4(m);
    }

    private final static Operation my_string_1_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_5);
        return my_string_1_5(m);
    }

    private final static Operation my_string_1_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_6);
        return my_string_1_6(m);
    }

    private final static Operation my_string_1_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_7);
        return my_string_1_7(m);
    }

    private final static Operation my_string_1_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_8);
        return my_string_1_8(m);
    }

    private final static Operation my_string_1_var_8(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_9);
        return my_string_1_9(m);
    }

    private final static Operation my_string_1_var_9(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_10);
        return my_string_1_10(m);
    }

    private final static Operation my_string_1_var_10(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_11);
        return my_string_1_11(m);
    }

    private final static Operation my_string_1_var_11(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_12);
        return my_string_1_12(m);
    }

    private final static Operation my_string_1_var_12(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_13);
        return my_string_1_13(m);
    }

    private final static Operation my_string_1_var_13(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_14);
        return my_string_1_14(m);
    }

    private final static Operation my_string_1_var_14(Prolog m) { 
        m.retry(null, FILE_chat_parser::my_string_1_var_15);
        return my_string_1_15(m);
    }

    private final static Operation my_string_1_var_15(Prolog m) { 
        m.trust(null);
        return my_string_1_16(m);
    }

    private final static Operation my_string_1_1(Prolog m) { 
    // my_string([what,rivers,are,there,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([what,rivers,are,there,?]):-[]
        if (! L_my_string_1_s11.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_2(Prolog m) { 
    // my_string([does,afghanistan,border,china,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([does,afghanistan,border,china,?]):-[]
        if (! L_my_string_1_s19.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_3(Prolog m) { 
    // my_string([what,is,the,capital,of,upper_volta,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([what,is,the,capital,of,upper_volta,?]):-[]
        if (! L_my_string_1_s30.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_4(Prolog m) { 
    // my_string([where,is,the,largest,country,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([where,is,the,largest,country,?]):-[]
        if (! L_my_string_1_s38.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_5(Prolog m) { 
    // my_string([which,country,~,s,capital,is,london,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([which,country,~,s,capital,is,london,?]):-[]
        if (! L_my_string_1_s49.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_6(Prolog m) { 
    // my_string([which,countries,are,european,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([which,countries,are,european,?]):-[]
        if (! L_my_string_1_s55.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_7(Prolog m) { 
    // my_string([how,large,is,the,smallest,american,country,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([how,large,is,the,smallest,american,country,?]):-[]
        if (! L_my_string_1_s65.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_8(Prolog m) { 
    // my_string([what,is,the,ocean,that,borders,african,countries,and,that,borders,asian,countries,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([what,is,the,ocean,that,borders,african,countries,and,that,borders,asian,countries,?]):-[]
        if (! L_my_string_1_s84.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_9(Prolog m) { 
    // my_string([what,are,the,capitals,of,the,countries,bordering,the,baltic,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([what,are,the,capitals,of,the,countries,bordering,the,baltic,?]):-[]
        if (! L_my_string_1_s97.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_10(Prolog m) { 
    // my_string([which,countries,are,bordered,by,two,seas,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([which,countries,are,bordered,by,two,seas,?]):-[]
        if (! L_my_string_1_s108.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_11(Prolog m) { 
    // my_string([how,many,countries,does,the,danube,flow,through,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([how,many,countries,does,the,danube,flow,through,?]):-[]
        if (! L_my_string_1_s120.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_12(Prolog m) { 
    // my_string([what,is,the,total,area,of,countries,south,of,the,equator,and,not,in,australasia,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([what,is,the,total,area,of,countries,south,of,the,equator,and,not,in,australasia,?]):-[]
        if (! L_my_string_1_s142.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_13(Prolog m) { 
    // my_string([what,is,the,average,area,of,the,countries,in,each,continent,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([what,is,the,average,area,of,the,countries,in,each,continent,?]):-[]
        if (! L_my_string_1_s156.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_14(Prolog m) { 
    // my_string([is,there,more,than,one,country,in,each,continent,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([is,there,more,than,one,country,in,each,continent,?]):-[]
        if (! L_my_string_1_s165.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_15(Prolog m) { 
    // my_string([is,there,some,ocean,that,does,not,border,any,country,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([is,there,some,ocean,that,does,not,border,any,country,?]):-[]
        if (! L_my_string_1_s176.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation my_string_1_16(Prolog m) { 
    // my_string([what,are,the,countries,from,which,a,river,flows,into,the,black_sea,?]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // my_string([what,are,the,countries,from,which,a,river,flows,into,the,black_sea,?]):-[]
        if (! L_my_string_1_s194.unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: determinate_say/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(determinate_say/2,public)




    public static Operation PRED_determinate_say_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // determinate_say(A,B):-say(A,B),!
        m.setB0();
         Term a1, a2, a3;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // determinate_say(A,B):-['$get_level'(C),say(A,B),'$cut'(C)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("say", FILE_chat_parser::PRED_say_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_chat_parser::PRED_$cut_1_static_exec, VA(a3), cont));
    }
/** PREDICATE: terminal/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(terminal/5,public)
        final static Functor FUNCTOR_x_4 = F("x",4);
        final static Functor ATOM_terminal = SYM("terminal");

    // private final Term arg5;




    public static Operation PRED_terminal_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_chat_parser::terminal_5_sub_1);
        return terminal_5_1(m);
    }

    private final static Operation terminal_5_sub_1(Prolog m) { 
        m.trust(null);
        return terminal_5_2(m);
    }

    private final static Operation terminal_5_1(Prolog m) { 
    // terminal(A,B,B,x(C,terminal,A,D),D):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // terminal(A,B,B,x(C,terminal,A,D),D):-[]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_x_4 , m.trail, m.DONT_CARE1(),  ATOM_terminal , a1, a6)){
                return m.fail();
            }
        if (! a6.unify(a5, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation terminal_5_2(Prolog m) { 
    // terminal(A,[A|B],B,C,C):-gap(C)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // terminal(A,[A|B],B,C,C):-[gap(C)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a1.unify(a2.car(), m.trail))
                return m.fail();
            a6 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
             a2.bind(CONS(a1, a6), m.trail);
        } else {
            return m.fail();
        }
        if (! a6.unify(a3, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        return //
 Op("gap", FILE_chat_parser::PRED_gap_1_static_exec, VA(a4), cont);
    }
/** PREDICATE: gap/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(gap/1,public)
        final static Functor ATOM_gap = SYM("gap");




    public static Operation PRED_gap_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::gap_1_var, fail_0, fail_0, FILE_chat_parser::gap_1_2, FILE_chat_parser::gap_1_1, fail_0); 
    }

    private final static Operation gap_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::gap_1_var_1);
        return gap_1_1(m);
    }

    private final static Operation gap_1_var_1(Prolog m) { 
        m.trust(null);
        return gap_1_2(m);
    }

    private final static Operation gap_1_1(Prolog m) { 
    // gap(x(gap,A,B,C)):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // gap(x(gap,A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_gap , m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation gap_1_2(Prolog m) { 
    // gap([]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // gap([]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: virtual/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(virtual/3,public)
        final static Functor ATOM_nonterminal = SYM("nonterminal");




    public static Operation PRED_virtual_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // virtual(A,x(B,nonterminal,A,C),C):-true
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // virtual(A,x(B,nonterminal,A,C),C):-[]
        a2 = a2.dref();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_x_4 , m.trail, m.DONT_CARE1(),  ATOM_nonterminal , a1, a4)){
                return m.fail();
            }
        if (! a4.unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: is_pp/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(is_pp/1,public)
        final static Functor FUNCTOR_$0023_4 = F("#",4);




    public static Operation PRED_is_pp_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // is_pp(#(1,A,B,C)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // is_pp(#(1,A,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0023_4 , m.trail,  int_1 , m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: is_pred/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(is_pred/1,public)




    public static Operation PRED_is_pred_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // is_pred(#(A,1,B,C)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // is_pred(#(A,1,B,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0023_4 , m.trail, m.DONT_CARE1(),  int_1 , m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: is_trace/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(is_trace/1,public)




    public static Operation PRED_is_trace_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // is_trace(#(A,B,1,C)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // is_trace(#(A,B,1,C)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0023_4 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(),  int_1 , m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: is_adv/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(is_adv/1,public)




    public static Operation PRED_is_adv_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // is_adv(#(A,B,C,1)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // is_adv(#(A,B,C,1)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0023_4 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(),  int_1 )){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: trace1/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(trace1/2,public)
    private static final Compound L_trace1_2_s5 = S( FUNCTOR_$0023_4 ,  int_0 ,  int_0 ,  int_0 ,  int_0 );




    public static Operation PRED_trace1_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // trace1(#(A,B,1,C),#(0,0,0,0)):-true
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // trace1(#(A,B,1,C),#(0,0,0,0)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0023_4 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(),  int_1 , m.DONT_CARE1())){
                return m.fail();
            }
        if (! L_trace1_2_s5.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: trace1/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(trace1/1,public)
    private static final Compound L_trace1_1_s5 = S( FUNCTOR_$0023_4 ,  int_0 ,  int_0 ,  int_1 ,  int_0 );




    public static Operation PRED_trace1_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // trace1(#(0,0,1,0)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // trace1(#(0,0,1,0)):-[]
        if (! L_trace1_1_s5.unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: adv/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(adv/1,public)
    private static final Compound L_adv_1_s5 = S( FUNCTOR_$0023_4 ,  int_0 ,  int_0 ,  int_0 ,  int_1 );




    public static Operation PRED_adv_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // adv(#(0,0,0,1)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // adv(#(0,0,0,1)):-[]
        if (! L_adv_1_s5.unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: empty/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(empty/1,public)
    private static final Compound L_empty_1_s4 = S( FUNCTOR_$0023_4 ,  int_0 ,  int_0 ,  int_0 ,  int_0 );




    public static Operation PRED_empty_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // empty(#(0,0,0,0)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // empty(#(0,0,0,0)):-[]
        if (! L_empty_1_s4.unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: np_all/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(np_all/1,public)
    private static final Compound L_np_all_1_s5 = S( FUNCTOR_$0023_4 ,  int_1 ,  int_1 ,  int_1 ,  int_0 );




    public static Operation PRED_np_all_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // np_all(#(1,1,1,0)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // np_all(#(1,1,1,0)):-[]
        if (! L_np_all_1_s5.unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: s_all/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(s_all/1,public)
    private static final Compound L_s_all_1_s5 = S( FUNCTOR_$0023_4 ,  int_1 ,  int_0 ,  int_1 ,  int_1 );




    public static Operation PRED_s_all_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // s_all(#(1,0,1,1)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // s_all(#(1,0,1,1)):-[]
        if (! L_s_all_1_s5.unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: np_no_trace/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(np_no_trace/1,public)
    private static final Compound L_np_no_trace_1_s5 = S( FUNCTOR_$0023_4 ,  int_1 ,  int_1 ,  int_0 ,  int_0 );




    public static Operation PRED_np_no_trace_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // np_no_trace(#(1,1,0,0)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // np_no_trace(#(1,1,0,0)):-[]
        if (! L_np_no_trace_1_s5.unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: myplus/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(myplus/3,public)




    public static Operation PRED_myplus_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // myplus(#(A,B,C,D),#(E,F,G,H),#(I,J,K,L)):-or(A,E,I),or(B,F,J),or(C,G,K),or(D,H,L)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // myplus(#(A,B,C,D),#(E,F,G,H),#(I,J,K,L)):-[or(A,E,I),or(B,F,J),or(C,G,K),or(D,H,L)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$0023_4 , m.trail, a4, a5, a6, a7)){
                return m.fail();
            }
        a2 = a2.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$0023_4 , m.trail, a8, a9, a10, a11)){
                return m.fail();
            }
        a3 = a3.dref();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            a14 = m.mkvar2();
            a15 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$0023_4 , m.trail, a12, a13, a14, a15)){
                return m.fail();
            }
        return //
 Op("or", FILE_chat_parser::PRED_or_3_static_exec, VA(a4, a8, a12), //
 Op("or", FILE_chat_parser::PRED_or_3_static_exec, VA(a5, a9, a13), //
 Op("or", FILE_chat_parser::PRED_or_3_static_exec, VA(a6, a10, a14), //
 Op("or", FILE_chat_parser::PRED_or_3_static_exec, VA(a7, a11, a15), cont))));
    }
/** PREDICATE: minus/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(minus/3,public)




    public static Operation PRED_minus_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // minus(#(A,B,C,D),#(E,F,G,H),#(I,J,K,L)):-anot(A,E,I),anot(B,F,J),anot(C,G,K),anot(D,H,L)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // minus(#(A,B,C,D),#(E,F,G,H),#(I,J,K,L)):-[anot(A,E,I),anot(B,F,J),anot(C,G,K),anot(D,H,L)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$0023_4 , m.trail, a4, a5, a6, a7)){
                return m.fail();
            }
        a2 = a2.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$0023_4 , m.trail, a8, a9, a10, a11)){
                return m.fail();
            }
        a3 = a3.dref();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            a14 = m.mkvar2();
            a15 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$0023_4 , m.trail, a12, a13, a14, a15)){
                return m.fail();
            }
        return //
 Op("anot", FILE_chat_parser::PRED_anot_3_static_exec, VA(a4, a8, a12), //
 Op("anot", FILE_chat_parser::PRED_anot_3_static_exec, VA(a5, a9, a13), //
 Op("anot", FILE_chat_parser::PRED_anot_3_static_exec, VA(a6, a10, a14), //
 Op("anot", FILE_chat_parser::PRED_anot_3_static_exec, VA(a7, a11, a15), cont))));
    }
/** PREDICATE: or/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(or/3,public)




    public static Operation PRED_or_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::or_3_var, FILE_chat_parser::or_3_var, fail_0, fail_0, fail_0, fail_0); 
    }

    private final static Operation or_3_var(Prolog m) { 
        m.jtry3(null, FILE_chat_parser::or_3_var_1);
        return or_3_1(m);
    }

    private final static Operation or_3_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::or_3_var_2);
        return or_3_2(m);
    }

    private final static Operation or_3_var_2(Prolog m) { 
        m.trust(null);
        return or_3_3(m);
    }

    private final static Operation or_3_1(Prolog m) { 
    // or(1,A,1):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // or(1,A,1):-[]
        if (!  int_1 .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation or_3_2(Prolog m) { 
    // or(0,1,1):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // or(0,1,1):-[]
        if (!  int_0 .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a2, m.trail))
            return m.fail();
        if (!  int_1 .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation or_3_3(Prolog m) { 
    // or(0,0,0):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // or(0,0,0):-[]
        if (!  int_0 .unify(a1, m.trail))
            return m.fail();
        if (!  int_0 .unify(a2, m.trail))
            return m.fail();
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: anot/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(anot/3,public)




    public static Operation PRED_anot_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_chat_parser::anot_3_sub_1);
        return anot_3_1(m);
    }

    private final static Operation anot_3_sub_1(Prolog m) { 
        m.trust(null);
        return anot_3_2(m);
    }

    private final static Operation anot_3_1(Prolog m) { 
    // anot(A,0,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // anot(A,0,A):-[]
        if (!  int_0 .unify(a2, m.trail))
            return m.fail();
        if (! a1.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation anot_3_2(Prolog m) { 
    // anot(A,1,0):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // anot(A,1,0):-[]
        if (!  int_1 .unify(a2, m.trail))
            return m.fail();
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: role/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(role/3,public)
        final static Functor ATOM_subj = SYM("subj");
        final static Functor FUNCTOR_$0023_3 = F("#",3);
    private static final Compound L_role_3_s6 = S( FUNCTOR_$0023_3 ,  int_1 ,  int_0 ,  int_0 );
        final static Functor ATOM_compl = SYM("compl");
        final static Functor ATOM_undef = SYM("undef");
        final static Functor ATOM_main = SYM("main");
        final static Functor ATOM_aux = SYM("aux");
        final static Functor ATOM_decl = SYM("decl");
        final static Functor ATOM_nil = SYM("nil");




    public static Operation PRED_role_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::role_3_var, fail_0, fail_0, FILE_chat_parser::role_3_var, fail_0, fail_0); 
    }

    private final static Operation role_3_var(Prolog m) { 
        m.jtry3(null, FILE_chat_parser::role_3_var_1);
        return role_3_1(m);
    }

    private final static Operation role_3_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::role_3_var_2);
        return role_3_2(m);
    }

    private final static Operation role_3_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::role_3_var_3);
        return role_3_3(m);
    }

    private final static Operation role_3_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::role_3_var_4);
        return role_3_4(m);
    }

    private final static Operation role_3_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::role_3_var_5);
        return role_3_5(m);
    }

    private final static Operation role_3_var_5(Prolog m) { 
        m.trust(null);
        return role_3_6(m);
    }

    private final static Operation role_3_1(Prolog m) { 
    // role(subj,A,#(1,0,0)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // role(subj,A,#(1,0,0)):-[]
        if (!  ATOM_subj .unify(a1, m.trail))
            return m.fail();
        if (! L_role_3_s6.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation role_3_2(Prolog m) { 
    // role(compl,A,#(0,B,C)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // role(compl,A,#(0,B,C)):-[]
        if (!  ATOM_compl .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_$0023_3 , m.trail,  int_0 , m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation role_3_3(Prolog m) { 
    // role(undef,main,#(A,0,B)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // role(undef,main,#(A,0,B)):-[]
        if (!  ATOM_undef .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_main .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_$0023_3 , m.trail, m.DONT_CARE1(),  int_0 , m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation role_3_4(Prolog m) { 
    // role(undef,aux,#(0,A,B)):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // role(undef,aux,#(0,A,B)):-[]
        if (!  ATOM_undef .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_aux .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_$0023_3 , m.trail,  int_0 , m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation role_3_5(Prolog m) { 
    // role(undef,decl,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // role(undef,decl,A):-[]
        if (!  ATOM_undef .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_decl .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation role_3_6(Prolog m) { 
    // role(nil,A,B):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // role(nil,A,B):-[]
        if (!  ATOM_nil .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: subj_case/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(subj_case/1,public)
    private static final Compound L_subj_case_1_s5 = S( FUNCTOR_$0023_3 ,  int_1 ,  int_0 ,  int_0 );




    public static Operation PRED_subj_case_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // subj_case(#(1,0,0)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // subj_case(#(1,0,0)):-[]
        if (! L_subj_case_1_s5.unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: verb_case/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(verb_case/1,public)
    private static final Compound L_verb_case_1_s5 = S( FUNCTOR_$0023_3 ,  int_0 ,  int_1 ,  int_0 );




    public static Operation PRED_verb_case_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // verb_case(#(0,1,0)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // verb_case(#(0,1,0)):-[]
        if (! L_verb_case_1_s5.unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: prep_case/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(prep_case/1,public)
    private static final Compound L_prep_case_1_s5 = S( FUNCTOR_$0023_3 ,  int_0 ,  int_0 ,  int_1 );




    public static Operation PRED_prep_case_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // prep_case(#(0,0,1)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // prep_case(#(0,0,1)):-[]
        if (! L_prep_case_1_s5.unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: compl_case/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(compl_case/1,public)




    public static Operation PRED_compl_case_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // compl_case(#(0,A,B)):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // compl_case(#(0,A,B)):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$0023_3 , m.trail,  int_0 , m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: say/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(say/2,public)




    public static Operation PRED_say_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // say(A,B):-sentence(B,A,[],[],[])
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // say(A,B):-[sentence(B,A,[],[],[])]
        return //
 Op("sentence", FILE_chat_parser::PRED_sentence_5_static_exec, VA(a2, a1,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ), cont);
    }
/** PREDICATE: sentence/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(sentence/5,public)
        final static Functor ATOM_$002E = SYM(".");
        final static Functor ATOM_$0021 = SYM("!");

    // private final Term arg5;




    public static Operation PRED_sentence_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_chat_parser::sentence_5_sub_1);
        return sentence_5_1(m);
    }

    private final static Operation sentence_5_sub_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::sentence_5_sub_2);
        return sentence_5_2(m);
    }

    private final static Operation sentence_5_sub_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::sentence_5_sub_3);
        return sentence_5_3(m);
    }

    private final static Operation sentence_5_sub_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::sentence_5_sub_4);
        return sentence_5_4(m);
    }

    private final static Operation sentence_5_sub_4(Prolog m) { 
        m.trust(null);
        return sentence_5_5(m);
    }

    private final static Operation sentence_5_1(Prolog m) { 
    // sentence(A,B,C,D,E):-declarative(A,B,F,D,G),terminator('.',F,C,G,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // sentence(A,B,C,D,E):-[declarative(A,B,F,D,G),terminator('.',F,C,G,E)]
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op("declarative", FILE_chat_parser::PRED_declarative_5_static_exec, VA(a1, a2, a6, a4, a7), //
 Op("terminator", FILE_chat_parser::PRED_terminator_5_static_exec, VA( ATOM_$002E , a6, a3, a7, a5), cont));
    }

    private final static Operation sentence_5_2(Prolog m) { 
    // sentence(A,B,C,D,E):-wh_question(A,B,F,D,G),terminator(?,F,C,G,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // sentence(A,B,C,D,E):-[wh_question(A,B,F,D,G),terminator(?,F,C,G,E)]
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op("wh_question", FILE_chat_parser::PRED_wh_question_5_static_exec, VA(a1, a2, a6, a4, a7), //
 Op("terminator", FILE_chat_parser::PRED_terminator_5_static_exec, VA( ATOM_$003F , a6, a3, a7, a5), cont));
    }

    private final static Operation sentence_5_3(Prolog m) { 
    // sentence(A,B,C,D,E):-topic(B,F,D,G),wh_question(A,F,H,G,I),terminator(?,H,C,I,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // sentence(A,B,C,D,E):-[topic(B,F,D,G),wh_question(A,F,H,G,I),terminator(?,H,C,I,E)]
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op("topic", FILE_chat_parser::PRED_topic_4_static_exec, VA(a2, a6, a4, a7), //
 Op("wh_question", FILE_chat_parser::PRED_wh_question_5_static_exec, VA(a1, a6, a8, a7, a9), //
 Op("terminator", FILE_chat_parser::PRED_terminator_5_static_exec, VA( ATOM_$003F , a8, a3, a9, a5), cont)));
    }

    private final static Operation sentence_5_4(Prolog m) { 
    // sentence(A,B,C,D,E):-yn_question(A,B,F,D,G),terminator(?,F,C,G,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // sentence(A,B,C,D,E):-[yn_question(A,B,F,D,G),terminator(?,F,C,G,E)]
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op("yn_question", FILE_chat_parser::PRED_yn_question_5_static_exec, VA(a1, a2, a6, a4, a7), //
 Op("terminator", FILE_chat_parser::PRED_terminator_5_static_exec, VA( ATOM_$003F , a6, a3, a7, a5), cont));
    }

    private final static Operation sentence_5_5(Prolog m) { 
    // sentence(A,B,C,D,E):-imperative(A,B,F,D,G),terminator(!,F,C,G,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // sentence(A,B,C,D,E):-[imperative(A,B,F,D,G),terminator(!,F,C,G,E)]
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op("imperative", FILE_chat_parser::PRED_imperative_5_static_exec, VA(a1, a2, a6, a4, a7), //
 Op("terminator", FILE_chat_parser::PRED_terminator_5_static_exec, VA( ATOM_$0021 , a6, a3, a7, a5), cont));
    }
/** PREDICATE: pp/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(pp/8,public)
        final static Functor FUNCTOR_pp_4 = F("pp",4);
        final static Functor FUNCTOR_pp_2 = F("pp",2);

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_pp_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::pp_8_var, FILE_chat_parser::pp_8_1, FILE_chat_parser::pp_8_1, FILE_chat_parser::pp_8_1, FILE_chat_parser::pp_8_var, FILE_chat_parser::pp_8_1); 
    }

    private final static Operation pp_8_var(Prolog m) { 
        m.jtry8(null, FILE_chat_parser::pp_8_var_1);
        return pp_8_1(m);
    }

    private final static Operation pp_8_var_1(Prolog m) { 
        m.trust(null);
        return pp_8_2(m);
    }

    private final static Operation pp_8_1(Prolog m) { 
    // pp(A,B,C,D,E,E,F,G):-virtual(pp(A,B,C,D),F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // pp(A,B,C,D,E,E,F,G):-[virtual(pp(A,B,C,D),F,G)]
        if (! a5.unify(a6, m.trail))
            return m.fail();
    // put_str_args([a(1),a(2),a(3),a(4)],y(1)),put_str(@('FUNCTOR_pp_4'),y(1),a(9))
        a9 =  S( FUNCTOR_pp_4 , a1, a2, a3, a4);
 ;
        return //
 Op("virtual", FILE_chat_parser::PRED_virtual_3_static_exec, VA(a9, a7, a8), cont);
    }

    private final static Operation pp_8_2(Prolog m) { 
    // pp(pp(A,B),C,D,E,F,G,H,I):-prep(A,F,J,H,K),prep_case(L),np(B,M,L,N,C,D,E,J,G,K,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
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
    // pp(pp(A,B),C,D,E,F,G,H,I):-[prep(A,F,J,H,K),prep_case(L),np(B,M,L,N,C,D,E,J,G,K,I)]
        a1 = a1.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_pp_2 , m.trail, a9, a10)){
                return m.fail();
            }
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        return //
 Op("prep", FILE_chat_parser::PRED_prep_5_static_exec, VA(a9, a5, a11, a7, a12), //
 Op("prep_case", FILE_chat_parser::PRED_prep_case_1_static_exec, VA(a13), //
 Op("np", FILE_chat_parser::PRED_np_11_static_exec, VA(a10, m.DONT_CARE2(), a13, m.DONT_CARE2(), a2, a3, a4, a11, a6, a12, a8), cont)));
    }
/** PREDICATE: topic/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(topic/4,public)




    public static Operation PRED_topic_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // topic(A,B,C,x(gap,nonterminal,pp(D,compl,E,F),G)):-pp(D,compl,E,F,A,H,C,I),opt_comma(H,B,I,G)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // topic(A,B,C,x(gap,nonterminal,pp(D,compl,E,F),G)):-[pp(D,compl,E,F,A,H,C,I),opt_comma(H,B,I,G)]
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_gap ,  ATOM_nonterminal , a5, a6)){
                return m.fail();
            }
        a5 = a5.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_pp_4 , m.trail, a7,  ATOM_compl , a8, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        return //
 Op("pp", FILE_chat_parser::PRED_pp_8_static_exec, VA(a7,  ATOM_compl , a8, a9, a1, a10, a3, a11), //
 Op("opt_comma", FILE_chat_parser::PRED_opt_comma_4_static_exec, VA(a10, a2, a11, a6), cont));
    }
/** PREDICATE: opt_comma/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(opt_comma/4,public)
        final static Functor ATOM_$002C = SYM(",");




    public static Operation PRED_opt_comma_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_chat_parser::opt_comma_4_sub_1);
        return opt_comma_4_1(m);
    }

    private final static Operation opt_comma_4_sub_1(Prolog m) { 
        m.trust(null);
        return opt_comma_4_2(m);
    }

    private final static Operation opt_comma_4_1(Prolog m) { 
    // opt_comma(A,B,C,D):- ~(',',A,B,C,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // opt_comma(A,B,C,D):-[~(',',A,B,C,D)]
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_$002C , a1, a2, a3, a4), cont);
    }

    private final static Operation opt_comma_4_2(Prolog m) { 
    // opt_comma(A,A,B,B):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // opt_comma(A,A,B,B):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: declarative/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(declarative/5,public)
        final static Functor FUNCTOR_decl_1 = F("decl",1);

    // private final Term arg5;




    public static Operation PRED_declarative_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // declarative(decl(A),B,C,D,E):-s(A,F,B,C,D,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // declarative(decl(A),B,C,D,E):-[s(A,F,B,C,D,E)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_decl_1 , m.trail, a6)){
                return m.fail();
            }
        return //
 Op("s", FILE_chat_parser::PRED_s_6_static_exec, VA(a6, m.DONT_CARE2(), a2, a3, a4, a5), cont);
    }
/** PREDICATE: wh_question/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(wh_question/5,public)
        final static Functor FUNCTOR_whq_2 = F("whq",2);

    // private final Term arg5;




    public static Operation PRED_wh_question_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // wh_question(whq(A,B),C,D,E,F):-variable_q(A,G,H,I,C,J,E,K),question(H,I,B,J,D,K,F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // wh_question(whq(A,B),C,D,E,F):-[variable_q(A,G,H,I,C,J,E,K),question(H,I,B,J,D,K,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_whq_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        return //
 Op("variable_q", FILE_chat_parser::PRED_variable_q_8_static_exec, VA(a6, m.DONT_CARE2(), a8, a9, a2, a10, a4, a11), //
 Op("question", FILE_chat_parser::PRED_question_7_static_exec, VA(a8, a9, a7, a10, a3, a11, a5), cont));
    }
/** PREDICATE: np/11
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(np/11,public)
        final static Functor FUNCTOR_np_7 = F("np",7);
        final static Functor FUNCTOR_np_3 = F("np",3);
        final static Functor ATOM_def = SYM("def");
        final static Functor FUNCTOR_$002B_2 = F("+",2);
        final static Functor FUNCTOR_part_2 = F("part",2);
        final static Functor ATOM_indef = SYM("indef");
        final static Functor ATOM_plu = SYM("plu");
    private static final Compound L_np_11_s13 = S( FUNCTOR_$002B_2 ,  int_3 ,  ATOM_plu );

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;




    public static Operation PRED_np_11_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::np_11_var, FILE_chat_parser::np_11_1, FILE_chat_parser::np_11_1, FILE_chat_parser::np_11_1, FILE_chat_parser::np_11_var, FILE_chat_parser::np_11_1); 
    }

    private final static Operation np_11_var(Prolog m) { 
        m.jtry(11, null, FILE_chat_parser::np_11_var_1);
        return np_11_1(m);
    }

    private final static Operation np_11_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::np_11_var_2);
        return np_11_2(m);
    }

    private final static Operation np_11_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::np_11_var_3);
        return np_11_3(m);
    }

    private final static Operation np_11_var_3(Prolog m) { 
        m.trust(null);
        return np_11_4(m);
    }

    private final static Operation np_11_1(Prolog m) { 
    // np(A,B,C,D,E,F,G,H,H,I,J):-virtual(np(A,B,C,D,E,F,G),I,J)
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
        cont = m.cont;
    // np(A,B,C,D,E,F,G,H,H,I,J):-[virtual(np(A,B,C,D,E,F,G),I,J)]
        if (! a8.unify(a9, m.trail))
            return m.fail();
    // put_str_args([a(1),a(2),a(3),a(4),a(5),a(6),a(7)],y(1)),put_str(@('FUNCTOR_np_7'),y(1),a(12))
        a12 =  S( FUNCTOR_np_7 , a1, a2, a3, a4, a5, a6, a7);
 ;
        return //
 Op("virtual", FILE_chat_parser::PRED_virtual_3_static_exec, VA(a12, a10, a11), cont);
    }

    private final static Operation np_11_2(Prolog m) { 
    // np(np(A,B,[]),A,C,def,D,E,F,G,H,I,J):-is_pp(E),pers_pron(B,A,K,G,H,I,J),empty(F),role(K,decl,C)
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
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        cont = m.cont;
    // np(np(A,B,[]),A,C,def,D,E,F,G,H,I,J):-[is_pp(E),pers_pron(B,A,K,G,H,I,J),empty(F),role(K,decl,C)]
        a1 = a1.dref();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_np_3 , m.trail, a12, a13,  Prolog.Nil )){
                return m.fail();
            }
        if (! a12.unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_def .unify(a4, m.trail))
            return m.fail();
        a14 = m.mkvar1();
        return //
 Op("is_pp", FILE_chat_parser::PRED_is_pp_1_static_exec, VA(a6), //
 Op("pers_pron", FILE_chat_parser::PRED_pers_pron_7_static_exec, VA(a13, a12, a14, a8, a9, a10, a11), //
 Op("empty", FILE_chat_parser::PRED_empty_1_static_exec, VA(a7), //
 Op("role", FILE_chat_parser::PRED_role_3_static_exec, VA(a14,  ATOM_decl , a3), cont))));
    }

    private final static Operation np_11_3(Prolog m) { 
    // np(np(A,B,C),A,D,E,F,G,H,I,J,K,L):-is_pp(G),np_head(B,A,E+M,N,C,I,O,K,P),np_all(Q),np_compls(M,A,F,N,Q,H,O,J,P,L)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
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
        a11 = m.AREGS[10];
        cont = m.cont;
    // np(np(A,B,C),A,D,E,F,G,H,I,J,K,L):-[is_pp(G),np_head(B,A,E+M,N,C,I,O,K,P),np_all(Q),np_compls(M,A,F,N,Q,H,O,J,P,L)]
        a1 = a1.dref();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            a14 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_np_3 , m.trail, a12, a13, a14)){
                return m.fail();
            }
        if (! a12.unify(a2, m.trail))
            return m.fail();
        a15 = m.mkvar1();
    // put_str_args([a(4),a(15)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(16))
        a16 =  S( FUNCTOR_$002B_2 , a4, a15);
 ;
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        return //
 Op("is_pp", FILE_chat_parser::PRED_is_pp_1_static_exec, VA(a6), //
 Op("np_head", FILE_chat_parser::PRED_np_head_9_static_exec, VA(a13, a12, a16, a17, a14, a8, a18, a10, a19), //
 Op("np_all", FILE_chat_parser::PRED_np_all_1_static_exec, VA(a20), //
 Op("np_compls", FILE_chat_parser::PRED_np_compls_10_static_exec, VA(a15, a12, a5, a17, a20, a7, a18, a9, a19, a11), cont))));
    }

    private final static Operation np_11_4(Prolog m) { 
    // np(part(A,B),3+C,D,indef,E,F,G,H,I,J,K):-is_pp(F),determiner(A,C,indef,H,L,J,M),~(of,L,N,M,O),s_all(P),prep_case(Q),np(B,3+plu,Q,def,E,P,G,N,I,O,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
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
    // np(part(A,B),3+C,D,indef,E,F,G,H,I,J,K):-[is_pp(F),determiner(A,C,indef,H,L,J,M),~(of,L,N,M,O),s_all(P),prep_case(Q),np(B,3+plu,Q,def,E,P,G,N,I,O,K)]
        a1 = a1.dref();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_part_2 , m.trail, a12, a13)){
                return m.fail();
            }
        a2 = a2.dref();
            a14 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002B_2 , m.trail,  int_3 , a14)){
                return m.fail();
            }
        if (!  ATOM_indef .unify(a4, m.trail))
            return m.fail();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        return //
 Op("is_pp", FILE_chat_parser::PRED_is_pp_1_static_exec, VA(a6), //
 Op("determiner", FILE_chat_parser::PRED_determiner_7_static_exec, VA(a12, a14,  ATOM_indef , a8, a15, a10, a16), //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_of , a15, a17, a16, a18), //
 Op("s_all", FILE_chat_parser::PRED_s_all_1_static_exec, VA(a19), //
 Op("prep_case", FILE_chat_parser::PRED_prep_case_1_static_exec, VA(a20), //
 Op("np", FILE_chat_parser::PRED_np_11_static_exec, VA(a13, L_np_11_s13, a20,  ATOM_def , a5, a19, a7, a17, a9, a18, a11), cont))))));
    }
/** PREDICATE: variable_q/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(variable_q/8,public)
        final static Functor FUNCTOR_adv_phrase_3 = F("adv_phrase",3);
        final static Functor FUNCTOR_np_head_3 = F("np_head",3);
        final static Functor FUNCTOR_int_det_1 = F("int_det",1);
        final static Functor FUNCTOR_predicate_3 = F("predicate",3);
        final static Functor ATOM_adj = SYM("adj");
        final static Functor FUNCTOR_value_2 = F("value",2);
        final static Functor FUNCTOR_wh_1 = F("wh",1);
        final static Functor ATOM_quant = SYM("quant");

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_variable_q_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry8(null, FILE_chat_parser::variable_q_8_sub_1);
        return variable_q_8_1(m);
    }

    private final static Operation variable_q_8_sub_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::variable_q_8_sub_2);
        return variable_q_8_2(m);
    }

    private final static Operation variable_q_8_sub_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::variable_q_8_sub_3);
        return variable_q_8_3(m);
    }

    private final static Operation variable_q_8_sub_3(Prolog m) { 
        m.trust(null);
        return variable_q_8_4(m);
    }

    private final static Operation variable_q_8_1(Prolog m) { 
    // variable_q(A,B,C,D,E,F,G,x(gap,nonterminal,np(H,B,D,I,J,K,L),M)):-whq(A,B,H,C,E,F,G,M),trace1(K,L)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
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
    // variable_q(A,B,C,D,E,F,G,x(gap,nonterminal,np(H,B,D,I,J,K,L),M)):-[whq(A,B,H,C,E,F,G,M),trace1(K,L)]
        a8 = a8.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_gap ,  ATOM_nonterminal , a9, a10)){
                return m.fail();
            }
        a9 = a9.dref();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_np_7 , m.trail, a11, a2, a4, m.DONT_CARE1(), m.DONT_CARE1(), a12, a13)){
                return m.fail();
            }
        return //
 Op("whq", FILE_chat_parser::PRED_whq_8_static_exec, VA(a1, a2, a11, a3, a5, a6, a7, a10), //
 Op("trace1", FILE_chat_parser::PRED_trace1_2_static_exec, VA(a12, a13), cont));
    }

    private final static Operation variable_q_8_2(Prolog m) { 
    // variable_q(A,B,compl,C,D,E,F,x(gap,nonterminal,pp(pp(G,H),compl,I,J),K)):-prep(G,D,L,F,M),whq(A,B,H,N,L,E,M,K),trace1(I,J),compl_case(C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
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
    // variable_q(A,B,compl,C,D,E,F,x(gap,nonterminal,pp(pp(G,H),compl,I,J),K)):-[prep(G,D,L,F,M),whq(A,B,H,N,L,E,M,K),trace1(I,J),compl_case(C)]
        if (!  ATOM_compl .unify(a3, m.trail))
            return m.fail();
        a8 = a8.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_gap ,  ATOM_nonterminal , a9, a10)){
                return m.fail();
            }
        a9 = a9.dref();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_pp_4 , m.trail, a11,  ATOM_compl , a12, a13)){
                return m.fail();
            }
        a11 = a11.dref();
            a14 = m.mkvar2();
            a15 = m.mkvar2();
            if (!a11.unifyS( FUNCTOR_pp_2 , m.trail, a14, a15)){
                return m.fail();
            }
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        return //
 Op("prep", FILE_chat_parser::PRED_prep_5_static_exec, VA(a14, a5, a16, a7, a17), //
 Op("whq", FILE_chat_parser::PRED_whq_8_static_exec, VA(a1, a2, a15, m.DONT_CARE2(), a16, a6, a17, a10), //
 Op("trace1", FILE_chat_parser::PRED_trace1_2_static_exec, VA(a12, a13), //
 Op("compl_case", FILE_chat_parser::PRED_compl_case_1_static_exec, VA(a4), cont))));
    }

    private final static Operation variable_q_8_3(Prolog m) { 
    // variable_q(A,B,compl,C,D,E,F,x(gap,nonterminal,adv_phrase(pp(G,np(B,np_head(int_det(A),[],H),[])),I,J),K)):-context_pron(G,H,D,E,F,K),trace1(I,J),verb_case(C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18;
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
    // variable_q(A,B,compl,C,D,E,F,x(gap,nonterminal,adv_phrase(pp(G,np(B,np_head(int_det(A),[],H),[])),I,J),K)):-[context_pron(G,H,D,E,F,K),trace1(I,J),verb_case(C)]
        if (!  ATOM_compl .unify(a3, m.trail))
            return m.fail();
        a8 = a8.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_gap ,  ATOM_nonterminal , a9, a10)){
                return m.fail();
            }
        a9 = a9.dref();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_adv_phrase_3 , m.trail, a11, a12, a13)){
                return m.fail();
            }
        a11 = a11.dref();
            a14 = m.mkvar2();
            a15 = m.mkvar2();
            if (!a11.unifyS( FUNCTOR_pp_2 , m.trail, a14, a15)){
                return m.fail();
            }
        a15 = a15.dref();
            a16 = m.mkvar2();
            if (!a15.unifyS( FUNCTOR_np_3 , m.trail, a2, a16,  Prolog.Nil )){
                return m.fail();
            }
        a16 = a16.dref();
            a17 = m.mkvar2();
            a18 = m.mkvar2();
            if (!a16.unifyS( FUNCTOR_np_head_3 , m.trail, a17,  Prolog.Nil , a18)){
                return m.fail();
            }
        a17 = a17.dref();
            if (!a17.unifyS( FUNCTOR_int_det_1 , m.trail, a1)){
                return m.fail();
            }
        return //
 Op("context_pron", FILE_chat_parser::PRED_context_pron_6_static_exec, VA(a14, a18, a5, a6, a7, a10), //
 Op("trace1", FILE_chat_parser::PRED_trace1_2_static_exec, VA(a12, a13), //
 Op("verb_case", FILE_chat_parser::PRED_verb_case_1_static_exec, VA(a4), cont)));
    }

    private final static Operation variable_q_8_4(Prolog m) { 
    // variable_q(A,B,compl,C,D,E,F,x(gap,nonterminal,predicate(adj,value(G,wh(A)),H),I)):- ~(how,D,J,F,K),adj(quant,G,J,E,K,I),empty(H),verb_case(C)
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
    // variable_q(A,B,compl,C,D,E,F,x(gap,nonterminal,predicate(adj,value(G,wh(A)),H),I)):-[~(how,D,J,F,K),adj(quant,G,J,E,K,I),empty(H),verb_case(C)]
        if (!  ATOM_compl .unify(a3, m.trail))
            return m.fail();
        a8 = a8.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_gap ,  ATOM_nonterminal , a9, a10)){
                return m.fail();
            }
        a9 = a9.dref();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_predicate_3 , m.trail,  ATOM_adj , a11, a12)){
                return m.fail();
            }
        a11 = a11.dref();
            a13 = m.mkvar2();
            a14 = m.mkvar2();
            if (!a11.unifyS( FUNCTOR_value_2 , m.trail, a13, a14)){
                return m.fail();
            }
        a14 = a14.dref();
            if (!a14.unifyS( FUNCTOR_wh_1 , m.trail, a1)){
                return m.fail();
            }
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_how , a5, a15, a7, a16), //
 Op("adj", FILE_chat_parser::PRED_adj_6_static_exec, VA( ATOM_quant , a13, a15, a6, a16, a10), //
 Op("empty", FILE_chat_parser::PRED_empty_1_static_exec, VA(a12), //
 Op("verb_case", FILE_chat_parser::PRED_verb_case_1_static_exec, VA(a4), cont))));
    }
/** PREDICATE: adv_phrase/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(adv_phrase/7,public)
        final static Functor FUNCTOR_prep_1 = F("prep",1);
    private static final Compound L_adv_phrase_7_s6 = S( FUNCTOR_prep_1 ,  ATOM_of );

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_adv_phrase_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::adv_phrase_7_var, FILE_chat_parser::adv_phrase_7_1, FILE_chat_parser::adv_phrase_7_1, FILE_chat_parser::adv_phrase_7_1, FILE_chat_parser::adv_phrase_7_var, FILE_chat_parser::adv_phrase_7_1); 
    }

    private final static Operation adv_phrase_7_var(Prolog m) { 
        m.jtry7(null, FILE_chat_parser::adv_phrase_7_var_1);
        return adv_phrase_7_1(m);
    }

    private final static Operation adv_phrase_7_var_1(Prolog m) { 
        m.trust(null);
        return adv_phrase_7_2(m);
    }

    private final static Operation adv_phrase_7_1(Prolog m) { 
    // adv_phrase(A,B,C,D,D,E,F):-virtual(adv_phrase(A,B,C),E,F)
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
    // adv_phrase(A,B,C,D,D,E,F):-[virtual(adv_phrase(A,B,C),E,F)]
        if (! a4.unify(a5, m.trail))
            return m.fail();
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_adv_phrase_3'),y(1),a(8))
        a8 =  S( FUNCTOR_adv_phrase_3 , a1, a2, a3);
 ;
        return //
 Op("virtual", FILE_chat_parser::PRED_virtual_3_static_exec, VA(a8, a6, a7), cont);
    }

    private final static Operation adv_phrase_7_2(Prolog m) { 
    // adv_phrase(pp(A,B),C,D,E,F,G,H):-loc_pred(A,E,I,G,J),pp(pp(prep(of),B),compl,C,D,I,F,J,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
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
    // adv_phrase(pp(A,B),C,D,E,F,G,H):-[loc_pred(A,E,I,G,J),pp(pp(prep(of),B),compl,C,D,I,F,J,H)]
        a1 = a1.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_pp_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        a11 = m.mkvar1();
    // put_str_args([s(6),a(9)],y(1)),put_str(@('FUNCTOR_pp_2'),y(1),a(12))
        a12 =  S( FUNCTOR_pp_2 , L_adv_phrase_7_s6, a9);
 ;
        return //
 Op("loc_pred", FILE_chat_parser::PRED_loc_pred_5_static_exec, VA(a8, a4, a10, a6, a11), //
 Op("pp", FILE_chat_parser::PRED_pp_8_static_exec, VA(a12,  ATOM_compl , a2, a3, a10, a5, a11, a7), cont));
    }
/** PREDICATE: predicate/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(predicate/7,public)
        final static Functor ATOM_neg = SYM("neg");

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_predicate_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::predicate_7_var, FILE_chat_parser::predicate_7_int, FILE_chat_parser::predicate_7_int, FILE_chat_parser::predicate_7_var, FILE_chat_parser::predicate_7_int, FILE_chat_parser::predicate_7_int); 
    }

    private final static Operation predicate_7_var(Prolog m) { 
        m.jtry7(null, FILE_chat_parser::predicate_7_var_1);
        return predicate_7_1(m);
    }

    private final static Operation predicate_7_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::predicate_7_var_2);
        return predicate_7_2(m);
    }

    private final static Operation predicate_7_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::predicate_7_var_3);
        return predicate_7_3(m);
    }

    private final static Operation predicate_7_var_3(Prolog m) { 
        m.trust(null);
        return predicate_7_4(m);
    }

    private final static Operation predicate_7_int(Prolog m) { 
        m.jtry7(null, FILE_chat_parser::predicate_7_int_1);
        return predicate_7_1(m);
    }

    private final static Operation predicate_7_int_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::predicate_7_int_2);
        return predicate_7_2(m);
    }

    private final static Operation predicate_7_int_2(Prolog m) { 
        m.trust(null);
        return predicate_7_4(m);
    }

    private final static Operation predicate_7_1(Prolog m) { 
    // predicate(A,B,C,D,D,E,F):-virtual(predicate(A,B,C),E,F)
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
    // predicate(A,B,C,D,D,E,F):-[virtual(predicate(A,B,C),E,F)]
        if (! a4.unify(a5, m.trail))
            return m.fail();
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_predicate_3'),y(1),a(8))
        a8 =  S( FUNCTOR_predicate_3 , a1, a2, a3);
 ;
        return //
 Op("virtual", FILE_chat_parser::PRED_virtual_3_static_exec, VA(a8, a6, a7), cont);
    }

    private final static Operation predicate_7_2(Prolog m) { 
    // predicate(A,B,C,D,E,F,G):-adj_phrase(B,C,D,E,F,G)
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
    // predicate(A,B,C,D,E,F,G):-[adj_phrase(B,C,D,E,F,G)]
        return //
 Op("adj_phrase", FILE_chat_parser::PRED_adj_phrase_6_static_exec, VA(a2, a3, a4, a5, a6, a7), cont);
    }

    private final static Operation predicate_7_3(Prolog m) { 
    // predicate(neg,A,B,C,D,E,F):-s_all(G),pp(A,compl,G,B,C,D,E,F)
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
        cont = m.cont;
    // predicate(neg,A,B,C,D,E,F):-[s_all(G),pp(A,compl,G,B,C,D,E,F)]
        if (!  ATOM_neg .unify(a1, m.trail))
            return m.fail();
        a8 = m.mkvar1();
        return //
 Op("s_all", FILE_chat_parser::PRED_s_all_1_static_exec, VA(a8), //
 Op("pp", FILE_chat_parser::PRED_pp_8_static_exec, VA(a2,  ATOM_compl , a8, a3, a4, a5, a6, a7), cont));
    }

    private final static Operation predicate_7_4(Prolog m) { 
    // predicate(A,B,C,D,E,F,G):-s_all(H),adv_phrase(B,H,C,D,E,F,G)
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
        cont = m.cont;
    // predicate(A,B,C,D,E,F,G):-[s_all(H),adv_phrase(B,H,C,D,E,F,G)]
        a8 = m.mkvar1();
        return //
 Op("s_all", FILE_chat_parser::PRED_s_all_1_static_exec, VA(a8), //
 Op("adv_phrase", FILE_chat_parser::PRED_adv_phrase_7_static_exec, VA(a2, a8, a3, a4, a5, a6, a7), cont));
    }
/** PREDICATE: whq/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(whq/8,public)

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_whq_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry8(null, FILE_chat_parser::whq_8_sub_1);
        return whq_8_1(m);
    }

    private final static Operation whq_8_sub_1(Prolog m) { 
        m.trust(null);
        return whq_8_2(m);
    }

    private final static Operation whq_8_1(Prolog m) { 
    // whq(A,B,C,undef,D,E,F,G):-int_det(A,B,D,H,F,I),s_all(J),np(C,B,K,L,subj,J,M,H,E,I,G)
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
    // whq(A,B,C,undef,D,E,F,G):-[int_det(A,B,D,H,F,I),s_all(J),np(C,B,K,L,subj,J,M,H,E,I,G)]
        if (!  ATOM_undef .unify(a4, m.trail))
            return m.fail();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        return //
 Op("int_det", FILE_chat_parser::PRED_int_det_6_static_exec, VA(a1, a2, a5, a9, a7, a10), //
 Op("s_all", FILE_chat_parser::PRED_s_all_1_static_exec, VA(a11), //
 Op("np", FILE_chat_parser::PRED_np_11_static_exec, VA(a3, a2, m.DONT_CARE2(), m.DONT_CARE2(),  ATOM_subj , a11, m.DONT_CARE2(), a9, a6, a10, a8), cont)));
    }

    private final static Operation whq_8_2(Prolog m) { 
    // whq(A,3+B,np(3+B,wh(A),[]),C,D,E,F,G):-int_pron(C,D,E,F,G)
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
    // whq(A,3+B,np(3+B,wh(A),[]),C,D,E,F,G):-[int_pron(C,D,E,F,G)]
        a2 = a2.dref();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002B_2 , m.trail,  int_3 , a9)){
                return m.fail();
            }
        a3 = a3.dref();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_np_3 , m.trail, a10, a11,  Prolog.Nil )){
                return m.fail();
            }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_$002B_2 , m.trail,  int_3 , a9)){
                return m.fail();
            }
        a11 = a11.dref();
            if (!a11.unifyS( FUNCTOR_wh_1 , m.trail, a1)){
                return m.fail();
            }
        return //
 Op("int_pron", FILE_chat_parser::PRED_int_pron_5_static_exec, VA(a4, a5, a6, a7, a8), cont);
    }
/** PREDICATE: int_det/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(int_det/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_int_det_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_chat_parser::int_det_6_sub_1);
        return int_det_6_1(m);
    }

    private final static Operation int_det_6_sub_1(Prolog m) { 
        m.trust(null);
        return int_det_6_2(m);
    }

    private final static Operation int_det_6_1(Prolog m) { 
    // int_det(A,3+B,C,D,E,F):-whose(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // int_det(A,3+B,C,D,E,F):-[whose(A,B,C,D,E,F)]
        a2 = a2.dref();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002B_2 , m.trail,  int_3 , a7)){
                return m.fail();
            }
        return //
 Op("whose", FILE_chat_parser::PRED_whose_6_static_exec, VA(a1, a7, a3, a4, a5, a6), cont);
    }

    private final static Operation int_det_6_2(Prolog m) { 
    // int_det(A,3+B,C,D,E,F):-int_art(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // int_det(A,3+B,C,D,E,F):-[int_art(A,B,C,D,E,F)]
        a2 = a2.dref();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002B_2 , m.trail,  int_3 , a7)){
                return m.fail();
            }
        return //
 Op("int_art", FILE_chat_parser::PRED_int_art_6_static_exec, VA(a1, a7, a3, a4, a5, a6), cont);
    }
/** PREDICATE: gen_marker/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(gen_marker/4,public)
        final static Functor ATOM_gen_marker = SYM("gen_marker");




    public static Operation PRED_gen_marker_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_chat_parser::gen_marker_4_sub_1);
        return gen_marker_4_1(m);
    }

    private final static Operation gen_marker_4_sub_1(Prolog m) { 
        m.trust(null);
        return gen_marker_4_2(m);
    }

    private final static Operation gen_marker_4_1(Prolog m) { 
    // gen_marker(A,A,B,C):-virtual(gen_marker,B,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // gen_marker(A,A,B,C):-[virtual(gen_marker,B,C)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        return //
 Op("virtual", FILE_chat_parser::PRED_virtual_3_static_exec, VA( ATOM_gen_marker , a3, a4), cont);
    }

    private final static Operation gen_marker_4_2(Prolog m) { 
    // gen_marker(A,B,C,D):- ~(~,A,E,C,F),an_s(E,B,F,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // gen_marker(A,B,C,D):-[~(~,A,E,C,F),an_s(E,B,F,D)]
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_$007E , a1, a5, a3, a6), //
 Op("an_s", FILE_chat_parser::PRED_an_s_4_static_exec, VA(a5, a2, a6, a4), cont));
    }
/** PREDICATE: whose/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(whose/6,public)
        final static Functor ATOM_nogap = SYM("nogap");
        final static Functor FUNCTOR_np_head0_3 = F("np_head0",3);
        final static Functor ATOM_proper = SYM("proper");
        final static Functor ATOM_whose = SYM("whose");

    // private final Term arg5, arg6;




    public static Operation PRED_whose_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // whose(A,B,C,D,E,x(nogap,nonterminal,np_head0(wh(A),B,proper),x(nogap,nonterminal,gen_marker,F))):- ~(whose,C,D,E,F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // whose(A,B,C,D,E,x(nogap,nonterminal,np_head0(wh(A),B,proper),x(nogap,nonterminal,gen_marker,F))):-[~(whose,C,D,E,F)]
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal , a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_np_head0_3 , m.trail, a9, a2,  ATOM_proper )){
                return m.fail();
            }
        a9 = a9.dref();
            if (!a9.unifyS( FUNCTOR_wh_1 , m.trail, a1)){
                return m.fail();
            }
        a8 = a8.dref();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal ,  ATOM_gen_marker , a10)){
                return m.fail();
            }
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_whose , a3, a4, a5, a10), cont);
    }
/** PREDICATE: question/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(question/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_question_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_chat_parser::question_7_sub_1);
        return question_7_1(m);
    }

    private final static Operation question_7_sub_1(Prolog m) { 
        m.trust(null);
        return question_7_2(m);
    }

    private final static Operation question_7_1(Prolog m) { 
    // question(A,B,C,D,E,F,G):-subj_question(A),role(subj,H,B),s(C,I,D,E,F,G)
         Term a1, a2, a3, a4, a5, a6, a7;
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
    // question(A,B,C,D,E,F,G):-[subj_question(A),role(subj,H,B),s(C,I,D,E,F,G)]
        return //
 Op("subj_question", FILE_chat_parser::PRED_subj_question_1_static_exec, VA(a1), //
 Op("role", FILE_chat_parser::PRED_role_3_static_exec, VA( ATOM_subj , m.DONT_CARE2(), a2), //
 Op("s", FILE_chat_parser::PRED_s_6_static_exec, VA(a3, m.DONT_CARE2(), a4, a5, a6, a7), cont)));
    }

    private final static Operation question_7_2(Prolog m) { 
    // question(A,B,C,D,E,F,G):-fronted_verb(A,B,D,H,F,I),s(C,J,H,E,I,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // question(A,B,C,D,E,F,G):-[fronted_verb(A,B,D,H,F,I),s(C,J,H,E,I,G)]
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op("fronted_verb", FILE_chat_parser::PRED_fronted_verb_6_static_exec, VA(a1, a2, a4, a8, a6, a9), //
 Op("s", FILE_chat_parser::PRED_s_6_static_exec, VA(a3, m.DONT_CARE2(), a8, a5, a9, a7), cont));
    }
/** PREDICATE: det/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(det/7,public)
        final static Functor FUNCTOR_det_3 = F("det",3);
        final static Functor FUNCTOR_det_1 = F("det",1);
        final static Functor ATOM_generic = SYM("generic");

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_det_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::det_7_var, FILE_chat_parser::det_7_1, FILE_chat_parser::det_7_1, FILE_chat_parser::det_7_con, FILE_chat_parser::det_7_str, FILE_chat_parser::det_7_1); 
    }

    private final static Operation det_7_var(Prolog m) { 
        m.jtry7(null, FILE_chat_parser::det_7_var_1);
        return det_7_1(m);
    }

    private final static Operation det_7_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::det_7_var_2);
        return det_7_2(m);
    }

    private final static Operation det_7_var_2(Prolog m) { 
        m.trust(null);
        return det_7_3(m);
    }

    private final static Operation det_7_con(Prolog m) { 
        m.jtry7(null, FILE_chat_parser::det_7_con_1);
        return det_7_1(m);
    }

    private final static Operation det_7_con_1(Prolog m) { 
        m.trust(null);
        return det_7_3(m);
    }

    private final static Operation det_7_str(Prolog m) { 
        m.jtry7(null, FILE_chat_parser::det_7_str_1);
        return det_7_1(m);
    }

    private final static Operation det_7_str_1(Prolog m) { 
        m.trust(null);
        return det_7_2(m);
    }

    private final static Operation det_7_1(Prolog m) { 
    // det(A,B,C,D,D,E,F):-virtual(det(A,B,C),E,F)
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
    // det(A,B,C,D,D,E,F):-[virtual(det(A,B,C),E,F)]
        if (! a4.unify(a5, m.trail))
            return m.fail();
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_det_3'),y(1),a(8))
        a8 =  S( FUNCTOR_det_3 , a1, a2, a3);
 ;
        return //
 Op("virtual", FILE_chat_parser::PRED_virtual_3_static_exec, VA(a8, a6, a7), cont);
    }

    private final static Operation det_7_2(Prolog m) { 
    // det(det(A),B,C,D,E,F,G):-terminal(H,D,E,F,G),det(H,B,A,C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // det(det(A),B,C,D,E,F,G):-[terminal(H,D,E,F,G),det(H,B,A,C)]
        a1 = a1.dref();
            a8 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_det_1 , m.trail, a8)){
                return m.fail();
            }
        a9 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a9, a4, a5, a6, a7), //
 Op("det", FILE_chat_parser::PRED_det_4_static_exec, VA(a9, a2, a8, a3), cont));
    }

    private final static Operation det_7_3(Prolog m) { 
    // det(generic,A,generic,B,B,C,C):-true
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
    // det(generic,A,generic,B,B,C,C):-[]
        if (!  ATOM_generic .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_generic .unify(a3, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        if (! a6.unify(a7, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: int_art/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(int_art/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_int_art_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // int_art(A,B,C,D,E,x(nogap,nonterminal,det(F,B,def),G)):-int_art(A,B,F,C,D,E,G)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // int_art(A,B,C,D,E,x(nogap,nonterminal,det(F,B,def),G)):-[int_art(A,B,F,C,D,E,G)]
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal , a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_det_3 , m.trail, a9, a2,  ATOM_def )){
                return m.fail();
            }
        return //
 Op("int_art", FILE_chat_parser::PRED_int_art_7_static_exec, VA(a1, a2, a9, a3, a4, a5, a8), cont);
    }
/** PREDICATE: subj_question/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(subj_question/1,public)




    public static Operation PRED_subj_question_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::subj_question_1_var, fail_0, fail_0, FILE_chat_parser::subj_question_1_var, fail_0, fail_0); 
    }

    private final static Operation subj_question_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::subj_question_1_var_1);
        return subj_question_1_1(m);
    }

    private final static Operation subj_question_1_var_1(Prolog m) { 
        m.trust(null);
        return subj_question_1_2(m);
    }

    private final static Operation subj_question_1_1(Prolog m) { 
    // subj_question(subj):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // subj_question(subj):-[]
        if (!  ATOM_subj .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation subj_question_1_2(Prolog m) { 
    // subj_question(undef):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // subj_question(undef):-[]
        if (!  ATOM_undef .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: yn_question/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(yn_question/5,public)
        final static Functor FUNCTOR_q_1 = F("q",1);

    // private final Term arg5;




    public static Operation PRED_yn_question_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // yn_question(q(A),B,C,D,E):-fronted_verb(nil,F,B,G,D,H),s(A,I,G,C,H,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // yn_question(q(A),B,C,D,E):-[fronted_verb(nil,F,B,G,D,H),s(A,I,G,C,H,E)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_q_1 , m.trail, a6)){
                return m.fail();
            }
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        return //
 Op("fronted_verb", FILE_chat_parser::PRED_fronted_verb_6_static_exec, VA( ATOM_nil , m.DONT_CARE2(), a2, a7, a4, a8), //
 Op("s", FILE_chat_parser::PRED_s_6_static_exec, VA(a6, m.DONT_CARE2(), a7, a3, a8, a5), cont));
    }
/** PREDICATE: verb_form/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(verb_form/8,public)
        final static Functor FUNCTOR_verb_form_4 = F("verb_form",4);

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_verb_form_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry8(null, FILE_chat_parser::verb_form_8_sub_1);
        return verb_form_8_1(m);
    }

    private final static Operation verb_form_8_sub_1(Prolog m) { 
        m.trust(null);
        return verb_form_8_2(m);
    }

    private final static Operation verb_form_8_1(Prolog m) { 
    // verb_form(A,B,C,D,E,E,F,G):-virtual(verb_form(A,B,C,D),F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // verb_form(A,B,C,D,E,E,F,G):-[virtual(verb_form(A,B,C,D),F,G)]
        if (! a5.unify(a6, m.trail))
            return m.fail();
    // put_str_args([a(1),a(2),a(3),a(4)],y(1)),put_str(@('FUNCTOR_verb_form_4'),y(1),a(9))
        a9 =  S( FUNCTOR_verb_form_4 , a1, a2, a3, a4);
 ;
        return //
 Op("virtual", FILE_chat_parser::PRED_virtual_3_static_exec, VA(a9, a7, a8), cont);
    }

    private final static Operation verb_form_8_2(Prolog m) { 
    // verb_form(A,B,C,D,E,F,G,H):-terminal(I,E,F,G,H),verb_form(I,A,B,C)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // verb_form(A,B,C,D,E,F,G,H):-[terminal(I,E,F,G,H),verb_form(I,A,B,C)]
        a9 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a9, a5, a6, a7, a8), //
 Op("verb_form", FILE_chat_parser::PRED_verb_form_4_static_exec, VA(a9, a1, a2, a3), cont));
    }
/** PREDICATE: neg/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(neg/6,public)
        final static Functor FUNCTOR_neg_2 = F("neg",2);
        final static Functor ATOM_pos = SYM("pos");

    // private final Term arg5, arg6;




    public static Operation PRED_neg_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::neg_6_var, FILE_chat_parser::neg_6_int, FILE_chat_parser::neg_6_int, FILE_chat_parser::neg_6_int, FILE_chat_parser::neg_6_var, FILE_chat_parser::neg_6_int); 
    }

    private final static Operation neg_6_var(Prolog m) { 
        m.jtry6(null, FILE_chat_parser::neg_6_var_1);
        return neg_6_1(m);
    }

    private final static Operation neg_6_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::neg_6_var_2);
        return neg_6_2(m);
    }

    private final static Operation neg_6_var_2(Prolog m) { 
        m.trust(null);
        return neg_6_3(m);
    }

    private final static Operation neg_6_int(Prolog m) { 
        m.jtry6(null, FILE_chat_parser::neg_6_int_1);
        return neg_6_1(m);
    }

    private final static Operation neg_6_int_1(Prolog m) { 
        m.trust(null);
        return neg_6_3(m);
    }

    private final static Operation neg_6_1(Prolog m) { 
    // neg(A,B,C,C,D,E):-virtual(neg(A,B),D,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // neg(A,B,C,C,D,E):-[virtual(neg(A,B),D,E)]
        if (! a3.unify(a4, m.trail))
            return m.fail();
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_neg_2'),y(1),a(7))
        a7 =  S( FUNCTOR_neg_2 , a1, a2);
 ;
        return //
 Op("virtual", FILE_chat_parser::PRED_virtual_3_static_exec, VA(a7, a5, a6), cont);
    }

    private final static Operation neg_6_2(Prolog m) { 
    // neg(aux+A,neg,B,C,D,E):- ~(not,B,C,D,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // neg(aux+A,neg,B,C,D,E):-[~(not,B,C,D,E)]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$002B_2 , m.trail,  ATOM_aux , m.DONT_CARE1())){
                return m.fail();
            }
        if (!  ATOM_neg .unify(a2, m.trail))
            return m.fail();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_not , a3, a4, a5, a6), cont);
    }

    private final static Operation neg_6_3(Prolog m) { 
    // neg(A,pos,B,B,C,C):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // neg(A,pos,B,B,C,C):-[]
        if (!  ATOM_pos .unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        if (! a5.unify(a6, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: fronted_verb/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(fronted_verb/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_fronted_verb_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // fronted_verb(A,B,C,D,E,x(gap,nonterminal,verb_form(F,G,H,I),x(nogap,nonterminal,neg(J,K),L))):-verb_form(F,G,H,M,C,N,E,O),verb_type(F,aux+P),role(A,I,B),neg(Q,K,N,D,O,L)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // fronted_verb(A,B,C,D,E,x(gap,nonterminal,verb_form(F,G,H,I),x(nogap,nonterminal,neg(J,K),L))):-[verb_form(F,G,H,M,C,N,E,O),verb_type(F,aux+P),role(A,I,B),neg(Q,K,N,D,O,L)]
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_gap ,  ATOM_nonterminal , a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_verb_form_4 , m.trail, a9, a10, a11, a12)){
                return m.fail();
            }
        a8 = a8.dref();
            a13 = m.mkvar2();
            a14 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal , a13, a14)){
                return m.fail();
            }
        a13 = a13.dref();
            a15 = m.mkvar2();
            if (!a13.unifyS( FUNCTOR_neg_2 , m.trail, m.DONT_CARE1(), a15)){
                return m.fail();
            }
        a16 = m.mkvar1();
        a17 = m.mkvar1();
    // put_str_args([@('ATOM_aux'),void],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(18))
        a18 =  S( FUNCTOR_$002B_2 ,  ATOM_aux , m.mkvar3());
 ;
        return //
 Op("verb_form", FILE_chat_parser::PRED_verb_form_8_static_exec, VA(a9, a10, a11, m.DONT_CARE2(), a3, a16, a5, a17), //
 Op("verb_type", FILE_chat_parser::PRED_verb_type_2_static_exec, VA(a9, a18), //
 Op("role", FILE_chat_parser::PRED_role_3_static_exec, VA(a1, a12, a2), //
 Op("neg", FILE_chat_parser::PRED_neg_6_static_exec, VA(m.DONT_CARE2(), a15, a16, a4, a17, a14), cont))));
    }
/** PREDICATE: imperative/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(imperative/5,public)
        final static Functor FUNCTOR_imp_1 = F("imp",1);

    // private final Term arg5;




    public static Operation PRED_imperative_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // imperative(imp(A),B,C,D,E):-imperative_verb(B,F,D,G),s(A,H,F,C,G,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // imperative(imp(A),B,C,D,E):-[imperative_verb(B,F,D,G),s(A,H,F,C,G,E)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_imp_1 , m.trail, a6)){
                return m.fail();
            }
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        return //
 Op("imperative_verb", FILE_chat_parser::PRED_imperative_verb_4_static_exec, VA(a2, a7, a4, a8), //
 Op("s", FILE_chat_parser::PRED_s_6_static_exec, VA(a6, m.DONT_CARE2(), a7, a3, a8, a5), cont));
    }
/** PREDICATE: imperative_verb/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(imperative_verb/4,public)
        final static Functor ATOM_you = SYM("you");
        final static Functor ATOM_imp = SYM("imp");
        final static Functor ATOM_fin = SYM("fin");
    private static final Compound L_imperative_verb_4_s11 = S( FUNCTOR_$002B_2 ,  ATOM_imp ,  ATOM_fin );
        final static Functor ATOM_sin = SYM("sin");
    private static final Compound L_imperative_verb_4_s15 = S( FUNCTOR_$002B_2 ,  int_2 ,  ATOM_sin );
        final static Functor ATOM_inf = SYM("inf");




    public static Operation PRED_imperative_verb_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // imperative_verb(A,B,C,x(nogap,terminal,you,x(nogap,nonterminal,verb_form(D,imp+fin,2+sin,main),E))):-verb_form(D,inf,F,G,A,B,C,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // imperative_verb(A,B,C,x(nogap,terminal,you,x(nogap,nonterminal,verb_form(D,imp+fin,2+sin,main),E))):-[verb_form(D,inf,F,G,A,B,C,E)]
        a4 = a4.dref();
            a5 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_terminal ,  ATOM_you , a5)){
                return m.fail();
            }
        a5 = a5.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a5.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal , a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_verb_form_4 , m.trail, a8, L_imperative_verb_4_s11, L_imperative_verb_4_s15,  ATOM_main )){
                return m.fail();
            }
        return //
 Op("verb_form", FILE_chat_parser::PRED_verb_form_8_static_exec, VA(a8,  ATOM_inf , m.DONT_CARE2(), m.DONT_CARE2(), a1, a2, a3, a7), cont);
    }
/** PREDICATE: s/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(s/6,public)
        final static Functor FUNCTOR_s_4 = F("s",4);

    // private final Term arg5, arg6;




    public static Operation PRED_s_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // s(s(A,B,C,D),E,F,G,H,I):-subj(A,J,K,F,L,H,M),verb(B,J,K,N,L,O,M,P),empty(Q),s_all(R),verb_args(K,N,C,Q,S,O,T,P,U),minus(R,S,V),myplus(R,S,W),verb_mods(D,V,W,E,T,G,U,I)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24;
        Operation p1, p2, p3, p4, p5, p6, p7;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // s(s(A,B,C,D),E,F,G,H,I):-[subj(A,J,K,F,L,H,M),verb(B,J,K,N,L,O,M,P),empty(Q),s_all(R),verb_args(K,N,C,Q,S,O,T,P,U),minus(R,S,V),myplus(R,S,W),verb_mods(D,V,W,E,T,G,U,I)]
        a1 = a1.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_s_4 , m.trail, a7, a8, a9, a10)){
                return m.fail();
            }
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        a21 = m.mkvar1();
        a22 = m.mkvar1();
        a23 = m.mkvar1();
        a24 = m.mkvar1();
        return //
 Op("subj", FILE_chat_parser::PRED_subj_7_static_exec, VA(a7, a11, a12, a3, a13, a5, a14), //
 Op("verb", FILE_chat_parser::PRED_verb_8_static_exec, VA(a8, a11, a12, a15, a13, a16, a14, a17), //
 Op("empty", FILE_chat_parser::PRED_empty_1_static_exec, VA(a18), //
 Op("s_all", FILE_chat_parser::PRED_s_all_1_static_exec, VA(a19), //
 Op("verb_args", FILE_chat_parser::PRED_verb_args_9_static_exec, VA(a12, a15, a9, a18, a20, a16, a21, a17, a22), //
 Op("minus", FILE_chat_parser::PRED_minus_3_static_exec, VA(a19, a20, a23), //
 Op("myplus", FILE_chat_parser::PRED_myplus_3_static_exec, VA(a19, a20, a24), //
 Op("verb_mods", FILE_chat_parser::PRED_verb_mods_8_static_exec, VA(a10, a23, a24, a2, a21, a4, a22, a6), cont))))))));
    }
/** PREDICATE: subj/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(subj/7,public)
        final static Functor ATOM_be = SYM("be");

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_subj_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::subj_7_var, FILE_chat_parser::subj_7_2, FILE_chat_parser::subj_7_2, FILE_chat_parser::subj_7_var, FILE_chat_parser::subj_7_2, FILE_chat_parser::subj_7_2); 
    }

    private final static Operation subj_7_var(Prolog m) { 
        m.jtry7(null, FILE_chat_parser::subj_7_var_1);
        return subj_7_1(m);
    }

    private final static Operation subj_7_var_1(Prolog m) { 
        m.trust(null);
        return subj_7_2(m);
    }

    private final static Operation subj_7_1(Prolog m) { 
    // subj(there,A,B+be,C,D,E,F):- ~(there,C,D,E,F)
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
    // subj(there,A,B+be,C,D,E,F):-[~(there,C,D,E,F)]
        if (!  ATOM_there .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_$002B_2 , m.trail, m.DONT_CARE1(),  ATOM_be )){
                return m.fail();
            }
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_there , a4, a5, a6, a7), cont);
    }

    private final static Operation subj_7_2(Prolog m) { 
    // subj(A,B,C,D,E,F,G):-s_all(H),subj_case(I),np(A,B,I,J,subj,H,K,D,E,F,G)
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
    // subj(A,B,C,D,E,F,G):-[s_all(H),subj_case(I),np(A,B,I,J,subj,H,K,D,E,F,G)]
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op("s_all", FILE_chat_parser::PRED_s_all_1_static_exec, VA(a8), //
 Op("subj_case", FILE_chat_parser::PRED_subj_case_1_static_exec, VA(a9), //
 Op("np", FILE_chat_parser::PRED_np_11_static_exec, VA(a1, a2, a9, m.DONT_CARE2(),  ATOM_subj , a8, m.DONT_CARE2(), a4, a5, a6, a7), cont)));
    }
/** PREDICATE: np_head/9
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(np_head/9,public)

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_np_head_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // np_head(A,B,C,D,E,F,G,H,I):-np_head0(J,K,L,F,M,H,N),possessive(J,K,L,O,O,A,B,C,D,E,M,G,N,I)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
        a8 = LARG[7];
        a9 = LARG[8];
    // np_head(A,B,C,D,E,F,G,H,I):-[np_head0(J,K,L,F,M,H,N),possessive(J,K,L,O,O,A,B,C,D,E,M,G,N,I)]
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        return //
 Op("np_head0", FILE_chat_parser::PRED_np_head0_7_static_exec, VA(a10, a11, a12, a6, a13, a8, a14), //
 Op("possessive", FILE_chat_parser::PRED_possessive_14_static_exec, VA(a10, a11, a12, a15, a15, a1, a2, a3, a4, a5, a13, a7, a14, a9), cont));
    }
/** PREDICATE: np_head0/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(np_head0/7,public)
        final static Functor FUNCTOR_name_1 = F("name",1);
    private static final Compound L_np_head0_7_s7 = S( FUNCTOR_$002B_2 ,  int_3 ,  ATOM_sin );
    private static final Compound L_np_head0_7_s11 = S( FUNCTOR_$002B_2 ,  ATOM_def ,  ATOM_proper );
        final static Functor ATOM_common = SYM("common");
    private static final Compound L_np_head0_7_s21 = S( FUNCTOR_$002B_2 ,  ATOM_indef ,  ATOM_common );

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_np_head0_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::np_head0_7_var, FILE_chat_parser::np_head0_7_int, FILE_chat_parser::np_head0_7_int, FILE_chat_parser::np_head0_7_int, FILE_chat_parser::np_head0_7_var, FILE_chat_parser::np_head0_7_int); 
    }

    private final static Operation np_head0_7_var(Prolog m) { 
        m.jtry7(null, FILE_chat_parser::np_head0_7_var_1);
        return np_head0_7_1(m);
    }

    private final static Operation np_head0_7_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::np_head0_7_var_2);
        return np_head0_7_2(m);
    }

    private final static Operation np_head0_7_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::np_head0_7_var_3);
        return np_head0_7_3(m);
    }

    private final static Operation np_head0_7_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::np_head0_7_var_4);
        return np_head0_7_4(m);
    }

    private final static Operation np_head0_7_var_4(Prolog m) { 
        m.trust(null);
        return np_head0_7_5(m);
    }

    private final static Operation np_head0_7_int(Prolog m) { 
        m.jtry7(null, FILE_chat_parser::np_head0_7_int_1);
        return np_head0_7_1(m);
    }

    private final static Operation np_head0_7_int_1(Prolog m) { 
        m.trust(null);
        return np_head0_7_4(m);
    }

    private final static Operation np_head0_7_1(Prolog m) { 
    // np_head0(A,B,C,D,D,E,F):-virtual(np_head0(A,B,C),E,F)
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
    // np_head0(A,B,C,D,D,E,F):-[virtual(np_head0(A,B,C),E,F)]
        if (! a4.unify(a5, m.trail))
            return m.fail();
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_np_head0_3'),y(1),a(8))
        a8 =  S( FUNCTOR_np_head0_3 , a1, a2, a3);
 ;
        return //
 Op("virtual", FILE_chat_parser::PRED_virtual_3_static_exec, VA(a8, a6, a7), cont);
    }

    private final static Operation np_head0_7_2(Prolog m) { 
    // np_head0(name(A),3+sin,def+proper,B,C,D,E):-name(A,B,C,D,E)
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
    // np_head0(name(A),3+sin,def+proper,B,C,D,E):-[name(A,B,C,D,E)]
        a1 = a1.dref();
            a8 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_name_1 , m.trail, a8)){
                return m.fail();
            }
        if (! L_np_head0_7_s7.unify(a2, m.trail))
            return m.fail();
        if (! L_np_head0_7_s11.unify(a3, m.trail))
            return m.fail();
        return //
 Op("name", FILE_chat_parser::PRED_name_5_static_exec, VA(a8, a4, a5, a6, a7), cont);
    }

    private final static Operation np_head0_7_3(Prolog m) { 
    // np_head0(np_head(A,B,C),3+D,E+common,F,G,H,I):-determiner(A,D,E,F,J,H,K),adjs(B,J,L,K,M),noun(C,D,L,G,M,I)
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
        cont = m.cont;
    // np_head0(np_head(A,B,C),3+D,E+common,F,G,H,I):-[determiner(A,D,E,F,J,H,K),adjs(B,J,L,K,M),noun(C,D,L,G,M,I)]
        a1 = a1.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_np_head_3 , m.trail, a8, a9, a10)){
                return m.fail();
            }
        a2 = a2.dref();
            a11 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002B_2 , m.trail,  int_3 , a11)){
                return m.fail();
            }
        a3 = a3.dref();
            a12 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002B_2 , m.trail, a12,  ATOM_common )){
                return m.fail();
            }
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        return //
 Op("determiner", FILE_chat_parser::PRED_determiner_7_static_exec, VA(a8, a11, a12, a4, a13, a6, a14), //
 Op("adjs", FILE_chat_parser::PRED_adjs_5_static_exec, VA(a9, a13, a15, a14, a16), //
 Op("noun", FILE_chat_parser::PRED_noun_6_static_exec, VA(a10, a11, a15, a5, a16, a7), cont)));
    }

    private final static Operation np_head0_7_4(Prolog m) { 
    // np_head0(A,B,def+proper,C,D,E,x(nogap,nonterminal,gen_marker,F)):-poss_pron(A,B,C,D,E,F)
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
    // np_head0(A,B,def+proper,C,D,E,x(nogap,nonterminal,gen_marker,F)):-[poss_pron(A,B,C,D,E,F)]
        if (! L_np_head0_7_s11.unify(a3, m.trail))
            return m.fail();
        a7 = a7.dref();
            a8 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal ,  ATOM_gen_marker , a8)){
                return m.fail();
            }
        return //
 Op("poss_pron", FILE_chat_parser::PRED_poss_pron_6_static_exec, VA(a1, a2, a4, a5, a6, a8), cont);
    }

    private final static Operation np_head0_7_5(Prolog m) { 
    // np_head0(np_head(A,[],B),3+sin,indef+common,C,D,E,F):-quantifier_pron(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // np_head0(np_head(A,[],B),3+sin,indef+common,C,D,E,F):-[quantifier_pron(A,B,C,D,E,F)]
        a1 = a1.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_np_head_3 , m.trail, a8,  Prolog.Nil , a9)){
                return m.fail();
            }
        if (! L_np_head0_7_s7.unify(a2, m.trail))
            return m.fail();
        if (! L_np_head0_7_s21.unify(a3, m.trail))
            return m.fail();
        return //
 Op("quantifier_pron", FILE_chat_parser::PRED_quantifier_pron_6_static_exec, VA(a8, a9, a4, a5, a6, a7), cont);
    }
/** PREDICATE: np_compls/10
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(np_compls/10,public)

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10;




    public static Operation PRED_np_compls_10_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::np_compls_10_var, fail_0, fail_0, FILE_chat_parser::np_compls_10_var, fail_0, fail_0); 
    }

    private final static Operation np_compls_10_var(Prolog m) { 
        m.jtry(10, null, FILE_chat_parser::np_compls_10_var_1);
        return np_compls_10_1(m);
    }

    private final static Operation np_compls_10_var_1(Prolog m) { 
        m.trust(null);
        return np_compls_10_2(m);
    }

    private final static Operation np_compls_10_1(Prolog m) { 
    // np_compls(proper,A,B,[],C,D,E,E,F,F):-empty(D)
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
    // np_compls(proper,A,B,[],C,D,E,E,F,F):-[empty(D)]
        if (!  ATOM_proper .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a4, m.trail))
            return m.fail();
        if (! a7.unify(a8, m.trail))
            return m.fail();
        if (! a9.unify(a10, m.trail))
            return m.fail();
        return //
 Op("empty", FILE_chat_parser::PRED_empty_1_static_exec, VA(a6), cont);
    }

    private final static Operation np_compls_10_2(Prolog m) { 
    // np_compls(common,A,B,C,D,E,F,G,H,I):-np_all(J),np_mods(A,B,K,C,D,L,J,M,F,N,H,O),relative(A,K,L,M,E,N,G,O,I)
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
        cont = m.cont;
    // np_compls(common,A,B,C,D,E,F,G,H,I):-[np_all(J),np_mods(A,B,K,C,D,L,J,M,F,N,H,O),relative(A,K,L,M,E,N,G,O,I)]
        if (!  ATOM_common .unify(a1, m.trail))
            return m.fail();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        return //
 Op("np_all", FILE_chat_parser::PRED_np_all_1_static_exec, VA(a11), //
 Op("np_mods", FILE_chat_parser::PRED_np_mods_12_static_exec, VA(a2, a3, a12, a4, a5, a13, a11, a14, a7, a15, a9, a16), //
 Op("relative", FILE_chat_parser::PRED_relative_9_static_exec, VA(a2, a12, a13, a14, a6, a15, a8, a16, a10), cont)));
    }
/** PREDICATE: possessive/14
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(possessive/14,public)
        final static Functor ATOM_poss = SYM("poss");

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14;




    public static Operation PRED_possessive_14_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(14, null, FILE_chat_parser::possessive_14_sub_1);
        return possessive_14_1(m);
    }

    private final static Operation possessive_14_sub_1(Prolog m) { 
        m.trust(null);
        return possessive_14_2(m);
    }

    private final static Operation possessive_14_1(Prolog m) { 
    // possessive(A,B,C,[],D,E,F,G,H,I,J,K,L,M):-gen_case(J,N,L,O),np_head0(P,Q,R,N,S,O,T),possessive(P,Q,R,U,[pp(poss,np(B,A,D))|U],E,F,G,H,I,S,K,T,M)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25;
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
    // possessive(A,B,C,[],D,E,F,G,H,I,J,K,L,M):-[gen_case(J,N,L,O),np_head0(P,Q,R,N,S,O,T),possessive(P,Q,R,U,[pp(poss,np(B,A,D))|U],E,F,G,H,I,S,K,T,M)]
        if (!  Prolog.Nil .unify(a4, m.trail))
            return m.fail();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        a21 = m.mkvar1();
        a22 = m.mkvar1();
    // put_str_args([a(2),a(1),a(5)],y(1)),put_str(@('FUNCTOR_np_3'),y(1),a(23))
        a23 =  S( FUNCTOR_np_3 , a2, a1, a5);
 ;
    // put_str_args([@('ATOM_poss'),a(23)],y(2)),put_str(@('FUNCTOR_pp_2'),y(2),a(24))
        a24 =  S( FUNCTOR_pp_2 ,  ATOM_poss , a23);
 ;
        a25 = CONS(a24, a22);
        return //
 Op("gen_case", FILE_chat_parser::PRED_gen_case_4_static_exec, VA(a11, a15, a13, a16), //
 Op("np_head0", FILE_chat_parser::PRED_np_head0_7_static_exec, VA(a17, a18, a19, a15, a20, a16, a21), //
 Op("possessive", FILE_chat_parser::PRED_possessive_14_static_exec, VA(a17, a18, a19, a22, a25, a6, a7, a8, a9, a10, a20, a12, a21, a14), cont)));
    }

    private final static Operation possessive_14_2(Prolog m) { 
    // possessive(A,B,C,D,E,A,B,C,D,E,F,F,G,G):-true
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
    // possessive(A,B,C,D,E,A,B,C,D,E,F,F,G,G):-[]
        if (! a1.unify(a6, m.trail))
            return m.fail();
        if (! a2.unify(a7, m.trail))
            return m.fail();
        if (! a3.unify(a8, m.trail))
            return m.fail();
        if (! a4.unify(a9, m.trail))
            return m.fail();
        if (! a5.unify(a10, m.trail))
            return m.fail();
        if (! a11.unify(a12, m.trail))
            return m.fail();
        if (! a13.unify(a14, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: gen_case/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(gen_case/4,public)




    public static Operation PRED_gen_case_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // gen_case(A,B,C,x(nogap,terminal,the,D)):-gen_marker(A,B,C,D)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // gen_case(A,B,C,x(nogap,terminal,the,D)):-[gen_marker(A,B,C,D)]
        a4 = a4.dref();
            a5 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_terminal ,  ATOM_the , a5)){
                return m.fail();
            }
        return //
 Op("gen_marker", FILE_chat_parser::PRED_gen_marker_4_static_exec, VA(a1, a2, a3, a5), cont);
    }
/** PREDICATE: an_s/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(an_s/4,public)




    public static Operation PRED_an_s_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_chat_parser::an_s_4_sub_1);
        return an_s_4_1(m);
    }

    private final static Operation an_s_4_sub_1(Prolog m) { 
        m.trust(null);
        return an_s_4_2(m);
    }

    private final static Operation an_s_4_1(Prolog m) { 
    // an_s(A,B,C,D):- ~(s,A,B,C,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // an_s(A,B,C,D):-[~(s,A,B,C,D)]
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_s , a1, a2, a3, a4), cont);
    }

    private final static Operation an_s_4_2(Prolog m) { 
    // an_s(A,A,B,B):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // an_s(A,A,B,B):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: determiner/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(determiner/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_determiner_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_chat_parser::determiner_7_sub_1);
        return determiner_7_1(m);
    }

    private final static Operation determiner_7_sub_1(Prolog m) { 
        m.trust(null);
        return determiner_7_2(m);
    }

    private final static Operation determiner_7_1(Prolog m) { 
    // determiner(A,B,C,D,E,F,G):-det(A,B,C,D,E,F,G)
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
    // determiner(A,B,C,D,E,F,G):-[det(A,B,C,D,E,F,G)]
        return //
 Op("det", FILE_chat_parser::PRED_det_7_static_exec, VA(a1, a2, a3, a4, a5, a6, a7), cont);
    }

    private final static Operation determiner_7_2(Prolog m) { 
    // determiner(A,B,C,D,E,F,G):-quant_phrase(A,B,C,D,E,F,G)
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
    // determiner(A,B,C,D,E,F,G):-[quant_phrase(A,B,C,D,E,F,G)]
        return //
 Op("quant_phrase", FILE_chat_parser::PRED_quant_phrase_7_static_exec, VA(a1, a2, a3, a4, a5, a6, a7), cont);
    }
/** PREDICATE: quant_phrase/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(quant_phrase/7,public)
        final static Functor FUNCTOR_quant_2 = F("quant",2);

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_quant_phrase_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // quant_phrase(quant(A,B),C,D,E,F,G,H):-quant(A,D,E,I,G,J),number(B,C,I,F,J,H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
    // quant_phrase(quant(A,B),C,D,E,F,G,H):-[quant(A,D,E,I,G,J),number(B,C,I,F,J,H)]
        a1 = a1.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_quant_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        return //
 Op("quant", FILE_chat_parser::PRED_quant_6_static_exec, VA(a8, a3, a4, a10, a6, a11), //
 Op("number", FILE_chat_parser::PRED_number_6_static_exec, VA(a9, a2, a10, a5, a11, a7), cont));
    }
/** PREDICATE: quant/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(quant/6,public)
        final static Functor ATOM_at = SYM("at");
        final static Functor ATOM_same = SYM("same");

    // private final Term arg5, arg6;




    public static Operation PRED_quant_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::quant_6_var, FILE_chat_parser::quant_6_int, FILE_chat_parser::quant_6_int, FILE_chat_parser::quant_6_var, FILE_chat_parser::quant_6_int, FILE_chat_parser::quant_6_int); 
    }

    private final static Operation quant_6_var(Prolog m) { 
        m.jtry6(null, FILE_chat_parser::quant_6_var_1);
        return quant_6_1(m);
    }

    private final static Operation quant_6_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::quant_6_var_2);
        return quant_6_2(m);
    }

    private final static Operation quant_6_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::quant_6_var_3);
        return quant_6_3(m);
    }

    private final static Operation quant_6_var_3(Prolog m) { 
        m.trust(null);
        return quant_6_4(m);
    }

    private final static Operation quant_6_int(Prolog m) { 
        m.jtry6(null, FILE_chat_parser::quant_6_int_1);
        return quant_6_1(m);
    }

    private final static Operation quant_6_int_1(Prolog m) { 
        m.trust(null);
        return quant_6_2(m);
    }

    private final static Operation quant_6_1(Prolog m) { 
    // quant(A,indef,B,C,D,E):-neg_adv(F,A,B,G,D,H),comp_adv(F,G,I,H,J),~(than,I,C,J,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // quant(A,indef,B,C,D,E):-[neg_adv(F,A,B,G,D,H),comp_adv(F,G,I,H,J),~(than,I,C,J,E)]
        if (!  ATOM_indef .unify(a2, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        return //
 Op("neg_adv", FILE_chat_parser::PRED_neg_adv_6_static_exec, VA(a7, a1, a3, a8, a5, a9), //
 Op("comp_adv", FILE_chat_parser::PRED_comp_adv_5_static_exec, VA(a7, a8, a10, a9, a11), //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_than , a10, a4, a11, a6), cont)));
    }

    private final static Operation quant_6_2(Prolog m) { 
    // quant(A,indef,B,C,D,E):- ~(at,B,F,D,G),sup_adv(H,F,C,G,E),sup_op(H,A)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // quant(A,indef,B,C,D,E):-[~(at,B,F,D,G),sup_adv(H,F,C,G,E),sup_op(H,A)]
        if (!  ATOM_indef .unify(a2, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_at , a3, a7, a5, a8), //
 Op("sup_adv", FILE_chat_parser::PRED_sup_adv_5_static_exec, VA(a9, a7, a4, a8, a6), //
 Op("sup_op", FILE_chat_parser::PRED_sup_op_2_static_exec, VA(a9, a1), cont)));
    }

    private final static Operation quant_6_3(Prolog m) { 
    // quant(the,def,A,B,C,D):- ~(the,A,B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // quant(the,def,A,B,C,D):-[~(the,A,B,C,D)]
        if (!  ATOM_the .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_def .unify(a2, m.trail))
            return m.fail();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_the , a3, a4, a5, a6), cont);
    }

    private final static Operation quant_6_4(Prolog m) { 
    // quant(same,indef,A,A,B,B):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // quant(same,indef,A,A,B,B):-[]
        if (!  ATOM_same .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_indef .unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        if (! a5.unify(a6, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: neg_adv/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(neg_adv/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_neg_adv_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_chat_parser::neg_adv_6_sub_1);
        return neg_adv_6_1(m);
    }

    private final static Operation neg_adv_6_sub_1(Prolog m) { 
        m.trust(null);
        return neg_adv_6_2(m);
    }

    private final static Operation neg_adv_6_1(Prolog m) { 
    // neg_adv(A,not+A,B,C,D,E):- ~(not,B,C,D,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // neg_adv(A,not+A,B,C,D,E):-[~(not,B,C,D,E)]
        a2 = a2.dref();
            if (!a2.unifyS( FUNCTOR_$002B_2 , m.trail,  ATOM_not , a1)){
                return m.fail();
            }
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_not , a3, a4, a5, a6), cont);
    }

    private final static Operation neg_adv_6_2(Prolog m) { 
    // neg_adv(A,A,B,B,C,C):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // neg_adv(A,A,B,B,C,C):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        if (! a5.unify(a6, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: sup_op/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(sup_op/2,public)
        final static Functor ATOM_least = SYM("least");
        final static Functor ATOM_less = SYM("less");
    private static final Compound L_sup_op_2_s6 = S( FUNCTOR_$002B_2 ,  ATOM_not ,  ATOM_less );
        final static Functor ATOM_most = SYM("most");
    private static final Compound L_sup_op_2_s10 = S( FUNCTOR_$002B_2 ,  ATOM_not ,  ATOM_more );




    public static Operation PRED_sup_op_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::sup_op_2_var, fail_0, fail_0, FILE_chat_parser::sup_op_2_var, fail_0, fail_0); 
    }

    private final static Operation sup_op_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::sup_op_2_var_1);
        return sup_op_2_1(m);
    }

    private final static Operation sup_op_2_var_1(Prolog m) { 
        m.trust(null);
        return sup_op_2_2(m);
    }

    private final static Operation sup_op_2_1(Prolog m) { 
    // sup_op(least,not+less):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // sup_op(least,not+less):-[]
        if (!  ATOM_least .unify(a1, m.trail))
            return m.fail();
        if (! L_sup_op_2_s6.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation sup_op_2_2(Prolog m) { 
    // sup_op(most,not+more):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // sup_op(most,not+more):-[]
        if (!  ATOM_most .unify(a1, m.trail))
            return m.fail();
        if (! L_sup_op_2_s10.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: np_mods/12
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(np_mods/12,public)

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12;




    public static Operation PRED_np_mods_12_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(12, null, FILE_chat_parser::np_mods_12_sub_1);
        return np_mods_12_1(m);
    }

    private final static Operation np_mods_12_sub_1(Prolog m) { 
        m.trust(null);
        return np_mods_12_2(m);
    }

    private final static Operation np_mods_12_1(Prolog m) { 
    // np_mods(A,B,C,[D|E],F,G,H,I,J,K,L,M):-np_mod(A,B,D,F,N,J,O,L,P),trace1(Q),myplus(Q,N,R),minus(F,R,S),myplus(N,F,T),np_mods(A,B,C,E,S,G,T,I,O,K,P,M)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21;
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
        a12 = m.AREGS[11];
        cont = m.cont;
    // np_mods(A,B,C,[D|E],F,G,H,I,J,K,L,M):-[np_mod(A,B,D,F,N,J,O,L,P),trace1(Q),myplus(Q,N,R),minus(F,R,S),myplus(N,F,T),np_mods(A,B,C,E,S,G,T,I,O,K,P,M)]
        a4 = a4.dref();
        if (a4 .isCons()){
                        a13 = a4.car();
            a14 = a4.cdr();
        } else if (a4.isVar()){
            a13 = m.mkvar2();
            a14 = m.mkvar2();
             a4.bind(CONS(a13, a14), m.trail);
        } else {
            return m.fail();
        }
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        a21 = m.mkvar1();
        return //
 Op("np_mod", FILE_chat_parser::PRED_np_mod_9_static_exec, VA(a1, a2, a13, a5, a15, a9, a16, a11, a17), //
 Op("trace1", FILE_chat_parser::PRED_trace1_1_static_exec, VA(a18), //
 Op("myplus", FILE_chat_parser::PRED_myplus_3_static_exec, VA(a18, a15, a19), //
 Op("minus", FILE_chat_parser::PRED_minus_3_static_exec, VA(a5, a19, a20), //
 Op("myplus", FILE_chat_parser::PRED_myplus_3_static_exec, VA(a15, a5, a21), //
 Op("np_mods", FILE_chat_parser::PRED_np_mods_12_static_exec, VA(a1, a2, a3, a14, a20, a6, a21, a8, a16, a10, a17, a12), cont))))));
    }

    private final static Operation np_mods_12_2(Prolog m) { 
    // np_mods(A,B,C,C,D,D,E,E,F,F,G,G):-true
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
    // np_mods(A,B,C,C,D,D,E,E,F,F,G,G):-[]
        if (! a3.unify(a4, m.trail))
            return m.fail();
        if (! a5.unify(a6, m.trail))
            return m.fail();
        if (! a7.unify(a8, m.trail))
            return m.fail();
        if (! a9.unify(a10, m.trail))
            return m.fail();
        if (! a11.unify(a12, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: np_mod/9
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(np_mod/9,public)

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_np_mod_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(9, null, FILE_chat_parser::np_mod_9_sub_1);
        return np_mod_9_1(m);
    }

    private final static Operation np_mod_9_sub_1(Prolog m) { 
        m.trust(null);
        return np_mod_9_2(m);
    }

    private final static Operation np_mod_9_1(Prolog m) { 
    // np_mod(A,B,C,D,E,F,G,H,I):-pp(C,B,D,E,F,G,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // np_mod(A,B,C,D,E,F,G,H,I):-[pp(C,B,D,E,F,G,H,I)]
        return //
 Op("pp", FILE_chat_parser::PRED_pp_8_static_exec, VA(a3, a2, a4, a5, a6, a7, a8, a9), cont);
    }

    private final static Operation np_mod_9_2(Prolog m) { 
    // np_mod(A,B,C,D,E,F,G,H,I):-reduced_relative(A,C,D,E,F,G,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // np_mod(A,B,C,D,E,F,G,H,I):-[reduced_relative(A,C,D,E,F,G,H,I)]
        return //
 Op("reduced_relative", FILE_chat_parser::PRED_reduced_relative_8_static_exec, VA(a1, a3, a4, a5, a6, a7, a8, a9), cont);
    }
/** PREDICATE: verb_mods/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(verb_mods/8,public)

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_verb_mods_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::verb_mods_8_var, fail_0, fail_0, FILE_chat_parser::verb_mods_8_2, fail_0, FILE_chat_parser::verb_mods_8_1); 
    }

    private final static Operation verb_mods_8_var(Prolog m) { 
        m.jtry8(null, FILE_chat_parser::verb_mods_8_var_1);
        return verb_mods_8_1(m);
    }

    private final static Operation verb_mods_8_var_1(Prolog m) { 
        m.trust(null);
        return verb_mods_8_2(m);
    }

    private final static Operation verb_mods_8_1(Prolog m) { 
    // verb_mods([A|B],C,D,E,F,G,H,I):-verb_mod(A,C,J,F,K,H,L),trace1(M),myplus(M,J,N),minus(C,N,O),myplus(J,C,P),verb_mods(B,O,P,E,K,G,L,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
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
        cont = m.cont;
    // verb_mods([A|B],C,D,E,F,G,H,I):-[verb_mod(A,C,J,F,K,H,L),trace1(M),myplus(M,J,N),minus(C,N,O),myplus(J,C,P),verb_mods(B,O,P,E,K,G,L,I)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a9 = a1.car();
            a10 = a1.cdr();
        } else if (a1.isVar()){
            a9 = m.mkvar2();
            a10 = m.mkvar2();
             a1.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        return //
 Op("verb_mod", FILE_chat_parser::PRED_verb_mod_7_static_exec, VA(a9, a2, a11, a5, a12, a7, a13), //
 Op("trace1", FILE_chat_parser::PRED_trace1_1_static_exec, VA(a14), //
 Op("myplus", FILE_chat_parser::PRED_myplus_3_static_exec, VA(a14, a11, a15), //
 Op("minus", FILE_chat_parser::PRED_minus_3_static_exec, VA(a2, a15, a16), //
 Op("myplus", FILE_chat_parser::PRED_myplus_3_static_exec, VA(a11, a2, a17), //
 Op("verb_mods", FILE_chat_parser::PRED_verb_mods_8_static_exec, VA(a10, a16, a17, a4, a12, a6, a13, a8), cont))))));
    }

    private final static Operation verb_mods_8_2(Prolog m) { 
    // verb_mods([],A,B,B,C,C,D,D):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
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
    // verb_mods([],A,B,B,C,C,D,D):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        if (! a5.unify(a6, m.trail))
            return m.fail();
        if (! a7.unify(a8, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: verb_mod/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(verb_mod/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_verb_mod_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_chat_parser::verb_mod_7_sub_1);
        return verb_mod_7_1(m);
    }

    private final static Operation verb_mod_7_sub_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_mod_7_sub_2);
        return verb_mod_7_2(m);
    }

    private final static Operation verb_mod_7_sub_2(Prolog m) { 
        m.trust(null);
        return verb_mod_7_3(m);
    }

    private final static Operation verb_mod_7_1(Prolog m) { 
    // verb_mod(A,B,C,D,E,F,G):-adv_phrase(A,B,C,D,E,F,G)
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
    // verb_mod(A,B,C,D,E,F,G):-[adv_phrase(A,B,C,D,E,F,G)]
        return //
 Op("adv_phrase", FILE_chat_parser::PRED_adv_phrase_7_static_exec, VA(a1, a2, a3, a4, a5, a6, a7), cont);
    }

    private final static Operation verb_mod_7_2(Prolog m) { 
    // verb_mod(A,B,C,D,E,F,G):-is_adv(B),adverb(A,D,E,F,G),empty(C)
         Term a1, a2, a3, a4, a5, a6, a7;
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
    // verb_mod(A,B,C,D,E,F,G):-[is_adv(B),adverb(A,D,E,F,G),empty(C)]
        return //
 Op("is_adv", FILE_chat_parser::PRED_is_adv_1_static_exec, VA(a2), //
 Op("adverb", FILE_chat_parser::PRED_adverb_5_static_exec, VA(a1, a4, a5, a6, a7), //
 Op("empty", FILE_chat_parser::PRED_empty_1_static_exec, VA(a3), cont)));
    }

    private final static Operation verb_mod_7_3(Prolog m) { 
    // verb_mod(A,B,C,D,E,F,G):-pp(A,compl,B,C,D,E,F,G)
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
    // verb_mod(A,B,C,D,E,F,G):-[pp(A,compl,B,C,D,E,F,G)]
        return //
 Op("pp", FILE_chat_parser::PRED_pp_8_static_exec, VA(a1,  ATOM_compl , a2, a3, a4, a5, a6, a7), cont);
    }
/** PREDICATE: adjs/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(adjs/5,public)

    // private final Term arg5;




    public static Operation PRED_adjs_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::adjs_5_var, fail_0, fail_0, FILE_chat_parser::adjs_5_2, fail_0, FILE_chat_parser::adjs_5_1); 
    }

    private final static Operation adjs_5_var(Prolog m) { 
        m.jtry5(null, FILE_chat_parser::adjs_5_var_1);
        return adjs_5_1(m);
    }

    private final static Operation adjs_5_var_1(Prolog m) { 
        m.trust(null);
        return adjs_5_2(m);
    }

    private final static Operation adjs_5_1(Prolog m) { 
    // adjs([A|B],C,D,E,F):-pre_adj(A,C,G,E,H),adjs(B,G,D,H,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // adjs([A|B],C,D,E,F):-[pre_adj(A,C,G,E,H),adjs(B,G,D,H,F)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a6 = a1.car();
            a7 = a1.cdr();
        } else if (a1.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a1.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op("pre_adj", FILE_chat_parser::PRED_pre_adj_5_static_exec, VA(a6, a2, a8, a4, a9), //
 Op("adjs", FILE_chat_parser::PRED_adjs_5_static_exec, VA(a7, a8, a3, a9, a5), cont));
    }

    private final static Operation adjs_5_2(Prolog m) { 
    // adjs([],A,A,B,B):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // adjs([],A,A,B,B):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: pre_adj/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(pre_adj/5,public)

    // private final Term arg5;




    public static Operation PRED_pre_adj_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_chat_parser::pre_adj_5_sub_1);
        return pre_adj_5_1(m);
    }

    private final static Operation pre_adj_5_sub_1(Prolog m) { 
        m.trust(null);
        return pre_adj_5_2(m);
    }

    private final static Operation pre_adj_5_1(Prolog m) { 
    // pre_adj(A,B,C,D,E):-adj(F,A,B,C,D,E)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pre_adj(A,B,C,D,E):-[adj(F,A,B,C,D,E)]
        return //
 Op("adj", FILE_chat_parser::PRED_adj_6_static_exec, VA(m.DONT_CARE2(), a1, a2, a3, a4, a5), cont);
    }

    private final static Operation pre_adj_5_2(Prolog m) { 
    // pre_adj(A,B,C,D,E):-sup_phrase(A,B,C,D,E)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pre_adj(A,B,C,D,E):-[sup_phrase(A,B,C,D,E)]
        return //
 Op("sup_phrase", FILE_chat_parser::PRED_sup_phrase_5_static_exec, VA(a1, a2, a3, a4, a5), cont);
    }
/** PREDICATE: sup_phrase/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(sup_phrase/5,public)
        final static Functor FUNCTOR_sup_2 = F("sup",2);

    // private final Term arg5;




    public static Operation PRED_sup_phrase_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::sup_phrase_5_var, fail_0, fail_0, fail_0, FILE_chat_parser::sup_phrase_5_var, fail_0); 
    }

    private final static Operation sup_phrase_5_var(Prolog m) { 
        m.jtry5(null, FILE_chat_parser::sup_phrase_5_var_1);
        return sup_phrase_5_1(m);
    }

    private final static Operation sup_phrase_5_var_1(Prolog m) { 
        m.trust(null);
        return sup_phrase_5_2(m);
    }

    private final static Operation sup_phrase_5_1(Prolog m) { 
    // sup_phrase(sup(most,A),B,C,D,E):-sup_adj(A,B,C,D,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // sup_phrase(sup(most,A),B,C,D,E):-[sup_adj(A,B,C,D,E)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_sup_2 , m.trail,  ATOM_most , a6)){
                return m.fail();
            }
        return //
 Op("sup_adj", FILE_chat_parser::PRED_sup_adj_5_static_exec, VA(a6, a2, a3, a4, a5), cont);
    }

    private final static Operation sup_phrase_5_2(Prolog m) { 
    // sup_phrase(sup(A,B),C,D,E,F):-sup_adv(A,C,G,E,H),adj(quant,B,G,D,H,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // sup_phrase(sup(A,B),C,D,E,F):-[sup_adv(A,C,G,E,H),adj(quant,B,G,D,H,F)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_sup_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op("sup_adv", FILE_chat_parser::PRED_sup_adv_5_static_exec, VA(a6, a2, a8, a4, a9), //
 Op("adj", FILE_chat_parser::PRED_adj_6_static_exec, VA( ATOM_quant , a7, a8, a3, a9, a5), cont));
    }
/** PREDICATE: comp_phrase/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(comp_phrase/6,public)
        final static Functor FUNCTOR_comp_3 = F("comp",3);

    // private final Term arg5, arg6;




    public static Operation PRED_comp_phrase_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // comp_phrase(comp(A,B,C),D,E,F,G,H):-comp(A,B,E,I,G,J),np_no_trace(K),prep_case(L),np(C,M,L,N,compl,K,D,I,F,J,H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // comp_phrase(comp(A,B,C),D,E,F,G,H):-[comp(A,B,E,I,G,J),np_no_trace(K),prep_case(L),np(C,M,L,N,compl,K,D,I,F,J,H)]
        a1 = a1.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_comp_3 , m.trail, a7, a8, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        return //
 Op("comp", FILE_chat_parser::PRED_comp_6_static_exec, VA(a7, a8, a3, a10, a5, a11), //
 Op("np_no_trace", FILE_chat_parser::PRED_np_no_trace_1_static_exec, VA(a12), //
 Op("prep_case", FILE_chat_parser::PRED_prep_case_1_static_exec, VA(a13), //
 Op("np", FILE_chat_parser::PRED_np_11_static_exec, VA(a9, m.DONT_CARE2(), a13, m.DONT_CARE2(),  ATOM_compl , a12, a2, a10, a4, a11, a6), cont))));
    }
/** PREDICATE: comp/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(comp/6,public)
        final static Functor ATOM_as = SYM("as");

    // private final Term arg5, arg6;




    public static Operation PRED_comp_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::comp_6_var, FILE_chat_parser::comp_6_1, FILE_chat_parser::comp_6_1, FILE_chat_parser::comp_6_var, FILE_chat_parser::comp_6_1, FILE_chat_parser::comp_6_1); 
    }

    private final static Operation comp_6_var(Prolog m) { 
        m.jtry6(null, FILE_chat_parser::comp_6_var_1);
        return comp_6_1(m);
    }

    private final static Operation comp_6_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::comp_6_var_2);
        return comp_6_2(m);
    }

    private final static Operation comp_6_var_2(Prolog m) { 
        m.trust(null);
        return comp_6_3(m);
    }

    private final static Operation comp_6_1(Prolog m) { 
    // comp(A,B,C,D,E,F):-comp_adv(A,C,G,E,H),adj(quant,B,G,I,H,J),~(than,I,D,J,F)
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
    // comp(A,B,C,D,E,F):-[comp_adv(A,C,G,E,H),adj(quant,B,G,I,H,J),~(than,I,D,J,F)]
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        return //
 Op("comp_adv", FILE_chat_parser::PRED_comp_adv_5_static_exec, VA(a1, a3, a7, a5, a8), //
 Op("adj", FILE_chat_parser::PRED_adj_6_static_exec, VA( ATOM_quant , a2, a7, a9, a8, a10), //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_than , a9, a4, a10, a6), cont)));
    }

    private final static Operation comp_6_2(Prolog m) { 
    // comp(more,A,B,C,D,E):-rel_adj(A,B,F,D,G),~(than,F,C,G,E)
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
    // comp(more,A,B,C,D,E):-[rel_adj(A,B,F,D,G),~(than,F,C,G,E)]
        if (!  ATOM_more .unify(a1, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        return //
 Op("rel_adj", FILE_chat_parser::PRED_rel_adj_5_static_exec, VA(a2, a3, a7, a5, a8), //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_than , a7, a4, a8, a6), cont));
    }

    private final static Operation comp_6_3(Prolog m) { 
    // comp(same,A,B,C,D,E):- ~(as,B,F,D,G),adj(quant,A,F,H,G,I),~(as,H,C,I,E)
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
    // comp(same,A,B,C,D,E):-[~(as,B,F,D,G),adj(quant,A,F,H,G,I),~(as,H,C,I,E)]
        if (!  ATOM_same .unify(a1, m.trail))
            return m.fail();
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_as , a3, a7, a5, a8), //
 Op("adj", FILE_chat_parser::PRED_adj_6_static_exec, VA( ATOM_quant , a2, a7, a9, a8, a10), //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_as , a9, a4, a10, a6), cont)));
    }
/** PREDICATE: relative/9
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(relative/9,public)

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_relative_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(9, null, FILE_chat_parser::relative_9_sub_1);
        return relative_9_1(m);
    }

    private final static Operation relative_9_sub_1(Prolog m) { 
        m.trust(null);
        return relative_9_2(m);
    }

    private final static Operation relative_9_1(Prolog m) { 
    // relative(A,[B],C,D,E,F,G,H,I):-is_pred(C),rel_conj(A,J,B,E,F,G,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
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
    // relative(A,[B],C,D,E,F,G,H,I):-[is_pred(C),rel_conj(A,J,B,E,F,G,H,I)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a10 = a2.car();
            if (!  Prolog.Nil .unify(a2.cdr(), m.trail))
                return m.fail();
        } else if (a2.isVar()){
            a10 = m.mkvar2();
             a2.bind(CONS(a10,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("is_pred", FILE_chat_parser::PRED_is_pred_1_static_exec, VA(a3), //
 Op("rel_conj", FILE_chat_parser::PRED_rel_conj_8_static_exec, VA(a1, m.DONT_CARE2(), a10, a5, a6, a7, a8, a9), cont));
    }

    private final static Operation relative_9_2(Prolog m) { 
    // relative(A,[],B,C,C,D,D,E,E):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // relative(A,[],B,C,C,D,D,E,E):-[]
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        if (! a6.unify(a7, m.trail))
            return m.fail();
        if (! a8.unify(a9, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: rel_conj/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(rel_conj/8,public)

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_rel_conj_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rel_conj(A,B,C,D,E,F,G,H):-rel(A,I,J,E,K,G,L),rel_rest(A,B,I,C,J,D,K,F,L,H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
        a8 = LARG[7];
    // rel_conj(A,B,C,D,E,F,G,H):-[rel(A,I,J,E,K,G,L),rel_rest(A,B,I,C,J,D,K,F,L,H)]
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        return //
 Op("rel", FILE_chat_parser::PRED_rel_7_static_exec, VA(a1, a9, a10, a5, a11, a7, a12), //
 Op("rel_rest", FILE_chat_parser::PRED_rel_rest_10_static_exec, VA(a1, a2, a9, a3, a10, a4, a11, a6, a12, a8), cont));
    }
/** PREDICATE: rel_rest/10
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(rel_rest/10,public)

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10;




    public static Operation PRED_rel_rest_10_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(10, null, FILE_chat_parser::rel_rest_10_sub_1);
        return rel_rest_10_1(m);
    }

    private final static Operation rel_rest_10_sub_1(Prolog m) { 
        m.trust(null);
        return rel_rest_10_2(m);
    }

    private final static Operation rel_rest_10_1(Prolog m) { 
    // rel_rest(A,B,C,D,E,F,G,H,I,J):-conj(B,K,C,L,D,G,M,I,N),rel_conj(A,K,L,F,M,H,N,J)
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
        cont = m.cont;
    // rel_rest(A,B,C,D,E,F,G,H,I,J):-[conj(B,K,C,L,D,G,M,I,N),rel_conj(A,K,L,F,M,H,N,J)]
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        return //
 Op("conj", FILE_chat_parser::PRED_conj_9_static_exec, VA(a2, a11, a3, a12, a4, a7, a13, a9, a14), //
 Op("rel_conj", FILE_chat_parser::PRED_rel_conj_8_static_exec, VA(a1, a11, a12, a6, a13, a8, a14, a10), cont));
    }

    private final static Operation rel_rest_10_2(Prolog m) { 
    // rel_rest(A,B,C,C,D,D,E,E,F,F):-true
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
    // rel_rest(A,B,C,C,D,D,E,E,F,F):-[]
        if (! a3.unify(a4, m.trail))
            return m.fail();
        if (! a5.unify(a6, m.trail))
            return m.fail();
        if (! a7.unify(a8, m.trail))
            return m.fail();
        if (! a9.unify(a10, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: rel/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(rel/7,public)
        final static Functor FUNCTOR_rel_2 = F("rel",2);

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_rel_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rel(A,rel(B,C),D,E,F,G,H):-myopen(E,I,G,J),variable(A,B,I,K,J,L),s(C,M,K,N,L,O),trace1(P),minus(M,P,D),close(N,F,O,H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
        Operation p1, p2, p3, p4, p5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
    // rel(A,rel(B,C),D,E,F,G,H):-[myopen(E,I,G,J),variable(A,B,I,K,J,L),s(C,M,K,N,L,O),trace1(P),minus(M,P,D),close(N,F,O,H)]
        a2 = a2.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_rel_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        return //
 Op("myopen", FILE_chat_parser::PRED_myopen_4_static_exec, VA(a4, a10, a6, a11), //
 Op("variable", FILE_chat_parser::PRED_variable_6_static_exec, VA(a1, a8, a10, a12, a11, a13), //
 Op("s", FILE_chat_parser::PRED_s_6_static_exec, VA(a9, a14, a12, a15, a13, a16), //
 Op("trace1", FILE_chat_parser::PRED_trace1_1_static_exec, VA(a17), //
 Op("minus", FILE_chat_parser::PRED_minus_3_static_exec, VA(a14, a17, a3), //
 Op("close", FILE_chat_parser::PRED_close_4_static_exec, VA(a15, a5, a16, a7), cont))))));
    }
/** PREDICATE: variable/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(variable/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_variable_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_chat_parser::variable_6_sub_1);
        return variable_6_1(m);
    }

    private final static Operation variable_6_sub_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::variable_6_sub_2);
        return variable_6_2(m);
    }

    private final static Operation variable_6_sub_2(Prolog m) { 
        m.trust(null);
        return variable_6_3(m);
    }

    private final static Operation variable_6_1(Prolog m) { 
    // variable(A,B,C,D,E,x(gap,nonterminal,np(np(A,wh(B),[]),A,F,G,H,I,J),K)):- ~(that,C,D,E,K),trace1(I,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // variable(A,B,C,D,E,x(gap,nonterminal,np(np(A,wh(B),[]),A,F,G,H,I,J),K)):-[~(that,C,D,E,K),trace1(I,J)]
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_gap ,  ATOM_nonterminal , a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_np_7 , m.trail, a9, a1, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), a10, a11)){
                return m.fail();
            }
        a9 = a9.dref();
            a12 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_np_3 , m.trail, a1, a12,  Prolog.Nil )){
                return m.fail();
            }
        a12 = a12.dref();
            if (!a12.unifyS( FUNCTOR_wh_1 , m.trail, a2)){
                return m.fail();
            }
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_that , a3, a4, a5, a8), //
 Op("trace1", FILE_chat_parser::PRED_trace1_2_static_exec, VA(a10, a11), cont));
    }

    private final static Operation variable_6_2(Prolog m) { 
    // variable(A,B,C,D,E,x(gap,nonterminal,np(F,G,H,I,J,K,L),M)):-wh(B,A,F,G,H,C,D,E,M),trace1(K,L)
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
    // variable(A,B,C,D,E,x(gap,nonterminal,np(F,G,H,I,J,K,L),M)):-[wh(B,A,F,G,H,C,D,E,M),trace1(K,L)]
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_gap ,  ATOM_nonterminal , a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_np_7 , m.trail, a9, a10, a11, m.DONT_CARE1(), m.DONT_CARE1(), a12, a13)){
                return m.fail();
            }
        return //
 Op("wh", FILE_chat_parser::PRED_wh_9_static_exec, VA(a2, a1, a9, a10, a11, a3, a4, a5, a8), //
 Op("trace1", FILE_chat_parser::PRED_trace1_2_static_exec, VA(a12, a13), cont));
    }

    private final static Operation variable_6_3(Prolog m) { 
    // variable(A,B,C,D,E,x(gap,nonterminal,pp(pp(F,G),compl,H,I),J)):-prep(F,C,K,E,L),wh(B,A,G,M,N,K,D,L,J),trace1(H,I),compl_case(N)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // variable(A,B,C,D,E,x(gap,nonterminal,pp(pp(F,G),compl,H,I),J)):-[prep(F,C,K,E,L),wh(B,A,G,M,N,K,D,L,J),trace1(H,I),compl_case(N)]
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_gap ,  ATOM_nonterminal , a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_pp_4 , m.trail, a9,  ATOM_compl , a10, a11)){
                return m.fail();
            }
        a9 = a9.dref();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_pp_2 , m.trail, a12, a13)){
                return m.fail();
            }
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        return //
 Op("prep", FILE_chat_parser::PRED_prep_5_static_exec, VA(a12, a3, a14, a5, a15), //
 Op("wh", FILE_chat_parser::PRED_wh_9_static_exec, VA(a2, a1, a13, m.DONT_CARE2(), a16, a14, a4, a15, a8), //
 Op("trace1", FILE_chat_parser::PRED_trace1_2_static_exec, VA(a10, a11), //
 Op("compl_case", FILE_chat_parser::PRED_compl_case_1_static_exec, VA(a16), cont))));
    }
/** PREDICATE: wh/9
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(wh/9,public)

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_wh_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(9, null, FILE_chat_parser::wh_9_sub_1);
        return wh_9_1(m);
    }

    private final static Operation wh_9_sub_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::wh_9_sub_2);
        return wh_9_2(m);
    }

    private final static Operation wh_9_sub_2(Prolog m) { 
        m.trust(null);
        return wh_9_3(m);
    }

    private final static Operation wh_9_1(Prolog m) { 
    // wh(A,B,np(B,wh(A),[]),B,C,D,E,F,G):-rel_pron(H,D,E,F,G),role(H,decl,C)
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
    // wh(A,B,np(B,wh(A),[]),B,C,D,E,F,G):-[rel_pron(H,D,E,F,G),role(H,decl,C)]
        a3 = a3.dref();
            a10 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_np_3 , m.trail, a2, a10,  Prolog.Nil )){
                return m.fail();
            }
        a10 = a10.dref();
            if (!a10.unifyS( FUNCTOR_wh_1 , m.trail, a1)){
                return m.fail();
            }
        if (! a2.unify(a4, m.trail))
            return m.fail();
        a11 = m.mkvar1();
        return //
 Op("rel_pron", FILE_chat_parser::PRED_rel_pron_5_static_exec, VA(a11, a6, a7, a8, a9), //
 Op("role", FILE_chat_parser::PRED_role_3_static_exec, VA(a11,  ATOM_decl , a5), cont));
    }

    private final static Operation wh_9_2(Prolog m) { 
    // wh(A,B,np(C,D,[pp(E,F)]),C,G,H,I,J,K):-np_head0(D,C,L+common,H,M,J,N),prep(E,M,O,N,P),wh(A,B,F,Q,R,O,I,P,K)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
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
        cont = m.cont;
    // wh(A,B,np(C,D,[pp(E,F)]),C,G,H,I,J,K):-[np_head0(D,C,L+common,H,M,J,N),prep(E,M,O,N,P),wh(A,B,F,Q,R,O,I,P,K)]
        a3 = a3.dref();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_np_3 , m.trail, a10, a11, a12)){
                return m.fail();
            }
        a12 = a12.dref();
        if (a12 .isCons()){
                        a13 = a12.car();
            if (!  Prolog.Nil .unify(a12.cdr(), m.trail))
                return m.fail();
        } else if (a12.isVar()){
            a13 = m.mkvar2();
             a12.bind(CONS(a13,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a13 = a13.dref();
            a14 = m.mkvar2();
            a15 = m.mkvar2();
            if (!a13.unifyS( FUNCTOR_pp_2 , m.trail, a14, a15)){
                return m.fail();
            }
        if (! a10.unify(a4, m.trail))
            return m.fail();
    // put_str_args([void,@('ATOM_common')],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(16))
        a16 =  S( FUNCTOR_$002B_2 , m.mkvar3(),  ATOM_common );
 ;
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        return //
 Op("np_head0", FILE_chat_parser::PRED_np_head0_7_static_exec, VA(a11, a10, a16, a6, a17, a8, a18), //
 Op("prep", FILE_chat_parser::PRED_prep_5_static_exec, VA(a14, a17, a19, a18, a20), //
 Op("wh", FILE_chat_parser::PRED_wh_9_static_exec, VA(a1, a2, a15, m.DONT_CARE2(), m.DONT_CARE2(), a19, a7, a20, a9), cont)));
    }

    private final static Operation wh_9_3(Prolog m) { 
    // wh(A,B,C,D,E,F,G,H,I):-whose(A,B,F,J,H,K),s_all(L),np(C,D,E,def,subj,L,M,J,G,K,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
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
        cont = m.cont;
    // wh(A,B,C,D,E,F,G,H,I):-[whose(A,B,F,J,H,K),s_all(L),np(C,D,E,def,subj,L,M,J,G,K,I)]
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        return //
 Op("whose", FILE_chat_parser::PRED_whose_6_static_exec, VA(a1, a2, a6, a10, a8, a11), //
 Op("s_all", FILE_chat_parser::PRED_s_all_1_static_exec, VA(a12), //
 Op("np", FILE_chat_parser::PRED_np_11_static_exec, VA(a3, a4, a5,  ATOM_def ,  ATOM_subj , a12, m.DONT_CARE2(), a10, a7, a11, a9), cont)));
    }
/** PREDICATE: reduced_relative/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(reduced_relative/8,public)

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_reduced_relative_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // reduced_relative(A,B,C,D,E,F,G,H):-is_pred(C),reduced_rel_conj(A,I,B,D,E,F,G,H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
        a8 = LARG[7];
    // reduced_relative(A,B,C,D,E,F,G,H):-[is_pred(C),reduced_rel_conj(A,I,B,D,E,F,G,H)]
        return //
 Op("is_pred", FILE_chat_parser::PRED_is_pred_1_static_exec, VA(a3), //
 Op("reduced_rel_conj", FILE_chat_parser::PRED_reduced_rel_conj_8_static_exec, VA(a1, m.DONT_CARE2(), a2, a4, a5, a6, a7, a8), cont));
    }
/** PREDICATE: reduced_rel_conj/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(reduced_rel_conj/8,public)

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_reduced_rel_conj_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // reduced_rel_conj(A,B,C,D,E,F,G,H):-reduced_rel(A,I,J,E,K,G,L),reduced_rel_rest(A,B,I,C,J,D,K,F,L,H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
        a8 = LARG[7];
    // reduced_rel_conj(A,B,C,D,E,F,G,H):-[reduced_rel(A,I,J,E,K,G,L),reduced_rel_rest(A,B,I,C,J,D,K,F,L,H)]
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        return //
 Op("reduced_rel", FILE_chat_parser::PRED_reduced_rel_7_static_exec, VA(a1, a9, a10, a5, a11, a7, a12), //
 Op("reduced_rel_rest", FILE_chat_parser::PRED_reduced_rel_rest_10_static_exec, VA(a1, a2, a9, a3, a10, a4, a11, a6, a12, a8), cont));
    }
/** PREDICATE: reduced_rel_rest/10
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(reduced_rel_rest/10,public)

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10;




    public static Operation PRED_reduced_rel_rest_10_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(10, null, FILE_chat_parser::reduced_rel_rest_10_sub_1);
        return reduced_rel_rest_10_1(m);
    }

    private final static Operation reduced_rel_rest_10_sub_1(Prolog m) { 
        m.trust(null);
        return reduced_rel_rest_10_2(m);
    }

    private final static Operation reduced_rel_rest_10_1(Prolog m) { 
    // reduced_rel_rest(A,B,C,D,E,F,G,H,I,J):-conj(B,K,C,L,D,G,M,I,N),reduced_rel_conj(A,K,L,F,M,H,N,J)
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
        cont = m.cont;
    // reduced_rel_rest(A,B,C,D,E,F,G,H,I,J):-[conj(B,K,C,L,D,G,M,I,N),reduced_rel_conj(A,K,L,F,M,H,N,J)]
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        return //
 Op("conj", FILE_chat_parser::PRED_conj_9_static_exec, VA(a2, a11, a3, a12, a4, a7, a13, a9, a14), //
 Op("reduced_rel_conj", FILE_chat_parser::PRED_reduced_rel_conj_8_static_exec, VA(a1, a11, a12, a6, a13, a8, a14, a10), cont));
    }

    private final static Operation reduced_rel_rest_10_2(Prolog m) { 
    // reduced_rel_rest(A,B,C,C,D,D,E,E,F,F):-true
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
    // reduced_rel_rest(A,B,C,C,D,D,E,E,F,F):-[]
        if (! a3.unify(a4, m.trail))
            return m.fail();
        if (! a5.unify(a6, m.trail))
            return m.fail();
        if (! a7.unify(a8, m.trail))
            return m.fail();
        if (! a9.unify(a10, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: reduced_rel/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(reduced_rel/7,public)
        final static Functor FUNCTOR_reduced_rel_2 = F("reduced_rel",2);

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_reduced_rel_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // reduced_rel(A,reduced_rel(B,C),D,E,F,G,H):-myopen(E,I,G,J),reduced_wh(A,B,I,K,J,L),s(C,M,K,N,L,O),trace1(P),minus(M,P,D),close(N,F,O,H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
        Operation p1, p2, p3, p4, p5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
    // reduced_rel(A,reduced_rel(B,C),D,E,F,G,H):-[myopen(E,I,G,J),reduced_wh(A,B,I,K,J,L),s(C,M,K,N,L,O),trace1(P),minus(M,P,D),close(N,F,O,H)]
        a2 = a2.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_reduced_rel_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        return //
 Op("myopen", FILE_chat_parser::PRED_myopen_4_static_exec, VA(a4, a10, a6, a11), //
 Op("reduced_wh", FILE_chat_parser::PRED_reduced_wh_6_static_exec, VA(a1, a8, a10, a12, a11, a13), //
 Op("s", FILE_chat_parser::PRED_s_6_static_exec, VA(a9, a14, a12, a15, a13, a16), //
 Op("trace1", FILE_chat_parser::PRED_trace1_1_static_exec, VA(a17), //
 Op("minus", FILE_chat_parser::PRED_minus_3_static_exec, VA(a14, a17, a3), //
 Op("close", FILE_chat_parser::PRED_close_4_static_exec, VA(a15, a5, a16, a7), cont))))));
    }
/** PREDICATE: reduced_wh/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(reduced_wh/6,public)
        final static Functor ATOM_pres = SYM("pres");
    private static final Compound L_reduced_wh_6_s14 = S( FUNCTOR_$002B_2 ,  ATOM_pres ,  ATOM_fin );
        final static Functor FUNCTOR_verb_4 = F("verb",4);

    // private final Term arg5, arg6;




    public static Operation PRED_reduced_wh_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_chat_parser::reduced_wh_6_sub_1);
        return reduced_wh_6_1(m);
    }

    private final static Operation reduced_wh_6_sub_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::reduced_wh_6_sub_2);
        return reduced_wh_6_2(m);
    }

    private final static Operation reduced_wh_6_sub_2(Prolog m) { 
        m.trust(null);
        return reduced_wh_6_3(m);
    }

    private final static Operation reduced_wh_6_1(Prolog m) { 
    // reduced_wh(A,B,C,D,E,x(nogap,nonterminal,np(np(A,wh(B),[]),A,F,G,H,I,J),x(nogap,nonterminal,verb_form(be,pres+fin,A,main),x(nogap,nonterminal,neg(K,L),x(nogap,nonterminal,predicate(L,M,N),O))))):-neg(P,L,C,Q,E,R),predicate(L,M,N,Q,D,R,O),trace1(I,J),subj_case(F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // reduced_wh(A,B,C,D,E,x(nogap,nonterminal,np(np(A,wh(B),[]),A,F,G,H,I,J),x(nogap,nonterminal,verb_form(be,pres+fin,A,main),x(nogap,nonterminal,neg(K,L),x(nogap,nonterminal,predicate(L,M,N),O))))):-[neg(P,L,C,Q,E,R),predicate(L,M,N,Q,D,R,O),trace1(I,J),subj_case(F)]
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal , a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_np_7 , m.trail, a9, a1, a10, m.DONT_CARE1(), m.DONT_CARE1(), a11, a12)){
                return m.fail();
            }
        a9 = a9.dref();
            a13 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_np_3 , m.trail, a1, a13,  Prolog.Nil )){
                return m.fail();
            }
        a13 = a13.dref();
            if (!a13.unifyS( FUNCTOR_wh_1 , m.trail, a2)){
                return m.fail();
            }
        a8 = a8.dref();
            a14 = m.mkvar2();
            a15 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal , a14, a15)){
                return m.fail();
            }
        a14 = a14.dref();
            if (!a14.unifyS( FUNCTOR_verb_form_4 , m.trail,  ATOM_be , L_reduced_wh_6_s14, a1,  ATOM_main )){
                return m.fail();
            }
        a15 = a15.dref();
            a16 = m.mkvar2();
            a17 = m.mkvar2();
            if (!a15.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal , a16, a17)){
                return m.fail();
            }
        a16 = a16.dref();
            a18 = m.mkvar2();
            if (!a16.unifyS( FUNCTOR_neg_2 , m.trail, m.DONT_CARE1(), a18)){
                return m.fail();
            }
        a17 = a17.dref();
            a19 = m.mkvar2();
            a20 = m.mkvar2();
            if (!a17.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal , a19, a20)){
                return m.fail();
            }
        a19 = a19.dref();
            a21 = m.mkvar2();
            a22 = m.mkvar2();
            if (!a19.unifyS( FUNCTOR_predicate_3 , m.trail, a18, a21, a22)){
                return m.fail();
            }
        a23 = m.mkvar1();
        a24 = m.mkvar1();
        return //
 Op("neg", FILE_chat_parser::PRED_neg_6_static_exec, VA(m.DONT_CARE2(), a18, a3, a23, a5, a24), //
 Op("predicate", FILE_chat_parser::PRED_predicate_7_static_exec, VA(a18, a21, a22, a23, a4, a24, a20), //
 Op("trace1", FILE_chat_parser::PRED_trace1_2_static_exec, VA(a11, a12), //
 Op("subj_case", FILE_chat_parser::PRED_subj_case_1_static_exec, VA(a10), cont))));
    }

    private final static Operation reduced_wh_6_2(Prolog m) { 
    // reduced_wh(A,B,C,D,E,x(nogap,nonterminal,np(np(A,wh(B),[]),A,F,G,H,I,J),x(nogap,nonterminal,verb(K,L,M,N),O))):-participle(K,M,N,C,D,E,O),trace1(I,J),subj_case(F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // reduced_wh(A,B,C,D,E,x(nogap,nonterminal,np(np(A,wh(B),[]),A,F,G,H,I,J),x(nogap,nonterminal,verb(K,L,M,N),O))):-[participle(K,M,N,C,D,E,O),trace1(I,J),subj_case(F)]
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal , a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_np_7 , m.trail, a9, a1, a10, m.DONT_CARE1(), m.DONT_CARE1(), a11, a12)){
                return m.fail();
            }
        a9 = a9.dref();
            a13 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_np_3 , m.trail, a1, a13,  Prolog.Nil )){
                return m.fail();
            }
        a13 = a13.dref();
            if (!a13.unifyS( FUNCTOR_wh_1 , m.trail, a2)){
                return m.fail();
            }
        a8 = a8.dref();
            a14 = m.mkvar2();
            a15 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal , a14, a15)){
                return m.fail();
            }
        a14 = a14.dref();
            a16 = m.mkvar2();
            a17 = m.mkvar2();
            a18 = m.mkvar2();
            if (!a14.unifyS( FUNCTOR_verb_4 , m.trail, a16, m.DONT_CARE1(), a17, a18)){
                return m.fail();
            }
        return //
 Op("participle", FILE_chat_parser::PRED_participle_7_static_exec, VA(a16, a17, a18, a3, a4, a5, a15), //
 Op("trace1", FILE_chat_parser::PRED_trace1_2_static_exec, VA(a11, a12), //
 Op("subj_case", FILE_chat_parser::PRED_subj_case_1_static_exec, VA(a10), cont)));
    }

    private final static Operation reduced_wh_6_3(Prolog m) { 
    // reduced_wh(A,B,C,D,E,x(nogap,nonterminal,np(F,G,H,I,J,K,L),x(gap,nonterminal,np(np(A,wh(B),[]),A,M,N,O,P,Q),R))):-s_all(S),subj_case(H),verb_case(M),np(F,G,T,I,subj,S,U,C,D,E,R),trace1(K,L),trace1(P,Q)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // reduced_wh(A,B,C,D,E,x(nogap,nonterminal,np(F,G,H,I,J,K,L),x(gap,nonterminal,np(np(A,wh(B),[]),A,M,N,O,P,Q),R))):-[s_all(S),subj_case(H),verb_case(M),np(F,G,T,I,subj,S,U,C,D,E,R),trace1(K,L),trace1(P,Q)]
        a6 = a6.dref();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_nogap ,  ATOM_nonterminal , a7, a8)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            a14 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_np_7 , m.trail, a9, a10, a11, a12, m.DONT_CARE1(), a13, a14)){
                return m.fail();
            }
        a8 = a8.dref();
            a15 = m.mkvar2();
            a16 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_gap ,  ATOM_nonterminal , a15, a16)){
                return m.fail();
            }
        a15 = a15.dref();
            a17 = m.mkvar2();
            a18 = m.mkvar2();
            a19 = m.mkvar2();
            a20 = m.mkvar2();
            if (!a15.unifyS( FUNCTOR_np_7 , m.trail, a17, a1, a18, m.DONT_CARE1(), m.DONT_CARE1(), a19, a20)){
                return m.fail();
            }
        a17 = a17.dref();
            a21 = m.mkvar2();
            if (!a17.unifyS( FUNCTOR_np_3 , m.trail, a1, a21,  Prolog.Nil )){
                return m.fail();
            }
        a21 = a21.dref();
            if (!a21.unifyS( FUNCTOR_wh_1 , m.trail, a2)){
                return m.fail();
            }
        a22 = m.mkvar1();
        return //
 Op("s_all", FILE_chat_parser::PRED_s_all_1_static_exec, VA(a22), //
 Op("subj_case", FILE_chat_parser::PRED_subj_case_1_static_exec, VA(a11), //
 Op("verb_case", FILE_chat_parser::PRED_verb_case_1_static_exec, VA(a18), //
 Op("np", FILE_chat_parser::PRED_np_11_static_exec, VA(a9, a10, m.DONT_CARE2(), a12,  ATOM_subj , a22, m.DONT_CARE2(), a3, a4, a5, a16), //
 Op("trace1", FILE_chat_parser::PRED_trace1_2_static_exec, VA(a13, a14), //
 Op("trace1", FILE_chat_parser::PRED_trace1_2_static_exec, VA(a19, a20), cont))))));
    }
/** PREDICATE: verb/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(verb/8,public)
        final static Functor FUNCTOR_verb_5 = F("verb",5);

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_verb_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::verb_8_var, FILE_chat_parser::verb_8_1, FILE_chat_parser::verb_8_1, FILE_chat_parser::verb_8_1, FILE_chat_parser::verb_8_var, FILE_chat_parser::verb_8_1); 
    }

    private final static Operation verb_8_var(Prolog m) { 
        m.jtry8(null, FILE_chat_parser::verb_8_var_1);
        return verb_8_1(m);
    }

    private final static Operation verb_8_var_1(Prolog m) { 
        m.trust(null);
        return verb_8_2(m);
    }

    private final static Operation verb_8_1(Prolog m) { 
    // verb(A,B,C,D,E,E,F,G):-virtual(verb(A,B,C,D),F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // verb(A,B,C,D,E,E,F,G):-[virtual(verb(A,B,C,D),F,G)]
        if (! a5.unify(a6, m.trail))
            return m.fail();
    // put_str_args([a(1),a(2),a(3),a(4)],y(1)),put_str(@('FUNCTOR_verb_4'),y(1),a(9))
        a9 =  S( FUNCTOR_verb_4 , a1, a2, a3, a4);
 ;
        return //
 Op("virtual", FILE_chat_parser::PRED_virtual_3_static_exec, VA(a9, a7, a8), cont);
    }

    private final static Operation verb_8_2(Prolog m) { 
    // verb(verb(A,B,C+fin,D,E),F,G,B,H,I,J,K):-verb_form(L,C+fin,F,M,H,N,J,O),verb_type(L,P),neg(P,E,N,Q,O,R),rest_verb(M,L,A,B,D,Q,I,R,K),verb_type(A,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
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
    // verb(verb(A,B,C+fin,D,E),F,G,B,H,I,J,K):-[verb_form(L,C+fin,F,M,H,N,J,O),verb_type(L,P),neg(P,E,N,Q,O,R),rest_verb(M,L,A,B,D,Q,I,R,K),verb_type(A,G)]
        a1 = a1.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_verb_5 , m.trail, a9, a10, a11, a12, a13)){
                return m.fail();
            }
        a11 = a11.dref();
            a14 = m.mkvar2();
            if (!a11.unifyS( FUNCTOR_$002B_2 , m.trail, a14,  ATOM_fin )){
                return m.fail();
            }
        if (! a10.unify(a4, m.trail))
            return m.fail();
        a15 = m.mkvar1();
    // put_str_args([a(14),@('ATOM_fin')],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(16))
        a16 =  S( FUNCTOR_$002B_2 , a14,  ATOM_fin );
 ;
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        a21 = m.mkvar1();
        a22 = m.mkvar1();
        return //
 Op("verb_form", FILE_chat_parser::PRED_verb_form_8_static_exec, VA(a15, a16, a2, a17, a5, a18, a7, a19), //
 Op("verb_type", FILE_chat_parser::PRED_verb_type_2_static_exec, VA(a15, a20), //
 Op("neg", FILE_chat_parser::PRED_neg_6_static_exec, VA(a20, a13, a18, a21, a19, a22), //
 Op("rest_verb", FILE_chat_parser::PRED_rest_verb_9_static_exec, VA(a17, a15, a9, a10, a12, a21, a6, a22, a8), //
 Op("verb_type", FILE_chat_parser::PRED_verb_type_2_static_exec, VA(a9, a3), cont)))));
    }
/** PREDICATE: rest_verb/9
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(rest_verb/9,public)
        final static Functor ATOM_have = SYM("have");
        final static Functor ATOM_perf = SYM("perf");
        final static Functor ATOM_past = SYM("past");
        final static Functor ATOM_part = SYM("part");
    private static final Compound L_rest_verb_9_s8 = S( FUNCTOR_$002B_2 ,  ATOM_past ,  ATOM_part );
        final static Functor ATOM_do = SYM("do");
        final static Functor ATOM_active = SYM("active");

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_rest_verb_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::rest_verb_9_var, fail_0, fail_0, FILE_chat_parser::rest_verb_9_var, fail_0, fail_0); 
    }

    private final static Operation rest_verb_9_var(Prolog m) { 
        m.jtry(9, null, FILE_chat_parser::rest_verb_9_var_1);
        return rest_verb_9_1(m);
    }

    private final static Operation rest_verb_9_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::rest_verb_9_var_2);
        return rest_verb_9_2(m);
    }

    private final static Operation rest_verb_9_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::rest_verb_9_var_3);
        return rest_verb_9_3(m);
    }

    private final static Operation rest_verb_9_var_3(Prolog m) { 
        m.trust(null);
        return rest_verb_9_4(m);
    }

    private final static Operation rest_verb_9_1(Prolog m) { 
    // rest_verb(aux,have,A,B,[perf|C],D,E,F,G):-verb_form(H,past+part,I,J,D,K,F,L),have(H,A,B,C,K,E,L,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
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
    // rest_verb(aux,have,A,B,[perf|C],D,E,F,G):-[verb_form(H,past+part,I,J,D,K,F,L),have(H,A,B,C,K,E,L,G)]
        if (!  ATOM_aux .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_have .unify(a2, m.trail))
            return m.fail();
        a5 = a5.dref();
        if (a5 .isCons()){
                        if (!  ATOM_perf .unify(a5.car(), m.trail))
                return m.fail();
            a10 = a5.cdr();
        } else if (a5.isVar()){
            a10 = m.mkvar2();
             a5.bind(CONS( ATOM_perf , a10), m.trail);
        } else {
            return m.fail();
        }
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        return //
 Op("verb_form", FILE_chat_parser::PRED_verb_form_8_static_exec, VA(a11, L_rest_verb_9_s8, m.DONT_CARE2(), m.DONT_CARE2(), a6, a12, a8, a13), //
 Op("have", FILE_chat_parser::PRED_have_8_static_exec, VA(a11, a3, a4, a10, a12, a7, a13, a9), cont));
    }

    private final static Operation rest_verb_9_2(Prolog m) { 
    // rest_verb(aux,be,A,B,C,D,E,F,G):-verb_form(H,I,J,K,D,L,F,M),be(I,H,A,B,C,L,E,M,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
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
    // rest_verb(aux,be,A,B,C,D,E,F,G):-[verb_form(H,I,J,K,D,L,F,M),be(I,H,A,B,C,L,E,M,G)]
        if (!  ATOM_aux .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_be .unify(a2, m.trail))
            return m.fail();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        return //
 Op("verb_form", FILE_chat_parser::PRED_verb_form_8_static_exec, VA(a10, a11, m.DONT_CARE2(), m.DONT_CARE2(), a6, a12, a8, a13), //
 Op("be", FILE_chat_parser::PRED_be_9_static_exec, VA(a11, a10, a3, a4, a5, a12, a7, a13, a9), cont));
    }

    private final static Operation rest_verb_9_3(Prolog m) { 
    // rest_verb(aux,do,A,active,[],B,C,D,E):-verb_form(A,inf,F,G,B,C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // rest_verb(aux,do,A,active,[],B,C,D,E):-[verb_form(A,inf,F,G,B,C,D,E)]
        if (!  ATOM_aux .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_do .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_active .unify(a4, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a5, m.trail))
            return m.fail();
        return //
 Op("verb_form", FILE_chat_parser::PRED_verb_form_8_static_exec, VA(a3,  ATOM_inf , m.DONT_CARE2(), m.DONT_CARE2(), a6, a7, a8, a9), cont);
    }

    private final static Operation rest_verb_9_4(Prolog m) { 
    // rest_verb(main,A,A,active,[],B,B,C,C):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // rest_verb(main,A,A,active,[],B,B,C,C):-[]
        if (!  ATOM_main .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_active .unify(a4, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a5, m.trail))
            return m.fail();
        if (! a6.unify(a7, m.trail))
            return m.fail();
        if (! a8.unify(a9, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: have/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(have/8,public)

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_have_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::have_8_var, FILE_chat_parser::have_8_2, FILE_chat_parser::have_8_2, FILE_chat_parser::have_8_var, FILE_chat_parser::have_8_2, FILE_chat_parser::have_8_2); 
    }

    private final static Operation have_8_var(Prolog m) { 
        m.jtry8(null, FILE_chat_parser::have_8_var_1);
        return have_8_1(m);
    }

    private final static Operation have_8_var_1(Prolog m) { 
        m.trust(null);
        return have_8_2(m);
    }

    private final static Operation have_8_1(Prolog m) { 
    // have(be,A,B,C,D,E,F,G):-verb_form(H,I,J,K,D,L,F,M),be(I,H,A,B,C,L,E,M,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
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
    // have(be,A,B,C,D,E,F,G):-[verb_form(H,I,J,K,D,L,F,M),be(I,H,A,B,C,L,E,M,G)]
        if (!  ATOM_be .unify(a1, m.trail))
            return m.fail();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        return //
 Op("verb_form", FILE_chat_parser::PRED_verb_form_8_static_exec, VA(a9, a10, m.DONT_CARE2(), m.DONT_CARE2(), a5, a11, a7, a12), //
 Op("be", FILE_chat_parser::PRED_be_9_static_exec, VA(a10, a9, a2, a3, a4, a11, a6, a12, a8), cont));
    }

    private final static Operation have_8_2(Prolog m) { 
    // have(A,A,active,[],B,B,C,C):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
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
    // have(A,A,active,[],B,B,C,C):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_active .unify(a3, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a4, m.trail))
            return m.fail();
        if (! a5.unify(a6, m.trail))
            return m.fail();
        if (! a7.unify(a8, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: be/9
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(be/9,public)
    private static final Compound L_be_9_s5 = S( FUNCTOR_$002B_2 ,  ATOM_past ,  ATOM_part );
        final static Functor ATOM_passive = SYM("passive");
    private static final Compound L_be_9_s10 = S( FUNCTOR_$002B_2 ,  ATOM_pres ,  ATOM_part );
        final static Functor ATOM_prog = SYM("prog");
    private static final Compound L_be_9_s12 = CONS( ATOM_prog ,  Prolog.Nil );

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_be_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::be_9_var, fail_0, fail_0, fail_0, FILE_chat_parser::be_9_var, fail_0); 
    }

    private final static Operation be_9_var(Prolog m) { 
        m.jtry(9, null, FILE_chat_parser::be_9_var_1);
        return be_9_1(m);
    }

    private final static Operation be_9_var_1(Prolog m) { 
        m.trust(null);
        return be_9_2(m);
    }

    private final static Operation be_9_1(Prolog m) { 
    // be(past+part,A,A,passive,[],B,B,C,C):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // be(past+part,A,A,passive,[],B,B,C,C):-[]
        if (! L_be_9_s5.unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_passive .unify(a4, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a5, m.trail))
            return m.fail();
        if (! a6.unify(a7, m.trail))
            return m.fail();
        if (! a8.unify(a9, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation be_9_2(Prolog m) { 
    // be(pres+part,A,B,C,[prog],D,E,F,G):-passive(A,B,C,D,E,F,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // be(pres+part,A,B,C,[prog],D,E,F,G):-[passive(A,B,C,D,E,F,G)]
        if (! L_be_9_s10.unify(a1, m.trail))
            return m.fail();
        if (! L_be_9_s12.unify(a5, m.trail))
            return m.fail();
        return //
 Op("passive", FILE_chat_parser::PRED_passive_7_static_exec, VA(a2, a3, a4, a6, a7, a8, a9), cont);
    }
/** PREDICATE: passive/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(passive/7,public)
    private static final Compound L_passive_7_s7 = S( FUNCTOR_$002B_2 ,  ATOM_past ,  ATOM_part );

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_passive_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::passive_7_var, FILE_chat_parser::passive_7_2, FILE_chat_parser::passive_7_2, FILE_chat_parser::passive_7_var, FILE_chat_parser::passive_7_2, FILE_chat_parser::passive_7_2); 
    }

    private final static Operation passive_7_var(Prolog m) { 
        m.jtry7(null, FILE_chat_parser::passive_7_var_1);
        return passive_7_1(m);
    }

    private final static Operation passive_7_var_1(Prolog m) { 
        m.trust(null);
        return passive_7_2(m);
    }

    private final static Operation passive_7_1(Prolog m) { 
    // passive(be,A,passive,B,C,D,E):-verb_form(A,past+part,F,G,B,C,D,E),verb_type(A,H),passive(H)
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
    // passive(be,A,passive,B,C,D,E):-[verb_form(A,past+part,F,G,B,C,D,E),verb_type(A,H),passive(H)]
        if (!  ATOM_be .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_passive .unify(a3, m.trail))
            return m.fail();
        a8 = m.mkvar1();
        return //
 Op("verb_form", FILE_chat_parser::PRED_verb_form_8_static_exec, VA(a2, L_passive_7_s7, m.DONT_CARE2(), m.DONT_CARE2(), a4, a5, a6, a7), //
 Op("verb_type", FILE_chat_parser::PRED_verb_type_2_static_exec, VA(a2, a8), //
 Op("passive", FILE_chat_parser::PRED_passive_1_static_exec, VA(a8), cont)));
    }

    private final static Operation passive_7_2(Prolog m) { 
    // passive(A,A,active,B,B,C,C):-true
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
    // passive(A,A,active,B,B,C,C):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_active .unify(a3, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        if (! a6.unify(a7, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: participle/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(participle/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_participle_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // participle(verb(A,B,inf,C,D),E,B,F,G,H,I):-neg(J,D,F,K,H,L),verb_form(A,M,N,O,K,G,L,I),participle(M,B,C),verb_type(A,E)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
    // participle(verb(A,B,inf,C,D),E,B,F,G,H,I):-[neg(J,D,F,K,H,L),verb_form(A,M,N,O,K,G,L,I),participle(M,B,C),verb_type(A,E)]
        a1 = a1.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_verb_5 , m.trail, a8, a9,  ATOM_inf , a10, a11)){
                return m.fail();
            }
        if (! a9.unify(a3, m.trail))
            return m.fail();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        return //
 Op("neg", FILE_chat_parser::PRED_neg_6_static_exec, VA(m.DONT_CARE2(), a11, a4, a12, a6, a13), //
 Op("verb_form", FILE_chat_parser::PRED_verb_form_8_static_exec, VA(a8, a14, m.DONT_CARE2(), m.DONT_CARE2(), a12, a5, a13, a7), //
 Op("participle", FILE_chat_parser::PRED_participle_3_static_exec, VA(a14, a9, a10), //
 Op("verb_type", FILE_chat_parser::PRED_verb_type_2_static_exec, VA(a8, a2), cont))));
    }
/** PREDICATE: passive/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(passive/1,public)
        final static Functor ATOM_trans = SYM("trans");
        final static Functor ATOM_ditrans = SYM("ditrans");




    public static Operation PRED_passive_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::passive_1_var, fail_0, fail_0, fail_0, FILE_chat_parser::passive_1_var, fail_0); 
    }

    private final static Operation passive_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::passive_1_var_1);
        return passive_1_1(m);
    }

    private final static Operation passive_1_var_1(Prolog m) { 
        m.trust(null);
        return passive_1_2(m);
    }

    private final static Operation passive_1_1(Prolog m) { 
    // passive(A+trans):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // passive(A+trans):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$002B_2 , m.trail, m.DONT_CARE1(),  ATOM_trans )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation passive_1_2(Prolog m) { 
    // passive(A+ditrans):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // passive(A+ditrans):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$002B_2 , m.trail, m.DONT_CARE1(),  ATOM_ditrans )){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: participle/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(participle/3,public)
    private static final Compound L_participle_3_s5 = S( FUNCTOR_$002B_2 ,  ATOM_pres ,  ATOM_part );
    private static final Compound L_participle_3_s9 = CONS( ATOM_prog ,  Prolog.Nil );
    private static final Compound L_participle_3_s12 = S( FUNCTOR_$002B_2 ,  ATOM_past ,  ATOM_part );




    public static Operation PRED_participle_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::participle_3_var, fail_0, fail_0, fail_0, FILE_chat_parser::participle_3_var, fail_0); 
    }

    private final static Operation participle_3_var(Prolog m) { 
        m.jtry3(null, FILE_chat_parser::participle_3_var_1);
        return participle_3_1(m);
    }

    private final static Operation participle_3_var_1(Prolog m) { 
        m.trust(null);
        return participle_3_2(m);
    }

    private final static Operation participle_3_1(Prolog m) { 
    // participle(pres+part,active,[prog]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // participle(pres+part,active,[prog]):-[]
        if (! L_participle_3_s5.unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_active .unify(a2, m.trail))
            return m.fail();
        if (! L_participle_3_s9.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation participle_3_2(Prolog m) { 
    // participle(past+part,passive,[]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // participle(past+part,passive,[]):-[]
        if (! L_participle_3_s12.unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_passive .unify(a2, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: close/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(close/4,public)
        final static Functor ATOM_close = SYM("close");




    public static Operation PRED_close_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // close(A,A,B,C):-virtual(close,B,C)
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // close(A,A,B,C):-[virtual(close,B,C)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        return //
 Op("virtual", FILE_chat_parser::PRED_virtual_3_static_exec, VA( ATOM_close , a3, a4), cont);
    }
/** PREDICATE: myopen/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(myopen/4,public)




    public static Operation PRED_myopen_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // myopen(A,A,B,x(gap,nonterminal,close,B)):-true
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // myopen(A,A,B,x(gap,nonterminal,close,B)):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_x_4 , m.trail,  ATOM_gap ,  ATOM_nonterminal ,  ATOM_close , a3)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: verb_args/9
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(verb_args/9,public)
        final static Functor FUNCTOR_arg_2 = F("arg",2);
        final static Functor ATOM_dir = SYM("dir");
        final static Functor ATOM_np = SYM("np");
        final static Functor ATOM_void = SYM("void");
    private static final Compound L_verb_args_9_s11 = CONS( ATOM_void ,  Prolog.Nil );
        final static Functor ATOM_predicate = SYM("predicate");

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_verb_args_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::verb_args_9_var, FILE_chat_parser::verb_args_9_8, FILE_chat_parser::verb_args_9_8, FILE_chat_parser::verb_args_9_con, FILE_chat_parser::verb_args_9_str, FILE_chat_parser::verb_args_9_8); 
    }

    private final static Operation verb_args_9_var(Prolog m) { 
        m.jtry(9, null, FILE_chat_parser::verb_args_9_var_1);
        return verb_args_9_1(m);
    }

    private final static Operation verb_args_9_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_args_9_var_2);
        return verb_args_9_2(m);
    }

    private final static Operation verb_args_9_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_args_9_var_3);
        return verb_args_9_3(m);
    }

    private final static Operation verb_args_9_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_args_9_var_4);
        return verb_args_9_4(m);
    }

    private final static Operation verb_args_9_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_args_9_var_5);
        return verb_args_9_5(m);
    }

    private final static Operation verb_args_9_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_args_9_var_6);
        return verb_args_9_6(m);
    }

    private final static Operation verb_args_9_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_args_9_var_7);
        return verb_args_9_7(m);
    }

    private final static Operation verb_args_9_var_7(Prolog m) { 
        m.trust(null);
        return verb_args_9_8(m);
    }

    private final static Operation verb_args_9_con(Prolog m) { 
        m.jtry(9, null, FILE_chat_parser::verb_args_9_con_1);
        return verb_args_9_2(m);
    }

    private final static Operation verb_args_9_con_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_args_9_con_2);
        return verb_args_9_3(m);
    }

    private final static Operation verb_args_9_con_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_args_9_con_3);
        return verb_args_9_4(m);
    }

    private final static Operation verb_args_9_con_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_args_9_con_4);
        return verb_args_9_5(m);
    }

    private final static Operation verb_args_9_con_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_args_9_con_5);
        return verb_args_9_6(m);
    }

    private final static Operation verb_args_9_con_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_args_9_con_6);
        return verb_args_9_7(m);
    }

    private final static Operation verb_args_9_con_6(Prolog m) { 
        m.trust(null);
        return verb_args_9_8(m);
    }

    private final static Operation verb_args_9_str(Prolog m) { 
        m.jtry(9, null, FILE_chat_parser::verb_args_9_str_1);
        return verb_args_9_1(m);
    }

    private final static Operation verb_args_9_str_1(Prolog m) { 
        m.trust(null);
        return verb_args_9_8(m);
    }

    private final static Operation verb_args_9_1(Prolog m) { 
    // verb_args(A+B,C,D,E,F,G,H,I,J):-advs(D,K,L,G,M,I,N),verb_args(B,C,K,E,F,M,H,N,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
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
    // verb_args(A+B,C,D,E,F,G,H,I,J):-[advs(D,K,L,G,M,I,N),verb_args(B,C,K,E,F,M,H,N,J)]
        a1 = a1.dref();
            a10 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002B_2 , m.trail, m.DONT_CARE1(), a10)){
                return m.fail();
            }
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        return //
 Op("advs", FILE_chat_parser::PRED_advs_7_static_exec, VA(a3, a11, m.DONT_CARE2(), a6, a12, a8, a13), //
 Op("verb_args", FILE_chat_parser::PRED_verb_args_9_static_exec, VA(a10, a2, a11, a4, a5, a12, a7, a13, a9), cont));
    }

    private final static Operation verb_args_9_2(Prolog m) { 
    // verb_args(trans,active,[arg(dir,A)],B,C,D,E,F,G):-verb_arg(np,A,C,D,E,F,G)
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
    // verb_args(trans,active,[arg(dir,A)],B,C,D,E,F,G):-[verb_arg(np,A,C,D,E,F,G)]
        if (!  ATOM_trans .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_active .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a10 = a3.car();
            if (!  Prolog.Nil .unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
            a10 = m.mkvar2();
             a3.bind(CONS(a10,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
            a11 = m.mkvar2();
            if (!a10.unifyS( FUNCTOR_arg_2 , m.trail,  ATOM_dir , a11)){
                return m.fail();
            }
        return //
 Op("verb_arg", FILE_chat_parser::PRED_verb_arg_7_static_exec, VA( ATOM_np , a11, a5, a6, a7, a8, a9), cont);
    }

    private final static Operation verb_args_9_3(Prolog m) { 
    // verb_args(ditrans,A,[arg(B,C)|D],E,F,G,H,I,J):-verb_arg(np,C,K,G,L,I,M),object(B,D,K,F,L,H,M,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
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
    // verb_args(ditrans,A,[arg(B,C)|D],E,F,G,H,I,J):-[verb_arg(np,C,K,G,L,I,M),object(B,D,K,F,L,H,M,J)]
        if (!  ATOM_ditrans .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a10 = a3.car();
            a11 = a3.cdr();
        } else if (a3.isVar()){
            a10 = m.mkvar2();
            a11 = m.mkvar2();
             a3.bind(CONS(a10, a11), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            if (!a10.unifyS( FUNCTOR_arg_2 , m.trail, a12, a13)){
                return m.fail();
            }
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        return //
 Op("verb_arg", FILE_chat_parser::PRED_verb_arg_7_static_exec, VA( ATOM_np , a13, a14, a6, a15, a8, a16), //
 Op("object", FILE_chat_parser::PRED_object_8_static_exec, VA(a12, a11, a14, a5, a15, a7, a16, a9), cont));
    }

    private final static Operation verb_args_9_4(Prolog m) { 
    // verb_args(be,A,[void],B,B,C,D,E,F):-terminal(there,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // verb_args(be,A,[void],B,B,C,D,E,F):-[terminal(there,C,D,E,F)]
        if (!  ATOM_be .unify(a1, m.trail))
            return m.fail();
        if (! L_verb_args_9_s11.unify(a3, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA( ATOM_there , a6, a7, a8, a9), cont);
    }

    private final static Operation verb_args_9_5(Prolog m) { 
    // verb_args(be,A,[arg(predicate,B)],C,D,E,F,G,H):-pred_conj(I,B,D,E,F,G,H)
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
    // verb_args(be,A,[arg(predicate,B)],C,D,E,F,G,H):-[pred_conj(I,B,D,E,F,G,H)]
        if (!  ATOM_be .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a10 = a3.car();
            if (!  Prolog.Nil .unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
            a10 = m.mkvar2();
             a3.bind(CONS(a10,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
            a11 = m.mkvar2();
            if (!a10.unifyS( FUNCTOR_arg_2 , m.trail,  ATOM_predicate , a11)){
                return m.fail();
            }
        return //
 Op("pred_conj", FILE_chat_parser::PRED_pred_conj_7_static_exec, VA(m.DONT_CARE2(), a11, a5, a6, a7, a8, a9), cont);
    }

    private final static Operation verb_args_9_6(Prolog m) { 
    // verb_args(be,A,[arg(dir,B)],C,D,E,F,G,H):-verb_arg(np,B,D,E,F,G,H)
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
    // verb_args(be,A,[arg(dir,B)],C,D,E,F,G,H):-[verb_arg(np,B,D,E,F,G,H)]
        if (!  ATOM_be .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a10 = a3.car();
            if (!  Prolog.Nil .unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
            a10 = m.mkvar2();
             a3.bind(CONS(a10,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
            a11 = m.mkvar2();
            if (!a10.unifyS( FUNCTOR_arg_2 , m.trail,  ATOM_dir , a11)){
                return m.fail();
            }
        return //
 Op("verb_arg", FILE_chat_parser::PRED_verb_arg_7_static_exec, VA( ATOM_np , a11, a5, a6, a7, a8, a9), cont);
    }

    private final static Operation verb_args_9_7(Prolog m) { 
    // verb_args(have,active,[arg(dir,A)],B,C,D,E,F,G):-verb_arg(np,A,C,D,E,F,G)
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
    // verb_args(have,active,[arg(dir,A)],B,C,D,E,F,G):-[verb_arg(np,A,C,D,E,F,G)]
        if (!  ATOM_have .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_active .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a10 = a3.car();
            if (!  Prolog.Nil .unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
            a10 = m.mkvar2();
             a3.bind(CONS(a10,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a10 = a10.dref();
            a11 = m.mkvar2();
            if (!a10.unifyS( FUNCTOR_arg_2 , m.trail,  ATOM_dir , a11)){
                return m.fail();
            }
        return //
 Op("verb_arg", FILE_chat_parser::PRED_verb_arg_7_static_exec, VA( ATOM_np , a11, a5, a6, a7, a8, a9), cont);
    }

    private final static Operation verb_args_9_8(Prolog m) { 
    // verb_args(A,B,[],C,C,D,D,E,E):-no_args(A)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // verb_args(A,B,[],C,C,D,D,E,E):-[no_args(A)]
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        if (! a6.unify(a7, m.trail))
            return m.fail();
        if (! a8.unify(a9, m.trail))
            return m.fail();
        return //
 Op("no_args", FILE_chat_parser::PRED_no_args_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: object/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(object/8,public)

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_object_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // object(A,B,C,D,E,F,G,H):-adv(I),minus(I,C,J),advs(B,K,J,E,L,G,M),obj(A,K,C,D,L,F,M,H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
        a8 = LARG[7];
    // object(A,B,C,D,E,F,G,H):-[adv(I),minus(I,C,J),advs(B,K,J,E,L,G,M),obj(A,K,C,D,L,F,M,H)]
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        return //
 Op("adv", FILE_chat_parser::PRED_adv_1_static_exec, VA(a9), //
 Op("minus", FILE_chat_parser::PRED_minus_3_static_exec, VA(a9, a3, a10), //
 Op("advs", FILE_chat_parser::PRED_advs_7_static_exec, VA(a2, a11, a10, a5, a12, a7, a13), //
 Op("obj", FILE_chat_parser::PRED_obj_8_static_exec, VA(a1, a11, a3, a4, a12, a6, a13, a8), cont))));
    }
/** PREDICATE: obj/8
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(obj/8,public)
        final static Functor ATOM_ind = SYM("ind");

    // private final Term arg5, arg6, arg7, arg8;




    public static Operation PRED_obj_8_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::obj_8_var, fail_0, fail_0, FILE_chat_parser::obj_8_var, fail_0, fail_0); 
    }

    private final static Operation obj_8_var(Prolog m) { 
        m.jtry8(null, FILE_chat_parser::obj_8_var_1);
        return obj_8_1(m);
    }

    private final static Operation obj_8_var_1(Prolog m) { 
        m.trust(null);
        return obj_8_2(m);
    }

    private final static Operation obj_8_1(Prolog m) { 
    // obj(ind,[arg(dir,A)],B,C,D,E,F,G):-verb_arg(np,A,C,D,E,F,G)
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
    // obj(ind,[arg(dir,A)],B,C,D,E,F,G):-[verb_arg(np,A,C,D,E,F,G)]
        if (!  ATOM_ind .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        a9 = a2.car();
            if (!  Prolog.Nil .unify(a2.cdr(), m.trail))
                return m.fail();
        } else if (a2.isVar()){
            a9 = m.mkvar2();
             a2.bind(CONS(a9,  Prolog.Nil ), m.trail);
        } else {
            return m.fail();
        }
        a9 = a9.dref();
            a10 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_arg_2 , m.trail,  ATOM_dir , a10)){
                return m.fail();
            }
        return //
 Op("verb_arg", FILE_chat_parser::PRED_verb_arg_7_static_exec, VA( ATOM_np , a10, a4, a5, a6, a7, a8), cont);
    }

    private final static Operation obj_8_2(Prolog m) { 
    // obj(dir,[],A,A,B,B,C,C):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8;
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
    // obj(dir,[],A,A,B,B,C,C):-[]
        if (!  ATOM_dir .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        if (! a5.unify(a6, m.trail))
            return m.fail();
        if (! a7.unify(a8, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: pred_conj/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(pred_conj/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_pred_conj_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // pred_conj(A,B,C,D,E,F,G):-predicate(H,I,J,D,K,F,L),pred_rest(A,I,B,J,C,K,E,L,G)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
    // pred_conj(A,B,C,D,E,F,G):-[predicate(H,I,J,D,K,F,L),pred_rest(A,I,B,J,C,K,E,L,G)]
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        return //
 Op("predicate", FILE_chat_parser::PRED_predicate_7_static_exec, VA(m.DONT_CARE2(), a8, a9, a4, a10, a6, a11), //
 Op("pred_rest", FILE_chat_parser::PRED_pred_rest_9_static_exec, VA(a1, a8, a2, a9, a3, a10, a5, a11, a7), cont));
    }
/** PREDICATE: pred_rest/9
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(pred_rest/9,public)

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_pred_rest_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry(9, null, FILE_chat_parser::pred_rest_9_sub_1);
        return pred_rest_9_1(m);
    }

    private final static Operation pred_rest_9_sub_1(Prolog m) { 
        m.trust(null);
        return pred_rest_9_2(m);
    }

    private final static Operation pred_rest_9_1(Prolog m) { 
    // pred_rest(A,B,C,D,E,F,G,H,I):-conj(A,J,B,K,C,F,L,H,M),pred_conj(J,K,E,L,G,M,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
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
    // pred_rest(A,B,C,D,E,F,G,H,I):-[conj(A,J,B,K,C,F,L,H,M),pred_conj(J,K,E,L,G,M,I)]
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        return //
 Op("conj", FILE_chat_parser::PRED_conj_9_static_exec, VA(a1, a10, a2, a11, a3, a6, a12, a8, a13), //
 Op("pred_conj", FILE_chat_parser::PRED_pred_conj_7_static_exec, VA(a10, a11, a5, a12, a7, a13, a9), cont));
    }

    private final static Operation pred_rest_9_2(Prolog m) { 
    // pred_rest(A,B,B,C,C,D,D,E,E):-true
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
    // pred_rest(A,B,B,C,C,D,D,E,E):-[]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        if (! a6.unify(a7, m.trail))
            return m.fail();
        if (! a8.unify(a9, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: verb_arg/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(verb_arg/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_verb_arg_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // verb_arg(np,A,B,C,D,E,F):-s_all(G),verb_case(H),np(A,I,H,J,compl,G,B,C,D,E,F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
    // verb_arg(np,A,B,C,D,E,F):-[s_all(G),verb_case(H),np(A,I,H,J,compl,G,B,C,D,E,F)]
        if (!  ATOM_np .unify(a1, m.trail))
            return m.fail();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op("s_all", FILE_chat_parser::PRED_s_all_1_static_exec, VA(a8), //
 Op("verb_case", FILE_chat_parser::PRED_verb_case_1_static_exec, VA(a9), //
 Op("np", FILE_chat_parser::PRED_np_11_static_exec, VA(a2, m.DONT_CARE2(), a9, m.DONT_CARE2(),  ATOM_compl , a8, a3, a4, a5, a6, a7), cont)));
    }
/** PREDICATE: advs/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(advs/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_advs_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::advs_7_var, FILE_chat_parser::advs_7_2, FILE_chat_parser::advs_7_2, FILE_chat_parser::advs_7_2, FILE_chat_parser::advs_7_2, FILE_chat_parser::advs_7_var); 
    }

    private final static Operation advs_7_var(Prolog m) { 
        m.jtry7(null, FILE_chat_parser::advs_7_var_1);
        return advs_7_1(m);
    }

    private final static Operation advs_7_var_1(Prolog m) { 
        m.trust(null);
        return advs_7_2(m);
    }

    private final static Operation advs_7_1(Prolog m) { 
    // advs([A|B],C,D,E,F,G,H):-is_adv(D),adverb(A,E,I,G,J),advs(B,C,D,I,F,J,H)
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
        cont = m.cont;
    // advs([A|B],C,D,E,F,G,H):-[is_adv(D),adverb(A,E,I,G,J),advs(B,C,D,I,F,J,H)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a8 = a1.car();
            a9 = a1.cdr();
        } else if (a1.isVar()){
            a8 = m.mkvar2();
            a9 = m.mkvar2();
             a1.bind(CONS(a8, a9), m.trail);
        } else {
            return m.fail();
        }
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        return //
 Op("is_adv", FILE_chat_parser::PRED_is_adv_1_static_exec, VA(a3), //
 Op("adverb", FILE_chat_parser::PRED_adverb_5_static_exec, VA(a8, a4, a10, a6, a11), //
 Op("advs", FILE_chat_parser::PRED_advs_7_static_exec, VA(a9, a2, a3, a10, a5, a11, a7), cont)));
    }

    private final static Operation advs_7_2(Prolog m) { 
    // advs(A,A,B,C,C,D,D):-true
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
    // advs(A,A,B,C,C,D,D):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (! a4.unify(a5, m.trail))
            return m.fail();
        if (! a6.unify(a7, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: adj_phrase/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(adj_phrase/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_adj_phrase_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_chat_parser::adj_phrase_6_sub_1);
        return adj_phrase_6_1(m);
    }

    private final static Operation adj_phrase_6_sub_1(Prolog m) { 
        m.trust(null);
        return adj_phrase_6_2(m);
    }

    private final static Operation adj_phrase_6_1(Prolog m) { 
    // adj_phrase(A,B,C,D,E,F):-adj(G,A,C,D,E,F),empty(B)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // adj_phrase(A,B,C,D,E,F):-[adj(G,A,C,D,E,F),empty(B)]
        return //
 Op("adj", FILE_chat_parser::PRED_adj_6_static_exec, VA(m.DONT_CARE2(), a1, a3, a4, a5, a6), //
 Op("empty", FILE_chat_parser::PRED_empty_1_static_exec, VA(a2), cont));
    }

    private final static Operation adj_phrase_6_2(Prolog m) { 
    // adj_phrase(A,B,C,D,E,F):-comp_phrase(A,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // adj_phrase(A,B,C,D,E,F):-[comp_phrase(A,B,C,D,E,F)]
        return //
 Op("comp_phrase", FILE_chat_parser::PRED_comp_phrase_6_static_exec, VA(a1, a2, a3, a4, a5, a6), cont);
    }
/** PREDICATE: no_args/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(no_args/1,public)
        final static Functor ATOM_intrans = SYM("intrans");




    public static Operation PRED_no_args_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::no_args_1_var, fail_0, fail_0, FILE_chat_parser::no_args_1_var, fail_0, fail_0); 
    }

    private final static Operation no_args_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::no_args_1_var_1);
        return no_args_1_1(m);
    }

    private final static Operation no_args_1_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::no_args_1_var_2);
        return no_args_1_2(m);
    }

    private final static Operation no_args_1_var_2(Prolog m) { 
        m.trust(null);
        return no_args_1_3(m);
    }

    private final static Operation no_args_1_1(Prolog m) { 
    // no_args(trans):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // no_args(trans):-[]
        if (!  ATOM_trans .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation no_args_1_2(Prolog m) { 
    // no_args(ditrans):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // no_args(ditrans):-[]
        if (!  ATOM_ditrans .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation no_args_1_3(Prolog m) { 
    // no_args(intrans):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // no_args(intrans):-[]
        if (!  ATOM_intrans .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: conj/9
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(conj/9,public)
        final static Functor FUNCTOR_conj_2 = F("conj",2);
        final static Functor FUNCTOR_conj_3 = F("conj",3);

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_conj_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // conj(conj(A,B),conj(A,C),D,E,conj(A,D,E),F,G,H,I):-conj(A,B,C,F,G,H,I)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
        a8 = LARG[7];
        a9 = LARG[8];
    // conj(conj(A,B),conj(A,C),D,E,conj(A,D,E),F,G,H,I):-[conj(A,B,C,F,G,H,I)]
        a1 = a1.dref();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_conj_2 , m.trail, a10, a11)){
                return m.fail();
            }
        a2 = a2.dref();
            a12 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_conj_2 , m.trail, a10, a12)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_conj_3 , m.trail, a10, a3, a4)){
                return m.fail();
            }
        return //
 Op("conj", FILE_chat_parser::PRED_conj_7_static_exec, VA(a10, a11, a12, a6, a7, a8, a9), cont);
    }
/** PREDICATE: noun/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(noun/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_noun_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // noun(A,B,C,D,E,F):-terminal(G,C,D,E,F),noun_form(G,A,B)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // noun(A,B,C,D,E,F):-[terminal(G,C,D,E,F),noun_form(G,A,B)]
        a7 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a7, a3, a4, a5, a6), //
 Op("noun_form", FILE_chat_parser::PRED_noun_form_3_static_exec, VA(a7, a1, a2), cont));
    }
/** PREDICATE: adj/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(adj/6,public)
        final static Functor FUNCTOR_adj_1 = F("adj",1);

    // private final Term arg5, arg6;




    public static Operation PRED_adj_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // adj(A,adj(B),C,D,E,F):-terminal(B,C,D,E,F),adj(B,A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // adj(A,adj(B),C,D,E,F):-[terminal(B,C,D,E,F),adj(B,A)]
        a2 = a2.dref();
            a7 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_adj_1 , m.trail, a7)){
                return m.fail();
            }
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a7, a3, a4, a5, a6), //
 Op("adj", FILE_chat_parser::PRED_adj_2_static_exec, VA(a7, a1), cont));
    }
/** PREDICATE: prep/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(prep/5,public)

    // private final Term arg5;




    public static Operation PRED_prep_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // prep(prep(A),B,C,D,E):-terminal(A,B,C,D,E),prep(A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // prep(prep(A),B,C,D,E):-[terminal(A,B,C,D,E),prep(A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_prep_1 , m.trail, a6)){
                return m.fail();
            }
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a6, a2, a3, a4, a5), //
 Op("prep", FILE_chat_parser::PRED_prep_1_static_exec, VA(a6), cont));
    }
/** PREDICATE: rel_adj/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(rel_adj/5,public)

    // private final Term arg5;




    public static Operation PRED_rel_adj_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rel_adj(adj(A),B,C,D,E):-terminal(F,B,C,D,E),rel_adj(F,A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // rel_adj(adj(A),B,C,D,E):-[terminal(F,B,C,D,E),rel_adj(F,A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_adj_1 , m.trail, a6)){
                return m.fail();
            }
        a7 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a7, a2, a3, a4, a5), //
 Op("rel_adj", FILE_chat_parser::PRED_rel_adj_2_static_exec, VA(a7, a6), cont));
    }
/** PREDICATE: sup_adj/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(sup_adj/5,public)

    // private final Term arg5;




    public static Operation PRED_sup_adj_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // sup_adj(adj(A),B,C,D,E):-terminal(F,B,C,D,E),sup_adj(F,A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // sup_adj(adj(A),B,C,D,E):-[terminal(F,B,C,D,E),sup_adj(F,A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_adj_1 , m.trail, a6)){
                return m.fail();
            }
        a7 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a7, a2, a3, a4, a5), //
 Op("sup_adj", FILE_chat_parser::PRED_sup_adj_2_static_exec, VA(a7, a6), cont));
    }
/** PREDICATE: comp_adv/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(comp_adv/5,public)

    // private final Term arg5;




    public static Operation PRED_comp_adv_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::comp_adv_5_var, fail_0, fail_0, FILE_chat_parser::comp_adv_5_var, fail_0, fail_0); 
    }

    private final static Operation comp_adv_5_var(Prolog m) { 
        m.jtry5(null, FILE_chat_parser::comp_adv_5_var_1);
        return comp_adv_5_1(m);
    }

    private final static Operation comp_adv_5_var_1(Prolog m) { 
        m.trust(null);
        return comp_adv_5_2(m);
    }

    private final static Operation comp_adv_5_1(Prolog m) { 
    // comp_adv(less,A,B,C,D):- ~(less,A,B,C,D)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // comp_adv(less,A,B,C,D):-[~(less,A,B,C,D)]
        if (!  ATOM_less .unify(a1, m.trail))
            return m.fail();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_less , a2, a3, a4, a5), cont);
    }

    private final static Operation comp_adv_5_2(Prolog m) { 
    // comp_adv(more,A,B,C,D):- ~(more,A,B,C,D)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // comp_adv(more,A,B,C,D):-[~(more,A,B,C,D)]
        if (!  ATOM_more .unify(a1, m.trail))
            return m.fail();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_more , a2, a3, a4, a5), cont);
    }
/** PREDICATE: sup_adv/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(sup_adv/5,public)

    // private final Term arg5;




    public static Operation PRED_sup_adv_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::sup_adv_5_var, fail_0, fail_0, FILE_chat_parser::sup_adv_5_var, fail_0, fail_0); 
    }

    private final static Operation sup_adv_5_var(Prolog m) { 
        m.jtry5(null, FILE_chat_parser::sup_adv_5_var_1);
        return sup_adv_5_1(m);
    }

    private final static Operation sup_adv_5_var_1(Prolog m) { 
        m.trust(null);
        return sup_adv_5_2(m);
    }

    private final static Operation sup_adv_5_1(Prolog m) { 
    // sup_adv(least,A,B,C,D):- ~(least,A,B,C,D)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // sup_adv(least,A,B,C,D):-[~(least,A,B,C,D)]
        if (!  ATOM_least .unify(a1, m.trail))
            return m.fail();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_least , a2, a3, a4, a5), cont);
    }

    private final static Operation sup_adv_5_2(Prolog m) { 
    // sup_adv(most,A,B,C,D):- ~(most,A,B,C,D)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // sup_adv(most,A,B,C,D):-[~(most,A,B,C,D)]
        if (!  ATOM_most .unify(a1, m.trail))
            return m.fail();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_most , a2, a3, a4, a5), cont);
    }
/** PREDICATE: rel_pron/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(rel_pron/5,public)

    // private final Term arg5;




    public static Operation PRED_rel_pron_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // rel_pron(A,B,C,D,E):-terminal(F,B,C,D,E),rel_pron(F,A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // rel_pron(A,B,C,D,E):-[terminal(F,B,C,D,E),rel_pron(F,A)]
        a6 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a6, a2, a3, a4, a5), //
 Op("rel_pron", FILE_chat_parser::PRED_rel_pron_2_static_exec, VA(a6, a1), cont));
    }
/** PREDICATE: name/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(name/5,public)

    // private final Term arg5;




    public static Operation PRED_name_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // name(A,B,C,D,E):-opt_the(B,F,D,G),terminal(A,F,C,G,E),name(A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // name(A,B,C,D,E):-[opt_the(B,F,D,G),terminal(A,F,C,G,E),name(A)]
        a6 = m.mkvar1();
        a7 = m.mkvar1();
        return //
 Op("opt_the", FILE_chat_parser::PRED_opt_the_4_static_exec, VA(a2, a6, a4, a7), //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a1, a6, a3, a7, a5), //
 Op("name", FILE_chat_parser::PRED_name_1_static_exec, VA(a1), cont)));
    }
/** PREDICATE: int_art/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(int_art/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_int_art_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_chat_parser::int_art_7_sub_1);
        return int_art_7_1(m);
    }

    private final static Operation int_art_7_sub_1(Prolog m) { 
        m.trust(null);
        return int_art_7_2(m);
    }

    private final static Operation int_art_7_1(Prolog m) { 
    // int_art(A,plu,quant(same,wh(A)),B,C,D,E):- ~(how,B,F,D,G),~(many,F,C,G,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
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
    // int_art(A,plu,quant(same,wh(A)),B,C,D,E):-[~(how,B,F,D,G),~(many,F,C,G,E)]
        if (!  ATOM_plu .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
            a8 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_quant_2 , m.trail,  ATOM_same , a8)){
                return m.fail();
            }
        a8 = a8.dref();
            if (!a8.unifyS( FUNCTOR_wh_1 , m.trail, a1)){
                return m.fail();
            }
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_how , a4, a9, a6, a10), //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_many , a9, a5, a10, a7), cont));
    }

    private final static Operation int_art_7_2(Prolog m) { 
    // int_art(A,B,C,D,E,F,G):-terminal(H,D,E,F,G),int_art(H,A,B,C)
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
        cont = m.cont;
    // int_art(A,B,C,D,E,F,G):-[terminal(H,D,E,F,G),int_art(H,A,B,C)]
        a8 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a8, a4, a5, a6, a7), //
 Op("int_art", FILE_chat_parser::PRED_int_art_4_static_exec, VA(a8, a1, a2, a3), cont));
    }
/** PREDICATE: int_pron/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(int_pron/5,public)

    // private final Term arg5;




    public static Operation PRED_int_pron_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // int_pron(A,B,C,D,E):-terminal(F,B,C,D,E),int_pron(F,A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // int_pron(A,B,C,D,E):-[terminal(F,B,C,D,E),int_pron(F,A)]
        a6 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a6, a2, a3, a4, a5), //
 Op("int_pron", FILE_chat_parser::PRED_int_pron_2_static_exec, VA(a6, a1), cont));
    }
/** PREDICATE: adverb/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(adverb/5,public)
        final static Functor FUNCTOR_adv_1 = F("adv",1);

    // private final Term arg5;




    public static Operation PRED_adverb_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // adverb(adv(A),B,C,D,E):-terminal(A,B,C,D,E),adverb(A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // adverb(adv(A),B,C,D,E):-[terminal(A,B,C,D,E),adverb(A)]
        a1 = a1.dref();
            a6 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_adv_1 , m.trail, a6)){
                return m.fail();
            }
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a6, a2, a3, a4, a5), //
 Op("adverb", FILE_chat_parser::PRED_adverb_1_static_exec, VA(a6), cont));
    }
/** PREDICATE: poss_pron/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(poss_pron/6,public)
        final static Functor FUNCTOR_pronoun_1 = F("pronoun",1);

    // private final Term arg5, arg6;




    public static Operation PRED_poss_pron_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // poss_pron(pronoun(A),B+C,D,E,F,G):-terminal(H,D,E,F,G),poss_pron(H,A,B,C)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // poss_pron(pronoun(A),B+C,D,E,F,G):-[terminal(H,D,E,F,G),poss_pron(H,A,B,C)]
        a1 = a1.dref();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_pronoun_1 , m.trail, a7)){
                return m.fail();
            }
        a2 = a2.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002B_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a10 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a10, a3, a4, a5, a6), //
 Op("poss_pron", FILE_chat_parser::PRED_poss_pron_4_static_exec, VA(a10, a7, a8, a9), cont));
    }
/** PREDICATE: pers_pron/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(pers_pron/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_pers_pron_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // pers_pron(pronoun(A),B+C,D,E,F,G,H):-terminal(I,E,F,G,H),pers_pron(I,A,B,C,D)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
    // pers_pron(pronoun(A),B+C,D,E,F,G,H):-[terminal(I,E,F,G,H),pers_pron(I,A,B,C,D)]
        a1 = a1.dref();
            a8 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_pronoun_1 , m.trail, a8)){
                return m.fail();
            }
        a2 = a2.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_$002B_2 , m.trail, a9, a10)){
                return m.fail();
            }
        a11 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a11, a4, a5, a6, a7), //
 Op("pers_pron", FILE_chat_parser::PRED_pers_pron_5_static_exec, VA(a11, a8, a9, a10, a3), cont));
    }
/** PREDICATE: quantifier_pron/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(quantifier_pron/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_quantifier_pron_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // quantifier_pron(A,B,C,D,E,F):-terminal(G,C,D,E,F),quantifier_pron(G,A,B)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // quantifier_pron(A,B,C,D,E,F):-[terminal(G,C,D,E,F),quantifier_pron(G,A,B)]
        a7 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a7, a3, a4, a5, a6), //
 Op("quantifier_pron", FILE_chat_parser::PRED_quantifier_pron_3_static_exec, VA(a7, a1, a2), cont));
    }
/** PREDICATE: context_pron/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(context_pron/6,public)
    private static final Compound L_context_pron_6_s4 = S( FUNCTOR_prep_1 ,  ATOM_in );
        final static Functor ATOM_place = SYM("place");
    private static final Compound L_context_pron_6_s9 = S( FUNCTOR_prep_1 ,  ATOM_at );
        final static Functor ATOM_time = SYM("time");
        final static Functor ATOM_when = SYM("when");

    // private final Term arg5, arg6;




    public static Operation PRED_context_pron_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::context_pron_6_var, fail_0, fail_0, fail_0, FILE_chat_parser::context_pron_6_var, fail_0); 
    }

    private final static Operation context_pron_6_var(Prolog m) { 
        m.jtry6(null, FILE_chat_parser::context_pron_6_var_1);
        return context_pron_6_1(m);
    }

    private final static Operation context_pron_6_var_1(Prolog m) { 
        m.trust(null);
        return context_pron_6_2(m);
    }

    private final static Operation context_pron_6_1(Prolog m) { 
    // context_pron(prep(in),place,A,B,C,D):- ~(where,A,B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // context_pron(prep(in),place,A,B,C,D):-[~(where,A,B,C,D)]
        if (! L_context_pron_6_s4.unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_place .unify(a2, m.trail))
            return m.fail();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_where , a3, a4, a5, a6), cont);
    }

    private final static Operation context_pron_6_2(Prolog m) { 
    // context_pron(prep(at),time,A,B,C,D):- ~(when,A,B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // context_pron(prep(at),time,A,B,C,D):-[~(when,A,B,C,D)]
        if (! L_context_pron_6_s9.unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_time .unify(a2, m.trail))
            return m.fail();
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_when , a3, a4, a5, a6), cont);
    }
/** PREDICATE: number/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(number/6,public)
        final static Functor FUNCTOR_nb_1 = F("nb",1);

    // private final Term arg5, arg6;




    public static Operation PRED_number_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // number(nb(A),B,C,D,E,F):-terminal(G,C,D,E,F),number(G,A,B)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // number(nb(A),B,C,D,E,F):-[terminal(G,C,D,E,F),number(G,A,B)]
        a1 = a1.dref();
            a7 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_nb_1 , m.trail, a7)){
                return m.fail();
            }
        a8 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a8, a3, a4, a5, a6), //
 Op("number", FILE_chat_parser::PRED_number_3_static_exec, VA(a8, a7, a2), cont));
    }
/** PREDICATE: terminator/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(terminator/5,public)

    // private final Term arg5;




    public static Operation PRED_terminator_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // terminator(A,B,C,D,E):-terminal(F,B,C,D,E),terminator(F,A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // terminator(A,B,C,D,E):-[terminal(F,B,C,D,E),terminator(F,A)]
        a6 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a6, a2, a3, a4, a5), //
 Op("terminator", FILE_chat_parser::PRED_terminator_2_static_exec, VA(a6, a1), cont));
    }
/** PREDICATE: opt_the/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(opt_the/4,public)




    public static Operation PRED_opt_the_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_chat_parser::opt_the_4_sub_1);
        return opt_the_4_1(m);
    }

    private final static Operation opt_the_4_sub_1(Prolog m) { 
        m.trust(null);
        return opt_the_4_2(m);
    }

    private final static Operation opt_the_4_1(Prolog m) { 
    // opt_the(A,A,B,B):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // opt_the(A,A,B,B):-[]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (! a3.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation opt_the_4_2(Prolog m) { 
    // opt_the(A,B,C,D):- ~(the,A,B,C,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // opt_the(A,B,C,D):-[~(the,A,B,C,D)]
        return //
 Op("~", FILE_chat_parser::PRED_$007E_5_static_exec, VA( ATOM_the , a1, a2, a3, a4), cont);
    }
/** PREDICATE: conj/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(conj/7,public)
        final static Functor ATOM_list = SYM("list");
        final static Functor ATOM_end = SYM("end");

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_conj_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry7(null, FILE_chat_parser::conj_7_sub_1);
        return conj_7_1(m);
    }

    private final static Operation conj_7_sub_1(Prolog m) { 
        m.trust(null);
        return conj_7_2(m);
    }

    private final static Operation conj_7_1(Prolog m) { 
    // conj(A,list,list,B,C,D,E):-terminal(',',B,C,D,E)
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
    // conj(A,list,list,B,C,D,E):-[terminal(',',B,C,D,E)]
        if (!  ATOM_list .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_list .unify(a3, m.trail))
            return m.fail();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA( ATOM_$002C , a4, a5, a6, a7), cont);
    }

    private final static Operation conj_7_2(Prolog m) { 
    // conj(A,list,end,B,C,D,E):-terminal(A,B,C,D,E),conj(A)
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
    // conj(A,list,end,B,C,D,E):-[terminal(A,B,C,D,E),conj(A)]
        if (!  ATOM_list .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_end .unify(a3, m.trail))
            return m.fail();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a1, a4, a5, a6, a7), //
 Op("conj", FILE_chat_parser::PRED_conj_1_static_exec, VA(a1), cont));
    }
/** PREDICATE: loc_pred/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(loc_pred/5,public)

    // private final Term arg5;




    public static Operation PRED_loc_pred_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // loc_pred(A,B,C,D,E):-terminal(F,B,C,D,E),loc_pred(F,A)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // loc_pred(A,B,C,D,E):-[terminal(F,B,C,D,E),loc_pred(F,A)]
        a6 = m.mkvar1();
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a6, a2, a3, a4, a5), //
 Op("loc_pred", FILE_chat_parser::PRED_loc_pred_2_static_exec, VA(a6, a1), cont));
    }
/** PREDICATE: ~ / 5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(~ / 5,public)

    // private final Term arg5;




    public static Operation PRED_$007E_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // ~(A,B,C,D,E):-terminal(A,B,C,D,E),~(A)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // ~(A,B,C,D,E):-[terminal(A,B,C,D,E),~(A)]
        return //
 Op("terminal", FILE_chat_parser::PRED_terminal_5_static_exec, VA(a1, a2, a3, a4, a5), //
 Op("~", FILE_chat_parser::PRED_$007E_1_static_exec, VA(a1), cont));
    }
/** PREDICATE: word/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(word/1,public)




    public static Operation PRED_word_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_chat_parser::word_1_sub_1);
        return word_1_1(m);
    }

    private final static Operation word_1_sub_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_2);
        return word_1_2(m);
    }

    private final static Operation word_1_sub_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_3);
        return word_1_3(m);
    }

    private final static Operation word_1_sub_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_4);
        return word_1_4(m);
    }

    private final static Operation word_1_sub_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_5);
        return word_1_5(m);
    }

    private final static Operation word_1_sub_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_6);
        return word_1_6(m);
    }

    private final static Operation word_1_sub_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_7);
        return word_1_7(m);
    }

    private final static Operation word_1_sub_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_8);
        return word_1_8(m);
    }

    private final static Operation word_1_sub_8(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_9);
        return word_1_9(m);
    }

    private final static Operation word_1_sub_9(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_10);
        return word_1_10(m);
    }

    private final static Operation word_1_sub_10(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_11);
        return word_1_11(m);
    }

    private final static Operation word_1_sub_11(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_12);
        return word_1_12(m);
    }

    private final static Operation word_1_sub_12(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_13);
        return word_1_13(m);
    }

    private final static Operation word_1_sub_13(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_14);
        return word_1_14(m);
    }

    private final static Operation word_1_sub_14(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_15);
        return word_1_15(m);
    }

    private final static Operation word_1_sub_15(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_16);
        return word_1_16(m);
    }

    private final static Operation word_1_sub_16(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_17);
        return word_1_17(m);
    }

    private final static Operation word_1_sub_17(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_18);
        return word_1_18(m);
    }

    private final static Operation word_1_sub_18(Prolog m) { 
        m.retry(null, FILE_chat_parser::word_1_sub_19);
        return word_1_19(m);
    }

    private final static Operation word_1_sub_19(Prolog m) { 
        m.trust(null);
        return word_1_20(m);
    }

    private final static Operation word_1_1(Prolog m) { 
    // word(A):- ~(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[~(A)]
        return //
 Op("~", FILE_chat_parser::PRED_$007E_1_static_exec, VA(a1), cont);
    }

    private final static Operation word_1_2(Prolog m) { 
    // word(A):-conj(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[conj(A)]
        return //
 Op("conj", FILE_chat_parser::PRED_conj_1_static_exec, VA(a1), cont);
    }

    private final static Operation word_1_3(Prolog m) { 
    // word(A):-adverb(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[adverb(A)]
        return //
 Op("adverb", FILE_chat_parser::PRED_adverb_1_static_exec, VA(a1), cont);
    }

    private final static Operation word_1_4(Prolog m) { 
    // word(A):-sup_adj(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[sup_adj(A,B)]
        return //
 Op("sup_adj", FILE_chat_parser::PRED_sup_adj_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_5(Prolog m) { 
    // word(A):-rel_adj(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[rel_adj(A,B)]
        return //
 Op("rel_adj", FILE_chat_parser::PRED_rel_adj_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_6(Prolog m) { 
    // word(A):-adj(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[adj(A,B)]
        return //
 Op("adj", FILE_chat_parser::PRED_adj_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_7(Prolog m) { 
    // word(A):-name(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[name(A)]
        return //
 Op("name", FILE_chat_parser::PRED_name_1_static_exec, VA(a1), cont);
    }

    private final static Operation word_1_8(Prolog m) { 
    // word(A):-terminator(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[terminator(A,B)]
        return //
 Op("terminator", FILE_chat_parser::PRED_terminator_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_9(Prolog m) { 
    // word(A):-pers_pron(A,B,C,D,E)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[pers_pron(A,B,C,D,E)]
        return //
 Op("pers_pron", FILE_chat_parser::PRED_pers_pron_5_static_exec, VA(a1, m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_10(Prolog m) { 
    // word(A):-poss_pron(A,B,C,D)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[poss_pron(A,B,C,D)]
        return //
 Op("poss_pron", FILE_chat_parser::PRED_poss_pron_4_static_exec, VA(a1, m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_11(Prolog m) { 
    // word(A):-rel_pron(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[rel_pron(A,B)]
        return //
 Op("rel_pron", FILE_chat_parser::PRED_rel_pron_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_12(Prolog m) { 
    // word(A):-verb_form(A,B,C,D)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[verb_form(A,B,C,D)]
        return //
 Op("verb_form", FILE_chat_parser::PRED_verb_form_4_static_exec, VA(a1, m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_13(Prolog m) { 
    // word(A):-noun_form(A,B,C)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[noun_form(A,B,C)]
        return //
 Op("noun_form", FILE_chat_parser::PRED_noun_form_3_static_exec, VA(a1, m.DONT_CARE2(), m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_14(Prolog m) { 
    // word(A):-prep(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[prep(A)]
        return //
 Op("prep", FILE_chat_parser::PRED_prep_1_static_exec, VA(a1), cont);
    }

    private final static Operation word_1_15(Prolog m) { 
    // word(A):-quantifier_pron(A,B,C)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[quantifier_pron(A,B,C)]
        return //
 Op("quantifier_pron", FILE_chat_parser::PRED_quantifier_pron_3_static_exec, VA(a1, m.DONT_CARE2(), m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_16(Prolog m) { 
    // word(A):-number(A,B,C)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[number(A,B,C)]
        return //
 Op("number", FILE_chat_parser::PRED_number_3_static_exec, VA(a1, m.DONT_CARE2(), m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_17(Prolog m) { 
    // word(A):-det(A,B,C,D)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[det(A,B,C,D)]
        return //
 Op("det", FILE_chat_parser::PRED_det_4_static_exec, VA(a1, m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_18(Prolog m) { 
    // word(A):-int_art(A,B,C,D)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[int_art(A,B,C,D)]
        return //
 Op("int_art", FILE_chat_parser::PRED_int_art_4_static_exec, VA(a1, m.DONT_CARE2(), m.DONT_CARE2(), m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_19(Prolog m) { 
    // word(A):-int_pron(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[int_pron(A,B)]
        return //
 Op("int_pron", FILE_chat_parser::PRED_int_pron_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }

    private final static Operation word_1_20(Prolog m) { 
    // word(A):-loc_pred(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // word(A):-[loc_pred(A,B)]
        return //
 Op("loc_pred", FILE_chat_parser::PRED_loc_pred_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }
/** PREDICATE: ~ / 1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(~ / 1,public)




    public static Operation PRED_$007E_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::$007E_1_var, fail_0, fail_0, FILE_chat_parser::$007E_1_var, fail_0, fail_0); 
    }

    private final static Operation $007E_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::$007E_1_var_1);
        return $007E_1_1(m);
    }

    private final static Operation $007E_1_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_2);
        return $007E_1_2(m);
    }

    private final static Operation $007E_1_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_3);
        return $007E_1_3(m);
    }

    private final static Operation $007E_1_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_4);
        return $007E_1_4(m);
    }

    private final static Operation $007E_1_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_5);
        return $007E_1_5(m);
    }

    private final static Operation $007E_1_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_6);
        return $007E_1_6(m);
    }

    private final static Operation $007E_1_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_7);
        return $007E_1_7(m);
    }

    private final static Operation $007E_1_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_8);
        return $007E_1_8(m);
    }

    private final static Operation $007E_1_var_8(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_9);
        return $007E_1_9(m);
    }

    private final static Operation $007E_1_var_9(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_10);
        return $007E_1_10(m);
    }

    private final static Operation $007E_1_var_10(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_11);
        return $007E_1_11(m);
    }

    private final static Operation $007E_1_var_11(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_12);
        return $007E_1_12(m);
    }

    private final static Operation $007E_1_var_12(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_13);
        return $007E_1_13(m);
    }

    private final static Operation $007E_1_var_13(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_14);
        return $007E_1_14(m);
    }

    private final static Operation $007E_1_var_14(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_15);
        return $007E_1_15(m);
    }

    private final static Operation $007E_1_var_15(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_16);
        return $007E_1_16(m);
    }

    private final static Operation $007E_1_var_16(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_17);
        return $007E_1_17(m);
    }

    private final static Operation $007E_1_var_17(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_18);
        return $007E_1_18(m);
    }

    private final static Operation $007E_1_var_18(Prolog m) { 
        m.retry(null, FILE_chat_parser::$007E_1_var_19);
        return $007E_1_19(m);
    }

    private final static Operation $007E_1_var_19(Prolog m) { 
        m.trust(null);
        return $007E_1_20(m);
    }

    private final static Operation $007E_1_1(Prolog m) { 
    // ~(how):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(how):-[]
        if (!  ATOM_how .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_2(Prolog m) { 
    // ~(whose):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(whose):-[]
        if (!  ATOM_whose .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_3(Prolog m) { 
    // ~(there):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(there):-[]
        if (!  ATOM_there .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_4(Prolog m) { 
    // ~(of):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(of):-[]
        if (!  ATOM_of .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_5(Prolog m) { 
    // ~(~):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(~):-[]
        if (!  ATOM_$007E .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_6(Prolog m) { 
    // ~(','):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(','):-[]
        if (!  ATOM_$002C .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_7(Prolog m) { 
    // ~(s):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(s):-[]
        if (!  ATOM_s .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_8(Prolog m) { 
    // ~(than):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(than):-[]
        if (!  ATOM_than .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_9(Prolog m) { 
    // ~(at):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(at):-[]
        if (!  ATOM_at .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_10(Prolog m) { 
    // ~(the):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(the):-[]
        if (!  ATOM_the .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_11(Prolog m) { 
    // ~(not):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(not):-[]
        if (!  ATOM_not .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_12(Prolog m) { 
    // ~(as):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(as):-[]
        if (!  ATOM_as .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_13(Prolog m) { 
    // ~(that):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(that):-[]
        if (!  ATOM_that .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_14(Prolog m) { 
    // ~(less):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(less):-[]
        if (!  ATOM_less .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_15(Prolog m) { 
    // ~(more):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(more):-[]
        if (!  ATOM_more .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_16(Prolog m) { 
    // ~(least):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(least):-[]
        if (!  ATOM_least .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_17(Prolog m) { 
    // ~(most):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(most):-[]
        if (!  ATOM_most .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_18(Prolog m) { 
    // ~(many):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(many):-[]
        if (!  ATOM_many .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_19(Prolog m) { 
    // ~(where):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(where):-[]
        if (!  ATOM_where .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation $007E_1_20(Prolog m) { 
    // ~(when):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ~(when):-[]
        if (!  ATOM_when .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: conj/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(conj/1,public)
        final static Functor ATOM_or = SYM("or");




    public static Operation PRED_conj_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::conj_1_var, fail_0, fail_0, FILE_chat_parser::conj_1_var, fail_0, fail_0); 
    }

    private final static Operation conj_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::conj_1_var_1);
        return conj_1_1(m);
    }

    private final static Operation conj_1_var_1(Prolog m) { 
        m.trust(null);
        return conj_1_2(m);
    }

    private final static Operation conj_1_1(Prolog m) { 
    // conj(and):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // conj(and):-[]
        if (!  ATOM_and .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation conj_1_2(Prolog m) { 
    // conj(or):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // conj(or):-[]
        if (!  ATOM_or .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: int_pron/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(int_pron/2,public)
        final static Functor ATOM_who = SYM("who");
        final static Functor ATOM_whom = SYM("whom");




    public static Operation PRED_int_pron_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::int_pron_2_var, fail_0, fail_0, FILE_chat_parser::int_pron_2_var, fail_0, fail_0); 
    }

    private final static Operation int_pron_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::int_pron_2_var_1);
        return int_pron_2_1(m);
    }

    private final static Operation int_pron_2_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::int_pron_2_var_2);
        return int_pron_2_2(m);
    }

    private final static Operation int_pron_2_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::int_pron_2_var_3);
        return int_pron_2_3(m);
    }

    private final static Operation int_pron_2_var_3(Prolog m) { 
        m.trust(null);
        return int_pron_2_4(m);
    }

    private final static Operation int_pron_2_1(Prolog m) { 
    // int_pron(what,undef):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // int_pron(what,undef):-[]
        if (!  ATOM_what .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_undef .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation int_pron_2_2(Prolog m) { 
    // int_pron(which,undef):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // int_pron(which,undef):-[]
        if (!  ATOM_which .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_undef .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation int_pron_2_3(Prolog m) { 
    // int_pron(who,subj):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // int_pron(who,subj):-[]
        if (!  ATOM_who .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_subj .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation int_pron_2_4(Prolog m) { 
    // int_pron(whom,compl):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // int_pron(whom,compl):-[]
        if (!  ATOM_whom .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_compl .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: int_art/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(int_art/4,public)




    public static Operation PRED_int_art_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::int_art_4_var, fail_0, fail_0, FILE_chat_parser::int_art_4_var, fail_0, fail_0); 
    }

    private final static Operation int_art_4_var(Prolog m) { 
        m.jtry4(null, FILE_chat_parser::int_art_4_var_1);
        return int_art_4_1(m);
    }

    private final static Operation int_art_4_var_1(Prolog m) { 
        m.trust(null);
        return int_art_4_2(m);
    }

    private final static Operation int_art_4_1(Prolog m) { 
    // int_art(what,A,B,int_det(A)):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // int_art(what,A,B,int_det(A)):-[]
        if (!  ATOM_what .unify(a1, m.trail))
            return m.fail();
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_int_det_1 , m.trail, a2)){
                return m.fail();
            }
        return cont;
    }

    private final static Operation int_art_4_2(Prolog m) { 
    // int_art(which,A,B,int_det(A)):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // int_art(which,A,B,int_det(A)):-[]
        if (!  ATOM_which .unify(a1, m.trail))
            return m.fail();
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_int_det_1 , m.trail, a2)){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: det/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(det/4,public)
        final static Functor FUNCTOR_the_1 = F("the",1);
        final static Functor ATOM_an = SYM("an");
        final static Functor ATOM_every = SYM("every");
        final static Functor ATOM_all = SYM("all");
        final static Functor ATOM_no = SYM("no");




    public static Operation PRED_det_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::det_4_var, fail_0, fail_0, FILE_chat_parser::det_4_var, fail_0, fail_0); 
    }

    private final static Operation det_4_var(Prolog m) { 
        m.jtry4(null, FILE_chat_parser::det_4_var_1);
        return det_4_1(m);
    }

    private final static Operation det_4_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::det_4_var_2);
        return det_4_2(m);
    }

    private final static Operation det_4_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::det_4_var_3);
        return det_4_3(m);
    }

    private final static Operation det_4_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::det_4_var_4);
        return det_4_4(m);
    }

    private final static Operation det_4_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::det_4_var_5);
        return det_4_5(m);
    }

    private final static Operation det_4_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::det_4_var_6);
        return det_4_6(m);
    }

    private final static Operation det_4_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::det_4_var_7);
        return det_4_7(m);
    }

    private final static Operation det_4_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::det_4_var_8);
        return det_4_8(m);
    }

    private final static Operation det_4_var_8(Prolog m) { 
        m.trust(null);
        return det_4_9(m);
    }

    private final static Operation det_4_1(Prolog m) { 
    // det(the,A,the(A),def):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // det(the,A,the(A),def):-[]
        if (!  ATOM_the .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_the_1 , m.trail, a2)){
                return m.fail();
            }
        if (!  ATOM_def .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation det_4_2(Prolog m) { 
    // det(a,sin,a,indef):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // det(a,sin,a,indef):-[]
        if (!  ATOM_a .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_a .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_indef .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation det_4_3(Prolog m) { 
    // det(an,sin,a,indef):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // det(an,sin,a,indef):-[]
        if (!  ATOM_an .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_a .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_indef .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation det_4_4(Prolog m) { 
    // det(every,sin,every,indef):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // det(every,sin,every,indef):-[]
        if (!  ATOM_every .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_every .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_indef .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation det_4_5(Prolog m) { 
    // det(some,A,some,indef):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // det(some,A,some,indef):-[]
        if (!  ATOM_some .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_some .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_indef .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation det_4_6(Prolog m) { 
    // det(any,A,any,indef):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // det(any,A,any,indef):-[]
        if (!  ATOM_any .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_any .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_indef .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation det_4_7(Prolog m) { 
    // det(all,plu,all,indef):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // det(all,plu,all,indef):-[]
        if (!  ATOM_all .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_plu .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_all .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_indef .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation det_4_8(Prolog m) { 
    // det(each,sin,each,indef):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // det(each,sin,each,indef):-[]
        if (!  ATOM_each .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_each .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_indef .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation det_4_9(Prolog m) { 
    // det(no,A,no,indef):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // det(no,A,no,indef):-[]
        if (!  ATOM_no .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_no .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_indef .unify(a4, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: number/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(number/3,public)




    public static Operation PRED_number_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // number(A,B,C):-tr_number(A,B),ag_number(B,C)
        m.setB0();
         Term a1, a2, a3;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // number(A,B,C):-[tr_number(A,B),ag_number(B,C)]
        return //
 Op("tr_number", FILE_chat_parser::PRED_tr_number_2_static_exec, VA(a1, a2), //
 Op("ag_number", FILE_chat_parser::PRED_ag_number_2_static_exec, VA(a2, a3), cont));
    }
/** PREDICATE: tr_number/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(tr_number/2,public)
        final static Functor ATOM_three = SYM("three");
        final static Functor ATOM_four = SYM("four");
        final static Functor ATOM_five = SYM("five");
        final static Functor ATOM_six = SYM("six");
        final static Functor ATOM_seven = SYM("seven");
        final static Functor ATOM_eight = SYM("eight");
        final static Functor ATOM_nine = SYM("nine");
        final static Functor ATOM_ten = SYM("ten");




    public static Operation PRED_tr_number_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::tr_number_2_var, fail_0, fail_0, FILE_chat_parser::tr_number_2_con, FILE_chat_parser::tr_number_2_1, fail_0); 
    }

    private final static Operation tr_number_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::tr_number_2_var_1);
        return tr_number_2_1(m);
    }

    private final static Operation tr_number_2_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_var_2);
        return tr_number_2_2(m);
    }

    private final static Operation tr_number_2_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_var_3);
        return tr_number_2_3(m);
    }

    private final static Operation tr_number_2_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_var_4);
        return tr_number_2_4(m);
    }

    private final static Operation tr_number_2_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_var_5);
        return tr_number_2_5(m);
    }

    private final static Operation tr_number_2_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_var_6);
        return tr_number_2_6(m);
    }

    private final static Operation tr_number_2_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_var_7);
        return tr_number_2_7(m);
    }

    private final static Operation tr_number_2_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_var_8);
        return tr_number_2_8(m);
    }

    private final static Operation tr_number_2_var_8(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_var_9);
        return tr_number_2_9(m);
    }

    private final static Operation tr_number_2_var_9(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_var_10);
        return tr_number_2_10(m);
    }

    private final static Operation tr_number_2_var_10(Prolog m) { 
        m.trust(null);
        return tr_number_2_11(m);
    }

    private final static Operation tr_number_2_con(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::tr_number_2_con_1);
        return tr_number_2_2(m);
    }

    private final static Operation tr_number_2_con_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_con_2);
        return tr_number_2_3(m);
    }

    private final static Operation tr_number_2_con_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_con_3);
        return tr_number_2_4(m);
    }

    private final static Operation tr_number_2_con_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_con_4);
        return tr_number_2_5(m);
    }

    private final static Operation tr_number_2_con_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_con_5);
        return tr_number_2_6(m);
    }

    private final static Operation tr_number_2_con_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_con_6);
        return tr_number_2_7(m);
    }

    private final static Operation tr_number_2_con_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_con_7);
        return tr_number_2_8(m);
    }

    private final static Operation tr_number_2_con_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_con_8);
        return tr_number_2_9(m);
    }

    private final static Operation tr_number_2_con_8(Prolog m) { 
        m.retry(null, FILE_chat_parser::tr_number_2_con_9);
        return tr_number_2_10(m);
    }

    private final static Operation tr_number_2_con_9(Prolog m) { 
        m.trust(null);
        return tr_number_2_11(m);
    }

    private final static Operation tr_number_2_1(Prolog m) { 
    // tr_number(nb(A),A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // tr_number(nb(A),A):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_nb_1 , m.trail, a3)){
                return m.fail();
            }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation tr_number_2_2(Prolog m) { 
    // tr_number(one,1):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // tr_number(one,1):-[]
        if (!  ATOM_one .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation tr_number_2_3(Prolog m) { 
    // tr_number(two,2):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // tr_number(two,2):-[]
        if (!  ATOM_two .unify(a1, m.trail))
            return m.fail();
        if (!  int_2 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation tr_number_2_4(Prolog m) { 
    // tr_number(three,3):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // tr_number(three,3):-[]
        if (!  ATOM_three .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation tr_number_2_5(Prolog m) { 
    // tr_number(four,4):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // tr_number(four,4):-[]
        if (!  ATOM_four .unify(a1, m.trail))
            return m.fail();
        if (!  int_4 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation tr_number_2_6(Prolog m) { 
    // tr_number(five,5):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // tr_number(five,5):-[]
        if (!  ATOM_five .unify(a1, m.trail))
            return m.fail();
        if (!  int_5 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation tr_number_2_7(Prolog m) { 
    // tr_number(six,6):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // tr_number(six,6):-[]
        if (!  ATOM_six .unify(a1, m.trail))
            return m.fail();
        if (!  int_6 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation tr_number_2_8(Prolog m) { 
    // tr_number(seven,7):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // tr_number(seven,7):-[]
        if (!  ATOM_seven .unify(a1, m.trail))
            return m.fail();
        if (!  int_7 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation tr_number_2_9(Prolog m) { 
    // tr_number(eight,8):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // tr_number(eight,8):-[]
        if (!  ATOM_eight .unify(a1, m.trail))
            return m.fail();
        if (!  int_8 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation tr_number_2_10(Prolog m) { 
    // tr_number(nine,9):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // tr_number(nine,9):-[]
        if (!  ATOM_nine .unify(a1, m.trail))
            return m.fail();
        if (!  int_9 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation tr_number_2_11(Prolog m) { 
    // tr_number(ten,10):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // tr_number(ten,10):-[]
        if (!  ATOM_ten .unify(a1, m.trail))
            return m.fail();
        if (!  int_10 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: ag_number/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(ag_number/2,public)




    public static Operation PRED_ag_number_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::ag_number_2_var, FILE_chat_parser::ag_number_2_var, FILE_chat_parser::ag_number_2_2, FILE_chat_parser::ag_number_2_2, FILE_chat_parser::ag_number_2_2, FILE_chat_parser::ag_number_2_2); 
    }

    private final static Operation ag_number_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::ag_number_2_var_1);
        return ag_number_2_1(m);
    }

    private final static Operation ag_number_2_var_1(Prolog m) { 
        m.trust(null);
        return ag_number_2_2(m);
    }

    private final static Operation ag_number_2_1(Prolog m) { 
    // ag_number(1,sin):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // ag_number(1,sin):-[]
        if (!  int_1 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation ag_number_2_2(Prolog m) { 
    // ag_number(A,plu):-A>1
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // ag_number(A,plu):-[B is 1,'$greater_than'(A,B)]
        if (!  ATOM_plu .unify(a2, m.trail))
            return m.fail();
        a3 = m.mkvar1();
        //START inline expansion of a(3)is@(int_1)
        if (! a3.unify(Arithmetic.evaluate(int_1), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_than(a(1),a(3))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a3)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: quantifier_pron/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(quantifier_pron/3,public)
        final static Functor ATOM_everybody = SYM("everybody");
        final static Functor ATOM_person = SYM("person");
        final static Functor ATOM_everyone = SYM("everyone");
        final static Functor ATOM_everything = SYM("everything");
        final static Functor ATOM_thing = SYM("thing");
        final static Functor ATOM_somebody = SYM("somebody");
        final static Functor ATOM_someone = SYM("someone");
        final static Functor ATOM_something = SYM("something");
        final static Functor ATOM_anybody = SYM("anybody");
        final static Functor ATOM_anyone = SYM("anyone");
        final static Functor ATOM_anything = SYM("anything");
        final static Functor ATOM_nobody = SYM("nobody");
        final static Functor ATOM_nothing = SYM("nothing");




    public static Operation PRED_quantifier_pron_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::quantifier_pron_3_var, fail_0, fail_0, FILE_chat_parser::quantifier_pron_3_var, fail_0, fail_0); 
    }

    private final static Operation quantifier_pron_3_var(Prolog m) { 
        m.jtry3(null, FILE_chat_parser::quantifier_pron_3_var_1);
        return quantifier_pron_3_1(m);
    }

    private final static Operation quantifier_pron_3_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::quantifier_pron_3_var_2);
        return quantifier_pron_3_2(m);
    }

    private final static Operation quantifier_pron_3_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::quantifier_pron_3_var_3);
        return quantifier_pron_3_3(m);
    }

    private final static Operation quantifier_pron_3_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::quantifier_pron_3_var_4);
        return quantifier_pron_3_4(m);
    }

    private final static Operation quantifier_pron_3_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::quantifier_pron_3_var_5);
        return quantifier_pron_3_5(m);
    }

    private final static Operation quantifier_pron_3_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::quantifier_pron_3_var_6);
        return quantifier_pron_3_6(m);
    }

    private final static Operation quantifier_pron_3_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::quantifier_pron_3_var_7);
        return quantifier_pron_3_7(m);
    }

    private final static Operation quantifier_pron_3_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::quantifier_pron_3_var_8);
        return quantifier_pron_3_8(m);
    }

    private final static Operation quantifier_pron_3_var_8(Prolog m) { 
        m.retry(null, FILE_chat_parser::quantifier_pron_3_var_9);
        return quantifier_pron_3_9(m);
    }

    private final static Operation quantifier_pron_3_var_9(Prolog m) { 
        m.retry(null, FILE_chat_parser::quantifier_pron_3_var_10);
        return quantifier_pron_3_10(m);
    }

    private final static Operation quantifier_pron_3_var_10(Prolog m) { 
        m.trust(null);
        return quantifier_pron_3_11(m);
    }

    private final static Operation quantifier_pron_3_1(Prolog m) { 
    // quantifier_pron(everybody,every,person):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quantifier_pron(everybody,every,person):-[]
        if (!  ATOM_everybody .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_every .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_person .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation quantifier_pron_3_2(Prolog m) { 
    // quantifier_pron(everyone,every,person):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quantifier_pron(everyone,every,person):-[]
        if (!  ATOM_everyone .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_every .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_person .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation quantifier_pron_3_3(Prolog m) { 
    // quantifier_pron(everything,every,thing):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quantifier_pron(everything,every,thing):-[]
        if (!  ATOM_everything .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_every .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_thing .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation quantifier_pron_3_4(Prolog m) { 
    // quantifier_pron(somebody,some,person):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quantifier_pron(somebody,some,person):-[]
        if (!  ATOM_somebody .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_some .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_person .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation quantifier_pron_3_5(Prolog m) { 
    // quantifier_pron(someone,some,person):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quantifier_pron(someone,some,person):-[]
        if (!  ATOM_someone .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_some .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_person .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation quantifier_pron_3_6(Prolog m) { 
    // quantifier_pron(something,some,thing):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quantifier_pron(something,some,thing):-[]
        if (!  ATOM_something .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_some .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_thing .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation quantifier_pron_3_7(Prolog m) { 
    // quantifier_pron(anybody,any,person):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quantifier_pron(anybody,any,person):-[]
        if (!  ATOM_anybody .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_any .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_person .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation quantifier_pron_3_8(Prolog m) { 
    // quantifier_pron(anyone,any,person):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quantifier_pron(anyone,any,person):-[]
        if (!  ATOM_anyone .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_any .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_person .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation quantifier_pron_3_9(Prolog m) { 
    // quantifier_pron(anything,any,thing):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quantifier_pron(anything,any,thing):-[]
        if (!  ATOM_anything .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_any .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_thing .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation quantifier_pron_3_10(Prolog m) { 
    // quantifier_pron(nobody,no,person):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quantifier_pron(nobody,no,person):-[]
        if (!  ATOM_nobody .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_no .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_person .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation quantifier_pron_3_11(Prolog m) { 
    // quantifier_pron(nothing,no,thing):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // quantifier_pron(nothing,no,thing):-[]
        if (!  ATOM_nothing .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_no .unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_thing .unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: prep/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(prep/1,public)
        final static Functor ATOM_to = SYM("to");
        final static Functor ATOM_with = SYM("with");
        final static Functor ATOM_on = SYM("on");




    public static Operation PRED_prep_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::prep_1_var, fail_0, fail_0, FILE_chat_parser::prep_1_var, fail_0, fail_0); 
    }

    private final static Operation prep_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::prep_1_var_1);
        return prep_1_1(m);
    }

    private final static Operation prep_1_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::prep_1_var_2);
        return prep_1_2(m);
    }

    private final static Operation prep_1_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::prep_1_var_3);
        return prep_1_3(m);
    }

    private final static Operation prep_1_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::prep_1_var_4);
        return prep_1_4(m);
    }

    private final static Operation prep_1_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::prep_1_var_5);
        return prep_1_5(m);
    }

    private final static Operation prep_1_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::prep_1_var_6);
        return prep_1_6(m);
    }

    private final static Operation prep_1_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::prep_1_var_7);
        return prep_1_7(m);
    }

    private final static Operation prep_1_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::prep_1_var_8);
        return prep_1_8(m);
    }

    private final static Operation prep_1_var_8(Prolog m) { 
        m.retry(null, FILE_chat_parser::prep_1_var_9);
        return prep_1_9(m);
    }

    private final static Operation prep_1_var_9(Prolog m) { 
        m.retry(null, FILE_chat_parser::prep_1_var_10);
        return prep_1_10(m);
    }

    private final static Operation prep_1_var_10(Prolog m) { 
        m.trust(null);
        return prep_1_11(m);
    }

    private final static Operation prep_1_1(Prolog m) { 
    // prep(as):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // prep(as):-[]
        if (!  ATOM_as .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation prep_1_2(Prolog m) { 
    // prep(at):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // prep(at):-[]
        if (!  ATOM_at .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation prep_1_3(Prolog m) { 
    // prep(of):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // prep(of):-[]
        if (!  ATOM_of .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation prep_1_4(Prolog m) { 
    // prep(to):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // prep(to):-[]
        if (!  ATOM_to .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation prep_1_5(Prolog m) { 
    // prep(by):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // prep(by):-[]
        if (!  ATOM_by .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation prep_1_6(Prolog m) { 
    // prep(with):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // prep(with):-[]
        if (!  ATOM_with .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation prep_1_7(Prolog m) { 
    // prep(in):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // prep(in):-[]
        if (!  ATOM_in .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation prep_1_8(Prolog m) { 
    // prep(on):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // prep(on):-[]
        if (!  ATOM_on .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation prep_1_9(Prolog m) { 
    // prep(from):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // prep(from):-[]
        if (!  ATOM_from .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation prep_1_10(Prolog m) { 
    // prep(into):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // prep(into):-[]
        if (!  ATOM_into .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation prep_1_11(Prolog m) { 
    // prep(through):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // prep(through):-[]
        if (!  ATOM_through .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: noun_form/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(noun_form/3,public)
        final static Functor ATOM_proportion = SYM("proportion");
        final static Functor ATOM_percentage = SYM("percentage");




    public static Operation PRED_noun_form_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::noun_form_3_var, FILE_chat_parser::noun_form_3_int, FILE_chat_parser::noun_form_3_int, FILE_chat_parser::noun_form_3_var, FILE_chat_parser::noun_form_3_int, FILE_chat_parser::noun_form_3_int); 
    }

    private final static Operation noun_form_3_var(Prolog m) { 
        m.jtry3(null, FILE_chat_parser::noun_form_3_var_1);
        return noun_form_3_1(m);
    }

    private final static Operation noun_form_3_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_form_3_var_2);
        return noun_form_3_2(m);
    }

    private final static Operation noun_form_3_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_form_3_var_3);
        return noun_form_3_3(m);
    }

    private final static Operation noun_form_3_var_3(Prolog m) { 
        m.trust(null);
        return noun_form_3_4(m);
    }

    private final static Operation noun_form_3_int(Prolog m) { 
        m.jtry3(null, FILE_chat_parser::noun_form_3_int_1);
        return noun_form_3_1(m);
    }

    private final static Operation noun_form_3_int_1(Prolog m) { 
        m.trust(null);
        return noun_form_3_2(m);
    }

    private final static Operation noun_form_3_1(Prolog m) { 
    // noun_form(A,B,plu):-noun_plu(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // noun_form(A,B,plu):-[noun_plu(A,B)]
        if (!  ATOM_plu .unify(a3, m.trail))
            return m.fail();
        return //
 Op("noun_plu", FILE_chat_parser::PRED_noun_plu_2_static_exec, VA(a1, a2), cont);
    }

    private final static Operation noun_form_3_2(Prolog m) { 
    // noun_form(A,A,sin):-noun_sin(A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // noun_form(A,A,sin):-[noun_sin(A)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a3, m.trail))
            return m.fail();
        return //
 Op("noun_sin", FILE_chat_parser::PRED_noun_sin_1_static_exec, VA(a1), cont);
    }

    private final static Operation noun_form_3_3(Prolog m) { 
    // noun_form(proportion,proportion,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // noun_form(proportion,proportion,A):-[]
        if (!  ATOM_proportion .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_proportion .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_form_3_4(Prolog m) { 
    // noun_form(percentage,percentage,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // noun_form(percentage,percentage,A):-[]
        if (!  ATOM_percentage .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_percentage .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: root_form/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(root_form/1,public)
    private static final Compound L_root_form_1_s5 = S( FUNCTOR_$002B_2 ,  int_1 ,  ATOM_sin );
    private static final Compound L_root_form_1_s9 = S( FUNCTOR_$002B_2 ,  int_1 ,  ATOM_plu );
    private static final Compound L_root_form_1_s12 = S( FUNCTOR_$002B_2 ,  int_3 ,  ATOM_plu );




    public static Operation PRED_root_form_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::root_form_1_var, fail_0, fail_0, fail_0, FILE_chat_parser::root_form_1_var, fail_0); 
    }

    private final static Operation root_form_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::root_form_1_var_1);
        return root_form_1_1(m);
    }

    private final static Operation root_form_1_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::root_form_1_var_2);
        return root_form_1_2(m);
    }

    private final static Operation root_form_1_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::root_form_1_var_3);
        return root_form_1_3(m);
    }

    private final static Operation root_form_1_var_3(Prolog m) { 
        m.trust(null);
        return root_form_1_4(m);
    }

    private final static Operation root_form_1_1(Prolog m) { 
    // root_form(1+sin):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // root_form(1+sin):-[]
        if (! L_root_form_1_s5.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation root_form_1_2(Prolog m) { 
    // root_form(2+A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // root_form(2+A):-[]
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_$002B_2 , m.trail,  int_2 , m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation root_form_1_3(Prolog m) { 
    // root_form(1+plu):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // root_form(1+plu):-[]
        if (! L_root_form_1_s9.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation root_form_1_4(Prolog m) { 
    // root_form(3+plu):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // root_form(3+plu):-[]
        if (! L_root_form_1_s12.unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: verb_root/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(verb_root/1,public)
        final static Functor ATOM_contain = SYM("contain");
        final static Functor ATOM_drain = SYM("drain");
        final static Functor ATOM_exceed = SYM("exceed");
        final static Functor ATOM_rise = SYM("rise");




    public static Operation PRED_verb_root_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::verb_root_1_var, fail_0, fail_0, FILE_chat_parser::verb_root_1_var, fail_0, fail_0); 
    }

    private final static Operation verb_root_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::verb_root_1_var_1);
        return verb_root_1_1(m);
    }

    private final static Operation verb_root_1_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_root_1_var_2);
        return verb_root_1_2(m);
    }

    private final static Operation verb_root_1_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_root_1_var_3);
        return verb_root_1_3(m);
    }

    private final static Operation verb_root_1_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_root_1_var_4);
        return verb_root_1_4(m);
    }

    private final static Operation verb_root_1_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_root_1_var_5);
        return verb_root_1_5(m);
    }

    private final static Operation verb_root_1_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_root_1_var_6);
        return verb_root_1_6(m);
    }

    private final static Operation verb_root_1_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_root_1_var_7);
        return verb_root_1_7(m);
    }

    private final static Operation verb_root_1_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_root_1_var_8);
        return verb_root_1_8(m);
    }

    private final static Operation verb_root_1_var_8(Prolog m) { 
        m.trust(null);
        return verb_root_1_9(m);
    }

    private final static Operation verb_root_1_1(Prolog m) { 
    // verb_root(be):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // verb_root(be):-[]
        if (!  ATOM_be .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_root_1_2(Prolog m) { 
    // verb_root(have):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // verb_root(have):-[]
        if (!  ATOM_have .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_root_1_3(Prolog m) { 
    // verb_root(do):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // verb_root(do):-[]
        if (!  ATOM_do .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_root_1_4(Prolog m) { 
    // verb_root(border):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // verb_root(border):-[]
        if (!  ATOM_border .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_root_1_5(Prolog m) { 
    // verb_root(contain):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // verb_root(contain):-[]
        if (!  ATOM_contain .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_root_1_6(Prolog m) { 
    // verb_root(drain):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // verb_root(drain):-[]
        if (!  ATOM_drain .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_root_1_7(Prolog m) { 
    // verb_root(exceed):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // verb_root(exceed):-[]
        if (!  ATOM_exceed .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_root_1_8(Prolog m) { 
    // verb_root(flow):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // verb_root(flow):-[]
        if (!  ATOM_flow .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_root_1_9(Prolog m) { 
    // verb_root(rise):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // verb_root(rise):-[]
        if (!  ATOM_rise .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: regular_pres/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(regular_pres/1,public)




    public static Operation PRED_regular_pres_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::regular_pres_1_var, fail_0, fail_0, FILE_chat_parser::regular_pres_1_var, fail_0, fail_0); 
    }

    private final static Operation regular_pres_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::regular_pres_1_var_1);
        return regular_pres_1_1(m);
    }

    private final static Operation regular_pres_1_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::regular_pres_1_var_2);
        return regular_pres_1_2(m);
    }

    private final static Operation regular_pres_1_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::regular_pres_1_var_3);
        return regular_pres_1_3(m);
    }

    private final static Operation regular_pres_1_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::regular_pres_1_var_4);
        return regular_pres_1_4(m);
    }

    private final static Operation regular_pres_1_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::regular_pres_1_var_5);
        return regular_pres_1_5(m);
    }

    private final static Operation regular_pres_1_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::regular_pres_1_var_6);
        return regular_pres_1_6(m);
    }

    private final static Operation regular_pres_1_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::regular_pres_1_var_7);
        return regular_pres_1_7(m);
    }

    private final static Operation regular_pres_1_var_7(Prolog m) { 
        m.trust(null);
        return regular_pres_1_8(m);
    }

    private final static Operation regular_pres_1_1(Prolog m) { 
    // regular_pres(have):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // regular_pres(have):-[]
        if (!  ATOM_have .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation regular_pres_1_2(Prolog m) { 
    // regular_pres(do):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // regular_pres(do):-[]
        if (!  ATOM_do .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation regular_pres_1_3(Prolog m) { 
    // regular_pres(rise):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // regular_pres(rise):-[]
        if (!  ATOM_rise .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation regular_pres_1_4(Prolog m) { 
    // regular_pres(border):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // regular_pres(border):-[]
        if (!  ATOM_border .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation regular_pres_1_5(Prolog m) { 
    // regular_pres(contain):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // regular_pres(contain):-[]
        if (!  ATOM_contain .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation regular_pres_1_6(Prolog m) { 
    // regular_pres(drain):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // regular_pres(drain):-[]
        if (!  ATOM_drain .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation regular_pres_1_7(Prolog m) { 
    // regular_pres(exceed):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // regular_pres(exceed):-[]
        if (!  ATOM_exceed .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation regular_pres_1_8(Prolog m) { 
    // regular_pres(flow):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // regular_pres(flow):-[]
        if (!  ATOM_flow .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: regular_past/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(regular_past/2,public)
        final static Functor ATOM_had = SYM("had");
        final static Functor ATOM_contained = SYM("contained");
        final static Functor ATOM_drained = SYM("drained");
        final static Functor ATOM_exceeded = SYM("exceeded");
        final static Functor ATOM_flowed = SYM("flowed");




    public static Operation PRED_regular_past_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::regular_past_2_var, fail_0, fail_0, FILE_chat_parser::regular_past_2_var, fail_0, fail_0); 
    }

    private final static Operation regular_past_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::regular_past_2_var_1);
        return regular_past_2_1(m);
    }

    private final static Operation regular_past_2_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::regular_past_2_var_2);
        return regular_past_2_2(m);
    }

    private final static Operation regular_past_2_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::regular_past_2_var_3);
        return regular_past_2_3(m);
    }

    private final static Operation regular_past_2_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::regular_past_2_var_4);
        return regular_past_2_4(m);
    }

    private final static Operation regular_past_2_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::regular_past_2_var_5);
        return regular_past_2_5(m);
    }

    private final static Operation regular_past_2_var_5(Prolog m) { 
        m.trust(null);
        return regular_past_2_6(m);
    }

    private final static Operation regular_past_2_1(Prolog m) { 
    // regular_past(had,have):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // regular_past(had,have):-[]
        if (!  ATOM_had .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_have .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation regular_past_2_2(Prolog m) { 
    // regular_past(bordered,border):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // regular_past(bordered,border):-[]
        if (!  ATOM_bordered .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_border .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation regular_past_2_3(Prolog m) { 
    // regular_past(contained,contain):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // regular_past(contained,contain):-[]
        if (!  ATOM_contained .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_contain .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation regular_past_2_4(Prolog m) { 
    // regular_past(drained,drain):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // regular_past(drained,drain):-[]
        if (!  ATOM_drained .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_drain .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation regular_past_2_5(Prolog m) { 
    // regular_past(exceeded,exceed):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // regular_past(exceeded,exceed):-[]
        if (!  ATOM_exceeded .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exceed .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation regular_past_2_6(Prolog m) { 
    // regular_past(flowed,flow):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // regular_past(flowed,flow):-[]
        if (!  ATOM_flowed .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_flow .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: rel_pron/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(rel_pron/2,public)




    public static Operation PRED_rel_pron_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::rel_pron_2_var, fail_0, fail_0, FILE_chat_parser::rel_pron_2_var, fail_0, fail_0); 
    }

    private final static Operation rel_pron_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::rel_pron_2_var_1);
        return rel_pron_2_1(m);
    }

    private final static Operation rel_pron_2_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::rel_pron_2_var_2);
        return rel_pron_2_2(m);
    }

    private final static Operation rel_pron_2_var_2(Prolog m) { 
        m.trust(null);
        return rel_pron_2_3(m);
    }

    private final static Operation rel_pron_2_1(Prolog m) { 
    // rel_pron(who,subj):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // rel_pron(who,subj):-[]
        if (!  ATOM_who .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_subj .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation rel_pron_2_2(Prolog m) { 
    // rel_pron(whom,compl):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // rel_pron(whom,compl):-[]
        if (!  ATOM_whom .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_compl .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation rel_pron_2_3(Prolog m) { 
    // rel_pron(which,undef):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // rel_pron(which,undef):-[]
        if (!  ATOM_which .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_undef .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: poss_pron/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(poss_pron/4,public)
        final static Functor ATOM_my = SYM("my");
        final static Functor ATOM_your = SYM("your");
        final static Functor ATOM_his = SYM("his");
        final static Functor ATOM_masc = SYM("masc");
        final static Functor ATOM_her = SYM("her");
        final static Functor ATOM_fem = SYM("fem");
        final static Functor ATOM_its = SYM("its");
        final static Functor ATOM_neut = SYM("neut");
        final static Functor ATOM_our = SYM("our");
        final static Functor ATOM_their = SYM("their");




    public static Operation PRED_poss_pron_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::poss_pron_4_var, fail_0, fail_0, FILE_chat_parser::poss_pron_4_var, fail_0, fail_0); 
    }

    private final static Operation poss_pron_4_var(Prolog m) { 
        m.jtry4(null, FILE_chat_parser::poss_pron_4_var_1);
        return poss_pron_4_1(m);
    }

    private final static Operation poss_pron_4_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::poss_pron_4_var_2);
        return poss_pron_4_2(m);
    }

    private final static Operation poss_pron_4_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::poss_pron_4_var_3);
        return poss_pron_4_3(m);
    }

    private final static Operation poss_pron_4_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::poss_pron_4_var_4);
        return poss_pron_4_4(m);
    }

    private final static Operation poss_pron_4_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::poss_pron_4_var_5);
        return poss_pron_4_5(m);
    }

    private final static Operation poss_pron_4_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::poss_pron_4_var_6);
        return poss_pron_4_6(m);
    }

    private final static Operation poss_pron_4_var_6(Prolog m) { 
        m.trust(null);
        return poss_pron_4_7(m);
    }

    private final static Operation poss_pron_4_1(Prolog m) { 
    // poss_pron(my,A,1,sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // poss_pron(my,A,1,sin):-[]
        if (!  ATOM_my .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation poss_pron_4_2(Prolog m) { 
    // poss_pron(your,A,2,B):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // poss_pron(your,A,2,B):-[]
        if (!  ATOM_your .unify(a1, m.trail))
            return m.fail();
        if (!  int_2 .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation poss_pron_4_3(Prolog m) { 
    // poss_pron(his,masc,3,sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // poss_pron(his,masc,3,sin):-[]
        if (!  ATOM_his .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_masc .unify(a2, m.trail))
            return m.fail();
        if (!  int_3 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation poss_pron_4_4(Prolog m) { 
    // poss_pron(her,fem,3,sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // poss_pron(her,fem,3,sin):-[]
        if (!  ATOM_her .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_fem .unify(a2, m.trail))
            return m.fail();
        if (!  int_3 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation poss_pron_4_5(Prolog m) { 
    // poss_pron(its,neut,3,sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // poss_pron(its,neut,3,sin):-[]
        if (!  ATOM_its .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_neut .unify(a2, m.trail))
            return m.fail();
        if (!  int_3 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation poss_pron_4_6(Prolog m) { 
    // poss_pron(our,A,1,plu):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // poss_pron(our,A,1,plu):-[]
        if (!  ATOM_our .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_plu .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation poss_pron_4_7(Prolog m) { 
    // poss_pron(their,A,3,plu):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // poss_pron(their,A,3,plu):-[]
        if (!  ATOM_their .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_plu .unify(a4, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: pers_pron/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(pers_pron/5,public)
        final static Functor ATOM_i = SYM("i");
        final static Functor ATOM_he = SYM("he");
        final static Functor ATOM_she = SYM("she");
        final static Functor ATOM_it = SYM("it");
        final static Functor ATOM_we = SYM("we");
        final static Functor ATOM_them = SYM("them");
        final static Functor ATOM_me = SYM("me");
        final static Functor FUNCTOR_compl_1 = F("compl",1);
        final static Functor ATOM_him = SYM("him");
        final static Functor ATOM_us = SYM("us");

    // private final Term arg5;




    public static Operation PRED_pers_pron_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::pers_pron_5_var, fail_0, fail_0, FILE_chat_parser::pers_pron_5_var, fail_0, fail_0); 
    }

    private final static Operation pers_pron_5_var(Prolog m) { 
        m.jtry5(null, FILE_chat_parser::pers_pron_5_var_1);
        return pers_pron_5_1(m);
    }

    private final static Operation pers_pron_5_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::pers_pron_5_var_2);
        return pers_pron_5_2(m);
    }

    private final static Operation pers_pron_5_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::pers_pron_5_var_3);
        return pers_pron_5_3(m);
    }

    private final static Operation pers_pron_5_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::pers_pron_5_var_4);
        return pers_pron_5_4(m);
    }

    private final static Operation pers_pron_5_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::pers_pron_5_var_5);
        return pers_pron_5_5(m);
    }

    private final static Operation pers_pron_5_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::pers_pron_5_var_6);
        return pers_pron_5_6(m);
    }

    private final static Operation pers_pron_5_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::pers_pron_5_var_7);
        return pers_pron_5_7(m);
    }

    private final static Operation pers_pron_5_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::pers_pron_5_var_8);
        return pers_pron_5_8(m);
    }

    private final static Operation pers_pron_5_var_8(Prolog m) { 
        m.retry(null, FILE_chat_parser::pers_pron_5_var_9);
        return pers_pron_5_9(m);
    }

    private final static Operation pers_pron_5_var_9(Prolog m) { 
        m.retry(null, FILE_chat_parser::pers_pron_5_var_10);
        return pers_pron_5_10(m);
    }

    private final static Operation pers_pron_5_var_10(Prolog m) { 
        m.retry(null, FILE_chat_parser::pers_pron_5_var_11);
        return pers_pron_5_11(m);
    }

    private final static Operation pers_pron_5_var_11(Prolog m) { 
        m.trust(null);
        return pers_pron_5_12(m);
    }

    private final static Operation pers_pron_5_1(Prolog m) { 
    // pers_pron(i,A,1,sin,subj):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pers_pron(i,A,1,sin,subj):-[]
        if (!  ATOM_i .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a4, m.trail))
            return m.fail();
        if (!  ATOM_subj .unify(a5, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation pers_pron_5_2(Prolog m) { 
    // pers_pron(you,A,2,B,C):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pers_pron(you,A,2,B,C):-[]
        if (!  ATOM_you .unify(a1, m.trail))
            return m.fail();
        if (!  int_2 .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation pers_pron_5_3(Prolog m) { 
    // pers_pron(he,masc,3,sin,subj):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pers_pron(he,masc,3,sin,subj):-[]
        if (!  ATOM_he .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_masc .unify(a2, m.trail))
            return m.fail();
        if (!  int_3 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a4, m.trail))
            return m.fail();
        if (!  ATOM_subj .unify(a5, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation pers_pron_5_4(Prolog m) { 
    // pers_pron(she,fem,3,sin,subj):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pers_pron(she,fem,3,sin,subj):-[]
        if (!  ATOM_she .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_fem .unify(a2, m.trail))
            return m.fail();
        if (!  int_3 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a4, m.trail))
            return m.fail();
        if (!  ATOM_subj .unify(a5, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation pers_pron_5_5(Prolog m) { 
    // pers_pron(it,neut,3,sin,A):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pers_pron(it,neut,3,sin,A):-[]
        if (!  ATOM_it .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_neut .unify(a2, m.trail))
            return m.fail();
        if (!  int_3 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation pers_pron_5_6(Prolog m) { 
    // pers_pron(we,A,1,plu,subj):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pers_pron(we,A,1,plu,subj):-[]
        if (!  ATOM_we .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_plu .unify(a4, m.trail))
            return m.fail();
        if (!  ATOM_subj .unify(a5, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation pers_pron_5_7(Prolog m) { 
    // pers_pron(them,A,3,plu,subj):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pers_pron(them,A,3,plu,subj):-[]
        if (!  ATOM_them .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_plu .unify(a4, m.trail))
            return m.fail();
        if (!  ATOM_subj .unify(a5, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation pers_pron_5_8(Prolog m) { 
    // pers_pron(me,A,1,sin,compl(B)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pers_pron(me,A,1,sin,compl(B)):-[]
        if (!  ATOM_me .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a4, m.trail))
            return m.fail();
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_compl_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation pers_pron_5_9(Prolog m) { 
    // pers_pron(him,masc,3,sin,compl(A)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pers_pron(him,masc,3,sin,compl(A)):-[]
        if (!  ATOM_him .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_masc .unify(a2, m.trail))
            return m.fail();
        if (!  int_3 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a4, m.trail))
            return m.fail();
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_compl_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation pers_pron_5_10(Prolog m) { 
    // pers_pron(her,fem,3,sin,compl(A)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pers_pron(her,fem,3,sin,compl(A)):-[]
        if (!  ATOM_her .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_fem .unify(a2, m.trail))
            return m.fail();
        if (!  int_3 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_sin .unify(a4, m.trail))
            return m.fail();
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_compl_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation pers_pron_5_11(Prolog m) { 
    // pers_pron(us,A,1,plu,compl(B)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pers_pron(us,A,1,plu,compl(B)):-[]
        if (!  ATOM_us .unify(a1, m.trail))
            return m.fail();
        if (!  int_1 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_plu .unify(a4, m.trail))
            return m.fail();
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_compl_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }

    private final static Operation pers_pron_5_12(Prolog m) { 
    // pers_pron(them,A,3,plu,compl(B)):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // pers_pron(them,A,3,plu,compl(B)):-[]
        if (!  ATOM_them .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a3, m.trail))
            return m.fail();
        if (!  ATOM_plu .unify(a4, m.trail))
            return m.fail();
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_compl_1 , m.trail, m.DONT_CARE1())){
                return m.fail();
            }
        return cont;
    }
/** PREDICATE: terminator/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(terminator/2,public)




    public static Operation PRED_terminator_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::terminator_2_var, fail_0, fail_0, FILE_chat_parser::terminator_2_var, fail_0, fail_0); 
    }

    private final static Operation terminator_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::terminator_2_var_1);
        return terminator_2_1(m);
    }

    private final static Operation terminator_2_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::terminator_2_var_2);
        return terminator_2_2(m);
    }

    private final static Operation terminator_2_var_2(Prolog m) { 
        m.trust(null);
        return terminator_2_3(m);
    }

    private final static Operation terminator_2_1(Prolog m) { 
    // terminator('.',A):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // terminator('.',A):-[]
        if (!  ATOM_$002E .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation terminator_2_2(Prolog m) { 
    // terminator(?,?):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // terminator(?,?):-[]
        if (!  ATOM_$003F .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_$003F .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation terminator_2_3(Prolog m) { 
    // terminator(!,!):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // terminator(!,!):-[]
        if (!  ATOM_$0021 .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_$0021 .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: name/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(name/1,public)




    public static Operation PRED_name_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // name(A):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // name(A):-[]
        return cont;
    }
/** PREDICATE: loc_pred/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(loc_pred/2,public)
        final static Functor ATOM_east = SYM("east");
        final static Functor ATOM_eastof = SYM("eastof");
    private static final Compound L_loc_pred_2_s5 = S( FUNCTOR_prep_1 ,  ATOM_eastof );
        final static Functor ATOM_west = SYM("west");
        final static Functor ATOM_westof = SYM("westof");
    private static final Compound L_loc_pred_2_s9 = S( FUNCTOR_prep_1 ,  ATOM_westof );
        final static Functor ATOM_north = SYM("north");
        final static Functor ATOM_northof = SYM("northof");
    private static final Compound L_loc_pred_2_s13 = S( FUNCTOR_prep_1 ,  ATOM_northof );
        final static Functor ATOM_southof = SYM("southof");
    private static final Compound L_loc_pred_2_s17 = S( FUNCTOR_prep_1 ,  ATOM_southof );




    public static Operation PRED_loc_pred_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::loc_pred_2_var, fail_0, fail_0, FILE_chat_parser::loc_pred_2_var, fail_0, fail_0); 
    }

    private final static Operation loc_pred_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::loc_pred_2_var_1);
        return loc_pred_2_1(m);
    }

    private final static Operation loc_pred_2_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::loc_pred_2_var_2);
        return loc_pred_2_2(m);
    }

    private final static Operation loc_pred_2_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::loc_pred_2_var_3);
        return loc_pred_2_3(m);
    }

    private final static Operation loc_pred_2_var_3(Prolog m) { 
        m.trust(null);
        return loc_pred_2_4(m);
    }

    private final static Operation loc_pred_2_1(Prolog m) { 
    // loc_pred(east,prep(eastof)):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // loc_pred(east,prep(eastof)):-[]
        if (!  ATOM_east .unify(a1, m.trail))
            return m.fail();
        if (! L_loc_pred_2_s5.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation loc_pred_2_2(Prolog m) { 
    // loc_pred(west,prep(westof)):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // loc_pred(west,prep(westof)):-[]
        if (!  ATOM_west .unify(a1, m.trail))
            return m.fail();
        if (! L_loc_pred_2_s9.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation loc_pred_2_3(Prolog m) { 
    // loc_pred(north,prep(northof)):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // loc_pred(north,prep(northof)):-[]
        if (!  ATOM_north .unify(a1, m.trail))
            return m.fail();
        if (! L_loc_pred_2_s13.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation loc_pred_2_4(Prolog m) { 
    // loc_pred(south,prep(southof)):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // loc_pred(south,prep(southof)):-[]
        if (!  ATOM_south .unify(a1, m.trail))
            return m.fail();
        if (! L_loc_pred_2_s17.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: adj/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(adj/2,public)
        final static Functor ATOM_minimum = SYM("minimum");
        final static Functor ATOM_restr = SYM("restr");
        final static Functor ATOM_maximum = SYM("maximum");
        final static Functor ATOM_great = SYM("great");
        final static Functor ATOM_big = SYM("big");
        final static Functor ATOM_small = SYM("small");
        final static Functor ATOM_old = SYM("old");
        final static Functor ATOM_new = SYM("new");
        final static Functor ATOM_populous = SYM("populous");




    public static Operation PRED_adj_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::adj_2_var, fail_0, fail_0, FILE_chat_parser::adj_2_var, fail_0, fail_0); 
    }

    private final static Operation adj_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::adj_2_var_1);
        return adj_2_1(m);
    }

    private final static Operation adj_2_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_2);
        return adj_2_2(m);
    }

    private final static Operation adj_2_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_3);
        return adj_2_3(m);
    }

    private final static Operation adj_2_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_4);
        return adj_2_4(m);
    }

    private final static Operation adj_2_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_5);
        return adj_2_5(m);
    }

    private final static Operation adj_2_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_6);
        return adj_2_6(m);
    }

    private final static Operation adj_2_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_7);
        return adj_2_7(m);
    }

    private final static Operation adj_2_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_8);
        return adj_2_8(m);
    }

    private final static Operation adj_2_var_8(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_9);
        return adj_2_9(m);
    }

    private final static Operation adj_2_var_9(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_10);
        return adj_2_10(m);
    }

    private final static Operation adj_2_var_10(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_11);
        return adj_2_11(m);
    }

    private final static Operation adj_2_var_11(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_12);
        return adj_2_12(m);
    }

    private final static Operation adj_2_var_12(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_13);
        return adj_2_13(m);
    }

    private final static Operation adj_2_var_13(Prolog m) { 
        m.retry(null, FILE_chat_parser::adj_2_var_14);
        return adj_2_14(m);
    }

    private final static Operation adj_2_var_14(Prolog m) { 
        m.trust(null);
        return adj_2_15(m);
    }

    private final static Operation adj_2_1(Prolog m) { 
    // adj(minimum,restr):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(minimum,restr):-[]
        if (!  ATOM_minimum .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_restr .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_2(Prolog m) { 
    // adj(maximum,restr):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(maximum,restr):-[]
        if (!  ATOM_maximum .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_restr .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_3(Prolog m) { 
    // adj(average,restr):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(average,restr):-[]
        if (!  ATOM_average .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_restr .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_4(Prolog m) { 
    // adj(total,restr):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(total,restr):-[]
        if (!  ATOM_total .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_restr .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_5(Prolog m) { 
    // adj(african,restr):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(african,restr):-[]
        if (!  ATOM_african .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_restr .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_6(Prolog m) { 
    // adj(american,restr):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(american,restr):-[]
        if (!  ATOM_american .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_restr .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_7(Prolog m) { 
    // adj(asian,restr):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(asian,restr):-[]
        if (!  ATOM_asian .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_restr .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_8(Prolog m) { 
    // adj(european,restr):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(european,restr):-[]
        if (!  ATOM_european .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_restr .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_9(Prolog m) { 
    // adj(great,quant):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(great,quant):-[]
        if (!  ATOM_great .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_quant .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_10(Prolog m) { 
    // adj(big,quant):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(big,quant):-[]
        if (!  ATOM_big .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_quant .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_11(Prolog m) { 
    // adj(small,quant):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(small,quant):-[]
        if (!  ATOM_small .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_quant .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_12(Prolog m) { 
    // adj(large,quant):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(large,quant):-[]
        if (!  ATOM_large .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_quant .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_13(Prolog m) { 
    // adj(old,quant):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(old,quant):-[]
        if (!  ATOM_old .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_quant .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_14(Prolog m) { 
    // adj(new,quant):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(new,quant):-[]
        if (!  ATOM_new .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_quant .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adj_2_15(Prolog m) { 
    // adj(populous,quant):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // adj(populous,quant):-[]
        if (!  ATOM_populous .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_quant .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: rel_adj/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(rel_adj/2,public)
        final static Functor ATOM_greater = SYM("greater");
        final static Functor ATOM_bigger = SYM("bigger");
        final static Functor ATOM_smaller = SYM("smaller");
        final static Functor ATOM_larger = SYM("larger");
        final static Functor ATOM_older = SYM("older");
        final static Functor ATOM_newer = SYM("newer");




    public static Operation PRED_rel_adj_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::rel_adj_2_var, fail_0, fail_0, FILE_chat_parser::rel_adj_2_var, fail_0, fail_0); 
    }

    private final static Operation rel_adj_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::rel_adj_2_var_1);
        return rel_adj_2_1(m);
    }

    private final static Operation rel_adj_2_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::rel_adj_2_var_2);
        return rel_adj_2_2(m);
    }

    private final static Operation rel_adj_2_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::rel_adj_2_var_3);
        return rel_adj_2_3(m);
    }

    private final static Operation rel_adj_2_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::rel_adj_2_var_4);
        return rel_adj_2_4(m);
    }

    private final static Operation rel_adj_2_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::rel_adj_2_var_5);
        return rel_adj_2_5(m);
    }

    private final static Operation rel_adj_2_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::rel_adj_2_var_6);
        return rel_adj_2_6(m);
    }

    private final static Operation rel_adj_2_var_6(Prolog m) { 
        m.trust(null);
        return rel_adj_2_7(m);
    }

    private final static Operation rel_adj_2_1(Prolog m) { 
    // rel_adj(greater,great):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // rel_adj(greater,great):-[]
        if (!  ATOM_greater .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_great .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation rel_adj_2_2(Prolog m) { 
    // rel_adj(less,small):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // rel_adj(less,small):-[]
        if (!  ATOM_less .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_small .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation rel_adj_2_3(Prolog m) { 
    // rel_adj(bigger,big):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // rel_adj(bigger,big):-[]
        if (!  ATOM_bigger .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_big .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation rel_adj_2_4(Prolog m) { 
    // rel_adj(smaller,small):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // rel_adj(smaller,small):-[]
        if (!  ATOM_smaller .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_small .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation rel_adj_2_5(Prolog m) { 
    // rel_adj(larger,large):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // rel_adj(larger,large):-[]
        if (!  ATOM_larger .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_large .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation rel_adj_2_6(Prolog m) { 
    // rel_adj(older,old):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // rel_adj(older,old):-[]
        if (!  ATOM_older .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_old .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation rel_adj_2_7(Prolog m) { 
    // rel_adj(newer,new):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // rel_adj(newer,new):-[]
        if (!  ATOM_newer .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_new .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: sup_adj/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(sup_adj/2,public)
        final static Functor ATOM_biggest = SYM("biggest");
        final static Functor ATOM_oldest = SYM("oldest");
        final static Functor ATOM_newest = SYM("newest");




    public static Operation PRED_sup_adj_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::sup_adj_2_var, fail_0, fail_0, FILE_chat_parser::sup_adj_2_var, fail_0, fail_0); 
    }

    private final static Operation sup_adj_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::sup_adj_2_var_1);
        return sup_adj_2_1(m);
    }

    private final static Operation sup_adj_2_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::sup_adj_2_var_2);
        return sup_adj_2_2(m);
    }

    private final static Operation sup_adj_2_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::sup_adj_2_var_3);
        return sup_adj_2_3(m);
    }

    private final static Operation sup_adj_2_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::sup_adj_2_var_4);
        return sup_adj_2_4(m);
    }

    private final static Operation sup_adj_2_var_4(Prolog m) { 
        m.trust(null);
        return sup_adj_2_5(m);
    }

    private final static Operation sup_adj_2_1(Prolog m) { 
    // sup_adj(biggest,big):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // sup_adj(biggest,big):-[]
        if (!  ATOM_biggest .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_big .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation sup_adj_2_2(Prolog m) { 
    // sup_adj(smallest,small):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // sup_adj(smallest,small):-[]
        if (!  ATOM_smallest .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_small .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation sup_adj_2_3(Prolog m) { 
    // sup_adj(largest,large):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // sup_adj(largest,large):-[]
        if (!  ATOM_largest .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_large .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation sup_adj_2_4(Prolog m) { 
    // sup_adj(oldest,old):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // sup_adj(oldest,old):-[]
        if (!  ATOM_oldest .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_old .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation sup_adj_2_5(Prolog m) { 
    // sup_adj(newest,new):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // sup_adj(newest,new):-[]
        if (!  ATOM_newest .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_new .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: noun_sin/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(noun_sin/1,public)
        final static Functor ATOM_sum = SYM("sum");
        final static Functor ATOM_degree = SYM("degree");
        final static Functor ATOM_sqmile = SYM("sqmile");
        final static Functor ATOM_ksqmile = SYM("ksqmile");
        final static Functor ATOM_thousand = SYM("thousand");
        final static Functor ATOM_million = SYM("million");
        final static Functor ATOM_city = SYM("city");
        final static Functor ATOM_latitude = SYM("latitude");
        final static Functor ATOM_longitude = SYM("longitude");
        final static Functor ATOM_population = SYM("population");
        final static Functor ATOM_region = SYM("region");
        final static Functor ATOM_sea = SYM("sea");
        final static Functor ATOM_seamass = SYM("seamass");
        final static Functor ATOM_number = SYM("number");




    public static Operation PRED_noun_sin_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::noun_sin_1_var, fail_0, fail_0, FILE_chat_parser::noun_sin_1_var, fail_0, fail_0); 
    }

    private final static Operation noun_sin_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::noun_sin_1_var_1);
        return noun_sin_1_1(m);
    }

    private final static Operation noun_sin_1_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_2);
        return noun_sin_1_2(m);
    }

    private final static Operation noun_sin_1_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_3);
        return noun_sin_1_3(m);
    }

    private final static Operation noun_sin_1_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_4);
        return noun_sin_1_4(m);
    }

    private final static Operation noun_sin_1_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_5);
        return noun_sin_1_5(m);
    }

    private final static Operation noun_sin_1_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_6);
        return noun_sin_1_6(m);
    }

    private final static Operation noun_sin_1_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_7);
        return noun_sin_1_7(m);
    }

    private final static Operation noun_sin_1_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_8);
        return noun_sin_1_8(m);
    }

    private final static Operation noun_sin_1_var_8(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_9);
        return noun_sin_1_9(m);
    }

    private final static Operation noun_sin_1_var_9(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_10);
        return noun_sin_1_10(m);
    }

    private final static Operation noun_sin_1_var_10(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_11);
        return noun_sin_1_11(m);
    }

    private final static Operation noun_sin_1_var_11(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_12);
        return noun_sin_1_12(m);
    }

    private final static Operation noun_sin_1_var_12(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_13);
        return noun_sin_1_13(m);
    }

    private final static Operation noun_sin_1_var_13(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_14);
        return noun_sin_1_14(m);
    }

    private final static Operation noun_sin_1_var_14(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_15);
        return noun_sin_1_15(m);
    }

    private final static Operation noun_sin_1_var_15(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_16);
        return noun_sin_1_16(m);
    }

    private final static Operation noun_sin_1_var_16(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_17);
        return noun_sin_1_17(m);
    }

    private final static Operation noun_sin_1_var_17(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_18);
        return noun_sin_1_18(m);
    }

    private final static Operation noun_sin_1_var_18(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_19);
        return noun_sin_1_19(m);
    }

    private final static Operation noun_sin_1_var_19(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_20);
        return noun_sin_1_20(m);
    }

    private final static Operation noun_sin_1_var_20(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_21);
        return noun_sin_1_21(m);
    }

    private final static Operation noun_sin_1_var_21(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_22);
        return noun_sin_1_22(m);
    }

    private final static Operation noun_sin_1_var_22(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_23);
        return noun_sin_1_23(m);
    }

    private final static Operation noun_sin_1_var_23(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_sin_1_var_24);
        return noun_sin_1_24(m);
    }

    private final static Operation noun_sin_1_var_24(Prolog m) { 
        m.trust(null);
        return noun_sin_1_25(m);
    }

    private final static Operation noun_sin_1_1(Prolog m) { 
    // noun_sin(average):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(average):-[]
        if (!  ATOM_average .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_2(Prolog m) { 
    // noun_sin(total):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(total):-[]
        if (!  ATOM_total .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_3(Prolog m) { 
    // noun_sin(sum):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(sum):-[]
        if (!  ATOM_sum .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_4(Prolog m) { 
    // noun_sin(degree):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(degree):-[]
        if (!  ATOM_degree .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_5(Prolog m) { 
    // noun_sin(sqmile):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(sqmile):-[]
        if (!  ATOM_sqmile .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_6(Prolog m) { 
    // noun_sin(ksqmile):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(ksqmile):-[]
        if (!  ATOM_ksqmile .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_7(Prolog m) { 
    // noun_sin(thousand):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(thousand):-[]
        if (!  ATOM_thousand .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_8(Prolog m) { 
    // noun_sin(million):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(million):-[]
        if (!  ATOM_million .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_9(Prolog m) { 
    // noun_sin(time):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(time):-[]
        if (!  ATOM_time .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_10(Prolog m) { 
    // noun_sin(place):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(place):-[]
        if (!  ATOM_place .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_11(Prolog m) { 
    // noun_sin(area):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(area):-[]
        if (!  ATOM_area .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_12(Prolog m) { 
    // noun_sin(capital):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(capital):-[]
        if (!  ATOM_capital .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_13(Prolog m) { 
    // noun_sin(city):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(city):-[]
        if (!  ATOM_city .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_14(Prolog m) { 
    // noun_sin(continent):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(continent):-[]
        if (!  ATOM_continent .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_15(Prolog m) { 
    // noun_sin(country):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(country):-[]
        if (!  ATOM_country .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_16(Prolog m) { 
    // noun_sin(latitude):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(latitude):-[]
        if (!  ATOM_latitude .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_17(Prolog m) { 
    // noun_sin(longitude):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(longitude):-[]
        if (!  ATOM_longitude .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_18(Prolog m) { 
    // noun_sin(ocean):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(ocean):-[]
        if (!  ATOM_ocean .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_19(Prolog m) { 
    // noun_sin(person):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(person):-[]
        if (!  ATOM_person .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_20(Prolog m) { 
    // noun_sin(population):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(population):-[]
        if (!  ATOM_population .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_21(Prolog m) { 
    // noun_sin(region):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(region):-[]
        if (!  ATOM_region .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_22(Prolog m) { 
    // noun_sin(river):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(river):-[]
        if (!  ATOM_river .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_23(Prolog m) { 
    // noun_sin(sea):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(sea):-[]
        if (!  ATOM_sea .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_24(Prolog m) { 
    // noun_sin(seamass):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(seamass):-[]
        if (!  ATOM_seamass .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_sin_1_25(Prolog m) { 
    // noun_sin(number):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // noun_sin(number):-[]
        if (!  ATOM_number .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: noun_plu/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(noun_plu/2,public)
        final static Functor ATOM_averages = SYM("averages");
        final static Functor ATOM_totals = SYM("totals");
        final static Functor ATOM_sums = SYM("sums");
        final static Functor ATOM_degrees = SYM("degrees");
        final static Functor ATOM_sqmiles = SYM("sqmiles");
        final static Functor ATOM_ksqmiles = SYM("ksqmiles");
        final static Functor ATOM_times = SYM("times");
        final static Functor ATOM_places = SYM("places");
        final static Functor ATOM_areas = SYM("areas");
        final static Functor ATOM_cities = SYM("cities");
        final static Functor ATOM_continents = SYM("continents");
        final static Functor ATOM_latitudes = SYM("latitudes");
        final static Functor ATOM_longitudes = SYM("longitudes");
        final static Functor ATOM_oceans = SYM("oceans");
        final static Functor ATOM_persons = SYM("persons");
        final static Functor ATOM_people = SYM("people");
        final static Functor ATOM_populations = SYM("populations");
        final static Functor ATOM_regions = SYM("regions");
        final static Functor ATOM_seamasses = SYM("seamasses");
        final static Functor ATOM_numbers = SYM("numbers");




    public static Operation PRED_noun_plu_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::noun_plu_2_var, fail_0, fail_0, FILE_chat_parser::noun_plu_2_var, fail_0, fail_0); 
    }

    private final static Operation noun_plu_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::noun_plu_2_var_1);
        return noun_plu_2_1(m);
    }

    private final static Operation noun_plu_2_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_2);
        return noun_plu_2_2(m);
    }

    private final static Operation noun_plu_2_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_3);
        return noun_plu_2_3(m);
    }

    private final static Operation noun_plu_2_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_4);
        return noun_plu_2_4(m);
    }

    private final static Operation noun_plu_2_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_5);
        return noun_plu_2_5(m);
    }

    private final static Operation noun_plu_2_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_6);
        return noun_plu_2_6(m);
    }

    private final static Operation noun_plu_2_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_7);
        return noun_plu_2_7(m);
    }

    private final static Operation noun_plu_2_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_8);
        return noun_plu_2_8(m);
    }

    private final static Operation noun_plu_2_var_8(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_9);
        return noun_plu_2_9(m);
    }

    private final static Operation noun_plu_2_var_9(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_10);
        return noun_plu_2_10(m);
    }

    private final static Operation noun_plu_2_var_10(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_11);
        return noun_plu_2_11(m);
    }

    private final static Operation noun_plu_2_var_11(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_12);
        return noun_plu_2_12(m);
    }

    private final static Operation noun_plu_2_var_12(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_13);
        return noun_plu_2_13(m);
    }

    private final static Operation noun_plu_2_var_13(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_14);
        return noun_plu_2_14(m);
    }

    private final static Operation noun_plu_2_var_14(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_15);
        return noun_plu_2_15(m);
    }

    private final static Operation noun_plu_2_var_15(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_16);
        return noun_plu_2_16(m);
    }

    private final static Operation noun_plu_2_var_16(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_17);
        return noun_plu_2_17(m);
    }

    private final static Operation noun_plu_2_var_17(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_18);
        return noun_plu_2_18(m);
    }

    private final static Operation noun_plu_2_var_18(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_19);
        return noun_plu_2_19(m);
    }

    private final static Operation noun_plu_2_var_19(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_20);
        return noun_plu_2_20(m);
    }

    private final static Operation noun_plu_2_var_20(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_21);
        return noun_plu_2_21(m);
    }

    private final static Operation noun_plu_2_var_21(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_22);
        return noun_plu_2_22(m);
    }

    private final static Operation noun_plu_2_var_22(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_23);
        return noun_plu_2_23(m);
    }

    private final static Operation noun_plu_2_var_23(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_24);
        return noun_plu_2_24(m);
    }

    private final static Operation noun_plu_2_var_24(Prolog m) { 
        m.retry(null, FILE_chat_parser::noun_plu_2_var_25);
        return noun_plu_2_25(m);
    }

    private final static Operation noun_plu_2_var_25(Prolog m) { 
        m.trust(null);
        return noun_plu_2_26(m);
    }

    private final static Operation noun_plu_2_1(Prolog m) { 
    // noun_plu(averages,average):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(averages,average):-[]
        if (!  ATOM_averages .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_average .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_2(Prolog m) { 
    // noun_plu(totals,total):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(totals,total):-[]
        if (!  ATOM_totals .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_total .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_3(Prolog m) { 
    // noun_plu(sums,sum):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(sums,sum):-[]
        if (!  ATOM_sums .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_sum .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_4(Prolog m) { 
    // noun_plu(degrees,degree):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(degrees,degree):-[]
        if (!  ATOM_degrees .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_degree .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_5(Prolog m) { 
    // noun_plu(sqmiles,sqmile):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(sqmiles,sqmile):-[]
        if (!  ATOM_sqmiles .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_sqmile .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_6(Prolog m) { 
    // noun_plu(ksqmiles,ksqmile):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(ksqmiles,ksqmile):-[]
        if (!  ATOM_ksqmiles .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_ksqmile .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_7(Prolog m) { 
    // noun_plu(million,million):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(million,million):-[]
        if (!  ATOM_million .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_million .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_8(Prolog m) { 
    // noun_plu(thousand,thousand):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(thousand,thousand):-[]
        if (!  ATOM_thousand .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_thousand .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_9(Prolog m) { 
    // noun_plu(times,time):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(times,time):-[]
        if (!  ATOM_times .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_time .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_10(Prolog m) { 
    // noun_plu(places,place):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(places,place):-[]
        if (!  ATOM_places .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_place .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_11(Prolog m) { 
    // noun_plu(areas,area):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(areas,area):-[]
        if (!  ATOM_areas .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_area .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_12(Prolog m) { 
    // noun_plu(capitals,capital):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(capitals,capital):-[]
        if (!  ATOM_capitals .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_capital .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_13(Prolog m) { 
    // noun_plu(cities,city):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(cities,city):-[]
        if (!  ATOM_cities .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_city .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_14(Prolog m) { 
    // noun_plu(continents,continent):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(continents,continent):-[]
        if (!  ATOM_continents .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_continent .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_15(Prolog m) { 
    // noun_plu(countries,country):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(countries,country):-[]
        if (!  ATOM_countries .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_country .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_16(Prolog m) { 
    // noun_plu(latitudes,latitude):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(latitudes,latitude):-[]
        if (!  ATOM_latitudes .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_latitude .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_17(Prolog m) { 
    // noun_plu(longitudes,longitude):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(longitudes,longitude):-[]
        if (!  ATOM_longitudes .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_longitude .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_18(Prolog m) { 
    // noun_plu(oceans,ocean):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(oceans,ocean):-[]
        if (!  ATOM_oceans .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_ocean .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_19(Prolog m) { 
    // noun_plu(persons,person):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(persons,person):-[]
        if (!  ATOM_persons .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_person .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_20(Prolog m) { 
    // noun_plu(people,person):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(people,person):-[]
        if (!  ATOM_people .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_person .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_21(Prolog m) { 
    // noun_plu(populations,population):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(populations,population):-[]
        if (!  ATOM_populations .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_population .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_22(Prolog m) { 
    // noun_plu(regions,region):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(regions,region):-[]
        if (!  ATOM_regions .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_region .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_23(Prolog m) { 
    // noun_plu(rivers,river):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(rivers,river):-[]
        if (!  ATOM_rivers .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_river .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_24(Prolog m) { 
    // noun_plu(seas,sea):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(seas,sea):-[]
        if (!  ATOM_seas .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_sea .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_25(Prolog m) { 
    // noun_plu(seamasses,seamass):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(seamasses,seamass):-[]
        if (!  ATOM_seamasses .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_seamass .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation noun_plu_2_26(Prolog m) { 
    // noun_plu(numbers,number):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // noun_plu(numbers,number):-[]
        if (!  ATOM_numbers .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_number .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: verb_form/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(verb_form/4,public)
    private static final Compound L_verb_form_4_s6 = S( FUNCTOR_$002B_2 ,  ATOM_pres ,  ATOM_fin );
        final static Functor ATOM_am = SYM("am");
    private static final Compound L_verb_form_4_s13 = S( FUNCTOR_$002B_2 ,  int_1 ,  ATOM_sin );
    private static final Compound L_verb_form_4_s17 = S( FUNCTOR_$002B_2 ,  int_2 ,  ATOM_sin );
    private static final Compound L_verb_form_4_s21 = S( FUNCTOR_$002B_2 ,  int_3 ,  ATOM_sin );
        final static Functor ATOM_was = SYM("was");
    private static final Compound L_verb_form_4_s25 = S( FUNCTOR_$002B_2 ,  ATOM_past ,  ATOM_fin );
        final static Functor ATOM_were = SYM("were");
        final static Functor ATOM_been = SYM("been");
    private static final Compound L_verb_form_4_s30 = S( FUNCTOR_$002B_2 ,  ATOM_past ,  ATOM_part );
        final static Functor ATOM_being = SYM("being");
    private static final Compound L_verb_form_4_s33 = S( FUNCTOR_$002B_2 ,  ATOM_pres ,  ATOM_part );
        final static Functor ATOM_has = SYM("has");
        final static Functor ATOM_having = SYM("having");
        final static Functor ATOM_did = SYM("did");
        final static Functor ATOM_doing = SYM("doing");
        final static Functor ATOM_done = SYM("done");
        final static Functor ATOM_flowing = SYM("flowing");
        final static Functor ATOM_rises = SYM("rises");
        final static Functor ATOM_rose = SYM("rose");
        final static Functor ATOM_risen = SYM("risen");
        final static Functor ATOM_contains = SYM("contains");
        final static Functor ATOM_containing = SYM("containing");
        final static Functor ATOM_drains = SYM("drains");
        final static Functor ATOM_draining = SYM("draining");
        final static Functor ATOM_exceeds = SYM("exceeds");
        final static Functor ATOM_exceeding = SYM("exceeding");




    public static Operation PRED_verb_form_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::verb_form_4_var, FILE_chat_parser::verb_form_4_int, FILE_chat_parser::verb_form_4_int, FILE_chat_parser::verb_form_4_var, FILE_chat_parser::verb_form_4_int, FILE_chat_parser::verb_form_4_int); 
    }

    private final static Operation verb_form_4_var(Prolog m) { 
        m.jtry4(null, FILE_chat_parser::verb_form_4_var_1);
        return verb_form_4_1(m);
    }

    private final static Operation verb_form_4_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_2);
        return verb_form_4_2(m);
    }

    private final static Operation verb_form_4_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_3);
        return verb_form_4_3(m);
    }

    private final static Operation verb_form_4_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_4);
        return verb_form_4_4(m);
    }

    private final static Operation verb_form_4_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_5);
        return verb_form_4_5(m);
    }

    private final static Operation verb_form_4_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_6);
        return verb_form_4_6(m);
    }

    private final static Operation verb_form_4_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_7);
        return verb_form_4_7(m);
    }

    private final static Operation verb_form_4_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_8);
        return verb_form_4_8(m);
    }

    private final static Operation verb_form_4_var_8(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_9);
        return verb_form_4_9(m);
    }

    private final static Operation verb_form_4_var_9(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_10);
        return verb_form_4_10(m);
    }

    private final static Operation verb_form_4_var_10(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_11);
        return verb_form_4_11(m);
    }

    private final static Operation verb_form_4_var_11(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_12);
        return verb_form_4_12(m);
    }

    private final static Operation verb_form_4_var_12(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_13);
        return verb_form_4_13(m);
    }

    private final static Operation verb_form_4_var_13(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_14);
        return verb_form_4_14(m);
    }

    private final static Operation verb_form_4_var_14(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_15);
        return verb_form_4_15(m);
    }

    private final static Operation verb_form_4_var_15(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_16);
        return verb_form_4_16(m);
    }

    private final static Operation verb_form_4_var_16(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_17);
        return verb_form_4_17(m);
    }

    private final static Operation verb_form_4_var_17(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_18);
        return verb_form_4_18(m);
    }

    private final static Operation verb_form_4_var_18(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_19);
        return verb_form_4_19(m);
    }

    private final static Operation verb_form_4_var_19(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_20);
        return verb_form_4_20(m);
    }

    private final static Operation verb_form_4_var_20(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_21);
        return verb_form_4_21(m);
    }

    private final static Operation verb_form_4_var_21(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_22);
        return verb_form_4_22(m);
    }

    private final static Operation verb_form_4_var_22(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_23);
        return verb_form_4_23(m);
    }

    private final static Operation verb_form_4_var_23(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_24);
        return verb_form_4_24(m);
    }

    private final static Operation verb_form_4_var_24(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_25);
        return verb_form_4_25(m);
    }

    private final static Operation verb_form_4_var_25(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_26);
        return verb_form_4_26(m);
    }

    private final static Operation verb_form_4_var_26(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_27);
        return verb_form_4_27(m);
    }

    private final static Operation verb_form_4_var_27(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_28);
        return verb_form_4_28(m);
    }

    private final static Operation verb_form_4_var_28(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_29);
        return verb_form_4_29(m);
    }

    private final static Operation verb_form_4_var_29(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_30);
        return verb_form_4_30(m);
    }

    private final static Operation verb_form_4_var_30(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_var_31);
        return verb_form_4_31(m);
    }

    private final static Operation verb_form_4_var_31(Prolog m) { 
        m.trust(null);
        return verb_form_4_32(m);
    }

    private final static Operation verb_form_4_int(Prolog m) { 
        m.jtry4(null, FILE_chat_parser::verb_form_4_int_1);
        return verb_form_4_1(m);
    }

    private final static Operation verb_form_4_int_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_form_4_int_2);
        return verb_form_4_2(m);
    }

    private final static Operation verb_form_4_int_2(Prolog m) { 
        m.trust(null);
        return verb_form_4_3(m);
    }

    private final static Operation verb_form_4_1(Prolog m) { 
    // verb_form(A,A,inf,B):-verb_root(A)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(A,A,inf,B):-[verb_root(A)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (!  ATOM_inf .unify(a3, m.trail))
            return m.fail();
        return //
 Op("verb_root", FILE_chat_parser::PRED_verb_root_1_static_exec, VA(a1), cont);
    }

    private final static Operation verb_form_4_2(Prolog m) { 
    // verb_form(A,A,pres+fin,B):-regular_pres(A),root_form(B),verb_root(A)
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(A,A,pres+fin,B):-[regular_pres(A),root_form(B),verb_root(A)]
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        return //
 Op("regular_pres", FILE_chat_parser::PRED_regular_pres_1_static_exec, VA(a1), //
 Op("root_form", FILE_chat_parser::PRED_root_form_1_static_exec, VA(a4), //
 Op("verb_root", FILE_chat_parser::PRED_verb_root_1_static_exec, VA(a1), cont)));
    }

    private final static Operation verb_form_4_3(Prolog m) { 
    // verb_form(A,B,past+C,D):-regular_past(A,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(A,B,past+C,D):-[regular_past(A,B)]
        a3 = a3.dref();
            if (!a3.unifyS( FUNCTOR_$002B_2 , m.trail,  ATOM_past , m.DONT_CARE1())){
                return m.fail();
            }
        return //
 Op("regular_past", FILE_chat_parser::PRED_regular_past_2_static_exec, VA(a1, a2), cont);
    }

    private final static Operation verb_form_4_4(Prolog m) { 
    // verb_form(am,be,pres+fin,1+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(am,be,pres+fin,1+sin):-[]
        if (!  ATOM_am .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_be .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s13.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_5(Prolog m) { 
    // verb_form(are,be,pres+fin,2+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(are,be,pres+fin,2+sin):-[]
        if (!  ATOM_are .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_be .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s17.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_6(Prolog m) { 
    // verb_form(is,be,pres+fin,3+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(is,be,pres+fin,3+sin):-[]
        if (!  ATOM_is .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_be .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s21.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_7(Prolog m) { 
    // verb_form(are,be,pres+fin,A+plu):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(are,be,pres+fin,A+plu):-[]
        if (!  ATOM_are .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_be .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_$002B_2 , m.trail, m.DONT_CARE1(),  ATOM_plu )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation verb_form_4_8(Prolog m) { 
    // verb_form(was,be,past+fin,1+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(was,be,past+fin,1+sin):-[]
        if (!  ATOM_was .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_be .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s25.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s13.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_9(Prolog m) { 
    // verb_form(were,be,past+fin,2+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(were,be,past+fin,2+sin):-[]
        if (!  ATOM_were .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_be .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s25.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s17.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_10(Prolog m) { 
    // verb_form(was,be,past+fin,3+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(was,be,past+fin,3+sin):-[]
        if (!  ATOM_was .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_be .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s25.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s21.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_11(Prolog m) { 
    // verb_form(were,be,past+fin,A+plu):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(were,be,past+fin,A+plu):-[]
        if (!  ATOM_were .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_be .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s25.unify(a3, m.trail))
            return m.fail();
        a4 = a4.dref();
            if (!a4.unifyS( FUNCTOR_$002B_2 , m.trail, m.DONT_CARE1(),  ATOM_plu )){
                return m.fail();
            }
        return cont;
    }

    private final static Operation verb_form_4_12(Prolog m) { 
    // verb_form(been,be,past+part,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(been,be,past+part,A):-[]
        if (!  ATOM_been .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_be .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s30.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_13(Prolog m) { 
    // verb_form(being,be,pres+part,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(being,be,pres+part,A):-[]
        if (!  ATOM_being .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_be .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s33.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_14(Prolog m) { 
    // verb_form(has,have,pres+fin,3+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(has,have,pres+fin,3+sin):-[]
        if (!  ATOM_has .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_have .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s21.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_15(Prolog m) { 
    // verb_form(having,have,pres+part,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(having,have,pres+part,A):-[]
        if (!  ATOM_having .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_have .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s33.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_16(Prolog m) { 
    // verb_form(does,do,pres+fin,3+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(does,do,pres+fin,3+sin):-[]
        if (!  ATOM_does .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_do .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s21.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_17(Prolog m) { 
    // verb_form(did,do,past+fin,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(did,do,past+fin,A):-[]
        if (!  ATOM_did .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_do .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s25.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_18(Prolog m) { 
    // verb_form(doing,do,pres+part,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(doing,do,pres+part,A):-[]
        if (!  ATOM_doing .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_do .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s33.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_19(Prolog m) { 
    // verb_form(done,do,past+part,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(done,do,past+part,A):-[]
        if (!  ATOM_done .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_do .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s30.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_20(Prolog m) { 
    // verb_form(flows,flow,pres+fin,3+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(flows,flow,pres+fin,3+sin):-[]
        if (!  ATOM_flows .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_flow .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s21.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_21(Prolog m) { 
    // verb_form(flowing,flow,pres+part,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(flowing,flow,pres+part,A):-[]
        if (!  ATOM_flowing .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_flow .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s33.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_22(Prolog m) { 
    // verb_form(rises,rise,pres+fin,3+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(rises,rise,pres+fin,3+sin):-[]
        if (!  ATOM_rises .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_rise .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s21.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_23(Prolog m) { 
    // verb_form(rose,rise,past+fin,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(rose,rise,past+fin,A):-[]
        if (!  ATOM_rose .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_rise .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s25.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_24(Prolog m) { 
    // verb_form(risen,rise,past+part,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(risen,rise,past+part,A):-[]
        if (!  ATOM_risen .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_rise .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s30.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_25(Prolog m) { 
    // verb_form(borders,border,pres+fin,3+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(borders,border,pres+fin,3+sin):-[]
        if (!  ATOM_borders .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_border .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s21.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_26(Prolog m) { 
    // verb_form(bordering,border,pres+part,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(bordering,border,pres+part,A):-[]
        if (!  ATOM_bordering .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_border .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s33.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_27(Prolog m) { 
    // verb_form(contains,contain,pres+fin,3+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(contains,contain,pres+fin,3+sin):-[]
        if (!  ATOM_contains .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_contain .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s21.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_28(Prolog m) { 
    // verb_form(containing,contain,pres+part,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(containing,contain,pres+part,A):-[]
        if (!  ATOM_containing .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_contain .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s33.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_29(Prolog m) { 
    // verb_form(drains,drain,pres+fin,3+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(drains,drain,pres+fin,3+sin):-[]
        if (!  ATOM_drains .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_drain .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s21.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_30(Prolog m) { 
    // verb_form(draining,drain,pres+part,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(draining,drain,pres+part,A):-[]
        if (!  ATOM_draining .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_drain .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s33.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_31(Prolog m) { 
    // verb_form(exceeds,exceed,pres+fin,3+sin):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(exceeds,exceed,pres+fin,3+sin):-[]
        if (!  ATOM_exceeds .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exceed .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s6.unify(a3, m.trail))
            return m.fail();
        if (! L_verb_form_4_s21.unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_form_4_32(Prolog m) { 
    // verb_form(exceeding,exceed,pres+part,A):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // verb_form(exceeding,exceed,pres+part,A):-[]
        if (!  ATOM_exceeding .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exceed .unify(a2, m.trail))
            return m.fail();
        if (! L_verb_form_4_s33.unify(a3, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: verb_type/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(verb_type/2,public)
    private static final Compound L_verb_type_2_s5 = S( FUNCTOR_$002B_2 ,  ATOM_aux ,  ATOM_have );
    private static final Compound L_verb_type_2_s8 = S( FUNCTOR_$002B_2 ,  ATOM_aux ,  ATOM_be );
    private static final Compound L_verb_type_2_s12 = S( FUNCTOR_$002B_2 ,  ATOM_aux ,  ATOM_ditrans );
    private static final Compound L_verb_type_2_s17 = S( FUNCTOR_$002B_2 ,  ATOM_main ,  ATOM_intrans );
    private static final Compound L_verb_type_2_s21 = S( FUNCTOR_$002B_2 ,  ATOM_main ,  ATOM_trans );




    public static Operation PRED_verb_type_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::verb_type_2_var, fail_0, fail_0, FILE_chat_parser::verb_type_2_var, fail_0, fail_0); 
    }

    private final static Operation verb_type_2_var(Prolog m) { 
        m.jtry2(null, FILE_chat_parser::verb_type_2_var_1);
        return verb_type_2_1(m);
    }

    private final static Operation verb_type_2_var_1(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_type_2_var_2);
        return verb_type_2_2(m);
    }

    private final static Operation verb_type_2_var_2(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_type_2_var_3);
        return verb_type_2_3(m);
    }

    private final static Operation verb_type_2_var_3(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_type_2_var_4);
        return verb_type_2_4(m);
    }

    private final static Operation verb_type_2_var_4(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_type_2_var_5);
        return verb_type_2_5(m);
    }

    private final static Operation verb_type_2_var_5(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_type_2_var_6);
        return verb_type_2_6(m);
    }

    private final static Operation verb_type_2_var_6(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_type_2_var_7);
        return verb_type_2_7(m);
    }

    private final static Operation verb_type_2_var_7(Prolog m) { 
        m.retry(null, FILE_chat_parser::verb_type_2_var_8);
        return verb_type_2_8(m);
    }

    private final static Operation verb_type_2_var_8(Prolog m) { 
        m.trust(null);
        return verb_type_2_9(m);
    }

    private final static Operation verb_type_2_1(Prolog m) { 
    // verb_type(have,aux+have):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // verb_type(have,aux+have):-[]
        if (!  ATOM_have .unify(a1, m.trail))
            return m.fail();
        if (! L_verb_type_2_s5.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_type_2_2(Prolog m) { 
    // verb_type(be,aux+be):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // verb_type(be,aux+be):-[]
        if (!  ATOM_be .unify(a1, m.trail))
            return m.fail();
        if (! L_verb_type_2_s8.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_type_2_3(Prolog m) { 
    // verb_type(do,aux+ditrans):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // verb_type(do,aux+ditrans):-[]
        if (!  ATOM_do .unify(a1, m.trail))
            return m.fail();
        if (! L_verb_type_2_s12.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_type_2_4(Prolog m) { 
    // verb_type(rise,main+intrans):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // verb_type(rise,main+intrans):-[]
        if (!  ATOM_rise .unify(a1, m.trail))
            return m.fail();
        if (! L_verb_type_2_s17.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_type_2_5(Prolog m) { 
    // verb_type(border,main+trans):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // verb_type(border,main+trans):-[]
        if (!  ATOM_border .unify(a1, m.trail))
            return m.fail();
        if (! L_verb_type_2_s21.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_type_2_6(Prolog m) { 
    // verb_type(contain,main+trans):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // verb_type(contain,main+trans):-[]
        if (!  ATOM_contain .unify(a1, m.trail))
            return m.fail();
        if (! L_verb_type_2_s21.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_type_2_7(Prolog m) { 
    // verb_type(drain,main+intrans):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // verb_type(drain,main+intrans):-[]
        if (!  ATOM_drain .unify(a1, m.trail))
            return m.fail();
        if (! L_verb_type_2_s17.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_type_2_8(Prolog m) { 
    // verb_type(exceed,main+trans):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // verb_type(exceed,main+trans):-[]
        if (!  ATOM_exceed .unify(a1, m.trail))
            return m.fail();
        if (! L_verb_type_2_s21.unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation verb_type_2_9(Prolog m) { 
    // verb_type(flow,main+intrans):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // verb_type(flow,main+intrans):-[]
        if (!  ATOM_flow .unify(a1, m.trail))
            return m.fail();
        if (! L_verb_type_2_s17.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: adverb/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/chat_parser.pl
*/
    // main(adverb/1,public)
        final static Functor ATOM_yesterday = SYM("yesterday");
        final static Functor ATOM_tomorrow = SYM("tomorrow");




    public static Operation PRED_adverb_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_chat_parser::adverb_1_var, fail_0, fail_0, FILE_chat_parser::adverb_1_var, fail_0, fail_0); 
    }

    private final static Operation adverb_1_var(Prolog m) { 
        m.jtry1(null, FILE_chat_parser::adverb_1_var_1);
        return adverb_1_1(m);
    }

    private final static Operation adverb_1_var_1(Prolog m) { 
        m.trust(null);
        return adverb_1_2(m);
    }

    private final static Operation adverb_1_1(Prolog m) { 
    // adverb(yesterday):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // adverb(yesterday):-[]
        if (!  ATOM_yesterday .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation adverb_1_2(Prolog m) { 
    // adverb(tomorrow):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // adverb(tomorrow):-[]
        if (!  ATOM_tomorrow .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_chat_parser::PRED_top_0_static_exec);
   PredTable.registerBuiltin("go",0,FILE_chat_parser::PRED_go_0_static_exec);
   PredTable.registerBuiltin("chat_parser",0,FILE_chat_parser::PRED_chat_parser_0_static_exec);
   PredTable.registerBuiltin("my_string",1,FILE_chat_parser::PRED_my_string_1_static_exec);
   PredTable.registerBuiltin("determinate_say",2,FILE_chat_parser::PRED_determinate_say_2_static_exec);
   PredTable.registerBuiltin("terminal",5,FILE_chat_parser::PRED_terminal_5_static_exec);
   PredTable.registerBuiltin("gap",1,FILE_chat_parser::PRED_gap_1_static_exec);
   PredTable.registerBuiltin("virtual",3,FILE_chat_parser::PRED_virtual_3_static_exec);
   PredTable.registerBuiltin("is_pp",1,FILE_chat_parser::PRED_is_pp_1_static_exec);
   PredTable.registerBuiltin("is_pred",1,FILE_chat_parser::PRED_is_pred_1_static_exec);
   PredTable.registerBuiltin("is_trace",1,FILE_chat_parser::PRED_is_trace_1_static_exec);
   PredTable.registerBuiltin("is_adv",1,FILE_chat_parser::PRED_is_adv_1_static_exec);
   PredTable.registerBuiltin("trace1",2,FILE_chat_parser::PRED_trace1_2_static_exec);
   PredTable.registerBuiltin("trace1",1,FILE_chat_parser::PRED_trace1_1_static_exec);
   PredTable.registerBuiltin("adv",1,FILE_chat_parser::PRED_adv_1_static_exec);
   PredTable.registerBuiltin("empty",1,FILE_chat_parser::PRED_empty_1_static_exec);
   PredTable.registerBuiltin("np_all",1,FILE_chat_parser::PRED_np_all_1_static_exec);
   PredTable.registerBuiltin("s_all",1,FILE_chat_parser::PRED_s_all_1_static_exec);
   PredTable.registerBuiltin("np_no_trace",1,FILE_chat_parser::PRED_np_no_trace_1_static_exec);
   PredTable.registerBuiltin("myplus",3,FILE_chat_parser::PRED_myplus_3_static_exec);
   PredTable.registerBuiltin("minus",3,FILE_chat_parser::PRED_minus_3_static_exec);
   PredTable.registerBuiltin("or",3,FILE_chat_parser::PRED_or_3_static_exec);
   PredTable.registerBuiltin("anot",3,FILE_chat_parser::PRED_anot_3_static_exec);
   PredTable.registerBuiltin("role",3,FILE_chat_parser::PRED_role_3_static_exec);
   PredTable.registerBuiltin("subj_case",1,FILE_chat_parser::PRED_subj_case_1_static_exec);
   PredTable.registerBuiltin("verb_case",1,FILE_chat_parser::PRED_verb_case_1_static_exec);
   PredTable.registerBuiltin("prep_case",1,FILE_chat_parser::PRED_prep_case_1_static_exec);
   PredTable.registerBuiltin("compl_case",1,FILE_chat_parser::PRED_compl_case_1_static_exec);
   PredTable.registerBuiltin("say",2,FILE_chat_parser::PRED_say_2_static_exec);
   PredTable.registerBuiltin("sentence",5,FILE_chat_parser::PRED_sentence_5_static_exec);
   PredTable.registerBuiltin("pp",8,FILE_chat_parser::PRED_pp_8_static_exec);
   PredTable.registerBuiltin("topic",4,FILE_chat_parser::PRED_topic_4_static_exec);
   PredTable.registerBuiltin("opt_comma",4,FILE_chat_parser::PRED_opt_comma_4_static_exec);
   PredTable.registerBuiltin("declarative",5,FILE_chat_parser::PRED_declarative_5_static_exec);
   PredTable.registerBuiltin("wh_question",5,FILE_chat_parser::PRED_wh_question_5_static_exec);
   PredTable.registerBuiltin("np",11,FILE_chat_parser::PRED_np_11_static_exec);
   PredTable.registerBuiltin("variable_q",8,FILE_chat_parser::PRED_variable_q_8_static_exec);
   PredTable.registerBuiltin("adv_phrase",7,FILE_chat_parser::PRED_adv_phrase_7_static_exec);
   PredTable.registerBuiltin("predicate",7,FILE_chat_parser::PRED_predicate_7_static_exec);
   PredTable.registerBuiltin("whq",8,FILE_chat_parser::PRED_whq_8_static_exec);
   PredTable.registerBuiltin("int_det",6,FILE_chat_parser::PRED_int_det_6_static_exec);
   PredTable.registerBuiltin("gen_marker",4,FILE_chat_parser::PRED_gen_marker_4_static_exec);
   PredTable.registerBuiltin("whose",6,FILE_chat_parser::PRED_whose_6_static_exec);
   PredTable.registerBuiltin("question",7,FILE_chat_parser::PRED_question_7_static_exec);
   PredTable.registerBuiltin("det",7,FILE_chat_parser::PRED_det_7_static_exec);
   PredTable.registerBuiltin("int_art",6,FILE_chat_parser::PRED_int_art_6_static_exec);
   PredTable.registerBuiltin("subj_question",1,FILE_chat_parser::PRED_subj_question_1_static_exec);
   PredTable.registerBuiltin("yn_question",5,FILE_chat_parser::PRED_yn_question_5_static_exec);
   PredTable.registerBuiltin("verb_form",8,FILE_chat_parser::PRED_verb_form_8_static_exec);
   PredTable.registerBuiltin("neg",6,FILE_chat_parser::PRED_neg_6_static_exec);
   PredTable.registerBuiltin("fronted_verb",6,FILE_chat_parser::PRED_fronted_verb_6_static_exec);
   PredTable.registerBuiltin("imperative",5,FILE_chat_parser::PRED_imperative_5_static_exec);
   PredTable.registerBuiltin("imperative_verb",4,FILE_chat_parser::PRED_imperative_verb_4_static_exec);
   PredTable.registerBuiltin("s",6,FILE_chat_parser::PRED_s_6_static_exec);
   PredTable.registerBuiltin("subj",7,FILE_chat_parser::PRED_subj_7_static_exec);
   PredTable.registerBuiltin("np_head",9,FILE_chat_parser::PRED_np_head_9_static_exec);
   PredTable.registerBuiltin("np_head0",7,FILE_chat_parser::PRED_np_head0_7_static_exec);
   PredTable.registerBuiltin("np_compls",10,FILE_chat_parser::PRED_np_compls_10_static_exec);
   PredTable.registerBuiltin("possessive",14,FILE_chat_parser::PRED_possessive_14_static_exec);
   PredTable.registerBuiltin("gen_case",4,FILE_chat_parser::PRED_gen_case_4_static_exec);
   PredTable.registerBuiltin("an_s",4,FILE_chat_parser::PRED_an_s_4_static_exec);
   PredTable.registerBuiltin("determiner",7,FILE_chat_parser::PRED_determiner_7_static_exec);
   PredTable.registerBuiltin("quant_phrase",7,FILE_chat_parser::PRED_quant_phrase_7_static_exec);
   PredTable.registerBuiltin("quant",6,FILE_chat_parser::PRED_quant_6_static_exec);
   PredTable.registerBuiltin("neg_adv",6,FILE_chat_parser::PRED_neg_adv_6_static_exec);
   PredTable.registerBuiltin("sup_op",2,FILE_chat_parser::PRED_sup_op_2_static_exec);
   PredTable.registerBuiltin("np_mods",12,FILE_chat_parser::PRED_np_mods_12_static_exec);
   PredTable.registerBuiltin("np_mod",9,FILE_chat_parser::PRED_np_mod_9_static_exec);
   PredTable.registerBuiltin("verb_mods",8,FILE_chat_parser::PRED_verb_mods_8_static_exec);
   PredTable.registerBuiltin("verb_mod",7,FILE_chat_parser::PRED_verb_mod_7_static_exec);
   PredTable.registerBuiltin("adjs",5,FILE_chat_parser::PRED_adjs_5_static_exec);
   PredTable.registerBuiltin("pre_adj",5,FILE_chat_parser::PRED_pre_adj_5_static_exec);
   PredTable.registerBuiltin("sup_phrase",5,FILE_chat_parser::PRED_sup_phrase_5_static_exec);
   PredTable.registerBuiltin("comp_phrase",6,FILE_chat_parser::PRED_comp_phrase_6_static_exec);
   PredTable.registerBuiltin("comp",6,FILE_chat_parser::PRED_comp_6_static_exec);
   PredTable.registerBuiltin("relative",9,FILE_chat_parser::PRED_relative_9_static_exec);
   PredTable.registerBuiltin("rel_conj",8,FILE_chat_parser::PRED_rel_conj_8_static_exec);
   PredTable.registerBuiltin("rel_rest",10,FILE_chat_parser::PRED_rel_rest_10_static_exec);
   PredTable.registerBuiltin("rel",7,FILE_chat_parser::PRED_rel_7_static_exec);
   PredTable.registerBuiltin("variable",6,FILE_chat_parser::PRED_variable_6_static_exec);
   PredTable.registerBuiltin("wh",9,FILE_chat_parser::PRED_wh_9_static_exec);
   PredTable.registerBuiltin("reduced_relative",8,FILE_chat_parser::PRED_reduced_relative_8_static_exec);
   PredTable.registerBuiltin("reduced_rel_conj",8,FILE_chat_parser::PRED_reduced_rel_conj_8_static_exec);
   PredTable.registerBuiltin("reduced_rel_rest",10,FILE_chat_parser::PRED_reduced_rel_rest_10_static_exec);
   PredTable.registerBuiltin("reduced_rel",7,FILE_chat_parser::PRED_reduced_rel_7_static_exec);
   PredTable.registerBuiltin("reduced_wh",6,FILE_chat_parser::PRED_reduced_wh_6_static_exec);
   PredTable.registerBuiltin("verb",8,FILE_chat_parser::PRED_verb_8_static_exec);
   PredTable.registerBuiltin("rest_verb",9,FILE_chat_parser::PRED_rest_verb_9_static_exec);
   PredTable.registerBuiltin("have",8,FILE_chat_parser::PRED_have_8_static_exec);
   PredTable.registerBuiltin("be",9,FILE_chat_parser::PRED_be_9_static_exec);
   PredTable.registerBuiltin("passive",7,FILE_chat_parser::PRED_passive_7_static_exec);
   PredTable.registerBuiltin("participle",7,FILE_chat_parser::PRED_participle_7_static_exec);
   PredTable.registerBuiltin("passive",1,FILE_chat_parser::PRED_passive_1_static_exec);
   PredTable.registerBuiltin("participle",3,FILE_chat_parser::PRED_participle_3_static_exec);
   PredTable.registerBuiltin("close",4,FILE_chat_parser::PRED_close_4_static_exec);
   PredTable.registerBuiltin("myopen",4,FILE_chat_parser::PRED_myopen_4_static_exec);
   PredTable.registerBuiltin("verb_args",9,FILE_chat_parser::PRED_verb_args_9_static_exec);
   PredTable.registerBuiltin("object",8,FILE_chat_parser::PRED_object_8_static_exec);
   PredTable.registerBuiltin("obj",8,FILE_chat_parser::PRED_obj_8_static_exec);
   PredTable.registerBuiltin("pred_conj",7,FILE_chat_parser::PRED_pred_conj_7_static_exec);
   PredTable.registerBuiltin("pred_rest",9,FILE_chat_parser::PRED_pred_rest_9_static_exec);
   PredTable.registerBuiltin("verb_arg",7,FILE_chat_parser::PRED_verb_arg_7_static_exec);
   PredTable.registerBuiltin("advs",7,FILE_chat_parser::PRED_advs_7_static_exec);
   PredTable.registerBuiltin("adj_phrase",6,FILE_chat_parser::PRED_adj_phrase_6_static_exec);
   PredTable.registerBuiltin("no_args",1,FILE_chat_parser::PRED_no_args_1_static_exec);
   PredTable.registerBuiltin("conj",9,FILE_chat_parser::PRED_conj_9_static_exec);
   PredTable.registerBuiltin("noun",6,FILE_chat_parser::PRED_noun_6_static_exec);
   PredTable.registerBuiltin("adj",6,FILE_chat_parser::PRED_adj_6_static_exec);
   PredTable.registerBuiltin("prep",5,FILE_chat_parser::PRED_prep_5_static_exec);
   PredTable.registerBuiltin("rel_adj",5,FILE_chat_parser::PRED_rel_adj_5_static_exec);
   PredTable.registerBuiltin("sup_adj",5,FILE_chat_parser::PRED_sup_adj_5_static_exec);
   PredTable.registerBuiltin("comp_adv",5,FILE_chat_parser::PRED_comp_adv_5_static_exec);
   PredTable.registerBuiltin("sup_adv",5,FILE_chat_parser::PRED_sup_adv_5_static_exec);
   PredTable.registerBuiltin("rel_pron",5,FILE_chat_parser::PRED_rel_pron_5_static_exec);
   PredTable.registerBuiltin("name",5,FILE_chat_parser::PRED_name_5_static_exec);
   PredTable.registerBuiltin("int_art",7,FILE_chat_parser::PRED_int_art_7_static_exec);
   PredTable.registerBuiltin("int_pron",5,FILE_chat_parser::PRED_int_pron_5_static_exec);
   PredTable.registerBuiltin("adverb",5,FILE_chat_parser::PRED_adverb_5_static_exec);
   PredTable.registerBuiltin("poss_pron",6,FILE_chat_parser::PRED_poss_pron_6_static_exec);
   PredTable.registerBuiltin("pers_pron",7,FILE_chat_parser::PRED_pers_pron_7_static_exec);
   PredTable.registerBuiltin("quantifier_pron",6,FILE_chat_parser::PRED_quantifier_pron_6_static_exec);
   PredTable.registerBuiltin("context_pron",6,FILE_chat_parser::PRED_context_pron_6_static_exec);
   PredTable.registerBuiltin("number",6,FILE_chat_parser::PRED_number_6_static_exec);
   PredTable.registerBuiltin("terminator",5,FILE_chat_parser::PRED_terminator_5_static_exec);
   PredTable.registerBuiltin("opt_the",4,FILE_chat_parser::PRED_opt_the_4_static_exec);
   PredTable.registerBuiltin("conj",7,FILE_chat_parser::PRED_conj_7_static_exec);
   PredTable.registerBuiltin("loc_pred",5,FILE_chat_parser::PRED_loc_pred_5_static_exec);
   PredTable.registerBuiltin("~","$007E",5,FILE_chat_parser::PRED_$007E_5_static_exec);
   PredTable.registerBuiltin("word",1,FILE_chat_parser::PRED_word_1_static_exec);
   PredTable.registerBuiltin("~","$007E",1,FILE_chat_parser::PRED_$007E_1_static_exec);
   PredTable.registerBuiltin("conj",1,FILE_chat_parser::PRED_conj_1_static_exec);
   PredTable.registerBuiltin("int_pron",2,FILE_chat_parser::PRED_int_pron_2_static_exec);
   PredTable.registerBuiltin("int_art",4,FILE_chat_parser::PRED_int_art_4_static_exec);
   PredTable.registerBuiltin("det",4,FILE_chat_parser::PRED_det_4_static_exec);
   PredTable.registerBuiltin("number",3,FILE_chat_parser::PRED_number_3_static_exec);
   PredTable.registerBuiltin("tr_number",2,FILE_chat_parser::PRED_tr_number_2_static_exec);
   PredTable.registerBuiltin("ag_number",2,FILE_chat_parser::PRED_ag_number_2_static_exec);
   PredTable.registerBuiltin("quantifier_pron",3,FILE_chat_parser::PRED_quantifier_pron_3_static_exec);
   PredTable.registerBuiltin("prep",1,FILE_chat_parser::PRED_prep_1_static_exec);
   PredTable.registerBuiltin("noun_form",3,FILE_chat_parser::PRED_noun_form_3_static_exec);
   PredTable.registerBuiltin("root_form",1,FILE_chat_parser::PRED_root_form_1_static_exec);
   PredTable.registerBuiltin("verb_root",1,FILE_chat_parser::PRED_verb_root_1_static_exec);
   PredTable.registerBuiltin("regular_pres",1,FILE_chat_parser::PRED_regular_pres_1_static_exec);
   PredTable.registerBuiltin("regular_past",2,FILE_chat_parser::PRED_regular_past_2_static_exec);
   PredTable.registerBuiltin("rel_pron",2,FILE_chat_parser::PRED_rel_pron_2_static_exec);
   PredTable.registerBuiltin("poss_pron",4,FILE_chat_parser::PRED_poss_pron_4_static_exec);
   PredTable.registerBuiltin("pers_pron",5,FILE_chat_parser::PRED_pers_pron_5_static_exec);
   PredTable.registerBuiltin("terminator",2,FILE_chat_parser::PRED_terminator_2_static_exec);
   PredTable.registerBuiltin("name",1,FILE_chat_parser::PRED_name_1_static_exec);
   PredTable.registerBuiltin("loc_pred",2,FILE_chat_parser::PRED_loc_pred_2_static_exec);
   PredTable.registerBuiltin("adj",2,FILE_chat_parser::PRED_adj_2_static_exec);
   PredTable.registerBuiltin("rel_adj",2,FILE_chat_parser::PRED_rel_adj_2_static_exec);
   PredTable.registerBuiltin("sup_adj",2,FILE_chat_parser::PRED_sup_adj_2_static_exec);
   PredTable.registerBuiltin("noun_sin",1,FILE_chat_parser::PRED_noun_sin_1_static_exec);
   PredTable.registerBuiltin("noun_plu",2,FILE_chat_parser::PRED_noun_plu_2_static_exec);
   PredTable.registerBuiltin("verb_form",4,FILE_chat_parser::PRED_verb_form_4_static_exec);
   PredTable.registerBuiltin("verb_type",2,FILE_chat_parser::PRED_verb_type_2_static_exec);
   PredTable.registerBuiltin("adverb",1,FILE_chat_parser::PRED_adverb_1_static_exec);
}
}

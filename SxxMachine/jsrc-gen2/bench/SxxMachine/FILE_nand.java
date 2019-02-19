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
public class FILE_nand extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(top/0,public)




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-main(0)
        m.setB0();
    // top:-[main(0)]
        return //
 Op("main", FILE_nand::PRED_main_1_static_exec, VA( int_0 ), cont);
    }
/** PREDICATE: main/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(main/1,public)




    public static Operation PRED_main_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_nand::main_1_sub_1);
        return main_1_1(m);
    }

    private final static Operation main_1_sub_1(Prolog m) { 
        m.trust(null);
        return main_1_2(m);
    }

    private final static Operation main_1_1(Prolog m) { 
    // main(A):-init_state(A,B,C,D),add_necessary_functions(B,C,D,E,F),test_bounds(B,E,F),search(B,E,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // main(A):-[init_state(A,B,C,D),add_necessary_functions(B,C,D,E,F),test_bounds(B,E,F),search(B,E,F)]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        return //
 Op("init_state", FILE_nand::PRED_init_state_4_static_exec, VA(a1, a2, a3, a4), //
 Op("add_necessary_functions", FILE_nand::PRED_add_necessary_functions_5_static_exec, VA(a2, a3, a4, a5, a6), //
 Op("test_bounds", FILE_nand::PRED_test_bounds_3_static_exec, VA(a2, a5, a6), //
 Op("search", FILE_nand::PRED_search_3_static_exec, VA(a2, a5, a6), cont))));
    }

    private final static Operation main_1_2(Prolog m) { 
    // main(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // main(A):-[]
        return cont;
    }
/** PREDICATE: init_state/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(init_state/4,public)
        final static Functor FUNCTOR_function_8 = F("function",8);
    private static final Compound L_init_state_4_s7 = CONS( int_2 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s8 = CONS( int_1 , L_init_state_4_s7);
    private static final Compound L_init_state_4_s9 = CONS( int_3 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s10 = CONS( int_0 , L_init_state_4_s9);
    private static final Compound L_init_state_4_s12 = S( FUNCTOR_function_8 ,  int_2 , L_init_state_4_s8, L_init_state_4_s10,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s13 = CONS( int_2 , L_init_state_4_s9);
    private static final Compound L_init_state_4_s14 = CONS( int_1 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s15 = CONS( int_0 , L_init_state_4_s14);
    private static final Compound L_init_state_4_s17 = S( FUNCTOR_function_8 ,  int_1 , L_init_state_4_s13, L_init_state_4_s15,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s18 = CONS( int_1 , L_init_state_4_s9);
    private static final Compound L_init_state_4_s19 = CONS( int_0 , L_init_state_4_s7);
    private static final Compound L_init_state_4_s21 = S( FUNCTOR_function_8 ,  int_0 , L_init_state_4_s18, L_init_state_4_s19,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s22 = CONS(L_init_state_4_s21,  Prolog.Nil );
    private static final Compound L_init_state_4_s23 = CONS(L_init_state_4_s17, L_init_state_4_s22);
    private static final Compound L_init_state_4_s24 = CONS(L_init_state_4_s12, L_init_state_4_s23);
        final static NumberTerm int_100 = Integer(100);
    private static final Compound L_init_state_4_s30 = CONS( int_7 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s31 = CONS( int_6 , L_init_state_4_s30);
    private static final Compound L_init_state_4_s32 = CONS( int_5 , L_init_state_4_s31);
    private static final Compound L_init_state_4_s33 = CONS( int_3 , L_init_state_4_s32);
    private static final Compound L_init_state_4_s34 = CONS( int_4 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s35 = CONS( int_2 , L_init_state_4_s34);
    private static final Compound L_init_state_4_s36 = CONS( int_1 , L_init_state_4_s35);
    private static final Compound L_init_state_4_s37 = CONS( int_0 , L_init_state_4_s36);
    private static final Compound L_init_state_4_s39 = S( FUNCTOR_function_8 ,  int_3 , L_init_state_4_s33, L_init_state_4_s37,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s40 = CONS( int_4 , L_init_state_4_s32);
    private static final Compound L_init_state_4_s41 = CONS( int_1 , L_init_state_4_s13);
    private static final Compound L_init_state_4_s42 = CONS( int_0 , L_init_state_4_s41);
    private static final Compound L_init_state_4_s44 = S( FUNCTOR_function_8 ,  int_2 , L_init_state_4_s40, L_init_state_4_s42,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s45 = CONS( int_3 , L_init_state_4_s31);
    private static final Compound L_init_state_4_s46 = CONS( int_2 , L_init_state_4_s45);
    private static final Compound L_init_state_4_s47 = CONS( int_5 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s48 = CONS( int_4 , L_init_state_4_s47);
    private static final Compound L_init_state_4_s49 = CONS( int_1 , L_init_state_4_s48);
    private static final Compound L_init_state_4_s50 = CONS( int_0 , L_init_state_4_s49);
    private static final Compound L_init_state_4_s52 = S( FUNCTOR_function_8 ,  int_1 , L_init_state_4_s46, L_init_state_4_s50,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s53 = CONS( int_5 , L_init_state_4_s30);
    private static final Compound L_init_state_4_s54 = CONS( int_3 , L_init_state_4_s53);
    private static final Compound L_init_state_4_s55 = CONS( int_1 , L_init_state_4_s54);
    private static final Compound L_init_state_4_s56 = CONS( int_6 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s57 = CONS( int_4 , L_init_state_4_s56);
    private static final Compound L_init_state_4_s58 = CONS( int_2 , L_init_state_4_s57);
    private static final Compound L_init_state_4_s59 = CONS( int_0 , L_init_state_4_s58);
    private static final Compound L_init_state_4_s61 = S( FUNCTOR_function_8 ,  int_0 , L_init_state_4_s55, L_init_state_4_s59,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s62 = CONS(L_init_state_4_s61,  Prolog.Nil );
    private static final Compound L_init_state_4_s63 = CONS(L_init_state_4_s52, L_init_state_4_s62);
    private static final Compound L_init_state_4_s64 = CONS(L_init_state_4_s44, L_init_state_4_s63);
    private static final Compound L_init_state_4_s65 = CONS(L_init_state_4_s39, L_init_state_4_s64);
    private static final Compound L_init_state_4_s66 = CONS( int_4 , L_init_state_4_s31);
    private static final Compound L_init_state_4_s67 = CONS( int_2 , L_init_state_4_s66);
    private static final Compound L_init_state_4_s68 = CONS( int_1 , L_init_state_4_s67);
    private static final Compound L_init_state_4_s69 = CONS( int_3 , L_init_state_4_s47);
    private static final Compound L_init_state_4_s70 = CONS( int_0 , L_init_state_4_s69);
    private static final Compound L_init_state_4_s72 = S( FUNCTOR_function_8 ,  int_3 , L_init_state_4_s68, L_init_state_4_s70,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s73 = CONS(L_init_state_4_s72, L_init_state_4_s64);
    private static final Compound L_init_state_4_s74 = CONS( int_4 , L_init_state_4_s30);
    private static final Compound L_init_state_4_s75 = CONS( int_2 , L_init_state_4_s74);
    private static final Compound L_init_state_4_s76 = CONS( int_1 , L_init_state_4_s75);
    private static final Compound L_init_state_4_s77 = CONS( int_5 , L_init_state_4_s56);
    private static final Compound L_init_state_4_s78 = CONS( int_3 , L_init_state_4_s77);
    private static final Compound L_init_state_4_s79 = CONS( int_0 , L_init_state_4_s78);
    private static final Compound L_init_state_4_s81 = S( FUNCTOR_function_8 ,  int_3 , L_init_state_4_s76, L_init_state_4_s79,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s82 = CONS(L_init_state_4_s81, L_init_state_4_s64);
    private static final Compound L_init_state_4_s84 = S( FUNCTOR_function_8 ,  int_4 , L_init_state_4_s33, L_init_state_4_s37,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s85 = CONS(L_init_state_4_s84, L_init_state_4_s82);
        final static NumberTerm int_26 = Integer(26);
        final static NumberTerm int_29 = Integer(29);
        final static NumberTerm int_31 = Integer(31);
    private static final Compound L_init_state_4_s99 = CONS( int_31 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s100 = CONS( int_29 , L_init_state_4_s99);
    private static final Compound L_init_state_4_s101 = CONS( int_26 , L_init_state_4_s100);
    private static final Compound L_init_state_4_s102 = CONS( int_24 , L_init_state_4_s101);
    private static final Compound L_init_state_4_s103 = CONS( int_23 , L_init_state_4_s102);
    private static final Compound L_init_state_4_s104 = CONS( int_21 , L_init_state_4_s103);
    private static final Compound L_init_state_4_s105 = CONS( int_18 , L_init_state_4_s104);
    private static final Compound L_init_state_4_s106 = CONS( int_16 , L_init_state_4_s105);
    private static final Compound L_init_state_4_s107 = CONS( int_14 , L_init_state_4_s106);
    private static final Compound L_init_state_4_s108 = CONS( int_12 , L_init_state_4_s107);
    private static final Compound L_init_state_4_s109 = CONS( int_11 , L_init_state_4_s108);
    private static final Compound L_init_state_4_s110 = CONS( int_9 , L_init_state_4_s109);
    private static final Compound L_init_state_4_s111 = CONS( int_6 , L_init_state_4_s110);
    private static final Compound L_init_state_4_s112 = CONS( int_4 , L_init_state_4_s111);
    private static final Compound L_init_state_4_s113 = CONS( int_3 , L_init_state_4_s112);
    private static final Compound L_init_state_4_s114 = CONS( int_1 , L_init_state_4_s113);
        final static NumberTerm int_27 = Integer(27);
        final static NumberTerm int_28 = Integer(28);
        final static NumberTerm int_30 = Integer(30);
    private static final Compound L_init_state_4_s126 = CONS( int_30 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s127 = CONS( int_28 , L_init_state_4_s126);
    private static final Compound L_init_state_4_s128 = CONS( int_27 , L_init_state_4_s127);
    private static final Compound L_init_state_4_s129 = CONS( int_25 , L_init_state_4_s128);
    private static final Compound L_init_state_4_s130 = CONS( int_22 , L_init_state_4_s129);
    private static final Compound L_init_state_4_s131 = CONS( int_20 , L_init_state_4_s130);
    private static final Compound L_init_state_4_s132 = CONS( int_19 , L_init_state_4_s131);
    private static final Compound L_init_state_4_s133 = CONS( int_17 , L_init_state_4_s132);
    private static final Compound L_init_state_4_s134 = CONS( int_15 , L_init_state_4_s133);
    private static final Compound L_init_state_4_s135 = CONS( int_13 , L_init_state_4_s134);
    private static final Compound L_init_state_4_s136 = CONS( int_10 , L_init_state_4_s135);
    private static final Compound L_init_state_4_s137 = CONS( int_8 , L_init_state_4_s136);
    private static final Compound L_init_state_4_s138 = CONS( int_7 , L_init_state_4_s137);
    private static final Compound L_init_state_4_s139 = CONS( int_5 , L_init_state_4_s138);
    private static final Compound L_init_state_4_s140 = CONS( int_2 , L_init_state_4_s139);
    private static final Compound L_init_state_4_s141 = CONS( int_0 , L_init_state_4_s140);
    private static final Compound L_init_state_4_s143 = S( FUNCTOR_function_8 ,  int_7 , L_init_state_4_s114, L_init_state_4_s141,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s144 = CONS( int_30 , L_init_state_4_s99);
    private static final Compound L_init_state_4_s145 = CONS( int_27 , L_init_state_4_s144);
    private static final Compound L_init_state_4_s146 = CONS( int_24 , L_init_state_4_s145);
    private static final Compound L_init_state_4_s147 = CONS( int_21 , L_init_state_4_s146);
    private static final Compound L_init_state_4_s148 = CONS( int_20 , L_init_state_4_s147);
    private static final Compound L_init_state_4_s149 = CONS( int_18 , L_init_state_4_s148);
    private static final Compound L_init_state_4_s150 = CONS( int_17 , L_init_state_4_s149);
    private static final Compound L_init_state_4_s151 = CONS( int_15 , L_init_state_4_s150);
    private static final Compound L_init_state_4_s152 = CONS( int_12 , L_init_state_4_s151);
    private static final Compound L_init_state_4_s153 = CONS( int_9 , L_init_state_4_s152);
    private static final Compound L_init_state_4_s154 = CONS( int_8 , L_init_state_4_s153);
    private static final Compound L_init_state_4_s155 = CONS( int_6 , L_init_state_4_s154);
    private static final Compound L_init_state_4_s156 = CONS( int_5 , L_init_state_4_s155);
    private static final Compound L_init_state_4_s157 = CONS( int_3 , L_init_state_4_s156);
    private static final Compound L_init_state_4_s158 = CONS( int_2 , L_init_state_4_s157);
    private static final Compound L_init_state_4_s159 = CONS( int_29 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s160 = CONS( int_28 , L_init_state_4_s159);
    private static final Compound L_init_state_4_s161 = CONS( int_26 , L_init_state_4_s160);
    private static final Compound L_init_state_4_s162 = CONS( int_25 , L_init_state_4_s161);
    private static final Compound L_init_state_4_s163 = CONS( int_23 , L_init_state_4_s162);
    private static final Compound L_init_state_4_s164 = CONS( int_22 , L_init_state_4_s163);
    private static final Compound L_init_state_4_s165 = CONS( int_19 , L_init_state_4_s164);
    private static final Compound L_init_state_4_s166 = CONS( int_16 , L_init_state_4_s165);
    private static final Compound L_init_state_4_s167 = CONS( int_14 , L_init_state_4_s166);
    private static final Compound L_init_state_4_s168 = CONS( int_13 , L_init_state_4_s167);
    private static final Compound L_init_state_4_s169 = CONS( int_11 , L_init_state_4_s168);
    private static final Compound L_init_state_4_s170 = CONS( int_10 , L_init_state_4_s169);
    private static final Compound L_init_state_4_s171 = CONS( int_7 , L_init_state_4_s170);
    private static final Compound L_init_state_4_s172 = CONS( int_4 , L_init_state_4_s171);
    private static final Compound L_init_state_4_s173 = CONS( int_1 , L_init_state_4_s172);
    private static final Compound L_init_state_4_s174 = CONS( int_0 , L_init_state_4_s173);
    private static final Compound L_init_state_4_s176 = S( FUNCTOR_function_8 ,  int_6 , L_init_state_4_s158, L_init_state_4_s174,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s177 = CONS( int_29 , L_init_state_4_s144);
    private static final Compound L_init_state_4_s178 = CONS( int_28 , L_init_state_4_s177);
    private static final Compound L_init_state_4_s179 = CONS( int_27 , L_init_state_4_s178);
    private static final Compound L_init_state_4_s180 = CONS( int_26 , L_init_state_4_s179);
    private static final Compound L_init_state_4_s181 = CONS( int_25 , L_init_state_4_s180);
    private static final Compound L_init_state_4_s182 = CONS( int_23 , L_init_state_4_s181);
    private static final Compound L_init_state_4_s183 = CONS( int_22 , L_init_state_4_s182);
    private static final Compound L_init_state_4_s184 = CONS( int_19 , L_init_state_4_s183);
    private static final Compound L_init_state_4_s185 = CONS( int_15 , L_init_state_4_s184);
    private static final Compound L_init_state_4_s186 = CONS( int_14 , L_init_state_4_s185);
    private static final Compound L_init_state_4_s187 = CONS( int_13 , L_init_state_4_s186);
    private static final Compound L_init_state_4_s188 = CONS( int_11 , L_init_state_4_s187);
    private static final Compound L_init_state_4_s189 = CONS( int_10 , L_init_state_4_s188);
    private static final Compound L_init_state_4_s190 = CONS( int_7 , L_init_state_4_s189);
    private static final Compound L_init_state_4_s191 = CONS( int_24 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s192 = CONS( int_21 , L_init_state_4_s191);
    private static final Compound L_init_state_4_s193 = CONS( int_20 , L_init_state_4_s192);
    private static final Compound L_init_state_4_s194 = CONS( int_18 , L_init_state_4_s193);
    private static final Compound L_init_state_4_s195 = CONS( int_17 , L_init_state_4_s194);
    private static final Compound L_init_state_4_s196 = CONS( int_16 , L_init_state_4_s195);
    private static final Compound L_init_state_4_s197 = CONS( int_12 , L_init_state_4_s196);
    private static final Compound L_init_state_4_s198 = CONS( int_9 , L_init_state_4_s197);
    private static final Compound L_init_state_4_s199 = CONS( int_8 , L_init_state_4_s198);
    private static final Compound L_init_state_4_s200 = CONS( int_6 , L_init_state_4_s199);
    private static final Compound L_init_state_4_s201 = CONS( int_5 , L_init_state_4_s200);
    private static final Compound L_init_state_4_s202 = CONS( int_4 , L_init_state_4_s201);
    private static final Compound L_init_state_4_s203 = CONS( int_3 , L_init_state_4_s202);
    private static final Compound L_init_state_4_s204 = CONS( int_2 , L_init_state_4_s203);
    private static final Compound L_init_state_4_s205 = CONS( int_1 , L_init_state_4_s204);
    private static final Compound L_init_state_4_s206 = CONS( int_0 , L_init_state_4_s205);
    private static final Compound L_init_state_4_s208 = S( FUNCTOR_function_8 ,  int_5 , L_init_state_4_s190, L_init_state_4_s206,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s209 = CONS( int_24 , L_init_state_4_s181);
    private static final Compound L_init_state_4_s210 = CONS( int_23 , L_init_state_4_s209);
    private static final Compound L_init_state_4_s211 = CONS( int_22 , L_init_state_4_s210);
    private static final Compound L_init_state_4_s212 = CONS( int_21 , L_init_state_4_s211);
    private static final Compound L_init_state_4_s213 = CONS( int_20 , L_init_state_4_s212);
    private static final Compound L_init_state_4_s214 = CONS( int_19 , L_init_state_4_s213);
    private static final Compound L_init_state_4_s215 = CONS( int_18 , L_init_state_4_s214);
    private static final Compound L_init_state_4_s216 = CONS( int_17 , L_init_state_4_s215);
    private static final Compound L_init_state_4_s217 = CONS( int_16 , L_init_state_4_s216);
    private static final Compound L_init_state_4_s218 = CONS( int_15 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s219 = CONS( int_14 , L_init_state_4_s218);
    private static final Compound L_init_state_4_s220 = CONS( int_13 , L_init_state_4_s219);
    private static final Compound L_init_state_4_s221 = CONS( int_12 , L_init_state_4_s220);
    private static final Compound L_init_state_4_s222 = CONS( int_11 , L_init_state_4_s221);
    private static final Compound L_init_state_4_s223 = CONS( int_10 , L_init_state_4_s222);
    private static final Compound L_init_state_4_s224 = CONS( int_9 , L_init_state_4_s223);
    private static final Compound L_init_state_4_s225 = CONS( int_8 , L_init_state_4_s224);
    private static final Compound L_init_state_4_s226 = CONS( int_7 , L_init_state_4_s225);
    private static final Compound L_init_state_4_s227 = CONS( int_6 , L_init_state_4_s226);
    private static final Compound L_init_state_4_s228 = CONS( int_5 , L_init_state_4_s227);
    private static final Compound L_init_state_4_s229 = CONS( int_4 , L_init_state_4_s228);
    private static final Compound L_init_state_4_s230 = CONS( int_3 , L_init_state_4_s229);
    private static final Compound L_init_state_4_s231 = CONS( int_2 , L_init_state_4_s230);
    private static final Compound L_init_state_4_s232 = CONS( int_1 , L_init_state_4_s231);
    private static final Compound L_init_state_4_s233 = CONS( int_0 , L_init_state_4_s232);
    private static final Compound L_init_state_4_s235 = S( FUNCTOR_function_8 ,  int_4 , L_init_state_4_s217, L_init_state_4_s233,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s236 = CONS( int_15 , L_init_state_4_s209);
    private static final Compound L_init_state_4_s237 = CONS( int_14 , L_init_state_4_s236);
    private static final Compound L_init_state_4_s238 = CONS( int_13 , L_init_state_4_s237);
    private static final Compound L_init_state_4_s239 = CONS( int_12 , L_init_state_4_s238);
    private static final Compound L_init_state_4_s240 = CONS( int_11 , L_init_state_4_s239);
    private static final Compound L_init_state_4_s241 = CONS( int_10 , L_init_state_4_s240);
    private static final Compound L_init_state_4_s242 = CONS( int_9 , L_init_state_4_s241);
    private static final Compound L_init_state_4_s243 = CONS( int_8 , L_init_state_4_s242);
    private static final Compound L_init_state_4_s244 = CONS( int_23 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s245 = CONS( int_22 , L_init_state_4_s244);
    private static final Compound L_init_state_4_s246 = CONS( int_21 , L_init_state_4_s245);
    private static final Compound L_init_state_4_s247 = CONS( int_20 , L_init_state_4_s246);
    private static final Compound L_init_state_4_s248 = CONS( int_19 , L_init_state_4_s247);
    private static final Compound L_init_state_4_s249 = CONS( int_18 , L_init_state_4_s248);
    private static final Compound L_init_state_4_s250 = CONS( int_17 , L_init_state_4_s249);
    private static final Compound L_init_state_4_s251 = CONS( int_16 , L_init_state_4_s250);
    private static final Compound L_init_state_4_s252 = CONS( int_7 , L_init_state_4_s251);
    private static final Compound L_init_state_4_s253 = CONS( int_6 , L_init_state_4_s252);
    private static final Compound L_init_state_4_s254 = CONS( int_5 , L_init_state_4_s253);
    private static final Compound L_init_state_4_s255 = CONS( int_4 , L_init_state_4_s254);
    private static final Compound L_init_state_4_s256 = CONS( int_3 , L_init_state_4_s255);
    private static final Compound L_init_state_4_s257 = CONS( int_2 , L_init_state_4_s256);
    private static final Compound L_init_state_4_s258 = CONS( int_1 , L_init_state_4_s257);
    private static final Compound L_init_state_4_s259 = CONS( int_0 , L_init_state_4_s258);
    private static final Compound L_init_state_4_s261 = S( FUNCTOR_function_8 ,  int_3 , L_init_state_4_s243, L_init_state_4_s259,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s262 = CONS( int_23 , L_init_state_4_s178);
    private static final Compound L_init_state_4_s263 = CONS( int_22 , L_init_state_4_s262);
    private static final Compound L_init_state_4_s264 = CONS( int_21 , L_init_state_4_s263);
    private static final Compound L_init_state_4_s265 = CONS( int_20 , L_init_state_4_s264);
    private static final Compound L_init_state_4_s266 = CONS( int_15 , L_init_state_4_s265);
    private static final Compound L_init_state_4_s267 = CONS( int_14 , L_init_state_4_s266);
    private static final Compound L_init_state_4_s268 = CONS( int_13 , L_init_state_4_s267);
    private static final Compound L_init_state_4_s269 = CONS( int_12 , L_init_state_4_s268);
    private static final Compound L_init_state_4_s270 = CONS( int_7 , L_init_state_4_s269);
    private static final Compound L_init_state_4_s271 = CONS( int_6 , L_init_state_4_s270);
    private static final Compound L_init_state_4_s272 = CONS( int_5 , L_init_state_4_s271);
    private static final Compound L_init_state_4_s273 = CONS( int_4 , L_init_state_4_s272);
    private static final Compound L_init_state_4_s274 = CONS( int_27 ,  Prolog.Nil );
    private static final Compound L_init_state_4_s275 = CONS( int_26 , L_init_state_4_s274);
    private static final Compound L_init_state_4_s276 = CONS( int_25 , L_init_state_4_s275);
    private static final Compound L_init_state_4_s277 = CONS( int_24 , L_init_state_4_s276);
    private static final Compound L_init_state_4_s278 = CONS( int_19 , L_init_state_4_s277);
    private static final Compound L_init_state_4_s279 = CONS( int_18 , L_init_state_4_s278);
    private static final Compound L_init_state_4_s280 = CONS( int_17 , L_init_state_4_s279);
    private static final Compound L_init_state_4_s281 = CONS( int_16 , L_init_state_4_s280);
    private static final Compound L_init_state_4_s282 = CONS( int_11 , L_init_state_4_s281);
    private static final Compound L_init_state_4_s283 = CONS( int_10 , L_init_state_4_s282);
    private static final Compound L_init_state_4_s284 = CONS( int_9 , L_init_state_4_s283);
    private static final Compound L_init_state_4_s285 = CONS( int_8 , L_init_state_4_s284);
    private static final Compound L_init_state_4_s286 = CONS( int_3 , L_init_state_4_s285);
    private static final Compound L_init_state_4_s287 = CONS( int_2 , L_init_state_4_s286);
    private static final Compound L_init_state_4_s288 = CONS( int_1 , L_init_state_4_s287);
    private static final Compound L_init_state_4_s289 = CONS( int_0 , L_init_state_4_s288);
    private static final Compound L_init_state_4_s291 = S( FUNCTOR_function_8 ,  int_2 , L_init_state_4_s273, L_init_state_4_s289,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s292 = CONS( int_26 , L_init_state_4_s145);
    private static final Compound L_init_state_4_s293 = CONS( int_23 , L_init_state_4_s292);
    private static final Compound L_init_state_4_s294 = CONS( int_22 , L_init_state_4_s293);
    private static final Compound L_init_state_4_s295 = CONS( int_19 , L_init_state_4_s294);
    private static final Compound L_init_state_4_s296 = CONS( int_18 , L_init_state_4_s295);
    private static final Compound L_init_state_4_s297 = CONS( int_15 , L_init_state_4_s296);
    private static final Compound L_init_state_4_s298 = CONS( int_14 , L_init_state_4_s297);
    private static final Compound L_init_state_4_s299 = CONS( int_11 , L_init_state_4_s298);
    private static final Compound L_init_state_4_s300 = CONS( int_10 , L_init_state_4_s299);
    private static final Compound L_init_state_4_s301 = CONS( int_7 , L_init_state_4_s300);
    private static final Compound L_init_state_4_s302 = CONS( int_6 , L_init_state_4_s301);
    private static final Compound L_init_state_4_s303 = CONS( int_3 , L_init_state_4_s302);
    private static final Compound L_init_state_4_s304 = CONS( int_2 , L_init_state_4_s303);
    private static final Compound L_init_state_4_s305 = CONS( int_25 , L_init_state_4_s160);
    private static final Compound L_init_state_4_s306 = CONS( int_24 , L_init_state_4_s305);
    private static final Compound L_init_state_4_s307 = CONS( int_21 , L_init_state_4_s306);
    private static final Compound L_init_state_4_s308 = CONS( int_20 , L_init_state_4_s307);
    private static final Compound L_init_state_4_s309 = CONS( int_17 , L_init_state_4_s308);
    private static final Compound L_init_state_4_s310 = CONS( int_16 , L_init_state_4_s309);
    private static final Compound L_init_state_4_s311 = CONS( int_13 , L_init_state_4_s310);
    private static final Compound L_init_state_4_s312 = CONS( int_12 , L_init_state_4_s311);
    private static final Compound L_init_state_4_s313 = CONS( int_9 , L_init_state_4_s312);
    private static final Compound L_init_state_4_s314 = CONS( int_8 , L_init_state_4_s313);
    private static final Compound L_init_state_4_s315 = CONS( int_5 , L_init_state_4_s314);
    private static final Compound L_init_state_4_s316 = CONS( int_4 , L_init_state_4_s315);
    private static final Compound L_init_state_4_s317 = CONS( int_1 , L_init_state_4_s316);
    private static final Compound L_init_state_4_s318 = CONS( int_0 , L_init_state_4_s317);
    private static final Compound L_init_state_4_s320 = S( FUNCTOR_function_8 ,  int_1 , L_init_state_4_s304, L_init_state_4_s318,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s321 = CONS( int_27 , L_init_state_4_s100);
    private static final Compound L_init_state_4_s322 = CONS( int_25 , L_init_state_4_s321);
    private static final Compound L_init_state_4_s323 = CONS( int_23 , L_init_state_4_s322);
    private static final Compound L_init_state_4_s324 = CONS( int_21 , L_init_state_4_s323);
    private static final Compound L_init_state_4_s325 = CONS( int_19 , L_init_state_4_s324);
    private static final Compound L_init_state_4_s326 = CONS( int_17 , L_init_state_4_s325);
    private static final Compound L_init_state_4_s327 = CONS( int_15 , L_init_state_4_s326);
    private static final Compound L_init_state_4_s328 = CONS( int_13 , L_init_state_4_s327);
    private static final Compound L_init_state_4_s329 = CONS( int_11 , L_init_state_4_s328);
    private static final Compound L_init_state_4_s330 = CONS( int_9 , L_init_state_4_s329);
    private static final Compound L_init_state_4_s331 = CONS( int_7 , L_init_state_4_s330);
    private static final Compound L_init_state_4_s332 = CONS( int_5 , L_init_state_4_s331);
    private static final Compound L_init_state_4_s333 = CONS( int_3 , L_init_state_4_s332);
    private static final Compound L_init_state_4_s334 = CONS( int_1 , L_init_state_4_s333);
    private static final Compound L_init_state_4_s335 = CONS( int_26 , L_init_state_4_s127);
    private static final Compound L_init_state_4_s336 = CONS( int_24 , L_init_state_4_s335);
    private static final Compound L_init_state_4_s337 = CONS( int_22 , L_init_state_4_s336);
    private static final Compound L_init_state_4_s338 = CONS( int_20 , L_init_state_4_s337);
    private static final Compound L_init_state_4_s339 = CONS( int_18 , L_init_state_4_s338);
    private static final Compound L_init_state_4_s340 = CONS( int_16 , L_init_state_4_s339);
    private static final Compound L_init_state_4_s341 = CONS( int_14 , L_init_state_4_s340);
    private static final Compound L_init_state_4_s342 = CONS( int_12 , L_init_state_4_s341);
    private static final Compound L_init_state_4_s343 = CONS( int_10 , L_init_state_4_s342);
    private static final Compound L_init_state_4_s344 = CONS( int_8 , L_init_state_4_s343);
    private static final Compound L_init_state_4_s345 = CONS( int_6 , L_init_state_4_s344);
    private static final Compound L_init_state_4_s346 = CONS( int_4 , L_init_state_4_s345);
    private static final Compound L_init_state_4_s347 = CONS( int_2 , L_init_state_4_s346);
    private static final Compound L_init_state_4_s348 = CONS( int_0 , L_init_state_4_s347);
    private static final Compound L_init_state_4_s350 = S( FUNCTOR_function_8 ,  int_0 , L_init_state_4_s334, L_init_state_4_s348,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
    private static final Compound L_init_state_4_s351 = CONS(L_init_state_4_s350,  Prolog.Nil );
    private static final Compound L_init_state_4_s352 = CONS(L_init_state_4_s320, L_init_state_4_s351);
    private static final Compound L_init_state_4_s353 = CONS(L_init_state_4_s291, L_init_state_4_s352);
    private static final Compound L_init_state_4_s354 = CONS(L_init_state_4_s261, L_init_state_4_s353);
    private static final Compound L_init_state_4_s355 = CONS(L_init_state_4_s235, L_init_state_4_s354);
    private static final Compound L_init_state_4_s356 = CONS(L_init_state_4_s208, L_init_state_4_s355);
    private static final Compound L_init_state_4_s357 = CONS(L_init_state_4_s176, L_init_state_4_s356);
    private static final Compound L_init_state_4_s358 = CONS(L_init_state_4_s143, L_init_state_4_s357);




    public static Operation PRED_init_state_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_nand::init_state_4_var, FILE_nand::init_state_4_var, fail_0, fail_0, fail_0, fail_0); 
    }

    private final static Operation init_state_4_var(Prolog m) { 
        m.jtry4(null, FILE_nand::init_state_4_var_1);
        return init_state_4_1(m);
    }

    private final static Operation init_state_4_var_1(Prolog m) { 
        m.retry(null, FILE_nand::init_state_4_var_2);
        return init_state_4_2(m);
    }

    private final static Operation init_state_4_var_2(Prolog m) { 
        m.retry(null, FILE_nand::init_state_4_var_3);
        return init_state_4_3(m);
    }

    private final static Operation init_state_4_var_3(Prolog m) { 
        m.retry(null, FILE_nand::init_state_4_var_4);
        return init_state_4_4(m);
    }

    private final static Operation init_state_4_var_4(Prolog m) { 
        m.retry(null, FILE_nand::init_state_4_var_5);
        return init_state_4_5(m);
    }

    private final static Operation init_state_4_var_5(Prolog m) { 
        m.trust(null);
        return init_state_4_6(m);
    }

    private final static Operation init_state_4_1(Prolog m) { 
    // init_state(0,2,3,[function(2,[1,2],[0,3],[],[],[],[],[]),function(1,[2,3],[0,1],[],[],[],[],[]),function(0,[1,3],[0,2],[],[],[],[],[])]):-update_bounds(A,100,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // init_state(0,2,3,[function(2,[1,2],[0,3],[],[],[],[],[]),function(1,[2,3],[0,1],[],[],[],[],[]),function(0,[1,3],[0,2],[],[],[],[],[])]):-[update_bounds(A,100,B)]
        if (!  int_0 .unify(a1, m.trail))
            return m.fail();
        if (!  int_2 .unify(a2, m.trail))
            return m.fail();
        if (!  int_3 .unify(a3, m.trail))
            return m.fail();
        if (! L_init_state_4_s24.unify(a4, m.trail))
            return m.fail();
        return //
 Op("update_bounds", FILE_nand::PRED_update_bounds_3_static_exec, VA(m.DONT_CARE2(),  int_100 , m.DONT_CARE2()), cont);
    }

    private final static Operation init_state_4_2(Prolog m) { 
    // init_state(1,3,4,[function(3,[3,5,6,7],[0,1,2,4],[],[],[],[],[]),function(2,[4,5,6,7],[0,1,2,3],[],[],[],[],[]),function(1,[2,3,6,7],[0,1,4,5],[],[],[],[],[]),function(0,[1,3,5,7],[0,2,4,6],[],[],[],[],[])]):-update_bounds(A,100,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // init_state(1,3,4,[function(3,[3,5,6,7],[0,1,2,4],[],[],[],[],[]),function(2,[4,5,6,7],[0,1,2,3],[],[],[],[],[]),function(1,[2,3,6,7],[0,1,4,5],[],[],[],[],[]),function(0,[1,3,5,7],[0,2,4,6],[],[],[],[],[])]):-[update_bounds(A,100,B)]
        if (!  int_1 .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a2, m.trail))
            return m.fail();
        if (!  int_4 .unify(a3, m.trail))
            return m.fail();
        if (! L_init_state_4_s65.unify(a4, m.trail))
            return m.fail();
        return //
 Op("update_bounds", FILE_nand::PRED_update_bounds_3_static_exec, VA(m.DONT_CARE2(),  int_100 , m.DONT_CARE2()), cont);
    }

    private final static Operation init_state_4_3(Prolog m) { 
    // init_state(2,3,4,[function(3,[1,2,4,6,7],[0,3,5],[],[],[],[],[]),function(2,[4,5,6,7],[0,1,2,3],[],[],[],[],[]),function(1,[2,3,6,7],[0,1,4,5],[],[],[],[],[]),function(0,[1,3,5,7],[0,2,4,6],[],[],[],[],[])]):-update_bounds(A,100,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // init_state(2,3,4,[function(3,[1,2,4,6,7],[0,3,5],[],[],[],[],[]),function(2,[4,5,6,7],[0,1,2,3],[],[],[],[],[]),function(1,[2,3,6,7],[0,1,4,5],[],[],[],[],[]),function(0,[1,3,5,7],[0,2,4,6],[],[],[],[],[])]):-[update_bounds(A,100,B)]
        if (!  int_2 .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a2, m.trail))
            return m.fail();
        if (!  int_4 .unify(a3, m.trail))
            return m.fail();
        if (! L_init_state_4_s73.unify(a4, m.trail))
            return m.fail();
        return //
 Op("update_bounds", FILE_nand::PRED_update_bounds_3_static_exec, VA(m.DONT_CARE2(),  int_100 , m.DONT_CARE2()), cont);
    }

    private final static Operation init_state_4_4(Prolog m) { 
    // init_state(3,3,4,[function(3,[1,2,4,7],[0,3,5,6],[],[],[],[],[]),function(2,[4,5,6,7],[0,1,2,3],[],[],[],[],[]),function(1,[2,3,6,7],[0,1,4,5],[],[],[],[],[]),function(0,[1,3,5,7],[0,2,4,6],[],[],[],[],[])]):-update_bounds(A,100,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // init_state(3,3,4,[function(3,[1,2,4,7],[0,3,5,6],[],[],[],[],[]),function(2,[4,5,6,7],[0,1,2,3],[],[],[],[],[]),function(1,[2,3,6,7],[0,1,4,5],[],[],[],[],[]),function(0,[1,3,5,7],[0,2,4,6],[],[],[],[],[])]):-[update_bounds(A,100,B)]
        if (!  int_3 .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a2, m.trail))
            return m.fail();
        if (!  int_4 .unify(a3, m.trail))
            return m.fail();
        if (! L_init_state_4_s82.unify(a4, m.trail))
            return m.fail();
        return //
 Op("update_bounds", FILE_nand::PRED_update_bounds_3_static_exec, VA(m.DONT_CARE2(),  int_100 , m.DONT_CARE2()), cont);
    }

    private final static Operation init_state_4_5(Prolog m) { 
    // init_state(4,3,5,[function(4,[3,5,6,7],[0,1,2,4],[],[],[],[],[]),function(3,[1,2,4,7],[0,3,5,6],[],[],[],[],[]),function(2,[4,5,6,7],[0,1,2,3],[],[],[],[],[]),function(1,[2,3,6,7],[0,1,4,5],[],[],[],[],[]),function(0,[1,3,5,7],[0,2,4,6],[],[],[],[],[])]):-update_bounds(A,100,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // init_state(4,3,5,[function(4,[3,5,6,7],[0,1,2,4],[],[],[],[],[]),function(3,[1,2,4,7],[0,3,5,6],[],[],[],[],[]),function(2,[4,5,6,7],[0,1,2,3],[],[],[],[],[]),function(1,[2,3,6,7],[0,1,4,5],[],[],[],[],[]),function(0,[1,3,5,7],[0,2,4,6],[],[],[],[],[])]):-[update_bounds(A,100,B)]
        if (!  int_4 .unify(a1, m.trail))
            return m.fail();
        if (!  int_3 .unify(a2, m.trail))
            return m.fail();
        if (!  int_5 .unify(a3, m.trail))
            return m.fail();
        if (! L_init_state_4_s85.unify(a4, m.trail))
            return m.fail();
        return //
 Op("update_bounds", FILE_nand::PRED_update_bounds_3_static_exec, VA(m.DONT_CARE2(),  int_100 , m.DONT_CARE2()), cont);
    }

    private final static Operation init_state_4_6(Prolog m) { 
    // init_state(5,5,8,[function(7,[1,3,4,6,9,11,12,14,16,18,21,23,24,26,29,31],[0,2,5,7,8,10,13,15,17,19,20,22,25,27,28,30],[],[],[],[],[]),function(6,[2,3,5,6,8,9,12,15,17,18,20,21,24,27,30,31],[0,1,4,7,10,11,13,14,16,19,22,23,25,26,28,29],[],[],[],[],[]),function(5,[7,10,11,13,14,15,19,22,23,25,26,27,28,29,30,31],[0,1,2,3,4,5,6,8,9,12,16,17,18,20,21,24],[],[],[],[],[]),function(4,[16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31],[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15],[],[],[],[],[]),function(3,[8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31],[0,1,2,3,4,5,6,7,16,17,18,19,20,21,22,23],[],[],[],[],[]),function(2,[4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31],[0,1,2,3,8,9,10,11,16,17,18,19,24,25,26,27],[],[],[],[],[]),function(1,[2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31],[0,1,4,5,8,9,12,13,16,17,20,21,24,25,28,29],[],[],[],[],[]),function(0,[1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31],[0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30],[],[],[],[],[])]):-update_bounds(A,21,B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // init_state(5,5,8,[function(7,[1,3,4,6,9,11,12,14,16,18,21,23,24,26,29,31],[0,2,5,7,8,10,13,15,17,19,20,22,25,27,28,30],[],[],[],[],[]),function(6,[2,3,5,6,8,9,12,15,17,18,20,21,24,27,30,31],[0,1,4,7,10,11,13,14,16,19,22,23,25,26,28,29],[],[],[],[],[]),function(5,[7,10,11,13,14,15,19,22,23,25,26,27,28,29,30,31],[0,1,2,3,4,5,6,8,9,12,16,17,18,20,21,24],[],[],[],[],[]),function(4,[16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31],[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15],[],[],[],[],[]),function(3,[8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31],[0,1,2,3,4,5,6,7,16,17,18,19,20,21,22,23],[],[],[],[],[]),function(2,[4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31],[0,1,2,3,8,9,10,11,16,17,18,19,24,25,26,27],[],[],[],[],[]),function(1,[2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31],[0,1,4,5,8,9,12,13,16,17,20,21,24,25,28,29],[],[],[],[],[]),function(0,[1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31],[0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30],[],[],[],[],[])]):-[update_bounds(A,21,B)]
        if (!  int_5 .unify(a1, m.trail))
            return m.fail();
        if (!  int_5 .unify(a2, m.trail))
            return m.fail();
        if (!  int_8 .unify(a3, m.trail))
            return m.fail();
        if (! L_init_state_4_s358.unify(a4, m.trail))
            return m.fail();
        return //
 Op("update_bounds", FILE_nand::PRED_update_bounds_3_static_exec, VA(m.DONT_CARE2(),  int_21 , m.DONT_CARE2()), cont);
    }
/** PREDICATE: search/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(search/3,public)




    public static Operation PRED_search_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_nand::search_3_sub_1);
        return search_3_1(m);
    }

    private final static Operation search_3_sub_1(Prolog m) { 
        m.trust(null);
        return search_3_2(m);
    }

    private final static Operation search_3_1(Prolog m) { 
    // search(A,B,C):-select_vector(A,B,C,D,E),!,cover_vector(A,B,C,D,E,F,G),add_necessary_functions(A,F,G,H,I),test_bounds(A,H,I),search(A,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // search(A,B,C):-['$get_level'(D),select_vector(A,B,C,E,F),'$cut'(D),cover_vector(A,B,C,E,F,G,H),add_necessary_functions(A,G,H,I,J),test_bounds(A,I,J),search(A,I,J)]
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
 Op("select_vector", FILE_nand::PRED_select_vector_5_static_exec, VA(a1, a2, a3, a5, a6), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a4), //
 Op("cover_vector", FILE_nand::PRED_cover_vector_7_static_exec, VA(a1, a2, a3, a5, a6, a7, a8), //
 Op("add_necessary_functions", FILE_nand::PRED_add_necessary_functions_5_static_exec, VA(a1, a7, a8, a9, a10), //
 Op("test_bounds", FILE_nand::PRED_test_bounds_3_static_exec, VA(a1, a9, a10), //
 Op("search", FILE_nand::PRED_search_3_static_exec, VA(a1, a9, a10), cont))))));
    }

    private final static Operation search_3_2(Prolog m) { 
    // search(A,B,C):-update_bounds(A,B,C),fail
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // search(A,B,C):-[update_bounds(A,B,C),fail]
        return //
 Op("update_bounds", FILE_nand::PRED_update_bounds_3_static_exec, VA(a1, a2, a3), fail_0);
    }
/** PREDICATE: $dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/1,public)
        final static Functor ATOM_cov = SYM("cov");




    public static Operation PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_nand::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-A=cov,!,fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-['$get_level'(B),'$unify'(A,cov),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),@(ATOM_cov))
        if (! a1.unify(ATOM_cov, m.trail)) {
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

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/1,public)
        final static Functor ATOM_nf = SYM("nf");




    public static Operation PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_nand::$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-A=nf,!,fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-['$get_level'(B),'$unify'(A,nf),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),@(ATOM_nf))
        if (! a1.unify(ATOM_nf, m.trail)) {
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

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-[]
        return cont;
    }
/** PREDICATE: select_vector/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(select_vector/5,public)
        final static Functor ATOM_dummy = SYM("dummy");
        final static NumberTerm int_999 = Integer(999);

    // private final Term arg5;




    public static Operation PRED_select_vector_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // select_vector(A,B,C,D,E):-select_vector(C,A,B,C,dummy,0,nf,999,D,E,F,G),!,'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(F),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // select_vector(A,B,C,D,E):-['$get_level'(F),select_vector(C,A,B,C,dummy,0,nf,999,D,E,G,H),'$cut'(F),'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(G),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(G)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        return //
 Op("select_vector", FILE_nand::PRED_select_vector_12_static_exec, VA(a3, a1, a2, a3,  ATOM_dummy ,  int_0 ,  ATOM_nf ,  int_999 , a4, a5, a7, m.DONT_CARE2()), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a6), //
 Op("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec, VA(a7), //
 Op("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec, VA(a7), cont))));
    }
/** PREDICATE: select_vector/12
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(select_vector/12,public)

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12;




    public static Operation PRED_select_vector_12_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_nand::select_vector_12_var, fail_0, fail_0, fail_0, fail_0, FILE_nand::select_vector_12_var); 
    }

    private final static Operation select_vector_12_var(Prolog m) { 
        m.jtry(12, null, FILE_nand::select_vector_12_var_1);
        return select_vector_12_1(m);
    }

    private final static Operation select_vector_12_var_1(Prolog m) { 
        m.trust(null);
        return select_vector_12_2(m);
    }

    private final static Operation select_vector_12_1(Prolog m) { 
    // select_vector([A|B],C,D,E,F,G,H,I,F,G,H,I):-function_number(A,J),J<C
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
    // select_vector([A|B],C,D,E,F,G,H,I,F,G,H,I):-[function_number(A,J),'$less_than'(J,C)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a13 = a1.car();
        } else if (a1.isVar()){
            a13 = m.mkvar2();
             a1.bind(CONS(a13, m.DONTCARE("cons(a(1))")), m.trail);
        } else {
            return m.fail();
        }
        if (! a5.unify(a9, m.trail))
            return m.fail();
        if (! a6.unify(a10, m.trail))
            return m.fail();
        if (! a7.unify(a11, m.trail))
            return m.fail();
        if (! a8.unify(a12, m.trail))
            return m.fail();
        a14 = m.mkvar1();
        return //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a13, a14), //
 Op("$less_than", FILE_nand::PRED_$less_than_2_static_exec, VA(a14, a2), cont));
    }

    private final static Operation select_vector_12_2(Prolog m) { 
    // select_vector([A|B],C,D,E,F,G,H,I,J,K,L,M):-function_number(A,N),N>=C,true_set(A,O),select_vector(O,A,C,D,E,F,G,H,I,P,Q,R,S),select_vector(B,C,D,E,P,Q,R,S,J,K,L,M)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        cont = m.cont;
    // select_vector([A|B],C,D,E,F,G,H,I,J,K,L,M):-[function_number(A,N),'$greater_or_equal'(N,C),true_set(A,O),select_vector(O,A,C,D,E,F,G,H,I,P,Q,R,S),select_vector(B,C,D,E,P,Q,R,S,J,K,L,M)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a13 = a1.car();
            a14 = a1.cdr();
        } else if (a1.isVar()){
            a13 = m.mkvar2();
            a14 = m.mkvar2();
             a1.bind(CONS(a13, a14), m.trail);
        } else {
            return m.fail();
        }
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        return //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a13, a15), //
 Op("$greater_or_equal", FILE_nand::PRED_$greater_or_equal_2_static_exec, VA(a15, a2), //
 Op("true_set", FILE_nand::PRED_true_set_2_static_exec, VA(a13, a16), //
 Op("select_vector", FILE_nand::PRED_select_vector_13_static_exec, VA(a16, a13, a2, a3, a4, a5, a6, a7, a8, a17, a18, a19, a20), //
 Op("select_vector", FILE_nand::PRED_select_vector_12_static_exec, VA(a14, a2, a3, a4, a17, a18, a19, a20, a9, a10, a11, a12), cont)))));
    }
/** PREDICATE: select_vector/13
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(select_vector/13,public)

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13;




    public static Operation PRED_select_vector_13_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_nand::select_vector_13_var, fail_0, fail_0, FILE_nand::select_vector_13_1, fail_0, FILE_nand::select_vector_13_2); 
    }

    private final static Operation select_vector_13_var(Prolog m) { 
        m.jtry(13, null, FILE_nand::select_vector_13_var_1);
        return select_vector_13_1(m);
    }

    private final static Operation select_vector_13_var_1(Prolog m) { 
        m.trust(null);
        return select_vector_13_2(m);
    }

    private final static Operation select_vector_13_1(Prolog m) { 
    // select_vector([],A,B,C,D,E,F,G,H,E,F,G,H):-true
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
        a13 = m.AREGS[12];
        cont = m.cont;
    // select_vector([],A,B,C,D,E,F,G,H,E,F,G,H):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a6.unify(a10, m.trail))
            return m.fail();
        if (! a7.unify(a11, m.trail))
            return m.fail();
        if (! a8.unify(a12, m.trail))
            return m.fail();
        if (! a9.unify(a13, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation select_vector_13_2(Prolog m) { 
    // select_vector([A|B],C,D,E,F,G,H,I,J,K,L,M,N):-vector_cover_type(D,F,C,A,O,P),best_vector(G,H,I,J,C,A,O,P,Q,R,S,T),select_vector(B,C,D,E,F,Q,R,S,T,K,L,M,N)
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
        a12 = m.AREGS[11];
        a13 = m.AREGS[12];
        cont = m.cont;
    // select_vector([A|B],C,D,E,F,G,H,I,J,K,L,M,N):-[vector_cover_type(D,F,C,A,O,P),best_vector(G,H,I,J,C,A,O,P,Q,R,S,T),select_vector(B,C,D,E,F,Q,R,S,T,K,L,M,N)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a14 = a1.car();
            a15 = a1.cdr();
        } else if (a1.isVar()){
            a14 = m.mkvar2();
            a15 = m.mkvar2();
             a1.bind(CONS(a14, a15), m.trail);
        } else {
            return m.fail();
        }
        a16 = m.mkvar1();
        a17 = m.mkvar1();
        a18 = m.mkvar1();
        a19 = m.mkvar1();
        a20 = m.mkvar1();
        a21 = m.mkvar1();
        return //
 Op("vector_cover_type", FILE_nand::PRED_vector_cover_type_6_static_exec, VA(a3, a5, a2, a14, a16, a17), //
 Op("best_vector", FILE_nand::PRED_best_vector_12_static_exec, VA(a6, a7, a8, a9, a2, a14, a16, a17, a18, a19, a20, a21), //
 Op("select_vector", FILE_nand::PRED_select_vector_13_static_exec, VA(a15, a2, a3, a4, a5, a18, a19, a20, a21, a10, a11, a12, a13), cont)));
    }
/** PREDICATE: vector_cover_type/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(vector_cover_type/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_vector_cover_type_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // vector_cover_type(A,B,C,D,E,F):-immediate_predecessors(C,G),conceivable_inputs(C,H),false_set(C,I),cover_type1(G,B,D,nf,0,J,K),cover_type2(H,B,A,I,D,J,K,E,F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1, p2, p3, p4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // vector_cover_type(A,B,C,D,E,F):-[immediate_predecessors(C,G),conceivable_inputs(C,H),false_set(C,I),cover_type1(G,B,D,nf,0,J,K),cover_type2(H,B,A,I,D,J,K,E,F)]
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = m.mkvar1();
        return //
 Op("immediate_predecessors", FILE_nand::PRED_immediate_predecessors_2_static_exec, VA(a3, a7), //
 Op("conceivable_inputs", FILE_nand::PRED_conceivable_inputs_2_static_exec, VA(a3, a8), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a3, a9), //
 Op("cover_type1", FILE_nand::PRED_cover_type1_7_static_exec, VA(a7, a2, a4,  ATOM_nf ,  int_0 , a10, a11), //
 Op("cover_type2", FILE_nand::PRED_cover_type2_9_static_exec, VA(a8, a2, a1, a9, a4, a10, a11, a5, a6), cont)))));
    }
/** PREDICATE: cover_type1/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(cover_type1/7,public)
        final static Functor FUNCTOR_$002B_2 = F("+",2);

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_cover_type1_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return cover_type1_7_top(m);
    }

    private final static Operation cover_type1_7_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_nand::cover_type1_7_var, fail_0, fail_0, FILE_nand::cover_type1_7_1, fail_0, FILE_nand::cover_type1_7_lis); 
    }

    private final static Operation cover_type1_7_var(Prolog m) { 
        m.jtry7(null, FILE_nand::cover_type1_7_var_1);
        return cover_type1_7_1(m);
    }

    private final static Operation cover_type1_7_var_1(Prolog m) { 
        m.retry(null, FILE_nand::cover_type1_7_var_2);
        return cover_type1_7_2(m);
    }

    private final static Operation cover_type1_7_var_2(Prolog m) { 
        m.trust(null);
        return cover_type1_7_3(m);
    }

    private final static Operation cover_type1_7_lis(Prolog m) { 
        m.jtry7(null, FILE_nand::cover_type1_7_lis_1);
        return cover_type1_7_2(m);
    }

    private final static Operation cover_type1_7_lis_1(Prolog m) { 
        m.trust(null);
        return cover_type1_7_3(m);
    }

    private final static Operation cover_type1_7_1(Prolog m) { 
    // cover_type1([],A,B,C,D,C,D):-true
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
    // cover_type1([],A,B,C,D,C,D):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a4.unify(a6, m.trail))
            return m.fail();
        if (! a5.unify(a7, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation cover_type1_7_2(Prolog m) { 
    // cover_type1([A|B],C,D,E,F,G,H):-function(A,C,I),true_set(I,J),'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(D,J),!,false_set(I,K),'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(D,E,K,L),M is F+1,cover_type1(B,C,D,L,M,G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
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
    // cover_type1([A|B],C,D,E,F,G,H):-['$get_level'(I),function(A,C,J),true_set(J,K),'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(D,K),'$cut'(I),false_set(J,L),'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(D,E,L,M),N is F+1,cover_type1(B,C,D,M,N,G,H)]
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
        //START inline expansion of $get_level(a(10))
        if (! a10.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
    // put_str_args([a(5),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(16))
        a16 =  S( FUNCTOR_$002B_2 , a5,  int_1 );
 ;
        return //
 Op("function", FILE_nand::PRED_function_3_static_exec, VA(a8, a2, a11), //
 Op("true_set", FILE_nand::PRED_true_set_2_static_exec, VA(a11, a12), //
 Op("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec, VA(a3, a12), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a10), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a11, a13), //
 Op("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_static_exec, VA(a3, a4, a13, a14), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a15, a16), //
 Op("cover_type1", FILE_nand::PRED_cover_type1_7_static_exec, VA(a9, a2, a3, a14, a15, a6, a7), cont))))))));
    }

    private final static Operation cover_type1_7_3(Prolog m) { 
    // cover_type1([A|B],C,D,E,F,G,H):-cover_type1(B,C,D,E,F,G,H)
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
    // cover_type1([A|B],C,D,E,F,G,H):-[cover_type1(B,C,D,E,F,G,H)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a8 = a1.cdr();
        } else if (a1.isVar()){
            a8 = m.mkvar2();
             a1.bind(CONS(m.DONTCARE("cons(a(1))"), a8), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a8;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a6;
        m.AREGS[6] = a7;
m.cont = cont;
        return cover_type1_7_top(m);
    }
/** PREDICATE: $dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/2,public)




    public static Operation PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_nand::$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-set_member(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-['$get_level'(C),set_member(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/4,public)
        final static Functor ATOM_exp = SYM("exp");




    public static Operation PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_nand::$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_sub_1);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_1(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_2(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_1(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D):-set_member(A,C),!,max_type(B,cov,D)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D):-['$get_level'(E),set_member(A,C),'$cut'(E),max_type(B,cov,D)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a3), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a5), //
 Op("max_type", FILE_nand::PRED_max_type_3_static_exec, VA(a2,  ATOM_cov , a4), cont)));
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_2(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D):-max_type(B,exp,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D):-[max_type(B,exp,D)]
        return //
 Op("max_type", FILE_nand::PRED_max_type_3_static_exec, VA(a2,  ATOM_exp , a4), cont);
    }
/** PREDICATE: cover_type2/9
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(cover_type2/9,public)
        final static Functor ATOM_var = SYM("var");

    // private final Term arg5, arg6, arg7, arg8, arg9;




    public static Operation PRED_cover_type2_9_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return cover_type2_9_top(m);
    }

    private final static Operation cover_type2_9_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_nand::cover_type2_9_var, fail_0, fail_0, FILE_nand::cover_type2_9_1, fail_0, FILE_nand::cover_type2_9_lis); 
    }

    private final static Operation cover_type2_9_var(Prolog m) { 
        m.jtry(9, null, FILE_nand::cover_type2_9_var_1);
        return cover_type2_9_1(m);
    }

    private final static Operation cover_type2_9_var_1(Prolog m) { 
        m.retry(null, FILE_nand::cover_type2_9_var_2);
        return cover_type2_9_2(m);
    }

    private final static Operation cover_type2_9_var_2(Prolog m) { 
        m.retry(null, FILE_nand::cover_type2_9_var_3);
        return cover_type2_9_3(m);
    }

    private final static Operation cover_type2_9_var_3(Prolog m) { 
        m.trust(null);
        return cover_type2_9_4(m);
    }

    private final static Operation cover_type2_9_lis(Prolog m) { 
        m.jtry(9, null, FILE_nand::cover_type2_9_lis_1);
        return cover_type2_9_2(m);
    }

    private final static Operation cover_type2_9_lis_1(Prolog m) { 
        m.retry(null, FILE_nand::cover_type2_9_lis_2);
        return cover_type2_9_3(m);
    }

    private final static Operation cover_type2_9_lis_2(Prolog m) { 
        m.trust(null);
        return cover_type2_9_4(m);
    }

    private final static Operation cover_type2_9_1(Prolog m) { 
    // cover_type2([],A,B,C,D,E,F,E,F):-true
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
    // cover_type2([],A,B,C,D,E,F,E,F):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a6.unify(a8, m.trail))
            return m.fail();
        if (! a7.unify(a9, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation cover_type2_9_2(Prolog m) { 
    // cover_type2([A|B],C,D,E,F,G,H,I,J):-A<D,function(A,C,K),false_set(K,L),set_member(F,L),!,max_type(G,var,M),N is H+1,cover_type2(B,C,D,E,F,M,N,I,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
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
        a9 = m.AREGS[8];
        cont = m.cont;
    // cover_type2([A|B],C,D,E,F,G,H,I,J):-['$get_level'(K),'$less_than'(A,D),function(A,C,L),false_set(L,M),set_member(F,M),'$cut'(K),max_type(G,var,N),O is H+1,cover_type2(B,C,D,E,F,N,O,I,J)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a10 = a1.car();
            a11 = a1.cdr();
        } else if (a1.isVar()){
            a10 = m.mkvar2();
            a11 = m.mkvar2();
             a1.bind(CONS(a10, a11), m.trail);
        } else {
            return m.fail();
        }
        a12 = m.mkvar1();
        //START inline expansion of $get_level(a(12))
        if (! a12.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_than(a(10),a(3))
        if (Arithmetic.evaluate(a10).arithCompareTo(Arithmetic.evaluate(a3)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
    // put_str_args([a(7),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(17))
        a17 =  S( FUNCTOR_$002B_2 , a7,  int_1 );
 ;
        return //
 Op("function", FILE_nand::PRED_function_3_static_exec, VA(a10, a2, a13), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a13, a14), //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a5, a14), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a12), //
 Op("max_type", FILE_nand::PRED_max_type_3_static_exec, VA(a6,  ATOM_var , a15), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a16, a17), //
 Op("cover_type2", FILE_nand::PRED_cover_type2_9_static_exec, VA(a11, a2, a3, a4, a5, a15, a16, a8, a9), cont)))))));
    }

    private final static Operation cover_type2_9_3(Prolog m) { 
    // cover_type2([A|B],C,D,E,F,G,H,I,J):-A>=D,function(A,C,K),true_set(K,L),'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(F,L),!,false_set(K,M),'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(E,F,G,L,M,N),O is H+1,cover_type2(B,C,D,E,F,N,O,I,J)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18;
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
        a9 = m.AREGS[8];
        cont = m.cont;
    // cover_type2([A|B],C,D,E,F,G,H,I,J):-['$get_level'(K),'$greater_or_equal'(A,D),function(A,C,L),true_set(L,M),'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(F,M),'$cut'(K),false_set(L,N),'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(E,F,G,M,N,O),P is H+1,cover_type2(B,C,D,E,F,O,P,I,J)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a10 = a1.car();
            a11 = a1.cdr();
        } else if (a1.isVar()){
            a10 = m.mkvar2();
            a11 = m.mkvar2();
             a1.bind(CONS(a10, a11), m.trail);
        } else {
            return m.fail();
        }
        a12 = m.mkvar1();
        //START inline expansion of $get_level(a(12))
        if (! a12.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_or_equal(a(10),a(3))
        if (Arithmetic.evaluate(a10).arithCompareTo(Arithmetic.evaluate(a3)) < 0) {
            return m.fail();
        }
        //END inline expansion
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
    // put_str_args([a(7),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(18))
        a18 =  S( FUNCTOR_$002B_2 , a7,  int_1 );
 ;
        return //
 Op("function", FILE_nand::PRED_function_3_static_exec, VA(a10, a2, a13), //
 Op("true_set", FILE_nand::PRED_true_set_2_static_exec, VA(a13, a14), //
 Op("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec, VA(a5, a14), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a12), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a13, a15), //
 Op("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec, VA(a4, a5, a6, a14, a15, a16), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a17, a18), //
 Op("cover_type2", FILE_nand::PRED_cover_type2_9_static_exec, VA(a11, a2, a3, a4, a5, a16, a17, a8, a9), cont))))))));
    }

    private final static Operation cover_type2_9_4(Prolog m) { 
    // cover_type2([A|B],C,D,E,F,G,H,I,J):-cover_type2(B,C,D,E,F,G,H,I,J)
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
    // cover_type2([A|B],C,D,E,F,G,H,I,J):-[cover_type2(B,C,D,E,F,G,H,I,J)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a10 = a1.cdr();
        } else if (a1.isVar()){
            a10 = m.mkvar2();
             a1.bind(CONS(m.DONTCARE("cons(a(1))"), a10), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a10;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a6;
        m.AREGS[6] = a7;
        m.AREGS[7] = a8;
        m.AREGS[8] = a9;
m.cont = cont;
        return cover_type2_9_top(m);
    }
/** PREDICATE: $dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/2,public)




    public static Operation PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_nand::$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-set_member(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-['$get_level'(C),set_member(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/4,public)
        final static Functor ATOM_fcn = SYM("fcn");
        final static Functor ATOM_mcf = SYM("mcf");




    public static Operation PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_nand::$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_sub_1);
        return $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_1(m);
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_2(m);
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_1(Prolog m) { 
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D):-set_subset(A,C),!,max_type(B,fcn,D)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D):-['$get_level'(E),set_subset(A,C),'$cut'(E),max_type(B,fcn,D)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_subset", FILE_nand::PRED_set_subset_2_static_exec, VA(a1, a3), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a5), //
 Op("max_type", FILE_nand::PRED_max_type_3_static_exec, VA(a2,  ATOM_fcn , a4), cont)));
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_2(Prolog m) { 
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D):-max_type(B,mcf,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D):-[max_type(B,mcf,D)]
        return //
 Op("max_type", FILE_nand::PRED_max_type_3_static_exec, VA(a2,  ATOM_mcf , a4), cont);
    }
/** PREDICATE: $dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/6,public)
        final static Functor ATOM_exmcf = SYM("exmcf");

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_nand::$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_sub_1);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_1(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_sub_1(Prolog m) { 
        m.retry(null, FILE_nand::$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_sub_2);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_2(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_sub_2(Prolog m) { 
        m.trust(null);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_3(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_1(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-set_member(B,E),!,'$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,C,D,F)
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
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-['$get_level'(G),set_member(B,E),'$cut'(G),'$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,C,D,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a2, a5), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a7), //
 Op("$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_static_exec, VA(a1, a3, a4, a6), cont)));
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_2(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-'$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,C,D,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-['$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,C,D,F)]
        return //
 Op("$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_static_exec, VA(a1, a3, a4, a6), cont);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_3(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-max_type(C,exmcf,F)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-[max_type(C,exmcf,F)]
        return //
 Op("max_type", FILE_nand::PRED_max_type_3_static_exec, VA(a3,  ATOM_exmcf , a6), cont);
    }
/** PREDICATE: $dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/4,public)
        final static Functor ATOM_exf = SYM("exf");




    public static Operation PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_nand::$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_sub_1);
        return $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_1(m);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_2(m);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_1(Prolog m) { 
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D):-set_subset(A,C),!,max_type(B,exf,D)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D):-['$get_level'(E),set_subset(A,C),'$cut'(E),max_type(B,exf,D)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_subset", FILE_nand::PRED_set_subset_2_static_exec, VA(a1, a3), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a5), //
 Op("max_type", FILE_nand::PRED_max_type_3_static_exec, VA(a2,  ATOM_exf , a4), cont)));
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_2(Prolog m) { 
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D):-fail
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: best_vector/12
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(best_vector/12,public)

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12;




    public static Operation PRED_best_vector_12_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_nand::best_vector_12_var, FILE_nand::best_vector_12_int, FILE_nand::best_vector_12_int, FILE_nand::best_vector_12_var, FILE_nand::best_vector_12_int, FILE_nand::best_vector_12_int); 
    }

    private final static Operation best_vector_12_var(Prolog m) { 
        m.jtry(12, null, FILE_nand::best_vector_12_var_1);
        return best_vector_12_1(m);
    }

    private final static Operation best_vector_12_var_1(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_var_2);
        return best_vector_12_2(m);
    }

    private final static Operation best_vector_12_var_2(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_var_3);
        return best_vector_12_3(m);
    }

    private final static Operation best_vector_12_var_3(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_var_4);
        return best_vector_12_4(m);
    }

    private final static Operation best_vector_12_var_4(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_var_5);
        return best_vector_12_5(m);
    }

    private final static Operation best_vector_12_var_5(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_var_6);
        return best_vector_12_6(m);
    }

    private final static Operation best_vector_12_var_6(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_var_7);
        return best_vector_12_7(m);
    }

    private final static Operation best_vector_12_var_7(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_var_8);
        return best_vector_12_8(m);
    }

    private final static Operation best_vector_12_var_8(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_var_9);
        return best_vector_12_9(m);
    }

    private final static Operation best_vector_12_var_9(Prolog m) { 
        m.trust(null);
        return best_vector_12_10(m);
    }

    private final static Operation best_vector_12_int(Prolog m) { 
        m.jtry(12, null, FILE_nand::best_vector_12_int_1);
        return best_vector_12_2(m);
    }

    private final static Operation best_vector_12_int_1(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_int_2);
        return best_vector_12_3(m);
    }

    private final static Operation best_vector_12_int_2(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_int_3);
        return best_vector_12_4(m);
    }

    private final static Operation best_vector_12_int_3(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_int_4);
        return best_vector_12_5(m);
    }

    private final static Operation best_vector_12_int_4(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_int_5);
        return best_vector_12_6(m);
    }

    private final static Operation best_vector_12_int_5(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_int_6);
        return best_vector_12_7(m);
    }

    private final static Operation best_vector_12_int_6(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_int_7);
        return best_vector_12_8(m);
    }

    private final static Operation best_vector_12_int_7(Prolog m) { 
        m.retry(null, FILE_nand::best_vector_12_int_8);
        return best_vector_12_9(m);
    }

    private final static Operation best_vector_12_int_8(Prolog m) { 
        m.trust(null);
        return best_vector_12_10(m);
    }

    private final static Operation best_vector_12_1(Prolog m) { 
    // best_vector(dummy,A,B,C,D,E,F,G,D,E,F,G):-!
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
    // best_vector(dummy,A,B,C,D,E,F,G,D,E,F,G):-['$neck_cut']
        if (!  ATOM_dummy .unify(a1, m.trail))
            return m.fail();
        if (! a5.unify(a9, m.trail))
            return m.fail();
        if (! a6.unify(a10, m.trail))
            return m.fail();
        if (! a7.unify(a11, m.trail))
            return m.fail();
        if (! a8.unify(a12, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation best_vector_12_2(Prolog m) { 
    // best_vector(A,B,C,D,dummy,E,F,G,A,B,C,D):-!
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
    // best_vector(A,B,C,D,dummy,E,F,G,A,B,C,D):-['$neck_cut']
        if (!  ATOM_dummy .unify(a5, m.trail))
            return m.fail();
        if (! a1.unify(a9, m.trail))
            return m.fail();
        if (! a2.unify(a10, m.trail))
            return m.fail();
        if (! a3.unify(a11, m.trail))
            return m.fail();
        if (! a4.unify(a12, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation best_vector_12_3(Prolog m) { 
    // best_vector(A,B,C,D,E,F,C,G,A,B,C,D):-function_number(A,H),function_number(E,H),D<G,!
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
        a12 = m.AREGS[11];
        cont = m.cont;
    // best_vector(A,B,C,D,E,F,C,G,A,B,C,D):-['$get_level'(H),function_number(A,I),function_number(E,I),'$less_than'(D,G),'$cut'(H)]
        if (! a3.unify(a7, m.trail))
            return m.fail();
        if (! a1.unify(a9, m.trail))
            return m.fail();
        if (! a2.unify(a10, m.trail))
            return m.fail();
        if (! a3.unify(a11, m.trail))
            return m.fail();
        if (! a4.unify(a12, m.trail))
            return m.fail();
        a13 = m.mkvar1();
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a14 = m.mkvar1();
        return //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a1, a14), //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a5, a14), //
 Op("$less_than", FILE_nand::PRED_$less_than_2_static_exec, VA(a4, a8), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a13), cont))));
    }

    private final static Operation best_vector_12_4(Prolog m) { 
    // best_vector(A,B,C,D,E,F,C,G,E,F,C,G):-function_number(A,H),function_number(E,H),D>=G,!
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
        a12 = m.AREGS[11];
        cont = m.cont;
    // best_vector(A,B,C,D,E,F,C,G,E,F,C,G):-['$get_level'(H),function_number(A,I),function_number(E,I),'$greater_or_equal'(D,G),'$cut'(H)]
        if (! a3.unify(a7, m.trail))
            return m.fail();
        if (! a5.unify(a9, m.trail))
            return m.fail();
        if (! a6.unify(a10, m.trail))
            return m.fail();
        if (! a3.unify(a11, m.trail))
            return m.fail();
        if (! a8.unify(a12, m.trail))
            return m.fail();
        a13 = m.mkvar1();
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a14 = m.mkvar1();
        return //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a1, a14), //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a5, a14), //
 Op("$greater_or_equal", FILE_nand::PRED_$greater_or_equal_2_static_exec, VA(a4, a8), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a13), cont))));
    }

    private final static Operation best_vector_12_5(Prolog m) { 
    // best_vector(A,B,C,D,E,F,C,G,A,B,C,D):-'$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(C),function_number(A,H),function_number(E,I),H>I,!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        cont = m.cont;
    // best_vector(A,B,C,D,E,F,C,G,A,B,C,D):-['$get_level'(H),'$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(C),function_number(A,I),function_number(E,J),'$greater_than'(I,J),'$cut'(H)]
        if (! a3.unify(a7, m.trail))
            return m.fail();
        if (! a1.unify(a9, m.trail))
            return m.fail();
        if (! a2.unify(a10, m.trail))
            return m.fail();
        if (! a3.unify(a11, m.trail))
            return m.fail();
        if (! a4.unify(a12, m.trail))
            return m.fail();
        a13 = m.mkvar1();
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        return //
 Op("$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec, VA(a3), //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a1, a14), //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a5, a15), //
 Op("$greater_than", FILE_nand::PRED_$greater_than_2_static_exec, VA(a14, a15), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a13), cont)))));
    }

    private final static Operation best_vector_12_6(Prolog m) { 
    // best_vector(A,B,C,D,E,F,C,G,E,F,C,G):-'$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(C),function_number(A,H),function_number(E,I),H<I,!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        cont = m.cont;
    // best_vector(A,B,C,D,E,F,C,G,E,F,C,G):-['$get_level'(H),'$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(C),function_number(A,I),function_number(E,J),'$less_than'(I,J),'$cut'(H)]
        if (! a3.unify(a7, m.trail))
            return m.fail();
        if (! a5.unify(a9, m.trail))
            return m.fail();
        if (! a6.unify(a10, m.trail))
            return m.fail();
        if (! a3.unify(a11, m.trail))
            return m.fail();
        if (! a8.unify(a12, m.trail))
            return m.fail();
        a13 = m.mkvar1();
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        return //
 Op("$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec, VA(a3), //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a1, a14), //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a5, a15), //
 Op("$less_than", FILE_nand::PRED_$less_than_2_static_exec, VA(a14, a15), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a13), cont)))));
    }

    private final static Operation best_vector_12_7(Prolog m) { 
    // best_vector(A,B,C,D,E,F,C,G,A,B,C,D):-'$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(C),function_number(A,H),function_number(E,I),H<I,!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        cont = m.cont;
    // best_vector(A,B,C,D,E,F,C,G,A,B,C,D):-['$get_level'(H),'$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(C),function_number(A,I),function_number(E,J),'$less_than'(I,J),'$cut'(H)]
        if (! a3.unify(a7, m.trail))
            return m.fail();
        if (! a1.unify(a9, m.trail))
            return m.fail();
        if (! a2.unify(a10, m.trail))
            return m.fail();
        if (! a3.unify(a11, m.trail))
            return m.fail();
        if (! a4.unify(a12, m.trail))
            return m.fail();
        a13 = m.mkvar1();
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        return //
 Op("$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec, VA(a3), //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a1, a14), //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a5, a15), //
 Op("$less_than", FILE_nand::PRED_$less_than_2_static_exec, VA(a14, a15), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a13), cont)))));
    }

    private final static Operation best_vector_12_8(Prolog m) { 
    // best_vector(A,B,C,D,E,F,C,G,E,F,C,G):-'$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(C),function_number(A,H),function_number(E,I),H>I,!
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        cont = m.cont;
    // best_vector(A,B,C,D,E,F,C,G,E,F,C,G):-['$get_level'(H),'$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(C),function_number(A,I),function_number(E,J),'$greater_than'(I,J),'$cut'(H)]
        if (! a3.unify(a7, m.trail))
            return m.fail();
        if (! a5.unify(a9, m.trail))
            return m.fail();
        if (! a6.unify(a10, m.trail))
            return m.fail();
        if (! a3.unify(a11, m.trail))
            return m.fail();
        if (! a8.unify(a12, m.trail))
            return m.fail();
        a13 = m.mkvar1();
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        return //
 Op("$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec, VA(a3), //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a1, a14), //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a5, a15), //
 Op("$greater_than", FILE_nand::PRED_$greater_than_2_static_exec, VA(a14, a15), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a13), cont)))));
    }

    private final static Operation best_vector_12_9(Prolog m) { 
    // best_vector(A,B,C,D,E,F,G,H,A,B,C,D):-type_order(G,C),!
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
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        cont = m.cont;
    // best_vector(A,B,C,D,E,F,G,H,A,B,C,D):-['$get_level'(I),type_order(G,C),'$cut'(I)]
        if (! a1.unify(a9, m.trail))
            return m.fail();
        if (! a2.unify(a10, m.trail))
            return m.fail();
        if (! a3.unify(a11, m.trail))
            return m.fail();
        if (! a4.unify(a12, m.trail))
            return m.fail();
        a13 = m.mkvar1();
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("type_order", FILE_nand::PRED_type_order_2_static_exec, VA(a7, a3), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a13), cont));
    }

    private final static Operation best_vector_12_10(Prolog m) { 
    // best_vector(A,B,C,D,E,F,G,H,E,F,G,H):-type_order(C,G),!
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
        a10 = m.AREGS[9];
        a11 = m.AREGS[10];
        a12 = m.AREGS[11];
        cont = m.cont;
    // best_vector(A,B,C,D,E,F,G,H,E,F,G,H):-['$get_level'(I),type_order(C,G),'$cut'(I)]
        if (! a5.unify(a9, m.trail))
            return m.fail();
        if (! a6.unify(a10, m.trail))
            return m.fail();
        if (! a7.unify(a11, m.trail))
            return m.fail();
        if (! a8.unify(a12, m.trail))
            return m.fail();
        a13 = m.mkvar1();
        //START inline expansion of $get_level(a(13))
        if (! a13.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("type_order", FILE_nand::PRED_type_order_2_static_exec, VA(a3, a7), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a13), cont));
    }
/** PREDICATE: $dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/1,public)




    public static Operation PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_nand::$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1);
        return $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(m);
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(m);
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(Prolog m) { 
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-A=exp
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-['$unify'(A,exp)]
        //START inline expansion of $unify(a(1),@(ATOM_exp))
        if (! a1.unify(ATOM_exp, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(Prolog m) { 
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-A=var
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-['$unify'(A,var)]
        //START inline expansion of $unify(a(1),@(ATOM_var))
        if (! a1.unify(ATOM_var, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/1,public)




    public static Operation PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_nand::$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1);
        return $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(m);
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(m);
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(Prolog m) { 
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-A=exp
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-['$unify'(A,exp)]
        //START inline expansion of $unify(a(1),@(ATOM_exp))
        if (! a1.unify(ATOM_exp, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(Prolog m) { 
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-A=var
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-['$unify'(A,var)]
        //START inline expansion of $unify(a(1),@(ATOM_var))
        if (! a1.unify(ATOM_var, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/1,public)




    public static Operation PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_nand::$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1);
        return $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(m);
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(m);
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(Prolog m) { 
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-A=exp
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-['$unify'(A,exp)]
        //START inline expansion of $unify(a(1),@(ATOM_exp))
        if (! a1.unify(ATOM_exp, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(Prolog m) { 
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-A=var
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-['$unify'(A,var)]
        //START inline expansion of $unify(a(1),@(ATOM_var))
        if (! a1.unify(ATOM_var, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/1,public)




    public static Operation PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_nand::$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1);
        return $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(m);
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(m);
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(Prolog m) { 
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-'$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-['$get_level'(B),'$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec, VA(a1), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(Prolog m) { 
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/1,public)




    public static Operation PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_nand::$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1);
        return $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(m);
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(m);
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(Prolog m) { 
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-A=exp
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-['$unify'(A,exp)]
        //START inline expansion of $unify(a(1),@(ATOM_exp))
        if (! a1.unify(ATOM_exp, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(Prolog m) { 
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-A=var
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-['$unify'(A,var)]
        //START inline expansion of $unify(a(1),@(ATOM_var))
        if (! a1.unify(ATOM_var, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/1,public)




    public static Operation PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_nand::$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1);
        return $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(m);
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(m);
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_1(Prolog m) { 
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-'$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-['$get_level'(B),'$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec, VA(a1), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_2(Prolog m) { 
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A):-[]
        return cont;
    }
/** PREDICATE: max_type/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(max_type/3,public)




    public static Operation PRED_max_type_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_nand::max_type_3_sub_1);
        return max_type_3_1(m);
    }

    private final static Operation max_type_3_sub_1(Prolog m) { 
        m.trust(null);
        return max_type_3_2(m);
    }

    private final static Operation max_type_3_1(Prolog m) { 
    // max_type(A,B,A):-type_order(A,B),!
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // max_type(A,B,A):-['$get_level'(C),type_order(A,B),'$cut'(C)]
        if (! a1.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("type_order", FILE_nand::PRED_type_order_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a4), cont));
    }

    private final static Operation max_type_3_2(Prolog m) { 
    // max_type(A,B,B):-'$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B),!
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // max_type(A,B,B):-['$get_level'(C),'$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B),'$cut'(C)]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a4), cont));
    }
/** PREDICATE: $dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/2,public)




    public static Operation PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_nand::$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1);
        return $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(m);
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(m);
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(Prolog m) { 
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-type_order(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-['$get_level'(C),type_order(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("type_order", FILE_nand::PRED_type_order_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(Prolog m) { 
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: type_order/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(type_order/2,public)




    public static Operation PRED_type_order_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_nand::type_order_2_var, fail_0, fail_0, FILE_nand::type_order_2_var, fail_0, fail_0); 
    }

    private final static Operation type_order_2_var(Prolog m) { 
        m.jtry2(null, FILE_nand::type_order_2_var_1);
        return type_order_2_1(m);
    }

    private final static Operation type_order_2_var_1(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_2);
        return type_order_2_2(m);
    }

    private final static Operation type_order_2_var_2(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_3);
        return type_order_2_3(m);
    }

    private final static Operation type_order_2_var_3(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_4);
        return type_order_2_4(m);
    }

    private final static Operation type_order_2_var_4(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_5);
        return type_order_2_5(m);
    }

    private final static Operation type_order_2_var_5(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_6);
        return type_order_2_6(m);
    }

    private final static Operation type_order_2_var_6(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_7);
        return type_order_2_7(m);
    }

    private final static Operation type_order_2_var_7(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_8);
        return type_order_2_8(m);
    }

    private final static Operation type_order_2_var_8(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_9);
        return type_order_2_9(m);
    }

    private final static Operation type_order_2_var_9(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_10);
        return type_order_2_10(m);
    }

    private final static Operation type_order_2_var_10(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_11);
        return type_order_2_11(m);
    }

    private final static Operation type_order_2_var_11(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_12);
        return type_order_2_12(m);
    }

    private final static Operation type_order_2_var_12(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_13);
        return type_order_2_13(m);
    }

    private final static Operation type_order_2_var_13(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_14);
        return type_order_2_14(m);
    }

    private final static Operation type_order_2_var_14(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_15);
        return type_order_2_15(m);
    }

    private final static Operation type_order_2_var_15(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_16);
        return type_order_2_16(m);
    }

    private final static Operation type_order_2_var_16(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_17);
        return type_order_2_17(m);
    }

    private final static Operation type_order_2_var_17(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_18);
        return type_order_2_18(m);
    }

    private final static Operation type_order_2_var_18(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_19);
        return type_order_2_19(m);
    }

    private final static Operation type_order_2_var_19(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_20);
        return type_order_2_20(m);
    }

    private final static Operation type_order_2_var_20(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_21);
        return type_order_2_21(m);
    }

    private final static Operation type_order_2_var_21(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_22);
        return type_order_2_22(m);
    }

    private final static Operation type_order_2_var_22(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_23);
        return type_order_2_23(m);
    }

    private final static Operation type_order_2_var_23(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_24);
        return type_order_2_24(m);
    }

    private final static Operation type_order_2_var_24(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_25);
        return type_order_2_25(m);
    }

    private final static Operation type_order_2_var_25(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_26);
        return type_order_2_26(m);
    }

    private final static Operation type_order_2_var_26(Prolog m) { 
        m.retry(null, FILE_nand::type_order_2_var_27);
        return type_order_2_27(m);
    }

    private final static Operation type_order_2_var_27(Prolog m) { 
        m.trust(null);
        return type_order_2_28(m);
    }

    private final static Operation type_order_2_1(Prolog m) { 
    // type_order(cov,exp):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(cov,exp):-[]
        if (!  ATOM_cov .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exp .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_2(Prolog m) { 
    // type_order(cov,var):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(cov,var):-[]
        if (!  ATOM_cov .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_var .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_3(Prolog m) { 
    // type_order(cov,fcn):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(cov,fcn):-[]
        if (!  ATOM_cov .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_fcn .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_4(Prolog m) { 
    // type_order(cov,mcf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(cov,mcf):-[]
        if (!  ATOM_cov .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_mcf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_5(Prolog m) { 
    // type_order(cov,exf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(cov,exf):-[]
        if (!  ATOM_cov .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_6(Prolog m) { 
    // type_order(cov,exmcf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(cov,exmcf):-[]
        if (!  ATOM_cov .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exmcf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_7(Prolog m) { 
    // type_order(cov,nf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(cov,nf):-[]
        if (!  ATOM_cov .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_nf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_8(Prolog m) { 
    // type_order(exp,var):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(exp,var):-[]
        if (!  ATOM_exp .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_var .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_9(Prolog m) { 
    // type_order(exp,fcn):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(exp,fcn):-[]
        if (!  ATOM_exp .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_fcn .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_10(Prolog m) { 
    // type_order(exp,mcf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(exp,mcf):-[]
        if (!  ATOM_exp .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_mcf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_11(Prolog m) { 
    // type_order(exp,exf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(exp,exf):-[]
        if (!  ATOM_exp .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_12(Prolog m) { 
    // type_order(exp,exmcf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(exp,exmcf):-[]
        if (!  ATOM_exp .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exmcf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_13(Prolog m) { 
    // type_order(exp,nf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(exp,nf):-[]
        if (!  ATOM_exp .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_nf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_14(Prolog m) { 
    // type_order(var,fcn):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(var,fcn):-[]
        if (!  ATOM_var .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_fcn .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_15(Prolog m) { 
    // type_order(var,mcf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(var,mcf):-[]
        if (!  ATOM_var .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_mcf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_16(Prolog m) { 
    // type_order(var,exf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(var,exf):-[]
        if (!  ATOM_var .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_17(Prolog m) { 
    // type_order(var,exmcf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(var,exmcf):-[]
        if (!  ATOM_var .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exmcf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_18(Prolog m) { 
    // type_order(var,nf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(var,nf):-[]
        if (!  ATOM_var .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_nf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_19(Prolog m) { 
    // type_order(fcn,mcf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(fcn,mcf):-[]
        if (!  ATOM_fcn .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_mcf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_20(Prolog m) { 
    // type_order(fcn,exf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(fcn,exf):-[]
        if (!  ATOM_fcn .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_21(Prolog m) { 
    // type_order(fcn,exmcf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(fcn,exmcf):-[]
        if (!  ATOM_fcn .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exmcf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_22(Prolog m) { 
    // type_order(fcn,nf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(fcn,nf):-[]
        if (!  ATOM_fcn .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_nf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_23(Prolog m) { 
    // type_order(mcf,exf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(mcf,exf):-[]
        if (!  ATOM_mcf .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_24(Prolog m) { 
    // type_order(mcf,exmcf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(mcf,exmcf):-[]
        if (!  ATOM_mcf .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exmcf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_25(Prolog m) { 
    // type_order(mcf,nf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(mcf,nf):-[]
        if (!  ATOM_mcf .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_nf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_26(Prolog m) { 
    // type_order(exf,exmcf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(exf,exmcf):-[]
        if (!  ATOM_exf .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_exmcf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_27(Prolog m) { 
    // type_order(exf,nf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(exf,nf):-[]
        if (!  ATOM_exf .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_nf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation type_order_2_28(Prolog m) { 
    // type_order(exmcf,nf):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // type_order(exmcf,nf):-[]
        if (!  ATOM_exmcf .unify(a1, m.trail))
            return m.fail();
        if (!  ATOM_nf .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: cover_vector/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(cover_vector/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_cover_vector_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // cover_vector(A,B,C,D,E,F,G):-immediate_predecessors(D,H),conceivable_inputs(D,I),vector_types(J),cover_vector(J,H,I,D,E,A,B,C,F,G)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
        a7 = LARG[6];
    // cover_vector(A,B,C,D,E,F,G):-[immediate_predecessors(D,H),conceivable_inputs(D,I),vector_types(J),cover_vector(J,H,I,D,E,A,B,C,F,G)]
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        return //
 Op("immediate_predecessors", FILE_nand::PRED_immediate_predecessors_2_static_exec, VA(a4, a8), //
 Op("conceivable_inputs", FILE_nand::PRED_conceivable_inputs_2_static_exec, VA(a4, a9), //
 Op("vector_types", FILE_nand::PRED_vector_types_1_static_exec, VA(a10), //
 Op("cover_vector", FILE_nand::PRED_cover_vector_10_static_exec, VA(a10, a8, a9, a4, a5, a1, a2, a3, a6, a7), cont))));
    }
/** PREDICATE: vector_types/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(vector_types/1,public)




    public static Operation PRED_vector_types_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_nand::vector_types_1_var, fail_0, fail_0, FILE_nand::vector_types_1_var, fail_0, fail_0); 
    }

    private final static Operation vector_types_1_var(Prolog m) { 
        m.jtry1(null, FILE_nand::vector_types_1_var_1);
        return vector_types_1_1(m);
    }

    private final static Operation vector_types_1_var_1(Prolog m) { 
        m.retry(null, FILE_nand::vector_types_1_var_2);
        return vector_types_1_2(m);
    }

    private final static Operation vector_types_1_var_2(Prolog m) { 
        m.retry(null, FILE_nand::vector_types_1_var_3);
        return vector_types_1_3(m);
    }

    private final static Operation vector_types_1_var_3(Prolog m) { 
        m.retry(null, FILE_nand::vector_types_1_var_4);
        return vector_types_1_4(m);
    }

    private final static Operation vector_types_1_var_4(Prolog m) { 
        m.retry(null, FILE_nand::vector_types_1_var_5);
        return vector_types_1_5(m);
    }

    private final static Operation vector_types_1_var_5(Prolog m) { 
        m.retry(null, FILE_nand::vector_types_1_var_6);
        return vector_types_1_6(m);
    }

    private final static Operation vector_types_1_var_6(Prolog m) { 
        m.trust(null);
        return vector_types_1_7(m);
    }

    private final static Operation vector_types_1_1(Prolog m) { 
    // vector_types(var):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // vector_types(var):-[]
        if (!  ATOM_var .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation vector_types_1_2(Prolog m) { 
    // vector_types(exp):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // vector_types(exp):-[]
        if (!  ATOM_exp .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation vector_types_1_3(Prolog m) { 
    // vector_types(fcn):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // vector_types(fcn):-[]
        if (!  ATOM_fcn .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation vector_types_1_4(Prolog m) { 
    // vector_types(mcf):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // vector_types(mcf):-[]
        if (!  ATOM_mcf .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation vector_types_1_5(Prolog m) { 
    // vector_types(exf):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // vector_types(exf):-[]
        if (!  ATOM_exf .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation vector_types_1_6(Prolog m) { 
    // vector_types(exmcf):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // vector_types(exmcf):-[]
        if (!  ATOM_exmcf .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation vector_types_1_7(Prolog m) { 
    // vector_types(nf):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // vector_types(nf):-[]
        if (!  ATOM_nf .unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: $dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/2,public)




    public static Operation PRED_$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_nand::$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1);
        return $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(m);
    }

    private final static Operation $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(m);
    }

    private final static Operation $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(Prolog m) { 
    // '$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-set_member(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-['$get_level'(C),set_member(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(Prolog m) { 
    // '$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: cover_vector/10
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(cover_vector/10,public)

    // private final Term arg5, arg6, arg7, arg8, arg9, arg10;




    public static Operation PRED_cover_vector_10_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return cover_vector_10_top(m);
    }

    private final static Operation cover_vector_10_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_nand::cover_vector_10_var, fail_0, fail_0, FILE_nand::cover_vector_10_var, fail_0, fail_0); 
    }

    private final static Operation cover_vector_10_var(Prolog m) { 
        m.jtry(10, null, FILE_nand::cover_vector_10_var_1);
        return cover_vector_10_1(m);
    }

    private final static Operation cover_vector_10_var_1(Prolog m) { 
        m.retry(null, FILE_nand::cover_vector_10_var_2);
        return cover_vector_10_2(m);
    }

    private final static Operation cover_vector_10_var_2(Prolog m) { 
        m.retry(null, FILE_nand::cover_vector_10_var_3);
        return cover_vector_10_3(m);
    }

    private final static Operation cover_vector_10_var_3(Prolog m) { 
        m.retry(null, FILE_nand::cover_vector_10_var_4);
        return cover_vector_10_4(m);
    }

    private final static Operation cover_vector_10_var_4(Prolog m) { 
        m.retry(null, FILE_nand::cover_vector_10_var_5);
        return cover_vector_10_5(m);
    }

    private final static Operation cover_vector_10_var_5(Prolog m) { 
        m.retry(null, FILE_nand::cover_vector_10_var_6);
        return cover_vector_10_6(m);
    }

    private final static Operation cover_vector_10_var_6(Prolog m) { 
        m.retry(null, FILE_nand::cover_vector_10_var_7);
        return cover_vector_10_7(m);
    }

    private final static Operation cover_vector_10_var_7(Prolog m) { 
        m.retry(null, FILE_nand::cover_vector_10_var_8);
        return cover_vector_10_8(m);
    }

    private final static Operation cover_vector_10_var_8(Prolog m) { 
        m.retry(null, FILE_nand::cover_vector_10_var_9);
        return cover_vector_10_9(m);
    }

    private final static Operation cover_vector_10_var_9(Prolog m) { 
        m.retry(null, FILE_nand::cover_vector_10_var_10);
        return cover_vector_10_10(m);
    }

    private final static Operation cover_vector_10_var_10(Prolog m) { 
        m.retry(null, FILE_nand::cover_vector_10_var_11);
        return cover_vector_10_11(m);
    }

    private final static Operation cover_vector_10_var_11(Prolog m) { 
        m.retry(null, FILE_nand::cover_vector_10_var_12);
        return cover_vector_10_12(m);
    }

    private final static Operation cover_vector_10_var_12(Prolog m) { 
        m.trust(null);
        return cover_vector_10_13(m);
    }

    private final static Operation cover_vector_10_1(Prolog m) { 
    // cover_vector(exp,[A|B],C,D,E,F,G,H,G,I):-function(A,H,J),true_set(J,K),'$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(E,K),update_circuit(H,J,D,E,H,I)
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
        a10 = m.AREGS[9];
        cont = m.cont;
    // cover_vector(exp,[A|B],C,D,E,F,G,H,G,I):-[function(A,H,J),true_set(J,K),'$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(E,K),update_circuit(H,J,D,E,H,I)]
        if (!  ATOM_exp .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        a11 = a2.car();
        } else if (a2.isVar()){
            a11 = m.mkvar2();
             a2.bind(CONS(a11, m.DONTCARE("cons(a(2))")), m.trail);
        } else {
            return m.fail();
        }
        if (! a7.unify(a9, m.trail))
            return m.fail();
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        return //
 Op("function", FILE_nand::PRED_function_3_static_exec, VA(a11, a8, a12), //
 Op("true_set", FILE_nand::PRED_true_set_2_static_exec, VA(a12, a13), //
 Op("$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec, VA(a5, a13), //
 Op("update_circuit", FILE_nand::PRED_update_circuit_6_static_exec, VA(a8, a12, a4, a5, a8, a10), cont))));
    }

    private final static Operation cover_vector_10_2(Prolog m) { 
    // cover_vector(exp,[A|B],C,D,E,F,G,H,G,I):-cover_vector(exp,B,J,D,E,F,G,H,G,I)
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
        a10 = m.AREGS[9];
        cont = m.cont;
    // cover_vector(exp,[A|B],C,D,E,F,G,H,G,I):-[cover_vector(exp,B,J,D,E,F,G,H,G,I)]
        if (!  ATOM_exp .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                        a11 = a2.cdr();
        } else if (a2.isVar()){
            a11 = m.mkvar2();
             a2.bind(CONS(m.DONTCARE("cons(a(2))"), a11), m.trail);
        } else {
            return m.fail();
        }
        if (! a7.unify(a9, m.trail))
            return m.fail();
        m.AREGS[0] =  ATOM_exp ;
        m.AREGS[1] = a11;
        m.AREGS[2] = m.mkvar3();
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a6;
        m.AREGS[6] = a7;
        m.AREGS[7] = a8;
        m.AREGS[8] = a7;
        m.AREGS[9] = a10;
m.cont = cont;
        return cover_vector_10_top(m);
    }

    private final static Operation cover_vector_10_3(Prolog m) { 
    // cover_vector(var,A,[B|C],D,E,F,G,H,G,I):-B<F,function(B,H,J),false_set(J,K),set_member(E,K),update_circuit(H,J,D,E,H,I)
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
        a10 = m.AREGS[9];
        cont = m.cont;
    // cover_vector(var,A,[B|C],D,E,F,G,H,G,I):-['$less_than'(B,F),function(B,H,J),false_set(J,K),set_member(E,K),update_circuit(H,J,D,E,H,I)]
        if (!  ATOM_var .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a11 = a3.car();
        } else if (a3.isVar()){
            a11 = m.mkvar2();
             a3.bind(CONS(a11, m.DONTCARE("cons(a(3))")), m.trail);
        } else {
            return m.fail();
        }
        if (! a7.unify(a9, m.trail))
            return m.fail();
        //START inline expansion of $less_than(a(11),a(6))
        if (Arithmetic.evaluate(a11).arithCompareTo(Arithmetic.evaluate(a6)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        return //
 Op("function", FILE_nand::PRED_function_3_static_exec, VA(a11, a8, a12), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a12, a13), //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a5, a13), //
 Op("update_circuit", FILE_nand::PRED_update_circuit_6_static_exec, VA(a8, a12, a4, a5, a8, a10), cont))));
    }

    private final static Operation cover_vector_10_4(Prolog m) { 
    // cover_vector(var,A,[B|C],D,E,F,G,H,G,I):-cover_vector(var,J,C,D,E,F,G,H,G,I)
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
        a10 = m.AREGS[9];
        cont = m.cont;
    // cover_vector(var,A,[B|C],D,E,F,G,H,G,I):-[cover_vector(var,J,C,D,E,F,G,H,G,I)]
        if (!  ATOM_var .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a11 = a3.cdr();
        } else if (a3.isVar()){
            a11 = m.mkvar2();
             a3.bind(CONS(m.DONTCARE("cons(a(3))"), a11), m.trail);
        } else {
            return m.fail();
        }
        if (! a7.unify(a9, m.trail))
            return m.fail();
        m.AREGS[0] =  ATOM_var ;
        m.AREGS[1] = m.mkvar3();
        m.AREGS[2] = a11;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a6;
        m.AREGS[6] = a7;
        m.AREGS[7] = a8;
        m.AREGS[8] = a7;
        m.AREGS[9] = a10;
m.cont = cont;
        return cover_vector_10_top(m);
    }

    private final static Operation cover_vector_10_5(Prolog m) { 
    // cover_vector(fcn,A,[B|C],D,E,F,G,H,G,I):-B>=F,function(B,H,J),false_set(J,K),set_member(E,K),true_set(J,L),false_set(D,M),set_subset(M,L),update_circuit(H,J,D,E,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        cont = m.cont;
    // cover_vector(fcn,A,[B|C],D,E,F,G,H,G,I):-['$greater_or_equal'(B,F),function(B,H,J),false_set(J,K),set_member(E,K),true_set(J,L),false_set(D,M),set_subset(M,L),update_circuit(H,J,D,E,H,I)]
        if (!  ATOM_fcn .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a11 = a3.car();
        } else if (a3.isVar()){
            a11 = m.mkvar2();
             a3.bind(CONS(a11, m.DONTCARE("cons(a(3))")), m.trail);
        } else {
            return m.fail();
        }
        if (! a7.unify(a9, m.trail))
            return m.fail();
        //START inline expansion of $greater_or_equal(a(11),a(6))
        if (Arithmetic.evaluate(a11).arithCompareTo(Arithmetic.evaluate(a6)) < 0) {
            return m.fail();
        }
        //END inline expansion
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        return //
 Op("function", FILE_nand::PRED_function_3_static_exec, VA(a11, a8, a12), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a12, a13), //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a5, a13), //
 Op("true_set", FILE_nand::PRED_true_set_2_static_exec, VA(a12, a14), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a4, a15), //
 Op("set_subset", FILE_nand::PRED_set_subset_2_static_exec, VA(a15, a14), //
 Op("update_circuit", FILE_nand::PRED_update_circuit_6_static_exec, VA(a8, a12, a4, a5, a8, a10), cont)))))));
    }

    private final static Operation cover_vector_10_6(Prolog m) { 
    // cover_vector(fcn,A,[B|C],D,E,F,G,H,G,I):-cover_vector(fcn,J,C,D,E,F,G,H,G,I)
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
        a10 = m.AREGS[9];
        cont = m.cont;
    // cover_vector(fcn,A,[B|C],D,E,F,G,H,G,I):-[cover_vector(fcn,J,C,D,E,F,G,H,G,I)]
        if (!  ATOM_fcn .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a11 = a3.cdr();
        } else if (a3.isVar()){
            a11 = m.mkvar2();
             a3.bind(CONS(m.DONTCARE("cons(a(3))"), a11), m.trail);
        } else {
            return m.fail();
        }
        if (! a7.unify(a9, m.trail))
            return m.fail();
        m.AREGS[0] =  ATOM_fcn ;
        m.AREGS[1] = m.mkvar3();
        m.AREGS[2] = a11;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a6;
        m.AREGS[6] = a7;
        m.AREGS[7] = a8;
        m.AREGS[8] = a7;
        m.AREGS[9] = a10;
m.cont = cont;
        return cover_vector_10_top(m);
    }

    private final static Operation cover_vector_10_7(Prolog m) { 
    // cover_vector(mcf,A,[B|C],D,E,F,G,H,G,I):-B>=F,function(B,H,J),false_set(J,K),set_member(E,K),true_set(J,L),false_set(D,M),'$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(L,M),update_circuit(H,J,D,E,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        cont = m.cont;
    // cover_vector(mcf,A,[B|C],D,E,F,G,H,G,I):-['$greater_or_equal'(B,F),function(B,H,J),false_set(J,K),set_member(E,K),true_set(J,L),false_set(D,M),'$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(L,M),update_circuit(H,J,D,E,H,I)]
        if (!  ATOM_mcf .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a11 = a3.car();
        } else if (a3.isVar()){
            a11 = m.mkvar2();
             a3.bind(CONS(a11, m.DONTCARE("cons(a(3))")), m.trail);
        } else {
            return m.fail();
        }
        if (! a7.unify(a9, m.trail))
            return m.fail();
        //START inline expansion of $greater_or_equal(a(11),a(6))
        if (Arithmetic.evaluate(a11).arithCompareTo(Arithmetic.evaluate(a6)) < 0) {
            return m.fail();
        }
        //END inline expansion
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        return //
 Op("function", FILE_nand::PRED_function_3_static_exec, VA(a11, a8, a12), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a12, a13), //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a5, a13), //
 Op("true_set", FILE_nand::PRED_true_set_2_static_exec, VA(a12, a14), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a4, a15), //
 Op("$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec, VA(a14, a15), //
 Op("update_circuit", FILE_nand::PRED_update_circuit_6_static_exec, VA(a8, a12, a4, a5, a8, a10), cont)))))));
    }

    private final static Operation cover_vector_10_8(Prolog m) { 
    // cover_vector(mcf,A,[B|C],D,E,F,G,H,G,I):-cover_vector(mcf,J,C,D,E,F,G,H,G,I)
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
        a10 = m.AREGS[9];
        cont = m.cont;
    // cover_vector(mcf,A,[B|C],D,E,F,G,H,G,I):-[cover_vector(mcf,J,C,D,E,F,G,H,G,I)]
        if (!  ATOM_mcf .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a11 = a3.cdr();
        } else if (a3.isVar()){
            a11 = m.mkvar2();
             a3.bind(CONS(m.DONTCARE("cons(a(3))"), a11), m.trail);
        } else {
            return m.fail();
        }
        if (! a7.unify(a9, m.trail))
            return m.fail();
        m.AREGS[0] =  ATOM_mcf ;
        m.AREGS[1] = m.mkvar3();
        m.AREGS[2] = a11;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a6;
        m.AREGS[6] = a7;
        m.AREGS[7] = a8;
        m.AREGS[8] = a7;
        m.AREGS[9] = a10;
m.cont = cont;
        return cover_vector_10_top(m);
    }

    private final static Operation cover_vector_10_9(Prolog m) { 
    // cover_vector(exf,A,[B|C],D,E,F,G,H,G,I):-B>=F,function(B,H,J),false_set(J,K),'$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(E,K),true_set(J,L),'$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(E,L),false_set(D,M),set_subset(M,L),update_circuit(H,J,D,E,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        cont = m.cont;
    // cover_vector(exf,A,[B|C],D,E,F,G,H,G,I):-['$greater_or_equal'(B,F),function(B,H,J),false_set(J,K),'$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(E,K),true_set(J,L),'$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(E,L),false_set(D,M),set_subset(M,L),update_circuit(H,J,D,E,H,I)]
        if (!  ATOM_exf .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a11 = a3.car();
        } else if (a3.isVar()){
            a11 = m.mkvar2();
             a3.bind(CONS(a11, m.DONTCARE("cons(a(3))")), m.trail);
        } else {
            return m.fail();
        }
        if (! a7.unify(a9, m.trail))
            return m.fail();
        //START inline expansion of $greater_or_equal(a(11),a(6))
        if (Arithmetic.evaluate(a11).arithCompareTo(Arithmetic.evaluate(a6)) < 0) {
            return m.fail();
        }
        //END inline expansion
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        return //
 Op("function", FILE_nand::PRED_function_3_static_exec, VA(a11, a8, a12), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a12, a13), //
 Op("$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec, VA(a5, a13), //
 Op("true_set", FILE_nand::PRED_true_set_2_static_exec, VA(a12, a14), //
 Op("$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec, VA(a5, a14), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a4, a15), //
 Op("set_subset", FILE_nand::PRED_set_subset_2_static_exec, VA(a15, a14), //
 Op("update_circuit", FILE_nand::PRED_update_circuit_6_static_exec, VA(a8, a12, a4, a5, a8, a10), cont))))))));
    }

    private final static Operation cover_vector_10_10(Prolog m) { 
    // cover_vector(exf,A,[B|C],D,E,F,G,H,G,I):-cover_vector(exf,J,C,D,E,F,G,H,G,I)
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
        a10 = m.AREGS[9];
        cont = m.cont;
    // cover_vector(exf,A,[B|C],D,E,F,G,H,G,I):-[cover_vector(exf,J,C,D,E,F,G,H,G,I)]
        if (!  ATOM_exf .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a11 = a3.cdr();
        } else if (a3.isVar()){
            a11 = m.mkvar2();
             a3.bind(CONS(m.DONTCARE("cons(a(3))"), a11), m.trail);
        } else {
            return m.fail();
        }
        if (! a7.unify(a9, m.trail))
            return m.fail();
        m.AREGS[0] =  ATOM_exf ;
        m.AREGS[1] = m.mkvar3();
        m.AREGS[2] = a11;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a6;
        m.AREGS[6] = a7;
        m.AREGS[7] = a8;
        m.AREGS[8] = a7;
        m.AREGS[9] = a10;
m.cont = cont;
        return cover_vector_10_top(m);
    }

    private final static Operation cover_vector_10_11(Prolog m) { 
    // cover_vector(exmcf,A,[B|C],D,E,F,G,H,G,I):-B>=F,function(B,H,J),false_set(J,K),'$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(E,K),true_set(J,L),'$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(E,L),false_set(D,M),'$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(L,M),update_circuit(H,J,D,E,H,I)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
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
        a9 = m.AREGS[8];
        a10 = m.AREGS[9];
        cont = m.cont;
    // cover_vector(exmcf,A,[B|C],D,E,F,G,H,G,I):-['$greater_or_equal'(B,F),function(B,H,J),false_set(J,K),'$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(E,K),true_set(J,L),'$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(E,L),false_set(D,M),'$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(L,M),update_circuit(H,J,D,E,H,I)]
        if (!  ATOM_exmcf .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a11 = a3.car();
        } else if (a3.isVar()){
            a11 = m.mkvar2();
             a3.bind(CONS(a11, m.DONTCARE("cons(a(3))")), m.trail);
        } else {
            return m.fail();
        }
        if (! a7.unify(a9, m.trail))
            return m.fail();
        //START inline expansion of $greater_or_equal(a(11),a(6))
        if (Arithmetic.evaluate(a11).arithCompareTo(Arithmetic.evaluate(a6)) < 0) {
            return m.fail();
        }
        //END inline expansion
        a12 = m.mkvar1();
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        return //
 Op("function", FILE_nand::PRED_function_3_static_exec, VA(a11, a8, a12), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a12, a13), //
 Op("$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec, VA(a5, a13), //
 Op("true_set", FILE_nand::PRED_true_set_2_static_exec, VA(a12, a14), //
 Op("$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec, VA(a5, a14), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a4, a15), //
 Op("$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec, VA(a14, a15), //
 Op("update_circuit", FILE_nand::PRED_update_circuit_6_static_exec, VA(a8, a12, a4, a5, a8, a10), cont))))))));
    }

    private final static Operation cover_vector_10_12(Prolog m) { 
    // cover_vector(exmcf,A,[B|C],D,E,F,G,H,G,I):-cover_vector(exmcf,J,C,D,E,F,G,H,G,I)
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
        a10 = m.AREGS[9];
        cont = m.cont;
    // cover_vector(exmcf,A,[B|C],D,E,F,G,H,G,I):-[cover_vector(exmcf,J,C,D,E,F,G,H,G,I)]
        if (!  ATOM_exmcf .unify(a1, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        a11 = a3.cdr();
        } else if (a3.isVar()){
            a11 = m.mkvar2();
             a3.bind(CONS(m.DONTCARE("cons(a(3))"), a11), m.trail);
        } else {
            return m.fail();
        }
        if (! a7.unify(a9, m.trail))
            return m.fail();
        m.AREGS[0] =  ATOM_exmcf ;
        m.AREGS[1] = m.mkvar3();
        m.AREGS[2] = a11;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a6;
        m.AREGS[6] = a7;
        m.AREGS[7] = a8;
        m.AREGS[8] = a7;
        m.AREGS[9] = a10;
m.cont = cont;
        return cover_vector_10_top(m);
    }

    private final static Operation cover_vector_10_13(Prolog m) { 
    // cover_vector(nf,A,B,C,D,E,F,G,H,I):-H is F+1,false_set(C,J),new_function_CIs(G,function(F,J,[D],[],[],[],[],[]),E,K,L),update_circuit(K,L,C,D,K,I)
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
    // cover_vector(nf,A,B,C,D,E,F,G,H,I):-[H is F+1,false_set(C,J),new_function_CIs(G,function(F,J,[D],[],[],[],[],[]),E,K,L),update_circuit(K,L,C,D,K,I)]
        if (!  ATOM_nf .unify(a1, m.trail))
            return m.fail();
    // put_str_args([a(7),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(11))
        a11 =  S( FUNCTOR_$002B_2 , a7,  int_1 );
 ;
        //START inline expansion of a(9)is a(11)
        if (! a9.unify(Arithmetic.evaluate(a11), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a12 = m.mkvar1();
        a13 = CONS(a5,  Prolog.Nil );
    // put_str_args([a(7),a(12),a(13),@('Prolog.Nil'),@('Prolog.Nil'),@('Prolog.Nil'),@('Prolog.Nil'),@('Prolog.Nil')],y(2)),put_str(@('FUNCTOR_function_8'),y(2),a(14))
        a14 =  S( FUNCTOR_function_8 , a7, a12, a13,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
 ;
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        return //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a4, a12), //
 Op("new_function_CIs", FILE_nand::PRED_new_function_CIs_5_static_exec, VA(a8, a14, a6, a15, a16), //
 Op("update_circuit", FILE_nand::PRED_update_circuit_6_static_exec, VA(a15, a16, a4, a5, a15, a10), cont)));
    }
/** PREDICATE: $dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/2,public)




    public static Operation PRED_$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_nand::$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1);
        return $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(m);
    }

    private final static Operation $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(m);
    }

    private final static Operation $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(Prolog m) { 
    // '$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-set_subset(B,A),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-['$get_level'(C),set_subset(B,A),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_subset", FILE_nand::PRED_set_subset_2_static_exec, VA(a2, a1), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(Prolog m) { 
    // '$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/2,public)




    public static Operation PRED_$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_nand::$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1);
        return $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(m);
    }

    private final static Operation $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(m);
    }

    private final static Operation $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(Prolog m) { 
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-set_member(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-['$get_level'(C),set_member(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(Prolog m) { 
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/2,public)




    public static Operation PRED_$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_nand::$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1);
        return $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(m);
    }

    private final static Operation $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(m);
    }

    private final static Operation $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(Prolog m) { 
    // '$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-set_member(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-['$get_level'(C),set_member(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(Prolog m) { 
    // '$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/2,public)




    public static Operation PRED_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_nand::$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1);
        return $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(m);
    }

    private final static Operation $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(m);
    }

    private final static Operation $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(Prolog m) { 
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-set_member(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-['$get_level'(C),set_member(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(Prolog m) { 
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/2,public)




    public static Operation PRED_$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_nand::$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1);
        return $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(m);
    }

    private final static Operation $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(m);
    }

    private final static Operation $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(Prolog m) { 
    // '$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-set_member(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-['$get_level'(C),set_member(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(Prolog m) { 
    // '$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: $dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/2,public)




    public static Operation PRED_$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_nand::$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1);
        return $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(m);
    }

    private final static Operation $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(m);
    }

    private final static Operation $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_1(Prolog m) { 
    // '$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-set_subset(B,A),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-['$get_level'(C),set_subset(B,A),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_subset", FILE_nand::PRED_set_subset_2_static_exec, VA(a2, a1), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_2(Prolog m) { 
    // '$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: update_circuit/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(update_circuit/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_update_circuit_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_nand::update_circuit_6_var, fail_0, fail_0, FILE_nand::update_circuit_6_1, fail_0, FILE_nand::update_circuit_6_2); 
    }

    private final static Operation update_circuit_6_var(Prolog m) { 
        m.jtry6(null, FILE_nand::update_circuit_6_var_1);
        return update_circuit_6_1(m);
    }

    private final static Operation update_circuit_6_var_1(Prolog m) { 
        m.trust(null);
        return update_circuit_6_2(m);
    }

    private final static Operation update_circuit_6_1(Prolog m) { 
    // update_circuit([],A,B,C,D,[]):-true
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // update_circuit([],A,B,C,D,[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a6, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation update_circuit_6_2(Prolog m) { 
    // update_circuit([function(A,B,C,D,E,F,G,H)|I],J,K,L,M,[function(A,N,O,P,Q,R,S,T)|U]):-J=function(V,W,X,Y,Z,A1,B1,C1),K=function(D1,E1,F1,G1,H1,I1,J1,K1),set_union([V],B1,L1),set_union([D1],K1,M1),'$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,X,D1,N1),'$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,V,F1,N1,O1),'$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,L,N,Z,A1,O1),'$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,C,L,O,V),'$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,D,V,B1,M1,P1),'$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(C,D,L,V,P1,Q1),'$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,L,M,V,Q1,R1),'$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,P,V,D1,R1),'$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,E,Q,V,D1),'$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,F,R,V,D1),'$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,G,S,L1,M1),'$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,H,T,L1,M1),update_circuit(I,J,K,L,M,U)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // update_circuit([function(A,B,C,D,E,F,G,H)|I],J,K,L,M,[function(A,N,O,P,Q,R,S,T)|U]):-['$unify'(J,function(V,W,X,Y,Z,A1,B1,C1)),'$unify'(K,function(D1,E1,F1,G1,H1,I1,J1,K1)),set_union([V],B1,L1),set_union([D1],K1,M1),'$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,X,D1,N1),'$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,V,F1,N1,O1),'$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,L,N,Z,A1,O1),'$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,C,L,O,V),'$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,D,V,B1,M1,P1),'$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(C,D,L,V,P1,Q1),'$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,L,M,V,Q1,R1),'$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,P,V,D1,R1),'$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,E,Q,V,D1),'$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,F,R,V,D1),'$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,G,S,L1,M1),'$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,H,T,L1,M1),update_circuit(I,J,K,L,M,U)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a7 = a1.car();
            a8 = a1.cdr();
        } else if (a1.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a1.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a7 = a7.dref();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            a14 = m.mkvar2();
            a15 = m.mkvar2();
            a16 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_function_8 , m.trail, a9, a10, a11, a12, a13, a14, a15, a16)){
                return m.fail();
            }
        a6 = a6.dref();
        if (a6 .isCons()){
                        a17 = a6.car();
            a18 = a6.cdr();
        } else if (a6.isVar()){
            a17 = m.mkvar2();
            a18 = m.mkvar2();
             a6.bind(CONS(a17, a18), m.trail);
        } else {
            return m.fail();
        }
        a17 = a17.dref();
            a19 = m.mkvar2();
            a20 = m.mkvar2();
            a21 = m.mkvar2();
            a22 = m.mkvar2();
            a23 = m.mkvar2();
            a24 = m.mkvar2();
            a25 = m.mkvar2();
            if (!a17.unifyS( FUNCTOR_function_8 , m.trail, a9, a19, a20, a21, a22, a23, a24, a25)){
                return m.fail();
            }
        a26 = m.mkvar1();
        a27 = m.mkvar1();
        a28 = m.mkvar1();
        a29 = m.mkvar1();
        a30 = m.mkvar1();
    // put_str_args([a(26),void,a(27),void,a(28),a(29),a(30),void],y(1)),put_str(@('FUNCTOR_function_8'),y(1),a(31))
        a31 =  S( FUNCTOR_function_8 , a26, m.mkvar3(), a27, m.mkvar3(), a28, a29, a30, m.mkvar3());
 ;
        //START inline expansion of $unify(a(2),a(31))
        if (! a2.unify(a31, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a32 = m.mkvar1();
        a33 = m.mkvar1();
        a34 = m.mkvar1();
    // put_str_args([a(32),void,a(33),void,void,void,void,a(34)],y(2)),put_str(@('FUNCTOR_function_8'),y(2),a(35))
        a35 =  S( FUNCTOR_function_8 , a32, m.mkvar3(), a33, m.mkvar3(), m.mkvar3(), m.mkvar3(), m.mkvar3(), a34);
 ;
        //START inline expansion of $unify(a(3),a(35))
        if (! a3.unify(a35, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a36 = CONS(a26,  Prolog.Nil );
        a37 = m.mkvar1();
        a38 = CONS(a32,  Prolog.Nil );
        a39 = m.mkvar1();
        a40 = m.mkvar1();
        a41 = m.mkvar1();
        a42 = m.mkvar1();
        a43 = m.mkvar1();
        a44 = m.mkvar1();
        return //
 Op("set_union", FILE_nand::PRED_set_union_3_static_exec, VA(a36, a30, a37), //
 Op("set_union", FILE_nand::PRED_set_union_3_static_exec, VA(a38, a34, a39), //
 Op("$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec, VA(a9, a10, a27, a32, a40), //
 Op("$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec, VA(a9, a26, a33, a40, a41), //
 Op("$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec, VA(a9, a4, a19, a28, a29, a41), //
 Op("$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec, VA(a9, a11, a4, a20, a26), //
 Op("$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec, VA(a9, a12, a26, a30, a39, a42), //
 Op("$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec, VA(a11, a12, a4, a26, a42, a43), //
 Op("$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec, VA(a9, a4, a5, a26, a43, a44), //
 Op("$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec, VA(a9, a21, a26, a32, a44), //
 Op("$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec, VA(a9, a13, a22, a26, a32), //
 Op("$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec, VA(a9, a14, a23, a26, a32), //
 Op("$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec, VA(a9, a15, a24, a37, a39), //
 Op("$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec, VA(a9, a16, a25, a37, a39), //
 Op("update_circuit", FILE_nand::PRED_update_circuit_6_static_exec, VA(a8, a2, a3, a4, a5, a18), cont)))))))))))))));
    }
/** PREDICATE: $dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/5,public)

    // private final Term arg5;




    public static Operation PRED_$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_nand::$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1);
        return $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(m);
    }

    private final static Operation $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(m);
    }

    private final static Operation $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(Prolog m) { 
    // '$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-A=D,!,set_union(B,C,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$get_level'(F),'$unify'(A,D),'$cut'(F),set_union(B,C,E)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),a(4))
        if (! a1.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op("set_union", FILE_nand::PRED_set_union_3_static_exec, VA(a2, a3, a5), cont);
    }

    private final static Operation $dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(Prolog m) { 
    // '$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-E=B
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$unify'(E,B)]
        //START inline expansion of $unify(a(5),a(2))
        if (! a5.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/5,public)

    // private final Term arg5;




    public static Operation PRED_$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_nand::$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1);
        return $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(m);
    }

    private final static Operation $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(m);
    }

    private final static Operation $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(Prolog m) { 
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-A=B,!,set_union(D,C,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$get_level'(F),'$unify'(A,B),'$cut'(F),set_union(D,C,E)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),a(2))
        if (! a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        return //
 Op("set_union", FILE_nand::PRED_set_union_3_static_exec, VA(a4, a3, a5), cont);
    }

    private final static Operation $dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(Prolog m) { 
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-E=D
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$unify'(E,D)]
        //START inline expansion of $unify(a(5),a(4))
        if (! a5.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/3,public)




    public static Operation PRED_$dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_nand::$dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_sub_1);
        return $dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_1(m);
    }

    private final static Operation $dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_2(m);
    }

    private final static Operation $dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_1(Prolog m) { 
    // '$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C):-set_member(A,B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C):-[set_member(A,B)]
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a2), cont);
    }

    private final static Operation $dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_2(Prolog m) { 
    // '$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C):-set_member(A,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C):-[set_member(A,C)]
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a3), cont);
    }
/** PREDICATE: $dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_nand::$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_sub_1);
        return $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_1(m);
    }

    private final static Operation $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_2(m);
    }

    private final static Operation $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_1(Prolog m) { 
    // '$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-'$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,D,E),!,set_union(F,[B],C)
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
    // '$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-['$get_level'(G),'$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,D,E),'$cut'(G),set_union(F,[B],C)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = CONS(a2,  Prolog.Nil );
        return //
 Op("$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_static_exec, VA(a1, a4, a5), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a7), //
 Op("set_union", FILE_nand::PRED_set_union_3_static_exec, VA(a6, a8, a3), cont)));
    }

    private final static Operation $dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_2(Prolog m) { 
    // '$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-C=F
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-['$unify'(C,F)]
        //START inline expansion of $unify(a(3),a(6))
        if (! a3.unify(a6, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/5,public)

    // private final Term arg5;




    public static Operation PRED_$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_nand::$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1);
        return $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(m);
    }

    private final static Operation $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(m);
    }

    private final static Operation $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(Prolog m) { 
    // '$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-A=E,!,set_union(B,[C],D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$get_level'(F),'$unify'(A,E),'$cut'(F),set_union(B,[C],D)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),a(5))
        if (! a1.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        a7 = CONS(a3,  Prolog.Nil );
        return //
 Op("set_union", FILE_nand::PRED_set_union_3_static_exec, VA(a2, a7, a4), cont);
    }

    private final static Operation $dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(Prolog m) { 
    // '$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-D=B
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$unify'(D,B)]
        //START inline expansion of $unify(a(4),a(2))
        if (! a4.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/3,public)




    public static Operation PRED_$dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_nand::$dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_sub_1);
        return $dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_1(m);
    }

    private final static Operation $dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_2(m);
    }

    private final static Operation $dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_1(Prolog m) { 
    // '$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C):-set_member(A,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C):-[set_member(A,C)]
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a3), cont);
    }

    private final static Operation $dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_2(Prolog m) { 
    // '$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C):-A=B
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C):-['$unify'(A,B)]
        //START inline expansion of $unify(a(1),a(2))
        if (! a1.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_nand::$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_sub_1);
        return $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_1(m);
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_2(m);
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_1(Prolog m) { 
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-'$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,C,D),!,set_difference(B,E,F)
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
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-['$get_level'(G),'$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,C,D),'$cut'(G),set_difference(B,E,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_static_exec, VA(a1, a3, a4), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a7), //
 Op("set_difference", FILE_nand::PRED_set_difference_3_static_exec, VA(a2, a5, a6), cont)));
    }

    private final static Operation $dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_2(Prolog m) { 
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-F=B
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-['$unify'(F,B)]
        //START inline expansion of $unify(a(6),a(2))
        if (! a6.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_nand::$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_sub_1);
        return $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_1(m);
    }

    private final static Operation $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_2(m);
    }

    private final static Operation $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_1(Prolog m) { 
    // '$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-(set_member(D,B),set_member(C,A)),!,set_difference(E,[D],F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-['$get_level'(G),set_member(D,B),set_member(C,A),'$cut'(G),set_difference(E,[D],F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = CONS(a4,  Prolog.Nil );
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a4, a2), //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a3, a1), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a7), //
 Op("set_difference", FILE_nand::PRED_set_difference_3_static_exec, VA(a5, a8, a6), cont))));
    }

    private final static Operation $dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_2(Prolog m) { 
    // '$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-F=E
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-['$unify'(F,E)]
        //START inline expansion of $unify(a(6),a(5))
        if (! a6.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry6(null, FILE_nand::$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_sub_1);
        return $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_1(m);
    }

    private final static Operation $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_2(m);
    }

    private final static Operation $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_1(Prolog m) { 
    // '$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-A=D,!,exclude_if_vector_in_false_set(E,C,B,F)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-['$get_level'(G),'$unify'(A,D),'$cut'(G),exclude_if_vector_in_false_set(E,C,B,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),a(4))
        if (! a1.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(7))
        a7 = a7.dref();
                  m.cut( a7.intValue());
        //END inline expansion
        return //
 Op("exclude_if_vector_in_false_set", FILE_nand::PRED_exclude_if_vector_in_false_set_4_static_exec, VA(a5, a3, a2, a6), cont);
    }

    private final static Operation $dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_2(Prolog m) { 
    // '$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-F=E
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // '$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E,F):-['$unify'(F,E)]
        //START inline expansion of $unify(a(6),a(5))
        if (! a6.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/5,public)

    // private final Term arg5;




    public static Operation PRED_$dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_nand::$dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1);
        return $dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(m);
    }

    private final static Operation $dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(m);
    }

    private final static Operation $dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(Prolog m) { 
    // '$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-A=D,!,set_difference(E,[C],B)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$get_level'(F),'$unify'(A,D),'$cut'(F),set_difference(E,[C],B)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),a(4))
        if (! a1.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        a7 = CONS(a3,  Prolog.Nil );
        return //
 Op("set_difference", FILE_nand::PRED_set_difference_3_static_exec, VA(a5, a7, a2), cont);
    }

    private final static Operation $dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(Prolog m) { 
    // '$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-B=E
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$unify'(B,E)]
        //START inline expansion of $unify(a(2),a(5))
        if (! a2.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/5,public)

    // private final Term arg5;




    public static Operation PRED_$dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_nand::$dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1);
        return $dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(m);
    }

    private final static Operation $dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(m);
    }

    private final static Operation $dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(Prolog m) { 
    // '$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-A=E,!,set_union(B,[D],C)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$get_level'(F),'$unify'(A,E),'$cut'(F),set_union(B,[D],C)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),a(5))
        if (! a1.unify(a5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        a7 = CONS(a4,  Prolog.Nil );
        return //
 Op("set_union", FILE_nand::PRED_set_union_3_static_exec, VA(a2, a7, a3), cont);
    }

    private final static Operation $dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(Prolog m) { 
    // '$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-C=B
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$unify'(C,B)]
        //START inline expansion of $unify(a(3),a(2))
        if (! a3.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/5,public)

    // private final Term arg5;




    public static Operation PRED_$dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_nand::$dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1);
        return $dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(m);
    }

    private final static Operation $dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(m);
    }

    private final static Operation $dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(Prolog m) { 
    // '$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-A=D,!,set_union(B,[E],C)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$get_level'(F),'$unify'(A,D),'$cut'(F),set_union(B,[E],C)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(1),a(4))
        if (! a1.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        a7 = CONS(a5,  Prolog.Nil );
        return //
 Op("set_union", FILE_nand::PRED_set_union_3_static_exec, VA(a2, a7, a3), cont);
    }

    private final static Operation $dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(Prolog m) { 
    // '$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-C=B
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$unify'(C,B)]
        //START inline expansion of $unify(a(3),a(2))
        if (! a3.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/5,public)

    // private final Term arg5;




    public static Operation PRED_$dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_nand::$dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1);
        return $dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(m);
    }

    private final static Operation $dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(m);
    }

    private final static Operation $dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(Prolog m) { 
    // '$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-set_member(A,E),!,set_union(B,D,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$get_level'(F),set_member(A,E),'$cut'(F),set_union(B,D,C)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a5), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a6), //
 Op("set_union", FILE_nand::PRED_set_union_3_static_exec, VA(a2, a4, a3), cont)));
    }

    private final static Operation $dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(Prolog m) { 
    // '$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-C=B
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$unify'(C,B)]
        //START inline expansion of $unify(a(3),a(2))
        if (! a3.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/5,public)

    // private final Term arg5;




    public static Operation PRED_$dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_nand::$dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1);
        return $dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(m);
    }

    private final static Operation $dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(m);
    }

    private final static Operation $dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(Prolog m) { 
    // '$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-set_member(A,D),!,set_union(B,E,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$get_level'(F),set_member(A,D),'$cut'(F),set_union(B,E,C)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a1, a4), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a6), //
 Op("set_union", FILE_nand::PRED_set_union_3_static_exec, VA(a2, a5, a3), cont)));
    }

    private final static Operation $dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(Prolog m) { 
    // '$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-C=B
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$unify'(C,B)]
        //START inline expansion of $unify(a(3),a(2))
        if (! a3.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: exclude_if_vector_in_false_set/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(exclude_if_vector_in_false_set/4,public)




    public static Operation PRED_exclude_if_vector_in_false_set_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return exclude_if_vector_in_false_set_4_top(m);
    }

    private final static Operation exclude_if_vector_in_false_set_4_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_nand::exclude_if_vector_in_false_set_4_var, fail_0, fail_0, FILE_nand::exclude_if_vector_in_false_set_4_1, fail_0, FILE_nand::exclude_if_vector_in_false_set_4_lis); 
    }

    private final static Operation exclude_if_vector_in_false_set_4_var(Prolog m) { 
        m.jtry4(null, FILE_nand::exclude_if_vector_in_false_set_4_var_1);
        return exclude_if_vector_in_false_set_4_1(m);
    }

    private final static Operation exclude_if_vector_in_false_set_4_var_1(Prolog m) { 
        m.retry(null, FILE_nand::exclude_if_vector_in_false_set_4_var_2);
        return exclude_if_vector_in_false_set_4_2(m);
    }

    private final static Operation exclude_if_vector_in_false_set_4_var_2(Prolog m) { 
        m.trust(null);
        return exclude_if_vector_in_false_set_4_3(m);
    }

    private final static Operation exclude_if_vector_in_false_set_4_lis(Prolog m) { 
        m.jtry4(null, FILE_nand::exclude_if_vector_in_false_set_4_lis_1);
        return exclude_if_vector_in_false_set_4_2(m);
    }

    private final static Operation exclude_if_vector_in_false_set_4_lis_1(Prolog m) { 
        m.trust(null);
        return exclude_if_vector_in_false_set_4_3(m);
    }

    private final static Operation exclude_if_vector_in_false_set_4_1(Prolog m) { 
    // exclude_if_vector_in_false_set([],A,B,[]):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // exclude_if_vector_in_false_set([],A,B,[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a4, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation exclude_if_vector_in_false_set_4_2(Prolog m) { 
    // exclude_if_vector_in_false_set([A|B],C,D,E):-function(A,C,F),false_set(F,G),set_member(D,G),!,exclude_if_vector_in_false_set(B,C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3, p4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // exclude_if_vector_in_false_set([A|B],C,D,E):-['$get_level'(F),function(A,C,G),false_set(G,H),set_member(D,H),'$cut'(F),exclude_if_vector_in_false_set(B,C,D,E)]
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
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        return //
 Op("function", FILE_nand::PRED_function_3_static_exec, VA(a5, a2, a8), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a8, a9), //
 Op("set_member", FILE_nand::PRED_set_member_2_static_exec, VA(a3, a9), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a7), //
 Op("exclude_if_vector_in_false_set", FILE_nand::PRED_exclude_if_vector_in_false_set_4_static_exec, VA(a6, a2, a3, a4), cont)))));
    }

    private final static Operation exclude_if_vector_in_false_set_4_3(Prolog m) { 
    // exclude_if_vector_in_false_set([A|B],C,D,[A|E]):-exclude_if_vector_in_false_set(B,C,D,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // exclude_if_vector_in_false_set([A|B],C,D,[A|E]):-[exclude_if_vector_in_false_set(B,C,D,E)]
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
        return exclude_if_vector_in_false_set_4_top(m);
    }
/** PREDICATE: add_necessary_functions/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(add_necessary_functions/5,public)

    // private final Term arg5;




    public static Operation PRED_add_necessary_functions_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // add_necessary_functions(A,B,C,D,E):-add_necessary_functions(A,A,B,C,D,E)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // add_necessary_functions(A,B,C,D,E):-[add_necessary_functions(A,A,B,C,D,E)]
        return //
 Op("add_necessary_functions", FILE_nand::PRED_add_necessary_functions_6_static_exec, VA(a1, a1, a2, a3, a4, a5), cont);
    }
/** PREDICATE: add_necessary_functions/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(add_necessary_functions/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_add_necessary_functions_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return add_necessary_functions_6_top(m);
    }

    private final static Operation add_necessary_functions_6_top(Prolog m) { 
        m.setB0();
        m.jtry6(null, FILE_nand::add_necessary_functions_6_sub_1);
        return add_necessary_functions_6_1(m);
    }

    private final static Operation add_necessary_functions_6_sub_1(Prolog m) { 
        m.retry(null, FILE_nand::add_necessary_functions_6_sub_2);
        return add_necessary_functions_6_2(m);
    }

    private final static Operation add_necessary_functions_6_sub_2(Prolog m) { 
        m.trust(null);
        return add_necessary_functions_6_3(m);
    }

    private final static Operation add_necessary_functions_6_1(Prolog m) { 
    // add_necessary_functions(A,B,A,C,A,C):-!
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // add_necessary_functions(A,B,A,C,A,C):-['$neck_cut']
        if (! a1.unify(a3, m.trail))
            return m.fail();
        if (! a1.unify(a5, m.trail))
            return m.fail();
        if (! a4.unify(a6, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation add_necessary_functions_6_2(Prolog m) { 
    // add_necessary_functions(A,B,C,D,E,F):-function(A,D,G),function_type(B,C,D,G,nf,H),!,false_set(G,I),new_function_CIs(D,function(C,I,[H],[],[],[],[],[]),B,J,K),function(A,J,L),update_circuit(J,K,L,H,J,M),N is C+1,O is A+1,add_necessary_functions(O,B,N,M,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
        Operation p1, p2, p3, p4, p5, p6, p7, p8, p9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // add_necessary_functions(A,B,C,D,E,F):-['$get_level'(G),function(A,D,H),function_type(B,C,D,H,nf,I),'$cut'(G),false_set(H,J),new_function_CIs(D,function(C,J,[I],[],[],[],[],[]),B,K,L),function(A,K,M),update_circuit(K,L,M,I,K,N),O is C+1,P is A+1,add_necessary_functions(P,B,O,N,E,F)]
        a7 = m.mkvar1();
        //START inline expansion of $get_level(a(7))
        if (! a7.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a8 = m.mkvar1();
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = CONS(a9,  Prolog.Nil );
    // put_str_args([a(3),a(10),a(11),@('Prolog.Nil'),@('Prolog.Nil'),@('Prolog.Nil'),@('Prolog.Nil'),@('Prolog.Nil')],y(1)),put_str(@('FUNCTOR_function_8'),y(1),a(12))
        a12 =  S( FUNCTOR_function_8 , a3, a10, a11,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil ,  Prolog.Nil );
 ;
        a13 = m.mkvar1();
        a14 = m.mkvar1();
        a15 = m.mkvar1();
        a16 = m.mkvar1();
        a17 = m.mkvar1();
    // put_str_args([a(3),@(int_1)],y(2)),put_str(@('FUNCTOR_$002B_2'),y(2),a(18))
        a18 =  S( FUNCTOR_$002B_2 , a3,  int_1 );
 ;
        a19 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(3)),put_str(@('FUNCTOR_$002B_2'),y(3),a(20))
        a20 =  S( FUNCTOR_$002B_2 , a1,  int_1 );
 ;
        return //
 Op("function", FILE_nand::PRED_function_3_static_exec, VA(a1, a4, a8), //
 Op("function_type", FILE_nand::PRED_function_type_6_static_exec, VA(a2, a3, a4, a8,  ATOM_nf , a9), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a7), //
 Op("false_set", FILE_nand::PRED_false_set_2_static_exec, VA(a8, a10), //
 Op("new_function_CIs", FILE_nand::PRED_new_function_CIs_5_static_exec, VA(a4, a12, a2, a13, a14), //
 Op("function", FILE_nand::PRED_function_3_static_exec, VA(a1, a13, a15), //
 Op("update_circuit", FILE_nand::PRED_update_circuit_6_static_exec, VA(a13, a14, a15, a9, a13, a16), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a17, a18), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a19, a20), //
 Op("add_necessary_functions", FILE_nand::PRED_add_necessary_functions_6_static_exec, VA(a19, a2, a17, a16, a5, a6), cont))))))))));
    }

    private final static Operation add_necessary_functions_6_3(Prolog m) { 
    // add_necessary_functions(A,B,C,D,E,F):-G is A+1,add_necessary_functions(G,B,C,D,E,F)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        cont = m.cont;
    // add_necessary_functions(A,B,C,D,E,F):-[G is A+1,add_necessary_functions(G,B,C,D,E,F)]
        a7 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(8))
        a8 =  S( FUNCTOR_$002B_2 , a1,  int_1 );
 ;
        //START inline expansion of a(7)is a(8)
        if (! a7.unify(Arithmetic.evaluate(a8), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a5;
        m.AREGS[5] = a6;
m.cont = cont;
        return add_necessary_functions_6_top(m);
    }
/** PREDICATE: new_function_CIs/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(new_function_CIs/5,public)

    // private final Term arg5;




    public static Operation PRED_new_function_CIs_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // new_function_CIs(A,function(B,C,D,E,F,G,H,I),J,[K|L],K):-new_function_CIs(A,B,D,J,L,[],M),K=function(B,C,D,M,F,G,H,I)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
    // new_function_CIs(A,function(B,C,D,E,F,G,H,I),J,[K|L],K):-[new_function_CIs(A,B,D,J,L,[],M),'$unify'(K,function(B,C,D,M,F,G,H,I))]
        a2 = a2.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_function_8 , m.trail, a6, a7, a8, m.DONT_CARE1(), a9, a10, a11, a12)){
                return m.fail();
            }
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
        if (! a13.unify(a5, m.trail))
            return m.fail();
        a15 = m.mkvar1();
    // put_str_args([a(6),a(7),a(8),a(15),a(9),a(10),a(11),a(12)],y(1)),put_str(@('FUNCTOR_function_8'),y(1),a(16))
        a16 =  S( FUNCTOR_function_8 , a6, a7, a8, a15, a9, a10, a11, a12);
 ;
        return //
 Op("new_function_CIs", FILE_nand::PRED_new_function_CIs_7_static_exec, VA(a1, a6, a8, a3, a14,  Prolog.Nil , a15), //
 Op("$unify", FILE_nand::PRED_$unify_2_static_exec, VA(a13, a16), cont));
    }
/** PREDICATE: new_function_CIs/7
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(new_function_CIs/7,public)

    // private final Term arg5, arg6, arg7;




    public static Operation PRED_new_function_CIs_7_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return new_function_CIs_7_top(m);
    }

    private final static Operation new_function_CIs_7_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_nand::new_function_CIs_7_var, fail_0, fail_0, FILE_nand::new_function_CIs_7_1, fail_0, FILE_nand::new_function_CIs_7_lis); 
    }

    private final static Operation new_function_CIs_7_var(Prolog m) { 
        m.jtry7(null, FILE_nand::new_function_CIs_7_var_1);
        return new_function_CIs_7_1(m);
    }

    private final static Operation new_function_CIs_7_var_1(Prolog m) { 
        m.retry(null, FILE_nand::new_function_CIs_7_var_2);
        return new_function_CIs_7_2(m);
    }

    private final static Operation new_function_CIs_7_var_2(Prolog m) { 
        m.trust(null);
        return new_function_CIs_7_3(m);
    }

    private final static Operation new_function_CIs_7_lis(Prolog m) { 
        m.jtry7(null, FILE_nand::new_function_CIs_7_lis_1);
        return new_function_CIs_7_2(m);
    }

    private final static Operation new_function_CIs_7_lis_1(Prolog m) { 
        m.trust(null);
        return new_function_CIs_7_3(m);
    }

    private final static Operation new_function_CIs_7_1(Prolog m) { 
    // new_function_CIs([],A,B,C,[],D,D):-true
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
    // new_function_CIs([],A,B,C,[],D,D):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a5, m.trail))
            return m.fail();
        if (! a6.unify(a7, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation new_function_CIs_7_2(Prolog m) { 
    // new_function_CIs([function(A,B,C,D,E,F,G,H)|I],J,K,L,[function(A,B,C,M,E,F,G,H)|N],O,P):-set_intersection(K,C,[]),!,'$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,D,J,L,M),new_function_CIs(I,J,K,L,N,[A|O],P)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
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
    // new_function_CIs([function(A,B,C,D,E,F,G,H)|I],J,K,L,[function(A,B,C,M,E,F,G,H)|N],O,P):-['$get_level'(Q),set_intersection(K,C,[]),'$cut'(Q),'$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,D,J,L,M),new_function_CIs(I,J,K,L,N,[A|O],P)]
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
        a8 = a8.dref();
            a10 = m.mkvar2();
            a11 = m.mkvar2();
            a12 = m.mkvar2();
            a13 = m.mkvar2();
            a14 = m.mkvar2();
            a15 = m.mkvar2();
            a16 = m.mkvar2();
            a17 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_function_8 , m.trail, a10, a11, a12, a13, a14, a15, a16, a17)){
                return m.fail();
            }
        a5 = a5.dref();
        if (a5 .isCons()){
                        a18 = a5.car();
            a19 = a5.cdr();
        } else if (a5.isVar()){
            a18 = m.mkvar2();
            a19 = m.mkvar2();
             a5.bind(CONS(a18, a19), m.trail);
        } else {
            return m.fail();
        }
        a18 = a18.dref();
            a20 = m.mkvar2();
            if (!a18.unifyS( FUNCTOR_function_8 , m.trail, a10, a11, a12, a20, a14, a15, a16, a17)){
                return m.fail();
            }
        a21 = m.mkvar1();
        //START inline expansion of $get_level(a(21))
        if (! a21.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a22 = CONS(a10, a6);
        return //
 Op("set_intersection", FILE_nand::PRED_set_intersection_3_static_exec, VA(a3, a12,  Prolog.Nil ), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a21), //
 Op("$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec, VA(a10, a13, a2, a4, a20), //
 Op("new_function_CIs", FILE_nand::PRED_new_function_CIs_7_static_exec, VA(a9, a2, a3, a4, a19, a22, a7), cont))));
    }

    private final static Operation new_function_CIs_7_3(Prolog m) { 
    // new_function_CIs([A|B],C,D,E,[A|F],G,H):-new_function_CIs(B,C,D,E,F,G,H)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        a6 = m.AREGS[5];
        a7 = m.AREGS[6];
        cont = m.cont;
    // new_function_CIs([A|B],C,D,E,[A|F],G,H):-[new_function_CIs(B,C,D,E,F,G,H)]
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
        a5 = a5.dref();
        if (a5 .isCons()){
                        if (! a8.unify(a5.car(), m.trail))
                return m.fail();
            a10 = a5.cdr();
        } else if (a5.isVar()){
            a10 = m.mkvar2();
             a5.bind(CONS(a8, a10), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a9;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a4;
        m.AREGS[4] = a10;
        m.AREGS[5] = a6;
        m.AREGS[6] = a7;
m.cont = cont;
        return new_function_CIs_7_top(m);
    }
/** PREDICATE: $dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/5
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/5,public)

    // private final Term arg5;




    public static Operation PRED_$dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry5(null, FILE_nand::$dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1);
        return $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(m);
    }

    private final static Operation $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(m);
    }

    private final static Operation $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_1(Prolog m) { 
    // '$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-A>=D,!,set_union(B,[C],E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$get_level'(F),'$greater_or_equal'(A,D),'$cut'(F),set_union(B,[C],E)]
        a6 = m.mkvar1();
        //START inline expansion of $get_level(a(6))
        if (! a6.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_or_equal(a(1),a(4))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a4)) < 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(6))
        a6 = a6.dref();
                  m.cut( a6.intValue());
        //END inline expansion
        a7 = CONS(a3,  Prolog.Nil );
        return //
 Op("set_union", FILE_nand::PRED_set_union_3_static_exec, VA(a2, a7, a5), cont);
    }

    private final static Operation $dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_2(Prolog m) { 
    // '$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-E=B
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        a5 = m.AREGS[4];
        cont = m.cont;
    // '$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C,D,E):-['$unify'(E,B)]
        //START inline expansion of $unify(a(5),a(2))
        if (! a5.unify(a2, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: function_type/6
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(function_type/6,public)

    // private final Term arg5, arg6;




    public static Operation PRED_function_type_6_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // function_type(A,B,C,D,E,F):-true_set(D,G),select_vector(G,D,A,B,C,dummy,0,nf,999,H,F,E,I)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
        a5 = LARG[4];
        a6 = LARG[5];
    // function_type(A,B,C,D,E,F):-[true_set(D,G),select_vector(G,D,A,B,C,dummy,0,nf,999,H,F,E,I)]
        a7 = m.mkvar1();
        return //
 Op("true_set", FILE_nand::PRED_true_set_2_static_exec, VA(a4, a7), //
 Op("select_vector", FILE_nand::PRED_select_vector_13_static_exec, VA(a7, a4, a1, a2, a3,  ATOM_dummy ,  int_0 ,  ATOM_nf ,  int_999 , m.DONT_CARE2(), a6, a5, m.DONT_CARE2()), cont));
    }
/** PREDICATE: test_bounds/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(test_bounds/3,public)
        final static Functor ATOM_bound = SYM("bound");




    public static Operation PRED_test_bounds_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // test_bounds(A,B,C):-access(bound,D),B<D
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // test_bounds(A,B,C):-[access(bound,D),'$less_than'(B,D)]
        a4 = m.mkvar1();
        return //
 Op("access", FILE_nand::PRED_access_2_static_exec, VA( ATOM_bound , a4), //
 Op("$less_than", FILE_nand::PRED_$less_than_2_static_exec, VA(a2, a4), cont));
    }
/** PREDICATE: update_bounds/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(update_bounds/3,public)




    public static Operation PRED_update_bounds_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // update_bounds(A,B,C):-set(bound,B)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // update_bounds(A,B,C):-[set(bound,B)]
        return //
 Op("set", FILE_nand::PRED_set_2_static_exec, VA( ATOM_bound , a2), cont);
    }
/** PREDICATE: $dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main('$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'/3,public)




    public static Operation PRED_$dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_nand::$dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_sub_1);
        return $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_1(m);
    }

    private final static Operation $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_2(m);
    }

    private final static Operation $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_1(Prolog m) { 
    // '$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C):-recorded(A,B,C),!,erase(C)
         Term a1, a2, a3, a4;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C):-['$get_level'(D),recorded(A,B,C),'$cut'(D),erase(C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("recorded", FILE_nand::PRED_recorded_3_static_exec, VA(a1, a2, a3), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a4), //
 Op("erase", FILE_nand::PRED_erase_1_static_exec, VA(a3), cont)));
    }

    private final static Operation $dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_2(Prolog m) { 
    // '$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,B,C):-[]
        return cont;
    }
/** PREDICATE: set/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(set/2,public)




    public static Operation PRED_set_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // set(A,B):-'$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,C,D),recorda(A,B,E)
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // set(A,B):-['$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl'(A,C,D),recorda(A,B,E)]
        return //
 Op("$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl", FILE_nand::PRED_$dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_static_exec, VA(a1, m.DONT_CARE2(), m.DONT_CARE2()), //
 Op("recorda", FILE_nand::PRED_recorda_3_static_exec, VA(a1, a2, m.DONT_CARE2()), cont));
    }
/** PREDICATE: access/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(access/2,public)




    public static Operation PRED_access_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // access(A,B):-recorded(A,B,C)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // access(A,B):-[recorded(A,B,C)]
        return //
 Op("recorded", FILE_nand::PRED_recorded_3_static_exec, VA(a1, a2, m.DONT_CARE2()), cont);
    }
/** PREDICATE: write_gates/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(write_gates/1,public)
        final static Functor ATOM_gate$0020$0023 = SYM("gate #");
        final static Functor ATOM_$0020inputs$003A$0020$0020$0020 = SYM(" inputs:   ");




    public static Operation PRED_write_gates_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_nand::write_gates_1_var, fail_0, fail_0, FILE_nand::write_gates_1_1, fail_0, FILE_nand::write_gates_1_2); 
    }

    private final static Operation write_gates_1_var(Prolog m) { 
        m.jtry1(null, FILE_nand::write_gates_1_var_1);
        return write_gates_1_1(m);
    }

    private final static Operation write_gates_1_var_1(Prolog m) { 
        m.trust(null);
        return write_gates_1_2(m);
    }

    private final static Operation write_gates_1_1(Prolog m) { 
    // write_gates([]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // write_gates([]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation write_gates_1_2(Prolog m) { 
    // write_gates([A|B]):-function_number(A,C),write('gate #'),write(C),write(' inputs:   '),immediate_predecessors(A,D),write(D),nl,write_gates(B)
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3, p4, p5, p6, p7;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // write_gates([A|B]):-[function_number(A,C),write('gate #'),write(C),write(' inputs:   '),immediate_predecessors(A,D),write(D),nl,write_gates(B)]
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
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a2, a4), //
 Op("write", FILE_nand::PRED_write_1_static_exec, VA( ATOM_gate$0020$0023 ), //
 Op("write", FILE_nand::PRED_write_1_static_exec, VA(a4), //
 Op("write", FILE_nand::PRED_write_1_static_exec, VA( ATOM_$0020inputs$003A$0020$0020$0020 ), //
 Op("immediate_predecessors", FILE_nand::PRED_immediate_predecessors_2_static_exec, VA(a2, a5), //
 Op("write", FILE_nand::PRED_write_1_static_exec, VA(a5), //
 Op("nl", FILE_nand::PRED_nl_0_static_exec, VA(), //
 Op("write_gates", FILE_nand::PRED_write_gates_1_static_exec, VA(a3), cont))))))));
    }
/** PREDICATE: function/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(function/3,public)




    public static Operation PRED_function_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return function_3_top(m);
    }

    private final static Operation function_3_top(Prolog m) { 
        m.setB0();
        m.jtry3(null, FILE_nand::function_3_sub_1);
        return function_3_1(m);
    }

    private final static Operation function_3_sub_1(Prolog m) { 
        m.trust(null);
        return function_3_2(m);
    }

    private final static Operation function_3_1(Prolog m) { 
    // function(A,[B|C],B):-function_number(B,A),!
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // function(A,[B|C],B):-['$get_level'(D),function_number(B,A),'$cut'(D)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a4 = a2.car();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
             a2.bind(CONS(a4, m.DONTCARE("cons(a(2))")), m.trail);
        } else {
            return m.fail();
        }
        if (! a4.unify(a3, m.trail))
            return m.fail();
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("function_number", FILE_nand::PRED_function_number_2_static_exec, VA(a4, a1), //
 Op("$cut", FILE_nand::PRED_$cut_1_static_exec, VA(a5), cont));
    }

    private final static Operation function_3_2(Prolog m) { 
    // function(A,[B|C],D):-function(A,C,D)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // function(A,[B|C],D):-[function(A,C,D)]
        a2 = a2.dref();
        if (a2 .isCons()){
                        a4 = a2.cdr();
        } else if (a2.isVar()){
            a4 = m.mkvar2();
             a2.bind(CONS(m.DONTCARE("cons(a(2))"), a4), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a1;
        m.AREGS[1] = a4;
        m.AREGS[2] = a3;
m.cont = cont;
        return function_3_top(m);
    }
/** PREDICATE: function_number/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(function_number/2,public)




    public static Operation PRED_function_number_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // function_number(function(A,B,C,D,E,F,G,H),A):-true
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // function_number(function(A,B,C,D,E,F,G,H),A):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_function_8 , m.trail, a3, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: true_set/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(true_set/2,public)




    public static Operation PRED_true_set_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // true_set(function(A,B,C,D,E,F,G,H),B):-true
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // true_set(function(A,B,C,D,E,F,G,H),B):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_function_8 , m.trail, m.DONT_CARE1(), a3, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: false_set/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(false_set/2,public)




    public static Operation PRED_false_set_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // false_set(function(A,B,C,D,E,F,G,H),C):-true
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // false_set(function(A,B,C,D,E,F,G,H),C):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_function_8 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), a3, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: conceivable_inputs/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(conceivable_inputs/2,public)




    public static Operation PRED_conceivable_inputs_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // conceivable_inputs(function(A,B,C,D,E,F,G,H),D):-true
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // conceivable_inputs(function(A,B,C,D,E,F,G,H),D):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_function_8 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), a3, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: immediate_predecessors/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(immediate_predecessors/2,public)




    public static Operation PRED_immediate_predecessors_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // immediate_predecessors(function(A,B,C,D,E,F,G,H),E):-true
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // immediate_predecessors(function(A,B,C,D,E,F,G,H),E):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_function_8 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), a3, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: immediate_successors/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(immediate_successors/2,public)




    public static Operation PRED_immediate_successors_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // immediate_successors(function(A,B,C,D,E,F,G,H),F):-true
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // immediate_successors(function(A,B,C,D,E,F,G,H),F):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_function_8 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), a3, m.DONT_CARE1(), m.DONT_CARE1())){
                return m.fail();
            }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: predecessors/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(predecessors/2,public)




    public static Operation PRED_predecessors_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // predecessors(function(A,B,C,D,E,F,G,H),G):-true
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // predecessors(function(A,B,C,D,E,F,G,H),G):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_function_8 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), a3, m.DONT_CARE1())){
                return m.fail();
            }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: successors/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(successors/2,public)




    public static Operation PRED_successors_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // successors(function(A,B,C,D,E,F,G,H),H):-true
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // successors(function(A,B,C,D,E,F,G,H),H):-[]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_function_8 , m.trail, m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), m.DONT_CARE1(), a3)){
                return m.fail();
            }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: set_union/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(set_union/3,public)




    public static Operation PRED_set_union_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return set_union_3_top(m);
    }

    private final static Operation set_union_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_nand::set_union_3_var, fail_0, fail_0, FILE_nand::set_union_3_con, fail_0, FILE_nand::set_union_3_lis); 
    }

    private final static Operation set_union_3_var(Prolog m) { 
        m.jtry3(null, FILE_nand::set_union_3_var_1);
        return set_union_3_1(m);
    }

    private final static Operation set_union_3_var_1(Prolog m) { 
        m.retry(null, FILE_nand::set_union_3_var_2);
        return set_union_3_2(m);
    }

    private final static Operation set_union_3_var_2(Prolog m) { 
        m.retry(null, FILE_nand::set_union_3_var_3);
        return set_union_3_3(m);
    }

    private final static Operation set_union_3_var_3(Prolog m) { 
        m.retry(null, FILE_nand::set_union_3_var_4);
        return set_union_3_4(m);
    }

    private final static Operation set_union_3_var_4(Prolog m) { 
        m.retry(null, FILE_nand::set_union_3_var_5);
        return set_union_3_5(m);
    }

    private final static Operation set_union_3_var_5(Prolog m) { 
        m.trust(null);
        return set_union_3_6(m);
    }

    private final static Operation set_union_3_con(Prolog m) { 
        m.jtry3(null, FILE_nand::set_union_3_con_1);
        return set_union_3_1(m);
    }

    private final static Operation set_union_3_con_1(Prolog m) { 
        m.trust(null);
        return set_union_3_2(m);
    }

    private final static Operation set_union_3_lis(Prolog m) { 
        m.jtry3(null, FILE_nand::set_union_3_lis_1);
        return set_union_3_3(m);
    }

    private final static Operation set_union_3_lis_1(Prolog m) { 
        m.retry(null, FILE_nand::set_union_3_lis_2);
        return set_union_3_4(m);
    }

    private final static Operation set_union_3_lis_2(Prolog m) { 
        m.retry(null, FILE_nand::set_union_3_lis_3);
        return set_union_3_5(m);
    }

    private final static Operation set_union_3_lis_3(Prolog m) { 
        m.trust(null);
        return set_union_3_6(m);
    }

    private final static Operation set_union_3_1(Prolog m) { 
    // set_union([],[],[]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_union([],[],[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation set_union_3_2(Prolog m) { 
    // set_union([],[A|B],[A|B]):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_union([],[A|B],[A|B]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
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
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a4.unify(a3.car(), m.trail))
                return m.fail();
            if (! a5.unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
             a3.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation set_union_3_3(Prolog m) { 
    // set_union([A|B],[],[A|B]):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_union([A|B],[],[A|B]):-[]
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
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a4.unify(a3.car(), m.trail))
                return m.fail();
            if (! a5.unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
             a3.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation set_union_3_4(Prolog m) { 
    // set_union([A|B],[A|C],[A|D]):-set_union(B,C,D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_union([A|B],[A|C],[A|D]):-[set_union(B,C,D)]
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
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a4.unify(a2.car(), m.trail))
                return m.fail();
            a6 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
             a2.bind(CONS(a4, a6), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a4.unify(a3.car(), m.trail))
                return m.fail();
            a7 = a3.cdr();
        } else if (a3.isVar()){
            a7 = m.mkvar2();
             a3.bind(CONS(a4, a7), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a5;
        m.AREGS[1] = a6;
        m.AREGS[2] = a7;
m.cont = cont;
        return set_union_3_top(m);
    }

    private final static Operation set_union_3_5(Prolog m) { 
    // set_union([A|B],[C|D],[A|E]):-A<C,set_union(B,[C|D],E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_union([A|B],[C|D],[A|E]):-['$less_than'(A,C),set_union(B,[C|D],E)]
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
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a4.unify(a3.car(), m.trail))
                return m.fail();
            a8 = a3.cdr();
        } else if (a3.isVar()){
            a8 = m.mkvar2();
             a3.bind(CONS(a4, a8), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $less_than(a(4),a(6))
        if (Arithmetic.evaluate(a4).arithCompareTo(Arithmetic.evaluate(a6)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        a9 = CONS(a6, a7);
        m.AREGS[0] = a5;
        m.AREGS[1] = a9;
        m.AREGS[2] = a8;
m.cont = cont;
        return set_union_3_top(m);
    }

    private final static Operation set_union_3_6(Prolog m) { 
    // set_union([A|B],[C|D],[C|E]):-A>C,set_union([A|B],D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_union([A|B],[C|D],[C|E]):-['$greater_than'(A,C),set_union([A|B],D,E)]
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
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a6.unify(a3.car(), m.trail))
                return m.fail();
            a8 = a3.cdr();
        } else if (a3.isVar()){
            a8 = m.mkvar2();
             a3.bind(CONS(a6, a8), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $greater_than(a(4),a(6))
        if (Arithmetic.evaluate(a4).arithCompareTo(Arithmetic.evaluate(a6)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        a9 = CONS(a4, a5);
        m.AREGS[0] = a9;
        m.AREGS[1] = a7;
        m.AREGS[2] = a8;
m.cont = cont;
        return set_union_3_top(m);
    }
/** PREDICATE: set_intersection/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(set_intersection/3,public)




    public static Operation PRED_set_intersection_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return set_intersection_3_top(m);
    }

    private final static Operation set_intersection_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_nand::set_intersection_3_var, fail_0, fail_0, FILE_nand::set_intersection_3_con, fail_0, FILE_nand::set_intersection_3_lis); 
    }

    private final static Operation set_intersection_3_var(Prolog m) { 
        m.jtry3(null, FILE_nand::set_intersection_3_var_1);
        return set_intersection_3_1(m);
    }

    private final static Operation set_intersection_3_var_1(Prolog m) { 
        m.retry(null, FILE_nand::set_intersection_3_var_2);
        return set_intersection_3_2(m);
    }

    private final static Operation set_intersection_3_var_2(Prolog m) { 
        m.retry(null, FILE_nand::set_intersection_3_var_3);
        return set_intersection_3_3(m);
    }

    private final static Operation set_intersection_3_var_3(Prolog m) { 
        m.retry(null, FILE_nand::set_intersection_3_var_4);
        return set_intersection_3_4(m);
    }

    private final static Operation set_intersection_3_var_4(Prolog m) { 
        m.retry(null, FILE_nand::set_intersection_3_var_5);
        return set_intersection_3_5(m);
    }

    private final static Operation set_intersection_3_var_5(Prolog m) { 
        m.trust(null);
        return set_intersection_3_6(m);
    }

    private final static Operation set_intersection_3_con(Prolog m) { 
        m.jtry3(null, FILE_nand::set_intersection_3_con_1);
        return set_intersection_3_1(m);
    }

    private final static Operation set_intersection_3_con_1(Prolog m) { 
        m.trust(null);
        return set_intersection_3_2(m);
    }

    private final static Operation set_intersection_3_lis(Prolog m) { 
        m.jtry3(null, FILE_nand::set_intersection_3_lis_1);
        return set_intersection_3_3(m);
    }

    private final static Operation set_intersection_3_lis_1(Prolog m) { 
        m.retry(null, FILE_nand::set_intersection_3_lis_2);
        return set_intersection_3_4(m);
    }

    private final static Operation set_intersection_3_lis_2(Prolog m) { 
        m.retry(null, FILE_nand::set_intersection_3_lis_3);
        return set_intersection_3_5(m);
    }

    private final static Operation set_intersection_3_lis_3(Prolog m) { 
        m.trust(null);
        return set_intersection_3_6(m);
    }

    private final static Operation set_intersection_3_1(Prolog m) { 
    // set_intersection([],[],[]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_intersection([],[],[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation set_intersection_3_2(Prolog m) { 
    // set_intersection([],[A|B],[]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_intersection([],[A|B],[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                    } else if (a2.isVar()){
             a2.bind(CONS(m.mkvar3(), m.mkvar3()), m.trail);
        } else {
            return m.fail();
        }
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation set_intersection_3_3(Prolog m) { 
    // set_intersection([A|B],[],[]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_intersection([A|B],[],[]):-[]
        a1 = a1.dref();
        if (a1 .isCons()){
                    } else if (a1.isVar()){
             a1.bind(CONS(m.mkvar3(), m.mkvar3()), m.trail);
        } else {
            return m.fail();
        }
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation set_intersection_3_4(Prolog m) { 
    // set_intersection([A|B],[A|C],[A|D]):-set_intersection(B,C,D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_intersection([A|B],[A|C],[A|D]):-[set_intersection(B,C,D)]
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
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a4.unify(a2.car(), m.trail))
                return m.fail();
            a6 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
             a2.bind(CONS(a4, a6), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a4.unify(a3.car(), m.trail))
                return m.fail();
            a7 = a3.cdr();
        } else if (a3.isVar()){
            a7 = m.mkvar2();
             a3.bind(CONS(a4, a7), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a5;
        m.AREGS[1] = a6;
        m.AREGS[2] = a7;
m.cont = cont;
        return set_intersection_3_top(m);
    }

    private final static Operation set_intersection_3_5(Prolog m) { 
    // set_intersection([A|B],[C|D],E):-A<C,set_intersection(B,[C|D],E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_intersection([A|B],[C|D],E):-['$less_than'(A,C),set_intersection(B,[C|D],E)]
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
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $less_than(a(4),a(6))
        if (Arithmetic.evaluate(a4).arithCompareTo(Arithmetic.evaluate(a6)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        a8 = CONS(a6, a7);
        m.AREGS[0] = a5;
        m.AREGS[1] = a8;
        m.AREGS[2] = a3;
m.cont = cont;
        return set_intersection_3_top(m);
    }

    private final static Operation set_intersection_3_6(Prolog m) { 
    // set_intersection([A|B],[C|D],E):-A>C,set_intersection([A|B],D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_intersection([A|B],[C|D],E):-['$greater_than'(A,C),set_intersection([A|B],D,E)]
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
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $greater_than(a(4),a(6))
        if (Arithmetic.evaluate(a4).arithCompareTo(Arithmetic.evaluate(a6)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        a8 = CONS(a4, a5);
        m.AREGS[0] = a8;
        m.AREGS[1] = a7;
        m.AREGS[2] = a3;
m.cont = cont;
        return set_intersection_3_top(m);
    }
/** PREDICATE: set_difference/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(set_difference/3,public)




    public static Operation PRED_set_difference_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return set_difference_3_top(m);
    }

    private final static Operation set_difference_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_nand::set_difference_3_var, fail_0, fail_0, FILE_nand::set_difference_3_con, fail_0, FILE_nand::set_difference_3_lis); 
    }

    private final static Operation set_difference_3_var(Prolog m) { 
        m.jtry3(null, FILE_nand::set_difference_3_var_1);
        return set_difference_3_1(m);
    }

    private final static Operation set_difference_3_var_1(Prolog m) { 
        m.retry(null, FILE_nand::set_difference_3_var_2);
        return set_difference_3_2(m);
    }

    private final static Operation set_difference_3_var_2(Prolog m) { 
        m.retry(null, FILE_nand::set_difference_3_var_3);
        return set_difference_3_3(m);
    }

    private final static Operation set_difference_3_var_3(Prolog m) { 
        m.retry(null, FILE_nand::set_difference_3_var_4);
        return set_difference_3_4(m);
    }

    private final static Operation set_difference_3_var_4(Prolog m) { 
        m.retry(null, FILE_nand::set_difference_3_var_5);
        return set_difference_3_5(m);
    }

    private final static Operation set_difference_3_var_5(Prolog m) { 
        m.trust(null);
        return set_difference_3_6(m);
    }

    private final static Operation set_difference_3_con(Prolog m) { 
        m.jtry3(null, FILE_nand::set_difference_3_con_1);
        return set_difference_3_1(m);
    }

    private final static Operation set_difference_3_con_1(Prolog m) { 
        m.trust(null);
        return set_difference_3_2(m);
    }

    private final static Operation set_difference_3_lis(Prolog m) { 
        m.jtry3(null, FILE_nand::set_difference_3_lis_1);
        return set_difference_3_3(m);
    }

    private final static Operation set_difference_3_lis_1(Prolog m) { 
        m.retry(null, FILE_nand::set_difference_3_lis_2);
        return set_difference_3_4(m);
    }

    private final static Operation set_difference_3_lis_2(Prolog m) { 
        m.retry(null, FILE_nand::set_difference_3_lis_3);
        return set_difference_3_5(m);
    }

    private final static Operation set_difference_3_lis_3(Prolog m) { 
        m.trust(null);
        return set_difference_3_6(m);
    }

    private final static Operation set_difference_3_1(Prolog m) { 
    // set_difference([],[],[]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_difference([],[],[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation set_difference_3_2(Prolog m) { 
    // set_difference([],[A|B],[]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_difference([],[A|B],[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        a2 = a2.dref();
        if (a2 .isCons()){
                    } else if (a2.isVar()){
             a2.bind(CONS(m.mkvar3(), m.mkvar3()), m.trail);
        } else {
            return m.fail();
        }
        if (!  Prolog.Nil .unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation set_difference_3_3(Prolog m) { 
    // set_difference([A|B],[],[A|B]):-true
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_difference([A|B],[],[A|B]):-[]
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
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a4.unify(a3.car(), m.trail))
                return m.fail();
            if (! a5.unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
             a3.bind(CONS(a4, a5), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }

    private final static Operation set_difference_3_4(Prolog m) { 
    // set_difference([A|B],[A|C],D):-set_difference(B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_difference([A|B],[A|C],D):-[set_difference(B,C,D)]
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
        a2 = a2.dref();
        if (a2 .isCons()){
                        if (! a4.unify(a2.car(), m.trail))
                return m.fail();
            a6 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
             a2.bind(CONS(a4, a6), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a5;
        m.AREGS[1] = a6;
        m.AREGS[2] = a3;
m.cont = cont;
        return set_difference_3_top(m);
    }

    private final static Operation set_difference_3_5(Prolog m) { 
    // set_difference([A|B],[C|D],[A|E]):-A<C,set_difference(B,[C|D],E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_difference([A|B],[C|D],[A|E]):-['$less_than'(A,C),set_difference(B,[C|D],E)]
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
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a4.unify(a3.car(), m.trail))
                return m.fail();
            a8 = a3.cdr();
        } else if (a3.isVar()){
            a8 = m.mkvar2();
             a3.bind(CONS(a4, a8), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $less_than(a(4),a(6))
        if (Arithmetic.evaluate(a4).arithCompareTo(Arithmetic.evaluate(a6)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        a9 = CONS(a6, a7);
        m.AREGS[0] = a5;
        m.AREGS[1] = a9;
        m.AREGS[2] = a8;
m.cont = cont;
        return set_difference_3_top(m);
    }

    private final static Operation set_difference_3_6(Prolog m) { 
    // set_difference([A|B],[C|D],E):-A>C,set_difference([A|B],D,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // set_difference([A|B],[C|D],E):-['$greater_than'(A,C),set_difference([A|B],D,E)]
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
        a2 = a2.dref();
        if (a2 .isCons()){
                        a6 = a2.car();
            a7 = a2.cdr();
        } else if (a2.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a2.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $greater_than(a(4),a(6))
        if (Arithmetic.evaluate(a4).arithCompareTo(Arithmetic.evaluate(a6)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        a8 = CONS(a4, a5);
        m.AREGS[0] = a8;
        m.AREGS[1] = a7;
        m.AREGS[2] = a3;
m.cont = cont;
        return set_difference_3_top(m);
    }
/** PREDICATE: set_subset/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(set_subset/2,public)




    public static Operation PRED_set_subset_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return set_subset_2_top(m);
    }

    private final static Operation set_subset_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_nand::set_subset_2_var, fail_0, fail_0, FILE_nand::set_subset_2_1, fail_0, FILE_nand::set_subset_2_lis); 
    }

    private final static Operation set_subset_2_var(Prolog m) { 
        m.jtry2(null, FILE_nand::set_subset_2_var_1);
        return set_subset_2_1(m);
    }

    private final static Operation set_subset_2_var_1(Prolog m) { 
        m.retry(null, FILE_nand::set_subset_2_var_2);
        return set_subset_2_2(m);
    }

    private final static Operation set_subset_2_var_2(Prolog m) { 
        m.trust(null);
        return set_subset_2_3(m);
    }

    private final static Operation set_subset_2_lis(Prolog m) { 
        m.jtry2(null, FILE_nand::set_subset_2_lis_1);
        return set_subset_2_2(m);
    }

    private final static Operation set_subset_2_lis_1(Prolog m) { 
        m.trust(null);
        return set_subset_2_3(m);
    }

    private final static Operation set_subset_2_1(Prolog m) { 
    // set_subset([],A):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_subset([],A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation set_subset_2_2(Prolog m) { 
    // set_subset([A|B],[A|C]):-set_subset(B,C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_subset([A|B],[A|C]):-[set_subset(B,C)]
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
        return set_subset_2_top(m);
    }

    private final static Operation set_subset_2_3(Prolog m) { 
    // set_subset([A|B],[C|D]):-A>C,set_subset([A|B],D)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_subset([A|B],[C|D]):-['$greater_than'(A,C),set_subset([A|B],D)]
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
        //START inline expansion of $greater_than(a(3),a(5))
        if (Arithmetic.evaluate(a3).arithCompareTo(Arithmetic.evaluate(a5)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        a7 = CONS(a3, a4);
        m.AREGS[0] = a7;
        m.AREGS[1] = a6;
m.cont = cont;
        return set_subset_2_top(m);
    }
/** PREDICATE: set_member/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl
*/
    // main(set_member/2,public)




    public static Operation PRED_set_member_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return set_member_2_top(m);
    }

    private final static Operation set_member_2_top(Prolog m) { 
        m.setB0();
        m.jtry2(null, FILE_nand::set_member_2_sub_1);
        return set_member_2_1(m);
    }

    private final static Operation set_member_2_sub_1(Prolog m) { 
        m.trust(null);
        return set_member_2_2(m);
    }

    private final static Operation set_member_2_1(Prolog m) { 
    // set_member(A,[A|B]):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_member(A,[A|B]):-[]
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

    private final static Operation set_member_2_2(Prolog m) { 
    // set_member(A,[B|C]):-A>B,set_member(A,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_member(A,[B|C]):-['$greater_than'(A,B),set_member(A,C)]
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
        //START inline expansion of $greater_than(a(1),a(3))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a3)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a1;
        m.AREGS[1] = a4;
m.cont = cont;
        return set_member_2_top(m);
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_nand::PRED_top_0_static_exec);
   PredTable.registerBuiltin("main",1,FILE_nand::PRED_main_1_static_exec);
   PredTable.registerBuiltin("init_state",4,FILE_nand::PRED_init_state_4_static_exec);
   PredTable.registerBuiltin("search",3,FILE_nand::PRED_search_3_static_exec);
   PredTable.registerBuiltin("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",1,FILE_nand::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",1,FILE_nand::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec);
   PredTable.registerBuiltin("select_vector",5,FILE_nand::PRED_select_vector_5_static_exec);
   PredTable.registerBuiltin("select_vector",12,FILE_nand::PRED_select_vector_12_static_exec);
   PredTable.registerBuiltin("select_vector",13,FILE_nand::PRED_select_vector_13_static_exec);
   PredTable.registerBuiltin("vector_cover_type",6,FILE_nand::PRED_vector_cover_type_6_static_exec);
   PredTable.registerBuiltin("cover_type1",7,FILE_nand::PRED_cover_type1_7_static_exec);
   PredTable.registerBuiltin("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",2,FILE_nand::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",4,FILE_nand::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_static_exec);
   PredTable.registerBuiltin("cover_type2",9,FILE_nand::PRED_cover_type2_9_static_exec);
   PredTable.registerBuiltin("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",2,FILE_nand::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",4,FILE_nand::PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_static_exec);
   PredTable.registerBuiltin("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",6,FILE_nand::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",4,FILE_nand::PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_4_static_exec);
   PredTable.registerBuiltin("best_vector",12,FILE_nand::PRED_best_vector_12_static_exec);
   PredTable.registerBuiltin("$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",1,FILE_nand::PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",1,FILE_nand::PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",1,FILE_nand::PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",1,FILE_nand::PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",1,FILE_nand::PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",1,FILE_nand::PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_1_static_exec);
   PredTable.registerBuiltin("max_type",3,FILE_nand::PRED_max_type_3_static_exec);
   PredTable.registerBuiltin("$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",2,FILE_nand::PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec);
   PredTable.registerBuiltin("type_order",2,FILE_nand::PRED_type_order_2_static_exec);
   PredTable.registerBuiltin("cover_vector",7,FILE_nand::PRED_cover_vector_7_static_exec);
   PredTable.registerBuiltin("vector_types",1,FILE_nand::PRED_vector_types_1_static_exec);
   PredTable.registerBuiltin("$dummy_15_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",2,FILE_nand::PRED_$dummy_15_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec);
   PredTable.registerBuiltin("cover_vector",10,FILE_nand::PRED_cover_vector_10_static_exec);
   PredTable.registerBuiltin("$dummy_16_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",2,FILE_nand::PRED_$dummy_16_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_17_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",2,FILE_nand::PRED_$dummy_17_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_18_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",2,FILE_nand::PRED_$dummy_18_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_19_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",2,FILE_nand::PRED_$dummy_19_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_20_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",2,FILE_nand::PRED_$dummy_20_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec);
   PredTable.registerBuiltin("$dummy_21_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",2,FILE_nand::PRED_$dummy_21_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_2_static_exec);
   PredTable.registerBuiltin("update_circuit",6,FILE_nand::PRED_update_circuit_6_static_exec);
   PredTable.registerBuiltin("$dummy_22_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",5,FILE_nand::PRED_$dummy_22_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec);
   PredTable.registerBuiltin("$dummy_23_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",5,FILE_nand::PRED_$dummy_23_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec);
   PredTable.registerBuiltin("$dummy_34_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",3,FILE_nand::PRED_$dummy_34_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_24_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",6,FILE_nand::PRED_$dummy_24_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_25_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",5,FILE_nand::PRED_$dummy_25_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec);
   PredTable.registerBuiltin("$dummy_35_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",3,FILE_nand::PRED_$dummy_35_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_static_exec);
   PredTable.registerBuiltin("$dummy_26_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",6,FILE_nand::PRED_$dummy_26_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_27_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",6,FILE_nand::PRED_$dummy_27_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_28_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",6,FILE_nand::PRED_$dummy_28_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_6_static_exec);
   PredTable.registerBuiltin("$dummy_29_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",5,FILE_nand::PRED_$dummy_29_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec);
   PredTable.registerBuiltin("$dummy_30_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",5,FILE_nand::PRED_$dummy_30_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec);
   PredTable.registerBuiltin("$dummy_31_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",5,FILE_nand::PRED_$dummy_31_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec);
   PredTable.registerBuiltin("$dummy_32_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",5,FILE_nand::PRED_$dummy_32_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec);
   PredTable.registerBuiltin("$dummy_33_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",5,FILE_nand::PRED_$dummy_33_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec);
   PredTable.registerBuiltin("exclude_if_vector_in_false_set",4,FILE_nand::PRED_exclude_if_vector_in_false_set_4_static_exec);
   PredTable.registerBuiltin("add_necessary_functions",5,FILE_nand::PRED_add_necessary_functions_5_static_exec);
   PredTable.registerBuiltin("add_necessary_functions",6,FILE_nand::PRED_add_necessary_functions_6_static_exec);
   PredTable.registerBuiltin("new_function_CIs",5,FILE_nand::PRED_new_function_CIs_5_static_exec);
   PredTable.registerBuiltin("new_function_CIs",7,FILE_nand::PRED_new_function_CIs_7_static_exec);
   PredTable.registerBuiltin("$dummy_36_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",5,FILE_nand::PRED_$dummy_36_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_5_static_exec);
   PredTable.registerBuiltin("function_type",6,FILE_nand::PRED_function_type_6_static_exec);
   PredTable.registerBuiltin("test_bounds",3,FILE_nand::PRED_test_bounds_3_static_exec);
   PredTable.registerBuiltin("update_bounds",3,FILE_nand::PRED_update_bounds_3_static_exec);
   PredTable.registerBuiltin("$dummy_37_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nand.pl","$dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl",3,FILE_nand::PRED_$dummy_37_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fnand$002Epl_3_static_exec);
   PredTable.registerBuiltin("set",2,FILE_nand::PRED_set_2_static_exec);
   PredTable.registerBuiltin("access",2,FILE_nand::PRED_access_2_static_exec);
   PredTable.registerBuiltin("write_gates",1,FILE_nand::PRED_write_gates_1_static_exec);
   PredTable.registerBuiltin("function",3,FILE_nand::PRED_function_3_static_exec);
   PredTable.registerBuiltin("function_number",2,FILE_nand::PRED_function_number_2_static_exec);
   PredTable.registerBuiltin("true_set",2,FILE_nand::PRED_true_set_2_static_exec);
   PredTable.registerBuiltin("false_set",2,FILE_nand::PRED_false_set_2_static_exec);
   PredTable.registerBuiltin("conceivable_inputs",2,FILE_nand::PRED_conceivable_inputs_2_static_exec);
   PredTable.registerBuiltin("immediate_predecessors",2,FILE_nand::PRED_immediate_predecessors_2_static_exec);
   PredTable.registerBuiltin("immediate_successors",2,FILE_nand::PRED_immediate_successors_2_static_exec);
   PredTable.registerBuiltin("predecessors",2,FILE_nand::PRED_predecessors_2_static_exec);
   PredTable.registerBuiltin("successors",2,FILE_nand::PRED_successors_2_static_exec);
   PredTable.registerBuiltin("set_union",3,FILE_nand::PRED_set_union_3_static_exec);
   PredTable.registerBuiltin("set_intersection",3,FILE_nand::PRED_set_intersection_3_static_exec);
   PredTable.registerBuiltin("set_difference",3,FILE_nand::PRED_set_difference_3_static_exec);
   PredTable.registerBuiltin("set_subset",2,FILE_nand::PRED_set_subset_2_static_exec);
   PredTable.registerBuiltin("set_member",2,FILE_nand::PRED_set_member_2_static_exec);
}
}

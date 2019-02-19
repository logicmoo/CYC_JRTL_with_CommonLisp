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
public class FILE_nreverse extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nreverse.pl
*/
    // main(top/0,public)




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-nreverse
        m.setB0();
    // top:-[nreverse]
        return //
 Op("nreverse", FILE_nreverse::PRED_nreverse_0_static_exec, VA(), cont);
    }
/** PREDICATE: nreverse/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nreverse.pl
*/
    // main(nreverse/0,public)
        final static NumberTerm int_26 = Integer(26);
        final static NumberTerm int_27 = Integer(27);
        final static NumberTerm int_28 = Integer(28);
        final static NumberTerm int_29 = Integer(29);
        final static NumberTerm int_30 = Integer(30);
    private static final Compound L_nreverse_0_s32 = CONS( int_30 ,  Prolog.Nil );
    private static final Compound L_nreverse_0_s33 = CONS( int_29 , L_nreverse_0_s32);
    private static final Compound L_nreverse_0_s34 = CONS( int_28 , L_nreverse_0_s33);
    private static final Compound L_nreverse_0_s35 = CONS( int_27 , L_nreverse_0_s34);
    private static final Compound L_nreverse_0_s36 = CONS( int_26 , L_nreverse_0_s35);
    private static final Compound L_nreverse_0_s37 = CONS( int_25 , L_nreverse_0_s36);
    private static final Compound L_nreverse_0_s38 = CONS( int_24 , L_nreverse_0_s37);
    private static final Compound L_nreverse_0_s39 = CONS( int_23 , L_nreverse_0_s38);
    private static final Compound L_nreverse_0_s40 = CONS( int_22 , L_nreverse_0_s39);
    private static final Compound L_nreverse_0_s41 = CONS( int_21 , L_nreverse_0_s40);
    private static final Compound L_nreverse_0_s42 = CONS( int_20 , L_nreverse_0_s41);
    private static final Compound L_nreverse_0_s43 = CONS( int_19 , L_nreverse_0_s42);
    private static final Compound L_nreverse_0_s44 = CONS( int_18 , L_nreverse_0_s43);
    private static final Compound L_nreverse_0_s45 = CONS( int_17 , L_nreverse_0_s44);
    private static final Compound L_nreverse_0_s46 = CONS( int_16 , L_nreverse_0_s45);
    private static final Compound L_nreverse_0_s47 = CONS( int_15 , L_nreverse_0_s46);
    private static final Compound L_nreverse_0_s48 = CONS( int_14 , L_nreverse_0_s47);
    private static final Compound L_nreverse_0_s49 = CONS( int_13 , L_nreverse_0_s48);
    private static final Compound L_nreverse_0_s50 = CONS( int_12 , L_nreverse_0_s49);
    private static final Compound L_nreverse_0_s51 = CONS( int_11 , L_nreverse_0_s50);
    private static final Compound L_nreverse_0_s52 = CONS( int_10 , L_nreverse_0_s51);
    private static final Compound L_nreverse_0_s53 = CONS( int_9 , L_nreverse_0_s52);
    private static final Compound L_nreverse_0_s54 = CONS( int_8 , L_nreverse_0_s53);
    private static final Compound L_nreverse_0_s55 = CONS( int_7 , L_nreverse_0_s54);
    private static final Compound L_nreverse_0_s56 = CONS( int_6 , L_nreverse_0_s55);
    private static final Compound L_nreverse_0_s57 = CONS( int_5 , L_nreverse_0_s56);
    private static final Compound L_nreverse_0_s58 = CONS( int_4 , L_nreverse_0_s57);
    private static final Compound L_nreverse_0_s59 = CONS( int_3 , L_nreverse_0_s58);
    private static final Compound L_nreverse_0_s60 = CONS( int_2 , L_nreverse_0_s59);
    private static final Compound L_nreverse_0_s61 = CONS( int_1 , L_nreverse_0_s60);




    public static Operation PRED_nreverse_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // nreverse:-nreverse([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30],A)
        m.setB0();
    // nreverse:-[nreverse([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30],A)]
        return //
 Op("nreverse", FILE_nreverse::PRED_nreverse_2_static_exec, VA(L_nreverse_0_s61, m.DONT_CARE2()), cont);
    }
/** PREDICATE: nreverse/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nreverse.pl
*/
    // main(nreverse/2,public)




    public static Operation PRED_nreverse_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return nreverse_2_top(m);
    }

    private final static Operation nreverse_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_nreverse::nreverse_2_var, fail_0, fail_0, FILE_nreverse::nreverse_2_2, fail_0, FILE_nreverse::nreverse_2_1); 
    }

    private final static Operation nreverse_2_var(Prolog m) { 
        m.jtry2(null, FILE_nreverse::nreverse_2_var_1);
        return nreverse_2_1(m);
    }

    private final static Operation nreverse_2_var_1(Prolog m) { 
        m.trust(null);
        return nreverse_2_2(m);
    }

    private final static Operation nreverse_2_1(Prolog m) { 
    // nreverse([A|B],C):-nreverse(B,D),concatenate(D,[A],C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // nreverse([A|B],C):-[nreverse(B,D),concatenate(D,[A],C)]
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
        a6 = CONS(a3,  Prolog.Nil );
        p1 = //
 Op("concatenate", FILE_nreverse::PRED_concatenate_3_static_exec, VA(a5, a6, a2), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a5;
        m.cont = p1;
        return nreverse_2_top(m);
    }

    private final static Operation nreverse_2_2(Prolog m) { 
    // nreverse([],[]):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // nreverse([],[]):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: concatenate/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/nreverse.pl
*/
    // main(concatenate/3,public)




    public static Operation PRED_concatenate_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return concatenate_3_top(m);
    }

    private final static Operation concatenate_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_nreverse::concatenate_3_var, fail_0, fail_0, FILE_nreverse::concatenate_3_2, fail_0, FILE_nreverse::concatenate_3_1); 
    }

    private final static Operation concatenate_3_var(Prolog m) { 
        m.jtry3(null, FILE_nreverse::concatenate_3_var_1);
        return concatenate_3_1(m);
    }

    private final static Operation concatenate_3_var_1(Prolog m) { 
        m.trust(null);
        return concatenate_3_2(m);
    }

    private final static Operation concatenate_3_1(Prolog m) { 
    // concatenate([A|B],C,[A|D]):-concatenate(B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // concatenate([A|B],C,[A|D]):-[concatenate(B,C,D)]
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
        return concatenate_3_top(m);
    }

    private final static Operation concatenate_3_2(Prolog m) { 
    // concatenate([],A,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // concatenate([],A,A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_nreverse::PRED_top_0_static_exec);
   PredTable.registerBuiltin("nreverse",0,FILE_nreverse::PRED_nreverse_0_static_exec);
   PredTable.registerBuiltin("nreverse",2,FILE_nreverse::PRED_nreverse_2_static_exec);
   PredTable.registerBuiltin("concatenate",3,FILE_nreverse::PRED_concatenate_3_static_exec);
}
}

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
public class FILE_animal_string extends FILE_system {
/** PREDICATE: animal_string/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tests/animal_string.pl
*/
    // main(animal_string/1,public)
        final static Functor ATOM_goat = SYM("goat");
        final static NumberTerm int_101 = Integer(101);
        final static NumberTerm int_108 = Integer(108);
        final static NumberTerm int_112 = Integer(112);
        final static NumberTerm int_104 = Integer(104);
        final static NumberTerm int_97 = Integer(97);
        final static NumberTerm int_110 = Integer(110);
        final static NumberTerm int_116 = Integer(116);
    private static final Compound L_animal_string_1_s10 = CONS( int_116 ,  Prolog.Nil );
    private static final Compound L_animal_string_1_s11 = CONS( int_110 , L_animal_string_1_s10);
    private static final Compound L_animal_string_1_s12 = CONS( int_97 , L_animal_string_1_s11);
    private static final Compound L_animal_string_1_s13 = CONS( int_104 , L_animal_string_1_s12);
    private static final Compound L_animal_string_1_s14 = CONS( int_112 , L_animal_string_1_s13);
    private static final Compound L_animal_string_1_s15 = CONS( int_101 , L_animal_string_1_s14);
    private static final Compound L_animal_string_1_s16 = CONS( int_108 , L_animal_string_1_s15);
    private static final Compound L_animal_string_1_s17 = CONS( int_101 , L_animal_string_1_s16);
        final static NumberTerm int_115 = Integer(115);
        final static NumberTerm int_32 = Integer(32);
        final static NumberTerm int_121 = Integer(121);
        final static NumberTerm int_111 = Integer(111);
        final static NumberTerm int_109 = Integer(109);
        final static NumberTerm int_114 = Integer(114);
        final static NumberTerm int_105 = Integer(105);
        final static NumberTerm int_58 = Integer(58);
    private static final Compound L_animal_string_1_s26 = CONS( int_32 ,  Prolog.Nil );
    private static final Compound L_animal_string_1_s27 = CONS( int_58 , L_animal_string_1_s26);
    private static final Compound L_animal_string_1_s28 = CONS( int_101 , L_animal_string_1_s27);
    private static final Compound L_animal_string_1_s29 = CONS( int_109 , L_animal_string_1_s28);
    private static final Compound L_animal_string_1_s30 = CONS( int_97 , L_animal_string_1_s29);
    private static final Compound L_animal_string_1_s31 = CONS( int_110 , L_animal_string_1_s30);
    private static final Compound L_animal_string_1_s32 = CONS( int_32 , L_animal_string_1_s31);
    private static final Compound L_animal_string_1_s33 = CONS( int_108 , L_animal_string_1_s32);
    private static final Compound L_animal_string_1_s34 = CONS( int_97 , L_animal_string_1_s33);
    private static final Compound L_animal_string_1_s35 = CONS( int_109 , L_animal_string_1_s34);
    private static final Compound L_animal_string_1_s36 = CONS( int_105 , L_animal_string_1_s35);
    private static final Compound L_animal_string_1_s37 = CONS( int_110 , L_animal_string_1_s36);
    private static final Compound L_animal_string_1_s38 = CONS( int_97 , L_animal_string_1_s37);
    private static final Compound L_animal_string_1_s39 = CONS( int_32 , L_animal_string_1_s38);
    private static final Compound L_animal_string_1_s40 = CONS( int_101 , L_animal_string_1_s39);
    private static final Compound L_animal_string_1_s41 = CONS( int_114 , L_animal_string_1_s40);
    private static final Compound L_animal_string_1_s42 = CONS( int_111 , L_animal_string_1_s41);
    private static final Compound L_animal_string_1_s43 = CONS( int_109 , L_animal_string_1_s42);
    private static final Compound L_animal_string_1_s44 = CONS( int_32 , L_animal_string_1_s43);
    private static final Compound L_animal_string_1_s45 = CONS( int_101 , L_animal_string_1_s44);
    private static final Compound L_animal_string_1_s46 = CONS( int_110 , L_animal_string_1_s45);
    private static final Compound L_animal_string_1_s47 = CONS( int_111 , L_animal_string_1_s46);
    private static final Compound L_animal_string_1_s48 = CONS( int_32 , L_animal_string_1_s47);
    private static final Compound L_animal_string_1_s49 = CONS( int_101 , L_animal_string_1_s48);
    private static final Compound L_animal_string_1_s50 = CONS( int_112 , L_animal_string_1_s49);
    private static final Compound L_animal_string_1_s51 = CONS( int_121 , L_animal_string_1_s50);
    private static final Compound L_animal_string_1_s52 = CONS( int_116 , L_animal_string_1_s51);
    private static final Compound L_animal_string_1_s53 = CONS( int_32 , L_animal_string_1_s52);
    private static final Compound L_animal_string_1_s54 = CONS( int_101 , L_animal_string_1_s53);
    private static final Compound L_animal_string_1_s55 = CONS( int_115 , L_animal_string_1_s54);
    private static final Compound L_animal_string_1_s56 = CONS( int_97 , L_animal_string_1_s55);
    private static final Compound L_animal_string_1_s57 = CONS( int_101 , L_animal_string_1_s56);
    private static final Compound L_animal_string_1_s58 = CONS( int_108 , L_animal_string_1_s57);
    private static final Compound L_animal_string_1_s59 = CONS( int_112 , L_animal_string_1_s58);




    public static Operation PRED_animal_string_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_animal_string::animal_string_1_var, FILE_animal_string::animal_string_1_3, FILE_animal_string::animal_string_1_3, FILE_animal_string::animal_string_1_con, FILE_animal_string::animal_string_1_3, FILE_animal_string::animal_string_1_lis); 
    }

    private final static Operation animal_string_1_var(Prolog m) { 
        m.jtry1(null, FILE_animal_string::animal_string_1_var_1);
        return animal_string_1_1(m);
    }

    private final static Operation animal_string_1_var_1(Prolog m) { 
        m.retry(null, FILE_animal_string::animal_string_1_var_2);
        return animal_string_1_2(m);
    }

    private final static Operation animal_string_1_var_2(Prolog m) { 
        m.trust(null);
        return animal_string_1_3(m);
    }

    private final static Operation animal_string_1_con(Prolog m) { 
        m.jtry1(null, FILE_animal_string::animal_string_1_con_1);
        return animal_string_1_1(m);
    }

    private final static Operation animal_string_1_con_1(Prolog m) { 
        m.trust(null);
        return animal_string_1_3(m);
    }

    private final static Operation animal_string_1_lis(Prolog m) { 
        m.jtry1(null, FILE_animal_string::animal_string_1_lis_1);
        return animal_string_1_2(m);
    }

    private final static Operation animal_string_1_lis_1(Prolog m) { 
        m.trust(null);
        return animal_string_1_3(m);
    }

    private final static Operation animal_string_1_1(Prolog m) { 
    // animal_string(goat):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // animal_string(goat):-[]
        if (!  ATOM_goat .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation animal_string_1_2(Prolog m) { 
    // animal_string([101,108,101,112,104,97,110,116]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // animal_string([101,108,101,112,104,97,110,116]):-[]
        if (! L_animal_string_1_s17.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation animal_string_1_3(Prolog m) { 
    // animal_string(A):-write([112,108,101,97,115,101,32,116,121,112,101,32,111,110,101,32,109,111,114,101,32,97,110,105,109,97,108,32,110,97,109,101,58,32]),read(A)
         Term a1;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // animal_string(A):-[write([112,108,101,97,115,101,32,116,121,112,101,32,111,110,101,32,109,111,114,101,32,97,110,105,109,97,108,32,110,97,109,101,58,32]),read(A)]
        return //
 Op("write", FILE_animal_string::PRED_write_1_static_exec, VA(L_animal_string_1_s59), //
 Op("read", FILE_animal_string::PRED_read_1_static_exec, VA(a1), cont));
    }
/** PREDICATE: animal_chars/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/tests/animal_string.pl
*/
    // main(animal_chars/1,public)
    private static final Compound L_animal_chars_1_s10 = CONS( int_116 ,  Prolog.Nil );
    private static final Compound L_animal_chars_1_s11 = CONS( int_110 , L_animal_chars_1_s10);
    private static final Compound L_animal_chars_1_s12 = CONS( int_97 , L_animal_chars_1_s11);
    private static final Compound L_animal_chars_1_s13 = CONS( int_104 , L_animal_chars_1_s12);
    private static final Compound L_animal_chars_1_s14 = CONS( int_112 , L_animal_chars_1_s13);
    private static final Compound L_animal_chars_1_s15 = CONS( int_101 , L_animal_chars_1_s14);
    private static final Compound L_animal_chars_1_s16 = CONS( int_108 , L_animal_chars_1_s15);
    private static final Compound L_animal_chars_1_s17 = CONS( int_101 , L_animal_chars_1_s16);
    private static final Compound L_animal_chars_1_s26 = CONS( int_32 ,  Prolog.Nil );
    private static final Compound L_animal_chars_1_s27 = CONS( int_58 , L_animal_chars_1_s26);
    private static final Compound L_animal_chars_1_s28 = CONS( int_101 , L_animal_chars_1_s27);
    private static final Compound L_animal_chars_1_s29 = CONS( int_109 , L_animal_chars_1_s28);
    private static final Compound L_animal_chars_1_s30 = CONS( int_97 , L_animal_chars_1_s29);
    private static final Compound L_animal_chars_1_s31 = CONS( int_110 , L_animal_chars_1_s30);
    private static final Compound L_animal_chars_1_s32 = CONS( int_32 , L_animal_chars_1_s31);
    private static final Compound L_animal_chars_1_s33 = CONS( int_108 , L_animal_chars_1_s32);
    private static final Compound L_animal_chars_1_s34 = CONS( int_97 , L_animal_chars_1_s33);
    private static final Compound L_animal_chars_1_s35 = CONS( int_109 , L_animal_chars_1_s34);
    private static final Compound L_animal_chars_1_s36 = CONS( int_105 , L_animal_chars_1_s35);
    private static final Compound L_animal_chars_1_s37 = CONS( int_110 , L_animal_chars_1_s36);
    private static final Compound L_animal_chars_1_s38 = CONS( int_97 , L_animal_chars_1_s37);
    private static final Compound L_animal_chars_1_s39 = CONS( int_32 , L_animal_chars_1_s38);
    private static final Compound L_animal_chars_1_s40 = CONS( int_101 , L_animal_chars_1_s39);
    private static final Compound L_animal_chars_1_s41 = CONS( int_114 , L_animal_chars_1_s40);
    private static final Compound L_animal_chars_1_s42 = CONS( int_111 , L_animal_chars_1_s41);
    private static final Compound L_animal_chars_1_s43 = CONS( int_109 , L_animal_chars_1_s42);
    private static final Compound L_animal_chars_1_s44 = CONS( int_32 , L_animal_chars_1_s43);
    private static final Compound L_animal_chars_1_s45 = CONS( int_101 , L_animal_chars_1_s44);
    private static final Compound L_animal_chars_1_s46 = CONS( int_110 , L_animal_chars_1_s45);
    private static final Compound L_animal_chars_1_s47 = CONS( int_111 , L_animal_chars_1_s46);
    private static final Compound L_animal_chars_1_s48 = CONS( int_32 , L_animal_chars_1_s47);
    private static final Compound L_animal_chars_1_s49 = CONS( int_101 , L_animal_chars_1_s48);
    private static final Compound L_animal_chars_1_s50 = CONS( int_112 , L_animal_chars_1_s49);
    private static final Compound L_animal_chars_1_s51 = CONS( int_121 , L_animal_chars_1_s50);
    private static final Compound L_animal_chars_1_s52 = CONS( int_116 , L_animal_chars_1_s51);
    private static final Compound L_animal_chars_1_s53 = CONS( int_32 , L_animal_chars_1_s52);
    private static final Compound L_animal_chars_1_s54 = CONS( int_101 , L_animal_chars_1_s53);
    private static final Compound L_animal_chars_1_s55 = CONS( int_115 , L_animal_chars_1_s54);
    private static final Compound L_animal_chars_1_s56 = CONS( int_97 , L_animal_chars_1_s55);
    private static final Compound L_animal_chars_1_s57 = CONS( int_101 , L_animal_chars_1_s56);
    private static final Compound L_animal_chars_1_s58 = CONS( int_108 , L_animal_chars_1_s57);
    private static final Compound L_animal_chars_1_s59 = CONS( int_112 , L_animal_chars_1_s58);




    public static Operation PRED_animal_chars_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_animal_string::animal_chars_1_var, FILE_animal_string::animal_chars_1_3, FILE_animal_string::animal_chars_1_3, FILE_animal_string::animal_chars_1_con, FILE_animal_string::animal_chars_1_3, FILE_animal_string::animal_chars_1_lis); 
    }

    private final static Operation animal_chars_1_var(Prolog m) { 
        m.jtry1(null, FILE_animal_string::animal_chars_1_var_1);
        return animal_chars_1_1(m);
    }

    private final static Operation animal_chars_1_var_1(Prolog m) { 
        m.retry(null, FILE_animal_string::animal_chars_1_var_2);
        return animal_chars_1_2(m);
    }

    private final static Operation animal_chars_1_var_2(Prolog m) { 
        m.trust(null);
        return animal_chars_1_3(m);
    }

    private final static Operation animal_chars_1_con(Prolog m) { 
        m.jtry1(null, FILE_animal_string::animal_chars_1_con_1);
        return animal_chars_1_1(m);
    }

    private final static Operation animal_chars_1_con_1(Prolog m) { 
        m.trust(null);
        return animal_chars_1_3(m);
    }

    private final static Operation animal_chars_1_lis(Prolog m) { 
        m.jtry1(null, FILE_animal_string::animal_chars_1_lis_1);
        return animal_chars_1_2(m);
    }

    private final static Operation animal_chars_1_lis_1(Prolog m) { 
        m.trust(null);
        return animal_chars_1_3(m);
    }

    private final static Operation animal_chars_1_1(Prolog m) { 
    // animal_chars(goat):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // animal_chars(goat):-[]
        if (!  ATOM_goat .unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation animal_chars_1_2(Prolog m) { 
    // animal_chars([101,108,101,112,104,97,110,116]):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // animal_chars([101,108,101,112,104,97,110,116]):-[]
        if (! L_animal_chars_1_s17.unify(a1, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation animal_chars_1_3(Prolog m) { 
    // animal_chars(A):-write([112,108,101,97,115,101,32,116,121,112,101,32,111,110,101,32,109,111,114,101,32,97,110,105,109,97,108,32,110,97,109,101,58,32]),read(A)
         Term a1;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // animal_chars(A):-[write([112,108,101,97,115,101,32,116,121,112,101,32,111,110,101,32,109,111,114,101,32,97,110,105,109,97,108,32,110,97,109,101,58,32]),read(A)]
        return //
 Op("write", FILE_animal_string::PRED_write_1_static_exec, VA(L_animal_chars_1_s59), //
 Op("read", FILE_animal_string::PRED_read_1_static_exec, VA(a1), cont));
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("animal_string",1,FILE_animal_string::PRED_animal_string_1_static_exec);
   PredTable.registerBuiltin("animal_chars",1,FILE_animal_string::PRED_animal_chars_1_static_exec);
}
}

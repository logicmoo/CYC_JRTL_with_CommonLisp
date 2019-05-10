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
public class FILE_asm extends FILE_system {
/** PREDICATE: determinate/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/asm.pl
*/
    // main(determinate/1,public)




    public static Operation PRED_determinate_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // determinate(A):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // determinate(A):-[]
        return cont;
    }
/** PREDICATE: setup_determinates/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/asm.pl
*/
    // main(setup_determinates/0,public)
        final static Functor FUNCTOR_$002F_2 = F("/",2);
        final static Functor ATOM_cmp_error = SYM("cmp_error");
    private static final Compound L_setup_determinates_0_s5 = S( FUNCTOR_$002F_2 ,  ATOM_cmp_error ,  int_1 );
        final static Functor ATOM_name = SYM("name");
    private static final Compound L_setup_determinates_0_s9 = S( FUNCTOR_$002F_2 ,  ATOM_name ,  int_2 );
        final static Functor ATOM_length = SYM("length");
    private static final Compound L_setup_determinates_0_s12 = S( FUNCTOR_$002F_2 ,  ATOM_length ,  int_2 );
        final static Functor ATOM_asm_hash_value = SYM("asm_hash_value");
    private static final Compound L_setup_determinates_0_s15 = S( FUNCTOR_$002F_2 ,  ATOM_asm_hash_value ,  int_2 );
    private static final Compound L_setup_determinates_0_s17 = CONS(L_setup_determinates_0_s15,  Prolog.Nil );
    private static final Compound L_setup_determinates_0_s18 = CONS(L_setup_determinates_0_s12, L_setup_determinates_0_s17);
    private static final Compound L_setup_determinates_0_s19 = CONS(L_setup_determinates_0_s9, L_setup_determinates_0_s18);
    private static final Compound L_setup_determinates_0_s20 = CONS(L_setup_determinates_0_s5, L_setup_determinates_0_s19);




    public static Operation PRED_setup_determinates_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // setup_determinates:-determinate([cmp_error/1,name/2,length/2,asm_hash_value/2])
        m.setB0();
    // setup_determinates:-[determinate([cmp_error/1,name/2,length/2,asm_hash_value/2])]
        return //
 Op("determinate", FILE_asm::PRED_determinate_1_static_exec, VA(L_setup_determinates_0_s20), cont);
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("determinate",1,FILE_asm::PRED_determinate_1_static_exec);
   PredTable.registerBuiltin("setup_determinates",0,FILE_asm::PRED_setup_determinates_0_static_exec);
}
}

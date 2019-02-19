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
public class FILE_tak extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/tak.pl
*/
    // main(top/0,public)




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-tak
        m.setB0();
    // top:-[tak]
        return //
 Op("tak", FILE_tak::PRED_tak_0_static_exec, VA(), cont);
    }
/** PREDICATE: tak/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/tak.pl
*/
    // main(tak/0,public)




    public static Operation PRED_tak_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // tak:-tak(18,12,6,A)
        m.setB0();
    // tak:-[tak(18,12,6,A)]
        return //
 Op("tak", FILE_tak::PRED_tak_4_static_exec, VA( int_18 ,  int_12 ,  int_6 , m.DONT_CARE2()), cont);
    }
/** PREDICATE: tak/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/tak.pl
*/
    // main(tak/4,public)
        final static Functor FUNCTOR_$002D_2 = F("-",2);




    public static Operation PRED_tak_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return tak_4_top(m);
    }

    private final static Operation tak_4_top(Prolog m) { 
        m.setB0();
        m.jtry4(null, FILE_tak::tak_4_sub_1);
        return tak_4_1(m);
    }

    private final static Operation tak_4_sub_1(Prolog m) { 
        m.trust(null);
        return tak_4_2(m);
    }

    private final static Operation tak_4_1(Prolog m) { 
    // tak(A,B,C,D):-A=<B,C=D
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // tak(A,B,C,D):-['$less_or_equal'(A,B),'$unify'(C,D)]
        //START inline expansion of $less_or_equal(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $unify(a(3),a(4))
        if (! a3.unify(a4, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation tak_4_2(Prolog m) { 
    // tak(A,B,C,D):-A>B,E is A-1,tak(E,B,C,F),G is B-1,tak(G,C,A,H),I is C-1,tak(I,A,B,J),tak(F,H,J,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
        Operation p1, p2, p3, p4, p5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // tak(A,B,C,D):-['$greater_than'(A,B),E is A-1,tak(E,B,C,F),G is B-1,tak(G,C,A,H),I is C-1,tak(I,A,B,J),tak(F,H,J,D)]
        //START inline expansion of $greater_than(a(1),a(2))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002D_2 , a1,  int_1 );
 ;
        //START inline expansion of a(5)is a(6)
        if (! a5.unify(Arithmetic.evaluate(a6), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        a8 = m.mkvar1();
    // put_str_args([a(2),@(int_1)],y(2)),put_str(@('FUNCTOR_$002D_2'),y(2),a(9))
        a9 =  S( FUNCTOR_$002D_2 , a2,  int_1 );
 ;
        a10 = m.mkvar1();
        a11 = m.mkvar1();
    // put_str_args([a(3),@(int_1)],y(3)),put_str(@('FUNCTOR_$002D_2'),y(3),a(12))
        a12 =  S( FUNCTOR_$002D_2 , a3,  int_1 );
 ;
        a13 = m.mkvar1();
        p5 = //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a8, a9), //
 Op("tak", FILE_tak::PRED_tak_4_static_exec, VA(a8, a3, a1, a10), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a11, a12), //
 Op("tak", FILE_tak::PRED_tak_4_static_exec, VA(a11, a1, a2, a13), //
 Op("tak", FILE_tak::PRED_tak_4_static_exec, VA(a7, a10, a13, a4), cont)))));
        m.AREGS[0] = a5;
        m.AREGS[1] = a2;
        m.AREGS[2] = a3;
        m.AREGS[3] = a7;
        m.cont = p5;
        return tak_4_top(m);
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_tak::PRED_top_0_static_exec);
   PredTable.registerBuiltin("tak",0,FILE_tak::PRED_tak_0_static_exec);
   PredTable.registerBuiltin("tak",4,FILE_tak::PRED_tak_4_static_exec);
}
}

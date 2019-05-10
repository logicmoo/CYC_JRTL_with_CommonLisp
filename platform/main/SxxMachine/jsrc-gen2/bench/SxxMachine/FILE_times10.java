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
public class FILE_times10 extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/times10.pl
*/
    // main(top/0,public)




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-times10
        m.setB0();
    // top:-[times10]
        return //
 Op("times10", FILE_times10::PRED_times10_0_static_exec, VA(), cont);
    }
/** PREDICATE: times10/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/times10.pl
*/
    // main(times10/0,public)
        final static Functor FUNCTOR_$002A_2 = F("*",2);
        final static Functor ATOM_x = SYM("x");
    private static final Compound L_times10_0_s4 = S( FUNCTOR_$002A_2 ,  ATOM_x ,  ATOM_x );
    private static final Compound L_times10_0_s6 = S( FUNCTOR_$002A_2 , L_times10_0_s4,  ATOM_x );
    private static final Compound L_times10_0_s8 = S( FUNCTOR_$002A_2 , L_times10_0_s6,  ATOM_x );
    private static final Compound L_times10_0_s10 = S( FUNCTOR_$002A_2 , L_times10_0_s8,  ATOM_x );
    private static final Compound L_times10_0_s12 = S( FUNCTOR_$002A_2 , L_times10_0_s10,  ATOM_x );
    private static final Compound L_times10_0_s14 = S( FUNCTOR_$002A_2 , L_times10_0_s12,  ATOM_x );
    private static final Compound L_times10_0_s16 = S( FUNCTOR_$002A_2 , L_times10_0_s14,  ATOM_x );
    private static final Compound L_times10_0_s18 = S( FUNCTOR_$002A_2 , L_times10_0_s16,  ATOM_x );
    private static final Compound L_times10_0_s20 = S( FUNCTOR_$002A_2 , L_times10_0_s18,  ATOM_x );




    public static Operation PRED_times10_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // times10:-d(x*x*x*x*x*x*x*x*x*x,x,A)
        m.setB0();
    // times10:-[d(x*x*x*x*x*x*x*x*x*x,x,A)]
        return //
 Op("d", FILE_times10::PRED_d_3_static_exec, VA(L_times10_0_s20,  ATOM_x , m.DONT_CARE2()), cont);
    }
/** PREDICATE: d/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/times10.pl
*/
    // main(d/3,public)
        final static Functor FUNCTOR_$002B_2 = F("+",2);
        final static Functor FUNCTOR_$002D_2 = F("-",2);
        final static Functor FUNCTOR_$002F_2 = F("/",2);
        final static Functor FUNCTOR_$005E_2 = F("^",2);
        final static Functor FUNCTOR_$002D_1 = F("-",1);
        final static Functor FUNCTOR_exp_1 = F("exp",1);
        final static Functor FUNCTOR_log_1 = F("log",1);




    public static Operation PRED_d_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return d_3_top(m);
    }

    private final static Operation d_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_times10::d_3_var, FILE_times10::d_3_int, FILE_times10::d_3_int, FILE_times10::d_3_int, FILE_times10::d_3_var, FILE_times10::d_3_int); 
    }

    private final static Operation d_3_var(Prolog m) { 
        m.jtry3(null, FILE_times10::d_3_var_1);
        return d_3_1(m);
    }

    private final static Operation d_3_var_1(Prolog m) { 
        m.retry(null, FILE_times10::d_3_var_2);
        return d_3_2(m);
    }

    private final static Operation d_3_var_2(Prolog m) { 
        m.retry(null, FILE_times10::d_3_var_3);
        return d_3_3(m);
    }

    private final static Operation d_3_var_3(Prolog m) { 
        m.retry(null, FILE_times10::d_3_var_4);
        return d_3_4(m);
    }

    private final static Operation d_3_var_4(Prolog m) { 
        m.retry(null, FILE_times10::d_3_var_5);
        return d_3_5(m);
    }

    private final static Operation d_3_var_5(Prolog m) { 
        m.retry(null, FILE_times10::d_3_var_6);
        return d_3_6(m);
    }

    private final static Operation d_3_var_6(Prolog m) { 
        m.retry(null, FILE_times10::d_3_var_7);
        return d_3_7(m);
    }

    private final static Operation d_3_var_7(Prolog m) { 
        m.retry(null, FILE_times10::d_3_var_8);
        return d_3_8(m);
    }

    private final static Operation d_3_var_8(Prolog m) { 
        m.retry(null, FILE_times10::d_3_var_9);
        return d_3_9(m);
    }

    private final static Operation d_3_var_9(Prolog m) { 
        m.trust(null);
        return d_3_10(m);
    }

    private final static Operation d_3_int(Prolog m) { 
        m.jtry3(null, FILE_times10::d_3_int_1);
        return d_3_9(m);
    }

    private final static Operation d_3_int_1(Prolog m) { 
        m.trust(null);
        return d_3_10(m);
    }

    private final static Operation d_3_1(Prolog m) { 
    // d(A+B,C,D+E):-!,d(A,C,D),d(B,C,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // d(A+B,C,D+E):-['$neck_cut',d(A,C,D),d(B,C,E)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002B_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002B_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op("d", FILE_times10::PRED_d_3_static_exec, VA(a5, a2, a7), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
        m.cont = p1;
        return d_3_top(m);
    }

    private final static Operation d_3_2(Prolog m) { 
    // d(A-B,C,D-E):-!,d(A,C,D),d(B,C,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // d(A-B,C,D-E):-['$neck_cut',d(A,C,D),d(B,C,E)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002D_2 , m.trail, a6, a7)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op("d", FILE_times10::PRED_d_3_static_exec, VA(a5, a2, a7), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
        m.cont = p1;
        return d_3_top(m);
    }

    private final static Operation d_3_3(Prolog m) { 
    // d(A*B,C,D*B+A*E):-!,d(A,C,D),d(B,C,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // d(A*B,C,D*B+A*E):-['$neck_cut',d(A,C,D),d(B,C,E)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002A_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002B_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002A_2 , m.trail, a8, a5)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_$002A_2 , m.trail, a4, a9)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op("d", FILE_times10::PRED_d_3_static_exec, VA(a5, a2, a9), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a8;
        m.cont = p1;
        return d_3_top(m);
    }

    private final static Operation d_3_4(Prolog m) { 
    // d(A/B,C,(D*B-A*E)/B^2):-!,d(A,C,D),d(B,C,E)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // d(A/B,C,(D*B-A*E)/B^2):-['$neck_cut',d(A,C,D),d(B,C,E)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002F_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002F_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            a9 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002D_2 , m.trail, a8, a9)){
                return m.fail();
            }
        a8 = a8.dref();
            a10 = m.mkvar2();
            if (!a8.unifyS( FUNCTOR_$002A_2 , m.trail, a10, a5)){
                return m.fail();
            }
        a9 = a9.dref();
            a11 = m.mkvar2();
            if (!a9.unifyS( FUNCTOR_$002A_2 , m.trail, a4, a11)){
                return m.fail();
            }
        a7 = a7.dref();
            if (!a7.unifyS( FUNCTOR_$005E_2 , m.trail, a5,  int_2 )){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        p1 = //
 Op("d", FILE_times10::PRED_d_3_static_exec, VA(a5, a2, a11), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a10;
        m.cont = p1;
        return d_3_top(m);
    }

    private final static Operation d_3_5(Prolog m) { 
    // d(A^B,C,D*B*A^E):-!,integer(B),E is B-1,d(A,C,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // d(A^B,C,D*B*A^E):-['$neck_cut',integer(B),E is B-1,d(A,C,D)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$005E_2 , m.trail, a4, a5)){
                return m.fail();
            }
        a3 = a3.dref();
            a6 = m.mkvar2();
            a7 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002A_2 , m.trail, a6, a7)){
                return m.fail();
            }
        a6 = a6.dref();
            a8 = m.mkvar2();
            if (!a6.unifyS( FUNCTOR_$002A_2 , m.trail, a8, a5)){
                return m.fail();
            }
        a7 = a7.dref();
            a9 = m.mkvar2();
            if (!a7.unifyS( FUNCTOR_$005E_2 , m.trail, a4, a9)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of integer(a(5))
        a5 = a5.dref();
        if (! (a5 .isInteger())) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(5),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(10))
        a10 =  S( FUNCTOR_$002D_2 , a5,  int_1 );
 ;
        //START inline expansion of a(9)is a(10)
        if (! a9.unify(Arithmetic.evaluate(a10), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a8;
m.cont = cont;
        return d_3_top(m);
    }

    private final static Operation d_3_6(Prolog m) { 
    // d(-A,B,-C):-!,d(A,B,C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // d(-A,B,-C):-['$neck_cut',d(A,B,C)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_$002D_1 , m.trail, a4)){
                return m.fail();
            }
        a3 = a3.dref();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002D_1 , m.trail, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a5;
m.cont = cont;
        return d_3_top(m);
    }

    private final static Operation d_3_7(Prolog m) { 
    // d(exp(A),B,exp(A)*C):-!,d(A,B,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // d(exp(A),B,exp(A)*C):-['$neck_cut',d(A,B,C)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_exp_1 , m.trail, a4)){
                return m.fail();
            }
        a3 = a3.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002A_2 , m.trail, a5, a6)){
                return m.fail();
            }
        a5 = a5.dref();
            if (!a5.unifyS( FUNCTOR_exp_1 , m.trail, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a6;
m.cont = cont;
        return d_3_top(m);
    }

    private final static Operation d_3_8(Prolog m) { 
    // d(log(A),B,C/A):-!,d(A,B,C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // d(log(A),B,C/A):-['$neck_cut',d(A,B,C)]
        a1 = a1.dref();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_log_1 , m.trail, a4)){
                return m.fail();
            }
        a3 = a3.dref();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_$002F_2 , m.trail, a5, a4)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        m.AREGS[0] = a4;
        m.AREGS[1] = a2;
        m.AREGS[2] = a5;
m.cont = cont;
        return d_3_top(m);
    }

    private final static Operation d_3_9(Prolog m) { 
    // d(A,A,1):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // d(A,A,1):-['$neck_cut']
        if (! a1.unify(a2, m.trail))
            return m.fail();
        if (!  int_1 .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation d_3_10(Prolog m) { 
    // d(A,B,0):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // d(A,B,0):-[]
        if (!  int_0 .unify(a3, m.trail))
            return m.fail();
        return cont;
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_times10::PRED_top_0_static_exec);
   PredTable.registerBuiltin("times10",0,FILE_times10::PRED_times10_0_static_exec);
   PredTable.registerBuiltin("d",3,FILE_times10::PRED_d_3_static_exec);
}
}

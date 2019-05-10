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
public class FILE_swi_supp extends FILE_io {
/** PREDICATE: (package)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
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
/** PREDICATE: $dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/1,non-(public))
        final static Functor FUNCTOR_module_colon_2 = F(":",2);
        final static Functor ATOM_SxxMachine = SYM("SxxMachine");




    public static Operation PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-call(A),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-['$get_level'(B),call('SxxMachine':A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a3), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/2,non-(public))




    public static Operation PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_1(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_2(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-(call(A),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(B)),!,fail
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-['$get_level'(C),call('SxxMachine':A),'$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a4), //
 Op("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a2), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), fail_0)));
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: forall/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(forall/2,non-(public))




    public static Operation PRED_forall_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // forall(A,B):-'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // forall(A,B):-['$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B)]
        return //
 Op("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: format/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(format/3,non-(public))
        final static Functor FUNCTOR_fmt_2 = F("fmt",2);




    public static Operation PRED_format_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // format(A,B,C):-writeq(A,fmt(B,C))
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // format(A,B,C):-[writeq(A,fmt(B,C))]
    // put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_fmt_2'),y(1),a(4))
        a4 =  S( FUNCTOR_fmt_2 , a2, a3);
 ;
        return //
 Op("writeq", FILE_system::PRED_writeq_2_static_exec, VA(a1, a4), cont);
    }
/** PREDICATE: $dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/3,non-(public))




    public static Operation PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_swi_supp::$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_3_sub_1);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_3_1(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_3_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_3_2(m);
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_3_1(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B,C):-call(A),!,call(B),call(C)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B,C):-['$get_level'(D),call('SxxMachine':A),'$cut'(D),call('SxxMachine':B),call('SxxMachine':C)]
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(3)],y(3)),put_str(@('FUNCTOR_module_colon_2'),y(3),a(7))
        a7 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a3);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a5), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a4), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a6), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a7), cont))));
    }

    private final static Operation $dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_3_2(Prolog m) { 
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B,C):-fail
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // '$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B,C):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: reorder/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(reorder/3,public)




    public static Operation PRED_reorder_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_swi_supp::reorder_3_sub_1);
        return reorder_3_1(m);
    }

    private final static Operation reorder_3_sub_1(Prolog m) { 
        m.trust(null);
        return reorder_3_2(m);
    }

    private final static Operation reorder_3_1(Prolog m) { 
    // reorder(A,B,C):-'$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // reorder(A,B,C):-['$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B,C)]
        return //
 Op("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_3_static_exec, VA(a1, a2, a3), cont);
    }

    private final static Operation reorder_3_2(Prolog m) { 
    // reorder(A,B,C):-call(C),call(B)
         Term a1, a2, a3, a4, a5;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // reorder(A,B,C):-[call('SxxMachine':C),call('SxxMachine':B)]
    // put_str_args([@('ATOM_SxxMachine'),a(3)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(4))
        a4 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a3);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a4), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a5), cont));
    }
/** PREDICATE: setup_call_cleanup/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(setup_call_cleanup/3,public)




    public static Operation PRED_setup_call_cleanup_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // setup_call_cleanup(A,B,C):-setup_call_catcher_cleanup(A,B,D,C)
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // setup_call_cleanup(A,B,C):-[setup_call_catcher_cleanup(A,B,D,C)]
        return //
 Op("setup_call_catcher_cleanup", FILE_system::PRED_setup_call_catcher_cleanup_4_static_exec, VA(a1, a2, m.DONT_CARE2(), a3), cont);
    }
/** PREDICATE: each_call_cleanup/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(each_call_cleanup/3,public)
        final static Functor FUNCTOR_each_call_cleanup_4 = F("each_call_cleanup",4);




    public static Operation PRED_each_call_cleanup_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // each_call_cleanup(A,B,C):-throw_missing(each_call_cleanup(A,B,D,C))
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // each_call_cleanup(A,B,C):-[throw_missing(each_call_cleanup(A,B,D,C))]
    // put_str_args([a(1),a(2),void,a(3)],y(1)),put_str(@('FUNCTOR_each_call_cleanup_4'),y(1),a(4))
        a4 =  S( FUNCTOR_each_call_cleanup_4 , a1, a2, m.mkvar3(), a3);
 ;
        return //
 Op("throw_missing", FILE_system::PRED_throw_missing_1_static_exec, VA(a4), cont);
    }
/** PREDICATE: setup_call_catcher_cleanup/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(setup_call_catcher_cleanup/4,public)
        final static Functor FUNCTOR_setup_call_catcher_cleanup_4 = F("setup_call_catcher_cleanup",4);




    public static Operation PRED_setup_call_catcher_cleanup_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // setup_call_catcher_cleanup(A,B,C,D):-throw_missing(setup_call_catcher_cleanup(A,B,C,D))
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // setup_call_catcher_cleanup(A,B,C,D):-[throw_missing(setup_call_catcher_cleanup(A,B,C,D))]
    // put_str_args([a(1),a(2),a(3),a(4)],y(1)),put_str(@('FUNCTOR_setup_call_catcher_cleanup_4'),y(1),a(5))
        a5 =  S( FUNCTOR_setup_call_catcher_cleanup_4 , a1, a2, a3, a4);
 ;
        return //
 Op("throw_missing", FILE_system::PRED_throw_missing_1_static_exec, VA(a5), cont);
    }
/** PREDICATE: recorda/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(recorda/2,public)




    public static Operation PRED_recorda_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // recorda(A,B):-recorda(A,B,C)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // recorda(A,B):-[recorda(A,B,C)]
        return //
 Op("recorda", FILE_system::PRED_recorda_3_static_exec, VA(a1, a2, m.DONT_CARE2()), cont);
    }
/** PREDICATE: recordz/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(recordz/2,public)




    public static Operation PRED_recordz_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // recordz(A,B):-recordz(A,B,C)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // recordz(A,B):-[recordz(A,B,C)]
        return //
 Op("recordz", FILE_system::PRED_recordz_3_static_exec, VA(a1, a2, m.DONT_CARE2()), cont);
    }
/** PREDICATE: recorded/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(recorded/2,public)




    public static Operation PRED_recorded_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // recorded(A,B):-recorded(A,B,C)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // recorded(A,B):-[recorded(A,B,C)]
        return //
 Op("recorded", FILE_system::PRED_recorded_3_static_exec, VA(a1, a2, m.DONT_CARE2()), cont);
    }
/** PREDICATE: throw_missing/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(throw_missing/1,non-(public))
        final static Functor FUNCTOR_throw_missing_1 = F("throw_missing",1);




    public static Operation PRED_throw_missing_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // throw_missing(A):-throw(throw_missing(A))
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // throw_missing(A):-[throw(throw_missing(A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_throw_missing_1'),y(1),a(2))
        a2 =  S( FUNCTOR_throw_missing_1 , a1);
 ;
        return //
 Op("throw", FILE_system::PRED_throw_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: instance/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(instance/2,non-(public))
        final static Functor FUNCTOR_instance_2 = F("instance",2);




    public static Operation PRED_instance_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // instance(A,B):-throw_missing(instance(A,B))
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // instance(A,B):-[throw_missing(instance(A,B))]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_instance_2'),y(1),a(3))
        a3 =  S( FUNCTOR_instance_2 , a1, a2);
 ;
        return //
 Op("throw_missing", FILE_system::PRED_throw_missing_1_static_exec, VA(a3), cont);
    }
/** PREDICATE: flag/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(flag/3,public)
        final static Functor FUNCTOR_flag_3 = F("flag",3);




    public static Operation PRED_flag_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // flag(A,B,C):-throw_missing(flag(A,B,C))
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // flag(A,B,C):-[throw_missing(flag(A,B,C))]
    // put_str_args([a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_flag_3'),y(1),a(4))
        a4 =  S( FUNCTOR_flag_3 , a1, a2, a3);
 ;
        return //
 Op("throw_missing", FILE_system::PRED_throw_missing_1_static_exec, VA(a4), cont);
    }
/** PREDICATE: source_location/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(source_location/2,public)
        final static Functor FUNCTOR_source_location_2 = F("source_location",2);




    public static Operation PRED_source_location_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // source_location(A,B):-throw_missing(source_location(A,B))
        m.setB0();
         Term a1, a2, a3;
        a1 = LARG[0];
        a2 = LARG[1];
    // source_location(A,B):-[throw_missing(source_location(A,B))]
    // put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_source_location_2'),y(1),a(3))
        a3 =  S( FUNCTOR_source_location_2 , a1, a2);
 ;
        return //
 Op("throw_missing", FILE_system::PRED_throw_missing_1_static_exec, VA(a3), cont);
    }
/** PREDICATE: set_predicate_property/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(set_predicate_property/2,public)
        final static Functor FUNCTOR_$002F_2 = F("/",2);
        final static Functor FUNCTOR_$002C_2 = F(",",2);
        final static Functor ATOM_meta_predicate = SYM("meta_predicate");
        final static Functor FUNCTOR_meta_predicate_1 = F("meta_predicate",1);




    public static Operation PRED_set_predicate_property_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return set_predicate_property_2_top(m);
    }

    private final static Operation set_predicate_property_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::set_predicate_property_2_var, FILE_swi_supp::set_predicate_property_2_8, FILE_swi_supp::set_predicate_property_2_8, FILE_swi_supp::set_predicate_property_2_8, FILE_swi_supp::set_predicate_property_2_var, FILE_swi_supp::set_predicate_property_2_8); 
    }

    private final static Operation set_predicate_property_2_var(Prolog m) { 
        m.jtry2(null, FILE_swi_supp::set_predicate_property_2_var_1);
        return set_predicate_property_2_1(m);
    }

    private final static Operation set_predicate_property_2_var_1(Prolog m) { 
        m.retry(null, FILE_swi_supp::set_predicate_property_2_var_2);
        return set_predicate_property_2_2(m);
    }

    private final static Operation set_predicate_property_2_var_2(Prolog m) { 
        m.retry(null, FILE_swi_supp::set_predicate_property_2_var_3);
        return set_predicate_property_2_3(m);
    }

    private final static Operation set_predicate_property_2_var_3(Prolog m) { 
        m.retry(null, FILE_swi_supp::set_predicate_property_2_var_4);
        return set_predicate_property_2_4(m);
    }

    private final static Operation set_predicate_property_2_var_4(Prolog m) { 
        m.retry(null, FILE_swi_supp::set_predicate_property_2_var_5);
        return set_predicate_property_2_5(m);
    }

    private final static Operation set_predicate_property_2_var_5(Prolog m) { 
        m.retry(null, FILE_swi_supp::set_predicate_property_2_var_6);
        return set_predicate_property_2_6(m);
    }

    private final static Operation set_predicate_property_2_var_6(Prolog m) { 
        m.retry(null, FILE_swi_supp::set_predicate_property_2_var_7);
        return set_predicate_property_2_7(m);
    }

    private final static Operation set_predicate_property_2_var_7(Prolog m) { 
        m.trust(null);
        return set_predicate_property_2_8(m);
    }

    private final static Operation set_predicate_property_2_1(Prolog m) { 
    // set_predicate_property(A:B:C,D):-!,nonvar(B),set_predicate_property(B:C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:B:C,D):-['$neck_cut',nonvar(B),set_predicate_property(B:C,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, m.DONT_CARE1(), a3)){
                return m.fail();
            }
        a3 = a3.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a3.unifyS( FUNCTOR_module_colon_2 , m.trail, a4, a5)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        //START inline expansion of nonvar(a(4))
        a4 = a4.dref();
        if ((a4 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(6))
        a6 =  S( FUNCTOR_module_colon_2 , a4, a5);
 ;
        m.AREGS[0] = a6;
        m.AREGS[1] = a2;
m.cont = cont;
        return set_predicate_property_2_top(m);
    }

    private final static Operation set_predicate_property_2_2(Prolog m) { 
    // set_predicate_property(A:[],B):-!
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:[],B):-['$neck_cut']
        a1 = a1.dref();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, m.DONT_CARE1(),  Prolog.Nil )){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation set_predicate_property_2_3(Prolog m) { 
    // set_predicate_property(A:B/C,D):-!,set_predicate_property(A,B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:B/C,D):-['$neck_cut',set_predicate_property(A,B,C,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_$002F_2 , m.trail, a5, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_4_static_exec, VA(a3, a5, a6, a2), cont);
    }

    private final static Operation set_predicate_property_2_4(Prolog m) { 
    // set_predicate_property(A:[B|C],D):-!,set_predicate_property(A:B,D),set_predicate_property(A:C,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:[B|C],D):-['$neck_cut',set_predicate_property(A:B,D),set_predicate_property(A:C,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a4 = a4.dref();
        if (a4 .isCons()){
                        a5 = a4.car();
            a6 = a4.cdr();
        } else if (a4.isVar()){
            a5 = m.mkvar2();
            a6 = m.mkvar2();
             a4.bind(CONS(a5, a6), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(3),a(5)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a3, a5);
 ;
    // put_str_args([a(3),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(8))
        a8 =  S( FUNCTOR_module_colon_2 , a3, a6);
 ;
        p1 = //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a8, a2), cont);
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.cont = p1;
        return set_predicate_property_2_top(m);
    }

    private final static Operation set_predicate_property_2_5(Prolog m) { 
    // set_predicate_property(A:(B,C),D):-!,set_predicate_property(A:B,D),set_predicate_property(A:C,D)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:(B,C),D):-['$neck_cut',set_predicate_property(A:B,D),set_predicate_property(A:C,D)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a4 = a4.dref();
            a5 = m.mkvar2();
            a6 = m.mkvar2();
            if (!a4.unifyS( FUNCTOR_$002C_2 , m.trail, a5, a6)){
                return m.fail();
            }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
    // put_str_args([a(3),a(5)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(7))
        a7 =  S( FUNCTOR_module_colon_2 , a3, a5);
 ;
    // put_str_args([a(3),a(6)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(8))
        a8 =  S( FUNCTOR_module_colon_2 , a3, a6);
 ;
        p1 = //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a8, a2), cont);
        m.AREGS[0] = a7;
        m.AREGS[1] = a2;
        m.cont = p1;
        return set_predicate_property_2_top(m);
    }

    private final static Operation set_predicate_property_2_6(Prolog m) { 
    // set_predicate_property(A:B,meta_predicate):-!,functor(B,C,D),set_predicate_property(A,C,D,(meta_predicate B))
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:B,meta_predicate):-['$neck_cut',functor(B,C,D),set_predicate_property(A,C,D,(meta_predicate B))]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a4)){
                return m.fail();
            }
        if (!  ATOM_meta_predicate .unify(a2, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a5 = m.mkvar1();
        a6 = m.mkvar1();
    // put_str_args([a(4)],y(1)),put_str(@('FUNCTOR_meta_predicate_1'),y(1),a(7))
        a7 =  S( FUNCTOR_meta_predicate_1 , a4);
 ;
        return //
 Op("functor", FILE_system::PRED_functor_3_static_exec, VA(a4, a5, a6), //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_4_static_exec, VA(a3, a5, a6, a7), cont));
    }

    private final static Operation set_predicate_property_2_7(Prolog m) { 
    // set_predicate_property(A:B,C):-functor(B,D,E),set_predicate_property(A,D,E,C)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A:B,C):-[functor(B,D,E),set_predicate_property(A,D,E,C)]
        a1 = a1.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        return //
 Op("functor", FILE_system::PRED_functor_3_static_exec, VA(a4, a5, a6), //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_4_static_exec, VA(a3, a5, a6, a2), cont));
    }

    private final static Operation set_predicate_property_2_8(Prolog m) { 
    // set_predicate_property(A,B):-strip_module(A,C,D),A==D,!,set_predicate_property(C:D,B)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // set_predicate_property(A,B):-['$get_level'(C),strip_module(A,D,E),'$equality_of_term'(A,E),'$cut'(C),set_predicate_property(D:E,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(6))
        a6 =  S( FUNCTOR_module_colon_2 , a4, a5);
 ;
        return //
 Op("strip_module", FILE_system::PRED_strip_module_3_static_exec, VA(a1, a4, a5), //
 Op("$equality_of_term", FILE_system::PRED_$equality_of_term_2_static_exec, VA(a1, a5), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a6, a2), cont))));
    }
/** PREDICATE: ccall/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(ccall/1,public)




    public static Operation PRED_ccall_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // ccall(A):-clause('SxxMachine':A,true)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
    // ccall(A):-[clause('SxxMachine':A,true)]
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
        return //
 Op("clause", FILE_system::PRED_clause_2_static_exec, VA(a2,  Prolog.True ), cont);
    }
/** PREDICATE: $dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-ccall(A),!,true
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-['$get_level'(B),ccall(A),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("ccall", FILE_system::PRED_ccall_1_static_exec, VA(a1), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), cont));
    }

    private final static Operation $dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-fail
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: assertz_if_new/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(assertz_if_new/1,public)




    public static Operation PRED_assertz_if_new_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::assertz_if_new_1_sub_1);
        return assertz_if_new_1_1(m);
    }

    private final static Operation assertz_if_new_1_sub_1(Prolog m) { 
        m.trust(null);
        return assertz_if_new_1_2(m);
    }

    private final static Operation assertz_if_new_1_1(Prolog m) { 
    // assertz_if_new(A):-'$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // assertz_if_new(A):-['$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A)]
        return //
 Op("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a1), cont);
    }

    private final static Operation assertz_if_new_1_2(Prolog m) { 
    // assertz_if_new(A):-'SxxMachine':assertz(A)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // assertz_if_new(A):-[assertz('SxxMachine':A)]
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
        return //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: set_predicate_property/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(set_predicate_property/4,public)
        final static Functor FUNCTOR_$0024predicate_property_4 = F("$predicate_property",4);
        final static Functor ATOM_defined = SYM("defined");




    public static Operation PRED_set_predicate_property_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_swi_supp::set_predicate_property_4_sub_1);
        return set_predicate_property_4_1(m);
    }

    private final static Operation set_predicate_property_4_sub_1(Prolog m) { 
        m.trust(null);
        return set_predicate_property_4_2(m);
    }

    private final static Operation set_predicate_property_4_1(Prolog m) { 
    // set_predicate_property(A,B,C,D):-ccall('$predicate_property'(D,A,B,C)),!
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // set_predicate_property(A,B,C,D):-['$get_level'(E),ccall('$predicate_property'(D,A,B,C)),'$cut'(E)]
        a5 = m.mkvar1();
        //START inline expansion of $get_level(a(5))
        if (! a5.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(4),a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_$0024predicate_property_4'),y(1),a(6))
        a6 =  S( FUNCTOR_$0024predicate_property_4 , a4, a1, a2, a3);
 ;
        return //
 Op("ccall", FILE_system::PRED_ccall_1_static_exec, VA(a6), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a5), cont));
    }

    private final static Operation set_predicate_property_4_2(Prolog m) { 
    // set_predicate_property(A,B,C,D):-assertz_if_new('$predicate_property'(defined,A,B,C)),assertz_if_new('$predicate_property'(D,A,B,C))
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // set_predicate_property(A,B,C,D):-[assertz_if_new('$predicate_property'(defined,A,B,C)),assertz_if_new('$predicate_property'(D,A,B,C))]
    // put_str_args([@('ATOM_defined'),a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_$0024predicate_property_4'),y(1),a(5))
        a5 =  S( FUNCTOR_$0024predicate_property_4 ,  ATOM_defined , a1, a2, a3);
 ;
    // put_str_args([a(4),a(1),a(2),a(3)],y(2)),put_str(@('FUNCTOR_$0024predicate_property_4'),y(2),a(6))
        a6 =  S( FUNCTOR_$0024predicate_property_4 , a4, a1, a2, a3);
 ;
        return //
 Op("assertz_if_new", FILE_system::PRED_assertz_if_new_1_static_exec, VA(a5), //
 Op("assertz_if_new", FILE_system::PRED_assertz_if_new_1_static_exec, VA(a6), cont));
    }
/** PREDICATE: (multifile)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main((multifile)/1,public)
        final static Functor ATOM_multifile = SYM("multifile");




    public static Operation PRED_multifile_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // multifile A:-set_predicate_property(A,multifile)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // multifile A:-[set_predicate_property(A,multifile)]
        return //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a1,  ATOM_multifile ), cont);
    }
/** PREDICATE: (discontiguous)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main((discontiguous)/1,public)
        final static Functor ATOM_discontiguous = SYM("discontiguous");




    public static Operation PRED_discontiguous_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // discontiguous A:-set_predicate_property(A,discontiguous)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // discontiguous A:-[set_predicate_property(A,discontiguous)]
        return //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a1,  ATOM_discontiguous ), cont);
    }
/** PREDICATE: (module_transparent)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main((module_transparent)/1,public)
        final static Functor ATOM_transparent = SYM("transparent");




    public static Operation PRED_module_transparent_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // module_transparent A:-set_predicate_property(A,transparent)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // module_transparent A:-[set_predicate_property(A,transparent)]
        return //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a1,  ATOM_transparent ), cont);
    }
/** PREDICATE: (meta_predicate)/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main((meta_predicate)/1,public)




    public static Operation PRED_meta_predicate_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // meta_predicate A:-set_predicate_property(A,meta_predicate)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // meta_predicate A:-[set_predicate_property(A,meta_predicate)]
        return //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a1,  ATOM_meta_predicate ), cont);
    }
/** PREDICATE: $dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-call(A),!,true
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-['$get_level'(B),call('SxxMachine':A),'$cut'(B)]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a3), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), cont));
    }

    private final static Operation $dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-fail
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: ignore/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(ignore/1,public)




    public static Operation PRED_ignore_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::ignore_1_sub_1);
        return ignore_1_1(m);
    }

    private final static Operation ignore_1_sub_1(Prolog m) { 
        m.trust(null);
        return ignore_1_2(m);
    }

    private final static Operation ignore_1_1(Prolog m) { 
    // ignore(A):-'$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ignore(A):-['$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A)]
        return //
 Op("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a1), cont);
    }

    private final static Operation ignore_1_2(Prolog m) { 
    // ignore(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // ignore(A):-[]
        return cont;
    }
/** PREDICATE: variant/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(variant/2,public)




    public static Operation PRED_variant_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // variant(A,B):-'$term_variant'(A,B)
        m.setB0();
         Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
    // variant(A,B):-['$term_variant'(A,B)]
        return //
 Op("$term_variant", FILE_system::PRED_$term_variant_2_static_exec, VA(a1, a2), cont);
    }
/** PREDICATE: $dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/2,non-(public))
        final static Functor FUNCTOR_$0024current_typein_module_1 = F("$current_typein_module",1);




    public static Operation PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_1(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_2(m);
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-'$current_typein_module'(B),!,A=B
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-['$get_level'(C),call('SxxMachine':'$current_typein_module'(B)),'$cut'(C),'$unify'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_$0024current_typein_module_1'),y(1),a(4))
        a4 =  S( FUNCTOR_$0024current_typein_module_1 , a2);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a5), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a1, a2), cont)));
    }

    private final static Operation $dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog m) { 
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: typein_module/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(typein_module/1,public)




    public static Operation PRED_typein_module_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::typein_module_1_sub_1);
        return typein_module_1_1(m);
    }

    private final static Operation typein_module_1_sub_1(Prolog m) { 
        m.trust(null);
        return typein_module_1_2(m);
    }

    private final static Operation typein_module_1_1(Prolog m) { 
    // typein_module(A):-'$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // typein_module(A):-['$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B)]
        return //
 Op("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }

    private final static Operation typein_module_1_2(Prolog m) { 
    // typein_module(A):-A='SxxMachine'
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // typein_module(A):-['$unify'(A,'SxxMachine')]
        //START inline expansion of $unify(a(1),@(ATOM_SxxMachine))
        if (! a1.unify(ATOM_SxxMachine, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/2,non-(public))
        final static Functor FUNCTOR_$0024current_source_module_1 = F("$current_source_module",1);




    public static Operation PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1);
        return $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_1(m);
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_2(m);
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog m) { 
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-'$current_source_module'(B),!,A=B
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-['$get_level'(C),call('SxxMachine':'$current_source_module'(B)),'$cut'(C),'$unify'(A,B)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(2)],y(1)),put_str(@('FUNCTOR_$0024current_source_module_1'),y(1),a(4))
        a4 =  S( FUNCTOR_$0024current_source_module_1 , a2);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(4)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a4);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a5), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a1, a2), cont)));
    }

    private final static Operation $dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog m) { 
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: source_module/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(source_module/1,public)




    public static Operation PRED_source_module_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::source_module_1_sub_1);
        return source_module_1_1(m);
    }

    private final static Operation source_module_1_sub_1(Prolog m) { 
        m.trust(null);
        return source_module_1_2(m);
    }

    private final static Operation source_module_1_1(Prolog m) { 
    // source_module(A):-'$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // source_module(A):-['$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B)]
        return //
 Op("$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }

    private final static Operation source_module_1_2(Prolog m) { 
    // source_module(A):-A='SxxMachine'
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // source_module(A):-['$unify'(A,'SxxMachine')]
        //START inline expansion of $unify(a(1),@(ATOM_SxxMachine))
        if (! a1.unify(ATOM_SxxMachine, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: $dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/1,non-(public))
        final static Functor FUNCTOR_$0024current_context_module_1 = F("$current_context_module",1);




    public static Operation PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-'$current_context_module'(A)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-[call('SxxMachine':'$current_context_module'(A))]
    // put_str_args([a(1)],y(1)),put_str(@('FUNCTOR_$0024current_context_module_1'),y(1),a(2))
        a2 =  S( FUNCTOR_$0024current_context_module_1 , a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(3))
        a3 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a3), cont);
    }

    private final static Operation $dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-typein_module(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-[typein_module(A)]
        return //
 Op("typein_module", FILE_system::PRED_typein_module_1_static_exec, VA(a1), cont);
    }
/** PREDICATE: $dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/2,non-(public))




    public static Operation PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1);
        return $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_1(m);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_2(m);
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_1(Prolog m) { 
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-'$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(B),!,B=A
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-['$get_level'(C),'$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(B),'$cut'(C),'$unify'(B,A)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a2), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a2, a1), cont)));
    }

    private final static Operation $dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_2(Prolog m) { 
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-fail
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B):-[fail]
        //START inline expansion of fail
        return m.fail();
        //END inline expansion
    }
/** PREDICATE: context_module/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(context_module/1,public)




    public static Operation PRED_context_module_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // context_module(A):-'$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // context_module(A):-['$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B)]
        return //
 Op("$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec, VA(a1, m.DONT_CARE2()), cont);
    }
/** PREDICATE: current_predicate/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(current_predicate/1,public)




    public static Operation PRED_current_predicate_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // current_predicate(A):-strip_module(A,B,C/D),current_predicate_m_f_a(B,C,D)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1;
        a1 = LARG[0];
    // current_predicate(A):-[strip_module(A,B,C/D),current_predicate_m_f_a(B,C,D)]
        a2 = m.mkvar1();
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002F_2 , a3, a4);
 ;
        return //
 Op("strip_module", FILE_system::PRED_strip_module_3_static_exec, VA(a1, a2, a5), //
 Op("current_predicate_m_f_a", FILE_system::PRED_current_predicate_m_f_a_3_static_exec, VA(a2, a3, a4), cont));
    }
/** PREDICATE: current_predicate_m_f_a/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(current_predicate_m_f_a/3,non-(public))




    public static Operation PRED_current_predicate_m_f_a_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // current_predicate_m_f_a(A,B,C):-ccall('$predicate_property'(defined,A,B,C))
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // current_predicate_m_f_a(A,B,C):-[ccall('$predicate_property'(defined,A,B,C))]
    // put_str_args([@('ATOM_defined'),a(1),a(2),a(3)],y(1)),put_str(@('FUNCTOR_$0024predicate_property_4'),y(1),a(4))
        a4 =  S( FUNCTOR_$0024predicate_property_4 ,  ATOM_defined , a1, a2, a3);
 ;
        return //
 Op("ccall", FILE_system::PRED_ccall_1_static_exec, VA(a4), cont);
    }
/** PREDICATE: current_predicate/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(current_predicate/2,public)




    public static Operation PRED_current_predicate_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // current_predicate(A,B):-predicate_property(B,C),strip_module(B,D,E),functor(E,F,G),strip_module(A,D,F)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
    // current_predicate(A,B):-[predicate_property(B,C),strip_module(B,D,E),functor(E,F,G),strip_module(A,D,F)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        return //
 Op("predicate_property", FILE_system::PRED_predicate_property_2_static_exec, VA(a2, m.DONT_CARE2()), //
 Op("strip_module", FILE_system::PRED_strip_module_3_static_exec, VA(a2, a3, a4), //
 Op("functor", FILE_system::PRED_functor_3_static_exec, VA(a4, a5, m.DONT_CARE2()), //
 Op("strip_module", FILE_system::PRED_strip_module_3_static_exec, VA(a1, a3, a5), cont))));
    }
/** PREDICATE: predicate_property/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(predicate_property/2,public)
        final static Functor FUNCTOR_var_1 = F("var",1);
        final static Functor FUNCTOR_ccall_1 = F("ccall",1);
        final static Functor FUNCTOR_functor_3 = F("functor",3);




    public static Operation PRED_predicate_property_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // predicate_property(A,B):-strip_module(A,C,D),reorder(var(D),ccall('$predicate_property'(B,C,E,F)),functor(D,E,F))
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1;
        a1 = LARG[0];
        a2 = LARG[1];
    // predicate_property(A,B):-[strip_module(A,C,D),reorder(var(D),ccall('$predicate_property'(B,C,E,F)),functor(D,E,F))]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
    // put_str_args([a(4)],y(1)),put_str(@('FUNCTOR_var_1'),y(1),a(5))
        a5 =  S( FUNCTOR_var_1 , a4);
 ;
        a6 = m.mkvar1();
        a7 = m.mkvar1();
    // put_str_args([a(2),a(3),a(6),a(7)],y(2)),put_str(@('FUNCTOR_$0024predicate_property_4'),y(2),a(8))
        a8 =  S( FUNCTOR_$0024predicate_property_4 , a2, a3, a6, a7);
 ;
    // put_str_args([a(8)],y(3)),put_str(@('FUNCTOR_ccall_1'),y(3),a(9))
        a9 =  S( FUNCTOR_ccall_1 , a8);
 ;
    // put_str_args([a(4),a(6),a(7)],y(4)),put_str(@('FUNCTOR_functor_3'),y(4),a(10))
        a10 =  S( FUNCTOR_functor_3 , a4, a6, a7);
 ;
        return //
 Op("strip_module", FILE_system::PRED_strip_module_3_static_exec, VA(a1, a3, a4), //
 Op("reorder", FILE_system::PRED_reorder_3_static_exec, VA(a5, a9, a10), cont));
    }
/** PREDICATE: strip_module/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(strip_module/3,non-(public))




    public static Operation PRED_strip_module_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::strip_module_3_var, FILE_swi_supp::strip_module_3_int, FILE_swi_supp::strip_module_3_int, FILE_swi_supp::strip_module_3_int, FILE_swi_supp::strip_module_3_var, FILE_swi_supp::strip_module_3_int); 
    }

    private final static Operation strip_module_3_var(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::strip_module_3_var_1);
        return strip_module_3_1(m);
    }

    private final static Operation strip_module_3_var_1(Prolog m) { 
        m.retry(null, FILE_swi_supp::strip_module_3_var_2);
        return strip_module_3_2(m);
    }

    private final static Operation strip_module_3_var_2(Prolog m) { 
        m.trust(null);
        return strip_module_3_3(m);
    }

    private final static Operation strip_module_3_int(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::strip_module_3_int_1);
        return strip_module_3_1(m);
    }

    private final static Operation strip_module_3_int_1(Prolog m) { 
        m.trust(null);
        return strip_module_3_3(m);
    }

    private final static Operation strip_module_3_1(Prolog m) { 
    // strip_module(A,B,A):-var(A),!,context_module(B)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // strip_module(A,B,A):-['$get_level'(C),var(A),'$cut'(C),context_module(B)]
        if (! a1.unify(a3, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return //
 Op("context_module", FILE_system::PRED_context_module_1_static_exec, VA(a2), cont);
    }

    private final static Operation strip_module_3_2(Prolog m) { 
    // strip_module(A:B,A,B):-!
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // strip_module(A:B,A,B):-['$neck_cut']
        a1 = a1.dref();
            a4 = m.mkvar2();
            a5 = m.mkvar2();
            if (!a1.unifyS( FUNCTOR_module_colon_2 , m.trail, a4, a5)){
                return m.fail();
            }
        if (! a4.unify(a2, m.trail))
            return m.fail();
        if (! a5.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation strip_module_3_3(Prolog m) { 
    // strip_module(A,B,A):-context_module(B)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // strip_module(A,B,A):-[context_module(B)]
        if (! a1.unify(a3, m.trail))
            return m.fail();
        return //
 Op("context_module", FILE_system::PRED_context_module_1_static_exec, VA(a2), cont);
    }
/** PREDICATE: $dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/4,non-(public))
        final static Functor ATOM_some = SYM("some");
        final static Functor FUNCTOR_sols_1 = F("sols",1);
    private static final Compound L_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_4_s8 = S( FUNCTOR_sols_1 ,  int_0 );




    public static Operation PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_swi_supp::$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_4_sub_1);
        return $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_4_1(m);
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_4_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_4_2(m);
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_4_1(Prolog m) { 
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B,C,D):-(call(A),nb_setarg(1,D,some)),call(B)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B,C,D):-[call('SxxMachine':A),nb_setarg(1,D,some),call('SxxMachine':B)]
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
    // put_str_args([@('ATOM_SxxMachine'),a(2)],y(2)),put_str(@('FUNCTOR_module_colon_2'),y(2),a(6))
        a6 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a2);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a5), //
 Op("nb_setarg", sxxtensions::PRED_nb_setarg_3_static_exec, VA( int_1 , a4,  ATOM_some ), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a6), cont)));
    }

    private final static Operation $dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_4_2(Prolog m) { 
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B,C,D):-D=sols(0),call(C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // '$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B,C,D):-['$unify'(D,sols(0)),call('SxxMachine':C)]
        //START inline expansion of $unify(a(4),s(8))
        if (! a4.unify(L_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_4_s8, m.trail)) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([@('ATOM_SxxMachine'),a(3)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(5))
        a5 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a3);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a5), cont);
    }
/** PREDICATE: (*->)/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main((*->)/2,public)
        final static Functor FUNCTOR_or_2 = F(";",2);
    private static final Compound L_$002A$002D$003E_2_s5 = S( FUNCTOR_sols_1 ,  int_0 );




    public static Operation PRED_$002A$002D$003E_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // A*->B;C:-D=sols(0),'$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B,C,D)
        m.setB0();
         Term a1, a2, a3, a4, a5;
        a1 = LARG[0];
        a2 = LARG[1];
    // A*->B;C:-['$unify'(D,sols(0)),'$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A,B,C,D)]
        a2 = a2.dref();
            a3 = m.mkvar2();
            a4 = m.mkvar2();
            if (!a2.unifyS( FUNCTOR_or_2 , m.trail, a3, a4)){
                return m.fail();
            }
        a5 = m.mkvar1();
        //START inline expansion of $unify(a(5),s(5))
        if (! a5.unify(L_$002A$002D$003E_2_s5, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_4_static_exec, VA(a1, a3, a4, a5), cont);
    }
/** PREDICATE: maplist/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(maplist/2,public)




    public static Operation PRED_maplist_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_swi_supp::maplist_2_sub_1);
        return maplist_2_1(m);
    }

    private final static Operation maplist_2_sub_1(Prolog m) { 
        m.trust(null);
        return maplist_2_2(m);
    }

    private final static Operation maplist_2_1(Prolog m) { 
    // maplist(A,[B|C]):-!,call(A,B),maplist(A,C)
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // maplist(A,[B|C]):-['$neck_cut',call(A,B),maplist(A,C)]
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
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("call", FILE_system::PRED_call_2_static_exec, VA(a1, a3), //
 Op("maplist", FILE_system::PRED_maplist_2_static_exec, VA(a1, a4), cont));
    }

    private final static Operation maplist_2_2(Prolog m) { 
    // maplist(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // maplist(A,B):-[]
        return cont;
    }
/** PREDICATE: maplist/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(maplist/3,public)




    public static Operation PRED_maplist_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry3(null, FILE_swi_supp::maplist_3_sub_1);
        return maplist_3_1(m);
    }

    private final static Operation maplist_3_sub_1(Prolog m) { 
        m.trust(null);
        return maplist_3_2(m);
    }

    private final static Operation maplist_3_1(Prolog m) { 
    // maplist(A,[B|C],[D|E]):-!,call(A,B,D),maplist(A,C,E)
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // maplist(A,[B|C],[D|E]):-['$neck_cut',call(A,B,D),maplist(A,C,E)]
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
                        a6 = a3.car();
            a7 = a3.cdr();
        } else if (a3.isVar()){
            a6 = m.mkvar2();
            a7 = m.mkvar2();
             a3.bind(CONS(a6, a7), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("call", FILE_system::PRED_call_3_static_exec, VA(a1, a4, a6), //
 Op("maplist", FILE_system::PRED_maplist_3_static_exec, VA(a1, a5, a7), cont));
    }

    private final static Operation maplist_3_2(Prolog m) { 
    // maplist(A,B,C):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // maplist(A,B,C):-[]
        return cont;
    }
/** PREDICATE: maplist/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(maplist/4,public)




    public static Operation PRED_maplist_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry4(null, FILE_swi_supp::maplist_4_sub_1);
        return maplist_4_1(m);
    }

    private final static Operation maplist_4_sub_1(Prolog m) { 
        m.trust(null);
        return maplist_4_2(m);
    }

    private final static Operation maplist_4_1(Prolog m) { 
    // maplist(A,[B|C],[D|E],[F|G]):-!,call(A,B,D,F),maplist(A,C,E,G)
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // maplist(A,[B|C],[D|E],[F|G]):-['$neck_cut',call(A,B,D,F),maplist(A,C,E,G)]
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
        a3 = a3.dref();
        if (a3 .isCons()){
                        a7 = a3.car();
            a8 = a3.cdr();
        } else if (a3.isVar()){
            a7 = m.mkvar2();
            a8 = m.mkvar2();
             a3.bind(CONS(a7, a8), m.trail);
        } else {
            return m.fail();
        }
        a4 = a4.dref();
        if (a4 .isCons()){
                        a9 = a4.car();
            a10 = a4.cdr();
        } else if (a4.isVar()){
            a9 = m.mkvar2();
            a10 = m.mkvar2();
             a4.bind(CONS(a9, a10), m.trail);
        } else {
            return m.fail();
        }
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return //
 Op("call", FILE_system::PRED_call_4_static_exec, VA(a1, a5, a7, a9), //
 Op("maplist", FILE_system::PRED_maplist_4_static_exec, VA(a1, a6, a8, a10), cont));
    }

    private final static Operation maplist_4_2(Prolog m) { 
    // maplist(A,B,C,D):-true
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        a4 = m.AREGS[3];
        cont = m.cont;
    // maplist(A,B,C,D):-[]
        return cont;
    }
/** PREDICATE: call/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(call/2,public)




    public static Operation PRED_call_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // call(A,B):-A=..[C|D],append(D,[B],E),F=..[C|E],call(F)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
    // call(A,B):-['$univ'(A,[C|D]),append(D,[B],E),'$univ'(F,[C|E]),call('SxxMachine':F)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = CONS(a3, a4);
        a6 = CONS(a2,  Prolog.Nil );
        a7 = m.mkvar1();
        a8 = m.mkvar1();
        a9 = CONS(a3, a7);
    // put_str_args([@('ATOM_SxxMachine'),a(8)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(10))
        a10 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a8);
 ;
        return //
 Op("$univ", FILE_system::PRED_$univ_2_static_exec, VA(a1, a5), //
 Op("append", FILE_system::PRED_append_3_static_exec, VA(a4, a6, a7), //
 Op("$univ", FILE_system::PRED_$univ_2_static_exec, VA(a8, a9), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a10), cont))));
    }
/** PREDICATE: call/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(call/3,public)




    public static Operation PRED_call_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // call(A,B,C):-A=..[D|E],append(E,[B,C],F),G=..[D|F],call(G)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // call(A,B,C):-['$univ'(A,[D|E]),append(E,[B,C],F),'$univ'(G,[D|F]),call('SxxMachine':G)]
        a4 = m.mkvar1();
        a5 = m.mkvar1();
        a6 = CONS(a4, a5);
        a7 = CONS(a3,  Prolog.Nil );
        a8 = CONS(a2, a7);
        a9 = m.mkvar1();
        a10 = m.mkvar1();
        a11 = CONS(a4, a9);
    // put_str_args([@('ATOM_SxxMachine'),a(10)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(12))
        a12 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a10);
 ;
        return //
 Op("$univ", FILE_system::PRED_$univ_2_static_exec, VA(a1, a6), //
 Op("append", FILE_system::PRED_append_3_static_exec, VA(a5, a8, a9), //
 Op("$univ", FILE_system::PRED_$univ_2_static_exec, VA(a10, a11), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a12), cont))));
    }
/** PREDICATE: call/4
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(call/4,public)




    public static Operation PRED_call_4_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // call(A,B,C,D):-A=..[E|F],append(F,[B,C,D],G),H=..[E|G],call(H)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
        a4 = LARG[3];
    // call(A,B,C,D):-['$univ'(A,[E|F]),append(F,[B,C,D],G),'$univ'(H,[E|G]),call('SxxMachine':H)]
        a5 = m.mkvar1();
        a6 = m.mkvar1();
        a7 = CONS(a5, a6);
        a8 = CONS(a4,  Prolog.Nil );
        a9 = CONS(a3, a8);
        a10 = CONS(a2, a9);
        a11 = m.mkvar1();
        a12 = m.mkvar1();
        a13 = CONS(a5, a11);
    // put_str_args([@('ATOM_SxxMachine'),a(12)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(14))
        a14 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a12);
 ;
        return //
 Op("$univ", FILE_system::PRED_$univ_2_static_exec, VA(a1, a7), //
 Op("append", FILE_system::PRED_append_3_static_exec, VA(a6, a10, a11), //
 Op("$univ", FILE_system::PRED_$univ_2_static_exec, VA(a12, a13), //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a14), cont))));
    }
/** PREDICATE: is_cons/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(is_cons/1,non-(public))




    public static Operation PRED_is_cons_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // is_cons(A):-compound(A),A=[B|C]
        m.setB0();
         Term a1, a2;
        Operation p1;
        a1 = LARG[0];
    // is_cons(A):-[compound(A),'$unify'(A,[B|C])]
        a2 = CONS(m.DONT_CARE1(), m.DONT_CARE1());
        return //
 Op("compound", FILE_system::PRED_compound_1_static_exec, VA(a1), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a1, a2), cont));
    }
/** PREDICATE: $dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-compound(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-['$get_level'(B),compound(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("compound", FILE_system::PRED_compound_1_static_exec, VA(a1), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: is_list/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(is_list/1,non-(public))




    public static Operation PRED_is_list_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return is_list_1_top(m);
    }

    private final static Operation is_list_1_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::is_list_1_var, FILE_swi_supp::is_list_1_1, FILE_swi_supp::is_list_1_1, FILE_swi_supp::is_list_1_1, FILE_swi_supp::is_list_1_1, FILE_swi_supp::is_list_1_var); 
    }

    private final static Operation is_list_1_var(Prolog m) { 
        m.jtry1(null, FILE_swi_supp::is_list_1_var_1);
        return is_list_1_1(m);
    }

    private final static Operation is_list_1_var_1(Prolog m) { 
        m.trust(null);
        return is_list_1_2(m);
    }

    private final static Operation is_list_1_1(Prolog m) { 
    // is_list(A):-'$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A),!,A==[]
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_list(A):-['$get_level'(B),'$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A),'$cut'(B),'$equality_of_term'(A,[])]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a1), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), //
 Op("$equality_of_term", FILE_system::PRED_$equality_of_term_2_static_exec, VA(a1,  Prolog.Nil ), cont)));
    }

    private final static Operation is_list_1_2(Prolog m) { 
    // is_list([A|B]):-is_list(B)
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // is_list([A|B]):-[is_list(B)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a2 = a1.cdr();
        } else if (a1.isVar()){
            a2 = m.mkvar2();
             a1.bind(CONS(m.DONTCARE("cons(a(1))"), a2), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a2;
m.cont = cont;
        return is_list_1_top(m);
    }
/** PREDICATE: member/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(member/2,non-(public))




    public static Operation PRED_member_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // member(A,[B|C]):-member_(C,A,B)
        m.setB0();
         Term a1, a2, a3, a4;
        a1 = LARG[0];
        a2 = LARG[1];
    // member(A,[B|C]):-[member_(C,A,B)]
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
        return //
 Op("member_", FILE_system::PRED_member__3_static_exec, VA(a4, a1, a3), cont);
    }
/** PREDICATE: member_/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(member_/3,non-(public))




    public static Operation PRED_member__3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return member__3_top(m);
    }

    private final static Operation member__3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::member__3_var, FILE_swi_supp::member__3_1, FILE_swi_supp::member__3_1, FILE_swi_supp::member__3_1, FILE_swi_supp::member__3_1, FILE_swi_supp::member__3_var); 
    }

    private final static Operation member__3_var(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::member__3_var_1);
        return member__3_1(m);
    }

    private final static Operation member__3_var_1(Prolog m) { 
        m.trust(null);
        return member__3_2(m);
    }

    private final static Operation member__3_1(Prolog m) { 
    // member_(A,B,B):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // member_(A,B,B):-[]
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation member__3_2(Prolog m) { 
    // member_([A|B],C,D):-member_(B,C,A)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // member_([A|B],C,D):-[member_(B,C,A)]
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
        m.AREGS[0] = a5;
        m.AREGS[1] = a2;
        m.AREGS[2] = a4;
m.cont = cont;
        return member__3_top(m);
    }
/** PREDICATE: append/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(append/3,non-(public))




    public static Operation PRED_append_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return append_3_top(m);
    }

    private final static Operation append_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::append_3_var, fail_0, fail_0, FILE_swi_supp::append_3_1, fail_0, FILE_swi_supp::append_3_2); 
    }

    private final static Operation append_3_var(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::append_3_var_1);
        return append_3_1(m);
    }

    private final static Operation append_3_var_1(Prolog m) { 
        m.trust(null);
        return append_3_2(m);
    }

    private final static Operation append_3_1(Prolog m) { 
    // append([],A,A):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // append([],A,A):-[]
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation append_3_2(Prolog m) { 
    // append([A|B],C,[A|D]):-append(B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // append([A|B],C,[A|D]):-[append(B,C,D)]
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
        return append_3_top(m);
    }
/** PREDICATE: flatten/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(flatten/2,non-(public))




    public static Operation PRED_flatten_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // flatten(A,B):-flatten(A,[],C),!,B=C
        m.setB0();
         Term a1, a2, a3, a4;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
    // flatten(A,B):-['$get_level'(C),flatten(A,[],D),'$cut'(C),'$unify'(B,D)]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a4 = m.mkvar1();
        return //
 Op("flatten", FILE_system::PRED_flatten_3_static_exec, VA(a1,  Prolog.Nil , a4), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a3), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a2, a4), cont)));
    }
/** PREDICATE: flatten/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(flatten/3,non-(public))




    public static Operation PRED_flatten_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return flatten_3_top(m);
    }

    private final static Operation flatten_3_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::flatten_3_var, FILE_swi_supp::flatten_3_int, FILE_swi_supp::flatten_3_int, FILE_swi_supp::flatten_3_con, FILE_swi_supp::flatten_3_int, FILE_swi_supp::flatten_3_lis); 
    }

    private final static Operation flatten_3_var(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::flatten_3_var_1);
        return flatten_3_1(m);
    }

    private final static Operation flatten_3_var_1(Prolog m) { 
        m.retry(null, FILE_swi_supp::flatten_3_var_2);
        return flatten_3_2(m);
    }

    private final static Operation flatten_3_var_2(Prolog m) { 
        m.retry(null, FILE_swi_supp::flatten_3_var_3);
        return flatten_3_3(m);
    }

    private final static Operation flatten_3_var_3(Prolog m) { 
        m.trust(null);
        return flatten_3_4(m);
    }

    private final static Operation flatten_3_int(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::flatten_3_int_1);
        return flatten_3_1(m);
    }

    private final static Operation flatten_3_int_1(Prolog m) { 
        m.trust(null);
        return flatten_3_4(m);
    }

    private final static Operation flatten_3_con(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::flatten_3_con_1);
        return flatten_3_1(m);
    }

    private final static Operation flatten_3_con_1(Prolog m) { 
        m.retry(null, FILE_swi_supp::flatten_3_con_2);
        return flatten_3_2(m);
    }

    private final static Operation flatten_3_con_2(Prolog m) { 
        m.trust(null);
        return flatten_3_4(m);
    }

    private final static Operation flatten_3_lis(Prolog m) { 
        m.jtry3(null, FILE_swi_supp::flatten_3_lis_1);
        return flatten_3_1(m);
    }

    private final static Operation flatten_3_lis_1(Prolog m) { 
        m.retry(null, FILE_swi_supp::flatten_3_lis_2);
        return flatten_3_3(m);
    }

    private final static Operation flatten_3_lis_2(Prolog m) { 
        m.trust(null);
        return flatten_3_4(m);
    }

    private final static Operation flatten_3_1(Prolog m) { 
    // flatten(A,B,[A|B]):-var(A),!
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // flatten(A,B,[A|B]):-['$get_level'(C),var(A),'$cut'(C)]
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a1.unify(a3.car(), m.trail))
                return m.fail();
            if (! a2.unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
             a3.bind(CONS(a1, a2), m.trail);
        } else {
            return m.fail();
        }
        a4 = m.mkvar1();
        //START inline expansion of $get_level(a(4))
        if (! a4.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dref();
        if (! (a1 .isVariable())) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dref();
                  m.cut( a4.intValue());
        //END inline expansion
        return cont;
    }

    private final static Operation flatten_3_2(Prolog m) { 
    // flatten([],A,A):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // flatten([],A,A):-['$neck_cut']
        if (!  Prolog.Nil .unify(a1, m.trail))
            return m.fail();
        if (! a2.unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation flatten_3_3(Prolog m) { 
    // flatten([A|B],C,D):-!,flatten(A,E,D),flatten(B,C,E)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // flatten([A|B],C,D):-['$neck_cut',flatten(A,E,D),flatten(B,C,E)]
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
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        a6 = m.mkvar1();
        p1 = //
 Op("flatten", FILE_system::PRED_flatten_3_static_exec, VA(a5, a2, a6), cont);
        m.AREGS[0] = a4;
        m.AREGS[1] = a6;
        m.AREGS[2] = a3;
        m.cont = p1;
        return flatten_3_top(m);
    }

    private final static Operation flatten_3_4(Prolog m) { 
    // flatten(A,B,[A|B]):-true
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // flatten(A,B,[A|B]):-[]
        a3 = a3.dref();
        if (a3 .isCons()){
                        if (! a1.unify(a3.car(), m.trail))
                return m.fail();
            if (! a2.unify(a3.cdr(), m.trail))
                return m.fail();
        } else if (a3.isVar()){
             a3.bind(CONS(a1, a2), m.trail);
        } else {
            return m.fail();
        }
        return cont;
    }
/** PREDICATE: printAll/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(printAll/1,non-(public))




    public static Operation PRED_printAll_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::printAll_1_sub_1);
        return printAll_1_1(m);
    }

    private final static Operation printAll_1_sub_1(Prolog m) { 
        m.trust(null);
        return printAll_1_2(m);
    }

    private final static Operation printAll_1_1(Prolog m) { 
    // printAll(A):-call(A),writeq(A),nl,fail
         Term a1, a2;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // printAll(A):-[call('SxxMachine':A),writeq(A),nl,fail]
    // put_str_args([@('ATOM_SxxMachine'),a(1)],y(1)),put_str(@('FUNCTOR_module_colon_2'),y(1),a(2))
        a2 =  S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , a1);
 ;
        return //
 Op("call", FILE_system::PRED_call_1_static_exec, VA(a2), //
 Op("writeq", FILE_system::PRED_writeq_1_static_exec, VA(a1), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), fail_0)));
    }

    private final static Operation printAll_1_2(Prolog m) { 
    // printAll(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // printAll(A):-[]
        return cont;
    }
/** PREDICATE: random/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(random/1,non-(public))
        final static Functor FUNCTOR_random_1 = F("random",1);
    private static final Compound L_random_1_s4 = S( FUNCTOR_random_1 ,  int_0 );




    public static Operation PRED_random_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // random(A):-A is random(0)
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // random(A):-[A is random(0)]
        //START inline expansion of a(1)is s(4)
        if (! a1.unify(Arithmetic.evaluate(L_random_1_s4), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }
/** PREDICATE: go/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(go/1,non-(public))
    private static final NumberTerm sf3 = Float(1.0);
        final static Functor FUNCTOR_$002B_2 = F("+",2);
        final static Functor FUNCTOR_frozen_2 = F("frozen",2);




    public static Operation PRED_go_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        return m.switch_on_term(FILE_swi_supp::go_1_var, FILE_swi_supp::go_1_var, fail_0, fail_0, fail_0, fail_0); 
    }

    private final static Operation go_1_var(Prolog m) { 
        m.jtry1(null, FILE_swi_supp::go_1_var_1);
        return go_1_1(m);
    }

    private final static Operation go_1_var_1(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_2);
        return go_1_2(m);
    }

    private final static Operation go_1_var_2(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_3);
        return go_1_3(m);
    }

    private final static Operation go_1_var_3(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_4);
        return go_1_4(m);
    }

    private final static Operation go_1_var_4(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_5);
        return go_1_5(m);
    }

    private final static Operation go_1_var_5(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_6);
        return go_1_6(m);
    }

    private final static Operation go_1_var_6(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_7);
        return go_1_7(m);
    }

    private final static Operation go_1_var_7(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_8);
        return go_1_8(m);
    }

    private final static Operation go_1_var_8(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_9);
        return go_1_9(m);
    }

    private final static Operation go_1_var_9(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_10);
        return go_1_10(m);
    }

    private final static Operation go_1_var_10(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_11);
        return go_1_11(m);
    }

    private final static Operation go_1_var_11(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_12);
        return go_1_12(m);
    }

    private final static Operation go_1_var_12(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_13);
        return go_1_13(m);
    }

    private final static Operation go_1_var_13(Prolog m) { 
        m.retry(null, FILE_swi_supp::go_1_var_14);
        return go_1_14(m);
    }

    private final static Operation go_1_var_14(Prolog m) { 
        m.trust(null);
        return go_1_15(m);
    }

    private final static Operation go_1_1(Prolog m) { 
    // go(1):-freeze(A,integer(A)),A=1
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(1):-[freeze(A,'SxxMachine':integer(A)),'$unify'(A,1)]
        if (!  int_1 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a2,  int_1 ), cont));
    }

    private final static Operation go_1_2(Prolog m) { 
    // go(2):-freeze(A,integer(A)),A\=1.0
         Term a1, a2, a3;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(2):-[freeze(A,'SxxMachine':integer(A)),'$not_unifiable'(A,1.0)]
        if (!  int_2 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("$not_unifiable", FILE_system::PRED_$not_unifiable_2_static_exec, VA(a2, sf3), cont));
    }

    private final static Operation go_1_3(Prolog m) { 
    // go(3):-'$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A),A=1.0
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(3):-['$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A),'$unify'(A,1.0)]
        if (!  int_3 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        return //
 Op("$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a2), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a2, sf3), cont));
    }

    private final static Operation go_1_4(Prolog m) { 
    // go(4):-'$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A),A=1.0
         Term a1, a2;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(4):-['$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A),'$unify'(A,1.0)]
        if (!  int_4 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        return //
 Op("$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a2), //
 Op("$unify", FILE_system::PRED_$unify_2_static_exec, VA(a2, sf3), cont));
    }

    private final static Operation go_1_5(Prolog m) { 
    // go(11):-freeze(A,integer(A)),freeze(B,integer(B)),copy_term(A+B,C+D),printAll(frozen(D,E))
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(11):-[freeze(A,'SxxMachine':integer(A)),freeze(B,'SxxMachine':integer(B)),copy_term(A+B,C+D),printAll(frozen(D,E))]
        if (!  int_11 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
        a5 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a4), null));
    // put_str_args([a(2),a(4)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a2, a4);
 ;
        a7 = m.mkvar1();
    // put_str_args([void,a(7)],y(2)),put_str(@('FUNCTOR_$002B_2'),y(2),a(8))
        a8 =  S( FUNCTOR_$002B_2 , m.mkvar3(), a7);
 ;
    // put_str_args([a(7),void],y(3)),put_str(@('FUNCTOR_frozen_2'),y(3),a(9))
        a9 =  S( FUNCTOR_frozen_2 , a7, m.mkvar3());
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a4, a5), //
 Op("copy_term", FILE_system::PRED_copy_term_2_static_exec, VA(a6, a8), //
 Op("printAll", FILE_system::PRED_printAll_1_static_exec, VA(a9), cont))));
    }

    private final static Operation go_1_6(Prolog m) { 
    // go(12):-freeze(A,integer(A)),printAll(frozen(A,B))
         Term a1, a2, a3, a4;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(12):-[freeze(A,'SxxMachine':integer(A)),printAll(frozen(A,B))]
        if (!  int_12 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
    // put_str_args([a(2),void],y(1)),put_str(@('FUNCTOR_frozen_2'),y(1),a(4))
        a4 =  S( FUNCTOR_frozen_2 , a2, m.mkvar3());
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("printAll", FILE_system::PRED_printAll_1_static_exec, VA(a4), cont));
    }

    private final static Operation go_1_7(Prolog m) { 
    // go(13):-freeze(A,integer(A)),copy_term(A,B),printAll(frozen(B,C))
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(13):-[freeze(A,'SxxMachine':integer(A)),copy_term(A,B),printAll(frozen(B,C))]
        if (!  int_13 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
    // put_str_args([a(4),void],y(1)),put_str(@('FUNCTOR_frozen_2'),y(1),a(5))
        a5 =  S( FUNCTOR_frozen_2 , a4, m.mkvar3());
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("copy_term", FILE_system::PRED_copy_term_2_static_exec, VA(a2, a4), //
 Op("printAll", FILE_system::PRED_printAll_1_static_exec, VA(a5), cont)));
    }

    private final static Operation go_1_8(Prolog m) { 
    // go(14):-freeze(A,integer(A)),copy_term_nat(A,B),printAll(frozen(B,C))
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(14):-[freeze(A,'SxxMachine':integer(A)),copy_term_nat(A,B),printAll(frozen(B,C))]
        if (!  int_14 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
    // put_str_args([a(4),void],y(1)),put_str(@('FUNCTOR_frozen_2'),y(1),a(5))
        a5 =  S( FUNCTOR_frozen_2 , a4, m.mkvar3());
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("copy_term_nat", sxxtensions::PRED_copy_term_nat_2_static_exec, VA(a2, a4), //
 Op("printAll", FILE_system::PRED_printAll_1_static_exec, VA(a5), cont)));
    }

    private final static Operation go_1_9(Prolog m) { 
    // go(15):-freeze(A,integer(A)),copy_term_att(A,B),printAll(frozen(B,C))
         Term a1, a2, a3, a4, a5;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(15):-[freeze(A,'SxxMachine':integer(A)),copy_term_att(A,B),printAll(frozen(B,C))]
        if (!  int_15 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
    // put_str_args([a(4),void],y(1)),put_str(@('FUNCTOR_frozen_2'),y(1),a(5))
        a5 =  S( FUNCTOR_frozen_2 , a4, m.mkvar3());
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("copy_term_att", sxxtensions::PRED_copy_term_att_2_static_exec, VA(a2, a4), //
 Op("printAll", FILE_system::PRED_printAll_1_static_exec, VA(a5), cont)));
    }

    private final static Operation go_1_10(Prolog m) { 
    // go(16):-freeze(A,integer(A)),copy_term_att(A,B),frozen(B,C),frozen(A,D)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(16):-[freeze(A,'SxxMachine':integer(A)),copy_term_att(A,B),frozen(B,C),frozen(A,D)]
        if (!  int_16 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("copy_term_att", sxxtensions::PRED_copy_term_att_2_static_exec, VA(a2, a4), //
 Op("frozen", sxxtensions::PRED_frozen_2_static_exec, VA(a4, m.DONT_CARE2()), //
 Op("frozen", sxxtensions::PRED_frozen_2_static_exec, VA(a2, m.DONT_CARE2()), cont))));
    }

    private final static Operation go_1_11(Prolog m) { 
    // go(17):-freeze(A,integer(A)),copy_term_nat(A,B),frozen(B,C),frozen(A,D)
         Term a1, a2, a3, a4;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(17):-[freeze(A,'SxxMachine':integer(A)),copy_term_nat(A,B),frozen(B,C),frozen(A,D)]
        if (!  int_17 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("copy_term_nat", sxxtensions::PRED_copy_term_nat_2_static_exec, VA(a2, a4), //
 Op("frozen", sxxtensions::PRED_frozen_2_static_exec, VA(a4, m.DONT_CARE2()), //
 Op("frozen", sxxtensions::PRED_frozen_2_static_exec, VA(a2, m.DONT_CARE2()), cont))));
    }

    private final static Operation go_1_12(Prolog m) { 
    // go(18):-random(A),write(A),nl,fail
         Term a1, a2;
        Operation p1, p2, p3;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(18):-[random(A),write(A),nl,fail]
        if (!  int_18 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        return //
 Op("random", FILE_system::PRED_random_1_static_exec, VA(a2), //
 Op("write", FILE_system::PRED_write_1_static_exec, VA(a2), //
 Op("nl", FILE_system::PRED_nl_0_static_exec, VA(), fail_0)));
    }

    private final static Operation go_1_13(Prolog m) { 
    // go(19):-peek_pending(A)
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(19):-[peek_pending(A)]
        if (!  int_19 .unify(a1, m.trail))
            return m.fail();
        return //
 Op("peek_pending", FILE_system::PRED_peek_pending_1_static_exec, VA(m.DONT_CARE2()), cont);
    }

    private final static Operation go_1_14(Prolog m) { 
    // go(20):-freeze(A,integer(A)),freeze(B,integer(B)),copy_term(A+B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(20):-[freeze(A,'SxxMachine':integer(A)),freeze(B,'SxxMachine':integer(B)),copy_term(A+B,C,D)]
        if (!  int_20 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
        a5 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a4), null));
    // put_str_args([a(2),a(4)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a2, a4);
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a4, a5), //
 Op("copy_term", sxxtensions::PRED_copy_term_3_static_exec, VA(a6, m.DONT_CARE2(), m.DONT_CARE2()), cont)));
    }

    private final static Operation go_1_15(Prolog m) { 
    // go(21):-freeze(A,integer(A)),freeze(B,integer(B)),copy_term(A+B,C,D)
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // go(21):-[freeze(A,'SxxMachine':integer(A)),freeze(B,'SxxMachine':integer(B)),copy_term(A+B,C,D)]
        if (!  int_21 .unify(a1, m.trail))
            return m.fail();
        a2 = m.mkvar1();
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a2), null));
        a4 = m.mkvar1();
        a5 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a4), null));
    // put_str_args([a(2),a(4)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a2, a4);
 ;
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a2, a3), //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a4, a5), //
 Op("copy_term", sxxtensions::PRED_copy_term_3_static_exec, VA(a6, m.DONT_CARE2(), m.DONT_CARE2()), cont)));
    }
/** PREDICATE: $dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-freeze(A,integer(A)),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-['$get_level'(B),freeze(A,'SxxMachine':integer(A)),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a1), null));
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a1, a3), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-'$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-['$get_level'(B),'$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a1), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-freeze(A,integer(A)),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-['$get_level'(B),freeze(A,'SxxMachine':integer(A)),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a3 = Closure( //
 Op("integer", FILE_system::PRED_integer_1_static_exec, VA(a1), null));
        return //
 Op("freeze", sxxtensions::PRED_freeze_2_static_exec, VA(a1, a3), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: $dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'/1,non-(public))




    public static Operation PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry1(null, FILE_swi_supp::$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1);
        return $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(m);
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(m);
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_1(Prolog m) { 
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-'$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A),!,fail
         Term a1, a2;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-['$get_level'(B),'$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A),'$cut'(B),fail]
        a2 = m.mkvar1();
        //START inline expansion of $get_level(a(2))
        if (! a2.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl", FILE_system::PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec, VA(a1), //
 Op("$cut", FILE_system::PRED_$cut_1_static_exec, VA(a2), fail_0));
    }

    private final static Operation $dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_2(Prolog m) { 
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-true
         Term a1;
        Operation cont;
        a1 = m.AREGS[0];
        cont = m.cont;
    // '$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl'(A):-[]
        return cont;
    }
/** PREDICATE: initpp/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main(initpp/0,non-(public))
        final static Functor FUNCTOR_is_cons_1 = F("is_cons",1);
        final static Functor ATOM_builtin = SYM("builtin");




    public static Operation PRED_initpp_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // initpp:-set_predicate_property(is_cons(A),builtin)
        m.setB0();
         Term a1;
    // initpp:-[set_predicate_property(is_cons(A),builtin)]
    // put_str_args([void],y(1)),put_str(@('FUNCTOR_is_cons_1'),y(1),a(1))
        a1 =  S( FUNCTOR_is_cons_1 , m.mkvar3());
 ;
        return //
 Op("set_predicate_property", FILE_system::PRED_set_predicate_property_2_static_exec, VA(a1,  ATOM_builtin ), cont);
    }
/** PREDICATE: $init/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl
*/
    // main('$init'/0,public)
        final static Functor ATOM_$0024predicate_property = SYM("$predicate_property");
    private static final Compound L_$init_0_s6 = S( FUNCTOR_$002F_2 ,  ATOM_$0024predicate_property ,  int_4 );
        final static Functor FUNCTOR_$003A$002D_2 = F(":-",2);
    private static final Compound L_$init_0_s11 = S( FUNCTOR_$0024current_typein_module_1 ,  ATOM_SxxMachine );
    private static final Compound L_$init_0_s14 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s11,  Prolog.True );
    private static final Compound L_$init_0_s16 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s14);
        final static Functor ATOM_$0024current_source_module = SYM("$current_source_module");
    private static final Compound L_$init_0_s20 = S( FUNCTOR_$002F_2 ,  ATOM_$0024current_source_module ,  int_1 );
    private static final Compound L_$init_0_s22 = S( FUNCTOR_$0024current_context_module_1 ,  ATOM_SxxMachine );
    private static final Compound L_$init_0_s24 = S( FUNCTOR_$003A$002D_2 , L_$init_0_s22,  Prolog.True );
    private static final Compound L_$init_0_s26 = S( FUNCTOR_module_colon_2 ,  ATOM_SxxMachine , L_$init_0_s24);




    public static Operation PRED_$init_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // '$init':-'$new_indexing_hash'('SxxMachine','$predicate_property'/4,A),assertz(('$current_typein_module'('SxxMachine'):-true)),'$new_indexing_hash'('SxxMachine','$current_source_module'/1,B),assertz(('$current_context_module'('SxxMachine'):-true))
        m.setB0();
        Operation p1, p2, p3;
    // '$init':-['$new_indexing_hash'('SxxMachine','$predicate_property'/4,A),assertz('SxxMachine':('$current_typein_module'('SxxMachine'):-true)),'$new_indexing_hash'('SxxMachine','$current_source_module'/1,B),assertz('SxxMachine':('$current_context_module'('SxxMachine'):-true))]
        return //
 Op("$new_indexing_hash", FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_SxxMachine , L_$init_0_s6, m.DONT_CARE2()), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s16), //
 Op("$new_indexing_hash", FILE_system::PRED_$new_indexing_hash_3_static_exec, VA( ATOM_SxxMachine , L_$init_0_s20, m.DONT_CARE2()), //
 Op("assertz", FILE_system::PRED_assertz_1_static_exec, VA(L_$init_0_s26), cont))));
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("package",1,FILE_swi_supp::PRED_package_1_static_exec);
   PredTable.registerBuiltin("$dummy_1_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_1_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",2,FILE_swi_supp::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec);
   PredTable.registerBuiltin("forall",2,FILE_swi_supp::PRED_forall_2_static_exec);
   PredTable.registerBuiltin("format",3,FILE_swi_supp::PRED_format_3_static_exec);
   PredTable.registerBuiltin("$dummy_2_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",3,FILE_swi_supp::PRED_$dummy_2_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_3_static_exec);
   PredTable.registerBuiltin("reorder",3,FILE_swi_supp::PRED_reorder_3_static_exec);
   PredTable.registerBuiltin("setup_call_cleanup",3,FILE_swi_supp::PRED_setup_call_cleanup_3_static_exec);
   PredTable.registerBuiltin("each_call_cleanup",3,FILE_swi_supp::PRED_each_call_cleanup_3_static_exec);
   PredTable.registerBuiltin("setup_call_catcher_cleanup",4,FILE_swi_supp::PRED_setup_call_catcher_cleanup_4_static_exec);
   PredTable.registerBuiltin("recorda",2,FILE_swi_supp::PRED_recorda_2_static_exec);
   PredTable.registerBuiltin("recordz",2,FILE_swi_supp::PRED_recordz_2_static_exec);
   PredTable.registerBuiltin("recorded",2,FILE_swi_supp::PRED_recorded_2_static_exec);
   PredTable.registerBuiltin("throw_missing",1,FILE_swi_supp::PRED_throw_missing_1_static_exec);
   PredTable.registerBuiltin("instance",2,FILE_swi_supp::PRED_instance_2_static_exec);
   PredTable.registerBuiltin("flag",3,FILE_swi_supp::PRED_flag_3_static_exec);
   PredTable.registerBuiltin("source_location",2,FILE_swi_supp::PRED_source_location_2_static_exec);
   PredTable.registerBuiltin("set_predicate_property",2,FILE_swi_supp::PRED_set_predicate_property_2_static_exec);
   PredTable.registerBuiltin("ccall",1,FILE_swi_supp::PRED_ccall_1_static_exec);
   PredTable.registerBuiltin("$dummy_3_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_3_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("assertz_if_new",1,FILE_swi_supp::PRED_assertz_if_new_1_static_exec);
   PredTable.registerBuiltin("set_predicate_property",4,FILE_swi_supp::PRED_set_predicate_property_4_static_exec);
   PredTable.registerBuiltin("multifile",1,FILE_swi_supp::PRED_multifile_1_static_exec);
   PredTable.registerBuiltin("discontiguous",1,FILE_swi_supp::PRED_discontiguous_1_static_exec);
   PredTable.registerBuiltin("module_transparent",1,FILE_swi_supp::PRED_module_transparent_1_static_exec);
   PredTable.registerBuiltin("meta_predicate",1,FILE_swi_supp::PRED_meta_predicate_1_static_exec);
   PredTable.registerBuiltin("$dummy_4_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_4_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("ignore",1,FILE_swi_supp::PRED_ignore_1_static_exec);
   PredTable.registerBuiltin("variant",2,FILE_swi_supp::PRED_variant_2_static_exec);
   PredTable.registerBuiltin("$dummy_5_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",2,FILE_swi_supp::PRED_$dummy_5_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec);
   PredTable.registerBuiltin("typein_module",1,FILE_swi_supp::PRED_typein_module_1_static_exec);
   PredTable.registerBuiltin("$dummy_6_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",2,FILE_swi_supp::PRED_$dummy_6_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec);
   PredTable.registerBuiltin("source_module",1,FILE_swi_supp::PRED_source_module_1_static_exec);
   PredTable.registerBuiltin("$dummy_8_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_8_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_7_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",2,FILE_swi_supp::PRED_$dummy_7_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_2_static_exec);
   PredTable.registerBuiltin("context_module",1,FILE_swi_supp::PRED_context_module_1_static_exec);
   PredTable.registerBuiltin("current_predicate",1,FILE_swi_supp::PRED_current_predicate_1_static_exec);
   PredTable.registerBuiltin("current_predicate_m_f_a",3,FILE_swi_supp::PRED_current_predicate_m_f_a_3_static_exec);
   PredTable.registerBuiltin("current_predicate",2,FILE_swi_supp::PRED_current_predicate_2_static_exec);
   PredTable.registerBuiltin("predicate_property",2,FILE_swi_supp::PRED_predicate_property_2_static_exec);
   PredTable.registerBuiltin("strip_module",3,FILE_swi_supp::PRED_strip_module_3_static_exec);
   PredTable.registerBuiltin("$dummy_9_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",4,FILE_swi_supp::PRED_$dummy_9_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_4_static_exec);
   PredTable.registerBuiltin("*->","$002A$002D$003E",2,FILE_swi_supp::PRED_$002A$002D$003E_2_static_exec);
   PredTable.registerBuiltin("maplist",2,FILE_swi_supp::PRED_maplist_2_static_exec);
   PredTable.registerBuiltin("maplist",3,FILE_swi_supp::PRED_maplist_3_static_exec);
   PredTable.registerBuiltin("maplist",4,FILE_swi_supp::PRED_maplist_4_static_exec);
   PredTable.registerBuiltin("call",2,FILE_swi_supp::PRED_call_2_static_exec);
   PredTable.registerBuiltin("call",3,FILE_swi_supp::PRED_call_3_static_exec);
   PredTable.registerBuiltin("call",4,FILE_swi_supp::PRED_call_4_static_exec);
   PredTable.registerBuiltin("is_cons",1,FILE_swi_supp::PRED_is_cons_1_static_exec);
   PredTable.registerBuiltin("$dummy_10_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_10_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("is_list",1,FILE_swi_supp::PRED_is_list_1_static_exec);
   PredTable.registerBuiltin("member",2,FILE_swi_supp::PRED_member_2_static_exec);
   PredTable.registerBuiltin("member_",3,FILE_swi_supp::PRED_member__3_static_exec);
   PredTable.registerBuiltin("append",3,FILE_swi_supp::PRED_append_3_static_exec);
   PredTable.registerBuiltin("flatten",2,FILE_swi_supp::PRED_flatten_2_static_exec);
   PredTable.registerBuiltin("flatten",3,FILE_swi_supp::PRED_flatten_3_static_exec);
   PredTable.registerBuiltin("printAll",1,FILE_swi_supp::PRED_printAll_1_static_exec);
   PredTable.registerBuiltin("random",1,FILE_swi_supp::PRED_random_1_static_exec);
   PredTable.registerBuiltin("go",1,FILE_swi_supp::PRED_go_1_static_exec);
   PredTable.registerBuiltin("$dummy_12_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_12_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_11_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_11_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_14_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_14_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("$dummy_13_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen1/builtin/swi_supp.pl","$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl",1,FILE_swi_supp::PRED_$dummy_13_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen1$002Fbuiltin$002Fswi_supp$002Epl_1_static_exec);
   PredTable.registerBuiltin("initpp",0,FILE_swi_supp::PRED_initpp_0_static_exec);
   PredTable.registerBuiltin("$init",0,FILE_swi_supp::PRED_$init_0_static_exec);
}
}

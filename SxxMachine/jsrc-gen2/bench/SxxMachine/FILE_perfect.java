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
public class FILE_perfect extends FILE_system {
/** PREDICATE: top/0
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl
*/
    // main(top/0,public)
        final static NumberTerm int_100 = Integer(100);




    public static Operation PRED_top_0_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // top:-findall(A,perfect(100,A),B),ok(B)
        m.setB0();
         Term a1, a2, a3;
        Operation p1;
    // top:-[findall(A,'SxxMachine':perfect(100,A),B),ok(B)]
        a1 = m.mkvar1();
        a2 = Closure( //
 Op("perfect", FILE_perfect::PRED_perfect_2_static_exec, VA( int_100 , a1), null));
        a3 = m.mkvar1();
        return //
 Op("findall", FILE_perfect::PRED_findall_3_static_exec, VA(a1, a2, a3), //
 Op("ok", FILE_perfect::PRED_ok_1_static_exec, VA(a3), cont));
    }
/** PREDICATE: ok/1
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl
*/
    // main(ok/1,public)
        final static NumberTerm int_3213876088517980551083924184681057554444177758164088967397376 = Long("3213876088517980551083924184681057554444177758164088967397376");
        final static NumberTerm int_12554203470773361527671578846336104669690446551334525075456 = Long("12554203470773361527671578846336104669690446551334525075456");
        final static NumberTerm int_191561942608236107294793378084303638130997321548169216 = Long("191561942608236107294793378084303638130997321548169216");
        final static NumberTerm int_46768052394588893382517909811217778170473142550528 = Long("46768052394588893382517909811217778170473142550528");
        final static NumberTerm int_182687704666362864775460301858080473799697891328 = Long("182687704666362864775460301858080473799697891328");
        final static NumberTerm int_44601490397061246283066714178813853366747136 = Long("44601490397061246283066714178813853366747136");
        final static NumberTerm int_2787593149816327892690784192460327776944128 = Long("2787593149816327892690784192460327776944128");
        final static NumberTerm int_10889035741470030830754200461521744560128 = Long("10889035741470030830754200461521744560128");
        final static NumberTerm int_2658455991569831744654692615953842176 = Long("2658455991569831744654692615953842176");
        final static NumberTerm int_166153499473114483824745506383331328 = Long("166153499473114483824745506383331328");
        final static NumberTerm int_40564819207303336344294875201536 = Long("40564819207303336344294875201536");
        final static NumberTerm int_9903520314282971830448816128 = Long("9903520314282971830448816128");
        final static NumberTerm int_38685626227663735544086528 = Long("38685626227663735544086528");
        final static NumberTerm int_2417851639228158837784576 = Long("2417851639228158837784576");
        final static NumberTerm int_9444732965670570950656 = Long("9444732965670570950656");
        final static NumberTerm int_2305843008139952128 = Long(2305843008139952128L);
        final static NumberTerm int_144115187807420416 = Long(144115187807420416L);
        final static NumberTerm int_35184367894528 = Long(35184367894528L);
        final static NumberTerm int_137438691328 = Long(137438691328L);
        final static NumberTerm int_8589869056 = Long(8589869056L);
        final static NumberTerm int_33550336 = Integer(33550336);
        final static NumberTerm int_2096128 = Integer(2096128);
        final static NumberTerm int_8128 = Integer(8128);
        final static NumberTerm int_496 = Integer(496);
        final static NumberTerm int_28 = Integer(28);
    private static final Compound L_ok_1_s28 = CONS( int_6 ,  Prolog.Nil );
    private static final Compound L_ok_1_s29 = CONS( int_28 , L_ok_1_s28);
    private static final Compound L_ok_1_s30 = CONS( int_496 , L_ok_1_s29);
    private static final Compound L_ok_1_s31 = CONS( int_8128 , L_ok_1_s30);
    private static final Compound L_ok_1_s32 = CONS( int_2096128 , L_ok_1_s31);
    private static final Compound L_ok_1_s33 = CONS( int_33550336 , L_ok_1_s32);
    private static final Compound L_ok_1_s34 = CONS( int_8589869056 , L_ok_1_s33);
    private static final Compound L_ok_1_s35 = CONS( int_137438691328 , L_ok_1_s34);
    private static final Compound L_ok_1_s36 = CONS( int_35184367894528 , L_ok_1_s35);
    private static final Compound L_ok_1_s37 = CONS( int_144115187807420416 , L_ok_1_s36);
    private static final Compound L_ok_1_s38 = CONS( int_2305843008139952128 , L_ok_1_s37);
    private static final Compound L_ok_1_s39 = CONS( int_9444732965670570950656 , L_ok_1_s38);
    private static final Compound L_ok_1_s40 = CONS( int_2417851639228158837784576 , L_ok_1_s39);
    private static final Compound L_ok_1_s41 = CONS( int_38685626227663735544086528 , L_ok_1_s40);
    private static final Compound L_ok_1_s42 = CONS( int_9903520314282971830448816128 , L_ok_1_s41);
    private static final Compound L_ok_1_s43 = CONS( int_40564819207303336344294875201536 , L_ok_1_s42);
    private static final Compound L_ok_1_s44 = CONS( int_166153499473114483824745506383331328 , L_ok_1_s43);
    private static final Compound L_ok_1_s45 = CONS( int_2658455991569831744654692615953842176 , L_ok_1_s44);
    private static final Compound L_ok_1_s46 = CONS( int_10889035741470030830754200461521744560128 , L_ok_1_s45);
    private static final Compound L_ok_1_s47 = CONS( int_2787593149816327892690784192460327776944128 , L_ok_1_s46);
    private static final Compound L_ok_1_s48 = CONS( int_44601490397061246283066714178813853366747136 , L_ok_1_s47);
    private static final Compound L_ok_1_s49 = CONS( int_182687704666362864775460301858080473799697891328 , L_ok_1_s48);
    private static final Compound L_ok_1_s50 = CONS( int_46768052394588893382517909811217778170473142550528 , L_ok_1_s49);
    private static final Compound L_ok_1_s51 = CONS( int_191561942608236107294793378084303638130997321548169216 , L_ok_1_s50);
    private static final Compound L_ok_1_s52 = CONS( int_12554203470773361527671578846336104669690446551334525075456 , L_ok_1_s51);
    private static final Compound L_ok_1_s53 = CONS( int_3213876088517980551083924184681057554444177758164088967397376 , L_ok_1_s52);




    public static Operation PRED_ok_1_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // ok([3213876088517980551083924184681057554444177758164088967397376,12554203470773361527671578846336104669690446551334525075456,191561942608236107294793378084303638130997321548169216,46768052394588893382517909811217778170473142550528,182687704666362864775460301858080473799697891328,44601490397061246283066714178813853366747136,2787593149816327892690784192460327776944128,10889035741470030830754200461521744560128,2658455991569831744654692615953842176,166153499473114483824745506383331328,40564819207303336344294875201536,9903520314282971830448816128,38685626227663735544086528,2417851639228158837784576,9444732965670570950656,2305843008139952128,144115187807420416,35184367894528,137438691328,8589869056,33550336,2096128,8128,496,28,6]):-true
        m.setB0();
         Term a1;
        a1 = LARG[0];
    // ok([3213876088517980551083924184681057554444177758164088967397376,12554203470773361527671578846336104669690446551334525075456,191561942608236107294793378084303638130997321548169216,46768052394588893382517909811217778170473142550528,182687704666362864775460301858080473799697891328,44601490397061246283066714178813853366747136,2787593149816327892690784192460327776944128,10889035741470030830754200461521744560128,2658455991569831744654692615953842176,166153499473114483824745506383331328,40564819207303336344294875201536,9903520314282971830448816128,38685626227663735544086528,2417851639228158837784576,9444732965670570950656,2305843008139952128,144115187807420416,35184367894528,137438691328,8589869056,33550336,2096128,8128,496,28,6]):-[]
        if (! L_ok_1_s53.unify(a1, m.trail))
            return m.fail();
        return cont;
    }
/** PREDICATE: divisible/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl
*/
    // main(divisible/2,public)
        final static Functor FUNCTOR_$002A_2 = F("*",2);
        final static Functor FUNCTOR_mod_2 = F("mod",2);
        final static Functor FUNCTOR_$002B_2 = F("+",2);




    public static Operation PRED_divisible_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return divisible_2_top(m);
    }

    private final static Operation divisible_2_top(Prolog m) { 
        m.setB0();
        m.jtry2(null, FILE_perfect::divisible_2_sub_1);
        return divisible_2_1(m);
    }

    private final static Operation divisible_2_sub_1(Prolog m) { 
        m.trust(null);
        return divisible_2_2(m);
    }

    private final static Operation divisible_2_1(Prolog m) { 
    // divisible(A,B):-C is B*B,C=<A,A mod B=:=0
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // divisible(A,B):-[C is B*B,'$less_or_equal'(C,A),D is A mod B,E is 0,'$arith_equal'(D,E)]
        a3 = m.mkvar1();
    // put_str_args([a(2),a(2)],y(1)),put_str(@('FUNCTOR_$002A_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$002A_2 , a2, a2);
 ;
        //START inline expansion of a(3)is a(4)
        if (! a3.unify(Arithmetic.evaluate(a4), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $less_or_equal(a(3),a(1))
        if (Arithmetic.evaluate(a3).arithCompareTo(Arithmetic.evaluate(a1)) > 0) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
    // put_str_args([a(1),a(2)],y(2)),put_str(@('FUNCTOR_mod_2'),y(2),a(6))
        a6 =  S( FUNCTOR_mod_2 , a1, a2);
 ;
        //START inline expansion of a(5)is a(6)
        if (! a5.unify(Arithmetic.evaluate(a6), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
        //START inline expansion of a(7)is@(int_0)
        if (! a7.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $arith_equal(a(5),a(7))
        if (Arithmetic.evaluate(a5).arithCompareTo(Arithmetic.evaluate(a7)) != 0) {
            return m.fail();
        }
        //END inline expansion
        return cont;
    }

    private final static Operation divisible_2_2(Prolog m) { 
    // divisible(A,B):-B<A,C is B+1,divisible(A,C)
         Term a1, a2, a3, a4;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // divisible(A,B):-['$less_than'(B,A),C is B+1,divisible(A,C)]
        //START inline expansion of $less_than(a(2),a(1))
        if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a1)) >= 0) {
            return m.fail();
        }
        //END inline expansion
        a3 = m.mkvar1();
    // put_str_args([a(2),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(4))
        a4 =  S( FUNCTOR_$002B_2 , a2,  int_1 );
 ;
        //START inline expansion of a(3)is a(4)
        if (! a3.unify(Arithmetic.evaluate(a4), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a1;
        m.AREGS[1] = a3;
m.cont = cont;
        return divisible_2_top(m);
    }
/** PREDICATE: $dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl
*/
    // main('$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl'/2,public)




    public static Operation PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fperfect$002Epl_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        m.setB0();
        m.jtry2(null, FILE_perfect::$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fperfect$002Epl_2_sub_1);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fperfect$002Epl_2_1(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fperfect$002Epl_2_sub_1(Prolog m) { 
        m.trust(null);
        return $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fperfect$002Epl_2_2(m);
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fperfect$002Epl_2_1(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl'(A,B):-divisible(A,B),!,fail
         Term a1, a2, a3;
        Operation p1, p2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl'(A,B):-['$get_level'(C),divisible(A,B),'$cut'(C),fail]
        a3 = m.mkvar1();
        //START inline expansion of $get_level(a(3))
        if (! a3.unifyInt(m.B0, m.trail)) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("divisible", FILE_perfect::PRED_divisible_2_static_exec, VA(a1, a2), //
 Op("$cut", FILE_perfect::PRED_$cut_1_static_exec, VA(a3), fail_0));
    }

    private final static Operation $dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fperfect$002Epl_2_2(Prolog m) { 
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl'(A,B):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // '$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl'(A,B):-[]
        return cont;
    }
/** PREDICATE: isprime/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl
*/
    // main(isprime/2,public)




    public static Operation PRED_isprime_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return isprime_2_top(m);
    }

    private final static Operation isprime_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_perfect::isprime_2_var, fail_0, fail_0, fail_0, fail_0, FILE_perfect::isprime_2_var); 
    }

    private final static Operation isprime_2_var(Prolog m) { 
        m.jtry2(null, FILE_perfect::isprime_2_var_1);
        return isprime_2_1(m);
    }

    private final static Operation isprime_2_var_1(Prolog m) { 
        m.trust(null);
        return isprime_2_2(m);
    }

    private final static Operation isprime_2_1(Prolog m) { 
    // isprime([A|B],A):-C is 2,A>1,'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl'(A,C)
         Term a1, a2, a3, a4, a5;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // isprime([A|B],A):-[C is 2,D is 1,'$greater_than'(A,D),'$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl'(A,C)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(a3, m.DONTCARE("cons(a(1))")), m.trail);
        } else {
            return m.fail();
        }
        if (! a3.unify(a2, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        //START inline expansion of a(4)is@(int_2)
        if (! a4.unify(Arithmetic.evaluate(int_2), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a5 = m.mkvar1();
        //START inline expansion of a(5)is@(int_1)
        if (! a5.unify(Arithmetic.evaluate(int_1), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_than(a(3),a(5))
        if (Arithmetic.evaluate(a3).arithCompareTo(Arithmetic.evaluate(a5)) <= 0) {
            return m.fail();
        }
        //END inline expansion
        return //
 Op("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl", FILE_perfect::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fperfect$002Epl_2_static_exec, VA(a3, a4), cont);
    }

    private final static Operation isprime_2_2(Prolog m) { 
    // isprime([A|B],C):-isprime(B,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // isprime([A|B],C):-[isprime(B,C)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.cdr();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(m.DONTCARE("cons(a(1))"), a3), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a3;
        m.AREGS[1] = a2;
m.cont = cont;
        return isprime_2_top(m);
    }
/** PREDICATE: power/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl
*/
    // main(power/3,public)
        final static Functor FUNCTOR_$002D_2 = F("-",2);




    public static Operation PRED_power_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return power_3_top(m);
    }

    private final static Operation power_3_top(Prolog m) { 
        m.setB0();
        m.jtry3(null, FILE_perfect::power_3_sub_1);
        return power_3_1(m);
    }

    private final static Operation power_3_sub_1(Prolog m) { 
        m.trust(null);
        return power_3_2(m);
    }

    private final static Operation power_3_1(Prolog m) { 
    // power(A,0,1):-!
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // power(A,0,1):-['$neck_cut']
        if (!  int_0 .unify(a2, m.trail))
            return m.fail();
        if (!  int_1 .unify(a3, m.trail))
            return m.fail();
        //START inline expansion of $neck_cut
        m.neckCut();
        //END inline expansion
        return cont;
    }

    private final static Operation power_3_2(Prolog m) { 
    // power(A,B,C):-D is B-1,power(A,D,E),C is E*A
         Term a1, a2, a3, a4, a5, a6, a7;
        Operation p1;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        a3 = m.AREGS[2];
        cont = m.cont;
    // power(A,B,C):-[D is B-1,power(A,D,E),C is E*A]
        a4 = m.mkvar1();
    // put_str_args([a(2),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(5))
        a5 =  S( FUNCTOR_$002D_2 , a2,  int_1 );
 ;
        //START inline expansion of a(4)is a(5)
        if (! a4.unify(Arithmetic.evaluate(a5), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a6 = m.mkvar1();
    // put_str_args([a(6),a(1)],y(2)),put_str(@('FUNCTOR_$002A_2'),y(2),a(7))
        a7 =  S( FUNCTOR_$002A_2 , a6, a1);
 ;
        p1 = //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a3, a7), cont);
        m.AREGS[0] = a1;
        m.AREGS[1] = a4;
        m.AREGS[2] = a6;
        m.cont = p1;
        return power_3_top(m);
    }
/** PREDICATE: calc/3
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl
*/
    // main(calc/3,public)




    public static Operation PRED_calc_3_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // calc(2,A,B):-power(2,A,C),D is C-1,power(2,A-1,E),B is D*E
        m.setB0();
         Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
        Operation p1, p2, p3;
        a1 = LARG[0];
        a2 = LARG[1];
        a3 = LARG[2];
    // calc(2,A,B):-[power(2,A,C),D is C-1,power(2,A-1,E),B is D*E]
        if (!  int_2 .unify(a1, m.trail))
            return m.fail();
        a4 = m.mkvar1();
        a5 = m.mkvar1();
    // put_str_args([a(4),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002D_2 , a4,  int_1 );
 ;
    // put_str_args([a(2),@(int_1)],y(2)),put_str(@('FUNCTOR_$002D_2'),y(2),a(7))
        a7 =  S( FUNCTOR_$002D_2 , a2,  int_1 );
 ;
        a8 = m.mkvar1();
    // put_str_args([a(5),a(8)],y(3)),put_str(@('FUNCTOR_$002A_2'),y(3),a(9))
        a9 =  S( FUNCTOR_$002A_2 , a5, a8);
 ;
        return //
 Op("power", FILE_perfect::PRED_power_3_static_exec, VA( int_2 , a2, a4), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a5, a6), //
 Op("power", FILE_perfect::PRED_power_3_static_exec, VA( int_2 , a7, a8), //
 Op("is", FILE_builtins::PRED_is_2_static_exec, VA(a3, a9), cont))));
    }
/** PREDICATE: listperf/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl
*/
    // main(listperf/2,public)




    public static Operation PRED_listperf_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return listperf_2_top(m);
    }

    private final static Operation listperf_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_perfect::listperf_2_var, fail_0, fail_0, fail_0, fail_0, FILE_perfect::listperf_2_var); 
    }

    private final static Operation listperf_2_var(Prolog m) { 
        m.jtry2(null, FILE_perfect::listperf_2_var_1);
        return listperf_2_1(m);
    }

    private final static Operation listperf_2_var_1(Prolog m) { 
        m.trust(null);
        return listperf_2_2(m);
    }

    private final static Operation listperf_2_1(Prolog m) { 
    // listperf([A|B],C):-calc(2,A,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // listperf([A|B],C):-[calc(2,A,C)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.car();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(a3, m.DONTCARE("cons(a(1))")), m.trail);
        } else {
            return m.fail();
        }
        return //
 Op("calc", FILE_perfect::PRED_calc_3_static_exec, VA( int_2 , a3, a2), cont);
    }

    private final static Operation listperf_2_2(Prolog m) { 
    // listperf([A|B],C):-listperf(B,C)
         Term a1, a2, a3;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // listperf([A|B],C):-[listperf(B,C)]
        a1 = a1.dref();
        if (a1 .isCons()){
                        a3 = a1.cdr();
        } else if (a1.isVar()){
            a3 = m.mkvar2();
             a1.bind(CONS(m.DONTCARE("cons(a(1))"), a3), m.trail);
        } else {
            return m.fail();
        }
        m.AREGS[0] = a3;
        m.AREGS[1] = a2;
m.cont = cont;
        return listperf_2_top(m);
    }
/** PREDICATE: generateList/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl
*/
    // main(generateList/2,public)




    public static Operation PRED_generateList_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
m.cont = cont;
        return generateList_2_top(m);
    }

    private final static Operation generateList_2_top(Prolog m) { 
        m.setB0();
        return m.switch_on_term(FILE_perfect::generateList_2_var, FILE_perfect::generateList_2_var, FILE_perfect::generateList_2_2, FILE_perfect::generateList_2_2, FILE_perfect::generateList_2_2, FILE_perfect::generateList_2_2); 
    }

    private final static Operation generateList_2_var(Prolog m) { 
        m.jtry2(null, FILE_perfect::generateList_2_var_1);
        return generateList_2_1(m);
    }

    private final static Operation generateList_2_var_1(Prolog m) { 
        m.trust(null);
        return generateList_2_2(m);
    }

    private final static Operation generateList_2_1(Prolog m) { 
    // generateList(0,[]):-true
         Term a1, a2;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // generateList(0,[]):-[]
        if (!  int_0 .unify(a1, m.trail))
            return m.fail();
        if (!  Prolog.Nil .unify(a2, m.trail))
            return m.fail();
        return cont;
    }

    private final static Operation generateList_2_2(Prolog m) { 
    // generateList(A,[B|C]):-A>0,B is A+1,D is A-1,generateList(D,C)
         Term a1, a2, a3, a4, a5, a6, a7, a8;
        Operation cont;
        a1 = m.AREGS[0];
        a2 = m.AREGS[1];
        cont = m.cont;
    // generateList(A,[B|C]):-[D is 0,'$greater_than'(A,D),B is A+1,E is A-1,generateList(E,C)]
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
        a5 = m.mkvar1();
        //START inline expansion of a(5)is@(int_0)
        if (! a5.unify(Arithmetic.evaluate(int_0), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        //START inline expansion of $greater_than(a(1),a(5))
        if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a5)) <= 0) {
            return m.fail();
        }
        //END inline expansion
    // put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
        a6 =  S( FUNCTOR_$002B_2 , a1,  int_1 );
 ;
        //START inline expansion of a(3)is a(6)
        if (! a3.unify(Arithmetic.evaluate(a6), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        a7 = m.mkvar1();
    // put_str_args([a(1),@(int_1)],y(2)),put_str(@('FUNCTOR_$002D_2'),y(2),a(8))
        a8 =  S( FUNCTOR_$002D_2 , a1,  int_1 );
 ;
        //START inline expansion of a(7)is a(8)
        if (! a7.unify(Arithmetic.evaluate(a8), m.trail)) {
            return m.fail();
        }
        //END inline expansion
        m.AREGS[0] = a7;
        m.AREGS[1] = a4;
m.cont = cont;
        return generateList_2_top(m);
    }
/** PREDICATE: perfect/2
from: /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl
*/
    // main(perfect/2,public)




    public static Operation PRED_perfect_2_static_exec(Prolog m) { 
        Operation cont = m.cont; Term[] LARG = m.AREGS; Operation thiz = m.pred;  
    // perfect(A,B):-generateList(A,C),findall(D,isprime(C,D),E),listperf(E,B)
        m.setB0();
         Term a1, a2, a3, a4, a5, a6;
        Operation p1, p2;
        a1 = LARG[0];
        a2 = LARG[1];
    // perfect(A,B):-[generateList(A,C),findall(D,'SxxMachine':isprime(C,D),E),listperf(E,B)]
        a3 = m.mkvar1();
        a4 = m.mkvar1();
        a5 = Closure( //
 Op("isprime", FILE_perfect::PRED_isprime_2_static_exec, VA(a3, a4), null));
        a6 = m.mkvar1();
        return //
 Op("generateList", FILE_perfect::PRED_generateList_2_static_exec, VA(a1, a3), //
 Op("findall", FILE_perfect::PRED_findall_3_static_exec, VA(a4, a5, a6), //
 Op("listperf", FILE_perfect::PRED_listperf_2_static_exec, VA(a6, a2), cont)));
    }
static { loadPreds(); }
static public void loadPreds() {
   PredTable.registerBuiltin("top",0,FILE_perfect::PRED_top_0_static_exec);
   PredTable.registerBuiltin("ok",1,FILE_perfect::PRED_ok_1_static_exec);
   PredTable.registerBuiltin("divisible",2,FILE_perfect::PRED_divisible_2_static_exec);
   PredTable.registerBuiltin("$dummy_0_/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/SxxMachine/jsrc-gen2/bench/perfect.pl","$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fperfect$002Epl",2,FILE_perfect::PRED_$dummy_0_$002Fmnt$002Fgggg$002Fopt$002FCYC_JRTL_with_CommonLisp$002FSxxMachine$002Fjsrc$002Dgen2$002Fbench$002Fperfect$002Epl_2_static_exec);
   PredTable.registerBuiltin("isprime",2,FILE_perfect::PRED_isprime_2_static_exec);
   PredTable.registerBuiltin("power",3,FILE_perfect::PRED_power_3_static_exec);
   PredTable.registerBuiltin("calc",3,FILE_perfect::PRED_calc_3_static_exec);
   PredTable.registerBuiltin("listperf",2,FILE_perfect::PRED_listperf_2_static_exec);
   PredTable.registerBuiltin("generateList",2,FILE_perfect::PRED_generateList_2_static_exec);
   PredTable.registerBuiltin("perfect",2,FILE_perfect::PRED_perfect_2_static_exec);
}
}

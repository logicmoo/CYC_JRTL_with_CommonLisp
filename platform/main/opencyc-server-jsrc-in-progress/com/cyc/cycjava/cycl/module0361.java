package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0361 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0361";
    public static final String myFingerPrint = "fbdf4c83b3701a7cbbd56ddc6620a2ee23836bb5a919acb2af05770042523304";
    public static SubLSymbol $g3113$;
    public static SubLSymbol $g3114$;
    private static SubLSymbol $g3115$;
    public static SubLSymbol $g3116$;
    private static SubLSymbol $g3117$;
    private static SubLSymbol $g3118$;
    private static SubLSymbol $g3119$;
    private static SubLSymbol $g3120$;
    private static SubLSymbol $g3121$;
    private static SubLSymbol $g3122$;
    private static SubLSymbol $g3123$;
    public static SubLSymbol $g3124$;
    private static SubLSymbol $g3125$;
    private static SubLSymbol $g3126$;
    private static SubLSymbol $g3127$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLInteger $ic23$;
    private static final SubLInteger $ic24$;
    private static final SubLInteger $ic25$;
    private static final SubLInteger $ic26$;
    private static final SubLInteger $ic27$;
    private static final SubLInteger $ic28$;
    private static final SubLInteger $ic29$;
    private static final SubLInteger $ic30$;
    private static final SubLInteger $ic31$;
    private static final SubLInteger $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLInteger $ic34$;
    private static final SubLInteger $ic35$;
    private static final SubLInteger $ic36$;
    private static final SubLInteger $ic37$;
    private static final SubLInteger $ic38$;
    private static final SubLInteger $ic39$;
    private static final SubLInteger $ic40$;
    private static final SubLInteger $ic41$;
    private static final SubLInteger $ic42$;
    private static final SubLInteger $ic43$;
    private static final SubLInteger $ic44$;
    private static final SubLInteger $ic45$;
    private static final SubLInteger $ic46$;
    private static final SubLInteger $ic47$;
    private static final SubLInteger $ic48$;
    private static final SubLInteger $ic49$;
    private static final SubLInteger $ic50$;
    private static final SubLInteger $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLString $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLString $ic205$;
    private static final SubLString $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLList $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLList $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLList $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLList $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLList $ic233$;
    private static final SubLList $ic234$;
    private static final SubLList $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLList $ic240$;
    private static final SubLList $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLList $ic248$;
    private static final SubLList $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLList $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLList $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLInteger $ic262$;
    private static final SubLInteger $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLString $ic266$;
    private static final SubLString $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLString $ic276$;
    private static final SubLString $ic277$;
    private static final SubLSymbol $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLSymbol $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLInteger $ic296$;
    private static final SubLSymbol $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLSymbol $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLSymbol $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLList $ic307$;
    private static final SubLString $ic308$;
    private static final SubLSymbol $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLString $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLInteger $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLList $ic319$;
    private static final SubLList $ic320$;
    private static final SubLList $ic321$;
    private static final SubLList $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLList $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLSymbol $ic327$;
    private static final SubLSymbol $ic328$;
    private static final SubLSymbol $ic329$;
    private static final SubLSymbol $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLSymbol $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLSymbol $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLList $ic339$;
    private static final SubLSymbol $ic340$;
    private static final SubLSymbol $ic341$;
    private static final SubLSymbol $ic342$;
    private static final SubLSymbol $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLSymbol $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLSymbol $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLString $ic349$;
    private static final SubLInteger $ic350$;
    
    public static SubLObject f23993() {
        return module0065.f4746($g3115$.getGlobalValue());
    }
    
    public static SubLObject f23994(final SubLObject var1, final SubLObject var2) {
        return module0065.f4753($g3115$.getGlobalValue(), var2, var1);
    }
    
    public static SubLObject f23995(final SubLObject var1) {
        final SubLObject var2 = f23996(var1);
        return module0065.f4761($g3115$.getGlobalValue(), var2);
    }
    
    public static SubLObject f23997(final SubLObject var2) {
        return module0065.f4750($g3115$.getGlobalValue(), var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23998() {
        return module0065.f4733($g3115$.getGlobalValue());
    }
    
    public static SubLObject f23999() {
        return module0065.f4734($g3115$.getGlobalValue());
    }
    
    public static SubLObject f24000() {
        final SubLObject var3 = f23999();
        SubLObject var4;
        SubLObject var5;
        SubLObject var6;
        for (var4 = (SubLObject)MINUS_ONE_INTEGER, var5 = (SubLObject)NIL, var5 = var3; !var5.numLE(var4); var5 = Numbers.add(var5, (SubLObject)MINUS_ONE_INTEGER)) {
            var6 = f23997(var5);
            if (NIL != var6) {
                return var6;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24001(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic1$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic1$);
        var11 = var9.first();
        var9 = var9.rest();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = var9;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15_16 = (SubLObject)NIL;
        while (NIL != var13) {
            cdestructuring_bind.destructuring_bind_must_consp(var13, var8, (SubLObject)$ic1$);
            var15_16 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var8, (SubLObject)$ic1$);
            if (NIL == conses_high.member(var15_16, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var14 = (SubLObject)T;
            }
            if (var15_16 == $ic3$) {
                var12 = var13.first();
            }
            var13 = var13.rest();
        }
        if (NIL != var14 && NIL == var12) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic1$);
        }
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var9 = (var17 = var10);
        final SubLObject var18 = (SubLObject)$ic5$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic6$, (SubLObject)ConsesLow.list(var18, var11, (SubLObject)$ic7$, (SubLObject)$ic4$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic8$, var18), ConsesLow.append(var17, (SubLObject)NIL));
    }
    
    public static SubLObject f24002() {
        return $g3115$.getGlobalValue();
    }
    
    public static SubLObject f24003() {
        return module0065.f4796($g3115$.getGlobalValue());
    }
    
    public static SubLObject f24004() {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)ZERO_INTEGER;
        SubLObject var23 = f24003();
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            SubLObject var25 = (SubLObject)NIL;
            try {
                var21.throwStack.push($ic11$);
                final SubLObject var26 = Errors.$error_handler$.currentBinding(var21);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic12$), var21);
                    try {
                        f24005(var24);
                        var22 = Numbers.add(var22, (SubLObject)ONE_INTEGER);
                    }
                    catch (Throwable var27) {
                        Errors.handleThrowable(var27, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var26, var21);
                }
            }
            catch (Throwable var28) {
                var25 = Errors.handleThrowable(var28, (SubLObject)$ic11$);
            }
            finally {
                var21.throwStack.pop();
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return var22;
    }
    
    public static SubLObject f24006(SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)FIVE_INTEGER;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert NIL != module0004.f106(var28) : var28;
        SubLObject var30 = (SubLObject)ZERO_INTEGER;
        SubLObject var31 = (SubLObject)ZERO_INTEGER;
        SubLObject var32 = Sort.sort(conses_high.copy_list(f24003()), (SubLObject)$ic14$, (SubLObject)$ic15$);
        SubLObject var33;
        for (var33 = (SubLObject)NIL, var33 = (SubLObject)ZERO_INTEGER; var33.numL(var28); var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER)) {
            if (NIL != module0035.f2013(var32)) {
                var32 = var32.rest();
                var30 = Numbers.add(var30, (SubLObject)ONE_INTEGER);
            }
        }
        SubLObject var34 = var32;
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            SubLObject var36 = (SubLObject)NIL;
            try {
                var29.throwStack.push($ic11$);
                final SubLObject var37 = Errors.$error_handler$.currentBinding(var29);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic12$), var29);
                    try {
                        f24005(var35);
                        var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER);
                    }
                    catch (Throwable var38) {
                        Errors.handleThrowable(var38, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var37, var29);
                }
            }
            catch (Throwable var39) {
                var36 = Errors.handleThrowable(var39, (SubLObject)$ic11$);
            }
            finally {
                var29.throwStack.pop();
            }
            var34 = var34.rest();
            var35 = var34.first();
        }
        return Values.values(var31, var30);
    }
    
    public static SubLObject f24007(final SubLObject var34, final SubLObject var35) {
        f24008(var34, var35, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24009(final SubLObject var34) {
        return (SubLObject)((var34.getClass() == $problem_store_native.class) ? T : NIL);
    }
    
    public static SubLObject f24010(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField2();
    }
    
    public static SubLObject f24011(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField3();
    }
    
    public static SubLObject f24012(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField4();
    }
    
    public static SubLObject f24013(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField5();
    }
    
    public static SubLObject f24014(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField6();
    }
    
    public static SubLObject f24015(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField7();
    }
    
    public static SubLObject f24016(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField8();
    }
    
    public static SubLObject f24017(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField9();
    }
    
    public static SubLObject f24018(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField10();
    }
    
    public static SubLObject f24019(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField11();
    }
    
    public static SubLObject f24020(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField12();
    }
    
    public static SubLObject f24021(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField13();
    }
    
    public static SubLObject f24022(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField14();
    }
    
    public static SubLObject f24023(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField15();
    }
    
    public static SubLObject f24024(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField16();
    }
    
    public static SubLObject f24025(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField17();
    }
    
    public static SubLObject f24026(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField18();
    }
    
    public static SubLObject f24027(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField19();
    }
    
    public static SubLObject f24028(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return var34.getField20();
    }
    
    public static SubLObject f24029(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$min_depth_index;
    }
    
    public static SubLObject f24030(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$equality_reasoning_method;
    }
    
    public static SubLObject f24031(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$equality_reasoning_domain;
    }
    
    public static SubLObject f24032(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$intermediate_step_validation_level;
    }
    
    public static SubLObject f24033(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$max_problem_count;
    }
    
    public static SubLObject f24034(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$crazy_max_problem_count;
    }
    
    public static SubLObject f24035(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$removal_allowedP;
    }
    
    public static SubLObject f24036(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$transformation_allowedP;
    }
    
    public static SubLObject f24037(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$add_restriction_layer_of_indirectionP;
    }
    
    public static SubLObject f24038(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$negation_by_failureP;
    }
    
    public static SubLObject f24039(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$completeness_minimization_allowedP;
    }
    
    public static SubLObject f24040(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$direction;
    }
    
    public static SubLObject f24041(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$evaluate_subl_allowedP;
    }
    
    public static SubLObject f24042(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$rewrite_allowedP;
    }
    
    public static SubLObject f24043(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$abduction_allowedP;
    }
    
    public static SubLObject f24044(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$new_terms_allowedP;
    }
    
    public static SubLObject f24045(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$compute_answer_justificationsP;
    }
    
    public static SubLObject f24046(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$memoization_state;
    }
    
    public static SubLObject f24047(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$sbhl_resource_space;
    }
    
    public static SubLObject f24048(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$preparedP;
    }
    
    public static SubLObject f24049(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$destruction_imminentP;
    }
    
    public static SubLObject f24050(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$meta_problem_store;
    }
    
    public static SubLObject f24051(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$static_properties;
    }
    
    public static SubLObject f24052(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$janitor;
    }
    
    public static SubLObject f24053(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$historical_root_problems;
    }
    
    public static SubLObject f24054(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$historical_tactic_count;
    }
    
    public static SubLObject f24055(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$complex_problem_query_czer_index;
    }
    
    public static SubLObject f24056(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$complex_problem_query_signatures;
    }
    
    public static SubLObject f24057(final SubLObject var34) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$proof_keeping_index;
    }
    
    public static SubLObject f24058(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField2(var37);
    }
    
    public static SubLObject f24059(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField3(var37);
    }
    
    public static SubLObject f24060(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField4(var37);
    }
    
    public static SubLObject f24061(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField5(var37);
    }
    
    public static SubLObject f24062(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField6(var37);
    }
    
    public static SubLObject f24063(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField7(var37);
    }
    
    public static SubLObject f24064(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField8(var37);
    }
    
    public static SubLObject f24065(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField9(var37);
    }
    
    public static SubLObject f24066(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField10(var37);
    }
    
    public static SubLObject f24067(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField11(var37);
    }
    
    public static SubLObject f24068(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField12(var37);
    }
    
    public static SubLObject f24069(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField13(var37);
    }
    
    public static SubLObject f24070(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField14(var37);
    }
    
    public static SubLObject f24071(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField15(var37);
    }
    
    public static SubLObject f24072(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField16(var37);
    }
    
    public static SubLObject f24073(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField17(var37);
    }
    
    public static SubLObject f24074(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField18(var37);
    }
    
    public static SubLObject f24075(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField19(var37);
    }
    
    public static SubLObject f24076(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return var34.setField20(var37);
    }
    
    public static SubLObject f24077(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$min_depth_index = var37;
    }
    
    public static SubLObject f24078(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$equality_reasoning_method = var37;
    }
    
    public static SubLObject f24079(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$equality_reasoning_domain = var37;
    }
    
    public static SubLObject f24080(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$intermediate_step_validation_level = var37;
    }
    
    public static SubLObject f24081(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$max_problem_count = var37;
    }
    
    public static SubLObject f24082(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$crazy_max_problem_count = var37;
    }
    
    public static SubLObject f24083(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$removal_allowedP = var37;
    }
    
    public static SubLObject f24084(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$transformation_allowedP = var37;
    }
    
    public static SubLObject f24085(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$add_restriction_layer_of_indirectionP = var37;
    }
    
    public static SubLObject f24086(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$negation_by_failureP = var37;
    }
    
    public static SubLObject f24087(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$completeness_minimization_allowedP = var37;
    }
    
    public static SubLObject f24088(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$direction = var37;
    }
    
    public static SubLObject f24089(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$evaluate_subl_allowedP = var37;
    }
    
    public static SubLObject f24090(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$rewrite_allowedP = var37;
    }
    
    public static SubLObject f24091(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$abduction_allowedP = var37;
    }
    
    public static SubLObject f24092(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$new_terms_allowedP = var37;
    }
    
    public static SubLObject f24093(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$compute_answer_justificationsP = var37;
    }
    
    public static SubLObject f24094(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$memoization_state = var37;
    }
    
    public static SubLObject f24095(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$sbhl_resource_space = var37;
    }
    
    public static SubLObject f24096(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$preparedP = var37;
    }
    
    public static SubLObject f24097(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$destruction_imminentP = var37;
    }
    
    public static SubLObject f24098(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$meta_problem_store = var37;
    }
    
    public static SubLObject f24099(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$static_properties = var37;
    }
    
    public static SubLObject f24100(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$janitor = var37;
    }
    
    public static SubLObject f24101(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$historical_root_problems = var37;
    }
    
    public static SubLObject f24102(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$historical_tactic_count = var37;
    }
    
    public static SubLObject f24103(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$complex_problem_query_czer_index = var37;
    }
    
    public static SubLObject f24104(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$complex_problem_query_signatures = var37;
    }
    
    public static SubLObject f24105(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24009(var34) : var34;
        return (($problem_store_native)var34).$proof_keeping_index = var37;
    }
    
    public static SubLObject f24106(SubLObject var38) {
        if (var38 == UNPROVIDED) {
            var38 = (SubLObject)NIL;
        }
        final SubLObject var39 = (SubLObject)new $problem_store_native();
        SubLObject var40;
        SubLObject var41;
        SubLObject var42;
        SubLObject var43;
        for (var40 = (SubLObject)NIL, var40 = var38; NIL != var40; var40 = conses_high.cddr(var40)) {
            var41 = var40.first();
            var42 = conses_high.cadr(var40);
            var43 = var41;
            if (var43.eql((SubLObject)$ic150$)) {
                f24058(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic151$)) {
                f24059(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic152$)) {
                f24060(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic153$)) {
                f24061(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic154$)) {
                f24062(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic155$)) {
                f24063(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic156$)) {
                f24064(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic157$)) {
                f24065(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic158$)) {
                f24066(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic159$)) {
                f24067(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic160$)) {
                f24068(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic161$)) {
                f24069(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic162$)) {
                f24070(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic163$)) {
                f24071(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic164$)) {
                f24072(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic165$)) {
                f24073(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic166$)) {
                f24074(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic167$)) {
                f24075(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic168$)) {
                f24076(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic169$)) {
                f24077(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic170$)) {
                f24078(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic171$)) {
                f24079(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic172$)) {
                f24080(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic173$)) {
                f24081(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic174$)) {
                f24082(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic175$)) {
                f24083(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic176$)) {
                f24084(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic177$)) {
                f24085(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic178$)) {
                f24086(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic179$)) {
                f24087(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic180$)) {
                f24088(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic181$)) {
                f24089(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic182$)) {
                f24090(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic183$)) {
                f24091(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic184$)) {
                f24092(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic185$)) {
                f24093(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic186$)) {
                f24094(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic187$)) {
                f24095(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic188$)) {
                f24096(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic189$)) {
                f24097(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic190$)) {
                f24098(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic191$)) {
                f24099(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic192$)) {
                f24100(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic193$)) {
                f24101(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic194$)) {
                f24102(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic195$)) {
                f24103(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic196$)) {
                f24104(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic197$)) {
                f24105(var39, var42);
            }
            else {
                Errors.error((SubLObject)$ic198$, var41);
            }
        }
        return var39;
    }
    
    public static SubLObject f24107(final SubLObject var44, final SubLObject var45) {
        Functions.funcall(var45, var44, (SubLObject)$ic199$, (SubLObject)$ic200$, (SubLObject)$ic50$);
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic150$, f24010(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic151$, f24011(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic152$, f24012(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic153$, f24013(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic154$, f24014(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic155$, f24015(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic156$, f24016(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic157$, f24017(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic158$, f24018(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic159$, f24019(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic160$, f24020(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic161$, f24021(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic162$, f24022(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic163$, f24023(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic164$, f24024(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic165$, f24025(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic166$, f24026(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic167$, f24027(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic168$, f24028(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic169$, f24029(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic170$, f24030(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic171$, f24031(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic172$, f24032(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic173$, f24033(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic174$, f24034(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic175$, f24035(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic176$, f24036(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic177$, f24037(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic178$, f24038(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic179$, f24039(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic180$, f24040(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic181$, f24041(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic182$, f24042(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic183$, f24043(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic184$, f24044(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic185$, f24045(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic186$, f24046(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic187$, f24047(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic188$, f24048(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic189$, f24049(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic190$, f24050(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic191$, f24051(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic192$, f24052(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic193$, f24053(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic194$, f24054(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic195$, f24055(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic196$, f24056(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic197$, f24057(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic202$, (SubLObject)$ic200$, (SubLObject)$ic50$);
        return var44;
    }
    
    public static SubLObject f24108(final SubLObject var44, final SubLObject var45) {
        return f24107(var44, var45);
    }
    
    public static SubLObject f24109(final SubLObject var46) {
        return (SubLObject)makeBoolean(NIL != f24009(var46) && NIL == f24110(var46));
    }
    
    public static SubLObject f24111(final SubLObject var46) {
        return f24109(f23997(var46));
    }
    
    public static SubLObject f24110(final SubLObject var1) {
        return Equality.eq((SubLObject)$ic204$, f24031(var1));
    }
    
    public static SubLObject f24008(final SubLObject var46, final SubLObject var35, final SubLObject var47) {
        if (NIL != f24110(var46)) {
            PrintLow.format(var35, (SubLObject)$ic205$, f24011(var46));
        }
        else {
            PrintLow.format(var35, (SubLObject)$ic206$, f23996(var46), f24112(var46));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24113(final SubLObject var46) {
        return f24011(var46);
    }
    
    public static SubLObject f24114(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic208$);
        var10 = var9.first();
        final SubLObject var11;
        var9 = (var11 = var9.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic209$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic210$, var10)), ConsesLow.append(var11, (SubLObject)NIL));
    }
    
    public static SubLObject f24115(final SubLObject var1) {
        return f24012(var1);
    }
    
    public static SubLObject f24116(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic212$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic212$);
        var11 = var9.first();
        var9 = var9.rest();
        if (NIL == var9) {
            final SubLObject var12;
            var9 = (var12 = var10);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic213$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic214$, var11)), ConsesLow.append(var12, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic212$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24117(final SubLObject var1) {
        return f24046(var1);
    }
    
    public static SubLObject f24118(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic212$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic212$);
        var11 = var9.first();
        var9 = var9.rest();
        if (NIL == var9) {
            final SubLObject var12;
            var9 = (var12 = var10);
            final SubLObject var13 = (SubLObject)$ic216$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic217$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, (SubLObject)ConsesLow.list((SubLObject)$ic218$, var11))), (SubLObject)ConsesLow.listS((SubLObject)$ic219$, var13, ConsesLow.append(var12, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic220$, var11, var13));
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic212$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24119(final SubLObject var1) {
        return f24047(var1);
    }
    
    public static SubLObject f24120(final SubLObject var1, final SubLObject var57) {
        f24095(var1, var57);
        return var1;
    }
    
    public static SubLObject f24121(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic208$);
        var10 = var9.first();
        final SubLObject var11;
        var9 = (var11 = var9.rest());
        final SubLObject var12 = (SubLObject)$ic222$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic217$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, var10)), (SubLObject)ConsesLow.list((SubLObject)$ic215$, (SubLObject)ConsesLow.list(var12), (SubLObject)ConsesLow.listS((SubLObject)$ic221$, (SubLObject)ConsesLow.list(var12), ConsesLow.append(var11, (SubLObject)NIL))));
    }
    
    public static SubLObject f24122(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic223$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic223$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic223$);
        var12 = var9.first();
        var9 = var9.rest();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var9;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var68_69 = (SubLObject)NIL;
        while (NIL != var14) {
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic223$);
            var68_69 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic223$);
            if (NIL == conses_high.member(var68_69, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var15 = (SubLObject)T;
            }
            if (var68_69 == $ic3$) {
                var13 = var14.first();
            }
            var14 = var14.rest();
        }
        if (NIL != var15 && NIL == var13) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic223$);
        }
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var9 = (var18 = var10);
        final SubLObject var19 = (SubLObject)$ic224$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic6$, (SubLObject)ConsesLow.list(var19, var11, (SubLObject)ConsesLow.list((SubLObject)$ic225$, var12), (SubLObject)$ic4$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic8$, var19), ConsesLow.append(var18, (SubLObject)NIL));
    }
    
    public static SubLObject f24123(final SubLObject var1) {
        return f24014(var1);
    }
    
    public static SubLObject f24124(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic227$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic227$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic227$);
        var12 = var9.first();
        var9 = var9.rest();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var9;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var78_79 = (SubLObject)NIL;
        while (NIL != var14) {
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic227$);
            var78_79 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic227$);
            if (NIL == conses_high.member(var78_79, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var15 = (SubLObject)T;
            }
            if (var78_79 == $ic3$) {
                var13 = var14.first();
            }
            var14 = var14.rest();
        }
        if (NIL != var15 && NIL == var13) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic227$);
        }
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var9 = (var18 = var10);
        final SubLObject var19 = (SubLObject)$ic228$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic6$, (SubLObject)ConsesLow.list(var19, var11, (SubLObject)ConsesLow.list((SubLObject)$ic229$, var12), (SubLObject)$ic4$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic8$, var19), ConsesLow.append(var18, (SubLObject)NIL));
    }
    
    public static SubLObject f24125(final SubLObject var1) {
        return f24015(var1);
    }
    
    public static SubLObject f24126(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic231$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic231$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic231$);
        var12 = var9.first();
        var9 = var9.rest();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var9;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var88_89 = (SubLObject)NIL;
        while (NIL != var14) {
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic231$);
            var88_89 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic231$);
            if (NIL == conses_high.member(var88_89, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var15 = (SubLObject)T;
            }
            if (var88_89 == $ic3$) {
                var13 = var14.first();
            }
            var14 = var14.rest();
        }
        if (NIL != var15 && NIL == var13) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic231$);
        }
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var9 = (var18 = var10);
        return (SubLObject)ConsesLow.list((SubLObject)$ic232$, var17, (SubLObject)ConsesLow.listS((SubLObject)$ic217$, (SubLObject)ConsesLow.list(reader.bq_cons(var11, (SubLObject)$ic233$)), ConsesLow.append(var18, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic230$, (SubLObject)ConsesLow.list(var11, var12, (SubLObject)$ic4$, var17), ConsesLow.append(var18, (SubLObject)NIL)));
    }
    
    public static SubLObject f24127(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic234$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic234$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic234$);
        var12 = var9.first();
        var9 = var9.rest();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var9;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var98_99 = (SubLObject)NIL;
        while (NIL != var14) {
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic234$);
            var98_99 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic234$);
            if (NIL == conses_high.member(var98_99, (SubLObject)$ic235$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var15 = (SubLObject)T;
            }
            if (var98_99 == $ic3$) {
                var13 = var14.first();
            }
            var14 = var14.rest();
        }
        if (NIL != var15 && NIL == var13) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic234$);
        }
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic236$, var9);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20;
        var9 = (var20 = var10);
        final SubLObject var21 = (SubLObject)$ic237$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic6$, (SubLObject)ConsesLow.list(var21, var11, (SubLObject)ConsesLow.list((SubLObject)$ic238$, var12), (SubLObject)$ic236$, var17, (SubLObject)$ic4$, var19), (SubLObject)ConsesLow.list((SubLObject)$ic8$, var21), ConsesLow.append(var20, (SubLObject)NIL));
    }
    
    public static SubLObject f24128(final SubLObject var1) {
        return f24016(var1);
    }
    
    public static SubLObject f24129(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic240$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic240$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic240$);
        var12 = var9.first();
        var9 = var9.rest();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var9;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var110_111 = (SubLObject)NIL;
        while (NIL != var14) {
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic240$);
            var110_111 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic240$);
            if (NIL == conses_high.member(var110_111, (SubLObject)$ic241$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var15 = (SubLObject)T;
            }
            if (var110_111 == $ic3$) {
                var13 = var14.first();
            }
            var14 = var14.rest();
        }
        if (NIL != var15 && NIL == var13) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic240$);
        }
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic242$, var9);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic236$, var9);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
        final SubLObject var22;
        var9 = (var22 = var10);
        final SubLObject var23 = (SubLObject)$ic243$;
        if (NIL == var17) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic6$, (SubLObject)ConsesLow.list(var23, var11, (SubLObject)ConsesLow.list((SubLObject)$ic244$, var12), (SubLObject)$ic236$, var19, (SubLObject)$ic4$, var21), (SubLObject)ConsesLow.list((SubLObject)$ic8$, var23), ConsesLow.append(var22, (SubLObject)NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic245$, (SubLObject)ConsesLow.list(var11, var12, (SubLObject)$ic236$, var19, (SubLObject)$ic4$, var21), (SubLObject)ConsesLow.listS((SubLObject)$ic246$, (SubLObject)ConsesLow.list((SubLObject)$ic247$, var11, var17), ConsesLow.append(var22, (SubLObject)NIL)));
    }
    
    public static SubLObject f24130(final SubLObject var1) {
        return f24017(var1);
    }
    
    public static SubLObject f24131(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic248$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic248$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic248$);
        var12 = var9.first();
        var9 = var9.rest();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var9;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var123_124 = (SubLObject)NIL;
        while (NIL != var14) {
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic248$);
            var123_124 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic248$);
            if (NIL == conses_high.member(var123_124, (SubLObject)$ic249$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var15 = (SubLObject)T;
            }
            if (var123_124 == $ic3$) {
                var13 = var14.first();
            }
            var14 = var14.rest();
        }
        if (NIL != var15 && NIL == var13) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic248$);
        }
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic250$, var9);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic236$, var9);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
        final SubLObject var22;
        var9 = (var22 = var10);
        final SubLObject var23 = (SubLObject)$ic251$;
        if (NIL == var17) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic6$, (SubLObject)ConsesLow.list(var23, var11, (SubLObject)ConsesLow.list((SubLObject)$ic252$, var12), (SubLObject)$ic236$, var19, (SubLObject)$ic4$, var21), (SubLObject)ConsesLow.list((SubLObject)$ic8$, var23), ConsesLow.append(var22, (SubLObject)NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic253$, (SubLObject)ConsesLow.list(var11, var12, (SubLObject)$ic236$, var19, (SubLObject)$ic4$, var21), (SubLObject)ConsesLow.listS((SubLObject)$ic246$, (SubLObject)ConsesLow.list((SubLObject)$ic254$, var11, var17), ConsesLow.append(var22, (SubLObject)NIL)));
    }
    
    public static SubLObject f24132(final SubLObject var1) {
        return f24018(var1);
    }
    
    public static SubLObject f24133(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic255$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic255$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic255$);
        var12 = var9.first();
        var9 = var9.rest();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var9;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var135_136 = (SubLObject)NIL;
        while (NIL != var14) {
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic255$);
            var135_136 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic255$);
            if (NIL == conses_high.member(var135_136, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var15 = (SubLObject)T;
            }
            if (var135_136 == $ic3$) {
                var13 = var14.first();
            }
            var14 = var14.rest();
        }
        if (NIL != var15 && NIL == var13) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic255$);
        }
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var9 = (var18 = var10);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic256$, (SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)$ic257$, var12), (SubLObject)$ic4$, var17), ConsesLow.append(var18, (SubLObject)NIL));
    }
    
    public static SubLObject f24134(final SubLObject var1) {
        return f24053(var1);
    }
    
    public static SubLObject f24135(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic259$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic259$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic259$);
        var12 = var9.first();
        var9 = var9.rest();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var9;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var145_146 = (SubLObject)NIL;
        while (NIL != var14) {
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic259$);
            var145_146 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic259$);
            if (NIL == conses_high.member(var145_146, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var15 = (SubLObject)T;
            }
            if (var145_146 == $ic3$) {
                var13 = var14.first();
            }
            var14 = var14.rest();
        }
        if (NIL != var15 && NIL == var13) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic259$);
        }
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var9 = (var18 = var10);
        final SubLObject var19 = (SubLObject)$ic260$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic217$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, var12)), (SubLObject)ConsesLow.listS((SubLObject)$ic256$, (SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)$ic261$, var19), (SubLObject)$ic4$, var17), ConsesLow.append(var18, (SubLObject)NIL)));
    }
    
    public static SubLObject f24136(SubLObject var148) {
        if (var148 == UNPROVIDED) {
            var148 = (SubLObject)NIL;
        }
        final SubLThread var149 = SubLProcess.currentSubLThread();
        assert NIL != module0360.f23856(var148) : var148;
        final SubLObject var150 = module0360.f23908(var148);
        assert NIL != module0360.f23907(var150) : var150;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var149) && NIL != f24137(var150)) {
            Errors.error((SubLObject)$ic266$, var150);
        }
        final SubLObject var151 = f24106((SubLObject)UNPROVIDED);
        final SubLObject var152 = f23993();
        final SubLObject var153 = (SubLObject)NIL;
        module0413.f28748();
        f24058(var151, var153);
        f24059(var151, var152);
        f23994(var151, var152);
        f24060(var151, Locks.make_lock((SubLObject)$ic267$));
        f24061(var151, Time.get_universal_time());
        f24096(var151, (SubLObject)NIL);
        f24064(var151, module0065.f4745($g3117$.getGlobalValue(), (SubLObject)ZERO_INTEGER));
        f24062(var151, module0065.f4745($g3119$.getGlobalValue(), (SubLObject)ZERO_INTEGER));
        f24063(var151, module0065.f4745($g3120$.getGlobalValue(), (SubLObject)ZERO_INTEGER));
        f24065(var151, module0065.f4745($g3118$.getGlobalValue(), (SubLObject)ZERO_INTEGER));
        f24066(var151, module0065.f4745($g3121$.getGlobalValue(), (SubLObject)ZERO_INTEGER));
        f24068(var151, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f24069(var151, module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f24070(var151, module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f24071(var151, (SubLObject)NIL);
        f24072(var151, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f24073(var151, (SubLObject)NIL);
        f24074(var151, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f24075(var151, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f24076(var151, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f24077(var151, Hashtables.make_hash_table((SubLObject)ONE_INTEGER, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        final SubLObject var154 = module0360.f23908(var148);
        f24138(var151, var154);
        final SubLObject var155 = module0360.f23910(var148);
        assert NIL != module0360.f23909(var155) : var155;
        f24078(var151, var155);
        final SubLObject var156 = module0360.f23912(var148);
        assert NIL != module0360.f23911(var156) : var156;
        f24079(var151, var156);
        if ($ic270$ == var156) {
            f24067(var151, (SubLObject)$ic271$);
        }
        else {
            f24067(var151, Hashtables.make_hash_table($g3117$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        }
        final SubLObject var157 = module0360.f23914(var148);
        assert NIL != module0360.f23913(var157) : var157;
        f24080(var151, var157);
        final SubLObject var158 = module0360.f23916(var148);
        assert NIL != module0360.f23915(var158) : var158;
        f24081(var151, var158);
        final SubLObject var159 = f24139(var158);
        assert NIL != module0360.f23915(var159) : var159;
        f24082(var151, var159);
        final SubLObject var160 = module0360.f23917(var148);
        assert NIL != Types.booleanp(var160) : var160;
        f24083(var151, var160);
        final SubLObject var161 = module0360.f23918(var148);
        assert NIL != Types.booleanp(var161) : var161;
        f24084(var151, var161);
        final SubLObject var162 = module0360.f23896(var148);
        assert NIL != Types.booleanp(var162) : var162;
        f24085(var151, var162);
        final SubLObject var163 = module0360.f23897(var148);
        assert NIL != Types.booleanp(var163) : var163;
        f24086(var151, var163);
        final SubLObject var164 = module0360.f23898(var148);
        assert NIL != Types.booleanp(var164) : var164;
        f24087(var151, var164);
        final SubLObject var165 = module0360.f23920(var148);
        assert NIL != module0360.f23919(var165) : var165;
        f24088(var151, var165);
        final SubLObject var166 = module0360.f23899(var148);
        assert NIL != Types.booleanp(var166) : var166;
        f24089(var151, var166);
        final SubLObject var167 = module0360.f23900(var148);
        assert NIL != Types.booleanp(var167) : var167;
        f24090(var151, var167);
        final SubLObject var168 = module0360.f23901(var148);
        assert NIL != Types.booleanp(var168) : var168;
        f24091(var151, var168);
        final SubLObject var169 = module0360.f23902(var148);
        assert NIL != Types.booleanp(var169) : var169;
        f24092(var151, var169);
        final SubLObject var170 = module0360.f23903(var148);
        assert NIL != Types.booleanp(var170) : var170;
        f24093(var151, var170);
        f24094(var151, module0034.f1854((SubLObject)$ic276$, ReadWriteLocks.new_rw_lock((SubLObject)$ic277$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f24120(var151, module0139.f9019($g3122$.getGlobalValue()));
        f24097(var151, (SubLObject)NIL);
        f24098(var151, (SubLObject)NIL);
        f24099(var151, conses_high.copy_list(var148));
        f24100(var151, f24140(var151));
        f24101(var151, module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f24102(var151, (SubLObject)ZERO_INTEGER);
        f24103(var151, module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        f24104(var151, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f24105(var151, Hashtables.make_hash_table((SubLObject)ZERO_INTEGER, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return var151;
    }
    
    public static SubLObject f24005(final SubLObject var1) {
        if (NIL != f24109(var1)) {
            try {
                f24141(var1);
                final SubLObject var2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    f23995(var1);
                    f24060(var1, (SubLObject)$ic204$);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var2);
                }
            }
            finally {
                final SubLObject var3 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    f23995(var1);
                    f24060(var1, (SubLObject)$ic204$);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var3);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24141(final SubLObject var1) {
        module0413.f28753(var1);
        f24142(var1);
        final SubLObject var2 = f24050(var1);
        if (NIL != f24009(var2)) {
            f24005(var2);
        }
        f24098(var1, (SubLObject)$ic204$);
        f24143(f24052(var1));
        f24100(var1, (SubLObject)$ic204$);
        f24144(var1);
        f24078(var1, (SubLObject)$ic204$);
        f24080(var1, (SubLObject)$ic204$);
        f24081(var1, (SubLObject)$ic204$);
        f24082(var1, (SubLObject)$ic204$);
        f24083(var1, (SubLObject)$ic204$);
        f24084(var1, (SubLObject)$ic204$);
        f24085(var1, (SubLObject)$ic204$);
        f24086(var1, (SubLObject)$ic204$);
        f24087(var1, (SubLObject)$ic204$);
        f24088(var1, (SubLObject)$ic204$);
        f24089(var1, (SubLObject)$ic204$);
        f24090(var1, (SubLObject)$ic204$);
        f24091(var1, (SubLObject)$ic204$);
        f24092(var1, (SubLObject)$ic204$);
        f24093(var1, (SubLObject)$ic204$);
        f24096(var1, (SubLObject)$ic204$);
        f24097(var1, (SubLObject)$ic204$);
        f24099(var1, (SubLObject)$ic204$);
        f24145(var1);
        f24105(var1, (SubLObject)$ic204$);
        module0067.f4881(f24056(var1));
        f24104(var1, (SubLObject)$ic204$);
        module0067.f4881(f24055(var1));
        f24103(var1, (SubLObject)$ic204$);
        module0077.f5328(f24053(var1));
        f24101(var1, (SubLObject)$ic204$);
        f24095(var1, (SubLObject)$ic204$);
        f24094(var1, (SubLObject)$ic204$);
        Hashtables.clrhash(f24029(var1));
        f24077(var1, (SubLObject)$ic204$);
        module0067.f4881(f24027(var1));
        f24075(var1, (SubLObject)$ic204$);
        module0067.f4881(f24028(var1));
        f24076(var1, (SubLObject)$ic204$);
        module0067.f4881(f24026(var1));
        f24074(var1, (SubLObject)$ic204$);
        if (f24019(var1).isHashtable()) {
            Hashtables.clrhash(f24019(var1));
        }
        f24067(var1, (SubLObject)$ic204$);
        SubLObject var3 = f24123(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_170 = var3;
            if (NIL == module0065.f4775(var169_170, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_170);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        inference_datastructures_inference_oc.f25477(var9);
                    }
                }
            }
            final SubLObject var176_177 = var3;
            if (NIL == module0065.f4777(var176_177)) {
                final SubLObject var10 = module0065.f4738(var176_177);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        inference_datastructures_inference_oc.f25477(var12);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        module0065.f4762(f24014(var1));
        f24062(var1, (SubLObject)$ic204$);
        var3 = f24125(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_171 = var3;
            if (NIL == module0065.f4775(var169_171, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_171);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var15;
                SubLObject var16;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var15 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var16 = Vectors.aref(var4, var15);
                    if (NIL == module0065.f4749(var16) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var16)) {
                            var16 = (SubLObject)$ic278$;
                        }
                        module0367.f25046(var16);
                    }
                }
            }
            final SubLObject var176_178 = var3;
            if (NIL == module0065.f4777(var176_178)) {
                final SubLObject var10 = module0065.f4738(var176_178);
                SubLObject var17 = (SubLObject)NIL;
                SubLObject var18 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var17 = Hashtables.getEntryKey(var14);
                        var18 = Hashtables.getEntryValue(var14);
                        module0367.f25046(var18);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        module0065.f4762(f24015(var1));
        f24063(var1, (SubLObject)$ic204$);
        module0067.f4881(f24020(var1));
        f24068(var1, (SubLObject)$ic204$);
        module0077.f5328(f24021(var1));
        f24069(var1, (SubLObject)$ic204$);
        module0077.f5328(f24022(var1));
        f24070(var1, (SubLObject)$ic204$);
        f24071(var1, (SubLObject)$ic204$);
        module0067.f4881(f24024(var1));
        f24072(var1, (SubLObject)$ic204$);
        f24073(var1, (SubLObject)$ic204$);
        var3 = f24132(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_172 = var3;
            if (NIL == module0065.f4775(var169_172, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_172);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var19;
                SubLObject var20;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var19 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var20 = Vectors.aref(var4, var19);
                    if (NIL == module0065.f4749(var20) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var20)) {
                            var20 = (SubLObject)$ic278$;
                        }
                        module0366.f24960(var20);
                    }
                }
            }
            final SubLObject var176_179 = var3;
            if (NIL == module0065.f4777(var176_179)) {
                final SubLObject var10 = module0065.f4738(var176_179);
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var21 = Hashtables.getEntryKey(var14);
                        var22 = Hashtables.getEntryValue(var14);
                        module0366.f24960(var22);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        module0065.f4762(f24018(var1));
        f24066(var1, (SubLObject)$ic204$);
        var3 = f24130(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_173 = var3;
            if (NIL == module0065.f4775(var169_173, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_173);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var23;
                SubLObject var24;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var23 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var24 = Vectors.aref(var4, var23);
                    if (NIL == module0065.f4749(var24) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var24)) {
                            var24 = (SubLObject)$ic278$;
                        }
                        module0364.f24739(var24);
                    }
                }
            }
            final SubLObject var176_180 = var3;
            if (NIL == module0065.f4777(var176_180)) {
                final SubLObject var10 = module0065.f4738(var176_180);
                SubLObject var25 = (SubLObject)NIL;
                SubLObject var26 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var25 = Hashtables.getEntryKey(var14);
                        var26 = Hashtables.getEntryValue(var14);
                        module0364.f24739(var26);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        module0065.f4762(f24017(var1));
        f24065(var1, (SubLObject)$ic204$);
        var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_174 = var3;
            if (NIL == module0065.f4775(var169_174, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_174);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var27;
                SubLObject var28;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var27 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var28 = Vectors.aref(var4, var27);
                    if (NIL == module0065.f4749(var28) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var28)) {
                            var28 = (SubLObject)$ic278$;
                        }
                        module0363.f24549(var28);
                    }
                }
            }
            final SubLObject var176_181 = var3;
            if (NIL == module0065.f4777(var176_181)) {
                final SubLObject var10 = module0065.f4738(var176_181);
                SubLObject var29 = (SubLObject)NIL;
                SubLObject var30 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var29 = Hashtables.getEntryKey(var14);
                        var30 = Hashtables.getEntryValue(var14);
                        module0363.f24549(var30);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        module0065.f4762(f24016(var1));
        f24064(var1, (SubLObject)$ic204$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24142(final SubLObject var1) {
        f24079(var1, (SubLObject)$ic204$);
        return var1;
    }
    
    public static SubLObject f24146(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        SubLObject var2 = f24010(var1);
        if (NIL == var2) {
            var2 = Guids.new_guid();
            f24058(var1, var2);
        }
        return var2;
    }
    
    public static SubLObject f23996(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24011(var1);
    }
    
    public static SubLObject f24147(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24013(var1);
    }
    
    public static SubLObject f24148(final SubLObject var1) {
        return f24020(var1);
    }
    
    public static SubLObject f24149(final SubLObject var1) {
        return f24021(var1);
    }
    
    public static SubLObject f24150(final SubLObject var1) {
        return f24022(var1);
    }
    
    public static SubLObject f24151(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24023(var1);
    }
    
    public static SubLObject f24152(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24024(var1);
    }
    
    public static SubLObject f24153(final SubLObject var1) {
        return f24025(var1);
    }
    
    public static SubLObject f24154(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24026(var1);
    }
    
    public static SubLObject f24155(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24027(var1);
    }
    
    public static SubLObject f24156(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24028(var1);
    }
    
    public static SubLObject f24157(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24029(var1);
    }
    
    public static SubLObject f24158(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24030(var1);
    }
    
    public static SubLObject f24159(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24031(var1);
    }
    
    public static SubLObject f24160(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24032(var1);
    }
    
    public static SubLObject f24161(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24033(var1);
    }
    
    public static SubLObject f24162(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24034(var1);
    }
    
    public static SubLObject f24163(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24035(var1);
    }
    
    public static SubLObject f24164(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24036(var1);
    }
    
    public static SubLObject f24165(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24037(var1);
    }
    
    public static SubLObject f24166(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24038(var1);
    }
    
    public static SubLObject f24167(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24039(var1);
    }
    
    public static SubLObject f24168(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24040(var1);
    }
    
    public static SubLObject f24169(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24041(var1);
    }
    
    public static SubLObject f24170(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24042(var1);
    }
    
    public static SubLObject f24171(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24043(var1);
    }
    
    public static SubLObject f24172(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24044(var1);
    }
    
    public static SubLObject f24173(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        if (NIL != module0029.f1471()) {
            return f24174(var1);
        }
        return f24045(var1);
    }
    
    public static SubLObject f24175(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        return f24048(var1);
    }
    
    public static SubLObject f24176(final SubLObject var1) {
        return f24049(var1);
    }
    
    public static SubLObject f24177(final SubLObject var1) {
        SubLObject var2 = f24050(var1);
        if (NIL == var2) {
            var2 = f24136(f24178(var1));
            f24098(var1, var2);
        }
        return var2;
    }
    
    public static SubLObject f24178(final SubLObject var1) {
        return f24051(var1);
    }
    
    public static SubLObject f24179(final SubLObject var1) {
        return f24052(var1);
    }
    
    public static SubLObject f24180(final SubLObject var1, final SubLObject var197) {
        assert NIL != f24009(var1) : var1;
        assert NIL != module0365.f24819(var197) : var197;
        f24073(var1, var197);
        return var1;
    }
    
    public static SubLObject f24181(final SubLObject var1, final SubLObject var198) {
        assert NIL != f24182(var1) : var1;
        assert NIL != module0360.f23913(var198) : var198;
        f24080(var1, var198);
        return var1;
    }
    
    public static SubLObject f24183(final SubLObject var1, final SubLObject var198) {
        assert NIL != f24182(var1) : var1;
        assert NIL != Types.booleanp(var198) : var198;
        f24085(var1, var198);
        return var1;
    }
    
    public static SubLObject f24184(final SubLObject var1, final SubLObject var198) {
        assert NIL != f24182(var1) : var1;
        assert NIL != Types.booleanp(var198) : var198;
        f24084(var1, var198);
        return var1;
    }
    
    public static SubLObject f24185(final SubLObject var1, final SubLObject var198) {
        assert NIL != f24182(var1) : var1;
        assert NIL != Types.booleanp(var198) : var198;
        f24083(var1, var198);
        return var1;
    }
    
    public static SubLObject f24186(final SubLObject var1, final SubLObject var198) {
        assert NIL != f24182(var1) : var1;
        assert NIL != Types.booleanp(var198) : var198;
        f24092(var1, var198);
        return var1;
    }
    
    public static SubLObject f24187(final SubLObject var1) {
        assert NIL != f24182(var1) : var1;
        f24096(var1, (SubLObject)T);
        return var1;
    }
    
    public static SubLObject f24188(final SubLObject var1) {
        assert NIL != f24182(var1) : var1;
        f24097(var1, (SubLObject)T);
        return var1;
    }
    
    public static SubLObject f24189(final SubLObject var1) {
        final SubLObject var2 = f24179(var1);
        f24143(var2);
        f24100(var1, f24140(var1));
        return var1;
    }
    
    public static SubLObject f24174(final SubLObject var1) {
        return Equality.eq((SubLObject)$ic281$, f24168(var1));
    }
    
    public static SubLObject f24190(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL == f24175(var1));
    }
    
    public static SubLObject f24182(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f24009(var1) && NIL != f24190(var1));
    }
    
    public static SubLObject f24191(final SubLObject var1) {
        return module0065.f4733(f24014(var1));
    }
    
    public static SubLObject f24192(final SubLObject var1) {
        return Numbers.numE((SubLObject)ONE_INTEGER, f24191(var1));
    }
    
    public static SubLObject f24193(final SubLObject var1) {
        return module0065.f4734(f24014(var1));
    }
    
    public static SubLObject f24194(final SubLObject var1, final SubLObject var200) {
        final SubLObject var201 = f24014(var1);
        return module0065.f4750(var201, var200, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f24195(final SubLObject var202, final SubLObject var200) {
        final SubLObject var203 = f23997(var202);
        if (NIL != var203) {
            final SubLObject var204 = f24194(var203, var200);
            return var204;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24196(final SubLObject var1) {
        final SubLObject var2 = f24123(var1);
        if (NIL == module0065.f4772(var2, (SubLObject)$ic278$)) {
            final SubLObject var169_203 = var2;
            if (NIL == module0065.f4775(var169_203, (SubLObject)$ic278$)) {
                final SubLObject var3 = module0065.f4740(var169_203);
                final SubLObject var4 = (SubLObject)NIL;
                SubLObject var5;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                for (var5 = Sequences.length(var3), var6 = (SubLObject)NIL, var6 = (SubLObject)ZERO_INTEGER; var6.numL(var5); var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER)) {
                    var7 = ((NIL != var4) ? Numbers.subtract(var5, var6, (SubLObject)ONE_INTEGER) : var6);
                    var8 = Vectors.aref(var3, var7);
                    if (NIL == module0065.f4749(var8) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var8)) {
                            var8 = (SubLObject)$ic278$;
                        }
                        return var8;
                    }
                }
            }
            final SubLObject var176_204 = var2;
            if (NIL == module0065.f4777(var176_204)) {
                final SubLObject var9 = module0065.f4738(var176_204);
                SubLObject var10 = (SubLObject)NIL;
                SubLObject var11 = (SubLObject)NIL;
                final Iterator var12 = Hashtables.getEntrySetIterator(var9);
                try {
                    if (Hashtables.iteratorHasNext(var12)) {
                        final Map.Entry var13 = Hashtables.iteratorNextEntry(var12);
                        var10 = Hashtables.getEntryKey(var13);
                        var11 = Hashtables.getEntryValue(var13);
                        return var11;
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var12);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24197(final SubLObject var1) {
        SubLObject var2 = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = f24123(var1);
        if (NIL == module0065.f4772(var4, (SubLObject)$ic278$)) {
            final SubLObject var169_207 = var4;
            if (NIL == module0065.f4775(var169_207, (SubLObject)$ic278$)) {
                final SubLObject var5 = module0065.f4740(var169_207);
                final SubLObject var6 = (SubLObject)NIL;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                SubLObject var10;
                SubLObject var20_208;
                for (var7 = Sequences.length(var5), var8 = (SubLObject)NIL, var8 = (SubLObject)ZERO_INTEGER; var8.numL(var7); var8 = Numbers.add(var8, (SubLObject)ONE_INTEGER)) {
                    var9 = ((NIL != var6) ? Numbers.subtract(var7, var8, (SubLObject)ONE_INTEGER) : var8);
                    var10 = Vectors.aref(var5, var9);
                    if (NIL == module0065.f4749(var10) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var10)) {
                            var10 = (SubLObject)$ic278$;
                        }
                        var20_208 = inference_datastructures_inference_oc.f25422(var10);
                        if (var20_208.numL(var2)) {
                            var3 = var10;
                            var2 = var20_208;
                        }
                    }
                }
            }
            final SubLObject var176_209 = var4;
            if (NIL == module0065.f4777(var176_209)) {
                final SubLObject var11 = module0065.f4738(var176_209);
                SubLObject var12 = (SubLObject)NIL;
                SubLObject var13 = (SubLObject)NIL;
                final Iterator var14 = Hashtables.getEntrySetIterator(var11);
                try {
                    while (Hashtables.iteratorHasNext(var14)) {
                        final Map.Entry var15 = Hashtables.iteratorNextEntry(var14);
                        var12 = Hashtables.getEntryKey(var15);
                        var13 = Hashtables.getEntryValue(var15);
                        final SubLObject var20_209 = inference_datastructures_inference_oc.f25422(var13);
                        if (var20_209.numL(var2)) {
                            var3 = var13;
                            var2 = var20_209;
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var14);
                }
            }
        }
        return var3;
    }
    
    public static SubLObject f24198(final SubLObject var1) {
        SubLObject var2 = (SubLObject)MINUS_ONE_INTEGER;
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = f24123(var1);
        if (NIL == module0065.f4772(var4, (SubLObject)$ic278$)) {
            final SubLObject var169_213 = var4;
            if (NIL == module0065.f4775(var169_213, (SubLObject)$ic278$)) {
                final SubLObject var5 = module0065.f4740(var169_213);
                final SubLObject var6 = (SubLObject)NIL;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                SubLObject var10;
                SubLObject var20_214;
                for (var7 = Sequences.length(var5), var8 = (SubLObject)NIL, var8 = (SubLObject)ZERO_INTEGER; var8.numL(var7); var8 = Numbers.add(var8, (SubLObject)ONE_INTEGER)) {
                    var9 = ((NIL != var6) ? Numbers.subtract(var7, var8, (SubLObject)ONE_INTEGER) : var8);
                    var10 = Vectors.aref(var5, var9);
                    if (NIL == module0065.f4749(var10) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var10)) {
                            var10 = (SubLObject)$ic278$;
                        }
                        var20_214 = inference_datastructures_inference_oc.f25422(var10);
                        if (var20_214.numG(var2)) {
                            var3 = var10;
                            var2 = var20_214;
                        }
                    }
                }
            }
            final SubLObject var176_215 = var4;
            if (NIL == module0065.f4777(var176_215)) {
                final SubLObject var11 = module0065.f4738(var176_215);
                SubLObject var12 = (SubLObject)NIL;
                SubLObject var13 = (SubLObject)NIL;
                final Iterator var14 = Hashtables.getEntrySetIterator(var11);
                try {
                    while (Hashtables.iteratorHasNext(var14)) {
                        final Map.Entry var15 = Hashtables.iteratorNextEntry(var14);
                        var12 = Hashtables.getEntryKey(var15);
                        var13 = Hashtables.getEntryValue(var15);
                        final SubLObject var20_215 = inference_datastructures_inference_oc.f25422(var13);
                        if (var20_215.numG(var2)) {
                            var3 = var13;
                            var2 = var20_215;
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var14);
                }
            }
        }
        return var3;
    }
    
    public static SubLObject f24199(final SubLObject var1) {
        final SubLObject var2 = f24196(var1);
        if (NIL != var2) {
            return inference_datastructures_inference_oc.f25514(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24200(final SubLObject var1) {
        return module0065.f4733(f24015(var1));
    }
    
    public static SubLObject f24201(final SubLObject var1) {
        return module0065.f4734(f24125(var1));
    }
    
    public static SubLObject f24202(final SubLObject var1) {
        return module0065.f4796(f24125(var1));
    }
    
    public static SubLObject f24203(final SubLObject var1, final SubLObject var217) {
        final SubLObject var218 = f24015(var1);
        return module0065.f4750(var218, var217, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f24204(final SubLObject var202, final SubLObject var217) {
        final SubLObject var218 = f23997(var202);
        if (NIL != var218) {
            final SubLObject var219 = f24203(var218, var217);
            return var219;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24205(final SubLObject var1) {
        final SubLObject var2 = f24125(var1);
        if (NIL == module0065.f4772(var2, (SubLObject)$ic278$)) {
            final SubLObject var169_218 = var2;
            if (NIL == module0065.f4775(var169_218, (SubLObject)$ic278$)) {
                final SubLObject var3 = module0065.f4740(var169_218);
                final SubLObject var4 = (SubLObject)NIL;
                SubLObject var5;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                for (var5 = Sequences.length(var3), var6 = (SubLObject)NIL, var6 = (SubLObject)ZERO_INTEGER; var6.numL(var5); var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER)) {
                    var7 = ((NIL != var4) ? Numbers.subtract(var5, var6, (SubLObject)ONE_INTEGER) : var6);
                    var8 = Vectors.aref(var3, var7);
                    if (NIL == module0065.f4749(var8) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var8)) {
                            var8 = (SubLObject)$ic278$;
                        }
                        return var8;
                    }
                }
            }
            final SubLObject var176_219 = var2;
            if (NIL == module0065.f4777(var176_219)) {
                final SubLObject var9 = module0065.f4738(var176_219);
                SubLObject var10 = (SubLObject)NIL;
                SubLObject var11 = (SubLObject)NIL;
                final Iterator var12 = Hashtables.getEntrySetIterator(var9);
                try {
                    if (Hashtables.iteratorHasNext(var12)) {
                        final Map.Entry var13 = Hashtables.iteratorNextEntry(var12);
                        var10 = Hashtables.getEntryKey(var13);
                        var11 = Hashtables.getEntryValue(var13);
                        return var11;
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var12);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24206(final SubLObject var1) {
        if (ONE_INTEGER.numE(f24200(var1))) {
            return f24205(var1);
        }
        final SubLObject var2 = f24207(var1);
        if (NIL != var2) {
            return var2;
        }
        return (SubLObject)$ic282$;
    }
    
    public static SubLObject f24207(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = f24202(var1);
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (NIL != module0390.f27709(var4)) {
                if (NIL != var2) {
                    return (SubLObject)NIL;
                }
                var2 = var4;
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return var2;
    }
    
    public static SubLObject f24208(final SubLObject var1) {
        return module0065.f4733(f24017(var1));
    }
    
    public static SubLObject f24209(final SubLObject var1) {
        return module0065.f4734(f24017(var1));
    }
    
    public static SubLObject f24210(final SubLObject var1, final SubLObject var222) {
        final SubLObject var223 = f24017(var1);
        return module0065.f4750(var223, var222, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f24211(final SubLObject var202, final SubLObject var222) {
        final SubLObject var223 = f23997(var202);
        if (NIL != var223) {
            return f24210(var223, var222);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24212(final SubLObject var1, final SubLObject var113) {
        final SubLObject var114 = f24130(var1);
        if (NIL == module0065.f4772(var114, (SubLObject)$ic278$)) {
            final SubLObject var169_223 = var114;
            if (NIL == module0065.f4775(var169_223, (SubLObject)$ic278$)) {
                final SubLObject var115 = module0065.f4740(var169_223);
                final SubLObject var116 = (SubLObject)NIL;
                SubLObject var117;
                SubLObject var118;
                SubLObject var119;
                SubLObject var120;
                for (var117 = Sequences.length(var115), var118 = (SubLObject)NIL, var118 = (SubLObject)ZERO_INTEGER; var118.numL(var117); var118 = Numbers.add(var118, (SubLObject)ONE_INTEGER)) {
                    var119 = ((NIL != var116) ? Numbers.subtract(var117, var118, (SubLObject)ONE_INTEGER) : var118);
                    var120 = Vectors.aref(var115, var119);
                    if (NIL == module0065.f4749(var120) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var120)) {
                            var120 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0364.f24748(var120, var113)) {
                            return var120;
                        }
                    }
                }
            }
            final SubLObject var176_224 = var114;
            if (NIL == module0065.f4777(var176_224)) {
                final SubLObject var121 = module0065.f4738(var176_224);
                SubLObject var122 = (SubLObject)NIL;
                SubLObject var123 = (SubLObject)NIL;
                final Iterator var124 = Hashtables.getEntrySetIterator(var121);
                try {
                    while (Hashtables.iteratorHasNext(var124)) {
                        final Map.Entry var125 = Hashtables.iteratorNextEntry(var124);
                        var122 = Hashtables.getEntryKey(var125);
                        var123 = Hashtables.getEntryValue(var125);
                        if (NIL != module0364.f24748(var123, var113)) {
                            return var123;
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var124);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24213(final SubLObject var1, final SubLObject var113) {
        SubLObject var114 = (SubLObject)ZERO_INTEGER;
        final SubLObject var115 = f24130(var1);
        if (NIL == module0065.f4772(var115, (SubLObject)$ic278$)) {
            final SubLObject var169_225 = var115;
            if (NIL == module0065.f4775(var169_225, (SubLObject)$ic278$)) {
                final SubLObject var116 = module0065.f4740(var169_225);
                final SubLObject var117 = (SubLObject)NIL;
                SubLObject var118;
                SubLObject var119;
                SubLObject var120;
                SubLObject var121;
                for (var118 = Sequences.length(var116), var119 = (SubLObject)NIL, var119 = (SubLObject)ZERO_INTEGER; var119.numL(var118); var119 = Numbers.add(var119, (SubLObject)ONE_INTEGER)) {
                    var120 = ((NIL != var117) ? Numbers.subtract(var118, var119, (SubLObject)ONE_INTEGER) : var119);
                    var121 = Vectors.aref(var116, var120);
                    if (NIL == module0065.f4749(var121) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var121)) {
                            var121 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0364.f24748(var121, var113)) {
                            var114 = Numbers.add(var114, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_226 = var115;
            if (NIL == module0065.f4777(var176_226)) {
                final SubLObject var122 = module0065.f4738(var176_226);
                SubLObject var123 = (SubLObject)NIL;
                SubLObject var124 = (SubLObject)NIL;
                final Iterator var125 = Hashtables.getEntrySetIterator(var122);
                try {
                    while (Hashtables.iteratorHasNext(var125)) {
                        final Map.Entry var126 = Hashtables.iteratorNextEntry(var125);
                        var123 = Hashtables.getEntryKey(var126);
                        var124 = Hashtables.getEntryValue(var126);
                        if (NIL != module0364.f24748(var124, var113)) {
                            var114 = Numbers.add(var114, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var125);
                }
            }
        }
        return var114;
    }
    
    public static SubLObject f24214(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic283$);
    }
    
    public static SubLObject f24215(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic284$);
    }
    
    public static SubLObject f24216(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic285$);
    }
    
    public static SubLObject f24217(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic286$);
    }
    
    public static SubLObject f24218(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic287$);
    }
    
    public static SubLObject f24219(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic288$);
    }
    
    public static SubLObject f24220(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic289$);
    }
    
    public static SubLObject f24221(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic290$);
    }
    
    public static SubLObject f24222(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic291$);
    }
    
    public static SubLObject f24223(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic292$);
    }
    
    public static SubLObject f24224(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic293$);
    }
    
    public static SubLObject f24225(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic294$);
    }
    
    public static SubLObject f24226(final SubLObject var1) {
        return f24213(var1, (SubLObject)$ic295$);
    }
    
    public static SubLObject f24227(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24130(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_227 = var3;
            if (NIL == module0065.f4775(var169_227, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_227);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0364.f24748(var9, (SubLObject)$ic290$) && NIL != module0364.f24750(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_229 = var3;
            if (NIL == module0065.f4777(var176_229)) {
                final SubLObject var10 = module0065.f4738(var176_229);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0364.f24748(var12, (SubLObject)$ic290$) && NIL != module0364.f24750(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24228(final SubLObject var1) {
        return module0065.f4733(f24016(var1));
    }
    
    public static SubLObject f24229(final SubLObject var1) {
        return module0065.f4734(f24016(var1));
    }
    
    public static SubLObject f24230(final SubLObject var1) {
        return Numbers.numLE(f24228(var1), (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f24139(final SubLObject var154) {
        return module0048.f3351(module0048.f3337(var154, (SubLObject)$ic296$), module0048.f3343(var154, (SubLObject)TWO_INTEGER));
    }
    
    public static SubLObject f24231(final SubLObject var1) {
        final SubLObject var2 = f24161(var1);
        return (SubLObject)makeBoolean(NIL == module0048.f3328(var2) && f24228(var1).numGE(var2));
    }
    
    public static SubLObject f24232(final SubLObject var1) {
        final SubLObject var2 = f24161(var1);
        final SubLObject var3 = module0048.f3343(var2, $g3123$.getGlobalValue());
        return (SubLObject)makeBoolean(NIL == module0048.f3328(var3) && f24233(var1).numGE(var3));
    }
    
    public static SubLObject f24234(final SubLObject var1) {
        final SubLObject var2 = f24162(var1);
        return (SubLObject)makeBoolean(NIL == module0048.f3328(var2) && f24228(var1).numE(var2));
    }
    
    public static SubLObject f24235(final SubLObject var1) {
        final SubLObject var2 = f24162(var1);
        return (SubLObject)makeBoolean(NIL == module0048.f3328(var2) && f24228(var1).numGE(var2));
    }
    
    public static SubLObject f24236(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f24199(var1) && NIL == f24173(var1));
    }
    
    public static SubLObject f24237(final SubLObject var1, final SubLObject var231) {
        final SubLObject var232 = f24016(var1);
        return module0065.f4750(var232, var231, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f24238(final SubLObject var202, final SubLObject var231) {
        final SubLObject var232 = f23997(var202);
        if (NIL != var232) {
            return f24237(var232, var231);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24239(final SubLObject var1, final SubLObject var232) {
        final SubLObject var233 = f24159(var1);
        if (NIL != module0362.f24456(var232, var233)) {
            return Hashtables.gethash_without_values(var232, f24019(var1), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24240(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_234 = var3;
            if (NIL == module0065.f4775(var169_234, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_234);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24690(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_235 = var3;
            if (NIL == module0065.f4777(var176_235)) {
                final SubLObject var10 = module0065.f4738(var176_235);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24690(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24241(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_236 = var3;
            if (NIL == module0065.f4775(var169_236, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_236);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24685(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_237 = var3;
            if (NIL == module0065.f4777(var176_237)) {
                final SubLObject var10 = module0065.f4738(var176_237);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24685(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24242(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_238 = var3;
            if (NIL == module0065.f4775(var169_238, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_238);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24686(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_239 = var3;
            if (NIL == module0065.f4777(var176_239)) {
                final SubLObject var10 = module0065.f4738(var176_239);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24686(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24243(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_240 = var3;
            if (NIL == module0065.f4775(var169_240, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_240);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24687(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_241 = var3;
            if (NIL == module0065.f4777(var176_241)) {
                final SubLObject var10 = module0065.f4738(var176_241);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24687(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24244(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_242 = var3;
            if (NIL == module0065.f4775(var169_242, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_242);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24688(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_243 = var3;
            if (NIL == module0065.f4777(var176_243)) {
                final SubLObject var10 = module0065.f4738(var176_243);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24688(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24245(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_244 = var3;
            if (NIL == module0065.f4775(var169_244, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_244);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24689(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_245 = var3;
            if (NIL == module0065.f4777(var176_245)) {
                final SubLObject var10 = module0065.f4738(var176_245);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24689(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24246(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_246 = var3;
            if (NIL == module0065.f4775(var169_246, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_246);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24680(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_247 = var3;
            if (NIL == module0065.f4777(var176_247)) {
                final SubLObject var10 = module0065.f4738(var176_247);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24680(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24247(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_248 = var3;
            if (NIL == module0065.f4775(var169_248, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_248);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24682(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_249 = var3;
            if (NIL == module0065.f4777(var176_249)) {
                final SubLObject var10 = module0065.f4738(var176_249);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24682(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24248(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_250 = var3;
            if (NIL == module0065.f4775(var169_250, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_250);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24681(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_251 = var3;
            if (NIL == module0065.f4777(var176_251)) {
                final SubLObject var10 = module0065.f4738(var176_251);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24681(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24249(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_252 = var3;
            if (NIL == module0065.f4775(var169_252, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_252);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24562(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_253 = var3;
            if (NIL == module0065.f4777(var176_253)) {
                final SubLObject var10 = module0065.f4738(var176_253);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24562(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24250(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_254 = var3;
            if (NIL == module0065.f4775(var169_254, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_254);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24572(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_255 = var3;
            if (NIL == module0065.f4777(var176_255)) {
                final SubLObject var10 = module0065.f4738(var176_255);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24572(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24251(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_256 = var3;
            if (NIL == module0065.f4775(var169_256, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_256);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24575(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_257 = var3;
            if (NIL == module0065.f4777(var176_257)) {
                final SubLObject var10 = module0065.f4738(var176_257);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24575(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24252(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_258 = var3;
            if (NIL == module0065.f4775(var169_258, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_258);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24576(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_259 = var3;
            if (NIL == module0065.f4777(var176_259)) {
                final SubLObject var10 = module0065.f4738(var176_259);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24576(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24253(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_260 = var3;
            if (NIL == module0065.f4775(var169_260, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_260);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24577(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_261 = var3;
            if (NIL == module0065.f4777(var176_261)) {
                final SubLObject var10 = module0065.f4738(var176_261);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24577(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24254(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_262 = var3;
            if (NIL == module0065.f4775(var169_262, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_262);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24685(var9) && NIL != module0363.f24680(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_263 = var3;
            if (NIL == module0065.f4777(var176_263)) {
                final SubLObject var10 = module0065.f4738(var176_263);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24685(var12) && NIL != module0363.f24680(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24255(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_264 = var3;
            if (NIL == module0065.f4775(var169_264, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_264);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24686(var9) && NIL != module0363.f24680(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_265 = var3;
            if (NIL == module0065.f4777(var176_265)) {
                final SubLObject var10 = module0065.f4738(var176_265);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24686(var12) && NIL != module0363.f24680(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24256(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_266 = var3;
            if (NIL == module0065.f4775(var169_266, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_266);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24687(var9) && NIL != module0363.f24680(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_267 = var3;
            if (NIL == module0065.f4777(var176_267)) {
                final SubLObject var10 = module0065.f4738(var176_267);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24687(var12) && NIL != module0363.f24680(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24257(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_268 = var3;
            if (NIL == module0065.f4775(var169_268, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_268);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24688(var9) && NIL != module0363.f24680(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_269 = var3;
            if (NIL == module0065.f4777(var176_269)) {
                final SubLObject var10 = module0065.f4738(var176_269);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24688(var12) && NIL != module0363.f24680(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24258(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_270 = var3;
            if (NIL == module0065.f4775(var169_270, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_270);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24689(var9) && NIL != module0363.f24680(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_271 = var3;
            if (NIL == module0065.f4777(var176_271)) {
                final SubLObject var10 = module0065.f4738(var176_271);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24689(var12) && NIL != module0363.f24680(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24259(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_272 = var3;
            if (NIL == module0065.f4775(var169_272, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_272);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24685(var9) && NIL != module0363.f24682(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_273 = var3;
            if (NIL == module0065.f4777(var176_273)) {
                final SubLObject var10 = module0065.f4738(var176_273);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24685(var12) && NIL != module0363.f24682(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24260(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_274 = var3;
            if (NIL == module0065.f4775(var169_274, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_274);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24686(var9) && NIL != module0363.f24682(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_275 = var3;
            if (NIL == module0065.f4777(var176_275)) {
                final SubLObject var10 = module0065.f4738(var176_275);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24686(var12) && NIL != module0363.f24682(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24261(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_276 = var3;
            if (NIL == module0065.f4775(var169_276, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_276);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24687(var9) && NIL != module0363.f24682(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_277 = var3;
            if (NIL == module0065.f4777(var176_277)) {
                final SubLObject var10 = module0065.f4738(var176_277);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24687(var12) && NIL != module0363.f24682(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24262(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_278 = var3;
            if (NIL == module0065.f4775(var169_278, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_278);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24688(var9) && NIL != module0363.f24682(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_279 = var3;
            if (NIL == module0065.f4777(var176_279)) {
                final SubLObject var10 = module0065.f4738(var176_279);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24688(var12) && NIL != module0363.f24682(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24263(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_280 = var3;
            if (NIL == module0065.f4775(var169_280, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_280);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24689(var9) && NIL != module0363.f24682(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_281 = var3;
            if (NIL == module0065.f4777(var176_281)) {
                final SubLObject var10 = module0065.f4738(var176_281);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24689(var12) && NIL != module0363.f24682(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24264(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_282 = var3;
            if (NIL == module0065.f4775(var169_282, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_282);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24685(var9) && NIL != module0363.f24681(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_283 = var3;
            if (NIL == module0065.f4777(var176_283)) {
                final SubLObject var10 = module0065.f4738(var176_283);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24685(var12) && NIL != module0363.f24681(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24265(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_284 = var3;
            if (NIL == module0065.f4775(var169_284, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_284);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24686(var9) && NIL != module0363.f24681(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_285 = var3;
            if (NIL == module0065.f4777(var176_285)) {
                final SubLObject var10 = module0065.f4738(var176_285);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24686(var12) && NIL != module0363.f24681(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24266(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_286 = var3;
            if (NIL == module0065.f4775(var169_286, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_286);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24687(var9) && NIL != module0363.f24681(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_287 = var3;
            if (NIL == module0065.f4777(var176_287)) {
                final SubLObject var10 = module0065.f4738(var176_287);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24687(var12) && NIL != module0363.f24681(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24267(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_288 = var3;
            if (NIL == module0065.f4775(var169_288, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_288);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24688(var9) && NIL != module0363.f24681(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_289 = var3;
            if (NIL == module0065.f4777(var176_289)) {
                final SubLObject var10 = module0065.f4738(var176_289);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24688(var12) && NIL != module0363.f24681(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24268(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_290 = var3;
            if (NIL == module0065.f4775(var169_290, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_290);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24689(var9) && NIL != module0363.f24681(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_291 = var3;
            if (NIL == module0065.f4777(var176_291)) {
                final SubLObject var10 = module0065.f4738(var176_291);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24689(var12) && NIL != module0363.f24681(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24269(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_292 = var3;
            if (NIL == module0065.f4775(var169_292, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_292);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24680(var9) && NIL != module0363.f24562(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_293 = var3;
            if (NIL == module0065.f4777(var176_293)) {
                final SubLObject var10 = module0065.f4738(var176_293);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24680(var12) && NIL != module0363.f24562(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24270(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_294 = var3;
            if (NIL == module0065.f4775(var169_294, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_294);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24680(var9) && NIL != module0363.f24572(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_295 = var3;
            if (NIL == module0065.f4777(var176_295)) {
                final SubLObject var10 = module0065.f4738(var176_295);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24680(var12) && NIL != module0363.f24572(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24271(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_296 = var3;
            if (NIL == module0065.f4775(var169_296, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_296);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24680(var9) && NIL != module0363.f24575(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_297 = var3;
            if (NIL == module0065.f4777(var176_297)) {
                final SubLObject var10 = module0065.f4738(var176_297);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24680(var12) && NIL != module0363.f24575(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24272(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_298 = var3;
            if (NIL == module0065.f4775(var169_298, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_298);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24680(var9) && NIL != module0363.f24576(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_299 = var3;
            if (NIL == module0065.f4777(var176_299)) {
                final SubLObject var10 = module0065.f4738(var176_299);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24680(var12) && NIL != module0363.f24576(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24273(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_300 = var3;
            if (NIL == module0065.f4775(var169_300, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_300);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24680(var9) && NIL != module0363.f24577(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_301 = var3;
            if (NIL == module0065.f4777(var176_301)) {
                final SubLObject var10 = module0065.f4738(var176_301);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24680(var12) && NIL != module0363.f24577(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24274(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_302 = var3;
            if (NIL == module0065.f4775(var169_302, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_302);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24682(var9) && NIL != module0363.f24562(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_303 = var3;
            if (NIL == module0065.f4777(var176_303)) {
                final SubLObject var10 = module0065.f4738(var176_303);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24682(var12) && NIL != module0363.f24562(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24275(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_304 = var3;
            if (NIL == module0065.f4775(var169_304, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_304);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24682(var9) && NIL != module0363.f24572(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_305 = var3;
            if (NIL == module0065.f4777(var176_305)) {
                final SubLObject var10 = module0065.f4738(var176_305);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24682(var12) && NIL != module0363.f24572(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24276(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_306 = var3;
            if (NIL == module0065.f4775(var169_306, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_306);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24682(var9) && NIL != module0363.f24575(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_307 = var3;
            if (NIL == module0065.f4777(var176_307)) {
                final SubLObject var10 = module0065.f4738(var176_307);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24682(var12) && NIL != module0363.f24575(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24277(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_308 = var3;
            if (NIL == module0065.f4775(var169_308, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_308);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24682(var9) && NIL != module0363.f24576(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_309 = var3;
            if (NIL == module0065.f4777(var176_309)) {
                final SubLObject var10 = module0065.f4738(var176_309);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24682(var12) && NIL != module0363.f24576(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24278(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_310 = var3;
            if (NIL == module0065.f4775(var169_310, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_310);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24682(var9) && NIL != module0363.f24577(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_311 = var3;
            if (NIL == module0065.f4777(var176_311)) {
                final SubLObject var10 = module0065.f4738(var176_311);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24682(var12) && NIL != module0363.f24577(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24279(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_312 = var3;
            if (NIL == module0065.f4775(var169_312, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_312);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24681(var9) && NIL != module0363.f24562(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_313 = var3;
            if (NIL == module0065.f4777(var176_313)) {
                final SubLObject var10 = module0065.f4738(var176_313);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24681(var12) && NIL != module0363.f24562(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24280(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_314 = var3;
            if (NIL == module0065.f4775(var169_314, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_314);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24681(var9) && NIL != module0363.f24572(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_315 = var3;
            if (NIL == module0065.f4777(var176_315)) {
                final SubLObject var10 = module0065.f4738(var176_315);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24681(var12) && NIL != module0363.f24572(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24281(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_316 = var3;
            if (NIL == module0065.f4775(var169_316, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_316);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24681(var9) && NIL != module0363.f24575(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_317 = var3;
            if (NIL == module0065.f4777(var176_317)) {
                final SubLObject var10 = module0065.f4738(var176_317);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24681(var12) && NIL != module0363.f24575(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24282(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_318 = var3;
            if (NIL == module0065.f4775(var169_318, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_318);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24681(var9) && NIL != module0363.f24576(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_319 = var3;
            if (NIL == module0065.f4777(var176_319)) {
                final SubLObject var10 = module0065.f4738(var176_319);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24681(var12) && NIL != module0363.f24576(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24283(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_320 = var3;
            if (NIL == module0065.f4775(var169_320, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_320);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24681(var9) && NIL != module0363.f24577(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_321 = var3;
            if (NIL == module0065.f4777(var176_321)) {
                final SubLObject var10 = module0065.f4738(var176_321);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24681(var12) && NIL != module0363.f24577(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24284(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_322 = var3;
            if (NIL == module0065.f4775(var169_322, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_322);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24685(var9) && NIL != module0363.f24562(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_323 = var3;
            if (NIL == module0065.f4777(var176_323)) {
                final SubLObject var10 = module0065.f4738(var176_323);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24685(var12) && NIL != module0363.f24562(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24285(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_324 = var3;
            if (NIL == module0065.f4775(var169_324, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_324);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24685(var9) && NIL != module0363.f24572(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_325 = var3;
            if (NIL == module0065.f4777(var176_325)) {
                final SubLObject var10 = module0065.f4738(var176_325);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24685(var12) && NIL != module0363.f24572(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24286(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_326 = var3;
            if (NIL == module0065.f4775(var169_326, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_326);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24685(var9) && NIL != module0363.f24575(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_327 = var3;
            if (NIL == module0065.f4777(var176_327)) {
                final SubLObject var10 = module0065.f4738(var176_327);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24685(var12) && NIL != module0363.f24575(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24287(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_328 = var3;
            if (NIL == module0065.f4775(var169_328, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_328);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24685(var9) && NIL != module0363.f24576(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_329 = var3;
            if (NIL == module0065.f4777(var176_329)) {
                final SubLObject var10 = module0065.f4738(var176_329);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24685(var12) && NIL != module0363.f24576(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24288(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_330 = var3;
            if (NIL == module0065.f4775(var169_330, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_330);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24685(var9) && NIL != module0363.f24577(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_331 = var3;
            if (NIL == module0065.f4777(var176_331)) {
                final SubLObject var10 = module0065.f4738(var176_331);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24685(var12) && NIL != module0363.f24577(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24289(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_332 = var3;
            if (NIL == module0065.f4775(var169_332, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_332);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24686(var9) && NIL != module0363.f24562(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_333 = var3;
            if (NIL == module0065.f4777(var176_333)) {
                final SubLObject var10 = module0065.f4738(var176_333);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24686(var12) && NIL != module0363.f24562(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24290(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_334 = var3;
            if (NIL == module0065.f4775(var169_334, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_334);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24686(var9) && NIL != module0363.f24572(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_335 = var3;
            if (NIL == module0065.f4777(var176_335)) {
                final SubLObject var10 = module0065.f4738(var176_335);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24686(var12) && NIL != module0363.f24572(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24291(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_336 = var3;
            if (NIL == module0065.f4775(var169_336, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_336);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24686(var9) && NIL != module0363.f24575(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_337 = var3;
            if (NIL == module0065.f4777(var176_337)) {
                final SubLObject var10 = module0065.f4738(var176_337);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24686(var12) && NIL != module0363.f24575(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24292(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_338 = var3;
            if (NIL == module0065.f4775(var169_338, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_338);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24686(var9) && NIL != module0363.f24576(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_339 = var3;
            if (NIL == module0065.f4777(var176_339)) {
                final SubLObject var10 = module0065.f4738(var176_339);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24686(var12) && NIL != module0363.f24576(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24293(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_340 = var3;
            if (NIL == module0065.f4775(var169_340, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_340);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24686(var9) && NIL != module0363.f24577(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_341 = var3;
            if (NIL == module0065.f4777(var176_341)) {
                final SubLObject var10 = module0065.f4738(var176_341);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24686(var12) && NIL != module0363.f24577(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24294(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_342 = var3;
            if (NIL == module0065.f4775(var169_342, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_342);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24687(var9) && NIL != module0363.f24562(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_343 = var3;
            if (NIL == module0065.f4777(var176_343)) {
                final SubLObject var10 = module0065.f4738(var176_343);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24687(var12) && NIL != module0363.f24562(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24295(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_344 = var3;
            if (NIL == module0065.f4775(var169_344, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_344);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24687(var9) && NIL != module0363.f24572(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_345 = var3;
            if (NIL == module0065.f4777(var176_345)) {
                final SubLObject var10 = module0065.f4738(var176_345);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24687(var12) && NIL != module0363.f24572(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24296(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_346 = var3;
            if (NIL == module0065.f4775(var169_346, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_346);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24687(var9) && NIL != module0363.f24575(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_347 = var3;
            if (NIL == module0065.f4777(var176_347)) {
                final SubLObject var10 = module0065.f4738(var176_347);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24687(var12) && NIL != module0363.f24575(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24297(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_348 = var3;
            if (NIL == module0065.f4775(var169_348, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_348);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24687(var9) && NIL != module0363.f24576(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_349 = var3;
            if (NIL == module0065.f4777(var176_349)) {
                final SubLObject var10 = module0065.f4738(var176_349);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24687(var12) && NIL != module0363.f24576(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24298(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_350 = var3;
            if (NIL == module0065.f4775(var169_350, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_350);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24687(var9) && NIL != module0363.f24577(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_351 = var3;
            if (NIL == module0065.f4777(var176_351)) {
                final SubLObject var10 = module0065.f4738(var176_351);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24687(var12) && NIL != module0363.f24577(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24299(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_352 = var3;
            if (NIL == module0065.f4775(var169_352, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_352);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24688(var9) && NIL != module0363.f24562(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_353 = var3;
            if (NIL == module0065.f4777(var176_353)) {
                final SubLObject var10 = module0065.f4738(var176_353);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24688(var12) && NIL != module0363.f24562(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24300(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_354 = var3;
            if (NIL == module0065.f4775(var169_354, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_354);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24688(var9) && NIL != module0363.f24572(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_355 = var3;
            if (NIL == module0065.f4777(var176_355)) {
                final SubLObject var10 = module0065.f4738(var176_355);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24688(var12) && NIL != module0363.f24572(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24301(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_356 = var3;
            if (NIL == module0065.f4775(var169_356, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_356);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24688(var9) && NIL != module0363.f24575(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_357 = var3;
            if (NIL == module0065.f4777(var176_357)) {
                final SubLObject var10 = module0065.f4738(var176_357);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24688(var12) && NIL != module0363.f24575(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24302(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_358 = var3;
            if (NIL == module0065.f4775(var169_358, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_358);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24688(var9) && NIL != module0363.f24576(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_359 = var3;
            if (NIL == module0065.f4777(var176_359)) {
                final SubLObject var10 = module0065.f4738(var176_359);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24688(var12) && NIL != module0363.f24576(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24303(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_360 = var3;
            if (NIL == module0065.f4775(var169_360, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_360);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24688(var9) && NIL != module0363.f24577(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_361 = var3;
            if (NIL == module0065.f4777(var176_361)) {
                final SubLObject var10 = module0065.f4738(var176_361);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24688(var12) && NIL != module0363.f24577(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24304(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_362 = var3;
            if (NIL == module0065.f4775(var169_362, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_362);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24689(var9) && NIL != module0363.f24562(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_363 = var3;
            if (NIL == module0065.f4777(var176_363)) {
                final SubLObject var10 = module0065.f4738(var176_363);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24689(var12) && NIL != module0363.f24562(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24305(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_364 = var3;
            if (NIL == module0065.f4775(var169_364, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_364);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24689(var9) && NIL != module0363.f24572(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_365 = var3;
            if (NIL == module0065.f4777(var176_365)) {
                final SubLObject var10 = module0065.f4738(var176_365);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24689(var12) && NIL != module0363.f24572(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24306(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_366 = var3;
            if (NIL == module0065.f4775(var169_366, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_366);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24689(var9) && NIL != module0363.f24575(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_367 = var3;
            if (NIL == module0065.f4777(var176_367)) {
                final SubLObject var10 = module0065.f4738(var176_367);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24689(var12) && NIL != module0363.f24575(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24307(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_368 = var3;
            if (NIL == module0065.f4775(var169_368, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_368);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24689(var9) && NIL != module0363.f24576(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_369 = var3;
            if (NIL == module0065.f4777(var176_369)) {
                final SubLObject var10 = module0065.f4738(var176_369);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24689(var12) && NIL != module0363.f24576(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24308(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_370 = var3;
            if (NIL == module0065.f4775(var169_370, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_370);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0363.f24689(var9) && NIL != module0363.f24577(var9)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var176_371 = var3;
            if (NIL == module0065.f4777(var176_371)) {
                final SubLObject var10 = module0065.f4738(var176_371);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        if (NIL != module0363.f24689(var12) && NIL != module0363.f24577(var12)) {
                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24309(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_373 = var3;
            if (NIL == module0065.f4775(var169_373, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_373);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                SubLObject var10;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        var10 = module0363.f24641(var9);
                        var2 = conses_high.nreconc(var10, var2);
                    }
                }
            }
            final SubLObject var176_375 = var3;
            if (NIL == module0065.f4777(var176_375)) {
                final SubLObject var11 = module0065.f4738(var176_375);
                SubLObject var12 = (SubLObject)NIL;
                SubLObject var13 = (SubLObject)NIL;
                final Iterator var14 = Hashtables.getEntrySetIterator(var11);
                try {
                    while (Hashtables.iteratorHasNext(var14)) {
                        final Map.Entry var15 = Hashtables.iteratorNextEntry(var14);
                        var12 = Hashtables.getEntryKey(var15);
                        var13 = Hashtables.getEntryValue(var15);
                        final SubLObject var16 = module0363.f24641(var13);
                        var2 = conses_high.nreconc(var16, var2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var14);
                }
            }
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f24310(final SubLObject var1, SubLObject var376) {
        if (var376 == UNPROVIDED) {
            var376 = (SubLObject)NIL;
        }
        SubLObject var377 = (SubLObject)ZERO_INTEGER;
        final SubLObject var378 = f24128(var1);
        if (NIL == module0065.f4772(var378, (SubLObject)$ic278$)) {
            final SubLObject var169_377 = var378;
            if (NIL == module0065.f4775(var169_377, (SubLObject)$ic278$)) {
                final SubLObject var379 = module0065.f4740(var169_377);
                final SubLObject var380 = (SubLObject)NIL;
                SubLObject var381;
                SubLObject var382;
                SubLObject var383;
                SubLObject var384;
                for (var381 = Sequences.length(var379), var382 = (SubLObject)NIL, var382 = (SubLObject)ZERO_INTEGER; var382.numL(var381); var382 = Numbers.add(var382, (SubLObject)ONE_INTEGER)) {
                    var383 = ((NIL != var380) ? Numbers.subtract(var381, var382, (SubLObject)ONE_INTEGER) : var382);
                    var384 = Vectors.aref(var379, var383);
                    if (NIL == module0065.f4749(var384) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var384)) {
                            var384 = (SubLObject)$ic278$;
                        }
                        var377 = Numbers.add(var377, module0363.f24621(var384, var376));
                    }
                }
            }
            final SubLObject var176_378 = var378;
            if (NIL == module0065.f4777(var176_378)) {
                final SubLObject var385 = module0065.f4738(var176_378);
                SubLObject var386 = (SubLObject)NIL;
                SubLObject var387 = (SubLObject)NIL;
                final Iterator var388 = Hashtables.getEntrySetIterator(var385);
                try {
                    while (Hashtables.iteratorHasNext(var388)) {
                        final Map.Entry var389 = Hashtables.iteratorNextEntry(var388);
                        var386 = Hashtables.getEntryKey(var389);
                        var387 = Hashtables.getEntryValue(var389);
                        var377 = Numbers.add(var377, module0363.f24621(var387, var376));
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var388);
                }
            }
        }
        return var377;
    }
    
    public static SubLObject f24311(final SubLObject var1, SubLObject var113, SubLObject var376) {
        if (var113 == UNPROVIDED) {
            var113 = (SubLObject)NIL;
        }
        if (var376 == UNPROVIDED) {
            var376 = (SubLObject)NIL;
        }
        SubLObject var377 = (SubLObject)ZERO_INTEGER;
        final SubLObject var378 = f24128(var1);
        if (NIL == module0065.f4772(var378, (SubLObject)$ic278$)) {
            final SubLObject var169_379 = var378;
            if (NIL == module0065.f4775(var169_379, (SubLObject)$ic278$)) {
                final SubLObject var379 = module0065.f4740(var169_379);
                final SubLObject var380 = (SubLObject)NIL;
                SubLObject var381;
                SubLObject var382;
                SubLObject var383;
                SubLObject var384;
                for (var381 = Sequences.length(var379), var382 = (SubLObject)NIL, var382 = (SubLObject)ZERO_INTEGER; var382.numL(var381); var382 = Numbers.add(var382, (SubLObject)ONE_INTEGER)) {
                    var383 = ((NIL != var380) ? Numbers.subtract(var381, var382, (SubLObject)ONE_INTEGER) : var382);
                    var384 = Vectors.aref(var379, var383);
                    if (NIL == module0065.f4749(var384) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var384)) {
                            var384 = (SubLObject)$ic278$;
                        }
                        var377 = Numbers.add(var377, module0363.f24624(var384, var113, var376));
                    }
                }
            }
            final SubLObject var176_380 = var378;
            if (NIL == module0065.f4777(var176_380)) {
                final SubLObject var385 = module0065.f4738(var176_380);
                SubLObject var386 = (SubLObject)NIL;
                SubLObject var387 = (SubLObject)NIL;
                final Iterator var388 = Hashtables.getEntrySetIterator(var385);
                try {
                    while (Hashtables.iteratorHasNext(var388)) {
                        final Map.Entry var389 = Hashtables.iteratorNextEntry(var388);
                        var386 = Hashtables.getEntryKey(var389);
                        var387 = Hashtables.getEntryValue(var389);
                        var377 = Numbers.add(var377, module0363.f24624(var387, var113, var376));
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var388);
                }
            }
        }
        return var377;
    }
    
    public static SubLObject f24312(final SubLObject var1) {
        return f24310(var1, (SubLObject)NIL);
    }
    
    public static SubLObject f24313(final SubLObject var1) {
        return f24054(var1);
    }
    
    public static SubLObject f24314(final SubLObject var1) {
        f24102(var1, Numbers.add(f24054(var1), (SubLObject)ONE_INTEGER));
        return var1;
    }
    
    public static SubLObject f24315(final SubLObject var1) {
        return f24310(var1, (SubLObject)$ic297$);
    }
    
    public static SubLObject f24316(final SubLObject var1) {
        return f24310(var1, (SubLObject)$ic298$);
    }
    
    public static SubLObject f24317(final SubLObject var1) {
        return f24310(var1, (SubLObject)$ic299$);
    }
    
    public static SubLObject f24233(final SubLObject var1) {
        return module0065.f4733(f24018(var1));
    }
    
    public static SubLObject f24318(final SubLObject var1) {
        return module0065.f4734(f24018(var1));
    }
    
    public static SubLObject f24319(final SubLObject var1, final SubLObject var381) {
        final SubLObject var382 = f24018(var1);
        return module0065.f4750(var382, var381, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f24320(final SubLObject var202, final SubLObject var381) {
        final SubLObject var382 = f23997(var202);
        if (NIL != var382) {
            return f24319(var382, var381);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24321(final SubLObject var1) {
        return module0067.f4883(f24148(var1));
    }
    
    public static SubLObject f24322(final SubLObject var1) {
        return module0067.f4861(f24148(var1));
    }
    
    public static SubLObject f24323(final SubLObject var1) {
        return Numbers.subtract(f24233(var1), f24322(var1));
    }
    
    public static SubLObject f24324(final SubLObject var1) {
        return Sort.sort(module0077.f5312(f24149(var1)), Symbols.symbol_function((SubLObject)$ic300$), Symbols.symbol_function((SubLObject)$ic301$));
    }
    
    public static SubLObject f24325(final SubLObject var1) {
        return Sort.sort(module0077.f5312(f24150(var1)), Symbols.symbol_function((SubLObject)$ic300$), Symbols.symbol_function((SubLObject)$ic302$));
    }
    
    public static SubLObject f24326(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL == module0067.f4882(f24152(var1)));
    }
    
    public static SubLObject f24327(final SubLObject var1, final SubLObject var187) {
        return module0067.f4885(f24152(var1), var187, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f24112(final SubLObject var1) {
        return Numbers.add(f24228(var1), f24208(var1), f24233(var1));
    }
    
    public static SubLObject f24328(final SubLObject var1) {
        return Numbers.add(f24229(var1), f24209(var1), f24318(var1));
    }
    
    public static SubLObject f24329(final SubLObject var1) {
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = f24130(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_382 = var3;
            if (NIL == module0065.f4775(var169_382, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_382);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        var2 = Numbers.add(var2, module0364.f24751(var9));
                    }
                }
            }
            final SubLObject var176_383 = var3;
            if (NIL == module0065.f4777(var176_383)) {
                final SubLObject var10 = module0065.f4738(var176_383);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        var2 = Numbers.add(var2, module0364.f24751(var12));
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24330(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = f24130(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_384 = var3;
            if (NIL == module0065.f4775(var169_384, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_384);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0364.f24748(var9, (SubLObject)$ic287$)) {
                            var2 = var9;
                        }
                    }
                }
            }
            final SubLObject var385_386 = var3;
            if (NIL == module0065.f4777(var385_386) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                final SubLObject var10 = module0065.f4738(var385_386);
                SubLObject var11 = module0065.f4739(var385_386);
                final SubLObject var12 = module0065.f4734(var385_386);
                final SubLObject var13 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic278$)) ? NIL : $ic278$);
                while (var11.numL(var12)) {
                    final SubLObject var14 = Hashtables.gethash_without_values(var11, var10, var13);
                    if ((NIL == module0065.f4773((SubLObject)$ic278$) || NIL == module0065.f4749(var14)) && NIL != module0364.f24748(var14, (SubLObject)$ic287$)) {
                        var2 = var14;
                    }
                    var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f24331(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        SubLObject var2 = module0032.f1726((SubLObject)ZERO_INTEGER, Symbols.symbol_function((SubLObject)EQ));
        final SubLObject var3 = f24130(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_391 = var3;
            if (NIL == module0065.f4775(var169_391, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_391);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                SubLObject var10;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0364.f24748(var9, (SubLObject)$ic287$)) {
                            var10 = module0377.f26749(var9);
                            var2 = module0032.f1736(var10, var2, Symbols.symbol_function((SubLObject)EQ));
                        }
                    }
                }
            }
            final SubLObject var176_394 = var3;
            if (NIL == module0065.f4777(var176_394)) {
                final SubLObject var11 = module0065.f4738(var176_394);
                SubLObject var12 = (SubLObject)NIL;
                SubLObject var13 = (SubLObject)NIL;
                final Iterator var14 = Hashtables.getEntrySetIterator(var11);
                try {
                    while (Hashtables.iteratorHasNext(var14)) {
                        final Map.Entry var15 = Hashtables.iteratorNextEntry(var14);
                        var12 = Hashtables.getEntryKey(var15);
                        var13 = Hashtables.getEntryValue(var15);
                        if (NIL != module0364.f24748(var13, (SubLObject)$ic287$)) {
                            final SubLObject var16 = module0377.f26749(var13);
                            var2 = module0032.f1736(var16, var2, Symbols.symbol_function((SubLObject)EQ));
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var14);
                }
            }
        }
        return module0032.f1753(var2);
    }
    
    public static SubLObject f24332(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        final SubLObject var2 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        final SubLObject var3 = f24130(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_396 = var3;
            if (NIL == module0065.f4775(var169_396, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_396);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                SubLObject var10;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0364.f24748(var9, (SubLObject)$ic290$)) {
                            var10 = module0381.f27051(var9);
                            module0077.f5326(var10, var2);
                        }
                    }
                }
            }
            final SubLObject var176_398 = var3;
            if (NIL == module0065.f4777(var176_398)) {
                final SubLObject var11 = module0065.f4738(var176_398);
                SubLObject var12 = (SubLObject)NIL;
                SubLObject var13 = (SubLObject)NIL;
                final Iterator var14 = Hashtables.getEntrySetIterator(var11);
                try {
                    while (Hashtables.iteratorHasNext(var14)) {
                        final Map.Entry var15 = Hashtables.iteratorNextEntry(var14);
                        var12 = Hashtables.getEntryKey(var15);
                        var13 = Hashtables.getEntryValue(var15);
                        if (NIL != module0364.f24748(var13, (SubLObject)$ic290$)) {
                            final SubLObject var16 = module0381.f27051(var13);
                            module0077.f5326(var16, var2);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var14);
                }
            }
        }
        return Sort.sort(module0077.f5312(var2), Symbols.symbol_function((SubLObject)$ic300$), Symbols.symbol_function((SubLObject)$ic302$));
    }
    
    public static SubLObject f24333(final SubLObject var1) {
        final SubLObject var2 = f24179(var1);
        return f24334(var2);
    }
    
    public static SubLObject f24335(final SubLObject var1) {
        final SubLObject var2 = f24179(var1);
        return (SubLObject)makeBoolean(NIL == f24334(var2));
    }
    
    public static SubLObject f24336(final SubLObject var399, final SubLObject var400) {
        return Numbers.numE(f24228(var399), f24228(var400));
    }
    
    public static SubLObject f24337(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = f24130(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_402 = var3;
            if (NIL == module0065.f4775(var169_402, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_402);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        if (NIL != module0364.f24748(var9, (SubLObject)$ic287$)) {
                            var10 = module0377.f26749(var9);
                            var11 = module0377.f26763(var9);
                            var12 = module0363.f24565(module0364.f24725(var9));
                            var2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var10, var11, var12), var2);
                        }
                    }
                }
            }
            final SubLObject var176_405 = var3;
            if (NIL == module0065.f4777(var176_405)) {
                final SubLObject var13 = module0065.f4738(var176_405);
                SubLObject var14 = (SubLObject)NIL;
                SubLObject var15 = (SubLObject)NIL;
                final Iterator var16 = Hashtables.getEntrySetIterator(var13);
                try {
                    while (Hashtables.iteratorHasNext(var16)) {
                        final Map.Entry var17 = Hashtables.iteratorNextEntry(var16);
                        var14 = Hashtables.getEntryKey(var17);
                        var15 = Hashtables.getEntryValue(var17);
                        if (NIL != module0364.f24748(var15, (SubLObject)$ic287$)) {
                            final SubLObject var18 = module0377.f26749(var15);
                            final SubLObject var19 = module0377.f26763(var15);
                            final SubLObject var20 = module0363.f24565(module0364.f24725(var15));
                            var2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var18, var19, var20), var2);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var16);
                }
            }
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f24338(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_406 = var3;
            if (NIL == module0065.f4775(var169_406, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_406);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        var2 = (SubLObject)ConsesLow.cons(var9, var2);
                    }
                }
            }
            final SubLObject var176_407 = var3;
            if (NIL == module0065.f4777(var176_407)) {
                final SubLObject var10 = module0065.f4738(var176_407);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        var2 = (SubLObject)ConsesLow.cons(var12, var2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return Sort.sort(var2, Symbols.symbol_function((SubLObject)$ic300$), Symbols.symbol_function((SubLObject)$ic302$));
    }
    
    public static SubLObject f24339(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = f24128(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_409 = var3;
            if (NIL == module0065.f4775(var169_409, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_409);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        var2 = (SubLObject)ConsesLow.cons(module0363.f24509(var9), var2);
                    }
                }
            }
            final SubLObject var176_410 = var3;
            if (NIL == module0065.f4777(var176_410)) {
                final SubLObject var10 = module0065.f4738(var176_410);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        var2 = (SubLObject)ConsesLow.cons(module0363.f24509(var12), var2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f24340(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = f24130(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_412 = var3;
            if (NIL == module0065.f4775(var169_412, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_412);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        var2 = (SubLObject)ConsesLow.cons(var9, var2);
                    }
                }
            }
            final SubLObject var176_413 = var3;
            if (NIL == module0065.f4777(var176_413)) {
                final SubLObject var10 = module0065.f4738(var176_413);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                final Iterator var13 = Hashtables.getEntrySetIterator(var10);
                try {
                    while (Hashtables.iteratorHasNext(var13)) {
                        final Map.Entry var14 = Hashtables.iteratorNextEntry(var13);
                        var11 = Hashtables.getEntryKey(var14);
                        var12 = Hashtables.getEntryValue(var14);
                        var2 = (SubLObject)ConsesLow.cons(var12, var2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var13);
                }
            }
        }
        return Sort.sort(var2, Symbols.symbol_function((SubLObject)$ic300$), Symbols.symbol_function((SubLObject)$ic303$));
    }
    
    public static SubLObject f24341(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = f24132(var1);
        if (NIL == module0065.f4772(var3, (SubLObject)$ic278$)) {
            final SubLObject var169_415 = var3;
            if (NIL == module0065.f4775(var169_415, (SubLObject)$ic278$)) {
                final SubLObject var4 = module0065.f4740(var169_415);
                final SubLObject var5 = (SubLObject)NIL;
                SubLObject var6;
                SubLObject var7;
                SubLObject var8;
                SubLObject var9;
                for (var6 = Sequences.length(var4), var7 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER; var7.numL(var6); var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER)) {
                    var8 = ((NIL != var5) ? Numbers.subtract(var6, var7, (SubLObject)ONE_INTEGER) : var7);
                    var9 = Vectors.aref(var4, var8);
                    if (NIL == module0065.f4749(var9) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                        if (NIL != module0065.f4749(var9)) {
                            var9 = (SubLObject)$ic278$;
                        }
                        var2 = (SubLObject)ConsesLow.cons(var9, var2);
                    }
                }
            }
            final SubLObject var385_416 = var3;
            if (NIL == module0065.f4777(var385_416) || NIL == module0065.f4773((SubLObject)$ic278$)) {
                final SubLObject var10 = module0065.f4738(var385_416);
                SubLObject var11 = module0065.f4739(var385_416);
                final SubLObject var12 = module0065.f4734(var385_416);
                final SubLObject var13 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic278$)) ? NIL : $ic278$);
                while (var11.numL(var12)) {
                    final SubLObject var14 = Hashtables.gethash_without_values(var11, var10, var13);
                    if (NIL == module0065.f4773((SubLObject)$ic278$) || NIL == module0065.f4749(var14)) {
                        var2 = (SubLObject)ConsesLow.cons(var14, var2);
                    }
                    var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f24342(final SubLObject var1, final SubLObject var195) {
        return module0077.f5320(var195, f24053(var1));
    }
    
    public static SubLObject f24343(final SubLObject var1) {
        return module0077.f5311(f24053(var1));
    }
    
    public static SubLObject f24344(final SubLObject var1, final SubLObject var195) {
        return module0084.f5808(f24056(var1), var195);
    }
    
    public static SubLObject f24345(final SubLObject var1, final SubLObject var195) {
        return module0067.f4885(f24056(var1), var195, (SubLObject)$ic304$);
    }
    
    public static SubLObject f24346(final SubLObject var1, final SubLObject var232) {
        final SubLObject var233 = module0362.f24470(var232);
        final SubLObject var234 = f24055(var1);
        SubLObject var236;
        final SubLObject var235 = var236 = module0067.f4885(var234, var233, (SubLObject)NIL);
        SubLObject var237 = (SubLObject)NIL;
        var237 = var236.first();
        while (NIL != var236) {
            final SubLObject var238 = module0363.f24509(var237);
            final SubLObject var239 = module0235.f15487(var238, var232);
            if (NIL != var239) {
                return Values.values(var237, var239);
            }
            var236 = var236.rest();
            var237 = var236.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24145(final SubLObject var1) {
        Hashtables.clrhash(f24057(var1));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24347(final SubLObject var195) {
        return Hashtables.gethash_without_values(var195, f24057(module0363.f24507(var195)), (SubLObject)$ic305$);
    }
    
    public static SubLObject f24348(final SubLObject var195) {
        final SubLObject var196 = f24347(var195);
        return (SubLObject)makeBoolean(var196 != $ic306$ && var196 != $ic305$);
    }
    
    public static SubLObject f24349(final SubLObject var195) {
        return Equality.eq((SubLObject)$ic306$, f24347(var195));
    }
    
    public static SubLObject f24350(final SubLObject var195) {
        return Equality.eq((SubLObject)$ic305$, f24347(var195));
    }
    
    public static SubLObject f24351(final SubLObject var195, final SubLObject var422) {
        final SubLThread var423 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var423) && NIL != module0035.f2169(var422, (SubLObject)$ic307$)) {
            Errors.error((SubLObject)$ic308$, var422, var195);
        }
        Hashtables.sethash(var195, f24057(module0363.f24507(var195)), var422);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24352(final SubLObject var195) {
        Hashtables.sethash(var195, f24057(module0363.f24507(var195)), (SubLObject)$ic306$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24353(final SubLObject var1, final SubLObject var423) {
        assert NIL != f24009(var1) : var1;
        assert NIL != module0004.f106(var423) : var423;
        final SubLObject var424 = f24115(var1);
        SubLObject var425 = (SubLObject)NIL;
        try {
            var425 = Locks.seize_lock(var424);
            final SubLObject var426 = f24019(var1);
            f24067(var1, module0030.f1611(var426, var423));
        }
        finally {
            if (NIL != var425) {
                Locks.release_lock(var424);
            }
        }
        return module0065.f4760(f24016(var1), var423);
    }
    
    public static SubLObject f24354(final SubLObject var1, final SubLObject var423) {
        assert NIL != f24009(var1) : var1;
        assert NIL != module0004.f106(var423) : var423;
        return module0065.f4760(f24017(var1), var423);
    }
    
    public static SubLObject f24355(final SubLObject var1, final SubLObject var423) {
        assert NIL != f24009(var1) : var1;
        assert NIL != module0004.f106(var423) : var423;
        return module0065.f4760(f24018(var1), var423);
    }
    
    public static SubLObject f24356(final SubLObject var1) {
        final SubLObject var2 = f24123(var1);
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = f24115(var1);
        SubLObject var5 = (SubLObject)NIL;
        try {
            var5 = Locks.seize_lock(var4);
            var3 = module0065.f4746(var2);
        }
        finally {
            if (NIL != var5) {
                Locks.release_lock(var4);
            }
        }
        return var3;
    }
    
    public static SubLObject f24357(final SubLObject var1) {
        final SubLObject var2 = f24125(var1);
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = f24115(var1);
        SubLObject var5 = (SubLObject)NIL;
        try {
            var5 = Locks.seize_lock(var4);
            var3 = module0065.f4746(var2);
        }
        finally {
            if (NIL != var5) {
                Locks.release_lock(var4);
            }
        }
        return var3;
    }
    
    public static SubLObject f24358(final SubLObject var1) {
        final SubLObject var2 = f24128(var1);
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = f24115(var1);
        SubLObject var5 = (SubLObject)NIL;
        try {
            var5 = Locks.seize_lock(var4);
            var3 = module0065.f4746(var2);
        }
        finally {
            if (NIL != var5) {
                Locks.release_lock(var4);
            }
        }
        return var3;
    }
    
    public static SubLObject f24359(final SubLObject var1) {
        final SubLObject var2 = f24130(var1);
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = f24115(var1);
        SubLObject var5 = (SubLObject)NIL;
        try {
            var5 = Locks.seize_lock(var4);
            var3 = module0065.f4746(var2);
        }
        finally {
            if (NIL != var5) {
                Locks.release_lock(var4);
            }
        }
        return var3;
    }
    
    public static SubLObject f24360(final SubLObject var1) {
        final SubLObject var2 = f24132(var1);
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = f24115(var1);
        SubLObject var5 = (SubLObject)NIL;
        try {
            var5 = Locks.seize_lock(var4);
            var3 = module0065.f4746(var2);
        }
        finally {
            if (NIL != var5) {
                Locks.release_lock(var4);
            }
        }
        return var3;
    }
    
    public static SubLObject f24361(final SubLObject var1, final SubLObject var141) {
        final SubLObject var142 = inference_datastructures_inference_oc.f25422(var141);
        final SubLObject var143 = f24115(var1);
        SubLObject var144 = (SubLObject)NIL;
        try {
            var144 = Locks.seize_lock(var143);
            module0065.f4758(f24014(var1), var142, var141, (SubLObject)NIL);
        }
        finally {
            if (NIL != var144) {
                Locks.release_lock(var143);
            }
        }
        return var1;
    }
    
    public static SubLObject f24362(final SubLObject var1, final SubLObject var141) {
        final SubLObject var142 = inference_datastructures_inference_oc.f25422(var141);
        final SubLObject var143 = f24115(var1);
        SubLObject var144 = (SubLObject)NIL;
        try {
            var144 = Locks.seize_lock(var143);
            module0065.f4761(f24014(var1), var142);
            f24363(var1, var141);
            f24364(var1, var141);
            f24365(var1, var141);
        }
        finally {
            if (NIL != var144) {
                Locks.release_lock(var143);
            }
        }
        return var1;
    }
    
    public static SubLObject f24366(final SubLObject var1, final SubLObject var183) {
        final SubLObject var184 = module0367.f25036(var183);
        final SubLObject var185 = f24115(var1);
        SubLObject var186 = (SubLObject)NIL;
        try {
            var186 = Locks.seize_lock(var185);
            module0065.f4758(f24015(var1), var184, var183, (SubLObject)NIL);
        }
        finally {
            if (NIL != var186) {
                Locks.release_lock(var185);
            }
        }
        return var1;
    }
    
    public static SubLObject f24367(final SubLObject var1, final SubLObject var183) {
        final SubLObject var184 = module0367.f25036(var183);
        final SubLObject var185 = f24115(var1);
        SubLObject var186 = (SubLObject)NIL;
        try {
            var186 = Locks.seize_lock(var185);
            module0065.f4761(f24015(var1), var184);
        }
        finally {
            if (NIL != var186) {
                Locks.release_lock(var185);
            }
        }
        return var1;
    }
    
    public static SubLObject f24368(final SubLObject var1, final SubLObject var195) {
        final SubLObject var196 = module0363.f24508(var195);
        final SubLObject var197 = f24115(var1);
        SubLObject var198 = (SubLObject)NIL;
        try {
            var198 = Locks.seize_lock(var197);
            module0065.f4758(f24016(var1), var196, var195, (SubLObject)NIL);
        }
        finally {
            if (NIL != var198) {
                Locks.release_lock(var197);
            }
        }
        return var1;
    }
    
    public static SubLObject f24369(final SubLObject var1, final SubLObject var195) {
        final SubLObject var196 = module0363.f24508(var195);
        final SubLObject var197 = f24115(var1);
        SubLObject var198 = (SubLObject)NIL;
        try {
            var198 = Locks.seize_lock(var197);
            module0065.f4761(f24016(var1), var196);
        }
        finally {
            if (NIL != var198) {
                Locks.release_lock(var197);
            }
        }
        return var1;
    }
    
    public static SubLObject f24370(final SubLObject var1, final SubLObject var195) {
        if (NIL != module0363.f24582(var195)) {
            final SubLObject var196 = module0363.f24509(var195);
            final SubLObject var197 = f24115(var1);
            SubLObject var198 = (SubLObject)NIL;
            try {
                var198 = Locks.seize_lock(var197);
                Hashtables.sethash(var196, f24019(var1), var195);
            }
            finally {
                if (NIL != var198) {
                    Locks.release_lock(var197);
                }
            }
        }
        return var1;
    }
    
    public static SubLObject f24371(final SubLObject var1, final SubLObject var195) {
        if (NIL != module0363.f24582(var195)) {
            final SubLObject var196 = module0363.f24509(var195);
            final SubLObject var197 = f24115(var1);
            SubLObject var198 = (SubLObject)NIL;
            try {
                var198 = Locks.seize_lock(var197);
                Hashtables.remhash(var196, f24019(var1));
            }
            finally {
                if (NIL != var198) {
                    Locks.release_lock(var197);
                }
            }
        }
        return var1;
    }
    
    public static SubLObject f24372(final SubLObject var1, final SubLObject var191) {
        final SubLObject var192 = module0364.f24723(var191);
        final SubLObject var193 = f24115(var1);
        SubLObject var194 = (SubLObject)NIL;
        try {
            var194 = Locks.seize_lock(var193);
            module0065.f4758(f24017(var1), var192, var191, (SubLObject)NIL);
        }
        finally {
            if (NIL != var194) {
                Locks.release_lock(var193);
            }
        }
        return var1;
    }
    
    public static SubLObject f24373(final SubLObject var1, final SubLObject var191) {
        final SubLObject var192 = module0364.f24723(var191);
        final SubLObject var193 = f24115(var1);
        SubLObject var194 = (SubLObject)NIL;
        try {
            var194 = Locks.seize_lock(var193);
            module0065.f4761(f24017(var1), var192);
        }
        finally {
            if (NIL != var194) {
                Locks.release_lock(var193);
            }
        }
        return var1;
    }
    
    public static SubLObject f24374(final SubLObject var1, final SubLObject var187) {
        final SubLObject var188 = module0366.f24935(var187);
        final SubLObject var189 = f24115(var1);
        SubLObject var190 = (SubLObject)NIL;
        try {
            var190 = Locks.seize_lock(var189);
            module0065.f4758(f24018(var1), var188, var187, (SubLObject)NIL);
        }
        finally {
            if (NIL != var190) {
                Locks.release_lock(var189);
            }
        }
        return var1;
    }
    
    public static SubLObject f24375(final SubLObject var1, final SubLObject var187) {
        final SubLObject var188 = module0366.f24935(var187);
        final SubLObject var189 = f24115(var1);
        SubLObject var190 = (SubLObject)NIL;
        try {
            var190 = Locks.seize_lock(var189);
            module0065.f4761(f24018(var1), var188);
        }
        finally {
            if (NIL != var190) {
                Locks.release_lock(var189);
            }
        }
        return var1;
    }
    
    public static SubLObject f24376(final SubLObject var1, final SubLObject var187) {
        assert NIL != f24009(var1) : var1;
        assert NIL != module0366.f24957(var187) : var187;
        final SubLObject var188 = f24148(var1);
        module0067.f4887(var188, var187);
        return var1;
    }
    
    public static SubLObject f24377(final SubLObject var1, final SubLObject var187) {
        assert NIL != f24009(var1) : var1;
        assert NIL != module0366.f24916(var187) : var187;
        final SubLObject var188 = f24149(var1);
        module0077.f5326(var187, var188);
        return var1;
    }
    
    public static SubLObject f24378(final SubLObject var1, final SubLObject var187) {
        assert NIL != f24009(var1) : var1;
        assert NIL != module0366.f24916(var187) : var187;
        final SubLObject var188 = f24149(var1);
        module0077.f5327(var187, var188);
        return var1;
    }
    
    public static SubLObject f24379(final SubLObject var1, final SubLObject var195) {
        assert NIL != f24009(var1) : var1;
        assert NIL != module0363.f24478(var195) : var195;
        final SubLObject var196 = f24150(var1);
        module0077.f5326(var195, var196);
        return var1;
    }
    
    public static SubLObject f24380(final SubLObject var1, final SubLObject var195) {
        assert NIL != f24009(var1) : var1;
        assert NIL != module0363.f24478(var195) : var195;
        final SubLObject var196 = f24150(var1);
        module0077.f5327(var195, var196);
        return var1;
    }
    
    public static SubLObject f24381(final SubLObject var1) {
        final SubLObject var2 = f24115(var1);
        SubLObject var3 = (SubLObject)NIL;
        try {
            var3 = Locks.seize_lock(var2);
            f24071(var1, (SubLObject)T);
        }
        finally {
            if (NIL != var3) {
                Locks.release_lock(var2);
            }
        }
        return var1;
    }
    
    public static SubLObject f24382(final SubLObject var1, final SubLObject var187, final SubLObject var466) {
        final SubLObject var467 = f24115(var1);
        SubLObject var468 = (SubLObject)NIL;
        try {
            var468 = Locks.seize_lock(var467);
            module0084.f5765(f24152(var1), var187, var466, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var468) {
                Locks.release_lock(var467);
            }
        }
        return var1;
    }
    
    public static SubLObject f24383(final SubLObject var187, final SubLObject var466) {
        assert NIL != module0366.f24916(var187) : var187;
        assert NIL != module0366.f24916(var466) : var466;
        final SubLObject var467 = module0366.f24936(var187);
        f24382(var467, var187, var466);
        return var187;
    }
    
    public static SubLObject f24384(final SubLObject var1) {
        f24077(var1, Hashtables.make_hash_table(f24228(var1), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return var1;
    }
    
    public static SubLObject f24363(final SubLObject var1, final SubLObject var141) {
        final SubLObject var142 = f24154(var1);
        module0067.f4887(var142, var141);
        return var1;
    }
    
    public static SubLObject f24364(final SubLObject var1, final SubLObject var141) {
        final SubLObject var142 = f24155(var1);
        module0067.f4887(var142, var141);
        return var1;
    }
    
    public static SubLObject f24365(final SubLObject var1, final SubLObject var141) {
        final SubLObject var142 = f24156(var1);
        module0067.f4887(var142, var141);
        return var1;
    }
    
    public static SubLObject f24385(final SubLObject var1, final SubLObject var195) {
        return module0077.f5326(var195, f24053(var1));
    }
    
    public static SubLObject f24386(final SubLObject var1, final SubLObject var195) {
        return module0077.f5327(var195, f24053(var1));
    }
    
    public static SubLObject f24387(final SubLObject var1) {
        if (NIL == f24175(var1)) {
            f24187(var1);
        }
        return var1;
    }
    
    public static SubLObject f24388(final SubLObject var1, final SubLObject var195) {
        final SubLObject var196 = module0363.f24509(var195);
        final SubLObject var197 = module0362.f24470(var196);
        if (NIL == f24344(var1, var195)) {
            module0067.f4886(f24056(var1), var195, var197);
            module0084.f5762(f24055(var1), var197, var195);
        }
        return var1;
    }
    
    public static SubLObject f24389(final SubLObject var1, final SubLObject var195) {
        if (NIL != f24344(var1, var195)) {
            final SubLObject var196 = module0067.f4885(f24056(var1), var195, (SubLObject)UNPROVIDED);
            module0067.f4887(f24056(var1), var195);
            module0084.f5773(f24055(var1), var196, var195, Symbols.symbol_function((SubLObject)EQ));
        }
        return var1;
    }
    
    public static SubLObject f24390(final SubLObject var1, final SubLObject var195) {
        f24368(var1, var195);
        f24370(var1, var195);
        return var1;
    }
    
    public static SubLObject f24391(final SubLObject var1, final SubLObject var195) {
        f24386(var1, var195);
        f24392(var1, var195);
        f24369(var1, var195);
        return var1;
    }
    
    public static SubLObject f24392(final SubLObject var1, final SubLObject var195) {
        f24389(var1, var195);
        f24371(var1, var195);
        return var1;
    }
    
    public static SubLObject f24393(final SubLObject var1, final SubLObject var393) {
        final SubLThread var394 = SubLProcess.currentSubLThread();
        final SubLObject var395 = f24117(var1);
        final SubLObject var396 = module0034.$g879$.currentBinding(var394);
        try {
            module0034.$g879$.bind(var395, var394);
            SubLObject var397 = (SubLObject)NIL;
            if (NIL != var395 && NIL == module0034.f1842(var395)) {
                var397 = module0034.f1869(var395);
                final SubLObject var398 = Threads.current_process();
                if (NIL == var397) {
                    module0034.f1873(var395, var398);
                }
                else if (!var397.eql(var398)) {
                    Errors.error((SubLObject)$ic312$);
                }
            }
            try {
                f24394(var393);
            }
            finally {
                final SubLObject var25_472 = Threads.$is_thread_performing_cleanupP$.currentBinding(var394);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var394);
                    if (NIL != var395 && NIL == var397) {
                        module0034.f1873(var395, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var25_472, var394);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var396, var394);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f24395(final SubLObject var1, final SubLObject var393) {
        final SubLThread var394 = SubLProcess.currentSubLThread();
        final SubLObject var395 = f24117(var1);
        final SubLObject var396 = module0034.$g879$.currentBinding(var394);
        try {
            module0034.$g879$.bind(var395, var394);
            SubLObject var397 = (SubLObject)NIL;
            if (NIL != var395 && NIL == module0034.f1842(var395)) {
                var397 = module0034.f1869(var395);
                final SubLObject var398 = Threads.current_process();
                if (NIL == var397) {
                    module0034.f1873(var395, var398);
                }
                else if (!var397.eql(var398)) {
                    Errors.error((SubLObject)$ic312$);
                }
            }
            try {
                f24396(var393);
            }
            finally {
                final SubLObject var25_473 = Threads.$is_thread_performing_cleanupP$.currentBinding(var394);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var394);
                    if (NIL != var395 && NIL == var397) {
                        module0034.f1873(var395, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var25_473, var394);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var396, var394);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24397(final SubLObject var393) {
        final SubLThread var394 = SubLProcess.currentSubLThread();
        if (NIL != module0178.f11290(var393)) {
            if (NIL == module0018.$g740$.getDynamicValue(var394)) {
                module0414.f28908(var393, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24394(final SubLObject var393) {
        final SubLThread var394 = SubLProcess.currentSubLThread();
        final SubLObject var395 = module0034.$g879$.getDynamicValue(var394);
        SubLObject var396 = (SubLObject)NIL;
        if (NIL == var395) {
            return f24397(var393);
        }
        var396 = module0034.f1857(var395, (SubLObject)$ic313$, (SubLObject)UNPROVIDED);
        if (NIL == var396) {
            var396 = module0034.f1807(module0034.f1842(var395), (SubLObject)$ic313$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var395, (SubLObject)$ic313$, var396);
        }
        SubLObject var397 = module0034.f1814(var396, var393, (SubLObject)$ic314$);
        if (var397 == $ic314$) {
            var397 = Values.arg2(var394.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f24397(var393)));
            module0034.f1816(var396, var393, var397, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var397);
    }
    
    public static SubLObject f24398(final SubLObject var393) {
        final SubLThread var394 = SubLProcess.currentSubLThread();
        if (NIL != module0178.f11290(var393)) {
            if (NIL != module0018.$g740$.getDynamicValue(var394)) {
                module0414.f28908(var393, (SubLObject)T, (SubLObject)$ic316$, (SubLObject)UNPROVIDED);
                module0414.f28909(var393, (SubLObject)T, (SubLObject)$ic316$, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0004.f105($g3114$.getDynamicValue(var394))) {
                module0414.f28908(var393, (SubLObject)T, Numbers.subtract($g3114$.getDynamicValue(var394), (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED);
                module0414.f28909(var393, (SubLObject)T, $g3114$.getDynamicValue(var394), (SubLObject)UNPROVIDED);
            }
            else {
                module0414.f28909(var393, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24396(final SubLObject var393) {
        final SubLThread var394 = SubLProcess.currentSubLThread();
        final SubLObject var395 = module0034.$g879$.getDynamicValue(var394);
        SubLObject var396 = (SubLObject)NIL;
        if (NIL == var395) {
            return f24398(var393);
        }
        var396 = module0034.f1857(var395, (SubLObject)$ic315$, (SubLObject)UNPROVIDED);
        if (NIL == var396) {
            var396 = module0034.f1807(module0034.f1842(var395), (SubLObject)$ic315$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var395, (SubLObject)$ic315$, var396);
        }
        SubLObject var397 = module0034.f1814(var396, var393, (SubLObject)$ic314$);
        if (var397 == $ic314$) {
            var397 = Values.arg2(var394.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f24398(var393)));
            module0034.f1816(var396, var393, var397, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var397);
    }
    
    public static SubLObject f24399(final SubLObject var34, final SubLObject var35) {
        compatibility.default_struct_print_function(var34, var35, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24400(final SubLObject var34) {
        return (SubLObject)((var34.getClass() == $sX26820_native.class) ? T : NIL);
    }
    
    public static SubLObject f24401(final SubLObject var34) {
        assert NIL != f24400(var34) : var34;
        return var34.getField2();
    }
    
    public static SubLObject f24402(final SubLObject var34) {
        assert NIL != f24400(var34) : var34;
        return var34.getField3();
    }
    
    public static SubLObject f24403(final SubLObject var34) {
        assert NIL != f24400(var34) : var34;
        return var34.getField4();
    }
    
    public static SubLObject f24404(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24400(var34) : var34;
        return var34.setField2(var37);
    }
    
    public static SubLObject f24405(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24400(var34) : var34;
        return var34.setField3(var37);
    }
    
    public static SubLObject f24406(final SubLObject var34, final SubLObject var37) {
        assert NIL != f24400(var34) : var34;
        return var34.setField4(var37);
    }
    
    public static SubLObject f24407(SubLObject var38) {
        if (var38 == UNPROVIDED) {
            var38 = (SubLObject)NIL;
        }
        final SubLObject var39 = (SubLObject)new $sX26820_native();
        SubLObject var40;
        SubLObject var41;
        SubLObject var42;
        SubLObject var43;
        for (var40 = (SubLObject)NIL, var40 = var38; NIL != var40; var40 = conses_high.cddr(var40)) {
            var41 = var40.first();
            var42 = conses_high.cadr(var40);
            var43 = var41;
            if (var43.eql((SubLObject)$ic332$)) {
                f24404(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic333$)) {
                f24405(var39, var42);
            }
            else if (var43.eql((SubLObject)$ic334$)) {
                f24406(var39, var42);
            }
            else {
                Errors.error((SubLObject)$ic198$, var41);
            }
        }
        return var39;
    }
    
    public static SubLObject f24408(final SubLObject var44, final SubLObject var45) {
        Functions.funcall(var45, var44, (SubLObject)$ic199$, (SubLObject)$ic335$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic332$, f24401(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic333$, f24402(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic201$, (SubLObject)$ic334$, f24403(var44));
        Functions.funcall(var45, var44, (SubLObject)$ic202$, (SubLObject)$ic335$, (SubLObject)THREE_INTEGER);
        return var44;
    }
    
    public static SubLObject f24409(final SubLObject var44, final SubLObject var45) {
        return f24408(var44, var45);
    }
    
    public static SubLObject f24140(final SubLObject var1) {
        assert NIL != f24009(var1) : var1;
        final SubLObject var2 = f24407((SubLObject)UNPROVIDED);
        f24404(var2, var1);
        f24405(var2, module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f24410(var2);
        return var2;
    }
    
    public static SubLObject f24143(final SubLObject var199) {
        module0077.f5328(f24402(var199));
        f24405(var199, (SubLObject)$ic204$);
        f24404(var199, (SubLObject)$ic204$);
        f24410(var199);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24411(final SubLObject var199) {
        return f24401(var199);
    }
    
    public static SubLObject f24334(final SubLObject var199) {
        return f24403(var199);
    }
    
    public static SubLObject f24412(final SubLObject var199) {
        if (NIL != f24334(var199)) {
            return module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        }
        return f24402(var199);
    }
    
    public static SubLObject f24413(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic339$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic339$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic339$);
        var12 = var9.first();
        var9 = var9.rest();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var9;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var486_487 = (SubLObject)NIL;
        while (NIL != var14) {
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic339$);
            var486_487 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic339$);
            if (NIL == conses_high.member(var486_487, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var15 = (SubLObject)T;
            }
            if (var486_487 == $ic3$) {
                var13 = var14.first();
            }
            var14 = var14.rest();
        }
        if (NIL != var15 && NIL == var13) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic339$);
        }
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var9 = (var18 = var10);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic256$, (SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)$ic337$, var12), (SubLObject)$ic4$, var17), ConsesLow.append(var18, (SubLObject)NIL));
    }
    
    public static SubLObject f24414(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic339$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic339$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic339$);
        var12 = var9.first();
        var9 = var9.rest();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var9;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var495_496 = (SubLObject)NIL;
        while (NIL != var14) {
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic339$);
            var495_496 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var8, (SubLObject)$ic339$);
            if (NIL == conses_high.member(var495_496, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var15 = (SubLObject)T;
            }
            if (var495_496 == $ic3$) {
                var13 = var14.first();
            }
            var14 = var14.rest();
        }
        if (NIL != var15 && NIL == var13) {
            cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic339$);
        }
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var9);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var9 = (var18 = var10);
        return (SubLObject)ConsesLow.list((SubLObject)$ic239$, (SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)$ic340$, var12), (SubLObject)$ic4$, var17), (SubLObject)ConsesLow.listS((SubLObject)$ic246$, (SubLObject)ConsesLow.list((SubLObject)$ic341$, var11), ConsesLow.append(var18, (SubLObject)NIL)));
    }
    
    public static SubLObject f24415(final SubLObject var199) {
        return module0077.f5311(f24412(var199));
    }
    
    public static SubLObject f24416(final SubLObject var199) {
        return Numbers.subtract(f24228(f24411(var199)), f24415(var199));
    }
    
    public static SubLObject f24410(final SubLObject var199) {
        f24406(var199, (SubLObject)T);
        return var199;
    }
    
    public static SubLObject f24417(final SubLObject var199) {
        f24406(var199, (SubLObject)NIL);
        return var199;
    }
    
    public static SubLObject f24418(final SubLObject var199, final SubLObject var195) {
        assert NIL != f24400(var199) : var199;
        assert NIL != module0363.f24478(var195) : var195;
        final SubLObject var200 = f24412(var199);
        module0077.f5326(var195, var200);
        return var199;
    }
    
    public static SubLObject f24419(final SubLObject var199, final SubLObject var195) {
        assert NIL != f24400(var199) : var199;
        assert NIL != module0363.f24478(var195) : var195;
        final SubLObject var200 = f24412(var199);
        module0077.f5327(var195, var200);
        return var199;
    }
    
    public static SubLObject f24420(final SubLObject var499) {
        assert NIL != f24009(var499) : var499;
        final SubLObject var500 = f23996(var499);
        return Hashtables.gethash_without_values(var500, $g3125$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f24137(final SubLObject var149) {
        assert NIL != module0360.f23907(var149) : var149;
        if (NIL != var149) {
            final SubLObject var150 = Hashtables.gethash_without_values(var149, $g3126$.getGlobalValue(), (SubLObject)UNPROVIDED);
            if (NIL != var150) {
                return f23997(var150);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24421(final SubLObject var149, SubLObject var148) {
        if (var148 == UNPROVIDED) {
            var148 = (SubLObject)NIL;
        }
        assert NIL != module0360.f23907(var149) : var149;
        assert NIL != module0360.f23856(var148) : var148;
        SubLObject var150 = f24137(var149);
        if (NIL == var150) {
            final SubLObject var151 = conses_high.putf(conses_high.copy_list(var148), (SubLObject)$ic346$, var149);
            var150 = f24136(var151);
        }
        return var150;
    }
    
    public static SubLObject f24422(final SubLObject var149) {
        assert NIL != module0360.f23907(var149) : var149;
        return f24005(f24137(var149));
    }
    
    public static SubLObject f24423(final SubLObject var499, final SubLObject var501) {
        assert NIL != f24009(var499) : var499;
        assert NIL != module0360.f23907(var501) : var501;
        final SubLObject var502 = f24137(var501);
        if (NIL != var502 && var499.eql(var502)) {
            return (SubLObject)T;
        }
        if (NIL != var502) {
            return (SubLObject)NIL;
        }
        f24144(var499);
        f24138(var499, var501);
        return (SubLObject)T;
    }
    
    public static SubLObject f24138(final SubLObject var499, final SubLObject var149) {
        if (NIL != var149) {
            final SubLObject var500 = f23996(var499);
            Hashtables.sethash(var500, $g3125$.getGlobalValue(), var149);
            Hashtables.sethash(var149, $g3126$.getGlobalValue(), var500);
        }
        return var499;
    }
    
    public static SubLObject f24144(final SubLObject var499) {
        final SubLObject var500 = f23996(var499);
        final SubLObject var501 = f24420(var499);
        Hashtables.remhash(var500, $g3125$.getGlobalValue());
        Hashtables.remhash(var501, $g3126$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24424(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = module0360.f23857();
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            final SubLObject var5 = f24425(var1, var4);
            var2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var4, var5), var2);
            var3 = var3.rest();
            var4 = var3.first();
        }
        return module0035.f2338(Sequences.nreverse(var2));
    }
    
    public static SubLObject f24425(final SubLObject var1, final SubLObject var504) {
        if (var504.eql((SubLObject)$ic183$)) {
            return f24171(var1);
        }
        if (var504.eql((SubLObject)$ic177$)) {
            return f24165(var1);
        }
        if (var504.eql((SubLObject)$ic179$)) {
            return f24167(var1);
        }
        if (var504.eql((SubLObject)$ic180$)) {
            return f24168(var1);
        }
        if (var504.eql((SubLObject)$ic171$)) {
            return f24159(var1);
        }
        if (var504.eql((SubLObject)$ic170$)) {
            return f24158(var1);
        }
        if (var504.eql((SubLObject)$ic181$)) {
            return f24169(var1);
        }
        if (var504.eql((SubLObject)$ic172$)) {
            return f24160(var1);
        }
        if (var504.eql((SubLObject)$ic173$)) {
            return f24161(var1);
        }
        if (var504.eql((SubLObject)$ic178$)) {
            return f24166(var1);
        }
        if (var504.eql((SubLObject)$ic184$)) {
            return f24172(var1);
        }
        if (var504.eql((SubLObject)$ic346$)) {
            return f24420(var1);
        }
        if (var504.eql((SubLObject)$ic175$)) {
            return f24163(var1);
        }
        if (var504.eql((SubLObject)$ic182$)) {
            return f24170(var1);
        }
        if (var504.eql((SubLObject)$ic176$)) {
            return f24164(var1);
        }
        if (var504.eql((SubLObject)$ic185$)) {
            return f24173(var1);
        }
        assert NIL != module0360.f23855(var504) : var504;
        return Errors.error((SubLObject)$ic349$, var504);
    }
    
    public static SubLObject f24426(final SubLObject var1) {
        if (NIL != f24427(var1)) {
            f24428(var1);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24427(final SubLObject var1) {
        return (SubLObject)makeBoolean(f24229(var1).numG(Numbers.multiply($g3127$.getGlobalValue(), f24228(var1))) && NIL == module0065.f4759(f24128(var1)));
    }
    
    public static SubLObject f24428(final SubLObject var1) {
        module0065.f4791(f24128(var1));
        module0065.f4791(f24130(var1));
        module0065.f4791(f24132(var1));
        return var1;
    }
    
    public static SubLObject f24429() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f23993", "S#26822", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f23994", "S#26823", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f23995", "S#26824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f23997", "FIND-PROBLEM-STORE-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f23998", "S#26825", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f23999", "S#26826", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24000", "S#26827", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24001", "S#26828");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24002", "S#26829", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24003", "S#26830", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24004", "DESTROY-ALL-PROBLEM-STORES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24006", "S#26831", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24007", "S#26832", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24009", "S#26782", 1, 0, false);
        new $f24009$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24010", "S#26833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24011", "S#26834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24012", "S#26835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24013", "S#26836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24014", "S#26837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24015", "S#26838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24016", "S#26839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24017", "S#26840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24018", "S#26841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24019", "S#26842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24020", "S#26843", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24021", "S#26844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24022", "S#26845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24023", "S#26846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24024", "S#26847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24025", "S#26848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24026", "S#26849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24027", "S#26850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24028", "S#26851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24029", "S#26852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24030", "S#26853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24031", "S#26854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24032", "S#26855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24033", "S#26856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24034", "S#26857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24035", "S#26858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24036", "S#26859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24037", "S#26860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24038", "S#26861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24039", "S#26862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24040", "S#26863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24041", "S#26864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24042", "S#26865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24043", "S#26866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24044", "S#26867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24045", "S#26868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24046", "S#26869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24047", "S#26870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24048", "S#26871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24049", "S#26872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24050", "S#26873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24051", "S#26874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24052", "S#26875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24053", "S#26876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24054", "S#26877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24055", "S#26878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24056", "S#26879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24057", "S#26880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24058", "S#26881", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24059", "S#26882", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24060", "S#26883", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24061", "S#26884", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24062", "S#26885", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24063", "S#26886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24064", "S#26887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24065", "S#26888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24066", "S#26889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24067", "S#26890", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24068", "S#26891", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24069", "S#26892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24070", "S#26893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24071", "S#26894", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24072", "S#26895", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24073", "S#26896", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24074", "S#26897", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24075", "S#26898", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24076", "S#26899", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24077", "S#26900", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24078", "S#26901", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24079", "S#26902", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24080", "S#26903", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24081", "S#26904", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24082", "S#26905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24083", "S#26906", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24084", "S#26907", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24085", "S#26908", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24086", "S#26909", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24087", "S#26910", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24088", "S#26911", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24089", "S#26912", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24090", "S#26913", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24091", "S#26914", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24092", "S#26915", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24093", "S#26916", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24094", "S#26917", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24095", "S#26918", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24096", "S#26919", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24097", "S#26920", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24098", "S#26921", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24099", "S#26922", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24100", "S#26923", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24101", "S#26924", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24102", "S#26925", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24103", "S#26926", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24104", "S#26927", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24105", "S#26928", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24106", "S#26929", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24107", "S#26930", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24108", "S#26931", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24109", "S#26316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24111", "S#26932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24110", "S#26933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24008", "S#26934", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24113", "S#26935", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24114", "S#26936");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24115", "S#26937", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24116", "S#26938");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24117", "S#26939", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24118", "S#26940");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24119", "S#26941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24120", "S#26942", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24121", "S#26943");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24122", "S#26944");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24123", "S#26945", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24124", "S#26946");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24125", "S#26947", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24126", "S#26948");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24127", "DO-PROBLEM-STORE-PROBLEMS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24128", "S#26949", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24129", "DO-PROBLEM-STORE-LINKS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24130", "S#26950", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24131", "S#26951");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24132", "S#26952", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24133", "S#26953");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24134", "S#26954", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24135", "S#26955");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24136", "NEW-PROBLEM-STORE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24005", "DESTROY-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24141", "S#26956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24142", "S#26957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24146", "S#26958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f23996", "PROBLEM-STORE-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24147", "S#26959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24148", "S#26960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24149", "S#26961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24150", "S#26962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24151", "S#26963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24152", "S#26964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24153", "S#26965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24154", "S#26966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24155", "S#26967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24156", "S#26968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24157", "S#26969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24158", "S#26970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24159", "S#26971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24160", "S#26972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24161", "S#26973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24162", "S#26974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24163", "S#26975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24164", "S#26976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24165", "S#26977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24166", "S#26978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24167", "S#24955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24168", "S#26979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24169", "S#26980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24170", "S#26981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24171", "S#26982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24172", "S#26983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24173", "S#26984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24175", "S#26985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24176", "S#26986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24177", "S#26987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24178", "S#26988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24179", "S#26820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24180", "S#26989", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24181", "S#26990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24183", "S#26991", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24184", "S#26992", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24185", "S#26993", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24186", "S#26994", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24187", "S#26995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24188", "S#26996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24189", "S#26997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24174", "S#26998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24190", "S#26999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24182", "S#27000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24191", "S#27001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24192", "S#27002", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24193", "S#27003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24194", "FIND-INFERENCE-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24195", "FIND-INFERENCE-BY-IDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24196", "S#27004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24197", "S#27005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24198", "S#27006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24199", "S#27007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24200", "PROBLEM-STORE-STRATEGY-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24201", "S#27008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24202", "S#27009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24203", "FIND-STRATEGY-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24204", "S#27010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24205", "S#27011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24206", "S#27012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24207", "S#27013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24208", "S#27014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24209", "S#27015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24210", "S#27016", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24211", "S#27017", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24212", "PROBLEM-STORE-FIRST-LINK-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24213", "S#27018", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24214", "S#27019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24215", "S#27020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24216", "S#27021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24217", "S#27022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24218", "S#27023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24219", "PROBLEM-STORE-REWRITE-LINK-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24220", "S#27024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24221", "S#27025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24222", "S#27026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24223", "S#27027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24224", "PROBLEM-STORE-RESTRICTION-LINK-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24225", "PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24226", "S#27028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24227", "PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24228", "S#27029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24229", "S#27030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24230", "S#27031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24139", "S#27032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24231", "S#27033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24232", "S#27034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24234", "S#27035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24235", "S#27036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24236", "S#27037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24237", "FIND-PROBLEM-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24238", "S#27038", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24239", "FIND-PROBLEM-BY-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24240", "S#27039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24241", "S#27040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24242", "S#27041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24243", "S#27042", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24244", "S#27043", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24245", "S#27044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24246", "S#27045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24247", "S#27046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24248", "S#27047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24249", "S#27048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24250", "S#27049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24251", "S#27050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24252", "S#27051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24253", "S#27052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24254", "S#27053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24255", "S#27054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24256", "S#27055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24257", "S#27056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24258", "S#27057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24259", "S#27058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24260", "S#27059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24261", "S#27060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24262", "S#27061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24263", "S#27062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24264", "S#27063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24265", "S#27064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24266", "S#27065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24267", "S#27066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24268", "S#27067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24269", "S#27068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24270", "S#27069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24271", "S#27070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24272", "S#27071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24273", "S#27072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24274", "S#27073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24275", "S#27074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24276", "S#27075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24277", "S#27076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24278", "S#27077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24279", "S#27078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24280", "S#27079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24281", "S#27080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24282", "S#27081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24283", "S#27082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24284", "S#27083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24285", "S#27084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24286", "S#27085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24287", "S#27086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24288", "S#27087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24289", "S#27088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24290", "S#27089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24291", "S#27090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24292", "S#27091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24293", "S#27092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24294", "S#27093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24295", "S#27094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24296", "S#27095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24297", "S#27096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24298", "S#27097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24299", "S#27098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24300", "S#27099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24301", "S#27100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24302", "S#27101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24303", "S#27102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24304", "S#27103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24305", "S#27104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24306", "S#27105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24307", "S#27106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24308", "S#27107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24309", "S#27108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24310", "S#27109", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24311", "PROBLEM-STORE-TACTIC-OF-TYPE-WITH-STATUS-COUNT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24312", "S#27110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24313", "S#27111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24314", "S#27112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24315", "S#27113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24316", "S#27114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24317", "S#27115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24233", "S#27116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24318", "S#27117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24319", "FIND-PROOF-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24320", "S#27118", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24321", "S#27119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24322", "PROBLEM-STORE-REJECTED-PROOF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24323", "S#27120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24324", "S#27121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24325", "S#27122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24326", "S#27123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24327", "S#27124", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24112", "S#27125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24328", "S#27126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24329", "S#27127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24330", "S#27128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24331", "S#27129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24332", "S#27130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24333", "S#27131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24335", "S#27132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24336", "S#27133", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24337", "S#27134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24338", "S#27135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24339", "S#27136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24340", "S#27137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24341", "S#27138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24342", "S#27139", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24343", "S#27140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24344", "S#27141", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24345", "S#27142", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24346", "S#27143", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24145", "S#27144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24347", "S#27145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24348", "S#27146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24349", "S#27147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24350", "S#27148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24351", "S#27149", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24352", "S#27150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24353", "S#27151", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24354", "S#27152", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24355", "S#27153", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24356", "S#27154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24357", "S#27155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24358", "S#27156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24359", "S#27157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24360", "S#27158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24361", "S#27159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24362", "S#27160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24366", "S#27161", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24367", "S#27162", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24368", "S#27163", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24369", "S#27164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24370", "S#27165", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24371", "S#27166", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24372", "S#27167", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24373", "S#27168", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24374", "S#27169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24375", "S#27170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24376", "S#27171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24377", "S#27172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24378", "S#27173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24379", "S#27174", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24380", "S#27175", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24381", "S#27176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24382", "S#27177", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24383", "S#27178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24384", "S#27179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24363", "S#27180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24364", "S#27181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24365", "S#27182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24385", "S#27183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24386", "S#27184", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24387", "S#27185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24388", "S#27186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24389", "S#27187", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24390", "S#27188", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24391", "S#27189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24392", "S#27190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24393", "S#27191", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24395", "S#27192", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24397", "S#27193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24394", "S#27194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24398", "S#27195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24396", "S#27196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24399", "S#27197", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24400", "S#26821", 1, 0, false);
        new $f24400$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24401", "S#27198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24402", "S#27199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24403", "S#27200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24404", "S#27201", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24405", "S#27202", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24406", "S#27203", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24407", "S#27204", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24408", "S#27205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24409", "S#27206", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24140", "S#27207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24143", "S#27208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24411", "S#27209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24334", "S#27210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24412", "S#27211", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24413", "S#27212");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0361", "f24414", "S#27213");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24415", "S#27214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24416", "S#27215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24410", "S#27216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24417", "S#27217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24418", "S#27218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24419", "S#27219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24420", "S#27220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24137", "FIND-PROBLEM-STORE-BY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24421", "FIND-OR-CREATE-PROBLEM-STORE-BY-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24422", "DESTROY-PROBLEM-STORE-BY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24423", "S#27221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24138", "S#27222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24144", "S#27223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24424", "S#27224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24425", "S#27225", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24426", "S#27226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24427", "S#27227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0361", "f24428", "S#27228", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24430() {
        $g3113$ = SubLFiles.defparameter("S#27229", (SubLObject)NIL);
        $g3114$ = SubLFiles.defparameter("S#27230", (SubLObject)NIL);
        $g3115$ = SubLFiles.deflexical("S#27231", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g3115$.getGlobalValue() : module0065.f4745((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g3116$ = SubLFiles.defconstant("S#27232", (SubLObject)$ic16$);
        $g3117$ = SubLFiles.deflexical("S#27233", (SubLObject)$ic262$);
        $g3118$ = SubLFiles.deflexical("S#27234", (SubLObject)$ic263$);
        $g3119$ = SubLFiles.deflexical("S#27235", (SubLObject)TEN_INTEGER);
        $g3120$ = SubLFiles.deflexical("S#27236", $g3119$.getGlobalValue());
        $g3121$ = SubLFiles.deflexical("S#27237", (SubLObject)$ic42$);
        $g3122$ = SubLFiles.deflexical("S#27238", (SubLObject)TEN_INTEGER);
        $g3123$ = SubLFiles.deflexical("S#27239", (SubLObject)FIVE_INTEGER);
        $g3124$ = SubLFiles.defconstant("S#27240", (SubLObject)$ic317$);
        $g3125$ = SubLFiles.deflexical("S#27241", (NIL != Symbols.boundp((SubLObject)$ic342$)) ? $g3125$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)ONE_INTEGER, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g3126$ = SubLFiles.deflexical("S#27242", (NIL != Symbols.boundp((SubLObject)$ic343$)) ? $g3126$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)ONE_INTEGER, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g3127$ = SubLFiles.deflexical("S#27243", (SubLObject)$ic350$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24431() {
        module0003.f57((SubLObject)$ic0$);
        module0002.f50((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3116$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic52$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic53$);
        Structures.def_csetf((SubLObject)$ic54$, (SubLObject)$ic55$);
        Structures.def_csetf((SubLObject)$ic56$, (SubLObject)$ic57$);
        Structures.def_csetf((SubLObject)$ic58$, (SubLObject)$ic59$);
        Structures.def_csetf((SubLObject)$ic60$, (SubLObject)$ic61$);
        Structures.def_csetf((SubLObject)$ic62$, (SubLObject)$ic63$);
        Structures.def_csetf((SubLObject)$ic64$, (SubLObject)$ic65$);
        Structures.def_csetf((SubLObject)$ic66$, (SubLObject)$ic67$);
        Structures.def_csetf((SubLObject)$ic68$, (SubLObject)$ic69$);
        Structures.def_csetf((SubLObject)$ic70$, (SubLObject)$ic71$);
        Structures.def_csetf((SubLObject)$ic72$, (SubLObject)$ic73$);
        Structures.def_csetf((SubLObject)$ic74$, (SubLObject)$ic75$);
        Structures.def_csetf((SubLObject)$ic76$, (SubLObject)$ic77$);
        Structures.def_csetf((SubLObject)$ic78$, (SubLObject)$ic79$);
        Structures.def_csetf((SubLObject)$ic80$, (SubLObject)$ic81$);
        Structures.def_csetf((SubLObject)$ic82$, (SubLObject)$ic83$);
        Structures.def_csetf((SubLObject)$ic84$, (SubLObject)$ic85$);
        Structures.def_csetf((SubLObject)$ic86$, (SubLObject)$ic87$);
        Structures.def_csetf((SubLObject)$ic88$, (SubLObject)$ic89$);
        Structures.def_csetf((SubLObject)$ic90$, (SubLObject)$ic91$);
        Structures.def_csetf((SubLObject)$ic92$, (SubLObject)$ic93$);
        Structures.def_csetf((SubLObject)$ic94$, (SubLObject)$ic95$);
        Structures.def_csetf((SubLObject)$ic96$, (SubLObject)$ic97$);
        Structures.def_csetf((SubLObject)$ic98$, (SubLObject)$ic99$);
        Structures.def_csetf((SubLObject)$ic100$, (SubLObject)$ic101$);
        Structures.def_csetf((SubLObject)$ic102$, (SubLObject)$ic103$);
        Structures.def_csetf((SubLObject)$ic104$, (SubLObject)$ic105$);
        Structures.def_csetf((SubLObject)$ic106$, (SubLObject)$ic107$);
        Structures.def_csetf((SubLObject)$ic108$, (SubLObject)$ic109$);
        Structures.def_csetf((SubLObject)$ic110$, (SubLObject)$ic111$);
        Structures.def_csetf((SubLObject)$ic112$, (SubLObject)$ic113$);
        Structures.def_csetf((SubLObject)$ic114$, (SubLObject)$ic115$);
        Structures.def_csetf((SubLObject)$ic116$, (SubLObject)$ic117$);
        Structures.def_csetf((SubLObject)$ic118$, (SubLObject)$ic119$);
        Structures.def_csetf((SubLObject)$ic120$, (SubLObject)$ic121$);
        Structures.def_csetf((SubLObject)$ic122$, (SubLObject)$ic123$);
        Structures.def_csetf((SubLObject)$ic124$, (SubLObject)$ic125$);
        Structures.def_csetf((SubLObject)$ic126$, (SubLObject)$ic127$);
        Structures.def_csetf((SubLObject)$ic128$, (SubLObject)$ic129$);
        Structures.def_csetf((SubLObject)$ic130$, (SubLObject)$ic131$);
        Structures.def_csetf((SubLObject)$ic132$, (SubLObject)$ic133$);
        Structures.def_csetf((SubLObject)$ic134$, (SubLObject)$ic135$);
        Structures.def_csetf((SubLObject)$ic136$, (SubLObject)$ic137$);
        Structures.def_csetf((SubLObject)$ic138$, (SubLObject)$ic139$);
        Structures.def_csetf((SubLObject)$ic140$, (SubLObject)$ic141$);
        Structures.def_csetf((SubLObject)$ic142$, (SubLObject)$ic143$);
        Structures.def_csetf((SubLObject)$ic144$, (SubLObject)$ic145$);
        Structures.def_csetf((SubLObject)$ic146$, (SubLObject)$ic147$);
        Structures.def_csetf((SubLObject)$ic148$, (SubLObject)$ic149$);
        Equality.identity((SubLObject)$ic16$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3116$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic203$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g3116$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic207$));
        module0002.f50((SubLObject)$ic210$, (SubLObject)$ic211$);
        module0002.f50((SubLObject)$ic214$, (SubLObject)$ic215$);
        module0002.f50((SubLObject)$ic218$, (SubLObject)$ic221$);
        module0002.f50((SubLObject)$ic220$, (SubLObject)$ic221$);
        module0002.f50((SubLObject)$ic225$, (SubLObject)$ic226$);
        module0002.f50((SubLObject)$ic229$, (SubLObject)$ic230$);
        module0002.f50((SubLObject)$ic238$, (SubLObject)$ic239$);
        module0002.f50((SubLObject)$ic244$, (SubLObject)$ic245$);
        module0002.f50((SubLObject)$ic252$, (SubLObject)$ic253$);
        module0002.f50((SubLObject)$ic257$, (SubLObject)$ic258$);
        module0034.f1895((SubLObject)$ic313$);
        module0034.f1895((SubLObject)$ic315$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3124$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic324$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic325$);
        Structures.def_csetf((SubLObject)$ic326$, (SubLObject)$ic327$);
        Structures.def_csetf((SubLObject)$ic328$, (SubLObject)$ic329$);
        Structures.def_csetf((SubLObject)$ic330$, (SubLObject)$ic331$);
        Equality.identity((SubLObject)$ic317$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3124$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic336$));
        module0002.f50((SubLObject)$ic337$, (SubLObject)$ic338$);
        module0003.f57((SubLObject)$ic342$);
        module0003.f57((SubLObject)$ic343$);
        module0002.f38((SubLObject)$ic344$);
        module0002.f38((SubLObject)$ic345$);
        module0002.f38((SubLObject)$ic347$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f24429();
    }
    
    public void initializeVariables() {
        f24430();
    }
    
    public void runTopLevelForms() {
        f24431();
    }
    
    static {
        me = (SubLFile)new module0361();
        $g3113$ = null;
        $g3114$ = null;
        $g3115$ = null;
        $g3116$ = null;
        $g3117$ = null;
        $g3118$ = null;
        $g3119$ = null;
        $g3120$ = null;
        $g3121$ = null;
        $g3122$ = null;
        $g3123$ = null;
        $g3124$ = null;
        $g3125$ = null;
        $g3126$ = null;
        $g3127$ = null;
        $ic0$ = makeSymbol("S#27231", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25402", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic3$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic4$ = makeKeyword("DONE");
        $ic5$ = makeUninternedSymbol("US#1124883");
        $ic6$ = makeSymbol("DO-ID-INDEX");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#26829", "CYC"));
        $ic8$ = makeSymbol("IGNORE");
        $ic9$ = makeSymbol("S#26829", "CYC");
        $ic10$ = makeSymbol("S#26828", "CYC");
        $ic11$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic12$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic13$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic14$ = makeSymbol(">");
        $ic15$ = makeSymbol("S#26959", "CYC");
        $ic16$ = makeSymbol("PROBLEM-STORE");
        $ic17$ = makeSymbol("S#26782", "CYC");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeSymbol("GUID"), makeSymbol("S#10593", "CYC"), makeSymbol("S#672", "CYC"), makeSymbol("CREATION-TIME"), makeSymbol("S#27244", "CYC"), makeSymbol("S#27245", "CYC"), makeSymbol("S#27246", "CYC"), makeSymbol("S#27247", "CYC"), makeSymbol("S#27248", "CYC"), makeSymbol("S#27249", "CYC"), makeSymbol("S#27250", "CYC"), makeSymbol("S#27251", "CYC"), makeSymbol("S#27252", "CYC"), makeSymbol("S#27253", "CYC"), makeSymbol("S#27254", "CYC"), makeSymbol("S#27255", "CYC"), makeSymbol("S#27256", "CYC"), makeSymbol("S#27257", "CYC"), makeSymbol("S#27258", "CYC"), makeSymbol("S#27259", "CYC"), makeSymbol("S#27260", "CYC"), makeSymbol("S#27261", "CYC"), makeSymbol("S#27262", "CYC"), makeSymbol("S#27263", "CYC"), makeSymbol("S#27264", "CYC"), makeSymbol("S#27265", "CYC"), makeSymbol("S#27266", "CYC"), makeSymbol("S#27267", "CYC"), makeSymbol("S#27268", "CYC"), makeSymbol("S#27269", "CYC"), makeSymbol("S#5432", "CYC"), makeSymbol("S#27270", "CYC"), makeSymbol("S#27271", "CYC"), makeSymbol("S#27272", "CYC"), makeSymbol("S#27273", "CYC"), makeSymbol("S#27274", "CYC"), makeSymbol("S#3043", "CYC"), makeSymbol("S#27275", "CYC"), makeSymbol("S#27276", "CYC"), makeSymbol("S#27277", "CYC"), makeSymbol("S#27278", "CYC"), makeSymbol("S#27279", "CYC"), makeSymbol("S#27280", "CYC"), makeSymbol("S#27281", "CYC"), makeSymbol("S#27282", "CYC"), makeSymbol("S#27283", "CYC"), makeSymbol("S#27284", "CYC"), makeSymbol("S#27285", "CYC") });
        $ic19$ = ConsesLow.list(new SubLObject[] { makeKeyword("GUID"), makeKeyword("SUID"), makeKeyword("LOCK"), makeKeyword("CREATION-TIME"), makeKeyword("INFERENCE-ID-INDEX"), makeKeyword("STRATEGY-ID-INDEX"), makeKeyword("PROBLEM-ID-INDEX"), makeKeyword("LINK-ID-INDEX"), makeKeyword("PROOF-ID-INDEX"), makeKeyword("PROBLEM-BY-QUERY-INDEX"), makeKeyword("REJECTED-PROOFS"), makeKeyword("PROCESSED-PROOFS"), makeKeyword("POTENTIALLY-PROCESSED-PROBLEMS"), makeKeyword("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeKeyword("NON-EXPLANATORY-SUBPROOFS-INDEX"), makeKeyword("MOST-RECENT-TACTIC-EXECUTED"), makeKeyword("MIN-PROOF-DEPTH-INDEX"), makeKeyword("MIN-TRANSFORMATION-DEPTH-INDEX"), makeKeyword("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeKeyword("MIN-DEPTH-INDEX"), makeKeyword("EQUALITY-REASONING-METHOD"), makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("CRAZY-MAX-PROBLEM-COUNT"), makeKeyword("REMOVAL-ALLOWED?"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("DIRECTION"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), makeKeyword("MEMOIZATION-STATE"), makeKeyword("SBHL-RESOURCE-SPACE"), makeKeyword("PREPARED?"), makeKeyword("DESTRUCTION-IMMINENT?"), makeKeyword("META-PROBLEM-STORE"), makeKeyword("STATIC-PROPERTIES"), makeKeyword("JANITOR"), makeKeyword("HISTORICAL-ROOT-PROBLEMS"), makeKeyword("HISTORICAL-TACTIC-COUNT"), makeKeyword("COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeKeyword("COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeKeyword("PROOF-KEEPING-INDEX") });
        $ic20$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#26833", "CYC"), makeSymbol("S#26834", "CYC"), makeSymbol("S#26835", "CYC"), makeSymbol("S#26836", "CYC"), makeSymbol("S#26837", "CYC"), makeSymbol("S#26838", "CYC"), makeSymbol("S#26839", "CYC"), makeSymbol("S#26840", "CYC"), makeSymbol("S#26841", "CYC"), makeSymbol("S#26842", "CYC"), makeSymbol("S#26843", "CYC"), makeSymbol("S#26844", "CYC"), makeSymbol("S#26845", "CYC"), makeSymbol("S#26846", "CYC"), makeSymbol("S#26847", "CYC"), makeSymbol("S#26848", "CYC"), makeSymbol("S#26849", "CYC"), makeSymbol("S#26850", "CYC"), makeSymbol("S#26851", "CYC"), makeSymbol("S#26852", "CYC"), makeSymbol("S#26853", "CYC"), makeSymbol("S#26854", "CYC"), makeSymbol("S#26855", "CYC"), makeSymbol("S#26856", "CYC"), makeSymbol("S#26857", "CYC"), makeSymbol("S#26858", "CYC"), makeSymbol("S#26859", "CYC"), makeSymbol("S#26860", "CYC"), makeSymbol("S#26861", "CYC"), makeSymbol("S#26862", "CYC"), makeSymbol("S#26863", "CYC"), makeSymbol("S#26864", "CYC"), makeSymbol("S#26865", "CYC"), makeSymbol("S#26866", "CYC"), makeSymbol("S#26867", "CYC"), makeSymbol("S#26868", "CYC"), makeSymbol("S#26869", "CYC"), makeSymbol("S#26870", "CYC"), makeSymbol("S#26871", "CYC"), makeSymbol("S#26872", "CYC"), makeSymbol("S#26873", "CYC"), makeSymbol("S#26874", "CYC"), makeSymbol("S#26875", "CYC"), makeSymbol("S#26876", "CYC"), makeSymbol("S#26877", "CYC"), makeSymbol("S#26878", "CYC"), makeSymbol("S#26879", "CYC"), makeSymbol("S#26880", "CYC") });
        $ic21$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#26881", "CYC"), makeSymbol("S#26882", "CYC"), makeSymbol("S#26883", "CYC"), makeSymbol("S#26884", "CYC"), makeSymbol("S#26885", "CYC"), makeSymbol("S#26886", "CYC"), makeSymbol("S#26887", "CYC"), makeSymbol("S#26888", "CYC"), makeSymbol("S#26889", "CYC"), makeSymbol("S#26890", "CYC"), makeSymbol("S#26891", "CYC"), makeSymbol("S#26892", "CYC"), makeSymbol("S#26893", "CYC"), makeSymbol("S#26894", "CYC"), makeSymbol("S#26895", "CYC"), makeSymbol("S#26896", "CYC"), makeSymbol("S#26897", "CYC"), makeSymbol("S#26898", "CYC"), makeSymbol("S#26899", "CYC"), makeSymbol("S#26900", "CYC"), makeSymbol("S#26901", "CYC"), makeSymbol("S#26902", "CYC"), makeSymbol("S#26903", "CYC"), makeSymbol("S#26904", "CYC"), makeSymbol("S#26905", "CYC"), makeSymbol("S#26906", "CYC"), makeSymbol("S#26907", "CYC"), makeSymbol("S#26908", "CYC"), makeSymbol("S#26909", "CYC"), makeSymbol("S#26910", "CYC"), makeSymbol("S#26911", "CYC"), makeSymbol("S#26912", "CYC"), makeSymbol("S#26913", "CYC"), makeSymbol("S#26914", "CYC"), makeSymbol("S#26915", "CYC"), makeSymbol("S#26916", "CYC"), makeSymbol("S#26917", "CYC"), makeSymbol("S#26918", "CYC"), makeSymbol("S#26919", "CYC"), makeSymbol("S#26920", "CYC"), makeSymbol("S#26921", "CYC"), makeSymbol("S#26922", "CYC"), makeSymbol("S#26923", "CYC"), makeSymbol("S#26924", "CYC"), makeSymbol("S#26925", "CYC"), makeSymbol("S#26926", "CYC"), makeSymbol("S#26927", "CYC"), makeSymbol("S#26928", "CYC") });
        $ic22$ = makeSymbol("S#26934", "CYC");
        $ic23$ = makeInteger(21);
        $ic24$ = makeInteger(22);
        $ic25$ = makeInteger(23);
        $ic26$ = makeInteger(24);
        $ic27$ = makeInteger(25);
        $ic28$ = makeInteger(26);
        $ic29$ = makeInteger(27);
        $ic30$ = makeInteger(28);
        $ic31$ = makeInteger(29);
        $ic32$ = makeInteger(30);
        $ic33$ = makeInteger(31);
        $ic34$ = makeInteger(32);
        $ic35$ = makeInteger(33);
        $ic36$ = makeInteger(34);
        $ic37$ = makeInteger(35);
        $ic38$ = makeInteger(36);
        $ic39$ = makeInteger(37);
        $ic40$ = makeInteger(38);
        $ic41$ = makeInteger(39);
        $ic42$ = makeInteger(40);
        $ic43$ = makeInteger(41);
        $ic44$ = makeInteger(42);
        $ic45$ = makeInteger(43);
        $ic46$ = makeInteger(44);
        $ic47$ = makeInteger(45);
        $ic48$ = makeInteger(46);
        $ic49$ = makeInteger(47);
        $ic50$ = makeInteger(48);
        $ic51$ = makeInteger(49);
        $ic52$ = makeSymbol("S#26832", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#26782", "CYC"));
        $ic54$ = makeSymbol("S#26833", "CYC");
        $ic55$ = makeSymbol("S#26881", "CYC");
        $ic56$ = makeSymbol("S#26834", "CYC");
        $ic57$ = makeSymbol("S#26882", "CYC");
        $ic58$ = makeSymbol("S#26835", "CYC");
        $ic59$ = makeSymbol("S#26883", "CYC");
        $ic60$ = makeSymbol("S#26836", "CYC");
        $ic61$ = makeSymbol("S#26884", "CYC");
        $ic62$ = makeSymbol("S#26837", "CYC");
        $ic63$ = makeSymbol("S#26885", "CYC");
        $ic64$ = makeSymbol("S#26838", "CYC");
        $ic65$ = makeSymbol("S#26886", "CYC");
        $ic66$ = makeSymbol("S#26839", "CYC");
        $ic67$ = makeSymbol("S#26887", "CYC");
        $ic68$ = makeSymbol("S#26840", "CYC");
        $ic69$ = makeSymbol("S#26888", "CYC");
        $ic70$ = makeSymbol("S#26841", "CYC");
        $ic71$ = makeSymbol("S#26889", "CYC");
        $ic72$ = makeSymbol("S#26842", "CYC");
        $ic73$ = makeSymbol("S#26890", "CYC");
        $ic74$ = makeSymbol("S#26843", "CYC");
        $ic75$ = makeSymbol("S#26891", "CYC");
        $ic76$ = makeSymbol("S#26844", "CYC");
        $ic77$ = makeSymbol("S#26892", "CYC");
        $ic78$ = makeSymbol("S#26845", "CYC");
        $ic79$ = makeSymbol("S#26893", "CYC");
        $ic80$ = makeSymbol("S#26846", "CYC");
        $ic81$ = makeSymbol("S#26894", "CYC");
        $ic82$ = makeSymbol("S#26847", "CYC");
        $ic83$ = makeSymbol("S#26895", "CYC");
        $ic84$ = makeSymbol("S#26848", "CYC");
        $ic85$ = makeSymbol("S#26896", "CYC");
        $ic86$ = makeSymbol("S#26849", "CYC");
        $ic87$ = makeSymbol("S#26897", "CYC");
        $ic88$ = makeSymbol("S#26850", "CYC");
        $ic89$ = makeSymbol("S#26898", "CYC");
        $ic90$ = makeSymbol("S#26851", "CYC");
        $ic91$ = makeSymbol("S#26899", "CYC");
        $ic92$ = makeSymbol("S#26852", "CYC");
        $ic93$ = makeSymbol("S#26900", "CYC");
        $ic94$ = makeSymbol("S#26853", "CYC");
        $ic95$ = makeSymbol("S#26901", "CYC");
        $ic96$ = makeSymbol("S#26854", "CYC");
        $ic97$ = makeSymbol("S#26902", "CYC");
        $ic98$ = makeSymbol("S#26855", "CYC");
        $ic99$ = makeSymbol("S#26903", "CYC");
        $ic100$ = makeSymbol("S#26856", "CYC");
        $ic101$ = makeSymbol("S#26904", "CYC");
        $ic102$ = makeSymbol("S#26857", "CYC");
        $ic103$ = makeSymbol("S#26905", "CYC");
        $ic104$ = makeSymbol("S#26858", "CYC");
        $ic105$ = makeSymbol("S#26906", "CYC");
        $ic106$ = makeSymbol("S#26859", "CYC");
        $ic107$ = makeSymbol("S#26907", "CYC");
        $ic108$ = makeSymbol("S#26860", "CYC");
        $ic109$ = makeSymbol("S#26908", "CYC");
        $ic110$ = makeSymbol("S#26861", "CYC");
        $ic111$ = makeSymbol("S#26909", "CYC");
        $ic112$ = makeSymbol("S#26862", "CYC");
        $ic113$ = makeSymbol("S#26910", "CYC");
        $ic114$ = makeSymbol("S#26863", "CYC");
        $ic115$ = makeSymbol("S#26911", "CYC");
        $ic116$ = makeSymbol("S#26864", "CYC");
        $ic117$ = makeSymbol("S#26912", "CYC");
        $ic118$ = makeSymbol("S#26865", "CYC");
        $ic119$ = makeSymbol("S#26913", "CYC");
        $ic120$ = makeSymbol("S#26866", "CYC");
        $ic121$ = makeSymbol("S#26914", "CYC");
        $ic122$ = makeSymbol("S#26867", "CYC");
        $ic123$ = makeSymbol("S#26915", "CYC");
        $ic124$ = makeSymbol("S#26868", "CYC");
        $ic125$ = makeSymbol("S#26916", "CYC");
        $ic126$ = makeSymbol("S#26869", "CYC");
        $ic127$ = makeSymbol("S#26917", "CYC");
        $ic128$ = makeSymbol("S#26870", "CYC");
        $ic129$ = makeSymbol("S#26918", "CYC");
        $ic130$ = makeSymbol("S#26871", "CYC");
        $ic131$ = makeSymbol("S#26919", "CYC");
        $ic132$ = makeSymbol("S#26872", "CYC");
        $ic133$ = makeSymbol("S#26920", "CYC");
        $ic134$ = makeSymbol("S#26873", "CYC");
        $ic135$ = makeSymbol("S#26921", "CYC");
        $ic136$ = makeSymbol("S#26874", "CYC");
        $ic137$ = makeSymbol("S#26922", "CYC");
        $ic138$ = makeSymbol("S#26875", "CYC");
        $ic139$ = makeSymbol("S#26923", "CYC");
        $ic140$ = makeSymbol("S#26876", "CYC");
        $ic141$ = makeSymbol("S#26924", "CYC");
        $ic142$ = makeSymbol("S#26877", "CYC");
        $ic143$ = makeSymbol("S#26925", "CYC");
        $ic144$ = makeSymbol("S#26878", "CYC");
        $ic145$ = makeSymbol("S#26926", "CYC");
        $ic146$ = makeSymbol("S#26879", "CYC");
        $ic147$ = makeSymbol("S#26927", "CYC");
        $ic148$ = makeSymbol("S#26880", "CYC");
        $ic149$ = makeSymbol("S#26928", "CYC");
        $ic150$ = makeKeyword("GUID");
        $ic151$ = makeKeyword("SUID");
        $ic152$ = makeKeyword("LOCK");
        $ic153$ = makeKeyword("CREATION-TIME");
        $ic154$ = makeKeyword("INFERENCE-ID-INDEX");
        $ic155$ = makeKeyword("STRATEGY-ID-INDEX");
        $ic156$ = makeKeyword("PROBLEM-ID-INDEX");
        $ic157$ = makeKeyword("LINK-ID-INDEX");
        $ic158$ = makeKeyword("PROOF-ID-INDEX");
        $ic159$ = makeKeyword("PROBLEM-BY-QUERY-INDEX");
        $ic160$ = makeKeyword("REJECTED-PROOFS");
        $ic161$ = makeKeyword("PROCESSED-PROOFS");
        $ic162$ = makeKeyword("POTENTIALLY-PROCESSED-PROBLEMS");
        $ic163$ = makeKeyword("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");
        $ic164$ = makeKeyword("NON-EXPLANATORY-SUBPROOFS-INDEX");
        $ic165$ = makeKeyword("MOST-RECENT-TACTIC-EXECUTED");
        $ic166$ = makeKeyword("MIN-PROOF-DEPTH-INDEX");
        $ic167$ = makeKeyword("MIN-TRANSFORMATION-DEPTH-INDEX");
        $ic168$ = makeKeyword("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX");
        $ic169$ = makeKeyword("MIN-DEPTH-INDEX");
        $ic170$ = makeKeyword("EQUALITY-REASONING-METHOD");
        $ic171$ = makeKeyword("EQUALITY-REASONING-DOMAIN");
        $ic172$ = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $ic173$ = makeKeyword("MAX-PROBLEM-COUNT");
        $ic174$ = makeKeyword("CRAZY-MAX-PROBLEM-COUNT");
        $ic175$ = makeKeyword("REMOVAL-ALLOWED?");
        $ic176$ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic177$ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $ic178$ = makeKeyword("NEGATION-BY-FAILURE?");
        $ic179$ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $ic180$ = makeKeyword("DIRECTION");
        $ic181$ = makeKeyword("EVALUATE-SUBL-ALLOWED?");
        $ic182$ = makeKeyword("REWRITE-ALLOWED?");
        $ic183$ = makeKeyword("ABDUCTION-ALLOWED?");
        $ic184$ = makeKeyword("NEW-TERMS-ALLOWED?");
        $ic185$ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $ic186$ = makeKeyword("MEMOIZATION-STATE");
        $ic187$ = makeKeyword("SBHL-RESOURCE-SPACE");
        $ic188$ = makeKeyword("PREPARED?");
        $ic189$ = makeKeyword("DESTRUCTION-IMMINENT?");
        $ic190$ = makeKeyword("META-PROBLEM-STORE");
        $ic191$ = makeKeyword("STATIC-PROPERTIES");
        $ic192$ = makeKeyword("JANITOR");
        $ic193$ = makeKeyword("HISTORICAL-ROOT-PROBLEMS");
        $ic194$ = makeKeyword("HISTORICAL-TACTIC-COUNT");
        $ic195$ = makeKeyword("COMPLEX-PROBLEM-QUERY-CZER-INDEX");
        $ic196$ = makeKeyword("COMPLEX-PROBLEM-QUERY-SIGNATURES");
        $ic197$ = makeKeyword("PROOF-KEEPING-INDEX");
        $ic198$ = makeString("Invalid slot ~S for construction function");
        $ic199$ = makeKeyword("BEGIN");
        $ic200$ = makeSymbol("S#26929", "CYC");
        $ic201$ = makeKeyword("SLOT");
        $ic202$ = makeKeyword("END");
        $ic203$ = makeSymbol("S#26931", "CYC");
        $ic204$ = makeKeyword("FREE");
        $ic205$ = makeString("<Invalid PROBLEM STORE ~s>");
        $ic206$ = makeString("<PROBLEM STORE ~a size=~a>");
        $ic207$ = makeSymbol("S#26935", "CYC");
        $ic208$ = ConsesLow.list((SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic209$ = makeSymbol("WITH-LOCK-HELD");
        $ic210$ = makeSymbol("S#26937", "CYC");
        $ic211$ = makeSymbol("S#26936", "CYC");
        $ic212$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3268", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic213$ = makeSymbol("S#3165", "CYC");
        $ic214$ = makeSymbol("S#26939", "CYC");
        $ic215$ = makeSymbol("S#26938", "CYC");
        $ic216$ = makeUninternedSymbol("US#181F880");
        $ic217$ = makeSymbol("CLET");
        $ic218$ = makeSymbol("S#26941", "CYC");
        $ic219$ = makeSymbol("S#11288", "CYC");
        $ic220$ = makeSymbol("S#26942", "CYC");
        $ic221$ = makeSymbol("S#26940", "CYC");
        $ic222$ = makeUninternedSymbol("US#591F892");
        $ic223$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25400", "CYC"), (SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic224$ = makeUninternedSymbol("US#1124883");
        $ic225$ = makeSymbol("S#26945", "CYC");
        $ic226$ = makeSymbol("S#26944", "CYC");
        $ic227$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24185", "CYC"), (SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic228$ = makeUninternedSymbol("US#1124883");
        $ic229$ = makeSymbol("S#26947", "CYC");
        $ic230$ = makeSymbol("S#26946", "CYC");
        $ic231$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#27286", "CYC"), (SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic232$ = makeSymbol("PUNLESS");
        $ic233$ = ConsesLow.list((SubLObject)makeKeyword("TACTICAL"));
        $ic234$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#27287", "CYC"), (SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#6384", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic235$ = ConsesLow.list((SubLObject)makeKeyword("ORDERED"), (SubLObject)makeKeyword("DONE"));
        $ic236$ = makeKeyword("ORDERED");
        $ic237$ = makeUninternedSymbol("US#1124883");
        $ic238$ = makeSymbol("S#26949", "CYC");
        $ic239$ = makeSymbol("DO-PROBLEM-STORE-PROBLEMS");
        $ic240$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15376", "CYC"), (SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#6384", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic241$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("ORDERED"), (SubLObject)makeKeyword("DONE"));
        $ic242$ = makeKeyword("TYPE");
        $ic243$ = makeUninternedSymbol("US#1124883");
        $ic244$ = makeSymbol("S#26950", "CYC");
        $ic245$ = makeSymbol("DO-PROBLEM-STORE-LINKS");
        $ic246$ = makeSymbol("PWHEN");
        $ic247$ = makeSymbol("S#25404", "CYC");
        $ic248$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25415", "CYC"), (SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#25416", "CYC"), (SubLObject)makeSymbol("S#6384", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic249$ = ConsesLow.list((SubLObject)makeKeyword("PROOF-STATUS"), (SubLObject)makeKeyword("ORDERED"), (SubLObject)makeKeyword("DONE"));
        $ic250$ = makeKeyword("PROOF-STATUS");
        $ic251$ = makeUninternedSymbol("US#1124883");
        $ic252$ = makeSymbol("S#26952", "CYC");
        $ic253$ = makeSymbol("S#26951", "CYC");
        $ic254$ = makeSymbol("S#25418", "CYC");
        $ic255$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#27287", "CYC"), (SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic256$ = makeSymbol("S#708", "CYC");
        $ic257$ = makeSymbol("S#26954", "CYC");
        $ic258$ = makeSymbol("S#26953", "CYC");
        $ic259$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24185", "CYC"), (SubLObject)makeSymbol("S#25426", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic260$ = makeUninternedSymbol("US#54717E7");
        $ic261$ = makeSymbol("S#27288", "CYC");
        $ic262$ = makeInteger(80);
        $ic263$ = makeInteger(120);
        $ic264$ = makeSymbol("S#26546", "CYC");
        $ic265$ = makeSymbol("S#26599", "CYC");
        $ic266$ = makeString("A problem store named ~s already exists.");
        $ic267$ = makeString("Problem Store Lock");
        $ic268$ = makeSymbol("S#26601", "CYC");
        $ic269$ = makeSymbol("S#26603", "CYC");
        $ic270$ = makeKeyword("NONE");
        $ic271$ = makeKeyword("EMPTY-DOMAIN");
        $ic272$ = makeSymbol("S#26605", "CYC");
        $ic273$ = makeSymbol("S#26607", "CYC");
        $ic274$ = makeSymbol("BOOLEANP");
        $ic275$ = makeSymbol("S#26611", "CYC");
        $ic276$ = makeString("problem store memoization state");
        $ic277$ = makeString("problem store memoization lock");
        $ic278$ = makeKeyword("SKIP");
        $ic279$ = makeSymbol("S#26790", "CYC");
        $ic280$ = makeSymbol("S#27000", "CYC");
        $ic281$ = makeKeyword("FORWARD");
        $ic282$ = makeKeyword("TACTICAL");
        $ic283$ = makeKeyword("CONTENT");
        $ic284$ = makeKeyword("ANSWER");
        $ic285$ = makeKeyword("REMOVAL");
        $ic286$ = makeKeyword("REMOVAL-CONJUNCTIVE");
        $ic287$ = makeKeyword("TRANSFORMATION");
        $ic288$ = makeKeyword("REWRITE");
        $ic289$ = makeKeyword("STRUCTURAL");
        $ic290$ = makeKeyword("JOIN-ORDERED");
        $ic291$ = makeKeyword("JOIN");
        $ic292$ = makeKeyword("SPLIT");
        $ic293$ = makeKeyword("RESTRICTION");
        $ic294$ = makeKeyword("RESIDUAL-TRANSFORMATION");
        $ic295$ = makeKeyword("UNION");
        $ic296$ = makeInteger(212);
        $ic297$ = makeKeyword("POSSIBLE");
        $ic298$ = makeKeyword("EXECUTED");
        $ic299$ = makeKeyword("DISCARDED");
        $ic300$ = makeSymbol("<");
        $ic301$ = makeSymbol("PROOF-SUID");
        $ic302$ = makeSymbol("S#26813", "CYC");
        $ic303$ = makeSymbol("S#26815", "CYC");
        $ic304$ = makeKeyword("UNDETERMINED");
        $ic305$ = makeKeyword("UNKNOWN");
        $ic306$ = makeKeyword("NON-PROOF-KEEPING");
        $ic307$ = ConsesLow.list((SubLObject)makeKeyword("NON-PROOF-KEEPING"), (SubLObject)makeKeyword("UNKNOWN"));
        $ic308$ = makeString("Invalid proof-keeping reason ~a for problem ~a");
        $ic309$ = makeSymbol("PROOF-REJECTED?");
        $ic310$ = makeSymbol("S#26816", "CYC");
        $ic311$ = makeSymbol("S#26082", "CYC");
        $ic312$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic313$ = makeSymbol("S#27194", "CYC");
        $ic314$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic315$ = makeSymbol("S#27196", "CYC");
        $ic316$ = makeInteger(100);
        $ic317$ = makeSymbol("S#26820", "CYC");
        $ic318$ = makeSymbol("S#26821", "CYC");
        $ic319$ = ConsesLow.list((SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("S#27289", "CYC"), (SubLObject)makeSymbol("S#27290", "CYC"));
        $ic320$ = ConsesLow.list((SubLObject)makeKeyword("STORE"), (SubLObject)makeKeyword("INDESTRUCTIBLE-PROBLEMS"), (SubLObject)makeKeyword("STALE?"));
        $ic321$ = ConsesLow.list((SubLObject)makeSymbol("S#27198", "CYC"), (SubLObject)makeSymbol("S#27199", "CYC"), (SubLObject)makeSymbol("S#27200", "CYC"));
        $ic322$ = ConsesLow.list((SubLObject)makeSymbol("S#27201", "CYC"), (SubLObject)makeSymbol("S#27202", "CYC"), (SubLObject)makeSymbol("S#27203", "CYC"));
        $ic323$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic324$ = makeSymbol("S#27197", "CYC");
        $ic325$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#26821", "CYC"));
        $ic326$ = makeSymbol("S#27198", "CYC");
        $ic327$ = makeSymbol("S#27201", "CYC");
        $ic328$ = makeSymbol("S#27199", "CYC");
        $ic329$ = makeSymbol("S#27202", "CYC");
        $ic330$ = makeSymbol("S#27200", "CYC");
        $ic331$ = makeSymbol("S#27203", "CYC");
        $ic332$ = makeKeyword("STORE");
        $ic333$ = makeKeyword("INDESTRUCTIBLE-PROBLEMS");
        $ic334$ = makeKeyword("STALE?");
        $ic335$ = makeSymbol("S#27204", "CYC");
        $ic336$ = makeSymbol("S#27206", "CYC");
        $ic337$ = makeSymbol("S#27211", "CYC");
        $ic338$ = makeSymbol("S#27212", "CYC");
        $ic339$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#27287", "CYC"), (SubLObject)makeSymbol("S#27280", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic340$ = makeSymbol("S#27209", "CYC");
        $ic341$ = makeSymbol("S#27291", "CYC");
        $ic342$ = makeSymbol("S#27241", "CYC");
        $ic343$ = makeSymbol("S#27242", "CYC");
        $ic344$ = makeSymbol("FIND-PROBLEM-STORE-BY-NAME");
        $ic345$ = makeSymbol("FIND-OR-CREATE-PROBLEM-STORE-BY-NAME");
        $ic346$ = makeKeyword("PROBLEM-STORE-NAME");
        $ic347$ = makeSymbol("DESTROY-PROBLEM-STORE-BY-NAME");
        $ic348$ = makeSymbol("PROBLEM-STORE-PROPERTY-P");
        $ic349$ = makeString("Problem store property ~S reflection is not yet supported");
        $ic350$ = makeInteger(50);
    }
    
    public static final class $problem_store_native extends SubLStructNative
    {
        public SubLObject $guid;
        public SubLObject $suid;
        public SubLObject $lock;
        public SubLObject $creation_time;
        public SubLObject $inference_id_index;
        public SubLObject $strategy_id_index;
        public SubLObject $problem_id_index;
        public SubLObject $link_id_index;
        public SubLObject $proof_id_index;
        public SubLObject $problem_by_query_index;
        public SubLObject $rejected_proofs;
        public SubLObject $processed_proofs;
        public SubLObject $potentially_processed_problems;
        public SubLObject $non_explanatory_subproofs_possibleP;
        public SubLObject $non_explanatory_subproofs_index;
        public SubLObject $most_recent_tactic_executed;
        public SubLObject $min_proof_depth_index;
        public SubLObject $min_transformation_depth_index;
        public SubLObject $min_transformation_depth_signature_index;
        public SubLObject $min_depth_index;
        public SubLObject $equality_reasoning_method;
        public SubLObject $equality_reasoning_domain;
        public SubLObject $intermediate_step_validation_level;
        public SubLObject $max_problem_count;
        public SubLObject $crazy_max_problem_count;
        public SubLObject $removal_allowedP;
        public SubLObject $transformation_allowedP;
        public SubLObject $add_restriction_layer_of_indirectionP;
        public SubLObject $negation_by_failureP;
        public SubLObject $completeness_minimization_allowedP;
        public SubLObject $direction;
        public SubLObject $evaluate_subl_allowedP;
        public SubLObject $rewrite_allowedP;
        public SubLObject $abduction_allowedP;
        public SubLObject $new_terms_allowedP;
        public SubLObject $compute_answer_justificationsP;
        public SubLObject $memoization_state;
        public SubLObject $sbhl_resource_space;
        public SubLObject $preparedP;
        public SubLObject $destruction_imminentP;
        public SubLObject $meta_problem_store;
        public SubLObject $static_properties;
        public SubLObject $janitor;
        public SubLObject $historical_root_problems;
        public SubLObject $historical_tactic_count;
        public SubLObject $complex_problem_query_czer_index;
        public SubLObject $complex_problem_query_signatures;
        public SubLObject $proof_keeping_index;
        private static final SubLStructDeclNative structDecl;
        
        public $problem_store_native() {
            this.$guid = (SubLObject)CommonSymbols.NIL;
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$creation_time = (SubLObject)CommonSymbols.NIL;
            this.$inference_id_index = (SubLObject)CommonSymbols.NIL;
            this.$strategy_id_index = (SubLObject)CommonSymbols.NIL;
            this.$problem_id_index = (SubLObject)CommonSymbols.NIL;
            this.$link_id_index = (SubLObject)CommonSymbols.NIL;
            this.$proof_id_index = (SubLObject)CommonSymbols.NIL;
            this.$problem_by_query_index = (SubLObject)CommonSymbols.NIL;
            this.$rejected_proofs = (SubLObject)CommonSymbols.NIL;
            this.$processed_proofs = (SubLObject)CommonSymbols.NIL;
            this.$potentially_processed_problems = (SubLObject)CommonSymbols.NIL;
            this.$non_explanatory_subproofs_possibleP = (SubLObject)CommonSymbols.NIL;
            this.$non_explanatory_subproofs_index = (SubLObject)CommonSymbols.NIL;
            this.$most_recent_tactic_executed = (SubLObject)CommonSymbols.NIL;
            this.$min_proof_depth_index = (SubLObject)CommonSymbols.NIL;
            this.$min_transformation_depth_index = (SubLObject)CommonSymbols.NIL;
            this.$min_transformation_depth_signature_index = (SubLObject)CommonSymbols.NIL;
            this.$min_depth_index = (SubLObject)CommonSymbols.NIL;
            this.$equality_reasoning_method = (SubLObject)CommonSymbols.NIL;
            this.$equality_reasoning_domain = (SubLObject)CommonSymbols.NIL;
            this.$intermediate_step_validation_level = (SubLObject)CommonSymbols.NIL;
            this.$max_problem_count = (SubLObject)CommonSymbols.NIL;
            this.$crazy_max_problem_count = (SubLObject)CommonSymbols.NIL;
            this.$removal_allowedP = (SubLObject)CommonSymbols.NIL;
            this.$transformation_allowedP = (SubLObject)CommonSymbols.NIL;
            this.$add_restriction_layer_of_indirectionP = (SubLObject)CommonSymbols.NIL;
            this.$negation_by_failureP = (SubLObject)CommonSymbols.NIL;
            this.$completeness_minimization_allowedP = (SubLObject)CommonSymbols.NIL;
            this.$direction = (SubLObject)CommonSymbols.NIL;
            this.$evaluate_subl_allowedP = (SubLObject)CommonSymbols.NIL;
            this.$rewrite_allowedP = (SubLObject)CommonSymbols.NIL;
            this.$abduction_allowedP = (SubLObject)CommonSymbols.NIL;
            this.$new_terms_allowedP = (SubLObject)CommonSymbols.NIL;
            this.$compute_answer_justificationsP = (SubLObject)CommonSymbols.NIL;
            this.$memoization_state = (SubLObject)CommonSymbols.NIL;
            this.$sbhl_resource_space = (SubLObject)CommonSymbols.NIL;
            this.$preparedP = (SubLObject)CommonSymbols.NIL;
            this.$destruction_imminentP = (SubLObject)CommonSymbols.NIL;
            this.$meta_problem_store = (SubLObject)CommonSymbols.NIL;
            this.$static_properties = (SubLObject)CommonSymbols.NIL;
            this.$janitor = (SubLObject)CommonSymbols.NIL;
            this.$historical_root_problems = (SubLObject)CommonSymbols.NIL;
            this.$historical_tactic_count = (SubLObject)CommonSymbols.NIL;
            this.$complex_problem_query_czer_index = (SubLObject)CommonSymbols.NIL;
            this.$complex_problem_query_signatures = (SubLObject)CommonSymbols.NIL;
            this.$proof_keeping_index = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$problem_store_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$guid;
        }
        
        public SubLObject getField3() {
            return this.$suid;
        }
        
        public SubLObject getField4() {
            return this.$lock;
        }
        
        public SubLObject getField5() {
            return this.$creation_time;
        }
        
        public SubLObject getField6() {
            return this.$inference_id_index;
        }
        
        public SubLObject getField7() {
            return this.$strategy_id_index;
        }
        
        public SubLObject getField8() {
            return this.$problem_id_index;
        }
        
        public SubLObject getField9() {
            return this.$link_id_index;
        }
        
        public SubLObject getField10() {
            return this.$proof_id_index;
        }
        
        public SubLObject getField11() {
            return this.$problem_by_query_index;
        }
        
        public SubLObject getField12() {
            return this.$rejected_proofs;
        }
        
        public SubLObject getField13() {
            return this.$processed_proofs;
        }
        
        public SubLObject getField14() {
            return this.$potentially_processed_problems;
        }
        
        public SubLObject getField15() {
            return this.$non_explanatory_subproofs_possibleP;
        }
        
        public SubLObject getField16() {
            return this.$non_explanatory_subproofs_index;
        }
        
        public SubLObject getField17() {
            return this.$most_recent_tactic_executed;
        }
        
        public SubLObject getField18() {
            return this.$min_proof_depth_index;
        }
        
        public SubLObject getField19() {
            return this.$min_transformation_depth_index;
        }
        
        public SubLObject getField20() {
            return this.$min_transformation_depth_signature_index;
        }
        
        public SubLObject getField21() {
            return this.$min_depth_index;
        }
        
        public SubLObject getField22() {
            return this.$equality_reasoning_method;
        }
        
        public SubLObject getField23() {
            return this.$equality_reasoning_domain;
        }
        
        public SubLObject getField24() {
            return this.$intermediate_step_validation_level;
        }
        
        public SubLObject getField25() {
            return this.$max_problem_count;
        }
        
        public SubLObject getField26() {
            return this.$crazy_max_problem_count;
        }
        
        public SubLObject getField27() {
            return this.$removal_allowedP;
        }
        
        public SubLObject getField28() {
            return this.$transformation_allowedP;
        }
        
        public SubLObject getField29() {
            return this.$add_restriction_layer_of_indirectionP;
        }
        
        public SubLObject getField30() {
            return this.$negation_by_failureP;
        }
        
        public SubLObject getField31() {
            return this.$completeness_minimization_allowedP;
        }
        
        public SubLObject getField32() {
            return this.$direction;
        }
        
        public SubLObject getField33() {
            return this.$evaluate_subl_allowedP;
        }
        
        public SubLObject getField34() {
            return this.$rewrite_allowedP;
        }
        
        public SubLObject getField35() {
            return this.$abduction_allowedP;
        }
        
        public SubLObject getField36() {
            return this.$new_terms_allowedP;
        }
        
        public SubLObject getField37() {
            return this.$compute_answer_justificationsP;
        }
        
        public SubLObject getField38() {
            return this.$memoization_state;
        }
        
        public SubLObject getField39() {
            return this.$sbhl_resource_space;
        }
        
        public SubLObject getField40() {
            return this.$preparedP;
        }
        
        public SubLObject getField41() {
            return this.$destruction_imminentP;
        }
        
        public SubLObject getField42() {
            return this.$meta_problem_store;
        }
        
        public SubLObject getField43() {
            return this.$static_properties;
        }
        
        public SubLObject getField44() {
            return this.$janitor;
        }
        
        public SubLObject getField45() {
            return this.$historical_root_problems;
        }
        
        public SubLObject getField46() {
            return this.$historical_tactic_count;
        }
        
        public SubLObject getField47() {
            return this.$complex_problem_query_czer_index;
        }
        
        public SubLObject getField48() {
            return this.$complex_problem_query_signatures;
        }
        
        public SubLObject getField49() {
            return this.$proof_keeping_index;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$guid = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$suid = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$creation_time = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$inference_id_index = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$strategy_id_index = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$problem_id_index = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$link_id_index = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$proof_id_index = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$problem_by_query_index = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$rejected_proofs = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$processed_proofs = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$potentially_processed_problems = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$non_explanatory_subproofs_possibleP = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$non_explanatory_subproofs_index = value;
        }
        
        public SubLObject setField17(final SubLObject value) {
            return this.$most_recent_tactic_executed = value;
        }
        
        public SubLObject setField18(final SubLObject value) {
            return this.$min_proof_depth_index = value;
        }
        
        public SubLObject setField19(final SubLObject value) {
            return this.$min_transformation_depth_index = value;
        }
        
        public SubLObject setField20(final SubLObject value) {
            return this.$min_transformation_depth_signature_index = value;
        }
        
        public SubLObject setField21(final SubLObject value) {
            return this.$min_depth_index = value;
        }
        
        public SubLObject setField22(final SubLObject value) {
            return this.$equality_reasoning_method = value;
        }
        
        public SubLObject setField23(final SubLObject value) {
            return this.$equality_reasoning_domain = value;
        }
        
        public SubLObject setField24(final SubLObject value) {
            return this.$intermediate_step_validation_level = value;
        }
        
        public SubLObject setField25(final SubLObject value) {
            return this.$max_problem_count = value;
        }
        
        public SubLObject setField26(final SubLObject value) {
            return this.$crazy_max_problem_count = value;
        }
        
        public SubLObject setField27(final SubLObject value) {
            return this.$removal_allowedP = value;
        }
        
        public SubLObject setField28(final SubLObject value) {
            return this.$transformation_allowedP = value;
        }
        
        public SubLObject setField29(final SubLObject value) {
            return this.$add_restriction_layer_of_indirectionP = value;
        }
        
        public SubLObject setField30(final SubLObject value) {
            return this.$negation_by_failureP = value;
        }
        
        public SubLObject setField31(final SubLObject value) {
            return this.$completeness_minimization_allowedP = value;
        }
        
        public SubLObject setField32(final SubLObject value) {
            return this.$direction = value;
        }
        
        public SubLObject setField33(final SubLObject value) {
            return this.$evaluate_subl_allowedP = value;
        }
        
        public SubLObject setField34(final SubLObject value) {
            return this.$rewrite_allowedP = value;
        }
        
        public SubLObject setField35(final SubLObject value) {
            return this.$abduction_allowedP = value;
        }
        
        public SubLObject setField36(final SubLObject value) {
            return this.$new_terms_allowedP = value;
        }
        
        public SubLObject setField37(final SubLObject value) {
            return this.$compute_answer_justificationsP = value;
        }
        
        public SubLObject setField38(final SubLObject value) {
            return this.$memoization_state = value;
        }
        
        public SubLObject setField39(final SubLObject value) {
            return this.$sbhl_resource_space = value;
        }
        
        public SubLObject setField40(final SubLObject value) {
            return this.$preparedP = value;
        }
        
        public SubLObject setField41(final SubLObject value) {
            return this.$destruction_imminentP = value;
        }
        
        public SubLObject setField42(final SubLObject value) {
            return this.$meta_problem_store = value;
        }
        
        public SubLObject setField43(final SubLObject value) {
            return this.$static_properties = value;
        }
        
        public SubLObject setField44(final SubLObject value) {
            return this.$janitor = value;
        }
        
        public SubLObject setField45(final SubLObject value) {
            return this.$historical_root_problems = value;
        }
        
        public SubLObject setField46(final SubLObject value) {
            return this.$historical_tactic_count = value;
        }
        
        public SubLObject setField47(final SubLObject value) {
            return this.$complex_problem_query_czer_index = value;
        }
        
        public SubLObject setField48(final SubLObject value) {
            return this.$complex_problem_query_signatures = value;
        }
        
        public SubLObject setField49(final SubLObject value) {
            return this.$proof_keeping_index = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$problem_store_native.class, $ic16$, $ic17$, $ic18$, $ic19$, new String[] { "$guid", "$suid", "$lock", "$creation_time", "$inference_id_index", "$strategy_id_index", "$problem_id_index", "$link_id_index", "$proof_id_index", "$problem_by_query_index", "$rejected_proofs", "$processed_proofs", "$potentially_processed_problems", "$non_explanatory_subproofs_possibleP", "$non_explanatory_subproofs_index", "$most_recent_tactic_executed", "$min_proof_depth_index", "$min_transformation_depth_index", "$min_transformation_depth_signature_index", "$min_depth_index", "$equality_reasoning_method", "$equality_reasoning_domain", "$intermediate_step_validation_level", "$max_problem_count", "$crazy_max_problem_count", "$removal_allowedP", "$transformation_allowedP", "$add_restriction_layer_of_indirectionP", "$negation_by_failureP", "$completeness_minimization_allowedP", "$direction", "$evaluate_subl_allowedP", "$rewrite_allowedP", "$abduction_allowedP", "$new_terms_allowedP", "$compute_answer_justificationsP", "$memoization_state", "$sbhl_resource_space", "$preparedP", "$destruction_imminentP", "$meta_problem_store", "$static_properties", "$janitor", "$historical_root_problems", "$historical_tactic_count", "$complex_problem_query_czer_index", "$complex_problem_query_signatures", "$proof_keeping_index" }, $ic20$, $ic21$, $ic22$);
        }
    }
    
    public static final class $f24009$UnaryFunction extends UnaryFunction
    {
        public $f24009$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26782"));
        }
        
        public SubLObject processItem(final SubLObject var36) {
            return f24009(var36);
        }
    }
    
    public static final class $sX26820_native extends SubLStructNative
    {
        public SubLObject $store;
        public SubLObject $indestructible_problems;
        public SubLObject $staleP;
        private static final SubLStructDeclNative structDecl;
        
        public $sX26820_native() {
            this.$store = (SubLObject)CommonSymbols.NIL;
            this.$indestructible_problems = (SubLObject)CommonSymbols.NIL;
            this.$staleP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX26820_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$store;
        }
        
        public SubLObject getField3() {
            return this.$indestructible_problems;
        }
        
        public SubLObject getField4() {
            return this.$staleP;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$store = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$indestructible_problems = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$staleP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX26820_native.class, $ic317$, $ic318$, $ic319$, $ic320$, new String[] { "$store", "$indestructible_problems", "$staleP" }, $ic321$, $ic322$, $ic323$);
        }
    }
    
    public static final class $f24400$UnaryFunction extends UnaryFunction
    {
        public $f24400$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26821"));
        }
        
        public SubLObject processItem(final SubLObject var36) {
            return f24400(var36);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 3251 ms
	
	Decompiled with Procyon 0.5.32.
*/
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0811 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0811";
    public static final String myFingerPrint = "829fbca44c1183cb0d4eaea0e5f78ca054c996b847b972ddac89821644063b53";
    private static SubLSymbol $g6440$;
    private static SubLSymbol $g6441$;
    private static SubLSymbol $g6442$;
    private static SubLSymbol $g6443$;
    private static SubLSymbol $g6444$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLInteger $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLList $ic30$;
    private static final SubLString $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLList $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLList $ic114$;
    private static final SubLList $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
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
    private static final SubLList $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLList $ic140$;
    private static final SubLList $ic141$;
    private static final SubLList $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLList $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLList $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLList $ic150$;
    private static final SubLList $ic151$;
    private static final SubLList $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLList $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLList $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLList $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLList $ic166$;
    private static final SubLList $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLList $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLList $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLList $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLList $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLList $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLList $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLList $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLList $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLList $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLList $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLList $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLList $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLList $ic212$;
    private static final SubLList $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLList $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLList $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLList $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLString $ic225$;
    private static final SubLString $ic226$;
    private static final SubLString $ic227$;
    private static final SubLString $ic228$;
    private static final SubLList $ic229$;
    private static final SubLList $ic230$;
    private static final SubLList $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLList $ic233$;
    private static final SubLList $ic234$;
    private static final SubLList $ic235$;
    private static final SubLList $ic236$;
    private static final SubLList $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLList $ic241$;
    private static final SubLList $ic242$;
    private static final SubLList $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLList $ic245$;
    private static final SubLList $ic246$;
    private static final SubLList $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLList $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLList $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLList $ic260$;
    private static final SubLList $ic261$;
    private static final SubLList $ic262$;
    private static final SubLList $ic263$;
    private static final SubLList $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLList $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLList $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLList $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLList $ic273$;
    private static final SubLList $ic274$;
    private static final SubLList $ic275$;
    private static final SubLList $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLSymbol $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLList $ic280$;
    private static final SubLList $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLList $ic284$;
    private static final SubLList $ic285$;
    private static final SubLList $ic286$;
    private static final SubLList $ic287$;
    private static final SubLList $ic288$;
    private static final SubLList $ic289$;
    private static final SubLList $ic290$;
    private static final SubLList $ic291$;
    private static final SubLList $ic292$;
    private static final SubLList $ic293$;
    private static final SubLList $ic294$;
    private static final SubLList $ic295$;
    private static final SubLList $ic296$;
    private static final SubLList $ic297$;
    private static final SubLList $ic298$;
    
    
    public static SubLObject f51787() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g6440$.getDynamicValue(var1);
    }
    
    public static SubLObject f51788(SubLObject var2) {
        if (var2.isAtom()) {
            return f51789(var2);
        }
        var2 = f51790(var2);
        final SubLObject var3 = var2.first();
        final SubLObject var4 = f51791(var3);
        if (NIL != var4) {
            return f51792(var4, var2);
        }
        if (var3.isMacroOperator()) {
            return f51793(var2);
        }
        return f51794(var2);
    }
    
    public static SubLObject f51795(final SubLObject var2, SubLObject var5, SubLObject var6) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)$ic0$;
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = reader.$features$.currentBinding(var7);
        try {
            reader.$features$.bind(conses_high.adjoin(var5, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var7);
            var8 = f51788(var2);
        }
        finally {
            reader.$features$.rebind(var9, var7);
        }
        return var8;
    }
    
    public static SubLObject f51789(final SubLObject var2) {
        if (var2.isKeyword()) {
            return f51796(var2);
        }
        if (var2 == NIL || var2 == T) {
            return f51796(var2);
        }
        if (var2.isSymbol()) {
            return f51797(var2);
        }
        if (NIL != Eval.constantp(var2, (SubLObject)UNPROVIDED)) {
            return f51796(var2);
        }
        return Errors.error((SubLObject)$ic1$, var2);
    }
    
    public static SubLObject f51796(final SubLObject var2) {
        return module0812.f52007(var2);
    }
    
    public static SubLObject f51798(final SubLObject var9) {
        SubLObject var10 = module0809.f51530(var9);
        if (var10 != $ic2$) {
            return var10;
        }
        var10 = module0812.f51986(var9);
        if (var10 != $ic2$) {
            return var10;
        }
        return (SubLObject)$ic3$;
    }
    
    public static SubLObject f51797(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = f51798(var9);
        if (var11 != $ic3$) {
            module0809.f51685(var9);
        }
        final SubLObject var12 = var11;
        if (var12.eql((SubLObject)$ic3$)) {
            return f51799(var9);
        }
        if (var12.eql((SubLObject)$ic4$)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic5$, f51799(var9));
        }
        if (var12.eql((SubLObject)$ic6$)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic7$, f51799(var9));
        }
        if (var12.eql((SubLObject)$ic8$)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic7$, f51799(var9));
        }
        return Errors.error((SubLObject)$ic9$, var11, var9);
    }
    
    public static SubLObject f51799(final SubLObject var9) {
        final SubLObject var10 = f51798(var9);
        if (var10 != $ic3$) {
            module0812.f52010(var9);
        }
        return var9;
    }
    
    public static SubLObject f51792(final SubLObject var4, final SubLObject var2) {
        if (NIL == module0004.f85(var4)) {
            return Errors.error((SubLObject)$ic10$, var4);
        }
        return Functions.funcall(var4, var2);
    }
    
    public static SubLObject f51793(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic11$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0809.f51688(var3);
        return f51788(Eval.macroexpand_1(var2, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f51794(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic12$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0809.f51689(var3);
        final SubLObject var6 = f51800(var3);
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var5;
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            var7 = (SubLObject)ConsesLow.cons(f51788(var9), var7);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return reader.bq_cons(var6, ConsesLow.append(Sequences.nreverse(var7), (SubLObject)NIL));
    }
    
    public static SubLObject f51800(final SubLObject var2) {
        module0812.f52011(var2);
        return var2;
    }
    
    public static SubLObject f51801(final SubLObject var22) {
        return Symbols.get(var22, (SubLObject)$ic13$, (SubLObject)$ic14$);
    }
    
    public static SubLObject f51802(final SubLObject var22) {
        return Symbols.get(var22, (SubLObject)$ic15$, (SubLObject)$ic14$);
    }
    
    public static SubLObject f51803(final SubLObject var22) {
        return (SubLObject)makeBoolean(var22.isSymbol() && $ic16$ == f51801(var22));
    }
    
    public static SubLObject f51804(final SubLObject var22) {
        return (SubLObject)makeBoolean(var22.isSymbol() && $ic16$ == f51802(var22));
    }
    
    public static SubLObject f51805(final SubLObject var23) {
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = var23;
        SubLObject var26 = (SubLObject)NIL;
        var26 = var25.first();
        while (NIL != var25) {
            final SubLObject var27 = f51788(var26);
            var24 = (SubLObject)ConsesLow.cons(var27, var24);
            var25 = var25.rest();
            var26 = var25.first();
        }
        return module0814.f52178(Sequences.nreverse(var24));
    }
    
    public static SubLObject f51806(final SubLObject var26) {
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = var26;
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            if (var29.isCons()) {
                SubLObject var31;
                final SubLObject var30 = var31 = var29;
                SubLObject var32 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic17$);
                var32 = var31.first();
                var31 = var31.rest();
                final SubLObject var33 = (SubLObject)(var31.isCons() ? var31.first() : NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var31, var30, (SubLObject)$ic17$);
                var31 = var31.rest();
                final SubLObject var34 = (SubLObject)(var31.isCons() ? var31.first() : NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var31, var30, (SubLObject)$ic17$);
                var31 = var31.rest();
                if (NIL == var31) {
                    var27 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var32, f51788(var33), ConsesLow.append((SubLObject)((NIL != var34) ? ConsesLow.list(var34) : NIL), (SubLObject)NIL)), var27);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic17$);
                }
            }
            else {
                var27 = (SubLObject)ConsesLow.cons(var29, var27);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f51807(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return (SubLObject)$ic18$;
    }
    
    public static SubLObject f51808(final SubLObject var32) {
        return module0035.f2169(var32, (SubLObject)$ic19$);
    }
    
    public static SubLObject f51809(final SubLObject var33) {
        return (SubLObject)makeBoolean(var33.isSymbol() && $ic4$ == Symbols.get(var33, (SubLObject)$ic20$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f51810(final SubLObject var33) {
        return (SubLObject)makeBoolean(var33.isSymbol() && $ic6$ == Symbols.get(var33, (SubLObject)$ic20$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f51811(final SubLObject var33) {
        return (SubLObject)makeBoolean(var33.isSymbol() && $ic8$ == Symbols.get(var33, (SubLObject)$ic20$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f51812(final SubLObject var34) {
        if (NIL != f51809(var34)) {
            return (SubLObject)$ic4$;
        }
        if (NIL != f51810(var34)) {
            return (SubLObject)$ic6$;
        }
        if (NIL != f51811(var34)) {
            return (SubLObject)$ic8$;
        }
        return (SubLObject)$ic2$;
    }
    
    public static SubLObject f51813(final SubLObject var33) {
        return (SubLObject)makeBoolean(var33.isSymbol() && NIL != Symbols.get(var33, (SubLObject)$ic21$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f51814(final SubLObject var35, final SubLObject var2, final SubLObject var25) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        if (NIL == $g6441$.getDynamicValue(var36)) {
            return (SubLObject)NIL;
        }
        final SubLObject var37 = module0035.f2422(var2);
        final SubLObject var38 = module0035.f2422(var25);
        final SubLObject var39 = f51815(var37, var38);
        final SubLObject var40 = (SubLObject)$ic22$;
        SubLObject var41 = (SubLObject)NIL;
        if ($g6441$.getDynamicValue(var36).isVector()) {
            var41 = $g6441$.getDynamicValue(var36);
            Vectors.set_aref(var41, (SubLObject)ZERO_INTEGER, Numbers.add(Vectors.aref(var41, (SubLObject)ZERO_INTEGER), (SubLObject)ONE_INTEGER));
            Vectors.set_aref(var41, (SubLObject)ONE_INTEGER, Numbers.add(Vectors.aref(var41, (SubLObject)ONE_INTEGER), var37));
            Vectors.set_aref(var41, (SubLObject)TWO_INTEGER, Numbers.add(Vectors.aref(var41, (SubLObject)TWO_INTEGER), var38));
            Vectors.set_aref(var41, (SubLObject)THREE_INTEGER, Numbers.add(Vectors.aref(var41, (SubLObject)THREE_INTEGER), var39));
        }
        if (var39.numG(var40)) {
            if ($g6441$.getDynamicValue(var36).isVector()) {
                Vectors.set_aref(var41, (SubLObject)FOUR_INTEGER, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var35, var39), Vectors.aref(var41, (SubLObject)FOUR_INTEGER)));
            }
            else {
                Errors.warn((SubLObject)$ic23$, var35, Numbers.round(module0048.f3302(var39, (SubLObject)TWO_INTEGER), (SubLObject)UNPROVIDED));
            }
        }
        return var39;
    }
    
    public static SubLObject f51816(final SubLObject var2, final SubLObject var5, final SubLObject var41) {
        final SubLObject var42 = f51795(var2, var5, var41);
        final SubLObject var43 = module0035.f2422(var2);
        final SubLObject var44 = module0035.f2422(var42);
        return f51815(var43, var44);
    }
    
    public static SubLObject f51815(final SubLObject var36, final SubLObject var37) {
        return (SubLObject)(var36.isZero() ? ZERO_INTEGER : Numbers.divide(var37, var36));
    }
    
    public static SubLObject f51817(SubLObject var40, SubLObject var42) {
        if (var40 == UNPROVIDED) {
            var40 = $g6441$.getDynamicValue();
        }
        if (var42 == UNPROVIDED) {
            var42 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var43 = Vectors.aref(var40, (SubLObject)ZERO_INTEGER);
        final SubLObject var44 = Vectors.aref(var40, (SubLObject)ONE_INTEGER);
        final SubLObject var45 = Vectors.aref(var40, (SubLObject)TWO_INTEGER);
        final SubLObject var46 = Sort.sort(conses_high.copy_list(Vectors.aref(var40, (SubLObject)FOUR_INTEGER)), Symbols.symbol_function((SubLObject)$ic24$), Symbols.symbol_function((SubLObject)$ic25$));
        PrintLow.format(var42, (SubLObject)$ic26$, var43);
        PrintLow.format(var42, (SubLObject)$ic27$, module0048.f3302(Numbers.divide(var44, var43), (SubLObject)THREE_INTEGER));
        PrintLow.format(var42, (SubLObject)$ic28$, module0048.f3302(Numbers.divide(var45, var44), (SubLObject)THREE_INTEGER));
        PrintLow.format(var42, (SubLObject)$ic29$);
        SubLObject var47 = var46;
        SubLObject var48 = (SubLObject)NIL;
        var48 = var47.first();
        while (NIL != var47) {
            SubLObject var49;
            final SubLObject var48_49 = var49 = var48;
            SubLObject var50 = (SubLObject)NIL;
            SubLObject var51 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var49, var48_49, (SubLObject)$ic30$);
            var50 = var49.first();
            var49 = var49.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var49, var48_49, (SubLObject)$ic30$);
            var51 = var49.first();
            var49 = var49.rest();
            if (NIL == var49) {
                PrintLow.format(var42, (SubLObject)$ic31$, Numbers.round(module0048.f3302(var51, (SubLObject)THREE_INTEGER), (SubLObject)UNPROVIDED), var50);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var48_49, (SubLObject)$ic30$);
            }
            var47 = var47.rest();
            var48 = var47.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51791(final SubLObject var3) {
        return module0035.f2294($g6442$.getGlobalValue(), var3, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51818(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic33$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)$ic34$);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            final SubLObject var9 = f51819((SubLObject)ConsesLow.list((SubLObject)$ic35$, var8));
            var6 = (SubLObject)ConsesLow.cons(var9, var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return module0814.f52170((SubLObject)ConsesLow.list((SubLObject)$ic36$, module0814.f52172(reader.bq_cons((SubLObject)$ic37$, ConsesLow.append(Sequences.nreverse(var6), (SubLObject)NIL)))));
    }
    
    public static SubLObject f51820(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic38$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic38$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic38$);
        var6 = var7.first();
        final SubLObject var8;
        var7 = (var8 = var7.rest());
        module0035.f2502(var4, (SubLObject)$ic39$);
        final SubLObject var9 = f51788(var5);
        final SubLObject var10 = f51821(var8);
        final SubLObject var11 = (SubLObject)$ic40$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic41$, (SubLObject)ConsesLow.list(var9, var6, var11), ConsesLow.append(var10, (SubLObject)NIL));
    }
    
    public static SubLObject f51821(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)NIL;
        final SubLObject var26 = $g6440$.currentBinding(var24);
        try {
            $g6440$.bind((SubLObject)T, var24);
            var25 = f51805(var23);
        }
        finally {
            $g6440$.rebind(var26, var24);
        }
        return var25;
    }
    
    public static SubLObject f51822(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = $g6440$.currentBinding(var3);
        try {
            $g6440$.bind((SubLObject)T, var3);
            var4 = f51788(var2);
        }
        finally {
            $g6440$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f51823(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic42$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic42$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var2, (SubLObject)$ic42$);
        var5 = var5.rest();
        if (NIL == var5) {
            module0035.f2502(var3, (SubLObject)$ic43$);
            return f51824((SubLObject)ConsesLow.list((SubLObject)$ic44$, var4, (SubLObject)ConsesLow.list((SubLObject)$ic45$, var4, var6)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic42$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51825(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic46$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic46$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic46$);
        var5 = var6.first();
        final SubLObject var7;
        var6 = (var7 = var6.rest());
        module0035.f2502(var3, (SubLObject)$ic47$);
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = var4;
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            SubLObject var79_80;
            final SubLObject var77_78 = var79_80 = var14;
            SubLObject var15 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var79_80, var77_78, (SubLObject)$ic48$);
            var15 = var79_80.first();
            var79_80 = var79_80.rest();
            final SubLObject var16 = (SubLObject)(var79_80.isCons() ? var79_80.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var79_80, var77_78, (SubLObject)$ic48$);
            var79_80 = var79_80.rest();
            final SubLObject var17 = (SubLObject)(var79_80.isCons() ? var79_80.first() : NIL);
            final SubLObject var18 = Types.consp(var79_80);
            cdestructuring_bind.destructuring_bind_must_listp(var79_80, var77_78, (SubLObject)$ic48$);
            var79_80 = var79_80.rest();
            if (NIL == var79_80) {
                var8 = (SubLObject)ConsesLow.cons(var15, var8);
                var9 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic49$, var15, var16), var9);
                if (NIL != var18) {
                    var11 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic49$, var15, var17), var11);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var77_78, (SubLObject)$ic48$);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        var8 = Sequences.nreverse(var8);
        var9 = Sequences.nreverse(var9);
        var11 = Sequences.nreverse(var11);
        SubLObject var86_87;
        final SubLObject var84_85 = var86_87 = var5;
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var86_87, var84_85, (SubLObject)$ic50$);
        var19 = var86_87.first();
        final SubLObject var20;
        var86_87 = (var20 = var86_87.rest());
        var10 = (SubLObject)ConsesLow.list((SubLObject)$ic51$, var19);
        var12 = var20;
        return f51826((SubLObject)ConsesLow.listS((SubLObject)$ic52$, var8, (SubLObject)ConsesLow.listS((SubLObject)$ic53$, (SubLObject)ConsesLow.list(var9, var10, var11), ConsesLow.append(var7, (SubLObject)NIL)), ConsesLow.append(var12, (SubLObject)NIL)));
    }
    
    public static SubLObject f51827(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic54$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic54$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic54$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic54$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic54$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            module0035.f2502(var3, (SubLObject)$ic55$);
            final SubLObject var10 = f51805(var9);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic55$, (SubLObject)ConsesLow.list(var6, var7, var8), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic54$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51828(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic56$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic56$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic56$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic56$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            module0035.f2502(var3, (SubLObject)$ic57$);
            final SubLObject var9 = (SubLObject)$ic58$;
            final SubLObject var10 = (SubLObject)$ic59$;
            return f51826((SubLObject)ConsesLow.list((SubLObject)$ic52$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var7), var10, var6), (SubLObject)ConsesLow.listS((SubLObject)$ic55$, (SubLObject)ConsesLow.list(var6, var9, var10), ConsesLow.append(var8, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic56$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51829(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic60$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic60$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic60$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic60$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic60$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic60$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic60$);
        var10 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            module0035.f2502(var3, (SubLObject)$ic61$);
            final SubLObject var12 = f51805(var11);
            final SubLObject var13 = f51788(var8);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic61$, (SubLObject)ConsesLow.list(var6, var7, var13, var9, var10), ConsesLow.append(var12, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic60$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51830(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic62$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic62$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic62$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic62$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic62$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic62$);
            return (SubLObject)NIL;
        }
        final SubLObject var9;
        var4 = (var9 = var5);
        module0035.f2502(var3, (SubLObject)$ic63$);
        if (!var8.isAtom() || NIL != f51809(var8)) {
            final SubLObject var10 = (SubLObject)$ic64$;
            return f51826((SubLObject)ConsesLow.list((SubLObject)$ic52$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var8)), (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(var6, var7, var10), ConsesLow.append(var9, (SubLObject)NIL))));
        }
        final SubLObject var11 = (SubLObject)$ic65$;
        final SubLObject var12 = (SubLObject)$ic66$;
        return f51826((SubLObject)ConsesLow.list((SubLObject)$ic52$, (SubLObject)ConsesLow.list(var6, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic61$, (SubLObject)ConsesLow.list(var6, var7, var8, var11, var12), ConsesLow.append(var9, (SubLObject)NIL))));
    }
    
    public static SubLObject f51831(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic67$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic67$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic67$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic67$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            module0035.f2502(var3, (SubLObject)$ic68$);
            final SubLObject var9 = (SubLObject)$ic69$;
            return f51832((SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var7)), (SubLObject)ConsesLow.listS((SubLObject)$ic71$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var9))), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list((SubLObject)$ic73$, var9)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic49$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic74$, var9)), (SubLObject)ConsesLow.list((SubLObject)$ic49$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var9)))), ConsesLow.append(var8, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic67$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51833(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic75$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic75$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic75$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic75$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic75$);
            return (SubLObject)NIL;
        }
        final SubLObject var8;
        var4 = (var8 = var5);
        module0035.f2502(var3, (SubLObject)$ic76$);
        if (!var7.isAtom()) {
            final SubLObject var9 = (SubLObject)$ic77$;
            return f51832((SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var7)), (SubLObject)ConsesLow.listS((SubLObject)$ic76$, (SubLObject)ConsesLow.list(var6, var9), ConsesLow.append(var8, (SubLObject)NIL))));
        }
        return f51834((SubLObject)ConsesLow.listS((SubLObject)$ic71$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(reader.bq_cons(var6, (SubLObject)$ic78$)), (SubLObject)ConsesLow.list((SubLObject)$ic79$, var6, var7), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic80$, var6))), ConsesLow.append(var8, (SubLObject)NIL)));
    }
    
    public static SubLObject f51835(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic81$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic81$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic81$);
        var5 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            module0035.f2502(var3, (SubLObject)$ic82$);
            module0809.f51689(var5);
            final SubLObject var7 = f51788(var4);
            final SubLObject var8 = f51800(var5);
            f51788((SubLObject)ConsesLow.list((SubLObject)$ic83$, var5));
            return (SubLObject)ConsesLow.list((SubLObject)$ic84$, var7, var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic81$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51836(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic42$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic42$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var2, (SubLObject)$ic42$);
        var5 = var5.rest();
        if (NIL == var5) {
            module0035.f2502(var3, (SubLObject)$ic80$);
            return f51824((SubLObject)ConsesLow.list((SubLObject)$ic44$, var4, (SubLObject)ConsesLow.list((SubLObject)$ic85$, var4, var6)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic42$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51826(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic86$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic86$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic52$);
        return f51837((SubLObject)NIL, var4, var6);
    }
    
    public static SubLObject f51837(final SubLObject var134, final SubLObject var133, final SubLObject var23) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        if (NIL == var133) {
            return f51838(var134, var23);
        }
        SubLObject var136 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var133, var133, (SubLObject)$ic87$);
        var136 = var133.first();
        final SubLObject var138;
        final SubLObject var137 = var138 = var133.rest();
        SubLObject var139 = (SubLObject)$ic88$;
        SubLObject var140 = (SubLObject)NIL;
        if (var136.isCons()) {
            SubLObject var141_142;
            final SubLObject var139_140 = var141_142 = var136;
            SubLObject var141 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var141_142, var139_140, (SubLObject)$ic89$);
            var141 = var141_142.first();
            var141_142 = var141_142.rest();
            final SubLObject var142 = (SubLObject)(var141_142.isCons() ? var141_142.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var141_142, var139_140, (SubLObject)$ic89$);
            var141_142 = var141_142.rest();
            if (NIL == var141_142) {
                var139 = var141;
                var140 = var142;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var139_140, (SubLObject)$ic89$);
            }
        }
        else {
            var139 = var136;
        }
        final SubLObject var143 = f51798(var139);
        final SubLObject var144 = f51799(var139);
        final SubLObject var145 = f51788(var140);
        final SubLObject var146 = f51837((SubLObject)makeBoolean(NIL != var134 || var143 == $ic4$), var138, var23);
        final SubLObject var147 = var143;
        if (var147.eql((SubLObject)$ic3$)) {
            return module0814.f52165((SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var144, var145)), var146));
        }
        if (var147.eql((SubLObject)$ic4$)) {
            module0809.f51687(var139);
            return module0814.f52166((SubLObject)ConsesLow.list((SubLObject)$ic90$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var144, var145)), var146));
        }
        if (var147.eql((SubLObject)$ic6$)) {
            return Errors.error((SubLObject)$ic91$, var139);
        }
        if (var147.eql((SubLObject)$ic8$)) {
            return Errors.error((SubLObject)$ic92$, var139);
        }
        return Errors.error((SubLObject)$ic93$, var139);
    }
    
    public static SubLObject f51838(final SubLObject var134, final SubLObject var23) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        SubLObject var136 = (SubLObject)NIL;
        if (NIL != var134) {
            final SubLObject var137 = $g6440$.currentBinding(var135);
            try {
                $g6440$.bind((SubLObject)T, var135);
                var136 = f51838((SubLObject)NIL, var23);
            }
            finally {
                $g6440$.rebind(var137, var135);
            }
        }
        else {
            var136 = f51839(reader.bq_cons((SubLObject)$ic94$, ConsesLow.append(var23, (SubLObject)NIL)));
        }
        return var136;
    }
    
    public static SubLObject f51840(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic95$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic95$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic95$);
        var6 = var7.first();
        final SubLObject var8;
        var7 = (var8 = var7.rest());
        module0035.f2502(var4, (SubLObject)$ic96$);
        final SubLObject var9 = f51841(var5, var6);
        return f51839((SubLObject)ConsesLow.list((SubLObject)$ic94$, (SubLObject)$ic97$, (SubLObject)ConsesLow.listS((SubLObject)$ic52$, var9, (SubLObject)$ic97$, ConsesLow.append(var8, (SubLObject)NIL))));
    }
    
    public static SubLObject f51841(final SubLObject var69, final SubLObject var150) {
        final SubLThread var151 = SubLProcess.currentSubLThread();
        SubLObject var152 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var69, (SubLObject)$ic98$);
        var152 = var69.first();
        final SubLObject var154;
        final SubLObject var153 = var154 = var69.rest();
        SubLObject var155 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var152, var150));
        SubLObject var156 = (SubLObject)NIL;
        SubLObject var157 = (SubLObject)NIL;
        SubLObject var158 = (SubLObject)NIL;
        var156 = var154;
        var157 = var156.first();
        for (var158 = (SubLObject)ZERO_INTEGER; NIL != var156; var156 = var156.rest(), var157 = var156.first(), var158 = Numbers.add((SubLObject)ONE_INTEGER, var158)) {
            var155 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var157, (SubLObject)ConsesLow.list((SubLObject)$ic99$, module0048.f_1X(var158))), var155);
        }
        return Sequences.nreverse(var155);
    }
    
    public static SubLObject f51842(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic100$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic100$);
        var4 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            module0035.f2502(var3, (SubLObject)$ic51$);
            final SubLObject var6 = f51819((SubLObject)ConsesLow.list((SubLObject)$ic35$, var4));
            return module0814.f52170((SubLObject)ConsesLow.list((SubLObject)$ic36$, module0814.f52171((SubLObject)ConsesLow.list((SubLObject)$ic101$, var6))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic100$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51843(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic33$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)$ic102$);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            final SubLObject var9 = f51819((SubLObject)ConsesLow.list((SubLObject)$ic35$, var8));
            var6 = (SubLObject)ConsesLow.cons(var9, var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return module0814.f52170((SubLObject)ConsesLow.list((SubLObject)$ic36$, module0814.f52173(reader.bq_cons((SubLObject)$ic103$, ConsesLow.append(Sequences.nreverse(var6), (SubLObject)NIL)))));
    }
    
    public static SubLObject f51844(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic104$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic104$);
        var4 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            module0035.f2502(var3, (SubLObject)$ic105$);
            return f51824((SubLObject)ConsesLow.list((SubLObject)$ic44$, var4, (SubLObject)ConsesLow.list((SubLObject)$ic106$, var4)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic104$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51845(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic107$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic107$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic107$);
        var5 = var6.first();
        final SubLObject var7;
        var6 = (var7 = var6.rest());
        module0035.f2502(var3, (SubLObject)$ic108$);
        final SubLObject var8 = f51788(var4);
        final SubLObject var9 = f51788(var5);
        final SubLObject var10 = f51805(var7);
        final SubLObject var11 = (SubLObject)$ic109$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic110$, (SubLObject)ConsesLow.list(var8, var9, var11), ConsesLow.append(var10, (SubLObject)NIL));
    }
    
    public static SubLObject f51846(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic111$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic111$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic111$);
        var5 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            module0035.f2502(var3, (SubLObject)$ic112$);
            return f51824((SubLObject)ConsesLow.list((SubLObject)$ic44$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic113$, var4, var5)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic111$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51847(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic114$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic114$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic114$);
        var5 = var6.first();
        var6 = var6.rest();
        final SubLObject var7 = (SubLObject)(var6.isCons() ? var6.first() : $ic115$);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var2, (SubLObject)$ic114$);
        var6 = var6.rest();
        final SubLObject var8 = (SubLObject)(var6.isCons() ? var6.first() : $ic116$);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var2, (SubLObject)$ic114$);
        var6 = var6.rest();
        if (NIL == var6) {
            module0035.f2502(var3, (SubLObject)$ic117$);
            final SubLObject var9 = (SubLObject)$ic118$;
            return f51826((SubLObject)ConsesLow.list((SubLObject)$ic52$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var4)), (SubLObject)ConsesLow.list((SubLObject)$ic119$, (SubLObject)ConsesLow.list((SubLObject)$ic120$, var9, var5, var7, var8), (SubLObject)ConsesLow.list((SubLObject)$ic112$, var9, var5))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic114$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51824(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic121$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic121$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic121$);
        var5 = var6.first();
        var6 = var6.rest();
        if (NIL != var6) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic121$);
            return (SubLObject)NIL;
        }
        module0035.f2502(var3, (SubLObject)$ic44$);
        if (var4.isAtom()) {
            return f51848((SubLObject)ConsesLow.list((SubLObject)$ic49$, var4, var5));
        }
        final SubLObject var7 = var4.first();
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = var7;
        if (var9.eql((SubLObject)$ic122$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)$ic123$, conses_high.second(var4), var5);
        }
        else if (var9.eql((SubLObject)$ic106$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)$ic124$, conses_high.second(var4), var5);
        }
        else if (var9.eql((SubLObject)$ic125$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)$ic126$, conses_high.second(var4), conses_high.third(var4), var5);
        }
        else if (var9.eql((SubLObject)$ic127$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)$ic128$, conses_high.second(var4), conses_high.third(var4), var5);
        }
        else if (var9.eql((SubLObject)$ic129$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)$ic128$, conses_high.second(var4), conses_high.third(var4), var5);
        }
        else if (var9.eql((SubLObject)$ic130$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)$ic131$, conses_high.second(var4), conses_high.third(var4), var5);
        }
        else if (var9.eql((SubLObject)$ic132$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)$ic133$, conses_high.second(var4), conses_high.third(var4), var5);
        }
        else if (var9.eql((SubLObject)$ic134$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)$ic135$, conses_high.second(var4), conses_high.third(var4), var5);
        }
        else if (var9.eql((SubLObject)$ic136$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)$ic137$, conses_high.second(var4), var5);
        }
        else {
            SubLObject var181_182;
            final SubLObject var179_180 = var181_182 = var4;
            SubLObject var177_183 = (SubLObject)NIL;
            SubLObject var10 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var181_182, var179_180, (SubLObject)$ic138$);
            var177_183 = var181_182.first();
            var181_182 = var181_182.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var181_182, var179_180, (SubLObject)$ic138$);
            var10 = var181_182.first();
            var181_182 = var181_182.rest();
            if (NIL == var181_182) {
                final SubLObject var11 = f51849(var177_183);
                var8 = (SubLObject)ConsesLow.list(var11, var10, var5);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var179_180, (SubLObject)$ic138$);
            }
        }
        return f51788(var8);
    }
    
    public static SubLObject f51849(final SubLObject var177) {
        return Functions.funcall((SubLObject)$ic139$, var177);
    }
    
    public static SubLObject f51848(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic140$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic140$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic140$);
        var5 = var6.first();
        final SubLObject var7;
        var6 = (var7 = var6.rest());
        module0035.f2502(var3, (SubLObject)$ic49$);
        f51850(var4);
        final SubLObject var8 = f51799(var4);
        final SubLObject var9 = f51788(var5);
        if (NIL == var7) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic49$, var8, var9);
        }
        final SubLObject var10 = f51851(var7);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic94$, (SubLObject)ConsesLow.list((SubLObject)$ic49$, var8, var9), ConsesLow.append(var10, (SubLObject)NIL));
    }
    
    public static SubLObject f51851(final SubLObject var187) {
        if (NIL == var187) {
            return (SubLObject)NIL;
        }
        SubLObject var188 = (SubLObject)NIL;
        SubLObject var189 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var187, var187, (SubLObject)$ic141$);
        var188 = var187.first();
        SubLObject var190 = var187.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var190, var187, (SubLObject)$ic141$);
        var189 = var190.first();
        final SubLObject var191;
        var190 = (var191 = var190.rest());
        f51850(var188);
        final SubLObject var192 = f51799(var188);
        final SubLObject var193 = f51788(var189);
        final SubLObject var194 = f51851(var191);
        return reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic49$, var192, var193), ConsesLow.append(var194, (SubLObject)NIL));
    }
    
    public static SubLObject f51850(final SubLObject var9) {
        final SubLObject var11;
        final SubLObject var10 = var11 = f51798(var9);
        if (var11.eql((SubLObject)$ic6$) || var11.eql((SubLObject)$ic4$)) {
            module0809.f51686(var9);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51852(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic142$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic142$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic142$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic142$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic142$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            module0035.f2502(var3, (SubLObject)$ic143$);
            final SubLObject var10 = (SubLObject)$ic144$;
            return f51853((SubLObject)ConsesLow.list((SubLObject)$ic119$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var7)), (SubLObject)ConsesLow.listS((SubLObject)$ic71$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var10))), (SubLObject)ConsesLow.list((SubLObject)$ic51$, (SubLObject)ConsesLow.list((SubLObject)$ic102$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic73$, var10))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic49$, var10, (SubLObject)ConsesLow.list((SubLObject)$ic74$, var10)), (SubLObject)ConsesLow.list((SubLObject)$ic49$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var10)))), ConsesLow.append(var9, (SubLObject)NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic142$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51854(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic145$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic145$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic146$);
        final SubLObject var7 = (SubLObject)$ic147$;
        return f51832((SubLObject)ConsesLow.listS((SubLObject)$ic70$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic148$)), ConsesLow.append(var6, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic49$, var4, (SubLObject)ConsesLow.listS((SubLObject)$ic149$, (SubLObject)ConsesLow.list((SubLObject)$ic45$, (SubLObject)$ic150$, var7), (SubLObject)$ic151$))))));
    }
    
    public static SubLObject f51855(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic152$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic152$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic153$);
        final SubLObject var7 = f51822(var4);
        final SubLObject var8 = f51805(var6);
        final SubLObject var9 = (SubLObject)$ic154$;
        return module0814.f52175((SubLObject)ConsesLow.listS((SubLObject)$ic155$, var9, var7, ConsesLow.append(var8, (SubLObject)NIL)));
    }
    
    public static SubLObject f51856(final SubLObject var2) {
        return var2;
    }
    
    public static SubLObject f51857(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic156$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)$ic157$);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic158$, module0035.f2241(var8)), var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return f51839(reader.bq_cons((SubLObject)$ic94$, ConsesLow.append(Sequences.nreverse(var6), (SubLObject)NIL)));
    }
    
    public static SubLObject f51858(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic159$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)$ic160$);
        return f51807(var2);
    }
    
    public static SubLObject f51859(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic161$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic161$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic161$);
        var6 = var7.first();
        var7 = var7.rest();
        final SubLObject var8 = (SubLObject)(var7.isCons() ? var7.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var7, var2, (SubLObject)$ic161$);
        var7 = var7.rest();
        if (NIL != var7) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic161$);
            return (SubLObject)NIL;
        }
        module0035.f2502(var4, (SubLObject)$ic162$);
        module0812.f52013(var5, (SubLObject)$ic8$);
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = var5;
        assert NIL != Types.symbolp(var10) : var10;
        final SubLObject var11 = module0809.$g6433$.currentBinding(var3);
        try {
            module0809.$g6433$.bind(var10, var3);
            module0809.f51679(var5);
            module0809.f51684(var5, (SubLObject)$ic8$);
            final SubLObject var12 = f51788(var6);
            var9 = (SubLObject)ConsesLow.listS((SubLObject)$ic162$, var5, var12, ConsesLow.append((SubLObject)((NIL != var8) ? ConsesLow.list(var8) : NIL), (SubLObject)NIL));
        }
        finally {
            module0809.$g6433$.rebind(var11, var3);
        }
        return var9;
    }
    
    public static SubLObject f51860(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic164$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic164$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic164$);
        var6 = var7.first();
        final SubLObject var8;
        var7 = (var8 = var7.rest());
        module0035.f2502(var4, (SubLObject)$ic165$);
        module0812.f52012(var5, var6);
        SubLObject var223_224;
        final SubLObject var221_222 = var223_224 = var8;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var223_224, var221_222, (SubLObject)$ic166$);
        var9 = var223_224.first();
        SubLObject var10;
        var223_224 = (var10 = var223_224.rest());
        if (!var9.isString()) {
            var9 = (SubLObject)NIL;
            var10 = var8;
        }
        SubLObject var11 = (SubLObject)NIL;
        final SubLObject var12 = var5;
        assert NIL != Types.symbolp(var12) : var12;
        final SubLObject var13 = module0809.$g6432$.currentBinding(var3);
        try {
            module0809.$g6432$.bind(var12, var3);
            module0809.f51682(var5);
            module0809.f51683(var5, var6);
            final SubLObject var14 = f51806(var6);
            final SubLObject var15 = f51861(var5, var10);
            var11 = (SubLObject)ConsesLow.listS((SubLObject)$ic165$, var5, var14, ConsesLow.append((SubLObject)((NIL != var9) ? ConsesLow.list(var9) : NIL), var15, (SubLObject)NIL));
        }
        finally {
            module0809.$g6432$.rebind(var13, var3);
        }
        f51814(var5, var2, var11);
        return var11;
    }
    
    public static SubLObject f51862() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g6443$.getDynamicValue(var1);
    }
    
    public static SubLObject f51861(final SubLObject var220, final SubLObject var23) {
        final SubLThread var221 = SubLProcess.currentSubLThread();
        SubLObject var222 = (SubLObject)NIL;
        final SubLObject var223 = $g6443$.currentBinding(var221);
        try {
            $g6443$.bind(var220, var221);
            var222 = f51863(var23);
            var222 = f51864(var220, var23);
            var222 = f51805(var222);
            var222 = f51865(var222);
        }
        finally {
            $g6443$.rebind(var223, var221);
        }
        return var222;
    }
    
    public static SubLObject f51863(final SubLObject var23) {
        if (NIL == var23) {
            return conses_high.copy_tree((SubLObject)$ic167$);
        }
        final SubLObject var24 = conses_high.last(var23, (SubLObject)UNPROVIDED);
        final SubLObject var25 = var24.first();
        if (var25.isCons()) {
            SubLObject var27;
            final SubLObject var26 = var27 = var25;
            SubLObject var28 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic12$);
            var28 = var27.first();
            final SubLObject var29;
            var27 = (var29 = var27.rest());
            if ($ic168$ == var28) {
                return var23;
            }
        }
        final SubLObject var30 = conses_high.copy_tree((SubLObject)$ic167$);
        ConsesLow.rplacd(var24, var30);
        return var23;
    }
    
    public static SubLObject f51864(final SubLObject var220, SubLObject var23) {
        final SubLThread var221 = SubLProcess.currentSubLThread();
        if (NIL != complex_special_forms.$call_profiling_enabledP$.getDynamicValue(var221)) {
            var23 = reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic169$, (SubLObject)ConsesLow.list((SubLObject)$ic83$, var220)), ConsesLow.append(var23, (SubLObject)NIL));
        }
        return var23;
    }
    
    public static SubLObject f51865(SubLObject var24) {
        if (NIL != f51866(var24)) {
            final SubLObject var25 = (SubLObject)$ic170$;
            var24 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic171$, var25, ConsesLow.append(var24, (SubLObject)NIL)));
        }
        return var24;
    }
    
    public static SubLObject f51866(final SubLObject var23) {
        return module0035.f2439((SubLObject)$ic172$, var23, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51867(final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(var33.isSymbol() && NIL != module0035.f2169(var33, (SubLObject)$ic173$));
    }
    
    public static SubLObject f51868(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic161$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic161$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic161$);
        var6 = var7.first();
        var7 = var7.rest();
        final SubLObject var8 = (SubLObject)(var7.isCons() ? var7.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var7, var2, (SubLObject)$ic161$);
        var7 = var7.rest();
        if (NIL != var7) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic161$);
            return (SubLObject)NIL;
        }
        module0035.f2502(var4, (SubLObject)$ic174$);
        module0812.f52013(var5, (SubLObject)$ic6$);
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = var5;
        assert NIL != Types.symbolp(var10) : var10;
        final SubLObject var11 = module0809.$g6433$.currentBinding(var3);
        try {
            module0809.$g6433$.bind(var10, var3);
            module0809.f51679(var5);
            module0809.f51684(var5, (SubLObject)$ic6$);
            final SubLObject var12 = f51788(var6);
            var9 = (SubLObject)ConsesLow.listS((SubLObject)$ic174$, var5, var12, ConsesLow.append((SubLObject)((NIL != var8) ? ConsesLow.list(var8) : NIL), (SubLObject)NIL));
        }
        finally {
            module0809.$g6433$.rebind(var11, var3);
        }
        return var9;
    }
    
    public static SubLObject f51869(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic175$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic175$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic175$);
        var6 = var7.first();
        final SubLObject var8;
        var7 = (var8 = var7.rest());
        module0035.f2502(var4, (SubLObject)$ic176$);
        SubLObject var241_242;
        final SubLObject var239_240 = var241_242 = var8;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var241_242, var239_240, (SubLObject)$ic166$);
        var9 = var241_242.first();
        SubLObject var10;
        var241_242 = (var10 = var241_242.rest());
        if (!var9.isString()) {
            var9 = (SubLObject)NIL;
            var10 = var8;
        }
        final SubLObject var11 = (SubLObject)$ic177$;
        final SubLObject var12 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic178$, var6, (SubLObject)$ic179$, ConsesLow.append(var10, (SubLObject)NIL)));
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = var5;
        assert NIL != Types.symbolp(var14) : var14;
        final SubLObject var15 = module0809.$g6432$.currentBinding(var3);
        try {
            module0809.$g6432$.bind(var14, var3);
            module0809.f51681(var5);
            module0809.f51683(var5, var6);
            final SubLObject var16 = var11;
            final SubLObject var17 = f51861(var5, var12);
            var13 = (SubLObject)ConsesLow.listS((SubLObject)$ic180$, var5, var16, ConsesLow.append((SubLObject)((NIL != var9) ? ConsesLow.list(var9) : NIL), var17, (SubLObject)NIL));
        }
        finally {
            module0809.$g6432$.rebind(var15, var3);
        }
        f51814(var5, var2, var13);
        return var13;
    }
    
    public static SubLObject f51870(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic161$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic161$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic161$);
        var6 = var7.first();
        var7 = var7.rest();
        final SubLObject var8 = (SubLObject)(var7.isCons() ? var7.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var7, var2, (SubLObject)$ic161$);
        var7 = var7.rest();
        if (NIL != var7) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic161$);
            return (SubLObject)NIL;
        }
        module0035.f2502(var4, (SubLObject)$ic181$);
        module0812.f52013(var5, (SubLObject)$ic4$);
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = var5;
        assert NIL != Types.symbolp(var10) : var10;
        final SubLObject var11 = module0809.$g6433$.currentBinding(var3);
        try {
            module0809.$g6433$.bind(var10, var3);
            module0809.f51679(var5);
            module0809.f51684(var5, (SubLObject)$ic4$);
            final SubLObject var12 = f51788(var6);
            var9 = (SubLObject)ConsesLow.listS((SubLObject)$ic181$, var5, var12, ConsesLow.append((SubLObject)((NIL != var8) ? ConsesLow.list(var8) : NIL), (SubLObject)NIL));
        }
        finally {
            module0809.$g6433$.rebind(var11, var3);
        }
        return var9;
    }
    
    public static SubLObject f51871(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic182$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic182$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic182$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        final SubLObject var8;
        var4 = (var8 = var5);
        module0035.f2502(var3, (SubLObject)$ic183$);
        final SubLObject var9 = complex_special_forms.defstruct_analyze(var6, var7, var8);
        f51872(var9);
        final SubLObject var10 = reader.bq_cons((SubLObject)$ic184$, ConsesLow.append(var9, (SubLObject)NIL));
        final SubLObject var11 = f51793(var2);
        SubLObject var256_257;
        final SubLObject var254_255 = var256_257 = var11;
        SubLObject var3_258 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var256_257, var254_255, (SubLObject)$ic185$);
        var3_258 = var256_257.first();
        final SubLObject var12;
        var256_257 = (var12 = var256_257.rest());
        module0035.f2502(var3_258, (SubLObject)$ic94$);
        final SubLObject var13 = (SubLObject)ConsesLow.listS((SubLObject)$ic94$, var10, ConsesLow.append(var12, (SubLObject)NIL));
        return var13;
    }
    
    public static SubLObject f51872(final SubLObject var252) {
        final SubLObject var253 = cdestructuring_bind.property_list_member((SubLObject)$ic186$, var252);
        final SubLObject var254 = (SubLObject)((NIL != var253) ? conses_high.cadr(var253) : NIL);
        final SubLObject var255 = cdestructuring_bind.property_list_member((SubLObject)$ic187$, var252);
        final SubLObject var256 = (SubLObject)((NIL != var255) ? conses_high.cadr(var255) : NIL);
        final SubLObject var257 = cdestructuring_bind.property_list_member((SubLObject)$ic188$, var252);
        final SubLObject var258 = (SubLObject)((NIL != var257) ? conses_high.cadr(var257) : NIL);
        final SubLObject var259 = cdestructuring_bind.property_list_member((SubLObject)$ic189$, var252);
        final SubLObject var260 = (SubLObject)((NIL != var259) ? conses_high.cadr(var259) : NIL);
        final SubLObject var261 = cdestructuring_bind.property_list_member((SubLObject)$ic190$, var252);
        final SubLObject var262 = (SubLObject)((NIL != var261) ? conses_high.cadr(var261) : NIL);
        final SubLObject var263 = cdestructuring_bind.property_list_member((SubLObject)$ic191$, var252);
        final SubLObject var264 = (SubLObject)((NIL != var263) ? conses_high.cadr(var263) : NIL);
        final SubLObject var265 = cdestructuring_bind.property_list_member((SubLObject)$ic192$, var252);
        final SubLObject var266 = (SubLObject)((NIL != var265) ? conses_high.cadr(var265) : NIL);
        final SubLObject var267 = cdestructuring_bind.property_list_member((SubLObject)$ic193$, var252);
        SubLObject var268 = (SubLObject)((NIL != var267) ? conses_high.cadr(var267) : NIL);
        if (NIL == var268) {
            var268 = (SubLObject)$ic194$;
        }
        f51788((SubLObject)ConsesLow.list((SubLObject)$ic83$, var254));
        f51788((SubLObject)ConsesLow.list((SubLObject)$ic83$, var258));
        f51788((SubLObject)ConsesLow.list((SubLObject)$ic83$, var256));
        f51788((SubLObject)ConsesLow.list((SubLObject)$ic83$, var260));
        f51788((SubLObject)ConsesLow.list((SubLObject)$ic83$, var262));
        f51788((SubLObject)ConsesLow.list((SubLObject)$ic83$, var264));
        f51788((SubLObject)ConsesLow.list((SubLObject)$ic83$, var266));
        f51788((SubLObject)ConsesLow.list((SubLObject)$ic83$, var268));
        SubLObject var269;
        SubLObject var270;
        for (var269 = Numbers.add((SubLObject)TWO_INTEGER, Sequences.length(var260)), var270 = (SubLObject)NIL, var270 = (SubLObject)TWO_INTEGER; !var270.numGE(var269); var270 = module0048.f_1X(var270)) {
            f51788((SubLObject)ConsesLow.list((SubLObject)$ic83$, var270));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51873(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic195$);
        var4 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic195$);
        var5 = var6.first();
        var6 = var6.rest();
        final SubLObject var7 = (SubLObject)(var6.isCons() ? var6.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var2, (SubLObject)$ic195$);
        var6 = var6.rest();
        final SubLObject var8 = (SubLObject)(var6.isCons() ? var6.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var2, (SubLObject)$ic195$);
        var6 = var6.rest();
        if (NIL != var6) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic195$);
            return (SubLObject)NIL;
        }
        module0035.f2502(var4, (SubLObject)$ic196$);
        module0812.f52013(var5, (SubLObject)$ic4$);
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = var5;
        assert NIL != Types.symbolp(var10) : var10;
        final SubLObject var11 = module0809.$g6433$.currentBinding(var3);
        try {
            module0809.$g6433$.bind(var10, var3);
            module0809.f51679(var5);
            module0809.f51684(var5, (SubLObject)$ic4$);
            final SubLObject var12 = f51788(var7);
            var9 = (SubLObject)ConsesLow.listS((SubLObject)$ic196$, var5, var12, ConsesLow.append((SubLObject)((NIL != var8) ? ConsesLow.list(var8) : NIL), (SubLObject)NIL));
        }
        finally {
            module0809.$g6433$.rebind(var11, var3);
        }
        return var9;
    }
    
    public static SubLObject f51819(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic197$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic197$);
        var4 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            module0035.f2502(var3, (SubLObject)$ic35$);
            final SubLObject var6 = f51788(var4);
            return module0814.f52169((SubLObject)ConsesLow.list((SubLObject)$ic35$, var6));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic197$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51874(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic81$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic81$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic81$);
        var5 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            module0035.f2502(var3, (SubLObject)$ic198$);
            module0809.f51689(var5);
            final SubLObject var7 = f51788(var4);
            final SubLObject var8 = f51800(var5);
            f51788((SubLObject)ConsesLow.list((SubLObject)$ic83$, var5));
            return (SubLObject)ConsesLow.list((SubLObject)$ic199$, var7, var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic81$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51875(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var2_288 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic200$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic200$);
        var2_288 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic200$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic201$);
        return f51853((SubLObject)ConsesLow.list((SubLObject)$ic119$, var2_288, (SubLObject)ConsesLow.listS((SubLObject)$ic202$, var4, ConsesLow.append(var6, (SubLObject)NIL))));
    }
    
    public static SubLObject f51876(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic203$);
        var3 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic203$);
        var4 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic203$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic203$);
        var6 = var7.first();
        var7 = var7.rest();
        if (NIL == var7) {
            module0035.f2502(var3, (SubLObject)$ic204$);
            final SubLObject var8 = f51819((SubLObject)ConsesLow.list((SubLObject)$ic35$, var4));
            final SubLObject var9 = f51788(var5);
            final SubLObject var10 = f51788(var6);
            return module0814.f52168((SubLObject)ConsesLow.list((SubLObject)$ic204$, var8, var9, var10));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic203$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51877(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic205$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic205$);
        var4 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            module0035.f2502(var3, (SubLObject)$ic206$);
            return f51788((SubLObject)ConsesLow.list((SubLObject)$ic207$, (SubLObject)ConsesLow.list((SubLObject)$ic83$, var4)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic205$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51878(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic208$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic208$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic208$);
        var5 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            module0035.f2502(var3, (SubLObject)$ic209$);
            return f51876((SubLObject)ConsesLow.list((SubLObject)$ic204$, var4, (SubLObject)NIL, var5));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic208$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51879(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic210$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic210$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic210$);
        var5 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            module0035.f2502(var3, (SubLObject)$ic211$);
            return f51876((SubLObject)ConsesLow.listS((SubLObject)$ic204$, var4, var5, (SubLObject)$ic212$));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic210$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51880(final SubLObject var2) {
        return f51807(var2);
    }
    
    public static SubLObject f51881(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic213$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic213$);
        var4 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            module0035.f2502(var3, (SubLObject)$ic214$);
            final SubLObject var6 = f51788(var4);
            return (SubLObject)ConsesLow.list((SubLObject)$ic214$, var6);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic213$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51882(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var2_309 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic200$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic200$);
        var2_309 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic200$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic215$);
        return f51853((SubLObject)ConsesLow.list((SubLObject)$ic119$, (SubLObject)$ic216$, (SubLObject)ConsesLow.listS((SubLObject)$ic201$, var2_309, var4, ConsesLow.append(var6, (SubLObject)NIL))));
    }
    
    public static SubLObject f51883(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic217$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic217$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic217$);
        var5 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            module0035.f2502(var3, (SubLObject)$ic218$);
            final SubLObject var7 = f51788(var4);
            final SubLObject var8 = f51788(var5);
            return (SubLObject)ConsesLow.list((SubLObject)$ic218$, var7, var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic217$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51884(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic219$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic219$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic220$);
        final SubLObject var7 = (SubLObject)$ic221$;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var6;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            var8 = (SubLObject)ConsesLow.cons(f51885(var7, var10), var8);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return f51832((SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var4)), reader.bq_cons((SubLObject)$ic222$, ConsesLow.append(Sequences.nreverse(var8), (SubLObject)NIL))));
    }
    
    public static SubLObject f51885(final SubLObject var316, final SubLObject var320) {
        SubLObject var321 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var320, var320, (SubLObject)$ic223$);
        var321 = var320.first();
        final SubLObject var323;
        final SubLObject var322 = var323 = var320.rest();
        SubLObject var324 = (SubLObject)NIL;
        if (var321 == $ic224$) {
            var324 = (SubLObject)T;
        }
        else if (var321 == T) {
            Errors.warn((SubLObject)$ic225$, (SubLObject)((NIL != f51862()) ? Sequences.cconcatenate((SubLObject)$ic226$, new SubLObject[] { module0006.f205(f51862()), $ic227$ }) : $ic228$));
            var324 = (SubLObject)T;
        }
        else if (var321.isCons()) {
            SubLObject var325 = (SubLObject)NIL;
            SubLObject var326 = var321;
            SubLObject var327 = (SubLObject)NIL;
            var327 = var326.first();
            while (NIL != var326) {
                var325 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)EQL, var316, module0035.f2241(var327)), var325);
                var326 = var326.rest();
                var327 = var326.first();
            }
            var324 = reader.bq_cons((SubLObject)$ic102$, ConsesLow.append(Sequences.nreverse(var325), (SubLObject)NIL));
        }
        else {
            var324 = (SubLObject)ConsesLow.list((SubLObject)EQL, var316, module0035.f2241(var321));
        }
        return reader.bq_cons(var324, ConsesLow.append(var323, (SubLObject)NIL));
    }
    
    public static SubLObject f51886(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic229$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)$ic222$);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            SubLObject var331_332;
            final SubLObject var329_330 = var331_332 = var8;
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var331_332, var329_330, (SubLObject)$ic230$);
            var9 = var331_332.first();
            final SubLObject var10;
            var331_332 = (var10 = var331_332.rest());
            final SubLObject var11 = f51819((SubLObject)ConsesLow.list((SubLObject)$ic35$, var9));
            final SubLObject var12 = f51805(var10);
            var6 = (SubLObject)ConsesLow.cons(reader.bq_cons(var11, ConsesLow.append(var12, (SubLObject)NIL)), var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return module0814.f52167(reader.bq_cons((SubLObject)$ic222$, ConsesLow.append(Sequences.nreverse(var6), (SubLObject)NIL)));
    }
    
    public static SubLObject f51887(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic231$);
        var3 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic231$);
        var4 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic231$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic231$);
        var6 = var7.first();
        var7 = var7.rest();
        if (NIL == var7) {
            module0035.f2502(var3, (SubLObject)$ic232$);
            return f51886((SubLObject)ConsesLow.list((SubLObject)$ic222$, (SubLObject)ConsesLow.list(var4, var5), (SubLObject)ConsesLow.list((SubLObject)T, var6)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic231$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51888(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic233$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic233$);
        var4 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            module0035.f2502(var3, (SubLObject)$ic158$);
            final SubLObject var6 = Eval.eval(var4);
            SubLObject var7 = (SubLObject)NIL;
            if (var4.isCons()) {
                SubLObject var343_344;
                final SubLObject var341_342 = var343_344 = var6;
                SubLObject var8 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var343_344, var341_342, (SubLObject)$ic234$);
                var8 = var343_344.first();
                final SubLObject var9;
                var343_344 = (var9 = var343_344.rest());
                if ($ic15$ == var8) {
                    SubLObject var348_349;
                    final SubLObject var346_347 = var348_349 = var9;
                    SubLObject var10 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var348_349, var346_347, (SubLObject)$ic235$);
                    var10 = var348_349.first();
                    final SubLObject var11;
                    var348_349 = (var11 = var348_349.rest());
                    if (NIL != module0035.f2169(var10, (SubLObject)$ic236$)) {
                        SubLObject var12 = var11;
                        SubLObject var13 = (SubLObject)NIL;
                        var13 = var12.first();
                        while (NIL != var12) {
                            module0812.f52014(var13, var10);
                            var12 = var12.rest();
                            var13 = var12.first();
                        }
                    }
                }
                else if ($ic13$ == var8) {
                    SubLObject var354_355;
                    final SubLObject var352_353 = var354_355 = var9;
                    SubLObject var10 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var354_355, var352_353, (SubLObject)$ic237$);
                    var10 = var354_355.first();
                    final SubLObject var14;
                    var354_355 = (var14 = var354_355.rest());
                    if (NIL != module0035.f2169(var10, (SubLObject)$ic236$)) {
                        SubLObject var12 = var14;
                        SubLObject var15 = (SubLObject)NIL;
                        var15 = var12.first();
                        while (NIL != var12) {
                            module0812.f52015(var15, var10);
                            var12 = var12.rest();
                            var15 = var12.first();
                        }
                    }
                }
                else if ($ic21$ == var8 || $ic238$ == var8 || $ic239$ == var8) {
                    var7 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic240$, module0035.f2241(var6)), var7);
                }
            }
            return f51839(reader.bq_cons((SubLObject)$ic94$, ConsesLow.append(Sequences.nreverse(var7), (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic233$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51839(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic241$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)$ic94$);
        final SubLObject var6 = f51805(var5);
        return module0814.f52164(reader.bq_cons((SubLObject)$ic94$, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f51853(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic242$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic242$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic119$);
        return f51886((SubLObject)ConsesLow.listS((SubLObject)$ic222$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic51$, var4), ConsesLow.append(var6, (SubLObject)NIL)), (SubLObject)$ic243$));
    }
    
    public static SubLObject f51889(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic242$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic242$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic244$);
        return f51886((SubLObject)ConsesLow.listS((SubLObject)$ic222$, reader.bq_cons(var4, ConsesLow.append(var6, (SubLObject)NIL)), (SubLObject)$ic243$));
    }
    
    public static SubLObject f51890(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic245$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic245$);
        var4 = var5.first();
        var5 = var5.rest();
        if (NIL != var5) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic245$);
            return (SubLObject)NIL;
        }
        module0035.f2502(var3, (SubLObject)$ic83$);
        final SubLObject var6 = module0812.f52007(var4);
        if (var6.eql(var4)) {
            return var2;
        }
        return var6;
    }
    
    public static SubLObject f51891(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic100$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic100$);
        var4 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            module0035.f2502(var3, (SubLObject)$ic168$);
            if (NIL != f51787()) {
                module0812.f52016(f51862());
                f51788((SubLObject)$ic246$);
            }
            final SubLObject var6 = f51788(var4);
            return (SubLObject)ConsesLow.list((SubLObject)$ic168$, var6);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic100$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51892(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic247$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic247$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic248$);
        final SubLObject var7 = f51788(var4);
        final SubLObject var8 = f51821(var6);
        final SubLObject var9 = (SubLObject)$ic249$;
        final SubLObject var10 = (SubLObject)$ic250$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic251$, (SubLObject)ConsesLow.list(var7, var9, var10), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f51893(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic145$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic145$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic252$);
        final SubLObject var7 = (SubLObject)$ic253$;
        final SubLObject var8 = f51821(var6);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic254$, var7, var4, ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f51894(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic241$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)$ic255$);
        return f51826((SubLObject)ConsesLow.listS((SubLObject)$ic52$, (SubLObject)$ic256$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f51895(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic241$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)$ic257$);
        return f51826((SubLObject)ConsesLow.listS((SubLObject)$ic52$, (SubLObject)$ic258$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f51896(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic241$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)$ic259$);
        return f51826((SubLObject)ConsesLow.listS((SubLObject)$ic52$, (SubLObject)$ic260$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f51897(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic261$);
        var4 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic261$);
        var5 = var6.first();
        final SubLObject var7;
        var6 = (var7 = var6.rest());
        module0035.f2502(var4, (SubLObject)$ic90$);
        if (NIL == var5) {
            return f51839(reader.bq_cons((SubLObject)$ic94$, ConsesLow.append(var7, (SubLObject)NIL)));
        }
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = f51821(var7);
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            SubLObject var389_390;
            final SubLObject var387_388 = var389_390 = var11;
            SubLObject var12 = (SubLObject)NIL;
            SubLObject var13 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var389_390, var387_388, (SubLObject)$ic262$);
            var12 = var389_390.first();
            var389_390 = var389_390.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var389_390, var387_388, (SubLObject)$ic262$);
            var13 = var389_390.first();
            var389_390 = var389_390.rest();
            if (NIL == var389_390) {
                module0809.f51687(var12);
                final SubLObject var14 = f51799(var12);
                final SubLObject var15 = f51788(var13);
                var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var14, var15), var8);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var387_388, (SubLObject)$ic262$);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return module0814.f52166((SubLObject)ConsesLow.listS((SubLObject)$ic90$, Sequences.nreverse(var8), ConsesLow.append(var9, (SubLObject)NIL)));
    }
    
    public static SubLObject f51832(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic263$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic263$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic70$);
        if (NIL == var4) {
            return f51839(reader.bq_cons((SubLObject)$ic94$, ConsesLow.append(var6, (SubLObject)NIL)));
        }
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = f51805(var6);
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            SubLObject var397_398;
            final SubLObject var395_396 = var397_398 = var10;
            SubLObject var11 = (SubLObject)NIL;
            SubLObject var12 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var397_398, var395_396, (SubLObject)$ic262$);
            var11 = var397_398.first();
            var397_398 = var397_398.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var397_398, var395_396, (SubLObject)$ic262$);
            var12 = var397_398.first();
            var397_398 = var397_398.rest();
            if (NIL == var397_398) {
                final SubLObject var13 = f51799(var11);
                final SubLObject var14 = f51788(var12);
                var7 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var13, var14), var7);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var395_396, (SubLObject)$ic262$);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        return module0814.f52165((SubLObject)ConsesLow.listS((SubLObject)$ic70$, Sequences.nreverse(var7), ConsesLow.append(var8, (SubLObject)NIL)));
    }
    
    public static SubLObject f51898(final SubLObject var2) {
        return var2;
    }
    
    public static SubLObject f51899(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic264$);
        var3 = var2.first();
        SubLObject var8 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)$ic264$);
        var4 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)$ic264$);
        var5 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)$ic264$);
        var6 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)$ic264$);
        var7 = var8.first();
        var8 = var8.rest();
        if (NIL != var8) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic264$);
            return (SubLObject)NIL;
        }
        module0035.f2502(var3, (SubLObject)$ic265$);
        if (NIL != var4 && !areAssertionsDisabledFor(me) && NIL == Types.integerp(var4)) {
            throw new AssertionError(var4);
        }
        assert NIL != Types.integerp(var5) : var5;
        assert NIL != Types.symbolp(var6) : var6;
        assert NIL != Types.symbolp(var7) : var7;
        final SubLObject var9 = f51799(var6);
        return (SubLObject)ConsesLow.list((SubLObject)$ic265$, var4, var5, var9, var7);
    }
    
    public static SubLObject f51900(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic267$);
        var3 = var2.first();
        SubLObject var8 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)$ic267$);
        var4 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)$ic267$);
        var5 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)$ic267$);
        var6 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)$ic267$);
        var7 = var8.first();
        var8 = var8.rest();
        if (NIL != var8) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic267$);
            return (SubLObject)NIL;
        }
        module0035.f2502(var3, (SubLObject)$ic268$);
        assert NIL != Types.symbolp(var6) : var6;
        assert NIL != Types.symbolp(var7) : var7;
        final SubLObject var9 = f51788(var4);
        return (SubLObject)ConsesLow.list((SubLObject)$ic268$, var9, var5, var6, var7);
    }
    
    public static SubLObject f51901(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic269$);
        var3 = var2.first();
        SubLObject var8 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)$ic269$);
        var4 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)$ic269$);
        var5 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)$ic269$);
        var6 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)$ic269$);
        var7 = var8.first();
        var8 = var8.rest();
        if (NIL != var8) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic269$);
            return (SubLObject)NIL;
        }
        module0035.f2502(var3, (SubLObject)$ic270$);
        if (NIL != var5 && !areAssertionsDisabledFor(me) && NIL == Types.integerp(var5)) {
            throw new AssertionError(var5);
        }
        assert NIL != Types.symbolp(var6) : var6;
        assert NIL != Types.symbolp(var7) : var7;
        final SubLObject var9 = f51788(var4);
        final SubLObject var10 = f51799(var6);
        return (SubLObject)ConsesLow.list((SubLObject)$ic270$, var9, var5, var10, var7);
    }
    
    public static SubLObject f51902(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic271$);
        var3 = var2.first();
        SubLObject var9 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var2, (SubLObject)$ic271$);
        var4 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var2, (SubLObject)$ic271$);
        var5 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var2, (SubLObject)$ic271$);
        var6 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var2, (SubLObject)$ic271$);
        var7 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var2, (SubLObject)$ic271$);
        var8 = var9.first();
        var9 = var9.rest();
        if (NIL != var9) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic271$);
            return (SubLObject)NIL;
        }
        module0035.f2502(var3, (SubLObject)$ic272$);
        assert NIL != Types.symbolp(var7) : var7;
        assert NIL != Types.symbolp(var8) : var8;
        final SubLObject var10 = f51788(var4);
        final SubLObject var11 = f51788(var6);
        return (SubLObject)ConsesLow.list((SubLObject)$ic272$, var10, var5, var11, var7, var8);
    }
    
    public static SubLObject f51903(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic273$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic273$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic273$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic273$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)$ic273$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            module0035.f2502(var3, (SubLObject)$ic53$);
            final SubLObject var10 = f51805(var6);
            final SubLObject var11 = f51788(var7);
            final SubLObject var12 = f51805(var8);
            final SubLObject var13 = f51805(var9);
            return module0814.f52177((SubLObject)ConsesLow.listS((SubLObject)$ic53$, (SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)$ic35$, var11), var12), ConsesLow.append(var13, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic273$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51834(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic274$);
        var4 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic274$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic274$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic274$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic274$);
        var9 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var10;
            var5 = (var10 = var6);
            module0035.f2502(var4, (SubLObject)$ic71$);
            var3.resetMultipleValues();
            final SubLObject var11 = f51904(var7);
            final SubLObject var12 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            return f51826((SubLObject)ConsesLow.list((SubLObject)$ic52$, var11, (SubLObject)ConsesLow.listS((SubLObject)$ic53$, (SubLObject)ConsesLow.list(var12, var8, var9), ConsesLow.append(var10, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic274$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51904(final SubLObject var133) {
        SubLObject var134 = (SubLObject)NIL;
        SubLObject var135 = (SubLObject)NIL;
        SubLObject var136 = var133;
        SubLObject var137 = (SubLObject)NIL;
        var137 = var136.first();
        while (NIL != var136) {
            SubLObject var139;
            final SubLObject var138 = var139 = var137;
            SubLObject var140 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var139, var138, (SubLObject)$ic275$);
            var140 = var139.first();
            var139 = var139.rest();
            final SubLObject var141 = (SubLObject)(var139.isCons() ? var139.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var139, var138, (SubLObject)$ic275$);
            var139 = var139.rest();
            if (NIL == var139) {
                var134 = (SubLObject)ConsesLow.cons(var140, var134);
                var135 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic49$, var140, var141), var135);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var138, (SubLObject)$ic275$);
            }
            var136 = var136.rest();
            var137 = var136.first();
        }
        return Values.values(Sequences.nreverse(var134), Sequences.nreverse(var135));
    }
    
    public static SubLObject f51905(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic276$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic276$);
        var4 = var5.first();
        var5 = var5.rest();
        if (NIL != var5) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic276$);
            return (SubLObject)NIL;
        }
        module0035.f2502(var3, (SubLObject)$ic277$);
        if (NIL != f51862()) {
            return f51848((SubLObject)ConsesLow.list((SubLObject)$ic49$, (SubLObject)$ic278$, (SubLObject)ConsesLow.list((SubLObject)$ic279$, (SubLObject)ConsesLow.list((SubLObject)$ic83$, var4))));
        }
        return var2;
    }
    
    public static SubLObject f51906(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic280$);
        var4 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)$ic280$);
        var5 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            module0035.f2502(var4, (SubLObject)$ic99$);
            final SubLObject var7 = f51788(var5);
            return (SubLObject)ConsesLow.list((SubLObject)$ic99$, var7);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic280$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51907(final SubLObject var2) {
        return var2;
    }
    
    public static SubLObject f51908(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic281$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic281$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic282$);
        final SubLObject var7 = (SubLObject)ConsesLow.list((SubLObject)$ic51$, var4);
        return f51909((SubLObject)ConsesLow.listS((SubLObject)$ic283$, var7, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f51909(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)$ic281$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)$ic281$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)$ic283$);
        final SubLObject var7 = f51788(var4);
        final SubLObject var8 = f51805(var6);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic283$, (SubLObject)ConsesLow.list((SubLObject)$ic35$, var7), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f51910(final SubLObject var33) {
        return (SubLObject)makeBoolean(var33.isSymbol() && NIL != module0035.sublisp_boolean(module0035.f2294($g6444$.getGlobalValue(), var33, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f51911(final SubLObject var22) {
        return module0035.f2294($g6444$.getGlobalValue(), var22, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51790(SubLObject var2) {
        if (NIL != f51910(var2)) {
            var2 = f51911(var2);
        }
        else if (var2.isCons()) {
            SubLObject var4;
            final SubLObject var3 = var4 = var2;
            SubLObject var5 = (SubLObject)NIL;
            SubLObject var6 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic284$);
            var5 = var4.first();
            var4 = (var6 = var4.rest());
            if (NIL != f51910(var5)) {
                var5 = f51911(var5);
                var2 = reader.bq_cons(var5, ConsesLow.append(var6, (SubLObject)NIL));
            }
        }
        return var2;
    }
    
    public static SubLObject f51912(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic285$);
        var441 = var440.first();
        final SubLObject var442;
        var440 = (var442 = var440.rest());
        if (NIL == var441) {
            return reader.bq_cons((SubLObject)$ic94$, ConsesLow.append(var442, (SubLObject)NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic52$, var441, ConsesLow.append(var442, (SubLObject)NIL));
    }
    
    public static SubLObject f51913(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic286$);
        var441 = var440.first();
        final SubLObject var442;
        var440 = (var442 = var440.rest());
        if (NIL == var441) {
            return reader.bq_cons((SubLObject)$ic94$, ConsesLow.append(var442, (SubLObject)NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic52$, var441, ConsesLow.append(var442, (SubLObject)NIL));
    }
    
    public static SubLObject f51914(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)NIL;
        SubLObject var442 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic287$);
        var441 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic287$);
        var442 = var440.first();
        var440 = var440.rest();
        if (NIL == var440) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic49$, var441, var442);
        }
        cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)$ic287$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51915(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)NIL;
        SubLObject var442 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic287$);
        var441 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic287$);
        var442 = var440.first();
        var440 = var440.rest();
        if (NIL == var440) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic49$, var441, var442);
        }
        cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)$ic287$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51916(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)NIL;
        SubLObject var442 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic287$);
        var441 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic287$);
        var442 = var440.first();
        var440 = var440.rest();
        if (NIL == var440) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic49$, var441, var442);
        }
        cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)$ic287$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51917(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic288$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)NIL;
        SubLObject var443 = (SubLObject)NIL;
        SubLObject var444 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic288$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic288$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic288$);
        var444 = var440.first();
        var440 = var440.rest();
        if (NIL == var440) {
            final SubLObject var445;
            var440 = (var445 = var441);
            return (SubLObject)ConsesLow.list((SubLObject)$ic52$, var442, (SubLObject)ConsesLow.listS((SubLObject)$ic283$, (SubLObject)ConsesLow.list((SubLObject)$ic51$, var443), ConsesLow.append(var445, var444, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)$ic288$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51918(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic289$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)NIL;
        SubLObject var443 = (SubLObject)NIL;
        SubLObject var444 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic289$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic289$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic289$);
        var444 = var440.first();
        var440 = var440.rest();
        if (NIL == var440) {
            final SubLObject var445;
            var440 = (var445 = var441);
            return reader.bq_cons((SubLObject)$ic94$, ConsesLow.append(var442, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic283$, (SubLObject)ConsesLow.list((SubLObject)$ic51$, var443), ConsesLow.append(var445, var444, (SubLObject)NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)$ic289$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51919(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic290$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)NIL;
        SubLObject var443 = (SubLObject)NIL;
        SubLObject var444 = (SubLObject)NIL;
        SubLObject var445 = (SubLObject)NIL;
        SubLObject var446 = (SubLObject)NIL;
        SubLObject var447 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic290$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic290$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic290$);
        var444 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic290$);
        var445 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic290$);
        var446 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic290$);
        var447 = var440.first();
        var440 = var440.rest();
        if (NIL != var440) {
            cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)$ic290$);
            return (SubLObject)NIL;
        }
        final SubLObject var448;
        var440 = (var448 = var441);
        assert NIL != Types.symbolp(var446) : var446;
        assert NIL != Types.symbolp(var447) : var447;
        return (SubLObject)ConsesLow.list((SubLObject)$ic52$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var445, var444)), (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)ConsesLow.list(var442, var443, var445), ConsesLow.append(var448, (SubLObject)NIL)));
    }
    
    public static SubLObject f51920(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic291$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)NIL;
        SubLObject var443 = (SubLObject)NIL;
        SubLObject var444 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic291$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic291$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic291$);
        var444 = var440.first();
        var440 = var440.rest();
        if (NIL != var440) {
            cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)$ic291$);
            return (SubLObject)NIL;
        }
        final SubLObject var445;
        var440 = (var445 = var441);
        assert NIL != Types.symbolp(var444) : var444;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic39$, var442, var443, ConsesLow.append(var445, (SubLObject)NIL));
    }
    
    public static SubLObject f51921(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)NIL;
        SubLObject var442 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic292$);
        var441 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic292$);
        var442 = var440.first();
        final SubLObject var443;
        var440 = (var443 = var440.rest());
        assert NIL != Types.symbolp(var441) : var441;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic153$, var442, ConsesLow.append(var443, (SubLObject)NIL));
    }
    
    public static SubLObject f51922(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic293$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)NIL;
        SubLObject var443 = (SubLObject)NIL;
        SubLObject var444 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic293$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic293$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic293$);
        var444 = var440.first();
        var440 = var440.rest();
        if (NIL != var440) {
            cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)$ic293$);
            return (SubLObject)NIL;
        }
        final SubLObject var445;
        var440 = (var445 = var441);
        assert NIL != Types.symbolp(var444) : var444;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic108$, var442, var443, ConsesLow.append(var445, (SubLObject)NIL));
    }
    
    public static SubLObject f51923(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic294$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)NIL;
        SubLObject var443 = (SubLObject)NIL;
        SubLObject var444 = (SubLObject)NIL;
        SubLObject var445 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic294$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic294$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic294$);
        var444 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic294$);
        var445 = var440.first();
        var440 = var440.rest();
        if (NIL != var440) {
            cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)$ic294$);
            return (SubLObject)NIL;
        }
        final SubLObject var446;
        var440 = (var446 = var441);
        assert NIL != Types.symbolp(var444) : var444;
        assert NIL != Types.symbolp(var445) : var445;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic57$, (SubLObject)ConsesLow.list(var442, var443), ConsesLow.append(var446, (SubLObject)NIL));
    }
    
    public static SubLObject f51924(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic295$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)NIL;
        SubLObject var443 = (SubLObject)NIL;
        SubLObject var444 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic295$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic295$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic295$);
        var444 = var440.first();
        var440 = var440.rest();
        if (NIL != var440) {
            cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)$ic295$);
            return (SubLObject)NIL;
        }
        final SubLObject var445;
        var440 = (var445 = var441);
        assert NIL != Types.symbolp(var443) : var443;
        assert NIL != Types.symbolp(var444) : var444;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic248$, var442, ConsesLow.append(var445, (SubLObject)NIL));
    }
    
    public static SubLObject f51925(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)NIL;
        SubLObject var442 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic296$);
        var441 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic296$);
        var442 = var440.first();
        final SubLObject var443;
        var440 = (var443 = var440.rest());
        assert NIL != Types.symbolp(var441) : var441;
        assert NIL != Types.symbolp(var442) : var442;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic252$, var442, ConsesLow.append(var443, (SubLObject)NIL));
    }
    
    public static SubLObject f51926(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)$ic297$);
        var441 = var440.first();
        final SubLObject var442;
        var440 = (var442 = var440.rest());
        assert NIL != Types.symbolp(var441) : var441;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic52$, (SubLObject)ConsesLow.list(reader.bq_cons(var441, (SubLObject)$ic298$)), ConsesLow.append(var442, (SubLObject)NIL));
    }
    
    public static SubLObject f51927() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51787", "S#56536", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51788", "S#56537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51795", "S#56538", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51789", "S#56539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51796", "S#56540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51798", "S#56541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51797", "S#56542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51799", "S#56543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51792", "S#56544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51793", "S#56545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51794", "S#56546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51800", "S#56547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51801", "S#56548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51802", "S#56549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51803", "S#56056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51804", "S#56055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51805", "S#56550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51806", "S#56551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51807", "S#56552", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51808", "S#56040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51809", "S#56553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51810", "S#56554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51811", "S#56555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51812", "S#56556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51813", "S#56557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51814", "S#56558", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51816", "S#56559", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51815", "S#56560", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51817", "S#56561", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51791", "S#56562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51818", "S#56563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51820", "S#56564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51821", "S#56565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51822", "S#56566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51823", "S#56567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51825", "S#56568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51827", "S#56569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51828", "S#56570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51829", "S#56571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51830", "S#56572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51831", "S#56573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51833", "S#56574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51835", "S#56575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51836", "S#56576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51826", "S#56577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51837", "S#56578", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51838", "S#56579", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51840", "S#56580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51841", "S#56581", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51842", "S#56582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51843", "S#56583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51844", "S#56584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51845", "S#56585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51846", "S#56586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51847", "S#56587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51824", "S#56588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51849", "S#56589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51848", "S#56590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51851", "S#56591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51850", "S#56592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51852", "S#56593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51854", "S#56594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51855", "S#56595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51856", "S#56596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51857", "S#56597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51858", "S#56598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51859", "S#56599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51860", "S#56600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51862", "S#56601", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51861", "S#56602", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51863", "S#56603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51864", "S#56604", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51865", "S#56605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51866", "S#56606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51867", "S#56607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51868", "S#56608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51869", "S#56609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51870", "S#56610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51871", "S#56611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51872", "S#56612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51873", "S#56613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51819", "S#56614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51874", "S#56615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51875", "S#56616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51876", "S#56617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51877", "S#56618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51878", "S#56619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51879", "S#56620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51880", "S#56621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51881", "S#56622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51882", "S#56623", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51883", "S#56624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51884", "S#56625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51885", "S#56626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51886", "S#56627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51887", "S#56628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51888", "S#56629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51839", "S#56630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51853", "S#56631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51889", "S#56632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51890", "S#56633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51891", "S#56634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51892", "S#56635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51893", "S#56636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51894", "S#56637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51895", "S#56638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51896", "S#56639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51897", "S#56640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51832", "S#56641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51898", "S#56642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51899", "S#56643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51900", "S#56644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51901", "S#56645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51902", "S#56646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51903", "S#56647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51834", "S#56648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51904", "S#56649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51905", "S#56650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51906", "S#56651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51907", "S#56652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51908", "S#56653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51909", "S#56654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51910", "S#56655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51911", "S#56656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0811", "f51790", "S#56657", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51912", "S#56658");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51913", "S#56659");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51914", "S#56660");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51915", "S#56661");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51916", "S#56662");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51917", "S#1538");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51918", "S#56663");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51919", "S#56664");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51920", "S#56665");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51921", "S#56666");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51922", "S#56667");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51923", "S#56668");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51924", "S#56669");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51925", "S#56670");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0811", "f51926", "S#56671");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51928() {
        $g6440$ = SubLFiles.defparameter("S#56672", (SubLObject)NIL);
        $g6441$ = SubLFiles.defvar("S#56673", (SubLObject)NIL);
        $g6442$ = SubLFiles.deflexical("S#56674", (SubLObject)$ic32$);
        $g6443$ = SubLFiles.defparameter("S#56675", (SubLObject)NIL);
        $g6444$ = SubLFiles.deflexical("S#56676", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51929() {
        module0012.f419((SubLObject)$ic172$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f51927();
    }
    
    public void initializeVariables() {
        f51928();
    }
    
    public void runTopLevelForms() {
        f51929();
    }
    
    static {
        me = (SubLFile)new module0811();
        $g6440$ = null;
        $g6441$ = null;
        $g6442$ = null;
        $g6443$ = null;
        $g6444$ = null;
        $ic0$ = makeKeyword("SL2C");
        $ic1$ = makeString("unexpected form : ~S");
        $ic2$ = makeKeyword("UNSPECIFIED");
        $ic3$ = makeKeyword("LOCAL");
        $ic4$ = makeKeyword("DYNAMIC");
        $ic5$ = makeSymbol("S#56677", "CYC");
        $ic6$ = makeKeyword("LEXICAL");
        $ic7$ = makeSymbol("S#56678", "CYC");
        $ic8$ = makeKeyword("CONSTANT");
        $ic9$ = makeString("Unexpected binding type ~S for variable ~S");
        $ic10$ = makeString("time to implement ~S");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#31", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic13$ = makeSymbol("VACCESS");
        $ic14$ = makeSymbol("PROTECTED");
        $ic15$ = makeSymbol("FACCESS");
        $ic16$ = makeSymbol("PRIVATE");
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#33", "CYC"), (SubLObject)makeSymbol("S#56679", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("PROGN"));
        $ic19$ = ConsesLow.list((SubLObject)makeKeyword("DYNAMIC"), (SubLObject)makeKeyword("LEXICAL"), (SubLObject)makeKeyword("CONSTANT"));
        $ic20$ = makeKeyword("BINDING-TYPE");
        $ic21$ = makeSymbol("OPTIMIZE-FUNCALL");
        $ic22$ = makeInteger(50);
        $ic23$ = makeString("Method ~S undergoes a ~Sx expansion when translated");
        $ic24$ = makeSymbol(">");
        $ic25$ = makeSymbol("SECOND");
        $ic26$ = makeString("~%Total forms :           ~S");
        $ic27$ = makeString("~%Mean form size :        ~S");
        $ic28$ = makeString("~%Mean expansion factor : ~Sx");
        $ic29$ = makeString("~%Largest expansions :");
        $ic30$ = ConsesLow.list((SubLObject)makeSymbol("METHOD"), (SubLObject)makeSymbol("S#56680", "CYC"));
        $ic31$ = makeString("~%~4,' Dx  ~S");
        $ic32$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)makeSymbol("CAND"), (SubLObject)makeSymbol("S#56563", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CCATCH"), (SubLObject)makeSymbol("S#56564", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CDEC"), (SubLObject)makeSymbol("S#56567", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CDO"), (SubLObject)makeSymbol("S#56568", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CDO-ALL-SYMBOLS"), (SubLObject)makeSymbol("S#56681", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CDO-EXTERNAL-SYMBOLS"), (SubLObject)makeSymbol("S#56682", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#56668", "CYC"), (SubLObject)makeSymbol("S#56569", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CDO-SYMBOLS"), (SubLObject)makeSymbol("S#56570", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#56664", "CYC"), (SubLObject)makeSymbol("S#56571", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CDOHASH"), (SubLObject)makeSymbol("S#56572", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CDOLIST"), (SubLObject)makeSymbol("S#56573", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CDOTIMES"), (SubLObject)makeSymbol("S#56574", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CHECK-TYPE"), (SubLObject)makeSymbol("S#56575", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CINC"), (SubLObject)makeSymbol("S#56576", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CLET"), (SubLObject)makeSymbol("S#56577", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)makeSymbol("S#56580", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CNOT"), (SubLObject)makeSymbol("S#56582", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("COR"), (SubLObject)makeSymbol("S#56583", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CPOP"), (SubLObject)makeSymbol("S#56584", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CPROGV"), (SubLObject)makeSymbol("S#56585", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CPUSH"), (SubLObject)makeSymbol("S#56586", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CPUSHNEW"), (SubLObject)makeSymbol("S#56587", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CSETF"), (SubLObject)makeSymbol("S#56588", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#56590", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CSOME"), (SubLObject)makeSymbol("S#56593", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CTIME"), (SubLObject)makeSymbol("S#56594", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CUNWIND-PROTECT"), (SubLObject)makeSymbol("S#56595", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("CVS-ID"), (SubLObject)makeSymbol("S#56596", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("DECLAIM"), (SubLObject)makeSymbol("S#56597", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("DECLARE"), (SubLObject)makeSymbol("S#56598", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("DEFCONSTANT"), (SubLObject)makeSymbol("S#56599", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("DEFINE"), (SubLObject)makeSymbol("S#56600", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("DEFLEXICAL"), (SubLObject)makeSymbol("S#56608", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("DEFMACRO"), (SubLObject)makeSymbol("S#56609", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("DEFPARAMETER"), (SubLObject)makeSymbol("S#56610", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("DEFSTRUCT"), (SubLObject)makeSymbol("S#56611", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("DEFVAR"), (SubLObject)makeSymbol("S#56613", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#56683", "CYC"), (SubLObject)makeSymbol("S#56614", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("ENFORCE-TYPE"), (SubLObject)makeSymbol("S#56615", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("ENFORCE-MUST"), (SubLObject)makeSymbol("S#56616", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("FIF"), (SubLObject)makeSymbol("S#56617", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#56618", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("FUNLESS"), (SubLObject)makeSymbol("S#56619", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("FWHEN"), (SubLObject)makeSymbol("S#56620", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("IGNORE"), (SubLObject)makeSymbol("S#56621", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("MULTIPLE-VALUE-LIST"), (SubLObject)makeSymbol("S#56622", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("MUST"), (SubLObject)makeSymbol("S#56623", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("NTH-VALUE"), (SubLObject)makeSymbol("S#56624", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("PCASE"), (SubLObject)makeSymbol("S#56625", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("PCOND"), (SubLObject)makeSymbol("S#56627", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("PIF"), (SubLObject)makeSymbol("S#56628", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("PROCLAIM"), (SubLObject)makeSymbol("S#56629", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("PROGN"), (SubLObject)makeSymbol("S#56630", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("PUNLESS"), (SubLObject)makeSymbol("S#56631", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("PWHEN"), (SubLObject)makeSymbol("S#56632", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#56633", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("RET"), (SubLObject)makeSymbol("S#56634", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("WITH-ERROR-HANDLER"), (SubLObject)makeSymbol("S#56635", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("WITH-PROCESS-RESOURCE-TRACKING"), (SubLObject)makeSymbol("S#56636", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("WITH-STATIC-AREA"), (SubLObject)makeSymbol("S#56637", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("WITH-THREAD-PRIVATE-AREA"), (SubLObject)makeSymbol("S#56638", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("WITH-WORKING-AREA"), (SubLObject)makeSymbol("S#56639", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("VOLATILE"), (SubLObject)makeSymbol("S#56684", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#56658", "CYC"), (SubLObject)makeSymbol("S#56640", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#56659", "CYC"), (SubLObject)makeSymbol("S#56641", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#51", "CYC"), (SubLObject)makeSymbol("S#56642", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#56660", "CYC"), (SubLObject)makeSymbol("S#56685", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#56661", "CYC"), (SubLObject)makeSymbol("S#56686", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#56662", "CYC"), (SubLObject)makeSymbol("S#56687", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP"), (SubLObject)makeSymbol("S#56643", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP"), (SubLObject)makeSymbol("S#56644", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP"), (SubLObject)makeSymbol("S#56645", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP"), (SubLObject)makeSymbol("S#56646", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#56663", "CYC"), (SubLObject)makeSymbol("S#56647", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#1538", "CYC"), (SubLObject)makeSymbol("S#56648", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("IN-PACKAGE"), (SubLObject)makeSymbol("S#56650", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#56688", "CYC"), (SubLObject)makeSymbol("S#56651", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("S#56689", "CYC"), (SubLObject)makeSymbol("S#56652", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("UNTIL"), (SubLObject)makeSymbol("S#56653", "CYC")), ConsesLow.cons((SubLObject)makeSymbol("WHILE"), (SubLObject)makeSymbol("S#56654", "CYC")) });
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#56690", "CYC"));
        $ic34$ = makeSymbol("CAND");
        $ic35$ = makeSymbol("S#56683", "CYC");
        $ic36$ = makeSymbol("S#56691", "CYC");
        $ic37$ = makeSymbol("S#56692", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#150", "CYC"), (SubLObject)makeSymbol("S#768", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic39$ = makeSymbol("CCATCH");
        $ic40$ = makeUninternedSymbol("US#4A777B9");
        $ic41$ = makeSymbol("S#56665", "CYC");
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#169", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#126", "CYC"), (SubLObject)ONE_INTEGER));
        $ic43$ = makeSymbol("CDEC");
        $ic44$ = makeSymbol("CSETF");
        $ic45$ = makeSymbol("-");
        $ic46$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#4", "CYC"), (SubLObject)makeSymbol("S#9958", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic47$ = makeSymbol("CDO");
        $ic48$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#33", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56693", "CYC"), (SubLObject)NIL, (SubLObject)makeSymbol("S#56694", "CYC")));
        $ic49$ = makeSymbol("CSETQ");
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#3267", "CYC"));
        $ic51$ = makeSymbol("CNOT");
        $ic52$ = makeSymbol("CLET");
        $ic53$ = makeSymbol("S#56663", "CYC");
        $ic54$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56695", "CYC"), (SubLObject)makeSymbol("PACKAGE"), (SubLObject)makeSymbol("S#5090", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic55$ = makeSymbol("S#56668", "CYC");
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56695", "CYC"), (SubLObject)makeSymbol("PACKAGE")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic57$ = makeSymbol("CDO-SYMBOLS");
        $ic58$ = makeUninternedSymbol("US#7BBB86A");
        $ic59$ = makeUninternedSymbol("US#679697F");
        $ic60$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#704", "CYC"), (SubLObject)makeSymbol("S#705", "CYC"), (SubLObject)makeSymbol("S#5090", "CYC"), (SubLObject)makeSymbol("S#8600", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic61$ = makeSymbol("S#56664", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#704", "CYC"), (SubLObject)makeSymbol("S#705", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic63$ = makeSymbol("CDOHASH");
        $ic64$ = makeUninternedSymbol("US#283FEB8");
        $ic65$ = makeUninternedSymbol("US#1A45F57");
        $ic66$ = makeUninternedSymbol("US#4AFC22F");
        $ic67$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#140", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic68$ = makeSymbol("CDOLIST");
        $ic69$ = makeUninternedSymbol("US#409EFB7");
        $ic70$ = makeSymbol("S#56659", "CYC");
        $ic71$ = makeSymbol("S#1538", "CYC");
        $ic72$ = makeSymbol("FIRST");
        $ic73$ = makeSymbol("NULL");
        $ic74$ = makeSymbol("REST");
        $ic75$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("INTEGER")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic76$ = makeSymbol("CDOTIMES");
        $ic77$ = makeUninternedSymbol("US#6145DFB");
        $ic78$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic79$ = makeSymbol("<");
        $ic80$ = makeSymbol("CINC");
        $ic81$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic82$ = makeSymbol("CHECK-TYPE");
        $ic83$ = makeSymbol("QUOTE");
        $ic84$ = makeSymbol("S#56696", "CYC");
        $ic85$ = makeSymbol("+");
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic87$ = ConsesLow.list((SubLObject)makeSymbol("S#56697", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#9956", "CYC"));
        $ic88$ = makeKeyword("UNSET");
        $ic89$ = ConsesLow.list((SubLObject)makeSymbol("S#29740", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#56698", "CYC"));
        $ic90$ = makeSymbol("S#56658", "CYC");
        $ic91$ = makeString("CLET of lexical variable ~S being converted to CUNWIND-PROTECT CSETQ idiom");
        $ic92$ = makeString("CLET of constant ~S is not allowed");
        $ic93$ = makeString("Unexpected variable ~S");
        $ic94$ = makeSymbol("PROGN");
        $ic95$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#4", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic96$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic97$ = ConsesLow.list((SubLObject)makeSymbol("S#56689", "CYC"));
        $ic98$ = ConsesLow.list((SubLObject)makeSymbol("S#56699", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#56700", "CYC"));
        $ic99$ = makeSymbol("S#56688", "CYC");
        $ic100$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#63", "CYC"));
        $ic101$ = makeSymbol("S#56701", "CYC");
        $ic102$ = makeSymbol("COR");
        $ic103$ = makeSymbol("S#56702", "CYC");
        $ic104$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#169", "CYC"));
        $ic105$ = makeSymbol("CPOP");
        $ic106$ = makeSymbol("CDR");
        $ic107$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#56703", "CYC"), (SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic108$ = makeSymbol("CPROGV");
        $ic109$ = makeUninternedSymbol("US#4F6F106");
        $ic110$ = makeSymbol("S#56667", "CYC");
        $ic111$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#143", "CYC"), (SubLObject)makeSymbol("S#169", "CYC"));
        $ic112$ = makeSymbol("CPUSH");
        $ic113$ = makeSymbol("CONS");
        $ic114$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#143", "CYC"), (SubLObject)makeSymbol("S#169", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQL))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)IDENTITY))));
        $ic115$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQL);
        $ic116$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)IDENTITY);
        $ic117$ = makeSymbol("CPUSHNEW");
        $ic118$ = makeUninternedSymbol("US#367CE0C");
        $ic119$ = makeSymbol("PUNLESS");
        $ic120$ = makeSymbol("MEMBER");
        $ic121$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#169", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic122$ = makeSymbol("CAR");
        $ic123$ = makeSymbol("RPLACA");
        $ic124$ = makeSymbol("RPLACD");
        $ic125$ = makeSymbol("NTH");
        $ic126$ = makeSymbol("SET-NTH");
        $ic127$ = makeSymbol("GETHASH");
        $ic128$ = makeSymbol("SETHASH");
        $ic129$ = makeSymbol("GETHASH-WITHOUT-VALUES");
        $ic130$ = makeSymbol("CHAR");
        $ic131$ = makeSymbol("SET-CHAR");
        $ic132$ = makeSymbol("AREF");
        $ic133$ = makeSymbol("SET-AREF");
        $ic134$ = makeSymbol("GET");
        $ic135$ = makeSymbol("PUT");
        $ic136$ = makeSymbol("SYMBOL-VALUE");
        $ic137$ = makeSymbol("SET");
        $ic138$ = ConsesLow.list((SubLObject)makeSymbol("S#56704", "CYC"), (SubLObject)makeSymbol("S#63", "CYC"));
        $ic139$ = makeSymbol("SETTER-FROM-ACCESSOR", "SUBLISP");
        $ic140$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#56705", "CYC"));
        $ic141$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#56706", "CYC"));
        $ic142$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#140", "CYC"), (SubLObject)makeSymbol("S#703", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic143$ = makeSymbol("CSOME");
        $ic144$ = makeUninternedSymbol("US#D63C46");
        $ic145$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic146$ = makeSymbol("CTIME");
        $ic147$ = makeUninternedSymbol("US#3132606");
        $ic148$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("GET-INTERNAL-REAL-TIME")));
        $ic149$ = makeSymbol("/");
        $ic150$ = ConsesLow.list((SubLObject)makeSymbol("GET-INTERNAL-REAL-TIME"));
        $ic151$ = ConsesLow.list((SubLObject)makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"));
        $ic152$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#152", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic153$ = makeSymbol("CUNWIND-PROTECT");
        $ic154$ = makeUninternedSymbol("US#28DC13D");
        $ic155$ = makeSymbol("S#56666", "CYC");
        $ic156$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#56707", "CYC"));
        $ic157$ = makeSymbol("DECLAIM");
        $ic158$ = makeSymbol("PROCLAIM");
        $ic159$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#757", "CYC"));
        $ic160$ = makeSymbol("DECLARE");
        $ic161$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("S#33", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("DOCUMENTATION"));
        $ic162$ = makeSymbol("DEFCONSTANT");
        $ic163$ = makeSymbol("SYMBOLP");
        $ic164$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#30", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic165$ = makeSymbol("DEFINE");
        $ic166$ = ConsesLow.list((SubLObject)makeSymbol("DOCUMENTATION"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#56708", "CYC"));
        $ic167$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)NIL));
        $ic168$ = makeSymbol("RET");
        $ic169$ = makeSymbol("POSSIBLY-NOTE-FUNCTION-ENTRY", "SUBLISP");
        $ic170$ = makeUninternedSymbol("US#5338052");
        $ic171$ = makeSymbol("S#56671", "CYC");
        $ic172$ = makeSymbol("S#56607", "CYC");
        $ic173$ = ConsesLow.list((SubLObject)makeSymbol("S#56689", "CYC"), (SubLObject)makeSymbol("S#56688", "CYC"), (SubLObject)makeSymbol("S#56658", "CYC"), (SubLObject)makeSymbol("S#56677", "CYC"), (SubLObject)makeSymbol("S#56665", "CYC"));
        $ic174$ = makeSymbol("DEFLEXICAL");
        $ic175$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#32", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic176$ = makeSymbol("DEFMACRO");
        $ic177$ = ConsesLow.list((SubLObject)makeSymbol("S#56709", "CYC"), (SubLObject)makeSymbol("S#689", "CYC"));
        $ic178$ = makeSymbol("CDESTRUCTURING-BIND");
        $ic179$ = ConsesLow.list((SubLObject)makeSymbol("CDR"), (SubLObject)makeSymbol("S#56709", "CYC"));
        $ic180$ = makeSymbol("S#56710", "CYC");
        $ic181$ = makeSymbol("DEFPARAMETER");
        $ic182$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#6511", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#4498", "CYC"));
        $ic183$ = makeSymbol("DEFSTRUCT");
        $ic184$ = makeSymbol("S#56711", "CYC");
        $ic185$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#56712", "CYC"));
        $ic186$ = makeKeyword("NAME");
        $ic187$ = makeKeyword("C-STRUCTURE-TAG");
        $ic188$ = makeKeyword("PREDICATE");
        $ic189$ = makeKeyword("SLOTS");
        $ic190$ = makeKeyword("SLOT-KEYWORDS");
        $ic191$ = makeKeyword("GETTERS");
        $ic192$ = makeKeyword("SETTERS");
        $ic193$ = makeKeyword("PRINT-FUNCTION");
        $ic194$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic195$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#33", "CYC"), (SubLObject)makeSymbol("DOCUMENTATION"));
        $ic196$ = makeSymbol("DEFVAR");
        $ic197$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("CONDITION"));
        $ic198$ = makeSymbol("ENFORCE-TYPE");
        $ic199$ = makeSymbol("S#56713", "CYC");
        $ic200$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#151", "CYC"), (SubLObject)makeSymbol("S#159", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#160", "CYC"));
        $ic201$ = makeSymbol("ENFORCE-MUST");
        $ic202$ = makeSymbol("ERROR");
        $ic203$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("CONDITION"), (SubLObject)makeSymbol("S#56714", "CYC"), (SubLObject)makeSymbol("S#56715", "CYC"));
        $ic204$ = makeSymbol("FIF");
        $ic205$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("SYMBOL"));
        $ic206$ = makeSymbol("FUNCTION");
        $ic207$ = makeSymbol("SYMBOL-FUNCTION");
        $ic208$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("CONDITION"), (SubLObject)makeSymbol("S#56715", "CYC"));
        $ic209$ = makeSymbol("FUNLESS");
        $ic210$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("CONDITION"), (SubLObject)makeSymbol("S#56714", "CYC"));
        $ic211$ = makeSymbol("FWHEN");
        $ic212$ = ConsesLow.list((SubLObject)NIL);
        $ic213$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#56716", "CYC"));
        $ic214$ = makeSymbol("MULTIPLE-VALUE-LIST");
        $ic215$ = makeSymbol("MUST");
        $ic216$ = makeSymbol("*IGNORE-MUSTS?*");
        $ic217$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#770", "CYC"), (SubLObject)makeSymbol("S#56716", "CYC"));
        $ic218$ = makeSymbol("NTH-VALUE");
        $ic219$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#56717", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#735", "CYC"));
        $ic220$ = makeSymbol("PCASE");
        $ic221$ = makeUninternedSymbol("US#1CDE090");
        $ic222$ = makeSymbol("PCOND");
        $ic223$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#56718", "CYC"));
        $ic224$ = makeSymbol("OTHERWISE");
        $ic225$ = makeString("~AEncountered a PCASE that uses T rather than OTHERWISE");
        $ic226$ = makeString("Within ");
        $ic227$ = makeString(" : ");
        $ic228$ = makeString("");
        $ic229$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#735", "CYC"));
        $ic230$ = ConsesLow.list((SubLObject)makeSymbol("CONDITION"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#56718", "CYC"));
        $ic231$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("CONDITION"), (SubLObject)makeSymbol("S#163", "CYC"), (SubLObject)makeSymbol("S#164", "CYC"));
        $ic232$ = makeSymbol("PIF");
        $ic233$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#56719", "CYC"));
        $ic234$ = ConsesLow.list((SubLObject)makeSymbol("S#56720", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic235$ = ConsesLow.list((SubLObject)makeSymbol("S#1742", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#13101", "CYC"));
        $ic236$ = ConsesLow.list((SubLObject)makeSymbol("PRIVATE"), (SubLObject)makeSymbol("PROTECTED"), (SubLObject)makeSymbol("PUBLIC"));
        $ic237$ = ConsesLow.list((SubLObject)makeSymbol("S#1742", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#56721", "CYC"));
        $ic238$ = makeSymbol("INLINE");
        $ic239$ = makeSymbol("NOTINLINE");
        $ic240$ = makeSymbol("S#56722", "CYC");
        $ic241$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic242$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("CONDITION"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic243$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)T));
        $ic244$ = makeSymbol("PWHEN");
        $ic245$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic246$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#5859", "CYC"));
        $ic247$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#1755", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic248$ = makeSymbol("WITH-ERROR-HANDLER");
        $ic249$ = makeUninternedSymbol("US#3C57E05");
        $ic250$ = makeUninternedSymbol("US#7894308");
        $ic251$ = makeSymbol("S#56669", "CYC");
        $ic252$ = makeSymbol("WITH-PROCESS-RESOURCE-TRACKING");
        $ic253$ = makeUninternedSymbol("US#3F4C844");
        $ic254$ = makeSymbol("S#56670", "CYC");
        $ic255$ = makeSymbol("WITH-STATIC-AREA");
        $ic256$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*CURRENT-AREA*"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("GET-STATIC-AREA"))));
        $ic257$ = makeSymbol("WITH-THREAD-PRIVATE-AREA");
        $ic258$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*CURRENT-AREA*"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("GET-THREAD-PRIVATE-AREA"))));
        $ic259$ = makeSymbol("WITH-WORKING-AREA");
        $ic260$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*CURRENT-AREA*"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("GET-WORKING-AREA"))));
        $ic261$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#56723", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic262$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("S#33", "CYC"));
        $ic263$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#56724", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic264$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#56725", "CYC"), (SubLObject)makeSymbol("S#1534", "CYC"), (SubLObject)makeSymbol("S#56726", "CYC"), (SubLObject)makeSymbol("TYPE"));
        $ic265$ = makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP");
        $ic266$ = makeSymbol("INTEGERP");
        $ic267$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#52297", "CYC"));
        $ic268$ = makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP");
        $ic269$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#56725", "CYC"), (SubLObject)makeSymbol("S#56726", "CYC"), (SubLObject)makeSymbol("TYPE"));
        $ic270$ = makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP");
        $ic271$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#52297", "CYC"));
        $ic272$ = makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP");
        $ic273$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56727", "CYC"), (SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("S#56728", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic274$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("S#56728", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic275$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#33", "CYC"));
        $ic276$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#29", "CYC"));
        $ic277$ = makeSymbol("IN-PACKAGE");
        $ic278$ = makeSymbol("*PACKAGE*");
        $ic279$ = makeSymbol("FIND-PACKAGE");
        $ic280$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#770", "CYC"));
        $ic281$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic282$ = makeSymbol("UNTIL");
        $ic283$ = makeSymbol("WHILE");
        $ic284$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic285$ = ConsesLow.list((SubLObject)makeSymbol("S#56723", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic286$ = ConsesLow.list((SubLObject)makeSymbol("S#56724", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic287$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic288$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("S#56728", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic289$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56727", "CYC"), (SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("S#56728", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic290$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#704", "CYC"), (SubLObject)makeSymbol("S#705", "CYC"), (SubLObject)makeSymbol("S#28822", "CYC"), (SubLObject)makeSymbol("S#56729", "CYC"), (SubLObject)makeSymbol("S#50102", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic291$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#150", "CYC"), (SubLObject)makeSymbol("S#768", "CYC"), (SubLObject)makeSymbol("S#56730", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic292$ = ConsesLow.list((SubLObject)makeSymbol("S#56730", "CYC"), (SubLObject)makeSymbol("S#152", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic293$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56703", "CYC"), (SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("S#56731", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic294$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56695", "CYC"), (SubLObject)makeSymbol("PACKAGE"), (SubLObject)makeSymbol("S#56732", "CYC"), (SubLObject)makeSymbol("S#56729", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic295$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1755", "CYC"), (SubLObject)makeSymbol("S#56733", "CYC"), (SubLObject)makeSymbol("S#56734", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic296$ = ConsesLow.list((SubLObject)makeSymbol("S#56735", "CYC"), (SubLObject)makeSymbol("S#761", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic297$ = ConsesLow.list((SubLObject)makeSymbol("S#56736", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic298$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("CURRENT-PROCESS")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 890 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/
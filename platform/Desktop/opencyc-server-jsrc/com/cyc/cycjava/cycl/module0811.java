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
        return module0811.$g6440$.getDynamicValue(var1);
    }
    
    public static SubLObject f51788(SubLObject var2) {
        if (var2.isAtom()) {
            return f51789(var2);
        }
        var2 = f51790(var2);
        final SubLObject var3 = var2.first();
        final SubLObject var4 = f51791(var3);
        if (module0811.NIL != var4) {
            return f51792(var4, var2);
        }
        if (var3.isMacroOperator()) {
            return f51793(var2);
        }
        return f51794(var2);
    }
    
    public static SubLObject f51795(final SubLObject var2, SubLObject var5, SubLObject var6) {
        if (var5 == module0811.UNPROVIDED) {
            var5 = (SubLObject)module0811.$ic0$;
        }
        if (var6 == module0811.UNPROVIDED) {
            var6 = (SubLObject)module0811.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0811.NIL;
        final SubLObject var9 = reader.$features$.currentBinding(var7);
        try {
            reader.$features$.bind(conses_high.adjoin(var5, var6, (SubLObject)module0811.UNPROVIDED, (SubLObject)module0811.UNPROVIDED), var7);
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
        if (var2 == module0811.NIL || var2 == module0811.T) {
            return f51796(var2);
        }
        if (var2.isSymbol()) {
            return f51797(var2);
        }
        if (module0811.NIL != Eval.constantp(var2, (SubLObject)module0811.UNPROVIDED)) {
            return f51796(var2);
        }
        return Errors.error((SubLObject)module0811.$ic1$, var2);
    }
    
    public static SubLObject f51796(final SubLObject var2) {
        return module0812.f52007(var2);
    }
    
    public static SubLObject f51798(final SubLObject var9) {
        SubLObject var10 = module0809.f51530(var9);
        if (var10 != module0811.$ic2$) {
            return var10;
        }
        var10 = module0812.f51986(var9);
        if (var10 != module0811.$ic2$) {
            return var10;
        }
        return (SubLObject)module0811.$ic3$;
    }
    
    public static SubLObject f51797(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = f51798(var9);
        if (var11 != module0811.$ic3$) {
            module0809.f51685(var9);
        }
        final SubLObject var12 = var11;
        if (var12.eql((SubLObject)module0811.$ic3$)) {
            return f51799(var9);
        }
        if (var12.eql((SubLObject)module0811.$ic4$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic5$, f51799(var9));
        }
        if (var12.eql((SubLObject)module0811.$ic6$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic7$, f51799(var9));
        }
        if (var12.eql((SubLObject)module0811.$ic8$)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic7$, f51799(var9));
        }
        return Errors.error((SubLObject)module0811.$ic9$, var11, var9);
    }
    
    public static SubLObject f51799(final SubLObject var9) {
        final SubLObject var10 = f51798(var9);
        if (var10 != module0811.$ic3$) {
            module0812.f52010(var9);
        }
        return var9;
    }
    
    public static SubLObject f51792(final SubLObject var4, final SubLObject var2) {
        if (module0811.NIL == module0004.f85(var4)) {
            return Errors.error((SubLObject)module0811.$ic10$, var4);
        }
        return Functions.funcall(var4, var2);
    }
    
    public static SubLObject f51793(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic11$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0809.f51688(var3);
        return f51788(Eval.macroexpand_1(var2, (SubLObject)module0811.UNPROVIDED));
    }
    
    public static SubLObject f51794(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic12$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0809.f51689(var3);
        final SubLObject var6 = f51800(var3);
        SubLObject var7 = (SubLObject)module0811.NIL;
        SubLObject var8 = var5;
        SubLObject var9 = (SubLObject)module0811.NIL;
        var9 = var8.first();
        while (module0811.NIL != var8) {
            var7 = (SubLObject)ConsesLow.cons(f51788(var9), var7);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return reader.bq_cons(var6, ConsesLow.append(Sequences.nreverse(var7), (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51800(final SubLObject var2) {
        module0812.f52011(var2);
        return var2;
    }
    
    public static SubLObject f51801(final SubLObject var22) {
        return Symbols.get(var22, (SubLObject)module0811.$ic13$, (SubLObject)module0811.$ic14$);
    }
    
    public static SubLObject f51802(final SubLObject var22) {
        return Symbols.get(var22, (SubLObject)module0811.$ic15$, (SubLObject)module0811.$ic14$);
    }
    
    public static SubLObject f51803(final SubLObject var22) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var22.isSymbol() && module0811.$ic16$ == f51801(var22));
    }
    
    public static SubLObject f51804(final SubLObject var22) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var22.isSymbol() && module0811.$ic16$ == f51802(var22));
    }
    
    public static SubLObject f51805(final SubLObject var23) {
        SubLObject var24 = (SubLObject)module0811.NIL;
        SubLObject var25 = var23;
        SubLObject var26 = (SubLObject)module0811.NIL;
        var26 = var25.first();
        while (module0811.NIL != var25) {
            final SubLObject var27 = f51788(var26);
            var24 = (SubLObject)ConsesLow.cons(var27, var24);
            var25 = var25.rest();
            var26 = var25.first();
        }
        return module0814.f52178(Sequences.nreverse(var24));
    }
    
    public static SubLObject f51806(final SubLObject var26) {
        SubLObject var27 = (SubLObject)module0811.NIL;
        SubLObject var28 = var26;
        SubLObject var29 = (SubLObject)module0811.NIL;
        var29 = var28.first();
        while (module0811.NIL != var28) {
            if (var29.isCons()) {
                SubLObject var31;
                final SubLObject var30 = var31 = var29;
                SubLObject var32 = (SubLObject)module0811.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0811.$ic17$);
                var32 = var31.first();
                var31 = var31.rest();
                final SubLObject var33 = (SubLObject)(var31.isCons() ? var31.first() : module0811.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var31, var30, (SubLObject)module0811.$ic17$);
                var31 = var31.rest();
                final SubLObject var34 = (SubLObject)(var31.isCons() ? var31.first() : module0811.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var31, var30, (SubLObject)module0811.$ic17$);
                var31 = var31.rest();
                if (module0811.NIL == var31) {
                    var27 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var32, f51788(var33), ConsesLow.append((SubLObject)((module0811.NIL != var34) ? ConsesLow.list(var34) : module0811.NIL), (SubLObject)module0811.NIL)), var27);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)module0811.$ic17$);
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
        if (var2 == module0811.UNPROVIDED) {
            var2 = (SubLObject)module0811.NIL;
        }
        return (SubLObject)module0811.$ic18$;
    }
    
    public static SubLObject f51808(final SubLObject var32) {
        return module0035.f2169(var32, (SubLObject)module0811.$ic19$);
    }
    
    public static SubLObject f51809(final SubLObject var33) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var33.isSymbol() && module0811.$ic4$ == Symbols.get(var33, (SubLObject)module0811.$ic20$, (SubLObject)module0811.UNPROVIDED));
    }
    
    public static SubLObject f51810(final SubLObject var33) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var33.isSymbol() && module0811.$ic6$ == Symbols.get(var33, (SubLObject)module0811.$ic20$, (SubLObject)module0811.UNPROVIDED));
    }
    
    public static SubLObject f51811(final SubLObject var33) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var33.isSymbol() && module0811.$ic8$ == Symbols.get(var33, (SubLObject)module0811.$ic20$, (SubLObject)module0811.UNPROVIDED));
    }
    
    public static SubLObject f51812(final SubLObject var34) {
        if (module0811.NIL != f51809(var34)) {
            return (SubLObject)module0811.$ic4$;
        }
        if (module0811.NIL != f51810(var34)) {
            return (SubLObject)module0811.$ic6$;
        }
        if (module0811.NIL != f51811(var34)) {
            return (SubLObject)module0811.$ic8$;
        }
        return (SubLObject)module0811.$ic2$;
    }
    
    public static SubLObject f51813(final SubLObject var33) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var33.isSymbol() && module0811.NIL != Symbols.get(var33, (SubLObject)module0811.$ic21$, (SubLObject)module0811.UNPROVIDED));
    }
    
    public static SubLObject f51814(final SubLObject var35, final SubLObject var2, final SubLObject var25) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        if (module0811.NIL == module0811.$g6441$.getDynamicValue(var36)) {
            return (SubLObject)module0811.NIL;
        }
        final SubLObject var37 = module0035.f2422(var2);
        final SubLObject var38 = module0035.f2422(var25);
        final SubLObject var39 = f51815(var37, var38);
        final SubLObject var40 = (SubLObject)module0811.$ic22$;
        SubLObject var41 = (SubLObject)module0811.NIL;
        if (module0811.$g6441$.getDynamicValue(var36).isVector()) {
            var41 = module0811.$g6441$.getDynamicValue(var36);
            Vectors.set_aref(var41, (SubLObject)module0811.ZERO_INTEGER, Numbers.add(Vectors.aref(var41, (SubLObject)module0811.ZERO_INTEGER), (SubLObject)module0811.ONE_INTEGER));
            Vectors.set_aref(var41, (SubLObject)module0811.ONE_INTEGER, Numbers.add(Vectors.aref(var41, (SubLObject)module0811.ONE_INTEGER), var37));
            Vectors.set_aref(var41, (SubLObject)module0811.TWO_INTEGER, Numbers.add(Vectors.aref(var41, (SubLObject)module0811.TWO_INTEGER), var38));
            Vectors.set_aref(var41, (SubLObject)module0811.THREE_INTEGER, Numbers.add(Vectors.aref(var41, (SubLObject)module0811.THREE_INTEGER), var39));
        }
        if (var39.numG(var40)) {
            if (module0811.$g6441$.getDynamicValue(var36).isVector()) {
                Vectors.set_aref(var41, (SubLObject)module0811.FOUR_INTEGER, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var35, var39), Vectors.aref(var41, (SubLObject)module0811.FOUR_INTEGER)));
            }
            else {
                Errors.warn((SubLObject)module0811.$ic23$, var35, Numbers.round(module0048.f3302(var39, (SubLObject)module0811.TWO_INTEGER), (SubLObject)module0811.UNPROVIDED));
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
        return (SubLObject)(var36.isZero() ? module0811.ZERO_INTEGER : Numbers.divide(var37, var36));
    }
    
    public static SubLObject f51817(SubLObject var40, SubLObject var42) {
        if (var40 == module0811.UNPROVIDED) {
            var40 = module0811.$g6441$.getDynamicValue();
        }
        if (var42 == module0811.UNPROVIDED) {
            var42 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var43 = Vectors.aref(var40, (SubLObject)module0811.ZERO_INTEGER);
        final SubLObject var44 = Vectors.aref(var40, (SubLObject)module0811.ONE_INTEGER);
        final SubLObject var45 = Vectors.aref(var40, (SubLObject)module0811.TWO_INTEGER);
        final SubLObject var46 = Sort.sort(conses_high.copy_list(Vectors.aref(var40, (SubLObject)module0811.FOUR_INTEGER)), Symbols.symbol_function((SubLObject)module0811.$ic24$), Symbols.symbol_function((SubLObject)module0811.$ic25$));
        PrintLow.format(var42, (SubLObject)module0811.$ic26$, var43);
        PrintLow.format(var42, (SubLObject)module0811.$ic27$, module0048.f3302(Numbers.divide(var44, var43), (SubLObject)module0811.THREE_INTEGER));
        PrintLow.format(var42, (SubLObject)module0811.$ic28$, module0048.f3302(Numbers.divide(var45, var44), (SubLObject)module0811.THREE_INTEGER));
        PrintLow.format(var42, (SubLObject)module0811.$ic29$);
        SubLObject var47 = var46;
        SubLObject var48 = (SubLObject)module0811.NIL;
        var48 = var47.first();
        while (module0811.NIL != var47) {
            SubLObject var49;
            final SubLObject var48_49 = var49 = var48;
            SubLObject var50 = (SubLObject)module0811.NIL;
            SubLObject var51 = (SubLObject)module0811.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var49, var48_49, (SubLObject)module0811.$ic30$);
            var50 = var49.first();
            var49 = var49.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var49, var48_49, (SubLObject)module0811.$ic30$);
            var51 = var49.first();
            var49 = var49.rest();
            if (module0811.NIL == var49) {
                PrintLow.format(var42, (SubLObject)module0811.$ic31$, Numbers.round(module0048.f3302(var51, (SubLObject)module0811.THREE_INTEGER), (SubLObject)module0811.UNPROVIDED), var50);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var48_49, (SubLObject)module0811.$ic30$);
            }
            var47 = var47.rest();
            var48 = var47.first();
        }
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51791(final SubLObject var3) {
        return module0035.f2294(module0811.$g6442$.getGlobalValue(), var3, Symbols.symbol_function((SubLObject)module0811.EQ), (SubLObject)module0811.UNPROVIDED);
    }
    
    public static SubLObject f51818(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic33$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)module0811.$ic34$);
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0811.NIL;
        var8 = var7.first();
        while (module0811.NIL != var7) {
            final SubLObject var9 = f51819((SubLObject)ConsesLow.list((SubLObject)module0811.$ic35$, var8));
            var6 = (SubLObject)ConsesLow.cons(var9, var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return module0814.f52170((SubLObject)ConsesLow.list((SubLObject)module0811.$ic36$, module0814.f52172(reader.bq_cons((SubLObject)module0811.$ic37$, ConsesLow.append(Sequences.nreverse(var6), (SubLObject)module0811.NIL)))));
    }
    
    public static SubLObject f51820(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic38$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic38$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic38$);
        var6 = var7.first();
        final SubLObject var8;
        var7 = (var8 = var7.rest());
        module0035.f2502(var4, (SubLObject)module0811.$ic39$);
        final SubLObject var9 = f51788(var5);
        final SubLObject var10 = f51821(var8);
        final SubLObject var11 = (SubLObject)module0811.$ic40$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic41$, (SubLObject)ConsesLow.list(var9, var6, var11), ConsesLow.append(var10, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51821(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0811.NIL;
        final SubLObject var26 = module0811.$g6440$.currentBinding(var24);
        try {
            module0811.$g6440$.bind((SubLObject)module0811.T, var24);
            var25 = f51805(var23);
        }
        finally {
            module0811.$g6440$.rebind(var26, var24);
        }
        return var25;
    }
    
    public static SubLObject f51822(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0811.NIL;
        final SubLObject var5 = module0811.$g6440$.currentBinding(var3);
        try {
            module0811.$g6440$.bind((SubLObject)module0811.T, var3);
            var4 = f51788(var2);
        }
        finally {
            module0811.$g6440$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f51823(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic42$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic42$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : module0811.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var2, (SubLObject)module0811.$ic42$);
        var5 = var5.rest();
        if (module0811.NIL == var5) {
            module0035.f2502(var3, (SubLObject)module0811.$ic43$);
            return f51824((SubLObject)ConsesLow.list((SubLObject)module0811.$ic44$, var4, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic45$, var4, var6)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic42$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51825(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic46$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic46$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic46$);
        var5 = var6.first();
        final SubLObject var7;
        var6 = (var7 = var6.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic47$);
        SubLObject var8 = (SubLObject)module0811.NIL;
        SubLObject var9 = (SubLObject)module0811.NIL;
        SubLObject var10 = (SubLObject)module0811.NIL;
        SubLObject var11 = (SubLObject)module0811.NIL;
        SubLObject var12 = (SubLObject)module0811.NIL;
        SubLObject var13 = var4;
        SubLObject var14 = (SubLObject)module0811.NIL;
        var14 = var13.first();
        while (module0811.NIL != var13) {
            SubLObject var79_80;
            final SubLObject var77_78 = var79_80 = var14;
            SubLObject var15 = (SubLObject)module0811.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var79_80, var77_78, (SubLObject)module0811.$ic48$);
            var15 = var79_80.first();
            var79_80 = var79_80.rest();
            final SubLObject var16 = (SubLObject)(var79_80.isCons() ? var79_80.first() : module0811.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var79_80, var77_78, (SubLObject)module0811.$ic48$);
            var79_80 = var79_80.rest();
            final SubLObject var17 = (SubLObject)(var79_80.isCons() ? var79_80.first() : module0811.NIL);
            final SubLObject var18 = Types.consp(var79_80);
            cdestructuring_bind.destructuring_bind_must_listp(var79_80, var77_78, (SubLObject)module0811.$ic48$);
            var79_80 = var79_80.rest();
            if (module0811.NIL == var79_80) {
                var8 = (SubLObject)ConsesLow.cons(var15, var8);
                var9 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var15, var16), var9);
                if (module0811.NIL != var18) {
                    var11 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var15, var17), var11);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var77_78, (SubLObject)module0811.$ic48$);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        var8 = Sequences.nreverse(var8);
        var9 = Sequences.nreverse(var9);
        var11 = Sequences.nreverse(var11);
        SubLObject var86_87;
        final SubLObject var84_85 = var86_87 = var5;
        SubLObject var19 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var86_87, var84_85, (SubLObject)module0811.$ic50$);
        var19 = var86_87.first();
        final SubLObject var20;
        var86_87 = (var20 = var86_87.rest());
        var10 = (SubLObject)ConsesLow.list((SubLObject)module0811.$ic51$, var19);
        var12 = var20;
        return f51826((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic52$, var8, (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic53$, (SubLObject)ConsesLow.list(var9, var10, var11), ConsesLow.append(var7, (SubLObject)module0811.NIL)), ConsesLow.append(var12, (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51827(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic54$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic54$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = (SubLObject)module0811.NIL;
        SubLObject var8 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic54$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic54$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic54$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0811.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            module0035.f2502(var3, (SubLObject)module0811.$ic55$);
            final SubLObject var10 = f51805(var9);
            return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic55$, (SubLObject)ConsesLow.list(var6, var7, var8), ConsesLow.append(var10, (SubLObject)module0811.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic54$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51828(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic56$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic56$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic56$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic56$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0811.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            module0035.f2502(var3, (SubLObject)module0811.$ic57$);
            final SubLObject var9 = (SubLObject)module0811.$ic58$;
            final SubLObject var10 = (SubLObject)module0811.$ic59$;
            return f51826((SubLObject)ConsesLow.list((SubLObject)module0811.$ic52$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var7), var10, var6), (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic55$, (SubLObject)ConsesLow.list(var6, var9, var10), ConsesLow.append(var8, (SubLObject)module0811.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic56$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51829(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic60$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic60$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = (SubLObject)module0811.NIL;
        SubLObject var8 = (SubLObject)module0811.NIL;
        SubLObject var9 = (SubLObject)module0811.NIL;
        SubLObject var10 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic60$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic60$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic60$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic60$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic60$);
        var10 = var4.first();
        var4 = var4.rest();
        if (module0811.NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            module0035.f2502(var3, (SubLObject)module0811.$ic61$);
            final SubLObject var12 = f51805(var11);
            final SubLObject var13 = f51788(var8);
            return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic61$, (SubLObject)ConsesLow.list(var6, var7, var13, var9, var10), ConsesLow.append(var12, (SubLObject)module0811.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic60$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51830(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic62$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic62$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = (SubLObject)module0811.NIL;
        SubLObject var8 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic62$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic62$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic62$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0811.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic62$);
            return (SubLObject)module0811.NIL;
        }
        final SubLObject var9;
        var4 = (var9 = var5);
        module0035.f2502(var3, (SubLObject)module0811.$ic63$);
        if (!var8.isAtom() || module0811.NIL != f51809(var8)) {
            final SubLObject var10 = (SubLObject)module0811.$ic64$;
            return f51826((SubLObject)ConsesLow.list((SubLObject)module0811.$ic52$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var8)), (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic63$, (SubLObject)ConsesLow.list(var6, var7, var10), ConsesLow.append(var9, (SubLObject)module0811.NIL))));
        }
        final SubLObject var11 = (SubLObject)module0811.$ic65$;
        final SubLObject var12 = (SubLObject)module0811.$ic66$;
        return f51826((SubLObject)ConsesLow.list((SubLObject)module0811.$ic52$, (SubLObject)ConsesLow.list(var6, var7), (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic61$, (SubLObject)ConsesLow.list(var6, var7, var8, var11, var12), ConsesLow.append(var9, (SubLObject)module0811.NIL))));
    }
    
    public static SubLObject f51831(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic67$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic67$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic67$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic67$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0811.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            module0035.f2502(var3, (SubLObject)module0811.$ic68$);
            final SubLObject var9 = (SubLObject)module0811.$ic69$;
            return f51832((SubLObject)ConsesLow.list((SubLObject)module0811.$ic70$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic71$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic72$, var9))), (SubLObject)ConsesLow.list((SubLObject)module0811.$ic51$, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic73$, var9)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var9, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic74$, var9)), (SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var6, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic72$, var9)))), ConsesLow.append(var8, (SubLObject)module0811.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic67$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51833(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic75$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic75$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic75$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic75$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0811.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic75$);
            return (SubLObject)module0811.NIL;
        }
        final SubLObject var8;
        var4 = (var8 = var5);
        module0035.f2502(var3, (SubLObject)module0811.$ic76$);
        if (!var7.isAtom()) {
            final SubLObject var9 = (SubLObject)module0811.$ic77$;
            return f51832((SubLObject)ConsesLow.list((SubLObject)module0811.$ic70$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic76$, (SubLObject)ConsesLow.list(var6, var9), ConsesLow.append(var8, (SubLObject)module0811.NIL))));
        }
        return f51834((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic71$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(reader.bq_cons(var6, (SubLObject)module0811.$ic78$)), (SubLObject)ConsesLow.list((SubLObject)module0811.$ic79$, var6, var7), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0811.$ic80$, var6))), ConsesLow.append(var8, (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51835(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic81$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic81$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic81$);
        var5 = var6.first();
        var6 = var6.rest();
        if (module0811.NIL == var6) {
            module0035.f2502(var3, (SubLObject)module0811.$ic82$);
            module0809.f51689(var5);
            final SubLObject var7 = f51788(var4);
            final SubLObject var8 = f51800(var5);
            f51788((SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var5));
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic84$, var7, var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic81$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51836(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic42$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic42$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : module0811.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var2, (SubLObject)module0811.$ic42$);
        var5 = var5.rest();
        if (module0811.NIL == var5) {
            module0035.f2502(var3, (SubLObject)module0811.$ic80$);
            return f51824((SubLObject)ConsesLow.list((SubLObject)module0811.$ic44$, var4, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic85$, var4, var6)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic42$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51826(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic86$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic86$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic52$);
        return f51837((SubLObject)module0811.NIL, var4, var6);
    }
    
    public static SubLObject f51837(final SubLObject var134, final SubLObject var133, final SubLObject var23) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        if (module0811.NIL == var133) {
            return f51838(var134, var23);
        }
        SubLObject var136 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var133, var133, (SubLObject)module0811.$ic87$);
        var136 = var133.first();
        final SubLObject var138;
        final SubLObject var137 = var138 = var133.rest();
        SubLObject var139 = (SubLObject)module0811.$ic88$;
        SubLObject var140 = (SubLObject)module0811.NIL;
        if (var136.isCons()) {
            SubLObject var141_142;
            final SubLObject var139_140 = var141_142 = var136;
            SubLObject var141 = (SubLObject)module0811.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var141_142, var139_140, (SubLObject)module0811.$ic89$);
            var141 = var141_142.first();
            var141_142 = var141_142.rest();
            final SubLObject var142 = (SubLObject)(var141_142.isCons() ? var141_142.first() : module0811.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var141_142, var139_140, (SubLObject)module0811.$ic89$);
            var141_142 = var141_142.rest();
            if (module0811.NIL == var141_142) {
                var139 = var141;
                var140 = var142;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var139_140, (SubLObject)module0811.$ic89$);
            }
        }
        else {
            var139 = var136;
        }
        final SubLObject var143 = f51798(var139);
        final SubLObject var144 = f51799(var139);
        final SubLObject var145 = f51788(var140);
        final SubLObject var146 = f51837((SubLObject)SubLObjectFactory.makeBoolean(module0811.NIL != var134 || var143 == module0811.$ic4$), var138, var23);
        final SubLObject var147 = var143;
        if (var147.eql((SubLObject)module0811.$ic3$)) {
            return module0814.f52165((SubLObject)ConsesLow.list((SubLObject)module0811.$ic70$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var144, var145)), var146));
        }
        if (var147.eql((SubLObject)module0811.$ic4$)) {
            module0809.f51687(var139);
            return module0814.f52166((SubLObject)ConsesLow.list((SubLObject)module0811.$ic90$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var144, var145)), var146));
        }
        if (var147.eql((SubLObject)module0811.$ic6$)) {
            return Errors.error((SubLObject)module0811.$ic91$, var139);
        }
        if (var147.eql((SubLObject)module0811.$ic8$)) {
            return Errors.error((SubLObject)module0811.$ic92$, var139);
        }
        return Errors.error((SubLObject)module0811.$ic93$, var139);
    }
    
    public static SubLObject f51838(final SubLObject var134, final SubLObject var23) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        SubLObject var136 = (SubLObject)module0811.NIL;
        if (module0811.NIL != var134) {
            final SubLObject var137 = module0811.$g6440$.currentBinding(var135);
            try {
                module0811.$g6440$.bind((SubLObject)module0811.T, var135);
                var136 = f51838((SubLObject)module0811.NIL, var23);
            }
            finally {
                module0811.$g6440$.rebind(var137, var135);
            }
        }
        else {
            var136 = f51839(reader.bq_cons((SubLObject)module0811.$ic94$, ConsesLow.append(var23, (SubLObject)module0811.NIL)));
        }
        return var136;
    }
    
    public static SubLObject f51840(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic95$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic95$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic95$);
        var6 = var7.first();
        final SubLObject var8;
        var7 = (var8 = var7.rest());
        module0035.f2502(var4, (SubLObject)module0811.$ic96$);
        final SubLObject var9 = f51841(var5, var6);
        return f51839((SubLObject)ConsesLow.list((SubLObject)module0811.$ic94$, (SubLObject)module0811.$ic97$, (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic52$, var9, (SubLObject)module0811.$ic97$, ConsesLow.append(var8, (SubLObject)module0811.NIL))));
    }
    
    public static SubLObject f51841(final SubLObject var69, final SubLObject var150) {
        final SubLThread var151 = SubLProcess.currentSubLThread();
        SubLObject var152 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var69, (SubLObject)module0811.$ic98$);
        var152 = var69.first();
        final SubLObject var154;
        final SubLObject var153 = var154 = var69.rest();
        SubLObject var155 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var152, var150));
        SubLObject var156 = (SubLObject)module0811.NIL;
        SubLObject var157 = (SubLObject)module0811.NIL;
        SubLObject var158 = (SubLObject)module0811.NIL;
        var156 = var154;
        var157 = var156.first();
        for (var158 = (SubLObject)module0811.ZERO_INTEGER; module0811.NIL != var156; var156 = var156.rest(), var157 = var156.first(), var158 = Numbers.add((SubLObject)module0811.ONE_INTEGER, var158)) {
            var155 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var157, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic99$, module0048.f_1X(var158))), var155);
        }
        return Sequences.nreverse(var155);
    }
    
    public static SubLObject f51842(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic100$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic100$);
        var4 = var5.first();
        var5 = var5.rest();
        if (module0811.NIL == var5) {
            module0035.f2502(var3, (SubLObject)module0811.$ic51$);
            final SubLObject var6 = f51819((SubLObject)ConsesLow.list((SubLObject)module0811.$ic35$, var4));
            return module0814.f52170((SubLObject)ConsesLow.list((SubLObject)module0811.$ic36$, module0814.f52171((SubLObject)ConsesLow.list((SubLObject)module0811.$ic101$, var6))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic100$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51843(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic33$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)module0811.$ic102$);
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0811.NIL;
        var8 = var7.first();
        while (module0811.NIL != var7) {
            final SubLObject var9 = f51819((SubLObject)ConsesLow.list((SubLObject)module0811.$ic35$, var8));
            var6 = (SubLObject)ConsesLow.cons(var9, var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return module0814.f52170((SubLObject)ConsesLow.list((SubLObject)module0811.$ic36$, module0814.f52173(reader.bq_cons((SubLObject)module0811.$ic103$, ConsesLow.append(Sequences.nreverse(var6), (SubLObject)module0811.NIL)))));
    }
    
    public static SubLObject f51844(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic104$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic104$);
        var4 = var5.first();
        var5 = var5.rest();
        if (module0811.NIL == var5) {
            module0035.f2502(var3, (SubLObject)module0811.$ic105$);
            return f51824((SubLObject)ConsesLow.list((SubLObject)module0811.$ic44$, var4, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic106$, var4)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic104$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51845(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic107$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic107$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic107$);
        var5 = var6.first();
        final SubLObject var7;
        var6 = (var7 = var6.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic108$);
        final SubLObject var8 = f51788(var4);
        final SubLObject var9 = f51788(var5);
        final SubLObject var10 = f51805(var7);
        final SubLObject var11 = (SubLObject)module0811.$ic109$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic110$, (SubLObject)ConsesLow.list(var8, var9, var11), ConsesLow.append(var10, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51846(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic111$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic111$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic111$);
        var5 = var6.first();
        var6 = var6.rest();
        if (module0811.NIL == var6) {
            module0035.f2502(var3, (SubLObject)module0811.$ic112$);
            return f51824((SubLObject)ConsesLow.list((SubLObject)module0811.$ic44$, var5, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic113$, var4, var5)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic111$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51847(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic114$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic114$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic114$);
        var5 = var6.first();
        var6 = var6.rest();
        final SubLObject var7 = (SubLObject)(var6.isCons() ? var6.first() : module0811.$ic115$);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var2, (SubLObject)module0811.$ic114$);
        var6 = var6.rest();
        final SubLObject var8 = (SubLObject)(var6.isCons() ? var6.first() : module0811.$ic116$);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var2, (SubLObject)module0811.$ic114$);
        var6 = var6.rest();
        if (module0811.NIL == var6) {
            module0035.f2502(var3, (SubLObject)module0811.$ic117$);
            final SubLObject var9 = (SubLObject)module0811.$ic118$;
            return f51826((SubLObject)ConsesLow.list((SubLObject)module0811.$ic52$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var4)), (SubLObject)ConsesLow.list((SubLObject)module0811.$ic119$, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic120$, var9, var5, var7, var8), (SubLObject)ConsesLow.list((SubLObject)module0811.$ic112$, var9, var5))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic114$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51824(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic121$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic121$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic121$);
        var5 = var6.first();
        var6 = var6.rest();
        if (module0811.NIL != var6) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic121$);
            return (SubLObject)module0811.NIL;
        }
        module0035.f2502(var3, (SubLObject)module0811.$ic44$);
        if (var4.isAtom()) {
            return f51848((SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var4, var5));
        }
        final SubLObject var7 = var4.first();
        SubLObject var8 = (SubLObject)module0811.NIL;
        final SubLObject var9 = var7;
        if (var9.eql((SubLObject)module0811.$ic122$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)module0811.$ic123$, conses_high.second(var4), var5);
        }
        else if (var9.eql((SubLObject)module0811.$ic106$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)module0811.$ic124$, conses_high.second(var4), var5);
        }
        else if (var9.eql((SubLObject)module0811.$ic125$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)module0811.$ic126$, conses_high.second(var4), conses_high.third(var4), var5);
        }
        else if (var9.eql((SubLObject)module0811.$ic127$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)module0811.$ic128$, conses_high.second(var4), conses_high.third(var4), var5);
        }
        else if (var9.eql((SubLObject)module0811.$ic129$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)module0811.$ic128$, conses_high.second(var4), conses_high.third(var4), var5);
        }
        else if (var9.eql((SubLObject)module0811.$ic130$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)module0811.$ic131$, conses_high.second(var4), conses_high.third(var4), var5);
        }
        else if (var9.eql((SubLObject)module0811.$ic132$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)module0811.$ic133$, conses_high.second(var4), conses_high.third(var4), var5);
        }
        else if (var9.eql((SubLObject)module0811.$ic134$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)module0811.$ic135$, conses_high.second(var4), conses_high.third(var4), var5);
        }
        else if (var9.eql((SubLObject)module0811.$ic136$)) {
            var8 = (SubLObject)ConsesLow.list((SubLObject)module0811.$ic137$, conses_high.second(var4), var5);
        }
        else {
            SubLObject var181_182;
            final SubLObject var179_180 = var181_182 = var4;
            SubLObject var177_183 = (SubLObject)module0811.NIL;
            SubLObject var10 = (SubLObject)module0811.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var181_182, var179_180, (SubLObject)module0811.$ic138$);
            var177_183 = var181_182.first();
            var181_182 = var181_182.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var181_182, var179_180, (SubLObject)module0811.$ic138$);
            var10 = var181_182.first();
            var181_182 = var181_182.rest();
            if (module0811.NIL == var181_182) {
                final SubLObject var11 = f51849(var177_183);
                var8 = (SubLObject)ConsesLow.list(var11, var10, var5);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var179_180, (SubLObject)module0811.$ic138$);
            }
        }
        return f51788(var8);
    }
    
    public static SubLObject f51849(final SubLObject var177) {
        return Functions.funcall((SubLObject)module0811.$ic139$, var177);
    }
    
    public static SubLObject f51848(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic140$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic140$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic140$);
        var5 = var6.first();
        final SubLObject var7;
        var6 = (var7 = var6.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic49$);
        f51850(var4);
        final SubLObject var8 = f51799(var4);
        final SubLObject var9 = f51788(var5);
        if (module0811.NIL == var7) {
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var8, var9);
        }
        final SubLObject var10 = f51851(var7);
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic94$, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var8, var9), ConsesLow.append(var10, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51851(final SubLObject var187) {
        if (module0811.NIL == var187) {
            return (SubLObject)module0811.NIL;
        }
        SubLObject var188 = (SubLObject)module0811.NIL;
        SubLObject var189 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var187, var187, (SubLObject)module0811.$ic141$);
        var188 = var187.first();
        SubLObject var190 = var187.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var190, var187, (SubLObject)module0811.$ic141$);
        var189 = var190.first();
        final SubLObject var191;
        var190 = (var191 = var190.rest());
        f51850(var188);
        final SubLObject var192 = f51799(var188);
        final SubLObject var193 = f51788(var189);
        final SubLObject var194 = f51851(var191);
        return reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var192, var193), ConsesLow.append(var194, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51850(final SubLObject var9) {
        final SubLObject var11;
        final SubLObject var10 = var11 = f51798(var9);
        if (var11.eql((SubLObject)module0811.$ic6$) || var11.eql((SubLObject)module0811.$ic4$)) {
            module0809.f51686(var9);
            return (SubLObject)module0811.T;
        }
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51852(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic142$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic142$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = (SubLObject)module0811.NIL;
        SubLObject var8 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic142$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic142$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic142$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0811.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            module0035.f2502(var3, (SubLObject)module0811.$ic143$);
            final SubLObject var10 = (SubLObject)module0811.$ic144$;
            return f51853((SubLObject)ConsesLow.list((SubLObject)module0811.$ic119$, var8, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic70$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic71$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic72$, var10))), (SubLObject)ConsesLow.list((SubLObject)module0811.$ic51$, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic102$, var8, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic73$, var10))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var10, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic74$, var10)), (SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var6, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic72$, var10)))), ConsesLow.append(var9, (SubLObject)module0811.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic142$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51854(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic145$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic145$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic146$);
        final SubLObject var7 = (SubLObject)module0811.$ic147$;
        return f51832((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic70$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)module0811.$ic148$)), ConsesLow.append(var6, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var4, (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic149$, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic45$, (SubLObject)module0811.$ic150$, var7), (SubLObject)module0811.$ic151$))))));
    }
    
    public static SubLObject f51855(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic152$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic152$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic153$);
        final SubLObject var7 = f51822(var4);
        final SubLObject var8 = f51805(var6);
        final SubLObject var9 = (SubLObject)module0811.$ic154$;
        return module0814.f52175((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic155$, var9, var7, ConsesLow.append(var8, (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51856(final SubLObject var2) {
        return var2;
    }
    
    public static SubLObject f51857(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic156$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)module0811.$ic157$);
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0811.NIL;
        var8 = var7.first();
        while (module0811.NIL != var7) {
            var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0811.$ic158$, module0035.f2241(var8)), var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return f51839(reader.bq_cons((SubLObject)module0811.$ic94$, ConsesLow.append(Sequences.nreverse(var6), (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51858(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic159$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)module0811.$ic160$);
        return f51807(var2);
    }
    
    public static SubLObject f51859(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic161$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic161$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic161$);
        var6 = var7.first();
        var7 = var7.rest();
        final SubLObject var8 = (SubLObject)(var7.isCons() ? var7.first() : module0811.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var7, var2, (SubLObject)module0811.$ic161$);
        var7 = var7.rest();
        if (module0811.NIL != var7) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic161$);
            return (SubLObject)module0811.NIL;
        }
        module0035.f2502(var4, (SubLObject)module0811.$ic162$);
        module0812.f52013(var5, (SubLObject)module0811.$ic8$);
        SubLObject var9 = (SubLObject)module0811.NIL;
        final SubLObject var10 = var5;
        assert module0811.NIL != Types.symbolp(var10) : var10;
        final SubLObject var11 = module0809.$g6433$.currentBinding(var3);
        try {
            module0809.$g6433$.bind(var10, var3);
            module0809.f51679(var5);
            module0809.f51684(var5, (SubLObject)module0811.$ic8$);
            final SubLObject var12 = f51788(var6);
            var9 = (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic162$, var5, var12, ConsesLow.append((SubLObject)((module0811.NIL != var8) ? ConsesLow.list(var8) : module0811.NIL), (SubLObject)module0811.NIL));
        }
        finally {
            module0809.$g6433$.rebind(var11, var3);
        }
        return var9;
    }
    
    public static SubLObject f51860(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic164$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic164$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic164$);
        var6 = var7.first();
        final SubLObject var8;
        var7 = (var8 = var7.rest());
        module0035.f2502(var4, (SubLObject)module0811.$ic165$);
        module0812.f52012(var5, var6);
        SubLObject var223_224;
        final SubLObject var221_222 = var223_224 = var8;
        SubLObject var9 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var223_224, var221_222, (SubLObject)module0811.$ic166$);
        var9 = var223_224.first();
        SubLObject var10;
        var223_224 = (var10 = var223_224.rest());
        if (!var9.isString()) {
            var9 = (SubLObject)module0811.NIL;
            var10 = var8;
        }
        SubLObject var11 = (SubLObject)module0811.NIL;
        final SubLObject var12 = var5;
        assert module0811.NIL != Types.symbolp(var12) : var12;
        final SubLObject var13 = module0809.$g6432$.currentBinding(var3);
        try {
            module0809.$g6432$.bind(var12, var3);
            module0809.f51682(var5);
            module0809.f51683(var5, var6);
            final SubLObject var14 = f51806(var6);
            final SubLObject var15 = f51861(var5, var10);
            var11 = (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic165$, var5, var14, ConsesLow.append((SubLObject)((module0811.NIL != var9) ? ConsesLow.list(var9) : module0811.NIL), var15, (SubLObject)module0811.NIL));
        }
        finally {
            module0809.$g6432$.rebind(var13, var3);
        }
        f51814(var5, var2, var11);
        return var11;
    }
    
    public static SubLObject f51862() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0811.$g6443$.getDynamicValue(var1);
    }
    
    public static SubLObject f51861(final SubLObject var220, final SubLObject var23) {
        final SubLThread var221 = SubLProcess.currentSubLThread();
        SubLObject var222 = (SubLObject)module0811.NIL;
        final SubLObject var223 = module0811.$g6443$.currentBinding(var221);
        try {
            module0811.$g6443$.bind(var220, var221);
            var222 = f51863(var23);
            var222 = f51864(var220, var23);
            var222 = f51805(var222);
            var222 = f51865(var222);
        }
        finally {
            module0811.$g6443$.rebind(var223, var221);
        }
        return var222;
    }
    
    public static SubLObject f51863(final SubLObject var23) {
        if (module0811.NIL == var23) {
            return conses_high.copy_tree((SubLObject)module0811.$ic167$);
        }
        final SubLObject var24 = conses_high.last(var23, (SubLObject)module0811.UNPROVIDED);
        final SubLObject var25 = var24.first();
        if (var25.isCons()) {
            SubLObject var27;
            final SubLObject var26 = var27 = var25;
            SubLObject var28 = (SubLObject)module0811.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0811.$ic12$);
            var28 = var27.first();
            final SubLObject var29;
            var27 = (var29 = var27.rest());
            if (module0811.$ic168$ == var28) {
                return var23;
            }
        }
        final SubLObject var30 = conses_high.copy_tree((SubLObject)module0811.$ic167$);
        ConsesLow.rplacd(var24, var30);
        return var23;
    }
    
    public static SubLObject f51864(final SubLObject var220, SubLObject var23) {
        final SubLThread var221 = SubLProcess.currentSubLThread();
        if (module0811.NIL != complex_special_forms.$call_profiling_enabledP$.getDynamicValue(var221)) {
            var23 = reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)module0811.$ic169$, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var220)), ConsesLow.append(var23, (SubLObject)module0811.NIL));
        }
        return var23;
    }
    
    public static SubLObject f51865(SubLObject var24) {
        if (module0811.NIL != f51866(var24)) {
            final SubLObject var25 = (SubLObject)module0811.$ic170$;
            var24 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic171$, var25, ConsesLow.append(var24, (SubLObject)module0811.NIL)));
        }
        return var24;
    }
    
    public static SubLObject f51866(final SubLObject var23) {
        return module0035.f2439((SubLObject)module0811.$ic172$, var23, (SubLObject)module0811.UNPROVIDED);
    }
    
    public static SubLObject f51867(final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(var33.isSymbol() && module0811.NIL != module0035.f2169(var33, (SubLObject)module0811.$ic173$));
    }
    
    public static SubLObject f51868(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic161$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic161$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic161$);
        var6 = var7.first();
        var7 = var7.rest();
        final SubLObject var8 = (SubLObject)(var7.isCons() ? var7.first() : module0811.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var7, var2, (SubLObject)module0811.$ic161$);
        var7 = var7.rest();
        if (module0811.NIL != var7) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic161$);
            return (SubLObject)module0811.NIL;
        }
        module0035.f2502(var4, (SubLObject)module0811.$ic174$);
        module0812.f52013(var5, (SubLObject)module0811.$ic6$);
        SubLObject var9 = (SubLObject)module0811.NIL;
        final SubLObject var10 = var5;
        assert module0811.NIL != Types.symbolp(var10) : var10;
        final SubLObject var11 = module0809.$g6433$.currentBinding(var3);
        try {
            module0809.$g6433$.bind(var10, var3);
            module0809.f51679(var5);
            module0809.f51684(var5, (SubLObject)module0811.$ic6$);
            final SubLObject var12 = f51788(var6);
            var9 = (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic174$, var5, var12, ConsesLow.append((SubLObject)((module0811.NIL != var8) ? ConsesLow.list(var8) : module0811.NIL), (SubLObject)module0811.NIL));
        }
        finally {
            module0809.$g6433$.rebind(var11, var3);
        }
        return var9;
    }
    
    public static SubLObject f51869(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic175$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic175$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic175$);
        var6 = var7.first();
        final SubLObject var8;
        var7 = (var8 = var7.rest());
        module0035.f2502(var4, (SubLObject)module0811.$ic176$);
        SubLObject var241_242;
        final SubLObject var239_240 = var241_242 = var8;
        SubLObject var9 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var241_242, var239_240, (SubLObject)module0811.$ic166$);
        var9 = var241_242.first();
        SubLObject var10;
        var241_242 = (var10 = var241_242.rest());
        if (!var9.isString()) {
            var9 = (SubLObject)module0811.NIL;
            var10 = var8;
        }
        final SubLObject var11 = (SubLObject)module0811.$ic177$;
        final SubLObject var12 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic178$, var6, (SubLObject)module0811.$ic179$, ConsesLow.append(var10, (SubLObject)module0811.NIL)));
        SubLObject var13 = (SubLObject)module0811.NIL;
        final SubLObject var14 = var5;
        assert module0811.NIL != Types.symbolp(var14) : var14;
        final SubLObject var15 = module0809.$g6432$.currentBinding(var3);
        try {
            module0809.$g6432$.bind(var14, var3);
            module0809.f51681(var5);
            module0809.f51683(var5, var6);
            final SubLObject var16 = var11;
            final SubLObject var17 = f51861(var5, var12);
            var13 = (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic180$, var5, var16, ConsesLow.append((SubLObject)((module0811.NIL != var9) ? ConsesLow.list(var9) : module0811.NIL), var17, (SubLObject)module0811.NIL));
        }
        finally {
            module0809.$g6432$.rebind(var15, var3);
        }
        f51814(var5, var2, var13);
        return var13;
    }
    
    public static SubLObject f51870(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic161$);
        var4 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic161$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic161$);
        var6 = var7.first();
        var7 = var7.rest();
        final SubLObject var8 = (SubLObject)(var7.isCons() ? var7.first() : module0811.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var7, var2, (SubLObject)module0811.$ic161$);
        var7 = var7.rest();
        if (module0811.NIL != var7) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic161$);
            return (SubLObject)module0811.NIL;
        }
        module0035.f2502(var4, (SubLObject)module0811.$ic181$);
        module0812.f52013(var5, (SubLObject)module0811.$ic4$);
        SubLObject var9 = (SubLObject)module0811.NIL;
        final SubLObject var10 = var5;
        assert module0811.NIL != Types.symbolp(var10) : var10;
        final SubLObject var11 = module0809.$g6433$.currentBinding(var3);
        try {
            module0809.$g6433$.bind(var10, var3);
            module0809.f51679(var5);
            module0809.f51684(var5, (SubLObject)module0811.$ic4$);
            final SubLObject var12 = f51788(var6);
            var9 = (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic181$, var5, var12, ConsesLow.append((SubLObject)((module0811.NIL != var8) ? ConsesLow.list(var8) : module0811.NIL), (SubLObject)module0811.NIL));
        }
        finally {
            module0809.$g6433$.rebind(var11, var3);
        }
        return var9;
    }
    
    public static SubLObject f51871(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic182$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic182$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic182$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        final SubLObject var8;
        var4 = (var8 = var5);
        module0035.f2502(var3, (SubLObject)module0811.$ic183$);
        final SubLObject var9 = complex_special_forms.defstruct_analyze(var6, var7, var8);
        f51872(var9);
        final SubLObject var10 = reader.bq_cons((SubLObject)module0811.$ic184$, ConsesLow.append(var9, (SubLObject)module0811.NIL));
        final SubLObject var11 = f51793(var2);
        SubLObject var256_257;
        final SubLObject var254_255 = var256_257 = var11;
        SubLObject var3_258 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var256_257, var254_255, (SubLObject)module0811.$ic185$);
        var3_258 = var256_257.first();
        final SubLObject var12;
        var256_257 = (var12 = var256_257.rest());
        module0035.f2502(var3_258, (SubLObject)module0811.$ic94$);
        final SubLObject var13 = (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic94$, var10, ConsesLow.append(var12, (SubLObject)module0811.NIL));
        return var13;
    }
    
    public static SubLObject f51872(final SubLObject var252) {
        final SubLObject var253 = cdestructuring_bind.property_list_member((SubLObject)module0811.$ic186$, var252);
        final SubLObject var254 = (SubLObject)((module0811.NIL != var253) ? conses_high.cadr(var253) : module0811.NIL);
        final SubLObject var255 = cdestructuring_bind.property_list_member((SubLObject)module0811.$ic187$, var252);
        final SubLObject var256 = (SubLObject)((module0811.NIL != var255) ? conses_high.cadr(var255) : module0811.NIL);
        final SubLObject var257 = cdestructuring_bind.property_list_member((SubLObject)module0811.$ic188$, var252);
        final SubLObject var258 = (SubLObject)((module0811.NIL != var257) ? conses_high.cadr(var257) : module0811.NIL);
        final SubLObject var259 = cdestructuring_bind.property_list_member((SubLObject)module0811.$ic189$, var252);
        final SubLObject var260 = (SubLObject)((module0811.NIL != var259) ? conses_high.cadr(var259) : module0811.NIL);
        final SubLObject var261 = cdestructuring_bind.property_list_member((SubLObject)module0811.$ic190$, var252);
        final SubLObject var262 = (SubLObject)((module0811.NIL != var261) ? conses_high.cadr(var261) : module0811.NIL);
        final SubLObject var263 = cdestructuring_bind.property_list_member((SubLObject)module0811.$ic191$, var252);
        final SubLObject var264 = (SubLObject)((module0811.NIL != var263) ? conses_high.cadr(var263) : module0811.NIL);
        final SubLObject var265 = cdestructuring_bind.property_list_member((SubLObject)module0811.$ic192$, var252);
        final SubLObject var266 = (SubLObject)((module0811.NIL != var265) ? conses_high.cadr(var265) : module0811.NIL);
        final SubLObject var267 = cdestructuring_bind.property_list_member((SubLObject)module0811.$ic193$, var252);
        SubLObject var268 = (SubLObject)((module0811.NIL != var267) ? conses_high.cadr(var267) : module0811.NIL);
        if (module0811.NIL == var268) {
            var268 = (SubLObject)module0811.$ic194$;
        }
        f51788((SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var254));
        f51788((SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var258));
        f51788((SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var256));
        f51788((SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var260));
        f51788((SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var262));
        f51788((SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var264));
        f51788((SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var266));
        f51788((SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var268));
        SubLObject var269;
        SubLObject var270;
        for (var269 = Numbers.add((SubLObject)module0811.TWO_INTEGER, Sequences.length(var260)), var270 = (SubLObject)module0811.NIL, var270 = (SubLObject)module0811.TWO_INTEGER; !var270.numGE(var269); var270 = module0048.f_1X(var270)) {
            f51788((SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var270));
        }
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51873(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic195$);
        var4 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic195$);
        var5 = var6.first();
        var6 = var6.rest();
        final SubLObject var7 = (SubLObject)(var6.isCons() ? var6.first() : module0811.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var2, (SubLObject)module0811.$ic195$);
        var6 = var6.rest();
        final SubLObject var8 = (SubLObject)(var6.isCons() ? var6.first() : module0811.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var2, (SubLObject)module0811.$ic195$);
        var6 = var6.rest();
        if (module0811.NIL != var6) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic195$);
            return (SubLObject)module0811.NIL;
        }
        module0035.f2502(var4, (SubLObject)module0811.$ic196$);
        module0812.f52013(var5, (SubLObject)module0811.$ic4$);
        SubLObject var9 = (SubLObject)module0811.NIL;
        final SubLObject var10 = var5;
        assert module0811.NIL != Types.symbolp(var10) : var10;
        final SubLObject var11 = module0809.$g6433$.currentBinding(var3);
        try {
            module0809.$g6433$.bind(var10, var3);
            module0809.f51679(var5);
            module0809.f51684(var5, (SubLObject)module0811.$ic4$);
            final SubLObject var12 = f51788(var7);
            var9 = (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic196$, var5, var12, ConsesLow.append((SubLObject)((module0811.NIL != var8) ? ConsesLow.list(var8) : module0811.NIL), (SubLObject)module0811.NIL));
        }
        finally {
            module0809.$g6433$.rebind(var11, var3);
        }
        return var9;
    }
    
    public static SubLObject f51819(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic197$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic197$);
        var4 = var5.first();
        var5 = var5.rest();
        if (module0811.NIL == var5) {
            module0035.f2502(var3, (SubLObject)module0811.$ic35$);
            final SubLObject var6 = f51788(var4);
            return module0814.f52169((SubLObject)ConsesLow.list((SubLObject)module0811.$ic35$, var6));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic197$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51874(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic81$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic81$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic81$);
        var5 = var6.first();
        var6 = var6.rest();
        if (module0811.NIL == var6) {
            module0035.f2502(var3, (SubLObject)module0811.$ic198$);
            module0809.f51689(var5);
            final SubLObject var7 = f51788(var4);
            final SubLObject var8 = f51800(var5);
            f51788((SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var5));
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic199$, var7, var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic81$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51875(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var2_288 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic200$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic200$);
        var2_288 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic200$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic201$);
        return f51853((SubLObject)ConsesLow.list((SubLObject)module0811.$ic119$, var2_288, (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic202$, var4, ConsesLow.append(var6, (SubLObject)module0811.NIL))));
    }
    
    public static SubLObject f51876(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic203$);
        var3 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic203$);
        var4 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic203$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic203$);
        var6 = var7.first();
        var7 = var7.rest();
        if (module0811.NIL == var7) {
            module0035.f2502(var3, (SubLObject)module0811.$ic204$);
            final SubLObject var8 = f51819((SubLObject)ConsesLow.list((SubLObject)module0811.$ic35$, var4));
            final SubLObject var9 = f51788(var5);
            final SubLObject var10 = f51788(var6);
            return module0814.f52168((SubLObject)ConsesLow.list((SubLObject)module0811.$ic204$, var8, var9, var10));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic203$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51877(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic205$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic205$);
        var4 = var5.first();
        var5 = var5.rest();
        if (module0811.NIL == var5) {
            module0035.f2502(var3, (SubLObject)module0811.$ic206$);
            return f51788((SubLObject)ConsesLow.list((SubLObject)module0811.$ic207$, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var4)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic205$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51878(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic208$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic208$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic208$);
        var5 = var6.first();
        var6 = var6.rest();
        if (module0811.NIL == var6) {
            module0035.f2502(var3, (SubLObject)module0811.$ic209$);
            return f51876((SubLObject)ConsesLow.list((SubLObject)module0811.$ic204$, var4, (SubLObject)module0811.NIL, var5));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic208$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51879(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic210$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic210$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic210$);
        var5 = var6.first();
        var6 = var6.rest();
        if (module0811.NIL == var6) {
            module0035.f2502(var3, (SubLObject)module0811.$ic211$);
            return f51876((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic204$, var4, var5, (SubLObject)module0811.$ic212$));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic210$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51880(final SubLObject var2) {
        return f51807(var2);
    }
    
    public static SubLObject f51881(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic213$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic213$);
        var4 = var5.first();
        var5 = var5.rest();
        if (module0811.NIL == var5) {
            module0035.f2502(var3, (SubLObject)module0811.$ic214$);
            final SubLObject var6 = f51788(var4);
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic214$, var6);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic213$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51882(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var2_309 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic200$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic200$);
        var2_309 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic200$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic215$);
        return f51853((SubLObject)ConsesLow.list((SubLObject)module0811.$ic119$, (SubLObject)module0811.$ic216$, (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic201$, var2_309, var4, ConsesLow.append(var6, (SubLObject)module0811.NIL))));
    }
    
    public static SubLObject f51883(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic217$);
        var3 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic217$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic217$);
        var5 = var6.first();
        var6 = var6.rest();
        if (module0811.NIL == var6) {
            module0035.f2502(var3, (SubLObject)module0811.$ic218$);
            final SubLObject var7 = f51788(var4);
            final SubLObject var8 = f51788(var5);
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic218$, var7, var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic217$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51884(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic219$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic219$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic220$);
        final SubLObject var7 = (SubLObject)module0811.$ic221$;
        SubLObject var8 = (SubLObject)module0811.NIL;
        SubLObject var9 = var6;
        SubLObject var10 = (SubLObject)module0811.NIL;
        var10 = var9.first();
        while (module0811.NIL != var9) {
            var8 = (SubLObject)ConsesLow.cons(f51885(var7, var10), var8);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return f51832((SubLObject)ConsesLow.list((SubLObject)module0811.$ic70$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var4)), reader.bq_cons((SubLObject)module0811.$ic222$, ConsesLow.append(Sequences.nreverse(var8), (SubLObject)module0811.NIL))));
    }
    
    public static SubLObject f51885(final SubLObject var316, final SubLObject var320) {
        SubLObject var321 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var320, var320, (SubLObject)module0811.$ic223$);
        var321 = var320.first();
        final SubLObject var323;
        final SubLObject var322 = var323 = var320.rest();
        SubLObject var324 = (SubLObject)module0811.NIL;
        if (var321 == module0811.$ic224$) {
            var324 = (SubLObject)module0811.T;
        }
        else if (var321 == module0811.T) {
            Errors.warn((SubLObject)module0811.$ic225$, (SubLObject)((module0811.NIL != f51862()) ? Sequences.cconcatenate((SubLObject)module0811.$ic226$, new SubLObject[] { module0006.f205(f51862()), module0811.$ic227$ }) : module0811.$ic228$));
            var324 = (SubLObject)module0811.T;
        }
        else if (var321.isCons()) {
            SubLObject var325 = (SubLObject)module0811.NIL;
            SubLObject var326 = var321;
            SubLObject var327 = (SubLObject)module0811.NIL;
            var327 = var326.first();
            while (module0811.NIL != var326) {
                var325 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0811.EQL, var316, module0035.f2241(var327)), var325);
                var326 = var326.rest();
                var327 = var326.first();
            }
            var324 = reader.bq_cons((SubLObject)module0811.$ic102$, ConsesLow.append(Sequences.nreverse(var325), (SubLObject)module0811.NIL));
        }
        else {
            var324 = (SubLObject)ConsesLow.list((SubLObject)module0811.EQL, var316, module0035.f2241(var321));
        }
        return reader.bq_cons(var324, ConsesLow.append(var323, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51886(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic229$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)module0811.$ic222$);
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0811.NIL;
        var8 = var7.first();
        while (module0811.NIL != var7) {
            SubLObject var331_332;
            final SubLObject var329_330 = var331_332 = var8;
            SubLObject var9 = (SubLObject)module0811.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var331_332, var329_330, (SubLObject)module0811.$ic230$);
            var9 = var331_332.first();
            final SubLObject var10;
            var331_332 = (var10 = var331_332.rest());
            final SubLObject var11 = f51819((SubLObject)ConsesLow.list((SubLObject)module0811.$ic35$, var9));
            final SubLObject var12 = f51805(var10);
            var6 = (SubLObject)ConsesLow.cons(reader.bq_cons(var11, ConsesLow.append(var12, (SubLObject)module0811.NIL)), var6);
            var7 = var7.rest();
            var8 = var7.first();
        }
        return module0814.f52167(reader.bq_cons((SubLObject)module0811.$ic222$, ConsesLow.append(Sequences.nreverse(var6), (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51887(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic231$);
        var3 = var2.first();
        SubLObject var7 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic231$);
        var4 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic231$);
        var5 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)module0811.$ic231$);
        var6 = var7.first();
        var7 = var7.rest();
        if (module0811.NIL == var7) {
            module0035.f2502(var3, (SubLObject)module0811.$ic232$);
            return f51886((SubLObject)ConsesLow.list((SubLObject)module0811.$ic222$, (SubLObject)ConsesLow.list(var4, var5), (SubLObject)ConsesLow.list((SubLObject)module0811.T, var6)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic231$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51888(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic233$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic233$);
        var4 = var5.first();
        var5 = var5.rest();
        if (module0811.NIL == var5) {
            module0035.f2502(var3, (SubLObject)module0811.$ic158$);
            final SubLObject var6 = Eval.eval(var4);
            SubLObject var7 = (SubLObject)module0811.NIL;
            if (var4.isCons()) {
                SubLObject var343_344;
                final SubLObject var341_342 = var343_344 = var6;
                SubLObject var8 = (SubLObject)module0811.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var343_344, var341_342, (SubLObject)module0811.$ic234$);
                var8 = var343_344.first();
                final SubLObject var9;
                var343_344 = (var9 = var343_344.rest());
                if (module0811.$ic15$ == var8) {
                    SubLObject var348_349;
                    final SubLObject var346_347 = var348_349 = var9;
                    SubLObject var10 = (SubLObject)module0811.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var348_349, var346_347, (SubLObject)module0811.$ic235$);
                    var10 = var348_349.first();
                    final SubLObject var11;
                    var348_349 = (var11 = var348_349.rest());
                    if (module0811.NIL != module0035.f2169(var10, (SubLObject)module0811.$ic236$)) {
                        SubLObject var12 = var11;
                        SubLObject var13 = (SubLObject)module0811.NIL;
                        var13 = var12.first();
                        while (module0811.NIL != var12) {
                            module0812.f52014(var13, var10);
                            var12 = var12.rest();
                            var13 = var12.first();
                        }
                    }
                }
                else if (module0811.$ic13$ == var8) {
                    SubLObject var354_355;
                    final SubLObject var352_353 = var354_355 = var9;
                    SubLObject var10 = (SubLObject)module0811.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var354_355, var352_353, (SubLObject)module0811.$ic237$);
                    var10 = var354_355.first();
                    final SubLObject var14;
                    var354_355 = (var14 = var354_355.rest());
                    if (module0811.NIL != module0035.f2169(var10, (SubLObject)module0811.$ic236$)) {
                        SubLObject var12 = var14;
                        SubLObject var15 = (SubLObject)module0811.NIL;
                        var15 = var12.first();
                        while (module0811.NIL != var12) {
                            module0812.f52015(var15, var10);
                            var12 = var12.rest();
                            var15 = var12.first();
                        }
                    }
                }
                else if (module0811.$ic21$ == var8 || module0811.$ic238$ == var8 || module0811.$ic239$ == var8) {
                    var7 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0811.$ic240$, module0035.f2241(var6)), var7);
                }
            }
            return f51839(reader.bq_cons((SubLObject)module0811.$ic94$, ConsesLow.append(Sequences.nreverse(var7), (SubLObject)module0811.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic233$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51839(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic241$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)module0811.$ic94$);
        final SubLObject var6 = f51805(var5);
        return module0814.f52164(reader.bq_cons((SubLObject)module0811.$ic94$, ConsesLow.append(var6, (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51853(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic242$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic242$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic119$);
        return f51886((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic222$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)module0811.$ic51$, var4), ConsesLow.append(var6, (SubLObject)module0811.NIL)), (SubLObject)module0811.$ic243$));
    }
    
    public static SubLObject f51889(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic242$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic242$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic244$);
        return f51886((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic222$, reader.bq_cons(var4, ConsesLow.append(var6, (SubLObject)module0811.NIL)), (SubLObject)module0811.$ic243$));
    }
    
    public static SubLObject f51890(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic245$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic245$);
        var4 = var5.first();
        var5 = var5.rest();
        if (module0811.NIL != var5) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic245$);
            return (SubLObject)module0811.NIL;
        }
        module0035.f2502(var3, (SubLObject)module0811.$ic83$);
        final SubLObject var6 = module0812.f52007(var4);
        if (var6.eql(var4)) {
            return var2;
        }
        return var6;
    }
    
    public static SubLObject f51891(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic100$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic100$);
        var4 = var5.first();
        var5 = var5.rest();
        if (module0811.NIL == var5) {
            module0035.f2502(var3, (SubLObject)module0811.$ic168$);
            if (module0811.NIL != f51787()) {
                module0812.f52016(f51862());
                f51788((SubLObject)module0811.$ic246$);
            }
            final SubLObject var6 = f51788(var4);
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic168$, var6);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic100$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51892(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic247$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic247$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic248$);
        final SubLObject var7 = f51788(var4);
        final SubLObject var8 = f51821(var6);
        final SubLObject var9 = (SubLObject)module0811.$ic249$;
        final SubLObject var10 = (SubLObject)module0811.$ic250$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic251$, (SubLObject)ConsesLow.list(var7, var9, var10), ConsesLow.append(var8, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51893(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic145$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic145$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic252$);
        final SubLObject var7 = (SubLObject)module0811.$ic253$;
        final SubLObject var8 = f51821(var6);
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic254$, var7, var4, ConsesLow.append(var8, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51894(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic241$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)module0811.$ic255$);
        return f51826((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic52$, (SubLObject)module0811.$ic256$, ConsesLow.append(var5, (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51895(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic241$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)module0811.$ic257$);
        return f51826((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic52$, (SubLObject)module0811.$ic258$, ConsesLow.append(var5, (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51896(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic241$);
        var3 = var2.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        module0035.f2502(var3, (SubLObject)module0811.$ic259$);
        return f51826((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic52$, (SubLObject)module0811.$ic260$, ConsesLow.append(var5, (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51897(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic261$);
        var4 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic261$);
        var5 = var6.first();
        final SubLObject var7;
        var6 = (var7 = var6.rest());
        module0035.f2502(var4, (SubLObject)module0811.$ic90$);
        if (module0811.NIL == var5) {
            return f51839(reader.bq_cons((SubLObject)module0811.$ic94$, ConsesLow.append(var7, (SubLObject)module0811.NIL)));
        }
        SubLObject var8 = (SubLObject)module0811.NIL;
        final SubLObject var9 = f51821(var7);
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)module0811.NIL;
        var11 = var10.first();
        while (module0811.NIL != var10) {
            SubLObject var389_390;
            final SubLObject var387_388 = var389_390 = var11;
            SubLObject var12 = (SubLObject)module0811.NIL;
            SubLObject var13 = (SubLObject)module0811.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var389_390, var387_388, (SubLObject)module0811.$ic262$);
            var12 = var389_390.first();
            var389_390 = var389_390.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var389_390, var387_388, (SubLObject)module0811.$ic262$);
            var13 = var389_390.first();
            var389_390 = var389_390.rest();
            if (module0811.NIL == var389_390) {
                module0809.f51687(var12);
                final SubLObject var14 = f51799(var12);
                final SubLObject var15 = f51788(var13);
                var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var14, var15), var8);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var387_388, (SubLObject)module0811.$ic262$);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return module0814.f52166((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic90$, Sequences.nreverse(var8), ConsesLow.append(var9, (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51832(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic263$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic263$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic70$);
        if (module0811.NIL == var4) {
            return f51839(reader.bq_cons((SubLObject)module0811.$ic94$, ConsesLow.append(var6, (SubLObject)module0811.NIL)));
        }
        SubLObject var7 = (SubLObject)module0811.NIL;
        final SubLObject var8 = f51805(var6);
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0811.NIL;
        var10 = var9.first();
        while (module0811.NIL != var9) {
            SubLObject var397_398;
            final SubLObject var395_396 = var397_398 = var10;
            SubLObject var11 = (SubLObject)module0811.NIL;
            SubLObject var12 = (SubLObject)module0811.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var397_398, var395_396, (SubLObject)module0811.$ic262$);
            var11 = var397_398.first();
            var397_398 = var397_398.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var397_398, var395_396, (SubLObject)module0811.$ic262$);
            var12 = var397_398.first();
            var397_398 = var397_398.rest();
            if (module0811.NIL == var397_398) {
                final SubLObject var13 = f51799(var11);
                final SubLObject var14 = f51788(var12);
                var7 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var13, var14), var7);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var395_396, (SubLObject)module0811.$ic262$);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        return module0814.f52165((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic70$, Sequences.nreverse(var7), ConsesLow.append(var8, (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51898(final SubLObject var2) {
        return var2;
    }
    
    public static SubLObject f51899(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic264$);
        var3 = var2.first();
        SubLObject var8 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)module0811.$ic264$);
        var4 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)module0811.$ic264$);
        var5 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)module0811.$ic264$);
        var6 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)module0811.$ic264$);
        var7 = var8.first();
        var8 = var8.rest();
        if (module0811.NIL != var8) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic264$);
            return (SubLObject)module0811.NIL;
        }
        module0035.f2502(var3, (SubLObject)module0811.$ic265$);
        if (module0811.NIL != var4 && !module0811.areAssertionsDisabledFor(me) && module0811.NIL == Types.integerp(var4)) {
            throw new AssertionError(var4);
        }
        assert module0811.NIL != Types.integerp(var5) : var5;
        assert module0811.NIL != Types.symbolp(var6) : var6;
        assert module0811.NIL != Types.symbolp(var7) : var7;
        final SubLObject var9 = f51799(var6);
        return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic265$, var4, var5, var9, var7);
    }
    
    public static SubLObject f51900(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic267$);
        var3 = var2.first();
        SubLObject var8 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)module0811.$ic267$);
        var4 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)module0811.$ic267$);
        var5 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)module0811.$ic267$);
        var6 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)module0811.$ic267$);
        var7 = var8.first();
        var8 = var8.rest();
        if (module0811.NIL != var8) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic267$);
            return (SubLObject)module0811.NIL;
        }
        module0035.f2502(var3, (SubLObject)module0811.$ic268$);
        assert module0811.NIL != Types.symbolp(var6) : var6;
        assert module0811.NIL != Types.symbolp(var7) : var7;
        final SubLObject var9 = f51788(var4);
        return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic268$, var9, var5, var6, var7);
    }
    
    public static SubLObject f51901(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic269$);
        var3 = var2.first();
        SubLObject var8 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)module0811.$ic269$);
        var4 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)module0811.$ic269$);
        var5 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)module0811.$ic269$);
        var6 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var2, (SubLObject)module0811.$ic269$);
        var7 = var8.first();
        var8 = var8.rest();
        if (module0811.NIL != var8) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic269$);
            return (SubLObject)module0811.NIL;
        }
        module0035.f2502(var3, (SubLObject)module0811.$ic270$);
        if (module0811.NIL != var5 && !module0811.areAssertionsDisabledFor(me) && module0811.NIL == Types.integerp(var5)) {
            throw new AssertionError(var5);
        }
        assert module0811.NIL != Types.symbolp(var6) : var6;
        assert module0811.NIL != Types.symbolp(var7) : var7;
        final SubLObject var9 = f51788(var4);
        final SubLObject var10 = f51799(var6);
        return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic270$, var9, var5, var10, var7);
    }
    
    public static SubLObject f51902(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = (SubLObject)module0811.NIL;
        SubLObject var8 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic271$);
        var3 = var2.first();
        SubLObject var9 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var2, (SubLObject)module0811.$ic271$);
        var4 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var2, (SubLObject)module0811.$ic271$);
        var5 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var2, (SubLObject)module0811.$ic271$);
        var6 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var2, (SubLObject)module0811.$ic271$);
        var7 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var2, (SubLObject)module0811.$ic271$);
        var8 = var9.first();
        var9 = var9.rest();
        if (module0811.NIL != var9) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic271$);
            return (SubLObject)module0811.NIL;
        }
        module0035.f2502(var3, (SubLObject)module0811.$ic272$);
        assert module0811.NIL != Types.symbolp(var7) : var7;
        assert module0811.NIL != Types.symbolp(var8) : var8;
        final SubLObject var10 = f51788(var4);
        final SubLObject var11 = f51788(var6);
        return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic272$, var10, var5, var11, var7, var8);
    }
    
    public static SubLObject f51903(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic273$);
        var3 = var2.first();
        SubLObject var4 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic273$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0811.NIL;
        SubLObject var7 = (SubLObject)module0811.NIL;
        SubLObject var8 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic273$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic273$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var2, (SubLObject)module0811.$ic273$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0811.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            module0035.f2502(var3, (SubLObject)module0811.$ic53$);
            final SubLObject var10 = f51805(var6);
            final SubLObject var11 = f51788(var7);
            final SubLObject var12 = f51805(var8);
            final SubLObject var13 = f51805(var9);
            return module0814.f52177((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic53$, (SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic35$, var11), var12), ConsesLow.append(var13, (SubLObject)module0811.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic273$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51834(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic274$);
        var4 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic274$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0811.NIL;
        SubLObject var8 = (SubLObject)module0811.NIL;
        SubLObject var9 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic274$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic274$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic274$);
        var9 = var5.first();
        var5 = var5.rest();
        if (module0811.NIL == var5) {
            final SubLObject var10;
            var5 = (var10 = var6);
            module0035.f2502(var4, (SubLObject)module0811.$ic71$);
            var3.resetMultipleValues();
            final SubLObject var11 = f51904(var7);
            final SubLObject var12 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            return f51826((SubLObject)ConsesLow.list((SubLObject)module0811.$ic52$, var11, (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic53$, (SubLObject)ConsesLow.list(var12, var8, var9), ConsesLow.append(var10, (SubLObject)module0811.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic274$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51904(final SubLObject var133) {
        SubLObject var134 = (SubLObject)module0811.NIL;
        SubLObject var135 = (SubLObject)module0811.NIL;
        SubLObject var136 = var133;
        SubLObject var137 = (SubLObject)module0811.NIL;
        var137 = var136.first();
        while (module0811.NIL != var136) {
            SubLObject var139;
            final SubLObject var138 = var139 = var137;
            SubLObject var140 = (SubLObject)module0811.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var139, var138, (SubLObject)module0811.$ic275$);
            var140 = var139.first();
            var139 = var139.rest();
            final SubLObject var141 = (SubLObject)(var139.isCons() ? var139.first() : module0811.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var139, var138, (SubLObject)module0811.$ic275$);
            var139 = var139.rest();
            if (module0811.NIL == var139) {
                var134 = (SubLObject)ConsesLow.cons(var140, var134);
                var135 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var140, var141), var135);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var138, (SubLObject)module0811.$ic275$);
            }
            var136 = var136.rest();
            var137 = var136.first();
        }
        return Values.values(Sequences.nreverse(var134), Sequences.nreverse(var135));
    }
    
    public static SubLObject f51905(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic276$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic276$);
        var4 = var5.first();
        var5 = var5.rest();
        if (module0811.NIL != var5) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic276$);
            return (SubLObject)module0811.NIL;
        }
        module0035.f2502(var3, (SubLObject)module0811.$ic277$);
        if (module0811.NIL != f51862()) {
            return f51848((SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, (SubLObject)module0811.$ic278$, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic279$, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic83$, var4))));
        }
        return var2;
    }
    
    public static SubLObject f51906(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0811.NIL;
        SubLObject var5 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic280$);
        var4 = var2.first();
        SubLObject var6 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var2, (SubLObject)module0811.$ic280$);
        var5 = var6.first();
        var6 = var6.rest();
        if (module0811.NIL == var6) {
            module0035.f2502(var4, (SubLObject)module0811.$ic99$);
            final SubLObject var7 = f51788(var5);
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic99$, var7);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0811.$ic280$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51907(final SubLObject var2) {
        return var2;
    }
    
    public static SubLObject f51908(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic281$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic281$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic282$);
        final SubLObject var7 = (SubLObject)ConsesLow.list((SubLObject)module0811.$ic51$, var4);
        return f51909((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic283$, var7, ConsesLow.append(var6, (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51909(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0811.NIL;
        SubLObject var4 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var2, var2, (SubLObject)module0811.$ic281$);
        var3 = var2.first();
        SubLObject var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var2, (SubLObject)module0811.$ic281$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0811.$ic283$);
        final SubLObject var7 = f51788(var4);
        final SubLObject var8 = f51805(var6);
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic283$, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic35$, var7), ConsesLow.append(var8, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51910(final SubLObject var33) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var33.isSymbol() && module0811.NIL != module0035.sublisp_boolean(module0035.f2294(module0811.$g6444$.getGlobalValue(), var33, Symbols.symbol_function((SubLObject)module0811.EQ), (SubLObject)module0811.UNPROVIDED)));
    }
    
    public static SubLObject f51911(final SubLObject var22) {
        return module0035.f2294(module0811.$g6444$.getGlobalValue(), var22, Symbols.symbol_function((SubLObject)module0811.EQ), (SubLObject)module0811.UNPROVIDED);
    }
    
    public static SubLObject f51790(SubLObject var2) {
        if (module0811.NIL != f51910(var2)) {
            var2 = f51911(var2);
        }
        else if (var2.isCons()) {
            SubLObject var4;
            final SubLObject var3 = var4 = var2;
            SubLObject var5 = (SubLObject)module0811.NIL;
            SubLObject var6 = (SubLObject)module0811.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0811.$ic284$);
            var5 = var4.first();
            var4 = (var6 = var4.rest());
            if (module0811.NIL != f51910(var5)) {
                var5 = f51911(var5);
                var2 = reader.bq_cons(var5, ConsesLow.append(var6, (SubLObject)module0811.NIL));
            }
        }
        return var2;
    }
    
    public static SubLObject f51912(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic285$);
        var441 = var440.first();
        final SubLObject var442;
        var440 = (var442 = var440.rest());
        if (module0811.NIL == var441) {
            return reader.bq_cons((SubLObject)module0811.$ic94$, ConsesLow.append(var442, (SubLObject)module0811.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic52$, var441, ConsesLow.append(var442, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51913(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic286$);
        var441 = var440.first();
        final SubLObject var442;
        var440 = (var442 = var440.rest());
        if (module0811.NIL == var441) {
            return reader.bq_cons((SubLObject)module0811.$ic94$, ConsesLow.append(var442, (SubLObject)module0811.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic52$, var441, ConsesLow.append(var442, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51914(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)module0811.NIL;
        SubLObject var442 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic287$);
        var441 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic287$);
        var442 = var440.first();
        var440 = var440.rest();
        if (module0811.NIL == var440) {
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var441, var442);
        }
        cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)module0811.$ic287$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51915(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)module0811.NIL;
        SubLObject var442 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic287$);
        var441 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic287$);
        var442 = var440.first();
        var440 = var440.rest();
        if (module0811.NIL == var440) {
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var441, var442);
        }
        cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)module0811.$ic287$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51916(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)module0811.NIL;
        SubLObject var442 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic287$);
        var441 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic287$);
        var442 = var440.first();
        var440 = var440.rest();
        if (module0811.NIL == var440) {
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic49$, var441, var442);
        }
        cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)module0811.$ic287$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51917(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic288$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)module0811.NIL;
        SubLObject var443 = (SubLObject)module0811.NIL;
        SubLObject var444 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic288$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic288$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic288$);
        var444 = var440.first();
        var440 = var440.rest();
        if (module0811.NIL == var440) {
            final SubLObject var445;
            var440 = (var445 = var441);
            return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic52$, var442, (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic283$, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic51$, var443), ConsesLow.append(var445, var444, (SubLObject)module0811.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)module0811.$ic288$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51918(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic289$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)module0811.NIL;
        SubLObject var443 = (SubLObject)module0811.NIL;
        SubLObject var444 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic289$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic289$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic289$);
        var444 = var440.first();
        var440 = var440.rest();
        if (module0811.NIL == var440) {
            final SubLObject var445;
            var440 = (var445 = var441);
            return reader.bq_cons((SubLObject)module0811.$ic94$, ConsesLow.append(var442, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0811.$ic283$, (SubLObject)ConsesLow.list((SubLObject)module0811.$ic51$, var443), ConsesLow.append(var445, var444, (SubLObject)module0811.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)module0811.$ic289$);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51919(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic290$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)module0811.NIL;
        SubLObject var443 = (SubLObject)module0811.NIL;
        SubLObject var444 = (SubLObject)module0811.NIL;
        SubLObject var445 = (SubLObject)module0811.NIL;
        SubLObject var446 = (SubLObject)module0811.NIL;
        SubLObject var447 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic290$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic290$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic290$);
        var444 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic290$);
        var445 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic290$);
        var446 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic290$);
        var447 = var440.first();
        var440 = var440.rest();
        if (module0811.NIL != var440) {
            cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)module0811.$ic290$);
            return (SubLObject)module0811.NIL;
        }
        final SubLObject var448;
        var440 = (var448 = var441);
        assert module0811.NIL != Types.symbolp(var446) : var446;
        assert module0811.NIL != Types.symbolp(var447) : var447;
        return (SubLObject)ConsesLow.list((SubLObject)module0811.$ic52$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var445, var444)), (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic63$, (SubLObject)ConsesLow.list(var442, var443, var445), ConsesLow.append(var448, (SubLObject)module0811.NIL)));
    }
    
    public static SubLObject f51920(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic291$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)module0811.NIL;
        SubLObject var443 = (SubLObject)module0811.NIL;
        SubLObject var444 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic291$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic291$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic291$);
        var444 = var440.first();
        var440 = var440.rest();
        if (module0811.NIL != var440) {
            cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)module0811.$ic291$);
            return (SubLObject)module0811.NIL;
        }
        final SubLObject var445;
        var440 = (var445 = var441);
        assert module0811.NIL != Types.symbolp(var444) : var444;
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic39$, var442, var443, ConsesLow.append(var445, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51921(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)module0811.NIL;
        SubLObject var442 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic292$);
        var441 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic292$);
        var442 = var440.first();
        final SubLObject var443;
        var440 = (var443 = var440.rest());
        assert module0811.NIL != Types.symbolp(var441) : var441;
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic153$, var442, ConsesLow.append(var443, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51922(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic293$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)module0811.NIL;
        SubLObject var443 = (SubLObject)module0811.NIL;
        SubLObject var444 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic293$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic293$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic293$);
        var444 = var440.first();
        var440 = var440.rest();
        if (module0811.NIL != var440) {
            cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)module0811.$ic293$);
            return (SubLObject)module0811.NIL;
        }
        final SubLObject var445;
        var440 = (var445 = var441);
        assert module0811.NIL != Types.symbolp(var444) : var444;
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic108$, var442, var443, ConsesLow.append(var445, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51923(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic294$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)module0811.NIL;
        SubLObject var443 = (SubLObject)module0811.NIL;
        SubLObject var444 = (SubLObject)module0811.NIL;
        SubLObject var445 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic294$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic294$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic294$);
        var444 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic294$);
        var445 = var440.first();
        var440 = var440.rest();
        if (module0811.NIL != var440) {
            cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)module0811.$ic294$);
            return (SubLObject)module0811.NIL;
        }
        final SubLObject var446;
        var440 = (var446 = var441);
        assert module0811.NIL != Types.symbolp(var444) : var444;
        assert module0811.NIL != Types.symbolp(var445) : var445;
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic57$, (SubLObject)ConsesLow.list(var442, var443), ConsesLow.append(var446, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51924(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic295$);
        final SubLObject var441 = var440.rest();
        var440 = var440.first();
        SubLObject var442 = (SubLObject)module0811.NIL;
        SubLObject var443 = (SubLObject)module0811.NIL;
        SubLObject var444 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic295$);
        var442 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic295$);
        var443 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic295$);
        var444 = var440.first();
        var440 = var440.rest();
        if (module0811.NIL != var440) {
            cdestructuring_bind.cdestructuring_bind_error(var439, (SubLObject)module0811.$ic295$);
            return (SubLObject)module0811.NIL;
        }
        final SubLObject var445;
        var440 = (var445 = var441);
        assert module0811.NIL != Types.symbolp(var443) : var443;
        assert module0811.NIL != Types.symbolp(var444) : var444;
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic248$, var442, ConsesLow.append(var445, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51925(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)module0811.NIL;
        SubLObject var442 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic296$);
        var441 = var440.first();
        var440 = var440.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic296$);
        var442 = var440.first();
        final SubLObject var443;
        var440 = (var443 = var440.rest());
        assert module0811.NIL != Types.symbolp(var441) : var441;
        assert module0811.NIL != Types.symbolp(var442) : var442;
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic252$, var442, ConsesLow.append(var443, (SubLObject)module0811.NIL));
    }
    
    public static SubLObject f51926(final SubLObject var437, final SubLObject var438) {
        SubLObject var440;
        final SubLObject var439 = var440 = var437.rest();
        SubLObject var441 = (SubLObject)module0811.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var440, var439, (SubLObject)module0811.$ic297$);
        var441 = var440.first();
        final SubLObject var442;
        var440 = (var442 = var440.rest());
        assert module0811.NIL != Types.symbolp(var441) : var441;
        return (SubLObject)ConsesLow.listS((SubLObject)module0811.$ic52$, (SubLObject)ConsesLow.list(reader.bq_cons(var441, (SubLObject)module0811.$ic298$)), ConsesLow.append(var442, (SubLObject)module0811.NIL));
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
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51928() {
        module0811.$g6440$ = SubLFiles.defparameter("S#56672", (SubLObject)module0811.NIL);
        module0811.$g6441$ = SubLFiles.defvar("S#56673", (SubLObject)module0811.NIL);
        module0811.$g6442$ = SubLFiles.deflexical("S#56674", (SubLObject)module0811.$ic32$);
        module0811.$g6443$ = SubLFiles.defparameter("S#56675", (SubLObject)module0811.NIL);
        module0811.$g6444$ = SubLFiles.deflexical("S#56676", (SubLObject)module0811.NIL);
        return (SubLObject)module0811.NIL;
    }
    
    public static SubLObject f51929() {
        module0012.f419((SubLObject)module0811.$ic172$);
        return (SubLObject)module0811.NIL;
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
        module0811.$g6440$ = null;
        module0811.$g6441$ = null;
        module0811.$g6442$ = null;
        module0811.$g6443$ = null;
        module0811.$g6444$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("SL2C");
        $ic1$ = SubLObjectFactory.makeString("unexpected form : ~S");
        $ic2$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic3$ = SubLObjectFactory.makeKeyword("LOCAL");
        $ic4$ = SubLObjectFactory.makeKeyword("DYNAMIC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#56677", "CYC");
        $ic6$ = SubLObjectFactory.makeKeyword("LEXICAL");
        $ic7$ = SubLObjectFactory.makeSymbol("S#56678", "CYC");
        $ic8$ = SubLObjectFactory.makeKeyword("CONSTANT");
        $ic9$ = SubLObjectFactory.makeString("Unexpected binding type ~S for variable ~S");
        $ic10$ = SubLObjectFactory.makeString("time to implement ~S");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("VACCESS");
        $ic14$ = SubLObjectFactory.makeSymbol("PROTECTED");
        $ic15$ = SubLObjectFactory.makeSymbol("FACCESS");
        $ic16$ = SubLObjectFactory.makeSymbol("PRIVATE");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56679", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DYNAMIC"), (SubLObject)SubLObjectFactory.makeKeyword("LEXICAL"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"));
        $ic20$ = SubLObjectFactory.makeKeyword("BINDING-TYPE");
        $ic21$ = SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL");
        $ic22$ = SubLObjectFactory.makeInteger(50);
        $ic23$ = SubLObjectFactory.makeString("Method ~S undergoes a ~Sx expansion when translated");
        $ic24$ = SubLObjectFactory.makeSymbol(">");
        $ic25$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic26$ = SubLObjectFactory.makeString("~%Total forms :           ~S");
        $ic27$ = SubLObjectFactory.makeString("~%Mean form size :        ~S");
        $ic28$ = SubLObjectFactory.makeString("~%Mean expansion factor : ~Sx");
        $ic29$ = SubLObjectFactory.makeString("~%Largest expansions :");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("S#56680", "CYC"));
        $ic31$ = SubLObjectFactory.makeString("~%~4,' Dx  ~S");
        $ic32$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56563", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CCATCH"), (SubLObject)SubLObjectFactory.makeSymbol("S#56564", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDEC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56567", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)SubLObjectFactory.makeSymbol("S#56568", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDO-ALL-SYMBOLS"), (SubLObject)SubLObjectFactory.makeSymbol("S#56681", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDO-EXTERNAL-SYMBOLS"), (SubLObject)SubLObjectFactory.makeSymbol("S#56682", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56668", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56569", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDO-SYMBOLS"), (SubLObject)SubLObjectFactory.makeSymbol("S#56570", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56571", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDOHASH"), (SubLObject)SubLObjectFactory.makeSymbol("S#56572", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)SubLObjectFactory.makeSymbol("S#56573", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)SubLObjectFactory.makeSymbol("S#56574", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56575", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56576", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)SubLObjectFactory.makeSymbol("S#56577", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56580", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("S#56582", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("S#56583", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CPOP"), (SubLObject)SubLObjectFactory.makeSymbol("S#56584", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CPROGV"), (SubLObject)SubLObjectFactory.makeSymbol("S#56585", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("S#56586", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("S#56587", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)SubLObjectFactory.makeSymbol("S#56588", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#56590", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)SubLObjectFactory.makeSymbol("S#56593", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CTIME"), (SubLObject)SubLObjectFactory.makeSymbol("S#56594", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CUNWIND-PROTECT"), (SubLObject)SubLObjectFactory.makeSymbol("S#56595", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CVS-ID"), (SubLObject)SubLObjectFactory.makeSymbol("S#56596", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DECLAIM"), (SubLObject)SubLObjectFactory.makeSymbol("S#56597", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DECLARE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56598", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFCONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("S#56599", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56600", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFLEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#56608", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFMACRO"), (SubLObject)SubLObjectFactory.makeSymbol("S#56609", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFPARAMETER"), (SubLObject)SubLObjectFactory.makeSymbol("S#56610", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFSTRUCT"), (SubLObject)SubLObjectFactory.makeSymbol("S#56611", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFVAR"), (SubLObject)SubLObjectFactory.makeSymbol("S#56613", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56683", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56614", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ENFORCE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56615", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ENFORCE-MUST"), (SubLObject)SubLObjectFactory.makeSymbol("S#56616", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("S#56617", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#56618", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("S#56619", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("S#56620", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56621", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("S#56622", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)SubLObjectFactory.makeSymbol("S#56623", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NTH-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56624", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56625", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)SubLObjectFactory.makeSymbol("S#56627", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("S#56628", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PROCLAIM"), (SubLObject)SubLObjectFactory.makeSymbol("S#56629", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)SubLObjectFactory.makeSymbol("S#56630", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("S#56631", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("S#56632", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56633", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("S#56634", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WITH-ERROR-HANDLER"), (SubLObject)SubLObjectFactory.makeSymbol("S#56635", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WITH-PROCESS-RESOURCE-TRACKING"), (SubLObject)SubLObjectFactory.makeSymbol("S#56636", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WITH-STATIC-AREA"), (SubLObject)SubLObjectFactory.makeSymbol("S#56637", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WITH-THREAD-PRIVATE-AREA"), (SubLObject)SubLObjectFactory.makeSymbol("S#56638", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WITH-WORKING-AREA"), (SubLObject)SubLObjectFactory.makeSymbol("S#56639", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VOLATILE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56684", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56658", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56640", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56659", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56641", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#51", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56642", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56660", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56685", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56661", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56686", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56662", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56687", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP"), (SubLObject)SubLObjectFactory.makeSymbol("S#56643", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP"), (SubLObject)SubLObjectFactory.makeSymbol("S#56644", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP"), (SubLObject)SubLObjectFactory.makeSymbol("S#56645", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP"), (SubLObject)SubLObjectFactory.makeSymbol("S#56646", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56663", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56647", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#1538", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56648", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("IN-PACKAGE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56650", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56688", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56651", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#56689", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56652", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("UNTIL"), (SubLObject)SubLObjectFactory.makeSymbol("S#56653", "CYC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56654", "CYC")) });
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#56690", "CYC"));
        $ic34$ = SubLObjectFactory.makeSymbol("CAND");
        $ic35$ = SubLObjectFactory.makeSymbol("S#56683", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#56691", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#56692", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#150", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#768", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic39$ = SubLObjectFactory.makeSymbol("CCATCH");
        $ic40$ = SubLObjectFactory.makeUninternedSymbol("US#4A777B9");
        $ic41$ = SubLObjectFactory.makeSymbol("S#56665", "CYC");
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#126", "CYC"), (SubLObject)module0811.ONE_INTEGER));
        $ic43$ = SubLObjectFactory.makeSymbol("CDEC");
        $ic44$ = SubLObjectFactory.makeSymbol("CSETF");
        $ic45$ = SubLObjectFactory.makeSymbol("-");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9958", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic47$ = SubLObjectFactory.makeSymbol("CDO");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56693", "CYC"), (SubLObject)module0811.NIL, (SubLObject)SubLObjectFactory.makeSymbol("S#56694", "CYC")));
        $ic49$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC"));
        $ic51$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic52$ = SubLObjectFactory.makeSymbol("CLET");
        $ic53$ = SubLObjectFactory.makeSymbol("S#56663", "CYC");
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56695", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("PACKAGE"), (SubLObject)SubLObjectFactory.makeSymbol("S#5090", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic55$ = SubLObjectFactory.makeSymbol("S#56668", "CYC");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56695", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("PACKAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic57$ = SubLObjectFactory.makeSymbol("CDO-SYMBOLS");
        $ic58$ = SubLObjectFactory.makeUninternedSymbol("US#7BBB86A");
        $ic59$ = SubLObjectFactory.makeUninternedSymbol("US#679697F");
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#704", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#705", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5090", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8600", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic61$ = SubLObjectFactory.makeSymbol("S#56664", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#704", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#705", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic63$ = SubLObjectFactory.makeSymbol("CDOHASH");
        $ic64$ = SubLObjectFactory.makeUninternedSymbol("US#283FEB8");
        $ic65$ = SubLObjectFactory.makeUninternedSymbol("US#1A45F57");
        $ic66$ = SubLObjectFactory.makeUninternedSymbol("US#4AFC22F");
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#140", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic68$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic69$ = SubLObjectFactory.makeUninternedSymbol("US#409EFB7");
        $ic70$ = SubLObjectFactory.makeSymbol("S#56659", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#1538", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic73$ = SubLObjectFactory.makeSymbol("NULL");
        $ic74$ = SubLObjectFactory.makeSymbol("REST");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic76$ = SubLObjectFactory.makeSymbol("CDOTIMES");
        $ic77$ = SubLObjectFactory.makeUninternedSymbol("US#6145DFB");
        $ic78$ = ConsesLow.list((SubLObject)module0811.ZERO_INTEGER);
        $ic79$ = SubLObjectFactory.makeSymbol("<");
        $ic80$ = SubLObjectFactory.makeSymbol("CINC");
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"));
        $ic82$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic83$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic84$ = SubLObjectFactory.makeSymbol("S#56696", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("+");
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56697", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#9956", "CYC"));
        $ic88$ = SubLObjectFactory.makeKeyword("UNSET");
        $ic89$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29740", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#56698", "CYC"));
        $ic90$ = SubLObjectFactory.makeSymbol("S#56658", "CYC");
        $ic91$ = SubLObjectFactory.makeString("CLET of lexical variable ~S being converted to CUNWIND-PROTECT CSETQ idiom");
        $ic92$ = SubLObjectFactory.makeString("CLET of constant ~S is not allowed");
        $ic93$ = SubLObjectFactory.makeString("Unexpected variable ~S");
        $ic94$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic95$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic96$ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56689", "CYC"));
        $ic98$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56699", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#56700", "CYC"));
        $ic99$ = SubLObjectFactory.makeSymbol("S#56688", "CYC");
        $ic100$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#63", "CYC"));
        $ic101$ = SubLObjectFactory.makeSymbol("S#56701", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("COR");
        $ic103$ = SubLObjectFactory.makeSymbol("S#56702", "CYC");
        $ic104$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"));
        $ic105$ = SubLObjectFactory.makeSymbol("CPOP");
        $ic106$ = SubLObjectFactory.makeSymbol("CDR");
        $ic107$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56703", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic108$ = SubLObjectFactory.makeSymbol("CPROGV");
        $ic109$ = SubLObjectFactory.makeUninternedSymbol("US#4F6F106");
        $ic110$ = SubLObjectFactory.makeSymbol("S#56667", "CYC");
        $ic111$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"));
        $ic112$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic113$ = SubLObjectFactory.makeSymbol("CONS");
        $ic114$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0811.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0811.IDENTITY))));
        $ic115$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0811.EQL);
        $ic116$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0811.IDENTITY);
        $ic117$ = SubLObjectFactory.makeSymbol("CPUSHNEW");
        $ic118$ = SubLObjectFactory.makeUninternedSymbol("US#367CE0C");
        $ic119$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic120$ = SubLObjectFactory.makeSymbol("MEMBER");
        $ic121$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#169", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic122$ = SubLObjectFactory.makeSymbol("CAR");
        $ic123$ = SubLObjectFactory.makeSymbol("RPLACA");
        $ic124$ = SubLObjectFactory.makeSymbol("RPLACD");
        $ic125$ = SubLObjectFactory.makeSymbol("NTH");
        $ic126$ = SubLObjectFactory.makeSymbol("SET-NTH");
        $ic127$ = SubLObjectFactory.makeSymbol("GETHASH");
        $ic128$ = SubLObjectFactory.makeSymbol("SETHASH");
        $ic129$ = SubLObjectFactory.makeSymbol("GETHASH-WITHOUT-VALUES");
        $ic130$ = SubLObjectFactory.makeSymbol("CHAR");
        $ic131$ = SubLObjectFactory.makeSymbol("SET-CHAR");
        $ic132$ = SubLObjectFactory.makeSymbol("AREF");
        $ic133$ = SubLObjectFactory.makeSymbol("SET-AREF");
        $ic134$ = SubLObjectFactory.makeSymbol("GET");
        $ic135$ = SubLObjectFactory.makeSymbol("PUT");
        $ic136$ = SubLObjectFactory.makeSymbol("SYMBOL-VALUE");
        $ic137$ = SubLObjectFactory.makeSymbol("SET");
        $ic138$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56704", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#63", "CYC"));
        $ic139$ = SubLObjectFactory.makeSymbol("SETTER-FROM-ACCESSOR", "SUBLISP");
        $ic140$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#56705", "CYC"));
        $ic141$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#56706", "CYC"));
        $ic142$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#140", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#703", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic143$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic144$ = SubLObjectFactory.makeUninternedSymbol("US#D63C46");
        $ic145$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic146$ = SubLObjectFactory.makeSymbol("CTIME");
        $ic147$ = SubLObjectFactory.makeUninternedSymbol("US#3132606");
        $ic148$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REAL-TIME")));
        $ic149$ = SubLObjectFactory.makeSymbol("/");
        $ic150$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REAL-TIME"));
        $ic151$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"));
        $ic152$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#152", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic153$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic154$ = SubLObjectFactory.makeUninternedSymbol("US#28DC13D");
        $ic155$ = SubLObjectFactory.makeSymbol("S#56666", "CYC");
        $ic156$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#56707", "CYC"));
        $ic157$ = SubLObjectFactory.makeSymbol("DECLAIM");
        $ic158$ = SubLObjectFactory.makeSymbol("PROCLAIM");
        $ic159$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#757", "CYC"));
        $ic160$ = SubLObjectFactory.makeSymbol("DECLARE");
        $ic161$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $ic162$ = SubLObjectFactory.makeSymbol("DEFCONSTANT");
        $ic163$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic164$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic165$ = SubLObjectFactory.makeSymbol("DEFINE");
        $ic166$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#56708", "CYC"));
        $ic167$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)module0811.NIL));
        $ic168$ = SubLObjectFactory.makeSymbol("RET");
        $ic169$ = SubLObjectFactory.makeSymbol("POSSIBLY-NOTE-FUNCTION-ENTRY", "SUBLISP");
        $ic170$ = SubLObjectFactory.makeUninternedSymbol("US#5338052");
        $ic171$ = SubLObjectFactory.makeSymbol("S#56671", "CYC");
        $ic172$ = SubLObjectFactory.makeSymbol("S#56607", "CYC");
        $ic173$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56689", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56688", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56658", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56677", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56665", "CYC"));
        $ic174$ = SubLObjectFactory.makeSymbol("DEFLEXICAL");
        $ic175$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic176$ = SubLObjectFactory.makeSymbol("DEFMACRO");
        $ic177$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56709", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#689", "CYC"));
        $ic178$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic179$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("S#56709", "CYC"));
        $ic180$ = SubLObjectFactory.makeSymbol("S#56710", "CYC");
        $ic181$ = SubLObjectFactory.makeSymbol("DEFPARAMETER");
        $ic182$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#6511", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#4498", "CYC"));
        $ic183$ = SubLObjectFactory.makeSymbol("DEFSTRUCT");
        $ic184$ = SubLObjectFactory.makeSymbol("S#56711", "CYC");
        $ic185$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#56712", "CYC"));
        $ic186$ = SubLObjectFactory.makeKeyword("NAME");
        $ic187$ = SubLObjectFactory.makeKeyword("C-STRUCTURE-TAG");
        $ic188$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic189$ = SubLObjectFactory.makeKeyword("SLOTS");
        $ic190$ = SubLObjectFactory.makeKeyword("SLOT-KEYWORDS");
        $ic191$ = SubLObjectFactory.makeKeyword("GETTERS");
        $ic192$ = SubLObjectFactory.makeKeyword("SETTERS");
        $ic193$ = SubLObjectFactory.makeKeyword("PRINT-FUNCTION");
        $ic194$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic195$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $ic196$ = SubLObjectFactory.makeSymbol("DEFVAR");
        $ic197$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"));
        $ic198$ = SubLObjectFactory.makeSymbol("ENFORCE-TYPE");
        $ic199$ = SubLObjectFactory.makeSymbol("S#56713", "CYC");
        $ic200$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#151", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#159", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#160", "CYC"));
        $ic201$ = SubLObjectFactory.makeSymbol("ENFORCE-MUST");
        $ic202$ = SubLObjectFactory.makeSymbol("ERROR");
        $ic203$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("S#56714", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56715", "CYC"));
        $ic204$ = SubLObjectFactory.makeSymbol("FIF");
        $ic205$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOL"));
        $ic206$ = SubLObjectFactory.makeSymbol("FUNCTION");
        $ic207$ = SubLObjectFactory.makeSymbol("SYMBOL-FUNCTION");
        $ic208$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("S#56715", "CYC"));
        $ic209$ = SubLObjectFactory.makeSymbol("FUNLESS");
        $ic210$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("S#56714", "CYC"));
        $ic211$ = SubLObjectFactory.makeSymbol("FWHEN");
        $ic212$ = ConsesLow.list((SubLObject)module0811.NIL);
        $ic213$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56716", "CYC"));
        $ic214$ = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $ic215$ = SubLObjectFactory.makeSymbol("MUST");
        $ic216$ = SubLObjectFactory.makeSymbol("*IGNORE-MUSTS?*");
        $ic217$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56716", "CYC"));
        $ic218$ = SubLObjectFactory.makeSymbol("NTH-VALUE");
        $ic219$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#735", "CYC"));
        $ic220$ = SubLObjectFactory.makeSymbol("PCASE");
        $ic221$ = SubLObjectFactory.makeUninternedSymbol("US#1CDE090");
        $ic222$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic223$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#56718", "CYC"));
        $ic224$ = SubLObjectFactory.makeSymbol("OTHERWISE");
        $ic225$ = SubLObjectFactory.makeString("~AEncountered a PCASE that uses T rather than OTHERWISE");
        $ic226$ = SubLObjectFactory.makeString("Within ");
        $ic227$ = SubLObjectFactory.makeString(" : ");
        $ic228$ = SubLObjectFactory.makeString("");
        $ic229$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#735", "CYC"));
        $ic230$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#56718", "CYC"));
        $ic231$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("S#163", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#164", "CYC"));
        $ic232$ = SubLObjectFactory.makeSymbol("PIF");
        $ic233$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56719", "CYC"));
        $ic234$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56720", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic235$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1742", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#13101", "CYC"));
        $ic236$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIVATE"), (SubLObject)SubLObjectFactory.makeSymbol("PROTECTED"), (SubLObject)SubLObjectFactory.makeSymbol("PUBLIC"));
        $ic237$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1742", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#56721", "CYC"));
        $ic238$ = SubLObjectFactory.makeSymbol("INLINE");
        $ic239$ = SubLObjectFactory.makeSymbol("NOTINLINE");
        $ic240$ = SubLObjectFactory.makeSymbol("S#56722", "CYC");
        $ic241$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic242$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic243$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0811.T));
        $ic244$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic245$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"));
        $ic246$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#5859", "CYC"));
        $ic247$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1755", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic248$ = SubLObjectFactory.makeSymbol("WITH-ERROR-HANDLER");
        $ic249$ = SubLObjectFactory.makeUninternedSymbol("US#3C57E05");
        $ic250$ = SubLObjectFactory.makeUninternedSymbol("US#7894308");
        $ic251$ = SubLObjectFactory.makeSymbol("S#56669", "CYC");
        $ic252$ = SubLObjectFactory.makeSymbol("WITH-PROCESS-RESOURCE-TRACKING");
        $ic253$ = SubLObjectFactory.makeUninternedSymbol("US#3F4C844");
        $ic254$ = SubLObjectFactory.makeSymbol("S#56670", "CYC");
        $ic255$ = SubLObjectFactory.makeSymbol("WITH-STATIC-AREA");
        $ic256$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CURRENT-AREA*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-STATIC-AREA"))));
        $ic257$ = SubLObjectFactory.makeSymbol("WITH-THREAD-PRIVATE-AREA");
        $ic258$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CURRENT-AREA*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-THREAD-PRIVATE-AREA"))));
        $ic259$ = SubLObjectFactory.makeSymbol("WITH-WORKING-AREA");
        $ic260$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CURRENT-AREA*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-WORKING-AREA"))));
        $ic261$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56723", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic262$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33", "CYC"));
        $ic263$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56724", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic264$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56725", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1534", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56726", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $ic265$ = SubLObjectFactory.makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP");
        $ic266$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic267$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#52297", "CYC"));
        $ic268$ = SubLObjectFactory.makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP");
        $ic269$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56725", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56726", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $ic270$ = SubLObjectFactory.makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP");
        $ic271$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#52297", "CYC"));
        $ic272$ = SubLObjectFactory.makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP");
        $ic273$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56727", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56728", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic274$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56728", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic275$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33", "CYC"));
        $ic276$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"));
        $ic277$ = SubLObjectFactory.makeSymbol("IN-PACKAGE");
        $ic278$ = SubLObjectFactory.makeSymbol("*PACKAGE*");
        $ic279$ = SubLObjectFactory.makeSymbol("FIND-PACKAGE");
        $ic280$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"));
        $ic281$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic282$ = SubLObjectFactory.makeSymbol("UNTIL");
        $ic283$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic284$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic285$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56723", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic286$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56724", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic287$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic288$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56728", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic289$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56727", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56728", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic290$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#704", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#705", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28822", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56729", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50102", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic291$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#150", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#768", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56730", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic292$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56730", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#152", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic293$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56703", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56731", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic294$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56695", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("PACKAGE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56732", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56729", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic295$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1755", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56733", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56734", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic296$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56735", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#761", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic297$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic298$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0811.class
	Total time: 890 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/
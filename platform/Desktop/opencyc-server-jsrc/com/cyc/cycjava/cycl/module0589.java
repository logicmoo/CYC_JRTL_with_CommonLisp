package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0589 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0589";
    public static final String myFingerPrint = "ed9c07393b0b3d70daffe59ffe7ce3ade7b00c67902fa17c43e50114c3c2aab7";
    private static SubLSymbol $g4462$;
    private static SubLSymbol $g4463$;
    private static SubLSymbol $g4464$;
    private static SubLSymbol $g4465$;
    private static SubLSymbol $g4468$;
    private static SubLSymbol $g4469$;
    private static SubLSymbol $g4470$;
    private static SubLSymbol $g4471$;
    private static SubLSymbol $g4472$;
    private static SubLSymbol $g4473$;
    private static SubLSymbol $g4474$;
    private static SubLSymbol $g4475$;
    private static SubLSymbol $g4476$;
    private static SubLSymbol $g4477$;
    private static SubLSymbol $g4478$;
    private static SubLSymbol $g4479$;
    private static SubLSymbol $g4480$;
    private static SubLSymbol $g4481$;
    public static SubLSymbol $g4482$;
    private static SubLSymbol $g4483$;
    private static SubLSymbol $g4484$;
    private static SubLSymbol $g4485$;
    private static SubLSymbol $g4486$;
    private static SubLSymbol $g4487$;
    private static SubLSymbol $g4488$;
    private static SubLSymbol $g4489$;
    private static SubLSymbol $g4490$;
    private static SubLSymbol $g4491$;
    private static SubLSymbol $g4492$;
    private static SubLSymbol $g4493$;
    private static SubLSymbol $g4494$;
    public static SubLSymbol $g4495$;
    public static SubLSymbol $g4496$;
    public static SubLSymbol $g4497$;
    private static SubLSymbol $g4498$;
    private static SubLSymbol $g4499$;
    private static SubLSymbol $g4500$;
    private static SubLSymbol $g4501$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
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
    private static final SubLInteger $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLList $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLInteger $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLList $ic95$;
    private static final SubLList $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLString $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLList $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLList $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLInteger $ic133$;
    private static final SubLList $ic134$;
    private static final SubLList $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLList $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLString $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLList $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLString $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLList $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLString $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLString $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLList $ic184$;
    private static final SubLString $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    
    
    public static SubLObject f35870(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic1$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12_13 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic1$);
            var12_13 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic1$);
            if (NIL == conses_high.member(var12_13, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var12_13 == $ic3$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic1$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : $ic6$);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var4);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : $ic8$);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var4);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : T);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var4);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var4);
        final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : NIL);
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var4);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : $ic8$);
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var4);
        final SubLObject var27 = (SubLObject)((NIL != var26) ? conses_high.cadr(var26) : $ic8$);
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)$ic14$, var4);
        final SubLObject var29 = (SubLObject)((NIL != var28) ? conses_high.cadr(var28) : NIL);
        final SubLObject var30;
        var4 = (var30 = var5);
        final SubLObject var31 = (SubLObject)$ic15$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var31, (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)ConsesLow.listS((SubLObject)EQL, var17, (SubLObject)$ic18$), (SubLObject)$ic19$, var17))), (SubLObject)ConsesLow.listS((SubLObject)$ic20$, (SubLObject)ConsesLow.list(var6, var7, var31, (SubLObject)$ic21$, (SubLObject)$ic22$, (SubLObject)$ic11$, var23), (SubLObject)ConsesLow.list((SubLObject)$ic23$, var6, (SubLObject)ConsesLow.list(new SubLObject[] { $ic24$, $ic25$, var7, $ic7$, var17, $ic5$, var15, $ic26$, var8, $ic4$, var13, $ic9$, var19, $ic10$, var21, $ic12$, var25, $ic13$, var27, $ic14$, var29 })), ConsesLow.append(var30, (SubLObject)NIL)));
    }
    
    public static SubLObject f35871(final SubLObject var34, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = (SubLObject)NIL;
        var41 = module0038.f2835(var34, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        if (NIL == var41) {
            return (SubLObject)NIL;
        }
        final SubLObject var42 = Sequences.position((SubLObject)Characters.CHAR_space, var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var43 = module0035.f2029((SubLObject)Characters.CHAR_space, var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var42.eql(var43)) {
            var43 = (SubLObject)NIL;
        }
        if (NIL != var42) {
            var38 = module0038.f2623(var41, (SubLObject)ZERO_INTEGER, var42);
            var40 = f35872(module0038.f2623(var41, module0048.f_1X(var42), var43));
            if (NIL != var43) {
                var39 = module0038.f2623(var41, module0048.f_1X(var43), (SubLObject)UNPROVIDED);
            }
        }
        if (NIL != var35) {
            while (NIL == var37) {
                var41 = module0038.f2835(var34, (SubLObject)NIL, module0038.$g916$.getGlobalValue(), (SubLObject)UNPROVIDED);
                if (var41.equal(module0038.$g916$.getGlobalValue())) {
                    var37 = (SubLObject)T;
                }
                else if (Strings.sublisp_char(var41, (SubLObject)ZERO_INTEGER).eql((SubLObject)Characters.CHAR_space) || Strings.sublisp_char(var41, (SubLObject)ZERO_INTEGER).eql((SubLObject)Characters.CHAR_tab)) {
                    if (NIL == var36) {
                        continue;
                    }
                    final SubLObject var44 = var36.first();
                    ConsesLow.rplacd(var44, Sequences.cconcatenate(var44.rest(), var41));
                }
                else {
                    final SubLObject var45 = Sequences.position((SubLObject)Characters.CHAR_colon, var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL == var45) {
                        continue;
                    }
                    var36 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(module0038.f2623(var41, (SubLObject)ZERO_INTEGER, Numbers.subtract(var45, (SubLObject)ZERO_INTEGER)), module0038.f2735(module0038.f2623(var41, Numbers.add(var45, (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED))), var36);
                }
            }
        }
        else {
            while (!var41.equal(module0038.$g916$.getGlobalValue())) {
                var41 = module0038.f2835(var34, (SubLObject)NIL, module0038.$g916$.getGlobalValue(), (SubLObject)UNPROVIDED);
            }
        }
        return f35873(var38, var40, var39, var36);
    }
    
    public static SubLObject f35874() {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        final SubLObject var46 = module0038.f2957($g4464$.getGlobalValue());
        module0067.f4886($g4465$.getGlobalValue(), var46, module0723.$g4466$.getDynamicValue(var45));
        return var46;
    }
    
    public static SubLObject f35875(final SubLObject var46) {
        return module0067.f4887($g4465$.getGlobalValue(), var46);
    }
    
    public static SubLObject f35876(final SubLObject var46) {
        return module0067.f4885($g4465$.getGlobalValue(), var46, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35877(final SubLObject var47) {
        return (SubLObject)makeBoolean(var47.isString() && NIL != module0035.f1995(var47, $g4464$.getGlobalValue(), (SubLObject)UNPROVIDED) && NIL != module0038.f2732(var47) && NIL != module0038.f2807(var47));
    }
    
    public static SubLObject f35878(final SubLObject var47) {
        return module0067.f4885($g4465$.getGlobalValue(), var47, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35873(final SubLObject var17, SubLObject var39, final SubLObject var38, SubLObject var36) {
        if (NIL != module0038.f2684(var39, $g4463$.getGlobalValue())) {
            var39 = module0038.f2659((SubLObject)$ic29$, (SubLObject)$ic30$, var39, (SubLObject)UNPROVIDED);
            final SubLObject var40 = Sequences.position((SubLObject)Characters.CHAR_question, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var40) {
                Vectors.set_aref(var39, var40, (SubLObject)Characters.CHAR_ampersand);
            }
            SubLObject var41 = conses_high.cddr(module0038.f2738(var39, (SubLObject)$ic31$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            SubLObject var42 = (SubLObject)NIL;
            SubLObject var43 = (SubLObject)NIL;
            if (NIL != f35878(var41.first())) {
                var42 = var41.first();
                var36 = module0035.f2063(var36, (SubLObject)$ic32$, var42, Symbols.symbol_function((SubLObject)EQUAL));
                var41 = var41.rest();
            }
            var43 = Sequences.cconcatenate(module0724.$g4467$.getGlobalValue(), new SubLObject[] { $ic29$, module0038.f2761(var41, (SubLObject)Characters.CHAR_slash) });
            return Values.values(var17, var43, var38, var36);
        }
        return Values.values(var17, var39, var38, var36);
    }
    
    public static SubLObject f35879() {
        return f35877(module0723.f44261());
    }
    
    public static SubLObject f35880() {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (NIL != f35879()) {
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g479$.getGlobalValue());
            module0642.f39020(module0015.$g481$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g484$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var46 = module0015.$g533$.currentBinding(var45);
            try {
                module0015.$g533$.bind((SubLObject)T, var45);
                PrintLow.format(module0015.$g131$.getDynamicValue(var45), $g4468$.getGlobalValue(), module0723.f44261());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var46, var45);
            }
            module0642.f39020(module0015.$g480$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35881(final SubLObject var53, final SubLObject var54) {
        streams_high.write_string((SubLObject)$ic39$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f35882(var53);
        f35883(var53, var54);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35884(final SubLObject var53, final SubLObject var55, final SubLObject var54) {
        streams_high.write_string((SubLObject)$ic40$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.princ(var55, var53);
        streams_high.write_char((SubLObject)Characters.CHAR_space, var53);
        streams_high.write_string(conses_high.assoc(var55, $g4474$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest(), var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f35882(var53);
        f35883(var53, var54);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35885(final SubLObject var6, final SubLObject var56) {
        assert NIL != Types.streamp(var6) : var6;
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var58 = var56;
        SubLObject var59 = (SubLObject)NIL;
        SubLObject var62_63 = (SubLObject)NIL;
        while (NIL != var58) {
            cdestructuring_bind.destructuring_bind_must_consp(var58, var56, (SubLObject)$ic46$);
            var62_63 = var58.first();
            var58 = var58.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var58, var56, (SubLObject)$ic46$);
            if (NIL == conses_high.member(var62_63, (SubLObject)$ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var59 = (SubLObject)T;
            }
            if (var62_63 == $ic3$) {
                var57 = var58.first();
            }
            var58 = var58.rest();
        }
        if (NIL != var59 && NIL == var57) {
            cdestructuring_bind.cdestructuring_bind_error(var56, (SubLObject)$ic46$);
        }
        final SubLObject var60 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var56);
        final SubLObject var61 = (SubLObject)((NIL != var60) ? conses_high.cadr(var60) : NIL);
        final SubLObject var62 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var56);
        final SubLObject var63 = (SubLObject)((NIL != var62) ? conses_high.cadr(var62) : $ic19$);
        final SubLObject var64 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var56);
        final SubLObject var65 = (SubLObject)((NIL != var64) ? conses_high.cadr(var64) : $ic6$);
        final SubLObject var66 = cdestructuring_bind.property_list_member((SubLObject)$ic26$, var56);
        final SubLObject var67 = (SubLObject)((NIL != var66) ? conses_high.cadr(var66) : NIL);
        final SubLObject var68 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var56);
        final SubLObject var69 = (SubLObject)((NIL != var68) ? conses_high.cadr(var68) : NIL);
        final SubLObject var70 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var56);
        final SubLObject var71 = (SubLObject)((NIL != var70) ? conses_high.cadr(var70) : T);
        final SubLObject var72 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var56);
        final SubLObject var73 = (SubLObject)((NIL != var72) ? conses_high.cadr(var72) : NIL);
        final SubLObject var74 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var56);
        final SubLObject var75 = (SubLObject)((NIL != var74) ? conses_high.cadr(var74) : $ic8$);
        final SubLObject var76 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var56);
        final SubLObject var77 = (SubLObject)((NIL != var76) ? conses_high.cadr(var76) : $ic8$);
        final SubLObject var78 = cdestructuring_bind.property_list_member((SubLObject)$ic14$, var56);
        final SubLObject var79 = (SubLObject)((NIL != var78) ? conses_high.cadr(var78) : NIL);
        f35886(var6, var65, var61, var63, var67, var69, var71, var73, var75, var77, var79);
        streams_high.force_output(var6);
        return var6;
    }
    
    public static SubLObject f35886(final SubLObject var74, final SubLObject var17, final SubLObject var7, final SubLObject var19, final SubLObject var8, final SubLObject var15, final SubLObject var21, final SubLObject var23, SubLObject var27, SubLObject var29, SubLObject var31) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)$ic8$;
        }
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)$ic8$;
        }
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        assert NIL != Types.keywordp(var17) : var17;
        assert NIL != Types.stringp(var7) : var7;
        if (!var19.eql((SubLObject)$ic8$) && !areAssertionsDisabledFor(me) && NIL == module0004.f105(var19)) {
            throw new AssertionError(var19);
        }
        assert NIL != Types.stringp(var8) : var8;
        if (var27.eql((SubLObject)$ic8$)) {
            var27 = $g4462$.getGlobalValue();
        }
        final SubLObject var75 = var27;
        assert NIL != module0035.f2015(var75) : var75;
        SubLObject var76 = var75;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            assert NIL != Types.stringp(var77) : var77;
            var76 = var76.rest();
            var77 = var76.first();
        }
        if (var17.eql((SubLObject)$ic6$)) {
            f35887(var74, var7, var19, var8, var15, var21, var23, var27);
        }
        else if (var17.eql((SubLObject)$ic52$)) {
            assert NIL != Types.stringp(var15) : var15;
            if (var29.eql((SubLObject)$ic8$)) {
                var29 = $g4478$.getGlobalValue();
            }
            f35888(var74, var7, var19, var8, var15, var21, var23, var27, var29, var31);
        }
        else {
            Errors.error((SubLObject)$ic53$, var17);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35889(final SubLObject var7, final SubLObject var8, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var58 = (SubLObject)NIL;
        try {
            var58 = streams_high.make_private_string_output_stream();
            final SubLObject var60;
            final SubLObject var59 = var60 = var56;
            SubLObject var61 = (SubLObject)NIL;
            SubLObject var62 = var60;
            SubLObject var63 = (SubLObject)NIL;
            SubLObject var86_87 = (SubLObject)NIL;
            while (NIL != var62) {
                cdestructuring_bind.destructuring_bind_must_consp(var62, var59, (SubLObject)$ic54$);
                var86_87 = var62.first();
                var62 = var62.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var62, var59, (SubLObject)$ic54$);
                if (NIL == conses_high.member(var86_87, (SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var63 = (SubLObject)T;
                }
                if (var86_87 == $ic3$) {
                    var61 = var62.first();
                }
                var62 = var62.rest();
            }
            if (NIL != var63 && NIL == var61) {
                cdestructuring_bind.cdestructuring_bind_error(var59, (SubLObject)$ic54$);
            }
            final SubLObject var64 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var60);
            final SubLObject var65 = (SubLObject)((NIL != var64) ? conses_high.cadr(var64) : NIL);
            final SubLObject var66 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var60);
            final SubLObject var67 = (SubLObject)((NIL != var66) ? conses_high.cadr(var66) : $ic6$);
            final SubLObject var68 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var60);
            final SubLObject var69 = (SubLObject)((NIL != var68) ? conses_high.cadr(var68) : $ic8$);
            final SubLObject var70 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var60);
            final SubLObject var71 = (SubLObject)((NIL != var70) ? conses_high.cadr(var70) : T);
            final SubLObject var72 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var60);
            final SubLObject var73 = (SubLObject)((NIL != var72) ? conses_high.cadr(var72) : NIL);
            final SubLObject var74 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var60);
            final SubLObject var75 = (SubLObject)((NIL != var74) ? conses_high.cadr(var74) : NIL);
            final SubLObject var76 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var60);
            final SubLObject var77 = (SubLObject)((NIL != var76) ? conses_high.cadr(var76) : $ic8$);
            f35885(var58, (SubLObject)ConsesLow.list(new SubLObject[] { $ic25$, var7, $ic7$, var69, $ic5$, var67, $ic26$, var8, $ic4$, var65, $ic9$, var71, $ic10$, var73, $ic12$, var77 }));
            var57 = streams_high.get_output_stream_string(var58);
        }
        finally {
            final SubLObject var78 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var58, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var78);
            }
        }
        return var57;
    }
    
    public static SubLObject f35890(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic56$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic56$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic57$, var6)), ConsesLow.append(var7, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic56$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35891() {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        return $g4482$.getDynamicValue(var45);
    }
    
    public static SubLObject f35888(SubLObject var74, final SubLObject var7, final SubLObject var19, final SubLObject var8, final SubLObject var15, final SubLObject var21, final SubLObject var23, SubLObject var27, SubLObject var29, SubLObject var31) {
        if (var27 == UNPROVIDED) {
            var27 = $g4462$.getGlobalValue();
        }
        if (var29 == UNPROVIDED) {
            var29 = $g4478$.getGlobalValue();
        }
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        final SubLThread var75 = SubLProcess.currentSubLThread();
        final SubLObject var76 = var74;
        if (NIL != $g4481$.getDynamicValue(var75)) {
            var74 = streams_high.make_broadcast_stream((SubLObject)ConsesLow.list(var74, StreamsLow.$standard_output$.getDynamicValue(var75)));
        }
        final SubLObject var77 = Sequences.length(var15);
        SubLObject var78 = $g4480$.getGlobalValue();
        SubLObject var79 = (SubLObject)NIL;
        var79 = var78.first();
        while (NIL != var78) {
            final SubLObject var80 = conses_high.assoc(var79, $g4479$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var81 = (SubLObject)NIL;
            SubLObject var83;
            final SubLObject var82 = var83 = var80;
            SubLObject var84 = (SubLObject)NIL;
            SubLObject var85 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)$ic58$);
            var84 = var83.first();
            var83 = var83.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)$ic58$);
            var85 = var83.first();
            var83 = var83.rest();
            if (NIL == var83) {
                final SubLObject var86 = var84;
                if (var86.eql((SubLObject)$ic59$)) {
                    PrintLow.format(var74, var85, var8);
                }
                else if (var86.eql((SubLObject)$ic60$)) {
                    f35892(var74, var85, var27);
                }
                else if (var86.eql((SubLObject)$ic61$)) {
                    if (var21.isInteger()) {
                        PrintLow.format(var74, (SubLObject)$ic62$, var21);
                        if (NIL != var23) {
                            module0038.f2833(var74);
                        }
                        else {
                            streams_high.terpri(var74);
                        }
                    }
                    PrintLow.format(var74, var85, (SubLObject)((NIL != var21) ? $ic63$ : $ic64$));
                }
                else if (var86.eql((SubLObject)$ic65$)) {
                    PrintLow.format(var74, var85, module0011.f351(), module0110.$g1378$.getDynamicValue(var75));
                }
                else if (var86.eql((SubLObject)$ic66$)) {
                    PrintLow.format(var74, var85, var7, var19.eql((SubLObject)$ic8$) ? module0038.$g916$.getGlobalValue() : Sequences.cconcatenate((SubLObject)$ic67$, module0006.f203(var19)));
                }
                else if (!var86.eql((SubLObject)$ic68$)) {
                    if (var86.eql((SubLObject)$ic69$)) {
                        if (NIL == f35891()) {
                            var81 = (SubLObject)T;
                        }
                        else {
                            SubLObject var76_108 = f35891();
                            SubLObject var87 = (SubLObject)NIL;
                            var87 = var76_108.first();
                            while (NIL != var76_108) {
                                PrintLow.format(var74, var85, var87);
                                var76_108 = var76_108.rest();
                                var87 = var76_108.first();
                            }
                        }
                    }
                    else if (var86.eql((SubLObject)$ic13$)) {
                        PrintLow.format(var74, var85, var29);
                    }
                    else if (var86.eql((SubLObject)$ic70$)) {
                        PrintLow.format(var74, var85, var77);
                    }
                    else if (var86.eql((SubLObject)$ic71$)) {
                        if (NIL != var31) {
                            PrintLow.format(var74, var85, var31);
                        }
                        else {
                            var81 = (SubLObject)T;
                        }
                    }
                    else if (var86.eql((SubLObject)$ic4$)) {
                        PrintLow.format(var74, var85, var15);
                    }
                    else if (var85.isString()) {
                        streams_high.write_string(var85, var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var82, (SubLObject)$ic58$);
            }
            if (NIL == var81) {
                if (NIL != var23) {
                    module0038.f2833(var74);
                }
                else {
                    streams_high.terpri(var74);
                }
            }
            var78 = var78.rest();
            var79 = var78.first();
        }
        if (NIL != $g4481$.getDynamicValue(var75)) {
            streams_high.force_output((SubLObject)T);
        }
        return var76;
    }
    
    public static SubLObject f35892(final SubLObject var74, final SubLObject var107, final SubLObject var27) {
        PrintLow.format(var74, var107);
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = var27;
        SubLObject var110 = (SubLObject)NIL;
        var110 = var109.first();
        while (NIL != var109) {
            if (NIL != var108) {
                print_high.princ((SubLObject)$ic72$, var74);
            }
            print_high.princ(var110, var74);
            var108 = (SubLObject)T;
            var109 = var109.rest();
            var110 = var109.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35887(SubLObject var74, final SubLObject var7, final SubLObject var19, final SubLObject var8, final SubLObject var15, final SubLObject var21, final SubLObject var23, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = $g4462$.getGlobalValue();
        }
        final SubLThread var75 = SubLProcess.currentSubLThread();
        final SubLObject var76 = var74;
        if (NIL != $g4481$.getDynamicValue(var75)) {
            var74 = streams_high.make_broadcast_stream((SubLObject)ConsesLow.list(var74, StreamsLow.$standard_output$.getDynamicValue(var75)));
        }
        SubLObject var77 = var8;
        if (NIL != module0038.f2611(var15)) {
            var77 = Sequences.cconcatenate(var77, new SubLObject[] { $ic73$, var15 });
        }
        SubLObject var78 = $g4477$.getGlobalValue();
        SubLObject var79 = (SubLObject)NIL;
        var79 = var78.first();
        while (NIL != var78) {
            final SubLObject var80 = conses_high.assoc(var79, $g4476$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var81 = (SubLObject)NIL;
            SubLObject var83;
            final SubLObject var82 = var83 = var80;
            SubLObject var84 = (SubLObject)NIL;
            SubLObject var85 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)$ic58$);
            var84 = var83.first();
            var83 = var83.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)$ic58$);
            var85 = var83.first();
            var83 = var83.rest();
            if (NIL == var83) {
                final SubLObject var86 = var84;
                if (var86.eql((SubLObject)$ic59$)) {
                    PrintLow.format(var74, var85, var77);
                }
                else if (var86.eql((SubLObject)$ic60$)) {
                    f35892(var74, var85, var27);
                }
                else if (var86.eql((SubLObject)$ic61$)) {
                    if (var21.isInteger()) {
                        PrintLow.format(var74, (SubLObject)$ic62$, var21);
                        if (NIL != var23) {
                            module0038.f2833(var74);
                        }
                        else {
                            streams_high.terpri(var74);
                        }
                    }
                    PrintLow.format(var74, var85, (SubLObject)((NIL != var21) ? $ic63$ : $ic64$));
                }
                else if (var86.eql((SubLObject)$ic65$)) {
                    PrintLow.format(var74, var85, module0011.f351(), module0110.$g1378$.getDynamicValue(var75));
                }
                else if (var86.eql((SubLObject)$ic69$)) {
                    if (NIL == f35891()) {
                        var81 = (SubLObject)T;
                    }
                    else {
                        SubLObject var76_115 = f35891();
                        SubLObject var87 = (SubLObject)NIL;
                        var87 = var76_115.first();
                        while (NIL != var76_115) {
                            PrintLow.format(var74, var85, var87);
                            var76_115 = var76_115.rest();
                            var87 = var76_115.first();
                        }
                    }
                }
                else if (var86.eql((SubLObject)$ic66$)) {
                    PrintLow.format(var74, var85, var7, var19.eql((SubLObject)$ic8$) ? module0038.$g916$.getGlobalValue() : Sequences.cconcatenate((SubLObject)$ic67$, module0006.f203(var19)));
                }
                else if (!var86.eql((SubLObject)$ic68$)) {
                    if (var85.isString()) {
                        streams_high.write_string(var85, var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var82, (SubLObject)$ic58$);
            }
            if (NIL == var81) {
                if (NIL != var23) {
                    module0038.f2833(var74);
                }
                else {
                    streams_high.terpri(var74);
                }
            }
            var78 = var78.rest();
            var79 = var78.first();
        }
        if (NIL != $g4481$.getDynamicValue(var75)) {
            streams_high.force_output((SubLObject)T);
        }
        return var76;
    }
    
    public static SubLObject f35883(final SubLObject var53, final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        streams_high.write_string((SubLObject)$ic74$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f35893(var53, (SubLObject)UNPROVIDED);
        f35882(var53);
        streams_high.write_string((SubLObject)$ic75$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.write_string(module0011.f351(), var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.write_string((SubLObject)$ic29$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.princ(module0110.$g1378$.getDynamicValue(var55), var53);
        f35882(var53);
        SubLObject var56 = var54;
        SubLObject var57 = (SubLObject)NIL;
        var57 = var56.first();
        while (NIL != var56) {
            streams_high.write_string(var57.first(), var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string((SubLObject)$ic76$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(var57.rest(), var53);
            f35882(var53);
            var56 = var56.rest();
            var57 = var56.first();
        }
        f35882(var53);
        return (SubLObject)T;
    }
    
    public static SubLObject f35894(final SubLObject var117) {
        SubLObject var118 = (SubLObject)ZERO_INTEGER;
        SubLObject var119 = (SubLObject)NIL;
        while (var118.isFixnum()) {
            var118 = Sequences.search($g4483$.getGlobalValue(), var117, Symbols.symbol_function((SubLObject)$ic78$), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var118, (SubLObject)UNPROVIDED);
            if (var118.isFixnum()) {
                final SubLObject var120 = Sequences.position((SubLObject)Characters.CHAR_return, var117, Symbols.symbol_function((SubLObject)$ic78$), Symbols.symbol_function((SubLObject)IDENTITY), var118, (SubLObject)UNPROVIDED);
                final SubLObject var121 = Numbers.add(var118, (SubLObject)ONE_INTEGER, Sequences.length($g4483$.getGlobalValue()));
                final SubLObject var122 = module0038.f2623(var117, var121, var120);
                final SubLObject var123 = f35895(var122);
                var119 = (SubLObject)ConsesLow.cons(var123, var119);
                var118 = var120;
            }
        }
        return var119;
    }
    
    public static SubLObject f35895(final SubLObject var123) {
        final SubLObject var124 = f35896(var123);
        SubLObject var125 = (SubLObject)$ic82$;
        SubLObject var126 = var124;
        SubLObject var127 = (SubLObject)NIL;
        var127 = var126.first();
        while (NIL != var126) {
            if (NIL == module0038.f2608(var127) && NIL == f35897(var127)) {
                var125 = Sequences.cconcatenate(var125, new SubLObject[] { $ic83$, var127 });
            }
            var126 = var126.rest();
            var127 = var126.first();
        }
        return var125;
    }
    
    public static SubLObject f35897(final SubLObject var127) {
        final SubLObject var128 = Sequences.length(var127);
        SubLObject var129 = (SubLObject)NIL;
        if (NIL == var129) {
            SubLObject var130 = $g4485$.getGlobalValue();
            SubLObject var131 = (SubLObject)NIL;
            var131 = var130.first();
            while (NIL == var129 && NIL != var130) {
                final SubLObject var132 = Sequences.length(var131);
                if (var132.numL(var128) && NIL != Strings.string_equal(var131, var127, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, var132)) {
                    var129 = (SubLObject)T;
                }
                var130 = var130.rest();
                var131 = var130.first();
            }
        }
        return var129;
    }
    
    public static SubLObject f35896(final SubLObject var123) {
        return Sequences.remove_if(Symbols.symbol_function((SubLObject)$ic84$), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic85$), module0038.f2752(var123, $g4484$.getGlobalValue())), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35898(final SubLObject var117, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)NIL;
        }
        final SubLObject var134 = Sequences.length(var117);
        final SubLObject var135 = (NIL != var133) ? Sequences.count_if(Symbols.symbol_function((SubLObject)$ic86$), var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : Sequences.count_if(Symbols.symbol_function((SubLObject)$ic87$), var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (ZERO_INTEGER.numE(var135)) {
            return var117;
        }
        final SubLObject var136 = Numbers.add(var134, Numbers.multiply(var135, (SubLObject)TWO_INTEGER));
        final SubLObject var137 = Strings.make_string(var136, (SubLObject)UNPROVIDED);
        SubLObject var138 = (SubLObject)ZERO_INTEGER;
        SubLObject var139;
        SubLObject var140;
        SubLObject var141;
        SubLObject var142;
        for (var139 = (SubLObject)NIL, var139 = (SubLObject)ZERO_INTEGER; var139.numL(var134); var139 = Numbers.add(var139, (SubLObject)ONE_INTEGER)) {
            var140 = Strings.sublisp_char(var117, var139);
            var141 = ((NIL != var133) ? f35899(var140) : f35900(var140));
            if (NIL != var141) {
                var142 = Characters.char_code(var140);
                Strings.set_char(var137, Numbers.add(var138, (SubLObject)ZERO_INTEGER), (SubLObject)Characters.CHAR_percent);
                Strings.set_char(var137, Numbers.add(var138, (SubLObject)ONE_INTEGER), module0038.f2792(Numbers.integerDivide(var142, (SubLObject)SIXTEEN_INTEGER)));
                Strings.set_char(var137, Numbers.add(var138, (SubLObject)TWO_INTEGER), module0038.f2792(Numbers.mod(var142, (SubLObject)SIXTEEN_INTEGER)));
                var138 = Numbers.add(var138, (SubLObject)THREE_INTEGER);
            }
            else {
                if (var140.eql((SubLObject)Characters.CHAR_space)) {
                    Strings.set_char(var137, Numbers.add(var138, (SubLObject)ZERO_INTEGER), (SubLObject)Characters.CHAR_plus);
                }
                else {
                    Strings.set_char(var137, Numbers.add(var138, (SubLObject)ZERO_INTEGER), var140);
                }
                var138 = Numbers.add(var138, (SubLObject)ONE_INTEGER);
            }
        }
        return var137;
    }
    
    public static SubLObject f35900(final SubLObject var139) {
        return (SubLObject)makeBoolean(var139.isChar() && (NIL == Characters.alpha_char_p(var139) || NIL == module0039.f3009(var139)) && NIL == Characters.digit_char_p(var139, (SubLObject)UNPROVIDED) && NIL == Sequences.find(var139, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f35899(final SubLObject var139) {
        return (SubLObject)makeBoolean(var139.eql((SubLObject)Characters.CHAR_equal) || NIL != f35900(var139));
    }
    
    public static SubLObject f35872(final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = Sequences.length(var117);
        final SubLObject var120 = Sequences.count((SubLObject)Characters.CHAR_percent, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var119.numE(var120)) {
            return Sequences.nsubstitute((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_plus, module0038.f2658(var117), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var121 = Numbers.subtract(var119, Numbers.multiply(var120, (SubLObject)TWO_INTEGER));
        SubLObject var122 = Strings.make_string(var121, (SubLObject)UNPROVIDED);
        SubLObject var123 = (SubLObject)ZERO_INTEGER;
        SubLObject var124 = (SubLObject)ZERO_INTEGER;
        while (var124.numL(var119)) {
            final SubLObject var125 = Strings.sublisp_char(var117, var124);
            if (NIL != Characters.charE((SubLObject)Characters.CHAR_percent, var125)) {
                var118.resetMultipleValues();
                final SubLObject var126 = f35901(var117, var124);
                final SubLObject var127 = var118.secondMultipleValue();
                var118.resetMultipleValues();
                if (var126.isChar()) {
                    Strings.set_char(var122, var123, var126);
                    var123 = Numbers.add(var123, (SubLObject)ONE_INTEGER);
                }
                else if (var126.isString()) {
                    var122 = Sequences.cconcatenate(module0038.f2623(var122, (SubLObject)ZERO_INTEGER, var123), new SubLObject[] { var126, module0038.f2623(var122, Numbers.add(var123, (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED) });
                    var123 = Numbers.add(var123, Sequences.length(var126));
                }
                var124 = Numbers.add(var124, var127);
            }
            else {
                if (var125.eql((SubLObject)Characters.CHAR_plus)) {
                    Strings.set_char(var122, var123, (SubLObject)Characters.CHAR_space);
                }
                else {
                    Strings.set_char(var122, var123, var125);
                }
                var123 = Numbers.add(var123, (SubLObject)ONE_INTEGER);
                var124 = Numbers.add(var124, (SubLObject)ONE_INTEGER);
            }
        }
        return var122;
    }
    
    public static SubLObject f35901(final SubLObject var117, final SubLObject var138) {
        final SubLObject var139 = Strings.sublisp_char(var117, Numbers.add(var138, (SubLObject)ONE_INTEGER));
        if (var139.eql((SubLObject)Characters.CHAR_u)) {
            final SubLObject var140 = reader.parse_integer(var117, Numbers.add(var138, (SubLObject)TWO_INTEGER), Numbers.add(var138, (SubLObject)SIX_INTEGER), (SubLObject)SIXTEEN_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var141 = module0039.f3048(module0039.f3018(Vectors.make_vector((SubLObject)ONE_INTEGER, var140), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            return Values.values(var141, (SubLObject)SIX_INTEGER);
        }
        final SubLObject var142 = var139;
        final SubLObject var143 = Strings.sublisp_char(var117, Numbers.add(var138, (SubLObject)TWO_INTEGER));
        final SubLObject var144 = module0037.f2588(var142, var143);
        final SubLObject var145 = Characters.code_char(var144);
        return Values.values(var145, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f35902(SubLObject var117) {
        var117 = f35903(var117);
        return var117;
    }
    
    public static SubLObject f35903(SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        SubLObject var120;
        for (SubLObject var119 = (SubLObject)NIL; NIL == var119; var119 = (SubLObject)makeBoolean(NIL == var120)) {
            var120 = (SubLObject)NIL;
            if (NIL == var120) {
                SubLObject var121;
                SubLObject var122;
                SubLObject var123;
                SubLObject var124;
                SubLObject var125;
                SubLObject var126;
                SubLObject var127;
                for (var121 = Sequences.length(var117), var122 = (SubLObject)NIL, var122 = (SubLObject)ZERO_INTEGER; NIL == var120 && !var122.numGE(var121); var122 = module0048.f_1X(var122)) {
                    var118.resetMultipleValues();
                    var123 = f35904(var117, var122);
                    var124 = var118.secondMultipleValue();
                    var118.resetMultipleValues();
                    if (NIL != var123) {
                        var125 = Sequences.subseq(var117, (SubLObject)ZERO_INTEGER, var122);
                        var126 = Strings.make_string((SubLObject)ONE_INTEGER, Characters.code_char(var124));
                        var127 = Sequences.subseq(var117, var123, Sequences.length(var117));
                        var117 = Sequences.cconcatenate(var125, new SubLObject[] { var126, var127 });
                        var120 = (SubLObject)T;
                    }
                }
            }
        }
        return var117;
    }
    
    public static SubLObject f35904(final SubLObject var117, SubLObject var157) {
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var158 = Sequences.length(var117);
        if (Numbers.subtract(var158, var157).numGE((SubLObject)FOUR_INTEGER) && NIL != Characters.charE((SubLObject)Characters.CHAR_ampersand, Strings.sublisp_char(var117, Numbers.add((SubLObject)ZERO_INTEGER, var157))) && NIL != Characters.charE((SubLObject)Characters.CHAR_hash, Strings.sublisp_char(var117, Numbers.add((SubLObject)ONE_INTEGER, var157)))) {
            final SubLObject var159 = Sequences.position((SubLObject)Characters.CHAR_semicolon, var117, Symbols.symbol_function((SubLObject)$ic78$), Symbols.symbol_function((SubLObject)IDENTITY), var157, (SubLObject)UNPROVIDED);
            if (NIL != var159) {
                final SubLObject var160 = module0048.f_1X(var159);
                final SubLObject var161 = Numbers.subtract(var160, var157);
                if (var161.numGE((SubLObject)FOUR_INTEGER) && var161.numLE((SubLObject)SIX_INTEGER)) {
                    final SubLObject var162 = (NIL != Characters.charE((SubLObject)Characters.CHAR_x, Strings.sublisp_char(var117, Numbers.add((SubLObject)TWO_INTEGER, var157)))) ? reader.parse_integer(var117, Numbers.add((SubLObject)THREE_INTEGER, var157), var159, (SubLObject)SIXTEEN_INTEGER, (SubLObject)NIL) : reader.parse_integer(var117, Numbers.add((SubLObject)TWO_INTEGER, var157), var159, (SubLObject)TEN_INTEGER, (SubLObject)NIL);
                    if (NIL != var162 && var162.numGE((SubLObject)ZERO_INTEGER) && var162.numL((SubLObject)$ic89$)) {
                        return Values.values(var160, var162);
                    }
                }
            }
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f35905(final SubLObject var161) {
        return f35898(PrintLow.format((SubLObject)NIL, (SubLObject)$ic90$, module0173.f10958(module0285.f18875(var161, (SubLObject)UNPROVIDED))), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35906(final SubLObject var117) {
        return module0285.f18875(reader.read_from_string(f35872(var117), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35907(final SubLObject var162, SubLObject var163) {
        if (var163 == UNPROVIDED) {
            var163 = (SubLObject)NIL;
        }
        if (var162.isString()) {
            final SubLObject var164 = Sequences.position((SubLObject)Characters.CHAR_colon, var162, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
            if (NIL != var164 && NIL != f35908(var162, var163, (SubLObject)ZERO_INTEGER, module0048.f_1X(var164))) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35909(final SubLObject var162) {
        if (!var162.isString()) {
            return (SubLObject)NIL;
        }
        final SubLObject var163 = Sequences.position((SubLObject)Characters.CHAR_colon, var162, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
        if (NIL == var163) {
            return (SubLObject)NIL;
        }
        final SubLObject var164 = f35910(var162, Sequences.length(var162), var163);
        if (NIL == var164 || var164.numG((SubLObject)ZERO_INTEGER)) {
            return (SubLObject)NIL;
        }
        if (NIL != Strings.stringE((SubLObject)$ic91$, Sequences.subseq(var162, (SubLObject)ZERO_INTEGER, (SubLObject)SEVEN_INTEGER), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0038.f2750(var162, (SubLObject)Characters.CHAR_at);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f35911(final SubLObject var8) {
        final SubLObject var9 = Sequences.position((SubLObject)Characters.CHAR_colon, var8, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
        if (NIL == var9) {
            return (SubLObject)$ic82$;
        }
        final SubLObject var10 = module0038.f2738(var8, (SubLObject)$ic92$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return conses_high.second(var10);
    }
    
    public static SubLObject f35912(final SubLObject var8) {
        assert NIL != module0038.f2611(var8) : var8;
        return Equality.eq((SubLObject)Characters.CHAR_slash, module0038.f2636(var8));
    }
    
    public static SubLObject f35913(final SubLObject var8, final SubLObject var167) {
        assert NIL != Types.stringp(var8) : var8;
        assert NIL != Types.stringp(var167) : var167;
        final SubLObject var168 = f35912(var8);
        return (NIL != var168 && NIL != var167) ? Sequences.cconcatenate(module0006.f203(Strings.string_right_trim((SubLObject)$ic29$, var167)), module0006.f203(var8)) : var8;
    }
    
    public static SubLObject f35908(final SubLObject var162, SubLObject var163, SubLObject var157, SubLObject var169) {
        if (var163 == UNPROVIDED) {
            var163 = (SubLObject)NIL;
        }
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)ZERO_INTEGER;
        }
        if (var169 == UNPROVIDED) {
            var169 = (SubLObject)NIL;
        }
        SubLObject var170 = (SubLObject)NIL;
        if (NIL == var170) {
            SubLObject var171 = $g4486$.getGlobalValue();
            SubLObject var172 = (SubLObject)NIL;
            var172 = var171.first();
            while (NIL == var170 && NIL != var171) {
                if (var157.eql(Sequences.search(var172, var162, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var157, var169))) {
                    var170 = var172;
                }
                var171 = var171.rest();
                var172 = var171.first();
            }
        }
        if (NIL == var163 && NIL == var170) {
            SubLObject var171 = $g4487$.getGlobalValue();
            SubLObject var172 = (SubLObject)NIL;
            var172 = var171.first();
            while (NIL == var170 && NIL != var171) {
                if (var157.eql(Sequences.search(var172, var162, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, var157, var169))) {
                    var170 = var172;
                }
                var171 = var171.rest();
                var172 = var171.first();
            }
        }
        return module0035.sublisp_boolean(var170);
    }
    
    public static SubLObject f35910(final SubLObject var117, final SubLObject var100, final SubLObject var172) {
        if (!var117.isString() || !var100.isNumber() || !var172.isNumber()) {
            return (SubLObject)NIL;
        }
        SubLObject var173 = $g4488$.getGlobalValue();
        SubLObject var174 = (SubLObject)NIL;
        var174 = var173.first();
        while (NIL != var173) {
            final SubLObject var175 = Numbers.subtract(var172, module0038.f2702((SubLObject)Characters.CHAR_colon, var174, (SubLObject)UNPROVIDED));
            final SubLObject var176 = Numbers.add(var175, Sequences.length(var174));
            if (var175.numGE((SubLObject)ZERO_INTEGER) && var176.numL(var100) && NIL != Strings.stringE(var174, Sequences.subseq(var117, var175, var176), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return var175;
            }
            var173 = var173.rest();
            var174 = var173.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35914(final SubLObject var117, SubLObject var100, SubLObject var176) {
        if (var100 == UNPROVIDED) {
            var100 = Sequences.length(var117);
        }
        if (var176 == UNPROVIDED) {
            var176 = (SubLObject)ZERO_INTEGER;
        }
        if (!var117.isString() || !var100.isNumber() || !var176.isNumber()) {
            return (SubLObject)NIL;
        }
        SubLObject var177 = module0035.position_if_not((SubLObject)$ic98$, var117, Symbols.symbol_function((SubLObject)IDENTITY), var176, (SubLObject)UNPROVIDED);
        if (NIL == var177) {
            var177 = var100;
        }
        if (!var176.eql((SubLObject)ZERO_INTEGER) || !var177.eql(var100)) {
            while (var177.isPositive() && NIL != conses_high.member(Strings.sublisp_char(var117, module0048.f_1_(var177)), $g4489$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED)) {
                var177 = Numbers.subtract(var177, (SubLObject)ONE_INTEGER);
            }
        }
        final SubLObject var178 = Sequences.subseq(var117, var176, var177);
        if (NIL != f35909(var178)) {
            return var177;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35915(final SubLObject var139) {
        return (SubLObject)makeBoolean(NIL != Characters.alpha_char_p(var139) || NIL != Characters.digit_char_p(var139, (SubLObject)UNPROVIDED) || NIL != Sequences.find(var139, $g4490$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f35916(final SubLObject var178, final SubLObject var179) {
        final SubLThread var180 = SubLProcess.currentSubLThread();
        var180.resetMultipleValues();
        final SubLObject var181 = f35917(var178, var179);
        final SubLObject var182 = var180.secondMultipleValue();
        var180.resetMultipleValues();
        return Sequences.cconcatenate(var181, var182);
    }
    
    public static SubLObject f35917(SubLObject var178, SubLObject var179) {
        while (NIL != module0038.f2684(var179, (SubLObject)$ic100$)) {
            var178 = f35918(var178);
            var179 = module0038.f2623(var179, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0038.f2684(var179, (SubLObject)$ic101$)) {
            final SubLObject var180 = Sequences.position((SubLObject)Characters.CHAR_colon, var178, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var180) {
                var178 = module0038.f2623(var178, (SubLObject)ZERO_INTEGER, module0048.f_1X(var180));
            }
        }
        else if (NIL != f35919(var178) && !Characters.CHAR_hash.eql(module0038.f2637(var178)) && !Characters.CHAR_hash.eql(module0038.f2636(var179))) {
            var178 = Sequences.cconcatenate(var178, (SubLObject)$ic29$);
        }
        else if (NIL != module0038.f2684(var179, (SubLObject)$ic29$)) {
            final SubLObject var180 = Sequences.position((SubLObject)Characters.CHAR_colon, var178, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var180) {
                final SubLObject var181 = Sequences.position((SubLObject)Characters.CHAR_slash, var178, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), Numbers.add((SubLObject)THREE_INTEGER, var180), (SubLObject)UNPROVIDED);
                var178 = module0038.f2623(var178, (SubLObject)ZERO_INTEGER, var181);
            }
        }
        else if (NIL == module0038.f2608(var179) && !module0038.f2636(var179).eql((SubLObject)Characters.CHAR_hash) && !module0038.f2637(var178).eql((SubLObject)Characters.CHAR_hash)) {
            final SubLObject var182 = module0035.f2029((SubLObject)Characters.CHAR_slash, var178, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0035.f2002(var178, module0048.f_1X(var182), (SubLObject)UNPROVIDED)) {
                var178 = module0038.f2623(var178, (SubLObject)ZERO_INTEGER, module0048.f_1X(var182));
            }
        }
        return Values.values(var178, var179);
    }
    
    public static SubLObject f35918(final SubLObject var39) {
        final SubLObject var40 = module0035.f2029((SubLObject)Characters.CHAR_slash, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var41 = module0035.f2029((SubLObject)Characters.CHAR_slash, var39, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, var40);
        return module0038.f2623(var39, (SubLObject)ZERO_INTEGER, var41);
    }
    
    public static SubLObject f35919(final SubLObject var39) {
        final SubLObject var40 = Sequences.position((SubLObject)Characters.CHAR_colon, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var41 = (SubLObject)((NIL != var40) ? Sequences.position((SubLObject)Characters.CHAR_slash, var39, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), Numbers.add(var40, (SubLObject)THREE_INTEGER), (SubLObject)UNPROVIDED) : NIL);
        return Types.sublisp_null(var41);
    }
    
    public static SubLObject f35920() {
        final SubLObject var188 = $g4492$.getGlobalValue();
        if (NIL != var188) {
            module0034.f1818(var188);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35921(final SubLObject var179) {
        return module0034.f1829($g4492$.getGlobalValue(), (SubLObject)ConsesLow.list(var179), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35922(final SubLObject var179) {
        return Sequences.cconcatenate((SubLObject)$ic112$, var179);
    }
    
    public static SubLObject f35923(final SubLObject var179) {
        SubLObject var180 = $g4492$.getGlobalValue();
        if (NIL == var180) {
            var180 = module0034.f1934((SubLObject)$ic111$, (SubLObject)$ic113$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var181 = module0034.f1814(var180, var179, (SubLObject)$ic114$);
        if (var181 == $ic114$) {
            var181 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f35922(var179)));
            module0034.f1816(var180, var179, var181, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var181);
    }
    
    public static SubLObject f35924() {
        final SubLObject var188 = $g4493$.getGlobalValue();
        if (NIL != var188) {
            module0034.f1818(var188);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35925(final SubLObject var179) {
        return module0034.f1829($g4493$.getGlobalValue(), (SubLObject)ConsesLow.list(var179), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35926(final SubLObject var179) {
        return Sequences.cconcatenate($g4491$.getGlobalValue(), var179);
    }
    
    public static SubLObject f35927(final SubLObject var179) {
        SubLObject var180 = $g4493$.getGlobalValue();
        if (NIL == var180) {
            var180 = module0034.f1934((SubLObject)$ic115$, (SubLObject)$ic116$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var181 = module0034.f1814(var180, var179, (SubLObject)$ic114$);
        if (var181 == $ic114$) {
            var181 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f35926(var179)));
            module0034.f1816(var180, var179, var181, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var181);
    }
    
    public static SubLObject f35928(final SubLObject var191) {
        return Equality.equal(f35927((SubLObject)$ic117$), module0590.f36092(var191));
    }
    
    public static SubLObject f35929() {
        final SubLObject var188 = $g4494$.getGlobalValue();
        if (NIL != var188) {
            module0034.f1818(var188);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35930(final SubLObject var15, final SubLObject var31, final SubLObject var7, final SubLObject var8, SubLObject var19, SubLObject var21) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)$ic19$;
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)T;
        }
        return module0034.f1829($g4494$.getGlobalValue(), (SubLObject)ConsesLow.list(var15, var31, var7, var8, var19, var21), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35931(final SubLObject var15, final SubLObject var31, final SubLObject var7, final SubLObject var8, final SubLObject var19, final SubLObject var21) {
        return f35932(var15, var31, var7, var8, var19, var21);
    }
    
    public static SubLObject f35933(final SubLObject var15, final SubLObject var31, final SubLObject var7, final SubLObject var8, SubLObject var19, SubLObject var21) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)$ic19$;
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)T;
        }
        SubLObject var32 = $g4494$.getGlobalValue();
        if (NIL == var32) {
            var32 = module0034.f1934((SubLObject)$ic118$, (SubLObject)$ic119$, (SubLObject)$ic89$, (SubLObject)EQUAL, (SubLObject)SIX_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var33 = module0034.f1778(var15, var31, var7, var8, var19, var21);
        final SubLObject var34 = module0034.f1814(var32, var33, (SubLObject)UNPROVIDED);
        if (var34 != $ic114$) {
            SubLObject var35 = var34;
            SubLObject var36 = (SubLObject)NIL;
            var36 = var35.first();
            while (NIL != var35) {
                SubLObject var37 = var36.first();
                final SubLObject var38 = conses_high.second(var36);
                if (var15.equal(var37.first())) {
                    var37 = var37.rest();
                    if (var31.equal(var37.first())) {
                        var37 = var37.rest();
                        if (var7.equal(var37.first())) {
                            var37 = var37.rest();
                            if (var8.equal(var37.first())) {
                                var37 = var37.rest();
                                if (var19.equal(var37.first())) {
                                    var37 = var37.rest();
                                    if (NIL != var37 && NIL == var37.rest() && var21.equal(var37.first())) {
                                        return module0034.f1959(var38);
                                    }
                                }
                            }
                        }
                    }
                }
                var35 = var35.rest();
                var36 = var35.first();
            }
        }
        final SubLObject var39 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f35931(var15, var31, var7, var8, var19, var21)));
        module0034.f1836(var32, var33, var34, var39, (SubLObject)ConsesLow.list(var15, var31, var7, var8, var19, var21));
        return module0034.f1959(var39);
    }
    
    public static SubLObject f35932(final SubLObject var15, final SubLObject var31, final SubLObject var7, final SubLObject var8, SubLObject var19, SubLObject var21) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)$ic19$;
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)T;
        }
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = (SubLObject)(var19.eql((SubLObject)$ic8$) ? $ic19$ : var19);
        SubLObject var35 = (SubLObject)NIL;
        try {
            var35 = module0004.f82(var7, var34, (SubLObject)NIL, (SubLObject)$ic22$);
            if (NIL != module0003.f70(var35, var7, var34)) {
                f35885(var35, (SubLObject)ConsesLow.list(new SubLObject[] { $ic25$, var7, $ic7$, var19, $ic5$, $ic52$, $ic26$, var8, $ic4$, var15, $ic9$, var21, $ic10$, T, $ic12$, $ic8$, $ic13$, $ic120$, $ic14$, var31 }));
                var32 = f35934(f35935(var35, (SubLObject)UNPROVIDED));
            }
        }
        finally {
            final SubLObject var36 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (NIL != var35) {
                    streams_high.close(var35, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var36);
            }
        }
        if (!Characters.CHAR_less.eql(module0038.f2636(var32))) {
            final SubLObject var37 = Sequences.position((SubLObject)Characters.CHAR_less, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var37) {
                var32 = module0038.f2623(var32, var37, (SubLObject)UNPROVIDED);
            }
        }
        SubLObject var38 = (SubLObject)NIL;
        try {
            var38 = streams_high.make_private_string_input_stream(var32, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
            var33 = module0590.f36086(module0590.f35984(var38, (SubLObject)T, (SubLObject)T, (SubLObject)T));
        }
        finally {
            final SubLObject var39 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var38, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var39);
            }
        }
        return var33;
    }
    
    public static SubLObject f35936(final SubLObject var202, final SubLObject var203, final SubLObject var204, SubLObject var123, SubLObject var205, SubLObject var206) {
        if (var123 == UNPROVIDED) {
            var123 = (SubLObject)$ic121$;
        }
        if (var205 == UNPROVIDED) {
            var205 = (SubLObject)T;
        }
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)NIL;
        }
        module0601.f36751(module0601.f36743(), var123, var205);
        final SubLObject var207 = f35923((SubLObject)$ic117$);
        module0601.f36758(var207, (SubLObject)ConsesLow.list((SubLObject)$ic122$, $g4491$.getGlobalValue()), (SubLObject)NIL, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f2013(var203) || NIL != module0035.f2013(var206)) {
            final SubLObject var207_208 = f35923((SubLObject)$ic123$);
            module0601.f36758(var207_208, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            SubLObject var208 = var203;
            SubLObject var209 = (SubLObject)NIL;
            var209 = var208.first();
            while (NIL != var208) {
                SubLObject var211;
                final SubLObject var210 = var211 = var209;
                SubLObject var212 = (SubLObject)NIL;
                SubLObject var213 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var211, var210, (SubLObject)$ic124$);
                var212 = var211.first();
                var211 = (var213 = var211.rest());
                final SubLObject var207_209 = var212;
                module0601.f36758(var207_209, (SubLObject)ConsesLow.list((SubLObject)$ic125$, var202), (SubLObject)NIL, (SubLObject)UNPROVIDED);
                module0601.f36747(var213, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0601.f36760(var207_209);
                var208 = var208.rest();
                var209 = var208.first();
            }
            var208 = var206;
            SubLObject var214 = (SubLObject)NIL;
            var214 = var208.first();
            while (NIL != var208) {
                module0601.f36762(var214, (SubLObject)NIL);
                var208 = var208.rest();
                var214 = var208.first();
            }
            module0601.f36760(var207_208);
        }
        final SubLObject var207_210 = f35923((SubLObject)$ic126$);
        module0601.f36758(var207_210, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        SubLObject var208 = var204;
        SubLObject var214 = (SubLObject)NIL;
        var214 = var208.first();
        while (NIL != var208) {
            module0601.f36762(var214, (SubLObject)NIL);
            var208 = var208.rest();
            var214 = var208.first();
        }
        module0601.f36760(var207_210);
        module0601.f36760(var207);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35937(final SubLObject var217) {
        final SubLObject var218 = Sequences.delete((SubLObject)$ic82$, module0038.f2752(var217, (SubLObject)$ic127$), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if ($ic128$.equal(Strings.string_upcase(var218.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
            return module0038.f2642(conses_high.third(var218));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35938(final SubLObject var117) {
        final SubLObject var118 = f35937(var117);
        return module0035.f2302($g4471$.getGlobalValue(), var118, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35939(final SubLObject var117) {
        final SubLObject var118 = (SubLObject)$ic129$;
        final SubLObject var119 = Sequences.search(var118, var117, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var119) {
            final SubLObject var120 = Numbers.add(var119, Sequences.length(var118));
            final SubLObject var121 = Sequences.position_if(Symbols.symbol_function((SubLObject)$ic130$), var117, Symbols.symbol_function((SubLObject)IDENTITY), var120, (SubLObject)UNPROVIDED);
            if (NIL != var121) {
                return module0038.f2623(var117, var120, var121);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35940(final SubLObject var223) {
        SubLObject var224 = (SubLObject)NIL;
        SubLObject var225 = (SubLObject)NIL;
        SubLObject var226 = (SubLObject)NIL;
        SubLObject var227 = (SubLObject)NIL;
        if (NIL != Sequences.search((SubLObject)$ic131$, var223, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != Sequences.search((SubLObject)$ic132$, var223, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var228 = Sequences.length((SubLObject)$ic131$);
            final SubLObject var229 = Sequences.position((SubLObject)Characters.CHAR_colon, var223, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), var228, (SubLObject)UNPROVIDED);
            SubLObject var230 = Sequences.position((SubLObject)Characters.CHAR_slash, var223, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), var228, (SubLObject)UNPROVIDED);
            SubLObject var231 = (SubLObject)NIL;
            if (NIL == var230) {
                var230 = Sequences.length(var223);
            }
            if (NIL != var229 && var229.numL(var230)) {
                var231 = var229;
                var225 = reader.read_from_string_ignoring_errors(var223, (SubLObject)NIL, (SubLObject)NIL, Numbers.add(var229, (SubLObject)ONE_INTEGER), var230);
            }
            else {
                var231 = var230;
                var225 = (SubLObject)$ic8$;
            }
            var224 = module0038.f2623(var223, var228, var231);
            final SubLObject var232 = Sequences.position((SubLObject)Characters.CHAR_question, var223, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), var230, (SubLObject)UNPROVIDED);
            SubLObject var233 = (SubLObject)NIL;
            if (NIL != var232) {
                var233 = var232;
            }
            var226 = module0038.f2623(var223, var230, var233);
            if (NIL != var232) {
                var227 = module0038.f2623(var223, Numbers.add((SubLObject)ONE_INTEGER, var232), (SubLObject)UNPROVIDED);
            }
            else {
                var227 = (SubLObject)$ic82$;
            }
        }
        return Values.values(var224, var225, var226, var227);
    }
    
    public static SubLObject f35941(final SubLObject var201, SubLObject var230) {
        if (var230 == UNPROVIDED) {
            var230 = (SubLObject)NIL;
        }
        if (NIL == var230) {
            var230 = Strings.make_string((SubLObject)$ic133$, (SubLObject)UNPROVIDED);
        }
        SubLObject var231 = (SubLObject)$ic82$;
        final SubLObject var232 = Sequences.length(var230);
        SubLObject var233 = (SubLObject)ZERO_INTEGER;
        SubLObject var234;
        for (var234 = (SubLObject)NIL, var234 = streams_high.read_char(var201, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED); NIL != var234; var234 = streams_high.read_char(var201, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED)) {
            Strings.set_char(var230, var233, var234);
            var233 = Numbers.add(var233, (SubLObject)ONE_INTEGER);
            if (var233.numE(var232)) {
                var231 = Sequences.cconcatenate(var231, module0038.f2623(var230, (SubLObject)ZERO_INTEGER, var233));
                var233 = (SubLObject)ZERO_INTEGER;
            }
        }
        return Values.values(Sequences.cconcatenate(var231, module0038.f2623(var230, (SubLObject)ZERO_INTEGER, var233)), Types.sublisp_null(var234));
    }
    
    public static SubLObject f35942(final SubLObject var201, final SubLObject var139, SubLObject var233) {
        if (var233 == UNPROVIDED) {
            var233 = streams_high.make_private_string_output_stream();
        }
        SubLObject var234;
        for (var234 = (SubLObject)NIL, var234 = streams_high.read_char(var201, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED); !var234.eql(var139) && NIL != var234; var234 = streams_high.read_char(var201, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED)) {
            streams_high.write_char(var234, var233);
        }
        return Values.values(streams_high.get_output_stream_string(var233), Types.sublisp_null(var234));
    }
    
    public static SubLObject f35943(final SubLObject var201, final SubLObject var234, SubLObject var233) {
        if (var233 == UNPROVIDED) {
            var233 = streams_high.make_private_string_output_stream();
        }
        SubLObject var235;
        for (var235 = (SubLObject)NIL, var235 = streams_high.read_char(var201, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED); NIL == conses_high.member(var235, var234, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != var235; var235 = streams_high.read_char(var201, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED)) {
            streams_high.write_char(var235, var233);
        }
        return Values.values(streams_high.get_output_stream_string(var233), var235);
    }
    
    public static SubLObject f35935(final SubLObject var201, SubLObject var235) {
        if (var235 == UNPROVIDED) {
            var235 = (SubLObject)NIL;
        }
        SubLObject var236 = (SubLObject)NIL;
        SubLObject var237 = (SubLObject)NIL;
        SubLObject var238 = (SubLObject)NIL;
        try {
            var238 = streams_high.make_private_string_output_stream();
            SubLObject var239;
            SubLObject var240;
            for (var239 = (SubLObject)NIL, var240 = (SubLObject)NIL, var239 = f35944(var201, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED), var240 = (SubLObject)ZERO_INTEGER; NIL != var239 && (NIL == var235 || !var240.numGE(var235)); var239 = f35944(var201, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED), var240 = module0048.f_1X(var240)) {
                streams_high.write_char(var239, var238);
            }
            var237 = Types.sublisp_null(var239);
            var236 = streams_high.get_output_stream_string(var238);
        }
        finally {
            final SubLObject var241 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var238, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var241);
            }
        }
        return Values.values(var236, var237);
    }
    
    public static SubLObject f35945(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic134$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic134$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic16$, (SubLObject)ConsesLow.list(reader.bq_cons(var5, (SubLObject)$ic135$)), (SubLObject)ConsesLow.list((SubLObject)$ic136$, (SubLObject)ConsesLow.list(var5), var6), ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f35944(SubLObject var80, SubLObject var243, SubLObject var244, SubLObject var245) {
        if (var80 == UNPROVIDED) {
            var80 = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (var243 == UNPROVIDED) {
            var243 = (SubLObject)T;
        }
        if (var244 == UNPROVIDED) {
            var244 = (SubLObject)NIL;
        }
        if (var245 == UNPROVIDED) {
            var245 = (SubLObject)NIL;
        }
        final SubLThread var246 = SubLProcess.currentSubLThread();
        if (NIL != var243) {
            return streams_high.read_char(var80, var243, var244, var245);
        }
        SubLObject var247 = (SubLObject)NIL;
        SubLObject var248 = (SubLObject)NIL;
        try {
            var246.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var249 = Errors.$error_handler$.currentBinding(var246);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic137$, var246);
                try {
                    var247 = streams_high.read_char(var80, var243, var244, var245);
                }
                catch (Throwable var250) {
                    Errors.handleThrowable(var250, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var249, var246);
            }
        }
        catch (Throwable var251) {
            var248 = Errors.handleThrowable(var251, module0003.$g3$.getGlobalValue());
        }
        finally {
            var246.throwStack.pop();
        }
        if (NIL != var248) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic138$);
            var247 = var244;
        }
        return var247;
    }
    
    public static SubLObject f35946(final SubLObject var34) {
        final SubLObject var35 = module0038.f2835(var34, (SubLObject)NIL, (SubLObject)$ic139$, (SubLObject)UNPROVIDED);
        final SubLObject var36 = reader.parse_integer(var35, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)SIXTEEN_INTEGER, (SubLObject)T);
        SubLObject var37 = module0038.$g916$.getGlobalValue();
        if (NIL != var36) {
            var37 = Strings.make_string(var36, (SubLObject)UNPROVIDED);
            streams_high.read_sequence(var37, var34, (SubLObject)ZERO_INTEGER, var36);
            module0038.f2835(var34, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        }
        return var37;
    }
    
    public static SubLObject f35947(final SubLObject var53, final SubLObject var40) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        final SubLObject var55 = print_high.$print_base$.currentBinding(var54);
        try {
            print_high.$print_base$.bind((SubLObject)SIXTEEN_INTEGER, var54);
            print_high.princ(Sequences.length(var40), var53);
        }
        finally {
            print_high.$print_base$.rebind(var55, var54);
        }
        f35882(var53);
        streams_high.write_string(var40, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f35882(var53);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35882(final SubLObject var251) {
        streams_high.write_char(Characters.code_char((SubLObject)THIRTEEN_INTEGER), var251);
        streams_high.write_char(Characters.code_char((SubLObject)TEN_INTEGER), var251);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35893(final SubLObject var80, SubLObject var252) {
        if (var252 == UNPROVIDED) {
            var252 = Time.get_universal_time();
        }
        final SubLThread var253 = SubLProcess.currentSubLThread();
        var253.resetMultipleValues();
        final SubLObject var254 = Time.decode_universal_time(var252, (SubLObject)ZERO_INTEGER);
        final SubLObject var255 = var253.secondMultipleValue();
        final SubLObject var256 = var253.thirdMultipleValue();
        final SubLObject var257 = var253.fourthMultipleValue();
        final SubLObject var258 = var253.fifthMultipleValue();
        final SubLObject var259 = var253.sixthMultipleValue();
        final SubLObject var260 = var253.seventhMultipleValue();
        var253.resetMultipleValues();
        streams_high.write_string(module0051.f3658(var260), var80, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.write_string((SubLObject)$ic72$, var80, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0012.f483(var257, var80);
        streams_high.write_char((SubLObject)Characters.CHAR_space, var80);
        streams_high.write_string(module0051.f3659(var258), var80, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        streams_high.write_char((SubLObject)Characters.CHAR_space, var80);
        print_high.princ(var259, var80);
        streams_high.write_char((SubLObject)Characters.CHAR_space, var80);
        module0012.f483(var256, var80);
        streams_high.write_char((SubLObject)Characters.CHAR_colon, var80);
        module0012.f483(var255, var80);
        streams_high.write_char((SubLObject)Characters.CHAR_colon, var80);
        module0012.f483(var254, var80);
        streams_high.write_string((SubLObject)$ic140$, var80, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35948(SubLObject var252) {
        if (var252 == UNPROVIDED) {
            var252 = Time.get_universal_time();
        }
        SubLObject var253 = (SubLObject)NIL;
        SubLObject var254 = (SubLObject)NIL;
        try {
            var254 = streams_high.make_private_string_output_stream();
            f35893(var254, var252);
            var253 = streams_high.get_output_stream_string(var254);
        }
        finally {
            final SubLObject var255 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var254, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var255);
            }
        }
        return var253;
    }
    
    public static SubLObject f35949(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic141$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic141$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic142$, var5, var6, (SubLObject)$ic143$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic141$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35950(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic144$);
        var5 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic145$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic146$, var5));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic144$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35951(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic141$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic141$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic145$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic147$, var5, var6));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic141$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35952(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic141$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic141$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic145$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic146$, (SubLObject)ConsesLow.list((SubLObject)$ic147$, var5, var6)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic141$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35953(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic144$);
        var5 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic148$, var5);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic144$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35954(final SubLObject var117, final SubLObject var272) {
        if (!Characters.CHAR_less.eql(Strings.sublisp_char(var117, (SubLObject)ZERO_INTEGER)) || !Characters.CHAR_slash.eql(Strings.sublisp_char(var117, (SubLObject)ONE_INTEGER))) {
            return (SubLObject)NIL;
        }
        return Strings.string_equal(var117, var272, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)ONE_INTEGER, (SubLObject)NIL);
    }
    
    public static SubLObject f35955(final SubLObject var273, final SubLObject var274) {
        final SubLObject var275 = var273.first();
        if (!var275.isString()) {
            return (SubLObject)NIL;
        }
        return Strings.string_equal(var274, var275, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35956(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic149$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic149$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7 = (SubLObject)$ic150$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic151$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic152$, (SubLObject)ConsesLow.list((SubLObject)$ic153$, var7, var6), (SubLObject)ConsesLow.list((SubLObject)$ic154$, (SubLObject)$ic155$, var6, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic156$, var5));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic149$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35957(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic149$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic149$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7 = (SubLObject)$ic157$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic151$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic152$, (SubLObject)ConsesLow.list((SubLObject)$ic158$, var7, var6), (SubLObject)ConsesLow.list((SubLObject)$ic154$, (SubLObject)$ic159$, var6, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic156$, var5));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic149$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35958(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic160$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic160$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic160$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic161$, (SubLObject)ConsesLow.list((SubLObject)$ic162$, var5, var6), (SubLObject)ConsesLow.list((SubLObject)$ic145$, var7, (SubLObject)ConsesLow.list((SubLObject)$ic151$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic156$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic163$, var5, var6));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic160$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35959(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic164$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic164$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic164$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic164$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9 = (SubLObject)$ic165$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list(var9), (SubLObject)ConsesLow.list((SubLObject)$ic145$, var7, var8), (SubLObject)ConsesLow.list((SubLObject)$ic162$, var5, var6), (SubLObject)ConsesLow.list((SubLObject)$ic145$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic151$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic152$, (SubLObject)ConsesLow.list((SubLObject)$ic158$, var9, var6), (SubLObject)ConsesLow.list((SubLObject)$ic145$, var7, var9), (SubLObject)ConsesLow.list((SubLObject)$ic156$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic163$, var5, var6));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic164$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35960(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic160$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic160$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic160$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic166$, (SubLObject)ConsesLow.list((SubLObject)$ic167$, var5, var6), (SubLObject)ConsesLow.list((SubLObject)$ic168$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic160$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35961(final SubLObject var289) {
        final SubLThread var290 = SubLProcess.currentSubLThread();
        SubLObject var291 = (SubLObject)NIL;
        SubLObject var292 = (SubLObject)NIL;
        try {
            final SubLObject var293 = stream_macros.$stream_requires_locking$.currentBinding(var290);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var290);
                var292 = compatibility.open_text(var289, (SubLObject)$ic169$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var293, var290);
            }
            if (!var292.isStream()) {
                Errors.error((SubLObject)$ic170$, var289);
            }
            final SubLObject var294 = var292;
            var291 = f35962(var294);
        }
        finally {
            final SubLObject var295 = Threads.$is_thread_performing_cleanupP$.currentBinding(var290);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var290);
                if (var292.isStream()) {
                    streams_high.close(var292, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var295, var290);
            }
        }
        return var291;
    }
    
    public static SubLObject f35962(final SubLObject var80) {
        SubLObject var81 = (SubLObject)NIL;
        var81 = module0590.f35984(var80, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = var81;
        SubLObject var84 = (SubLObject)NIL;
        var84 = var83.first();
        while (NIL != var83) {
            final SubLObject var85 = f35963(var84);
            if (!Sequences.length(var85).isZero()) {
                var82 = (SubLObject)ConsesLow.cons(var85, var82);
            }
            var83 = var83.rest();
            var84 = var83.first();
        }
        var81 = Sequences.nreverse(var82);
        return var81;
    }
    
    public static SubLObject f35963(SubLObject var117) {
        var117 = module0038.f2823(var117);
        return module0038.f2946(var117);
    }
    
    public static SubLObject f35964(final SubLObject var56) {
        assert NIL != module0035.f2327(var56) : var56;
        final SubLObject var57 = streams_high.make_string_output_stream();
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = (SubLObject)NIL;
        SubLObject var60 = (SubLObject)NIL;
        var58 = var56;
        var59 = var58.first();
        for (var60 = (SubLObject)ZERO_INTEGER; NIL != var58; var58 = var58.rest(), var59 = var58.first(), var60 = Numbers.add((SubLObject)ONE_INTEGER, var60)) {
            if (NIL != Numbers.evenp(var60)) {
                if (!var60.isZero()) {
                    streams_high.write_string((SubLObject)$ic172$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                streams_high.write_string(Symbols.symbol_name(var59), var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                streams_high.write_string((SubLObject)$ic173$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                streams_high.write_string(module0038.f2624(var59), var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return streams_high.get_output_stream_string(var57);
    }
    
    public static SubLObject f35965(final SubLObject var297) {
        assert NIL != module0035.f2292(var297) : var297;
        final SubLObject var298 = streams_high.make_string_output_stream();
        SubLObject var299 = (SubLObject)T;
        SubLObject var300 = var297;
        SubLObject var301 = (SubLObject)NIL;
        var301 = var300.first();
        while (NIL != var300) {
            SubLObject var303;
            final SubLObject var302 = var303 = var301;
            SubLObject var304 = (SubLObject)NIL;
            SubLObject var305 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var303, var302, (SubLObject)$ic175$);
            var304 = var303.first();
            var303 = (var305 = var303.rest());
            if (NIL == var299) {
                streams_high.write_string((SubLObject)$ic172$, var298, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                var299 = (SubLObject)NIL;
            }
            streams_high.write_string(var304, var298, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string((SubLObject)$ic173$, var298, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string(f35898(module0038.f2624(var305), (SubLObject)UNPROVIDED), var298, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var300 = var300.rest();
            var301 = var300.first();
        }
        return streams_high.get_output_stream_string(var298);
    }
    
    public static SubLObject f35966() {
        final SubLObject var188 = $g4500$.getGlobalValue();
        if (NIL != var188) {
            module0034.f1818(var188);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35967() {
        return module0034.f1829($g4500$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35968() {
        return module0039.f3053((SubLObject)$ic179$);
    }
    
    public static SubLObject f35969() {
        SubLObject var189 = $g4500$.getGlobalValue();
        if (NIL == var189) {
            var189 = module0034.f1934((SubLObject)$ic178$, (SubLObject)$ic180$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var190 = module0034.f1810(var189, (SubLObject)UNPROVIDED);
        if (var190 == $ic114$) {
            var190 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f35968()));
            module0034.f1812(var189, var190, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var190);
    }
    
    public static SubLObject f35970(final SubLObject var302) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ZERO_INTEGER), f35971(var302));
    }
    
    public static SubLObject f35934(final SubLObject var302) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), f35971(var302));
    }
    
    public static SubLObject f35971(final SubLObject var302) {
        final SubLThread var303 = SubLProcess.currentSubLThread();
        final SubLObject var304 = Sequences.search($g4498$.getDynamicValue(var303), var302, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var305 = (SubLObject)(var304.isInteger() ? Sequences.subseq(var302, (SubLObject)ZERO_INTEGER, var304) : NIL);
        final SubLObject var306 = var304.isInteger() ? Sequences.subseq(var302, Numbers.add(var304, Sequences.length($g4498$.getDynamicValue(var303))), (SubLObject)UNPROVIDED) : var302;
        return Values.values(var305, module0038.f2674(var306, f35969(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f35972(final SubLObject var15) {
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic181$, Mapping.mapcar((SubLObject)$ic182$, Functions.apply(Symbols.symbol_function((SubLObject)$ic183$), var15)));
    }
    
    public static SubLObject f35973(final SubLObject var191) {
        return f35898(module0006.f202(var191), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35974(final SubLObject var15, final SubLObject var305, final SubLObject var306, final SubLObject var19, SubLObject var17, SubLObject var235, SubLObject var27, SubLObject var307) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)$ic52$;
        }
        if (var235 == UNPROVIDED) {
            var235 = (SubLObject)NIL;
        }
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)$ic8$;
        }
        if (var307 == UNPROVIDED) {
            var307 = (SubLObject)NIL;
        }
        final SubLThread var308 = SubLProcess.currentSubLThread();
        SubLObject var309 = (SubLObject)NIL;
        SubLObject var310 = (SubLObject)NIL;
        if (var15.isString()) {
            var309 = var15;
        }
        else {
            var309 = f35972(var15);
        }
        final SubLObject var311 = (SubLObject)(var19.eql((SubLObject)$ic8$) ? $ic19$ : var19);
        SubLObject var312 = (SubLObject)NIL;
        try {
            var312 = module0004.f82(var306, var311, (SubLObject)NIL, (SubLObject)$ic22$);
            if (NIL != module0003.f70(var312, var306, var311)) {
                f35885(var312, (SubLObject)ConsesLow.list(new SubLObject[] { $ic25$, var306, $ic7$, var19, $ic5$, var17, $ic26$, var305, $ic4$, var309, $ic9$, NIL, $ic10$, T, $ic12$, var27, $ic13$, $ic8$, $ic14$, NIL }));
                var310 = f35935(var312, var235);
            }
        }
        finally {
            final SubLObject var313 = Threads.$is_thread_performing_cleanupP$.currentBinding(var308);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var308);
                if (NIL != var312) {
                    streams_high.close(var312, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var313, var308);
            }
        }
        var308.resetMultipleValues();
        final SubLObject var314 = f35971(var310);
        final SubLObject var315 = var308.secondMultipleValue();
        var308.resetMultipleValues();
        if (NIL != var307 && NIL != f35938(var314)) {
            return f35975(var314, var235, var27);
        }
        return var315;
    }
    
    public static SubLObject f35975(final SubLObject var304, SubLObject var235, SubLObject var27) {
        if (var235 == UNPROVIDED) {
            var235 = (SubLObject)NIL;
        }
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)$ic8$;
        }
        final SubLThread var305 = SubLProcess.currentSubLThread();
        final SubLObject var306 = module0038.f2738(var304, $g4499$.getDynamicValue(var305), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var307 = (SubLObject)NIL;
        if (NIL == var307) {
            SubLObject var308 = var306;
            SubLObject var309 = (SubLObject)NIL;
            var309 = var308.first();
            while (NIL == var307 && NIL != var308) {
                if (NIL != module0038.f2675(var309, (SubLObject)$ic129$, Symbols.symbol_function((SubLObject)EQUALP))) {
                    var307 = module0038.f2674(var309, (SubLObject)$ic129$, Symbols.symbol_function((SubLObject)EQUALP));
                }
                var308 = var308.rest();
                var309 = var308.first();
            }
        }
        return (NIL != var307) ? f35976(var307, var235, var27, (SubLObject)UNPROVIDED) : module0038.$g916$.getGlobalValue();
    }
    
    public static SubLObject f35977(final SubLObject var8, SubLObject var235, SubLObject var27) {
        if (var235 == UNPROVIDED) {
            var235 = (SubLObject)NIL;
        }
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)$ic184$;
        }
        return f35976(var8, var235, var27, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35976(SubLObject var8, final SubLObject var235, SubLObject var27, SubLObject var307) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)$ic8$;
        }
        if (var307 == UNPROVIDED) {
            var307 = (SubLObject)NIL;
        }
        final SubLThread var308 = SubLProcess.currentSubLThread();
        SubLObject var309 = (SubLObject)NIL;
        if (NIL == f35909(var8)) {
            var8 = Sequences.cconcatenate((SubLObject)$ic131$, var8);
        }
        if (NIL != module0038.f2684(Strings.string_downcase(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic131$) || NIL != module0038.f2684(Strings.string_downcase(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic132$)) {
            var308.resetMultipleValues();
            SubLObject var310 = f35940(var8);
            final SubLObject var311 = var308.secondMultipleValue();
            SubLObject var312 = var308.thirdMultipleValue();
            final SubLObject var313 = var308.fourthMultipleValue();
            var308.resetMultipleValues();
            if (NIL == var310) {
                var310 = var8;
            }
            if (NIL == var312) {
                var312 = (SubLObject)$ic29$;
            }
            var309 = f35974(var313, var312, var310, var311, (SubLObject)$ic6$, var235, var27, var307);
        }
        else if (NIL != module0038.f2684(Strings.string_downcase(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic185$)) {
            final SubLObject var314 = module0038.f2674(var8, (SubLObject)$ic185$, Symbols.symbol_function((SubLObject)EQUALP));
            assert NIL != module0075.f5218(var314) : var314;
            var309 = module0038.f2953(var314, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var309;
    }
    
    public static SubLObject f35978(final SubLObject var8, final SubLObject var313, SubLObject var27, SubLObject var307) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)$ic8$;
        }
        if (var307 == UNPROVIDED) {
            var307 = (SubLObject)NIL;
        }
        final SubLThread var314 = SubLProcess.currentSubLThread();
        SubLObject var315 = (SubLObject)NIL;
        try {
            var314.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var316 = Errors.$error_handler$.currentBinding(var314);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic137$, var314);
                try {
                    final SubLObject var317 = f35976(var8, (SubLObject)NIL, var27, var307);
                    SubLObject var318 = (SubLObject)NIL;
                    try {
                        var318 = compatibility.open_text(var313, (SubLObject)$ic187$);
                        if (!var318.isStream()) {
                            Errors.error((SubLObject)$ic170$, var313);
                        }
                        final SubLObject var319 = var318;
                        print_high.princ(var317, var319);
                    }
                    finally {
                        final SubLObject var52_317 = Threads.$is_thread_performing_cleanupP$.currentBinding(var314);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var314);
                            if (var318.isStream()) {
                                streams_high.close(var318, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var52_317, var314);
                        }
                    }
                }
                catch (Throwable var320) {
                    Errors.handleThrowable(var320, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var316, var314);
            }
        }
        catch (Throwable var321) {
            var315 = Errors.handleThrowable(var321, module0003.$g3$.getGlobalValue());
        }
        finally {
            var314.throwStack.pop();
        }
        return var315;
    }
    
    public static SubLObject f35979() {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        return Numbers.add(module0110.$g1378$.getDynamicValue(var45), module0110.$g1382$.getDynamicValue(var45));
    }
    
    public static SubLObject f35980() {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        return $g4501$.getDynamicValue(var45);
    }
    
    public static SubLObject f35981() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35870", "S#39607");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35871", "S#39608", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35874", "S#39609", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35875", "S#39610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35876", "S#39611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35877", "S#39612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35878", "S#39613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35873", "S#39614", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35879", "S#39615", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35880", "S#39616", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35881", "S#39617", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35884", "S#39618", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35885", "S#39619", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35886", "S#39620", 8, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35889", "S#39621", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35890", "S#39622");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35891", "S#39623", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35888", "S#39624", 7, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35892", "S#39625", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35887", "S#39626", 7, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35883", "S#39627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35894", "S#39628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35895", "S#39629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35897", "S#39630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35896", "S#39631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35898", "S#39632", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35900", "S#39599", 1, 0, false);
        new $f35900$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35899", "S#39633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35872", "S#39634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35901", "S#39635", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35902", "S#39636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35903", "S#39637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35904", "S#39638", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35905", "S#39639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35906", "S#39640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35907", "S#39641", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35909", "URL-P", 1, 0, false);
        new $f35909$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35911", "S#39642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35912", "S#39643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35913", "S#39644", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35908", "S#39645", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35910", "S#39646", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35914", "S#39647", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35915", "S#39648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35916", "S#39649", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35917", "S#39650", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35918", "S#39651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35919", "S#39652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35920", "S#39653", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35921", "S#39654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35922", "S#39655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35923", "S#39656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35924", "S#39657", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35925", "S#39658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35926", "S#39659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35927", "S#39660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35928", "S#39661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35929", "S#39662", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35930", "S#39663", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35931", "S#39664", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35933", "S#39665", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35932", "S#39666", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35936", "S#39667", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35937", "S#39668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35938", "S#39669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35939", "S#39670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35940", "S#39671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35941", "S#39672", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35942", "S#39673", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35943", "S#39674", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35935", "S#39675", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35945", "S#39676");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35944", "S#39677", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35946", "S#39678", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35947", "S#39679", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35882", "S#39680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35893", "S#39681", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35948", "S#39682", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35949", "S#39683");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35950", "S#39684");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35951", "S#39685");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35952", "S#39686");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35953", "S#39687");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35954", "S#39688", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35955", "S#39689", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35956", "S#39690");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35957", "S#39691");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35958", "S#39692");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35959", "S#39693");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0589", "f35960", "S#39694");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35961", "S#39695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35962", "S#39696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35963", "S#39697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35964", "S#39698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35965", "S#39699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35966", "S#39700", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35967", "S#39701", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35968", "S#39702", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35969", "S#39703", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35970", "S#39704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35934", "S#39705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35971", "S#39706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35972", "S#39707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35973", "S#39708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35974", "S#39709", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35975", "S#39710", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35977", "S#39711", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35976", "S#39712", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35978", "S#39713", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35979", "S#39714", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0589", "f35980", "S#39715", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35982() {
        $g4462$ = SubLFiles.deflexical("S#39716", (SubLObject)$ic0$);
        $g4463$ = SubLFiles.deflexical("S#39717", (SubLObject)$ic27$);
        $g4464$ = SubLFiles.deflexical("S#39718", (SubLObject)FIVE_INTEGER);
        $g4465$ = SubLFiles.deflexical("S#39719", (NIL != Symbols.boundp((SubLObject)$ic28$)) ? $g4465$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g4468$ = SubLFiles.deflexical("S#39720", (SubLObject)$ic33$);
        $g4469$ = SubLFiles.deflexical("S#39721", (SubLObject)$ic34$);
        $g4470$ = SubLFiles.deflexical("S#39722", (SubLObject)$ic35$);
        $g4471$ = SubLFiles.deflexical("S#39723", (SubLObject)$ic36$);
        $g4472$ = SubLFiles.deflexical("S#39724", (SubLObject)$ic37$);
        $g4473$ = SubLFiles.deflexical("S#39725", (SubLObject)$ic38$);
        $g4474$ = SubLFiles.deflexical("S#39726", ConsesLow.append($g4472$.getGlobalValue(), $g4473$.getGlobalValue()));
        $g4475$ = SubLFiles.deflexical("S#39727", ConsesLow.append(new SubLObject[] { $g4469$.getGlobalValue(), $g4470$.getGlobalValue(), $g4471$.getGlobalValue(), $g4472$.getGlobalValue(), $g4470$.getGlobalValue() }));
        $g4476$ = SubLFiles.deflexical("S#39728", (SubLObject)$ic41$);
        $g4477$ = SubLFiles.deflexical("S#39729", Mapping.mapcar((SubLObject)$ic42$, $g4476$.getGlobalValue()));
        $g4478$ = SubLFiles.deflexical("S#39730", (SubLObject)$ic43$);
        $g4479$ = SubLFiles.deflexical("S#39731", (SubLObject)$ic44$);
        $g4480$ = SubLFiles.deflexical("S#39732", Mapping.mapcar((SubLObject)$ic42$, $g4479$.getGlobalValue()));
        $g4481$ = SubLFiles.defparameter("S#39733", (SubLObject)NIL);
        $g4482$ = SubLFiles.defparameter("S#39734", (SubLObject)NIL);
        $g4483$ = SubLFiles.deflexical("S#39735", (SubLObject)$ic77$);
        $g4484$ = SubLFiles.deflexical("S#39736", (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_semicolon));
        $g4485$ = SubLFiles.deflexical("S#39737", (SubLObject)ConsesLow.list((SubLObject)$ic79$, (SubLObject)$ic80$, (SubLObject)$ic81$));
        $g4486$ = SubLFiles.deflexical("S#39738", (SubLObject)$ic94$);
        $g4487$ = SubLFiles.deflexical("S#39739", (SubLObject)$ic95$);
        $g4488$ = SubLFiles.defconstant("S#39740", (SubLObject)$ic96$);
        $g4489$ = SubLFiles.defconstant("S#39741", (SubLObject)$ic97$);
        $g4490$ = SubLFiles.deflexical("S#39742", (SubLObject)$ic99$);
        $g4491$ = SubLFiles.deflexical("S#39743", (SubLObject)$ic110$);
        $g4492$ = SubLFiles.deflexical("S#39744", (SubLObject)NIL);
        $g4493$ = SubLFiles.deflexical("S#39745", (SubLObject)NIL);
        $g4494$ = SubLFiles.deflexical("S#39746", (SubLObject)NIL);
        $g4495$ = SubLFiles.defparameter("S#39747", (SubLObject)$ic176$);
        $g4496$ = SubLFiles.defparameter("S#39748", (SubLObject)$ic19$);
        $g4497$ = SubLFiles.defparameter("S#39749", (SubLObject)$ic177$);
        $g4498$ = SubLFiles.defparameter("S#39750", Sequences.cconcatenate(module0006.f203((SubLObject)Characters.CHAR_return), new SubLObject[] { module0006.f203((SubLObject)Characters.CHAR_newline), module0006.f203((SubLObject)Characters.CHAR_return), module0006.f203((SubLObject)Characters.CHAR_newline) }));
        $g4499$ = SubLFiles.defparameter("S#39751", (SubLObject)ConsesLow.list(Sequences.cconcatenate(module0006.f203((SubLObject)Characters.CHAR_return), module0006.f203((SubLObject)Characters.CHAR_newline)), Strings.make_string((SubLObject)ONE_INTEGER, (SubLObject)Characters.CHAR_newline)));
        $g4500$ = SubLFiles.deflexical("S#39752", (SubLObject)NIL);
        $g4501$ = SubLFiles.defparameter("S#39753", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35983() {
        module0003.f57((SubLObject)$ic28$);
        module0027.f1449((SubLObject)$ic102$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic103$, NIL, $ic104$, NIL, $ic105$, NIL, $ic106$, $ic107$, $ic108$, T }), (SubLObject)$ic109$);
        module0034.f1909((SubLObject)$ic111$);
        module0034.f1909((SubLObject)$ic115$);
        module0034.f1909((SubLObject)$ic118$);
        module0034.f1909((SubLObject)$ic178$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f35981();
    }
    
    public void initializeVariables() {
        f35982();
    }
    
    public void runTopLevelForms() {
        f35983();
    }
    
    static {
        me = (SubLFile)new module0589();
        $g4462$ = null;
        $g4463$ = null;
        $g4464$ = null;
        $g4465$ = null;
        $g4468$ = null;
        $g4469$ = null;
        $g4470$ = null;
        $g4471$ = null;
        $g4472$ = null;
        $g4473$ = null;
        $g4474$ = null;
        $g4475$ = null;
        $g4476$ = null;
        $g4477$ = null;
        $g4478$ = null;
        $g4479$ = null;
        $g4480$ = null;
        $g4481$ = null;
        $g4482$ = null;
        $g4483$ = null;
        $g4484$ = null;
        $g4485$ = null;
        $g4486$ = null;
        $g4487$ = null;
        $g4488$ = null;
        $g4489$ = null;
        $g4490$ = null;
        $g4491$ = null;
        $g4492$ = null;
        $g4493$ = null;
        $g4494$ = null;
        $g4495$ = null;
        $g4496$ = null;
        $g4497$ = null;
        $g4498$ = null;
        $g4499$ = null;
        $g4500$ = null;
        $g4501$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeString("text/plain"), (SubLObject)makeString("text/html"));
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("S#9128", "CYC"), makeSymbol("S#688", "CYC"), makeSymbol("S#39754", "CYC"), makeSymbol("&KEY"), makeSymbol("S#9148", "CYC"), ConsesLow.list((SubLObject)makeSymbol("METHOD"), (SubLObject)makeKeyword("GET")), ConsesLow.list((SubLObject)makeSymbol("S#58", "CYC"), (SubLObject)makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)makeSymbol("S#39755", "CYC"), (SubLObject)T), ConsesLow.list((SubLObject)makeSymbol("S#39756", "CYC"), (SubLObject)NIL), makeSymbol("S#59", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#39757", "CYC"), (SubLObject)makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)makeSymbol("S#4660", "CYC"), (SubLObject)makeKeyword("DEFAULT")), makeSymbol("S#39758", "CYC") }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = ConsesLow.list(new SubLObject[] { makeKeyword("QUERY"), makeKeyword("METHOD"), makeKeyword("PORT"), makeKeyword("KEEP-ALIVE?"), makeKeyword("WIDE-NEWLINES?"), makeKeyword("TIMEOUT"), makeKeyword("ACCEPT-TYPES"), makeKeyword("CONTENT-TYPE"), makeKeyword("SOAP-ACTION-URI") });
        $ic3$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic4$ = makeKeyword("QUERY");
        $ic5$ = makeKeyword("METHOD");
        $ic6$ = makeKeyword("GET");
        $ic7$ = makeKeyword("PORT");
        $ic8$ = makeKeyword("DEFAULT");
        $ic9$ = makeKeyword("KEEP-ALIVE?");
        $ic10$ = makeKeyword("WIDE-NEWLINES?");
        $ic11$ = makeKeyword("TIMEOUT");
        $ic12$ = makeKeyword("ACCEPT-TYPES");
        $ic13$ = makeKeyword("CONTENT-TYPE");
        $ic14$ = makeKeyword("SOAP-ACTION-URI");
        $ic15$ = makeUninternedSymbol("US#2E294AC");
        $ic16$ = makeSymbol("CLET");
        $ic17$ = makeSymbol("FIF");
        $ic18$ = ConsesLow.list((SubLObject)makeKeyword("DEFAULT"));
        $ic19$ = makeInteger(80);
        $ic20$ = makeSymbol("S#47", "CYC");
        $ic21$ = makeKeyword("ACCESS-MODE");
        $ic22$ = makeKeyword("PRIVATE");
        $ic23$ = makeSymbol("S#39619", "CYC");
        $ic24$ = makeSymbol("LIST");
        $ic25$ = makeKeyword("MACHINE");
        $ic26$ = makeKeyword("URL");
        $ic27$ = makeString("/a/");
        $ic28$ = makeSymbol("S#39719", "CYC");
        $ic29$ = makeString("/");
        $ic30$ = makeString("/cg?");
        $ic31$ = ConsesLow.list((SubLObject)Characters.CHAR_slash);
        $ic32$ = makeString("Remote-Host");
        $ic33$ = makeString("var KEA_port_from_cyc_base_port = function () {\n  var DEFAULT_PORT_STR = \"80\";\n  var portStr = (window.document.location.port.length > 0) ? window.document.location.port : DEFAULT_PORT_STR;\n  var offset = parseInt(portStr.substring(portStr.length - 1));\n  var port = parseInt(portStr);\n\n  if (offset == 2) return (port + 1);\n  return port;\n}\nif (window==window.top) {\n  var url = \"http://\" + window.document.location.hostname + \":\" + KEA_port_from_cyc_base_port() + \"/browser?toolURL=\" + encodeURIComponent(window.location.href) + \"&sessionId=~A\";\n  window.location.href=url;\n}");
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeInteger(100), (SubLObject)makeString("Continue")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(101), (SubLObject)makeString("Switching Protocols")));
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeInteger(200), (SubLObject)makeString("OK")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(201), (SubLObject)makeString("Created")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(202), (SubLObject)makeString("Accepted")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(203), (SubLObject)makeString("Non-Authoritative Information")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(204), (SubLObject)makeString("No Content")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(205), (SubLObject)makeString("Reset Content")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(206), (SubLObject)makeString("Partial Content")));
        $ic36$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeInteger(300), (SubLObject)makeString("Multiple Choices")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(301), (SubLObject)makeString("Moved Permanently")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(302), (SubLObject)makeString("Found")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(303), (SubLObject)makeString("See Other")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(304), (SubLObject)makeString("Not Modified")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(305), (SubLObject)makeString("Use Proxy")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(306), (SubLObject)makeString("(Unused)")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(307), (SubLObject)makeString("Temporary Redirect")));
        $ic37$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)makeInteger(400), (SubLObject)makeString("Bad Request")), ConsesLow.cons((SubLObject)makeInteger(401), (SubLObject)makeString("Unauthorized")), ConsesLow.cons((SubLObject)makeInteger(403), (SubLObject)makeString("Forbidden")), ConsesLow.cons((SubLObject)makeInteger(404), (SubLObject)makeString("Not Found")), ConsesLow.cons((SubLObject)makeInteger(405), (SubLObject)makeString("Method Not Allowed")), ConsesLow.cons((SubLObject)makeInteger(406), (SubLObject)makeString("Not Acceptable")), ConsesLow.cons((SubLObject)makeInteger(407), (SubLObject)makeString("Proxy Authentication Required")), ConsesLow.cons((SubLObject)makeInteger(408), (SubLObject)makeString("Request Timeout")), ConsesLow.cons((SubLObject)makeInteger(409), (SubLObject)makeString("Conflict")), ConsesLow.cons((SubLObject)makeInteger(410), (SubLObject)makeString("Gone")), ConsesLow.cons((SubLObject)makeInteger(411), (SubLObject)makeString("Length Required")), ConsesLow.cons((SubLObject)makeInteger(412), (SubLObject)makeString("Precondition Failed")), ConsesLow.cons((SubLObject)makeInteger(413), (SubLObject)makeString("Request Entity Too Large")), ConsesLow.cons((SubLObject)makeInteger(414), (SubLObject)makeString("Request-URI Too Long")), ConsesLow.cons((SubLObject)makeInteger(415), (SubLObject)makeString("Unsupported Media Type")), ConsesLow.cons((SubLObject)makeInteger(416), (SubLObject)makeString("Requested Range Not Satisfiable")), ConsesLow.cons((SubLObject)makeInteger(417), (SubLObject)makeString("Expectation Failed")) });
        $ic38$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeInteger(500), (SubLObject)makeString("Internal Server Error")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(501), (SubLObject)makeString("Not Implemented")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(502), (SubLObject)makeString("Bad Gateway")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(503), (SubLObject)makeString("Service Unavailable")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(504), (SubLObject)makeString("Gateway Timeout")), (SubLObject)ConsesLow.cons((SubLObject)makeInteger(505), (SubLObject)makeString("HTTP Version not supported")));
        $ic39$ = makeString("HTTP/1.1 200 OK");
        $ic40$ = makeString("HTTP/1.1 ");
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VERSION"), (SubLObject)makeString("GET ~A HTTP/1.0")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CONNECTION"), (SubLObject)makeString("Connection: ~A")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("USER-AGENT"), (SubLObject)makeString("User-Agent: Cyc/~A/~A")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("HOST"), (SubLObject)makeString("Host: ~A~A")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ACCEPT"), (SubLObject)makeString("Accept: ")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BLANK-LINE"), (SubLObject)NIL));
        $ic42$ = makeSymbol("FIRST");
        $ic43$ = makeString("application/x-www-form-urlencoded");
        $ic44$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeKeyword("VERSION"), (SubLObject)makeString("POST ~A HTTP/1.0")), ConsesLow.list((SubLObject)makeKeyword("CONNECTION"), (SubLObject)makeString("Connection: ~A")), ConsesLow.list((SubLObject)makeKeyword("USER-AGENT"), (SubLObject)makeString("User-Agent: Cyc/~A/~A")), ConsesLow.list((SubLObject)makeKeyword("HOST"), (SubLObject)makeString("Host: ~A~A")), ConsesLow.list((SubLObject)makeKeyword("ACCEPT"), (SubLObject)makeString("Accept: ")), ConsesLow.list((SubLObject)makeKeyword("COOKIES"), (SubLObject)makeString("Cookie: ~A")), ConsesLow.list((SubLObject)makeKeyword("CONTENT-TYPE"), (SubLObject)makeString("Content-type: ~A")), ConsesLow.list((SubLObject)makeKeyword("SOAP-ACTION"), (SubLObject)makeString("SOAPAction: ~A")), ConsesLow.list((SubLObject)makeKeyword("CONTENT-LENGTH"), (SubLObject)makeString("Content-length: ~A")), ConsesLow.list((SubLObject)makeKeyword("BLANK-LINE"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("QUERY"), (SubLObject)makeString("~A")) });
        $ic45$ = makeSymbol("STREAMP");
        $ic46$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#688", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#58", "CYC"), (SubLObject)makeInteger(80)), ConsesLow.list((SubLObject)makeSymbol("METHOD"), (SubLObject)makeKeyword("GET")), makeSymbol("S#39754", "CYC"), makeSymbol("S#9148", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#39755", "CYC"), (SubLObject)T), ConsesLow.list((SubLObject)makeSymbol("S#39756", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#39757", "CYC"), (SubLObject)makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)makeSymbol("S#4660", "CYC"), (SubLObject)makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)makeSymbol("S#39758", "CYC"), (SubLObject)NIL) });
        $ic47$ = ConsesLow.list(new SubLObject[] { makeKeyword("MACHINE"), makeKeyword("PORT"), makeKeyword("METHOD"), makeKeyword("URL"), makeKeyword("QUERY"), makeKeyword("KEEP-ALIVE?"), makeKeyword("WIDE-NEWLINES?"), makeKeyword("ACCEPT-TYPES"), makeKeyword("CONTENT-TYPE"), makeKeyword("SOAP-ACTION-URI") });
        $ic48$ = makeSymbol("KEYWORDP");
        $ic49$ = makeSymbol("STRINGP");
        $ic50$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic51$ = makeSymbol("S#747", "CYC");
        $ic52$ = makeKeyword("POST");
        $ic53$ = makeString("Unsupported HTTP request method : ~S");
        $ic54$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#9148", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("METHOD"), (SubLObject)makeKeyword("GET")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#58", "CYC"), (SubLObject)makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39755", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39756", "CYC"), (SubLObject)NIL), (SubLObject)makeSymbol("S#59", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39757", "CYC"), (SubLObject)makeKeyword("DEFAULT")));
        $ic55$ = ConsesLow.list((SubLObject)makeKeyword("QUERY"), (SubLObject)makeKeyword("METHOD"), (SubLObject)makeKeyword("PORT"), (SubLObject)makeKeyword("KEEP-ALIVE?"), (SubLObject)makeKeyword("WIDE-NEWLINES?"), (SubLObject)makeKeyword("TIMEOUT"), (SubLObject)makeKeyword("ACCEPT-TYPES"));
        $ic56$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39759", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic57$ = makeSymbol("S#39734", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)makeSymbol("S#163", "CYC"), (SubLObject)makeSymbol("S#159", "CYC"));
        $ic59$ = makeKeyword("VERSION");
        $ic60$ = makeKeyword("ACCEPT");
        $ic61$ = makeKeyword("CONNECTION");
        $ic62$ = makeString("Keep-Alive: ~S");
        $ic63$ = makeString("keep-alive");
        $ic64$ = makeString("close");
        $ic65$ = makeKeyword("USER-AGENT");
        $ic66$ = makeKeyword("HOST");
        $ic67$ = makeString(":");
        $ic68$ = makeKeyword("BLANK-LINE");
        $ic69$ = makeKeyword("COOKIES");
        $ic70$ = makeKeyword("CONTENT-LENGTH");
        $ic71$ = makeKeyword("SOAP-ACTION");
        $ic72$ = makeString(", ");
        $ic73$ = makeString("?");
        $ic74$ = makeString("Date: ");
        $ic75$ = makeString("Server: Cyc/");
        $ic76$ = makeString(": ");
        $ic77$ = makeString("Set-Cookie:");
        $ic78$ = makeSymbol("CHAR=");
        $ic79$ = makeString("domain");
        $ic80$ = makeString("expires");
        $ic81$ = makeString("max-age");
        $ic82$ = makeString("");
        $ic83$ = makeString(" $");
        $ic84$ = makeSymbol("S#3962", "CYC");
        $ic85$ = makeSymbol("S#4142", "CYC");
        $ic86$ = makeSymbol("S#39633", "CYC");
        $ic87$ = makeSymbol("S#39599", "CYC");
        $ic88$ = makeString("-_.=");
        $ic89$ = makeInteger(256);
        $ic90$ = makeString("~S");
        $ic91$ = makeString("mailto:");
        $ic92$ = ConsesLow.list((SubLObject)makeString(":"), (SubLObject)makeString("/"));
        $ic93$ = makeSymbol("S#3965", "CYC");
        $ic94$ = ConsesLow.list(new SubLObject[] { makeString("aaa:"), makeString("aaas:"), makeString("acap:"), makeString("cap:"), makeString("cid:"), makeString("crid:"), makeString("data:"), makeString("dav:"), makeString("dict:"), makeString("dns:"), makeString("fax:"), makeString("file:"), makeString("ftp:"), makeString("go:"), makeString("gopher:"), makeString("h323:"), makeString("http:"), makeString("https:"), makeString("im"), makeString("imap:"), makeString("ldap:"), makeString("mailto:"), makeString("mid:"), makeString("news:"), makeString("nfs:"), makeString("nntp:"), makeString("pop:"), makeString("pres:"), makeString("sip:"), makeString("sips:"), makeString("snmp:"), makeString("tel:"), makeString("telnet:"), makeString("urn:"), makeString("wais:"), makeString("xmpp:") });
        $ic95$ = ConsesLow.list(new SubLObject[] { makeString("about:"), makeString("aim:"), makeString("callto:"), makeString("cvs:"), makeString("ed2k:"), makeString("feed:"), makeString("fish:"), makeString("gizmoproject:"), makeString("iax2:"), makeString("irc:"), makeString("ircs:"), makeString("lastfm:"), makeString("ldaps:"), makeString("magnet:"), makeString("mms:"), makeString("msnim:"), makeString("nsfw:"), makeString("psyc:"), makeString("rsync:"), makeString("secondlife:"), makeString("skype:"), makeString("ssh:"), makeString("sftp:"), makeString("smb:"), makeString("sms:"), makeString("soldat:"), makeString("steam:"), makeString("tag:"), makeString("unreal:"), makeString("ut2004:"), makeString("webcal:"), makeString("xfire:"), makeString("ymsgr:") });
        $ic96$ = ConsesLow.list((SubLObject)makeString("http://"), (SubLObject)makeString("https://"), (SubLObject)makeString("ftp://"), (SubLObject)makeString("gopher://"), (SubLObject)makeString("file:"), (SubLObject)makeString("news:"), (SubLObject)makeString("mailto:"), (SubLObject)makeString("anon:"));
        $ic97$ = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_period, (SubLObject)Characters.CHAR_comma, (SubLObject)Characters.CHAR_question, (SubLObject)Characters.CHAR_exclamation, (SubLObject)Characters.CHAR_rparen);
        $ic98$ = makeSymbol("S#39648", "CYC");
        $ic99$ = makeString(";@?%/:=$-_.+!*'(),#&~");
        $ic100$ = makeString("../");
        $ic101$ = makeString("//");
        $ic102$ = makeSymbol("S#39649", "CYC");
        $ic103$ = makeKeyword("TEST");
        $ic104$ = makeKeyword("OWNER");
        $ic105$ = makeKeyword("CLASSES");
        $ic106$ = makeKeyword("KB");
        $ic107$ = makeKeyword("TINY");
        $ic108$ = makeKeyword("WORKING?");
        $ic109$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://example.org"), (SubLObject)makeString("relfile")), (SubLObject)makeString("http://example.org/relfile")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://example.org#"), (SubLObject)makeString("prop")), (SubLObject)makeString("http://example.org#prop")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://example.org/"), (SubLObject)makeString("named")), (SubLObject)makeString("http://example.org/named")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://example.org/#"), (SubLObject)makeString("owes")), (SubLObject)makeString("http://example.org/#owes")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://example.org/dir/file"), (SubLObject)makeString("relfile")), (SubLObject)makeString("http://example.org/dir/relfile")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://example.org/dir/file"), (SubLObject)makeString("../relfile")), (SubLObject)makeString("http://example.org/relfile")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://example.org/dir/file"), (SubLObject)makeString("/absfile")), (SubLObject)makeString("http://example.org/absfile")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://example.org/dir/file"), (SubLObject)makeString("//another.example.org/absfile")), (SubLObject)makeString("http://another.example.org/absfile")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://example.org/dir/file"), (SubLObject)makeString("#foo")), (SubLObject)makeString("http://example.org/dir/file#foo")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://example.org/dir/file"), (SubLObject)makeString("")), (SubLObject)makeString("http://example.org/dir/file")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://foo/"), (SubLObject)makeString("Bar")), (SubLObject)makeString("http://foo/Bar")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://my.example.org/"), (SubLObject)makeString("Name")), (SubLObject)makeString("http://my.example.org/Name")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://purl.org/metadata/dublin_core#"), (SubLObject)makeString("Creator")), (SubLObject)makeString("http://purl.org/metadata/dublin_core#Creator")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://purl.org/metadata/dublin_core#"), (SubLObject)makeString("Title")), (SubLObject)makeString("http://purl.org/metadata/dublin_core#Title")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://random.ioctl.org/#"), (SubLObject)makeString("prop2")), (SubLObject)makeString("http://random.ioctl.org/#prop2")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://random.ioctl.org/#"), (SubLObject)makeString("someProperty")), (SubLObject)makeString("http://random.ioctl.org/#someProperty")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#"), (SubLObject)makeString("_2")), (SubLObject)makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#_2")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/"), (SubLObject)makeString("Manifest.rdf")), (SubLObject)makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/Manifest.rdf")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/nonconclusions005.rdf"), (SubLObject)makeString("premises005.rdf#B")), (SubLObject)makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/premises005.rdf#B")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf"), (SubLObject)makeString("#frag")), (SubLObject)makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf#frag")) });
        $ic110$ = makeString("http://schemas.xmlsoap.org/soap/envelope/");
        $ic111$ = makeSymbol("S#39656", "CYC");
        $ic112$ = makeString("soap:");
        $ic113$ = makeSymbol("S#39744", "CYC");
        $ic114$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic115$ = makeSymbol("S#39660", "CYC");
        $ic116$ = makeSymbol("S#39745", "CYC");
        $ic117$ = makeString("Envelope");
        $ic118$ = makeSymbol("S#39665", "CYC");
        $ic119$ = makeSymbol("S#39746", "CYC");
        $ic120$ = makeString("text/xml; charset=utf-8");
        $ic121$ = makeString("US-ASCII");
        $ic122$ = makeString("xmlns:soap");
        $ic123$ = makeString("Header");
        $ic124$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#1737", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic125$ = makeString("xmlns");
        $ic126$ = makeString("Body");
        $ic127$ = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_slash);
        $ic128$ = makeString("HTTP");
        $ic129$ = makeString("Location: ");
        $ic130$ = makeSymbol("S#3951", "CYC");
        $ic131$ = makeString("http://");
        $ic132$ = makeString("https://");
        $ic133$ = makeInteger(100);
        $ic134$ = ConsesLow.list((SubLObject)makeSymbol("S#39760", "CYC"), (SubLObject)makeSymbol("EXP"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic135$ = ConsesLow.list((SubLObject)NIL);
        $ic136$ = makeSymbol("CATCH-ERROR-MESSAGE");
        $ic137$ = makeSymbol("S#38", "CYC");
        $ic138$ = makeString("~&>> Averted 'connection reset by peer' error !!");
        $ic139$ = makeString("0");
        $ic140$ = makeString(" GMT");
        $ic141$ = ConsesLow.list((SubLObject)makeSymbol("S#32", "CYC"), (SubLObject)makeSymbol("LIST"));
        $ic142$ = makeSymbol("MEMBER");
        $ic143$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("SEARCH")));
        $ic144$ = ConsesLow.list((SubLObject)makeSymbol("LIST"));
        $ic145$ = makeSymbol("CSETQ");
        $ic146$ = makeSymbol("CDR");
        $ic147$ = makeSymbol("S#39683", "CYC");
        $ic148$ = makeSymbol("CAR");
        $ic149$ = ConsesLow.list((SubLObject)makeSymbol("S#39761", "CYC"), (SubLObject)makeSymbol("S#150", "CYC"));
        $ic150$ = makeUninternedSymbol("US#512CA5C");
        $ic151$ = makeSymbol("S#39687", "CYC");
        $ic152$ = makeSymbol("PUNLESS");
        $ic153$ = makeSymbol("STRING-EQUAL");
        $ic154$ = makeSymbol("ERROR");
        $ic155$ = makeString("Invalid input file format. Expected starting ~S and received ~S.~%");
        $ic156$ = makeSymbol("S#39684", "CYC");
        $ic157$ = makeUninternedSymbol("US#512CA5C");
        $ic158$ = makeSymbol("S#39688", "CYC");
        $ic159$ = makeString("Invalid input file format. Expected closing ~S and received ~S.~%");
        $ic160$ = ConsesLow.list((SubLObject)makeSymbol("S#39761", "CYC"), (SubLObject)makeSymbol("S#150", "CYC"), (SubLObject)makeSymbol("S#39762", "CYC"));
        $ic161$ = makeSymbol("PROGN");
        $ic162$ = makeSymbol("S#39690", "CYC");
        $ic163$ = makeSymbol("S#39691", "CYC");
        $ic164$ = ConsesLow.list((SubLObject)makeSymbol("S#39761", "CYC"), (SubLObject)makeSymbol("S#150", "CYC"), (SubLObject)makeSymbol("S#39762", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9672", "CYC"), (SubLObject)NIL));
        $ic165$ = makeUninternedSymbol("US#316A0C0");
        $ic166$ = makeSymbol("PWHEN");
        $ic167$ = makeSymbol("S#39689", "CYC");
        $ic168$ = makeSymbol("S#39692", "CYC");
        $ic169$ = makeKeyword("INPUT");
        $ic170$ = makeString("Unable to open ~S");
        $ic171$ = makeSymbol("S#748", "CYC");
        $ic172$ = makeString("&");
        $ic173$ = makeString("=");
        $ic174$ = makeSymbol("S#3593", "CYC");
        $ic175$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic176$ = makeString("localhost");
        $ic177$ = makeString("/cgi-bin/services");
        $ic178$ = makeSymbol("S#39703", "CYC");
        $ic179$ = makeString("&ufeff;");
        $ic180$ = makeSymbol("S#39752", "CYC");
        $ic181$ = makeString("~{~A=~A~^&~}");
        $ic182$ = makeSymbol("S#39708", "CYC");
        $ic183$ = makeSymbol("APPEND");
        $ic184$ = ConsesLow.list((SubLObject)makeString("text/html"), (SubLObject)makeString("*/*"));
        $ic185$ = makeString("file://");
        $ic186$ = makeSymbol("S#6825", "CYC");
        $ic187$ = makeKeyword("OUTPUT");
    }
    
    public static final class $f35900$UnaryFunction extends UnaryFunction
    {
        public $f35900$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39599"));
        }
        
        public SubLObject processItem(final SubLObject var142) {
            return f35900(var142);
        }
    }
    
    public static final class $f35909$UnaryFunction extends UnaryFunction
    {
        public $f35909$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("URL-P"));
        }
        
        public SubLObject processItem(final SubLObject var142) {
            return f35909(var142);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 939 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/
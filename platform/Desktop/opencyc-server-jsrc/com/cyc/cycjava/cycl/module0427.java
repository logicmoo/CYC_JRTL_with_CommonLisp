package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0427 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0427";
    public static final String myFingerPrint = "eeb7eda00f8bc0c2aad1a98ab7960546d3b52982c05268aec0147b31ec3dc04c";
    private static SubLSymbol $g3475$;
    private static SubLSymbol $g3476$;
    private static SubLSymbol $g3477$;
    public static SubLSymbol $g3478$;
    private static SubLSymbol $g3479$;
    private static SubLSymbol $g3480$;
    private static SubLSymbol $g3481$;
    private static SubLSymbol $g3482$;
    private static SubLSymbol $g3483$;
    public static SubLSymbol $g3484$;
    public static SubLSymbol $g3485$;
    private static SubLSymbol $g3486$;
    private static SubLSymbol $g3487$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLList $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLList $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLList $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLList $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLString $ic76$;
    private static final SubLList $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLFloat $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLList $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLString $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLList $ic124$;
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
    private static final SubLObject $ic139$;
    private static final SubLObject $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLString $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLList $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLString $ic153$;
    private static final SubLList $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLString $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLString $ic158$;
    private static final SubLList $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLString $ic174$;
    private static final SubLString $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLString $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLString $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLList $ic195$;
    private static final SubLList $ic196$;
    private static final SubLString $ic197$;
    private static final SubLList $ic198$;
    private static final SubLString $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLString $ic206$;
    private static final SubLString $ic207$;
    private static final SubLString $ic208$;
    private static final SubLString $ic209$;
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLString $ic213$;
    private static final SubLString $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLList $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLInteger $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLList $ic227$;
    private static final SubLList $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLList $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLSymbol $ic234$;
    
    public static SubLObject f30194() {
        return Sequences.remove((SubLObject)module0427.$ic2$, module0360.f23813(), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30195() {
        return module0427.$g3477$.getGlobalValue();
    }
    
    public static SubLObject f30196() {
        return Sequences.reverse(conses_high.set_difference(module0360.f23811(), (SubLObject)module0427.$ic4$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED));
    }
    
    public static SubLObject f30197(final SubLObject var1, SubLObject var2) {
        if (var2 == module0427.UNPROVIDED) {
            var2 = module0427.$g3476$.getGlobalValue();
        }
        return module0425.f30066(var1, var2);
    }
    
    public static SubLObject f30198(final SubLObject var3, final SubLObject var4) {
        final SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0427.NIL;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)module0427.NIL;
        SubLObject var10_11 = (SubLObject)module0427.NIL;
        while (module0427.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var5, (SubLObject)module0427.$ic5$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var5, (SubLObject)module0427.$ic5$);
            if (module0427.NIL == conses_high.member(var10_11, (SubLObject)module0427.$ic6$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) {
                var9 = (SubLObject)module0427.T;
            }
            if (var10_11 == module0427.$ic7$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0427.NIL != var9 && module0427.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0427.$ic5$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0427.$ic8$, var6);
        final SubLObject var11 = (SubLObject)((module0427.NIL != var10) ? conses_high.cadr(var10) : module0427.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0427.$ic9$, var6);
        final SubLObject var13 = (SubLObject)((module0427.NIL != var12) ? conses_high.cadr(var12) : module0427.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0427.$ic10$, var6);
        final SubLObject var15 = (SubLObject)((module0427.NIL != var14) ? conses_high.cadr(var14) : module0427.NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0427.$ic11$, var6);
        final SubLObject var17 = (SubLObject)((module0427.NIL != var16) ? conses_high.cadr(var16) : module0427.NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)module0427.$ic12$, var6);
        final SubLObject var19 = (SubLObject)((module0427.NIL != var18) ? conses_high.cadr(var18) : module0427.$ic13$);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0427.$ic14$, var6);
        final SubLObject var21 = (SubLObject)((module0427.NIL != var20) ? conses_high.cadr(var20) : module0427.$ic15$);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0427.$ic16$, var6);
        final SubLObject var23 = (SubLObject)((module0427.NIL != var22) ? conses_high.cadr(var22) : module0427.T);
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)module0427.$ic17$, var6);
        final SubLObject var25 = (SubLObject)((module0427.NIL != var24) ? conses_high.cadr(var24) : module0427.NIL);
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)module0427.$ic18$, var6);
        final SubLObject var27 = (SubLObject)((module0427.NIL != var26) ? conses_high.cadr(var26) : module0427.ZERO_INTEGER);
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)module0427.$ic19$, var6);
        final SubLObject var29 = (SubLObject)((module0427.NIL != var28) ? conses_high.cadr(var28) : module0427.NIL);
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0427.$ic20$, var6);
        final SubLObject var31 = (module0427.NIL != var30) ? conses_high.cadr(var30) : module0427.$g3476$.getGlobalValue();
        final SubLObject var32 = (SubLObject)module0427.$ic21$;
        final SubLObject var33 = (SubLObject)module0427.$ic22$;
        return (SubLObject)ConsesLow.list((SubLObject)module0427.$ic23$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var32, var13), (SubLObject)ConsesLow.list(var33, (SubLObject)ConsesLow.list((SubLObject)module0427.$ic24$, var32, (SubLObject)ConsesLow.list((SubLObject)module0427.$ic25$, var32, var31)))), (SubLObject)ConsesLow.list(new SubLObject[] { module0427.$ic26$, module0427.$ic8$, var11, module0427.$ic9$, var33, module0427.$ic10$, var15, module0427.$ic11$, var17, module0427.$ic12$, var19, module0427.$ic14$, var21, module0427.$ic16$, var23, module0427.$ic17$, var25, module0427.$ic18$, var27, module0427.$ic19$, var29 }));
    }
    
    public static SubLObject f30199(final SubLObject var1) {
        final SubLObject var2 = f30197(var1, (SubLObject)module0427.UNPROVIDED);
        return module0424.f29795(var2);
    }
    
    public static SubLObject f30200(final SubLObject var34, final SubLObject var1) {
        final SubLObject var35 = f30197(var1, (SubLObject)module0427.UNPROVIDED);
        return module0424.f29787(var34, var35);
    }
    
    public static SubLObject f30201(final SubLObject var35) {
        return module0424.f29988(var35, module0427.$ic27$, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30202(final SubLObject var35) {
        return module0424.f29988(var35, module0427.$ic28$, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30203(final SubLObject var35) {
        return module0424.f29988(var35, module0427.$ic29$, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30204(final SubLObject var36) {
        return module0259.f16854(var36, module0427.$ic27$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30205(final SubLObject var36) {
        return module0259.f16854(var36, module0427.$ic28$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30206(final SubLObject var36) {
        return module0259.f16854(var36, module0427.$ic29$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30207(final SubLObject var37) {
        final SubLObject var38 = Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), (SubLObject)module0427.$ic30$);
        final SubLObject var39 = Sequences.cconcatenate(var38, new SubLObject[] { module0038.f2638(var37), module0427.$ic31$, module0038.f2638(random.random(Numbers.$most_positive_fixnum$.getGlobalValue())), module0427.$ic32$ });
        if (module0427.NIL != module0075.f5193(var39)) {
            final SubLObject var40 = module0428.f30344(var37);
            module0069.f4941(var40, var39);
            return var40;
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30208(final SubLObject var1) {
        final SubLObject var2 = Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), new SubLObject[] { module0427.$ic30$, var1 });
        return module0069.f4939(var2);
    }
    
    public static SubLObject f30209(SubLObject var40) {
        if (var40 == module0427.UNPROVIDED) {
            var40 = (SubLObject)module0427.NIL;
        }
        if (module0427.NIL != var40) {
            f30210();
        }
        return f30211();
    }
    
    public static SubLObject f30210() {
        final SubLObject var41 = module0427.$g3479$.getGlobalValue();
        if (module0427.NIL != var41) {
            module0034.f1818(var41);
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30212() {
        return module0034.f1829(module0427.$g3479$.getGlobalValue(), (SubLObject)ConsesLow.list(module0427.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30213() {
        return f30214();
    }
    
    public static SubLObject f30211() {
        SubLObject var42 = module0427.$g3479$.getGlobalValue();
        if (module0427.NIL == var42) {
            var42 = module0034.f1934((SubLObject)module0427.$ic33$, (SubLObject)module0427.$ic34$, (SubLObject)module0427.NIL, (SubLObject)module0427.EQ, (SubLObject)module0427.ZERO_INTEGER, (SubLObject)module0427.ZERO_INTEGER);
        }
        SubLObject var43 = module0034.f1810(var42, (SubLObject)module0427.UNPROVIDED);
        if (var43 == module0427.$ic35$) {
            var43 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f30213()));
            module0034.f1812(var42, var43, (SubLObject)module0427.UNPROVIDED);
        }
        return module0034.f1959(var43);
    }
    
    public static SubLObject f30214() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), (SubLObject)module0427.$ic30$);
        assert module0427.NIL != Filesys.directory_p(var46) : var46;
        SubLObject var47 = Filesys.directory(var46, (SubLObject)module0427.T);
        final SubLObject var48 = (SubLObject)module0427.$ic37$;
        final SubLObject var49 = module0012.$silent_progressP$.currentBinding(var44);
        try {
            module0012.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!var48.isString()), var44);
            if (module0427.NIL.isFunctionSpec()) {
                var47 = Sort.sort(var47, (SubLObject)module0427.NIL, (SubLObject)module0427.UNPROVIDED);
            }
            final SubLObject var50 = var47;
            module0012.$g82$.setDynamicValue(var48, var44);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var44);
            module0012.$g83$.setDynamicValue(Sequences.length(var50), var44);
            module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var44);
            final SubLObject var48_50 = module0012.$g75$.currentBinding(var44);
            final SubLObject var51 = module0012.$g76$.currentBinding(var44);
            final SubLObject var52 = module0012.$g77$.currentBinding(var44);
            final SubLObject var53 = module0012.$g78$.currentBinding(var44);
            try {
                module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
                module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
                module0012.$g77$.bind((SubLObject)module0427.T, var44);
                module0012.$g78$.bind(Time.get_universal_time(), var44);
                module0012.f478(module0012.$g82$.getDynamicValue(var44));
                SubLObject var54 = var50;
                SubLObject var55 = (SubLObject)module0427.NIL;
                var55 = var54.first();
                while (module0427.NIL != var54) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var44), module0012.$g83$.getDynamicValue(var44));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var44), (SubLObject)module0427.ONE_INTEGER), var44);
                    var45 = (SubLObject)ConsesLow.cons(module0069.f4939(var55), var45);
                    var54 = var54.rest();
                    var55 = var54.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var53, var44);
                module0012.$g77$.rebind(var52, var44);
                module0012.$g76$.rebind(var51, var44);
                module0012.$g75$.rebind(var48_50, var44);
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var49, var44);
        }
        var45 = module0035.f2269(var45, Symbols.symbol_function((SubLObject)module0427.EQUAL), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
        return Sort.sort(var45, Symbols.symbol_function((SubLObject)module0427.$ic38$), (SubLObject)module0427.$ic39$);
    }
    
    public static SubLObject f30215() {
        final SubLObject var45 = f30209((SubLObject)module0427.UNPROVIDED);
        PrintLow.format((SubLObject)module0427.T, (SubLObject)module0427.$ic40$);
        module0006.f215(module0035.f2515(Mapping.mapcar((SubLObject)module0427.$ic39$, var45), Symbols.symbol_function((SubLObject)module0427.$ic38$), Symbols.symbol_function((SubLObject)module0427.EQ), Symbols.symbol_function((SubLObject)module0427.$ic38$)), (SubLObject)module0427.UNPROVIDED);
        PrintLow.format((SubLObject)module0427.T, (SubLObject)module0427.$ic41$);
        module0006.f215(module0035.f2515(Mapping.mapcar((SubLObject)module0427.$ic39$, module0035.remove_if_not((SubLObject)module0427.$ic42$, var45, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)), Symbols.symbol_function((SubLObject)module0427.$ic38$), Symbols.symbol_function((SubLObject)module0427.EQ), Symbols.symbol_function((SubLObject)module0427.$ic38$)), (SubLObject)module0427.UNPROVIDED);
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30216(SubLObject var40) {
        if (var40 == module0427.UNPROVIDED) {
            var40 = (SubLObject)module0427.NIL;
        }
        if (module0427.NIL != var40) {
            f30217();
        }
        return f30218();
    }
    
    public static SubLObject f30217() {
        final SubLObject var41 = module0427.$g3480$.getGlobalValue();
        if (module0427.NIL != var41) {
            module0034.f1818(var41);
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30219() {
        return module0034.f1829(module0427.$g3480$.getGlobalValue(), (SubLObject)ConsesLow.list(module0427.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30220() {
        return f30221();
    }
    
    public static SubLObject f30218() {
        SubLObject var42 = module0427.$g3480$.getGlobalValue();
        if (module0427.NIL == var42) {
            var42 = module0034.f1934((SubLObject)module0427.$ic43$, (SubLObject)module0427.$ic44$, (SubLObject)module0427.NIL, (SubLObject)module0427.EQ, (SubLObject)module0427.ZERO_INTEGER, (SubLObject)module0427.ZERO_INTEGER);
        }
        SubLObject var43 = module0034.f1810(var42, (SubLObject)module0427.UNPROVIDED);
        if (var43 == module0427.$ic35$) {
            var43 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f30220()));
            module0034.f1812(var42, var43, (SubLObject)module0427.UNPROVIDED);
        }
        return module0034.f1959(var43);
    }
    
    public static SubLObject f30221() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), (SubLObject)module0427.$ic45$);
        assert module0427.NIL != Filesys.directory_p(var46) : var46;
        SubLObject var47 = Filesys.directory(var46, (SubLObject)module0427.T);
        final SubLObject var48 = (SubLObject)module0427.$ic46$;
        final SubLObject var49 = module0012.$silent_progressP$.currentBinding(var44);
        try {
            module0012.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!var48.isString()), var44);
            if (module0427.NIL.isFunctionSpec()) {
                var47 = Sort.sort(var47, (SubLObject)module0427.NIL, (SubLObject)module0427.UNPROVIDED);
            }
            final SubLObject var50 = var47;
            module0012.$g82$.setDynamicValue(var48, var44);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var44);
            module0012.$g83$.setDynamicValue(Sequences.length(var50), var44);
            module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var44);
            final SubLObject var48_57 = module0012.$g75$.currentBinding(var44);
            final SubLObject var51 = module0012.$g76$.currentBinding(var44);
            final SubLObject var52 = module0012.$g77$.currentBinding(var44);
            final SubLObject var53 = module0012.$g78$.currentBinding(var44);
            try {
                module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
                module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
                module0012.$g77$.bind((SubLObject)module0427.T, var44);
                module0012.$g78$.bind(Time.get_universal_time(), var44);
                module0012.f478(module0012.$g82$.getDynamicValue(var44));
                SubLObject var54 = var50;
                SubLObject var55 = (SubLObject)module0427.NIL;
                var55 = var54.first();
                while (module0427.NIL != var54) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var44), module0012.$g83$.getDynamicValue(var44));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var44), (SubLObject)module0427.ONE_INTEGER), var44);
                    var45 = (SubLObject)ConsesLow.cons(module0069.f4939(var55), var45);
                    var54 = var54.rest();
                    var55 = var54.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var53, var44);
                module0012.$g77$.rebind(var52, var44);
                module0012.$g76$.rebind(var51, var44);
                module0012.$g75$.rebind(var48_57, var44);
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var49, var44);
        }
        var45 = module0035.f2269(var45, Symbols.symbol_function((SubLObject)module0427.EQUAL), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
        return Sort.sort(var45, Symbols.symbol_function((SubLObject)module0427.$ic38$), (SubLObject)module0427.$ic39$);
    }
    
    public static SubLObject f30222() {
        final SubLObject var56 = f30216((SubLObject)module0427.UNPROVIDED);
        PrintLow.format((SubLObject)module0427.T, (SubLObject)module0427.$ic47$, Sequences.length(var56));
        module0006.f215(module0035.f2515(Mapping.mapcar((SubLObject)module0427.$ic39$, var56), Symbols.symbol_function((SubLObject)module0427.$ic38$), Symbols.symbol_function((SubLObject)module0427.EQ), Symbols.symbol_function((SubLObject)module0427.$ic38$)), (SubLObject)module0427.UNPROVIDED);
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30223(final SubLObject var45) {
        final SubLObject var46 = module0428.f30364(var45);
        final SubLObject var47 = Sequences.length(module0428.f30340(var46));
        final SubLObject var48 = Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), (SubLObject)module0427.$ic45$);
        final SubLObject var49 = Sequences.cconcatenate(var48, new SubLObject[] { module0038.f2638(var47), module0427.$ic31$, module0038.f2638(random.random(Numbers.$most_positive_fixnum$.getGlobalValue())), module0427.$ic32$ });
        if (module0427.NIL != module0075.f5193(var49)) {
            module0069.f4941(var46, var49);
            return var46;
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30224(SubLObject var59, SubLObject var60) {
        if (var59 == module0427.UNPROVIDED) {
            var59 = (SubLObject)module0427.TWO_INTEGER;
        }
        if (var60 == module0427.UNPROVIDED) {
            var60 = Numbers.$most_positive_fixnum$.getGlobalValue();
        }
        SubLObject var61 = f30209((SubLObject)module0427.UNPROVIDED);
        var61 = Mapping.mapcar((SubLObject)module0427.$ic48$, module0035.remove_if_not((SubLObject)module0427.$ic42$, var61, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED));
        SubLObject var62 = (SubLObject)module0427.NIL;
        SubLObject var63 = var61;
        SubLObject var64 = (SubLObject)module0427.NIL;
        var64 = var63.first();
        while (module0427.NIL != var63) {
            if (module0428.f30341(var64).numGE(var59) && module0428.f30341(var64).numLE(var60)) {
                var62 = (SubLObject)ConsesLow.cons(var64, var62);
            }
            var63 = var63.rest();
            var64 = var63.first();
        }
        var61 = Sequences.nreverse(var62);
        while (true) {
            final SubLObject var65 = f30223(var61);
            final SubLObject var66 = module0428.f30341(var65);
            PrintLow.format((SubLObject)module0427.T, (SubLObject)module0427.$ic49$, var66);
            streams_high.force_output((SubLObject)module0427.UNPROVIDED);
        }
    }
    
    public static SubLObject f30225(SubLObject var40) {
        if (var40 == module0427.UNPROVIDED) {
            var40 = (SubLObject)module0427.NIL;
        }
        if (module0427.NIL != var40) {
            f30226();
        }
        return f30227();
    }
    
    public static SubLObject f30226() {
        final SubLObject var41 = module0427.$g3481$.getGlobalValue();
        if (module0427.NIL != var41) {
            module0034.f1818(var41);
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30228() {
        return module0034.f1829(module0427.$g3481$.getGlobalValue(), (SubLObject)ConsesLow.list(module0427.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30229() {
        return f30230();
    }
    
    public static SubLObject f30227() {
        SubLObject var42 = module0427.$g3481$.getGlobalValue();
        if (module0427.NIL == var42) {
            var42 = module0034.f1934((SubLObject)module0427.$ic50$, (SubLObject)module0427.$ic51$, (SubLObject)module0427.NIL, (SubLObject)module0427.EQ, (SubLObject)module0427.ZERO_INTEGER, (SubLObject)module0427.ZERO_INTEGER);
        }
        SubLObject var43 = module0034.f1810(var42, (SubLObject)module0427.UNPROVIDED);
        if (var43 == module0427.$ic35$) {
            var43 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f30229()));
            module0034.f1812(var42, var43, (SubLObject)module0427.UNPROVIDED);
        }
        return module0034.f1959(var43);
    }
    
    public static SubLObject f30230() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), (SubLObject)module0427.$ic52$);
        assert module0427.NIL != Filesys.directory_p(var46) : var46;
        SubLObject var47 = Filesys.directory(var46, (SubLObject)module0427.T);
        final SubLObject var48 = (SubLObject)module0427.$ic53$;
        final SubLObject var49 = module0012.$silent_progressP$.currentBinding(var44);
        try {
            module0012.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!var48.isString()), var44);
            if (module0427.NIL.isFunctionSpec()) {
                var47 = Sort.sort(var47, (SubLObject)module0427.NIL, (SubLObject)module0427.UNPROVIDED);
            }
            final SubLObject var50 = var47;
            module0012.$g82$.setDynamicValue(var48, var44);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var44);
            module0012.$g83$.setDynamicValue(Sequences.length(var50), var44);
            module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var44);
            final SubLObject var48_65 = module0012.$g75$.currentBinding(var44);
            final SubLObject var51 = module0012.$g76$.currentBinding(var44);
            final SubLObject var52 = module0012.$g77$.currentBinding(var44);
            final SubLObject var53 = module0012.$g78$.currentBinding(var44);
            try {
                module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
                module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
                module0012.$g77$.bind((SubLObject)module0427.T, var44);
                module0012.$g78$.bind(Time.get_universal_time(), var44);
                module0012.f478(module0012.$g82$.getDynamicValue(var44));
                SubLObject var54 = var50;
                SubLObject var55 = (SubLObject)module0427.NIL;
                var55 = var54.first();
                while (module0427.NIL != var54) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var44), module0012.$g83$.getDynamicValue(var44));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var44), (SubLObject)module0427.ONE_INTEGER), var44);
                    var45 = (SubLObject)ConsesLow.cons(module0069.f4939(var55), var45);
                    var54 = var54.rest();
                    var55 = var54.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var53, var44);
                module0012.$g77$.rebind(var52, var44);
                module0012.$g76$.rebind(var51, var44);
                module0012.$g75$.rebind(var48_65, var44);
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var49, var44);
        }
        var45 = module0035.f2269(var45, Symbols.symbol_function((SubLObject)module0427.EQUAL), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
        return Sort.sort(var45, Symbols.symbol_function((SubLObject)module0427.$ic38$), (SubLObject)module0427.$ic39$);
    }
    
    public static SubLObject f30231() {
        final SubLObject var64 = f30225((SubLObject)module0427.UNPROVIDED);
        PrintLow.format((SubLObject)module0427.T, (SubLObject)module0427.$ic54$, Sequences.length(var64));
        module0006.f215(module0035.f2515(Mapping.mapcar((SubLObject)module0427.$ic39$, var64), Symbols.symbol_function((SubLObject)module0427.$ic38$), Symbols.symbol_function((SubLObject)module0427.EQ), Symbols.symbol_function((SubLObject)module0427.$ic38$)), (SubLObject)module0427.UNPROVIDED);
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30232(SubLObject var59, SubLObject var60) {
        if (var59 == module0427.UNPROVIDED) {
            var59 = (SubLObject)module0427.TWO_INTEGER;
        }
        if (var60 == module0427.UNPROVIDED) {
            var60 = Numbers.$most_positive_fixnum$.getGlobalValue();
        }
        final SubLObject var61 = f30216((SubLObject)module0427.UNPROVIDED);
        final SubLObject var62 = Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), (SubLObject)module0427.$ic52$);
        while (true) {
            final SubLObject var63 = module0035.f2099(var61);
            final SubLObject var64 = module0428.f30341(var63);
            if (var64.numGE(var59) && var64.numLE(var60)) {
                final SubLObject var65 = module0428.f30368(var63);
                final SubLObject var66 = Sequences.length(module0428.f30340(var65));
                final SubLObject var67 = Sequences.cconcatenate(var62, new SubLObject[] { module0038.f2638(var66), module0427.$ic31$, module0038.f2638(random.random(Numbers.$most_positive_fixnum$.getGlobalValue())), module0427.$ic32$ });
                if (module0427.NIL == module0075.f5193(var67)) {
                    continue;
                }
                module0069.f4941(var65, var67);
                PrintLow.format((SubLObject)module0427.T, (SubLObject)module0427.$ic49$, var66);
                streams_high.force_output((SubLObject)module0427.UNPROVIDED);
            }
        }
    }
    
    public static SubLObject f30233() {
        return Numbers.add(f30234(), f30235());
    }
    
    public static SubLObject f30234() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.ZERO_INTEGER;
        final SubLObject var46 = Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), (SubLObject)module0427.$ic45$);
        assert module0427.NIL != Filesys.directory_p(var46) : var46;
        SubLObject var47 = Filesys.directory(var46, (SubLObject)module0427.T);
        final SubLObject var48 = (SubLObject)module0427.$ic55$;
        final SubLObject var49 = module0012.$silent_progressP$.currentBinding(var44);
        try {
            module0012.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!var48.isString()), var44);
            if (module0427.NIL.isFunctionSpec()) {
                var47 = Sort.sort(var47, (SubLObject)module0427.NIL, (SubLObject)module0427.UNPROVIDED);
            }
            final SubLObject var50 = var47;
            module0012.$g82$.setDynamicValue(var48, var44);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var44);
            module0012.$g83$.setDynamicValue(Sequences.length(var50), var44);
            module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var44);
            final SubLObject var48_68 = module0012.$g75$.currentBinding(var44);
            final SubLObject var51 = module0012.$g76$.currentBinding(var44);
            final SubLObject var52 = module0012.$g77$.currentBinding(var44);
            final SubLObject var53 = module0012.$g78$.currentBinding(var44);
            try {
                module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
                module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
                module0012.$g77$.bind((SubLObject)module0427.T, var44);
                module0012.$g78$.bind(Time.get_universal_time(), var44);
                module0012.f478(module0012.$g82$.getDynamicValue(var44));
                SubLObject var54 = var50;
                SubLObject var55 = (SubLObject)module0427.NIL;
                var55 = var54.first();
                while (module0427.NIL != var54) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var44), module0012.$g83$.getDynamicValue(var44));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var44), (SubLObject)module0427.ONE_INTEGER), var44);
                    if (module0427.NIL != f30236(var55, (SubLObject)module0427.T)) {
                        var45 = Numbers.add(var45, (SubLObject)module0427.ONE_INTEGER);
                    }
                    var54 = var54.rest();
                    var55 = var54.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var53, var44);
                module0012.$g77$.rebind(var52, var44);
                module0012.$g76$.rebind(var51, var44);
                module0012.$g75$.rebind(var48_68, var44);
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var49, var44);
        }
        return var45;
    }
    
    public static SubLObject f30235() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.ZERO_INTEGER;
        final SubLObject var46 = Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), (SubLObject)module0427.$ic52$);
        assert module0427.NIL != Filesys.directory_p(var46) : var46;
        SubLObject var47 = Filesys.directory(var46, (SubLObject)module0427.T);
        final SubLObject var48 = (SubLObject)module0427.$ic56$;
        final SubLObject var49 = module0012.$silent_progressP$.currentBinding(var44);
        try {
            module0012.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!var48.isString()), var44);
            if (module0427.NIL.isFunctionSpec()) {
                var47 = Sort.sort(var47, (SubLObject)module0427.NIL, (SubLObject)module0427.UNPROVIDED);
            }
            final SubLObject var50 = var47;
            module0012.$g82$.setDynamicValue(var48, var44);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var44);
            module0012.$g83$.setDynamicValue(Sequences.length(var50), var44);
            module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var44);
            final SubLObject var48_69 = module0012.$g75$.currentBinding(var44);
            final SubLObject var51 = module0012.$g76$.currentBinding(var44);
            final SubLObject var52 = module0012.$g77$.currentBinding(var44);
            final SubLObject var53 = module0012.$g78$.currentBinding(var44);
            try {
                module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
                module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
                module0012.$g77$.bind((SubLObject)module0427.T, var44);
                module0012.$g78$.bind(Time.get_universal_time(), var44);
                module0012.f478(module0012.$g82$.getDynamicValue(var44));
                SubLObject var54 = var50;
                SubLObject var55 = (SubLObject)module0427.NIL;
                var55 = var54.first();
                while (module0427.NIL != var54) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var44), module0012.$g83$.getDynamicValue(var44));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var44), (SubLObject)module0427.ONE_INTEGER), var44);
                    if (module0427.NIL != f30236(var55, (SubLObject)module0427.NIL)) {
                        var45 = Numbers.add(var45, (SubLObject)module0427.ONE_INTEGER);
                    }
                    var54 = var54.rest();
                    var55 = var54.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var53, var44);
                module0012.$g77$.rebind(var52, var44);
                module0012.$g76$.rebind(var51, var44);
                module0012.$g75$.rebind(var48_69, var44);
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var49, var44);
        }
        return var45;
    }
    
    public static SubLObject f30236(final SubLObject var1, final SubLObject var70) {
        final SubLObject var71 = module0069.f4939(var1);
        final SubLObject var72 = module0428.f30342(var71);
        final SubLObject var73 = module0428.f30340(var71);
        final SubLObject var74 = module0428.f30341(var71);
        final SubLObject var75 = f30237(var1);
        if (module0427.NIL == constants_high_oc.f10737(var75)) {
            final SubLObject var76 = module0543.f33623(var75, (SubLObject)module0427.UNPROVIDED);
            if (module0427.NIL != var70) {
                module0543.f33631((SubLObject)ConsesLow.listS(module0427.$ic57$, var76, (SubLObject)module0427.$ic58$), module0427.$ic59$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
            }
            else {
                module0543.f33631((SubLObject)ConsesLow.listS(module0427.$ic57$, var76, (SubLObject)module0427.$ic60$), module0427.$ic59$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
            }
            module0543.f33631(module0423.f29546(var72, var76), module0427.$ic61$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
            module0543.f33631((SubLObject)ConsesLow.list(module0427.$ic62$, module0427.$ic63$, var74, var76), module0427.$ic61$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
            module0543.f33658((SubLObject)module0427.$ic64$, module0427.$ic65$);
            module0543.f33631((SubLObject)ConsesLow.list(module0427.$ic62$, module0427.$ic66$, module0202.f12787(var73, (SubLObject)module0427.UNPROVIDED), var76), module0427.$ic61$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
            module0543.f33631((SubLObject)module0427.$ic64$, module0427.$ic65$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
            return var76;
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30237(final SubLObject var1) {
        return Sequences.cconcatenate((SubLObject)module0427.$ic67$, f30238(var1));
    }
    
    public static SubLObject f30238(final SubLObject var1) {
        return module0038.f2622(module0038.f2703(module0038.f2703(conses_high.last(module0038.f2752(var1, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_slash)), (SubLObject)module0427.UNPROVIDED).first(), (SubLObject)Characters.CHAR_hyphen), (SubLObject)Characters.CHAR_hyphen), (SubLObject)Characters.CHAR_period);
    }
    
    public static SubLObject f30239(final SubLObject var36) {
        final SubLObject var37 = constants_high_oc.f10743(var36);
        return module0038.f2703(var37, (SubLObject)Characters.CHAR_hyphen);
    }
    
    public static SubLObject f30240(final SubLObject var36) {
        return conses_high.getf(module0423.f29573(var36), (SubLObject)module0427.$ic68$, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30241(final SubLObject var36) {
        final SubLObject var37 = f30239(var36);
        final SubLObject var38 = f30240(var36);
        return Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), new SubLObject[] { module0427.$ic30$, module0038.f2638(var38), module0427.$ic31$, var37, module0427.$ic32$ });
    }
    
    public static SubLObject f30242(final SubLObject var36) {
        final SubLObject var37 = f30239(var36);
        final SubLObject var38 = f30240(var36);
        return Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), new SubLObject[] { module0427.$ic45$, module0038.f2638(var38), module0427.$ic31$, var37, module0427.$ic32$ });
    }
    
    public static SubLObject f30243(final SubLObject var36) {
        final SubLObject var37 = f30239(var36);
        final SubLObject var38 = f30240(var36);
        return Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), new SubLObject[] { module0427.$ic52$, module0038.f2638(var38), module0427.$ic31$, var37, module0427.$ic32$ });
    }
    
    public static SubLObject f30244(final SubLObject var36) {
        SubLObject var37 = (SubLObject)module0427.ZERO_INTEGER;
        final SubLObject var38 = f30241(var36);
        final SubLObject var39 = f30242(var36);
        final SubLObject var40 = f30243(var36);
        if (module0427.NIL != module0075.f5196(var38)) {
            var37 = Numbers.add(var37, (SubLObject)module0427.ONE_INTEGER);
        }
        if (module0427.NIL != module0075.f5196(var39)) {
            var37 = Numbers.add(var37, (SubLObject)module0427.ONE_INTEGER);
        }
        if (module0427.NIL != module0075.f5196(var40)) {
            var37 = Numbers.add(var37, (SubLObject)module0427.ONE_INTEGER);
        }
        return var37;
    }
    
    public static SubLObject f30245(SubLObject var80) {
        if (var80 == module0427.UNPROVIDED) {
            var80 = (SubLObject)module0427.NIL;
        }
        SubLObject var81 = (SubLObject)module0427.ZERO_INTEGER;
        var81 = Numbers.add(var81, f30246(Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), (SubLObject)module0427.$ic30$), var80));
        var81 = Numbers.add(var81, f30246(Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), (SubLObject)module0427.$ic45$), var80));
        var81 = Numbers.add(var81, f30246(Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), (SubLObject)module0427.$ic52$), var80));
        return var81;
    }
    
    public static SubLObject f30246(final SubLObject var2, final SubLObject var80) {
        final SubLThread var81 = SubLProcess.currentSubLThread();
        SubLObject var82 = (SubLObject)module0427.ZERO_INTEGER;
        final SubLObject var83 = module0077.f5313(Symbols.symbol_function((SubLObject)module0427.EQUAL), (SubLObject)module0427.UNPROVIDED);
        assert module0427.NIL != Filesys.directory_p(var2) : var2;
        SubLObject var84 = Filesys.directory(var2, (SubLObject)module0427.T);
        final SubLObject var85 = (SubLObject)module0427.$ic69$;
        final SubLObject var86 = module0012.$silent_progressP$.currentBinding(var81);
        try {
            module0012.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!var85.isString()), var81);
            if (module0427.NIL.isFunctionSpec()) {
                var84 = Sort.sort(var84, (SubLObject)module0427.NIL, (SubLObject)module0427.UNPROVIDED);
            }
            final SubLObject var87 = var84;
            module0012.$g82$.setDynamicValue(var85, var81);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var81);
            module0012.$g83$.setDynamicValue(Sequences.length(var87), var81);
            module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var81);
            final SubLObject var48_82 = module0012.$g75$.currentBinding(var81);
            final SubLObject var88 = module0012.$g76$.currentBinding(var81);
            final SubLObject var89 = module0012.$g77$.currentBinding(var81);
            final SubLObject var90 = module0012.$g78$.currentBinding(var81);
            try {
                module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var81);
                module0012.$g76$.bind((SubLObject)module0427.NIL, var81);
                module0012.$g77$.bind((SubLObject)module0427.T, var81);
                module0012.$g78$.bind(Time.get_universal_time(), var81);
                module0012.f478(module0012.$g82$.getDynamicValue(var81));
                SubLObject var91 = var87;
                SubLObject var92 = (SubLObject)module0427.NIL;
                var92 = var91.first();
                while (module0427.NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var81), module0012.$g83$.getDynamicValue(var81));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var81), (SubLObject)module0427.ONE_INTEGER), var81);
                    final SubLObject var93 = module0069.f4939(var92);
                    if (module0427.NIL != module0077.f5320(var93, var83)) {
                        if (module0427.NIL != var80) {
                            module0075.f5196(var92);
                        }
                        var82 = Numbers.add(var82, (SubLObject)module0427.ONE_INTEGER);
                    }
                    else {
                        module0077.f5326(var93, var83);
                    }
                    var91 = var91.rest();
                    var92 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var81);
                module0012.$g77$.rebind(var89, var81);
                module0012.$g76$.rebind(var88, var81);
                module0012.$g75$.rebind(var48_82, var81);
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var86, var81);
        }
        return var82;
    }
    
    public static SubLObject f30247(SubLObject var80) {
        if (var80 == module0427.UNPROVIDED) {
            var80 = (SubLObject)module0427.NIL;
        }
        final SubLThread var81 = SubLProcess.currentSubLThread();
        SubLObject var82 = (SubLObject)module0427.ZERO_INTEGER;
        final SubLObject var83 = module0077.f5313(Symbols.symbol_function((SubLObject)module0427.EQUAL), (SubLObject)module0427.UNPROVIDED);
        final SubLObject var84 = module0067.f4880(Symbols.symbol_function((SubLObject)module0427.EQUAL), (SubLObject)module0427.UNPROVIDED);
        SubLObject var85 = module0259.f16848(module0427.$ic29$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
        SubLObject var86 = (SubLObject)module0427.NIL;
        var86 = var85.first();
        while (module0427.NIL != var85) {
            SubLObject var87 = (SubLObject)module0427.NIL;
            SubLObject var88 = (SubLObject)module0427.NIL;
            try {
                var81.throwStack.push(module0427.$ic70$);
                final SubLObject var89 = Errors.$error_handler$.currentBinding(var81);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0427.$ic71$), var81);
                    try {
                        var87 = module0423.f29563(var86);
                    }
                    catch (Throwable var90) {
                        Errors.handleThrowable(var90, (SubLObject)module0427.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var89, var81);
                }
            }
            catch (Throwable var91) {
                var88 = Errors.handleThrowable(var91, (SubLObject)module0427.$ic70$);
            }
            finally {
                var81.throwStack.pop();
            }
            module0084.f5762(var84, var87, var86);
            if (module0427.NIL == var87 || module0427.NIL != module0077.f5320(var87, var83)) {
                if (module0427.NIL != var80) {
                    module0543.f33632(var86);
                    f30244(var86);
                }
                var82 = Numbers.add(var82, (SubLObject)module0427.ONE_INTEGER);
            }
            else {
                module0077.f5326(var87, var83);
            }
            var85 = var85.rest();
            var86 = var85.first();
        }
        return Values.values(var84, var82);
    }
    
    public static SubLObject f30248() {
        SubLObject var88 = (SubLObject)module0427.NIL;
        SubLObject var89 = (SubLObject)module0427.NIL;
        SubLObject var90 = (SubLObject)module0427.ZERO_INTEGER;
        var88 = f30199((SubLObject)module0427.$ic72$);
        var89 = f30199((SubLObject)module0427.$ic73$);
        final SubLObject var91 = module0424.f29696(var89);
        SubLObject var93;
        final SubLObject var92 = var93 = module0424.f29688(var91);
        SubLObject var94 = (SubLObject)module0427.NIL;
        var94 = var93.first();
        while (module0427.NIL != var93) {
            var90 = Numbers.add(var90, (SubLObject)module0427.ONE_INTEGER);
            module0543.f33631((SubLObject)ConsesLow.listS(module0427.$ic57$, var94, (SubLObject)module0427.$ic74$), module0427.$ic59$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
            module0543.f33658((SubLObject)ConsesLow.listS(module0427.$ic57$, var94, (SubLObject)module0427.$ic60$), module0427.$ic59$);
            module0543.f33658((SubLObject)ConsesLow.listS(module0427.$ic57$, var94, (SubLObject)module0427.$ic58$), module0427.$ic59$);
            var93 = var93.rest();
            var94 = var93.first();
        }
        final SubLObject var95 = module0424.f29955(var88);
        final SubLObject var96 = module0424.f29688(var95);
        SubLObject var98;
        final SubLObject var97 = var98 = module0259.f16841(module0427.$ic75$, var96, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
        SubLObject var99 = (SubLObject)module0427.NIL;
        var99 = var98.first();
        while (module0427.NIL != var98) {
            var90 = Numbers.add(var90, (SubLObject)module0427.ONE_INTEGER);
            module0543.f33631((SubLObject)ConsesLow.listS(module0427.$ic57$, var99, (SubLObject)module0427.$ic74$), module0427.$ic59$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
            module0543.f33658((SubLObject)ConsesLow.listS(module0427.$ic57$, var99, (SubLObject)module0427.$ic58$), module0427.$ic59$);
            var98 = var98.rest();
            var99 = var98.first();
        }
        return var90;
    }
    
    public static SubLObject f30249() {
        SubLObject var30 = (SubLObject)module0427.ZERO_INTEGER;
        final SubLObject var31 = f30199((SubLObject)module0427.$ic76$);
        final SubLObject var32 = module0424.f29955(var31);
        SubLObject var34;
        final SubLObject var33 = var34 = module0424.f29688(var32);
        SubLObject var35 = (SubLObject)module0427.NIL;
        var35 = var34.first();
        while (module0427.NIL != var34) {
            var30 = Numbers.add(var30, (SubLObject)module0427.ONE_INTEGER);
            module0543.f33631((SubLObject)ConsesLow.listS(module0427.$ic57$, var35, (SubLObject)module0427.$ic77$), module0427.$ic59$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
            var34 = var34.rest();
            var35 = var34.first();
        }
        return var30;
    }
    
    public static SubLObject f30250() {
        return Numbers.add(new SubLObject[] { f30251(module0427.$ic27$, module0427.$ic78$, module0427.$ic79$), f30251(module0427.$ic28$, module0427.$ic80$, module0427.$ic81$), f30251(module0427.$ic75$, module0427.$ic82$, module0427.$ic83$), f30251(module0427.$ic84$, module0427.$ic85$, module0427.$ic86$) });
    }
    
    public static SubLObject f30251(final SubLObject var98, final SubLObject var99, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        final SubLObject var102 = module0035.f2097(module0259.f16848(var98, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED));
        final SubLObject var103 = Sequences.length(var102);
        final SubLObject var104 = Numbers.round(Numbers.multiply(var103, (SubLObject)module0427.$ic87$), (SubLObject)module0427.UNPROVIDED);
        final SubLObject var105 = module0035.f2124(var104, var102);
        final SubLObject var106 = module0035.f2129(Numbers.subtract(var103, var104), var102);
        if (module0427.NIL == Errors.$ignore_mustsP$.getDynamicValue(var101) && module0427.NIL != module0035.f2180(var105, var106, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) {
            Errors.error((SubLObject)module0427.$ic88$);
        }
        SubLObject var107 = var105;
        SubLObject var108 = (SubLObject)module0427.NIL;
        var108 = var107.first();
        while (module0427.NIL != var107) {
            module0543.f33631((SubLObject)ConsesLow.list(module0427.$ic57$, var108, var99), module0427.$ic59$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
            module0543.f33658((SubLObject)ConsesLow.list(module0427.$ic57$, var108, var98), module0427.$ic59$);
            var107 = var107.rest();
            var108 = var107.first();
        }
        var107 = var106;
        var108 = (SubLObject)module0427.NIL;
        var108 = var107.first();
        while (module0427.NIL != var107) {
            module0543.f33631((SubLObject)ConsesLow.list(module0427.$ic57$, var108, var100), module0427.$ic59$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
            module0543.f33658((SubLObject)ConsesLow.list(module0427.$ic57$, var108, var98), module0427.$ic59$);
            var107 = var107.rest();
            var108 = var107.first();
        }
        return var103;
    }
    
    public static SubLObject f30252(final SubLObject var106) {
        if (module0427.NIL != module0178.f11361(var106, (SubLObject)module0427.UNPROVIDED)) {
            f30253(var106);
            if (module0427.NIL != module0178.f11361(var106, (SubLObject)module0427.UNPROVIDED)) {
                Errors.warn((SubLObject)module0427.$ic89$, var106);
                f30254(var106);
                if (module0427.NIL != module0178.f11361(var106, (SubLObject)module0427.UNPROVIDED)) {
                    Errors.warn((SubLObject)module0427.$ic90$, var106);
                    f30255(var106);
                    if (module0427.NIL != module0178.f11361(var106, (SubLObject)module0427.UNPROVIDED)) {
                        streams_high.force_output((SubLObject)module0427.UNPROVIDED);
                        Errors.warn((SubLObject)module0427.$ic91$, var106);
                        module0178.f11369(var106);
                    }
                }
            }
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30253(final SubLObject var106) {
        final SubLObject var107 = module0178.f11303(var106);
        final SubLObject var108 = module0178.f11287(var106);
        module0540.f33518(var107, var108);
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30254(final SubLObject var106) {
        final SubLObject var107 = module0178.f11282(var106);
        final SubLObject var108 = module0178.f11287(var106);
        module0195.f12225(var107, var108);
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30255(final SubLObject var106) {
        module0342.f23126(var106);
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30256(SubLObject var109) {
        if (var109 == module0427.UNPROVIDED) {
            var109 = f30199((SubLObject)module0427.$ic92$);
        }
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)module0427.ZERO_INTEGER;
        final SubLObject var112 = module0424.f29696(var109);
        final SubLObject var114;
        final SubLObject var113 = var114 = module0424.f29678(var112);
        module0012.$g82$.setDynamicValue((SubLObject)module0427.$ic93$, var110);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var110);
        module0012.$g83$.setDynamicValue(Sequences.length(var114), var110);
        module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var110);
        final SubLObject var115 = module0012.$g75$.currentBinding(var110);
        final SubLObject var116 = module0012.$g76$.currentBinding(var110);
        final SubLObject var117 = module0012.$g77$.currentBinding(var110);
        final SubLObject var118 = module0012.$g78$.currentBinding(var110);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var110);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var110);
            module0012.$g77$.bind((SubLObject)module0427.T, var110);
            module0012.$g78$.bind(Time.get_universal_time(), var110);
            module0012.f478(module0012.$g82$.getDynamicValue(var110));
            SubLObject var119 = var114;
            SubLObject var120 = (SubLObject)module0427.NIL;
            var120 = var119.first();
            while (module0427.NIL != var119) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var110), module0012.$g83$.getDynamicValue(var110));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var110), (SubLObject)module0427.ONE_INTEGER), var110);
                final SubLObject var121 = module0424.f29629(var120);
                final SubLObject var122 = module0424.f29630(var120);
                final SubLObject var123 = module0035.f2399(var122, (SubLObject)module0427.$ic94$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                final SubLObject var124 = (SubLObject)ConsesLow.list(module0427.$ic62$, module0427.$ic66$, reader.bq_cons(module0427.$ic95$, ConsesLow.append(var123, (SubLObject)module0427.NIL)), var121);
                module0540.f33516(var124, module0427.$ic61$, (SubLObject)module0427.UNPROVIDED);
                var111 = Numbers.add(var111, (SubLObject)module0427.ONE_INTEGER);
                var119 = var119.rest();
                var120 = var119.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var118, var110);
            module0012.$g77$.rebind(var117, var110);
            module0012.$g76$.rebind(var116, var110);
            module0012.$g75$.rebind(var115, var110);
        }
        return var111;
    }
    
    public static SubLObject f30257() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = module0427.$ic96$;
        final SubLObject var47 = module0137.$g1605$.currentBinding(var44);
        final SubLObject var48 = module0139.$g1636$.currentBinding(var44);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0427.$ic57$), var44);
            module0139.$g1636$.bind(module0139.f9007(), var44);
            SubLObject var116_117 = var46;
            final SubLObject var49 = (SubLObject)module0427.$ic99$;
            final SubLObject var50 = module0056.f4145(var49);
            final SubLObject var48_120 = module0139.$g1635$.currentBinding(var44);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var44);
                final SubLObject var51 = (SubLObject)module0427.NIL;
                final SubLObject var48_121 = module0141.$g1714$.currentBinding(var44);
                final SubLObject var51_123 = module0141.$g1715$.currentBinding(var44);
                try {
                    module0141.$g1714$.bind((module0427.NIL != var51) ? var51 : module0141.f9283(), var44);
                    module0141.$g1715$.bind((SubLObject)((module0427.NIL != var51) ? module0427.$ic100$ : module0141.$g1715$.getDynamicValue(var44)), var44);
                    if (module0427.NIL != var51 && module0427.NIL != module0136.f8864() && module0427.NIL == module0141.f9279(var51)) {
                        final SubLObject var52 = module0136.$g1591$.getDynamicValue(var44);
                        if (var52.eql((SubLObject)module0427.$ic101$)) {
                            module0136.f8870((SubLObject)module0427.ONE_INTEGER, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                        else if (var52.eql((SubLObject)module0427.$ic104$)) {
                            module0136.f8871((SubLObject)module0427.ONE_INTEGER, (SubLObject)module0427.$ic105$, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                        else if (var52.eql((SubLObject)module0427.$ic106$)) {
                            Errors.warn((SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$);
                        }
                        else {
                            Errors.warn((SubLObject)module0427.$ic107$, module0136.$g1591$.getDynamicValue(var44));
                            Errors.cerror((SubLObject)module0427.$ic105$, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$);
                        }
                    }
                    final SubLObject var48_122 = module0141.$g1670$.currentBinding(var44);
                    final SubLObject var51_124 = module0141.$g1671$.currentBinding(var44);
                    final SubLObject var53 = module0141.$g1672$.currentBinding(var44);
                    final SubLObject var54 = module0141.$g1674$.currentBinding(var44);
                    final SubLObject var55 = module0137.$g1605$.currentBinding(var44);
                    try {
                        module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0427.$ic57$)), var44);
                        module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                        module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                        module0141.$g1674$.bind((SubLObject)module0427.NIL, var44);
                        module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0427.$ic57$)), var44);
                        if (module0427.NIL != module0136.f8865() || module0427.NIL != module0244.f15795(var46, module0137.f8955((SubLObject)module0427.UNPROVIDED))) {
                            final SubLObject var48_123 = module0141.$g1677$.currentBinding(var44);
                            final SubLObject var51_125 = module0138.$g1619$.currentBinding(var44);
                            final SubLObject var52_130 = module0141.$g1674$.currentBinding(var44);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var44);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                                module0141.$g1674$.bind((SubLObject)module0427.NIL, var44);
                                module0249.f16055(var116_117, (SubLObject)module0427.UNPROVIDED);
                                while (module0427.NIL != var116_117) {
                                    final SubLObject var56 = var116_117;
                                    SubLObject var58;
                                    final SubLObject var57 = var58 = module0200.f12443(module0137.f8955(module0427.$ic57$));
                                    SubLObject var59 = (SubLObject)module0427.NIL;
                                    var59 = var58.first();
                                    while (module0427.NIL != var58) {
                                        final SubLObject var48_124 = module0137.$g1605$.currentBinding(var44);
                                        final SubLObject var51_126 = module0141.$g1674$.currentBinding(var44);
                                        try {
                                            module0137.$g1605$.bind(var59, var44);
                                            module0141.$g1674$.bind((SubLObject)((module0427.NIL != module0141.f9205((SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0427.NIL == module0141.$g1674$.getDynamicValue(var44)) : module0141.$g1674$.getDynamicValue(var44)), var44);
                                            final SubLObject var60 = module0228.f15229(var56);
                                            if (module0427.NIL != module0138.f8992(var60)) {
                                                final SubLObject var61 = module0242.f15664(var60, module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                if (module0427.NIL != var61) {
                                                    final SubLObject var62 = module0245.f15834(var61, module0244.f15780(module0137.f8955(module0427.$ic57$)), module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                    if (module0427.NIL != var62) {
                                                        SubLObject var63;
                                                        for (var63 = module0066.f4838(module0067.f4891(var62)); module0427.NIL == module0066.f4841(var63); var63 = module0066.f4840(var63)) {
                                                            var44.resetMultipleValues();
                                                            final SubLObject var64 = module0066.f4839(var63);
                                                            final SubLObject var65 = var44.secondMultipleValue();
                                                            var44.resetMultipleValues();
                                                            if (module0427.NIL != module0147.f9507(var64)) {
                                                                final SubLObject var48_125 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var64, var44);
                                                                    SubLObject var139_143;
                                                                    for (var139_143 = module0066.f4838(module0067.f4891(var65)); module0427.NIL == module0066.f4841(var139_143); var139_143 = module0066.f4840(var139_143)) {
                                                                        var44.resetMultipleValues();
                                                                        final SubLObject var66 = module0066.f4839(var139_143);
                                                                        final SubLObject var67 = var44.secondMultipleValue();
                                                                        var44.resetMultipleValues();
                                                                        if (module0427.NIL != module0141.f9289(var66)) {
                                                                            final SubLObject var48_126 = module0138.$g1624$.currentBinding(var44);
                                                                            try {
                                                                                module0138.$g1624$.bind(var66, var44);
                                                                                final SubLObject var68 = var67;
                                                                                if (module0427.NIL != module0077.f5302(var68)) {
                                                                                    final SubLObject var69 = module0077.f5333(var68);
                                                                                    SubLObject var70;
                                                                                    SubLObject var71;
                                                                                    SubLObject var72;
                                                                                    SubLObject var73;
                                                                                    SubLObject var62_151;
                                                                                    SubLObject var74;
                                                                                    for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0427.NIL, var71 = module0032.f1742(var70, var69); module0427.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                        var72 = module0032.f1745(var70, var71);
                                                                                        if (module0427.NIL != module0032.f1746(var71, var72) && module0427.NIL == module0249.f16059(var72, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                            module0249.f16055(var72, module0139.$g1636$.getDynamicValue(var44));
                                                                                            if (module0427.NIL != module0173.f10955(var72)) {
                                                                                                var73 = module0423.f29579(var72);
                                                                                                if (var73.isCons()) {
                                                                                                    var62_151 = var73;
                                                                                                    var74 = (SubLObject)module0427.NIL;
                                                                                                    var74 = var62_151.first();
                                                                                                    while (module0427.NIL != var62_151) {
                                                                                                        var45 = (SubLObject)ConsesLow.cons(module0414.f28917(var74), var45);
                                                                                                        var62_151 = var62_151.rest();
                                                                                                        var74 = var62_151.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var68.isList()) {
                                                                                    SubLObject var75 = var68;
                                                                                    SubLObject var76 = (SubLObject)module0427.NIL;
                                                                                    var76 = var75.first();
                                                                                    while (module0427.NIL != var75) {
                                                                                        if (module0427.NIL == module0249.f16059(var76, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                            module0249.f16055(var76, module0139.$g1636$.getDynamicValue(var44));
                                                                                            if (module0427.NIL != module0173.f10955(var76)) {
                                                                                                final SubLObject var77 = module0423.f29579(var76);
                                                                                                if (var77.isCons()) {
                                                                                                    SubLObject var62_152 = var77;
                                                                                                    SubLObject var78 = (SubLObject)module0427.NIL;
                                                                                                    var78 = var62_152.first();
                                                                                                    while (module0427.NIL != var62_152) {
                                                                                                        var45 = (SubLObject)ConsesLow.cons(module0414.f28917(var78), var45);
                                                                                                        var62_152 = var62_152.rest();
                                                                                                        var78 = var62_152.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var75 = var75.rest();
                                                                                        var76 = var75.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0427.$ic108$, var68);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var48_126, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var139_143);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_125, var44);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var63);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0427.FIVE_INTEGER, (SubLObject)module0427.$ic109$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                                                }
                                                if (module0427.NIL != module0200.f12419(var60, module0137.f8955((SubLObject)module0427.UNPROVIDED))) {
                                                    SubLObject var79 = module0248.f15995(var60);
                                                    SubLObject var80 = (SubLObject)module0427.NIL;
                                                    var80 = var79.first();
                                                    while (module0427.NIL != var79) {
                                                        SubLObject var82;
                                                        final SubLObject var81 = var82 = var80;
                                                        SubLObject var83 = (SubLObject)module0427.NIL;
                                                        SubLObject var84 = (SubLObject)module0427.NIL;
                                                        SubLObject var85 = (SubLObject)module0427.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)module0427.$ic110$);
                                                        var83 = var82.first();
                                                        var82 = var82.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)module0427.$ic110$);
                                                        var84 = var82.first();
                                                        var82 = var82.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)module0427.$ic110$);
                                                        var85 = var82.first();
                                                        var82 = var82.rest();
                                                        if (module0427.NIL == var82) {
                                                            if (module0427.NIL != module0147.f9507(var84)) {
                                                                final SubLObject var48_127 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var84, var44);
                                                                    if (module0427.NIL != module0141.f9289(var85)) {
                                                                        final SubLObject var48_128 = module0138.$g1624$.currentBinding(var44);
                                                                        try {
                                                                            module0138.$g1624$.bind(var85, var44);
                                                                            final SubLObject var68;
                                                                            final SubLObject var86 = var68 = (SubLObject)ConsesLow.list(var83);
                                                                            if (module0427.NIL != module0077.f5302(var68)) {
                                                                                final SubLObject var69 = module0077.f5333(var68);
                                                                                SubLObject var70;
                                                                                SubLObject var71;
                                                                                SubLObject var72;
                                                                                SubLObject var73;
                                                                                SubLObject var74;
                                                                                SubLObject var62_153;
                                                                                for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0427.NIL, var71 = module0032.f1742(var70, var69); module0427.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                    var72 = module0032.f1745(var70, var71);
                                                                                    if (module0427.NIL != module0032.f1746(var71, var72) && module0427.NIL == module0249.f16059(var72, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                        module0249.f16055(var72, module0139.$g1636$.getDynamicValue(var44));
                                                                                        if (module0427.NIL != module0173.f10955(var72)) {
                                                                                            var73 = module0423.f29579(var72);
                                                                                            if (var73.isCons()) {
                                                                                                var62_153 = var73;
                                                                                                var74 = (SubLObject)module0427.NIL;
                                                                                                var74 = var62_153.first();
                                                                                                while (module0427.NIL != var62_153) {
                                                                                                    var45 = (SubLObject)ConsesLow.cons(module0414.f28917(var74), var45);
                                                                                                    var62_153 = var62_153.rest();
                                                                                                    var74 = var62_153.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var68.isList()) {
                                                                                SubLObject var54_163 = var68;
                                                                                SubLObject var76 = (SubLObject)module0427.NIL;
                                                                                var76 = var54_163.first();
                                                                                while (module0427.NIL != var54_163) {
                                                                                    if (module0427.NIL == module0249.f16059(var76, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                        module0249.f16055(var76, module0139.$g1636$.getDynamicValue(var44));
                                                                                        if (module0427.NIL != module0173.f10955(var76)) {
                                                                                            final SubLObject var77 = module0423.f29579(var76);
                                                                                            if (var77.isCons()) {
                                                                                                SubLObject var62_154 = var77;
                                                                                                SubLObject var78 = (SubLObject)module0427.NIL;
                                                                                                var78 = var62_154.first();
                                                                                                while (module0427.NIL != var62_154) {
                                                                                                    var45 = (SubLObject)ConsesLow.cons(module0414.f28917(var78), var45);
                                                                                                    var62_154 = var62_154.rest();
                                                                                                    var78 = var62_154.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    var54_163 = var54_163.rest();
                                                                                    var76 = var54_163.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)module0427.$ic108$, var68);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var48_128, var44);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_127, var44);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(var81, (SubLObject)module0427.$ic110$);
                                                        }
                                                        var79 = var79.rest();
                                                        var80 = var79.first();
                                                    }
                                                }
                                            }
                                            else if (module0427.NIL != module0155.f9785(var60, (SubLObject)module0427.UNPROVIDED)) {
                                                SubLObject var62_155;
                                                final SubLObject var87 = var62_155 = ((module0427.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0427.$ic57$)), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0427.$ic57$)), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED)));
                                                SubLObject var88 = (SubLObject)module0427.NIL;
                                                var88 = var62_155.first();
                                                while (module0427.NIL != var62_155) {
                                                    final SubLObject var48_129 = module0138.$g1625$.currentBinding(var44);
                                                    try {
                                                        module0138.$g1625$.bind(var88, var44);
                                                        final SubLObject var90;
                                                        final SubLObject var89 = var90 = Functions.funcall(var88, var60);
                                                        if (module0427.NIL != module0077.f5302(var90)) {
                                                            final SubLObject var91 = module0077.f5333(var90);
                                                            SubLObject var92;
                                                            SubLObject var93;
                                                            SubLObject var94;
                                                            SubLObject var95;
                                                            SubLObject var62_156;
                                                            SubLObject var96;
                                                            for (var92 = module0032.f1741(var91), var93 = (SubLObject)module0427.NIL, var93 = module0032.f1742(var92, var91); module0427.NIL == module0032.f1744(var92, var93); var93 = module0032.f1743(var93)) {
                                                                var94 = module0032.f1745(var92, var93);
                                                                if (module0427.NIL != module0032.f1746(var93, var94) && module0427.NIL == module0249.f16059(var94, module0139.$g1636$.getDynamicValue(var44))) {
                                                                    module0249.f16055(var94, module0139.$g1636$.getDynamicValue(var44));
                                                                    if (module0427.NIL != module0173.f10955(var94)) {
                                                                        var95 = module0423.f29579(var94);
                                                                        if (var95.isCons()) {
                                                                            var62_156 = var95;
                                                                            var96 = (SubLObject)module0427.NIL;
                                                                            var96 = var62_156.first();
                                                                            while (module0427.NIL != var62_156) {
                                                                                var45 = (SubLObject)ConsesLow.cons(module0414.f28917(var96), var45);
                                                                                var62_156 = var62_156.rest();
                                                                                var96 = var62_156.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else if (var90.isList()) {
                                                            SubLObject var97 = var90;
                                                            SubLObject var98 = (SubLObject)module0427.NIL;
                                                            var98 = var97.first();
                                                            while (module0427.NIL != var97) {
                                                                if (module0427.NIL == module0249.f16059(var98, module0139.$g1636$.getDynamicValue(var44))) {
                                                                    module0249.f16055(var98, module0139.$g1636$.getDynamicValue(var44));
                                                                    if (module0427.NIL != module0173.f10955(var98)) {
                                                                        final SubLObject var99 = module0423.f29579(var98);
                                                                        if (var99.isCons()) {
                                                                            SubLObject var62_157 = var99;
                                                                            SubLObject var100 = (SubLObject)module0427.NIL;
                                                                            var100 = var62_157.first();
                                                                            while (module0427.NIL != var62_157) {
                                                                                var45 = (SubLObject)ConsesLow.cons(module0414.f28917(var100), var45);
                                                                                var62_157 = var62_157.rest();
                                                                                var100 = var62_157.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                var97 = var97.rest();
                                                                var98 = var97.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0427.$ic108$, var90);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var48_129, var44);
                                                    }
                                                    var62_155 = var62_155.rest();
                                                    var88 = var62_155.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var51_126, var44);
                                            module0137.$g1605$.rebind(var48_124, var44);
                                        }
                                        var58 = var58.rest();
                                        var59 = var58.first();
                                    }
                                    SubLObject var102;
                                    final SubLObject var101 = var102 = module0200.f12443(module0244.f15771(module0137.f8955(module0427.$ic57$)));
                                    SubLObject var103 = (SubLObject)module0427.NIL;
                                    var103 = var102.first();
                                    while (module0427.NIL != var102) {
                                        final SubLObject var48_130 = module0137.$g1605$.currentBinding(var44);
                                        final SubLObject var51_127 = module0141.$g1674$.currentBinding(var44);
                                        try {
                                            module0137.$g1605$.bind(var103, var44);
                                            module0141.$g1674$.bind((SubLObject)((module0427.NIL != module0141.f9205((SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0427.NIL == module0141.$g1674$.getDynamicValue(var44)) : module0141.$g1674$.getDynamicValue(var44)), var44);
                                            final SubLObject var104 = module0228.f15229(var116_117);
                                            if (module0427.NIL != module0138.f8992(var104)) {
                                                final SubLObject var105 = module0242.f15664(var104, module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                if (module0427.NIL != var105) {
                                                    final SubLObject var106 = module0245.f15834(var105, module0138.f8979(), module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                    if (module0427.NIL != var106) {
                                                        SubLObject var107;
                                                        for (var107 = module0066.f4838(module0067.f4891(var106)); module0427.NIL == module0066.f4841(var107); var107 = module0066.f4840(var107)) {
                                                            var44.resetMultipleValues();
                                                            final SubLObject var108 = module0066.f4839(var107);
                                                            final SubLObject var109 = var44.secondMultipleValue();
                                                            var44.resetMultipleValues();
                                                            if (module0427.NIL != module0147.f9507(var108)) {
                                                                final SubLObject var48_131 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var108, var44);
                                                                    SubLObject var139_144;
                                                                    for (var139_144 = module0066.f4838(module0067.f4891(var109)); module0427.NIL == module0066.f4841(var139_144); var139_144 = module0066.f4840(var139_144)) {
                                                                        var44.resetMultipleValues();
                                                                        final SubLObject var110 = module0066.f4839(var139_144);
                                                                        final SubLObject var111 = var44.secondMultipleValue();
                                                                        var44.resetMultipleValues();
                                                                        if (module0427.NIL != module0141.f9289(var110)) {
                                                                            final SubLObject var48_132 = module0138.$g1624$.currentBinding(var44);
                                                                            try {
                                                                                module0138.$g1624$.bind(var110, var44);
                                                                                final SubLObject var112 = var111;
                                                                                if (module0427.NIL != module0077.f5302(var112)) {
                                                                                    final SubLObject var113 = module0077.f5333(var112);
                                                                                    SubLObject var114;
                                                                                    SubLObject var115;
                                                                                    SubLObject var116;
                                                                                    for (var114 = module0032.f1741(var113), var115 = (SubLObject)module0427.NIL, var115 = module0032.f1742(var114, var113); module0427.NIL == module0032.f1744(var114, var115); var115 = module0032.f1743(var115)) {
                                                                                        var116 = module0032.f1745(var114, var115);
                                                                                        if (module0427.NIL != module0032.f1746(var115, var116) && module0427.NIL == module0249.f16059(var116, (SubLObject)module0427.UNPROVIDED)) {
                                                                                            module0249.f16055(var116, (SubLObject)module0427.UNPROVIDED);
                                                                                            module0056.f4149(var116, var50);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var112.isList()) {
                                                                                    SubLObject var117 = var112;
                                                                                    SubLObject var118 = (SubLObject)module0427.NIL;
                                                                                    var118 = var117.first();
                                                                                    while (module0427.NIL != var117) {
                                                                                        if (module0427.NIL == module0249.f16059(var118, (SubLObject)module0427.UNPROVIDED)) {
                                                                                            module0249.f16055(var118, (SubLObject)module0427.UNPROVIDED);
                                                                                            module0056.f4149(var118, var50);
                                                                                        }
                                                                                        var117 = var117.rest();
                                                                                        var118 = var117.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0427.$ic108$, var112);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var48_132, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var139_144);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_131, var44);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var107);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0427.FIVE_INTEGER, (SubLObject)module0427.$ic109$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                                                }
                                            }
                                            else if (module0427.NIL != module0155.f9785(var104, (SubLObject)module0427.UNPROVIDED)) {
                                                SubLObject var62_158;
                                                final SubLObject var119 = var62_158 = ((module0427.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED)));
                                                SubLObject var120 = (SubLObject)module0427.NIL;
                                                var120 = var62_158.first();
                                                while (module0427.NIL != var62_158) {
                                                    final SubLObject var48_133 = module0138.$g1625$.currentBinding(var44);
                                                    try {
                                                        module0138.$g1625$.bind(var120, var44);
                                                        final SubLObject var122;
                                                        final SubLObject var121 = var122 = Functions.funcall(var120, var104);
                                                        if (module0427.NIL != module0077.f5302(var122)) {
                                                            final SubLObject var123 = module0077.f5333(var122);
                                                            SubLObject var124;
                                                            SubLObject var125;
                                                            SubLObject var126;
                                                            for (var124 = module0032.f1741(var123), var125 = (SubLObject)module0427.NIL, var125 = module0032.f1742(var124, var123); module0427.NIL == module0032.f1744(var124, var125); var125 = module0032.f1743(var125)) {
                                                                var126 = module0032.f1745(var124, var125);
                                                                if (module0427.NIL != module0032.f1746(var125, var126) && module0427.NIL == module0249.f16059(var126, (SubLObject)module0427.UNPROVIDED)) {
                                                                    module0249.f16055(var126, (SubLObject)module0427.UNPROVIDED);
                                                                    module0056.f4149(var126, var50);
                                                                }
                                                            }
                                                        }
                                                        else if (var122.isList()) {
                                                            SubLObject var127 = var122;
                                                            SubLObject var128 = (SubLObject)module0427.NIL;
                                                            var128 = var127.first();
                                                            while (module0427.NIL != var127) {
                                                                if (module0427.NIL == module0249.f16059(var128, (SubLObject)module0427.UNPROVIDED)) {
                                                                    module0249.f16055(var128, (SubLObject)module0427.UNPROVIDED);
                                                                    module0056.f4149(var128, var50);
                                                                }
                                                                var127 = var127.rest();
                                                                var128 = var127.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0427.$ic108$, var122);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var48_133, var44);
                                                    }
                                                    var62_158 = var62_158.rest();
                                                    var120 = var62_158.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var51_127, var44);
                                            module0137.$g1605$.rebind(var48_130, var44);
                                        }
                                        var102 = var102.rest();
                                        var103 = var102.first();
                                    }
                                    var116_117 = module0056.f4150(var50);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var52_130, var44);
                                module0138.$g1619$.rebind(var51_125, var44);
                                module0141.$g1677$.rebind(var48_123, var44);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0427.TWO_INTEGER, (SubLObject)module0427.$ic111$, var46, module0244.f15748(module0137.f8955((SubLObject)module0427.UNPROVIDED)), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var55, var44);
                        module0141.$g1674$.rebind(var54, var44);
                        module0141.$g1672$.rebind(var53, var44);
                        module0141.$g1671$.rebind(var51_124, var44);
                        module0141.$g1670$.rebind(var48_122, var44);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var51_123, var44);
                    module0141.$g1714$.rebind(var48_121, var44);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var44));
            }
            finally {
                module0139.$g1635$.rebind(var48_120, var44);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var44));
        }
        finally {
            module0139.$g1636$.rebind(var48, var44);
            module0137.$g1605$.rebind(var47, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f30258() {
        SubLObject var181 = (SubLObject)module0427.NIL;
        SubLObject var182 = (SubLObject)module0427.NIL;
        SubLObject var183 = (SubLObject)module0427.NIL;
        SubLObject var184 = (SubLObject)module0427.NIL;
        var182 = Sort.sort(f30257(), Symbols.symbol_function((SubLObject)module0427.$ic38$), (SubLObject)module0427.UNPROVIDED);
        var183 = var182.first();
        for (var184 = (SubLObject)module0427.ZERO_INTEGER; module0427.NIL != var182; var182 = var182.rest(), var183 = var182.first(), var184 = Numbers.add((SubLObject)module0427.ONE_INTEGER, var184)) {
            var181 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var184, var183), var181);
        }
        return Sequences.nreverse(var181);
    }
    
    public static SubLObject f30259(final SubLObject var185) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0427.NIL != module0178.f11290(var185) && module0427.NIL != module0205.f13216((SubLObject)module0427.$ic112$, var185, (SubLObject)module0427.NIL, (SubLObject)module0427.UNPROVIDED));
    }
    
    public static SubLObject f30260() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = assertion_handles_oc.f11010();
        final SubLObject var47 = (SubLObject)module0427.$ic113$;
        final SubLObject var48 = module0065.f4733(var46);
        SubLObject var49 = (SubLObject)module0427.ZERO_INTEGER;
        assert module0427.NIL != Types.stringp(var47) : var47;
        final SubLObject var50 = module0012.$g75$.currentBinding(var44);
        final SubLObject var51 = module0012.$g76$.currentBinding(var44);
        final SubLObject var52 = module0012.$g77$.currentBinding(var44);
        final SubLObject var53 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
            module0012.$g77$.bind((SubLObject)module0427.T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var47);
            final SubLObject var191_192 = var46;
            if (module0427.NIL == module0065.f4772(var191_192, (SubLObject)module0427.$ic18$)) {
                final SubLObject var193_194 = var191_192;
                if (module0427.NIL == module0065.f4775(var193_194, (SubLObject)module0427.$ic18$)) {
                    final SubLObject var54 = module0065.f4740(var193_194);
                    final SubLObject var55 = (SubLObject)module0427.NIL;
                    SubLObject var56;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    for (var56 = Sequences.length(var54), var57 = (SubLObject)module0427.NIL, var57 = (SubLObject)module0427.ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)module0427.ONE_INTEGER)) {
                        var58 = ((module0427.NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)module0427.ONE_INTEGER) : var57);
                        var59 = Vectors.aref(var54, var58);
                        if (module0427.NIL == module0065.f4749(var59) || module0427.NIL == module0065.f4773((SubLObject)module0427.$ic18$)) {
                            if (module0427.NIL != module0065.f4749(var59)) {
                                var59 = (SubLObject)module0427.$ic18$;
                            }
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)module0427.ONE_INTEGER);
                            if (module0427.NIL != f30259(var59)) {
                                var45 = (SubLObject)ConsesLow.cons(var59, var45);
                            }
                        }
                    }
                }
                final SubLObject var200_201 = var191_192;
                if (module0427.NIL == module0065.f4777(var200_201) || module0427.NIL == module0065.f4773((SubLObject)module0427.$ic18$)) {
                    final SubLObject var60 = module0065.f4738(var200_201);
                    SubLObject var61 = module0065.f4739(var200_201);
                    final SubLObject var62 = module0065.f4734(var200_201);
                    final SubLObject var63 = (SubLObject)((module0427.NIL != module0065.f4773((SubLObject)module0427.$ic18$)) ? module0427.NIL : module0427.$ic18$);
                    while (var61.numL(var62)) {
                        final SubLObject var64 = Hashtables.gethash_without_values(var61, var60, var63);
                        if (module0427.NIL == module0065.f4773((SubLObject)module0427.$ic18$) || module0427.NIL == module0065.f4749(var64)) {
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)module0427.ONE_INTEGER);
                            if (module0427.NIL != f30259(var64)) {
                                var45 = (SubLObject)ConsesLow.cons(var64, var45);
                            }
                        }
                        var61 = Numbers.add(var61, (SubLObject)module0427.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var53, var44);
            module0012.$g77$.rebind(var52, var44);
            module0012.$g76$.rebind(var51, var44);
            module0012.$g75$.rebind(var50, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f30261() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = assertion_handles_oc.f11010();
        final SubLObject var47 = (SubLObject)module0427.$ic115$;
        final SubLObject var48 = module0065.f4733(var46);
        SubLObject var49 = (SubLObject)module0427.ZERO_INTEGER;
        assert module0427.NIL != Types.stringp(var47) : var47;
        final SubLObject var50 = module0012.$g75$.currentBinding(var44);
        final SubLObject var51 = module0012.$g76$.currentBinding(var44);
        final SubLObject var52 = module0012.$g77$.currentBinding(var44);
        final SubLObject var53 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
            module0012.$g77$.bind((SubLObject)module0427.T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var47);
            final SubLObject var191_205 = var46;
            if (module0427.NIL == module0065.f4772(var191_205, (SubLObject)module0427.$ic18$)) {
                final SubLObject var193_206 = var191_205;
                if (module0427.NIL == module0065.f4775(var193_206, (SubLObject)module0427.$ic18$)) {
                    final SubLObject var54 = module0065.f4740(var193_206);
                    final SubLObject var55 = (SubLObject)module0427.NIL;
                    SubLObject var56;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    for (var56 = Sequences.length(var54), var57 = (SubLObject)module0427.NIL, var57 = (SubLObject)module0427.ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)module0427.ONE_INTEGER)) {
                        var58 = ((module0427.NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)module0427.ONE_INTEGER) : var57);
                        var59 = Vectors.aref(var54, var58);
                        if (module0427.NIL == module0065.f4749(var59) || module0427.NIL == module0065.f4773((SubLObject)module0427.$ic18$)) {
                            if (module0427.NIL != module0065.f4749(var59)) {
                                var59 = (SubLObject)module0427.$ic18$;
                            }
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)module0427.ONE_INTEGER);
                            if (module0427.NIL != f30259(var59) && module0414.f28917(var59).isNegative()) {
                                var45 = (SubLObject)ConsesLow.cons(var59, var45);
                            }
                        }
                    }
                }
                final SubLObject var200_207 = var191_205;
                if (module0427.NIL == module0065.f4777(var200_207) || module0427.NIL == module0065.f4773((SubLObject)module0427.$ic18$)) {
                    final SubLObject var60 = module0065.f4738(var200_207);
                    SubLObject var61 = module0065.f4739(var200_207);
                    final SubLObject var62 = module0065.f4734(var200_207);
                    final SubLObject var63 = (SubLObject)((module0427.NIL != module0065.f4773((SubLObject)module0427.$ic18$)) ? module0427.NIL : module0427.$ic18$);
                    while (var61.numL(var62)) {
                        final SubLObject var64 = Hashtables.gethash_without_values(var61, var60, var63);
                        if (module0427.NIL == module0065.f4773((SubLObject)module0427.$ic18$) || module0427.NIL == module0065.f4749(var64)) {
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)module0427.ONE_INTEGER);
                            if (module0427.NIL != f30259(var64) && module0414.f28917(var64).isNegative()) {
                                var45 = (SubLObject)ConsesLow.cons(var64, var45);
                            }
                        }
                        var61 = Numbers.add(var61, (SubLObject)module0427.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var53, var44);
            module0012.$g77$.rebind(var52, var44);
            module0012.$g76$.rebind(var51, var44);
            module0012.$g75$.rebind(var50, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f30262(final SubLObject var72) {
        return Sort.sort(Mapping.mapcar((SubLObject)module0427.$ic116$, var72), Symbols.symbol_function((SubLObject)module0427.$ic38$), (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30263(final SubLObject var72) {
        SubLObject var73 = (SubLObject)module0427.NIL;
        final SubLObject var74 = f30262(var72);
        SubLObject var75 = (SubLObject)module0427.NIL;
        SubLObject var76 = (SubLObject)module0427.NIL;
        SubLObject var77 = (SubLObject)module0427.NIL;
        var75 = var74;
        var76 = var75.first();
        for (var77 = (SubLObject)module0427.ZERO_INTEGER; module0427.NIL != var75; var75 = var75.rest(), var76 = var75.first(), var77 = Numbers.add((SubLObject)module0427.ONE_INTEGER, var77)) {
            var73 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var77, var76), var73);
        }
        return Sequences.nreverse(var73);
    }
    
    public static SubLObject f30264(final SubLObject var72) {
        SubLObject var73 = (SubLObject)module0427.NIL;
        final SubLObject var74 = Sort.sort(Mapping.mapcar((SubLObject)module0427.$ic117$, var72), Symbols.symbol_function((SubLObject)module0427.$ic38$), (SubLObject)module0427.UNPROVIDED);
        SubLObject var75 = (SubLObject)module0427.NIL;
        SubLObject var76 = (SubLObject)module0427.NIL;
        SubLObject var77 = (SubLObject)module0427.NIL;
        var75 = var74;
        var76 = var75.first();
        for (var77 = (SubLObject)module0427.ZERO_INTEGER; module0427.NIL != var75; var75 = var75.rest(), var76 = var75.first(), var77 = Numbers.add((SubLObject)module0427.ONE_INTEGER, var77)) {
            var73 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var77, var76), var73);
        }
        return Sequences.nreverse(var73);
    }
    
    public static SubLObject f30265(final SubLObject var72) {
        SubLObject var73 = (SubLObject)module0427.NIL;
        final SubLObject var74 = Sort.sort(Mapping.mapcar((SubLObject)module0427.$ic118$, var72), Symbols.symbol_function((SubLObject)module0427.$ic38$), (SubLObject)module0427.UNPROVIDED);
        SubLObject var75 = (SubLObject)module0427.NIL;
        SubLObject var76 = (SubLObject)module0427.NIL;
        SubLObject var77 = (SubLObject)module0427.NIL;
        var75 = var74;
        var76 = var75.first();
        for (var77 = (SubLObject)module0427.ZERO_INTEGER; module0427.NIL != var75; var75 = var75.rest(), var76 = var75.first(), var77 = Numbers.add((SubLObject)module0427.ONE_INTEGER, var77)) {
            var73 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var77, var76), var73);
        }
        return Sequences.nreverse(var73);
    }
    
    public static SubLObject f30266(SubLObject var109) {
        if (var109 == module0427.UNPROVIDED) {
            var109 = f30199((SubLObject)module0427.$ic92$);
        }
        SubLObject var110 = (SubLObject)module0427.NIL;
        final SubLObject var111 = module0424.f29696(var109);
        SubLObject var113;
        final SubLObject var112 = var113 = module0424.f29678(var111);
        SubLObject var114 = (SubLObject)module0427.NIL;
        var114 = var113.first();
        while (module0427.NIL != var113) {
            final SubLObject var115 = module0424.f29630(var114);
            SubLObject var62_210;
            final SubLObject var116 = var62_210 = module0035.f2399(var115, (SubLObject)module0427.$ic94$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
            SubLObject var117 = (SubLObject)module0427.NIL;
            var117 = var62_210.first();
            while (module0427.NIL != var62_210) {
                if (module0427.NIL != f30259(var117)) {
                    var110 = (SubLObject)ConsesLow.cons(var117, var110);
                }
                var62_210 = var62_210.rest();
                var117 = var62_210.first();
            }
            var113 = var113.rest();
            var114 = var113.first();
        }
        return Sequences.nreverse(var110);
    }
    
    public static SubLObject f30267() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = module0427.$ic96$;
        final SubLObject var47 = module0137.$g1605$.currentBinding(var44);
        final SubLObject var48 = module0139.$g1636$.currentBinding(var44);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0427.$ic57$), var44);
            module0139.$g1636$.bind(module0139.f9007(), var44);
            SubLObject var116_211 = var46;
            final SubLObject var49 = (SubLObject)module0427.$ic99$;
            final SubLObject var50 = module0056.f4145(var49);
            final SubLObject var48_212 = module0139.$g1635$.currentBinding(var44);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var44);
                final SubLObject var51 = (SubLObject)module0427.NIL;
                final SubLObject var48_213 = module0141.$g1714$.currentBinding(var44);
                final SubLObject var51_214 = module0141.$g1715$.currentBinding(var44);
                try {
                    module0141.$g1714$.bind((module0427.NIL != var51) ? var51 : module0141.f9283(), var44);
                    module0141.$g1715$.bind((SubLObject)((module0427.NIL != var51) ? module0427.$ic100$ : module0141.$g1715$.getDynamicValue(var44)), var44);
                    if (module0427.NIL != var51 && module0427.NIL != module0136.f8864() && module0427.NIL == module0141.f9279(var51)) {
                        final SubLObject var52 = module0136.$g1591$.getDynamicValue(var44);
                        if (var52.eql((SubLObject)module0427.$ic101$)) {
                            module0136.f8870((SubLObject)module0427.ONE_INTEGER, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                        else if (var52.eql((SubLObject)module0427.$ic104$)) {
                            module0136.f8871((SubLObject)module0427.ONE_INTEGER, (SubLObject)module0427.$ic105$, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                        else if (var52.eql((SubLObject)module0427.$ic106$)) {
                            Errors.warn((SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$);
                        }
                        else {
                            Errors.warn((SubLObject)module0427.$ic107$, module0136.$g1591$.getDynamicValue(var44));
                            Errors.cerror((SubLObject)module0427.$ic105$, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$);
                        }
                    }
                    final SubLObject var48_214 = module0141.$g1670$.currentBinding(var44);
                    final SubLObject var51_215 = module0141.$g1671$.currentBinding(var44);
                    final SubLObject var53 = module0141.$g1672$.currentBinding(var44);
                    final SubLObject var54 = module0141.$g1674$.currentBinding(var44);
                    final SubLObject var55 = module0137.$g1605$.currentBinding(var44);
                    try {
                        module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0427.$ic57$)), var44);
                        module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                        module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                        module0141.$g1674$.bind((SubLObject)module0427.NIL, var44);
                        module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0427.$ic57$)), var44);
                        if (module0427.NIL != module0136.f8865() || module0427.NIL != module0244.f15795(var46, module0137.f8955((SubLObject)module0427.UNPROVIDED))) {
                            final SubLObject var48_215 = module0141.$g1677$.currentBinding(var44);
                            final SubLObject var51_216 = module0138.$g1619$.currentBinding(var44);
                            final SubLObject var52_219 = module0141.$g1674$.currentBinding(var44);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var44);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                                module0141.$g1674$.bind((SubLObject)module0427.NIL, var44);
                                module0249.f16055(var116_211, (SubLObject)module0427.UNPROVIDED);
                                while (module0427.NIL != var116_211) {
                                    final SubLObject var56 = var116_211;
                                    SubLObject var58;
                                    final SubLObject var57 = var58 = module0200.f12443(module0137.f8955(module0427.$ic57$));
                                    SubLObject var59 = (SubLObject)module0427.NIL;
                                    var59 = var58.first();
                                    while (module0427.NIL != var58) {
                                        final SubLObject var48_216 = module0137.$g1605$.currentBinding(var44);
                                        final SubLObject var51_217 = module0141.$g1674$.currentBinding(var44);
                                        try {
                                            module0137.$g1605$.bind(var59, var44);
                                            module0141.$g1674$.bind((SubLObject)((module0427.NIL != module0141.f9205((SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0427.NIL == module0141.$g1674$.getDynamicValue(var44)) : module0141.$g1674$.getDynamicValue(var44)), var44);
                                            final SubLObject var60 = module0228.f15229(var56);
                                            if (module0427.NIL != module0138.f8992(var60)) {
                                                final SubLObject var61 = module0242.f15664(var60, module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                if (module0427.NIL != var61) {
                                                    final SubLObject var62 = module0245.f15834(var61, module0244.f15780(module0137.f8955(module0427.$ic57$)), module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                    if (module0427.NIL != var62) {
                                                        SubLObject var63;
                                                        for (var63 = module0066.f4838(module0067.f4891(var62)); module0427.NIL == module0066.f4841(var63); var63 = module0066.f4840(var63)) {
                                                            var44.resetMultipleValues();
                                                            final SubLObject var64 = module0066.f4839(var63);
                                                            final SubLObject var65 = var44.secondMultipleValue();
                                                            var44.resetMultipleValues();
                                                            if (module0427.NIL != module0147.f9507(var64)) {
                                                                final SubLObject var48_217 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var64, var44);
                                                                    SubLObject var139_223;
                                                                    for (var139_223 = module0066.f4838(module0067.f4891(var65)); module0427.NIL == module0066.f4841(var139_223); var139_223 = module0066.f4840(var139_223)) {
                                                                        var44.resetMultipleValues();
                                                                        final SubLObject var66 = module0066.f4839(var139_223);
                                                                        final SubLObject var67 = var44.secondMultipleValue();
                                                                        var44.resetMultipleValues();
                                                                        if (module0427.NIL != module0141.f9289(var66)) {
                                                                            final SubLObject var48_218 = module0138.$g1624$.currentBinding(var44);
                                                                            try {
                                                                                module0138.$g1624$.bind(var66, var44);
                                                                                final SubLObject var68 = var67;
                                                                                if (module0427.NIL != module0077.f5302(var68)) {
                                                                                    final SubLObject var69 = module0077.f5333(var68);
                                                                                    SubLObject var70;
                                                                                    SubLObject var71;
                                                                                    SubLObject var72;
                                                                                    SubLObject var73;
                                                                                    SubLObject var62_225;
                                                                                    SubLObject var74;
                                                                                    for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0427.NIL, var71 = module0032.f1742(var70, var69); module0427.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                        var72 = module0032.f1745(var70, var71);
                                                                                        if (module0427.NIL != module0032.f1746(var71, var72) && module0427.NIL == module0249.f16059(var72, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                            module0249.f16055(var72, module0139.$g1636$.getDynamicValue(var44));
                                                                                            if (module0427.NIL != module0173.f10955(var72)) {
                                                                                                var73 = module0423.f29579(var72);
                                                                                                if (var73.isCons()) {
                                                                                                    var62_225 = var73;
                                                                                                    var74 = (SubLObject)module0427.NIL;
                                                                                                    var74 = var62_225.first();
                                                                                                    while (module0427.NIL != var62_225) {
                                                                                                        if (module0427.NIL != f30259(var74)) {
                                                                                                            var45 = (SubLObject)ConsesLow.cons(var74, var45);
                                                                                                        }
                                                                                                        var62_225 = var62_225.rest();
                                                                                                        var74 = var62_225.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var68.isList()) {
                                                                                    SubLObject var75 = var68;
                                                                                    SubLObject var76 = (SubLObject)module0427.NIL;
                                                                                    var76 = var75.first();
                                                                                    while (module0427.NIL != var75) {
                                                                                        if (module0427.NIL == module0249.f16059(var76, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                            module0249.f16055(var76, module0139.$g1636$.getDynamicValue(var44));
                                                                                            if (module0427.NIL != module0173.f10955(var76)) {
                                                                                                final SubLObject var77 = module0423.f29579(var76);
                                                                                                if (var77.isCons()) {
                                                                                                    SubLObject var62_226 = var77;
                                                                                                    SubLObject var78 = (SubLObject)module0427.NIL;
                                                                                                    var78 = var62_226.first();
                                                                                                    while (module0427.NIL != var62_226) {
                                                                                                        if (module0427.NIL != f30259(var78)) {
                                                                                                            var45 = (SubLObject)ConsesLow.cons(var78, var45);
                                                                                                        }
                                                                                                        var62_226 = var62_226.rest();
                                                                                                        var78 = var62_226.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var75 = var75.rest();
                                                                                        var76 = var75.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0427.$ic108$, var68);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var48_218, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var139_223);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_217, var44);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var63);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0427.FIVE_INTEGER, (SubLObject)module0427.$ic109$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                                                }
                                                if (module0427.NIL != module0200.f12419(var60, module0137.f8955((SubLObject)module0427.UNPROVIDED))) {
                                                    SubLObject var79 = module0248.f15995(var60);
                                                    SubLObject var80 = (SubLObject)module0427.NIL;
                                                    var80 = var79.first();
                                                    while (module0427.NIL != var79) {
                                                        SubLObject var82;
                                                        final SubLObject var81 = var82 = var80;
                                                        SubLObject var83 = (SubLObject)module0427.NIL;
                                                        SubLObject var84 = (SubLObject)module0427.NIL;
                                                        SubLObject var85 = (SubLObject)module0427.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)module0427.$ic110$);
                                                        var83 = var82.first();
                                                        var82 = var82.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)module0427.$ic110$);
                                                        var84 = var82.first();
                                                        var82 = var82.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)module0427.$ic110$);
                                                        var85 = var82.first();
                                                        var82 = var82.rest();
                                                        if (module0427.NIL == var82) {
                                                            if (module0427.NIL != module0147.f9507(var84)) {
                                                                final SubLObject var48_219 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var84, var44);
                                                                    if (module0427.NIL != module0141.f9289(var85)) {
                                                                        final SubLObject var48_220 = module0138.$g1624$.currentBinding(var44);
                                                                        try {
                                                                            module0138.$g1624$.bind(var85, var44);
                                                                            final SubLObject var68;
                                                                            final SubLObject var86 = var68 = (SubLObject)ConsesLow.list(var83);
                                                                            if (module0427.NIL != module0077.f5302(var68)) {
                                                                                final SubLObject var69 = module0077.f5333(var68);
                                                                                SubLObject var70;
                                                                                SubLObject var71;
                                                                                SubLObject var72;
                                                                                SubLObject var73;
                                                                                SubLObject var74;
                                                                                SubLObject var62_227;
                                                                                for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0427.NIL, var71 = module0032.f1742(var70, var69); module0427.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                    var72 = module0032.f1745(var70, var71);
                                                                                    if (module0427.NIL != module0032.f1746(var71, var72) && module0427.NIL == module0249.f16059(var72, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                        module0249.f16055(var72, module0139.$g1636$.getDynamicValue(var44));
                                                                                        if (module0427.NIL != module0173.f10955(var72)) {
                                                                                            var73 = module0423.f29579(var72);
                                                                                            if (var73.isCons()) {
                                                                                                var62_227 = var73;
                                                                                                var74 = (SubLObject)module0427.NIL;
                                                                                                var74 = var62_227.first();
                                                                                                while (module0427.NIL != var62_227) {
                                                                                                    if (module0427.NIL != f30259(var74)) {
                                                                                                        var45 = (SubLObject)ConsesLow.cons(var74, var45);
                                                                                                    }
                                                                                                    var62_227 = var62_227.rest();
                                                                                                    var74 = var62_227.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var68.isList()) {
                                                                                SubLObject var54_232 = var68;
                                                                                SubLObject var76 = (SubLObject)module0427.NIL;
                                                                                var76 = var54_232.first();
                                                                                while (module0427.NIL != var54_232) {
                                                                                    if (module0427.NIL == module0249.f16059(var76, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                        module0249.f16055(var76, module0139.$g1636$.getDynamicValue(var44));
                                                                                        if (module0427.NIL != module0173.f10955(var76)) {
                                                                                            final SubLObject var77 = module0423.f29579(var76);
                                                                                            if (var77.isCons()) {
                                                                                                SubLObject var62_228 = var77;
                                                                                                SubLObject var78 = (SubLObject)module0427.NIL;
                                                                                                var78 = var62_228.first();
                                                                                                while (module0427.NIL != var62_228) {
                                                                                                    if (module0427.NIL != f30259(var78)) {
                                                                                                        var45 = (SubLObject)ConsesLow.cons(var78, var45);
                                                                                                    }
                                                                                                    var62_228 = var62_228.rest();
                                                                                                    var78 = var62_228.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    var54_232 = var54_232.rest();
                                                                                    var76 = var54_232.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)module0427.$ic108$, var68);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var48_220, var44);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_219, var44);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(var81, (SubLObject)module0427.$ic110$);
                                                        }
                                                        var79 = var79.rest();
                                                        var80 = var79.first();
                                                    }
                                                }
                                            }
                                            else if (module0427.NIL != module0155.f9785(var60, (SubLObject)module0427.UNPROVIDED)) {
                                                SubLObject var62_229;
                                                final SubLObject var87 = var62_229 = ((module0427.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0427.$ic57$)), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0427.$ic57$)), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED)));
                                                SubLObject var88 = (SubLObject)module0427.NIL;
                                                var88 = var62_229.first();
                                                while (module0427.NIL != var62_229) {
                                                    final SubLObject var48_221 = module0138.$g1625$.currentBinding(var44);
                                                    try {
                                                        module0138.$g1625$.bind(var88, var44);
                                                        final SubLObject var90;
                                                        final SubLObject var89 = var90 = Functions.funcall(var88, var60);
                                                        if (module0427.NIL != module0077.f5302(var90)) {
                                                            final SubLObject var91 = module0077.f5333(var90);
                                                            SubLObject var92;
                                                            SubLObject var93;
                                                            SubLObject var94;
                                                            SubLObject var95;
                                                            SubLObject var62_230;
                                                            SubLObject var96;
                                                            for (var92 = module0032.f1741(var91), var93 = (SubLObject)module0427.NIL, var93 = module0032.f1742(var92, var91); module0427.NIL == module0032.f1744(var92, var93); var93 = module0032.f1743(var93)) {
                                                                var94 = module0032.f1745(var92, var93);
                                                                if (module0427.NIL != module0032.f1746(var93, var94) && module0427.NIL == module0249.f16059(var94, module0139.$g1636$.getDynamicValue(var44))) {
                                                                    module0249.f16055(var94, module0139.$g1636$.getDynamicValue(var44));
                                                                    if (module0427.NIL != module0173.f10955(var94)) {
                                                                        var95 = module0423.f29579(var94);
                                                                        if (var95.isCons()) {
                                                                            var62_230 = var95;
                                                                            var96 = (SubLObject)module0427.NIL;
                                                                            var96 = var62_230.first();
                                                                            while (module0427.NIL != var62_230) {
                                                                                if (module0427.NIL != f30259(var96)) {
                                                                                    var45 = (SubLObject)ConsesLow.cons(var96, var45);
                                                                                }
                                                                                var62_230 = var62_230.rest();
                                                                                var96 = var62_230.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else if (var90.isList()) {
                                                            SubLObject var97 = var90;
                                                            SubLObject var98 = (SubLObject)module0427.NIL;
                                                            var98 = var97.first();
                                                            while (module0427.NIL != var97) {
                                                                if (module0427.NIL == module0249.f16059(var98, module0139.$g1636$.getDynamicValue(var44))) {
                                                                    module0249.f16055(var98, module0139.$g1636$.getDynamicValue(var44));
                                                                    if (module0427.NIL != module0173.f10955(var98)) {
                                                                        final SubLObject var99 = module0423.f29579(var98);
                                                                        if (var99.isCons()) {
                                                                            SubLObject var62_231 = var99;
                                                                            SubLObject var100 = (SubLObject)module0427.NIL;
                                                                            var100 = var62_231.first();
                                                                            while (module0427.NIL != var62_231) {
                                                                                if (module0427.NIL != f30259(var100)) {
                                                                                    var45 = (SubLObject)ConsesLow.cons(var100, var45);
                                                                                }
                                                                                var62_231 = var62_231.rest();
                                                                                var100 = var62_231.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                var97 = var97.rest();
                                                                var98 = var97.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0427.$ic108$, var90);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var48_221, var44);
                                                    }
                                                    var62_229 = var62_229.rest();
                                                    var88 = var62_229.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var51_217, var44);
                                            module0137.$g1605$.rebind(var48_216, var44);
                                        }
                                        var58 = var58.rest();
                                        var59 = var58.first();
                                    }
                                    SubLObject var102;
                                    final SubLObject var101 = var102 = module0200.f12443(module0244.f15771(module0137.f8955(module0427.$ic57$)));
                                    SubLObject var103 = (SubLObject)module0427.NIL;
                                    var103 = var102.first();
                                    while (module0427.NIL != var102) {
                                        final SubLObject var48_222 = module0137.$g1605$.currentBinding(var44);
                                        final SubLObject var51_218 = module0141.$g1674$.currentBinding(var44);
                                        try {
                                            module0137.$g1605$.bind(var103, var44);
                                            module0141.$g1674$.bind((SubLObject)((module0427.NIL != module0141.f9205((SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0427.NIL == module0141.$g1674$.getDynamicValue(var44)) : module0141.$g1674$.getDynamicValue(var44)), var44);
                                            final SubLObject var104 = module0228.f15229(var116_211);
                                            if (module0427.NIL != module0138.f8992(var104)) {
                                                final SubLObject var105 = module0242.f15664(var104, module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                if (module0427.NIL != var105) {
                                                    final SubLObject var106 = module0245.f15834(var105, module0138.f8979(), module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                    if (module0427.NIL != var106) {
                                                        SubLObject var107;
                                                        for (var107 = module0066.f4838(module0067.f4891(var106)); module0427.NIL == module0066.f4841(var107); var107 = module0066.f4840(var107)) {
                                                            var44.resetMultipleValues();
                                                            final SubLObject var108 = module0066.f4839(var107);
                                                            final SubLObject var109 = var44.secondMultipleValue();
                                                            var44.resetMultipleValues();
                                                            if (module0427.NIL != module0147.f9507(var108)) {
                                                                final SubLObject var48_223 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var108, var44);
                                                                    SubLObject var139_224;
                                                                    for (var139_224 = module0066.f4838(module0067.f4891(var109)); module0427.NIL == module0066.f4841(var139_224); var139_224 = module0066.f4840(var139_224)) {
                                                                        var44.resetMultipleValues();
                                                                        final SubLObject var110 = module0066.f4839(var139_224);
                                                                        final SubLObject var111 = var44.secondMultipleValue();
                                                                        var44.resetMultipleValues();
                                                                        if (module0427.NIL != module0141.f9289(var110)) {
                                                                            final SubLObject var48_224 = module0138.$g1624$.currentBinding(var44);
                                                                            try {
                                                                                module0138.$g1624$.bind(var110, var44);
                                                                                final SubLObject var112 = var111;
                                                                                if (module0427.NIL != module0077.f5302(var112)) {
                                                                                    final SubLObject var113 = module0077.f5333(var112);
                                                                                    SubLObject var114;
                                                                                    SubLObject var115;
                                                                                    SubLObject var116;
                                                                                    for (var114 = module0032.f1741(var113), var115 = (SubLObject)module0427.NIL, var115 = module0032.f1742(var114, var113); module0427.NIL == module0032.f1744(var114, var115); var115 = module0032.f1743(var115)) {
                                                                                        var116 = module0032.f1745(var114, var115);
                                                                                        if (module0427.NIL != module0032.f1746(var115, var116) && module0427.NIL == module0249.f16059(var116, (SubLObject)module0427.UNPROVIDED)) {
                                                                                            module0249.f16055(var116, (SubLObject)module0427.UNPROVIDED);
                                                                                            module0056.f4149(var116, var50);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var112.isList()) {
                                                                                    SubLObject var117 = var112;
                                                                                    SubLObject var118 = (SubLObject)module0427.NIL;
                                                                                    var118 = var117.first();
                                                                                    while (module0427.NIL != var117) {
                                                                                        if (module0427.NIL == module0249.f16059(var118, (SubLObject)module0427.UNPROVIDED)) {
                                                                                            module0249.f16055(var118, (SubLObject)module0427.UNPROVIDED);
                                                                                            module0056.f4149(var118, var50);
                                                                                        }
                                                                                        var117 = var117.rest();
                                                                                        var118 = var117.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0427.$ic108$, var112);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var48_224, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var139_224);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_223, var44);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var107);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0427.FIVE_INTEGER, (SubLObject)module0427.$ic109$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                                                }
                                            }
                                            else if (module0427.NIL != module0155.f9785(var104, (SubLObject)module0427.UNPROVIDED)) {
                                                SubLObject var62_232;
                                                final SubLObject var119 = var62_232 = ((module0427.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED)));
                                                SubLObject var120 = (SubLObject)module0427.NIL;
                                                var120 = var62_232.first();
                                                while (module0427.NIL != var62_232) {
                                                    final SubLObject var48_225 = module0138.$g1625$.currentBinding(var44);
                                                    try {
                                                        module0138.$g1625$.bind(var120, var44);
                                                        final SubLObject var122;
                                                        final SubLObject var121 = var122 = Functions.funcall(var120, var104);
                                                        if (module0427.NIL != module0077.f5302(var122)) {
                                                            final SubLObject var123 = module0077.f5333(var122);
                                                            SubLObject var124;
                                                            SubLObject var125;
                                                            SubLObject var126;
                                                            for (var124 = module0032.f1741(var123), var125 = (SubLObject)module0427.NIL, var125 = module0032.f1742(var124, var123); module0427.NIL == module0032.f1744(var124, var125); var125 = module0032.f1743(var125)) {
                                                                var126 = module0032.f1745(var124, var125);
                                                                if (module0427.NIL != module0032.f1746(var125, var126) && module0427.NIL == module0249.f16059(var126, (SubLObject)module0427.UNPROVIDED)) {
                                                                    module0249.f16055(var126, (SubLObject)module0427.UNPROVIDED);
                                                                    module0056.f4149(var126, var50);
                                                                }
                                                            }
                                                        }
                                                        else if (var122.isList()) {
                                                            SubLObject var127 = var122;
                                                            SubLObject var128 = (SubLObject)module0427.NIL;
                                                            var128 = var127.first();
                                                            while (module0427.NIL != var127) {
                                                                if (module0427.NIL == module0249.f16059(var128, (SubLObject)module0427.UNPROVIDED)) {
                                                                    module0249.f16055(var128, (SubLObject)module0427.UNPROVIDED);
                                                                    module0056.f4149(var128, var50);
                                                                }
                                                                var127 = var127.rest();
                                                                var128 = var127.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0427.$ic108$, var122);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var48_225, var44);
                                                    }
                                                    var62_232 = var62_232.rest();
                                                    var120 = var62_232.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var51_218, var44);
                                            module0137.$g1605$.rebind(var48_222, var44);
                                        }
                                        var102 = var102.rest();
                                        var103 = var102.first();
                                    }
                                    var116_211 = module0056.f4150(var50);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var52_219, var44);
                                module0138.$g1619$.rebind(var51_216, var44);
                                module0141.$g1677$.rebind(var48_215, var44);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0427.TWO_INTEGER, (SubLObject)module0427.$ic111$, var46, module0244.f15748(module0137.f8955((SubLObject)module0427.UNPROVIDED)), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var55, var44);
                        module0141.$g1674$.rebind(var54, var44);
                        module0141.$g1672$.rebind(var53, var44);
                        module0141.$g1671$.rebind(var51_215, var44);
                        module0141.$g1670$.rebind(var48_214, var44);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var51_214, var44);
                    module0141.$g1714$.rebind(var48_213, var44);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var44));
            }
            finally {
                module0139.$g1635$.rebind(var48_212, var44);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var44));
        }
        finally {
            module0139.$g1636$.rebind(var48, var44);
            module0137.$g1605$.rebind(var47, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f30268() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var46;
        final SubLObject var45 = var46 = f30260();
        module0012.$g82$.setDynamicValue((SubLObject)module0427.$ic119$, var44);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var44);
        module0012.$g83$.setDynamicValue(Sequences.length(var46), var44);
        module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var44);
        final SubLObject var47 = module0012.$g75$.currentBinding(var44);
        final SubLObject var48 = module0012.$g76$.currentBinding(var44);
        final SubLObject var49 = module0012.$g77$.currentBinding(var44);
        final SubLObject var50 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
            module0012.$g77$.bind((SubLObject)module0427.T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(module0012.$g82$.getDynamicValue(var44));
            SubLObject var51 = var46;
            SubLObject var52 = (SubLObject)module0427.NIL;
            var52 = var51.first();
            while (module0427.NIL != var51) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var44), module0012.$g83$.getDynamicValue(var44));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var44), (SubLObject)module0427.ONE_INTEGER), var44);
                f30252(var52);
                var51 = var51.rest();
                var52 = var51.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var50, var44);
            module0012.$g77$.rebind(var49, var44);
            module0012.$g76$.rebind(var48, var44);
            module0012.$g75$.rebind(var47, var44);
        }
        return Sequences.length(var45);
    }
    
    public static SubLObject f30269() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var46;
        final SubLObject var45 = var46 = f30261();
        module0012.$g82$.setDynamicValue((SubLObject)module0427.$ic119$, var44);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var44);
        module0012.$g83$.setDynamicValue(Sequences.length(var46), var44);
        module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var44);
        final SubLObject var47 = module0012.$g75$.currentBinding(var44);
        final SubLObject var48 = module0012.$g76$.currentBinding(var44);
        final SubLObject var49 = module0012.$g77$.currentBinding(var44);
        final SubLObject var50 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
            module0012.$g77$.bind((SubLObject)module0427.T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(module0012.$g82$.getDynamicValue(var44));
            SubLObject var51 = var46;
            SubLObject var52 = (SubLObject)module0427.NIL;
            var52 = var51.first();
            while (module0427.NIL != var51) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var44), module0012.$g83$.getDynamicValue(var44));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var44), (SubLObject)module0427.ONE_INTEGER), var44);
                f30252(var52);
                var51 = var51.rest();
                var52 = var51.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var50, var44);
            module0012.$g77$.rebind(var49, var44);
            module0012.$g76$.rebind(var48, var44);
            module0012.$g75$.rebind(var47, var44);
        }
        return Sequences.length(var45);
    }
    
    public static SubLObject f30270() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = (SubLObject)module0427.$ic120$;
        final SubLObject var47 = oc_assertions_low.f11226();
        SubLObject var48 = (SubLObject)module0427.ZERO_INTEGER;
        final SubLObject var49 = module0012.$g75$.currentBinding(var44);
        final SubLObject var50 = module0012.$g76$.currentBinding(var44);
        final SubLObject var51 = module0012.$g77$.currentBinding(var44);
        final SubLObject var52 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
            module0012.$g77$.bind((SubLObject)module0427.T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var46);
            final SubLObject var53 = module0031.f1696(oc_assertions_low.f11224());
            final SubLObject var54 = (SubLObject)module0427.NIL;
            SubLObject var55;
            SubLObject var56;
            SubLObject var57;
            SubLObject var58;
            for (var55 = Sequences.length(var53), var56 = (SubLObject)module0427.NIL, var56 = (SubLObject)module0427.ZERO_INTEGER; var56.numL(var55); var56 = Numbers.add(var56, (SubLObject)module0427.ONE_INTEGER)) {
                var57 = ((module0427.NIL != var54) ? Numbers.subtract(var55, var56, (SubLObject)module0427.ONE_INTEGER) : var56);
                var58 = Vectors.aref(var53, var57);
                if (module0427.NIL != module0031.f1697(var58)) {
                    var48 = Numbers.add(var48, (SubLObject)module0427.ONE_INTEGER);
                    module0012.note_percent_progress(var48, var47);
                    if (module0427.NIL != f30271(var58)) {
                        var45 = (SubLObject)ConsesLow.cons(var58, var45);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var52, var44);
            module0012.$g77$.rebind(var51, var44);
            module0012.$g76$.rebind(var50, var44);
            module0012.$g75$.rebind(var49, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f30271(final SubLObject var152) {
        if (module0414.f28895(var152).isZero() && module0427.NIL == module0178.f11313(var152) && module0427.NIL == f30272(var152)) {
            return (SubLObject)module0427.T;
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30272(final SubLObject var250) {
        final SubLObject var251 = module0178.f11300(var250);
        SubLObject var252;
        SubLObject var253;
        SubLObject var254;
        for (var252 = module0032.f1741(var251), var253 = (SubLObject)module0427.NIL, var253 = module0032.f1742(var252, var251); module0427.NIL == module0032.f1744(var252, var253); var253 = module0032.f1743(var253)) {
            var254 = module0032.f1745(var252, var253);
            if (module0427.NIL != module0032.f1746(var253, var254)) {
                if (module0427.NIL == oc_deduction_handles.f11659(var254)) {
                    return (SubLObject)module0427.T;
                }
                if (module0427.NIL == module0211.f13649(module0188.f11781(var254), module0427.$ic121$)) {
                    return (SubLObject)module0427.T;
                }
            }
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30273() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var46;
        final SubLObject var45 = var46 = f30270();
        SubLObject var47 = (SubLObject)module0427.NIL;
        var47 = var46.first();
        while (module0427.NIL != var46) {
            SubLObject var48 = (SubLObject)module0427.NIL;
            try {
                var44.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var49 = Errors.$error_handler$.currentBinding(var44);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0427.$ic122$, var44);
                    try {
                        f30252(var47);
                    }
                    catch (Throwable var50) {
                        Errors.handleThrowable(var50, (SubLObject)module0427.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var49, var44);
                }
            }
            catch (Throwable var51) {
                var48 = Errors.handleThrowable(var51, module0003.$g3$.getGlobalValue());
            }
            finally {
                var44.throwStack.pop();
            }
            if (var48.isString()) {
                Errors.warn((SubLObject)module0427.$ic123$, var48);
            }
            var46 = var46.rest();
            var47 = var46.first();
        }
        return Sequences.length(var45);
    }
    
    public static SubLObject f30274() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = (SubLObject)module0427.$ic120$;
        final SubLObject var47 = oc_assertions_low.f11226();
        SubLObject var48 = (SubLObject)module0427.ZERO_INTEGER;
        final SubLObject var49 = module0012.$g75$.currentBinding(var44);
        final SubLObject var50 = module0012.$g76$.currentBinding(var44);
        final SubLObject var51 = module0012.$g77$.currentBinding(var44);
        final SubLObject var52 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
            module0012.$g77$.bind((SubLObject)module0427.T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var46);
            final SubLObject var53 = module0031.f1696(oc_assertions_low.f11224());
            final SubLObject var54 = (SubLObject)module0427.NIL;
            SubLObject var55;
            SubLObject var56;
            SubLObject var57;
            SubLObject var58;
            for (var55 = Sequences.length(var53), var56 = (SubLObject)module0427.NIL, var56 = (SubLObject)module0427.ZERO_INTEGER; var56.numL(var55); var56 = Numbers.add(var56, (SubLObject)module0427.ONE_INTEGER)) {
                var57 = ((module0427.NIL != var54) ? Numbers.subtract(var55, var56, (SubLObject)module0427.ONE_INTEGER) : var56);
                var58 = Vectors.aref(var53, var57);
                if (module0427.NIL != module0031.f1697(var58)) {
                    var48 = Numbers.add(var48, (SubLObject)module0427.ONE_INTEGER);
                    module0012.note_percent_progress(var48, var47);
                    if (module0427.NIL != f30275(var58) && module0414.f28895(var58).isPositive() && module0427.NIL == module0178.f11313(var58) && module0427.NIL == f30272(var58)) {
                        var45 = (SubLObject)ConsesLow.cons(var58, var45);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var52, var44);
            module0012.$g77$.rebind(var51, var44);
            module0012.$g76$.rebind(var50, var44);
            module0012.$g75$.rebind(var49, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f30276() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var46;
        final SubLObject var45 = var46 = f30274();
        SubLObject var47 = (SubLObject)module0427.NIL;
        var47 = var46.first();
        while (module0427.NIL != var46) {
            SubLObject var48 = (SubLObject)module0427.NIL;
            try {
                var44.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var49 = Errors.$error_handler$.currentBinding(var44);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0427.$ic122$, var44);
                    try {
                        f30252(var47);
                    }
                    catch (Throwable var50) {
                        Errors.handleThrowable(var50, (SubLObject)module0427.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var49, var44);
                }
            }
            catch (Throwable var51) {
                var48 = Errors.handleThrowable(var51, module0003.$g3$.getGlobalValue());
            }
            finally {
                var44.throwStack.pop();
            }
            if (var48.isString()) {
                Errors.warn((SubLObject)module0427.$ic123$, var48);
            }
            var46 = var46.rest();
            var47 = var46.first();
        }
        return Sequences.length(var45);
    }
    
    public static SubLObject f30275(final SubLObject var152) {
        return Numbers.zerop(module0414.f28902(var152));
    }
    
    public static SubLObject f30277(final SubLObject var152) {
        return Numbers.plusp(module0414.f28902(var152));
    }
    
    public static SubLObject f30278(final SubLObject var152) {
        return Numbers.zerop(module0414.f28895(var152));
    }
    
    public static SubLObject f30279(final SubLObject var152) {
        return Numbers.plusp(module0414.f28895(var152));
    }
    
    public static SubLObject f30280(final SubLObject var152) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0427.NIL != f30279(var152) && module0427.NIL == f30277(var152));
    }
    
    public static SubLObject f30281(final SubLObject var254) {
        final SubLObject var255 = module0213.f13977();
        final SubLObject var256 = f30260();
        final SubLObject var257 = f30261();
        final SubLObject var258 = f30270();
        final SubLObject var259 = f30274();
        return f30282(var255, var256, var257, var258, var259, var254);
    }
    
    public static SubLObject f30283(final SubLObject var257, final SubLObject var258) {
        return module0035.f2385(var257, var258, module0427.$g3482$.getGlobalValue(), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30282(final SubLObject var255, final SubLObject var186, final SubLObject var256, final SubLObject var245, final SubLObject var253, final SubLObject var254) {
        final SubLThread var257 = SubLProcess.currentSubLThread();
        SubLObject var258 = (SubLObject)module0427.NIL;
        final SubLObject var259 = module0078.f5367(var186, Symbols.symbol_function((SubLObject)module0427.EQ), (SubLObject)module0427.UNPROVIDED);
        final SubLObject var260 = module0078.f5367(var256, Symbols.symbol_function((SubLObject)module0427.EQ), (SubLObject)module0427.UNPROVIDED);
        final SubLObject var261 = module0078.f5367(var245, Symbols.symbol_function((SubLObject)module0427.EQ), (SubLObject)module0427.UNPROVIDED);
        final SubLObject var262 = module0078.f5367(var253, Symbols.symbol_function((SubLObject)module0427.EQ), (SubLObject)module0427.UNPROVIDED);
        module0012.$g82$.setDynamicValue((SubLObject)module0427.$ic119$, var257);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var257);
        module0012.$g83$.setDynamicValue(Sequences.length(var255), var257);
        module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var257);
        final SubLObject var263 = module0012.$g75$.currentBinding(var257);
        final SubLObject var264 = module0012.$g76$.currentBinding(var257);
        final SubLObject var265 = module0012.$g77$.currentBinding(var257);
        final SubLObject var266 = module0012.$g78$.currentBinding(var257);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var257);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var257);
            module0012.$g77$.bind((SubLObject)module0427.T, var257);
            module0012.$g78$.bind(Time.get_universal_time(), var257);
            module0012.f478(module0012.$g82$.getDynamicValue(var257));
            SubLObject var267 = var255;
            SubLObject var268 = (SubLObject)module0427.NIL;
            var268 = var267.first();
            while (module0427.NIL != var267) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var257), module0012.$g83$.getDynamicValue(var257));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var257), (SubLObject)module0427.ONE_INTEGER), var257);
                final SubLObject var269 = module0077.f5320(var268, var259);
                final SubLObject var270 = module0077.f5320(var268, var260);
                final SubLObject var271 = module0077.f5320(var268, var261);
                final SubLObject var272 = module0077.f5320(var268, var262);
                SubLObject var273 = (SubLObject)module0427.NIL;
                if (module0427.NIL != var254 && module0427.NIL != var270 && module0427.NIL != var272) {
                    var273 = (SubLObject)module0427.$ic125$;
                }
                else if (module0427.NIL != var254 && module0427.NIL != var270) {
                    var273 = (SubLObject)module0427.$ic126$;
                }
                else if (module0427.NIL != var254 && module0427.NIL != var269 && module0427.NIL != var271) {
                    var273 = (SubLObject)module0427.$ic127$;
                }
                else if (module0427.NIL != var254 && module0427.NIL != var269) {
                    if (module0427.NIL != f30277(var268)) {
                        var273 = (SubLObject)module0427.$ic128$;
                    }
                    else if (module0427.NIL != module0178.f11313(var268)) {
                        var273 = (SubLObject)module0427.$ic129$;
                    }
                    else {
                        var273 = (SubLObject)module0427.$ic130$;
                    }
                }
                else if (module0427.NIL != var271) {
                    var273 = (SubLObject)module0427.$ic131$;
                }
                else if (module0427.NIL != var272) {
                    var273 = (SubLObject)module0427.$ic132$;
                }
                else if (module0427.NIL != f30277(var268)) {
                    if (module0427.NIL != module0178.f11313(var268)) {
                        var273 = (SubLObject)module0427.$ic133$;
                    }
                    else {
                        var273 = (SubLObject)module0427.$ic134$;
                    }
                }
                else if (module0427.NIL != module0178.f11313(var268)) {
                    if (module0427.NIL != module0178.f11382(var268)) {
                        var273 = (SubLObject)module0427.$ic135$;
                    }
                    else {
                        var273 = (SubLObject)module0427.$ic136$;
                    }
                }
                else if (module0427.NIL != module0178.f11382(var268)) {
                    var273 = (SubLObject)module0427.$ic137$;
                }
                else {
                    var273 = (SubLObject)module0427.$ic138$;
                }
                var258 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var268, var273), var258);
                var267 = var267.rest();
                var268 = var267.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var266, var257);
            module0012.$g77$.rebind(var265, var257);
            module0012.$g76$.rebind(var264, var257);
            module0012.$g75$.rebind(var263, var257);
        }
        return Sequences.nreverse(var258);
    }
    
    public static SubLObject f30284() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = module0427.$ic96$;
        final SubLObject var47 = module0137.$g1605$.currentBinding(var44);
        final SubLObject var48 = module0139.$g1636$.currentBinding(var44);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0427.$ic57$), var44);
            module0139.$g1636$.bind(module0139.f9007(), var44);
            SubLObject var116_270 = var46;
            final SubLObject var49 = (SubLObject)module0427.$ic99$;
            final SubLObject var50 = module0056.f4145(var49);
            final SubLObject var48_271 = module0139.$g1635$.currentBinding(var44);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var44);
                final SubLObject var51 = (SubLObject)module0427.NIL;
                final SubLObject var48_272 = module0141.$g1714$.currentBinding(var44);
                final SubLObject var51_273 = module0141.$g1715$.currentBinding(var44);
                try {
                    module0141.$g1714$.bind((module0427.NIL != var51) ? var51 : module0141.f9283(), var44);
                    module0141.$g1715$.bind((SubLObject)((module0427.NIL != var51) ? module0427.$ic100$ : module0141.$g1715$.getDynamicValue(var44)), var44);
                    if (module0427.NIL != var51 && module0427.NIL != module0136.f8864() && module0427.NIL == module0141.f9279(var51)) {
                        final SubLObject var52 = module0136.$g1591$.getDynamicValue(var44);
                        if (var52.eql((SubLObject)module0427.$ic101$)) {
                            module0136.f8870((SubLObject)module0427.ONE_INTEGER, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                        else if (var52.eql((SubLObject)module0427.$ic104$)) {
                            module0136.f8871((SubLObject)module0427.ONE_INTEGER, (SubLObject)module0427.$ic105$, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                        else if (var52.eql((SubLObject)module0427.$ic106$)) {
                            Errors.warn((SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$);
                        }
                        else {
                            Errors.warn((SubLObject)module0427.$ic107$, module0136.$g1591$.getDynamicValue(var44));
                            Errors.cerror((SubLObject)module0427.$ic105$, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$);
                        }
                    }
                    final SubLObject var48_273 = module0141.$g1670$.currentBinding(var44);
                    final SubLObject var51_274 = module0141.$g1671$.currentBinding(var44);
                    final SubLObject var53 = module0141.$g1672$.currentBinding(var44);
                    final SubLObject var54 = module0141.$g1674$.currentBinding(var44);
                    final SubLObject var55 = module0137.$g1605$.currentBinding(var44);
                    try {
                        module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0427.$ic57$)), var44);
                        module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                        module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                        module0141.$g1674$.bind((SubLObject)module0427.NIL, var44);
                        module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0427.$ic57$)), var44);
                        if (module0427.NIL != module0136.f8865() || module0427.NIL != module0244.f15795(var46, module0137.f8955((SubLObject)module0427.UNPROVIDED))) {
                            final SubLObject var48_274 = module0141.$g1677$.currentBinding(var44);
                            final SubLObject var51_275 = module0138.$g1619$.currentBinding(var44);
                            final SubLObject var52_278 = module0141.$g1674$.currentBinding(var44);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var44);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                                module0141.$g1674$.bind((SubLObject)module0427.NIL, var44);
                                module0249.f16055(var116_270, (SubLObject)module0427.UNPROVIDED);
                                while (module0427.NIL != var116_270) {
                                    final SubLObject var56 = var116_270;
                                    SubLObject var58;
                                    final SubLObject var57 = var58 = module0200.f12443(module0137.f8955(module0427.$ic57$));
                                    SubLObject var59 = (SubLObject)module0427.NIL;
                                    var59 = var58.first();
                                    while (module0427.NIL != var58) {
                                        final SubLObject var48_275 = module0137.$g1605$.currentBinding(var44);
                                        final SubLObject var51_276 = module0141.$g1674$.currentBinding(var44);
                                        try {
                                            module0137.$g1605$.bind(var59, var44);
                                            module0141.$g1674$.bind((SubLObject)((module0427.NIL != module0141.f9205((SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0427.NIL == module0141.$g1674$.getDynamicValue(var44)) : module0141.$g1674$.getDynamicValue(var44)), var44);
                                            final SubLObject var60 = module0228.f15229(var56);
                                            if (module0427.NIL != module0138.f8992(var60)) {
                                                final SubLObject var61 = module0242.f15664(var60, module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                if (module0427.NIL != var61) {
                                                    final SubLObject var62 = module0245.f15834(var61, module0244.f15780(module0137.f8955(module0427.$ic57$)), module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                    if (module0427.NIL != var62) {
                                                        SubLObject var63;
                                                        for (var63 = module0066.f4838(module0067.f4891(var62)); module0427.NIL == module0066.f4841(var63); var63 = module0066.f4840(var63)) {
                                                            var44.resetMultipleValues();
                                                            final SubLObject var64 = module0066.f4839(var63);
                                                            final SubLObject var65 = var44.secondMultipleValue();
                                                            var44.resetMultipleValues();
                                                            if (module0427.NIL != module0147.f9507(var64)) {
                                                                final SubLObject var48_276 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var64, var44);
                                                                    SubLObject var139_282;
                                                                    for (var139_282 = module0066.f4838(module0067.f4891(var65)); module0427.NIL == module0066.f4841(var139_282); var139_282 = module0066.f4840(var139_282)) {
                                                                        var44.resetMultipleValues();
                                                                        final SubLObject var66 = module0066.f4839(var139_282);
                                                                        final SubLObject var67 = var44.secondMultipleValue();
                                                                        var44.resetMultipleValues();
                                                                        if (module0427.NIL != module0141.f9289(var66)) {
                                                                            final SubLObject var48_277 = module0138.$g1624$.currentBinding(var44);
                                                                            try {
                                                                                module0138.$g1624$.bind(var66, var44);
                                                                                final SubLObject var68 = var67;
                                                                                if (module0427.NIL != module0077.f5302(var68)) {
                                                                                    final SubLObject var69 = module0077.f5333(var68);
                                                                                    SubLObject var70;
                                                                                    SubLObject var71;
                                                                                    SubLObject var72;
                                                                                    SubLObject var73;
                                                                                    SubLObject var62_284;
                                                                                    SubLObject var74;
                                                                                    SubLObject var75;
                                                                                    for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0427.NIL, var71 = module0032.f1742(var70, var69); module0427.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                        var72 = module0032.f1745(var70, var71);
                                                                                        if (module0427.NIL != module0032.f1746(var71, var72) && module0427.NIL == module0249.f16059(var72, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                            module0249.f16055(var72, module0139.$g1636$.getDynamicValue(var44));
                                                                                            if (module0427.NIL != module0173.f10955(var72)) {
                                                                                                var73 = module0423.f29579(var72);
                                                                                                if (var73.isCons()) {
                                                                                                    var62_284 = var73;
                                                                                                    var74 = (SubLObject)module0427.NIL;
                                                                                                    var74 = var62_284.first();
                                                                                                    while (module0427.NIL != var62_284) {
                                                                                                        var75 = var74;
                                                                                                        if (module0427.NIL == conses_high.member(var75, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                            var45 = (SubLObject)ConsesLow.cons(var75, var45);
                                                                                                        }
                                                                                                        var62_284 = var62_284.rest();
                                                                                                        var74 = var62_284.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var68.isList()) {
                                                                                    SubLObject var76 = var68;
                                                                                    SubLObject var77 = (SubLObject)module0427.NIL;
                                                                                    var77 = var76.first();
                                                                                    while (module0427.NIL != var76) {
                                                                                        if (module0427.NIL == module0249.f16059(var77, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                            module0249.f16055(var77, module0139.$g1636$.getDynamicValue(var44));
                                                                                            if (module0427.NIL != module0173.f10955(var77)) {
                                                                                                final SubLObject var78 = module0423.f29579(var77);
                                                                                                if (var78.isCons()) {
                                                                                                    SubLObject var62_285 = var78;
                                                                                                    SubLObject var79 = (SubLObject)module0427.NIL;
                                                                                                    var79 = var62_285.first();
                                                                                                    while (module0427.NIL != var62_285) {
                                                                                                        final SubLObject var80 = var79;
                                                                                                        if (module0427.NIL == conses_high.member(var80, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                            var45 = (SubLObject)ConsesLow.cons(var80, var45);
                                                                                                        }
                                                                                                        var62_285 = var62_285.rest();
                                                                                                        var79 = var62_285.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var76 = var76.rest();
                                                                                        var77 = var76.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0427.$ic108$, var68);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var48_277, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var139_282);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_276, var44);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var63);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0427.FIVE_INTEGER, (SubLObject)module0427.$ic109$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                                                }
                                                if (module0427.NIL != module0200.f12419(var60, module0137.f8955((SubLObject)module0427.UNPROVIDED))) {
                                                    SubLObject var81 = module0248.f15995(var60);
                                                    SubLObject var82 = (SubLObject)module0427.NIL;
                                                    var82 = var81.first();
                                                    while (module0427.NIL != var81) {
                                                        SubLObject var84;
                                                        final SubLObject var83 = var84 = var82;
                                                        SubLObject var85 = (SubLObject)module0427.NIL;
                                                        SubLObject var86 = (SubLObject)module0427.NIL;
                                                        SubLObject var87 = (SubLObject)module0427.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0427.$ic110$);
                                                        var85 = var84.first();
                                                        var84 = var84.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0427.$ic110$);
                                                        var86 = var84.first();
                                                        var84 = var84.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0427.$ic110$);
                                                        var87 = var84.first();
                                                        var84 = var84.rest();
                                                        if (module0427.NIL == var84) {
                                                            if (module0427.NIL != module0147.f9507(var86)) {
                                                                final SubLObject var48_278 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var86, var44);
                                                                    if (module0427.NIL != module0141.f9289(var87)) {
                                                                        final SubLObject var48_279 = module0138.$g1624$.currentBinding(var44);
                                                                        try {
                                                                            module0138.$g1624$.bind(var87, var44);
                                                                            final SubLObject var68;
                                                                            final SubLObject var88 = var68 = (SubLObject)ConsesLow.list(var85);
                                                                            if (module0427.NIL != module0077.f5302(var68)) {
                                                                                final SubLObject var69 = module0077.f5333(var68);
                                                                                SubLObject var70;
                                                                                SubLObject var71;
                                                                                SubLObject var72;
                                                                                SubLObject var73;
                                                                                SubLObject var74;
                                                                                SubLObject var75;
                                                                                SubLObject var62_286;
                                                                                for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0427.NIL, var71 = module0032.f1742(var70, var69); module0427.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                    var72 = module0032.f1745(var70, var71);
                                                                                    if (module0427.NIL != module0032.f1746(var71, var72) && module0427.NIL == module0249.f16059(var72, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                        module0249.f16055(var72, module0139.$g1636$.getDynamicValue(var44));
                                                                                        if (module0427.NIL != module0173.f10955(var72)) {
                                                                                            var73 = module0423.f29579(var72);
                                                                                            if (var73.isCons()) {
                                                                                                var62_286 = var73;
                                                                                                var74 = (SubLObject)module0427.NIL;
                                                                                                var74 = var62_286.first();
                                                                                                while (module0427.NIL != var62_286) {
                                                                                                    var75 = var74;
                                                                                                    if (module0427.NIL == conses_high.member(var75, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                        var45 = (SubLObject)ConsesLow.cons(var75, var45);
                                                                                                    }
                                                                                                    var62_286 = var62_286.rest();
                                                                                                    var74 = var62_286.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var68.isList()) {
                                                                                SubLObject var54_292 = var68;
                                                                                SubLObject var77 = (SubLObject)module0427.NIL;
                                                                                var77 = var54_292.first();
                                                                                while (module0427.NIL != var54_292) {
                                                                                    if (module0427.NIL == module0249.f16059(var77, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                        module0249.f16055(var77, module0139.$g1636$.getDynamicValue(var44));
                                                                                        if (module0427.NIL != module0173.f10955(var77)) {
                                                                                            final SubLObject var78 = module0423.f29579(var77);
                                                                                            if (var78.isCons()) {
                                                                                                SubLObject var62_287 = var78;
                                                                                                SubLObject var79 = (SubLObject)module0427.NIL;
                                                                                                var79 = var62_287.first();
                                                                                                while (module0427.NIL != var62_287) {
                                                                                                    final SubLObject var80 = var79;
                                                                                                    if (module0427.NIL == conses_high.member(var80, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                        var45 = (SubLObject)ConsesLow.cons(var80, var45);
                                                                                                    }
                                                                                                    var62_287 = var62_287.rest();
                                                                                                    var79 = var62_287.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    var54_292 = var54_292.rest();
                                                                                    var77 = var54_292.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)module0427.$ic108$, var68);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var48_279, var44);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_278, var44);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0427.$ic110$);
                                                        }
                                                        var81 = var81.rest();
                                                        var82 = var81.first();
                                                    }
                                                }
                                            }
                                            else if (module0427.NIL != module0155.f9785(var60, (SubLObject)module0427.UNPROVIDED)) {
                                                SubLObject var62_288;
                                                final SubLObject var89 = var62_288 = ((module0427.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0427.$ic57$)), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0427.$ic57$)), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED)));
                                                SubLObject var90 = (SubLObject)module0427.NIL;
                                                var90 = var62_288.first();
                                                while (module0427.NIL != var62_288) {
                                                    final SubLObject var48_280 = module0138.$g1625$.currentBinding(var44);
                                                    try {
                                                        module0138.$g1625$.bind(var90, var44);
                                                        final SubLObject var92;
                                                        final SubLObject var91 = var92 = Functions.funcall(var90, var60);
                                                        if (module0427.NIL != module0077.f5302(var92)) {
                                                            final SubLObject var93 = module0077.f5333(var92);
                                                            SubLObject var94;
                                                            SubLObject var95;
                                                            SubLObject var96;
                                                            SubLObject var97;
                                                            SubLObject var62_289;
                                                            SubLObject var98;
                                                            SubLObject var99;
                                                            for (var94 = module0032.f1741(var93), var95 = (SubLObject)module0427.NIL, var95 = module0032.f1742(var94, var93); module0427.NIL == module0032.f1744(var94, var95); var95 = module0032.f1743(var95)) {
                                                                var96 = module0032.f1745(var94, var95);
                                                                if (module0427.NIL != module0032.f1746(var95, var96) && module0427.NIL == module0249.f16059(var96, module0139.$g1636$.getDynamicValue(var44))) {
                                                                    module0249.f16055(var96, module0139.$g1636$.getDynamicValue(var44));
                                                                    if (module0427.NIL != module0173.f10955(var96)) {
                                                                        var97 = module0423.f29579(var96);
                                                                        if (var97.isCons()) {
                                                                            var62_289 = var97;
                                                                            var98 = (SubLObject)module0427.NIL;
                                                                            var98 = var62_289.first();
                                                                            while (module0427.NIL != var62_289) {
                                                                                var99 = var98;
                                                                                if (module0427.NIL == conses_high.member(var99, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                    var45 = (SubLObject)ConsesLow.cons(var99, var45);
                                                                                }
                                                                                var62_289 = var62_289.rest();
                                                                                var98 = var62_289.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else if (var92.isList()) {
                                                            SubLObject var100 = var92;
                                                            SubLObject var101 = (SubLObject)module0427.NIL;
                                                            var101 = var100.first();
                                                            while (module0427.NIL != var100) {
                                                                if (module0427.NIL == module0249.f16059(var101, module0139.$g1636$.getDynamicValue(var44))) {
                                                                    module0249.f16055(var101, module0139.$g1636$.getDynamicValue(var44));
                                                                    if (module0427.NIL != module0173.f10955(var101)) {
                                                                        final SubLObject var102 = module0423.f29579(var101);
                                                                        if (var102.isCons()) {
                                                                            SubLObject var62_290 = var102;
                                                                            SubLObject var103 = (SubLObject)module0427.NIL;
                                                                            var103 = var62_290.first();
                                                                            while (module0427.NIL != var62_290) {
                                                                                final SubLObject var104 = var103;
                                                                                if (module0427.NIL == conses_high.member(var104, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                    var45 = (SubLObject)ConsesLow.cons(var104, var45);
                                                                                }
                                                                                var62_290 = var62_290.rest();
                                                                                var103 = var62_290.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                var100 = var100.rest();
                                                                var101 = var100.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0427.$ic108$, var92);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var48_280, var44);
                                                    }
                                                    var62_288 = var62_288.rest();
                                                    var90 = var62_288.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var51_276, var44);
                                            module0137.$g1605$.rebind(var48_275, var44);
                                        }
                                        var58 = var58.rest();
                                        var59 = var58.first();
                                    }
                                    SubLObject var106;
                                    final SubLObject var105 = var106 = module0200.f12443(module0244.f15771(module0137.f8955(module0427.$ic57$)));
                                    SubLObject var107 = (SubLObject)module0427.NIL;
                                    var107 = var106.first();
                                    while (module0427.NIL != var106) {
                                        final SubLObject var48_281 = module0137.$g1605$.currentBinding(var44);
                                        final SubLObject var51_277 = module0141.$g1674$.currentBinding(var44);
                                        try {
                                            module0137.$g1605$.bind(var107, var44);
                                            module0141.$g1674$.bind((SubLObject)((module0427.NIL != module0141.f9205((SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0427.NIL == module0141.$g1674$.getDynamicValue(var44)) : module0141.$g1674$.getDynamicValue(var44)), var44);
                                            final SubLObject var108 = module0228.f15229(var116_270);
                                            if (module0427.NIL != module0138.f8992(var108)) {
                                                final SubLObject var109 = module0242.f15664(var108, module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                if (module0427.NIL != var109) {
                                                    final SubLObject var110 = module0245.f15834(var109, module0138.f8979(), module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                    if (module0427.NIL != var110) {
                                                        SubLObject var111;
                                                        for (var111 = module0066.f4838(module0067.f4891(var110)); module0427.NIL == module0066.f4841(var111); var111 = module0066.f4840(var111)) {
                                                            var44.resetMultipleValues();
                                                            final SubLObject var112 = module0066.f4839(var111);
                                                            final SubLObject var113 = var44.secondMultipleValue();
                                                            var44.resetMultipleValues();
                                                            if (module0427.NIL != module0147.f9507(var112)) {
                                                                final SubLObject var48_282 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var112, var44);
                                                                    SubLObject var139_283;
                                                                    for (var139_283 = module0066.f4838(module0067.f4891(var113)); module0427.NIL == module0066.f4841(var139_283); var139_283 = module0066.f4840(var139_283)) {
                                                                        var44.resetMultipleValues();
                                                                        final SubLObject var114 = module0066.f4839(var139_283);
                                                                        final SubLObject var115 = var44.secondMultipleValue();
                                                                        var44.resetMultipleValues();
                                                                        if (module0427.NIL != module0141.f9289(var114)) {
                                                                            final SubLObject var48_283 = module0138.$g1624$.currentBinding(var44);
                                                                            try {
                                                                                module0138.$g1624$.bind(var114, var44);
                                                                                final SubLObject var116 = var115;
                                                                                if (module0427.NIL != module0077.f5302(var116)) {
                                                                                    final SubLObject var117 = module0077.f5333(var116);
                                                                                    SubLObject var118;
                                                                                    SubLObject var119;
                                                                                    SubLObject var120;
                                                                                    for (var118 = module0032.f1741(var117), var119 = (SubLObject)module0427.NIL, var119 = module0032.f1742(var118, var117); module0427.NIL == module0032.f1744(var118, var119); var119 = module0032.f1743(var119)) {
                                                                                        var120 = module0032.f1745(var118, var119);
                                                                                        if (module0427.NIL != module0032.f1746(var119, var120) && module0427.NIL == module0249.f16059(var120, (SubLObject)module0427.UNPROVIDED)) {
                                                                                            module0249.f16055(var120, (SubLObject)module0427.UNPROVIDED);
                                                                                            module0056.f4149(var120, var50);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var116.isList()) {
                                                                                    SubLObject var121 = var116;
                                                                                    SubLObject var122 = (SubLObject)module0427.NIL;
                                                                                    var122 = var121.first();
                                                                                    while (module0427.NIL != var121) {
                                                                                        if (module0427.NIL == module0249.f16059(var122, (SubLObject)module0427.UNPROVIDED)) {
                                                                                            module0249.f16055(var122, (SubLObject)module0427.UNPROVIDED);
                                                                                            module0056.f4149(var122, var50);
                                                                                        }
                                                                                        var121 = var121.rest();
                                                                                        var122 = var121.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0427.$ic108$, var116);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var48_283, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var139_283);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_282, var44);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var111);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0427.FIVE_INTEGER, (SubLObject)module0427.$ic109$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                                                }
                                            }
                                            else if (module0427.NIL != module0155.f9785(var108, (SubLObject)module0427.UNPROVIDED)) {
                                                SubLObject var62_291;
                                                final SubLObject var123 = var62_291 = ((module0427.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED)));
                                                SubLObject var124 = (SubLObject)module0427.NIL;
                                                var124 = var62_291.first();
                                                while (module0427.NIL != var62_291) {
                                                    final SubLObject var48_284 = module0138.$g1625$.currentBinding(var44);
                                                    try {
                                                        module0138.$g1625$.bind(var124, var44);
                                                        final SubLObject var126;
                                                        final SubLObject var125 = var126 = Functions.funcall(var124, var108);
                                                        if (module0427.NIL != module0077.f5302(var126)) {
                                                            final SubLObject var127 = module0077.f5333(var126);
                                                            SubLObject var128;
                                                            SubLObject var129;
                                                            SubLObject var130;
                                                            for (var128 = module0032.f1741(var127), var129 = (SubLObject)module0427.NIL, var129 = module0032.f1742(var128, var127); module0427.NIL == module0032.f1744(var128, var129); var129 = module0032.f1743(var129)) {
                                                                var130 = module0032.f1745(var128, var129);
                                                                if (module0427.NIL != module0032.f1746(var129, var130) && module0427.NIL == module0249.f16059(var130, (SubLObject)module0427.UNPROVIDED)) {
                                                                    module0249.f16055(var130, (SubLObject)module0427.UNPROVIDED);
                                                                    module0056.f4149(var130, var50);
                                                                }
                                                            }
                                                        }
                                                        else if (var126.isList()) {
                                                            SubLObject var131 = var126;
                                                            SubLObject var132 = (SubLObject)module0427.NIL;
                                                            var132 = var131.first();
                                                            while (module0427.NIL != var131) {
                                                                if (module0427.NIL == module0249.f16059(var132, (SubLObject)module0427.UNPROVIDED)) {
                                                                    module0249.f16055(var132, (SubLObject)module0427.UNPROVIDED);
                                                                    module0056.f4149(var132, var50);
                                                                }
                                                                var131 = var131.rest();
                                                                var132 = var131.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0427.$ic108$, var126);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var48_284, var44);
                                                    }
                                                    var62_291 = var62_291.rest();
                                                    var124 = var62_291.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var51_277, var44);
                                            module0137.$g1605$.rebind(var48_281, var44);
                                        }
                                        var106 = var106.rest();
                                        var107 = var106.first();
                                    }
                                    var116_270 = module0056.f4150(var50);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var52_278, var44);
                                module0138.$g1619$.rebind(var51_275, var44);
                                module0141.$g1677$.rebind(var48_274, var44);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0427.TWO_INTEGER, (SubLObject)module0427.$ic111$, var46, module0244.f15748(module0137.f8955((SubLObject)module0427.UNPROVIDED)), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var55, var44);
                        module0141.$g1674$.rebind(var54, var44);
                        module0141.$g1672$.rebind(var53, var44);
                        module0141.$g1671$.rebind(var51_274, var44);
                        module0141.$g1670$.rebind(var48_273, var44);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var51_273, var44);
                    module0141.$g1714$.rebind(var48_272, var44);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var44));
            }
            finally {
                module0139.$g1635$.rebind(var48_271, var44);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var44));
        }
        finally {
            module0139.$g1636$.rebind(var48, var44);
            module0137.$g1605$.rebind(var47, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f30285() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = module0427.$ic78$;
        final SubLObject var47 = module0137.$g1605$.currentBinding(var44);
        final SubLObject var48 = module0139.$g1636$.currentBinding(var44);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0427.$ic57$), var44);
            module0139.$g1636$.bind(module0139.f9007(), var44);
            SubLObject var116_305 = var46;
            final SubLObject var49 = (SubLObject)module0427.$ic99$;
            final SubLObject var50 = module0056.f4145(var49);
            final SubLObject var48_306 = module0139.$g1635$.currentBinding(var44);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var44);
                final SubLObject var51 = (SubLObject)module0427.NIL;
                final SubLObject var48_307 = module0141.$g1714$.currentBinding(var44);
                final SubLObject var51_308 = module0141.$g1715$.currentBinding(var44);
                try {
                    module0141.$g1714$.bind((module0427.NIL != var51) ? var51 : module0141.f9283(), var44);
                    module0141.$g1715$.bind((SubLObject)((module0427.NIL != var51) ? module0427.$ic100$ : module0141.$g1715$.getDynamicValue(var44)), var44);
                    if (module0427.NIL != var51 && module0427.NIL != module0136.f8864() && module0427.NIL == module0141.f9279(var51)) {
                        final SubLObject var52 = module0136.$g1591$.getDynamicValue(var44);
                        if (var52.eql((SubLObject)module0427.$ic101$)) {
                            module0136.f8870((SubLObject)module0427.ONE_INTEGER, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                        else if (var52.eql((SubLObject)module0427.$ic104$)) {
                            module0136.f8871((SubLObject)module0427.ONE_INTEGER, (SubLObject)module0427.$ic105$, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                        else if (var52.eql((SubLObject)module0427.$ic106$)) {
                            Errors.warn((SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$);
                        }
                        else {
                            Errors.warn((SubLObject)module0427.$ic107$, module0136.$g1591$.getDynamicValue(var44));
                            Errors.cerror((SubLObject)module0427.$ic105$, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$);
                        }
                    }
                    final SubLObject var48_308 = module0141.$g1670$.currentBinding(var44);
                    final SubLObject var51_309 = module0141.$g1671$.currentBinding(var44);
                    final SubLObject var53 = module0141.$g1672$.currentBinding(var44);
                    final SubLObject var54 = module0141.$g1674$.currentBinding(var44);
                    final SubLObject var55 = module0137.$g1605$.currentBinding(var44);
                    try {
                        module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0427.$ic57$)), var44);
                        module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                        module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                        module0141.$g1674$.bind((SubLObject)module0427.NIL, var44);
                        module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0427.$ic57$)), var44);
                        if (module0427.NIL != module0136.f8865() || module0427.NIL != module0244.f15795(var46, module0137.f8955((SubLObject)module0427.UNPROVIDED))) {
                            final SubLObject var48_309 = module0141.$g1677$.currentBinding(var44);
                            final SubLObject var51_310 = module0138.$g1619$.currentBinding(var44);
                            final SubLObject var52_313 = module0141.$g1674$.currentBinding(var44);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var44);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                                module0141.$g1674$.bind((SubLObject)module0427.NIL, var44);
                                module0249.f16055(var116_305, (SubLObject)module0427.UNPROVIDED);
                                while (module0427.NIL != var116_305) {
                                    final SubLObject var56 = var116_305;
                                    SubLObject var58;
                                    final SubLObject var57 = var58 = module0200.f12443(module0137.f8955(module0427.$ic57$));
                                    SubLObject var59 = (SubLObject)module0427.NIL;
                                    var59 = var58.first();
                                    while (module0427.NIL != var58) {
                                        final SubLObject var48_310 = module0137.$g1605$.currentBinding(var44);
                                        final SubLObject var51_311 = module0141.$g1674$.currentBinding(var44);
                                        try {
                                            module0137.$g1605$.bind(var59, var44);
                                            module0141.$g1674$.bind((SubLObject)((module0427.NIL != module0141.f9205((SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0427.NIL == module0141.$g1674$.getDynamicValue(var44)) : module0141.$g1674$.getDynamicValue(var44)), var44);
                                            final SubLObject var60 = module0228.f15229(var56);
                                            if (module0427.NIL != module0138.f8992(var60)) {
                                                final SubLObject var61 = module0242.f15664(var60, module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                if (module0427.NIL != var61) {
                                                    final SubLObject var62 = module0245.f15834(var61, module0244.f15780(module0137.f8955(module0427.$ic57$)), module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                    if (module0427.NIL != var62) {
                                                        SubLObject var63;
                                                        for (var63 = module0066.f4838(module0067.f4891(var62)); module0427.NIL == module0066.f4841(var63); var63 = module0066.f4840(var63)) {
                                                            var44.resetMultipleValues();
                                                            final SubLObject var64 = module0066.f4839(var63);
                                                            final SubLObject var65 = var44.secondMultipleValue();
                                                            var44.resetMultipleValues();
                                                            if (module0427.NIL != module0147.f9507(var64)) {
                                                                final SubLObject var48_311 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var64, var44);
                                                                    SubLObject var139_317;
                                                                    for (var139_317 = module0066.f4838(module0067.f4891(var65)); module0427.NIL == module0066.f4841(var139_317); var139_317 = module0066.f4840(var139_317)) {
                                                                        var44.resetMultipleValues();
                                                                        final SubLObject var66 = module0066.f4839(var139_317);
                                                                        final SubLObject var67 = var44.secondMultipleValue();
                                                                        var44.resetMultipleValues();
                                                                        if (module0427.NIL != module0141.f9289(var66)) {
                                                                            final SubLObject var48_312 = module0138.$g1624$.currentBinding(var44);
                                                                            try {
                                                                                module0138.$g1624$.bind(var66, var44);
                                                                                final SubLObject var68 = var67;
                                                                                if (module0427.NIL != module0077.f5302(var68)) {
                                                                                    final SubLObject var69 = module0077.f5333(var68);
                                                                                    SubLObject var70;
                                                                                    SubLObject var71;
                                                                                    SubLObject var72;
                                                                                    SubLObject var73;
                                                                                    SubLObject var62_319;
                                                                                    SubLObject var74;
                                                                                    SubLObject var75;
                                                                                    for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0427.NIL, var71 = module0032.f1742(var70, var69); module0427.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                        var72 = module0032.f1745(var70, var71);
                                                                                        if (module0427.NIL != module0032.f1746(var71, var72) && module0427.NIL == module0249.f16059(var72, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                            module0249.f16055(var72, module0139.$g1636$.getDynamicValue(var44));
                                                                                            if (module0427.NIL != module0173.f10955(var72)) {
                                                                                                var73 = module0423.f29579(var72);
                                                                                                if (var73.isCons()) {
                                                                                                    var62_319 = var73;
                                                                                                    var74 = (SubLObject)module0427.NIL;
                                                                                                    var74 = var62_319.first();
                                                                                                    while (module0427.NIL != var62_319) {
                                                                                                        var75 = var74;
                                                                                                        if (module0427.NIL == conses_high.member(var75, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                            var45 = (SubLObject)ConsesLow.cons(var75, var45);
                                                                                                        }
                                                                                                        var62_319 = var62_319.rest();
                                                                                                        var74 = var62_319.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var68.isList()) {
                                                                                    SubLObject var76 = var68;
                                                                                    SubLObject var77 = (SubLObject)module0427.NIL;
                                                                                    var77 = var76.first();
                                                                                    while (module0427.NIL != var76) {
                                                                                        if (module0427.NIL == module0249.f16059(var77, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                            module0249.f16055(var77, module0139.$g1636$.getDynamicValue(var44));
                                                                                            if (module0427.NIL != module0173.f10955(var77)) {
                                                                                                final SubLObject var78 = module0423.f29579(var77);
                                                                                                if (var78.isCons()) {
                                                                                                    SubLObject var62_320 = var78;
                                                                                                    SubLObject var79 = (SubLObject)module0427.NIL;
                                                                                                    var79 = var62_320.first();
                                                                                                    while (module0427.NIL != var62_320) {
                                                                                                        final SubLObject var80 = var79;
                                                                                                        if (module0427.NIL == conses_high.member(var80, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                            var45 = (SubLObject)ConsesLow.cons(var80, var45);
                                                                                                        }
                                                                                                        var62_320 = var62_320.rest();
                                                                                                        var79 = var62_320.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var76 = var76.rest();
                                                                                        var77 = var76.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0427.$ic108$, var68);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var48_312, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var139_317);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_311, var44);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var63);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0427.FIVE_INTEGER, (SubLObject)module0427.$ic109$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                                                }
                                                if (module0427.NIL != module0200.f12419(var60, module0137.f8955((SubLObject)module0427.UNPROVIDED))) {
                                                    SubLObject var81 = module0248.f15995(var60);
                                                    SubLObject var82 = (SubLObject)module0427.NIL;
                                                    var82 = var81.first();
                                                    while (module0427.NIL != var81) {
                                                        SubLObject var84;
                                                        final SubLObject var83 = var84 = var82;
                                                        SubLObject var85 = (SubLObject)module0427.NIL;
                                                        SubLObject var86 = (SubLObject)module0427.NIL;
                                                        SubLObject var87 = (SubLObject)module0427.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0427.$ic110$);
                                                        var85 = var84.first();
                                                        var84 = var84.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0427.$ic110$);
                                                        var86 = var84.first();
                                                        var84 = var84.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0427.$ic110$);
                                                        var87 = var84.first();
                                                        var84 = var84.rest();
                                                        if (module0427.NIL == var84) {
                                                            if (module0427.NIL != module0147.f9507(var86)) {
                                                                final SubLObject var48_313 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var86, var44);
                                                                    if (module0427.NIL != module0141.f9289(var87)) {
                                                                        final SubLObject var48_314 = module0138.$g1624$.currentBinding(var44);
                                                                        try {
                                                                            module0138.$g1624$.bind(var87, var44);
                                                                            final SubLObject var68;
                                                                            final SubLObject var88 = var68 = (SubLObject)ConsesLow.list(var85);
                                                                            if (module0427.NIL != module0077.f5302(var68)) {
                                                                                final SubLObject var69 = module0077.f5333(var68);
                                                                                SubLObject var70;
                                                                                SubLObject var71;
                                                                                SubLObject var72;
                                                                                SubLObject var73;
                                                                                SubLObject var74;
                                                                                SubLObject var75;
                                                                                SubLObject var62_321;
                                                                                for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0427.NIL, var71 = module0032.f1742(var70, var69); module0427.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                    var72 = module0032.f1745(var70, var71);
                                                                                    if (module0427.NIL != module0032.f1746(var71, var72) && module0427.NIL == module0249.f16059(var72, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                        module0249.f16055(var72, module0139.$g1636$.getDynamicValue(var44));
                                                                                        if (module0427.NIL != module0173.f10955(var72)) {
                                                                                            var73 = module0423.f29579(var72);
                                                                                            if (var73.isCons()) {
                                                                                                var62_321 = var73;
                                                                                                var74 = (SubLObject)module0427.NIL;
                                                                                                var74 = var62_321.first();
                                                                                                while (module0427.NIL != var62_321) {
                                                                                                    var75 = var74;
                                                                                                    if (module0427.NIL == conses_high.member(var75, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                        var45 = (SubLObject)ConsesLow.cons(var75, var45);
                                                                                                    }
                                                                                                    var62_321 = var62_321.rest();
                                                                                                    var74 = var62_321.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var68.isList()) {
                                                                                SubLObject var54_326 = var68;
                                                                                SubLObject var77 = (SubLObject)module0427.NIL;
                                                                                var77 = var54_326.first();
                                                                                while (module0427.NIL != var54_326) {
                                                                                    if (module0427.NIL == module0249.f16059(var77, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                        module0249.f16055(var77, module0139.$g1636$.getDynamicValue(var44));
                                                                                        if (module0427.NIL != module0173.f10955(var77)) {
                                                                                            final SubLObject var78 = module0423.f29579(var77);
                                                                                            if (var78.isCons()) {
                                                                                                SubLObject var62_322 = var78;
                                                                                                SubLObject var79 = (SubLObject)module0427.NIL;
                                                                                                var79 = var62_322.first();
                                                                                                while (module0427.NIL != var62_322) {
                                                                                                    final SubLObject var80 = var79;
                                                                                                    if (module0427.NIL == conses_high.member(var80, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                        var45 = (SubLObject)ConsesLow.cons(var80, var45);
                                                                                                    }
                                                                                                    var62_322 = var62_322.rest();
                                                                                                    var79 = var62_322.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    var54_326 = var54_326.rest();
                                                                                    var77 = var54_326.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)module0427.$ic108$, var68);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var48_314, var44);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_313, var44);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0427.$ic110$);
                                                        }
                                                        var81 = var81.rest();
                                                        var82 = var81.first();
                                                    }
                                                }
                                            }
                                            else if (module0427.NIL != module0155.f9785(var60, (SubLObject)module0427.UNPROVIDED)) {
                                                SubLObject var62_323;
                                                final SubLObject var89 = var62_323 = ((module0427.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0427.$ic57$)), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0427.$ic57$)), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED)));
                                                SubLObject var90 = (SubLObject)module0427.NIL;
                                                var90 = var62_323.first();
                                                while (module0427.NIL != var62_323) {
                                                    final SubLObject var48_315 = module0138.$g1625$.currentBinding(var44);
                                                    try {
                                                        module0138.$g1625$.bind(var90, var44);
                                                        final SubLObject var92;
                                                        final SubLObject var91 = var92 = Functions.funcall(var90, var60);
                                                        if (module0427.NIL != module0077.f5302(var92)) {
                                                            final SubLObject var93 = module0077.f5333(var92);
                                                            SubLObject var94;
                                                            SubLObject var95;
                                                            SubLObject var96;
                                                            SubLObject var97;
                                                            SubLObject var62_324;
                                                            SubLObject var98;
                                                            SubLObject var99;
                                                            for (var94 = module0032.f1741(var93), var95 = (SubLObject)module0427.NIL, var95 = module0032.f1742(var94, var93); module0427.NIL == module0032.f1744(var94, var95); var95 = module0032.f1743(var95)) {
                                                                var96 = module0032.f1745(var94, var95);
                                                                if (module0427.NIL != module0032.f1746(var95, var96) && module0427.NIL == module0249.f16059(var96, module0139.$g1636$.getDynamicValue(var44))) {
                                                                    module0249.f16055(var96, module0139.$g1636$.getDynamicValue(var44));
                                                                    if (module0427.NIL != module0173.f10955(var96)) {
                                                                        var97 = module0423.f29579(var96);
                                                                        if (var97.isCons()) {
                                                                            var62_324 = var97;
                                                                            var98 = (SubLObject)module0427.NIL;
                                                                            var98 = var62_324.first();
                                                                            while (module0427.NIL != var62_324) {
                                                                                var99 = var98;
                                                                                if (module0427.NIL == conses_high.member(var99, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                    var45 = (SubLObject)ConsesLow.cons(var99, var45);
                                                                                }
                                                                                var62_324 = var62_324.rest();
                                                                                var98 = var62_324.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else if (var92.isList()) {
                                                            SubLObject var100 = var92;
                                                            SubLObject var101 = (SubLObject)module0427.NIL;
                                                            var101 = var100.first();
                                                            while (module0427.NIL != var100) {
                                                                if (module0427.NIL == module0249.f16059(var101, module0139.$g1636$.getDynamicValue(var44))) {
                                                                    module0249.f16055(var101, module0139.$g1636$.getDynamicValue(var44));
                                                                    if (module0427.NIL != module0173.f10955(var101)) {
                                                                        final SubLObject var102 = module0423.f29579(var101);
                                                                        if (var102.isCons()) {
                                                                            SubLObject var62_325 = var102;
                                                                            SubLObject var103 = (SubLObject)module0427.NIL;
                                                                            var103 = var62_325.first();
                                                                            while (module0427.NIL != var62_325) {
                                                                                final SubLObject var104 = var103;
                                                                                if (module0427.NIL == conses_high.member(var104, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                    var45 = (SubLObject)ConsesLow.cons(var104, var45);
                                                                                }
                                                                                var62_325 = var62_325.rest();
                                                                                var103 = var62_325.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                var100 = var100.rest();
                                                                var101 = var100.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0427.$ic108$, var92);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var48_315, var44);
                                                    }
                                                    var62_323 = var62_323.rest();
                                                    var90 = var62_323.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var51_311, var44);
                                            module0137.$g1605$.rebind(var48_310, var44);
                                        }
                                        var58 = var58.rest();
                                        var59 = var58.first();
                                    }
                                    SubLObject var106;
                                    final SubLObject var105 = var106 = module0200.f12443(module0244.f15771(module0137.f8955(module0427.$ic57$)));
                                    SubLObject var107 = (SubLObject)module0427.NIL;
                                    var107 = var106.first();
                                    while (module0427.NIL != var106) {
                                        final SubLObject var48_316 = module0137.$g1605$.currentBinding(var44);
                                        final SubLObject var51_312 = module0141.$g1674$.currentBinding(var44);
                                        try {
                                            module0137.$g1605$.bind(var107, var44);
                                            module0141.$g1674$.bind((SubLObject)((module0427.NIL != module0141.f9205((SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0427.NIL == module0141.$g1674$.getDynamicValue(var44)) : module0141.$g1674$.getDynamicValue(var44)), var44);
                                            final SubLObject var108 = module0228.f15229(var116_305);
                                            if (module0427.NIL != module0138.f8992(var108)) {
                                                final SubLObject var109 = module0242.f15664(var108, module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                if (module0427.NIL != var109) {
                                                    final SubLObject var110 = module0245.f15834(var109, module0138.f8979(), module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                    if (module0427.NIL != var110) {
                                                        SubLObject var111;
                                                        for (var111 = module0066.f4838(module0067.f4891(var110)); module0427.NIL == module0066.f4841(var111); var111 = module0066.f4840(var111)) {
                                                            var44.resetMultipleValues();
                                                            final SubLObject var112 = module0066.f4839(var111);
                                                            final SubLObject var113 = var44.secondMultipleValue();
                                                            var44.resetMultipleValues();
                                                            if (module0427.NIL != module0147.f9507(var112)) {
                                                                final SubLObject var48_317 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var112, var44);
                                                                    SubLObject var139_318;
                                                                    for (var139_318 = module0066.f4838(module0067.f4891(var113)); module0427.NIL == module0066.f4841(var139_318); var139_318 = module0066.f4840(var139_318)) {
                                                                        var44.resetMultipleValues();
                                                                        final SubLObject var114 = module0066.f4839(var139_318);
                                                                        final SubLObject var115 = var44.secondMultipleValue();
                                                                        var44.resetMultipleValues();
                                                                        if (module0427.NIL != module0141.f9289(var114)) {
                                                                            final SubLObject var48_318 = module0138.$g1624$.currentBinding(var44);
                                                                            try {
                                                                                module0138.$g1624$.bind(var114, var44);
                                                                                final SubLObject var116 = var115;
                                                                                if (module0427.NIL != module0077.f5302(var116)) {
                                                                                    final SubLObject var117 = module0077.f5333(var116);
                                                                                    SubLObject var118;
                                                                                    SubLObject var119;
                                                                                    SubLObject var120;
                                                                                    for (var118 = module0032.f1741(var117), var119 = (SubLObject)module0427.NIL, var119 = module0032.f1742(var118, var117); module0427.NIL == module0032.f1744(var118, var119); var119 = module0032.f1743(var119)) {
                                                                                        var120 = module0032.f1745(var118, var119);
                                                                                        if (module0427.NIL != module0032.f1746(var119, var120) && module0427.NIL == module0249.f16059(var120, (SubLObject)module0427.UNPROVIDED)) {
                                                                                            module0249.f16055(var120, (SubLObject)module0427.UNPROVIDED);
                                                                                            module0056.f4149(var120, var50);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var116.isList()) {
                                                                                    SubLObject var121 = var116;
                                                                                    SubLObject var122 = (SubLObject)module0427.NIL;
                                                                                    var122 = var121.first();
                                                                                    while (module0427.NIL != var121) {
                                                                                        if (module0427.NIL == module0249.f16059(var122, (SubLObject)module0427.UNPROVIDED)) {
                                                                                            module0249.f16055(var122, (SubLObject)module0427.UNPROVIDED);
                                                                                            module0056.f4149(var122, var50);
                                                                                        }
                                                                                        var121 = var121.rest();
                                                                                        var122 = var121.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0427.$ic108$, var116);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var48_318, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var139_318);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_317, var44);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var111);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0427.FIVE_INTEGER, (SubLObject)module0427.$ic109$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                                                }
                                            }
                                            else if (module0427.NIL != module0155.f9785(var108, (SubLObject)module0427.UNPROVIDED)) {
                                                SubLObject var62_326;
                                                final SubLObject var123 = var62_326 = ((module0427.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED)));
                                                SubLObject var124 = (SubLObject)module0427.NIL;
                                                var124 = var62_326.first();
                                                while (module0427.NIL != var62_326) {
                                                    final SubLObject var48_319 = module0138.$g1625$.currentBinding(var44);
                                                    try {
                                                        module0138.$g1625$.bind(var124, var44);
                                                        final SubLObject var126;
                                                        final SubLObject var125 = var126 = Functions.funcall(var124, var108);
                                                        if (module0427.NIL != module0077.f5302(var126)) {
                                                            final SubLObject var127 = module0077.f5333(var126);
                                                            SubLObject var128;
                                                            SubLObject var129;
                                                            SubLObject var130;
                                                            for (var128 = module0032.f1741(var127), var129 = (SubLObject)module0427.NIL, var129 = module0032.f1742(var128, var127); module0427.NIL == module0032.f1744(var128, var129); var129 = module0032.f1743(var129)) {
                                                                var130 = module0032.f1745(var128, var129);
                                                                if (module0427.NIL != module0032.f1746(var129, var130) && module0427.NIL == module0249.f16059(var130, (SubLObject)module0427.UNPROVIDED)) {
                                                                    module0249.f16055(var130, (SubLObject)module0427.UNPROVIDED);
                                                                    module0056.f4149(var130, var50);
                                                                }
                                                            }
                                                        }
                                                        else if (var126.isList()) {
                                                            SubLObject var131 = var126;
                                                            SubLObject var132 = (SubLObject)module0427.NIL;
                                                            var132 = var131.first();
                                                            while (module0427.NIL != var131) {
                                                                if (module0427.NIL == module0249.f16059(var132, (SubLObject)module0427.UNPROVIDED)) {
                                                                    module0249.f16055(var132, (SubLObject)module0427.UNPROVIDED);
                                                                    module0056.f4149(var132, var50);
                                                                }
                                                                var131 = var131.rest();
                                                                var132 = var131.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0427.$ic108$, var126);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var48_319, var44);
                                                    }
                                                    var62_326 = var62_326.rest();
                                                    var124 = var62_326.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var51_312, var44);
                                            module0137.$g1605$.rebind(var48_316, var44);
                                        }
                                        var106 = var106.rest();
                                        var107 = var106.first();
                                    }
                                    var116_305 = module0056.f4150(var50);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var52_313, var44);
                                module0138.$g1619$.rebind(var51_310, var44);
                                module0141.$g1677$.rebind(var48_309, var44);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0427.TWO_INTEGER, (SubLObject)module0427.$ic111$, var46, module0244.f15748(module0137.f8955((SubLObject)module0427.UNPROVIDED)), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var55, var44);
                        module0141.$g1674$.rebind(var54, var44);
                        module0141.$g1672$.rebind(var53, var44);
                        module0141.$g1671$.rebind(var51_309, var44);
                        module0141.$g1670$.rebind(var48_308, var44);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var51_308, var44);
                    module0141.$g1714$.rebind(var48_307, var44);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var44));
            }
            finally {
                module0139.$g1635$.rebind(var48_306, var44);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var44));
        }
        finally {
            module0139.$g1636$.rebind(var48, var44);
            module0137.$g1605$.rebind(var47, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f30286() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = module0427.$ic139$;
        final SubLObject var47 = module0137.$g1605$.currentBinding(var44);
        final SubLObject var48 = module0139.$g1636$.currentBinding(var44);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0427.$ic57$), var44);
            module0139.$g1636$.bind(module0139.f9007(), var44);
            SubLObject var116_339 = var46;
            final SubLObject var49 = (SubLObject)module0427.$ic99$;
            final SubLObject var50 = module0056.f4145(var49);
            final SubLObject var48_340 = module0139.$g1635$.currentBinding(var44);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var44);
                final SubLObject var51 = (SubLObject)module0427.NIL;
                final SubLObject var48_341 = module0141.$g1714$.currentBinding(var44);
                final SubLObject var51_342 = module0141.$g1715$.currentBinding(var44);
                try {
                    module0141.$g1714$.bind((module0427.NIL != var51) ? var51 : module0141.f9283(), var44);
                    module0141.$g1715$.bind((SubLObject)((module0427.NIL != var51) ? module0427.$ic100$ : module0141.$g1715$.getDynamicValue(var44)), var44);
                    if (module0427.NIL != var51 && module0427.NIL != module0136.f8864() && module0427.NIL == module0141.f9279(var51)) {
                        final SubLObject var52 = module0136.$g1591$.getDynamicValue(var44);
                        if (var52.eql((SubLObject)module0427.$ic101$)) {
                            module0136.f8870((SubLObject)module0427.ONE_INTEGER, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                        else if (var52.eql((SubLObject)module0427.$ic104$)) {
                            module0136.f8871((SubLObject)module0427.ONE_INTEGER, (SubLObject)module0427.$ic105$, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                        else if (var52.eql((SubLObject)module0427.$ic106$)) {
                            Errors.warn((SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$);
                        }
                        else {
                            Errors.warn((SubLObject)module0427.$ic107$, module0136.$g1591$.getDynamicValue(var44));
                            Errors.cerror((SubLObject)module0427.$ic105$, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$);
                        }
                    }
                    final SubLObject var48_342 = module0141.$g1670$.currentBinding(var44);
                    final SubLObject var51_343 = module0141.$g1671$.currentBinding(var44);
                    final SubLObject var53 = module0141.$g1672$.currentBinding(var44);
                    final SubLObject var54 = module0141.$g1674$.currentBinding(var44);
                    final SubLObject var55 = module0137.$g1605$.currentBinding(var44);
                    try {
                        module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0427.$ic57$)), var44);
                        module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                        module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                        module0141.$g1674$.bind((SubLObject)module0427.NIL, var44);
                        module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0427.$ic57$)), var44);
                        if (module0427.NIL != module0136.f8865() || module0427.NIL != module0244.f15795(var46, module0137.f8955((SubLObject)module0427.UNPROVIDED))) {
                            final SubLObject var48_343 = module0141.$g1677$.currentBinding(var44);
                            final SubLObject var51_344 = module0138.$g1619$.currentBinding(var44);
                            final SubLObject var52_347 = module0141.$g1674$.currentBinding(var44);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var44);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                                module0141.$g1674$.bind((SubLObject)module0427.NIL, var44);
                                module0249.f16055(var116_339, (SubLObject)module0427.UNPROVIDED);
                                while (module0427.NIL != var116_339) {
                                    final SubLObject var56 = var116_339;
                                    SubLObject var58;
                                    final SubLObject var57 = var58 = module0200.f12443(module0137.f8955(module0427.$ic57$));
                                    SubLObject var59 = (SubLObject)module0427.NIL;
                                    var59 = var58.first();
                                    while (module0427.NIL != var58) {
                                        final SubLObject var48_344 = module0137.$g1605$.currentBinding(var44);
                                        final SubLObject var51_345 = module0141.$g1674$.currentBinding(var44);
                                        try {
                                            module0137.$g1605$.bind(var59, var44);
                                            module0141.$g1674$.bind((SubLObject)((module0427.NIL != module0141.f9205((SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0427.NIL == module0141.$g1674$.getDynamicValue(var44)) : module0141.$g1674$.getDynamicValue(var44)), var44);
                                            final SubLObject var60 = module0228.f15229(var56);
                                            if (module0427.NIL != module0138.f8992(var60)) {
                                                final SubLObject var61 = module0242.f15664(var60, module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                if (module0427.NIL != var61) {
                                                    final SubLObject var62 = module0245.f15834(var61, module0244.f15780(module0137.f8955(module0427.$ic57$)), module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                    if (module0427.NIL != var62) {
                                                        SubLObject var63;
                                                        for (var63 = module0066.f4838(module0067.f4891(var62)); module0427.NIL == module0066.f4841(var63); var63 = module0066.f4840(var63)) {
                                                            var44.resetMultipleValues();
                                                            final SubLObject var64 = module0066.f4839(var63);
                                                            final SubLObject var65 = var44.secondMultipleValue();
                                                            var44.resetMultipleValues();
                                                            if (module0427.NIL != module0147.f9507(var64)) {
                                                                final SubLObject var48_345 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var64, var44);
                                                                    SubLObject var139_351;
                                                                    for (var139_351 = module0066.f4838(module0067.f4891(var65)); module0427.NIL == module0066.f4841(var139_351); var139_351 = module0066.f4840(var139_351)) {
                                                                        var44.resetMultipleValues();
                                                                        final SubLObject var66 = module0066.f4839(var139_351);
                                                                        final SubLObject var67 = var44.secondMultipleValue();
                                                                        var44.resetMultipleValues();
                                                                        if (module0427.NIL != module0141.f9289(var66)) {
                                                                            final SubLObject var48_346 = module0138.$g1624$.currentBinding(var44);
                                                                            try {
                                                                                module0138.$g1624$.bind(var66, var44);
                                                                                final SubLObject var68 = var67;
                                                                                if (module0427.NIL != module0077.f5302(var68)) {
                                                                                    final SubLObject var69 = module0077.f5333(var68);
                                                                                    SubLObject var70;
                                                                                    SubLObject var71;
                                                                                    SubLObject var72;
                                                                                    SubLObject var73;
                                                                                    SubLObject var62_353;
                                                                                    SubLObject var74;
                                                                                    SubLObject var75;
                                                                                    for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0427.NIL, var71 = module0032.f1742(var70, var69); module0427.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                        var72 = module0032.f1745(var70, var71);
                                                                                        if (module0427.NIL != module0032.f1746(var71, var72) && module0427.NIL == module0249.f16059(var72, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                            module0249.f16055(var72, module0139.$g1636$.getDynamicValue(var44));
                                                                                            if (module0427.NIL != module0173.f10955(var72)) {
                                                                                                var73 = module0423.f29579(var72);
                                                                                                if (var73.isCons()) {
                                                                                                    var62_353 = var73;
                                                                                                    var74 = (SubLObject)module0427.NIL;
                                                                                                    var74 = var62_353.first();
                                                                                                    while (module0427.NIL != var62_353) {
                                                                                                        var75 = var74;
                                                                                                        if (module0427.NIL == conses_high.member(var75, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                            var45 = (SubLObject)ConsesLow.cons(var75, var45);
                                                                                                        }
                                                                                                        var62_353 = var62_353.rest();
                                                                                                        var74 = var62_353.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var68.isList()) {
                                                                                    SubLObject var76 = var68;
                                                                                    SubLObject var77 = (SubLObject)module0427.NIL;
                                                                                    var77 = var76.first();
                                                                                    while (module0427.NIL != var76) {
                                                                                        if (module0427.NIL == module0249.f16059(var77, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                            module0249.f16055(var77, module0139.$g1636$.getDynamicValue(var44));
                                                                                            if (module0427.NIL != module0173.f10955(var77)) {
                                                                                                final SubLObject var78 = module0423.f29579(var77);
                                                                                                if (var78.isCons()) {
                                                                                                    SubLObject var62_354 = var78;
                                                                                                    SubLObject var79 = (SubLObject)module0427.NIL;
                                                                                                    var79 = var62_354.first();
                                                                                                    while (module0427.NIL != var62_354) {
                                                                                                        final SubLObject var80 = var79;
                                                                                                        if (module0427.NIL == conses_high.member(var80, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                            var45 = (SubLObject)ConsesLow.cons(var80, var45);
                                                                                                        }
                                                                                                        var62_354 = var62_354.rest();
                                                                                                        var79 = var62_354.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var76 = var76.rest();
                                                                                        var77 = var76.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0427.$ic108$, var68);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var48_346, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var139_351);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_345, var44);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var63);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0427.FIVE_INTEGER, (SubLObject)module0427.$ic109$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                                                }
                                                if (module0427.NIL != module0200.f12419(var60, module0137.f8955((SubLObject)module0427.UNPROVIDED))) {
                                                    SubLObject var81 = module0248.f15995(var60);
                                                    SubLObject var82 = (SubLObject)module0427.NIL;
                                                    var82 = var81.first();
                                                    while (module0427.NIL != var81) {
                                                        SubLObject var84;
                                                        final SubLObject var83 = var84 = var82;
                                                        SubLObject var85 = (SubLObject)module0427.NIL;
                                                        SubLObject var86 = (SubLObject)module0427.NIL;
                                                        SubLObject var87 = (SubLObject)module0427.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0427.$ic110$);
                                                        var85 = var84.first();
                                                        var84 = var84.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0427.$ic110$);
                                                        var86 = var84.first();
                                                        var84 = var84.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0427.$ic110$);
                                                        var87 = var84.first();
                                                        var84 = var84.rest();
                                                        if (module0427.NIL == var84) {
                                                            if (module0427.NIL != module0147.f9507(var86)) {
                                                                final SubLObject var48_347 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var86, var44);
                                                                    if (module0427.NIL != module0141.f9289(var87)) {
                                                                        final SubLObject var48_348 = module0138.$g1624$.currentBinding(var44);
                                                                        try {
                                                                            module0138.$g1624$.bind(var87, var44);
                                                                            final SubLObject var68;
                                                                            final SubLObject var88 = var68 = (SubLObject)ConsesLow.list(var85);
                                                                            if (module0427.NIL != module0077.f5302(var68)) {
                                                                                final SubLObject var69 = module0077.f5333(var68);
                                                                                SubLObject var70;
                                                                                SubLObject var71;
                                                                                SubLObject var72;
                                                                                SubLObject var73;
                                                                                SubLObject var74;
                                                                                SubLObject var75;
                                                                                SubLObject var62_355;
                                                                                for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0427.NIL, var71 = module0032.f1742(var70, var69); module0427.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                    var72 = module0032.f1745(var70, var71);
                                                                                    if (module0427.NIL != module0032.f1746(var71, var72) && module0427.NIL == module0249.f16059(var72, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                        module0249.f16055(var72, module0139.$g1636$.getDynamicValue(var44));
                                                                                        if (module0427.NIL != module0173.f10955(var72)) {
                                                                                            var73 = module0423.f29579(var72);
                                                                                            if (var73.isCons()) {
                                                                                                var62_355 = var73;
                                                                                                var74 = (SubLObject)module0427.NIL;
                                                                                                var74 = var62_355.first();
                                                                                                while (module0427.NIL != var62_355) {
                                                                                                    var75 = var74;
                                                                                                    if (module0427.NIL == conses_high.member(var75, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                        var45 = (SubLObject)ConsesLow.cons(var75, var45);
                                                                                                    }
                                                                                                    var62_355 = var62_355.rest();
                                                                                                    var74 = var62_355.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var68.isList()) {
                                                                                SubLObject var54_360 = var68;
                                                                                SubLObject var77 = (SubLObject)module0427.NIL;
                                                                                var77 = var54_360.first();
                                                                                while (module0427.NIL != var54_360) {
                                                                                    if (module0427.NIL == module0249.f16059(var77, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                        module0249.f16055(var77, module0139.$g1636$.getDynamicValue(var44));
                                                                                        if (module0427.NIL != module0173.f10955(var77)) {
                                                                                            final SubLObject var78 = module0423.f29579(var77);
                                                                                            if (var78.isCons()) {
                                                                                                SubLObject var62_356 = var78;
                                                                                                SubLObject var79 = (SubLObject)module0427.NIL;
                                                                                                var79 = var62_356.first();
                                                                                                while (module0427.NIL != var62_356) {
                                                                                                    final SubLObject var80 = var79;
                                                                                                    if (module0427.NIL == conses_high.member(var80, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                        var45 = (SubLObject)ConsesLow.cons(var80, var45);
                                                                                                    }
                                                                                                    var62_356 = var62_356.rest();
                                                                                                    var79 = var62_356.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    var54_360 = var54_360.rest();
                                                                                    var77 = var54_360.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)module0427.$ic108$, var68);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var48_348, var44);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_347, var44);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0427.$ic110$);
                                                        }
                                                        var81 = var81.rest();
                                                        var82 = var81.first();
                                                    }
                                                }
                                            }
                                            else if (module0427.NIL != module0155.f9785(var60, (SubLObject)module0427.UNPROVIDED)) {
                                                SubLObject var62_357;
                                                final SubLObject var89 = var62_357 = ((module0427.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0427.$ic57$)), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0427.$ic57$)), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED)));
                                                SubLObject var90 = (SubLObject)module0427.NIL;
                                                var90 = var62_357.first();
                                                while (module0427.NIL != var62_357) {
                                                    final SubLObject var48_349 = module0138.$g1625$.currentBinding(var44);
                                                    try {
                                                        module0138.$g1625$.bind(var90, var44);
                                                        final SubLObject var92;
                                                        final SubLObject var91 = var92 = Functions.funcall(var90, var60);
                                                        if (module0427.NIL != module0077.f5302(var92)) {
                                                            final SubLObject var93 = module0077.f5333(var92);
                                                            SubLObject var94;
                                                            SubLObject var95;
                                                            SubLObject var96;
                                                            SubLObject var97;
                                                            SubLObject var62_358;
                                                            SubLObject var98;
                                                            SubLObject var99;
                                                            for (var94 = module0032.f1741(var93), var95 = (SubLObject)module0427.NIL, var95 = module0032.f1742(var94, var93); module0427.NIL == module0032.f1744(var94, var95); var95 = module0032.f1743(var95)) {
                                                                var96 = module0032.f1745(var94, var95);
                                                                if (module0427.NIL != module0032.f1746(var95, var96) && module0427.NIL == module0249.f16059(var96, module0139.$g1636$.getDynamicValue(var44))) {
                                                                    module0249.f16055(var96, module0139.$g1636$.getDynamicValue(var44));
                                                                    if (module0427.NIL != module0173.f10955(var96)) {
                                                                        var97 = module0423.f29579(var96);
                                                                        if (var97.isCons()) {
                                                                            var62_358 = var97;
                                                                            var98 = (SubLObject)module0427.NIL;
                                                                            var98 = var62_358.first();
                                                                            while (module0427.NIL != var62_358) {
                                                                                var99 = var98;
                                                                                if (module0427.NIL == conses_high.member(var99, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                    var45 = (SubLObject)ConsesLow.cons(var99, var45);
                                                                                }
                                                                                var62_358 = var62_358.rest();
                                                                                var98 = var62_358.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else if (var92.isList()) {
                                                            SubLObject var100 = var92;
                                                            SubLObject var101 = (SubLObject)module0427.NIL;
                                                            var101 = var100.first();
                                                            while (module0427.NIL != var100) {
                                                                if (module0427.NIL == module0249.f16059(var101, module0139.$g1636$.getDynamicValue(var44))) {
                                                                    module0249.f16055(var101, module0139.$g1636$.getDynamicValue(var44));
                                                                    if (module0427.NIL != module0173.f10955(var101)) {
                                                                        final SubLObject var102 = module0423.f29579(var101);
                                                                        if (var102.isCons()) {
                                                                            SubLObject var62_359 = var102;
                                                                            SubLObject var103 = (SubLObject)module0427.NIL;
                                                                            var103 = var62_359.first();
                                                                            while (module0427.NIL != var62_359) {
                                                                                final SubLObject var104 = var103;
                                                                                if (module0427.NIL == conses_high.member(var104, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                    var45 = (SubLObject)ConsesLow.cons(var104, var45);
                                                                                }
                                                                                var62_359 = var62_359.rest();
                                                                                var103 = var62_359.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                var100 = var100.rest();
                                                                var101 = var100.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0427.$ic108$, var92);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var48_349, var44);
                                                    }
                                                    var62_357 = var62_357.rest();
                                                    var90 = var62_357.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var51_345, var44);
                                            module0137.$g1605$.rebind(var48_344, var44);
                                        }
                                        var58 = var58.rest();
                                        var59 = var58.first();
                                    }
                                    SubLObject var106;
                                    final SubLObject var105 = var106 = module0200.f12443(module0244.f15771(module0137.f8955(module0427.$ic57$)));
                                    SubLObject var107 = (SubLObject)module0427.NIL;
                                    var107 = var106.first();
                                    while (module0427.NIL != var106) {
                                        final SubLObject var48_350 = module0137.$g1605$.currentBinding(var44);
                                        final SubLObject var51_346 = module0141.$g1674$.currentBinding(var44);
                                        try {
                                            module0137.$g1605$.bind(var107, var44);
                                            module0141.$g1674$.bind((SubLObject)((module0427.NIL != module0141.f9205((SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0427.NIL == module0141.$g1674$.getDynamicValue(var44)) : module0141.$g1674$.getDynamicValue(var44)), var44);
                                            final SubLObject var108 = module0228.f15229(var116_339);
                                            if (module0427.NIL != module0138.f8992(var108)) {
                                                final SubLObject var109 = module0242.f15664(var108, module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                if (module0427.NIL != var109) {
                                                    final SubLObject var110 = module0245.f15834(var109, module0138.f8979(), module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                    if (module0427.NIL != var110) {
                                                        SubLObject var111;
                                                        for (var111 = module0066.f4838(module0067.f4891(var110)); module0427.NIL == module0066.f4841(var111); var111 = module0066.f4840(var111)) {
                                                            var44.resetMultipleValues();
                                                            final SubLObject var112 = module0066.f4839(var111);
                                                            final SubLObject var113 = var44.secondMultipleValue();
                                                            var44.resetMultipleValues();
                                                            if (module0427.NIL != module0147.f9507(var112)) {
                                                                final SubLObject var48_351 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var112, var44);
                                                                    SubLObject var139_352;
                                                                    for (var139_352 = module0066.f4838(module0067.f4891(var113)); module0427.NIL == module0066.f4841(var139_352); var139_352 = module0066.f4840(var139_352)) {
                                                                        var44.resetMultipleValues();
                                                                        final SubLObject var114 = module0066.f4839(var139_352);
                                                                        final SubLObject var115 = var44.secondMultipleValue();
                                                                        var44.resetMultipleValues();
                                                                        if (module0427.NIL != module0141.f9289(var114)) {
                                                                            final SubLObject var48_352 = module0138.$g1624$.currentBinding(var44);
                                                                            try {
                                                                                module0138.$g1624$.bind(var114, var44);
                                                                                final SubLObject var116 = var115;
                                                                                if (module0427.NIL != module0077.f5302(var116)) {
                                                                                    final SubLObject var117 = module0077.f5333(var116);
                                                                                    SubLObject var118;
                                                                                    SubLObject var119;
                                                                                    SubLObject var120;
                                                                                    for (var118 = module0032.f1741(var117), var119 = (SubLObject)module0427.NIL, var119 = module0032.f1742(var118, var117); module0427.NIL == module0032.f1744(var118, var119); var119 = module0032.f1743(var119)) {
                                                                                        var120 = module0032.f1745(var118, var119);
                                                                                        if (module0427.NIL != module0032.f1746(var119, var120) && module0427.NIL == module0249.f16059(var120, (SubLObject)module0427.UNPROVIDED)) {
                                                                                            module0249.f16055(var120, (SubLObject)module0427.UNPROVIDED);
                                                                                            module0056.f4149(var120, var50);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var116.isList()) {
                                                                                    SubLObject var121 = var116;
                                                                                    SubLObject var122 = (SubLObject)module0427.NIL;
                                                                                    var122 = var121.first();
                                                                                    while (module0427.NIL != var121) {
                                                                                        if (module0427.NIL == module0249.f16059(var122, (SubLObject)module0427.UNPROVIDED)) {
                                                                                            module0249.f16055(var122, (SubLObject)module0427.UNPROVIDED);
                                                                                            module0056.f4149(var122, var50);
                                                                                        }
                                                                                        var121 = var121.rest();
                                                                                        var122 = var121.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0427.$ic108$, var116);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var48_352, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var139_352);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_351, var44);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var111);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0427.FIVE_INTEGER, (SubLObject)module0427.$ic109$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                                                }
                                            }
                                            else if (module0427.NIL != module0155.f9785(var108, (SubLObject)module0427.UNPROVIDED)) {
                                                SubLObject var62_360;
                                                final SubLObject var123 = var62_360 = ((module0427.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED)));
                                                SubLObject var124 = (SubLObject)module0427.NIL;
                                                var124 = var62_360.first();
                                                while (module0427.NIL != var62_360) {
                                                    final SubLObject var48_353 = module0138.$g1625$.currentBinding(var44);
                                                    try {
                                                        module0138.$g1625$.bind(var124, var44);
                                                        final SubLObject var126;
                                                        final SubLObject var125 = var126 = Functions.funcall(var124, var108);
                                                        if (module0427.NIL != module0077.f5302(var126)) {
                                                            final SubLObject var127 = module0077.f5333(var126);
                                                            SubLObject var128;
                                                            SubLObject var129;
                                                            SubLObject var130;
                                                            for (var128 = module0032.f1741(var127), var129 = (SubLObject)module0427.NIL, var129 = module0032.f1742(var128, var127); module0427.NIL == module0032.f1744(var128, var129); var129 = module0032.f1743(var129)) {
                                                                var130 = module0032.f1745(var128, var129);
                                                                if (module0427.NIL != module0032.f1746(var129, var130) && module0427.NIL == module0249.f16059(var130, (SubLObject)module0427.UNPROVIDED)) {
                                                                    module0249.f16055(var130, (SubLObject)module0427.UNPROVIDED);
                                                                    module0056.f4149(var130, var50);
                                                                }
                                                            }
                                                        }
                                                        else if (var126.isList()) {
                                                            SubLObject var131 = var126;
                                                            SubLObject var132 = (SubLObject)module0427.NIL;
                                                            var132 = var131.first();
                                                            while (module0427.NIL != var131) {
                                                                if (module0427.NIL == module0249.f16059(var132, (SubLObject)module0427.UNPROVIDED)) {
                                                                    module0249.f16055(var132, (SubLObject)module0427.UNPROVIDED);
                                                                    module0056.f4149(var132, var50);
                                                                }
                                                                var131 = var131.rest();
                                                                var132 = var131.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0427.$ic108$, var126);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var48_353, var44);
                                                    }
                                                    var62_360 = var62_360.rest();
                                                    var124 = var62_360.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var51_346, var44);
                                            module0137.$g1605$.rebind(var48_350, var44);
                                        }
                                        var106 = var106.rest();
                                        var107 = var106.first();
                                    }
                                    var116_339 = module0056.f4150(var50);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var52_347, var44);
                                module0138.$g1619$.rebind(var51_344, var44);
                                module0141.$g1677$.rebind(var48_343, var44);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0427.TWO_INTEGER, (SubLObject)module0427.$ic111$, var46, module0244.f15748(module0137.f8955((SubLObject)module0427.UNPROVIDED)), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var55, var44);
                        module0141.$g1674$.rebind(var54, var44);
                        module0141.$g1672$.rebind(var53, var44);
                        module0141.$g1671$.rebind(var51_343, var44);
                        module0141.$g1670$.rebind(var48_342, var44);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var51_342, var44);
                    module0141.$g1714$.rebind(var48_341, var44);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var44));
            }
            finally {
                module0139.$g1635$.rebind(var48_340, var44);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var44));
        }
        finally {
            module0139.$g1636$.rebind(var48, var44);
            module0137.$g1605$.rebind(var47, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f30287() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = module0427.$ic29$;
        final SubLObject var47 = module0137.$g1605$.currentBinding(var44);
        final SubLObject var48 = module0139.$g1636$.currentBinding(var44);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0427.$ic57$), var44);
            module0139.$g1636$.bind(module0139.f9007(), var44);
            SubLObject var116_373 = var46;
            final SubLObject var49 = (SubLObject)module0427.$ic99$;
            final SubLObject var50 = module0056.f4145(var49);
            final SubLObject var48_374 = module0139.$g1635$.currentBinding(var44);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var44);
                final SubLObject var51 = (SubLObject)module0427.NIL;
                final SubLObject var48_375 = module0141.$g1714$.currentBinding(var44);
                final SubLObject var51_376 = module0141.$g1715$.currentBinding(var44);
                try {
                    module0141.$g1714$.bind((module0427.NIL != var51) ? var51 : module0141.f9283(), var44);
                    module0141.$g1715$.bind((SubLObject)((module0427.NIL != var51) ? module0427.$ic100$ : module0141.$g1715$.getDynamicValue(var44)), var44);
                    if (module0427.NIL != var51 && module0427.NIL != module0136.f8864() && module0427.NIL == module0141.f9279(var51)) {
                        final SubLObject var52 = module0136.$g1591$.getDynamicValue(var44);
                        if (var52.eql((SubLObject)module0427.$ic101$)) {
                            module0136.f8870((SubLObject)module0427.ONE_INTEGER, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                        else if (var52.eql((SubLObject)module0427.$ic104$)) {
                            module0136.f8871((SubLObject)module0427.ONE_INTEGER, (SubLObject)module0427.$ic105$, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                        else if (var52.eql((SubLObject)module0427.$ic106$)) {
                            Errors.warn((SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$);
                        }
                        else {
                            Errors.warn((SubLObject)module0427.$ic107$, module0136.$g1591$.getDynamicValue(var44));
                            Errors.cerror((SubLObject)module0427.$ic105$, (SubLObject)module0427.$ic102$, var51, (SubLObject)module0427.$ic103$);
                        }
                    }
                    final SubLObject var48_376 = module0141.$g1670$.currentBinding(var44);
                    final SubLObject var51_377 = module0141.$g1671$.currentBinding(var44);
                    final SubLObject var53 = module0141.$g1672$.currentBinding(var44);
                    final SubLObject var54 = module0141.$g1674$.currentBinding(var44);
                    final SubLObject var55 = module0137.$g1605$.currentBinding(var44);
                    try {
                        module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0427.$ic57$)), var44);
                        module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                        module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                        module0141.$g1674$.bind((SubLObject)module0427.NIL, var44);
                        module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0427.$ic57$)), var44);
                        if (module0427.NIL != module0136.f8865() || module0427.NIL != module0244.f15795(var46, module0137.f8955((SubLObject)module0427.UNPROVIDED))) {
                            final SubLObject var48_377 = module0141.$g1677$.currentBinding(var44);
                            final SubLObject var51_378 = module0138.$g1619$.currentBinding(var44);
                            final SubLObject var52_381 = module0141.$g1674$.currentBinding(var44);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var44);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0427.$ic57$))), var44);
                                module0141.$g1674$.bind((SubLObject)module0427.NIL, var44);
                                module0249.f16055(var116_373, (SubLObject)module0427.UNPROVIDED);
                                while (module0427.NIL != var116_373) {
                                    final SubLObject var56 = var116_373;
                                    SubLObject var58;
                                    final SubLObject var57 = var58 = module0200.f12443(module0137.f8955(module0427.$ic57$));
                                    SubLObject var59 = (SubLObject)module0427.NIL;
                                    var59 = var58.first();
                                    while (module0427.NIL != var58) {
                                        final SubLObject var48_378 = module0137.$g1605$.currentBinding(var44);
                                        final SubLObject var51_379 = module0141.$g1674$.currentBinding(var44);
                                        try {
                                            module0137.$g1605$.bind(var59, var44);
                                            module0141.$g1674$.bind((SubLObject)((module0427.NIL != module0141.f9205((SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0427.NIL == module0141.$g1674$.getDynamicValue(var44)) : module0141.$g1674$.getDynamicValue(var44)), var44);
                                            final SubLObject var60 = module0228.f15229(var56);
                                            if (module0427.NIL != module0138.f8992(var60)) {
                                                final SubLObject var61 = module0242.f15664(var60, module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                if (module0427.NIL != var61) {
                                                    final SubLObject var62 = module0245.f15834(var61, module0244.f15780(module0137.f8955(module0427.$ic57$)), module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                    if (module0427.NIL != var62) {
                                                        SubLObject var63;
                                                        for (var63 = module0066.f4838(module0067.f4891(var62)); module0427.NIL == module0066.f4841(var63); var63 = module0066.f4840(var63)) {
                                                            var44.resetMultipleValues();
                                                            final SubLObject var64 = module0066.f4839(var63);
                                                            final SubLObject var65 = var44.secondMultipleValue();
                                                            var44.resetMultipleValues();
                                                            if (module0427.NIL != module0147.f9507(var64)) {
                                                                final SubLObject var48_379 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var64, var44);
                                                                    SubLObject var139_385;
                                                                    for (var139_385 = module0066.f4838(module0067.f4891(var65)); module0427.NIL == module0066.f4841(var139_385); var139_385 = module0066.f4840(var139_385)) {
                                                                        var44.resetMultipleValues();
                                                                        final SubLObject var66 = module0066.f4839(var139_385);
                                                                        final SubLObject var67 = var44.secondMultipleValue();
                                                                        var44.resetMultipleValues();
                                                                        if (module0427.NIL != module0141.f9289(var66)) {
                                                                            final SubLObject var48_380 = module0138.$g1624$.currentBinding(var44);
                                                                            try {
                                                                                module0138.$g1624$.bind(var66, var44);
                                                                                final SubLObject var68 = var67;
                                                                                if (module0427.NIL != module0077.f5302(var68)) {
                                                                                    final SubLObject var69 = module0077.f5333(var68);
                                                                                    SubLObject var70;
                                                                                    SubLObject var71;
                                                                                    SubLObject var72;
                                                                                    SubLObject var73;
                                                                                    SubLObject var62_387;
                                                                                    SubLObject var74;
                                                                                    SubLObject var75;
                                                                                    for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0427.NIL, var71 = module0032.f1742(var70, var69); module0427.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                        var72 = module0032.f1745(var70, var71);
                                                                                        if (module0427.NIL != module0032.f1746(var71, var72) && module0427.NIL == module0249.f16059(var72, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                            module0249.f16055(var72, module0139.$g1636$.getDynamicValue(var44));
                                                                                            if (module0427.NIL != module0173.f10955(var72)) {
                                                                                                var73 = module0423.f29579(var72);
                                                                                                if (var73.isCons()) {
                                                                                                    var62_387 = var73;
                                                                                                    var74 = (SubLObject)module0427.NIL;
                                                                                                    var74 = var62_387.first();
                                                                                                    while (module0427.NIL != var62_387) {
                                                                                                        var75 = var74;
                                                                                                        if (module0427.NIL == conses_high.member(var75, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                            var45 = (SubLObject)ConsesLow.cons(var75, var45);
                                                                                                        }
                                                                                                        var62_387 = var62_387.rest();
                                                                                                        var74 = var62_387.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var68.isList()) {
                                                                                    SubLObject var76 = var68;
                                                                                    SubLObject var77 = (SubLObject)module0427.NIL;
                                                                                    var77 = var76.first();
                                                                                    while (module0427.NIL != var76) {
                                                                                        if (module0427.NIL == module0249.f16059(var77, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                            module0249.f16055(var77, module0139.$g1636$.getDynamicValue(var44));
                                                                                            if (module0427.NIL != module0173.f10955(var77)) {
                                                                                                final SubLObject var78 = module0423.f29579(var77);
                                                                                                if (var78.isCons()) {
                                                                                                    SubLObject var62_388 = var78;
                                                                                                    SubLObject var79 = (SubLObject)module0427.NIL;
                                                                                                    var79 = var62_388.first();
                                                                                                    while (module0427.NIL != var62_388) {
                                                                                                        final SubLObject var80 = var79;
                                                                                                        if (module0427.NIL == conses_high.member(var80, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                            var45 = (SubLObject)ConsesLow.cons(var80, var45);
                                                                                                        }
                                                                                                        var62_388 = var62_388.rest();
                                                                                                        var79 = var62_388.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var76 = var76.rest();
                                                                                        var77 = var76.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0427.$ic108$, var68);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var48_380, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var139_385);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_379, var44);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var63);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0427.FIVE_INTEGER, (SubLObject)module0427.$ic109$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                                                }
                                                if (module0427.NIL != module0200.f12419(var60, module0137.f8955((SubLObject)module0427.UNPROVIDED))) {
                                                    SubLObject var81 = module0248.f15995(var60);
                                                    SubLObject var82 = (SubLObject)module0427.NIL;
                                                    var82 = var81.first();
                                                    while (module0427.NIL != var81) {
                                                        SubLObject var84;
                                                        final SubLObject var83 = var84 = var82;
                                                        SubLObject var85 = (SubLObject)module0427.NIL;
                                                        SubLObject var86 = (SubLObject)module0427.NIL;
                                                        SubLObject var87 = (SubLObject)module0427.NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0427.$ic110$);
                                                        var85 = var84.first();
                                                        var84 = var84.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0427.$ic110$);
                                                        var86 = var84.first();
                                                        var84 = var84.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0427.$ic110$);
                                                        var87 = var84.first();
                                                        var84 = var84.rest();
                                                        if (module0427.NIL == var84) {
                                                            if (module0427.NIL != module0147.f9507(var86)) {
                                                                final SubLObject var48_381 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var86, var44);
                                                                    if (module0427.NIL != module0141.f9289(var87)) {
                                                                        final SubLObject var48_382 = module0138.$g1624$.currentBinding(var44);
                                                                        try {
                                                                            module0138.$g1624$.bind(var87, var44);
                                                                            final SubLObject var68;
                                                                            final SubLObject var88 = var68 = (SubLObject)ConsesLow.list(var85);
                                                                            if (module0427.NIL != module0077.f5302(var68)) {
                                                                                final SubLObject var69 = module0077.f5333(var68);
                                                                                SubLObject var70;
                                                                                SubLObject var71;
                                                                                SubLObject var72;
                                                                                SubLObject var73;
                                                                                SubLObject var74;
                                                                                SubLObject var75;
                                                                                SubLObject var62_389;
                                                                                for (var70 = module0032.f1741(var69), var71 = (SubLObject)module0427.NIL, var71 = module0032.f1742(var70, var69); module0427.NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
                                                                                    var72 = module0032.f1745(var70, var71);
                                                                                    if (module0427.NIL != module0032.f1746(var71, var72) && module0427.NIL == module0249.f16059(var72, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                        module0249.f16055(var72, module0139.$g1636$.getDynamicValue(var44));
                                                                                        if (module0427.NIL != module0173.f10955(var72)) {
                                                                                            var73 = module0423.f29579(var72);
                                                                                            if (var73.isCons()) {
                                                                                                var62_389 = var73;
                                                                                                var74 = (SubLObject)module0427.NIL;
                                                                                                var74 = var62_389.first();
                                                                                                while (module0427.NIL != var62_389) {
                                                                                                    var75 = var74;
                                                                                                    if (module0427.NIL == conses_high.member(var75, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                        var45 = (SubLObject)ConsesLow.cons(var75, var45);
                                                                                                    }
                                                                                                    var62_389 = var62_389.rest();
                                                                                                    var74 = var62_389.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var68.isList()) {
                                                                                SubLObject var54_394 = var68;
                                                                                SubLObject var77 = (SubLObject)module0427.NIL;
                                                                                var77 = var54_394.first();
                                                                                while (module0427.NIL != var54_394) {
                                                                                    if (module0427.NIL == module0249.f16059(var77, module0139.$g1636$.getDynamicValue(var44))) {
                                                                                        module0249.f16055(var77, module0139.$g1636$.getDynamicValue(var44));
                                                                                        if (module0427.NIL != module0173.f10955(var77)) {
                                                                                            final SubLObject var78 = module0423.f29579(var77);
                                                                                            if (var78.isCons()) {
                                                                                                SubLObject var62_390 = var78;
                                                                                                SubLObject var79 = (SubLObject)module0427.NIL;
                                                                                                var79 = var62_390.first();
                                                                                                while (module0427.NIL != var62_390) {
                                                                                                    final SubLObject var80 = var79;
                                                                                                    if (module0427.NIL == conses_high.member(var80, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                                        var45 = (SubLObject)ConsesLow.cons(var80, var45);
                                                                                                    }
                                                                                                    var62_390 = var62_390.rest();
                                                                                                    var79 = var62_390.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    var54_394 = var54_394.rest();
                                                                                    var77 = var54_394.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)module0427.$ic108$, var68);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var48_382, var44);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_381, var44);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0427.$ic110$);
                                                        }
                                                        var81 = var81.rest();
                                                        var82 = var81.first();
                                                    }
                                                }
                                            }
                                            else if (module0427.NIL != module0155.f9785(var60, (SubLObject)module0427.UNPROVIDED)) {
                                                SubLObject var62_391;
                                                final SubLObject var89 = var62_391 = ((module0427.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0427.$ic57$)), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0427.$ic57$)), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED)));
                                                SubLObject var90 = (SubLObject)module0427.NIL;
                                                var90 = var62_391.first();
                                                while (module0427.NIL != var62_391) {
                                                    final SubLObject var48_383 = module0138.$g1625$.currentBinding(var44);
                                                    try {
                                                        module0138.$g1625$.bind(var90, var44);
                                                        final SubLObject var92;
                                                        final SubLObject var91 = var92 = Functions.funcall(var90, var60);
                                                        if (module0427.NIL != module0077.f5302(var92)) {
                                                            final SubLObject var93 = module0077.f5333(var92);
                                                            SubLObject var94;
                                                            SubLObject var95;
                                                            SubLObject var96;
                                                            SubLObject var97;
                                                            SubLObject var62_392;
                                                            SubLObject var98;
                                                            SubLObject var99;
                                                            for (var94 = module0032.f1741(var93), var95 = (SubLObject)module0427.NIL, var95 = module0032.f1742(var94, var93); module0427.NIL == module0032.f1744(var94, var95); var95 = module0032.f1743(var95)) {
                                                                var96 = module0032.f1745(var94, var95);
                                                                if (module0427.NIL != module0032.f1746(var95, var96) && module0427.NIL == module0249.f16059(var96, module0139.$g1636$.getDynamicValue(var44))) {
                                                                    module0249.f16055(var96, module0139.$g1636$.getDynamicValue(var44));
                                                                    if (module0427.NIL != module0173.f10955(var96)) {
                                                                        var97 = module0423.f29579(var96);
                                                                        if (var97.isCons()) {
                                                                            var62_392 = var97;
                                                                            var98 = (SubLObject)module0427.NIL;
                                                                            var98 = var62_392.first();
                                                                            while (module0427.NIL != var62_392) {
                                                                                var99 = var98;
                                                                                if (module0427.NIL == conses_high.member(var99, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                    var45 = (SubLObject)ConsesLow.cons(var99, var45);
                                                                                }
                                                                                var62_392 = var62_392.rest();
                                                                                var98 = var62_392.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else if (var92.isList()) {
                                                            SubLObject var100 = var92;
                                                            SubLObject var101 = (SubLObject)module0427.NIL;
                                                            var101 = var100.first();
                                                            while (module0427.NIL != var100) {
                                                                if (module0427.NIL == module0249.f16059(var101, module0139.$g1636$.getDynamicValue(var44))) {
                                                                    module0249.f16055(var101, module0139.$g1636$.getDynamicValue(var44));
                                                                    if (module0427.NIL != module0173.f10955(var101)) {
                                                                        final SubLObject var102 = module0423.f29579(var101);
                                                                        if (var102.isCons()) {
                                                                            SubLObject var62_393 = var102;
                                                                            SubLObject var103 = (SubLObject)module0427.NIL;
                                                                            var103 = var62_393.first();
                                                                            while (module0427.NIL != var62_393) {
                                                                                final SubLObject var104 = var103;
                                                                                if (module0427.NIL == conses_high.member(var104, var45, Symbols.symbol_function((SubLObject)module0427.EQL), Symbols.symbol_function((SubLObject)module0427.IDENTITY))) {
                                                                                    var45 = (SubLObject)ConsesLow.cons(var104, var45);
                                                                                }
                                                                                var62_393 = var62_393.rest();
                                                                                var103 = var62_393.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                var100 = var100.rest();
                                                                var101 = var100.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0427.$ic108$, var92);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var48_383, var44);
                                                    }
                                                    var62_391 = var62_391.rest();
                                                    var90 = var62_391.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var51_379, var44);
                                            module0137.$g1605$.rebind(var48_378, var44);
                                        }
                                        var58 = var58.rest();
                                        var59 = var58.first();
                                    }
                                    SubLObject var106;
                                    final SubLObject var105 = var106 = module0200.f12443(module0244.f15771(module0137.f8955(module0427.$ic57$)));
                                    SubLObject var107 = (SubLObject)module0427.NIL;
                                    var107 = var106.first();
                                    while (module0427.NIL != var106) {
                                        final SubLObject var48_384 = module0137.$g1605$.currentBinding(var44);
                                        final SubLObject var51_380 = module0141.$g1674$.currentBinding(var44);
                                        try {
                                            module0137.$g1605$.bind(var107, var44);
                                            module0141.$g1674$.bind((SubLObject)((module0427.NIL != module0141.f9205((SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0427.NIL == module0141.$g1674$.getDynamicValue(var44)) : module0141.$g1674$.getDynamicValue(var44)), var44);
                                            final SubLObject var108 = module0228.f15229(var116_373);
                                            if (module0427.NIL != module0138.f8992(var108)) {
                                                final SubLObject var109 = module0242.f15664(var108, module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                if (module0427.NIL != var109) {
                                                    final SubLObject var110 = module0245.f15834(var109, module0138.f8979(), module0137.f8955((SubLObject)module0427.UNPROVIDED));
                                                    if (module0427.NIL != var110) {
                                                        SubLObject var111;
                                                        for (var111 = module0066.f4838(module0067.f4891(var110)); module0427.NIL == module0066.f4841(var111); var111 = module0066.f4840(var111)) {
                                                            var44.resetMultipleValues();
                                                            final SubLObject var112 = module0066.f4839(var111);
                                                            final SubLObject var113 = var44.secondMultipleValue();
                                                            var44.resetMultipleValues();
                                                            if (module0427.NIL != module0147.f9507(var112)) {
                                                                final SubLObject var48_385 = module0138.$g1623$.currentBinding(var44);
                                                                try {
                                                                    module0138.$g1623$.bind(var112, var44);
                                                                    SubLObject var139_386;
                                                                    for (var139_386 = module0066.f4838(module0067.f4891(var113)); module0427.NIL == module0066.f4841(var139_386); var139_386 = module0066.f4840(var139_386)) {
                                                                        var44.resetMultipleValues();
                                                                        final SubLObject var114 = module0066.f4839(var139_386);
                                                                        final SubLObject var115 = var44.secondMultipleValue();
                                                                        var44.resetMultipleValues();
                                                                        if (module0427.NIL != module0141.f9289(var114)) {
                                                                            final SubLObject var48_386 = module0138.$g1624$.currentBinding(var44);
                                                                            try {
                                                                                module0138.$g1624$.bind(var114, var44);
                                                                                final SubLObject var116 = var115;
                                                                                if (module0427.NIL != module0077.f5302(var116)) {
                                                                                    final SubLObject var117 = module0077.f5333(var116);
                                                                                    SubLObject var118;
                                                                                    SubLObject var119;
                                                                                    SubLObject var120;
                                                                                    for (var118 = module0032.f1741(var117), var119 = (SubLObject)module0427.NIL, var119 = module0032.f1742(var118, var117); module0427.NIL == module0032.f1744(var118, var119); var119 = module0032.f1743(var119)) {
                                                                                        var120 = module0032.f1745(var118, var119);
                                                                                        if (module0427.NIL != module0032.f1746(var119, var120) && module0427.NIL == module0249.f16059(var120, (SubLObject)module0427.UNPROVIDED)) {
                                                                                            module0249.f16055(var120, (SubLObject)module0427.UNPROVIDED);
                                                                                            module0056.f4149(var120, var50);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var116.isList()) {
                                                                                    SubLObject var121 = var116;
                                                                                    SubLObject var122 = (SubLObject)module0427.NIL;
                                                                                    var122 = var121.first();
                                                                                    while (module0427.NIL != var121) {
                                                                                        if (module0427.NIL == module0249.f16059(var122, (SubLObject)module0427.UNPROVIDED)) {
                                                                                            module0249.f16055(var122, (SubLObject)module0427.UNPROVIDED);
                                                                                            module0056.f4149(var122, var50);
                                                                                        }
                                                                                        var121 = var121.rest();
                                                                                        var122 = var121.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0427.$ic108$, var116);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var48_386, var44);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var139_386);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var48_385, var44);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var111);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0427.FIVE_INTEGER, (SubLObject)module0427.$ic109$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                                                }
                                            }
                                            else if (module0427.NIL != module0155.f9785(var108, (SubLObject)module0427.UNPROVIDED)) {
                                                SubLObject var62_394;
                                                final SubLObject var123 = var62_394 = ((module0427.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var44), module0137.f8955((SubLObject)module0427.UNPROVIDED)));
                                                SubLObject var124 = (SubLObject)module0427.NIL;
                                                var124 = var62_394.first();
                                                while (module0427.NIL != var62_394) {
                                                    final SubLObject var48_387 = module0138.$g1625$.currentBinding(var44);
                                                    try {
                                                        module0138.$g1625$.bind(var124, var44);
                                                        final SubLObject var126;
                                                        final SubLObject var125 = var126 = Functions.funcall(var124, var108);
                                                        if (module0427.NIL != module0077.f5302(var126)) {
                                                            final SubLObject var127 = module0077.f5333(var126);
                                                            SubLObject var128;
                                                            SubLObject var129;
                                                            SubLObject var130;
                                                            for (var128 = module0032.f1741(var127), var129 = (SubLObject)module0427.NIL, var129 = module0032.f1742(var128, var127); module0427.NIL == module0032.f1744(var128, var129); var129 = module0032.f1743(var129)) {
                                                                var130 = module0032.f1745(var128, var129);
                                                                if (module0427.NIL != module0032.f1746(var129, var130) && module0427.NIL == module0249.f16059(var130, (SubLObject)module0427.UNPROVIDED)) {
                                                                    module0249.f16055(var130, (SubLObject)module0427.UNPROVIDED);
                                                                    module0056.f4149(var130, var50);
                                                                }
                                                            }
                                                        }
                                                        else if (var126.isList()) {
                                                            SubLObject var131 = var126;
                                                            SubLObject var132 = (SubLObject)module0427.NIL;
                                                            var132 = var131.first();
                                                            while (module0427.NIL != var131) {
                                                                if (module0427.NIL == module0249.f16059(var132, (SubLObject)module0427.UNPROVIDED)) {
                                                                    module0249.f16055(var132, (SubLObject)module0427.UNPROVIDED);
                                                                    module0056.f4149(var132, var50);
                                                                }
                                                                var131 = var131.rest();
                                                                var132 = var131.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0427.$ic108$, var126);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var48_387, var44);
                                                    }
                                                    var62_394 = var62_394.rest();
                                                    var124 = var62_394.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var51_380, var44);
                                            module0137.$g1605$.rebind(var48_384, var44);
                                        }
                                        var106 = var106.rest();
                                        var107 = var106.first();
                                    }
                                    var116_373 = module0056.f4150(var50);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var52_381, var44);
                                module0138.$g1619$.rebind(var51_378, var44);
                                module0141.$g1677$.rebind(var48_377, var44);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0427.TWO_INTEGER, (SubLObject)module0427.$ic111$, var46, module0244.f15748(module0137.f8955((SubLObject)module0427.UNPROVIDED)), (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var55, var44);
                        module0141.$g1674$.rebind(var54, var44);
                        module0141.$g1672$.rebind(var53, var44);
                        module0141.$g1671$.rebind(var51_377, var44);
                        module0141.$g1670$.rebind(var48_376, var44);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var51_376, var44);
                    module0141.$g1714$.rebind(var48_375, var44);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var44));
            }
            finally {
                module0139.$g1635$.rebind(var48_374, var44);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var44));
        }
        finally {
            module0139.$g1636$.rebind(var48, var44);
            module0137.$g1605$.rebind(var47, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f30288() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = module0259.f16848(module0427.$ic140$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
        module0012.$g82$.setDynamicValue((SubLObject)module0427.$ic119$, var44);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var44);
        module0012.$g83$.setDynamicValue(Sequences.length(var46), var44);
        module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var44);
        final SubLObject var47 = module0012.$g75$.currentBinding(var44);
        final SubLObject var48 = module0012.$g76$.currentBinding(var44);
        final SubLObject var49 = module0012.$g77$.currentBinding(var44);
        final SubLObject var50 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
            module0012.$g77$.bind((SubLObject)module0427.T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(module0012.$g82$.getDynamicValue(var44));
            SubLObject var51 = var46;
            SubLObject var52 = (SubLObject)module0427.NIL;
            var52 = var51.first();
            while (module0427.NIL != var51) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var44), module0012.$g83$.getDynamicValue(var44));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var44), (SubLObject)module0427.ONE_INTEGER), var44);
                final SubLObject var53 = module0423.f29562(var52).first();
                if (module0427.NIL != module0202.f12597(var53)) {
                    final SubLObject var54 = module0423.f29573(var52);
                    final SubLObject var55 = conses_high.getf(var54, (SubLObject)module0427.$ic141$, (SubLObject)module0427.UNPROVIDED);
                    if (module0427.NIL != var55) {
                        var45 = (SubLObject)ConsesLow.cons(var52, var45);
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var50, var44);
            module0012.$g77$.rebind(var49, var44);
            module0012.$g76$.rebind(var48, var44);
            module0012.$g75$.rebind(var47, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f30289() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        final SubLObject var46 = module0259.f16848(module0427.$ic140$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
        module0012.$g82$.setDynamicValue((SubLObject)module0427.$ic119$, var44);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var44);
        module0012.$g83$.setDynamicValue(Sequences.length(var46), var44);
        module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var44);
        final SubLObject var47 = module0012.$g75$.currentBinding(var44);
        final SubLObject var48 = module0012.$g76$.currentBinding(var44);
        final SubLObject var49 = module0012.$g77$.currentBinding(var44);
        final SubLObject var50 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
            module0012.$g77$.bind((SubLObject)module0427.T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(module0012.$g82$.getDynamicValue(var44));
            SubLObject var51 = var46;
            SubLObject var52 = (SubLObject)module0427.NIL;
            var52 = var51.first();
            while (module0427.NIL != var51) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var44), module0012.$g83$.getDynamicValue(var44));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var44), (SubLObject)module0427.ONE_INTEGER), var44);
                final SubLObject var53 = module0423.f29562(var52).first();
                var44.resetMultipleValues();
                final SubLObject var54 = module0279.f18578(var53, module0427.$ic142$);
                final SubLObject var55 = var44.secondMultipleValue();
                var44.resetMultipleValues();
                if (module0427.NIL != module0202.f12597(var54)) {
                    final SubLObject var56 = module0423.f29573(var52);
                    final SubLObject var57 = conses_high.getf(var56, (SubLObject)module0427.$ic141$, (SubLObject)module0427.UNPROVIDED);
                    if (module0427.NIL == var57) {
                        var45 = (SubLObject)ConsesLow.cons(var52, var45);
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var50, var44);
            module0012.$g77$.rebind(var49, var44);
            module0012.$g76$.rebind(var48, var44);
            module0012.$g75$.rebind(var47, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f30290() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var46;
        final SubLObject var45 = var46 = f30289();
        module0012.$g82$.setDynamicValue((SubLObject)module0427.$ic119$, var44);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var44);
        module0012.$g83$.setDynamicValue(Sequences.length(var46), var44);
        module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var44);
        final SubLObject var47 = module0012.$g75$.currentBinding(var44);
        final SubLObject var48 = module0012.$g76$.currentBinding(var44);
        final SubLObject var49 = module0012.$g77$.currentBinding(var44);
        final SubLObject var50 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var44);
            module0012.$g77$.bind((SubLObject)module0427.T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(module0012.$g82$.getDynamicValue(var44));
            SubLObject var51 = var46;
            SubLObject var52 = (SubLObject)module0427.NIL;
            var52 = var51.first();
            while (module0427.NIL != var51) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var44), module0012.$g83$.getDynamicValue(var44));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var44), (SubLObject)module0427.ONE_INTEGER), var44);
                module0543.f33631((SubLObject)ConsesLow.list(module0427.$ic62$, module0427.$ic143$, module0427.$ic144$, var52), module0427.$ic61$, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                var51 = var51.rest();
                var52 = var51.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var50, var44);
            module0012.$g77$.rebind(var49, var44);
            module0012.$g76$.rebind(var48, var44);
            module0012.$g75$.rebind(var47, var44);
        }
        return Sequences.length(var45);
    }
    
    public static SubLObject f30291(SubLObject var411) {
        if (var411 == module0427.UNPROVIDED) {
            var411 = f30199((SubLObject)module0427.$ic145$);
        }
        SubLObject var412 = (SubLObject)module0427.ZERO_INTEGER;
        SubLObject var413 = (SubLObject)module0427.ZERO_INTEGER;
        SubLObject var414 = module0424.f29678(var411);
        SubLObject var415 = (SubLObject)module0427.NIL;
        var415 = var414.first();
        while (module0427.NIL != var414) {
            SubLObject var62_415;
            final SubLObject var416 = var62_415 = module0424.f29631(var415, (SubLObject)module0427.$ic146$, (SubLObject)module0427.UNPROVIDED);
            SubLObject var417 = (SubLObject)module0427.NIL;
            var417 = var62_415.first();
            while (module0427.NIL != var62_415) {
                SubLObject var419;
                final SubLObject var418 = var419 = var417;
                SubLObject var420 = (SubLObject)module0427.NIL;
                SubLObject var421 = (SubLObject)module0427.NIL;
                SubLObject var422 = (SubLObject)module0427.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var419, var418, (SubLObject)module0427.$ic147$);
                var420 = var419.first();
                var419 = var419.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var419, var418, (SubLObject)module0427.$ic147$);
                var421 = var419.first();
                var419 = var419.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var419, var418, (SubLObject)module0427.$ic147$);
                var422 = var419.first();
                var419 = var419.rest();
                if (module0427.NIL == var419) {
                    if (module0427.NIL != var421) {
                        var412 = Numbers.add(var412, (SubLObject)module0427.ONE_INTEGER);
                    }
                    else {
                        var413 = Numbers.add(var413, (SubLObject)module0427.ONE_INTEGER);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var418, (SubLObject)module0427.$ic147$);
                }
                var62_415 = var62_415.rest();
                var417 = var62_415.first();
            }
            var414 = var414.rest();
            var415 = var414.first();
        }
        return Values.values(var412, var413, Numbers.add(var412, var413));
    }
    
    public static SubLObject f30292(final SubLObject var152, final SubLObject var419, final SubLObject var107) {
        final SubLObject var420 = module0178.f11303(var152);
        final SubLObject var421 = module0233.f15362(module0234.f15470(var419), var420);
        return module0274.f18060(var421, var107, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30293(SubLObject var411) {
        if (var411 == module0427.UNPROVIDED) {
            var411 = f30199((SubLObject)module0427.$ic145$);
        }
        final SubLThread var412 = SubLProcess.currentSubLThread();
        SubLObject var413 = (SubLObject)module0427.NIL;
        final SubLObject var414 = module0424.f29678(var411);
        module0012.$g82$.setDynamicValue((SubLObject)module0427.$ic119$, var412);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var412);
        module0012.$g83$.setDynamicValue(Sequences.length(var414), var412);
        module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var412);
        final SubLObject var415 = module0012.$g75$.currentBinding(var412);
        final SubLObject var416 = module0012.$g76$.currentBinding(var412);
        final SubLObject var417 = module0012.$g77$.currentBinding(var412);
        final SubLObject var418 = module0012.$g78$.currentBinding(var412);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var412);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var412);
            module0012.$g77$.bind((SubLObject)module0427.T, var412);
            module0012.$g78$.bind(Time.get_universal_time(), var412);
            module0012.f478(module0012.$g82$.getDynamicValue(var412));
            SubLObject var419 = var414;
            SubLObject var420 = (SubLObject)module0427.NIL;
            var420 = var419.first();
            while (module0427.NIL != var419) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var412), module0012.$g83$.getDynamicValue(var412));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var412), (SubLObject)module0427.ONE_INTEGER), var412);
                SubLObject var422;
                final SubLObject var421 = var422 = module0424.f29631(var420, (SubLObject)module0427.$ic146$, (SubLObject)module0427.UNPROVIDED);
                SubLObject var423 = (SubLObject)module0427.NIL;
                var423 = var422.first();
                while (module0427.NIL != var422) {
                    SubLObject var425;
                    final SubLObject var424 = var425 = var423;
                    SubLObject var426 = (SubLObject)module0427.NIL;
                    SubLObject var427 = (SubLObject)module0427.NIL;
                    SubLObject var428 = (SubLObject)module0427.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var425, var424, (SubLObject)module0427.$ic147$);
                    var426 = var425.first();
                    var425 = var425.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var425, var424, (SubLObject)module0427.$ic147$);
                    var427 = var425.first();
                    var425 = var425.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var425, var424, (SubLObject)module0427.$ic147$);
                    var428 = var425.first();
                    var425 = var425.rest();
                    if (module0427.NIL == var425) {
                        if (module0427.NIL != var427) {
                            final SubLObject var429 = f30292(var426, var427, var428);
                            if (module0427.NIL == var429) {
                                var413 = (SubLObject)ConsesLow.cons(var423, var413);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var424, (SubLObject)module0427.$ic147$);
                    }
                    var422 = var422.rest();
                    var423 = var422.first();
                }
                var419 = var419.rest();
                var420 = var419.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var418, var412);
            module0012.$g77$.rebind(var417, var412);
            module0012.$g76$.rebind(var416, var412);
            module0012.$g75$.rebind(var415, var412);
        }
        return Sequences.nreverse(var413);
    }
    
    public static SubLObject f30294(SubLObject var426) {
        if (var426 == module0427.UNPROVIDED) {
            var426 = module0069.f4939((SubLObject)module0427.$ic149$);
        }
        final SubLObject var427 = Hashtables.make_hash_table(Sequences.length(var426), Symbols.symbol_function((SubLObject)module0427.EQ), (SubLObject)module0427.UNPROVIDED);
        SubLObject var428 = var426;
        SubLObject var429 = (SubLObject)module0427.NIL;
        var429 = var428.first();
        while (module0427.NIL != var428) {
            SubLObject var431;
            final SubLObject var430 = var431 = var429;
            SubLObject var432 = (SubLObject)module0427.NIL;
            SubLObject var433 = (SubLObject)module0427.NIL;
            SubLObject var434 = (SubLObject)module0427.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var431, var430, (SubLObject)module0427.$ic147$);
            var432 = var431.first();
            var431 = var431.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var431, var430, (SubLObject)module0427.$ic147$);
            var433 = var431.first();
            var431 = var431.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var431, var430, (SubLObject)module0427.$ic147$);
            var434 = var431.first();
            var431 = var431.rest();
            if (module0427.NIL == var431) {
                SubLObject var435 = Hashtables.gethash_without_values(var432, var427, (SubLObject)module0427.UNPROVIDED);
                if (module0427.NIL == var435) {
                    var435 = module0077.f5313(Symbols.symbol_function((SubLObject)module0427.EQUAL), (SubLObject)module0427.UNPROVIDED);
                }
                module0077.f5326((SubLObject)ConsesLow.cons(var434, var433), var435);
                Hashtables.sethash(var432, var427, var435);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var430, (SubLObject)module0427.$ic147$);
            }
            var428 = var428.rest();
            var429 = var428.first();
        }
        module0427.$g3483$.setGlobalValue(var427);
        return var427;
    }
    
    public static SubLObject f30295(final SubLObject var152, final SubLObject var430, final SubLObject var107) {
        final SubLThread var431 = SubLProcess.currentSubLThread();
        if (module0427.NIL != module0427.$g3483$.getGlobalValue()) {
            final SubLObject var432 = Hashtables.gethash_without_values(var152, module0427.$g3483$.getGlobalValue(), (SubLObject)module0427.UNPROVIDED);
            if (module0427.NIL != var432) {
                final SubLObject var433 = module0377.f26764(var430);
                if (module0427.NIL != module0077.f5320((SubLObject)ConsesLow.cons(var107, var433), var432) && module0427.NIL != module0427.$g3484$.getDynamicValue(var431)) {
                    return (SubLObject)module0427.NIL;
                }
            }
        }
        return (SubLObject)module0427.T;
    }
    
    public static SubLObject f30296(final SubLObject var35, final SubLObject var431) {
        return module0548.f33850(var35, var431, (SubLObject)ConsesLow.list((SubLObject)module0427.$ic150$, (SubLObject)module0427.T, (SubLObject)module0427.$ic151$, module0038.f2638(var431), (SubLObject)module0427.$ic152$, Sequences.cconcatenate((SubLObject)module0427.$ic153$, module0006.f205(var431))), (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30297(final SubLObject var35) {
        SubLObject var36 = Sequences.reverse(f30196());
        SubLObject var37 = (SubLObject)module0427.NIL;
        var37 = var36.first();
        while (module0427.NIL != var36) {
            f30296(var35, var37);
            var36 = var36.rest();
            var37 = var36.first();
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30298(final SubLObject var433, SubLObject var434) {
        if (var434 == module0427.UNPROVIDED) {
            var434 = (SubLObject)module0427.NIL;
        }
        SubLObject var435 = (SubLObject)module0427.NIL;
        SubLObject var436 = var433;
        SubLObject var437 = (SubLObject)module0427.NIL;
        var437 = var436.first();
        while (module0427.NIL != var436) {
            SubLObject var438;
            final SubLObject var437_438 = var438 = var437;
            SubLObject var439 = (SubLObject)module0427.NIL;
            SubLObject var440 = (SubLObject)module0427.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var438, var437_438, (SubLObject)module0427.$ic154$);
            var439 = var438.first();
            var438 = var438.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var438, var437_438, (SubLObject)module0427.$ic154$);
            var440 = var438.first();
            var438 = var438.rest();
            if (module0427.NIL == var438) {
                final SubLObject var441 = (module0427.NIL != var434) ? Functions.funcall(var434, var440) : var440;
                final SubLObject var442 = module0424.f29701(var441, (SubLObject)module0427.UNPROVIDED);
                final SubLObject var443 = conses_high.getf(var442, (SubLObject)module0427.$ic155$, (SubLObject)module0427.UNPROVIDED);
                var435 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var439, var443), var435);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var437_438, (SubLObject)module0427.$ic154$);
            }
            var436 = var436.rest();
            var437 = var436.first();
        }
        return Sequences.nreverse(var435);
    }
    
    public static SubLObject f30299(final SubLObject var35, final SubLObject var443, final SubLObject var431) {
        return module0548.f33852(var35, var443, var431, (SubLObject)ConsesLow.list((SubLObject)module0427.$ic150$, (SubLObject)module0427.T, (SubLObject)module0427.$ic151$, module0038.f2638(var431), (SubLObject)module0427.$ic152$, Sequences.cconcatenate((SubLObject)module0427.$ic156$, module0006.f205(var431))), (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30300(final SubLObject var35, final SubLObject var443) {
        SubLObject var444 = Sequences.reverse(f30196());
        SubLObject var445 = (SubLObject)module0427.NIL;
        var445 = var444.first();
        while (module0427.NIL != var444) {
            f30299(var35, var443, var445);
            var444 = var444.rest();
            var445 = var444.first();
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30301(final SubLObject var35, final SubLObject var443) {
        return f30300(var35, var443);
    }
    
    public static SubLObject f30302() {
        module0427.$g3486$.setGlobalValue((SubLObject)module0427.NIL);
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30303() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0427.NIL;
        if (module0427.NIL != module0427.$g3485$.getDynamicValue(var44)) {
            var45 = Time.get_internal_real_time();
            module0427.$g3486$.setGlobalValue((SubLObject)ConsesLow.cons(var45, module0427.$g3486$.getGlobalValue()));
        }
        return var45;
    }
    
    public static SubLObject f30304() {
        final SubLObject var444 = Sequences.reverse(module0427.$g3486$.getGlobalValue());
        final SubLObject var445 = var444.first();
        SubLObject var446 = (SubLObject)module0427.NIL;
        SubLObject var447 = var444;
        SubLObject var448 = (SubLObject)module0427.NIL;
        var448 = var447.first();
        while (module0427.NIL != var447) {
            var446 = (SubLObject)ConsesLow.cons(Numbers.subtract(var448, var445), var446);
            var447 = var447.rest();
            var448 = var447.first();
        }
        return Sequences.nreverse(var446);
    }
    
    public static SubLObject f30305() {
        SubLObject var449;
        final SubLObject var448 = var449 = module0424.f29688(module0424.f29696(f30199((SubLObject)module0427.$ic158$)));
        SubLObject var450 = (SubLObject)module0427.NIL;
        var450 = var449.first();
        while (module0427.NIL != var449) {
            module0543.f33658((SubLObject)ConsesLow.listS(module0427.$ic57$, var450, (SubLObject)module0427.$ic159$), module0427.$ic59$);
            var449 = var449.rest();
            var450 = var449.first();
        }
        return f30251(module0427.$ic28$, module0427.$ic80$, module0427.$ic81$);
    }
    
    public static SubLObject f30306(final SubLObject var450, SubLObject var20, SubLObject var451, SubLObject var452, SubLObject var453) {
        if (var20 == module0427.UNPROVIDED) {
            var20 = f30195();
        }
        if (var451 == module0427.UNPROVIDED) {
            var451 = (SubLObject)module0427.$ic160$;
        }
        if (var452 == module0427.UNPROVIDED) {
            var452 = (SubLObject)module0427.$ic161$;
        }
        if (var453 == module0427.UNPROVIDED) {
            var453 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert module0427.NIL != module0091.f6320(var450) : var450;
        final SubLObject var454 = Symbols.symbol_value(var450);
        final SubLObject var455 = Symbols.symbol_name(var450);
        PrintLow.format(var453, (SubLObject)module0427.$ic163$);
        module0035.f2365(module0424.f29701(var454, f30194()), (SubLObject)module0427.UNPROVIDED);
        PrintLow.format(var453, (SubLObject)module0427.$ic164$);
        module0035.f2365(module0424.f29701(module0424.f29696(var454), f30194()), (SubLObject)module0427.UNPROVIDED);
        PrintLow.format(var453, (SubLObject)module0427.$ic165$);
        module0035.f2365(module0424.f29701(module0424.f29955(var454), f30194()), (SubLObject)module0427.UNPROVIDED);
        PrintLow.format(var453, (SubLObject)module0427.$ic166$);
        module0035.f2365(module0424.f29701(f30201(var454), f30194()), (SubLObject)module0427.UNPROVIDED);
        PrintLow.format(var453, (SubLObject)module0427.$ic167$);
        module0035.f2365(module0424.f29701(f30203(var454), f30194()), (SubLObject)module0427.UNPROVIDED);
        PrintLow.format(var453, (SubLObject)module0427.$ic168$);
        module0035.f2365(module0424.f29701(f30202(var454), f30194()), (SubLObject)module0427.UNPROVIDED);
        PrintLow.format(var453, (SubLObject)module0427.$ic169$);
        module0035.f2365(module0424.f29701(module0424.f29696(f30201(var454)), f30194()), (SubLObject)module0427.UNPROVIDED);
        PrintLow.format(var453, (SubLObject)module0427.$ic170$);
        module0035.f2365(module0424.f29701(module0424.f29696(f30203(var454)), f30194()), (SubLObject)module0427.UNPROVIDED);
        PrintLow.format(var453, (SubLObject)module0427.$ic171$);
        module0035.f2365(module0424.f29701(module0424.f29696(f30202(var454)), f30194()), (SubLObject)module0427.UNPROVIDED);
        PrintLow.format(var453, (SubLObject)module0427.$ic172$);
        module0035.f2365(module0424.f29701(module0424.f29955(f30201(var454)), f30194()), (SubLObject)module0427.UNPROVIDED);
        PrintLow.format(var453, (SubLObject)module0427.$ic173$);
        module0035.f2365(module0424.f29701(module0424.f29955(f30203(var454)), f30194()), (SubLObject)module0427.UNPROVIDED);
        PrintLow.format(var453, (SubLObject)module0427.$ic174$);
        module0035.f2365(module0424.f29701(module0424.f29955(f30202(var454)), f30194()), (SubLObject)module0427.UNPROVIDED);
        SubLObject var456 = var20;
        SubLObject var457 = (SubLObject)module0427.NIL;
        var457 = var456.first();
        while (module0427.NIL != var456) {
            f30307(var454, var455, var457, var451, var452);
            var456 = var456.rest();
            var457 = var456.first();
        }
        return var455;
    }
    
    public static SubLObject f30308(final SubLObject var454, final SubLObject var450, SubLObject var455, SubLObject var20, SubLObject var451, SubLObject var452, SubLObject var453) {
        if (var455 == module0427.UNPROVIDED) {
            var455 = (SubLObject)module0427.T;
        }
        if (var20 == module0427.UNPROVIDED) {
            var20 = f30194();
        }
        if (var451 == module0427.UNPROVIDED) {
            var451 = (SubLObject)module0427.$ic160$;
        }
        if (var452 == module0427.UNPROVIDED) {
            var452 = (SubLObject)module0427.$ic161$;
        }
        if (var453 == module0427.UNPROVIDED) {
            var453 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var456 = SubLProcess.currentSubLThread();
        assert module0427.NIL != module0091.f6320(var454) : var454;
        assert module0427.NIL != module0091.f6320(var450) : var450;
        final SubLObject var457 = Symbols.symbol_value(var454);
        final SubLObject var458 = Symbols.symbol_name(var454);
        final SubLObject var459 = Symbols.symbol_value(var450);
        final SubLObject var460 = Symbols.symbol_name(var450);
        final SubLObject var461 = f30201(var457);
        final SubLObject var462 = f30201(var459);
        final SubLObject var463 = f30203(var457);
        final SubLObject var464 = f30203(var459);
        final SubLObject var465 = f30202(var457);
        final SubLObject var466 = f30202(var459);
        var456.resetMultipleValues();
        final SubLObject var467 = module0424.f29968(var457, var459);
        final SubLObject var468 = var456.secondMultipleValue();
        var456.resetMultipleValues();
        PrintLow.format(var453, (SubLObject)module0427.$ic175$);
        var456.resetMultipleValues();
        SubLObject var469 = module0424.f30014(var457, var459);
        SubLObject var470 = var456.secondMultipleValue();
        SubLObject var471 = var456.thirdMultipleValue();
        var456.resetMultipleValues();
        PrintLow.format((SubLObject)module0427.T, (SubLObject)module0427.$ic176$, new SubLObject[] { var469, var470, var471 });
        var456.resetMultipleValues();
        var469 = module0424.f30014(var461, var462);
        var470 = var456.secondMultipleValue();
        var471 = var456.thirdMultipleValue();
        var456.resetMultipleValues();
        PrintLow.format((SubLObject)module0427.T, (SubLObject)module0427.$ic177$, new SubLObject[] { var469, var470, var471 });
        var456.resetMultipleValues();
        var469 = module0424.f30014(var463, var464);
        var470 = var456.secondMultipleValue();
        var471 = var456.thirdMultipleValue();
        var456.resetMultipleValues();
        PrintLow.format((SubLObject)module0427.T, (SubLObject)module0427.$ic178$, new SubLObject[] { var469, var470, var471 });
        var456.resetMultipleValues();
        var469 = module0424.f30014(var465, var466);
        var470 = var456.secondMultipleValue();
        var471 = var456.thirdMultipleValue();
        var456.resetMultipleValues();
        PrintLow.format((SubLObject)module0427.T, (SubLObject)module0427.$ic179$, new SubLObject[] { var469, var470, var471 });
        PrintLow.format(var453, (SubLObject)module0427.$ic180$);
        PrintLow.format(var453, (SubLObject)module0427.$ic163$);
        module0424.f30024(module0424.f30020(var457, var459, var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic181$);
        module0424.f30024(module0424.f30020(var467, var468, var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic182$);
        module0424.f30024(module0424.f30020(f30201(var467), f30201(var468), var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic183$);
        module0424.f30024(module0424.f30020(f30203(var467), f30203(var468), var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic184$);
        module0424.f30024(module0424.f30020(f30202(var467), f30202(var468), var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic164$);
        module0424.f30024(module0424.f30020(module0424.f29696(var457), module0424.f29696(var459), var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic165$);
        module0424.f30024(module0424.f30020(module0424.f29955(var457), module0424.f29955(var459), var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic166$);
        module0424.f30024(module0424.f30020(var461, var462, var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic167$);
        module0424.f30024(module0424.f30020(var463, var464, var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic168$);
        module0424.f30024(module0424.f30020(var465, var466, var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic169$);
        module0424.f30024(module0424.f30020(module0424.f29696(var461), module0424.f29696(var462), var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic170$);
        module0424.f30024(module0424.f30020(module0424.f29696(var463), module0424.f29696(var464), var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic171$);
        module0424.f30024(module0424.f30020(module0424.f29696(var465), module0424.f29696(var466), var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic172$);
        module0424.f30024(module0424.f30020(module0424.f29955(var461), module0424.f29955(var462), var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic173$);
        module0424.f30024(module0424.f30020(module0424.f29955(var463), module0424.f29955(var464), var20));
        PrintLow.format(var453, (SubLObject)module0427.$ic174$);
        module0424.f30024(module0424.f30020(module0424.f29955(var465), module0424.f29955(var466), var20));
        if (module0427.NIL != var455) {
            SubLObject var472 = var20;
            SubLObject var473 = (SubLObject)module0427.NIL;
            var473 = var472.first();
            while (module0427.NIL != var472) {
                f30309(var467, var468, var458, var460, var473, (SubLObject)module0427.$ic185$, Sequences.cconcatenate((SubLObject)module0427.$ic186$, var451), var452);
                f30309(var467, var468, var458, var460, var473, (SubLObject)module0427.$ic187$, Sequences.cconcatenate((SubLObject)module0427.$ic186$, var451), var452);
                var472 = var472.rest();
                var473 = var472.first();
            }
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30309(final SubLObject var456, final SubLObject var34, final SubLObject var457, final SubLObject var458, final SubLObject var431, SubLObject var470, SubLObject var451, SubLObject var452) {
        if (var470 == module0427.UNPROVIDED) {
            var470 = (SubLObject)module0427.$ic185$;
        }
        if (var451 == module0427.UNPROVIDED) {
            var451 = (SubLObject)module0427.$ic160$;
        }
        if (var452 == module0427.UNPROVIDED) {
            var452 = (SubLObject)module0427.$ic161$;
        }
        return module0548.f33841(var456, var34, var431, (SubLObject)ConsesLow.listS((SubLObject)module0427.$ic152$, new SubLObject[] { Sequences.cconcatenate(module0006.f203(var451), new SubLObject[] { module0427.$ic188$, module0006.f203(var457), module0427.$ic189$, module0006.f203(var458), module0427.$ic190$, module0006.f203(var431) }), module0427.$ic191$, module0427.$ic192$, module0427.$ic151$, f30310(var431), module0427.$ic193$, var457, module0427.$ic194$, var458, module0427.$ic195$ }), var470, var452);
    }
    
    public static SubLObject f30307(final SubLObject var34, final SubLObject var75, final SubLObject var431, SubLObject var451, SubLObject var452) {
        if (var451 == module0427.UNPROVIDED) {
            var451 = (SubLObject)module0427.$ic160$;
        }
        if (var452 == module0427.UNPROVIDED) {
            var452 = (SubLObject)module0427.$ic161$;
        }
        return module0548.f33847(var34, var431, (SubLObject)module0427.$ic196$, (SubLObject)ConsesLow.listS((SubLObject)module0427.$ic152$, new SubLObject[] { Sequences.cconcatenate(module0006.f203(var451), new SubLObject[] { module0427.$ic197$, module0006.f203(var75), module0427.$ic190$, module0006.f203(var431) }), module0427.$ic191$, module0427.$ic192$, module0427.$ic151$, f30310(var431), module0427.$ic198$ }), var452);
    }
    
    public static SubLObject f30310(final SubLObject var431) {
        final SubLObject var432 = Symbols.symbol_name(var431);
        if (module0427.NIL != module0038.f2668((SubLObject)module0427.$ic199$, var432, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) {
            return (SubLObject)module0427.$ic200$;
        }
        if (module0427.NIL != module0038.f2668((SubLObject)module0427.$ic201$, var432, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) {
            return (SubLObject)module0427.$ic202$;
        }
        if (module0427.NIL != module0038.f2668((SubLObject)module0427.$ic203$, var432, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) {
            return (SubLObject)module0427.$ic204$;
        }
        if (module0427.NIL != module0038.f2668((SubLObject)module0427.$ic205$, var432, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) {
            return (SubLObject)module0427.$ic206$;
        }
        if (module0427.NIL != module0038.f2668((SubLObject)module0427.$ic207$, var432, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) {
            return (SubLObject)module0427.$ic208$;
        }
        if (module0427.NIL != module0038.f2668((SubLObject)module0427.$ic209$, var432, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) {
            return (SubLObject)module0427.$ic210$;
        }
        if (module0427.NIL != module0038.f2668((SubLObject)module0427.$ic211$, var432, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED)) {
            return (SubLObject)module0427.$ic212$;
        }
        return (SubLObject)module0427.$ic213$;
    }
    
    public static SubLObject f30311(SubLObject var34) {
        if (var34 == module0427.UNPROVIDED) {
            var34 = f30199((SubLObject)module0427.$ic214$);
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)module0427.NIL;
        final SubLObject var37 = module0424.f29678(var34);
        module0012.$g82$.setDynamicValue((SubLObject)module0427.$ic119$, var35);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var35);
        module0012.$g83$.setDynamicValue(Sequences.length(var37), var35);
        module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var35);
        final SubLObject var38 = module0012.$g75$.currentBinding(var35);
        final SubLObject var39 = module0012.$g76$.currentBinding(var35);
        final SubLObject var40 = module0012.$g77$.currentBinding(var35);
        final SubLObject var41 = module0012.$g78$.currentBinding(var35);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var35);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var35);
            module0012.$g77$.bind((SubLObject)module0427.T, var35);
            module0012.$g78$.bind(Time.get_universal_time(), var35);
            module0012.f478(module0012.$g82$.getDynamicValue(var35));
            SubLObject var42 = var37;
            SubLObject var43 = (SubLObject)module0427.NIL;
            var43 = var42.first();
            while (module0427.NIL != var42) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var35), module0012.$g83$.getDynamicValue(var35));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var35), (SubLObject)module0427.ONE_INTEGER), var35);
                SubLObject var45;
                final SubLObject var44 = var45 = module0424.f29631(var43, (SubLObject)module0427.$ic215$, (SubLObject)module0427.UNPROVIDED);
                SubLObject var46 = (SubLObject)module0427.NIL;
                var46 = var45.first();
                while (module0427.NIL != var45) {
                    SubLObject var62_473 = var46;
                    SubLObject var47 = (SubLObject)module0427.NIL;
                    var47 = var62_473.first();
                    while (module0427.NIL != var62_473) {
                        SubLObject var48 = (SubLObject)module0427.$ic216$;
                        SubLObject var49 = (SubLObject)module0427.ZERO_INTEGER;
                        SubLObject var62_474 = module0232.f15306(var47);
                        SubLObject var50 = (SubLObject)module0427.NIL;
                        var50 = var62_474.first();
                        while (module0427.NIL != var62_474) {
                            SubLObject var52;
                            final SubLObject var51 = var52 = var50;
                            SubLObject var53 = (SubLObject)module0427.NIL;
                            SubLObject var54 = (SubLObject)module0427.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var52, var51, (SubLObject)module0427.$ic217$);
                            var53 = var52.first();
                            var52 = var52.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var52, var51, (SubLObject)module0427.$ic217$);
                            var54 = var52.first();
                            var52 = var52.rest();
                            if (module0427.NIL == var52) {
                                final SubLObject var55 = module0228.f15217(var54);
                                final SubLObject var56 = module0228.f15217(var53);
                                final SubLObject var57 = Numbers.max(var55, var56);
                                var36 = (SubLObject)ConsesLow.cons(var57, var36);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var51, (SubLObject)module0427.$ic217$);
                            }
                            var49 = Numbers.add(var49, (SubLObject)module0427.ONE_INTEGER);
                            var62_474 = var62_474.rest();
                            var50 = var62_474.first();
                        }
                        var48 = (SubLObject)module0427.$ic218$;
                        var49 = (SubLObject)module0427.ZERO_INTEGER;
                        SubLObject var62_475 = module0232.f15308(var47);
                        var50 = (SubLObject)module0427.NIL;
                        var50 = var62_475.first();
                        while (module0427.NIL != var62_475) {
                            SubLObject var59;
                            final SubLObject var58 = var59 = var50;
                            SubLObject var53 = (SubLObject)module0427.NIL;
                            SubLObject var54 = (SubLObject)module0427.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)module0427.$ic217$);
                            var53 = var59.first();
                            var59 = var59.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)module0427.$ic217$);
                            var54 = var59.first();
                            var59 = var59.rest();
                            if (module0427.NIL == var59) {
                                final SubLObject var55 = module0228.f15217(var54);
                                final SubLObject var56 = module0228.f15217(var53);
                                final SubLObject var57 = Numbers.max(var55, var56);
                                var36 = (SubLObject)ConsesLow.cons(var57, var36);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var58, (SubLObject)module0427.$ic217$);
                            }
                            var49 = Numbers.add(var49, (SubLObject)module0427.ONE_INTEGER);
                            var62_475 = var62_475.rest();
                            var50 = var62_475.first();
                        }
                        var62_473 = var62_473.rest();
                        var47 = var62_473.first();
                    }
                    var45 = var45.rest();
                    var46 = var45.first();
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var41, var35);
            module0012.$g77$.rebind(var40, var35);
            module0012.$g76$.rebind(var39, var35);
            module0012.$g75$.rebind(var38, var35);
        }
        return module0035.f2515(var36, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
    }
    
    public static SubLObject f30312(SubLObject var34) {
        if (var34 == module0427.UNPROVIDED) {
            var34 = f30199((SubLObject)module0427.$ic214$);
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        final SubLObject var36 = module0067.f4880(Symbols.symbol_function((SubLObject)module0427.EQ), (SubLObject)module0427.UNPROVIDED);
        final SubLObject var37 = module0424.f29678(var34);
        module0012.$g82$.setDynamicValue((SubLObject)module0427.$ic119$, var35);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var35);
        module0012.$g83$.setDynamicValue(Sequences.length(var37), var35);
        module0012.$g84$.setDynamicValue((SubLObject)module0427.ZERO_INTEGER, var35);
        final SubLObject var38 = module0012.$g75$.currentBinding(var35);
        final SubLObject var39 = module0012.$g76$.currentBinding(var35);
        final SubLObject var40 = module0012.$g77$.currentBinding(var35);
        final SubLObject var41 = module0012.$g78$.currentBinding(var35);
        try {
            module0012.$g75$.bind((SubLObject)module0427.ZERO_INTEGER, var35);
            module0012.$g76$.bind((SubLObject)module0427.NIL, var35);
            module0012.$g77$.bind((SubLObject)module0427.T, var35);
            module0012.$g78$.bind(Time.get_universal_time(), var35);
            module0012.f478(module0012.$g82$.getDynamicValue(var35));
            SubLObject var42 = var37;
            SubLObject var43 = (SubLObject)module0427.NIL;
            var43 = var42.first();
            while (module0427.NIL != var42) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var35), module0012.$g83$.getDynamicValue(var35));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var35), (SubLObject)module0427.ONE_INTEGER), var35);
                SubLObject var45;
                final SubLObject var44 = var45 = module0424.f29631(var43, (SubLObject)module0427.$ic215$, (SubLObject)module0427.UNPROVIDED);
                SubLObject var46 = (SubLObject)module0427.NIL;
                var46 = var45.first();
                while (module0427.NIL != var45) {
                    SubLObject var62_489 = module0205.f13189(var46, (SubLObject)module0427.NIL, (SubLObject)module0427.UNPROVIDED, (SubLObject)module0427.UNPROVIDED);
                    SubLObject var47 = (SubLObject)module0427.NIL;
                    var47 = var62_489.first();
                    while (module0427.NIL != var62_489) {
                        module0084.f5775(var36, var47, (SubLObject)module0427.UNPROVIDED);
                        var62_489 = var62_489.rest();
                        var47 = var62_489.first();
                    }
                    var45 = var45.rest();
                    var46 = var45.first();
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var41, var35);
            module0012.$g77$.rebind(var40, var35);
            module0012.$g76$.rebind(var39, var35);
            module0012.$g75$.rebind(var38, var35);
        }
        return Sort.sort(module0084.f5780(var36), Symbols.symbol_function((SubLObject)module0427.$ic219$), Symbols.symbol_function((SubLObject)module0427.$ic220$));
    }
    
    public static SubLObject f30313(final SubLObject var491) {
        return Numbers.divide(var491, module0427.$g3487$.getGlobalValue());
    }
    
    public static SubLObject f30314(final SubLObject var492) {
        return Mapping.mapcar((SubLObject)module0427.$ic222$, var492);
    }
    
    public static SubLObject f30315(final SubLObject var112, final SubLObject var37) {
        final SubLThread var113 = SubLProcess.currentSubLThread();
        var113.resetMultipleValues();
        final SubLObject var114 = f30316(var112, var37);
        final SubLObject var115 = var113.secondMultipleValue();
        var113.resetMultipleValues();
        return var114;
    }
    
    public static SubLObject f30317(final SubLObject var112, final SubLObject var37) {
        final SubLThread var113 = SubLProcess.currentSubLThread();
        var113.resetMultipleValues();
        final SubLObject var114 = f30316(var112, var37);
        final SubLObject var115 = var113.secondMultipleValue();
        var113.resetMultipleValues();
        return var115;
    }
    
    public static SubLObject f30316(final SubLObject var112, final SubLObject var37) {
        final SubLObject var113 = Vectors.make_vector(var37, (SubLObject)module0427.ZERO_INTEGER);
        SubLObject var114 = (SubLObject)module0427.NIL;
        final SubLObject var115 = module0424.f29640(var112, (SubLObject)module0427.$ic223$, (SubLObject)module0427.UNPROVIDED);
        final SubLObject var116 = module0424.f29640(var112, (SubLObject)module0427.$ic224$, (SubLObject)module0427.UNPROVIDED);
        final SubLObject var117 = module0084.f5781(var116, (SubLObject)module0427.UNPROVIDED);
        SubLObject var118 = (SubLObject)module0427.NIL;
        SubLObject var119 = (SubLObject)module0427.NIL;
        SubLObject var120 = (SubLObject)module0427.NIL;
        var118 = var115;
        var119 = var118.first();
        for (var120 = (SubLObject)module0427.ZERO_INTEGER; module0427.NIL != var118; var118 = var118.rest(), var119 = var118.first(), var120 = Numbers.add((SubLObject)module0427.ONE_INTEGER, var120)) {
            final SubLObject var121 = f30318(var113);
            final SubLObject var122 = Vectors.aref(var113, var121);
            Vectors.set_aref(var113, var121, Numbers.add(Vectors.aref(var113, var121), var119));
            final SubLObject var123 = module0067.f4884(var117, var120, (SubLObject)module0427.UNPROVIDED);
            final SubLObject var124 = var123.first();
            if (module0427.NIL != var124) {
                final SubLObject var125 = Numbers.add(var122, var124);
                if (module0427.NIL == var114 || var125.numL(var114)) {
                    var114 = var125;
                }
            }
        }
        final SubLObject var126 = module0037.f2573(var113);
        return Values.values(module0424.f29648(var126), (SubLObject)((module0427.NIL != var114) ? module0424.f29648(var114) : module0427.NIL));
    }
    
    public static SubLObject f30318(final SubLObject var495) {
        SubLObject var496 = module0048.f3326();
        SubLObject var497 = (SubLObject)module0427.NIL;
        final SubLObject var498 = (SubLObject)module0427.NIL;
        SubLObject var499;
        SubLObject var500;
        SubLObject var501;
        SubLObject var502;
        for (var499 = Sequences.length(var495), var500 = (SubLObject)module0427.NIL, var500 = (SubLObject)module0427.ZERO_INTEGER; var500.numL(var499); var500 = Numbers.add(var500, (SubLObject)module0427.ONE_INTEGER)) {
            var501 = ((module0427.NIL != var498) ? Numbers.subtract(var499, var500, (SubLObject)module0427.ONE_INTEGER) : var500);
            var502 = Vectors.aref(var495, var501);
            if (module0427.NIL != module0048.f3360(var502, var496)) {
                var496 = var502;
                var497 = var501;
            }
        }
        return var497;
    }
    
    public static SubLObject f30319(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        SubLObject var37 = (SubLObject)module0427.NIL;
        final SubLObject var38 = module0424.$g3451$.currentBinding(var36);
        try {
            module0424.$g3451$.bind(module0424.f29683(var35), var36);
            SubLObject var39 = module0424.f29678(var35);
            SubLObject var40 = (SubLObject)module0427.NIL;
            var40 = var39.first();
            while (module0427.NIL != var39) {
                final SubLObject var41 = module0424.f29640(var40, (SubLObject)module0427.$ic224$, (SubLObject)module0427.UNPROVIDED);
                final SubLObject var42 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0427.$ic225$), var41);
                var37 = ConsesLow.nconc(var42, var37);
                var39 = var39.rest();
                var40 = var39.first();
            }
            var37 = Mapping.mapcar((SubLObject)module0427.$ic226$, var37);
        }
        finally {
            module0424.$g3451$.rebind(var38, var36);
        }
        var37 = module0035.f2391(var37, (SubLObject)module0427.UNPROVIDED);
        return var37;
    }
    
    public static SubLObject f30320(final SubLObject var35, SubLObject var512) {
        if (var512 == module0427.UNPROVIDED) {
            var512 = (SubLObject)module0427.NIL;
        }
        final SubLObject var513 = f30319(var35);
        return module0548.f33819(var513, var512);
    }
    
    public static SubLObject f30321(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        SubLObject var37 = (SubLObject)module0427.NIL;
        final SubLObject var38 = module0424.$g3451$.currentBinding(var36);
        try {
            module0424.$g3451$.bind(module0424.f29683(var35), var36);
            SubLObject var39 = module0424.f29678(var35);
            SubLObject var40 = (SubLObject)module0427.NIL;
            var40 = var39.first();
            while (module0427.NIL != var39) {
                final SubLObject var41 = module0424.f29640(var40, (SubLObject)module0427.$ic223$, (SubLObject)module0427.UNPROVIDED);
                var37 = ConsesLow.nconc(conses_high.copy_list(var41), var37);
                var39 = var39.rest();
                var40 = var39.first();
            }
            var37 = Mapping.mapcar((SubLObject)module0427.$ic226$, var37);
        }
        finally {
            module0424.$g3451$.rebind(var38, var36);
        }
        var37 = module0035.f2391(var37, (SubLObject)module0427.UNPROVIDED);
        return var37;
    }
    
    public static SubLObject f30322(final SubLObject var35, SubLObject var512) {
        if (var512 == module0427.UNPROVIDED) {
            var512 = (SubLObject)module0427.NIL;
        }
        final SubLObject var513 = f30321(var35);
        return module0548.f33819(var513, var512);
    }
    
    public static SubLObject f30323(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        final SubLObject var40 = module0018.$g738$.currentBinding(var39);
        try {
            module0018.$g738$.bind((SubLObject)module0427.NIL, var39);
            module0424.f29713(var38, f30196(), module0424.$g3450$.getDynamicValue(var39), (SubLObject)module0427.$ic227$, (SubLObject)module0427.UNPROVIDED);
        }
        finally {
            module0018.$g738$.rebind(var40, var39);
        }
        final SubLObject var41 = module0411.f28630();
        return f30324(var41);
    }
    
    public static SubLObject f30324(final SubLObject var515) {
        SubLObject var516 = (SubLObject)module0427.$ic228$;
        SubLObject var517 = (SubLObject)module0427.ZERO_INTEGER;
        final SubLObject var518 = oc_inference_datastructures_inference.f25791(var515);
        if (module0427.NIL != var518) {
            SubLObject var519 = module0366.f24977(var518);
            SubLObject var520 = (SubLObject)module0427.NIL;
            var520 = var519.first();
            while (module0427.NIL != var519) {
                if (module0427.NIL != module0377.f26776(var520)) {
                    final SubLObject var521 = module0366.f24956(var520);
                    final SubLObject var522 = f30325(var521);
                    var516 = (SubLObject)ConsesLow.cons(var522, var516);
                }
                var519 = var519.rest();
                var520 = var519.first();
            }
        }
        SubLObject var523;
        SubLObject var524;
        for (var523 = (SubLObject)module0427.NIL, var523 = var516; !var523.isAtom(); var523 = var523.rest()) {
            var524 = Functions.apply(Symbols.symbol_function((SubLObject)module0427.$ic229$), var523);
            var517 = Numbers.add(var517, var524);
        }
        return var517;
    }
    
    public static SubLObject f30325(final SubLObject var520) {
        assert module0427.NIL != module0363.f24562(var520) : var520;
        final SubLObject var521 = module0205.f13144(module0370.f25911(module0363.f24509(var520)));
        return f30326(var521);
    }
    
    public static SubLObject f30326(final SubLObject var524) {
        final SubLThread var525 = SubLProcess.currentSubLThread();
        assert module0427.NIL != module0206.f13487(var524) : var524;
        SubLObject var526 = (SubLObject)module0427.ZERO_INTEGER;
        var525.resetMultipleValues();
        final SubLObject var527 = module0409.f28506(var524, (SubLObject)module0427.NIL, (SubLObject)module0427.$ic232$);
        final SubLObject var528 = var525.secondMultipleValue();
        final SubLObject var529 = var525.thirdMultipleValue();
        var525.resetMultipleValues();
        final SubLObject var530 = oc_inference_datastructures_inference.f25597(var529);
        SubLObject var531 = module0363.f24517(var530);
        SubLObject var532 = (SubLObject)module0427.NIL;
        var532 = var531.first();
        while (module0427.NIL != var531) {
            if (module0427.NIL != module0363.f24524(var532, (SubLObject)module0427.$ic233$) && module0427.NIL == module0377.f26766(var532) && module0427.$ic234$ != module0365.f24851(var532)) {
                final SubLObject var533 = module0365.f24852(var532);
                final SubLObject var534 = module0360.f23936(var533);
                var526 = Numbers.add(var526, var534);
            }
            var531 = var531.rest();
            var532 = var531.first();
        }
        return var526;
    }
    
    public static SubLObject f30327(final SubLObject var515) {
        final SubLObject var516 = oc_inference_datastructures_inference.f25597(var515);
        if (module0427.NIL != var516) {
            return f30328(var516, oc_inference_datastructures_inference.f25606(var515));
        }
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30328(final SubLObject var527, final SubLObject var531) {
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30329(final SubLObject var515) {
        final SubLObject var516 = (SubLObject)module0427.NIL;
        return Sequences.nreverse(var516);
    }
    
    public static SubLObject f30330() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30194", "S#33415", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30195", "S#33416", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30196", "S#33417", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30197", "S#33418", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0427", "f30198", "S#33419");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30199", "S#33420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30200", "S#33421", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30201", "S#33422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30202", "S#33423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30203", "S#33424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30204", "S#33425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30205", "S#33426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30206", "S#33427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30207", "S#33428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30208", "S#33429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30209", "S#33430", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30210", "S#33431", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30212", "S#33432", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30213", "S#33433", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30211", "S#33434", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30214", "S#33435", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30215", "S#33436", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30216", "S#33437", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30217", "S#33438", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30219", "S#33439", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30220", "S#33440", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30218", "S#33441", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30221", "S#33442", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30222", "S#33443", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30223", "S#33444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30224", "S#33445", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30225", "S#33446", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30226", "S#33447", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30228", "S#33448", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30229", "S#33449", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30227", "S#33450", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30230", "S#33451", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30231", "S#33452", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30232", "S#33453", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30233", "S#33454", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30234", "S#33455", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30235", "S#33456", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30236", "S#33457", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30237", "S#33458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30238", "S#33459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30239", "S#33460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30240", "S#33461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30241", "S#33462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30242", "S#33463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30243", "S#33464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30244", "S#33465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30245", "S#33466", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30246", "S#33467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30247", "S#33468", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30248", "S#33469", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30249", "S#33470", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30250", "S#33471", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30251", "S#33472", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30252", "S#33473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30253", "S#33474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30254", "S#33475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30255", "S#33476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30256", "S#33477", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30257", "S#33478", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30258", "S#33479", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30259", "S#33480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30260", "S#33481", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30261", "S#33482", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30262", "S#33483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30263", "S#33484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30264", "S#33485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30265", "S#33486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30266", "S#33487", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30267", "S#33488", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30268", "S#33489", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30269", "S#33490", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30270", "S#33491", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30271", "S#33492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30272", "S#33493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30273", "S#33494", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30274", "S#33495", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30276", "S#33496", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30275", "S#33497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30277", "S#33498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30278", "S#33499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30279", "S#33500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30280", "S#33501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30281", "S#33502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30283", "S#33503", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30282", "S#33504", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30284", "S#33505", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30285", "S#33506", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30286", "S#33507", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30287", "S#33508", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30288", "S#33509", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30289", "S#33510", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30290", "S#33511", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30291", "S#33512", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30292", "S#33513", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30293", "S#33514", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30294", "S#33515", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30295", "S#29935", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30296", "S#33516", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30297", "S#33517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30298", "S#33518", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30299", "S#33519", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30300", "S#33520", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30301", "S#33521", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30302", "S#32756", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30303", "S#27332", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30304", "S#28218", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30305", "S#33522", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30306", "S#33523", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30308", "S#33524", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30309", "S#33525", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30307", "S#33526", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30310", "S#33527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30311", "S#33528", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30312", "S#33529", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30313", "S#33530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30314", "S#33531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30315", "S#33532", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30317", "S#33533", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30316", "S#33534", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30318", "S#33535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30319", "S#33536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30320", "S#33537", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30321", "S#33538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30322", "S#33539", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30323", "S#33540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30324", "S#32029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30325", "S#33541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30326", "S#33542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30327", "S#32030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30328", "S#33543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0427", "f30329", "S#32031", 1, 0, false);
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30331() {
        module0427.$g3475$ = SubLFiles.deflexical("S#33544", (SubLObject)module0427.$ic0$);
        module0427.$g3476$ = SubLFiles.deflexical("S#33545", Sequences.cconcatenate(module0427.$g3475$.getGlobalValue(), (SubLObject)module0427.$ic1$));
        module0427.$g3477$ = SubLFiles.deflexical("S#33546", (SubLObject)module0427.$ic3$);
        module0427.$g3478$ = SubLFiles.deflexical("S#33547", module0424.$g3162$.getGlobalValue());
        module0427.$g3479$ = SubLFiles.deflexical("S#33548", (SubLObject)module0427.NIL);
        module0427.$g3480$ = SubLFiles.deflexical("S#33549", (SubLObject)module0427.NIL);
        module0427.$g3481$ = SubLFiles.deflexical("S#33550", (SubLObject)module0427.NIL);
        module0427.$g3482$ = SubLFiles.deflexical("S#33551", (SubLObject)module0427.$ic124$);
        module0427.$g3483$ = SubLFiles.deflexical("S#33552", (SubLObject)((module0427.NIL != Symbols.boundp((SubLObject)module0427.$ic148$)) ? module0427.$g3483$.getGlobalValue() : module0427.NIL));
        module0427.$g3484$ = SubLFiles.defparameter("S#33553", (SubLObject)module0427.NIL);
        module0427.$g3485$ = SubLFiles.defparameter("S#33554", (SubLObject)module0427.NIL);
        module0427.$g3486$ = SubLFiles.deflexical("S#33555", (SubLObject)((module0427.NIL != Symbols.boundp((SubLObject)module0427.$ic157$)) ? module0427.$g3486$.getGlobalValue() : module0427.NIL));
        module0427.$g3487$ = SubLFiles.deflexical("S#33556", (SubLObject)module0427.$ic221$);
        return (SubLObject)module0427.NIL;
    }
    
    public static SubLObject f30332() {
        module0034.f1909((SubLObject)module0427.$ic33$);
        module0034.f1909((SubLObject)module0427.$ic43$);
        module0034.f1909((SubLObject)module0427.$ic50$);
        module0003.f57((SubLObject)module0427.$ic148$);
        module0003.f57((SubLObject)module0427.$ic157$);
        return (SubLObject)module0427.NIL;
    }
    
    public void declareFunctions() {
        f30330();
    }
    
    public void initializeVariables() {
        f30331();
    }
    
    public void runTopLevelForms() {
        f30332();
    }
    
    static {
        me = (SubLFile)new module0427();
        module0427.$g3475$ = null;
        module0427.$g3476$ = null;
        module0427.$g3477$ = null;
        module0427.$g3478$ = null;
        module0427.$g3479$ = null;
        module0427.$g3480$ = null;
        module0427.$g3481$ = null;
        module0427.$g3482$ = null;
        module0427.$g3483$ = null;
        module0427.$g3484$ = null;
        module0427.$g3485$ = null;
        module0427.$g3486$ = null;
        module0427.$g3487$ = null;
        $ic0$ = SubLObjectFactory.makeString("/cyc/projects/inference/leviathan/");
        $ic1$ = SubLObjectFactory.makeString("experiments/");
        $ic2$ = SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER");
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ANSWER-COUNT"), SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("TOTAL-TIME"), SubLObjectFactory.makeKeyword("PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("PROOF-COUNT"), SubLObjectFactory.makeKeyword("LINK-COUNT"), SubLObjectFactory.makeKeyword("TACTIC-COUNT"), SubLObjectFactory.makeKeyword("REMOVAL-LINK-COUNT"), SubLObjectFactory.makeKeyword("TRANSFORMATION-LINK-COUNT"), SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT"), SubLObjectFactory.makeKeyword("JOIN-ORDERED-LINK-COUNT"), SubLObjectFactory.makeKeyword("JOIN-LINK-COUNT"), SubLObjectFactory.makeKeyword("SPLIT-LINK-COUNT"), SubLObjectFactory.makeKeyword("RESTRICTION-LINK-COUNT"), SubLObjectFactory.makeKeyword("GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NEUTRAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NO-GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NEW-ROOT-COUNT") });
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-QUERIES"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED"), (SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-STORE-PROBLEM-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-STORE-PROOF-COUNT"));
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#33243", "CYC"), SubLObjectFactory.makeSymbol("S#885", "CYC"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("S#33246", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7998", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33417", "CYC")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33247", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33547", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33248", "CYC"), (SubLObject)module0427.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33249", "CYC"), (SubLObject)module0427.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1545", "CYC"), (SubLObject)module0427.ZERO_INTEGER), SubLObjectFactory.makeSymbol("COUNT"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("S#33545", "CYC")) });
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("QUERY-SPEC-SET"), SubLObjectFactory.makeKeyword("FILENAME"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES"), SubLObjectFactory.makeKeyword("METRICS"), SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT"), SubLObjectFactory.makeKeyword("INCREMENTAL"), SubLObjectFactory.makeKeyword("INCLUDE-RESULTS"), SubLObjectFactory.makeKeyword("SKIP"), SubLObjectFactory.makeKeyword("COUNT"), SubLObjectFactory.makeKeyword("DIRECTORY") });
        $ic7$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic8$ = SubLObjectFactory.makeKeyword("QUERY-SPEC-SET");
        $ic9$ = SubLObjectFactory.makeKeyword("FILENAME");
        $ic10$ = SubLObjectFactory.makeKeyword("COMMENT");
        $ic11$ = SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $ic12$ = SubLObjectFactory.makeKeyword("METRICS");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33417", "CYC"));
        $ic14$ = SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT");
        $ic15$ = SubLObjectFactory.makeSymbol("S#33547", "CYC");
        $ic16$ = SubLObjectFactory.makeKeyword("INCREMENTAL");
        $ic17$ = SubLObjectFactory.makeKeyword("INCLUDE-RESULTS");
        $ic18$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic19$ = SubLObjectFactory.makeKeyword("COUNT");
        $ic20$ = SubLObjectFactory.makeKeyword("DIRECTORY");
        $ic21$ = SubLObjectFactory.makeUninternedSymbol("US#2150FF3");
        $ic22$ = SubLObjectFactory.makeUninternedSymbol("US#5E48C75");
        $ic23$ = SubLObjectFactory.makeSymbol("CLET");
        $ic24$ = SubLObjectFactory.makeSymbol("FWHEN");
        $ic25$ = SubLObjectFactory.makeSymbol("S#33418", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#32922", "CYC");
        $ic27$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("KBContentLeviathanQuery"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HALOLeviathanQuery"));
        $ic29$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery"));
        $ic30$ = SubLObjectFactory.makeString("data/haystacks/");
        $ic31$ = SubLObjectFactory.makeString("-haystack-");
        $ic32$ = SubLObjectFactory.makeString(".cfasl");
        $ic33$ = SubLObjectFactory.makeSymbol("S#33434", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#33548", "CYC");
        $ic35$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic36$ = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $ic37$ = SubLObjectFactory.makeString("Loading all haystacks");
        $ic38$ = SubLObjectFactory.makeSymbol("<");
        $ic39$ = SubLObjectFactory.makeSymbol("S#33409", "CYC");
        $ic40$ = SubLObjectFactory.makeString("~%~%Total haystacks:");
        $ic41$ = SubLObjectFactory.makeString("~%~%Interesting haystacks:");
        $ic42$ = SubLObjectFactory.makeSymbol("S#33557", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#33441", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#33549", "CYC");
        $ic45$ = SubLObjectFactory.makeString("data/instantiated-haystacks/");
        $ic46$ = SubLObjectFactory.makeString("Loading all instantiated haystacks");
        $ic47$ = SubLObjectFactory.makeString("~%~%Total instantiated haystacks: ~a");
        $ic48$ = SubLObjectFactory.makeSymbol("S#33558", "CYC");
        $ic49$ = SubLObjectFactory.makeString("~a ");
        $ic50$ = SubLObjectFactory.makeSymbol("S#33450", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#33550", "CYC");
        $ic52$ = SubLObjectFactory.makeString("data/crippled-haystacks/");
        $ic53$ = SubLObjectFactory.makeString("Loading all crippled haystacks");
        $ic54$ = SubLObjectFactory.makeString("~%~%Total crippled haystacks: ~a");
        $ic55$ = SubLObjectFactory.makeString("Reifying all instantiated haystacks");
        $ic56$ = SubLObjectFactory.makeString("Reifying all crippled haystacks");
        $ic57$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic58$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Uncrippled")));
        $ic59$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic60$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Crippled")));
        $ic61$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $ic62$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("softwareParameterValueInSpecification"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferenceMaxTransformationStepsParameter"));
        $ic64$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForArg")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("softwareParameterValueInSpecification")), (SubLObject)module0427.TWO_INTEGER, constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LeaveSomeTermsAtEL")));
        $ic65$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyImplementationMt"));
        $ic66$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferenceAllowedRulesParameter"));
        $ic67$ = SubLObjectFactory.makeString("LeviathanHaystack-");
        $ic68$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic69$ = SubLObjectFactory.makeString("Removing duplicate haystacks");
        $ic70$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic71$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic72$ = SubLObjectFactory.makeString("haystacks-20050425-focused");
        $ic73$ = SubLObjectFactory.makeString("haystacks-20050425-exploratory");
        $ic74$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AutogeneratedHaystackQuery")));
        $ic75$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Uncrippled"));
        $ic76$ = SubLObjectFactory.makeString("deep-queries-with-1-backchain");
        $ic77$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("KBContentLeviathanQuery")));
        $ic78$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("KBContentLeviathanQuery-Training"));
        $ic79$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("KBContentLeviathanQuery-Blind"));
        $ic80$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HALOLeviathanQuery-Training"));
        $ic81$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HALOLeviathanQuery-Blind"));
        $ic82$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Uncrippled-Training"));
        $ic83$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Uncrippled-Blind"));
        $ic84$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Crippled"));
        $ic85$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Crippled-Training"));
        $ic86$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Crippled-Blind"));
        $ic87$ = (SubLFloat)SubLObjectFactory.makeDouble(0.8);
        $ic88$ = SubLObjectFactory.makeString("Oops, off by one error in first-n / last-n");
        $ic89$ = SubLObjectFactory.makeString("could not unassert ~a at Cyc layer");
        $ic90$ = SubLObjectFactory.makeString("could not unassert ~a at HL");
        $ic91$ = SubLObjectFactory.makeString("could not unassert ~a via TMS");
        $ic92$ = SubLObjectFactory.makeString("kb-content-training-justifications-rabbit-hole-20050426");
        $ic93$ = SubLObjectFactory.makeString("Asserting allowed rules for answerable queries");
        $ic94$ = SubLObjectFactory.makeSymbol("S#12732", "CYC");
        $ic95$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheList"));
        $ic96$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LeviathanQuery-Training"));
        $ic97$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic98$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic99$ = SubLObjectFactory.makeKeyword("STACK");
        $ic100$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic101$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic102$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic103$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic104$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic105$ = SubLObjectFactory.makeString("continue anyway");
        $ic106$ = SubLObjectFactory.makeKeyword("WARN");
        $ic107$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic108$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic109$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic110$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic111$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic112$ = SubLObjectFactory.makeSymbol("S#16405", "CYC");
        $ic113$ = SubLObjectFactory.makeString("Gathering all skolem rules");
        $ic114$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic115$ = SubLObjectFactory.makeString("Gathering all negative-utility skolem rules");
        $ic116$ = SubLObjectFactory.makeSymbol("S#30697", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#32068", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT");
        $ic119$ = SubLObjectFactory.makeString("cdolist");
        $ic120$ = SubLObjectFactory.makeString("mapping Cyc rules");
        $ic121$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("skolem"));
        $ic122$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic123$ = SubLObjectFactory.makeString("~A");
        $ic124$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SUCKY-SKOLEM-RULE"), SubLObjectFactory.makeKeyword("NEGATIVE-UTILITY-SKOLEM-RULE"), SubLObjectFactory.makeKeyword("SUCKY-RULE"), SubLObjectFactory.makeKeyword("INERT-SKOLEM-RULE"), SubLObjectFactory.makeKeyword("NEVER-CONSIDERED-FORWARD-SKOLEM-RULE"), SubLObjectFactory.makeKeyword("NEVER-CONSIDERED-BACKWARD-SKOLEM-RULE"), SubLObjectFactory.makeKeyword("INERT-RULE"), SubLObjectFactory.makeKeyword("UNSUCCESSFUL-FORWARD-RULE"), SubLObjectFactory.makeKeyword("UNSUCCESSFUL-BACKWARD-RULE-WITH-DEPENDENTS"), SubLObjectFactory.makeKeyword("SUCCESSFUL-SKOLEM-RULE"), SubLObjectFactory.makeKeyword("BACKWARD-SUCCESSFUL-BACKWARD-RULE"), SubLObjectFactory.makeKeyword("BACKWARD-SUCCESSFUL-FORWARD-RULE"), SubLObjectFactory.makeKeyword("SUCCESSFUL-FORWARD-RULE"), SubLObjectFactory.makeKeyword("OTHER") });
        $ic125$ = SubLObjectFactory.makeKeyword("SUCKY-SKOLEM-RULE");
        $ic126$ = SubLObjectFactory.makeKeyword("NEGATIVE-UTILITY-SKOLEM-RULE");
        $ic127$ = SubLObjectFactory.makeKeyword("INERT-SKOLEM-RULE");
        $ic128$ = SubLObjectFactory.makeKeyword("SUCCESSFUL-SKOLEM-RULE");
        $ic129$ = SubLObjectFactory.makeKeyword("NEVER-CONSIDERED-FORWARD-SKOLEM-RULE");
        $ic130$ = SubLObjectFactory.makeKeyword("NEVER-CONSIDERED-BACKWARD-SKOLEM-RULE");
        $ic131$ = SubLObjectFactory.makeKeyword("INERT-RULE");
        $ic132$ = SubLObjectFactory.makeKeyword("SUCKY-RULE");
        $ic133$ = SubLObjectFactory.makeKeyword("BACKWARD-SUCCESSFUL-FORWARD-RULE");
        $ic134$ = SubLObjectFactory.makeKeyword("BACKWARD-SUCCESSFUL-BACKWARD-RULE");
        $ic135$ = SubLObjectFactory.makeKeyword("SUCCESSFUL-FORWARD-RULE");
        $ic136$ = SubLObjectFactory.makeKeyword("UNSUCCESSFUL-FORWARD-RULE");
        $ic137$ = SubLObjectFactory.makeKeyword("UNSUCCESSFUL-BACKWARD-RULE-WITH-DEPENDENTS");
        $ic138$ = SubLObjectFactory.makeKeyword("OTHER");
        $ic139$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Training"));
        $ic140$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLQuerySpecification"));
        $ic141$ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $ic142$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic143$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferenceConditionalSentenceParameter"));
        $ic144$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic145$ = SubLObjectFactory.makeString("pre-halo-training-rule-bindings-to-closed-20050506");
        $ic146$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED");
        $ic147$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic148$ = SubLObjectFactory.makeSymbol("S#33552", "CYC");
        $ic149$ = SubLObjectFactory.makeString("/cyc/projects/inference/leviathan/data/rule-bindings-to-closed-wff-analysis.cfasl");
        $ic150$ = SubLObjectFactory.makeKeyword("LOGSCALE-Y?");
        $ic151$ = SubLObjectFactory.makeKeyword("YLABEL");
        $ic152$ = SubLObjectFactory.makeKeyword("PLOT-TITLE");
        $ic153$ = SubLObjectFactory.makeString("Answerable vs. Unanswerable ");
        $ic154$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33559", "CYC"));
        $ic155$ = SubLObjectFactory.makeKeyword("TOTAL-ANSWERABLE");
        $ic156$ = SubLObjectFactory.makeString("Oracularly Answerable vs. Unanswerable ");
        $ic157$ = SubLObjectFactory.makeSymbol("S#33555", "CYC");
        $ic158$ = SubLObjectFactory.makeString("halo-queries-with-1-backchain-823-0524");
        $ic159$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HALOLeviathanQuery")));
        $ic160$ = SubLObjectFactory.makeString("Leviathan Training");
        $ic161$ = SubLObjectFactory.makeString(":0");
        $ic162$ = SubLObjectFactory.makeSymbol("S#8004", "CYC");
        $ic163$ = SubLObjectFactory.makeString("~%~%Basic analysis: ~%");
        $ic164$ = SubLObjectFactory.makeString("~%~%Answerable: ~%");
        $ic165$ = SubLObjectFactory.makeString("~%~%Unanswerable: ~%");
        $ic166$ = SubLObjectFactory.makeString("~%~%KB Content: ~%");
        $ic167$ = SubLObjectFactory.makeString("~%~%Autogenerated: ~%");
        $ic168$ = SubLObjectFactory.makeString("~%~%HALO: ~%");
        $ic169$ = SubLObjectFactory.makeString("~%~%Answerable KB Content: ~%");
        $ic170$ = SubLObjectFactory.makeString("~%~%Answerable Autogenerated: ~%");
        $ic171$ = SubLObjectFactory.makeString("~%~%Answerable HALO: ~%");
        $ic172$ = SubLObjectFactory.makeString("~%~%Unanswerable KB Content: ~%");
        $ic173$ = SubLObjectFactory.makeString("~%~%Unanswerable Autogenerated: ~%");
        $ic174$ = SubLObjectFactory.makeString("~%~%Unanswerable HALO: ~%");
        $ic175$ = SubLObjectFactory.makeString("~%~%# of queries answerable in (BASELINE  BOTH  EXPERIMENT): ~%");
        $ic176$ = SubLObjectFactory.makeString("Total:         ~s ~s ~s~%");
        $ic177$ = SubLObjectFactory.makeString("KB Content:    ~s ~s ~s~%");
        $ic178$ = SubLObjectFactory.makeString("Autogenerated: ~s ~s ~s~%");
        $ic179$ = SubLObjectFactory.makeString("HALO:          ~s ~s ~s~%");
        $ic180$ = SubLObjectFactory.makeString("~%~%Key: (BASELINE-VALUE  EXPERIMENT-VALUE  RATIO), times are expressed in seconds.~%");
        $ic181$ = SubLObjectFactory.makeString("~%~%Mutually Answerable: ~%");
        $ic182$ = SubLObjectFactory.makeString("~%~%Mutually Answerable KB Content: ~%");
        $ic183$ = SubLObjectFactory.makeString("~%~%Mutually Answerable Autogenerated: ~%");
        $ic184$ = SubLObjectFactory.makeString("~%~%Mutually Answerable HALO: ~%");
        $ic185$ = SubLObjectFactory.makeKeyword("BOTH");
        $ic186$ = SubLObjectFactory.makeString("Mutually Answerable ");
        $ic187$ = SubLObjectFactory.makeKeyword("BASELINE");
        $ic188$ = SubLObjectFactory.makeString(": ");
        $ic189$ = SubLObjectFactory.makeString(" vs. ");
        $ic190$ = SubLObjectFactory.makeString("\\n");
        $ic191$ = SubLObjectFactory.makeKeyword("XLABEL");
        $ic192$ = SubLObjectFactory.makeString("Sorted Queries");
        $ic193$ = SubLObjectFactory.makeKeyword("BASELINE-KEY-LABEL");
        $ic194$ = SubLObjectFactory.makeKeyword("EXPERIMENT-KEY-LABEL");
        $ic195$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KEY-LOCATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)SubLObjectFactory.makeInteger(100)));
        $ic196$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33425", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33427", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33426", "CYC"));
        $ic197$ = SubLObjectFactory.makeString(" ");
        $ic198$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASSIFICATION-LABELS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("KB Content queries"), (SubLObject)SubLObjectFactory.makeString("Autogenerated queries"), (SubLObject)SubLObjectFactory.makeString("HALO queries")), (SubLObject)SubLObjectFactory.makeKeyword("KEY-LOCATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)SubLObjectFactory.makeInteger(100)));
        $ic199$ = SubLObjectFactory.makeString("time");
        $ic200$ = SubLObjectFactory.makeString("Time (sec)");
        $ic201$ = SubLObjectFactory.makeString("problem");
        $ic202$ = SubLObjectFactory.makeString("# of problems");
        $ic203$ = SubLObjectFactory.makeString("link");
        $ic204$ = SubLObjectFactory.makeString("# of links");
        $ic205$ = SubLObjectFactory.makeString("tactic");
        $ic206$ = SubLObjectFactory.makeString("# of tactics");
        $ic207$ = SubLObjectFactory.makeString("proof");
        $ic208$ = SubLObjectFactory.makeString("# of proofs");
        $ic209$ = SubLObjectFactory.makeString("answer");
        $ic210$ = SubLObjectFactory.makeString("# of answers");
        $ic211$ = SubLObjectFactory.makeString("byte");
        $ic212$ = SubLObjectFactory.makeString("# of bytes");
        $ic213$ = SubLObjectFactory.makeString("");
        $ic214$ = SubLObjectFactory.makeString("training-823-h-queries-0602");
        $ic215$ = SubLObjectFactory.makeKeyword("PROBLEM-QUERIES");
        $ic216$ = SubLObjectFactory.makeKeyword("NEG");
        $ic217$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic218$ = SubLObjectFactory.makeKeyword("POS");
        $ic219$ = SubLObjectFactory.makeSymbol(">");
        $ic220$ = SubLObjectFactory.makeSymbol("CDR");
        $ic221$ = SubLObjectFactory.makeInteger(1000000);
        $ic222$ = SubLObjectFactory.makeSymbol("S#33530", "CYC");
        $ic223$ = SubLObjectFactory.makeKeyword("NEW-ROOT-RELATIVE-TOTAL-TIMES");
        $ic224$ = SubLObjectFactory.makeKeyword("NEW-ROOT-RELATIVE-ANSWER-TIMES");
        $ic225$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic226$ = SubLObjectFactory.makeSymbol("S#32816", "CYC");
        $ic227$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)module0427.T);
        $ic228$ = ConsesLow.list((SubLObject)module0427.ONE_INTEGER);
        $ic229$ = SubLObjectFactory.makeSymbol("*");
        $ic230$ = SubLObjectFactory.makeSymbol("S#26331", "CYC");
        $ic231$ = SubLObjectFactory.makeSymbol("S#15916", "CYC");
        $ic232$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTINUABLE?"), (SubLObject)module0427.T, (SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)module0427.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)module0427.ONE_INTEGER);
        $ic233$ = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $ic234$ = SubLObjectFactory.makeKeyword("TRANS-UNBOUND-PREDICATE-POS");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0427.class
	Total time: 6036 ms
	
	Decompiled with Procyon 0.5.32.
*/
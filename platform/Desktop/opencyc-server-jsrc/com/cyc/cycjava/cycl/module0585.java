package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0585 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0585";
    public static final String myFingerPrint = "4140c1296f0a06991559b41f7d485d9175ebd066ea40cb7a4347ce23539fa3fc";
    public static SubLSymbol $g4446$;
    public static SubLSymbol $g4447$;
    public static SubLSymbol $g4448$;
    public static SubLSymbol $g4449$;
    public static SubLSymbol $g4450$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    
    public static SubLObject f35825(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0585.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0585.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0585.$ic3$, (SubLObject)module0585.$ic4$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0585.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0585.$ic3$, (SubLObject)module0585.$ic6$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0585.$ic7$, (SubLObject)ConsesLow.list((SubLObject)module0585.$ic3$, (SubLObject)module0585.$ic8$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0585.$ic9$, (SubLObject)ConsesLow.list((SubLObject)module0585.$ic3$, (SubLObject)module0585.$ic10$, var5))), ConsesLow.append(var6, (SubLObject)module0585.NIL));
    }
    
    public static SubLObject f35826(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic11$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0585.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic11$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = var4.isCons() ? var4.first() : module0585.$ic12$;
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0585.$ic11$);
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : module0585.$ic13$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0585.$ic11$);
        var4 = var4.rest();
        if (module0585.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)module0585.$ic14$;
            final SubLObject var11 = (SubLObject)module0585.$ic15$;
            final SubLObject var12 = (SubLObject)module0585.$ic16$;
            return (SubLObject)ConsesLow.list((SubLObject)module0585.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.list((SubLObject)module0585.$ic17$, var7)), (SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)module0585.$ic18$, var12)), reader.bq_cons(var11, (SubLObject)module0585.$ic19$)), (SubLObject)ConsesLow.list((SubLObject)module0585.$ic20$, var8, (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic21$, (SubLObject)ConsesLow.list(var6, var12), ConsesLow.append(var9, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0585.$ic22$, var11), (SubLObject)ConsesLow.list((SubLObject)module0585.$ic23$, var11, var10))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0585.$ic11$);
        return (SubLObject)module0585.NIL;
    }
    
    public static SubLObject f35827(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic24$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0585.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic24$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0585.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0585.NIL;
        SubLObject var23_24 = (SubLObject)module0585.NIL;
        while (module0585.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0585.$ic24$);
            var23_24 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0585.$ic24$);
            if (module0585.NIL == conses_high.member(var23_24, (SubLObject)module0585.$ic25$, (SubLObject)module0585.UNPROVIDED, (SubLObject)module0585.UNPROVIDED)) {
                var9 = (SubLObject)module0585.T;
            }
            if (var23_24 == module0585.$ic26$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0585.NIL != var9 && module0585.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0585.$ic24$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0585.$ic27$, var4);
        final SubLObject var11 = (SubLObject)((module0585.NIL != var10) ? conses_high.cadr(var10) : module0585.$ic28$);
        final SubLObject var12;
        var4 = (var12 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0585.$ic21$, reader.bq_cons(var6, (SubLObject)module0585.$ic29$), (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic30$, (SubLObject)ConsesLow.list((SubLObject)module0585.$ic31$, var6, var11), ConsesLow.append(var12, (SubLObject)module0585.NIL)));
    }
    
    public static SubLObject f35828(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic32$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0585.NIL;
        SubLObject var7 = (SubLObject)module0585.NIL;
        SubLObject var8 = (SubLObject)module0585.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic32$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic32$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic32$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0585.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0585.NIL;
        SubLObject var36_37 = (SubLObject)module0585.NIL;
        while (module0585.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0585.$ic32$);
            var36_37 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0585.$ic32$);
            if (module0585.NIL == conses_high.member(var36_37, (SubLObject)module0585.$ic33$, (SubLObject)module0585.UNPROVIDED, (SubLObject)module0585.UNPROVIDED)) {
                var11 = (SubLObject)module0585.T;
            }
            if (var36_37 == module0585.$ic26$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0585.NIL != var11 && module0585.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0585.$ic32$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0585.$ic34$, var4);
        final SubLObject var13 = (SubLObject)((module0585.NIL != var12) ? conses_high.cadr(var12) : module0585.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0585.$ic35$;
        return (SubLObject)ConsesLow.list((SubLObject)module0585.$ic36$, (SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)module0585.$ic37$, var8), var13), (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic38$, (SubLObject)ConsesLow.list(var6, var7), (SubLObject)ConsesLow.list((SubLObject)module0585.$ic39$, (SubLObject)ConsesLow.list((SubLObject)module0585.$ic40$, var15)), ConsesLow.append(var14, (SubLObject)module0585.NIL)));
    }
    
    public static SubLObject f35829(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)module0585.$ic41$, ConsesLow.append(var5, (SubLObject)module0585.NIL));
    }
    
    public static SubLObject f35830() {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        return module0585.$g4446$.getDynamicValue(var43);
    }
    
    public static SubLObject f35831(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)module0585.$ic43$, ConsesLow.append(var5, (SubLObject)module0585.NIL));
    }
    
    public static SubLObject f35832(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)module0585.$ic44$, ConsesLow.append(var5, (SubLObject)module0585.NIL));
    }
    
    public static SubLObject f35833(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)module0585.$ic45$, ConsesLow.append(var5, (SubLObject)module0585.NIL));
    }
    
    public static SubLObject f35834(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0585.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic46$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0585.$ic47$, (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0585.$ic49$, var5), (SubLObject)module0585.$ic50$))), ConsesLow.append(var6, (SubLObject)module0585.NIL));
    }
    
    public static SubLObject f35835(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)module0585.$ic51$, ConsesLow.append(var5, (SubLObject)module0585.NIL));
    }
    
    public static SubLObject f35836(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)module0585.$ic52$, ConsesLow.append(var5, (SubLObject)module0585.NIL));
    }
    
    public static SubLObject f35837(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)module0585.$ic53$, ConsesLow.append(var5, (SubLObject)module0585.NIL));
    }
    
    public static SubLObject f35838(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0585.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic46$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0585.$ic54$, (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0585.$ic49$, var5), (SubLObject)module0585.$ic50$))), ConsesLow.append(var6, (SubLObject)module0585.NIL));
    }
    
    public static SubLObject f35839(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)module0585.$ic55$, ConsesLow.append(var5, (SubLObject)module0585.NIL));
    }
    
    public static SubLObject f35840(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0585.$ic1$, (SubLObject)module0585.$ic56$, (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic57$, (SubLObject)module0585.$ic58$, ConsesLow.append(var5, (SubLObject)module0585.NIL)));
    }
    
    public static SubLObject f35841() {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        return (module0585.NIL != module0034.f1839(module0585.$g4450$.getDynamicValue(var43))) ? Values.values(module0585.$g4450$.getDynamicValue(var43), (SubLObject)module0585.$ic61$) : Values.values(module0034.f1854((SubLObject)module0585.UNPROVIDED, (SubLObject)module0585.UNPROVIDED, (SubLObject)module0585.UNPROVIDED, (SubLObject)module0585.UNPROVIDED), (SubLObject)module0585.$ic62$);
    }
    
    public static SubLObject f35842(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic63$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0585.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0585.$ic63$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0585.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)module0585.$ic64$, (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)module0585.$ic65$, ConsesLow.append(var7, (SubLObject)module0585.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0585.$ic30$, var6, (SubLObject)ConsesLow.listS((SubLObject)module0585.$ic1$, (SubLObject)module0585.$ic66$, ConsesLow.append(var7, (SubLObject)module0585.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0585.$ic63$);
        return (SubLObject)module0585.NIL;
    }
    
    public static SubLObject f35843() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35825", "S#39541");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35826", "S#39542");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35827", "S#39543");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35828", "S#39544");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35829", "S#39545");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0585", "f35830", "S#39546", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35831", "WITH-NL-TRIE-CASE-SENSITIVITY-ON");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35832", "WITH-NL-TRIE-CASE-SENSITIVITY-OFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35833", "S#39547");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35834", "S#39548");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35835", "S#39549");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35836", "S#39550");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35837", "S#39551");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35838", "S#39552");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35839", "S#39553");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35840", "S#39554");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0585", "f35841", "S#39555", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0585", "f35842", "S#39556");
        return (SubLObject)module0585.NIL;
    }
    
    public static SubLObject f35844() {
        module0585.$g4446$ = SubLFiles.defparameter("S#39557", (SubLObject)module0585.NIL);
        module0585.$g4447$ = SubLFiles.defparameter("S#39558", (SubLObject)module0585.$ic42$);
        module0585.$g4448$ = SubLFiles.defparameter("S#39559", (SubLObject)module0585.$ic42$);
        module0585.$g4449$ = SubLFiles.defparameter("S#39560", (SubLObject)module0585.NIL);
        module0585.$g4450$ = SubLFiles.defparameter("S#39561", (SubLObject)module0585.NIL);
        return (SubLObject)module0585.NIL;
    }
    
    public static SubLObject f35845() {
        module0002.f50((SubLObject)module0585.$ic59$, (SubLObject)module0585.$ic60$);
        return (SubLObject)module0585.NIL;
    }
    
    public void declareFunctions() {
        f35843();
    }
    
    public void initializeVariables() {
        f35844();
    }
    
    public void runTopLevelForms() {
        f35845();
    }
    
    static {
        me = (SubLFile)new module0585();
        module0585.$g4446$ = null;
        module0585.$g4447$ = null;
        module0585.$g4448$ = null;
        module0585.$g4449$ = null;
        module0585.$g4450$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39562", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("CLET");
        $ic2$ = SubLObjectFactory.makeSymbol("S#39488", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("MEMBER?");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39488", "CYC"));
        $ic5$ = SubLObjectFactory.makeSymbol("S#39489", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39489", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#39490", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39490", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#39491", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39491", "CYC"));
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39563", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39564", "CYC"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LexicalAffix"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC"), (SubLObject)SubLObjectFactory.makeString("Mapping reified affixes"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LexicalAffix"));
        $ic13$ = SubLObjectFactory.makeString("Mapping reified affixes");
        $ic14$ = SubLObjectFactory.makeUninternedSymbol("US#13E86D7");
        $ic15$ = SubLObjectFactory.makeUninternedSymbol("US#32A3846");
        $ic16$ = SubLObjectFactory.makeUninternedSymbol("US#2009F42");
        $ic17$ = SubLObjectFactory.makeSymbol("ALL-FORT-INSTANCES");
        $ic18$ = SubLObjectFactory.makeSymbol("LENGTH");
        $ic19$ = ConsesLow.list((SubLObject)module0585.ZERO_INTEGER);
        $ic20$ = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic21$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic22$ = SubLObjectFactory.makeSymbol("CINC");
        $ic23$ = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39565", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ANY"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $ic26$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic27$ = SubLObjectFactory.makeKeyword("MT");
        $ic28$ = SubLObjectFactory.makeKeyword("ANY");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#815", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39566", "CYC"))));
        $ic30$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic31$ = SubLObjectFactory.makeSymbol("S#39567", "CYC");
        $ic32$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39568", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39569", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic34$ = SubLObjectFactory.makeKeyword("DONE");
        $ic35$ = SubLObjectFactory.makeUninternedSymbol("US#15690D5");
        $ic36$ = SubLObjectFactory.makeSymbol("CSOME");
        $ic37$ = SubLObjectFactory.makeSymbol("S#39570", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic39$ = SubLObjectFactory.makeSymbol("REST");
        $ic40$ = SubLObjectFactory.makeSymbol("S#14137", "CYC");
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39557", "CYC"), (SubLObject)module0585.T));
        $ic42$ = SubLObjectFactory.makeKeyword("OFF");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39558", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ON")));
        $ic44$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39558", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OFF")));
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39558", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERRED")));
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic47$ = SubLObjectFactory.makeSymbol("S#39558", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("FIF");
        $ic49$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ON"), (SubLObject)SubLObjectFactory.makeKeyword("OFF"));
        $ic51$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39559", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ON")));
        $ic52$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39559", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("OFF")));
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39559", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERRED")));
        $ic54$ = SubLObjectFactory.makeSymbol("S#39559", "CYC");
        $ic55$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39560", "CYC"), (SubLObject)module0585.T));
        $ic56$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7694", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3164", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39561", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-OF"), (SubLObject)SubLObjectFactory.makeSymbol("S#7694", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39555", "CYC")))));
        $ic57$ = SubLObjectFactory.makeSymbol("S#3165", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39561", "CYC"));
        $ic59$ = SubLObjectFactory.makeSymbol("S#39555", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#39554", "CYC");
        $ic61$ = SubLObjectFactory.makeKeyword("REUSED");
        $ic62$ = SubLObjectFactory.makeKeyword("NEW");
        $ic63$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39571", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic64$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39486", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("NEVER")));
        $ic66$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39486", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ONLY")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0585.class
	Total time: 97 ms
	
	Decompiled with Procyon 0.5.32.
*/
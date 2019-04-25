package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0592 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0592";
    public static final String myFingerPrint = "7ea1ca39b6de8d4cc4eec7124f64d32a371347d86de1c53636c09e5add1d1e6d";
    private static SubLSymbol $g4506$;
    private static SubLSymbol $g4507$;
    private static SubLSymbol $g4508$;
    private static SubLSymbol $g4509$;
    private static SubLSymbol $g4510$;
    public static SubLSymbol $g4511$;
    private static SubLSymbol $g4512$;
    private static SubLSymbol $g4514$;
    private static SubLSymbol $g4515$;
    private static SubLSymbol $g4516$;
    private static SubLSymbol $g4517$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
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
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLInteger $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLInteger $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLList $ic61$;
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
    private static final SubLList $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLList $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLList $ic104$;
    private static final SubLList $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLObject $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLObject $ic133$;
    private static final SubLObject $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLObject $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLObject $ic141$;
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
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLList $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLObject $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLObject $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLObject $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLObject $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLObject $ic169$;
    private static final SubLObject $ic170$;
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
    private static final SubLList $ic182$;
    private static final SubLObject $ic183$;
    private static final SubLObject $ic184$;
    private static final SubLObject $ic185$;
    private static final SubLObject $ic186$;
    private static final SubLObject $ic187$;
    private static final SubLObject $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLInteger $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLString $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLInteger $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLString $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLObject $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLObject $ic217$;
    private static final SubLObject $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLList $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLObject $ic226$;
    private static final SubLList $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLObject $ic229$;
    private static final SubLList $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLObject $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLObject $ic242$;
    private static final SubLObject $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLObject $ic246$;
    private static final SubLString $ic247$;
    private static final SubLString $ic248$;
    private static final SubLString $ic249$;
    private static final SubLString $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLString $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLString $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLString $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLList $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLString $ic275$;
    private static final SubLObject $ic276$;
    private static final SubLSymbol $ic277$;
    
    public static SubLObject f36112() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0592.ZERO_INTEGER;
        final SubLObject var3 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0592.$ic1$, var1);
            module0147.$g2095$.bind(module0592.$ic2$, var1);
            SubLObject var5 = module0259.f16848(module0592.$ic4$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
            SubLObject var6 = (SubLObject)module0592.NIL;
            var6 = var5.first();
            while (module0592.NIL != var5) {
                final SubLObject var7 = module0202.f12757(module0220.f14556(var6, module0592.$ic3$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
                if (var7.isSymbol() && module0592.NIL != Symbols.fboundp(var7)) {
                    var2 = Numbers.add(var2, (SubLObject)module0592.ONE_INTEGER);
                }
                var5 = var5.rest();
                var6 = var5.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var4, var1);
            module0147.$g2094$.rebind(var3, var1);
        }
        return var2;
    }
    
    public static SubLObject f36113(final SubLObject var8) {
        return module0035.sublisp_boolean(f36114(var8));
    }
    
    public static SubLObject f36115(final SubLObject var9) {
        final SubLObject var10 = module0331.f22383(var9, (SubLObject)module0592.$ic6$);
        if (var10 == module0592.$ic6$) {
            module0229.f15259();
        }
        return var10;
    }
    
    public static SubLObject f36116(final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0592.NIL == module0035.f2194(var9, Symbols.symbol_function((SubLObject)module0592.EQUAL), (SubLObject)module0592.UNPROVIDED));
    }
    
    public static SubLObject f36117(final SubLObject var12, final SubLObject var13) {
        return f36118(var12, var13, (SubLObject)module0592.T);
    }
    
    public static SubLObject f36119(final SubLObject var12, final SubLObject var13) {
        return f36118(var12, var13, (SubLObject)module0592.NIL);
    }
    
    public static SubLObject f36118(final SubLObject var12, final SubLObject var13, final SubLObject var14) {
        if (!var12.isString() || !var13.isString()) {
            module0229.f15259();
            return (SubLObject)module0592.NIL;
        }
        if (module0592.NIL != var14) {
            return module0035.sublisp_boolean(Strings.stringL(var12, var13, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
        }
        return module0035.sublisp_boolean(Strings.string_lessp(var12, var13, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
    }
    
    public static SubLObject f36120(final SubLObject var15, final SubLObject var16) {
        return f36121(var15, var16, Symbols.symbol_function((SubLObject)module0592.$ic11$));
    }
    
    public static SubLObject f36122(final SubLObject var15, final SubLObject var16) {
        return f36121(var15, var16, Symbols.symbol_function((SubLObject)module0592.$ic13$));
    }
    
    public static SubLObject f36121(final SubLObject var15, final SubLObject var16, final SubLObject var17) {
        if (var15.isString() && var16.isString()) {
            return module0035.sublisp_boolean(Sequences.search(var15, var16, var17, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
        }
        if (module0592.NIL != module0208.f13542(var15) && module0592.NIL != module0208.f13542(var16)) {
            final SubLObject var18 = Equality.eql(var17, Symbols.symbol_function((SubLObject)module0592.$ic11$));
            return module0208.f13543(var15, var16, var18);
        }
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36123(final SubLObject var18, final SubLObject var16) {
        if (!var16.isString() || !var18.isString()) {
            module0229.f15259();
        }
        return module0038.f2684(var16, var18);
    }
    
    public static SubLObject f36124(final SubLObject var19, final SubLObject var16) {
        if (!var19.isString() || !var16.isString()) {
            module0229.f15259();
        }
        return module0038.f2673(var16, var19, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36125(final SubLObject var20, final SubLObject var16) {
        if (!var20.isString() || !var16.isString()) {
            module0229.f15259();
        }
        return module0035.sublisp_boolean(module0038.f2759(var20, var16, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
    }
    
    public static SubLObject f36126(final SubLObject var21) {
        final SubLObject var22 = module0205.f13277(var21, (SubLObject)module0592.UNPROVIDED);
        if (var22.isString()) {
            final SubLObject var23 = constants_high_oc.f10737(var22);
            if (module0592.NIL != var23) {
                return var23;
            }
            Errors.error((SubLObject)module0592.$ic18$, var22);
        }
        Errors.error((SubLObject)module0592.$ic19$, var22);
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36127() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0592.ZERO_INTEGER;
        final SubLObject var3 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0592.$ic1$, var1);
            module0147.$g2095$.bind(module0592.$ic2$, var1);
            SubLObject var5 = module0259.f16848(module0592.$ic21$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
            SubLObject var6 = (SubLObject)module0592.NIL;
            var6 = var5.first();
            while (module0592.NIL != var5) {
                final SubLObject var7 = module0202.f12757(module0220.f14556(var6, module0592.$ic3$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
                if (var7.isSymbol() && module0592.NIL != Symbols.fboundp(var7)) {
                    var2 = Numbers.add(var2, (SubLObject)module0592.ONE_INTEGER);
                }
                var5 = var5.rest();
                var6 = var5.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var4, var1);
            module0147.$g2094$.rebind(var3, var1);
        }
        return var2;
    }
    
    public static SubLObject f36114(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = module0497.f32177(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        var9.resetMultipleValues();
        if (module0592.NIL == var11) {
            module0229.f15259();
        }
        return var10;
    }
    
    public static SubLObject f36128(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        return Strings.string_upcase(var16, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36129(final SubLObject var16) {
        return f36128(var16);
    }
    
    public static SubLObject f36130(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        return Strings.string_downcase(var16, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36131(final SubLObject var16, final SubLObject var25, final SubLObject var26) {
        if (module0592.NIL == module0208.f13542(var16)) {
            module0229.f15259();
        }
        else if (var26.numG(f36132(var16)) || var25.numL((SubLObject)module0592.ZERO_INTEGER) || var25.numG(var26)) {
            module0229.f15259();
        }
        else {
            if (var16.isString()) {
                return module0038.f2623(var16, var25, var26);
            }
            if (module0592.NIL != module0208.f13537(var16, (SubLObject)module0592.UNPROVIDED)) {
                return module0208.f13546(var16, var25, var26);
            }
            module0229.f15259();
        }
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36133(final SubLObject var27) {
        if (module0592.NIL == var27 || module0592.NIL != module0035.find_if_not(Symbols.symbol_function((SubLObject)module0592.$ic28$), var27, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
            module0229.f15259();
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)module0592.$ic29$), var27);
    }
    
    public static SubLObject f36134(final SubLObject var27) {
        if (module0592.NIL == module0202.f12671(var27)) {
            module0229.f15259();
        }
        else if (module0592.NIL != module0035.find_if_not(Symbols.symbol_function((SubLObject)module0592.$ic28$), module0202.f12751(var27), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
            module0229.f15259();
        }
        else {
            if (module0592.NIL == var27) {
                return (SubLObject)module0592.$ic31$;
            }
            SubLObject var28 = (SubLObject)module0592.$ic31$;
            SubLObject var29 = conses_high.butlast(module0202.f12751(var27), (SubLObject)module0592.UNPROVIDED);
            SubLObject var30 = (SubLObject)module0592.NIL;
            var30 = var29.first();
            while (module0592.NIL != var29) {
                var28 = Sequences.cconcatenate(var28, new SubLObject[] { var30, module0592.$ic32$ });
                var29 = var29.rest();
                var30 = var29.first();
            }
            return Sequences.cconcatenate(var28, conses_high.last(var27, (SubLObject)module0592.UNPROVIDED).first());
        }
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36135(final SubLObject var28, final SubLObject var29) {
        if (!var28.isString() || !var29.isString()) {
            module0229.f15259();
        }
        return module0038.f2674(var28, var29, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36136(final SubLObject var16, final SubLObject var15, final SubLObject var30) {
        if (var16.isString() && module0592.NIL != module0038.f2611(var15) && var30.isString()) {
            return module0038.f2659(var30, var15, var16, (SubLObject)module0592.UNPROVIDED);
        }
        if (module0592.NIL != f36137(var16) && (module0592.NIL != module0038.f2611(var15) || (module0592.NIL != module0208.f13537(var15, (SubLObject)module0592.UNPROVIDED) && module0592.NIL != module0038.f2611(module0205.f13277(var15, (SubLObject)module0592.UNPROVIDED)))) && module0592.NIL != f36137(var30)) {
            final SubLObject var31 = module0037.f2569(module0209.f13554(var30), module0209.f13554(var15), module0209.f13554(var16), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
            return (module0592.NIL != Sequences.find((SubLObject)module0592.$ic35$, var31, Symbols.symbol_function((SubLObject)module0592.$ic36$), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) ? module0208.f13538(module0039.f3001(var31)) : module0039.f3001(var31);
        }
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36137(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0592.NIL != module0039.f3006(var32) || module0592.NIL != module0208.f13537(var32, (SubLObject)module0592.UNPROVIDED));
    }
    
    public static SubLObject f36138(final SubLObject var33, final SubLObject var34, final SubLObject var35) {
        if (module0592.NIL == module0173.f10955(var33) || module0592.NIL == module0173.f10955(var34) || module0592.NIL == module0173.f10955(var35)) {
            module0229.f15259();
        }
        return module0732.f44913(var33, var34, var35);
    }
    
    public static SubLObject f36139(final SubLObject var36) {
        if (module0592.NIL == module0173.f10955(var36) && module0592.NIL == module0603.f36877(var36)) {
            module0229.f15259();
        }
        return module0202.f12787(module0764.f48461(var36, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED), (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36140(final SubLObject var28, final SubLObject var29) {
        if (!var28.isString() || !var29.isString()) {
            module0229.f15259();
        }
        return module0038.f2667(var28, var29);
    }
    
    public static SubLObject f36141(final SubLObject var28, final SubLObject var29) {
        if (!var28.isString() || !var29.isString()) {
            module0229.f15259();
        }
        return module0038.f2621(var28, var29, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36142(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        return module0038.f2735(var16);
    }
    
    public static SubLObject f36143(final SubLObject var28, final SubLObject var29) {
        if (!var28.isString() || !var29.isString()) {
            module0229.f15259();
        }
        return Sequences.search(var28, var29, Symbols.symbol_function((SubLObject)module0592.EQUALP), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36132(final SubLObject var37) {
        if (var37.isString()) {
            return Sequences.length(var37);
        }
        if (module0592.NIL != module0208.f13537(var37, (SubLObject)module0592.UNPROVIDED)) {
            return Sequences.length(module0039.f3000(module0205.f13277(var37, (SubLObject)module0592.UNPROVIDED)));
        }
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36144(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        final SubLObject var17 = reader.read_from_string_ignoring_errors(module0038.f2667(var16, (SubLObject)module0592.$ic45$), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
        if (var17.isInteger()) {
            return var17;
        }
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36145(final SubLObject var38) {
        if (!var38.isInteger()) {
            module0229.f15259();
        }
        return print_high.princ_to_string(var38);
    }
    
    public static SubLObject f36146(final SubLObject var32) {
        return print_high.princ_to_string(var32);
    }
    
    public static SubLObject f36147(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        final SubLObject var17 = reader.read_from_string_ignoring_errors(module0038.f2667(var16, (SubLObject)module0592.$ic45$), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
        if (module0592.NIL != module0552.f34074(var17)) {
            return var17;
        }
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36148(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (module0592.NIL == module0552.f34074(var39)) {
            module0229.f15259();
        }
        SubLObject var41 = (SubLObject)module0592.NIL;
        final SubLObject var42 = reader.$read_default_float_format$.currentBinding(var40);
        try {
            reader.$read_default_float_format$.bind((SubLObject)module0592.$ic50$, var40);
            var41 = print_high.princ_to_string(var39);
        }
        finally {
            reader.$read_default_float_format$.rebind(var42, var40);
        }
        return var41;
    }
    
    public static SubLObject f36149() {
        return module0592.$g4507$.getGlobalValue();
    }
    
    public static SubLObject f36150(final SubLObject var40, final SubLObject var41) {
        if (module0592.NIL == module0208.f13542(var40) || module0592.NIL == module0202.f12674(var41)) {
            module0229.f15259();
        }
        final SubLObject var42 = module0208.f13537(var40, (SubLObject)module0592.UNPROVIDED);
        final SubLObject var43 = (module0592.NIL != var42) ? module0205.f13277(var40, (SubLObject)module0592.UNPROVIDED) : var40;
        final SubLObject var44 = module0038.f2738(var43, module0202.f12751(var41), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
        SubLObject var45 = (SubLObject)module0592.NIL;
        SubLObject var46 = var44;
        SubLObject var47 = (SubLObject)module0592.NIL;
        var47 = var46.first();
        while (module0592.NIL != var46) {
            var45 = (SubLObject)ConsesLow.cons((module0592.NIL != var42) ? module0208.f13540(var47) : var47, var45);
            var46 = var46.rest();
            var47 = var46.first();
        }
        if (module0592.NIL != module0035.f2002(var45, f36149(), (SubLObject)module0592.UNPROVIDED)) {
            module0229.f15259();
        }
        return module0202.f12787(Sequences.nreverse(var45), (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36151(final SubLObject var46, final SubLObject var47) {
        if (module0592.NIL == module0209.f13550(var46) || module0592.NIL == module0004.f106(var47)) {
            module0229.f15259();
        }
        final SubLObject var48 = module0209.f13554(var46);
        return Vectors.aref(var48, var47);
    }
    
    public static SubLObject f36152(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        return module0589.f35898(var16, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36153(final SubLObject var49, final SubLObject var50, final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)module0592.NIL;
        try {
            var52.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var54 = Errors.$error_handler$.currentBinding(var52);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var52);
                try {
                    SubLObject var55 = (SubLObject)module0592.NIL;
                    var55 = module0612.f37494(var51);
                    var52.resetMultipleValues();
                    final SubLObject var56 = module0589.f35940(f36154(var49));
                    final SubLObject var57 = var52.secondMultipleValue();
                    final SubLObject var58 = var52.thirdMultipleValue();
                    var52.resetMultipleValues();
                    final SubLObject var59 = module0591.f36105(var56, var58, var50, var55, var57, (SubLObject)module0592.UNPROVIDED);
                    if (var59.isString()) {
                        return var59;
                    }
                }
                catch (Throwable var60) {
                    Errors.handleThrowable(var60, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var54, var52);
            }
        }
        catch (Throwable var61) {
            var53 = Errors.handleThrowable(var61, module0003.$g3$.getGlobalValue());
        }
        finally {
            var52.throwStack.pop();
        }
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36155(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        return module0589.f35872(var16);
    }
    
    public static SubLObject f36156(final SubLObject var60, final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (!var60.isString() || module0592.NIL == module0202.f12674(var61)) {
            module0229.f15259();
        }
        SubLObject var63 = (SubLObject)module0592.NIL;
        SubLObject var64 = (SubLObject)module0592.NIL;
        try {
            var62.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var65 = Errors.$error_handler$.currentBinding(var62);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var62);
                try {
                    final SubLObject var67;
                    final SubLObject var66 = var67 = f36157(var61);
                    SubLObject var68 = (SubLObject)module0592.NIL;
                    SubLObject var69 = var67;
                    SubLObject var70 = (SubLObject)module0592.NIL;
                    SubLObject var68_69 = (SubLObject)module0592.NIL;
                    while (module0592.NIL != var69) {
                        cdestructuring_bind.destructuring_bind_must_consp(var69, var66, (SubLObject)module0592.$ic60$);
                        var68_69 = var69.first();
                        var69 = var69.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var69, var66, (SubLObject)module0592.$ic60$);
                        if (module0592.NIL == conses_high.member(var68_69, (SubLObject)module0592.$ic61$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
                            var70 = (SubLObject)module0592.T;
                        }
                        if (var68_69 == module0592.$ic62$) {
                            var68 = var69.first();
                        }
                        var69 = var69.rest();
                    }
                    if (module0592.NIL != var70 && module0592.NIL == var68) {
                        cdestructuring_bind.cdestructuring_bind_error(var66, (SubLObject)module0592.$ic60$);
                    }
                    final SubLObject var71 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic63$, var67);
                    final SubLObject var72 = (SubLObject)((module0592.NIL != var71) ? conses_high.cadr(var71) : module0592.NIL);
                    final SubLObject var73 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic64$, var67);
                    final SubLObject var74 = (SubLObject)((module0592.NIL != var73) ? conses_high.cadr(var73) : module0592.NIL);
                    final SubLObject var75 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic65$, var67);
                    final SubLObject var76 = (SubLObject)((module0592.NIL != var75) ? conses_high.cadr(var75) : module0592.NIL);
                    final SubLObject var77 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic66$, var67);
                    final SubLObject var78 = (SubLObject)((module0592.NIL != var77) ? conses_high.cadr(var77) : module0592.NIL);
                    final SubLObject var79 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic67$, var67);
                    final SubLObject var80 = (SubLObject)((module0592.NIL != var79) ? conses_high.cadr(var79) : module0592.NIL);
                    final SubLObject var81 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic68$, var67);
                    final SubLObject var82 = (SubLObject)((module0592.NIL != var81) ? conses_high.cadr(var81) : module0592.NIL);
                    final SubLObject var83 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic69$, var67);
                    final SubLObject var84 = (SubLObject)((module0592.NIL != var83) ? conses_high.cadr(var83) : module0592.NIL);
                    final SubLObject var85 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic70$, var67);
                    final SubLObject var86 = (SubLObject)((module0592.NIL != var85) ? conses_high.cadr(var85) : module0592.NIL);
                    SubLObject var87 = (SubLObject)module0592.NIL;
                    try {
                        var87 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_87 = module0015.$g131$.currentBinding(var62);
                        try {
                            module0015.$g131$.bind(var87, var62);
                            module0642.f39020(module0015.$g431$.getGlobalValue());
                            module0642.f39020(module0015.$g440$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            module0642.f39020(var60);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            if (module0592.NIL != var72) {
                                module0642.f39020(module0015.$g157$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var72);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var74) {
                                module0642.f39020(module0015.$g158$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var74);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var76) {
                                module0642.f39046(module0015.$g434$.getGlobalValue());
                            }
                            if (module0592.NIL != var78) {
                                module0642.f39020(module0015.$g435$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var78);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var80) {
                                module0642.f39020(module0015.$g436$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var80);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var82) {
                                module0642.f39020(module0015.$g437$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var82);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var84) {
                                module0642.f39020(module0015.$g438$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(module0642.f39049(var84));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var86) {
                                module0642.f39020(module0015.$g439$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var86);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                            final SubLObject var3_88 = module0015.$g533$.currentBinding(var62);
                            try {
                                module0015.$g533$.bind((SubLObject)module0592.T, var62);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_88, var62);
                            }
                            module0642.f39020(module0015.$g432$.getGlobalValue());
                        }
                        finally {
                            module0015.$g131$.rebind(var3_87, var62);
                        }
                        var63 = streams_high.get_output_stream_string(var87);
                    }
                    finally {
                        final SubLObject var3_89 = Threads.$is_thread_performing_cleanupP$.currentBinding(var62);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0592.T, var62);
                            streams_high.close(var87, (SubLObject)module0592.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_89, var62);
                        }
                    }
                }
                catch (Throwable var88) {
                    Errors.handleThrowable(var88, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var65, var62);
            }
        }
        catch (Throwable var89) {
            var64 = Errors.handleThrowable(var89, module0003.$g3$.getGlobalValue());
        }
        finally {
            var62.throwStack.pop();
        }
        if (module0592.NIL != var64) {
            module0229.f15259();
        }
        return var63;
    }
    
    public static SubLObject f36157(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        SubLObject var63 = (SubLObject)module0592.NIL;
        SubLObject var64 = module0202.f12751(var61);
        SubLObject var65 = (SubLObject)module0592.NIL;
        var65 = var64.first();
        while (module0592.NIL != var64) {
            var62.resetMultipleValues();
            final SubLObject var66 = f36158(var65);
            final SubLObject var67 = var62.secondMultipleValue();
            var62.resetMultipleValues();
            var63 = conses_high.putf(var63, var66, var67);
            var64 = var64.rest();
            var65 = var64.first();
        }
        return var63;
    }
    
    public static SubLObject f36159(final SubLObject var61, final SubLObject var93) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        if (!var93.isString() || module0592.NIL == module0202.f12674(var61)) {
            module0229.f15259();
        }
        SubLObject var95 = (SubLObject)module0592.NIL;
        SubLObject var96 = (SubLObject)module0592.NIL;
        try {
            var94.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var97 = Errors.$error_handler$.currentBinding(var94);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var94);
                try {
                    final SubLObject var99;
                    final SubLObject var98 = var99 = f36160(var61);
                    SubLObject var100 = (SubLObject)module0592.NIL;
                    SubLObject var101 = var99;
                    SubLObject var102 = (SubLObject)module0592.NIL;
                    SubLObject var99_100 = (SubLObject)module0592.NIL;
                    while (module0592.NIL != var101) {
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)module0592.$ic72$);
                        var99_100 = var101.first();
                        var101 = var101.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)module0592.$ic72$);
                        if (module0592.NIL == conses_high.member(var99_100, (SubLObject)module0592.$ic73$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
                            var102 = (SubLObject)module0592.T;
                        }
                        if (var99_100 == module0592.$ic62$) {
                            var100 = var101.first();
                        }
                        var101 = var101.rest();
                    }
                    if (module0592.NIL != var102 && module0592.NIL == var100) {
                        cdestructuring_bind.cdestructuring_bind_error(var98, (SubLObject)module0592.$ic72$);
                    }
                    final SubLObject var103 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic74$, var99);
                    final SubLObject var104 = (SubLObject)((module0592.NIL != var103) ? conses_high.cadr(var103) : module0592.NIL);
                    final SubLObject var105 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic75$, var99);
                    final SubLObject var106 = (SubLObject)((module0592.NIL != var105) ? conses_high.cadr(var105) : module0592.NIL);
                    final SubLObject var107 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic76$, var99);
                    final SubLObject var108 = (SubLObject)((module0592.NIL != var107) ? conses_high.cadr(var107) : module0592.NIL);
                    final SubLObject var109 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic69$, var99);
                    final SubLObject var110 = (SubLObject)((module0592.NIL != var109) ? conses_high.cadr(var109) : module0592.NIL);
                    final SubLObject var111 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic77$, var99);
                    final SubLObject var112 = (SubLObject)((module0592.NIL != var111) ? conses_high.cadr(var111) : module0592.NIL);
                    final SubLObject var113 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic78$, var99);
                    final SubLObject var114 = (SubLObject)((module0592.NIL != var113) ? conses_high.cadr(var113) : module0592.NIL);
                    final SubLObject var115 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic67$, var99);
                    final SubLObject var116 = (SubLObject)((module0592.NIL != var115) ? conses_high.cadr(var115) : module0592.NIL);
                    final SubLObject var117 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic66$, var99);
                    final SubLObject var118 = (SubLObject)((module0592.NIL != var117) ? conses_high.cadr(var117) : module0592.NIL);
                    final SubLObject var119 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic63$, var99);
                    final SubLObject var120 = (SubLObject)((module0592.NIL != var119) ? conses_high.cadr(var119) : module0592.NIL);
                    SubLObject var121 = (SubLObject)module0592.NIL;
                    try {
                        var121 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_115 = module0015.$g131$.currentBinding(var94);
                        try {
                            module0015.$g131$.bind(var121, var94);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (module0592.NIL != var120) {
                                module0642.f39020(module0015.$g157$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var120);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var104) {
                                module0642.f39046(module0015.$g369$.getGlobalValue());
                            }
                            if (module0592.NIL != var106) {
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var106);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var108) {
                                module0642.f39020(module0015.$g372$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var108);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var110) {
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(module0642.f39049(var110));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var112) {
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(module0642.f39049(var112));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var114) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var114);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var116) {
                                module0642.f39020(module0015.$g375$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var116);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var118) {
                                module0642.f39020(module0015.$g376$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var118);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                            final SubLObject var3_116 = module0015.$g533$.currentBinding(var94);
                            final SubLObject var122 = module0015.$g533$.currentBinding(var94);
                            try {
                                module0015.$g533$.bind((SubLObject)module0592.T, var94);
                                module0015.$g533$.bind((SubLObject)module0592.NIL, var94);
                                module0642.f39019(var93);
                            }
                            finally {
                                module0015.$g533$.rebind(var122, var94);
                                module0015.$g533$.rebind(var3_116, var94);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g131$.rebind(var3_115, var94);
                        }
                        var95 = streams_high.get_output_stream_string(var121);
                    }
                    finally {
                        final SubLObject var3_117 = Threads.$is_thread_performing_cleanupP$.currentBinding(var94);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0592.T, var94);
                            streams_high.close(var121, (SubLObject)module0592.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_117, var94);
                        }
                    }
                }
                catch (Throwable var123) {
                    Errors.handleThrowable(var123, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var97, var94);
            }
        }
        catch (Throwable var124) {
            var96 = Errors.handleThrowable(var124, module0003.$g3$.getGlobalValue());
        }
        finally {
            var94.throwStack.pop();
        }
        if (module0592.NIL != var96) {
            module0229.f15259();
        }
        return var95;
    }
    
    public static SubLObject f36161(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0592.NIL;
        SubLObject var12 = (SubLObject)module0592.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)module0592.$ic80$);
        var11 = var9.first();
        final SubLObject var13 = var12 = var9.rest();
        if (!var12.isCons() || module0592.NIL == module0202.f12674(var11)) {
            module0229.f15259();
        }
        SubLObject var14 = (SubLObject)module0592.NIL;
        SubLObject var15 = (SubLObject)module0592.NIL;
        try {
            var10.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var16 = Errors.$error_handler$.currentBinding(var10);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var10);
                try {
                    final SubLObject var122_123;
                    final SubLObject var120_121 = var122_123 = f36160(var11);
                    SubLObject var17 = (SubLObject)module0592.NIL;
                    SubLObject var18 = var122_123;
                    SubLObject var19 = (SubLObject)module0592.NIL;
                    SubLObject var127_128 = (SubLObject)module0592.NIL;
                    while (module0592.NIL != var18) {
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var120_121, (SubLObject)module0592.$ic72$);
                        var127_128 = var18.first();
                        var18 = var18.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var120_121, (SubLObject)module0592.$ic72$);
                        if (module0592.NIL == conses_high.member(var127_128, (SubLObject)module0592.$ic73$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
                            var19 = (SubLObject)module0592.T;
                        }
                        if (var127_128 == module0592.$ic62$) {
                            var17 = var18.first();
                        }
                        var18 = var18.rest();
                    }
                    if (module0592.NIL != var19 && module0592.NIL == var17) {
                        cdestructuring_bind.cdestructuring_bind_error(var120_121, (SubLObject)module0592.$ic72$);
                    }
                    final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic74$, var122_123);
                    final SubLObject var21 = (SubLObject)((module0592.NIL != var20) ? conses_high.cadr(var20) : module0592.NIL);
                    final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic75$, var122_123);
                    final SubLObject var23 = (SubLObject)((module0592.NIL != var22) ? conses_high.cadr(var22) : module0592.NIL);
                    final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic76$, var122_123);
                    final SubLObject var25 = (SubLObject)((module0592.NIL != var24) ? conses_high.cadr(var24) : module0592.NIL);
                    final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic69$, var122_123);
                    final SubLObject var27 = (SubLObject)((module0592.NIL != var26) ? conses_high.cadr(var26) : module0592.NIL);
                    final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic77$, var122_123);
                    final SubLObject var29 = (SubLObject)((module0592.NIL != var28) ? conses_high.cadr(var28) : module0592.NIL);
                    final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic78$, var122_123);
                    final SubLObject var31 = (SubLObject)((module0592.NIL != var30) ? conses_high.cadr(var30) : module0592.NIL);
                    final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic67$, var122_123);
                    final SubLObject var33 = (SubLObject)((module0592.NIL != var32) ? conses_high.cadr(var32) : module0592.NIL);
                    final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic66$, var122_123);
                    final SubLObject var35 = (SubLObject)((module0592.NIL != var34) ? conses_high.cadr(var34) : module0592.NIL);
                    final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic63$, var122_123);
                    final SubLObject var37 = (SubLObject)((module0592.NIL != var36) ? conses_high.cadr(var36) : module0592.NIL);
                    SubLObject var38 = (SubLObject)module0592.NIL;
                    try {
                        var38 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_138 = module0015.$g131$.currentBinding(var10);
                        try {
                            module0015.$g131$.bind(var38, var10);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (module0592.NIL != var37) {
                                module0642.f39020(module0015.$g157$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var37);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var21) {
                                module0642.f39046(module0015.$g369$.getGlobalValue());
                            }
                            if (module0592.NIL != var23) {
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var23);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var25) {
                                module0642.f39020(module0015.$g372$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var25);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var27) {
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(module0642.f39049(var27));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var29) {
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(module0642.f39049(var29));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var31) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var31);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var33) {
                                module0642.f39020(module0015.$g375$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var33);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var35) {
                                module0642.f39020(module0015.$g376$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var35);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                            final SubLObject var3_139 = module0015.$g533$.currentBinding(var10);
                            final SubLObject var39 = module0015.$g533$.currentBinding(var10);
                            try {
                                module0015.$g533$.bind((SubLObject)module0592.T, var10);
                                module0015.$g533$.bind((SubLObject)module0592.NIL, var10);
                                SubLObject var40 = var12;
                                SubLObject var41 = (SubLObject)module0592.NIL;
                                var41 = var40.first();
                                while (module0592.NIL != var40) {
                                    module0642.f39019(var41);
                                    var40 = var40.rest();
                                    var41 = var40.first();
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var39, var10);
                                module0015.$g533$.rebind(var3_139, var10);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g131$.rebind(var3_138, var10);
                        }
                        var14 = streams_high.get_output_stream_string(var38);
                    }
                    finally {
                        final SubLObject var3_140 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0592.T, var10);
                            streams_high.close(var38, (SubLObject)module0592.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_140, var10);
                        }
                    }
                }
                catch (Throwable var42) {
                    Errors.handleThrowable(var42, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var16, var10);
            }
        }
        catch (Throwable var43) {
            var15 = Errors.handleThrowable(var43, module0003.$g3$.getGlobalValue());
        }
        finally {
            var10.throwStack.pop();
        }
        if (module0592.NIL != var15) {
            module0229.f15259();
        }
        return var14;
    }
    
    public static SubLObject f36160(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        SubLObject var63 = (SubLObject)module0592.NIL;
        SubLObject var64 = module0202.f12751(var61);
        SubLObject var65 = (SubLObject)module0592.NIL;
        var65 = var64.first();
        while (module0592.NIL != var64) {
            var62.resetMultipleValues();
            final SubLObject var66 = f36158(var65);
            final SubLObject var67 = var62.secondMultipleValue();
            var62.resetMultipleValues();
            var63 = conses_high.putf(var63, var66, var67);
            var64 = var64.rest();
            var65 = var64.first();
        }
        return var63;
    }
    
    public static SubLObject f36162(final SubLObject var61, final SubLObject var93) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        if (!var93.isString() || module0592.NIL == module0202.f12674(var61)) {
            module0229.f15259();
        }
        SubLObject var95 = (SubLObject)module0592.NIL;
        SubLObject var96 = (SubLObject)module0592.NIL;
        try {
            var94.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var97 = Errors.$error_handler$.currentBinding(var94);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var94);
                try {
                    final SubLObject var99;
                    final SubLObject var98 = var99 = f36163(var61);
                    SubLObject var100 = (SubLObject)module0592.NIL;
                    SubLObject var101 = var99;
                    SubLObject var102 = (SubLObject)module0592.NIL;
                    SubLObject var146_147 = (SubLObject)module0592.NIL;
                    while (module0592.NIL != var101) {
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)module0592.$ic82$);
                        var146_147 = var101.first();
                        var101 = var101.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)module0592.$ic82$);
                        if (module0592.NIL == conses_high.member(var146_147, (SubLObject)module0592.$ic83$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
                            var102 = (SubLObject)module0592.T;
                        }
                        if (var146_147 == module0592.$ic62$) {
                            var100 = var101.first();
                        }
                        var101 = var101.rest();
                    }
                    if (module0592.NIL != var102 && module0592.NIL == var100) {
                        cdestructuring_bind.cdestructuring_bind_error(var98, (SubLObject)module0592.$ic82$);
                    }
                    final SubLObject var103 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic69$, var99);
                    final SubLObject var104 = (SubLObject)((module0592.NIL != var103) ? conses_high.cadr(var103) : module0592.NIL);
                    final SubLObject var105 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic77$, var99);
                    final SubLObject var106 = (SubLObject)((module0592.NIL != var105) ? conses_high.cadr(var105) : module0592.NIL);
                    final SubLObject var107 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic78$, var99);
                    final SubLObject var108 = (SubLObject)((module0592.NIL != var107) ? conses_high.cadr(var107) : module0592.NIL);
                    final SubLObject var109 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic66$, var99);
                    final SubLObject var110 = (SubLObject)((module0592.NIL != var109) ? conses_high.cadr(var109) : module0592.NIL);
                    SubLObject var111 = (SubLObject)module0592.NIL;
                    try {
                        var111 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_152 = module0015.$g131$.currentBinding(var94);
                        try {
                            module0015.$g131$.bind(var111, var94);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            if (module0592.NIL != var104) {
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var104);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var106) {
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(module0642.f39049(var106));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var110) {
                                module0642.f39020(module0015.$g367$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var110);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var108) {
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var108);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                            final SubLObject var3_153 = module0015.$g533$.currentBinding(var94);
                            final SubLObject var112 = module0015.$g533$.currentBinding(var94);
                            try {
                                module0015.$g533$.bind((SubLObject)module0592.T, var94);
                                module0015.$g533$.bind((SubLObject)module0592.NIL, var94);
                                module0642.f39019(var93);
                            }
                            finally {
                                module0015.$g533$.rebind(var112, var94);
                                module0015.$g533$.rebind(var3_153, var94);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0592.UNPROVIDED);
                        }
                        finally {
                            module0015.$g131$.rebind(var3_152, var94);
                        }
                        var95 = streams_high.get_output_stream_string(var111);
                    }
                    finally {
                        final SubLObject var3_154 = Threads.$is_thread_performing_cleanupP$.currentBinding(var94);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0592.T, var94);
                            streams_high.close(var111, (SubLObject)module0592.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_154, var94);
                        }
                    }
                }
                catch (Throwable var113) {
                    Errors.handleThrowable(var113, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var97, var94);
            }
        }
        catch (Throwable var114) {
            var96 = Errors.handleThrowable(var114, module0003.$g3$.getGlobalValue());
        }
        finally {
            var94.throwStack.pop();
        }
        if (module0592.NIL != var96) {
            module0229.f15259();
        }
        return var95;
    }
    
    public static SubLObject f36164(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0592.NIL;
        SubLObject var12 = (SubLObject)module0592.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)module0592.$ic85$);
        var11 = var9.first();
        final SubLObject var13 = var12 = var9.rest();
        if (!var12.isCons() || module0592.NIL == module0202.f12674(var11)) {
            module0229.f15259();
        }
        SubLObject var14 = (SubLObject)module0592.NIL;
        SubLObject var15 = (SubLObject)module0592.NIL;
        try {
            var10.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var16 = Errors.$error_handler$.currentBinding(var10);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var10);
                try {
                    final SubLObject var160_161;
                    final SubLObject var158_159 = var160_161 = f36163(var11);
                    SubLObject var17 = (SubLObject)module0592.NIL;
                    SubLObject var18 = var160_161;
                    SubLObject var19 = (SubLObject)module0592.NIL;
                    SubLObject var165_166 = (SubLObject)module0592.NIL;
                    while (module0592.NIL != var18) {
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var158_159, (SubLObject)module0592.$ic82$);
                        var165_166 = var18.first();
                        var18 = var18.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var158_159, (SubLObject)module0592.$ic82$);
                        if (module0592.NIL == conses_high.member(var165_166, (SubLObject)module0592.$ic83$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
                            var19 = (SubLObject)module0592.T;
                        }
                        if (var165_166 == module0592.$ic62$) {
                            var17 = var18.first();
                        }
                        var18 = var18.rest();
                    }
                    if (module0592.NIL != var19 && module0592.NIL == var17) {
                        cdestructuring_bind.cdestructuring_bind_error(var158_159, (SubLObject)module0592.$ic82$);
                    }
                    final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic69$, var160_161);
                    final SubLObject var21 = (SubLObject)((module0592.NIL != var20) ? conses_high.cadr(var20) : module0592.NIL);
                    final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic77$, var160_161);
                    final SubLObject var23 = (SubLObject)((module0592.NIL != var22) ? conses_high.cadr(var22) : module0592.NIL);
                    final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic78$, var160_161);
                    final SubLObject var25 = (SubLObject)((module0592.NIL != var24) ? conses_high.cadr(var24) : module0592.NIL);
                    final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic66$, var160_161);
                    final SubLObject var27 = (SubLObject)((module0592.NIL != var26) ? conses_high.cadr(var26) : module0592.NIL);
                    SubLObject var28 = (SubLObject)module0592.NIL;
                    try {
                        var28 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_171 = module0015.$g131$.currentBinding(var10);
                        try {
                            module0015.$g131$.bind(var28, var10);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            if (module0592.NIL != var21) {
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var21);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var23) {
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(module0642.f39049(var23));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var27) {
                                module0642.f39020(module0015.$g367$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var27);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var25) {
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var25);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                            final SubLObject var3_172 = module0015.$g533$.currentBinding(var10);
                            final SubLObject var29 = module0015.$g533$.currentBinding(var10);
                            try {
                                module0015.$g533$.bind((SubLObject)module0592.T, var10);
                                module0015.$g533$.bind((SubLObject)module0592.NIL, var10);
                                SubLObject var30 = var12;
                                SubLObject var173_174 = (SubLObject)module0592.NIL;
                                var173_174 = var30.first();
                                while (module0592.NIL != var30) {
                                    module0642.f39019(var173_174);
                                    var30 = var30.rest();
                                    var173_174 = var30.first();
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var29, var10);
                                module0015.$g533$.rebind(var3_172, var10);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0592.UNPROVIDED);
                        }
                        finally {
                            module0015.$g131$.rebind(var3_171, var10);
                        }
                        var14 = streams_high.get_output_stream_string(var28);
                    }
                    finally {
                        final SubLObject var3_173 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0592.T, var10);
                            streams_high.close(var28, (SubLObject)module0592.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_173, var10);
                        }
                    }
                }
                catch (Throwable var31) {
                    Errors.handleThrowable(var31, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var16, var10);
            }
        }
        catch (Throwable var32) {
            var15 = Errors.handleThrowable(var32, module0003.$g3$.getGlobalValue());
        }
        finally {
            var10.throwStack.pop();
        }
        if (module0592.NIL != var15) {
            module0229.f15259();
        }
        return var14;
    }
    
    public static SubLObject f36163(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        SubLObject var63 = (SubLObject)module0592.NIL;
        SubLObject var64 = module0202.f12751(var61);
        SubLObject var65 = (SubLObject)module0592.NIL;
        var65 = var64.first();
        while (module0592.NIL != var64) {
            var62.resetMultipleValues();
            final SubLObject var66 = f36158(var65);
            final SubLObject var67 = var62.secondMultipleValue();
            var62.resetMultipleValues();
            var63 = conses_high.putf(var63, var66, var67);
            var64 = var64.rest();
            var65 = var64.first();
        }
        return var63;
    }
    
    public static SubLObject f36165(final SubLObject var61, final SubLObject var93) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        if (!var93.isString() || module0592.NIL == module0202.f12674(var61)) {
            module0229.f15259();
        }
        SubLObject var95 = (SubLObject)module0592.NIL;
        SubLObject var96 = (SubLObject)module0592.NIL;
        try {
            var94.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var97 = Errors.$error_handler$.currentBinding(var94);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var94);
                try {
                    final SubLObject var99;
                    final SubLObject var98 = var99 = f36166(var61);
                    SubLObject var100 = (SubLObject)module0592.NIL;
                    SubLObject var101 = var99;
                    SubLObject var102 = (SubLObject)module0592.NIL;
                    SubLObject var181_182 = (SubLObject)module0592.NIL;
                    while (module0592.NIL != var101) {
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)module0592.$ic87$);
                        var181_182 = var101.first();
                        var101 = var101.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)module0592.$ic87$);
                        if (module0592.NIL == conses_high.member(var181_182, (SubLObject)module0592.$ic88$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
                            var102 = (SubLObject)module0592.T;
                        }
                        if (var181_182 == module0592.$ic62$) {
                            var100 = var101.first();
                        }
                        var101 = var101.rest();
                    }
                    if (module0592.NIL != var102 && module0592.NIL == var100) {
                        cdestructuring_bind.cdestructuring_bind_error(var98, (SubLObject)module0592.$ic87$);
                    }
                    final SubLObject var103 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic89$, var99);
                    final SubLObject var104 = (SubLObject)((module0592.NIL != var103) ? conses_high.cadr(var103) : module0592.NIL);
                    final SubLObject var105 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic74$, var99);
                    final SubLObject var106 = (SubLObject)((module0592.NIL != var105) ? conses_high.cadr(var105) : module0592.NIL);
                    final SubLObject var107 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic69$, var99);
                    final SubLObject var108 = (SubLObject)((module0592.NIL != var107) ? conses_high.cadr(var107) : module0592.NIL);
                    final SubLObject var109 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic70$, var99);
                    final SubLObject var110 = (SubLObject)((module0592.NIL != var109) ? conses_high.cadr(var109) : module0592.NIL);
                    final SubLObject var111 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic90$, var99);
                    final SubLObject var112 = (SubLObject)((module0592.NIL != var111) ? conses_high.cadr(var111) : module0592.NIL);
                    final SubLObject var113 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic91$, var99);
                    final SubLObject var114 = (SubLObject)((module0592.NIL != var113) ? conses_high.cadr(var113) : module0592.NIL);
                    final SubLObject var115 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic92$, var99);
                    final SubLObject var116 = (SubLObject)((module0592.NIL != var115) ? conses_high.cadr(var115) : module0592.NIL);
                    final SubLObject var117 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic93$, var99);
                    final SubLObject var118 = (SubLObject)((module0592.NIL != var117) ? conses_high.cadr(var117) : module0592.NIL);
                    final SubLObject var119 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic78$, var99);
                    final SubLObject var120 = (SubLObject)((module0592.NIL != var119) ? conses_high.cadr(var119) : module0592.NIL);
                    final SubLObject var121 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic67$, var99);
                    final SubLObject var122 = (SubLObject)((module0592.NIL != var121) ? conses_high.cadr(var121) : module0592.NIL);
                    final SubLObject var123 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic94$, var99);
                    final SubLObject var124 = (SubLObject)((module0592.NIL != var123) ? conses_high.cadr(var123) : module0592.NIL);
                    SubLObject var125 = (SubLObject)module0592.NIL;
                    try {
                        var125 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_200 = module0015.$g131$.currentBinding(var94);
                        try {
                            module0015.$g131$.bind(var125, var94);
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            if (module0592.NIL != var104) {
                                module0642.f39046(module0015.$g348$.getGlobalValue());
                            }
                            if (module0592.NIL != var106) {
                                module0642.f39046(module0015.$g349$.getGlobalValue());
                            }
                            if (module0592.NIL != var108) {
                                module0642.f39020(module0015.$g351$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(module0642.f39049(var108));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var110) {
                                module0642.f39020(module0015.$g352$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var110);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var112) {
                                module0642.f39020(module0015.$g353$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var112);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var114) {
                                module0642.f39020(module0015.$g354$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var114);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var116) {
                                module0642.f39020(module0015.$g355$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var116);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var118) {
                                module0642.f39020(module0015.$g356$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var118);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var120) {
                                module0642.f39020(module0015.$g357$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var120);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var122) {
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var122);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var124) {
                                module0642.f39020(module0015.$g359$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var124);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                            final SubLObject var3_201 = module0015.$g533$.currentBinding(var94);
                            final SubLObject var126 = module0015.$g533$.currentBinding(var94);
                            try {
                                module0015.$g533$.bind((SubLObject)module0592.T, var94);
                                module0015.$g533$.bind((SubLObject)module0592.NIL, var94);
                                module0642.f39019(var93);
                            }
                            finally {
                                module0015.$g533$.rebind(var126, var94);
                                module0015.$g533$.rebind(var3_201, var94);
                            }
                            module0642.f39020(module0015.$g347$.getGlobalValue());
                        }
                        finally {
                            module0015.$g131$.rebind(var3_200, var94);
                        }
                        var95 = streams_high.get_output_stream_string(var125);
                    }
                    finally {
                        final SubLObject var3_202 = Threads.$is_thread_performing_cleanupP$.currentBinding(var94);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0592.T, var94);
                            streams_high.close(var125, (SubLObject)module0592.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_202, var94);
                        }
                    }
                }
                catch (Throwable var127) {
                    Errors.handleThrowable(var127, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var97, var94);
            }
        }
        catch (Throwable var128) {
            var96 = Errors.handleThrowable(var128, module0003.$g3$.getGlobalValue());
        }
        finally {
            var94.throwStack.pop();
        }
        if (module0592.NIL != var96) {
            module0229.f15259();
        }
        return var95;
    }
    
    public static SubLObject f36167(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0592.NIL;
        SubLObject var12 = (SubLObject)module0592.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)module0592.$ic80$);
        var11 = var9.first();
        final SubLObject var13 = var12 = var9.rest();
        if (!var12.isCons() || module0592.NIL == module0202.f12674(var11)) {
            module0229.f15259();
        }
        SubLObject var14 = (SubLObject)module0592.NIL;
        SubLObject var15 = (SubLObject)module0592.NIL;
        try {
            var10.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var16 = Errors.$error_handler$.currentBinding(var10);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var10);
                try {
                    final SubLObject var207_208;
                    final SubLObject var205_206 = var207_208 = f36166(var11);
                    SubLObject var17 = (SubLObject)module0592.NIL;
                    SubLObject var18 = var207_208;
                    SubLObject var19 = (SubLObject)module0592.NIL;
                    SubLObject var212_213 = (SubLObject)module0592.NIL;
                    while (module0592.NIL != var18) {
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var205_206, (SubLObject)module0592.$ic87$);
                        var212_213 = var18.first();
                        var18 = var18.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var205_206, (SubLObject)module0592.$ic87$);
                        if (module0592.NIL == conses_high.member(var212_213, (SubLObject)module0592.$ic88$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
                            var19 = (SubLObject)module0592.T;
                        }
                        if (var212_213 == module0592.$ic62$) {
                            var17 = var18.first();
                        }
                        var18 = var18.rest();
                    }
                    if (module0592.NIL != var19 && module0592.NIL == var17) {
                        cdestructuring_bind.cdestructuring_bind_error(var205_206, (SubLObject)module0592.$ic87$);
                    }
                    final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic89$, var207_208);
                    final SubLObject var21 = (SubLObject)((module0592.NIL != var20) ? conses_high.cadr(var20) : module0592.NIL);
                    final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic74$, var207_208);
                    final SubLObject var23 = (SubLObject)((module0592.NIL != var22) ? conses_high.cadr(var22) : module0592.NIL);
                    final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic69$, var207_208);
                    final SubLObject var25 = (SubLObject)((module0592.NIL != var24) ? conses_high.cadr(var24) : module0592.NIL);
                    final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic70$, var207_208);
                    final SubLObject var27 = (SubLObject)((module0592.NIL != var26) ? conses_high.cadr(var26) : module0592.NIL);
                    final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic90$, var207_208);
                    final SubLObject var29 = (SubLObject)((module0592.NIL != var28) ? conses_high.cadr(var28) : module0592.NIL);
                    final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic91$, var207_208);
                    final SubLObject var31 = (SubLObject)((module0592.NIL != var30) ? conses_high.cadr(var30) : module0592.NIL);
                    final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic92$, var207_208);
                    final SubLObject var33 = (SubLObject)((module0592.NIL != var32) ? conses_high.cadr(var32) : module0592.NIL);
                    final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic93$, var207_208);
                    final SubLObject var35 = (SubLObject)((module0592.NIL != var34) ? conses_high.cadr(var34) : module0592.NIL);
                    final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic78$, var207_208);
                    final SubLObject var37 = (SubLObject)((module0592.NIL != var36) ? conses_high.cadr(var36) : module0592.NIL);
                    final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic67$, var207_208);
                    final SubLObject var39 = (SubLObject)((module0592.NIL != var38) ? conses_high.cadr(var38) : module0592.NIL);
                    final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic94$, var207_208);
                    final SubLObject var41 = (SubLObject)((module0592.NIL != var40) ? conses_high.cadr(var40) : module0592.NIL);
                    SubLObject var42 = (SubLObject)module0592.NIL;
                    try {
                        var42 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_225 = module0015.$g131$.currentBinding(var10);
                        try {
                            module0015.$g131$.bind(var42, var10);
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            if (module0592.NIL != var21) {
                                module0642.f39046(module0015.$g348$.getGlobalValue());
                            }
                            if (module0592.NIL != var23) {
                                module0642.f39046(module0015.$g349$.getGlobalValue());
                            }
                            if (module0592.NIL != var25) {
                                module0642.f39020(module0015.$g351$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(module0642.f39049(var25));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var27) {
                                module0642.f39020(module0015.$g352$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var27);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var29) {
                                module0642.f39020(module0015.$g353$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var29);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var31) {
                                module0642.f39020(module0015.$g354$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var31);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var33) {
                                module0642.f39020(module0015.$g355$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var33);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var35) {
                                module0642.f39020(module0015.$g356$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var35);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var37) {
                                module0642.f39020(module0015.$g357$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var37);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var39) {
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var39);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            if (module0592.NIL != var41) {
                                module0642.f39020(module0015.$g359$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var41);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                            final SubLObject var3_226 = module0015.$g533$.currentBinding(var10);
                            final SubLObject var43 = module0015.$g533$.currentBinding(var10);
                            try {
                                module0015.$g533$.bind((SubLObject)module0592.T, var10);
                                module0015.$g533$.bind((SubLObject)module0592.NIL, var10);
                                SubLObject var44 = var12;
                                SubLObject var45 = (SubLObject)module0592.NIL;
                                var45 = var44.first();
                                while (module0592.NIL != var44) {
                                    module0642.f39019(var45);
                                    var44 = var44.rest();
                                    var45 = var44.first();
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var43, var10);
                                module0015.$g533$.rebind(var3_226, var10);
                            }
                            module0642.f39020(module0015.$g347$.getGlobalValue());
                        }
                        finally {
                            module0015.$g131$.rebind(var3_225, var10);
                        }
                        var14 = streams_high.get_output_stream_string(var42);
                    }
                    finally {
                        final SubLObject var3_227 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0592.T, var10);
                            streams_high.close(var42, (SubLObject)module0592.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_227, var10);
                        }
                    }
                }
                catch (Throwable var46) {
                    Errors.handleThrowable(var46, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var16, var10);
            }
        }
        catch (Throwable var47) {
            var15 = Errors.handleThrowable(var47, module0003.$g3$.getGlobalValue());
        }
        finally {
            var10.throwStack.pop();
        }
        if (module0592.NIL != var15) {
            module0229.f15259();
        }
        return var14;
    }
    
    public static SubLObject f36166(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        SubLObject var63 = (SubLObject)module0592.NIL;
        SubLObject var64 = module0202.f12751(var61);
        SubLObject var65 = (SubLObject)module0592.NIL;
        var65 = var64.first();
        while (module0592.NIL != var64) {
            var62.resetMultipleValues();
            final SubLObject var66 = f36158(var65);
            final SubLObject var67 = var62.secondMultipleValue();
            var62.resetMultipleValues();
            var63 = conses_high.putf(var63, var66, var67);
            var64 = var64.rest();
            var65 = var64.first();
        }
        return var63;
    }
    
    public static SubLObject f36168(final SubLObject var61, final SubLObject var93) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        if (!var93.isString() || module0592.NIL == module0202.f12674(var61)) {
            module0229.f15259();
        }
        SubLObject var95 = (SubLObject)module0592.NIL;
        SubLObject var96 = (SubLObject)module0592.NIL;
        try {
            var94.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var97 = Errors.$error_handler$.currentBinding(var94);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var94);
                try {
                    final SubLObject var99;
                    final SubLObject var98 = var99 = f36169(var61);
                    SubLObject var100 = (SubLObject)module0592.NIL;
                    SubLObject var101 = var99;
                    SubLObject var102 = (SubLObject)module0592.NIL;
                    SubLObject var234_235 = (SubLObject)module0592.NIL;
                    while (module0592.NIL != var101) {
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)module0592.$ic97$);
                        var234_235 = var101.first();
                        var101 = var101.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var101, var98, (SubLObject)module0592.$ic97$);
                        if (module0592.NIL == conses_high.member(var234_235, (SubLObject)module0592.$ic98$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
                            var102 = (SubLObject)module0592.T;
                        }
                        if (var234_235 == module0592.$ic62$) {
                            var100 = var101.first();
                        }
                        var101 = var101.rest();
                    }
                    if (module0592.NIL != var102 && module0592.NIL == var100) {
                        cdestructuring_bind.cdestructuring_bind_error(var98, (SubLObject)module0592.$ic97$);
                    }
                    final SubLObject var103 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic63$, var99);
                    final SubLObject var104 = (SubLObject)((module0592.NIL != var103) ? conses_high.cadr(var103) : module0592.NIL);
                    final SubLObject var105 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic64$, var99);
                    final SubLObject var106 = (SubLObject)((module0592.NIL != var105) ? conses_high.cadr(var105) : module0592.NIL);
                    final SubLObject var107 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic99$, var99);
                    final SubLObject var108 = (SubLObject)((module0592.NIL != var107) ? conses_high.cadr(var107) : module0592.NIL);
                    final SubLObject var109 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic100$, var99);
                    final SubLObject var110 = (SubLObject)((module0592.NIL != var109) ? conses_high.cadr(var109) : module0592.NIL);
                    SubLObject var111 = (SubLObject)module0592.NIL;
                    try {
                        var111 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_242 = module0015.$g131$.currentBinding(var94);
                        try {
                            module0015.$g131$.bind(var111, var94);
                            if (module0592.NIL != var108 && module0592.NIL != var110) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (module0592.NIL != var104) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var104);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                if (module0592.NIL != var106) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var106);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                module0642.f39020(module0015.$g147$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var108);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(module0015.$g148$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var110);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                                final SubLObject var3_243 = module0015.$g533$.currentBinding(var94);
                                final SubLObject var112 = module0015.$g533$.currentBinding(var94);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0592.T, var94);
                                    module0015.$g533$.bind((SubLObject)module0592.NIL, var94);
                                    module0642.f39019(var93);
                                }
                                finally {
                                    module0015.$g533$.rebind(var112, var94);
                                    module0015.$g533$.rebind(var3_243, var94);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                            else if (module0592.NIL != var108) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (module0592.NIL != var104) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var104);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                if (module0592.NIL != var106) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var106);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                module0642.f39020(module0015.$g147$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var108);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                                final SubLObject var3_244 = module0015.$g533$.currentBinding(var94);
                                final SubLObject var112 = module0015.$g533$.currentBinding(var94);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0592.T, var94);
                                    module0015.$g533$.bind((SubLObject)module0592.NIL, var94);
                                    module0642.f39019(var93);
                                }
                                finally {
                                    module0015.$g533$.rebind(var112, var94);
                                    module0015.$g533$.rebind(var3_244, var94);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                            else if (module0592.NIL != var110) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (module0592.NIL != var104) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var104);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                if (module0592.NIL != var106) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var106);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                module0642.f39020(module0015.$g148$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var110);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                                final SubLObject var3_245 = module0015.$g533$.currentBinding(var94);
                                final SubLObject var112 = module0015.$g533$.currentBinding(var94);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0592.T, var94);
                                    module0015.$g533$.bind((SubLObject)module0592.NIL, var94);
                                    module0642.f39019(var93);
                                }
                                finally {
                                    module0015.$g533$.rebind(var112, var94);
                                    module0015.$g533$.rebind(var3_245, var94);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                            else {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (module0592.NIL != var104) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var104);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                if (module0592.NIL != var106) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var106);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                                final SubLObject var3_246 = module0015.$g533$.currentBinding(var94);
                                final SubLObject var112 = module0015.$g533$.currentBinding(var94);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0592.T, var94);
                                    module0015.$g533$.bind((SubLObject)module0592.NIL, var94);
                                    module0642.f39019(var93);
                                }
                                finally {
                                    module0015.$g533$.rebind(var112, var94);
                                    module0015.$g533$.rebind(var3_246, var94);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                        }
                        finally {
                            module0015.$g131$.rebind(var3_242, var94);
                        }
                        var95 = streams_high.get_output_stream_string(var111);
                    }
                    finally {
                        final SubLObject var3_247 = Threads.$is_thread_performing_cleanupP$.currentBinding(var94);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0592.T, var94);
                            streams_high.close(var111, (SubLObject)module0592.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_247, var94);
                        }
                    }
                }
                catch (Throwable var113) {
                    Errors.handleThrowable(var113, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var97, var94);
            }
        }
        catch (Throwable var114) {
            var96 = Errors.handleThrowable(var114, module0003.$g3$.getGlobalValue());
        }
        finally {
            var94.throwStack.pop();
        }
        if (module0592.NIL != var96) {
            module0229.f15259();
        }
        return var95;
    }
    
    public static SubLObject f36170(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0592.NIL;
        SubLObject var12 = (SubLObject)module0592.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)module0592.$ic80$);
        var11 = var9.first();
        final SubLObject var13 = var12 = var9.rest();
        if (!var12.isCons() || module0592.NIL == module0202.f12674(var11)) {
            module0229.f15259();
        }
        SubLObject var14 = (SubLObject)module0592.NIL;
        SubLObject var15 = (SubLObject)module0592.NIL;
        try {
            var10.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var16 = Errors.$error_handler$.currentBinding(var10);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var10);
                try {
                    final SubLObject var252_253;
                    final SubLObject var250_251 = var252_253 = f36169(var11);
                    SubLObject var17 = (SubLObject)module0592.NIL;
                    SubLObject var18 = var252_253;
                    SubLObject var19 = (SubLObject)module0592.NIL;
                    SubLObject var257_258 = (SubLObject)module0592.NIL;
                    while (module0592.NIL != var18) {
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var250_251, (SubLObject)module0592.$ic97$);
                        var257_258 = var18.first();
                        var18 = var18.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var250_251, (SubLObject)module0592.$ic97$);
                        if (module0592.NIL == conses_high.member(var257_258, (SubLObject)module0592.$ic98$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
                            var19 = (SubLObject)module0592.T;
                        }
                        if (var257_258 == module0592.$ic62$) {
                            var17 = var18.first();
                        }
                        var18 = var18.rest();
                    }
                    if (module0592.NIL != var19 && module0592.NIL == var17) {
                        cdestructuring_bind.cdestructuring_bind_error(var250_251, (SubLObject)module0592.$ic97$);
                    }
                    final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic63$, var252_253);
                    final SubLObject var21 = (SubLObject)((module0592.NIL != var20) ? conses_high.cadr(var20) : module0592.NIL);
                    final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic64$, var252_253);
                    final SubLObject var23 = (SubLObject)((module0592.NIL != var22) ? conses_high.cadr(var22) : module0592.NIL);
                    final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic99$, var252_253);
                    final SubLObject var25 = (SubLObject)((module0592.NIL != var24) ? conses_high.cadr(var24) : module0592.NIL);
                    final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)module0592.$ic100$, var252_253);
                    final SubLObject var27 = (SubLObject)((module0592.NIL != var26) ? conses_high.cadr(var26) : module0592.NIL);
                    SubLObject var28 = (SubLObject)module0592.NIL;
                    try {
                        var28 = streams_high.make_private_string_output_stream();
                        final SubLObject var3_263 = module0015.$g131$.currentBinding(var10);
                        try {
                            module0015.$g131$.bind(var28, var10);
                            if (module0592.NIL != var25 && module0592.NIL != var27) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (module0592.NIL != var21) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var21);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                if (module0592.NIL != var23) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var23);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                module0642.f39020(module0015.$g147$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var25);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(module0015.$g148$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var27);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                                final SubLObject var3_264 = module0015.$g533$.currentBinding(var10);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0592.T, var10);
                                    f36171(var12);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_264, var10);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                            else if (module0592.NIL != var25) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (module0592.NIL != var21) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var21);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                if (module0592.NIL != var23) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var23);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                module0642.f39020(module0015.$g147$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var25);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                                final SubLObject var3_265 = module0015.$g533$.currentBinding(var10);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0592.T, var10);
                                    f36171(var12);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_265, var10);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                            else if (module0592.NIL != var27) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (module0592.NIL != var21) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var21);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                if (module0592.NIL != var23) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var23);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                module0642.f39020(module0015.$g148$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39020(var27);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                                final SubLObject var3_266 = module0015.$g533$.currentBinding(var10);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0592.T, var10);
                                    f36171(var12);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_266, var10);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                            else {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                if (module0592.NIL != var21) {
                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var21);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                if (module0592.NIL != var23) {
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                    module0642.f39020(var23);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0592.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0592.UNPROVIDED);
                                final SubLObject var3_267 = module0015.$g533$.currentBinding(var10);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0592.T, var10);
                                    f36171(var12);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_267, var10);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                        }
                        finally {
                            module0015.$g131$.rebind(var3_263, var10);
                        }
                        var14 = streams_high.get_output_stream_string(var28);
                    }
                    finally {
                        final SubLObject var3_268 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0592.T, var10);
                            streams_high.close(var28, (SubLObject)module0592.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_268, var10);
                        }
                    }
                }
                catch (Throwable var29) {
                    Errors.handleThrowable(var29, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var16, var10);
            }
        }
        catch (Throwable var30) {
            var15 = Errors.handleThrowable(var30, module0003.$g3$.getGlobalValue());
        }
        finally {
            var10.throwStack.pop();
        }
        if (module0592.NIL != var15) {
            module0229.f15259();
        }
        return var14;
    }
    
    public static SubLObject f36171(final SubLObject var93) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        final SubLObject var95 = module0015.$g533$.currentBinding(var94);
        try {
            module0015.$g533$.bind((SubLObject)module0592.NIL, var94);
            SubLObject var96 = var93;
            SubLObject var97 = (SubLObject)module0592.NIL;
            var97 = var96.first();
            while (module0592.NIL != var96) {
                module0642.f39019(var97);
                var96 = var96.rest();
                var97 = var96.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var95, var94);
        }
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36169(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        SubLObject var63 = (SubLObject)module0592.NIL;
        SubLObject var64 = module0202.f12751(var61);
        SubLObject var65 = (SubLObject)module0592.NIL;
        var65 = var64.first();
        while (module0592.NIL != var64) {
            var62.resetMultipleValues();
            final SubLObject var66 = f36158(var65);
            final SubLObject var67 = var62.secondMultipleValue();
            var62.resetMultipleValues();
            var63 = conses_high.putf(var63, var66, var67);
            var64 = var64.rest();
            var65 = var64.first();
        }
        return var63;
    }
    
    public static SubLObject f36158(final SubLObject var91) {
        SubLObject var93;
        final SubLObject var92 = var93 = module0202.f12751(var91);
        SubLObject var94 = (SubLObject)module0592.NIL;
        SubLObject var95 = (SubLObject)module0592.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var93, var92, (SubLObject)module0592.$ic103$);
        var94 = var93.first();
        var93 = var93.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var93, var92, (SubLObject)module0592.$ic103$);
        var95 = var93.first();
        var93 = var93.rest();
        if (module0592.NIL != var93) {
            cdestructuring_bind.cdestructuring_bind_error(var92, (SubLObject)module0592.$ic103$);
            return (SubLObject)module0592.NIL;
        }
        if (module0592.NIL != module0062.f4492(var94, (SubLObject)module0592.$ic104$)) {
            return Values.values(module0205.f13277(var94, (SubLObject)module0592.UNPROVIDED), var95);
        }
        return Values.values(f36172(var94), f36173(var95));
    }
    
    public static SubLObject f36172(final SubLObject var271) {
        final SubLObject var272 = (SubLObject)((module0592.NIL != module0173.f10955(var271)) ? module0594.f36343(var271) : module0592.NIL);
        if (!var272.isKeyword()) {
            module0229.f15259();
        }
        return var272;
    }
    
    public static SubLObject f36173(final SubLObject var272) {
        if (module0592.NIL != module0062.f4492((SubLObject)module0592.$ic105$, var272)) {
            return Sequences.cconcatenate(module0006.f207(module0205.f13277(var272, (SubLObject)module0592.UNPROVIDED)), (SubLObject)module0592.$ic106$);
        }
        if (module0592.NIL != module0202.f12674(var272)) {
            return module0038.f2761(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0592.$ic107$), module0202.f12751(var272)), (SubLObject)module0592.UNPROVIDED);
        }
        return var272;
    }
    
    public static SubLObject f36174(final SubLObject var274, final SubLObject var275) {
        final SubLThread var276 = SubLProcess.currentSubLThread();
        SubLObject var277 = (SubLObject)module0592.NIL;
        SubLObject var278 = (SubLObject)module0592.NIL;
        try {
            var276.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var279 = Errors.$error_handler$.currentBinding(var276);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var276);
                try {
                    var277 = module0589.f35913(f36154(var274), f36154(var275));
                }
                catch (Throwable var280) {
                    Errors.handleThrowable(var280, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var279, var276);
            }
        }
        catch (Throwable var281) {
            var278 = Errors.handleThrowable(var281, module0003.$g3$.getGlobalValue());
        }
        finally {
            var276.throwStack.pop();
        }
        if (module0592.NIL != var278 || !var277.isString()) {
            module0229.f15259();
        }
        return module0202.f12643(module0592.$ic108$, var277);
    }
    
    public static SubLObject f36154(final SubLObject var49) {
        if (var49.isString()) {
            return var49;
        }
        if (module0205.f13276(var49).eql(module0592.$ic108$)) {
            return module0205.f13277(var49, (SubLObject)module0592.UNPROVIDED);
        }
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36175(final SubLObject var277) {
        if (module0592.NIL == var277) {
            module0229.f15259();
        }
        final SubLObject var278 = Strings.string_left_trim((SubLObject)module0592.$ic110$, Strings.string_right_trim((SubLObject)module0592.$ic111$, var277));
        return module0699.f42602(module0702.f42814(var278, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
    }
    
    public static SubLObject f36176(final SubLObject var36) {
        if (module0592.NIL == var36) {
            module0229.f15259();
        }
        return module0712.f43671(var36, (SubLObject)module0592.NIL, (SubLObject)module0592.T, (SubLObject)module0592.NIL);
    }
    
    public static SubLObject f36177(final SubLObject var36) {
        if (module0592.NIL == var36) {
            module0229.f15259();
            return (SubLObject)module0592.NIL;
        }
        if (module0592.NIL != f36178(var36)) {
            return module0205.f13277(var36, (SubLObject)module0592.UNPROVIDED);
        }
        return module0712.f43671(var36, (SubLObject)module0592.NIL, (SubLObject)module0592.T, (SubLObject)module0592.NIL);
    }
    
    public static SubLObject f36178(final SubLObject var36) {
        return module0205.f13373(var36, module0592.$ic115$);
    }
    
    public static SubLObject f36179(final SubLObject var16) {
        if (var16.isString()) {
            return module0642.f39135(var16, module0038.$g916$.getGlobalValue());
        }
        if (module0592.NIL != module0208.f13537(var16, (SubLObject)module0592.UNPROVIDED)) {
            return module0208.f13540(module0642.f39135(module0205.f13277(var16, (SubLObject)module0592.UNPROVIDED), module0038.$g916$.getGlobalValue()));
        }
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36180(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        return module0038.f2773(var16);
    }
    
    public static SubLObject f36181(final SubLObject var16) {
        if (!var16.isString()) {
            module0229.f15259();
        }
        return module0038.f2775(var16);
    }
    
    public static SubLObject f36182(final SubLObject var47, final SubLObject var279) {
        if (module0592.NIL == module0202.f12932(var279) || !var47.isInteger() || var47.isNegative()) {
            module0229.f15259();
        }
        if (var279.isCons()) {
            if (!var47.numL(module0202.f12728(var279, (SubLObject)module0592.UNPROVIDED))) {
                module0229.f15259();
            }
            return module0205.f13134(var279, var47, (SubLObject)module0592.UNPROVIDED);
        }
        if (module0592.NIL != module0167.f10813(var279)) {
            return f36182(var47, module0172.f10915(var279));
        }
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36183(final SubLObject var279) {
        if (module0592.NIL == module0202.f12932(var279)) {
            module0229.f15259();
        }
        final SubLObject var280 = conses_high.copy_list(module0205.f13207(var279, (SubLObject)module0592.UNPROVIDED));
        return reader.bq_cons(module0592.$ic120$, ConsesLow.append(var280, (SubLObject)module0592.NIL));
    }
    
    public static SubLObject f36184(final SubLObject var279) {
        if (module0592.NIL == module0202.f12932(var279)) {
            module0229.f15259();
        }
        final SubLObject var280 = module0205.f13207(var279, (SubLObject)module0592.UNPROVIDED);
        final SubLObject var281 = Sequences.reverse(Sequences.delete_duplicates(Sequences.reverse(var280), Symbols.symbol_function((SubLObject)module0592.EQUAL), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
        return reader.bq_cons(module0592.$ic122$, ConsesLow.append(var281, (SubLObject)module0592.NIL));
    }
    
    public static SubLObject f36185(final SubLObject var279) {
        if (module0592.NIL == module0206.f13470(var279)) {
            module0229.f15259();
        }
        final SubLObject var280 = module0285.f18933(var279, (SubLObject)module0592.UNPROVIDED);
        return f36186(var280);
    }
    
    public static SubLObject f36186(final SubLObject var279) {
        if (module0592.NIL == module0205.f13336(var279)) {
            module0229.f15259();
        }
        return module0202.f12725(var279, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36187(final SubLObject var32) {
        return Equality.identity(var32);
    }
    
    public static SubLObject f36188(final SubLObject var282) {
        return f36189(var282, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36189(final SubLObject var282, SubLObject var283) {
        if (var283 == module0592.UNPROVIDED) {
            var283 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var284 = f36190(var282);
        if (module0592.NIL == var284) {
            module0229.f15259();
        }
        final SubLObject var285 = module0202.f12896(var284);
        final SubLObject var286 = module0202.f12898(var284);
        return module0202.f12788(module0434.f30589(var285, var286, var283, (SubLObject)module0592.UNPROVIDED), (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36190(final SubLObject var282) {
        if (module0592.NIL != module0202.f12895(var282)) {
            return var282;
        }
        if (module0592.NIL != module0173.f10955(var282)) {
            final SubLObject var283 = module0225.f14739(var282);
            if (var283.isInteger() && !var283.isNegative()) {
                final SubLObject var284 = module0193.f12101(var283);
                final SubLObject var285 = (SubLObject)ConsesLow.cons(var282, var284);
                return (SubLObject)ConsesLow.list(module0592.$ic128$, var284, var285);
            }
        }
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36191(final SubLObject var288, final SubLObject var289, final SubLObject var290) {
        final SubLThread var291 = SubLProcess.currentSubLThread();
        if (module0592.NIL != module0592.$g4508$.getDynamicValue(var291)) {
            final SubLObject var292 = module0285.f18933(var288, (SubLObject)module0592.UNPROVIDED);
            final SubLObject var293 = module0285.f18933(var289, (SubLObject)module0592.UNPROVIDED);
            final SubLObject var294 = module0205.f13144(module0285.f18933(var290, (SubLObject)module0592.UNPROVIDED));
            return conses_high.subst(var292, var293, var294, Symbols.symbol_function((SubLObject)module0592.EQUAL), (SubLObject)module0592.UNPROVIDED);
        }
        return module0172.f10922(conses_high.subst(module0205.f13144(var288), module0205.f13144(var289), module0205.f13144(var290), Symbols.symbol_function((SubLObject)module0592.EQUAL), (SubLObject)module0592.UNPROVIDED));
    }
    
    public static SubLObject f36192(final SubLObject var294) {
        final SubLObject var295 = module0205.f13144(var294);
        if (module0592.NIL == f36193(var295)) {
            module0229.f15259();
        }
        return module0205.f13144(module0205.f13147(module0205.f13144(var295), (SubLObject)module0592.$ic130$, (SubLObject)module0592.$ic131$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
    }
    
    public static SubLObject f36194(final SubLObject var32) {
        return module0259.f16854(var32, module0592.$ic133$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36195(final SubLObject var296) {
        return module0285.f18993(module0202.f12643(module0592.$ic134$, var296), (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36196(final SubLObject var294) {
        final SubLObject var295 = module0205.f13144(var294);
        if (module0592.NIL == f36193(var295)) {
            module0229.f15259();
        }
        return module0205.f13144(module0205.f13147(module0205.f13144(var295), (SubLObject)module0592.$ic130$, (SubLObject)module0592.$ic135$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
    }
    
    public static SubLObject f36193(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0592.NIL != module0207.f13509(var32) && module0592.NIL == module0205.f13220(module0592.$ic134$, var32, (SubLObject)module0592.T, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED) && module0592.NIL == module0205.f13220(module0592.$ic137$, var32, (SubLObject)module0592.T, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
    }
    
    public static SubLObject f36197(final SubLObject var296) {
        return module0285.f18993(module0202.f12643(module0592.$ic137$, var296), (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36198(final SubLObject var294) {
        return module0205.f13147(module0205.f13144(var294), (SubLObject)module0592.$ic138$, (SubLObject)module0592.$ic139$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36199(final SubLObject var32) {
        return module0202.f12589(var32, (SubLObject)module0592.$ic140$);
    }
    
    public static SubLObject f36200(final SubLObject var297, final SubLObject var298, final SubLObject var290) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        if (module0592.NIL != module0592.$g4508$.getDynamicValue(var299)) {
            final SubLObject var300 = module0285.f18933(var298, (SubLObject)module0592.UNPROVIDED);
            final SubLObject var301 = module0285.f18933(var290, (SubLObject)module0592.UNPROVIDED);
            final SubLObject var302 = module0172.f10922(module0202.f12817(var297, var300, var301));
            return module0202.f12683(module0592.$ic141$, (SubLObject)ConsesLow.list(var302), (SubLObject)module0592.UNPROVIDED);
        }
        return module0172.f10922(module0202.f12817(var297, var298, var290));
    }
    
    public static SubLObject f36201(final SubLObject var301, final SubLObject var298, final SubLObject var290) {
        final SubLObject var302 = module0205.f13403(var301);
        return module0172.f10922(module0202.f12820(var302, var298, var290));
    }
    
    public static SubLObject f36202(final SubLObject var303, final SubLObject var304) {
        final SubLThread var305 = SubLProcess.currentSubLThread();
        if (module0592.NIL == module0202.f12674(var304)) {
            module0229.f15259();
        }
        final SubLObject var306 = module0202.f12751(var304);
        SubLObject var307 = (SubLObject)module0592.NIL;
        if (var303.eql(module0592.$ic141$)) {
            var307 = module0202.f12683(module0592.$ic141$, var306, (SubLObject)module0592.UNPROVIDED);
        }
        else if (module0592.NIL != module0592.$g4508$.getDynamicValue(var305)) {
            SubLObject var308 = (SubLObject)module0592.NIL;
            SubLObject var309 = (SubLObject)module0592.NIL;
            SubLObject var310 = var306;
            SubLObject var311 = (SubLObject)module0592.NIL;
            var311 = var310.first();
            while (module0592.NIL != var310) {
                if (module0592.NIL == module0206.f13470(var311)) {
                    module0229.f15259();
                }
                var309 = (SubLObject)ConsesLow.cons(module0285.f18933(var311, (SubLObject)module0592.UNPROVIDED), var309);
                var310 = var310.rest();
                var311 = var310.first();
            }
            var309 = Sequences.nreverse(var309);
            var308 = module0285.f18933(var303, (SubLObject)module0592.T);
            var307 = module0202.f12683(var308, var309, (SubLObject)module0592.UNPROVIDED);
            if (module0592.NIL == module0206.f13486(var307)) {
                module0229.f15259();
            }
            var307 = module0202.f12683(module0592.$ic141$, (SubLObject)ConsesLow.list(var307), (SubLObject)module0592.UNPROVIDED);
        }
        else {
            var307 = module0202.f12683(var303, var306, (SubLObject)module0592.UNPROVIDED);
            if (module0592.NIL == module0206.f13486(var307)) {
                module0229.f15259();
            }
        }
        return module0172.f10922(var307);
    }
    
    public static SubLObject f36203(final SubLObject var297, final SubLObject var298, final SubLObject var290) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        SubLObject var300 = (SubLObject)module0592.NIL;
        final SubLObject var301 = module0592.$g4508$.currentBinding(var299);
        try {
            module0592.$g4508$.bind((SubLObject)module0592.T, var299);
            var300 = f36200(var297, var298, var290);
        }
        finally {
            module0592.$g4508$.rebind(var301, var299);
        }
        return var300;
    }
    
    public static SubLObject f36204(final SubLObject var301, final SubLObject var298, final SubLObject var290) {
        final SubLThread var302 = SubLProcess.currentSubLThread();
        SubLObject var303 = (SubLObject)module0592.NIL;
        final SubLObject var304 = module0592.$g4508$.currentBinding(var302);
        try {
            module0592.$g4508$.bind((SubLObject)module0592.T, var302);
            var303 = f36201(var301, var298, var290);
        }
        finally {
            module0592.$g4508$.rebind(var304, var302);
        }
        return var303;
    }
    
    public static SubLObject f36205(final SubLObject var303, final SubLObject var304) {
        final SubLThread var305 = SubLProcess.currentSubLThread();
        SubLObject var306 = (SubLObject)module0592.NIL;
        final SubLObject var307 = module0592.$g4508$.currentBinding(var305);
        try {
            module0592.$g4508$.bind((SubLObject)module0592.T, var305);
            var306 = f36202(var303, var304);
        }
        finally {
            module0592.$g4508$.rebind(var307, var305);
        }
        return var306;
    }
    
    public static SubLObject f36206(final SubLObject var279) {
        return module0205.f13144(var279);
    }
    
    public static SubLObject f36207(final SubLObject var288, final SubLObject var289, final SubLObject var310) {
        if (module0592.NIL == module0274.f18164(var310, (SubLObject)module0592.UNPROVIDED)) {
            module0229.f15259();
        }
        return conses_high.subst(var288, var289, var310, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36208(final SubLObject var311, final SubLObject var312, final SubLObject var313) {
        final SubLObject var314 = module0202.f12751(var313);
        final SubLObject var315 = module0732.f45146(var311, var312, var314);
        if (module0592.NIL != var315) {
            return var315;
        }
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36209(final SubLObject var33, final SubLObject var6) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)module0592.NIL;
        SubLObject var36 = (SubLObject)module0592.NIL;
        try {
            var34.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var37 = Errors.$error_handler$.currentBinding(var34);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var34);
                try {
                    var35 = module0730.f44564(var33, var6, module0147.f9552((SubLObject)module0592.UNPROVIDED));
                }
                catch (Throwable var38) {
                    Errors.handleThrowable(var38, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var37, var34);
            }
        }
        catch (Throwable var39) {
            var36 = Errors.handleThrowable(var39, module0003.$g3$.getGlobalValue());
        }
        finally {
            var34.throwStack.pop();
        }
        if (module0592.NIL != var36) {
            module0229.f15259();
            return (SubLObject)module0592.NIL;
        }
        return module0202.f12791(var35, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36210() {
        if (module0592.NIL == module0592.$g4509$.getGlobalValue()) {
            module0592.$g4509$.setGlobalValue(constants_high_oc.f10737((SubLObject)module0592.$ic152$));
        }
        return module0592.$g4509$.getGlobalValue();
    }
    
    public static SubLObject f36211() {
        if (module0592.NIL == module0592.$g4510$.getGlobalValue()) {
            module0592.$g4510$.setGlobalValue(constants_high_oc.f10737((SubLObject)module0592.$ic153$));
        }
        return module0592.$g4510$.getGlobalValue();
    }
    
    public static SubLObject f36212(final SubLObject var316) {
        if (!module0205.f13276(var316).eql(f36211())) {
            module0229.f15259();
        }
        SubLObject var317 = (SubLObject)module0592.NIL;
        SubLObject var318 = module0205.f13304(var316, (SubLObject)module0592.UNPROVIDED);
        SubLObject var319 = (SubLObject)module0592.NIL;
        var319 = var318.first();
        while (module0592.NIL != var318) {
            SubLObject var320 = (SubLObject)module0592.NIL;
            if (var319.isString()) {
                var320 = (SubLObject)ConsesLow.list(var319);
            }
            else if (module0592.NIL != module0202.f12589(var319, f36210())) {
                var320 = module0730.f44564(module0205.f13277(var319, (SubLObject)module0592.UNPROVIDED), module0205.f13368(var319, (SubLObject)module0592.UNPROVIDED), module0147.f9552((SubLObject)module0592.UNPROVIDED));
            }
            if (module0592.NIL != module0035.f2013(var320)) {
                var317 = (SubLObject)ConsesLow.cons(var320, var317);
            }
            else {
                module0229.f15259();
            }
            var318 = var318.rest();
            var319 = var318.first();
        }
        SubLObject var321 = (SubLObject)module0592.NIL;
        SubLObject var322 = module0035.f2489(Sequences.nreverse(var317), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
        SubLObject var323 = (SubLObject)module0592.NIL;
        var323 = var322.first();
        while (module0592.NIL != var322) {
            var321 = (SubLObject)ConsesLow.cons(module0038.f2761(var323, (SubLObject)module0592.UNPROVIDED), var321);
            var322 = var322.rest();
            var323 = var322.first();
        }
        return module0202.f12791(var321, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36213(final SubLObject var18, final SubLObject var283, final SubLObject var280) {
        if (!var18.isString() || module0592.NIL == module0161.f10481(var283)) {
            module0229.f15259();
        }
        final SubLObject var284 = f36214(var280);
        if (module0592.NIL == var284) {
            module0229.f15259();
        }
        final SubLObject var285 = f36215(var284, var283, var18);
        if (module0592.NIL == var285) {
            module0229.f15259();
        }
        return var285;
    }
    
    public static SubLObject f36216(final SubLObject var18, final SubLObject var283, final SubLObject var280) {
        if (!var18.isString() || module0592.NIL == module0161.f10481(var283)) {
            module0229.f15259();
        }
        final SubLObject var284 = f36214(var280);
        if (module0592.NIL == var284) {
            module0229.f15259();
        }
        final SubLObject var285 = module0434.f30594(var284, var283, (SubLObject)module0592.$ic156$);
        if (module0592.NIL != var285) {
            final SubLObject var286 = module0233.f15370(var285.first().first());
            return var286;
        }
        final SubLObject var286 = f36215(var284, var283, var18);
        if (module0592.NIL == var286) {
            module0229.f15259();
        }
        return var286;
    }
    
    public static SubLObject f36214(final SubLObject var280) {
        SubLObject var281 = (SubLObject)module0592.NIL;
        if (module0592.NIL != module0173.f10955(var280)) {
            var281 = (SubLObject)ConsesLow.list(module0592.$ic158$, (SubLObject)module0592.$ic159$, var280);
        }
        else if (var280.isCons() && module0592.$ic160$.eql(module0205.f13276(var280))) {
            var281 = module0205.f13368(var280, (SubLObject)module0592.UNPROVIDED);
        }
        return var281;
    }
    
    public static SubLObject f36215(final SubLObject var290, final SubLObject var283, final SubLObject var18) {
        final SubLObject var291 = module0541.f33547(var290, var283, var18, (SubLObject)module0592.UNPROVIDED);
        if (module0592.NIL != var291) {
            final SubLObject var292 = module0233.f15370(var291.first());
            final SubLObject var293 = module0126.f8395(var18, (SubLObject)module0592.UNPROVIDED);
            module0538.f33377(var292, var293);
            module0538.f33349((SubLObject)ConsesLow.list(module0592.$ic161$, var292, var283), module0132.$g1549$.getGlobalValue(), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
            return var292;
        }
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36217(final SubLObject var323) {
        final SubLObject var324 = f36218(var323, module0592.$ic162$);
        final SubLObject var325 = module0035.remove_if_not((SubLObject)module0592.$ic163$, var324, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
        if (module0592.NIL != module0035.f1997(var325)) {
            return var325.first();
        }
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36219(final SubLObject var323) {
        final SubLObject var324 = f36218(var323, module0592.$ic165$);
        if (module0592.NIL != module0035.f1997(var324)) {
            return var324.first();
        }
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36218(final SubLObject var323, final SubLObject var326) {
        if (module0592.NIL == module0212.f13762(var323)) {
            module0229.f15259();
        }
        final SubLObject var327 = module0220.f14562(var323, var326, (SubLObject)module0592.TWO_INTEGER, (SubLObject)module0592.ONE_INTEGER, (SubLObject)module0592.UNPROVIDED);
        final SubLObject var328 = module0035.remove_if_not((SubLObject)module0592.$ic167$, var327, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
        final SubLObject var329 = Sequences.remove_if((SubLObject)module0592.$ic168$, var328, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
        SubLObject var330 = (SubLObject)module0592.NIL;
        SubLObject var331 = var329;
        SubLObject var332 = (SubLObject)module0592.NIL;
        var332 = var331.first();
        while (module0592.NIL != var331) {
            if (module0217.f14221(var332, (SubLObject)module0592.ONE_INTEGER, var326, (SubLObject)module0592.UNPROVIDED).eql((SubLObject)module0592.ONE_INTEGER)) {
                var330 = (SubLObject)ConsesLow.cons(var332, var330);
            }
            var331 = var331.rest();
            var332 = var331.first();
        }
        return var330;
    }
    
    public static SubLObject f36220(final SubLObject var330) {
        return module0305.f20438(var330, module0592.$ic169$, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36221(final SubLObject var330) {
        return module0305.f20438(var330, module0592.$ic170$, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36222(final SubLObject var9) {
        return module0201.f12550(constants_high_oc.f10743(var9));
    }
    
    public static SubLObject f36223(final SubLObject var331, final SubLObject var19) {
        if (!var331.isString() || !var19.isString()) {
            module0229.f15259();
        }
        return module0728.f44459(var331, var19);
    }
    
    public static SubLObject f36224(final SubLObject var36) {
        return f36225(var36, module0592.$g4511$.getGlobalValue());
    }
    
    public static SubLObject f36226(final SubLObject var36, final SubLObject var332) {
        if (module0592.NIL != var332) {
            final SubLObject var333 = module0747.f46317(var36, (SubLObject)module0592.$ic176$);
            return (SubLObject)((module0592.NIL != var333) ? module0747.f46318(var333.first(), (SubLObject)module0592.NIL, (SubLObject)module0592.ZERO_INTEGER, (SubLObject)module0592.NIL, (SubLObject)module0592.NIL) : module0592.NIL);
        }
        return module0770.f49049(var36, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36225(final SubLObject var36, final SubLObject var332) {
        final SubLThread var333 = SubLProcess.currentSubLThread();
        final SubLObject var334 = module0034.$g879$.getDynamicValue(var333);
        SubLObject var335 = (SubLObject)module0592.NIL;
        if (module0592.NIL == var334) {
            return f36226(var36, var332);
        }
        var335 = module0034.f1857(var334, (SubLObject)module0592.$ic175$, (SubLObject)module0592.UNPROVIDED);
        if (module0592.NIL == var335) {
            var335 = module0034.f1807(module0034.f1842(var334), (SubLObject)module0592.$ic175$, (SubLObject)module0592.TWO_INTEGER, (SubLObject)module0592.NIL, (SubLObject)module0592.EQUAL, (SubLObject)module0592.UNPROVIDED);
            module0034.f1860(var334, (SubLObject)module0592.$ic175$, var335);
        }
        final SubLObject var336 = module0034.f1782(var36, var332);
        final SubLObject var337 = module0034.f1814(var335, var336, (SubLObject)module0592.UNPROVIDED);
        if (var337 != module0592.$ic177$) {
            SubLObject var338 = var337;
            SubLObject var339 = (SubLObject)module0592.NIL;
            var339 = var338.first();
            while (module0592.NIL != var338) {
                SubLObject var340 = var339.first();
                final SubLObject var341 = conses_high.second(var339);
                if (var36.equal(var340.first())) {
                    var340 = var340.rest();
                    if (module0592.NIL != var340 && module0592.NIL == var340.rest() && var332.equal(var340.first())) {
                        return module0034.f1959(var341);
                    }
                }
                var338 = var338.rest();
                var339 = var338.first();
            }
        }
        final SubLObject var342 = Values.arg2(var333.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f36226(var36, var332)));
        module0034.f1836(var335, var336, var337, var342, (SubLObject)ConsesLow.list(var36, var332));
        return module0034.f1959(var342);
    }
    
    public static SubLObject f36227(final SubLObject var342) {
        final SubLThread var343 = SubLProcess.currentSubLThread();
        if (module0592.NIL == module0762.f48210(var342)) {
            module0229.f15259();
        }
        SubLObject var344 = (SubLObject)module0592.NIL;
        SubLObject var345 = (SubLObject)module0592.NIL;
        var343.resetMultipleValues();
        final SubLObject var343_344 = module0770.f49057(var342, module0147.$g2095$.getDynamicValue(var343), module0147.$g2095$.getDynamicValue(var343));
        final SubLObject var345_346 = var343.secondMultipleValue();
        var343.resetMultipleValues();
        var344 = var343_344;
        var345 = var345_346;
        if (module0592.NIL != var345 || module0592.NIL == module0209.f13550(var344)) {
            module0229.f15259();
        }
        return var344;
    }
    
    public static SubLObject f36228(final SubLObject var347, final SubLObject var348) {
        final SubLThread var349 = SubLProcess.currentSubLThread();
        return module0751.f46947(Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#39916", "CYC"), module0205.f13203(var347, (SubLObject)module0592.UNPROVIDED), var348, module0147.$g2095$.getDynamicValue(var349)));
    }
    
    public static SubLObject f36229(final SubLObject var349, final SubLObject var350) {
        final SubLThread var351 = SubLProcess.currentSubLThread();
        if (module0592.NIL == module0202.f12676(var349) || module0592.NIL == module0161.f10480(var350)) {
            module0229.f15259();
        }
        else {
            if (module0592.NIL != module0202.f12679(var349)) {
                return module0038.$g916$.getGlobalValue();
            }
            if (module0592.NIL != module0202.f12590(var349)) {
                final SubLObject var352 = f36230(var349);
                var351.resetMultipleValues();
                final SubLObject var353 = module0770.f49057(var352, var350, module0147.$g2095$.getDynamicValue(var351));
                final SubLObject var354 = var351.secondMultipleValue();
                var351.resetMultipleValues();
                if (module0592.NIL != var354 || !var353.isString()) {
                    module0229.f15259();
                }
                return var353;
            }
            module0229.f15259();
        }
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36230(final SubLObject var349) {
        SubLObject var350 = (SubLObject)module0592.NIL;
        SubLObject var351 = (SubLObject)module0592.ZERO_INTEGER;
        SubLObject var353;
        final SubLObject var352 = var353 = module0205.f13207(var349, (SubLObject)module0592.$ic181$);
        SubLObject var354 = (SubLObject)module0592.NIL;
        var354 = var353.first();
        while (module0592.NIL != var353) {
            var351 = Numbers.add(var351, (SubLObject)module0592.ONE_INTEGER);
            if (var351.numG((SubLObject)module0592.ONE_INTEGER)) {
                var350 = (SubLObject)ConsesLow.cons((SubLObject)module0592.$ic182$, var350);
            }
            var350 = (SubLObject)ConsesLow.cons(module0202.f12768(module0592.$ic183$, module0592.$ic184$, var354), var350);
            var353 = var353.rest();
            var354 = var353.first();
        }
        if (module0592.NIL == var350) {
            module0229.f15259();
        }
        return (module0592.NIL != module0035.f1997(var350)) ? var350.first() : module0202.f12683(module0592.$ic185$, Sequences.nreverse(var350), (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36231(final SubLObject var354) {
        final SubLThread var355 = SubLProcess.currentSubLThread();
        final SubLObject var356 = module0220.f14565(var354, module0592.$ic186$, (SubLObject)module0592.TWO_INTEGER, (SubLObject)module0592.ONE_INTEGER, (SubLObject)module0592.UNPROVIDED);
        SubLObject var357 = (SubLObject)module0592.NIL;
        final SubLObject var358 = module0147.$g2094$.currentBinding(var355);
        final SubLObject var359 = module0147.$g2095$.currentBinding(var355);
        try {
            module0147.$g2094$.bind((SubLObject)module0592.$ic1$, var355);
            module0147.$g2095$.bind(module0592.$ic2$, var355);
            SubLObject var360 = var356;
            SubLObject var361 = (SubLObject)module0592.NIL;
            var361 = var360.first();
            while (module0592.NIL != var360) {
                if (module0592.NIL != module0259.f16854(var361, module0592.$ic187$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED) || module0592.NIL != module0259.f16854(var361, module0592.$ic188$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
                    var357 = (SubLObject)ConsesLow.cons(var361, var357);
                }
                var360 = var360.rest();
                var361 = var360.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var359, var355);
            module0147.$g2094$.rebind(var358, var355);
        }
        if (!Sequences.length(var357).eql((SubLObject)module0592.ONE_INTEGER)) {
            module0229.f15259();
        }
        return var357.first();
    }
    
    public static SubLObject f36232(final SubLObject var356) {
        if (!var356.isString() && module0592.NIL == module0208.f13537(var356, (SubLObject)module0592.UNPROVIDED)) {
            module0229.f15259();
        }
        return module0589.f35898((module0592.NIL != module0208.f13537(var356, (SubLObject)module0592.UNPROVIDED)) ? module0039.f3053(module0205.f13277(var356, (SubLObject)module0592.UNPROVIDED)) : var356, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36233(final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        SubLObject var51 = (SubLObject)module0592.NIL;
        SubLObject var52 = (SubLObject)module0592.NIL;
        try {
            var50.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var53 = Errors.$error_handler$.currentBinding(var50);
            try {
                Errors.$error_handler$.bind((SubLObject)module0592.$ic56$, var50);
                try {
                    var52 = module0589.f35977(f36154(var49), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
                }
                catch (Throwable var54) {
                    Errors.handleThrowable(var54, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var53, var50);
            }
        }
        catch (Throwable var55) {
            var51 = Errors.handleThrowable(var55, module0003.$g3$.getGlobalValue());
        }
        finally {
            var50.throwStack.pop();
        }
        if (module0592.NIL != var51) {
            module0229.f15259();
        }
        else if (!var52.isString()) {
            module0229.f15259();
        }
        else if (module0592.NIL != Sequences.find((SubLObject)module0592.$ic191$, var52, Symbols.symbol_function((SubLObject)module0592.$ic192$), Symbols.symbol_function((SubLObject)module0592.$ic193$), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
            module0229.f15259();
        }
        else {
            if (module0592.NIL != module0039.f3008(var52) && module0592.NIL != Sequences.search((SubLObject)module0592.$ic194$, var52, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
                return module0208.f13538(module0039.f3052(var52));
            }
            return var52;
        }
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36234(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0592.NIL;
        SubLObject var11 = (SubLObject)module0592.NIL;
        if (Sequences.length(var9).numG((SubLObject)module0592.TWO_INTEGER)) {
            var11 = f36235(conses_high.cddr(var9));
        }
        if (module0592.NIL != var11) {
            final SubLObject var12 = (SubLObject)(conses_high.cadr(var9).eql((SubLObject)module0592.$ic176$) ? module0592.$ic196$ : conses_high.cadr(var9));
            SubLObject var13 = (SubLObject)module0592.NIL;
            try {
                var13 = module0004.f82(var9.first(), var12, (SubLObject)module0592.NIL, (SubLObject)module0592.$ic197$);
                if (module0592.NIL != module0003.f70(var13, var9.first(), var12)) {
                    module0589.f35885(var13, (SubLObject)ConsesLow.list(new SubLObject[] { module0592.$ic198$, var9.first(), module0592.$ic199$, conses_high.cadr(var9), module0592.$ic200$, module0592.$ic201$, module0592.$ic202$, module0592.$ic203$, module0592.$ic204$, var11, module0592.$ic205$, module0592.T, module0592.$ic206$, module0592.NIL, module0592.$ic207$, module0592.$ic176$, module0592.$ic208$, module0592.$ic176$, module0592.$ic209$, module0592.NIL }));
                    var10 = module0589.f35934(module0589.f35941(var13, (SubLObject)module0592.UNPROVIDED));
                }
            }
            finally {
                final SubLObject var14 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0592.T);
                    if (module0592.NIL != var13) {
                        streams_high.close(var13, (SubLObject)module0592.UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var14);
                }
            }
        }
        else {
            final SubLObject var12 = (SubLObject)(conses_high.cadr(var9).eql((SubLObject)module0592.$ic176$) ? module0592.$ic196$ : conses_high.cadr(var9));
            SubLObject var13 = (SubLObject)module0592.NIL;
            try {
                var13 = module0004.f82(var9.first(), var12, (SubLObject)module0592.NIL, (SubLObject)module0592.$ic197$);
                if (module0592.NIL != module0003.f70(var13, var9.first(), var12)) {
                    module0589.f35885(var13, (SubLObject)ConsesLow.list(new SubLObject[] { module0592.$ic198$, var9.first(), module0592.$ic199$, conses_high.cadr(var9), module0592.$ic200$, module0592.$ic201$, module0592.$ic202$, module0592.$ic203$, module0592.$ic204$, module0592.NIL, module0592.$ic205$, module0592.T, module0592.$ic206$, module0592.NIL, module0592.$ic207$, module0592.$ic176$, module0592.$ic208$, module0592.$ic176$, module0592.$ic209$, module0592.NIL }));
                    var10 = module0589.f35934(module0589.f35941(var13, (SubLObject)module0592.UNPROVIDED));
                }
            }
            finally {
                final SubLObject var15 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0592.T);
                    if (module0592.NIL != var13) {
                        streams_high.close(var13, (SubLObject)module0592.UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var15);
                }
            }
        }
        return module0589.f35872(var10);
    }
    
    public static SubLObject f36235(final SubLObject var360) {
        SubLObject var361 = (SubLObject)module0592.$ic31$;
        SubLObject var362 = var360;
        SubLObject var363 = (SubLObject)module0592.NIL;
        var363 = var362.first();
        while (module0592.NIL != var362) {
            var361 = Sequences.cconcatenate(var361, new SubLObject[] { var363.isString() ? module0589.f35898(Sequences.cconcatenate((SubLObject)module0592.$ic211$, new SubLObject[] { var363, module0592.$ic211$ }), (SubLObject)module0592.UNPROVIDED) : module0589.f35898(module0038.f2624(var363), (SubLObject)module0592.UNPROVIDED), module0592.$ic212$ });
            var362 = var362.rest();
            var363 = var362.first();
        }
        return module0038.f2621(var361, (SubLObject)module0592.$ic212$, (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36236(final SubLObject var362) {
        final SubLObject var363 = (SubLObject)module0592.NIL;
        if (module0592.NIL != module0206.f13453(var362) && module0205.f13276(var362).eql(module0592.$ic213$) && module0592.NIL != module0038.f2684(module0205.f13204(var362, (SubLObject)module0592.UNPROVIDED), (SubLObject)module0592.$ic214$) && module0592.NIL != module0038.f2673(module0205.f13204(var362, (SubLObject)module0592.UNPROVIDED), (SubLObject)module0592.$ic215$, (SubLObject)module0592.UNPROVIDED)) {
            return module0038.f2623(module0205.f13204(var362, (SubLObject)module0592.UNPROVIDED), (SubLObject)module0592.ONE_INTEGER, Numbers.subtract(Sequences.length(module0205.f13204(var362, (SubLObject)module0592.UNPROVIDED)), (SubLObject)module0592.ONE_INTEGER));
        }
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36237(final SubLObject var356, final SubLObject var363) {
        if (!var356.isString()) {
            module0229.f15259();
        }
        SubLObject var364 = (SubLObject)module0592.NIL;
        SubLObject var365 = (SubLObject)module0592.NIL;
        var364 = module0731.f44808(var356, (SubLObject)module0592.T, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
        if (module0592.NIL == var365) {
            SubLObject var366 = var364;
            SubLObject var367 = (SubLObject)module0592.NIL;
            var367 = var366.first();
            while (module0592.NIL == var365 && module0592.NIL != var366) {
                if (module0592.NIL != module0259.f16891(var367, module0592.$ic217$) && module0592.NIL != f36238(var367, var363)) {
                    var365 = var367;
                }
                var366 = var366.rest();
                var367 = var366.first();
            }
        }
        return (module0592.NIL != var365) ? var365 : module0205.f13327((SubLObject)ConsesLow.list(module0592.$ic218$, var356, var363));
    }
    
    public static SubLObject f36238(final SubLObject var367, final SubLObject var368) {
        final SubLThread var369 = SubLProcess.currentSubLThread();
        final SubLObject var370 = module0147.$g2095$.getDynamicValue(var369);
        SubLObject var371 = (SubLObject)module0592.NIL;
        final SubLObject var372 = module0145.$g1942$.currentBinding(var369);
        try {
            module0145.$g1942$.bind((SubLObject)module0592.T, var369);
            var371 = module0540.f33526(module0409.f28506((SubLObject)ConsesLow.list(module0592.$ic186$, var368, var367), var370, (SubLObject)module0592.$ic220$));
        }
        finally {
            module0145.$g1942$.rebind(var372, var369);
        }
        return var371;
    }
    
    public static SubLObject f36239(final SubLObject var370) {
        module0229.f15259();
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36240(final SubLObject var371) {
        if (module0592.NIL == module0202.f12674(var371)) {
            module0229.f15259();
        }
        return module0202.f12751(var371);
    }
    
    public static SubLObject f36241(final SubLObject var372) {
        final SubLThread var373 = SubLProcess.currentSubLThread();
        SubLObject var374 = (SubLObject)module0592.NIL;
        SubLObject var375 = (SubLObject)module0592.NIL;
        try {
            var373.throwStack.push(module0592.$ic223$);
            final SubLObject var376 = Errors.$error_handler$.currentBinding(var373);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0592.$ic224$), var373);
                try {
                    final SubLObject var377 = module0347.f23344((SubLObject)module0592.$ic225$, (SubLObject)ConsesLow.listS(module0592.$ic226$, var372, (SubLObject)module0592.$ic227$), module0147.f9551(), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED).first();
                    final SubLObject var378 = module0347.f23344((SubLObject)module0592.$ic228$, (SubLObject)ConsesLow.listS(module0592.$ic229$, var372, (SubLObject)module0592.$ic230$), module0147.f9551(), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED).first();
                    var374 = (SubLObject)((module0592.NIL != var377 && module0592.NIL != var378) ? f36242(var377, var378) : module0592.NIL);
                }
                catch (Throwable var379) {
                    Errors.handleThrowable(var379, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var376, var373);
            }
        }
        catch (Throwable var380) {
            var375 = Errors.handleThrowable(var380, (SubLObject)module0592.$ic223$);
        }
        finally {
            var373.throwStack.pop();
        }
        if (module0592.NIL == module0202.f12674(var374)) {
            module0229.f15259();
        }
        return var374;
    }
    
    public static SubLObject f36243(final SubLObject var376, final SubLObject var377) {
        final SubLThread var378 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0347.f23334(module0202.f12768(module0592.$g4512$.getDynamicValue(var378), var376, var377), module0147.f9551(), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
    }
    
    public static SubLObject f36242(final SubLObject var374, final SubLObject var375) {
        final SubLThread var376 = SubLProcess.currentSubLThread();
        final SubLObject var377 = module0347.f23344((SubLObject)module0592.$ic232$, (SubLObject)ConsesLow.list(module0592.$ic233$, (SubLObject)module0592.$ic232$, var374), module0147.f9551(), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
        SubLObject var378 = (SubLObject)module0592.NIL;
        final SubLObject var379 = module0592.$g4512$.currentBinding(var376);
        try {
            module0592.$g4512$.bind(var375, var376);
            final SubLObject var380 = Sort.sort(var377, (SubLObject)module0592.$ic234$, (SubLObject)module0592.UNPROVIDED);
            var378 = module0202.f12787(var380, (SubLObject)module0592.UNPROVIDED);
        }
        finally {
            module0592.$g4512$.rebind(var379, var376);
        }
        return var378;
    }
    
    public static SubLObject f36244(final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var55 = (SubLObject)module0592.NIL;
        SubLObject var56 = (SubLObject)module0592.NIL;
        try {
            var54.throwStack.push(module0592.$ic223$);
            final SubLObject var57 = Errors.$error_handler$.currentBinding(var54);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0592.$ic224$), var54);
                try {
                    final SubLObject var58 = Numbers.add(var53, module0612.$g4513$.getGlobalValue());
                    var55 = module0612.f37426(var58);
                }
                catch (Throwable var59) {
                    Errors.handleThrowable(var59, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var57, var54);
            }
        }
        catch (Throwable var60) {
            var56 = Errors.handleThrowable(var60, (SubLObject)module0592.$ic223$);
        }
        finally {
            var54.throwStack.pop();
        }
        if (module0592.NIL == var55) {
            module0229.f15259();
        }
        return var55;
    }
    
    public static SubLObject f36245(final SubLObject var382) {
        final SubLThread var383 = SubLProcess.currentSubLThread();
        SubLObject var384 = (SubLObject)module0592.NIL;
        SubLObject var385 = (SubLObject)module0592.NIL;
        try {
            var383.throwStack.push(module0592.$ic223$);
            final SubLObject var386 = Errors.$error_handler$.currentBinding(var383);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0592.$ic224$), var383);
                try {
                    var384 = Numbers.subtract(module0612.f37427(var382), module0612.$g4513$.getGlobalValue());
                }
                catch (Throwable var387) {
                    Errors.handleThrowable(var387, (SubLObject)module0592.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var386, var383);
            }
        }
        catch (Throwable var388) {
            var385 = Errors.handleThrowable(var388, (SubLObject)module0592.$ic223$);
        }
        finally {
            var383.throwStack.pop();
        }
        if (module0592.NIL == var384) {
            module0229.f15259();
        }
        return var384;
    }
    
    public static SubLObject f36246(final SubLObject var384, final SubLObject var385) {
        return module0202.f12787(f36247(var384, var385, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED), (SubLObject)module0592.UNPROVIDED);
    }
    
    public static SubLObject f36247(final SubLObject var384, SubLObject var385, SubLObject var386, SubLObject var387) {
        if (var385 == module0592.UNPROVIDED) {
            var385 = (SubLObject)module0592.TEN_INTEGER;
        }
        if (var386 == module0592.UNPROVIDED) {
            var386 = (SubLObject)module0592.NIL;
        }
        if (var387 == module0592.UNPROVIDED) {
            var387 = (SubLObject)module0592.NIL;
        }
        assert module0592.NIL != f36248(var384) : var384;
        assert module0592.NIL != module0004.f106(var385) : var385;
        assert module0592.NIL != module0035.f2015(var386) : var386;
        assert module0592.NIL != module0035.f2015(var387) : var387;
        final SubLObject var388 = module0067.f4880(Symbols.symbol_function((SubLObject)module0592.EQ), (SubLObject)module0592.UNPROVIDED);
        SubLObject var389 = module0260.f17033(module0592.$ic243$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
        SubLObject var390 = (SubLObject)module0592.NIL;
        var390 = var389.first();
        while (module0592.NIL != var389) {
            SubLObject var391 = (SubLObject)module0592.NIL;
            final SubLObject var392 = var390;
            if (module0592.NIL != module0158.f10010(var384, (SubLObject)module0592.TWO_INTEGER, var392)) {
                final SubLObject var393 = module0158.f10011(var384, (SubLObject)module0592.TWO_INTEGER, var392);
                SubLObject var394 = (SubLObject)module0592.NIL;
                final SubLObject var395 = (SubLObject)module0592.NIL;
                while (module0592.NIL == var394) {
                    final SubLObject var396 = module0052.f3695(var393, var395);
                    final SubLObject var397 = (SubLObject)SubLObjectFactory.makeBoolean(!var395.eql(var396));
                    if (module0592.NIL != var397) {
                        SubLObject var398 = (SubLObject)module0592.NIL;
                        try {
                            var398 = module0158.f10316(var396, (SubLObject)module0592.$ic241$, (SubLObject)module0592.NIL, (SubLObject)module0592.NIL);
                            SubLObject var393_398 = (SubLObject)module0592.NIL;
                            final SubLObject var394_399 = (SubLObject)module0592.NIL;
                            while (module0592.NIL == var393_398) {
                                final SubLObject var400_401 = module0052.f3695(var398, var394_399);
                                final SubLObject var396_402 = (SubLObject)SubLObjectFactory.makeBoolean(!var394_399.eql(var400_401));
                                if (module0592.NIL != var396_402) {
                                    var391 = module0178.f11331(var400_401, (SubLObject)module0592.ONE_INTEGER);
                                    if (module0592.NIL != assertion_handles_oc.f11035(var391)) {
                                        final SubLObject var399 = module0178.f11332(var391);
                                        if (module0592.NIL != module0256.f16576(var399, module0592.$ic158$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED) || module0592.NIL != module0256.f16576(var399, module0592.$ic242$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED)) {
                                            final SubLObject var400 = module0178.f11335(var391);
                                            module0084.f5775(var388, var400, (SubLObject)module0592.UNPROVIDED);
                                        }
                                    }
                                }
                                var393_398 = (SubLObject)SubLObjectFactory.makeBoolean(module0592.NIL == var396_402);
                            }
                        }
                        finally {
                            final SubLObject var401 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0592.T);
                                if (module0592.NIL != var398) {
                                    module0158.f10319(var398);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var401);
                            }
                        }
                    }
                    var394 = (SubLObject)SubLObjectFactory.makeBoolean(module0592.NIL == var397);
                }
            }
            var389 = var389.rest();
            var390 = var389.first();
        }
        SubLObject var402 = module0084.f5795(var388, Symbols.symbol_function((SubLObject)module0592.$ic244$));
        SubLObject var403 = var386;
        SubLObject var404 = (SubLObject)module0592.NIL;
        var404 = var403.first();
        while (module0592.NIL != var403) {
            var402 = Sequences.delete(var404, var402, Symbols.symbol_function((SubLObject)module0592.EQL), Symbols.symbol_function((SubLObject)module0592.$ic245$), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
            var403 = var403.rest();
            var404 = var403.first();
        }
        var403 = var387;
        SubLObject var405 = (SubLObject)module0592.NIL;
        var405 = var403.first();
        while (module0592.NIL != var403) {
            var402 = module0035.delete_if_not(var405, var402, Symbols.symbol_function((SubLObject)module0592.$ic245$), (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
            var403 = var403.rest();
            var405 = var403.first();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0592.$ic245$), module0035.f2124(var385, var402));
    }
    
    public static SubLObject f36248(final SubLObject var32) {
        return module0259.f16891(var32, module0592.$ic246$);
    }
    
    public static SubLObject f36249(final SubLObject var407, final SubLObject var408) {
        SubLObject var409 = module0751.f46648(var407, (SubLObject)module0592.UNPROVIDED);
        final SubLObject var410 = module0038.f2705(var409, (SubLObject)module0592.$ic247$, (SubLObject)module0592.$ic248$, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
        if (module0592.NIL != module0038.f2653(var410)) {
            var409 = var410;
        }
        var409 = module0038.f2735(var409);
        SubLObject var411 = module0202.f12684(var408);
        SubLObject var412 = (SubLObject)module0592.NIL;
        var412 = var411.first();
        while (module0592.NIL != var411) {
            var409 = module0038.f2659(Sequences.cconcatenate((SubLObject)module0592.$ic249$, new SubLObject[] { var412, module0592.$ic250$ }), var412, var409, (SubLObject)module0592.UNPROVIDED);
            var411 = var411.rest();
            var412 = var411.first();
        }
        final SubLObject var413 = module0038.f2861(var409, (SubLObject)module0592.UNPROVIDED);
        final SubLObject var414 = Mapping.mapcar((SubLObject)module0592.$ic251$, var413);
        SubLObject var415 = (SubLObject)module0592.NIL;
        SubLObject var416 = (SubLObject)module0592.NIL;
        SubLObject var294_416 = (SubLObject)module0592.NIL;
        SubLObject var417 = (SubLObject)module0592.NIL;
        SubLObject var418_419 = (SubLObject)module0592.NIL;
        var416 = var413;
        var294_416 = var416.first();
        var417 = var414;
        var418_419 = var417.first();
        while (module0592.NIL != var417 || module0592.NIL != var416) {
            if (var418_419.numG((SubLObject)module0592.ZERO_INTEGER)) {
                var415 = (SubLObject)ConsesLow.cons(var294_416, var415);
            }
            var416 = var416.rest();
            var294_416 = var416.first();
            var417 = var417.rest();
            var418_419 = var417.first();
        }
        var409 = module0038.f2767(Sequences.nreverse(var415), (SubLObject)module0592.$ic252$);
        if (module0592.NIL == var409) {
            module0229.f15259();
        }
        return var409;
    }
    
    public static SubLObject f36250(final SubLObject var294) {
        return Sequences.length(module0038.f2689((SubLObject)module0592.$ic249$, var294, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
    }
    
    public static SubLObject f36251(final SubLObject var420, final SubLObject var421) {
        return Functions.apply(Symbols.symbol_function((SubLObject)module0592.$ic254$), (SubLObject)ConsesLow.cons((SubLObject)module0592.NIL, (SubLObject)ConsesLow.cons(var420, var421)));
    }
    
    public static SubLObject f36252(final SubLObject var422) {
        if (module0592.NIL == module0206.f13450(var422)) {
            module0229.f15259();
        }
        final SubLObject var423 = module0205.f13144(var422);
        SubLObject var424 = (SubLObject)module0592.NIL;
        final SubLObject var425 = module0592.$g4514$.getGlobalValue();
        SubLObject var426 = (SubLObject)module0592.NIL;
        try {
            var426 = Locks.seize_lock(var425);
            var424 = module0067.f4884(module0592.$g4515$.getGlobalValue(), var423, (SubLObject)module0592.UNPROVIDED);
            if (module0592.NIL == var424) {
                var424 = module0057.f4173((SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
                module0067.f4886(module0592.$g4515$.getGlobalValue(), var423, var424);
            }
        }
        finally {
            if (module0592.NIL != var426) {
                Locks.release_lock(var425);
            }
        }
        return module0057.f4175(var424);
    }
    
    public static SubLObject f36253(final SubLObject var422, final SubLObject var39) {
        if (module0592.NIL == module0206.f13450(var422) || !var39.isInteger() || !var39.isPositive()) {
            module0229.f15259();
        }
        final SubLObject var423 = module0205.f13144(var422);
        final SubLObject var424 = (SubLObject)ConsesLow.cons(var423, var39);
        SubLObject var425 = (SubLObject)module0592.NIL;
        final SubLObject var426 = module0592.$g4516$.getGlobalValue();
        SubLObject var427 = (SubLObject)module0592.NIL;
        try {
            var427 = Locks.seize_lock(var426);
            var425 = module0067.f4884(module0592.$g4517$.getGlobalValue(), var424, (SubLObject)module0592.UNPROVIDED);
            if (module0592.NIL == var425) {
                var425 = module0057.f4173(var39, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
                module0067.f4886(module0592.$g4517$.getGlobalValue(), var424, var425);
            }
        }
        finally {
            if (module0592.NIL != var427) {
                Locks.release_lock(var426);
            }
        }
        return module0057.f4175(var425);
    }
    
    public static SubLObject f36254(final SubLObject var27) {
        final SubLObject var28 = Sequences.find_if((SubLObject)module0592.$ic262$, var27, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
        final SubLObject var29 = (module0592.NIL != var28) ? f36255(var27) : var27;
        final SubLObject var30 = (SubLObject)((module0592.NIL != var29) ? Functions.apply(Symbols.symbol_function((SubLObject)module0592.$ic29$), var29) : module0592.$ic31$);
        return (module0592.NIL != var28) ? module0208.f13538(var30) : var30;
    }
    
    public static SubLObject f36255(final SubLObject var27) {
        final SubLObject var28 = conses_high.copy_list(var27);
        SubLObject var29 = (SubLObject)module0592.NIL;
        SubLObject var30 = (SubLObject)module0592.NIL;
        SubLObject var31 = (SubLObject)module0592.NIL;
        var29 = var27;
        var30 = var29.first();
        for (var31 = (SubLObject)module0592.ZERO_INTEGER; module0592.NIL != var29; var29 = var29.rest(), var30 = var29.first(), var31 = Numbers.add((SubLObject)module0592.ONE_INTEGER, var31)) {
            if (module0592.NIL != module0208.f13537(var30, (SubLObject)module0592.UNPROVIDED)) {
                ConsesLow.set_nth(var31, var28, module0205.f13277(var30, (SubLObject)module0592.UNPROVIDED));
            }
            else {
                ConsesLow.set_nth(var31, var28, module0642.f39018(var30));
            }
        }
        return var28;
    }
    
    public static SubLObject f36256(final SubLObject var432, final SubLObject var433) {
        return module0213.f13942(var432, var433);
    }
    
    public static SubLObject f36257(final SubLObject var434, final SubLObject var435) {
        if (module0592.NIL == module0269.f17710(var434) || module0592.NIL == module0269.f17710(var435)) {
            module0229.f15259();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0592.NIL == module0256.f16596(var434, var435, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED) && module0592.NIL == module0256.f16596(var435, var434, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED) && module0592.NIL == module0257.f16689(var434, var435, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED));
    }
    
    public static SubLObject f36258(final SubLObject var436) {
        return module0075.f5215(var436);
    }
    
    public static SubLObject f36259(final SubLObject var437) {
        SubLObject var438 = (SubLObject)ConsesLow.list(module0592.$ic120$);
        SubLObject var439 = var437.rest();
        SubLObject var440 = (SubLObject)module0592.NIL;
        var440 = var439.first();
        while (module0592.NIL != var439) {
            SubLObject var441 = (SubLObject)ConsesLow.list(module0592.$ic120$);
            SubLObject var5_440 = var440.rest();
            SubLObject var442 = (SubLObject)module0592.NIL;
            var442 = var5_440.first();
            while (module0592.NIL != var5_440) {
                var441 = (SubLObject)ConsesLow.cons(f36260(var442), var441);
                var5_440 = var5_440.rest();
                var442 = var5_440.first();
            }
            var438 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var441), var438);
            var439 = var439.rest();
            var440 = var439.first();
        }
        return Sequences.nreverse(var438);
    }
    
    public static SubLObject f36260(final SubLObject var442) {
        final SubLThread var443 = SubLProcess.currentSubLThread();
        if (module0592.NIL == Errors.$ignore_mustsP$.getDynamicValue(var443) && !module0592.$ic120$.eql(var442.first())) {
            Errors.error((SubLObject)module0592.$ic275$, var442);
        }
        final SubLObject var444 = module0205.f13203(var442, (SubLObject)module0592.UNPROVIDED);
        if (module0592.NIL != module0269.f17708(var444)) {
            return module0205.f13207(var442, (SubLObject)module0592.UNPROVIDED);
        }
        if (module0592.NIL != module0269.f17706(var444)) {
            return module0205.f13207(var442, (SubLObject)module0592.UNPROVIDED);
        }
        return var442;
    }
    
    public static SubLObject f36261(final SubLObject var443) {
        final SubLThread var444 = SubLProcess.currentSubLThread();
        if (module0592.NIL != module0202.f12598(var443)) {
            var444.resetMultipleValues();
            final SubLObject var445 = module0202.f12796(var443);
            final SubLObject var446 = var444.secondMultipleValue();
            final SubLObject var447 = var444.thirdMultipleValue();
            var444.resetMultipleValues();
            SubLObject var448 = f36262(var445, var446, var447);
            if (module0592.NIL == var448 && module0592.NIL != module0202.f12659(var446)) {
                final SubLObject var449 = var445;
                if (var449.eql(module0592.$ic158$)) {
                    final SubLObject var450 = module0226.f14990(module0205.f13366(var446), (SubLObject)module0592.UNPROVIDED);
                    var448 = module0256.f16604(var447, var450, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
                }
                else if (var449.eql(module0592.$ic276$)) {
                    final SubLObject var450 = module0226.f14996(module0205.f13366(var446), (SubLObject)module0592.UNPROVIDED);
                    var448 = module0256.f16604(var447, var450, (SubLObject)module0592.UNPROVIDED, (SubLObject)module0592.UNPROVIDED);
                }
            }
            return var448;
        }
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36262(final SubLObject var6, final SubLObject var444, final SubLObject var323) {
        final SubLThread var445 = SubLProcess.currentSubLThread();
        final SubLObject var446 = module0144.$g1870$.currentBinding(var445);
        try {
            module0144.$g1870$.bind((SubLObject)module0592.NIL, var445);
            if (var6.eql(module0592.$ic158$)) {
                return module0305.f20414(var323, var444, (SubLObject)module0592.UNPROVIDED);
            }
            if (var6.eql(module0592.$ic276$)) {
                return module0305.f20423(var323, var444, (SubLObject)module0592.UNPROVIDED);
            }
        }
        finally {
            module0144.$g1870$.rebind(var446, var445);
        }
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36263() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36112", "S#33871", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36113", "CYC-TRUE-SUBL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36115", "CYC-DIFFERENT", 1, 0, false);
        new $f36115$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36116", "CYC-DIFFERENT-SYMBOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36117", "CYC-STRING-PRECEDES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36119", "CYC-STRING-PRECEDES-CASE-INSENSITIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36118", "S#39918", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36120", "CYC-SUBSTRING-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36122", "CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36121", "S#39919", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36123", "CYC-PREFIX-SUBSTRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36124", "CYC-SUFFIX-SUBSTRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36125", "CYC-SUBWORD-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36126", "CYC-FIND-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36127", "S#33872", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36114", "CYC-EVALUATE-SUBL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36128", "CYC-STRING-UPCASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36129", "S#39920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36130", "CYC-STRING-DOWNCASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36131", "CYC-SUBSTRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36133", "CYC-STRING-CONCAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36134", "CYC-STRINGS-TO-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36135", "CYC-PRE-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36136", "CYC-REPLACE-SUBSTRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36137", "S#39921", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36138", "CYC-UNIQUE-WS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36139", "GENERATE-NAMES-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36140", "CYC-REMOVE-SUBSTRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36141", "CYC-POST-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36142", "CYC-TRIM-WHITESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36143", "CYC-STRING-SEARCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36132", "CYC-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36144", "CYC-STRING-TO-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36145", "CYC-INTEGER-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36146", "CYC-STRINGIFY-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36147", "CYC-STRING-TO-REAL-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36148", "CYC-REAL-NUMBER-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36149", "S#39922", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36150", "CYC-STRING-TOKENIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36151", "CYC-STRING-TO-NTH-CODE-POINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36152", "CYC-HTTP-URL-ENCODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36153", "CYC-XML-VALUE-STRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36155", "CYC-HTTP-URL-DECODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36156", "CYC-HTML-IMAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36157", "S#39923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36159", "CYC-HTML-TABLE-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36161", "CYC-HTML-TABLE-DATA-VARIABLE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36160", "S#39924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36162", "CYC-HTML-TABLE-ROW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36164", "CYC-HTML-TABLE-ROW-VARIABLE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36163", "S#39925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36165", "CYC-HTML-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36167", "CYC-HTML-TABLE-VARIABLE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36166", "S#39926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36168", "CYC-HTML-DIVISION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36170", "CYC-HTML-DIVISION-VARIABLE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36171", "S#39927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36169", "S#39928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36158", "S#39929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36172", "S#39930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36173", "S#39931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36174", "CYC-CONTEXTUAL-URL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36154", "S#39932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36175", "CYC-TERM-FROM-SPARQL-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36176", "OPEN-CYC-URI-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36177", "CANONICAL-URI-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36178", "S#39933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36179", "CYC-REMOVE-HTML-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36180", "CYC-CAPITALIZE-SMART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36181", "CYC-RECAPITALIZE-SMART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36182", "CYC-RELATION-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36183", "CYC-RELATION-ARGS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36184", "CYC-RELATION-ARG-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36185", "CYC-QUOTED-RELATION-EXPRESSION-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36186", "CYC-RELATION-EXPRESSION-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36187", "CYC-IDENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36188", "CYC-RELATION-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36189", "S#39934", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36190", "S#39935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36191", "CYC-SUBSTITUTE-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36192", "CYC-BILATERAL-FORM-OF-SENTENCE-LEFT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36194", "S#39936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36195", "S#39937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36196", "CYC-BILATERAL-FORM-OF-SENTENCE-RIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36193", "S#39938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36197", "S#39939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36198", "S#39940", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36199", "S#39941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36200", "CYC-SUBSTITUTE-FORMULA-ARG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36201", "CYC-SUBSTITUTE-FORMULA-ARG-POSITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36202", "CYC-MAKE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36203", "CYC-SUBSTITUTE-QUOTED-FORMULA-ARG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36204", "CYC-SUBSTITUTE-QUOTED-FORMULA-ARG-POSITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36205", "CYC-MAKE-QUOTED-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36206", "CYCL-TO-EL-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36207", "CYC-SUBSTITUTE-NLTE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36208", "SEM-TRANS-TEMPLATE-DEFN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36209", "CYC-WORD-STRINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36210", "S#39942", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36211", "S#39943", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36212", "CYC-STRINGS-OF-WORD-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36213", "CYC-INSTANTIATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36216", "CYC-FIND-OR-INSTANTIATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36214", "S#39944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36215", "S#39945", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36217", "CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36219", "CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36218", "S#39946", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36220", "S#39947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36221", "S#39948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36222", "CYC-EL-VARIABLE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36223", "CYC-ADD-ENGLISH-SUFFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36224", "GENERATE-PHRASE-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36226", "S#39949", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36225", "S#39950", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36227", "BEST-STRING-OF-NL-PHRASE-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36228", "GENERATE-GKE-GLOSS-WRT-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36229", "BASIC-DATUM-PARAPHRASE-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36230", "S#39951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36231", "STATE-OR-PROVINCE-FOR-CITY-DEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36232", "CYC-HTML-URL-ENCODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36233", "CYC-URL-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36234", "CYC-GET-FROM-HTTP-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36235", "S#39952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36236", "CYC-TERM-URI-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36237", "CITY-NAMED-FN-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36238", "S#39953", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36239", "TEXT-TOPIC-STRUCTURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36240", "EL-LIST-TO-SUBL-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36241", "CYC-ORDERING-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36243", "S#39954", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36242", "S#39955", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36244", "CYC-SECONDS-SINCE-1970-TO-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36245", "CYC-DATE-TO-SECONDS-SINCE-1970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36246", "CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36247", "S#39956", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36248", "S#39957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36249", "CYC-HTML-FOR-TEXT-CONTAINING-STRINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36250", "S#39958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36251", "CYC-FORMAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36252", "CYC-NEXT-INTEGER-IN-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36253", "CYC-NEXT-INTEGER-IN-SEQUENCE-STARTING-AT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36254", "CYC-CONCATENATE-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36255", "S#39959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36256", "CYC-TERM-SIMILARITY-METRIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36257", "CYC-KB-ORTHOGONAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36258", "CYC-CONTENT-OF-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36259", "CYC-TRANSFORM-RELATION-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36260", "S#39960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36261", "CYC-PROVABLE-VIA-DEFNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0592", "f36262", "S#39961", 3, 0, false);
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36264() {
        module0592.$g4506$ = SubLFiles.deflexical("S#39962", (SubLObject)module0592.$ic0$);
        module0592.$g4507$ = SubLFiles.deflexical("S#39963", (SubLObject)module0592.$ic52$);
        module0592.$g4508$ = SubLFiles.defparameter("S#39964", (SubLObject)module0592.NIL);
        module0592.$g4509$ = SubLFiles.deflexical("S#39965", (SubLObject)module0592.NIL);
        module0592.$g4510$ = SubLFiles.deflexical("S#39966", (SubLObject)module0592.NIL);
        module0592.$g4511$ = SubLFiles.deflexical("S#39967", (SubLObject)((module0592.NIL != Symbols.boundp((SubLObject)module0592.$ic173$)) ? module0592.$g4511$.getGlobalValue() : module0592.NIL));
        module0592.$g4512$ = SubLFiles.defparameter("S#39968", (SubLObject)module0592.NIL);
        module0592.$g4514$ = SubLFiles.deflexical("S#39969", Locks.make_lock((SubLObject)module0592.$ic256$));
        module0592.$g4515$ = SubLFiles.deflexical("S#39970", (module0592.NIL != Symbols.boundp((SubLObject)module0592.$ic257$)) ? module0592.$g4515$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0592.EQUAL), (SubLObject)module0592.UNPROVIDED));
        module0592.$g4516$ = SubLFiles.deflexical("S#39971", Locks.make_lock((SubLObject)module0592.$ic259$));
        module0592.$g4517$ = SubLFiles.deflexical("S#39972", (module0592.NIL != Symbols.boundp((SubLObject)module0592.$ic260$)) ? module0592.$g4517$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0592.EQUAL), (SubLObject)module0592.UNPROVIDED));
        return (SubLObject)module0592.NIL;
    }
    
    public static SubLObject f36265() {
        SubLObject var5 = module0592.$g4506$.getGlobalValue();
        SubLObject var6 = (SubLObject)module0592.NIL;
        var6 = var5.first();
        while (module0592.NIL != var5) {
            module0012.f416(var6);
            var5 = var5.rest();
            var6 = var5.first();
        }
        module0012.f416((SubLObject)module0592.$ic5$);
        module0012.f416((SubLObject)module0592.$ic7$);
        module0012.f416((SubLObject)module0592.$ic8$);
        module0012.f416((SubLObject)module0592.$ic9$);
        module0012.f416((SubLObject)module0592.$ic10$);
        module0012.f416((SubLObject)module0592.$ic12$);
        module0012.f416((SubLObject)module0592.$ic14$);
        module0012.f416((SubLObject)module0592.$ic15$);
        module0012.f416((SubLObject)module0592.$ic16$);
        module0012.f416((SubLObject)module0592.$ic17$);
        module0012.f416((SubLObject)module0592.$ic20$);
        module0012.f416((SubLObject)module0592.$ic22$);
        module0012.f416((SubLObject)module0592.$ic23$);
        module0002.f35((SubLObject)module0592.$ic24$, (SubLObject)module0592.$ic25$);
        module0012.f416((SubLObject)module0592.$ic26$);
        module0012.f416((SubLObject)module0592.$ic27$);
        module0012.f416((SubLObject)module0592.$ic30$);
        module0012.f416((SubLObject)module0592.$ic33$);
        module0012.f416((SubLObject)module0592.$ic34$);
        module0012.f416((SubLObject)module0592.$ic37$);
        module0012.f416((SubLObject)module0592.$ic38$);
        module0012.f416((SubLObject)module0592.$ic39$);
        module0012.f416((SubLObject)module0592.$ic40$);
        module0012.f416((SubLObject)module0592.$ic41$);
        module0012.f416((SubLObject)module0592.$ic42$);
        module0012.f416((SubLObject)module0592.$ic43$);
        module0012.f416((SubLObject)module0592.$ic44$);
        module0012.f416((SubLObject)module0592.$ic46$);
        module0012.f416((SubLObject)module0592.$ic47$);
        module0012.f416((SubLObject)module0592.$ic48$);
        module0012.f416((SubLObject)module0592.$ic49$);
        module0012.f416((SubLObject)module0592.$ic51$);
        module0012.f416((SubLObject)module0592.$ic53$);
        module0012.f416((SubLObject)module0592.$ic54$);
        module0012.f416((SubLObject)module0592.$ic55$);
        module0012.f416((SubLObject)module0592.$ic58$);
        module0012.f416((SubLObject)module0592.$ic59$);
        module0012.f416((SubLObject)module0592.$ic71$);
        module0012.f416((SubLObject)module0592.$ic79$);
        module0012.f416((SubLObject)module0592.$ic81$);
        module0012.f416((SubLObject)module0592.$ic84$);
        module0012.f416((SubLObject)module0592.$ic86$);
        module0012.f416((SubLObject)module0592.$ic95$);
        module0012.f416((SubLObject)module0592.$ic96$);
        module0012.f416((SubLObject)module0592.$ic101$);
        module0012.f416((SubLObject)module0592.$ic102$);
        module0012.f416((SubLObject)module0592.$ic109$);
        module0012.f416((SubLObject)module0592.$ic112$);
        module0012.f416((SubLObject)module0592.$ic113$);
        module0012.f416((SubLObject)module0592.$ic114$);
        module0012.f416((SubLObject)module0592.$ic116$);
        module0012.f416((SubLObject)module0592.$ic117$);
        module0012.f416((SubLObject)module0592.$ic118$);
        module0012.f416((SubLObject)module0592.$ic119$);
        module0012.f416((SubLObject)module0592.$ic121$);
        module0012.f416((SubLObject)module0592.$ic123$);
        module0012.f416((SubLObject)module0592.$ic124$);
        module0012.f416((SubLObject)module0592.$ic125$);
        module0012.f416((SubLObject)module0592.$ic126$);
        module0012.f416((SubLObject)module0592.$ic127$);
        module0012.f416((SubLObject)module0592.$ic129$);
        module0012.f416((SubLObject)module0592.$ic132$);
        module0012.f416((SubLObject)module0592.$ic136$);
        module0012.f416((SubLObject)module0592.$ic142$);
        module0012.f416((SubLObject)module0592.$ic143$);
        module0012.f416((SubLObject)module0592.$ic144$);
        module0012.f416((SubLObject)module0592.$ic145$);
        module0012.f416((SubLObject)module0592.$ic146$);
        module0012.f416((SubLObject)module0592.$ic147$);
        module0012.f416((SubLObject)module0592.$ic148$);
        module0012.f416((SubLObject)module0592.$ic149$);
        module0012.f416((SubLObject)module0592.$ic150$);
        module0012.f416((SubLObject)module0592.$ic151$);
        module0012.f416((SubLObject)module0592.$ic154$);
        module0012.f416((SubLObject)module0592.$ic155$);
        module0012.f416((SubLObject)module0592.$ic157$);
        module0012.f416((SubLObject)module0592.$ic164$);
        module0012.f416((SubLObject)module0592.$ic166$);
        module0012.f416((SubLObject)module0592.$ic171$);
        module0012.f416((SubLObject)module0592.$ic172$);
        module0003.f57((SubLObject)module0592.$ic173$);
        module0012.f416((SubLObject)module0592.$ic174$);
        module0034.f1895((SubLObject)module0592.$ic175$);
        module0012.f416((SubLObject)module0592.$ic178$);
        module0012.f416((SubLObject)module0592.$ic179$);
        module0012.f416((SubLObject)module0592.$ic180$);
        module0012.f416((SubLObject)module0592.$ic189$);
        module0012.f416((SubLObject)module0592.$ic190$);
        module0012.f416((SubLObject)module0592.$ic195$);
        module0012.f416((SubLObject)module0592.$ic210$);
        module0012.f416((SubLObject)module0592.$ic216$);
        module0012.f416((SubLObject)module0592.$ic219$);
        module0012.f416((SubLObject)module0592.$ic221$);
        module0012.f416((SubLObject)module0592.$ic222$);
        module0012.f416((SubLObject)module0592.$ic231$);
        module0012.f416((SubLObject)module0592.$ic235$);
        module0012.f416((SubLObject)module0592.$ic236$);
        module0012.f416((SubLObject)module0592.$ic237$);
        module0012.f416((SubLObject)module0592.$ic253$);
        module0012.f416((SubLObject)module0592.$ic255$);
        module0003.f57((SubLObject)module0592.$ic257$);
        module0012.f416((SubLObject)module0592.$ic258$);
        module0003.f57((SubLObject)module0592.$ic260$);
        module0012.f416((SubLObject)module0592.$ic261$);
        module0012.f416((SubLObject)module0592.$ic263$);
        module0027.f1449((SubLObject)module0592.$ic263$, (SubLObject)ConsesLow.list(new SubLObject[] { module0592.$ic264$, module0592.NIL, module0592.$ic265$, module0592.NIL, module0592.$ic266$, module0592.NIL, module0592.$ic267$, module0592.$ic268$, module0592.$ic269$, module0592.T }), (SubLObject)module0592.$ic270$);
        module0012.f416((SubLObject)module0592.$ic271$);
        module0012.f416((SubLObject)module0592.$ic272$);
        module0012.f416((SubLObject)module0592.$ic273$);
        module0012.f416((SubLObject)module0592.$ic274$);
        module0012.f416((SubLObject)module0592.$ic277$);
        return (SubLObject)module0592.NIL;
    }
    
    public void declareFunctions() {
        f36263();
    }
    
    public void initializeVariables() {
        f36264();
    }
    
    public void runTopLevelForms() {
        f36265();
    }
    
    static {
        me = (SubLFile)new module0592();
        module0592.$g4506$ = null;
        module0592.$g4507$ = null;
        module0592.$g4508$ = null;
        module0592.$g4509$ = null;
        module0592.$g4510$ = null;
        module0592.$g4511$ = null;
        module0592.$g4512$ = null;
        module0592.$g4514$ = null;
        module0592.$g4515$ = null;
        module0592.$g4516$ = null;
        module0592.$g4517$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTED-WHEN"));
        $ic1$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("evaluationDefn"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EvaluatablePredicate"));
        $ic5$ = SubLObjectFactory.makeSymbol("CYC-TRUE-SUBL");
        $ic6$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic7$ = SubLObjectFactory.makeSymbol("CYC-DIFFERENT");
        $ic8$ = SubLObjectFactory.makeSymbol("CYC-DIFFERENT-SYMBOLS");
        $ic9$ = SubLObjectFactory.makeSymbol("CYC-STRING-PRECEDES");
        $ic10$ = SubLObjectFactory.makeSymbol("CYC-STRING-PRECEDES-CASE-INSENSITIVE");
        $ic11$ = SubLObjectFactory.makeSymbol("CHAR=");
        $ic12$ = SubLObjectFactory.makeSymbol("CYC-SUBSTRING-PREDICATE");
        $ic13$ = SubLObjectFactory.makeSymbol("CHAR-EQUAL");
        $ic14$ = SubLObjectFactory.makeSymbol("CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE");
        $ic15$ = SubLObjectFactory.makeSymbol("CYC-PREFIX-SUBSTRING");
        $ic16$ = SubLObjectFactory.makeSymbol("CYC-SUFFIX-SUBSTRING");
        $ic17$ = SubLObjectFactory.makeSymbol("CYC-SUBWORD-PREDICATE");
        $ic18$ = SubLObjectFactory.makeString("Could not find constant ~A.");
        $ic19$ = SubLObjectFactory.makeString("Arg1 of #$FindConstantFn must be a string: ~A.");
        $ic20$ = SubLObjectFactory.makeSymbol("CYC-FIND-CONSTANT");
        $ic21$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EvaluatableFunction"));
        $ic22$ = SubLObjectFactory.makeSymbol("CYC-EVALUATE-SUBL");
        $ic23$ = SubLObjectFactory.makeSymbol("CYC-STRING-UPCASE");
        $ic24$ = SubLObjectFactory.makeSymbol("S#39920", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-STRING-UPCASE"));
        $ic26$ = SubLObjectFactory.makeSymbol("CYC-STRING-DOWNCASE");
        $ic27$ = SubLObjectFactory.makeSymbol("CYC-SUBSTRING");
        $ic28$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic29$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic30$ = SubLObjectFactory.makeSymbol("CYC-STRING-CONCAT");
        $ic31$ = SubLObjectFactory.makeString("");
        $ic32$ = SubLObjectFactory.makeString(" ");
        $ic33$ = SubLObjectFactory.makeSymbol("CYC-STRINGS-TO-PHRASE");
        $ic34$ = SubLObjectFactory.makeSymbol("CYC-PRE-REMOVE");
        $ic35$ = SubLObjectFactory.makeInteger(128);
        $ic36$ = SubLObjectFactory.makeSymbol("<=");
        $ic37$ = SubLObjectFactory.makeSymbol("CYC-REPLACE-SUBSTRING");
        $ic38$ = SubLObjectFactory.makeSymbol("CYC-UNIQUE-WS");
        $ic39$ = SubLObjectFactory.makeSymbol("GENERATE-NAMES-FOR-TERM");
        $ic40$ = SubLObjectFactory.makeSymbol("CYC-REMOVE-SUBSTRING");
        $ic41$ = SubLObjectFactory.makeSymbol("CYC-POST-REMOVE");
        $ic42$ = SubLObjectFactory.makeSymbol("CYC-TRIM-WHITESPACE");
        $ic43$ = SubLObjectFactory.makeSymbol("CYC-STRING-SEARCH");
        $ic44$ = SubLObjectFactory.makeSymbol("CYC-LENGTH");
        $ic45$ = SubLObjectFactory.makeString(",");
        $ic46$ = SubLObjectFactory.makeSymbol("CYC-STRING-TO-INTEGER");
        $ic47$ = SubLObjectFactory.makeSymbol("CYC-INTEGER-TO-STRING");
        $ic48$ = SubLObjectFactory.makeSymbol("CYC-STRINGIFY-FN");
        $ic49$ = SubLObjectFactory.makeSymbol("CYC-STRING-TO-REAL-NUMBER");
        $ic50$ = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $ic51$ = SubLObjectFactory.makeSymbol("CYC-REAL-NUMBER-TO-STRING");
        $ic52$ = SubLObjectFactory.makeInteger(1000);
        $ic53$ = SubLObjectFactory.makeSymbol("CYC-STRING-TOKENIZE");
        $ic54$ = SubLObjectFactory.makeSymbol("CYC-STRING-TO-NTH-CODE-POINT");
        $ic55$ = SubLObjectFactory.makeSymbol("CYC-HTTP-URL-ENCODE");
        $ic56$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("CYC-XML-VALUE-STRING");
        $ic59$ = SubLObjectFactory.makeSymbol("CYC-HTTP-URL-DECODE");
        $ic60$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#1519", "CYC"), SubLObjectFactory.makeSymbol("CLASS"), SubLObjectFactory.makeSymbol("S#894", "CYC"), SubLObjectFactory.makeSymbol("S#895", "CYC"), SubLObjectFactory.makeSymbol("S#896", "CYC"), SubLObjectFactory.makeSymbol("S#1549", "CYC"), SubLObjectFactory.makeSymbol("S#1550", "CYC"), SubLObjectFactory.makeSymbol("S#1560", "CYC") });
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("ISMAP"), (SubLObject)SubLObjectFactory.makeKeyword("HEIGHT"), (SubLObject)SubLObjectFactory.makeKeyword("WIDTH"), (SubLObject)SubLObjectFactory.makeKeyword("ALT"), (SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("BORDER"));
        $ic62$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic63$ = SubLObjectFactory.makeKeyword("ID");
        $ic64$ = SubLObjectFactory.makeKeyword("CLASS");
        $ic65$ = SubLObjectFactory.makeKeyword("ISMAP");
        $ic66$ = SubLObjectFactory.makeKeyword("HEIGHT");
        $ic67$ = SubLObjectFactory.makeKeyword("WIDTH");
        $ic68$ = SubLObjectFactory.makeKeyword("ALT");
        $ic69$ = SubLObjectFactory.makeKeyword("ALIGN");
        $ic70$ = SubLObjectFactory.makeKeyword("BORDER");
        $ic71$ = SubLObjectFactory.makeSymbol("CYC-HTML-IMAGE");
        $ic72$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#1577", "CYC"), SubLObjectFactory.makeSymbol("S#1584", "CYC"), SubLObjectFactory.makeSymbol("S#1585", "CYC"), SubLObjectFactory.makeSymbol("S#1550", "CYC"), SubLObjectFactory.makeSymbol("S#1586", "CYC"), SubLObjectFactory.makeSymbol("S#1582", "CYC"), SubLObjectFactory.makeSymbol("S#896", "CYC"), SubLObjectFactory.makeSymbol("S#895", "CYC"), SubLObjectFactory.makeSymbol("S#1519", "CYC") });
        $ic73$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NOWRAP"), SubLObjectFactory.makeKeyword("COLSPAN"), SubLObjectFactory.makeKeyword("ROWSPAN"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("VALIGN"), SubLObjectFactory.makeKeyword("BGCOLOR"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("HEIGHT"), SubLObjectFactory.makeKeyword("ID") });
        $ic74$ = SubLObjectFactory.makeKeyword("NOWRAP");
        $ic75$ = SubLObjectFactory.makeKeyword("COLSPAN");
        $ic76$ = SubLObjectFactory.makeKeyword("ROWSPAN");
        $ic77$ = SubLObjectFactory.makeKeyword("VALIGN");
        $ic78$ = SubLObjectFactory.makeKeyword("BGCOLOR");
        $ic79$ = SubLObjectFactory.makeSymbol("CYC-HTML-TABLE-DATA");
        $ic80$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#6511", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1525", "CYC"));
        $ic81$ = SubLObjectFactory.makeSymbol("CYC-HTML-TABLE-DATA-VARIABLE-ARITY");
        $ic82$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#1550", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1586", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#895", "CYC"));
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("VALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("BGCOLOR"), (SubLObject)SubLObjectFactory.makeKeyword("HEIGHT"));
        $ic84$ = SubLObjectFactory.makeSymbol("CYC-HTML-TABLE-ROW");
        $ic85$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#6511", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"));
        $ic86$ = SubLObjectFactory.makeSymbol("CYC-HTML-TABLE-ROW-VARIABLE-ARITY");
        $ic87$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#1576", "CYC"), SubLObjectFactory.makeSymbol("S#1577", "CYC"), SubLObjectFactory.makeSymbol("S#1550", "CYC"), SubLObjectFactory.makeSymbol("S#1560", "CYC"), SubLObjectFactory.makeSymbol("S#1578", "CYC"), SubLObjectFactory.makeSymbol("S#1579", "CYC"), SubLObjectFactory.makeSymbol("S#1580", "CYC"), SubLObjectFactory.makeSymbol("S#1581", "CYC"), SubLObjectFactory.makeSymbol("S#1582", "CYC"), SubLObjectFactory.makeSymbol("S#896", "CYC"), SubLObjectFactory.makeSymbol("S#1583", "CYC") });
        $ic88$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NOFLOW"), SubLObjectFactory.makeKeyword("NOWRAP"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("BORDER"), SubLObjectFactory.makeKeyword("CELLPADDING"), SubLObjectFactory.makeKeyword("CELLSPACING"), SubLObjectFactory.makeKeyword("COLSPEC"), SubLObjectFactory.makeKeyword("UNITS"), SubLObjectFactory.makeKeyword("BGCOLOR"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("BACKGROUND") });
        $ic89$ = SubLObjectFactory.makeKeyword("NOFLOW");
        $ic90$ = SubLObjectFactory.makeKeyword("CELLPADDING");
        $ic91$ = SubLObjectFactory.makeKeyword("CELLSPACING");
        $ic92$ = SubLObjectFactory.makeKeyword("COLSPEC");
        $ic93$ = SubLObjectFactory.makeKeyword("UNITS");
        $ic94$ = SubLObjectFactory.makeKeyword("BACKGROUND");
        $ic95$ = SubLObjectFactory.makeSymbol("CYC-HTML-TABLE");
        $ic96$ = SubLObjectFactory.makeSymbol("CYC-HTML-TABLE-VARIABLE-ARITY");
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("S#1520", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1513", "CYC"));
        $ic98$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("STYLE"), (SubLObject)SubLObjectFactory.makeKeyword("ONLOAD"));
        $ic99$ = SubLObjectFactory.makeKeyword("STYLE");
        $ic100$ = SubLObjectFactory.makeKeyword("ONLOAD");
        $ic101$ = SubLObjectFactory.makeSymbol("CYC-HTML-DIVISION");
        $ic102$ = SubLObjectFactory.makeSymbol("CYC-HTML-DIVISION-VARIABLE-ARITY");
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39973", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39974", "CYC"));
        $ic104$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic105$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Percent")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic106$ = SubLObjectFactory.makeString("%");
        $ic107$ = SubLObjectFactory.makeSymbol("S#39931", "CYC");
        $ic108$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("URLFn"));
        $ic109$ = SubLObjectFactory.makeSymbol("CYC-CONTEXTUAL-URL");
        $ic110$ = ConsesLow.list((SubLObject)Characters.CHAR_less);
        $ic111$ = ConsesLow.list((SubLObject)Characters.CHAR_greater);
        $ic112$ = SubLObjectFactory.makeSymbol("CYC-TERM-FROM-SPARQL-URI");
        $ic113$ = SubLObjectFactory.makeSymbol("OPEN-CYC-URI-FOR-TERM");
        $ic114$ = SubLObjectFactory.makeSymbol("CANONICAL-URI-FOR-TERM");
        $ic115$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ResourceWithURIFn"));
        $ic116$ = SubLObjectFactory.makeSymbol("CYC-REMOVE-HTML-TAGS");
        $ic117$ = SubLObjectFactory.makeSymbol("CYC-CAPITALIZE-SMART");
        $ic118$ = SubLObjectFactory.makeSymbol("CYC-RECAPITALIZE-SMART");
        $ic119$ = SubLObjectFactory.makeSymbol("CYC-RELATION-ARG");
        $ic120$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheList"));
        $ic121$ = SubLObjectFactory.makeSymbol("CYC-RELATION-ARGS-LIST");
        $ic122$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $ic123$ = SubLObjectFactory.makeSymbol("CYC-RELATION-ARG-SET");
        $ic124$ = SubLObjectFactory.makeSymbol("CYC-QUOTED-RELATION-EXPRESSION-ARITY");
        $ic125$ = SubLObjectFactory.makeSymbol("CYC-RELATION-EXPRESSION-ARITY");
        $ic126$ = SubLObjectFactory.makeSymbol("CYC-IDENTITY");
        $ic127$ = SubLObjectFactory.makeSymbol("CYC-RELATION-TUPLES");
        $ic128$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Kappa"));
        $ic129$ = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-FORMULA");
        $ic130$ = SubLObjectFactory.makeSymbol("S#39936", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#39937", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("CYC-BILATERAL-FORM-OF-SENTENCE-LEFT");
        $ic133$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SymmetricAnatomicalPartType"));
        $ic134$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LeftObjectOfPairFn"));
        $ic135$ = SubLObjectFactory.makeSymbol("S#39939", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("CYC-BILATERAL-FORM-OF-SENTENCE-RIGHT");
        $ic137$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("RightObjectOfPairFn"));
        $ic138$ = SubLObjectFactory.makeSymbol("S#39941", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("NAT-ARG1");
        $ic140$ = SubLObjectFactory.makeSymbol("?SIDEFN");
        $ic141$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Quote"));
        $ic142$ = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG");
        $ic143$ = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG-POSITION");
        $ic144$ = SubLObjectFactory.makeSymbol("CYC-MAKE-FORMULA");
        $ic145$ = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-QUOTED-FORMULA-ARG");
        $ic146$ = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-QUOTED-FORMULA-ARG-POSITION");
        $ic147$ = SubLObjectFactory.makeSymbol("CYC-MAKE-QUOTED-FORMULA");
        $ic148$ = SubLObjectFactory.makeSymbol("CYCL-TO-EL-FN");
        $ic149$ = SubLObjectFactory.makeSymbol("CYC-SUBSTITUTE-NLTE");
        $ic150$ = SubLObjectFactory.makeSymbol("SEM-TRANS-TEMPLATE-DEFN");
        $ic151$ = SubLObjectFactory.makeSymbol("CYC-WORD-STRINGS");
        $ic152$ = SubLObjectFactory.makeString("WordStringsFn");
        $ic153$ = SubLObjectFactory.makeString("WordSequenceFn");
        $ic154$ = SubLObjectFactory.makeSymbol("CYC-STRINGS-OF-WORD-SEQUENCE");
        $ic155$ = SubLObjectFactory.makeSymbol("CYC-INSTANTIATE");
        $ic156$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0592.ONE_INTEGER);
        $ic157$ = SubLObjectFactory.makeSymbol("CYC-FIND-OR-INSTANTIATE");
        $ic158$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic159$ = SubLObjectFactory.makeSymbol("?OBJ");
        $ic160$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $ic161$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $ic162$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $ic163$ = SubLObjectFactory.makeSymbol("S#39948", "CYC");
        $ic164$ = SubLObjectFactory.makeSymbol("CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR");
        $ic165$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultGenl"));
        $ic166$ = SubLObjectFactory.makeSymbol("CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR");
        $ic167$ = SubLObjectFactory.makeSymbol("S#39947", "CYC");
        $ic168$ = SubLObjectFactory.makeSymbol("SKOLEM-FUNCTION?");
        $ic169$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnaryFunction"));
        $ic170$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IndividualDenotingFunction"));
        $ic171$ = SubLObjectFactory.makeSymbol("CYC-EL-VARIABLE-FN");
        $ic172$ = SubLObjectFactory.makeSymbol("CYC-ADD-ENGLISH-SUFFIX");
        $ic173$ = SubLObjectFactory.makeSymbol("S#39967", "CYC");
        $ic174$ = SubLObjectFactory.makeSymbol("GENERATE-PHRASE-DEFN");
        $ic175$ = SubLObjectFactory.makeSymbol("S#39950", "CYC");
        $ic176$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic177$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic178$ = SubLObjectFactory.makeSymbol("BEST-STRING-OF-NL-PHRASE-DEFN");
        $ic179$ = SubLObjectFactory.makeSymbol("GENERATE-GKE-GLOSS-WRT-MT");
        $ic180$ = SubLObjectFactory.makeSymbol("BASIC-DATUM-PARAPHRASE-DEFN");
        $ic181$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic182$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestNLPhraseOfStringFn")), (SubLObject)SubLObjectFactory.makeString(","));
        $ic183$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn-Constrained"));
        $ic184$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $ic185$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ConcatenatePhrasesFn"));
        $ic186$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("geopoliticalSubdivision"));
        $ic187$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("State-UnitedStates"));
        $ic188$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CanadianProvince"));
        $ic189$ = SubLObjectFactory.makeSymbol("STATE-OR-PROVINCE-FOR-CITY-DEFN");
        $ic190$ = SubLObjectFactory.makeSymbol("CYC-HTML-URL-ENCODE");
        $ic191$ = SubLObjectFactory.makeInteger(255);
        $ic192$ = SubLObjectFactory.makeSymbol("<");
        $ic193$ = SubLObjectFactory.makeSymbol("CHAR-CODE");
        $ic194$ = SubLObjectFactory.makeString("charset=utf-8");
        $ic195$ = SubLObjectFactory.makeSymbol("CYC-URL-SOURCE");
        $ic196$ = SubLObjectFactory.makeInteger(80);
        $ic197$ = SubLObjectFactory.makeKeyword("PRIVATE");
        $ic198$ = SubLObjectFactory.makeKeyword("MACHINE");
        $ic199$ = SubLObjectFactory.makeKeyword("PORT");
        $ic200$ = SubLObjectFactory.makeKeyword("METHOD");
        $ic201$ = SubLObjectFactory.makeKeyword("GET");
        $ic202$ = SubLObjectFactory.makeKeyword("URL");
        $ic203$ = SubLObjectFactory.makeString("simple-http-get");
        $ic204$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic205$ = SubLObjectFactory.makeKeyword("KEEP-ALIVE?");
        $ic206$ = SubLObjectFactory.makeKeyword("WIDE-NEWLINES?");
        $ic207$ = SubLObjectFactory.makeKeyword("ACCEPT-TYPES");
        $ic208$ = SubLObjectFactory.makeKeyword("CONTENT-TYPE");
        $ic209$ = SubLObjectFactory.makeKeyword("SOAP-ACTION-URI");
        $ic210$ = SubLObjectFactory.makeSymbol("CYC-GET-FROM-HTTP-SOURCE");
        $ic211$ = SubLObjectFactory.makeString("\"");
        $ic212$ = SubLObjectFactory.makeString("&");
        $ic213$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn"));
        $ic214$ = SubLObjectFactory.makeString("<");
        $ic215$ = SubLObjectFactory.makeString(">");
        $ic216$ = SubLObjectFactory.makeSymbol("CYC-TERM-URI-FN");
        $ic217$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("City"));
        $ic218$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CityNamedFn"));
        $ic219$ = SubLObjectFactory.makeSymbol("CITY-NAMED-FN-DEFN");
        $ic220$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOWED-MODULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI"))));
        $ic221$ = SubLObjectFactory.makeSymbol("TEXT-TOPIC-STRUCTURE");
        $ic222$ = SubLObjectFactory.makeSymbol("EL-LIST-TO-SUBL-LIST");
        $ic223$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic224$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic225$ = SubLObjectFactory.makeKeyword("BASE-SET");
        $ic226$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("baseSet"));
        $ic227$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BASE-SET"));
        $ic228$ = SubLObjectFactory.makeKeyword("ORDERING-RELATION");
        $ic229$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("orderingRelation"));
        $ic230$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ORDERING-RELATION"));
        $ic231$ = SubLObjectFactory.makeSymbol("CYC-ORDERING-RESULT");
        $ic232$ = SubLObjectFactory.makeKeyword("ELEMENT");
        $ic233$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $ic234$ = SubLObjectFactory.makeSymbol("S#39954", "CYC");
        $ic235$ = SubLObjectFactory.makeSymbol("CYC-SECONDS-SINCE-1970-TO-DATE");
        $ic236$ = SubLObjectFactory.makeSymbol("CYC-DATE-TO-SECONDS-SINCE-1970");
        $ic237$ = SubLObjectFactory.makeSymbol("CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL");
        $ic238$ = SubLObjectFactory.makeSymbol("S#39957", "CYC");
        $ic239$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic240$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic241$ = SubLObjectFactory.makeKeyword("GAF");
        $ic242$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic243$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("assertedUsingTool"));
        $ic244$ = SubLObjectFactory.makeSymbol(">");
        $ic245$ = SubLObjectFactory.makeSymbol("CAR");
        $ic246$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AssertionGeneratingRKFTool"));
        $ic247$ = SubLObjectFactory.makeString("<TEXT>");
        $ic248$ = SubLObjectFactory.makeString("</TEXT>");
        $ic249$ = SubLObjectFactory.makeString("<b>");
        $ic250$ = SubLObjectFactory.makeString("</b>");
        $ic251$ = SubLObjectFactory.makeSymbol("S#39958", "CYC");
        $ic252$ = SubLObjectFactory.makeString(" ... ");
        $ic253$ = SubLObjectFactory.makeSymbol("CYC-HTML-FOR-TEXT-CONTAINING-STRINGS");
        $ic254$ = SubLObjectFactory.makeSymbol("FORMAT");
        $ic255$ = SubLObjectFactory.makeSymbol("CYC-FORMAT");
        $ic256$ = SubLObjectFactory.makeString("term -> isg table lock");
        $ic257$ = SubLObjectFactory.makeSymbol("S#39970", "CYC");
        $ic258$ = SubLObjectFactory.makeSymbol("CYC-NEXT-INTEGER-IN-SEQUENCE");
        $ic259$ = SubLObjectFactory.makeString("term -> isg w/ start table lock");
        $ic260$ = SubLObjectFactory.makeSymbol("S#39972", "CYC");
        $ic261$ = SubLObjectFactory.makeSymbol("CYC-NEXT-INTEGER-IN-SEQUENCE-STARTING-AT");
        $ic262$ = SubLObjectFactory.makeSymbol("S#16379", "CYC");
        $ic263$ = SubLObjectFactory.makeSymbol("CYC-CONCATENATE-STRINGS");
        $ic264$ = SubLObjectFactory.makeKeyword("TEST");
        $ic265$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic266$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic267$ = SubLObjectFactory.makeKeyword("KB");
        $ic268$ = SubLObjectFactory.makeKeyword("FULL");
        $ic269$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic270$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("bar"))), (SubLObject)SubLObjectFactory.makeString("foobar")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("for debts not exceeding &ua3;5,000")), (SubLObject)SubLObjectFactory.makeString(" or more"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("for debts not exceeding &ua3;5,000 or more"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("as well as "), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("for debts not exceeding &ua3;5,000")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("as well as for debts not exceeding &ua3;5,000"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("for debts not exceeding &ua3;5,000")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString(" or &ua3;6,000")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("for debts not exceeding &ua3;5,000 or &ua3;6,000"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("&quot;"), (SubLObject)SubLObjectFactory.makeString("US Designates Al Akhtar Trust"), (SubLObject)SubLObjectFactory.makeString("&quot;"))), (SubLObject)SubLObjectFactory.makeString("&quot;US Designates Al Akhtar Trust&quot;")));
        $ic271$ = SubLObjectFactory.makeSymbol("CYC-TERM-SIMILARITY-METRIC");
        $ic272$ = SubLObjectFactory.makeSymbol("CYC-KB-ORTHOGONAL");
        $ic273$ = SubLObjectFactory.makeSymbol("CYC-CONTENT-OF-FILE");
        $ic274$ = SubLObjectFactory.makeSymbol("CYC-TRANSFORM-RELATION-TUPLES");
        $ic275$ = SubLObjectFactory.makeString("~a doesn't start with #$TheList");
        $ic276$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic277$ = SubLObjectFactory.makeSymbol("CYC-PROVABLE-VIA-DEFNS");
    }
    
    public static final class $f36115$UnaryFunction extends UnaryFunction
    {
        public $f36115$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-DIFFERENT"));
        }
        
        public SubLObject processItem(final SubLObject var11) {
            return module0592.f36115(var11);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0592.class
	Total time: 2298 ms
	
	Decompiled with Procyon 0.5.32.
*/